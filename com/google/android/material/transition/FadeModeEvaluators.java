package com.google.android.material.transition;

/* loaded from: classes.dex */
class FadeModeEvaluators {
    private static final com.google.android.material.transition.FadeModeEvaluator CROSS = null;

    /* renamed from: IN */
    private static final com.google.android.material.transition.FadeModeEvaluator f115IN = null;
    private static final com.google.android.material.transition.FadeModeEvaluator OUT = null;
    private static final com.google.android.material.transition.FadeModeEvaluator THROUGH = null;





    static {
            com.google.android.material.transition.FadeModeEvaluators$1 r0 = new com.google.android.material.transition.FadeModeEvaluators$1
            r0.<init>()
            com.google.android.material.transition.FadeModeEvaluators.f115IN = r0
            com.google.android.material.transition.FadeModeEvaluators$2 r0 = new com.google.android.material.transition.FadeModeEvaluators$2
            r0.<init>()
            com.google.android.material.transition.FadeModeEvaluators.OUT = r0
            com.google.android.material.transition.FadeModeEvaluators$3 r0 = new com.google.android.material.transition.FadeModeEvaluators$3
            r0.<init>()
            com.google.android.material.transition.FadeModeEvaluators.CROSS = r0
            com.google.android.material.transition.FadeModeEvaluators$4 r0 = new com.google.android.material.transition.FadeModeEvaluators$4
            r0.<init>()
            com.google.android.material.transition.FadeModeEvaluators.THROUGH = r0
            return
    }

    private FadeModeEvaluators() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.android.material.transition.FadeModeEvaluator get(int r2, boolean r3) {
            if (r2 == 0) goto L2e
            r0 = 1
            if (r2 == r0) goto L26
            r3 = 2
            if (r2 == r3) goto L23
            r3 = 3
            if (r2 != r3) goto Le
            com.google.android.material.transition.FadeModeEvaluator r2 = com.google.android.material.transition.FadeModeEvaluators.THROUGH
            return r2
        Le:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid fade mode: "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L23:
            com.google.android.material.transition.FadeModeEvaluator r2 = com.google.android.material.transition.FadeModeEvaluators.CROSS
            return r2
        L26:
            if (r3 == 0) goto L2b
            com.google.android.material.transition.FadeModeEvaluator r2 = com.google.android.material.transition.FadeModeEvaluators.OUT
            goto L2d
        L2b:
            com.google.android.material.transition.FadeModeEvaluator r2 = com.google.android.material.transition.FadeModeEvaluators.f115IN
        L2d:
            return r2
        L2e:
            if (r3 == 0) goto L33
            com.google.android.material.transition.FadeModeEvaluator r2 = com.google.android.material.transition.FadeModeEvaluators.f115IN
            goto L35
        L33:
            com.google.android.material.transition.FadeModeEvaluator r2 = com.google.android.material.transition.FadeModeEvaluators.OUT
        L35:
            return r2
    }
}
