package com.google.android.material.slider;

/* loaded from: classes.dex */
public final class BasicLabelFormatter implements com.google.android.material.slider.LabelFormatter {
    private static final int BILLION = 1000000000;
    private static final int MILLION = 1000000;
    private static final int THOUSAND = 1000;
    private static final long TRILLION = 1000000000000L;

    public BasicLabelFormatter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.material.slider.LabelFormatter
    public java.lang.String getFormattedValue(float r5) {
            r4 = this;
            r0 = 1399379109(0x5368d4a5, float:1.0E12)
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 < 0) goto L1b
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r3]
            float r5 = r5 / r0
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r3[r2] = r5
            java.lang.String r5 = "%.1fT"
            java.lang.String r5 = java.lang.String.format(r1, r5, r3)
            return r5
        L1b:
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 < 0) goto L34
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r3]
            float r5 = r5 / r0
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r3[r2] = r5
            java.lang.String r5 = "%.1fB"
            java.lang.String r5 = java.lang.String.format(r1, r5, r3)
            return r5
        L34:
            r0 = 1232348160(0x49742400, float:1000000.0)
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 < 0) goto L4d
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r3]
            float r5 = r5 / r0
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r3[r2] = r5
            java.lang.String r5 = "%.1fM"
            java.lang.String r5 = java.lang.String.format(r1, r5, r3)
            return r5
        L4d:
            r0 = 1148846080(0x447a0000, float:1000.0)
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 < 0) goto L65
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r3]
            float r5 = r5 / r0
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r3[r2] = r5
            java.lang.String r5 = "%.1fK"
            java.lang.String r5 = java.lang.String.format(r1, r5, r3)
            return r5
        L65:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r1[r2] = r5
            java.lang.String r5 = "%.0f"
            java.lang.String r5 = java.lang.String.format(r0, r5, r1)
            return r5
    }
}
