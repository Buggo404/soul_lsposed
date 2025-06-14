package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableScalarXMap {

    static final class ScalarXMapFlowable<T, R> extends io.reactivex.Flowable<R> {
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
        final T value;

        ScalarXMapFlowable(T r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.mapper = r2
                return
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(org.reactivestreams.Subscriber<? super R> r3) {
                r2 = this;
                io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r0 = r2.mapper     // Catch: java.lang.Throwable -> L35
                T r1 = r2.value     // Catch: java.lang.Throwable -> L35
                java.lang.Object r0 = r0.apply(r1)     // Catch: java.lang.Throwable -> L35
                java.lang.String r1 = "The mapper returned a null Publisher"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L35
                org.reactivestreams.Publisher r0 = (org.reactivestreams.Publisher) r0     // Catch: java.lang.Throwable -> L35
                boolean r1 = r0 instanceof java.util.concurrent.Callable
                if (r1 == 0) goto L31
                java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch: java.lang.Throwable -> L29
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L29
                if (r0 != 0) goto L20
                io.reactivex.internal.subscriptions.EmptySubscription.complete(r3)
                return
            L20:
                io.reactivex.internal.subscriptions.ScalarSubscription r1 = new io.reactivex.internal.subscriptions.ScalarSubscription
                r1.<init>(r3, r0)
                r3.onSubscribe(r1)
                goto L34
            L29:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r3)
                return
            L31:
                r0.subscribe(r3)
            L34:
                return
            L35:
                r0 = move-exception
                io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r3)
                return
        }
    }

    private FlowableScalarXMap() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T, U> io.reactivex.Flowable<U> scalarXMap(T r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r2) {
            io.reactivex.internal.operators.flowable.FlowableScalarXMap$ScalarXMapFlowable r0 = new io.reactivex.internal.operators.flowable.FlowableScalarXMap$ScalarXMapFlowable
            r0.<init>(r1, r2)
            io.reactivex.Flowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    public static <T, R> boolean tryScalarXMapSubscribe(org.reactivestreams.Publisher<T> r1, org.reactivestreams.Subscriber<? super R> r2, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r3) {
            boolean r0 = r1 instanceof java.util.concurrent.Callable
            if (r0 == 0) goto L52
            r0 = 1
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L11
            io.reactivex.internal.subscriptions.EmptySubscription.complete(r2)
            return r0
        L11:
            java.lang.Object r1 = r3.apply(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "The mapper returned a null Publisher"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r3)     // Catch: java.lang.Throwable -> L42
            org.reactivestreams.Publisher r1 = (org.reactivestreams.Publisher) r1     // Catch: java.lang.Throwable -> L42
            boolean r3 = r1 instanceof java.util.concurrent.Callable
            if (r3 == 0) goto L3e
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L2d
            io.reactivex.internal.subscriptions.EmptySubscription.complete(r2)
            return r0
        L2d:
            io.reactivex.internal.subscriptions.ScalarSubscription r3 = new io.reactivex.internal.subscriptions.ScalarSubscription
            r3.<init>(r2, r1)
            r2.onSubscribe(r3)
            goto L41
        L36:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r1, r2)
            return r0
        L3e:
            r1.subscribe(r2)
        L41:
            return r0
        L42:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r1, r2)
            return r0
        L4a:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r1, r2)
            return r0
        L52:
            r1 = 0
            return r1
    }
}
