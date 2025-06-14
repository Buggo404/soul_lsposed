package com.xuexiang.xhttp2.reflect.impl;

/* loaded from: classes.dex */
public class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType {
    private final java.lang.reflect.Type[] args;
    private final java.lang.reflect.Type owner;
    private final java.lang.Class raw;

    public ParameterizedTypeImpl(java.lang.Class r1, java.lang.reflect.Type[] r2, java.lang.reflect.Type r3) {
            r0 = this;
            r0.<init>()
            r0.raw = r1
            if (r2 == 0) goto L8
            goto Lb
        L8:
            r1 = 0
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r1]
        Lb:
            r0.args = r2
            r0.owner = r3
            r0.checkArgs()
            return
    }

    private void checkArgs() {
            r4 = this;
            java.lang.Class r0 = r4.raw
            if (r0 == 0) goto L44
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            java.lang.reflect.Type[] r1 = r4.args
            int r2 = r1.length
            if (r2 == 0) goto L43
            int r2 = r0.length
            int r1 = r1.length
            if (r2 != r1) goto L12
            goto L43
        L12:
            com.xuexiang.xhttp2.reflect.TypeException r1 = new com.xuexiang.xhttp2.reflect.TypeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r4.raw
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " expect "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " arg(s), got "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.reflect.Type[] r2 = r4.args
            int r2 = r2.length
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L43:
            return
        L44:
            com.xuexiang.xhttp2.reflect.TypeException r0 = new com.xuexiang.xhttp2.reflect.TypeException
            java.lang.String r1 = "raw class can't be null"
            r0.<init>(r1)
            throw r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L32
            boolean r2 = r5 instanceof com.xuexiang.xhttp2.reflect.impl.ParameterizedTypeImpl
            if (r2 == 0) goto L32
            com.xuexiang.xhttp2.reflect.impl.ParameterizedTypeImpl r5 = (com.xuexiang.xhttp2.reflect.impl.ParameterizedTypeImpl) r5
            java.lang.Class r2 = r4.raw
            java.lang.Class r3 = r5.raw
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L19
        L17:
            r0 = r1
            goto L31
        L19:
            java.lang.reflect.Type[] r2 = r4.args
            java.lang.reflect.Type[] r3 = r5.args
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L24
            goto L17
        L24:
            java.lang.reflect.Type r2 = r4.owner
            java.lang.reflect.Type r5 = r5.owner
            if (r2 == 0) goto L2f
            boolean r0 = r2.equals(r5)
            goto L31
        L2f:
            if (r5 != 0) goto L17
        L31:
            return r0
        L32:
            return r1
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type[] getActualTypeArguments() {
            r1 = this;
            java.lang.reflect.Type[] r0 = r1.args
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getOwnerType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.owner
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getRawType() {
            r1 = this;
            java.lang.Class r0 = r1.raw
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.raw
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Type[] r1 = r2.args
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.reflect.Type r1 = r2.owner
            if (r1 == 0) goto L1a
            int r1 = r1.hashCode()
            goto L1b
        L1a:
            r1 = 0
        L1b:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.raw
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.reflect.Type[] r1 = r6.args
            int r1 = r1.length
            if (r1 == 0) goto L6c
            r1 = 60
            r0.append(r1)
            r1 = 0
            r2 = r1
        L1a:
            java.lang.reflect.Type[] r3 = r6.args
            int r3 = r3.length
            if (r2 >= r3) goto L67
            if (r2 == 0) goto L26
            java.lang.String r3 = ", "
            r0.append(r3)
        L26:
            java.lang.reflect.Type[] r3 = r6.args
            r3 = r3[r2]
            boolean r4 = r3 instanceof java.lang.Class
            if (r4 != 0) goto L36
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            goto L64
        L36:
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r4 = r3.isArray()
            if (r4 != 0) goto L46
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            goto L64
        L46:
            r4 = r1
        L47:
            int r4 = r4 + 1
            java.lang.Class r3 = r3.getComponentType()
            boolean r5 = r3.isArray()
            if (r5 != 0) goto L47
            java.lang.String r3 = r3.getName()
            r0.append(r3)
        L5a:
            if (r4 <= 0) goto L64
            java.lang.String r3 = "[]"
            r0.append(r3)
            int r4 = r4 + (-1)
            goto L5a
        L64:
            int r2 = r2 + 1
            goto L1a
        L67:
            r1 = 62
            r0.append(r1)
        L6c:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
