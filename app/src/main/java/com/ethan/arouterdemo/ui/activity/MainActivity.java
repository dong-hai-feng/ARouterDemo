package com.ethan.arouterdemo.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ethan.arouterdemo.R;
import com.ethan.arouterdemo.base.MyARouter;

//在支持路由的页面上添加注解
@Route(path=MyARouter.MainActivity)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.arouter_but).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //发起路由操作,替换intent意图跳转
//                ARouter.getInstance().build(MyARouter.TargetActivity).navigation();
                ARouter.getInstance().build(MyARouter.TargetActivity).withString("text", "这是携带的参数").navigation();
            }
        });
    }
}
