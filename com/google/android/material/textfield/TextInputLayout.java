package com.google.android.material.textfield;

/* loaded from: classes.dex */
public class TextInputLayout extends android.widget.LinearLayout {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEF_STYLE_RES = 0;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final java.lang.String LOG_TAG = "TextInputLayout";
    private android.animation.ValueAnimator animator;
    private com.google.android.material.shape.MaterialShapeDrawable boxBackground;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private com.google.android.material.shape.MaterialShapeDrawable boxUnderline;
    final com.google.android.material.internal.CollapsingTextHelper collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private android.content.res.ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private android.content.res.ColorStateList counterTextColor;
    private android.widget.TextView counterView;
    private int defaultFilledBackgroundColor;
    private android.content.res.ColorStateList defaultHintTextColor;
    private int defaultStrokeColor;
    private int disabledColor;
    private int disabledFilledBackgroundColor;
    android.widget.EditText editText;
    private final java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener> editTextAttachedListeners;
    private android.graphics.drawable.Drawable endDummyDrawable;
    private int endDummyDrawableWidth;
    private final java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener> endIconChangedListeners;
    private final android.util.SparseArray<com.google.android.material.textfield.EndIconDelegate> endIconDelegates;
    private final android.widget.FrameLayout endIconFrame;
    private int endIconMode;
    private android.view.View.OnLongClickListener endIconOnLongClickListener;
    private android.content.res.ColorStateList endIconTintList;
    private android.graphics.PorterDuff.Mode endIconTintMode;
    private final com.google.android.material.internal.CheckableImageButton endIconView;
    private final android.widget.LinearLayout endLayout;
    private android.view.View.OnLongClickListener errorIconOnLongClickListener;
    private android.content.res.ColorStateList errorIconTintList;
    private final com.google.android.material.internal.CheckableImageButton errorIconView;
    private boolean expandedHintEnabled;
    private int focusedFilledBackgroundColor;
    private int focusedStrokeColor;
    private android.content.res.ColorStateList focusedTextColor;
    private boolean hasEndIconTintList;
    private boolean hasEndIconTintMode;
    private boolean hasStartIconTintList;
    private boolean hasStartIconTintMode;
    private java.lang.CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private int hoveredFilledBackgroundColor;
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final com.google.android.material.textfield.IndicatorViewController indicatorViewController;
    private final android.widget.FrameLayout inputFrame;
    private boolean isProvidingHint;
    private android.graphics.drawable.Drawable originalEditTextEndDrawable;
    private java.lang.CharSequence originalHint;
    private boolean placeholderEnabled;
    private java.lang.CharSequence placeholderText;
    private int placeholderTextAppearance;
    private android.content.res.ColorStateList placeholderTextColor;
    private android.widget.TextView placeholderTextView;
    private java.lang.CharSequence prefixText;
    private final android.widget.TextView prefixTextView;
    private boolean restoringSavedState;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private android.graphics.drawable.Drawable startDummyDrawable;
    private int startDummyDrawableWidth;
    private android.view.View.OnLongClickListener startIconOnLongClickListener;
    private android.content.res.ColorStateList startIconTintList;
    private android.graphics.PorterDuff.Mode startIconTintMode;
    private final com.google.android.material.internal.CheckableImageButton startIconView;
    private final android.widget.LinearLayout startLayout;
    private android.content.res.ColorStateList strokeErrorColor;
    private java.lang.CharSequence suffixText;
    private final android.widget.TextView suffixTextView;
    private final android.graphics.Rect tmpBoundsRect;
    private final android.graphics.Rect tmpRect;
    private final android.graphics.RectF tmpRectF;
    private android.graphics.Typeface typeface;





    public static class AccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        private final com.google.android.material.textfield.TextInputLayout layout;

        public AccessibilityDelegate(com.google.android.material.textfield.TextInputLayout r1) {
                r0 = this;
                r0.<init>()
                r0.layout = r1
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View r14, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r15) {
                r13 = this;
                super.onInitializeAccessibilityNodeInfo(r14, r15)
                com.google.android.material.textfield.TextInputLayout r14 = r13.layout
                android.widget.EditText r14 = r14.getEditText()
                if (r14 == 0) goto L10
                android.text.Editable r0 = r14.getText()
                goto L11
            L10:
                r0 = 0
            L11:
                com.google.android.material.textfield.TextInputLayout r1 = r13.layout
                java.lang.CharSequence r1 = r1.getHint()
                com.google.android.material.textfield.TextInputLayout r2 = r13.layout
                java.lang.CharSequence r2 = r2.getError()
                com.google.android.material.textfield.TextInputLayout r3 = r13.layout
                java.lang.CharSequence r3 = r3.getPlaceholderText()
                com.google.android.material.textfield.TextInputLayout r4 = r13.layout
                int r4 = r4.getCounterMaxLength()
                com.google.android.material.textfield.TextInputLayout r5 = r13.layout
                java.lang.CharSequence r5 = r5.getCounterOverflowDescription()
                boolean r6 = android.text.TextUtils.isEmpty(r0)
                r7 = 1
                r6 = r6 ^ r7
                boolean r8 = android.text.TextUtils.isEmpty(r1)
                r8 = r8 ^ r7
                com.google.android.material.textfield.TextInputLayout r9 = r13.layout
                boolean r9 = r9.isHintExpanded()
                r9 = r9 ^ r7
                boolean r10 = android.text.TextUtils.isEmpty(r2)
                r10 = r10 ^ r7
                if (r10 != 0) goto L51
                boolean r11 = android.text.TextUtils.isEmpty(r5)
                if (r11 != 0) goto L4f
                goto L51
            L4f:
                r11 = 0
                goto L52
            L51:
                r11 = r7
            L52:
                if (r8 == 0) goto L59
                java.lang.String r1 = r1.toString()
                goto L5b
            L59:
                java.lang.String r1 = ""
            L5b:
                java.lang.String r8 = ", "
                if (r6 == 0) goto L63
                r15.setText(r0)
                goto L8e
            L63:
                boolean r12 = android.text.TextUtils.isEmpty(r1)
                if (r12 != 0) goto L89
                r15.setText(r1)
                if (r9 == 0) goto L8e
                if (r3 == 0) goto L8e
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.StringBuilder r9 = r9.append(r1)
                java.lang.StringBuilder r9 = r9.append(r8)
                java.lang.StringBuilder r3 = r9.append(r3)
                java.lang.String r3 = r3.toString()
                r15.setText(r3)
                goto L8e
            L89:
                if (r3 == 0) goto L8e
                r15.setText(r3)
            L8e:
                boolean r3 = android.text.TextUtils.isEmpty(r1)
                if (r3 != 0) goto Lbd
                int r3 = android.os.Build.VERSION.SDK_INT
                r9 = 26
                if (r3 < r9) goto L9e
                r15.setHintText(r1)
                goto Lb8
            L9e:
                if (r6 == 0) goto Lb5
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.StringBuilder r3 = r3.append(r8)
                java.lang.StringBuilder r1 = r3.append(r1)
                java.lang.String r1 = r1.toString()
            Lb5:
                r15.setText(r1)
            Lb8:
                r1 = r6 ^ 1
                r15.setShowingHintText(r1)
            Lbd:
                if (r0 == 0) goto Lc6
                int r0 = r0.length()
                if (r0 != r4) goto Lc6
                goto Lc7
            Lc6:
                r4 = -1
            Lc7:
                r15.setMaxTextLength(r4)
                if (r11 == 0) goto Ld3
                if (r10 == 0) goto Lcf
                goto Ld0
            Lcf:
                r2 = r5
            Ld0:
                r15.setError(r2)
            Ld3:
                if (r14 == 0) goto Lda
                int r15 = com.google.android.material.C0479R.id.textinput_helper_text
                r14.setLabelFor(r15)
            Lda:
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface EndIconMode {
    }

    public interface OnEditTextAttachedListener {
        void onEditTextAttached(com.google.android.material.textfield.TextInputLayout r1);
    }

    public interface OnEndIconChangedListener {
        void onEndIconChanged(com.google.android.material.textfield.TextInputLayout r1, int r2);
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.textfield.TextInputLayout.SavedState> CREATOR = null;
        java.lang.CharSequence error;
        java.lang.CharSequence helperText;
        java.lang.CharSequence hintText;
        boolean isEndIconChecked;
        java.lang.CharSequence placeholderText;


        static {
                com.google.android.material.textfield.TextInputLayout$SavedState$1 r0 = new com.google.android.material.textfield.TextInputLayout$SavedState$1
                r0.<init>()
                com.google.android.material.textfield.TextInputLayout.SavedState.CREATOR = r0
                return
        }

        SavedState(android.os.Parcel r2, java.lang.ClassLoader r3) {
                r1 = this;
                r1.<init>(r2, r3)
                android.os.Parcelable$Creator r3 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r3 = r3.createFromParcel(r2)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r1.error = r3
                int r3 = r2.readInt()
                r0 = 1
                if (r3 != r0) goto L15
                goto L16
            L15:
                r0 = 0
            L16:
                r1.isEndIconChecked = r0
                android.os.Parcelable$Creator r3 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r3 = r3.createFromParcel(r2)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r1.hintText = r3
                android.os.Parcelable$Creator r3 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r3 = r3.createFromParcel(r2)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r1.helperText = r3
                android.os.Parcelable$Creator r3 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r2 = r3.createFromParcel(r2)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r1.placeholderText = r2
                return
        }

        SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "TextInputLayout.SavedState{"
                r0.<init>(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " error="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.CharSequence r1 = r2.error
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " hint="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.CharSequence r1 = r2.hintText
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " helperText="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.CharSequence r1 = r2.helperText
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " placeholderText="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.CharSequence r1 = r2.placeholderText
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "}"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                java.lang.CharSequence r0 = r1.error
                android.text.TextUtils.writeToParcel(r0, r2, r3)
                boolean r0 = r1.isEndIconChecked
                r2.writeInt(r0)
                java.lang.CharSequence r0 = r1.hintText
                android.text.TextUtils.writeToParcel(r0, r2, r3)
                java.lang.CharSequence r0 = r1.helperText
                android.text.TextUtils.writeToParcel(r0, r2, r3)
                java.lang.CharSequence r0 = r1.placeholderText
                android.text.TextUtils.writeToParcel(r0, r2, r3)
                return
        }
    }

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_Design_TextInputLayout
            com.google.android.material.textfield.TextInputLayout.DEF_STYLE_RES = r0
            return
    }

