package com.example.anil.dagger2demoimpl.di;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by anil on 4/4/18.
 */
@Module
public class ContextModule {

    private Context context;

    public ContextModule(final Context context) {
        this.context = context;
    }

    @Provides
    Context providesContext() {
        return context;
    }
}
