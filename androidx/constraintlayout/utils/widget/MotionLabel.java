package androidx.constraintlayout.utils.widget;

/* loaded from: classes.dex */
public class MotionLabel extends android.view.View implements androidx.constraintlayout.motion.widget.FloatLayout {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    static java.lang.String TAG = "MotionLabel";
    private boolean mAutoSize;
    private int mAutoSizeTextType;
    float mBackgroundPanX;
    float mBackgroundPanY;
    private float mBaseTextSize;
    private float mDeltaLeft;
    private float mFloatHeight;
    private float mFloatWidth;
    private java.lang.String mFontFamily;
    private int mGravity;
    private android.text.Layout mLayout;
    boolean mNotBuilt;
    android.graphics.Matrix mOutlinePositionMatrix;
    private int mPaddingBottom;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;
    android.text.TextPaint mPaint;
    android.graphics.Path mPath;
    android.graphics.RectF mRect;
    float mRotate;
    private float mRound;
    private float mRoundPercent;
    private int mStyleIndex;
    android.graphics.Paint mTempPaint;
    android.graphics.Rect mTempRect;
    private java.lang.String mText;
    private android.graphics.drawable.Drawable mTextBackground;
    private android.graphics.Bitmap mTextBackgroundBitmap;
    private android.graphics.Rect mTextBounds;
    private int mTextFillColor;
    private int mTextOutlineColor;
    private float mTextOutlineThickness;
    private float mTextPanX;
    private float mTextPanY;
    private android.graphics.BitmapShader mTextShader;
    private android.graphics.Matrix mTextShaderMatrix;
    private float mTextSize;
    private int mTextureEffect;
    private float mTextureHeight;
    private float mTextureWidth;
    private java.lang.CharSequence mTransformed;
    private int mTypefaceIndex;
    private boolean mUseOutline;
    android.view.ViewOutlineProvider mViewOutlineProvider;
    float mZoom;
    android.graphics.Paint paintCache;
    float paintTextSize;



    static {
            return
    }

    public MotionLabel(android.content.Context r6) {
            r5 = this;
            r5.<init>(r6)
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            r5.mPaint = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r5.mPath = r0
            r0 = 65535(0xffff, float:9.1834E-41)
            r5.mTextFillColor = r0
            r5.mTextOutlineColor = r0
            r0 = 0
            r5.mUseOutline = r0
            r1 = 0
            r5.mRoundPercent = r1
            r2 = 2143289344(0x7fc00000, float:NaN)
            r5.mRound = r2
            r3 = 1111490560(0x42400000, float:48.0)
            r5.mTextSize = r3
            r5.mBaseTextSize = r2
            r5.mTextOutlineThickness = r1
            java.lang.String r3 = "Hello World"
            r5.mText = r3
            r3 = 1
            r5.mNotBuilt = r3
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r5.mTextBounds = r4
            r5.mPaddingLeft = r3
            r5.mPaddingRight = r3
            r5.mPaddingTop = r3
            r5.mPaddingBottom = r3
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r5.mGravity = r3
            r5.mAutoSizeTextType = r0
            r5.mAutoSize = r0
            r5.mTextureHeight = r2
            r5.mTextureWidth = r2
            r5.mTextPanX = r1
            r5.mTextPanY = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.paintCache = r1
            r5.mTextureEffect = r0
            r5.mBackgroundPanX = r2
            r5.mBackgroundPanY = r2
            r5.mZoom = r2
            r5.mRotate = r2
            r0 = 0
            r5.init(r6, r0)
            return
    }

    public MotionLabel(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r5.<init>(r6, r7)
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            r5.mPaint = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r5.mPath = r0
            r0 = 65535(0xffff, float:9.1834E-41)
            r5.mTextFillColor = r0
            r5.mTextOutlineColor = r0
            r0 = 0
            r5.mUseOutline = r0
            r1 = 0
            r5.mRoundPercent = r1
            r2 = 2143289344(0x7fc00000, float:NaN)
            r5.mRound = r2
            r3 = 1111490560(0x42400000, float:48.0)
            r5.mTextSize = r3
            r5.mBaseTextSize = r2
            r5.mTextOutlineThickness = r1
            java.lang.String r3 = "Hello World"
            r5.mText = r3
            r3 = 1
            r5.mNotBuilt = r3
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r5.mTextBounds = r4
            r5.mPaddingLeft = r3
            r5.mPaddingRight = r3
            r5.mPaddingTop = r3
            r5.mPaddingBottom = r3
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r5.mGravity = r3
            r5.mAutoSizeTextType = r0
            r5.mAutoSize = r0
            r5.mTextureHeight = r2
            r5.mTextureWidth = r2
            r5.mTextPanX = r1
            r5.mTextPanY = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.paintCache = r1
            r5.mTextureEffect = r0
            r5.mBackgroundPanX = r2
            r5.mBackgroundPanY = r2
            r5.mZoom = r2
            r5.mRotate = r2
            r5.init(r6, r7)
            return
    }

    public MotionLabel(android.content.Context r5, android.util.AttributeSet r6, int r7) {
            r4 = this;
            r4.<init>(r5, r6, r7)
            android.text.TextPaint r7 = new android.text.TextPaint
            r7.<init>()
            r4.mPaint = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r4.mPath = r7
            r7 = 65535(0xffff, float:9.1834E-41)
            r4.mTextFillColor = r7
            r4.mTextOutlineColor = r7
            r7 = 0
            r4.mUseOutline = r7
            r0 = 0
            r4.mRoundPercent = r0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r4.mRound = r1
            r2 = 1111490560(0x42400000, float:48.0)
            r4.mTextSize = r2
            r4.mBaseTextSize = r1
            r4.mTextOutlineThickness = r0
            java.lang.String r2 = "Hello World"
            r4.mText = r2
            r2 = 1
            r4.mNotBuilt = r2
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r4.mTextBounds = r3
            r4.mPaddingLeft = r2
            r4.mPaddingRight = r2
            r4.mPaddingTop = r2
            r4.mPaddingBottom = r2
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r4.mGravity = r2
            r4.mAutoSizeTextType = r7
            r4.mAutoSize = r7
            r4.mTextureHeight = r1
            r4.mTextureWidth = r1
            r4.mTextPanX = r0
            r4.mTextPanY = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r4.paintCache = r0
            r4.mTextureEffect = r7
            r4.mBackgroundPanX = r1
            r4.mBackgroundPanY = r1
            r4.mZoom = r1
            r4.mRotate = r1
            r4.init(r5, r6)
            return
    }

