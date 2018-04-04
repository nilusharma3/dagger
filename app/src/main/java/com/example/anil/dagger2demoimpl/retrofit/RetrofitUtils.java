package com.example.anil.dagger2demoimpl.retrofit;

import android.net.Uri;
import android.webkit.MimeTypeMap;


import com.example.anil.dagger2demoimpl.util.CommonData;
import com.example.anil.dagger2demoimpl.util.DateTimeUtil;

import java.io.File;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import timber.log.Timber;

import static com.example.anil.dagger2demoimpl.constants.AppConstant.CURRENT_LANGUAGE;


/**
 * The type Retrofit utils.
 */
public final class RetrofitUtils {

    private RetrofitUtils() {
    }


    /**
     * Gets request body from string.
     *
     * @param value the value
     * @return the request body from string
     */
    static RequestBody getRequestBodyFromString(final String value) {
        return RequestBody.create(MediaType.parse("text/plain"), value);
    }


    /**
     * Gets part body from file.
     *
     * @param key  the key
     * @param file the file
     * @return the part body from file
     */
    public static MultipartBody.Part getPartBodyFromFile(final String key, final File file) {

        // create RequestBody instance from file
        final RequestBody requestFile =
                RequestBody.create(MediaType.parse(getMimeType(file)), file);
        // MultipartBody.Part is used to send also the actual file name

        return MultipartBody.Part.createFormData(key, file.getName(), requestFile);
    }


    /**
     * Gets mime type.
     *
     * @param file the file
     * @return the mime type
     */
    static String getMimeType(final File file) {
        String mimeType = "image/png";
        try {
            final Uri selectedUri = Uri.fromFile(file);
            final String fileExtension
                    = MimeTypeMap.getFileExtensionFromUrl(selectedUri.toString());
            mimeType
                    = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension);
        } catch (final Exception e) {
            Timber.e("Mime type exception ", e.toString());
        }
        return mimeType;
    }

    /**
     * Gets header map.
     *
     * @param isWithAccessToken the is with access token
     * @return the header map
     */
    public static HashMap<String, String> getHeaderMap(final boolean isWithAccessToken) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("content-language", CURRENT_LANGUAGE);
        hashMap.put("utcoffset", DateTimeUtil.getCurrentZoneOffset());
        if (isWithAccessToken) {
            hashMap.put("authorization", CommonData.getAccessToken());
        }
        return hashMap;
    }
}
