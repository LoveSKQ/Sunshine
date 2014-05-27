package com.rmj.Sunshine.custom.utils.buttons;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by G11 on 2014/5/20.
 */
public abstract class TileButton extends LinearLayout {

    int mVerticalSpacing = 0;
    int mHorizontalSpacing = 0;
    int mWeightBase = 0;
    int mHeight;
    int mWidth;
    Context mContext;

    protected TileButton(Context context) {
        super(context);
        mContext = context;
    }

    public TileButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
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

    /**
     * 设置权重基数
     *
     * @return
     */
    public void setWeightBase(int weightBase) {
        mWeightBase = weightBase;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.DKGRAY);
    }
}
