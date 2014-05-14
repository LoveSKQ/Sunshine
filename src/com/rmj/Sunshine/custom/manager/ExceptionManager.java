package com.rmj.Sunshine.custom.manager;

import com.rmj.Sunshine.custom.log.Log;

/**
 * Created by G11 on 2014/5/9.
 */
public class ExceptionManager {
    private static ExceptionManager ourInstance = new ExceptionManager();

    public static ExceptionManager getInstance() {
        return ourInstance;
    }

    private ExceptionManager() {
    }

    /**
     * 捕获异常,并进行相应的处理
     * @param e
     */
    public void catchException(Exception e){
        Log.e("Sunshine Hotline","Throw Exception:"+e.toString());
    }

}
