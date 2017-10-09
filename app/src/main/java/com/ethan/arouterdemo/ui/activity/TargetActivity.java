package com.ethan.arouterdemo.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ethan.arouterdemo.R;
import com.ethan.arouterdemo.base.MyARouter;

/**
 * 作者：Created by BarryDong on 2017/10/9.
 * 邮箱：barry.dong@tianyitechs.com
 */

//在支持路由的页面上添加注解
@Route(path= MyARouter.TargetActivity)
public class TargetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        String text=getIntent().getStringExtra("text");
        if (!TextUtils.isEmpty(text)) {
            Toast.makeText(TargetActivity.this, text, Toast.LENGTH_SHORT).show();
        }
    }
}
