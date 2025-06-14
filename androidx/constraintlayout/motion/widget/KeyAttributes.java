package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class KeyAttributes extends androidx.constraintlayout.motion.widget.Key {
    private static final boolean DEBUG = false;
    public static final int KEY_TYPE = 1;
    static final java.lang.String NAME = "KeyAttribute";
    private static final java.lang.String TAG = "KeyAttributes";
    private float mAlpha;
    private int mCurveFit;
    private float mElevation;
    private float mPivotX;
    private float mPivotY;
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
    private boolean mVisibility;

    private static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
        private static final int ANDROID_PIVOT_X = 19;
        private static final int ANDROID_PIVOT_Y = 20;
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
        private static android.util.SparseIntArray mAttrMap;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap = r0
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_android_alpha
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_android_elevation
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_android_rotation
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_android_rotationX
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_android_rotationY
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_android_transformPivotX
                r2 = 19
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_android_transformPivotY
                r2 = 20
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_android_scaleX
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_transitionPathRotate
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_transitionEasing
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_motionTarget
                r2 = 10
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_framePosition
                r2 = 12
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_curveFit
                r2 = 13
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_android_scaleY
                r2 = 14
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_android_translationX
                r2 = 15
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_android_translationY
                r2 = 16
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_android_translationZ
                r2 = 17
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute_motionProgress
                r2 = 18
                r0.append(r1, r2)
                return
        }

        private Loader() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void read(androidx.constraintlayout.motion.widget.KeyAttributes r5, android.content.res.TypedArray r6) {
                int r0 = r6.getIndexCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L141
                int r2 = r6.getIndex(r1)
                android.util.SparseIntArray r3 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r3 = r3.get(r2)
                switch(r3) {
                    case 1: goto L132;
                    case 2: goto L126;
                    case 3: goto L14;
                    case 4: goto L11a;
                    case 5: goto L10e;
                    case 6: goto L102;
                    case 7: goto Lf6;
                    case 8: goto Lea;
                    case 9: goto Le2;
                    case 10: goto Lb0;
                    case 11: goto L14;
                    case 12: goto La6;
                    case 13: goto L99;
                    case 14: goto L8c;
                    case 15: goto L7f;
                    case 16: goto L72;
                    case 17: goto L65;
                    case 18: goto L58;
                    case 19: goto L4b;
                    case 20: goto L3e;
                    default: goto L14;
                }
            L14:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "unused attribute 0x"
                r3.<init>(r4)
                java.lang.String r4 = java.lang.Integer.toHexString(r2)
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = "   "
                java.lang.StringBuilder r3 = r3.append(r4)
                android.util.SparseIntArray r4 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r2 = r4.get(r2)
                java.lang.StringBuilder r2 = r3.append(r2)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "KeyAttribute"
                android.util.Log.e(r3, r2)
                goto L13d
            L3e:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$800(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$802(r5, r2)
                goto L13d
            L4b:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$700(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$702(r5, r2)
                goto L13d
            L58:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1500(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1502(r5, r2)
                goto L13d
            L65:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1400(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1402(r5, r2)
                goto L13d
            L72:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1300(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1302(r5, r2)
                goto L13d
            L7f:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1200(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1202(r5, r2)
                goto L13d
            L8c:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1000(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1002(r5, r2)
                goto L13d
            L99:
                int r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$300(r5)
                int r2 = r6.getInteger(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$302(r5, r2)
                goto L13d
            La6:
                int r3 = r5.mFramePosition
                int r2 = r6.getInt(r2, r3)
                r5.mFramePosition = r2
                goto L13d
            Lb0:
                boolean r3 = androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE
                if (r3 == 0) goto Lc9
                int r3 = r5.mTargetId
                int r3 = r6.getResourceId(r2, r3)
                r5.mTargetId = r3
                int r3 = r5.mTargetId
                r4 = -1
                if (r3 != r4) goto L13d
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L13d
            Lc9:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                r4 = 3
                if (r3 != r4) goto Ld9
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L13d
            Ld9:
                int r3 = r5.mTargetId
                int r2 = r6.getResourceId(r2, r3)
                r5.mTargetId = r2
                goto L13d
            Le2:
                java.lang.String r2 = r6.getString(r2)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$902(r5, r2)
                goto L13d
            Lea:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1100(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1102(r5, r2)
                goto L13d
            Lf6:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$400(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$402(r5, r2)
                goto L13d
            L102:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$600(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$602(r5, r2)
                goto L13d
            L10e:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$500(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$502(r5, r2)
                goto L13d
            L11a:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$200(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$202(r5, r2)
                goto L13d
            L126:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$100(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$102(r5, r2)
                goto L13d
            L132:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$000(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$002(r5, r2)
            L13d:
                int r1 = r1 + 1
                goto L5
            L141:
                return
        }
    }

    public KeyAttributes() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mCurveFit = r0
            r0 = 0
            r1.mVisibility = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mAlpha = r0
            r1.mElevation = r0
            r1.mRotation = r0
            r1.mRotationX = r0
            r1.mRotationY = r0
            r1.mPivotX = r0
            r1.mPivotY = r0
            r1.mTransitionPathRotate = r0
            r1.mScaleX = r0
            r1.mScaleY = r0
            r1.mTranslationX = r0
            r1.mTranslationY = r0
            r1.mTranslationZ = r0
            r1.mProgress = r0
            r0 = 1
            r1.mType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mCustomConstraints = r0
            return
    }

    static /* synthetic */ float access$000(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mAlpha
            return r0
    }

    static /* synthetic */ float access$002(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mAlpha = r1
            return r1
    }

    static /* synthetic */ float access$100(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mElevation
            return r0
    }

    static /* synthetic */ float access$1000(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mScaleY
            return r0
    }

    static /* synthetic */ float access$1002(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mScaleY = r1
            return r1
    }

    static /* synthetic */ float access$102(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mElevation = r1
            return r1
    }

    static /* synthetic */ float access$1100(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mTransitionPathRotate
            return r0
    }

    static /* synthetic */ float access$1102(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mTransitionPathRotate = r1
            return r1
    }

    static /* synthetic */ float access$1200(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mTranslationX
            return r0
    }

    static /* synthetic */ float access$1202(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mTranslationX = r1
            return r1
    }

    static /* synthetic */ float access$1300(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mTranslationY
            return r0
    }

    static /* synthetic */ float access$1302(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mTranslationY = r1
            return r1
    }

    static /* synthetic */ float access$1400(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mTranslationZ
            return r0
    }

    static /* synthetic */ float access$1402(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mTranslationZ = r1
            return r1
    }

    static /* synthetic */ float access$1500(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mProgress
            return r0
    }

    static /* synthetic */ float access$1502(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mProgress = r1
            return r1
    }

    static /* synthetic */ float access$200(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mRotation
            return r0
    }

    static /* synthetic */ float access$202(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mRotation = r1
            return r1
    }

    static /* synthetic */ int access$300(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            int r0 = r0.mCurveFit
            return r0
    }

    static /* synthetic */ int access$302(androidx.constraintlayout.motion.widget.KeyAttributes r0, int r1) {
            r0.mCurveFit = r1
            return r1
    }

    static /* synthetic */ float access$400(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mScaleX
            return r0
    }

    static /* synthetic */ float access$402(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mScaleX = r1
            return r1
    }

    static /* synthetic */ float access$500(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mRotationX
            return r0
    }

    static /* synthetic */ float access$502(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mRotationX = r1
            return r1
    }

    static /* synthetic */ float access$600(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mRotationY
            return r0
    }

    static /* synthetic */ float access$602(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mRotationY = r1
            return r1
    }

    static /* synthetic */ float access$700(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mPivotX
            return r0
    }

    static /* synthetic */ float access$702(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mPivotX = r1
            return r1
    }

    static /* synthetic */ float access$800(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mPivotY
            return r0
    }

    static /* synthetic */ float access$802(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mPivotY = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$902(androidx.constraintlayout.motion.widget.KeyAttributes r0, java.lang.String r1) {
            r0.mTransitionEasing = r1
            return r1
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r7) {
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e3
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            androidx.constraintlayout.core.motion.utils.SplineSet r2 = (androidx.constraintlayout.core.motion.utils.SplineSet) r2
            if (r2 != 0) goto L1d
            goto L8
        L1d:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L3c
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r6.mCustomConstraints
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            if (r1 == 0) goto L8
            androidx.constraintlayout.motion.utils.ViewSpline$CustomSet r2 = (androidx.constraintlayout.motion.utils.ViewSpline.CustomSet) r2
            int r3 = r6.mFramePosition
            r2.setPoint(r3, r1)
            goto L8
        L3c:
            r1.hashCode()
            int r3 = r1.hashCode()
            r5 = -1
            switch(r3) {
                case -1249320806: goto Le5;
                case -1249320805: goto Ld9;
                case -1225497657: goto Lcd;
                case -1225497656: goto Lc1;
                case -1225497655: goto Lb6;
                case -1001078227: goto Lab;
                case -908189618: goto La0;
                case -908189617: goto L97;
                case -760884510: goto L8b;
                case -760884509: goto L7e;
                case -40300674: goto L71;
                case -4379043: goto L64;
                case 37232917: goto L57;
                case 92909918: goto L4a;
                default: goto L47;
            }
        L47:
            r4 = r5
            goto Lf0
        L4a:
            java.lang.String r3 = "alpha"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L53
            goto L47
        L53:
            r4 = 13
            goto Lf0
        L57:
            java.lang.String r3 = "transitionPathRotate"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L60
            goto L47
        L60:
            r4 = 12
            goto Lf0
        L64:
            java.lang.String r3 = "elevation"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6d
            goto L47
        L6d:
            r4 = 11
            goto Lf0
        L71:
            java.lang.String r3 = "rotation"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L7a
            goto L47
        L7a:
            r4 = 10
            goto Lf0
        L7e:
            java.lang.String r3 = "transformPivotY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L87
            goto L47
        L87:
            r4 = 9
            goto Lf0
        L8b:
            java.lang.String r3 = "transformPivotX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L94
            goto L47
        L94:
            r4 = 8
            goto Lf0
        L97:
            java.lang.String r3 = "scaleY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lf0
            goto L47
        La0:
            java.lang.String r3 = "scaleX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto La9
            goto L47
        La9:
            r4 = 6
            goto Lf0
        Lab:
            java.lang.String r3 = "progress"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lb4
            goto L47
        Lb4:
            r4 = 5
            goto Lf0
        Lb6:
            java.lang.String r3 = "translationZ"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lbf
            goto L47
        Lbf:
            r4 = 4
            goto Lf0
        Lc1:
            java.lang.String r3 = "translationY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lcb
            goto L47
        Lcb:
            r4 = 3
            goto Lf0
        Lcd:
            java.lang.String r3 = "translationX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Ld7
            goto L47
        Ld7:
            r4 = 2
            goto Lf0
        Ld9:
            java.lang.String r3 = "rotationY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Le3
            goto L47
        Le3:
            r4 = 1
            goto Lf0
        Le5:
            java.lang.String r3 = "rotationX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lef
            goto L47
        Lef:
            r4 = 0
        Lf0:
            switch(r4) {
                case 0: goto L1d2;
                case 1: goto L1c1;
                case 2: goto L1b0;
                case 3: goto L19f;
                case 4: goto L18e;
                case 5: goto L17d;
                case 6: goto L16c;
                case 7: goto L15b;
                case 8: goto L14a;
                case 9: goto L139;
                case 10: goto L128;
                case 11: goto L117;
                case 12: goto L106;
                case 13: goto Lf5;
                default: goto Lf3;
            }
        Lf3:
            goto L8
        Lf5:
            float r1 = r6.mAlpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mAlpha
            r2.setPoint(r1, r3)
            goto L8
        L106:
            float r1 = r6.mTransitionPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTransitionPathRotate
            r2.setPoint(r1, r3)
            goto L8
        L117:
            float r1 = r6.mElevation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mElevation
            r2.setPoint(r1, r3)
            goto L8
        L128:
            float r1 = r6.mRotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mRotation
            r2.setPoint(r1, r3)
            goto L8
        L139:
            float r1 = r6.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mPivotY
            r2.setPoint(r1, r3)
            goto L8
        L14a:
            float r1 = r6.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mPivotX
            r2.setPoint(r1, r3)
            goto L8
        L15b:
            float r1 = r6.mScaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mScaleY
            r2.setPoint(r1, r3)
            goto L8
        L16c:
            float r1 = r6.mScaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mScaleX
            r2.setPoint(r1, r3)
            goto L8
        L17d:
            float r1 = r6.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mProgress
            r2.setPoint(r1, r3)
            goto L8
        L18e:
            float r1 = r6.mTranslationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationZ
            r2.setPoint(r1, r3)
            goto L8
        L19f:
            float r1 = r6.mTranslationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationY
            r2.setPoint(r1, r3)
            goto L8
        L1b0:
            float r1 = r6.mTranslationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationX
            r2.setPoint(r1, r3)
            goto L8
        L1c1:
            float r1 = r6.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mRotationY
            r2.setPoint(r1, r3)
            goto L8
        L1d2:
            float r1 = r6.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mRotationX
            r2.setPoint(r1, r3)
            goto L8
        L1e3:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key clone() {
            r1 = this;
            androidx.constraintlayout.motion.widget.KeyAttributes r0 = new androidx.constraintlayout.motion.widget.KeyAttributes
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
            androidx.constraintlayout.motion.widget.KeyAttributes r2 = (androidx.constraintlayout.motion.widget.KeyAttributes) r2
            int r0 = r2.mCurveFit
            r1.mCurveFit = r0
            boolean r0 = r2.mVisibility
            r1.mVisibility = r0
            float r0 = r2.mAlpha
            r1.mAlpha = r0
            float r0 = r2.mElevation
            r1.mElevation = r0
            float r0 = r2.mRotation
            r1.mRotation = r0
            float r0 = r2.mRotationX
            r1.mRotationX = r0
            float r0 = r2.mRotationY
            r1.mRotationY = r0
            float r0 = r2.mPivotX
            r1.mPivotX = r0
            float r0 = r2.mPivotY
            r1.mPivotY = r0
            float r0 = r2.mTransitionPathRotate
            r1.mTransitionPathRotate = r0
            float r0 = r2.mScaleX
            r1.mScaleX = r0
            float r0 = r2.mScaleY
            r1.mScaleY = r0
            float r0 = r2.mTranslationX
            r1.mTranslationX = r0
            float r0 = r2.mTranslationY
            r1.mTranslationY = r0
            float r0 = r2.mTranslationZ
            r1.mTranslationZ = r0
            float r2 = r2.mProgress
            r1.mProgress = r2
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
            float r0 = r4.mPivotX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "transformPivotX"
            r5.add(r0)
        L4e:
            float r0 = r4.mPivotY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "transformPivotY"
            r5.add(r0)
        L5b:
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "translationX"
            r5.add(r0)
        L68:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "translationY"
            r5.add(r0)
        L75:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = "translationZ"
            r5.add(r0)
        L82:
            float r0 = r4.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8f
            java.lang.String r0 = "transitionPathRotate"
            r5.add(r0)
        L8f:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "scaleX"
            r5.add(r0)
        L9c:
            float r0 = r4.mScaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto La9
            java.lang.String r0 = "scaleY"
            r5.add(r0)
        La9:
            float r0 = r4.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb6
            java.lang.String r0 = "progress"
            r5.add(r0)
        Lb6:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            int r0 = r0.size()
            if (r0 <= 0) goto Le7
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lc8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le7
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "CUSTOM,"
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r5.add(r1)
            goto Lc8
        Le7:
            return
    }

    int getCurveFit() {
            r1 = this;
            int r0 = r1.mCurveFit
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.KeyAttribute
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            androidx.constraintlayout.motion.widget.KeyAttributes.Loader.read(r1, r2)
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
            float r0 = r4.mPivotX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L78
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transformPivotX"
            r5.put(r1, r0)
        L78:
            float r0 = r4.mPivotY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8b
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transformPivotY"
            r5.put(r1, r0)
        L8b:
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9e
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationX"
            r5.put(r1, r0)
        L9e:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb1
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationY"
            r5.put(r1, r0)
        Lb1:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lc4
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationZ"
            r5.put(r1, r0)
        Lc4:
            float r0 = r4.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld7
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transitionPathRotate"
            r5.put(r1, r0)
        Ld7:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lea
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleX"
            r5.put(r1, r0)
        Lea:
            float r0 = r4.mScaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lfd
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleY"
            r5.put(r1, r0)
        Lfd:
            float r0 = r4.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L110
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "progress"
            r5.put(r1, r0)
        L110:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            int r0 = r0.size()
            if (r0 <= 0) goto L147
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L122:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L147
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
            goto L122
        L147:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            r3.hashCode()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1913008125: goto Ld8;
                case -1812823328: goto Lcd;
                case -1249320806: goto Lc2;
                case -1249320805: goto Lb7;
                case -1225497657: goto Lac;
                case -1225497656: goto La1;
                case -1225497655: goto L96;
                case -908189618: goto L8b;
                case -908189617: goto L7d;
                case -760884510: goto L6f;
                case -760884509: goto L61;
                case -40300674: goto L53;
                case -4379043: goto L45;
                case 37232917: goto L37;
                case 92909918: goto L29;
                case 579057826: goto L1b;
                case 1941332754: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Le2
        Ld:
            java.lang.String r0 = "visibility"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L17
            goto Le2
        L17:
            r1 = 16
            goto Le2
        L1b:
            java.lang.String r0 = "curveFit"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L25
            goto Le2
        L25:
            r1 = 15
            goto Le2
        L29:
            java.lang.String r0 = "alpha"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L33
            goto Le2
        L33:
            r1 = 14
            goto Le2
        L37:
            java.lang.String r0 = "transitionPathRotate"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L41
            goto Le2
        L41:
            r1 = 13
            goto Le2
        L45:
            java.lang.String r0 = "elevation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4f
            goto Le2
        L4f:
            r1 = 12
            goto Le2
        L53:
            java.lang.String r0 = "rotation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5d
            goto Le2
        L5d:
            r1 = 11
            goto Le2
        L61:
            java.lang.String r0 = "transformPivotY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6b
            goto Le2
        L6b:
            r1 = 10
            goto Le2
        L6f:
            java.lang.String r0 = "transformPivotX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L79
            goto Le2
        L79:
            r1 = 9
            goto Le2
        L7d:
            java.lang.String r0 = "scaleY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L87
            goto Le2
        L87:
            r1 = 8
            goto Le2
        L8b:
            java.lang.String r0 = "scaleX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L94
            goto Le2
        L94:
            r1 = 7
            goto Le2
        L96:
            java.lang.String r0 = "translationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L9f
            goto Le2
        L9f:
            r1 = 6
            goto Le2
        La1:
            java.lang.String r0 = "translationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Laa
            goto Le2
        Laa:
            r1 = 5
            goto Le2
        Lac:
            java.lang.String r0 = "translationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb5
            goto Le2
        Lb5:
            r1 = 4
            goto Le2
        Lb7:
            java.lang.String r0 = "rotationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc0
            goto Le2
        Lc0:
            r1 = 3
            goto Le2
        Lc2:
            java.lang.String r0 = "rotationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lcb
            goto Le2
        Lcb:
            r1 = 2
            goto Le2
        Lcd:
            java.lang.String r0 = "transitionEasing"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld6
            goto Le2
        Ld6:
            r1 = 1
            goto Le2
        Ld8:
            java.lang.String r0 = "motionProgress"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Le1
            goto Le2
        Le1:
            r1 = 0
        Le2:
            switch(r1) {
                case 0: goto L159;
                case 1: goto L152;
                case 2: goto L14b;
                case 3: goto L144;
                case 4: goto L13d;
                case 5: goto L136;
                case 6: goto L12f;
                case 7: goto L128;
                case 8: goto L121;
                case 9: goto L11a;
                case 10: goto L113;
                case 11: goto L10c;
                case 12: goto L105;
                case 13: goto Lfe;
                case 14: goto Lf7;
                case 15: goto Lef;
                case 16: goto Le7;
                default: goto Le5;
            }
        Le5:
            goto L15f
        Le7:
            boolean r3 = r2.toBoolean(r4)
            r2.mVisibility = r3
            goto L15f
        Lef:
            int r3 = r2.toInt(r4)
            r2.mCurveFit = r3
            goto L15f
        Lf7:
            float r3 = r2.toFloat(r4)
            r2.mAlpha = r3
            goto L15f
        Lfe:
            float r3 = r2.toFloat(r4)
            r2.mTransitionPathRotate = r3
            goto L15f
        L105:
            float r3 = r2.toFloat(r4)
            r2.mElevation = r3
            goto L15f
        L10c:
            float r3 = r2.toFloat(r4)
            r2.mRotation = r3
            goto L15f
        L113:
            float r3 = r2.toFloat(r4)
            r2.mPivotY = r3
            goto L15f
        L11a:
            float r3 = r2.toFloat(r4)
            r2.mPivotX = r3
            goto L15f
        L121:
            float r3 = r2.toFloat(r4)
            r2.mScaleY = r3
            goto L15f
        L128:
            float r3 = r2.toFloat(r4)
            r2.mScaleX = r3
            goto L15f
        L12f:
            float r3 = r2.toFloat(r4)
            r2.mTranslationZ = r3
            goto L15f
        L136:
            float r3 = r2.toFloat(r4)
            r2.mTranslationY = r3
            goto L15f
        L13d:
            float r3 = r2.toFloat(r4)
            r2.mTranslationX = r3
            goto L15f
        L144:
            float r3 = r2.toFloat(r4)
            r2.mRotationY = r3
            goto L15f
        L14b:
            float r3 = r2.toFloat(r4)
            r2.mRotationX = r3
            goto L15f
        L152:
            java.lang.String r3 = r4.toString()
            r2.mTransitionEasing = r3
            goto L15f
        L159:
            float r3 = r2.toFloat(r4)
            r2.mProgress = r3
        L15f:
            return
    }
}
