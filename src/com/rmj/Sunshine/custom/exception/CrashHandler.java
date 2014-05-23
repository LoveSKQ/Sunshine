package com.rmj.Sunshine.custom.exception;

/**
 * Created by G11 on 2014/5/23.
 */
public class CrashHandler implements Thread.UncaughtExceptionHandler {

    private static CrashHandler mInstance;

    private CrashHandler() {}

    public static synchronized CrashHandler getInstance() {
        if(mInstance == null){
            mInstance  = new CrashHandler();
        }
        return mInstance;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        //TODO 出现异常崩溃后的处理
    }
}
