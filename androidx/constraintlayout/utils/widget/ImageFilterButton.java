package androidx.constraintlayout.utils.widget;

/* loaded from: classes.dex */
public class ImageFilterButton extends androidx.appcompat.widget.AppCompatImageButton {
    private android.graphics.drawable.Drawable mAltDrawable;
    private float mCrossfade;
    private android.graphics.drawable.Drawable mDrawable;
    private androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix mImageMatrix;
    android.graphics.drawable.LayerDrawable mLayer;
    android.graphics.drawable.Drawable[] mLayers;
    private boolean mOverlay;
    private float mPanX;
    private float mPanY;
    private android.graphics.Path mPath;
    android.graphics.RectF mRect;
    private float mRotate;
    private float mRound;
    private float mRoundPercent;
    android.view.ViewOutlineProvider mViewOutlineProvider;
    private float mZoom;



    public ImageFilterButton(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = new androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix
            r0.<init>()
            r2.mImageMatrix = r0
            r0 = 0
            r2.mCrossfade = r0
            r2.mRoundPercent = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.mRound = r0
            r1 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r2.mLayers = r1
            r1 = 1
            r2.mOverlay = r1
            r1 = 0
            r2.mAltDrawable = r1
            r2.mDrawable = r1
            r2.mPanX = r0
            r2.mPanY = r0
            r2.mZoom = r0
            r2.mRotate = r0
            r2.init(r3, r1)
            return
    }

    public ImageFilterButton(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r0 = new androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix
            r0.<init>()
            r2.mImageMatrix = r0
            r0 = 0
            r2.mCrossfade = r0
            r2.mRoundPercent = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.mRound = r0
            r1 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r2.mLayers = r1
            r1 = 1
            r2.mOverlay = r1
            r1 = 0
            r2.mAltDrawable = r1
            r2.mDrawable = r1
            r2.mPanX = r0
            r2.mPanY = r0
            r2.mZoom = r0
            r2.mRotate = r0
            r2.init(r3, r4)
            return
    }

