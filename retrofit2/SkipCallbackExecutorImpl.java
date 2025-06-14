package retrofit2;

/* loaded from: classes.dex */
final class SkipCallbackExecutorImpl implements retrofit2.SkipCallbackExecutor {
    private static final retrofit2.SkipCallbackExecutor INSTANCE = null;

    static {
            retrofit2.SkipCallbackExecutorImpl r0 = new retrofit2.SkipCallbackExecutorImpl
            r0.<init>()
            retrofit2.SkipCallbackExecutorImpl.INSTANCE = r0
            return
    }

    SkipCallbackExecutorImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.annotation.Annotation[] ensurePresent(java.lang.annotation.Annotation[] r4) {
            java.lang.Class<retrofit2.SkipCallbackExecutor> r0 = retrofit2.SkipCallbackExecutor.class
            boolean r0 = retrofit2.Utils.isAnnotationPresent(r4, r0)
            if (r0 == 0) goto L9
            return r4
        L9:
            int r0 = r4.length
            r1 = 1
            int r0 = r0 + r1
            java.lang.annotation.Annotation[] r0 = new java.lang.annotation.Annotation[r0]
            retrofit2.SkipCallbackExecutor r2 = retrofit2.SkipCallbackExecutorImpl.INSTANCE
            r3 = 0
            r0[r3] = r2
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r3, r0, r1, r2)
            return r0
    }

    @Override // java.lang.annotation.Annotation
    public java.lang.Class<? extends java.lang.annotation.Annotation> annotationType() {
            r1 = this;
            java.lang.Class<retrofit2.SkipCallbackExecutor> r0 = retrofit2.SkipCallbackExecutor.class
            return r0
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof retrofit2.SkipCallbackExecutor
            return r1
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.lang.annotation.Annotation
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "@"
            r0.<init>(r1)
            java.lang.Class<retrofit2.SkipCallbackExecutor> r1 = retrofit2.SkipCallbackExecutor.class
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "()"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
