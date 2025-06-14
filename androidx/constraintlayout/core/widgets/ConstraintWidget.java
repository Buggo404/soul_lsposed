package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int BOTH = 2;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
    public static final int WRAP_BEHAVIOR_INCLUDED = 0;
    public static final int WRAP_BEHAVIOR_SKIPPED = 3;
    public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
    private boolean OPTIMIZE_WRAP;
    private boolean OPTIMIZE_WRAP_ON_RESOLVED;
    public androidx.constraintlayout.core.state.WidgetFrame frame;
    private boolean hasBaseline;
    public androidx.constraintlayout.core.widgets.analyzer.ChainRun horizontalChainRun;
    public int horizontalGroup;
    public androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun horizontalRun;
    private boolean horizontalSolvingPass;
    private boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    protected java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> mAnchors;
    private boolean mAnimated;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mBaseline;
    int mBaselineDistance;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mCenter;
    androidx.constraintlayout.core.widgets.ConstraintAnchor mCenterX;
    androidx.constraintlayout.core.widgets.ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private java.lang.Object mCompanionWidget;
    private int mContainerItemSkip;
    private java.lang.String mDebugName;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    boolean mGroupsToSolver;
    int mHeight;
    private int mHeightOverride;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    androidx.constraintlayout.core.widgets.ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    boolean mHorizontalWrapVisited;
    private boolean mInVirtualLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    private int mLastHorizontalMeasureSpec;
    private int mLastVerticalMeasureSpec;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor[] mListAnchors;
    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[] mListDimensionBehaviors;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    private boolean mMeasureRequested;
    protected int mMinHeight;
    protected int mMinWidth;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    public androidx.constraintlayout.core.widgets.ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    boolean mResolvedHasRatio;
    public int[] mResolvedMatchConstraintDefault;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mRight;
    boolean mRightHasCentered;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private java.lang.String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    androidx.constraintlayout.core.widgets.ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    int mWidth;
    private int mWidthOverride;
    private int mWrapBehaviorInParent;

    /* renamed from: mX */
    protected int f38mX;

    /* renamed from: mY */
    protected int f39mY;
    public boolean measured;
    private boolean resolvedHorizontal;
    private boolean resolvedVertical;
    public androidx.constraintlayout.core.widgets.analyzer.WidgetRun[] run;
    public java.lang.String stringId;
    public androidx.constraintlayout.core.widgets.analyzer.ChainRun verticalChainRun;
    public int verticalGroup;
    public androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun verticalRun;
    private boolean verticalSolvingPass;

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$1 */
    static /* synthetic */ class C01281 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type */
        static final /* synthetic */ int[] f40x6930e354 = null;

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour */
        static final /* synthetic */ int[] f41x6d00e4a2 = null;

        static {
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.widgets.ConstraintWidget.C01281.f41x6d00e4a2 = r0
                r1 = 1
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.C01281.f41x6d00e4a2     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.C01281.f41x6d00e4a2     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.C01281.f41x6d00e4a2     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                androidx.constraintlayout.core.widgets.ConstraintWidget.C01281.f40x6930e354 = r4
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch: java.lang.NoSuchFieldError -> L44
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L44
            L44:
                int[] r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.C01281.f40x6930e354     // Catch: java.lang.NoSuchFieldError -> L4e
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch: java.lang.NoSuchFieldError -> L4e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r1[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.C01281.f40x6930e354     // Catch: java.lang.NoSuchFieldError -> L58
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch: java.lang.NoSuchFieldError -> L58
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.C01281.f40x6930e354     // Catch: java.lang.NoSuchFieldError -> L62
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L62
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L62
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L62
            L62:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.C01281.f40x6930e354     // Catch: java.lang.NoSuchFieldError -> L6d
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L6d:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.C01281.f40x6930e354     // Catch: java.lang.NoSuchFieldError -> L78
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.C01281.f40x6930e354     // Catch: java.lang.NoSuchFieldError -> L83
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch: java.lang.NoSuchFieldError -> L83
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L83
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L83
            L83:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.C01281.f40x6930e354     // Catch: java.lang.NoSuchFieldError -> L8f
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch: java.lang.NoSuchFieldError -> L8f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8f
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8f
            L8f:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.C01281.f40x6930e354     // Catch: java.lang.NoSuchFieldError -> L9b
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch: java.lang.NoSuchFieldError -> L9b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9b
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9b
            L9b:
                return
        }
    }

    public enum DimensionBehaviour extends java.lang.Enum<androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour> {
        private static final /* synthetic */ androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[] $VALUES = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour FIXED = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour MATCH_CONSTRAINT = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour MATCH_PARENT = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour WRAP_CONTENT = null;

        static {
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = new androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour
                java.lang.String r1 = "FIXED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED = r0
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = new androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour
                java.lang.String r3 = "WRAP_CONTENT"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT = r1
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = new androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour
                java.lang.String r5 = "MATCH_CONSTRAINT"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT = r3
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = new androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour
                java.lang.String r7 = "MATCH_PARENT"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT = r5
                r7 = 4
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r7 = new androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.$VALUES = r7
                return
        }

        DimensionBehaviour(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour> r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = (androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour) r1
                return r1
        }

        public static androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[] values() {
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = (androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[]) r0
                return r0
        }
    }

    static {
            return
    }

    public ConstraintWidget() {
            r10 = this;
            r10.<init>()
            r0 = 0
            r10.measured = r0
            r1 = 2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun[] r2 = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun[r1]
            r10.run = r2
            r2 = 0
            r10.horizontalRun = r2
            r10.verticalRun = r2
            boolean[] r3 = new boolean[r1]
            r3 = {x0134: FILL_ARRAY_DATA , data: [1, 1} // fill-array
            r10.isTerminalWidget = r3
            r10.mResolvedHasRatio = r0
            r3 = 1
            r10.mMeasureRequested = r3
            r10.OPTIMIZE_WRAP = r0
            r10.OPTIMIZE_WRAP_ON_RESOLVED = r3
            r4 = -1
            r10.mWidthOverride = r4
            r10.mHeightOverride = r4
            androidx.constraintlayout.core.state.WidgetFrame r5 = new androidx.constraintlayout.core.state.WidgetFrame
            r5.<init>(r10)
            r10.frame = r5
            r10.resolvedHorizontal = r0
            r10.resolvedVertical = r0
            r10.horizontalSolvingPass = r0
            r10.verticalSolvingPass = r0
            r10.mHorizontalResolution = r4
            r10.mVerticalResolution = r4
            r10.mWrapBehaviorInParent = r0
            r10.mMatchConstraintDefaultWidth = r0
            r10.mMatchConstraintDefaultHeight = r0
            int[] r5 = new int[r1]
            r10.mResolvedMatchConstraintDefault = r5
            r10.mMatchConstraintMinWidth = r0
            r10.mMatchConstraintMaxWidth = r0
            r5 = 1065353216(0x3f800000, float:1.0)
            r10.mMatchConstraintPercentWidth = r5
            r10.mMatchConstraintMinHeight = r0
            r10.mMatchConstraintMaxHeight = r0
            r10.mMatchConstraintPercentHeight = r5
            r10.mResolvedDimensionRatioSide = r4
            r10.mResolvedDimensionRatio = r5
            int[] r5 = new int[r1]
            r5 = {x013a: FILL_ARRAY_DATA , data: [2147483647, 2147483647} // fill-array
            r10.mMaxDimension = r5
            r5 = 0
            r10.mCircleConstraintAngle = r5
            r10.hasBaseline = r0
            r10.mInVirtualLayout = r0
            r10.mLastHorizontalMeasureSpec = r0
            r10.mLastVerticalMeasureSpec = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            r6.<init>(r10, r7)
            r10.mLeft = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            r6.<init>(r10, r7)
            r10.mTop = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            r6.<init>(r10, r7)
            r10.mRight = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            r6.<init>(r10, r7)
            r10.mBottom = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            r6.<init>(r10, r7)
            r10.mBaseline = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            r6.<init>(r10, r7)
            r10.mCenterX = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            r6.<init>(r10, r7)
            r10.mCenterY = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            r6.<init>(r10, r7)
            r10.mCenter = r6
            r7 = 6
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = new androidx.constraintlayout.core.widgets.ConstraintAnchor[r7]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mLeft
            r7[r0] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mRight
            r7[r3] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mTop
            r7[r1] = r8
            r8 = 3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.mBottom
            r7[r8] = r9
            r8 = 4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.mBaseline
            r7[r8] = r9
            r8 = 5
            r7[r8] = r6
            r10.mListAnchors = r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r10.mAnchors = r6
            boolean[] r6 = new boolean[r1]
            r10.mIsInBarrier = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r6 = new androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6[r0] = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6[r3] = r7
            r10.mListDimensionBehaviors = r6
            r10.mParent = r2
            r10.mWidth = r0
            r10.mHeight = r0
            r10.mDimensionRatio = r5
            r10.mDimensionRatioSide = r4
            r10.f38mX = r0
            r10.f39mY = r0
            r10.mRelX = r0
            r10.mRelY = r0
            r10.mOffsetX = r0
            r10.mOffsetY = r0
            r10.mBaselineDistance = r0
            float r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            r10.mHorizontalBiasPercent = r5
            r10.mVerticalBiasPercent = r5
            r10.mContainerItemSkip = r0
            r10.mVisibility = r0
            r10.mAnimated = r0
            r10.mDebugName = r2
            r10.mType = r2
            r10.mGroupsToSolver = r0
            r10.mHorizontalChainStyle = r0
            r10.mVerticalChainStyle = r0
            float[] r5 = new float[r1]
            r5 = {x0142: FILL_ARRAY_DATA , data: [-1082130432, -1082130432} // fill-array
            r10.mWeight = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r5[r0] = r2
            r5[r3] = r2
            r10.mListNextMatchConstraintsWidget = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r1[r0] = r2
            r1[r3] = r2
            r10.mNextChainWidget = r1
            r10.mHorizontalNextWidget = r2
            r10.mVerticalNextWidget = r2
            r10.horizontalGroup = r4
            r10.verticalGroup = r4
            r10.addAnchors()
            return
    }

    public ConstraintWidget(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0, r2, r3)
            return
    }

    public ConstraintWidget(int r11, int r12, int r13, int r14) {
            r10 = this;
            r10.<init>()
            r0 = 0
            r10.measured = r0
            r1 = 2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun[] r2 = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun[r1]
            r10.run = r2
            r2 = 0
            r10.horizontalRun = r2
            r10.verticalRun = r2
            boolean[] r3 = new boolean[r1]
            r3 = {x0134: FILL_ARRAY_DATA , data: [1, 1} // fill-array
            r10.isTerminalWidget = r3
            r10.mResolvedHasRatio = r0
            r3 = 1
            r10.mMeasureRequested = r3
            r10.OPTIMIZE_WRAP = r0
            r10.OPTIMIZE_WRAP_ON_RESOLVED = r3
            r4 = -1
            r10.mWidthOverride = r4
            r10.mHeightOverride = r4
            androidx.constraintlayout.core.state.WidgetFrame r5 = new androidx.constraintlayout.core.state.WidgetFrame
            r5.<init>(r10)
            r10.frame = r5
            r10.resolvedHorizontal = r0
            r10.resolvedVertical = r0
            r10.horizontalSolvingPass = r0
            r10.verticalSolvingPass = r0
            r10.mHorizontalResolution = r4
            r10.mVerticalResolution = r4
            r10.mWrapBehaviorInParent = r0
            r10.mMatchConstraintDefaultWidth = r0
            r10.mMatchConstraintDefaultHeight = r0
            int[] r5 = new int[r1]
            r10.mResolvedMatchConstraintDefault = r5
            r10.mMatchConstraintMinWidth = r0
            r10.mMatchConstraintMaxWidth = r0
            r5 = 1065353216(0x3f800000, float:1.0)
            r10.mMatchConstraintPercentWidth = r5
            r10.mMatchConstraintMinHeight = r0
            r10.mMatchConstraintMaxHeight = r0
            r10.mMatchConstraintPercentHeight = r5
            r10.mResolvedDimensionRatioSide = r4
            r10.mResolvedDimensionRatio = r5
            int[] r5 = new int[r1]
            r5 = {x013a: FILL_ARRAY_DATA , data: [2147483647, 2147483647} // fill-array
            r10.mMaxDimension = r5
            r5 = 0
            r10.mCircleConstraintAngle = r5
            r10.hasBaseline = r0
            r10.mInVirtualLayout = r0
            r10.mLastHorizontalMeasureSpec = r0
            r10.mLastVerticalMeasureSpec = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            r6.<init>(r10, r7)
            r10.mLeft = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            r6.<init>(r10, r7)
            r10.mTop = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            r6.<init>(r10, r7)
            r10.mRight = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            r6.<init>(r10, r7)
            r10.mBottom = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            r6.<init>(r10, r7)
            r10.mBaseline = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            r6.<init>(r10, r7)
            r10.mCenterX = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            r6.<init>(r10, r7)
            r10.mCenterY = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            r6.<init>(r10, r7)
            r10.mCenter = r6
            r7 = 6
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = new androidx.constraintlayout.core.widgets.ConstraintAnchor[r7]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mLeft
            r7[r0] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mRight
            r7[r3] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mTop
            r7[r1] = r8
            r8 = 3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.mBottom
            r7[r8] = r9
            r8 = 4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.mBaseline
            r7[r8] = r9
            r8 = 5
            r7[r8] = r6
            r10.mListAnchors = r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r10.mAnchors = r6
            boolean[] r6 = new boolean[r1]
            r10.mIsInBarrier = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r6 = new androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6[r0] = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6[r3] = r7
            r10.mListDimensionBehaviors = r6
            r10.mParent = r2
            r10.mDimensionRatio = r5
            r10.mDimensionRatioSide = r4
            r10.mRelX = r0
            r10.mRelY = r0
            r10.mOffsetX = r0
            r10.mOffsetY = r0
            r10.mBaselineDistance = r0
            float r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            r10.mHorizontalBiasPercent = r5
            r10.mVerticalBiasPercent = r5
            r10.mContainerItemSkip = r0
            r10.mVisibility = r0
            r10.mAnimated = r0
            r10.mDebugName = r2
            r10.mType = r2
            r10.mGroupsToSolver = r0
            r10.mHorizontalChainStyle = r0
            r10.mVerticalChainStyle = r0
            float[] r5 = new float[r1]
            r5 = {x0142: FILL_ARRAY_DATA , data: [-1082130432, -1082130432} // fill-array
            r10.mWeight = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r5[r0] = r2
            r5[r3] = r2
            r10.mListNextMatchConstraintsWidget = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r1[r0] = r2
            r1[r3] = r2
            r10.mNextChainWidget = r1
            r10.mHorizontalNextWidget = r2
            r10.mVerticalNextWidget = r2
            r10.horizontalGroup = r4
            r10.verticalGroup = r4
            r10.f38mX = r11
            r10.f39mY = r12
            r10.mWidth = r13
            r10.mHeight = r14
            r10.addAnchors()
            return
    }

    public ConstraintWidget(java.lang.String r11) {
            r10 = this;
            r10.<init>()
            r0 = 0
            r10.measured = r0
            r1 = 2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun[] r2 = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun[r1]
            r10.run = r2
            r2 = 0
            r10.horizontalRun = r2
            r10.verticalRun = r2
            boolean[] r3 = new boolean[r1]
            r3 = {x0138: FILL_ARRAY_DATA , data: [1, 1} // fill-array
            r10.isTerminalWidget = r3
            r10.mResolvedHasRatio = r0
            r3 = 1
            r10.mMeasureRequested = r3
            r10.OPTIMIZE_WRAP = r0
            r10.OPTIMIZE_WRAP_ON_RESOLVED = r3
            r4 = -1
            r10.mWidthOverride = r4
            r10.mHeightOverride = r4
            androidx.constraintlayout.core.state.WidgetFrame r5 = new androidx.constraintlayout.core.state.WidgetFrame
            r5.<init>(r10)
            r10.frame = r5
            r10.resolvedHorizontal = r0
            r10.resolvedVertical = r0
            r10.horizontalSolvingPass = r0
            r10.verticalSolvingPass = r0
            r10.mHorizontalResolution = r4
            r10.mVerticalResolution = r4
            r10.mWrapBehaviorInParent = r0
            r10.mMatchConstraintDefaultWidth = r0
            r10.mMatchConstraintDefaultHeight = r0
            int[] r5 = new int[r1]
            r10.mResolvedMatchConstraintDefault = r5
            r10.mMatchConstraintMinWidth = r0
            r10.mMatchConstraintMaxWidth = r0
            r5 = 1065353216(0x3f800000, float:1.0)
            r10.mMatchConstraintPercentWidth = r5
            r10.mMatchConstraintMinHeight = r0
            r10.mMatchConstraintMaxHeight = r0
            r10.mMatchConstraintPercentHeight = r5
            r10.mResolvedDimensionRatioSide = r4
            r10.mResolvedDimensionRatio = r5
            int[] r5 = new int[r1]
            r5 = {x013e: FILL_ARRAY_DATA , data: [2147483647, 2147483647} // fill-array
            r10.mMaxDimension = r5
            r5 = 0
            r10.mCircleConstraintAngle = r5
            r10.hasBaseline = r0
            r10.mInVirtualLayout = r0
            r10.mLastHorizontalMeasureSpec = r0
            r10.mLastVerticalMeasureSpec = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            r6.<init>(r10, r7)
            r10.mLeft = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            r6.<init>(r10, r7)
            r10.mTop = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            r6.<init>(r10, r7)
            r10.mRight = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            r6.<init>(r10, r7)
            r10.mBottom = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            r6.<init>(r10, r7)
            r10.mBaseline = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            r6.<init>(r10, r7)
            r10.mCenterX = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            r6.<init>(r10, r7)
            r10.mCenterY = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            r6.<init>(r10, r7)
            r10.mCenter = r6
            r7 = 6
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = new androidx.constraintlayout.core.widgets.ConstraintAnchor[r7]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mLeft
            r7[r0] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mRight
            r7[r3] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mTop
            r7[r1] = r8
            r8 = 3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.mBottom
            r7[r8] = r9
            r8 = 4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.mBaseline
            r7[r8] = r9
            r8 = 5
            r7[r8] = r6
            r10.mListAnchors = r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r10.mAnchors = r6
            boolean[] r6 = new boolean[r1]
            r10.mIsInBarrier = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r6 = new androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6[r0] = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6[r3] = r7
            r10.mListDimensionBehaviors = r6
            r10.mParent = r2
            r10.mWidth = r0
            r10.mHeight = r0
            r10.mDimensionRatio = r5
            r10.mDimensionRatioSide = r4
            r10.f38mX = r0
            r10.f39mY = r0
            r10.mRelX = r0
            r10.mRelY = r0
            r10.mOffsetX = r0
            r10.mOffsetY = r0
            r10.mBaselineDistance = r0
            float r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            r10.mHorizontalBiasPercent = r5
            r10.mVerticalBiasPercent = r5
            r10.mContainerItemSkip = r0
            r10.mVisibility = r0
            r10.mAnimated = r0
            r10.mDebugName = r2
            r10.mType = r2
            r10.mGroupsToSolver = r0
            r10.mHorizontalChainStyle = r0
            r10.mVerticalChainStyle = r0
            float[] r5 = new float[r1]
            r5 = {x0146: FILL_ARRAY_DATA , data: [-1082130432, -1082130432} // fill-array
            r10.mWeight = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r5[r0] = r2
            r5[r3] = r2
            r10.mListNextMatchConstraintsWidget = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r1[r0] = r2
            r1[r3] = r2
            r10.mNextChainWidget = r1
            r10.mHorizontalNextWidget = r2
            r10.mVerticalNextWidget = r2
            r10.horizontalGroup = r4
            r10.verticalGroup = r4
            r10.addAnchors()
            r10.setDebugName(r11)
            return
    }

    public ConstraintWidget(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.setDebugName(r1)
            return
    }

    public ConstraintWidget(java.lang.String r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>(r2, r3, r4, r5)
            r0.setDebugName(r1)
            return
    }

    private void addAnchors() {
            r2 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mLeft
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mTop
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mRight
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mBottom
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mCenterX
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mCenterY
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mCenter
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mBaseline
            r0.add(r1)
            return
    }

    private void applyConstraints(androidx.constraintlayout.core.LinearSystem r32, boolean r33, boolean r34, boolean r35, boolean r36, androidx.constraintlayout.core.SolverVariable r37, androidx.constraintlayout.core.SolverVariable r38, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r39, boolean r40, androidx.constraintlayout.core.widgets.ConstraintAnchor r41, androidx.constraintlayout.core.widgets.ConstraintAnchor r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
            r31 = this;
            r0 = r31
            r10 = r32
            r11 = r37
            r12 = r38
            r13 = r41
            r14 = r42
            r15 = r45
            r1 = r46
            r2 = r54
            r3 = r55
            r4 = r56
            androidx.constraintlayout.core.SolverVariable r9 = r10.createObjectVariable(r13)
            androidx.constraintlayout.core.SolverVariable r8 = r10.createObjectVariable(r14)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r41.getTarget()
            androidx.constraintlayout.core.SolverVariable r7 = r10.createObjectVariable(r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r42.getTarget()
            androidx.constraintlayout.core.SolverVariable r6 = r10.createObjectVariable(r5)
            androidx.constraintlayout.core.Metrics r5 = androidx.constraintlayout.core.LinearSystem.getMetrics()
            if (r5 == 0) goto L40
            androidx.constraintlayout.core.Metrics r5 = androidx.constraintlayout.core.LinearSystem.getMetrics()
            long r11 = r5.nonresolvedWidgets
            r16 = 1
            long r11 = r11 + r16
            r5.nonresolvedWidgets = r11
        L40:
            boolean r11 = r41.isConnected()
            boolean r12 = r42.isConnected()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.mCenter
            boolean r16 = r5.isConnected()
            if (r12 == 0) goto L53
            int r5 = r11 + 1
            goto L54
        L53:
            r5 = r11
        L54:
            if (r16 == 0) goto L58
            int r5 = r5 + 1
        L58:
            if (r48 == 0) goto L5d
            r18 = 3
            goto L5f
        L5d:
            r18 = r53
        L5f:
            int[] r17 = androidx.constraintlayout.core.widgets.ConstraintWidget.C01281.f41x6d00e4a2
            int r19 = r39.ordinal()
            r2 = r17[r19]
            r14 = 1
            if (r2 == r14) goto L73
            r14 = 2
            if (r2 == r14) goto L73
            r14 = 3
            if (r2 == r14) goto L73
            r14 = 4
            if (r2 == r14) goto L78
        L73:
            r2 = r18
        L75:
            r18 = 0
            goto L7e
        L78:
            r2 = r18
            if (r2 == r14) goto L75
            r18 = 1
        L7e:
            int r14 = r0.mWidthOverride
            r13 = -1
            if (r14 == r13) goto L8c
            if (r33 == 0) goto L8c
            r0.mWidthOverride = r13
            r21 = r6
            r18 = 0
            goto L90
        L8c:
            r14 = r44
            r21 = r6
        L90:
            int r6 = r0.mHeightOverride
            if (r6 == r13) goto L9b
            if (r33 != 0) goto L9b
            r0.mHeightOverride = r13
            r14 = r6
            r18 = 0
        L9b:
            int r6 = r0.mVisibility
            r13 = 8
            if (r6 != r13) goto La4
            r14 = 0
            r18 = 0
        La4:
            if (r58 == 0) goto Lbd
            if (r11 != 0) goto Lb2
            if (r12 != 0) goto Lb2
            if (r16 != 0) goto Lb2
            r6 = r43
            r10.addEquality(r9, r6)
            goto Lbd
        Lb2:
            if (r11 == 0) goto Lbd
            if (r12 != 0) goto Lbd
            int r6 = r41.getMargin()
            r10.addEquality(r9, r7, r6, r13)
        Lbd:
            if (r18 != 0) goto Lea
            if (r40 == 0) goto Ld6
            r6 = 3
            r13 = 0
            r10.addEquality(r8, r9, r13, r6)
            r6 = 8
            if (r15 <= 0) goto Lcd
            r10.addGreaterThan(r8, r9, r15, r6)
        Lcd:
            r14 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r14) goto Ldb
            r10.addLowerThan(r8, r9, r1, r6)
            goto Ldb
        Ld6:
            r6 = r13
            r13 = 0
            r10.addEquality(r8, r9, r14, r6)
        Ldb:
            r1 = r4
            r40 = r5
            r13 = r7
            r15 = r8
            r23 = r18
            r14 = r21
            r18 = r36
            r21 = r3
            goto L1ee
        Lea:
            r1 = 2
            r13 = 0
            if (r5 == r1) goto L113
            if (r48 != 0) goto L113
            r1 = 1
            if (r2 == r1) goto Lf5
            if (r2 != 0) goto L113
        Lf5:
            int r1 = java.lang.Math.max(r3, r14)
            if (r4 <= 0) goto Lff
            int r1 = java.lang.Math.min(r4, r1)
        Lff:
            r6 = 8
            r10.addEquality(r8, r9, r1, r6)
            r18 = r36
            r1 = r4
            r40 = r5
            r15 = r8
            r23 = r13
            r14 = r21
            r21 = r3
            r13 = r7
            goto L1ee
        L113:
            r1 = -2
            if (r3 != r1) goto L118
            r6 = r14
            goto L119
        L118:
            r6 = r3
        L119:
            if (r4 != r1) goto L11d
            r1 = r14
            goto L11e
        L11d:
            r1 = r4
        L11e:
            if (r14 <= 0) goto L124
            r3 = 1
            if (r2 == r3) goto L124
            r14 = r13
        L124:
            if (r6 <= 0) goto L12f
            r3 = 8
            r10.addGreaterThan(r8, r9, r6, r3)
            int r14 = java.lang.Math.max(r14, r6)
        L12f:
            if (r1 <= 0) goto L148
            if (r34 == 0) goto L138
            r3 = 1
            if (r2 != r3) goto L138
            r3 = r13
            goto L139
        L138:
            r3 = 1
        L139:
            if (r3 == 0) goto L141
            r3 = 8
            r10.addLowerThan(r8, r9, r1, r3)
            goto L143
        L141:
            r3 = 8
        L143:
            int r14 = java.lang.Math.min(r14, r1)
            goto L14a
        L148:
            r3 = 8
        L14a:
            r4 = 1
            if (r2 != r4) goto L173
            if (r34 == 0) goto L154
            r10.addEquality(r8, r9, r14, r3)
            r4 = 5
            goto L165
        L154:
            if (r50 == 0) goto L15e
            r4 = 5
            r10.addEquality(r8, r9, r14, r4)
            r10.addLowerThan(r8, r9, r14, r3)
            goto L165
        L15e:
            r4 = 5
            r10.addEquality(r8, r9, r14, r4)
            r10.addLowerThan(r8, r9, r14, r3)
        L165:
            r40 = r5
            r13 = r7
            r15 = r8
            r23 = r18
            r14 = r21
            r18 = r36
            r21 = r6
            goto L1ee
        L173:
            r4 = 5
            r14 = 2
            if (r2 != r14) goto L1e2
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r41.getType()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r3 == r4) goto L1a1
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r41.getType()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r3 != r4) goto L188
            goto L1a1
        L188:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.getAnchor(r4)
            androidx.constraintlayout.core.SolverVariable r3 = r10.createObjectVariable(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getAnchor(r13)
            androidx.constraintlayout.core.SolverVariable r4 = r10.createObjectVariable(r4)
            goto L1b9
        L1a1:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.getAnchor(r4)
            androidx.constraintlayout.core.SolverVariable r3 = r10.createObjectVariable(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getAnchor(r13)
            androidx.constraintlayout.core.SolverVariable r4 = r10.createObjectVariable(r4)
        L1b9:
            r23 = r3
            r13 = r4
            androidx.constraintlayout.core.ArrayRow r3 = r32.createRow()
            r24 = 5
            r4 = r8
            r14 = r5
            r5 = r9
            r40 = r14
            r14 = r21
            r21 = r6
            r6 = r13
            r13 = r7
            r7 = r23
            r15 = r8
            r8 = r57
            androidx.constraintlayout.core.ArrayRow r3 = r3.createRowDimensionRatio(r4, r5, r6, r7, r8)
            r10.addConstraint(r3)
            if (r34 == 0) goto L1dd
            r18 = 0
        L1dd:
            r23 = r18
            r18 = r36
            goto L1ee
        L1e2:
            r40 = r5
            r13 = r7
            r15 = r8
            r14 = r21
            r21 = r6
            r23 = r18
            r18 = 1
        L1ee:
            if (r58 == 0) goto L511
            if (r50 == 0) goto L1fe
            r1 = r37
            r4 = r38
            r5 = r40
            r2 = r15
            r3 = 0
            r6 = 2
            r15 = r9
            goto L51b
        L1fe:
            if (r11 != 0) goto L209
            if (r12 != 0) goto L209
            if (r16 != 0) goto L209
            r2 = r15
            r1 = 5
            r3 = 0
            goto L4dc
        L209:
            if (r11 == 0) goto L225
            if (r12 != 0) goto L225
            r7 = r41
            r8 = 0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r7.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.mOwner
            if (r34 == 0) goto L21d
            boolean r1 = r1 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 == 0) goto L21d
            r13 = 8
            goto L21e
        L21d:
            r13 = 5
        L21e:
            r22 = r34
            r3 = r8
            r6 = r13
            r2 = r15
            goto L4df
        L225:
            r7 = r41
            r8 = 0
            if (r11 != 0) goto L25c
            if (r12 == 0) goto L25c
            int r1 = r42.getMargin()
            int r1 = -r1
            r2 = 8
            r10.addEquality(r15, r14, r1, r2)
            if (r34 == 0) goto L4d9
            boolean r1 = r0.OPTIMIZE_WRAP
            if (r1 == 0) goto L252
            boolean r1 = r9.isFinalValue
            if (r1 == 0) goto L252
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mParent
            if (r1 == 0) goto L252
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r1
            if (r33 == 0) goto L24d
            r1.addHorizontalWrapMinVariable(r7)
            goto L4d9
        L24d:
            r1.addVerticalWrapMinVariable(r7)
            goto L4d9
        L252:
            r6 = r37
            r1 = 5
            r10.addGreaterThan(r9, r6, r8, r1)
            r3 = r8
            r2 = r15
            goto L4dc
        L25c:
            r6 = r37
            if (r11 == 0) goto L4d9
            if (r12 == 0) goto L4d9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r7.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r3.mOwner
            r12 = r42
            r3 = 2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r12.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r4.mOwner
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r31.getParent()
            r16 = 6
            if (r23 == 0) goto L368
            if (r2 != 0) goto L2cb
            if (r1 != 0) goto L2a0
            if (r21 != 0) goto L2a0
            boolean r1 = r13.isFinalValue
            if (r1 == 0) goto L295
            boolean r1 = r14.isFinalValue
            if (r1 == 0) goto L295
            int r1 = r41.getMargin()
            r2 = 8
            r10.addEquality(r9, r13, r1, r2)
            int r1 = r42.getMargin()
            int r1 = -r1
            r10.addEquality(r15, r14, r1, r2)
            return
        L295:
            r19 = r8
            r24 = r19
            r1 = 8
            r3 = 8
            r22 = 1
            goto L2a8
        L2a0:
            r22 = r8
            r1 = 5
            r3 = 5
            r19 = 1
            r24 = 1
        L2a8:
            boolean r8 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r8 != 0) goto L2be
            boolean r8 = r5 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r8 == 0) goto L2b1
            goto L2be
        L2b1:
            r8 = r38
            r25 = r22
            r22 = r19
            r19 = r3
        L2b9:
            r3 = r1
            r1 = r16
            goto L3b3
        L2be:
            r8 = r38
            r3 = r1
            r1 = r16
            r25 = r22
            r22 = r19
            r19 = 4
            goto L3b3
        L2cb:
            if (r2 != r3) goto L2e3
            boolean r1 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 != 0) goto L2df
            boolean r1 = r5 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 == 0) goto L2d6
            goto L2df
        L2d6:
            r8 = r38
            r1 = r16
            r3 = 5
            r19 = 5
            goto L3ad
        L2df:
            r8 = r38
            goto L3a8
        L2e3:
            r8 = 1
            if (r2 != r8) goto L2ee
            r8 = r38
            r1 = r16
            r3 = 8
            goto L3ab
        L2ee:
            r8 = 3
            if (r2 != r8) goto L35c
            int r8 = r0.mResolvedDimensionRatioSide
            r3 = -1
            if (r8 != r3) goto L310
            if (r51 == 0) goto L300
            r8 = r38
            if (r34 == 0) goto L2fe
            r1 = 5
            goto L304
        L2fe:
            r1 = 4
            goto L304
        L300:
            r8 = r38
            r1 = 8
        L304:
            r3 = 8
        L306:
            r19 = 5
        L308:
            r22 = 1
            r24 = 1
            r25 = 1
            goto L3b3
        L310:
            if (r48 == 0) goto L331
            r3 = r54
            r8 = 2
            if (r3 == r8) goto L31d
            r1 = 1
            if (r3 != r1) goto L31b
            goto L31d
        L31b:
            r1 = 0
            goto L31e
        L31d:
            r1 = 1
        L31e:
            if (r1 != 0) goto L324
            r1 = 8
            r3 = 5
            goto L326
        L324:
            r1 = 5
            r3 = 4
        L326:
            r8 = r38
            r19 = r3
            r22 = 1
            r24 = 1
            r25 = 1
            goto L2b9
        L331:
            if (r1 <= 0) goto L339
            r8 = r38
            r1 = r16
            r3 = 5
            goto L306
        L339:
            if (r1 != 0) goto L354
            if (r21 != 0) goto L354
            if (r51 != 0) goto L347
            r8 = r38
            r1 = r16
            r3 = 5
            r19 = 8
            goto L308
        L347:
            if (r11 == r4) goto L34d
            if (r5 == r4) goto L34d
            r1 = 4
            goto L34e
        L34d:
            r1 = 5
        L34e:
            r8 = r38
            r3 = r1
            r1 = r16
            goto L359
        L354:
            r8 = r38
            r1 = r16
            r3 = 5
        L359:
            r19 = 4
            goto L308
        L35c:
            r8 = r38
            r1 = r16
            r3 = 5
            r19 = 4
            r22 = 0
            r24 = 0
            goto L3b1
        L368:
            boolean r1 = r13.isFinalValue
            if (r1 == 0) goto L2df
            boolean r1 = r14.isFinalValue
            if (r1 == 0) goto L2df
            int r1 = r41.getMargin()
            int r2 = r42.getMargin()
            r3 = 8
            r48 = r32
            r49 = r9
            r50 = r13
            r51 = r1
            r52 = r47
            r53 = r14
            r54 = r15
            r55 = r2
            r56 = r3
            r48.addCentering(r49, r50, r51, r52, r53, r54, r55, r56)
            if (r34 == 0) goto L3a7
            if (r18 == 0) goto L3a7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r12.mTarget
            if (r1 == 0) goto L39e
            int r13 = r42.getMargin()
            r8 = r38
            goto L3a1
        L39e:
            r8 = r38
            r13 = 0
        L3a1:
            if (r14 == r8) goto L3a7
            r1 = 5
            r10.addGreaterThan(r8, r15, r13, r1)
        L3a7:
            return
        L3a8:
            r1 = r16
            r3 = 5
        L3ab:
            r19 = 4
        L3ad:
            r22 = 1
            r24 = 1
        L3b1:
            r25 = 0
        L3b3:
            if (r24 == 0) goto L3be
            if (r13 != r14) goto L3be
            if (r11 == r4) goto L3be
            r24 = 0
            r26 = 0
            goto L3c0
        L3be:
            r26 = 1
        L3c0:
            if (r22 == 0) goto L406
            if (r23 != 0) goto L3d5
            if (r49 != 0) goto L3d5
            if (r51 != 0) goto L3d5
            if (r13 != r6) goto L3d5
            if (r14 != r8) goto L3d5
            r22 = 0
            r26 = 8
            r27 = 8
            r28 = 0
            goto L3dd
        L3d5:
            r22 = r34
            r27 = r1
            r28 = r26
            r26 = r3
        L3dd:
            int r29 = r41.getMargin()
            int r30 = r42.getMargin()
            r1 = r32
            r3 = r2
            r2 = r9
            r12 = r3
            r3 = r13
            r39 = r12
            r12 = r4
            r4 = r29
            r29 = r12
            r12 = r5
            r5 = r47
            r6 = r14
            r7 = r15
            r8 = r30
            r20 = r15
            r15 = r9
            r9 = r27
            r1.addCentering(r2, r3, r4, r5, r6, r7, r8, r9)
            r3 = r26
            r26 = r28
            goto L410
        L406:
            r39 = r2
            r29 = r4
            r12 = r5
            r20 = r15
            r15 = r9
            r22 = r34
        L410:
            int r1 = r0.mVisibility
            r2 = 8
            if (r1 != r2) goto L41d
            boolean r1 = r42.hasDependents()
            if (r1 != 0) goto L41d
            return
        L41d:
            if (r24 == 0) goto L441
            if (r22 == 0) goto L42f
            if (r13 == r14) goto L42f
            if (r23 != 0) goto L42f
            boolean r1 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 != 0) goto L42d
            boolean r1 = r12 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 == 0) goto L42f
        L42d:
            r3 = r16
        L42f:
            int r1 = r41.getMargin()
            r10.addGreaterThan(r15, r13, r1, r3)
            int r1 = r42.getMargin()
            int r1 = -r1
            r2 = r20
            r10.addLowerThan(r2, r14, r1, r3)
            goto L443
        L441:
            r2 = r20
        L443:
            if (r22 == 0) goto L459
            if (r52 == 0) goto L459
            boolean r1 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 != 0) goto L459
            boolean r1 = r12 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 != 0) goto L459
            r1 = r29
            if (r12 == r1) goto L45b
            r3 = r16
            r4 = r3
            r26 = 1
            goto L45d
        L459:
            r1 = r29
        L45b:
            r4 = r19
        L45d:
            if (r26 == 0) goto L4a7
            if (r25 == 0) goto L487
            if (r51 == 0) goto L465
            if (r35 == 0) goto L487
        L465:
            if (r11 == r1) goto L46c
            if (r12 != r1) goto L46a
            goto L46c
        L46a:
            r6 = r4
            goto L46e
        L46c:
            r6 = r16
        L46e:
            boolean r5 = r11 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r5 != 0) goto L476
            boolean r5 = r12 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r5 == 0) goto L477
        L476:
            r6 = 5
        L477:
            boolean r5 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r5 != 0) goto L47f
            boolean r5 = r12 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r5 == 0) goto L480
        L47f:
            r6 = 5
        L480:
            if (r51 == 0) goto L483
            r6 = 5
        L483:
            int r4 = java.lang.Math.max(r6, r4)
        L487:
            if (r22 == 0) goto L498
            int r3 = java.lang.Math.min(r3, r4)
            if (r48 == 0) goto L497
            if (r51 != 0) goto L497
            if (r11 == r1) goto L495
            if (r12 != r1) goto L497
        L495:
            r4 = 4
            goto L498
        L497:
            r4 = r3
        L498:
            int r1 = r41.getMargin()
            r10.addEquality(r15, r13, r1, r4)
            int r1 = r42.getMargin()
            int r1 = -r1
            r10.addEquality(r2, r14, r1, r4)
        L4a7:
            if (r22 == 0) goto L4b9
            r1 = r37
            if (r1 != r13) goto L4b2
            int r3 = r41.getMargin()
            goto L4b3
        L4b2:
            r3 = 0
        L4b3:
            if (r13 == r1) goto L4b9
            r4 = 5
            r10.addGreaterThan(r15, r1, r3, r4)
        L4b9:
            if (r22 == 0) goto L4d6
            if (r23 == 0) goto L4d6
            if (r45 != 0) goto L4d6
            if (r21 != 0) goto L4d6
            if (r23 == 0) goto L4d0
            r1 = r39
            r3 = 3
            if (r1 != r3) goto L4d0
            r1 = 8
            r3 = 0
            r10.addGreaterThan(r2, r15, r3, r1)
            r1 = 5
            goto L4de
        L4d0:
            r3 = 0
            r1 = 5
            r10.addGreaterThan(r2, r15, r3, r1)
            goto L4de
        L4d6:
            r1 = 5
            r3 = 0
            goto L4de
        L4d9:
            r3 = r8
            r2 = r15
            r1 = 5
        L4dc:
            r22 = r34
        L4de:
            r6 = r1
        L4df:
            if (r22 == 0) goto L510
            if (r18 == 0) goto L510
            r1 = r42
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r1.mTarget
            if (r4 == 0) goto L4f0
            int r13 = r42.getMargin()
            r4 = r38
            goto L4f3
        L4f0:
            r4 = r38
            r13 = r3
        L4f3:
            if (r14 == r4) goto L510
            boolean r3 = r0.OPTIMIZE_WRAP
            if (r3 == 0) goto L50d
            boolean r3 = r2.isFinalValue
            if (r3 == 0) goto L50d
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mParent
            if (r3 == 0) goto L50d
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r3
            if (r33 == 0) goto L509
            r3.addHorizontalWrapMaxVariable(r1)
            goto L50c
        L509:
            r3.addVerticalWrapMaxVariable(r1)
        L50c:
            return
        L50d:
            r10.addGreaterThan(r4, r2, r13, r6)
        L510:
            return
        L511:
            r1 = r37
            r4 = r38
            r2 = r15
            r3 = 0
            r15 = r9
            r5 = r40
            r6 = 2
        L51b:
            if (r5 >= r6) goto L564
            if (r34 == 0) goto L564
            if (r18 == 0) goto L564
            r5 = 8
            r10.addGreaterThan(r15, r1, r3, r5)
            if (r33 != 0) goto L531
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 != 0) goto L52f
            goto L531
        L52f:
            r13 = r3
            goto L532
        L531:
            r13 = 1
        L532:
            if (r33 != 0) goto L55c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L55c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.mOwner
            float r5 = r1.mDimensionRatio
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 == 0) goto L55a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r1.mListDimensionBehaviors
            r5 = r5[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L55a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r1.mListDimensionBehaviors
            r5 = 1
            r1 = r1[r5]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r6) goto L55a
            r14 = r5
            goto L55d
        L55a:
            r14 = r3
            goto L55d
        L55c:
            r14 = r13
        L55d:
            if (r14 == 0) goto L564
            r1 = 8
            r10.addGreaterThan(r4, r2, r3, r1)
        L564:
            return
    }

    private void getSceneString(java.lang.StringBuilder r1, java.lang.String r2, int r3, int r4, int r5, int r6, int r7, int r8, float r9, float r10) {
            r0 = this;
            r1.append(r2)
            java.lang.String r2 = " :  {\n"
            r1.append(r2)
            java.lang.String r2 = "      size"
            r6 = 0
            r0.serializeAttribute(r1, r2, r3, r6)
            java.lang.String r2 = "      min"
            r0.serializeAttribute(r1, r2, r4, r6)
            java.lang.String r2 = "      max"
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0.serializeAttribute(r1, r2, r5, r3)
            java.lang.String r2 = "      matchMin"
            r0.serializeAttribute(r1, r2, r7, r6)
            java.lang.String r2 = "      matchDef"
            r0.serializeAttribute(r1, r2, r8, r6)
            java.lang.String r2 = "      matchPercent"
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.serializeAttribute(r1, r2, r9, r3)
            java.lang.String r2 = "    },\n"
            r1.append(r2)
            return
    }

    private void getSceneString(java.lang.StringBuilder r3, java.lang.String r4, androidx.constraintlayout.core.widgets.ConstraintAnchor r5) {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r5.mTarget
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "    "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = " : [ '"
            r3.append(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r5.mTarget
            r3.append(r4)
            java.lang.String r4 = "'"
            r3.append(r4)
            int r4 = r5.mGoneMargin
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r0) goto L26
            int r4 = r5.mMargin
            if (r4 == 0) goto L3f
        L26:
            java.lang.String r4 = ","
            r3.append(r4)
            int r1 = r5.mMargin
            r3.append(r1)
            int r1 = r5.mGoneMargin
            if (r1 == r0) goto L3f
            r3.append(r4)
            int r5 = r5.mGoneMargin
            r3.append(r5)
            r3.append(r4)
        L3f:
            java.lang.String r4 = " ] ,\n"
            r3.append(r4)
            return
    }

    private boolean isChainHead(int r4) {
            r3 = this;
            int r4 = r4 * 2
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r3.mListAnchors
            r0 = r0[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L2f
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r3.mListAnchors
            r0 = r0[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r3.mListAnchors
            r2 = r1[r4]
            if (r0 == r2) goto L2f
            r0 = 1
            int r4 = r4 + r0
            r1 = r1[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L2f
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r3.mListAnchors
            r1 = r1[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r3.mListAnchors
            r4 = r2[r4]
            if (r1 != r4) goto L2f
            goto L30
        L2f:
            r0 = 0
        L30:
            return r0
    }

    private void serializeAnchor(java.lang.StringBuilder r2, java.lang.String r3, androidx.constraintlayout.core.widgets.ConstraintAnchor r4) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r4.mTarget
            if (r0 != 0) goto L5
            return
        L5:
            r2.append(r3)
            java.lang.String r3 = " : [ '"
            r2.append(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.mTarget
            r2.append(r3)
            java.lang.String r3 = "',"
            r2.append(r3)
            int r3 = r4.mMargin
            r2.append(r3)
            java.lang.String r3 = ","
            r2.append(r3)
            int r4 = r4.mGoneMargin
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = " ] ,\n"
            r2.append(r3)
            return
    }

    private void serializeAttribute(java.lang.StringBuilder r1, java.lang.String r2, float r3, float r4) {
            r0 = this;
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 != 0) goto L5
            return
        L5:
            r1.append(r2)
            java.lang.String r2 = " :   "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ",\n"
            r1.append(r2)
            return
    }

    private void serializeAttribute(java.lang.StringBuilder r1, java.lang.String r2, int r3, int r4) {
            r0 = this;
            if (r3 != r4) goto L3
            return
        L3:
            r1.append(r2)
            java.lang.String r2 = " :   "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ",\n"
            r1.append(r2)
            return
    }

    private void serializeCircle(java.lang.StringBuilder r2, androidx.constraintlayout.core.widgets.ConstraintAnchor r3, float r4) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "circle : [ '"
            r2.append(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mTarget
            r2.append(r0)
            java.lang.String r0 = "',"
            r2.append(r0)
            int r3 = r3.mMargin
            r2.append(r3)
            java.lang.String r3 = ","
            r2.append(r3)
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = " ] ,\n"
            r2.append(r3)
            return
    }

    private void serializeDimensionRatio(java.lang.StringBuilder r2, java.lang.String r3, float r4, int r5) {
            r1 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L6
            return
        L6:
            r2.append(r3)
            java.lang.String r3 = " :  ["
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = ","
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ""
            r2.append(r3)
            java.lang.String r3 = "],\n"
            r2.append(r3)
            return
    }

    private void serializeSize(java.lang.StringBuilder r1, java.lang.String r2, int r3, int r4, int r5, int r6, int r7, int r8, float r9, float r10) {
            r0 = this;
            r1.append(r2)
            java.lang.String r2 = " :  {\n"
            r1.append(r2)
            java.lang.String r2 = "size"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.serializeAttribute(r1, r2, r3, r6)
            java.lang.String r2 = "min"
            r3 = 0
            r0.serializeAttribute(r1, r2, r4, r3)
            java.lang.String r2 = "max"
            r4 = 2147483647(0x7fffffff, float:NaN)
            r0.serializeAttribute(r1, r2, r5, r4)
            java.lang.String r2 = "matchMin"
            r0.serializeAttribute(r1, r2, r7, r3)
            java.lang.String r2 = "matchDef"
            r0.serializeAttribute(r1, r2, r8, r3)
            java.lang.String r2 = "matchPercent"
            r3 = 1
            r0.serializeAttribute(r1, r2, r8, r3)
            java.lang.String r2 = "},\n"
            r1.append(r2)
            return
    }

    public void addChildrenToSolverByDependency(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r8, androidx.constraintlayout.core.LinearSystem r9, java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> r10, int r11, boolean r12) {
            r7 = this;
            if (r12 == 0) goto L18
            boolean r12 = r10.contains(r7)
            if (r12 != 0) goto L9
            return
        L9:
            androidx.constraintlayout.core.widgets.Optimizer.checkMatchParent(r8, r9, r7)
            r10.remove(r7)
            r12 = 64
            boolean r12 = r8.optimizeFor(r12)
            r7.addToSolver(r9, r12)
        L18:
            if (r11 != 0) goto L60
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r7.mLeft
            java.util.HashSet r12 = r12.getDependents()
            if (r12 == 0) goto L3d
            java.util.Iterator r12 = r12.iterator()
        L26:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r12.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mOwner
            r6 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.addChildrenToSolverByDependency(r2, r3, r4, r5, r6)
            goto L26
        L3d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r7.mRight
            java.util.HashSet r12 = r12.getDependents()
            if (r12 == 0) goto Lc9
            java.util.Iterator r12 = r12.iterator()
        L49:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Lc9
            java.lang.Object r0 = r12.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mOwner
            r6 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.addChildrenToSolverByDependency(r2, r3, r4, r5, r6)
            goto L49
        L60:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r7.mTop
            java.util.HashSet r12 = r12.getDependents()
            if (r12 == 0) goto L83
            java.util.Iterator r12 = r12.iterator()
        L6c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r12.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mOwner
            r6 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.addChildrenToSolverByDependency(r2, r3, r4, r5, r6)
            goto L6c
        L83:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r7.mBottom
            java.util.HashSet r12 = r12.getDependents()
            if (r12 == 0) goto La6
            java.util.Iterator r12 = r12.iterator()
        L8f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r0 = r12.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mOwner
            r6 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.addChildrenToSolverByDependency(r2, r3, r4, r5, r6)
            goto L8f
        La6:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r7.mBaseline
            java.util.HashSet r12 = r12.getDependents()
            if (r12 == 0) goto Lc9
            java.util.Iterator r12 = r12.iterator()
        Lb2:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Lc9
            java.lang.Object r0 = r12.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mOwner
            r6 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.addChildrenToSolverByDependency(r2, r3, r4, r5, r6)
            goto Lb2
        Lc9:
            return
    }

    boolean addFirst() {
            r1 = this;
            boolean r0 = r1 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r0 != 0) goto Lb
            boolean r0 = r1 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    public void addToSolver(androidx.constraintlayout.core.LinearSystem r51, boolean r52) {
            r50 = this;
            r15 = r50
            r14 = r51
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mLeft
            androidx.constraintlayout.core.SolverVariable r13 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mRight
            androidx.constraintlayout.core.SolverVariable r12 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mTop
            androidx.constraintlayout.core.SolverVariable r11 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBottom
            androidx.constraintlayout.core.SolverVariable r10 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.core.SolverVariable r9 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            r8 = 2
            r1 = 3
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L57
            if (r0 == 0) goto L36
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.mListDimensionBehaviors
            r0 = r0[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r2) goto L36
            r0 = r7
            goto L37
        L36:
            r0 = r6
        L37:
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.mParent
            if (r2 == 0) goto L45
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r2.mListDimensionBehaviors
            r2 = r2[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L45
            r2 = r7
            goto L46
        L45:
            r2 = r6
        L46:
            int r3 = r15.mWrapBehaviorInParent
            if (r3 == r7) goto L54
            if (r3 == r8) goto L51
            if (r3 == r1) goto L57
            r4 = r0
            r5 = r2
            goto L59
        L51:
            r5 = r2
            r4 = r6
            goto L59
        L54:
            r4 = r0
            r5 = r6
            goto L59
        L57:
            r4 = r6
            r5 = r4
        L59:
            int r0 = r15.mVisibility
            r3 = 8
            if (r0 != r3) goto L74
            boolean r0 = r15.mAnimated
            if (r0 != 0) goto L74
            boolean r0 = r50.hasDependencies()
            if (r0 != 0) goto L74
            boolean[] r0 = r15.mIsInBarrier
            boolean r2 = r0[r6]
            if (r2 != 0) goto L74
            boolean r0 = r0[r7]
            if (r0 != 0) goto L74
            return
        L74:
            boolean r0 = r15.resolvedHorizontal
            r2 = 5
            if (r0 != 0) goto L7d
            boolean r8 = r15.resolvedVertical
            if (r8 == 0) goto Lfa
        L7d:
            if (r0 == 0) goto Lac
            int r0 = r15.f38mX
            r14.addEquality(r13, r0)
            int r0 = r15.f38mX
            int r8 = r15.mWidth
            int r0 = r0 + r8
            r14.addEquality(r12, r0)
            if (r4 == 0) goto Lac
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto Lac
            boolean r8 = r15.OPTIMIZE_WRAP_ON_RESOLVED
            if (r8 == 0) goto La3
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.mLeft
            r0.addHorizontalWrapMinVariable(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.mRight
            r0.addHorizontalWrapMaxVariable(r8)
            goto Lac
        La3:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r12, r6, r2)
        Lac:
            boolean r0 = r15.resolvedVertical
            if (r0 == 0) goto Led
            int r0 = r15.f39mY
            r14.addEquality(r11, r0)
            int r0 = r15.f39mY
            int r8 = r15.mHeight
            int r0 = r0 + r8
            r14.addEquality(r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            boolean r0 = r0.hasDependents()
            if (r0 == 0) goto Lcd
            int r0 = r15.f39mY
            int r8 = r15.mBaselineDistance
            int r0 = r0 + r8
            r14.addEquality(r9, r0)
        Lcd:
            if (r5 == 0) goto Led
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto Led
            boolean r8 = r15.OPTIMIZE_WRAP_ON_RESOLVED
            if (r8 == 0) goto Le4
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.mTop
            r0.addVerticalWrapMinVariable(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.mBottom
            r0.addVerticalWrapMaxVariable(r8)
            goto Led
        Le4:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r10, r6, r2)
        Led:
            boolean r0 = r15.resolvedHorizontal
            if (r0 == 0) goto Lfa
            boolean r0 = r15.resolvedVertical
            if (r0 == 0) goto Lfa
            r15.resolvedHorizontal = r6
            r15.resolvedVertical = r6
            return
        Lfa:
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r17 = 1
            if (r0 == 0) goto L108
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            long r1 = r0.widgets
            long r1 = r1 + r17
            r0.widgets = r1
        L108:
            if (r52 == 0) goto L1a4
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            if (r0 == 0) goto L1a4
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r15.verticalRun
            if (r1 == 0) goto L1a4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            boolean r0 = r0.resolved
            if (r0 == 0) goto L1a4
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            boolean r0 = r0.resolved
            if (r0 == 0) goto L1a4
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            boolean r0 = r0.resolved
            if (r0 == 0) goto L1a4
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            boolean r0 = r0.resolved
            if (r0 == 0) goto L1a4
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto L13c
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            long r1 = r0.graphSolved
            long r1 = r1 + r17
            r0.graphSolved = r1
        L13c:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            int r0 = r0.value
            r14.addEquality(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r14.addEquality(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            int r0 = r0.value
            r14.addEquality(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r14.addEquality(r10, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.baseline
            int r0 = r0.value
            r14.addEquality(r9, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L19f
            if (r4 == 0) goto L186
            boolean[] r0 = r15.isTerminalWidget
            boolean r0 = r0[r6]
            if (r0 == 0) goto L186
            boolean r0 = r50.isInHorizontalChain()
            if (r0 != 0) goto L186
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r12, r6, r3)
        L186:
            if (r5 == 0) goto L19f
            boolean[] r0 = r15.isTerminalWidget
            boolean r0 = r0[r7]
            if (r0 == 0) goto L19f
            boolean r0 = r50.isInVerticalChain()
            if (r0 != 0) goto L19f
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r10, r6, r3)
        L19f:
            r15.resolvedHorizontal = r6
            r15.resolvedVertical = r6
            return
        L1a4:
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto L1b0
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            long r1 = r0.linearSolved
            long r1 = r1 + r17
            r0.linearSolved = r1
        L1b0:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L221
            boolean r0 = r15.isChainHead(r6)
            if (r0 == 0) goto L1c3
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            r0.addChain(r15, r6)
            r0 = r7
            goto L1c7
        L1c3:
            boolean r0 = r50.isInHorizontalChain()
        L1c7:
            boolean r1 = r15.isChainHead(r7)
            if (r1 == 0) goto L1d6
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r1
            r1.addChain(r15, r7)
            r1 = r7
            goto L1da
        L1d6:
            boolean r1 = r50.isInVerticalChain()
        L1da:
            if (r0 != 0) goto L1f9
            if (r4 == 0) goto L1f9
            int r2 = r15.mVisibility
            if (r2 == r3) goto L1f9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L1f9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L1f9
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mRight
            androidx.constraintlayout.core.SolverVariable r2 = r14.createObjectVariable(r2)
            r14.addGreaterThan(r2, r12, r6, r7)
        L1f9:
            if (r1 != 0) goto L21c
            if (r5 == 0) goto L21c
            int r2 = r15.mVisibility
            if (r2 == r3) goto L21c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L21c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L21c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mBaseline
            if (r2 != 0) goto L21c
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mBottom
            androidx.constraintlayout.core.SolverVariable r2 = r14.createObjectVariable(r2)
            r14.addGreaterThan(r2, r10, r6, r7)
        L21c:
            r29 = r0
            r28 = r1
            goto L225
        L221:
            r28 = r6
            r29 = r28
        L225:
            int r0 = r15.mWidth
            int r1 = r15.mMinWidth
            if (r0 >= r1) goto L22c
            r0 = r1
        L22c:
            int r1 = r15.mHeight
            int r2 = r15.mMinHeight
            if (r1 >= r2) goto L233
            r1 = r2
        L233:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r15.mListDimensionBehaviors
            r2 = r2[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 == r8) goto L23d
            r2 = r7
            goto L23e
        L23d:
            r2 = r6
        L23e:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r15.mListDimensionBehaviors
            r8 = r8[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 == r7) goto L248
            r7 = 1
            goto L249
        L248:
            r7 = r6
        L249:
            int r8 = r15.mDimensionRatioSide
            r15.mResolvedDimensionRatioSide = r8
            float r8 = r15.mDimensionRatio
            r15.mResolvedDimensionRatio = r8
            int r6 = r15.mMatchConstraintDefaultWidth
            int r3 = r15.mMatchConstraintDefaultHeight
            r22 = 0
            int r8 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            r22 = r0
            if (r8 <= 0) goto L2fc
            int r8 = r15.mVisibility
            r0 = 8
            if (r8 == r0) goto L2fc
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r8 = 0
            r0 = r0[r8]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r8) goto L26f
            if (r6 != 0) goto L26f
            r6 = 3
        L26f:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r8 = 1
            r0 = r0[r8]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r8) goto L27b
            if (r3 != 0) goto L27b
            r3 = 3
        L27b:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r8 = 0
            r0 = r0[r8]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r8) goto L296
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r8 = 1
            r0 = r0[r8]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r8) goto L296
            r0 = 3
            if (r6 != r0) goto L296
            if (r3 != r0) goto L296
            r15.setupDimensionRatio(r4, r5, r2, r7)
            goto L2f2
        L296:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r2 = 0
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r17 = 4
            if (r0 != r7) goto L2c1
            r0 = 3
            if (r6 != r0) goto L2c1
            r15.mResolvedDimensionRatioSide = r2
            float r0 = r15.mResolvedDimensionRatio
            int r2 = r15.mHeight
            float r2 = (float) r2
            float r0 = r0 * r2
            int r0 = (int) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r15.mListDimensionBehaviors
            r7 = 1
            r2 = r2[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r30 = r1
            r31 = r3
            if (r2 == r8) goto L2bd
            r32 = r17
            goto L304
        L2bd:
            r32 = r6
            r8 = r7
            goto L305
        L2c1:
            r7 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r0 = r0[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r2) goto L2f2
            r0 = 3
            if (r3 != r0) goto L2f2
            r15.mResolvedDimensionRatioSide = r7
            int r0 = r15.mDimensionRatioSide
            r1 = -1
            if (r0 != r1) goto L2db
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r15.mResolvedDimensionRatio
            float r0 = r0 / r1
            r15.mResolvedDimensionRatio = r0
        L2db:
            float r0 = r15.mResolvedDimensionRatio
            int r1 = r15.mWidth
            float r1 = (float) r1
            float r0 = r0 * r1
            int r1 = (int) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r2 = 0
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 == r2) goto L2f2
            r30 = r1
            r32 = r6
            r31 = r17
            goto L302
        L2f2:
            r30 = r1
            r31 = r3
            r32 = r6
            r0 = r22
            r8 = 1
            goto L305
        L2fc:
            r30 = r1
            r31 = r3
            r32 = r6
        L302:
            r0 = r22
        L304:
            r8 = 0
        L305:
            int[] r1 = r15.mResolvedMatchConstraintDefault
            r2 = 0
            r1[r2] = r32
            r2 = 1
            r1[r2] = r31
            r15.mResolvedHasRatio = r8
            if (r8 == 0) goto L31b
            int r1 = r15.mResolvedDimensionRatioSide
            r2 = -1
            if (r1 == 0) goto L318
            if (r1 != r2) goto L31c
        L318:
            r17 = 1
            goto L31e
        L31b:
            r2 = -1
        L31c:
            r17 = 0
        L31e:
            if (r8 == 0) goto L32a
            int r1 = r15.mResolvedDimensionRatioSide
            r3 = 1
            if (r1 == r3) goto L327
            if (r1 != r2) goto L32a
        L327:
            r33 = 1
            goto L32c
        L32a:
            r33 = 0
        L32c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.mListDimensionBehaviors
            r2 = 0
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r2) goto L33c
            boolean r1 = r15 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r1 == 0) goto L33c
            r22 = 1
            goto L33e
        L33c:
            r22 = 0
        L33e:
            if (r22 == 0) goto L343
            r23 = 0
            goto L345
        L343:
            r23 = r0
        L345:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mCenter
            boolean r0 = r0.isConnected()
            r1 = 1
            r34 = r0 ^ 1
            boolean[] r0 = r15.mIsInBarrier
            r2 = 0
            boolean r27 = r0[r2]
            boolean r35 = r0[r1]
            int r0 = r15.mHorizontalResolution
            r36 = 0
            r7 = 2
            if (r0 == r7) goto L44b
            boolean r0 = r15.resolvedHorizontal
            if (r0 != 0) goto L44b
            if (r52 == 0) goto L3ab
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            if (r0 == 0) goto L3ab
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            boolean r0 = r0.resolved
            if (r0 == 0) goto L3ab
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            boolean r0 = r0.resolved
            if (r0 != 0) goto L375
            goto L3ab
        L375:
            if (r52 == 0) goto L44b
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            int r0 = r0.value
            r14.addEquality(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r14.addEquality(r12, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L44b
            if (r4 == 0) goto L44b
            boolean[] r0 = r15.isTerminalWidget
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L44b
            boolean r0 = r50.isInHorizontalChain()
            if (r0 != 0) goto L44b
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r3 = 8
            r14.addGreaterThan(r0, r12, r1, r3)
            goto L44b
        L3ab:
            r3 = 8
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L3ba
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r16 = r0
            goto L3bc
        L3ba:
            r16 = r36
        L3bc:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L3c8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mLeft
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r6 = r0
            goto L3ca
        L3c8:
            r6 = r36
        L3ca:
            boolean[] r0 = r15.isTerminalWidget
            r20 = 0
            boolean r21 = r0[r20]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r37 = r0[r20]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r15.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mRight
            r39 = r2
            int r2 = r15.f38mX
            r40 = r2
            int r2 = r15.mMinWidth
            int[] r3 = r15.mMaxDimension
            r42 = r3[r20]
            float r3 = r15.mHorizontalBiasPercent
            r18 = 1
            r0 = r0[r18]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r7) goto L3f1
            r44 = r18
            goto L3f3
        L3f1:
            r44 = r20
        L3f3:
            int r0 = r15.mMatchConstraintMinWidth
            r24 = r0
            int r0 = r15.mMatchConstraintMaxWidth
            r25 = r0
            float r0 = r15.mMatchConstraintPercentWidth
            r26 = r0
            r0 = r50
            r45 = r1
            r1 = r51
            r19 = r39
            r38 = r40
            r7 = 5
            r39 = r2
            r2 = 1
            r40 = r3
            r3 = r4
            r41 = r4
            r4 = r5
            r46 = r5
            r5 = r21
            r18 = 2
            r7 = r16
            r43 = r8
            r8 = r37
            r47 = r9
            r9 = r22
            r48 = r10
            r10 = r45
            r49 = r11
            r11 = r19
            r37 = r12
            r12 = r38
            r38 = r13
            r13 = r23
            r14 = r39
            r15 = r42
            r16 = r40
            r18 = r44
            r19 = r29
            r20 = r28
            r21 = r27
            r22 = r32
            r23 = r31
            r27 = r34
            r0.applyConstraints(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L45b
        L44b:
            r41 = r4
            r46 = r5
            r43 = r8
            r47 = r9
            r48 = r10
            r49 = r11
            r37 = r12
            r38 = r13
        L45b:
            if (r52 == 0) goto L4c7
            r15 = r50
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            if (r0 == 0) goto L4ba
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            boolean r0 = r0.resolved
            if (r0 == 0) goto L4ba
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            boolean r0 = r0.resolved
            if (r0 == 0) goto L4ba
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            int r0 = r0.value
            r14 = r51
            r13 = r49
            r14.addEquality(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r12 = r48
            r14.addEquality(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.baseline
            int r0 = r0.value
            r1 = r47
            r14.addEquality(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L4b4
            if (r28 != 0) goto L4b4
            if (r46 == 0) goto L4b4
            boolean[] r2 = r15.isTerminalWidget
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L4b0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r2 = 8
            r10 = 0
            r14.addGreaterThan(r0, r12, r10, r2)
            goto L4b8
        L4b0:
            r2 = 8
            r10 = 0
            goto L4b8
        L4b4:
            r2 = 8
            r10 = 0
            r11 = 1
        L4b8:
            r7 = r10
            goto L4d6
        L4ba:
            r14 = r51
            r1 = r47
            r12 = r48
            r13 = r49
            r2 = 8
            r10 = 0
            r11 = 1
            goto L4d5
        L4c7:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r50
            r14 = r51
            r1 = r47
            r12 = r48
            r13 = r49
        L4d5:
            r7 = r11
        L4d6:
            int r0 = r15.mVerticalResolution
            r3 = 2
            if (r0 != r3) goto L4dd
            r6 = r10
            goto L4de
        L4dd:
            r6 = r7
        L4de:
            if (r6 == 0) goto L5c0
            boolean r0 = r15.resolvedVertical
            if (r0 != 0) goto L5c0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r0 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r3) goto L4f2
            boolean r0 = r15 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L4f2
            r9 = r11
            goto L4f3
        L4f2:
            r9 = r10
        L4f3:
            if (r9 == 0) goto L4f7
            r30 = r10
        L4f7:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L503
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r7 = r0
            goto L505
        L503:
            r7 = r36
        L505:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L511
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTop
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r6 = r0
            goto L513
        L511:
            r6 = r36
        L513:
            int r0 = r15.mBaselineDistance
            if (r0 > 0) goto L51b
            int r0 = r15.mVisibility
            if (r0 != r2) goto L55d
        L51b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L548
            int r0 = r50.getBaselineDistance()
            r14.addEquality(r1, r13, r0, r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.mBaseline
            int r3 = r3.getMargin()
            r14.addEquality(r1, r0, r3, r2)
            if (r46 == 0) goto L545
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r1 = 5
            r14.addGreaterThan(r7, r0, r10, r1)
        L545:
            r27 = r10
            goto L55f
        L548:
            int r0 = r15.mVisibility
            if (r0 != r2) goto L556
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            int r0 = r0.getMargin()
            r14.addEquality(r1, r13, r0, r2)
            goto L55d
        L556:
            int r0 = r50.getBaselineDistance()
            r14.addEquality(r1, r13, r0, r2)
        L55d:
            r27 = r34
        L55f:
            boolean[] r0 = r15.isTerminalWidget
            boolean r5 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r8 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r15.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.mBottom
            int r1 = r15.f39mY
            int r2 = r15.mMinHeight
            int[] r10 = r15.mMaxDimension
            r16 = r10[r11]
            float r10 = r15.mVerticalBiasPercent
            r17 = 0
            r0 = r0[r17]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r11) goto L580
            r18 = 1
            goto L582
        L580:
            r18 = r17
        L582:
            int r0 = r15.mMatchConstraintMinHeight
            r24 = r0
            int r0 = r15.mMatchConstraintMaxHeight
            r25 = r0
            float r0 = r15.mMatchConstraintPercentHeight
            r26 = r0
            r0 = r50
            r19 = r1
            r1 = r51
            r20 = r2
            r2 = 0
            r11 = r3
            r3 = r46
            r21 = r4
            r4 = r41
            r17 = r10
            r10 = r21
            r34 = r12
            r12 = r19
            r36 = r13
            r13 = r30
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r33
            r19 = r28
            r20 = r29
            r21 = r35
            r22 = r31
            r23 = r32
            r0.applyConstraints(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L5c4
        L5c0:
            r34 = r12
            r36 = r13
        L5c4:
            if (r43 == 0) goto L5f1
            r6 = 8
            r7 = r50
            int r0 = r7.mResolvedDimensionRatioSide
            r1 = 1
            if (r0 != r1) goto L5df
            float r5 = r7.mResolvedDimensionRatio
            r0 = r51
            r1 = r34
            r2 = r36
            r3 = r37
            r4 = r38
            r0.addRatio(r1, r2, r3, r4, r5, r6)
            goto L5f3
        L5df:
            float r5 = r7.mResolvedDimensionRatio
            r6 = 8
            r0 = r51
            r1 = r37
            r2 = r38
            r3 = r34
            r4 = r36
            r0.addRatio(r1, r2, r3, r4, r5, r6)
            goto L5f3
        L5f1:
            r7 = r50
        L5f3:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.mCenter
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L61b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.mCenter
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getOwner()
            float r1 = r7.mCircleConstraintAngle
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.mCenter
            int r2 = r2.getMargin()
            r3 = r51
            r3.addCenterPoint(r7, r0, r1, r2)
        L61b:
            r0 = 0
            r7.resolvedHorizontal = r0
            r7.resolvedVertical = r0
            return
    }

    public boolean allowedInBarrier() {
            r2 = this;
            int r0 = r2.mVisibility
            r1 = 8
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public void connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r2, androidx.constraintlayout.core.widgets.ConstraintWidget r3, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r4) {
            r1 = this;
            r0 = 0
            r1.connect(r2, r3, r4, r0)
            return
    }

    public void connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r4, androidx.constraintlayout.core.widgets.ConstraintWidget r5, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r6, int r7) {
            r3 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            r1 = 0
            if (r4 != r0) goto Le1
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            if (r6 != r4) goto L9e
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.getAnchor(r6)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r3.getAnchor(r7)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.getAnchor(r0)
            r2 = 1
            if (r4 == 0) goto L2a
            boolean r4 = r4.isConnected()
            if (r4 != 0) goto L32
        L2a:
            if (r6 == 0) goto L34
            boolean r4 = r6.isConnected()
            if (r4 == 0) goto L34
        L32:
            r4 = r1
            goto L43
        L34:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            r3.connect(r4, r5, r6, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            r3.connect(r4, r5, r6, r1)
            r4 = r2
        L43:
            if (r7 == 0) goto L4b
            boolean r6 = r7.isConnected()
            if (r6 != 0) goto L53
        L4b:
            if (r0 == 0) goto L55
            boolean r6 = r0.isConnected()
            if (r6 == 0) goto L55
        L53:
            r2 = r1
            goto L63
        L55:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            r3.connect(r6, r5, r7, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            r3.connect(r6, r5, r7, r1)
        L63:
            if (r4 == 0) goto L78
            if (r2 == 0) goto L78
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.getAnchor(r6)
            r4.connect(r5, r1)
            goto L240
        L78:
            if (r4 == 0) goto L8b
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.getAnchor(r6)
            r4.connect(r5, r1)
            goto L240
        L8b:
            if (r2 == 0) goto L240
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.getAnchor(r6)
            r4.connect(r5, r1)
            goto L240
        L9e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            if (r6 == r4) goto Lc8
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            if (r6 != r4) goto La7
            goto Lc8
        La7:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r6 == r4) goto Laf
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r6 != r4) goto L240
        Laf:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            r3.connect(r4, r5, r6, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            r3.connect(r4, r5, r6, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.getAnchor(r6)
            r4.connect(r5, r1)
            goto L240
        Lc8:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            r3.connect(r4, r5, r6, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            r3.connect(r4, r5, r6, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.getAnchor(r6)
            r4.connect(r5, r1)
            goto L240
        Le1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            if (r4 != r0) goto L10e
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            if (r6 == r0) goto Led
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            if (r6 != r0) goto L10e
        Led:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.getAnchor(r6)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.getAnchor(r6)
            r4.connect(r5, r1)
            r6.connect(r5, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            r4.connect(r5, r1)
            goto L240
        L10e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r4 != r0) goto L13b
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r6 == r0) goto L11a
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r6 != r0) goto L13b
        L11a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r5.getAnchor(r6)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r3.getAnchor(r5)
            r5.connect(r4, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r3.getAnchor(r5)
            r5.connect(r4, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r3.getAnchor(r5)
            r5.connect(r4, r1)
            goto L240
        L13b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            if (r4 != r0) goto L170
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            if (r6 != r0) goto L170
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r5.getAnchor(r7)
            r4.connect(r7, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r5.getAnchor(r7)
            r4.connect(r7, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.getAnchor(r6)
            r4.connect(r5, r1)
            goto L240
        L170:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r4 != r0) goto L1a5
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r6 != r0) goto L1a5
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r5.getAnchor(r7)
            r4.connect(r7, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r5.getAnchor(r7)
            r4.connect(r7, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.getAnchor(r6)
            r4.connect(r5, r1)
            goto L240
        L1a5:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.getAnchor(r6)
            boolean r6 = r0.isValidConnection(r5)
            if (r6 == 0) goto L240
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            if (r4 != r6) goto L1ce
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.getAnchor(r6)
            if (r4 == 0) goto L1c8
            r4.reset()
        L1c8:
            if (r6 == 0) goto L23d
            r6.reset()
            goto L23d
        L1ce:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r4 == r6) goto L209
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r4 != r6) goto L1d7
            goto L209
        L1d7:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            if (r4 == r6) goto L1df
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            if (r4 != r6) goto L23d
        L1df:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.getAnchor(r6)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r6.getTarget()
            if (r1 == r5) goto L1ee
            r6.reset()
        L1ee:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getOpposite()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.getAnchor(r6)
            boolean r1 = r6.isConnected()
            if (r1 == 0) goto L23d
            r4.reset()
            r6.reset()
            goto L23d
        L209:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.getAnchor(r6)
            if (r6 == 0) goto L214
            r6.reset()
        L214:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.getAnchor(r6)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r6.getTarget()
            if (r1 == r5) goto L223
            r6.reset()
        L223:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getOpposite()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.getAnchor(r6)
            boolean r1 = r6.isConnected()
            if (r1 == 0) goto L23d
            r4.reset()
            r6.reset()
        L23d:
            r0.connect(r5, r7)
        L240:
            return
    }

    public void connect(androidx.constraintlayout.core.widgets.ConstraintAnchor r2, androidx.constraintlayout.core.widgets.ConstraintAnchor r3, int r4) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.getOwner()
            if (r0 != r1) goto L15
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = r2.getType()
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r3.getOwner()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r3.getType()
            r1.connect(r2, r0, r3, r4)
        L15:
            return
    }

    public void connectCircularConstraint(androidx.constraintlayout.core.widgets.ConstraintWidget r7, float r8, int r9) {
            r6 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            r5 = 0
            r0 = r6
            r2 = r7
            r4 = r9
            r0.immediateConnect(r1, r2, r3, r4, r5)
            r6.mCircleConstraintAngle = r8
            return
    }

    public void copy(androidx.constraintlayout.core.widgets.ConstraintWidget r7, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> r8) {
            r6 = this;
            int r0 = r7.mHorizontalResolution
            r6.mHorizontalResolution = r0
            int r0 = r7.mVerticalResolution
            r6.mVerticalResolution = r0
            int r0 = r7.mMatchConstraintDefaultWidth
            r6.mMatchConstraintDefaultWidth = r0
            int r0 = r7.mMatchConstraintDefaultHeight
            r6.mMatchConstraintDefaultHeight = r0
            int[] r0 = r6.mResolvedMatchConstraintDefault
            int[] r1 = r7.mResolvedMatchConstraintDefault
            r2 = 0
            r3 = r1[r2]
            r0[r2] = r3
            r3 = 1
            r1 = r1[r3]
            r0[r3] = r1
            int r0 = r7.mMatchConstraintMinWidth
            r6.mMatchConstraintMinWidth = r0
            int r0 = r7.mMatchConstraintMaxWidth
            r6.mMatchConstraintMaxWidth = r0
            int r0 = r7.mMatchConstraintMinHeight
            r6.mMatchConstraintMinHeight = r0
            int r0 = r7.mMatchConstraintMaxHeight
            r6.mMatchConstraintMaxHeight = r0
            float r0 = r7.mMatchConstraintPercentHeight
            r6.mMatchConstraintPercentHeight = r0
            boolean r0 = r7.mIsWidthWrapContent
            r6.mIsWidthWrapContent = r0
            boolean r0 = r7.mIsHeightWrapContent
            r6.mIsHeightWrapContent = r0
            int r0 = r7.mResolvedDimensionRatioSide
            r6.mResolvedDimensionRatioSide = r0
            float r0 = r7.mResolvedDimensionRatio
            r6.mResolvedDimensionRatio = r0
            int[] r0 = r7.mMaxDimension
            int r1 = r0.length
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r6.mMaxDimension = r0
            float r0 = r7.mCircleConstraintAngle
            r6.mCircleConstraintAngle = r0
            boolean r0 = r7.hasBaseline
            r6.hasBaseline = r0
            boolean r0 = r7.inPlaceholder
            r6.inPlaceholder = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mLeft
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mTop
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mRight
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mBottom
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mBaseline
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mCenterX
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mCenterY
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mCenter
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r6.mListDimensionBehaviors
            r1 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = (androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[]) r0
            r6.mListDimensionBehaviors = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.mParent
            r1 = 0
            if (r0 != 0) goto L91
            r0 = r1
            goto L99
        L91:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.mParent
            java.lang.Object r0 = r8.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r0
        L99:
            r6.mParent = r0
            int r0 = r7.mWidth
            r6.mWidth = r0
            int r0 = r7.mHeight
            r6.mHeight = r0
            float r0 = r7.mDimensionRatio
            r6.mDimensionRatio = r0
            int r0 = r7.mDimensionRatioSide
            r6.mDimensionRatioSide = r0
            int r0 = r7.f38mX
            r6.f38mX = r0
            int r0 = r7.f39mY
            r6.f39mY = r0
            int r0 = r7.mRelX
            r6.mRelX = r0
            int r0 = r7.mRelY
            r6.mRelY = r0
            int r0 = r7.mOffsetX
            r6.mOffsetX = r0
            int r0 = r7.mOffsetY
            r6.mOffsetY = r0
            int r0 = r7.mBaselineDistance
            r6.mBaselineDistance = r0
            int r0 = r7.mMinWidth
            r6.mMinWidth = r0
            int r0 = r7.mMinHeight
            r6.mMinHeight = r0
            float r0 = r7.mHorizontalBiasPercent
            r6.mHorizontalBiasPercent = r0
            float r0 = r7.mVerticalBiasPercent
            r6.mVerticalBiasPercent = r0
            java.lang.Object r0 = r7.mCompanionWidget
            r6.mCompanionWidget = r0
            int r0 = r7.mContainerItemSkip
            r6.mContainerItemSkip = r0
            int r0 = r7.mVisibility
            r6.mVisibility = r0
            boolean r0 = r7.mAnimated
            r6.mAnimated = r0
            java.lang.String r0 = r7.mDebugName
            r6.mDebugName = r0
            java.lang.String r0 = r7.mType
            r6.mType = r0
            int r0 = r7.mDistToTop
            r6.mDistToTop = r0
            int r0 = r7.mDistToLeft
            r6.mDistToLeft = r0
            int r0 = r7.mDistToRight
            r6.mDistToRight = r0
            int r0 = r7.mDistToBottom
            r6.mDistToBottom = r0
            boolean r0 = r7.mLeftHasCentered
            r6.mLeftHasCentered = r0
            boolean r0 = r7.mRightHasCentered
            r6.mRightHasCentered = r0
            boolean r0 = r7.mTopHasCentered
            r6.mTopHasCentered = r0
            boolean r0 = r7.mBottomHasCentered
            r6.mBottomHasCentered = r0
            boolean r0 = r7.mHorizontalWrapVisited
            r6.mHorizontalWrapVisited = r0
            boolean r0 = r7.mVerticalWrapVisited
            r6.mVerticalWrapVisited = r0
            int r0 = r7.mHorizontalChainStyle
            r6.mHorizontalChainStyle = r0
            int r0 = r7.mVerticalChainStyle
            r6.mVerticalChainStyle = r0
            boolean r0 = r7.mHorizontalChainFixedPosition
            r6.mHorizontalChainFixedPosition = r0
            boolean r0 = r7.mVerticalChainFixedPosition
            r6.mVerticalChainFixedPosition = r0
            float[] r0 = r6.mWeight
            float[] r4 = r7.mWeight
            r5 = r4[r2]
            r0[r2] = r5
            r4 = r4[r3]
            r0[r3] = r4
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r6.mListNextMatchConstraintsWidget
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r7.mListNextMatchConstraintsWidget
            r5 = r4[r2]
            r0[r2] = r5
            r4 = r4[r3]
            r0[r3] = r4
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r6.mNextChainWidget
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r7.mNextChainWidget
            r5 = r4[r2]
            r0[r2] = r5
            r2 = r4[r3]
            r0[r3] = r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.mHorizontalNextWidget
            if (r0 != 0) goto L151
            r0 = r1
            goto L157
        L151:
            java.lang.Object r0 = r8.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r0
        L157:
            r6.mHorizontalNextWidget = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r7.mVerticalNextWidget
            if (r7 != 0) goto L15e
            goto L165
        L15e:
            java.lang.Object r7 = r8.get(r7)
            r1 = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r1
        L165:
            r6.mVerticalNextWidget = r1
            return
    }

    public void createObjectVariables(androidx.constraintlayout.core.LinearSystem r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mLeft
            r2.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTop
            r2.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mRight
            r2.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mBottom
            r2.createObjectVariable(r0)
            int r0 = r1.mBaselineDistance
            if (r0 <= 0) goto L1d
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mBaseline
            r2.createObjectVariable(r0)
        L1d:
            return
    }

    public void ensureMeasureRequested() {
            r1 = this;
            r0 = 1
            r1.mMeasureRequested = r0
            return
    }

    public void ensureWidgetRuns() {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r1.horizontalRun
            if (r0 != 0) goto Lb
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = new androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun
            r0.<init>(r1)
            r1.horizontalRun = r0
        Lb:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r1.verticalRun
            if (r0 != 0) goto L16
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = new androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun
            r0.<init>(r1)
            r1.verticalRun = r0
        L16:
            return
    }

    public androidx.constraintlayout.core.widgets.ConstraintAnchor getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r3) {
            r2 = this;
            int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.C01281.f40x6930e354
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2c;
                case 2: goto L29;
                case 3: goto L26;
                case 4: goto L23;
                case 5: goto L20;
                case 6: goto L1d;
                case 7: goto L1a;
                case 8: goto L17;
                case 9: goto L15;
                default: goto Lb;
            }
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r3 = r3.name()
            r0.<init>(r3)
            throw r0
        L15:
            r3 = 0
            return r3
        L17:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mCenterY
            return r3
        L1a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mCenterX
            return r3
        L1d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mCenter
            return r3
        L20:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mBaseline
            return r3
        L23:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mBottom
            return r3
        L26:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mRight
            return r3
        L29:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mTop
            return r3
        L2c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mLeft
            return r3
    }

    public java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> getAnchors() {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.mAnchors
            return r0
    }

    public int getBaselineDistance() {
            r1 = this;
            int r0 = r1.mBaselineDistance
            return r0
    }

    public float getBiasPercent(int r2) {
            r1 = this;
            if (r2 != 0) goto L5
            float r2 = r1.mHorizontalBiasPercent
            return r2
        L5:
            r0 = 1
            if (r2 != r0) goto Lb
            float r2 = r1.mVerticalBiasPercent
            return r2
        Lb:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r2
    }

    public int getBottom() {
            r2 = this;
            int r0 = r2.getY()
            int r1 = r2.mHeight
            int r0 = r0 + r1
            return r0
    }

    public java.lang.Object getCompanionWidget() {
            r1 = this;
            java.lang.Object r0 = r1.mCompanionWidget
            return r0
    }

    public int getContainerItemSkip() {
            r1 = this;
            int r0 = r1.mContainerItemSkip
            return r0
    }

    public java.lang.String getDebugName() {
            r1 = this;
            java.lang.String r0 = r1.mDebugName
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour getDimensionBehaviour(int r2) {
            r1 = this;
            if (r2 != 0) goto L7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r1.getHorizontalDimensionBehaviour()
            return r2
        L7:
            r0 = 1
            if (r2 != r0) goto Lf
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r1.getVerticalDimensionBehaviour()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public float getDimensionRatio() {
            r1 = this;
            float r0 = r1.mDimensionRatio
            return r0
    }

    public int getDimensionRatioSide() {
            r1 = this;
            int r0 = r1.mDimensionRatioSide
            return r0
    }

    public boolean getHasBaseline() {
            r1 = this;
            boolean r0 = r1.hasBaseline
            return r0
    }

    public int getHeight() {
            r2 = this;
            int r0 = r2.mVisibility
            r1 = 8
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r2.mHeight
            return r0
    }

    public float getHorizontalBiasPercent() {
            r1 = this;
            float r0 = r1.mHorizontalBiasPercent
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getHorizontalChainControlWidget() {
            r5 = this;
            boolean r0 = r5.isInHorizontalChain()
            r1 = 0
            if (r0 == 0) goto L46
            r2 = r5
            r0 = r1
        L9:
            if (r0 != 0) goto L45
            if (r2 == 0) goto L45
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.getAnchor(r3)
            if (r3 != 0) goto L17
            r3 = r1
            goto L1b
        L17:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.getTarget()
        L1b:
            if (r3 != 0) goto L1f
            r3 = r1
            goto L23
        L1f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.getOwner()
        L23:
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r5.getParent()
            if (r3 != r4) goto L2b
            r1 = r2
            goto L46
        L2b:
            if (r3 != 0) goto L2f
            r4 = r1
            goto L39
        L2f:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getTarget()
        L39:
            if (r4 == 0) goto L43
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r4.getOwner()
            if (r4 == r2) goto L43
            r0 = r2
            goto L9
        L43:
            r2 = r3
            goto L9
        L45:
            r1 = r0
        L46:
            return r1
    }

    public int getHorizontalChainStyle() {
            r1 = this;
            int r0 = r1.mHorizontalChainStyle
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour getHorizontalDimensionBehaviour() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r2.mListDimensionBehaviors
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    public int getHorizontalMargin() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mLeft
            r1 = 0
            if (r0 == 0) goto L8
            int r0 = r0.mMargin
            int r1 = r1 + r0
        L8:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mRight
            if (r0 == 0) goto Lf
            int r0 = r0.mMargin
            int r1 = r1 + r0
        Lf:
            return r1
    }

    public int getLastHorizontalMeasureSpec() {
            r1 = this;
            int r0 = r1.mLastHorizontalMeasureSpec
            return r0
    }

    public int getLastVerticalMeasureSpec() {
            r1 = this;
            int r0 = r1.mLastVerticalMeasureSpec
            return r0
    }

    public int getLeft() {
            r1 = this;
            int r0 = r1.getX()
            return r0
    }

    public int getLength(int r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r2 = r1.getWidth()
            return r2
        L7:
            r0 = 1
            if (r2 != r0) goto Lf
            int r2 = r1.getHeight()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public int getMaxHeight() {
            r2 = this;
            int[] r0 = r2.mMaxDimension
            r1 = 1
            r0 = r0[r1]
            return r0
    }

    public int getMaxWidth() {
            r2 = this;
            int[] r0 = r2.mMaxDimension
            r1 = 0
            r0 = r0[r1]
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

    public androidx.constraintlayout.core.widgets.ConstraintWidget getNextChainMember(int r2) {
            r1 = this;
            if (r2 != 0) goto L17
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L2f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mRight
            if (r2 != r0) goto L2f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.mOwner
            return r2
        L17:
            r0 = 1
            if (r2 != r0) goto L2f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L2f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mBottom
            if (r2 != r0) goto L2f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.mOwner
            return r2
        L2f:
            r2 = 0
            return r2
    }

    public int getOptimizerWrapHeight() {
            r4 = this;
            int r0 = r4.mHeight
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r4.mListDimensionBehaviors
            r2 = 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r3) goto L25
            int r1 = r4.mMatchConstraintDefaultHeight
            if (r1 != r2) goto L16
            int r1 = r4.mMatchConstraintMinHeight
            int r0 = java.lang.Math.max(r1, r0)
            goto L1e
        L16:
            int r0 = r4.mMatchConstraintMinHeight
            if (r0 <= 0) goto L1d
            r4.mHeight = r0
            goto L1e
        L1d:
            r0 = 0
        L1e:
            int r1 = r4.mMatchConstraintMaxHeight
            if (r1 <= 0) goto L25
            if (r1 >= r0) goto L25
            r0 = r1
        L25:
            return r0
    }

    public int getOptimizerWrapWidth() {
            r4 = this;
            int r0 = r4.mWidth
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r4.mListDimensionBehaviors
            r2 = 0
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r3) goto L26
            int r1 = r4.mMatchConstraintDefaultWidth
            r3 = 1
            if (r1 != r3) goto L17
            int r1 = r4.mMatchConstraintMinWidth
            int r0 = java.lang.Math.max(r1, r0)
            goto L1f
        L17:
            int r0 = r4.mMatchConstraintMinWidth
            if (r0 <= 0) goto L1e
            r4.mWidth = r0
            goto L1f
        L1e:
            r0 = r2
        L1f:
            int r1 = r4.mMatchConstraintMaxWidth
            if (r1 <= 0) goto L26
            if (r1 >= r0) goto L26
            r0 = r1
        L26:
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getParent() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mParent
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getPreviousChainMember(int r2) {
            r1 = this;
            if (r2 != 0) goto L17
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L2f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mLeft
            if (r2 != r0) goto L2f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.mOwner
            return r2
        L17:
            r0 = 1
            if (r2 != r0) goto L2f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L2f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTop
            if (r2 != r0) goto L2f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.mOwner
            return r2
        L2f:
            r2 = 0
            return r2
    }

    int getRelativePositioning(int r2) {
            r1 = this;
            if (r2 != 0) goto L5
            int r2 = r1.mRelX
            return r2
        L5:
            r0 = 1
            if (r2 != r0) goto Lb
            int r2 = r1.mRelY
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public int getRight() {
            r2 = this;
            int r0 = r2.getX()
            int r1 = r2.mWidth
            int r0 = r0 + r1
            return r0
    }

    protected int getRootX() {
            r2 = this;
            int r0 = r2.f38mX
            int r1 = r2.mOffsetX
            int r0 = r0 + r1
            return r0
    }

    protected int getRootY() {
            r2 = this;
            int r0 = r2.f39mY
            int r1 = r2.mOffsetY
            int r0 = r0 + r1
            return r0
    }

    public androidx.constraintlayout.core.widgets.analyzer.WidgetRun getRun(int r2) {
            r1 = this;
            if (r2 != 0) goto L5
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            return r2
        L5:
            r0 = 1
            if (r2 != r0) goto Lb
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public void getSceneString(java.lang.StringBuilder r13) {
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "  "
            r0.<init>(r1)
            java.lang.String r1 = r12.stringId
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":{\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "    actualWidth:"
            r0.<init>(r1)
            int r1 = r12.mWidth
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.append(r0)
            java.lang.String r0 = "\n"
            r13.append(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "    actualHeight:"
            r1.<init>(r2)
            int r2 = r12.mHeight
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r13.append(r1)
            r13.append(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "    actualLeft:"
            r1.<init>(r2)
            int r2 = r12.f38mX
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r13.append(r1)
            r13.append(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "    actualTop:"
            r1.<init>(r2)
            int r2 = r12.f39mY
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r13.append(r1)
            r13.append(r0)
            java.lang.String r0 = "left"
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r12.mLeft
            r12.getSceneString(r13, r0, r1)
            java.lang.String r0 = "top"
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r12.mTop
            r12.getSceneString(r13, r0, r1)
            java.lang.String r0 = "right"
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r12.mRight
            r12.getSceneString(r13, r0, r1)
            java.lang.String r0 = "bottom"
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r12.mBottom
            r12.getSceneString(r13, r0, r1)
            java.lang.String r0 = "baseline"
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r12.mBaseline
            r12.getSceneString(r13, r0, r1)
            java.lang.String r0 = "centerX"
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r12.mCenterX
            r12.getSceneString(r13, r0, r1)
            java.lang.String r0 = "centerY"
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r12.mCenterY
            r12.getSceneString(r13, r0, r1)
            java.lang.String r2 = "    width"
            int r3 = r12.mWidth
            int r4 = r12.mMinWidth
            int[] r0 = r12.mMaxDimension
            r11 = 0
            r5 = r0[r11]
            int r6 = r12.mWidthOverride
            int r7 = r12.mMatchConstraintMinWidth
            int r8 = r12.mMatchConstraintDefaultWidth
            float r9 = r12.mMatchConstraintPercentWidth
            float[] r0 = r12.mWeight
            r10 = r0[r11]
            r0 = r12
            r1 = r13
            r0.getSceneString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r2 = "    height"
            int r3 = r12.mHeight
            int r4 = r12.mMinHeight
            int[] r0 = r12.mMaxDimension
            r1 = 1
            r5 = r0[r1]
            int r6 = r12.mHeightOverride
            int r7 = r12.mMatchConstraintMinHeight
            int r8 = r12.mMatchConstraintDefaultHeight
            float r9 = r12.mMatchConstraintPercentHeight
            float[] r0 = r12.mWeight
            r10 = r0[r1]
            r0 = r12
            r1 = r13
            r0.getSceneString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r0 = r12.mDimensionRatio
            int r1 = r12.mDimensionRatioSide
            java.lang.String r2 = "    dimensionRatio"
            r12.serializeDimensionRatio(r13, r2, r0, r1)
            float r0 = r12.mHorizontalBiasPercent
            float r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            java.lang.String r2 = "    horizontalBias"
            r12.serializeAttribute(r13, r2, r0, r1)
            float r0 = r12.mVerticalBiasPercent
            float r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            java.lang.String r2 = "    verticalBias"
            r12.serializeAttribute(r13, r2, r0, r1)
            java.lang.String r0 = "    horizontalChainStyle"
            int r1 = r12.mHorizontalChainStyle
            r12.serializeAttribute(r13, r0, r1, r11)
            java.lang.String r0 = "    verticalChainStyle"
            int r1 = r12.mVerticalChainStyle
            r12.serializeAttribute(r13, r0, r1, r11)
            java.lang.String r0 = "  }"
            r13.append(r0)
            return
    }

    public int getTop() {
            r1 = this;
            int r0 = r1.getY()
            return r0
    }

    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.mType
            return r0
    }

    public float getVerticalBiasPercent() {
            r1 = this;
            float r0 = r1.mVerticalBiasPercent
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getVerticalChainControlWidget() {
            r5 = this;
            boolean r0 = r5.isInVerticalChain()
            r1 = 0
            if (r0 == 0) goto L46
            r2 = r5
            r0 = r1
        L9:
            if (r0 != 0) goto L45
            if (r2 == 0) goto L45
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.getAnchor(r3)
            if (r3 != 0) goto L17
            r3 = r1
            goto L1b
        L17:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.getTarget()
        L1b:
            if (r3 != 0) goto L1f
            r3 = r1
            goto L23
        L1f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.getOwner()
        L23:
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r5.getParent()
            if (r3 != r4) goto L2b
            r1 = r2
            goto L46
        L2b:
            if (r3 != 0) goto L2f
            r4 = r1
            goto L39
        L2f:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getTarget()
        L39:
            if (r4 == 0) goto L43
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r4.getOwner()
            if (r4 == r2) goto L43
            r0 = r2
            goto L9
        L43:
            r2 = r3
            goto L9
        L45:
            r1 = r0
        L46:
            return r1
    }

    public int getVerticalChainStyle() {
            r1 = this;
            int r0 = r1.mVerticalChainStyle
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour getVerticalDimensionBehaviour() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r2.mListDimensionBehaviors
            r1 = 1
            r0 = r0[r1]
            return r0
    }

    public int getVerticalMargin() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mLeft
            r1 = 0
            if (r0 == 0) goto La
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mTop
            int r0 = r0.mMargin
            int r1 = r1 + r0
        La:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mRight
            if (r0 == 0) goto L13
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mBottom
            int r0 = r0.mMargin
            int r1 = r1 + r0
        L13:
            return r1
    }

    public int getVisibility() {
            r1 = this;
            int r0 = r1.mVisibility
            return r0
    }

    public int getWidth() {
            r2 = this;
            int r0 = r2.mVisibility
            r1 = 8
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r2.mWidth
            return r0
    }

    public int getWrapBehaviorInParent() {
            r1 = this;
            int r0 = r1.mWrapBehaviorInParent
            return r0
    }

    public int getX() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.mParent
            if (r0 == 0) goto L10
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r1 == 0) goto L10
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            int r0 = r0.mPaddingLeft
            int r1 = r2.f38mX
            int r0 = r0 + r1
            return r0
        L10:
            int r0 = r2.f38mX
            return r0
    }

    public int getY() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.mParent
            if (r0 == 0) goto L10
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r1 == 0) goto L10
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            int r0 = r0.mPaddingTop
            int r1 = r2.f39mY
            int r0 = r0 + r1
            return r0
        L10:
            int r0 = r2.f39mY
            return r0
    }

    public boolean hasBaseline() {
            r1 = this;
            boolean r0 = r1.hasBaseline
            return r0
    }

    public boolean hasDanglingDimension(int r5) {
            r4 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L1d
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto Ld
            r5 = r1
            goto Le
        Ld:
            r5 = r2
        Le:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L16
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r5 = r5 + r3
            if (r5 >= r0) goto L1b
            goto L1c
        L1b:
            r1 = r2
        L1c:
            return r1
        L1d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L25
            r5 = r1
            goto L26
        L25:
            r5 = r2
        L26:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L2e
            r3 = r1
            goto L2f
        L2e:
            r3 = r2
        L2f:
            int r5 = r5 + r3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L38
            r3 = r1
            goto L39
        L38:
            r3 = r2
        L39:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3d
            goto L3e
        L3d:
            r1 = r2
        L3e:
            return r1
    }

    public boolean hasDependencies() {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r4.mAnchors
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1d
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r3 = r4.mAnchors
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            boolean r3 = r3.hasDependents()
            if (r3 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            int r2 = r2 + 1
            goto L8
        L1d:
            return r1
    }

    public boolean hasDimensionOverride() {
            r2 = this;
            int r0 = r2.mWidthOverride
            r1 = -1
            if (r0 != r1) goto Lc
            int r0 = r2.mHeightOverride
            if (r0 == r1) goto La
            goto Lc
        La:
            r0 = 0
            goto Ld
        Lc:
            r0 = 1
        Ld:
            return r0
    }

    public boolean hasResolvedTargets(int r5, int r6) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L48
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L8c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            boolean r5 = r5.hasFinalValue()
            if (r5 == 0) goto L8c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L8c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            boolean r5 = r5.hasFinalValue()
            if (r5 == 0) goto L8c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            int r5 = r5.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.mRight
            int r2 = r2.getMargin()
            int r5 = r5 - r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            int r2 = r2.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.mLeft
            int r3 = r3.getMargin()
            int r2 = r2 + r3
            int r5 = r5 - r2
            if (r5 < r6) goto L46
            goto L47
        L46:
            r0 = r1
        L47:
            return r0
        L48:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L8c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            boolean r5 = r5.hasFinalValue()
            if (r5 == 0) goto L8c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L8c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            boolean r5 = r5.hasFinalValue()
            if (r5 == 0) goto L8c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            int r5 = r5.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.mBottom
            int r2 = r2.getMargin()
            int r5 = r5 - r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            int r2 = r2.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.mTop
            int r3 = r3.getMargin()
            int r2 = r2 + r3
            int r5 = r5 - r2
            if (r5 < r6) goto L8a
            goto L8b
        L8a:
            r0 = r1
        L8b:
            return r0
        L8c:
            return r1
    }

    public void immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r1, androidx.constraintlayout.core.widgets.ConstraintWidget r2, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r3, int r4, int r5) {
            r0 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.getAnchor(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.getAnchor(r3)
            r3 = 1
            r1.connect(r2, r4, r5, r3)
            return
    }

    public boolean isAnimated() {
            r1 = this;
            boolean r0 = r1.mAnimated
            return r0
    }

    public boolean isHeightWrapContent() {
            r1 = this;
            boolean r0 = r1.mIsHeightWrapContent
            return r0
    }

    public boolean isHorizontalSolvingPassDone() {
            r1 = this;
            boolean r0 = r1.horizontalSolvingPass
            return r0
    }

    public boolean isInBarrier(int r2) {
            r1 = this;
            boolean[] r0 = r1.mIsInBarrier
            boolean r2 = r0[r2]
            return r2
    }

    public boolean isInHorizontalChain() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L10
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mLeft
            if (r0 == r1) goto L20
        L10:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L22
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mRight
            if (r0 != r1) goto L22
        L20:
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }

    public boolean isInPlaceholder() {
            r1 = this;
            boolean r0 = r1.inPlaceholder
            return r0
    }

    public boolean isInVerticalChain() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L10
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mTop
            if (r0 == r1) goto L20
        L10:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L22
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mBottom
            if (r0 != r1) goto L22
        L20:
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }

    public boolean isInVirtualLayout() {
            r1 = this;
            boolean r0 = r1.mInVirtualLayout
            return r0
    }

    public boolean isMeasureRequested() {
            r2 = this;
            boolean r0 = r2.mMeasureRequested
            if (r0 == 0) goto Lc
            int r0 = r2.mVisibility
            r1 = 8
            if (r0 == r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean isResolvedHorizontally() {
            r1 = this;
            boolean r0 = r1.resolvedHorizontal
            if (r0 != 0) goto L17
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mLeft
            boolean r0 = r0.hasFinalValue()
            if (r0 == 0) goto L15
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mRight
            boolean r0 = r0.hasFinalValue()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    public boolean isResolvedVertically() {
            r1 = this;
            boolean r0 = r1.resolvedVertical
            if (r0 != 0) goto L17
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTop
            boolean r0 = r0.hasFinalValue()
            if (r0 == 0) goto L15
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mBottom
            boolean r0 = r0.hasFinalValue()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    public boolean isRoot() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mParent
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isSpreadHeight() {
            r3 = this;
            int r0 = r3.mMatchConstraintDefaultHeight
            if (r0 != 0) goto L1d
            float r0 = r3.mDimensionRatio
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1d
            int r0 = r3.mMatchConstraintMinHeight
            if (r0 != 0) goto L1d
            int r0 = r3.mMatchConstraintMaxHeight
            if (r0 != 0) goto L1d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r3.mListDimensionBehaviors
            r1 = 1
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r2) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            return r1
    }

    public boolean isSpreadWidth() {
            r3 = this;
            int r0 = r3.mMatchConstraintDefaultWidth
            r1 = 0
            if (r0 != 0) goto L1d
            float r0 = r3.mDimensionRatio
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1d
            int r0 = r3.mMatchConstraintMinWidth
            if (r0 != 0) goto L1d
            int r0 = r3.mMatchConstraintMaxWidth
            if (r0 != 0) goto L1d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r3.mListDimensionBehaviors
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r2) goto L1d
            r1 = 1
        L1d:
            return r1
    }

    public boolean isVerticalSolvingPassDone() {
            r1 = this;
            boolean r0 = r1.verticalSolvingPass
            return r0
    }

    public boolean isWidthWrapContent() {
            r1 = this;
            boolean r0 = r1.mIsWidthWrapContent
            return r0
    }

    public void markHorizontalSolvingPassDone() {
            r1 = this;
            r0 = 1
            r1.horizontalSolvingPass = r0
            return
    }

    public void markVerticalSolvingPassDone() {
            r1 = this;
            r0 = 1
            r1.verticalSolvingPass = r0
            return
    }

    public boolean oppositeDimensionDependsOn(int r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r4.mListDimensionBehaviors
            r5 = r3[r5]
            r2 = r3[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r3) goto L16
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r5) goto L16
            goto L17
        L16:
            r0 = r1
        L17:
            return r0
    }

    public boolean oppositeDimensionsTied() {
            r4 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r4.mListDimensionBehaviors
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r2) goto L13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r4.mListDimensionBehaviors
            r2 = 1
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r3) goto L13
            r1 = r2
        L13:
            return r1
    }

    public void reset() {
            r6 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mLeft
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mTop
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mRight
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mBottom
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mBaseline
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mCenterX
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mCenterY
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mCenter
            r0.reset()
            r0 = 0
            r6.mParent = r0
            r1 = 0
            r6.mCircleConstraintAngle = r1
            r2 = 0
            r6.mWidth = r2
            r6.mHeight = r2
            r6.mDimensionRatio = r1
            r1 = -1
            r6.mDimensionRatioSide = r1
            r6.f38mX = r2
            r6.f39mY = r2
            r6.mOffsetX = r2
            r6.mOffsetY = r2
            r6.mBaselineDistance = r2
            r6.mMinWidth = r2
            r6.mMinHeight = r2
            float r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            r6.mHorizontalBiasPercent = r3
            r6.mVerticalBiasPercent = r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r6.mListDimensionBehaviors
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3[r2] = r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r6.mListDimensionBehaviors
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r5 = 1
            r3[r5] = r4
            r6.mCompanionWidget = r0
            r6.mContainerItemSkip = r2
            r6.mVisibility = r2
            r6.mType = r0
            r6.mHorizontalWrapVisited = r2
            r6.mVerticalWrapVisited = r2
            r6.mHorizontalChainStyle = r2
            r6.mVerticalChainStyle = r2
            r6.mHorizontalChainFixedPosition = r2
            r6.mVerticalChainFixedPosition = r2
            float[] r0 = r6.mWeight
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0[r2] = r3
            r0[r5] = r3
            r6.mHorizontalResolution = r1
            r6.mVerticalResolution = r1
            int[] r0 = r6.mMaxDimension
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0[r2] = r3
            r0[r5] = r3
            r6.mMatchConstraintDefaultWidth = r2
            r6.mMatchConstraintDefaultHeight = r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.mMatchConstraintPercentWidth = r0
            r6.mMatchConstraintPercentHeight = r0
            r6.mMatchConstraintMaxWidth = r3
            r6.mMatchConstraintMaxHeight = r3
            r6.mMatchConstraintMinWidth = r2
            r6.mMatchConstraintMinHeight = r2
            r6.mResolvedHasRatio = r2
            r6.mResolvedDimensionRatioSide = r1
            r6.mResolvedDimensionRatio = r0
            r6.mGroupsToSolver = r2
            boolean[] r0 = r6.isTerminalWidget
            r0[r2] = r5
            r0[r5] = r5
            r6.mInVirtualLayout = r2
            boolean[] r0 = r6.mIsInBarrier
            r0[r2] = r2
            r0[r5] = r2
            r6.mMeasureRequested = r5
            int[] r0 = r6.mResolvedMatchConstraintDefault
            r0[r2] = r2
            r0[r5] = r2
            r6.mWidthOverride = r1
            r6.mHeightOverride = r1
            return
    }

    public void resetAllConstraints() {
            r1 = this;
            r1.resetAnchors()
            float r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            r1.setVerticalBiasPercent(r0)
            float r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            r1.setHorizontalBiasPercent(r0)
            return
    }

    public void resetAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor r9) {
            r8 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.getParent()
            if (r0 == 0) goto L1b
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L1b
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.getParent()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            boolean r0 = r0.handlesInternalConstraints()
            if (r0 == 0) goto L1b
            return
        L1b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r8.getAnchor(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.getAnchor(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.getAnchor(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.getAnchor(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.getAnchor(r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.getAnchor(r6)
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r9 != r4) goto L87
            boolean r4 = r0.isConnected()
            if (r4 == 0) goto L65
            boolean r4 = r1.isConnected()
            if (r4 == 0) goto L65
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r1.getTarget()
            if (r4 != r5) goto L65
            r0.reset()
            r1.reset()
        L65:
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L81
            boolean r0 = r3.isConnected()
            if (r0 == 0) goto L81
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r3.getTarget()
            if (r0 != r1) goto L81
            r2.reset()
            r3.reset()
        L81:
            r8.mHorizontalBiasPercent = r7
            r8.mVerticalBiasPercent = r7
            goto L109
        L87:
            if (r9 != r5) goto Lb0
            boolean r2 = r0.isConnected()
            if (r2 == 0) goto Lad
            boolean r2 = r1.isConnected()
            if (r2 == 0) goto Lad
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.getOwner()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.getOwner()
            if (r2 != r3) goto Lad
            r0.reset()
            r1.reset()
        Lad:
            r8.mHorizontalBiasPercent = r7
            goto L109
        Lb0:
            if (r9 != r6) goto Ld9
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto Ld6
            boolean r0 = r3.isConnected()
            if (r0 == 0) goto Ld6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getOwner()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r3.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.getOwner()
            if (r0 != r1) goto Ld6
            r2.reset()
            r3.reset()
        Ld6:
            r8.mVerticalBiasPercent = r7
            goto L109
        Ld9:
            if (r9 == r0) goto Lf6
            if (r9 != r1) goto Lde
            goto Lf6
        Lde:
            if (r9 == r2) goto Le2
            if (r9 != r3) goto L109
        Le2:
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L109
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r3.getTarget()
            if (r0 != r1) goto L109
            r4.reset()
            goto L109
        Lf6:
            boolean r2 = r0.isConnected()
            if (r2 == 0) goto L109
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.getTarget()
            if (r0 != r1) goto L109
            r4.reset()
        L109:
            r9.reset()
            return
    }

    public void resetAnchors() {
            r3 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r3.getParent()
            if (r0 == 0) goto L17
            boolean r0 = r0 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L17
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r3.getParent()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            boolean r0 = r0.handlesInternalConstraints()
            if (r0 == 0) goto L17
            return
        L17:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r3.mAnchors
            int r0 = r0.size()
            r1 = 0
        L1e:
            if (r1 >= r0) goto L2e
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r3.mAnchors
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r2
            r2.reset()
            int r1 = r1 + 1
            goto L1e
        L2e:
            return
    }

    public void resetFinalResolution() {
            r3 = this;
            r0 = 0
            r3.resolvedHorizontal = r0
            r3.resolvedVertical = r0
            r3.horizontalSolvingPass = r0
            r3.verticalSolvingPass = r0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r1 = r3.mAnchors
            int r1 = r1.size()
        Lf:
            if (r0 >= r1) goto L1f
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r3.mAnchors
            java.lang.Object r2 = r2.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r2
            r2.resetFinalResolution()
            int r0 = r0 + 1
            goto Lf
        L1f:
            return
    }

    public void resetSolverVariables(androidx.constraintlayout.core.Cache r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mLeft
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTop
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mRight
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mBottom
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mBaseline
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mCenter
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mCenterX
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mCenterY
            r0.resetSolverVariable(r2)
            return
    }

    public void resetSolvingPassFlag() {
            r1 = this;
            r0 = 0
            r1.horizontalSolvingPass = r0
            r1.verticalSolvingPass = r0
            return
    }

    public java.lang.StringBuilder serialize(java.lang.StringBuilder r12) {
            r11 = this;
            java.lang.String r0 = "{\n"
            r12.append(r0)
            java.lang.String r0 = "left"
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r11.mLeft
            r11.serializeAnchor(r12, r0, r1)
            java.lang.String r0 = "top"
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r11.mTop
            r11.serializeAnchor(r12, r0, r1)
            java.lang.String r0 = "right"
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r11.mRight
            r11.serializeAnchor(r12, r0, r1)
            java.lang.String r0 = "bottom"
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r11.mBottom
            r11.serializeAnchor(r12, r0, r1)
            java.lang.String r0 = "baseline"
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r11.mBaseline
            r11.serializeAnchor(r12, r0, r1)
            java.lang.String r0 = "centerX"
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r11.mCenterX
            r11.serializeAnchor(r12, r0, r1)
            java.lang.String r0 = "centerY"
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r11.mCenterY
            r11.serializeAnchor(r12, r0, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r11.mCenter
            float r1 = r11.mCircleConstraintAngle
            r11.serializeCircle(r12, r0, r1)
            java.lang.String r2 = "width"
            int r3 = r11.mWidth
            int r4 = r11.mMinWidth
            int[] r0 = r11.mMaxDimension
            r1 = 0
            r5 = r0[r1]
            int r6 = r11.mWidthOverride
            int r7 = r11.mMatchConstraintMinWidth
            int r8 = r11.mMatchConstraintDefaultWidth
            float r9 = r11.mMatchConstraintPercentWidth
            float[] r0 = r11.mWeight
            r10 = r0[r1]
            r0 = r11
            r1 = r12
            r0.serializeSize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r2 = "height"
            int r3 = r11.mHeight
            int r4 = r11.mMinHeight
            int[] r0 = r11.mMaxDimension
            r1 = 1
            r5 = r0[r1]
            int r6 = r11.mHeightOverride
            int r7 = r11.mMatchConstraintMinHeight
            int r8 = r11.mMatchConstraintDefaultHeight
            float r9 = r11.mMatchConstraintPercentHeight
            float[] r0 = r11.mWeight
            r10 = r0[r1]
            r0 = r11
            r1 = r12
            r0.serializeSize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r0 = r11.mDimensionRatio
            int r1 = r11.mDimensionRatioSide
            java.lang.String r2 = "dimensionRatio"
            r11.serializeDimensionRatio(r12, r2, r0, r1)
            float r0 = r11.mHorizontalBiasPercent
            float r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            java.lang.String r2 = "horizontalBias"
            r11.serializeAttribute(r12, r2, r0, r1)
            float r0 = r11.mVerticalBiasPercent
            float r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            java.lang.String r2 = "verticalBias"
            r11.serializeAttribute(r12, r2, r0, r1)
            java.lang.String r0 = "}\n"
            r12.append(r0)
            return r12
    }

    public void setAnimated(boolean r1) {
            r0 = this;
            r0.mAnimated = r1
            return
    }

    public void setBaselineDistance(int r1) {
            r0 = this;
            r0.mBaselineDistance = r1
            if (r1 <= 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            r0.hasBaseline = r1
            return
    }

    public void setCompanionWidget(java.lang.Object r1) {
            r0 = this;
            r0.mCompanionWidget = r1
            return
    }

    public void setContainerItemSkip(int r1) {
            r0 = this;
            if (r1 < 0) goto L5
            r0.mContainerItemSkip = r1
            goto L8
        L5:
            r1 = 0
            r0.mContainerItemSkip = r1
        L8:
            return
    }

    public void setDebugName(java.lang.String r1) {
            r0 = this;
            r0.mDebugName = r1
            return
    }

    public void setDebugSolverName(androidx.constraintlayout.core.LinearSystem r7, java.lang.String r8) {
            r6 = this;
            r6.mDebugName = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mLeft
            androidx.constraintlayout.core.SolverVariable r0 = r7.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r6.mTop
            androidx.constraintlayout.core.SolverVariable r1 = r7.createObjectVariable(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r6.mRight
            androidx.constraintlayout.core.SolverVariable r2 = r7.createObjectVariable(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r6.mBottom
            androidx.constraintlayout.core.SolverVariable r3 = r7.createObjectVariable(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r5 = ".left"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.setName(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r4 = ".top"
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r1.setName(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r1 = ".right"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.setName(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r1 = ".bottom"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setName(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mBaseline
            androidx.constraintlayout.core.SolverVariable r7 = r7.createObjectVariable(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r0 = ".baseline"
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.setName(r8)
            return
    }

    public void setDimension(int r2, int r3) {
            r1 = this;
            r1.mWidth = r2
            int r0 = r1.mMinWidth
            if (r2 >= r0) goto L8
            r1.mWidth = r0
        L8:
            r1.mHeight = r3
            int r2 = r1.mMinHeight
            if (r3 >= r2) goto L10
            r1.mHeight = r2
        L10:
            return
    }

    public void setDimensionRatio(float r1, int r2) {
            r0 = this;
            r0.mDimensionRatio = r1
            r0.mDimensionRatioSide = r2
            return
    }

    public void setDimensionRatio(java.lang.String r9) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L90
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L90
        Lb:
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 <= 0) goto L39
            int r6 = r1 + (-1)
            if (r2 >= r6) goto L39
            java.lang.String r6 = r9.substring(r3, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2b
            goto L36
        L2b:
            java.lang.String r3 = "H"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L35
            r3 = r4
            goto L36
        L35:
            r3 = r5
        L36:
            int r2 = r2 + r4
            r5 = r3
            r3 = r2
        L39:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L77
            int r1 = r1 - r4
            if (r2 >= r1) goto L77
            java.lang.String r1 = r9.substring(r3, r2)
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L86
            int r2 = r9.length()
            if (r2 <= 0) goto L86
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            if (r5 != r4) goto L71
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L71:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L77:
            java.lang.String r9 = r9.substring(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L86:
            r9 = r0
        L87:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8f
            r8.mDimensionRatio = r9
            r8.mDimensionRatioSide = r5
        L8f:
            return
        L90:
            r8.mDimensionRatio = r0
            return
    }

    public void setFinalBaseline(int r4) {
            r3 = this;
            boolean r0 = r3.hasBaseline
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r3.mBaselineDistance
            int r0 = r4 - r0
            int r1 = r3.mHeight
            int r1 = r1 + r0
            r3.f39mY = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r3.mTop
            r2.setFinalValue(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mBottom
            r0.setFinalValue(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mBaseline
            r0.setFinalValue(r4)
            r4 = 1
            r3.resolvedVertical = r4
            return
    }

    public void setFinalFrame(int r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r0.setFrame(r1, r2, r3, r4)
            r0.setBaselineDistance(r5)
            r1 = 0
            r2 = 1
            if (r6 != 0) goto Lf
            r0.resolvedHorizontal = r2
            r0.resolvedVertical = r1
            goto L22
        Lf:
            if (r6 != r2) goto L16
            r0.resolvedHorizontal = r1
            r0.resolvedVertical = r2
            goto L22
        L16:
            r3 = 2
            if (r6 != r3) goto L1e
            r0.resolvedHorizontal = r2
            r0.resolvedVertical = r2
            goto L22
        L1e:
            r0.resolvedHorizontal = r1
            r0.resolvedVertical = r1
        L22:
            return
    }

    public void setFinalHorizontal(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.resolvedHorizontal
            if (r0 == 0) goto L5
            return
        L5:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mLeft
            r0.setFinalValue(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mRight
            r0.setFinalValue(r3)
            r1.f38mX = r2
            int r3 = r3 - r2
            r1.mWidth = r3
            r2 = 1
            r1.resolvedHorizontal = r2
            return
    }

    public void setFinalLeft(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mLeft
            r0.setFinalValue(r2)
            r1.f38mX = r2
            return
    }

    public void setFinalTop(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTop
            r0.setFinalValue(r2)
            r1.f39mY = r2
            return
    }

    public void setFinalVertical(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.resolvedVertical
            if (r0 == 0) goto L5
            return
        L5:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTop
            r0.setFinalValue(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mBottom
            r0.setFinalValue(r3)
            r1.f39mY = r2
            int r3 = r3 - r2
            r1.mHeight = r3
            boolean r3 = r1.hasBaseline
            if (r3 == 0) goto L20
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.mBaseline
            int r0 = r1.mBaselineDistance
            int r2 = r2 + r0
            r3.setFinalValue(r2)
        L20:
            r2 = 1
            r1.resolvedVertical = r2
            return
    }

    public void setFrame(int r2, int r3, int r4) {
            r1 = this;
            if (r4 != 0) goto L6
            r1.setHorizontalDimension(r2, r3)
            goto Lc
        L6:
            r0 = 1
            if (r4 != r0) goto Lc
            r1.setVerticalDimension(r2, r3)
        Lc:
            return
    }

    public void setFrame(int r3, int r4, int r5, int r6) {
            r2 = this;
            int r5 = r5 - r3
            int r6 = r6 - r4
            r2.f38mX = r3
            r2.f39mY = r4
            int r3 = r2.mVisibility
            r4 = 8
            r0 = 0
            if (r3 != r4) goto L12
            r2.mWidth = r0
            r2.mHeight = r0
            return
        L12:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r2.mListDimensionBehaviors
            r3 = r3[r0]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r4) goto L1f
            int r3 = r2.mWidth
            if (r5 >= r3) goto L1f
            r5 = r3
        L1f:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r2.mListDimensionBehaviors
            r4 = 1
            r3 = r3[r4]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r1) goto L2d
            int r3 = r2.mHeight
            if (r6 >= r3) goto L2d
            r6 = r3
        L2d:
            r2.mWidth = r5
            r2.mHeight = r6
            int r3 = r2.mMinHeight
            if (r6 >= r3) goto L37
            r2.mHeight = r3
        L37:
            int r3 = r2.mMinWidth
            if (r5 >= r3) goto L3d
            r2.mWidth = r3
        L3d:
            int r3 = r2.mMatchConstraintMaxWidth
            if (r3 <= 0) goto L53
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r2.mListDimensionBehaviors
            r3 = r3[r0]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r0) goto L53
            int r3 = r2.mWidth
            int r0 = r2.mMatchConstraintMaxWidth
            int r3 = java.lang.Math.min(r3, r0)
            r2.mWidth = r3
        L53:
            int r3 = r2.mMatchConstraintMaxHeight
            if (r3 <= 0) goto L69
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r2.mListDimensionBehaviors
            r3 = r3[r4]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r4) goto L69
            int r3 = r2.mHeight
            int r4 = r2.mMatchConstraintMaxHeight
            int r3 = java.lang.Math.min(r3, r4)
            r2.mHeight = r3
        L69:
            int r3 = r2.mWidth
            if (r5 == r3) goto L6f
            r2.mWidthOverride = r3
        L6f:
            int r3 = r2.mHeight
            if (r6 == r3) goto L75
            r2.mHeightOverride = r3
        L75:
            return
    }

    public void setGoneMargin(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r2, int r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.C01281.f40x6930e354
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L2c
            r0 = 2
            if (r2 == r0) goto L27
            r0 = 3
            if (r2 == r0) goto L22
            r0 = 4
            if (r2 == r0) goto L1d
            r0 = 5
            if (r2 == r0) goto L18
            goto L30
        L18:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mBaseline
            r2.mGoneMargin = r3
            goto L30
        L1d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mBottom
            r2.mGoneMargin = r3
            goto L30
        L22:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mRight
            r2.mGoneMargin = r3
            goto L30
        L27:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mTop
            r2.mGoneMargin = r3
            goto L30
        L2c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mLeft
            r2.mGoneMargin = r3
        L30:
            return
    }

    public void setHasBaseline(boolean r1) {
            r0 = this;
            r0.hasBaseline = r1
            return
    }

    public void setHeight(int r2) {
            r1 = this;
            r1.mHeight = r2
            int r0 = r1.mMinHeight
            if (r2 >= r0) goto L8
            r1.mHeight = r0
        L8:
            return
    }

    public void setHeightWrapContent(boolean r1) {
            r0 = this;
            r0.mIsHeightWrapContent = r1
            return
    }

    public void setHorizontalBiasPercent(float r1) {
            r0 = this;
            r0.mHorizontalBiasPercent = r1
            return
    }

    public void setHorizontalChainStyle(int r1) {
            r0 = this;
            r0.mHorizontalChainStyle = r1
            return
    }

    public void setHorizontalDimension(int r1, int r2) {
            r0 = this;
            r0.f38mX = r1
            int r2 = r2 - r1
            r0.mWidth = r2
            int r1 = r0.mMinWidth
            if (r2 >= r1) goto Lb
            r0.mWidth = r1
        Lb:
            return
    }

    public void setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r3) {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r2.mListDimensionBehaviors
            r1 = 0
            r0[r1] = r3
            return
    }

    public void setHorizontalMatchStyle(int r1, int r2, int r3, float r4) {
            r0 = this;
            r0.mMatchConstraintDefaultWidth = r1
            r0.mMatchConstraintMinWidth = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto La
            r3 = 0
        La:
            r0.mMatchConstraintMaxWidth = r3
            r0.mMatchConstraintPercentWidth = r4
            r2 = 0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1e
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L1e
            if (r1 != 0) goto L1e
            r1 = 2
            r0.mMatchConstraintDefaultWidth = r1
        L1e:
            return
    }

    public void setHorizontalWeight(float r3) {
            r2 = this;
            float[] r0 = r2.mWeight
            r1 = 0
            r0[r1] = r3
            return
    }

    protected void setInBarrier(int r2, boolean r3) {
            r1 = this;
            boolean[] r0 = r1.mIsInBarrier
            r0[r2] = r3
            return
    }

    public void setInPlaceholder(boolean r1) {
            r0 = this;
            r0.inPlaceholder = r1
            return
    }

    public void setInVirtualLayout(boolean r1) {
            r0 = this;
            r0.mInVirtualLayout = r1
            return
    }

    public void setLastMeasureSpec(int r1, int r2) {
            r0 = this;
            r0.mLastHorizontalMeasureSpec = r1
            r0.mLastVerticalMeasureSpec = r2
            r1 = 0
            r0.setMeasureRequested(r1)
            return
    }

    public void setLength(int r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L6
            r1.setWidth(r2)
            goto Lc
        L6:
            r0 = 1
            if (r3 != r0) goto Lc
            r1.setHeight(r2)
        Lc:
            return
    }

    public void setMaxHeight(int r3) {
            r2 = this;
            int[] r0 = r2.mMaxDimension
            r1 = 1
            r0[r1] = r3
            return
    }

    public void setMaxWidth(int r3) {
            r2 = this;
            int[] r0 = r2.mMaxDimension
            r1 = 0
            r0[r1] = r3
            return
    }

    public void setMeasureRequested(boolean r1) {
            r0 = this;
            r0.mMeasureRequested = r1
            return
    }

    public void setMinHeight(int r1) {
            r0 = this;
            if (r1 >= 0) goto L6
            r1 = 0
            r0.mMinHeight = r1
            goto L8
        L6:
            r0.mMinHeight = r1
        L8:
            return
    }

    public void setMinWidth(int r1) {
            r0 = this;
            if (r1 >= 0) goto L6
            r1 = 0
            r0.mMinWidth = r1
            goto L8
        L6:
            r0.mMinWidth = r1
        L8:
            return
    }

    public void setOffset(int r1, int r2) {
            r0 = this;
            r0.mOffsetX = r1
            r0.mOffsetY = r2
            return
    }

    public void setOrigin(int r1, int r2) {
            r0 = this;
            r0.f38mX = r1
            r0.f39mY = r2
            return
    }

    public void setParent(androidx.constraintlayout.core.widgets.ConstraintWidget r1) {
            r0 = this;
            r0.mParent = r1
            return
    }

    void setRelativePositioning(int r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L5
            r1.mRelX = r2
            goto La
        L5:
            r0 = 1
            if (r3 != r0) goto La
            r1.mRelY = r2
        La:
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.mType = r1
            return
    }

    public void setVerticalBiasPercent(float r1) {
            r0 = this;
            r0.mVerticalBiasPercent = r1
            return
    }

    public void setVerticalChainStyle(int r1) {
            r0 = this;
            r0.mVerticalChainStyle = r1
            return
    }

    public void setVerticalDimension(int r1, int r2) {
            r0 = this;
            r0.f39mY = r1
            int r2 = r2 - r1
            r0.mHeight = r2
            int r1 = r0.mMinHeight
            if (r2 >= r1) goto Lb
            r0.mHeight = r1
        Lb:
            return
    }

    public void setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r3) {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r2.mListDimensionBehaviors
            r1 = 1
            r0[r1] = r3
            return
    }

    public void setVerticalMatchStyle(int r1, int r2, int r3, float r4) {
            r0 = this;
            r0.mMatchConstraintDefaultHeight = r1
            r0.mMatchConstraintMinHeight = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto La
            r3 = 0
        La:
            r0.mMatchConstraintMaxHeight = r3
            r0.mMatchConstraintPercentHeight = r4
            r2 = 0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1e
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L1e
            if (r1 != 0) goto L1e
            r1 = 2
            r0.mMatchConstraintDefaultHeight = r1
        L1e:
            return
    }

    public void setVerticalWeight(float r3) {
            r2 = this;
            float[] r0 = r2.mWeight
            r1 = 1
            r0[r1] = r3
            return
    }

    public void setVisibility(int r1) {
            r0 = this;
            r0.mVisibility = r1
            return
    }

    public void setWidth(int r2) {
            r1 = this;
            r1.mWidth = r2
            int r0 = r1.mMinWidth
            if (r2 >= r0) goto L8
            r1.mWidth = r0
        L8:
            return
    }

    public void setWidthWrapContent(boolean r1) {
            r0 = this;
            r0.mIsWidthWrapContent = r1
            return
    }

    public void setWrapBehaviorInParent(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            r0 = 3
            if (r2 > r0) goto L7
            r1.mWrapBehaviorInParent = r2
        L7:
            return
    }

    public void setX(int r1) {
            r0 = this;
            r0.f38mX = r1
            return
    }

    public void setY(int r1) {
            r0 = this;
            r0.f39mY = r1
            return
    }

    public void setupDimensionRatio(boolean r4, boolean r5, boolean r6, boolean r7) {
            r3 = this;
            int r4 = r3.mResolvedDimensionRatioSide
            r5 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            r1 = 1
            r2 = -1
            if (r4 != r2) goto L20
            if (r6 == 0) goto L10
            if (r7 != 0) goto L10
            r3.mResolvedDimensionRatioSide = r0
            goto L20
        L10:
            if (r6 != 0) goto L20
            if (r7 == 0) goto L20
            r3.mResolvedDimensionRatioSide = r1
            int r4 = r3.mDimensionRatioSide
            if (r4 != r2) goto L20
            float r4 = r3.mResolvedDimensionRatio
            float r4 = r5 / r4
            r3.mResolvedDimensionRatio = r4
        L20:
            int r4 = r3.mResolvedDimensionRatioSide
            if (r4 != 0) goto L37
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mTop
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L34
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mBottom
            boolean r4 = r4.isConnected()
            if (r4 != 0) goto L37
        L34:
            r3.mResolvedDimensionRatioSide = r1
            goto L4d
        L37:
            int r4 = r3.mResolvedDimensionRatioSide
            if (r4 != r1) goto L4d
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mLeft
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L4b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mRight
            boolean r4 = r4.isConnected()
            if (r4 != 0) goto L4d
        L4b:
            r3.mResolvedDimensionRatioSide = r0
        L4d:
            int r4 = r3.mResolvedDimensionRatioSide
            if (r4 != r2) goto L9c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mTop
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L71
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mBottom
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L71
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mLeft
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L71
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mRight
            boolean r4 = r4.isConnected()
            if (r4 != 0) goto L9c
        L71:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mTop
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L84
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mBottom
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L84
            r3.mResolvedDimensionRatioSide = r0
            goto L9c
        L84:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mLeft
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L9c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mRight
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L9c
            float r4 = r3.mResolvedDimensionRatio
            float r4 = r5 / r4
            r3.mResolvedDimensionRatio = r4
            r3.mResolvedDimensionRatioSide = r1
        L9c:
            int r4 = r3.mResolvedDimensionRatioSide
            if (r4 != r2) goto Lb8
            int r4 = r3.mMatchConstraintMinWidth
            if (r4 <= 0) goto Lab
            int r6 = r3.mMatchConstraintMinHeight
            if (r6 != 0) goto Lab
            r3.mResolvedDimensionRatioSide = r0
            goto Lb8
        Lab:
            if (r4 != 0) goto Lb8
            int r4 = r3.mMatchConstraintMinHeight
            if (r4 <= 0) goto Lb8
            float r4 = r3.mResolvedDimensionRatio
            float r5 = r5 / r4
            r3.mResolvedDimensionRatio = r5
            r3.mResolvedDimensionRatioSide = r1
        Lb8:
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.mType
            java.lang.String r2 = " "
            java.lang.String r3 = ""
            if (r1 == 0) goto L23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "type: "
            r1.<init>(r4)
            java.lang.String r4 = r5.mType
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L24
        L23:
            r1 = r3
        L24:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r5.mDebugName
            if (r1 == 0) goto L41
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "id: "
            r1.<init>(r3)
            java.lang.String r3 = r5.mDebugName
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r1.toString()
        L41:
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r5.f38mX
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r5.f39mY
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ") - ("
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r5.mWidth
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " x "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r5.mHeight
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void updateFromRuns(boolean r8, boolean r9) {
            r7 = this;
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r7.horizontalRun
            boolean r0 = r0.isResolved()
            r8 = r8 & r0
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r7.verticalRun
            boolean r0 = r0.isResolved()
            r9 = r9 & r0
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r7.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r7.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.start
            int r1 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r7.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.end
            int r2 = r2.value
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r7.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.end
            int r3 = r3.value
            int r4 = r2 - r0
            int r5 = r3 - r1
            r6 = 0
            if (r4 < 0) goto L44
            if (r5 < 0) goto L44
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r4) goto L44
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r5) goto L44
            if (r1 == r4) goto L44
            if (r1 == r5) goto L44
            if (r2 == r4) goto L44
            if (r2 == r5) goto L44
            if (r3 == r4) goto L44
            if (r3 != r5) goto L48
        L44:
            r0 = r6
            r1 = r0
            r2 = r1
            r3 = r2
        L48:
            int r2 = r2 - r0
            int r3 = r3 - r1
            if (r8 == 0) goto L4e
            r7.f38mX = r0
        L4e:
            if (r9 == 0) goto L52
            r7.f39mY = r1
        L52:
            int r0 = r7.mVisibility
            r1 = 8
            if (r0 != r1) goto L5d
            r7.mWidth = r6
            r7.mHeight = r6
            return
        L5d:
            if (r8 == 0) goto L74
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r7.mListDimensionBehaviors
            r8 = r8[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 != r0) goto L6c
            int r8 = r7.mWidth
            if (r2 >= r8) goto L6c
            r2 = r8
        L6c:
            r7.mWidth = r2
            int r8 = r7.mMinWidth
            if (r2 >= r8) goto L74
            r7.mWidth = r8
        L74:
            if (r9 == 0) goto L8c
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r7.mListDimensionBehaviors
            r9 = 1
            r8 = r8[r9]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 != r9) goto L84
            int r8 = r7.mHeight
            if (r3 >= r8) goto L84
            r3 = r8
        L84:
            r7.mHeight = r3
            int r8 = r7.mMinHeight
            if (r3 >= r8) goto L8c
            r7.mHeight = r8
        L8c:
            return
    }

    public void updateFromSolver(androidx.constraintlayout.core.LinearSystem r5, boolean r6) {
            r4 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r4.mLeft
            int r0 = r5.getObjectVariableValue(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r4.mTop
            int r1 = r5.getObjectVariableValue(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.mRight
            int r2 = r5.getObjectVariableValue(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.mBottom
            int r5 = r5.getObjectVariableValue(r3)
            if (r6 == 0) goto L38
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r4.horizontalRun
            if (r3 == 0) goto L38
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.start
            boolean r3 = r3.resolved
            if (r3 == 0) goto L38
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r4.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.end
            boolean r3 = r3.resolved
            if (r3 == 0) goto L38
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r4.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r4.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.end
            int r2 = r2.value
        L38:
            if (r6 == 0) goto L58
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r6 = r4.verticalRun
            if (r6 == 0) goto L58
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r6.start
            boolean r6 = r6.resolved
            if (r6 == 0) goto L58
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r6 = r4.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r6.end
            boolean r6 = r6.resolved
            if (r6 == 0) goto L58
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r5 = r4.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.start
            int r1 = r5.value
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r5 = r4.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.end
            int r5 = r5.value
        L58:
            int r6 = r2 - r0
            int r3 = r5 - r1
            if (r6 < 0) goto L75
            if (r3 < 0) goto L75
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r6) goto L75
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r3) goto L75
            if (r1 == r6) goto L75
            if (r1 == r3) goto L75
            if (r2 == r6) goto L75
            if (r2 == r3) goto L75
            if (r5 == r6) goto L75
            if (r5 != r3) goto L79
        L75:
            r0 = 0
            r5 = r0
            r1 = r5
            r2 = r1
        L79:
            r4.setFrame(r0, r1, r2, r5)
            return
    }
}
