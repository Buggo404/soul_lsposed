package com.xuexiang.xhttp2.utils;

/* loaded from: classes.dex */
public final class TypeUtils {
    private TypeUtils() {
            r2 = this;
            r2.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "u can't instantiate me..."
            r0.<init>(r1)
            throw r0
    }

    public static <T> java.lang.reflect.Type findNeedClass(java.lang.Class<T> r3) {
            java.lang.reflect.Type r3 = r3.getGenericSuperclass()
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0 = 0
            r1 = r3[r0]
            int r3 = r3.length
            r2 = 1
            if (r3 <= r2) goto L26
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L1e
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r3 = r1.getActualTypeArguments()
            r1 = r3[r0]
            goto L26
        L1e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "没有填写泛型参数"
            r3.<init>(r0)
            throw r3
        L26:
            return r1
    }

    public static <R> java.lang.reflect.Type findNeedType(java.lang.Class<R> r1) {
            java.util.List r1 = getAllTypes(r1)
            if (r1 == 0) goto L15
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            goto L15
        Ld:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            return r1
        L15:
            java.lang.Class<okhttp3.ResponseBody> r1 = okhttp3.ResponseBody.class
            return r1
    }

    public static <T> java.lang.reflect.Type findRawType(java.lang.Class<T> r1) {
            java.lang.reflect.Type r1 = r1.getGenericSuperclass()
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r0 = 0
            java.lang.reflect.Type r1 = getGenericType(r1, r0)
            return r1
    }

    public static <T> java.util.List<java.lang.reflect.Type> getAllTypes(java.lang.Class<T> r5) {
            java.lang.reflect.Type r5 = r5.getGenericSuperclass()
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L2c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            int r1 = r5.length
            r2 = 0
        L15:
            if (r2 >= r1) goto L2d
            r3 = r5[r2]
            r0.add(r3)
            boolean r4 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L29
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            java.util.Collections.addAll(r0, r3)
        L29:
            int r2 = r2 + 1
            goto L15
        L2c:
            r0 = 0
        L2d:
            return r0
    }

    public static java.lang.reflect.Type getApiResultType(java.lang.reflect.Type r1) {
            java.lang.Class<com.xuexiang.xhttp2.model.ApiResult> r0 = com.xuexiang.xhttp2.model.ApiResult.class
            com.xuexiang.xhttp2.reflect.TypeBuilder r0 = com.xuexiang.xhttp2.reflect.TypeBuilder.newInstance(r0)
            com.xuexiang.xhttp2.reflect.TypeBuilder r1 = r0.addTypeParam(r1)
            java.lang.reflect.Type r1 = r1.build()
            return r1
    }

    public static java.lang.Class getClass(java.lang.reflect.Type r1, int r2) {
            boolean r0 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto Lb
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.Class r1 = getGenericClass(r1, r2)
            return r1
        Lb:
            boolean r2 = r1 instanceof java.lang.reflect.TypeVariable
            if (r2 == 0) goto L1d
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.reflect.Type[] r1 = r1.getBounds()
            r2 = 0
            r1 = r1[r2]
            java.lang.Class r1 = getClass(r1, r2)
            return r1
        L1d:
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
    }

    private static java.lang.Class<?>[] getClasses(java.lang.Object... r4) {
            r0 = 0
            if (r4 == 0) goto L17
            int r1 = r4.length
            if (r1 <= 0) goto L17
            int r1 = r4.length
            java.lang.Class[] r1 = new java.lang.Class[r1]
            int r2 = r4.length
        La:
            if (r0 >= r2) goto L19
            r3 = r4[r0]
            java.lang.Class r3 = r3.getClass()
            r1[r0] = r3
            int r0 = r0 + 1
            goto La
        L17:
            java.lang.Class[] r1 = new java.lang.Class[r0]
        L19:
            return r1
    }

    private static java.lang.Class getGenericClass(java.lang.reflect.ParameterizedType r0, int r1) {
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r0 = r0[r1]
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L13
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r0 = r0.getRawType()
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
        L13:
            boolean r1 = r0 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L20
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
        L20:
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L32
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            java.lang.reflect.Type[] r0 = r0.getBounds()
            r1 = 0
            r0 = r0[r1]
            java.lang.Class r0 = getClass(r0, r1)
            return r0
        L32:
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    private static java.lang.reflect.Type getGenericType(java.lang.reflect.ParameterizedType r0, int r1) {
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r0 = r0[r1]
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L11
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r0 = r0.getRawType()
            return r0
        L11:
            boolean r1 = r0 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L1c
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
            return r0
        L1c:
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L2d
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            java.lang.reflect.Type[] r0 = r0.getBounds()
            r1 = 0
            r0 = r0[r1]
            java.lang.Class r0 = getClass(r0, r1)
        L2d:
            return r0
    }

    public static java.lang.reflect.Type getListType(java.lang.reflect.Type r1) {
            java.lang.Class<java.util.List> r0 = java.util.List.class
            com.xuexiang.xhttp2.reflect.TypeBuilder r0 = com.xuexiang.xhttp2.reflect.TypeBuilder.newInstance(r0)
            com.xuexiang.xhttp2.reflect.TypeBuilder r1 = r0.addTypeParam(r1)
            java.lang.reflect.Type r1 = r1.build()
            return r1
    }

    public static java.lang.reflect.Type getParameterizedType(java.lang.reflect.Type r1, int r2) {
            boolean r0 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto Ld
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            r1 = r1[r2]
            return r1
        Ld:
            boolean r2 = r1 instanceof java.lang.reflect.TypeVariable
            if (r2 == 0) goto L1e
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.reflect.Type[] r1 = r1.getBounds()
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Type r1 = getType(r1, r2)
        L1e:
            return r1
    }

    private static java.lang.reflect.Type getType(java.lang.reflect.Type r1, int r2) {
            boolean r0 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto Lb
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type r1 = getGenericType(r1, r2)
            return r1
        Lb:
            boolean r2 = r1 instanceof java.lang.reflect.TypeVariable
            if (r2 == 0) goto L1c
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.reflect.Type[] r1 = r1.getBounds()
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Type r1 = getType(r1, r2)
        L1c:
            return r1
    }

    public static <T> T newInstance(java.lang.Class<T> r1, java.lang.Object... r2) throws java.lang.Exception {
            java.lang.Class[] r0 = getClasses(r2)
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)
            r0 = 1
            r1.setAccessible(r0)
            java.lang.Object r1 = r1.newInstance(r2)
            return r1
    }
}
