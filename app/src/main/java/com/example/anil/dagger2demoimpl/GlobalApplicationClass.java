package com.example.anil.dagger2demoimpl;

import android.app.Application;
import android.content.Context;

import com.example.anil.dagger2demoimpl.di.AppComponent;
import com.example.anil.dagger2demoimpl.di.ContextModule;

import com.example.anil.dagger2demoimpl.di.DaggerAppComponent;
import com.example.anil.dagger2demoimpl.di.network.RetrofitModule;
import com.example.anil.dagger2demoimpl.di.splash.SplashModule;

import java.lang.ref.WeakReference;

/**
 * Created by anil on 4/4/18.
 */

public class GlobalApplicationClass extends Application {

    private static WeakReference<Context> mWeakReference;

    private static AppComponent appComponent;


    public static Context getAppContext() {
        return mWeakReference.get();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mWeakReference = new WeakReference<Context>(this);
        createComponent();
    }


    private void createComponent() {
        appComponent = DaggerAppComponent.builder()
                .contextModule(new ContextModule(this))
                //.getSplash()
                .retrofitModule(new RetrofitModule())
                .splashModule(new SplashModule())
                .build();

    }
}
