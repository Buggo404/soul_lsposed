package androidx.constraintlayout.helper.widget;

/* loaded from: classes.dex */
public class CircularFlow extends androidx.constraintlayout.widget.VirtualLayout {
    private static float DEFAULT_ANGLE = 0.0f;
    private static int DEFAULT_RADIUS = 0;
    private static final java.lang.String TAG = "CircularFlow";
    private float[] mAngles;
    androidx.constraintlayout.widget.ConstraintLayout mContainer;
    private int mCountAngle;
    private int mCountRadius;
    private int[] mRadius;
    private java.lang.String mReferenceAngles;
    private java.lang.Float mReferenceDefaultAngle;
    private java.lang.Integer mReferenceDefaultRadius;
    private java.lang.String mReferenceRadius;
    int mViewCenter;

    static {
            return
    }

    public CircularFlow(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public CircularFlow(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public CircularFlow(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void addAngle(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L34
            int r0 = r4.length()
            if (r0 != 0) goto L9
            goto L34
        L9:
            android.content.Context r0 = r3.myContext
            if (r0 != 0) goto Le
            return
        Le:
            float[] r0 = r3.mAngles
            if (r0 != 0) goto L13
            return
        L13:
            int r1 = r3.mCountAngle
            int r1 = r1 + 1
            int r2 = r0.length
            if (r1 <= r2) goto L23
            int r1 = r0.length
            int r1 = r1 + 1
            float[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.mAngles = r0
        L23:
            float[] r0 = r3.mAngles
            int r1 = r3.mCountAngle
            int r4 = java.lang.Integer.parseInt(r4)
            float r4 = (float) r4
            r0[r1] = r4
            int r4 = r3.mCountAngle
            int r4 = r4 + 1
            r3.mCountAngle = r4
        L34:
            return
    }

    private void addRadius(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L42
            int r0 = r4.length()
            if (r0 != 0) goto L9
            goto L42
        L9:
            android.content.Context r0 = r3.myContext
            if (r0 != 0) goto Le
            return
        Le:
            int[] r0 = r3.mRadius
            if (r0 != 0) goto L13
            return
        L13:
            int r1 = r3.mCountRadius
            int r1 = r1 + 1
            int r2 = r0.length
            if (r1 <= r2) goto L23
            int r1 = r0.length
            int r1 = r1 + 1
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.mRadius = r0
        L23:
            int[] r0 = r3.mRadius
            int r1 = r3.mCountRadius
            int r4 = java.lang.Integer.parseInt(r4)
            float r4 = (float) r4
            android.content.Context r2 = r3.myContext
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r4 = r4 * r2
            int r4 = (int) r4
            r0[r1] = r4
            int r4 = r3.mCountRadius
            int r4 = r4 + 1
            r3.mCountRadius = r4
        L42:
            return
    }

    private void anchorReferences() {
            r9 = this;
            android.view.ViewParent r0 = r9.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r9.mContainer = r0
            r0 = 0
        L9:
            int r1 = r9.mCount
            if (r0 >= r1) goto Lda
            androidx.constraintlayout.widget.ConstraintLayout r1 = r9.mContainer
            int[] r2 = r9.mIds
            r2 = r2[r0]
            android.view.View r1 = r1.getViewById(r2)
            if (r1 != 0) goto L1b
            goto Ld6
        L1b:
            int r2 = androidx.constraintlayout.helper.widget.CircularFlow.DEFAULT_RADIUS
            float r3 = androidx.constraintlayout.helper.widget.CircularFlow.DEFAULT_ANGLE
            int[] r4 = r9.mRadius
            java.lang.String r5 = "CircularFlow"
            r6 = 1
            if (r4 == 0) goto L2c
            int r7 = r4.length
            if (r0 >= r7) goto L2c
            r2 = r4[r0]
            goto L72
        L2c:
            java.lang.Integer r4 = r9.mReferenceDefaultRadius
            if (r4 == 0) goto L50
            int r4 = r4.intValue()
            r7 = -1
            if (r4 == r7) goto L50
            int r4 = r9.mCountRadius
            int r4 = r4 + r6
            r9.mCountRadius = r4
            int[] r4 = r9.mRadius
            if (r4 != 0) goto L44
            int[] r4 = new int[r6]
            r9.mRadius = r4
        L44:
            int[] r4 = r9.getRadius()
            r9.mRadius = r4
            int r7 = r9.mCountRadius
            int r7 = r7 - r6
            r4[r7] = r2
            goto L72
        L50:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "Added radius to view with id: "
            r4.<init>(r7)
            java.util.HashMap<java.lang.Integer, java.lang.String> r7 = r9.mMap
            int r8 = r1.getId()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r5, r4)
        L72:
            float[] r4 = r9.mAngles
            if (r4 == 0) goto L7c
            int r7 = r4.length
            if (r0 >= r7) goto L7c
            r3 = r4[r0]
            goto Lc5
        L7c:
            java.lang.Float r4 = r9.mReferenceDefaultAngle
            if (r4 == 0) goto La3
            float r4 = r4.floatValue()
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto La3
            int r4 = r9.mCountAngle
            int r4 = r4 + r6
            r9.mCountAngle = r4
            float[] r4 = r9.mAngles
            if (r4 != 0) goto L97
            float[] r4 = new float[r6]
            r9.mAngles = r4
        L97:
            float[] r4 = r9.getAngles()
            r9.mAngles = r4
            int r5 = r9.mCountAngle
            int r5 = r5 - r6
            r4[r5] = r3
            goto Lc5
        La3:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Added angle to view with id: "
            r4.<init>(r6)
            java.util.HashMap<java.lang.Integer, java.lang.String> r6 = r9.mMap
            int r7 = r1.getId()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r5, r4)
        Lc5:
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r4
            r4.circleAngle = r3
            int r3 = r9.mViewCenter
            r4.circleConstraint = r3
            r4.circleRadius = r2
            r1.setLayoutParams(r4)
        Ld6:
            int r0 = r0 + 1
            goto L9
        Lda:
            r9.applyLayoutFeatures()
            return
    }

    private float[] removeAngle(float[] r2, int r3) {
            r1 = this;
            if (r2 == 0) goto Ld
            if (r3 < 0) goto Ld
            int r0 = r1.mCountAngle
            if (r3 < r0) goto L9
            goto Ld
        L9:
            float[] r2 = removeElementFromArray(r2, r3)
        Ld:
            return r2
    }

    public static float[] removeElementFromArray(float[] r5, int r6) {
            int r0 = r5.length
            int r0 = r0 + (-1)
            float[] r0 = new float[r0]
            r1 = 0
            r2 = r1
        L7:
            int r3 = r5.length
            if (r1 >= r3) goto L17
            if (r1 != r6) goto Ld
            goto L14
        Ld:
            int r3 = r2 + 1
            r4 = r5[r1]
            r0[r2] = r4
            r2 = r3
        L14:
            int r1 = r1 + 1
            goto L7
        L17:
            return r0
    }

    public static int[] removeElementFromArray(int[] r5, int r6) {
            int r0 = r5.length
            int r0 = r0 + (-1)
            int[] r0 = new int[r0]
            r1 = 0
            r2 = r1
        L7:
            int r3 = r5.length
            if (r1 >= r3) goto L17
            if (r1 != r6) goto Ld
            goto L14
        Ld:
            int r3 = r2 + 1
            r4 = r5[r1]
            r0[r2] = r4
            r2 = r3
        L14:
            int r1 = r1 + 1
            goto L7
        L17:
            return r0
    }

    private int[] removeRadius(int[] r2, int r3) {
            r1 = this;
            if (r2 == 0) goto Ld
            if (r3 < 0) goto Ld
            int r0 = r1.mCountRadius
            if (r3 < r0) goto L9
            goto Ld
        L9:
            int[] r2 = removeElementFromArray(r2, r3)
        Ld:
            return r2
    }

    private void setAngles(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            r0 = 0
            r3.mCountAngle = r0
        L6:
            r1 = 44
            int r1 = r4.indexOf(r1, r0)
            r2 = -1
            if (r1 != r2) goto L1b
            java.lang.String r4 = r4.substring(r0)
            java.lang.String r4 = r4.trim()
            r3.addAngle(r4)
            return
        L1b:
            java.lang.String r0 = r4.substring(r0, r1)
            java.lang.String r0 = r0.trim()
            r3.addAngle(r0)
            int r0 = r1 + 1
            goto L6
    }

    private void setRadius(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            r0 = 0
            r3.mCountRadius = r0
        L6:
            r1 = 44
            int r1 = r4.indexOf(r1, r0)
            r2 = -1
            if (r1 != r2) goto L1b
            java.lang.String r4 = r4.substring(r0)
            java.lang.String r4 = r4.trim()
            r3.addRadius(r4)
            return
        L1b:
            java.lang.String r0 = r4.substring(r0, r1)
            java.lang.String r0 = r0.trim()
            r3.addRadius(r0)
            int r0 = r1 + 1
            goto L6
    }

    public void addViewToCircularFlow(android.view.View r2, int r3, float r4) {
            r1 = this;
            int r0 = r2.getId()
            boolean r0 = r1.containsId(r0)
            if (r0 == 0) goto Lb
            return
        Lb:
            r1.addView(r2)
            int r2 = r1.mCountAngle
            int r2 = r2 + 1
            r1.mCountAngle = r2
            float[] r2 = r1.getAngles()
            r1.mAngles = r2
            int r0 = r1.mCountAngle
            int r0 = r0 + (-1)
            r2[r0] = r4
            int r2 = r1.mCountRadius
            int r2 = r2 + 1
            r1.mCountRadius = r2
            int[] r2 = r1.getRadius()
            r1.mRadius = r2
            int r4 = r1.mCountRadius
            int r4 = r4 + (-1)
            float r3 = (float) r3
            android.content.Context r0 = r1.myContext
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r3 = r3 * r0
            int r3 = (int) r3
            r2[r4] = r3
            r1.anchorReferences()
            return
    }

    public float[] getAngles() {
            r2 = this;
            float[] r0 = r2.mAngles
            int r1 = r2.mCountAngle
            float[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }

    public int[] getRadius() {
            r2 = this;
            int[] r0 = r2.mRadius
            int r1 = r2.mCountRadius
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void init(android.util.AttributeSet r6) {
            r5 = this;
            super.init(r6)
            if (r6 == 0) goto L77
            android.content.Context r0 = r5.getContext()
            int[] r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r1)
            int r0 = r6.getIndexCount()
            r1 = 0
            r2 = r1
        L15:
            if (r2 >= r0) goto L74
            int r3 = r6.getIndex(r2)
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_circularflow_viewCenter
            if (r3 != r4) goto L26
            int r3 = r6.getResourceId(r3, r1)
            r5.mViewCenter = r3
            goto L71
        L26:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_circularflow_angles
            if (r3 != r4) goto L34
            java.lang.String r3 = r6.getString(r3)
            r5.mReferenceAngles = r3
            r5.setAngles(r3)
            goto L71
        L34:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_circularflow_radiusInDP
            if (r3 != r4) goto L42
            java.lang.String r3 = r6.getString(r3)
            r5.mReferenceRadius = r3
            r5.setRadius(r3)
            goto L71
        L42:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_circularflow_defaultAngle
            if (r3 != r4) goto L5a
            float r4 = androidx.constraintlayout.helper.widget.CircularFlow.DEFAULT_ANGLE
            float r3 = r6.getFloat(r3, r4)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r5.mReferenceDefaultAngle = r3
            float r3 = r3.floatValue()
            r5.setDefaultAngle(r3)
            goto L71
        L5a:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_circularflow_defaultRadius
            if (r3 != r4) goto L71
            int r4 = androidx.constraintlayout.helper.widget.CircularFlow.DEFAULT_RADIUS
            int r3 = r6.getDimensionPixelSize(r3, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.mReferenceDefaultRadius = r3
            int r3 = r3.intValue()
            r5.setDefaultRadius(r3)
        L71:
            int r2 = r2 + 1
            goto L15
        L74:
            r6.recycle()
        L77:
            return
    }

    public boolean isUpdatable(android.view.View r3) {
            r2 = this;
            int r0 = r3.getId()
            boolean r0 = r2.containsId(r0)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            int r3 = r3.getId()
            int r3 = r2.indexFromId(r3)
            r0 = -1
            if (r3 == r0) goto L18
            r1 = 1
        L18:
            return r1
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
            r3 = this;
            super.onAttachedToWindow()
            java.lang.String r0 = r3.mReferenceAngles
            r1 = 1
            if (r0 == 0) goto Lf
            float[] r2 = new float[r1]
            r3.mAngles = r2
            r3.setAngles(r0)
        Lf:
            java.lang.String r0 = r3.mReferenceRadius
            if (r0 == 0) goto L1a
            int[] r1 = new int[r1]
            r3.mRadius = r1
            r3.setRadius(r0)
        L1a:
            java.lang.Float r0 = r3.mReferenceDefaultAngle
            if (r0 == 0) goto L25
            float r0 = r0.floatValue()
            r3.setDefaultAngle(r0)
        L25:
            java.lang.Integer r0 = r3.mReferenceDefaultRadius
            if (r0 == 0) goto L30
            int r0 = r0.intValue()
            r3.setDefaultRadius(r0)
        L30:
            r3.anchorReferences()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public int removeView(android.view.View r4) {
            r3 = this;
            int r0 = super.removeView(r4)
            r1 = -1
            if (r0 != r1) goto L8
            return r0
        L8:
            androidx.constraintlayout.widget.ConstraintSet r1 = new androidx.constraintlayout.widget.ConstraintSet
            r1.<init>()
            androidx.constraintlayout.widget.ConstraintLayout r2 = r3.mContainer
            r1.clone(r2)
            int r4 = r4.getId()
            r2 = 8
            r1.clear(r4, r2)
            androidx.constraintlayout.widget.ConstraintLayout r4 = r3.mContainer
            r1.applyTo(r4)
            float[] r4 = r3.mAngles
            int r1 = r4.length
            if (r0 >= r1) goto L31
            float[] r4 = r3.removeAngle(r4, r0)
            r3.mAngles = r4
            int r4 = r3.mCountAngle
            int r4 = r4 + (-1)
            r3.mCountAngle = r4
        L31:
            int[] r4 = r3.mRadius
            int r1 = r4.length
            if (r0 >= r1) goto L42
            int[] r4 = r3.removeRadius(r4, r0)
            r3.mRadius = r4
            int r4 = r3.mCountRadius
            int r4 = r4 + (-1)
            r3.mCountRadius = r4
        L42:
            r3.anchorReferences()
            return r0
    }

    public void setDefaultAngle(float r1) {
            r0 = this;
            androidx.constraintlayout.helper.widget.CircularFlow.DEFAULT_ANGLE = r1
            return
    }

    public void setDefaultRadius(int r1) {
            r0 = this;
            androidx.constraintlayout.helper.widget.CircularFlow.DEFAULT_RADIUS = r1
            return
    }

    public void updateAngle(android.view.View r2, float r3) {
            r1 = this;
            boolean r0 = r1.isUpdatable(r2)
            if (r0 != 0) goto L1f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "It was not possible to update angle to view with id: "
            r3.<init>(r0)
            int r2 = r2.getId()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "CircularFlow"
            android.util.Log.e(r3, r2)
            return
        L1f:
            int r2 = r2.getId()
            int r2 = r1.indexFromId(r2)
            float[] r0 = r1.mAngles
            int r0 = r0.length
            if (r2 <= r0) goto L2d
            return
        L2d:
            float[] r0 = r1.getAngles()
            r1.mAngles = r0
            r0[r2] = r3
            r1.anchorReferences()
            return
    }

    public void updateRadius(android.view.View r3, int r4) {
            r2 = this;
            boolean r0 = r2.isUpdatable(r3)
            if (r0 != 0) goto L1f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "It was not possible to update radius to view with id: "
            r4.<init>(r0)
            int r3 = r3.getId()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "CircularFlow"
            android.util.Log.e(r4, r3)
            return
        L1f:
            int r3 = r3.getId()
            int r3 = r2.indexFromId(r3)
            int[] r0 = r2.mRadius
            int r0 = r0.length
            if (r3 <= r0) goto L2d
            return
        L2d:
            int[] r0 = r2.getRadius()
            r2.mRadius = r0
            float r4 = (float) r4
            android.content.Context r1 = r2.myContext
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r4 = r4 * r1
            int r4 = (int) r4
            r0[r3] = r4
            r2.anchorReferences()
            return
    }

    public void updateReference(android.view.View r2, int r3, float r4) {
            r1 = this;
            boolean r0 = r1.isUpdatable(r2)
            if (r0 != 0) goto L1f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "It was not possible to update radius and angle to view with id: "
            r3.<init>(r4)
            int r2 = r2.getId()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "CircularFlow"
            android.util.Log.e(r3, r2)
            return
        L1f:
            int r2 = r2.getId()
            int r2 = r1.indexFromId(r2)
            float[] r0 = r1.getAngles()
            int r0 = r0.length
            if (r0 <= r2) goto L36
            float[] r0 = r1.getAngles()
            r1.mAngles = r0
            r0[r2] = r4
        L36:
            int[] r4 = r1.getRadius()
            int r4 = r4.length
            if (r4 <= r2) goto L54
            int[] r4 = r1.getRadius()
            r1.mRadius = r4
            float r3 = (float) r3
            android.content.Context r0 = r1.myContext
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r3 = r3 * r0
            int r3 = (int) r3
            r4[r2] = r3
        L54:
            r1.anchorReferences()
            return
    }
}
