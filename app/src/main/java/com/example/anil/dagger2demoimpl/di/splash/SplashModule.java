package com.example.anil.dagger2demoimpl.di.splash;

import com.example.anil.dagger2demoimpl.di.network.RetrofitModule;
import com.example.anil.dagger2demoimpl.retrofit.ApiInterface;
import com.example.anil.dagger2demoimpl.splashWithDi.SplashWithDiInteractor;
import com.example.anil.dagger2demoimpl.splashWithDi.SplashWithDiInteractorImpl;
import com.example.anil.dagger2demoimpl.splashWithDi.SplashWithDiPresenter;
import com.example.anil.dagger2demoimpl.splashWithDi.SplashWithDiPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by anil on 4/4/18.
 */
@Module(includes = RetrofitModule.class)
public class SplashModule {

    @Provides
    SplashWithDiPresenter provideSplashWithDiPresenter(final SplashWithDiInteractorImpl interactor) {
        return new SplashWithDiPresenterImpl(interactor);
    }

    @Provides
    SplashWithDiInteractor providesSplashWithDiInteractor(final ApiInterface apiInterface) {
        return new SplashWithDiInteractorImpl(apiInterface);
    }
}
