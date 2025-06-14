package io.reactivex.internal.functions;

/* loaded from: classes.dex */
public final class ObjectHelper {
    static final io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> EQUALS = null;

    static final class BiObjectPredicate implements io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> {
        BiObjectPredicate() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.reactivex.functions.BiPredicate
        public boolean test(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                boolean r1 = io.reactivex.internal.functions.ObjectHelper.equals(r1, r2)
                return r1
        }
    }

    static {
            io.reactivex.internal.functions.ObjectHelper$BiObjectPredicate r0 = new io.reactivex.internal.functions.ObjectHelper$BiObjectPredicate
            r0.<init>()
            io.reactivex.internal.functions.ObjectHelper.EQUALS = r0
            return
    }

    private ObjectHelper() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static int compare(int r0, int r1) {
            if (r0 >= r1) goto L4
            r0 = -1
            goto L9
        L4:
            if (r0 <= r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static int compare(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L6
            r0 = -1
            goto Lb
        L6:
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public static boolean equals(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    public static <T> io.reactivex.functions.BiPredicate<T, T> equalsPredicate() {
            io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> r0 = io.reactivex.internal.functions.ObjectHelper.EQUALS
            return r0
    }

    public static int hashCode(java.lang.Object r0) {
            if (r0 == 0) goto L7
            int r0 = r0.hashCode()
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @java.lang.Deprecated
    public static long requireNonNull(long r1, java.lang.String r3) {
            java.lang.InternalError r1 = new java.lang.InternalError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Null check on a primitive: "
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static <T> T requireNonNull(T r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
    }

    public static int verifyPositive(int r2, java.lang.String r3) {
            if (r2 <= 0) goto L3
            return r2
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " > 0 required but it was "
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    public static long verifyPositive(long r2, java.lang.String r4) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L7
            return r2
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " > 0 required but it was "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }
}
