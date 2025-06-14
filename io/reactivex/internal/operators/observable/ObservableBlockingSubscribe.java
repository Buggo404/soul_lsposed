package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableBlockingSubscribe {
    private ObservableBlockingSubscribe() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T> void subscribe(io.reactivex.ObservableSource<? extends T> r4) {
            io.reactivex.internal.util.BlockingIgnoringReceiver r0 = new io.reactivex.internal.util.BlockingIgnoringReceiver
            r0.<init>()
            io.reactivex.internal.observers.LambdaObserver r1 = new io.reactivex.internal.observers.LambdaObserver
            io.reactivex.functions.Consumer r2 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r3 = io.reactivex.internal.functions.Functions.emptyConsumer()
            r1.<init>(r2, r0, r0, r3)
            r4.subscribe(r1)
            io.reactivex.internal.util.BlockingHelper.awaitForComplete(r0, r1)
            java.lang.Throwable r4 = r0.error
            if (r4 != 0) goto L1d
            return
        L1d:
            java.lang.RuntimeException r4 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r4)
            throw r4
    }

    public static <T> void subscribe(io.reactivex.ObservableSource<? extends T> r4, io.reactivex.Observer<? super T> r5) {
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            io.reactivex.internal.observers.BlockingObserver r1 = new io.reactivex.internal.observers.BlockingObserver
            r1.<init>(r0)
            r5.onSubscribe(r1)
            r4.subscribe(r1)
        L10:
            boolean r2 = r1.isDisposed()
            if (r2 == 0) goto L17
            goto L3a
        L17:
            java.lang.Object r2 = r0.poll()
            if (r2 != 0) goto L2a
            java.lang.Object r2 = r0.take()     // Catch: java.lang.InterruptedException -> L22
            goto L2a
        L22:
            r4 = move-exception
            r1.dispose()
            r5.onError(r4)
            return
        L2a:
            boolean r3 = r1.isDisposed()
            if (r3 != 0) goto L3a
            java.lang.Object r3 = io.reactivex.internal.observers.BlockingObserver.TERMINATED
            if (r4 == r3) goto L3a
            boolean r2 = io.reactivex.internal.util.NotificationLite.acceptFull(r2, r5)
            if (r2 == 0) goto L10
        L3a:
            return
    }

    public static <T> void subscribe(io.reactivex.ObservableSource<? extends T> r2, io.reactivex.functions.Consumer<? super T> r3, io.reactivex.functions.Consumer<? super java.lang.Throwable> r4, io.reactivex.functions.Action r5) {
            java.lang.String r0 = "onNext is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "onError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "onComplete is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.internal.observers.LambdaObserver r0 = new io.reactivex.internal.observers.LambdaObserver
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.emptyConsumer()
            r0.<init>(r3, r4, r5, r1)
            subscribe(r2, r0)
            return
    }
}
