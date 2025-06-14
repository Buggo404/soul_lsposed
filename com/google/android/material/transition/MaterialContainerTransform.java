package com.google.android.material.transition;

/* loaded from: classes.dex */
public final class MaterialContainerTransform extends androidx.transition.Transition {
    private static final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS = null;
    private static final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS_ARC = null;
    private static final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS = null;
    private static final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS_ARC = null;
    private static final float ELEVATION_NOT_SET = -1.0f;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    private static final java.lang.String PROP_BOUNDS = "materialContainerTransition:bounds";
    private static final java.lang.String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
    private static final java.lang.String TAG = "MaterialContainerTransform";
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    private static final java.lang.String[] TRANSITION_PROPS = null;
    private int containerColor;
    private boolean drawDebugEnabled;
    private int drawingViewId;
    private boolean elevationShadowEnabled;
    private int endContainerColor;
    private float endElevation;
    private com.google.android.material.shape.ShapeAppearanceModel endShapeAppearanceModel;
    private android.view.View endView;
    private int endViewId;
    private int fadeMode;
    private com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds fadeProgressThresholds;
    private int fitMode;
    private boolean holdAtEndEnabled;
    private com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds scaleMaskProgressThresholds;
    private com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds scaleProgressThresholds;
    private int scrimColor;
    private com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds shapeMaskProgressThresholds;
    private int startContainerColor;
    private float startElevation;
    private com.google.android.material.shape.ShapeAppearanceModel startShapeAppearanceModel;
    private android.view.View startView;
    private int startViewId;
    private int transitionDirection;



    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FadeMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FitMode {
    }

    public static class ProgressThresholds {
        private final float end;
        private final float start;

        public ProgressThresholds(float r1, float r2) {
                r0 = this;
                r0.<init>()
                r0.start = r1
                r0.end = r2
                return
        }

        static /* synthetic */ float access$1000(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r0) {
                float r0 = r0.start
                return r0
        }

        static /* synthetic */ float access$1100(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r0) {
                float r0 = r0.end
                return r0
        }

        public float getEnd() {
                r1 = this;
                float r0 = r1.end
                return r0
        }

        public float getStart() {
                r1 = this;
                float r0 = r1.start
                return r0
        }
    }

    private static class ProgressThresholdsGroup {
        private final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds fade;
        private final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds scale;
        private final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds scaleMask;
        private final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds shapeMask;

        private ProgressThresholdsGroup(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r1, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r2, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r3, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r4) {
                r0 = this;
                r0.<init>()
                r0.fade = r1
                r0.scale = r2
                r0.scaleMask = r3
                r0.shapeMask = r4
                return
        }

