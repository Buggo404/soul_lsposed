package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class Guideline extends androidx.constraintlayout.core.widgets.ConstraintWidget {
    public static final int HORIZONTAL = 0;
    public static final int RELATIVE_BEGIN = 1;
    public static final int RELATIVE_END = 2;
    public static final int RELATIVE_PERCENT = 0;
    public static final int RELATIVE_UNKNOWN = -1;
    public static final int VERTICAL = 1;
    protected boolean guidelineUseRtl;
    private androidx.constraintlayout.core.widgets.ConstraintAnchor mAnchor;
    private int mMinimumPosition;
    private int mOrientation;
    protected int mRelativeBegin;
    protected int mRelativeEnd;
    protected float mRelativePercent;
    private boolean resolved;

    /* renamed from: androidx.constraintlayout.core.widgets.Guideline$1 */
    static /* synthetic */ class C01291 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type */
        static final /* synthetic */ int[] f42x6930e354 = null;

        static {
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.widgets.Guideline.C01291.f42x6930e354 = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.widgets.Guideline.C01291.f42x6930e354     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.widgets.Guideline.C01291.f42x6930e354     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.core.widgets.Guideline.C01291.f42x6930e354     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.core.widgets.Guideline.C01291.f42x6930e354     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.constraintlayout.core.widgets.Guideline.C01291.f42x6930e354     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.constraintlayout.core.widgets.Guideline.C01291.f42x6930e354     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = androidx.constraintlayout.core.widgets.Guideline.C01291.f42x6930e354     // Catch: java.lang.NoSuchFieldError -> L60
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = androidx.constraintlayout.core.widgets.Guideline.C01291.f42x6930e354     // Catch: java.lang.NoSuchFieldError -> L6c
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                return
        }
    }

    public Guideline() {
            r4 = this;
            r4.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.mRelativePercent = r0
            r0 = -1
            r4.mRelativeBegin = r0
            r4.mRelativeEnd = r0
            r0 = 1
            r4.guidelineUseRtl = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r4.mTop
            r4.mAnchor = r0
            r0 = 0
            r4.mOrientation = r0
            r4.mMinimumPosition = r0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r1 = r4.mAnchors
            r1.clear()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r1 = r4.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.mAnchor
            r1.add(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r4.mListAnchors
            int r1 = r1.length
        L27:
            if (r0 >= r1) goto L32
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r4.mListAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.mAnchor
            r2[r0] = r3
            int r0 = r0 + 1
            goto L27
        L32:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(androidx.constraintlayout.core.LinearSystem r8, boolean r9) {
            r7 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r7.getParent()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r9 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r9
            if (r9 != 0) goto L9
            return
        L9:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r9.getAnchor(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r9.getAnchor(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.mParent
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L27
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.mParent
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r2.mListDimensionBehaviors
            r2 = r2[r4]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r5) goto L27
            r2 = r3
            goto L28
        L27:
            r2 = r4
        L28:
            int r5 = r7.mOrientation
            if (r5 != 0) goto L49
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r9.getAnchor(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r9.getAnchor(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r7.mParent
            if (r9 == 0) goto L47
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r7.mParent
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r9 = r9.mListDimensionBehaviors
            r9 = r9[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r9 != r2) goto L47
            goto L48
        L47:
            r3 = r4
        L48:
            r2 = r3
        L49:
            boolean r9 = r7.resolved
            r3 = -1
            r5 = 5
            if (r9 == 0) goto L8b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r7.mAnchor
            boolean r9 = r9.hasFinalValue()
            if (r9 == 0) goto L8b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r7.mAnchor
            androidx.constraintlayout.core.SolverVariable r9 = r8.createObjectVariable(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r7.mAnchor
            int r6 = r6.getFinalValue()
            r8.addEquality(r9, r6)
            int r6 = r7.mRelativeBegin
            if (r6 == r3) goto L74
            if (r2 == 0) goto L88
            androidx.constraintlayout.core.SolverVariable r0 = r8.createObjectVariable(r1)
            r8.addGreaterThan(r0, r9, r4, r5)
            goto L88
        L74:
            int r6 = r7.mRelativeEnd
            if (r6 == r3) goto L88
            if (r2 == 0) goto L88
            androidx.constraintlayout.core.SolverVariable r1 = r8.createObjectVariable(r1)
            androidx.constraintlayout.core.SolverVariable r0 = r8.createObjectVariable(r0)
            r8.addGreaterThan(r9, r0, r4, r5)
            r8.addGreaterThan(r1, r9, r4, r5)
        L88:
            r7.resolved = r4
            return
        L8b:
            int r9 = r7.mRelativeBegin
            r6 = 8
            if (r9 == r3) goto Laa
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r7.mAnchor
            androidx.constraintlayout.core.SolverVariable r9 = r8.createObjectVariable(r9)
            androidx.constraintlayout.core.SolverVariable r0 = r8.createObjectVariable(r0)
            int r3 = r7.mRelativeBegin
            r8.addEquality(r9, r0, r3, r6)
            if (r2 == 0) goto Le6
            androidx.constraintlayout.core.SolverVariable r0 = r8.createObjectVariable(r1)
            r8.addGreaterThan(r0, r9, r4, r5)
            goto Le6
        Laa:
            int r9 = r7.mRelativeEnd
            if (r9 == r3) goto Lcb
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r7.mAnchor
            androidx.constraintlayout.core.SolverVariable r9 = r8.createObjectVariable(r9)
            androidx.constraintlayout.core.SolverVariable r1 = r8.createObjectVariable(r1)
            int r3 = r7.mRelativeEnd
            int r3 = -r3
            r8.addEquality(r9, r1, r3, r6)
            if (r2 == 0) goto Le6
            androidx.constraintlayout.core.SolverVariable r0 = r8.createObjectVariable(r0)
            r8.addGreaterThan(r9, r0, r4, r5)
            r8.addGreaterThan(r1, r9, r4, r5)
            goto Le6
        Lcb:
            float r9 = r7.mRelativePercent
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 == 0) goto Le6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r7.mAnchor
            androidx.constraintlayout.core.SolverVariable r9 = r8.createObjectVariable(r9)
            androidx.constraintlayout.core.SolverVariable r0 = r8.createObjectVariable(r1)
            float r1 = r7.mRelativePercent
            androidx.constraintlayout.core.ArrayRow r9 = androidx.constraintlayout.core.LinearSystem.createRowDimensionPercent(r8, r9, r0, r1)
            r8.addConstraint(r9)
        Le6:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(androidx.constraintlayout.core.widgets.ConstraintWidget r1, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> r2) {
            r0 = this;
            super.copy(r1, r2)
            androidx.constraintlayout.core.widgets.Guideline r1 = (androidx.constraintlayout.core.widgets.Guideline) r1
            float r2 = r1.mRelativePercent
            r0.mRelativePercent = r2
            int r2 = r1.mRelativeBegin
            r0.mRelativeBegin = r2
            int r2 = r1.mRelativeEnd
            r0.mRelativeEnd = r2
            boolean r2 = r1.guidelineUseRtl
            r0.guidelineUseRtl = r2
            int r1 = r1.mOrientation
            r0.setOrientation(r1)
            return
    }

    public void cyclePosition() {
            r3 = this;
            int r0 = r3.mRelativeBegin
            r1 = -1
            if (r0 == r1) goto L9
            r3.inferRelativePercentPosition()
            goto L1c
        L9:
            float r0 = r3.mRelativePercent
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L15
            r3.inferRelativeEndPosition()
            goto L1c
        L15:
            int r0 = r3.mRelativeEnd
            if (r0 == r1) goto L1c
            r3.inferRelativeBeginPosition()
        L1c:
            return
    }

    public androidx.constraintlayout.core.widgets.ConstraintAnchor getAnchor() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mAnchor
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public androidx.constraintlayout.core.widgets.ConstraintAnchor getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r3) {
            r2 = this;
            int[] r0 = androidx.constraintlayout.core.widgets.Guideline.C01291.f42x6930e354
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L1c
            r1 = 2
            if (r3 == r1) goto L1c
            r0 = 3
            if (r3 == r0) goto L15
            r0 = 4
            if (r3 == r0) goto L15
            goto L23
        L15:
            int r3 = r2.mOrientation
            if (r3 != 0) goto L23
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mAnchor
            return r3
        L1c:
            int r3 = r2.mOrientation
            if (r3 != r0) goto L23
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mAnchor
            return r3
        L23:
            r3 = 0
            return r3
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.mOrientation
            return r0
    }

    public int getRelativeBegin() {
            r1 = this;
            int r0 = r1.mRelativeBegin
            return r0
    }

    public int getRelativeBehaviour() {
            r2 = this;
            float r0 = r2.mRelativePercent
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            int r0 = r2.mRelativeBegin
            r1 = -1
            if (r0 == r1) goto L11
            r0 = 1
            return r0
        L11:
            int r0 = r2.mRelativeEnd
            if (r0 == r1) goto L17
            r0 = 2
            return r0
        L17:
            return r1
    }

    public int getRelativeEnd() {
            r1 = this;
            int r0 = r1.mRelativeEnd
            return r0
    }

    public float getRelativePercent() {
            r1 = this;
            float r0 = r1.mRelativePercent
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "Guideline"
            return r0
    }

    void inferRelativeBeginPosition() {
            r2 = this;
            int r0 = r2.getX()
            int r1 = r2.mOrientation
            if (r1 != 0) goto Lc
            int r0 = r2.getY()
        Lc:
            r2.setGuideBegin(r0)
            return
    }

    void inferRelativeEndPosition() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.getParent()
            int r0 = r0.getWidth()
            int r1 = r2.getX()
            int r0 = r0 - r1
            int r1 = r2.mOrientation
            if (r1 != 0) goto L1e
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.getParent()
            int r0 = r0.getHeight()
            int r1 = r2.getY()
            int r0 = r0 - r1
        L1e:
            r2.setGuideEnd(r0)
            return
    }

    void inferRelativePercentPosition() {
            r2 = this;
            int r0 = r2.getX()
            float r0 = (float) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r2.getParent()
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
            int r1 = r2.mOrientation
            if (r1 != 0) goto L22
            int r0 = r2.getY()
            float r0 = (float) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r2.getParent()
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
        L22:
            r2.setGuidePercent(r0)
            return
    }

    public boolean isPercent() {
            r2 = this;
            float r0 = r2.mRelativePercent
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L13
            int r0 = r2.mRelativeBegin
            r1 = -1
            if (r0 != r1) goto L13
            int r0 = r2.mRelativeEnd
            if (r0 != r1) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
            r1 = this;
            boolean r0 = r1.resolved
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
            r1 = this;
            boolean r0 = r1.resolved
            return r0
    }

    public void setFinalValue(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mAnchor
            r0.setFinalValue(r2)
            r2 = 1
            r1.resolved = r2
            return
    }

    public void setGuideBegin(int r3) {
            r2 = this;
            r0 = -1
            if (r3 <= r0) goto Lb
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.mRelativePercent = r1
            r2.mRelativeBegin = r3
            r2.mRelativeEnd = r0
        Lb:
            return
    }

    public void setGuideEnd(int r3) {
            r2 = this;
            r0 = -1
            if (r3 <= r0) goto Lb
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.mRelativePercent = r1
            r2.mRelativeBegin = r0
            r2.mRelativeEnd = r3
        Lb:
            return
    }

    public void setGuidePercent(float r2) {
            r1 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto Ld
            r1.mRelativePercent = r2
            r2 = -1
            r1.mRelativeBegin = r2
            r1.mRelativeEnd = r2
        Ld:
            return
    }

    public void setGuidePercent(int r2) {
            r1 = this;
            float r2 = (float) r2
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r0
            r1.setGuidePercent(r2)
            return
    }

    public void setMinimumPosition(int r1) {
            r0 = this;
            r0.mMinimumPosition = r1
            return
    }

    public void setOrientation(int r4) {
            r3 = this;
            int r0 = r3.mOrientation
            if (r0 != r4) goto L5
            return
        L5:
            r3.mOrientation = r4
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r4 = r3.mAnchors
            r4.clear()
            int r4 = r3.mOrientation
            r0 = 1
            if (r4 != r0) goto L16
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mLeft
            r3.mAnchor = r4
            goto L1a
        L16:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mTop
            r3.mAnchor = r4
        L1a:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r4 = r3.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mAnchor
            r4.add(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r3.mListAnchors
            int r4 = r4.length
            r0 = 0
        L25:
            if (r0 >= r4) goto L30
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r3.mListAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r3.mAnchor
            r1[r0] = r2
            int r0 = r0 + 1
            goto L25
        L30:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void updateFromSolver(androidx.constraintlayout.core.LinearSystem r3, boolean r4) {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r2.getParent()
            if (r4 != 0) goto L7
            return
        L7:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.mAnchor
            int r3 = r3.getObjectVariableValue(r4)
            int r4 = r2.mOrientation
            r0 = 1
            r1 = 0
            if (r4 != r0) goto L28
            r2.setX(r3)
            r2.setY(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r2.getParent()
            int r3 = r3.getHeight()
            r2.setHeight(r3)
            r2.setWidth(r1)
            goto L3c
        L28:
            r2.setX(r1)
            r2.setY(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r2.getParent()
            int r3 = r3.getWidth()
            r2.setWidth(r3)
            r2.setHeight(r1)
        L3c:
            return
    }
}
