package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
class MotionConstrainedPoint implements java.lang.Comparable<androidx.constraintlayout.motion.widget.MotionConstrainedPoint> {
    static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    static final int PERPENDICULAR = 1;
    public static final java.lang.String TAG = "MotionPaths";
    static java.lang.String[] names;
    private float alpha;
    private boolean applyElevation;
    java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> attributes;
    private float elevation;
    private float height;
    private int mAnimateRelativeTo;
    private int mDrawPath;
    private androidx.constraintlayout.core.motion.utils.Easing mKeyFrameEasing;
    int mMode;
    private float mPathRotate;
    private float mPivotX;
    private float mPivotY;
    private float mProgress;
    double[] mTempDelta;
    double[] mTempValue;
    int mVisibilityMode;
    private float position;
    private float rotation;
    private float rotationX;
    public float rotationY;
    private float scaleX;
    private float scaleY;
    private float translationX;
    private float translationY;
    private float translationZ;
    int visibility;
    private float width;

    /* renamed from: x */
    private float f50x;

    /* renamed from: y */
    private float f51y;

    static {
            java.lang.String r0 = "position"
            java.lang.String r1 = "x"
            java.lang.String r2 = "y"
            java.lang.String r3 = "width"
            java.lang.String r4 = "height"
            java.lang.String r5 = "pathRotate"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint.names = r0
            return
    }

    public MotionConstrainedPoint() {
            r3 = this;
            r3.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.alpha = r0
            r1 = 0
            r3.mVisibilityMode = r1
            r3.applyElevation = r1
            r2 = 0
            r3.elevation = r2
            r3.rotation = r2
            r3.rotationX = r2
            r3.rotationY = r2
            r3.scaleX = r0
            r3.scaleY = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r3.mPivotX = r0
            r3.mPivotY = r0
            r3.translationX = r2
            r3.translationY = r2
            r3.translationZ = r2
            r3.mDrawPath = r1
            r3.mPathRotate = r0
            r3.mProgress = r0
            r0 = -1
            r3.mAnimateRelativeTo = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.attributes = r0
            r3.mMode = r1
            r0 = 18
            double[] r1 = new double[r0]
            r3.mTempValue = r1
            double[] r0 = new double[r0]
            r3.mTempDelta = r0
            return
    }