    static /* synthetic */ float access$000(androidx.constraintlayout.utils.widget.MotionLabel r0) {
            float r0 = r0.mRoundPercent
            return r0
    }

    static /* synthetic */ float access$100(androidx.constraintlayout.utils.widget.MotionLabel r0) {
            float r0 = r0.mRound
            return r0
    }

    private void adjustTexture(float r2, float r3, float r4, float r5) {
            r1 = this;
            android.graphics.Matrix r0 = r1.mTextShaderMatrix
            if (r0 != 0) goto L5
            return
        L5:
            float r4 = r4 - r2
            r1.mFloatWidth = r4
            float r5 = r5 - r3
            r1.mFloatHeight = r5
            r1.updateShaderMatrix()
            return
    }

    private float getHorizontalOffset() {
            r6 = this;
            float r0 = r6.mBaseTextSize
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto Lc
            r0 = r1
            goto L11
        Lc:
            float r0 = r6.mTextSize
            float r2 = r6.mBaseTextSize
            float r0 = r0 / r2
        L11:
            android.text.TextPaint r2 = r6.mPaint
            java.lang.String r3 = r6.mText
            r4 = 0
            int r5 = r3.length()
            float r2 = r2.measureText(r3, r4, r5)
            float r0 = r0 * r2
            float r2 = r6.mFloatWidth
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L2d
            int r2 = r6.getMeasuredWidth()
            float r2 = (float) r2
            goto L2f
        L2d:
            float r2 = r6.mFloatWidth
        L2f:
            int r3 = r6.getPaddingLeft()
            float r3 = (float) r3
            float r2 = r2 - r3
            int r3 = r6.getPaddingRight()
            float r3 = (float) r3
            float r2 = r2 - r3
            float r2 = r2 - r0
            float r0 = r6.mTextPanX
            float r0 = r0 + r1
            float r2 = r2 * r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            return r2
    }

    private float getVerticalOffset() {
            r6 = this;
            float r0 = r6.mBaseTextSize
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto Lc
            r0 = r1
            goto L11
        Lc:
            float r0 = r6.mTextSize
            float r2 = r6.mBaseTextSize
            float r0 = r0 / r2
        L11:
            android.text.TextPaint r2 = r6.mPaint
            android.graphics.Paint$FontMetrics r2 = r2.getFontMetrics()
            float r3 = r6.mFloatHeight
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L25
            int r3 = r6.getMeasuredHeight()
            float r3 = (float) r3
            goto L27
        L25:
            float r3 = r6.mFloatHeight
        L27:
            int r4 = r6.getPaddingTop()
            float r4 = (float) r4
            float r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            float r4 = (float) r4
            float r3 = r3 - r4
            float r4 = r2.descent
            float r5 = r2.ascent
            float r4 = r4 - r5
            float r4 = r4 * r0
            float r3 = r3 - r4
            float r4 = r6.mTextPanY
            float r1 = r1 - r4
            float r3 = r3 * r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r1
            float r1 = r2.ascent
            float r0 = r0 * r1
            float r3 = r3 - r0
            return r3
    }

