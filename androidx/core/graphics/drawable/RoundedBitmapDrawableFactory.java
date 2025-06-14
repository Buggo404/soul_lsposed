package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public final class RoundedBitmapDrawableFactory {
    private static final java.lang.String TAG = "RoundedBitmapDrawableFa";

    private static class DefaultRoundedBitmapDrawable extends androidx.core.graphics.drawable.RoundedBitmapDrawable {
        DefaultRoundedBitmapDrawable(android.content.res.Resources r1, android.graphics.Bitmap r2) {
                r0 = this;
                r0.<init>(r1, r2)
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
                androidx.core.view.GravityCompat.apply(r0, r1, r2, r3, r4, r5)
                return
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        public boolean hasMipMap() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.mBitmap
                if (r0 == 0) goto Le
                android.graphics.Bitmap r0 = r1.mBitmap
                boolean r0 = androidx.core.graphics.BitmapCompat.hasMipMap(r0)
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
                androidx.core.graphics.BitmapCompat.setHasMipMap(r0, r2)
                r1.invalidateSelf()
            Lc:
                return
        }
    }

    private RoundedBitmapDrawableFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.graphics.drawable.RoundedBitmapDrawable create(android.content.res.Resources r1, android.graphics.Bitmap r2) {
            androidx.core.graphics.drawable.RoundedBitmapDrawable21 r0 = new androidx.core.graphics.drawable.RoundedBitmapDrawable21
            r0.<init>(r1, r2)
            return r0
    }

    public static androidx.core.graphics.drawable.RoundedBitmapDrawable create(android.content.res.Resources r2, java.io.InputStream r3) {
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r3)
            androidx.core.graphics.drawable.RoundedBitmapDrawable r2 = create(r2, r0)
            android.graphics.Bitmap r0 = r2.getBitmap()
            if (r0 != 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RoundedBitmapDrawable cannot decode "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "RoundedBitmapDrawableFa"
            android.util.Log.w(r0, r3)
        L22:
            return r2
    }

    public static androidx.core.graphics.drawable.RoundedBitmapDrawable create(android.content.res.Resources r2, java.lang.String r3) {
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r3)
            androidx.core.graphics.drawable.RoundedBitmapDrawable r2 = create(r2, r0)
            android.graphics.Bitmap r0 = r2.getBitmap()
            if (r0 != 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RoundedBitmapDrawable cannot decode "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "RoundedBitmapDrawableFa"
            android.util.Log.w(r0, r3)
        L22:
            return r2
    }
}
