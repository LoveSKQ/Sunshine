package com.rmj.Sunshine.core.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.rmj.Sunshine.R;
import com.rmj.Sunshine.media.activity.AudioPlayer;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        startActivity(new Intent(MainActivity.this, AudioPlayer.class));
    }
}
