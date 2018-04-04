package com.example.anil.dagger2demoimpl.ui.splashWithoutDi;

import android.util.Log;

import com.example.anil.dagger2demoimpl.retrofit.APIError;
import com.example.anil.dagger2demoimpl.retrofit.ApiCallBack;
import com.example.anil.dagger2demoimpl.retrofit.ApiInterface;


/**
 * Created by anil on 3/19/18.
 */

class SplashWitoutDiPresenterImpl implements SplashWitoutDiPresenter {

    private SplashWithoutDiView view;
    private SplashWithoutDiInteractor interactor;

    public SplashWitoutDiPresenterImpl(final SplashWithoutDiView view, final ApiInterface apiInterface) {
        this.view = view;
        this.interactor = new SplashWithoutDiInteractorImpl(apiInterface);
    }

    @Override
    public void getAppVersion() {
        interactor.serverHitForAppVersion(new ApiCallBack() {
            @Override
            public void onSuccess(final Object responseObject) {
                Log.e("app version splah ", "without di : ===== Success");
                view.moveToSplashWithDi();
            }

            @Override
            public void onFailure(final APIError error) {
                Log.e("app version splah ", "without di : ===== Failed");
            }
        });
    }

}
