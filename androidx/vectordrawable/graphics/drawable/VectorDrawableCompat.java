package androidx.vectordrawable.graphics.drawable;

/* loaded from: classes.dex */
public class VectorDrawableCompat extends androidx.vectordrawable.graphics.drawable.VectorDrawableCommon {
    private static final boolean DBG_VECTOR_DRAWABLE = false;
    static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE = null;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;
    static final java.lang.String LOGTAG = "VectorDrawableCompat";
    private static final int MAX_CACHED_BITMAP_SIZE = 2048;
    private static final java.lang.String SHAPE_CLIP_PATH = "clip-path";
    private static final java.lang.String SHAPE_GROUP = "group";
    private static final java.lang.String SHAPE_PATH = "path";
    private static final java.lang.String SHAPE_VECTOR = "vector";
    private boolean mAllowCaching;
    private android.graphics.drawable.Drawable.ConstantState mCachedConstantStateDelegate;
    private android.graphics.ColorFilter mColorFilter;
    private boolean mMutated;
    private android.graphics.PorterDuffColorFilter mTintFilter;
    private final android.graphics.Rect mTmpBounds;
    private final float[] mTmpFloats;
    private final android.graphics.Matrix mTmpMatrix;
    private androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState mVectorState;

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$1 */
    static /* synthetic */ class C04461 {
    }

    private static class VClipPath extends androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath {
        VClipPath() {
                r0 = this;
                r0.<init>()
                return
        }

        VClipPath(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void updateStateFromTypedArray(android.content.res.TypedArray r4, org.xmlpull.v1.XmlPullParser r5) {
                r3 = this;
                r0 = 0
                java.lang.String r1 = r4.getString(r0)
                if (r1 == 0) goto L9
                r3.mPathName = r1
            L9:
                r1 = 1
                java.lang.String r1 = r4.getString(r1)
                if (r1 == 0) goto L16
                androidx.core.graphics.PathParser$PathDataNode[] r1 = androidx.core.graphics.PathParser.createNodesFromPathData(r1)
                r3.mNodes = r1
            L16:
                java.lang.String r1 = "fillType"
                r2 = 2
                int r4 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r4, r5, r1, r2, r0)
                r3.mFillRule = r4
                return
        }

        public void inflate(android.content.res.Resources r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) {
                r1 = this;
                java.lang.String r0 = "pathData"
                boolean r0 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r5, r0)
                if (r0 != 0) goto L9
                return
            L9:
                int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH
                android.content.res.TypedArray r2 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r2, r4, r3, r0)
                r1.updateStateFromTypedArray(r2, r5)
                r2.recycle()
                return
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
        public boolean isClipPath() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    private static class VFullPath extends androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath {
        float mFillAlpha;
        androidx.core.content.res.ComplexColorCompat mFillColor;
        float mStrokeAlpha;
        androidx.core.content.res.ComplexColorCompat mStrokeColor;
        android.graphics.Paint.Cap mStrokeLineCap;
        android.graphics.Paint.Join mStrokeLineJoin;
        float mStrokeMiterlimit;
        float mStrokeWidth;
        private int[] mThemeAttrs;
        float mTrimPathEnd;
        float mTrimPathOffset;
        float mTrimPathStart;

        VFullPath() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mStrokeWidth = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.mStrokeAlpha = r1
                r2.mFillAlpha = r1
                r2.mTrimPathStart = r0
                r2.mTrimPathEnd = r1
                r2.mTrimPathOffset = r0
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
                r2.mStrokeLineCap = r0
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
                r2.mStrokeLineJoin = r0
                r0 = 1082130432(0x40800000, float:4.0)
                r2.mStrokeMiterlimit = r0
                return
        }

        VFullPath(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath r3) {
                r2 = this;
                r2.<init>(r3)
                r0 = 0
                r2.mStrokeWidth = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.mStrokeAlpha = r1
                r2.mFillAlpha = r1
                r2.mTrimPathStart = r0
                r2.mTrimPathEnd = r1
                r2.mTrimPathOffset = r0
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
                r2.mStrokeLineCap = r0
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
                r2.mStrokeLineJoin = r0
                r0 = 1082130432(0x40800000, float:4.0)
                r2.mStrokeMiterlimit = r0
                int[] r0 = r3.mThemeAttrs
                r2.mThemeAttrs = r0
                androidx.core.content.res.ComplexColorCompat r0 = r3.mStrokeColor
                r2.mStrokeColor = r0
                float r0 = r3.mStrokeWidth
                r2.mStrokeWidth = r0
                float r0 = r3.mStrokeAlpha
                r2.mStrokeAlpha = r0
                androidx.core.content.res.ComplexColorCompat r0 = r3.mFillColor
                r2.mFillColor = r0
                int r0 = r3.mFillRule
                r2.mFillRule = r0
                float r0 = r3.mFillAlpha
                r2.mFillAlpha = r0
                float r0 = r3.mTrimPathStart
                r2.mTrimPathStart = r0
                float r0 = r3.mTrimPathEnd
                r2.mTrimPathEnd = r0
                float r0 = r3.mTrimPathOffset
                r2.mTrimPathOffset = r0
                android.graphics.Paint$Cap r0 = r3.mStrokeLineCap
                r2.mStrokeLineCap = r0
                android.graphics.Paint$Join r0 = r3.mStrokeLineJoin
                r2.mStrokeLineJoin = r0
                float r3 = r3.mStrokeMiterlimit
                r2.mStrokeMiterlimit = r3
                return
        }

        private android.graphics.Paint.Cap getStrokeLineCap(int r2, android.graphics.Paint.Cap r3) {
                r1 = this;
                if (r2 == 0) goto Lf
                r0 = 1
                if (r2 == r0) goto Lc
                r0 = 2
                if (r2 == r0) goto L9
                return r3
            L9:
                android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.SQUARE
                return r2
            Lc:
                android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.ROUND
                return r2
            Lf:
                android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT
                return r2
        }

        private android.graphics.Paint.Join getStrokeLineJoin(int r2, android.graphics.Paint.Join r3) {
                r1 = this;
                if (r2 == 0) goto Lf
                r0 = 1
                if (r2 == r0) goto Lc
                r0 = 2
                if (r2 == r0) goto L9
                return r3
            L9:
                android.graphics.Paint$Join r2 = android.graphics.Paint.Join.BEVEL
                return r2
            Lc:
                android.graphics.Paint$Join r2 = android.graphics.Paint.Join.ROUND
                return r2
            Lf:
                android.graphics.Paint$Join r2 = android.graphics.Paint.Join.MITER
                return r2
        }

