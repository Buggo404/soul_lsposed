package androidx.constraintlayout.core.motion;

/* loaded from: classes.dex */
public class CustomAttribute {
    private static final java.lang.String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    private boolean mMethod;
    java.lang.String mName;
    private java.lang.String mStringValue;
    private androidx.constraintlayout.core.motion.CustomAttribute.AttributeType mType;

    /* renamed from: androidx.constraintlayout.core.motion.CustomAttribute$1 */
    static /* synthetic */ class C01171 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType */
        static final /* synthetic */ int[] f14xbc2a0812 = null;

        static {
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType[] r0 = androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.motion.CustomAttribute.C01171.f14xbc2a0812 = r0
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.REFERENCE_TYPE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.motion.CustomAttribute.C01171.f14xbc2a0812     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.BOOLEAN_TYPE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.motion.CustomAttribute.C01171.f14xbc2a0812     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.STRING_TYPE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.core.motion.CustomAttribute.C01171.f14xbc2a0812     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.COLOR_TYPE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.core.motion.CustomAttribute.C01171.f14xbc2a0812     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.COLOR_DRAWABLE_TYPE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.constraintlayout.core.motion.CustomAttribute.C01171.f14xbc2a0812     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.INT_TYPE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.constraintlayout.core.motion.CustomAttribute.C01171.f14xbc2a0812     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.FLOAT_TYPE     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = androidx.constraintlayout.core.motion.CustomAttribute.C01171.f14xbc2a0812     // Catch: java.lang.NoSuchFieldError -> L60
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.DIMENSION_TYPE     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                return
        }
    }

    public enum AttributeType extends java.lang.Enum<androidx.constraintlayout.core.motion.CustomAttribute.AttributeType> {
        private static final /* synthetic */ androidx.constraintlayout.core.motion.CustomAttribute.AttributeType[] $VALUES = null;
        public static final androidx.constraintlayout.core.motion.CustomAttribute.AttributeType BOOLEAN_TYPE = null;
        public static final androidx.constraintlayout.core.motion.CustomAttribute.AttributeType COLOR_DRAWABLE_TYPE = null;
        public static final androidx.constraintlayout.core.motion.CustomAttribute.AttributeType COLOR_TYPE = null;
        public static final androidx.constraintlayout.core.motion.CustomAttribute.AttributeType DIMENSION_TYPE = null;
        public static final androidx.constraintlayout.core.motion.CustomAttribute.AttributeType FLOAT_TYPE = null;
        public static final androidx.constraintlayout.core.motion.CustomAttribute.AttributeType INT_TYPE = null;
        public static final androidx.constraintlayout.core.motion.CustomAttribute.AttributeType REFERENCE_TYPE = null;
        public static final androidx.constraintlayout.core.motion.CustomAttribute.AttributeType STRING_TYPE = null;

        static {
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r0 = new androidx.constraintlayout.core.motion.CustomAttribute$AttributeType
                java.lang.String r1 = "INT_TYPE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.INT_TYPE = r0
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = new androidx.constraintlayout.core.motion.CustomAttribute$AttributeType
                java.lang.String r3 = "FLOAT_TYPE"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.FLOAT_TYPE = r1
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r3 = new androidx.constraintlayout.core.motion.CustomAttribute$AttributeType
                java.lang.String r5 = "COLOR_TYPE"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.COLOR_TYPE = r3
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r5 = new androidx.constraintlayout.core.motion.CustomAttribute$AttributeType
                java.lang.String r7 = "COLOR_DRAWABLE_TYPE"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.COLOR_DRAWABLE_TYPE = r5
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r7 = new androidx.constraintlayout.core.motion.CustomAttribute$AttributeType
                java.lang.String r9 = "STRING_TYPE"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.STRING_TYPE = r7
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r9 = new androidx.constraintlayout.core.motion.CustomAttribute$AttributeType
                java.lang.String r11 = "BOOLEAN_TYPE"
                r12 = 5
                r9.<init>(r11, r12)
                androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.BOOLEAN_TYPE = r9
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r11 = new androidx.constraintlayout.core.motion.CustomAttribute$AttributeType
                java.lang.String r13 = "DIMENSION_TYPE"
                r14 = 6
                r11.<init>(r13, r14)
                androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.DIMENSION_TYPE = r11
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r13 = new androidx.constraintlayout.core.motion.CustomAttribute$AttributeType
                java.lang.String r15 = "REFERENCE_TYPE"
                r14 = 7
                r13.<init>(r15, r14)
                androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.REFERENCE_TYPE = r13
                r15 = 8
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType[] r15 = new androidx.constraintlayout.core.motion.CustomAttribute.AttributeType[r15]
                r15[r2] = r0
                r15[r4] = r1
                r15[r6] = r3
                r15[r8] = r5
                r15[r10] = r7
                r15[r12] = r9
                r0 = 6
                r15[r0] = r11
                r15[r14] = r13
                androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.$VALUES = r15
                return
        }

        AttributeType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.motion.CustomAttribute.AttributeType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.motion.CustomAttribute$AttributeType> r0 = androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = (androidx.constraintlayout.core.motion.CustomAttribute.AttributeType) r1
                return r1
        }

        public static androidx.constraintlayout.core.motion.CustomAttribute.AttributeType[] values() {
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType[] r0 = androidx.constraintlayout.core.motion.CustomAttribute.AttributeType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.motion.CustomAttribute$AttributeType[] r0 = (androidx.constraintlayout.core.motion.CustomAttribute.AttributeType[]) r0
                return r0
        }
    }

    public CustomAttribute(androidx.constraintlayout.core.motion.CustomAttribute r2, java.lang.Object r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMethod = r0
            java.lang.String r0 = r2.mName
            r1.mName = r0
            androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r2 = r2.mType
            r1.mType = r2
            r1.setValue(r3)
            return
    }

    public CustomAttribute(java.lang.String r2, androidx.constraintlayout.core.motion.CustomAttribute.AttributeType r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMethod = r0
            r1.mName = r2
            r1.mType = r3
            return
    }

    public CustomAttribute(java.lang.String r1, androidx.constraintlayout.core.motion.CustomAttribute.AttributeType r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.mName = r1
            r0.mType = r2
            r0.mMethod = r4
            r0.setValue(r3)
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

    public boolean diff(androidx.constraintlayout.core.motion.CustomAttribute r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L4c
            androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = r3.mType
            androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r2 = r4.mType
            if (r1 == r2) goto La
            goto L4c
        La:
            int[] r1 = androidx.constraintlayout.core.motion.CustomAttribute.C01171.f14xbc2a0812
            androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r2 = r3.mType
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            switch(r1) {
                case 1: goto L45;
                case 2: goto L3d;
                case 3: goto L35;
                case 4: goto L2d;
                case 5: goto L2d;
                case 6: goto L45;
                case 7: goto L23;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            return r0
        L19:
            float r1 = r3.mFloatValue
            float r4 = r4.mFloatValue
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L22
            r0 = r2
        L22:
            return r0
        L23:
            float r1 = r3.mFloatValue
            float r4 = r4.mFloatValue
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L2c
            r0 = r2
        L2c:
            return r0
        L2d:
            int r1 = r3.mColorValue
            int r4 = r4.mColorValue
            if (r1 != r4) goto L34
            r0 = r2
        L34:
            return r0
        L35:
            int r1 = r3.mIntegerValue
            int r4 = r4.mIntegerValue
            if (r1 != r4) goto L3c
            r0 = r2
        L3c:
            return r0
        L3d:
            boolean r1 = r3.mBooleanValue
            boolean r4 = r4.mBooleanValue
            if (r1 != r4) goto L44
            r0 = r2
        L44:
            return r0
        L45:
            int r1 = r3.mIntegerValue
            int r4 = r4.mIntegerValue
            if (r1 != r4) goto L4c
            r0 = r2
        L4c:
            return r0
    }

    public androidx.constraintlayout.core.motion.CustomAttribute.AttributeType getType() {
            r1 = this;
            androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r0 = r1.mType
            return r0
    }

    public float getValueToInterpolate() {
            r2 = this;
            int[] r0 = androidx.constraintlayout.core.motion.CustomAttribute.C01171.f14xbc2a0812
            androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = r2.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L2a;
                case 3: goto L22;
                case 4: goto L1a;
                case 5: goto L1a;
                case 6: goto L16;
                case 7: goto L13;
                case 8: goto L10;
                default: goto Ld;
            }
        Ld:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        L10:
            float r0 = r2.mFloatValue
            return r0
        L13:
            float r0 = r2.mFloatValue
            return r0
        L16:
            int r0 = r2.mIntegerValue
            float r0 = (float) r0
            return r0
        L1a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Color does not have a single color to interpolate"
            r0.<init>(r1)
            throw r0
        L22:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot interpolate String"
            r0.<init>(r1)
            throw r0
        L2a:
            boolean r0 = r2.mBooleanValue
            if (r0 == 0) goto L31
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
    }

    public void getValuesToInterpolate(float[] r11) {
            r10 = this;
            int[] r0 = androidx.constraintlayout.core.motion.CustomAttribute.C01171.f14xbc2a0812
            androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = r10.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 2: goto L64;
                case 3: goto L5c;
                case 4: goto L1f;
                case 5: goto L1f;
                case 6: goto L19;
                case 7: goto L14;
                case 8: goto Lf;
                default: goto Le;
            }
        Le:
            goto L6e
        Lf:
            float r0 = r10.mFloatValue
            r11[r1] = r0
            goto L6e
        L14:
            float r0 = r10.mFloatValue
            r11[r1] = r0
            goto L6e
        L19:
            int r0 = r10.mIntegerValue
            float r0 = (float) r0
            r11[r1] = r0
            goto L6e
        L1f:
            int r0 = r10.mColorValue
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
            goto L6e
        L5c:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Color does not have a single color to interpolate"
            r11.<init>(r0)
            throw r11
        L64:
            boolean r0 = r10.mBooleanValue
            if (r0 == 0) goto L6b
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L6c
        L6b:
            r0 = 0
        L6c:
            r11[r1] = r0
        L6e:
            return
    }

    public boolean isContinuous() {
            r3 = this;
            int[] r0 = androidx.constraintlayout.core.motion.CustomAttribute.C01171.f14xbc2a0812
            androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = r3.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L14
            r2 = 2
            if (r0 == r2) goto L14
            r2 = 3
            if (r0 == r2) goto L14
            return r1
        L14:
            r0 = 0
            return r0
    }

    public int numberOfInterpolatedValues() {
            r3 = this;
            int[] r0 = androidx.constraintlayout.core.motion.CustomAttribute.C01171.f14xbc2a0812
            androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = r3.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 4
            if (r0 == r1) goto L12
            r2 = 5
            if (r0 == r2) goto L12
            r0 = 1
            return r0
        L12:
            return r1
    }

    public void setColorValue(int r1) {
            r0 = this;
            r0.mColorValue = r1
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

    public void setStringValue(java.lang.String r1) {
            r0 = this;
            r0.mStringValue = r1
            return
    }

    public void setValue(java.lang.Object r3) {
            r2 = this;
            int[] r0 = androidx.constraintlayout.core.motion.CustomAttribute.C01171.f14xbc2a0812
            androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = r2.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L37;
                case 2: goto L2e;
                case 3: goto L29;
                case 4: goto L20;
                case 5: goto L20;
                case 6: goto L37;
                case 7: goto L17;
                case 8: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L3f
        Le:
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.mFloatValue = r3
            goto L3f
        L17:
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.mFloatValue = r3
            goto L3f
        L20:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.mColorValue = r3
            goto L3f
        L29:
            java.lang.String r3 = (java.lang.String) r3
            r2.mStringValue = r3
            goto L3f
        L2e:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.mBooleanValue = r3
            goto L3f
        L37:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.mIntegerValue = r3
        L3f:
            return
    }

    public void setValue(float[] r8) {
            r7 = this;
            int[] r0 = androidx.constraintlayout.core.motion.CustomAttribute.C01171.f14xbc2a0812
            androidx.constraintlayout.core.motion.CustomAttribute$AttributeType r1 = r7.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L52;
                case 2: goto L44;
                case 3: goto L3c;
                case 4: goto L1a;
                case 5: goto L1a;
                case 6: goto L52;
                case 7: goto L15;
                case 8: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L57
        L10:
            r8 = r8[r2]
            r7.mFloatValue = r8
            goto L57
        L15:
            r8 = r8[r2]
            r7.mFloatValue = r8
            goto L57
        L1a:
            r0 = r8[r2]
            r1 = r8[r1]
            r2 = 2
            r2 = r8[r2]
            int r0 = hsvToRgb(r0, r1, r2)
            r7.mColorValue = r0
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            r1 = 3
            r8 = r8[r1]
            r1 = 1132396544(0x437f0000, float:255.0)
            float r8 = r8 * r1
            int r8 = (int) r8
            int r8 = clamp(r8)
            int r8 = r8 << 24
            r8 = r8 | r0
            r7.mColorValue = r8
            goto L57
        L3c:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "Color does not have a single color to interpolate"
            r8.<init>(r0)
            throw r8
        L44:
            r8 = r8[r2]
            double r3 = (double) r8
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L4e
            goto L4f
        L4e:
            r1 = r2
        L4f:
            r7.mBooleanValue = r1
            goto L57
        L52:
            r8 = r8[r2]
            int r8 = (int) r8
            r7.mIntegerValue = r8
        L57:
            return
    }
}