    private boolean diff(float r4, float r5) {
            r3 = this;
            boolean r0 = java.lang.Float.isNaN(r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1e
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 == 0) goto Lf
            goto L1e
        Lf:
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            r5 = 897988541(0x358637bd, float:1.0E-6)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L1c
            goto L1d
        L1c:
            r1 = r2
        L1d:
            return r1
        L1e:
            boolean r4 = java.lang.Float.isNaN(r4)
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r4 == r5) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            return r1
    }

    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r8, int r9) {
            r7 = this;
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L228
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.get(r1)
            androidx.constraintlayout.motion.utils.ViewSpline r2 = (androidx.constraintlayout.motion.utils.ViewSpline) r2
            r1.hashCode()
            int r3 = r1.hashCode()
            r4 = 1
            r5 = -1
            switch(r3) {
                case -1249320806: goto Lc9;
                case -1249320805: goto Lbe;
                case -1225497657: goto Lb3;
                case -1225497656: goto La8;
                case -1225497655: goto L9d;
                case -1001078227: goto L92;
                case -908189618: goto L87;
                case -908189617: goto L7c;
                case -760884510: goto L6e;
                case -760884509: goto L60;
                case -40300674: goto L52;
                case -4379043: goto L44;
                case 37232917: goto L36;
                case 92909918: goto L28;
                default: goto L26;
            }
        L26:
            goto Ld3
        L28:
            java.lang.String r3 = "alpha"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L32
            goto Ld3
        L32:
            r5 = 13
            goto Ld3
        L36:
            java.lang.String r3 = "transitionPathRotate"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L40
            goto Ld3
        L40:
            r5 = 12
            goto Ld3
        L44:
            java.lang.String r3 = "elevation"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L4e
            goto Ld3
        L4e:
            r5 = 11
            goto Ld3
        L52:
            java.lang.String r3 = "rotation"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L5c
            goto Ld3
        L5c:
            r5 = 10
            goto Ld3
        L60:
            java.lang.String r3 = "transformPivotY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L6a
            goto Ld3
        L6a:
            r5 = 9
            goto Ld3
        L6e:
            java.lang.String r3 = "transformPivotX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L78
            goto Ld3
        L78:
            r5 = 8
            goto Ld3
        L7c:
            java.lang.String r3 = "scaleY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L85
            goto Ld3
        L85:
            r5 = 7
            goto Ld3
        L87:
            java.lang.String r3 = "scaleX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L90
            goto Ld3
        L90:
            r5 = 6
            goto Ld3
        L92:
            java.lang.String r3 = "progress"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L9b
            goto Ld3
        L9b:
            r5 = 5
            goto Ld3
        L9d:
            java.lang.String r3 = "translationZ"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto La6
            goto Ld3
        La6:
            r5 = 4
            goto Ld3
        La8:
            java.lang.String r3 = "translationY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lb1
            goto Ld3
        Lb1:
            r5 = 3
            goto Ld3
        Lb3:
            java.lang.String r3 = "translationX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lbc
            goto Ld3
        Lbc:
            r5 = 2
            goto Ld3
        Lbe:
            java.lang.String r3 = "rotationY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lc7
            goto Ld3
        Lc7:
            r5 = r4
            goto Ld3
        Lc9:
            java.lang.String r3 = "rotationX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Ld2
            goto Ld3
        Ld2:
            r5 = 0
        Ld3:
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r5) {
                case 0: goto L218;
                case 1: goto L208;
                case 2: goto L1f8;
                case 3: goto L1e8;
                case 4: goto L1d8;
                case 5: goto L1c8;
                case 6: goto L1b8;
                case 7: goto L1a8;
                case 8: goto L198;
                case 9: goto L188;
                case 10: goto L178;
                case 11: goto L168;
                case 12: goto L158;
                case 13: goto L148;
                default: goto Ld9;
            }
        Ld9:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            java.lang.String r5 = "MotionPaths"
            if (r3 == 0) goto L134
            java.lang.String r3 = ","
            java.lang.String[] r3 = r1.split(r3)
            r3 = r3[r4]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r4 = r7.attributes
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L8
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r4 = r7.attributes
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.widget.ConstraintAttribute r3 = (androidx.constraintlayout.widget.ConstraintAttribute) r3
            boolean r4 = r2 instanceof androidx.constraintlayout.motion.utils.ViewSpline.CustomSet
            if (r4 == 0) goto L106
            androidx.constraintlayout.motion.utils.ViewSpline$CustomSet r2 = (androidx.constraintlayout.motion.utils.ViewSpline.CustomSet) r2
            r2.setPoint(r9, r3)
            goto L8
        L106:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.String r4 = " ViewSpline not a CustomSet frame = "
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r4 = ", value"
            java.lang.StringBuilder r1 = r1.append(r4)
            float r3 = r3.getValueToInterpolate()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r5, r1)
            goto L8
        L134:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "UNKNOWN spline "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r5, r1)
            goto L8
        L148:
            float r1 = r7.alpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L151
            goto L153
        L151:
            float r3 = r7.alpha
        L153:
            r2.setPoint(r9, r3)
            goto L8
        L158:
            float r1 = r7.mPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L161
            goto L163
        L161:
            float r6 = r7.mPathRotate
        L163:
            r2.setPoint(r9, r6)
            goto L8
        L168:
            float r1 = r7.elevation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L171
            goto L173
        L171:
            float r6 = r7.elevation
        L173:
            r2.setPoint(r9, r6)
            goto L8
        L178:
            float r1 = r7.rotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L181
            goto L183
        L181:
            float r6 = r7.rotation
        L183:
            r2.setPoint(r9, r6)
            goto L8
        L188:
            float r1 = r7.mPivotY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L191
            goto L193
        L191:
            float r6 = r7.mPivotY
        L193:
            r2.setPoint(r9, r6)
            goto L8
        L198:
            float r1 = r7.mPivotX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1a1
            goto L1a3
        L1a1:
            float r6 = r7.mPivotX
        L1a3:
            r2.setPoint(r9, r6)
            goto L8
        L1a8:
            float r1 = r7.scaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1b1
            goto L1b3
        L1b1:
            float r3 = r7.scaleY
        L1b3:
            r2.setPoint(r9, r3)
            goto L8
        L1b8:
            float r1 = r7.scaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1c1
            goto L1c3
        L1c1:
            float r3 = r7.scaleX
        L1c3:
            r2.setPoint(r9, r3)
            goto L8
        L1c8:
            float r1 = r7.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1d1
            goto L1d3
        L1d1:
            float r6 = r7.mProgress
        L1d3:
            r2.setPoint(r9, r6)
            goto L8
        L1d8:
            float r1 = r7.translationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1e1
            goto L1e3
        L1e1:
            float r6 = r7.translationZ
        L1e3:
            r2.setPoint(r9, r6)
            goto L8
        L1e8:
            float r1 = r7.translationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1f1
            goto L1f3
        L1f1:
            float r6 = r7.translationY
        L1f3:
            r2.setPoint(r9, r6)
            goto L8
        L1f8:
            float r1 = r7.translationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L201
            goto L203
        L201:
            float r6 = r7.translationX
        L203:
            r2.setPoint(r9, r6)
            goto L8
        L208:
            float r1 = r7.rotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L211
            goto L213
        L211:
            float r6 = r7.rotationY
        L213:
            r2.setPoint(r9, r6)
            goto L8
        L218:
            float r1 = r7.rotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L221
            goto L223
        L221:
            float r6 = r7.rotationX
        L223:
            r2.setPoint(r9, r6)
            goto L8
        L228:
            return
    }

    public void applyParameters(android.view.View r2) {
            r1 = this;
            int r0 = r2.getVisibility()
            r1.visibility = r0
            int r0 = r2.getVisibility()
            if (r0 == 0) goto Le
            r0 = 0
            goto L12
        Le:
            float r0 = r2.getAlpha()
        L12:
            r1.alpha = r0
            r0 = 0
            r1.applyElevation = r0
            float r0 = r2.getElevation()
            r1.elevation = r0
            float r0 = r2.getRotation()
            r1.rotation = r0
            float r0 = r2.getRotationX()
            r1.rotationX = r0
            float r0 = r2.getRotationY()
            r1.rotationY = r0
            float r0 = r2.getScaleX()
            r1.scaleX = r0
            float r0 = r2.getScaleY()
            r1.scaleY = r0
            float r0 = r2.getPivotX()
            r1.mPivotX = r0
            float r0 = r2.getPivotY()
            r1.mPivotY = r0
            float r0 = r2.getTranslationX()
            r1.translationX = r0
            float r0 = r2.getTranslationY()
            r1.translationY = r0
            float r2 = r2.getTranslationZ()
            r1.translationZ = r2
            return
    }

    public void applyParameters(androidx.constraintlayout.widget.ConstraintSet.Constraint r5) {
            r4 = this;
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r0 = r5.propertySet
            int r0 = r0.mVisibilityMode
            r4.mVisibilityMode = r0
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r0 = r5.propertySet
            int r0 = r0.visibility
            r4.visibility = r0
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r0 = r5.propertySet
            int r0 = r0.visibility
            if (r0 == 0) goto L18
            int r0 = r4.mVisibilityMode
            if (r0 != 0) goto L18
            r0 = 0
            goto L1c
        L18:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r0 = r5.propertySet
            float r0 = r0.alpha
        L1c:
            r4.alpha = r0
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r5.transform
            boolean r0 = r0.applyElevation
            r4.applyElevation = r0
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r5.transform
            float r0 = r0.elevation
            r4.elevation = r0
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r5.transform
            float r0 = r0.rotation
            r4.rotation = r0
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r5.transform
            float r0 = r0.rotationX
            r4.rotationX = r0
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r5.transform
            float r0 = r0.rotationY
            r4.rotationY = r0
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r5.transform
            float r0 = r0.scaleX
            r4.scaleX = r0
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r5.transform
            float r0 = r0.scaleY
            r4.scaleY = r0
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r5.transform
            float r0 = r0.transformPivotX
            r4.mPivotX = r0
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r5.transform
            float r0 = r0.transformPivotY
            r4.mPivotY = r0
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r5.transform
            float r0 = r0.translationX
            r4.translationX = r0
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r5.transform
            float r0 = r0.translationY
            r4.translationY = r0
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r5.transform
            float r0 = r0.translationZ
            r4.translationZ = r0
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r5.motion
            java.lang.String r0 = r0.mTransitionEasing
            androidx.constraintlayout.core.motion.utils.Easing r0 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r0)
            r4.mKeyFrameEasing = r0
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r5.motion
            float r0 = r0.mPathRotate
            r4.mPathRotate = r0
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r5.motion
            int r0 = r0.mDrawPath
            r4.mDrawPath = r0
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r5.motion
            int r0 = r0.mAnimateRelativeTo
            r4.mAnimateRelativeTo = r0
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r0 = r5.propertySet
            float r0 = r0.mProgress
            r4.mProgress = r0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r5.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L92:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb2
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r5.mCustomConstraints
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
            boolean r3 = r2.isContinuous()
            if (r3 == 0) goto L92
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r4.attributes
            r3.put(r1, r2)
            goto L92
        Lb2:
            return
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(androidx.constraintlayout.motion.widget.MotionConstrainedPoint r2) {
            r1 = this;
            float r0 = r1.position
            float r2 = r2.position
            int r2 = java.lang.Float.compare(r0, r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1) {
            r0 = this;
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = (androidx.constraintlayout.motion.widget.MotionConstrainedPoint) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    void different(androidx.constraintlayout.motion.widget.MotionConstrainedPoint r5, java.util.HashSet<java.lang.String> r6) {
            r4 = this;
            float r0 = r4.alpha
            float r1 = r5.alpha
            boolean r0 = r4.diff(r0, r1)
            java.lang.String r1 = "alpha"
            if (r0 == 0) goto Lf
            r6.add(r1)
        Lf:
            float r0 = r4.elevation
            float r2 = r5.elevation
            boolean r0 = r4.diff(r0, r2)
            if (r0 == 0) goto L1e
            java.lang.String r0 = "elevation"
            r6.add(r0)
        L1e:
            int r0 = r4.visibility
            int r2 = r5.visibility
            if (r0 == r2) goto L2f
            int r3 = r4.mVisibilityMode
            if (r3 != 0) goto L2f
            if (r0 == 0) goto L2c
            if (r2 != 0) goto L2f
        L2c:
            r6.add(r1)
        L2f:
            float r0 = r4.rotation
            float r1 = r5.rotation
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto L3e
            java.lang.String r0 = "rotation"
            r6.add(r0)
        L3e:
            float r0 = r4.mPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4e
            float r0 = r5.mPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L53
        L4e:
            java.lang.String r0 = "transitionPathRotate"
            r6.add(r0)
        L53:
            float r0 = r4.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L63
            float r0 = r5.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L68
        L63:
            java.lang.String r0 = "progress"
            r6.add(r0)
        L68:
            float r0 = r4.rotationX
            float r1 = r5.rotationX
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto L77
            java.lang.String r0 = "rotationX"
            r6.add(r0)
        L77:
            float r0 = r4.rotationY
            float r1 = r5.rotationY
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto L86
            java.lang.String r0 = "rotationY"
            r6.add(r0)
        L86:
            float r0 = r4.mPivotX
            float r1 = r5.mPivotX
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto L95
            java.lang.String r0 = "transformPivotX"
            r6.add(r0)
        L95:
            float r0 = r4.mPivotY
            float r1 = r5.mPivotY
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto La4
            java.lang.String r0 = "transformPivotY"
            r6.add(r0)
        La4:
            float r0 = r4.scaleX
            float r1 = r5.scaleX
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto Lb3
            java.lang.String r0 = "scaleX"
            r6.add(r0)
        Lb3:
            float r0 = r4.scaleY
            float r1 = r5.scaleY
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto Lc2
            java.lang.String r0 = "scaleY"
            r6.add(r0)
        Lc2:
            float r0 = r4.translationX
            float r1 = r5.translationX
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto Ld1
            java.lang.String r0 = "translationX"
            r6.add(r0)
        Ld1:
            float r0 = r4.translationY
            float r1 = r5.translationY
            boolean r0 = r4.diff(r0, r1)
            if (r0 == 0) goto Le0
            java.lang.String r0 = "translationY"
            r6.add(r0)
        Le0:
            float r0 = r4.translationZ
            float r5 = r5.translationZ
            boolean r5 = r4.diff(r0, r5)
            if (r5 == 0) goto Lef
            java.lang.String r5 = "translationZ"
            r6.add(r5)
        Lef:
            return
    }

    void different(androidx.constraintlayout.motion.widget.MotionConstrainedPoint r4, boolean[] r5, java.lang.String[] r6) {
            r3 = this;
            r6 = 0
            boolean r0 = r5[r6]
            float r1 = r3.position
            float r2 = r4.position
            boolean r1 = r3.diff(r1, r2)
            r0 = r0 | r1
            r5[r6] = r0
            r6 = 1
            boolean r0 = r5[r6]
            float r1 = r3.f50x
            float r2 = r4.f50x
            boolean r1 = r3.diff(r1, r2)
            r0 = r0 | r1
            r5[r6] = r0
            r6 = 2
            boolean r0 = r5[r6]
            float r1 = r3.f51y
            float r2 = r4.f51y
            boolean r1 = r3.diff(r1, r2)
            r0 = r0 | r1
            r5[r6] = r0
            r6 = 3
            boolean r0 = r5[r6]
            float r1 = r3.width
            float r2 = r4.width
            boolean r1 = r3.diff(r1, r2)
            r0 = r0 | r1
            r5[r6] = r0
            r6 = 4
            boolean r0 = r5[r6]
            float r1 = r3.height
            float r4 = r4.height
            boolean r4 = r3.diff(r1, r4)
            r4 = r4 | r0
            r5[r6] = r4
            return
    }

    void fillStandard(double[] r9, int[] r10) {
            r8 = this;
            r0 = 18
            float[] r1 = new float[r0]
            float r2 = r8.position
            r3 = 0
            r1[r3] = r2
            r2 = 1
            float r4 = r8.f50x
            r1[r2] = r4
            r2 = 2
            float r4 = r8.f51y
            r1[r2] = r4
            r2 = 3
            float r4 = r8.width
            r1[r2] = r4
            r2 = 4
            float r4 = r8.height
            r1[r2] = r4
            r2 = 5
            float r4 = r8.alpha
            r1[r2] = r4
            r2 = 6
            float r4 = r8.elevation
            r1[r2] = r4
            r2 = 7
            float r4 = r8.rotation
            r1[r2] = r4
            r2 = 8
            float r4 = r8.rotationX
            r1[r2] = r4
            r2 = 9
            float r4 = r8.rotationY
            r1[r2] = r4
            r2 = 10
            float r4 = r8.scaleX
            r1[r2] = r4
            r2 = 11
            float r4 = r8.scaleY
            r1[r2] = r4
            r2 = 12
            float r4 = r8.mPivotX
            r1[r2] = r4
            r2 = 13
            float r4 = r8.mPivotY
            r1[r2] = r4
            r2 = 14
            float r4 = r8.translationX
            r1[r2] = r4
            r2 = 15
            float r4 = r8.translationY
            r1[r2] = r4
            r2 = 16
            float r4 = r8.translationZ
            r1[r2] = r4
            r2 = 17
            float r4 = r8.mPathRotate
            r1[r2] = r4
            r2 = r3
        L69:
            int r4 = r10.length
            if (r3 >= r4) goto L7b
            r4 = r10[r3]
            if (r4 >= r0) goto L78
            int r5 = r2 + 1
            r4 = r1[r4]
            double r6 = (double) r4
            r9[r2] = r6
            r2 = r5
        L78:
            int r3 = r3 + 1
            goto L69
        L7b:
            return
    }

    int getCustomData(java.lang.String r6, double[] r7, int r8) {
            r5 = this;
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r5.attributes
            java.lang.Object r6 = r0.get(r6)
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            int r0 = r6.numberOfInterpolatedValues()
            r1 = 1
            if (r0 != r1) goto L17
            float r6 = r6.getValueToInterpolate()
            double r2 = (double) r6
            r7[r8] = r2
            return r1
        L17:
            int r0 = r6.numberOfInterpolatedValues()
            float[] r1 = new float[r0]
            r6.getValuesToInterpolate(r1)
            r6 = 0
        L21:
            if (r6 >= r0) goto L2e
            int r2 = r8 + 1
            r3 = r1[r6]
            double r3 = (double) r3
            r7[r8] = r3
            int r6 = r6 + 1
            r8 = r2
            goto L21
        L2e:
            return r0
    }

    int getCustomDataCount(java.lang.String r2) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.attributes
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
            int r2 = r2.numberOfInterpolatedValues()
            return r2
    }

    boolean hasCustomData(java.lang.String r2) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.attributes
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    void setBounds(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.f50x = r1
            r0.f51y = r2
            r0.width = r3
            r0.height = r4
            return
    }

    public void setState(android.graphics.Rect r4, android.view.View r5, int r6, float r7) {
            r3 = this;
            int r0 = r4.left
            float r0 = (float) r0
            int r1 = r4.top
            float r1 = (float) r1
            int r2 = r4.width()
            float r2 = (float) r2
            int r4 = r4.height()
            float r4 = (float) r4
            r3.setBounds(r0, r1, r2, r4)
            r3.applyParameters(r5)
            r4 = 2143289344(0x7fc00000, float:NaN)
            r3.mPivotX = r4
            r3.mPivotY = r4
            r4 = 1
            r5 = 1119092736(0x42b40000, float:90.0)
            if (r6 == r4) goto L29
            r4 = 2
            if (r6 == r4) goto L25
            goto L2c
        L25:
            float r7 = r7 + r5
            r3.rotation = r7
            goto L2c
        L29:
            float r7 = r7 - r5
            r3.rotation = r7
        L2c:
            return
    }

    public void setState(android.graphics.Rect r4, androidx.constraintlayout.widget.ConstraintSet r5, int r6, int r7) {
            r3 = this;
            int r0 = r4.left
            float r0 = (float) r0
            int r1 = r4.top
            float r1 = (float) r1
            int r2 = r4.width()
            float r2 = (float) r2
            int r4 = r4.height()
            float r4 = (float) r4
            r3.setBounds(r0, r1, r2, r4)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r4 = r5.getParameters(r7)
            r3.applyParameters(r4)
            r4 = 1
            r5 = 1119092736(0x42b40000, float:90.0)
            if (r6 == r4) goto L3a
            r4 = 2
            if (r6 == r4) goto L29
            r4 = 3
            if (r6 == r4) goto L3a
            r4 = 4
            if (r6 == r4) goto L29
            goto L3f
        L29:
            float r4 = r3.rotation
            float r4 = r4 + r5
            r3.rotation = r4
            r5 = 1127481344(0x43340000, float:180.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L3f
            r5 = 1135869952(0x43b40000, float:360.0)
            float r4 = r4 - r5
            r3.rotation = r4
            goto L3f
        L3a:
            float r4 = r3.rotation
            float r4 = r4 - r5
            r3.rotation = r4
        L3f:
            return
    }

    public void setState(android.view.View r5) {
            r4 = this;
            float r0 = r5.getX()
            float r1 = r5.getY()
            int r2 = r5.getWidth()
            float r2 = (float) r2
            int r3 = r5.getHeight()
            float r3 = (float) r3
            r4.setBounds(r0, r1, r2, r3)
            r4.applyParameters(r5)
            return
    }
}
