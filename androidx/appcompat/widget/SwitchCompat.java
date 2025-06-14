package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class SwitchCompat extends android.widget.CompoundButton {
    private static final java.lang.String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    private static final int[] CHECKED_STATE_SET = null;
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final android.util.Property<androidx.appcompat.widget.SwitchCompat, java.lang.Float> THUMB_POS = null;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int TOUCH_MODE_IDLE = 0;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mMinFlingVelocity;
    private android.text.Layout mOffLayout;
    private android.text.Layout mOnLayout;
    android.animation.ObjectAnimator mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private android.text.method.TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final android.graphics.Rect mTempRect;
    private android.content.res.ColorStateList mTextColors;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;
    private java.lang.CharSequence mTextOff;
    private java.lang.CharSequence mTextOn;
    private final android.text.TextPaint mTextPaint;
    private android.graphics.drawable.Drawable mThumbDrawable;
    float mThumbPosition;
    private int mThumbTextPadding;
    private android.content.res.ColorStateList mThumbTintList;
    private android.graphics.PorterDuff.Mode mThumbTintMode;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private android.graphics.drawable.Drawable mTrackDrawable;
    private android.content.res.ColorStateList mTrackTintList;
    private android.graphics.PorterDuff.Mode mTrackTintMode;
    private android.view.VelocityTracker mVelocityTracker;


    static {
            androidx.appcompat.widget.SwitchCompat$1 r0 = new androidx.appcompat.widget.SwitchCompat$1
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "thumbPos"
            r0.<init>(r1, r2)
            androidx.appcompat.widget.SwitchCompat.THUMB_POS = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r1] = r2
            androidx.appcompat.widget.SwitchCompat.CHECKED_STATE_SET = r0
            return
    }

    public SwitchCompat(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SwitchCompat(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.C0015R.attr.switchStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public SwitchCompat(android.content.Context r12, android.util.AttributeSet r13, int r14) {
            r11 = this;
            r11.<init>(r12, r13, r14)
            r0 = 0
            r11.mThumbTintList = r0
            r11.mThumbTintMode = r0
            r1 = 0
            r11.mHasThumbTint = r1
            r11.mHasThumbTintMode = r1
            r11.mTrackTintList = r0
            r11.mTrackTintMode = r0
            r11.mHasTrackTint = r1
            r11.mHasTrackTintMode = r1
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r11.mVelocityTracker = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r11.mTempRect = r2
            android.content.Context r2 = r11.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r11, r2)
            android.text.TextPaint r2 = new android.text.TextPaint
            r3 = 1
            r2.<init>(r3)
            r11.mTextPaint = r2
            android.content.res.Resources r4 = r11.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r2.density = r4
            int[] r2 = androidx.appcompat.C0015R.styleable.SwitchCompat
            androidx.appcompat.widget.TintTypedArray r2 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r12, r13, r2, r14, r1)
            int[] r6 = androidx.appcompat.C0015R.styleable.SwitchCompat
            android.content.res.TypedArray r8 = r2.getWrappedTypeArray()
            r10 = 0
            r4 = r11
            r5 = r12
            r7 = r13
            r9 = r14
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r4, r5, r6, r7, r8, r9, r10)
            int r4 = androidx.appcompat.C0015R.styleable.SwitchCompat_android_thumb
            android.graphics.drawable.Drawable r4 = r2.getDrawable(r4)
            r11.mThumbDrawable = r4
            if (r4 == 0) goto L5e
            r4.setCallback(r11)
        L5e:
            int r4 = androidx.appcompat.C0015R.styleable.SwitchCompat_track
            android.graphics.drawable.Drawable r4 = r2.getDrawable(r4)
            r11.mTrackDrawable = r4
            if (r4 == 0) goto L6b
            r4.setCallback(r11)
        L6b:
            int r4 = androidx.appcompat.C0015R.styleable.SwitchCompat_android_textOn
            java.lang.CharSequence r4 = r2.getText(r4)
            r11.mTextOn = r4
            int r4 = androidx.appcompat.C0015R.styleable.SwitchCompat_android_textOff
            java.lang.CharSequence r4 = r2.getText(r4)
            r11.mTextOff = r4
            int r4 = androidx.appcompat.C0015R.styleable.SwitchCompat_showText
            boolean r4 = r2.getBoolean(r4, r3)
            r11.mShowText = r4
            int r4 = androidx.appcompat.C0015R.styleable.SwitchCompat_thumbTextPadding
            int r4 = r2.getDimensionPixelSize(r4, r1)
            r11.mThumbTextPadding = r4
            int r4 = androidx.appcompat.C0015R.styleable.SwitchCompat_switchMinWidth
            int r4 = r2.getDimensionPixelSize(r4, r1)
            r11.mSwitchMinWidth = r4
            int r4 = androidx.appcompat.C0015R.styleable.SwitchCompat_switchPadding
            int r4 = r2.getDimensionPixelSize(r4, r1)
            r11.mSwitchPadding = r4
            int r4 = androidx.appcompat.C0015R.styleable.SwitchCompat_splitTrack
            boolean r4 = r2.getBoolean(r4, r1)
            r11.mSplitTrack = r4
            int r4 = androidx.appcompat.C0015R.styleable.SwitchCompat_thumbTint
            android.content.res.ColorStateList r4 = r2.getColorStateList(r4)
            if (r4 == 0) goto Laf
            r11.mThumbTintList = r4
            r11.mHasThumbTint = r3
        Laf:
            int r4 = androidx.appcompat.C0015R.styleable.SwitchCompat_thumbTintMode
            r5 = -1
            int r4 = r2.getInt(r4, r5)
            android.graphics.PorterDuff$Mode r4 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r4, r0)
            android.graphics.PorterDuff$Mode r6 = r11.mThumbTintMode
            if (r6 == r4) goto Lc2
            r11.mThumbTintMode = r4
            r11.mHasThumbTintMode = r3
        Lc2:
            boolean r4 = r11.mHasThumbTint
            if (r4 != 0) goto Lca
            boolean r4 = r11.mHasThumbTintMode
            if (r4 == 0) goto Lcd
        Lca:
            r11.applyThumbTint()
        Lcd:
            int r4 = androidx.appcompat.C0015R.styleable.SwitchCompat_trackTint
            android.content.res.ColorStateList r4 = r2.getColorStateList(r4)
            if (r4 == 0) goto Ld9
            r11.mTrackTintList = r4
            r11.mHasTrackTint = r3
        Ld9:
            int r4 = androidx.appcompat.C0015R.styleable.SwitchCompat_trackTintMode
            int r4 = r2.getInt(r4, r5)
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r4, r0)
            android.graphics.PorterDuff$Mode r4 = r11.mTrackTintMode
            if (r4 == r0) goto Leb
            r11.mTrackTintMode = r0
            r11.mHasTrackTintMode = r3
        Leb:
            boolean r0 = r11.mHasTrackTint
            if (r0 != 0) goto Lf3
            boolean r0 = r11.mHasTrackTintMode
            if (r0 == 0) goto Lf6
        Lf3:
            r11.applyTrackTint()
        Lf6:
            int r0 = androidx.appcompat.C0015R.styleable.SwitchCompat_switchTextAppearance
            int r0 = r2.getResourceId(r0, r1)
            if (r0 == 0) goto L101
            r11.setSwitchTextAppearance(r12, r0)
        L101:
            androidx.appcompat.widget.AppCompatTextHelper r0 = new androidx.appcompat.widget.AppCompatTextHelper
            r0.<init>(r11)
            r11.mTextHelper = r0
            r0.loadFromAttributes(r13, r14)
            r2.recycle()
            android.view.ViewConfiguration r12 = android.view.ViewConfiguration.get(r12)
            int r13 = r12.getScaledTouchSlop()
            r11.mTouchSlop = r13
            int r12 = r12.getScaledMinimumFlingVelocity()
            r11.mMinFlingVelocity = r12
            r11.refreshDrawableState()
            boolean r12 = r11.isChecked()
            r11.setChecked(r12)
            return
    }

    private void animateThumbToCheckedState(boolean r5) {
            r4 = this;
            if (r5 == 0) goto L5
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L6
        L5:
            r5 = 0
        L6:
            android.util.Property<androidx.appcompat.widget.SwitchCompat, java.lang.Float> r0 = androidx.appcompat.widget.SwitchCompat.THUMB_POS
            r1 = 1
            float[] r2 = new float[r1]
            r3 = 0
            r2[r3] = r5
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r4, r0, r2)
            r4.mPositionAnimator = r5
            r2 = 250(0xfa, double:1.235E-321)
            r5.setDuration(r2)
            android.animation.ObjectAnimator r5 = r4.mPositionAnimator
            r5.setAutoCancel(r1)
            android.animation.ObjectAnimator r5 = r4.mPositionAnimator
            r5.start()
            return
    }

    private void applyThumbTint() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mThumbDrawable
            if (r0 == 0) goto L3b
            boolean r1 = r2.mHasThumbTint
            if (r1 != 0) goto Lc
            boolean r1 = r2.mHasThumbTintMode
            if (r1 == 0) goto L3b
        Lc:
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.mThumbDrawable = r0
            boolean r1 = r2.mHasThumbTint
            if (r1 == 0) goto L1f
            android.content.res.ColorStateList r1 = r2.mThumbTintList
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
        L1f:
            boolean r0 = r2.mHasThumbTintMode
            if (r0 == 0) goto L2a
            android.graphics.drawable.Drawable r0 = r2.mThumbDrawable
            android.graphics.PorterDuff$Mode r1 = r2.mThumbTintMode
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r1)
        L2a:
            android.graphics.drawable.Drawable r0 = r2.mThumbDrawable
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3b
            android.graphics.drawable.Drawable r0 = r2.mThumbDrawable
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L3b:
            return
    }

    private void applyTrackTint() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mTrackDrawable
            if (r0 == 0) goto L3b
            boolean r1 = r2.mHasTrackTint
            if (r1 != 0) goto Lc
            boolean r1 = r2.mHasTrackTintMode
            if (r1 == 0) goto L3b
        Lc:
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.mTrackDrawable = r0
            boolean r1 = r2.mHasTrackTint
            if (r1 == 0) goto L1f
            android.content.res.ColorStateList r1 = r2.mTrackTintList
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
        L1f:
            boolean r0 = r2.mHasTrackTintMode
            if (r0 == 0) goto L2a
            android.graphics.drawable.Drawable r0 = r2.mTrackDrawable
            android.graphics.PorterDuff$Mode r1 = r2.mTrackTintMode
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r1)
        L2a:
            android.graphics.drawable.Drawable r0 = r2.mTrackDrawable
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3b
            android.graphics.drawable.Drawable r0 = r2.mTrackDrawable
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L3b:
            return
    }

    private void cancelPositionAnimator() {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.mPositionAnimator
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    private void cancelSuperTouch(android.view.MotionEvent r2) {
            r1 = this;
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r2)
            r0 = 3
            r2.setAction(r0)
            super.onTouchEvent(r2)
            r2.recycle()
            return
    }

    private static float constrain(float r1, float r2, float r3) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L6
            r1 = r2
            goto Lb
        L6:
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 <= 0) goto Lb
            r1 = r3
        Lb:
            return r1
    }

    private boolean getTargetCheckedState() {
            r2 = this;
            float r0 = r2.mThumbPosition
            r1 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private int getThumbOffset() {
            r2 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r2)
            if (r0 == 0) goto Lc
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r2.mThumbPosition
            float r0 = r0 - r1
            goto Le
        Lc:
            float r0 = r2.mThumbPosition
        Le:
            int r1 = r2.getThumbScrollRange()
            float r1 = (float) r1
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            return r0
    }

    private int getThumbScrollRange() {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.mTrackDrawable
            if (r0 == 0) goto L26
            android.graphics.Rect r1 = r4.mTempRect
            r0.getPadding(r1)
            android.graphics.drawable.Drawable r0 = r4.mThumbDrawable
            if (r0 == 0) goto L12
            android.graphics.Rect r0 = androidx.appcompat.widget.DrawableUtils.getOpticalBounds(r0)
            goto L14
        L12:
            android.graphics.Rect r0 = androidx.appcompat.widget.DrawableUtils.INSETS_NONE
        L14:
            int r2 = r4.mSwitchWidth
            int r3 = r4.mThumbWidth
            int r2 = r2 - r3
            int r3 = r1.left
            int r2 = r2 - r3
            int r1 = r1.right
            int r2 = r2 - r1
            int r1 = r0.left
            int r2 = r2 - r1
            int r0 = r0.right
            int r2 = r2 - r0
            return r2
        L26:
            r0 = 0
            return r0
    }

    private boolean hitThumb(float r7, float r8) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.mThumbDrawable
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r6.getThumbOffset()
            android.graphics.drawable.Drawable r2 = r6.mThumbDrawable
            android.graphics.Rect r3 = r6.mTempRect
            r2.getPadding(r3)
            int r2 = r6.mSwitchTop
            int r3 = r6.mTouchSlop
            int r2 = r2 - r3
            int r4 = r6.mSwitchLeft
            int r4 = r4 + r0
            int r4 = r4 - r3
            int r0 = r6.mThumbWidth
            int r0 = r0 + r4
            android.graphics.Rect r3 = r6.mTempRect
            int r3 = r3.left
            int r0 = r0 + r3
            android.graphics.Rect r3 = r6.mTempRect
            int r3 = r3.right
            int r0 = r0 + r3
            int r3 = r6.mTouchSlop
            int r0 = r0 + r3
            int r5 = r6.mSwitchBottom
            int r5 = r5 + r3
            float r3 = (float) r4
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 <= 0) goto L42
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L42
            float r7 = (float) r2
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 <= 0) goto L42
            float r7 = (float) r5
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 >= 0) goto L42
            r1 = 1
        L42:
            return r1
    }

    private android.text.Layout makeLayout(java.lang.CharSequence r9) {
            r8 = this;
            android.text.method.TransformationMethod r0 = r8.mSwitchTransformationMethod
            if (r0 == 0) goto L8
            java.lang.CharSequence r9 = r0.getTransformation(r9, r8)
        L8:
            r1 = r9
            android.text.StaticLayout r9 = new android.text.StaticLayout
            android.text.TextPaint r2 = r8.mTextPaint
            if (r1 == 0) goto L1a
            float r0 = android.text.Layout.getDesiredWidth(r1, r2)
            double r3 = (double) r0
            double r3 = java.lang.Math.ceil(r3)
            int r0 = (int) r3
            goto L1b
        L1a:
            r0 = 0
        L1b:
            r3 = r0
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r7 = 1
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    private void setOffStateDescriptionOnRAndAbove() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L17
            java.lang.CharSequence r0 = r2.mTextOff
            if (r0 != 0) goto L14
            android.content.res.Resources r0 = r2.getResources()
            int r1 = androidx.appcompat.C0015R.string.abc_capital_off
            java.lang.String r0 = r0.getString(r1)
        L14:
            androidx.core.view.ViewCompat.setStateDescription(r2, r0)
        L17:
            return
    }

    private void setOnStateDescriptionOnRAndAbove() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L17
            java.lang.CharSequence r0 = r2.mTextOn
            if (r0 != 0) goto L14
            android.content.res.Resources r0 = r2.getResources()
            int r1 = androidx.appcompat.C0015R.string.abc_capital_on
            java.lang.String r0 = r0.getString(r1)
        L14:
            androidx.core.view.ViewCompat.setStateDescription(r2, r0)
        L17:
            return
    }

    private void setSwitchTypefaceByIndex(int r2, int r3) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L11
            r0 = 2
            if (r2 == r0) goto Le
            r0 = 3
            if (r2 == r0) goto Lb
            r2 = 0
            goto L13
        Lb:
            android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE
            goto L13
        Le:
            android.graphics.Typeface r2 = android.graphics.Typeface.SERIF
            goto L13
        L11:
            android.graphics.Typeface r2 = android.graphics.Typeface.SANS_SERIF
        L13:
            r1.setSwitchTypeface(r2, r3)
            return
    }

    private void stopDrag(android.view.MotionEvent r7) {
            r6 = this;
            r0 = 0
            r6.mTouchMode = r0
            int r1 = r7.getAction()
            r2 = 1
            if (r1 != r2) goto L12
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L12
            r1 = r2
            goto L13
        L12:
            r1 = r0
        L13:
            boolean r3 = r6.isChecked()
            if (r1 == 0) goto L49
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            r4 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r4)
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            float r1 = r1.getXVelocity()
            float r4 = java.lang.Math.abs(r1)
            int r5 = r6.mMinFlingVelocity
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L44
            boolean r4 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r6)
            r5 = 0
            if (r4 == 0) goto L3d
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L42
            goto L4a
        L3d:
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L42
            goto L4a
        L42:
            r2 = r0
            goto L4a
        L44:
            boolean r2 = r6.getTargetCheckedState()
            goto L4a
        L49:
            r2 = r3
        L4a:
            if (r2 == r3) goto L4f
            r6.playSoundEffect(r0)
        L4f:
            r6.setChecked(r2)
            r6.cancelSuperTouch(r7)
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r11) {
            r10 = this;
            android.graphics.Rect r0 = r10.mTempRect
            int r1 = r10.mSwitchLeft
            int r2 = r10.mSwitchTop
            int r3 = r10.mSwitchRight
            int r4 = r10.mSwitchBottom
            int r5 = r10.getThumbOffset()
            int r5 = r5 + r1
            android.graphics.drawable.Drawable r6 = r10.mThumbDrawable
            if (r6 == 0) goto L18
            android.graphics.Rect r6 = androidx.appcompat.widget.DrawableUtils.getOpticalBounds(r6)
            goto L1a
        L18:
            android.graphics.Rect r6 = androidx.appcompat.widget.DrawableUtils.INSETS_NONE
        L1a:
            android.graphics.drawable.Drawable r7 = r10.mTrackDrawable
            if (r7 == 0) goto L61
            r7.getPadding(r0)
            int r7 = r0.left
            int r5 = r5 + r7
            if (r6 == 0) goto L5a
            int r7 = r6.left
            int r8 = r0.left
            if (r7 <= r8) goto L32
            int r7 = r6.left
            int r8 = r0.left
            int r7 = r7 - r8
            int r1 = r1 + r7
        L32:
            int r7 = r6.top
            int r8 = r0.top
            if (r7 <= r8) goto L3f
            int r7 = r6.top
            int r8 = r0.top
            int r7 = r7 - r8
            int r7 = r7 + r2
            goto L40
        L3f:
            r7 = r2
        L40:
            int r8 = r6.right
            int r9 = r0.right
            if (r8 <= r9) goto L4c
            int r8 = r6.right
            int r9 = r0.right
            int r8 = r8 - r9
            int r3 = r3 - r8
        L4c:
            int r8 = r6.bottom
            int r9 = r0.bottom
            if (r8 <= r9) goto L5b
            int r6 = r6.bottom
            int r8 = r0.bottom
            int r6 = r6 - r8
            int r6 = r4 - r6
            goto L5c
        L5a:
            r7 = r2
        L5b:
            r6 = r4
        L5c:
            android.graphics.drawable.Drawable r8 = r10.mTrackDrawable
            r8.setBounds(r1, r7, r3, r6)
        L61:
            android.graphics.drawable.Drawable r1 = r10.mThumbDrawable
            if (r1 == 0) goto L80
            r1.getPadding(r0)
            int r1 = r0.left
            int r1 = r5 - r1
            int r3 = r10.mThumbWidth
            int r5 = r5 + r3
            int r0 = r0.right
            int r5 = r5 + r0
            android.graphics.drawable.Drawable r0 = r10.mThumbDrawable
            r0.setBounds(r1, r2, r5, r4)
            android.graphics.drawable.Drawable r0 = r10.getBackground()
            if (r0 == 0) goto L80
            androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(r0, r1, r2, r5, r4)
        L80:
            super.draw(r11)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float r2, float r3) {
            r1 = this;
            super.drawableHotspotChanged(r2, r3)
            android.graphics.drawable.Drawable r0 = r1.mThumbDrawable
            if (r0 == 0) goto La
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(r0, r2, r3)
        La:
            android.graphics.drawable.Drawable r0 = r1.mTrackDrawable
            if (r0 == 0) goto L11
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(r0, r2, r3)
        L11:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r4 = this;
            super.drawableStateChanged()
            int[] r0 = r4.getDrawableState()
            android.graphics.drawable.Drawable r1 = r4.mThumbDrawable
            r2 = 0
            if (r1 == 0) goto L17
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L17
            boolean r1 = r1.setState(r0)
            r2 = r2 | r1
        L17:
            android.graphics.drawable.Drawable r1 = r4.mTrackDrawable
            if (r1 == 0) goto L26
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L26
            boolean r0 = r1.setState(r0)
            r2 = r2 | r0
        L26:
            if (r2 == 0) goto L2b
            r4.invalidate()
        L2b:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
            r2 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r2)
            if (r0 != 0) goto Lb
            int r0 = super.getCompoundPaddingLeft()
            return r0
        Lb:
            int r0 = super.getCompoundPaddingLeft()
            int r1 = r2.mSwitchWidth
            int r0 = r0 + r1
            java.lang.CharSequence r1 = r2.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1f
            int r1 = r2.mSwitchPadding
            int r0 = r0 + r1
        L1f:
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
            r2 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r2)
            if (r0 == 0) goto Lb
            int r0 = super.getCompoundPaddingRight()
            return r0
        Lb:
            int r0 = super.getCompoundPaddingRight()
            int r1 = r2.mSwitchWidth
            int r0 = r0 + r1
            java.lang.CharSequence r1 = r2.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1f
            int r1 = r2.mSwitchPadding
            int r0 = r0 + r1
        L1f:
            return r0
    }

    public boolean getShowText() {
            r1 = this;
            boolean r0 = r1.mShowText
            return r0
    }

    public boolean getSplitTrack() {
            r1 = this;
            boolean r0 = r1.mSplitTrack
            return r0
    }

    public int getSwitchMinWidth() {
            r1 = this;
            int r0 = r1.mSwitchMinWidth
            return r0
    }

    public int getSwitchPadding() {
            r1 = this;
            int r0 = r1.mSwitchPadding
            return r0
    }

    public java.lang.CharSequence getTextOff() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTextOff
            return r0
    }

    public java.lang.CharSequence getTextOn() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTextOn
            return r0
    }

    public android.graphics.drawable.Drawable getThumbDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mThumbDrawable
            return r0
    }

    public int getThumbTextPadding() {
            r1 = this;
            int r0 = r1.mThumbTextPadding
            return r0
    }

    public android.content.res.ColorStateList getThumbTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mThumbTintList
            return r0
    }

    public android.graphics.PorterDuff.Mode getThumbTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.mThumbTintMode
            return r0
    }

    public android.graphics.drawable.Drawable getTrackDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mTrackDrawable
            return r0
    }

    public android.content.res.ColorStateList getTrackTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mTrackTintList
            return r0
    }

    public android.graphics.PorterDuff.Mode getTrackTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.mTrackTintMode
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.mThumbDrawable
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            android.graphics.drawable.Drawable r0 = r1.mTrackDrawable
            if (r0 == 0) goto L11
            r0.jumpToCurrentState()
        L11:
            android.animation.ObjectAnimator r0 = r1.mPositionAnimator
            if (r0 == 0) goto L23
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L23
            android.animation.ObjectAnimator r0 = r1.mPositionAnimator
            r0.end()
            r0 = 0
            r1.mPositionAnimator = r0
        L23:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int[] r2 = super.onCreateDrawableState(r2)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L11
            int[] r0 = androidx.appcompat.widget.SwitchCompat.CHECKED_STATE_SET
            mergeDrawableStates(r2, r0)
        L11:
            return r2
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            super.onDraw(r10)
            android.graphics.Rect r0 = r9.mTempRect
            android.graphics.drawable.Drawable r1 = r9.mTrackDrawable
            if (r1 == 0) goto Ld
            r1.getPadding(r0)
            goto L10
        Ld:
            r0.setEmpty()
        L10:
            int r2 = r9.mSwitchTop
            int r3 = r9.mSwitchBottom
            int r4 = r0.top
            int r2 = r2 + r4
            int r4 = r0.bottom
            int r3 = r3 - r4
            android.graphics.drawable.Drawable r4 = r9.mThumbDrawable
            if (r1 == 0) goto L4c
            boolean r5 = r9.mSplitTrack
            if (r5 == 0) goto L49
            if (r4 == 0) goto L49
            android.graphics.Rect r5 = androidx.appcompat.widget.DrawableUtils.getOpticalBounds(r4)
            r4.copyBounds(r0)
            int r6 = r0.left
            int r7 = r5.left
            int r6 = r6 + r7
            r0.left = r6
            int r6 = r0.right
            int r5 = r5.right
            int r6 = r6 - r5
            r0.right = r6
            int r5 = r10.save()
            android.graphics.Region$Op r6 = android.graphics.Region.Op.DIFFERENCE
            r10.clipRect(r0, r6)
            r1.draw(r10)
            r10.restoreToCount(r5)
            goto L4c
        L49:
            r1.draw(r10)
        L4c:
            int r0 = r10.save()
            if (r4 == 0) goto L55
            r4.draw(r10)
        L55:
            boolean r1 = r9.getTargetCheckedState()
            if (r1 == 0) goto L5e
            android.text.Layout r1 = r9.mOnLayout
            goto L60
        L5e:
            android.text.Layout r1 = r9.mOffLayout
        L60:
            if (r1 == 0) goto La3
            int[] r5 = r9.getDrawableState()
            android.content.res.ColorStateList r6 = r9.mTextColors
            if (r6 == 0) goto L74
            android.text.TextPaint r7 = r9.mTextPaint
            r8 = 0
            int r6 = r6.getColorForState(r5, r8)
            r7.setColor(r6)
        L74:
            android.text.TextPaint r6 = r9.mTextPaint
            r6.drawableState = r5
            if (r4 == 0) goto L84
            android.graphics.Rect r4 = r4.getBounds()
            int r5 = r4.left
            int r4 = r4.right
            int r5 = r5 + r4
            goto L88
        L84:
            int r5 = r9.getWidth()
        L88:
            int r5 = r5 / 2
            int r4 = r1.getWidth()
            int r4 = r4 / 2
            int r5 = r5 - r4
            int r2 = r2 + r3
            int r2 = r2 / 2
            int r3 = r1.getHeight()
            int r3 = r3 / 2
            int r2 = r2 - r3
            float r3 = (float) r5
            float r2 = (float) r2
            r10.translate(r3, r2)
            r1.draw(r10)
        La3:
            r10.restoreToCount(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = "android.widget.Switch"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r5) {
            r4 = this;
            super.onInitializeAccessibilityNodeInfo(r5)
            java.lang.String r0 = "android.widget.Switch"
            r5.setClassName(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto L42
            boolean r0 = r4.isChecked()
            if (r0 == 0) goto L17
            java.lang.CharSequence r0 = r4.mTextOn
            goto L19
        L17:
            java.lang.CharSequence r0 = r4.mTextOff
        L19:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L42
            java.lang.CharSequence r1 = r5.getText()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L2d
            r5.setText(r0)
            goto L42
        L2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            r3 = 32
            java.lang.StringBuilder r1 = r1.append(r3)
            r1.append(r0)
            r5.setText(r2)
        L42:
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r1 = r0.mThumbDrawable
            r2 = 0
            if (r1 == 0) goto L2e
            android.graphics.Rect r1 = r0.mTempRect
            android.graphics.drawable.Drawable r3 = r0.mTrackDrawable
            if (r3 == 0) goto L12
            r3.getPadding(r1)
            goto L15
        L12:
            r1.setEmpty()
        L15:
            android.graphics.drawable.Drawable r3 = r0.mThumbDrawable
            android.graphics.Rect r3 = androidx.appcompat.widget.DrawableUtils.getOpticalBounds(r3)
            int r4 = r3.left
            int r5 = r1.left
            int r4 = r4 - r5
            int r4 = java.lang.Math.max(r2, r4)
            int r3 = r3.right
            int r1 = r1.right
            int r3 = r3 - r1
            int r2 = java.lang.Math.max(r2, r3)
            goto L2f
        L2e:
            r4 = r2
        L2f:
            boolean r1 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r0)
            if (r1 == 0) goto L40
            int r1 = r0.getPaddingLeft()
            int r1 = r1 + r4
            int r3 = r0.mSwitchWidth
            int r3 = r3 + r1
            int r3 = r3 - r4
            int r3 = r3 - r2
            goto L51
        L40:
            int r1 = r0.getWidth()
            int r3 = r0.getPaddingRight()
            int r1 = r1 - r3
            int r3 = r1 - r2
            int r1 = r0.mSwitchWidth
            int r1 = r3 - r1
            int r1 = r1 + r4
            int r1 = r1 + r2
        L51:
            int r2 = r0.getGravity()
            r2 = r2 & 112(0x70, float:1.57E-43)
            r4 = 16
            if (r2 == r4) goto L75
            r4 = 80
            if (r2 == r4) goto L66
            int r2 = r0.getPaddingTop()
            int r4 = r0.mSwitchHeight
            goto L8a
        L66:
            int r2 = r0.getHeight()
            int r4 = r0.getPaddingBottom()
            int r4 = r2 - r4
            int r2 = r0.mSwitchHeight
            int r2 = r4 - r2
            goto L8b
        L75:
            int r2 = r0.getPaddingTop()
            int r4 = r0.getHeight()
            int r2 = r2 + r4
            int r4 = r0.getPaddingBottom()
            int r2 = r2 - r4
            int r2 = r2 / 2
            int r4 = r0.mSwitchHeight
            int r5 = r4 / 2
            int r2 = r2 - r5
        L8a:
            int r4 = r4 + r2
        L8b:
            r0.mSwitchLeft = r1
            r0.mSwitchTop = r2
            r0.mSwitchBottom = r4
            r0.mSwitchRight = r3
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r7, int r8) {
            r6 = this;
            boolean r0 = r6.mShowText
            if (r0 == 0) goto L1c
            android.text.Layout r0 = r6.mOnLayout
            if (r0 != 0) goto L10
            java.lang.CharSequence r0 = r6.mTextOn
            android.text.Layout r0 = r6.makeLayout(r0)
            r6.mOnLayout = r0
        L10:
            android.text.Layout r0 = r6.mOffLayout
            if (r0 != 0) goto L1c
            java.lang.CharSequence r0 = r6.mTextOff
            android.text.Layout r0 = r6.makeLayout(r0)
            r6.mOffLayout = r0
        L1c:
            android.graphics.Rect r0 = r6.mTempRect
            android.graphics.drawable.Drawable r1 = r6.mThumbDrawable
            r2 = 0
            if (r1 == 0) goto L39
            r1.getPadding(r0)
            android.graphics.drawable.Drawable r1 = r6.mThumbDrawable
            int r1 = r1.getIntrinsicWidth()
            int r3 = r0.left
            int r1 = r1 - r3
            int r3 = r0.right
            int r1 = r1 - r3
            android.graphics.drawable.Drawable r3 = r6.mThumbDrawable
            int r3 = r3.getIntrinsicHeight()
            goto L3b
        L39:
            r1 = r2
            r3 = r1
        L3b:
            boolean r4 = r6.mShowText
            if (r4 == 0) goto L55
            android.text.Layout r4 = r6.mOnLayout
            int r4 = r4.getWidth()
            android.text.Layout r5 = r6.mOffLayout
            int r5 = r5.getWidth()
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r6.mThumbTextPadding
            int r5 = r5 * 2
            int r4 = r4 + r5
            goto L56
        L55:
            r4 = r2
        L56:
            int r1 = java.lang.Math.max(r4, r1)
            r6.mThumbWidth = r1
            android.graphics.drawable.Drawable r1 = r6.mTrackDrawable
            if (r1 == 0) goto L6a
            r1.getPadding(r0)
            android.graphics.drawable.Drawable r1 = r6.mTrackDrawable
            int r2 = r1.getIntrinsicHeight()
            goto L6d
        L6a:
            r0.setEmpty()
        L6d:
            int r1 = r0.left
            int r0 = r0.right
            android.graphics.drawable.Drawable r4 = r6.mThumbDrawable
            if (r4 == 0) goto L85
            android.graphics.Rect r4 = androidx.appcompat.widget.DrawableUtils.getOpticalBounds(r4)
            int r5 = r4.left
            int r1 = java.lang.Math.max(r1, r5)
            int r4 = r4.right
            int r0 = java.lang.Math.max(r0, r4)
        L85:
            int r4 = r6.mSwitchMinWidth
            int r5 = r6.mThumbWidth
            int r5 = r5 * 2
            int r5 = r5 + r1
            int r5 = r5 + r0
            int r0 = java.lang.Math.max(r4, r5)
            int r1 = java.lang.Math.max(r2, r3)
            r6.mSwitchWidth = r0
            r6.mSwitchHeight = r1
            super.onMeasure(r7, r8)
            int r7 = r6.getMeasuredHeight()
            if (r7 >= r1) goto La9
            int r7 = r6.getMeasuredWidthAndState()
            r6.setMeasuredDimension(r7, r1)
        La9:
            return
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onPopulateAccessibilityEvent(r2)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto Lc
            java.lang.CharSequence r0 = r1.mTextOn
            goto Le
        Lc:
            java.lang.CharSequence r0 = r1.mTextOff
        Le:
            if (r0 == 0) goto L17
            java.util.List r2 = r2.getText()
            r2.add(r0)
        L17:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.mTouchMode
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.mTouchX
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.mThumbPosition
            float r0 = r0 + r2
            float r0 = constrain(r0, r4, r3)
            float r2 = r6.mThumbPosition
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.mTouchX = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.mTouchX
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.mTouchSlop
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.mTouchY
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.mTouchSlop
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.mTouchMode = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.mTouchX = r0
            r6.mTouchY = r3
            return r1
        L89:
            int r0 = r6.mTouchMode
            if (r0 != r2) goto L94
            r6.stopDrag(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.mTouchMode = r0
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.hitThumb(r0, r2)
            if (r3 == 0) goto Lb7
            r6.mTouchMode = r1
            r6.mTouchX = r0
            r6.mTouchY = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            super.setChecked(r2)
            boolean r2 = r1.isChecked()
            if (r2 == 0) goto Ld
            r1.setOnStateDescriptionOnRAndAbove()
            goto L10
        Ld:
            r1.setOffStateDescriptionOnRAndAbove()
        L10:
            android.os.IBinder r0 = r1.getWindowToken()
            if (r0 == 0) goto L20
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r1)
            if (r0 == 0) goto L20
            r1.animateThumbToCheckedState(r2)
            goto L2c
        L20:
            r1.cancelPositionAnimator()
            if (r2 == 0) goto L28
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L29
        L28:
            r2 = 0
        L29:
            r1.setThumbPosition(r2)
        L2c:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = androidx.core.widget.TextViewCompat.wrapCustomSelectionActionModeCallback(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setShowText(boolean r2) {
            r1 = this;
            boolean r0 = r1.mShowText
            if (r0 == r2) goto L9
            r1.mShowText = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setSplitTrack(boolean r1) {
            r0 = this;
            r0.mSplitTrack = r1
            r0.invalidate()
            return
    }

    public void setSwitchMinWidth(int r1) {
            r0 = this;
            r0.mSwitchMinWidth = r1
            r0.requestLayout()
            return
    }

    public void setSwitchPadding(int r1) {
            r0 = this;
            r0.mSwitchPadding = r1
            r0.requestLayout()
            return
    }

    public void setSwitchTextAppearance(android.content.Context r4, int r5) {
            r3 = this;
            int[] r0 = androidx.appcompat.C0015R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r4 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r4, r5, r0)
            int r5 = androidx.appcompat.C0015R.styleable.TextAppearance_android_textColor
            android.content.res.ColorStateList r5 = r4.getColorStateList(r5)
            if (r5 == 0) goto L11
            r3.mTextColors = r5
            goto L17
        L11:
            android.content.res.ColorStateList r5 = r3.getTextColors()
            r3.mTextColors = r5
        L17:
            int r5 = androidx.appcompat.C0015R.styleable.TextAppearance_android_textSize
            r0 = 0
            int r5 = r4.getDimensionPixelSize(r5, r0)
            if (r5 == 0) goto L33
            float r5 = (float) r5
            android.text.TextPaint r1 = r3.mTextPaint
            float r1 = r1.getTextSize()
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L33
            android.text.TextPaint r1 = r3.mTextPaint
            r1.setTextSize(r5)
            r3.requestLayout()
        L33:
            int r5 = androidx.appcompat.C0015R.styleable.TextAppearance_android_typeface
            r1 = -1
            int r5 = r4.getInt(r5, r1)
            int r2 = androidx.appcompat.C0015R.styleable.TextAppearance_android_textStyle
            int r1 = r4.getInt(r2, r1)
            r3.setSwitchTypefaceByIndex(r5, r1)
            int r5 = androidx.appcompat.C0015R.styleable.TextAppearance_textAllCaps
            boolean r5 = r4.getBoolean(r5, r0)
            if (r5 == 0) goto L57
            androidx.appcompat.text.AllCapsTransformationMethod r5 = new androidx.appcompat.text.AllCapsTransformationMethod
            android.content.Context r0 = r3.getContext()
            r5.<init>(r0)
            r3.mSwitchTransformationMethod = r5
            goto L5a
        L57:
            r5 = 0
            r3.mSwitchTransformationMethod = r5
        L5a:
            r4.recycle()
            return
    }

    public void setSwitchTypeface(android.graphics.Typeface r2) {
            r1 = this;
            android.text.TextPaint r0 = r1.mTextPaint
            android.graphics.Typeface r0 = r0.getTypeface()
            if (r0 == 0) goto L14
            android.text.TextPaint r0 = r1.mTextPaint
            android.graphics.Typeface r0 = r0.getTypeface()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
        L14:
            android.text.TextPaint r0 = r1.mTextPaint
            android.graphics.Typeface r0 = r0.getTypeface()
            if (r0 != 0) goto L29
            if (r2 == 0) goto L29
        L1e:
            android.text.TextPaint r0 = r1.mTextPaint
            r0.setTypeface(r2)
            r1.requestLayout()
            r1.invalidate()
        L29:
            return
    }

    public void setSwitchTypeface(android.graphics.Typeface r4, int r5) {
            r3 = this;
            r0 = 0
            r1 = 0
            if (r5 <= 0) goto L32
            if (r4 != 0) goto Lb
            android.graphics.Typeface r4 = android.graphics.Typeface.defaultFromStyle(r5)
            goto Lf
        Lb:
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r5)
        Lf:
            r3.setSwitchTypeface(r4)
            if (r4 == 0) goto L19
            int r4 = r4.getStyle()
            goto L1a
        L19:
            r4 = r1
        L1a:
            int r4 = ~r4
            r4 = r4 & r5
            android.text.TextPaint r5 = r3.mTextPaint
            r2 = r4 & 1
            if (r2 == 0) goto L23
            r1 = 1
        L23:
            r5.setFakeBoldText(r1)
            android.text.TextPaint r5 = r3.mTextPaint
            r4 = r4 & 2
            if (r4 == 0) goto L2e
            r0 = -1098907648(0xffffffffbe800000, float:-0.25)
        L2e:
            r5.setTextSkewX(r0)
            goto L3f
        L32:
            android.text.TextPaint r5 = r3.mTextPaint
            r5.setFakeBoldText(r1)
            android.text.TextPaint r5 = r3.mTextPaint
            r5.setTextSkewX(r0)
            r3.setSwitchTypeface(r4)
        L3f:
            return
    }

    public void setTextOff(java.lang.CharSequence r1) {
            r0 = this;
            r0.mTextOff = r1
            r0.requestLayout()
            boolean r1 = r0.isChecked()
            if (r1 != 0) goto Le
            r0.setOffStateDescriptionOnRAndAbove()
        Le:
            return
    }

    public void setTextOn(java.lang.CharSequence r1) {
            r0 = this;
            r0.mTextOn = r1
            r0.requestLayout()
            boolean r1 = r0.isChecked()
            if (r1 == 0) goto Le
            r0.setOnStateDescriptionOnRAndAbove()
        Le:
            return
    }

    public void setThumbDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mThumbDrawable
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.mThumbDrawable = r3
            if (r3 == 0) goto Lf
            r3.setCallback(r2)
        Lf:
            r2.requestLayout()
            return
    }

    void setThumbPosition(float r1) {
            r0 = this;
            r0.mThumbPosition = r1
            r0.invalidate()
            return
    }

    public void setThumbResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setThumbDrawable(r2)
            return
    }

    public void setThumbTextPadding(int r1) {
            r0 = this;
            r0.mThumbTextPadding = r1
            r0.requestLayout()
            return
    }

    public void setThumbTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.mThumbTintList = r1
            r1 = 1
            r0.mHasThumbTint = r1
            r0.applyThumbTint()
            return
    }

    public void setThumbTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.mThumbTintMode = r1
            r1 = 1
            r0.mHasThumbTintMode = r1
            r0.applyThumbTint()
            return
    }

    public void setTrackDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mTrackDrawable
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.mTrackDrawable = r3
            if (r3 == 0) goto Lf
            r3.setCallback(r2)
        Lf:
            r2.requestLayout()
            return
    }

    public void setTrackResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setTrackDrawable(r2)
            return
    }

    public void setTrackTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.mTrackTintList = r1
            r1 = 1
            r0.mHasTrackTint = r1
            r0.applyTrackTint()
            return
    }

    public void setTrackTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.mTrackTintMode = r1
            r1 = 1
            r0.mHasTrackTintMode = r1
            r0.applyTrackTint()
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
            r1 = this;
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.mThumbDrawable
            if (r2 == r0) goto L11
            android.graphics.drawable.Drawable r0 = r1.mTrackDrawable
            if (r2 != r0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }
}
