package retrofit2;

/* loaded from: classes.dex */
abstract class ServiceMethod<T> {
    ServiceMethod() {
            r0 = this;
            r0.<init>()
            return
    }

    static <T> retrofit2.ServiceMethod<T> parseAnnotations(retrofit2.Retrofit r4, java.lang.reflect.Method r5) {
            retrofit2.RequestFactory r0 = retrofit2.RequestFactory.parseAnnotations(r4, r5)
            java.lang.reflect.Type r1 = r5.getGenericReturnType()
            boolean r2 = retrofit2.Utils.hasUnresolvableType(r1)
            r3 = 0
            if (r2 != 0) goto L21
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L18
            retrofit2.HttpServiceMethod r4 = retrofit2.HttpServiceMethod.parseAnnotations(r4, r5, r0)
            return r4
        L18:
            java.lang.String r4 = "Service methods cannot return void."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.RuntimeException r4 = retrofit2.Utils.methodError(r5, r4, r0)
            throw r4
        L21:
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r1
            java.lang.String r0 = "Method return type must not include a type variable or wildcard: %s"
            java.lang.RuntimeException r4 = retrofit2.Utils.methodError(r5, r0, r4)
            throw r4
    }

    @javax.annotation.Nullable
    abstract T invoke(java.lang.Object[] r1);
}
