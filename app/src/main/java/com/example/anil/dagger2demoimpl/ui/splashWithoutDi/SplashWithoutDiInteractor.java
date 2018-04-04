package com.example.anil.dagger2demoimpl.ui.splashWithoutDi;


import com.example.anil.dagger2demoimpl.retrofit.ApiCallBack;

/**
 * Created by anil on 3/19/18.
 */

public interface SplashWithoutDiInteractor {
    void serverHitForAppVersion(final ApiCallBack callBack);
}
