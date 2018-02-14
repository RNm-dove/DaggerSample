package com.example.ryosuke.daggersample;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ryosuke on 2018/02/13.
 */
@Module
class DripCoffeeModule{

    @Provides static Pump providePump(Thermosiphon pump){
        return pump;
    }

    @Singleton
    @Provides
    static Heater provideHeater(){
        return new ElectricHeater();
    }
}

