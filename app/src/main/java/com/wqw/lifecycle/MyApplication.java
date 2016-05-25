package com.wqw.lifecycle;

import android.app.Application;
import android.util.Log;

/**
 * 应用
 *
 * @author WangQiuWei
 * @since 2015-11-25
 */
public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        Log.i(MainActivity.TAG, "application create");
    }
}