        /* synthetic */ ProgressThresholdsGroup(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r1, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r2, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r3, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r4, com.google.android.material.transition.MaterialContainerTransform.C07221 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        static /* synthetic */ com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds access$400(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup r0) {
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = r0.fade
                return r0
        }

        static /* synthetic */ com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds access$500(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup r0) {
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = r0.scale
                return r0
        }

        static /* synthetic */ com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds access$600(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup r0) {
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = r0.scaleMask
                return r0
        }

        static /* synthetic */ com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds access$700(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup r0) {
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = r0.shapeMask
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TransitionDirection {
    }

    private static final class TransitionDrawable extends android.graphics.drawable.Drawable {
        private static final int COMPAT_SHADOW_COLOR = -7829368;
        private static final int SHADOW_COLOR = 754974720;
        private static final float SHADOW_DX_MULTIPLIER_ADJUSTMENT = 0.3f;
        private static final float SHADOW_DY_MULTIPLIER_ADJUSTMENT = 1.5f;
        private final com.google.android.material.shape.MaterialShapeDrawable compatShadowDrawable;
        private final android.graphics.Paint containerPaint;
        private float currentElevation;
        private float currentElevationDy;
        private final android.graphics.RectF currentEndBounds;
        private final android.graphics.RectF currentEndBoundsMasked;
        private android.graphics.RectF currentMaskBounds;
        private final android.graphics.RectF currentStartBounds;
        private final android.graphics.RectF currentStartBoundsMasked;
        private final android.graphics.Paint debugPaint;
        private final android.graphics.Path debugPath;
        private final float displayHeight;
        private final float displayWidth;
        private final boolean drawDebugEnabled;
        private final boolean elevationShadowEnabled;
        private final android.graphics.RectF endBounds;
        private final android.graphics.Paint endContainerPaint;
        private final float endElevation;
        private final com.google.android.material.shape.ShapeAppearanceModel endShapeAppearanceModel;
        private final android.view.View endView;
        private final boolean entering;
        private final com.google.android.material.transition.FadeModeEvaluator fadeModeEvaluator;
        private com.google.android.material.transition.FadeModeResult fadeModeResult;
        private final com.google.android.material.transition.FitModeEvaluator fitModeEvaluator;
        private com.google.android.material.transition.FitModeResult fitModeResult;
        private final com.google.android.material.transition.MaskEvaluator maskEvaluator;
        private final float motionPathLength;
        private final android.graphics.PathMeasure motionPathMeasure;
        private final float[] motionPathPosition;
        private float progress;
        private final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup progressThresholds;
        private final android.graphics.Paint scrimPaint;
        private final android.graphics.Paint shadowPaint;
        private final android.graphics.RectF startBounds;
        private final android.graphics.Paint startContainerPaint;
        private final float startElevation;
        private final com.google.android.material.shape.ShapeAppearanceModel startShapeAppearanceModel;
        private final android.view.View startView;



        private TransitionDrawable(androidx.transition.PathMotion r14, android.view.View r15, android.graphics.RectF r16, com.google.android.material.shape.ShapeAppearanceModel r17, float r18, android.view.View r19, android.graphics.RectF r20, com.google.android.material.shape.ShapeAppearanceModel r21, float r22, int r23, int r24, int r25, int r26, boolean r27, boolean r28, com.google.android.material.transition.FadeModeEvaluator r29, com.google.android.material.transition.FitModeEvaluator r30, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup r31, boolean r32) {
                r13 = this;
                r0 = r13
                r1 = r16
                r13.<init>()
                android.graphics.Paint r2 = new android.graphics.Paint
                r2.<init>()
                r0.containerPaint = r2
                android.graphics.Paint r3 = new android.graphics.Paint
                r3.<init>()
                r0.startContainerPaint = r3
                android.graphics.Paint r4 = new android.graphics.Paint
                r4.<init>()
                r0.endContainerPaint = r4
                android.graphics.Paint r5 = new android.graphics.Paint
                r5.<init>()
                r0.shadowPaint = r5
                android.graphics.Paint r5 = new android.graphics.Paint
                r5.<init>()
                r0.scrimPaint = r5
                com.google.android.material.transition.MaskEvaluator r6 = new com.google.android.material.transition.MaskEvaluator
                r6.<init>()
                r0.maskEvaluator = r6
                r6 = 2
                float[] r7 = new float[r6]
                r0.motionPathPosition = r7
                com.google.android.material.shape.MaterialShapeDrawable r8 = new com.google.android.material.shape.MaterialShapeDrawable
                r8.<init>()
                r0.compatShadowDrawable = r8
                android.graphics.Paint r9 = new android.graphics.Paint
                r9.<init>()
                r0.debugPaint = r9
                android.graphics.Path r10 = new android.graphics.Path
                r10.<init>()
                r0.debugPath = r10
                r10 = r15
                r0.startView = r10
                r0.startBounds = r1
                r11 = r17
                r0.startShapeAppearanceModel = r11
                r11 = r18
                r0.startElevation = r11
                r11 = r19
                r0.endView = r11
                r11 = r20
                r0.endBounds = r11
                r12 = r21
                r0.endShapeAppearanceModel = r12
                r12 = r22
                r0.endElevation = r12
                r12 = r27
                r0.entering = r12
                r12 = r28
                r0.elevationShadowEnabled = r12
                r12 = r29
                r0.fadeModeEvaluator = r12
                r12 = r30
                r0.fitModeEvaluator = r12
                r12 = r31
                r0.progressThresholds = r12
                r12 = r32
                r0.drawDebugEnabled = r12
                android.content.Context r10 = r15.getContext()
                java.lang.String r12 = "window"
                java.lang.Object r10 = r10.getSystemService(r12)
                android.view.WindowManager r10 = (android.view.WindowManager) r10
                android.util.DisplayMetrics r12 = new android.util.DisplayMetrics
                r12.<init>()
                android.view.Display r10 = r10.getDefaultDisplay()
                r10.getMetrics(r12)
                int r10 = r12.widthPixels
                float r10 = (float) r10
                r0.displayWidth = r10
                int r10 = r12.heightPixels
                float r10 = (float) r10
                r0.displayHeight = r10
                r10 = r23
                r2.setColor(r10)
                r2 = r24
                r3.setColor(r2)
                r2 = r25
                r4.setColor(r2)
                r2 = 0
                android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r2)
                r8.setFillColor(r3)
                r8.setShadowCompatibilityMode(r6)
                r8.setShadowBitmapDrawingEnable(r2)
                r3 = -7829368(0xffffffffff888888, float:NaN)
                r8.setShadowColor(r3)
                android.graphics.RectF r3 = new android.graphics.RectF
                r3.<init>(r1)
                r0.currentStartBounds = r3
                android.graphics.RectF r4 = new android.graphics.RectF
                r4.<init>(r3)
                r0.currentStartBoundsMasked = r4
                android.graphics.RectF r4 = new android.graphics.RectF
                r4.<init>(r3)
                r0.currentEndBounds = r4
                android.graphics.RectF r3 = new android.graphics.RectF
                r3.<init>(r4)
                r0.currentEndBoundsMasked = r3
                android.graphics.PointF r3 = getMotionPathPoint(r16)
                android.graphics.PointF r4 = getMotionPathPoint(r20)
                float r6 = r3.x
                float r3 = r3.y
                float r8 = r4.x
                float r4 = r4.y
                r10 = r14
                android.graphics.Path r3 = r14.getPath(r6, r3, r8, r4)
                android.graphics.PathMeasure r4 = new android.graphics.PathMeasure
                r4.<init>(r3, r2)
                r0.motionPathMeasure = r4
                float r3 = r4.getLength()
                r0.motionPathLength = r3
                float r3 = r16.centerX()
                r7[r2] = r3
                r2 = 1
                float r1 = r1.top
                r7[r2] = r1
                android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
                r5.setStyle(r1)
                android.graphics.Shader r1 = com.google.android.material.transition.TransitionUtils.createColorShader(r26)
                r5.setShader(r1)
                android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
                r9.setStyle(r1)
                r1 = 1092616192(0x41200000, float:10.0)
                r9.setStrokeWidth(r1)
                r1 = 0
                r13.updateProgress(r1)
                return
        }

        /* synthetic */ TransitionDrawable(androidx.transition.PathMotion r1, android.view.View r2, android.graphics.RectF r3, com.google.android.material.shape.ShapeAppearanceModel r4, float r5, android.view.View r6, android.graphics.RectF r7, com.google.android.material.shape.ShapeAppearanceModel r8, float r9, int r10, int r11, int r12, int r13, boolean r14, boolean r15, com.google.android.material.transition.FadeModeEvaluator r16, com.google.android.material.transition.FitModeEvaluator r17, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup r18, boolean r19, com.google.android.material.transition.MaterialContainerTransform.C07221 r20) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return
        }

        static /* synthetic */ void access$200(com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable r0, float r1) {
                r0.setProgress(r1)
                return
        }

        static /* synthetic */ android.view.View access$800(com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable r0) {
                android.view.View r0 = r0.startView
                return r0
        }

        static /* synthetic */ android.view.View access$900(com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable r0) {
                android.view.View r0 = r0.endView
                return r0
        }

        private static float calculateElevationDxMultiplier(android.graphics.RectF r1, float r2) {
                float r1 = r1.centerX()
                r0 = 1073741824(0x40000000, float:2.0)
                float r2 = r2 / r0
                float r1 = r1 / r2
                r2 = 1065353216(0x3f800000, float:1.0)
                float r1 = r1 - r2
                r2 = 1050253722(0x3e99999a, float:0.3)
                float r1 = r1 * r2
                return r1
        }

        private static float calculateElevationDyMultiplier(android.graphics.RectF r0, float r1) {
                float r0 = r0.centerY()
                float r0 = r0 / r1
                r1 = 1069547520(0x3fc00000, float:1.5)
                float r0 = r0 * r1
                return r0
        }

        private void drawDebugCumulativePath(android.graphics.Canvas r3, android.graphics.RectF r4, android.graphics.Path r5, int r6) {
                r2 = this;
                android.graphics.PointF r4 = getMotionPathPoint(r4)
                float r0 = r2.progress
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L16
                r5.reset()
                float r3 = r4.x
                float r4 = r4.y
                r5.moveTo(r3, r4)
                goto L27
            L16:
                float r0 = r4.x
                float r4 = r4.y
                r5.lineTo(r0, r4)
                android.graphics.Paint r4 = r2.debugPaint
                r4.setColor(r6)
                android.graphics.Paint r4 = r2.debugPaint
                r3.drawPath(r5, r4)
            L27:
                return
        }

        private void drawDebugRect(android.graphics.Canvas r2, android.graphics.RectF r3, int r4) {
                r1 = this;
                android.graphics.Paint r0 = r1.debugPaint
                r0.setColor(r4)
                android.graphics.Paint r4 = r1.debugPaint
                r2.drawRect(r3, r4)
                return
        }

        private void drawElevationShadow(android.graphics.Canvas r3) {
                r2 = this;
                r3.save()
                com.google.android.material.transition.MaskEvaluator r0 = r2.maskEvaluator
                android.graphics.Path r0 = r0.getPath()
                android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
                r3.clipPath(r0, r1)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 <= r1) goto L18
                r2.drawElevationShadowWithPaintShadowLayer(r3)
                goto L1b
            L18:
                r2.drawElevationShadowWithMaterialShapeDrawable(r3)
            L1b:
                r3.restore()
                return
        }

