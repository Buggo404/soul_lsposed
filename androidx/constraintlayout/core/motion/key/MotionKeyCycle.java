package androidx.constraintlayout.core.motion.key;

/* loaded from: classes.dex */
public class MotionKeyCycle extends androidx.constraintlayout.core.motion.key.MotionKey {
    public static final int KEY_TYPE = 4;
    static final java.lang.String NAME = "KeyCycle";
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    private static final java.lang.String TAG = "KeyCycle";
    public static final java.lang.String WAVE_OFFSET = "waveOffset";
    public static final java.lang.String WAVE_PERIOD = "wavePeriod";
    public static final java.lang.String WAVE_PHASE = "wavePhase";
    public static final java.lang.String WAVE_SHAPE = "waveShape";
    private float mAlpha;
    private int mCurveFit;
    private java.lang.String mCustomWaveShape;
    private float mElevation;
    private float mProgress;
    private float mRotation;
    private float mRotationX;
    private float mRotationY;
    private float mScaleX;
    private float mScaleY;
    private java.lang.String mTransitionEasing;
    private float mTransitionPathRotate;
    private float mTranslationX;
    private float mTranslationY;
    private float mTranslationZ;
    private float mWaveOffset;
    private float mWavePeriod;
    private float mWavePhase;
    private int mWaveShape;

