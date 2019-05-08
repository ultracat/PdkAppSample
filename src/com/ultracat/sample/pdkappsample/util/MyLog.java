package com.ultracat.sample.pdkappsample.util;

import android.util.Log;

public class MyLog {
    private static final String TAG = "CamLog_";
    private static MyLog mThis = null;
    private boolean mLoggable = false;

    public MyLog() {
        mLoggable = true;
    }

    public static void v(String tag, String msg) {
        if (mThis == null) {
            mThis = new MyLog();
        }
        mThis.verbose(tag, msg);
    }

    public static void d(String tag, String msg) {
        if (mThis == null) {
            mThis = new MyLog();
        }
        mThis.debug(tag, msg);
    }

    public static void i(String tag, String msg) {
        if (mThis == null) {
            mThis = new MyLog();
        }
        mThis.info(tag, msg);
    }

    public static void w(String tag, String msg) {
        Log.w(TAG + tag, msg);
    }

    public static void e(String tag, String msg) {
        Log.e(TAG + tag, msg);
    }

    public static void e(final String tag, final Throwable e) {
        Log.e(TAG + tag, "Exception Print");
        e.printStackTrace();
    }

    private void verbose(String tag, String msg) {
        if (mLoggable) {
            Log.v(TAG + tag, msg);
        }
    }

    private void debug(String tag, String msg) {
        if (mLoggable) {
            Log.d(TAG + tag, msg);
        }
    }

    private void info(String tag, String msg) {
        if (mLoggable) {
            Log.i(TAG + tag, msg);
        }
    }
}
