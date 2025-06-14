package io.reactivex.internal.util;

/* loaded from: classes.dex */
public final class BackpressureHelper {
    private BackpressureHelper() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static long add(java.util.concurrent.atomic.AtomicLong r5, long r6) {
        L0:
            long r0 = r5.get()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            return r2
        Le:
            long r2 = addCap(r0, r6)
            boolean r2 = r5.compareAndSet(r0, r2)
            if (r2 == 0) goto L0
            return r0
    }

    public static long addCancel(java.util.concurrent.atomic.AtomicLong r5, long r6) {
        L0:
            long r0 = r5.get()
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            return r2
        Lb:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L15
            return r2
        L15:
            long r2 = addCap(r0, r6)
            boolean r2 = r5.compareAndSet(r0, r2)
            if (r2 == 0) goto L0
            return r0
    }

    public static long addCap(long r0, long r2) {
            long r0 = r0 + r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto Lc
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lc:
            return r0
    }

    public static long multiplyCap(long r6, long r8) {
            long r0 = r6 * r8
            long r2 = r6 | r8
            r4 = 31
            long r2 = r2 >>> r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L19
            long r6 = r0 / r6
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L19
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r6
        L19:
            return r0
    }

    public static long produced(java.util.concurrent.atomic.AtomicLong r9, long r10) {
        L0:
            long r0 = r9.get()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            return r2
        Le:
            long r2 = r0 - r10
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L2e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "More produced than requested: "
            r7.<init>(r8)
            java.lang.StringBuilder r2 = r7.append(r2)
            java.lang.String r2 = r2.toString()
            r6.<init>(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r6)
            r2 = r4
        L2e:
            boolean r0 = r9.compareAndSet(r0, r2)
            if (r0 == 0) goto L0
            return r2
    }

    public static long producedCancel(java.util.concurrent.atomic.AtomicLong r9, long r10) {
        L0:
            long r0 = r9.get()
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            return r2
        Lb:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L15
            return r2
        L15:
            long r2 = r0 - r10
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L35
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "More produced than requested: "
            r7.<init>(r8)
            java.lang.StringBuilder r2 = r7.append(r2)
            java.lang.String r2 = r2.toString()
            r6.<init>(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r6)
            r2 = r4
        L35:
            boolean r0 = r9.compareAndSet(r0, r2)
            if (r0 == 0) goto L0
            return r2
    }
}
