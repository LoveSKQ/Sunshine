package com.rmj.Sunshine.core.activity;

import android.os.Bundle;
import android.widget.GridView;
import com.rmj.Sunshine.R;
import com.rmj.Sunshine.core.adapter.TilesAdapter;
import com.rmj.Sunshine.custom.utils.buttons.ImageTileButton;
import com.rmj.Sunshine.custom.utils.buttons.LiveTileButton;
import com.rmj.Sunshine.custom.utils.buttons.WeatherTileButton;

/**
 * Created by G11 on 2014/5/14.
 */
public class MainActivity extends BaseActivity {

    ImageTileButton mQuestionTile,mHistoryTile,mAuthorityTile,mJournalTile,mFeedBackTile;
    LiveTileButton mLiveTile;
    WeatherTileButton mWeatherTile;

    GridView mGridView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mGridView = (GridView) findViewById(R.id.tiles_gv);
        mGridView.setAdapter(new TilesAdapter(this));
    }

    @Override
    public void initContentComponents() {
        setContentView(R.layout.activity_main);
        initTiles();
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

    void initTiles() {
//        mLiveTile = (LiveTileButton) findViewById(R.id.tile_button_live);
//        mQuestionTile = (ImageTileButton) findViewById(R.id.tile_button_question);
//        mHistoryTile = (ImageTileButton) findViewById(R.id.tile_button_history);
//        mAuthorityTile = (ImageTileButton) findViewById(R.id.tile_button_authority);
//        mJournalTile = (ImageTileButton) findViewById(R.id.tile_button_journal);
//        mFeedBackTile = (ImageTileButton) findViewById(R.id.tile_button_feedback);
//        mWeatherTile = (WeatherTileButton) findViewById(R.id.tile_button_weather);
////
//        mQuestionTile.setImage(R.drawable.tile_question);
//        mQuestionTile.setText(R.string.tile_question);
//        mHistoryTile.setImage(R.drawable.tile_history);
//        mHistoryTile.setText(R.string.tile_history);
//        mAuthorityTile.setImage(R.drawable.tile_authority);
//        mAuthorityTile.setText(R.string.tile_authority);
//        mJournalTile.setImage(R.drawable.tile_journal);
//        mJournalTile.setText(R.string.tile_journal);
//        mFeedBackTile.setImage(R.drawable.tile_feedback);
//        mFeedBackTile.setText(R.string.tile_feedback);
    }
}