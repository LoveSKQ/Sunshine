package com.rmj.Sunshine.core.activity;

import android.os.Bundle;
import android.widget.GridView;
import com.rmj.Sunshine.R;
import com.rmj.Sunshine.core.adapter.TilesAdapter;

/**
 * Created by G11 on 2014/5/14.
 */
public class MainActivity extends BaseActivity {

    GridView mGridView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initContentComponents() {
        setContentView(R.layout.activity_main);
        mGridView = (GridView) findViewById(R.id.tiles_gv);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mGridView.setAdapter(new TilesAdapter());
    }

    @Override
    public void initListeners() {

    }

    @Override
    public void requestDatas() {

    }

    @Override
    public void checkers() {

    }

    @Override
    public void initNavigationBar() {

    }
}