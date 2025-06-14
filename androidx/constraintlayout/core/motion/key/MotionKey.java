package androidx.constraintlayout.core.motion.key;

/* loaded from: classes.dex */
public abstract class MotionKey implements androidx.constraintlayout.core.motion.utils.TypedValues {
    public static final java.lang.String ALPHA = "alpha";
    public static final java.lang.String CUSTOM = "CUSTOM";
    public static final java.lang.String ELEVATION = "elevation";
    public static final java.lang.String ROTATION = "rotationZ";
    public static final java.lang.String ROTATION_X = "rotationX";
    public static final java.lang.String SCALE_X = "scaleX";
    public static final java.lang.String SCALE_Y = "scaleY";
    public static final java.lang.String TRANSITION_PATH_ROTATE = "transitionPathRotate";
    public static final java.lang.String TRANSLATION_X = "translationX";
    public static final java.lang.String TRANSLATION_Y = "translationY";
    public static int UNSET = -1;
    public static final java.lang.String VISIBILITY = "visibility";
    public java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> mCustom;
    public int mFramePosition;
    int mTargetId;
    java.lang.String mTargetString;
    public int mType;

    static {
            return
    }

    public MotionKey() {
            r1 = this;
            r1.<init>()
            int r0 = androidx.constraintlayout.core.motion.key.MotionKey.UNSET
            r1.mFramePosition = r0
            r1.mTargetId = r0
            r0 = 0
            r1.mTargetString = r0
            return
    }

    public abstract void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r1);

    public abstract androidx.constraintlayout.core.motion.key.MotionKey clone();

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object mo128clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.constraintlayout.core.motion.key.MotionKey r0 = r1.clone()
            return r0
    }

    public androidx.constraintlayout.core.motion.key.MotionKey copy(androidx.constraintlayout.core.motion.key.MotionKey r2) {
            r1 = this;
            int r0 = r2.mFramePosition
            r1.mFramePosition = r0
            int r0 = r2.mTargetId
            r1.mTargetId = r0
            java.lang.String r0 = r2.mTargetString
            r1.mTargetString = r0
            int r2 = r2.mType
            r1.mType = r2
            return r1
    }

    public abstract void getAttributeNames(java.util.HashSet<java.lang.String> r1);

    public int getFramePosition() {
            r1 = this;
            int r0 = r1.mFramePosition
            return r0
    }

    boolean matches(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.mTargetString
            if (r0 == 0) goto Lc
            if (r2 != 0) goto L7
            goto Lc
        L7:
            boolean r2 = r2.matches(r0)
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public void setCustomAttribute(java.lang.String r3, int r4, float r5) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            androidx.constraintlayout.core.motion.CustomVariable r1 = new androidx.constraintlayout.core.motion.CustomVariable
            r1.<init>(r3, r4, r5)
            r0.put(r3, r1)
            return
    }

    public void setCustomAttribute(java.lang.String r3, int r4, int r5) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            androidx.constraintlayout.core.motion.CustomVariable r1 = new androidx.constraintlayout.core.motion.CustomVariable
            r1.<init>(r3, r4, r5)
            r0.put(r3, r1)
            return
    }

    public void setCustomAttribute(java.lang.String r3, int r4, java.lang.String r5) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            androidx.constraintlayout.core.motion.CustomVariable r1 = new androidx.constraintlayout.core.motion.CustomVariable
            r1.<init>(r3, r4, r5)
            r0.put(r3, r1)
            return
    }

    public void setCustomAttribute(java.lang.String r3, int r4, boolean r5) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            androidx.constraintlayout.core.motion.CustomVariable r1 = new androidx.constraintlayout.core.motion.CustomVariable
            r1.<init>(r3, r4, r5)
            r0.put(r3, r1)
            return
    }

    public void setFramePosition(int r1) {
            r0 = this;
            r0.mFramePosition = r1
            return
    }

    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> r1) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r1, float r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, int r3) {
            r1 = this;
            r0 = 100
            if (r2 == r0) goto L6
            r2 = 0
            return r2
        L6:
            r1.mFramePosition = r3
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 101(0x65, float:1.42E-43)
            if (r2 == r0) goto L6
            r2 = 0
            return r2
        L6:
            r1.mTargetString = r3
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r1, boolean r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public androidx.constraintlayout.core.motion.key.MotionKey setViewId(int r1) {
            r0 = this;
            r0.mTargetId = r1
            return r0
    }

    boolean toBoolean(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto Lb
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L13
        Lb:
            java.lang.String r2 = r2.toString()
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
        L13:
            return r2
    }

    float toFloat(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto Lb
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            goto L13
        Lb:
            java.lang.String r2 = r2.toString()
            float r2 = java.lang.Float.parseFloat(r2)
        L13:
            return r2
    }

    int toInt(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto Lb
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L13
        Lb:
            java.lang.String r2 = r2.toString()
            int r2 = java.lang.Integer.parseInt(r2)
        L13:
            return r2
    }
}
