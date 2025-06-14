package androidx.constraintlayout.utils.widget;

/* loaded from: classes.dex */
public class MotionTelltales extends androidx.constraintlayout.utils.widget.MockView {
    private static final java.lang.String TAG = "MotionTelltales";
    android.graphics.Matrix mInvertMatrix;
    androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;
    private android.graphics.Paint mPaintTelltales;
    int mTailColor;
    float mTailScale;
    int mVelocityMode;
    float[] velocity;

    public MotionTelltales(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.mPaintTelltales = r0
            r0 = 2
            float[] r0 = new float[r0]
            r1.velocity = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.mInvertMatrix = r0
            r0 = 0
            r1.mVelocityMode = r0
            r0 = -65281(0xffffffffffff00ff, float:NaN)
            r1.mTailColor = r0
            r0 = 1048576000(0x3e800000, float:0.25)
            r1.mTailScale = r0
            r0 = 0
            r1.init(r2, r0)
            return
    }

    public MotionTelltales(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.mPaintTelltales = r0
            r0 = 2
            float[] r0 = new float[r0]
            r1.velocity = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.mInvertMatrix = r0
            r0 = 0
            r1.mVelocityMode = r0
            r0 = -65281(0xffffffffffff00ff, float:NaN)
            r1.mTailColor = r0
            r0 = 1048576000(0x3e800000, float:0.25)
            r1.mTailScale = r0
            r1.init(r2, r3)
            return
    }

    public MotionTelltales(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r0.mPaintTelltales = r3
            r3 = 2
            float[] r3 = new float[r3]
            r0.velocity = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r0.mInvertMatrix = r3
            r3 = 0
            r0.mVelocityMode = r3
            r3 = -65281(0xffffffffffff00ff, float:NaN)
            r0.mTailColor = r3
            r3 = 1048576000(0x3e800000, float:0.25)
            r0.mTailScale = r3
            r0.init(r1, r2)
            return
    }

    private void init(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            if (r5 == 0) goto L3f
            int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.MotionTelltales
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            int r5 = r4.getIndexCount()
            r0 = 0
        Ld:
            if (r0 >= r5) goto L3c
            int r1 = r4.getIndex(r0)
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.MotionTelltales_telltales_tailColor
            if (r1 != r2) goto L20
            int r2 = r3.mTailColor
            int r1 = r4.getColor(r1, r2)
            r3.mTailColor = r1
            goto L39
        L20:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.MotionTelltales_telltales_velocityMode
            if (r1 != r2) goto L2d
            int r2 = r3.mVelocityMode
            int r1 = r4.getInt(r1, r2)
            r3.mVelocityMode = r1
            goto L39
        L2d:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.MotionTelltales_telltales_tailScale
            if (r1 != r2) goto L39
            float r2 = r3.mTailScale
            float r1 = r4.getFloat(r1, r2)
            r3.mTailScale = r1
        L39:
            int r0 = r0 + 1
            goto Ld
        L3c:
            r4.recycle()
        L3f:
            android.graphics.Paint r4 = r3.mPaintTelltales
            int r5 = r3.mTailColor
            r4.setColor(r5)
            android.graphics.Paint r4 = r3.mPaintTelltales
            r5 = 1084227584(0x40a00000, float:5.0)
            r4.setStrokeWidth(r5)
            return
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            return
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(android.graphics.Canvas r23) {
            r22 = this;
            r6 = r22
            super.onDraw(r23)
            android.graphics.Matrix r0 = r22.getMatrix()
            android.graphics.Matrix r1 = r6.mInvertMatrix
            r0.invert(r1)
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r6.mMotionLayout
            if (r0 != 0) goto L1f
            android.view.ViewParent r0 = r22.getParent()
            boolean r1 = r0 instanceof androidx.constraintlayout.motion.widget.MotionLayout
            if (r1 == 0) goto L1e
            androidx.constraintlayout.motion.widget.MotionLayout r0 = (androidx.constraintlayout.motion.widget.MotionLayout) r0
            r6.mMotionLayout = r0
        L1e:
            return
        L1f:
            int r7 = r22.getWidth()
            int r8 = r22.getHeight()
            r9 = 5
            float[] r10 = new float[r9]
            r10 = {x0076: FILL_ARRAY_DATA , data: [1036831949, 1048576000, 1056964608, 1061158912, 1063675494} // fill-array
            r11 = 0
            r12 = r11
        L2f:
            if (r12 >= r9) goto L75
            r13 = r10[r12]
            r14 = r11
        L34:
            if (r14 >= r9) goto L72
            r15 = r10[r14]
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r6.mMotionLayout
            float[] r4 = r6.velocity
            int r5 = r6.mVelocityMode
            r1 = r22
            r2 = r15
            r3 = r13
            r0.getViewVelocity(r1, r2, r3, r4, r5)
            android.graphics.Matrix r0 = r6.mInvertMatrix
            float[] r1 = r6.velocity
            r0.mapVectors(r1)
            float r0 = (float) r7
            float r17 = r0 * r15
            float r0 = (float) r8
            float r18 = r0 * r13
            float[] r0 = r6.velocity
            r1 = r0[r11]
            float r2 = r6.mTailScale
            float r1 = r1 * r2
            float r19 = r17 - r1
            r1 = 1
            r1 = r0[r1]
            float r1 = r1 * r2
            float r20 = r18 - r1
            android.graphics.Matrix r1 = r6.mInvertMatrix
            r1.mapVectors(r0)
            android.graphics.Paint r0 = r6.mPaintTelltales
            r16 = r23
            r21 = r0
            r16.drawLine(r17, r18, r19, r20, r21)
            int r14 = r14 + 1
            goto L34
        L72:
            int r12 = r12 + 1
            goto L2f
        L75:
            return
    }

    @Override // android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r0.postInvalidate()
            return
    }

    public void setText(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            r0.mText = r1
            r0.requestLayout()
            return
    }
}
