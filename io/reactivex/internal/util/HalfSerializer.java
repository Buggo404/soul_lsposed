package io.reactivex.internal.util;

/* loaded from: classes.dex */
public final class HalfSerializer {
    private HalfSerializer() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static void onComplete(io.reactivex.Observer<?> r0, java.util.concurrent.atomic.AtomicInteger r1, io.reactivex.internal.util.AtomicThrowable r2) {
            int r1 = r1.getAndIncrement()
            if (r1 != 0) goto L13
            java.lang.Throwable r1 = r2.terminate()
            if (r1 == 0) goto L10
            r0.onError(r1)
            goto L13
        L10:
            r0.onComplete()
        L13:
            return
    }

    public static void onComplete(org.reactivestreams.Subscriber<?> r0, java.util.concurrent.atomic.AtomicInteger r1, io.reactivex.internal.util.AtomicThrowable r2) {
            int r1 = r1.getAndIncrement()
            if (r1 != 0) goto L13
            java.lang.Throwable r1 = r2.terminate()
            if (r1 == 0) goto L10
            r0.onError(r1)
            goto L13
        L10:
            r0.onComplete()
        L13:
            return
    }

    public static void onError(io.reactivex.Observer<?> r1, java.lang.Throwable r2, java.util.concurrent.atomic.AtomicInteger r3, io.reactivex.internal.util.AtomicThrowable r4) {
            boolean r0 = r4.addThrowable(r2)
            if (r0 == 0) goto L14
            int r2 = r3.getAndIncrement()
            if (r2 != 0) goto L17
            java.lang.Throwable r2 = r4.terminate()
            r1.onError(r2)
            goto L17
        L14:
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
        L17:
            return
    }

    public static void onError(org.reactivestreams.Subscriber<?> r1, java.lang.Throwable r2, java.util.concurrent.atomic.AtomicInteger r3, io.reactivex.internal.util.AtomicThrowable r4) {
            boolean r0 = r4.addThrowable(r2)
            if (r0 == 0) goto L14
            int r2 = r3.getAndIncrement()
            if (r2 != 0) goto L17
            java.lang.Throwable r2 = r4.terminate()
            r1.onError(r2)
            goto L17
        L14:
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
        L17:
            return
    }

    public static <T> void onNext(io.reactivex.Observer<? super T> r2, T r3, java.util.concurrent.atomic.AtomicInteger r4, io.reactivex.internal.util.AtomicThrowable r5) {
            int r0 = r4.get()
            if (r0 != 0) goto L24
            r0 = 0
            r1 = 1
            boolean r0 = r4.compareAndSet(r0, r1)
            if (r0 == 0) goto L24
            r2.onNext(r3)
            int r3 = r4.decrementAndGet()
            if (r3 == 0) goto L24
            java.lang.Throwable r3 = r5.terminate()
            if (r3 == 0) goto L21
            r2.onError(r3)
            goto L24
        L21:
            r2.onComplete()
        L24:
            return
    }

    public static <T> void onNext(org.reactivestreams.Subscriber<? super T> r2, T r3, java.util.concurrent.atomic.AtomicInteger r4, io.reactivex.internal.util.AtomicThrowable r5) {
            int r0 = r4.get()
            if (r0 != 0) goto L24
            r0 = 0
            r1 = 1
            boolean r0 = r4.compareAndSet(r0, r1)
            if (r0 == 0) goto L24
            r2.onNext(r3)
            int r3 = r4.decrementAndGet()
            if (r3 == 0) goto L24
            java.lang.Throwable r3 = r5.terminate()
            if (r3 == 0) goto L21
            r2.onError(r3)
            goto L24
        L21:
            r2.onComplete()
        L24:
            return
    }
}
