package com.example.anil.dagger2demoimpl.splashWithoutDi;


import com.example.anil.dagger2demoimpl.retrofit.ApiCallBack;

/**
 * Created by anil on 3/19/18.
 */

public interface SplashWithoutDiInteractor {
    void serverHitForAppVersion(final ApiCallBack callBack);
}
