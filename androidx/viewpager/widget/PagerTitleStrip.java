package androidx.viewpager.widget;

@androidx.viewpager.widget.ViewPager.DecorView
/* loaded from: classes.dex */
public class PagerTitleStrip extends android.view.ViewGroup {
    private static final int[] ATTRS = null;
    private static final float SIDE_ALPHA = 0.6f;
    private static final int[] TEXT_ATTRS = null;
    private static final int TEXT_SPACING = 16;
    android.widget.TextView mCurrText;
    private int mGravity;
    private int mLastKnownCurrentPage;
    float mLastKnownPositionOffset;
    android.widget.TextView mNextText;
    private int mNonPrimaryAlpha;
    private final androidx.viewpager.widget.PagerTitleStrip.PageListener mPageListener;
    androidx.viewpager.widget.ViewPager mPager;
    android.widget.TextView mPrevText;
    private int mScaledTextSpacing;
    int mTextColor;
    private boolean mUpdatingPositions;
    private boolean mUpdatingText;
    private java.lang.ref.WeakReference<androidx.viewpager.widget.PagerAdapter> mWatchingAdapter;

    private class PageListener extends android.database.DataSetObserver implements androidx.viewpager.widget.ViewPager.OnPageChangeListener, androidx.viewpager.widget.ViewPager.OnAdapterChangeListener {
        private int mScrollState;
        final /* synthetic */ androidx.viewpager.widget.PagerTitleStrip this$0;

        PageListener(androidx.viewpager.widget.PagerTitleStrip r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(androidx.viewpager.widget.ViewPager r1, androidx.viewpager.widget.PagerAdapter r2, androidx.viewpager.widget.PagerAdapter r3) {
                r0 = this;
                androidx.viewpager.widget.PagerTitleStrip r1 = r0.this$0
                r1.updateAdapter(r2, r3)
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r4 = this;
                androidx.viewpager.widget.PagerTitleStrip r0 = r4.this$0
                androidx.viewpager.widget.ViewPager r1 = r0.mPager
                int r1 = r1.getCurrentItem()
                androidx.viewpager.widget.PagerTitleStrip r2 = r4.this$0
                androidx.viewpager.widget.ViewPager r2 = r2.mPager
                androidx.viewpager.widget.PagerAdapter r2 = r2.getAdapter()
                r0.updateText(r1, r2)
                androidx.viewpager.widget.PagerTitleStrip r0 = r4.this$0
                float r0 = r0.mLastKnownPositionOffset
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L20
                androidx.viewpager.widget.PagerTitleStrip r0 = r4.this$0
                float r1 = r0.mLastKnownPositionOffset
            L20:
                androidx.viewpager.widget.PagerTitleStrip r0 = r4.this$0
                androidx.viewpager.widget.ViewPager r2 = r0.mPager
                int r2 = r2.getCurrentItem()
                r3 = 1
                r0.updateTextPositions(r2, r1, r3)
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int r1) {
                r0 = this;
                r0.mScrollState = r1
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int r2, float r3, int r4) {
                r1 = this;
                r4 = 1056964608(0x3f000000, float:0.5)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 <= 0) goto L8
                int r2 = r2 + 1
            L8:
                androidx.viewpager.widget.PagerTitleStrip r4 = r1.this$0
                r0 = 0
                r4.updateTextPositions(r2, r3, r0)
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int r4) {
                r3 = this;
                int r4 = r3.mScrollState
                if (r4 != 0) goto L30
                androidx.viewpager.widget.PagerTitleStrip r4 = r3.this$0
                androidx.viewpager.widget.ViewPager r0 = r4.mPager
                int r0 = r0.getCurrentItem()
                androidx.viewpager.widget.PagerTitleStrip r1 = r3.this$0
                androidx.viewpager.widget.ViewPager r1 = r1.mPager
                androidx.viewpager.widget.PagerAdapter r1 = r1.getAdapter()
                r4.updateText(r0, r1)
                androidx.viewpager.widget.PagerTitleStrip r4 = r3.this$0
                float r4 = r4.mLastKnownPositionOffset
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L24
                androidx.viewpager.widget.PagerTitleStrip r4 = r3.this$0
                float r0 = r4.mLastKnownPositionOffset
            L24:
                androidx.viewpager.widget.PagerTitleStrip r4 = r3.this$0
                androidx.viewpager.widget.ViewPager r1 = r4.mPager
                int r1 = r1.getCurrentItem()
                r2 = 1
                r4.updateTextPositions(r1, r0, r2)
            L30:
                return
        }
    }

