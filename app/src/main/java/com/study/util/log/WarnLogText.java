package com.study.util.log;

import android.util.Log;

import java.util.Arrays;

public class WarnLogText extends LogText {

    public WarnLogText(String tag) {
        super(tag);
    }

    @Override
    protected void setupTopDivider() {
        Log.w(mTag, TOP_DIVIDER);
    }

    @Override
    protected void setupBottomDivider() {
        Log.w(mTag, BOTTOM_DIVIDER);
    }

    @Override
    protected void setUpContent(Object... content) {
        StackTraceElement targetStackTraceElement = getTargetStackTraceElement();
        Log.w(mTag, "(" + targetStackTraceElement.getFileName() + ":"
                + targetStackTraceElement.getLineNumber() + ")");
        Log.w(mTag, Arrays.toString(content));
    }
}