    public TextInputLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TextInputLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.textInputStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public TextInputLayout(android.content.Context r28, android.util.AttributeSet r29, int r30) {
            r27 = this;
            r0 = r27
            r7 = r29
            r8 = r30
            int r9 = com.google.android.material.textfield.TextInputLayout.DEF_STYLE_RES
            r1 = r28
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            com.google.android.material.textfield.IndicatorViewController r1 = new com.google.android.material.textfield.IndicatorViewController
            r1.<init>(r0)
            r0.indicatorViewController = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.tmpRect = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.tmpBoundsRect = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.tmpRectF = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.editTextAttachedListeners = r1
            r10 = 0
            r0.endIconMode = r10
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            r0.endIconDelegates = r11
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.endIconChangedListeners = r1
            com.google.android.material.internal.CollapsingTextHelper r1 = new com.google.android.material.internal.CollapsingTextHelper
            r1.<init>(r0)
            r0.collapsingTextHelper = r1
            android.content.Context r12 = r27.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r10)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r12)
            r0.inputFrame = r2
            r2.setAddStatesFromChildren(r13)
            r0.addView(r2)
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            r14.<init>(r12)
            r0.startLayout = r14
            r14.setOrientation(r10)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r15 = -2
            r6 = -1
            r3.<init>(r15, r6, r4)
            r14.setLayoutParams(r3)
            r2.addView(r14)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r12)
            r0.endLayout = r5
            r5.setOrientation(r10)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388613(0x800005, float:1.175495E-38)
            r3.<init>(r15, r6, r4)
            r5.setLayoutParams(r3)
            r2.addView(r5)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r12)
            r0.endIconFrame = r4
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r15, r6)
            r4.setLayoutParams(r2)
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            r1.setTextSizeInterpolator(r2)
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            r1.setPositionInterpolator(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.setCollapsedTextGravity(r2)
            int[] r3 = com.google.android.material.C0479R.styleable.TextInputLayout
            r1 = 5
            int[] r2 = new int[r1]
            int r1 = com.google.android.material.C0479R.styleable.TextInputLayout_counterTextAppearance
            r2[r10] = r1
            int r1 = com.google.android.material.C0479R.styleable.TextInputLayout_counterOverflowTextAppearance
            r2[r13] = r1
            int r1 = com.google.android.material.C0479R.styleable.TextInputLayout_errorTextAppearance
            r15 = 2
            r2[r15] = r1
            int r1 = com.google.android.material.C0479R.styleable.TextInputLayout_helperTextTextAppearance
            r15 = 3
            r2[r15] = r1
            r1 = 4
            int r16 = com.google.android.material.C0479R.styleable.TextInputLayout_hintTextAppearance
            r2[r1] = r16
            r1 = r12
            r16 = r2
            r2 = r29
            r15 = r4
            r4 = r30
            r17 = r5
            r5 = r9
            r6 = r16
            androidx.appcompat.widget.TintTypedArray r1 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_hintEnabled
            boolean r2 = r1.getBoolean(r2, r13)
            r0.hintEnabled = r2
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_android_hint
            java.lang.CharSequence r2 = r1.getText(r2)
            r0.setHint(r2)
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_hintAnimationEnabled
            boolean r2 = r1.getBoolean(r2, r13)
            r0.hintAnimationEnabled = r2
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_expandedHintEnabled
            boolean r2 = r1.getBoolean(r2, r13)
            r0.expandedHintEnabled = r2
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = com.google.android.material.shape.ShapeAppearanceModel.builder(r12, r7, r8, r9)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            r0.shapeAppearanceModel = r2
            android.content.res.Resources r2 = r12.getResources()
            int r3 = com.google.android.material.C0479R.dimen.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.boxLabelCutoutPaddingPx = r2
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_boxCollapsedPaddingTop
            int r2 = r1.getDimensionPixelOffset(r2, r10)
            r0.boxCollapsedPaddingTopPx = r2
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r3 = r12.getResources()
            int r4 = com.google.android.material.C0479R.dimen.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.boxStrokeWidthDefaultPx = r2
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r3 = r12.getResources()
            int r4 = com.google.android.material.C0479R.dimen.mtrl_textinput_box_stroke_width_focused
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.boxStrokeWidthFocusedPx = r2
            int r2 = r0.boxStrokeWidthDefaultPx
            r0.boxStrokeWidthPx = r2
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_boxCornerRadiusTopStart
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.getDimension(r2, r3)
            int r4 = com.google.android.material.C0479R.styleable.TextInputLayout_boxCornerRadiusTopEnd
            float r4 = r1.getDimension(r4, r3)
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_boxCornerRadiusBottomEnd
            float r5 = r1.getDimension(r5, r3)
            int r6 = com.google.android.material.C0479R.styleable.TextInputLayout_boxCornerRadiusBottomStart
            float r3 = r1.getDimension(r6, r3)
            com.google.android.material.shape.ShapeAppearanceModel r6 = r0.shapeAppearanceModel
            com.google.android.material.shape.ShapeAppearanceModel$Builder r6 = r6.toBuilder()
            r7 = 0
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 < 0) goto L174
            r6.setTopLeftCornerSize(r2)
        L174:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L17b
            r6.setTopRightCornerSize(r4)
        L17b:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L182
            r6.setBottomRightCornerSize(r5)
        L182:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 < 0) goto L189
            r6.setBottomLeftCornerSize(r3)
        L189:
            com.google.android.material.shape.ShapeAppearanceModel r2 = r6.build()
            r0.shapeAppearanceModel = r2
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList(r12, r1, r2)
            if (r2 == 0) goto L1ee
            int r3 = r2.getDefaultColor()
            r0.defaultFilledBackgroundColor = r3
            r0.boxBackgroundColor = r3
            boolean r3 = r2.isStateful()
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r3 == 0) goto L1cb
            int[] r3 = new int[r13]
            r3[r10] = r4
            r5 = -1
            int r3 = r2.getColorForState(r3, r5)
            r0.disabledFilledBackgroundColor = r3
            r3 = 2
            int[] r4 = new int[r3]
            r4 = {x061a: FILL_ARRAY_DATA , data: [16842908, 16842910} // fill-array
            int r4 = r2.getColorForState(r4, r5)
            r0.focusedFilledBackgroundColor = r4
            int[] r4 = new int[r3]
            r4 = {x0622: FILL_ARRAY_DATA , data: [16843623, 16842910} // fill-array
            int r2 = r2.getColorForState(r4, r5)
            r0.hoveredFilledBackgroundColor = r2
            goto L1f9
        L1cb:
            r5 = -1
            int r2 = r0.defaultFilledBackgroundColor
            r0.focusedFilledBackgroundColor = r2
            int r2 = com.google.android.material.C0479R.color.mtrl_filled_background_color
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r12, r2)
            int[] r3 = new int[r13]
            r3[r10] = r4
            int r3 = r2.getColorForState(r3, r5)
            r0.disabledFilledBackgroundColor = r3
            int[] r3 = new int[r13]
            r4 = 16843623(0x1010367, float:2.3696E-38)
            r3[r10] = r4
            int r2 = r2.getColorForState(r3, r5)
            r0.hoveredFilledBackgroundColor = r2
            goto L1f9
        L1ee:
            r5 = -1
            r0.boxBackgroundColor = r10
            r0.defaultFilledBackgroundColor = r10
            r0.disabledFilledBackgroundColor = r10
            r0.focusedFilledBackgroundColor = r10
            r0.hoveredFilledBackgroundColor = r10
        L1f9:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_android_textColorHint
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L20b
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_android_textColorHint
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.focusedTextColor = r2
            r0.defaultHintTextColor = r2
        L20b:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList(r12, r1, r2)
            int r3 = com.google.android.material.C0479R.styleable.TextInputLayout_boxStrokeColor
            int r3 = r1.getColor(r3, r10)
            r0.focusedStrokeColor = r3
            int r3 = com.google.android.material.C0479R.color.mtrl_textinput_default_box_stroke_color
            int r3 = androidx.core.content.ContextCompat.getColor(r12, r3)
            r0.defaultStrokeColor = r3
            int r3 = com.google.android.material.C0479R.color.mtrl_textinput_disabled_color
            int r3 = androidx.core.content.ContextCompat.getColor(r12, r3)
            r0.disabledColor = r3
            int r3 = com.google.android.material.C0479R.color.mtrl_textinput_hovered_box_stroke_color
            int r3 = androidx.core.content.ContextCompat.getColor(r12, r3)
            r0.hoveredStrokeColor = r3
            if (r2 == 0) goto L236
            r0.setBoxStrokeColorStateList(r2)
        L236:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_boxStrokeErrorColor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L247
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_boxStrokeErrorColor
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList(r12, r1, r2)
            r0.setBoxStrokeErrorColor(r2)
        L247:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_hintTextAppearance
            int r2 = r1.getResourceId(r2, r5)
            if (r2 == r5) goto L258
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_hintTextAppearance
            int r2 = r1.getResourceId(r2, r10)
            r0.setHintTextAppearance(r2)
        L258:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_errorTextAppearance
            int r2 = r1.getResourceId(r2, r10)
            int r3 = com.google.android.material.C0479R.styleable.TextInputLayout_errorContentDescription
            java.lang.CharSequence r3 = r1.getText(r3)
            int r4 = com.google.android.material.C0479R.styleable.TextInputLayout_errorEnabled
            boolean r4 = r1.getBoolean(r4, r10)
            android.content.Context r6 = r27.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r7 = com.google.android.material.C0479R.layout.design_text_input_end_icon
            r8 = r17
            android.view.View r6 = r6.inflate(r7, r8, r10)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.errorIconView = r6
            int r7 = com.google.android.material.C0479R.id.text_input_error_icon
            r6.setId(r7)
            r7 = 8
            r6.setVisibility(r7)
            boolean r9 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(r12)
            if (r9 == 0) goto L297
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart(r9, r10)
        L297:
            int r9 = com.google.android.material.C0479R.styleable.TextInputLayout_errorIconDrawable
            boolean r9 = r1.hasValue(r9)
            if (r9 == 0) goto L2a8
            int r9 = com.google.android.material.C0479R.styleable.TextInputLayout_errorIconDrawable
            android.graphics.drawable.Drawable r9 = r1.getDrawable(r9)
            r0.setErrorIconDrawable(r9)
        L2a8:
            int r9 = com.google.android.material.C0479R.styleable.TextInputLayout_errorIconTint
            boolean r9 = r1.hasValue(r9)
            if (r9 == 0) goto L2b9
            int r9 = com.google.android.material.C0479R.styleable.TextInputLayout_errorIconTint
            android.content.res.ColorStateList r9 = com.google.android.material.resources.MaterialResources.getColorStateList(r12, r1, r9)
            r0.setErrorIconTintList(r9)
        L2b9:
            int r9 = com.google.android.material.C0479R.styleable.TextInputLayout_errorIconTintMode
            boolean r9 = r1.hasValue(r9)
            r13 = 0
            if (r9 == 0) goto L2cf
            int r9 = com.google.android.material.C0479R.styleable.TextInputLayout_errorIconTintMode
            int r9 = r1.getInt(r9, r5)
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.ViewUtils.parseTintMode(r9, r13)
            r0.setErrorIconTintMode(r9)
        L2cf:
            android.content.res.Resources r9 = r27.getResources()
            int r13 = com.google.android.material.C0479R.string.error_icon_content_description
            java.lang.CharSequence r9 = r9.getText(r13)
            r6.setContentDescription(r9)
            r9 = 2
            androidx.core.view.ViewCompat.setImportantForAccessibility(r6, r9)
            r6.setClickable(r10)
            r6.setPressable(r10)
            r6.setFocusable(r10)
            int r9 = com.google.android.material.C0479R.styleable.TextInputLayout_helperTextTextAppearance
            int r9 = r1.getResourceId(r9, r10)
            int r13 = com.google.android.material.C0479R.styleable.TextInputLayout_helperTextEnabled
            boolean r13 = r1.getBoolean(r13, r10)
            int r7 = com.google.android.material.C0479R.styleable.TextInputLayout_helperText
            java.lang.CharSequence r7 = r1.getText(r7)
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_placeholderTextAppearance
            int r5 = r1.getResourceId(r5, r10)
            int r10 = com.google.android.material.C0479R.styleable.TextInputLayout_placeholderText
            java.lang.CharSequence r10 = r1.getText(r10)
            r18 = r5
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_prefixTextAppearance
            r19 = r10
            r10 = 0
            int r5 = r1.getResourceId(r5, r10)
            int r10 = com.google.android.material.C0479R.styleable.TextInputLayout_prefixText
            java.lang.CharSequence r10 = r1.getText(r10)
            r20 = r5
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_suffixTextAppearance
            r21 = r10
            r10 = 0
            int r5 = r1.getResourceId(r5, r10)
            int r10 = com.google.android.material.C0479R.styleable.TextInputLayout_suffixText
            java.lang.CharSequence r10 = r1.getText(r10)
            r22 = r5
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_counterEnabled
            r23 = r10
            r10 = 0
            boolean r5 = r1.getBoolean(r5, r10)
            int r10 = com.google.android.material.C0479R.styleable.TextInputLayout_counterMaxLength
            r24 = r5
            r5 = -1
            int r10 = r1.getInt(r10, r5)
            r0.setCounterMaxLength(r10)
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_counterTextAppearance
            r10 = 0
            int r5 = r1.getResourceId(r5, r10)
            r0.counterTextAppearance = r5
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_counterOverflowTextAppearance
            int r5 = r1.getResourceId(r5, r10)
            r0.counterOverflowTextAppearance = r5
            android.content.Context r5 = r27.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r25 = r3
            int r3 = com.google.android.material.C0479R.layout.design_text_input_start_icon
            android.view.View r3 = r5.inflate(r3, r14, r10)
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            r0.startIconView = r3
            r5 = 8
            r3.setVisibility(r5)
            boolean r5 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(r12)
            if (r5 == 0) goto L379
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(r5, r10)
        L379:
            r5 = 0
            r0.setStartIconOnClickListener(r5)
            r0.setStartIconOnLongClickListener(r5)
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_startIconDrawable
            boolean r5 = r1.hasValue(r5)
            if (r5 == 0) goto L3ac
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_startIconDrawable
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r5)
            r0.setStartIconDrawable(r5)
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_startIconContentDescription
            boolean r5 = r1.hasValue(r5)
            if (r5 == 0) goto L3a2
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_startIconContentDescription
            java.lang.CharSequence r5 = r1.getText(r5)
            r0.setStartIconContentDescription(r5)
        L3a2:
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_startIconCheckable
            r10 = 1
            boolean r5 = r1.getBoolean(r5, r10)
            r0.setStartIconCheckable(r5)
        L3ac:
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_startIconTint
            boolean r5 = r1.hasValue(r5)
            if (r5 == 0) goto L3bd
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_startIconTint
            android.content.res.ColorStateList r5 = com.google.android.material.resources.MaterialResources.getColorStateList(r12, r1, r5)
            r0.setStartIconTintList(r5)
        L3bd:
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_startIconTintMode
            boolean r5 = r1.hasValue(r5)
            if (r5 == 0) goto L3d4
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_startIconTintMode
            r10 = -1
            int r5 = r1.getInt(r5, r10)
            r10 = 0
            android.graphics.PorterDuff$Mode r5 = com.google.android.material.internal.ViewUtils.parseTintMode(r5, r10)
            r0.setStartIconTintMode(r5)
        L3d4:
            int r5 = com.google.android.material.C0479R.styleable.TextInputLayout_boxBackgroundMode
            r10 = 0
            int r5 = r1.getInt(r5, r10)
            r0.setBoxBackgroundMode(r5)
            android.content.Context r5 = r27.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r26 = r2
            int r2 = com.google.android.material.C0479R.layout.design_text_input_end_icon
            android.view.View r2 = r5.inflate(r2, r15, r10)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.endIconView = r2
            r15.addView(r2)
            r5 = 8
            r2.setVisibility(r5)
            boolean r5 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(r12)
            if (r5 == 0) goto L409
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart(r2, r10)
        L409:
            com.google.android.material.textfield.CustomEndIconDelegate r2 = new com.google.android.material.textfield.CustomEndIconDelegate
            r2.<init>(r0)
            r5 = -1
            r11.append(r5, r2)
            com.google.android.material.textfield.NoEndIconDelegate r2 = new com.google.android.material.textfield.NoEndIconDelegate
            r2.<init>(r0)
            r11.append(r10, r2)
            com.google.android.material.textfield.PasswordToggleEndIconDelegate r2 = new com.google.android.material.textfield.PasswordToggleEndIconDelegate
            r2.<init>(r0)
            r5 = 1
            r11.append(r5, r2)
            com.google.android.material.textfield.ClearTextEndIconDelegate r2 = new com.google.android.material.textfield.ClearTextEndIconDelegate
            r2.<init>(r0)
            r5 = 2
            r11.append(r5, r2)
            com.google.android.material.textfield.DropdownMenuEndIconDelegate r2 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate
            r2.<init>(r0)
            r5 = 3
            r11.append(r5, r2)
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_endIconMode
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L474
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_endIconMode
            r5 = 0
            int r2 = r1.getInt(r2, r5)
            r0.setEndIconMode(r2)
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_endIconDrawable
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L458
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_endIconDrawable
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r2)
            r0.setEndIconDrawable(r2)
        L458:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_endIconContentDescription
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L469
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_endIconContentDescription
            java.lang.CharSequence r2 = r1.getText(r2)
            r0.setEndIconContentDescription(r2)
        L469:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_endIconCheckable
            r5 = 1
            boolean r2 = r1.getBoolean(r2, r5)
            r0.setEndIconCheckable(r2)
            goto L4c0
        L474:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_passwordToggleEnabled
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L4c0
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_passwordToggleEnabled
            r5 = 0
            boolean r2 = r1.getBoolean(r2, r5)
            r0.setEndIconMode(r2)
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_passwordToggleDrawable
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r2)
            r0.setEndIconDrawable(r2)
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r2 = r1.getText(r2)
            r0.setEndIconContentDescription(r2)
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_passwordToggleTint
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L4a9
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_passwordToggleTint
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList(r12, r1, r2)
            r0.setEndIconTintList(r2)
        L4a9:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_passwordToggleTintMode
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L4c0
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_passwordToggleTintMode
            r5 = -1
            int r2 = r1.getInt(r2, r5)
            r5 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.ViewUtils.parseTintMode(r2, r5)
            r0.setEndIconTintMode(r2)
        L4c0:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_passwordToggleEnabled
            boolean r2 = r1.hasValue(r2)
            if (r2 != 0) goto L4f0
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_endIconTint
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L4d9
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_endIconTint
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList(r12, r1, r2)
            r0.setEndIconTintList(r2)
        L4d9:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_endIconTintMode
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L4f0
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_endIconTintMode
            r5 = -1
            int r2 = r1.getInt(r2, r5)
            r5 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.ViewUtils.parseTintMode(r2, r5)
            r0.setEndIconTintMode(r2)
        L4f0:
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r12)
            r0.prefixTextView = r2
            int r5 = com.google.android.material.C0479R.id.textinput_prefix_text
            r2.setId(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r10 = -2
            r5.<init>(r10, r10)
            r2.setLayoutParams(r5)
            r5 = 1
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r2, r5)
            r14.addView(r3)
            r14.addView(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r12)
            r0.suffixTextView = r2
            int r3 = com.google.android.material.C0479R.id.textinput_suffix_text
            r2.setId(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r5 = 80
            r10 = -2
            r3.<init>(r10, r10, r5)
            r2.setLayoutParams(r3)
            r3 = 1
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r2, r3)
            r8.addView(r2)
            r8.addView(r6)
            r8.addView(r15)
            r0.setHelperTextEnabled(r13)
            r0.setHelperText(r7)
            r0.setHelperTextTextAppearance(r9)
            r0.setErrorEnabled(r4)
            r2 = r26
            r0.setErrorTextAppearance(r2)
            r2 = r25
            r0.setErrorContentDescription(r2)
            int r2 = r0.counterTextAppearance
            r0.setCounterTextAppearance(r2)
            int r2 = r0.counterOverflowTextAppearance
            r0.setCounterOverflowTextAppearance(r2)
            r2 = r19
            r0.setPlaceholderText(r2)
            r2 = r18
            r0.setPlaceholderTextAppearance(r2)
            r2 = r21
            r0.setPrefixText(r2)
            r2 = r20
            r0.setPrefixTextAppearance(r2)
            r2 = r23
            r0.setSuffixText(r2)
            r2 = r22
            r0.setSuffixTextAppearance(r2)
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_errorTextColor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L582
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_errorTextColor
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.setErrorTextColor(r2)
        L582:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_helperTextTextColor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L593
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_helperTextTextColor
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.setHelperTextColor(r2)
        L593:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_hintTextColor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L5a4
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_hintTextColor
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.setHintTextColor(r2)
        L5a4:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_counterTextColor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L5b5
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_counterTextColor
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.setCounterTextColor(r2)
        L5b5:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_counterOverflowTextColor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L5c6
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_counterOverflowTextColor
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.setCounterOverflowTextColor(r2)
        L5c6:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_placeholderTextColor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L5d7
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_placeholderTextColor
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.setPlaceholderTextColor(r2)
        L5d7:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_prefixTextColor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L5e8
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_prefixTextColor
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.setPrefixTextColor(r2)
        L5e8:
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_suffixTextColor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L5f9
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_suffixTextColor
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.setSuffixTextColor(r2)
        L5f9:
            r2 = r24
            r0.setCounterEnabled(r2)
            int r2 = com.google.android.material.C0479R.styleable.TextInputLayout_android_enabled
            r3 = 1
            boolean r2 = r1.getBoolean(r2, r3)
            r0.setEnabled(r2)
            r1.recycle()
            r1 = 2
            androidx.core.view.ViewCompat.setImportantForAccessibility(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L618
            androidx.core.view.ViewCompat.setImportantForAutofill(r0, r3)
        L618:
            return
    }

    static /* synthetic */ boolean access$000(com.google.android.material.textfield.TextInputLayout r0) {
            boolean r0 = r0.restoringSavedState
            return r0
    }

    static /* synthetic */ boolean access$100(com.google.android.material.textfield.TextInputLayout r0) {
            boolean r0 = r0.placeholderEnabled
            return r0
    }

    static /* synthetic */ void access$200(com.google.android.material.textfield.TextInputLayout r0, int r1) {
            r0.updatePlaceholderText(r1)
            return
    }

    static /* synthetic */ com.google.android.material.internal.CheckableImageButton access$300(com.google.android.material.textfield.TextInputLayout r0) {
            com.google.android.material.internal.CheckableImageButton r0 = r0.endIconView
            return r0
    }

    private void addPlaceholderTextView() {
            r2 = this;
            android.widget.TextView r0 = r2.placeholderTextView
            if (r0 == 0) goto Lf
            android.widget.FrameLayout r1 = r2.inputFrame
            r1.addView(r0)
            android.widget.TextView r0 = r2.placeholderTextView
            r1 = 0
            r0.setVisibility(r1)
        Lf:
            return
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
            r6 = this;
            android.widget.EditText r0 = r6.editText
            if (r0 == 0) goto L65
            int r0 = r6.boxBackgroundMode
            r1 = 1
            if (r0 == r1) goto La
            goto L65
        La:
            android.content.Context r0 = r6.getContext()
            boolean r0 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast2_0(r0)
            if (r0 == 0) goto L38
            android.widget.EditText r0 = r6.editText
            int r1 = androidx.core.view.ViewCompat.getPaddingStart(r0)
            android.content.res.Resources r2 = r6.getResources()
            int r3 = com.google.android.material.C0479R.dimen.material_filled_edittext_font_2_0_padding_top
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r6.editText
            int r3 = androidx.core.view.ViewCompat.getPaddingEnd(r3)
            android.content.res.Resources r4 = r6.getResources()
            int r5 = com.google.android.material.C0479R.dimen.material_filled_edittext_font_2_0_padding_bottom
            int r4 = r4.getDimensionPixelSize(r5)
            androidx.core.view.ViewCompat.setPaddingRelative(r0, r1, r2, r3, r4)
            goto L65
        L38:
            android.content.Context r0 = r6.getContext()
            boolean r0 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(r0)
            if (r0 == 0) goto L65
            android.widget.EditText r0 = r6.editText
            int r1 = androidx.core.view.ViewCompat.getPaddingStart(r0)
            android.content.res.Resources r2 = r6.getResources()
            int r3 = com.google.android.material.C0479R.dimen.material_filled_edittext_font_1_3_padding_top
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r6.editText
            int r3 = androidx.core.view.ViewCompat.getPaddingEnd(r3)
            android.content.res.Resources r4 = r6.getResources()
            int r5 = com.google.android.material.C0479R.dimen.material_filled_edittext_font_1_3_padding_bottom
            int r4 = r4.getDimensionPixelSize(r5)
            androidx.core.view.ViewCompat.setPaddingRelative(r0, r1, r2, r3, r4)
        L65:
            return
    }

    private void applyBoxAttributes() {
            r3 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.boxBackground
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.material.shape.ShapeAppearanceModel r1 = r3.shapeAppearanceModel
            r0.setShapeAppearanceModel(r1)
            boolean r0 = r3.canDrawOutlineStroke()
            if (r0 == 0) goto L1a
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.boxBackground
            int r1 = r3.boxStrokeWidthPx
            float r1 = (float) r1
            int r2 = r3.boxStrokeColor
            r0.setStroke(r1, r2)
        L1a:
            int r0 = r3.calculateBoxBackgroundColor()
            r3.boxBackgroundColor = r0
            com.google.android.material.shape.MaterialShapeDrawable r1 = r3.boxBackground
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setFillColor(r0)
            int r0 = r3.endIconMode
            r1 = 3
            if (r0 != r1) goto L37
            android.widget.EditText r0 = r3.editText
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L37:
            r3.applyBoxUnderlineAttributes()
            r3.invalidate()
            return
    }

    private void applyBoxUnderlineAttributes() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.boxUnderline
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r2.canDrawStroke()
            if (r0 == 0) goto L16
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.boxUnderline
            int r1 = r2.boxStrokeColor
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setFillColor(r1)
        L16:
            r2.invalidate()
            return
    }

    private void applyCutoutPadding(android.graphics.RectF r3) {
            r2 = this;
            float r0 = r3.left
            int r1 = r2.boxLabelCutoutPaddingPx
            float r1 = (float) r1
            float r0 = r0 - r1
            r3.left = r0
            float r0 = r3.top
            int r1 = r2.boxLabelCutoutPaddingPx
            float r1 = (float) r1
            float r0 = r0 - r1
            r3.top = r0
            float r0 = r3.right
            int r1 = r2.boxLabelCutoutPaddingPx
            float r1 = (float) r1
            float r0 = r0 + r1
            r3.right = r0
            float r0 = r3.bottom
            int r1 = r2.boxLabelCutoutPaddingPx
            float r1 = (float) r1
            float r0 = r0 + r1
            r3.bottom = r0
            return
    }

    private void applyEndIconTint() {
            r6 = this;
            com.google.android.material.internal.CheckableImageButton r1 = r6.endIconView
            boolean r2 = r6.hasEndIconTintList
            android.content.res.ColorStateList r3 = r6.endIconTintList
            boolean r4 = r6.hasEndIconTintMode
            android.graphics.PorterDuff$Mode r5 = r6.endIconTintMode
            r0 = r6
            r0.applyIconTint(r1, r2, r3, r4, r5)
            return
    }

    private void applyIconTint(com.google.android.material.internal.CheckableImageButton r2, boolean r3, android.content.res.ColorStateList r4, boolean r5, android.graphics.PorterDuff.Mode r6) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            if (r0 == 0) goto L1c
            if (r3 != 0) goto La
            if (r5 == 0) goto L1c
        La:
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r3 == 0) goto L17
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r4)
        L17:
            if (r5 == 0) goto L1c
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r6)
        L1c:
            android.graphics.drawable.Drawable r3 = r2.getDrawable()
            if (r3 == r0) goto L25
            r2.setImageDrawable(r0)
        L25:
            return
    }

    private void applyStartIconTint() {
            r6 = this;
            com.google.android.material.internal.CheckableImageButton r1 = r6.startIconView
            boolean r2 = r6.hasStartIconTintList
            android.content.res.ColorStateList r3 = r6.startIconTintList
            boolean r4 = r6.hasStartIconTintMode
            android.graphics.PorterDuff$Mode r5 = r6.startIconTintMode
            r0 = r6
            r0.applyIconTint(r1, r2, r3, r4, r5)
            return
    }

    private void assignBoxBackgroundByMode() {
            r3 = this;
            int r0 = r3.boxBackgroundMode
            r1 = 0
            if (r0 == 0) goto L57
            r2 = 1
            if (r0 == r2) goto L46
            r2 = 2
            if (r0 != r2) goto L2b
            boolean r0 = r3.hintEnabled
            if (r0 == 0) goto L1f
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.boxBackground
            boolean r0 = r0 instanceof com.google.android.material.textfield.CutoutDrawable
            if (r0 != 0) goto L1f
            com.google.android.material.textfield.CutoutDrawable r0 = new com.google.android.material.textfield.CutoutDrawable
            com.google.android.material.shape.ShapeAppearanceModel r2 = r3.shapeAppearanceModel
            r0.<init>(r2)
            r3.boxBackground = r0
            goto L28
        L1f:
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r2 = r3.shapeAppearanceModel
            r0.<init>(r2)
            r3.boxBackground = r0
        L28:
            r3.boxUnderline = r1
            goto L5b
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r3.boxBackgroundMode
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is illegal; only @BoxBackgroundMode constants are supported."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L46:
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r1 = r3.shapeAppearanceModel
            r0.<init>(r1)
            r3.boxBackground = r0
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            r3.boxUnderline = r0
            goto L5b
        L57:
            r3.boxBackground = r1
            r3.boxUnderline = r1
        L5b:
            return
    }

    private int calculateBoxBackgroundColor() {
            r3 = this;
            int r0 = r3.boxBackgroundColor
            int r1 = r3.boxBackgroundMode
            r2 = 1
            if (r1 != r2) goto L14
            int r0 = com.google.android.material.C0479R.attr.colorSurface
            r1 = 0
            int r0 = com.google.android.material.color.MaterialColors.getColor(r3, r0, r1)
            int r1 = r3.boxBackgroundColor
            int r0 = com.google.android.material.color.MaterialColors.layer(r0, r1)
        L14:
            return r0
    }

    private android.graphics.Rect calculateCollapsedTextBounds(android.graphics.Rect r5) {
            r4 = this;
            android.widget.EditText r0 = r4.editText
            if (r0 == 0) goto L6a
            android.graphics.Rect r0 = r4.tmpBoundsRect
            int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r4)
            r2 = 1
            if (r1 != r2) goto Lf
            r1 = r2
            goto L10
        Lf:
            r1 = 0
        L10:
            int r3 = r5.bottom
            r0.bottom = r3
            int r3 = r4.boxBackgroundMode
            if (r3 == r2) goto L52
            r2 = 2
            if (r3 == r2) goto L32
            int r2 = r5.left
            int r2 = r4.getLabelLeftBoundAlightWithPrefix(r2, r1)
            r0.left = r2
            int r2 = r4.getPaddingTop()
            r0.top = r2
            int r5 = r5.right
            int r5 = r4.getLabelRightBoundAlignedWithSuffix(r5, r1)
            r0.right = r5
            return r0
        L32:
            int r1 = r5.left
            android.widget.EditText r2 = r4.editText
            int r2 = r2.getPaddingLeft()
            int r1 = r1 + r2
            r0.left = r1
            int r1 = r5.top
            int r2 = r4.calculateLabelMarginTop()
            int r1 = r1 - r2
            r0.top = r1
            int r5 = r5.right
            android.widget.EditText r1 = r4.editText
            int r1 = r1.getPaddingRight()
            int r5 = r5 - r1
            r0.right = r5
            return r0
        L52:
            int r2 = r5.left
            int r2 = r4.getLabelLeftBoundAlightWithPrefix(r2, r1)
            r0.left = r2
            int r2 = r5.top
            int r3 = r4.boxCollapsedPaddingTopPx
            int r2 = r2 + r3
            r0.top = r2
            int r5 = r5.right
            int r5 = r4.getLabelRightBoundAlignedWithSuffix(r5, r1)
            r0.right = r5
            return r0
        L6a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
    }

    private int calculateExpandedLabelBottom(android.graphics.Rect r2, android.graphics.Rect r3, float r4) {
            r1 = this;
            boolean r0 = r1.isSingleLineFilledTextField()
            if (r0 == 0) goto Lc
            int r2 = r3.top
            float r2 = (float) r2
            float r2 = r2 + r4
            int r2 = (int) r2
            return r2
        Lc:
            int r2 = r2.bottom
            android.widget.EditText r3 = r1.editText
            int r3 = r3.getCompoundPaddingBottom()
            int r2 = r2 - r3
            return r2
    }

    private int calculateExpandedLabelTop(android.graphics.Rect r2, float r3) {
            r1 = this;
            boolean r0 = r1.isSingleLineFilledTextField()
            if (r0 == 0) goto L11
            int r2 = r2.centerY()
            float r2 = (float) r2
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r0
            float r2 = r2 - r3
            int r2 = (int) r2
            return r2
        L11:
            int r2 = r2.top
            android.widget.EditText r3 = r1.editText
            int r3 = r3.getCompoundPaddingTop()
            int r2 = r2 + r3
            return r2
    }

    private android.graphics.Rect calculateExpandedTextBounds(android.graphics.Rect r5) {
            r4 = this;
            android.widget.EditText r0 = r4.editText
            if (r0 == 0) goto L2f
            android.graphics.Rect r0 = r4.tmpBoundsRect
            com.google.android.material.internal.CollapsingTextHelper r1 = r4.collapsingTextHelper
            float r1 = r1.getExpandedTextHeight()
            int r2 = r5.left
            android.widget.EditText r3 = r4.editText
            int r3 = r3.getCompoundPaddingLeft()
            int r2 = r2 + r3
            r0.left = r2
            int r2 = r4.calculateExpandedLabelTop(r5, r1)
            r0.top = r2
            int r2 = r5.right
            android.widget.EditText r3 = r4.editText
            int r3 = r3.getCompoundPaddingRight()
            int r2 = r2 - r3
            r0.right = r2
            int r5 = r4.calculateExpandedLabelBottom(r5, r0, r1)
            r0.bottom = r5
            return r0
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
    }

    private int calculateLabelMarginTop() {
            r3 = this;
            boolean r0 = r3.hintEnabled
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r3.boxBackgroundMode
            if (r0 == 0) goto L1c
            r2 = 1
            if (r0 == r2) goto L1c
            r2 = 2
            if (r0 == r2) goto L11
            return r1
        L11:
            com.google.android.material.internal.CollapsingTextHelper r0 = r3.collapsingTextHelper
            float r0 = r0.getCollapsedTextHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
        L1a:
            int r0 = (int) r0
            return r0
        L1c:
            com.google.android.material.internal.CollapsingTextHelper r0 = r3.collapsingTextHelper
            float r0 = r0.getCollapsedTextHeight()
            goto L1a
    }

    private boolean canDrawOutlineStroke() {
            r2 = this;
            int r0 = r2.boxBackgroundMode
            r1 = 2
            if (r0 != r1) goto Ld
            boolean r0 = r2.canDrawStroke()
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    private boolean canDrawStroke() {
            r2 = this;
            int r0 = r2.boxStrokeWidthPx
            r1 = -1
            if (r0 <= r1) goto Lb
            int r0 = r2.boxStrokeColor
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    private void closeCutout() {
            r1 = this;
            boolean r0 = r1.cutoutEnabled()
            if (r0 == 0) goto Ld
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.boxBackground
            com.google.android.material.textfield.CutoutDrawable r0 = (com.google.android.material.textfield.CutoutDrawable) r0
            r0.removeCutout()
        Ld:
            return
    }

    private void collapseHint(boolean r2) {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.animator
            if (r0 == 0) goto Lf
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Lf
            android.animation.ValueAnimator r0 = r1.animator
            r0.cancel()
        Lf:
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L1b
            boolean r2 = r1.hintAnimationEnabled
            if (r2 == 0) goto L1b
            r1.animateToExpansionFraction(r0)
            goto L20
        L1b:
            com.google.android.material.internal.CollapsingTextHelper r2 = r1.collapsingTextHelper
            r2.setExpansionFraction(r0)
        L20:
            r2 = 0
            r1.hintExpanded = r2
            boolean r2 = r1.cutoutEnabled()
            if (r2 == 0) goto L2c
            r1.openCutout()
        L2c:
            r1.updatePlaceholderText()
            r1.updatePrefixTextVisibility()
            r1.updateSuffixTextVisibility()
            return
    }

    private boolean cutoutEnabled() {
            r1 = this;
            boolean r0 = r1.hintEnabled
            if (r0 == 0) goto L14
            java.lang.CharSequence r0 = r1.hint
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L14
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.boxBackground
            boolean r0 = r0 instanceof com.google.android.material.textfield.CutoutDrawable
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    private void dispatchOnEditTextAttached() {
            r2 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener> r0 = r2.editTextAttachedListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener r1 = (com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener) r1
            r1.onEditTextAttached(r2)
            goto L6
        L16:
            return
    }

    private void dispatchOnEndIconChanged(int r3) {
            r2 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener> r0 = r2.endIconChangedListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener r1 = (com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener) r1
            r1.onEndIconChanged(r2, r3)
            goto L6
        L16:
            return
    }

    private void drawBoxUnderline(android.graphics.Canvas r4) {
            r3 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.boxUnderline
            if (r0 == 0) goto L14
            android.graphics.Rect r0 = r0.getBounds()
            int r1 = r0.bottom
            int r2 = r3.boxStrokeWidthPx
            int r1 = r1 - r2
            r0.top = r1
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.boxUnderline
            r0.draw(r4)
        L14:
            return
    }

    private void drawHint(android.graphics.Canvas r2) {
            r1 = this;
            boolean r0 = r1.hintEnabled
            if (r0 == 0) goto L9
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.draw(r2)
        L9:
            return
    }

    private void expandHint(boolean r2) {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.animator
            if (r0 == 0) goto Lf
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Lf
            android.animation.ValueAnimator r0 = r1.animator
            r0.cancel()
        Lf:
            r0 = 0
            if (r2 == 0) goto L1a
            boolean r2 = r1.hintAnimationEnabled
            if (r2 == 0) goto L1a
            r1.animateToExpansionFraction(r0)
            goto L1f
        L1a:
            com.google.android.material.internal.CollapsingTextHelper r2 = r1.collapsingTextHelper
            r2.setExpansionFraction(r0)
        L1f:
            boolean r2 = r1.cutoutEnabled()
            if (r2 == 0) goto L32
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.boxBackground
            com.google.android.material.textfield.CutoutDrawable r2 = (com.google.android.material.textfield.CutoutDrawable) r2
            boolean r2 = r2.hasCutout()
            if (r2 == 0) goto L32
            r1.closeCutout()
        L32:
            r2 = 1
            r1.hintExpanded = r2
            r1.hidePlaceholderText()
            r1.updatePrefixTextVisibility()
            r1.updateSuffixTextVisibility()
            return
    }

    private com.google.android.material.textfield.EndIconDelegate getEndIconDelegate() {
            r2 = this;
            android.util.SparseArray<com.google.android.material.textfield.EndIconDelegate> r0 = r2.endIconDelegates
            int r1 = r2.endIconMode
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.textfield.EndIconDelegate r0 = (com.google.android.material.textfield.EndIconDelegate) r0
            if (r0 == 0) goto Ld
            goto L16
        Ld:
            android.util.SparseArray<com.google.android.material.textfield.EndIconDelegate> r0 = r2.endIconDelegates
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.textfield.EndIconDelegate r0 = (com.google.android.material.textfield.EndIconDelegate) r0
        L16:
            return r0
    }

    private com.google.android.material.internal.CheckableImageButton getEndIconToUpdateDummyDrawable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lb
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            return r0
        Lb:
            boolean r0 = r1.hasEndIcon()
            if (r0 == 0) goto L1a
            boolean r0 = r1.isEndIconVisible()
            if (r0 == 0) goto L1a
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            return r0
        L1a:
            r0 = 0
            return r0
    }

    private int getLabelLeftBoundAlightWithPrefix(int r2, boolean r3) {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            int r0 = r0.getCompoundPaddingLeft()
            int r2 = r2 + r0
            java.lang.CharSequence r0 = r1.prefixText
            if (r0 == 0) goto L1b
            if (r3 != 0) goto L1b
            android.widget.TextView r3 = r1.prefixTextView
            int r3 = r3.getMeasuredWidth()
            int r2 = r2 - r3
            android.widget.TextView r3 = r1.prefixTextView
            int r3 = r3.getPaddingLeft()
            int r2 = r2 + r3
        L1b:
            return r2
    }

    private int getLabelRightBoundAlignedWithSuffix(int r2, boolean r3) {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            int r0 = r0.getCompoundPaddingRight()
            int r2 = r2 - r0
            java.lang.CharSequence r0 = r1.prefixText
            if (r0 == 0) goto L1b
            if (r3 == 0) goto L1b
            android.widget.TextView r3 = r1.prefixTextView
            int r3 = r3.getMeasuredWidth()
            android.widget.TextView r0 = r1.prefixTextView
            int r0 = r0.getPaddingRight()
            int r3 = r3 - r0
            int r2 = r2 + r3
        L1b:
            return r2
    }

    private boolean hasEndIcon() {
            r1 = this;
            int r0 = r1.endIconMode
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private void hidePlaceholderText() {
            r2 = this;
            android.widget.TextView r0 = r2.placeholderTextView
            if (r0 == 0) goto L12
            boolean r1 = r2.placeholderEnabled
            if (r1 == 0) goto L12
            r1 = 0
            r0.setText(r1)
            android.widget.TextView r0 = r2.placeholderTextView
            r1 = 4
            r0.setVisibility(r1)
        L12:
            return
    }

    private boolean isErrorIconVisible() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private boolean isSingleLineFilledTextField() {
            r2 = this;
            int r0 = r2.boxBackgroundMode
            r1 = 1
            if (r0 != r1) goto Le
            android.widget.EditText r0 = r2.editText
            int r0 = r0.getMinLines()
            if (r0 > r1) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private int[] mergeIconState(com.google.android.material.internal.CheckableImageButton r5) {
            r4 = this;
            int[] r0 = r4.getDrawableState()
            int[] r5 = r5.getDrawableState()
            int r1 = r0.length
            int r2 = r0.length
            int r3 = r5.length
            int r2 = r2 + r3
            int[] r0 = java.util.Arrays.copyOf(r0, r2)
            r2 = 0
            int r3 = r5.length
            java.lang.System.arraycopy(r5, r2, r0, r1, r3)
            return r0
    }

    private void onApplyBoxBackgroundMode() {
            r1 = this;
            r1.assignBoxBackgroundByMode()
            r1.setEditTextBoxBackground()
            r1.updateTextInputBoxState()
            r1.updateBoxCollapsedPaddingTop()
            r1.adjustFilledEditTextPaddingForLargeFont()
            int r0 = r1.boxBackgroundMode
            if (r0 == 0) goto L16
            r1.updateInputLayoutMargins()
        L16:
            return
    }

    private void openCutout() {
            r4 = this;
            boolean r0 = r4.cutoutEnabled()
            if (r0 != 0) goto L7
            return
        L7:
            android.graphics.RectF r0 = r4.tmpRectF
            com.google.android.material.internal.CollapsingTextHelper r1 = r4.collapsingTextHelper
            android.widget.EditText r2 = r4.editText
            int r2 = r2.getWidth()
            android.widget.EditText r3 = r4.editText
            int r3 = r3.getGravity()
            r1.getCollapsedTextActualBounds(r0, r2, r3)
            r4.applyCutoutPadding(r0)
            int r1 = r4.getPaddingLeft()
            int r1 = -r1
            float r1 = (float) r1
            int r2 = r4.getPaddingTop()
            int r2 = -r2
            float r2 = (float) r2
            r0.offset(r1, r2)
            com.google.android.material.shape.MaterialShapeDrawable r1 = r4.boxBackground
            com.google.android.material.textfield.CutoutDrawable r1 = (com.google.android.material.textfield.CutoutDrawable) r1
            r1.setCutout(r0)
            return
    }

    private static void recursiveSetEnabled(android.view.ViewGroup r4, boolean r5) {
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1a
            android.view.View r2 = r4.getChildAt(r1)
            r2.setEnabled(r5)
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L17
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            recursiveSetEnabled(r2, r5)
        L17:
            int r1 = r1 + 1
            goto L5
        L1a:
            return
    }

    private void refreshIconDrawableState(com.google.android.material.internal.CheckableImageButton r4, android.content.res.ColorStateList r5) {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r4.getDrawable()
            android.graphics.drawable.Drawable r1 = r4.getDrawable()
            if (r1 == 0) goto L31
            if (r5 == 0) goto L31
            boolean r1 = r5.isStateful()
            if (r1 != 0) goto L13
            goto L31
        L13:
            int[] r1 = r3.mergeIconState(r4)
            int r2 = r5.getDefaultColor()
            int r5 = r5.getColorForState(r1, r2)
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r5)
            r4.setImageDrawable(r0)
        L31:
            return
    }

    private void removePlaceholderTextView() {
            r2 = this;
            android.widget.TextView r0 = r2.placeholderTextView
            if (r0 == 0) goto L9
            r1 = 8
            r0.setVisibility(r1)
        L9:
            return
    }

    private void setEditText(android.widget.EditText r4) {
            r3 = this;
            android.widget.EditText r0 = r3.editText
            if (r0 != 0) goto Lc5
            int r0 = r3.endIconMode
            r1 = 3
            if (r0 == r1) goto L14
            boolean r0 = r4 instanceof com.google.android.material.textfield.TextInputEditText
            if (r0 != 0) goto L14
            java.lang.String r0 = "TextInputLayout"
            java.lang.String r1 = "EditText added is not a TextInputEditText. Please switch to using that class instead."
            android.util.Log.i(r0, r1)
        L14:
            r3.editText = r4
            r3.onApplyBoxBackgroundMode()
            com.google.android.material.textfield.TextInputLayout$AccessibilityDelegate r0 = new com.google.android.material.textfield.TextInputLayout$AccessibilityDelegate
            r0.<init>(r3)
            r3.setTextInputAccessibilityDelegate(r0)
            com.google.android.material.internal.CollapsingTextHelper r0 = r3.collapsingTextHelper
            android.widget.EditText r1 = r3.editText
            android.graphics.Typeface r1 = r1.getTypeface()
            r0.setTypefaces(r1)
            com.google.android.material.internal.CollapsingTextHelper r0 = r3.collapsingTextHelper
            android.widget.EditText r1 = r3.editText
            float r1 = r1.getTextSize()
            r0.setExpandedTextSize(r1)
            android.widget.EditText r0 = r3.editText
            int r0 = r0.getGravity()
            com.google.android.material.internal.CollapsingTextHelper r1 = r3.collapsingTextHelper
            r2 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            r2 = r2 | 48
            r1.setCollapsedTextGravity(r2)
            com.google.android.material.internal.CollapsingTextHelper r1 = r3.collapsingTextHelper
            r1.setExpandedTextGravity(r0)
            android.widget.EditText r0 = r3.editText
            com.google.android.material.textfield.TextInputLayout$1 r1 = new com.google.android.material.textfield.TextInputLayout$1
            r1.<init>(r3)
            r0.addTextChangedListener(r1)
            android.content.res.ColorStateList r0 = r3.defaultHintTextColor
            if (r0 != 0) goto L61
            android.widget.EditText r0 = r3.editText
            android.content.res.ColorStateList r0 = r0.getHintTextColors()
            r3.defaultHintTextColor = r0
        L61:
            boolean r0 = r3.hintEnabled
            r1 = 1
            if (r0 == 0) goto L81
            java.lang.CharSequence r0 = r3.hint
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L7f
            android.widget.EditText r0 = r3.editText
            java.lang.CharSequence r0 = r0.getHint()
            r3.originalHint = r0
            r3.setHint(r0)
            android.widget.EditText r0 = r3.editText
            r2 = 0
            r0.setHint(r2)
        L7f:
            r3.isProvidingHint = r1
        L81:
            android.widget.TextView r0 = r3.counterView
            if (r0 == 0) goto L92
            android.widget.EditText r0 = r3.editText
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            r3.updateCounter(r0)
        L92:
            r3.updateEditTextBackground()
            com.google.android.material.textfield.IndicatorViewController r0 = r3.indicatorViewController
            r0.adjustIndicatorPadding()
            android.widget.LinearLayout r0 = r3.startLayout
            r0.bringToFront()
            android.widget.LinearLayout r0 = r3.endLayout
            r0.bringToFront()
            android.widget.FrameLayout r0 = r3.endIconFrame
            r0.bringToFront()
            com.google.android.material.internal.CheckableImageButton r0 = r3.errorIconView
            r0.bringToFront()
            r3.dispatchOnEditTextAttached()
            r3.updatePrefixTextViewPadding()
            r3.updateSuffixTextViewPadding()
            boolean r0 = r3.isEnabled()
            r2 = 0
            if (r0 != 0) goto Lc1
            r4.setEnabled(r2)
        Lc1:
            r3.updateLabelState(r2, r1)
            return
        Lc5:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "We already have an EditText, can only have one"
            r4.<init>(r0)
            throw r4
    }

    private void setEditTextBoxBackground() {
            r2 = this;
            boolean r0 = r2.shouldUseEditTextBackgroundForBoxBackground()
            if (r0 == 0) goto Ld
            android.widget.EditText r0 = r2.editText
            com.google.android.material.shape.MaterialShapeDrawable r1 = r2.boxBackground
            androidx.core.view.ViewCompat.setBackground(r0, r1)
        Ld:
            return
    }

    private void setErrorIconVisible(boolean r5) {
            r4 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r4.errorIconView
            r1 = 0
            r2 = 8
            if (r5 == 0) goto L9
            r3 = r1
            goto La
        L9:
            r3 = r2
        La:
            r0.setVisibility(r3)
            android.widget.FrameLayout r0 = r4.endIconFrame
            if (r5 == 0) goto L12
            r1 = r2
        L12:
            r0.setVisibility(r1)
            r4.updateSuffixTextViewPadding()
            boolean r5 = r4.hasEndIcon()
            if (r5 != 0) goto L21
            r4.updateDummyDrawables()
        L21:
            return
    }

    private void setHintInternal(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.CharSequence r0 = r1.hint
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L16
            r1.hint = r2
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setText(r2)
            boolean r2 = r1.hintExpanded
            if (r2 != 0) goto L16
            r1.openCutout()
        L16:
            return
    }

    private static void setIconClickable(com.google.android.material.internal.CheckableImageButton r3, android.view.View.OnLongClickListener r4) {
            boolean r0 = androidx.core.view.ViewCompat.hasOnClickListeners(r3)
            r1 = 0
            r2 = 1
            if (r4 == 0) goto La
            r4 = r2
            goto Lb
        La:
            r4 = r1
        Lb:
            if (r0 != 0) goto Lf
            if (r4 == 0) goto L10
        Lf:
            r1 = r2
        L10:
            r3.setFocusable(r1)
            r3.setClickable(r0)
            r3.setPressable(r0)
            r3.setLongClickable(r4)
            if (r1 == 0) goto L1f
            goto L20
        L1f:
            r2 = 2
        L20:
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r2)
            return
    }

    private static void setIconOnClickListener(com.google.android.material.internal.CheckableImageButton r0, android.view.View.OnClickListener r1, android.view.View.OnLongClickListener r2) {
            r0.setOnClickListener(r1)
            setIconClickable(r0, r2)
            return
    }

    private static void setIconOnLongClickListener(com.google.android.material.internal.CheckableImageButton r0, android.view.View.OnLongClickListener r1) {
            r0.setOnLongClickListener(r1)
            setIconClickable(r0, r1)
            return
    }

    private void setPlaceholderTextEnabled(boolean r3) {
            r2 = this;
            boolean r0 = r2.placeholderEnabled
            if (r0 != r3) goto L5
            return
        L5:
            if (r3 == 0) goto L2b
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.placeholderTextView = r0
            int r1 = com.google.android.material.C0479R.id.textinput_placeholder
            r0.setId(r1)
            android.widget.TextView r0 = r2.placeholderTextView
            r1 = 1
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r0, r1)
            int r0 = r2.placeholderTextAppearance
            r2.setPlaceholderTextAppearance(r0)
            android.content.res.ColorStateList r0 = r2.placeholderTextColor
            r2.setPlaceholderTextColor(r0)
            r2.addPlaceholderTextView()
            goto L31
        L2b:
            r2.removePlaceholderTextView()
            r0 = 0
            r2.placeholderTextView = r0
        L31:
            r2.placeholderEnabled = r3
            return
    }

    private boolean shouldUpdateEndDummyDrawable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L18
            boolean r0 = r1.hasEndIcon()
            if (r0 == 0) goto L14
            boolean r0 = r1.isEndIconVisible()
            if (r0 != 0) goto L18
        L14:
            java.lang.CharSequence r0 = r1.suffixText
            if (r0 == 0) goto L22
        L18:
            android.widget.LinearLayout r0 = r1.endLayout
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            return r0
    }

    private boolean shouldUpdateStartDummyDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getStartIconDrawable()
            if (r0 != 0) goto La
            java.lang.CharSequence r0 = r1.prefixText
            if (r0 == 0) goto L14
        La:
            android.widget.LinearLayout r0 = r1.startLayout
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    private boolean shouldUseEditTextBackgroundForBoxBackground() {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            if (r0 == 0) goto L14
            com.google.android.material.shape.MaterialShapeDrawable r1 = r2.boxBackground
            if (r1 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L14
            int r0 = r2.boxBackgroundMode
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    private void showPlaceholderText() {
            r2 = this;
            android.widget.TextView r0 = r2.placeholderTextView
            if (r0 == 0) goto L18
            boolean r1 = r2.placeholderEnabled
            if (r1 == 0) goto L18
            java.lang.CharSequence r1 = r2.placeholderText
            r0.setText(r1)
            android.widget.TextView r0 = r2.placeholderTextView
            r1 = 0
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.placeholderTextView
            r0.bringToFront()
        L18:
            return
    }

    private void tintEndIconOnError(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L23
            android.graphics.drawable.Drawable r2 = r1.getEndIconDrawable()
            if (r2 == 0) goto L23
            android.graphics.drawable.Drawable r2 = r1.getEndIconDrawable()
            android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.DrawableCompat.wrap(r2)
            android.graphics.drawable.Drawable r2 = r2.mutate()
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            int r0 = r0.getErrorViewCurrentTextColor()
            androidx.core.graphics.drawable.DrawableCompat.setTint(r2, r0)
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setImageDrawable(r2)
            goto L26
        L23:
            r1.applyEndIconTint()
        L26:
            return
    }

    private void updateBoxCollapsedPaddingTop() {
            r2 = this;
            int r0 = r2.boxBackgroundMode
            r1 = 1
            if (r0 != r1) goto L32
            android.content.Context r0 = r2.getContext()
            boolean r0 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast2_0(r0)
            if (r0 == 0) goto L1c
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.C0479R.dimen.material_font_2_0_box_collapsed_padding_top
            int r0 = r0.getDimensionPixelSize(r1)
            r2.boxCollapsedPaddingTopPx = r0
            goto L32
        L1c:
            android.content.Context r0 = r2.getContext()
            boolean r0 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(r0)
            if (r0 == 0) goto L32
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.C0479R.dimen.material_font_1_3_box_collapsed_padding_top
            int r0 = r0.getDimensionPixelSize(r1)
            r2.boxCollapsedPaddingTopPx = r0
        L32:
            return
    }

    private void updateBoxUnderlineBounds(android.graphics.Rect r5) {
            r4 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r4.boxUnderline
            if (r0 == 0) goto L14
            int r0 = r5.bottom
            int r1 = r4.boxStrokeWidthFocusedPx
            int r0 = r0 - r1
            com.google.android.material.shape.MaterialShapeDrawable r1 = r4.boxUnderline
            int r2 = r5.left
            int r3 = r5.right
            int r5 = r5.bottom
            r1.setBounds(r2, r0, r3, r5)
        L14:
            return
    }

    private void updateCounter() {
            r1 = this;
            android.widget.TextView r0 = r1.counterView
            if (r0 == 0) goto L15
            android.widget.EditText r0 = r1.editText
            if (r0 != 0) goto La
            r0 = 0
            goto L12
        La:
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
        L12:
            r1.updateCounter(r0)
        L15:
            return
    }

    private static void updateCounterContentDescription(android.content.Context r2, android.widget.TextView r3, int r4, int r5, boolean r6) {
            if (r6 == 0) goto L5
            int r6 = com.google.android.material.C0479R.string.character_counter_overflowed_content_description
            goto L7
        L5:
            int r6 = com.google.android.material.C0479R.string.character_counter_content_description
        L7:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r1] = r4
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r4] = r5
            java.lang.String r2 = r2.getString(r6, r0)
            r3.setContentDescription(r2)
            return
    }

    private void updateCounterTextAppearanceAndColor() {
            r2 = this;
            android.widget.TextView r0 = r2.counterView
            if (r0 == 0) goto L2a
            boolean r1 = r2.counterOverflowed
            if (r1 == 0) goto Lb
            int r1 = r2.counterOverflowTextAppearance
            goto Ld
        Lb:
            int r1 = r2.counterTextAppearance
        Ld:
            r2.setTextAppearanceCompatWithErrorFallback(r0, r1)
            boolean r0 = r2.counterOverflowed
            if (r0 != 0) goto L1d
            android.content.res.ColorStateList r0 = r2.counterTextColor
            if (r0 == 0) goto L1d
            android.widget.TextView r1 = r2.counterView
            r1.setTextColor(r0)
        L1d:
            boolean r0 = r2.counterOverflowed
            if (r0 == 0) goto L2a
            android.content.res.ColorStateList r0 = r2.counterOverflowTextColor
            if (r0 == 0) goto L2a
            android.widget.TextView r1 = r2.counterView
            r1.setTextColor(r0)
        L2a:
            return
    }

    private boolean updateDummyDrawables() {
            r10 = this;
            android.widget.EditText r0 = r10.editText
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r10.shouldUpdateStartDummyDrawable()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 == 0) goto L49
            android.widget.LinearLayout r0 = r10.startLayout
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.editText
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.startDummyDrawable
            if (r6 == 0) goto L25
            int r6 = r10.startDummyDrawableWidth
            if (r6 == r0) goto L31
        L25:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.startDummyDrawable = r6
            r10.startDummyDrawableWidth = r0
            r6.setBounds(r1, r1, r0, r5)
        L31:
            android.widget.EditText r0 = r10.editText
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.startDummyDrawable
            if (r6 == r7) goto L62
            android.widget.EditText r6 = r10.editText
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r6, r7, r8, r9, r0)
            goto L60
        L49:
            android.graphics.drawable.Drawable r0 = r10.startDummyDrawable
            if (r0 == 0) goto L62
            android.widget.EditText r0 = r10.editText
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(r0)
            android.widget.EditText r6 = r10.editText
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r6, r2, r7, r8, r0)
            r10.startDummyDrawable = r2
        L60:
            r0 = r5
            goto L63
        L62:
            r0 = r1
        L63:
            boolean r6 = r10.shouldUpdateEndDummyDrawable()
            if (r6 == 0) goto Ld1
            android.widget.TextView r2 = r10.suffixTextView
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.editText
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L8c
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = androidx.core.view.MarginLayoutParamsCompat.getMarginStart(r6)
            int r2 = r2 + r6
        L8c:
            android.widget.EditText r6 = r10.editText
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(r6)
            android.graphics.drawable.Drawable r7 = r10.endDummyDrawable
            if (r7 == 0) goto Lad
            int r8 = r10.endDummyDrawableWidth
            if (r8 == r2) goto Lad
            r10.endDummyDrawableWidth = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.editText
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r3 = r10.endDummyDrawable
            r4 = r6[r4]
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r0, r1, r2, r3, r4)
            goto Lf2
        Lad:
            if (r7 != 0) goto Lbb
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.endDummyDrawable = r7
            r10.endDummyDrawableWidth = r2
            r7.setBounds(r1, r1, r2, r5)
        Lbb:
            r2 = r6[r3]
            android.graphics.drawable.Drawable r3 = r10.endDummyDrawable
            if (r2 == r3) goto Lcf
            r10.originalEditTextEndDrawable = r2
            android.widget.EditText r0 = r10.editText
            r1 = r6[r1]
            r2 = r6[r5]
            r4 = r6[r4]
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r0, r1, r2, r3, r4)
            goto Lf2
        Lcf:
            r5 = r0
            goto Lf2
        Ld1:
            android.graphics.drawable.Drawable r6 = r10.endDummyDrawable
            if (r6 == 0) goto Lf3
            android.widget.EditText r6 = r10.editText
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(r6)
            r3 = r6[r3]
            android.graphics.drawable.Drawable r7 = r10.endDummyDrawable
            if (r3 != r7) goto Lef
            android.widget.EditText r0 = r10.editText
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.originalEditTextEndDrawable
            r4 = r6[r4]
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r0, r1, r3, r7, r4)
            goto Lf0
        Lef:
            r5 = r0
        Lf0:
            r10.endDummyDrawable = r2
        Lf2:
            r0 = r5
        Lf3:
            return r0
    }

    private boolean updateEditTextHeightBasedOnIcon() {
            r3 = this;
            android.widget.EditText r0 = r3.editText
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.widget.LinearLayout r0 = r3.endLayout
            int r0 = r0.getMeasuredHeight()
            android.widget.LinearLayout r2 = r3.startLayout
            int r2 = r2.getMeasuredHeight()
            int r0 = java.lang.Math.max(r0, r2)
            android.widget.EditText r2 = r3.editText
            int r2 = r2.getMeasuredHeight()
            if (r2 >= r0) goto L25
            android.widget.EditText r1 = r3.editText
            r1.setMinimumHeight(r0)
            r0 = 1
            return r0
        L25:
            return r1
    }

    private void updateInputLayoutMargins() {
            r3 = this;
            int r0 = r3.boxBackgroundMode
            r1 = 1
            if (r0 == r1) goto L1c
            android.widget.FrameLayout r0 = r3.inputFrame
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r3.calculateLabelMarginTop()
            int r2 = r0.topMargin
            if (r1 == r2) goto L1c
            r0.topMargin = r1
            android.widget.FrameLayout r0 = r3.inputFrame
            r0.requestLayout()
        L1c:
            return
    }

    private void updateLabelState(boolean r9, boolean r10) {
            r8 = this;
            boolean r0 = r8.isEnabled()
            android.widget.EditText r1 = r8.editText
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L16
            r1 = r2
            goto L17
        L16:
            r1 = r3
        L17:
            android.widget.EditText r4 = r8.editText
            if (r4 == 0) goto L23
            boolean r4 = r4.hasFocus()
            if (r4 == 0) goto L23
            r4 = r2
            goto L24
        L23:
            r4 = r3
        L24:
            com.google.android.material.textfield.IndicatorViewController r5 = r8.indicatorViewController
            boolean r5 = r5.errorShouldBeShown()
            android.content.res.ColorStateList r6 = r8.defaultHintTextColor
            if (r6 == 0) goto L3a
            com.google.android.material.internal.CollapsingTextHelper r7 = r8.collapsingTextHelper
            r7.setCollapsedTextColor(r6)
            com.google.android.material.internal.CollapsingTextHelper r6 = r8.collapsingTextHelper
            android.content.res.ColorStateList r7 = r8.defaultHintTextColor
            r6.setExpandedTextColor(r7)
        L3a:
            if (r0 != 0) goto L63
            android.content.res.ColorStateList r0 = r8.defaultHintTextColor
            if (r0 == 0) goto L4e
            int[] r2 = new int[r2]
            r5 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r2[r3] = r5
            int r3 = r8.disabledColor
            int r0 = r0.getColorForState(r2, r3)
            goto L50
        L4e:
            int r0 = r8.disabledColor
        L50:
            com.google.android.material.internal.CollapsingTextHelper r2 = r8.collapsingTextHelper
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r0)
            r2.setCollapsedTextColor(r3)
            com.google.android.material.internal.CollapsingTextHelper r2 = r8.collapsingTextHelper
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.setExpandedTextColor(r0)
            goto L8e
        L63:
            if (r5 == 0) goto L71
            com.google.android.material.internal.CollapsingTextHelper r0 = r8.collapsingTextHelper
            com.google.android.material.textfield.IndicatorViewController r2 = r8.indicatorViewController
            android.content.res.ColorStateList r2 = r2.getErrorViewTextColors()
            r0.setCollapsedTextColor(r2)
            goto L8e
        L71:
            boolean r0 = r8.counterOverflowed
            if (r0 == 0) goto L83
            android.widget.TextView r0 = r8.counterView
            if (r0 == 0) goto L83
            com.google.android.material.internal.CollapsingTextHelper r2 = r8.collapsingTextHelper
            android.content.res.ColorStateList r0 = r0.getTextColors()
            r2.setCollapsedTextColor(r0)
            goto L8e
        L83:
            if (r4 == 0) goto L8e
            android.content.res.ColorStateList r0 = r8.focusedTextColor
            if (r0 == 0) goto L8e
            com.google.android.material.internal.CollapsingTextHelper r2 = r8.collapsingTextHelper
            r2.setCollapsedTextColor(r0)
        L8e:
            if (r1 != 0) goto La7
            boolean r0 = r8.expandedHintEnabled
            if (r0 == 0) goto La7
            boolean r0 = r8.isEnabled()
            if (r0 == 0) goto L9d
            if (r4 == 0) goto L9d
            goto La7
        L9d:
            if (r10 != 0) goto La3
            boolean r10 = r8.hintExpanded
            if (r10 != 0) goto Lb0
        La3:
            r8.expandHint(r9)
            goto Lb0
        La7:
            if (r10 != 0) goto Lad
            boolean r10 = r8.hintExpanded
            if (r10 == 0) goto Lb0
        Lad:
            r8.collapseHint(r9)
        Lb0:
            return
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
            r5 = this;
            android.widget.TextView r0 = r5.placeholderTextView
            if (r0 == 0) goto L2e
            android.widget.EditText r0 = r5.editText
            if (r0 == 0) goto L2e
            int r0 = r0.getGravity()
            android.widget.TextView r1 = r5.placeholderTextView
            r1.setGravity(r0)
            android.widget.TextView r0 = r5.placeholderTextView
            android.widget.EditText r1 = r5.editText
            int r1 = r1.getCompoundPaddingLeft()
            android.widget.EditText r2 = r5.editText
            int r2 = r2.getCompoundPaddingTop()
            android.widget.EditText r3 = r5.editText
            int r3 = r3.getCompoundPaddingRight()
            android.widget.EditText r4 = r5.editText
            int r4 = r4.getCompoundPaddingBottom()
            r0.setPadding(r1, r2, r3, r4)
        L2e:
            return
    }

    private void updatePlaceholderText() {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            if (r0 != 0) goto L6
            r0 = 0
            goto Le
        L6:
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
        Le:
            r1.updatePlaceholderText(r0)
            return
    }

    private void updatePlaceholderText(int r1) {
            r0 = this;
            if (r1 != 0) goto La
            boolean r1 = r0.hintExpanded
            if (r1 != 0) goto La
            r0.showPlaceholderText()
            goto Ld
        La:
            r0.hidePlaceholderText()
        Ld:
            return
    }

    private void updatePrefixTextViewPadding() {
            r5 = this;
            android.widget.EditText r0 = r5.editText
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r5.isStartIconVisible()
            if (r0 == 0) goto Ld
            r0 = 0
            goto L13
        Ld:
            android.widget.EditText r0 = r5.editText
            int r0 = androidx.core.view.ViewCompat.getPaddingStart(r0)
        L13:
            android.widget.TextView r1 = r5.prefixTextView
            android.widget.EditText r2 = r5.editText
            int r2 = r2.getCompoundPaddingTop()
            android.content.Context r3 = r5.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = com.google.android.material.C0479R.dimen.material_input_text_to_prefix_suffix_padding
            int r3 = r3.getDimensionPixelSize(r4)
            android.widget.EditText r4 = r5.editText
            int r4 = r4.getCompoundPaddingBottom()
            androidx.core.view.ViewCompat.setPaddingRelative(r1, r0, r2, r3, r4)
            return
    }

    private void updatePrefixTextVisibility() {
            r2 = this;
            android.widget.TextView r0 = r2.prefixTextView
            java.lang.CharSequence r1 = r2.prefixText
            if (r1 == 0) goto Le
            boolean r1 = r2.isHintExpanded()
            if (r1 != 0) goto Le
            r1 = 0
            goto L10
        Le:
            r1 = 8
        L10:
            r0.setVisibility(r1)
            r2.updateDummyDrawables()
            return
    }

    private void updateStrokeErrorColor(boolean r5, boolean r6) {
            r4 = this;
            android.content.res.ColorStateList r0 = r4.strokeErrorColor
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r1 = r4.strokeErrorColor
            r2 = 2
            int[] r3 = new int[r2]
            r3 = {x002a: FILL_ARRAY_DATA , data: [16843623, 16842910} // fill-array
            int r1 = r1.getColorForState(r3, r0)
            android.content.res.ColorStateList r3 = r4.strokeErrorColor
            int[] r2 = new int[r2]
            r2 = {x0032: FILL_ARRAY_DATA , data: [16843518, 16842910} // fill-array
            int r2 = r3.getColorForState(r2, r0)
            if (r5 == 0) goto L22
            r4.boxStrokeColor = r2
            goto L29
        L22:
            if (r6 == 0) goto L27
            r4.boxStrokeColor = r1
            goto L29
        L27:
            r4.boxStrokeColor = r0
        L29:
            return
    }

    private void updateSuffixTextViewPadding() {
            r5 = this;
            android.widget.EditText r0 = r5.editText
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r5.isEndIconVisible()
            if (r0 != 0) goto L19
            boolean r0 = r5.isErrorIconVisible()
            if (r0 == 0) goto L12
            goto L19
        L12:
            android.widget.EditText r0 = r5.editText
            int r0 = androidx.core.view.ViewCompat.getPaddingEnd(r0)
            goto L1a
        L19:
            r0 = 0
        L1a:
            android.widget.TextView r1 = r5.suffixTextView
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.google.android.material.C0479R.dimen.material_input_text_to_prefix_suffix_padding
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r5.editText
            int r3 = r3.getPaddingTop()
            android.widget.EditText r4 = r5.editText
            int r4 = r4.getPaddingBottom()
            androidx.core.view.ViewCompat.setPaddingRelative(r1, r2, r3, r0, r4)
            return
    }

    private void updateSuffixTextVisibility() {
            r4 = this;
            android.widget.TextView r0 = r4.suffixTextView
            int r0 = r0.getVisibility()
            java.lang.CharSequence r1 = r4.suffixText
            r2 = 0
            if (r1 == 0) goto L13
            boolean r1 = r4.isHintExpanded()
            if (r1 != 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = r2
        L14:
            android.widget.TextView r3 = r4.suffixTextView
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r2 = 8
        L1b:
            r3.setVisibility(r2)
            android.widget.TextView r2 = r4.suffixTextView
            int r2 = r2.getVisibility()
            if (r0 == r2) goto L2d
            com.google.android.material.textfield.EndIconDelegate r0 = r4.getEndIconDelegate()
            r0.onSuffixVisibilityChanged(r1)
        L2d:
            r4.updateDummyDrawables()
            return
    }

    public void addOnEditTextAttachedListener(com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener> r0 = r1.editTextAttachedListeners
            r0.add(r2)
            android.widget.EditText r0 = r1.editText
            if (r0 == 0) goto Lc
            r2.onEditTextAttached(r1)
        Lc:
            return
    }

    public void addOnEndIconChangedListener(com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener> r0 = r1.endIconChangedListeners
            r0.add(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            boolean r0 = r2 instanceof android.widget.EditText
            if (r0 == 0) goto L24
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r4)
            int r0 = r3.gravity
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            r0 = r0 | 16
            r3.gravity = r0
            android.widget.FrameLayout r0 = r1.inputFrame
            r0.addView(r2, r3)
            android.widget.FrameLayout r3 = r1.inputFrame
            r3.setLayoutParams(r4)
            r1.updateInputLayoutMargins()
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.setEditText(r2)
            goto L27
        L24:
            super.addView(r2, r3, r4)
        L27:
            return
    }

    void animateToExpansionFraction(float r5) {
            r4 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r4.collapsingTextHelper
            float r0 = r0.getExpansionFraction()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto Lb
            return
        Lb:
            android.animation.ValueAnimator r0 = r4.animator
            if (r0 != 0) goto L2c
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            r4.animator = r0
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r4.animator
            r1 = 167(0xa7, double:8.25E-322)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r4.animator
            com.google.android.material.textfield.TextInputLayout$4 r1 = new com.google.android.material.textfield.TextInputLayout$4
            r1.<init>(r4)
            r0.addUpdateListener(r1)
        L2c:
            android.animation.ValueAnimator r0 = r4.animator
            r1 = 2
            float[] r1 = new float[r1]
            com.google.android.material.internal.CollapsingTextHelper r2 = r4.collapsingTextHelper
            float r2 = r2.getExpansionFraction()
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r5
            r0.setFloatValues(r1)
            android.animation.ValueAnimator r5 = r4.animator
            r5.start()
            return
    }

    public void clearOnEditTextAttachedListeners() {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener> r0 = r1.editTextAttachedListeners
            r0.clear()
            return
    }

    public void clearOnEndIconChangedListeners() {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener> r0 = r1.endIconChangedListeners
            r0.clear()
            return
    }

    boolean cutoutIsOpen() {
            r1 = this;
            boolean r0 = r1.cutoutEnabled()
            if (r0 == 0) goto L12
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.boxBackground
            com.google.android.material.textfield.CutoutDrawable r0 = (com.google.android.material.textfield.CutoutDrawable) r0
            boolean r0 = r0.hasCutout()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(android.view.ViewStructure r5, int r6) {
            r4 = this;
            android.widget.EditText r0 = r4.editText
            if (r0 != 0) goto L8
            super.dispatchProvideAutofillStructure(r5, r6)
            return
        L8:
            java.lang.CharSequence r1 = r4.originalHint
            r2 = 0
            if (r1 == 0) goto L30
            boolean r1 = r4.isProvidingHint
            r4.isProvidingHint = r2
            java.lang.CharSequence r0 = r0.getHint()
            android.widget.EditText r2 = r4.editText
            java.lang.CharSequence r3 = r4.originalHint
            r2.setHint(r3)
            super.dispatchProvideAutofillStructure(r5, r6)     // Catch: java.lang.Throwable -> L27
            android.widget.EditText r5 = r4.editText
            r5.setHint(r0)
            r4.isProvidingHint = r1
            goto L69
        L27:
            r5 = move-exception
            android.widget.EditText r6 = r4.editText
            r6.setHint(r0)
            r4.isProvidingHint = r1
            throw r5
        L30:
            android.view.autofill.AutofillId r0 = r4.getAutofillId()
            r5.setAutofillId(r0)
            r4.onProvideAutofillStructure(r5, r6)
            r4.onProvideAutofillVirtualStructure(r5, r6)
            android.widget.FrameLayout r0 = r4.inputFrame
            int r0 = r0.getChildCount()
            r5.setChildCount(r0)
        L46:
            android.widget.FrameLayout r0 = r4.inputFrame
            int r0 = r0.getChildCount()
            if (r2 >= r0) goto L69
            android.widget.FrameLayout r0 = r4.inputFrame
            android.view.View r0 = r0.getChildAt(r2)
            android.view.ViewStructure r1 = r5.newChild(r2)
            r0.dispatchProvideAutofillStructure(r1, r6)
            android.widget.EditText r3 = r4.editText
            if (r0 != r3) goto L66
            java.lang.CharSequence r0 = r4.getHint()
            r1.setHint(r0)
        L66:
            int r2 = r2 + 1
            goto L46
        L69:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            r0 = 1
            r1.restoringSavedState = r0
            super.dispatchRestoreInstanceState(r2)
            r2 = 0
            r1.restoringSavedState = r2
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            super.draw(r1)
            r0.drawHint(r1)
            r0.drawBoxUnderline(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r4 = this;
            boolean r0 = r4.inDrawableStateChanged
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.inDrawableStateChanged = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            com.google.android.material.internal.CollapsingTextHelper r2 = r4.collapsingTextHelper
            r3 = 0
            if (r2 == 0) goto L1a
            boolean r1 = r2.setState(r1)
            r1 = r1 | r3
            goto L1b
        L1a:
            r1 = r3
        L1b:
            android.widget.EditText r2 = r4.editText
            if (r2 == 0) goto L30
            boolean r2 = androidx.core.view.ViewCompat.isLaidOut(r4)
            if (r2 == 0) goto L2c
            boolean r2 = r4.isEnabled()
            if (r2 == 0) goto L2c
            goto L2d
        L2c:
            r0 = r3
        L2d:
            r4.updateLabelState(r0)
        L30:
            r4.updateEditTextBackground()
            r4.updateTextInputBoxState()
            if (r1 == 0) goto L3b
            r4.invalidate()
        L3b:
            r4.inDrawableStateChanged = r3
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            if (r0 == 0) goto L13
            int r0 = r0.getBaseline()
            int r1 = r2.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r2.calculateLabelMarginTop()
            int r0 = r0 + r1
            return r0
        L13:
            int r0 = super.getBaseline()
            return r0
    }

    com.google.android.material.shape.MaterialShapeDrawable getBoxBackground() {
            r2 = this;
            int r0 = r2.boxBackgroundMode
            r1 = 1
            if (r0 == r1) goto Lf
            r1 = 2
            if (r0 != r1) goto L9
            goto Lf
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        Lf:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.boxBackground
            return r0
    }

    public int getBoxBackgroundColor() {
            r1 = this;
            int r0 = r1.boxBackgroundColor
            return r0
    }

    public int getBoxBackgroundMode() {
            r1 = this;
            int r0 = r1.boxBackgroundMode
            return r0
    }

    public float getBoxCornerRadiusBottomEnd() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.boxBackground
            float r0 = r0.getBottomLeftCornerResolvedSize()
            return r0
    }

    public float getBoxCornerRadiusBottomStart() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.boxBackground
            float r0 = r0.getBottomRightCornerResolvedSize()
            return r0
    }

    public float getBoxCornerRadiusTopEnd() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.boxBackground
            float r0 = r0.getTopRightCornerResolvedSize()
            return r0
    }

    public float getBoxCornerRadiusTopStart() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.boxBackground
            float r0 = r0.getTopLeftCornerResolvedSize()
            return r0
    }

    public int getBoxStrokeColor() {
            r1 = this;
            int r0 = r1.focusedStrokeColor
            return r0
    }

    public android.content.res.ColorStateList getBoxStrokeErrorColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.strokeErrorColor
            return r0
    }

    public int getBoxStrokeWidth() {
            r1 = this;
            int r0 = r1.boxStrokeWidthDefaultPx
            return r0
    }

    public int getBoxStrokeWidthFocused() {
            r1 = this;
            int r0 = r1.boxStrokeWidthFocusedPx
            return r0
    }

    public int getCounterMaxLength() {
            r1 = this;
            int r0 = r1.counterMaxLength
            return r0
    }

    java.lang.CharSequence getCounterOverflowDescription() {
            r1 = this;
            boolean r0 = r1.counterEnabled
            if (r0 == 0) goto L11
            boolean r0 = r1.counterOverflowed
            if (r0 == 0) goto L11
            android.widget.TextView r0 = r1.counterView
            if (r0 == 0) goto L11
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        L11:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getCounterOverflowTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.counterTextColor
            return r0
    }

    public android.content.res.ColorStateList getCounterTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.counterTextColor
            return r0
    }

    public android.content.res.ColorStateList getDefaultHintTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.defaultHintTextColor
            return r0
    }

    public android.widget.EditText getEditText() {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            return r0
    }

    public java.lang.CharSequence getEndIconContentDescription() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    public android.graphics.drawable.Drawable getEndIconDrawable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public int getEndIconMode() {
            r1 = this;
            int r0 = r1.endIconMode
            return r0
    }

    com.google.android.material.internal.CheckableImageButton getEndIconView() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            return r0
    }

    public java.lang.CharSequence getError() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            boolean r0 = r0.isErrorEnabled()
            if (r0 == 0) goto Lf
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            java.lang.CharSequence r0 = r0.getErrorText()
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public java.lang.CharSequence getErrorContentDescription() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            java.lang.CharSequence r0 = r0.getErrorContentDescription()
            return r0
    }

    public int getErrorCurrentTextColors() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            int r0 = r0.getErrorViewCurrentTextColor()
            return r0
    }

    public android.graphics.drawable.Drawable getErrorIconDrawable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    final int getErrorTextCurrentColor() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            int r0 = r0.getErrorViewCurrentTextColor()
            return r0
    }

    public java.lang.CharSequence getHelperText() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            boolean r0 = r0.isHelperTextEnabled()
            if (r0 == 0) goto Lf
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            java.lang.CharSequence r0 = r0.getHelperText()
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public int getHelperTextCurrentTextColor() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            int r0 = r0.getHelperTextViewCurrentTextColor()
            return r0
    }

    public java.lang.CharSequence getHint() {
            r1 = this;
            boolean r0 = r1.hintEnabled
            if (r0 == 0) goto L7
            java.lang.CharSequence r0 = r1.hint
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    final float getHintCollapsedTextHeight() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            float r0 = r0.getCollapsedTextHeight()
            return r0
    }

    final int getHintCurrentCollapsedTextColor() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            int r0 = r0.getCurrentCollapsedTextColor()
            return r0
    }

    public android.content.res.ColorStateList getHintTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.focusedTextColor
            return r0
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getPasswordVisibilityToggleContentDescription() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getPasswordVisibilityToggleDrawable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public java.lang.CharSequence getPlaceholderText() {
            r1 = this;
            boolean r0 = r1.placeholderEnabled
            if (r0 == 0) goto L7
            java.lang.CharSequence r0 = r1.placeholderText
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public int getPlaceholderTextAppearance() {
            r1 = this;
            int r0 = r1.placeholderTextAppearance
            return r0
    }

    public android.content.res.ColorStateList getPlaceholderTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.placeholderTextColor
            return r0
    }

    public java.lang.CharSequence getPrefixText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.prefixText
            return r0
    }

    public android.content.res.ColorStateList getPrefixTextColor() {
            r1 = this;
            android.widget.TextView r0 = r1.prefixTextView
            android.content.res.ColorStateList r0 = r0.getTextColors()
            return r0
    }

    public android.widget.TextView getPrefixTextView() {
            r1 = this;
            android.widget.TextView r0 = r1.prefixTextView
            return r0
    }

    public java.lang.CharSequence getStartIconContentDescription() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    public android.graphics.drawable.Drawable getStartIconDrawable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public java.lang.CharSequence getSuffixText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.suffixText
            return r0
    }

    public android.content.res.ColorStateList getSuffixTextColor() {
            r1 = this;
            android.widget.TextView r0 = r1.suffixTextView
            android.content.res.ColorStateList r0 = r0.getTextColors()
            return r0
    }

    public android.widget.TextView getSuffixTextView() {
            r1 = this;
            android.widget.TextView r0 = r1.suffixTextView
            return r0
    }

    public android.graphics.Typeface getTypeface() {
            r1 = this;
            android.graphics.Typeface r0 = r1.typeface
            return r0
    }

    public boolean isCounterEnabled() {
            r1 = this;
            boolean r0 = r1.counterEnabled
            return r0
    }

    public boolean isEndIconCheckable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            boolean r0 = r0.isCheckable()
            return r0
    }

    public boolean isEndIconVisible() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.endIconFrame
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L12
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public boolean isErrorEnabled() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            boolean r0 = r0.isErrorEnabled()
            return r0
    }

    public boolean isExpandedHintEnabled() {
            r1 = this;
            boolean r0 = r1.expandedHintEnabled
            return r0
    }

    final boolean isHelperTextDisplayed() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            boolean r0 = r0.helperTextIsDisplayed()
            return r0
    }

    public boolean isHelperTextEnabled() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            boolean r0 = r0.isHelperTextEnabled()
            return r0
    }

    public boolean isHintAnimationEnabled() {
            r1 = this;
            boolean r0 = r1.hintAnimationEnabled
            return r0
    }

    public boolean isHintEnabled() {
            r1 = this;
            boolean r0 = r1.hintEnabled
            return r0
    }

    final boolean isHintExpanded() {
            r1 = this;
            boolean r0 = r1.hintExpanded
            return r0
    }

    @java.lang.Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
            r2 = this;
            int r0 = r2.endIconMode
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public boolean isProvidingHint() {
            r1 = this;
            boolean r0 = r1.isProvidingHint
            return r0
    }

    public boolean isStartIconCheckable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            boolean r0 = r0.isCheckable()
            return r0
    }

    public boolean isStartIconVisible() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            android.widget.EditText r1 = r0.editText
            if (r1 == 0) goto L56
            android.graphics.Rect r2 = r0.tmpRect
            com.google.android.material.internal.DescendantOffsetUtils.getDescendantRect(r0, r1, r2)
            r0.updateBoxUnderlineBounds(r2)
            boolean r1 = r0.hintEnabled
            if (r1 == 0) goto L56
            com.google.android.material.internal.CollapsingTextHelper r1 = r0.collapsingTextHelper
            android.widget.EditText r3 = r0.editText
            float r3 = r3.getTextSize()
            r1.setExpandedTextSize(r3)
            android.widget.EditText r1 = r0.editText
            int r1 = r1.getGravity()
            com.google.android.material.internal.CollapsingTextHelper r3 = r0.collapsingTextHelper
            r4 = r1 & (-113(0xffffffffffffff8f, float:NaN))
            r4 = r4 | 48
            r3.setCollapsedTextGravity(r4)
            com.google.android.material.internal.CollapsingTextHelper r3 = r0.collapsingTextHelper
            r3.setExpandedTextGravity(r1)
            com.google.android.material.internal.CollapsingTextHelper r1 = r0.collapsingTextHelper
            android.graphics.Rect r3 = r0.calculateCollapsedTextBounds(r2)
            r1.setCollapsedBounds(r3)
            com.google.android.material.internal.CollapsingTextHelper r1 = r0.collapsingTextHelper
            android.graphics.Rect r2 = r0.calculateExpandedTextBounds(r2)
            r1.setExpandedBounds(r2)
            com.google.android.material.internal.CollapsingTextHelper r1 = r0.collapsingTextHelper
            r1.recalculate()
            boolean r1 = r0.cutoutEnabled()
            if (r1 == 0) goto L56
            boolean r1 = r0.hintExpanded
            if (r1 != 0) goto L56
            r0.openCutout()
        L56:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            boolean r1 = r0.updateEditTextHeightBasedOnIcon()
            boolean r2 = r0.updateDummyDrawables()
            if (r1 != 0) goto Lf
            if (r2 == 0) goto L19
        Lf:
            android.widget.EditText r1 = r0.editText
            com.google.android.material.textfield.TextInputLayout$3 r2 = new com.google.android.material.textfield.TextInputLayout$3
            r2.<init>(r0)
            r1.post(r2)
        L19:
            r0.updatePlaceholderMeasurementsBasedOnEditText()
            r0.updatePrefixTextViewPadding()
            r0.updateSuffixTextViewPadding()
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.material.textfield.TextInputLayout.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r3)
            return
        L8:
            com.google.android.material.textfield.TextInputLayout$SavedState r3 = (com.google.android.material.textfield.TextInputLayout.SavedState) r3
            android.os.Parcelable r0 = r3.getSuperState()
            super.onRestoreInstanceState(r0)
            java.lang.CharSequence r0 = r3.error
            r2.setError(r0)
            boolean r0 = r3.isEndIconChecked
            if (r0 == 0) goto L24
            com.google.android.material.internal.CheckableImageButton r0 = r2.endIconView
            com.google.android.material.textfield.TextInputLayout$2 r1 = new com.google.android.material.textfield.TextInputLayout$2
            r1.<init>(r2)
            r0.post(r1)
        L24:
            java.lang.CharSequence r0 = r3.hintText
            r2.setHint(r0)
            java.lang.CharSequence r0 = r3.helperText
            r2.setHelperText(r0)
            java.lang.CharSequence r3 = r3.placeholderText
            r2.setPlaceholderText(r3)
            r2.requestLayout()
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.textfield.TextInputLayout$SavedState r1 = new com.google.android.material.textfield.TextInputLayout$SavedState
            r1.<init>(r0)
            com.google.android.material.textfield.IndicatorViewController r0 = r2.indicatorViewController
            boolean r0 = r0.errorShouldBeShown()
            if (r0 == 0) goto L17
            java.lang.CharSequence r0 = r2.getError()
            r1.error = r0
        L17:
            boolean r0 = r2.hasEndIcon()
            if (r0 == 0) goto L27
            com.google.android.material.internal.CheckableImageButton r0 = r2.endIconView
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            r1.isEndIconChecked = r0
            java.lang.CharSequence r0 = r2.getHint()
            r1.hintText = r0
            java.lang.CharSequence r0 = r2.getHelperText()
            r1.helperText = r0
            java.lang.CharSequence r0 = r2.getPlaceholderText()
            r1.placeholderText = r0
            return r1
    }

    @java.lang.Deprecated
    public void passwordVisibilityToggleRequested(boolean r3) {
            r2 = this;
            int r0 = r2.endIconMode
            r1 = 1
            if (r0 != r1) goto L11
            com.google.android.material.internal.CheckableImageButton r0 = r2.endIconView
            r0.performClick()
            if (r3 == 0) goto L11
            com.google.android.material.internal.CheckableImageButton r3 = r2.endIconView
            r3.jumpDrawablesToCurrentState()
        L11:
            return
    }

    public void refreshEndIconDrawableState() {
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.endIconView
            android.content.res.ColorStateList r1 = r2.endIconTintList
            r2.refreshIconDrawableState(r0, r1)
            return
    }

    public void refreshErrorIconDrawableState() {
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.errorIconView
            android.content.res.ColorStateList r1 = r2.errorIconTintList
            r2.refreshIconDrawableState(r0, r1)
            return
    }

    public void refreshStartIconDrawableState() {
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.startIconView
            android.content.res.ColorStateList r1 = r2.startIconTintList
            r2.refreshIconDrawableState(r0, r1)
            return
    }

    public void removeOnEditTextAttachedListener(com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener> r0 = r1.editTextAttachedListeners
            r0.remove(r2)
            return
    }

    public void removeOnEndIconChangedListener(com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener> r0 = r1.endIconChangedListeners
            r0.remove(r2)
            return
    }

    public void setBoxBackgroundColor(int r2) {
            r1 = this;
            int r0 = r1.boxBackgroundColor
            if (r0 == r2) goto Lf
            r1.boxBackgroundColor = r2
            r1.defaultFilledBackgroundColor = r2
            r1.focusedFilledBackgroundColor = r2
            r1.hoveredFilledBackgroundColor = r2
            r1.applyBoxAttributes()
        Lf:
            return
    }

    public void setBoxBackgroundColorResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r2)
            r1.setBoxBackgroundColor(r2)
            return
    }

    public void setBoxBackgroundColorStateList(android.content.res.ColorStateList r4) {
            r3 = this;
            int r0 = r4.getDefaultColor()
            r3.defaultFilledBackgroundColor = r0
            r3.boxBackgroundColor = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r0[r1] = r2
            r1 = -1
            int r0 = r4.getColorForState(r0, r1)
            r3.disabledFilledBackgroundColor = r0
            r0 = 2
            int[] r2 = new int[r0]
            r2 = {x0034: FILL_ARRAY_DATA , data: [16842908, 16842910} // fill-array
            int r2 = r4.getColorForState(r2, r1)
            r3.focusedFilledBackgroundColor = r2
            int[] r0 = new int[r0]
            r0 = {x003c: FILL_ARRAY_DATA , data: [16843623, 16842910} // fill-array
            int r4 = r4.getColorForState(r0, r1)
            r3.hoveredFilledBackgroundColor = r4
            r3.applyBoxAttributes()
            return
    }

    public void setBoxBackgroundMode(int r2) {
            r1 = this;
            int r0 = r1.boxBackgroundMode
            if (r2 != r0) goto L5
            return
        L5:
            r1.boxBackgroundMode = r2
            android.widget.EditText r2 = r1.editText
            if (r2 == 0) goto Le
            r1.onApplyBoxBackgroundMode()
        Le:
            return
    }

    public void setBoxCornerRadii(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.boxBackground
            if (r0 == 0) goto L2a
            float r0 = r0.getTopLeftCornerResolvedSize()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.boxBackground
            float r0 = r0.getTopRightCornerResolvedSize()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L2a
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.boxBackground
            float r0 = r0.getBottomRightCornerResolvedSize()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L2a
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.boxBackground
            float r0 = r0.getBottomLeftCornerResolvedSize()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L49
        L2a:
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.shapeAppearanceModel
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.toBuilder()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r0.setTopLeftCornerSize(r2)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r2.setTopRightCornerSize(r3)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r2.setBottomRightCornerSize(r5)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r2.setBottomLeftCornerSize(r4)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            r1.shapeAppearanceModel = r2
            r1.applyBoxAttributes()
        L49:
            return
    }

    public void setBoxCornerRadiiResources(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            float r3 = r0.getDimension(r3)
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            float r5 = r0.getDimension(r5)
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            float r4 = r0.getDimension(r4)
            r1.setBoxCornerRadii(r2, r3, r5, r4)
            return
    }

    public void setBoxStrokeColor(int r2) {
            r1 = this;
            int r0 = r1.focusedStrokeColor
            if (r0 == r2) goto L9
            r1.focusedStrokeColor = r2
            r1.updateTextInputBoxState()
        L9:
            return
    }

    public void setBoxStrokeColorStateList(android.content.res.ColorStateList r4) {
            r3 = this;
            boolean r0 = r4.isStateful()
            if (r0 == 0) goto L34
            int r0 = r4.getDefaultColor()
            r3.defaultStrokeColor = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r0[r1] = r2
            r1 = -1
            int r0 = r4.getColorForState(r0, r1)
            r3.disabledColor = r0
            r0 = 2
            int[] r2 = new int[r0]
            r2 = {x0046: FILL_ARRAY_DATA , data: [16843623, 16842910} // fill-array
            int r2 = r4.getColorForState(r2, r1)
            r3.hoveredStrokeColor = r2
            int[] r0 = new int[r0]
            r0 = {x004e: FILL_ARRAY_DATA , data: [16842908, 16842910} // fill-array
            int r4 = r4.getColorForState(r0, r1)
            r3.focusedStrokeColor = r4
            goto L42
        L34:
            int r0 = r3.focusedStrokeColor
            int r1 = r4.getDefaultColor()
            if (r0 == r1) goto L42
            int r4 = r4.getDefaultColor()
            r3.focusedStrokeColor = r4
        L42:
            r3.updateTextInputBoxState()
            return
    }

    public void setBoxStrokeErrorColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.strokeErrorColor
            if (r0 == r2) goto L9
            r1.strokeErrorColor = r2
            r1.updateTextInputBoxState()
        L9:
            return
    }

    public void setBoxStrokeWidth(int r1) {
            r0 = this;
            r0.boxStrokeWidthDefaultPx = r1
            r0.updateTextInputBoxState()
            return
    }

    public void setBoxStrokeWidthFocused(int r1) {
            r0 = this;
            r0.boxStrokeWidthFocusedPx = r1
            r0.updateTextInputBoxState()
            return
    }

    public void setBoxStrokeWidthFocusedResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setBoxStrokeWidthFocused(r2)
            return
    }

    public void setBoxStrokeWidthResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setBoxStrokeWidth(r2)
            return
    }

    public void setCounterEnabled(boolean r4) {
            r3 = this;
            boolean r0 = r3.counterEnabled
            if (r0 == r4) goto L55
            r0 = 2
            if (r4 == 0) goto L49
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r2 = r3.getContext()
            r1.<init>(r2)
            r3.counterView = r1
            int r2 = com.google.android.material.C0479R.id.textinput_counter
            r1.setId(r2)
            android.graphics.Typeface r1 = r3.typeface
            if (r1 == 0) goto L20
            android.widget.TextView r2 = r3.counterView
            r2.setTypeface(r1)
        L20:
            android.widget.TextView r1 = r3.counterView
            r2 = 1
            r1.setMaxLines(r2)
            com.google.android.material.textfield.IndicatorViewController r1 = r3.indicatorViewController
            android.widget.TextView r2 = r3.counterView
            r1.addIndicator(r2, r0)
            android.widget.TextView r0 = r3.counterView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            android.content.res.Resources r1 = r3.getResources()
            int r2 = com.google.android.material.C0479R.dimen.mtrl_textinput_counter_margin_start
            int r1 = r1.getDimensionPixelOffset(r2)
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart(r0, r1)
            r3.updateCounterTextAppearanceAndColor()
            r3.updateCounter()
            goto L53
        L49:
            com.google.android.material.textfield.IndicatorViewController r1 = r3.indicatorViewController
            android.widget.TextView r2 = r3.counterView
            r1.removeIndicator(r2, r0)
            r0 = 0
            r3.counterView = r0
        L53:
            r3.counterEnabled = r4
        L55:
            return
    }

    public void setCounterMaxLength(int r2) {
            r1 = this;
            int r0 = r1.counterMaxLength
            if (r0 == r2) goto L13
            if (r2 <= 0) goto L9
            r1.counterMaxLength = r2
            goto Lc
        L9:
            r2 = -1
            r1.counterMaxLength = r2
        Lc:
            boolean r2 = r1.counterEnabled
            if (r2 == 0) goto L13
            r1.updateCounter()
        L13:
            return
    }

    public void setCounterOverflowTextAppearance(int r2) {
            r1 = this;
            int r0 = r1.counterOverflowTextAppearance
            if (r0 == r2) goto L9
            r1.counterOverflowTextAppearance = r2
            r1.updateCounterTextAppearanceAndColor()
        L9:
            return
    }

    public void setCounterOverflowTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.counterOverflowTextColor
            if (r0 == r2) goto L9
            r1.counterOverflowTextColor = r2
            r1.updateCounterTextAppearanceAndColor()
        L9:
            return
    }

    public void setCounterTextAppearance(int r2) {
            r1 = this;
            int r0 = r1.counterTextAppearance
            if (r0 == r2) goto L9
            r1.counterTextAppearance = r2
            r1.updateCounterTextAppearanceAndColor()
        L9:
            return
    }

    public void setCounterTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.counterTextColor
            if (r0 == r2) goto L9
            r1.counterTextColor = r2
            r1.updateCounterTextAppearanceAndColor()
        L9:
            return
    }

    public void setDefaultHintTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.defaultHintTextColor = r1
            r0.focusedTextColor = r1
            android.widget.EditText r1 = r0.editText
            if (r1 == 0) goto Lc
            r1 = 0
            r0.updateLabelState(r1)
        Lc:
            return
    }

    @Override // android.view.View
    public void setEnabled(boolean r1) {
            r0 = this;
            recursiveSetEnabled(r0, r1)
            super.setEnabled(r1)
            return
    }

    public void setEndIconActivated(boolean r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setActivated(r2)
            return
    }

    public void setEndIconCheckable(boolean r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setCheckable(r2)
            return
    }

    public void setEndIconContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setEndIconContentDescription(r2)
            return
    }

    public void setEndIconContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.CharSequence r0 = r1.getEndIconContentDescription()
            if (r0 == r2) goto Lb
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setContentDescription(r2)
        Lb:
            return
    }

    public void setEndIconDrawable(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setEndIconDrawable(r2)
            return
    }

    public void setEndIconDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setImageDrawable(r2)
            r1.refreshEndIconDrawableState()
            return
    }

    public void setEndIconMode(int r4) {
            r3 = this;
            int r0 = r3.endIconMode
            r3.endIconMode = r4
            r3.dispatchOnEndIconChanged(r0)
            if (r4 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r3.setEndIconVisible(r0)
            com.google.android.material.textfield.EndIconDelegate r0 = r3.getEndIconDelegate()
            int r1 = r3.boxBackgroundMode
            boolean r0 = r0.isBoxBackgroundModeSupported(r1)
            if (r0 == 0) goto L26
            com.google.android.material.textfield.EndIconDelegate r4 = r3.getEndIconDelegate()
            r4.initialize()
            r3.applyEndIconTint()
            return
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The current box background mode "
            r1.<init>(r2)
            int r2 = r3.boxBackgroundMode
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is not supported by the end icon mode "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setEndIconOnClickListener(android.view.View.OnClickListener r3) {
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.endIconView
            android.view.View$OnLongClickListener r1 = r2.endIconOnLongClickListener
            setIconOnClickListener(r0, r3, r1)
            return
    }

    public void setEndIconOnLongClickListener(android.view.View.OnLongClickListener r2) {
            r1 = this;
            r1.endIconOnLongClickListener = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            setIconOnLongClickListener(r0, r2)
            return
    }

    public void setEndIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.endIconTintList
            if (r0 == r2) goto Lc
            r1.endIconTintList = r2
            r2 = 1
            r1.hasEndIconTintList = r2
            r1.applyEndIconTint()
        Lc:
            return
    }

    public void setEndIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.endIconTintMode
            if (r0 == r2) goto Lc
            r1.endIconTintMode = r2
            r2 = 1
            r1.hasEndIconTintMode = r2
            r1.applyEndIconTint()
        Lc:
            return
    }

    public void setEndIconVisible(boolean r2) {
            r1 = this;
            boolean r0 = r1.isEndIconVisible()
            if (r0 == r2) goto L17
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            if (r2 == 0) goto Lc
            r2 = 0
            goto Le
        Lc:
            r2 = 8
        Le:
            r0.setVisibility(r2)
            r1.updateSuffixTextViewPadding()
            r1.updateDummyDrawables()
        L17:
            return
    }

    public void setError(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            boolean r0 = r0.isErrorEnabled()
            if (r0 != 0) goto L13
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lf
            return
        Lf:
            r0 = 1
            r1.setErrorEnabled(r0)
        L13:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1f
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.showError(r2)
            goto L24
        L1f:
            com.google.android.material.textfield.IndicatorViewController r2 = r1.indicatorViewController
            r2.hideError()
        L24:
            return
    }

    public void setErrorContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setErrorContentDescription(r2)
            return
    }

    public void setErrorEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setErrorEnabled(r2)
            return
    }

    public void setErrorIconDrawable(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setErrorIconDrawable(r2)
            r1.refreshErrorIconDrawableState()
            return
    }

    public void setErrorIconDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            r0.setImageDrawable(r2)
            if (r2 == 0) goto L11
            com.google.android.material.textfield.IndicatorViewController r2 = r1.indicatorViewController
            boolean r2 = r2.isErrorEnabled()
            if (r2 == 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            r1.setErrorIconVisible(r2)
            return
    }

    public void setErrorIconOnClickListener(android.view.View.OnClickListener r3) {
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.errorIconView
            android.view.View$OnLongClickListener r1 = r2.errorIconOnLongClickListener
            setIconOnClickListener(r0, r3, r1)
            return
    }

    public void setErrorIconOnLongClickListener(android.view.View.OnLongClickListener r2) {
            r1 = this;
            r1.errorIconOnLongClickListener = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            setIconOnLongClickListener(r0, r2)
            return
    }

    public void setErrorIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.errorIconTintList = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L15
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
        L15:
            com.google.android.material.internal.CheckableImageButton r2 = r1.errorIconView
            android.graphics.drawable.Drawable r2 = r2.getDrawable()
            if (r2 == r0) goto L22
            com.google.android.material.internal.CheckableImageButton r2 = r1.errorIconView
            r2.setImageDrawable(r0)
        L22:
            return
    }

    public void setErrorIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r2)
        L13:
            com.google.android.material.internal.CheckableImageButton r2 = r1.errorIconView
            android.graphics.drawable.Drawable r2 = r2.getDrawable()
            if (r2 == r0) goto L20
            com.google.android.material.internal.CheckableImageButton r2 = r1.errorIconView
            r2.setImageDrawable(r0)
        L20:
            return
    }

    public void setErrorTextAppearance(int r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setErrorTextAppearance(r2)
            return
    }

    public void setErrorTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setErrorViewTextColor(r2)
            return
    }

    public void setExpandedHintEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.expandedHintEnabled
            if (r0 == r2) goto La
            r1.expandedHintEnabled = r2
            r2 = 0
            r1.updateLabelState(r2)
        La:
            return
    }

    public void setHelperText(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L11
            boolean r2 = r1.isHelperTextEnabled()
            if (r2 == 0) goto L20
            r2 = 0
            r1.setHelperTextEnabled(r2)
            goto L20
        L11:
            boolean r0 = r1.isHelperTextEnabled()
            if (r0 != 0) goto L1b
            r0 = 1
            r1.setHelperTextEnabled(r0)
        L1b:
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.showHelper(r2)
        L20:
            return
    }

    public void setHelperTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setHelperTextViewTextColor(r2)
            return
    }

    public void setHelperTextEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setHelperTextEnabled(r2)
            return
    }

    public void setHelperTextTextAppearance(int r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setHelperTextAppearance(r2)
            return
    }

    public void setHint(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setHint(r2)
            return
    }

    public void setHint(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r1.hintEnabled
            if (r0 == 0) goto Lc
            r1.setHintInternal(r2)
            r2 = 2048(0x800, float:2.87E-42)
            r1.sendAccessibilityEvent(r2)
        Lc:
            return
    }

    public void setHintAnimationEnabled(boolean r1) {
            r0 = this;
            r0.hintAnimationEnabled = r1
            return
    }

    public void setHintEnabled(boolean r3) {
            r2 = this;
            boolean r0 = r2.hintEnabled
            if (r3 == r0) goto L51
            r2.hintEnabled = r3
            r0 = 0
            if (r3 != 0) goto L2b
            r3 = 0
            r2.isProvidingHint = r3
            java.lang.CharSequence r3 = r2.hint
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L27
            android.widget.EditText r3 = r2.editText
            java.lang.CharSequence r3 = r3.getHint()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L27
            android.widget.EditText r3 = r2.editText
            java.lang.CharSequence r1 = r2.hint
            r3.setHint(r1)
        L27:
            r2.setHintInternal(r0)
            goto L4a
        L2b:
            android.widget.EditText r3 = r2.editText
            java.lang.CharSequence r3 = r3.getHint()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L47
            java.lang.CharSequence r1 = r2.hint
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L42
            r2.setHint(r3)
        L42:
            android.widget.EditText r3 = r2.editText
            r3.setHint(r0)
        L47:
            r3 = 1
            r2.isProvidingHint = r3
        L4a:
            android.widget.EditText r3 = r2.editText
            if (r3 == 0) goto L51
            r2.updateInputLayoutMargins()
        L51:
            return
    }

    public void setHintTextAppearance(int r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setCollapsedTextAppearance(r2)
            com.google.android.material.internal.CollapsingTextHelper r2 = r1.collapsingTextHelper
            android.content.res.ColorStateList r2 = r2.getCollapsedTextColor()
            r1.focusedTextColor = r2
            android.widget.EditText r2 = r1.editText
            if (r2 == 0) goto L18
            r2 = 0
            r1.updateLabelState(r2)
            r1.updateInputLayoutMargins()
        L18:
            return
    }

    public void setHintTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.focusedTextColor
            if (r0 == r2) goto L17
            android.content.res.ColorStateList r0 = r1.defaultHintTextColor
            if (r0 != 0) goto Ld
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setCollapsedTextColor(r2)
        Ld:
            r1.focusedTextColor = r2
            android.widget.EditText r2 = r1.editText
            if (r2 == 0) goto L17
            r2 = 0
            r1.updateLabelState(r2)
        L17:
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setPasswordVisibilityToggleContentDescription(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setContentDescription(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleDrawable(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setPasswordVisibilityToggleDrawable(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setImageDrawable(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean r3) {
            r2 = this;
            if (r3 == 0) goto Lb
            int r0 = r2.endIconMode
            r1 = 1
            if (r0 == r1) goto Lb
            r2.setEndIconMode(r1)
            goto L11
        Lb:
            if (r3 != 0) goto L11
            r3 = 0
            r2.setEndIconMode(r3)
        L11:
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.endIconTintList = r1
            r1 = 1
            r0.hasEndIconTintList = r1
            r0.applyEndIconTint()
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.endIconTintMode = r1
            r1 = 1
            r0.hasEndIconTintMode = r1
            r0.applyEndIconTint()
            return
    }

    public void setPlaceholderText(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r1.placeholderEnabled
            if (r0 == 0) goto Lf
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lf
            r2 = 0
            r1.setPlaceholderTextEnabled(r2)
            goto L19
        Lf:
            boolean r0 = r1.placeholderEnabled
            if (r0 != 0) goto L17
            r0 = 1
            r1.setPlaceholderTextEnabled(r0)
        L17:
            r1.placeholderText = r2
        L19:
            r1.updatePlaceholderText()
            return
    }

    public void setPlaceholderTextAppearance(int r2) {
            r1 = this;
            r1.placeholderTextAppearance = r2
            android.widget.TextView r0 = r1.placeholderTextView
            if (r0 == 0) goto L9
            androidx.core.widget.TextViewCompat.setTextAppearance(r0, r2)
        L9:
            return
    }

    public void setPlaceholderTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.placeholderTextColor
            if (r0 == r2) goto Lf
            r1.placeholderTextColor = r2
            android.widget.TextView r0 = r1.placeholderTextView
            if (r0 == 0) goto Lf
            if (r2 == 0) goto Lf
            r0.setTextColor(r2)
        Lf:
            return
    }

    public void setPrefixText(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r0 = 0
            goto L9
        L8:
            r0 = r2
        L9:
            r1.prefixText = r0
            android.widget.TextView r0 = r1.prefixTextView
            r0.setText(r2)
            r1.updatePrefixTextVisibility()
            return
    }

    public void setPrefixTextAppearance(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.prefixTextView
            androidx.core.widget.TextViewCompat.setTextAppearance(r0, r2)
            return
    }

    public void setPrefixTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.widget.TextView r0 = r1.prefixTextView
            r0.setTextColor(r2)
            return
    }

    public void setStartIconCheckable(boolean r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            r0.setCheckable(r2)
            return
    }

    public void setStartIconContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setStartIconContentDescription(r2)
            return
    }

    public void setStartIconContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.CharSequence r0 = r1.getStartIconContentDescription()
            if (r0 == r2) goto Lb
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            r0.setContentDescription(r2)
        Lb:
            return
    }

    public void setStartIconDrawable(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setStartIconDrawable(r2)
            return
    }

    public void setStartIconDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            r0.setImageDrawable(r2)
            if (r2 == 0) goto Lf
            r2 = 1
            r1.setStartIconVisible(r2)
            r1.refreshStartIconDrawableState()
            goto L1d
        Lf:
            r2 = 0
            r1.setStartIconVisible(r2)
            r2 = 0
            r1.setStartIconOnClickListener(r2)
            r1.setStartIconOnLongClickListener(r2)
            r1.setStartIconContentDescription(r2)
        L1d:
            return
    }

    public void setStartIconOnClickListener(android.view.View.OnClickListener r3) {
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.startIconView
            android.view.View$OnLongClickListener r1 = r2.startIconOnLongClickListener
            setIconOnClickListener(r0, r3, r1)
            return
    }

    public void setStartIconOnLongClickListener(android.view.View.OnLongClickListener r2) {
            r1 = this;
            r1.startIconOnLongClickListener = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            setIconOnLongClickListener(r0, r2)
            return
    }

    public void setStartIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.startIconTintList
            if (r0 == r2) goto Lc
            r1.startIconTintList = r2
            r2 = 1
            r1.hasStartIconTintList = r2
            r1.applyStartIconTint()
        Lc:
            return
    }

    public void setStartIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.startIconTintMode
            if (r0 == r2) goto Lc
            r1.startIconTintMode = r2
            r2 = 1
            r1.hasStartIconTintMode = r2
            r1.applyStartIconTint()
        Lc:
            return
    }

    public void setStartIconVisible(boolean r2) {
            r1 = this;
            boolean r0 = r1.isStartIconVisible()
            if (r0 == r2) goto L17
            com.google.android.material.internal.CheckableImageButton r0 = r1.startIconView
            if (r2 == 0) goto Lc
            r2 = 0
            goto Le
        Lc:
            r2 = 8
        Le:
            r0.setVisibility(r2)
            r1.updatePrefixTextViewPadding()
            r1.updateDummyDrawables()
        L17:
            return
    }

    public void setSuffixText(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r0 = 0
            goto L9
        L8:
            r0 = r2
        L9:
            r1.suffixText = r0
            android.widget.TextView r0 = r1.suffixTextView
            r0.setText(r2)
            r1.updateSuffixTextVisibility()
            return
    }

    public void setSuffixTextAppearance(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.suffixTextView
            androidx.core.widget.TextViewCompat.setTextAppearance(r0, r2)
            return
    }

    public void setSuffixTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.widget.TextView r0 = r1.suffixTextView
            r0.setTextColor(r2)
            return
    }

    void setTextAppearanceCompatWithErrorFallback(android.widget.TextView r3, int r4) {
            r2 = this;
            r0 = 1
            androidx.core.widget.TextViewCompat.setTextAppearance(r3, r4)     // Catch: java.lang.Exception -> L14
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L14
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L14
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L12
            goto L14
        L12:
            r4 = 0
            r0 = r4
        L14:
            if (r0 == 0) goto L28
            int r4 = com.google.android.material.C0479R.style.TextAppearance_AppCompat_Caption
            androidx.core.widget.TextViewCompat.setTextAppearance(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = com.google.android.material.C0479R.color.design_error
            int r4 = androidx.core.content.ContextCompat.getColor(r4, r0)
            r3.setTextColor(r4)
        L28:
            return
    }

    public void setTextInputAccessibilityDelegate(com.google.android.material.textfield.TextInputLayout.AccessibilityDelegate r2) {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            if (r0 == 0) goto L7
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r2)
        L7:
            return
    }

    public void setTypeface(android.graphics.Typeface r2) {
            r1 = this;
            android.graphics.Typeface r0 = r1.typeface
            if (r2 == r0) goto L17
            r1.typeface = r2
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setTypefaces(r2)
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setTypefaces(r2)
            android.widget.TextView r0 = r1.counterView
            if (r0 == 0) goto L17
            r0.setTypeface(r2)
        L17:
            return
    }

    void updateCounter(int r9) {
            r8 = this;
            boolean r0 = r8.counterOverflowed
            int r1 = r8.counterMaxLength
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L1a
            android.widget.TextView r1 = r8.counterView
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r1.setText(r9)
            android.widget.TextView r9 = r8.counterView
            r1 = 0
            r9.setContentDescription(r1)
            r8.counterOverflowed = r3
            goto L5e
        L1a:
            r2 = 1
            if (r9 <= r1) goto L1f
            r1 = r2
            goto L20
        L1f:
            r1 = r3
        L20:
            r8.counterOverflowed = r1
            android.content.Context r1 = r8.getContext()
            android.widget.TextView r4 = r8.counterView
            int r5 = r8.counterMaxLength
            boolean r6 = r8.counterOverflowed
            updateCounterContentDescription(r1, r4, r9, r5, r6)
            boolean r1 = r8.counterOverflowed
            if (r0 == r1) goto L36
            r8.updateCounterTextAppearanceAndColor()
        L36:
            androidx.core.text.BidiFormatter r1 = androidx.core.text.BidiFormatter.getInstance()
            android.widget.TextView r4 = r8.counterView
            android.content.Context r5 = r8.getContext()
            int r6 = com.google.android.material.C0479R.string.character_counter_pattern
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7[r3] = r9
            int r9 = r8.counterMaxLength
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7[r2] = r9
            java.lang.String r9 = r5.getString(r6, r7)
            java.lang.String r9 = r1.unicodeWrap(r9)
            r4.setText(r9)
        L5e:
            android.widget.EditText r9 = r8.editText
            if (r9 == 0) goto L6f
            boolean r9 = r8.counterOverflowed
            if (r0 == r9) goto L6f
            r8.updateLabelState(r3)
            r8.updateTextInputBoxState()
            r8.updateEditTextBackground()
        L6f:
            return
    }

    void updateEditTextBackground() {
            r3 = this;
            android.widget.EditText r0 = r3.editText
            if (r0 == 0) goto L50
            int r1 = r3.boxBackgroundMode
            if (r1 == 0) goto L9
            goto L50
        L9:
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L10
            return
        L10:
            boolean r1 = androidx.appcompat.widget.DrawableUtils.canSafelyMutateDrawable(r0)
            if (r1 == 0) goto L1a
            android.graphics.drawable.Drawable r0 = r0.mutate()
        L1a:
            com.google.android.material.textfield.IndicatorViewController r1 = r3.indicatorViewController
            boolean r1 = r1.errorShouldBeShown()
            if (r1 == 0) goto L32
            com.google.android.material.textfield.IndicatorViewController r1 = r3.indicatorViewController
            int r1 = r1.getErrorViewCurrentTextColor()
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r1 = androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(r1, r2)
            r0.setColorFilter(r1)
            goto L50
        L32:
            boolean r1 = r3.counterOverflowed
            if (r1 == 0) goto L48
            android.widget.TextView r1 = r3.counterView
            if (r1 == 0) goto L48
            int r1 = r1.getCurrentTextColor()
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r1 = androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(r1, r2)
            r0.setColorFilter(r1)
            goto L50
        L48:
            androidx.core.graphics.drawable.DrawableCompat.clearColorFilter(r0)
            android.widget.EditText r0 = r3.editText
            r0.refreshDrawableState()
        L50:
            return
    }

    void updateLabelState(boolean r2) {
            r1 = this;
            r0 = 0
            r1.updateLabelState(r2, r0)
            return
    }

    void updateTextInputBoxState() {
            r6 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.boxBackground
            if (r0 == 0) goto Lee
            int r0 = r6.boxBackgroundMode
            if (r0 != 0) goto La
            goto Lee
        La:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1f
            android.widget.EditText r0 = r6.editText
            if (r0 == 0) goto L1d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L33
            android.widget.EditText r3 = r6.editText
            if (r3 == 0) goto L31
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L31
            goto L33
        L31:
            r3 = r1
            goto L34
        L33:
            r3 = r2
        L34:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L3f
            int r4 = r6.disabledColor
            r6.boxStrokeColor = r4
            goto L81
        L3f:
            com.google.android.material.textfield.IndicatorViewController r4 = r6.indicatorViewController
            boolean r4 = r4.errorShouldBeShown()
            if (r4 == 0) goto L58
            android.content.res.ColorStateList r4 = r6.strokeErrorColor
            if (r4 == 0) goto L4f
            r6.updateStrokeErrorColor(r0, r3)
            goto L81
        L4f:
            com.google.android.material.textfield.IndicatorViewController r4 = r6.indicatorViewController
            int r4 = r4.getErrorViewCurrentTextColor()
            r6.boxStrokeColor = r4
            goto L81
        L58:
            boolean r4 = r6.counterOverflowed
            if (r4 == 0) goto L6f
            android.widget.TextView r4 = r6.counterView
            if (r4 == 0) goto L6f
            android.content.res.ColorStateList r5 = r6.strokeErrorColor
            if (r5 == 0) goto L68
            r6.updateStrokeErrorColor(r0, r3)
            goto L81
        L68:
            int r4 = r4.getCurrentTextColor()
            r6.boxStrokeColor = r4
            goto L81
        L6f:
            if (r0 == 0) goto L76
            int r4 = r6.focusedStrokeColor
            r6.boxStrokeColor = r4
            goto L81
        L76:
            if (r3 == 0) goto L7d
            int r4 = r6.hoveredStrokeColor
            r6.boxStrokeColor = r4
            goto L81
        L7d:
            int r4 = r6.defaultStrokeColor
            r6.boxStrokeColor = r4
        L81:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L98
            com.google.android.material.textfield.IndicatorViewController r4 = r6.indicatorViewController
            boolean r4 = r4.isErrorEnabled()
            if (r4 == 0) goto L98
            com.google.android.material.textfield.IndicatorViewController r4 = r6.indicatorViewController
            boolean r4 = r4.errorShouldBeShown()
            if (r4 == 0) goto L98
            r1 = r2
        L98:
            r6.setErrorIconVisible(r1)
            r6.refreshErrorIconDrawableState()
            r6.refreshStartIconDrawableState()
            r6.refreshEndIconDrawableState()
            com.google.android.material.textfield.EndIconDelegate r1 = r6.getEndIconDelegate()
            boolean r1 = r1.shouldTintIconOnError()
            if (r1 == 0) goto Lb7
            com.google.android.material.textfield.IndicatorViewController r1 = r6.indicatorViewController
            boolean r1 = r1.errorShouldBeShown()
            r6.tintEndIconOnError(r1)
        Lb7:
            if (r0 == 0) goto Lc4
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto Lc4
            int r1 = r6.boxStrokeWidthFocusedPx
            r6.boxStrokeWidthPx = r1
            goto Lc8
        Lc4:
            int r1 = r6.boxStrokeWidthDefaultPx
            r6.boxStrokeWidthPx = r1
        Lc8:
            int r1 = r6.boxBackgroundMode
            if (r1 != r2) goto Leb
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto Ld7
            int r0 = r6.disabledFilledBackgroundColor
            r6.boxBackgroundColor = r0
            goto Leb
        Ld7:
            if (r3 == 0) goto Le0
            if (r0 != 0) goto Le0
            int r0 = r6.hoveredFilledBackgroundColor
            r6.boxBackgroundColor = r0
            goto Leb
        Le0:
            if (r0 == 0) goto Le7
            int r0 = r6.focusedFilledBackgroundColor
            r6.boxBackgroundColor = r0
            goto Leb
        Le7:
            int r0 = r6.defaultFilledBackgroundColor
            r6.boxBackgroundColor = r0
        Leb:
            r6.applyBoxAttributes()
        Lee:
            return
    }
}
