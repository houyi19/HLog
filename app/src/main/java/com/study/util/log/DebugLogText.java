package com.study.util.log;

import android.util.Log;

import java.util.Arrays;

public class DebugLogText extends LogText {

    public DebugLogText(String tag) {
        super(tag);
    }

    @Override
    protected void setupTopDivider() {
        Log.d(mTag, TOP_DIVIDER);
    }

    @Override
    protected void setupBottomDivider() {
        Log.d(mTag, BOTTOM_DIVIDER);
    }

    @Override
    protected void setUpContent(Object... content) {
        StackTraceElement targetStackTraceElement = getTargetStackTraceElement();
        Log.d(mTag, "(" + targetStackTraceElement.getFileName() + ":"
                + targetStackTraceElement.getLineNumber() + ")");
        Log.d(mTag, Arrays.toString(content));
    }
}
