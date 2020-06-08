package com.zhijiasoft;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.io.File;
import java.util.List;

public class ToastModule extends ReactContextBaseJavaModule {

    public ToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }


    @ReactMethod
    public void show(String message, int duration){

    }

    @Override
    public String getName() {
        return "ToastExample";
    }
}
