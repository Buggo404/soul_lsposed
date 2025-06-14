package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class KeyTimeCycle extends androidx.constraintlayout.motion.widget.Key {
    public static final int KEY_TYPE = 3;
    static final java.lang.String NAME = "KeyTimeCycle";
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    private static final java.lang.String TAG = "KeyTimeCycle";
    public static final java.lang.String WAVE_OFFSET = "waveOffset";
    public static final java.lang.String WAVE_PERIOD = "wavePeriod";
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
    private int mWaveShape;

    private static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
        private static final int ANDROID_ROTATION = 4;
        private static final int ANDROID_ROTATION_X = 5;
        private static final int ANDROID_ROTATION_Y = 6;
        private static final int ANDROID_SCALE_X = 7;
        private static final int ANDROID_SCALE_Y = 14;
        private static final int ANDROID_TRANSLATION_X = 15;
        private static final int ANDROID_TRANSLATION_Y = 16;
        private static final int ANDROID_TRANSLATION_Z = 17;
        private static final int CURVE_FIT = 13;
        private static final int FRAME_POSITION = 12;
        private static final int PROGRESS = 18;
        private static final int TARGET_ID = 10;
        private static final int TRANSITION_EASING = 9;
        private static final int TRANSITION_PATH_ROTATE = 8;
        private static final int WAVE_OFFSET = 21;
        private static final int WAVE_PERIOD = 20;
        private static final int WAVE_SHAPE = 19;
        private static android.util.SparseIntArray mAttrMap;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap = r0
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_android_alpha
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_android_elevation
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_android_rotation
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_android_rotationX
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_android_rotationY
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_android_scaleX
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_transitionPathRotate
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_transitionEasing
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_motionTarget
                r2 = 10
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_framePosition
                r2 = 12
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_curveFit
                r2 = 13
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_android_scaleY
                r2 = 14
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_android_translationX
                r2 = 15
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_android_translationY
                r2 = 16
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_android_translationZ
                r2 = 17
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_motionProgress
                r2 = 18
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_wavePeriod
                r2 = 20
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_waveOffset
                r2 = 21
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle_waveShape
                r2 = 19
                r0.append(r1, r2)
                return
        }

        private Loader() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void read(androidx.constraintlayout.motion.widget.KeyTimeCycle r5, android.content.res.TypedArray r6) {
                int r0 = r6.getIndexCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L179
                int r2 = r6.getIndex(r1)
                android.util.SparseIntArray r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r3 = r3.get(r2)
                r4 = 3
                switch(r3) {
                    case 1: goto L16a;
                    case 2: goto L15e;
                    case 3: goto L15;
                    case 4: goto L152;
                    case 5: goto L146;
                    case 6: goto L13a;
                    case 7: goto L12e;
                    case 8: goto L122;
                    case 9: goto L11a;
                    case 10: goto Le9;
                    case 11: goto L15;
                    case 12: goto Ldf;
                    case 13: goto Ld2;
                    case 14: goto Lc5;
                    case 15: goto Lb8;
                    case 16: goto Lab;
                    case 17: goto L9e;
                    case 18: goto L91;
                    case 19: goto L6f;
                    case 20: goto L62;
                    case 21: goto L3f;
                    default: goto L15;
                }
            L15:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "unused attribute 0x"
                r3.<init>(r4)
                java.lang.String r4 = java.lang.Integer.toHexString(r2)
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = "   "
                java.lang.StringBuilder r3 = r3.append(r4)
                android.util.SparseIntArray r4 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r2 = r4.get(r2)
                java.lang.StringBuilder r2 = r3.append(r2)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "KeyTimeCycle"
                android.util.Log.e(r3, r2)
                goto L175
            L3f:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                r4 = 5
                if (r3 != r4) goto L55
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$700(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$702(r5, r2)
                goto L175
            L55:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$700(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$702(r5, r2)
                goto L175
            L62:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$600(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$602(r5, r2)
                goto L175
            L6f:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                if (r3 != r4) goto L84
                java.lang.String r2 = r6.getString(r2)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$402(r5, r2)
                r2 = 7
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$502(r5, r2)
                goto L175
            L84:
                int r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$500(r5)
                int r2 = r6.getInt(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$502(r5, r2)
                goto L175
            L91:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1700(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1702(r5, r2)
                goto L175
            L9e:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1600(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1602(r5, r2)
                goto L175
            Lab:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1500(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1502(r5, r2)
                goto L175
            Lb8:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1400(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1402(r5, r2)
                goto L175
            Lc5:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1200(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1202(r5, r2)
                goto L175
            Ld2:
                int r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$300(r5)
                int r2 = r6.getInteger(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$302(r5, r2)
                goto L175
            Ldf:
                int r3 = r5.mFramePosition
                int r2 = r6.getInt(r2, r3)
                r5.mFramePosition = r2
                goto L175
            Le9:
                boolean r3 = androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE
                if (r3 == 0) goto L102
                int r3 = r5.mTargetId
                int r3 = r6.getResourceId(r2, r3)
                r5.mTargetId = r3
                int r3 = r5.mTargetId
                r4 = -1
                if (r3 != r4) goto L175
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L175
            L102:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                if (r3 != r4) goto L111
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L175
            L111:
                int r3 = r5.mTargetId
                int r2 = r6.getResourceId(r2, r3)
                r5.mTargetId = r2
                goto L175
            L11a:
                java.lang.String r2 = r6.getString(r2)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1102(r5, r2)
                goto L175
            L122:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1300(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1302(r5, r2)
                goto L175
            L12e:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$800(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$802(r5, r2)
                goto L175
            L13a:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1000(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1002(r5, r2)
                goto L175
            L146:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$900(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$902(r5, r2)
                goto L175
            L152:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$200(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$202(r5, r2)
                goto L175
            L15e:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$100(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$102(r5, r2)
                goto L175
            L16a:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$000(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$002(r5, r2)
            L175:
                int r1 = r1 + 1
                goto L5
            L179:
                return
        }
    }

    public KeyTimeCycle() {
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
            r2.mCustomConstraints = r0
            return
    }

    static /* synthetic */ float access$000(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mAlpha
            return r0
    }

    static /* synthetic */ float access$002(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mAlpha = r1
            return r1
    }

    static /* synthetic */ float access$100(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mElevation
            return r0
    }

    static /* synthetic */ float access$1000(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mRotationY
            return r0
    }

    static /* synthetic */ float access$1002(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mRotationY = r1
            return r1
    }

    static /* synthetic */ float access$102(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mElevation = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$1102(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, java.lang.String r1) {
            r0.mTransitionEasing = r1
            return r1
    }

    static /* synthetic */ float access$1200(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mScaleY
            return r0
    }

    static /* synthetic */ float access$1202(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mScaleY = r1
            return r1
    }

    static /* synthetic */ float access$1300(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mTransitionPathRotate
            return r0
    }

    static /* synthetic */ float access$1302(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mTransitionPathRotate = r1
            return r1
    }

    static /* synthetic */ float access$1400(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mTranslationX
            return r0
    }

    static /* synthetic */ float access$1402(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mTranslationX = r1
            return r1
    }

    static /* synthetic */ float access$1500(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mTranslationY
            return r0
    }

    static /* synthetic */ float access$1502(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mTranslationY = r1
            return r1
    }

    static /* synthetic */ float access$1600(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mTranslationZ
            return r0
    }

    static /* synthetic */ float access$1602(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mTranslationZ = r1
            return r1
    }

    static /* synthetic */ float access$1700(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mProgress
            return r0
    }

    static /* synthetic */ float access$1702(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mProgress = r1
            return r1
    }

    static /* synthetic */ float access$200(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mRotation
            return r0
    }

    static /* synthetic */ float access$202(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mRotation = r1
            return r1
    }

    static /* synthetic */ int access$300(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            int r0 = r0.mCurveFit
            return r0
    }

    static /* synthetic */ int access$302(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, int r1) {
            r0.mCurveFit = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$402(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, java.lang.String r1) {
            r0.mCustomWaveShape = r1
            return r1
    }

    static /* synthetic */ int access$500(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            int r0 = r0.mWaveShape
            return r0
    }

    static /* synthetic */ int access$502(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, int r1) {
            r0.mWaveShape = r1
            return r1
    }

    static /* synthetic */ float access$600(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mWavePeriod
            return r0
    }

    static /* synthetic */ float access$602(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mWavePeriod = r1
            return r1
    }

    static /* synthetic */ float access$700(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mWaveOffset
            return r0
    }

    static /* synthetic */ float access$702(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mWaveOffset = r1
            return r1
    }

    static /* synthetic */ float access$800(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mScaleX
            return r0
    }

    static /* synthetic */ float access$802(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mScaleX = r1
            return r1
    }

    static /* synthetic */ float access$900(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mRotationX
            return r0
    }

    static /* synthetic */ float access$902(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mRotationX = r1
            return r1
    }

    public void addTimeValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r11) {
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
            androidx.constraintlayout.motion.utils.ViewTimeCycle r3 = (androidx.constraintlayout.motion.utils.ViewTimeCycle) r3
            if (r3 != 0) goto L1e
            goto L8
        L1e:
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L45
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r10.mCustomConstraints
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            if (r6 == 0) goto L8
            r4 = r3
            androidx.constraintlayout.motion.utils.ViewTimeCycle$CustomSet r4 = (androidx.constraintlayout.motion.utils.ViewTimeCycle.CustomSet) r4
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
                case -1225497657: goto Lbb;
                case -1225497656: goto Lb0;
                case -1225497655: goto La5;
                case -1001078227: goto L9a;
                case -908189618: goto L8f;
                case -908189617: goto L86;
                case -40300674: goto L7a;
                case -4379043: goto L6d;
                case 37232917: goto L60;
                case 92909918: goto L53;
                default: goto L50;
            }
        L50:
            r4 = r5
            goto Ldc
        L53:
            java.lang.String r2 = "alpha"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L5c
            goto L50
        L5c:
            r4 = 11
            goto Ldc
        L60:
            java.lang.String r2 = "transitionPathRotate"
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
            java.lang.String r2 = "rotation"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L83
            goto L50
        L83:
            r4 = 8
            goto Ldc
        L86:
            java.lang.String r2 = "scaleY"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Ldc
            goto L50
        L8f:
            java.lang.String r2 = "scaleX"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L98
            goto L50
        L98:
            r4 = 6
            goto Ldc
        L9a:
            java.lang.String r2 = "progress"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto La3
            goto L50
        La3:
            r4 = 5
            goto Ldc
        La5:
            java.lang.String r2 = "translationZ"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lae
            goto L50
        Lae:
            r4 = 4
            goto Ldc
        Lb0:
            java.lang.String r2 = "translationY"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lb9
            goto L50
        Lb9:
            r4 = 3
            goto Ldc
        Lbb:
            java.lang.String r2 = "translationX"
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
            android.util.Log.e(r2, r1)
            goto L8
        Lfb:
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
        L112:
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
        L129:
            float r1 = r10.mElevation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mElevation
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L140:
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
        L157:
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
        L16e:
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
        L185:
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
        L19c:
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
        L1b3:
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
        L1ca:
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

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r2) {
            r1 = this;
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = " KeyTimeCycles do not support SplineSet"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key clone() {
            r1 = this;
            androidx.constraintlayout.motion.widget.KeyTimeCycle r0 = new androidx.constraintlayout.motion.widget.KeyTimeCycle
            r0.<init>()
            androidx.constraintlayout.motion.widget.Key r0 = r0.copy(r1)
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo129clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.constraintlayout.motion.widget.Key r0 = r1.clone()
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key r2) {
            r1 = this;
            super.copy(r2)
            androidx.constraintlayout.motion.widget.KeyTimeCycle r2 = (androidx.constraintlayout.motion.widget.KeyTimeCycle) r2
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

    @Override // androidx.constraintlayout.motion.widget.Key
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
            java.lang.String r0 = "rotation"
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
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "translationX"
            r5.add(r0)
        L4e:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "translationY"
            r5.add(r0)
        L5b:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "translationZ"
            r5.add(r0)
        L68:
            float r0 = r4.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "transitionPathRotate"
            r5.add(r0)
        L75:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = "scaleX"
            r5.add(r0)
        L82:
            float r0 = r4.mScaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8f
            java.lang.String r0 = "scaleY"
            r5.add(r0)
        L8f:
            float r0 = r4.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "progress"
            r5.add(r0)
        L9c:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            int r0 = r0.size()
            if (r0 <= 0) goto Lcd
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lae:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lcd
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "CUSTOM,"
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r5.add(r1)
            goto Lae
        Lcd:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.KeyTimeCycle
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.read(r1, r2)
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> r5) {
            r4 = this;
            int r0 = r4.mCurveFit
            r1 = -1
            if (r0 != r1) goto L6
            return
        L6:
            float r0 = r4.mAlpha
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L19
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "alpha"
            r5.put(r1, r0)
        L19:
            float r0 = r4.mElevation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L2c
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "elevation"
            r5.put(r1, r0)
        L2c:
            float r0 = r4.mRotation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L3f
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotation"
            r5.put(r1, r0)
        L3f:
            float r0 = r4.mRotationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L52
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationX"
            r5.put(r1, r0)
        L52:
            float r0 = r4.mRotationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L65
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationY"
            r5.put(r1, r0)
        L65:
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L78
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationX"
            r5.put(r1, r0)
        L78:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8b
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationY"
            r5.put(r1, r0)
        L8b:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9e
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationZ"
            r5.put(r1, r0)
        L9e:
            float r0 = r4.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb1
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transitionPathRotate"
            r5.put(r1, r0)
        Lb1:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lc4
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleX"
            r5.put(r1, r0)
        Lc4:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld7
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleY"
            r5.put(r1, r0)
        Ld7:
            float r0 = r4.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lea
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "progress"
            r5.put(r1, r0)
        Lea:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            int r0 = r0.size()
            if (r0 <= 0) goto L121
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lfc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L121
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "CUSTOM,"
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            int r2 = r4.mCurveFit
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.put(r1, r2)
            goto Lfc
        L121:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            r4.hashCode()
            int r0 = r4.hashCode()
            r1 = 7
            r2 = -1
            switch(r0) {
                case -1913008125: goto Ld9;
                case -1812823328: goto Lce;
                case -1249320806: goto Lc3;
                case -1249320805: goto Lb8;
                case -1225497657: goto Lad;
                case -1225497656: goto La2;
                case -1225497655: goto L97;
                case -908189618: goto L8c;
                case -908189617: goto L7e;
                case -40300674: goto L70;
                case -4379043: goto L62;
                case 37232917: goto L54;
                case 92909918: goto L46;
                case 156108012: goto L38;
                case 184161818: goto L2a;
                case 579057826: goto L1c;
                case 1532805160: goto Le;
                default: goto Lc;
            }
        Lc:
            goto Le3
        Le:
            java.lang.String r0 = "waveShape"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L18
            goto Le3
        L18:
            r2 = 16
            goto Le3
        L1c:
            java.lang.String r0 = "curveFit"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L26
            goto Le3
        L26:
            r2 = 15
            goto Le3
        L2a:
            java.lang.String r0 = "wavePeriod"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L34
            goto Le3
        L34:
            r2 = 14
            goto Le3
        L38:
            java.lang.String r0 = "waveOffset"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L42
            goto Le3
        L42:
            r2 = 13
            goto Le3
        L46:
            java.lang.String r0 = "alpha"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L50
            goto Le3
        L50:
            r2 = 12
            goto Le3
        L54:
            java.lang.String r0 = "transitionPathRotate"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L5e
            goto Le3
        L5e:
            r2 = 11
            goto Le3
        L62:
            java.lang.String r0 = "elevation"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L6c
            goto Le3
        L6c:
            r2 = 10
            goto Le3
        L70:
            java.lang.String r0 = "rotation"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L7a
            goto Le3
        L7a:
            r2 = 9
            goto Le3
        L7e:
            java.lang.String r0 = "scaleY"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L88
            goto Le3
        L88:
            r2 = 8
            goto Le3
        L8c:
            java.lang.String r0 = "scaleX"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L95
            goto Le3
        L95:
            r2 = r1
            goto Le3
        L97:
            java.lang.String r0 = "translationZ"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto La0
            goto Le3
        La0:
            r2 = 6
            goto Le3
        La2:
            java.lang.String r0 = "translationY"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lab
            goto Le3
        Lab:
            r2 = 5
            goto Le3
        Lad:
            java.lang.String r0 = "translationX"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lb6
            goto Le3
        Lb6:
            r2 = 4
            goto Le3
        Lb8:
            java.lang.String r0 = "rotationY"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lc1
            goto Le3
        Lc1:
            r2 = 3
            goto Le3
        Lc3:
            java.lang.String r0 = "rotationX"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lcc
            goto Le3
        Lcc:
            r2 = 2
            goto Le3
        Lce:
            java.lang.String r0 = "transitionEasing"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Ld7
            goto Le3
        Ld7:
            r2 = 1
            goto Le3
        Ld9:
            java.lang.String r0 = "motionProgress"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Le2
            goto Le3
        Le2:
            r2 = 0
        Le3:
            switch(r2) {
                case 0: goto L168;
                case 1: goto L161;
                case 2: goto L15a;
                case 3: goto L153;
                case 4: goto L14c;
                case 5: goto L145;
                case 6: goto L13e;
                case 7: goto L137;
                case 8: goto L130;
                case 9: goto L129;
                case 10: goto L122;
                case 11: goto L11b;
                case 12: goto L114;
                case 13: goto L10d;
                case 14: goto L106;
                case 15: goto Lfe;
                case 16: goto Le8;
                default: goto Le6;
            }
        Le6:
            goto L16e
        Le8:
            boolean r4 = r5 instanceof java.lang.Integer
            if (r4 == 0) goto Lf4
            int r4 = r3.toInt(r5)
            r3.mWaveShape = r4
            goto L16e
        Lf4:
            r3.mWaveShape = r1
            java.lang.String r4 = r5.toString()
            r3.mCustomWaveShape = r4
            goto L16e
        Lfe:
            int r4 = r3.toInt(r5)
            r3.mCurveFit = r4
            goto L16e
        L106:
            float r4 = r3.toFloat(r5)
            r3.mWavePeriod = r4
            goto L16e
        L10d:
            float r4 = r3.toFloat(r5)
            r3.mWaveOffset = r4
            goto L16e
        L114:
            float r4 = r3.toFloat(r5)
            r3.mAlpha = r4
            goto L16e
        L11b:
            float r4 = r3.toFloat(r5)
            r3.mTransitionPathRotate = r4
            goto L16e
        L122:
            float r4 = r3.toFloat(r5)
            r3.mElevation = r4
            goto L16e
        L129:
            float r4 = r3.toFloat(r5)
            r3.mRotation = r4
            goto L16e
        L130:
            float r4 = r3.toFloat(r5)
            r3.mScaleY = r4
            goto L16e
        L137:
            float r4 = r3.toFloat(r5)
            r3.mScaleX = r4
            goto L16e
        L13e:
            float r4 = r3.toFloat(r5)
            r3.mTranslationZ = r4
            goto L16e
        L145:
            float r4 = r3.toFloat(r5)
            r3.mTranslationY = r4
            goto L16e
        L14c:
            float r4 = r3.toFloat(r5)
            r3.mTranslationX = r4
            goto L16e
        L153:
            float r4 = r3.toFloat(r5)
            r3.mRotationY = r4
            goto L16e
        L15a:
            float r4 = r3.toFloat(r5)
            r3.mRotationX = r4
            goto L16e
        L161:
            java.lang.String r4 = r5.toString()
            r3.mTransitionEasing = r4
            goto L16e
        L168:
            float r4 = r3.toFloat(r5)
            r3.mProgress = r4
        L16e:
            return
    }
}
