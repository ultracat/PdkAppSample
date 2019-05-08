package com.ultracat.sample.pdkappsample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.ultracat.sample.pdkappsample.Service.EventService;
import com.ultracat.sample.pdkappsample.util.MyLog;


public class BootCompleteReceiver extends BroadcastReceiver {
    public static final String BOOT_COMPLETE = "android.intent.action.BOOT_COMPLETED";
    private static final String TAG = BootCompleteReceiver.class.getSimpleName();
    boolean bound = false;
    private EventService mEvtSrv;

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        switch (action) {
            case BOOT_COMPLETE:
                MyLog.i(TAG, "Intent Received " + BOOT_COMPLETE);
                startMyService(context, intent);
                break;
        }
    }

    private void startMyService(Context context, Intent intent) {
        Intent controlIntent;
        controlIntent = new Intent(context, EventService.class);
        MyLog.i(TAG, "There is no EventService, start EventService!!!");
        context.startForegroundService(controlIntent);
    }
}
