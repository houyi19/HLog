package com.study.util.log;

import android.util.Log;

import java.util.Arrays;

public class InfoLogText extends LogText {

    public InfoLogText(String tag) {
        super(tag);
    }

    @Override
    protected void setupTopDivider() {
        Log.i(mTag, TOP_DIVIDER);
    }

    @Override
    protected void setupBottomDivider() {
        Log.i(mTag, BOTTOM_DIVIDER);
    }

    @Override
    protected void setUpContent(Object... content) {
        StackTraceElement targetStackTraceElement = getTargetStackTraceElement();
        Log.i(mTag, "(" + targetStackTraceElement.getFileName() + ":"
                + targetStackTraceElement.getLineNumber() + ")");
        Log.i(mTag, Arrays.toString(content));
    }
}
