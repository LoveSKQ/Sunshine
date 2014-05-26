package com.rmj.Sunshine.custom.utils.buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

/**
 * Created by G11 on 2014/5/20.
 */
public abstract class TileButton extends View {

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
        setWidth(widthweight);
        setHeight(heightweight);
        return this;
    }

    public abstract void init();

    /**
     * 设置组件高度
     *
     * @param weight
     */
    public void setHeight(int weight) {
        if (weight != 0)
            mHeight = mWeightBase * weight + (weight - 1) * mVerticalSpacing;
        else
            mHeight = 0;
    }

    /**
     * 设置组件宽度
     *
     * @param weight
     */
    public void setWidth(int weight) {
        if (weight != 0)
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
}
