package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleDelay<T> extends io.reactivex.Single<T> {
    final boolean delayError;
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.SingleSource<? extends T> source;
    final long time;
    final java.util.concurrent.TimeUnit unit;

    final class Delay implements io.reactivex.SingleObserver<T> {

        /* renamed from: s */
        final io.reactivex.SingleObserver<? super T> f496s;

        /* renamed from: sd */
        private final io.reactivex.internal.disposables.SequentialDisposable f497sd;
        final /* synthetic */ io.reactivex.internal.operators.single.SingleDelay this$0;

        final class OnError implements java.lang.Runnable {

            /* renamed from: e */
            private final java.lang.Throwable f498e;
            final /* synthetic */ io.reactivex.internal.operators.single.SingleDelay.Delay this$1;

            OnError(io.reactivex.internal.operators.single.SingleDelay.Delay r1, java.lang.Throwable r2) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    r0.f498e = r2
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    io.reactivex.internal.operators.single.SingleDelay$Delay r0 = r2.this$1
                    io.reactivex.SingleObserver<? super T> r0 = r0.f496s
                    java.lang.Throwable r1 = r2.f498e
                    r0.onError(r1)
                    return
            }
        }

        final class OnSuccess implements java.lang.Runnable {
            final /* synthetic */ io.reactivex.internal.operators.single.SingleDelay.Delay this$1;
            private final T value;

            OnSuccess(io.reactivex.internal.operators.single.SingleDelay.Delay r1, T r2) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    r0.value = r2
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    io.reactivex.internal.operators.single.SingleDelay$Delay r0 = r2.this$1
                    io.reactivex.SingleObserver<? super T> r0 = r0.f496s
                    T r1 = r2.value
                    r0.onSuccess(r1)
                    return
            }
        }

        Delay(io.reactivex.internal.operators.single.SingleDelay r1, io.reactivex.internal.disposables.SequentialDisposable r2, io.reactivex.SingleObserver<? super T> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.f497sd = r2
                r0.f496s = r3
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r5.f497sd
                io.reactivex.internal.operators.single.SingleDelay r1 = r5.this$0
                io.reactivex.Scheduler r1 = r1.scheduler
                io.reactivex.internal.operators.single.SingleDelay$Delay$OnError r2 = new io.reactivex.internal.operators.single.SingleDelay$Delay$OnError
                r2.<init>(r5, r6)
                io.reactivex.internal.operators.single.SingleDelay r6 = r5.this$0
                boolean r6 = r6.delayError
                if (r6 == 0) goto L16
                io.reactivex.internal.operators.single.SingleDelay r6 = r5.this$0
                long r3 = r6.time
                goto L18
            L16:
                r3 = 0
            L18:
                io.reactivex.internal.operators.single.SingleDelay r6 = r5.this$0
                java.util.concurrent.TimeUnit r6 = r6.unit
                io.reactivex.disposables.Disposable r6 = r1.scheduleDirect(r2, r3, r6)
                r0.replace(r6)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.f497sd
                r0.replace(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r6) {
                r5 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r5.f497sd
                io.reactivex.internal.operators.single.SingleDelay r1 = r5.this$0
                io.reactivex.Scheduler r1 = r1.scheduler
                io.reactivex.internal.operators.single.SingleDelay$Delay$OnSuccess r2 = new io.reactivex.internal.operators.single.SingleDelay$Delay$OnSuccess
                r2.<init>(r5, r6)
                io.reactivex.internal.operators.single.SingleDelay r6 = r5.this$0
                long r3 = r6.time
                io.reactivex.internal.operators.single.SingleDelay r6 = r5.this$0
                java.util.concurrent.TimeUnit r6 = r6.unit
                io.reactivex.disposables.Disposable r6 = r1.scheduleDirect(r2, r3, r6)
                r0.replace(r6)
                return
        }
    }

    public SingleDelay(io.reactivex.SingleSource<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.time = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.delayError = r6
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r4) {
            r3 = this;
            io.reactivex.internal.disposables.SequentialDisposable r0 = new io.reactivex.internal.disposables.SequentialDisposable
            r0.<init>()
            r4.onSubscribe(r0)
            io.reactivex.SingleSource<? extends T> r1 = r3.source
            io.reactivex.internal.operators.single.SingleDelay$Delay r2 = new io.reactivex.internal.operators.single.SingleDelay$Delay
            r2.<init>(r3, r0, r4)
            r1.subscribe(r2)
            return
    }
}
