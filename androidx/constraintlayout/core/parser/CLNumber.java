package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLNumber extends androidx.constraintlayout.core.parser.CLElement {
    float value;

    public CLNumber(float r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.value = r2
            return
    }

    public CLNumber(char[] r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.value = r1
            return
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] r1) {
            androidx.constraintlayout.core.parser.CLNumber r0 = new androidx.constraintlayout.core.parser.CLNumber
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public float getFloat() {
            r1 = this;
            float r0 = r1.value
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = r1.content()
            float r0 = java.lang.Float.parseFloat(r0)
            r1.value = r0
        L12:
            float r0 = r1.value
            return r0
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int getInt() {
            r1 = this;
            float r0 = r1.value
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L13
            java.lang.String r0 = r1.content()
            int r0 = java.lang.Integer.parseInt(r0)
            float r0 = (float) r0
            r1.value = r0
        L13:
            float r0 = r1.value
            int r0 = (int) r0
            return r0
    }

    public boolean isInt() {
            r2 = this;
            float r0 = r2.getFloat()
            int r1 = (int) r0
            float r1 = (float) r1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void putValue(float r1) {
            r0 = this;
            r0.value = r1
            return
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toFormattedJSON(int r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r2.addIndent(r4, r3)
            float r3 = r2.getFloat()
            int r0 = (int) r3
            float r1 = (float) r0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L16
            r4.append(r0)
            goto L19
        L16:
            r4.append(r3)
        L19:
            java.lang.String r3 = r4.toString()
            return r3
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toJSON() {
            r4 = this;
            float r0 = r4.getFloat()
            int r1 = (int) r0
            float r2 = (float) r1
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            java.lang.String r3 = ""
            if (r2 != 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
