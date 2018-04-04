package com.example.anil.dagger2demoimpl.ui.splashWithDi;

import android.util.Log;

import com.example.anil.dagger2demoimpl.retrofit.APIError;
import com.example.anil.dagger2demoimpl.retrofit.ApiCallBack;

import javax.inject.Inject;

/**
 * Created by anil
 */

public class SplashWithDiPresenterImpl implements SplashWithDiPresenter {

    @Inject
    SplashWithDiInteractorImpl interactor;

    SplashWithDiView view;

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
                //view.moveToNext();
            }

            @Override
            public void onFailure(final APIError error) {

            }
        });
    }
}
