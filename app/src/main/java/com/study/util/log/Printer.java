package com.study.util.log;

public interface Printer {

    void i(String tag, Object... prams);

    void d(String tag, Object... prams);

    void e(String tag, Throwable th, Object... prams);

    void e(String tag, Object... prams);

    void v(String tag, Object... prams);

    void w(String tag, Object... prams);

}
