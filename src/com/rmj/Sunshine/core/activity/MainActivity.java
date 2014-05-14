package com.rmj.Sunshine.core.activity;

import android.app.Activity;
import android.os.Bundle;
import com.rmj.Sunshine.R;
import com.rmj.Sunshine.module.media.controller.MediaControlPanel;

public class MainActivity extends Activity {

    MediaControlPanel mControlPanel;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void initComponents() {
        mControlPanel = (MediaControlPanel) findViewById(R.id.audio_control_panel);
    }
}
