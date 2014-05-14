package com.rmj.Sunshine.core.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.rmj.Sunshine.R;
import com.rmj.mediaplayer.core.bean.MediaInfo;
import com.rmj.mediaplayer.core.manager.MediaManager;
import com.rmj.mediaplayer.core.service.MediaService;
import io.vov.vitamio.LibsChecker;

/**
 * Created by G11 on 2014/5/9.
 */
public class SplashActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!LibsChecker.checkVitamioLibs(this)) return;
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void onStart() {
        super.onStart();
        init();
        initTemp();
        startMainActivity();
    }

    /**
     *  初始化App相关内容
     */
    void init(){
        startService(new Intent(SplashActivity.this, MediaService.class));
    }

    /**
     * 初始化一些测试用的临时数据
     */
    void initTemp() {
        MediaInfo _info = new MediaInfo();
        _info.setUrl("mms://dianbo.hebradio.com/live1");
        MediaManager.getInstance().setCurrentMedia(_info);
    }

    void startMainActivity() {
        Intent _intent = new Intent(SplashActivity.this,AudioActivity.class);
        startActivity(_intent);
        finish();
    }
}