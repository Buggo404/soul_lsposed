package androidx.constraintlayout.utils.widget;

/* loaded from: classes.dex */
public class MotionButton extends androidx.appcompat.widget.AppCompatButton {
    private android.graphics.Path mPath;
    android.graphics.RectF mRect;
    private float mRound;
    private float mRoundPercent;
    android.view.ViewOutlineProvider mViewOutlineProvider;



    public MotionButton(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.mRoundPercent = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mRound = r0
            r0 = 0
            r1.init(r2, r0)
            return
    }

    public MotionButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 0
            r1.mRoundPercent = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mRound = r0
            r1.init(r2, r3)
            return
    }

    public MotionButton(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r3 = 0
            r0.mRoundPercent = r3
            r3 = 2143289344(0x7fc00000, float:NaN)
            r0.mRound = r3
            r0.init(r1, r2)
            return
    }

    static /* synthetic */ float access$000(androidx.constraintlayout.utils.widget.MotionButton r0) {
            float r0 = r0.mRoundPercent
            return r0
    }

    static /* synthetic */ float access$100(androidx.constraintlayout.utils.widget.MotionButton r0) {
            float r0 = r0.mRound
            return r0
    }

    private void init(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r5 = 0
            r4.setPadding(r5, r5, r5, r5)
            if (r6 == 0) goto L38
            android.content.Context r0 = r4.getContext()
            int[] r1 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r1)
            int r0 = r6.getIndexCount()
        L14:
            if (r5 >= r0) goto L35
            int r1 = r6.getIndex(r5)
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_round
            r3 = 0
            if (r1 != r2) goto L27
            float r1 = r6.getDimension(r1, r3)
            r4.setRound(r1)
            goto L32
        L27:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_roundPercent
            if (r1 != r2) goto L32
            float r1 = r6.getFloat(r1, r3)
            r4.setRoundPercent(r1)
        L32:
            int r5 = r5 + 1
            goto L14
        L35:
            r6.recycle()
        L38:
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            super.draw(r1)
            return
    }

    public float getRound() {
            r1 = this;
            float r0 = r1.mRound
            return r0
    }

    public float getRoundPercent() {
            r1 = this;
            float r0 = r1.mRoundPercent
            return r0
    }

    public void setRound(float r5) {
            r4 = this;
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 == 0) goto L12
            r4.mRound = r5
            float r5 = r4.mRoundPercent
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.mRoundPercent = r0
            r4.setRoundPercent(r5)
            return
        L12:
            float r0 = r4.mRound
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            r0 = r1
            goto L1d
        L1c:
            r0 = r2
        L1d:
            r4.mRound = r5
            r3 = 0
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L6b
            android.graphics.Path r5 = r4.mPath
            if (r5 != 0) goto L2f
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            r4.mPath = r5
        L2f:
            android.graphics.RectF r5 = r4.mRect
            if (r5 != 0) goto L3a
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r4.mRect = r5
        L3a:
            android.view.ViewOutlineProvider r5 = r4.mViewOutlineProvider
            if (r5 != 0) goto L48
            androidx.constraintlayout.utils.widget.MotionButton$2 r5 = new androidx.constraintlayout.utils.widget.MotionButton$2
            r5.<init>(r4)
            r4.mViewOutlineProvider = r5
            r4.setOutlineProvider(r5)
        L48:
            r4.setClipToOutline(r1)
            int r5 = r4.getWidth()
            int r1 = r4.getHeight()
            android.graphics.RectF r2 = r4.mRect
            float r5 = (float) r5
            float r1 = (float) r1
            r2.set(r3, r3, r5, r1)
            android.graphics.Path r5 = r4.mPath
            r5.reset()
            android.graphics.Path r5 = r4.mPath
            android.graphics.RectF r1 = r4.mRect
            float r2 = r4.mRound
            android.graphics.Path$Direction r3 = android.graphics.Path.Direction.CW
            r5.addRoundRect(r1, r2, r2, r3)
            goto L6e
        L6b:
            r4.setClipToOutline(r2)
        L6e:
            if (r0 == 0) goto L73
            r4.invalidateOutline()
        L73:
            return
    }

    public void setRoundPercent(float r6) {
            r5 = this;
            float r0 = r5.mRoundPercent
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            r0 = r1
            goto Lb
        La:
            r0 = r2
        Lb:
            r5.mRoundPercent = r6
            r3 = 0
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 == 0) goto L62
            android.graphics.Path r6 = r5.mPath
            if (r6 != 0) goto L1d
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r5.mPath = r6
        L1d:
            android.graphics.RectF r6 = r5.mRect
            if (r6 != 0) goto L28
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>()
            r5.mRect = r6
        L28:
            android.view.ViewOutlineProvider r6 = r5.mViewOutlineProvider
            if (r6 != 0) goto L36
            androidx.constraintlayout.utils.widget.MotionButton$1 r6 = new androidx.constraintlayout.utils.widget.MotionButton$1
            r6.<init>(r5)
            r5.mViewOutlineProvider = r6
            r5.setOutlineProvider(r6)
        L36:
            r5.setClipToOutline(r1)
            int r6 = r5.getWidth()
            int r1 = r5.getHeight()
            int r2 = java.lang.Math.min(r6, r1)
            float r2 = (float) r2
            float r4 = r5.mRoundPercent
            float r2 = r2 * r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            android.graphics.RectF r4 = r5.mRect
            float r6 = (float) r6
            float r1 = (float) r1
            r4.set(r3, r3, r6, r1)
            android.graphics.Path r6 = r5.mPath
            r6.reset()
            android.graphics.Path r6 = r5.mPath
            android.graphics.RectF r1 = r5.mRect
            android.graphics.Path$Direction r3 = android.graphics.Path.Direction.CW
            r6.addRoundRect(r1, r2, r2, r3)
            goto L65
        L62:
            r5.setClipToOutline(r2)
        L65:
            if (r0 == 0) goto L6a
            r5.invalidateOutline()
        L6a:
            return
    }
}
