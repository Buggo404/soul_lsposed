package io.reactivex.internal.util;

/* loaded from: classes.dex */
public final class EndConsumerHelper {
    private EndConsumerHelper() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String composeMessage(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "It is not allowed to subscribe with a(n) "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = " multiple times. Please create a fresh instance of "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = " and subscribe that to the target source instead."
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static void reportDoubleSubscription(java.lang.Class<?> r1) {
            io.reactivex.exceptions.ProtocolViolationException r0 = new io.reactivex.exceptions.ProtocolViolationException
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = composeMessage(r1)
            r0.<init>(r1)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
            return
    }

    public static boolean setOnce(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1, io.reactivex.disposables.Disposable r2, java.lang.Class<?> r3) {
            java.lang.String r0 = "next is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            r0 = 0
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r2)
            if (r0 != 0) goto L1c
            r2.dispose()
            java.lang.Object r1 = r1.get()
            io.reactivex.internal.disposables.DisposableHelper r2 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r1 == r2) goto L1a
            reportDoubleSubscription(r3)
        L1a:
            r1 = 0
            return r1
        L1c:
            r1 = 1
            return r1
    }

    public static boolean setOnce(java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r1, org.reactivestreams.Subscription r2, java.lang.Class<?> r3) {
            java.lang.String r0 = "next is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            r0 = 0
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r2)
            if (r0 != 0) goto L1c
            r2.cancel()
            java.lang.Object r1 = r1.get()
            io.reactivex.internal.subscriptions.SubscriptionHelper r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r1 == r2) goto L1a
            reportDoubleSubscription(r3)
        L1a:
            r1 = 0
            return r1
        L1c:
            r1 = 1
            return r1
    }

    public static boolean validate(io.reactivex.disposables.Disposable r1, io.reactivex.disposables.Disposable r2, java.lang.Class<?> r3) {
            java.lang.String r0 = "next is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            if (r1 == 0) goto L13
            r2.dispose()
            io.reactivex.internal.disposables.DisposableHelper r2 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r1 == r2) goto L11
            reportDoubleSubscription(r3)
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public static boolean validate(org.reactivestreams.Subscription r1, org.reactivestreams.Subscription r2, java.lang.Class<?> r3) {
            java.lang.String r0 = "next is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            if (r1 == 0) goto L13
            r2.cancel()
            io.reactivex.internal.subscriptions.SubscriptionHelper r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r1 == r2) goto L11
            reportDoubleSubscription(r3)
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }
}
