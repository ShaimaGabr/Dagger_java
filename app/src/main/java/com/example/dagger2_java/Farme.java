package com.example.dagger2_java;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Farme {
    @Inject
    public Farme() {
        Log.d("ana","second");
    }
    public  String getBeans(){
        return "Beans";
    }
}
