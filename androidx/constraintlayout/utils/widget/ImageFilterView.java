package androidx.constraintlayout.utils.widget;

/* loaded from: classes.dex */
public class ImageFilterView extends androidx.appcompat.widget.AppCompatImageView {
    private android.graphics.drawable.Drawable mAltDrawable;
    private float mCrossfade;
    private android.graphics.drawable.Drawable mDrawable;
    private androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix mImageMatrix;
    android.graphics.drawable.LayerDrawable mLayer;
    android.graphics.drawable.Drawable[] mLayers;
    private boolean mOverlay;
    float mPanX;
    float mPanY;
    private android.graphics.Path mPath;
    android.graphics.RectF mRect;
    float mRotate;
    private float mRound;
    private float mRoundPercent;
    android.view.ViewOutlineProvider mViewOutlineProvider;
    float mZoom;



    static class ImageMatrix {

        /* renamed from: m */
        float[] f56m;
        float mBrightness;
        android.graphics.ColorMatrix mColorMatrix;
        float mContrast;
        float mSaturation;
        android.graphics.ColorMatrix mTmpColorMatrix;
        float mWarmth;

        ImageMatrix() {
                r1 = this;
                r1.<init>()
                r0 = 20
                float[] r0 = new float[r0]
                r1.f56m = r0
                android.graphics.ColorMatrix r0 = new android.graphics.ColorMatrix
                r0.<init>()
                r1.mColorMatrix = r0
                android.graphics.ColorMatrix r0 = new android.graphics.ColorMatrix
                r0.<init>()
                r1.mTmpColorMatrix = r0
                r0 = 1065353216(0x3f800000, float:1.0)
                r1.mBrightness = r0
                r1.mSaturation = r0
                r1.mContrast = r0
                r1.mWarmth = r0
                return
        }

        private void brightness(float r4) {
                r3 = this;
                float[] r0 = r3.f56m
                r1 = 0
                r0[r1] = r4
                r1 = 1
                r2 = 0
                r0[r1] = r2
                r1 = 2
                r0[r1] = r2
                r1 = 3
                r0[r1] = r2
                r1 = 4
                r0[r1] = r2
                r1 = 5
                r0[r1] = r2
                r1 = 6
                r0[r1] = r4
                r1 = 7
                r0[r1] = r2
                r1 = 8
                r0[r1] = r2
                r1 = 9
                r0[r1] = r2
                r1 = 10
                r0[r1] = r2
                r1 = 11
                r0[r1] = r2
                r1 = 12
                r0[r1] = r4
                r4 = 13
                r0[r4] = r2
                r4 = 14
                r0[r4] = r2
                r4 = 15
                r0[r4] = r2
                r4 = 16
                r0[r4] = r2
                r4 = 17
                r0[r4] = r2
                r4 = 18
                r1 = 1065353216(0x3f800000, float:1.0)
                r0[r4] = r1
                r4 = 19
                r0[r4] = r2
                return
        }

        private void saturation(float r9) {
                r8 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                float r1 = r0 - r9
                r2 = 1050250366(0x3e998c7e, float:0.2999)
                float r2 = r2 * r1
                r3 = 1058424226(0x3f1645a2, float:0.587)
                float r3 = r3 * r1
                r4 = 1038710997(0x3de978d5, float:0.114)
                float r1 = r1 * r4
                float[] r4 = r8.f56m
                r5 = 0
                float r6 = r2 + r9
                r4[r5] = r6
                r5 = 1
                r4[r5] = r3
                r5 = 2
                r4[r5] = r1
                r5 = 3
                r6 = 0
                r4[r5] = r6
                r5 = 4
                r4[r5] = r6
                r5 = 5
                r4[r5] = r2
                r5 = 6
                float r7 = r3 + r9
                r4[r5] = r7
                r5 = 7
                r4[r5] = r1
                r5 = 8
                r4[r5] = r6
                r5 = 9
                r4[r5] = r6
                r5 = 10
                r4[r5] = r2
                r2 = 11
                r4[r2] = r3
                r2 = 12
                float r1 = r1 + r9
                r4[r2] = r1
                r9 = 13
                r4[r9] = r6
                r9 = 14
                r4[r9] = r6
                r9 = 15
                r4[r9] = r6
                r9 = 16
                r4[r9] = r6
                r9 = 17
                r4[r9] = r6
                r9 = 18
                r4[r9] = r0
                r9 = 19
                r4[r9] = r6
                return
        }

