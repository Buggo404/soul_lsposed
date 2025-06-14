package androidx.constraintlayout.core.motion;

/* loaded from: classes.dex */
class MotionConstrainedPoint implements java.lang.Comparable<androidx.constraintlayout.core.motion.MotionConstrainedPoint> {
    static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    static final int PERPENDICULAR = 1;
    public static final java.lang.String TAG = "MotionPaths";
    static java.lang.String[] names;
    private float alpha;
    private boolean applyElevation;
    private float elevation;
    private float height;
    private int mAnimateRelativeTo;
    java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> mCustomVariable;
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
    private float f16x;

    /* renamed from: y */
    private float f17y;

    static {
            java.lang.String r0 = "position"
            java.lang.String r1 = "x"
            java.lang.String r2 = "y"
            java.lang.String r3 = "width"
            java.lang.String r4 = "height"
            java.lang.String r5 = "pathRotate"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            androidx.constraintlayout.core.motion.MotionConstrainedPoint.names = r0
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
            r3.mCustomVariable = r0
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

    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r8, int r9) {
            r7 = this;
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.get(r1)
            androidx.constraintlayout.core.motion.utils.SplineSet r2 = (androidx.constraintlayout.core.motion.utils.SplineSet) r2
            r1.hashCode()
            int r3 = r1.hashCode()
            r4 = 1
            r5 = -1
            switch(r3) {
                case -1249320806: goto Lbb;
                case -1249320805: goto Lb0;
                case -1249320804: goto La5;
                case -1225497657: goto L9a;
                case -1225497656: goto L8f;
                case -1225497655: goto L84;
                case -1001078227: goto L79;
                case -987906986: goto L6e;
                case -987906985: goto L60;
                case -908189618: goto L52;
                case -908189617: goto L44;
                case 92909918: goto L36;
                case 803192288: goto L28;
                default: goto L26;
            }
        L26:
            goto Lc5
        L28:
            java.lang.String r3 = "pathRotate"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L32
            goto Lc5
        L32:
            r5 = 12
            goto Lc5
        L36:
            java.lang.String r3 = "alpha"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L40
            goto Lc5
        L40:
            r5 = 11
            goto Lc5
        L44:
            java.lang.String r3 = "scaleY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L4e
            goto Lc5
        L4e:
            r5 = 10
            goto Lc5
        L52:
            java.lang.String r3 = "scaleX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L5c
            goto Lc5
        L5c:
            r5 = 9
            goto Lc5
        L60:
            java.lang.String r3 = "pivotY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L6a
            goto Lc5
        L6a:
            r5 = 8
            goto Lc5
        L6e:
            java.lang.String r3 = "pivotX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L77
            goto Lc5
        L77:
            r5 = 7
            goto Lc5
        L79:
            java.lang.String r3 = "progress"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L82
            goto Lc5
        L82:
            r5 = 6
            goto Lc5
        L84:
            java.lang.String r3 = "translationZ"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L8d
            goto Lc5
        L8d:
            r5 = 5
            goto Lc5
        L8f:
            java.lang.String r3 = "translationY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L98
            goto Lc5
        L98:
            r5 = 4
            goto Lc5
        L9a:
            java.lang.String r3 = "translationX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto La3
            goto Lc5
        La3:
            r5 = 3
            goto Lc5
        La5:
            java.lang.String r3 = "rotationZ"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lae
            goto Lc5
        Lae:
            r5 = 2
            goto Lc5
        Lb0:
            java.lang.String r3 = "rotationY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lb9
            goto Lc5
        Lb9:
            r5 = r4
            goto Lc5
        Lbb:
            java.lang.String r3 = "rotationX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lc4
            goto Lc5
        Lc4:
            r5 = 0
        Lc5:
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r5) {
                case 0: goto L1fa;
                case 1: goto L1ea;
                case 2: goto L1da;
                case 3: goto L1ca;
                case 4: goto L1ba;
                case 5: goto L1aa;
                case 6: goto L19a;
                case 7: goto L18a;
                case 8: goto L17a;
                case 9: goto L16a;
                case 10: goto L15a;
                case 11: goto L14a;
                case 12: goto L13a;
                default: goto Lcb;
            }
        Lcb:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            java.lang.String r5 = "MotionPaths"
            if (r3 == 0) goto L126
            java.lang.String r3 = ","
            java.lang.String[] r3 = r1.split(r3)
            r3 = r3[r4]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r4 = r7.mCustomVariable
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L8
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r4 = r7.mCustomVariable
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.core.motion.CustomVariable r3 = (androidx.constraintlayout.core.motion.CustomVariable) r3
            boolean r4 = r2 instanceof androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline
            if (r4 == 0) goto Lf8
            androidx.constraintlayout.core.motion.utils.SplineSet$CustomSpline r2 = (androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline) r2
            r2.setPoint(r9, r3)
            goto L8
        Lf8:
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
            androidx.constraintlayout.core.motion.utils.Utils.loge(r5, r1)
            goto L8
        L126:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "UNKNOWN spline "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            androidx.constraintlayout.core.motion.utils.Utils.loge(r5, r1)
            goto L8
        L13a:
            float r1 = r7.mPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L143
            goto L145
        L143:
            float r6 = r7.mPathRotate
        L145:
            r2.setPoint(r9, r6)
            goto L8
        L14a:
            float r1 = r7.alpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L153
            goto L155
        L153:
            float r3 = r7.alpha
        L155:
            r2.setPoint(r9, r3)
            goto L8
        L15a:
            float r1 = r7.scaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L163
            goto L165
        L163:
            float r3 = r7.scaleY
        L165:
            r2.setPoint(r9, r3)
            goto L8
        L16a:
            float r1 = r7.scaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L173
            goto L175
        L173:
            float r3 = r7.scaleX
        L175:
            r2.setPoint(r9, r3)
            goto L8
        L17a:
            float r1 = r7.mPivotY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L183
            goto L185
        L183:
            float r6 = r7.mPivotY
        L185:
            r2.setPoint(r9, r6)
            goto L8
        L18a:
            float r1 = r7.mPivotX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L193
            goto L195
        L193:
            float r6 = r7.mPivotX
        L195:
            r2.setPoint(r9, r6)
            goto L8
        L19a:
            float r1 = r7.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1a3
            goto L1a5
        L1a3:
            float r6 = r7.mProgress
        L1a5:
            r2.setPoint(r9, r6)
            goto L8
        L1aa:
            float r1 = r7.translationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1b3
            goto L1b5
        L1b3:
            float r6 = r7.translationZ
        L1b5:
            r2.setPoint(r9, r6)
            goto L8
        L1ba:
            float r1 = r7.translationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1c3
            goto L1c5
        L1c3:
            float r6 = r7.translationY
        L1c5:
            r2.setPoint(r9, r6)
            goto L8
        L1ca:
            float r1 = r7.translationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1d3
            goto L1d5
        L1d3:
            float r6 = r7.translationX
        L1d5:
            r2.setPoint(r9, r6)
            goto L8
        L1da:
            float r1 = r7.rotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1e3
            goto L1e5
        L1e3:
            float r6 = r7.rotation
        L1e5:
            r2.setPoint(r9, r6)
            goto L8
        L1ea:
            float r1 = r7.rotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1f3
            goto L1f5
        L1f3:
            float r6 = r7.rotationY
        L1f5:
            r2.setPoint(r9, r6)
            goto L8
        L1fa:
            float r1 = r7.rotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L203
            goto L205
        L203:
            float r6 = r7.rotationX
        L205:
            r2.setPoint(r9, r6)
            goto L8
        L20a:
            return
    }

    public void applyParameters(androidx.constraintlayout.core.motion.MotionWidget r5) {
            r4 = this;
            int r0 = r5.getVisibility()
            r4.visibility = r0
            int r0 = r5.getVisibility()
            r1 = 4
            if (r0 == r1) goto Lf
            r0 = 0
            goto L13
        Lf:
            float r0 = r5.getAlpha()
        L13:
            r4.alpha = r0
            r0 = 0
            r4.applyElevation = r0
            float r0 = r5.getRotationZ()
            r4.rotation = r0
            float r0 = r5.getRotationX()
            r4.rotationX = r0
            float r0 = r5.getRotationY()
            r4.rotationY = r0
            float r0 = r5.getScaleX()
            r4.scaleX = r0
            float r0 = r5.getScaleY()
            r4.scaleY = r0
            float r0 = r5.getPivotX()
            r4.mPivotX = r0
            float r0 = r5.getPivotY()
            r4.mPivotY = r0
            float r0 = r5.getTranslationX()
            r4.translationX = r0
            float r0 = r5.getTranslationY()
            r4.translationY = r0
            float r0 = r5.getTranslationZ()
            r4.translationZ = r0
            java.util.Set r0 = r5.getCustomAttributeNames()
            java.util.Iterator r0 = r0.iterator()
        L5c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            androidx.constraintlayout.core.motion.CustomVariable r2 = r5.getCustomAttribute(r1)
            if (r2 == 0) goto L5c
            boolean r3 = r2.isContinuous()
            if (r3 == 0) goto L5c
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r3 = r4.mCustomVariable
            r3.put(r1, r2)
            goto L5c
        L7a:
            return
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(androidx.constraintlayout.core.motion.MotionConstrainedPoint r2) {
            r1 = this;
            float r0 = r1.position
            float r2 = r2.position
            int r2 = java.lang.Float.compare(r0, r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(androidx.constraintlayout.core.motion.MotionConstrainedPoint r1) {
            r0 = this;
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r1 = (androidx.constraintlayout.core.motion.MotionConstrainedPoint) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    void different(androidx.constraintlayout.core.motion.MotionConstrainedPoint r6, java.util.HashSet<java.lang.String> r7) {
            r5 = this;
            float r0 = r5.alpha
            float r1 = r6.alpha
            boolean r0 = r5.diff(r0, r1)
            java.lang.String r1 = "alpha"
            if (r0 == 0) goto Lf
            r7.add(r1)
        Lf:
            float r0 = r5.elevation
            float r2 = r6.elevation
            boolean r0 = r5.diff(r0, r2)
            java.lang.String r2 = "translationZ"
            if (r0 == 0) goto L1e
            r7.add(r2)
        L1e:
            int r0 = r5.visibility
            int r3 = r6.visibility
            if (r0 == r3) goto L30
            int r4 = r5.mVisibilityMode
            if (r4 != 0) goto L30
            r4 = 4
            if (r0 == r4) goto L2d
            if (r3 != r4) goto L30
        L2d:
            r7.add(r1)
        L30:
            float r0 = r5.rotation
            float r1 = r6.rotation
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto L3f
            java.lang.String r0 = "rotationZ"
            r7.add(r0)
        L3f:
            float r0 = r5.mPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4f
            float r0 = r6.mPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L54
        L4f:
            java.lang.String r0 = "pathRotate"
            r7.add(r0)
        L54:
            float r0 = r5.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L64
            float r0 = r6.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L69
        L64:
            java.lang.String r0 = "progress"
            r7.add(r0)
        L69:
            float r0 = r5.rotationX
            float r1 = r6.rotationX
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto L78
            java.lang.String r0 = "rotationX"
            r7.add(r0)
        L78:
            float r0 = r5.rotationY
            float r1 = r6.rotationY
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto L87
            java.lang.String r0 = "rotationY"
            r7.add(r0)
        L87:
            float r0 = r5.mPivotX
            float r1 = r6.mPivotX
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto L96
            java.lang.String r0 = "pivotX"
            r7.add(r0)
        L96:
            float r0 = r5.mPivotY
            float r1 = r6.mPivotY
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto La5
            java.lang.String r0 = "pivotY"
            r7.add(r0)
        La5:
            float r0 = r5.scaleX
            float r1 = r6.scaleX
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto Lb4
            java.lang.String r0 = "scaleX"
            r7.add(r0)
        Lb4:
            float r0 = r5.scaleY
            float r1 = r6.scaleY
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto Lc3
            java.lang.String r0 = "scaleY"
            r7.add(r0)
        Lc3:
            float r0 = r5.translationX
            float r1 = r6.translationX
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto Ld2
            java.lang.String r0 = "translationX"
            r7.add(r0)
        Ld2:
            float r0 = r5.translationY
            float r1 = r6.translationY
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto Le1
            java.lang.String r0 = "translationY"
            r7.add(r0)
        Le1:
            float r0 = r5.translationZ
            float r1 = r6.translationZ
            boolean r0 = r5.diff(r0, r1)
            if (r0 == 0) goto Lee
            r7.add(r2)
        Lee:
            float r0 = r5.elevation
            float r6 = r6.elevation
            boolean r6 = r5.diff(r0, r6)
            if (r6 == 0) goto Lfd
            java.lang.String r6 = "elevation"
            r7.add(r6)
        Lfd:
            return
    }

    void different(androidx.constraintlayout.core.motion.MotionConstrainedPoint r4, boolean[] r5, java.lang.String[] r6) {
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
            float r1 = r3.f16x
            float r2 = r4.f16x
            boolean r1 = r3.diff(r1, r2)
            r0 = r0 | r1
            r5[r6] = r0
            r6 = 2
            boolean r0 = r5[r6]
            float r1 = r3.f17y
            float r2 = r4.f17y
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
            float r4 = r8.f16x
            r1[r2] = r4
            r2 = 2
            float r4 = r8.f17y
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
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r5.mCustomVariable
            java.lang.Object r6 = r0.get(r6)
            androidx.constraintlayout.core.motion.CustomVariable r6 = (androidx.constraintlayout.core.motion.CustomVariable) r6
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
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r1.mCustomVariable
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.motion.CustomVariable r2 = (androidx.constraintlayout.core.motion.CustomVariable) r2
            int r2 = r2.numberOfInterpolatedValues()
            return r2
    }

    boolean hasCustomData(java.lang.String r2) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r1.mCustomVariable
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    void setBounds(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.f16x = r1
            r0.f17y = r2
            r0.width = r3
            r0.height = r4
            return
    }

    public void setState(androidx.constraintlayout.core.motion.MotionWidget r5) {
            r4 = this;
            int r0 = r5.getX()
            float r0 = (float) r0
            int r1 = r5.getY()
            float r1 = (float) r1
            int r2 = r5.getWidth()
            float r2 = (float) r2
            int r3 = r5.getHeight()
            float r3 = (float) r3
            r4.setBounds(r0, r1, r2, r3)
            r4.applyParameters(r5)
            return
    }

    public void setState(androidx.constraintlayout.core.motion.utils.Rect r4, androidx.constraintlayout.core.motion.MotionWidget r5, int r6, float r7) {
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
}
