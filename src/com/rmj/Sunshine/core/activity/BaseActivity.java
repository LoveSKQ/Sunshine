package com.rmj.Sunshine.core.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.rmj.Sunshine.R;

/**
 * Created by G11 on 2014/5/8.
 */
public class BaseActivity extends Activity {

    ImageButton mBackBtn;
    ImageButton mRightBtn;
    TextView mTitleTV;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_base);
        initLayout();
    }

    /**
     * 设置内容界面
     * @param layoutID
     */
    public void setContentLayout(int layoutID) {
        LinearLayout _contentLayout = (LinearLayout) findViewById(R.id.layout_content);
        LayoutInflater _inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        _contentLayout.addView(_inflater.inflate(layoutID,null));
    }

    /**
     * 设置导航栏右边按钮（如果不设置则不显示该按钮）
     * @param drawableID
     * @param listener
     */
    public void addRightButton(int drawableID,View.OnClickListener listener) {
        mRightBtn.setVisibility(View.VISIBLE);
        mRightBtn.setImageResource(drawableID);
        mRightBtn.setOnClickListener(listener);
    }

    void initLayout() {
        mBackBtn = (ImageButton) findViewById(R.id.navigation_back_btn);
        mRightBtn = (ImageButton) findViewById(R.id.navigation_right_btn);
        mTitleTV = (TextView) findViewById(R.id.navigation_title_tv);
    }


}