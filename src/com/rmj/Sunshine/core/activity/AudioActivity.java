package com.rmj.Sunshine.core.activity;

import android.os.Bundle;
import com.rmj.Sunshine.R;
import com.rmj.Sunshine.module.media.controller.MediaControlPanel;

public class AudioActivity extends BaseActivity {

    MediaControlPanel mControlPanel;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void initContentComponents() {
        mControlPanel = (MediaControlPanel) findViewById(R.id.audio_control_panel);
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
}
