package androidx.appcompat.widget;

/* loaded from: classes.dex */
class AppCompatBackgroundHelper {
    private int mBackgroundResId;
    private androidx.appcompat.widget.TintInfo mBackgroundTint;
    private final androidx.appcompat.widget.AppCompatDrawableManager mDrawableManager;
    private androidx.appcompat.widget.TintInfo mInternalBackgroundTint;
    private androidx.appcompat.widget.TintInfo mTmpInfo;
    private final android.view.View mView;

    AppCompatBackgroundHelper(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mBackgroundResId = r0
            r1.mView = r2
            androidx.appcompat.widget.AppCompatDrawableManager r2 = androidx.appcompat.widget.AppCompatDrawableManager.get()
            r1.mDrawableManager = r2
            return
    }

    private boolean applyFrameworkTintUsingColorFilter(android.graphics.drawable.Drawable r4) {
            r3 = this;
            androidx.appcompat.widget.TintInfo r0 = r3.mTmpInfo
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r3.mTmpInfo = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r3.mTmpInfo
            r0.clear()
            android.view.View r1 = r3.mView
            android.content.res.ColorStateList r1 = androidx.core.view.ViewCompat.getBackgroundTintList(r1)
            r2 = 1
            if (r1 == 0) goto L1d
            r0.mHasTintList = r2
            r0.mTintList = r1
        L1d:
            android.view.View r1 = r3.mView
            android.graphics.PorterDuff$Mode r1 = androidx.core.view.ViewCompat.getBackgroundTintMode(r1)
            if (r1 == 0) goto L29
            r0.mHasTintMode = r2
            r0.mTintMode = r1
        L29:
            boolean r1 = r0.mHasTintList
            if (r1 != 0) goto L34
            boolean r1 = r0.mHasTintMode
            if (r1 == 0) goto L32
            goto L34
        L32:
            r4 = 0
            return r4
        L34:
            android.view.View r1 = r3.mView
            int[] r1 = r1.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r4, r0, r1)
            return r2
    }

    private boolean shouldApplyFrameworkTintUsingColorFilter() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mInternalBackgroundTint
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    void applySupportBackgroundTint() {
            r3 = this;
            android.view.View r0 = r3.mView
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L30
            boolean r1 = r3.shouldApplyFrameworkTintUsingColorFilter()
            if (r1 == 0) goto L15
            boolean r1 = r3.applyFrameworkTintUsingColorFilter(r0)
            if (r1 == 0) goto L15
            return
        L15:
            androidx.appcompat.widget.TintInfo r1 = r3.mBackgroundTint
            if (r1 == 0) goto L23
            android.view.View r2 = r3.mView
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r0, r1, r2)
            goto L30
        L23:
            androidx.appcompat.widget.TintInfo r1 = r3.mInternalBackgroundTint
            if (r1 == 0) goto L30
            android.view.View r2 = r3.mView
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r0, r1, r2)
        L30:
            return
    }

    android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.mTintList
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r9, int r10) {
            r8 = this;
            android.view.View r0 = r8.mView
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.C0015R.styleable.ViewBackgroundHelper
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r9, r1, r10, r2)
            android.view.View r1 = r8.mView
            android.content.Context r2 = r1.getContext()
            int[] r3 = androidx.appcompat.C0015R.styleable.ViewBackgroundHelper
            android.content.res.TypedArray r5 = r0.getWrappedTypeArray()
            r7 = 0
            r4 = r9
            r6 = r10
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            int r9 = androidx.appcompat.C0015R.styleable.ViewBackgroundHelper_android_background     // Catch: java.lang.Throwable -> L72
            boolean r9 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L72
            r10 = -1
            if (r9 == 0) goto L43
            int r9 = androidx.appcompat.C0015R.styleable.ViewBackgroundHelper_android_background     // Catch: java.lang.Throwable -> L72
            int r9 = r0.getResourceId(r9, r10)     // Catch: java.lang.Throwable -> L72
            r8.mBackgroundResId = r9     // Catch: java.lang.Throwable -> L72
            androidx.appcompat.widget.AppCompatDrawableManager r9 = r8.mDrawableManager     // Catch: java.lang.Throwable -> L72
            android.view.View r1 = r8.mView     // Catch: java.lang.Throwable -> L72
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L72
            int r2 = r8.mBackgroundResId     // Catch: java.lang.Throwable -> L72
            android.content.res.ColorStateList r9 = r9.getTintList(r1, r2)     // Catch: java.lang.Throwable -> L72
            if (r9 == 0) goto L43
            r8.setInternalBackgroundTint(r9)     // Catch: java.lang.Throwable -> L72
        L43:
            int r9 = androidx.appcompat.C0015R.styleable.ViewBackgroundHelper_backgroundTint     // Catch: java.lang.Throwable -> L72
            boolean r9 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L72
            if (r9 == 0) goto L56
            android.view.View r9 = r8.mView     // Catch: java.lang.Throwable -> L72
            int r1 = androidx.appcompat.C0015R.styleable.ViewBackgroundHelper_backgroundTint     // Catch: java.lang.Throwable -> L72
            android.content.res.ColorStateList r1 = r0.getColorStateList(r1)     // Catch: java.lang.Throwable -> L72
            androidx.core.view.ViewCompat.setBackgroundTintList(r9, r1)     // Catch: java.lang.Throwable -> L72
        L56:
            int r9 = androidx.appcompat.C0015R.styleable.ViewBackgroundHelper_backgroundTintMode     // Catch: java.lang.Throwable -> L72
            boolean r9 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L72
            if (r9 == 0) goto L6e
            android.view.View r9 = r8.mView     // Catch: java.lang.Throwable -> L72
            int r1 = androidx.appcompat.C0015R.styleable.ViewBackgroundHelper_backgroundTintMode     // Catch: java.lang.Throwable -> L72
            int r10 = r0.getInt(r1, r10)     // Catch: java.lang.Throwable -> L72
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r10, r1)     // Catch: java.lang.Throwable -> L72
            androidx.core.view.ViewCompat.setBackgroundTintMode(r9, r10)     // Catch: java.lang.Throwable -> L72
        L6e:
            r0.recycle()
            return
        L72:
            r9 = move-exception
            r0.recycle()
            throw r9
    }

    void onSetBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r1 = -1
            r0.mBackgroundResId = r1
            r1 = 0
            r0.setInternalBackgroundTint(r1)
            r0.applySupportBackgroundTint()
            return
    }

    void onSetBackgroundResource(int r3) {
            r2 = this;
            r2.mBackgroundResId = r3
            androidx.appcompat.widget.AppCompatDrawableManager r0 = r2.mDrawableManager
            if (r0 == 0) goto L11
            android.view.View r1 = r2.mView
            android.content.Context r1 = r1.getContext()
            android.content.res.ColorStateList r3 = r0.getTintList(r1, r3)
            goto L12
        L11:
            r3 = 0
        L12:
            r2.setInternalBackgroundTint(r3)
            r2.applySupportBackgroundTint()
            return
    }

    void setInternalBackgroundTint(android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto L17
            androidx.appcompat.widget.TintInfo r0 = r1.mInternalBackgroundTint
            if (r0 != 0) goto Ld
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mInternalBackgroundTint = r0
        Ld:
            androidx.appcompat.widget.TintInfo r0 = r1.mInternalBackgroundTint
            r0.mTintList = r2
            androidx.appcompat.widget.TintInfo r2 = r1.mInternalBackgroundTint
            r0 = 1
            r2.mHasTintList = r0
            goto L1a
        L17:
            r2 = 0
            r1.mInternalBackgroundTint = r2
        L1a:
            r1.applySupportBackgroundTint()
            return
    }

    void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mBackgroundTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            r0.mTintList = r2
            androidx.appcompat.widget.TintInfo r2 = r1.mBackgroundTint
            r0 = 1
            r2.mHasTintList = r0
            r1.applySupportBackgroundTint()
            return
    }

    void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mBackgroundTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            r0.mTintMode = r2
            androidx.appcompat.widget.TintInfo r2 = r1.mBackgroundTint
            r0 = 1
            r2.mHasTintMode = r0
            r1.applySupportBackgroundTint()
            return
    }
}
