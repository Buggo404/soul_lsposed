package androidx.constraintlayout.core.motion.key;

/* loaded from: classes.dex */
public class MotionKeyTimeCycle extends androidx.constraintlayout.core.motion.key.MotionKey {
    public static final int KEY_TYPE = 3;
    static final java.lang.String NAME = "KeyTimeCycle";
    private static final java.lang.String TAG = "KeyTimeCycle";
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
    private int mWaveShape;

    public MotionKeyTimeCycle() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mCurveFit = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.mAlpha = r0
            r2.mElevation = r0
            r2.mRotation = r0
            r2.mRotationX = r0
            r2.mRotationY = r0
            r2.mTransitionPathRotate = r0
            r2.mScaleX = r0
            r2.mScaleY = r0
            r2.mTranslationX = r0
            r2.mTranslationY = r0
            r2.mTranslationZ = r0
            r2.mProgress = r0
            r1 = 0
            r2.mWaveShape = r1
            r1 = 0
            r2.mCustomWaveShape = r1
            r2.mWavePeriod = r0
            r0 = 0
            r2.mWaveOffset = r0
            r0 = 3
            r2.mType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mCustom = r0
            return
    }

    public void addTimeValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r11) {
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet r3 = (androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet) r3
            if (r3 != 0) goto L1e
            goto L8
        L1e:
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L45
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r2 = r10.mCustom
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.core.motion.CustomVariable r6 = (androidx.constraintlayout.core.motion.CustomVariable) r6
            if (r6 == 0) goto L8
            r4 = r3
            androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet$CustomVarSet r4 = (androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.CustomVarSet) r4
            int r5 = r10.mFramePosition
            float r7 = r10.mWavePeriod
            int r8 = r10.mWaveShape
            float r9 = r10.mWaveOffset
            r4.setPoint(r5, r6, r7, r8, r9)
            goto L8
        L45:
            r1.hashCode()
            int r2 = r1.hashCode()
            r5 = -1
            switch(r2) {
                case -1249320806: goto Ld1;
                case -1249320805: goto Lc6;
                case -1249320804: goto Lbb;
                case -1225497657: goto Lb0;
                case -1225497656: goto La5;
                case -1225497655: goto L9a;
                case -1001078227: goto L8f;
                case -908189618: goto L86;
                case -908189617: goto L7a;
                case -4379043: goto L6d;
                case 92909918: goto L60;
                case 803192288: goto L53;
                default: goto L50;
            }
        L50:
            r4 = r5
            goto Ldc
        L53:
            java.lang.String r2 = "pathRotate"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L5c
            goto L50
        L5c:
            r4 = 11
            goto Ldc
        L60:
            java.lang.String r2 = "alpha"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L69
            goto L50
        L69:
            r4 = 10
            goto Ldc
        L6d:
            java.lang.String r2 = "elevation"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L76
            goto L50
        L76:
            r4 = 9
            goto Ldc
        L7a:
            java.lang.String r2 = "scaleY"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L83
            goto L50
        L83:
            r4 = 8
            goto Ldc
        L86:
            java.lang.String r2 = "scaleX"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Ldc
            goto L50
        L8f:
            java.lang.String r2 = "progress"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L98
            goto L50
        L98:
            r4 = 6
            goto Ldc
        L9a:
            java.lang.String r2 = "translationZ"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto La3
            goto L50
        La3:
            r4 = 5
            goto Ldc
        La5:
            java.lang.String r2 = "translationY"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lae
            goto L50
        Lae:
            r4 = 4
            goto Ldc
        Lb0:
            java.lang.String r2 = "translationX"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lb9
            goto L50
        Lb9:
            r4 = 3
            goto Ldc
        Lbb:
            java.lang.String r2 = "rotationZ"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lc4
            goto L50
        Lc4:
            r4 = 2
            goto Ldc
        Lc6:
            java.lang.String r2 = "rotationY"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lcf
            goto L50
        Lcf:
            r4 = 1
            goto Ldc
        Ld1:
            java.lang.String r2 = "rotationX"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Ldb
            goto L50
        Ldb:
            r4 = 0
        Ldc:
            switch(r4) {
                case 0: goto L1f8;
                case 1: goto L1e1;
                case 2: goto L1ca;
                case 3: goto L1b3;
                case 4: goto L19c;
                case 5: goto L185;
                case 6: goto L16e;
                case 7: goto L157;
                case 8: goto L140;
                case 9: goto L129;
                case 10: goto L112;
                case 11: goto Lfb;
                default: goto Ldf;
            }
        Ldf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = "\""
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "KeyTimeCycles"
            androidx.constraintlayout.core.motion.utils.Utils.loge(r2, r1)
            goto L8
        Lfb:
            float r1 = r10.mTransitionPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mTransitionPathRotate
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L112:
            float r1 = r10.mAlpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mAlpha
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L129:
            float r1 = r10.mTranslationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mTranslationZ
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L140:
            float r1 = r10.mScaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mScaleY
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L157:
            float r1 = r10.mScaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mScaleX
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L16e:
            float r1 = r10.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mProgress
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L185:
            float r1 = r10.mTranslationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mTranslationZ
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L19c:
            float r1 = r10.mTranslationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mTranslationY
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L1b3:
            float r1 = r10.mTranslationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mTranslationX
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L1ca:
            float r1 = r10.mRotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mRotation
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L1e1:
            float r1 = r10.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mRotationY
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L1f8:
            float r1 = r10.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mRotationX
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L20f:
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
            androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle r0 = new androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle
            r0.<init>()
            androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle r0 = r0.copy(r1)
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo128clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.constraintlayout.core.motion.key.MotionKey r0 = r1.clone()
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public /* bridge */ /* synthetic */ androidx.constraintlayout.core.motion.key.MotionKey copy(androidx.constraintlayout.core.motion.key.MotionKey r1) {
            r0 = this;
            androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle r1 = r0.copy(r1)
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle copy(androidx.constraintlayout.core.motion.key.MotionKey r2) {
            r1 = this;
            super.copy(r2)
            androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle r2 = (androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle) r2
            java.lang.String r0 = r2.mTransitionEasing
            r1.mTransitionEasing = r0
            int r0 = r2.mCurveFit
            r1.mCurveFit = r0
            int r0 = r2.mWaveShape
            r1.mWaveShape = r0
            float r0 = r2.mWavePeriod
            r1.mWavePeriod = r0
            float r0 = r2.mWaveOffset
            r1.mWaveOffset = r0
            float r0 = r2.mProgress
            r1.mProgress = r0
            float r0 = r2.mAlpha
            r1.mAlpha = r0
            float r0 = r2.mElevation
            r1.mElevation = r0
            float r0 = r2.mRotation
            r1.mRotation = r0
            float r0 = r2.mTransitionPathRotate
            r1.mTransitionPathRotate = r0
            float r0 = r2.mRotationX
            r1.mRotationX = r0
            float r0 = r2.mRotationY
            r1.mRotationY = r0
            float r0 = r2.mScaleX
            r1.mScaleX = r0
            float r0 = r2.mScaleY
            r1.mScaleY = r0
            float r0 = r2.mTranslationX
            r1.mTranslationX = r0
            float r0 = r2.mTranslationY
            r1.mTranslationY = r0
            float r2 = r2.mTranslationZ
            r1.mTranslationZ = r2
            return r1
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
    public int getId(java.lang.String r1) {
            r0 = this;
            int r1 = androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.getId(r1)
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, float r3) {
            r1 = this;
            r0 = 315(0x13b, float:4.41E-43)
            if (r2 == r0) goto Lb6
            r0 = 401(0x191, float:5.62E-43)
            if (r2 == r0) goto Lab
            r0 = 403(0x193, float:5.65E-43)
            if (r2 == r0) goto La8
            r0 = 416(0x1a0, float:5.83E-43)
            if (r2 == r0) goto L9d
            r0 = 423(0x1a7, float:5.93E-43)
            if (r2 == r0) goto L92
            r0 = 424(0x1a8, float:5.94E-43)
            if (r2 == r0) goto L87
            switch(r2) {
                case 304: goto L7c;
                case 305: goto L71;
                case 306: goto L66;
                case 307: goto L5b;
                case 308: goto L50;
                case 309: goto L44;
                case 310: goto L38;
                case 311: goto L2c;
                case 312: goto L20;
                default: goto L1b;
            }
        L1b:
            boolean r2 = super.setValue(r2, r3)
            return r2
        L20:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mScaleY = r2
            goto Lc0
        L2c:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mScaleX = r2
            goto Lc0
        L38:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mRotation = r2
            goto Lc0
        L44:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mRotationY = r2
            goto Lc0
        L50:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mRotationX = r2
            goto Lc0
        L5b:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mElevation = r2
            goto Lc0
        L66:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mTranslationZ = r2
            goto Lc0
        L71:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mTranslationY = r2
            goto Lc0
        L7c:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mTranslationX = r2
            goto Lc0
        L87:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mWaveOffset = r2
            goto Lc0
        L92:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mWavePeriod = r2
            goto Lc0
        L9d:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mTransitionPathRotate = r2
            goto Lc0
        La8:
            r1.mAlpha = r3
            goto Lc0
        Lab:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            int r2 = r1.toInt(r2)
            r1.mCurveFit = r2
            goto Lc0
        Lb6:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r1.toFloat(r2)
            r1.mProgress = r2
        Lc0:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, int r3) {
            r1 = this;
            r0 = 100
            if (r2 == r0) goto L10
            r0 = 421(0x1a5, float:5.9E-43)
            if (r2 == r0) goto Ld
            boolean r2 = super.setValue(r2, r3)
            return r2
        Ld:
            r1.mWaveShape = r3
            goto L12
        L10:
            r1.mFramePosition = r3
        L12:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 420(0x1a4, float:5.89E-43)
            if (r2 == r0) goto L13
            r0 = 421(0x1a5, float:5.9E-43)
            if (r2 == r0) goto Ld
            boolean r2 = super.setValue(r2, r3)
            return r2
        Ld:
            r2 = 7
            r1.mWaveShape = r2
            r1.mCustomWaveShape = r3
            goto L15
        L13:
            r1.mTransitionEasing = r3
        L15:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r1, boolean r2) {
            r0 = this;
            boolean r1 = super.setValue(r1, r2)
            return r1
    }
}
