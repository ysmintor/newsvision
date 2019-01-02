package com.yorkyu.newsvision;

import android.app.Application;

import com.android.volley.VolleyLog;
import com.hhxplaying.neteasedemo.netease.util.ScreenUtil;

public class MyApplication extends Application {
    public static int width = 0;
    public static int height = 0;
    public static float density = 0;
    public void onCreate() {
        super.onCreate();
        width = ScreenUtil.getWidth(this);
        height = ScreenUtil.getHeight(this);
        density = ScreenUtil.getDensity(this);
        System.out.println(width);
        System.out.println(height);
        System.out.println(density);

        VolleyLog.DEBUG = true;
    }

}
