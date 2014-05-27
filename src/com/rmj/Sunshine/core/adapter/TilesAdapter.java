package com.rmj.Sunshine.core.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import com.rmj.Sunshine.custom.utils.buttons.ImageTileButton;
import com.rmj.Sunshine.custom.utils.buttons.TileButton;

import java.util.*;

/**
 * Created by G11 on 2014/5/26.
 */
public class TilesAdapter extends BaseAdapter {

    int mHorizontalSpacing = 0;
    int mVerticalSpacing = 0;
    int mWeightBase = 0;
    ArrayList<TileButton> mTilesList;

    public TilesAdapter() {
        init();
    }

    public void init() {
        mTilesList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            mTilesList.add(i, null);
        }
    }

    @Override
    public int getCount() {
        return mTilesList.size();
    }

    @Override
    public Object getItem(int position) {
        return mTilesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (mWeightBase == 0) {
            initWeightBase(parent);
        }
        if (convertView == null) {
            convertView = new ImageTileButton(parent.getContext()).setBaseParams(mHorizontalSpacing,mVerticalSpacing,mWeightBase).setSize(1, 2).init();
            convertView.setLayoutParams(new LinearLayout.LayoutParams(convertView.getWidth(),convertView.getHeight()));
        }
        return convertView;
    }

    public void initWeightBase(ViewGroup parent) {
        GridView _gv = (GridView) parent;
        mHorizontalSpacing = _gv.getHorizontalSpacing();
        mVerticalSpacing = _gv.getVerticalSpacing();
        int _width = _gv.getColumnWidth() * _gv.getNumColumns() + _gv.getHorizontalSpacing() * (_gv.getNumColumns() - 1);
        mWeightBase = (_width - mHorizontalSpacing * 2) / 3;
    }
}