        private void drawElevationShadowWithMaterialShapeDrawable(android.graphics.Canvas r6) {
                r5 = this;
                com.google.android.material.shape.MaterialShapeDrawable r0 = r5.compatShadowDrawable
                android.graphics.RectF r1 = r5.currentMaskBounds
                float r1 = r1.left
                int r1 = (int) r1
                android.graphics.RectF r2 = r5.currentMaskBounds
                float r2 = r2.top
                int r2 = (int) r2
                android.graphics.RectF r3 = r5.currentMaskBounds
                float r3 = r3.right
                int r3 = (int) r3
                android.graphics.RectF r4 = r5.currentMaskBounds
                float r4 = r4.bottom
                int r4 = (int) r4
                r0.setBounds(r1, r2, r3, r4)
                com.google.android.material.shape.MaterialShapeDrawable r0 = r5.compatShadowDrawable
                float r1 = r5.currentElevation
                r0.setElevation(r1)
                com.google.android.material.shape.MaterialShapeDrawable r0 = r5.compatShadowDrawable
                float r1 = r5.currentElevationDy
                int r1 = (int) r1
                r0.setShadowVerticalOffset(r1)
                com.google.android.material.shape.MaterialShapeDrawable r0 = r5.compatShadowDrawable
                com.google.android.material.transition.MaskEvaluator r1 = r5.maskEvaluator
                com.google.android.material.shape.ShapeAppearanceModel r1 = r1.getCurrentShapeAppearanceModel()
                r0.setShapeAppearanceModel(r1)
                com.google.android.material.shape.MaterialShapeDrawable r0 = r5.compatShadowDrawable
                r0.draw(r6)
                return
        }

        private void drawElevationShadowWithPaintShadowLayer(android.graphics.Canvas r4) {
                r3 = this;
                com.google.android.material.transition.MaskEvaluator r0 = r3.maskEvaluator
                com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getCurrentShapeAppearanceModel()
                android.graphics.RectF r1 = r3.currentMaskBounds
                boolean r1 = r0.isRoundRect(r1)
                if (r1 == 0) goto L20
                com.google.android.material.shape.CornerSize r0 = r0.getTopLeftCornerSize()
                android.graphics.RectF r1 = r3.currentMaskBounds
                float r0 = r0.getCornerSize(r1)
                android.graphics.RectF r1 = r3.currentMaskBounds
                android.graphics.Paint r2 = r3.shadowPaint
                r4.drawRoundRect(r1, r0, r0, r2)
                goto L2b
            L20:
                com.google.android.material.transition.MaskEvaluator r0 = r3.maskEvaluator
                android.graphics.Path r0 = r0.getPath()
                android.graphics.Paint r1 = r3.shadowPaint
                r4.drawPath(r0, r1)
            L2b:
                return
        }

