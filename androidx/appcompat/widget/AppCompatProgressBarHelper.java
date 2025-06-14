package androidx.appcompat.widget;

/* loaded from: classes.dex */
class AppCompatProgressBarHelper {
    private static final int[] TINT_ATTRS = null;
    private android.graphics.Bitmap mSampleTile;
    private final android.widget.ProgressBar mView;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [16843067, 16843068} // fill-array
            androidx.appcompat.widget.AppCompatProgressBarHelper.TINT_ATTRS = r0
            return
    }

    AppCompatProgressBarHelper(android.widget.ProgressBar r1) {
            r0 = this;
            r0.<init>()
            r0.mView = r1
            return
    }

    private android.graphics.drawable.shapes.Shape getDrawableShape() {
            r3 = this;
            r0 = 8
            float[] r0 = new float[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584} // fill-array
            android.graphics.drawable.shapes.RoundRectShape r1 = new android.graphics.drawable.shapes.RoundRectShape
            r2 = 0
            r1.<init>(r0, r2, r2)
            return r1
    }

    private android.graphics.drawable.Drawable tileify(android.graphics.drawable.Drawable r8, boolean r9) {
            r7 = this;
            boolean r0 = r8 instanceof androidx.core.graphics.drawable.WrappedDrawable
            if (r0 == 0) goto L16
            r0 = r8
            androidx.core.graphics.drawable.WrappedDrawable r0 = (androidx.core.graphics.drawable.WrappedDrawable) r0
            android.graphics.drawable.Drawable r1 = r0.getWrappedDrawable()
            if (r1 == 0) goto L9a
            android.graphics.drawable.Drawable r9 = r7.tileify(r1, r9)
            r0.setWrappedDrawable(r9)
            goto L9a
        L16:
            boolean r0 = r8 instanceof android.graphics.drawable.LayerDrawable
            r1 = 1
            if (r0 == 0) goto L58
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            int r9 = r8.getNumberOfLayers()
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r9]
            r2 = 0
            r3 = r2
        L25:
            if (r3 >= r9) goto L46
            int r4 = r8.getId(r3)
            android.graphics.drawable.Drawable r5 = r8.getDrawable(r3)
            r6 = 16908301(0x102000d, float:2.3877265E-38)
            if (r4 == r6) goto L3c
            r6 = 16908303(0x102000f, float:2.387727E-38)
            if (r4 != r6) goto L3a
            goto L3c
        L3a:
            r4 = r2
            goto L3d
        L3c:
            r4 = r1
        L3d:
            android.graphics.drawable.Drawable r4 = r7.tileify(r5, r4)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L25
        L46:
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r1.<init>(r0)
        L4b:
            if (r2 >= r9) goto L57
            int r0 = r8.getId(r2)
            r1.setId(r2, r0)
            int r2 = r2 + 1
            goto L4b
        L57:
            return r1
        L58:
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L9a
            android.graphics.drawable.BitmapDrawable r8 = (android.graphics.drawable.BitmapDrawable) r8
            android.graphics.Bitmap r0 = r8.getBitmap()
            android.graphics.Bitmap r2 = r7.mSampleTile
            if (r2 != 0) goto L68
            r7.mSampleTile = r0
        L68:
            android.graphics.drawable.ShapeDrawable r2 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.Shape r3 = r7.getDrawableShape()
            r2.<init>(r3)
            android.graphics.BitmapShader r3 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.CLAMP
            r3.<init>(r0, r4, r5)
            android.graphics.Paint r0 = r2.getPaint()
            r0.setShader(r3)
            android.graphics.Paint r0 = r2.getPaint()
            android.graphics.Paint r8 = r8.getPaint()
            android.graphics.ColorFilter r8 = r8.getColorFilter()
            r0.setColorFilter(r8)
            if (r9 == 0) goto L99
            android.graphics.drawable.ClipDrawable r8 = new android.graphics.drawable.ClipDrawable
            r9 = 3
            r8.<init>(r2, r9, r1)
            r2 = r8
        L99:
            return r2
        L9a:
            return r8
    }

    private android.graphics.drawable.Drawable tileifyIndeterminate(android.graphics.drawable.Drawable r7) {
            r6 = this;
            boolean r0 = r7 instanceof android.graphics.drawable.AnimationDrawable
            if (r0 == 0) goto L35
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            int r0 = r7.getNumberOfFrames()
            android.graphics.drawable.AnimationDrawable r1 = new android.graphics.drawable.AnimationDrawable
            r1.<init>()
            boolean r2 = r7.isOneShot()
            r1.setOneShot(r2)
            r2 = 0
        L17:
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r2 >= r0) goto L31
            android.graphics.drawable.Drawable r4 = r7.getFrame(r2)
            r5 = 1
            android.graphics.drawable.Drawable r4 = r6.tileify(r4, r5)
            r4.setLevel(r3)
            int r3 = r7.getDuration(r2)
            r1.addFrame(r4, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            r1.setLevel(r3)
            r7 = r1
        L35:
            return r7
    }

    android.graphics.Bitmap getSampleTile() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.mSampleTile
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.ProgressBar r0 = r3.mView
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.widget.AppCompatProgressBarHelper.TINT_ATTRS
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r4 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r4, r1, r5, r2)
            android.graphics.drawable.Drawable r5 = r4.getDrawableIfKnown(r2)
            if (r5 == 0) goto L1c
            android.widget.ProgressBar r0 = r3.mView
            android.graphics.drawable.Drawable r5 = r3.tileifyIndeterminate(r5)
            r0.setIndeterminateDrawable(r5)
        L1c:
            r5 = 1
            android.graphics.drawable.Drawable r5 = r4.getDrawableIfKnown(r5)
            if (r5 == 0) goto L2c
            android.widget.ProgressBar r0 = r3.mView
            android.graphics.drawable.Drawable r5 = r3.tileify(r5, r2)
            r0.setProgressDrawable(r5)
        L2c:
            r4.recycle()
            return
    }
}
