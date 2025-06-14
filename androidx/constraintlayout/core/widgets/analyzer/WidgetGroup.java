package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes.dex */
public class WidgetGroup {
    private static final boolean DEBUG = false;
    static int count;
    boolean authoritative;

    /* renamed from: id */
    int f47id;
    private int moveTo;
    int orientation;
    java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup.MeasureResult> results;
    java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> widgets;

    class MeasureResult {
        int baseline;
        int bottom;
        int left;
        int orientation;
        int right;
        final /* synthetic */ androidx.constraintlayout.core.widgets.analyzer.WidgetGroup this$0;
        int top;
        java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintWidget> widgetRef;

        public MeasureResult(androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r1, androidx.constraintlayout.core.widgets.ConstraintWidget r2, androidx.constraintlayout.core.LinearSystem r3, int r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r2)
                r0.widgetRef = r1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mLeft
                int r1 = r3.getObjectVariableValue(r1)
                r0.left = r1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mTop
                int r1 = r3.getObjectVariableValue(r1)
                r0.top = r1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mRight
                int r1 = r3.getObjectVariableValue(r1)
                r0.right = r1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mBottom
                int r1 = r3.getObjectVariableValue(r1)
                r0.bottom = r1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mBaseline
                int r1 = r3.getObjectVariableValue(r1)
                r0.baseline = r1
                r0.orientation = r4
                return
        }

