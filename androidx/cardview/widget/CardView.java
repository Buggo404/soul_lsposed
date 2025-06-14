package androidx.cardview.widget;

/* loaded from: classes.dex */
public class CardView extends android.widget.FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = null;
    private static final androidx.cardview.widget.CardViewImpl IMPL = null;
    private final androidx.cardview.widget.CardViewDelegate mCardViewDelegate;
    private boolean mCompatPadding;
    final android.graphics.Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final android.graphics.Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;


    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r0[r1] = r2
            androidx.cardview.widget.CardView.COLOR_BACKGROUND_ATTR = r0
            androidx.cardview.widget.CardViewApi21Impl r0 = new androidx.cardview.widget.CardViewApi21Impl
            r0.<init>()
            androidx.cardview.widget.CardView.IMPL = r0
            r0.initStatic()
            return
    }

    public CardView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CardView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.cardview.C0109R.attr.cardViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public CardView(android.content.Context r10, android.util.AttributeSet r11, int r12) {
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.mContentPadding = r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r9.mShadowBounds = r1
            androidx.cardview.widget.CardView$1 r3 = new androidx.cardview.widget.CardView$1
            r3.<init>(r9)
            r9.mCardViewDelegate = r3
            int[] r1 = androidx.cardview.C0109R.styleable.CardView
            int r2 = androidx.cardview.C0109R.style.CardView
            android.content.res.TypedArray r11 = r10.obtainStyledAttributes(r11, r1, r12, r2)
            int r12 = androidx.cardview.C0109R.styleable.CardView_cardBackgroundColor
            boolean r12 = r11.hasValue(r12)
            r1 = 0
            if (r12 == 0) goto L31
            int r12 = androidx.cardview.C0109R.styleable.CardView_cardBackgroundColor
            android.content.res.ColorStateList r12 = r11.getColorStateList(r12)
        L2f:
            r5 = r12
            goto L6b
        L31:
            android.content.Context r12 = r9.getContext()
            int[] r2 = androidx.cardview.widget.CardView.COLOR_BACKGROUND_ATTR
            android.content.res.TypedArray r12 = r12.obtainStyledAttributes(r2)
            int r2 = r12.getColor(r1, r1)
            r12.recycle()
            r12 = 3
            float[] r12 = new float[r12]
            android.graphics.Color.colorToHSV(r2, r12)
            r2 = 2
            r12 = r12[r2]
            r2 = 1056964608(0x3f000000, float:0.5)
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 <= 0) goto L5c
            android.content.res.Resources r12 = r9.getResources()
            int r2 = androidx.cardview.C0109R.color.cardview_light_background
            int r12 = r12.getColor(r2)
            goto L66
        L5c:
            android.content.res.Resources r12 = r9.getResources()
            int r2 = androidx.cardview.C0109R.color.cardview_dark_background
            int r12 = r12.getColor(r2)
        L66:
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            goto L2f
        L6b:
            int r12 = androidx.cardview.C0109R.styleable.CardView_cardCornerRadius
            r2 = 0
            float r6 = r11.getDimension(r12, r2)
            int r12 = androidx.cardview.C0109R.styleable.CardView_cardElevation
            float r7 = r11.getDimension(r12, r2)
            int r12 = androidx.cardview.C0109R.styleable.CardView_cardMaxElevation
            float r12 = r11.getDimension(r12, r2)
            int r2 = androidx.cardview.C0109R.styleable.CardView_cardUseCompatPadding
            boolean r2 = r11.getBoolean(r2, r1)
            r9.mCompatPadding = r2
            int r2 = androidx.cardview.C0109R.styleable.CardView_cardPreventCornerOverlap
            r4 = 1
            boolean r2 = r11.getBoolean(r2, r4)
            r9.mPreventCornerOverlap = r2
            int r2 = androidx.cardview.C0109R.styleable.CardView_contentPadding
            int r2 = r11.getDimensionPixelSize(r2, r1)
            int r4 = androidx.cardview.C0109R.styleable.CardView_contentPaddingLeft
            int r4 = r11.getDimensionPixelSize(r4, r2)
            r0.left = r4
            int r4 = androidx.cardview.C0109R.styleable.CardView_contentPaddingTop
            int r4 = r11.getDimensionPixelSize(r4, r2)
            r0.top = r4
            int r4 = androidx.cardview.C0109R.styleable.CardView_contentPaddingRight
            int r4 = r11.getDimensionPixelSize(r4, r2)
            r0.right = r4
            int r4 = androidx.cardview.C0109R.styleable.CardView_contentPaddingBottom
            int r2 = r11.getDimensionPixelSize(r4, r2)
            r0.bottom = r2
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 <= 0) goto Lbb
            r8 = r7
            goto Lbc
        Lbb:
            r8 = r12
        Lbc:
            int r12 = androidx.cardview.C0109R.styleable.CardView_android_minWidth
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r9.mUserSetMinWidth = r12
            int r12 = androidx.cardview.C0109R.styleable.CardView_android_minHeight
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r9.mUserSetMinHeight = r12
            r11.recycle()
            androidx.cardview.widget.CardViewImpl r2 = androidx.cardview.widget.CardView.IMPL
            r4 = r10
            r2.initialize(r3, r4, r5, r6, r7, r8)
            return
    }

    static /* synthetic */ void access$001(androidx.cardview.widget.CardView r0, int r1, int r2, int r3, int r4) {
            super.setPadding(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void access$101(androidx.cardview.widget.CardView r0, int r1) {
            super.setMinimumWidth(r1)
            return
    }

    static /* synthetic */ void access$201(androidx.cardview.widget.CardView r0, int r1) {
            super.setMinimumHeight(r1)
            return
    }

    public android.content.res.ColorStateList getCardBackgroundColor() {
            r2 = this;
            androidx.cardview.widget.CardViewImpl r0 = androidx.cardview.widget.CardView.IMPL
            androidx.cardview.widget.CardViewDelegate r1 = r2.mCardViewDelegate
            android.content.res.ColorStateList r0 = r0.getBackgroundColor(r1)
            return r0
    }

    public float getCardElevation() {
            r2 = this;
            androidx.cardview.widget.CardViewImpl r0 = androidx.cardview.widget.CardView.IMPL
            androidx.cardview.widget.CardViewDelegate r1 = r2.mCardViewDelegate
            float r0 = r0.getElevation(r1)
            return r0
    }

    public int getContentPaddingBottom() {
            r1 = this;
            android.graphics.Rect r0 = r1.mContentPadding
            int r0 = r0.bottom
            return r0
    }

    public int getContentPaddingLeft() {
            r1 = this;
            android.graphics.Rect r0 = r1.mContentPadding
            int r0 = r0.left
            return r0
    }

    public int getContentPaddingRight() {
            r1 = this;
            android.graphics.Rect r0 = r1.mContentPadding
            int r0 = r0.right
            return r0
    }

    public int getContentPaddingTop() {
            r1 = this;
            android.graphics.Rect r0 = r1.mContentPadding
            int r0 = r0.top
            return r0
    }

    public float getMaxCardElevation() {
            r2 = this;
            androidx.cardview.widget.CardViewImpl r0 = androidx.cardview.widget.CardView.IMPL
            androidx.cardview.widget.CardViewDelegate r1 = r2.mCardViewDelegate
            float r0 = r0.getMaxElevation(r1)
            return r0
    }

    public boolean getPreventCornerOverlap() {
            r1 = this;
            boolean r0 = r1.mPreventCornerOverlap
            return r0
    }

    public float getRadius() {
            r2 = this;
            androidx.cardview.widget.CardViewImpl r0 = androidx.cardview.widget.CardView.IMPL
            androidx.cardview.widget.CardViewDelegate r1 = r2.mCardViewDelegate
            float r0 = r0.getRadius(r1)
            return r0
    }

    public boolean getUseCompatPadding() {
            r1 = this;
            boolean r0 = r1.mCompatPadding
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r7, int r8) {
            r6 = this;
            androidx.cardview.widget.CardViewImpl r0 = androidx.cardview.widget.CardView.IMPL
            boolean r1 = r0 instanceof androidx.cardview.widget.CardViewApi21Impl
            if (r1 != 0) goto L50
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r3) goto L13
            if (r1 == r2) goto L13
            goto L2b
        L13:
            androidx.cardview.widget.CardViewDelegate r4 = r6.mCardViewDelegate
            float r4 = r0.getMinWidth(r4)
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r7 = java.lang.Math.max(r4, r7)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
        L2b:
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            if (r1 == r3) goto L34
            if (r1 == r2) goto L34
            goto L4c
        L34:
            androidx.cardview.widget.CardViewDelegate r2 = r6.mCardViewDelegate
            float r0 = r0.getMinHeight(r2)
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r8 = java.lang.Math.max(r0, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
        L4c:
            super.onMeasure(r7, r8)
            goto L53
        L50:
            super.onMeasure(r7, r8)
        L53:
            return
    }

    public void setCardBackgroundColor(int r3) {
            r2 = this;
            androidx.cardview.widget.CardViewImpl r0 = androidx.cardview.widget.CardView.IMPL
            androidx.cardview.widget.CardViewDelegate r1 = r2.mCardViewDelegate
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r0.setBackgroundColor(r1, r3)
            return
    }

    public void setCardBackgroundColor(android.content.res.ColorStateList r3) {
            r2 = this;
            androidx.cardview.widget.CardViewImpl r0 = androidx.cardview.widget.CardView.IMPL
            androidx.cardview.widget.CardViewDelegate r1 = r2.mCardViewDelegate
            r0.setBackgroundColor(r1, r3)
            return
    }

    public void setCardElevation(float r3) {
            r2 = this;
            androidx.cardview.widget.CardViewImpl r0 = androidx.cardview.widget.CardView.IMPL
            androidx.cardview.widget.CardViewDelegate r1 = r2.mCardViewDelegate
            r0.setElevation(r1, r3)
            return
    }

    public void setContentPadding(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.mContentPadding
            r0.set(r2, r3, r4, r5)
            androidx.cardview.widget.CardViewImpl r2 = androidx.cardview.widget.CardView.IMPL
            androidx.cardview.widget.CardViewDelegate r3 = r1.mCardViewDelegate
            r2.updatePadding(r3)
            return
    }

    public void setMaxCardElevation(float r3) {
            r2 = this;
            androidx.cardview.widget.CardViewImpl r0 = androidx.cardview.widget.CardView.IMPL
            androidx.cardview.widget.CardViewDelegate r1 = r2.mCardViewDelegate
            r0.setMaxElevation(r1, r3)
            return
    }

    @Override // android.view.View
    public void setMinimumHeight(int r1) {
            r0 = this;
            r0.mUserSetMinHeight = r1
            super.setMinimumHeight(r1)
            return
    }

    @Override // android.view.View
    public void setMinimumWidth(int r1) {
            r0 = this;
            r0.mUserSetMinWidth = r1
            super.setMinimumWidth(r1)
            return
    }

    @Override // android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void setPaddingRelative(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public void setPreventCornerOverlap(boolean r2) {
            r1 = this;
            boolean r0 = r1.mPreventCornerOverlap
            if (r2 == r0) goto Ld
            r1.mPreventCornerOverlap = r2
            androidx.cardview.widget.CardViewImpl r2 = androidx.cardview.widget.CardView.IMPL
            androidx.cardview.widget.CardViewDelegate r0 = r1.mCardViewDelegate
            r2.onPreventCornerOverlapChanged(r0)
        Ld:
            return
    }

    public void setRadius(float r3) {
            r2 = this;
            androidx.cardview.widget.CardViewImpl r0 = androidx.cardview.widget.CardView.IMPL
            androidx.cardview.widget.CardViewDelegate r1 = r2.mCardViewDelegate
            r0.setRadius(r1, r3)
            return
    }

    public void setUseCompatPadding(boolean r2) {
            r1 = this;
            boolean r0 = r1.mCompatPadding
            if (r0 == r2) goto Ld
            r1.mCompatPadding = r2
            androidx.cardview.widget.CardViewImpl r2 = androidx.cardview.widget.CardView.IMPL
            androidx.cardview.widget.CardViewDelegate r0 = r1.mCardViewDelegate
            r2.onCompatPaddingChanged(r0)
        Ld:
            return
    }
}
