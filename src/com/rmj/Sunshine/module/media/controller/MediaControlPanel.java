package com.rmj.Sunshine.module.media.controller;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.rmj.Sunshine.R;
import com.rmj.Sunshine.custom.notification.Toast;
import com.rmj.mediaplayer.core.controller.PlayerControl;
import com.rmj.mediaplayer.core.service.MediaService;

/**
 * Created by G11 on 2014/5/14.
 */
public class MediaControlPanel extends com.rmj.mediaplayer.core.controller.MediaControlPanel {

    ImageButton mHotlineBtn;
    ImageButton mShareBtn;
    ProgressBar mWaiting;
    OnClickListener mHotlineListener;
    OnClickListener mShareListener;

    public MediaControlPanel(Context context) {
        super(context);
    }

    public MediaControlPanel(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MediaControlPanel(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void initPanelView() {
        setPlayerControl(new PlayerControl());
        setPanelView(R.layout.controlpanel_audio);
        mPlayPauseButton = (ImageButton) mPanelView.findViewById(R.id.audio_btn_play);
        mWaiting = (ProgressBar) mPanelView.findViewById(R.id.audio_player_waiting);
        mPlayPauseTextView = (TextView) mPanelView.findViewById(R.id.audio_tv_player_status);
        mSeekBar = (SeekBar) mPanelView.findViewById(R.id.audio_player_seekbar);
        mCurrentTime = (TextView) mPanelView.findViewById(R.id.audio_player_time_current);
        mTotalTime = (TextView) mPanelView.findViewById(R.id.audio_player_time_total);
        mHotlineBtn = (ImageButton) mPanelView.findViewById(R.id.audio_btn_hotline);
        mShareBtn = (ImageButton) mPanelView.findViewById(R.id.audio_btn_share);

        mPlayPauseButton.setOnClickListener(mPlayPauseListener);
        mSeekBar.setOnSeekBarChangeListener(mSeekBarChangeListener);
        mHotlineBtn.setOnClickListener(mHotlineListener);
        mShareBtn.setOnClickListener(mShareListener);
    }

    @Override
    public void initExtraListeners() {
        mHotlineListener = new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        mShareListener = new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
    }

    @Override
    protected void played() {
        mPlayPauseButton.setVisibility(View.VISIBLE);
        mWaiting.setVisibility(View.GONE);
        mPlayPauseButton.setImageResource(R.drawable.audio_player_pause);
        mPlayPauseTextView.setText(R.string.media_status_played);
    }

    @Override
    protected void paused() {
        mPlayPauseButton.setVisibility(View.VISIBLE);
        mWaiting.setVisibility(View.GONE);
        mPlayPauseButton.setImageResource(R.drawable.audio_player_play);
        mPlayPauseTextView.setText(R.string.media_status_paused);
    }

    @Override
    protected void stopped() {
        paused();
    }

    @Override
    protected void waiting() {
        mPlayPauseButton.setVisibility(View.GONE);
        mWaiting.setVisibility(View.VISIBLE);
        mPlayPauseTextView.setText(R.string.media_status_waiting);
    }

    @Override
    protected void prepared() {

    }

    @Override
    protected void bufferingStart() {

    }

    @Override
    protected void bufferingEnd() {

    }

    @Override
    protected void error() {
        stopped();
        Toast.show(mContext,"Load Media Error!");
    }
}
