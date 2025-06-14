package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
class RoundedBitmapDrawable21 extends androidx.core.graphics.drawable.RoundedBitmapDrawable {
    protected RoundedBitmapDrawable21(android.content.res.Resources r1, android.graphics.Bitmap r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r3) {
            r2 = this;
            r2.updateDstRect()
            android.graphics.Rect r0 = r2.mDstRect
            float r1 = r2.getCornerRadius()
            r3.setRoundRect(r0, r1)
            return
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    void gravityCompatApply(int r7, int r8, int r9, android.graphics.Rect r10, android.graphics.Rect r11) {
            r6 = this;
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            android.view.Gravity.apply(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public boolean hasMipMap() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.mBitmap
            if (r0 == 0) goto Le
            android.graphics.Bitmap r0 = r1.mBitmap
            boolean r0 = r0.hasMipMap()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public void setMipMap(boolean r2) {
            r1 = this;
            android.graphics.Bitmap r0 = r1.mBitmap
            if (r0 == 0) goto Lc
            android.graphics.Bitmap r0 = r1.mBitmap
            r0.setHasMipMap(r2)
            r1.invalidateSelf()
        Lc:
            return
    }
}
