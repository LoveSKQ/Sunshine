package com.rmj.Sunshine.core.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import com.rmj.Sunshine.custom.utils.buttons.TileButton;

/**
 * Created by G11 on 2014/5/26.
 */
public class TilesAdapter extends BaseAdapter {

    int mHorizontalSpacing = 0;
    int mVerticalSpacing = 0;
    int mWeightBase = 0;

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (mWeightBase == 0) {
            initWeightBase(parent);
        }
        TileButton _tile = new TileButton() {
            @Override
            public void init() {

            }
        }.setBaseParams(mHorizontalSpacing, mVerticalSpacing, mWeightBase).setSize(1,1);
        return null;
    }

    public void initWeightBase(ViewGroup parent) {
        GridView _gv = (GridView) parent;
        mHorizontalSpacing = _gv.getHorizontalSpacing();
        mVerticalSpacing = _gv.getVerticalSpacing();
        mWeightBase = (_gv.getWidth() - mHorizontalSpacing * 2) / 3;
    }
}
