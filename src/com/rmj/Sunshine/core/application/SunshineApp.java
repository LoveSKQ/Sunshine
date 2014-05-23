package com.rmj.Sunshine.core.application;

import android.app.Application;
import com.rmj.Sunshine.custom.exception.CrashHandler;

/**
 * Created by G11 on 2014/5/23.
 */
public class SunshineApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //TODO 程序异常崩溃后的处理
        Thread.setDefaultUncaughtExceptionHandler(CrashHandler.getInstance());
        //TODO 相关信息初始化

    }
}
