package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class AppCompatImageHelper {
    private androidx.appcompat.widget.TintInfo mImageTint;
    private androidx.appcompat.widget.TintInfo mInternalImageTint;
    private androidx.appcompat.widget.TintInfo mTmpInfo;
    private final android.widget.ImageView mView;

    public AppCompatImageHelper(android.widget.ImageView r1) {
            r0 = this;
            r0.<init>()
            r0.mView = r1
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
            android.widget.ImageView r1 = r3.mView
            android.content.res.ColorStateList r1 = androidx.core.widget.ImageViewCompat.getImageTintList(r1)
            r2 = 1
            if (r1 == 0) goto L1d
            r0.mHasTintList = r2
            r0.mTintList = r1
        L1d:
            android.widget.ImageView r1 = r3.mView
            android.graphics.PorterDuff$Mode r1 = androidx.core.widget.ImageViewCompat.getImageTintMode(r1)
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
            android.widget.ImageView r1 = r3.mView
            int[] r1 = r1.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r4, r0, r1)
            return r2
    }

    private boolean shouldApplyFrameworkTintUsingColorFilter() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mInternalImageTint
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    void applySupportImageTint() {
            r3 = this;
            android.widget.ImageView r0 = r3.mView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.DrawableUtils.fixDrawable(r0)
        Lb:
            if (r0 == 0) goto L35
            boolean r1 = r3.shouldApplyFrameworkTintUsingColorFilter()
            if (r1 == 0) goto L1a
            boolean r1 = r3.applyFrameworkTintUsingColorFilter(r0)
            if (r1 == 0) goto L1a
            return
        L1a:
            androidx.appcompat.widget.TintInfo r1 = r3.mImageTint
            if (r1 == 0) goto L28
            android.widget.ImageView r2 = r3.mView
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r0, r1, r2)
            goto L35
        L28:
            androidx.appcompat.widget.TintInfo r1 = r3.mInternalImageTint
            if (r1 == 0) goto L35
            android.widget.ImageView r2 = r3.mView
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r0, r1, r2)
        L35:
            return
    }

    android.content.res.ColorStateList getSupportImageTintList() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.mTintList
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    boolean hasOverlappingRendering() {
            r1 = this;
            android.widget.ImageView r0 = r1.mView
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = 1
            return r0
    }

    public void loadFromAttributes(android.util.AttributeSet r9, int r10) {
            r8 = this;
            android.widget.ImageView r0 = r8.mView
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.C0015R.styleable.AppCompatImageView
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r9, r1, r10, r2)
            android.widget.ImageView r1 = r8.mView
            android.content.Context r2 = r1.getContext()
            int[] r3 = androidx.appcompat.C0015R.styleable.AppCompatImageView
            android.content.res.TypedArray r5 = r0.getWrappedTypeArray()
            r7 = 0
            r4 = r9
            r6 = r10
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            android.widget.ImageView r9 = r8.mView     // Catch: java.lang.Throwable -> L75
            android.graphics.drawable.Drawable r9 = r9.getDrawable()     // Catch: java.lang.Throwable -> L75
            r10 = -1
            if (r9 != 0) goto L41
            int r1 = androidx.appcompat.C0015R.styleable.AppCompatImageView_srcCompat     // Catch: java.lang.Throwable -> L75
            int r1 = r0.getResourceId(r1, r10)     // Catch: java.lang.Throwable -> L75
            if (r1 == r10) goto L41
            android.widget.ImageView r9 = r8.mView     // Catch: java.lang.Throwable -> L75
            android.content.Context r9 = r9.getContext()     // Catch: java.lang.Throwable -> L75
            android.graphics.drawable.Drawable r9 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r9, r1)     // Catch: java.lang.Throwable -> L75
            if (r9 == 0) goto L41
            android.widget.ImageView r1 = r8.mView     // Catch: java.lang.Throwable -> L75
            r1.setImageDrawable(r9)     // Catch: java.lang.Throwable -> L75
        L41:
            if (r9 == 0) goto L46
            androidx.appcompat.widget.DrawableUtils.fixDrawable(r9)     // Catch: java.lang.Throwable -> L75
        L46:
            int r9 = androidx.appcompat.C0015R.styleable.AppCompatImageView_tint     // Catch: java.lang.Throwable -> L75
            boolean r9 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L75
            if (r9 == 0) goto L59
            android.widget.ImageView r9 = r8.mView     // Catch: java.lang.Throwable -> L75
            int r1 = androidx.appcompat.C0015R.styleable.AppCompatImageView_tint     // Catch: java.lang.Throwable -> L75
            android.content.res.ColorStateList r1 = r0.getColorStateList(r1)     // Catch: java.lang.Throwable -> L75
            androidx.core.widget.ImageViewCompat.setImageTintList(r9, r1)     // Catch: java.lang.Throwable -> L75
        L59:
            int r9 = androidx.appcompat.C0015R.styleable.AppCompatImageView_tintMode     // Catch: java.lang.Throwable -> L75
            boolean r9 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L75
            if (r9 == 0) goto L71
            android.widget.ImageView r9 = r8.mView     // Catch: java.lang.Throwable -> L75
            int r1 = androidx.appcompat.C0015R.styleable.AppCompatImageView_tintMode     // Catch: java.lang.Throwable -> L75
            int r10 = r0.getInt(r1, r10)     // Catch: java.lang.Throwable -> L75
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r10, r1)     // Catch: java.lang.Throwable -> L75
            androidx.core.widget.ImageViewCompat.setImageTintMode(r9, r10)     // Catch: java.lang.Throwable -> L75
        L71:
            r0.recycle()
            return
        L75:
            r9 = move-exception
            r0.recycle()
            throw r9
    }

    public void setImageResource(int r2) {
            r1 = this;
            if (r2 == 0) goto L17
            android.widget.ImageView r0 = r1.mView
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            if (r2 == 0) goto L11
            androidx.appcompat.widget.DrawableUtils.fixDrawable(r2)
        L11:
            android.widget.ImageView r0 = r1.mView
            r0.setImageDrawable(r2)
            goto L1d
        L17:
            android.widget.ImageView r2 = r1.mView
            r0 = 0
            r2.setImageDrawable(r0)
        L1d:
            r1.applySupportImageTint()
            return
    }

    void setInternalImageTint(android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto L17
            androidx.appcompat.widget.TintInfo r0 = r1.mInternalImageTint
            if (r0 != 0) goto Ld
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mInternalImageTint = r0
        Ld:
            androidx.appcompat.widget.TintInfo r0 = r1.mInternalImageTint
            r0.mTintList = r2
            androidx.appcompat.widget.TintInfo r2 = r1.mInternalImageTint
            r0 = 1
            r2.mHasTintList = r0
            goto L1a
        L17:
            r2 = 0
            r1.mInternalImageTint = r2
        L1a:
            r1.applySupportImageTint()
            return
    }

    void setSupportImageTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mImageTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            r0.mTintList = r2
            androidx.appcompat.widget.TintInfo r2 = r1.mImageTint
            r0 = 1
            r2.mHasTintList = r0
            r1.applySupportImageTint()
            return
    }

    void setSupportImageTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mImageTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            r0.mTintMode = r2
            androidx.appcompat.widget.TintInfo r2 = r1.mImageTint
            r0 = 1
            r2.mHasTintMode = r0
            r1.applySupportImageTint()
            return
    }
}
