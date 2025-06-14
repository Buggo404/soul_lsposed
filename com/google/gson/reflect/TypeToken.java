package com.google.gson.reflect;

/* loaded from: classes.dex */
public class TypeToken<T> {
    private final int hashCode;
    private final java.lang.Class<? super T> rawType;
    private final java.lang.reflect.Type type;

    protected TypeToken() {
            r2 = this;
            r2.<init>()
            java.lang.reflect.Type r0 = r2.getTypeTokenTypeArgument()
            r2.type = r0
            java.lang.Class r1 = com.google.gson.internal.C$Gson$Types.getRawType(r0)
            r2.rawType = r1
            int r0 = r0.hashCode()
            r2.hashCode = r0
            return
    }

    private TypeToken(java.lang.reflect.Type r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = com.google.gson.internal.C$Gson$Preconditions.checkNotNull(r2)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.reflect.Type r2 = com.google.gson.internal.C$Gson$Types.canonicalize(r2)
            r1.type = r2
            java.lang.Class r0 = com.google.gson.internal.C$Gson$Types.getRawType(r2)
            r1.rawType = r0
            int r2 = r2.hashCode()
            r1.hashCode = r2
            return
    }

    private static java.lang.AssertionError buildUnexpectedTypeError(java.lang.reflect.Type r5, java.lang.Class<?>... r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected type. Expected one of: "
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L1d
            r3 = r6[r2]
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r4 = ", "
            r3.append(r4)
            int r2 = r2 + 1
            goto L9
        L1d:
            java.lang.String r6 = "but got: "
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r1 = ", for type token: "
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r5 = r6.append(r5)
            r6 = 46
            r5.append(r6)
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            return r5
    }

    public static <T> com.google.gson.reflect.TypeToken<T> get(java.lang.Class<T> r1) {
            com.google.gson.reflect.TypeToken r0 = new com.google.gson.reflect.TypeToken
            r0.<init>(r1)
            return r0
    }

    public static com.google.gson.reflect.TypeToken<?> get(java.lang.reflect.Type r1) {
            com.google.gson.reflect.TypeToken r0 = new com.google.gson.reflect.TypeToken
            r0.<init>(r1)
            return r0
    }

    public static com.google.gson.reflect.TypeToken<?> getArray(java.lang.reflect.Type r1) {
            com.google.gson.reflect.TypeToken r0 = new com.google.gson.reflect.TypeToken
            java.lang.reflect.GenericArrayType r1 = com.google.gson.internal.C$Gson$Types.arrayOf(r1)
            r0.<init>(r1)
            return r0
    }

    public static com.google.gson.reflect.TypeToken<?> getParameterized(java.lang.reflect.Type r2, java.lang.reflect.Type... r3) {
            com.google.gson.reflect.TypeToken r0 = new com.google.gson.reflect.TypeToken
            r1 = 0
            java.lang.reflect.ParameterizedType r2 = com.google.gson.internal.C$Gson$Types.newParameterizedTypeWithOwner(r1, r2, r3)
            r0.<init>(r2)
            return r0
    }

    private java.lang.reflect.Type getTypeTokenTypeArgument() {
            r3 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            java.lang.Class<com.google.gson.reflect.TypeToken> r2 = com.google.gson.reflect.TypeToken.class
            if (r1 == 0) goto L22
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r1 = r0.getRawType()
            if (r1 != r2) goto L2c
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.canonicalize(r0)
            return r0
        L22:
            if (r0 != r2) goto L2c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved."
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must only create direct subclasses of TypeToken"
            r0.<init>(r1)
            throw r0
    }

    private static boolean isAssignableFrom(java.lang.reflect.Type r1, java.lang.reflect.GenericArrayType r2) {
            java.lang.reflect.Type r2 = r2.getGenericComponentType()
            boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L30
            boolean r0 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L13
            java.lang.reflect.GenericArrayType r1 = (java.lang.reflect.GenericArrayType) r1
            java.lang.reflect.Type r1 = r1.getGenericComponentType()
            goto L24
        L13:
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L24
            java.lang.Class r1 = (java.lang.Class) r1
        L19:
            boolean r0 = r1.isArray()
            if (r0 == 0) goto L24
            java.lang.Class r1 = r1.getComponentType()
            goto L19
        L24:
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = isAssignableFrom(r1, r2, r0)
            return r1
        L30:
            r1 = 1
            return r1
    }

