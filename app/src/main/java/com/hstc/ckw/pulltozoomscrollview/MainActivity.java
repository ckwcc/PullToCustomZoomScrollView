package com.hstc.ckw.pulltozoomscrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //这个是返回按钮的点击事件
    public void backClick(View view){
        this.finish();
    }
}
