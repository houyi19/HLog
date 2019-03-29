package com.study.util.log;

import java.util.Arrays;

public class HLogPrinter implements Printer {

    @Override
    public void i(String tag, Object... prams) {
        new InfoLogText(tag).setup(prams);
    }

    @Override
    public void d(String tag, Object... prams) {
        new DebugLogText(tag).setup(prams);
    }

    @Override
    public void e(String tag, Throwable th, Object... prams) {
        new ErrorLogText(tag).setup(Arrays.toString(prams) + th.getMessage());
    }

    @Override
    public void e(String tag, Object... prams) {
        new ErrorLogText(tag).setup(prams);
    }

    @Override
    public void v(String tag, Object... prams) {
        new VerBoseLogText(tag).setup(prams);
    }

    @Override
    public void w(String tag, Object... prams) {
        new WarnLogText(tag).setup(prams);
    }
}
