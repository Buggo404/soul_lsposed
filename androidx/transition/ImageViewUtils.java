package androidx.transition;

/* loaded from: classes.dex */
class ImageViewUtils {
    private static java.lang.reflect.Field sDrawMatrixField = null;
    private static boolean sDrawMatrixFieldFetched = false;
    private static boolean sTryHiddenAnimateTransform = true;

    static {
            return
    }

    private ImageViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static void animateTransform(android.widget.ImageView r3, android.graphics.Matrix r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            r3.animateTransform(r4)
            goto L39
        La:
            if (r4 != 0) goto L36
            android.graphics.drawable.Drawable r4 = r3.getDrawable()
            if (r4 == 0) goto L39
            int r0 = r3.getWidth()
            int r1 = r3.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r3.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r3.getHeight()
            int r2 = r3.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r3.getPaddingBottom()
            int r1 = r1 - r2
            r2 = 0
            r4.setBounds(r2, r2, r0, r1)
            r3.invalidate()
            goto L39
        L36:
            hiddenAnimateTransform(r3, r4)
        L39:
            return
    }

    private static void fetchDrawMatrixField() {
            boolean r0 = androidx.transition.ImageViewUtils.sDrawMatrixFieldFetched
            if (r0 != 0) goto L14
            r0 = 1
            java.lang.Class<android.widget.ImageView> r1 = android.widget.ImageView.class
            java.lang.String r2 = "mDrawMatrix"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L12
            androidx.transition.ImageViewUtils.sDrawMatrixField = r1     // Catch: java.lang.NoSuchFieldException -> L12
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L12
        L12:
            androidx.transition.ImageViewUtils.sDrawMatrixFieldFetched = r0
        L14:
            return
    }

    private static void hiddenAnimateTransform(android.widget.ImageView r1, android.graphics.Matrix r2) {
            boolean r0 = androidx.transition.ImageViewUtils.sTryHiddenAnimateTransform
            if (r0 == 0) goto Lb
            r1.animateTransform(r2)     // Catch: java.lang.NoSuchMethodError -> L8
            goto Lb
        L8:
            r1 = 0
            androidx.transition.ImageViewUtils.sTryHiddenAnimateTransform = r1
        Lb:
            return
    }
}
