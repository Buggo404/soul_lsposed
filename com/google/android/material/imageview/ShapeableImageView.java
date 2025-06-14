package com.google.android.material.imageview;

/* loaded from: classes.dex */
public class ShapeableImageView extends androidx.appcompat.widget.AppCompatImageView implements com.google.android.material.shape.Shapeable {
    private static final int DEF_STYLE_RES = 0;
    private static final int UNDEFINED_PADDING = Integer.MIN_VALUE;
    private final android.graphics.Paint borderPaint;
    private int bottomContentPadding;
    private final android.graphics.Paint clearPaint;
    private final android.graphics.RectF destination;
    private int endContentPadding;
    private boolean hasAdjustedPaddingAfterLayoutDirectionResolved;
    private int leftContentPadding;
    private android.graphics.Path maskPath;
    private final android.graphics.RectF maskRect;
    private final android.graphics.Path path;
    private final com.google.android.material.shape.ShapeAppearancePathProvider pathProvider;
    private int rightContentPadding;
    private com.google.android.material.shape.MaterialShapeDrawable shadowDrawable;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private int startContentPadding;
    private android.content.res.ColorStateList strokeColor;
    private float strokeWidth;
    private int topContentPadding;

    class OutlineProvider extends android.view.ViewOutlineProvider {
        private final android.graphics.Rect rect;
        final /* synthetic */ com.google.android.material.imageview.ShapeableImageView this$0;

