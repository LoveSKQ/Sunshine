package com.rmj.Sunshine.log;

import com.rmj.Sunshine.constants.Constants;

/**
 * Created by G11 on 2014/5/9.
 */
public class Log {

    public static void i(String tag,String msg) {
        if (Constants.TEST_FLAG) {
            android.util.Log.i(tag,msg);
        }
    }

    public static void e(String tag,String msg) {
        if (Constants.TEST_FLAG) {
            android.util.Log.e(tag, msg);
        }
    }
}
