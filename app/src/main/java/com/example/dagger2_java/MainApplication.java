package com.example.dagger2_java;

import android.app.Application;

public class MainApplication extends Application {
 private AppComponent appComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        appComponent=  DaggerAppComponent.create();
                //builder().sugar(3).milk(5).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
