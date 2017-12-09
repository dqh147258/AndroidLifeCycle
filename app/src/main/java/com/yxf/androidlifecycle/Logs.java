package com.yxf.androidlifecycle;

import android.util.Log;

/**
 * Created by jk on 2017/12/9.
 */

public class Logs {
    public static final String TAG = "AndroidLifeCycle";

    public static final String[] logMessages = {
            "MainActivity",
            "MyFragment",
            "MyFrameLayout",
            "MyView"
    };

    private static StackTraceElement getCallerStackTraceElement() {
        return Thread.currentThread().getStackTrace()[4];
    }

    public static void method() {
        StackTraceElement element = getCallerStackTraceElement();
        String message = element.toString();
        if (isLogMessage(message)) {
            Log.d(TAG, message);
        }
    }

    public static boolean isLogMessage(String message) {
        for (int i = 0; i < logMessages.length; i++) {
            if (message.indexOf(logMessages[i]) > 0) {
                return true;
            }
        }
        return false;
    }
}
