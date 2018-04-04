package com.example.anil.dagger2demoimpl.di;

import android.content.Context;

import com.example.anil.dagger2demoimpl.di.network.RetrofitModule;
import com.example.anil.dagger2demoimpl.di.splash.SplashModule;
import com.example.anil.dagger2demoimpl.splashWithDi.SplashWithDiActivity;
import com.example.anil.dagger2demoimpl.splashWithDi.SplashWithDiInteractor;
import com.example.anil.dagger2demoimpl.splashWithDi.SplashWithDiPresenter;

import dagger.Component;

/**
 * Created by anil on 4/4/18.
 */
@Component(modules = {SplashModule.class, ContextModule.class})
public interface AppComponent {

    Context getContext();

    SplashWithDiPresenter getSplashWithDiPresenter();

    SplashWithDiInteractor getSplashWithDiInteractor();

    SplashWithDiActivity getSplash(SplashWithDiActivity activity);
}
