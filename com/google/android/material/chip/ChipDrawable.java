package com.google.android.material.chip;

/* loaded from: classes.dex */
public class ChipDrawable extends com.google.android.material.shape.MaterialShapeDrawable implements androidx.core.graphics.drawable.TintAwareDrawable, android.graphics.drawable.Drawable.Callback, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate {
    private static final boolean DEBUG = false;
    private static final int[] DEFAULT_STATE = null;
    private static final int MAX_CHIP_ICON_HEIGHT = 24;
    private static final java.lang.String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private static final android.graphics.drawable.ShapeDrawable closeIconRippleMask = null;
    private int alpha;
    private boolean checkable;
    private android.graphics.drawable.Drawable checkedIcon;
    private android.content.res.ColorStateList checkedIconTint;
    private boolean checkedIconVisible;
    private android.content.res.ColorStateList chipBackgroundColor;
    private float chipCornerRadius;
    private float chipEndPadding;
    private android.graphics.drawable.Drawable chipIcon;
    private float chipIconSize;
    private android.content.res.ColorStateList chipIconTint;
    private boolean chipIconVisible;
    private float chipMinHeight;
    private final android.graphics.Paint chipPaint;
    private float chipStartPadding;
    private android.content.res.ColorStateList chipStrokeColor;
    private float chipStrokeWidth;
    private android.content.res.ColorStateList chipSurfaceColor;
    private android.graphics.drawable.Drawable closeIcon;
    private java.lang.CharSequence closeIconContentDescription;
    private float closeIconEndPadding;
    private android.graphics.drawable.Drawable closeIconRipple;
    private float closeIconSize;
    private float closeIconStartPadding;
    private int[] closeIconStateSet;
    private android.content.res.ColorStateList closeIconTint;
    private boolean closeIconVisible;
    private android.graphics.ColorFilter colorFilter;
    private android.content.res.ColorStateList compatRippleColor;
    private final android.content.Context context;
    private boolean currentChecked;
    private int currentChipBackgroundColor;
    private int currentChipStrokeColor;
    private int currentChipSurfaceColor;
    private int currentCompatRippleColor;
    private int currentCompositeSurfaceBackgroundColor;
    private int currentTextColor;
    private int currentTint;
    private final android.graphics.Paint debugPaint;
    private java.lang.ref.WeakReference<com.google.android.material.chip.ChipDrawable.Delegate> delegate;
    private final android.graphics.Paint.FontMetrics fontMetrics;
    private boolean hasChipIconTint;
    private com.google.android.material.animation.MotionSpec hideMotionSpec;
    private float iconEndPadding;
    private float iconStartPadding;
    private boolean isShapeThemingEnabled;
    private int maxWidth;
    private final android.graphics.PointF pointF;
    private final android.graphics.RectF rectF;
    private android.content.res.ColorStateList rippleColor;
    private final android.graphics.Path shapePath;
    private boolean shouldDrawText;
    private com.google.android.material.animation.MotionSpec showMotionSpec;
    private java.lang.CharSequence text;
    private final com.google.android.material.internal.TextDrawableHelper textDrawableHelper;
    private float textEndPadding;
    private float textStartPadding;
    private android.content.res.ColorStateList tint;
    private android.graphics.PorterDuffColorFilter tintFilter;
    private android.graphics.PorterDuff.Mode tintMode;
    private android.text.TextUtils.TruncateAt truncateAt;
    private boolean useCompatRipple;

    public interface Delegate {
        void onChipDrawableSizeChange();
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842910(0x101009e, float:2.3694E-38)
            r0[r1] = r2
            com.google.android.material.chip.ChipDrawable.DEFAULT_STATE = r0
            android.graphics.drawable.ShapeDrawable r0 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.OvalShape r1 = new android.graphics.drawable.shapes.OvalShape
            r1.<init>()
            r0.<init>(r1)
            com.google.android.material.chip.ChipDrawable.closeIconRippleMask = r0
            return
    }

    private ChipDrawable(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.chipCornerRadius = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 1
            r3.<init>(r4)
            r1.chipPaint = r3
            android.graphics.Paint$FontMetrics r3 = new android.graphics.Paint$FontMetrics
            r3.<init>()
            r1.fontMetrics = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r1.rectF = r3
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>()
            r1.pointF = r3
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r1.shapePath = r3
            r3 = 255(0xff, float:3.57E-43)
            r1.alpha = r3
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.tintMode = r3
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r5 = 0
            r3.<init>(r5)
            r1.delegate = r3
            r1.initializeElevationOverlay(r2)
            r1.context = r2
            com.google.android.material.internal.TextDrawableHelper r3 = new com.google.android.material.internal.TextDrawableHelper
            r3.<init>(r1)
            r1.textDrawableHelper = r3
            java.lang.String r0 = ""
            r1.text = r0
            android.text.TextPaint r3 = r3.getTextPaint()
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3.density = r2
            r1.debugPaint = r5
            int[] r2 = com.google.android.material.chip.ChipDrawable.DEFAULT_STATE
            r1.setState(r2)
            r1.setCloseIconState(r2)
            r1.shouldDrawText = r4
            boolean r2 = com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE
            if (r2 == 0) goto L71
            android.graphics.drawable.ShapeDrawable r2 = com.google.android.material.chip.ChipDrawable.closeIconRippleMask
            r3 = -1
            r2.setTint(r3)
        L71:
            return
    }

