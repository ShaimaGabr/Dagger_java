package com.example.dagger2_java;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@Subcomponent()
@ActivityScope
public interface CoffeeComponent {
      Coffee getCoffee();
      void inject(MainActivity mainActivity);

      @Subcomponent.Builder
      public interface Builder{
            @BindsInstance
            Builder sugar(@Sugar int sugar);
            @BindsInstance
            Builder milk(@Milk int milk);
           // Builder appComponent(AppComponent appComponent);
            CoffeeComponent build();
      }
}
