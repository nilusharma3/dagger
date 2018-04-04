package com.example.anil.dagger2demoimpl.ui.splashWithoutDi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.anil.dagger2demoimpl.R;
import com.example.anil.dagger2demoimpl.base.BaseActivity;
import com.example.anil.dagger2demoimpl.retrofit.RestClient;
import com.example.anil.dagger2demoimpl.ui.splashWithDi.SplashWithDiActivity;


public class SplashWithoutDiActivity extends BaseActivity implements SplashWithoutDiView {

    SplashWitoutDiPresenter presenter = new SplashWitoutDiPresenterImpl(this, RestClient.getApiInterface());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.getAppVersion();
    }


    @Override
    public void moveToSplashWithDi() {
        startActivity(new Intent(this, SplashWithDiActivity.class));
    }

    @Override
    public void showError(final String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT);
    }
}
