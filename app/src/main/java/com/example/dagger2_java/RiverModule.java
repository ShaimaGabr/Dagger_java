package com.example.dagger2_java;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RiverModule {
//    int sugar;
//
//    public CoffeeModule(int sugar) {
//        this.sugar = sugar;
//    }
    @Singleton
    @Provides
    River providRever(){
        return new River();
    }
//    @Provides
//    int providSugar(){
//        return sugar;
//    }
}
