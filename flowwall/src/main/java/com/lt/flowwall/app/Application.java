package com.lt.flowwall.app;

import android.content.Context;

import com.qubian.mob.QbManager;


public class Application extends android.app.Application {
    private static Context context;

    public static Context getContext() {
        return context;
    }


    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();

    }


}
