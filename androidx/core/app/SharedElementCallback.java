package androidx.core.app;

/* loaded from: classes.dex */
public abstract class SharedElementCallback {
    private static final java.lang.String BUNDLE_SNAPSHOT_BITMAP = "sharedElement:snapshot:bitmap";
    private static final java.lang.String BUNDLE_SNAPSHOT_IMAGE_MATRIX = "sharedElement:snapshot:imageMatrix";
    private static final java.lang.String BUNDLE_SNAPSHOT_IMAGE_SCALETYPE = "sharedElement:snapshot:imageScaleType";
    private static final int MAX_IMAGE_SIZE = 1048576;
    private android.graphics.Matrix mTempMatrix;

    public interface OnSharedElementsReadyListener {
        void onSharedElementsReady();
    }

    public SharedElementCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.graphics.Bitmap createDrawableBitmap(android.graphics.drawable.Drawable r9) {
            int r0 = r9.getIntrinsicWidth()
            int r1 = r9.getIntrinsicHeight()
            if (r0 <= 0) goto L50
            if (r1 > 0) goto Ld
            goto L50
        Ld:
            int r2 = r0 * r1
            float r2 = (float) r2
            r3 = 1233125376(0x49800000, float:1048576.0)
            float r3 = r3 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.min(r2, r3)
            boolean r4 = r9 instanceof android.graphics.drawable.BitmapDrawable
            if (r4 == 0) goto L28
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L28
            android.graphics.drawable.BitmapDrawable r9 = (android.graphics.drawable.BitmapDrawable) r9
            android.graphics.Bitmap r9 = r9.getBitmap()
            return r9
        L28:
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            float r1 = (float) r1
            float r1 = r1 * r3
            int r1 = (int) r1
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            android.graphics.Rect r4 = r9.getBounds()
            int r5 = r4.left
            int r6 = r4.top
            int r7 = r4.right
            int r4 = r4.bottom
            r8 = 0
            r9.setBounds(r8, r8, r0, r1)
            r9.draw(r3)
            r9.setBounds(r5, r6, r7, r4)
            return r2
        L50:
            r9 = 0
            return r9
    }

    public android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View r5, android.graphics.Matrix r6, android.graphics.RectF r7) {
            r4 = this;
            boolean r0 = r5 instanceof android.widget.ImageView
            if (r0 == 0) goto L49
            r0 = r5
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            if (r1 == 0) goto L49
            if (r2 != 0) goto L49
            android.graphics.Bitmap r1 = createDrawableBitmap(r1)
            if (r1 == 0) goto L49
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "sharedElement:snapshot:bitmap"
            r5.putParcelable(r6, r1)
            android.widget.ImageView$ScaleType r6 = r0.getScaleType()
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "sharedElement:snapshot:imageScaleType"
            r5.putString(r7, r6)
            android.widget.ImageView$ScaleType r6 = r0.getScaleType()
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.MATRIX
            if (r6 != r7) goto L48
            android.graphics.Matrix r6 = r0.getImageMatrix()
            r7 = 9
            float[] r7 = new float[r7]
            r6.getValues(r7)
            java.lang.String r6 = "sharedElement:snapshot:imageMatrix"
            r5.putFloatArray(r6, r7)
        L48:
            return r5
        L49:
            float r0 = r7.width()
            int r0 = java.lang.Math.round(r0)
            float r1 = r7.height()
            int r1 = java.lang.Math.round(r1)
            if (r0 <= 0) goto La3
            if (r1 <= 0) goto La3
            int r2 = r0 * r1
            float r2 = (float) r2
            r3 = 1233125376(0x49800000, float:1048576.0)
            float r3 = r3 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r2, r3)
            float r0 = (float) r0
            float r0 = r0 * r2
            int r0 = (int) r0
            float r1 = (float) r1
            float r1 = r1 * r2
            int r1 = (int) r1
            android.graphics.Matrix r3 = r4.mTempMatrix
            if (r3 != 0) goto L7a
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r4.mTempMatrix = r3
        L7a:
            android.graphics.Matrix r3 = r4.mTempMatrix
            r3.set(r6)
            android.graphics.Matrix r6 = r4.mTempMatrix
            float r3 = r7.left
            float r3 = -r3
            float r7 = r7.top
            float r7 = -r7
            r6.postTranslate(r3, r7)
            android.graphics.Matrix r6 = r4.mTempMatrix
            r6.postScale(r2, r2)
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r0, r1, r6)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r6)
            android.graphics.Matrix r0 = r4.mTempMatrix
            r7.concat(r0)
            r5.draw(r7)
            goto La4
        La3:
            r6 = 0
        La4:
            return r6
    }

    public android.view.View onCreateSnapshotView(android.content.Context r3, android.os.Parcelable r4) {
            r2 = this;
            boolean r0 = r4 instanceof android.os.Bundle
            r1 = 0
            if (r0 == 0) goto L41
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r0 = "sharedElement:snapshot:bitmap"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 != 0) goto L12
            return r1
        L12:
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r3)
            r1.setImageBitmap(r0)
            java.lang.String r3 = "sharedElement:snapshot:imageScaleType"
            java.lang.String r3 = r4.getString(r3)
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.valueOf(r3)
            r1.setScaleType(r3)
            android.widget.ImageView$ScaleType r3 = r1.getScaleType()
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            if (r3 != r0) goto L4f
            java.lang.String r3 = "sharedElement:snapshot:imageMatrix"
            float[] r3 = r4.getFloatArray(r3)
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r4.setValues(r3)
            r1.setImageMatrix(r4)
            goto L4f
        L41:
            boolean r0 = r4 instanceof android.graphics.Bitmap
            if (r0 == 0) goto L4f
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r3)
            r1.setImageBitmap(r4)
        L4f:
            return r1
    }

    public void onMapSharedElements(java.util.List<java.lang.String> r1, java.util.Map<java.lang.String, android.view.View> r2) {
            r0 = this;
            return
    }

    public void onRejectSharedElements(java.util.List<android.view.View> r1) {
            r0 = this;
            return
    }

    public void onSharedElementEnd(java.util.List<java.lang.String> r1, java.util.List<android.view.View> r2, java.util.List<android.view.View> r3) {
            r0 = this;
            return
    }

    public void onSharedElementStart(java.util.List<java.lang.String> r1, java.util.List<android.view.View> r2, java.util.List<android.view.View> r3) {
            r0 = this;
            return
    }

    public void onSharedElementsArrived(java.util.List<java.lang.String> r1, java.util.List<android.view.View> r2, androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener r3) {
            r0 = this;
            r3.onSharedElementsReady()
            return
    }
}
