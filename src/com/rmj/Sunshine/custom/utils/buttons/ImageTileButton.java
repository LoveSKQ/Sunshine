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
public class ImageTileButton  extends TileButton {

    protected ImageView mImageView;
    protected TextView mTextView;

    public ImageTileButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public ImageTileButton init() {
        mImageView = (ImageView) findViewById(R.id.image_tile_image);
        mTextView = (TextView) findViewById(R.id.image_tile_text);
        return this;
    }

    public void setImage(int resID) {
        mImageView.setImageResource(resID);
    }

    public void setText(int resID) {
        mTextView.setText(getResources().getString(resID));
    }
}
