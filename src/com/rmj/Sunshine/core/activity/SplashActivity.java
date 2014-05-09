package com.rmj.Sunshine.core.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.rmj.Sunshine.R;

/**
 * Created by G11 on 2014/5/9.
 */
public class SplashActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void onStart() {
        super.onStart();
        init();
        startMainActivity();
    }

    /**
     *  初始化App相关内容
     */
    void init(){

    }

    void startMainActivity() {
        Intent _intent = new Intent(SplashActivity.this,MainActivity.class);
        startActivity(_intent);
    }
}