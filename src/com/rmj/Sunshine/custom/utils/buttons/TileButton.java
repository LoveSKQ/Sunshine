package com.rmj.Sunshine.custom.utils.buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

/**
 * Created by G11 on 2014/5/20.
 */
public abstract class TileButton extends View {

    DisplayMetrics mDisplayMetrics = null;
    int mGap = 0;
    int mHeight;
    int mWidth;

    public TileButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public abstract void init();

    /**
     * 设置组件高度
     * @param weight
     */
    public void setHeightWeight(int weight) {
        mHeight = getWeightBase()*weight - mGap;
    }

    /**
     * 设置组件宽度
     * @param weight
     */
    public void setWidthWeight(int weight) {
        mWidth = getWeightBase()*weight - mGap;
    }

    /**
     * 获得权重基数
     * @return
     */
    public int getWeightBase() {
        int _base = 0;
        if (mDisplayMetrics != null) {
            int _width = mDisplayMetrics.widthPixels;
            _base = _width/3;
        } else {
            //TODO 未设置DisplayMetrics，设为默认值
        }
        return _base;
    }

    private void setDisplayMetrics(DisplayMetrics dm) {
        mDisplayMetrics = dm;
    }
}
