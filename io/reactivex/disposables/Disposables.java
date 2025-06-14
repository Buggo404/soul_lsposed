package io.reactivex.disposables;

/* loaded from: classes.dex */
public final class Disposables {
    private Disposables() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static io.reactivex.disposables.Disposable disposed() {
            io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            return r0
    }

    public static io.reactivex.disposables.Disposable empty() {
            java.lang.Runnable r0 = io.reactivex.internal.functions.Functions.EMPTY_RUNNABLE
            io.reactivex.disposables.Disposable r0 = fromRunnable(r0)
            return r0
    }

    public static io.reactivex.disposables.Disposable fromAction(io.reactivex.functions.Action r1) {
            java.lang.String r0 = "run is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.disposables.ActionDisposable r0 = new io.reactivex.disposables.ActionDisposable
            r0.<init>(r1)
            return r0
    }

    public static io.reactivex.disposables.Disposable fromFuture(java.util.concurrent.Future<?> r1) {
            java.lang.String r0 = "future is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            r0 = 1
            io.reactivex.disposables.Disposable r1 = fromFuture(r1, r0)
            return r1
    }

    public static io.reactivex.disposables.Disposable fromFuture(java.util.concurrent.Future<?> r1, boolean r2) {
            java.lang.String r0 = "future is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.disposables.FutureDisposable r0 = new io.reactivex.disposables.FutureDisposable
            r0.<init>(r1, r2)
            return r0
    }

    public static io.reactivex.disposables.Disposable fromRunnable(java.lang.Runnable r1) {
            java.lang.String r0 = "run is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.disposables.RunnableDisposable r0 = new io.reactivex.disposables.RunnableDisposable
            r0.<init>(r1)
            return r0
    }

    public static io.reactivex.disposables.Disposable fromSubscription(org.reactivestreams.Subscription r1) {
            java.lang.String r0 = "subscription is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.disposables.SubscriptionDisposable r0 = new io.reactivex.disposables.SubscriptionDisposable
            r0.<init>(r1)
            return r0
    }
}
