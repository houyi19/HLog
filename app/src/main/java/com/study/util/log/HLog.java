package com.study.util.log;

import android.text.TextUtils;

public class HLog {

    private static String TAG = "HLOG";
    private static boolean isDebug = true;
    private static HLogPrinter printer = new HLogPrinter();

    private HLog(String tag, boolean debug) {
        TAG = tag;
        isDebug = debug;
    }

    //进行初始化的入口；
    public static HLog Init(String tag, boolean isDebug) {
        HLog hLog = new HLog(tag, isDebug);
        return hLog;
    }

    public static void i(String content) {
        i(null, content);
    }

    public static void i(String tag, String content) {
        if (!isDebug) return;
        printer.i(getFinalTag(tag), content);
    }

    /**
     * vvvvvvvvvvvvvvvvvv
     *
     * @param content
     */
    public static void v(String content) {
        v(null, content);
    }

    public static void v(String tag, String content) {
        if (!isDebug) return;
        printer.v(getFinalTag(tag), content);
    }

    /**
     * dddddddddddddd
     *
     * @param content
     */
    public static void d(String content) {
        d(null, content);
    }

    public static void d(String tag, String content) {
        if (!isDebug) return;
        printer.d(getFinalTag(tag), content);
    }

    /**
     * wwwwwwwwwwwww
     *
     * @param content
     */
    public static void w(String content) {
        w(null, content);
    }

    public static void w(String tag, String content) {
        if (!isDebug) return;
        printer.w(getFinalTag(tag), content);
    }

    /**
     * eeeeeeeeeeee
     *
     * @param tag
     * @param params
     */
    public static void e(String tag, String params) {
        if (!isDebug) return;
        printer.e(getFinalTag(tag), params);
    }

    public static void e(String tag, String msg, Throwable throwable) {
        if (!isDebug) return;
        printer.e(getFinalTag(tag), msg, throwable);
    }

    private static String getFinalTag(String tag) {
        if (!TextUtils.isEmpty(tag)) {
            return tag;
        }
        return TAG;
    }
}
