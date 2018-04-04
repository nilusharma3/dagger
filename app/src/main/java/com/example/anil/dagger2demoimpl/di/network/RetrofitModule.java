package com.example.anil.dagger2demoimpl.di.network;

import com.example.anil.dagger2demoimpl.retrofit.ApiInterface;
import com.example.anil.dagger2demoimpl.retrofit.RestClient;

import dagger.Module;
import dagger.Provides;

/**
 * Created by anil on 4/4/18.
 */
@Module
public class RetrofitModule {
    @Provides
    public ApiInterface apiInterface(){
        return RestClient.getApiInterface();
    }
}
