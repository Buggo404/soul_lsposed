package androidx.core.content.res;

/* loaded from: classes.dex */
public final class ComplexColorCompat {
    private static final java.lang.String LOG_TAG = "ComplexColorCompat";
    private int mColor;
    private final android.content.res.ColorStateList mColorStateList;
    private final android.graphics.Shader mShader;

    private ComplexColorCompat(android.graphics.Shader r1, android.content.res.ColorStateList r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.mShader = r1
            r0.mColorStateList = r2
            r0.mColor = r3
            return
    }

    private static androidx.core.content.res.ComplexColorCompat createFromXml(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L8:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L13
            r3 = 1
            if (r1 == r3) goto L13
            goto L8
        L13:
            if (r1 != r2) goto L5f
            java.lang.String r1 = r5.getName()
            r1.hashCode()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L56
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L35
            android.content.res.ColorStateList r4 = androidx.core.content.res.ColorStateListInflaterCompat.createFromXmlInner(r4, r5, r0, r6)
            androidx.core.content.res.ComplexColorCompat r4 = from(r4)
            return r4
        L35:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r6 = ": unsupported complex color tag "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L56:
            android.graphics.Shader r4 = androidx.core.content.res.GradientColorInflaterCompat.createFromXmlInner(r4, r5, r0, r6)
            androidx.core.content.res.ComplexColorCompat r4 = from(r4)
            return r4
        L5f:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
    }

    static androidx.core.content.res.ComplexColorCompat from(int r2) {
            androidx.core.content.res.ComplexColorCompat r0 = new androidx.core.content.res.ComplexColorCompat
            r1 = 0
            r0.<init>(r1, r1, r2)
            return r0
    }

    static androidx.core.content.res.ComplexColorCompat from(android.content.res.ColorStateList r3) {
            androidx.core.content.res.ComplexColorCompat r0 = new androidx.core.content.res.ComplexColorCompat
            r1 = 0
            int r2 = r3.getDefaultColor()
            r0.<init>(r1, r3, r2)
            return r0
    }

    static androidx.core.content.res.ComplexColorCompat from(android.graphics.Shader r3) {
            androidx.core.content.res.ComplexColorCompat r0 = new androidx.core.content.res.ComplexColorCompat
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static androidx.core.content.res.ComplexColorCompat inflate(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
            androidx.core.content.res.ComplexColorCompat r0 = createFromXml(r0, r1, r2)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.String r1 = "ComplexColorCompat"
            java.lang.String r2 = "Failed to inflate ComplexColor."
            android.util.Log.e(r1, r2, r0)
            r0 = 0
            return r0
    }

    public int getColor() {
            r1 = this;
            int r0 = r1.mColor
            return r0
    }

    public android.graphics.Shader getShader() {
            r1 = this;
            android.graphics.Shader r0 = r1.mShader
            return r0
    }

    public boolean isGradient() {
            r1 = this;
            android.graphics.Shader r0 = r1.mShader
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isStateful() {
            r1 = this;
            android.graphics.Shader r0 = r1.mShader
            if (r0 != 0) goto L10
            android.content.res.ColorStateList r0 = r1.mColorStateList
            if (r0 == 0) goto L10
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public boolean onStateChanged(int[] r3) {
            r2 = this;
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L18
            android.content.res.ColorStateList r0 = r2.mColorStateList
            int r1 = r0.getDefaultColor()
            int r3 = r0.getColorForState(r3, r1)
            int r0 = r2.mColor
            if (r3 == r0) goto L18
            r2.mColor = r3
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            return r3
    }

    public void setColor(int r1) {
            r0 = this;
            r0.mColor = r1
            return
    }

    public boolean willDraw() {
            r1 = this;
            boolean r0 = r1.isGradient()
            if (r0 != 0) goto Ld
            int r0 = r1.mColor
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }
}
