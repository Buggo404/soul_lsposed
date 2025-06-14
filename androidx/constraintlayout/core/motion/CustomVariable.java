package androidx.constraintlayout.core.motion;

/* loaded from: classes.dex */
public class CustomVariable {
    private static final java.lang.String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private float mFloatValue;
    private int mIntegerValue;
    java.lang.String mName;
    private java.lang.String mStringValue;
    private int mType;

    public CustomVariable(androidx.constraintlayout.core.motion.CustomVariable r2) {
            r1 = this;
            r1.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.mIntegerValue = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mFloatValue = r0
            r0 = 0
            r1.mStringValue = r0
            java.lang.String r0 = r2.mName
            r1.mName = r0
            int r0 = r2.mType
            r1.mType = r0
            int r0 = r2.mIntegerValue
            r1.mIntegerValue = r0
            float r0 = r2.mFloatValue
            r1.mFloatValue = r0
            java.lang.String r0 = r2.mStringValue
            r1.mStringValue = r0
            boolean r2 = r2.mBooleanValue
            r1.mBooleanValue = r2
            return
    }

    public CustomVariable(androidx.constraintlayout.core.motion.CustomVariable r2, java.lang.Object r3) {
            r1 = this;
            r1.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.mIntegerValue = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mFloatValue = r0
            r0 = 0
            r1.mStringValue = r0
            java.lang.String r0 = r2.mName
            r1.mName = r0
            int r2 = r2.mType
            r1.mType = r2
            r1.setValue(r3)
            return
    }

    public CustomVariable(java.lang.String r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.mIntegerValue = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mFloatValue = r0
            r0 = 0
            r1.mStringValue = r0
            r1.mName = r2
            r1.mType = r3
            return
    }

    public CustomVariable(java.lang.String r2, int r3, float r4) {
            r1 = this;
            r1.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.mIntegerValue = r0
            r0 = 0
            r1.mStringValue = r0
            r1.mName = r2
            r1.mType = r3
            r1.mFloatValue = r4
            return
    }

    public CustomVariable(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.mIntegerValue = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mFloatValue = r0
            r0 = 0
            r1.mStringValue = r0
            r1.mName = r2
            r1.mType = r3
            r2 = 901(0x385, float:1.263E-42)
            if (r3 != r2) goto L1a
            float r2 = (float) r4
            r1.mFloatValue = r2
            goto L1c
        L1a:
            r1.mIntegerValue = r4
        L1c:
            return
    }

    public CustomVariable(java.lang.String r2, int r3, java.lang.Object r4) {
            r1 = this;
            r1.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.mIntegerValue = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mFloatValue = r0
            r0 = 0
            r1.mStringValue = r0
            r1.mName = r2
            r1.mType = r3
            r1.setValue(r4)
            return
    }

    public CustomVariable(java.lang.String r2, int r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.mIntegerValue = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mFloatValue = r0
            r1.mName = r2
            r1.mType = r3
            r1.mStringValue = r4
            return
    }

    public CustomVariable(java.lang.String r2, int r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.mIntegerValue = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mFloatValue = r0
            r0 = 0
            r1.mStringValue = r0
            r1.mName = r2
            r1.mType = r3
            r1.mBooleanValue = r4
            return
    }

    private static int clamp(int r1) {
            int r0 = r1 >> 31
            int r0 = ~r0
            r1 = r1 & r0
            int r1 = r1 + (-255)
            int r0 = r1 >> 31
            r1 = r1 & r0
            int r1 = r1 + 255
            return r1
    }

