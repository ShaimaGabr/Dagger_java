package com.example.dagger2_java;

import android.util.Log;

import javax.inject.Inject;

public class River {
   // @Inject
    public River() {
        Log.d("ana","first");
    }
    public String getWater(){
        return "water";
    }
}
