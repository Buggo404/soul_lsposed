package com.xuexiang.xhttp2.reflect.impl;

/* loaded from: classes.dex */
public class WildcardTypeImpl implements java.lang.reflect.WildcardType {
    private final java.lang.Class[] lower;
    private final java.lang.Class[] upper;

    public WildcardTypeImpl(java.lang.Class[] r2, java.lang.Class[] r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            if (r2 == 0) goto L7
            goto L9
        L7:
            java.lang.Class[] r2 = new java.lang.Class[r0]
        L9:
            r1.lower = r2
            if (r3 == 0) goto Le
            goto L10
        Le:
            java.lang.Class[] r3 = new java.lang.Class[r0]
        L10:
            r1.upper = r3
            r1.checkArgs()
            return
    }

    private void checkArgs() {
            r2 = this;
            java.lang.Class[] r0 = r2.lower
            int r1 = r0.length
            if (r1 != 0) goto L13
            java.lang.Class[] r1 = r2.upper
            int r1 = r1.length
            if (r1 == 0) goto Lb
            goto L13
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "lower or upper can't be null"
            r0.<init>(r1)
            throw r0
        L13:
            r2.checkArgs(r0)
            java.lang.Class[] r0 = r2.upper
            r2.checkArgs(r0)
            return
    }

    private void checkArgs(java.lang.Class[] r4) {
            r3 = this;
            r0 = 1
        L1:
            int r1 = r4.length
            if (r0 >= r1) goto L2c
            r1 = r4[r0]
            boolean r2 = r1.isInterface()
            if (r2 == 0) goto Lf
            int r0 = r0 + 1
            goto L1
        Lf:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " not a interface!"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L2c:
            return
    }

    private java.lang.String getTypeString(java.lang.String r3, java.lang.Class[] r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r3 = 0
        L9:
            int r1 = r4.length
            if (r3 >= r1) goto L1f
            if (r3 == 0) goto L13
            java.lang.String r1 = " & "
            r0.append(r1)
        L13:
            r1 = r4[r3]
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            int r3 = r3 + 1
            goto L9
        L1f:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L24
            boolean r2 = r5 instanceof com.xuexiang.xhttp2.reflect.impl.WildcardTypeImpl
            if (r2 == 0) goto L24
            com.xuexiang.xhttp2.reflect.impl.WildcardTypeImpl r5 = (com.xuexiang.xhttp2.reflect.impl.WildcardTypeImpl) r5
            java.lang.Class[] r2 = r4.upper
            java.lang.Class[] r3 = r5.upper
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L22
            java.lang.Class[] r2 = r4.lower
            java.lang.Class[] r5 = r5.lower
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L22
            goto L23
        L22:
            r0 = r1
        L23:
            return r0
        L24:
            return r1
    }

    @Override // java.lang.reflect.WildcardType
    public java.lang.reflect.Type[] getLowerBounds() {
            r1 = this;
            java.lang.Class[] r0 = r1.lower
            return r0
    }

    @Override // java.lang.reflect.WildcardType
    public java.lang.reflect.Type[] getUpperBounds() {
            r1 = this;
            java.lang.Class[] r0 = r1.upper
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class[] r0 = r2.upper
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 * 31
            java.lang.Class[] r1 = r2.lower
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.Class[] r0 = r3.upper
            int r1 = r0.length
            if (r1 <= 0) goto L16
            r1 = 0
            r1 = r0[r1]
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 != r2) goto Lf
            java.lang.String r0 = "?"
            goto L1e
        Lf:
            java.lang.String r1 = "? extends "
            java.lang.String r0 = r3.getTypeString(r1, r0)
            goto L1e
        L16:
            java.lang.String r0 = "? super "
            java.lang.Class[] r1 = r3.lower
            java.lang.String r0 = r3.getTypeString(r0, r1)
        L1e:
            return r0
    }
}
