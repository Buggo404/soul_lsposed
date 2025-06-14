package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public abstract class Key {
    public static final java.lang.String ALPHA = "alpha";
    public static final java.lang.String CURVEFIT = "curveFit";
    public static final java.lang.String CUSTOM = "CUSTOM";
    public static final java.lang.String ELEVATION = "elevation";
    public static final java.lang.String MOTIONPROGRESS = "motionProgress";
    public static final java.lang.String PIVOT_X = "transformPivotX";
    public static final java.lang.String PIVOT_Y = "transformPivotY";
    public static final java.lang.String PROGRESS = "progress";
    public static final java.lang.String ROTATION = "rotation";
    public static final java.lang.String ROTATION_X = "rotationX";
    public static final java.lang.String ROTATION_Y = "rotationY";
    public static final java.lang.String SCALE_X = "scaleX";
    public static final java.lang.String SCALE_Y = "scaleY";
    public static final java.lang.String TRANSITIONEASING = "transitionEasing";
    public static final java.lang.String TRANSITION_PATH_ROTATE = "transitionPathRotate";
    public static final java.lang.String TRANSLATION_X = "translationX";
    public static final java.lang.String TRANSLATION_Y = "translationY";
    public static final java.lang.String TRANSLATION_Z = "translationZ";
    public static int UNSET = -1;
    public static final java.lang.String VISIBILITY = "visibility";
    public static final java.lang.String WAVE_OFFSET = "waveOffset";
    public static final java.lang.String WAVE_PERIOD = "wavePeriod";
    public static final java.lang.String WAVE_PHASE = "wavePhase";
    public static final java.lang.String WAVE_VARIES_BY = "waveVariesBy";
    java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> mCustomConstraints;
    int mFramePosition;
    int mTargetId;
    java.lang.String mTargetString;
    protected int mType;

    static {
            return
    }

    public Key() {
            r1 = this;
            r1.<init>()
            int r0 = androidx.constraintlayout.motion.widget.Key.UNSET
            r1.mFramePosition = r0
            r1.mTargetId = r0
            r0 = 0
            r1.mTargetString = r0
            return
    }

    public abstract void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r1);

    public abstract androidx.constraintlayout.motion.widget.Key clone();

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object mo129clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.constraintlayout.motion.widget.Key r0 = r1.clone()
            return r0
    }

    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key r2) {
            r1 = this;
            int r0 = r2.mFramePosition
            r1.mFramePosition = r0
            int r0 = r2.mTargetId
            r1.mTargetId = r0
            java.lang.String r0 = r2.mTargetString
            r1.mTargetString = r0
            int r0 = r2.mType
            r1.mType = r0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.mCustomConstraints
            r1.mCustomConstraints = r2
            return r1
    }

    abstract void getAttributeNames(java.util.HashSet<java.lang.String> r1);

    public int getFramePosition() {
            r1 = this;
            int r0 = r1.mFramePosition
            return r0
    }

    abstract void load(android.content.Context r1, android.util.AttributeSet r2);

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

    public void setFramePosition(int r1) {
            r0 = this;
            r0.mFramePosition = r1
            return
    }

    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> r1) {
            r0 = this;
            return
    }

    public abstract void setValue(java.lang.String r1, java.lang.Object r2);

    public androidx.constraintlayout.motion.widget.Key setViewId(int r1) {
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
