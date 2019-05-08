package com.ultracat.sample.pdkappsample.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemProperties;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import com.ultracat.sample.pdkappsample.R;
import com.ultracat.sample.pdkappsample.util.MyLog;

public class PdkSampleActivity extends FragmentActivity implements View.OnClickListener{
    private static final String TAG = PdkSampleActivity.class.getSimpleName();
    private static String deviceName;
    private SurfaceView mSurfaceView;
    private SurfaceHolder mSurfaceHolder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyLog.e(TAG, "onCreate() TaskID : " + getTaskId());

        deviceName = SystemProperties.get("ro.product.vendor.device", "");

        setContentView(R.layout.pdksample_activity);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MyLog.e(TAG, "onPause() TaskID : " + getTaskId());
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyLog.e(TAG, "onResume() TaskID : " + getTaskId());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        MyLog.e(TAG, "onRestart() TaskID : " + getTaskId());
    }

    @Override
    protected void onStart() {
        super.onStart();
        MyLog.e(TAG, "onStart() TaskID : " + getTaskId());
    }

    @Override
    protected void onStop() {
        super.onStop();
        MyLog.e(TAG, "onStop() TaskID : " + getTaskId());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        MyLog.e(TAG, "onNewIntent() TaskID : " + getTaskId());
        super.onNewIntent(intent);
    }

    @Override
    protected void onDestroy() {
        MyLog.e(TAG, "onDestroy() TaskID : " + getTaskId());
        super.onDestroy();
    }

    @Override
    public void onClick(View view) {
        MyLog.i(TAG, "onClick() TaskID : " + getTaskId());
        switch (view.getId()) {
            case R.id.btn_pdksampleapp:
                MyLog.i(TAG, "onClick() - btn_pdksampleapp Pressed");
                break;
        }
    }
}
