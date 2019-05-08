package com.ultracat.sample.pdkappsample.Service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import com.ultracat.sample.pdkappsample.util.MyLog;

public class EventService extends Service {
    private static final String TAG = EventService.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        MyLog.i(TAG, "onCreate() - EventService");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        MyLog.d(TAG, "onStartCommand");
        //return super.onStartCommand(intent, flags, startId);
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        MyLog.d(TAG, "EventService onBind");
        return mBinder;
    }

    private IBinder mBinder = new EvtSrvBinder();

    public class EvtSrvBinder extends Binder {
        public EventService getService() {
            return EventService.this;
        }
    }
}