    private void applyChildDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            r3.setCallback(r2)
            int r0 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r2)
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r3, r0)
            int r0 = r2.getLevel()
            r3.setLevel(r0)
            boolean r0 = r2.isVisible()
            r1 = 0
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r0 = r2.closeIcon
            if (r3 != r0) goto L33
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L2d
            int[] r0 = r2.getCloseIconState()
            r3.setState(r0)
        L2d:
            android.content.res.ColorStateList r0 = r2.closeIconTint
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r3, r0)
            return
        L33:
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L40
            int[] r0 = r2.getState()
            r3.setState(r0)
        L40:
            android.graphics.drawable.Drawable r0 = r2.chipIcon
            if (r3 != r0) goto L4d
            boolean r3 = r2.hasChipIconTint
            if (r3 == 0) goto L4d
            android.content.res.ColorStateList r3 = r2.chipIconTint
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r3)
        L4d:
            return
    }

    private void calculateChipIconBounds(android.graphics.Rect r4, android.graphics.RectF r5) {
            r3 = this;
            r5.setEmpty()
            boolean r0 = r3.showsChipIcon()
            if (r0 != 0) goto Lf
            boolean r0 = r3.showsCheckedIcon()
            if (r0 == 0) goto L49
        Lf:
            float r0 = r3.chipStartPadding
            float r1 = r3.iconStartPadding
            float r0 = r0 + r1
            float r1 = r3.getCurrentChipIconWidth()
            int r2 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r3)
            if (r2 != 0) goto L2a
            int r2 = r4.left
            float r2 = (float) r2
            float r2 = r2 + r0
            r5.left = r2
            float r0 = r5.left
            float r0 = r0 + r1
            r5.right = r0
            goto L35
        L2a:
            int r2 = r4.right
            float r2 = (float) r2
            float r2 = r2 - r0
            r5.right = r2
            float r0 = r5.right
            float r0 = r0 - r1
            r5.left = r0
        L35:
            float r0 = r3.getCurrentChipIconHeight()
            float r4 = r4.exactCenterY()
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r0 / r1
            float r4 = r4 - r1
            r5.top = r4
            float r4 = r5.top
            float r4 = r4 + r0
            r5.bottom = r4
        L49:
            return
    }

    private void calculateChipTouchBounds(android.graphics.Rect r3, android.graphics.RectF r4) {
            r2 = this;
            r4.set(r3)
            boolean r0 = r2.showsCloseIcon()
            if (r0 == 0) goto L2a
            float r0 = r2.chipEndPadding
            float r1 = r2.closeIconEndPadding
            float r0 = r0 + r1
            float r1 = r2.closeIconSize
            float r0 = r0 + r1
            float r1 = r2.closeIconStartPadding
            float r0 = r0 + r1
            float r1 = r2.textEndPadding
            float r0 = r0 + r1
            int r1 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r2)
            if (r1 != 0) goto L24
            int r3 = r3.right
            float r3 = (float) r3
            float r3 = r3 - r0
            r4.right = r3
            goto L2a
        L24:
            int r3 = r3.left
            float r3 = (float) r3
            float r3 = r3 + r0
            r4.left = r3
        L2a:
            return
    }

    private void calculateCloseIconBounds(android.graphics.Rect r3, android.graphics.RectF r4) {
            r2 = this;
            r4.setEmpty()
            boolean r0 = r2.showsCloseIcon()
            if (r0 == 0) goto L42
            float r0 = r2.chipEndPadding
            float r1 = r2.closeIconEndPadding
            float r0 = r0 + r1
            int r1 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r2)
            if (r1 != 0) goto L22
            int r1 = r3.right
            float r1 = (float) r1
            float r1 = r1 - r0
            r4.right = r1
            float r0 = r4.right
            float r1 = r2.closeIconSize
            float r0 = r0 - r1
            r4.left = r0
            goto L2f
        L22:
            int r1 = r3.left
            float r1 = (float) r1
            float r1 = r1 + r0
            r4.left = r1
            float r0 = r4.left
            float r1 = r2.closeIconSize
            float r0 = r0 + r1
            r4.right = r0
        L2f:
            float r3 = r3.exactCenterY()
            float r0 = r2.closeIconSize
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r3 = r3 - r0
            r4.top = r3
            float r3 = r4.top
            float r0 = r2.closeIconSize
            float r3 = r3 + r0
            r4.bottom = r3
        L42:
            return
    }

    private void calculateCloseIconTouchBounds(android.graphics.Rect r3, android.graphics.RectF r4) {
            r2 = this;
            r4.setEmpty()
            boolean r0 = r2.showsCloseIcon()
            if (r0 == 0) goto L3d
            float r0 = r2.chipEndPadding
            float r1 = r2.closeIconEndPadding
            float r0 = r0 + r1
            float r1 = r2.closeIconSize
            float r0 = r0 + r1
            float r1 = r2.closeIconStartPadding
            float r0 = r0 + r1
            float r1 = r2.textEndPadding
            float r0 = r0 + r1
            int r1 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r2)
            if (r1 != 0) goto L28
            int r1 = r3.right
            float r1 = (float) r1
            r4.right = r1
            float r1 = r4.right
            float r1 = r1 - r0
            r4.left = r1
            goto L33
        L28:
            int r1 = r3.left
            float r1 = (float) r1
            r4.left = r1
            int r1 = r3.left
            float r1 = (float) r1
            float r1 = r1 + r0
            r4.right = r1
        L33:
            int r0 = r3.top
            float r0 = (float) r0
            r4.top = r0
            int r3 = r3.bottom
            float r3 = (float) r3
            r4.bottom = r3
        L3d:
            return
    }

    private void calculateTextBounds(android.graphics.Rect r4, android.graphics.RectF r5) {
            r3 = this;
            r5.setEmpty()
            java.lang.CharSequence r0 = r3.text
            if (r0 == 0) goto L44
            float r0 = r3.chipStartPadding
            float r1 = r3.calculateChipIconWidth()
            float r0 = r0 + r1
            float r1 = r3.textStartPadding
            float r0 = r0 + r1
            float r1 = r3.chipEndPadding
            float r2 = r3.calculateCloseIconWidth()
            float r1 = r1 + r2
            float r2 = r3.textEndPadding
            float r1 = r1 + r2
            int r2 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r3)
            if (r2 != 0) goto L2e
            int r2 = r4.left
            float r2 = (float) r2
            float r2 = r2 + r0
            r5.left = r2
            int r0 = r4.right
            float r0 = (float) r0
            float r0 = r0 - r1
            r5.right = r0
            goto L3a
        L2e:
            int r2 = r4.left
            float r2 = (float) r2
            float r2 = r2 + r1
            r5.left = r2
            int r1 = r4.right
            float r1 = (float) r1
            float r1 = r1 - r0
            r5.right = r1
        L3a:
            int r0 = r4.top
            float r0 = (float) r0
            r5.top = r0
            int r4 = r4.bottom
            float r4 = (float) r4
            r5.bottom = r4
        L44:
            return
    }

    private float calculateTextCenterFromBaseline() {
            r2 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r2.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            android.graphics.Paint$FontMetrics r1 = r2.fontMetrics
            r0.getFontMetrics(r1)
            android.graphics.Paint$FontMetrics r0 = r2.fontMetrics
            float r0 = r0.descent
            android.graphics.Paint$FontMetrics r1 = r2.fontMetrics
            float r1 = r1.ascent
            float r0 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            return r0
    }

    private boolean canShowCheckedIcon() {
            r1 = this;
            boolean r0 = r1.checkedIconVisible
            if (r0 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r1.checkedIcon
            if (r0 == 0) goto Le
            boolean r0 = r1.checkable
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static com.google.android.material.chip.ChipDrawable createFromAttributes(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            com.google.android.material.chip.ChipDrawable r0 = new com.google.android.material.chip.ChipDrawable
            r0.<init>(r1, r2, r3, r4)
            r0.loadFromAttributes(r2, r3, r4)
            return r0
    }

    public static com.google.android.material.chip.ChipDrawable createFromResource(android.content.Context r2, int r3) {
            java.lang.String r0 = "chip"
            android.util.AttributeSet r3 = com.google.android.material.drawable.DrawableUtils.parseDrawableXml(r2, r3, r0)
            int r0 = r3.getStyleAttribute()
            if (r0 != 0) goto Le
            int r0 = com.google.android.material.C0479R.style.Widget_MaterialComponents_Chip_Entry
        Le:
            int r1 = com.google.android.material.C0479R.attr.chipStandaloneStyle
            com.google.android.material.chip.ChipDrawable r2 = createFromAttributes(r2, r3, r1, r0)
            return r2
    }

    private void drawCheckedIcon(android.graphics.Canvas r6, android.graphics.Rect r7) {
            r5 = this;
            boolean r0 = r5.showsCheckedIcon()
            if (r0 == 0) goto L34
            android.graphics.RectF r0 = r5.rectF
            r5.calculateChipIconBounds(r7, r0)
            android.graphics.RectF r7 = r5.rectF
            float r7 = r7.left
            android.graphics.RectF r0 = r5.rectF
            float r0 = r0.top
            r6.translate(r7, r0)
            android.graphics.drawable.Drawable r1 = r5.checkedIcon
            android.graphics.RectF r2 = r5.rectF
            float r2 = r2.width()
            int r2 = (int) r2
            android.graphics.RectF r3 = r5.rectF
            float r3 = r3.height()
            int r3 = (int) r3
            r4 = 0
            r1.setBounds(r4, r4, r2, r3)
            android.graphics.drawable.Drawable r1 = r5.checkedIcon
            r1.draw(r6)
            float r7 = -r7
            float r0 = -r0
            r6.translate(r7, r0)
        L34:
            return
    }

    private void drawChipBackground(android.graphics.Canvas r4, android.graphics.Rect r5) {
            r3 = this;
            boolean r0 = r3.isShapeThemingEnabled
            if (r0 != 0) goto L2f
            android.graphics.Paint r0 = r3.chipPaint
            int r1 = r3.currentChipBackgroundColor
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.chipPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r3.chipPaint
            android.graphics.ColorFilter r1 = r3.getTintColorFilter()
            r0.setColorFilter(r1)
            android.graphics.RectF r0 = r3.rectF
            r0.set(r5)
            android.graphics.RectF r5 = r3.rectF
            float r0 = r3.getChipCornerRadius()
            float r1 = r3.getChipCornerRadius()
            android.graphics.Paint r2 = r3.chipPaint
            r4.drawRoundRect(r5, r0, r1, r2)
        L2f:
            return
    }

    private void drawChipIcon(android.graphics.Canvas r6, android.graphics.Rect r7) {
            r5 = this;
            boolean r0 = r5.showsChipIcon()
            if (r0 == 0) goto L34
            android.graphics.RectF r0 = r5.rectF
            r5.calculateChipIconBounds(r7, r0)
            android.graphics.RectF r7 = r5.rectF
            float r7 = r7.left
            android.graphics.RectF r0 = r5.rectF
            float r0 = r0.top
            r6.translate(r7, r0)
            android.graphics.drawable.Drawable r1 = r5.chipIcon
            android.graphics.RectF r2 = r5.rectF
            float r2 = r2.width()
            int r2 = (int) r2
            android.graphics.RectF r3 = r5.rectF
            float r3 = r3.height()
            int r3 = (int) r3
            r4 = 0
            r1.setBounds(r4, r4, r2, r3)
            android.graphics.drawable.Drawable r1 = r5.chipIcon
            r1.draw(r6)
            float r7 = -r7
            float r0 = -r0
            r6.translate(r7, r0)
        L34:
            return
    }

    private void drawChipStroke(android.graphics.Canvas r7, android.graphics.Rect r8) {
            r6 = this;
            float r0 = r6.chipStrokeWidth
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L56
            boolean r0 = r6.isShapeThemingEnabled
            if (r0 != 0) goto L56
            android.graphics.Paint r0 = r6.chipPaint
            int r1 = r6.currentChipStrokeColor
            r0.setColor(r1)
            android.graphics.Paint r0 = r6.chipPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            boolean r0 = r6.isShapeThemingEnabled
            if (r0 != 0) goto L26
            android.graphics.Paint r0 = r6.chipPaint
            android.graphics.ColorFilter r1 = r6.getTintColorFilter()
            r0.setColorFilter(r1)
        L26:
            android.graphics.RectF r0 = r6.rectF
            int r1 = r8.left
            float r1 = (float) r1
            float r2 = r6.chipStrokeWidth
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r1 = r1 + r2
            int r2 = r8.top
            float r2 = (float) r2
            float r4 = r6.chipStrokeWidth
            float r4 = r4 / r3
            float r2 = r2 + r4
            int r4 = r8.right
            float r4 = (float) r4
            float r5 = r6.chipStrokeWidth
            float r5 = r5 / r3
            float r4 = r4 - r5
            int r8 = r8.bottom
            float r8 = (float) r8
            float r5 = r6.chipStrokeWidth
            float r5 = r5 / r3
            float r8 = r8 - r5
            r0.set(r1, r2, r4, r8)
            float r8 = r6.chipCornerRadius
            float r0 = r6.chipStrokeWidth
            float r0 = r0 / r3
            float r8 = r8 - r0
            android.graphics.RectF r0 = r6.rectF
            android.graphics.Paint r1 = r6.chipPaint
            r7.drawRoundRect(r0, r8, r8, r1)
        L56:
            return
    }

    private void drawChipSurface(android.graphics.Canvas r4, android.graphics.Rect r5) {
            r3 = this;
            boolean r0 = r3.isShapeThemingEnabled
            if (r0 != 0) goto L26
            android.graphics.Paint r0 = r3.chipPaint
            int r1 = r3.currentChipSurfaceColor
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.chipPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.RectF r0 = r3.rectF
            r0.set(r5)
            android.graphics.RectF r5 = r3.rectF
            float r0 = r3.getChipCornerRadius()
            float r1 = r3.getChipCornerRadius()
            android.graphics.Paint r2 = r3.chipPaint
            r4.drawRoundRect(r5, r0, r1, r2)
        L26:
            return
    }

    private void drawCloseIcon(android.graphics.Canvas r6, android.graphics.Rect r7) {
            r5 = this;
            boolean r0 = r5.showsCloseIcon()
            if (r0 == 0) goto L4e
            android.graphics.RectF r0 = r5.rectF
            r5.calculateCloseIconBounds(r7, r0)
            android.graphics.RectF r7 = r5.rectF
            float r7 = r7.left
            android.graphics.RectF r0 = r5.rectF
            float r0 = r0.top
            r6.translate(r7, r0)
            android.graphics.drawable.Drawable r1 = r5.closeIcon
            android.graphics.RectF r2 = r5.rectF
            float r2 = r2.width()
            int r2 = (int) r2
            android.graphics.RectF r3 = r5.rectF
            float r3 = r3.height()
            int r3 = (int) r3
            r4 = 0
            r1.setBounds(r4, r4, r2, r3)
            boolean r1 = com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE
            if (r1 == 0) goto L44
            android.graphics.drawable.Drawable r1 = r5.closeIconRipple
            android.graphics.drawable.Drawable r2 = r5.closeIcon
            android.graphics.Rect r2 = r2.getBounds()
            r1.setBounds(r2)
            android.graphics.drawable.Drawable r1 = r5.closeIconRipple
            r1.jumpToCurrentState()
            android.graphics.drawable.Drawable r1 = r5.closeIconRipple
            r1.draw(r6)
            goto L49
        L44:
            android.graphics.drawable.Drawable r1 = r5.closeIcon
            r1.draw(r6)
        L49:
            float r7 = -r7
            float r0 = -r0
            r6.translate(r7, r0)
        L4e:
            return
    }

    private void drawCompatRipple(android.graphics.Canvas r4, android.graphics.Rect r5) {
            r3 = this;
            android.graphics.Paint r0 = r3.chipPaint
            int r1 = r3.currentCompatRippleColor
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.chipPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.RectF r0 = r3.rectF
            r0.set(r5)
            boolean r0 = r3.isShapeThemingEnabled
            if (r0 != 0) goto L27
            android.graphics.RectF r5 = r3.rectF
            float r0 = r3.getChipCornerRadius()
            float r1 = r3.getChipCornerRadius()
            android.graphics.Paint r2 = r3.chipPaint
            r4.drawRoundRect(r5, r0, r1, r2)
            goto L3c
        L27:
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r5)
            android.graphics.Path r5 = r3.shapePath
            r3.calculatePathForSize(r0, r5)
            android.graphics.Paint r5 = r3.chipPaint
            android.graphics.Path r0 = r3.shapePath
            android.graphics.RectF r1 = r3.getBoundsAsRectF()
            super.drawShape(r4, r5, r0, r1)
        L3c:
            return
    }

    private void drawDebug(android.graphics.Canvas r10, android.graphics.Rect r11) {
            r9 = this;
            android.graphics.Paint r0 = r9.debugPaint
            if (r0 == 0) goto L85
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = 127(0x7f, float:1.78E-43)
            int r1 = androidx.core.graphics.ColorUtils.setAlphaComponent(r1, r2)
            r0.setColor(r1)
            android.graphics.Paint r0 = r9.debugPaint
            r10.drawRect(r11, r0)
            boolean r0 = r9.showsChipIcon()
            if (r0 != 0) goto L20
            boolean r0 = r9.showsCheckedIcon()
            if (r0 == 0) goto L2c
        L20:
            android.graphics.RectF r0 = r9.rectF
            r9.calculateChipIconBounds(r11, r0)
            android.graphics.RectF r0 = r9.rectF
            android.graphics.Paint r1 = r9.debugPaint
            r10.drawRect(r0, r1)
        L2c:
            java.lang.CharSequence r0 = r9.text
            if (r0 == 0) goto L44
            int r0 = r11.left
            float r4 = (float) r0
            float r5 = r11.exactCenterY()
            int r0 = r11.right
            float r6 = (float) r0
            float r7 = r11.exactCenterY()
            android.graphics.Paint r8 = r9.debugPaint
            r3 = r10
            r3.drawLine(r4, r5, r6, r7, r8)
        L44:
            boolean r0 = r9.showsCloseIcon()
            if (r0 == 0) goto L56
            android.graphics.RectF r0 = r9.rectF
            r9.calculateCloseIconBounds(r11, r0)
            android.graphics.RectF r0 = r9.rectF
            android.graphics.Paint r1 = r9.debugPaint
            r10.drawRect(r0, r1)
        L56:
            android.graphics.Paint r0 = r9.debugPaint
            r1 = -65536(0xffffffffffff0000, float:NaN)
            int r1 = androidx.core.graphics.ColorUtils.setAlphaComponent(r1, r2)
            r0.setColor(r1)
            android.graphics.RectF r0 = r9.rectF
            r9.calculateChipTouchBounds(r11, r0)
            android.graphics.RectF r0 = r9.rectF
            android.graphics.Paint r1 = r9.debugPaint
            r10.drawRect(r0, r1)
            android.graphics.Paint r0 = r9.debugPaint
            r1 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            int r1 = androidx.core.graphics.ColorUtils.setAlphaComponent(r1, r2)
            r0.setColor(r1)
            android.graphics.RectF r0 = r9.rectF
            r9.calculateCloseIconTouchBounds(r11, r0)
            android.graphics.RectF r11 = r9.rectF
            android.graphics.Paint r0 = r9.debugPaint
            r10.drawRect(r11, r0)
        L85:
            return
    }

    private void drawText(android.graphics.Canvas r10, android.graphics.Rect r11) {
            r9 = this;
            java.lang.CharSequence r0 = r9.text
            if (r0 == 0) goto L97
            android.graphics.PointF r0 = r9.pointF
            android.graphics.Paint$Align r0 = r9.calculateTextOriginAndAlignment(r11, r0)
            android.graphics.RectF r1 = r9.rectF
            r9.calculateTextBounds(r11, r1)
            com.google.android.material.internal.TextDrawableHelper r11 = r9.textDrawableHelper
            com.google.android.material.resources.TextAppearance r11 = r11.getTextAppearance()
            if (r11 == 0) goto L2a
            com.google.android.material.internal.TextDrawableHelper r11 = r9.textDrawableHelper
            android.text.TextPaint r11 = r11.getTextPaint()
            int[] r1 = r9.getState()
            r11.drawableState = r1
            com.google.android.material.internal.TextDrawableHelper r11 = r9.textDrawableHelper
            android.content.Context r1 = r9.context
            r11.updateTextPaintDrawState(r1)
        L2a:
            com.google.android.material.internal.TextDrawableHelper r11 = r9.textDrawableHelper
            android.text.TextPaint r11 = r11.getTextPaint()
            r11.setTextAlign(r0)
            com.google.android.material.internal.TextDrawableHelper r11 = r9.textDrawableHelper
            java.lang.CharSequence r0 = r9.getText()
            java.lang.String r0 = r0.toString()
            float r11 = r11.getTextWidth(r0)
            int r11 = java.lang.Math.round(r11)
            android.graphics.RectF r0 = r9.rectF
            float r0 = r0.width()
            int r0 = java.lang.Math.round(r0)
            r1 = 0
            if (r11 <= r0) goto L54
            r11 = 1
            goto L55
        L54:
            r11 = r1
        L55:
            if (r11 == 0) goto L60
            int r1 = r10.save()
            android.graphics.RectF r0 = r9.rectF
            r10.clipRect(r0)
        L60:
            java.lang.CharSequence r0 = r9.text
            if (r11 == 0) goto L7a
            android.text.TextUtils$TruncateAt r2 = r9.truncateAt
            if (r2 == 0) goto L7a
            com.google.android.material.internal.TextDrawableHelper r2 = r9.textDrawableHelper
            android.text.TextPaint r2 = r2.getTextPaint()
            android.graphics.RectF r3 = r9.rectF
            float r3 = r3.width()
            android.text.TextUtils$TruncateAt r4 = r9.truncateAt
            java.lang.CharSequence r0 = android.text.TextUtils.ellipsize(r0, r2, r3, r4)
        L7a:
            r3 = r0
            r4 = 0
            int r5 = r3.length()
            android.graphics.PointF r0 = r9.pointF
            float r6 = r0.x
            android.graphics.PointF r0 = r9.pointF
            float r7 = r0.y
            com.google.android.material.internal.TextDrawableHelper r0 = r9.textDrawableHelper
            android.text.TextPaint r8 = r0.getTextPaint()
            r2 = r10
            r2.drawText(r3, r4, r5, r6, r7, r8)
            if (r11 == 0) goto L97
            r10.restoreToCount(r1)
        L97:
            return
    }

    private float getCurrentChipIconHeight() {
            r3 = this;
            boolean r0 = r3.currentChecked
            if (r0 == 0) goto L7
            android.graphics.drawable.Drawable r0 = r3.checkedIcon
            goto L9
        L7:
            android.graphics.drawable.Drawable r0 = r3.chipIcon
        L9:
            float r1 = r3.chipIconSize
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L2f
            if (r0 == 0) goto L2f
            android.content.Context r1 = r3.context
            r2 = 24
            float r1 = com.google.android.material.internal.ViewUtils.dpToPx(r1, r2)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r2 = r0.getIntrinsicHeight()
            float r2 = (float) r2
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 > 0) goto L2f
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            return r0
        L2f:
            return r1
    }

    private float getCurrentChipIconWidth() {
            r3 = this;
            boolean r0 = r3.currentChecked
            if (r0 == 0) goto L7
            android.graphics.drawable.Drawable r0 = r3.checkedIcon
            goto L9
        L7:
            android.graphics.drawable.Drawable r0 = r3.chipIcon
        L9:
            float r1 = r3.chipIconSize
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L18
            if (r0 == 0) goto L18
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            return r0
        L18:
            return r1
    }

    private android.graphics.ColorFilter getTintColorFilter() {
            r1 = this;
            android.graphics.ColorFilter r0 = r1.colorFilter
            if (r0 == 0) goto L5
            goto L7
        L5:
            android.graphics.PorterDuffColorFilter r0 = r1.tintFilter
        L7:
            return r0
    }

    private static boolean hasState(int[] r4, int r5) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length
            r2 = r0
        L6:
            if (r2 >= r1) goto L11
            r3 = r4[r2]
            if (r3 != r5) goto Le
            r4 = 1
            return r4
        Le:
            int r2 = r2 + 1
            goto L6
        L11:
            return r0
    }

    private static boolean isStateful(android.content.res.ColorStateList r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private static boolean isStateful(android.graphics.drawable.Drawable r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private static boolean isStateful(com.google.android.material.resources.TextAppearance r1) {
            if (r1 == 0) goto L10
            android.content.res.ColorStateList r0 = r1.textColor
            if (r0 == 0) goto L10
            android.content.res.ColorStateList r1 = r1.textColor
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    private void loadFromAttributes(android.util.AttributeSet r8, int r9, int r10) {
            r7 = this;
            android.content.Context r0 = r7.context
            int[] r2 = com.google.android.material.C0479R.styleable.Chip
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r8
            r3 = r9
            r4 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.C0479R.styleable.Chip_shapeAppearance
            boolean r10 = r9.hasValue(r10)
            r7.isShapeThemingEnabled = r10
            android.content.Context r10 = r7.context
            int r0 = com.google.android.material.C0479R.styleable.Chip_chipSurfaceColor
            android.content.res.ColorStateList r10 = com.google.android.material.resources.MaterialResources.getColorStateList(r10, r9, r0)
            r7.setChipSurfaceColor(r10)
            android.content.Context r10 = r7.context
            int r0 = com.google.android.material.C0479R.styleable.Chip_chipBackgroundColor
            android.content.res.ColorStateList r10 = com.google.android.material.resources.MaterialResources.getColorStateList(r10, r9, r0)
            r7.setChipBackgroundColor(r10)
            int r10 = com.google.android.material.C0479R.styleable.Chip_chipMinHeight
            r0 = 0
            float r10 = r9.getDimension(r10, r0)
            r7.setChipMinHeight(r10)
            int r10 = com.google.android.material.C0479R.styleable.Chip_chipCornerRadius
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L47
            int r10 = com.google.android.material.C0479R.styleable.Chip_chipCornerRadius
            float r10 = r9.getDimension(r10, r0)
            r7.setChipCornerRadius(r10)
        L47:
            android.content.Context r10 = r7.context
            int r1 = com.google.android.material.C0479R.styleable.Chip_chipStrokeColor
            android.content.res.ColorStateList r10 = com.google.android.material.resources.MaterialResources.getColorStateList(r10, r9, r1)
            r7.setChipStrokeColor(r10)
            int r10 = com.google.android.material.C0479R.styleable.Chip_chipStrokeWidth
            float r10 = r9.getDimension(r10, r0)
            r7.setChipStrokeWidth(r10)
            android.content.Context r10 = r7.context
            int r1 = com.google.android.material.C0479R.styleable.Chip_rippleColor
            android.content.res.ColorStateList r10 = com.google.android.material.resources.MaterialResources.getColorStateList(r10, r9, r1)
            r7.setRippleColor(r10)
            int r10 = com.google.android.material.C0479R.styleable.Chip_android_text
            java.lang.CharSequence r10 = r9.getText(r10)
            r7.setText(r10)
            android.content.Context r10 = r7.context
            int r1 = com.google.android.material.C0479R.styleable.Chip_android_textAppearance
            com.google.android.material.resources.TextAppearance r10 = com.google.android.material.resources.MaterialResources.getTextAppearance(r10, r9, r1)
            int r1 = com.google.android.material.C0479R.styleable.Chip_android_textSize
            float r2 = r10.textSize
            float r1 = r9.getDimension(r1, r2)
            r10.textSize = r1
            r7.setTextAppearance(r10)
            int r10 = com.google.android.material.C0479R.styleable.Chip_android_ellipsize
            int r10 = r9.getInt(r10, r6)
            r1 = 1
            if (r10 == r1) goto La0
            r1 = 2
            if (r10 == r1) goto L9a
            r1 = 3
            if (r10 == r1) goto L94
            goto La5
        L94:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
            r7.setEllipsize(r10)
            goto La5
        L9a:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.MIDDLE
            r7.setEllipsize(r10)
            goto La5
        La0:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.START
            r7.setEllipsize(r10)
        La5:
            int r10 = com.google.android.material.C0479R.styleable.Chip_chipIconVisible
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setChipIconVisible(r10)
            java.lang.String r10 = "http://schemas.android.com/apk/res-auto"
            if (r8 == 0) goto Lcb
            java.lang.String r1 = "chipIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto Lcb
            java.lang.String r1 = "chipIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto Lcb
            int r1 = com.google.android.material.C0479R.styleable.Chip_chipIconEnabled
            boolean r1 = r9.getBoolean(r1, r6)
            r7.setChipIconVisible(r1)
        Lcb:
            android.content.Context r1 = r7.context
            int r2 = com.google.android.material.C0479R.styleable.Chip_chipIcon
            android.graphics.drawable.Drawable r1 = com.google.android.material.resources.MaterialResources.getDrawable(r1, r9, r2)
            r7.setChipIcon(r1)
            int r1 = com.google.android.material.C0479R.styleable.Chip_chipIconTint
            boolean r1 = r9.hasValue(r1)
            if (r1 == 0) goto Le9
            android.content.Context r1 = r7.context
            int r2 = com.google.android.material.C0479R.styleable.Chip_chipIconTint
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r1, r9, r2)
            r7.setChipIconTint(r1)
        Le9:
            int r1 = com.google.android.material.C0479R.styleable.Chip_chipIconSize
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r9.getDimension(r1, r2)
            r7.setChipIconSize(r1)
            int r1 = com.google.android.material.C0479R.styleable.Chip_closeIconVisible
            boolean r1 = r9.getBoolean(r1, r6)
            r7.setCloseIconVisible(r1)
            if (r8 == 0) goto L118
            java.lang.String r1 = "closeIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L118
            java.lang.String r1 = "closeIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L118
            int r1 = com.google.android.material.C0479R.styleable.Chip_closeIconEnabled
            boolean r1 = r9.getBoolean(r1, r6)
            r7.setCloseIconVisible(r1)
        L118:
            android.content.Context r1 = r7.context
            int r2 = com.google.android.material.C0479R.styleable.Chip_closeIcon
            android.graphics.drawable.Drawable r1 = com.google.android.material.resources.MaterialResources.getDrawable(r1, r9, r2)
            r7.setCloseIcon(r1)
            android.content.Context r1 = r7.context
            int r2 = com.google.android.material.C0479R.styleable.Chip_closeIconTint
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r1, r9, r2)
            r7.setCloseIconTint(r1)
            int r1 = com.google.android.material.C0479R.styleable.Chip_closeIconSize
            float r1 = r9.getDimension(r1, r0)
            r7.setCloseIconSize(r1)
            int r1 = com.google.android.material.C0479R.styleable.Chip_android_checkable
            boolean r1 = r9.getBoolean(r1, r6)
            r7.setCheckable(r1)
            int r1 = com.google.android.material.C0479R.styleable.Chip_checkedIconVisible
            boolean r1 = r9.getBoolean(r1, r6)
            r7.setCheckedIconVisible(r1)
            if (r8 == 0) goto L164
            java.lang.String r1 = "checkedIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L164
            java.lang.String r1 = "checkedIconVisible"
            java.lang.String r8 = r8.getAttributeValue(r10, r1)
            if (r8 != 0) goto L164
            int r8 = com.google.android.material.C0479R.styleable.Chip_checkedIconEnabled
            boolean r8 = r9.getBoolean(r8, r6)
            r7.setCheckedIconVisible(r8)
        L164:
            android.content.Context r8 = r7.context
            int r10 = com.google.android.material.C0479R.styleable.Chip_checkedIcon
            android.graphics.drawable.Drawable r8 = com.google.android.material.resources.MaterialResources.getDrawable(r8, r9, r10)
            r7.setCheckedIcon(r8)
            int r8 = com.google.android.material.C0479R.styleable.Chip_checkedIconTint
            boolean r8 = r9.hasValue(r8)
            if (r8 == 0) goto L182
            android.content.Context r8 = r7.context
            int r10 = com.google.android.material.C0479R.styleable.Chip_checkedIconTint
            android.content.res.ColorStateList r8 = com.google.android.material.resources.MaterialResources.getColorStateList(r8, r9, r10)
            r7.setCheckedIconTint(r8)
        L182:
            android.content.Context r8 = r7.context
            int r10 = com.google.android.material.C0479R.styleable.Chip_showMotionSpec
            com.google.android.material.animation.MotionSpec r8 = com.google.android.material.animation.MotionSpec.createFromAttribute(r8, r9, r10)
            r7.setShowMotionSpec(r8)
            android.content.Context r8 = r7.context
            int r10 = com.google.android.material.C0479R.styleable.Chip_hideMotionSpec
            com.google.android.material.animation.MotionSpec r8 = com.google.android.material.animation.MotionSpec.createFromAttribute(r8, r9, r10)
            r7.setHideMotionSpec(r8)
            int r8 = com.google.android.material.C0479R.styleable.Chip_chipStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.setChipStartPadding(r8)
            int r8 = com.google.android.material.C0479R.styleable.Chip_iconStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.setIconStartPadding(r8)
            int r8 = com.google.android.material.C0479R.styleable.Chip_iconEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.setIconEndPadding(r8)
            int r8 = com.google.android.material.C0479R.styleable.Chip_textStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.setTextStartPadding(r8)
            int r8 = com.google.android.material.C0479R.styleable.Chip_textEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.setTextEndPadding(r8)
            int r8 = com.google.android.material.C0479R.styleable.Chip_closeIconStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.setCloseIconStartPadding(r8)
            int r8 = com.google.android.material.C0479R.styleable.Chip_closeIconEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.setCloseIconEndPadding(r8)
            int r8 = com.google.android.material.C0479R.styleable.Chip_chipEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.setChipEndPadding(r8)
            int r8 = com.google.android.material.C0479R.styleable.Chip_android_maxWidth
            r10 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r9.getDimensionPixelSize(r8, r10)
            r7.setMaxWidth(r8)
            r9.recycle()
            return
    }

    private boolean onStateChange(int[] r7, int[] r8) {
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.chipSurfaceColor
            r2 = 0
            if (r1 == 0) goto L10
            int r3 = r6.currentChipSurfaceColor
            int r1 = r1.getColorForState(r7, r3)
            goto L11
        L10:
            r1 = r2
        L11:
            int r1 = r6.compositeElevationOverlayIfNeeded(r1)
            int r3 = r6.currentChipSurfaceColor
            r4 = 1
            if (r3 == r1) goto L1d
            r6.currentChipSurfaceColor = r1
            r0 = r4
        L1d:
            android.content.res.ColorStateList r3 = r6.chipBackgroundColor
            if (r3 == 0) goto L28
            int r5 = r6.currentChipBackgroundColor
            int r3 = r3.getColorForState(r7, r5)
            goto L29
        L28:
            r3 = r2
        L29:
            int r3 = r6.compositeElevationOverlayIfNeeded(r3)
            int r5 = r6.currentChipBackgroundColor
            if (r5 == r3) goto L34
            r6.currentChipBackgroundColor = r3
            r0 = r4
        L34:
            int r1 = com.google.android.material.color.MaterialColors.layer(r1, r3)
            int r3 = r6.currentCompositeSurfaceBackgroundColor
            if (r3 == r1) goto L3e
            r3 = r4
            goto L3f
        L3e:
            r3 = r2
        L3f:
            android.content.res.ColorStateList r5 = r6.getFillColor()
            if (r5 != 0) goto L47
            r5 = r4
            goto L48
        L47:
            r5 = r2
        L48:
            r3 = r3 | r5
            if (r3 == 0) goto L55
            r6.currentCompositeSurfaceBackgroundColor = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r6.setFillColor(r0)
            r0 = r4
        L55:
            android.content.res.ColorStateList r1 = r6.chipStrokeColor
            if (r1 == 0) goto L60
            int r3 = r6.currentChipStrokeColor
            int r1 = r1.getColorForState(r7, r3)
            goto L61
        L60:
            r1 = r2
        L61:
            int r3 = r6.currentChipStrokeColor
            if (r3 == r1) goto L68
            r6.currentChipStrokeColor = r1
            r0 = r4
        L68:
            android.content.res.ColorStateList r1 = r6.compatRippleColor
            if (r1 == 0) goto L7b
            boolean r1 = com.google.android.material.ripple.RippleUtils.shouldDrawRippleCompat(r7)
            if (r1 == 0) goto L7b
            android.content.res.ColorStateList r1 = r6.compatRippleColor
            int r3 = r6.currentCompatRippleColor
            int r1 = r1.getColorForState(r7, r3)
            goto L7c
        L7b:
            r1 = r2
        L7c:
            int r3 = r6.currentCompatRippleColor
            if (r3 == r1) goto L87
            r6.currentCompatRippleColor = r1
            boolean r1 = r6.useCompatRipple
            if (r1 == 0) goto L87
            r0 = r4
        L87:
            com.google.android.material.internal.TextDrawableHelper r1 = r6.textDrawableHelper
            com.google.android.material.resources.TextAppearance r1 = r1.getTextAppearance()
            if (r1 == 0) goto La8
            com.google.android.material.internal.TextDrawableHelper r1 = r6.textDrawableHelper
            com.google.android.material.resources.TextAppearance r1 = r1.getTextAppearance()
            android.content.res.ColorStateList r1 = r1.textColor
            if (r1 == 0) goto La8
            com.google.android.material.internal.TextDrawableHelper r1 = r6.textDrawableHelper
            com.google.android.material.resources.TextAppearance r1 = r1.getTextAppearance()
            android.content.res.ColorStateList r1 = r1.textColor
            int r3 = r6.currentTextColor
            int r1 = r1.getColorForState(r7, r3)
            goto La9
        La8:
            r1 = r2
        La9:
            int r3 = r6.currentTextColor
            if (r3 == r1) goto Lb0
            r6.currentTextColor = r1
            r0 = r4
        Lb0:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = hasState(r1, r3)
            if (r1 == 0) goto Lc3
            boolean r1 = r6.checkable
            if (r1 == 0) goto Lc3
            r1 = r4
            goto Lc4
        Lc3:
            r1 = r2
        Lc4:
            boolean r3 = r6.currentChecked
            if (r3 == r1) goto Le0
            android.graphics.drawable.Drawable r3 = r6.checkedIcon
            if (r3 == 0) goto Le0
            float r0 = r6.calculateChipIconWidth()
            r6.currentChecked = r1
            float r1 = r6.calculateChipIconWidth()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Ldd
            r0 = r4
            r1 = r0
            goto Le1
        Ldd:
            r1 = r2
            r0 = r4
            goto Le1
        Le0:
            r1 = r2
        Le1:
            android.content.res.ColorStateList r3 = r6.tint
            if (r3 == 0) goto Lec
            int r5 = r6.currentTint
            int r3 = r3.getColorForState(r7, r5)
            goto Led
        Lec:
            r3 = r2
        Led:
            int r5 = r6.currentTint
            if (r5 == r3) goto Lfe
            r6.currentTint = r3
            android.content.res.ColorStateList r0 = r6.tint
            android.graphics.PorterDuff$Mode r3 = r6.tintMode
            android.graphics.PorterDuffColorFilter r0 = com.google.android.material.drawable.DrawableUtils.updateTintFilter(r6, r0, r3)
            r6.tintFilter = r0
            goto Lff
        Lfe:
            r4 = r0
        Lff:
            android.graphics.drawable.Drawable r0 = r6.chipIcon
            boolean r0 = isStateful(r0)
            if (r0 == 0) goto L10e
            android.graphics.drawable.Drawable r0 = r6.chipIcon
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L10e:
            android.graphics.drawable.Drawable r0 = r6.checkedIcon
            boolean r0 = isStateful(r0)
            if (r0 == 0) goto L11d
            android.graphics.drawable.Drawable r0 = r6.checkedIcon
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L11d:
            android.graphics.drawable.Drawable r0 = r6.closeIcon
            boolean r0 = isStateful(r0)
            if (r0 == 0) goto L13a
            int r0 = r7.length
            int r3 = r8.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r3)
            int r7 = r7.length
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r2, r0, r7, r3)
            android.graphics.drawable.Drawable r7 = r6.closeIcon
            boolean r7 = r7.setState(r0)
            r4 = r4 | r7
        L13a:
            boolean r7 = com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE
            if (r7 == 0) goto L14d
            android.graphics.drawable.Drawable r7 = r6.closeIconRipple
            boolean r7 = isStateful(r7)
            if (r7 == 0) goto L14d
            android.graphics.drawable.Drawable r7 = r6.closeIconRipple
            boolean r7 = r7.setState(r8)
            r4 = r4 | r7
        L14d:
            if (r4 == 0) goto L152
            r6.invalidateSelf()
        L152:
            if (r1 == 0) goto L157
            r6.onSizeChange()
        L157:
            return r4
    }

    private void setChipSurfaceColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.chipSurfaceColor
            if (r0 == r2) goto Ld
            r1.chipSurfaceColor = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        Ld:
            return
    }

    private boolean showsCheckedIcon() {
            r1 = this;
            boolean r0 = r1.checkedIconVisible
            if (r0 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r1.checkedIcon
            if (r0 == 0) goto Le
            boolean r0 = r1.currentChecked
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private boolean showsChipIcon() {
            r1 = this;
            boolean r0 = r1.chipIconVisible
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.chipIcon
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private boolean showsCloseIcon() {
            r1 = this;
            boolean r0 = r1.closeIconVisible
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.closeIcon
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private void unapplyChildDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L6
            r0 = 0
            r2.setCallback(r0)
        L6:
            return
    }

    private void updateCompatRippleColor() {
            r1 = this;
            boolean r0 = r1.useCompatRipple
            if (r0 == 0) goto Lb
            android.content.res.ColorStateList r0 = r1.rippleColor
            android.content.res.ColorStateList r0 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r0)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1.compatRippleColor = r0
            return
    }

    private void updateFrameworkCloseIconRipple() {
            r4 = this;
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r1 = r4.getRippleColor()
            android.content.res.ColorStateList r1 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r1)
            android.graphics.drawable.Drawable r2 = r4.closeIcon
            android.graphics.drawable.ShapeDrawable r3 = com.google.android.material.chip.ChipDrawable.closeIconRippleMask
            r0.<init>(r1, r2, r3)
            r4.closeIconRipple = r0
            return
    }

    float calculateChipIconWidth() {
            r2 = this;
            boolean r0 = r2.showsChipIcon()
            if (r0 != 0) goto Lf
            boolean r0 = r2.showsCheckedIcon()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            float r0 = r2.iconStartPadding
            float r1 = r2.getCurrentChipIconWidth()
            float r0 = r0 + r1
            float r1 = r2.iconEndPadding
            float r0 = r0 + r1
            return r0
    }

    float calculateCloseIconWidth() {
            r2 = this;
            boolean r0 = r2.showsCloseIcon()
            if (r0 == 0) goto Lf
            float r0 = r2.closeIconStartPadding
            float r1 = r2.closeIconSize
            float r0 = r0 + r1
            float r1 = r2.closeIconEndPadding
            float r0 = r0 + r1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    android.graphics.Paint.Align calculateTextOriginAndAlignment(android.graphics.Rect r3, android.graphics.PointF r4) {
            r2 = this;
            r0 = 0
            r4.set(r0, r0)
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.LEFT
            java.lang.CharSequence r1 = r2.text
            if (r1 == 0) goto L37
            float r0 = r2.chipStartPadding
            float r1 = r2.calculateChipIconWidth()
            float r0 = r0 + r1
            float r1 = r2.textStartPadding
            float r0 = r0 + r1
            int r1 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r2)
            if (r1 != 0) goto L23
            int r1 = r3.left
            float r1 = (float) r1
            float r1 = r1 + r0
            r4.x = r1
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.LEFT
            goto L2b
        L23:
            int r1 = r3.right
            float r1 = (float) r1
            float r1 = r1 - r0
            r4.x = r1
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.RIGHT
        L2b:
            int r3 = r3.centerY()
            float r3 = (float) r3
            float r1 = r2.calculateTextCenterFromBaseline()
            float r3 = r3 - r1
            r4.y = r3
        L37:
            return r0
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r10) {
            r9 = this;
            android.graphics.Rect r0 = r9.getBounds()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L59
            int r1 = r9.getAlpha()
            if (r1 != 0) goto L11
            goto L59
        L11:
            int r1 = r9.alpha
            r2 = 255(0xff, float:3.57E-43)
            if (r1 >= r2) goto L2b
            int r1 = r0.left
            float r4 = (float) r1
            int r1 = r0.top
            float r5 = (float) r1
            int r1 = r0.right
            float r6 = (float) r1
            int r1 = r0.bottom
            float r7 = (float) r1
            int r8 = r9.alpha
            r3 = r10
            int r1 = com.google.android.material.canvas.CanvasCompat.saveLayerAlpha(r3, r4, r5, r6, r7, r8)
            goto L2c
        L2b:
            r1 = 0
        L2c:
            r9.drawChipSurface(r10, r0)
            r9.drawChipBackground(r10, r0)
            boolean r3 = r9.isShapeThemingEnabled
            if (r3 == 0) goto L39
            super.draw(r10)
        L39:
            r9.drawChipStroke(r10, r0)
            r9.drawCompatRipple(r10, r0)
            r9.drawChipIcon(r10, r0)
            r9.drawCheckedIcon(r10, r0)
            boolean r3 = r9.shouldDrawText
            if (r3 == 0) goto L4c
            r9.drawText(r10, r0)
        L4c:
            r9.drawCloseIcon(r10, r0)
            r9.drawDebug(r10, r0)
            int r0 = r9.alpha
            if (r0 >= r2) goto L59
            r10.restoreToCount(r1)
        L59:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            int r0 = r1.alpha
            return r0
    }

    public android.graphics.drawable.Drawable getCheckedIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.checkedIcon
            return r0
    }

    public android.content.res.ColorStateList getCheckedIconTint() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.checkedIconTint
            return r0
    }

    public android.content.res.ColorStateList getChipBackgroundColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.chipBackgroundColor
            return r0
    }

    public float getChipCornerRadius() {
            r1 = this;
            boolean r0 = r1.isShapeThemingEnabled
            if (r0 == 0) goto L9
            float r0 = r1.getTopLeftCornerResolvedSize()
            goto Lb
        L9:
            float r0 = r1.chipCornerRadius
        Lb:
            return r0
    }

    public float getChipEndPadding() {
            r1 = this;
            float r0 = r1.chipEndPadding
            return r0
    }

    public android.graphics.drawable.Drawable getChipIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.chipIcon
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.unwrap(r0)
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public float getChipIconSize() {
            r1 = this;
            float r0 = r1.chipIconSize
            return r0
    }

    public android.content.res.ColorStateList getChipIconTint() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.chipIconTint
            return r0
    }

    public float getChipMinHeight() {
            r1 = this;
            float r0 = r1.chipMinHeight
            return r0
    }

    public float getChipStartPadding() {
            r1 = this;
            float r0 = r1.chipStartPadding
            return r0
    }

    public android.content.res.ColorStateList getChipStrokeColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.chipStrokeColor
            return r0
    }

    public float getChipStrokeWidth() {
            r1 = this;
            float r0 = r1.chipStrokeWidth
            return r0
    }

    public void getChipTouchBounds(android.graphics.RectF r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.getBounds()
            r1.calculateChipTouchBounds(r0, r2)
            return
    }

    public android.graphics.drawable.Drawable getCloseIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.closeIcon
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.unwrap(r0)
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public java.lang.CharSequence getCloseIconContentDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.closeIconContentDescription
            return r0
    }

    public float getCloseIconEndPadding() {
            r1 = this;
            float r0 = r1.closeIconEndPadding
            return r0
    }

    public float getCloseIconSize() {
            r1 = this;
            float r0 = r1.closeIconSize
            return r0
    }

    public float getCloseIconStartPadding() {
            r1 = this;
            float r0 = r1.closeIconStartPadding
            return r0
    }

    public int[] getCloseIconState() {
            r1 = this;
            int[] r0 = r1.closeIconStateSet
            return r0
    }

    public android.content.res.ColorStateList getCloseIconTint() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.closeIconTint
            return r0
    }

    public void getCloseIconTouchBounds(android.graphics.RectF r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.getBounds()
            r1.calculateCloseIconTouchBounds(r0, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.ColorFilter r0 = r1.colorFilter
            return r0
    }

    public android.text.TextUtils.TruncateAt getEllipsize() {
            r1 = this;
            android.text.TextUtils$TruncateAt r0 = r1.truncateAt
            return r0
    }

    public com.google.android.material.animation.MotionSpec getHideMotionSpec() {
            r1 = this;
            com.google.android.material.animation.MotionSpec r0 = r1.hideMotionSpec
            return r0
    }

    public float getIconEndPadding() {
            r1 = this;
            float r0 = r1.iconEndPadding
            return r0
    }

    public float getIconStartPadding() {
            r1 = this;
            float r0 = r1.iconStartPadding
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            float r0 = r1.chipMinHeight
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r3 = this;
            float r0 = r3.chipStartPadding
            float r1 = r3.calculateChipIconWidth()
            float r0 = r0 + r1
            float r1 = r3.textStartPadding
            float r0 = r0 + r1
            com.google.android.material.internal.TextDrawableHelper r1 = r3.textDrawableHelper
            java.lang.CharSequence r2 = r3.getText()
            java.lang.String r2 = r2.toString()
            float r1 = r1.getTextWidth(r2)
            float r0 = r0 + r1
            float r1 = r3.textEndPadding
            float r0 = r0 + r1
            float r1 = r3.calculateCloseIconWidth()
            float r0 = r0 + r1
            float r1 = r3.chipEndPadding
            float r0 = r0 + r1
            int r0 = java.lang.Math.round(r0)
            int r1 = r3.maxWidth
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.maxWidth
            return r0
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r9) {
            r8 = this;
            boolean r0 = r8.isShapeThemingEnabled
            if (r0 == 0) goto L8
            super.getOutline(r9)
            return
        L8:
            android.graphics.Rect r0 = r8.getBounds()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L18
            float r1 = r8.chipCornerRadius
            r9.setRoundRect(r0, r1)
            goto L28
        L18:
            r3 = 0
            r4 = 0
            int r5 = r8.getIntrinsicWidth()
            int r6 = r8.getIntrinsicHeight()
            float r7 = r8.chipCornerRadius
            r2 = r9
            r2.setRoundRect(r3, r4, r5, r6, r7)
        L28:
            int r0 = r8.getAlpha()
            float r0 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r1
            r9.setAlpha(r0)
            return
    }

    public android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.rippleColor
            return r0
    }

    public com.google.android.material.animation.MotionSpec getShowMotionSpec() {
            r1 = this;
            com.google.android.material.animation.MotionSpec r0 = r1.showMotionSpec
            return r0
    }

    public java.lang.CharSequence getText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.text
            return r0
    }

    public com.google.android.material.resources.TextAppearance getTextAppearance() {
            r1 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r1.textDrawableHelper
            com.google.android.material.resources.TextAppearance r0 = r0.getTextAppearance()
            return r0
    }

    public float getTextEndPadding() {
            r1 = this;
            float r0 = r1.textEndPadding
            return r0
    }

    public float getTextStartPadding() {
            r1 = this;
            float r0 = r1.textStartPadding
            return r0
    }

    public boolean getUseCompatRipple() {
            r1 = this;
            boolean r0 = r1.useCompatRipple
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.invalidateDrawable(r0)
        L9:
            return
    }

    public boolean isCheckable() {
            r1 = this;
            boolean r0 = r1.checkable
            return r0
    }

    @java.lang.Deprecated
    public boolean isCheckedIconEnabled() {
            r1 = this;
            boolean r0 = r1.isCheckedIconVisible()
            return r0
    }

    public boolean isCheckedIconVisible() {
            r1 = this;
            boolean r0 = r1.checkedIconVisible
            return r0
    }

    @java.lang.Deprecated
    public boolean isChipIconEnabled() {
            r1 = this;
            boolean r0 = r1.isChipIconVisible()
            return r0
    }

    public boolean isChipIconVisible() {
            r1 = this;
            boolean r0 = r1.chipIconVisible
            return r0
    }

    @java.lang.Deprecated
    public boolean isCloseIconEnabled() {
            r1 = this;
            boolean r0 = r1.isCloseIconVisible()
            return r0
    }

    public boolean isCloseIconStateful() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.closeIcon
            boolean r0 = isStateful(r0)
            return r0
    }

    public boolean isCloseIconVisible() {
            r1 = this;
            boolean r0 = r1.closeIconVisible
            return r0
    }

    boolean isShapeThemingEnabled() {
            r1 = this;
            boolean r0 = r1.isShapeThemingEnabled
            return r0
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.chipSurfaceColor
            boolean r0 = isStateful(r0)
            if (r0 != 0) goto L51
            android.content.res.ColorStateList r0 = r1.chipBackgroundColor
            boolean r0 = isStateful(r0)
            if (r0 != 0) goto L51
            android.content.res.ColorStateList r0 = r1.chipStrokeColor
            boolean r0 = isStateful(r0)
            if (r0 != 0) goto L51
            boolean r0 = r1.useCompatRipple
            if (r0 == 0) goto L24
            android.content.res.ColorStateList r0 = r1.compatRippleColor
            boolean r0 = isStateful(r0)
            if (r0 != 0) goto L51
        L24:
            com.google.android.material.internal.TextDrawableHelper r0 = r1.textDrawableHelper
            com.google.android.material.resources.TextAppearance r0 = r0.getTextAppearance()
            boolean r0 = isStateful(r0)
            if (r0 != 0) goto L51
            boolean r0 = r1.canShowCheckedIcon()
            if (r0 != 0) goto L51
            android.graphics.drawable.Drawable r0 = r1.chipIcon
            boolean r0 = isStateful(r0)
            if (r0 != 0) goto L51
            android.graphics.drawable.Drawable r0 = r1.checkedIcon
            boolean r0 = isStateful(r0)
            if (r0 != 0) goto L51
            android.content.res.ColorStateList r0 = r1.tint
            boolean r0 = isStateful(r0)
            if (r0 == 0) goto L4f
            goto L51
        L4f:
            r0 = 0
            goto L52
        L51:
            r0 = 1
        L52:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int r3) {
            r2 = this;
            boolean r0 = super.onLayoutDirectionChanged(r3)
            boolean r1 = r2.showsChipIcon()
            if (r1 == 0) goto L11
            android.graphics.drawable.Drawable r1 = r2.chipIcon
            boolean r1 = androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r1, r3)
            r0 = r0 | r1
        L11:
            boolean r1 = r2.showsCheckedIcon()
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.checkedIcon
            boolean r1 = androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r1, r3)
            r0 = r0 | r1
        L1e:
            boolean r1 = r2.showsCloseIcon()
            if (r1 == 0) goto L2b
            android.graphics.drawable.Drawable r1 = r2.closeIcon
            boolean r3 = androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r1, r3)
            r0 = r0 | r3
        L2b:
            if (r0 == 0) goto L30
            r2.invalidateSelf()
        L30:
            r3 = 1
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r3) {
            r2 = this;
            boolean r0 = super.onLevelChange(r3)
            boolean r1 = r2.showsChipIcon()
            if (r1 == 0) goto L11
            android.graphics.drawable.Drawable r1 = r2.chipIcon
            boolean r1 = r1.setLevel(r3)
            r0 = r0 | r1
        L11:
            boolean r1 = r2.showsCheckedIcon()
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.checkedIcon
            boolean r1 = r1.setLevel(r3)
            r0 = r0 | r1
        L1e:
            boolean r1 = r2.showsCloseIcon()
            if (r1 == 0) goto L2b
            android.graphics.drawable.Drawable r1 = r2.closeIcon
            boolean r3 = r1.setLevel(r3)
            r0 = r0 | r3
        L2b:
            if (r0 == 0) goto L30
            r2.invalidateSelf()
        L30:
            return r0
    }

    protected void onSizeChange() {
            r1 = this;
            java.lang.ref.WeakReference<com.google.android.material.chip.ChipDrawable$Delegate> r0 = r1.delegate
            java.lang.Object r0 = r0.get()
            com.google.android.material.chip.ChipDrawable$Delegate r0 = (com.google.android.material.chip.ChipDrawable.Delegate) r0
            if (r0 == 0) goto Ld
            r0.onChipDrawableSizeChange()
        Ld:
            return
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] r2) {
            r1 = this;
            boolean r0 = r1.isShapeThemingEnabled
            if (r0 == 0) goto L7
            super.onStateChange(r2)
        L7:
            int[] r0 = r1.getCloseIconState()
            boolean r2 = r1.onStateChange(r2, r0)
            return r2
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
            r0 = this;
            r0.onSizeChange()
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.scheduleDrawable(r0, r2, r3)
        L9:
            return
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            int r0 = r1.alpha
            if (r0 == r2) goto L9
            r1.alpha = r2
            r1.invalidateSelf()
        L9:
            return
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            boolean r0 = r1.checkable
            if (r0 == r2) goto L21
            r1.checkable = r2
            float r0 = r1.calculateChipIconWidth()
            if (r2 != 0) goto L13
            boolean r2 = r1.currentChecked
            if (r2 == 0) goto L13
            r2 = 0
            r1.currentChecked = r2
        L13:
            float r2 = r1.calculateChipIconWidth()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            r1.onSizeChange()
        L21:
            return
    }

    public void setCheckableResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setCheckable(r2)
            return
    }

    public void setCheckedIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.checkedIcon
            if (r0 == r3) goto L22
            float r0 = r2.calculateChipIconWidth()
            r2.checkedIcon = r3
            float r3 = r2.calculateChipIconWidth()
            android.graphics.drawable.Drawable r1 = r2.checkedIcon
            r2.unapplyChildDrawable(r1)
            android.graphics.drawable.Drawable r1 = r2.checkedIcon
            r2.applyChildDrawable(r1)
            r2.invalidateSelf()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
            r2.onSizeChange()
        L22:
            return
    }

    @java.lang.Deprecated
    public void setCheckedIconEnabled(boolean r1) {
            r0 = this;
            r0.setCheckedIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setCheckedIconEnabledResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setCheckedIconVisible(r2)
            return
    }

    public void setCheckedIconResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setCheckedIcon(r2)
            return
    }

    public void setCheckedIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.checkedIconTint
            if (r0 == r2) goto L18
            r1.checkedIconTint = r2
            boolean r0 = r1.canShowCheckedIcon()
            if (r0 == 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.checkedIcon
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
        L11:
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L18:
            return
    }

    public void setCheckedIconTintResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setCheckedIconTint(r2)
            return
    }

    public void setCheckedIconVisible(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setCheckedIconVisible(r2)
            return
    }

    public void setCheckedIconVisible(boolean r2) {
            r1 = this;
            boolean r0 = r1.checkedIconVisible
            if (r0 == r2) goto L28
            boolean r0 = r1.showsCheckedIcon()
            r1.checkedIconVisible = r2
            boolean r2 = r1.showsCheckedIcon()
            if (r0 == r2) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L28
            if (r2 == 0) goto L1d
            android.graphics.drawable.Drawable r2 = r1.checkedIcon
            r1.applyChildDrawable(r2)
            goto L22
        L1d:
            android.graphics.drawable.Drawable r2 = r1.checkedIcon
            r1.unapplyChildDrawable(r2)
        L22:
            r1.invalidateSelf()
            r1.onSizeChange()
        L28:
            return
    }

    public void setChipBackgroundColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.chipBackgroundColor
            if (r0 == r2) goto Ld
            r1.chipBackgroundColor = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        Ld:
            return
    }

    public void setChipBackgroundColorResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setChipBackgroundColor(r2)
            return
    }

    @java.lang.Deprecated
    public void setChipCornerRadius(float r2) {
            r1 = this;
            float r0 = r1.chipCornerRadius
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            r1.chipCornerRadius = r2
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.getShapeAppearanceModel()
            com.google.android.material.shape.ShapeAppearanceModel r2 = r0.withCornerSize(r2)
            r1.setShapeAppearanceModel(r2)
        L13:
            return
    }

    @java.lang.Deprecated
    public void setChipCornerRadiusResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.setChipCornerRadius(r2)
            return
    }

    public void setChipEndPadding(float r2) {
            r1 = this;
            float r0 = r1.chipEndPadding
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.chipEndPadding = r2
            r1.invalidateSelf()
            r1.onSizeChange()
        Le:
            return
    }

    public void setChipEndPaddingResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.setChipEndPadding(r2)
            return
    }

    public void setChipIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getChipIcon()
            if (r0 == r3) goto L34
            float r1 = r2.calculateChipIconWidth()
            if (r3 == 0) goto L15
            android.graphics.drawable.Drawable r3 = androidx.core.graphics.drawable.DrawableCompat.wrap(r3)
            android.graphics.drawable.Drawable r3 = r3.mutate()
            goto L16
        L15:
            r3 = 0
        L16:
            r2.chipIcon = r3
            float r3 = r2.calculateChipIconWidth()
            r2.unapplyChildDrawable(r0)
            boolean r0 = r2.showsChipIcon()
            if (r0 == 0) goto L2a
            android.graphics.drawable.Drawable r0 = r2.chipIcon
            r2.applyChildDrawable(r0)
        L2a:
            r2.invalidateSelf()
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            r2.onSizeChange()
        L34:
            return
    }

    @java.lang.Deprecated
    public void setChipIconEnabled(boolean r1) {
            r0 = this;
            r0.setChipIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setChipIconEnabledResource(int r1) {
            r0 = this;
            r0.setChipIconVisible(r1)
            return
    }

    public void setChipIconResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setChipIcon(r2)
            return
    }

    public void setChipIconSize(float r2) {
            r1 = this;
            float r0 = r1.chipIconSize
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            float r0 = r1.calculateChipIconWidth()
            r1.chipIconSize = r2
            float r2 = r1.calculateChipIconWidth()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r1.onSizeChange()
        L1a:
            return
    }

    public void setChipIconSizeResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.setChipIconSize(r2)
            return
    }

    public void setChipIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            r0 = 1
            r1.hasChipIconTint = r0
            android.content.res.ColorStateList r0 = r1.chipIconTint
            if (r0 == r2) goto L1b
            r1.chipIconTint = r2
            boolean r0 = r1.showsChipIcon()
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r1.chipIcon
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
        L14:
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L1b:
            return
    }

    public void setChipIconTintResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setChipIconTint(r2)
            return
    }

    public void setChipIconVisible(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setChipIconVisible(r2)
            return
    }

    public void setChipIconVisible(boolean r2) {
            r1 = this;
            boolean r0 = r1.chipIconVisible
            if (r0 == r2) goto L28
            boolean r0 = r1.showsChipIcon()
            r1.chipIconVisible = r2
            boolean r2 = r1.showsChipIcon()
            if (r0 == r2) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L28
            if (r2 == 0) goto L1d
            android.graphics.drawable.Drawable r2 = r1.chipIcon
            r1.applyChildDrawable(r2)
            goto L22
        L1d:
            android.graphics.drawable.Drawable r2 = r1.chipIcon
            r1.unapplyChildDrawable(r2)
        L22:
            r1.invalidateSelf()
            r1.onSizeChange()
        L28:
            return
    }

    public void setChipMinHeight(float r2) {
            r1 = this;
            float r0 = r1.chipMinHeight
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.chipMinHeight = r2
            r1.invalidateSelf()
            r1.onSizeChange()
        Le:
            return
    }

    public void setChipMinHeightResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.setChipMinHeight(r2)
            return
    }

    public void setChipStartPadding(float r2) {
            r1 = this;
            float r0 = r1.chipStartPadding
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.chipStartPadding = r2
            r1.invalidateSelf()
            r1.onSizeChange()
        Le:
            return
    }

    public void setChipStartPaddingResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.setChipStartPadding(r2)
            return
    }

    public void setChipStrokeColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.chipStrokeColor
            if (r0 == r2) goto L14
            r1.chipStrokeColor = r2
            boolean r0 = r1.isShapeThemingEnabled
            if (r0 == 0) goto Ld
            r1.setStrokeColor(r2)
        Ld:
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L14:
            return
    }

    public void setChipStrokeColorResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setChipStrokeColor(r2)
            return
    }

    public void setChipStrokeWidth(float r2) {
            r1 = this;
            float r0 = r1.chipStrokeWidth
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L17
            r1.chipStrokeWidth = r2
            android.graphics.Paint r0 = r1.chipPaint
            r0.setStrokeWidth(r2)
            boolean r0 = r1.isShapeThemingEnabled
            if (r0 == 0) goto L14
            super.setStrokeWidth(r2)
        L14:
            r1.invalidateSelf()
        L17:
            return
    }

    public void setChipStrokeWidthResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.setChipStrokeWidth(r2)
            return
    }

    public void setCloseIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getCloseIcon()
            if (r0 == r3) goto L3b
            float r1 = r2.calculateCloseIconWidth()
            if (r3 == 0) goto L15
            android.graphics.drawable.Drawable r3 = androidx.core.graphics.drawable.DrawableCompat.wrap(r3)
            android.graphics.drawable.Drawable r3 = r3.mutate()
            goto L16
        L15:
            r3 = 0
        L16:
            r2.closeIcon = r3
            boolean r3 = com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE
            if (r3 == 0) goto L1f
            r2.updateFrameworkCloseIconRipple()
        L1f:
            float r3 = r2.calculateCloseIconWidth()
            r2.unapplyChildDrawable(r0)
            boolean r0 = r2.showsCloseIcon()
            if (r0 == 0) goto L31
            android.graphics.drawable.Drawable r0 = r2.closeIcon
            r2.applyChildDrawable(r0)
        L31:
            r2.invalidateSelf()
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L3b
            r2.onSizeChange()
        L3b:
            return
    }

    public void setCloseIconContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.CharSequence r0 = r1.closeIconContentDescription
            if (r0 == r2) goto L11
            androidx.core.text.BidiFormatter r0 = androidx.core.text.BidiFormatter.getInstance()
            java.lang.CharSequence r2 = r0.unicodeWrap(r2)
            r1.closeIconContentDescription = r2
            r1.invalidateSelf()
        L11:
            return
    }

    @java.lang.Deprecated
    public void setCloseIconEnabled(boolean r1) {
            r0 = this;
            r0.setCloseIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setCloseIconEnabledResource(int r1) {
            r0 = this;
            r0.setCloseIconVisible(r1)
            return
    }

    public void setCloseIconEndPadding(float r2) {
            r1 = this;
            float r0 = r1.closeIconEndPadding
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L14
            r1.closeIconEndPadding = r2
            r1.invalidateSelf()
            boolean r2 = r1.showsCloseIcon()
            if (r2 == 0) goto L14
            r1.onSizeChange()
        L14:
            return
    }

    public void setCloseIconEndPaddingResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.setCloseIconEndPadding(r2)
            return
    }

    public void setCloseIconResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setCloseIcon(r2)
            return
    }

    public void setCloseIconSize(float r2) {
            r1 = this;
            float r0 = r1.closeIconSize
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L14
            r1.closeIconSize = r2
            r1.invalidateSelf()
            boolean r2 = r1.showsCloseIcon()
            if (r2 == 0) goto L14
            r1.onSizeChange()
        L14:
            return
    }

    public void setCloseIconSizeResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.setCloseIconSize(r2)
            return
    }

    public void setCloseIconStartPadding(float r2) {
            r1 = this;
            float r0 = r1.closeIconStartPadding
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L14
            r1.closeIconStartPadding = r2
            r1.invalidateSelf()
            boolean r2 = r1.showsCloseIcon()
            if (r2 == 0) goto L14
            r1.onSizeChange()
        L14:
            return
    }

    public void setCloseIconStartPaddingResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.setCloseIconStartPadding(r2)
            return
    }

    public boolean setCloseIconState(int[] r2) {
            r1 = this;
            int[] r0 = r1.closeIconStateSet
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 != 0) goto L19
            r1.closeIconStateSet = r2
            boolean r0 = r1.showsCloseIcon()
            if (r0 == 0) goto L19
            int[] r0 = r1.getState()
            boolean r2 = r1.onStateChange(r0, r2)
            return r2
        L19:
            r2 = 0
            return r2
    }

    public void setCloseIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.closeIconTint
            if (r0 == r2) goto L18
            r1.closeIconTint = r2
            boolean r0 = r1.showsCloseIcon()
            if (r0 == 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.closeIcon
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
        L11:
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L18:
            return
    }

    public void setCloseIconTintResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setCloseIconTint(r2)
            return
    }

    public void setCloseIconVisible(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setCloseIconVisible(r2)
            return
    }

    public void setCloseIconVisible(boolean r2) {
            r1 = this;
            boolean r0 = r1.closeIconVisible
            if (r0 == r2) goto L28
            boolean r0 = r1.showsCloseIcon()
            r1.closeIconVisible = r2
            boolean r2 = r1.showsCloseIcon()
            if (r0 == r2) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L28
            if (r2 == 0) goto L1d
            android.graphics.drawable.Drawable r2 = r1.closeIcon
            r1.applyChildDrawable(r2)
            goto L22
        L1d:
            android.graphics.drawable.Drawable r2 = r1.closeIcon
            r1.unapplyChildDrawable(r2)
        L22:
            r1.invalidateSelf()
            r1.onSizeChange()
        L28:
            return
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.ColorFilter r0 = r1.colorFilter
            if (r0 == r2) goto L9
            r1.colorFilter = r2
            r1.invalidateSelf()
        L9:
            return
    }

    public void setDelegate(com.google.android.material.chip.ChipDrawable.Delegate r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.delegate = r0
            return
    }

    public void setEllipsize(android.text.TextUtils.TruncateAt r1) {
            r0 = this;
            r0.truncateAt = r1
            return
    }

    public void setHideMotionSpec(com.google.android.material.animation.MotionSpec r1) {
            r0 = this;
            r0.hideMotionSpec = r1
            return
    }

    public void setHideMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r2)
            r1.setHideMotionSpec(r2)
            return
    }

    public void setIconEndPadding(float r2) {
            r1 = this;
            float r0 = r1.iconEndPadding
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            float r0 = r1.calculateChipIconWidth()
            r1.iconEndPadding = r2
            float r2 = r1.calculateChipIconWidth()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r1.onSizeChange()
        L1a:
            return
    }

    public void setIconEndPaddingResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.setIconEndPadding(r2)
            return
    }

    public void setIconStartPadding(float r2) {
            r1 = this;
            float r0 = r1.iconStartPadding
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            float r0 = r1.calculateChipIconWidth()
            r1.iconStartPadding = r2
            float r2 = r1.calculateChipIconWidth()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r1.onSizeChange()
        L1a:
            return
    }

    public void setIconStartPaddingResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.setIconStartPadding(r2)
            return
    }

    public void setMaxWidth(int r1) {
            r0 = this;
            r0.maxWidth = r1
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.rippleColor
            if (r0 == r2) goto L10
            r1.rippleColor = r2
            r1.updateCompatRippleColor()
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L10:
            return
    }

    public void setRippleColorResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setRippleColor(r2)
            return
    }

    void setShouldDrawText(boolean r1) {
            r0 = this;
            r0.shouldDrawText = r1
            return
    }

    public void setShowMotionSpec(com.google.android.material.animation.MotionSpec r1) {
            r0 = this;
            r0.showMotionSpec = r1
            return
    }

    public void setShowMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r2)
            r1.setShowMotionSpec(r2)
            return
    }

    public void setText(java.lang.CharSequence r2) {
            r1 = this;
            if (r2 != 0) goto L4
            java.lang.String r2 = ""
        L4:
            java.lang.CharSequence r0 = r1.text
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L1a
            r1.text = r2
            com.google.android.material.internal.TextDrawableHelper r2 = r1.textDrawableHelper
            r0 = 1
            r2.setTextWidthDirty(r0)
            r1.invalidateSelf()
            r1.onSizeChange()
        L1a:
            return
    }

    public void setTextAppearance(com.google.android.material.resources.TextAppearance r3) {
            r2 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r2.textDrawableHelper
            android.content.Context r1 = r2.context
            r0.setTextAppearance(r3, r1)
            return
    }

    public void setTextAppearanceResource(int r3) {
            r2 = this;
            com.google.android.material.resources.TextAppearance r0 = new com.google.android.material.resources.TextAppearance
            android.content.Context r1 = r2.context
            r0.<init>(r1, r3)
            r2.setTextAppearance(r0)
            return
    }

    public void setTextEndPadding(float r2) {
            r1 = this;
            float r0 = r1.textEndPadding
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.textEndPadding = r2
            r1.invalidateSelf()
            r1.onSizeChange()
        Le:
            return
    }

    public void setTextEndPaddingResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.setTextEndPadding(r2)
            return
    }

    public void setTextResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.setText(r2)
            return
    }

    public void setTextSize(float r2) {
            r1 = this;
            com.google.android.material.resources.TextAppearance r0 = r1.getTextAppearance()
            if (r0 == 0) goto L14
            r0.textSize = r2
            com.google.android.material.internal.TextDrawableHelper r0 = r1.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            r0.setTextSize(r2)
            r1.onTextSizeChange()
        L14:
            return
    }

    public void setTextStartPadding(float r2) {
            r1 = this;
            float r0 = r1.textStartPadding
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.textStartPadding = r2
            r1.invalidateSelf()
            r1.onSizeChange()
        Le:
            return
    }

    public void setTextStartPaddingResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.setTextStartPadding(r2)
            return
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tint
            if (r0 == r2) goto Ld
            r1.tint = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        Ld:
            return
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.tintMode
            if (r0 == r2) goto L11
            r1.tintMode = r2
            android.content.res.ColorStateList r0 = r1.tint
            android.graphics.PorterDuffColorFilter r2 = com.google.android.material.drawable.DrawableUtils.updateTintFilter(r1, r0, r2)
            r1.tintFilter = r2
            r1.invalidateSelf()
        L11:
            return
    }

    public void setUseCompatRipple(boolean r2) {
            r1 = this;
            boolean r0 = r1.useCompatRipple
            if (r0 == r2) goto L10
            r1.useCompatRipple = r2
            r1.updateCompatRippleColor()
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L10:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            boolean r1 = r2.showsChipIcon()
            if (r1 == 0) goto L11
            android.graphics.drawable.Drawable r1 = r2.chipIcon
            boolean r1 = r1.setVisible(r3, r4)
            r0 = r0 | r1
        L11:
            boolean r1 = r2.showsCheckedIcon()
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.checkedIcon
            boolean r1 = r1.setVisible(r3, r4)
            r0 = r0 | r1
        L1e:
            boolean r1 = r2.showsCloseIcon()
            if (r1 == 0) goto L2b
            android.graphics.drawable.Drawable r1 = r2.closeIcon
            boolean r3 = r1.setVisible(r3, r4)
            r0 = r0 | r3
        L2b:
            if (r0 == 0) goto L30
            r2.invalidateSelf()
        L30:
            return r0
    }

    boolean shouldDrawText() {
            r1 = this;
            boolean r0 = r1.shouldDrawText
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.unscheduleDrawable(r0, r2)
        L9:
            return
    }
}
