package androidx.constraintlayout.core.state;

/* loaded from: classes.dex */
public class Dimension {
    public static final java.lang.Object FIXED_DIMENSION = null;
    public static final java.lang.Object PARENT_DIMENSION = null;
    public static final java.lang.Object PERCENT_DIMENSION = null;
    public static final java.lang.Object RATIO_DIMENSION = null;
    public static final java.lang.Object SPREAD_DIMENSION = null;
    public static final java.lang.Object WRAP_DIMENSION = null;
    private final int WRAP_CONTENT;
    java.lang.Object mInitialValue;
    boolean mIsSuggested;
    int mMax;
    int mMin;
    float mPercent;
    java.lang.String mRatioString;
    int mValue;

    public enum Type extends java.lang.Enum<androidx.constraintlayout.core.state.Dimension.Type> {
        private static final /* synthetic */ androidx.constraintlayout.core.state.Dimension.Type[] $VALUES = null;
        public static final androidx.constraintlayout.core.state.Dimension.Type FIXED = null;
        public static final androidx.constraintlayout.core.state.Dimension.Type MATCH_CONSTRAINT = null;
        public static final androidx.constraintlayout.core.state.Dimension.Type MATCH_PARENT = null;
        public static final androidx.constraintlayout.core.state.Dimension.Type WRAP = null;