        public void apply() {
                r8 = this;
                java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r8.widgetRef
                java.lang.Object r0 = r0.get()
                r1 = r0
                androidx.constraintlayout.core.widgets.ConstraintWidget r1 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r1
                if (r1 == 0) goto L1a
                int r2 = r8.left
                int r3 = r8.top
                int r4 = r8.right
                int r5 = r8.bottom
                int r6 = r8.baseline
                int r7 = r8.orientation
                r1.setFinalFrame(r2, r3, r4, r5, r6, r7)
            L1a:
                return
        }
    }

    static {
            return
    }

    public WidgetGroup(int r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.widgets = r0
            r0 = 0
            r2.authoritative = r0
            r0 = 0
            r2.results = r0
            r0 = -1
            r2.moveTo = r0
            int r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetGroup.count
            int r1 = r0 + 1
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup.count = r1
            r2.f47id = r0
            r2.orientation = r3
            return
    }

    private boolean contains(androidx.constraintlayout.core.widgets.ConstraintWidget r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.widgets
            boolean r2 = r0.contains(r2)
            return r2
    }

    private java.lang.String getOrientationString() {
            r2 = this;
            int r0 = r2.orientation
            if (r0 != 0) goto L7
            java.lang.String r0 = "Horizontal"
            return r0
        L7:
            r1 = 1
            if (r0 != r1) goto Ld
            java.lang.String r0 = "Vertical"
            return r0
        Ld:
            r1 = 2
            if (r0 != r1) goto L13
            java.lang.String r0 = "Both"
            return r0
        L13:
            java.lang.String r0 = "Unknown"
            return r0
    }

    private int measureWrap(int r3, androidx.constraintlayout.core.widgets.ConstraintWidget r4) {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r4.getDimensionBehaviour(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 == r1) goto L13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 == r1) goto L13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r0 != r1) goto L11
            goto L13
        L11:
            r3 = -1
            return r3
        L13:
            if (r3 != 0) goto L1a
            int r3 = r4.getWidth()
            goto L1e
        L1a:
            int r3 = r4.getHeight()
        L1e:
            return r3
    }

    private int solverMeasure(androidx.constraintlayout.core.LinearSystem r5, java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r6, int r7) {
            r4 = this;
            r0 = 0
            java.lang.Object r1 = r6.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.getParent()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r1
            r5.reset()
            r1.addToSolver(r5, r0)
            r2 = r0
        L14:
            int r3 = r6.size()
            if (r2 >= r3) goto L26
            java.lang.Object r3 = r6.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r3
            r3.addToSolver(r5, r0)
            int r2 = r2 + 1
            goto L14
        L26:
            if (r7 != 0) goto L2f
            int r2 = r1.mHorizontalChainsSize
            if (r2 <= 0) goto L2f
            androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(r1, r5, r6, r0)
        L2f:
            r2 = 1
            if (r7 != r2) goto L39
            int r3 = r1.mVerticalChainsSize
            if (r3 <= 0) goto L39
            androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(r1, r5, r6, r2)
        L39:
            r5.minimize()     // Catch: java.lang.Exception -> L3d
            goto L41
        L3d:
            r2 = move-exception
            r2.printStackTrace()
        L41:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.results = r2
        L48:
            int r2 = r6.size()
            if (r0 >= r2) goto L61
            java.lang.Object r2 = r6.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup$MeasureResult r3 = new androidx.constraintlayout.core.widgets.analyzer.WidgetGroup$MeasureResult
            r3.<init>(r4, r2, r5, r7)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup$MeasureResult> r2 = r4.results
            r2.add(r3)
            int r0 = r0 + 1
            goto L48
        L61:
            if (r7 != 0) goto L74
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r1.mLeft
            int r6 = r5.getObjectVariableValue(r6)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r1.mRight
            int r7 = r5.getObjectVariableValue(r7)
            r5.reset()
        L72:
            int r7 = r7 - r6
            return r7
        L74:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r1.mTop
            int r6 = r5.getObjectVariableValue(r6)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r1.mBottom
            int r7 = r5.getObjectVariableValue(r7)
            r5.reset()
            goto L72
    }

    public boolean add(androidx.constraintlayout.core.widgets.ConstraintWidget r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.widgets
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.widgets
            r0.add(r2)
            r2 = 1
            return r2
    }

    public void apply() {
            r2 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup$MeasureResult> r0 = r2.results
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r2.authoritative
            if (r0 != 0) goto La
            return
        La:
            r0 = 0
        Lb:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup$MeasureResult> r1 = r2.results
            int r1 = r1.size()
            if (r0 >= r1) goto L21
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup$MeasureResult> r1 = r2.results
            java.lang.Object r1 = r1.get(r0)
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup$MeasureResult r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetGroup.MeasureResult) r1
            r1.apply()
            int r0 = r0 + 1
            goto Lb
        L21:
            return
    }

    public void cleanup(java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> r6) {
            r5 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r5.widgets
            int r0 = r0.size()
            int r1 = r5.moveTo
            r2 = -1
            if (r1 == r2) goto L28
            if (r0 <= 0) goto L28
            r1 = 0
        Le:
            int r2 = r6.size()
            if (r1 >= r2) goto L28
            java.lang.Object r2 = r6.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r2 = (androidx.constraintlayout.core.widgets.analyzer.WidgetGroup) r2
            int r3 = r5.moveTo
            int r4 = r2.f47id
            if (r3 != r4) goto L25
            int r3 = r5.orientation
            r5.moveTo(r3, r2)
        L25:
            int r1 = r1 + 1
            goto Le
        L28:
            if (r0 != 0) goto L2d
            r6.remove(r5)
        L2d:
            return
    }

    public void clear() {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.widgets
            r0.clear()
            return
    }

    public int getId() {
            r1 = this;
            int r0 = r1.f47id
            return r0
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.orientation
            return r0
    }

    public boolean intersectWith(androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r4) {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r3.widgets
            int r2 = r2.size()
            if (r1 >= r2) goto L1d
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r3.widgets
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L1a
            r4 = 1
            return r4
        L1a:
            int r1 = r1 + 1
            goto L2
        L1d:
            return r0
    }

    public boolean isAuthoritative() {
            r1 = this;
            boolean r0 = r1.authoritative
            return r0
    }

    public int measureWrap(androidx.constraintlayout.core.LinearSystem r2, int r3) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.widgets
            int r0 = r0.size()
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.widgets
            int r2 = r1.solverMeasure(r2, r0, r3)
            return r2
    }

    public void moveTo(int r4, androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r5) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r3.widgets
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r1
            r5.add(r1)
            if (r4 != 0) goto L1e
            int r2 = r5.getId()
            r1.horizontalGroup = r2
            goto L6
        L1e:
            int r2 = r5.getId()
            r1.verticalGroup = r2
            goto L6
        L25:
            int r4 = r5.f47id
            r3.moveTo = r4
            return
    }

    public void setAuthoritative(boolean r1) {
            r0 = this;
            r0.authoritative = r1
            return
    }

    public void setOrientation(int r1) {
            r0 = this;
            r0.orientation = r1
            return
    }

    public int size() {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.widgets
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.getOrientationString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " ["
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r4.f47id
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "] <"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r4.widgets
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r2 = r2.getDebugName()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L29
        L51:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " >"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
