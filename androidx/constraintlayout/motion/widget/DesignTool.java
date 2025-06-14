package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class DesignTool implements androidx.constraintlayout.motion.widget.ProxyInterface {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "DesignTool";
    static final java.util.HashMap<android.util.Pair<java.lang.Integer, java.lang.Integer>, java.lang.String> allAttributes = null;
    static final java.util.HashMap<java.lang.String, java.lang.String> allMargins = null;
    private java.lang.String mLastEndState;
    private int mLastEndStateId;
    private java.lang.String mLastStartState;
    private int mLastStartStateId;
    private final androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;
    private androidx.constraintlayout.motion.widget.MotionScene mSceneCache;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.constraintlayout.motion.widget.DesignTool.allAttributes = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            androidx.constraintlayout.motion.widget.DesignTool.allMargins = r1
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.util.Pair r3 = android.util.Pair.create(r2, r2)
            java.lang.String r4 = "layout_constraintBottom_toBottomOf"
            r0.put(r3, r4)
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            android.util.Pair r5 = android.util.Pair.create(r2, r3)
            java.lang.String r6 = "layout_constraintBottom_toTopOf"
            r0.put(r5, r6)
            android.util.Pair r2 = android.util.Pair.create(r3, r2)
            java.lang.String r5 = "layout_constraintTop_toBottomOf"
            r0.put(r2, r5)
            android.util.Pair r2 = android.util.Pair.create(r3, r3)
            java.lang.String r3 = "layout_constraintTop_toTopOf"
            r0.put(r2, r3)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.util.Pair r7 = android.util.Pair.create(r2, r2)
            java.lang.String r8 = "layout_constraintStart_toStartOf"
            r0.put(r7, r8)
            r7 = 7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            android.util.Pair r9 = android.util.Pair.create(r2, r7)
            java.lang.String r10 = "layout_constraintStart_toEndOf"
            r0.put(r9, r10)
            android.util.Pair r2 = android.util.Pair.create(r7, r2)
            java.lang.String r9 = "layout_constraintEnd_toStartOf"
            r0.put(r2, r9)
            android.util.Pair r2 = android.util.Pair.create(r7, r7)
            java.lang.String r7 = "layout_constraintEnd_toEndOf"
            r0.put(r2, r7)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.util.Pair r11 = android.util.Pair.create(r2, r2)
            java.lang.String r12 = "layout_constraintLeft_toLeftOf"
            r0.put(r11, r12)
            r11 = 2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            android.util.Pair r13 = android.util.Pair.create(r2, r11)
            java.lang.String r14 = "layout_constraintLeft_toRightOf"
            r0.put(r13, r14)
            android.util.Pair r13 = android.util.Pair.create(r11, r11)
            java.lang.String r15 = "layout_constraintRight_toRightOf"
            r0.put(r13, r15)
            android.util.Pair r2 = android.util.Pair.create(r11, r2)
            java.lang.String r11 = "layout_constraintRight_toLeftOf"
            r0.put(r2, r11)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.util.Pair r2 = android.util.Pair.create(r2, r2)
            java.lang.String r13 = "layout_constraintBaseline_toBaselineOf"
            r0.put(r2, r13)
            java.lang.String r0 = "layout_marginBottom"
            r1.put(r4, r0)
            r1.put(r6, r0)
            java.lang.String r0 = "layout_marginTop"
            r1.put(r5, r0)
            r1.put(r3, r0)
            java.lang.String r0 = "layout_marginStart"
            r1.put(r8, r0)
            r1.put(r10, r0)
            java.lang.String r0 = "layout_marginEnd"
            r1.put(r9, r0)
            java.lang.String r0 = "layout_marginEnd"
            r1.put(r7, r0)
            java.lang.String r0 = "layout_marginLeft"
            r1.put(r12, r0)
            java.lang.String r0 = "layout_marginLeft"
            r1.put(r14, r0)
            java.lang.String r0 = "layout_marginRight"
            r1.put(r15, r0)
            java.lang.String r0 = "layout_marginRight"
            r1.put(r11, r0)
            return
    }

    public DesignTool(androidx.constraintlayout.motion.widget.MotionLayout r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mLastStartState = r0
            r1.mLastEndState = r0
            r0 = -1
            r1.mLastStartStateId = r0
            r1.mLastEndStateId = r0
            r1.mMotionLayout = r2
            return
    }

    private static void Connect(int r8, androidx.constraintlayout.widget.ConstraintSet r9, android.view.View r10, java.util.HashMap<java.lang.String, java.lang.String> r11, int r12, int r13) {
            java.util.HashMap<android.util.Pair<java.lang.Integer, java.lang.Integer>, java.lang.String> r0 = androidx.constraintlayout.motion.widget.DesignTool.allAttributes
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            android.util.Pair r1 = android.util.Pair.create(r1, r2)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r11.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L41
            java.util.HashMap<java.lang.String, java.lang.String> r2 = androidx.constraintlayout.motion.widget.DesignTool.allMargins
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L31
            java.lang.Object r11 = r11.get(r0)
            java.lang.String r11 = (java.lang.String) r11
            int r8 = GetPxFromDp(r8, r11)
            goto L32
        L31:
            r8 = 0
        L32:
            r7 = r8
            int r5 = java.lang.Integer.parseInt(r1)
            int r3 = r10.getId()
            r2 = r9
            r4 = r12
            r6 = r13
            r2.connect(r3, r4, r5, r6, r7)
        L41:
            return
    }

    private static int GetPxFromDp(int r3, java.lang.String r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            r1 = 100
            int r1 = r4.indexOf(r1)
            r2 = -1
            if (r1 != r2) goto Le
            return r0
        Le:
            java.lang.String r4 = r4.substring(r0, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r4 = r4.intValue()
            int r4 = r4 * r3
            float r3 = (float) r4
            r4 = 1126170624(0x43200000, float:160.0)
            float r3 = r3 / r4
            int r3 = (int) r3
            return r3
    }

    private static void SetAbsolutePositions(int r2, androidx.constraintlayout.widget.ConstraintSet r3, android.view.View r4, java.util.HashMap<java.lang.String, java.lang.String> r5) {
            java.lang.String r0 = "layout_editor_absoluteX"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L15
            int r1 = r4.getId()
            int r0 = GetPxFromDp(r2, r0)
            r3.setEditorAbsoluteX(r1, r0)
        L15:
            java.lang.String r0 = "layout_editor_absoluteY"
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L2a
            int r4 = r4.getId()
            int r2 = GetPxFromDp(r2, r5)
            r3.setEditorAbsoluteY(r4, r2)
        L2a:
            return
    }

    private static void SetBias(androidx.constraintlayout.widget.ConstraintSet r2, android.view.View r3, java.util.HashMap<java.lang.String, java.lang.String> r4, int r5) {
            r0 = 1
            if (r5 != r0) goto L6
            java.lang.String r1 = "layout_constraintVertical_bias"
            goto L8
        L6:
            java.lang.String r1 = "layout_constraintHorizontal_bias"
        L8:
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L2b
            if (r5 != 0) goto L1e
            int r3 = r3.getId()
            float r4 = java.lang.Float.parseFloat(r4)
            r2.setHorizontalBias(r3, r4)
            goto L2b
        L1e:
            if (r5 != r0) goto L2b
            int r3 = r3.getId()
            float r4 = java.lang.Float.parseFloat(r4)
            r2.setVerticalBias(r3, r4)
        L2b:
            return
    }

    private static void SetDimensions(int r1, androidx.constraintlayout.widget.ConstraintSet r2, android.view.View r3, java.util.HashMap<java.lang.String, java.lang.String> r4, int r5) {
            r0 = 1
            if (r5 != r0) goto L6
            java.lang.String r0 = "layout_height"
            goto L8
        L6:
            java.lang.String r0 = "layout_width"
        L8:
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L2f
            java.lang.String r0 = "wrap_content"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L1d
            int r1 = GetPxFromDp(r1, r4)
            goto L1e
        L1d:
            r1 = -2
        L1e:
            if (r5 != 0) goto L28
            int r3 = r3.getId()
            r2.constrainWidth(r3, r1)
            goto L2f
        L28:
            int r3 = r3.getId()
            r2.constrainHeight(r3, r1)
        L2f:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public int designAccess(int r2, java.lang.String r3, java.lang.Object r4, float[] r5, int r6, float[] r7, int r8) {
            r1 = this;
            android.view.View r4 = (android.view.View) r4
            r5 = -1
            r6 = 0
            if (r2 == 0) goto L1c
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            if (r0 != 0) goto Ld
            return r5
        Ld:
            if (r4 == 0) goto L1b
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.mMotionLayout
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r0 = r0.mFrameArrayList
            java.lang.Object r4 = r0.get(r4)
            androidx.constraintlayout.motion.widget.MotionController r4 = (androidx.constraintlayout.motion.widget.MotionController) r4
            if (r4 != 0) goto L1d
        L1b:
            return r5
        L1c:
            r4 = r6
        L1d:
            r0 = 1
            if (r2 == 0) goto L54
            if (r2 == r0) goto L46
            r0 = 2
            if (r2 == r0) goto L38
            r6 = 3
            if (r2 == r6) goto L29
            return r5
        L29:
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r1.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r2 = r2.mScene
            int r2 = r2.getDuration()
            int r2 = r2 / 16
            int r2 = r4.getAttributeValues(r3, r7, r8)
            return r2
        L38:
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r1.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r2 = r2.mScene
            int r2 = r2.getDuration()
            int r2 = r2 / 16
            r4.buildKeyFrames(r7, r6)
            return r2
        L46:
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r1.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r2 = r2.mScene
            int r2 = r2.getDuration()
            int r2 = r2 / 16
            r4.buildPath(r7, r2)
            return r2
        L54:
            return r0
    }

    public void disableAutoTransition(boolean r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.mMotionLayout
            r0.disableAutoTransition(r2)
            return
    }

    public void dumpConstraintSet(java.lang.String r5) {
            r4 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            if (r0 != 0) goto Lc
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r1 = r4.mSceneCache
            r0.mScene = r1
        Lc:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.mMotionLayout
            int r0 = r0.lookUpConstraintId(r5)
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " dumping  "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = " ("
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r2 = ")"
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            r1.println(r5)
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r4.mMotionLayout     // Catch: java.lang.Exception -> L49
            androidx.constraintlayout.motion.widget.MotionScene r5 = r5.mScene     // Catch: java.lang.Exception -> L49
            androidx.constraintlayout.widget.ConstraintSet r5 = r5.getConstraintSet(r0)     // Catch: java.lang.Exception -> L49
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.mMotionLayout     // Catch: java.lang.Exception -> L49
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene     // Catch: java.lang.Exception -> L49
            r1 = 0
            int[] r1 = new int[r1]     // Catch: java.lang.Exception -> L49
            r5.dump(r0, r1)     // Catch: java.lang.Exception -> L49
            goto L4d
        L49:
            r5 = move-exception
            r5.printStackTrace()
        L4d:
            return
    }

    public int getAnimationKeyFrames(java.lang.Object r3, float[] r4) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            if (r0 != 0) goto L8
            r3 = -1
            return r3
        L8:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            int r0 = r0.getDuration()
            int r0 = r0 / 16
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r2.mMotionLayout
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r1 = r1.mFrameArrayList
            java.lang.Object r3 = r1.get(r3)
            androidx.constraintlayout.motion.widget.MotionController r3 = (androidx.constraintlayout.motion.widget.MotionController) r3
            if (r3 != 0) goto L20
            r3 = 0
            return r3
        L20:
            r1 = 0
            r3.buildKeyFrames(r4, r1)
            return r0
    }

    public int getAnimationPath(java.lang.Object r2, float[] r3, int r4) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            if (r0 != 0) goto L8
            r2 = -1
            return r2
        L8:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.mMotionLayout
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r0 = r0.mFrameArrayList
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.motion.widget.MotionController r2 = (androidx.constraintlayout.motion.widget.MotionController) r2
            if (r2 != 0) goto L16
            r2 = 0
            return r2
        L16:
            r2.buildPath(r3, r4)
            return r4
    }

    public void getAnimationRectangles(java.lang.Object r3, float[] r4) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            if (r0 != 0) goto L7
            return
        L7:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            int r0 = r0.getDuration()
            int r0 = r0 / 16
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r2.mMotionLayout
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r1 = r1.mFrameArrayList
            java.lang.Object r3 = r1.get(r3)
            androidx.constraintlayout.motion.widget.MotionController r3 = (androidx.constraintlayout.motion.widget.MotionController) r3
            if (r3 != 0) goto L1e
            return
        L1e:
            r3.buildRectangles(r4, r0)
            return
    }

    public java.lang.String getEndState() {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            int r0 = r0.getEndState()
            int r1 = r2.mLastEndStateId
            if (r1 != r0) goto Ld
            java.lang.String r0 = r2.mLastEndState
            return r0
        Ld:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r2.mMotionLayout
            java.lang.String r1 = r1.getConstraintSetNames(r0)
            if (r1 == 0) goto L19
            r2.mLastEndState = r1
            r2.mLastEndStateId = r0
        L19:
            return r1
    }

    public int getKeyFrameInfo(java.lang.Object r2, int r3, int[] r4) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.mMotionLayout
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r0 = r0.mFrameArrayList
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.motion.widget.MotionController r2 = (androidx.constraintlayout.motion.widget.MotionController) r2
            if (r2 != 0) goto L10
            r2 = 0
            return r2
        L10:
            int r2 = r2.getKeyFrameInfo(r3, r4)
            return r2
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public float getKeyFramePosition(java.lang.Object r3, int r4, float r5, float r6) {
            r2 = this;
            boolean r0 = r3 instanceof android.view.View
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r0 = r0.mFrameArrayList
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r3 = r0.get(r3)
            androidx.constraintlayout.motion.widget.MotionController r3 = (androidx.constraintlayout.motion.widget.MotionController) r3
            if (r3 != 0) goto L15
            return r1
        L15:
            float r3 = r3.getKeyFrameParameter(r4, r5, r6)
            return r3
    }

    public int getKeyFramePositions(java.lang.Object r2, int[] r3, float[] r4) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.mMotionLayout
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r0 = r0.mFrameArrayList
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.motion.widget.MotionController r2 = (androidx.constraintlayout.motion.widget.MotionController) r2
            if (r2 != 0) goto L10
            r2 = 0
            return r2
        L10:
            int r2 = r2.getKeyFramePositions(r3, r4)
            return r2
    }

    public java.lang.Object getKeyframe(int r3, int r4, int r5) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r2.mMotionLayout
            android.content.Context r1 = r1.getContext()
            androidx.constraintlayout.motion.widget.Key r3 = r0.getKeyFrame(r1, r3, r4, r5)
            return r3
    }

    public java.lang.Object getKeyframe(java.lang.Object r3, int r4, int r5) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            android.view.View r3 = (android.view.View) r3
            int r3 = r3.getId()
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r2.mMotionLayout
            android.content.Context r1 = r1.getContext()
            androidx.constraintlayout.motion.widget.Key r3 = r0.getKeyFrame(r1, r4, r3, r5)
            return r3
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public java.lang.Object getKeyframeAtLocation(java.lang.Object r3, float r4, float r5) {
            r2 = this;
            android.view.View r3 = (android.view.View) r3
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            if (r0 != 0) goto Le
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        Le:
            r0 = 0
            if (r3 == 0) goto L31
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r2.mMotionLayout
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r1 = r1.mFrameArrayList
            java.lang.Object r1 = r1.get(r3)
            androidx.constraintlayout.motion.widget.MotionController r1 = (androidx.constraintlayout.motion.widget.MotionController) r1
            if (r1 != 0) goto L1e
            return r0
        L1e:
            android.view.ViewParent r3 = r3.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getWidth()
            int r3 = r3.getHeight()
            androidx.constraintlayout.motion.widget.KeyPositionBase r3 = r1.getPositionKeyframe(r0, r3, r4, r5)
            return r3
        L31:
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public java.lang.Boolean getPositionKeyframe(java.lang.Object r9, java.lang.Object r10, float r11, float r12, java.lang.String[] r13, float[] r14) {
            r8 = this;
            boolean r0 = r9 instanceof androidx.constraintlayout.motion.widget.KeyPositionBase
            if (r0 == 0) goto L2b
            r3 = r9
            androidx.constraintlayout.motion.widget.KeyPositionBase r3 = (androidx.constraintlayout.motion.widget.KeyPositionBase) r3
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r8.mMotionLayout
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r9 = r9.mFrameArrayList
            r2 = r10
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r9 = r9.get(r2)
            r1 = r9
            androidx.constraintlayout.motion.widget.MotionController r1 = (androidx.constraintlayout.motion.widget.MotionController) r1
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.positionKeyframe(r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r8.mMotionLayout
            r9.rebuildScene()
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r8.mMotionLayout
            r10 = 1
            r9.mInTransition = r10
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r10)
            return r9
        L2b:
            r9 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
    }

    public float getProgress() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.mMotionLayout
            float r0 = r0.getProgress()
            return r0
    }

    public java.lang.String getStartState() {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            int r0 = r0.getStartState()
            int r1 = r2.mLastStartStateId
            if (r1 != r0) goto Ld
            java.lang.String r0 = r2.mLastStartState
            return r0
        Ld:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r2.mMotionLayout
            java.lang.String r1 = r1.getConstraintSetNames(r0)
            if (r1 == 0) goto L19
            r2.mLastStartState = r1
            r2.mLastStartStateId = r0
        L19:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r2.mMotionLayout
            java.lang.String r0 = r1.getConstraintSetNames(r0)
            return r0
    }

    public java.lang.String getState() {
            r2 = this;
            java.lang.String r0 = r2.mLastStartState
            if (r0 == 0) goto L20
            java.lang.String r0 = r2.mLastEndState
            if (r0 == 0) goto L20
            float r0 = r2.getProgress()
            r1 = 1008981770(0x3c23d70a, float:0.01)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L16
            java.lang.String r0 = r2.mLastStartState
            return r0
        L16:
            r1 = 1065185444(0x3f7d70a4, float:0.99)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L20
            java.lang.String r0 = r2.mLastEndState
            return r0
        L20:
            java.lang.String r0 = r2.mLastStartState
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public long getTransitionTimeMs() {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            long r0 = r0.getTransitionTimeMs()
            return r0
    }

    public boolean isInTransition() {
            r1 = this;
            java.lang.String r0 = r1.mLastStartState
            if (r0 == 0) goto La
            java.lang.String r0 = r1.mLastEndState
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setAttributes(int r10, java.lang.String r11, java.lang.Object r12, java.lang.Object r13) {
            r9 = this;
            android.view.View r12 = (android.view.View) r12
            java.util.HashMap r13 = (java.util.HashMap) r13
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r9.mMotionLayout
            int r11 = r0.lookUpConstraintId(r11)
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r9.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            androidx.constraintlayout.widget.ConstraintSet r6 = r0.getConstraintSet(r11)
            if (r6 != 0) goto L15
            return
        L15:
            int r0 = r12.getId()
            r6.clear(r0)
            r7 = 0
            SetDimensions(r10, r6, r12, r13, r7)
            r8 = 1
            SetDimensions(r10, r6, r12, r13, r8)
            r4 = 6
            r5 = 6
            r0 = r10
            r1 = r6
            r2 = r12
            r3 = r13
            Connect(r0, r1, r2, r3, r4, r5)
            r5 = 7
            Connect(r0, r1, r2, r3, r4, r5)
            r4 = 7
            Connect(r0, r1, r2, r3, r4, r5)
            r5 = 6
            Connect(r0, r1, r2, r3, r4, r5)
            r4 = 1
            r5 = 1
            Connect(r0, r1, r2, r3, r4, r5)
            r5 = 2
            Connect(r0, r1, r2, r3, r4, r5)
            r4 = 2
            Connect(r0, r1, r2, r3, r4, r5)
            r5 = 1
            Connect(r0, r1, r2, r3, r4, r5)
            r4 = 3
            r5 = 3
            Connect(r0, r1, r2, r3, r4, r5)
            r5 = 4
            Connect(r0, r1, r2, r3, r4, r5)
            r4 = 4
            r5 = 3
            Connect(r0, r1, r2, r3, r4, r5)
            r5 = 4
            Connect(r0, r1, r2, r3, r4, r5)
            r4 = 5
            r5 = 5
            Connect(r0, r1, r2, r3, r4, r5)
            SetBias(r6, r12, r13, r7)
            SetBias(r6, r12, r13, r8)
            SetAbsolutePositions(r10, r6, r12, r13)
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r9.mMotionLayout
            r10.updateState(r11, r6)
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r9.mMotionLayout
            r10.requestLayout()
            return
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setKeyFrame(java.lang.Object r2, int r3, java.lang.String r4, java.lang.Object r5) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            if (r0 == 0) goto L27
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            android.view.View r2 = (android.view.View) r2
            r0.setKeyframe(r2, r3, r4, r5)
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r1.mMotionLayout
            float r3 = (float) r3
            r4 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r4
            r2.mTransitionGoalPosition = r3
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r1.mMotionLayout
            r3 = 0
            r2.mTransitionLastPosition = r3
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r1.mMotionLayout
            r2.rebuildScene()
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r1.mMotionLayout
            r3 = 1
            r2.evaluate(r3)
        L27:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public boolean setKeyFramePosition(java.lang.Object r3, int r4, int r5, float r6, float r7) {
            r2 = this;
            boolean r4 = r3 instanceof android.view.View
            r5 = 0
            if (r4 != 0) goto L6
            return r5
        L6:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r4 = r4.mScene
            if (r4 == 0) goto L61
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r2.mMotionLayout
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r4 = r4.mFrameArrayList
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.motion.widget.MotionController r4 = (androidx.constraintlayout.motion.widget.MotionController) r4
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            float r0 = r0.mTransitionPosition
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            if (r4 == 0) goto L61
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r1 = r1.mScene
            android.view.View r3 = (android.view.View) r3
            boolean r1 = r1.hasKeyFramePosition(r3, r0)
            if (r1 == 0) goto L61
            r5 = 2
            float r5 = r4.getKeyFrameParameter(r5, r6, r7)
            r1 = 5
            float r4 = r4.getKeyFrameParameter(r1, r6, r7)
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r6 = r6.mScene
            java.lang.String r7 = "motion:percentX"
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r6.setKeyframe(r3, r0, r7, r5)
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r5 = r5.mScene
            java.lang.String r6 = "motion:percentY"
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5.setKeyframe(r3, r0, r6, r4)
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.mMotionLayout
            r3.rebuildScene()
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.mMotionLayout
            r4 = 1
            r3.evaluate(r4)
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.mMotionLayout
            r3.invalidate()
            return r4
        L61:
            return r5
    }

    public void setKeyframe(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.constraintlayout.motion.widget.Key
            if (r0 == 0) goto L13
            androidx.constraintlayout.motion.widget.Key r2 = (androidx.constraintlayout.motion.widget.Key) r2
            r2.setValue(r3, r4)
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r1.mMotionLayout
            r2.rebuildScene()
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r1.mMotionLayout
            r3 = 1
            r2.mInTransition = r3
        L13:
            return
    }

    public void setState(java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto L4
            java.lang.String r3 = "motion_base"
        L4:
            java.lang.String r0 = r2.mLastStartState
            if (r0 != r3) goto L9
            return
        L9:
            r2.mLastStartState = r3
            r0 = 0
            r2.mLastEndState = r0
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            if (r0 != 0) goto L1a
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r1 = r2.mSceneCache
            r0.mScene = r1
        L1a:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            int r3 = r0.lookUpConstraintId(r3)
            r2.mLastStartStateId = r3
            if (r3 == 0) goto L4d
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            int r0 = r0.getStartState()
            if (r3 != r0) goto L33
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.mMotionLayout
            r0 = 0
            r3.setProgress(r0)
            goto L4d
        L33:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            int r0 = r0.getEndState()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r3 != r0) goto L43
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.mMotionLayout
            r3.setProgress(r1)
            goto L4d
        L43:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            r0.transitionToState(r3)
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.mMotionLayout
            r3.setProgress(r1)
        L4d:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.mMotionLayout
            r3.requestLayout()
            return
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setToolPosition(float r3) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            if (r0 != 0) goto Lc
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r1 = r2.mSceneCache
            r0.mScene = r1
        Lc:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            r0.setProgress(r3)
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.mMotionLayout
            r0 = 1
            r3.evaluate(r0)
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.mMotionLayout
            r3.requestLayout()
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.mMotionLayout
            r3.invalidate()
            return
    }

    public void setTransition(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mScene
            if (r0 != 0) goto Lc
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionScene r1 = r3.mSceneCache
            r0.mScene = r1
        Lc:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.mMotionLayout
            int r0 = r0.lookUpConstraintId(r4)
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r3.mMotionLayout
            int r1 = r1.lookUpConstraintId(r5)
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r3.mMotionLayout
            r2.setTransition(r0, r1)
            r3.mLastStartStateId = r0
            r3.mLastEndStateId = r1
            r3.mLastStartState = r4
            r3.mLastEndState = r5
            return
    }

    public void setViewDebug(java.lang.Object r2, int r3) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.View
            if (r0 != 0) goto L5
            return
        L5:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.mMotionLayout
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r0 = r0.mFrameArrayList
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.motion.widget.MotionController r2 = (androidx.constraintlayout.motion.widget.MotionController) r2
            if (r2 == 0) goto L19
            r2.setDrawPath(r3)
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r1.mMotionLayout
            r2.invalidate()
        L19:
            return
    }
}