        private void drawEndView(android.graphics.Canvas r9) {
                r8 = this;
                android.graphics.Paint r0 = r8.endContainerPaint
                r8.maybeDrawContainerColor(r9, r0)
                android.graphics.Rect r2 = r8.getBounds()
                android.graphics.RectF r0 = r8.currentEndBounds
                float r3 = r0.left
                android.graphics.RectF r0 = r8.currentEndBounds
                float r4 = r0.top
                com.google.android.material.transition.FitModeResult r0 = r8.fitModeResult
                float r5 = r0.endScale
                com.google.android.material.transition.FadeModeResult r0 = r8.fadeModeResult
                int r6 = r0.endAlpha
                com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable$2 r7 = new com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable$2
                r7.<init>(r8)
                r1 = r9
                com.google.android.material.transition.TransitionUtils.transform(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        private void drawStartView(android.graphics.Canvas r9) {
                r8 = this;
                android.graphics.Paint r0 = r8.startContainerPaint
                r8.maybeDrawContainerColor(r9, r0)
                android.graphics.Rect r2 = r8.getBounds()
                android.graphics.RectF r0 = r8.currentStartBounds
                float r3 = r0.left
                android.graphics.RectF r0 = r8.currentStartBounds
                float r4 = r0.top
                com.google.android.material.transition.FitModeResult r0 = r8.fitModeResult
                float r5 = r0.startScale
                com.google.android.material.transition.FadeModeResult r0 = r8.fadeModeResult
                int r6 = r0.startAlpha
                com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable$1 r7 = new com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable$1
                r7.<init>(r8)
                r1 = r9
                com.google.android.material.transition.TransitionUtils.transform(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        private static android.graphics.PointF getMotionPathPoint(android.graphics.RectF r2) {
                android.graphics.PointF r0 = new android.graphics.PointF
                float r1 = r2.centerX()
                float r2 = r2.top
                r0.<init>(r1, r2)
                return r0
        }

        private void maybeDrawContainerColor(android.graphics.Canvas r2, android.graphics.Paint r3) {
                r1 = this;
                int r0 = r3.getColor()
                if (r0 == 0) goto L13
                int r0 = r3.getAlpha()
                if (r0 <= 0) goto L13
                android.graphics.Rect r0 = r1.getBounds()
                r2.drawRect(r0, r3)
            L13:
                return
        }

        private void setProgress(float r2) {
                r1 = this;
                float r0 = r1.progress
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L9
                r1.updateProgress(r2)
            L9:
                return
        }

        private void updateProgress(float r13) {
                r12 = this;
                r12.progress = r13
                android.graphics.Paint r0 = r12.scrimPaint
                boolean r1 = r12.entering
                r2 = 1132396544(0x437f0000, float:255.0)
                r8 = 0
                if (r1 == 0) goto L10
                float r1 = com.google.android.material.transition.TransitionUtils.lerp(r8, r2, r13)
                goto L14
            L10:
                float r1 = com.google.android.material.transition.TransitionUtils.lerp(r2, r8, r13)
            L14:
                int r1 = (int) r1
                r0.setAlpha(r1)
                android.graphics.PathMeasure r0 = r12.motionPathMeasure
                float r1 = r12.motionPathLength
                float r1 = r1 * r13
                float[] r2 = r12.motionPathPosition
                r3 = 0
                r0.getPosTan(r1, r2, r3)
                float[] r0 = r12.motionPathPosition
                r1 = 0
                r2 = r0[r1]
                r4 = 1
                r5 = r0[r4]
                r9 = 1065353216(0x3f800000, float:1.0)
                int r6 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r6 > 0) goto L39
                int r7 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r7 >= 0) goto L36
                goto L39
            L36:
                r10 = r2
                r11 = r5
                goto L64
            L39:
                if (r6 <= 0) goto L45
                float r6 = r13 - r9
                r7 = 1008981760(0x3c23d700, float:0.00999999)
                float r6 = r6 / r7
                r7 = 1065185444(0x3f7d70a4, float:0.99)
                goto L4d
            L45:
                r7 = 1008981770(0x3c23d70a, float:0.01)
                float r6 = r13 / r7
                r10 = -1082130432(0xffffffffbf800000, float:-1.0)
                float r6 = r6 * r10
            L4d:
                android.graphics.PathMeasure r10 = r12.motionPathMeasure
                float r11 = r12.motionPathLength
                float r11 = r11 * r7
                r10.getPosTan(r11, r0, r3)
                float[] r0 = r12.motionPathPosition
                r1 = r0[r1]
                r0 = r0[r4]
                float r1 = r2 - r1
                float r1 = r1 * r6
                float r2 = r2 + r1
                float r0 = r5 - r0
                float r0 = r0 * r6
                float r5 = r5 + r0
                goto L36
            L64:
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = r12.progressThresholds
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$500(r0)
                float r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds.access$1000(r0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
                java.lang.Float r0 = (java.lang.Float) r0
                float r2 = r0.floatValue()
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = r12.progressThresholds
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$500(r0)
                float r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds.access$1100(r0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
                java.lang.Float r0 = (java.lang.Float) r0
                float r3 = r0.floatValue()
                com.google.android.material.transition.FitModeEvaluator r0 = r12.fitModeEvaluator
                android.graphics.RectF r1 = r12.startBounds
                float r4 = r1.width()
                android.graphics.RectF r1 = r12.startBounds
                float r5 = r1.height()
                android.graphics.RectF r1 = r12.endBounds
                float r6 = r1.width()
                android.graphics.RectF r1 = r12.endBounds
                float r7 = r1.height()
                r1 = r13
                com.google.android.material.transition.FitModeResult r0 = r0.evaluate(r1, r2, r3, r4, r5, r6, r7)
                r12.fitModeResult = r0
                android.graphics.RectF r1 = r12.currentStartBounds
                float r0 = r0.currentStartWidth
                r2 = 1073741824(0x40000000, float:2.0)
                float r0 = r0 / r2
                float r0 = r10 - r0
                com.google.android.material.transition.FitModeResult r3 = r12.fitModeResult
                float r3 = r3.currentStartWidth
                float r3 = r3 / r2
                float r3 = r3 + r10
                com.google.android.material.transition.FitModeResult r4 = r12.fitModeResult
                float r4 = r4.currentStartHeight
                float r4 = r4 + r11
                r1.set(r0, r11, r3, r4)
                android.graphics.RectF r0 = r12.currentEndBounds
                com.google.android.material.transition.FitModeResult r1 = r12.fitModeResult
                float r1 = r1.currentEndWidth
                float r1 = r1 / r2
                float r1 = r10 - r1
                com.google.android.material.transition.FitModeResult r3 = r12.fitModeResult
                float r3 = r3.currentEndWidth
                float r3 = r3 / r2
                float r10 = r10 + r3
                com.google.android.material.transition.FitModeResult r2 = r12.fitModeResult
                float r2 = r2.currentEndHeight
                float r2 = r2 + r11
                r0.set(r1, r11, r10, r2)
                android.graphics.RectF r0 = r12.currentStartBoundsMasked
                android.graphics.RectF r1 = r12.currentStartBounds
                r0.set(r1)
                android.graphics.RectF r0 = r12.currentEndBoundsMasked
                android.graphics.RectF r1 = r12.currentEndBounds
                r0.set(r1)
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = r12.progressThresholds
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$600(r0)
                float r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds.access$1000(r0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
                java.lang.Float r0 = (java.lang.Float) r0
                float r0 = r0.floatValue()
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r1 = r12.progressThresholds
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r1 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$600(r1)
                float r1 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds.access$1100(r1)
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
                java.lang.Float r1 = (java.lang.Float) r1
                float r1 = r1.floatValue()
                com.google.android.material.transition.FitModeEvaluator r2 = r12.fitModeEvaluator
                com.google.android.material.transition.FitModeResult r3 = r12.fitModeResult
                boolean r2 = r2.shouldMaskStartBounds(r3)
                if (r2 == 0) goto L12e
                android.graphics.RectF r3 = r12.currentStartBoundsMasked
                goto L130
            L12e:
                android.graphics.RectF r3 = r12.currentEndBoundsMasked
            L130:
                float r0 = com.google.android.material.transition.TransitionUtils.lerp(r8, r9, r0, r1, r13)
                if (r2 == 0) goto L137
                goto L139
            L137:
                float r0 = r9 - r0
            L139:
                com.google.android.material.transition.FitModeEvaluator r1 = r12.fitModeEvaluator
                com.google.android.material.transition.FitModeResult r2 = r12.fitModeResult
                r1.applyMask(r3, r0, r2)
                android.graphics.RectF r0 = new android.graphics.RectF
                android.graphics.RectF r1 = r12.currentStartBoundsMasked
                float r1 = r1.left
                android.graphics.RectF r2 = r12.currentEndBoundsMasked
                float r2 = r2.left
                float r1 = java.lang.Math.min(r1, r2)
                android.graphics.RectF r2 = r12.currentStartBoundsMasked
                float r2 = r2.top
                android.graphics.RectF r3 = r12.currentEndBoundsMasked
                float r3 = r3.top
                float r2 = java.lang.Math.min(r2, r3)
                android.graphics.RectF r3 = r12.currentStartBoundsMasked
                float r3 = r3.right
                android.graphics.RectF r4 = r12.currentEndBoundsMasked
                float r4 = r4.right
                float r3 = java.lang.Math.max(r3, r4)
                android.graphics.RectF r4 = r12.currentStartBoundsMasked
                float r4 = r4.bottom
                android.graphics.RectF r5 = r12.currentEndBoundsMasked
                float r5 = r5.bottom
                float r4 = java.lang.Math.max(r4, r5)
                r0.<init>(r1, r2, r3, r4)
                r12.currentMaskBounds = r0
                com.google.android.material.transition.MaskEvaluator r0 = r12.maskEvaluator
                com.google.android.material.shape.ShapeAppearanceModel r2 = r12.startShapeAppearanceModel
                com.google.android.material.shape.ShapeAppearanceModel r3 = r12.endShapeAppearanceModel
                android.graphics.RectF r4 = r12.currentStartBounds
                android.graphics.RectF r5 = r12.currentStartBoundsMasked
                android.graphics.RectF r6 = r12.currentEndBoundsMasked
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r1 = r12.progressThresholds
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r7 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$700(r1)
                r1 = r13
                r0.evaluate(r1, r2, r3, r4, r5, r6, r7)
                float r0 = r12.startElevation
                float r1 = r12.endElevation
                float r0 = com.google.android.material.transition.TransitionUtils.lerp(r0, r1, r13)
                r12.currentElevation = r0
                android.graphics.RectF r0 = r12.currentMaskBounds
                float r1 = r12.displayWidth
                float r0 = calculateElevationDxMultiplier(r0, r1)
                android.graphics.RectF r1 = r12.currentMaskBounds
                float r2 = r12.displayHeight
                float r1 = calculateElevationDyMultiplier(r1, r2)
                float r2 = r12.currentElevation
                float r0 = r0 * r2
                int r0 = (int) r0
                float r0 = (float) r0
                float r1 = r1 * r2
                int r1 = (int) r1
                float r1 = (float) r1
                r12.currentElevationDy = r1
                android.graphics.Paint r3 = r12.shadowPaint
                r4 = 754974720(0x2d000000, float:7.2759576E-12)
                r3.setShadowLayer(r2, r0, r1, r4)
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = r12.progressThresholds
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$400(r0)
                float r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds.access$1000(r0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
                java.lang.Float r0 = (java.lang.Float) r0
                float r0 = r0.floatValue()
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r1 = r12.progressThresholds
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r1 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$400(r1)
                float r1 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds.access$1100(r1)
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
                java.lang.Float r1 = (java.lang.Float) r1
                float r1 = r1.floatValue()
                com.google.android.material.transition.FadeModeEvaluator r2 = r12.fadeModeEvaluator
                com.google.android.material.transition.FadeModeResult r0 = r2.evaluate(r13, r0, r1)
                r12.fadeModeResult = r0
                android.graphics.Paint r0 = r12.startContainerPaint
                int r0 = r0.getColor()
                if (r0 == 0) goto L201
                android.graphics.Paint r0 = r12.startContainerPaint
                com.google.android.material.transition.FadeModeResult r1 = r12.fadeModeResult
                int r1 = r1.startAlpha
                r0.setAlpha(r1)
            L201:
                android.graphics.Paint r0 = r12.endContainerPaint
                int r0 = r0.getColor()
                if (r0 == 0) goto L212
                android.graphics.Paint r0 = r12.endContainerPaint
                com.google.android.material.transition.FadeModeResult r1 = r12.fadeModeResult
                int r1 = r1.endAlpha
                r0.setAlpha(r1)
            L212:
                r12.invalidateSelf()
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas r4) {
                r3 = this;
                android.graphics.Paint r0 = r3.scrimPaint
                int r0 = r0.getAlpha()
                if (r0 <= 0) goto L11
                android.graphics.Rect r0 = r3.getBounds()
                android.graphics.Paint r1 = r3.scrimPaint
                r4.drawRect(r0, r1)
            L11:
                boolean r0 = r3.drawDebugEnabled
                if (r0 == 0) goto L1a
                int r0 = r4.save()
                goto L1b
            L1a:
                r0 = -1
            L1b:
                boolean r1 = r3.elevationShadowEnabled
                if (r1 == 0) goto L29
                float r1 = r3.currentElevation
                r2 = 0
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 <= 0) goto L29
                r3.drawElevationShadow(r4)
            L29:
                com.google.android.material.transition.MaskEvaluator r1 = r3.maskEvaluator
                r1.clip(r4)
                android.graphics.Paint r1 = r3.containerPaint
                r3.maybeDrawContainerColor(r4, r1)
                com.google.android.material.transition.FadeModeResult r1 = r3.fadeModeResult
                boolean r1 = r1.endOnTop
                if (r1 == 0) goto L40
                r3.drawStartView(r4)
                r3.drawEndView(r4)
                goto L46
            L40:
                r3.drawEndView(r4)
                r3.drawStartView(r4)
            L46:
                boolean r1 = r3.drawDebugEnabled
                if (r1 == 0) goto L76
                r4.restoreToCount(r0)
                android.graphics.RectF r0 = r3.currentStartBounds
                android.graphics.Path r1 = r3.debugPath
                r2 = -65281(0xffffffffffff00ff, float:NaN)
                r3.drawDebugCumulativePath(r4, r0, r1, r2)
                android.graphics.RectF r0 = r3.currentStartBoundsMasked
                r1 = -256(0xffffffffffffff00, float:NaN)
                r3.drawDebugRect(r4, r0, r1)
                android.graphics.RectF r0 = r3.currentStartBounds
                r1 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
                r3.drawDebugRect(r4, r0, r1)
                android.graphics.RectF r0 = r3.currentEndBoundsMasked
                r1 = -16711681(0xffffffffff00ffff, float:-1.714704E38)
                r3.drawDebugRect(r4, r0, r1)
                android.graphics.RectF r0 = r3.currentEndBounds
                r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
                r3.drawDebugRect(r4, r0, r1)
            L76:
                return
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
                r1 = this;
                r0 = -3
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Setting alpha on is not supported"
                r2.<init>(r0)
                throw r2
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(android.graphics.ColorFilter r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Setting a color filter is not supported"
                r2.<init>(r0)
                throw r2
        }
    }

    static {
            java.lang.String r0 = "materialContainerTransition:bounds"
            java.lang.String r1 = "materialContainerTransition:shapeAppearance"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.google.android.material.transition.MaterialContainerTransform.TRANSITION_PROPS = r0
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r2 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r1 = 1048576000(0x3e800000, float:0.25)
            r7 = 0
            r2.<init>(r7, r1)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r3 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r8 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r7, r8)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r4 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r4.<init>(r7, r8)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r5 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r1 = 1061158912(0x3f400000, float:0.75)
            r5.<init>(r7, r1)
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.material.transition.MaterialContainerTransform.DEFAULT_ENTER_THRESHOLDS = r0
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r10 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r1 = 1058642330(0x3f19999a, float:0.6)
            r2 = 1063675494(0x3f666666, float:0.9)
            r10.<init>(r1, r2)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r11 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r11.<init>(r7, r8)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r12 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r12.<init>(r7, r2)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r13 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r3 = 1050253722(0x3e99999a, float:0.3)
            r13.<init>(r3, r2)
            r14 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            com.google.android.material.transition.MaterialContainerTransform.DEFAULT_RETURN_THRESHOLDS = r0
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r3 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r4 = 1053609165(0x3ecccccd, float:0.4)
            r5 = 1036831949(0x3dcccccd, float:0.1)
            r3.<init>(r5, r4)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r4 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r4.<init>(r5, r8)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r6 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r6.<init>(r5, r8)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r8 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r8.<init>(r5, r2)
            r20 = 0
            r15 = r0
            r16 = r3
            r17 = r4
            r18 = r6
            r19 = r8
            r15.<init>(r16, r17, r18, r19, r20)
            com.google.android.material.transition.MaterialContainerTransform.DEFAULT_ENTER_THRESHOLDS_ARC = r0
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r10 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r10.<init>(r1, r2)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r11 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r11.<init>(r7, r2)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r12 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r12.<init>(r7, r2)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r13 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r13.<init>(r1, r2)
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            com.google.android.material.transition.MaterialContainerTransform.DEFAULT_RETURN_THRESHOLDS_ARC = r0
            return
    }

    public MaterialContainerTransform() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.drawDebugEnabled = r0
            r3.holdAtEndEnabled = r0
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            r3.drawingViewId = r1
            r1 = -1
            r3.startViewId = r1
            r3.endViewId = r1
            r3.containerColor = r0
            r3.startContainerColor = r0
            r3.endContainerColor = r0
            r1 = 1375731712(0x52000000, float:1.37438953E11)
            r3.scrimColor = r1
            r3.transitionDirection = r0
            r3.fadeMode = r0
            r3.fitMode = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L29
            r0 = 1
        L29:
            r3.elevationShadowEnabled = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.startElevation = r0
            r3.endElevation = r0
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            r3.setInterpolator(r0)
            return
    }

    static /* synthetic */ boolean access$300(com.google.android.material.transition.MaterialContainerTransform r0) {
            boolean r0 = r0.holdAtEndEnabled
            return r0
    }

    private com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup buildThresholdsGroup(boolean r3) {
            r2 = this;
            androidx.transition.PathMotion r0 = r2.getPathMotion()
            boolean r1 = r0 instanceof androidx.transition.ArcMotion
            if (r1 != 0) goto L16
            boolean r0 = r0 instanceof com.google.android.material.transition.MaterialArcMotion
            if (r0 == 0) goto Ld
            goto L16
        Ld:
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = com.google.android.material.transition.MaterialContainerTransform.DEFAULT_ENTER_THRESHOLDS
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r1 = com.google.android.material.transition.MaterialContainerTransform.DEFAULT_RETURN_THRESHOLDS
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r3 = r2.getThresholdsOrDefault(r3, r0, r1)
            return r3
        L16:
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = com.google.android.material.transition.MaterialContainerTransform.DEFAULT_ENTER_THRESHOLDS_ARC
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r1 = com.google.android.material.transition.MaterialContainerTransform.DEFAULT_RETURN_THRESHOLDS_ARC
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r3 = r2.getThresholdsOrDefault(r3, r0, r1)
            return r3
    }

    private static android.graphics.RectF calculateDrawableBounds(android.view.View r0, android.view.View r1, float r2, float r3) {
            if (r1 == 0) goto La
            android.graphics.RectF r0 = com.google.android.material.transition.TransitionUtils.getLocationOnScreen(r1)
            r0.offset(r2, r3)
            return r0
        La:
            android.graphics.RectF r1 = new android.graphics.RectF
            int r2 = r0.getWidth()
            float r2 = (float) r2
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r3 = 0
            r1.<init>(r3, r3, r2, r0)
            return r1
    }

    private static com.google.android.material.shape.ShapeAppearanceModel captureShapeAppearance(android.view.View r0, android.graphics.RectF r1, com.google.android.material.shape.ShapeAppearanceModel r2) {
            com.google.android.material.shape.ShapeAppearanceModel r0 = getShapeAppearance(r0, r2)
            com.google.android.material.shape.ShapeAppearanceModel r0 = com.google.android.material.transition.TransitionUtils.convertToRelativeCornerSizes(r0, r1)
            return r0
    }

    private static void captureValues(androidx.transition.TransitionValues r2, android.view.View r3, int r4, com.google.android.material.shape.ShapeAppearanceModel r5) {
            r0 = -1
            if (r4 == r0) goto Lc
            android.view.View r3 = r2.view
            android.view.View r3 = com.google.android.material.transition.TransitionUtils.findDescendantOrAncestorById(r3, r4)
            r2.view = r3
            goto L31
        Lc:
            if (r3 == 0) goto L11
            r2.view = r3
            goto L31
        L11:
            android.view.View r3 = r2.view
            int r4 = com.google.android.material.C0479R.id.mtrl_motion_snapshot_view
            java.lang.Object r3 = r3.getTag(r4)
            boolean r3 = r3 instanceof android.view.View
            if (r3 == 0) goto L31
            android.view.View r3 = r2.view
            int r4 = com.google.android.material.C0479R.id.mtrl_motion_snapshot_view
            java.lang.Object r3 = r3.getTag(r4)
            android.view.View r3 = (android.view.View) r3
            android.view.View r4 = r2.view
            int r0 = com.google.android.material.C0479R.id.mtrl_motion_snapshot_view
            r1 = 0
            r4.setTag(r0, r1)
            r2.view = r3
        L31:
            android.view.View r3 = r2.view
            boolean r4 = androidx.core.view.ViewCompat.isLaidOut(r3)
            if (r4 != 0) goto L45
            int r4 = r3.getWidth()
            if (r4 != 0) goto L45
            int r4 = r3.getHeight()
            if (r4 == 0) goto L66
        L45:
            android.view.ViewParent r4 = r3.getParent()
            if (r4 != 0) goto L50
            android.graphics.RectF r4 = com.google.android.material.transition.TransitionUtils.getRelativeBounds(r3)
            goto L54
        L50:
            android.graphics.RectF r4 = com.google.android.material.transition.TransitionUtils.getLocationOnScreen(r3)
        L54:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.values
            java.lang.String r1 = "materialContainerTransition:bounds"
            r0.put(r1, r4)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.values
            java.lang.String r0 = "materialContainerTransition:shapeAppearance"
            com.google.android.material.shape.ShapeAppearanceModel r3 = captureShapeAppearance(r3, r4, r5)
            r2.put(r0, r3)
        L66:
            return
    }

    private static float getElevationOrDefault(float r1, android.view.View r2) {
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L7
            goto Lb
        L7:
            float r1 = androidx.core.view.ViewCompat.getElevation(r2)
        Lb:
            return r1
    }

    private static com.google.android.material.shape.ShapeAppearanceModel getShapeAppearance(android.view.View r2, com.google.android.material.shape.ShapeAppearanceModel r3) {
            if (r3 == 0) goto L3
            return r3
        L3:
            int r3 = com.google.android.material.C0479R.id.mtrl_motion_snapshot_view
            java.lang.Object r3 = r2.getTag(r3)
            boolean r3 = r3 instanceof com.google.android.material.shape.ShapeAppearanceModel
            if (r3 == 0) goto L16
            int r3 = com.google.android.material.C0479R.id.mtrl_motion_snapshot_view
            java.lang.Object r2 = r2.getTag(r3)
            com.google.android.material.shape.ShapeAppearanceModel r2 = (com.google.android.material.shape.ShapeAppearanceModel) r2
            return r2
        L16:
            android.content.Context r3 = r2.getContext()
            int r0 = getTransitionShapeAppearanceResId(r3)
            r1 = -1
            if (r0 == r1) goto L2b
            r2 = 0
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = com.google.android.material.shape.ShapeAppearanceModel.builder(r3, r0, r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            return r2
        L2b:
            boolean r3 = r2 instanceof com.google.android.material.shape.Shapeable
            if (r3 == 0) goto L36
            com.google.android.material.shape.Shapeable r2 = (com.google.android.material.shape.Shapeable) r2
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.getShapeAppearanceModel()
            return r2
        L36:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = com.google.android.material.shape.ShapeAppearanceModel.builder()
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            return r2
    }

    private com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup getThresholdsOrDefault(boolean r7, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup r8, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup r9) {
            r6 = this;
            if (r7 == 0) goto L3
            goto L4
        L3:
            r8 = r9
        L4:
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r7 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r9 = r6.fadeProgressThresholds
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$400(r8)
            java.lang.Object r9 = com.google.android.material.transition.TransitionUtils.defaultIfNull(r9, r0)
            r1 = r9
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r1 = (com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds) r1
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r9 = r6.scaleProgressThresholds
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$500(r8)
            java.lang.Object r9 = com.google.android.material.transition.TransitionUtils.defaultIfNull(r9, r0)
            r2 = r9
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r2 = (com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds) r2
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r9 = r6.scaleMaskProgressThresholds
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$600(r8)
            java.lang.Object r9 = com.google.android.material.transition.TransitionUtils.defaultIfNull(r9, r0)
            r3 = r9
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r3 = (com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds) r3
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r9 = r6.shapeMaskProgressThresholds
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r8 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$700(r8)
            java.lang.Object r8 = com.google.android.material.transition.TransitionUtils.defaultIfNull(r9, r8)
            r4 = r8
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r4 = (com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds) r4
            r5 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
    }

    private static int getTransitionShapeAppearanceResId(android.content.Context r3) {
            r0 = 1
            int[] r0 = new int[r0]
            int r1 = com.google.android.material.C0479R.attr.transitionShapeAppearance
            r2 = 0
            r0[r2] = r1
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r0)
            r0 = -1
            int r0 = r3.getResourceId(r2, r0)
            r3.recycle()
            return r0
    }

    private boolean isEntering(android.graphics.RectF r4, android.graphics.RectF r5) {
            r3 = this;
            int r0 = r3.transitionDirection
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L24
            if (r0 == r2) goto L23
            r4 = 2
            if (r0 != r4) goto Lc
            return r1
        Lc:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid transition direction: "
            r5.<init>(r0)
            int r0 = r3.transitionDirection
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L23:
            return r2
        L24:
            float r5 = com.google.android.material.transition.TransitionUtils.calculateArea(r5)
            float r4 = com.google.android.material.transition.TransitionUtils.calculateArea(r4)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L31
            r1 = r2
        L31:
            return r1
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues r4) {
            r3 = this;
            android.view.View r0 = r3.endView
            int r1 = r3.endViewId
            com.google.android.material.shape.ShapeAppearanceModel r2 = r3.endShapeAppearanceModel
            captureValues(r4, r0, r1, r2)
            return
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues r4) {
            r3 = this;
            android.view.View r0 = r3.startView
            int r1 = r3.startViewId
            com.google.android.material.shape.ShapeAppearanceModel r2 = r3.startShapeAppearanceModel
            captureValues(r4, r0, r1, r2)
            return
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup r30, androidx.transition.TransitionValues r31, androidx.transition.TransitionValues r32) {
            r29 = this;
            r6 = r29
            r0 = r31
            r1 = r32
            r2 = 0
            if (r0 == 0) goto L10d
            if (r1 != 0) goto Ld
            goto L10d
        Ld:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.values
            java.lang.String r4 = "materialContainerTransition:bounds"
            java.lang.Object r3 = r3.get(r4)
            r10 = r3
            android.graphics.RectF r10 = (android.graphics.RectF) r10
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.values
            java.lang.String r5 = "materialContainerTransition:shapeAppearance"
            java.lang.Object r3 = r3.get(r5)
            r11 = r3
            com.google.android.material.shape.ShapeAppearanceModel r11 = (com.google.android.material.shape.ShapeAppearanceModel) r11
            if (r10 == 0) goto L106
            if (r11 != 0) goto L29
            goto L106
        L29:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r1.values
            java.lang.Object r3 = r3.get(r4)
            r14 = r3
            android.graphics.RectF r14 = (android.graphics.RectF) r14
            java.util.Map<java.lang.String, java.lang.Object> r3 = r1.values
            java.lang.Object r3 = r3.get(r5)
            r15 = r3
            com.google.android.material.shape.ShapeAppearanceModel r15 = (com.google.android.material.shape.ShapeAppearanceModel) r15
            if (r14 == 0) goto Lfe
            if (r15 != 0) goto L41
            goto Lfe
        L41:
            android.view.View r4 = r0.view
            android.view.View r5 = r1.view
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L4d
            r0 = r5
            goto L4e
        L4d:
            r0 = r4
        L4e:
            int r1 = r6.drawingViewId
            int r3 = r0.getId()
            if (r1 != r3) goto L5e
            android.view.ViewParent r1 = r0.getParent()
            android.view.View r1 = (android.view.View) r1
            r2 = r1
            goto L69
        L5e:
            int r1 = r6.drawingViewId
            android.view.View r0 = com.google.android.material.transition.TransitionUtils.findAncestorById(r0, r1)
            r28 = r2
            r2 = r0
            r0 = r28
        L69:
            android.graphics.RectF r1 = com.google.android.material.transition.TransitionUtils.getLocationOnScreen(r2)
            float r3 = r1.left
            float r3 = -r3
            float r1 = r1.top
            float r1 = -r1
            android.graphics.RectF r0 = calculateDrawableBounds(r2, r0, r3, r1)
            r10.offset(r3, r1)
            r14.offset(r3, r1)
            boolean r1 = r6.isEntering(r10, r14)
            r21 = r1
            com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable r3 = new com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable
            r7 = r3
            androidx.transition.PathMotion r8 = r29.getPathMotion()
            float r9 = r6.startElevation
            float r12 = getElevationOrDefault(r9, r4)
            float r9 = r6.endElevation
            float r16 = getElevationOrDefault(r9, r5)
            int r9 = r6.containerColor
            r17 = r9
            int r9 = r6.startContainerColor
            r18 = r9
            int r9 = r6.endContainerColor
            r19 = r9
            int r9 = r6.scrimColor
            r20 = r9
            boolean r9 = r6.elevationShadowEnabled
            r22 = r9
            int r9 = r6.fadeMode
            com.google.android.material.transition.FadeModeEvaluator r23 = com.google.android.material.transition.FadeModeEvaluators.get(r9, r1)
            int r9 = r6.fitMode
            com.google.android.material.transition.FitModeEvaluator r24 = com.google.android.material.transition.FitModeEvaluators.get(r9, r1, r10, r14)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r25 = r6.buildThresholdsGroup(r1)
            boolean r1 = r6.drawDebugEnabled
            r26 = r1
            r27 = 0
            r9 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            float r1 = r0.left
            int r1 = java.lang.Math.round(r1)
            float r7 = r0.top
            int r7 = java.lang.Math.round(r7)
            float r8 = r0.right
            int r8 = java.lang.Math.round(r8)
            float r0 = r0.bottom
            int r0 = java.lang.Math.round(r0)
            r3.setBounds(r1, r7, r8, r0)
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x010e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r0)
            com.google.android.material.transition.MaterialContainerTransform$1 r0 = new com.google.android.material.transition.MaterialContainerTransform$1
            r0.<init>(r6, r3)
            r7.addUpdateListener(r0)
            com.google.android.material.transition.MaterialContainerTransform$2 r8 = new com.google.android.material.transition.MaterialContainerTransform$2
            r0 = r8
            r1 = r29
            r0.<init>(r1, r2, r3, r4, r5)
            r6.addListener(r8)
            return r7
        Lfe:
            java.lang.String r0 = com.google.android.material.transition.MaterialContainerTransform.TAG
            java.lang.String r1 = "Skipping due to null end bounds. Ensure end view is laid out and measured."
            android.util.Log.w(r0, r1)
            return r2
        L106:
            java.lang.String r0 = com.google.android.material.transition.MaterialContainerTransform.TAG
            java.lang.String r1 = "Skipping due to null start bounds. Ensure start view is laid out and measured."
            android.util.Log.w(r0, r1)
        L10d:
            return r2
    }

    public int getContainerColor() {
            r1 = this;
            int r0 = r1.containerColor
            return r0
    }

    public int getDrawingViewId() {
            r1 = this;
            int r0 = r1.drawingViewId
            return r0
    }

    public int getEndContainerColor() {
            r1 = this;
            int r0 = r1.endContainerColor
            return r0
    }

    public float getEndElevation() {
            r1 = this;
            float r0 = r1.endElevation
            return r0
    }

    public com.google.android.material.shape.ShapeAppearanceModel getEndShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.endShapeAppearanceModel
            return r0
    }

    public android.view.View getEndView() {
            r1 = this;
            android.view.View r0 = r1.endView
            return r0
    }

    public int getEndViewId() {
            r1 = this;
            int r0 = r1.endViewId
            return r0
    }

    public int getFadeMode() {
            r1 = this;
            int r0 = r1.fadeMode
            return r0
    }

    public com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds getFadeProgressThresholds() {
            r1 = this;
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = r1.fadeProgressThresholds
            return r0
    }

    public int getFitMode() {
            r1 = this;
            int r0 = r1.fitMode
            return r0
    }

    public com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds getScaleMaskProgressThresholds() {
            r1 = this;
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = r1.scaleMaskProgressThresholds
            return r0
    }

    public com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds getScaleProgressThresholds() {
            r1 = this;
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = r1.scaleProgressThresholds
            return r0
    }

    public int getScrimColor() {
            r1 = this;
            int r0 = r1.scrimColor
            return r0
    }

    public com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds getShapeMaskProgressThresholds() {
            r1 = this;
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = r1.shapeMaskProgressThresholds
            return r0
    }

    public int getStartContainerColor() {
            r1 = this;
            int r0 = r1.startContainerColor
            return r0
    }

    public float getStartElevation() {
            r1 = this;
            float r0 = r1.startElevation
            return r0
    }

    public com.google.android.material.shape.ShapeAppearanceModel getStartShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.startShapeAppearanceModel
            return r0
    }

