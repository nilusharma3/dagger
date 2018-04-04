package com.example.anil.dagger2demoimpl.splashWithDi;

import android.util.Log;

import com.example.anil.dagger2demoimpl.retrofit.APIError;
import com.example.anil.dagger2demoimpl.retrofit.ApiCallBack;

import javax.inject.Inject;

/**
 * Created by anil on 3/19/18.
 */

public class SplashWithDiPresenterImpl implements SplashWithDiPresenter {

    @Inject
    SplashWithDiInteractorImpl interactor;

    @Inject
    public SplashWithDiPresenterImpl(final SplashWithDiInteractorImpl interactor) {
        this.interactor = interactor;
    }


    @Override
    public void getAppVersion() {
        Log.e("hello di", "done");
        interactor.serverHitForAppVersionData(new ApiCallBack() {
            @Override
            public void onSuccess(final Object responseObject) {

            }

            @Override
            public void onFailure(final APIError error) {

            }
        });
    }
}
