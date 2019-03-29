package com.study.util.log;

public abstract class LogText {
    protected static final String TOP_DIVIDER = "************************";
    protected static final String BOTTOM_DIVIDER = "=====================";

    protected String mTag;

    public LogText(String tag) {
      this.mTag = tag;
    }

    public void setup(Object content) {
        setupTopDivider();
        setUpContent(content);
        setupBottomDivider();

    }

    protected abstract void setupTopDivider();

    protected abstract void setupBottomDivider();

    protected abstract void setUpContent(Object... content);

    protected StackTraceElement getTargetStackTraceElement() {
        // find the target invoked method
        StackTraceElement targetStackTrace = null;
        boolean shouldTrace = false;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            boolean isLogMethod = stackTraceElement.getClassName().equals(HLog.class.getName());
            if (shouldTrace && !isLogMethod) {
                targetStackTrace = stackTraceElement;
                break;
            }
            shouldTrace = isLogMethod;
        }
        return targetStackTrace;
    }
}