    public android.view.View getStartView() {
            r1 = this;
            android.view.View r0 = r1.startView
            return r0
    }

    public int getStartViewId() {
            r1 = this;
            int r0 = r1.startViewId
            return r0
    }

    public int getTransitionDirection() {
            r1 = this;
            int r0 = r1.transitionDirection
            return r0
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = com.google.android.material.transition.MaterialContainerTransform.TRANSITION_PROPS
            return r0
    }

    public boolean isDrawDebugEnabled() {
            r1 = this;
            boolean r0 = r1.drawDebugEnabled
            return r0
    }

    public boolean isElevationShadowEnabled() {
            r1 = this;
            boolean r0 = r1.elevationShadowEnabled
            return r0
    }

    public boolean isHoldAtEndEnabled() {
            r1 = this;
            boolean r0 = r1.holdAtEndEnabled
            return r0
    }

    public void setAllContainerColors(int r1) {
            r0 = this;
            r0.containerColor = r1
            r0.startContainerColor = r1
            r0.endContainerColor = r1
            return
    }

    public void setContainerColor(int r1) {
            r0 = this;
            r0.containerColor = r1
            return
    }

    public void setDrawDebugEnabled(boolean r1) {
            r0 = this;
            r0.drawDebugEnabled = r1
            return
    }

