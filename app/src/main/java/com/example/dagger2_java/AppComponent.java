package com.example.dagger2_java;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component(modules = RiverModule.class)
public interface AppComponent {
//    River getRiver();
//    Farme getFarm();
    CoffeeComponent.Builder getCoffeeComponentBuilder();
}