        static {
                androidx.constraintlayout.core.state.Dimension$Type r0 = new androidx.constraintlayout.core.state.Dimension$Type
                java.lang.String r1 = "FIXED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.state.Dimension.Type.FIXED = r0
                androidx.constraintlayout.core.state.Dimension$Type r1 = new androidx.constraintlayout.core.state.Dimension$Type
                java.lang.String r3 = "WRAP"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.core.state.Dimension.Type.WRAP = r1
                androidx.constraintlayout.core.state.Dimension$Type r3 = new androidx.constraintlayout.core.state.Dimension$Type
                java.lang.String r5 = "MATCH_PARENT"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.core.state.Dimension.Type.MATCH_PARENT = r3
                androidx.constraintlayout.core.state.Dimension$Type r5 = new androidx.constraintlayout.core.state.Dimension$Type
                java.lang.String r7 = "MATCH_CONSTRAINT"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.core.state.Dimension.Type.MATCH_CONSTRAINT = r5
                r7 = 4
                androidx.constraintlayout.core.state.Dimension$Type[] r7 = new androidx.constraintlayout.core.state.Dimension.Type[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                androidx.constraintlayout.core.state.Dimension.Type.$VALUES = r7
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.state.Dimension.Type valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.state.Dimension$Type> r0 = androidx.constraintlayout.core.state.Dimension.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.state.Dimension$Type r1 = (androidx.constraintlayout.core.state.Dimension.Type) r1
                return r1
        }

        public static androidx.constraintlayout.core.state.Dimension.Type[] values() {
                androidx.constraintlayout.core.state.Dimension$Type[] r0 = androidx.constraintlayout.core.state.Dimension.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.state.Dimension$Type[] r0 = (androidx.constraintlayout.core.state.Dimension.Type[]) r0
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.constraintlayout.core.state.Dimension.FIXED_DIMENSION = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.constraintlayout.core.state.Dimension.PARENT_DIMENSION = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.constraintlayout.core.state.Dimension.PERCENT_DIMENSION = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.constraintlayout.core.state.Dimension.RATIO_DIMENSION = r0
            return
    }

    private Dimension() {
            r2 = this;
            r2.<init>()
            r0 = -2
            r2.WRAP_CONTENT = r0
            r0 = 0
            r2.mMin = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2.mMax = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.mPercent = r1
            r2.mValue = r0
            r1 = 0
            r2.mRatioString = r1
            java.lang.Object r1 = androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION
            r2.mInitialValue = r1
            r2.mIsSuggested = r0
            return
    }

    private Dimension(java.lang.Object r3) {
            r2 = this;
            r2.<init>()
            r0 = -2
            r2.WRAP_CONTENT = r0
            r0 = 0
            r2.mMin = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2.mMax = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.mPercent = r1
            r2.mValue = r0
            r1 = 0
            r2.mRatioString = r1
            r2.mIsSuggested = r0
            r2.mInitialValue = r3
            return
    }

    public static androidx.constraintlayout.core.state.Dimension Fixed(int r2) {
            androidx.constraintlayout.core.state.Dimension r0 = new androidx.constraintlayout.core.state.Dimension
            java.lang.Object r1 = androidx.constraintlayout.core.state.Dimension.FIXED_DIMENSION
            r0.<init>(r1)
            r0.fixed(r2)
            return r0
    }

    public static androidx.constraintlayout.core.state.Dimension Fixed(java.lang.Object r2) {
            androidx.constraintlayout.core.state.Dimension r0 = new androidx.constraintlayout.core.state.Dimension
            java.lang.Object r1 = androidx.constraintlayout.core.state.Dimension.FIXED_DIMENSION
            r0.<init>(r1)
            r0.fixed(r2)
            return r0
    }

    public static androidx.constraintlayout.core.state.Dimension Parent() {
            androidx.constraintlayout.core.state.Dimension r0 = new androidx.constraintlayout.core.state.Dimension
            java.lang.Object r1 = androidx.constraintlayout.core.state.Dimension.PARENT_DIMENSION
            r0.<init>(r1)
            return r0
    }

    public static androidx.constraintlayout.core.state.Dimension Percent(java.lang.Object r2, float r3) {
            androidx.constraintlayout.core.state.Dimension r0 = new androidx.constraintlayout.core.state.Dimension
            java.lang.Object r1 = androidx.constraintlayout.core.state.Dimension.PERCENT_DIMENSION
            r0.<init>(r1)
            r0.percent(r2, r3)
            return r0
    }

    public static androidx.constraintlayout.core.state.Dimension Ratio(java.lang.String r2) {
            androidx.constraintlayout.core.state.Dimension r0 = new androidx.constraintlayout.core.state.Dimension
            java.lang.Object r1 = androidx.constraintlayout.core.state.Dimension.RATIO_DIMENSION
            r0.<init>(r1)
            r0.ratio(r2)
            return r0
    }

    public static androidx.constraintlayout.core.state.Dimension Spread() {
            androidx.constraintlayout.core.state.Dimension r0 = new androidx.constraintlayout.core.state.Dimension
            java.lang.Object r1 = androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION
            r0.<init>(r1)
            return r0
    }

    public static androidx.constraintlayout.core.state.Dimension Suggested(int r1) {
            androidx.constraintlayout.core.state.Dimension r0 = new androidx.constraintlayout.core.state.Dimension
            r0.<init>()
            r0.suggested(r1)
            return r0
    }

    public static androidx.constraintlayout.core.state.Dimension Suggested(java.lang.Object r1) {
            androidx.constraintlayout.core.state.Dimension r0 = new androidx.constraintlayout.core.state.Dimension
            r0.<init>()
            r0.suggested(r1)
            return r0
    }

    public static androidx.constraintlayout.core.state.Dimension Wrap() {
            androidx.constraintlayout.core.state.Dimension r0 = new androidx.constraintlayout.core.state.Dimension
            java.lang.Object r1 = androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION
            r0.<init>(r1)
            return r0
    }

    public void apply(androidx.constraintlayout.core.state.State r4, androidx.constraintlayout.core.widgets.ConstraintWidget r5, int r6) {
            r3 = this;
            java.lang.String r4 = r3.mRatioString
            if (r4 == 0) goto L7
            r5.setDimensionRatio(r4)
        L7:
            r4 = 2
            r0 = 1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r6 != 0) goto L63
            boolean r6 = r3.mIsSuggested
            if (r6 == 0) goto L31
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r5.setHorizontalDimensionBehaviour(r6)
            java.lang.Object r6 = r3.mInitialValue
            java.lang.Object r1 = androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION
            if (r6 != r1) goto L20
            r4 = r0
            goto L26
        L20:
            java.lang.Object r0 = androidx.constraintlayout.core.state.Dimension.PERCENT_DIMENSION
            if (r6 != r0) goto L25
            goto L26
        L25:
            r4 = r2
        L26:
            int r6 = r3.mMin
            int r0 = r3.mMax
            float r1 = r3.mPercent
            r5.setHorizontalMatchStyle(r4, r6, r0, r1)
            goto Lb4
        L31:
            int r4 = r3.mMin
            if (r4 <= 0) goto L38
            r5.setMinWidth(r4)
        L38:
            int r4 = r3.mMax
            if (r4 >= r1) goto L3f
            r5.setMaxWidth(r4)
        L3f:
            java.lang.Object r4 = r3.mInitialValue
            java.lang.Object r6 = androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION
            if (r4 != r6) goto L4c
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r5.setHorizontalDimensionBehaviour(r4)
            goto Lb4
        L4c:
            java.lang.Object r6 = androidx.constraintlayout.core.state.Dimension.PARENT_DIMENSION
            if (r4 != r6) goto L56
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r5.setHorizontalDimensionBehaviour(r4)
            goto Lb4
        L56:
            if (r4 != 0) goto Lb4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r5.setHorizontalDimensionBehaviour(r4)
            int r4 = r3.mValue
            r5.setWidth(r4)
            goto Lb4
        L63:
            boolean r6 = r3.mIsSuggested
            if (r6 == 0) goto L84
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r5.setVerticalDimensionBehaviour(r6)
            java.lang.Object r6 = r3.mInitialValue
            java.lang.Object r1 = androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION
            if (r6 != r1) goto L74
            r4 = r0
            goto L7a
        L74:
            java.lang.Object r0 = androidx.constraintlayout.core.state.Dimension.PERCENT_DIMENSION
            if (r6 != r0) goto L79
            goto L7a
        L79:
            r4 = r2
        L7a:
            int r6 = r3.mMin
            int r0 = r3.mMax
            float r1 = r3.mPercent
            r5.setVerticalMatchStyle(r4, r6, r0, r1)
            goto Lb4
        L84:
            int r4 = r3.mMin
            if (r4 <= 0) goto L8b
            r5.setMinHeight(r4)
        L8b:
            int r4 = r3.mMax
            if (r4 >= r1) goto L92
            r5.setMaxHeight(r4)
        L92:
            java.lang.Object r4 = r3.mInitialValue
            java.lang.Object r6 = androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION
            if (r4 != r6) goto L9e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r5.setVerticalDimensionBehaviour(r4)
            goto Lb4
        L9e:
            java.lang.Object r6 = androidx.constraintlayout.core.state.Dimension.PARENT_DIMENSION
            if (r4 != r6) goto La8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r5.setVerticalDimensionBehaviour(r4)
            goto Lb4
        La8:
            if (r4 != 0) goto Lb4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r5.setVerticalDimensionBehaviour(r4)
            int r4 = r3.mValue
            r5.setHeight(r4)
        Lb4:
            return
    }

