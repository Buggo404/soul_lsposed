package retrofit2;

/* loaded from: classes.dex */
public final class Invocation {
    private final java.util.List<?> arguments;
    private final java.lang.reflect.Method method;

    Invocation(java.lang.reflect.Method r1, java.util.List<?> r2) {
            r0 = this;
            r0.<init>()
            r0.method = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            r0.arguments = r1
            return
    }

    /* renamed from: of */
    public static retrofit2.Invocation m125of(java.lang.reflect.Method r2, java.util.List<?> r3) {
            java.lang.String r0 = "method == null"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "arguments == null"
            java.util.Objects.requireNonNull(r3, r0)
            retrofit2.Invocation r0 = new retrofit2.Invocation
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            r0.<init>(r2, r1)
            return r0
    }

    public java.util.List<?> arguments() {
            r1 = this;
            java.util.List<?> r0 = r1.arguments
            return r0
    }

    public java.lang.reflect.Method method() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.method
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.reflect.Method r1 = r3.method
            java.lang.Class r1 = r1.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r2 = 0
            r0[r2] = r1
            java.lang.reflect.Method r1 = r3.method
            java.lang.String r1 = r1.getName()
            r2 = 1
            r0[r2] = r1
            r1 = 2
            java.util.List<?> r2 = r3.arguments
            r0[r1] = r2
            java.lang.String r1 = "%s.%s() %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
