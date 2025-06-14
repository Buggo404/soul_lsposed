package io.reactivex.internal.util;

/* loaded from: classes.dex */
public enum NotificationLite extends java.lang.Enum<io.reactivex.internal.util.NotificationLite> {
    private static final /* synthetic */ io.reactivex.internal.util.NotificationLite[] $VALUES = null;
    public static final io.reactivex.internal.util.NotificationLite COMPLETE = null;

    static final class DisposableNotification implements java.io.Serializable {
        private static final long serialVersionUID = -7482590109178395495L;

        /* renamed from: d */
        final io.reactivex.disposables.Disposable f550d;

        DisposableNotification(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                r0.<init>()
                r0.f550d = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "NotificationLite.Disposable["
                r0.<init>(r1)
                io.reactivex.disposables.Disposable r1 = r2.f550d
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "]"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static final class ErrorNotification implements java.io.Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: e */
        final java.lang.Throwable f551e;

        ErrorNotification(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.f551e = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof io.reactivex.internal.util.NotificationLite.ErrorNotification
                if (r0 == 0) goto Lf
                io.reactivex.internal.util.NotificationLite$ErrorNotification r2 = (io.reactivex.internal.util.NotificationLite.ErrorNotification) r2
                java.lang.Throwable r0 = r1.f551e
                java.lang.Throwable r2 = r2.f551e
                boolean r2 = io.reactivex.internal.functions.ObjectHelper.equals(r0, r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.lang.Throwable r0 = r1.f551e
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "NotificationLite.Error["
                r0.<init>(r1)
                java.lang.Throwable r1 = r2.f551e
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "]"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static final class SubscriptionNotification implements java.io.Serializable {
        private static final long serialVersionUID = -1322257508628817540L;

        /* renamed from: s */
        final org.reactivestreams.Subscription f552s;

        SubscriptionNotification(org.reactivestreams.Subscription r1) {
                r0 = this;
                r0.<init>()
                r0.f552s = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "NotificationLite.Subscription["
                r0.<init>(r1)
                org.reactivestreams.Subscription r1 = r2.f552s
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "]"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            io.reactivex.internal.util.NotificationLite r0 = new io.reactivex.internal.util.NotificationLite
            java.lang.String r1 = "COMPLETE"
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.internal.util.NotificationLite.COMPLETE = r0
            r1 = 1
            io.reactivex.internal.util.NotificationLite[] r1 = new io.reactivex.internal.util.NotificationLite[r1]
            r1[r2] = r0
            io.reactivex.internal.util.NotificationLite.$VALUES = r1
            return
    }

    NotificationLite(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <T> boolean accept(java.lang.Object r2, io.reactivex.Observer<? super T> r3) {
            io.reactivex.internal.util.NotificationLite r0 = io.reactivex.internal.util.NotificationLite.COMPLETE
            r1 = 1
            if (r2 != r0) goto L9
            r3.onComplete()
            return r1
        L9:
            boolean r0 = r2 instanceof io.reactivex.internal.util.NotificationLite.ErrorNotification
            if (r0 == 0) goto L15
            io.reactivex.internal.util.NotificationLite$ErrorNotification r2 = (io.reactivex.internal.util.NotificationLite.ErrorNotification) r2
            java.lang.Throwable r2 = r2.f551e
            r3.onError(r2)
            return r1
        L15:
            r3.onNext(r2)
            r2 = 0
            return r2
    }

    public static <T> boolean accept(java.lang.Object r2, org.reactivestreams.Subscriber<? super T> r3) {
            io.reactivex.internal.util.NotificationLite r0 = io.reactivex.internal.util.NotificationLite.COMPLETE
            r1 = 1
            if (r2 != r0) goto L9
            r3.onComplete()
            return r1
        L9:
            boolean r0 = r2 instanceof io.reactivex.internal.util.NotificationLite.ErrorNotification
            if (r0 == 0) goto L15
            io.reactivex.internal.util.NotificationLite$ErrorNotification r2 = (io.reactivex.internal.util.NotificationLite.ErrorNotification) r2
            java.lang.Throwable r2 = r2.f551e
            r3.onError(r2)
            return r1
        L15:
            r3.onNext(r2)
            r2 = 0
            return r2
    }

    public static <T> boolean acceptFull(java.lang.Object r2, io.reactivex.Observer<? super T> r3) {
            io.reactivex.internal.util.NotificationLite r0 = io.reactivex.internal.util.NotificationLite.COMPLETE
            r1 = 1
            if (r2 != r0) goto L9
            r3.onComplete()
            return r1
        L9:
            boolean r0 = r2 instanceof io.reactivex.internal.util.NotificationLite.ErrorNotification
            if (r0 == 0) goto L15
            io.reactivex.internal.util.NotificationLite$ErrorNotification r2 = (io.reactivex.internal.util.NotificationLite.ErrorNotification) r2
            java.lang.Throwable r2 = r2.f551e
            r3.onError(r2)
            return r1
        L15:
            boolean r0 = r2 instanceof io.reactivex.internal.util.NotificationLite.DisposableNotification
            r1 = 0
            if (r0 == 0) goto L22
            io.reactivex.internal.util.NotificationLite$DisposableNotification r2 = (io.reactivex.internal.util.NotificationLite.DisposableNotification) r2
            io.reactivex.disposables.Disposable r2 = r2.f550d
            r3.onSubscribe(r2)
            return r1
        L22:
            r3.onNext(r2)
            return r1
    }

    public static <T> boolean acceptFull(java.lang.Object r2, org.reactivestreams.Subscriber<? super T> r3) {
            io.reactivex.internal.util.NotificationLite r0 = io.reactivex.internal.util.NotificationLite.COMPLETE
            r1 = 1
            if (r2 != r0) goto L9
            r3.onComplete()
            return r1
        L9:
            boolean r0 = r2 instanceof io.reactivex.internal.util.NotificationLite.ErrorNotification
            if (r0 == 0) goto L15
            io.reactivex.internal.util.NotificationLite$ErrorNotification r2 = (io.reactivex.internal.util.NotificationLite.ErrorNotification) r2
            java.lang.Throwable r2 = r2.f551e
            r3.onError(r2)
            return r1
        L15:
            boolean r0 = r2 instanceof io.reactivex.internal.util.NotificationLite.SubscriptionNotification
            r1 = 0
            if (r0 == 0) goto L22
            io.reactivex.internal.util.NotificationLite$SubscriptionNotification r2 = (io.reactivex.internal.util.NotificationLite.SubscriptionNotification) r2
            org.reactivestreams.Subscription r2 = r2.f552s
            r3.onSubscribe(r2)
            return r1
        L22:
            r3.onNext(r2)
            return r1
    }

    public static java.lang.Object complete() {
            io.reactivex.internal.util.NotificationLite r0 = io.reactivex.internal.util.NotificationLite.COMPLETE
            return r0
    }

    public static java.lang.Object disposable(io.reactivex.disposables.Disposable r1) {
            io.reactivex.internal.util.NotificationLite$DisposableNotification r0 = new io.reactivex.internal.util.NotificationLite$DisposableNotification
            r0.<init>(r1)
            return r0
    }

    public static java.lang.Object error(java.lang.Throwable r1) {
            io.reactivex.internal.util.NotificationLite$ErrorNotification r0 = new io.reactivex.internal.util.NotificationLite$ErrorNotification
            r0.<init>(r1)
            return r0
    }

    public static io.reactivex.disposables.Disposable getDisposable(java.lang.Object r0) {
            io.reactivex.internal.util.NotificationLite$DisposableNotification r0 = (io.reactivex.internal.util.NotificationLite.DisposableNotification) r0
            io.reactivex.disposables.Disposable r0 = r0.f550d
            return r0
    }

    public static java.lang.Throwable getError(java.lang.Object r0) {
            io.reactivex.internal.util.NotificationLite$ErrorNotification r0 = (io.reactivex.internal.util.NotificationLite.ErrorNotification) r0
            java.lang.Throwable r0 = r0.f551e
            return r0
    }

    public static org.reactivestreams.Subscription getSubscription(java.lang.Object r0) {
            io.reactivex.internal.util.NotificationLite$SubscriptionNotification r0 = (io.reactivex.internal.util.NotificationLite.SubscriptionNotification) r0
            org.reactivestreams.Subscription r0 = r0.f552s
            return r0
    }

    public static <T> T getValue(java.lang.Object r0) {
            return r0
    }

    public static boolean isComplete(java.lang.Object r1) {
            io.reactivex.internal.util.NotificationLite r0 = io.reactivex.internal.util.NotificationLite.COMPLETE
            if (r1 != r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public static boolean isDisposable(java.lang.Object r0) {
            boolean r0 = r0 instanceof io.reactivex.internal.util.NotificationLite.DisposableNotification
            return r0
    }

    public static boolean isError(java.lang.Object r0) {
            boolean r0 = r0 instanceof io.reactivex.internal.util.NotificationLite.ErrorNotification
            return r0
    }

    public static boolean isSubscription(java.lang.Object r0) {
            boolean r0 = r0 instanceof io.reactivex.internal.util.NotificationLite.SubscriptionNotification
            return r0
    }

    public static <T> java.lang.Object next(T r0) {
            return r0
    }

    public static java.lang.Object subscription(org.reactivestreams.Subscription r1) {
            io.reactivex.internal.util.NotificationLite$SubscriptionNotification r0 = new io.reactivex.internal.util.NotificationLite$SubscriptionNotification
            r0.<init>(r1)
            return r0
    }

    public static io.reactivex.internal.util.NotificationLite valueOf(java.lang.String r1) {
            java.lang.Class<io.reactivex.internal.util.NotificationLite> r0 = io.reactivex.internal.util.NotificationLite.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.reactivex.internal.util.NotificationLite r1 = (io.reactivex.internal.util.NotificationLite) r1
            return r1
    }

    public static io.reactivex.internal.util.NotificationLite[] values() {
            io.reactivex.internal.util.NotificationLite[] r0 = io.reactivex.internal.util.NotificationLite.$VALUES
            java.lang.Object r0 = r0.clone()
            io.reactivex.internal.util.NotificationLite[] r0 = (io.reactivex.internal.util.NotificationLite[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "NotificationLite.Complete"
            return r0
    }
}
