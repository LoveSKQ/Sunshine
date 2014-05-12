package com.rmj.Sunshine.notification;

import android.content.Context;

/**
 * Created by G11 on 2014/5/12.
 */
public class Toast {
    public static void show(Context context,String content) {
        android.widget.Toast _toast = new android.widget.Toast(context);
        _toast.setText(content);
        _toast.show();
    }
}