    public MotionKeyCycle() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mTransitionEasing = r0
            r1 = 0
            r2.mCurveFit = r1
            r1 = -1
            r2.mWaveShape = r1
            r2.mCustomWaveShape = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.mWavePeriod = r0
            r1 = 0
            r2.mWaveOffset = r1
            r2.mWavePhase = r1
            r2.mProgress = r0
            r2.mAlpha = r0
            r2.mElevation = r0
            r2.mRotation = r0
            r2.mTransitionPathRotate = r0
            r2.mRotationX = r0
            r2.mRotationY = r0
            r2.mScaleX = r0
            r2.mScaleY = r0
            r2.mTranslationX = r0
            r2.mTranslationY = r0
            r2.mTranslationZ = r0
            r0 = 4
            r2.mType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mCustom = r0
            return
    }

    public void addCycleValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r25) {
            r24 = this;
            r0 = r24
            r1 = r25
            java.util.Set r2 = r25.keySet()
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "CUSTOM"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L58
            r4 = 7
            java.lang.String r4 = r3.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r5 = r0.mCustom
            java.lang.Object r4 = r5.get(r4)
            r14 = r4
            androidx.constraintlayout.core.motion.CustomVariable r14 = (androidx.constraintlayout.core.motion.CustomVariable) r14
            if (r14 == 0) goto Lc
            int r4 = r14.getType()
            r5 = 901(0x385, float:1.263E-42)
            if (r4 == r5) goto L39
            goto Lc
        L39:
            java.lang.Object r3 = r1.get(r3)
            r5 = r3
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r5 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r5
            if (r5 != 0) goto L43
            goto Lc
        L43:
            int r6 = r0.mFramePosition
            int r7 = r0.mWaveShape
            java.lang.String r8 = r0.mCustomWaveShape
            r9 = -1
            float r10 = r0.mWavePeriod
            float r11 = r0.mWaveOffset
            float r12 = r0.mWavePhase
            float r13 = r14.getValueToInterpolate()
            r5.setPoint(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto Lc
        L58:
            float r23 = r0.getValue(r3)
            boolean r4 = java.lang.Float.isNaN(r23)
            if (r4 == 0) goto L63
            goto Lc
        L63:
            java.lang.Object r3 = r1.get(r3)
            r15 = r3
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r15 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r15
            if (r15 != 0) goto L6d
            goto Lc
        L6d:
            int r3 = r0.mFramePosition
            int r4 = r0.mWaveShape
            java.lang.String r5 = r0.mCustomWaveShape
            r19 = -1
            float r6 = r0.mWavePeriod
            float r7 = r0.mWaveOffset
            float r8 = r0.mWavePhase
            r16 = r3
            r17 = r4
            r18 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r15.setPoint(r16, r17, r18, r19, r20, r21, r22, r23)
            goto Lc
        L8b:
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r1) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKey clone() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo128clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.constraintlayout.core.motion.key.MotionKey r0 = r1.clone()
            return r0
    }

    public void dump() {
            r3 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MotionKeyCycle{mWaveShape="
            r1.<init>(r2)
            int r2 = r3.mWaveShape
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", mWavePeriod="
            java.lang.StringBuilder r1 = r1.append(r2)
            float r2 = r3.mWavePeriod
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", mWaveOffset="
            java.lang.StringBuilder r1 = r1.append(r2)
            float r2 = r3.mWaveOffset
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", mWavePhase="
            java.lang.StringBuilder r1 = r1.append(r2)
            float r2 = r3.mWavePhase
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", mRotation="
            java.lang.StringBuilder r1 = r1.append(r2)
            float r2 = r3.mRotation
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(java.util.HashSet<java.lang.String> r5) {
            r4 = this;
            float r0 = r4.mAlpha
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld
            java.lang.String r0 = "alpha"
            r5.add(r0)
        Ld:
            float r0 = r4.mElevation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "elevation"
            r5.add(r0)
        L1a:
            float r0 = r4.mRotation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L27
            java.lang.String r0 = "rotationZ"
            r5.add(r0)
        L27:
            float r0 = r4.mRotationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = "rotationX"
            r5.add(r0)
        L34:
            float r0 = r4.mRotationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L41
            java.lang.String r0 = "rotationY"
            r5.add(r0)
        L41:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "scaleX"
            r5.add(r0)
        L4e:
            float r0 = r4.mScaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "scaleY"
            r5.add(r0)
        L5b:
            float r0 = r4.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "pathRotate"
            r5.add(r0)
        L68:
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "translationX"
            r5.add(r0)
        L75:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = "translationY"
            r5.add(r0)
        L82:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8f
            java.lang.String r0 = "translationZ"
            r5.add(r0)
        L8f:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r4.mCustom
            int r0 = r0.size()
            if (r0 <= 0) goto Lc0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r4.mCustom
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc0
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "CUSTOM,"
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r5.add(r1)
            goto La1
        Lc0:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String r3) {
            r2 = this;
            r3.hashCode()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1581616630: goto L10f;
                case -1310311125: goto L103;
                case -1249320806: goto Lf7;
                case -1249320805: goto Leb;
                case -1249320804: goto Ldf;
                case -1225497657: goto Ld3;
                case -1225497656: goto Lc7;
                case -1225497655: goto Lbb;
                case -1019779949: goto Lad;
                case -1001078227: goto L9f;
                case -991726143: goto L91;
                case -987906986: goto L83;
                case -987906985: goto L76;
                case -908189618: goto L69;
                case -908189617: goto L5c;
                case 92909918: goto L4f;
                case 106629499: goto L42;
                case 579057826: goto L35;
                case 803192288: goto L28;
                case 1532805160: goto L1b;
                case 1941332754: goto Le;
                default: goto Lb;
            }
        Lb:
            r3 = r1
            goto L11a
        Le:
            java.lang.String r0 = "visibility"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L17
            goto Lb
        L17:
            r3 = 20
            goto L11a
        L1b:
            java.lang.String r0 = "waveShape"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L24
            goto Lb
        L24:
            r3 = 19
            goto L11a
        L28:
            java.lang.String r0 = "pathRotate"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L31
            goto Lb
        L31:
            r3 = 18
            goto L11a
        L35:
            java.lang.String r0 = "curveFit"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3e
            goto Lb
        L3e:
            r3 = 17
            goto L11a
        L42:
            java.lang.String r0 = "phase"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4b
            goto Lb
        L4b:
            r3 = 16
            goto L11a
        L4f:
            java.lang.String r0 = "alpha"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L58
            goto Lb
        L58:
            r3 = 15
            goto L11a
        L5c:
            java.lang.String r0 = "scaleY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L65
            goto Lb
        L65:
            r3 = 14
            goto L11a
        L69:
            java.lang.String r0 = "scaleX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L72
            goto Lb
        L72:
            r3 = 13
            goto L11a
        L76:
            java.lang.String r0 = "pivotY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7f
            goto Lb
        L7f:
            r3 = 12
            goto L11a
        L83:
            java.lang.String r0 = "pivotX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8d
            goto Lb
        L8d:
            r3 = 11
            goto L11a
        L91:
            java.lang.String r0 = "period"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L9b
            goto Lb
        L9b:
            r3 = 10
            goto L11a
        L9f:
            java.lang.String r0 = "progress"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto Lb
        La9:
            r3 = 9
            goto L11a
        Lad:
            java.lang.String r0 = "offset"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb7
            goto Lb
        Lb7:
            r3 = 8
            goto L11a
        Lbb:
            java.lang.String r0 = "translationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc5
            goto Lb
        Lc5:
            r3 = 7
            goto L11a
        Lc7:
            java.lang.String r0 = "translationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld1
            goto Lb
        Ld1:
            r3 = 6
            goto L11a
        Ld3:
            java.lang.String r0 = "translationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ldd
            goto Lb
        Ldd:
            r3 = 5
            goto L11a
        Ldf:
            java.lang.String r0 = "rotationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Le9
            goto Lb
        Le9:
            r3 = 4
            goto L11a
        Leb:
            java.lang.String r0 = "rotationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lf5
            goto Lb
        Lf5:
            r3 = 3
            goto L11a
        Lf7:
            java.lang.String r0 = "rotationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L101
            goto Lb
        L101:
            r3 = 2
            goto L11a
        L103:
            java.lang.String r0 = "easing"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L10d
            goto Lb
        L10d:
            r3 = 1
            goto L11a
        L10f:
            java.lang.String r0 = "customWave"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L119
            goto Lb
        L119:
            r3 = 0
        L11a:
            switch(r3) {
                case 0: goto L15a;
                case 1: goto L157;
                case 2: goto L154;
                case 3: goto L151;
                case 4: goto L14e;
                case 5: goto L14b;
                case 6: goto L148;
                case 7: goto L145;
                case 8: goto L142;
                case 9: goto L13f;
                case 10: goto L13c;
                case 11: goto L139;
                case 12: goto L136;
                case 13: goto L133;
                case 14: goto L130;
                case 15: goto L12d;
                case 16: goto L12a;
                case 17: goto L127;
                case 18: goto L124;
                case 19: goto L121;
                case 20: goto L11e;
                default: goto L11d;
            }
        L11d:
            return r1
        L11e:
            r3 = 402(0x192, float:5.63E-43)
            return r3
        L121:
            r3 = 421(0x1a5, float:5.9E-43)
            return r3
        L124:
            r3 = 416(0x1a0, float:5.83E-43)
            return r3
        L127:
            r3 = 401(0x191, float:5.62E-43)
            return r3
        L12a:
            r3 = 425(0x1a9, float:5.96E-43)
            return r3
        L12d:
            r3 = 403(0x193, float:5.65E-43)
            return r3
        L130:
            r3 = 312(0x138, float:4.37E-43)
            return r3
        L133:
            r3 = 311(0x137, float:4.36E-43)
            return r3
        L136:
            r3 = 314(0x13a, float:4.4E-43)
            return r3
        L139:
            r3 = 313(0x139, float:4.39E-43)
            return r3
        L13c:
            r3 = 423(0x1a7, float:5.93E-43)
            return r3
        L13f:
            r3 = 315(0x13b, float:4.41E-43)
            return r3
        L142:
            r3 = 424(0x1a8, float:5.94E-43)
            return r3
        L145:
            r3 = 306(0x132, float:4.29E-43)
            return r3
        L148:
            r3 = 305(0x131, float:4.27E-43)
            return r3
        L14b:
            r3 = 304(0x130, float:4.26E-43)
            return r3
        L14e:
            r3 = 310(0x136, float:4.34E-43)
            return r3
        L151:
            r3 = 309(0x135, float:4.33E-43)
            return r3
        L154:
            r3 = 308(0x134, float:4.32E-43)
            return r3
        L157:
            r3 = 420(0x1a4, float:5.89E-43)
            return r3
        L15a:
            r3 = 422(0x1a6, float:5.91E-43)
            return r3
    }

    public float getValue(java.lang.String r3) {
            r2 = this;
            r3.hashCode()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1249320806: goto Lae;
                case -1249320805: goto La3;
                case -1249320804: goto L98;
                case -1225497657: goto L8d;
                case -1225497656: goto L82;
                case -1225497655: goto L77;
                case -1019779949: goto L6c;
                case -1001078227: goto L61;
                case -908189618: goto L53;
                case -908189617: goto L45;
                case -4379043: goto L37;
                case 92909918: goto L29;
                case 106629499: goto L1b;
                case 803192288: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Lb8
        Ld:
            java.lang.String r0 = "pathRotate"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L17
            goto Lb8
        L17:
            r1 = 13
            goto Lb8
        L1b:
            java.lang.String r0 = "phase"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L25
            goto Lb8
        L25:
            r1 = 12
            goto Lb8
        L29:
            java.lang.String r0 = "alpha"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L33
            goto Lb8
        L33:
            r1 = 11
            goto Lb8
        L37:
            java.lang.String r0 = "elevation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L41
            goto Lb8
        L41:
            r1 = 10
            goto Lb8
        L45:
            java.lang.String r0 = "scaleY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4f
            goto Lb8
        L4f:
            r1 = 9
            goto Lb8
        L53:
            java.lang.String r0 = "scaleX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5d
            goto Lb8
        L5d:
            r1 = 8
            goto Lb8
        L61:
            java.lang.String r0 = "progress"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6a
            goto Lb8
        L6a:
            r1 = 7
            goto Lb8
        L6c:
            java.lang.String r0 = "offset"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L75
            goto Lb8
        L75:
            r1 = 6
            goto Lb8
        L77:
            java.lang.String r0 = "translationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L80
            goto Lb8
        L80:
            r1 = 5
            goto Lb8
        L82:
            java.lang.String r0 = "translationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8b
            goto Lb8
        L8b:
            r1 = 4
            goto Lb8
        L8d:
            java.lang.String r0 = "translationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L96
            goto Lb8
        L96:
            r1 = 3
            goto Lb8
        L98:
            java.lang.String r0 = "rotationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La1
            goto Lb8
        La1:
            r1 = 2
            goto Lb8
        La3:
            java.lang.String r0 = "rotationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lac
            goto Lb8
        Lac:
            r1 = 1
            goto Lb8
        Lae:
            java.lang.String r0 = "rotationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb7
            goto Lb8
        Lb7:
            r1 = 0
        Lb8:
            switch(r1) {
                case 0: goto Le5;
                case 1: goto Le2;
                case 2: goto Ldf;
                case 3: goto Ldc;
                case 4: goto Ld9;
                case 5: goto Ld6;
                case 6: goto Ld3;
                case 7: goto Ld0;
                case 8: goto Lcd;
                case 9: goto Lca;
                case 10: goto Lc7;
                case 11: goto Lc4;
                case 12: goto Lc1;
                case 13: goto Lbe;
                default: goto Lbb;
            }
        Lbb:
            r3 = 2143289344(0x7fc00000, float:NaN)
            return r3
        Lbe:
            float r3 = r2.mTransitionPathRotate
            return r3
        Lc1:
            float r3 = r2.mWavePhase
            return r3
        Lc4:
            float r3 = r2.mAlpha
            return r3
        Lc7:
            float r3 = r2.mElevation
            return r3
        Lca:
            float r3 = r2.mScaleY
            return r3
        Lcd:
            float r3 = r2.mScaleX
            return r3
        Ld0:
            float r3 = r2.mProgress
            return r3
        Ld3:
            float r3 = r2.mWaveOffset
            return r3
        Ld6:
            float r3 = r2.mTranslationZ
            return r3
        Ld9:
            float r3 = r2.mTranslationY
            return r3
        Ldc:
            float r3 = r2.mTranslationX
            return r3
        Ldf:
            float r3 = r2.mRotation
            return r3
        Le2:
            float r3 = r2.mRotationY
            return r3
        Le5:
            float r3 = r2.mRotationX
            return r3
    }

    public void printAttributes() {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4.getAttributeNames(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " ------------- "
            r1.<init>(r2)
            int r2 = r4.mFramePosition
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " -------------"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.constraintlayout.core.motion.utils.Utils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MotionKeyCycle{Shape="
            r1.<init>(r2)
            int r2 = r4.mWaveShape
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", Period="
            java.lang.StringBuilder r1 = r1.append(r2)
            float r2 = r4.mWavePeriod
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", Offset="
            java.lang.StringBuilder r1 = r1.append(r2)
            float r2 = r4.mWaveOffset
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", Phase="
            java.lang.StringBuilder r1 = r1.append(r2)
            float r2 = r4.mWavePhase
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.constraintlayout.core.motion.utils.Utils.log(r1)
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L69:
            int r2 = r0.length
            if (r1 >= r2) goto L96
            r2 = r0[r1]
            androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getId(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r0[r1]
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ":"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r0[r1]
            float r3 = r4.getValue(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            androidx.constraintlayout.core.motion.utils.Utils.log(r2)
            int r1 = r1 + 1
            goto L69
        L96:
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, float r3) {
            r1 = this;
            r0 = 315(0x13b, float:4.41E-43)
            if (r2 == r0) goto L41
            r0 = 403(0x193, float:5.65E-43)
            if (r2 == r0) goto L3e
            r0 = 416(0x1a0, float:5.83E-43)
            if (r2 == r0) goto L3b
            switch(r2) {
                case 304: goto L38;
                case 305: goto L35;
                case 306: goto L32;
                case 307: goto L2f;
                case 308: goto L2c;
                case 309: goto L29;
                case 310: goto L26;
                case 311: goto L23;
                case 312: goto L20;
                default: goto Lf;
            }
        Lf:
            switch(r2) {
                case 423: goto L1d;
                case 424: goto L1a;
                case 425: goto L17;
                default: goto L12;
            }
        L12:
            boolean r2 = super.setValue(r2, r3)
            return r2
        L17:
            r1.mWavePhase = r3
            goto L43
        L1a:
            r1.mWaveOffset = r3
            goto L43
        L1d:
            r1.mWavePeriod = r3
            goto L43
        L20:
            r1.mScaleY = r3
            goto L43
        L23:
            r1.mScaleX = r3
            goto L43
        L26:
            r1.mRotation = r3
            goto L43
        L29:
            r1.mRotationY = r3
            goto L43
        L2c:
            r1.mRotationX = r3
            goto L43
        L2f:
            r1.mElevation = r3
            goto L43
        L32:
            r1.mTranslationZ = r3
            goto L43
        L35:
            r1.mTranslationY = r3
            goto L43
        L38:
            r1.mTranslationX = r3
            goto L43
        L3b:
            r1.mTransitionPathRotate = r3
            goto L43
        L3e:
            r1.mAlpha = r3
            goto L43
        L41:
            r1.mProgress = r3
        L43:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r3, int r4) {
            r2 = this;
            r0 = 401(0x191, float:5.62E-43)
            r1 = 1
            if (r3 == r0) goto L19
            r0 = 421(0x1a5, float:5.9E-43)
            if (r3 == r0) goto L16
            float r0 = (float) r4
            boolean r0 = r2.setValue(r3, r0)
            if (r0 == 0) goto L11
            return r1
        L11:
            boolean r3 = super.setValue(r3, r4)
            return r3
        L16:
            r2.mWaveShape = r4
            return r1
        L19:
            r2.mCurveFit = r4
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r3, java.lang.String r4) {
            r2 = this;
            r0 = 420(0x1a4, float:5.89E-43)
            r1 = 1
            if (r3 == r0) goto L11
            r0 = 422(0x1a6, float:5.91E-43)
            if (r3 == r0) goto Le
            boolean r3 = super.setValue(r3, r4)
            return r3
        Le:
            r2.mCustomWaveShape = r4
            return r1
        L11:
            r2.mTransitionEasing = r4
            return r1
    }
}
