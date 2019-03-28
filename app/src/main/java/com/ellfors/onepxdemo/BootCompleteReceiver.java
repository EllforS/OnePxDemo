package com.ellfors.onepxdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * BootCompleteReceiver
 * 2019/3/27 17:50
 */
public class BootCompleteReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        if (intent == null || intent.getAction() == null)
            return;
        if (intent.getAction().equals(Intent.ACTION_SCREEN_ON))
        {
            //唤醒
            HooliganActivity.killHooligan();
        }
        else if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF))
        {
            //锁屏
            HooliganActivity.startHooligan();
        }
    }
}
