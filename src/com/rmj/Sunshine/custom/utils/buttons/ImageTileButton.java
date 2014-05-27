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

    ImageView mImageView;
    TextView mTextView;

    public ImageTileButton(Context context) {
        super(context);
    }

    public ImageTileButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public TileButton init() {
        LayoutInflater _inflater = LayoutInflater.from(mContext);
        View _view = _inflater.inflate(R.layout.image_tile_item,this,true);
        mImageView = (ImageView) _view.findViewById(R.id.image_tile_image);
        mTextView = (TextView) _view.findViewById(R.id.image_tile_text);
        setImageView(R.drawable.ic_home_feedback);
        setTextView("我要提问");
        return this;
    }

    public void setImageView(int resID) {
        mImageView.setImageResource(resID);
    }

    public void setTextView(String text) {
        mTextView.setText(text);
    }
}
