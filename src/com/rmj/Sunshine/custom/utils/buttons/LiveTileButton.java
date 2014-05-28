package com.rmj.Sunshine.custom.utils.buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.rmj.Sunshine.R;

/**
 * Created by G11 on 2014/5/27.
 */
public class LiveTileButton extends TileButton {

    protected ImageView mImageView;
    protected TextView mTextView;
    TextView mNow,mComing;

    public LiveTileButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public LiveTileButton init() {
        mImageView=(ImageView) findViewById(R.id.tile_live_image);
        mTextView=(TextView) findViewById(R.id.tile_live_text);
        mNow=(TextView) findViewById(R.id.tile_live_now);
        mComing=(TextView) findViewById(R.id.tile_live_coming);
        return this;
    }
}
