package com.study.util.log;

import android.util.Log;

import java.util.Arrays;

public class VerBoseLogText extends LogText {

    public VerBoseLogText(String tag) {
        super(tag);
    }

    @Override
    protected void setupTopDivider() {
        Log.v(mTag, TOP_DIVIDER);
    }

    @Override
    protected void setupBottomDivider() {
        Log.v(mTag, BOTTOM_DIVIDER);
    }

    @Override
    protected void setUpContent(Object... content) {
        StackTraceElement targetStackTraceElement = getTargetStackTraceElement();
        Log.v(mTag, "(" + targetStackTraceElement.getFileName() + ":"
                + targetStackTraceElement.getLineNumber() + ")");
        Log.v(mTag, Arrays.toString(content));
    }
}
