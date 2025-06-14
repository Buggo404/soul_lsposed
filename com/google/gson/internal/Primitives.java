package com.google.gson.internal;

/* loaded from: classes.dex */
public final class Primitives {
    private Primitives() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isPrimitive(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Le
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isPrimitive()
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static boolean isWrapperType(java.lang.reflect.Type r1) {
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 == r0) goto L27
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r1 == r0) goto L27
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r1 == r0) goto L27
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r1 == r0) goto L27
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 == r0) goto L27
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            if (r1 == r0) goto L27
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 == r0) goto L27
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r1 == r0) goto L27
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            if (r1 != r0) goto L25
            goto L27
        L25:
            r1 = 0
            goto L28
        L27:
            r1 = 1
        L28:
            return r1
    }

    public static <T> java.lang.Class<T> unwrap(java.lang.Class<T> r1) {
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L7
            java.lang.Class r1 = java.lang.Integer.TYPE
            return r1
        L7:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r1 != r0) goto Le
            java.lang.Class r1 = java.lang.Float.TYPE
            return r1
        Le:
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r1 != r0) goto L15
            java.lang.Class r1 = java.lang.Byte.TYPE
            return r1
        L15:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r1 != r0) goto L1c
            java.lang.Class r1 = java.lang.Double.TYPE
            return r1
        L1c:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L23
            java.lang.Class r1 = java.lang.Long.TYPE
            return r1
        L23:
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            if (r1 != r0) goto L2a
            java.lang.Class r1 = java.lang.Character.TYPE
            return r1
        L2a:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L31
            java.lang.Class r1 = java.lang.Boolean.TYPE
            return r1
        L31:
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r1 != r0) goto L38
            java.lang.Class r1 = java.lang.Short.TYPE
            return r1
        L38:
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            if (r1 != r0) goto L3e
            java.lang.Class r1 = java.lang.Void.TYPE
        L3e:
            return r1
    }

    public static <T> java.lang.Class<T> wrap(java.lang.Class<T> r1) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L7
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            return r1
        L7:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r1 != r0) goto Le
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            return r1
        Le:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r1 != r0) goto L15
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            return r1
        L15:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r1 != r0) goto L1c
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            return r1
        L1c:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L23
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            return r1
        L23:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r1 != r0) goto L2a
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            return r1
        L2a:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r1 != r0) goto L31
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            return r1
        L31:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r1 != r0) goto L38
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            return r1
        L38:
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r1 != r0) goto L3e
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
        L3e:
            return r1
    }
}
