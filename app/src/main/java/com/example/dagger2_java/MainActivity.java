package com.example.dagger2_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
Coffee coffee,coffee2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       AppComponent  appComponent=  ((MainApplication) getApplication()).getAppComponent();
       CoffeeComponent coffeeComponent=appComponent.getCoffeeComponentBuilder().milk(4).sugar(5).build();
        coffeeComponent.inject(this);

        Log.d("ana", coffee.getCoffeeCup()+"\n"+coffee+"\n"+coffee2+"\n"+coffee.river+"\n"+coffee2.river );
    }
}