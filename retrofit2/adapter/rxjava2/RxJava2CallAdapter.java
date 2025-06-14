package retrofit2.adapter.rxjava2;

/* loaded from: classes.dex */
final class RxJava2CallAdapter<R> implements retrofit2.CallAdapter<R, java.lang.Object> {
    private final boolean isAsync;
    private final boolean isBody;
    private final boolean isCompletable;
    private final boolean isFlowable;
    private final boolean isMaybe;
    private final boolean isResult;
    private final boolean isSingle;
    private final java.lang.reflect.Type responseType;

    @javax.annotation.Nullable
    private final io.reactivex.Scheduler scheduler;

    RxJava2CallAdapter(java.lang.reflect.Type r1, @javax.annotation.Nullable io.reactivex.Scheduler r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9) {
            r0 = this;
            r0.<init>()
            r0.responseType = r1
            r0.scheduler = r2
            r0.isAsync = r3
            r0.isResult = r4
            r0.isBody = r5
            r0.isFlowable = r6
            r0.isSingle = r7
            r0.isMaybe = r8
            r0.isCompletable = r9
            return
    }

    @Override // retrofit2.CallAdapter
    public java.lang.Object adapt(retrofit2.Call<R> r2) {
            r1 = this;
            boolean r0 = r1.isAsync
            if (r0 == 0) goto La
            retrofit2.adapter.rxjava2.CallEnqueueObservable r0 = new retrofit2.adapter.rxjava2.CallEnqueueObservable
            r0.<init>(r2)
            goto Lf
        La:
            retrofit2.adapter.rxjava2.CallExecuteObservable r0 = new retrofit2.adapter.rxjava2.CallExecuteObservable
            r0.<init>(r2)
        Lf:
            boolean r2 = r1.isResult
            if (r2 == 0) goto L1a
            retrofit2.adapter.rxjava2.ResultObservable r2 = new retrofit2.adapter.rxjava2.ResultObservable
            r2.<init>(r0)
        L18:
            r0 = r2
            goto L24
        L1a:
            boolean r2 = r1.isBody
            if (r2 == 0) goto L24
            retrofit2.adapter.rxjava2.BodyObservable r2 = new retrofit2.adapter.rxjava2.BodyObservable
            r2.<init>(r0)
            goto L18
        L24:
            io.reactivex.Scheduler r2 = r1.scheduler
            if (r2 == 0) goto L2c
            io.reactivex.Observable r0 = r0.subscribeOn(r2)
        L2c:
            boolean r2 = r1.isFlowable
            if (r2 == 0) goto L37
            io.reactivex.BackpressureStrategy r2 = io.reactivex.BackpressureStrategy.LATEST
            io.reactivex.Flowable r2 = r0.toFlowable(r2)
            return r2
        L37:
            boolean r2 = r1.isSingle
            if (r2 == 0) goto L40
            io.reactivex.Single r2 = r0.singleOrError()
            return r2
        L40:
            boolean r2 = r1.isMaybe
            if (r2 == 0) goto L49
            io.reactivex.Maybe r2 = r0.singleElement()
            return r2
        L49:
            boolean r2 = r1.isCompletable
            if (r2 == 0) goto L52
            io.reactivex.Completable r2 = r0.ignoreElements()
            return r2
        L52:
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @Override // retrofit2.CallAdapter
    public java.lang.reflect.Type responseType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.responseType
            return r0
    }
}
