package com.example.androidsample;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    Engine engine;
    Wheel wheel;

    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    void drive(){
        Log.d(TAG, "driving.....");
    }
}
