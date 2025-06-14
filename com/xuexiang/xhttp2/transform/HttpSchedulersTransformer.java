package com.xuexiang.xhttp2.transform;

/* loaded from: classes.dex */
public class HttpSchedulersTransformer<T> implements io.reactivex.ObservableTransformer<T, T> {
    private com.xuexiang.xhttp2.model.SchedulerType mSchedulerType;

    /* renamed from: com.xuexiang.xhttp2.transform.HttpSchedulersTransformer$1 */
    static /* synthetic */ class C09451 {
        static final /* synthetic */ int[] $SwitchMap$com$xuexiang$xhttp2$model$SchedulerType = null;

        static {
                com.xuexiang.xhttp2.model.SchedulerType[] r0 = com.xuexiang.xhttp2.model.SchedulerType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.xuexiang.xhttp2.transform.HttpSchedulersTransformer.C09451.$SwitchMap$com$xuexiang$xhttp2$model$SchedulerType = r0
                com.xuexiang.xhttp2.model.SchedulerType r1 = com.xuexiang.xhttp2.model.SchedulerType._main     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.xuexiang.xhttp2.transform.HttpSchedulersTransformer.C09451.$SwitchMap$com$xuexiang$xhttp2$model$SchedulerType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.xuexiang.xhttp2.model.SchedulerType r1 = com.xuexiang.xhttp2.model.SchedulerType._io     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.xuexiang.xhttp2.transform.HttpSchedulersTransformer.C09451.$SwitchMap$com$xuexiang$xhttp2$model$SchedulerType     // Catch: java.lang.NoSuchFieldError -> L28
                com.xuexiang.xhttp2.model.SchedulerType r1 = com.xuexiang.xhttp2.model.SchedulerType._io_main     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.xuexiang.xhttp2.transform.HttpSchedulersTransformer.C09451.$SwitchMap$com$xuexiang$xhttp2$model$SchedulerType     // Catch: java.lang.NoSuchFieldError -> L33
                com.xuexiang.xhttp2.model.SchedulerType r1 = com.xuexiang.xhttp2.model.SchedulerType._io_io     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public HttpSchedulersTransformer(com.xuexiang.xhttp2.model.SchedulerType r1) {
            r0 = this;
            r0.<init>()
            r0.mSchedulerType = r1
            return
    }

    public HttpSchedulersTransformer(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            com.xuexiang.xhttp2.model.SchedulerType r1 = r0.getSchedulerType(r1, r2)
            r0.mSchedulerType = r1
            return
    }

    private com.xuexiang.xhttp2.model.SchedulerType getSchedulerType(boolean r1, boolean r2) {
            r0 = this;
            if (r1 == 0) goto La
            if (r2 == 0) goto L7
            com.xuexiang.xhttp2.model.SchedulerType r1 = com.xuexiang.xhttp2.model.SchedulerType._main
            return r1
        L7:
            com.xuexiang.xhttp2.model.SchedulerType r1 = com.xuexiang.xhttp2.model.SchedulerType._io
            return r1
        La:
            if (r2 == 0) goto Lf
            com.xuexiang.xhttp2.model.SchedulerType r1 = com.xuexiang.xhttp2.model.SchedulerType._io_main
            return r1
        Lf:
            com.xuexiang.xhttp2.model.SchedulerType r1 = com.xuexiang.xhttp2.model.SchedulerType._io_io
            return r1
    }

    @Override // io.reactivex.ObservableTransformer
    public io.reactivex.ObservableSource<T> apply(io.reactivex.Observable<T> r3) {
            r2 = this;
            int[] r0 = com.xuexiang.xhttp2.transform.HttpSchedulersTransformer.C09451.$SwitchMap$com$xuexiang$xhttp2$model$SchedulerType
            com.xuexiang.xhttp2.model.SchedulerType r1 = r2.mSchedulerType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L3e
            r1 = 3
            if (r0 == r1) goto L25
            r1 = 4
            if (r0 == r1) goto L14
            return r3
        L14:
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.m54io()
            io.reactivex.Observable r3 = r3.subscribeOn(r0)
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.m54io()
            io.reactivex.Observable r3 = r3.unsubscribeOn(r0)
            return r3
        L25:
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.m54io()
            io.reactivex.Observable r3 = r3.subscribeOn(r0)
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.m54io()
            io.reactivex.Observable r3 = r3.unsubscribeOn(r0)
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r3 = r3.observeOn(r0)
            return r3
        L3e:
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r3 = r3.observeOn(r0)
            return r3
    }
}
