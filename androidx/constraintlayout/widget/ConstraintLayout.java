package androidx.constraintlayout.widget;

/* loaded from: classes.dex */
public class ConstraintLayout extends android.view.ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final java.lang.String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final java.lang.String VERSION = "ConstraintLayout-2.1.4";
    private static androidx.constraintlayout.widget.SharedValues sSharedValues;
    android.util.SparseArray<android.view.View> mChildrenByIds;
    private java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> mConstraintHelpers;
    protected androidx.constraintlayout.widget.ConstraintLayoutStates mConstraintLayoutSpec;
    private androidx.constraintlayout.widget.ConstraintSet mConstraintSet;
    private int mConstraintSetId;
    private androidx.constraintlayout.widget.ConstraintsChangedListener mConstraintsChangedListener;
    private java.util.HashMap<java.lang.String, java.lang.Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected androidx.constraintlayout.core.widgets.ConstraintWidgetContainer mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    androidx.constraintlayout.widget.ConstraintLayout.Measurer mMeasurer;
    private androidx.constraintlayout.core.Metrics mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> mTempMapIdToWidget;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$1 */
    static /* synthetic */ class C01551 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour */
        static final /* synthetic */ int[] f58x6d00e4a2 = null;

        static {
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.widget.ConstraintLayout.C01551.f58x6d00e4a2 = r0
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.C01551.f58x6d00e4a2     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.C01551.f58x6d00e4a2     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.C01551.f58x6d00e4a2     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int CIRCLE = 8;
        public static final int END = 7;
        public static final int GONE_UNSET = Integer.MIN_VALUE;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
        public static final int WRAP_BEHAVIOR_INCLUDED = 0;
        public static final int WRAP_BEHAVIOR_SKIPPED = 3;
        public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
        public int baselineMargin;
        public int baselineToBaseline;
        public int baselineToBottom;
        public int baselineToTop;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public java.lang.String constraintTag;
        public java.lang.String dimensionRatio;
        int dimensionRatioSide;
        float dimensionRatioValue;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endToEnd;
        public int endToStart;
        public int goneBaselineMargin;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public boolean guidelineUseRtl;
        boolean heightSet;
        public boolean helped;
        public float horizontalBias;
        public int horizontalChainStyle;
        boolean horizontalDimensionFixed;
        public float horizontalWeight;
        boolean isGuideline;
        boolean isHelper;
        boolean isInPlaceholder;
        boolean isVirtualGroup;
        public int leftToLeft;
        public int leftToRight;
        public int matchConstraintDefaultHeight;
        public int matchConstraintDefaultWidth;
        public int matchConstraintMaxHeight;
        public int matchConstraintMaxWidth;
        public int matchConstraintMinHeight;
        public int matchConstraintMinWidth;
        public float matchConstraintPercentHeight;
        public float matchConstraintPercentWidth;
        boolean needsBaseline;
        public int orientation;
        int resolveGoneLeftMargin;
        int resolveGoneRightMargin;
        int resolvedGuideBegin;
        int resolvedGuideEnd;
        float resolvedGuidePercent;
        float resolvedHorizontalBias;
        int resolvedLeftToLeft;
        int resolvedLeftToRight;
        int resolvedRightToLeft;
        int resolvedRightToRight;
        public int rightToLeft;
        public int rightToRight;
        public int startToEnd;
        public int startToStart;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        boolean verticalDimensionFixed;
        public float verticalWeight;
        androidx.constraintlayout.core.widgets.ConstraintWidget widget;
        boolean widthSet;
        public int wrapBehaviorInParent;

        private static class Table {
            public static final int ANDROID_ORIENTATION = 1;
            public static final int GUIDELINE_USE_RTL = 67;
            public static final int LAYOUT_CONSTRAINED_HEIGHT = 28;
            public static final int LAYOUT_CONSTRAINED_WIDTH = 27;
            public static final int LAYOUT_CONSTRAINT_BASELINE_CREATOR = 43;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BASELINE_OF = 16;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF = 53;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF = 52;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_CREATOR = 42;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_BOTTOM_OF = 15;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_TOP_OF = 14;
            public static final int LAYOUT_CONSTRAINT_CIRCLE = 2;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_ANGLE = 4;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_RADIUS = 3;
            public static final int LAYOUT_CONSTRAINT_DIMENSION_RATIO = 44;
            public static final int LAYOUT_CONSTRAINT_END_TO_END_OF = 20;
            public static final int LAYOUT_CONSTRAINT_END_TO_START_OF = 19;
            public static final int LAYOUT_CONSTRAINT_GUIDE_BEGIN = 5;
            public static final int LAYOUT_CONSTRAINT_GUIDE_END = 6;
            public static final int LAYOUT_CONSTRAINT_GUIDE_PERCENT = 7;
            public static final int LAYOUT_CONSTRAINT_HEIGHT = 65;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_DEFAULT = 32;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MAX = 37;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MIN = 36;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_PERCENT = 38;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_BIAS = 29;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_CHAINSTYLE = 47;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_WEIGHT = 45;
            public static final int LAYOUT_CONSTRAINT_LEFT_CREATOR = 39;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_LEFT_OF = 8;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_RIGHT_OF = 9;
            public static final int LAYOUT_CONSTRAINT_RIGHT_CREATOR = 41;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_LEFT_OF = 10;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_RIGHT_OF = 11;
            public static final int LAYOUT_CONSTRAINT_START_TO_END_OF = 17;
            public static final int LAYOUT_CONSTRAINT_START_TO_START_OF = 18;
            public static final int LAYOUT_CONSTRAINT_TAG = 51;
            public static final int LAYOUT_CONSTRAINT_TOP_CREATOR = 40;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_BOTTOM_OF = 13;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_TOP_OF = 12;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_BIAS = 30;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE = 48;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_WEIGHT = 46;
            public static final int LAYOUT_CONSTRAINT_WIDTH = 64;
            public static final int LAYOUT_CONSTRAINT_WIDTH_DEFAULT = 31;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MAX = 34;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MIN = 33;
            public static final int LAYOUT_CONSTRAINT_WIDTH_PERCENT = 35;
            public static final int LAYOUT_EDITOR_ABSOLUTEX = 49;
            public static final int LAYOUT_EDITOR_ABSOLUTEY = 50;
            public static final int LAYOUT_GONE_MARGIN_BASELINE = 55;
            public static final int LAYOUT_GONE_MARGIN_BOTTOM = 24;
            public static final int LAYOUT_GONE_MARGIN_END = 26;
            public static final int LAYOUT_GONE_MARGIN_LEFT = 21;
            public static final int LAYOUT_GONE_MARGIN_RIGHT = 23;
            public static final int LAYOUT_GONE_MARGIN_START = 25;
            public static final int LAYOUT_GONE_MARGIN_TOP = 22;
            public static final int LAYOUT_MARGIN_BASELINE = 54;
            public static final int LAYOUT_WRAP_BEHAVIOR_IN_PARENT = 66;
            public static final int UNUSED = 0;
            public static final android.util.SparseIntArray map = null;

            static {
                    android.util.SparseIntArray r0 = new android.util.SparseIntArray
                    r0.<init>()
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.Table.map = r0
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintWidth
                    r2 = 64
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintHeight
                    r2 = 65
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf
                    r2 = 8
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf
                    r2 = 9
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf
                    r2 = 10
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf
                    r2 = 11
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf
                    r2 = 12
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf
                    r2 = 13
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf
                    r2 = 14
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf
                    r2 = 15
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf
                    r2 = 16
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf
                    r2 = 52
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf
                    r2 = 53
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintCircle
                    r2 = 2
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius
                    r2 = 3
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle
                    r2 = 4
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX
                    r2 = 49
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY
                    r2 = 50
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin
                    r2 = 5
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end
                    r2 = 6
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent
                    r2 = 7
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_guidelineUseRtl
                    r2 = 67
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_orientation
                    r2 = 1
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf
                    r2 = 17
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf
                    r2 = 18
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf
                    r2 = 19
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf
                    r2 = 20
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft
                    r2 = 21
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_goneMarginTop
                    r2 = 22
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_goneMarginRight
                    r2 = 23
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom
                    r2 = 24
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_goneMarginStart
                    r2 = 25
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd
                    r2 = 26
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_goneMarginBaseline
                    r2 = 55
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_marginBaseline
                    r2 = 54
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias
                    r2 = 29
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias
                    r2 = 30
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio
                    r2 = 44
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight
                    r2 = 45
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight
                    r2 = 46
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle
                    r2 = 47
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle
                    r2 = 48
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constrainedWidth
                    r2 = 27
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constrainedHeight
                    r2 = 28
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default
                    r2 = 31
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default
                    r2 = 32
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min
                    r2 = 33
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max
                    r2 = 34
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent
                    r2 = 35
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min
                    r2 = 36
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max
                    r2 = 37
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent
                    r2 = 38
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator
                    r2 = 39
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator
                    r2 = 40
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator
                    r2 = 41
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator
                    r2 = 42
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator
                    r2 = 43
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_constraintTag
                    r2 = 51
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_wrapBehaviorInParent
                    r2 = 66
                    r0.append(r1, r2)
                    return
            }

            private Table() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        public LayoutParams(int r7, int r8) {
                r6 = this;
                r6.<init>(r7, r8)
                r7 = -1
                r6.guideBegin = r7
                r6.guideEnd = r7
                r8 = -1082130432(0xffffffffbf800000, float:-1.0)
                r6.guidePercent = r8
                r0 = 1
                r6.guidelineUseRtl = r0
                r6.leftToLeft = r7
                r6.leftToRight = r7
                r6.rightToLeft = r7
                r6.rightToRight = r7
                r6.topToTop = r7
                r6.topToBottom = r7
                r6.bottomToTop = r7
                r6.bottomToBottom = r7
                r6.baselineToBaseline = r7
                r6.baselineToTop = r7
                r6.baselineToBottom = r7
                r6.circleConstraint = r7
                r1 = 0
                r6.circleRadius = r1
                r2 = 0
                r6.circleAngle = r2
                r6.startToEnd = r7
                r6.startToStart = r7
                r6.endToStart = r7
                r6.endToEnd = r7
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r6.goneLeftMargin = r3
                r6.goneTopMargin = r3
                r6.goneRightMargin = r3
                r6.goneBottomMargin = r3
                r6.goneStartMargin = r3
                r6.goneEndMargin = r3
                r6.goneBaselineMargin = r3
                r6.baselineMargin = r1
                r6.widthSet = r0
                r6.heightSet = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r6.horizontalBias = r4
                r6.verticalBias = r4
                r5 = 0
                r6.dimensionRatio = r5
                r6.dimensionRatioValue = r2
                r6.dimensionRatioSide = r0
                r6.horizontalWeight = r8
                r6.verticalWeight = r8
                r6.horizontalChainStyle = r1
                r6.verticalChainStyle = r1
                r6.matchConstraintDefaultWidth = r1
                r6.matchConstraintDefaultHeight = r1
                r6.matchConstraintMinWidth = r1
                r6.matchConstraintMinHeight = r1
                r6.matchConstraintMaxWidth = r1
                r6.matchConstraintMaxHeight = r1
                r8 = 1065353216(0x3f800000, float:1.0)
                r6.matchConstraintPercentWidth = r8
                r6.matchConstraintPercentHeight = r8
                r6.editorAbsoluteX = r7
                r6.editorAbsoluteY = r7
                r6.orientation = r7
                r6.constrainedWidth = r1
                r6.constrainedHeight = r1
                r6.constraintTag = r5
                r6.wrapBehaviorInParent = r1
                r6.horizontalDimensionFixed = r0
                r6.verticalDimensionFixed = r0
                r6.needsBaseline = r1
                r6.isGuideline = r1
                r6.isHelper = r1
                r6.isInPlaceholder = r1
                r6.isVirtualGroup = r1
                r6.resolvedLeftToLeft = r7
                r6.resolvedLeftToRight = r7
                r6.resolvedRightToLeft = r7
                r6.resolvedRightToRight = r7
                r6.resolveGoneLeftMargin = r3
                r6.resolveGoneRightMargin = r3
                r6.resolvedHorizontalBias = r4
                androidx.constraintlayout.core.widgets.ConstraintWidget r7 = new androidx.constraintlayout.core.widgets.ConstraintWidget
                r7.<init>()
                r6.widget = r7
                r6.helped = r1
                return
        }

        public LayoutParams(android.content.Context r11, android.util.AttributeSet r12) {
                r10 = this;
                r10.<init>(r11, r12)
                r0 = -1
                r10.guideBegin = r0
                r10.guideEnd = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10.guidePercent = r1
                r2 = 1
                r10.guidelineUseRtl = r2
                r10.leftToLeft = r0
                r10.leftToRight = r0
                r10.rightToLeft = r0
                r10.rightToRight = r0
                r10.topToTop = r0
                r10.topToBottom = r0
                r10.bottomToTop = r0
                r10.bottomToBottom = r0
                r10.baselineToBaseline = r0
                r10.baselineToTop = r0
                r10.baselineToBottom = r0
                r10.circleConstraint = r0
                r3 = 0
                r10.circleRadius = r3
                r4 = 0
                r10.circleAngle = r4
                r10.startToEnd = r0
                r10.startToStart = r0
                r10.endToStart = r0
                r10.endToEnd = r0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r10.goneLeftMargin = r5
                r10.goneTopMargin = r5
                r10.goneRightMargin = r5
                r10.goneBottomMargin = r5
                r10.goneStartMargin = r5
                r10.goneEndMargin = r5
                r10.goneBaselineMargin = r5
                r10.baselineMargin = r3
                r10.widthSet = r2
                r10.heightSet = r2
                r6 = 1056964608(0x3f000000, float:0.5)
                r10.horizontalBias = r6
                r10.verticalBias = r6
                r7 = 0
                r10.dimensionRatio = r7
                r10.dimensionRatioValue = r4
                r10.dimensionRatioSide = r2
                r10.horizontalWeight = r1
                r10.verticalWeight = r1
                r10.horizontalChainStyle = r3
                r10.verticalChainStyle = r3
                r10.matchConstraintDefaultWidth = r3
                r10.matchConstraintDefaultHeight = r3
                r10.matchConstraintMinWidth = r3
                r10.matchConstraintMinHeight = r3
                r10.matchConstraintMaxWidth = r3
                r10.matchConstraintMaxHeight = r3
                r1 = 1065353216(0x3f800000, float:1.0)
                r10.matchConstraintPercentWidth = r1
                r10.matchConstraintPercentHeight = r1
                r10.editorAbsoluteX = r0
                r10.editorAbsoluteY = r0
                r10.orientation = r0
                r10.constrainedWidth = r3
                r10.constrainedHeight = r3
                r10.constraintTag = r7
                r10.wrapBehaviorInParent = r3
                r10.horizontalDimensionFixed = r2
                r10.verticalDimensionFixed = r2
                r10.needsBaseline = r3
                r10.isGuideline = r3
                r10.isHelper = r3
                r10.isInPlaceholder = r3
                r10.isVirtualGroup = r3
                r10.resolvedLeftToLeft = r0
                r10.resolvedLeftToRight = r0
                r10.resolvedRightToLeft = r0
                r10.resolvedRightToRight = r0
                r10.resolveGoneLeftMargin = r5
                r10.resolveGoneRightMargin = r5
                r10.resolvedHorizontalBias = r6
                androidx.constraintlayout.core.widgets.ConstraintWidget r1 = new androidx.constraintlayout.core.widgets.ConstraintWidget
                r1.<init>()
                r10.widget = r1
                r10.helped = r3
                int[] r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout
                android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r1)
                int r12 = r11.getIndexCount()
                r1 = r3
            Lb0:
                if (r1 >= r12) goto L3a6
                int r5 = r11.getIndex(r1)
                android.util.SparseIntArray r6 = androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.Table.map
                int r6 = r6.get(r5)
                java.lang.String r7 = "ConstraintLayout"
                r8 = 2
                r9 = -2
                switch(r6) {
                    case 1: goto L39a;
                    case 2: goto L389;
                    case 3: goto L380;
                    case 4: goto L36b;
                    case 5: goto L362;
                    case 6: goto L359;
                    case 7: goto L350;
                    case 8: goto L33f;
                    case 9: goto L32e;
                    case 10: goto L31c;
                    case 11: goto L30a;
                    case 12: goto L2f8;
                    case 13: goto L2e6;
                    case 14: goto L2d4;
                    case 15: goto L2c2;
                    case 16: goto L2b0;
                    case 17: goto L29e;
                    case 18: goto L28c;
                    case 19: goto L27a;
                    case 20: goto L268;
                    case 21: goto L25e;
                    case 22: goto L254;
                    case 23: goto L24a;
                    case 24: goto L240;
                    case 25: goto L236;
                    case 26: goto L22c;
                    case 27: goto L222;
                    case 28: goto L218;
                    case 29: goto L20e;
                    case 30: goto L204;
                    case 31: goto L1f5;
                    case 32: goto L1e6;
                    case 33: goto L1d0;
                    case 34: goto L1ba;
                    case 35: goto L1aa;
                    case 36: goto L194;
                    case 37: goto L17e;
                    case 38: goto L16e;
                    default: goto Lc3;
                }
            Lc3:
                switch(r6) {
                    case 44: goto L165;
                    case 45: goto L15b;
                    case 46: goto L151;
                    case 47: goto L149;
                    case 48: goto L141;
                    case 49: goto L137;
                    case 50: goto L12d;
                    case 51: goto L125;
                    case 52: goto L113;
                    case 53: goto L101;
                    case 54: goto Lf7;
                    case 55: goto Led;
                    default: goto Lc6;
                }
            Lc6:
                switch(r6) {
                    case 64: goto Le6;
                    case 65: goto Ldf;
                    case 66: goto Ld5;
                    case 67: goto Lcb;
                    default: goto Lc9;
                }
            Lc9:
                goto L3a2
            Lcb:
                boolean r6 = r10.guidelineUseRtl
                boolean r5 = r11.getBoolean(r5, r6)
                r10.guidelineUseRtl = r5
                goto L3a2
            Ld5:
                int r6 = r10.wrapBehaviorInParent
                int r5 = r11.getInt(r5, r6)
                r10.wrapBehaviorInParent = r5
                goto L3a2
            Ldf:
                androidx.constraintlayout.widget.ConstraintSet.parseDimensionConstraints(r10, r11, r5, r2)
                r10.heightSet = r2
                goto L3a2
            Le6:
                androidx.constraintlayout.widget.ConstraintSet.parseDimensionConstraints(r10, r11, r5, r3)
                r10.widthSet = r2
                goto L3a2
            Led:
                int r6 = r10.goneBaselineMargin
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.goneBaselineMargin = r5
                goto L3a2
            Lf7:
                int r6 = r10.baselineMargin
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.baselineMargin = r5
                goto L3a2
            L101:
                int r6 = r10.baselineToBottom
                int r6 = r11.getResourceId(r5, r6)
                r10.baselineToBottom = r6
                if (r6 != r0) goto L3a2
                int r5 = r11.getInt(r5, r0)
                r10.baselineToBottom = r5
                goto L3a2
            L113:
                int r6 = r10.baselineToTop
                int r6 = r11.getResourceId(r5, r6)
                r10.baselineToTop = r6
                if (r6 != r0) goto L3a2
                int r5 = r11.getInt(r5, r0)
                r10.baselineToTop = r5
                goto L3a2
            L125:
                java.lang.String r5 = r11.getString(r5)
                r10.constraintTag = r5
                goto L3a2
            L12d:
                int r6 = r10.editorAbsoluteY
                int r5 = r11.getDimensionPixelOffset(r5, r6)
                r10.editorAbsoluteY = r5
                goto L3a2
            L137:
                int r6 = r10.editorAbsoluteX
                int r5 = r11.getDimensionPixelOffset(r5, r6)
                r10.editorAbsoluteX = r5
                goto L3a2
            L141:
                int r5 = r11.getInt(r5, r3)
                r10.verticalChainStyle = r5
                goto L3a2
            L149:
                int r5 = r11.getInt(r5, r3)
                r10.horizontalChainStyle = r5
                goto L3a2
            L151:
                float r6 = r10.verticalWeight
                float r5 = r11.getFloat(r5, r6)
                r10.verticalWeight = r5
                goto L3a2
            L15b:
                float r6 = r10.horizontalWeight
                float r5 = r11.getFloat(r5, r6)
                r10.horizontalWeight = r5
                goto L3a2
            L165:
                java.lang.String r5 = r11.getString(r5)
                androidx.constraintlayout.widget.ConstraintSet.parseDimensionRatioString(r10, r5)
                goto L3a2
            L16e:
                float r6 = r10.matchConstraintPercentHeight
                float r5 = r11.getFloat(r5, r6)
                float r5 = java.lang.Math.max(r4, r5)
                r10.matchConstraintPercentHeight = r5
                r10.matchConstraintDefaultHeight = r8
                goto L3a2
            L17e:
                int r6 = r10.matchConstraintMaxHeight     // Catch: java.lang.Exception -> L188
                int r6 = r11.getDimensionPixelSize(r5, r6)     // Catch: java.lang.Exception -> L188
                r10.matchConstraintMaxHeight = r6     // Catch: java.lang.Exception -> L188
                goto L3a2
            L188:
                int r6 = r10.matchConstraintMaxHeight
                int r5 = r11.getInt(r5, r6)
                if (r5 != r9) goto L3a2
                r10.matchConstraintMaxHeight = r9
                goto L3a2
            L194:
                int r6 = r10.matchConstraintMinHeight     // Catch: java.lang.Exception -> L19e
                int r6 = r11.getDimensionPixelSize(r5, r6)     // Catch: java.lang.Exception -> L19e
                r10.matchConstraintMinHeight = r6     // Catch: java.lang.Exception -> L19e
                goto L3a2
            L19e:
                int r6 = r10.matchConstraintMinHeight
                int r5 = r11.getInt(r5, r6)
                if (r5 != r9) goto L3a2
                r10.matchConstraintMinHeight = r9
                goto L3a2
            L1aa:
                float r6 = r10.matchConstraintPercentWidth
                float r5 = r11.getFloat(r5, r6)
                float r5 = java.lang.Math.max(r4, r5)
                r10.matchConstraintPercentWidth = r5
                r10.matchConstraintDefaultWidth = r8
                goto L3a2
            L1ba:
                int r6 = r10.matchConstraintMaxWidth     // Catch: java.lang.Exception -> L1c4
                int r6 = r11.getDimensionPixelSize(r5, r6)     // Catch: java.lang.Exception -> L1c4
                r10.matchConstraintMaxWidth = r6     // Catch: java.lang.Exception -> L1c4
                goto L3a2
            L1c4:
                int r6 = r10.matchConstraintMaxWidth
                int r5 = r11.getInt(r5, r6)
                if (r5 != r9) goto L3a2
                r10.matchConstraintMaxWidth = r9
                goto L3a2
            L1d0:
                int r6 = r10.matchConstraintMinWidth     // Catch: java.lang.Exception -> L1da
                int r6 = r11.getDimensionPixelSize(r5, r6)     // Catch: java.lang.Exception -> L1da
                r10.matchConstraintMinWidth = r6     // Catch: java.lang.Exception -> L1da
                goto L3a2
            L1da:
                int r6 = r10.matchConstraintMinWidth
                int r5 = r11.getInt(r5, r6)
                if (r5 != r9) goto L3a2
                r10.matchConstraintMinWidth = r9
                goto L3a2
            L1e6:
                int r5 = r11.getInt(r5, r3)
                r10.matchConstraintDefaultHeight = r5
                if (r5 != r2) goto L3a2
                java.lang.String r5 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                android.util.Log.e(r7, r5)
                goto L3a2
            L1f5:
                int r5 = r11.getInt(r5, r3)
                r10.matchConstraintDefaultWidth = r5
                if (r5 != r2) goto L3a2
                java.lang.String r5 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
                android.util.Log.e(r7, r5)
                goto L3a2
            L204:
                float r6 = r10.verticalBias
                float r5 = r11.getFloat(r5, r6)
                r10.verticalBias = r5
                goto L3a2
            L20e:
                float r6 = r10.horizontalBias
                float r5 = r11.getFloat(r5, r6)
                r10.horizontalBias = r5
                goto L3a2
            L218:
                boolean r6 = r10.constrainedHeight
                boolean r5 = r11.getBoolean(r5, r6)
                r10.constrainedHeight = r5
                goto L3a2
            L222:
                boolean r6 = r10.constrainedWidth
                boolean r5 = r11.getBoolean(r5, r6)
                r10.constrainedWidth = r5
                goto L3a2
            L22c:
                int r6 = r10.goneEndMargin
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.goneEndMargin = r5
                goto L3a2
            L236:
                int r6 = r10.goneStartMargin
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.goneStartMargin = r5
                goto L3a2
            L240:
                int r6 = r10.goneBottomMargin
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.goneBottomMargin = r5
                goto L3a2
            L24a:
                int r6 = r10.goneRightMargin
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.goneRightMargin = r5
                goto L3a2
            L254:
                int r6 = r10.goneTopMargin
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.goneTopMargin = r5
                goto L3a2
            L25e:
                int r6 = r10.goneLeftMargin
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.goneLeftMargin = r5
                goto L3a2
            L268:
                int r6 = r10.endToEnd
                int r6 = r11.getResourceId(r5, r6)
                r10.endToEnd = r6
                if (r6 != r0) goto L3a2
                int r5 = r11.getInt(r5, r0)
                r10.endToEnd = r5
                goto L3a2
            L27a:
                int r6 = r10.endToStart
                int r6 = r11.getResourceId(r5, r6)
                r10.endToStart = r6
                if (r6 != r0) goto L3a2
                int r5 = r11.getInt(r5, r0)
                r10.endToStart = r5
                goto L3a2
            L28c:
                int r6 = r10.startToStart
                int r6 = r11.getResourceId(r5, r6)
                r10.startToStart = r6
                if (r6 != r0) goto L3a2
                int r5 = r11.getInt(r5, r0)
                r10.startToStart = r5
                goto L3a2
            L29e:
                int r6 = r10.startToEnd
                int r6 = r11.getResourceId(r5, r6)
                r10.startToEnd = r6
                if (r6 != r0) goto L3a2
                int r5 = r11.getInt(r5, r0)
                r10.startToEnd = r5
                goto L3a2
            L2b0:
                int r6 = r10.baselineToBaseline
                int r6 = r11.getResourceId(r5, r6)
                r10.baselineToBaseline = r6
                if (r6 != r0) goto L3a2
                int r5 = r11.getInt(r5, r0)
                r10.baselineToBaseline = r5
                goto L3a2
            L2c2:
                int r6 = r10.bottomToBottom
                int r6 = r11.getResourceId(r5, r6)
                r10.bottomToBottom = r6
                if (r6 != r0) goto L3a2
                int r5 = r11.getInt(r5, r0)
                r10.bottomToBottom = r5
                goto L3a2
            L2d4:
                int r6 = r10.bottomToTop
                int r6 = r11.getResourceId(r5, r6)
                r10.bottomToTop = r6
                if (r6 != r0) goto L3a2
                int r5 = r11.getInt(r5, r0)
                r10.bottomToTop = r5
                goto L3a2
            L2e6:
                int r6 = r10.topToBottom
                int r6 = r11.getResourceId(r5, r6)
                r10.topToBottom = r6
                if (r6 != r0) goto L3a2
                int r5 = r11.getInt(r5, r0)
                r10.topToBottom = r5
                goto L3a2
            L2f8:
                int r6 = r10.topToTop
                int r6 = r11.getResourceId(r5, r6)
                r10.topToTop = r6
                if (r6 != r0) goto L3a2
                int r5 = r11.getInt(r5, r0)
                r10.topToTop = r5
                goto L3a2
            L30a:
                int r6 = r10.rightToRight
                int r6 = r11.getResourceId(r5, r6)
                r10.rightToRight = r6
                if (r6 != r0) goto L3a2
                int r5 = r11.getInt(r5, r0)
                r10.rightToRight = r5
                goto L3a2
            L31c:
                int r6 = r10.rightToLeft
                int r6 = r11.getResourceId(r5, r6)
                r10.rightToLeft = r6
                if (r6 != r0) goto L3a2
                int r5 = r11.getInt(r5, r0)
                r10.rightToLeft = r5
                goto L3a2
            L32e:
                int r6 = r10.leftToRight
                int r6 = r11.getResourceId(r5, r6)
                r10.leftToRight = r6
                if (r6 != r0) goto L3a2
                int r5 = r11.getInt(r5, r0)
                r10.leftToRight = r5
                goto L3a2
            L33f:
                int r6 = r10.leftToLeft
                int r6 = r11.getResourceId(r5, r6)
                r10.leftToLeft = r6
                if (r6 != r0) goto L3a2
                int r5 = r11.getInt(r5, r0)
                r10.leftToLeft = r5
                goto L3a2
            L350:
                float r6 = r10.guidePercent
                float r5 = r11.getFloat(r5, r6)
                r10.guidePercent = r5
                goto L3a2
            L359:
                int r6 = r10.guideEnd
                int r5 = r11.getDimensionPixelOffset(r5, r6)
                r10.guideEnd = r5
                goto L3a2
            L362:
                int r6 = r10.guideBegin
                int r5 = r11.getDimensionPixelOffset(r5, r6)
                r10.guideBegin = r5
                goto L3a2
            L36b:
                float r6 = r10.circleAngle
                float r5 = r11.getFloat(r5, r6)
                r6 = 1135869952(0x43b40000, float:360.0)
                float r5 = r5 % r6
                r10.circleAngle = r5
                int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r7 >= 0) goto L3a2
                float r5 = r6 - r5
                float r5 = r5 % r6
                r10.circleAngle = r5
                goto L3a2
            L380:
                int r6 = r10.circleRadius
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.circleRadius = r5
                goto L3a2
            L389:
                int r6 = r10.circleConstraint
                int r6 = r11.getResourceId(r5, r6)
                r10.circleConstraint = r6
                if (r6 != r0) goto L3a2
                int r5 = r11.getInt(r5, r0)
                r10.circleConstraint = r5
                goto L3a2
            L39a:
                int r6 = r10.orientation
                int r5 = r11.getInt(r5, r6)
                r10.orientation = r5
            L3a2:
                int r1 = r1 + 1
                goto Lb0
            L3a6:
                r11.recycle()
                r10.validate()
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r8) {
                r7 = this;
                r7.<init>(r8)
                r8 = -1
                r7.guideBegin = r8
                r7.guideEnd = r8
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r7.guidePercent = r0
                r1 = 1
                r7.guidelineUseRtl = r1
                r7.leftToLeft = r8
                r7.leftToRight = r8
                r7.rightToLeft = r8
                r7.rightToRight = r8
                r7.topToTop = r8
                r7.topToBottom = r8
                r7.bottomToTop = r8
                r7.bottomToBottom = r8
                r7.baselineToBaseline = r8
                r7.baselineToTop = r8
                r7.baselineToBottom = r8
                r7.circleConstraint = r8
                r2 = 0
                r7.circleRadius = r2
                r3 = 0
                r7.circleAngle = r3
                r7.startToEnd = r8
                r7.startToStart = r8
                r7.endToStart = r8
                r7.endToEnd = r8
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r7.goneLeftMargin = r4
                r7.goneTopMargin = r4
                r7.goneRightMargin = r4
                r7.goneBottomMargin = r4
                r7.goneStartMargin = r4
                r7.goneEndMargin = r4
                r7.goneBaselineMargin = r4
                r7.baselineMargin = r2
                r7.widthSet = r1
                r7.heightSet = r1
                r5 = 1056964608(0x3f000000, float:0.5)
                r7.horizontalBias = r5
                r7.verticalBias = r5
                r6 = 0
                r7.dimensionRatio = r6
                r7.dimensionRatioValue = r3
                r7.dimensionRatioSide = r1
                r7.horizontalWeight = r0
                r7.verticalWeight = r0
                r7.horizontalChainStyle = r2
                r7.verticalChainStyle = r2
                r7.matchConstraintDefaultWidth = r2
                r7.matchConstraintDefaultHeight = r2
                r7.matchConstraintMinWidth = r2
                r7.matchConstraintMinHeight = r2
                r7.matchConstraintMaxWidth = r2
                r7.matchConstraintMaxHeight = r2
                r0 = 1065353216(0x3f800000, float:1.0)
                r7.matchConstraintPercentWidth = r0
                r7.matchConstraintPercentHeight = r0
                r7.editorAbsoluteX = r8
                r7.editorAbsoluteY = r8
                r7.orientation = r8
                r7.constrainedWidth = r2
                r7.constrainedHeight = r2
                r7.constraintTag = r6
                r7.wrapBehaviorInParent = r2
                r7.horizontalDimensionFixed = r1
                r7.verticalDimensionFixed = r1
                r7.needsBaseline = r2
                r7.isGuideline = r2
                r7.isHelper = r2
                r7.isInPlaceholder = r2
                r7.isVirtualGroup = r2
                r7.resolvedLeftToLeft = r8
                r7.resolvedLeftToRight = r8
                r7.resolvedRightToLeft = r8
                r7.resolvedRightToRight = r8
                r7.resolveGoneLeftMargin = r4
                r7.resolveGoneRightMargin = r4
                r7.resolvedHorizontalBias = r5
                androidx.constraintlayout.core.widgets.ConstraintWidget r8 = new androidx.constraintlayout.core.widgets.ConstraintWidget
                r8.<init>()
                r7.widget = r8
                r7.helped = r2
                return
        }

        public LayoutParams(androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r9) {
                r8 = this;
                r8.<init>(r9)
                r0 = -1
                r8.guideBegin = r0
                r8.guideEnd = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r8.guidePercent = r1
                r2 = 1
                r8.guidelineUseRtl = r2
                r8.leftToLeft = r0
                r8.leftToRight = r0
                r8.rightToLeft = r0
                r8.rightToRight = r0
                r8.topToTop = r0
                r8.topToBottom = r0
                r8.bottomToTop = r0
                r8.bottomToBottom = r0
                r8.baselineToBaseline = r0
                r8.baselineToTop = r0
                r8.baselineToBottom = r0
                r8.circleConstraint = r0
                r3 = 0
                r8.circleRadius = r3
                r4 = 0
                r8.circleAngle = r4
                r8.startToEnd = r0
                r8.startToStart = r0
                r8.endToStart = r0
                r8.endToEnd = r0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r8.goneLeftMargin = r5
                r8.goneTopMargin = r5
                r8.goneRightMargin = r5
                r8.goneBottomMargin = r5
                r8.goneStartMargin = r5
                r8.goneEndMargin = r5
                r8.goneBaselineMargin = r5
                r8.baselineMargin = r3
                r8.widthSet = r2
                r8.heightSet = r2
                r6 = 1056964608(0x3f000000, float:0.5)
                r8.horizontalBias = r6
                r8.verticalBias = r6
                r7 = 0
                r8.dimensionRatio = r7
                r8.dimensionRatioValue = r4
                r8.dimensionRatioSide = r2
                r8.horizontalWeight = r1
                r8.verticalWeight = r1
                r8.horizontalChainStyle = r3
                r8.verticalChainStyle = r3
                r8.matchConstraintDefaultWidth = r3
                r8.matchConstraintDefaultHeight = r3
                r8.matchConstraintMinWidth = r3
                r8.matchConstraintMinHeight = r3
                r8.matchConstraintMaxWidth = r3
                r8.matchConstraintMaxHeight = r3
                r1 = 1065353216(0x3f800000, float:1.0)
                r8.matchConstraintPercentWidth = r1
                r8.matchConstraintPercentHeight = r1
                r8.editorAbsoluteX = r0
                r8.editorAbsoluteY = r0
                r8.orientation = r0
                r8.constrainedWidth = r3
                r8.constrainedHeight = r3
                r8.constraintTag = r7
                r8.wrapBehaviorInParent = r3
                r8.horizontalDimensionFixed = r2
                r8.verticalDimensionFixed = r2
                r8.needsBaseline = r3
                r8.isGuideline = r3
                r8.isHelper = r3
                r8.isInPlaceholder = r3
                r8.isVirtualGroup = r3
                r8.resolvedLeftToLeft = r0
                r8.resolvedLeftToRight = r0
                r8.resolvedRightToLeft = r0
                r8.resolvedRightToRight = r0
                r8.resolveGoneLeftMargin = r5
                r8.resolveGoneRightMargin = r5
                r8.resolvedHorizontalBias = r6
                androidx.constraintlayout.core.widgets.ConstraintWidget r0 = new androidx.constraintlayout.core.widgets.ConstraintWidget
                r0.<init>()
                r8.widget = r0
                r8.helped = r3
                int r0 = r9.guideBegin
                r8.guideBegin = r0
                int r0 = r9.guideEnd
                r8.guideEnd = r0
                float r0 = r9.guidePercent
                r8.guidePercent = r0
                boolean r0 = r9.guidelineUseRtl
                r8.guidelineUseRtl = r0
                int r0 = r9.leftToLeft
                r8.leftToLeft = r0
                int r0 = r9.leftToRight
                r8.leftToRight = r0
                int r0 = r9.rightToLeft
                r8.rightToLeft = r0
                int r0 = r9.rightToRight
                r8.rightToRight = r0
                int r0 = r9.topToTop
                r8.topToTop = r0
                int r0 = r9.topToBottom
                r8.topToBottom = r0
                int r0 = r9.bottomToTop
                r8.bottomToTop = r0
                int r0 = r9.bottomToBottom
                r8.bottomToBottom = r0
                int r0 = r9.baselineToBaseline
                r8.baselineToBaseline = r0
                int r0 = r9.baselineToTop
                r8.baselineToTop = r0
                int r0 = r9.baselineToBottom
                r8.baselineToBottom = r0
                int r0 = r9.circleConstraint
                r8.circleConstraint = r0
                int r0 = r9.circleRadius
                r8.circleRadius = r0
                float r0 = r9.circleAngle
                r8.circleAngle = r0
                int r0 = r9.startToEnd
                r8.startToEnd = r0
                int r0 = r9.startToStart
                r8.startToStart = r0
                int r0 = r9.endToStart
                r8.endToStart = r0
                int r0 = r9.endToEnd
                r8.endToEnd = r0
                int r0 = r9.goneLeftMargin
                r8.goneLeftMargin = r0
                int r0 = r9.goneTopMargin
                r8.goneTopMargin = r0
                int r0 = r9.goneRightMargin
                r8.goneRightMargin = r0
                int r0 = r9.goneBottomMargin
                r8.goneBottomMargin = r0
                int r0 = r9.goneStartMargin
                r8.goneStartMargin = r0
                int r0 = r9.goneEndMargin
                r8.goneEndMargin = r0
                int r0 = r9.goneBaselineMargin
                r8.goneBaselineMargin = r0
                int r0 = r9.baselineMargin
                r8.baselineMargin = r0
                float r0 = r9.horizontalBias
                r8.horizontalBias = r0
                float r0 = r9.verticalBias
                r8.verticalBias = r0
                java.lang.String r0 = r9.dimensionRatio
                r8.dimensionRatio = r0
                float r0 = r9.dimensionRatioValue
                r8.dimensionRatioValue = r0
                int r0 = r9.dimensionRatioSide
                r8.dimensionRatioSide = r0
                float r0 = r9.horizontalWeight
                r8.horizontalWeight = r0
                float r0 = r9.verticalWeight
                r8.verticalWeight = r0
                int r0 = r9.horizontalChainStyle
                r8.horizontalChainStyle = r0
                int r0 = r9.verticalChainStyle
                r8.verticalChainStyle = r0
                boolean r0 = r9.constrainedWidth
                r8.constrainedWidth = r0
                boolean r0 = r9.constrainedHeight
                r8.constrainedHeight = r0
                int r0 = r9.matchConstraintDefaultWidth
                r8.matchConstraintDefaultWidth = r0
                int r0 = r9.matchConstraintDefaultHeight
                r8.matchConstraintDefaultHeight = r0
                int r0 = r9.matchConstraintMinWidth
                r8.matchConstraintMinWidth = r0
                int r0 = r9.matchConstraintMaxWidth
                r8.matchConstraintMaxWidth = r0
                int r0 = r9.matchConstraintMinHeight
                r8.matchConstraintMinHeight = r0
                int r0 = r9.matchConstraintMaxHeight
                r8.matchConstraintMaxHeight = r0
                float r0 = r9.matchConstraintPercentWidth
                r8.matchConstraintPercentWidth = r0
                float r0 = r9.matchConstraintPercentHeight
                r8.matchConstraintPercentHeight = r0
                int r0 = r9.editorAbsoluteX
                r8.editorAbsoluteX = r0
                int r0 = r9.editorAbsoluteY
                r8.editorAbsoluteY = r0
                int r0 = r9.orientation
                r8.orientation = r0
                boolean r0 = r9.horizontalDimensionFixed
                r8.horizontalDimensionFixed = r0
                boolean r0 = r9.verticalDimensionFixed
                r8.verticalDimensionFixed = r0
                boolean r0 = r9.needsBaseline
                r8.needsBaseline = r0
                boolean r0 = r9.isGuideline
                r8.isGuideline = r0
                int r0 = r9.resolvedLeftToLeft
                r8.resolvedLeftToLeft = r0
                int r0 = r9.resolvedLeftToRight
                r8.resolvedLeftToRight = r0
                int r0 = r9.resolvedRightToLeft
                r8.resolvedRightToLeft = r0
                int r0 = r9.resolvedRightToRight
                r8.resolvedRightToRight = r0
                int r0 = r9.resolveGoneLeftMargin
                r8.resolveGoneLeftMargin = r0
                int r0 = r9.resolveGoneRightMargin
                r8.resolveGoneRightMargin = r0
                float r0 = r9.resolvedHorizontalBias
                r8.resolvedHorizontalBias = r0
                java.lang.String r0 = r9.constraintTag
                r8.constraintTag = r0
                int r0 = r9.wrapBehaviorInParent
                r8.wrapBehaviorInParent = r0
                androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
                r8.widget = r0
                boolean r0 = r9.widthSet
                r8.widthSet = r0
                boolean r9 = r9.heightSet
                r8.heightSet = r9
                return
        }

        public java.lang.String getConstraintTag() {
                r1 = this;
                java.lang.String r0 = r1.constraintTag
                return r0
        }

        public androidx.constraintlayout.core.widgets.ConstraintWidget getConstraintWidget() {
                r1 = this;
                androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
                return r0
        }

        public void reset() {
                r1 = this;
                androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
                if (r0 == 0) goto L7
                r0.reset()
            L7:
                return
        }

        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public void resolveLayoutDirection(int r11) {
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L11
                r11 = r3
                goto L12
            L11:
                r11 = r2
            L12:
                r4 = -1
                r10.resolvedRightToLeft = r4
                r10.resolvedRightToRight = r4
                r10.resolvedLeftToLeft = r4
                r10.resolvedLeftToRight = r4
                int r5 = r10.goneLeftMargin
                r10.resolveGoneLeftMargin = r5
                int r5 = r10.goneRightMargin
                r10.resolveGoneRightMargin = r5
                float r5 = r10.horizontalBias
                r10.resolvedHorizontalBias = r5
                int r6 = r10.guideBegin
                r10.resolvedGuideBegin = r6
                int r7 = r10.guideEnd
                r10.resolvedGuideEnd = r7
                float r8 = r10.guidePercent
                r10.resolvedGuidePercent = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L94
                int r11 = r10.startToEnd
                if (r11 == r4) goto L3f
                r10.resolvedRightToLeft = r11
            L3d:
                r2 = r3
                goto L46
            L3f:
                int r11 = r10.startToStart
                if (r11 == r4) goto L46
                r10.resolvedRightToRight = r11
                goto L3d
            L46:
                int r11 = r10.endToStart
                if (r11 == r4) goto L4d
                r10.resolvedLeftToRight = r11
                r2 = r3
            L4d:
                int r11 = r10.endToEnd
                if (r11 == r4) goto L54
                r10.resolvedLeftToLeft = r11
                r2 = r3
            L54:
                int r11 = r10.goneStartMargin
                if (r11 == r9) goto L5a
                r10.resolveGoneRightMargin = r11
            L5a:
                int r11 = r10.goneEndMargin
                if (r11 == r9) goto L60
                r10.resolveGoneLeftMargin = r11
            L60:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L68
                float r2 = r11 - r5
                r10.resolvedHorizontalBias = r2
            L68:
                boolean r2 = r10.isGuideline
                if (r2 == 0) goto Lb8
                int r2 = r10.orientation
                if (r2 != r3) goto Lb8
                boolean r2 = r10.guidelineUseRtl
                if (r2 == 0) goto Lb8
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L82
                float r11 = r11 - r8
                r10.resolvedGuidePercent = r11
                r10.resolvedGuideBegin = r4
                r10.resolvedGuideEnd = r4
                goto Lb8
            L82:
                if (r6 == r4) goto L8b
                r10.resolvedGuideEnd = r6
                r10.resolvedGuideBegin = r4
                r10.resolvedGuidePercent = r2
                goto Lb8
            L8b:
                if (r7 == r4) goto Lb8
                r10.resolvedGuideBegin = r7
                r10.resolvedGuideEnd = r4
                r10.resolvedGuidePercent = r2
                goto Lb8
            L94:
                int r11 = r10.startToEnd
                if (r11 == r4) goto L9a
                r10.resolvedLeftToRight = r11
            L9a:
                int r11 = r10.startToStart
                if (r11 == r4) goto La0
                r10.resolvedLeftToLeft = r11
            La0:
                int r11 = r10.endToStart
                if (r11 == r4) goto La6
                r10.resolvedRightToLeft = r11
            La6:
                int r11 = r10.endToEnd
                if (r11 == r4) goto Lac
                r10.resolvedRightToRight = r11
            Lac:
                int r11 = r10.goneStartMargin
                if (r11 == r9) goto Lb2
                r10.resolveGoneLeftMargin = r11
            Lb2:
                int r11 = r10.goneEndMargin
                if (r11 == r9) goto Lb8
                r10.resolveGoneRightMargin = r11
            Lb8:
                int r11 = r10.endToStart
                if (r11 != r4) goto L102
                int r11 = r10.endToEnd
                if (r11 != r4) goto L102
                int r11 = r10.startToStart
                if (r11 != r4) goto L102
                int r11 = r10.startToEnd
                if (r11 != r4) goto L102
                int r11 = r10.rightToLeft
                if (r11 == r4) goto Ld7
                r10.resolvedRightToLeft = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto Le5
                if (r1 <= 0) goto Le5
                r10.rightMargin = r1
                goto Le5
            Ld7:
                int r11 = r10.rightToRight
                if (r11 == r4) goto Le5
                r10.resolvedRightToRight = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto Le5
                if (r1 <= 0) goto Le5
                r10.rightMargin = r1
            Le5:
                int r11 = r10.leftToLeft
                if (r11 == r4) goto Lf4
                r10.resolvedLeftToLeft = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L102
                if (r0 <= 0) goto L102
                r10.leftMargin = r0
                goto L102
            Lf4:
                int r11 = r10.leftToRight
                if (r11 == r4) goto L102
                r10.resolvedLeftToRight = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L102
                if (r0 <= 0) goto L102
                r10.leftMargin = r0
            L102:
                return
        }

        public void setWidgetDebugName(java.lang.String r2) {
                r1 = this;
                androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
                r0.setDebugName(r2)
                return
        }

        public void validate() {
                r5 = this;
                r0 = 0
                r5.isGuideline = r0
                r1 = 1
                r5.horizontalDimensionFixed = r1
                r5.verticalDimensionFixed = r1
                int r2 = r5.width
                r3 = -2
                if (r2 != r3) goto L19
                boolean r2 = r5.constrainedWidth
                if (r2 == 0) goto L19
                r5.horizontalDimensionFixed = r0
                int r2 = r5.matchConstraintDefaultWidth
                if (r2 != 0) goto L19
                r5.matchConstraintDefaultWidth = r1
            L19:
                int r2 = r5.height
                if (r2 != r3) goto L29
                boolean r2 = r5.constrainedHeight
                if (r2 == 0) goto L29
                r5.verticalDimensionFixed = r0
                int r2 = r5.matchConstraintDefaultHeight
                if (r2 != 0) goto L29
                r5.matchConstraintDefaultHeight = r1
            L29:
                int r2 = r5.width
                r4 = -1
                if (r2 == 0) goto L32
                int r2 = r5.width
                if (r2 != r4) goto L40
            L32:
                r5.horizontalDimensionFixed = r0
                int r2 = r5.width
                if (r2 != 0) goto L40
                int r2 = r5.matchConstraintDefaultWidth
                if (r2 != r1) goto L40
                r5.width = r3
                r5.constrainedWidth = r1
            L40:
                int r2 = r5.height
                if (r2 == 0) goto L48
                int r2 = r5.height
                if (r2 != r4) goto L56
            L48:
                r5.verticalDimensionFixed = r0
                int r0 = r5.height
                if (r0 != 0) goto L56
                int r0 = r5.matchConstraintDefaultHeight
                if (r0 != r1) goto L56
                r5.height = r3
                r5.constrainedHeight = r1
            L56:
                float r0 = r5.guidePercent
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L66
                int r0 = r5.guideBegin
                if (r0 != r4) goto L66
                int r0 = r5.guideEnd
                if (r0 == r4) goto L82
            L66:
                r5.isGuideline = r1
                r5.horizontalDimensionFixed = r1
                r5.verticalDimensionFixed = r1
                androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
                boolean r0 = r0 instanceof androidx.constraintlayout.core.widgets.Guideline
                if (r0 != 0) goto L79
                androidx.constraintlayout.core.widgets.Guideline r0 = new androidx.constraintlayout.core.widgets.Guideline
                r0.<init>()
                r5.widget = r0
            L79:
                androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
                androidx.constraintlayout.core.widgets.Guideline r0 = (androidx.constraintlayout.core.widgets.Guideline) r0
                int r1 = r5.orientation
                r0.setOrientation(r1)
            L82:
                return
        }
    }

    class Measurer implements androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer {
        androidx.constraintlayout.widget.ConstraintLayout layout;
        int layoutHeightSpec;
        int layoutWidthSpec;
        int paddingBottom;
        int paddingHeight;
        int paddingTop;
        int paddingWidth;
        final /* synthetic */ androidx.constraintlayout.widget.ConstraintLayout this$0;

        public Measurer(androidx.constraintlayout.widget.ConstraintLayout r1, androidx.constraintlayout.widget.ConstraintLayout r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.layout = r2
                return
        }

        private boolean isSimilarSpec(int r4, int r5, int r6) {
                r3 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                int r1 = android.view.View.MeasureSpec.getMode(r4)
                android.view.View.MeasureSpec.getSize(r4)
                int r4 = android.view.View.MeasureSpec.getMode(r5)
                int r5 = android.view.View.MeasureSpec.getSize(r5)
                r2 = 1073741824(0x40000000, float:2.0)
                if (r4 != r2) goto L20
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r1 == r4) goto L1d
                if (r1 != 0) goto L20
            L1d:
                if (r6 != r5) goto L20
                return r0
            L20:
                r4 = 0
                return r4
        }

        public void captureLayoutInfo(int r1, int r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r0.paddingTop = r3
                r0.paddingBottom = r4
                r0.paddingWidth = r5
                r0.paddingHeight = r6
                r0.layoutWidthSpec = r1
                r0.layoutHeightSpec = r2
                return
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
        public final void didMeasures() {
                r5 = this;
                androidx.constraintlayout.widget.ConstraintLayout r0 = r5.layout
                int r0 = r0.getChildCount()
                r1 = 0
                r2 = r1
            L8:
                if (r2 >= r0) goto L1e
                androidx.constraintlayout.widget.ConstraintLayout r3 = r5.layout
                android.view.View r3 = r3.getChildAt(r2)
                boolean r4 = r3 instanceof androidx.constraintlayout.widget.Placeholder
                if (r4 == 0) goto L1b
                androidx.constraintlayout.widget.Placeholder r3 = (androidx.constraintlayout.widget.Placeholder) r3
                androidx.constraintlayout.widget.ConstraintLayout r4 = r5.layout
                r3.updatePostMeasure(r4)
            L1b:
                int r2 = r2 + 1
                goto L8
            L1e:
                androidx.constraintlayout.widget.ConstraintLayout r0 = r5.layout
                java.util.ArrayList r0 = androidx.constraintlayout.widget.ConstraintLayout.access$100(r0)
                int r0 = r0.size()
                if (r0 <= 0) goto L40
            L2a:
                if (r1 >= r0) goto L40
                androidx.constraintlayout.widget.ConstraintLayout r2 = r5.layout
                java.util.ArrayList r2 = androidx.constraintlayout.widget.ConstraintLayout.access$100(r2)
                java.lang.Object r2 = r2.get(r1)
                androidx.constraintlayout.widget.ConstraintHelper r2 = (androidx.constraintlayout.widget.ConstraintHelper) r2
                androidx.constraintlayout.widget.ConstraintLayout r3 = r5.layout
                r2.updatePostMeasure(r3)
                int r1 = r1 + 1
                goto L2a
            L40:
                return
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
        public final void measure(androidx.constraintlayout.core.widgets.ConstraintWidget r18, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure r19) {
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L9
                return
            L9:
                int r3 = r18.getVisibility()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L1f
                boolean r3 = r18.isInPlaceholder()
                if (r3 != 0) goto L1f
                r2.measuredWidth = r5
                r2.measuredHeight = r5
                r2.measuredBaseline = r5
                return
            L1f:
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r18.getParent()
                if (r3 != 0) goto L26
                return
            L26:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.horizontalBehavior
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r2.verticalBehavior
                int r6 = r2.horizontalDimension
                int r7 = r2.verticalDimension
                int r8 = r0.paddingTop
                int r9 = r0.paddingBottom
                int r8 = r8 + r9
                int r9 = r0.paddingWidth
                java.lang.Object r10 = r18.getCompanionWidget()
                android.view.View r10 = (android.view.View) r10
                int[] r11 = androidx.constraintlayout.widget.ConstraintLayout.C01551.f58x6d00e4a2
                int r12 = r3.ordinal()
                r11 = r11[r12]
                r12 = 4
                r13 = 3
                r14 = 2
                r5 = -2
                r15 = 1
                if (r11 == r15) goto Lb4
                if (r11 == r14) goto Lad
                if (r11 == r13) goto La0
                if (r11 == r12) goto L53
                r6 = 0
                goto Lba
            L53:
                int r6 = r0.layoutWidthSpec
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r5)
                int r9 = r1.mMatchConstraintDefaultWidth
                if (r9 != r15) goto L5f
                r9 = r15
                goto L60
            L5f:
                r9 = 0
            L60:
                int r11 = r2.measureStrategy
                int r12 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS
                if (r11 == r12) goto L6c
                int r11 = r2.measureStrategy
                int r12 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
                if (r11 != r12) goto Lba
            L6c:
                int r11 = r10.getMeasuredHeight()
                int r12 = r18.getHeight()
                if (r11 != r12) goto L78
                r11 = r15
                goto L79
            L78:
                r11 = 0
            L79:
                int r12 = r2.measureStrategy
                int r13 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
                if (r12 == r13) goto L92
                if (r9 == 0) goto L92
                if (r9 == 0) goto L85
                if (r11 != 0) goto L92
            L85:
                boolean r9 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r9 != 0) goto L92
                boolean r9 = r18.isResolvedHorizontally()
                if (r9 == 0) goto L90
                goto L92
            L90:
                r9 = 0
                goto L93
            L92:
                r9 = r15
            L93:
                if (r9 == 0) goto Lba
                int r6 = r18.getWidth()
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                goto Lba
            La0:
                int r6 = r0.layoutWidthSpec
                int r11 = r18.getHorizontalMargin()
                int r9 = r9 + r11
                r11 = -1
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r11)
                goto Lba
            Lad:
                int r6 = r0.layoutWidthSpec
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r5)
                goto Lba
            Lb4:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            Lba:
                int[] r9 = androidx.constraintlayout.widget.ConstraintLayout.C01551.f58x6d00e4a2
                int r11 = r4.ordinal()
                r9 = r9[r11]
                if (r9 == r15) goto L130
                if (r9 == r14) goto L129
                r7 = 3
                if (r9 == r7) goto L11c
                r7 = 4
                if (r9 == r7) goto Lcf
                r5 = 0
                goto L137
            Lcf:
                int r7 = r0.layoutHeightSpec
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r5)
                int r7 = r1.mMatchConstraintDefaultHeight
                if (r7 != r15) goto Ldb
                r7 = r15
                goto Ldc
            Ldb:
                r7 = 0
            Ldc:
                int r8 = r2.measureStrategy
                int r9 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS
                if (r8 == r9) goto Le8
                int r8 = r2.measureStrategy
                int r9 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
                if (r8 != r9) goto L137
            Le8:
                int r8 = r10.getMeasuredWidth()
                int r9 = r18.getWidth()
                if (r8 != r9) goto Lf4
                r8 = r15
                goto Lf5
            Lf4:
                r8 = 0
            Lf5:
                int r9 = r2.measureStrategy
                int r11 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
                if (r9 == r11) goto L10e
                if (r7 == 0) goto L10e
                if (r7 == 0) goto L101
                if (r8 != 0) goto L10e
            L101:
                boolean r7 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r7 != 0) goto L10e
                boolean r7 = r18.isResolvedVertically()
                if (r7 == 0) goto L10c
                goto L10e
            L10c:
                r7 = 0
                goto L10f
            L10e:
                r7 = r15
            L10f:
                if (r7 == 0) goto L137
                int r5 = r18.getHeight()
                r7 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
                goto L137
            L11c:
                int r5 = r0.layoutHeightSpec
                int r7 = r18.getVerticalMargin()
                int r8 = r8 + r7
                r7 = -1
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r8, r7)
                goto L137
            L129:
                int r7 = r0.layoutHeightSpec
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r5)
                goto L137
            L130:
                r5 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                r5 = r7
            L137:
                androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r18.getParent()
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r7
                if (r7 == 0) goto L1b9
                androidx.constraintlayout.widget.ConstraintLayout r8 = r0.this$0
                int r8 = androidx.constraintlayout.widget.ConstraintLayout.access$000(r8)
                r9 = 256(0x100, float:3.59E-43)
                boolean r8 = androidx.constraintlayout.core.widgets.Optimizer.enabled(r8, r9)
                if (r8 == 0) goto L1b9
                int r8 = r10.getMeasuredWidth()
                int r9 = r18.getWidth()
                if (r8 != r9) goto L1b9
                int r8 = r10.getMeasuredWidth()
                int r9 = r7.getWidth()
                if (r8 >= r9) goto L1b9
                int r8 = r10.getMeasuredHeight()
                int r9 = r18.getHeight()
                if (r8 != r9) goto L1b9
                int r8 = r10.getMeasuredHeight()
                int r7 = r7.getHeight()
                if (r8 >= r7) goto L1b9
                int r7 = r10.getBaseline()
                int r8 = r18.getBaselineDistance()
                if (r7 != r8) goto L1b9
                boolean r7 = r18.isMeasureRequested()
                if (r7 != 0) goto L1b9
                int r7 = r18.getLastHorizontalMeasureSpec()
                int r8 = r18.getWidth()
                boolean r7 = r0.isSimilarSpec(r7, r6, r8)
                if (r7 == 0) goto L1a3
                int r7 = r18.getLastVerticalMeasureSpec()
                int r8 = r18.getHeight()
                boolean r7 = r0.isSimilarSpec(r7, r5, r8)
                if (r7 == 0) goto L1a3
                r7 = r15
                goto L1a4
            L1a3:
                r7 = 0
            L1a4:
                if (r7 == 0) goto L1b9
                int r3 = r18.getWidth()
                r2.measuredWidth = r3
                int r3 = r18.getHeight()
                r2.measuredHeight = r3
                int r1 = r18.getBaselineDistance()
                r2.measuredBaseline = r1
                return
            L1b9:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r3 != r7) goto L1bf
                r7 = r15
                goto L1c0
            L1bf:
                r7 = 0
            L1c0:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r4 != r8) goto L1c6
                r8 = r15
                goto L1c7
            L1c6:
                r8 = 0
            L1c7:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
                if (r4 == r9) goto L1d2
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r4 != r9) goto L1d0
                goto L1d2
            L1d0:
                r4 = 0
                goto L1d3
            L1d2:
                r4 = r15
            L1d3:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
                if (r3 == r9) goto L1de
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r3 != r9) goto L1dc
                goto L1de
            L1dc:
                r3 = 0
                goto L1df
            L1de:
                r3 = r15
            L1df:
                r9 = 0
                if (r7 == 0) goto L1ea
                float r11 = r1.mDimensionRatio
                int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r11 <= 0) goto L1ea
                r11 = r15
                goto L1eb
            L1ea:
                r11 = 0
            L1eb:
                if (r8 == 0) goto L1f5
                float r12 = r1.mDimensionRatio
                int r9 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
                if (r9 <= 0) goto L1f5
                r9 = r15
                goto L1f6
            L1f5:
                r9 = 0
            L1f6:
                if (r10 != 0) goto L1f9
                return
            L1f9:
                android.view.ViewGroup$LayoutParams r12 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r12 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r12
                int r13 = r2.measureStrategy
                int r14 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS
                if (r13 == r14) goto L21e
                int r13 = r2.measureStrategy
                int r14 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
                if (r13 == r14) goto L21e
                if (r7 == 0) goto L21e
                int r7 = r1.mMatchConstraintDefaultWidth
                if (r7 != 0) goto L21e
                if (r8 == 0) goto L21e
                int r7 = r1.mMatchConstraintDefaultHeight
                if (r7 == 0) goto L218
                goto L21e
            L218:
                r0 = -1
                r13 = 0
                r14 = 0
                r15 = 0
                goto L2c1
            L21e:
                boolean r7 = r10 instanceof androidx.constraintlayout.widget.VirtualLayout
                if (r7 == 0) goto L230
                boolean r7 = r1 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
                if (r7 == 0) goto L230
                r7 = r1
                androidx.constraintlayout.core.widgets.VirtualLayout r7 = (androidx.constraintlayout.core.widgets.VirtualLayout) r7
                r8 = r10
                androidx.constraintlayout.widget.VirtualLayout r8 = (androidx.constraintlayout.widget.VirtualLayout) r8
                r8.onMeasure(r7, r6, r5)
                goto L233
            L230:
                r10.measure(r6, r5)
            L233:
                r1.setLastMeasureSpec(r6, r5)
                int r7 = r10.getMeasuredWidth()
                int r8 = r10.getMeasuredHeight()
                int r13 = r10.getBaseline()
                int r14 = r1.mMatchConstraintMinWidth
                if (r14 <= 0) goto L24d
                int r14 = r1.mMatchConstraintMinWidth
                int r14 = java.lang.Math.max(r14, r7)
                goto L24e
            L24d:
                r14 = r7
            L24e:
                int r15 = r1.mMatchConstraintMaxWidth
                if (r15 <= 0) goto L258
                int r15 = r1.mMatchConstraintMaxWidth
                int r14 = java.lang.Math.min(r15, r14)
            L258:
                int r15 = r1.mMatchConstraintMinHeight
                if (r15 <= 0) goto L265
                int r15 = r1.mMatchConstraintMinHeight
                int r15 = java.lang.Math.max(r15, r8)
                r16 = r5
                goto L268
            L265:
                r16 = r5
                r15 = r8
            L268:
                int r5 = r1.mMatchConstraintMaxHeight
                if (r5 <= 0) goto L272
                int r5 = r1.mMatchConstraintMaxHeight
                int r15 = java.lang.Math.min(r5, r15)
            L272:
                androidx.constraintlayout.widget.ConstraintLayout r5 = r0.this$0
                int r5 = androidx.constraintlayout.widget.ConstraintLayout.access$000(r5)
                r0 = 1
                boolean r5 = androidx.constraintlayout.core.widgets.Optimizer.enabled(r5, r0)
                if (r5 != 0) goto L296
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r11 == 0) goto L28c
                if (r4 == 0) goto L28c
                float r3 = r1.mDimensionRatio
                float r4 = (float) r15
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r14 = (int) r4
                goto L296
            L28c:
                if (r9 == 0) goto L296
                if (r3 == 0) goto L296
                float r3 = r1.mDimensionRatio
                float r4 = (float) r14
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r15 = (int) r4
            L296:
                if (r7 != r14) goto L29d
                if (r8 == r15) goto L29b
                goto L29d
            L29b:
                r0 = -1
                goto L2c1
            L29d:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r7 == r14) goto L2a5
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r0)
            L2a5:
                if (r8 == r15) goto L2ac
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
                goto L2ae
            L2ac:
                r5 = r16
            L2ae:
                r10.measure(r6, r5)
                r1.setLastMeasureSpec(r6, r5)
                int r14 = r10.getMeasuredWidth()
                int r15 = r10.getMeasuredHeight()
                int r13 = r10.getBaseline()
                goto L29b
            L2c1:
                if (r13 == r0) goto L2c5
                r0 = 1
                goto L2c6
            L2c5:
                r0 = 0
            L2c6:
                int r3 = r2.horizontalDimension
                if (r14 != r3) goto L2d1
                int r3 = r2.verticalDimension
                if (r15 == r3) goto L2cf
                goto L2d1
            L2cf:
                r5 = 0
                goto L2d2
            L2d1:
                r5 = 1
            L2d2:
                r2.measuredNeedsSolverPass = r5
                boolean r3 = r12.needsBaseline
                if (r3 == 0) goto L2d9
                r0 = 1
            L2d9:
                if (r0 == 0) goto L2e7
                r3 = -1
                if (r13 == r3) goto L2e7
                int r1 = r18.getBaselineDistance()
                if (r1 == r13) goto L2e7
                r1 = 1
                r2.measuredNeedsSolverPass = r1
            L2e7:
                r2.measuredWidth = r14
                r2.measuredHeight = r15
                r2.measuredHasBaseline = r0
                r2.measuredBaseline = r13
                return
        }
    }

    static {
            return
    }

    public ConstraintLayout(android.content.Context r4) {
            r3 = this;
            r3.<init>(r4)
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r3.mChildrenByIds = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 4
            r4.<init>(r0)
            r3.mConstraintHelpers = r4
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            r4.<init>()
            r3.mLayoutWidget = r4
            r4 = 0
            r3.mMinWidth = r4
            r3.mMinHeight = r4
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.mMaxWidth = r0
            r3.mMaxHeight = r0
            r0 = 1
            r3.mDirtyHierarchy = r0
            r0 = 257(0x101, float:3.6E-43)
            r3.mOptimizationLevel = r0
            r0 = 0
            r3.mConstraintSet = r0
            r3.mConstraintLayoutSpec = r0
            r1 = -1
            r3.mConstraintSetId = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.mDesignIds = r2
            r3.mLastMeasureWidth = r1
            r3.mLastMeasureHeight = r1
            r3.mLastMeasureWidthSize = r1
            r3.mLastMeasureHeightSize = r1
            r3.mLastMeasureWidthMode = r4
            r3.mLastMeasureHeightMode = r4
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r3.mTempMapIdToWidget = r1
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r1 = new androidx.constraintlayout.widget.ConstraintLayout$Measurer
            r1.<init>(r3, r3)
            r3.mMeasurer = r1
            r3.mOnMeasureWidthMeasureSpec = r4
            r3.mOnMeasureHeightMeasureSpec = r4
            r3.init(r0, r4, r4)
            return
    }

    public ConstraintLayout(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.mChildrenByIds = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 4
            r3.<init>(r0)
            r2.mConstraintHelpers = r3
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            r3.<init>()
            r2.mLayoutWidget = r3
            r3 = 0
            r2.mMinWidth = r3
            r2.mMinHeight = r3
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.mMaxWidth = r0
            r2.mMaxHeight = r0
            r0 = 1
            r2.mDirtyHierarchy = r0
            r0 = 257(0x101, float:3.6E-43)
            r2.mOptimizationLevel = r0
            r0 = 0
            r2.mConstraintSet = r0
            r2.mConstraintLayoutSpec = r0
            r0 = -1
            r2.mConstraintSetId = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mDesignIds = r1
            r2.mLastMeasureWidth = r0
            r2.mLastMeasureHeight = r0
            r2.mLastMeasureWidthSize = r0
            r2.mLastMeasureHeightSize = r0
            r2.mLastMeasureWidthMode = r3
            r2.mLastMeasureHeightMode = r3
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.mTempMapIdToWidget = r0
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r0 = new androidx.constraintlayout.widget.ConstraintLayout$Measurer
            r0.<init>(r2, r2)
            r2.mMeasurer = r0
            r2.mOnMeasureWidthMeasureSpec = r3
            r2.mOnMeasureHeightMeasureSpec = r3
            r2.init(r4, r3, r3)
            return
    }

    public ConstraintLayout(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.mChildrenByIds = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 4
            r3.<init>(r0)
            r2.mConstraintHelpers = r3
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            r3.<init>()
            r2.mLayoutWidget = r3
            r3 = 0
            r2.mMinWidth = r3
            r2.mMinHeight = r3
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.mMaxWidth = r0
            r2.mMaxHeight = r0
            r0 = 1
            r2.mDirtyHierarchy = r0
            r0 = 257(0x101, float:3.6E-43)
            r2.mOptimizationLevel = r0
            r0 = 0
            r2.mConstraintSet = r0
            r2.mConstraintLayoutSpec = r0
            r0 = -1
            r2.mConstraintSetId = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mDesignIds = r1
            r2.mLastMeasureWidth = r0
            r2.mLastMeasureHeight = r0
            r2.mLastMeasureWidthSize = r0
            r2.mLastMeasureHeightSize = r0
            r2.mLastMeasureWidthMode = r3
            r2.mLastMeasureHeightMode = r3
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.mTempMapIdToWidget = r0
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r0 = new androidx.constraintlayout.widget.ConstraintLayout$Measurer
            r0.<init>(r2, r2)
            r2.mMeasurer = r0
            r2.mOnMeasureWidthMeasureSpec = r3
            r2.mOnMeasureHeightMeasureSpec = r3
            r2.init(r4, r5, r3)
            return
    }

    public ConstraintLayout(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>(r3, r4, r5, r6)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.mChildrenByIds = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 4
            r3.<init>(r0)
            r2.mConstraintHelpers = r3
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            r3.<init>()
            r2.mLayoutWidget = r3
            r3 = 0
            r2.mMinWidth = r3
            r2.mMinHeight = r3
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.mMaxWidth = r0
            r2.mMaxHeight = r0
            r0 = 1
            r2.mDirtyHierarchy = r0
            r0 = 257(0x101, float:3.6E-43)
            r2.mOptimizationLevel = r0
            r0 = 0
            r2.mConstraintSet = r0
            r2.mConstraintLayoutSpec = r0
            r0 = -1
            r2.mConstraintSetId = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mDesignIds = r1
            r2.mLastMeasureWidth = r0
            r2.mLastMeasureHeight = r0
            r2.mLastMeasureWidthSize = r0
            r2.mLastMeasureHeightSize = r0
            r2.mLastMeasureWidthMode = r3
            r2.mLastMeasureHeightMode = r3
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.mTempMapIdToWidget = r0
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r0 = new androidx.constraintlayout.widget.ConstraintLayout$Measurer
            r0.<init>(r2, r2)
            r2.mMeasurer = r0
            r2.mOnMeasureWidthMeasureSpec = r3
            r2.mOnMeasureHeightMeasureSpec = r3
            r2.init(r4, r5, r6)
            return
    }

    static /* synthetic */ int access$000(androidx.constraintlayout.widget.ConstraintLayout r0) {
            int r0 = r0.mOptimizationLevel
            return r0
    }

    static /* synthetic */ java.util.ArrayList access$100(androidx.constraintlayout.widget.ConstraintLayout r0) {
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r0 = r0.mConstraintHelpers
            return r0
    }

    private int getPaddingWidth() {
            r4 = this;
            int r0 = r4.getPaddingLeft()
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r4.getPaddingRight()
            int r2 = java.lang.Math.max(r1, r2)
            int r0 = r0 + r2
            int r2 = r4.getPaddingStart()
            int r2 = java.lang.Math.max(r1, r2)
            int r3 = r4.getPaddingEnd()
            int r1 = java.lang.Math.max(r1, r3)
            int r2 = r2 + r1
            if (r2 <= 0) goto L26
            r0 = r2
        L26:
            return r0
    }

    public static androidx.constraintlayout.widget.SharedValues getSharedValues() {
            androidx.constraintlayout.widget.SharedValues r0 = androidx.constraintlayout.widget.ConstraintLayout.sSharedValues
            if (r0 != 0) goto Lb
            androidx.constraintlayout.widget.SharedValues r0 = new androidx.constraintlayout.widget.SharedValues
            r0.<init>()
            androidx.constraintlayout.widget.ConstraintLayout.sSharedValues = r0
        Lb:
            androidx.constraintlayout.widget.SharedValues r0 = androidx.constraintlayout.widget.ConstraintLayout.sSharedValues
            return r0
    }

    private final androidx.constraintlayout.core.widgets.ConstraintWidget getTargetWidget(int r2) {
            r1 = this;
            if (r2 != 0) goto L5
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r2 = r1.mLayoutWidget
            return r2
        L5:
            android.util.SparseArray<android.view.View> r0 = r1.mChildrenByIds
            java.lang.Object r0 = r0.get(r2)
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L20
            android.view.View r0 = r1.findViewById(r2)
            if (r0 == 0) goto L20
            if (r0 == r1) goto L20
            android.view.ViewParent r2 = r0.getParent()
            if (r2 != r1) goto L20
            r1.onViewAdded(r0)
        L20:
            if (r0 != r1) goto L25
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r2 = r1.mLayoutWidget
            return r2
        L25:
            if (r0 != 0) goto L29
            r2 = 0
            goto L31
        L29:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.widget
        L31:
            return r2
    }

    private void init(android.util.AttributeSet r6, int r7, int r8) {
            r5 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r5.mLayoutWidget
            r0.setCompanionWidget(r5)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r5.mLayoutWidget
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r1 = r5.mMeasurer
            r0.setMeasurer(r1)
            android.util.SparseArray<android.view.View> r0 = r5.mChildrenByIds
            int r1 = r5.getId()
            r0.put(r1, r5)
            r0 = 0
            r5.mConstraintSet = r0
            if (r6 == 0) goto La3
            android.content.Context r1 = r5.getContext()
            int[] r2 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout
            android.content.res.TypedArray r6 = r1.obtainStyledAttributes(r6, r2, r7, r8)
            int r7 = r6.getIndexCount()
            r8 = 0
            r1 = r8
        L2a:
            if (r1 >= r7) goto La0
            int r2 = r6.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_minWidth
            if (r2 != r3) goto L3d
            int r3 = r5.mMinWidth
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.mMinWidth = r2
            goto L9d
        L3d:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_minHeight
            if (r2 != r3) goto L4a
            int r3 = r5.mMinHeight
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.mMinHeight = r2
            goto L9d
        L4a:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_maxWidth
            if (r2 != r3) goto L57
            int r3 = r5.mMaxWidth
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.mMaxWidth = r2
            goto L9d
        L57:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_maxHeight
            if (r2 != r3) goto L64
            int r3 = r5.mMaxHeight
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.mMaxHeight = r2
            goto L9d
        L64:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layout_optimizationLevel
            if (r2 != r3) goto L71
            int r3 = r5.mOptimizationLevel
            int r2 = r6.getInt(r2, r3)
            r5.mOptimizationLevel = r2
            goto L9d
        L71:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_layoutDescription
            if (r2 != r3) goto L82
            int r2 = r6.getResourceId(r2, r8)
            if (r2 == 0) goto L9d
            r5.parseLayoutDescription(r2)     // Catch: android.content.res.Resources.NotFoundException -> L7f
            goto L9d
        L7f:
            r5.mConstraintLayoutSpec = r0
            goto L9d
        L82:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_constraintSet
            if (r2 != r3) goto L9d
            int r2 = r6.getResourceId(r2, r8)
            androidx.constraintlayout.widget.ConstraintSet r3 = new androidx.constraintlayout.widget.ConstraintSet     // Catch: android.content.res.Resources.NotFoundException -> L99
            r3.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L99
            r5.mConstraintSet = r3     // Catch: android.content.res.Resources.NotFoundException -> L99
            android.content.Context r4 = r5.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L99
            r3.load(r4, r2)     // Catch: android.content.res.Resources.NotFoundException -> L99
            goto L9b
        L99:
            r5.mConstraintSet = r0
        L9b:
            r5.mConstraintSetId = r2
        L9d:
            int r1 = r1 + 1
            goto L2a
        La0:
            r6.recycle()
        La3:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r5.mLayoutWidget
            int r7 = r5.mOptimizationLevel
            r6.setOptimizationLevel(r7)
            return
    }

    private void markHierarchyDirty() {
            r1 = this;
            r0 = 1
            r1.mDirtyHierarchy = r0
            r0 = -1
            r1.mLastMeasureWidth = r0
            r1.mLastMeasureHeight = r0
            r1.mLastMeasureWidthSize = r0
            r1.mLastMeasureHeightSize = r0
            r0 = 0
            r1.mLastMeasureWidthMode = r0
            r1.mLastMeasureHeightMode = r0
            return
    }

    private void setChildrenConstraints() {
            r9 = this;
            boolean r6 = r9.isInEditMode()
            int r7 = r9.getChildCount()
            r0 = 0
            r1 = r0
        La:
            if (r1 >= r7) goto L1d
            android.view.View r2 = r9.getChildAt(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.getViewWidget(r2)
            if (r2 != 0) goto L17
            goto L1a
        L17:
            r2.reset()
        L1a:
            int r1 = r1 + 1
            goto La
        L1d:
            r1 = -1
            if (r6 == 0) goto L5a
            r2 = r0
        L21:
            if (r2 >= r7) goto L5a
            android.view.View r3 = r9.getChildAt(r2)
            android.content.res.Resources r4 = r9.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L57
            int r5 = r3.getId()     // Catch: android.content.res.Resources.NotFoundException -> L57
            java.lang.String r4 = r4.getResourceName(r5)     // Catch: android.content.res.Resources.NotFoundException -> L57
            int r5 = r3.getId()     // Catch: android.content.res.Resources.NotFoundException -> L57
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: android.content.res.Resources.NotFoundException -> L57
            r9.setDesignInformation(r0, r4, r5)     // Catch: android.content.res.Resources.NotFoundException -> L57
            r5 = 47
            int r5 = r4.indexOf(r5)     // Catch: android.content.res.Resources.NotFoundException -> L57
            if (r5 == r1) goto L4c
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)     // Catch: android.content.res.Resources.NotFoundException -> L57
        L4c:
            int r3 = r3.getId()     // Catch: android.content.res.Resources.NotFoundException -> L57
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r9.getTargetWidget(r3)     // Catch: android.content.res.Resources.NotFoundException -> L57
            r3.setDebugName(r4)     // Catch: android.content.res.Resources.NotFoundException -> L57
        L57:
            int r2 = r2 + 1
            goto L21
        L5a:
            int r2 = r9.mConstraintSetId
            if (r2 == r1) goto L7c
            r1 = r0
        L5f:
            if (r1 >= r7) goto L7c
            android.view.View r2 = r9.getChildAt(r1)
            int r3 = r2.getId()
            int r4 = r9.mConstraintSetId
            if (r3 != r4) goto L79
            boolean r3 = r2 instanceof androidx.constraintlayout.widget.Constraints
            if (r3 == 0) goto L79
            androidx.constraintlayout.widget.Constraints r2 = (androidx.constraintlayout.widget.Constraints) r2
            androidx.constraintlayout.widget.ConstraintSet r2 = r2.getConstraintSet()
            r9.mConstraintSet = r2
        L79:
            int r1 = r1 + 1
            goto L5f
        L7c:
            androidx.constraintlayout.widget.ConstraintSet r1 = r9.mConstraintSet
            if (r1 == 0) goto L84
            r2 = 1
            r1.applyToInternal(r9, r2)
        L84:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r9.mLayoutWidget
            r1.removeAllChildren()
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r1 = r9.mConstraintHelpers
            int r1 = r1.size()
            if (r1 <= 0) goto La2
            r2 = r0
        L92:
            if (r2 >= r1) goto La2
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r3 = r9.mConstraintHelpers
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.widget.ConstraintHelper r3 = (androidx.constraintlayout.widget.ConstraintHelper) r3
            r3.updatePreLayout(r9)
            int r2 = r2 + 1
            goto L92
        La2:
            r1 = r0
        La3:
            if (r1 >= r7) goto Lb5
            android.view.View r2 = r9.getChildAt(r1)
            boolean r3 = r2 instanceof androidx.constraintlayout.widget.Placeholder
            if (r3 == 0) goto Lb2
            androidx.constraintlayout.widget.Placeholder r2 = (androidx.constraintlayout.widget.Placeholder) r2
            r2.updatePreLayout(r9)
        Lb2:
            int r1 = r1 + 1
            goto La3
        Lb5:
            android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r9.mTempMapIdToWidget
            r1.clear()
            android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r9.mTempMapIdToWidget
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r2 = r9.mLayoutWidget
            r1.put(r0, r2)
            android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r9.mTempMapIdToWidget
            int r2 = r9.getId()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = r9.mLayoutWidget
            r1.put(r2, r3)
            r1 = r0
        Lcd:
            if (r1 >= r7) goto Le3
            android.view.View r2 = r9.getChildAt(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r9.getViewWidget(r2)
            android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r4 = r9.mTempMapIdToWidget
            int r2 = r2.getId()
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto Lcd
        Le3:
            r8 = r0
        Le4:
            if (r8 >= r7) goto L107
            android.view.View r2 = r9.getChildAt(r8)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r9.getViewWidget(r2)
            if (r3 != 0) goto Lf1
            goto L104
        Lf1:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r4
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r9.mLayoutWidget
            r0.add(r3)
            android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r5 = r9.mTempMapIdToWidget
            r0 = r9
            r1 = r6
            r0.applyConstraintsFromLayoutParams(r1, r2, r3, r4, r5)
        L104:
            int r8 = r8 + 1
            goto Le4
        L107:
            return
    }

    private void setWidgetBaseline(androidx.constraintlayout.core.widgets.ConstraintWidget r3, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r4, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r5, int r6, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r7) {
            r2 = this;
            android.util.SparseArray<android.view.View> r0 = r2.mChildrenByIds
            java.lang.Object r0 = r0.get(r6)
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            if (r5 == 0) goto L54
            if (r0 == 0) goto L54
            android.view.ViewGroup$LayoutParams r6 = r0.getLayoutParams()
            boolean r6 = r6 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r6 == 0) goto L54
            r6 = 1
            r4.needsBaseline = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            if (r7 != r1) goto L2e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            r0.needsBaseline = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.widget
            r0.setHasBaseline(r6)
        L2e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.getAnchor(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.getAnchor(r7)
            int r7 = r4.baselineMargin
            int r4 = r4.goneBaselineMargin
            r0.connect(r5, r7, r4, r6)
            r3.setHasBaseline(r6)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            r4.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.getAnchor(r4)
            r3.reset()
        L54:
            return
    }

    private boolean updateHierarchy() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L17
            android.view.View r3 = r4.getChildAt(r2)
            boolean r3 = r3.isLayoutRequested()
            if (r3 == 0) goto L14
            r1 = 1
            goto L17
        L14:
            int r2 = r2 + 1
            goto L6
        L17:
            if (r1 == 0) goto L1c
            r4.setChildrenConstraints()
        L1c:
            return r1
    }

    protected void applyConstraintsFromLayoutParams(boolean r17, android.view.View r18, androidx.constraintlayout.core.widgets.ConstraintWidget r19, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r20, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r21) {
            r16 = this;
            r0 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r20.validate()
            r9 = 0
            r7.helped = r9
            int r1 = r18.getVisibility()
            r6.setVisibility(r1)
            boolean r1 = r7.isInPlaceholder
            if (r1 == 0) goto L22
            r1 = 1
            r6.setInPlaceholder(r1)
            r1 = 8
            r6.setVisibility(r1)
        L22:
            r6.setCompanionWidget(r0)
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r1 == 0) goto L37
            androidx.constraintlayout.widget.ConstraintHelper r0 = (androidx.constraintlayout.widget.ConstraintHelper) r0
            r10 = r16
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r10.mLayoutWidget
            boolean r1 = r1.isRtl()
            r0.resolveRtl(r6, r1)
            goto L39
        L37:
            r10 = r16
        L39:
            boolean r0 = r7.isGuideline
            r11 = -1
            if (r0 == 0) goto L60
            r0 = r6
            androidx.constraintlayout.core.widgets.Guideline r0 = (androidx.constraintlayout.core.widgets.Guideline) r0
            int r1 = r7.resolvedGuideBegin
            int r2 = r7.resolvedGuideEnd
            float r3 = r7.resolvedGuidePercent
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L52
            r0.setGuidePercent(r3)
            goto L277
        L52:
            if (r1 == r11) goto L59
            r0.setGuideBegin(r1)
            goto L277
        L59:
            if (r2 == r11) goto L277
            r0.setGuideEnd(r2)
            goto L277
        L60:
            int r0 = r7.resolvedLeftToLeft
            int r1 = r7.resolvedLeftToRight
            int r12 = r7.resolvedRightToLeft
            int r13 = r7.resolvedRightToRight
            int r5 = r7.resolveGoneLeftMargin
            int r14 = r7.resolveGoneRightMargin
            float r15 = r7.resolvedHorizontalBias
            int r2 = r7.circleConstraint
            if (r2 == r11) goto L85
            int r0 = r7.circleConstraint
            java.lang.Object r0 = r8.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r0
            if (r0 == 0) goto L1a1
            float r1 = r7.circleAngle
            int r2 = r7.circleRadius
            r6.connectCircularConstraint(r0, r1, r2)
            goto L1a1
        L85:
            if (r0 == r11) goto L9c
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto Lb2
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            int r4 = r7.leftMargin
            r0 = r19
            r0.immediateConnect(r1, r2, r3, r4, r5)
            goto Lb2
        L9c:
            if (r1 == r11) goto Lb2
            java.lang.Object r0 = r8.get(r1)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto Lb2
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            int r4 = r7.leftMargin
            r0 = r19
            r0.immediateConnect(r1, r2, r3, r4, r5)
        Lb2:
            if (r12 == r11) goto Lca
            java.lang.Object r0 = r8.get(r12)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto Le1
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            int r4 = r7.rightMargin
            r0 = r19
            r5 = r14
            r0.immediateConnect(r1, r2, r3, r4, r5)
            goto Le1
        Lca:
            if (r13 == r11) goto Le1
            java.lang.Object r0 = r8.get(r13)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto Le1
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            int r4 = r7.rightMargin
            r0 = r19
            r5 = r14
            r0.immediateConnect(r1, r2, r3, r4, r5)
        Le1:
            int r0 = r7.topToTop
            if (r0 == r11) goto Lfe
            int r0 = r7.topToTop
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L11a
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            int r4 = r7.topMargin
            int r5 = r7.goneTopMargin
            r0 = r19
            r0.immediateConnect(r1, r2, r3, r4, r5)
            goto L11a
        Lfe:
            int r0 = r7.topToBottom
            if (r0 == r11) goto L11a
            int r0 = r7.topToBottom
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L11a
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            int r4 = r7.topMargin
            int r5 = r7.goneTopMargin
            r0 = r19
            r0.immediateConnect(r1, r2, r3, r4, r5)
        L11a:
            int r0 = r7.bottomToTop
            if (r0 == r11) goto L137
            int r0 = r7.bottomToTop
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L153
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            int r4 = r7.bottomMargin
            int r5 = r7.goneBottomMargin
            r0 = r19
            r0.immediateConnect(r1, r2, r3, r4, r5)
            goto L153
        L137:
            int r0 = r7.bottomToBottom
            if (r0 == r11) goto L153
            int r0 = r7.bottomToBottom
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L153
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            int r4 = r7.bottomMargin
            int r5 = r7.goneBottomMargin
            r0 = r19
            r0.immediateConnect(r1, r2, r3, r4, r5)
        L153:
            int r0 = r7.baselineToBaseline
            if (r0 == r11) goto L167
            int r4 = r7.baselineToBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = r21
            r0.setWidgetBaseline(r1, r2, r3, r4, r5)
            goto L18e
        L167:
            int r0 = r7.baselineToTop
            if (r0 == r11) goto L17b
            int r4 = r7.baselineToTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = r21
            r0.setWidgetBaseline(r1, r2, r3, r4, r5)
            goto L18e
        L17b:
            int r0 = r7.baselineToBottom
            if (r0 == r11) goto L18e
            int r4 = r7.baselineToBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = r21
            r0.setWidgetBaseline(r1, r2, r3, r4, r5)
        L18e:
            r0 = 0
            int r1 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r1 < 0) goto L196
            r6.setHorizontalBiasPercent(r15)
        L196:
            float r1 = r7.verticalBias
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L1a1
            float r0 = r7.verticalBias
            r6.setVerticalBiasPercent(r0)
        L1a1:
            if (r17 == 0) goto L1b2
            int r0 = r7.editorAbsoluteX
            if (r0 != r11) goto L1ab
            int r0 = r7.editorAbsoluteY
            if (r0 == r11) goto L1b2
        L1ab:
            int r0 = r7.editorAbsoluteX
            int r1 = r7.editorAbsoluteY
            r6.setOrigin(r0, r1)
        L1b2:
            boolean r0 = r7.horizontalDimensionFixed
            r1 = -2
            if (r0 != 0) goto L1e8
            int r0 = r7.width
            if (r0 != r11) goto L1df
            boolean r0 = r7.constrainedWidth
            if (r0 == 0) goto L1c5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r6.setHorizontalDimensionBehaviour(r0)
            goto L1ca
        L1c5:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r6.setHorizontalDimensionBehaviour(r0)
        L1ca:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.getAnchor(r0)
            int r2 = r7.leftMargin
            r0.mMargin = r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.getAnchor(r0)
            int r2 = r7.rightMargin
            r0.mMargin = r2
            goto L1fb
        L1df:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r6.setHorizontalDimensionBehaviour(r0)
            r6.setWidth(r9)
            goto L1fb
        L1e8:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6.setHorizontalDimensionBehaviour(r0)
            int r0 = r7.width
            r6.setWidth(r0)
            int r0 = r7.width
            if (r0 != r1) goto L1fb
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6.setHorizontalDimensionBehaviour(r0)
        L1fb:
            boolean r0 = r7.verticalDimensionFixed
            if (r0 != 0) goto L230
            int r0 = r7.height
            if (r0 != r11) goto L227
            boolean r0 = r7.constrainedHeight
            if (r0 == 0) goto L20d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r6.setVerticalDimensionBehaviour(r0)
            goto L212
        L20d:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r6.setVerticalDimensionBehaviour(r0)
        L212:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.getAnchor(r0)
            int r1 = r7.topMargin
            r0.mMargin = r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.getAnchor(r0)
            int r1 = r7.bottomMargin
            r0.mMargin = r1
            goto L243
        L227:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r6.setVerticalDimensionBehaviour(r0)
            r6.setHeight(r9)
            goto L243
        L230:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6.setVerticalDimensionBehaviour(r0)
            int r0 = r7.height
            r6.setHeight(r0)
            int r0 = r7.height
            if (r0 != r1) goto L243
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6.setVerticalDimensionBehaviour(r0)
        L243:
            java.lang.String r0 = r7.dimensionRatio
            r6.setDimensionRatio(r0)
            float r0 = r7.horizontalWeight
            r6.setHorizontalWeight(r0)
            float r0 = r7.verticalWeight
            r6.setVerticalWeight(r0)
            int r0 = r7.horizontalChainStyle
            r6.setHorizontalChainStyle(r0)
            int r0 = r7.verticalChainStyle
            r6.setVerticalChainStyle(r0)
            int r0 = r7.wrapBehaviorInParent
            r6.setWrapBehaviorInParent(r0)
            int r0 = r7.matchConstraintDefaultWidth
            int r1 = r7.matchConstraintMinWidth
            int r2 = r7.matchConstraintMaxWidth
            float r3 = r7.matchConstraintPercentWidth
            r6.setHorizontalMatchStyle(r0, r1, r2, r3)
            int r0 = r7.matchConstraintDefaultHeight
            int r1 = r7.matchConstraintMinHeight
            int r2 = r7.matchConstraintMaxHeight
            float r3 = r7.matchConstraintPercentHeight
            r6.setVerticalMatchStyle(r0, r1, r2, r3)
        L277:
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r19) {
            r18 = this;
            r0 = r18
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r1 = r0.mConstraintHelpers
            r2 = 0
            if (r1 == 0) goto L1e
            int r1 = r1.size()
            if (r1 <= 0) goto L1e
            r3 = r2
        Le:
            if (r3 >= r1) goto L1e
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r4 = r0.mConstraintHelpers
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.widget.ConstraintHelper r4 = (androidx.constraintlayout.widget.ConstraintHelper) r4
            r4.updatePreDraw(r0)
            int r3 = r3 + 1
            goto Le
        L1e:
            super.dispatchDraw(r19)
            boolean r1 = r18.isInEditMode()
            if (r1 == 0) goto Ld1
            int r1 = r18.getWidth()
            float r1 = (float) r1
            int r3 = r18.getHeight()
            float r3 = (float) r3
            int r4 = r18.getChildCount()
            r5 = r2
        L36:
            if (r5 >= r4) goto Ld1
            android.view.View r6 = r0.getChildAt(r5)
            int r7 = r6.getVisibility()
            r8 = 8
            if (r7 != r8) goto L46
            goto Lcd
        L46:
            java.lang.Object r6 = r6.getTag()
            if (r6 == 0) goto Lcd
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto Lcd
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ","
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            r8 = 4
            if (r7 != r8) goto Lcd
            r7 = r6[r2]
            int r7 = java.lang.Integer.parseInt(r7)
            r8 = 1
            r8 = r6[r8]
            int r8 = java.lang.Integer.parseInt(r8)
            r9 = 2
            r9 = r6[r9]
            int r9 = java.lang.Integer.parseInt(r9)
            r10 = 3
            r6 = r6[r10]
            int r6 = java.lang.Integer.parseInt(r6)
            float r7 = (float) r7
            r10 = 1149698048(0x44870000, float:1080.0)
            float r7 = r7 / r10
            float r7 = r7 * r1
            int r7 = (int) r7
            float r8 = (float) r8
            r11 = 1156579328(0x44f00000, float:1920.0)
            float r8 = r8 / r11
            float r8 = r8 * r3
            int r8 = (int) r8
            float r9 = (float) r9
            float r9 = r9 / r10
            float r9 = r9 * r1
            int r9 = (int) r9
            float r6 = (float) r6
            float r6 = r6 / r11
            float r6 = r6 * r3
            int r6 = (int) r6
            android.graphics.Paint r15 = new android.graphics.Paint
            r15.<init>()
            r10 = -65536(0xffffffffffff0000, float:NaN)
            r15.setColor(r10)
            float r14 = (float) r7
            float r13 = (float) r8
            int r7 = r7 + r9
            float r7 = (float) r7
            r10 = r19
            r11 = r14
            r12 = r13
            r9 = r13
            r13 = r7
            r16 = r14
            r14 = r9
            r17 = r15
            r10.drawLine(r11, r12, r13, r14, r15)
            int r8 = r8 + r6
            float r6 = (float) r8
            r11 = r7
            r12 = r9
            r14 = r6
            r10.drawLine(r11, r12, r13, r14, r15)
            r12 = r6
            r13 = r16
            r10.drawLine(r11, r12, r13, r14, r15)
            r11 = r16
            r14 = r9
            r10.drawLine(r11, r12, r13, r14, r15)
            r8 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r15.setColor(r8)
            r12 = r9
            r13 = r7
            r14 = r6
            r8 = r15
            r10.drawLine(r11, r12, r13, r14, r15)
            r12 = r6
            r14 = r9
            r10.drawLine(r11, r12, r13, r14, r15)
        Lcd:
            int r5 = r5 + 1
            goto L36
        Ld1:
            return
    }

    public void fillMetrics(androidx.constraintlayout.core.Metrics r2) {
            r1 = this;
            r1.mMetrics = r2
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r1.mLayoutWidget
            r0.fillMetrics(r2)
            return
    }

    @Override // android.view.View
    public void forceLayout() {
            r0 = this;
            r0.markHierarchyDirty()
            super.forceLayout()
            return
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.constraintlayout.widget.ConstraintLayout.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = new androidx.constraintlayout.widget.ConstraintLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = new androidx.constraintlayout.widget.ConstraintLayout$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.constraintlayout.widget.ConstraintLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = new androidx.constraintlayout.widget.ConstraintLayout$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    public java.lang.Object getDesignInformation(int r1, java.lang.Object r2) {
            r0 = this;
            if (r1 != 0) goto L19
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L19
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.mDesignIds
            if (r1 == 0) goto L19
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L19
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.mDesignIds
            java.lang.Object r1 = r1.get(r2)
            return r1
        L19:
            r1 = 0
            return r1
    }

    public int getMaxHeight() {
            r1 = this;
            int r0 = r1.mMaxHeight
            return r0
    }

    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.mMaxWidth
            return r0
    }

    public int getMinHeight() {
            r1 = this;
            int r0 = r1.mMinHeight
            return r0
    }

    public int getMinWidth() {
            r1 = this;
            int r0 = r1.mMinWidth
            return r0
    }

    public int getOptimizationLevel() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r1.mLayoutWidget
            int r0 = r0.getOptimizationLevel()
            return r0
    }

    public java.lang.String getSceneString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r8.mLayoutWidget
            java.lang.String r1 = r1.stringId
            r2 = -1
            if (r1 != 0) goto L29
            int r1 = r8.getId()
            if (r1 == r2) goto L23
            android.content.Context r3 = r8.getContext()
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r1 = r3.getResourceEntryName(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = r8.mLayoutWidget
            r3.stringId = r1
            goto L29
        L23:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r8.mLayoutWidget
            java.lang.String r3 = "parent"
            r1.stringId = r3
        L29:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r8.mLayoutWidget
            java.lang.String r1 = r1.getDebugName()
            java.lang.String r3 = " setDebugName "
            java.lang.String r4 = "ConstraintLayout"
            if (r1 != 0) goto L52
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r8.mLayoutWidget
            java.lang.String r5 = r1.stringId
            r1.setDebugName(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r8.mLayoutWidget
            java.lang.String r5 = r5.getDebugName()
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r4, r1)
        L52:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r8.mLayoutWidget
            java.util.ArrayList r1 = r1.getChildren()
            java.util.Iterator r1 = r1.iterator()
        L5c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto La8
            java.lang.Object r5 = r1.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            java.lang.Object r6 = r5.getCompanionWidget()
            android.view.View r6 = (android.view.View) r6
            if (r6 == 0) goto L5c
            java.lang.String r7 = r5.stringId
            if (r7 != 0) goto L88
            int r6 = r6.getId()
            if (r6 == r2) goto L88
            android.content.Context r7 = r8.getContext()
            android.content.res.Resources r7 = r7.getResources()
            java.lang.String r6 = r7.getResourceEntryName(r6)
            r5.stringId = r6
        L88:
            java.lang.String r6 = r5.getDebugName()
            if (r6 != 0) goto L5c
            java.lang.String r6 = r5.stringId
            r5.setDebugName(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            java.lang.String r5 = r5.getDebugName()
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r4, r5)
            goto L5c
        La8:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r8.mLayoutWidget
            r1.getSceneString(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public android.view.View getViewById(int r2) {
            r1 = this;
            android.util.SparseArray<android.view.View> r0 = r1.mChildrenByIds
            java.lang.Object r2 = r0.get(r2)
            android.view.View r2 = (android.view.View) r2
            return r2
    }

    public final androidx.constraintlayout.core.widgets.ConstraintWidget getViewWidget(android.view.View r2) {
            r1 = this;
            if (r2 != r1) goto L5
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r2 = r1.mLayoutWidget
            return r2
        L5:
            if (r2 == 0) goto L34
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r0 == 0) goto L18
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.widget
            return r2
        L18:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            android.view.ViewGroup$LayoutParams r0 = r1.generateLayoutParams(r0)
            r2.setLayoutParams(r0)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r0 == 0) goto L34
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.widget
            return r2
        L34:
            r2 = 0
            return r2
    }

    protected boolean isRtl() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L13
            r0 = r2
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L1d
            int r0 = r3.getLayoutDirection()
            if (r2 != r0) goto L1d
            r1 = r2
        L1d:
            return r1
    }

    public void loadLayoutDescription(int r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L12
            androidx.constraintlayout.widget.ConstraintLayoutStates r1 = new androidx.constraintlayout.widget.ConstraintLayoutStates     // Catch: android.content.res.Resources.NotFoundException -> Lf
            android.content.Context r2 = r3.getContext()     // Catch: android.content.res.Resources.NotFoundException -> Lf
            r1.<init>(r2, r3, r4)     // Catch: android.content.res.Resources.NotFoundException -> Lf
            r3.mConstraintLayoutSpec = r1     // Catch: android.content.res.Resources.NotFoundException -> Lf
            goto L14
        Lf:
            r3.mConstraintLayoutSpec = r0
            goto L14
        L12:
            r3.mConstraintLayoutSpec = r0
        L14:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
            r5 = this;
            int r6 = r5.getChildCount()
            boolean r7 = r5.isInEditMode()
            r8 = 0
            r9 = r8
        La:
            if (r9 >= r6) goto L5e
            android.view.View r10 = r5.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.widget
            int r2 = r10.getVisibility()
            r3 = 8
            if (r2 != r3) goto L2f
            boolean r2 = r0.isGuideline
            if (r2 != 0) goto L2f
            boolean r2 = r0.isHelper
            if (r2 != 0) goto L2f
            boolean r2 = r0.isVirtualGroup
            if (r2 != 0) goto L2f
            if (r7 != 0) goto L2f
            goto L5b
        L2f:
            boolean r0 = r0.isInPlaceholder
            if (r0 == 0) goto L34
            goto L5b
        L34:
            int r0 = r1.getX()
            int r2 = r1.getY()
            int r3 = r1.getWidth()
            int r3 = r3 + r0
            int r1 = r1.getHeight()
            int r1 = r1 + r2
            r10.layout(r0, r2, r3, r1)
            boolean r4 = r10 instanceof androidx.constraintlayout.widget.Placeholder
            if (r4 == 0) goto L5b
            androidx.constraintlayout.widget.Placeholder r10 = (androidx.constraintlayout.widget.Placeholder) r10
            android.view.View r10 = r10.getContent()
            if (r10 == 0) goto L5b
            r10.setVisibility(r8)
            r10.layout(r0, r2, r3, r1)
        L5b:
            int r9 = r9 + 1
            goto La
        L5e:
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r6 = r5.mConstraintHelpers
            int r6 = r6.size()
            if (r6 <= 0) goto L76
        L66:
            if (r8 >= r6) goto L76
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r7 = r5.mConstraintHelpers
            java.lang.Object r7 = r7.get(r8)
            androidx.constraintlayout.widget.ConstraintHelper r7 = (androidx.constraintlayout.widget.ConstraintHelper) r7
            r7.updatePostLayout(r5)
            int r8 = r8 + 1
            goto L66
        L76:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r9, int r10) {
            r8 = this;
            int r0 = r8.mOnMeasureWidthMeasureSpec
            if (r0 != r9) goto L6
            int r0 = r8.mOnMeasureHeightMeasureSpec
        L6:
            boolean r0 = r8.mDirtyHierarchy
            r1 = 0
            if (r0 != 0) goto L23
            int r0 = r8.getChildCount()
            r2 = r1
        L10:
            if (r2 >= r0) goto L23
            android.view.View r3 = r8.getChildAt(r2)
            boolean r3 = r3.isLayoutRequested()
            if (r3 == 0) goto L20
            r0 = 1
            r8.mDirtyHierarchy = r0
            goto L23
        L20:
            int r2 = r2 + 1
            goto L10
        L23:
            boolean r0 = r8.mDirtyHierarchy
            r8.mOnMeasureWidthMeasureSpec = r9
            r8.mOnMeasureHeightMeasureSpec = r10
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r8.mLayoutWidget
            boolean r2 = r8.isRtl()
            r0.setRtl(r2)
            boolean r0 = r8.mDirtyHierarchy
            if (r0 == 0) goto L43
            r8.mDirtyHierarchy = r1
            boolean r0 = r8.updateHierarchy()
            if (r0 == 0) goto L43
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r8.mLayoutWidget
            r0.updateHierarchy()
        L43:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r8.mLayoutWidget
            int r1 = r8.mOptimizationLevel
            r8.resolveSystem(r0, r1, r9, r10)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r8.mLayoutWidget
            int r4 = r0.getWidth()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r8.mLayoutWidget
            int r5 = r0.getHeight()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r8.mLayoutWidget
            boolean r6 = r0.isWidthMeasuredTooSmall()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r8.mLayoutWidget
            boolean r7 = r0.isHeightMeasuredTooSmall()
            r1 = r8
            r2 = r9
            r3 = r10
            r1.resolveMeasuredDimension(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View r4) {
            r3 = this;
            super.onViewAdded(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r3.getViewWidget(r4)
            boolean r1 = r4 instanceof androidx.constraintlayout.widget.Guideline
            r2 = 1
            if (r1 == 0) goto L28
            boolean r0 = r0 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r0 != 0) goto L28
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            androidx.constraintlayout.core.widgets.Guideline r1 = new androidx.constraintlayout.core.widgets.Guideline
            r1.<init>()
            r0.widget = r1
            r0.isGuideline = r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.widget
            androidx.constraintlayout.core.widgets.Guideline r1 = (androidx.constraintlayout.core.widgets.Guideline) r1
            int r0 = r0.orientation
            r1.setOrientation(r0)
        L28:
            boolean r0 = r4 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r0 == 0) goto L47
            r0 = r4
            androidx.constraintlayout.widget.ConstraintHelper r0 = (androidx.constraintlayout.widget.ConstraintHelper) r0
            r0.validateParams()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            r1.isHelper = r2
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r1 = r3.mConstraintHelpers
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L47
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r1 = r3.mConstraintHelpers
            r1.add(r0)
        L47:
            android.util.SparseArray<android.view.View> r0 = r3.mChildrenByIds
            int r1 = r4.getId()
            r0.put(r1, r4)
            r3.mDirtyHierarchy = r2
            return
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View r3) {
            r2 = this;
            super.onViewRemoved(r3)
            android.util.SparseArray<android.view.View> r0 = r2.mChildrenByIds
            int r1 = r3.getId()
            r0.remove(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.getViewWidget(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r2.mLayoutWidget
            r1.remove(r0)
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r0 = r2.mConstraintHelpers
            r0.remove(r3)
            r3 = 1
            r2.mDirtyHierarchy = r3
            return
    }

    protected void parseLayoutDescription(int r3) {
            r2 = this;
            androidx.constraintlayout.widget.ConstraintLayoutStates r0 = new androidx.constraintlayout.widget.ConstraintLayoutStates
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r2, r3)
            r2.mConstraintLayoutSpec = r0
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r0 = this;
            r0.markHierarchyDirty()
            super.requestLayout()
            return
    }

    protected void resolveMeasuredDimension(int r3, int r4, int r5, int r6, boolean r7, boolean r8) {
            r2 = this;
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r0 = r2.mMeasurer
            int r0 = r0.paddingHeight
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r1 = r2.mMeasurer
            int r1 = r1.paddingWidth
            int r5 = r5 + r1
            int r6 = r6 + r0
            r0 = 0
            int r3 = resolveSizeAndState(r5, r3, r0)
            int r4 = resolveSizeAndState(r6, r4, r0)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r5
            r4 = r4 & r5
            int r5 = r2.mMaxWidth
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r2.mMaxHeight
            int r4 = java.lang.Math.min(r5, r4)
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            if (r7 == 0) goto L29
            r3 = r3 | r5
        L29:
            if (r8 == 0) goto L2c
            r4 = r4 | r5
        L2c:
            r2.setMeasuredDimension(r3, r4)
            r2.mLastMeasureWidth = r3
            r2.mLastMeasureHeight = r4
            return
    }

    protected void resolveSystem(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r21, int r22, int r23, int r24) {
            r20 = this;
            r6 = r20
            int r9 = android.view.View.MeasureSpec.getMode(r23)
            int r0 = android.view.View.MeasureSpec.getSize(r23)
            int r11 = android.view.View.MeasureSpec.getMode(r24)
            int r1 = android.view.View.MeasureSpec.getSize(r24)
            int r2 = r20.getPaddingTop()
            r3 = 0
            int r19 = java.lang.Math.max(r3, r2)
            int r2 = r20.getPaddingBottom()
            int r16 = java.lang.Math.max(r3, r2)
            int r2 = r19 + r16
            int r4 = r20.getPaddingWidth()
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r12 = r6.mMeasurer
            r13 = r23
            r14 = r24
            r15 = r19
            r17 = r4
            r18 = r2
            r12.captureLayoutInfo(r13, r14, r15, r16, r17, r18)
            int r5 = r20.getPaddingStart()
            int r5 = java.lang.Math.max(r3, r5)
            int r7 = r20.getPaddingEnd()
            int r7 = java.lang.Math.max(r3, r7)
            if (r5 > 0) goto L57
            if (r7 <= 0) goto L4d
            goto L57
        L4d:
            int r5 = r20.getPaddingLeft()
            int r3 = java.lang.Math.max(r3, r5)
            r15 = r3
            goto L60
        L57:
            boolean r3 = r20.isRtl()
            if (r3 == 0) goto L5f
            r15 = r7
            goto L60
        L5f:
            r15 = r5
        L60:
            int r10 = r0 - r4
            int r12 = r1 - r2
            r0 = r20
            r1 = r21
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.setSelfDimensionBehaviour(r1, r2, r3, r4, r5)
            int r13 = r6.mLastMeasureWidth
            int r14 = r6.mLastMeasureHeight
            r7 = r21
            r8 = r22
            r16 = r19
            r7.measure(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
    }

    public void setConstraintSet(androidx.constraintlayout.widget.ConstraintSet r1) {
            r0 = this;
            r0.mConstraintSet = r1
            return
    }

    public void setDesignInformation(int r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            if (r2 != 0) goto L35
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L35
            boolean r2 = r4 instanceof java.lang.Integer
            if (r2 == 0) goto L35
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r1.mDesignIds
            if (r2 != 0) goto L15
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.mDesignIds = r2
        L15:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = "/"
            int r2 = r3.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L26
            int r2 = r2 + 1
            java.lang.String r3 = r3.substring(r2)
        L26:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r2 = r4.intValue()
            java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r1.mDesignIds
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.put(r3, r2)
        L35:
            return
    }

    @Override // android.view.View
    public void setId(int r3) {
            r2 = this;
            android.util.SparseArray<android.view.View> r0 = r2.mChildrenByIds
            int r1 = r2.getId()
            r0.remove(r1)
            super.setId(r3)
            android.util.SparseArray<android.view.View> r3 = r2.mChildrenByIds
            int r0 = r2.getId()
            r3.put(r0, r2)
            return
    }

    public void setMaxHeight(int r2) {
            r1 = this;
            int r0 = r1.mMaxHeight
            if (r2 != r0) goto L5
            return
        L5:
            r1.mMaxHeight = r2
            r1.requestLayout()
            return
    }

    public void setMaxWidth(int r2) {
            r1 = this;
            int r0 = r1.mMaxWidth
            if (r2 != r0) goto L5
            return
        L5:
            r1.mMaxWidth = r2
            r1.requestLayout()
            return
    }

    public void setMinHeight(int r2) {
            r1 = this;
            int r0 = r1.mMinHeight
            if (r2 != r0) goto L5
            return
        L5:
            r1.mMinHeight = r2
            r1.requestLayout()
            return
    }

    public void setMinWidth(int r2) {
            r1 = this;
            int r0 = r1.mMinWidth
            if (r2 != r0) goto L5
            return
        L5:
            r1.mMinWidth = r2
            r1.requestLayout()
            return
    }

    public void setOnConstraintsChanged(androidx.constraintlayout.widget.ConstraintsChangedListener r2) {
            r1 = this;
            r1.mConstraintsChangedListener = r2
            androidx.constraintlayout.widget.ConstraintLayoutStates r0 = r1.mConstraintLayoutSpec
            if (r0 == 0) goto L9
            r0.setOnConstraintsChanged(r2)
        L9:
            return
    }

    public void setOptimizationLevel(int r2) {
            r1 = this;
            r1.mOptimizationLevel = r2
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r1.mLayoutWidget
            r0.setOptimizationLevel(r2)
            return
    }

    protected void setSelfDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r9, int r10, int r11, int r12, int r13) {
            r8 = this;
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r0 = r8.mMeasurer
            int r0 = r0.paddingHeight
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r1 = r8.mMeasurer
            int r1 = r1.paddingWidth
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            int r4 = r8.getChildCount()
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 0
            if (r10 == r6) goto L30
            if (r10 == 0) goto L25
            if (r10 == r5) goto L1d
        L1b:
            r11 = r7
            goto L3a
        L1d:
            int r10 = r8.mMaxWidth
            int r10 = r10 - r1
            int r11 = java.lang.Math.min(r10, r11)
            goto L3a
        L25:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != 0) goto L1b
            int r10 = r8.mMinWidth
            int r11 = java.lang.Math.max(r7, r10)
            goto L3a
        L30:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != 0) goto L3a
            int r10 = r8.mMinWidth
            int r11 = java.lang.Math.max(r7, r10)
        L3a:
            if (r12 == r6) goto L55
            if (r12 == 0) goto L4a
            if (r12 == r5) goto L42
        L40:
            r13 = r7
            goto L5f
        L42:
            int r10 = r8.mMaxHeight
            int r10 = r10 - r0
            int r13 = java.lang.Math.min(r10, r13)
            goto L5f
        L4a:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != 0) goto L40
            int r10 = r8.mMinHeight
            int r13 = java.lang.Math.max(r7, r10)
            goto L5f
        L55:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != 0) goto L5f
            int r10 = r8.mMinHeight
            int r13 = java.lang.Math.max(r7, r10)
        L5f:
            int r10 = r9.getWidth()
            if (r11 != r10) goto L6b
            int r10 = r9.getHeight()
            if (r13 == r10) goto L6e
        L6b:
            r9.invalidateMeasures()
        L6e:
            r9.setX(r7)
            r9.setY(r7)
            int r10 = r8.mMaxWidth
            int r10 = r10 - r1
            r9.setMaxWidth(r10)
            int r10 = r8.mMaxHeight
            int r10 = r10 - r0
            r9.setMaxHeight(r10)
            r9.setMinWidth(r7)
            r9.setMinHeight(r7)
            r9.setHorizontalDimensionBehaviour(r2)
            r9.setWidth(r11)
            r9.setVerticalDimensionBehaviour(r3)
            r9.setHeight(r13)
            int r10 = r8.mMinWidth
            int r10 = r10 - r1
            r9.setMinWidth(r10)
            int r10 = r8.mMinHeight
            int r10 = r10 - r0
            r9.setMinHeight(r10)
            return
    }

    public void setState(int r2, int r3, int r4) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayoutStates r0 = r1.mConstraintLayoutSpec
            if (r0 == 0) goto L9
            float r3 = (float) r3
            float r4 = (float) r4
            r0.updateConstraints(r2, r3, r4)
        L9:
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
