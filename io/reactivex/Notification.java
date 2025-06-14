package io.reactivex;

/* loaded from: classes.dex */
public final class Notification<T> {
    static final io.reactivex.Notification<java.lang.Object> COMPLETE = null;
    final java.lang.Object value;

    static {
            io.reactivex.Notification r0 = new io.reactivex.Notification
            r1 = 0
            r0.<init>(r1)
            io.reactivex.Notification.COMPLETE = r0
            return
    }

    private Notification(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public static <T> io.reactivex.Notification<T> createOnComplete() {
            io.reactivex.Notification<java.lang.Object> r0 = io.reactivex.Notification.COMPLETE
            return r0
    }

    public static <T> io.reactivex.Notification<T> createOnError(java.lang.Throwable r1) {
            java.lang.String r0 = "error is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.Notification r0 = new io.reactivex.Notification
            java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.error(r1)
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.Notification<T> createOnNext(T r1) {
            java.lang.String r0 = "value is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.Notification r0 = new io.reactivex.Notification
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.reactivex.Notification
            if (r0 == 0) goto Lf
            io.reactivex.Notification r2 = (io.reactivex.Notification) r2
            java.lang.Object r0 = r1.value
            java.lang.Object r2 = r2.value
            boolean r2 = io.reactivex.internal.functions.ObjectHelper.equals(r0, r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public java.lang.Throwable getError() {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r1 = io.reactivex.internal.util.NotificationLite.isError(r0)
            if (r1 == 0) goto Ld
            java.lang.Throwable r0 = io.reactivex.internal.util.NotificationLite.getError(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public T getValue() {
            r1 = this;
            java.lang.Object r0 = r1.value
            if (r0 == 0) goto Ld
            boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r0)
            if (r0 != 0) goto Ld
            java.lang.Object r0 = r1.value
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.value
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public boolean isOnComplete() {
            r1 = this;
            java.lang.Object r0 = r1.value
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isOnError() {
            r1 = this;
            java.lang.Object r0 = r1.value
            boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r0)
            return r0
    }

    public boolean isOnNext() {
            r1 = this;
            java.lang.Object r0 = r1.value
            if (r0 == 0) goto Lc
            boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r0)
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L7
            java.lang.String r0 = "OnCompleteNotification"
            return r0
        L7:
            boolean r1 = io.reactivex.internal.util.NotificationLite.isError(r0)
            java.lang.String r2 = "]"
            if (r1 == 0) goto L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "OnErrorNotification["
            r1.<init>(r3)
            java.lang.Throwable r0 = io.reactivex.internal.util.NotificationLite.getError(r0)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        L27:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OnNextNotification["
            r0.<init>(r1)
            java.lang.Object r1 = r4.value
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
