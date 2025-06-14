package com.google.android.material.timepicker;

/* loaded from: classes.dex */
class MaxInputValidator implements android.text.InputFilter {
    private int max;

    public MaxInputValidator(int r1) {
            r0 = this;
            r0.<init>()
            r0.max = r1
            return
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence r2, int r3, int r4, android.text.Spanned r5, int r6, int r7) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L1e
            r0.<init>(r5)     // Catch: java.lang.NumberFormatException -> L1e
            java.lang.CharSequence r2 = r2.subSequence(r3, r4)     // Catch: java.lang.NumberFormatException -> L1e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.NumberFormatException -> L1e
            r0.replace(r6, r7, r2)     // Catch: java.lang.NumberFormatException -> L1e
            java.lang.String r2 = r0.toString()     // Catch: java.lang.NumberFormatException -> L1e
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L1e
            int r3 = r1.max     // Catch: java.lang.NumberFormatException -> L1e
            if (r2 > r3) goto L1e
            r2 = 0
            return r2
        L1e:
            java.lang.String r2 = ""
            return r2
    }

    public int getMax() {
            r1 = this;
            int r0 = r1.max
            return r0
    }

    public void setMax(int r1) {
            r0 = this;
            r0.max = r1
            return
    }
}
