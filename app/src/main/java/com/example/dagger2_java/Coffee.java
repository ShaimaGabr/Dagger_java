package com.example.dagger2_java;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@ActivityScope
public class Coffee {
    @Inject
     Farme farme;
     int sugar;
     River river;
     int milk;

    @Inject
    public Coffee(River river, @Sugar int sugar,@Milk int milk) {
        this.river=river;
        this.sugar=sugar;
        this.milk=milk;
    }

    public String getCoffeeCup(){
        return farme.getBeans()+"_"+river.getWater()+"_"+sugar+"m:"+milk;
    }
    @Inject
    public  void ThirdStep(){
        Log.d("ana","third");
    }
}