        private void warmth(float r12) {
                r11 = this;
                r0 = 0
                int r1 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r1 > 0) goto L8
                r12 = 1008981770(0x3c23d70a, float:0.01)
            L8:
                r1 = 1167867904(0x459c4000, float:5000.0)
                float r1 = r1 / r12
                r12 = 1120403456(0x42c80000, float:100.0)
                float r1 = r1 / r12
                r12 = 1115947008(0x42840000, float:66.0)
                int r2 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
                r3 = 1126243996(0x43211e9c, float:161.11957)
                r4 = 1120334093(0x42c6f10d, float:99.4708)
                r5 = 1132396544(0x437f0000, float:255.0)
                if (r2 <= 0) goto L3f
                r2 = 1114636288(0x42700000, float:60.0)
                float r2 = r1 - r2
                double r6 = (double) r2
                r8 = -4629404809370271744(0xbfc10cda80000000, double:-0.13320475816726685)
                double r8 = java.lang.Math.pow(r6, r8)
                float r2 = (float) r8
                r8 = 1134877040(0x43a4d970, float:329.69873)
                float r2 = r2 * r8
                r8 = 4590105838747648000(0x3fb354f0e0000000, double:0.07551484555006027)
                double r6 = java.lang.Math.pow(r6, r8)
                float r6 = (float) r6
                r7 = 1133514659(0x43900fa3, float:288.12216)
                float r6 = r6 * r7
                goto L49
            L3f:
                double r6 = (double) r1
                double r6 = java.lang.Math.log(r6)
                float r2 = (float) r6
                float r2 = r2 * r4
                float r6 = r2 - r3
                r2 = r5
            L49:
                int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
                r7 = 1134069180(0x439885bc, float:305.0448)
                r8 = 1124762762(0x430a848a, float:138.51773)
                if (r12 >= 0) goto L67
                r12 = 1100480512(0x41980000, float:19.0)
                int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
                if (r12 <= 0) goto L65
                r12 = 1092616192(0x41200000, float:10.0)
                float r1 = r1 - r12
                double r9 = (double) r1
                double r9 = java.lang.Math.log(r9)
                float r12 = (float) r9
                float r12 = r12 * r8
                float r12 = r12 - r7
                goto L68
            L65:
                r12 = r0
                goto L68
            L67:
                r12 = r5
            L68:
                float r1 = java.lang.Math.max(r2, r0)
                float r1 = java.lang.Math.min(r5, r1)
                float r2 = java.lang.Math.max(r6, r0)
                float r2 = java.lang.Math.min(r5, r2)
                float r12 = java.lang.Math.max(r12, r0)
                float r12 = java.lang.Math.min(r5, r12)
                r6 = 1112014848(0x42480000, float:50.0)
                double r9 = (double) r6
                double r9 = java.lang.Math.log(r9)
                float r6 = (float) r9
                float r6 = r6 * r4
                float r6 = r6 - r3
                r3 = 1109393408(0x42200000, float:40.0)
                double r3 = (double) r3
                double r3 = java.lang.Math.log(r3)
                float r3 = (float) r3
                float r3 = r3 * r8
                float r3 = r3 - r7
                float r4 = java.lang.Math.max(r5, r0)
                float r4 = java.lang.Math.min(r5, r4)
                float r6 = java.lang.Math.max(r6, r0)
                float r6 = java.lang.Math.min(r5, r6)
                float r3 = java.lang.Math.max(r3, r0)
                float r3 = java.lang.Math.min(r5, r3)
                float r1 = r1 / r4
                float r2 = r2 / r6
                float r12 = r12 / r3
                float[] r3 = r11.f56m
                r4 = 0
                r3[r4] = r1
                r1 = 1
                r3[r1] = r0
                r1 = 2
                r3[r1] = r0
                r1 = 3
                r3[r1] = r0
                r1 = 4
                r3[r1] = r0
                r1 = 5
                r3[r1] = r0
                r1 = 6
                r3[r1] = r2
                r1 = 7
                r3[r1] = r0
                r1 = 8
                r3[r1] = r0
                r1 = 9
                r3[r1] = r0
                r1 = 10
                r3[r1] = r0
                r1 = 11
                r3[r1] = r0
                r1 = 12
                r3[r1] = r12
                r12 = 13
                r3[r12] = r0
                r12 = 14
                r3[r12] = r0
                r12 = 15
                r3[r12] = r0
                r12 = 16
                r3[r12] = r0
                r12 = 17
                r3[r12] = r0
                r12 = 18
                r1 = 1065353216(0x3f800000, float:1.0)
                r3[r12] = r1
                r12 = 19
                r3[r12] = r0
                return
        }

