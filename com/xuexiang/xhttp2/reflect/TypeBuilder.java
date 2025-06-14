package com.xuexiang.xhttp2.reflect;

/* loaded from: classes.dex */
public final class TypeBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final java.util.List<java.lang.reflect.Type> args;
    private final com.xuexiang.xhttp2.reflect.TypeBuilder parent;
    private final java.lang.Class raw;

    static {
            return
    }

    private TypeBuilder(java.lang.Class r2, com.xuexiang.xhttp2.reflect.TypeBuilder r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.args = r0
            r1.raw = r2
            r1.parent = r3
            return
    }

    private java.lang.reflect.Type getType() {
            r4 = this;
            java.util.List<java.lang.reflect.Type> r0 = r4.args
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            java.lang.Class r0 = r4.raw
            return r0
        Lb:
            com.xuexiang.xhttp2.reflect.impl.ParameterizedTypeImpl r0 = new com.xuexiang.xhttp2.reflect.impl.ParameterizedTypeImpl
            java.lang.Class r1 = r4.raw
            java.util.List<java.lang.reflect.Type> r2 = r4.args
            int r3 = r2.size()
            java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.reflect.Type[] r2 = (java.lang.reflect.Type[]) r2
            r3 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.xuexiang.xhttp2.reflect.TypeBuilder newInstance(java.lang.Class r2) {
            com.xuexiang.xhttp2.reflect.TypeBuilder r0 = new com.xuexiang.xhttp2.reflect.TypeBuilder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private static com.xuexiang.xhttp2.reflect.TypeBuilder newInstance(java.lang.Class r1, com.xuexiang.xhttp2.reflect.TypeBuilder r2) {
            com.xuexiang.xhttp2.reflect.TypeBuilder r0 = new com.xuexiang.xhttp2.reflect.TypeBuilder
            r0.<init>(r1, r2)
            return r0
    }

    public com.xuexiang.xhttp2.reflect.TypeBuilder addTypeParam(java.lang.Class r1) {
            r0 = this;
            com.xuexiang.xhttp2.reflect.TypeBuilder r1 = r0.addTypeParam(r1)
            return r1
    }

    public com.xuexiang.xhttp2.reflect.TypeBuilder addTypeParam(java.lang.reflect.Type r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.util.List<java.lang.reflect.Type> r0 = r1.args
            r0.add(r2)
            return r1
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "addTypeParam expect not null Type"
            r2.<init>(r0)
            throw r2
    }

    public com.xuexiang.xhttp2.reflect.TypeBuilder addTypeParamExtends(java.lang.Class... r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            com.xuexiang.xhttp2.reflect.impl.WildcardTypeImpl r0 = new com.xuexiang.xhttp2.reflect.impl.WildcardTypeImpl
            r1 = 0
            r0.<init>(r1, r3)
            com.xuexiang.xhttp2.reflect.TypeBuilder r3 = r2.addTypeParam(r0)
            return r3
        Ld:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "addTypeParamExtends() expect not null Class"
            r3.<init>(r0)
            throw r3
    }

    public com.xuexiang.xhttp2.reflect.TypeBuilder addTypeParamSuper(java.lang.Class... r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            com.xuexiang.xhttp2.reflect.impl.WildcardTypeImpl r0 = new com.xuexiang.xhttp2.reflect.impl.WildcardTypeImpl
            r1 = 0
            r0.<init>(r3, r1)
            com.xuexiang.xhttp2.reflect.TypeBuilder r3 = r2.addTypeParam(r0)
            return r3
        Ld:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "addTypeParamSuper() expect not null Class"
            r3.<init>(r0)
            throw r3
    }

    public com.xuexiang.xhttp2.reflect.TypeBuilder beginSubType(java.lang.Class r1) {
            r0 = this;
            com.xuexiang.xhttp2.reflect.TypeBuilder r1 = newInstance(r1, r0)
            return r1
    }

    public java.lang.reflect.Type build() {
            r2 = this;
            com.xuexiang.xhttp2.reflect.TypeBuilder r0 = r2.parent
            if (r0 != 0) goto L9
            java.lang.reflect.Type r0 = r2.getType()
            return r0
        L9:
            com.xuexiang.xhttp2.reflect.TypeException r0 = new com.xuexiang.xhttp2.reflect.TypeException
            java.lang.String r1 = "expect endSubType() before build()"
            r0.<init>(r1)
            throw r0
    }

    public com.xuexiang.xhttp2.reflect.TypeBuilder endSubType() {
            r2 = this;
            com.xuexiang.xhttp2.reflect.TypeBuilder r0 = r2.parent
            if (r0 == 0) goto Le
            java.lang.reflect.Type r1 = r2.getType()
            r0.addTypeParam(r1)
            com.xuexiang.xhttp2.reflect.TypeBuilder r0 = r2.parent
            return r0
        Le:
            com.xuexiang.xhttp2.reflect.TypeException r0 = new com.xuexiang.xhttp2.reflect.TypeException
            java.lang.String r1 = "expect beginSubType() before endSubType()"
            r0.<init>(r1)
            throw r0
    }
}
