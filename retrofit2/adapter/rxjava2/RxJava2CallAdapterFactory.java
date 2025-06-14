package retrofit2.adapter.rxjava2;

/* loaded from: classes.dex */
public final class RxJava2CallAdapterFactory extends retrofit2.CallAdapter.Factory {
    private final boolean isAsync;

    @javax.annotation.Nullable
    private final io.reactivex.Scheduler scheduler;

    private RxJava2CallAdapterFactory(@javax.annotation.Nullable io.reactivex.Scheduler r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.scheduler = r1
            r0.isAsync = r2
            return
    }

    public static retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory create() {
            retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory r0 = new retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory createAsync() {
            retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory r0 = new retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2)
            return r0
    }

    public static retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory createWithScheduler(io.reactivex.Scheduler r2) {
            if (r2 == 0) goto L9
            retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory r0 = new retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
            r1 = 0
            r0.<init>(r2, r1)
            return r0
        L9:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "scheduler == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // retrofit2.CallAdapter.Factory
    @javax.annotation.Nullable
    public retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type r13, java.lang.annotation.Annotation[] r14, retrofit2.Retrofit r15) {
            r12 = this;
            java.lang.Class r14 = getRawType(r13)
            java.lang.Class<io.reactivex.Completable> r15 = io.reactivex.Completable.class
            if (r14 != r15) goto L1b
            retrofit2.adapter.rxjava2.RxJava2CallAdapter r13 = new retrofit2.adapter.rxjava2.RxJava2CallAdapter
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            io.reactivex.Scheduler r2 = r12.scheduler
            boolean r3 = r12.isAsync
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r13
        L1b:
            java.lang.Class<io.reactivex.Flowable> r15 = io.reactivex.Flowable.class
            r0 = 1
            r1 = 0
            if (r14 != r15) goto L23
            r8 = r0
            goto L24
        L23:
            r8 = r1
        L24:
            java.lang.Class<io.reactivex.Single> r15 = io.reactivex.Single.class
            if (r14 != r15) goto L2a
            r9 = r0
            goto L2b
        L2a:
            r9 = r1
        L2b:
            java.lang.Class<io.reactivex.Maybe> r15 = io.reactivex.Maybe.class
            if (r14 != r15) goto L31
            r10 = r0
            goto L32
        L31:
            r10 = r1
        L32:
            java.lang.Class<io.reactivex.Observable> r15 = io.reactivex.Observable.class
            if (r14 == r15) goto L3e
            if (r8 != 0) goto L3e
            if (r9 != 0) goto L3e
            if (r10 != 0) goto L3e
            r13 = 0
            return r13
        L3e:
            boolean r14 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r14 != 0) goto L80
            if (r8 != 0) goto L51
            if (r9 != 0) goto L4e
            if (r10 == 0) goto L4b
            java.lang.String r13 = "Maybe"
            goto L53
        L4b:
            java.lang.String r13 = "Observable"
            goto L53
        L4e:
            java.lang.String r13 = "Single"
            goto L53
        L51:
            java.lang.String r13 = "Flowable"
        L53:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.StringBuilder r15 = r15.append(r13)
            java.lang.String r0 = " return type must be parameterized as "
            java.lang.StringBuilder r15 = r15.append(r0)
            java.lang.StringBuilder r15 = r15.append(r13)
            java.lang.String r0 = "<Foo> or "
            java.lang.StringBuilder r15 = r15.append(r0)
            java.lang.StringBuilder r13 = r15.append(r13)
            java.lang.String r15 = "<? extends Foo>"
            java.lang.StringBuilder r13 = r13.append(r15)
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L80:
            java.lang.reflect.ParameterizedType r13 = (java.lang.reflect.ParameterizedType) r13
            java.lang.reflect.Type r13 = getParameterUpperBound(r1, r13)
            java.lang.Class r14 = getRawType(r13)
            java.lang.Class<retrofit2.Response> r15 = retrofit2.Response.class
            if (r14 != r15) goto La4
            boolean r14 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r14 == 0) goto L9c
            java.lang.reflect.ParameterizedType r13 = (java.lang.reflect.ParameterizedType) r13
            java.lang.reflect.Type r13 = getParameterUpperBound(r1, r13)
            r3 = r13
            r6 = r1
            r7 = r6
            goto Lc1
        L9c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Response must be parameterized as Response<Foo> or Response<? extends Foo>"
            r13.<init>(r14)
            throw r13
        La4:
            java.lang.Class<retrofit2.adapter.rxjava2.Result> r15 = retrofit2.adapter.rxjava2.Result.class
            if (r14 != r15) goto Lbe
            boolean r14 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r14 == 0) goto Lb6
            java.lang.reflect.ParameterizedType r13 = (java.lang.reflect.ParameterizedType) r13
            java.lang.reflect.Type r13 = getParameterUpperBound(r1, r13)
            r3 = r13
            r6 = r0
            r7 = r1
            goto Lc1
        Lb6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Result must be parameterized as Result<Foo> or Result<? extends Foo>"
            r13.<init>(r14)
            throw r13
        Lbe:
            r3 = r13
            r7 = r0
            r6 = r1
        Lc1:
            retrofit2.adapter.rxjava2.RxJava2CallAdapter r13 = new retrofit2.adapter.rxjava2.RxJava2CallAdapter
            io.reactivex.Scheduler r4 = r12.scheduler
            boolean r5 = r12.isAsync
            r11 = 0
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
    }
}
