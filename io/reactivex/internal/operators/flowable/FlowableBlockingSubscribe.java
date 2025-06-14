package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableBlockingSubscribe {
    private FlowableBlockingSubscribe() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T> void subscribe(org.reactivestreams.Publisher<? extends T> r4) {
            io.reactivex.internal.util.BlockingIgnoringReceiver r0 = new io.reactivex.internal.util.BlockingIgnoringReceiver
            r0.<init>()
            io.reactivex.internal.subscribers.LambdaSubscriber r1 = new io.reactivex.internal.subscribers.LambdaSubscriber
            io.reactivex.functions.Consumer r2 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer<org.reactivestreams.Subscription> r3 = io.reactivex.internal.functions.Functions.REQUEST_MAX
            r1.<init>(r2, r0, r0, r3)
            r4.subscribe(r1)
            io.reactivex.internal.util.BlockingHelper.awaitForComplete(r0, r1)
            java.lang.Throwable r4 = r0.error
            if (r4 != 0) goto L1b
            return
        L1b:
            java.lang.RuntimeException r4 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r4)
            throw r4
    }

    public static <T> void subscribe(org.reactivestreams.Publisher<? extends T> r2, io.reactivex.functions.Consumer<? super T> r3, io.reactivex.functions.Consumer<? super java.lang.Throwable> r4, io.reactivex.functions.Action r5) {
            java.lang.String r0 = "onNext is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "onError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "onComplete is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.internal.subscribers.LambdaSubscriber r0 = new io.reactivex.internal.subscribers.LambdaSubscriber
            io.reactivex.functions.Consumer<org.reactivestreams.Subscription> r1 = io.reactivex.internal.functions.Functions.REQUEST_MAX
            r0.<init>(r3, r4, r5, r1)
            subscribe(r2, r0)
            return
    }

    public static <T> void subscribe(org.reactivestreams.Publisher<? extends T> r7, io.reactivex.functions.Consumer<? super T> r8, io.reactivex.functions.Consumer<? super java.lang.Throwable> r9, io.reactivex.functions.Action r10, int r11) {
            java.lang.String r0 = "onNext is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "onError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "onComplete is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "number > 0 required"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r11, r0)
            io.reactivex.internal.subscribers.BoundedSubscriber r0 = new io.reactivex.internal.subscribers.BoundedSubscriber
            io.reactivex.functions.Consumer r5 = io.reactivex.internal.functions.Functions.boundedConsumer(r11)
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            subscribe(r7, r0)
            return
    }

    public static <T> void subscribe(org.reactivestreams.Publisher<? extends T> r3, org.reactivestreams.Subscriber<? super T> r4) {
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            io.reactivex.internal.subscribers.BlockingSubscriber r1 = new io.reactivex.internal.subscribers.BlockingSubscriber
            r1.<init>(r0)
            r3.subscribe(r1)
        Ld:
            boolean r3 = r1.isCancelled()     // Catch: java.lang.InterruptedException -> L3a
            if (r3 == 0) goto L14
            goto L41
        L14:
            java.lang.Object r3 = r0.poll()     // Catch: java.lang.InterruptedException -> L3a
            if (r3 != 0) goto L28
            boolean r3 = r1.isCancelled()     // Catch: java.lang.InterruptedException -> L3a
            if (r3 == 0) goto L21
            goto L41
        L21:
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()     // Catch: java.lang.InterruptedException -> L3a
            java.lang.Object r3 = r0.take()     // Catch: java.lang.InterruptedException -> L3a
        L28:
            boolean r2 = r1.isCancelled()     // Catch: java.lang.InterruptedException -> L3a
            if (r2 == 0) goto L2f
            goto L41
        L2f:
            java.lang.Object r2 = io.reactivex.internal.subscribers.BlockingSubscriber.TERMINATED     // Catch: java.lang.InterruptedException -> L3a
            if (r3 == r2) goto L41
            boolean r3 = io.reactivex.internal.util.NotificationLite.acceptFull(r3, r4)     // Catch: java.lang.InterruptedException -> L3a
            if (r3 == 0) goto Ld
            goto L41
        L3a:
            r3 = move-exception
            r1.cancel()
            r4.onError(r3)
        L41:
            return
    }
}
