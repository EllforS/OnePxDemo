package com.ellfors.onepxdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

/**
 * HooliganActivity
 * 2019/3/27 17:34
 */
public class HooliganActivity extends AppCompatActivity
{
    private static HooliganActivity instance;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        instance = this;

        initWindow();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        if (instance == null)
            return;
        instance.finish();
    }

    /**
     * 初始化
     */
    private void initWindow()
    {
        Window window = getWindow();
        window.setGravity(Gravity.START | Gravity.TOP);
        WindowManager.LayoutParams params = window.getAttributes();
        params.x = 0;
        params.y = 0;
        params.height = 1;
        params.width = 1;
        window.setAttributes(params);
    }

    /**
     * 开启
     */
    public static void startHooligan()
    {
        Intent intent = new Intent(MyApp.getInstance(), HooliganActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        MyApp.getInstance().startActivity(intent);
    }

    /**
     * 关闭
     */
    public static void killHooligan()
    {
        if (instance == null)
            return;
        instance.finish();
    }
}
