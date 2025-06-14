package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class Flow extends androidx.constraintlayout.core.widgets.VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE = 0;
    private androidx.constraintlayout.core.widgets.ConstraintWidget[] mAlignedBiggestElementsInCols;
    private androidx.constraintlayout.core.widgets.ConstraintWidget[] mAlignedBiggestElementsInRows;
    private int[] mAlignedDimensions;
    private java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow.WidgetsList> mChainList;
    private androidx.constraintlayout.core.widgets.ConstraintWidget[] mDisplayedWidgets;
    private int mDisplayedWidgetsCount;
    private float mFirstHorizontalBias;
    private int mFirstHorizontalStyle;
    private float mFirstVerticalBias;
    private int mFirstVerticalStyle;
    private int mHorizontalAlign;
    private float mHorizontalBias;
    private int mHorizontalGap;
    private int mHorizontalStyle;
    private float mLastHorizontalBias;
    private int mLastHorizontalStyle;
    private float mLastVerticalBias;
    private int mLastVerticalStyle;
    private int mMaxElementsWrap;
    private int mOrientation;
    private int mVerticalAlign;
    private float mVerticalBias;
    private int mVerticalGap;
    private int mVerticalStyle;
    private int mWrapMode;

    private class WidgetsList {
        private androidx.constraintlayout.core.widgets.ConstraintWidget biggest;
        int biggestDimension;
        private androidx.constraintlayout.core.widgets.ConstraintAnchor mBottom;
        private int mCount;
        private int mHeight;
        private androidx.constraintlayout.core.widgets.ConstraintAnchor mLeft;
        private int mMax;
        private int mNbMatchConstraintsWidgets;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private androidx.constraintlayout.core.widgets.ConstraintAnchor mRight;
        private int mStartIndex;
        private androidx.constraintlayout.core.widgets.ConstraintAnchor mTop;
        private int mWidth;
        final /* synthetic */ androidx.constraintlayout.core.widgets.Flow this$0;

        public WidgetsList(androidx.constraintlayout.core.widgets.Flow r2, int r3, androidx.constraintlayout.core.widgets.ConstraintAnchor r4, androidx.constraintlayout.core.widgets.ConstraintAnchor r5, androidx.constraintlayout.core.widgets.ConstraintAnchor r6, androidx.constraintlayout.core.widgets.ConstraintAnchor r7, int r8) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r0 = 0
                r1.biggest = r0
                r0 = 0
                r1.biggestDimension = r0
                r1.mPaddingLeft = r0
                r1.mPaddingTop = r0
                r1.mPaddingRight = r0
                r1.mPaddingBottom = r0
                r1.mWidth = r0
                r1.mHeight = r0
                r1.mStartIndex = r0
                r1.mCount = r0
                r1.mNbMatchConstraintsWidgets = r0
                r1.mMax = r0
                r1.mOrientation = r3
                r1.mLeft = r4
                r1.mTop = r5
                r1.mRight = r6
                r1.mBottom = r7
                int r3 = r2.getPaddingLeft()
                r1.mPaddingLeft = r3
                int r3 = r2.getPaddingTop()
                r1.mPaddingTop = r3
                int r3 = r2.getPaddingRight()
                r1.mPaddingRight = r3
                int r2 = r2.getPaddingBottom()
                r1.mPaddingBottom = r2
                r1.mMax = r8
                return
        }

        static /* synthetic */ androidx.constraintlayout.core.widgets.ConstraintWidget access$2000(androidx.constraintlayout.core.widgets.Flow.WidgetsList r0) {
                androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.biggest
                return r0
        }

        private void recomputeDimensions() {
                r9 = this;
                r0 = 0
                r9.mWidth = r0
                r9.mHeight = r0
                r1 = 0
                r9.biggest = r1
                r9.biggestDimension = r0
                int r1 = r9.mCount
                r2 = r0
            Ld:
                if (r2 >= r1) goto L90
                int r3 = r9.mStartIndex
                int r3 = r3 + r2
                androidx.constraintlayout.core.widgets.Flow r4 = r9.this$0
                int r4 = androidx.constraintlayout.core.widgets.Flow.access$400(r4)
                if (r3 < r4) goto L1c
                goto L90
            L1c:
                androidx.constraintlayout.core.widgets.Flow r3 = r9.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r3 = androidx.constraintlayout.core.widgets.Flow.access$500(r3)
                int r4 = r9.mStartIndex
                int r4 = r4 + r2
                r3 = r3[r4]
                int r4 = r9.mOrientation
                r5 = 8
                if (r4 != 0) goto L5b
                int r4 = r3.getWidth()
                androidx.constraintlayout.core.widgets.Flow r6 = r9.this$0
                int r6 = androidx.constraintlayout.core.widgets.Flow.access$000(r6)
                int r7 = r3.getVisibility()
                if (r7 != r5) goto L3e
                r6 = r0
            L3e:
                int r5 = r9.mWidth
                int r4 = r4 + r6
                int r5 = r5 + r4
                r9.mWidth = r5
                androidx.constraintlayout.core.widgets.Flow r4 = r9.this$0
                int r5 = r9.mMax
                int r4 = androidx.constraintlayout.core.widgets.Flow.access$300(r4, r3, r5)
                androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r9.biggest
                if (r5 == 0) goto L54
                int r5 = r9.biggestDimension
                if (r5 >= r4) goto L8c
            L54:
                r9.biggest = r3
                r9.biggestDimension = r4
                r9.mHeight = r4
                goto L8c
            L5b:
                androidx.constraintlayout.core.widgets.Flow r4 = r9.this$0
                int r6 = r9.mMax
                int r4 = androidx.constraintlayout.core.widgets.Flow.access$200(r4, r3, r6)
                androidx.constraintlayout.core.widgets.Flow r6 = r9.this$0
                int r7 = r9.mMax
                int r6 = androidx.constraintlayout.core.widgets.Flow.access$300(r6, r3, r7)
                androidx.constraintlayout.core.widgets.Flow r7 = r9.this$0
                int r7 = androidx.constraintlayout.core.widgets.Flow.access$100(r7)
                int r8 = r3.getVisibility()
                if (r8 != r5) goto L78
                r7 = r0
            L78:
                int r5 = r9.mHeight
                int r6 = r6 + r7
                int r5 = r5 + r6
                r9.mHeight = r5
                androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r9.biggest
                if (r5 == 0) goto L86
                int r5 = r9.biggestDimension
                if (r5 >= r4) goto L8c
            L86:
                r9.biggest = r3
                r9.biggestDimension = r4
                r9.mWidth = r4
            L8c:
                int r2 = r2 + 1
                goto Ld
            L90:
                return
        }

        public void add(androidx.constraintlayout.core.widgets.ConstraintWidget r7) {
                r6 = this;
                int r0 = r6.mOrientation
                r1 = 8
                r2 = 0
                if (r0 != 0) goto L49
                androidx.constraintlayout.core.widgets.Flow r0 = r6.this$0
                int r3 = r6.mMax
                int r0 = androidx.constraintlayout.core.widgets.Flow.access$200(r0, r7, r3)
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r7.getHorizontalDimensionBehaviour()
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r3 != r4) goto L1e
                int r0 = r6.mNbMatchConstraintsWidgets
                int r0 = r0 + 1
                r6.mNbMatchConstraintsWidgets = r0
                r0 = r2
            L1e:
                androidx.constraintlayout.core.widgets.Flow r3 = r6.this$0
                int r3 = androidx.constraintlayout.core.widgets.Flow.access$000(r3)
                int r4 = r7.getVisibility()
                if (r4 != r1) goto L2b
                goto L2c
            L2b:
                r2 = r3
            L2c:
                int r1 = r6.mWidth
                int r0 = r0 + r2
                int r1 = r1 + r0
                r6.mWidth = r1
                androidx.constraintlayout.core.widgets.Flow r0 = r6.this$0
                int r1 = r6.mMax
                int r0 = androidx.constraintlayout.core.widgets.Flow.access$300(r0, r7, r1)
                androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.biggest
                if (r1 == 0) goto L42
                int r1 = r6.biggestDimension
                if (r1 >= r0) goto L8a
            L42:
                r6.biggest = r7
                r6.biggestDimension = r0
                r6.mHeight = r0
                goto L8a
            L49:
                androidx.constraintlayout.core.widgets.Flow r0 = r6.this$0
                int r3 = r6.mMax
                int r0 = androidx.constraintlayout.core.widgets.Flow.access$200(r0, r7, r3)
                androidx.constraintlayout.core.widgets.Flow r3 = r6.this$0
                int r4 = r6.mMax
                int r3 = androidx.constraintlayout.core.widgets.Flow.access$300(r3, r7, r4)
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r7.getVerticalDimensionBehaviour()
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r4 != r5) goto L68
                int r3 = r6.mNbMatchConstraintsWidgets
                int r3 = r3 + 1
                r6.mNbMatchConstraintsWidgets = r3
                r3 = r2
            L68:
                androidx.constraintlayout.core.widgets.Flow r4 = r6.this$0
                int r4 = androidx.constraintlayout.core.widgets.Flow.access$100(r4)
                int r5 = r7.getVisibility()
                if (r5 != r1) goto L75
                goto L76
            L75:
                r2 = r4
            L76:
                int r1 = r6.mHeight
                int r3 = r3 + r2
                int r1 = r1 + r3
                r6.mHeight = r1
                androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.biggest
                if (r1 == 0) goto L84
                int r1 = r6.biggestDimension
                if (r1 >= r0) goto L8a
            L84:
                r6.biggest = r7
                r6.biggestDimension = r0
                r6.mWidth = r0
            L8a:
                int r7 = r6.mCount
                int r7 = r7 + 1
                r6.mCount = r7
                return
        }

        public void clear() {
                r2 = this;
                r0 = 0
                r2.biggestDimension = r0
                r1 = 0
                r2.biggest = r1
                r2.mWidth = r0
                r2.mHeight = r0
                r2.mStartIndex = r0
                r2.mCount = r0
                r2.mNbMatchConstraintsWidgets = r0
                return
        }

        public void createConstraints(boolean r17, int r18, boolean r19) {
                r16 = this;
                r0 = r16
                int r1 = r0.mCount
                r2 = 0
                r3 = r2
            L6:
                if (r3 >= r1) goto L27
                int r4 = r0.mStartIndex
                int r4 = r4 + r3
                androidx.constraintlayout.core.widgets.Flow r5 = r0.this$0
                int r5 = androidx.constraintlayout.core.widgets.Flow.access$400(r5)
                if (r4 < r5) goto L14
                goto L27
            L14:
                androidx.constraintlayout.core.widgets.Flow r4 = r0.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = androidx.constraintlayout.core.widgets.Flow.access$500(r4)
                int r5 = r0.mStartIndex
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L24
                r4.resetAnchors()
            L24:
                int r3 = r3 + 1
                goto L6
            L27:
                if (r1 == 0) goto L384
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.biggest
                if (r3 != 0) goto L2f
                goto L384
            L2f:
                if (r19 == 0) goto L35
                if (r18 != 0) goto L35
                r4 = 1
                goto L36
            L35:
                r4 = r2
            L36:
                r5 = -1
                r6 = r2
                r7 = r5
                r8 = r7
            L3a:
                if (r6 >= r1) goto L69
                if (r17 == 0) goto L42
                int r9 = r1 + (-1)
                int r9 = r9 - r6
                goto L43
            L42:
                r9 = r6
            L43:
                int r10 = r0.mStartIndex
                int r10 = r10 + r9
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.core.widgets.Flow.access$400(r11)
                if (r10 < r11) goto L4f
                goto L69
            L4f:
                androidx.constraintlayout.core.widgets.Flow r10 = r0.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = androidx.constraintlayout.core.widgets.Flow.access$500(r10)
                int r11 = r0.mStartIndex
                int r11 = r11 + r9
                r9 = r10[r11]
                if (r9 == 0) goto L66
                int r9 = r9.getVisibility()
                if (r9 != 0) goto L66
                if (r7 != r5) goto L65
                r7 = r6
            L65:
                r8 = r6
            L66:
                int r6 = r6 + 1
                goto L3a
            L69:
                int r6 = r0.mOrientation
                r9 = 0
                if (r6 != 0) goto L20e
                androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r0.biggest
                androidx.constraintlayout.core.widgets.Flow r10 = r0.this$0
                int r10 = androidx.constraintlayout.core.widgets.Flow.access$600(r10)
                r6.setVerticalChainStyle(r10)
                int r10 = r0.mPaddingTop
                if (r18 <= 0) goto L84
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.core.widgets.Flow.access$100(r11)
                int r10 = r10 + r11
            L84:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.mTop
                r11.connect(r12, r10)
                if (r19 == 0) goto L96
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r6.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mBottom
                int r12 = r0.mPaddingBottom
                r10.connect(r11, r12)
            L96:
                if (r18 <= 0) goto La3
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.mTop
                androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.mOwner
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.mTop
                r10.connect(r11, r2)
            La3:
                androidx.constraintlayout.core.widgets.Flow r10 = r0.this$0
                int r10 = androidx.constraintlayout.core.widgets.Flow.access$700(r10)
                r11 = 3
                if (r10 != r11) goto Ldd
                boolean r10 = r6.hasBaseline()
                if (r10 != 0) goto Ldd
                r10 = r2
            Lb3:
                if (r10 >= r1) goto Ldd
                if (r17 == 0) goto Lbb
                int r12 = r1 + (-1)
                int r12 = r12 - r10
                goto Lbc
            Lbb:
                r12 = r10
            Lbc:
                int r13 = r0.mStartIndex
                int r13 = r13 + r12
                androidx.constraintlayout.core.widgets.Flow r14 = r0.this$0
                int r14 = androidx.constraintlayout.core.widgets.Flow.access$400(r14)
                if (r13 < r14) goto Lc8
                goto Ldd
            Lc8:
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r13 = androidx.constraintlayout.core.widgets.Flow.access$500(r13)
                int r14 = r0.mStartIndex
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.hasBaseline()
                if (r13 == 0) goto Lda
                goto Lde
            Lda:
                int r10 = r10 + 1
                goto Lb3
            Ldd:
                r12 = r6
            Lde:
                r10 = r2
            Ldf:
                if (r10 >= r1) goto L384
                if (r17 == 0) goto Le7
                int r13 = r1 + (-1)
                int r13 = r13 - r10
                goto Le8
            Le7:
                r13 = r10
            Le8:
                int r14 = r0.mStartIndex
                int r14 = r14 + r13
                androidx.constraintlayout.core.widgets.Flow r15 = r0.this$0
                int r15 = androidx.constraintlayout.core.widgets.Flow.access$400(r15)
                if (r14 < r15) goto Lf5
                goto L384
            Lf5:
                androidx.constraintlayout.core.widgets.Flow r14 = r0.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r14 = androidx.constraintlayout.core.widgets.Flow.access$500(r14)
                int r15 = r0.mStartIndex
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r14 != 0) goto L106
                r14 = r9
                r9 = r11
                goto L208
            L106:
                if (r10 != 0) goto L111
                androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r14.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mLeft
                int r3 = r0.mPaddingLeft
                r14.connect(r15, r11, r3)
            L111:
                if (r13 != 0) goto L16f
                androidx.constraintlayout.core.widgets.Flow r3 = r0.this$0
                int r3 = androidx.constraintlayout.core.widgets.Flow.access$800(r3)
                r11 = 1065353216(0x3f800000, float:1.0)
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                float r13 = androidx.constraintlayout.core.widgets.Flow.access$900(r13)
                if (r17 == 0) goto L125
                float r13 = r11 - r13
            L125:
                int r15 = r0.mStartIndex
                if (r15 != 0) goto L149
                androidx.constraintlayout.core.widgets.Flow r15 = r0.this$0
                int r15 = androidx.constraintlayout.core.widgets.Flow.access$1000(r15)
                if (r15 == r5) goto L149
                androidx.constraintlayout.core.widgets.Flow r3 = r0.this$0
                int r3 = androidx.constraintlayout.core.widgets.Flow.access$1000(r3)
                if (r17 == 0) goto L141
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                float r13 = androidx.constraintlayout.core.widgets.Flow.access$1100(r13)
            L13f:
                float r11 = r11 - r13
                goto L147
            L141:
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                float r11 = androidx.constraintlayout.core.widgets.Flow.access$1100(r11)
            L147:
                r13 = r11
                goto L169
            L149:
                if (r19 == 0) goto L169
                androidx.constraintlayout.core.widgets.Flow r15 = r0.this$0
                int r15 = androidx.constraintlayout.core.widgets.Flow.access$1200(r15)
                if (r15 == r5) goto L169
                androidx.constraintlayout.core.widgets.Flow r3 = r0.this$0
                int r3 = androidx.constraintlayout.core.widgets.Flow.access$1200(r3)
                if (r17 == 0) goto L162
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                float r13 = androidx.constraintlayout.core.widgets.Flow.access$1300(r13)
                goto L13f
            L162:
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                float r11 = androidx.constraintlayout.core.widgets.Flow.access$1300(r11)
                goto L147
            L169:
                r14.setHorizontalChainStyle(r3)
                r14.setHorizontalBiasPercent(r13)
            L16f:
                int r3 = r1 + (-1)
                if (r10 != r3) goto L17c
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mRight
                int r13 = r0.mPaddingRight
                r14.connect(r3, r11, r13)
            L17c:
                if (r9 == 0) goto L1a7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mRight
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                int r13 = androidx.constraintlayout.core.widgets.Flow.access$000(r13)
                r3.connect(r11, r13)
                if (r10 != r7) goto L194
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mLeft
                int r11 = r0.mPaddingLeft
                r3.setGoneMargin(r11)
            L194:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r9.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r14.mLeft
                r3.connect(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L1a7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r9.mRight
                int r9 = r0.mPaddingRight
                r3.setGoneMargin(r9)
            L1a7:
                if (r14 == r6) goto L207
                androidx.constraintlayout.core.widgets.Flow r3 = r0.this$0
                int r3 = androidx.constraintlayout.core.widgets.Flow.access$700(r3)
                r9 = 3
                if (r3 != r9) goto L1c8
                boolean r3 = r12.hasBaseline()
                if (r3 == 0) goto L1c8
                if (r14 == r12) goto L1c8
                boolean r3 = r14.hasBaseline()
                if (r3 == 0) goto L1c8
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mBaseline
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r12.mBaseline
                r3.connect(r11, r2)
                goto L208
            L1c8:
                androidx.constraintlayout.core.widgets.Flow r3 = r0.this$0
                int r3 = androidx.constraintlayout.core.widgets.Flow.access$700(r3)
                if (r3 == 0) goto L1ff
                r11 = 1
                if (r3 == r11) goto L1f7
                if (r4 == 0) goto L1e8
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mTop
                int r13 = r0.mPaddingTop
                r3.connect(r11, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mBottom
                int r13 = r0.mPaddingBottom
                r3.connect(r11, r13)
                goto L208
            L1e8:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.mTop
                r3.connect(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.mBottom
                r3.connect(r11, r2)
                goto L208
            L1f7:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.mBottom
                r3.connect(r11, r2)
                goto L208
            L1ff:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.mTop
                r3.connect(r11, r2)
                goto L208
            L207:
                r9 = 3
            L208:
                int r10 = r10 + 1
                r11 = r9
                r9 = r14
                goto Ldf
            L20e:
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.biggest
                androidx.constraintlayout.core.widgets.Flow r6 = r0.this$0
                int r6 = androidx.constraintlayout.core.widgets.Flow.access$800(r6)
                r3.setHorizontalChainStyle(r6)
                int r6 = r0.mPaddingLeft
                if (r18 <= 0) goto L224
                androidx.constraintlayout.core.widgets.Flow r10 = r0.this$0
                int r10 = androidx.constraintlayout.core.widgets.Flow.access$000(r10)
                int r6 = r6 + r10
            L224:
                if (r17 == 0) goto L246
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mRight
                r10.connect(r11, r6)
                if (r19 == 0) goto L238
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.mLeft
                int r11 = r0.mPaddingRight
                r6.connect(r10, r11)
            L238:
                if (r18 <= 0) goto L265
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r0.mRight
                androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.mOwner
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mRight
                r6.connect(r10, r2)
                goto L265
            L246:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mLeft
                r10.connect(r11, r6)
                if (r19 == 0) goto L258
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.mRight
                int r11 = r0.mPaddingRight
                r6.connect(r10, r11)
            L258:
                if (r18 <= 0) goto L265
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r0.mLeft
                androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.mOwner
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mLeft
                r6.connect(r10, r2)
            L265:
                r6 = r2
            L266:
                if (r6 >= r1) goto L384
                int r10 = r0.mStartIndex
                int r10 = r10 + r6
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.core.widgets.Flow.access$400(r11)
                if (r10 < r11) goto L275
                goto L384
            L275:
                androidx.constraintlayout.core.widgets.Flow r10 = r0.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = androidx.constraintlayout.core.widgets.Flow.access$500(r10)
                int r11 = r0.mStartIndex
                int r11 = r11 + r6
                r10 = r10[r11]
                if (r10 != 0) goto L285
                r12 = 1
                goto L380
            L285:
                if (r6 != 0) goto L2d1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.mTop
                int r13 = r0.mPaddingTop
                r10.connect(r11, r12, r13)
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.core.widgets.Flow.access$600(r11)
                androidx.constraintlayout.core.widgets.Flow r12 = r0.this$0
                float r12 = androidx.constraintlayout.core.widgets.Flow.access$1400(r12)
                int r13 = r0.mStartIndex
                if (r13 != 0) goto L2b5
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                int r13 = androidx.constraintlayout.core.widgets.Flow.access$1500(r13)
                if (r13 == r5) goto L2b5
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.core.widgets.Flow.access$1500(r11)
                androidx.constraintlayout.core.widgets.Flow r12 = r0.this$0
                float r12 = androidx.constraintlayout.core.widgets.Flow.access$1600(r12)
                goto L2cb
            L2b5:
                if (r19 == 0) goto L2cb
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                int r13 = androidx.constraintlayout.core.widgets.Flow.access$1700(r13)
                if (r13 == r5) goto L2cb
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.core.widgets.Flow.access$1700(r11)
                androidx.constraintlayout.core.widgets.Flow r12 = r0.this$0
                float r12 = androidx.constraintlayout.core.widgets.Flow.access$1800(r12)
            L2cb:
                r10.setVerticalChainStyle(r11)
                r10.setVerticalBiasPercent(r12)
            L2d1:
                int r11 = r1 + (-1)
                if (r6 != r11) goto L2de
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.mBottom
                int r13 = r0.mPaddingBottom
                r10.connect(r11, r12, r13)
            L2de:
                if (r9 == 0) goto L309
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r9.mBottom
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                int r13 = androidx.constraintlayout.core.widgets.Flow.access$100(r13)
                r11.connect(r12, r13)
                if (r6 != r7) goto L2f6
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.mTop
                int r12 = r0.mPaddingTop
                r11.setGoneMargin(r12)
            L2f6:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r10.mTop
                r11.connect(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r6 != r12) goto L309
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.mBottom
                int r11 = r0.mPaddingBottom
                r9.setGoneMargin(r11)
            L309:
                if (r10 == r3) goto L37e
                r9 = 2
                if (r17 == 0) goto L33b
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.core.widgets.Flow.access$1900(r11)
                if (r11 == 0) goto L333
                r12 = 1
                if (r11 == r12) goto L32b
                if (r11 == r9) goto L31c
                goto L37e
            L31c:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mLeft
                r9.connect(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mRight
                r9.connect(r11, r2)
                goto L37e
            L32b:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mLeft
                r9.connect(r11, r2)
                goto L37e
            L333:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mRight
                r9.connect(r11, r2)
                goto L37e
            L33b:
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.core.widgets.Flow.access$1900(r11)
                if (r11 == 0) goto L375
                r12 = 1
                if (r11 == r12) goto L36d
                if (r11 == r9) goto L349
                goto L37f
            L349:
                if (r4 == 0) goto L35e
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mLeft
                int r13 = r0.mPaddingLeft
                r9.connect(r11, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mRight
                int r13 = r0.mPaddingRight
                r9.connect(r11, r13)
                goto L37f
            L35e:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mLeft
                r9.connect(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mRight
                r9.connect(r11, r2)
                goto L37f
            L36d:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mRight
                r9.connect(r11, r2)
                goto L37f
            L375:
                r12 = 1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mLeft
                r9.connect(r11, r2)
                goto L37f
            L37e:
                r12 = 1
            L37f:
                r9 = r10
            L380:
                int r6 = r6 + 1
                goto L266
            L384:
                return
        }

        public int getHeight() {
                r2 = this;
                int r0 = r2.mOrientation
                r1 = 1
                if (r0 != r1) goto Lf
                int r0 = r2.mHeight
                androidx.constraintlayout.core.widgets.Flow r1 = r2.this$0
                int r1 = androidx.constraintlayout.core.widgets.Flow.access$100(r1)
                int r0 = r0 - r1
                return r0
            Lf:
                int r0 = r2.mHeight
                return r0
        }

        public int getWidth() {
                r2 = this;
                int r0 = r2.mOrientation
                if (r0 != 0) goto Le
                int r0 = r2.mWidth
                androidx.constraintlayout.core.widgets.Flow r1 = r2.this$0
                int r1 = androidx.constraintlayout.core.widgets.Flow.access$000(r1)
                int r0 = r0 - r1
                return r0
            Le:
                int r0 = r2.mWidth
                return r0
        }

        public void measureMatchConstraints(int r9) {
                r8 = this;
                int r0 = r8.mNbMatchConstraintsWidgets
                if (r0 != 0) goto L5
                return
            L5:
                int r1 = r8.mCount
                int r9 = r9 / r0
                r0 = 0
            L9:
                if (r0 >= r1) goto L66
                int r2 = r8.mStartIndex
                int r2 = r2 + r0
                androidx.constraintlayout.core.widgets.Flow r3 = r8.this$0
                int r3 = androidx.constraintlayout.core.widgets.Flow.access$400(r3)
                if (r2 < r3) goto L17
                goto L66
            L17:
                androidx.constraintlayout.core.widgets.Flow r2 = r8.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = androidx.constraintlayout.core.widgets.Flow.access$500(r2)
                int r3 = r8.mStartIndex
                int r3 = r3 + r0
                r3 = r2[r3]
                int r2 = r8.mOrientation
                if (r2 != 0) goto L45
                if (r3 == 0) goto L63
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r3.getHorizontalDimensionBehaviour()
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r2 != r4) goto L63
                int r2 = r3.mMatchConstraintDefaultWidth
                if (r2 != 0) goto L63
                androidx.constraintlayout.core.widgets.Flow r2 = r8.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r3.getVerticalDimensionBehaviour()
                int r7 = r3.getHeight()
                r5 = r9
                r2.measure(r3, r4, r5, r6, r7)
                goto L63
            L45:
                if (r3 == 0) goto L63
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r3.getVerticalDimensionBehaviour()
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r2 != r4) goto L63
                int r2 = r3.mMatchConstraintDefaultHeight
                if (r2 != 0) goto L63
                androidx.constraintlayout.core.widgets.Flow r2 = r8.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r3.getHorizontalDimensionBehaviour()
                int r5 = r3.getWidth()
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                r7 = r9
                r2.measure(r3, r4, r5, r6, r7)
            L63:
                int r0 = r0 + 1
                goto L9
            L66:
                r8.recomputeDimensions()
                return
        }

        public void setStartIndex(int r1) {
                r0 = this;
                r0.mStartIndex = r1
                return
        }

        public void setup(int r1, androidx.constraintlayout.core.widgets.ConstraintAnchor r2, androidx.constraintlayout.core.widgets.ConstraintAnchor r3, androidx.constraintlayout.core.widgets.ConstraintAnchor r4, androidx.constraintlayout.core.widgets.ConstraintAnchor r5, int r6, int r7, int r8, int r9, int r10) {
                r0 = this;
                r0.mOrientation = r1
                r0.mLeft = r2
                r0.mTop = r3
                r0.mRight = r4
                r0.mBottom = r5
                r0.mPaddingLeft = r6
                r0.mPaddingTop = r7
                r0.mPaddingRight = r8
                r0.mPaddingBottom = r9
                r0.mMax = r10
                return
        }
    }

    public Flow() {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.mHorizontalStyle = r0
            r3.mVerticalStyle = r0
            r3.mFirstHorizontalStyle = r0
            r3.mFirstVerticalStyle = r0
            r3.mLastHorizontalStyle = r0
            r3.mLastVerticalStyle = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r3.mHorizontalBias = r1
            r3.mVerticalBias = r1
            r3.mFirstHorizontalBias = r1
            r3.mFirstVerticalBias = r1
            r3.mLastHorizontalBias = r1
            r3.mLastVerticalBias = r1
            r1 = 0
            r3.mHorizontalGap = r1
            r3.mVerticalGap = r1
            r2 = 2
            r3.mHorizontalAlign = r2
            r3.mVerticalAlign = r2
            r3.mWrapMode = r1
            r3.mMaxElementsWrap = r0
            r3.mOrientation = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mChainList = r0
            r0 = 0
            r3.mAlignedBiggestElementsInRows = r0
            r3.mAlignedBiggestElementsInCols = r0
            r3.mAlignedDimensions = r0
            r3.mDisplayedWidgetsCount = r1
            return
    }

    static /* synthetic */ int access$000(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mHorizontalGap
            return r0
    }

    static /* synthetic */ int access$100(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mVerticalGap
            return r0
    }

    static /* synthetic */ int access$1000(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mFirstHorizontalStyle
            return r0
    }

    static /* synthetic */ float access$1100(androidx.constraintlayout.core.widgets.Flow r0) {
            float r0 = r0.mFirstHorizontalBias
            return r0
    }

    static /* synthetic */ int access$1200(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mLastHorizontalStyle
            return r0
    }

    static /* synthetic */ float access$1300(androidx.constraintlayout.core.widgets.Flow r0) {
            float r0 = r0.mLastHorizontalBias
            return r0
    }

    static /* synthetic */ float access$1400(androidx.constraintlayout.core.widgets.Flow r0) {
            float r0 = r0.mVerticalBias
            return r0
    }

    static /* synthetic */ int access$1500(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mFirstVerticalStyle
            return r0
    }

    static /* synthetic */ float access$1600(androidx.constraintlayout.core.widgets.Flow r0) {
            float r0 = r0.mFirstVerticalBias
            return r0
    }

    static /* synthetic */ int access$1700(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mLastVerticalStyle
            return r0
    }

    static /* synthetic */ float access$1800(androidx.constraintlayout.core.widgets.Flow r0) {
            float r0 = r0.mLastVerticalBias
            return r0
    }

    static /* synthetic */ int access$1900(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mHorizontalAlign
            return r0
    }

    static /* synthetic */ int access$200(androidx.constraintlayout.core.widgets.Flow r0, androidx.constraintlayout.core.widgets.ConstraintWidget r1, int r2) {
            int r0 = r0.getWidgetWidth(r1, r2)
            return r0
    }

    static /* synthetic */ int access$300(androidx.constraintlayout.core.widgets.Flow r0, androidx.constraintlayout.core.widgets.ConstraintWidget r1, int r2) {
            int r0 = r0.getWidgetHeight(r1, r2)
            return r0
    }

    static /* synthetic */ int access$400(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mDisplayedWidgetsCount
            return r0
    }

    static /* synthetic */ androidx.constraintlayout.core.widgets.ConstraintWidget[] access$500(androidx.constraintlayout.core.widgets.Flow r0) {
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r0.mDisplayedWidgets
            return r0
    }

    static /* synthetic */ int access$600(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mVerticalStyle
            return r0
    }

    static /* synthetic */ int access$700(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mVerticalAlign
            return r0
    }

    static /* synthetic */ int access$800(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mHorizontalStyle
            return r0
    }

    static /* synthetic */ float access$900(androidx.constraintlayout.core.widgets.Flow r0) {
            float r0 = r0.mHorizontalBias
            return r0
    }

    private void createAlignedConstraints(boolean r12) {
            r11 = this;
            int[] r0 = r11.mAlignedDimensions
            if (r0 == 0) goto L121
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r11.mAlignedBiggestElementsInCols
            if (r0 == 0) goto L121
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r11.mAlignedBiggestElementsInRows
            if (r0 != 0) goto Le
            goto L121
        Le:
            r0 = 0
            r1 = r0
        L10:
            int r2 = r11.mDisplayedWidgetsCount
            if (r1 >= r2) goto L1e
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = r11.mDisplayedWidgets
            r2 = r2[r1]
            r2.resetAnchors()
            int r1 = r1 + 1
            goto L10
        L1e:
            int[] r1 = r11.mAlignedDimensions
            r2 = r1[r0]
            r3 = 1
            r1 = r1[r3]
            float r4 = r11.mHorizontalBias
            r5 = 0
            r6 = r0
        L29:
            r7 = 8
            if (r6 >= r2) goto L84
            if (r12 == 0) goto L38
            int r4 = r2 - r6
            int r4 = r4 - r3
            r8 = 1065353216(0x3f800000, float:1.0)
            float r9 = r11.mHorizontalBias
            float r8 = r8 - r9
            goto L3a
        L38:
            r8 = r4
            r4 = r6
        L3a:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r9 = r11.mAlignedBiggestElementsInCols
            r4 = r9[r4]
            if (r4 == 0) goto L80
            int r9 = r4.getVisibility()
            if (r9 != r7) goto L47
            goto L80
        L47:
            if (r6 != 0) goto L5c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r4.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r11.mLeft
            int r10 = r11.getPaddingLeft()
            r4.connect(r7, r9, r10)
            int r7 = r11.mHorizontalStyle
            r4.setHorizontalChainStyle(r7)
            r4.setHorizontalBiasPercent(r8)
        L5c:
            int r7 = r2 + (-1)
            if (r6 != r7) goto L6b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r4.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r11.mRight
            int r10 = r11.getPaddingRight()
            r4.connect(r7, r9, r10)
        L6b:
            if (r6 <= 0) goto L7f
            if (r5 == 0) goto L7f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r4.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r5.mRight
            int r10 = r11.mHorizontalGap
            r4.connect(r7, r9, r10)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r5.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r4.mLeft
            r5.connect(r7, r9, r0)
        L7f:
            r5 = r4
        L80:
            int r6 = r6 + 1
            r4 = r8
            goto L29
        L84:
            r12 = r0
        L85:
            if (r12 >= r1) goto Ld2
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r11.mAlignedBiggestElementsInRows
            r4 = r4[r12]
            if (r4 == 0) goto Lcf
            int r6 = r4.getVisibility()
            if (r6 != r7) goto L94
            goto Lcf
        L94:
            if (r12 != 0) goto Lab
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r4.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r11.mTop
            int r9 = r11.getPaddingTop()
            r4.connect(r6, r8, r9)
            int r6 = r11.mVerticalStyle
            r4.setVerticalChainStyle(r6)
            float r6 = r11.mVerticalBias
            r4.setVerticalBiasPercent(r6)
        Lab:
            int r6 = r1 + (-1)
            if (r12 != r6) goto Lba
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r4.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r11.mBottom
            int r9 = r11.getPaddingBottom()
            r4.connect(r6, r8, r9)
        Lba:
            if (r12 <= 0) goto Lce
            if (r5 == 0) goto Lce
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r4.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r5.mBottom
            int r9 = r11.mVerticalGap
            r4.connect(r6, r8, r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r5.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r4.mTop
            r5.connect(r6, r8, r0)
        Lce:
            r5 = r4
        Lcf:
            int r12 = r12 + 1
            goto L85
        Ld2:
            r12 = r0
        Ld3:
            if (r12 >= r2) goto L121
            r4 = r0
        Ld6:
            if (r4 >= r1) goto L11e
            int r5 = r4 * r2
            int r5 = r5 + r12
            int r6 = r11.mOrientation
            if (r6 != r3) goto Le2
            int r5 = r12 * r1
            int r5 = r5 + r4
        Le2:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r6 = r11.mDisplayedWidgets
            int r8 = r6.length
            if (r5 < r8) goto Le8
            goto L11b
        Le8:
            r5 = r6[r5]
            if (r5 == 0) goto L11b
            int r6 = r5.getVisibility()
            if (r6 != r7) goto Lf3
            goto L11b
        Lf3:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r6 = r11.mAlignedBiggestElementsInCols
            r6 = r6[r12]
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r8 = r11.mAlignedBiggestElementsInRows
            r8 = r8[r4]
            if (r5 == r6) goto L10b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r5.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r6.mLeft
            r5.connect(r9, r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r5.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.mRight
            r5.connect(r9, r6, r0)
        L10b:
            if (r5 == r8) goto L11b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r5.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.mTop
            r5.connect(r6, r9, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r5.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r8.mBottom
            r5.connect(r6, r8, r0)
        L11b:
            int r4 = r4 + 1
            goto Ld6
        L11e:
            int r12 = r12 + 1
            goto Ld3
        L121:
            return
    }

    private final int getWidgetHeight(androidx.constraintlayout.core.widgets.ConstraintWidget r10, int r11) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r10.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r2) goto L51
            int r1 = r10.mMatchConstraintDefaultHeight
            if (r1 != 0) goto L11
            return r0
        L11:
            int r0 = r10.mMatchConstraintDefaultHeight
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L36
            float r0 = r10.mMatchConstraintPercentHeight
            float r11 = (float) r11
            float r0 = r0 * r11
            int r11 = (int) r0
            int r0 = r10.getHeight()
            if (r11 == r0) goto L35
            r10.setMeasureRequested(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = r10.getHorizontalDimensionBehaviour()
            int r6 = r10.getWidth()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3 = r9
            r4 = r10
            r8 = r11
            r3.measure(r4, r5, r6, r7, r8)
        L35:
            return r11
        L36:
            int r11 = r10.mMatchConstraintDefaultHeight
            if (r11 != r2) goto L3f
            int r10 = r10.getHeight()
            return r10
        L3f:
            int r11 = r10.mMatchConstraintDefaultHeight
            r0 = 3
            if (r11 != r0) goto L51
            int r11 = r10.getWidth()
            float r11 = (float) r11
            float r10 = r10.mDimensionRatio
            float r11 = r11 * r10
            r10 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r10
            int r10 = (int) r11
            return r10
        L51:
            int r10 = r10.getHeight()
            return r10
    }

    private final int getWidgetWidth(androidx.constraintlayout.core.widgets.ConstraintWidget r10, int r11) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r10.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r2) goto L51
            int r1 = r10.mMatchConstraintDefaultWidth
            if (r1 != 0) goto L11
            return r0
        L11:
            int r0 = r10.mMatchConstraintDefaultWidth
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L36
            float r0 = r10.mMatchConstraintPercentWidth
            float r11 = (float) r11
            float r0 = r0 * r11
            int r11 = (int) r0
            int r0 = r10.getWidth()
            if (r11 == r0) goto L35
            r10.setMeasureRequested(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r10.getVerticalDimensionBehaviour()
            int r8 = r10.getHeight()
            r3 = r9
            r4 = r10
            r6 = r11
            r3.measure(r4, r5, r6, r7, r8)
        L35:
            return r11
        L36:
            int r11 = r10.mMatchConstraintDefaultWidth
            if (r11 != r2) goto L3f
            int r10 = r10.getWidth()
            return r10
        L3f:
            int r11 = r10.mMatchConstraintDefaultWidth
            r0 = 3
            if (r11 != r0) goto L51
            int r11 = r10.getHeight()
            float r11 = (float) r11
            float r10 = r10.mDimensionRatio
            float r11 = r11 * r10
            r10 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r10
            int r10 = (int) r11
            return r10
        L51:
            int r10 = r10.getWidth()
            return r10
    }

    private void measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
            r10 = this;
            r0 = 0
            if (r13 != 0) goto L26
            int r1 = r10.mMaxElementsWrap
            if (r1 > 0) goto L23
            r1 = r0
            r2 = r1
            r3 = r2
        La:
            if (r2 >= r12) goto L23
            if (r2 <= 0) goto L11
            int r4 = r10.mHorizontalGap
            int r3 = r3 + r4
        L11:
            r4 = r11[r2]
            if (r4 != 0) goto L16
            goto L20
        L16:
            int r4 = r10.getWidgetWidth(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L1e
            goto L23
        L1e:
            int r1 = r1 + 1
        L20:
            int r2 = r2 + 1
            goto La
        L23:
            r2 = r1
            r1 = r0
            goto L47
        L26:
            int r1 = r10.mMaxElementsWrap
            if (r1 > 0) goto L46
            r1 = r0
            r2 = r1
            r3 = r2
        L2d:
            if (r2 >= r12) goto L46
            if (r2 <= 0) goto L34
            int r4 = r10.mVerticalGap
            int r3 = r3 + r4
        L34:
            r4 = r11[r2]
            if (r4 != 0) goto L39
            goto L43
        L39:
            int r4 = r10.getWidgetHeight(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L41
            goto L46
        L41:
            int r1 = r1 + 1
        L43:
            int r2 = r2 + 1
            goto L2d
        L46:
            r2 = r0
        L47:
            int[] r3 = r10.mAlignedDimensions
            if (r3 != 0) goto L50
            r3 = 2
            int[] r3 = new int[r3]
            r10.mAlignedDimensions = r3
        L50:
            r3 = 1
            if (r1 != 0) goto L55
            if (r13 == r3) goto L59
        L55:
            if (r2 != 0) goto L5b
            if (r13 != 0) goto L5b
        L59:
            r4 = r3
            goto L5c
        L5b:
            r4 = r0
        L5c:
            if (r4 != 0) goto L11d
            if (r13 != 0) goto L6a
            float r1 = (float) r12
            float r5 = (float) r2
            float r1 = r1 / r5
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            int r1 = (int) r5
            goto L73
        L6a:
            float r2 = (float) r12
            float r5 = (float) r1
            float r2 = r2 / r5
            double r5 = (double) r2
            double r5 = java.lang.Math.ceil(r5)
            int r2 = (int) r5
        L73:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = r10.mAlignedBiggestElementsInCols
            r6 = 0
            if (r5 == 0) goto L80
            int r7 = r5.length
            if (r7 >= r2) goto L7c
            goto L80
        L7c:
            java.util.Arrays.fill(r5, r6)
            goto L84
        L80:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r2]
            r10.mAlignedBiggestElementsInCols = r5
        L84:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = r10.mAlignedBiggestElementsInRows
            if (r5 == 0) goto L90
            int r7 = r5.length
            if (r7 >= r1) goto L8c
            goto L90
        L8c:
            java.util.Arrays.fill(r5, r6)
            goto L94
        L90:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r10.mAlignedBiggestElementsInRows = r5
        L94:
            r5 = r0
        L95:
            if (r5 >= r2) goto Ld9
            r6 = r0
        L98:
            if (r6 >= r1) goto Ld6
            int r7 = r6 * r2
            int r7 = r7 + r5
            if (r13 != r3) goto La2
            int r7 = r5 * r1
            int r7 = r7 + r6
        La2:
            int r8 = r11.length
            if (r7 < r8) goto La6
            goto Ld3
        La6:
            r7 = r11[r7]
            if (r7 != 0) goto Lab
            goto Ld3
        Lab:
            int r8 = r10.getWidgetWidth(r7, r14)
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r9 = r10.mAlignedBiggestElementsInCols
            r9 = r9[r5]
            if (r9 == 0) goto Lbb
            int r9 = r9.getWidth()
            if (r9 >= r8) goto Lbf
        Lbb:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r8 = r10.mAlignedBiggestElementsInCols
            r8[r5] = r7
        Lbf:
            int r8 = r10.getWidgetHeight(r7, r14)
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r9 = r10.mAlignedBiggestElementsInRows
            r9 = r9[r6]
            if (r9 == 0) goto Lcf
            int r9 = r9.getHeight()
            if (r9 >= r8) goto Ld3
        Lcf:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r8 = r10.mAlignedBiggestElementsInRows
            r8[r6] = r7
        Ld3:
            int r6 = r6 + 1
            goto L98
        Ld6:
            int r5 = r5 + 1
            goto L95
        Ld9:
            r5 = r0
            r6 = r5
        Ldb:
            if (r5 >= r2) goto Lf0
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r7 = r10.mAlignedBiggestElementsInCols
            r7 = r7[r5]
            if (r7 == 0) goto Led
            if (r5 <= 0) goto Le8
            int r8 = r10.mHorizontalGap
            int r6 = r6 + r8
        Le8:
            int r7 = r10.getWidgetWidth(r7, r14)
            int r6 = r6 + r7
        Led:
            int r5 = r5 + 1
            goto Ldb
        Lf0:
            r5 = r0
            r7 = r5
        Lf2:
            if (r5 >= r1) goto L107
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r8 = r10.mAlignedBiggestElementsInRows
            r8 = r8[r5]
            if (r8 == 0) goto L104
            if (r5 <= 0) goto Lff
            int r9 = r10.mVerticalGap
            int r7 = r7 + r9
        Lff:
            int r8 = r10.getWidgetHeight(r8, r14)
            int r7 = r7 + r8
        L104:
            int r5 = r5 + 1
            goto Lf2
        L107:
            r15[r0] = r6
            r15[r3] = r7
            if (r13 != 0) goto L115
            if (r6 <= r14) goto L59
            if (r2 <= r3) goto L59
            int r2 = r2 + (-1)
            goto L5c
        L115:
            if (r7 <= r14) goto L59
            if (r1 <= r3) goto L59
            int r1 = r1 + (-1)
            goto L5c
        L11d:
            int[] r11 = r10.mAlignedDimensions
            r11[r0] = r2
            r11[r3] = r1
            return
    }

    private void measureChainWrap(androidx.constraintlayout.core.widgets.ConstraintWidget[] r29, int r30, int r31, int r32, int[] r33) {
            r28 = this;
            r8 = r28
            r9 = r30
            r15 = r32
            if (r9 != 0) goto L9
            return
        L9:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.clear()
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r10 = new androidx.constraintlayout.core.widgets.Flow$WidgetsList
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.mBottom
            r0 = r10
            r1 = r28
            r2 = r31
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.add(r10)
            r20 = 1
            r21 = 0
            if (r31 != 0) goto L92
            r0 = r21
            r1 = r0
            r11 = r1
        L31:
            if (r11 >= r9) goto Lf7
            r12 = r29[r11]
            int r13 = r8.getWidgetWidth(r12, r15)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r12.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L43
            int r0 = r0 + 1
        L43:
            r14 = r0
            if (r1 == r15) goto L4c
            int r0 = r8.mHorizontalGap
            int r0 = r0 + r1
            int r0 = r0 + r13
            if (r0 <= r15) goto L55
        L4c:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r10)
            if (r0 == 0) goto L55
            r0 = r20
            goto L57
        L55:
            r0 = r21
        L57:
            if (r0 != 0) goto L65
            if (r11 <= 0) goto L65
            int r2 = r8.mMaxElementsWrap
            if (r2 <= 0) goto L65
            int r2 = r11 % r2
            if (r2 != 0) goto L65
            r0 = r20
        L65:
            if (r0 == 0) goto L85
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r10 = new androidx.constraintlayout.core.widgets.Flow$WidgetsList
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.mBottom
            r0 = r10
            r1 = r28
            r2 = r31
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.setStartIndex(r11)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.add(r10)
        L83:
            r1 = r13
            goto L8b
        L85:
            if (r11 <= 0) goto L83
            int r0 = r8.mHorizontalGap
            int r0 = r0 + r13
            int r1 = r1 + r0
        L8b:
            r10.add(r12)
            int r11 = r11 + 1
            r0 = r14
            goto L31
        L92:
            r0 = r21
            r1 = r0
            r11 = r1
        L96:
            if (r11 >= r9) goto Lf7
            r12 = r29[r11]
            int r13 = r8.getWidgetHeight(r12, r15)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r12.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto La8
            int r0 = r0 + 1
        La8:
            r14 = r0
            if (r1 == r15) goto Lb1
            int r0 = r8.mVerticalGap
            int r0 = r0 + r1
            int r0 = r0 + r13
            if (r0 <= r15) goto Lba
        Lb1:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r10)
            if (r0 == 0) goto Lba
            r0 = r20
            goto Lbc
        Lba:
            r0 = r21
        Lbc:
            if (r0 != 0) goto Lca
            if (r11 <= 0) goto Lca
            int r2 = r8.mMaxElementsWrap
            if (r2 <= 0) goto Lca
            int r2 = r11 % r2
            if (r2 != 0) goto Lca
            r0 = r20
        Lca:
            if (r0 == 0) goto Lea
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r10 = new androidx.constraintlayout.core.widgets.Flow$WidgetsList
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.mBottom
            r0 = r10
            r1 = r28
            r2 = r31
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.setStartIndex(r11)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.add(r10)
        Le8:
            r1 = r13
            goto Lf0
        Lea:
            if (r11 <= 0) goto Le8
            int r0 = r8.mVerticalGap
            int r0 = r0 + r13
            int r1 = r1 + r0
        Lf0:
            r10.add(r12)
            int r11 = r11 + 1
            r0 = r14
            goto L96
        Lf7:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r1 = r8.mChainList
            int r1 = r1.size()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mBottom
            int r6 = r28.getPaddingLeft()
            int r7 = r28.getPaddingTop()
            int r9 = r28.getPaddingRight()
            int r10 = r28.getPaddingBottom()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r28.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 == r12) goto L129
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r28.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 != r12) goto L126
            goto L129
        L126:
            r11 = r21
            goto L12b
        L129:
            r11 = r20
        L12b:
            if (r0 <= 0) goto L153
            if (r11 == 0) goto L153
            r0 = r21
        L131:
            if (r0 >= r1) goto L153
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r11 = r8.mChainList
            java.lang.Object r11 = r11.get(r0)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r11 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r11
            if (r31 != 0) goto L147
            int r12 = r11.getWidth()
            int r12 = r15 - r12
            r11.measureMatchConstraints(r12)
            goto L150
        L147:
            int r12 = r11.getHeight()
            int r12 = r15 - r12
            r11.measureMatchConstraints(r12)
        L150:
            int r0 = r0 + 1
            goto L131
        L153:
            r22 = r7
            r0 = r9
            r12 = r21
            r13 = r12
            r14 = r13
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r10
        L15e:
            if (r14 >= r1) goto L237
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r9 = r8.mChainList
            java.lang.Object r9 = r9.get(r14)
            r23 = r9
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r23 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r23
            if (r31 != 0) goto L1cf
            int r2 = r1 + (-1)
            if (r14 >= r2) goto L183
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r2 = r8.mChainList
            int r5 = r14 + 1
            java.lang.Object r2 = r2.get(r5)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r2 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTop
            r5 = r21
            goto L189
        L183:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.mBottom
            int r5 = r28.getPaddingBottom()
        L189:
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r23)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mBottom
            r9 = r23
            r10 = r31
            r24 = r11
            r11 = r3
            r29 = r3
            r3 = r12
            r12 = r6
            r6 = r13
            r13 = r4
            r30 = r4
            r4 = r14
            r14 = r2
            r15 = r7
            r16 = r22
            r17 = r0
            r18 = r5
            r19 = r32
            r9.setup(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r9 = r23.getWidth()
            int r6 = java.lang.Math.max(r6, r9)
            int r9 = r23.getHeight()
            int r12 = r3 + r9
            if (r4 <= 0) goto L1bf
            int r3 = r8.mVerticalGap
            int r12 = r12 + r3
        L1bf:
            r3 = r29
            r13 = r6
            r22 = r21
            r6 = r24
            r24 = r30
            r27 = r5
            r5 = r2
            r2 = r27
            goto L22f
        L1cf:
            r29 = r3
            r3 = r12
            r0 = r13
            r4 = r14
            int r9 = r1 + (-1)
            if (r4 >= r9) goto L1ed
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r9 = r8.mChainList
            int r14 = r4 + 1
            java.lang.Object r9 = r9.get(r14)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r9 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r9
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.mLeft
            r24 = r9
            r25 = r21
            goto L1f7
        L1ed:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.mRight
            int r10 = r28.getPaddingRight()
            r24 = r9
            r25 = r10
        L1f7:
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r23)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r9.mRight
            r9 = r23
            r10 = r31
            r11 = r29
            r12 = r6
            r13 = r24
            r14 = r5
            r26 = r15
            r15 = r7
            r16 = r22
            r17 = r25
            r18 = r2
            r19 = r32
            r9.setup(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r7 = r23.getWidth()
            int r13 = r0 + r7
            int r0 = r23.getHeight()
            int r0 = java.lang.Math.max(r3, r0)
            if (r4 <= 0) goto L228
            int r3 = r8.mHorizontalGap
            int r13 = r13 + r3
        L228:
            r12 = r0
            r7 = r21
            r0 = r25
            r3 = r26
        L22f:
            int r14 = r4 + 1
            r15 = r32
            r4 = r24
            goto L15e
        L237:
            r3 = r12
            r0 = r13
            r33[r21] = r0
            r33[r20] = r3
            return
    }

    private void measureChainWrap_new(androidx.constraintlayout.core.widgets.ConstraintWidget[] r29, int r30, int r31, int r32, int[] r33) {
            r28 = this;
            r8 = r28
            r9 = r30
            r15 = r32
            if (r9 != 0) goto L9
            return
        L9:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.clear()
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r10 = new androidx.constraintlayout.core.widgets.Flow$WidgetsList
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.mBottom
            r0 = r10
            r1 = r28
            r2 = r31
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.add(r10)
            r20 = 1
            r21 = 0
            if (r31 != 0) goto L9a
            r0 = r21
            r1 = r0
            r2 = r1
            r11 = r2
        L32:
            if (r11 >= r9) goto Lfd
            int r12 = r0 + 1
            r13 = r29[r11]
            int r14 = r8.getWidgetWidth(r13, r15)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r13.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r3) goto L46
            int r1 = r1 + 1
        L46:
            r16 = r1
            if (r2 == r15) goto L50
            int r0 = r8.mHorizontalGap
            int r0 = r0 + r2
            int r0 = r0 + r14
            if (r0 <= r15) goto L59
        L50:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r10)
            if (r0 == 0) goto L59
            r0 = r20
            goto L5b
        L59:
            r0 = r21
        L5b:
            if (r0 != 0) goto L67
            if (r11 <= 0) goto L67
            int r1 = r8.mMaxElementsWrap
            if (r1 <= 0) goto L67
            if (r12 <= r1) goto L67
            r0 = r20
        L67:
            if (r0 == 0) goto L88
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r10 = new androidx.constraintlayout.core.widgets.Flow$WidgetsList
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.mBottom
            r0 = r10
            r1 = r28
            r2 = r31
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.setStartIndex(r11)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.add(r10)
            r0 = r12
            r2 = r14
            goto L92
        L88:
            if (r11 <= 0) goto L8f
            int r0 = r8.mHorizontalGap
            int r0 = r0 + r14
            int r2 = r2 + r0
            goto L90
        L8f:
            r2 = r14
        L90:
            r0 = r21
        L92:
            r10.add(r13)
            int r11 = r11 + 1
            r1 = r16
            goto L32
        L9a:
            r0 = r21
            r1 = r0
            r11 = r1
        L9e:
            if (r11 >= r9) goto Lfd
            r12 = r29[r11]
            int r13 = r8.getWidgetHeight(r12, r15)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r12.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto Lb0
            int r1 = r1 + 1
        Lb0:
            r14 = r1
            if (r0 == r15) goto Lb9
            int r1 = r8.mVerticalGap
            int r1 = r1 + r0
            int r1 = r1 + r13
            if (r1 <= r15) goto Lc2
        Lb9:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r10)
            if (r1 == 0) goto Lc2
            r1 = r20
            goto Lc4
        Lc2:
            r1 = r21
        Lc4:
            if (r1 != 0) goto Ld0
            if (r11 <= 0) goto Ld0
            int r2 = r8.mMaxElementsWrap
            if (r2 <= 0) goto Ld0
            if (r2 >= 0) goto Ld0
            r1 = r20
        Ld0:
            if (r1 == 0) goto Lf0
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r10 = new androidx.constraintlayout.core.widgets.Flow$WidgetsList
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.mBottom
            r0 = r10
            r1 = r28
            r2 = r31
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.setStartIndex(r11)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.add(r10)
        Lee:
            r0 = r13
            goto Lf6
        Lf0:
            if (r11 <= 0) goto Lee
            int r1 = r8.mVerticalGap
            int r1 = r1 + r13
            int r0 = r0 + r1
        Lf6:
            r10.add(r12)
            int r11 = r11 + 1
            r1 = r14
            goto L9e
        Lfd:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            int r0 = r0.size()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mBottom
            int r6 = r28.getPaddingLeft()
            int r7 = r28.getPaddingTop()
            int r9 = r28.getPaddingRight()
            int r10 = r28.getPaddingBottom()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r28.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 == r12) goto L12f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r28.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 != r12) goto L12c
            goto L12f
        L12c:
            r11 = r21
            goto L131
        L12f:
            r11 = r20
        L131:
            if (r1 <= 0) goto L159
            if (r11 == 0) goto L159
            r1 = r21
        L137:
            if (r1 >= r0) goto L159
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r11 = r8.mChainList
            java.lang.Object r11 = r11.get(r1)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r11 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r11
            if (r31 != 0) goto L14d
            int r12 = r11.getWidth()
            int r12 = r15 - r12
            r11.measureMatchConstraints(r12)
            goto L156
        L14d:
            int r12 = r11.getHeight()
            int r12 = r15 - r12
            r11.measureMatchConstraints(r12)
        L156:
            int r1 = r1 + 1
            goto L137
        L159:
            r22 = r7
            r1 = r9
            r12 = r21
            r13 = r12
            r14 = r13
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r10
        L164:
            if (r14 >= r0) goto L23d
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r9 = r8.mChainList
            java.lang.Object r9 = r9.get(r14)
            r23 = r9
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r23 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r23
            if (r31 != 0) goto L1d5
            int r2 = r0 + (-1)
            if (r14 >= r2) goto L189
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r2 = r8.mChainList
            int r5 = r14 + 1
            java.lang.Object r2 = r2.get(r5)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r2 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTop
            r5 = r21
            goto L18f
        L189:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.mBottom
            int r5 = r28.getPaddingBottom()
        L18f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r23)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mBottom
            r9 = r23
            r10 = r31
            r24 = r11
            r11 = r3
            r29 = r3
            r3 = r12
            r12 = r6
            r6 = r13
            r13 = r4
            r30 = r4
            r4 = r14
            r14 = r2
            r15 = r7
            r16 = r22
            r17 = r1
            r18 = r5
            r19 = r32
            r9.setup(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r9 = r23.getWidth()
            int r6 = java.lang.Math.max(r6, r9)
            int r9 = r23.getHeight()
            int r12 = r3 + r9
            if (r4 <= 0) goto L1c5
            int r3 = r8.mVerticalGap
            int r12 = r12 + r3
        L1c5:
            r3 = r29
            r13 = r6
            r22 = r21
            r6 = r24
            r24 = r30
            r27 = r5
            r5 = r2
            r2 = r27
            goto L235
        L1d5:
            r29 = r3
            r3 = r12
            r1 = r13
            r4 = r14
            int r9 = r0 + (-1)
            if (r4 >= r9) goto L1f3
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r9 = r8.mChainList
            int r14 = r4 + 1
            java.lang.Object r9 = r9.get(r14)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r9 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r9
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.mLeft
            r24 = r9
            r25 = r21
            goto L1fd
        L1f3:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.mRight
            int r10 = r28.getPaddingRight()
            r24 = r9
            r25 = r10
        L1fd:
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r23)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r9.mRight
            r9 = r23
            r10 = r31
            r11 = r29
            r12 = r6
            r13 = r24
            r14 = r5
            r26 = r15
            r15 = r7
            r16 = r22
            r17 = r25
            r18 = r2
            r19 = r32
            r9.setup(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r7 = r23.getWidth()
            int r13 = r1 + r7
            int r1 = r23.getHeight()
            int r1 = java.lang.Math.max(r3, r1)
            if (r4 <= 0) goto L22e
            int r3 = r8.mHorizontalGap
            int r13 = r13 + r3
        L22e:
            r12 = r1
            r7 = r21
            r1 = r25
            r3 = r26
        L235:
            int r14 = r4 + 1
            r15 = r32
            r4 = r24
            goto L164
        L23d:
            r3 = r12
            r1 = r13
            r33[r21] = r1
            r33[r20] = r3
            return
    }

    private void measureNoWrap(androidx.constraintlayout.core.widgets.ConstraintWidget[] r23, int r24, int r25, int r26, int[] r27) {
            r22 = this;
            r8 = r22
            r9 = r24
            if (r9 != 0) goto L7
            return
        L7:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            int r0 = r0.size()
            r10 = 0
            if (r0 != 0) goto L2a
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r11 = new androidx.constraintlayout.core.widgets.Flow$WidgetsList
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.mBottom
            r0 = r11
            r1 = r22
            r2 = r25
            r7 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.add(r11)
            goto L57
        L2a:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r0 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r0
            r0.clear()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mBottom
            int r17 = r22.getPaddingLeft()
            int r18 = r22.getPaddingTop()
            int r19 = r22.getPaddingRight()
            int r20 = r22.getPaddingBottom()
            r11 = r0
            r12 = r25
            r16 = r1
            r21 = r26
            r11.setup(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L57:
            r0 = r10
        L58:
            if (r0 >= r9) goto L62
            r1 = r23[r0]
            r11.add(r1)
            int r0 = r0 + 1
            goto L58
        L62:
            int r0 = r11.getWidth()
            r27[r10] = r0
            int r0 = r11.getHeight()
            r1 = 1
            r27[r1] = r0
            return
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(androidx.constraintlayout.core.LinearSystem r6, boolean r7) {
            r5 = this;
            super.addToSolver(r6, r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.getParent()
            r7 = 0
            r0 = 1
            if (r6 == 0) goto L19
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.getParent()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r6
            boolean r6 = r6.isRtl()
            if (r6 == 0) goto L19
            r6 = r0
            goto L1a
        L19:
            r6 = r7
        L1a:
            int r1 = r5.mWrapMode
            if (r1 == 0) goto L67
            if (r1 == r0) goto L49
            r2 = 2
            if (r1 == r2) goto L45
            r2 = 3
            if (r1 == r2) goto L27
            goto L7a
        L27:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r1 = r5.mChainList
            int r1 = r1.size()
            r2 = r7
        L2e:
            if (r2 >= r1) goto L7a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r3 = r5.mChainList
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r3 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r3
            int r4 = r1 + (-1)
            if (r2 != r4) goto L3e
            r4 = r0
            goto L3f
        L3e:
            r4 = r7
        L3f:
            r3.createConstraints(r6, r2, r4)
            int r2 = r2 + 1
            goto L2e
        L45:
            r5.createAlignedConstraints(r6)
            goto L7a
        L49:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r1 = r5.mChainList
            int r1 = r1.size()
            r2 = r7
        L50:
            if (r2 >= r1) goto L7a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r3 = r5.mChainList
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r3 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r3
            int r4 = r1 + (-1)
            if (r2 != r4) goto L60
            r4 = r0
            goto L61
        L60:
            r4 = r7
        L61:
            r3.createConstraints(r6, r2, r4)
            int r2 = r2 + 1
            goto L50
        L67:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r1 = r5.mChainList
            int r1 = r1.size()
            if (r1 <= 0) goto L7a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r1 = r5.mChainList
            java.lang.Object r1 = r1.get(r7)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r1 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r1
            r1.createConstraints(r6, r7, r0)
        L7a:
            r5.needsCallbackFromSolver(r7)
            return
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(androidx.constraintlayout.core.widgets.ConstraintWidget r1, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> r2) {
            r0 = this;
            super.copy(r1, r2)
            androidx.constraintlayout.core.widgets.Flow r1 = (androidx.constraintlayout.core.widgets.Flow) r1
            int r2 = r1.mHorizontalStyle
            r0.mHorizontalStyle = r2
            int r2 = r1.mVerticalStyle
            r0.mVerticalStyle = r2
            int r2 = r1.mFirstHorizontalStyle
            r0.mFirstHorizontalStyle = r2
            int r2 = r1.mFirstVerticalStyle
            r0.mFirstVerticalStyle = r2
            int r2 = r1.mLastHorizontalStyle
            r0.mLastHorizontalStyle = r2
            int r2 = r1.mLastVerticalStyle
            r0.mLastVerticalStyle = r2
            float r2 = r1.mHorizontalBias
            r0.mHorizontalBias = r2
            float r2 = r1.mVerticalBias
            r0.mVerticalBias = r2
            float r2 = r1.mFirstHorizontalBias
            r0.mFirstHorizontalBias = r2
            float r2 = r1.mFirstVerticalBias
            r0.mFirstVerticalBias = r2
            float r2 = r1.mLastHorizontalBias
            r0.mLastHorizontalBias = r2
            float r2 = r1.mLastVerticalBias
            r0.mLastVerticalBias = r2
            int r2 = r1.mHorizontalGap
            r0.mHorizontalGap = r2
            int r2 = r1.mVerticalGap
            r0.mVerticalGap = r2
            int r2 = r1.mHorizontalAlign
            r0.mHorizontalAlign = r2
            int r2 = r1.mVerticalAlign
            r0.mVerticalAlign = r2
            int r2 = r1.mWrapMode
            r0.mWrapMode = r2
            int r2 = r1.mMaxElementsWrap
            r0.mMaxElementsWrap = r2
            int r1 = r1.mOrientation
            r0.mOrientation = r1
            return
    }

    public float getMaxElementsWrap() {
            r1 = this;
            int r0 = r1.mMaxElementsWrap
            float r0 = (float) r0
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int r19, int r20, int r21, int r22) {
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            int r0 = r6.mWidgetsCount
            r11 = 0
            if (r0 <= 0) goto L1c
            boolean r0 = r18.measureChildren()
            if (r0 != 0) goto L1c
            r6.setMeasure(r11, r11)
            r6.needsCallbackFromSolver(r11)
            return
        L1c:
            int r12 = r18.getPaddingLeft()
            int r13 = r18.getPaddingRight()
            int r14 = r18.getPaddingTop()
            int r15 = r18.getPaddingBottom()
            r0 = 2
            int[] r5 = new int[r0]
            int r1 = r8 - r12
            int r1 = r1 - r13
            int r2 = r6.mOrientation
            r4 = 1
            if (r2 != r4) goto L3a
            int r1 = r10 - r14
            int r1 = r1 - r15
        L3a:
            r16 = r1
            r1 = -1
            if (r2 != 0) goto L4c
            int r2 = r6.mHorizontalStyle
            if (r2 != r1) goto L45
            r6.mHorizontalStyle = r11
        L45:
            int r2 = r6.mVerticalStyle
            if (r2 != r1) goto L58
            r6.mVerticalStyle = r11
            goto L58
        L4c:
            int r2 = r6.mHorizontalStyle
            if (r2 != r1) goto L52
            r6.mHorizontalStyle = r11
        L52:
            int r2 = r6.mVerticalStyle
            if (r2 != r1) goto L58
            r6.mVerticalStyle = r11
        L58:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r6.mWidgets
            r2 = r11
            r3 = r2
        L5c:
            int r11 = r6.mWidgetsCount
            r0 = 8
            if (r2 >= r11) goto L72
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r11 = r6.mWidgets
            r11 = r11[r2]
            int r11 = r11.getVisibility()
            if (r11 != r0) goto L6e
            int r3 = r3 + 1
        L6e:
            int r2 = r2 + 1
            r0 = 2
            goto L5c
        L72:
            int r2 = r6.mWidgetsCount
            if (r3 <= 0) goto L94
            int r1 = r6.mWidgetsCount
            int r1 = r1 - r3
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r2 = 0
            r3 = 0
        L7d:
            int r11 = r6.mWidgetsCount
            if (r2 >= r11) goto L93
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r11 = r6.mWidgets
            r11 = r11[r2]
            int r4 = r11.getVisibility()
            if (r4 == r0) goto L8f
            r1[r3] = r11
            int r3 = r3 + 1
        L8f:
            int r2 = r2 + 1
            r4 = 1
            goto L7d
        L93:
            r2 = r3
        L94:
            r6.mDisplayedWidgets = r1
            r6.mDisplayedWidgetsCount = r2
            int r0 = r6.mWrapMode
            if (r0 == 0) goto Ld1
            r4 = 1
            if (r0 == r4) goto Lc4
            r3 = 2
            if (r0 == r3) goto Lb7
            r3 = 3
            if (r0 == r3) goto Laa
            r11 = r4
            r17 = r5
        La8:
            r0 = 0
            goto Lde
        Laa:
            int r3 = r6.mOrientation
            r0 = r18
            r11 = r4
            r4 = r16
            r17 = r5
            r0.measureChainWrap_new(r1, r2, r3, r4, r5)
            goto La8
        Lb7:
            r11 = r4
            r17 = r5
            int r3 = r6.mOrientation
            r0 = r18
            r4 = r16
            r0.measureAligned(r1, r2, r3, r4, r5)
            goto La8
        Lc4:
            r11 = r4
            r17 = r5
            int r3 = r6.mOrientation
            r0 = r18
            r4 = r16
            r0.measureChainWrap(r1, r2, r3, r4, r5)
            goto La8
        Ld1:
            r17 = r5
            r11 = 1
            int r3 = r6.mOrientation
            r0 = r18
            r4 = r16
            r0.measureNoWrap(r1, r2, r3, r4, r5)
            goto La8
        Lde:
            r1 = r17[r0]
            int r1 = r1 + r12
            int r1 = r1 + r13
            r2 = r17[r11]
            int r2 = r2 + r14
            int r2 = r2 + r15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r7 != r4) goto Lee
            r1 = r8
            goto Lf9
        Lee:
            if (r7 != r3) goto Lf5
            int r1 = java.lang.Math.min(r1, r8)
            goto Lf9
        Lf5:
            if (r7 != 0) goto Lf8
            goto Lf9
        Lf8:
            r1 = r0
        Lf9:
            if (r9 != r4) goto Lfd
            r2 = r10
            goto L108
        Lfd:
            if (r9 != r3) goto L104
            int r2 = java.lang.Math.min(r2, r10)
            goto L108
        L104:
            if (r9 != 0) goto L107
            goto L108
        L107:
            r2 = r0
        L108:
            r6.setMeasure(r1, r2)
            r6.setWidth(r1)
            r6.setHeight(r2)
            int r1 = r6.mWidgetsCount
            if (r1 <= 0) goto L116
            goto L117
        L116:
            r11 = r0
        L117:
            r6.needsCallbackFromSolver(r11)
            return
    }

    public void setFirstHorizontalBias(float r1) {
            r0 = this;
            r0.mFirstHorizontalBias = r1
            return
    }

    public void setFirstHorizontalStyle(int r1) {
            r0 = this;
            r0.mFirstHorizontalStyle = r1
            return
    }

    public void setFirstVerticalBias(float r1) {
            r0 = this;
            r0.mFirstVerticalBias = r1
            return
    }

    public void setFirstVerticalStyle(int r1) {
            r0 = this;
            r0.mFirstVerticalStyle = r1
            return
    }

    public void setHorizontalAlign(int r1) {
            r0 = this;
            r0.mHorizontalAlign = r1
            return
    }

    public void setHorizontalBias(float r1) {
            r0 = this;
            r0.mHorizontalBias = r1
            return
    }

    public void setHorizontalGap(int r1) {
            r0 = this;
            r0.mHorizontalGap = r1
            return
    }

    public void setHorizontalStyle(int r1) {
            r0 = this;
            r0.mHorizontalStyle = r1
            return
    }

    public void setLastHorizontalBias(float r1) {
            r0 = this;
            r0.mLastHorizontalBias = r1
            return
    }

    public void setLastHorizontalStyle(int r1) {
            r0 = this;
            r0.mLastHorizontalStyle = r1
            return
    }

    public void setLastVerticalBias(float r1) {
            r0 = this;
            r0.mLastVerticalBias = r1
            return
    }

    public void setLastVerticalStyle(int r1) {
            r0 = this;
            r0.mLastVerticalStyle = r1
            return
    }

    public void setMaxElementsWrap(int r1) {
            r0 = this;
            r0.mMaxElementsWrap = r1
            return
    }

    public void setOrientation(int r1) {
            r0 = this;
            r0.mOrientation = r1
            return
    }

    public void setVerticalAlign(int r1) {
            r0 = this;
            r0.mVerticalAlign = r1
            return
    }

    public void setVerticalBias(float r1) {
            r0 = this;
            r0.mVerticalBias = r1
            return
    }

    public void setVerticalGap(int r1) {
            r0 = this;
            r0.mVerticalGap = r1
            return
    }

    public void setVerticalStyle(int r1) {
            r0 = this;
            r0.mVerticalStyle = r1
            return
    }

    public void setWrapMode(int r1) {
            r0 = this;
            r0.mWrapMode = r1
            return
    }
}