    private static boolean isAssignableFrom(java.lang.reflect.Type r9, java.lang.reflect.ParameterizedType r10, java.util.Map<java.lang.String, java.lang.reflect.Type> r11) {
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            boolean r1 = r10.equals(r9)
            r2 = 1
            if (r1 == 0) goto Lc
            return r2
        Lc:
            java.lang.Class r1 = com.google.gson.internal.C$Gson$Types.getRawType(r9)
            boolean r3 = r9 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L17
            java.lang.reflect.ParameterizedType r9 = (java.lang.reflect.ParameterizedType) r9
            goto L18
        L17:
            r9 = 0
        L18:
            if (r9 == 0) goto L4c
            java.lang.reflect.Type[] r3 = r9.getActualTypeArguments()
            java.lang.reflect.TypeVariable[] r4 = r1.getTypeParameters()
            r5 = r0
        L23:
            int r6 = r3.length
            if (r5 >= r6) goto L45
            r6 = r3[r5]
            r7 = r4[r5]
        L2a:
            boolean r8 = r6 instanceof java.lang.reflect.TypeVariable
            if (r8 == 0) goto L3b
            java.lang.reflect.TypeVariable r6 = (java.lang.reflect.TypeVariable) r6
            java.lang.String r6 = r6.getName()
            java.lang.Object r6 = r11.get(r6)
            java.lang.reflect.Type r6 = (java.lang.reflect.Type) r6
            goto L2a
        L3b:
            java.lang.String r7 = r7.getName()
            r11.put(r7, r6)
            int r5 = r5 + 1
            goto L23
        L45:
            boolean r9 = typeEquals(r9, r10, r11)
            if (r9 == 0) goto L4c
            return r2
        L4c:
            java.lang.reflect.Type[] r9 = r1.getGenericInterfaces()
            int r3 = r9.length
        L51:
            if (r0 >= r3) goto L64
            r4 = r9[r0]
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>(r11)
            boolean r4 = isAssignableFrom(r4, r10, r5)
            if (r4 == 0) goto L61
            return r2
        L61:
            int r0 = r0 + 1
            goto L51
        L64:
            java.lang.reflect.Type r9 = r1.getGenericSuperclass()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r11)
            boolean r9 = isAssignableFrom(r9, r10, r0)
            return r9
    }

    private static boolean matches(java.lang.reflect.Type r1, java.lang.reflect.Type r2, java.util.Map<java.lang.String, java.lang.reflect.Type> r3) {
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L1d
            boolean r0 = r1 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L1b
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.String r1 = r1.getName()
            java.lang.Object r1 = r3.get(r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1b
            goto L1d
        L1b:
            r1 = 0
            goto L1e
        L1d:
            r1 = 1
        L1e:
            return r1
    }

    private static boolean typeEquals(java.lang.reflect.ParameterizedType r4, java.lang.reflect.ParameterizedType r5, java.util.Map<java.lang.String, java.lang.reflect.Type> r6) {
            java.lang.reflect.Type r0 = r4.getRawType()
            java.lang.reflect.Type r1 = r5.getRawType()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L2b
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            r0 = r1
        L18:
            int r2 = r4.length
            if (r0 >= r2) goto L29
            r2 = r4[r0]
            r3 = r5[r0]
            boolean r2 = matches(r2, r3, r6)
            if (r2 != 0) goto L26
            return r1
        L26:
            int r0 = r0 + 1
            goto L18
        L29:
            r4 = 1
            return r4
        L2b:
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.gson.reflect.TypeToken
            if (r0 == 0) goto L12
            java.lang.reflect.Type r0 = r1.type
            com.google.gson.reflect.TypeToken r2 = (com.google.gson.reflect.TypeToken) r2
            java.lang.reflect.Type r2 = r2.type
            boolean r2 = com.google.gson.internal.C$Gson$Types.equals(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public final java.lang.Class<? super T> getRawType() {
            r1 = this;
            java.lang.Class<? super T> r0 = r1.rawType
            return r0
    }

    public final java.lang.reflect.Type getType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.hashCode
            return r0
    }

    @java.lang.Deprecated
    public boolean isAssignableFrom(com.google.gson.reflect.TypeToken<?> r1) {
            r0 = this;
            java.lang.reflect.Type r1 = r1.getType()
            boolean r1 = r0.isAssignableFrom(r1)
            return r1
    }

    @java.lang.Deprecated
    public boolean isAssignableFrom(java.lang.Class<?> r1) {
            r0 = this;
            boolean r1 = r0.isAssignableFrom(r1)
            return r1
    }

    @java.lang.Deprecated
    public boolean isAssignableFrom(java.lang.reflect.Type r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Type r1 = r4.type
            boolean r1 = r1.equals(r5)
            r2 = 1
            if (r1 == 0) goto Le
            return r2
        Le:
            java.lang.reflect.Type r1 = r4.type
            boolean r3 = r1 instanceof java.lang.Class
            if (r3 == 0) goto L1f
            java.lang.Class<? super T> r0 = r4.rawType
            java.lang.Class r5 = com.google.gson.internal.C$Gson$Types.getRawType(r5)
            boolean r5 = r0.isAssignableFrom(r5)
            return r5
        L1f:
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L2f
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r5 = isAssignableFrom(r5, r1, r0)
            return r5
        L2f:
            boolean r3 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r3 == 0) goto L4b
            java.lang.Class<? super T> r1 = r4.rawType
            java.lang.Class r3 = com.google.gson.internal.C$Gson$Types.getRawType(r5)
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L4a
            java.lang.reflect.Type r1 = r4.type
            java.lang.reflect.GenericArrayType r1 = (java.lang.reflect.GenericArrayType) r1
            boolean r5 = isAssignableFrom(r5, r1)
            if (r5 == 0) goto L4a
            r0 = r2
        L4a:
            return r0
        L4b:
            r5 = 3
            java.lang.Class[] r5 = new java.lang.Class[r5]
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            r5[r0] = r3
            java.lang.Class<java.lang.reflect.ParameterizedType> r0 = java.lang.reflect.ParameterizedType.class
            r5[r2] = r0
            r0 = 2
            java.lang.Class<java.lang.reflect.GenericArrayType> r2 = java.lang.reflect.GenericArrayType.class
            r5[r0] = r2
            java.lang.AssertionError r5 = buildUnexpectedTypeError(r1, r5)
            throw r5
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            java.lang.String r0 = com.google.gson.internal.C$Gson$Types.typeToString(r0)
            return r0
    }
}
