package androidx.core.graphics;

/* loaded from: classes.dex */
public class BlendModeColorFilterCompat {
    private BlendModeColorFilterCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.ColorFilter createBlendModeColorFilterCompat(int r3, androidx.core.graphics.BlendModeCompat r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L13
            android.graphics.BlendMode r4 = androidx.core.graphics.BlendModeUtils.obtainBlendModeFromCompat(r4)
            if (r4 == 0) goto L12
            android.graphics.BlendModeColorFilter r2 = new android.graphics.BlendModeColorFilter
            r2.<init>(r3, r4)
        L12:
            return r2
        L13:
            android.graphics.PorterDuff$Mode r4 = androidx.core.graphics.BlendModeUtils.obtainPorterDuffFromCompat(r4)
            if (r4 == 0) goto L1e
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r2.<init>(r3, r4)
        L1e:
            return r2
    }
}
