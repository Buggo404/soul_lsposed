package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class KeyCycle extends androidx.constraintlayout.motion.widget.Key {
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
    private int mWaveVariesBy;

    private static class Loader {
        private static final int ANDROID_ALPHA = 9;
        private static final int ANDROID_ELEVATION = 10;
        private static final int ANDROID_ROTATION = 11;
        private static final int ANDROID_ROTATION_X = 12;
        private static final int ANDROID_ROTATION_Y = 13;
        private static final int ANDROID_SCALE_X = 15;
        private static final int ANDROID_SCALE_Y = 16;
        private static final int ANDROID_TRANSLATION_X = 17;
        private static final int ANDROID_TRANSLATION_Y = 18;
        private static final int ANDROID_TRANSLATION_Z = 19;
        private static final int CURVE_FIT = 4;
        private static final int FRAME_POSITION = 2;
        private static final int PROGRESS = 20;
        private static final int TARGET_ID = 1;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 14;
        private static final int WAVE_OFFSET = 7;
        private static final int WAVE_PERIOD = 6;
        private static final int WAVE_PHASE = 21;
        private static final int WAVE_SHAPE = 5;
        private static final int WAVE_VARIES_BY = 8;
        private static android.util.SparseIntArray mAttrMap;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap = r0
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_motionTarget
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_framePosition
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_transitionEasing
                r2 = 3
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_curveFit
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_waveShape
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_wavePeriod
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_waveOffset
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_waveVariesBy
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_android_alpha
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_android_elevation
                r2 = 10
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_android_rotation
                r2 = 11
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_android_rotationX
                r2 = 12
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_android_rotationY
                r2 = 13
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_transitionPathRotate
                r2 = 14
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_android_scaleX
                r2 = 15
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_android_scaleY
                r2 = 16
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_android_translationX
                r2 = 17
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_android_translationY
                r2 = 18
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_android_translationZ
                r2 = 19
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_motionProgress
                r2 = 20
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle_wavePhase
                r2 = 21
                r0.append(r1, r2)
                return
        }

        private Loader() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void access$000(androidx.constraintlayout.motion.widget.KeyCycle r0, android.content.res.TypedArray r1) {
                read(r0, r1)
                return
        }

        private static void read(androidx.constraintlayout.motion.widget.KeyCycle r5, android.content.res.TypedArray r6) {
                int r0 = r6.getIndexCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L198
                int r2 = r6.getIndex(r1)
                android.util.SparseIntArray r3 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r3 = r3.get(r2)
                r4 = 3
                switch(r3) {
                    case 1: goto L165;
                    case 2: goto L15c;
                    case 3: goto L154;
                    case 4: goto L148;
                    case 5: goto L128;
                    case 6: goto L11b;
                    case 7: goto Lf8;
                    case 8: goto Leb;
                    case 9: goto Lde;
                    case 10: goto Ld1;
                    case 11: goto Lc4;
                    case 12: goto Lb7;
                    case 13: goto Laa;
                    case 14: goto L9d;
                    case 15: goto L90;
                    case 16: goto L83;
                    case 17: goto L76;
                    case 18: goto L69;
                    case 19: goto L5c;
                    case 20: goto L4f;
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
                android.util.SparseIntArray r4 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r2 = r4.get(r2)
                java.lang.StringBuilder r2 = r3.append(r2)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "KeyCycle"
                android.util.Log.e(r3, r2)
                goto L194
            L3f:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$2000(r5)
                float r2 = r6.getFloat(r2, r3)
                r3 = 1135869952(0x43b40000, float:360.0)
                float r2 = r2 / r3
                androidx.constraintlayout.motion.widget.KeyCycle.access$2002(r5, r2)
                goto L194
            L4f:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1900(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1902(r5, r2)
                goto L194
            L5c:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1800(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1802(r5, r2)
                goto L194
            L69:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1700(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1702(r5, r2)
                goto L194
            L76:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1600(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1602(r5, r2)
                goto L194
            L83:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1500(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1502(r5, r2)
                goto L194
            L90:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1400(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1402(r5, r2)
                goto L194
            L9d:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1300(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1302(r5, r2)
                goto L194
            Laa:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1200(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1202(r5, r2)
                goto L194
            Lb7:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1100(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1102(r5, r2)
                goto L194
            Lc4:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1000(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1002(r5, r2)
                goto L194
            Ld1:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$900(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$902(r5, r2)
                goto L194
            Lde:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$800(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$802(r5, r2)
                goto L194
            Leb:
                int r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$700(r5)
                int r2 = r6.getInt(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$702(r5, r2)
                goto L194
            Lf8:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                r4 = 5
                if (r3 != r4) goto L10e
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$600(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$602(r5, r2)
                goto L194
            L10e:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$600(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$602(r5, r2)
                goto L194
            L11b:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$500(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$502(r5, r2)
                goto L194
            L128:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                if (r3 != r4) goto L13c
                java.lang.String r2 = r6.getString(r2)
                androidx.constraintlayout.motion.widget.KeyCycle.access$302(r5, r2)
                r2 = 7
                androidx.constraintlayout.motion.widget.KeyCycle.access$402(r5, r2)
                goto L194
            L13c:
                int r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$400(r5)
                int r2 = r6.getInt(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$402(r5, r2)
                goto L194
            L148:
                int r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$200(r5)
                int r2 = r6.getInteger(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$202(r5, r2)
                goto L194
            L154:
                java.lang.String r2 = r6.getString(r2)
                androidx.constraintlayout.motion.widget.KeyCycle.access$102(r5, r2)
                goto L194
            L15c:
                int r3 = r5.mFramePosition
                int r2 = r6.getInt(r2, r3)
                r5.mFramePosition = r2
                goto L194
            L165:
                boolean r3 = androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE
                if (r3 == 0) goto L17d
                int r3 = r5.mTargetId
                int r3 = r6.getResourceId(r2, r3)
                r5.mTargetId = r3
                int r3 = r5.mTargetId
                r4 = -1
                if (r3 != r4) goto L194
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L194
            L17d:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                if (r3 != r4) goto L18c
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L194
            L18c:
                int r3 = r5.mTargetId
                int r2 = r6.getResourceId(r2, r3)
                r5.mTargetId = r2
            L194:
                int r1 = r1 + 1
                goto L5
            L198:
                return
        }
    }

    public KeyCycle() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mTransitionEasing = r0
            r1 = 0
            r3.mCurveFit = r1
            r1 = -1
            r3.mWaveShape = r1
            r3.mCustomWaveShape = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r3.mWavePeriod = r0
            r2 = 0
            r3.mWaveOffset = r2
            r3.mWavePhase = r2
            r3.mProgress = r0
            r3.mWaveVariesBy = r1
            r3.mAlpha = r0
            r3.mElevation = r0
            r3.mRotation = r0
            r3.mTransitionPathRotate = r0
            r3.mRotationX = r0
            r3.mRotationY = r0
            r3.mScaleX = r0
            r3.mScaleY = r0
            r3.mTranslationX = r0
            r3.mTranslationY = r0
            r3.mTranslationZ = r0
            r0 = 4
            r3.mType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.mCustomConstraints = r0
            return
    }

    static /* synthetic */ float access$1000(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mRotation
            return r0
    }

    static /* synthetic */ float access$1002(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mRotation = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$102(androidx.constraintlayout.motion.widget.KeyCycle r0, java.lang.String r1) {
            r0.mTransitionEasing = r1
            return r1
    }

    static /* synthetic */ float access$1100(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mRotationX
            return r0
    }

    static /* synthetic */ float access$1102(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mRotationX = r1
            return r1
    }

    static /* synthetic */ float access$1200(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mRotationY
            return r0
    }

    static /* synthetic */ float access$1202(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mRotationY = r1
            return r1
    }

    static /* synthetic */ float access$1300(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mTransitionPathRotate
            return r0
    }

    static /* synthetic */ float access$1302(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mTransitionPathRotate = r1
            return r1
    }

    static /* synthetic */ float access$1400(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mScaleX
            return r0
    }

    static /* synthetic */ float access$1402(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mScaleX = r1
            return r1
    }

    static /* synthetic */ float access$1500(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mScaleY
            return r0
    }

    static /* synthetic */ float access$1502(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mScaleY = r1
            return r1
    }

    static /* synthetic */ float access$1600(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mTranslationX
            return r0
    }

    static /* synthetic */ float access$1602(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mTranslationX = r1
            return r1
    }

    static /* synthetic */ float access$1700(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mTranslationY
            return r0
    }

    static /* synthetic */ float access$1702(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mTranslationY = r1
            return r1
    }

    static /* synthetic */ float access$1800(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mTranslationZ
            return r0
    }

    static /* synthetic */ float access$1802(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mTranslationZ = r1
            return r1
    }

    static /* synthetic */ float access$1900(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mProgress
            return r0
    }

    static /* synthetic */ float access$1902(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mProgress = r1
            return r1
    }

    static /* synthetic */ int access$200(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            int r0 = r0.mCurveFit
            return r0
    }

    static /* synthetic */ float access$2000(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mWavePhase
            return r0
    }

    static /* synthetic */ float access$2002(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mWavePhase = r1
            return r1
    }

    static /* synthetic */ int access$202(androidx.constraintlayout.motion.widget.KeyCycle r0, int r1) {
            r0.mCurveFit = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$302(androidx.constraintlayout.motion.widget.KeyCycle r0, java.lang.String r1) {
            r0.mCustomWaveShape = r1
            return r1
    }

    static /* synthetic */ int access$400(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            int r0 = r0.mWaveShape
            return r0
    }

    static /* synthetic */ int access$402(androidx.constraintlayout.motion.widget.KeyCycle r0, int r1) {
            r0.mWaveShape = r1
            return r1
    }

    static /* synthetic */ float access$500(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mWavePeriod
            return r0
    }

    static /* synthetic */ float access$502(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mWavePeriod = r1
            return r1
    }

    static /* synthetic */ float access$600(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mWaveOffset
            return r0
    }

    static /* synthetic */ float access$602(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mWaveOffset = r1
            return r1
    }

    static /* synthetic */ int access$700(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            int r0 = r0.mWaveVariesBy
            return r0
    }

    static /* synthetic */ int access$702(androidx.constraintlayout.motion.widget.KeyCycle r0, int r1) {
            r0.mWaveVariesBy = r1
            return r1
    }

    static /* synthetic */ float access$800(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mAlpha
            return r0
    }

    static /* synthetic */ float access$802(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mAlpha = r1
            return r1
    }

    static /* synthetic */ float access$900(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mElevation
            return r0
    }

    static /* synthetic */ float access$902(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mElevation = r1
            return r1
    }

    public void addCycleValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r25) {
            r24 = this;
            r0 = r24
            r1 = r25
            java.util.Set r2 = r25.keySet()
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "CUSTOM"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L59
            r4 = 7
            java.lang.String r4 = r3.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r0.mCustomConstraints
            java.lang.Object r4 = r5.get(r4)
            r14 = r4
            androidx.constraintlayout.widget.ConstraintAttribute r14 = (androidx.constraintlayout.widget.ConstraintAttribute) r14
            if (r14 == 0) goto Lc
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r4 = r14.getType()
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r5 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE
            if (r4 == r5) goto L39
            goto Lc
        L39:
            java.lang.Object r3 = r1.get(r3)
            r5 = r3
            androidx.constraintlayout.motion.utils.ViewOscillator r5 = (androidx.constraintlayout.motion.utils.ViewOscillator) r5
            if (r5 != 0) goto L43
            goto Lc
        L43:
            int r6 = r0.mFramePosition
            int r7 = r0.mWaveShape
            java.lang.String r8 = r0.mCustomWaveShape
            int r9 = r0.mWaveVariesBy
            float r10 = r0.mWavePeriod
            float r11 = r0.mWaveOffset
            float r12 = r0.mWavePhase
            float r13 = r14.getValueToInterpolate()
            r5.setPoint(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto Lc
        L59:
            float r23 = r0.getValue(r3)
            boolean r4 = java.lang.Float.isNaN(r23)
            if (r4 == 0) goto L64
            goto Lc
        L64:
            java.lang.Object r3 = r1.get(r3)
            r15 = r3
            androidx.constraintlayout.motion.utils.ViewOscillator r15 = (androidx.constraintlayout.motion.utils.ViewOscillator) r15
            if (r15 != 0) goto L6e
            goto Lc
        L6e:
            int r3 = r0.mFramePosition
            int r4 = r0.mWaveShape
            java.lang.String r5 = r0.mCustomWaveShape
            int r6 = r0.mWaveVariesBy
            float r7 = r0.mWavePeriod
            float r8 = r0.mWaveOffset
            float r9 = r0.mWavePhase
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r15.setPoint(r16, r17, r18, r19, r20, r21, r22, r23)
            goto Lc
        L8f:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "add "
            r0.<init>(r1)
            int r1 = r7.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " values"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "KeyCycle"
            r2 = 2
            androidx.constraintlayout.motion.widget.Debug.logStack(r1, r0, r2)
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L193
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r7.get(r1)
            androidx.constraintlayout.core.motion.utils.SplineSet r3 = (androidx.constraintlayout.core.motion.utils.SplineSet) r3
            if (r3 != 0) goto L3c
            goto L27
        L3c:
            r1.hashCode()
            int r4 = r1.hashCode()
            r5 = -1
            switch(r4) {
                case -1249320806: goto Lea;
                case -1249320805: goto Ldf;
                case -1225497657: goto Ld4;
                case -1225497656: goto Lc9;
                case -1225497655: goto Lbe;
                case -1001078227: goto Lb3;
                case -908189618: goto La8;
                case -908189617: goto L9d;
                case -40300674: goto L8f;
                case -4379043: goto L81;
                case 37232917: goto L73;
                case 92909918: goto L65;
                case 156108012: goto L57;
                case 1530034690: goto L49;
                default: goto L47;
            }
        L47:
            goto Lf4
        L49:
            java.lang.String r4 = "wavePhase"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L53
            goto Lf4
        L53:
            r5 = 13
            goto Lf4
        L57:
            java.lang.String r4 = "waveOffset"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L61
            goto Lf4
        L61:
            r5 = 12
            goto Lf4
        L65:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L6f
            goto Lf4
        L6f:
            r5 = 11
            goto Lf4
        L73:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L7d
            goto Lf4
        L7d:
            r5 = 10
            goto Lf4
        L81:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L8b
            goto Lf4
        L8b:
            r5 = 9
            goto Lf4
        L8f:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L99
            goto Lf4
        L99:
            r5 = 8
            goto Lf4
        L9d:
            java.lang.String r4 = "scaleY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto La6
            goto Lf4
        La6:
            r5 = 7
            goto Lf4
        La8:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lb1
            goto Lf4
        Lb1:
            r5 = 6
            goto Lf4
        Lb3:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lbc
            goto Lf4
        Lbc:
            r5 = 5
            goto Lf4
        Lbe:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lc7
            goto Lf4
        Lc7:
            r5 = 4
            goto Lf4
        Lc9:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Ld2
            goto Lf4
        Ld2:
            r5 = 3
            goto Lf4
        Ld4:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Ldd
            goto Lf4
        Ldd:
            r5 = r2
            goto Lf4
        Ldf:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Le8
            goto Lf4
        Le8:
            r5 = 1
            goto Lf4
        Lea:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lf3
            goto Lf4
        Lf3:
            r5 = 0
        Lf4:
            switch(r5) {
                case 0: goto L18a;
                case 1: goto L181;
                case 2: goto L178;
                case 3: goto L16f;
                case 4: goto L166;
                case 5: goto L15d;
                case 6: goto L154;
                case 7: goto L14b;
                case 8: goto L142;
                case 9: goto L139;
                case 10: goto L130;
                case 11: goto L127;
                case 12: goto L11e;
                case 13: goto L115;
                default: goto Lf7;
            }
        Lf7:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "  UNKNOWN  "
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "WARNING KeyCycle"
            android.util.Log.v(r3, r1)
            goto L27
        L115:
            int r1 = r6.mFramePosition
            float r4 = r6.mWavePhase
            r3.setPoint(r1, r4)
            goto L27
        L11e:
            int r1 = r6.mFramePosition
            float r4 = r6.mWaveOffset
            r3.setPoint(r1, r4)
            goto L27
        L127:
            int r1 = r6.mFramePosition
            float r4 = r6.mAlpha
            r3.setPoint(r1, r4)
            goto L27
        L130:
            int r1 = r6.mFramePosition
            float r4 = r6.mTransitionPathRotate
            r3.setPoint(r1, r4)
            goto L27
        L139:
            int r1 = r6.mFramePosition
            float r4 = r6.mElevation
            r3.setPoint(r1, r4)
            goto L27
        L142:
            int r1 = r6.mFramePosition
            float r4 = r6.mRotation
            r3.setPoint(r1, r4)
            goto L27
        L14b:
            int r1 = r6.mFramePosition
            float r4 = r6.mScaleY
            r3.setPoint(r1, r4)
            goto L27
        L154:
            int r1 = r6.mFramePosition
            float r4 = r6.mScaleX
            r3.setPoint(r1, r4)
            goto L27
        L15d:
            int r1 = r6.mFramePosition
            float r4 = r6.mProgress
            r3.setPoint(r1, r4)
            goto L27
        L166:
            int r1 = r6.mFramePosition
            float r4 = r6.mTranslationZ
            r3.setPoint(r1, r4)
            goto L27
        L16f:
            int r1 = r6.mFramePosition
            float r4 = r6.mTranslationY
            r3.setPoint(r1, r4)
            goto L27
        L178:
            int r1 = r6.mFramePosition
            float r4 = r6.mTranslationX
            r3.setPoint(r1, r4)
            goto L27
        L181:
            int r1 = r6.mFramePosition
            float r4 = r6.mRotationY
            r3.setPoint(r1, r4)
            goto L27
        L18a:
            int r1 = r6.mFramePosition
            float r4 = r6.mRotationX
            r3.setPoint(r1, r4)
            goto L27
        L193:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key clone() {
            r1 = this;
            androidx.constraintlayout.motion.widget.KeyCycle r0 = new androidx.constraintlayout.motion.widget.KeyCycle
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
            androidx.constraintlayout.motion.widget.KeyCycle r2 = (androidx.constraintlayout.motion.widget.KeyCycle) r2
            java.lang.String r0 = r2.mTransitionEasing
            r1.mTransitionEasing = r0
            int r0 = r2.mCurveFit
            r1.mCurveFit = r0
            int r0 = r2.mWaveShape
            r1.mWaveShape = r0
            java.lang.String r0 = r2.mCustomWaveShape
            r1.mCustomWaveShape = r0
            float r0 = r2.mWavePeriod
            r1.mWavePeriod = r0
            float r0 = r2.mWaveOffset
            r1.mWaveOffset = r0
            float r0 = r2.mWavePhase
            r1.mWavePhase = r0
            float r0 = r2.mProgress
            r1.mProgress = r0
            int r0 = r2.mWaveVariesBy
            r1.mWaveVariesBy = r0
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
            java.lang.String r0 = "transitionPathRotate"
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
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            int r0 = r0.size()
            if (r0 <= 0) goto Lc0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
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

    public float getValue(java.lang.String r3) {
            r2 = this;
            r3.hashCode()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1249320806: goto Lae;
                case -1249320805: goto La3;
                case -1225497657: goto L98;
                case -1225497656: goto L8d;
                case -1225497655: goto L82;
                case -1001078227: goto L77;
                case -908189618: goto L6c;
                case -908189617: goto L61;
                case -40300674: goto L53;
                case -4379043: goto L45;
                case 37232917: goto L37;
                case 92909918: goto L29;
                case 156108012: goto L1b;
                case 1530034690: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Lb8
        Ld:
            java.lang.String r0 = "wavePhase"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L17
            goto Lb8
        L17:
            r1 = 13
            goto Lb8
        L1b:
            java.lang.String r0 = "waveOffset"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L25
            goto Lb8
        L25:
            r1 = 12
            goto Lb8
        L29:
            java.lang.String r0 = "alpha"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L33
            goto Lb8
        L33:
            r1 = 11
            goto Lb8
        L37:
            java.lang.String r0 = "transitionPathRotate"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L41
            goto Lb8
        L41:
            r1 = 10
            goto Lb8
        L45:
            java.lang.String r0 = "elevation"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4f
            goto Lb8
        L4f:
            r1 = 9
            goto Lb8
        L53:
            java.lang.String r0 = "rotation"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5d
            goto Lb8
        L5d:
            r1 = 8
            goto Lb8
        L61:
            java.lang.String r0 = "scaleY"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6a
            goto Lb8
        L6a:
            r1 = 7
            goto Lb8
        L6c:
            java.lang.String r0 = "scaleX"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L75
            goto Lb8
        L75:
            r1 = 6
            goto Lb8
        L77:
            java.lang.String r0 = "progress"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L80
            goto Lb8
        L80:
            r1 = 5
            goto Lb8
        L82:
            java.lang.String r0 = "translationZ"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L8b
            goto Lb8
        L8b:
            r1 = 4
            goto Lb8
        L8d:
            java.lang.String r0 = "translationY"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L96
            goto Lb8
        L96:
            r1 = 3
            goto Lb8
        L98:
            java.lang.String r0 = "translationX"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto La1
            goto Lb8
        La1:
            r1 = 2
            goto Lb8
        La3:
            java.lang.String r0 = "rotationY"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lac
            goto Lb8
        Lac:
            r1 = 1
            goto Lb8
        Lae:
            java.lang.String r0 = "rotationX"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lb7
            goto Lb8
        Lb7:
            r1 = 0
        Lb8:
            switch(r1) {
                case 0: goto L101;
                case 1: goto Lfe;
                case 2: goto Lfb;
                case 3: goto Lf8;
                case 4: goto Lf5;
                case 5: goto Lf2;
                case 6: goto Lef;
                case 7: goto Lec;
                case 8: goto Le9;
                case 9: goto Le6;
                case 10: goto Le3;
                case 11: goto Le0;
                case 12: goto Ldd;
                case 13: goto Lda;
                default: goto Lbb;
            }
        Lbb:
            java.lang.String r0 = "CUSTOM"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto Ld7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "  UNKNOWN  "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "WARNING! KeyCycle"
            android.util.Log.v(r0, r3)
        Ld7:
            r3 = 2143289344(0x7fc00000, float:NaN)
            return r3
        Lda:
            float r3 = r2.mWavePhase
            return r3
        Ldd:
            float r3 = r2.mWaveOffset
            return r3
        Le0:
            float r3 = r2.mAlpha
            return r3
        Le3:
            float r3 = r2.mTransitionPathRotate
            return r3
        Le6:
            float r3 = r2.mElevation
            return r3
        Le9:
            float r3 = r2.mRotation
            return r3
        Lec:
            float r3 = r2.mScaleY
            return r3
        Lef:
            float r3 = r2.mScaleX
            return r3
        Lf2:
            float r3 = r2.mProgress
            return r3
        Lf5:
            float r3 = r2.mTranslationZ
            return r3
        Lf8:
            float r3 = r2.mTranslationY
            return r3
        Lfb:
            float r3 = r2.mTranslationX
            return r3
        Lfe:
            float r3 = r2.mRotationY
            return r3
        L101:
            float r3 = r2.mRotationX
            return r3
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.KeyCycle
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            androidx.constraintlayout.motion.widget.KeyCycle.Loader.access$000(r1, r2)
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
                case -1913008125: goto Le7;
                case -1812823328: goto Ldc;
                case -1249320806: goto Ld1;
                case -1249320805: goto Lc6;
                case -1225497657: goto Lbb;
                case -1225497656: goto Lb0;
                case -1225497655: goto La5;
                case -908189618: goto L9a;
                case -908189617: goto L8c;
                case -40300674: goto L7e;
                case -4379043: goto L70;
                case 37232917: goto L62;
                case 92909918: goto L54;
                case 156108012: goto L46;
                case 184161818: goto L38;
                case 579057826: goto L2a;
                case 1530034690: goto L1c;
                case 1532805160: goto Le;
                default: goto Lc;
            }
        Lc:
            goto Lf1
        Le:
            java.lang.String r0 = "waveShape"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L18
            goto Lf1
        L18:
            r2 = 17
            goto Lf1
        L1c:
            java.lang.String r0 = "wavePhase"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L26
            goto Lf1
        L26:
            r2 = 16
            goto Lf1
        L2a:
            java.lang.String r0 = "curveFit"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L34
            goto Lf1
        L34:
            r2 = 15
            goto Lf1
        L38:
            java.lang.String r0 = "wavePeriod"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L42
            goto Lf1
        L42:
            r2 = 14
            goto Lf1
        L46:
            java.lang.String r0 = "waveOffset"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L50
            goto Lf1
        L50:
            r2 = 13
            goto Lf1
        L54:
            java.lang.String r0 = "alpha"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L5e
            goto Lf1
        L5e:
            r2 = 12
            goto Lf1
        L62:
            java.lang.String r0 = "transitionPathRotate"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L6c
            goto Lf1
        L6c:
            r2 = 11
            goto Lf1
        L70:
            java.lang.String r0 = "elevation"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L7a
            goto Lf1
        L7a:
            r2 = 10
            goto Lf1
        L7e:
            java.lang.String r0 = "rotation"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L88
            goto Lf1
        L88:
            r2 = 9
            goto Lf1
        L8c:
            java.lang.String r0 = "scaleY"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L96
            goto Lf1
        L96:
            r2 = 8
            goto Lf1
        L9a:
            java.lang.String r0 = "scaleX"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto La3
            goto Lf1
        La3:
            r2 = r1
            goto Lf1
        La5:
            java.lang.String r0 = "translationZ"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lae
            goto Lf1
        Lae:
            r2 = 6
            goto Lf1
        Lb0:
            java.lang.String r0 = "translationY"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lb9
            goto Lf1
        Lb9:
            r2 = 5
            goto Lf1
        Lbb:
            java.lang.String r0 = "translationX"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lc4
            goto Lf1
        Lc4:
            r2 = 4
            goto Lf1
        Lc6:
            java.lang.String r0 = "rotationY"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lcf
            goto Lf1
        Lcf:
            r2 = 3
            goto Lf1
        Ld1:
            java.lang.String r0 = "rotationX"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lda
            goto Lf1
        Lda:
            r2 = 2
            goto Lf1
        Ldc:
            java.lang.String r0 = "transitionEasing"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Le5
            goto Lf1
        Le5:
            r2 = 1
            goto Lf1
        Le7:
            java.lang.String r0 = "motionProgress"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lf0
            goto Lf1
        Lf0:
            r2 = 0
        Lf1:
            switch(r2) {
                case 0: goto L17e;
                case 1: goto L177;
                case 2: goto L170;
                case 3: goto L169;
                case 4: goto L162;
                case 5: goto L15b;
                case 6: goto L154;
                case 7: goto L14d;
                case 8: goto L146;
                case 9: goto L13f;
                case 10: goto L138;
                case 11: goto L131;
                case 12: goto L12a;
                case 13: goto L123;
                case 14: goto L11c;
                case 15: goto L114;
                case 16: goto L10c;
                case 17: goto Lf6;
                default: goto Lf4;
            }
        Lf4:
            goto L184
        Lf6:
            boolean r4 = r5 instanceof java.lang.Integer
            if (r4 == 0) goto L102
            int r4 = r3.toInt(r5)
            r3.mWaveShape = r4
            goto L184
        L102:
            r3.mWaveShape = r1
            java.lang.String r4 = r5.toString()
            r3.mCustomWaveShape = r4
            goto L184
        L10c:
            float r4 = r3.toFloat(r5)
            r3.mWavePhase = r4
            goto L184
        L114:
            int r4 = r3.toInt(r5)
            r3.mCurveFit = r4
            goto L184
        L11c:
            float r4 = r3.toFloat(r5)
            r3.mWavePeriod = r4
            goto L184
        L123:
            float r4 = r3.toFloat(r5)
            r3.mWaveOffset = r4
            goto L184
        L12a:
            float r4 = r3.toFloat(r5)
            r3.mAlpha = r4
            goto L184
        L131:
            float r4 = r3.toFloat(r5)
            r3.mTransitionPathRotate = r4
            goto L184
        L138:
            float r4 = r3.toFloat(r5)
            r3.mElevation = r4
            goto L184
        L13f:
            float r4 = r3.toFloat(r5)
            r3.mRotation = r4
            goto L184
        L146:
            float r4 = r3.toFloat(r5)
            r3.mScaleY = r4
            goto L184
        L14d:
            float r4 = r3.toFloat(r5)
            r3.mScaleX = r4
            goto L184
        L154:
            float r4 = r3.toFloat(r5)
            r3.mTranslationZ = r4
            goto L184
        L15b:
            float r4 = r3.toFloat(r5)
            r3.mTranslationY = r4
            goto L184
        L162:
            float r4 = r3.toFloat(r5)
            r3.mTranslationX = r4
            goto L184
        L169:
            float r4 = r3.toFloat(r5)
            r3.mRotationY = r4
            goto L184
        L170:
            float r4 = r3.toFloat(r5)
            r3.mRotationX = r4
            goto L184
        L177:
            java.lang.String r4 = r5.toString()
            r3.mTransitionEasing = r4
            goto L184
        L17e:
            float r4 = r3.toFloat(r5)
            r3.mProgress = r4
        L184:
            return
    }
}