    private static class SingleLineAllCapsTransform extends android.text.method.SingleLineTransformationMethod {
        private java.util.Locale mLocale;

        SingleLineAllCapsTransform(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                android.content.res.Resources r1 = r1.getResources()
                android.content.res.Configuration r1 = r1.getConfiguration()
                java.util.Locale r1 = r1.locale
                r0.mLocale = r1
                return
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public java.lang.CharSequence getTransformation(java.lang.CharSequence r1, android.view.View r2) {
                r0 = this;
                java.lang.CharSequence r1 = super.getTransformation(r1, r2)
                if (r1 == 0) goto L11
                java.lang.String r1 = r1.toString()
                java.util.Locale r2 = r0.mLocale
                java.lang.String r1 = r1.toUpperCase(r2)
                goto L12
            L11:
                r1 = 0
            L12:
                return r1
        }
    }

    static {
            r0 = 4
            int[] r0 = new int[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [16842804, 16842901, 16842904, 16842927} // fill-array
            androidx.viewpager.widget.PagerTitleStrip.ATTRS = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843660(0x101038c, float:2.3696103E-38)
            r0[r1] = r2
            androidx.viewpager.widget.PagerTitleStrip.TEXT_ATTRS = r0
            return
    }

    public PagerTitleStrip(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public PagerTitleStrip(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r4.<init>(r5, r6)
            r0 = -1
            r4.mLastKnownCurrentPage = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.mLastKnownPositionOffset = r0
            androidx.viewpager.widget.PagerTitleStrip$PageListener r0 = new androidx.viewpager.widget.PagerTitleStrip$PageListener
            r0.<init>(r4)
            r4.mPageListener = r0
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r5)
            r4.mPrevText = r0
            r4.addView(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r5)
            r4.mCurrText = r0
            r4.addView(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r5)
            r4.mNextText = r0
            r4.addView(r0)
            int[] r0 = androidx.viewpager.widget.PagerTitleStrip.ATTRS
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r0)
            r0 = 0
            int r1 = r6.getResourceId(r0, r0)
            if (r1 == 0) goto L4b
            android.widget.TextView r2 = r4.mPrevText
            androidx.core.widget.TextViewCompat.setTextAppearance(r2, r1)
            android.widget.TextView r2 = r4.mCurrText
            androidx.core.widget.TextViewCompat.setTextAppearance(r2, r1)
            android.widget.TextView r2 = r4.mNextText
            androidx.core.widget.TextViewCompat.setTextAppearance(r2, r1)
        L4b:
            r2 = 1
            int r2 = r6.getDimensionPixelSize(r2, r0)
            if (r2 == 0) goto L56
            float r2 = (float) r2
            r4.setTextSize(r0, r2)
        L56:
            r2 = 2
            boolean r3 = r6.hasValue(r2)
            if (r3 == 0) goto L70
            int r2 = r6.getColor(r2, r0)
            android.widget.TextView r3 = r4.mPrevText
            r3.setTextColor(r2)
            android.widget.TextView r3 = r4.mCurrText
            r3.setTextColor(r2)
            android.widget.TextView r3 = r4.mNextText
            r3.setTextColor(r2)
        L70:
            r2 = 3
            r3 = 80
            int r2 = r6.getInteger(r2, r3)
            r4.mGravity = r2
            r6.recycle()
            android.widget.TextView r6 = r4.mCurrText
            android.content.res.ColorStateList r6 = r6.getTextColors()
            int r6 = r6.getDefaultColor()
            r4.mTextColor = r6
            r6 = 1058642330(0x3f19999a, float:0.6)
            r4.setNonPrimaryAlpha(r6)
            android.widget.TextView r6 = r4.mPrevText
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r6.setEllipsize(r2)
            android.widget.TextView r6 = r4.mCurrText
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r6.setEllipsize(r2)
            android.widget.TextView r6 = r4.mNextText
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r6.setEllipsize(r2)
            if (r1 == 0) goto Lb2
            int[] r6 = androidx.viewpager.widget.PagerTitleStrip.TEXT_ATTRS
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r1, r6)
            boolean r0 = r6.getBoolean(r0, r0)
            r6.recycle()
        Lb2:
            if (r0 == 0) goto Lc4
            android.widget.TextView r6 = r4.mPrevText
            setSingleLineAllCaps(r6)
            android.widget.TextView r6 = r4.mCurrText
            setSingleLineAllCaps(r6)
            android.widget.TextView r6 = r4.mNextText
            setSingleLineAllCaps(r6)
            goto Ld3
        Lc4:
            android.widget.TextView r6 = r4.mPrevText
            r6.setSingleLine()
            android.widget.TextView r6 = r4.mCurrText
            r6.setSingleLine()
            android.widget.TextView r6 = r4.mNextText
            r6.setSingleLine()
        Ld3:
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r6 = 1098907648(0x41800000, float:16.0)
            float r5 = r5 * r6
            int r5 = (int) r5
            r4.mScaledTextSpacing = r5
            return
    }