        OutlineProvider(com.google.android.material.imageview.ShapeableImageView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.rect = r1
                return
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View r3, android.graphics.Outline r4) {
                r2 = this;
                com.google.android.material.imageview.ShapeableImageView r3 = r2.this$0
                com.google.android.material.shape.ShapeAppearanceModel r3 = com.google.android.material.imageview.ShapeableImageView.access$000(r3)
                if (r3 != 0) goto L9
                return
            L9:
                com.google.android.material.imageview.ShapeableImageView r3 = r2.this$0
                com.google.android.material.shape.MaterialShapeDrawable r3 = com.google.android.material.imageview.ShapeableImageView.access$100(r3)
                if (r3 != 0) goto L21
                com.google.android.material.imageview.ShapeableImageView r3 = r2.this$0
                com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
                com.google.android.material.imageview.ShapeableImageView r1 = r2.this$0
                com.google.android.material.shape.ShapeAppearanceModel r1 = com.google.android.material.imageview.ShapeableImageView.access$000(r1)
                r0.<init>(r1)
                com.google.android.material.imageview.ShapeableImageView.access$102(r3, r0)
            L21:
                com.google.android.material.imageview.ShapeableImageView r3 = r2.this$0
                android.graphics.RectF r3 = com.google.android.material.imageview.ShapeableImageView.access$200(r3)
                android.graphics.Rect r0 = r2.rect
                r3.round(r0)
                com.google.android.material.imageview.ShapeableImageView r3 = r2.this$0
                com.google.android.material.shape.MaterialShapeDrawable r3 = com.google.android.material.imageview.ShapeableImageView.access$100(r3)
                android.graphics.Rect r0 = r2.rect
                r3.setBounds(r0)
                com.google.android.material.imageview.ShapeableImageView r3 = r2.this$0
                com.google.android.material.shape.MaterialShapeDrawable r3 = com.google.android.material.imageview.ShapeableImageView.access$100(r3)
                r3.getOutline(r4)
                return
        }
    }

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_MaterialComponents_ShapeableImageView
            com.google.android.material.imageview.ShapeableImageView.DEF_STYLE_RES = r0
            return
    }

    public ShapeableImageView(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public ShapeableImageView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ShapeableImageView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
            r6 = this;
            int r0 = com.google.android.material.imageview.ShapeableImageView.DEF_STYLE_RES
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            com.google.android.material.shape.ShapeAppearancePathProvider r7 = com.google.android.material.shape.ShapeAppearancePathProvider.getInstance()
            r6.pathProvider = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.path = r7
            r7 = 0
            r6.hasAdjustedPaddingAfterLayoutDirectionResolved = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.clearPaint = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.destination = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.maskRect = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.maskPath = r2
            int[] r2 = com.google.android.material.C0479R.styleable.ShapeableImageView
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            int r4 = com.google.android.material.C0479R.styleable.ShapeableImageView_strokeColor
            android.content.res.ColorStateList r4 = com.google.android.material.resources.MaterialResources.getColorStateList(r1, r2, r4)
            r6.strokeColor = r4
            int r4 = com.google.android.material.C0479R.styleable.ShapeableImageView_strokeWidth
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.strokeWidth = r4
            int r4 = com.google.android.material.C0479R.styleable.ShapeableImageView_contentPadding
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.leftContentPadding = r7
            r6.topContentPadding = r7
            r6.rightContentPadding = r7
            r6.bottomContentPadding = r7
            int r4 = com.google.android.material.C0479R.styleable.ShapeableImageView_contentPaddingLeft
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.leftContentPadding = r4
            int r4 = com.google.android.material.C0479R.styleable.ShapeableImageView_contentPaddingTop
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.topContentPadding = r4
            int r4 = com.google.android.material.C0479R.styleable.ShapeableImageView_contentPaddingRight
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.rightContentPadding = r4
            int r4 = com.google.android.material.C0479R.styleable.ShapeableImageView_contentPaddingBottom
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.bottomContentPadding = r7
            int r7 = com.google.android.material.C0479R.styleable.ShapeableImageView_contentPaddingStart
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.startContentPadding = r7
            int r7 = com.google.android.material.C0479R.styleable.ShapeableImageView_contentPaddingEnd
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.endContentPadding = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.borderPaint = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r7 = com.google.android.material.shape.ShapeAppearanceModel.builder(r1, r8, r9, r0)
            com.google.android.material.shape.ShapeAppearanceModel r7 = r7.build()
            r6.shapeAppearanceModel = r7
            com.google.android.material.imageview.ShapeableImageView$OutlineProvider r7 = new com.google.android.material.imageview.ShapeableImageView$OutlineProvider
            r7.<init>(r6)
            r6.setOutlineProvider(r7)
            return
    }

    static /* synthetic */ com.google.android.material.shape.ShapeAppearanceModel access$000(com.google.android.material.imageview.ShapeableImageView r0) {
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.shapeAppearanceModel
            return r0
    }

    static /* synthetic */ com.google.android.material.shape.MaterialShapeDrawable access$100(com.google.android.material.imageview.ShapeableImageView r0) {
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.shadowDrawable
            return r0
    }

    static /* synthetic */ com.google.android.material.shape.MaterialShapeDrawable access$102(com.google.android.material.imageview.ShapeableImageView r0, com.google.android.material.shape.MaterialShapeDrawable r1) {
            r0.shadowDrawable = r1
            return r1
    }

    static /* synthetic */ android.graphics.RectF access$200(com.google.android.material.imageview.ShapeableImageView r0) {
            android.graphics.RectF r0 = r0.destination
            return r0
    }

    private void drawStroke(android.graphics.Canvas r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.strokeColor
            if (r0 != 0) goto L5
            return
        L5:
            android.graphics.Paint r0 = r3.borderPaint
            float r1 = r3.strokeWidth
            r0.setStrokeWidth(r1)
            android.content.res.ColorStateList r0 = r3.strokeColor
            int[] r1 = r3.getDrawableState()
            android.content.res.ColorStateList r2 = r3.strokeColor
            int r2 = r2.getDefaultColor()
            int r0 = r0.getColorForState(r1, r2)
            float r1 = r3.strokeWidth
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L31
            if (r0 == 0) goto L31
            android.graphics.Paint r1 = r3.borderPaint
            r1.setColor(r0)
            android.graphics.Path r0 = r3.path
            android.graphics.Paint r1 = r3.borderPaint
            r4.drawPath(r0, r1)
        L31:
            return
    }

    private boolean isContentPaddingRelative() {
            r2 = this;
            int r0 = r2.startContentPadding
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto Ld
            int r0 = r2.endContentPadding
            if (r0 == r1) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    private boolean isRtl() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    private void updateShapeMask(int r6, int r7) {
            r5 = this;
            android.graphics.RectF r0 = r5.destination
            int r1 = r5.getPaddingLeft()
            float r1 = (float) r1
            int r2 = r5.getPaddingTop()
            float r2 = (float) r2
            int r3 = r5.getPaddingRight()
            int r3 = r6 - r3
            float r3 = (float) r3
            int r4 = r5.getPaddingBottom()
            int r4 = r7 - r4
            float r4 = (float) r4
            r0.set(r1, r2, r3, r4)
            com.google.android.material.shape.ShapeAppearancePathProvider r0 = r5.pathProvider
            com.google.android.material.shape.ShapeAppearanceModel r1 = r5.shapeAppearanceModel
            android.graphics.RectF r2 = r5.destination
            android.graphics.Path r3 = r5.path
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.calculatePath(r1, r4, r2, r3)
            android.graphics.Path r0 = r5.maskPath
            r0.rewind()
            android.graphics.Path r0 = r5.maskPath
            android.graphics.Path r1 = r5.path
            r0.addPath(r1)
            android.graphics.RectF r0 = r5.maskRect
            float r6 = (float) r6
            float r7 = (float) r7
            r1 = 0
            r0.set(r1, r1, r6, r7)
            android.graphics.Path r6 = r5.maskPath
            android.graphics.RectF r7 = r5.maskRect
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CCW
            r6.addRect(r7, r0)
            return
    }

    public int getContentPaddingBottom() {
            r1 = this;
            int r0 = r1.bottomContentPadding
            return r0
    }

    public final int getContentPaddingEnd() {
            r2 = this;
            int r0 = r2.endContentPadding
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            boolean r0 = r2.isRtl()
            if (r0 == 0) goto L10
            int r0 = r2.leftContentPadding
            goto L12
        L10:
            int r0 = r2.rightContentPadding
        L12:
            return r0
    }

    public int getContentPaddingLeft() {
            r2 = this;
            boolean r0 = r2.isContentPaddingRelative()
            if (r0 == 0) goto L1e
            boolean r0 = r2.isRtl()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L13
            int r0 = r2.endContentPadding
            if (r0 == r1) goto L13
            return r0
        L13:
            boolean r0 = r2.isRtl()
            if (r0 != 0) goto L1e
            int r0 = r2.startContentPadding
            if (r0 == r1) goto L1e
            return r0
        L1e:
            int r0 = r2.leftContentPadding
            return r0
    }

    public int getContentPaddingRight() {
            r2 = this;
            boolean r0 = r2.isContentPaddingRelative()
            if (r0 == 0) goto L1e
            boolean r0 = r2.isRtl()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L13
            int r0 = r2.startContentPadding
            if (r0 == r1) goto L13
            return r0
        L13:
            boolean r0 = r2.isRtl()
            if (r0 != 0) goto L1e
            int r0 = r2.endContentPadding
            if (r0 == r1) goto L1e
            return r0
        L1e:
            int r0 = r2.rightContentPadding
            return r0
    }

    public final int getContentPaddingStart() {
            r2 = this;
            int r0 = r2.startContentPadding
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            boolean r0 = r2.isRtl()
            if (r0 == 0) goto L10
            int r0 = r2.rightContentPadding
            goto L12
        L10:
            int r0 = r2.leftContentPadding
        L12:
            return r0
    }

    public int getContentPaddingTop() {
            r1 = this;
            int r0 = r1.topContentPadding
            return r0
    }

    @Override // android.view.View
    public int getPaddingBottom() {
            r2 = this;
            int r0 = super.getPaddingBottom()
            int r1 = r2.getContentPaddingBottom()
            int r0 = r0 - r1
            return r0
    }

    @Override // android.view.View
    public int getPaddingEnd() {
            r2 = this;
            int r0 = super.getPaddingEnd()
            int r1 = r2.getContentPaddingEnd()
            int r0 = r0 - r1
            return r0
    }

    @Override // android.view.View
    public int getPaddingLeft() {
            r2 = this;
            int r0 = super.getPaddingLeft()
            int r1 = r2.getContentPaddingLeft()
            int r0 = r0 - r1
            return r0
    }

    @Override // android.view.View
    public int getPaddingRight() {
            r2 = this;
            int r0 = super.getPaddingRight()
            int r1 = r2.getContentPaddingRight()
            int r0 = r0 - r1
            return r0
    }

    @Override // android.view.View
    public int getPaddingStart() {
            r2 = this;
            int r0 = super.getPaddingStart()
            int r1 = r2.getContentPaddingStart()
            int r0 = r0 - r1
            return r0
    }

    @Override // android.view.View
    public int getPaddingTop() {
            r2 = this;
            int r0 = super.getPaddingTop()
            int r1 = r2.getContentPaddingTop()
            int r0 = r0 - r1
            return r0
    }

    @Override // com.google.android.material.shape.Shapeable
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.shapeAppearanceModel
            return r0
    }

    public android.content.res.ColorStateList getStrokeColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.strokeColor
            return r0
    }

    public float getStrokeWidth() {
            r1 = this;
            float r0 = r1.strokeWidth
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            r0 = 2
            r1 = 0
            r2.setLayerType(r0, r1)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.setLayerType(r0, r1)
            super.onDetachedFromWindow()
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas r3) {
            r2 = this;
            super.onDraw(r3)
            android.graphics.Path r0 = r2.maskPath
            android.graphics.Paint r1 = r2.clearPaint
            r3.drawPath(r0, r1)
            r2.drawStroke(r3)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            boolean r3 = r2.hasAdjustedPaddingAfterLayoutDirectionResolved
            if (r3 == 0) goto L8
            return
        L8:
            boolean r3 = r2.isLayoutDirectionResolved()
            if (r3 != 0) goto Lf
            return
        Lf:
            r3 = 1
            r2.hasAdjustedPaddingAfterLayoutDirectionResolved = r3
            boolean r3 = r2.isPaddingRelative()
            if (r3 != 0) goto L33
            boolean r3 = r2.isContentPaddingRelative()
            if (r3 == 0) goto L1f
            goto L33
        L1f:
            int r3 = super.getPaddingLeft()
            int r4 = super.getPaddingTop()
            int r0 = super.getPaddingRight()
            int r1 = super.getPaddingBottom()
            r2.setPadding(r3, r4, r0, r1)
            return
        L33:
            int r3 = super.getPaddingStart()
            int r4 = super.getPaddingTop()
            int r0 = super.getPaddingEnd()
            int r1 = super.getPaddingBottom()
            r2.setPaddingRelative(r3, r4, r0, r1)
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r0.updateShapeMask(r1, r2)
            return
    }

    public void setContentPadding(int r6, int r7, int r8, int r9) {
            r5 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5.startContentPadding = r0
            r5.endContentPadding = r0
            int r0 = super.getPaddingLeft()
            int r1 = r5.leftContentPadding
            int r0 = r0 - r1
            int r0 = r0 + r6
            int r1 = super.getPaddingTop()
            int r2 = r5.topContentPadding
            int r1 = r1 - r2
            int r1 = r1 + r7
            int r2 = super.getPaddingRight()
            int r3 = r5.rightContentPadding
            int r2 = r2 - r3
            int r2 = r2 + r8
            int r3 = super.getPaddingBottom()
            int r4 = r5.bottomContentPadding
            int r3 = r3 - r4
            int r3 = r3 + r9
            super.setPadding(r0, r1, r2, r3)
            r5.leftContentPadding = r6
            r5.topContentPadding = r7
            r5.rightContentPadding = r8
            r5.bottomContentPadding = r9
            return
    }

    public void setContentPaddingRelative(int r6, int r7, int r8, int r9) {
            r5 = this;
            int r0 = super.getPaddingStart()
            int r1 = r5.getContentPaddingStart()
            int r0 = r0 - r1
            int r0 = r0 + r6
            int r1 = super.getPaddingTop()
            int r2 = r5.topContentPadding
            int r1 = r1 - r2
            int r1 = r1 + r7
            int r2 = super.getPaddingEnd()
            int r3 = r5.getContentPaddingEnd()
            int r2 = r2 - r3
            int r2 = r2 + r8
            int r3 = super.getPaddingBottom()
            int r4 = r5.bottomContentPadding
            int r3 = r3 - r4
            int r3 = r3 + r9
            super.setPaddingRelative(r0, r1, r2, r3)
            boolean r0 = r5.isRtl()
            if (r0 == 0) goto L2f
            r0 = r8
            goto L30
        L2f:
            r0 = r6
        L30:
            r5.leftContentPadding = r0
            r5.topContentPadding = r7
            boolean r7 = r5.isRtl()
            if (r7 == 0) goto L3b
            goto L3c
        L3b:
            r6 = r8
        L3c:
            r5.rightContentPadding = r6
            r5.bottomContentPadding = r9
            return
    }

    @Override // android.view.View
    public void setPadding(int r2, int r3, int r4, int r5) {
            r1 = this;
            int r0 = r1.getContentPaddingLeft()
            int r2 = r2 + r0
            int r0 = r1.getContentPaddingTop()
            int r3 = r3 + r0
            int r0 = r1.getContentPaddingRight()
            int r4 = r4 + r0
            int r0 = r1.getContentPaddingBottom()
            int r5 = r5 + r0
            super.setPadding(r2, r3, r4, r5)
            return
    }

    @Override // android.view.View
    public void setPaddingRelative(int r2, int r3, int r4, int r5) {
            r1 = this;
            int r0 = r1.getContentPaddingStart()
            int r2 = r2 + r0
            int r0 = r1.getContentPaddingTop()
            int r3 = r3 + r0
            int r0 = r1.getContentPaddingEnd()
            int r4 = r4 + r0
            int r0 = r1.getContentPaddingBottom()
            int r5 = r5 + r0
            super.setPaddingRelative(r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            r1.shapeAppearanceModel = r2
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.shadowDrawable
            if (r0 == 0) goto L9
            r0.setShapeAppearanceModel(r2)
        L9:
            int r2 = r1.getWidth()
            int r0 = r1.getHeight()
            r1.updateShapeMask(r2, r0)
            r1.invalidate()
            r1.invalidateOutline()
            return
    }

    public void setStrokeColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.strokeColor = r1
            r0.invalidate()
            return
    }

    public void setStrokeColorResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setStrokeColor(r2)
            return
    }

    public void setStrokeWidth(float r2) {
            r1 = this;
            float r0 = r1.strokeWidth
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.strokeWidth = r2
            r1.invalidate()
        Lb:
            return
    }

    public void setStrokeWidthResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            float r2 = (float) r2
            r1.setStrokeWidth(r2)
            return
    }
}
