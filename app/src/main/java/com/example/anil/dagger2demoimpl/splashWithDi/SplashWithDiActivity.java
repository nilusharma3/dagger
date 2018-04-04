package com.example.anil.dagger2demoimpl.splashWithDi;

import android.os.Bundle;

import com.example.anil.dagger2demoimpl.GlobalApplicationClass;
import com.example.anil.dagger2demoimpl.R;
import com.example.anil.dagger2demoimpl.base.BaseActivity;

import javax.inject.Inject;

public class SplashWithDiActivity extends BaseActivity implements SplashWithDiView {

    @Inject
    SplashWithDiPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_with_di);
        GlobalApplicationClass.getAppComponent().getSplash(this);
        presenter.getAppVersion();
    }

    @Override
    public void moveToNext() {

    }
}
