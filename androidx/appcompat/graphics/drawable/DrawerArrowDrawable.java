package androidx.appcompat.graphics.drawable;

/* loaded from: classes.dex */
public class DrawerArrowDrawable extends android.graphics.drawable.Drawable {
    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    private static final float ARROW_HEAD_ANGLE = 0.0f;
    private float mArrowHeadLength;
    private float mArrowShaftLength;
    private float mBarGap;
    private float mBarLength;
    private int mDirection;
    private float mMaxCutForBarSize;
    private final android.graphics.Paint mPaint;
    private final android.graphics.Path mPath;
    private float mProgress;
    private final int mSize;
    private boolean mSpin;
    private boolean mVerticalMirror;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ArrowDirection {
    }

    static {
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r0 = java.lang.Math.toRadians(r0)
            float r0 = (float) r0
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable.ARROW_HEAD_ANGLE = r0
            return
    }

    public DrawerArrowDrawable(android.content.Context r7) {
            r6 = this;
            r6.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r6.mPaint = r0
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r6.mPath = r1
            r1 = 0
            r6.mVerticalMirror = r1
            r2 = 2
            r6.mDirection = r2
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r2)
            android.graphics.Paint$Join r2 = android.graphics.Paint.Join.MITER
            r0.setStrokeJoin(r2)
            android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT
            r0.setStrokeCap(r2)
            r2 = 1
            r0.setAntiAlias(r2)
            android.content.res.Resources$Theme r7 = r7.getTheme()
            int[] r0 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle
            int r3 = androidx.appcompat.C0015R.attr.drawerArrowStyle
            int r4 = androidx.appcompat.C0015R.style.Base_Widget_AppCompat_DrawerArrowToggle
            r5 = 0
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r5, r0, r3, r4)
            int r0 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle_color
            int r0 = r7.getColor(r0, r1)
            r6.setColor(r0)
            int r0 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle_thickness
            r3 = 0
            float r0 = r7.getDimension(r0, r3)
            r6.setBarThickness(r0)
            int r0 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle_spinBars
            boolean r0 = r7.getBoolean(r0, r2)
            r6.setSpinEnabled(r0)
            int r0 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle_gapBetweenBars
            float r0 = r7.getDimension(r0, r3)
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r6.setGapSize(r0)
            int r0 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle_drawableSize
            int r0 = r7.getDimensionPixelSize(r0, r1)
            r6.mSize = r0
            int r0 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle_barLength
            float r0 = r7.getDimension(r0, r3)
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r6.mBarLength = r0
            int r0 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle_arrowHeadLength
            float r0 = r7.getDimension(r0, r3)
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r6.mArrowHeadLength = r0
            int r0 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle_arrowShaftLength
            float r0 = r7.getDimension(r0, r3)
            r6.mArrowShaftLength = r0
            r7.recycle()
            return
    }

    private static float lerp(float r0, float r1, float r2) {
            float r1 = r1 - r0
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            android.graphics.Rect r2 = r18.getBounds()
            int r3 = r0.mDirection
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L21
            if (r3 == r5) goto L20
            r6 = 3
            if (r3 == r6) goto L1a
            int r3 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r18)
            if (r3 != r5) goto L21
            goto L20
        L1a:
            int r3 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r18)
            if (r3 != 0) goto L21
        L20:
            r4 = r5
        L21:
            float r3 = r0.mArrowHeadLength
            float r3 = r3 * r3
            r6 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r6
            double r7 = (double) r3
            double r7 = java.lang.Math.sqrt(r7)
            float r3 = (float) r7
            float r7 = r0.mBarLength
            float r8 = r0.mProgress
            float r3 = lerp(r7, r3, r8)
            float r7 = r0.mBarLength
            float r8 = r0.mArrowShaftLength
            float r9 = r0.mProgress
            float r7 = lerp(r7, r8, r9)
            float r8 = r0.mMaxCutForBarSize
            float r9 = r0.mProgress
            r10 = 0
            float r8 = lerp(r10, r8, r9)
            int r8 = java.lang.Math.round(r8)
            float r8 = (float) r8
            float r9 = androidx.appcompat.graphics.drawable.DrawerArrowDrawable.ARROW_HEAD_ANGLE
            float r11 = r0.mProgress
            float r9 = lerp(r10, r9, r11)
            if (r4 == 0) goto L59
            r11 = r10
            goto L5b
        L59:
            r11 = -1020002304(0xffffffffc3340000, float:-180.0)
        L5b:
            r12 = 1127481344(0x43340000, float:180.0)
            if (r4 == 0) goto L61
            r13 = r12
            goto L62
        L61:
            r13 = r10
        L62:
            float r14 = r0.mProgress
            float r11 = lerp(r11, r13, r14)
            double r13 = (double) r3
            r15 = r11
            double r10 = (double) r9
            double r16 = java.lang.Math.cos(r10)
            double r16 = r16 * r13
            r9 = r4
            long r3 = java.lang.Math.round(r16)
            float r3 = (float) r3
            double r10 = java.lang.Math.sin(r10)
            double r13 = r13 * r10
            long r10 = java.lang.Math.round(r13)
            float r4 = (float) r10
            android.graphics.Path r10 = r0.mPath
            r10.rewind()
            float r10 = r0.mBarGap
            android.graphics.Paint r11 = r0.mPaint
            float r11 = r11.getStrokeWidth()
            float r10 = r10 + r11
            float r11 = r0.mMaxCutForBarSize
            float r11 = -r11
            float r13 = r0.mProgress
            float r10 = lerp(r10, r11, r13)
            float r11 = -r7
            float r11 = r11 / r6
            android.graphics.Path r13 = r0.mPath
            float r14 = r11 + r8
            r5 = 0
            r13.moveTo(r14, r5)
            android.graphics.Path r13 = r0.mPath
            float r8 = r8 * r6
            float r7 = r7 - r8
            r13.rLineTo(r7, r5)
            android.graphics.Path r5 = r0.mPath
            r5.moveTo(r11, r10)
            android.graphics.Path r5 = r0.mPath
            r5.rLineTo(r3, r4)
            android.graphics.Path r5 = r0.mPath
            float r7 = -r10
            r5.moveTo(r11, r7)
            android.graphics.Path r5 = r0.mPath
            float r4 = -r4
            r5.rLineTo(r3, r4)
            android.graphics.Path r3 = r0.mPath
            r3.close()
            r19.save()
            android.graphics.Paint r3 = r0.mPaint
            float r3 = r3.getStrokeWidth()
            int r4 = r2.height()
            float r4 = (float) r4
            r5 = 1077936128(0x40400000, float:3.0)
            float r5 = r5 * r3
            float r4 = r4 - r5
            float r5 = r0.mBarGap
            float r6 = r6 * r5
            float r4 = r4 - r6
            int r4 = (int) r4
            int r4 = r4 / 4
            int r4 = r4 * 2
            float r4 = (float) r4
            r6 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r3 * r6
            float r3 = r3 + r5
            float r4 = r4 + r3
            int r2 = r2.centerX()
            float r2 = (float) r2
            r1.translate(r2, r4)
            boolean r2 = r0.mSpin
            if (r2 == 0) goto L100
            boolean r2 = r0.mVerticalMirror
            r2 = r2 ^ r9
            if (r2 == 0) goto Lf8
            r5 = -1
            goto Lf9
        Lf8:
            r5 = 1
        Lf9:
            float r2 = (float) r5
            float r11 = r15 * r2
            r1.rotate(r11)
            goto L105
        L100:
            if (r9 == 0) goto L105
            r1.rotate(r12)
        L105:
            android.graphics.Path r2 = r0.mPath
            android.graphics.Paint r3 = r0.mPaint
            r1.drawPath(r2, r3)
            r19.restore()
            return
    }

    public float getArrowHeadLength() {
            r1 = this;
            float r0 = r1.mArrowHeadLength
            return r0
    }

    public float getArrowShaftLength() {
            r1 = this;
            float r0 = r1.mArrowShaftLength
            return r0
    }

    public float getBarLength() {
            r1 = this;
            float r0 = r1.mBarLength
            return r0
    }

    public float getBarThickness() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            float r0 = r0.getStrokeWidth()
            return r0
    }

    public int getColor() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            int r0 = r0.getColor()
            return r0
    }

    public int getDirection() {
            r1 = this;
            int r0 = r1.mDirection
            return r0
    }

    public float getGapSize() {
            r1 = this;
            float r0 = r1.mBarGap
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            int r0 = r1.mSize
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            int r0 = r1.mSize
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    public final android.graphics.Paint getPaint() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            return r0
    }

    public float getProgress() {
            r1 = this;
            float r0 = r1.mProgress
            return r0
    }

    public boolean isSpinEnabled() {
            r1 = this;
            boolean r0 = r1.mSpin
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            int r0 = r0.getAlpha()
            if (r2 == r0) goto L10
            android.graphics.Paint r0 = r1.mPaint
            r0.setAlpha(r2)
            r1.invalidateSelf()
        L10:
            return
    }

    public void setArrowHeadLength(float r2) {
            r1 = this;
            float r0 = r1.mArrowHeadLength
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mArrowHeadLength = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setArrowShaftLength(float r2) {
            r1 = this;
            float r0 = r1.mArrowShaftLength
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mArrowShaftLength = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setBarLength(float r2) {
            r1 = this;
            float r0 = r1.mBarLength
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mBarLength = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setBarThickness(float r5) {
            r4 = this;
            android.graphics.Paint r0 = r4.mPaint
            float r0 = r0.getStrokeWidth()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L21
            android.graphics.Paint r0 = r4.mPaint
            r0.setStrokeWidth(r5)
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            double r0 = (double) r5
            float r5 = androidx.appcompat.graphics.drawable.DrawerArrowDrawable.ARROW_HEAD_ANGLE
            double r2 = (double) r5
            double r2 = java.lang.Math.cos(r2)
            double r0 = r0 * r2
            float r5 = (float) r0
            r4.mMaxCutForBarSize = r5
            r4.invalidateSelf()
        L21:
            return
    }

    public void setColor(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            int r0 = r0.getColor()
            if (r2 == r0) goto L10
            android.graphics.Paint r0 = r1.mPaint
            r0.setColor(r2)
            r1.invalidateSelf()
        L10:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    public void setDirection(int r2) {
            r1 = this;
            int r0 = r1.mDirection
            if (r2 == r0) goto L9
            r1.mDirection = r2
            r1.invalidateSelf()
        L9:
            return
    }

    public void setGapSize(float r2) {
            r1 = this;
            float r0 = r1.mBarGap
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mBarGap = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setProgress(float r2) {
            r1 = this;
            float r0 = r1.mProgress
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mProgress = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setSpinEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mSpin
            if (r0 == r2) goto L9
            r1.mSpin = r2
            r1.invalidateSelf()
        L9:
            return
    }

    public void setVerticalMirror(boolean r2) {
            r1 = this;
            boolean r0 = r1.mVerticalMirror
            if (r0 == r2) goto L9
            r1.mVerticalMirror = r2
            r1.invalidateSelf()
        L9:
            return
    }
}