    public boolean equalsFixedValue(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.mInitialValue
            if (r0 != 0) goto La
            int r0 = r1.mValue
            if (r0 != r2) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    public androidx.constraintlayout.core.state.Dimension fixed(int r2) {
            r1 = this;
            r0 = 0
            r1.mInitialValue = r0
            r1.mValue = r2
            return r1
    }

    public androidx.constraintlayout.core.state.Dimension fixed(java.lang.Object r2) {
            r1 = this;
            r1.mInitialValue = r2
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L11
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.mValue = r2
            r2 = 0
            r1.mInitialValue = r2
        L11:
            return r1
    }

    int getValue() {
            r1 = this;
            int r0 = r1.mValue
            return r0
    }

    public androidx.constraintlayout.core.state.Dimension max(int r2) {
            r1 = this;
            int r0 = r1.mMax
            if (r0 < 0) goto L6
            r1.mMax = r2
        L6:
            return r1
    }

    public androidx.constraintlayout.core.state.Dimension max(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION
            if (r2 != r0) goto Lf
            boolean r2 = r1.mIsSuggested
            if (r2 == 0) goto Lf
            r1.mInitialValue = r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.mMax = r2
        Lf:
            return r1
    }

    public androidx.constraintlayout.core.state.Dimension min(int r1) {
            r0 = this;
            if (r1 < 0) goto L4
            r0.mMin = r1
        L4:
            return r0
    }

    public androidx.constraintlayout.core.state.Dimension min(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION
            if (r2 != r0) goto L7
            r2 = -2
            r1.mMin = r2
        L7:
            return r1
    }

    public androidx.constraintlayout.core.state.Dimension percent(java.lang.Object r1, float r2) {
            r0 = this;
            r0.mPercent = r2
            return r0
    }

    public androidx.constraintlayout.core.state.Dimension ratio(java.lang.String r1) {
            r0 = this;
            r0.mRatioString = r1
            return r0
    }

    void setValue(int r2) {
            r1 = this;
            r0 = 0
            r1.mIsSuggested = r0
            r0 = 0
            r1.mInitialValue = r0
            r1.mValue = r2
            return
    }

    public androidx.constraintlayout.core.state.Dimension suggested(int r2) {
            r1 = this;
            r0 = 1
            r1.mIsSuggested = r0
            if (r2 < 0) goto L7
            r1.mMax = r2
        L7:
            return r1
    }

    public androidx.constraintlayout.core.state.Dimension suggested(java.lang.Object r1) {
            r0 = this;
            r0.mInitialValue = r1
            r1 = 1
            r0.mIsSuggested = r1
            return r0
    }
}
