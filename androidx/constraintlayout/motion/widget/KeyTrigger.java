package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class KeyTrigger extends androidx.constraintlayout.motion.widget.Key {
    public static final java.lang.String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    static final java.lang.String NAME = "KeyTrigger";
    public static final java.lang.String NEGATIVE_CROSS = "negativeCross";
    public static final java.lang.String POSITIVE_CROSS = "positiveCross";
    public static final java.lang.String POST_LAYOUT = "postLayout";
    private static final java.lang.String TAG = "KeyTrigger";
    public static final java.lang.String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final java.lang.String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final java.lang.String TRIGGER_ID = "triggerID";
    public static final java.lang.String TRIGGER_RECEIVER = "triggerReceiver";
    public static final java.lang.String TRIGGER_SLACK = "triggerSlack";
    public static final java.lang.String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final java.lang.String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final java.lang.String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    android.graphics.RectF mCollisionRect;
    private java.lang.String mCross;
    private int mCurveFit;
    private boolean mFireCrossReset;
    private float mFireLastPos;
    private boolean mFireNegativeReset;
    private boolean mFirePositiveReset;
    private float mFireThreshold;
    java.util.HashMap<java.lang.String, java.lang.reflect.Method> mMethodHashMap;
    private java.lang.String mNegativeCross;
    private java.lang.String mPositiveCross;
    private boolean mPostLayout;
    android.graphics.RectF mTargetRect;
    private int mTriggerCollisionId;
    private android.view.View mTriggerCollisionView;
    private int mTriggerID;
    private int mTriggerReceiver;
    float mTriggerSlack;
    int mViewTransitionOnCross;
    int mViewTransitionOnNegativeCross;
    int mViewTransitionOnPositiveCross;

    private static class Loader {
        private static final int COLLISION = 9;
        private static final int CROSS = 4;
        private static final int FRAME_POS = 8;
        private static final int NEGATIVE_CROSS = 1;
        private static final int POSITIVE_CROSS = 2;
        private static final int POST_LAYOUT = 10;
        private static final int TARGET_ID = 7;
        private static final int TRIGGER_ID = 6;
        private static final int TRIGGER_RECEIVER = 11;
        private static final int TRIGGER_SLACK = 5;
        private static final int VT_CROSS = 12;
        private static final int VT_NEGATIVE_CROSS = 13;
        private static final int VT_POSITIVE_CROSS = 14;
        private static android.util.SparseIntArray mAttrMap;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap = r0
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTrigger_framePosition
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTrigger_onCross
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTrigger_onNegativeCross
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTrigger_onPositiveCross
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTrigger_motionTarget
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTrigger_triggerId
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTrigger_triggerSlack
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTrigger_motion_triggerOnCollision
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTrigger_motion_postLayoutCollision
                r2 = 10
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTrigger_triggerReceiver
                r2 = 11
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTrigger_viewTransitionOnCross
                r2 = 12
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTrigger_viewTransitionOnNegativeCross
                r2 = 13
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyTrigger_viewTransitionOnPositiveCross
                r2 = 14
                r0.append(r1, r2)
                return
        }

        private Loader() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void read(androidx.constraintlayout.motion.widget.KeyTrigger r4, android.content.res.TypedArray r5, android.content.Context r6) {
                int r6 = r5.getIndexCount()
                r0 = 0
            L5:
                if (r0 >= r6) goto Lf9
                int r1 = r5.getIndex(r0)
                android.util.SparseIntArray r2 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r2 = r2.get(r1)
                switch(r2) {
                    case 1: goto Lee;
                    case 2: goto Le6;
                    case 3: goto L14;
                    case 4: goto Lde;
                    case 5: goto Ld5;
                    case 6: goto Lc9;
                    case 7: goto L98;
                    case 8: goto L83;
                    case 9: goto L76;
                    case 10: goto L69;
                    case 11: goto L5c;
                    case 12: goto L52;
                    case 13: goto L48;
                    case 14: goto L3e;
                    default: goto L14;
                }
            L14:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "unused attribute 0x"
                r2.<init>(r3)
                java.lang.String r3 = java.lang.Integer.toHexString(r1)
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = "   "
                java.lang.StringBuilder r2 = r2.append(r3)
                android.util.SparseIntArray r3 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = r3.get(r1)
                java.lang.StringBuilder r1 = r2.append(r1)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "KeyTrigger"
                android.util.Log.e(r2, r1)
                goto Lf5
            L3e:
                int r2 = r4.mViewTransitionOnPositiveCross
                int r1 = r5.getResourceId(r1, r2)
                r4.mViewTransitionOnPositiveCross = r1
                goto Lf5
            L48:
                int r2 = r4.mViewTransitionOnNegativeCross
                int r1 = r5.getResourceId(r1, r2)
                r4.mViewTransitionOnNegativeCross = r1
                goto Lf5
            L52:
                int r2 = r4.mViewTransitionOnCross
                int r1 = r5.getResourceId(r1, r2)
                r4.mViewTransitionOnCross = r1
                goto Lf5
            L5c:
                int r2 = androidx.constraintlayout.motion.widget.KeyTrigger.access$700(r4)
                int r1 = r5.getResourceId(r1, r2)
                androidx.constraintlayout.motion.widget.KeyTrigger.access$702(r4, r1)
                goto Lf5
            L69:
                boolean r2 = androidx.constraintlayout.motion.widget.KeyTrigger.access$600(r4)
                boolean r1 = r5.getBoolean(r1, r2)
                androidx.constraintlayout.motion.widget.KeyTrigger.access$602(r4, r1)
                goto Lf5
            L76:
                int r2 = androidx.constraintlayout.motion.widget.KeyTrigger.access$500(r4)
                int r1 = r5.getResourceId(r1, r2)
                androidx.constraintlayout.motion.widget.KeyTrigger.access$502(r4, r1)
                goto Lf5
            L83:
                int r2 = r4.mFramePosition
                int r1 = r5.getInteger(r1, r2)
                r4.mFramePosition = r1
                int r1 = r4.mFramePosition
                float r1 = (float) r1
                r2 = 1056964608(0x3f000000, float:0.5)
                float r1 = r1 + r2
                r2 = 1120403456(0x42c80000, float:100.0)
                float r1 = r1 / r2
                androidx.constraintlayout.motion.widget.KeyTrigger.access$002(r4, r1)
                goto Lf5
            L98:
                boolean r2 = androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE
                if (r2 == 0) goto Lb0
                int r2 = r4.mTargetId
                int r2 = r5.getResourceId(r1, r2)
                r4.mTargetId = r2
                int r2 = r4.mTargetId
                r3 = -1
                if (r2 != r3) goto Lf5
                java.lang.String r1 = r5.getString(r1)
                r4.mTargetString = r1
                goto Lf5
            Lb0:
                android.util.TypedValue r2 = r5.peekValue(r1)
                int r2 = r2.type
                r3 = 3
                if (r2 != r3) goto Lc0
                java.lang.String r1 = r5.getString(r1)
                r4.mTargetString = r1
                goto Lf5
            Lc0:
                int r2 = r4.mTargetId
                int r1 = r5.getResourceId(r1, r2)
                r4.mTargetId = r1
                goto Lf5
            Lc9:
                int r2 = androidx.constraintlayout.motion.widget.KeyTrigger.access$400(r4)
                int r1 = r5.getResourceId(r1, r2)
                androidx.constraintlayout.motion.widget.KeyTrigger.access$402(r4, r1)
                goto Lf5
            Ld5:
                float r2 = r4.mTriggerSlack
                float r1 = r5.getFloat(r1, r2)
                r4.mTriggerSlack = r1
                goto Lf5
            Lde:
                java.lang.String r1 = r5.getString(r1)
                androidx.constraintlayout.motion.widget.KeyTrigger.access$302(r4, r1)
                goto Lf5
            Le6:
                java.lang.String r1 = r5.getString(r1)
                androidx.constraintlayout.motion.widget.KeyTrigger.access$202(r4, r1)
                goto Lf5
            Lee:
                java.lang.String r1 = r5.getString(r1)
                androidx.constraintlayout.motion.widget.KeyTrigger.access$102(r4, r1)
            Lf5:
                int r0 = r0 + 1
                goto L5
            Lf9:
                return
        }
    }

    public KeyTrigger() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mCurveFit = r0
            r0 = 0
            r2.mCross = r0
            int r1 = androidx.constraintlayout.motion.widget.KeyTrigger.UNSET
            r2.mTriggerReceiver = r1
            r2.mNegativeCross = r0
            r2.mPositiveCross = r0
            int r1 = androidx.constraintlayout.motion.widget.KeyTrigger.UNSET
            r2.mTriggerID = r1
            int r1 = androidx.constraintlayout.motion.widget.KeyTrigger.UNSET
            r2.mTriggerCollisionId = r1
            r2.mTriggerCollisionView = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r2.mTriggerSlack = r0
            r0 = 1
            r2.mFireCrossReset = r0
            r2.mFireNegativeReset = r0
            r2.mFirePositiveReset = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.mFireThreshold = r0
            r0 = 0
            r2.mPostLayout = r0
            int r0 = androidx.constraintlayout.motion.widget.KeyTrigger.UNSET
            r2.mViewTransitionOnNegativeCross = r0
            int r0 = androidx.constraintlayout.motion.widget.KeyTrigger.UNSET
            r2.mViewTransitionOnPositiveCross = r0
            int r0 = androidx.constraintlayout.motion.widget.KeyTrigger.UNSET
            r2.mViewTransitionOnCross = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.mCollisionRect = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.mTargetRect = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mMethodHashMap = r0
            r0 = 5
            r2.mType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mCustomConstraints = r0
            return
    }

    static /* synthetic */ float access$002(androidx.constraintlayout.motion.widget.KeyTrigger r0, float r1) {
            r0.mFireThreshold = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$102(androidx.constraintlayout.motion.widget.KeyTrigger r0, java.lang.String r1) {
            r0.mNegativeCross = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$202(androidx.constraintlayout.motion.widget.KeyTrigger r0, java.lang.String r1) {
            r0.mPositiveCross = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$302(androidx.constraintlayout.motion.widget.KeyTrigger r0, java.lang.String r1) {
            r0.mCross = r1
            return r1
    }

    static /* synthetic */ int access$400(androidx.constraintlayout.motion.widget.KeyTrigger r0) {
            int r0 = r0.mTriggerID
            return r0
    }

    static /* synthetic */ int access$402(androidx.constraintlayout.motion.widget.KeyTrigger r0, int r1) {
            r0.mTriggerID = r1
            return r1
    }

    static /* synthetic */ int access$500(androidx.constraintlayout.motion.widget.KeyTrigger r0) {
            int r0 = r0.mTriggerCollisionId
            return r0
    }

    static /* synthetic */ int access$502(androidx.constraintlayout.motion.widget.KeyTrigger r0, int r1) {
            r0.mTriggerCollisionId = r1
            return r1
    }

    static /* synthetic */ boolean access$600(androidx.constraintlayout.motion.widget.KeyTrigger r0) {
            boolean r0 = r0.mPostLayout
            return r0
    }

    static /* synthetic */ boolean access$602(androidx.constraintlayout.motion.widget.KeyTrigger r0, boolean r1) {
            r0.mPostLayout = r1
            return r1
    }

    static /* synthetic */ int access$700(androidx.constraintlayout.motion.widget.KeyTrigger r0) {
            int r0 = r0.mTriggerReceiver
            return r0
    }

    static /* synthetic */ int access$702(androidx.constraintlayout.motion.widget.KeyTrigger r0, int r1) {
            r0.mTriggerReceiver = r1
            return r1
    }

    private void fire(java.lang.String r8, android.view.View r9) {
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "."
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto Lf
            r7.fireCustom(r8, r9)
            return
        Lf:
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> r0 = r7.mMethodHashMap
            boolean r0 = r0.containsKey(r8)
            r1 = 0
            if (r0 == 0) goto L23
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> r0 = r7.mMethodHashMap
            java.lang.Object r0 = r0.get(r8)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L24
            return
        L23:
            r0 = r1
        L24:
            java.lang.String r2 = " "
            java.lang.String r3 = "\"on class "
            java.lang.String r4 = "KeyTrigger"
            r5 = 0
            if (r0 != 0) goto L71
            java.lang.Class r0 = r9.getClass()     // Catch: java.lang.NoSuchMethodException -> L3d
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L3d
            java.lang.reflect.Method r0 = r0.getMethod(r8, r6)     // Catch: java.lang.NoSuchMethodException -> L3d
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> r6 = r7.mMethodHashMap     // Catch: java.lang.NoSuchMethodException -> L3d
            r6.put(r8, r0)     // Catch: java.lang.NoSuchMethodException -> L3d
            goto L71
        L3d:
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> r0 = r7.mMethodHashMap
            r0.put(r8, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find method \""
            r0.<init>(r1)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.StringBuilder r8 = r8.append(r3)
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r9 = androidx.constraintlayout.motion.widget.Debug.getName(r9)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.e(r4, r8)
            return
        L71:
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L77
            r0.invoke(r9, r8)     // Catch: java.lang.Exception -> L77
            goto La7
        L77:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Exception in call \""
            r8.<init>(r0)
            java.lang.String r0 = r7.mCross
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.StringBuilder r8 = r8.append(r3)
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r9 = androidx.constraintlayout.motion.widget.Debug.getName(r9)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.e(r4, r8)
        La7:
            return
    }

    private void fireCustom(java.lang.String r5, android.view.View r6) {
            r4 = this;
            int r0 = r5.length()
            r1 = 1
            if (r0 != r1) goto L9
            r0 = r1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto L16
            java.lang.String r5 = r5.substring(r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r1)
        L16:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r1 = r4.mCustomConstraints
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r2.toLowerCase(r3)
            if (r0 != 0) goto L3a
            boolean r3 = r3.matches(r5)
            if (r3 == 0) goto L20
        L3a:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r4.mCustomConstraints
            java.lang.Object r2 = r3.get(r2)
            androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
            if (r2 == 0) goto L20
            r2.applyCustom(r6)
            goto L20
        L48:
            return
    }

    private void setUpRect(android.graphics.RectF r2, android.view.View r3, boolean r4) {
            r1 = this;
            int r0 = r3.getTop()
            float r0 = (float) r0
            r2.top = r0
            int r0 = r3.getBottom()
            float r0 = (float) r0
            r2.bottom = r0
            int r0 = r3.getLeft()
            float r0 = (float) r0
            r2.left = r0
            int r0 = r3.getRight()
            float r0 = (float) r0
            r2.right = r0
            if (r4 == 0) goto L25
            android.graphics.Matrix r3 = r3.getMatrix()
            r3.mapRect(r2)
        L25:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r1) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key clone() {
            r1 = this;
            androidx.constraintlayout.motion.widget.KeyTrigger r0 = new androidx.constraintlayout.motion.widget.KeyTrigger
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

    public void conditionallyFire(float r10, android.view.View r11) {
            r9 = this;
            int r0 = r9.mTriggerCollisionId
            int r1 = androidx.constraintlayout.motion.widget.KeyTrigger.UNSET
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L62
            android.view.View r0 = r9.mTriggerCollisionView
            if (r0 != 0) goto L1a
            android.view.ViewParent r0 = r11.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r9.mTriggerCollisionId
            android.view.View r0 = r0.findViewById(r1)
            r9.mTriggerCollisionView = r0
        L1a:
            android.graphics.RectF r0 = r9.mCollisionRect
            android.view.View r1 = r9.mTriggerCollisionView
            boolean r4 = r9.mPostLayout
            r9.setUpRect(r0, r1, r4)
            android.graphics.RectF r0 = r9.mTargetRect
            boolean r1 = r9.mPostLayout
            r9.setUpRect(r0, r11, r1)
            android.graphics.RectF r0 = r9.mCollisionRect
            android.graphics.RectF r1 = r9.mTargetRect
            boolean r0 = r0.intersect(r1)
            if (r0 == 0) goto L4c
            boolean r0 = r9.mFireCrossReset
            if (r0 == 0) goto L3c
            r9.mFireCrossReset = r3
            r0 = r2
            goto L3d
        L3c:
            r0 = r3
        L3d:
            boolean r1 = r9.mFirePositiveReset
            if (r1 == 0) goto L45
            r9.mFirePositiveReset = r3
            r1 = r2
            goto L46
        L45:
            r1 = r3
        L46:
            r9.mFireNegativeReset = r2
            r4 = r1
            r1 = r3
            goto Le0
        L4c:
            boolean r0 = r9.mFireCrossReset
            if (r0 != 0) goto L54
            r9.mFireCrossReset = r2
            r0 = r2
            goto L55
        L54:
            r0 = r3
        L55:
            boolean r1 = r9.mFireNegativeReset
            if (r1 == 0) goto L5d
            r9.mFireNegativeReset = r3
            r1 = r2
            goto L5e
        L5d:
            r1 = r3
        L5e:
            r9.mFirePositiveReset = r2
            goto Ldf
        L62:
            boolean r0 = r9.mFireCrossReset
            r1 = 0
            if (r0 == 0) goto L77
            float r0 = r9.mFireThreshold
            float r4 = r10 - r0
            float r5 = r9.mFireLastPos
            float r5 = r5 - r0
            float r4 = r4 * r5
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L87
            r9.mFireCrossReset = r3
            r0 = r2
            goto L88
        L77:
            float r0 = r9.mFireThreshold
            float r0 = r10 - r0
            float r0 = java.lang.Math.abs(r0)
            float r4 = r9.mTriggerSlack
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L87
            r9.mFireCrossReset = r2
        L87:
            r0 = r3
        L88:
            boolean r4 = r9.mFireNegativeReset
            if (r4 == 0) goto La0
            float r4 = r9.mFireThreshold
            float r5 = r10 - r4
            float r6 = r9.mFireLastPos
            float r6 = r6 - r4
            float r6 = r6 * r5
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 >= 0) goto Lb0
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto Lb0
            r9.mFireNegativeReset = r3
            r4 = r2
            goto Lb1
        La0:
            float r4 = r9.mFireThreshold
            float r4 = r10 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = r9.mTriggerSlack
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb0
            r9.mFireNegativeReset = r2
        Lb0:
            r4 = r3
        Lb1:
            boolean r5 = r9.mFirePositiveReset
            if (r5 == 0) goto Lce
            float r5 = r9.mFireThreshold
            float r6 = r10 - r5
            float r7 = r9.mFireLastPos
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 >= 0) goto Lc9
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lc9
            r9.mFirePositiveReset = r3
            r1 = r2
            goto Lca
        Lc9:
            r1 = r3
        Lca:
            r8 = r4
            r4 = r1
            r1 = r8
            goto Le0
        Lce:
            float r1 = r9.mFireThreshold
            float r1 = r10 - r1
            float r1 = java.lang.Math.abs(r1)
            float r5 = r9.mTriggerSlack
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lde
            r9.mFirePositiveReset = r2
        Lde:
            r1 = r4
        Ldf:
            r4 = r3
        Le0:
            r9.mFireLastPos = r10
            if (r1 != 0) goto Le8
            if (r0 != 0) goto Le8
            if (r4 == 0) goto Lf3
        Le8:
            android.view.ViewParent r5 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r5 = (androidx.constraintlayout.motion.widget.MotionLayout) r5
            int r6 = r9.mTriggerID
            r5.fireTrigger(r6, r4, r10)
        Lf3:
            int r10 = r9.mTriggerReceiver
            int r5 = androidx.constraintlayout.motion.widget.KeyTrigger.UNSET
            if (r10 != r5) goto Lfb
            r10 = r11
            goto L107
        Lfb:
            android.view.ViewParent r10 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
            int r5 = r9.mTriggerReceiver
            android.view.View r10 = r10.findViewById(r5)
        L107:
            if (r1 == 0) goto L125
            java.lang.String r1 = r9.mNegativeCross
            if (r1 == 0) goto L110
            r9.fire(r1, r10)
        L110:
            int r1 = r9.mViewTransitionOnNegativeCross
            int r5 = androidx.constraintlayout.motion.widget.KeyTrigger.UNSET
            if (r1 == r5) goto L125
            android.view.ViewParent r1 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r5 = r9.mViewTransitionOnNegativeCross
            android.view.View[] r6 = new android.view.View[r2]
            r6[r3] = r10
            r1.viewTransition(r5, r6)
        L125:
            if (r4 == 0) goto L143
            java.lang.String r1 = r9.mPositiveCross
            if (r1 == 0) goto L12e
            r9.fire(r1, r10)
        L12e:
            int r1 = r9.mViewTransitionOnPositiveCross
            int r4 = androidx.constraintlayout.motion.widget.KeyTrigger.UNSET
            if (r1 == r4) goto L143
            android.view.ViewParent r1 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r4 = r9.mViewTransitionOnPositiveCross
            android.view.View[] r5 = new android.view.View[r2]
            r5[r3] = r10
            r1.viewTransition(r4, r5)
        L143:
            if (r0 == 0) goto L161
            java.lang.String r0 = r9.mCross
            if (r0 == 0) goto L14c
            r9.fire(r0, r10)
        L14c:
            int r0 = r9.mViewTransitionOnCross
            int r1 = androidx.constraintlayout.motion.widget.KeyTrigger.UNSET
            if (r0 == r1) goto L161
            android.view.ViewParent r11 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = (androidx.constraintlayout.motion.widget.MotionLayout) r11
            int r0 = r9.mViewTransitionOnCross
            android.view.View[] r1 = new android.view.View[r2]
            r1[r3] = r10
            r11.viewTransition(r0, r1)
        L161:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key r2) {
            r1 = this;
            super.copy(r2)
            androidx.constraintlayout.motion.widget.KeyTrigger r2 = (androidx.constraintlayout.motion.widget.KeyTrigger) r2
            int r0 = r2.mCurveFit
            r1.mCurveFit = r0
            java.lang.String r0 = r2.mCross
            r1.mCross = r0
            int r0 = r2.mTriggerReceiver
            r1.mTriggerReceiver = r0
            java.lang.String r0 = r2.mNegativeCross
            r1.mNegativeCross = r0
            java.lang.String r0 = r2.mPositiveCross
            r1.mPositiveCross = r0
            int r0 = r2.mTriggerID
            r1.mTriggerID = r0
            int r0 = r2.mTriggerCollisionId
            r1.mTriggerCollisionId = r0
            android.view.View r0 = r2.mTriggerCollisionView
            r1.mTriggerCollisionView = r0
            float r0 = r2.mTriggerSlack
            r1.mTriggerSlack = r0
            boolean r0 = r2.mFireCrossReset
            r1.mFireCrossReset = r0
            boolean r0 = r2.mFireNegativeReset
            r1.mFireNegativeReset = r0
            boolean r0 = r2.mFirePositiveReset
            r1.mFirePositiveReset = r0
            float r0 = r2.mFireThreshold
            r1.mFireThreshold = r0
            float r0 = r2.mFireLastPos
            r1.mFireLastPos = r0
            boolean r0 = r2.mPostLayout
            r1.mPostLayout = r0
            android.graphics.RectF r0 = r2.mCollisionRect
            r1.mCollisionRect = r0
            android.graphics.RectF r0 = r2.mTargetRect
            r1.mTargetRect = r0
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> r2 = r2.mMethodHashMap
            r1.mMethodHashMap = r2
            return r1
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(java.util.HashSet<java.lang.String> r1) {
            r0 = this;
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
            int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.KeyTrigger
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0)
            androidx.constraintlayout.motion.widget.KeyTrigger.Loader.read(r1, r3, r2)
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            r3.hashCode()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1594793529: goto L92;
                case -966421266: goto L87;
                case -786670827: goto L7c;
                case -648752941: goto L71;
                case -638126837: goto L66;
                case -76025313: goto L5b;
                case -9754574: goto L50;
                case 64397344: goto L45;
                case 364489912: goto L37;
                case 1301930599: goto L29;
                case 1401391082: goto L1b;
                case 1535404999: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L9c
        Ld:
            java.lang.String r0 = "triggerReceiver"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L17
            goto L9c
        L17:
            r1 = 11
            goto L9c
        L1b:
            java.lang.String r0 = "postLayout"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L25
            goto L9c
        L25:
            r1 = 10
            goto L9c
        L29:
            java.lang.String r0 = "viewTransitionOnCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L33
            goto L9c
        L33:
            r1 = 9
            goto L9c
        L37:
            java.lang.String r0 = "triggerSlack"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L41
            goto L9c
        L41:
            r1 = 8
            goto L9c
        L45:
            java.lang.String r0 = "CROSS"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4e
            goto L9c
        L4e:
            r1 = 7
            goto L9c
        L50:
            java.lang.String r0 = "viewTransitionOnNegativeCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L59
            goto L9c
        L59:
            r1 = 6
            goto L9c
        L5b:
            java.lang.String r0 = "triggerCollisionView"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L64
            goto L9c
        L64:
            r1 = 5
            goto L9c
        L66:
            java.lang.String r0 = "negativeCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6f
            goto L9c
        L6f:
            r1 = 4
            goto L9c
        L71:
            java.lang.String r0 = "triggerID"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7a
            goto L9c
        L7a:
            r1 = 3
            goto L9c
        L7c:
            java.lang.String r0 = "triggerCollisionId"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L85
            goto L9c
        L85:
            r1 = 2
            goto L9c
        L87:
            java.lang.String r0 = "viewTransitionOnPositiveCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L90
            goto L9c
        L90:
            r1 = 1
            goto L9c
        L92:
            java.lang.String r0 = "positiveCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L9b
            goto L9c
        L9b:
            r1 = 0
        L9c:
            switch(r1) {
                case 0: goto Leb;
                case 1: goto Le4;
                case 2: goto Ldd;
                case 3: goto Ld6;
                case 4: goto Lcf;
                case 5: goto Lca;
                case 6: goto Lc3;
                case 7: goto Lbc;
                case 8: goto Lb5;
                case 9: goto Lae;
                case 10: goto La7;
                case 11: goto La0;
                default: goto L9f;
            }
        L9f:
            goto Lf1
        La0:
            int r3 = r2.toInt(r4)
            r2.mTriggerReceiver = r3
            goto Lf1
        La7:
            boolean r3 = r2.toBoolean(r4)
            r2.mPostLayout = r3
            goto Lf1
        Lae:
            int r3 = r2.toInt(r4)
            r2.mViewTransitionOnCross = r3
            goto Lf1
        Lb5:
            float r3 = r2.toFloat(r4)
            r2.mTriggerSlack = r3
            goto Lf1
        Lbc:
            java.lang.String r3 = r4.toString()
            r2.mCross = r3
            goto Lf1
        Lc3:
            int r3 = r2.toInt(r4)
            r2.mViewTransitionOnNegativeCross = r3
            goto Lf1
        Lca:
            android.view.View r4 = (android.view.View) r4
            r2.mTriggerCollisionView = r4
            goto Lf1
        Lcf:
            java.lang.String r3 = r4.toString()
            r2.mNegativeCross = r3
            goto Lf1
        Ld6:
            int r3 = r2.toInt(r4)
            r2.mTriggerID = r3
            goto Lf1
        Ldd:
            int r3 = r2.toInt(r4)
            r2.mTriggerCollisionId = r3
            goto Lf1
        Le4:
            int r3 = r2.toInt(r4)
            r2.mViewTransitionOnPositiveCross = r3
            goto Lf1
        Leb:
            java.lang.String r3 = r4.toString()
            r2.mPositiveCross = r3
        Lf1:
            return
    }
}