    private static void setSingleLineAllCaps(android.widget.TextView r2) {
            androidx.viewpager.widget.PagerTitleStrip$SingleLineAllCapsTransform r0 = new androidx.viewpager.widget.PagerTitleStrip$SingleLineAllCapsTransform
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.setTransformationMethod(r0)
            return
    }

    int getMinHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            if (r0 == 0) goto Lb
            int r0 = r0.getIntrinsicHeight()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public int getTextSpacing() {
            r1 = this;
            int r0 = r1.mScaledTextSpacing
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r3 = this;
            super.onAttachedToWindow()
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof androidx.viewpager.widget.ViewPager
            if (r1 == 0) goto L2d
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            androidx.viewpager.widget.PagerAdapter r1 = r0.getAdapter()
            androidx.viewpager.widget.PagerTitleStrip$PageListener r2 = r3.mPageListener
            r0.setInternalPageChangeListener(r2)
            androidx.viewpager.widget.PagerTitleStrip$PageListener r2 = r3.mPageListener
            r0.addOnAdapterChangeListener(r2)
            r3.mPager = r0
            java.lang.ref.WeakReference<androidx.viewpager.widget.PagerAdapter> r0 = r3.mWatchingAdapter
            if (r0 == 0) goto L28
            java.lang.Object r0 = r0.get()
            androidx.viewpager.widget.PagerAdapter r0 = (androidx.viewpager.widget.PagerAdapter) r0
            goto L29
        L28:
            r0 = 0
        L29:
            r3.updateAdapter(r0, r1)
            return
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "PagerTitleStrip must be a direct child of a ViewPager."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            androidx.viewpager.widget.ViewPager r0 = r3.mPager
            if (r0 == 0) goto L1d
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            r1 = 0
            r3.updateAdapter(r0, r1)
            androidx.viewpager.widget.ViewPager r0 = r3.mPager
            r0.setInternalPageChangeListener(r1)
            androidx.viewpager.widget.ViewPager r0 = r3.mPager
            androidx.viewpager.widget.PagerTitleStrip$PageListener r2 = r3.mPageListener
            r0.removeOnAdapterChangeListener(r2)
            r3.mPager = r1
        L1d:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            androidx.viewpager.widget.ViewPager r1 = r0.mPager
            if (r1 == 0) goto L13
            float r1 = r0.mLastKnownPositionOffset
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 < 0) goto Lc
            goto Ld
        Lc:
            r1 = r2
        Ld:
            int r2 = r0.mLastKnownCurrentPage
            r3 = 1
            r0.updateTextPositions(r2, r1, r3)
        L13:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r8, int r9) {
            r7 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L5d
            int r0 = r7.getPaddingTop()
            int r2 = r7.getPaddingBottom()
            int r0 = r0 + r2
            r2 = -2
            int r3 = getChildMeasureSpec(r9, r0, r2)
            int r4 = android.view.View.MeasureSpec.getSize(r8)
            float r5 = (float) r4
            r6 = 1045220557(0x3e4ccccd, float:0.2)
            float r5 = r5 * r6
            int r5 = (int) r5
            int r8 = getChildMeasureSpec(r8, r5, r2)
            android.widget.TextView r2 = r7.mPrevText
            r2.measure(r8, r3)
            android.widget.TextView r2 = r7.mCurrText
            r2.measure(r8, r3)
            android.widget.TextView r2 = r7.mNextText
            r2.measure(r8, r3)
            int r8 = android.view.View.MeasureSpec.getMode(r9)
            if (r8 != r1) goto L3e
            int r8 = android.view.View.MeasureSpec.getSize(r9)
            goto L4d
        L3e:
            android.widget.TextView r8 = r7.mCurrText
            int r8 = r8.getMeasuredHeight()
            int r1 = r7.getMinHeight()
            int r8 = r8 + r0
            int r8 = java.lang.Math.max(r1, r8)
        L4d:
            android.widget.TextView r0 = r7.mCurrText
            int r0 = r0.getMeasuredState()
            int r0 = r0 << 16
            int r8 = android.view.View.resolveSizeAndState(r8, r9, r0)
            r7.setMeasuredDimension(r4, r8)
            return
        L5d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Must measure with an exact width"
            r8.<init>(r9)
            throw r8
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            boolean r0 = r1.mUpdatingText
            if (r0 != 0) goto L7
            super.requestLayout()
        L7:
            return
    }

    public void setGravity(int r1) {
            r0 = this;
            r0.mGravity = r1
            r0.requestLayout()
            return
    }

    public void setNonPrimaryAlpha(float r3) {
            r2 = this;
            r0 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r0
            int r3 = (int) r3
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2.mNonPrimaryAlpha = r3
            int r3 = r3 << 24
            int r0 = r2.mTextColor
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            r3 = r3 | r0
            android.widget.TextView r0 = r2.mPrevText
            r0.setTextColor(r3)
            android.widget.TextView r0 = r2.mNextText
            r0.setTextColor(r3)
            return
    }

    public void setTextColor(int r3) {
            r2 = this;
            r2.mTextColor = r3
            android.widget.TextView r0 = r2.mCurrText
            r0.setTextColor(r3)
            int r3 = r2.mNonPrimaryAlpha
            int r3 = r3 << 24
            int r0 = r2.mTextColor
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            r3 = r3 | r0
            android.widget.TextView r0 = r2.mPrevText
            r0.setTextColor(r3)
            android.widget.TextView r0 = r2.mNextText
            r0.setTextColor(r3)
            return
    }

    public void setTextSize(int r2, float r3) {
            r1 = this;
            android.widget.TextView r0 = r1.mPrevText
            r0.setTextSize(r2, r3)
            android.widget.TextView r0 = r1.mCurrText
            r0.setTextSize(r2, r3)
            android.widget.TextView r0 = r1.mNextText
            r0.setTextSize(r2, r3)
            return
    }

    public void setTextSpacing(int r1) {
            r0 = this;
            r0.mScaledTextSpacing = r1
            r0.requestLayout()
            return
    }

    void updateAdapter(androidx.viewpager.widget.PagerAdapter r2, androidx.viewpager.widget.PagerAdapter r3) {
            r1 = this;
            if (r2 == 0) goto La
            androidx.viewpager.widget.PagerTitleStrip$PageListener r0 = r1.mPageListener
            r2.unregisterDataSetObserver(r0)
            r2 = 0
            r1.mWatchingAdapter = r2
        La:
            if (r3 == 0) goto L18
            androidx.viewpager.widget.PagerTitleStrip$PageListener r2 = r1.mPageListener
            r3.registerDataSetObserver(r2)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r3)
            r1.mWatchingAdapter = r2
        L18:
            androidx.viewpager.widget.ViewPager r2 = r1.mPager
            if (r2 == 0) goto L2d
            r0 = -1
            r1.mLastKnownCurrentPage = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.mLastKnownPositionOffset = r0
            int r2 = r2.getCurrentItem()
            r1.updateText(r2, r3)
            r1.requestLayout()
        L2d:
            return
    }

    void updateText(int r6, androidx.viewpager.widget.PagerAdapter r7) {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L8
            int r1 = r7.getCount()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = 1
            r5.mUpdatingText = r2
            r3 = 0
            if (r6 < r2) goto L18
            if (r7 == 0) goto L18
            int r2 = r6 + (-1)
            java.lang.CharSequence r2 = r7.getPageTitle(r2)
            goto L19
        L18:
            r2 = r3
        L19:
            android.widget.TextView r4 = r5.mPrevText
            r4.setText(r2)
            android.widget.TextView r2 = r5.mCurrText
            if (r7 == 0) goto L29
            if (r6 >= r1) goto L29
            java.lang.CharSequence r4 = r7.getPageTitle(r6)
            goto L2a
        L29:
            r4 = r3
        L2a:
            r2.setText(r4)
            int r2 = r6 + 1
            if (r2 >= r1) goto L37
            if (r7 == 0) goto L37
            java.lang.CharSequence r3 = r7.getPageTitle(r2)
        L37:
            android.widget.TextView r7 = r5.mNextText
            r7.setText(r3)
            int r7 = r5.getWidth()
            int r1 = r5.getPaddingLeft()
            int r7 = r7 - r1
            int r1 = r5.getPaddingRight()
            int r7 = r7 - r1
            float r7 = (float) r7
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            float r7 = r7 * r1
            int r7 = (int) r7
            int r7 = java.lang.Math.max(r0, r7)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r2 = r5.getHeight()
            int r3 = r5.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r5.getPaddingBottom()
            int r2 = r2 - r3
            int r2 = java.lang.Math.max(r0, r2)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            android.widget.TextView r2 = r5.mPrevText
            r2.measure(r7, r1)
            android.widget.TextView r2 = r5.mCurrText
            r2.measure(r7, r1)
            android.widget.TextView r2 = r5.mNextText
            r2.measure(r7, r1)
            r5.mLastKnownCurrentPage = r6
            boolean r7 = r5.mUpdatingPositions
            if (r7 != 0) goto L8a
            float r7 = r5.mLastKnownPositionOffset
            r5.updateTextPositions(r6, r7, r0)
        L8a:
            r5.mUpdatingText = r0
            return
    }

    void updateTextPositions(int r18, float r19, boolean r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r0.mLastKnownCurrentPage
            if (r1 == r3) goto L14
            androidx.viewpager.widget.ViewPager r3 = r0.mPager
            androidx.viewpager.widget.PagerAdapter r3 = r3.getAdapter()
            r0.updateText(r1, r3)
            goto L1d
        L14:
            if (r20 != 0) goto L1d
            float r1 = r0.mLastKnownPositionOffset
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L1d
            return
        L1d:
            r1 = 1
            r0.mUpdatingPositions = r1
            android.widget.TextView r1 = r0.mPrevText
            int r1 = r1.getMeasuredWidth()
            android.widget.TextView r3 = r0.mCurrText
            int r3 = r3.getMeasuredWidth()
            android.widget.TextView r4 = r0.mNextText
            int r4 = r4.getMeasuredWidth()
            int r5 = r3 / 2
            int r6 = r17.getWidth()
            int r7 = r17.getHeight()
            int r8 = r17.getPaddingLeft()
            int r9 = r17.getPaddingRight()
            int r10 = r17.getPaddingTop()
            int r11 = r17.getPaddingBottom()
            int r12 = r8 + r5
            int r13 = r9 + r5
            int r12 = r6 - r12
            int r12 = r12 - r13
            r14 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 + r2
            r15 = 1065353216(0x3f800000, float:1.0)
            int r16 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r16 <= 0) goto L5d
            float r14 = r14 - r15
        L5d:
            int r13 = r6 - r13
            float r12 = (float) r12
            float r12 = r12 * r14
            int r12 = (int) r12
            int r13 = r13 - r12
            int r13 = r13 - r5
            int r3 = r3 + r13
            android.widget.TextView r5 = r0.mPrevText
            int r5 = r5.getBaseline()
            android.widget.TextView r12 = r0.mCurrText
            int r12 = r12.getBaseline()
            android.widget.TextView r14 = r0.mNextText
            int r14 = r14.getBaseline()
            int r15 = java.lang.Math.max(r5, r12)
            int r15 = java.lang.Math.max(r15, r14)
            int r5 = r15 - r5
            int r12 = r15 - r12
            int r15 = r15 - r14
            android.widget.TextView r14 = r0.mPrevText
            int r14 = r14.getMeasuredHeight()
            int r14 = r14 + r5
            android.widget.TextView r2 = r0.mCurrText
            int r2 = r2.getMeasuredHeight()
            int r2 = r2 + r12
            r18 = r4
            android.widget.TextView r4 = r0.mNextText
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r2 = java.lang.Math.max(r14, r2)
            int r2 = java.lang.Math.max(r2, r4)
            int r4 = r0.mGravity
            r4 = r4 & 112(0x70, float:1.57E-43)
            r14 = 16
            if (r4 == r14) goto Lb6
            r14 = 80
            if (r4 == r14) goto Lb3
            int r5 = r5 + r10
            int r12 = r12 + r10
            int r10 = r10 + r15
            goto Lbf
        Lb3:
            int r7 = r7 - r11
            int r7 = r7 - r2
            goto Lbb
        Lb6:
            int r7 = r7 - r10
            int r7 = r7 - r11
            int r7 = r7 - r2
            int r7 = r7 / 2
        Lbb:
            int r5 = r5 + r7
            int r12 = r12 + r7
            int r10 = r7 + r15
        Lbf:
            android.widget.TextView r2 = r0.mCurrText
            int r4 = r2.getMeasuredHeight()
            int r4 = r4 + r12
            r2.layout(r13, r12, r3, r4)
            int r2 = r0.mScaledTextSpacing
            int r13 = r13 - r2
            int r13 = r13 - r1
            int r2 = java.lang.Math.min(r8, r13)
            android.widget.TextView r4 = r0.mPrevText
            int r1 = r1 + r2
            int r7 = r4.getMeasuredHeight()
            int r7 = r7 + r5
            r4.layout(r2, r5, r1, r7)
            int r6 = r6 - r9
            int r6 = r6 - r18
            int r1 = r0.mScaledTextSpacing
            int r3 = r3 + r1
            int r1 = java.lang.Math.max(r6, r3)
            android.widget.TextView r2 = r0.mNextText
            int r4 = r1 + r18
            int r3 = r2.getMeasuredHeight()
            int r3 = r3 + r10
            r2.layout(r1, r10, r4, r3)
            r1 = r19
            r0.mLastKnownPositionOffset = r1
            r1 = 0
            r0.mUpdatingPositions = r1
            return
    }
}