    public static java.lang.String colorString(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "00000000"
            r0.<init>(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "#"
            r0.<init>(r1)
            int r1 = r2.length()
            int r1 = r1 + (-8)
            java.lang.String r2 = r2.substring(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static int hsvToRgb(float r5, float r6, float r7) {
            r0 = 1086324736(0x40c00000, float:6.0)
            float r5 = r5 * r0
            int r0 = (int) r5
            float r1 = (float) r0
            float r5 = r5 - r1
            r1 = 1132396544(0x437f0000, float:255.0)
            float r7 = r7 * r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r1 - r6
            float r2 = r2 * r7
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            float r4 = r5 * r6
            float r4 = r1 - r4
            float r4 = r4 * r7
            float r4 = r4 + r3
            int r4 = (int) r4
            float r5 = r1 - r5
            float r5 = r5 * r6
            float r1 = r1 - r5
            float r1 = r1 * r7
            float r1 = r1 + r3
            int r5 = (int) r1
            float r7 = r7 + r3
            int r6 = (int) r7
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r0 == 0) goto L60
            r1 = 1
            if (r0 == r1) goto L58
            r1 = 2
            if (r0 == r1) goto L4f
            r1 = 3
            if (r0 == r1) goto L47
            r1 = 4
            if (r0 == r1) goto L3f
            r5 = 5
            if (r0 == r5) goto L37
            r5 = 0
            return r5
        L37:
            int r5 = r6 << 16
            int r6 = r2 << 8
            int r5 = r5 + r6
            int r5 = r5 + r4
            r5 = r5 | r7
            return r5
        L3f:
            int r5 = r5 << 16
            int r0 = r2 << 8
            int r5 = r5 + r0
            int r5 = r5 + r6
            r5 = r5 | r7
            return r5
        L47:
            int r5 = r2 << 16
            int r0 = r4 << 8
            int r5 = r5 + r0
            int r5 = r5 + r6
            r5 = r5 | r7
            return r5
        L4f:
            int r0 = r2 << 16
            int r6 = r6 << 8
            int r0 = r0 + r6
            int r0 = r0 + r5
            r5 = r0 | r7
            return r5
        L58:
            int r5 = r4 << 16
            int r6 = r6 << 8
            int r5 = r5 + r6
            int r5 = r5 + r2
            r5 = r5 | r7
            return r5
        L60:
            int r6 = r6 << 16
            int r5 = r5 << 8
            int r6 = r6 + r5
            int r6 = r6 + r2
            r5 = r6 | r7
            return r5
    }

    public static int rgbaTocColor(float r1, float r2, float r3, float r4) {
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            int r1 = clamp(r1)
            float r2 = r2 * r0
            int r2 = (int) r2
            int r2 = clamp(r2)
            float r3 = r3 * r0
            int r3 = (int) r3
            int r3 = clamp(r3)
            float r4 = r4 * r0
            int r4 = (int) r4
            int r4 = clamp(r4)
            int r4 = r4 << 24
            int r1 = r1 << 16
            r1 = r1 | r4
            int r2 = r2 << 8
            r1 = r1 | r2
            r1 = r1 | r3
            return r1
    }

    public void applyToWidget(androidx.constraintlayout.core.motion.MotionWidget r4) {
            r3 = this;
            int r0 = r3.mType
            switch(r0) {
                case 900: goto L1e;
                case 901: goto L16;
                case 902: goto L1e;
                case 903: goto Le;
                case 904: goto L6;
                case 905: goto L16;
                case 906: goto L1e;
                default: goto L5;
            }
        L5:
            goto L25
        L6:
            java.lang.String r1 = r3.mName
            boolean r2 = r3.mBooleanValue
            r4.setCustomAttribute(r1, r0, r2)
            goto L25
        Le:
            java.lang.String r1 = r3.mName
            java.lang.String r2 = r3.mStringValue
            r4.setCustomAttribute(r1, r0, r2)
            goto L25
        L16:
            java.lang.String r1 = r3.mName
            float r2 = r3.mFloatValue
            r4.setCustomAttribute(r1, r0, r2)
            goto L25
        L1e:
            java.lang.String r1 = r3.mName
            int r2 = r3.mIntegerValue
            r4.setCustomAttribute(r1, r0, r2)
        L25:
            return
    }

    public androidx.constraintlayout.core.motion.CustomVariable copy() {
            r1 = this;
            androidx.constraintlayout.core.motion.CustomVariable r0 = new androidx.constraintlayout.core.motion.CustomVariable
            r0.<init>(r1)
            return r0
    }

    public boolean diff(androidx.constraintlayout.core.motion.CustomVariable r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L42
            int r1 = r3.mType
            int r2 = r4.mType
            if (r1 == r2) goto La
            goto L42
        La:
            r2 = 1
            switch(r1) {
                case 900: goto L3b;
                case 901: goto L31;
                case 902: goto L29;
                case 903: goto L21;
                case 904: goto L19;
                case 905: goto Lf;
                case 906: goto L3b;
                default: goto Le;
            }
        Le:
            return r0
        Lf:
            float r1 = r3.mFloatValue
            float r4 = r4.mFloatValue
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L18
            r0 = r2
        L18:
            return r0
        L19:
            boolean r1 = r3.mBooleanValue
            boolean r4 = r4.mBooleanValue
            if (r1 != r4) goto L20
            r0 = r2
        L20:
            return r0
        L21:
            int r1 = r3.mIntegerValue
            int r4 = r4.mIntegerValue
            if (r1 != r4) goto L28
            r0 = r2
        L28:
            return r0
        L29:
            int r1 = r3.mIntegerValue
            int r4 = r4.mIntegerValue
            if (r1 != r4) goto L30
            r0 = r2
        L30:
            return r0
        L31:
            float r1 = r3.mFloatValue
            float r4 = r4.mFloatValue
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L3a
            r0 = r2
        L3a:
            return r0
        L3b:
            int r1 = r3.mIntegerValue
            int r4 = r4.mIntegerValue
            if (r1 != r4) goto L42
            r0 = r2
        L42:
            return r0
    }

    public boolean getBooleanValue() {
            r1 = this;
            boolean r0 = r1.mBooleanValue
            return r0
    }

    public int getColorValue() {
            r1 = this;
            int r0 = r1.mIntegerValue
            return r0
    }

    public float getFloatValue() {
            r1 = this;
            float r0 = r1.mFloatValue
            return r0
    }

    public int getIntegerValue() {
            r1 = this;
            int r0 = r1.mIntegerValue
            return r0
    }

    public int getInterpolatedColor(float[] r8) {
            r7 = this;
            r0 = 0
            r0 = r8[r0]
            double r0 = (double) r0
            r2 = 4601859982876761367(0x3fdd1745d1745d17, double:0.45454545454545453)
            double r0 = java.lang.Math.pow(r0, r2)
            float r0 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            int r0 = clamp(r0)
            r4 = 1
            r4 = r8[r4]
            double r4 = (double) r4
            double r4 = java.lang.Math.pow(r4, r2)
            float r4 = (float) r4
            float r4 = r4 * r1
            int r4 = (int) r4
            int r4 = clamp(r4)
            r5 = 2
            r5 = r8[r5]
            double r5 = (double) r5
            double r2 = java.lang.Math.pow(r5, r2)
            float r2 = (float) r2
            float r2 = r2 * r1
            int r2 = (int) r2
            int r2 = clamp(r2)
            r3 = 3
            r8 = r8[r3]
            float r8 = r8 * r1
            int r8 = (int) r8
            int r8 = clamp(r8)
            int r8 = r8 << 24
            int r0 = r0 << 16
            r8 = r8 | r0
            int r0 = r4 << 8
            r8 = r8 | r0
            r8 = r8 | r2
            return r8
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    public java.lang.String getStringValue() {
            r1 = this;
            java.lang.String r0 = r1.mStringValue
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.mType
            return r0
    }

    public float getValueToInterpolate() {
            r2 = this;
            int r0 = r2.mType
            switch(r0) {
                case 900: goto L27;
                case 901: goto L24;
                case 902: goto L1c;
                case 903: goto L14;
                case 904: goto Lb;
                case 905: goto L8;
                default: goto L5;
            }
        L5:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        L8:
            float r0 = r2.mFloatValue
            return r0
        Lb:
            boolean r0 = r2.mBooleanValue
            if (r0 == 0) goto L12
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
        L14:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot interpolate String"
            r0.<init>(r1)
            throw r0
        L1c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Color does not have a single color to interpolate"
            r0.<init>(r1)
            throw r0
        L24:
            float r0 = r2.mFloatValue
            return r0
        L27:
            int r0 = r2.mIntegerValue
            float r0 = (float) r0
            return r0
    }

    public void getValuesToInterpolate(float[] r11) {
            r10 = this;
            int r0 = r10.mType
            r1 = 0
            switch(r0) {
                case 900: goto L61;
                case 901: goto L5c;
                case 902: goto L1f;
                case 903: goto L17;
                case 904: goto Lc;
                case 905: goto L7;
                default: goto L6;
            }
        L6:
            goto L66
        L7:
            float r0 = r10.mFloatValue
            r11[r1] = r0
            goto L66
        Lc:
            boolean r0 = r10.mBooleanValue
            if (r0 == 0) goto L13
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L14
        L13:
            r0 = 0
        L14:
            r11[r1] = r0
            goto L66
        L17:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot interpolate String"
            r11.<init>(r0)
            throw r11
        L1f:
            int r0 = r10.mIntegerValue
            int r2 = r0 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r0 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r0 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            r5 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r5
            double r6 = (double) r3
            r8 = 4612136378390124954(0x400199999999999a, double:2.2)
            double r6 = java.lang.Math.pow(r6, r8)
            float r3 = (float) r6
            float r4 = (float) r4
            float r4 = r4 / r5
            double r6 = (double) r4
            double r6 = java.lang.Math.pow(r6, r8)
            float r4 = (float) r6
            float r0 = (float) r0
            float r0 = r0 / r5
            double r6 = (double) r0
            double r6 = java.lang.Math.pow(r6, r8)
            float r0 = (float) r6
            r11[r1] = r3
            r1 = 1
            r11[r1] = r4
            r1 = 2
            r11[r1] = r0
            float r0 = (float) r2
            float r0 = r0 / r5
            r1 = 3
            r11[r1] = r0
            goto L66
        L5c:
            float r0 = r10.mFloatValue
            r11[r1] = r0
            goto L66
        L61:
            int r0 = r10.mIntegerValue
            float r0 = (float) r0
            r11[r1] = r0
        L66:
            return
    }

    public boolean isContinuous() {
            r2 = this;
            int r0 = r2.mType
            r1 = 903(0x387, float:1.265E-42)
            if (r0 == r1) goto L10
            r1 = 904(0x388, float:1.267E-42)
            if (r0 == r1) goto L10
            r1 = 906(0x38a, float:1.27E-42)
            if (r0 == r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public int numberOfInterpolatedValues() {
            r2 = this;
            int r0 = r2.mType
            r1 = 902(0x386, float:1.264E-42)
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 4
            return r0
    }

    public void setBooleanValue(boolean r1) {
            r0 = this;
            r0.mBooleanValue = r1
            return
    }

    public void setFloatValue(float r1) {
            r0 = this;
            r0.mFloatValue = r1
            return
    }

    public void setIntValue(int r1) {
            r0 = this;
            r0.mIntegerValue = r1
            return
    }

    public void setInterpolatedValue(androidx.constraintlayout.core.motion.MotionWidget r9, float[] r10) {
            r8 = this;
            int r0 = r8.mType
            r1 = 1
            r2 = 0
            switch(r0) {
                case 900: goto L84;
                case 901: goto L7c;
                case 902: goto L30;
                case 903: goto L19;
                case 904: goto L9;
                case 905: goto L7c;
                case 906: goto L19;
                default: goto L7;
            }
        L7:
            goto L8c
        L9:
            java.lang.String r3 = r8.mName
            r10 = r10[r2]
            r4 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 <= 0) goto L14
            goto L15
        L14:
            r1 = r2
        L15:
            r9.setCustomAttribute(r3, r0, r1)
            goto L8c
        L19:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "unable to interpolate "
            r10.<init>(r0)
            java.lang.String r0 = r8.mName
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L30:
            r0 = r10[r2]
            double r2 = (double) r0
            r4 = 4601859982876761367(0x3fdd1745d1745d17, double:0.45454545454545453)
            double r2 = java.lang.Math.pow(r2, r4)
            float r0 = (float) r2
            r2 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r2
            int r0 = (int) r0
            int r0 = clamp(r0)
            r1 = r10[r1]
            double r6 = (double) r1
            double r6 = java.lang.Math.pow(r6, r4)
            float r1 = (float) r6
            float r1 = r1 * r2
            int r1 = (int) r1
            int r1 = clamp(r1)
            r3 = 2
            r3 = r10[r3]
            double r6 = (double) r3
            double r3 = java.lang.Math.pow(r6, r4)
            float r3 = (float) r3
            float r3 = r3 * r2
            int r3 = (int) r3
            int r3 = clamp(r3)
            r4 = 3
            r10 = r10[r4]
            float r10 = r10 * r2
            int r10 = (int) r10
            int r10 = clamp(r10)
            int r10 = r10 << 24
            int r0 = r0 << 16
            r10 = r10 | r0
            int r0 = r1 << 8
            r10 = r10 | r0
            r10 = r10 | r3
            java.lang.String r0 = r8.mName
            int r1 = r8.mType
            r9.setCustomAttribute(r0, r1, r10)
            goto L8c
        L7c:
            java.lang.String r1 = r8.mName
            r10 = r10[r2]
            r9.setCustomAttribute(r1, r0, r10)
            goto L8c
        L84:
            java.lang.String r1 = r8.mName
            r10 = r10[r2]
            int r10 = (int) r10
            r9.setCustomAttribute(r1, r0, r10)
        L8c:
            return
    }

    public void setStringValue(java.lang.String r1) {
            r0 = this;
            r0.mStringValue = r1
            return
    }

    public void setValue(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.mType
            switch(r0) {
                case 900: goto L2f;
                case 901: goto L26;
                case 902: goto L1d;
                case 903: goto L18;
                case 904: goto Lf;
                case 905: goto L6;
                case 906: goto L2f;
                default: goto L5;
            }
        L5:
            goto L37
        L6:
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.mFloatValue = r2
            goto L37
        Lf:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r1.mBooleanValue = r2
            goto L37
        L18:
            java.lang.String r2 = (java.lang.String) r2
            r1.mStringValue = r2
            goto L37
        L1d:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.mIntegerValue = r2
            goto L37
        L26:
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.mFloatValue = r2
            goto L37
        L2f:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.mIntegerValue = r2
        L37:
            return
    }

    public void setValue(float[] r9) {
            r8 = this;
            int r0 = r8.mType
            r1 = 1
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r4 = 0
            switch(r0) {
                case 900: goto L69;
                case 901: goto L64;
                case 902: goto L1e;
                case 903: goto L16;
                case 904: goto La;
                case 905: goto L64;
                case 906: goto L69;
                default: goto L9;
            }
        L9:
            goto L6e
        La:
            r9 = r9[r4]
            double r5 = (double) r9
            int r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r9 <= 0) goto L12
            goto L13
        L12:
            r1 = r4
        L13:
            r8.mBooleanValue = r1
            goto L6e
        L16:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot interpolate String"
            r9.<init>(r0)
            throw r9
        L1e:
            r0 = r9[r4]
            r1 = r9[r1]
            r4 = 2
            r4 = r9[r4]
            double r5 = (double) r0
            double r5 = java.lang.Math.pow(r5, r2)
            float r0 = (float) r5
            r5 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r5
            int r0 = java.lang.Math.round(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            double r6 = (double) r1
            double r6 = java.lang.Math.pow(r6, r2)
            float r1 = (float) r6
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            double r6 = (double) r4
            double r2 = java.lang.Math.pow(r6, r2)
            float r2 = (float) r2
            float r2 = r2 * r5
            int r2 = java.lang.Math.round(r2)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 3
            r9 = r9[r3]
            float r9 = r9 * r5
            int r9 = java.lang.Math.round(r9)
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 24
            int r0 = r0 << 16
            r9 = r9 | r0
            int r0 = r1 << 8
            r9 = r9 | r0
            r9 = r9 | r2
            r8.mIntegerValue = r9
            goto L6e
        L64:
            r9 = r9[r4]
            r8.mFloatValue = r9
            goto L6e
        L69:
            r9 = r9[r4]
            int r9 = (int) r9
            r8.mIntegerValue = r9
        L6e:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.mName
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 58
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r1 = r2.mType
            switch(r1) {
                case 900: goto L9a;
                case 901: goto L86;
                case 902: goto L6e;
                case 903: goto L5a;
                case 904: goto L42;
                case 905: goto L2e;
                default: goto L1a;
            }
        L1a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "????"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L2e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            float r1 = r2.mFloatValue
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L42:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            boolean r1 = r2.mBooleanValue
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L5a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = r2.mStringValue
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L6e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            int r1 = r2.mIntegerValue
            java.lang.String r1 = colorString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L86:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            float r1 = r2.mFloatValue
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L9a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            int r1 = r2.mIntegerValue
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
