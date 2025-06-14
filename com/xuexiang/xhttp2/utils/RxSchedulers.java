package com.xuexiang.xhttp2.utils;

/* loaded from: classes.dex */
public class RxSchedulers {
    private RxSchedulers() {
            r2 = this;
            r2.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "u can't instantiate me..."
            r0.<init>(r1)
            throw r0
    }

    public static <T> io.reactivex.ObservableTransformer<T, T> _io() {
            com.xuexiang.xhttp2.transform.HttpSchedulersTransformer r0 = new com.xuexiang.xhttp2.transform.HttpSchedulersTransformer
            com.xuexiang.xhttp2.model.SchedulerType r1 = com.xuexiang.xhttp2.model.SchedulerType._io
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.ObservableTransformer<T, T> _io_io() {
            com.xuexiang.xhttp2.transform.HttpSchedulersTransformer r0 = new com.xuexiang.xhttp2.transform.HttpSchedulersTransformer
            com.xuexiang.xhttp2.model.SchedulerType r1 = com.xuexiang.xhttp2.model.SchedulerType._io_io
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.ObservableTransformer<T, T> _io_main() {
            com.xuexiang.xhttp2.transform.HttpSchedulersTransformer r0 = new com.xuexiang.xhttp2.transform.HttpSchedulersTransformer
            com.xuexiang.xhttp2.model.SchedulerType r1 = com.xuexiang.xhttp2.model.SchedulerType._io_main
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.ObservableTransformer<T, T> _main() {
            com.xuexiang.xhttp2.transform.HttpSchedulersTransformer r0 = new com.xuexiang.xhttp2.transform.HttpSchedulersTransformer
            com.xuexiang.xhttp2.model.SchedulerType r1 = com.xuexiang.xhttp2.model.SchedulerType._main
            r0.<init>(r1)
            return r0
    }
}