    public void setDrawingViewId(int r1) {
            r0 = this;
            r0.drawingViewId = r1
            return
    }

    public void setElevationShadowEnabled(boolean r1) {
            r0 = this;
            r0.elevationShadowEnabled = r1
            return
    }

    public void setEndContainerColor(int r1) {
            r0 = this;
            r0.endContainerColor = r1
            return
    }

    public void setEndElevation(float r1) {
            r0 = this;
            r0.endElevation = r1
            return
    }

    public void setEndShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel r1) {
            r0 = this;
            r0.endShapeAppearanceModel = r1
            return
    }

    public void setEndView(android.view.View r1) {
            r0 = this;
            r0.endView = r1
            return
    }

    public void setEndViewId(int r1) {
            r0 = this;
            r0.endViewId = r1
            return
    }

    public void setFadeMode(int r1) {
            r0 = this;
            r0.fadeMode = r1
            return
    }

    public void setFadeProgressThresholds(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r1) {
            r0 = this;
            r0.fadeProgressThresholds = r1
            return
    }

    public void setFitMode(int r1) {
            r0 = this;
            r0.fitMode = r1
            return
    }

    public void setHoldAtEndEnabled(boolean r1) {
            r0 = this;
            r0.holdAtEndEnabled = r1
            return
    }

    public void setScaleMaskProgressThresholds(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r1) {
            r0 = this;
            r0.scaleMaskProgressThresholds = r1
            return
    }

    public void setScaleProgressThresholds(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r1) {
            r0 = this;
            r0.scaleProgressThresholds = r1
            return
    }

    public void setScrimColor(int r1) {
            r0 = this;
            r0.scrimColor = r1
            return
    }

    public void setShapeMaskProgressThresholds(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r1) {
            r0 = this;
            r0.shapeMaskProgressThresholds = r1
            return
    }

    public void setStartContainerColor(int r1) {
            r0 = this;
            r0.startContainerColor = r1
            return
    }

    public void setStartElevation(float r1) {
            r0 = this;
            r0.startElevation = r1
            return
    }

    public void setStartShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel r1) {
            r0 = this;
            r0.startShapeAppearanceModel = r1
            return
    }

    public void setStartView(android.view.View r1) {
            r0 = this;
            r0.startView = r1
            return
    }

    public void setStartViewId(int r1) {
            r0 = this;
            r0.startViewId = r1
            return
    }

    public void setTransitionDirection(int r1) {
            r0 = this;
            r0.transitionDirection = r1
            return
    }
}
