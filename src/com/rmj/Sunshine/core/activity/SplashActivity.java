package com.rmj.Sunshine.core.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.rmj.Sunshine.R;
import com.rmj.Sunshine.media.service.MediaService;
import io.vov.vitamio.LibsChecker;

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
        if (!LibsChecker.checkVitamioLibs(this)) return;
        startMainActivity();
    }

    /**
     *  初始化App相关内容
     */
    void init(){
        startService(new Intent(SplashActivity.this, MediaService.class));
    }

    void startMainActivity() {
        Intent _intent = new Intent(SplashActivity.this,MainActivity.class);
        startActivity(_intent);
    }
}