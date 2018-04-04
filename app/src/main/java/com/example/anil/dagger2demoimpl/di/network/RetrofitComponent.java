package com.example.anil.dagger2demoimpl.di.network;

import com.example.anil.dagger2demoimpl.retrofit.ApiInterface;

import dagger.Component;

/**
 * Created by anil on 4/4/18.
 */
@Component(modules = RetrofitModule.class)
public interface RetrofitComponent {

    ApiInterface getApiInterface();
}
