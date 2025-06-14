package androidx.constraintlayout.core.motion.key;

/* loaded from: classes.dex */
public class MotionKeyTrigger extends androidx.constraintlayout.core.motion.key.MotionKey {
    public static final java.lang.String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    public static final java.lang.String NEGATIVE_CROSS = "negativeCross";
    public static final java.lang.String POSITIVE_CROSS = "positiveCross";
    public static final java.lang.String POST_LAYOUT = "postLayout";
    private static final java.lang.String TAG = "KeyTrigger";
    public static final java.lang.String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final java.lang.String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final java.lang.String TRIGGER_ID = "triggerID";
    public static final java.lang.String TRIGGER_RECEIVER = "triggerReceiver";
    public static final java.lang.String TRIGGER_SLACK = "triggerSlack";
    public static final int TYPE_CROSS = 312;
    public static final int TYPE_NEGATIVE_CROSS = 310;
    public static final int TYPE_POSITIVE_CROSS = 309;
    public static final int TYPE_POST_LAYOUT = 304;
    public static final int TYPE_TRIGGER_COLLISION_ID = 307;
    public static final int TYPE_TRIGGER_COLLISION_VIEW = 306;
    public static final int TYPE_TRIGGER_ID = 308;
    public static final int TYPE_TRIGGER_RECEIVER = 311;
    public static final int TYPE_TRIGGER_SLACK = 305;
    public static final int TYPE_VIEW_TRANSITION_ON_CROSS = 301;
    public static final int TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS = 303;
    public static final int TYPE_VIEW_TRANSITION_ON_POSITIVE_CROSS = 302;
    public static final java.lang.String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final java.lang.String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final java.lang.String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    androidx.constraintlayout.core.motion.utils.FloatRect mCollisionRect;
    private java.lang.String mCross;
    private int mCurveFit;
    private boolean mFireCrossReset;
    private float mFireLastPos;
    private boolean mFireNegativeReset;
    private boolean mFirePositiveReset;
    private float mFireThreshold;
    private java.lang.String mNegativeCross;
    private java.lang.String mPositiveCross;
    private boolean mPostLayout;
    androidx.constraintlayout.core.motion.utils.FloatRect mTargetRect;
    private int mTriggerCollisionId;
    private int mTriggerID;
    private int mTriggerReceiver;
    float mTriggerSlack;
    int mViewTransitionOnCross;
    int mViewTransitionOnNegativeCross;
    int mViewTransitionOnPositiveCross;

