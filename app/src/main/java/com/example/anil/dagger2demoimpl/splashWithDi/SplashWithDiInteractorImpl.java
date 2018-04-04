package com.example.anil.dagger2demoimpl.splashWithDi;

import android.util.Log;


import com.example.anil.dagger2demoimpl.retrofit.APIError;
import com.example.anil.dagger2demoimpl.retrofit.ApiCallBack;
import com.example.anil.dagger2demoimpl.retrofit.ApiInterface;
import com.example.anil.dagger2demoimpl.retrofit.ResponseResolver;

import javax.inject.Inject;

/**
 * Created by anil on 3/19/18.
 */

public class SplashWithDiInteractorImpl implements SplashWithDiInteractor {

    @Inject
     ApiInterface apiInterface;

    @Inject
    public SplashWithDiInteractorImpl(final ApiInterface apiInterface) {
        this.apiInterface = apiInterface;
    }

    @Override
    public void serverHitForAppVersionData(final ApiCallBack callBack) {
        apiInterface.getAppVersion("en").enqueue(new ResponseResolver<Object>() {
            @Override
            public void success(final Object o) {
                callBack.onSuccess(o);
            }

            @Override
            public void failure(final APIError error) {
                callBack.onFailure(error);
            }
        });
    }
}