    public ImageFilterButton(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix r4 = new androidx.constraintlayout.utils.widget.ImageFilterView$ImageMatrix
            r4.<init>()
            r1.mImageMatrix = r4
            r4 = 0
            r1.mCrossfade = r4
            r1.mRoundPercent = r4
            r4 = 2143289344(0x7fc00000, float:NaN)
            r1.mRound = r4
            r0 = 2
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r0]
            r1.mLayers = r0
            r0 = 1
            r1.mOverlay = r0
            r0 = 0
            r1.mAltDrawable = r0
            r1.mDrawable = r0
            r1.mPanX = r4
            r1.mPanY = r4
            r1.mZoom = r4
            r1.mRotate = r4
            r1.init(r2, r3)
            return
    }

    static /* synthetic */ float access$000(androidx.constraintlayout.utils.widget.ImageFilterButton r0) {
            float r0 = r0.mRoundPercent
            return r0
    }

    static /* synthetic */ float access$100(androidx.constraintlayout.utils.widget.ImageFilterButton r0) {
            float r0 = r0.mRound
            return r0
    }

    private void init(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r6 = 0
            r5.setPadding(r6, r6, r6, r6)
            if (r7 == 0) goto L121
            android.content.Context r0 = r5.getContext()
            int[] r1 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
            int r0 = r7.getIndexCount()
            int r1 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_altSrc
            android.graphics.drawable.Drawable r1 = r7.getDrawable(r1)
            r5.mAltDrawable = r1
            r1 = r6
        L1d:
            if (r1 >= r0) goto Lb7
            int r2 = r7.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_crossfade
            r4 = 0
            if (r2 != r3) goto L30
            float r2 = r7.getFloat(r2, r4)
            r5.mCrossfade = r2
            goto Lb3
        L30:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_warmth
            if (r2 != r3) goto L3d
            float r2 = r7.getFloat(r2, r4)
            r5.setWarmth(r2)
            goto Lb3
        L3d:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_saturation
            if (r2 != r3) goto L4a
            float r2 = r7.getFloat(r2, r4)
            r5.setSaturation(r2)
            goto Lb3
        L4a:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_contrast
            if (r2 != r3) goto L56
            float r2 = r7.getFloat(r2, r4)
            r5.setContrast(r2)
            goto Lb3
        L56:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_round
            if (r2 != r3) goto L62
            float r2 = r7.getDimension(r2, r4)
            r5.setRound(r2)
            goto Lb3
        L62:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_roundPercent
            if (r2 != r3) goto L6e
            float r2 = r7.getFloat(r2, r4)
            r5.setRoundPercent(r2)
            goto Lb3
        L6e:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_overlay
            if (r2 != r3) goto L7c
            boolean r3 = r5.mOverlay
            boolean r2 = r7.getBoolean(r2, r3)
            r5.setOverlay(r2)
            goto Lb3
        L7c:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_imagePanX
            if (r2 != r3) goto L8a
            float r3 = r5.mPanX
            float r2 = r7.getFloat(r2, r3)
            r5.setImagePanX(r2)
            goto Lb3
        L8a:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_imagePanY
            if (r2 != r3) goto L98
            float r3 = r5.mPanY
            float r2 = r7.getFloat(r2, r3)
            r5.setImagePanY(r2)
            goto Lb3
        L98:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_imageRotate
            if (r2 != r3) goto La6
            float r3 = r5.mRotate
            float r2 = r7.getFloat(r2, r3)
            r5.setImageRotate(r2)
            goto Lb3
        La6:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ImageFilterView_imageZoom
            if (r2 != r3) goto Lb3
            float r3 = r5.mZoom
            float r2 = r7.getFloat(r2, r3)
            r5.setImageZoom(r2)
        Lb3:
            int r1 = r1 + 1
            goto L1d
        Lb7:
            r7.recycle()
            android.graphics.drawable.Drawable r7 = r5.getDrawable()
            r5.mDrawable = r7
            android.graphics.drawable.Drawable r0 = r5.mAltDrawable
            if (r0 == 0) goto L10f
            if (r7 == 0) goto L10f
            android.graphics.drawable.Drawable[] r7 = r5.mLayers
            android.graphics.drawable.Drawable r0 = r5.getDrawable()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r5.mDrawable = r0
            r7[r6] = r0
            android.graphics.drawable.Drawable[] r7 = r5.mLayers
            android.graphics.drawable.Drawable r0 = r5.mAltDrawable
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r1 = 1
            r7[r1] = r0
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r0 = r5.mLayers
            r7.<init>(r0)
            r5.mLayer = r7
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r1)
            float r0 = r5.mCrossfade
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r7.setAlpha(r0)
            boolean r7 = r5.mOverlay
            if (r7 != 0) goto L109
            android.graphics.drawable.LayerDrawable r7 = r5.mLayer
            android.graphics.drawable.Drawable r6 = r7.getDrawable(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            float r0 = r5.mCrossfade
            float r7 = r7 - r0
            float r7 = r7 * r1
            int r7 = (int) r7
            r6.setAlpha(r7)
        L109:
            android.graphics.drawable.LayerDrawable r6 = r5.mLayer
            super.setImageDrawable(r6)
            goto L121
        L10f:
            android.graphics.drawable.Drawable r7 = r5.getDrawable()
            r5.mDrawable = r7
            if (r7 == 0) goto L121
            android.graphics.drawable.Drawable[] r0 = r5.mLayers
            android.graphics.drawable.Drawable r7 = r7.mutate()
            r5.mDrawable = r7
            r0[r6] = r7
        L121:
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

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
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

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
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
            androidx.constraintlayout.utils.widget.ImageFilterButton$2 r5 = new androidx.constraintlayout.utils.widget.ImageFilterButton$2
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
            androidx.constraintlayout.utils.widget.ImageFilterButton$1 r6 = new androidx.constraintlayout.utils.widget.ImageFilterButton$1
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
