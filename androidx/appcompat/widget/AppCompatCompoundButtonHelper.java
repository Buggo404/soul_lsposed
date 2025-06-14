package androidx.appcompat.widget;

/* loaded from: classes.dex */
class AppCompatCompoundButtonHelper {
    private android.content.res.ColorStateList mButtonTintList;
    private android.graphics.PorterDuff.Mode mButtonTintMode;
    private boolean mHasButtonTint;
    private boolean mHasButtonTintMode;
    private boolean mSkipNextApply;
    private final android.widget.CompoundButton mView;

    AppCompatCompoundButtonHelper(android.widget.CompoundButton r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mButtonTintList = r0
            r1.mButtonTintMode = r0
            r0 = 0
            r1.mHasButtonTint = r0
            r1.mHasButtonTintMode = r0
            r1.mView = r2
            return
    }

    void applyButtonTint() {
            r2 = this;
            android.widget.CompoundButton r0 = r2.mView
            android.graphics.drawable.Drawable r0 = androidx.core.widget.CompoundButtonCompat.getButtonDrawable(r0)
            if (r0 == 0) goto L3e
            boolean r1 = r2.mHasButtonTint
            if (r1 != 0) goto L10
            boolean r1 = r2.mHasButtonTintMode
            if (r1 == 0) goto L3e
        L10:
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            boolean r1 = r2.mHasButtonTint
            if (r1 == 0) goto L21
            android.content.res.ColorStateList r1 = r2.mButtonTintList
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
        L21:
            boolean r1 = r2.mHasButtonTintMode
            if (r1 == 0) goto L2a
            android.graphics.PorterDuff$Mode r1 = r2.mButtonTintMode
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r1)
        L2a:
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L39
            android.widget.CompoundButton r1 = r2.mView
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L39:
            android.widget.CompoundButton r1 = r2.mView
            r1.setButtonDrawable(r0)
        L3e:
            return
    }

    int getCompoundPaddingLeft(int r1) {
            r0 = this;
            return r1
    }

    android.content.res.ColorStateList getSupportButtonTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mButtonTintList
            return r0
    }

    android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.mButtonTintMode
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r11, int r12) {
            r10 = this;
            android.widget.CompoundButton r0 = r10.mView
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.C0015R.styleable.CompoundButton
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.mView
            android.content.Context r4 = r3.getContext()
            int[] r5 = androidx.appcompat.C0015R.styleable.CompoundButton
            android.content.res.TypedArray r7 = r0.getWrappedTypeArray()
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r3, r4, r5, r6, r7, r8, r9)
            int r11 = androidx.appcompat.C0015R.styleable.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L8e
            boolean r11 = r0.hasValue(r11)     // Catch: java.lang.Throwable -> L8e
            if (r11 == 0) goto L3e
            int r11 = androidx.appcompat.C0015R.styleable.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L8e
            int r11 = r0.getResourceId(r11, r2)     // Catch: java.lang.Throwable -> L8e
            if (r11 == 0) goto L3e
            android.widget.CompoundButton r12 = r10.mView     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L8e
            android.content.Context r1 = r12.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L8e
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r11)     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L8e
            r12.setButtonDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L8e
            r11 = 1
            goto L3f
        L3e:
            r11 = r2
        L3f:
            if (r11 != 0) goto L5e
            int r11 = androidx.appcompat.C0015R.styleable.CompoundButton_android_button     // Catch: java.lang.Throwable -> L8e
            boolean r11 = r0.hasValue(r11)     // Catch: java.lang.Throwable -> L8e
            if (r11 == 0) goto L5e
            int r11 = androidx.appcompat.C0015R.styleable.CompoundButton_android_button     // Catch: java.lang.Throwable -> L8e
            int r11 = r0.getResourceId(r11, r2)     // Catch: java.lang.Throwable -> L8e
            if (r11 == 0) goto L5e
            android.widget.CompoundButton r12 = r10.mView     // Catch: java.lang.Throwable -> L8e
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L8e
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r11)     // Catch: java.lang.Throwable -> L8e
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L8e
        L5e:
            int r11 = androidx.appcompat.C0015R.styleable.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L8e
            boolean r11 = r0.hasValue(r11)     // Catch: java.lang.Throwable -> L8e
            if (r11 == 0) goto L71
            android.widget.CompoundButton r11 = r10.mView     // Catch: java.lang.Throwable -> L8e
            int r12 = androidx.appcompat.C0015R.styleable.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L8e
            android.content.res.ColorStateList r12 = r0.getColorStateList(r12)     // Catch: java.lang.Throwable -> L8e
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(r11, r12)     // Catch: java.lang.Throwable -> L8e
        L71:
            int r11 = androidx.appcompat.C0015R.styleable.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L8e
            boolean r11 = r0.hasValue(r11)     // Catch: java.lang.Throwable -> L8e
            if (r11 == 0) goto L8a
            android.widget.CompoundButton r11 = r10.mView     // Catch: java.lang.Throwable -> L8e
            int r12 = androidx.appcompat.C0015R.styleable.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L8e
            r1 = -1
            int r12 = r0.getInt(r12, r1)     // Catch: java.lang.Throwable -> L8e
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r12, r1)     // Catch: java.lang.Throwable -> L8e
            androidx.core.widget.CompoundButtonCompat.setButtonTintMode(r11, r12)     // Catch: java.lang.Throwable -> L8e
        L8a:
            r0.recycle()
            return
        L8e:
            r11 = move-exception
            r0.recycle()
            throw r11
    }

    void onSetButtonDrawable() {
            r1 = this;
            boolean r0 = r1.mSkipNextApply
            if (r0 == 0) goto L8
            r0 = 0
            r1.mSkipNextApply = r0
            return
        L8:
            r0 = 1
            r1.mSkipNextApply = r0
            r1.applyButtonTint()
            return
    }

    void setSupportButtonTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.mButtonTintList = r1
            r1 = 1
            r0.mHasButtonTint = r1
            r0.applyButtonTint()
            return
    }

    void setSupportButtonTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.mButtonTintMode = r1
            r1 = 1
            r0.mHasButtonTintMode = r1
            r0.applyButtonTint()
            return
    }
}
