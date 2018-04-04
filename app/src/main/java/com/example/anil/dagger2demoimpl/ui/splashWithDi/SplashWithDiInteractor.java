package com.example.anil.dagger2demoimpl.ui.splashWithDi;


import com.example.anil.dagger2demoimpl.retrofit.ApiCallBack;

/**
 * Created by anil on 3/19/18.
 */

public interface SplashWithDiInteractor {

    void serverHitForAppVersionData(final ApiCallBack callBack);
}