        void updateMatrix(android.widget.ImageView r6) {
                r5 = this;
                android.graphics.ColorMatrix r0 = r5.mColorMatrix
                r0.reset()
                float r0 = r5.mSaturation
                r1 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                r3 = 1
                if (r2 == 0) goto L1a
                r5.saturation(r0)
                android.graphics.ColorMatrix r0 = r5.mColorMatrix
                float[] r2 = r5.f56m
                r0.set(r2)
                r0 = r3
                goto L1b
            L1a:
                r0 = 0
            L1b:
                float r2 = r5.mContrast
                int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r4 == 0) goto L2e
                android.graphics.ColorMatrix r0 = r5.mTmpColorMatrix
                r0.setScale(r2, r2, r2, r1)
                android.graphics.ColorMatrix r0 = r5.mColorMatrix
                android.graphics.ColorMatrix r2 = r5.mTmpColorMatrix
                r0.postConcat(r2)
                r0 = r3
            L2e:
                float r2 = r5.mWarmth
                int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r4 == 0) goto L46
                r5.warmth(r2)
                android.graphics.ColorMatrix r0 = r5.mTmpColorMatrix
                float[] r2 = r5.f56m
                r0.set(r2)
                android.graphics.ColorMatrix r0 = r5.mColorMatrix
                android.graphics.ColorMatrix r2 = r5.mTmpColorMatrix
                r0.postConcat(r2)
                r0 = r3
            L46:
                float r2 = r5.mBrightness
                int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r1 == 0) goto L5e
                r5.brightness(r2)
                android.graphics.ColorMatrix r0 = r5.mTmpColorMatrix
                float[] r1 = r5.f56m
                r0.set(r1)
                android.graphics.ColorMatrix r0 = r5.mColorMatrix
                android.graphics.ColorMatrix r1 = r5.mTmpColorMatrix
                r0.postConcat(r1)
                goto L5f
            L5e:
                r3 = r0
            L5f:
                if (r3 == 0) goto L6c
                android.graphics.ColorMatrixColorFilter r0 = new android.graphics.ColorMatrixColorFilter
                android.graphics.ColorMatrix r1 = r5.mColorMatrix
                r0.<init>(r1)
                r6.setColorFilter(r0)
                goto L6f
            L6c:
                r6.clearColorFilter()
            L6f:
                return
        }
    }

    public ImageFilterView(android.content.Context r4) {
            r3 = this;
            r3.<init>(r4)
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = new androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix
            r0.<init>()
            r3.mImageMatrix = r0
            r0 = 1
            r3.mOverlay = r0
            r0 = 0
            r3.mAltDrawable = r0
            r3.mDrawable = r0
            r1 = 0
            r3.mCrossfade = r1
            r3.mRoundPercent = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r3.mRound = r1
            r2 = 2
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
            r3.mLayers = r2
            r3.mPanX = r1
            r3.mPanY = r1
            r3.mZoom = r1
            r3.mRotate = r1
            r3.init(r4, r0)
            return
    }

    public ImageFilterView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = new androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix
            r0.<init>()
            r2.mImageMatrix = r0
            r0 = 1
            r2.mOverlay = r0
            r0 = 0
            r2.mAltDrawable = r0
            r2.mDrawable = r0
            r0 = 0
            r2.mCrossfade = r0
            r2.mRoundPercent = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.mRound = r0
            r1 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r2.mLayers = r1
            r2.mPanX = r0
            r2.mPanY = r0
            r2.mZoom = r0
            r2.mRotate = r0
            r2.init(r3, r4)
            return
    }

    public ImageFilterView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r4 = new androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix
            r4.<init>()
            r1.mImageMatrix = r4
            r4 = 1
            r1.mOverlay = r4
            r4 = 0
            r1.mAltDrawable = r4
            r1.mDrawable = r4
            r4 = 0
            r1.mCrossfade = r4
            r1.mRoundPercent = r4
            r4 = 2143289344(0x7fc00000, float:NaN)
            r1.mRound = r4
            r0 = 2
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r0]
            r1.mLayers = r0
            r1.mPanX = r4
            r1.mPanY = r4
            r1.mZoom = r4
            r1.mRotate = r4
            r1.init(r2, r3)
            return
    }

    static /* synthetic */ float access$000(androidx.constraintlayout.utils.widget.ImageFilterView r0) {
            float r0 = r0.mRoundPercent
            return r0
    }

    static /* synthetic */ float access$100(androidx.constraintlayout.utils.widget.ImageFilterView r0) {
            float r0 = r0.mRound
            return r0
    }

    private void init(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            if (r7 == 0) goto L12b
            android.content.Context r6 = r5.getContext()
            int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r0)
            int r7 = r6.getIndexCount()
            int r0 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_altSrc
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            r5.mAltDrawable = r0
            r0 = 0
            r1 = r0
        L1a:
            if (r1 >= r7) goto Lc1
            int r2 = r6.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_crossfade
            r4 = 0
            if (r2 != r3) goto L2d
            float r2 = r6.getFloat(r2, r4)
            r5.mCrossfade = r2
            goto Lbd
        L2d:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_warmth
            if (r2 != r3) goto L3a
            float r2 = r6.getFloat(r2, r4)
            r5.setWarmth(r2)
            goto Lbd
        L3a:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_saturation
            if (r2 != r3) goto L47
            float r2 = r6.getFloat(r2, r4)
            r5.setSaturation(r2)
            goto Lbd
        L47:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_contrast
            if (r2 != r3) goto L54
            float r2 = r6.getFloat(r2, r4)
            r5.setContrast(r2)
            goto Lbd
        L54:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_brightness
            if (r2 != r3) goto L60
            float r2 = r6.getFloat(r2, r4)
            r5.setBrightness(r2)
            goto Lbd
        L60:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_round
            if (r2 != r3) goto L6c
            float r2 = r6.getDimension(r2, r4)
            r5.setRound(r2)
            goto Lbd
        L6c:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_roundPercent
            if (r2 != r3) goto L78
            float r2 = r6.getFloat(r2, r4)
            r5.setRoundPercent(r2)
            goto Lbd
        L78:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_overlay
            if (r2 != r3) goto L86
            boolean r3 = r5.mOverlay
            boolean r2 = r6.getBoolean(r2, r3)
            r5.setOverlay(r2)
            goto Lbd
        L86:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_imagePanX
            if (r2 != r3) goto L94
            float r3 = r5.mPanX
            float r2 = r6.getFloat(r2, r3)
            r5.setImagePanX(r2)
            goto Lbd
        L94:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_imagePanY
            if (r2 != r3) goto La2
            float r3 = r5.mPanY
            float r2 = r6.getFloat(r2, r3)
            r5.setImagePanY(r2)
            goto Lbd
        La2:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_imageRotate
            if (r2 != r3) goto Lb0
            float r3 = r5.mRotate
            float r2 = r6.getFloat(r2, r3)
            r5.setImageRotate(r2)
            goto Lbd
        Lb0:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_imageZoom
            if (r2 != r3) goto Lbd
            float r3 = r5.mZoom
            float r2 = r6.getFloat(r2, r3)
            r5.setImageZoom(r2)
        Lbd:
            int r1 = r1 + 1
            goto L1a
        Lc1:
            r6.recycle()
            android.graphics.drawable.Drawable r6 = r5.getDrawable()
            r5.mDrawable = r6
            android.graphics.drawable.Drawable r7 = r5.mAltDrawable
            if (r7 == 0) goto L119
            if (r6 == 0) goto L119
            android.graphics.drawable.Drawable[] r6 = r5.mLayers
            android.graphics.drawable.Drawable r7 = r5.getDrawable()
            android.graphics.drawable.Drawable r7 = r7.mutate()
            r5.mDrawable = r7
            r6[r0] = r7
            android.graphics.drawable.Drawable[] r6 = r5.mLayers
            android.graphics.drawable.Drawable r7 = r5.mAltDrawable
            android.graphics.drawable.Drawable r7 = r7.mutate()
            r1 = 1
            r6[r1] = r7
            android.graphics.drawable.LayerDrawable r6 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r7 = r5.mLayers
            r6.<init>(r7)
            r5.mLayer = r6
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r1)
            float r7 = r5.mCrossfade
            r1 = 1132396544(0x437f0000, float:255.0)
            float r7 = r7 * r1
            int r7 = (int) r7
            r6.setAlpha(r7)
            boolean r6 = r5.mOverlay
            if (r6 != 0) goto L113
            android.graphics.drawable.LayerDrawable r6 = r5.mLayer
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r0)
            r7 = 1065353216(0x3f800000, float:1.0)
            float r0 = r5.mCrossfade
            float r7 = r7 - r0
            float r7 = r7 * r1
            int r7 = (int) r7
            r6.setAlpha(r7)
        L113:
            android.graphics.drawable.LayerDrawable r6 = r5.mLayer
            super.setImageDrawable(r6)
            goto L12b
        L119:
            android.graphics.drawable.Drawable r6 = r5.getDrawable()
            r5.mDrawable = r6
            if (r6 == 0) goto L12b
            android.graphics.drawable.Drawable[] r7 = r5.mLayers
            android.graphics.drawable.Drawable r6 = r6.mutate()
            r5.mDrawable = r6
            r7[r0] = r6
        L12b:
            return
    }

    private void setMatrix() {
            r11 = this;
            float r0 = r11.mPanX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L21
            float r0 = r11.mPanY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L21
            float r0 = r11.mZoom
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L21
            float r0 = r11.mRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L21
            return
        L21:
            float r0 = r11.mPanX
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 0
            if (r0 == 0) goto L2c
            r0 = r1
            goto L2e
        L2c:
            float r0 = r11.mPanX
        L2e:
            float r2 = r11.mPanY
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L38
            r2 = r1
            goto L3a
        L38:
            float r2 = r11.mPanY
        L3a:
            float r3 = r11.mZoom
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L45
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L47
        L45:
            float r3 = r11.mZoom
        L47:
            float r4 = r11.mRotate
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 == 0) goto L50
            goto L52
        L50:
            float r1 = r11.mRotate
        L52:
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r4.reset()
            android.graphics.drawable.Drawable r5 = r11.getDrawable()
            int r5 = r5.getIntrinsicWidth()
            float r5 = (float) r5
            android.graphics.drawable.Drawable r6 = r11.getDrawable()
            int r6 = r6.getIntrinsicHeight()
            float r6 = (float) r6
            int r7 = r11.getWidth()
            float r7 = (float) r7
            int r8 = r11.getHeight()
            float r8 = (float) r8
            float r9 = r5 * r8
            float r10 = r6 * r7
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L81
            float r9 = r7 / r5
            goto L83
        L81:
            float r9 = r8 / r6
        L83:
            float r3 = r3 * r9
            r4.postScale(r3, r3)
            float r5 = r5 * r3
            float r9 = r7 - r5
            float r0 = r0 * r9
            float r0 = r0 + r7
            float r0 = r0 - r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r5
            float r3 = r3 * r6
            float r6 = r8 - r3
            float r2 = r2 * r6
            float r2 = r2 + r8
            float r2 = r2 - r3
            float r2 = r2 * r5
            r4.postTranslate(r0, r2)
            r0 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r0
            float r8 = r8 / r0
            r4.postRotate(r1, r7, r8)
            r11.setImageMatrix(r4)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r11.setScaleType(r0)
            return
    }

    private void setOverlay(boolean r1) {
            r0 = this;
            r0.mOverlay = r1
            return
    }

    private void updateViewMatrix() {
            r1 = this;
            float r0 = r1.mPanX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L26
            float r0 = r1.mPanY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L26
            float r0 = r1.mZoom
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L26
            float r0 = r1.mRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L26
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r0)
            return
        L26:
            r1.setMatrix()
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            super.draw(r1)
            return
    }

    public float getBrightness() {
            r1 = this;
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = r1.mImageMatrix
            float r0 = r0.mBrightness
            return r0
    }

    public float getContrast() {
            r1 = this;
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = r1.mImageMatrix
            float r0 = r0.mContrast
            return r0
    }

    public float getCrossfade() {
            r1 = this;
            float r0 = r1.mCrossfade
            return r0
    }

    public float getImagePanX() {
            r1 = this;
            float r0 = r1.mPanX
            return r0
    }

    public float getImagePanY() {
            r1 = this;
            float r0 = r1.mPanY
            return r0
    }

    public float getImageRotate() {
            r1 = this;
            float r0 = r1.mRotate
            return r0
    }

    public float getImageZoom() {
            r1 = this;
            float r0 = r1.mZoom
            return r0
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

    public float getSaturation() {
            r1 = this;
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = r1.mImageMatrix
            float r0 = r0.mSaturation
            return r0
    }

    public float getWarmth() {
            r1 = this;
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = r1.mImageMatrix
            float r0 = r0.mWarmth
            return r0
    }

    @Override // android.view.View
    public void layout(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.layout(r1, r2, r3, r4)
            r0.setMatrix()
            return
    }

    public void setAltImageResource(int r4) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r4)
            android.graphics.drawable.Drawable r4 = r4.mutate()
            r3.mAltDrawable = r4
            android.graphics.drawable.Drawable[] r0 = r3.mLayers
            r1 = 0
            android.graphics.drawable.Drawable r2 = r3.mDrawable
            r0[r1] = r2
            r1 = 1
            r0[r1] = r4
            android.graphics.drawable.LayerDrawable r4 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r0 = r3.mLayers
            r4.<init>(r0)
            r3.mLayer = r4
            super.setImageDrawable(r4)
            float r4 = r3.mCrossfade
            r3.setCrossfade(r4)
            return
    }

    public void setBrightness(float r2) {
            r1 = this;
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = r1.mImageMatrix
            r0.mBrightness = r2
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r2 = r1.mImageMatrix
            r2.updateMatrix(r1)
            return
    }

    public void setContrast(float r2) {
            r1 = this;
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = r1.mImageMatrix
            r0.mContrast = r2
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r2 = r1.mImageMatrix
            r2.updateMatrix(r1)
            return
    }

    public void setCrossfade(float r4) {
            r3 = this;
            r3.mCrossfade = r4
            android.graphics.drawable.Drawable[] r4 = r3.mLayers
            if (r4 == 0) goto L30
            boolean r4 = r3.mOverlay
            r0 = 1132396544(0x437f0000, float:255.0)
            if (r4 != 0) goto L1d
            android.graphics.drawable.LayerDrawable r4 = r3.mLayer
            r1 = 0
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3.mCrossfade
            float r1 = r1 - r2
            float r1 = r1 * r0
            int r1 = (int) r1
            r4.setAlpha(r1)
        L1d:
            android.graphics.drawable.LayerDrawable r4 = r3.mLayer
            r1 = 1
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r1)
            float r1 = r3.mCrossfade
            float r1 = r1 * r0
            int r0 = (int) r1
            r4.setAlpha(r0)
            android.graphics.drawable.LayerDrawable r4 = r3.mLayer
            super.setImageDrawable(r4)
        L30:
            return
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mAltDrawable
            if (r0 == 0) goto L28
            if (r3 == 0) goto L28
            android.graphics.drawable.Drawable r3 = r3.mutate()
            r2.mDrawable = r3
            android.graphics.drawable.Drawable[] r0 = r2.mLayers
            r1 = 0
            r0[r1] = r3
            r3 = 1
            android.graphics.drawable.Drawable r1 = r2.mAltDrawable
            r0[r3] = r1
            android.graphics.drawable.LayerDrawable r3 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r0 = r2.mLayers
            r3.<init>(r0)
            r2.mLayer = r3
            super.setImageDrawable(r3)
            float r3 = r2.mCrossfade
            r2.setCrossfade(r3)
            goto L2b
        L28:
            super.setImageDrawable(r3)
        L2b:
            return
    }

    public void setImagePanX(float r1) {
            r0 = this;
            r0.mPanX = r1
            r0.updateViewMatrix()
            return
    }

    public void setImagePanY(float r1) {
            r0 = this;
            r0.mPanY = r1
            r0.updateViewMatrix()
            return
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mAltDrawable
            if (r0 == 0) goto L2e
            android.content.Context r0 = r2.getContext()
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r3)
            android.graphics.drawable.Drawable r3 = r3.mutate()
            r2.mDrawable = r3
            android.graphics.drawable.Drawable[] r0 = r2.mLayers
            r1 = 0
            r0[r1] = r3
            r3 = 1
            android.graphics.drawable.Drawable r1 = r2.mAltDrawable
            r0[r3] = r1
            android.graphics.drawable.LayerDrawable r3 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r0 = r2.mLayers
            r3.<init>(r0)
            r2.mLayer = r3
            super.setImageDrawable(r3)
            float r3 = r2.mCrossfade
            r2.setCrossfade(r3)
            goto L31
        L2e:
            super.setImageResource(r3)
        L31:
            return
    }

    public void setImageRotate(float r1) {
            r0 = this;
            r0.mRotate = r1
            r0.updateViewMatrix()
            return
    }

    public void setImageZoom(float r1) {
            r0 = this;
            r0.mZoom = r1
            r0.updateViewMatrix()
            return
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
            androidx.constraintlayout.utils.widget.ImageFilterView$2 r5 = new androidx.constraintlayout.utils.widget.ImageFilterView$2
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
            androidx.constraintlayout.utils.widget.ImageFilterView$1 r6 = new androidx.constraintlayout.utils.widget.ImageFilterView$1
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

    public void setSaturation(float r2) {
            r1 = this;
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = r1.mImageMatrix
            r0.mSaturation = r2
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r2 = r1.mImageMatrix
            r2.updateMatrix(r1)
            return
    }

    public void setWarmth(float r2) {
            r1 = this;
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = r1.mImageMatrix
            r0.mWarmth = r2
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r2 = r1.mImageMatrix
            r2.updateMatrix(r1)
            return
    }
}
