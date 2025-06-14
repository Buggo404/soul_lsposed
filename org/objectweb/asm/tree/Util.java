package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/Util.SCL.lombok */
final class Util {
    private Util() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static <T> java.util.List<T> add(java.util.List<T> r4, T r5) {
            r0 = r4
            if (r0 != 0) goto Lf
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = 1
            r1.<init>(r2)
            goto L10
        Lf:
            r0 = r4
        L10:
            r6 = r0
            r0 = r6
            r1 = r5
            boolean r0 = r0.add(r1)
            r0 = r6
            return r0
    }

    static <T> java.util.List<T> asArrayList(int r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r5 = r0
            r0 = 0
            r6 = r0
        Lb:
            r0 = r6
            r1 = r4
            if (r0 >= r1) goto L1e
            r0 = r5
            r1 = 0
            boolean r0 = r0.add(r1)
            int r6 = r6 + 1
            goto Lb
        L1e:
            r0 = r5
            return r0
    }

    static <T> java.util.List<T> asArrayList(T[] r4) {
            r0 = r4
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            return r0
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r4
            int r2 = r2.length
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L1e:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L37
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r5
            r1 = r9
            boolean r0 = r0.add(r1)
            int r8 = r8 + 1
            goto L1e
        L37:
            r0 = r5
            return r0
    }

    static java.util.List<java.lang.Byte> asArrayList(byte[] r4) {
            r0 = r4
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            return r0
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r4
            int r2 = r2.length
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L1e:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L3a
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r5
            r1 = r9
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            boolean r0 = r0.add(r1)
            int r8 = r8 + 1
            goto L1e
        L3a:
            r0 = r5
            return r0
    }

    static java.util.List<java.lang.Boolean> asArrayList(boolean[] r4) {
            r0 = r4
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            return r0
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r4
            int r2 = r2.length
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L1e:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L3a
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r5
            r1 = r9
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = r0.add(r1)
            int r8 = r8 + 1
            goto L1e
        L3a:
            r0 = r5
            return r0
    }

    static java.util.List<java.lang.Short> asArrayList(short[] r4) {
            r0 = r4
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            return r0
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r4
            int r2 = r2.length
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L1e:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L3a
            r0 = r6
            r1 = r8
            short r0 = r0[r1]
            r9 = r0
            r0 = r5
            r1 = r9
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            boolean r0 = r0.add(r1)
            int r8 = r8 + 1
            goto L1e
        L3a:
            r0 = r5
            return r0
    }

    static java.util.List<java.lang.Character> asArrayList(char[] r4) {
            r0 = r4
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            return r0
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r4
            int r2 = r2.length
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L1e:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L3a
            r0 = r6
            r1 = r8
            char r0 = r0[r1]
            r9 = r0
            r0 = r5
            r1 = r9
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            boolean r0 = r0.add(r1)
            int r8 = r8 + 1
            goto L1e
        L3a:
            r0 = r5
            return r0
    }

    static java.util.List<java.lang.Integer> asArrayList(int[] r4) {
            r0 = r4
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            return r0
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r4
            int r2 = r2.length
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L1e:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L3a
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r5
            r1 = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
            int r8 = r8 + 1
            goto L1e
        L3a:
            r0 = r5
            return r0
    }

    static java.util.List<java.lang.Float> asArrayList(float[] r4) {
            r0 = r4
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            return r0
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r4
            int r2 = r2.length
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L1e:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L3a
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r5
            r1 = r9
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            boolean r0 = r0.add(r1)
            int r8 = r8 + 1
            goto L1e
        L3a:
            r0 = r5
            return r0
    }

    static java.util.List<java.lang.Long> asArrayList(long[] r4) {
            r0 = r4
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            return r0
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r4
            int r2 = r2.length
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L1e:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L3a
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r5
            r1 = r9
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.add(r1)
            int r8 = r8 + 1
            goto L1e
        L3a:
            r0 = r5
            return r0
    }

    static java.util.List<java.lang.Double> asArrayList(double[] r4) {
            r0 = r4
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            return r0
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r4
            int r2 = r2.length
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L1e:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L3a
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r5
            r1 = r9
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            boolean r0 = r0.add(r1)
            int r8 = r8 + 1
            goto L1e
        L3a:
            r0 = r5
            return r0
    }

    static <T> java.util.List<T> asArrayList(int r4, T[] r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r6 = r0
            r0 = 0
            r7 = r0
        Lb:
            r0 = r7
            r1 = r4
            if (r0 >= r1) goto L20
            r0 = r6
            r1 = r5
            r2 = r7
            r1 = r1[r2]
            boolean r0 = r0.add(r1)
            int r7 = r7 + 1
            goto Lb
        L20:
            r0 = r6
            return r0
    }
}
