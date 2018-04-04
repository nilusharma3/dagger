package com.example.anil.dagger2demoimpl.retrofit;



import com.example.anil.dagger2demoimpl.BuildConfig;
import com.example.anil.dagger2demoimpl.GlobalApplicationClass;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Developer: Saurabh Verma
 * Dated: 7/3/17
 */
public class RestClient {
    private static final int TIME_OUT = 120;
    private static final Integer BKS_KEYSTORE_RAW_FILE_ID = 0;
    // Integer BKS_KEYSTORE_RAW_FILE_ID = R.raw.keystorebks;
    private static final Integer SSL_KEY_PASSWORD_STRING_ID = 0;
    private static Retrofit retrofit = null;
    private static Retrofit retrofitWithIncreaseTimeout = null;
    //Integer SSL_KEY_PASSWORD_STRING_ID = R.string.sslKeyPassword;
    private static Retrofit googleWebServices = null;

    /**
     * Empty Constructor
     * not called
     */
    public RestClient() {
    }


    /**
     * Gets google Api interface.
     *
     * @return object of google ApiInterface
     */
//    public static ApiInterface getGoogleApiInterface() {
//        if (googleWebServices == null) {
//
//            try {
//                googleWebServices = new Retrofit.Builder()
//                        .baseUrl(BuildConfig.GOOGLE_URL)
//                        .addConverterFactory(GsonConverterFactory.create())
//                        .client(httpClient().build())
//                        .build();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return googleWebServices.create(ApiInterface.class);
//    }




    /**
     * Gets api interface.
     *
     * @return object of ApiInterface
     */
    public static ApiInterface getApiInterface() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient().build())
                    //.client(secureConnection().build())
                    .build();
        }
        return retrofit.create(ApiInterface.class);
    }

    /**
     * Gets image upload api interface.
     *
     * @return the image upload api interface
     */
    public static ApiInterface getImageUploadApiInterface() {
        if (retrofitWithIncreaseTimeout == null) {
            retrofitWithIncreaseTimeout = new Retrofit.Builder()
                    .baseUrl(BuildConfig.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(getRequestHeader())
                    //.client(secureConnection().build())
                    .build();
        }
        return retrofitWithIncreaseTimeout.create(ApiInterface.class);
    }


    /**
     * Gets retrofit builder.
     *
     * @return object of Retrofit
     */
    static Retrofit getRetrofitBuilder() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient().build())
                    .build();
        }
        return retrofit;
    }

    /**
     * Gets request header.
     *
     * @return the request header
     */
    private static OkHttpClient getRequestHeader() {
        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                //.addInterceptor(getLoggingInterceptor())
                .readTimeout(TIME_OUT, TimeUnit.SECONDS)
                .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
                .build();
        return okHttpClient;
    }

    /**
     * @return object of OkHttpClient.Builder
     */
    private static OkHttpClient.Builder httpClient() {

        final OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        // add your other interceptors …
        // add logging as last interceptor
        httpClient.addInterceptor(getLoggingInterceptor());
        return httpClient;
    }

    /**
     * Method to get object of HttpLoggingInterceptor
     *
     * @return object of HttpLoggingInterceptor
     */
    private static HttpLoggingInterceptor getLoggingInterceptor() {
        final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        //logging.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        if (BuildConfig.DEBUG) {
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        }
        return logging;
    }

    /**
     * Method to create secure connection of api call with out own certificate
     *
     * @return object of OkHttpClient.Builder
     * @throws KeyStoreException        throws exception related to key store
     * @throws CertificateException     throws exception related to certificate
     * @throws NoSuchAlgorithmException throws exception if also not found
     * @throws IOException              throws IO exception
     * @throws KeyManagementException   throws key related exception
     */
    private static OkHttpClient.Builder secureConnection() throws
            KeyStoreException,
            CertificateException,
            NoSuchAlgorithmException,
            IOException,
            KeyManagementException {
        InputStream certificateInputStream = null;
        certificateInputStream = GlobalApplicationClass.getAppContext().getResources().openRawResource(BKS_KEYSTORE_RAW_FILE_ID);
        final KeyStore trustStore = KeyStore.getInstance("BKS");
        try {
            trustStore.load(certificateInputStream,
                    GlobalApplicationClass.getAppContext().getString(SSL_KEY_PASSWORD_STRING_ID).toCharArray());
        } finally {
            certificateInputStream.close();
        }
        final TrustManagerFactory tmf = TrustManagerFactory.getInstance("X509");
        tmf.init(trustStore);
        final SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, tmf.getTrustManagers(), null);

        //Retrofit 2.0.x
        final TrustManager[] trustManagers = tmf.getTrustManagers();
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        }
        final X509TrustManager trustManager = (X509TrustManager) trustManagers[0];
        final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
        final OkHttpClient.Builder client3 = new OkHttpClient.Builder().sslSocketFactory(sslSocketFactory, trustManager);
        client3.addInterceptor(getLoggingInterceptor());
        return client3;
    }
}
