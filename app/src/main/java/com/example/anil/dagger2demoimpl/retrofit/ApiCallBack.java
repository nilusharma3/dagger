package com.example.anil.dagger2demoimpl.retrofit;

/**
 * Created by anil on 3/19/18.
 */

public interface ApiCallBack {
    void onSuccess(final Object responseObject);

    void onFailure(final APIError error);

}