        private void updateStateFromTypedArray(android.content.res.TypedArray r8, org.xmlpull.v1.XmlPullParser r9, android.content.res.Resources.Theme r10) {
                r7 = this;
                r0 = 0
                r7.mThemeAttrs = r0
                java.lang.String r0 = "pathData"
                boolean r0 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r9, r0)
                if (r0 != 0) goto Lc
                return
            Lc:
                r0 = 0
                java.lang.String r0 = r8.getString(r0)
                if (r0 == 0) goto L15
                r7.mPathName = r0
            L15:
                r0 = 2
                java.lang.String r0 = r8.getString(r0)
                if (r0 == 0) goto L22
                androidx.core.graphics.PathParser$PathDataNode[] r0 = androidx.core.graphics.PathParser.createNodesFromPathData(r0)
                r7.mNodes = r0
            L22:
                java.lang.String r4 = "fillColor"
                r5 = 1
                r6 = 0
                r1 = r8
                r2 = r9
                r3 = r10
                androidx.core.content.res.ComplexColorCompat r0 = androidx.core.content.res.TypedArrayUtils.getNamedComplexColor(r1, r2, r3, r4, r5, r6)
                r7.mFillColor = r0
                r0 = 12
                float r1 = r7.mFillAlpha
                java.lang.String r2 = "fillAlpha"
                float r0 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r8, r9, r2, r0, r1)
                r7.mFillAlpha = r0
                java.lang.String r0 = "strokeLineCap"
                r1 = 8
                r2 = -1
                int r0 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r8, r9, r0, r1, r2)
                android.graphics.Paint$Cap r1 = r7.mStrokeLineCap
                android.graphics.Paint$Cap r0 = r7.getStrokeLineCap(r0, r1)
                r7.mStrokeLineCap = r0
                java.lang.String r0 = "strokeLineJoin"
                r1 = 9
                int r0 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r8, r9, r0, r1, r2)
                android.graphics.Paint$Join r1 = r7.mStrokeLineJoin
                android.graphics.Paint$Join r0 = r7.getStrokeLineJoin(r0, r1)
                r7.mStrokeLineJoin = r0
                r0 = 10
                float r1 = r7.mStrokeMiterlimit
                java.lang.String r2 = "strokeMiterLimit"
                float r0 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r8, r9, r2, r0, r1)
                r7.mStrokeMiterlimit = r0
                java.lang.String r4 = "strokeColor"
                r5 = 3
                r1 = r8
                r2 = r9
                androidx.core.content.res.ComplexColorCompat r10 = androidx.core.content.res.TypedArrayUtils.getNamedComplexColor(r1, r2, r3, r4, r5, r6)
                r7.mStrokeColor = r10
                r10 = 11
                float r0 = r7.mStrokeAlpha
                java.lang.String r1 = "strokeAlpha"
                float r10 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r8, r9, r1, r10, r0)
                r7.mStrokeAlpha = r10
                r10 = 4
                float r0 = r7.mStrokeWidth
                java.lang.String r1 = "strokeWidth"
                float r10 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r8, r9, r1, r10, r0)
                r7.mStrokeWidth = r10
                r10 = 6
                float r0 = r7.mTrimPathEnd
                java.lang.String r1 = "trimPathEnd"
                float r10 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r8, r9, r1, r10, r0)
                r7.mTrimPathEnd = r10
                r10 = 7
                float r0 = r7.mTrimPathOffset
                java.lang.String r1 = "trimPathOffset"
                float r10 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r8, r9, r1, r10, r0)
                r7.mTrimPathOffset = r10
                r10 = 5
                float r0 = r7.mTrimPathStart
                java.lang.String r1 = "trimPathStart"
                float r10 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r8, r9, r1, r10, r0)
                r7.mTrimPathStart = r10
                r10 = 13
                int r0 = r7.mFillRule
                java.lang.String r1 = "fillType"
                int r8 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r8, r9, r1, r10, r0)
                r7.mFillRule = r8
                return
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
        public void applyTheme(android.content.res.Resources.Theme r1) {
                r0 = this;
                return
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
        public boolean canApplyTheme() {
                r1 = this;
                int[] r0 = r1.mThemeAttrs
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        float getFillAlpha() {
                r1 = this;
                float r0 = r1.mFillAlpha
                return r0
        }

        int getFillColor() {
                r1 = this;
                androidx.core.content.res.ComplexColorCompat r0 = r1.mFillColor
                int r0 = r0.getColor()
                return r0
        }

        float getStrokeAlpha() {
                r1 = this;
                float r0 = r1.mStrokeAlpha
                return r0
        }

        int getStrokeColor() {
                r1 = this;
                androidx.core.content.res.ComplexColorCompat r0 = r1.mStrokeColor
                int r0 = r0.getColor()
                return r0
        }

        float getStrokeWidth() {
                r1 = this;
                float r0 = r1.mStrokeWidth
                return r0
        }

        float getTrimPathEnd() {
                r1 = this;
                float r0 = r1.mTrimPathEnd
                return r0
        }

        float getTrimPathOffset() {
                r1 = this;
                float r0 = r1.mTrimPathOffset
                return r0
        }

        float getTrimPathStart() {
                r1 = this;
                float r0 = r1.mTrimPathStart
                return r0
        }

        public void inflate(android.content.res.Resources r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) {
                r1 = this;
                int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_VECTOR_DRAWABLE_PATH
                android.content.res.TypedArray r2 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r2, r4, r3, r0)
                r1.updateStateFromTypedArray(r2, r5, r4)
                r2.recycle()
                return
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean isStateful() {
                r1 = this;
                androidx.core.content.res.ComplexColorCompat r0 = r1.mFillColor
                boolean r0 = r0.isStateful()
                if (r0 != 0) goto L13
                androidx.core.content.res.ComplexColorCompat r0 = r1.mStrokeColor
                boolean r0 = r0.isStateful()
                if (r0 == 0) goto L11
                goto L13
            L11:
                r0 = 0
                goto L14
            L13:
                r0 = 1
            L14:
                return r0
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean onStateChanged(int[] r3) {
                r2 = this;
                androidx.core.content.res.ComplexColorCompat r0 = r2.mFillColor
                boolean r0 = r0.onStateChanged(r3)
                androidx.core.content.res.ComplexColorCompat r1 = r2.mStrokeColor
                boolean r3 = r1.onStateChanged(r3)
                r3 = r3 | r0
                return r3
        }

        void setFillAlpha(float r1) {
                r0 = this;
                r0.mFillAlpha = r1
                return
        }

        void setFillColor(int r2) {
                r1 = this;
                androidx.core.content.res.ComplexColorCompat r0 = r1.mFillColor
                r0.setColor(r2)
                return
        }

        void setStrokeAlpha(float r1) {
                r0 = this;
                r0.mStrokeAlpha = r1
                return
        }

        void setStrokeColor(int r2) {
                r1 = this;
                androidx.core.content.res.ComplexColorCompat r0 = r1.mStrokeColor
                r0.setColor(r2)
                return
        }

        void setStrokeWidth(float r1) {
                r0 = this;
                r0.mStrokeWidth = r1
                return
        }

        void setTrimPathEnd(float r1) {
                r0 = this;
                r0.mTrimPathEnd = r1
                return
        }

        void setTrimPathOffset(float r1) {
                r0 = this;
                r0.mTrimPathOffset = r1
                return
        }

        void setTrimPathStart(float r1) {
                r0 = this;
                r0.mTrimPathStart = r1
                return
        }
    }

    private static class VGroup extends androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject {
        int mChangingConfigurations;
        final java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject> mChildren;
        private java.lang.String mGroupName;
        final android.graphics.Matrix mLocalMatrix;
        private float mPivotX;
        private float mPivotY;
        float mRotate;
        private float mScaleX;
        private float mScaleY;
        final android.graphics.Matrix mStackedMatrix;
        private int[] mThemeAttrs;
        private float mTranslateX;
        private float mTranslateY;

        public VGroup() {
                r3 = this;
                r0 = 0
                r3.<init>(r0)
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r3.mStackedMatrix = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r3.mChildren = r1
                r1 = 0
                r3.mRotate = r1
                r3.mPivotX = r1
                r3.mPivotY = r1
                r2 = 1065353216(0x3f800000, float:1.0)
                r3.mScaleX = r2
                r3.mScaleY = r2
                r3.mTranslateX = r1
                r3.mTranslateY = r1
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r3.mLocalMatrix = r1
                r3.mGroupName = r0
                return
        }

        public VGroup(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup r5, androidx.collection.ArrayMap<java.lang.String, java.lang.Object> r6) {
                r4 = this;
                r0 = 0
                r4.<init>(r0)
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r4.mStackedMatrix = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r4.mChildren = r1
                r1 = 0
                r4.mRotate = r1
                r4.mPivotX = r1
                r4.mPivotY = r1
                r2 = 1065353216(0x3f800000, float:1.0)
                r4.mScaleX = r2
                r4.mScaleY = r2
                r4.mTranslateX = r1
                r4.mTranslateY = r1
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r4.mLocalMatrix = r1
                r4.mGroupName = r0
                float r0 = r5.mRotate
                r4.mRotate = r0
                float r0 = r5.mPivotX
                r4.mPivotX = r0
                float r0 = r5.mPivotY
                r4.mPivotY = r0
                float r0 = r5.mScaleX
                r4.mScaleX = r0
                float r0 = r5.mScaleY
                r4.mScaleY = r0
                float r0 = r5.mTranslateX
                r4.mTranslateX = r0
                float r0 = r5.mTranslateY
                r4.mTranslateY = r0
                int[] r0 = r5.mThemeAttrs
                r4.mThemeAttrs = r0
                java.lang.String r0 = r5.mGroupName
                r4.mGroupName = r0
                int r2 = r5.mChangingConfigurations
                r4.mChangingConfigurations = r2
                if (r0 == 0) goto L59
                r6.put(r0, r4)
            L59:
                android.graphics.Matrix r0 = r5.mLocalMatrix
                r1.set(r0)
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r5 = r5.mChildren
                r0 = 0
            L61:
                int r1 = r5.size()
                if (r0 >= r1) goto Lac
                java.lang.Object r1 = r5.get(r0)
                boolean r2 = r1 instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup
                if (r2 == 0) goto L7c
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r1 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) r1
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r2 = r4.mChildren
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r3 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup
                r3.<init>(r1, r6)
                r2.add(r3)
                goto La1
            L7c:
                boolean r2 = r1 instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath
                if (r2 == 0) goto L88
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VFullPath r2 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VFullPath
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VFullPath r1 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath) r1
                r2.<init>(r1)
                goto L93
            L88:
                boolean r2 = r1 instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath
                if (r2 == 0) goto La4
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VClipPath r2 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VClipPath
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VClipPath r1 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath) r1
                r2.<init>(r1)
            L93:
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r1 = r4.mChildren
                r1.add(r2)
                java.lang.String r1 = r2.mPathName
                if (r1 == 0) goto La1
                java.lang.String r1 = r2.mPathName
                r6.put(r1, r2)
            La1:
                int r0 = r0 + 1
                goto L61
            La4:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "Unknown object in the tree!"
                r5.<init>(r6)
                throw r5
            Lac:
                return
        }

        private void updateLocalMatrix() {
                r4 = this;
                android.graphics.Matrix r0 = r4.mLocalMatrix
                r0.reset()
                android.graphics.Matrix r0 = r4.mLocalMatrix
                float r1 = r4.mPivotX
                float r1 = -r1
                float r2 = r4.mPivotY
                float r2 = -r2
                r0.postTranslate(r1, r2)
                android.graphics.Matrix r0 = r4.mLocalMatrix
                float r1 = r4.mScaleX
                float r2 = r4.mScaleY
                r0.postScale(r1, r2)
                android.graphics.Matrix r0 = r4.mLocalMatrix
                float r1 = r4.mRotate
                r2 = 0
                r0.postRotate(r1, r2, r2)
                android.graphics.Matrix r0 = r4.mLocalMatrix
                float r1 = r4.mTranslateX
                float r2 = r4.mPivotX
                float r1 = r1 + r2
                float r2 = r4.mTranslateY
                float r3 = r4.mPivotY
                float r2 = r2 + r3
                r0.postTranslate(r1, r2)
                return
        }

        private void updateStateFromTypedArray(android.content.res.TypedArray r4, org.xmlpull.v1.XmlPullParser r5) {
                r3 = this;
                r0 = 0
                r3.mThemeAttrs = r0
                r0 = 5
                float r1 = r3.mRotate
                java.lang.String r2 = "rotation"
                float r0 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r4, r5, r2, r0, r1)
                r3.mRotate = r0
                r0 = 1
                float r1 = r3.mPivotX
                float r0 = r4.getFloat(r0, r1)
                r3.mPivotX = r0
                r0 = 2
                float r1 = r3.mPivotY
                float r0 = r4.getFloat(r0, r1)
                r3.mPivotY = r0
                r0 = 3
                float r1 = r3.mScaleX
                java.lang.String r2 = "scaleX"
                float r0 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r4, r5, r2, r0, r1)
                r3.mScaleX = r0
                r0 = 4
                float r1 = r3.mScaleY
                java.lang.String r2 = "scaleY"
                float r0 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r4, r5, r2, r0, r1)
                r3.mScaleY = r0
                r0 = 6
                float r1 = r3.mTranslateX
                java.lang.String r2 = "translateX"
                float r0 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r4, r5, r2, r0, r1)
                r3.mTranslateX = r0
                r0 = 7
                float r1 = r3.mTranslateY
                java.lang.String r2 = "translateY"
                float r5 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r4, r5, r2, r0, r1)
                r3.mTranslateY = r5
                r5 = 0
                java.lang.String r4 = r4.getString(r5)
                if (r4 == 0) goto L55
                r3.mGroupName = r4
            L55:
                r3.updateLocalMatrix()
                return
        }

        public java.lang.String getGroupName() {
                r1 = this;
                java.lang.String r0 = r1.mGroupName
                return r0
        }

        public android.graphics.Matrix getLocalMatrix() {
                r1 = this;
                android.graphics.Matrix r0 = r1.mLocalMatrix
                return r0
        }

        public float getPivotX() {
                r1 = this;
                float r0 = r1.mPivotX
                return r0
        }

        public float getPivotY() {
                r1 = this;
                float r0 = r1.mPivotY
                return r0
        }

        public float getRotation() {
                r1 = this;
                float r0 = r1.mRotate
                return r0
        }

        public float getScaleX() {
                r1 = this;
                float r0 = r1.mScaleX
                return r0
        }

        public float getScaleY() {
                r1 = this;
                float r0 = r1.mScaleY
                return r0
        }

        public float getTranslateX() {
                r1 = this;
                float r0 = r1.mTranslateX
                return r0
        }

        public float getTranslateY() {
                r1 = this;
                float r0 = r1.mTranslateY
                return r0
        }

        public void inflate(android.content.res.Resources r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) {
                r1 = this;
                int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_VECTOR_DRAWABLE_GROUP
                android.content.res.TypedArray r2 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r2, r4, r3, r0)
                r1.updateStateFromTypedArray(r2, r5)
                r2.recycle()
                return
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean isStateful() {
                r3 = this;
                r0 = 0
                r1 = r0
            L2:
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r2 = r3.mChildren
                int r2 = r2.size()
                if (r1 >= r2) goto L1d
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r2 = r3.mChildren
                java.lang.Object r2 = r2.get(r1)
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject r2 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject) r2
                boolean r2 = r2.isStateful()
                if (r2 == 0) goto L1a
                r0 = 1
                return r0
            L1a:
                int r1 = r1 + 1
                goto L2
            L1d:
                return r0
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean onStateChanged(int[] r4) {
                r3 = this;
                r0 = 0
                r1 = r0
            L2:
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r2 = r3.mChildren
                int r2 = r2.size()
                if (r0 >= r2) goto L1a
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r2 = r3.mChildren
                java.lang.Object r2 = r2.get(r0)
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject r2 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject) r2
                boolean r2 = r2.onStateChanged(r4)
                r1 = r1 | r2
                int r0 = r0 + 1
                goto L2
            L1a:
                return r1
        }

        public void setPivotX(float r2) {
                r1 = this;
                float r0 = r1.mPivotX
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.mPivotX = r2
                r1.updateLocalMatrix()
            Lb:
                return
        }

        public void setPivotY(float r2) {
                r1 = this;
                float r0 = r1.mPivotY
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.mPivotY = r2
                r1.updateLocalMatrix()
            Lb:
                return
        }

        public void setRotation(float r2) {
                r1 = this;
                float r0 = r1.mRotate
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.mRotate = r2
                r1.updateLocalMatrix()
            Lb:
                return
        }

        public void setScaleX(float r2) {
                r1 = this;
                float r0 = r1.mScaleX
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.mScaleX = r2
                r1.updateLocalMatrix()
            Lb:
                return
        }

        public void setScaleY(float r2) {
                r1 = this;
                float r0 = r1.mScaleY
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.mScaleY = r2
                r1.updateLocalMatrix()
            Lb:
                return
        }

        public void setTranslateX(float r2) {
                r1 = this;
                float r0 = r1.mTranslateX
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.mTranslateX = r2
                r1.updateLocalMatrix()
            Lb:
                return
        }

        public void setTranslateY(float r2) {
                r1 = this;
                float r0 = r1.mTranslateY
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.mTranslateY = r2
                r1.updateLocalMatrix()
            Lb:
                return
        }
    }

    private static abstract class VObject {
        private VObject() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ VObject(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.C04461 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean isStateful() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean onStateChanged(int[] r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    private static abstract class VPath extends androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject {
        protected static final int FILL_TYPE_WINDING = 0;
        int mChangingConfigurations;
        int mFillRule;
        protected androidx.core.graphics.PathParser.PathDataNode[] mNodes;
        java.lang.String mPathName;

        public VPath() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.mNodes = r0
                r0 = 0
                r1.mFillRule = r0
                return
        }

        public VPath(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.mNodes = r0
                r0 = 0
                r1.mFillRule = r0
                java.lang.String r0 = r2.mPathName
                r1.mPathName = r0
                int r0 = r2.mChangingConfigurations
                r1.mChangingConfigurations = r0
                androidx.core.graphics.PathParser$PathDataNode[] r2 = r2.mNodes
                androidx.core.graphics.PathParser$PathDataNode[] r2 = androidx.core.graphics.PathParser.deepCopyNodes(r2)
                r1.mNodes = r2
                return
        }

        public void applyTheme(android.content.res.Resources.Theme r1) {
                r0 = this;
                return
        }

        public boolean canApplyTheme() {
                r1 = this;
                r0 = 0
                return r0
        }

        public androidx.core.graphics.PathParser.PathDataNode[] getPathData() {
                r1 = this;
                androidx.core.graphics.PathParser$PathDataNode[] r0 = r1.mNodes
                return r0
        }

        public java.lang.String getPathName() {
                r1 = this;
                java.lang.String r0 = r1.mPathName
                return r0
        }

        public boolean isClipPath() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String nodesToString(androidx.core.graphics.PathParser.PathDataNode[] r7) {
                r6 = this;
                java.lang.String r0 = " "
                r1 = 0
                r2 = r1
            L4:
                int r3 = r7.length
                if (r2 >= r3) goto L49
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r0 = r3.append(r0)
                r3 = r7[r2]
                char r3 = r3.mType
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.String r3 = ":"
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.String r0 = r0.toString()
                r3 = r7[r2]
                float[] r3 = r3.mParams
                r4 = r1
            L27:
                int r5 = r3.length
                if (r4 >= r5) goto L46
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.StringBuilder r0 = r5.append(r0)
                r5 = r3[r4]
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r5 = ","
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r0 = r0.toString()
                int r4 = r4 + 1
                goto L27
            L46:
                int r2 = r2 + 1
                goto L4
            L49:
                return r0
        }

        public void printVPath(int r4) {
                r3 = this;
                java.lang.String r0 = ""
                r1 = 0
            L3:
                if (r1 >= r4) goto L1b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r0 = r2.append(r0)
                java.lang.String r2 = "    "
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                int r1 = r1 + 1
                goto L3
            L1b:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.StringBuilder r4 = r4.append(r0)
                java.lang.String r0 = "current path is :"
                java.lang.StringBuilder r4 = r4.append(r0)
                java.lang.String r0 = r3.mPathName
                java.lang.StringBuilder r4 = r4.append(r0)
                java.lang.String r0 = " pathData is "
                java.lang.StringBuilder r4 = r4.append(r0)
                androidx.core.graphics.PathParser$PathDataNode[] r0 = r3.mNodes
                java.lang.String r0 = r3.nodesToString(r0)
                java.lang.StringBuilder r4 = r4.append(r0)
                java.lang.String r4 = r4.toString()
                java.lang.String r0 = "VectorDrawableCompat"
                android.util.Log.v(r0, r4)
                return
        }

        public void setPathData(androidx.core.graphics.PathParser.PathDataNode[] r2) {
                r1 = this;
                androidx.core.graphics.PathParser$PathDataNode[] r0 = r1.mNodes
                boolean r0 = androidx.core.graphics.PathParser.canMorph(r0, r2)
                if (r0 != 0) goto Lf
                androidx.core.graphics.PathParser$PathDataNode[] r2 = androidx.core.graphics.PathParser.deepCopyNodes(r2)
                r1.mNodes = r2
                goto L14
            Lf:
                androidx.core.graphics.PathParser$PathDataNode[] r0 = r1.mNodes
                androidx.core.graphics.PathParser.updateNodes(r0, r2)
            L14:
                return
        }

        public void toPath(android.graphics.Path r2) {
                r1 = this;
                r2.reset()
                androidx.core.graphics.PathParser$PathDataNode[] r0 = r1.mNodes
                if (r0 == 0) goto La
                androidx.core.graphics.PathParser.PathDataNode.nodesToPath(r0, r2)
            La:
                return
        }
    }

    private static class VPathRenderer {
        private static final android.graphics.Matrix IDENTITY_MATRIX = null;
        float mBaseHeight;
        float mBaseWidth;
        private int mChangingConfigurations;
        android.graphics.Paint mFillPaint;
        private final android.graphics.Matrix mFinalPathMatrix;
        java.lang.Boolean mIsStateful;
        private final android.graphics.Path mPath;
        private android.graphics.PathMeasure mPathMeasure;
        private final android.graphics.Path mRenderPath;
        int mRootAlpha;
        final androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup mRootGroup;
        java.lang.String mRootName;
        android.graphics.Paint mStrokePaint;
        final androidx.collection.ArrayMap<java.lang.String, java.lang.Object> mVGTargetsMap;
        float mViewportHeight;
        float mViewportWidth;

        static {
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer.IDENTITY_MATRIX = r0
                return
        }

        public VPathRenderer() {
                r1 = this;
                r1.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r1.mFinalPathMatrix = r0
                r0 = 0
                r1.mBaseWidth = r0
                r1.mBaseHeight = r0
                r1.mViewportWidth = r0
                r1.mViewportHeight = r0
                r0 = 255(0xff, float:3.57E-43)
                r1.mRootAlpha = r0
                r0 = 0
                r1.mRootName = r0
                r1.mIsStateful = r0
                androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
                r0.<init>()
                r1.mVGTargetsMap = r0
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup
                r0.<init>()
                r1.mRootGroup = r0
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r1.mPath = r0
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r1.mRenderPath = r0
                return
        }

        public VPathRenderer(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer r4) {
                r3 = this;
                r3.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r3.mFinalPathMatrix = r0
                r0 = 0
                r3.mBaseWidth = r0
                r3.mBaseHeight = r0
                r3.mViewportWidth = r0
                r3.mViewportHeight = r0
                r0 = 255(0xff, float:3.57E-43)
                r3.mRootAlpha = r0
                r0 = 0
                r3.mRootName = r0
                r3.mIsStateful = r0
                androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
                r0.<init>()
                r3.mVGTargetsMap = r0
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r1 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r2 = r4.mRootGroup
                r1.<init>(r2, r0)
                r3.mRootGroup = r1
                android.graphics.Path r1 = new android.graphics.Path
                android.graphics.Path r2 = r4.mPath
                r1.<init>(r2)
                r3.mPath = r1
                android.graphics.Path r1 = new android.graphics.Path
                android.graphics.Path r2 = r4.mRenderPath
                r1.<init>(r2)
                r3.mRenderPath = r1
                float r1 = r4.mBaseWidth
                r3.mBaseWidth = r1
                float r1 = r4.mBaseHeight
                r3.mBaseHeight = r1
                float r1 = r4.mViewportWidth
                r3.mViewportWidth = r1
                float r1 = r4.mViewportHeight
                r3.mViewportHeight = r1
                int r1 = r4.mChangingConfigurations
                r3.mChangingConfigurations = r1
                int r1 = r4.mRootAlpha
                r3.mRootAlpha = r1
                java.lang.String r1 = r4.mRootName
                r3.mRootName = r1
                java.lang.String r1 = r4.mRootName
                if (r1 == 0) goto L61
                r0.put(r1, r3)
            L61:
                java.lang.Boolean r4 = r4.mIsStateful
                r3.mIsStateful = r4
                return
        }

        private static float cross(float r0, float r1, float r2, float r3) {
                float r0 = r0 * r3
                float r1 = r1 * r2
                float r0 = r0 - r1
                return r0
        }

        private void drawGroupTree(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup r10, android.graphics.Matrix r11, android.graphics.Canvas r12, int r13, int r14, android.graphics.ColorFilter r15) {
                r9 = this;
                android.graphics.Matrix r0 = r10.mStackedMatrix
                r0.set(r11)
                android.graphics.Matrix r11 = r10.mStackedMatrix
                android.graphics.Matrix r0 = r10.mLocalMatrix
                r11.preConcat(r0)
                r12.save()
                r11 = 0
            L10:
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r0 = r10.mChildren
                int r0 = r0.size()
                if (r11 >= r0) goto L45
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r0 = r10.mChildren
                java.lang.Object r0 = r0.get(r11)
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject r0 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject) r0
                boolean r1 = r0 instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup
                if (r1 == 0) goto L32
                r3 = r0
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r3 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) r3
                android.graphics.Matrix r4 = r10.mStackedMatrix
                r2 = r9
                r5 = r12
                r6 = r13
                r7 = r14
                r8 = r15
                r2.drawGroupTree(r3, r4, r5, r6, r7, r8)
                goto L42
            L32:
                boolean r1 = r0 instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
                if (r1 == 0) goto L42
                r4 = r0
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPath r4 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath) r4
                r2 = r9
                r3 = r10
                r5 = r12
                r6 = r13
                r7 = r14
                r8 = r15
                r2.drawPath(r3, r4, r5, r6, r7, r8)
            L42:
                int r11 = r11 + 1
                goto L10
            L45:
                r12.restore()
                return
        }

        private void drawPath(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup r8, androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath r9, android.graphics.Canvas r10, int r11, int r12, android.graphics.ColorFilter r13) {
                r7 = this;
                float r11 = (float) r11
                float r0 = r7.mViewportWidth
                float r11 = r11 / r0
                float r12 = (float) r12
                float r0 = r7.mViewportHeight
                float r12 = r12 / r0
                float r0 = java.lang.Math.min(r11, r12)
                android.graphics.Matrix r8 = r8.mStackedMatrix
                android.graphics.Matrix r1 = r7.mFinalPathMatrix
                r1.set(r8)
                android.graphics.Matrix r1 = r7.mFinalPathMatrix
                r1.postScale(r11, r12)
                float r8 = r7.getMatrixScale(r8)
                r11 = 0
                int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                if (r12 != 0) goto L22
                return
            L22:
                android.graphics.Path r12 = r7.mPath
                r9.toPath(r12)
                android.graphics.Path r12 = r7.mPath
                android.graphics.Path r1 = r7.mRenderPath
                r1.reset()
                boolean r1 = r9.isClipPath()
                if (r1 == 0) goto L50
                android.graphics.Path r8 = r7.mRenderPath
                int r9 = r9.mFillRule
                if (r9 != 0) goto L3d
                android.graphics.Path$FillType r9 = android.graphics.Path.FillType.WINDING
                goto L3f
            L3d:
                android.graphics.Path$FillType r9 = android.graphics.Path.FillType.EVEN_ODD
            L3f:
                r8.setFillType(r9)
                android.graphics.Path r8 = r7.mRenderPath
                android.graphics.Matrix r9 = r7.mFinalPathMatrix
                r8.addPath(r12, r9)
                android.graphics.Path r8 = r7.mRenderPath
                r10.clipPath(r8)
                goto L182
            L50:
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VFullPath r9 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath) r9
                float r1 = r9.mTrimPathStart
                int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                r2 = 1065353216(0x3f800000, float:1.0)
                r3 = 1
                if (r1 != 0) goto L61
                float r1 = r9.mTrimPathEnd
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 == 0) goto La2
            L61:
                float r1 = r9.mTrimPathStart
                float r4 = r9.mTrimPathOffset
                float r1 = r1 + r4
                float r1 = r1 % r2
                float r4 = r9.mTrimPathEnd
                float r5 = r9.mTrimPathOffset
                float r4 = r4 + r5
                float r4 = r4 % r2
                android.graphics.PathMeasure r2 = r7.mPathMeasure
                if (r2 != 0) goto L78
                android.graphics.PathMeasure r2 = new android.graphics.PathMeasure
                r2.<init>()
                r7.mPathMeasure = r2
            L78:
                android.graphics.PathMeasure r2 = r7.mPathMeasure
                android.graphics.Path r5 = r7.mPath
                r6 = 0
                r2.setPath(r5, r6)
                android.graphics.PathMeasure r2 = r7.mPathMeasure
                float r2 = r2.getLength()
                float r1 = r1 * r2
                float r4 = r4 * r2
                r12.reset()
                int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r5 <= 0) goto L9a
                android.graphics.PathMeasure r5 = r7.mPathMeasure
                r5.getSegment(r1, r2, r12, r3)
                android.graphics.PathMeasure r1 = r7.mPathMeasure
                r1.getSegment(r11, r4, r12, r3)
                goto L9f
            L9a:
                android.graphics.PathMeasure r2 = r7.mPathMeasure
                r2.getSegment(r1, r4, r12, r3)
            L9f:
                r12.rLineTo(r11, r11)
            La2:
                android.graphics.Path r11 = r7.mRenderPath
                android.graphics.Matrix r1 = r7.mFinalPathMatrix
                r11.addPath(r12, r1)
                androidx.core.content.res.ComplexColorCompat r11 = r9.mFillColor
                boolean r11 = r11.willDraw()
                r12 = 1132396544(0x437f0000, float:255.0)
                r1 = 255(0xff, float:3.57E-43)
                r2 = 0
                if (r11 == 0) goto L110
                androidx.core.content.res.ComplexColorCompat r11 = r9.mFillColor
                android.graphics.Paint r4 = r7.mFillPaint
                if (r4 != 0) goto Lc8
                android.graphics.Paint r4 = new android.graphics.Paint
                r4.<init>(r3)
                r7.mFillPaint = r4
                android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
                r4.setStyle(r5)
            Lc8:
                android.graphics.Paint r4 = r7.mFillPaint
                boolean r5 = r11.isGradient()
                if (r5 == 0) goto Le7
                android.graphics.Shader r11 = r11.getShader()
                android.graphics.Matrix r5 = r7.mFinalPathMatrix
                r11.setLocalMatrix(r5)
                r4.setShader(r11)
                float r11 = r9.mFillAlpha
                float r11 = r11 * r12
                int r11 = java.lang.Math.round(r11)
                r4.setAlpha(r11)
                goto Lfa
            Le7:
                r4.setShader(r2)
                r4.setAlpha(r1)
                int r11 = r11.getColor()
                float r5 = r9.mFillAlpha
                int r11 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.applyAlpha(r11, r5)
                r4.setColor(r11)
            Lfa:
                r4.setColorFilter(r13)
                android.graphics.Path r11 = r7.mRenderPath
                int r5 = r9.mFillRule
                if (r5 != 0) goto L106
                android.graphics.Path$FillType r5 = android.graphics.Path.FillType.WINDING
                goto L108
            L106:
                android.graphics.Path$FillType r5 = android.graphics.Path.FillType.EVEN_ODD
            L108:
                r11.setFillType(r5)
                android.graphics.Path r11 = r7.mRenderPath
                r10.drawPath(r11, r4)
            L110:
                androidx.core.content.res.ComplexColorCompat r11 = r9.mStrokeColor
                boolean r11 = r11.willDraw()
                if (r11 == 0) goto L182
                androidx.core.content.res.ComplexColorCompat r11 = r9.mStrokeColor
                android.graphics.Paint r4 = r7.mStrokePaint
                if (r4 != 0) goto L12a
                android.graphics.Paint r4 = new android.graphics.Paint
                r4.<init>(r3)
                r7.mStrokePaint = r4
                android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
                r4.setStyle(r3)
            L12a:
                android.graphics.Paint r3 = r7.mStrokePaint
                android.graphics.Paint$Join r4 = r9.mStrokeLineJoin
                if (r4 == 0) goto L135
                android.graphics.Paint$Join r4 = r9.mStrokeLineJoin
                r3.setStrokeJoin(r4)
            L135:
                android.graphics.Paint$Cap r4 = r9.mStrokeLineCap
                if (r4 == 0) goto L13e
                android.graphics.Paint$Cap r4 = r9.mStrokeLineCap
                r3.setStrokeCap(r4)
            L13e:
                float r4 = r9.mStrokeMiterlimit
                r3.setStrokeMiter(r4)
                boolean r4 = r11.isGradient()
                if (r4 == 0) goto L160
                android.graphics.Shader r11 = r11.getShader()
                android.graphics.Matrix r1 = r7.mFinalPathMatrix
                r11.setLocalMatrix(r1)
                r3.setShader(r11)
                float r11 = r9.mStrokeAlpha
                float r11 = r11 * r12
                int r11 = java.lang.Math.round(r11)
                r3.setAlpha(r11)
                goto L173
            L160:
                r3.setShader(r2)
                r3.setAlpha(r1)
                int r11 = r11.getColor()
                float r12 = r9.mStrokeAlpha
                int r11 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.applyAlpha(r11, r12)
                r3.setColor(r11)
            L173:
                r3.setColorFilter(r13)
                float r0 = r0 * r8
                float r8 = r9.mStrokeWidth
                float r8 = r8 * r0
                r3.setStrokeWidth(r8)
                android.graphics.Path r8 = r7.mRenderPath
                r10.drawPath(r8, r3)
            L182:
                return
        }

        private float getMatrixScale(android.graphics.Matrix r10) {
                r9 = this;
                r0 = 4
                float[] r0 = new float[r0]
                r0 = {x0040: FILL_ARRAY_DATA , data: [0, 1065353216, 1065353216, 0} // fill-array
                r10.mapVectors(r0)
                r10 = 0
                r1 = r0[r10]
                double r1 = (double) r1
                r3 = 1
                r4 = r0[r3]
                double r4 = (double) r4
                double r1 = java.lang.Math.hypot(r1, r4)
                float r1 = (float) r1
                r2 = 2
                r4 = r0[r2]
                double r4 = (double) r4
                r6 = 3
                r7 = r0[r6]
                double r7 = (double) r7
                double r4 = java.lang.Math.hypot(r4, r7)
                float r4 = (float) r4
                r10 = r0[r10]
                r3 = r0[r3]
                r2 = r0[r2]
                r0 = r0[r6]
                float r10 = cross(r10, r3, r2, r0)
                float r0 = java.lang.Math.max(r1, r4)
                r1 = 0
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 <= 0) goto L3e
                float r10 = java.lang.Math.abs(r10)
                float r1 = r10 / r0
            L3e:
                return r1
        }

        public void draw(android.graphics.Canvas r8, int r9, int r10, android.graphics.ColorFilter r11) {
                r7 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r1 = r7.mRootGroup
                android.graphics.Matrix r2 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer.IDENTITY_MATRIX
                r0 = r7
                r3 = r8
                r4 = r9
                r5 = r10
                r6 = r11
                r0.drawGroupTree(r1, r2, r3, r4, r5, r6)
                return
        }

        public float getAlpha() {
                r2 = this;
                int r0 = r2.getRootAlpha()
                float r0 = (float) r0
                r1 = 1132396544(0x437f0000, float:255.0)
                float r0 = r0 / r1
                return r0
        }

        public int getRootAlpha() {
                r1 = this;
                int r0 = r1.mRootAlpha
                return r0
        }

        public boolean isStateful() {
                r1 = this;
                java.lang.Boolean r0 = r1.mIsStateful
                if (r0 != 0) goto L10
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r0 = r1.mRootGroup
                boolean r0 = r0.isStateful()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r1.mIsStateful = r0
            L10:
                java.lang.Boolean r0 = r1.mIsStateful
                boolean r0 = r0.booleanValue()
                return r0
        }

        public boolean onStateChanged(int[] r2) {
                r1 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r0 = r1.mRootGroup
                boolean r2 = r0.onStateChanged(r2)
                return r2
        }

        public void setAlpha(float r2) {
                r1 = this;
                r0 = 1132396544(0x437f0000, float:255.0)
                float r2 = r2 * r0
                int r2 = (int) r2
                r1.setRootAlpha(r2)
                return
        }

        public void setRootAlpha(int r1) {
                r0 = this;
                r0.mRootAlpha = r1
                return
        }
    }

    private static class VectorDrawableCompatState extends android.graphics.drawable.Drawable.ConstantState {
        boolean mAutoMirrored;
        boolean mCacheDirty;
        boolean mCachedAutoMirrored;
        android.graphics.Bitmap mCachedBitmap;
        int mCachedRootAlpha;
        int[] mCachedThemeAttrs;
        android.content.res.ColorStateList mCachedTint;
        android.graphics.PorterDuff.Mode mCachedTintMode;
        int mChangingConfigurations;
        android.graphics.Paint mTempPaint;
        android.content.res.ColorStateList mTint;
        android.graphics.PorterDuff.Mode mTintMode;
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer mVPathRenderer;

        public VectorDrawableCompatState() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mTint = r0
                android.graphics.PorterDuff$Mode r0 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.DEFAULT_TINT_MODE
                r1.mTintMode = r0
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer
                r0.<init>()
                r1.mVPathRenderer = r0
                return
        }

        public VectorDrawableCompatState(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState r4) {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.mTint = r0
                android.graphics.PorterDuff$Mode r0 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.DEFAULT_TINT_MODE
                r3.mTintMode = r0
                if (r4 == 0) goto L4b
                int r0 = r4.mChangingConfigurations
                r3.mChangingConfigurations = r0
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r1 = r4.mVPathRenderer
                r0.<init>(r1)
                r3.mVPathRenderer = r0
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r4.mVPathRenderer
                android.graphics.Paint r0 = r0.mFillPaint
                if (r0 == 0) goto L2c
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r3.mVPathRenderer
                android.graphics.Paint r1 = new android.graphics.Paint
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r2 = r4.mVPathRenderer
                android.graphics.Paint r2 = r2.mFillPaint
                r1.<init>(r2)
                r0.mFillPaint = r1
            L2c:
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r4.mVPathRenderer
                android.graphics.Paint r0 = r0.mStrokePaint
                if (r0 == 0) goto L3f
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r3.mVPathRenderer
                android.graphics.Paint r1 = new android.graphics.Paint
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r2 = r4.mVPathRenderer
                android.graphics.Paint r2 = r2.mStrokePaint
                r1.<init>(r2)
                r0.mStrokePaint = r1
            L3f:
                android.content.res.ColorStateList r0 = r4.mTint
                r3.mTint = r0
                android.graphics.PorterDuff$Mode r0 = r4.mTintMode
                r3.mTintMode = r0
                boolean r4 = r4.mAutoMirrored
                r3.mAutoMirrored = r4
            L4b:
                return
        }

        public boolean canReuseBitmap(int r2, int r3) {
                r1 = this;
                android.graphics.Bitmap r0 = r1.mCachedBitmap
                int r0 = r0.getWidth()
                if (r2 != r0) goto L12
                android.graphics.Bitmap r2 = r1.mCachedBitmap
                int r2 = r2.getHeight()
                if (r3 != r2) goto L12
                r2 = 1
                return r2
            L12:
                r2 = 0
                return r2
        }

        public boolean canReuseCache() {
                r2 = this;
                boolean r0 = r2.mCacheDirty
                if (r0 != 0) goto L22
                android.content.res.ColorStateList r0 = r2.mCachedTint
                android.content.res.ColorStateList r1 = r2.mTint
                if (r0 != r1) goto L22
                android.graphics.PorterDuff$Mode r0 = r2.mCachedTintMode
                android.graphics.PorterDuff$Mode r1 = r2.mTintMode
                if (r0 != r1) goto L22
                boolean r0 = r2.mCachedAutoMirrored
                boolean r1 = r2.mAutoMirrored
                if (r0 != r1) goto L22
                int r0 = r2.mCachedRootAlpha
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r1 = r2.mVPathRenderer
                int r1 = r1.getRootAlpha()
                if (r0 != r1) goto L22
                r0 = 1
                return r0
            L22:
                r0 = 0
                return r0
        }

        public void createCachedBitmapIfNeeded(int r2, int r3) {
                r1 = this;
                android.graphics.Bitmap r0 = r1.mCachedBitmap
                if (r0 == 0) goto La
                boolean r0 = r1.canReuseBitmap(r2, r3)
                if (r0 != 0) goto L15
            La:
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r0)
                r1.mCachedBitmap = r2
                r2 = 1
                r1.mCacheDirty = r2
            L15:
                return
        }

        public void drawCachedBitmapWithRootAlpha(android.graphics.Canvas r3, android.graphics.ColorFilter r4, android.graphics.Rect r5) {
                r2 = this;
                android.graphics.Paint r4 = r2.getPaint(r4)
                android.graphics.Bitmap r0 = r2.mCachedBitmap
                r1 = 0
                r3.drawBitmap(r0, r1, r5, r4)
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                int r0 = r1.mChangingConfigurations
                return r0
        }

        public android.graphics.Paint getPaint(android.graphics.ColorFilter r3) {
                r2 = this;
                boolean r0 = r2.hasTranslucentRoot()
                if (r0 != 0) goto La
                if (r3 != 0) goto La
                r3 = 0
                return r3
            La:
                android.graphics.Paint r0 = r2.mTempPaint
                if (r0 != 0) goto L19
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r2.mTempPaint = r0
                r1 = 1
                r0.setFilterBitmap(r1)
            L19:
                android.graphics.Paint r0 = r2.mTempPaint
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r1 = r2.mVPathRenderer
                int r1 = r1.getRootAlpha()
                r0.setAlpha(r1)
                android.graphics.Paint r0 = r2.mTempPaint
                r0.setColorFilter(r3)
                android.graphics.Paint r3 = r2.mTempPaint
                return r3
        }

        public boolean hasTranslucentRoot() {
                r2 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r2.mVPathRenderer
                int r0 = r0.getRootAlpha()
                r1 = 255(0xff, float:3.57E-43)
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public boolean isStateful() {
                r1 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r1.mVPathRenderer
                boolean r0 = r0.isStateful()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
                r0.<init>(r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r1) {
                r0 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r1 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
                r1.<init>(r0)
                return r1
        }

        public boolean onStateChanged(int[] r2) {
                r1 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r1.mVPathRenderer
                boolean r2 = r0.onStateChanged(r2)
                boolean r0 = r1.mCacheDirty
                r0 = r0 | r2
                r1.mCacheDirty = r0
                return r2
        }

        public void updateCacheStates() {
                r1 = this;
                android.content.res.ColorStateList r0 = r1.mTint
                r1.mCachedTint = r0
                android.graphics.PorterDuff$Mode r0 = r1.mTintMode
                r1.mCachedTintMode = r0
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r1.mVPathRenderer
                int r0 = r0.getRootAlpha()
                r1.mCachedRootAlpha = r0
                boolean r0 = r1.mAutoMirrored
                r1.mCachedAutoMirrored = r0
                r0 = 0
                r1.mCacheDirty = r0
                return
        }

        public void updateCachedBitmap(int r4, int r5) {
                r3 = this;
                android.graphics.Bitmap r0 = r3.mCachedBitmap
                r1 = 0
                r0.eraseColor(r1)
                android.graphics.Canvas r0 = new android.graphics.Canvas
                android.graphics.Bitmap r1 = r3.mCachedBitmap
                r0.<init>(r1)
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r1 = r3.mVPathRenderer
                r2 = 0
                r1.draw(r0, r4, r5, r2)
                return
        }
    }

    private static class VectorDrawableDelegateState extends android.graphics.drawable.Drawable.ConstantState {
        private final android.graphics.drawable.Drawable.ConstantState mDelegateState;

        public VectorDrawableDelegateState(android.graphics.drawable.Drawable.ConstantState r1) {
                r0 = this;
                r0.<init>()
                r0.mDelegateState = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.mDelegateState
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.mDelegateState
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.mDelegateState
                android.graphics.drawable.Drawable r1 = r1.newDrawable()
                android.graphics.drawable.VectorDrawable r1 = (android.graphics.drawable.VectorDrawable) r1
                r0.mDelegateDrawable = r1
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3) {
                r2 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.mDelegateState
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3)
                android.graphics.drawable.VectorDrawable r3 = (android.graphics.drawable.VectorDrawable) r3
                r0.mDelegateDrawable = r3
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3, android.content.res.Resources.Theme r4) {
                r2 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.mDelegateState
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3, r4)
                android.graphics.drawable.VectorDrawable r3 = (android.graphics.drawable.VectorDrawable) r3
                r0.mDelegateDrawable = r3
                return r0
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.DEFAULT_TINT_MODE = r0
            return
    }

    VectorDrawableCompat() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mAllowCaching = r0
            r0 = 9
            float[] r0 = new float[r0]
            r1.mTmpFloats = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.mTmpMatrix = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mTmpBounds = r0
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState
            r0.<init>()
            r1.mVectorState = r0
            return
    }

    VectorDrawableCompat(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.mAllowCaching = r0
            r0 = 9
            float[] r0 = new float[r0]
            r2.mTmpFloats = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.mTmpMatrix = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mTmpBounds = r0
            r2.mVectorState = r3
            android.graphics.PorterDuffColorFilter r0 = r2.mTintFilter
            android.content.res.ColorStateList r1 = r3.mTint
            android.graphics.PorterDuff$Mode r3 = r3.mTintMode
            android.graphics.PorterDuffColorFilter r3 = r2.updateTintFilter(r0, r1, r3)
            r2.mTintFilter = r3
            return
    }

    static int applyAlpha(int r2, float r3) {
            int r0 = android.graphics.Color.alpha(r2)
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = (int) r0
            int r3 = r3 << 24
            r2 = r2 | r3
            return r2
    }

    public static androidx.vectordrawable.graphics.drawable.VectorDrawableCompat create(android.content.res.Resources r1, int r2, android.content.res.Resources.Theme r3) {
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
            r0.<init>()
            android.graphics.drawable.Drawable r1 = androidx.core.content.res.ResourcesCompat.getDrawable(r1, r2, r3)
            r0.mDelegateDrawable = r1
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableDelegateState r1 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableDelegateState
            android.graphics.drawable.Drawable r2 = r0.mDelegateDrawable
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            r1.<init>(r2)
            r0.mCachedConstantStateDelegate = r1
            return r0
    }

    public static androidx.vectordrawable.graphics.drawable.VectorDrawableCompat createFromXmlInner(android.content.res.Resources r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
            r0.<init>()
            r0.inflate(r1, r2, r3, r4)
            return r0
    }

    private void inflateInternal(android.content.res.Resources r11, org.xmlpull.v1.XmlPullParser r12, android.util.AttributeSet r13, android.content.res.Resources.Theme r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r10 = this;
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r10.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r1 = r0.mVPathRenderer
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r3 = r1.mRootGroup
            r2.push(r3)
            int r3 = r12.getEventType()
            int r4 = r12.getDepth()
            r5 = 1
            int r4 = r4 + r5
            r6 = r5
        L19:
            if (r3 == r5) goto Lcf
            int r7 = r12.getDepth()
            r8 = 3
            if (r7 >= r4) goto L24
            if (r3 == r8) goto Lcf
        L24:
            r7 = 2
            java.lang.String r9 = "group"
            if (r3 != r7) goto Lba
            java.lang.String r3 = r12.getName()
            java.lang.Object r7 = r2.peek()
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r7 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L61
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VFullPath r3 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VFullPath
            r3.<init>()
            r3.inflate(r11, r13, r14, r12)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r6 = r7.mChildren
            r6.add(r3)
            java.lang.String r6 = r3.getPathName()
            if (r6 == 0) goto L57
            androidx.collection.ArrayMap<java.lang.String, java.lang.Object> r6 = r1.mVGTargetsMap
            java.lang.String r7 = r3.getPathName()
            r6.put(r7, r3)
        L57:
            int r6 = r0.mChangingConfigurations
            int r3 = r3.mChangingConfigurations
            r3 = r3 | r6
            r0.mChangingConfigurations = r3
            r3 = 0
            r6 = r3
            goto Lc9
        L61:
            java.lang.String r8 = "clip-path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L8d
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VClipPath r3 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VClipPath
            r3.<init>()
            r3.inflate(r11, r13, r14, r12)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r7 = r7.mChildren
            r7.add(r3)
            java.lang.String r7 = r3.getPathName()
            if (r7 == 0) goto L85
            androidx.collection.ArrayMap<java.lang.String, java.lang.Object> r7 = r1.mVGTargetsMap
            java.lang.String r8 = r3.getPathName()
            r7.put(r8, r3)
        L85:
            int r7 = r0.mChangingConfigurations
            int r3 = r3.mChangingConfigurations
            r3 = r3 | r7
            r0.mChangingConfigurations = r3
            goto Lc9
        L8d:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto Lc9
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r3 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup
            r3.<init>()
            r3.inflate(r11, r13, r14, r12)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r7 = r7.mChildren
            r7.add(r3)
            r2.push(r3)
            java.lang.String r7 = r3.getGroupName()
            if (r7 == 0) goto Lb2
            androidx.collection.ArrayMap<java.lang.String, java.lang.Object> r7 = r1.mVGTargetsMap
            java.lang.String r8 = r3.getGroupName()
            r7.put(r8, r3)
        Lb2:
            int r7 = r0.mChangingConfigurations
            int r3 = r3.mChangingConfigurations
            r3 = r3 | r7
            r0.mChangingConfigurations = r3
            goto Lc9
        Lba:
            if (r3 != r8) goto Lc9
            java.lang.String r3 = r12.getName()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto Lc9
            r2.pop()
        Lc9:
            int r3 = r12.next()
            goto L19
        Lcf:
            if (r6 != 0) goto Ld2
            return
        Ld2:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = "no path defined"
            r11.<init>(r12)
            throw r11
    }

    private boolean needMirroring() {
            r2 = this;
            boolean r0 = r2.isAutoMirrored()
            if (r0 == 0) goto Le
            int r0 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r2)
            r1 = 1
            if (r0 != r1) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private static android.graphics.PorterDuff.Mode parseTintModeCompat(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 == r0) goto L17
            switch(r1) {
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L11:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L14:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L17:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L1a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L1d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }

    private void printGroupTree(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup r5, int r6) {
            r4 = this;
            java.lang.String r0 = ""
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r6) goto L1c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = "    "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            int r2 = r2 + 1
            goto L4
        L1c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = "current group is :"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r5.getGroupName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " rotation is "
            java.lang.StringBuilder r2 = r2.append(r3)
            float r3 = r5.mRotate
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "VectorDrawableCompat"
            android.util.Log.v(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = "matrix is :"
            java.lang.StringBuilder r0 = r0.append(r2)
            android.graphics.Matrix r2 = r5.getLocalMatrix()
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
        L6a:
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r0 = r5.mChildren
            int r0 = r0.size()
            if (r1 >= r0) goto L90
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r0 = r5.mChildren
            java.lang.Object r0 = r0.get(r1)
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject r0 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject) r0
            boolean r2 = r0 instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup
            if (r2 == 0) goto L86
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r0 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) r0
            int r2 = r6 + 1
            r4.printGroupTree(r0, r2)
            goto L8d
        L86:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPath r0 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath) r0
            int r2 = r6 + 1
            r0.printVPath(r2)
        L8d:
            int r1 = r1 + 1
            goto L6a
        L90:
            return
    }

    private void updateStateFromTypedArray(android.content.res.TypedArray r6, org.xmlpull.v1.XmlPullParser r7, android.content.res.Resources.Theme r8) throws org.xmlpull.v1.XmlPullParserException {
            r5 = this;
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r5.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r1 = r0.mVPathRenderer
            r2 = 6
            r3 = -1
            java.lang.String r4 = "tintMode"
            int r2 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r6, r7, r4, r2, r3)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r2 = parseTintModeCompat(r2, r3)
            r0.mTintMode = r2
            java.lang.String r2 = "tint"
            r3 = 1
            android.content.res.ColorStateList r8 = androidx.core.content.res.TypedArrayUtils.getNamedColorStateList(r6, r7, r8, r2, r3)
            if (r8 == 0) goto L1f
            r0.mTint = r8
        L1f:
            r8 = 5
            boolean r2 = r0.mAutoMirrored
            java.lang.String r3 = "autoMirrored"
            boolean r8 = androidx.core.content.res.TypedArrayUtils.getNamedBoolean(r6, r7, r3, r8, r2)
            r0.mAutoMirrored = r8
            r8 = 7
            float r0 = r1.mViewportWidth
            java.lang.String r2 = "viewportWidth"
            float r8 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r6, r7, r2, r8, r0)
            r1.mViewportWidth = r8
            r8 = 8
            float r0 = r1.mViewportHeight
            java.lang.String r2 = "viewportHeight"
            float r8 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r6, r7, r2, r8, r0)
            r1.mViewportHeight = r8
            float r8 = r1.mViewportWidth
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto Le0
            float r8 = r1.mViewportHeight
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto Lc3
            r8 = 3
            float r2 = r1.mBaseWidth
            float r8 = r6.getDimension(r8, r2)
            r1.mBaseWidth = r8
            r8 = 2
            float r2 = r1.mBaseHeight
            float r8 = r6.getDimension(r8, r2)
            r1.mBaseHeight = r8
            float r8 = r1.mBaseWidth
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto La6
            float r8 = r1.mBaseHeight
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto L89
            r8 = 4
            float r0 = r1.getAlpha()
            java.lang.String r2 = "alpha"
            float r7 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r6, r7, r2, r8, r0)
            r1.setAlpha(r7)
            r7 = 0
            java.lang.String r6 = r6.getString(r7)
            if (r6 == 0) goto L88
            r1.mRootName = r6
            androidx.collection.ArrayMap<java.lang.String, java.lang.Object> r7 = r1.mVGTargetsMap
            r7.put(r6, r1)
        L88:
            return
        L89:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = r6.getPositionDescription()
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r8 = "<vector> tag requires height > 0"
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        La6:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = r6.getPositionDescription()
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r8 = "<vector> tag requires width > 0"
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        Lc3:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = r6.getPositionDescription()
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r8 = "<vector> tag requires viewportHeight > 0"
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        Le0:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = r6.getPositionDescription()
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r8 = "<vector> tag requires viewportWidth > 0"
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(android.content.res.Resources.Theme r1) {
            r0 = this;
            super.applyTheme(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.canApplyTheme(r0)
        L9:
            r0 = 0
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
            r0 = this;
            super.clearColorFilter()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r10) {
            r9 = this;
            android.graphics.drawable.Drawable r0 = r9.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r9.mDelegateDrawable
            r0.draw(r10)
            return
        La:
            android.graphics.Rect r0 = r9.mTmpBounds
            r9.copyBounds(r0)
            android.graphics.Rect r0 = r9.mTmpBounds
            int r0 = r0.width()
            if (r0 <= 0) goto Ldb
            android.graphics.Rect r0 = r9.mTmpBounds
            int r0 = r0.height()
            if (r0 > 0) goto L21
            goto Ldb
        L21:
            android.graphics.ColorFilter r0 = r9.mColorFilter
            if (r0 != 0) goto L27
            android.graphics.PorterDuffColorFilter r0 = r9.mTintFilter
        L27:
            android.graphics.Matrix r1 = r9.mTmpMatrix
            r10.getMatrix(r1)
            android.graphics.Matrix r1 = r9.mTmpMatrix
            float[] r2 = r9.mTmpFloats
            r1.getValues(r2)
            float[] r1 = r9.mTmpFloats
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r9.mTmpFloats
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r9.mTmpFloats
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r5 = r9.mTmpFloats
            r6 = 3
            r5 = r5[r6]
            float r5 = java.lang.Math.abs(r5)
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L62
            int r4 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r4 == 0) goto L64
        L62:
            r1 = r7
            r3 = r1
        L64:
            android.graphics.Rect r4 = r9.mTmpBounds
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r9.mTmpBounds
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto Ldb
            if (r3 > 0) goto L85
            goto Ldb
        L85:
            int r4 = r10.save()
            android.graphics.Rect r5 = r9.mTmpBounds
            int r5 = r5.left
            float r5 = (float) r5
            android.graphics.Rect r8 = r9.mTmpBounds
            int r8 = r8.top
            float r8 = (float) r8
            r10.translate(r5, r8)
            boolean r5 = r9.needMirroring()
            if (r5 == 0) goto Lab
            android.graphics.Rect r5 = r9.mTmpBounds
            int r5 = r5.width()
            float r5 = (float) r5
            r10.translate(r5, r6)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10.scale(r5, r7)
        Lab:
            android.graphics.Rect r5 = r9.mTmpBounds
            r5.offsetTo(r2, r2)
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r2 = r9.mVectorState
            r2.createCachedBitmapIfNeeded(r1, r3)
            boolean r2 = r9.mAllowCaching
            if (r2 != 0) goto Lbf
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r2 = r9.mVectorState
            r2.updateCachedBitmap(r1, r3)
            goto Ld1
        Lbf:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r2 = r9.mVectorState
            boolean r2 = r2.canReuseCache()
            if (r2 != 0) goto Ld1
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r2 = r9.mVectorState
            r2.updateCachedBitmap(r1, r3)
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r1 = r9.mVectorState
            r1.updateCacheStates()
        Ld1:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r1 = r9.mVectorState
            android.graphics.Rect r2 = r9.mTmpBounds
            r1.drawCachedBitmapWithRootAlpha(r10, r0, r2)
            r10.restoreToCount(r4)
        Ldb:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            int r0 = androidx.core.graphics.drawable.DrawableCompat.getAlpha(r0)
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            int r0 = r0.getRootAlpha()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            int r0 = r0.getChangingConfigurations()
            return r0
        Lb:
            int r0 = super.getChangingConfigurations()
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r1 = r2.mVectorState
            int r1 = r1.getChangingConfigurations()
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            android.graphics.ColorFilter r0 = androidx.core.graphics.drawable.DrawableCompat.getColorFilter(r0)
            return r0
        Lb:
            android.graphics.ColorFilter r0 = r1.mColorFilter
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            if (r0 == 0) goto L10
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableDelegateState r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableDelegateState
            android.graphics.drawable.Drawable r1 = r2.mDelegateDrawable
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            r0.<init>(r1)
            return r0
        L10:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r2.mVectorState
            int r1 = r2.getChangingConfigurations()
            r0.mChangingConfigurations = r1
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r2.mVectorState
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = super.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            int r0 = r0.getIntrinsicHeight()
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            float r0 = r0.mBaseHeight
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            int r0 = r0.getIntrinsicWidth()
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            float r0 = r0.mBaseWidth
            int r0 = (int) r0
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
            r1 = this;
            int r0 = super.getMinimumHeight()
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
            r1 = this;
            int r0 = super.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            int r0 = r0.getOpacity()
            return r0
        Lb:
            r0 = -3
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(android.graphics.Rect r1) {
            r0 = this;
            boolean r1 = super.getPadding(r1)
            return r1
    }

    public float getPixelSize() {
            r4 = this;
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r4.mVectorState
            if (r0 == 0) goto L51
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            if (r0 == 0) goto L51
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r4.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            float r0 = r0.mBaseWidth
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L51
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r4.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            float r0 = r0.mBaseHeight
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L51
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r4.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            float r0 = r0.mViewportHeight
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L51
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r4.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            float r0 = r0.mViewportWidth
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L32
            goto L51
        L32:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r4.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            float r0 = r0.mBaseWidth
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r1 = r4.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r1 = r1.mVPathRenderer
            float r1 = r1.mBaseHeight
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r2 = r4.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r2 = r2.mVPathRenderer
            float r2 = r2.mViewportWidth
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r3 = r4.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r3 = r3.mVPathRenderer
            float r3 = r3.mViewportHeight
            float r2 = r2 / r0
            float r3 = r3 / r1
            float r0 = java.lang.Math.min(r2, r3)
            return r0
        L51:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
            r1 = this;
            int[] r0 = super.getState()
            return r0
    }

    java.lang.Object getTargetByName(java.lang.String r2) {
            r1 = this;
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            androidx.collection.ArrayMap<java.lang.String, java.lang.Object> r0 = r0.mVGTargetsMap
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.Region getTransparentRegion() {
            r1 = this;
            android.graphics.Region r0 = super.getTransparentRegion()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.inflate(r2, r3, r4)
            return
        La:
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r3, org.xmlpull.v1.XmlPullParser r4, android.util.AttributeSet r5, android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.inflate(r0, r3, r4, r5, r6)
            return
        La:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r2.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r1 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer
            r1.<init>()
            r0.mVPathRenderer = r1
            int[] r1 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY
            android.content.res.TypedArray r1 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r3, r6, r5, r1)
            r2.updateStateFromTypedArray(r1, r4, r6)
            r1.recycle()
            int r1 = r2.getChangingConfigurations()
            r0.mChangingConfigurations = r1
            r1 = 1
            r0.mCacheDirty = r1
            r2.inflateInternal(r3, r4, r5, r6)
            android.graphics.PorterDuffColorFilter r3 = r2.mTintFilter
            android.content.res.ColorStateList r4 = r0.mTint
            android.graphics.PorterDuff$Mode r5 = r0.mTintMode
            android.graphics.PorterDuffColorFilter r3 = r2.updateTintFilter(r3, r4, r5)
            r2.mTintFilter = r3
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.invalidateSelf()
            return
        La:
            super.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(r0)
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            boolean r0 = r0.mAutoMirrored
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            boolean r0 = r0.isStateful()
            return r0
        Lb:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L2e
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            if (r0 == 0) goto L2c
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L2e
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            android.content.res.ColorStateList r0 = r0.mTint
            if (r0 == 0) goto L2c
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            android.content.res.ColorStateList r0 = r0.mTint
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L2c
            goto L2e
        L2c:
            r0 = 0
            goto L2f
        L2e:
            r0 = 1
        L2f:
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
            r0 = this;
            super.jumpToCurrentState()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            r0.mutate()
            return r2
        La:
            boolean r0 = r2.mMutated
            if (r0 != 0) goto L20
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r2) goto L20
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r1 = r2.mVectorState
            r0.<init>(r1)
            r2.mVectorState = r0
            r0 = 1
            r2.mMutated = r0
        L20:
            return r2
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.setBounds(r2)
        L9:
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r5.mDelegateDrawable
            boolean r6 = r0.setState(r6)
            return r6
        Lb:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r5.mVectorState
            android.content.res.ColorStateList r1 = r0.mTint
            r2 = 1
            if (r1 == 0) goto L27
            android.graphics.PorterDuff$Mode r1 = r0.mTintMode
            if (r1 == 0) goto L27
            android.graphics.PorterDuffColorFilter r1 = r5.mTintFilter
            android.content.res.ColorStateList r3 = r0.mTint
            android.graphics.PorterDuff$Mode r4 = r0.mTintMode
            android.graphics.PorterDuffColorFilter r1 = r5.updateTintFilter(r1, r3, r4)
            r5.mTintFilter = r1
            r5.invalidateSelf()
            r1 = r2
            goto L28
        L27:
            r1 = 0
        L28:
            boolean r3 = r0.isStateful()
            if (r3 == 0) goto L38
            boolean r6 = r0.onStateChanged(r6)
            if (r6 == 0) goto L38
            r5.invalidateSelf()
            goto L39
        L38:
            r2 = r1
        L39:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(java.lang.Runnable r2, long r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.scheduleSelf(r2, r3)
            return
        La:
            super.scheduleSelf(r2, r3)
            return
    }

    void setAllowCaching(boolean r1) {
            r0 = this;
            r0.mAllowCaching = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.setAlpha(r2)
            return
        La:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            int r0 = r0.getRootAlpha()
            if (r0 == r2) goto L1e
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            r0.setRootAlpha(r2)
            r1.invalidateSelf()
        L1e:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(r0, r2)
            return
        La:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            r0.mAutoMirrored = r2
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int r1) {
            r0 = this;
            super.setChangingConfigurations(r1)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = this;
            super.setColorFilter(r1, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.setColorFilter(r2)
            return
        La:
            r1.mColorFilter = r2
            r1.invalidateSelf()
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean r1) {
            r0 = this;
            super.setFilterBitmap(r1)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float r1, float r2) {
            r0 = this;
            super.setHotspot(r1, r2)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.setHotspotBounds(r1, r2, r3, r4)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] r1) {
            r0 = this;
            boolean r1 = super.setState(r1)
            return r1
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.setTint(r0, r2)
            return
        La:
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r1.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r3)
            return
        La:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r2.mVectorState
            android.content.res.ColorStateList r1 = r0.mTint
            if (r1 == r3) goto L1f
            r0.mTint = r3
            android.graphics.PorterDuffColorFilter r1 = r2.mTintFilter
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode
            android.graphics.PorterDuffColorFilter r3 = r2.updateTintFilter(r1, r3, r0)
            r2.mTintFilter = r3
            r2.invalidateSelf()
        L1f:
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r3)
            return
        La:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r2.mVectorState
            android.graphics.PorterDuff$Mode r1 = r0.mTintMode
            if (r1 == r3) goto L1f
            r0.mTintMode = r3
            android.graphics.PorterDuffColorFilter r1 = r2.mTintFilter
            android.content.res.ColorStateList r0 = r0.mTint
            android.graphics.PorterDuffColorFilter r3 = r2.updateTintFilter(r1, r0, r3)
            r2.mTintFilter = r3
            r2.invalidateSelf()
        L1f:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            boolean r2 = r0.setVisible(r2, r3)
            return r2
        Lb:
            boolean r2 = super.setVisible(r2, r3)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(java.lang.Runnable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.unscheduleSelf(r2)
            return
        La:
            super.unscheduleSelf(r2)
            return
    }

    android.graphics.PorterDuffColorFilter updateTintFilter(android.graphics.PorterDuffColorFilter r2, android.content.res.ColorStateList r3, android.graphics.PorterDuff.Mode r4) {
            r1 = this;
            if (r3 == 0) goto L14
            if (r4 != 0) goto L5
            goto L14
        L5:
            int[] r2 = r1.getState()
            r0 = 0
            int r2 = r3.getColorForState(r2, r0)
            android.graphics.PorterDuffColorFilter r3 = new android.graphics.PorterDuffColorFilter
            r3.<init>(r2, r4)
            return r3
        L14:
            r2 = 0
            return r2
    }
}
