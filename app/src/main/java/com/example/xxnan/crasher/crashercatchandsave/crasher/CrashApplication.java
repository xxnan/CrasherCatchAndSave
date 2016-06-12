package com.example.xxnan.crasher.crashercatchandsave.crasher;

import android.app.Application;

/**
 * Created by Administrator on 2016/6/12.
 */
public class CrashApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getCrashHandler();
        crashHandler.init(this);
    }
}