    public MotionKeyTrigger() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mCurveFit = r0
            r0 = 0
            r2.mCross = r0
            int r1 = androidx.constraintlayout.core.motion.key.MotionKeyTrigger.UNSET
            r2.mTriggerReceiver = r1
            r2.mNegativeCross = r0
            r2.mPositiveCross = r0
            int r0 = androidx.constraintlayout.core.motion.key.MotionKeyTrigger.UNSET
            r2.mTriggerID = r0
            int r0 = androidx.constraintlayout.core.motion.key.MotionKeyTrigger.UNSET
            r2.mTriggerCollisionId = r0
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
            int r0 = androidx.constraintlayout.core.motion.key.MotionKeyTrigger.UNSET
            r2.mViewTransitionOnNegativeCross = r0
            int r0 = androidx.constraintlayout.core.motion.key.MotionKeyTrigger.UNSET
            r2.mViewTransitionOnPositiveCross = r0
            int r0 = androidx.constraintlayout.core.motion.key.MotionKeyTrigger.UNSET
            r2.mViewTransitionOnCross = r0
            androidx.constraintlayout.core.motion.utils.FloatRect r0 = new androidx.constraintlayout.core.motion.utils.FloatRect
            r0.<init>()
            r2.mCollisionRect = r0
            androidx.constraintlayout.core.motion.utils.FloatRect r0 = new androidx.constraintlayout.core.motion.utils.FloatRect
            r0.<init>()
            r2.mTargetRect = r0
            r0 = 5
            r2.mType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mCustom = r0
            return
    }

    private void fireCustom(java.lang.String r5, androidx.constraintlayout.core.motion.MotionWidget r6) {
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
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r1 = r4.mCustom
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
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r3 = r4.mCustom
            java.lang.Object r2 = r3.get(r2)
            androidx.constraintlayout.core.motion.CustomVariable r2 = (androidx.constraintlayout.core.motion.CustomVariable) r2
            if (r2 == 0) goto L20
            r2.applyToWidget(r6)
            goto L20
        L48:
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
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger r0 = new androidx.constraintlayout.core.motion.key.MotionKeyTrigger
            r0.<init>()
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger r0 = r0.copy(r1)
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo128clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.constraintlayout.core.motion.key.MotionKey r0 = r1.clone()
            return r0
    }

    public void conditionallyFire(float r1, androidx.constraintlayout.core.motion.MotionWidget r2) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public /* bridge */ /* synthetic */ androidx.constraintlayout.core.motion.key.MotionKey copy(androidx.constraintlayout.core.motion.key.MotionKey r1) {
            r0 = this;
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger r1 = r0.copy(r1)
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKeyTrigger copy(androidx.constraintlayout.core.motion.key.MotionKey r2) {
            r1 = this;
            super.copy(r2)
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger r2 = (androidx.constraintlayout.core.motion.key.MotionKeyTrigger) r2
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
            androidx.constraintlayout.core.motion.utils.FloatRect r0 = r2.mCollisionRect
            r1.mCollisionRect = r0
            androidx.constraintlayout.core.motion.utils.FloatRect r2 = r2.mTargetRect
            r1.mTargetRect = r2
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(java.util.HashSet<java.lang.String> r1) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String r3) {
            r2 = this;
            r3.hashCode()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1594793529: goto L82;
                case -966421266: goto L77;
                case -786670827: goto L6c;
                case -648752941: goto L61;
                case -638126837: goto L56;
                case -76025313: goto L4b;
                case -9754574: goto L40;
                case 364489912: goto L35;
                case 1301930599: goto L28;
                case 1401391082: goto L1b;
                case 1535404999: goto Le;
                default: goto Lb;
            }
        Lb:
            r3 = r1
            goto L8c
        Le:
            java.lang.String r0 = "triggerReceiver"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L17
            goto Lb
        L17:
            r3 = 10
            goto L8c
        L1b:
            java.lang.String r0 = "postLayout"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L24
            goto Lb
        L24:
            r3 = 9
            goto L8c
        L28:
            java.lang.String r0 = "viewTransitionOnCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L31
            goto Lb
        L31:
            r3 = 8
            goto L8c
        L35:
            java.lang.String r0 = "triggerSlack"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3e
            goto Lb
        L3e:
            r3 = 7
            goto L8c
        L40:
            java.lang.String r0 = "viewTransitionOnNegativeCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L49
            goto Lb
        L49:
            r3 = 6
            goto L8c
        L4b:
            java.lang.String r0 = "triggerCollisionView"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L54
            goto Lb
        L54:
            r3 = 5
            goto L8c
        L56:
            java.lang.String r0 = "negativeCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5f
            goto Lb
        L5f:
            r3 = 4
            goto L8c
        L61:
            java.lang.String r0 = "triggerID"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6a
            goto Lb
        L6a:
            r3 = 3
            goto L8c
        L6c:
            java.lang.String r0 = "triggerCollisionId"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L75
            goto Lb
        L75:
            r3 = 2
            goto L8c
        L77:
            java.lang.String r0 = "viewTransitionOnPositiveCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L80
            goto Lb
        L80:
            r3 = 1
            goto L8c
        L82:
            java.lang.String r0 = "positiveCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8b
            goto Lb
        L8b:
            r3 = 0
        L8c:
            switch(r3) {
                case 0: goto Lae;
                case 1: goto Lab;
                case 2: goto La8;
                case 3: goto La5;
                case 4: goto La2;
                case 5: goto L9f;
                case 6: goto L9c;
                case 7: goto L99;
                case 8: goto L96;
                case 9: goto L93;
                case 10: goto L90;
                default: goto L8f;
            }
        L8f:
            return r1
        L90:
            r3 = 311(0x137, float:4.36E-43)
            return r3
        L93:
            r3 = 304(0x130, float:4.26E-43)
            return r3
        L96:
            r3 = 301(0x12d, float:4.22E-43)
            return r3
        L99:
            r3 = 305(0x131, float:4.27E-43)
            return r3
        L9c:
            r3 = 303(0x12f, float:4.25E-43)
            return r3
        L9f:
            r3 = 306(0x132, float:4.29E-43)
            return r3
        La2:
            r3 = 310(0x136, float:4.34E-43)
            return r3
        La5:
            r3 = 308(0x134, float:4.32E-43)
            return r3
        La8:
            r3 = 307(0x133, float:4.3E-43)
            return r3
        Lab:
            r3 = 302(0x12e, float:4.23E-43)
            return r3
        Lae:
            r3 = 309(0x135, float:4.33E-43)
            return r3
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, float r3) {
            r1 = this;
            r0 = 305(0x131, float:4.27E-43)
            if (r2 == r0) goto L9
            boolean r2 = super.setValue(r2, r3)
            return r2
        L9:
            r1.mTriggerSlack = r3
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, int r3) {
            r1 = this;
            r0 = 307(0x133, float:4.3E-43)
            if (r2 == r0) goto L2b
            r0 = 308(0x134, float:4.32E-43)
            if (r2 == r0) goto L20
            r0 = 311(0x137, float:4.36E-43)
            if (r2 == r0) goto L1d
            switch(r2) {
                case 301: goto L1a;
                case 302: goto L17;
                case 303: goto L14;
                default: goto Lf;
            }
        Lf:
            boolean r2 = super.setValue(r2, r3)
            return r2
        L14:
            r1.mViewTransitionOnNegativeCross = r3
            goto L2d
        L17:
            r1.mViewTransitionOnPositiveCross = r3
            goto L2d
        L1a:
            r1.mViewTransitionOnCross = r3
            goto L2d
        L1d:
            r1.mTriggerReceiver = r3
            goto L2d
        L20:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            int r2 = r1.toInt(r2)
            r1.mTriggerID = r2
            goto L2d
        L2b:
            r1.mTriggerCollisionId = r3
        L2d:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 309(0x135, float:4.33E-43)
            if (r2 == r0) goto L17
            r0 = 310(0x136, float:4.34E-43)
            if (r2 == r0) goto L14
            r0 = 312(0x138, float:4.37E-43)
            if (r2 == r0) goto L11
            boolean r2 = super.setValue(r2, r3)
            return r2
        L11:
            r1.mCross = r3
            goto L19
        L14:
            r1.mNegativeCross = r3
            goto L19
        L17:
            r1.mPositiveCross = r3
        L19:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, boolean r3) {
            r1 = this;
            r0 = 304(0x130, float:4.26E-43)
            if (r2 == r0) goto L9
            boolean r2 = super.setValue(r2, r3)
            return r2
        L9:
            r1.mPostLayout = r3
            r2 = 1
            return r2
    }
}
