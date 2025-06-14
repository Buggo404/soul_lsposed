package com.google.android.material.shape;

/* loaded from: classes.dex */
public class MaterialShapeDrawable extends android.graphics.drawable.Drawable implements androidx.core.graphics.drawable.TintAwareDrawable, com.google.android.material.shape.Shapeable {
    public static final int SHADOW_COMPAT_MODE_ALWAYS = 2;
    public static final int SHADOW_COMPAT_MODE_DEFAULT = 0;
    public static final int SHADOW_COMPAT_MODE_NEVER = 1;
    private static final float SHADOW_OFFSET_MULTIPLIER = 0.25f;
    private static final float SHADOW_RADIUS_MULTIPLIER = 0.75f;
    private static final java.lang.String TAG = "MaterialShapeDrawable";
    private static final android.graphics.Paint clearPaint = null;
    private final java.util.BitSet containsIncompatibleShadowOp;
    private final com.google.android.material.shape.ShapePath.ShadowCompatOperation[] cornerShadowOperation;
    private com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState drawableState;
    private final com.google.android.material.shape.ShapePath.ShadowCompatOperation[] edgeShadowOperation;
    private final android.graphics.Paint fillPaint;
    private final android.graphics.RectF insetRectF;
    private final android.graphics.Matrix matrix;
    private final android.graphics.Path path;
    private final android.graphics.RectF pathBounds;
    private boolean pathDirty;
    private final android.graphics.Path pathInsetByStroke;
    private final com.google.android.material.shape.ShapeAppearancePathProvider pathProvider;
    private final com.google.android.material.shape.ShapeAppearancePathProvider.PathListener pathShadowListener;
    private final android.graphics.RectF rectF;
    private final android.graphics.Region scratchRegion;
    private boolean shadowBitmapDrawingEnable;
    private final com.google.android.material.shadow.ShadowRenderer shadowRenderer;
    private final android.graphics.Paint strokePaint;
    private com.google.android.material.shape.ShapeAppearanceModel strokeShapeAppearance;
    private android.graphics.PorterDuffColorFilter strokeTintFilter;
    private android.graphics.PorterDuffColorFilter tintFilter;
    private final android.graphics.Region transparentRegion;



    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    static final class MaterialShapeDrawableState extends android.graphics.drawable.Drawable.ConstantState {
        public int alpha;
        public android.graphics.ColorFilter colorFilter;
        public float elevation;
        public com.google.android.material.elevation.ElevationOverlayProvider elevationOverlayProvider;
        public android.content.res.ColorStateList fillColor;
        public float interpolation;
        public android.graphics.Rect padding;
        public android.graphics.Paint.Style paintStyle;
        public float parentAbsoluteElevation;
        public float scale;
        public int shadowCompatMode;
        public int shadowCompatOffset;
        public int shadowCompatRadius;
        public int shadowCompatRotation;
        public com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
        public android.content.res.ColorStateList strokeColor;
        public android.content.res.ColorStateList strokeTintList;
        public float strokeWidth;
        public android.content.res.ColorStateList tintList;
        public android.graphics.PorterDuff.Mode tintMode;
        public float translationZ;
        public boolean useTintColorForShadow;

        public MaterialShapeDrawableState(com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.fillColor = r0
                r2.strokeColor = r0
                r2.strokeTintList = r0
                r2.tintList = r0
                android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
                r2.tintMode = r1
                r2.padding = r0
                r0 = 1065353216(0x3f800000, float:1.0)
                r2.scale = r0
                r2.interpolation = r0
                r0 = 255(0xff, float:3.57E-43)
                r2.alpha = r0
                r0 = 0
                r2.parentAbsoluteElevation = r0
                r2.elevation = r0
                r2.translationZ = r0
                r0 = 0
                r2.shadowCompatMode = r0
                r2.shadowCompatRadius = r0
                r2.shadowCompatOffset = r0
                r2.shadowCompatRotation = r0
                r2.useTintColorForShadow = r0
                android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
                r2.paintStyle = r0
                com.google.android.material.shape.ShapeAppearanceModel r0 = r3.shapeAppearanceModel
                r2.shapeAppearanceModel = r0
                com.google.android.material.elevation.ElevationOverlayProvider r0 = r3.elevationOverlayProvider
                r2.elevationOverlayProvider = r0
                float r0 = r3.strokeWidth
                r2.strokeWidth = r0
                android.graphics.ColorFilter r0 = r3.colorFilter
                r2.colorFilter = r0
                android.content.res.ColorStateList r0 = r3.fillColor
                r2.fillColor = r0
                android.content.res.ColorStateList r0 = r3.strokeColor
                r2.strokeColor = r0
                android.graphics.PorterDuff$Mode r0 = r3.tintMode
                r2.tintMode = r0
                android.content.res.ColorStateList r0 = r3.tintList
                r2.tintList = r0
                int r0 = r3.alpha
                r2.alpha = r0
                float r0 = r3.scale
                r2.scale = r0
                int r0 = r3.shadowCompatOffset
                r2.shadowCompatOffset = r0
                int r0 = r3.shadowCompatMode
                r2.shadowCompatMode = r0
                boolean r0 = r3.useTintColorForShadow
                r2.useTintColorForShadow = r0
                float r0 = r3.interpolation
                r2.interpolation = r0
                float r0 = r3.parentAbsoluteElevation
                r2.parentAbsoluteElevation = r0
                float r0 = r3.elevation
                r2.elevation = r0
                float r0 = r3.translationZ
                r2.translationZ = r0
                int r0 = r3.shadowCompatRadius
                r2.shadowCompatRadius = r0
                int r0 = r3.shadowCompatRotation
                r2.shadowCompatRotation = r0
                android.content.res.ColorStateList r0 = r3.strokeTintList
                r2.strokeTintList = r0
                android.graphics.Paint$Style r0 = r3.paintStyle
                r2.paintStyle = r0
                android.graphics.Rect r0 = r3.padding
                if (r0 == 0) goto L93
                android.graphics.Rect r0 = new android.graphics.Rect
                android.graphics.Rect r3 = r3.padding
                r0.<init>(r3)
                r2.padding = r0
            L93:
                return
        }

        public MaterialShapeDrawableState(com.google.android.material.shape.ShapeAppearanceModel r3, com.google.android.material.elevation.ElevationOverlayProvider r4) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.fillColor = r0
                r2.strokeColor = r0
                r2.strokeTintList = r0
                r2.tintList = r0
                android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
                r2.tintMode = r1
                r2.padding = r0
                r0 = 1065353216(0x3f800000, float:1.0)
                r2.scale = r0
                r2.interpolation = r0
                r0 = 255(0xff, float:3.57E-43)
                r2.alpha = r0
                r0 = 0
                r2.parentAbsoluteElevation = r0
                r2.elevation = r0
                r2.translationZ = r0
                r0 = 0
                r2.shadowCompatMode = r0
                r2.shadowCompatRadius = r0
                r2.shadowCompatOffset = r0
                r2.shadowCompatRotation = r0
                r2.useTintColorForShadow = r0
                android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
                r2.paintStyle = r0
                r2.shapeAppearanceModel = r3
                r2.elevationOverlayProvider = r4
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
                r1 = 0
                r0.<init>(r2, r1)
                r1 = 1
                com.google.android.material.shape.MaterialShapeDrawable.access$402(r0, r1)
                return r0
        }
    }

    static {
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            com.google.android.material.shape.MaterialShapeDrawable.clearPaint = r0
            return
    }

    public MaterialShapeDrawable() {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = new com.google.android.material.shape.ShapeAppearanceModel
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public MaterialShapeDrawable(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = com.google.android.material.shape.ShapeAppearanceModel.builder(r1, r2, r3, r4)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r1.build()
            r0.<init>(r1)
            return
    }

    private MaterialShapeDrawable(com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState r6) {
            r5 = this;
            r5.<init>()
            r0 = 4
            com.google.android.material.shape.ShapePath$ShadowCompatOperation[] r1 = new com.google.android.material.shape.ShapePath.ShadowCompatOperation[r0]
            r5.cornerShadowOperation = r1
            com.google.android.material.shape.ShapePath$ShadowCompatOperation[] r0 = new com.google.android.material.shape.ShapePath.ShadowCompatOperation[r0]
            r5.edgeShadowOperation = r0
            java.util.BitSet r0 = new java.util.BitSet
            r1 = 8
            r0.<init>(r1)
            r5.containsIncompatibleShadowOp = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r5.matrix = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r5.path = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r5.pathInsetByStroke = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.rectF = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.insetRectF = r0
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>()
            r5.transparentRegion = r0
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>()
            r5.scratchRegion = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r5.fillPaint = r0
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r1)
            r5.strokePaint = r2
            com.google.android.material.shadow.ShadowRenderer r3 = new com.google.android.material.shadow.ShadowRenderer
            r3.<init>()
            r5.shadowRenderer = r3
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            java.lang.Thread r3 = r3.getThread()
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r3 != r4) goto L6f
            com.google.android.material.shape.ShapeAppearancePathProvider r3 = com.google.android.material.shape.ShapeAppearancePathProvider.getInstance()
            goto L74
        L6f:
            com.google.android.material.shape.ShapeAppearancePathProvider r3 = new com.google.android.material.shape.ShapeAppearancePathProvider
            r3.<init>()
        L74:
            r5.pathProvider = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r5.pathBounds = r3
            r5.shadowBitmapDrawingEnable = r1
            r5.drawableState = r6
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r6)
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL
            r0.setStyle(r6)
            android.graphics.Paint r6 = com.google.android.material.shape.MaterialShapeDrawable.clearPaint
            r0 = -1
            r6.setColor(r0)
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.DST_OUT
            r0.<init>(r1)
            r6.setXfermode(r0)
            r5.updateTintFilter()
            int[] r6 = r5.getState()
            r5.updateColorsForState(r6)
            com.google.android.material.shape.MaterialShapeDrawable$1 r6 = new com.google.android.material.shape.MaterialShapeDrawable$1
            r6.<init>(r5)
            r5.pathShadowListener = r6
            return
    }

    /* synthetic */ MaterialShapeDrawable(com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState r1, com.google.android.material.shape.MaterialShapeDrawable.C06191 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public MaterialShapeDrawable(com.google.android.material.shape.ShapeAppearanceModel r3) {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = new com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState
            r1 = 0
            r0.<init>(r3, r1)
            r2.<init>(r0)
            return
    }

    @java.lang.Deprecated
    public MaterialShapeDrawable(com.google.android.material.shape.ShapePathModel r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ java.util.BitSet access$000(com.google.android.material.shape.MaterialShapeDrawable r0) {
            java.util.BitSet r0 = r0.containsIncompatibleShadowOp
            return r0
    }

    static /* synthetic */ com.google.android.material.shape.ShapePath.ShadowCompatOperation[] access$100(com.google.android.material.shape.MaterialShapeDrawable r0) {
            com.google.android.material.shape.ShapePath$ShadowCompatOperation[] r0 = r0.cornerShadowOperation
            return r0
    }

    static /* synthetic */ com.google.android.material.shape.ShapePath.ShadowCompatOperation[] access$200(com.google.android.material.shape.MaterialShapeDrawable r0) {
            com.google.android.material.shape.ShapePath$ShadowCompatOperation[] r0 = r0.edgeShadowOperation
            return r0
    }

    static /* synthetic */ boolean access$402(com.google.android.material.shape.MaterialShapeDrawable r0, boolean r1) {
            r0.pathDirty = r1
            return r1
    }

    private android.graphics.PorterDuffColorFilter calculatePaintColorTintFilter(android.graphics.Paint r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto L14
            int r2 = r2.getColor()
            int r3 = r1.compositeElevationOverlayIfNeeded(r2)
            if (r3 == r2) goto L14
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r0)
            return r2
        L14:
            r2 = 0
            return r2
    }

    private void calculatePath(android.graphics.RectF r6, android.graphics.Path r7) {
            r5 = this;
            r5.calculatePathForSize(r6, r7)
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r5.drawableState
            float r0 = r0.scale
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L30
            android.graphics.Matrix r0 = r5.matrix
            r0.reset()
            android.graphics.Matrix r0 = r5.matrix
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r1 = r5.drawableState
            float r1 = r1.scale
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r2 = r5.drawableState
            float r2 = r2.scale
            float r3 = r6.width()
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r6 = r6.height()
            float r6 = r6 / r4
            r0.setScale(r1, r2, r3, r6)
            android.graphics.Matrix r6 = r5.matrix
            r7.transform(r6)
        L30:
            android.graphics.RectF r6 = r5.pathBounds
            r0 = 1
            r7.computeBounds(r6, r0)
            return
    }

    private void calculateStrokePath() {
            r5 = this;
            float r0 = r5.getStrokeInsetLength()
            float r0 = -r0
            com.google.android.material.shape.ShapeAppearanceModel r1 = r5.getShapeAppearanceModel()
            com.google.android.material.shape.MaterialShapeDrawable$2 r2 = new com.google.android.material.shape.MaterialShapeDrawable$2
            r2.<init>(r5, r0)
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.withTransformedCornerSizes(r2)
            r5.strokeShapeAppearance = r0
            com.google.android.material.shape.ShapeAppearancePathProvider r1 = r5.pathProvider
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r2 = r5.drawableState
            float r2 = r2.interpolation
            android.graphics.RectF r3 = r5.getBoundsInsetByStroke()
            android.graphics.Path r4 = r5.pathInsetByStroke
            r1.calculatePath(r0, r2, r3, r4)
            return
    }

    private android.graphics.PorterDuffColorFilter calculateTintColorTintFilter(android.content.res.ColorStateList r3, android.graphics.PorterDuff.Mode r4, boolean r5) {
            r2 = this;
            int[] r0 = r2.getState()
            r1 = 0
            int r3 = r3.getColorForState(r0, r1)
            if (r5 == 0) goto Lf
            int r3 = r2.compositeElevationOverlayIfNeeded(r3)
        Lf:
            android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
            r5.<init>(r3, r4)
            return r5
    }

    private android.graphics.PorterDuffColorFilter calculateTintFilter(android.content.res.ColorStateList r1, android.graphics.PorterDuff.Mode r2, android.graphics.Paint r3, boolean r4) {
            r0 = this;
            if (r1 == 0) goto La
            if (r2 != 0) goto L5
            goto La
        L5:
            android.graphics.PorterDuffColorFilter r1 = r0.calculateTintColorTintFilter(r1, r2, r4)
            goto Le
        La:
            android.graphics.PorterDuffColorFilter r1 = r0.calculatePaintColorTintFilter(r3, r4)
        Le:
            return r1
    }

    public static com.google.android.material.shape.MaterialShapeDrawable createWithElevationOverlay(android.content.Context r1) {
            r0 = 0
            com.google.android.material.shape.MaterialShapeDrawable r1 = createWithElevationOverlay(r1, r0)
            return r1
    }

    public static com.google.android.material.shape.MaterialShapeDrawable createWithElevationOverlay(android.content.Context r2, float r3) {
            int r0 = com.google.android.material.C0479R.attr.colorSurface
            java.lang.String r1 = "MaterialShapeDrawable"
            int r0 = com.google.android.material.color.MaterialColors.getColor(r2, r0, r1)
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>()
            r1.initializeElevationOverlay(r2)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r0)
            r1.setFillColor(r2)
            r1.setElevation(r3)
            return r1
    }

    private void drawCompatShadow(android.graphics.Canvas r5) {
            r4 = this;
            java.util.BitSet r0 = r4.containsIncompatibleShadowOp
            int r0 = r0.cardinality()
            if (r0 <= 0) goto Lf
            java.lang.String r0 = com.google.android.material.shape.MaterialShapeDrawable.TAG
            java.lang.String r1 = "Compatibility shadow requested but can't be drawn for all operations in this shape."
            android.util.Log.w(r0, r1)
        Lf:
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r4.drawableState
            int r0 = r0.shadowCompatOffset
            if (r0 == 0) goto L20
            android.graphics.Path r0 = r4.path
            com.google.android.material.shadow.ShadowRenderer r1 = r4.shadowRenderer
            android.graphics.Paint r1 = r1.getShadowPaint()
            r5.drawPath(r0, r1)
        L20:
            r0 = 0
        L21:
            r1 = 4
            if (r0 >= r1) goto L41
            com.google.android.material.shape.ShapePath$ShadowCompatOperation[] r1 = r4.cornerShadowOperation
            r1 = r1[r0]
            com.google.android.material.shadow.ShadowRenderer r2 = r4.shadowRenderer
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r3 = r4.drawableState
            int r3 = r3.shadowCompatRadius
            r1.draw(r2, r3, r5)
            com.google.android.material.shape.ShapePath$ShadowCompatOperation[] r1 = r4.edgeShadowOperation
            r1 = r1[r0]
            com.google.android.material.shadow.ShadowRenderer r2 = r4.shadowRenderer
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r3 = r4.drawableState
            int r3 = r3.shadowCompatRadius
            r1.draw(r2, r3, r5)
            int r0 = r0 + 1
            goto L21
        L41:
            boolean r0 = r4.shadowBitmapDrawingEnable
            if (r0 == 0) goto L60
            int r0 = r4.getShadowOffsetX()
            int r1 = r4.getShadowOffsetY()
            int r2 = -r0
            float r2 = (float) r2
            int r3 = -r1
            float r3 = (float) r3
            r5.translate(r2, r3)
            android.graphics.Path r2 = r4.path
            android.graphics.Paint r3 = com.google.android.material.shape.MaterialShapeDrawable.clearPaint
            r5.drawPath(r2, r3)
            float r0 = (float) r0
            float r1 = (float) r1
            r5.translate(r0, r1)
        L60:
            return
    }

    private void drawFillShape(android.graphics.Canvas r7) {
            r6 = this;
            android.graphics.Paint r2 = r6.fillPaint
            android.graphics.Path r3 = r6.path
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r6.drawableState
            com.google.android.material.shape.ShapeAppearanceModel r4 = r0.shapeAppearanceModel
            android.graphics.RectF r5 = r6.getBoundsAsRectF()
            r0 = r6
            r1 = r7
            r0.drawShape(r1, r2, r3, r4, r5)
            return
    }

    private void drawShape(android.graphics.Canvas r2, android.graphics.Paint r3, android.graphics.Path r4, com.google.android.material.shape.ShapeAppearanceModel r5, android.graphics.RectF r6) {
            r1 = this;
            boolean r0 = r5.isRoundRect(r6)
            if (r0 == 0) goto L17
            com.google.android.material.shape.CornerSize r4 = r5.getTopRightCornerSize()
            float r4 = r4.getCornerSize(r6)
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r5 = r1.drawableState
            float r5 = r5.interpolation
            float r4 = r4 * r5
            r2.drawRoundRect(r6, r4, r4, r3)
            goto L1a
        L17:
            r2.drawPath(r4, r3)
        L1a:
            return
    }

    private void drawStrokeShape(android.graphics.Canvas r7) {
            r6 = this;
            android.graphics.Paint r2 = r6.strokePaint
            android.graphics.Path r3 = r6.pathInsetByStroke
            com.google.android.material.shape.ShapeAppearanceModel r4 = r6.strokeShapeAppearance
            android.graphics.RectF r5 = r6.getBoundsInsetByStroke()
            r0 = r6
            r1 = r7
            r0.drawShape(r1, r2, r3, r4, r5)
            return
    }

    private android.graphics.RectF getBoundsInsetByStroke() {
            r2 = this;
            android.graphics.RectF r0 = r2.insetRectF
            android.graphics.RectF r1 = r2.getBoundsAsRectF()
            r0.set(r1)
            float r0 = r2.getStrokeInsetLength()
            android.graphics.RectF r1 = r2.insetRectF
            r1.inset(r0, r0)
            android.graphics.RectF r0 = r2.insetRectF
            return r0
    }

    private float getStrokeInsetLength() {
            r2 = this;
            boolean r0 = r2.hasStroke()
            if (r0 == 0) goto L10
            android.graphics.Paint r0 = r2.strokePaint
            float r0 = r0.getStrokeWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            return r0
        L10:
            r0 = 0
            return r0
    }

    private boolean hasCompatShadow() {
            r3 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r3.drawableState
            int r0 = r0.shadowCompatMode
            r1 = 1
            if (r0 == r1) goto L1b
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r3.drawableState
            int r0 = r0.shadowCompatRadius
            if (r0 <= 0) goto L1b
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r3.drawableState
            int r0 = r0.shadowCompatMode
            r2 = 2
            if (r0 == r2) goto L1c
            boolean r0 = r3.requiresCompatShadow()
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            return r1
    }

    private boolean hasFill() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r2.drawableState
            android.graphics.Paint$Style r0 = r0.paintStyle
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto L13
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r2.drawableState
            android.graphics.Paint$Style r0 = r0.paintStyle
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            if (r0 != r1) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    private boolean hasStroke() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r2.drawableState
            android.graphics.Paint$Style r0 = r0.paintStyle
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto L10
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r2.drawableState
            android.graphics.Paint$Style r0 = r0.paintStyle
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            if (r0 != r1) goto L1d
        L10:
            android.graphics.Paint r0 = r2.strokePaint
            float r0 = r0.getStrokeWidth()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    private void invalidateSelfIgnoreShape() {
            r0 = this;
            super.invalidateSelf()
            return
    }

    private void maybeDrawCompatShadow(android.graphics.Canvas r7) {
            r6 = this;
            boolean r0 = r6.hasCompatShadow()
            if (r0 != 0) goto L7
            return
        L7:
            r7.save()
            r6.prepareCanvasForShadow(r7)
            boolean r0 = r6.shadowBitmapDrawingEnable
            if (r0 != 0) goto L18
            r6.drawCompatShadow(r7)
            r7.restore()
            return
        L18:
            android.graphics.RectF r0 = r6.pathBounds
            float r0 = r0.width()
            android.graphics.Rect r1 = r6.getBounds()
            int r1 = r1.width()
            float r1 = (float) r1
            float r0 = r0 - r1
            int r0 = (int) r0
            android.graphics.RectF r1 = r6.pathBounds
            float r1 = r1.height()
            android.graphics.Rect r2 = r6.getBounds()
            int r2 = r2.height()
            float r2 = (float) r2
            float r1 = r1 - r2
            int r1 = (int) r1
            if (r0 < 0) goto L94
            if (r1 < 0) goto L94
            android.graphics.RectF r2 = r6.pathBounds
            float r2 = r2.width()
            int r2 = (int) r2
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r3 = r6.drawableState
            int r3 = r3.shadowCompatRadius
            int r3 = r3 * 2
            int r2 = r2 + r3
            int r2 = r2 + r0
            android.graphics.RectF r3 = r6.pathBounds
            float r3 = r3.height()
            int r3 = (int) r3
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r4 = r6.drawableState
            int r4 = r4.shadowCompatRadius
            int r4 = r4 * 2
            int r3 = r3 + r4
            int r3 = r3 + r1
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            android.graphics.Rect r4 = r6.getBounds()
            int r4 = r4.left
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r5 = r6.drawableState
            int r5 = r5.shadowCompatRadius
            int r4 = r4 - r5
            int r4 = r4 - r0
            float r0 = (float) r4
            android.graphics.Rect r4 = r6.getBounds()
            int r4 = r4.top
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r5 = r6.drawableState
            int r5 = r5.shadowCompatRadius
            int r4 = r4 - r5
            int r4 = r4 - r1
            float r1 = (float) r4
            float r4 = -r0
            float r5 = -r1
            r3.translate(r4, r5)
            r6.drawCompatShadow(r3)
            r3 = 0
            r7.drawBitmap(r2, r0, r1, r3)
            r2.recycle()
            r7.restore()
            return
        L94:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r7.<init>(r0)
            throw r7
    }

    private static int modulateAlpha(int r1, int r2) {
            int r0 = r2 >>> 7
            int r2 = r2 + r0
            int r1 = r1 * r2
            int r1 = r1 >>> 8
            return r1
    }

    private void prepareCanvasForShadow(android.graphics.Canvas r3) {
            r2 = this;
            int r0 = r2.getShadowOffsetX()
            int r1 = r2.getShadowOffsetY()
            float r0 = (float) r0
            float r1 = (float) r1
            r3.translate(r0, r1)
            return
    }

    private boolean updateColorsForState(int[] r5) {
            r4 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r4.drawableState
            android.content.res.ColorStateList r0 = r0.fillColor
            r1 = 1
            if (r0 == 0) goto L1e
            android.graphics.Paint r0 = r4.fillPaint
            int r0 = r0.getColor()
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r2 = r4.drawableState
            android.content.res.ColorStateList r2 = r2.fillColor
            int r2 = r2.getColorForState(r5, r0)
            if (r0 == r2) goto L1e
            android.graphics.Paint r0 = r4.fillPaint
            r0.setColor(r2)
            r0 = r1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r2 = r4.drawableState
            android.content.res.ColorStateList r2 = r2.strokeColor
            if (r2 == 0) goto L3b
            android.graphics.Paint r2 = r4.strokePaint
            int r2 = r2.getColor()
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r3 = r4.drawableState
            android.content.res.ColorStateList r3 = r3.strokeColor
            int r5 = r3.getColorForState(r5, r2)
            if (r2 == r5) goto L3b
            android.graphics.Paint r0 = r4.strokePaint
            r0.setColor(r5)
            goto L3c
        L3b:
            r1 = r0
        L3c:
            return r1
    }

    private boolean updateTintFilter() {
            r7 = this;
            android.graphics.PorterDuffColorFilter r0 = r7.tintFilter
            android.graphics.PorterDuffColorFilter r1 = r7.strokeTintFilter
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r2 = r7.drawableState
            android.content.res.ColorStateList r2 = r2.tintList
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r3 = r7.drawableState
            android.graphics.PorterDuff$Mode r3 = r3.tintMode
            android.graphics.Paint r4 = r7.fillPaint
            r5 = 1
            android.graphics.PorterDuffColorFilter r2 = r7.calculateTintFilter(r2, r3, r4, r5)
            r7.tintFilter = r2
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r2 = r7.drawableState
            android.content.res.ColorStateList r2 = r2.strokeTintList
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r3 = r7.drawableState
            android.graphics.PorterDuff$Mode r3 = r3.tintMode
            android.graphics.Paint r4 = r7.strokePaint
            r6 = 0
            android.graphics.PorterDuffColorFilter r2 = r7.calculateTintFilter(r2, r3, r4, r6)
            r7.strokeTintFilter = r2
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r2 = r7.drawableState
            boolean r2 = r2.useTintColorForShadow
            if (r2 == 0) goto L3d
            com.google.android.material.shadow.ShadowRenderer r2 = r7.shadowRenderer
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r3 = r7.drawableState
            android.content.res.ColorStateList r3 = r3.tintList
            int[] r4 = r7.getState()
            int r3 = r3.getColorForState(r4, r6)
            r2.setShadowColor(r3)
        L3d:
            android.graphics.PorterDuffColorFilter r2 = r7.tintFilter
            boolean r0 = androidx.core.util.ObjectsCompat.equals(r0, r2)
            if (r0 == 0) goto L4f
            android.graphics.PorterDuffColorFilter r0 = r7.strokeTintFilter
            boolean r0 = androidx.core.util.ObjectsCompat.equals(r1, r0)
            if (r0 != 0) goto L4e
            goto L4f
        L4e:
            r5 = r6
        L4f:
            return r5
    }

    private void updateZ() {
            r4 = this;
            float r0 = r4.getZ()
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r1 = r4.drawableState
            r2 = 1061158912(0x3f400000, float:0.75)
            float r2 = r2 * r0
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r1.shadowCompatRadius = r2
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r1 = r4.drawableState
            r2 = 1048576000(0x3e800000, float:0.25)
            float r0 = r0 * r2
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            r1.shadowCompatOffset = r0
            r4.updateTintFilter()
            r4.invalidateSelfIgnoreShape()
            return
    }

    protected final void calculatePathForSize(android.graphics.RectF r7, android.graphics.Path r8) {
            r6 = this;
            com.google.android.material.shape.ShapeAppearancePathProvider r0 = r6.pathProvider
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r1 = r6.drawableState
            com.google.android.material.shape.ShapeAppearanceModel r1 = r1.shapeAppearanceModel
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r2 = r6.drawableState
            float r2 = r2.interpolation
            com.google.android.material.shape.ShapeAppearancePathProvider$PathListener r4 = r6.pathShadowListener
            r3 = r7
            r5 = r8
            r0.calculatePath(r1, r2, r3, r4, r5)
            return
    }

    protected int compositeElevationOverlayIfNeeded(int r3) {
            r2 = this;
            float r0 = r2.getZ()
            float r1 = r2.getParentAbsoluteElevation()
            float r0 = r0 + r1
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r1 = r2.drawableState
            com.google.android.material.elevation.ElevationOverlayProvider r1 = r1.elevationOverlayProvider
            if (r1 == 0) goto L17
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r1 = r2.drawableState
            com.google.android.material.elevation.ElevationOverlayProvider r1 = r1.elevationOverlayProvider
            int r3 = r1.compositeOverlayIfNeeded(r3, r0)
        L17:
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r5) {
            r4 = this;
            android.graphics.Paint r0 = r4.fillPaint
            android.graphics.PorterDuffColorFilter r1 = r4.tintFilter
            r0.setColorFilter(r1)
            android.graphics.Paint r0 = r4.fillPaint
            int r0 = r0.getAlpha()
            android.graphics.Paint r1 = r4.fillPaint
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r2 = r4.drawableState
            int r2 = r2.alpha
            int r2 = modulateAlpha(r0, r2)
            r1.setAlpha(r2)
            android.graphics.Paint r1 = r4.strokePaint
            android.graphics.PorterDuffColorFilter r2 = r4.strokeTintFilter
            r1.setColorFilter(r2)
            android.graphics.Paint r1 = r4.strokePaint
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r2 = r4.drawableState
            float r2 = r2.strokeWidth
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r4.strokePaint
            int r1 = r1.getAlpha()
            android.graphics.Paint r2 = r4.strokePaint
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r3 = r4.drawableState
            int r3 = r3.alpha
            int r3 = modulateAlpha(r1, r3)
            r2.setAlpha(r3)
            boolean r2 = r4.pathDirty
            if (r2 == 0) goto L50
            r4.calculateStrokePath()
            android.graphics.RectF r2 = r4.getBoundsAsRectF()
            android.graphics.Path r3 = r4.path
            r4.calculatePath(r2, r3)
            r2 = 0
            r4.pathDirty = r2
        L50:
            r4.maybeDrawCompatShadow(r5)
            boolean r2 = r4.hasFill()
            if (r2 == 0) goto L5c
            r4.drawFillShape(r5)
        L5c:
            boolean r2 = r4.hasStroke()
            if (r2 == 0) goto L65
            r4.drawStrokeShape(r5)
        L65:
            android.graphics.Paint r5 = r4.fillPaint
            r5.setAlpha(r0)
            android.graphics.Paint r5 = r4.strokePaint
            r5.setAlpha(r1)
            return
    }

    protected void drawShape(android.graphics.Canvas r8, android.graphics.Paint r9, android.graphics.Path r10, android.graphics.RectF r11) {
            r7 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r7.drawableState
            com.google.android.material.shape.ShapeAppearanceModel r5 = r0.shapeAppearanceModel
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            r1.drawShape(r2, r3, r4, r5, r6)
            return
    }

    public float getBottomLeftCornerResolvedSize() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r2.drawableState
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r0 = r0.getBottomLeftCornerSize()
            android.graphics.RectF r1 = r2.getBoundsAsRectF()
            float r0 = r0.getCornerSize(r1)
            return r0
    }

    public float getBottomRightCornerResolvedSize() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r2.drawableState
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r0 = r0.getBottomRightCornerSize()
            android.graphics.RectF r1 = r2.getBoundsAsRectF()
            float r0 = r0.getCornerSize(r1)
            return r0
    }

    protected android.graphics.RectF getBoundsAsRectF() {
            r2 = this;
            android.graphics.RectF r0 = r2.rectF
            android.graphics.Rect r1 = r2.getBounds()
            r0.set(r1)
            android.graphics.RectF r0 = r2.rectF
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            return r0
    }

    public float getElevation() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            float r0 = r0.elevation
            return r0
    }

    public android.content.res.ColorStateList getFillColor() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.fillColor
            return r0
    }

    public float getInterpolation() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            float r0 = r0.interpolation
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r3) {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r2.drawableState
            int r0 = r0.shadowCompatMode
            r1 = 2
            if (r0 != r1) goto L8
            return
        L8:
            boolean r0 = r2.isRoundRect()
            if (r0 == 0) goto L1f
            float r0 = r2.getTopLeftCornerResolvedSize()
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r1 = r2.drawableState
            float r1 = r1.interpolation
            float r0 = r0 * r1
            android.graphics.Rect r1 = r2.getBounds()
            r3.setRoundRect(r1, r0)
            return
        L1f:
            android.graphics.RectF r0 = r2.getBoundsAsRectF()
            android.graphics.Path r1 = r2.path
            r2.calculatePath(r0, r1)
            android.graphics.Path r0 = r2.path
            boolean r0 = r0.isConvex()
            if (r0 != 0) goto L36
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L3b
        L36:
            android.graphics.Path r0 = r2.path     // Catch: java.lang.IllegalArgumentException -> L3b
            r3.setConvexPath(r0)     // Catch: java.lang.IllegalArgumentException -> L3b
        L3b:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.graphics.Rect r0 = r0.padding
            if (r0 == 0) goto Lf
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.graphics.Rect r0 = r0.padding
            r2.set(r0)
            r2 = 1
            return r2
        Lf:
            boolean r2 = super.getPadding(r2)
            return r2
    }

    public android.graphics.Paint.Style getPaintStyle() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.graphics.Paint$Style r0 = r0.paintStyle
            return r0
    }

    public float getParentAbsoluteElevation() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            float r0 = r0.parentAbsoluteElevation
            return r0
    }

    @java.lang.Deprecated
    public void getPathForSize(int r3, int r4, android.graphics.Path r5) {
            r2 = this;
            android.graphics.RectF r0 = new android.graphics.RectF
            float r3 = (float) r3
            float r4 = (float) r4
            r1 = 0
            r0.<init>(r1, r1, r3, r4)
            r2.calculatePathForSize(r0, r5)
            return
    }

    public float getScale() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            float r0 = r0.scale
            return r0
    }

    public int getShadowCompatRotation() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            int r0 = r0.shadowCompatRotation
            return r0
    }

    public int getShadowCompatibilityMode() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            int r0 = r0.shadowCompatMode
            return r0
    }

    @java.lang.Deprecated
    public int getShadowElevation() {
            r1 = this;
            float r0 = r1.getElevation()
            int r0 = (int) r0
            return r0
    }

    public int getShadowOffsetX() {
            r4 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r4.drawableState
            int r0 = r0.shadowCompatOffset
            double r0 = (double) r0
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r2 = r4.drawableState
            int r2 = r2.shadowCompatRotation
            double r2 = (double) r2
            double r2 = java.lang.Math.toRadians(r2)
            double r2 = java.lang.Math.sin(r2)
            double r0 = r0 * r2
            int r0 = (int) r0
            return r0
    }

    public int getShadowOffsetY() {
            r4 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r4.drawableState
            int r0 = r0.shadowCompatOffset
            double r0 = (double) r0
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r2 = r4.drawableState
            int r2 = r2.shadowCompatRotation
            double r2 = (double) r2
            double r2 = java.lang.Math.toRadians(r2)
            double r2 = java.lang.Math.cos(r2)
            double r0 = r0 * r2
            int r0 = (int) r0
            return r0
    }

    public int getShadowRadius() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            int r0 = r0.shadowCompatRadius
            return r0
    }

    public int getShadowVerticalOffset() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            int r0 = r0.shadowCompatOffset
            return r0
    }

    @Override // com.google.android.material.shape.Shapeable
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.shapeAppearanceModel
            return r0
    }

    @java.lang.Deprecated
    public com.google.android.material.shape.ShapePathModel getShapedViewModel() {
            r2 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.getShapeAppearanceModel()
            boolean r1 = r0 instanceof com.google.android.material.shape.ShapePathModel
            if (r1 == 0) goto Lb
            com.google.android.material.shape.ShapePathModel r0 = (com.google.android.material.shape.ShapePathModel) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public android.content.res.ColorStateList getStrokeColor() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.strokeColor
            return r0
    }

    public android.content.res.ColorStateList getStrokeTintList() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.strokeTintList
            return r0
    }

    public float getStrokeWidth() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            float r0 = r0.strokeWidth
            return r0
    }

    public android.content.res.ColorStateList getTintList() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.tintList
            return r0
    }

    public float getTopLeftCornerResolvedSize() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r2.drawableState
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r0 = r0.getTopLeftCornerSize()
            android.graphics.RectF r1 = r2.getBoundsAsRectF()
            float r0 = r0.getCornerSize(r1)
            return r0
    }

    public float getTopRightCornerResolvedSize() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r2.drawableState
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r0 = r0.getTopRightCornerSize()
            android.graphics.RectF r1 = r2.getBoundsAsRectF()
            float r0 = r0.getCornerSize(r1)
            return r0
    }

    public float getTranslationZ() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            float r0 = r0.translationZ
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
            r3 = this;
            android.graphics.Rect r0 = r3.getBounds()
            android.graphics.Region r1 = r3.transparentRegion
            r1.set(r0)
            android.graphics.RectF r0 = r3.getBoundsAsRectF()
            android.graphics.Path r1 = r3.path
            r3.calculatePath(r0, r1)
            android.graphics.Region r0 = r3.scratchRegion
            android.graphics.Path r1 = r3.path
            android.graphics.Region r2 = r3.transparentRegion
            r0.setPath(r1, r2)
            android.graphics.Region r0 = r3.transparentRegion
            android.graphics.Region r1 = r3.scratchRegion
            android.graphics.Region$Op r2 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r1, r2)
            android.graphics.Region r0 = r3.transparentRegion
            return r0
    }

    public float getZ() {
            r2 = this;
            float r0 = r2.getElevation()
            float r1 = r2.getTranslationZ()
            float r0 = r0 + r1
            return r0
    }

    public void initializeElevationOverlay(android.content.Context r3) {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r2.drawableState
            com.google.android.material.elevation.ElevationOverlayProvider r1 = new com.google.android.material.elevation.ElevationOverlayProvider
            r1.<init>(r3)
            r0.elevationOverlayProvider = r1
            r2.updateZ()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
            r1 = this;
            r0 = 1
            r1.pathDirty = r0
            super.invalidateSelf()
            return
    }

    public boolean isElevationOverlayEnabled() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            com.google.android.material.elevation.ElevationOverlayProvider r0 = r0.elevationOverlayProvider
            if (r0 == 0) goto L12
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            com.google.android.material.elevation.ElevationOverlayProvider r0 = r0.elevationOverlayProvider
            boolean r0 = r0.isThemeElevationOverlayEnabled()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public boolean isElevationOverlayInitialized() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            com.google.android.material.elevation.ElevationOverlayProvider r0 = r0.elevationOverlayProvider
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isPointInTransparentRegion(int r2, int r3) {
            r1 = this;
            android.graphics.Region r0 = r1.getTransparentRegion()
            boolean r2 = r0.contains(r2, r3)
            return r2
    }

    public boolean isRoundRect() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r2.drawableState
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.shapeAppearanceModel
            android.graphics.RectF r1 = r2.getBoundsAsRectF()
            boolean r0 = r0.isRoundRect(r1)
            return r0
    }

    @java.lang.Deprecated
    public boolean isShadowEnabled() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r2.drawableState
            int r0 = r0.shadowCompatMode
            if (r0 == 0) goto L10
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r2.drawableState
            int r0 = r0.shadowCompatMode
            r1 = 2
            if (r0 != r1) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L49
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.tintList
            if (r0 == 0) goto L16
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.tintList
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L49
        L16:
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.strokeTintList
            if (r0 == 0) goto L26
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.strokeTintList
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L49
        L26:
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.strokeColor
            if (r0 == 0) goto L36
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.strokeColor
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L49
        L36:
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.fillColor
            if (r0 == 0) goto L47
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.fillColor
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L47
            goto L49
        L47:
            r0 = 0
            goto L4a
        L49:
            r0 = 1
        L4a:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = new com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r1 = r2.drawableState
            r0.<init>(r1)
            r2.drawableState = r0
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            r0 = 1
            r1.pathDirty = r0
            super.onBoundsChange(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    protected boolean onStateChange(int[] r2) {
            r1 = this;
            boolean r2 = r1.updateColorsForState(r2)
            boolean r0 = r1.updateTintFilter()
            if (r2 != 0) goto Lf
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            if (r2 == 0) goto L15
            r1.invalidateSelf()
        L15:
            return r2
    }

    public boolean requiresCompatShadow() {
            r2 = this;
            boolean r0 = r2.isRoundRect()
            if (r0 != 0) goto L16
            android.graphics.Path r0 = r2.path
            boolean r0 = r0.isConvex()
            if (r0 != 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            int r0 = r0.alpha
            if (r0 == r2) goto Ld
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.alpha = r2
            r1.invalidateSelfIgnoreShape()
        Ld:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.colorFilter = r2
            r1.invalidateSelfIgnoreShape()
            return
    }

    public void setCornerSize(float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.shapeAppearanceModel
            com.google.android.material.shape.ShapeAppearanceModel r2 = r0.withCornerSize(r2)
            r1.setShapeAppearanceModel(r2)
            return
    }

    public void setCornerSize(com.google.android.material.shape.CornerSize r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.shapeAppearanceModel
            com.google.android.material.shape.ShapeAppearanceModel r2 = r0.withCornerSize(r2)
            r1.setShapeAppearanceModel(r2)
            return
    }

    public void setEdgeIntersectionCheckEnable(boolean r2) {
            r1 = this;
            com.google.android.material.shape.ShapeAppearancePathProvider r0 = r1.pathProvider
            r0.setEdgeIntersectionCheckEnable(r2)
            return
    }

    public void setElevation(float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            float r0 = r0.elevation
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lf
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.elevation = r2
            r1.updateZ()
        Lf:
            return
    }

    public void setFillColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.fillColor
            if (r0 == r2) goto L11
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.fillColor = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L11:
            return
    }

    public void setInterpolation(float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            float r0 = r0.interpolation
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L12
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.interpolation = r2
            r2 = 1
            r1.pathDirty = r2
            r1.invalidateSelf()
        L12:
            return
    }

    public void setPadding(int r3, int r4, int r5, int r6) {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r2.drawableState
            android.graphics.Rect r0 = r0.padding
            if (r0 != 0) goto Lf
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r2.drawableState
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.padding = r1
        Lf:
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r2.drawableState
            android.graphics.Rect r0 = r0.padding
            r0.set(r3, r4, r5, r6)
            r2.invalidateSelf()
            return
    }

    public void setPaintStyle(android.graphics.Paint.Style r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.paintStyle = r2
            r1.invalidateSelfIgnoreShape()
            return
    }

    public void setParentAbsoluteElevation(float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            float r0 = r0.parentAbsoluteElevation
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lf
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.parentAbsoluteElevation = r2
            r1.updateZ()
        Lf:
            return
    }

    public void setScale(float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            float r0 = r0.scale
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lf
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.scale = r2
            r1.invalidateSelf()
        Lf:
            return
    }

    public void setShadowBitmapDrawingEnable(boolean r1) {
            r0 = this;
            r0.shadowBitmapDrawingEnable = r1
            return
    }

    public void setShadowColor(int r2) {
            r1 = this;
            com.google.android.material.shadow.ShadowRenderer r0 = r1.shadowRenderer
            r0.setShadowColor(r2)
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r2 = r1.drawableState
            r0 = 0
            r2.useTintColorForShadow = r0
            r1.invalidateSelfIgnoreShape()
            return
    }

    public void setShadowCompatRotation(int r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            int r0 = r0.shadowCompatRotation
            if (r0 == r2) goto Ld
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.shadowCompatRotation = r2
            r1.invalidateSelfIgnoreShape()
        Ld:
            return
    }

    public void setShadowCompatibilityMode(int r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            int r0 = r0.shadowCompatMode
            if (r0 == r2) goto Ld
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.shadowCompatMode = r2
            r1.invalidateSelfIgnoreShape()
        Ld:
            return
    }

    @java.lang.Deprecated
    public void setShadowElevation(int r1) {
            r0 = this;
            float r1 = (float) r1
            r0.setElevation(r1)
            return
    }

    @java.lang.Deprecated
    public void setShadowEnabled(boolean r1) {
            r0 = this;
            r1 = r1 ^ 1
            r0.setShadowCompatibilityMode(r1)
            return
    }

    @java.lang.Deprecated
    public void setShadowRadius(int r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.shadowCompatRadius = r2
            return
    }

    public void setShadowVerticalOffset(int r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            int r0 = r0.shadowCompatOffset
            if (r0 == r2) goto Ld
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.shadowCompatOffset = r2
            r1.invalidateSelfIgnoreShape()
        Ld:
            return
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.shapeAppearanceModel = r2
            r1.invalidateSelf()
            return
    }

    @java.lang.Deprecated
    public void setShapedViewModel(com.google.android.material.shape.ShapePathModel r1) {
            r0 = this;
            r0.setShapeAppearanceModel(r1)
            return
    }

    public void setStroke(float r1, int r2) {
            r0 = this;
            r0.setStrokeWidth(r1)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r2)
            r0.setStrokeColor(r1)
            return
    }

    public void setStroke(float r1, android.content.res.ColorStateList r2) {
            r0 = this;
            r0.setStrokeWidth(r1)
            r0.setStrokeColor(r2)
            return
    }

    public void setStrokeColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.strokeColor
            if (r0 == r2) goto L11
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.strokeColor = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L11:
            return
    }

    public void setStrokeTint(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setStrokeTint(r1)
            return
    }

    public void setStrokeTint(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.strokeTintList = r2
            r1.updateTintFilter()
            r1.invalidateSelfIgnoreShape()
            return
    }

    public void setStrokeWidth(float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.strokeWidth = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setTintList(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.tintList = r2
            r1.updateTintFilter()
            r1.invalidateSelfIgnoreShape()
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            android.graphics.PorterDuff$Mode r0 = r0.tintMode
            if (r0 == r2) goto L10
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.tintMode = r2
            r1.updateTintFilter()
            r1.invalidateSelfIgnoreShape()
        L10:
            return
    }

    public void setTranslationZ(float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            float r0 = r0.translationZ
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lf
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.translationZ = r2
            r1.updateZ()
        Lf:
            return
    }

    public void setUseTintColorForShadow(boolean r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            boolean r0 = r0.useTintColorForShadow
            if (r0 == r2) goto Ld
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.drawableState
            r0.useTintColorForShadow = r2
            r1.invalidateSelf()
        Ld:
            return
    }

    public void setZ(float r2) {
            r1 = this;
            float r0 = r1.getElevation()
            float r2 = r2 - r0
            r1.setTranslationZ(r2)
            return
    }
}
