package io.reactivex.schedulers;

/* loaded from: classes.dex */
public final class Timed<T> {
    final long time;
    final java.util.concurrent.TimeUnit unit;
    final T value;

    public Timed(T r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            r0.time = r2
            java.lang.String r1 = "unit is null"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r1)
            java.util.concurrent.TimeUnit r1 = (java.util.concurrent.TimeUnit) r1
            r0.unit = r1
            return
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof io.reactivex.schedulers.Timed
            r1 = 0
            if (r0 == 0) goto L24
            io.reactivex.schedulers.Timed r7 = (io.reactivex.schedulers.Timed) r7
            T r0 = r6.value
            T r2 = r7.value
            boolean r0 = io.reactivex.internal.functions.ObjectHelper.equals(r0, r2)
            if (r0 == 0) goto L24
            long r2 = r6.time
            long r4 = r7.time
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L24
            java.util.concurrent.TimeUnit r0 = r6.unit
            java.util.concurrent.TimeUnit r7 = r7.unit
            boolean r7 = io.reactivex.internal.functions.ObjectHelper.equals(r0, r7)
            if (r7 == 0) goto L24
            r1 = 1
        L24:
            return r1
    }

    public int hashCode() {
            r6 = this;
            T r0 = r6.value
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            r1 = 31
            int r0 = r0 * r1
            long r2 = r6.time
            long r4 = r2 >>> r1
            long r2 = r2 ^ r4
            int r2 = (int) r2
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.concurrent.TimeUnit r1 = r6.unit
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public long time() {
            r2 = this;
            long r0 = r2.time
            return r0
    }

    public long time(java.util.concurrent.TimeUnit r4) {
            r3 = this;
            long r0 = r3.time
            java.util.concurrent.TimeUnit r2 = r3.unit
            long r0 = r4.convert(r0, r2)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Timed[time="
            r0.<init>(r1)
            long r1 = r3.time
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", unit="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.concurrent.TimeUnit r1 = r3.unit
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", value="
            java.lang.StringBuilder r0 = r0.append(r1)
            T r1 = r3.value
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.util.concurrent.TimeUnit unit() {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = r1.unit
            return r0
    }

    public T value() {
            r1 = this;
            T r0 = r1.value
            return r0
    }
}
