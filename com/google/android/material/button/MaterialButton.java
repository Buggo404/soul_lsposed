package com.google.android.material.button;

/* loaded from: classes.dex */
public class MaterialButton extends androidx.appcompat.widget.AppCompatButton implements android.widget.Checkable, com.google.android.material.shape.Shapeable {
    private static final int[] CHECKABLE_STATE_SET = null;
    private static final int[] CHECKED_STATE_SET = null;
    private static final int DEF_STYLE_RES = 0;
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;
    private static final java.lang.String LOG_TAG = "MaterialButton";
    private boolean broadcasting;
    private boolean checked;
    private android.graphics.drawable.Drawable icon;
    private int iconGravity;
    private int iconLeft;
    private int iconPadding;
    private int iconSize;
    private android.content.res.ColorStateList iconTint;
    private android.graphics.PorterDuff.Mode iconTintMode;
    private int iconTop;
    private final com.google.android.material.button.MaterialButtonHelper materialButtonHelper;
    private final java.util.LinkedHashSet<com.google.android.material.button.MaterialButton.OnCheckedChangeListener> onCheckedChangeListeners;
    private com.google.android.material.button.MaterialButton.OnPressedChangeListener onPressedChangeListenerInternal;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(com.google.android.material.button.MaterialButton r1, boolean r2);
    }

    interface OnPressedChangeListener {
        void onPressedChanged(com.google.android.material.button.MaterialButton r1, boolean r2);
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.button.MaterialButton.SavedState> CREATOR = null;
        boolean checked;


        static {
                com.google.android.material.button.MaterialButton$SavedState$1 r0 = new com.google.android.material.button.MaterialButton$SavedState$1
                r0.<init>()
                com.google.android.material.button.MaterialButton.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                if (r2 != 0) goto Lc
                java.lang.Class r2 = r0.getClass()
                r2.getClassLoader()
            Lc:
                r0.readFromParcel(r1)
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void readFromParcel(android.os.Parcel r2) {
                r1 = this;
                int r2 = r2.readInt()
                r0 = 1
                if (r2 != r0) goto L8
                goto L9
            L8:
                r0 = 0
            L9:
                r1.checked = r0
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.checked
                r1.writeInt(r2)
                return
        }
    }

    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16842911(0x101009f, float:2.3694004E-38)
            r3 = 0
            r1[r3] = r2
            com.google.android.material.button.MaterialButton.CHECKABLE_STATE_SET = r1
            int[] r0 = new int[r0]
            r1 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r3] = r1
            com.google.android.material.button.MaterialButton.CHECKED_STATE_SET = r0
            int r0 = com.google.android.material.C0479R.style.Widget_MaterialComponents_Button
            com.google.android.material.button.MaterialButton.DEF_STYLE_RES = r0
            return
    }

    public MaterialButton(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.materialButtonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.DEF_STYLE_RES
            android.content.Context r9 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.onCheckedChangeListeners = r9
            r9 = 0
            r8.checked = r9
            r8.broadcasting = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = com.google.android.material.C0479R.styleable.MaterialButton
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.C0479R.styleable.MaterialButton_iconPadding
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.iconPadding = r1
            int r1 = com.google.android.material.C0479R.styleable.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.ViewUtils.parseTintMode(r1, r2)
            r8.iconTintMode = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.google.android.material.C0479R.styleable.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r1, r0, r2)
            r8.iconTint = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.google.android.material.C0479R.styleable.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = com.google.android.material.resources.MaterialResources.getDrawable(r1, r0, r2)
            r8.icon = r1
            int r1 = com.google.android.material.C0479R.styleable.MaterialButton_iconGravity
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.iconGravity = r1
            int r1 = com.google.android.material.C0479R.styleable.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.iconSize = r1
            com.google.android.material.shape.ShapeAppearanceModel$Builder r10 = com.google.android.material.shape.ShapeAppearanceModel.builder(r7, r10, r11, r6)
            com.google.android.material.shape.ShapeAppearanceModel r10 = r10.build()
            com.google.android.material.button.MaterialButtonHelper r11 = new com.google.android.material.button.MaterialButtonHelper
            r11.<init>(r8, r10)
            r8.materialButtonHelper = r11
            r11.loadFromAttributes(r0)
            r0.recycle()
            int r10 = r8.iconPadding
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.icon
            if (r10 == 0) goto L84
            r9 = r2
        L84:
            r8.updateIcon(r9)
            return
    }

    private java.lang.String getA11yClassName() {
            r1 = this;
            boolean r0 = r1.isCheckable()
            if (r0 == 0) goto L9
            java.lang.Class<android.widget.CompoundButton> r0 = android.widget.CompoundButton.class
            goto Lb
        L9:
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
        Lb:
            java.lang.String r0 = r0.getName()
            return r0
    }

    private int getTextHeight() {
            r5 = this;
            android.text.TextPaint r0 = r5.getPaint()
            java.lang.CharSequence r1 = r5.getText()
            java.lang.String r1 = r1.toString()
            android.text.method.TransformationMethod r2 = r5.getTransformationMethod()
            if (r2 == 0) goto L1e
            android.text.method.TransformationMethod r2 = r5.getTransformationMethod()
            java.lang.CharSequence r1 = r2.getTransformation(r1, r5)
            java.lang.String r1 = r1.toString()
        L1e:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r3 = 0
            int r4 = r1.length()
            r0.getTextBounds(r1, r3, r4, r2)
            int r0 = r2.height()
            android.text.Layout r1 = r5.getLayout()
            int r1 = r1.getHeight()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    private int getTextWidth() {
            r3 = this;
            android.text.TextPaint r0 = r3.getPaint()
            java.lang.CharSequence r1 = r3.getText()
            java.lang.String r1 = r1.toString()
            android.text.method.TransformationMethod r2 = r3.getTransformationMethod()
            if (r2 == 0) goto L1e
            android.text.method.TransformationMethod r2 = r3.getTransformationMethod()
            java.lang.CharSequence r1 = r2.getTransformation(r1, r3)
            java.lang.String r1 = r1.toString()
        L1e:
            float r0 = r0.measureText(r1)
            int r0 = (int) r0
            android.text.Layout r1 = r3.getLayout()
            int r1 = r1.getEllipsizedWidth()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    private boolean isIconEnd() {
            r2 = this;
            int r0 = r2.iconGravity
            r1 = 3
            if (r0 == r1) goto Lb
            r1 = 4
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    private boolean isIconStart() {
            r3 = this;
            int r0 = r3.iconGravity
            r1 = 1
            if (r0 == r1) goto La
            r2 = 2
            if (r0 != r2) goto L9
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    private boolean isIconTop() {
            r2 = this;
            int r0 = r2.iconGravity
            r1 = 16
            if (r0 == r1) goto Ld
            r1 = 32
            if (r0 != r1) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    private boolean isLayoutRTL() {
            r2 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    private boolean isUsingOriginalBackground() {
            r1 = this;
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            if (r0 == 0) goto Lc
            boolean r0 = r0.isBackgroundOverwritten()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private void resetIconDrawable() {
            r2 = this;
            boolean r0 = r2.isIconStart()
            r1 = 0
            if (r0 == 0) goto Ld
            android.graphics.drawable.Drawable r0 = r2.icon
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r2, r0, r1, r1, r1)
            goto L24
        Ld:
            boolean r0 = r2.isIconEnd()
            if (r0 == 0) goto L19
            android.graphics.drawable.Drawable r0 = r2.icon
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r2, r1, r1, r0, r1)
            goto L24
        L19:
            boolean r0 = r2.isIconTop()
            if (r0 == 0) goto L24
            android.graphics.drawable.Drawable r0 = r2.icon
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r2, r1, r0, r1, r1)
        L24:
            return
    }

    private void updateIcon(boolean r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.icon
            if (r0 == 0) goto L3d
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r5.icon = r0
            android.content.res.ColorStateList r1 = r5.iconTint
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
            android.graphics.PorterDuff$Mode r0 = r5.iconTintMode
            if (r0 == 0) goto L1c
            android.graphics.drawable.Drawable r1 = r5.icon
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r1, r0)
        L1c:
            int r0 = r5.iconSize
            if (r0 == 0) goto L21
            goto L27
        L21:
            android.graphics.drawable.Drawable r0 = r5.icon
            int r0 = r0.getIntrinsicWidth()
        L27:
            int r1 = r5.iconSize
            if (r1 == 0) goto L2c
            goto L32
        L2c:
            android.graphics.drawable.Drawable r1 = r5.icon
            int r1 = r1.getIntrinsicHeight()
        L32:
            android.graphics.drawable.Drawable r2 = r5.icon
            int r3 = r5.iconLeft
            int r4 = r5.iconTop
            int r0 = r0 + r3
            int r1 = r1 + r4
            r2.setBounds(r3, r4, r0, r1)
        L3d:
            if (r6 == 0) goto L43
            r5.resetIconDrawable()
            return
        L43:
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(r5)
            r0 = 0
            r1 = r6[r0]
            r2 = 1
            r3 = r6[r2]
            r4 = 2
            r6 = r6[r4]
            boolean r4 = r5.isIconStart()
            if (r4 == 0) goto L5a
            android.graphics.drawable.Drawable r4 = r5.icon
            if (r1 != r4) goto L6e
        L5a:
            boolean r1 = r5.isIconEnd()
            if (r1 == 0) goto L64
            android.graphics.drawable.Drawable r1 = r5.icon
            if (r6 != r1) goto L6e
        L64:
            boolean r6 = r5.isIconTop()
            if (r6 == 0) goto L6f
            android.graphics.drawable.Drawable r6 = r5.icon
            if (r3 == r6) goto L6f
        L6e:
            r0 = r2
        L6f:
            if (r0 == 0) goto L74
            r5.resetIconDrawable()
        L74:
            return
    }

    private void updateIconPosition(int r5, int r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.icon
            if (r0 == 0) goto L9e
            android.text.Layout r0 = r4.getLayout()
            if (r0 != 0) goto Lc
            goto L9e
        Lc:
            boolean r0 = r4.isIconStart()
            r1 = 0
            if (r0 != 0) goto L57
            boolean r0 = r4.isIconEnd()
            if (r0 == 0) goto L1a
            goto L57
        L1a:
            boolean r5 = r4.isIconTop()
            if (r5 == 0) goto L98
            r4.iconLeft = r1
            int r5 = r4.iconGravity
            r0 = 16
            if (r5 != r0) goto L2e
            r4.iconTop = r1
            r4.updateIcon(r1)
            return
        L2e:
            int r5 = r4.iconSize
            if (r5 != 0) goto L38
            android.graphics.drawable.Drawable r5 = r4.icon
            int r5 = r5.getIntrinsicHeight()
        L38:
            int r0 = r4.getTextHeight()
            int r6 = r6 - r0
            int r0 = r4.getPaddingTop()
            int r6 = r6 - r0
            int r6 = r6 - r5
            int r5 = r4.iconPadding
            int r6 = r6 - r5
            int r5 = r4.getPaddingBottom()
            int r6 = r6 - r5
            int r6 = r6 / 2
            int r5 = r4.iconTop
            if (r5 == r6) goto L98
            r4.iconTop = r6
            r4.updateIcon(r1)
            goto L98
        L57:
            r4.iconTop = r1
            int r6 = r4.iconGravity
            r0 = 1
            if (r6 == r0) goto L99
            r2 = 3
            if (r6 != r2) goto L62
            goto L99
        L62:
            int r6 = r4.iconSize
            if (r6 != 0) goto L6c
            android.graphics.drawable.Drawable r6 = r4.icon
            int r6 = r6.getIntrinsicWidth()
        L6c:
            int r2 = r4.getTextWidth()
            int r5 = r5 - r2
            int r2 = androidx.core.view.ViewCompat.getPaddingEnd(r4)
            int r5 = r5 - r2
            int r5 = r5 - r6
            int r6 = r4.iconPadding
            int r5 = r5 - r6
            int r6 = androidx.core.view.ViewCompat.getPaddingStart(r4)
            int r5 = r5 - r6
            int r5 = r5 / 2
            boolean r6 = r4.isLayoutRTL()
            int r2 = r4.iconGravity
            r3 = 4
            if (r2 != r3) goto L8b
            goto L8c
        L8b:
            r0 = r1
        L8c:
            if (r6 == r0) goto L8f
            int r5 = -r5
        L8f:
            int r6 = r4.iconLeft
            if (r6 == r5) goto L98
            r4.iconLeft = r5
            r4.updateIcon(r1)
        L98:
            return
        L99:
            r4.iconLeft = r1
            r4.updateIcon(r1)
        L9e:
            return
    }

    public void addOnCheckedChangeListener(com.google.android.material.button.MaterialButton.OnCheckedChangeListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButton$OnCheckedChangeListener> r0 = r1.onCheckedChangeListeners
            r0.add(r2)
            return
    }

    public void clearOnCheckedChangeListeners() {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButton$OnCheckedChangeListener> r0 = r1.onCheckedChangeListeners
            r0.clear()
            return
    }

    @Override // android.view.View
    public android.content.res.ColorStateList getBackgroundTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.getSupportBackgroundTintList()
            return r0
    }

    @Override // android.view.View
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.getSupportBackgroundTintMode()
            return r0
    }

    public int getCornerRadius() {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Ld
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            int r0 = r0.getCornerRadius()
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public android.graphics.drawable.Drawable getIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.icon
            return r0
    }

    public int getIconGravity() {
            r1 = this;
            int r0 = r1.iconGravity
            return r0
    }

    public int getIconPadding() {
            r1 = this;
            int r0 = r1.iconPadding
            return r0
    }

    public int getIconSize() {
            r1 = this;
            int r0 = r1.iconSize
            return r0
    }

    public android.content.res.ColorStateList getIconTint() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.iconTint
            return r0
    }

    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.iconTintMode
            return r0
    }

    public int getInsetBottom() {
            r1 = this;
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            int r0 = r0.getInsetBottom()
            return r0
    }

    public int getInsetTop() {
            r1 = this;
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            int r0 = r0.getInsetTop()
            return r0
    }

    public android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Ld
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            android.content.res.ColorStateList r0 = r0.getRippleColor()
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Override // com.google.android.material.shape.Shapeable
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
            r2 = this;
            boolean r0 = r2.isUsingOriginalBackground()
            if (r0 == 0) goto Ld
            com.google.android.material.button.MaterialButtonHelper r0 = r2.materialButtonHelper
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getShapeAppearanceModel()
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background."
            r0.<init>(r1)
            throw r0
    }

    public android.content.res.ColorStateList getStrokeColor() {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Ld
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            android.content.res.ColorStateList r0 = r0.getStrokeColor()
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public int getStrokeWidth() {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Ld
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            int r0 = r0.getStrokeWidth()
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Ld
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            android.content.res.ColorStateList r0 = r0.getSupportBackgroundTintList()
            return r0
        Ld:
            android.content.res.ColorStateList r0 = super.getSupportBackgroundTintList()
            return r0
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Ld
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            android.graphics.PorterDuff$Mode r0 = r0.getSupportBackgroundTintMode()
            return r0
        Ld:
            android.graphics.PorterDuff$Mode r0 = super.getSupportBackgroundTintMode()
            return r0
    }

    public boolean isCheckable() {
            r1 = this;
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            if (r0 == 0) goto Lc
            boolean r0 = r0.isCheckable()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
            r1 = this;
            boolean r0 = r1.checked
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto L12
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.getMaterialShapeDrawable()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r1, r0)
        L12:
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 2
            int[] r2 = super.onCreateDrawableState(r2)
            boolean r0 = r1.isCheckable()
            if (r0 == 0) goto L11
            int[] r0 = com.google.android.material.button.MaterialButton.CHECKABLE_STATE_SET
            mergeDrawableStates(r2, r0)
        L11:
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L1c
            int[] r0 = com.google.android.material.button.MaterialButton.CHECKED_STATE_SET
            mergeDrawableStates(r2, r0)
        L1c:
            return r2
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = r1.getA11yClassName()
            r2.setClassName(r0)
            boolean r0 = r1.isChecked()
            r2.setChecked(r0)
            return
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.String r0 = r1.getA11yClassName()
            r2.setClassName(r0)
            boolean r0 = r1.isCheckable()
            r2.setCheckable(r0)
            boolean r0 = r1.isChecked()
            r2.setChecked(r0)
            boolean r0 = r1.isClickable()
            r2.setClickable(r0)
            return
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.button.MaterialButton.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.button.MaterialButton$SavedState r2 = (com.google.android.material.button.MaterialButton.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.checked
            r1.setChecked(r2)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.button.MaterialButton$SavedState r1 = new com.google.android.material.button.MaterialButton$SavedState
            r1.<init>(r0)
            boolean r0 = r2.checked
            r1.checked = r0
            return r1
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r0.updateIconPosition(r1, r2)
            return
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            int r1 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            r0.updateIconPosition(r1, r2)
            return
    }

    @Override // android.view.View
    public boolean performClick() {
            r1 = this;
            r1.toggle()
            boolean r0 = super.performClick()
            return r0
    }

    public void removeOnCheckedChangeListener(com.google.android.material.button.MaterialButton.OnCheckedChangeListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButton$OnCheckedChangeListener> r0 = r1.onCheckedChangeListeners
            r0.remove(r2)
            return
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.setBackgroundDrawable(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lc
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setBackgroundColor(r2)
            goto Lf
        Lc:
            super.setBackgroundColor(r2)
        Lf:
            return
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            boolean r0 = r2.isUsingOriginalBackground()
            if (r0 == 0) goto L28
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            if (r3 == r0) goto L1c
            java.lang.String r0 = "MaterialButton"
            java.lang.String r1 = "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled"
            android.util.Log.w(r0, r1)
            com.google.android.material.button.MaterialButtonHelper r0 = r2.materialButtonHelper
            r0.setBackgroundOverwritten()
            super.setBackgroundDrawable(r3)
            goto L2b
        L1c:
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            int[] r3 = r3.getState()
            r0.setState(r3)
            goto L2b
        L28:
            super.setBackgroundDrawable(r3)
        L2b:
            return
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setBackgroundDrawable(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.setSupportBackgroundTintList(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.setSupportBackgroundTintMode(r1)
            return
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lb
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setCheckable(r2)
        Lb:
            return
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r3) {
            r2 = this;
            boolean r0 = r2.isCheckable()
            if (r0 == 0) goto L38
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L38
            boolean r0 = r2.checked
            if (r0 == r3) goto L38
            r2.checked = r3
            r2.refreshDrawableState()
            boolean r3 = r2.broadcasting
            if (r3 == 0) goto L1a
            return
        L1a:
            r3 = 1
            r2.broadcasting = r3
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButton$OnCheckedChangeListener> r3 = r2.onCheckedChangeListeners
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r3.next()
            com.google.android.material.button.MaterialButton$OnCheckedChangeListener r0 = (com.google.android.material.button.MaterialButton.OnCheckedChangeListener) r0
            boolean r1 = r2.checked
            r0.onCheckedChanged(r2, r1)
            goto L23
        L35:
            r3 = 0
            r2.broadcasting = r3
        L38:
            return
    }

    public void setCornerRadius(int r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lb
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setCornerRadius(r2)
        Lb:
            return
    }

    public void setCornerRadiusResource(int r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto L11
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setCornerRadius(r2)
        L11:
            return
    }

    @Override // android.view.View
    public void setElevation(float r2) {
            r1 = this;
            super.setElevation(r2)
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto L12
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.getMaterialShapeDrawable()
            r0.setElevation(r2)
        L12:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.icon
            if (r0 == r2) goto L15
            r1.icon = r2
            r2 = 1
            r1.updateIcon(r2)
            int r2 = r1.getMeasuredWidth()
            int r0 = r1.getMeasuredHeight()
            r1.updateIconPosition(r2, r0)
        L15:
            return
    }

    public void setIconGravity(int r2) {
            r1 = this;
            int r0 = r1.iconGravity
            if (r0 == r2) goto L11
            r1.iconGravity = r2
            int r2 = r1.getMeasuredWidth()
            int r0 = r1.getMeasuredHeight()
            r1.updateIconPosition(r2, r0)
        L11:
            return
    }

    public void setIconPadding(int r2) {
            r1 = this;
            int r0 = r1.iconPadding
            if (r0 == r2) goto L9
            r1.iconPadding = r2
            r1.setCompoundDrawablePadding(r2)
        L9:
            return
    }

    public void setIconResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setIcon(r2)
            return
    }

    public void setIconSize(int r2) {
            r1 = this;
            if (r2 < 0) goto Ld
            int r0 = r1.iconSize
            if (r0 == r2) goto Lc
            r1.iconSize = r2
            r2 = 1
            r1.updateIcon(r2)
        Lc:
            return
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "iconSize cannot be less than 0"
            r2.<init>(r0)
            throw r2
    }

    public void setIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.iconTint
            if (r0 == r2) goto La
            r1.iconTint = r2
            r2 = 0
            r1.updateIcon(r2)
        La:
            return
    }

    public void setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.iconTintMode
            if (r0 == r2) goto La
            r1.iconTintMode = r2
            r2 = 0
            r1.updateIcon(r2)
        La:
            return
    }

    public void setIconTintResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setIconTint(r2)
            return
    }

    public void setInsetBottom(int r2) {
            r1 = this;
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setInsetBottom(r2)
            return
    }

    public void setInsetTop(int r2) {
            r1 = this;
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setInsetTop(r2)
            return
    }

    void setInternalBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            return
    }

    void setOnPressedChangeListenerInternal(com.google.android.material.button.MaterialButton.OnPressedChangeListener r1) {
            r0 = this;
            r0.onPressedChangeListenerInternal = r1
            return
    }

    @Override // android.view.View
    public void setPressed(boolean r2) {
            r1 = this;
            com.google.android.material.button.MaterialButton$OnPressedChangeListener r0 = r1.onPressedChangeListenerInternal
            if (r0 == 0) goto L7
            r0.onPressedChanged(r1, r2)
        L7:
            super.setPressed(r2)
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lb
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setRippleColor(r2)
        Lb:
            return
    }

    public void setRippleColorResource(int r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto L11
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setRippleColor(r2)
        L11:
            return
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lc
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setShapeAppearanceModel(r2)
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background."
            r2.<init>(r0)
            throw r2
    }

    void setShouldDrawSurfaceColorStroke(boolean r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lb
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setShouldDrawSurfaceColorStroke(r2)
        Lb:
            return
    }

    public void setStrokeColor(android.content.res.ColorStateList r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lb
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setStrokeColor(r2)
        Lb:
            return
    }

    public void setStrokeColorResource(int r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto L11
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setStrokeColor(r2)
        L11:
            return
    }

    public void setStrokeWidth(int r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lb
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setStrokeWidth(r2)
        Lb:
            return
    }

    public void setStrokeWidthResource(int r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto L11
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setStrokeWidth(r2)
        L11:
            return
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lc
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setSupportBackgroundTintList(r2)
            goto Lf
        Lc:
            super.setSupportBackgroundTintList(r2)
        Lf:
            return
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lc
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setSupportBackgroundTintMode(r2)
            goto Lf
        Lc:
            super.setSupportBackgroundTintMode(r2)
        Lf:
            return
    }

    @Override // android.widget.Checkable
    public void toggle() {
            r1 = this;
            boolean r0 = r1.checked
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }
}
