package com.ellfors.onepxdemo;

import android.app.Application;

/**
 * MyApp
 * 2019/3/27 17:39
 */
public class MyApp extends Application
{
    private static MyApp mApp;

    public static MyApp getInstance()
    {
        return mApp;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        mApp = this;
    }
}
