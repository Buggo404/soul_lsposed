package com.google.android.material.timepicker;

/* loaded from: classes.dex */
class ClockHandView extends android.view.View {
    private static final int ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private final java.util.List<com.google.android.material.timepicker.ClockHandView.OnRotateListener> listeners;
    private com.google.android.material.timepicker.ClockHandView.OnActionUpListener onActionUpListener;
    private float originalDeg;
    private final android.graphics.Paint paint;
    private android.animation.ValueAnimator rotationAnimator;
    private int scaledTouchSlop;
    private final android.graphics.RectF selectorBox;
    private final int selectorRadius;
    private final int selectorStrokeWidth;



    public interface OnActionUpListener {
        void onActionUp(float r1, boolean r2);
    }

    public interface OnRotateListener {
        void onRotate(float r1, boolean r2);
    }

    public ClockHandView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ClockHandView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.materialClockStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ClockHandView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.listeners = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.paint = r0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r3.selectorBox = r1
            int[] r1 = com.google.android.material.C0479R.styleable.ClockHandView
            int r2 = com.google.android.material.C0479R.style.Widget_MaterialComponents_TimePicker_Clock
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1, r6, r2)
            int r6 = com.google.android.material.C0479R.styleable.ClockHandView_materialCircleRadius
            r1 = 0
            int r6 = r5.getDimensionPixelSize(r6, r1)
            r3.circleRadius = r6
            int r6 = com.google.android.material.C0479R.styleable.ClockHandView_selectorSize
            int r6 = r5.getDimensionPixelSize(r6, r1)
            r3.selectorRadius = r6
            android.content.res.Resources r6 = r3.getResources()
            int r2 = com.google.android.material.C0479R.dimen.material_clock_hand_stroke_width
            int r2 = r6.getDimensionPixelSize(r2)
            r3.selectorStrokeWidth = r2
            int r2 = com.google.android.material.C0479R.dimen.material_clock_hand_center_dot_radius
            int r6 = r6.getDimensionPixelSize(r2)
            float r6 = (float) r6
            r3.centerDotRadius = r6
            int r6 = com.google.android.material.C0479R.styleable.ClockHandView_clockHandColor
            int r6 = r5.getColor(r6, r1)
            r1 = 1
            r0.setAntiAlias(r1)
            r0.setColor(r6)
            r6 = 0
            r3.setHandRotation(r6)
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            int r4 = r4.getScaledTouchSlop()
            r3.scaledTouchSlop = r4
            r4 = 2
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r4)
            r5.recycle()
            return
    }

    static /* synthetic */ void access$000(com.google.android.material.timepicker.ClockHandView r0, float r1, boolean r2) {
            r0.setHandRotationInternal(r1, r2)
            return
    }

    private void drawSelector(android.graphics.Canvas r11) {
            r10 = this;
            int r0 = r10.getHeight()
            int r0 = r0 / 2
            int r1 = r10.getWidth()
            int r1 = r1 / 2
            float r8 = (float) r1
            int r2 = r10.circleRadius
            float r2 = (float) r2
            double r3 = r10.degRad
            double r3 = java.lang.Math.cos(r3)
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r8
            float r9 = (float) r0
            int r3 = r10.circleRadius
            float r3 = (float) r3
            double r4 = r10.degRad
            double r4 = java.lang.Math.sin(r4)
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r9
            android.graphics.Paint r4 = r10.paint
            r5 = 0
            r4.setStrokeWidth(r5)
            int r4 = r10.selectorRadius
            float r4 = (float) r4
            android.graphics.Paint r5 = r10.paint
            r11.drawCircle(r2, r3, r4, r5)
            double r2 = r10.degRad
            double r2 = java.lang.Math.sin(r2)
            double r4 = r10.degRad
            double r4 = java.lang.Math.cos(r4)
            int r6 = r10.circleRadius
            int r7 = r10.selectorRadius
            int r6 = r6 - r7
            float r6 = (float) r6
            double r6 = (double) r6
            double r4 = r4 * r6
            int r4 = (int) r4
            int r1 = r1 + r4
            float r5 = (float) r1
            double r6 = r6 * r2
            int r1 = (int) r6
            int r0 = r0 + r1
            float r6 = (float) r0
            android.graphics.Paint r0 = r10.paint
            int r1 = r10.selectorStrokeWidth
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            android.graphics.Paint r7 = r10.paint
            r2 = r11
            r3 = r8
            r4 = r9
            r2.drawLine(r3, r4, r5, r6, r7)
            float r0 = r10.centerDotRadius
            android.graphics.Paint r1 = r10.paint
            r11.drawCircle(r8, r9, r0, r1)
            return
    }

    private int getDegreesFromXY(float r5, float r6) {
            r4 = this;
            int r0 = r4.getWidth()
            int r0 = r0 / 2
            int r1 = r4.getHeight()
            int r1 = r1 / 2
            float r0 = (float) r0
            float r5 = r5 - r0
            double r2 = (double) r5
            float r5 = (float) r1
            float r6 = r6 - r5
            double r5 = (double) r6
            double r5 = java.lang.Math.atan2(r5, r2)
            double r5 = java.lang.Math.toDegrees(r5)
            int r5 = (int) r5
            int r5 = r5 + 90
            if (r5 >= 0) goto L21
            int r5 = r5 + 360
        L21:
            return r5
    }

    private android.util.Pair<java.lang.Float, java.lang.Float> getValuesForAnimation(float r5) {
            r4 = this;
            float r0 = r4.getHandRotation()
            float r1 = r0 - r5
            float r1 = java.lang.Math.abs(r1)
            r2 = 1127481344(0x43340000, float:180.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L24
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1135869952(0x43b40000, float:360.0)
            if (r1 <= 0) goto L1b
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 >= 0) goto L1b
            float r5 = r5 + r3
        L1b:
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 >= 0) goto L24
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 <= 0) goto L24
            float r0 = r0 + r3
        L24:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r1.<init>(r0, r5)
            return r1
    }

    private boolean handleTouchInput(float r3, float r4, boolean r5, boolean r6, boolean r7) {
            r2 = this;
            int r3 = r2.getDegreesFromXY(r3, r4)
            float r4 = r2.getHandRotation()
            float r3 = (float) r3
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L11
            r4 = r1
            goto L12
        L11:
            r4 = r0
        L12:
            if (r6 == 0) goto L17
            if (r4 == 0) goto L17
            return r1
        L17:
            if (r4 != 0) goto L1d
            if (r5 == 0) goto L1c
            goto L1d
        L1c:
            return r0
        L1d:
            if (r7 == 0) goto L24
            boolean r4 = r2.animatingOnTouchUp
            if (r4 == 0) goto L24
            r0 = r1
        L24:
            r2.setHandRotation(r3, r0)
            return r1
    }

    private void setHandRotationInternal(float r8, boolean r9) {
            r7 = this;
            r0 = 1135869952(0x43b40000, float:360.0)
            float r8 = r8 % r0
            r7.originalDeg = r8
            r0 = 1119092736(0x42b40000, float:90.0)
            float r0 = r8 - r0
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            r7.degRad = r0
            int r0 = r7.getHeight()
            int r0 = r0 / 2
            int r1 = r7.getWidth()
            int r1 = r1 / 2
            float r1 = (float) r1
            int r2 = r7.circleRadius
            float r2 = (float) r2
            double r3 = r7.degRad
            double r3 = java.lang.Math.cos(r3)
            float r3 = (float) r3
            float r2 = r2 * r3
            float r1 = r1 + r2
            float r0 = (float) r0
            int r2 = r7.circleRadius
            float r2 = (float) r2
            double r3 = r7.degRad
            double r3 = java.lang.Math.sin(r3)
            float r3 = (float) r3
            float r2 = r2 * r3
            float r0 = r0 + r2
            android.graphics.RectF r2 = r7.selectorBox
            int r3 = r7.selectorRadius
            float r4 = (float) r3
            float r4 = r1 - r4
            float r5 = (float) r3
            float r5 = r0 - r5
            float r6 = (float) r3
            float r1 = r1 + r6
            float r3 = (float) r3
            float r0 = r0 + r3
            r2.set(r4, r5, r1, r0)
            java.util.List<com.google.android.material.timepicker.ClockHandView$OnRotateListener> r0 = r7.listeners
            java.util.Iterator r0 = r0.iterator()
        L4d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r0.next()
            com.google.android.material.timepicker.ClockHandView$OnRotateListener r1 = (com.google.android.material.timepicker.ClockHandView.OnRotateListener) r1
            r1.onRotate(r8, r9)
            goto L4d
        L5d:
            r7.invalidate()
            return
    }

    public void addOnRotateListener(com.google.android.material.timepicker.ClockHandView.OnRotateListener r2) {
            r1 = this;
            java.util.List<com.google.android.material.timepicker.ClockHandView$OnRotateListener> r0 = r1.listeners
            r0.add(r2)
            return
    }

    public android.graphics.RectF getCurrentSelectorBox() {
            r1 = this;
            android.graphics.RectF r0 = r1.selectorBox
            return r0
    }

    public float getHandRotation() {
            r1 = this;
            float r0 = r1.originalDeg
            return r0
    }

    public int getSelectorRadius() {
            r1 = this;
            int r0 = r1.selectorRadius
            return r0
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)
            r0.drawSelector(r1)
            return
    }

    @Override // android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            float r1 = r0.getHandRotation()
            r0.setHandRotation(r1)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r11) {
            r10 = this;
            int r0 = r11.getActionMasked()
            float r7 = r11.getX()
            float r11 = r11.getY()
            r8 = 1
            r1 = 0
            if (r0 == 0) goto L39
            if (r0 == r8) goto L19
            r2 = 2
            if (r0 == r2) goto L19
            r0 = r1
            r4 = r0
            r5 = r4
            goto L44
        L19:
            float r2 = r10.downX
            float r2 = r7 - r2
            int r2 = (int) r2
            float r3 = r10.downY
            float r3 = r11 - r3
            int r3 = (int) r3
            int r2 = r2 * r2
            int r3 = r3 * r3
            int r2 = r2 + r3
            int r3 = r10.scaledTouchSlop
            if (r2 <= r3) goto L2c
            r2 = r8
            goto L2d
        L2c:
            r2 = r1
        L2d:
            r10.isInTapRegion = r2
            boolean r2 = r10.changedDuringTouch
            if (r0 != r8) goto L35
            r0 = r8
            goto L36
        L35:
            r0 = r1
        L36:
            r5 = r1
            r4 = r2
            goto L44
        L39:
            r10.downX = r7
            r10.downY = r11
            r10.isInTapRegion = r8
            r10.changedDuringTouch = r1
            r0 = r1
            r4 = r0
            r5 = r8
        L44:
            boolean r9 = r10.changedDuringTouch
            r1 = r10
            r2 = r7
            r3 = r11
            r6 = r0
            boolean r1 = r1.handleTouchInput(r2, r3, r4, r5, r6)
            r1 = r1 | r9
            r10.changedDuringTouch = r1
            if (r1 == 0) goto L63
            if (r0 == 0) goto L63
            com.google.android.material.timepicker.ClockHandView$OnActionUpListener r0 = r10.onActionUpListener
            if (r0 == 0) goto L63
            int r11 = r10.getDegreesFromXY(r7, r11)
            float r11 = (float) r11
            boolean r1 = r10.isInTapRegion
            r0.onActionUp(r11, r1)
        L63:
            return r8
    }

    public void setAnimateOnTouchUp(boolean r1) {
            r0 = this;
            r0.animatingOnTouchUp = r1
            return
    }

    public void setCircleRadius(int r1) {
            r0 = this;
            r0.circleRadius = r1
            r0.invalidate()
            return
    }

    public void setHandRotation(float r2) {
            r1 = this;
            r0 = 0
            r1.setHandRotation(r2, r0)
            return
    }

    public void setHandRotation(float r3, boolean r4) {
            r2 = this;
            android.animation.ValueAnimator r0 = r2.rotationAnimator
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            r0 = 0
            if (r4 != 0) goto Le
            r2.setHandRotationInternal(r3, r0)
            return
        Le:
            android.util.Pair r3 = r2.getValuesForAnimation(r3)
            r4 = 2
            float[] r4 = new float[r4]
            java.lang.Object r1 = r3.first
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r4[r0] = r1
            java.lang.Object r3 = r3.second
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r0 = 1
            r4[r0] = r3
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r4)
            r2.rotationAnimator = r3
            r0 = 200(0xc8, double:9.9E-322)
            r3.setDuration(r0)
            android.animation.ValueAnimator r3 = r2.rotationAnimator
            com.google.android.material.timepicker.ClockHandView$1 r4 = new com.google.android.material.timepicker.ClockHandView$1
            r4.<init>(r2)
            r3.addUpdateListener(r4)
            android.animation.ValueAnimator r3 = r2.rotationAnimator
            com.google.android.material.timepicker.ClockHandView$2 r4 = new com.google.android.material.timepicker.ClockHandView$2
            r4.<init>(r2)
            r3.addListener(r4)
            android.animation.ValueAnimator r3 = r2.rotationAnimator
            r3.start()
            return
    }

    public void setOnActionUpListener(com.google.android.material.timepicker.ClockHandView.OnActionUpListener r1) {
            r0 = this;
            r0.onActionUpListener = r1
            return
    }
}
