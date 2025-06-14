package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class DividerItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private static final int[] ATTRS = null;
    public static final int HORIZONTAL = 0;
    private static final java.lang.String TAG = "DividerItem";
    public static final int VERTICAL = 1;
    private final android.graphics.Rect mBounds;
    private android.graphics.drawable.Drawable mDivider;
    private int mOrientation;

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843284(0x1010214, float:2.369505E-38)
            r0[r1] = r2
            androidx.recyclerview.widget.DividerItemDecoration.ATTRS = r0
            return
    }

    public DividerItemDecoration(android.content.Context r3, int r4) {
            r2 = this;
            r2.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mBounds = r0
            int[] r0 = androidx.recyclerview.widget.DividerItemDecoration.ATTRS
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r0)
            r0 = 0
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r2.mDivider = r0
            if (r0 != 0) goto L20
            java.lang.String r0 = "DividerItem"
            java.lang.String r1 = "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()"
            android.util.Log.w(r0, r1)
        L20:
            r3.recycle()
            r2.setOrientation(r4)
            return
    }

    private void drawHorizontal(android.graphics.Canvas r8, androidx.recyclerview.widget.RecyclerView r9) {
            r7 = this;
            r8.save()
            boolean r0 = r9.getClipToPadding()
            r1 = 0
            if (r0 == 0) goto L28
            int r0 = r9.getPaddingTop()
            int r2 = r9.getHeight()
            int r3 = r9.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r9.getPaddingLeft()
            int r4 = r9.getWidth()
            int r5 = r9.getPaddingRight()
            int r4 = r4 - r5
            r8.clipRect(r3, r0, r4, r2)
            goto L2d
        L28:
            int r2 = r9.getHeight()
            r0 = r1
        L2d:
            int r3 = r9.getChildCount()
        L31:
            if (r1 >= r3) goto L62
            android.view.View r4 = r9.getChildAt(r1)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r9.getLayoutManager()
            android.graphics.Rect r6 = r7.mBounds
            r5.getDecoratedBoundsWithMargins(r4, r6)
            android.graphics.Rect r5 = r7.mBounds
            int r5 = r5.right
            float r4 = r4.getTranslationX()
            int r4 = java.lang.Math.round(r4)
            int r5 = r5 + r4
            android.graphics.drawable.Drawable r4 = r7.mDivider
            int r4 = r4.getIntrinsicWidth()
            int r4 = r5 - r4
            android.graphics.drawable.Drawable r6 = r7.mDivider
            r6.setBounds(r4, r0, r5, r2)
            android.graphics.drawable.Drawable r4 = r7.mDivider
            r4.draw(r8)
            int r1 = r1 + 1
            goto L31
        L62:
            r8.restore()
            return
    }

    private void drawVertical(android.graphics.Canvas r8, androidx.recyclerview.widget.RecyclerView r9) {
            r7 = this;
            r8.save()
            boolean r0 = r9.getClipToPadding()
            r1 = 0
            if (r0 == 0) goto L28
            int r0 = r9.getPaddingLeft()
            int r2 = r9.getWidth()
            int r3 = r9.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r9.getPaddingTop()
            int r4 = r9.getHeight()
            int r5 = r9.getPaddingBottom()
            int r4 = r4 - r5
            r8.clipRect(r0, r3, r2, r4)
            goto L2d
        L28:
            int r2 = r9.getWidth()
            r0 = r1
        L2d:
            int r3 = r9.getChildCount()
        L31:
            if (r1 >= r3) goto L5e
            android.view.View r4 = r9.getChildAt(r1)
            android.graphics.Rect r5 = r7.mBounds
            r9.getDecoratedBoundsWithMargins(r4, r5)
            android.graphics.Rect r5 = r7.mBounds
            int r5 = r5.bottom
            float r4 = r4.getTranslationY()
            int r4 = java.lang.Math.round(r4)
            int r5 = r5 + r4
            android.graphics.drawable.Drawable r4 = r7.mDivider
            int r4 = r4.getIntrinsicHeight()
            int r4 = r5 - r4
            android.graphics.drawable.Drawable r6 = r7.mDivider
            r6.setBounds(r0, r4, r2, r5)
            android.graphics.drawable.Drawable r4 = r7.mDivider
            r4.draw(r8)
            int r1 = r1 + 1
            goto L31
        L5e:
            r8.restore()
            return
    }

    public android.graphics.drawable.Drawable getDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDivider
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect r2, android.view.View r3, androidx.recyclerview.widget.RecyclerView r4, androidx.recyclerview.widget.RecyclerView.State r5) {
            r1 = this;
            android.graphics.drawable.Drawable r3 = r1.mDivider
            r4 = 0
            if (r3 != 0) goto L9
            r2.set(r4, r4, r4, r4)
            return
        L9:
            int r5 = r1.mOrientation
            r0 = 1
            if (r5 != r0) goto L16
            int r3 = r3.getIntrinsicHeight()
            r2.set(r4, r4, r4, r3)
            goto L1d
        L16:
            int r3 = r3.getIntrinsicWidth()
            r2.set(r4, r4, r3, r4)
        L1d:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(android.graphics.Canvas r2, androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r3.getLayoutManager()
            if (r4 == 0) goto L17
            android.graphics.drawable.Drawable r4 = r1.mDivider
            if (r4 != 0) goto Lb
            goto L17
        Lb:
            int r4 = r1.mOrientation
            r0 = 1
            if (r4 != r0) goto L14
            r1.drawVertical(r2, r3)
            goto L17
        L14:
            r1.drawHorizontal(r2, r3)
        L17:
            return
    }

    public void setDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.mDivider = r2
            return
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Drawable cannot be null."
            r2.<init>(r0)
            throw r2
    }

    public void setOrientation(int r2) {
            r1 = this;
            if (r2 == 0) goto Le
            r0 = 1
            if (r2 != r0) goto L6
            goto Le
        L6:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid orientation. It should be either HORIZONTAL or VERTICAL"
            r2.<init>(r0)
            throw r2
        Le:
            r1.mOrientation = r2
            return
    }
}
