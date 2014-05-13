package com.rmj.Sunshine.media.activity;

import android.os.Bundle;
import com.rmj.Sunshine.R;
import com.rmj.Sunshine.core.activity.BaseActivity;
import com.rmj.mediaplayer.core.bean.MediaInfo;
import com.rmj.mediaplayer.core.manager.MediaManager;

/**
 * Created by G11 on 2014/5/13.
 */
public class AudioPlayer extends BaseActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        initMediaInfoForTest();
    }

    @Override
    public void initContentComponents() {

    }

    @Override
    public void initListeners() {

    }

    @Override
    public void requestDatas() {

    }

    @Override
    public void checkers() {

    }

    @Override
    public void initNavigationBar() {

    }

    void initMediaInfoForTest() {
        MediaInfo _info = new MediaInfo();
        _info.setUrl("mms://dianbo.hebradio.com/live1");
        MediaManager.getInstance().setCurrentMedia(_info);
    }
}