package com.rmj.Sunshine.core.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import com.rmj.Sunshine.R;
import com.rmj.Sunshine.custom.utils.buttons.ImageTileButton;
import com.rmj.Sunshine.custom.utils.buttons.TileButton;

import java.util.*;
import java.util.zip.Inflater;

/**
 * Created by G11 on 2014/5/26.
 */
public class TilesAdapter extends BaseAdapter {

    int mHorizontalSpacing = 0;
    int mVerticalSpacing = 0;
    int mWeightBase = 0;
    ArrayList<TileButton> mTilesList;
    Context mContext;

    public TilesAdapter(Context context) {
        mContext = context;
        init();
    }

    public void init() {
        mTilesList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
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
        if (mWeightBase <= 0) {
            initWeightBase(parent);
        }
        ImageTileButton _tile;
        if (convertView == null) {
            _tile = (ImageTileButton)((ImageTileButton) LayoutInflater.from(mContext).inflate(R.layout.image_tile_item,parent,false)).setBaseParams(mHorizontalSpacing,mVerticalSpacing,mWeightBase).setSize(1, 1).init();
            _tile.setImage(R.drawable.tile_feedback);
            _tile.setText(R.string.tile_feedback);
            convertView = _tile;
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
