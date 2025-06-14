package com.xuexiang.xhttp2.cache.key;

/* loaded from: classes.dex */
public final class Strings {
    private static com.xuexiang.xhttp2.cache.key.IObjectSerializer sISerializer;

    private Strings() {
            r2 = this;
            r2.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "u can't instantiate me..."
            r0.<init>(r1)
            throw r0
    }

    static java.lang.String _toString(java.lang.Object r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = "null"
            return r2
        L5:
            boolean r0 = r2 instanceof java.lang.CharSequence
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\""
            r0.<init>(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = printableToString(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            r0 = 34
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L27:
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r1 != r0) goto L36
            java.lang.Byte r2 = (java.lang.Byte) r2
            java.lang.String r2 = byteToString(r2)
            return r2
        L36:
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L45
            java.lang.Class r0 = r0.getComponentType()
            java.lang.String r2 = arrayToString(r0, r2)
            return r2
        L45:
            java.lang.String r2 = r2.toString()
            return r2
    }

    private static java.lang.String arrayToString(java.lang.Class<?> r1, java.lang.Object r2) {
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r0 != r1) goto Ld
            byte[] r2 = (byte[]) r2
            byte[] r2 = (byte[]) r2
            java.lang.String r1 = byteArrayToString(r2)
            return r1
        Ld:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r0 != r1) goto L1a
            short[] r2 = (short[]) r2
            short[] r2 = (short[]) r2
            java.lang.String r1 = java.util.Arrays.toString(r2)
            return r1
        L1a:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r0 != r1) goto L27
            char[] r2 = (char[]) r2
            char[] r2 = (char[]) r2
            java.lang.String r1 = java.util.Arrays.toString(r2)
            return r1
        L27:
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r0 != r1) goto L34
            int[] r2 = (int[]) r2
            int[] r2 = (int[]) r2
            java.lang.String r1 = java.util.Arrays.toString(r2)
            return r1
        L34:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r0 != r1) goto L41
            long[] r2 = (long[]) r2
            long[] r2 = (long[]) r2
            java.lang.String r1 = java.util.Arrays.toString(r2)
            return r1
        L41:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r0 != r1) goto L4e
            float[] r2 = (float[]) r2
            float[] r2 = (float[]) r2
            java.lang.String r1 = java.util.Arrays.toString(r2)
            return r1
        L4e:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r0 != r1) goto L5b
            double[] r2 = (double[]) r2
            double[] r2 = (double[]) r2
            java.lang.String r1 = java.util.Arrays.toString(r2)
            return r1
        L5b:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r0 != r1) goto L68
            boolean[] r2 = (boolean[]) r2
            boolean[] r2 = (boolean[]) r2
            java.lang.String r1 = java.util.Arrays.toString(r2)
            return r1
        L68:
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.String r1 = arrayToString(r2)
            return r1
    }

    private static java.lang.String arrayToString(java.lang.Object[] r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            arrayToString(r2, r0, r1)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static void arrayToString(java.lang.Object[] r5, java.lang.StringBuilder r6, java.util.Set<java.lang.Object[]> r7) {
            java.lang.String r0 = "null"
            if (r5 != 0) goto L8
            r6.append(r0)
            return
        L8:
            r7.add(r5)
            r1 = 91
            r6.append(r1)
            r1 = 0
        L11:
            int r2 = r5.length
            if (r1 >= r2) goto L53
            if (r1 <= 0) goto L1b
            java.lang.String r2 = ", "
            r6.append(r2)
        L1b:
            r2 = r5[r1]
            if (r2 != 0) goto L23
            r6.append(r0)
            goto L50
        L23:
            java.lang.Class r3 = r2.getClass()
            boolean r4 = r3.isArray()
            if (r4 == 0) goto L49
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            if (r3 != r4) goto L49
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            boolean r3 = r7.contains(r2)
            if (r3 == 0) goto L45
            java.lang.String r2 = "[...]"
            r6.append(r2)
            goto L50
        L45:
            arrayToString(r2, r6, r7)
            goto L50
        L49:
            java.lang.String r2 = _toString(r2)
            r6.append(r2)
        L50:
            int r1 = r1 + 1
            goto L11
        L53:
            r0 = 93
            r6.append(r0)
            r7.remove(r5)
            return
    }

    private static java.lang.String byteArrayToString(byte[] r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r3.length
            if (r1 >= r2) goto L22
            if (r1 <= 0) goto L12
            java.lang.String r2 = ", "
            r0.append(r2)
        L12:
            r2 = r3[r1]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            java.lang.String r2 = byteToString(r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L8
        L22:
            r3 = 93
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private static java.lang.String byteToString(java.lang.Byte r3) {
            if (r3 != 0) goto L5
            java.lang.String r3 = "null"
            return r3
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "0x"
            r0.<init>(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "%02x"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r3 = r3.toUpperCase(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private static java.lang.String printableToString(java.lang.String r8) {
            int r0 = r8.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r0) goto L74
            int r4 = r8.codePointAt(r3)
            int r5 = java.lang.Character.getType(r4)
            if (r5 == 0) goto L2f
            r6 = 15
            if (r5 == r6) goto L2f
            r6 = 16
            if (r5 == r6) goto L2f
            r6 = 18
            if (r5 == r6) goto L2f
            r6 = 19
            if (r5 == r6) goto L2f
            char[] r5 = java.lang.Character.toChars(r4)
            r1.append(r5)
            goto L6e
        L2f:
            switch(r4) {
                case 8: goto L69;
                case 9: goto L63;
                case 10: goto L5d;
                case 11: goto L32;
                case 12: goto L57;
                case 13: goto L51;
                default: goto L32;
            }
        L32:
            java.lang.String r5 = "\\u"
            java.lang.StringBuilder r5 = r1.append(r5)
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r6[r2] = r7
            java.lang.String r7 = "%04x"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r6 = r6.toUpperCase(r7)
            r5.append(r6)
            goto L6e
        L51:
            java.lang.String r5 = "\\r"
            r1.append(r5)
            goto L6e
        L57:
            java.lang.String r5 = "\\f"
            r1.append(r5)
            goto L6e
        L5d:
            java.lang.String r5 = "\\n"
            r1.append(r5)
            goto L6e
        L63:
            java.lang.String r5 = "\\t"
            r1.append(r5)
            goto L6e
        L69:
            java.lang.String r5 = "\\b"
            r1.append(r5)
        L6e:
            int r4 = java.lang.Character.charCount(r4)
            int r3 = r3 + r4
            goto Lb
        L74:
            java.lang.String r8 = r1.toString()
            return r8
    }

    public static void setISerializer(com.xuexiang.xhttp2.cache.key.IObjectSerializer r0) {
            com.xuexiang.xhttp2.cache.key.Strings.sISerializer = r0
            return
    }

    public static java.lang.String toString(java.lang.Object r1) {
            com.xuexiang.xhttp2.cache.key.IObjectSerializer r0 = com.xuexiang.xhttp2.cache.key.Strings.sISerializer
            if (r0 != 0) goto Lb
            com.xuexiang.xhttp2.cache.key.DefaultObjectSerializer r0 = new com.xuexiang.xhttp2.cache.key.DefaultObjectSerializer
            r0.<init>()
            com.xuexiang.xhttp2.cache.key.Strings.sISerializer = r0
        Lb:
            com.xuexiang.xhttp2.cache.key.IObjectSerializer r0 = com.xuexiang.xhttp2.cache.key.Strings.sISerializer
            java.lang.String r1 = r0.toString(r1)
            return r1
    }
}
