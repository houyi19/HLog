package com.study.util.log;

import android.util.Log;

import java.util.Arrays;

public class ErrorLogText extends LogText {

    public ErrorLogText(String tag) {
        super(tag);
    }

    @Override
    protected void setupTopDivider() {
        Log.e(mTag, TOP_DIVIDER);
    }

    @Override
    protected void setupBottomDivider() {
        Log.e(mTag, BOTTOM_DIVIDER);
    }

    @Override
    protected void setUpContent(Object... content) {
        StackTraceElement targetStackTraceElement = getTargetStackTraceElement();
        Log.e(mTag, "(" + targetStackTraceElement.getFileName() + ":"
                + targetStackTraceElement.getLineNumber() + ")");
        Log.e(mTag, Arrays.toString(content));
    }
}
