package com.rmj.Sunshine.core.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.rmj.Sunshine.R;

/**
 * Created by G11 on 2014/5/8.
 */
public abstract class BaseActivity extends Activity {

    ImageButton mBackBtn;
    ImageButton mRightBtn;
    TextView mTitleTV;
    RelativeLayout mNavigationBar;
    View mContentView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_base);
        initComponents();
        initContentComponents();
    }

    /**
     * 设置内容界面
     *
     * @param layoutID
     */
    public void setContentLayout(int layoutID) {
        LinearLayout _contentLayout = (LinearLayout) findViewById(R.id.layout_content);
        LayoutInflater _inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mContentView = _inflater.inflate(layoutID, null);
        if (mContentView != null) {
            _contentLayout.addView(mContentView);
        }
        else {
            //TODO 加载失败处理
        }
    }

    /**
     * 设置导航栏右边按钮（如果不设置则不显示该按钮）
     *
     * @param drawableID
     * @param listener
     */
    public void addRightButton(int drawableID, View.OnClickListener listener) {
        mRightBtn.setVisibility(View.VISIBLE);
        mRightBtn.setImageResource(drawableID);
        mRightBtn.setOnClickListener(listener);
    }

    /**
     * 初始化标题栏内容
     */
    void initComponents() {
        mNavigationBar = (RelativeLayout) findViewById(R.id.navigation_bar);
        mBackBtn = (ImageButton) findViewById(R.id.navigation_back_btn);
        mRightBtn = (ImageButton) findViewById(R.id.navigation_right_btn);
        mTitleTV = (TextView) findViewById(R.id.navigation_title_tv);
    }

    /**
     * 隐藏导航栏
     */
    void hideNavigationBar() {
        mNavigationBar.setVisibility(View.GONE);
    }

    /**
     * 显示导航栏
     */
    void showNavigationBar() {
        mNavigationBar.setVisibility(View.VISIBLE);
    }

    /**
     * 初始化内容布局和相应的组件
     */
    public abstract void initContentComponents();

    /**
     * 初始化控件的事件处理
     */
    public abstract void initListeners();

    /**
     * 向服务器请求程序初始化的数据
     */
    public abstract void requestDatas();

    /**
     * 进行相关环境检查
     */
    public abstract void checkers();

    /**
     * 设置导航栏的相关参数
     */
    public abstract void initNavigationBar();
}