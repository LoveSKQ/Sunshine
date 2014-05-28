package com.rmj.Sunshine.custom.utils.buttons;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.GridView;
import android.widget.RelativeLayout;

/**
 * Created by G11 on 2014/5/20.
 */
public abstract class TileButton extends RelativeLayout {

    int mVerticalSpacing = 0;
    int mHorizontalSpacing = 0;
    int mWeightBase = 0;
    int mHeight;
    int mWidth;

    public TileButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TileButton setBaseParams(int horizontal, int vertical, int weightbase) {
        mVerticalSpacing = vertical;
        mHorizontalSpacing = horizontal;
        mWeightBase = weightbase;
        return this;
    }

    public TileButton setSize(int heightweight,int widthweight) {
        setWidthWeight(widthweight);
        setHeightWeight(heightweight);
        //TODO 处理有问题，暂时
        setBackgroundColor(Color.GRAY);
        setLayoutParams(new GridView.LayoutParams(mWidth,mHeight));
        return this;
    }

    public abstract TileButton init();

    /**
     * 设置组件高度
     *
     * @param weight
     */
    public void setHeightWeight(int weight) {
        if (weight > 0)
            mHeight = mWeightBase * weight + (weight - 1) * mVerticalSpacing;
        else
            mHeight = 0;
    }

    /**
     * 设置组件宽度
     *
     * @param weight
     */
    public void setWidthWeight(int weight) {
        if (weight > 0)
            mWidth = mWeightBase * weight + (weight - 1) * mHorizontalSpacing;
        else
            mWidth = 0;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_UP:
                this.setPadding(this.getPaddingLeft() - 2, this.getPaddingTop() - 2, this.getPaddingRight() - 2, this.getPaddingBottom() - 2);
                setBackgroundColor(Color.GRAY);
                break;
            case MotionEvent.ACTION_DOWN:
                this.setPadding(this.getPaddingLeft() + 2, this.getPaddingTop() + 2, this.getPaddingRight() + 2, this.getPaddingBottom() + 2);
                setBackgroundColor(Color.DKGRAY);
                break;
            case MotionEvent.ACTION_CANCEL:
                this.setPadding(this.getPaddingLeft() - 2, this.getPaddingTop() - 2, this.getPaddingRight() - 2, this.getPaddingBottom() - 2);
                setBackgroundColor(Color.GRAY);
            default:
                break;
        }
        return true;
    }
}
