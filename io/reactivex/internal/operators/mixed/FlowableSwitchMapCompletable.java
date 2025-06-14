package io.reactivex.internal.operators.mixed;

/* loaded from: classes.dex */
public final class FlowableSwitchMapCompletable<T> extends io.reactivex.Completable {
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;
    final io.reactivex.Flowable<T> source;

    static final class SwitchMapCompletableObserver<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver INNER_DISPOSED = null;
        final boolean delayErrors;
        volatile boolean done;
        final io.reactivex.CompletableObserver downstream;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver> inner;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;
        org.reactivestreams.Subscription upstream;

        static final class SwitchMapInnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = -8003404460084760287L;
            final io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver<?> parent;

            SwitchMapInnerObserver(io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver<?> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.parent = r1
                    return
            }

            void dispose() {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                    return
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver<?> r0 = r1.parent
                    r0.innerComplete(r1)
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver<?> r0 = r1.parent
                    r0.innerError(r1, r2)
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }
        }

        static {
                io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver r0 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver
                r1 = 0
                r0.<init>(r1)
                io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.INNER_DISPOSED = r0
                return
        }

        SwitchMapCompletableObserver(io.reactivex.CompletableObserver r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.downstream = r1
                r0.mapper = r2
                r0.delayErrors = r3
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.inner = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.upstream
                r0.cancel()
                r1.disposeInner()
                return
        }

        void disposeInner() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver> r0 = r2.inner
                io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver r1 = io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.INNER_DISPOSED
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver r0 = (io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver) r0
                if (r0 == 0) goto L11
                if (r0 == r1) goto L11
                r0.dispose()
            L11:
                return
        }

        void innerComplete(io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver> r0 = r2.inner
                r1 = 0
                boolean r3 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r3, r1)
                if (r3 == 0) goto L20
                boolean r3 = r2.done
                if (r3 == 0) goto L20
                io.reactivex.internal.util.AtomicThrowable r3 = r2.errors
                java.lang.Throwable r3 = r3.terminate()
                if (r3 != 0) goto L1b
                io.reactivex.CompletableObserver r3 = r2.downstream
                r3.onComplete()
                goto L20
            L1b:
                io.reactivex.CompletableObserver r0 = r2.downstream
                r0.onError(r3)
            L20:
                return
        }

        void innerError(io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver r3, java.lang.Throwable r4) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver> r0 = r2.inner
                r1 = 0
                boolean r3 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r3, r1)
                if (r3 == 0) goto L38
                io.reactivex.internal.util.AtomicThrowable r3 = r2.errors
                boolean r3 = r3.addThrowable(r4)
                if (r3 == 0) goto L38
                boolean r3 = r2.delayErrors
                if (r3 == 0) goto L25
                boolean r3 = r2.done
                if (r3 == 0) goto L37
                io.reactivex.internal.util.AtomicThrowable r3 = r2.errors
                java.lang.Throwable r3 = r3.terminate()
                io.reactivex.CompletableObserver r4 = r2.downstream
                r4.onError(r3)
                goto L37
            L25:
                r2.dispose()
                io.reactivex.internal.util.AtomicThrowable r3 = r2.errors
                java.lang.Throwable r3 = r3.terminate()
                java.lang.Throwable r4 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
                if (r3 == r4) goto L37
                io.reactivex.CompletableObserver r4 = r2.downstream
                r4.onError(r3)
            L37:
                return
            L38:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver> r0 = r2.inner
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver r1 = io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.INNER_DISPOSED
                if (r0 != r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                r0 = 1
                r2.done = r0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver> r0 = r2.inner
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L1e
                io.reactivex.internal.util.AtomicThrowable r0 = r2.errors
                java.lang.Throwable r0 = r0.terminate()
                if (r0 != 0) goto L19
                io.reactivex.CompletableObserver r0 = r2.downstream
                r0.onComplete()
                goto L1e
            L19:
                io.reactivex.CompletableObserver r1 = r2.downstream
                r1.onError(r0)
            L1e:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L23
                boolean r2 = r1.delayErrors
                if (r2 == 0) goto L10
                r1.onComplete()
                goto L26
            L10:
                r1.disposeInner()
                io.reactivex.internal.util.AtomicThrowable r2 = r1.errors
                java.lang.Throwable r2 = r2.terminate()
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
                if (r2 == r0) goto L26
                io.reactivex.CompletableObserver r0 = r1.downstream
                r0.onError(r2)
                goto L26
            L23:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L26:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r4) {
                r3 = this;
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r0 = r3.mapper     // Catch: java.lang.Throwable -> L31
                java.lang.Object r4 = r0.apply(r4)     // Catch: java.lang.Throwable -> L31
                java.lang.String r0 = "The mapper returned a null CompletableSource"
                java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)     // Catch: java.lang.Throwable -> L31
                io.reactivex.CompletableSource r4 = (io.reactivex.CompletableSource) r4     // Catch: java.lang.Throwable -> L31
                io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver r0 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver
                r0.<init>(r3)
            L13:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver> r1 = r3.inner
                java.lang.Object r1 = r1.get()
                io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver r1 = (io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver) r1
                io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver r2 = io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable.SwitchMapCompletableObserver.INNER_DISPOSED
                if (r1 != r2) goto L20
                goto L30
            L20:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver> r2 = r3.inner
                boolean r2 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r1, r0)
                if (r2 == 0) goto L13
                if (r1 == 0) goto L2d
                r1.dispose()
            L2d:
                r4.subscribe(r0)
            L30:
                return
            L31:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                org.reactivestreams.Subscription r0 = r3.upstream
                r0.cancel()
                r3.onError(r4)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.upstream
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.upstream = r3
                io.reactivex.CompletableObserver r0 = r2.downstream
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableSwitchMapCompletable(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            r0.delayErrors = r3
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r5) {
            r4 = this;
            io.reactivex.Flowable<T> r0 = r4.source
            io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver r1 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2 = r4.mapper
            boolean r3 = r4.delayErrors
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
            return
    }
}