    private void init(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r5.setUpTheme(r6, r7)
            if (r7 == 0) goto L169
            android.content.Context r6 = r5.getContext()
            int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r0)
            int r7 = r6.getIndexCount()
            r0 = 0
            r1 = r0
        L15:
            if (r1 >= r7) goto L166
            int r2 = r6.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_android_text
            if (r2 != r3) goto L28
            java.lang.CharSequence r2 = r6.getText(r2)
            r5.setText(r2)
            goto L162
        L28:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_android_fontFamily
            if (r2 != r3) goto L34
            java.lang.String r2 = r6.getString(r2)
            r5.mFontFamily = r2
            goto L162
        L34:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_scaleFromTextSize
            if (r2 != r3) goto L44
            float r3 = r5.mBaseTextSize
            int r3 = (int) r3
            int r2 = r6.getDimensionPixelSize(r2, r3)
            float r2 = (float) r2
            r5.mBaseTextSize = r2
            goto L162
        L44:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_android_textSize
            if (r2 != r3) goto L54
            float r3 = r5.mTextSize
            int r3 = (int) r3
            int r2 = r6.getDimensionPixelSize(r2, r3)
            float r2 = (float) r2
            r5.mTextSize = r2
            goto L162
        L54:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_android_textStyle
            if (r2 != r3) goto L62
            int r3 = r5.mStyleIndex
            int r2 = r6.getInt(r2, r3)
            r5.mStyleIndex = r2
            goto L162
        L62:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_android_typeface
            if (r2 != r3) goto L70
            int r3 = r5.mTypefaceIndex
            int r2 = r6.getInt(r2, r3)
            r5.mTypefaceIndex = r2
            goto L162
        L70:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_android_textColor
            if (r2 != r3) goto L7e
            int r3 = r5.mTextFillColor
            int r2 = r6.getColor(r2, r3)
            r5.mTextFillColor = r2
            goto L162
        L7e:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_borderRound
            if (r2 != r3) goto L91
            float r3 = r5.mRound
            float r2 = r6.getDimension(r2, r3)
            r5.mRound = r2
            float r2 = r5.mRound
            r5.setRound(r2)
            goto L162
        L91:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_borderRoundPercent
            if (r2 != r3) goto La4
            float r3 = r5.mRoundPercent
            float r2 = r6.getFloat(r2, r3)
            r5.mRoundPercent = r2
            float r2 = r5.mRoundPercent
            r5.setRoundPercent(r2)
            goto L162
        La4:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_android_gravity
            if (r2 != r3) goto Lb2
            r3 = -1
            int r2 = r6.getInt(r2, r3)
            r5.setGravity(r2)
            goto L162
        Lb2:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_android_autoSizeTextType
            if (r2 != r3) goto Lbe
            int r2 = r6.getInt(r2, r0)
            r5.mAutoSizeTextType = r2
            goto L162
        Lbe:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_textOutlineColor
            r4 = 1
            if (r2 != r3) goto Lcf
            int r3 = r5.mTextOutlineColor
            int r2 = r6.getInt(r2, r3)
            r5.mTextOutlineColor = r2
            r5.mUseOutline = r4
            goto L162
        Lcf:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_textOutlineThickness
            if (r2 != r3) goto Ldf
            float r3 = r5.mTextOutlineThickness
            float r2 = r6.getDimension(r2, r3)
            r5.mTextOutlineThickness = r2
            r5.mUseOutline = r4
            goto L162
        Ldf:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_textBackground
            if (r2 != r3) goto Led
            android.graphics.drawable.Drawable r2 = r6.getDrawable(r2)
            r5.mTextBackground = r2
            r5.mUseOutline = r4
            goto L162
        Led:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_textBackgroundPanX
            if (r2 != r3) goto Lfb
            float r3 = r5.mBackgroundPanX
            float r2 = r6.getFloat(r2, r3)
            r5.mBackgroundPanX = r2
            goto L162
        Lfb:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_textBackgroundPanY
            if (r2 != r3) goto L108
            float r3 = r5.mBackgroundPanY
            float r2 = r6.getFloat(r2, r3)
            r5.mBackgroundPanY = r2
            goto L162
        L108:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_textPanX
            if (r2 != r3) goto L115
            float r3 = r5.mTextPanX
            float r2 = r6.getFloat(r2, r3)
            r5.mTextPanX = r2
            goto L162
        L115:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_textPanY
            if (r2 != r3) goto L122
            float r3 = r5.mTextPanY
            float r2 = r6.getFloat(r2, r3)
            r5.mTextPanY = r2
            goto L162
        L122:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_textBackgroundRotate
            if (r2 != r3) goto L12f
            float r3 = r5.mRotate
            float r2 = r6.getFloat(r2, r3)
            r5.mRotate = r2
            goto L162
        L12f:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_textBackgroundZoom
            if (r2 != r3) goto L13c
            float r3 = r5.mZoom
            float r2 = r6.getFloat(r2, r3)
            r5.mZoom = r2
            goto L162
        L13c:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_textureHeight
            if (r2 != r3) goto L149
            float r3 = r5.mTextureHeight
            float r2 = r6.getDimension(r2, r3)
            r5.mTextureHeight = r2
            goto L162
        L149:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_textureWidth
            if (r2 != r3) goto L156
            float r3 = r5.mTextureWidth
            float r2 = r6.getDimension(r2, r3)
            r5.mTextureWidth = r2
            goto L162
        L156:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionLabel_textureEffect
            if (r2 != r3) goto L162
            int r3 = r5.mTextureEffect
            int r2 = r6.getInt(r2, r3)
            r5.mTextureEffect = r2
        L162:
            int r1 = r1 + 1
            goto L15
        L166:
            r6.recycle()
        L169:
            r5.setupTexture()
            r5.setupPath()
            return
    }

    private void setTypefaceFromAttrs(java.lang.String r5, int r6, int r7) {
            r4 = this;
            if (r5 == 0) goto Lc
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r7)
            if (r5 == 0) goto Ld
            r4.setTypeface(r5)
            return
        Lc:
            r5 = 0
        Ld:
            r0 = 2
            r1 = 1
            if (r6 == r1) goto L1d
            if (r6 == r0) goto L1a
            r2 = 3
            if (r6 == r2) goto L17
            goto L1f
        L17:
            android.graphics.Typeface r5 = android.graphics.Typeface.MONOSPACE
            goto L1f
        L1a:
            android.graphics.Typeface r5 = android.graphics.Typeface.SERIF
            goto L1f
        L1d:
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
        L1f:
            r6 = 0
            r2 = 0
            if (r7 <= 0) goto L51
            if (r5 != 0) goto L2a
            android.graphics.Typeface r5 = android.graphics.Typeface.defaultFromStyle(r7)
            goto L2e
        L2a:
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r7)
        L2e:
            r4.setTypeface(r5)
            if (r5 == 0) goto L38
            int r5 = r5.getStyle()
            goto L39
        L38:
            r5 = r2
        L39:
            int r5 = ~r5
            r5 = r5 & r7
            android.text.TextPaint r7 = r4.mPaint
            r3 = r5 & 1
            if (r3 == 0) goto L42
            goto L43
        L42:
            r1 = r2
        L43:
            r7.setFakeBoldText(r1)
            android.text.TextPaint r7 = r4.mPaint
            r5 = r5 & r0
            if (r5 == 0) goto L4d
            r6 = -1098907648(0xffffffffbe800000, float:-0.25)
        L4d:
            r7.setTextSkewX(r6)
            goto L5e
        L51:
            android.text.TextPaint r7 = r4.mPaint
            r7.setFakeBoldText(r2)
            android.text.TextPaint r7 = r4.mPaint
            r7.setTextSkewX(r6)
            r4.setTypeface(r5)
        L5e:
            return
    }

    private void setUpTheme(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int r0 = androidx.appcompat.C0015R.attr.colorPrimary
            r1 = 1
            r3.resolveAttribute(r0, r4, r1)
            android.text.TextPaint r3 = r2.mPaint
            int r4 = r4.data
            r2.mTextFillColor = r4
            r3.setColor(r4)
            return
    }

    private void setupTexture() {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.mTextBackground
            if (r0 == 0) goto L8d
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r5.mTextShaderMatrix = r0
            android.graphics.drawable.Drawable r0 = r5.mTextBackground
            int r0 = r0.getIntrinsicWidth()
            android.graphics.drawable.Drawable r1 = r5.mTextBackground
            int r1 = r1.getIntrinsicHeight()
            r2 = 128(0x80, float:1.794E-43)
            if (r0 > 0) goto L2e
            int r0 = r5.getWidth()
            if (r0 != 0) goto L2e
            float r0 = r5.mTextureWidth
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L2b
            r0 = r2
            goto L2e
        L2b:
            float r0 = r5.mTextureWidth
            int r0 = (int) r0
        L2e:
            if (r1 > 0) goto L43
            int r1 = r5.getHeight()
            if (r1 != 0) goto L43
            float r1 = r5.mTextureHeight
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L3f
            goto L42
        L3f:
            float r1 = r5.mTextureHeight
            int r2 = (int) r1
        L42:
            r1 = r2
        L43:
            int r2 = r5.mTextureEffect
            if (r2 == 0) goto L4b
            int r0 = r0 / 2
            int r1 = r1 / 2
        L4b:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            r5.mTextBackgroundBitmap = r0
            android.graphics.Canvas r0 = new android.graphics.Canvas
            android.graphics.Bitmap r1 = r5.mTextBackgroundBitmap
            r0.<init>(r1)
            android.graphics.drawable.Drawable r1 = r5.mTextBackground
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            r4 = 0
            r1.setBounds(r4, r4, r2, r3)
            android.graphics.drawable.Drawable r1 = r5.mTextBackground
            r2 = 1
            r1.setFilterBitmap(r2)
            android.graphics.drawable.Drawable r1 = r5.mTextBackground
            r1.draw(r0)
            int r0 = r5.mTextureEffect
            if (r0 == 0) goto L80
            android.graphics.Bitmap r0 = r5.mTextBackgroundBitmap
            r1 = 4
            android.graphics.Bitmap r0 = r5.blur(r0, r1)
            r5.mTextBackgroundBitmap = r0
        L80:
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            android.graphics.Bitmap r1 = r5.mTextBackgroundBitmap
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.REPEAT
            r0.<init>(r1, r2, r3)
            r5.mTextShader = r0
        L8d:
            return
    }

    private void updateShaderMatrix() {
            r11 = this;
            float r0 = r11.mBackgroundPanX
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 0
            if (r0 == 0) goto Lb
            r0 = r1
            goto Ld
        Lb:
            float r0 = r11.mBackgroundPanX
        Ld:
            float r2 = r11.mBackgroundPanY
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L17
            r2 = r1
            goto L19
        L17:
            float r2 = r11.mBackgroundPanY
        L19:
            float r3 = r11.mZoom
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L24
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L26
        L24:
            float r3 = r11.mZoom
        L26:
            float r4 = r11.mRotate
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 == 0) goto L2f
            goto L31
        L2f:
            float r1 = r11.mRotate
        L31:
            android.graphics.Matrix r4 = r11.mTextShaderMatrix
            r4.reset()
            android.graphics.Bitmap r4 = r11.mTextBackgroundBitmap
            int r4 = r4.getWidth()
            float r4 = (float) r4
            android.graphics.Bitmap r5 = r11.mTextBackgroundBitmap
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r6 = r11.mTextureWidth
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L4f
            float r6 = r11.mFloatWidth
            goto L51
        L4f:
            float r6 = r11.mTextureWidth
        L51:
            float r7 = r11.mTextureHeight
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 == 0) goto L5c
            float r7 = r11.mFloatHeight
            goto L5e
        L5c:
            float r7 = r11.mTextureHeight
        L5e:
            float r8 = r4 * r7
            float r9 = r5 * r6
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L69
            float r8 = r6 / r4
            goto L6b
        L69:
            float r8 = r7 / r5
        L6b:
            float r3 = r3 * r8
            android.graphics.Matrix r8 = r11.mTextShaderMatrix
            r8.postScale(r3, r3)
            float r4 = r4 * r3
            float r8 = r6 - r4
            float r3 = r3 * r5
            float r5 = r7 - r3
            float r9 = r11.mTextureHeight
            boolean r9 = java.lang.Float.isNaN(r9)
            r10 = 1073741824(0x40000000, float:2.0)
            if (r9 != 0) goto L84
            float r5 = r11.mTextureHeight
            float r5 = r5 / r10
        L84:
            float r9 = r11.mTextureWidth
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 != 0) goto L8f
            float r8 = r11.mTextureWidth
            float r8 = r8 / r10
        L8f:
            float r0 = r0 * r8
            float r0 = r0 + r6
            float r0 = r0 - r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r4
            float r2 = r2 * r5
            float r2 = r2 + r7
            float r2 = r2 - r3
            float r2 = r2 * r4
            android.graphics.Matrix r3 = r11.mTextShaderMatrix
            r3.postTranslate(r0, r2)
            android.graphics.Matrix r0 = r11.mTextShaderMatrix
            float r6 = r6 / r10
            float r7 = r7 / r10
            r0.postRotate(r1, r6, r7)
            android.graphics.BitmapShader r0 = r11.mTextShader
            android.graphics.Matrix r1 = r11.mTextShaderMatrix
            r0.setLocalMatrix(r1)
            return
    }

    android.graphics.Bitmap blur(android.graphics.Bitmap r6, int r7) {
            r5 = this;
            long r0 = java.lang.System.nanoTime()
            java.lang.Long.valueOf(r0)
            int r0 = r6.getWidth()
            int r1 = r6.getHeight()
            int r0 = r0 / 2
            int r1 = r1 / 2
            r2 = 1
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r6, r0, r1, r2)
            r3 = 0
        L19:
            if (r3 >= r7) goto L2d
            r4 = 32
            if (r0 < r4) goto L2d
            if (r1 >= r4) goto L22
            goto L2d
        L22:
            int r0 = r0 / 2
            int r1 = r1 / 2
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r6, r0, r1, r2)
            int r3 = r3 + 1
            goto L19
        L2d:
            return r6
    }

    void buildShape(float r11) {
            r10 = this;
            boolean r0 = r10.mUseOutline
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto Lb
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb
            return
        Lb:
            android.graphics.Path r0 = r10.mPath
            r0.reset()
            java.lang.String r3 = r10.mText
            int r5 = r3.length()
            android.text.TextPaint r0 = r10.mPaint
            android.graphics.Rect r2 = r10.mTextBounds
            r9 = 0
            r0.getTextBounds(r3, r9, r5, r2)
            android.text.TextPaint r2 = r10.mPaint
            r4 = 0
            r6 = 0
            r7 = 0
            android.graphics.Path r8 = r10.mPath
            r2.getTextPath(r3, r4, r5, r6, r7, r8)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto L59
            java.lang.String r0 = androidx.constraintlayout.utils.widget.MotionLabel.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = androidx.constraintlayout.motion.widget.Debug.getLoc()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " scale "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.postScale(r11, r11)
            android.graphics.Path r11 = r10.mPath
            r11.transform(r0)
        L59:
            android.graphics.Rect r11 = r10.mTextBounds
            int r0 = r11.right
            int r0 = r0 + (-1)
            r11.right = r0
            android.graphics.Rect r11 = r10.mTextBounds
            int r0 = r11.left
            int r0 = r0 + 1
            r11.left = r0
            android.graphics.Rect r11 = r10.mTextBounds
            int r0 = r11.bottom
            int r0 = r0 + 1
            r11.bottom = r0
            android.graphics.Rect r11 = r10.mTextBounds
            int r0 = r11.top
            int r0 = r0 + (-1)
            r11.top = r0
            android.graphics.RectF r11 = new android.graphics.RectF
            r11.<init>()
            int r0 = r10.getHeight()
            float r0 = (float) r0
            r11.bottom = r0
            int r0 = r10.getWidth()
            float r0 = (float) r0
            r11.right = r0
            r10.mNotBuilt = r9
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

    public float getScaleFromTextSize() {
            r1 = this;
            float r0 = r1.mBaseTextSize
            return r0
    }

    public float getTextBackgroundPanX() {
            r1 = this;
            float r0 = r1.mBackgroundPanX
            return r0
    }

    public float getTextBackgroundPanY() {
            r1 = this;
            float r0 = r1.mBackgroundPanY
            return r0
    }

    public float getTextBackgroundRotate() {
            r1 = this;
            float r0 = r1.mRotate
            return r0
    }

    public float getTextBackgroundZoom() {
            r1 = this;
            float r0 = r1.mZoom
            return r0
    }

    public int getTextOutlineColor() {
            r1 = this;
            int r0 = r1.mTextOutlineColor
            return r0
    }

    public float getTextPanX() {
            r1 = this;
            float r0 = r1.mTextPanX
            return r0
    }

    public float getTextPanY() {
            r1 = this;
            float r0 = r1.mTextPanY
            return r0
    }

    public float getTextureHeight() {
            r1 = this;
            float r0 = r1.mTextureHeight
            return r0
    }

    public float getTextureWidth() {
            r1 = this;
            float r0 = r1.mTextureWidth
            return r0
    }

    public android.graphics.Typeface getTypeface() {
            r1 = this;
            android.text.TextPaint r0 = r1.mPaint
            android.graphics.Typeface r0 = r0.getTypeface()
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.FloatLayout
    public void layout(float r9, float r10, float r11, float r12) {
            r8 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r9 + r0
            int r1 = (int) r1
            float r2 = (float) r1
            float r2 = r9 - r2
            r8.mDeltaLeft = r2
            float r2 = r11 + r0
            int r2 = (int) r2
            int r3 = r2 - r1
            float r4 = r12 + r0
            int r4 = (int) r4
            float r0 = r0 + r10
            int r0 = (int) r0
            int r5 = r4 - r0
            float r6 = r11 - r9
            r8.mFloatWidth = r6
            float r7 = r12 - r10
            r8.mFloatHeight = r7
            r8.adjustTexture(r9, r10, r11, r12)
            int r9 = r8.getMeasuredHeight()
            if (r9 != r5) goto L32
            int r9 = r8.getMeasuredWidth()
            if (r9 == r3) goto L2e
            goto L32
        L2e:
            super.layout(r1, r0, r2, r4)
            goto L42
        L32:
            r9 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r9)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            r8.measure(r10, r9)
            super.layout(r1, r0, r2, r4)
        L42:
            boolean r9 = r8.mAutoSize
            if (r9 == 0) goto Ld5
            android.graphics.Rect r9 = r8.mTempRect
            if (r9 != 0) goto L67
            android.graphics.Paint r9 = new android.graphics.Paint
            r9.<init>()
            r8.mTempPaint = r9
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r8.mTempRect = r9
            android.graphics.Paint r9 = r8.mTempPaint
            android.text.TextPaint r10 = r8.mPaint
            r9.set(r10)
            android.graphics.Paint r9 = r8.mTempPaint
            float r9 = r9.getTextSize()
            r8.paintTextSize = r9
        L67:
            r8.mFloatWidth = r6
            r8.mFloatHeight = r7
            android.graphics.Paint r9 = r8.mTempPaint
            java.lang.String r10 = r8.mText
            int r11 = r10.length()
            android.graphics.Rect r12 = r8.mTempRect
            r0 = 0
            r9.getTextBounds(r10, r0, r11, r12)
            android.graphics.Rect r9 = r8.mTempRect
            int r9 = r9.width()
            android.graphics.Rect r10 = r8.mTempRect
            int r10 = r10.height()
            float r10 = (float) r10
            r11 = 1067869798(0x3fa66666, float:1.3)
            float r10 = r10 * r11
            int r11 = r8.mPaddingRight
            float r11 = (float) r11
            float r6 = r6 - r11
            int r11 = r8.mPaddingLeft
            float r11 = (float) r11
            float r6 = r6 - r11
            int r11 = r8.mPaddingBottom
            float r11 = (float) r11
            float r7 = r7 - r11
            int r11 = r8.mPaddingTop
            float r11 = (float) r11
            float r7 = r7 - r11
            float r9 = (float) r9
            float r11 = r9 * r7
            float r12 = r10 * r6
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto Lad
            android.text.TextPaint r10 = r8.mPaint
            float r11 = r8.paintTextSize
            float r11 = r11 * r6
            float r11 = r11 / r9
            r10.setTextSize(r11)
            goto Lb6
        Lad:
            android.text.TextPaint r9 = r8.mPaint
            float r11 = r8.paintTextSize
            float r11 = r11 * r7
            float r11 = r11 / r10
            r9.setTextSize(r11)
        Lb6:
            boolean r9 = r8.mUseOutline
            if (r9 != 0) goto Lc2
            float r9 = r8.mBaseTextSize
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 != 0) goto Ld5
        Lc2:
            float r9 = r8.mBaseTextSize
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 == 0) goto Lcd
            r9 = 1065353216(0x3f800000, float:1.0)
            goto Ld2
        Lcd:
            float r9 = r8.mTextSize
            float r10 = r8.mBaseTextSize
            float r9 = r9 / r10
        Ld2:
            r8.buildShape(r9)
        Ld5:
            return
    }

    @Override // android.view.View
    public void layout(int r9, int r10, int r11, int r12) {
            r8 = this;
            super.layout(r9, r10, r11, r12)
            float r0 = r8.mBaseTextSize
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto Le
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L13
        Le:
            float r1 = r8.mTextSize
            float r2 = r8.mBaseTextSize
            float r1 = r1 / r2
        L13:
            int r2 = r11 - r9
            float r2 = (float) r2
            r8.mFloatWidth = r2
            int r2 = r12 - r10
            float r2 = (float) r2
            r8.mFloatHeight = r2
            boolean r2 = r8.mAutoSize
            if (r2 == 0) goto La5
            android.graphics.Rect r2 = r8.mTempRect
            if (r2 != 0) goto L42
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r8.mTempPaint = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r8.mTempRect = r2
            android.graphics.Paint r2 = r8.mTempPaint
            android.text.TextPaint r3 = r8.mPaint
            r2.set(r3)
            android.graphics.Paint r2 = r8.mTempPaint
            float r2 = r2.getTextSize()
            r8.paintTextSize = r2
        L42:
            android.graphics.Paint r2 = r8.mTempPaint
            java.lang.String r3 = r8.mText
            int r4 = r3.length()
            android.graphics.Rect r5 = r8.mTempRect
            r6 = 0
            r2.getTextBounds(r3, r6, r4, r5)
            android.graphics.Rect r2 = r8.mTempRect
            int r2 = r2.width()
            android.graphics.Rect r3 = r8.mTempRect
            int r3 = r3.height()
            float r3 = (float) r3
            r4 = 1067869798(0x3fa66666, float:1.3)
            float r3 = r3 * r4
            int r3 = (int) r3
            float r4 = r8.mFloatWidth
            int r5 = r8.mPaddingRight
            float r5 = (float) r5
            float r4 = r4 - r5
            int r5 = r8.mPaddingLeft
            float r5 = (float) r5
            float r4 = r4 - r5
            float r5 = r8.mFloatHeight
            int r6 = r8.mPaddingBottom
            float r6 = (float) r6
            float r5 = r5 - r6
            int r6 = r8.mPaddingTop
            float r6 = (float) r6
            float r5 = r5 - r6
            if (r0 == 0) goto L96
            float r2 = (float) r2
            float r6 = r2 * r5
            float r3 = (float) r3
            float r7 = r3 * r4
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L8c
            android.text.TextPaint r3 = r8.mPaint
            float r5 = r8.paintTextSize
            float r5 = r5 * r4
            float r5 = r5 / r2
            r3.setTextSize(r5)
            goto La5
        L8c:
            android.text.TextPaint r2 = r8.mPaint
            float r4 = r8.paintTextSize
            float r4 = r4 * r5
            float r4 = r4 / r3
            r2.setTextSize(r4)
            goto La5
        L96:
            float r1 = (float) r2
            float r2 = r1 * r5
            float r3 = (float) r3
            float r6 = r3 * r4
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto La3
            float r4 = r4 / r1
            r1 = r4
            goto La5
        La3:
            float r5 = r5 / r3
            r1 = r5
        La5:
            boolean r2 = r8.mUseOutline
            if (r2 != 0) goto Lab
            if (r0 != 0) goto Lb5
        Lab:
            float r9 = (float) r9
            float r10 = (float) r10
            float r11 = (float) r11
            float r12 = (float) r12
            r8.adjustTexture(r9, r10, r11, r12)
            r8.buildShape(r1)
        Lb5:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            float r0 = r4.mBaseTextSize
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto Lc
            r0 = r1
            goto L11
        Lc:
            float r0 = r4.mTextSize
            float r2 = r4.mBaseTextSize
            float r0 = r0 / r2
        L11:
            super.onDraw(r5)
            boolean r2 = r4.mUseOutline
            if (r2 != 0) goto L37
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L37
            int r0 = r4.mPaddingLeft
            float r0 = (float) r0
            float r1 = r4.getHorizontalOffset()
            float r0 = r0 + r1
            int r1 = r4.mPaddingTop
            float r1 = (float) r1
            float r2 = r4.getVerticalOffset()
            float r1 = r1 + r2
            java.lang.String r2 = r4.mText
            float r3 = r4.mDeltaLeft
            float r3 = r3 + r0
            android.text.TextPaint r0 = r4.mPaint
            r5.drawText(r2, r3, r1, r0)
            return
        L37:
            boolean r1 = r4.mNotBuilt
            if (r1 == 0) goto L3e
            r4.buildShape(r0)
        L3e:
            android.graphics.Matrix r1 = r4.mOutlinePositionMatrix
            if (r1 != 0) goto L49
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r4.mOutlinePositionMatrix = r1
        L49:
            boolean r1 = r4.mUseOutline
            if (r1 == 0) goto Le9
            android.graphics.Paint r1 = r4.paintCache
            android.text.TextPaint r2 = r4.mPaint
            r1.set(r2)
            android.graphics.Matrix r1 = r4.mOutlinePositionMatrix
            r1.reset()
            int r1 = r4.mPaddingLeft
            float r1 = (float) r1
            float r2 = r4.getHorizontalOffset()
            float r1 = r1 + r2
            int r2 = r4.mPaddingTop
            float r2 = (float) r2
            float r3 = r4.getVerticalOffset()
            float r2 = r2 + r3
            android.graphics.Matrix r3 = r4.mOutlinePositionMatrix
            r3.postTranslate(r1, r2)
            android.graphics.Matrix r3 = r4.mOutlinePositionMatrix
            r3.preScale(r0, r0)
            android.graphics.Path r0 = r4.mPath
            android.graphics.Matrix r3 = r4.mOutlinePositionMatrix
            r0.transform(r3)
            android.graphics.BitmapShader r0 = r4.mTextShader
            if (r0 == 0) goto L8c
            android.text.TextPaint r0 = r4.mPaint
            r3 = 1
            r0.setFilterBitmap(r3)
            android.text.TextPaint r0 = r4.mPaint
            android.graphics.BitmapShader r3 = r4.mTextShader
            r0.setShader(r3)
            goto L93
        L8c:
            android.text.TextPaint r0 = r4.mPaint
            int r3 = r4.mTextFillColor
            r0.setColor(r3)
        L93:
            android.text.TextPaint r0 = r4.mPaint
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r0.setStyle(r3)
            android.text.TextPaint r0 = r4.mPaint
            float r3 = r4.mTextOutlineThickness
            r0.setStrokeWidth(r3)
            android.graphics.Path r0 = r4.mPath
            android.text.TextPaint r3 = r4.mPaint
            r5.drawPath(r0, r3)
            android.graphics.BitmapShader r0 = r4.mTextShader
            if (r0 == 0) goto Lb2
            android.text.TextPaint r0 = r4.mPaint
            r3 = 0
            r0.setShader(r3)
        Lb2:
            android.text.TextPaint r0 = r4.mPaint
            int r3 = r4.mTextOutlineColor
            r0.setColor(r3)
            android.text.TextPaint r0 = r4.mPaint
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r3)
            android.text.TextPaint r0 = r4.mPaint
            float r3 = r4.mTextOutlineThickness
            r0.setStrokeWidth(r3)
            android.graphics.Path r0 = r4.mPath
            android.text.TextPaint r3 = r4.mPaint
            r5.drawPath(r0, r3)
            android.graphics.Matrix r5 = r4.mOutlinePositionMatrix
            r5.reset()
            android.graphics.Matrix r5 = r4.mOutlinePositionMatrix
            float r0 = -r1
            float r1 = -r2
            r5.postTranslate(r0, r1)
            android.graphics.Path r5 = r4.mPath
            android.graphics.Matrix r0 = r4.mOutlinePositionMatrix
            r5.transform(r0)
            android.text.TextPaint r5 = r4.mPaint
            android.graphics.Paint r0 = r4.paintCache
            r5.set(r0)
            goto L139
        Le9:
            int r0 = r4.mPaddingLeft
            float r0 = (float) r0
            float r1 = r4.getHorizontalOffset()
            float r0 = r0 + r1
            int r1 = r4.mPaddingTop
            float r1 = (float) r1
            float r2 = r4.getVerticalOffset()
            float r1 = r1 + r2
            android.graphics.Matrix r2 = r4.mOutlinePositionMatrix
            r2.reset()
            android.graphics.Matrix r2 = r4.mOutlinePositionMatrix
            r2.preTranslate(r0, r1)
            android.graphics.Path r2 = r4.mPath
            android.graphics.Matrix r3 = r4.mOutlinePositionMatrix
            r2.transform(r3)
            android.text.TextPaint r2 = r4.mPaint
            int r3 = r4.mTextFillColor
            r2.setColor(r3)
            android.text.TextPaint r2 = r4.mPaint
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL_AND_STROKE
            r2.setStyle(r3)
            android.text.TextPaint r2 = r4.mPaint
            float r3 = r4.mTextOutlineThickness
            r2.setStrokeWidth(r3)
            android.graphics.Path r2 = r4.mPath
            android.text.TextPaint r3 = r4.mPaint
            r5.drawPath(r2, r3)
            android.graphics.Matrix r5 = r4.mOutlinePositionMatrix
            r5.reset()
            android.graphics.Matrix r5 = r4.mOutlinePositionMatrix
            float r0 = -r0
            float r1 = -r1
            r5.preTranslate(r0, r1)
            android.graphics.Path r5 = r4.mPath
            android.graphics.Matrix r0 = r4.mOutlinePositionMatrix
            r5.transform(r0)
        L139:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r9, int r10) {
            r8 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            int r1 = android.view.View.MeasureSpec.getMode(r10)
            int r9 = android.view.View.MeasureSpec.getSize(r9)
            int r10 = android.view.View.MeasureSpec.getSize(r10)
            r2 = 0
            r8.mAutoSize = r2
            int r3 = r8.getPaddingLeft()
            r8.mPaddingLeft = r3
            int r3 = r8.getPaddingRight()
            r8.mPaddingRight = r3
            int r3 = r8.getPaddingTop()
            r8.mPaddingTop = r3
            int r3 = r8.getPaddingBottom()
            r8.mPaddingBottom = r3
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 != r3) goto L3a
            if (r1 == r3) goto L32
            goto L3a
        L32:
            int r0 = r8.mAutoSizeTextType
            if (r0 == 0) goto L75
            r0 = 1
            r8.mAutoSize = r0
            goto L75
        L3a:
            android.text.TextPaint r4 = r8.mPaint
            java.lang.String r5 = r8.mText
            int r6 = r5.length()
            android.graphics.Rect r7 = r8.mTextBounds
            r4.getTextBounds(r5, r2, r6, r7)
            r2 = 1065353048(0x3f7fff58, float:0.99999)
            if (r0 == r3) goto L55
            android.graphics.Rect r9 = r8.mTextBounds
            int r9 = r9.width()
            float r9 = (float) r9
            float r9 = r9 + r2
            int r9 = (int) r9
        L55:
            int r0 = r8.mPaddingLeft
            int r4 = r8.mPaddingRight
            int r0 = r0 + r4
            int r9 = r9 + r0
            if (r1 == r3) goto L75
            android.text.TextPaint r0 = r8.mPaint
            r3 = 0
            int r0 = r0.getFontMetricsInt(r3)
            float r0 = (float) r0
            float r0 = r0 + r2
            int r0 = (int) r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L6f
            int r0 = java.lang.Math.min(r10, r0)
        L6f:
            int r10 = r8.mPaddingTop
            int r1 = r8.mPaddingBottom
            int r10 = r10 + r1
            int r10 = r10 + r0
        L75:
            r8.setMeasuredDimension(r9, r10)
            return
    }

    public void setGravity(int r8) {
            r7 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r8 & r0
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 != 0) goto Lb
            r8 = r8 | r2
        Lb:
            r1 = r8 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L11
            r8 = r8 | 48
        L11:
            int r1 = r7.mGravity
            if (r8 == r1) goto L18
            r7.invalidate()
        L18:
            r7.mGravity = r8
            r1 = r8 & 112(0x70, float:1.57E-43)
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = 48
            if (r1 == r6) goto L2f
            r6 = 80
            if (r1 == r6) goto L2c
            r7.mTextPanY = r3
            goto L31
        L2c:
            r7.mTextPanY = r4
            goto L31
        L2f:
            r7.mTextPanY = r5
        L31:
            r8 = r8 & r0
            r0 = 3
            if (r8 == r0) goto L45
            r0 = 5
            if (r8 == r0) goto L42
            if (r8 == r2) goto L45
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r8 == r0) goto L42
            r7.mTextPanX = r3
            goto L47
        L42:
            r7.mTextPanX = r4
            goto L47
        L45:
            r7.mTextPanX = r5
        L47:
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
            androidx.constraintlayout.utils.widget.MotionLabel$2 r5 = new androidx.constraintlayout.utils.widget.MotionLabel$2
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
            androidx.constraintlayout.utils.widget.MotionLabel$1 r6 = new androidx.constraintlayout.utils.widget.MotionLabel$1
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

    public void setScaleFromTextSize(float r1) {
            r0 = this;
            r0.mBaseTextSize = r1
            return
    }

    public void setText(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            r0.mText = r1
            r0.invalidate()
            return
    }

    public void setTextBackgroundPanX(float r1) {
            r0 = this;
            r0.mBackgroundPanX = r1
            r0.updateShaderMatrix()
            r0.invalidate()
            return
    }

    public void setTextBackgroundPanY(float r1) {
            r0 = this;
            r0.mBackgroundPanY = r1
            r0.updateShaderMatrix()
            r0.invalidate()
            return
    }

    public void setTextBackgroundRotate(float r1) {
            r0 = this;
            r0.mRotate = r1
            r0.updateShaderMatrix()
            r0.invalidate()
            return
    }

    public void setTextBackgroundZoom(float r1) {
            r0 = this;
            r0.mZoom = r1
            r0.updateShaderMatrix()
            r0.invalidate()
            return
    }

    public void setTextFillColor(int r1) {
            r0 = this;
            r0.mTextFillColor = r1
            r0.invalidate()
            return
    }

    public void setTextOutlineColor(int r1) {
            r0 = this;
            r0.mTextOutlineColor = r1
            r1 = 1
            r0.mUseOutline = r1
            r0.invalidate()
            return
    }

    public void setTextOutlineThickness(float r2) {
            r1 = this;
            r1.mTextOutlineThickness = r2
            r0 = 1
            r1.mUseOutline = r0
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L12
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.mTextOutlineThickness = r2
            r2 = 0
            r1.mUseOutline = r2
        L12:
            r1.invalidate()
            return
    }

    public void setTextPanX(float r1) {
            r0 = this;
            r0.mTextPanX = r1
            r0.invalidate()
            return
    }

    public void setTextPanY(float r1) {
            r0 = this;
            r0.mTextPanY = r1
            r0.invalidate()
            return
    }

    public void setTextSize(float r4) {
            r3 = this;
            r3.mTextSize = r4
            java.lang.String r0 = androidx.constraintlayout.utils.widget.MotionLabel.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = androidx.constraintlayout.motion.widget.Debug.getLoc()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "  "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " / "
            java.lang.StringBuilder r1 = r1.append(r2)
            float r2 = r3.mBaseTextSize
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
            android.text.TextPaint r0 = r3.mPaint
            float r1 = r3.mBaseTextSize
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L39
            goto L3b
        L39:
            float r4 = r3.mBaseTextSize
        L3b:
            r0.setTextSize(r4)
            float r4 = r3.mBaseTextSize
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 == 0) goto L49
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L4e
        L49:
            float r4 = r3.mTextSize
            float r0 = r3.mBaseTextSize
            float r4 = r4 / r0
        L4e:
            r3.buildShape(r4)
            r3.requestLayout()
            r3.invalidate()
            return
    }

    public void setTextureHeight(float r1) {
            r0 = this;
            r0.mTextureHeight = r1
            r0.updateShaderMatrix()
            r0.invalidate()
            return
    }

    public void setTextureWidth(float r1) {
            r0 = this;
            r0.mTextureWidth = r1
            r0.updateShaderMatrix()
            r0.invalidate()
            return
    }

    public void setTypeface(android.graphics.Typeface r2) {
            r1 = this;
            android.text.TextPaint r0 = r1.mPaint
            android.graphics.Typeface r0 = r0.getTypeface()
            if (r0 == r2) goto L1a
            android.text.TextPaint r0 = r1.mPaint
            r0.setTypeface(r2)
            android.text.Layout r2 = r1.mLayout
            if (r2 == 0) goto L1a
            r2 = 0
            r1.mLayout = r2
            r1.requestLayout()
            r1.invalidate()
        L1a:
            return
    }

    void setupPath() {
            r3 = this;
            int r0 = r3.getPaddingLeft()
            r3.mPaddingLeft = r0
            int r0 = r3.getPaddingRight()
            r3.mPaddingRight = r0
            int r0 = r3.getPaddingTop()
            r3.mPaddingTop = r0
            int r0 = r3.getPaddingBottom()
            r3.mPaddingBottom = r0
            java.lang.String r0 = r3.mFontFamily
            int r1 = r3.mTypefaceIndex
            int r2 = r3.mStyleIndex
            r3.setTypefaceFromAttrs(r0, r1, r2)
            android.text.TextPaint r0 = r3.mPaint
            int r1 = r3.mTextFillColor
            r0.setColor(r1)
            android.text.TextPaint r0 = r3.mPaint
            float r1 = r3.mTextOutlineThickness
            r0.setStrokeWidth(r1)
            android.text.TextPaint r0 = r3.mPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            r0.setStyle(r1)
            android.text.TextPaint r0 = r3.mPaint
            r1 = 128(0x80, float:1.794E-43)
            r0.setFlags(r1)
            float r0 = r3.mTextSize
            r3.setTextSize(r0)
            android.text.TextPaint r0 = r3.mPaint
            r1 = 1
            r0.setAntiAlias(r1)
            return
    }
}
