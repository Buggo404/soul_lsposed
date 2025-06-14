package androidx.lifecycle;

/* loaded from: classes.dex */
public class MethodCallsLogger {
    private java.util.Map<java.lang.String, java.lang.Integer> mCalledMethods;

    public MethodCallsLogger() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mCalledMethods = r0
            return
    }

    public boolean approveCall(java.lang.String r5, int r6) {
            r4 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r4.mCalledMethods
            java.lang.Object r0 = r0.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 0
            if (r0 == 0) goto L10
            int r0 = r0.intValue()
            goto L11
        L10:
            r0 = r1
        L11:
            r2 = r0 & r6
            r3 = 1
            if (r2 == 0) goto L17
            r1 = r3
        L17:
            java.util.Map<java.lang.String, java.lang.Integer> r2 = r4.mCalledMethods
            r6 = r6 | r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.put(r5, r6)
            r5 = r1 ^ 1
            return r5
    }
}
