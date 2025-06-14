package com.google.android.material.internal;

/* loaded from: classes.dex */
public class TextDrawableHelper {
    private java.lang.ref.WeakReference<com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate> delegate;
    private final com.google.android.material.resources.TextAppearanceFontCallback fontCallback;
    private com.google.android.material.resources.TextAppearance textAppearance;
    private final android.text.TextPaint textPaint;
    private float textWidth;
    private boolean textWidthDirty;


    public interface TextDrawableDelegate {
        int[] getState();

        boolean onStateChange(int[] r1);

        void onTextSizeChange();
    }

    public TextDrawableHelper(com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate r3) {
            r2 = this;
            r2.<init>()
            android.text.TextPaint r0 = new android.text.TextPaint
            r1 = 1
            r0.<init>(r1)
            r2.textPaint = r0
            com.google.android.material.internal.TextDrawableHelper$1 r0 = new com.google.android.material.internal.TextDrawableHelper$1
            r0.<init>(r2)
            r2.fontCallback = r0
            r2.textWidthDirty = r1
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r2.delegate = r0
            r2.setDelegate(r3)
            return
    }

    static /* synthetic */ boolean access$002(com.google.android.material.internal.TextDrawableHelper r0, boolean r1) {
            r0.textWidthDirty = r1
            return r1
    }

    static /* synthetic */ java.lang.ref.WeakReference access$100(com.google.android.material.internal.TextDrawableHelper r0) {
            java.lang.ref.WeakReference<com.google.android.material.internal.TextDrawableHelper$TextDrawableDelegate> r0 = r0.delegate
            return r0
    }

    private float calculateTextWidth(java.lang.CharSequence r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            android.text.TextPaint r0 = r3.textPaint
            r1 = 0
            int r2 = r4.length()
            float r4 = r0.measureText(r4, r1, r2)
            return r4
    }

    public com.google.android.material.resources.TextAppearance getTextAppearance() {
            r1 = this;
            com.google.android.material.resources.TextAppearance r0 = r1.textAppearance
            return r0
    }

    public android.text.TextPaint getTextPaint() {
            r1 = this;
            android.text.TextPaint r0 = r1.textPaint
            return r0
    }

    public float getTextWidth(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.textWidthDirty
            if (r0 != 0) goto L7
            float r2 = r1.textWidth
            return r2
        L7:
            float r2 = r1.calculateTextWidth(r2)
            r1.textWidth = r2
            r0 = 0
            r1.textWidthDirty = r0
            return r2
    }

    public boolean isTextWidthDirty() {
            r1 = this;
            boolean r0 = r1.textWidthDirty
            return r0
    }

    public void setDelegate(com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.delegate = r0
            return
    }

    public void setTextAppearance(com.google.android.material.resources.TextAppearance r3, android.content.Context r4) {
            r2 = this;
            com.google.android.material.resources.TextAppearance r0 = r2.textAppearance
            if (r0 == r3) goto L3f
            r2.textAppearance = r3
            if (r3 == 0) goto L2b
            android.text.TextPaint r0 = r2.textPaint
            com.google.android.material.resources.TextAppearanceFontCallback r1 = r2.fontCallback
            r3.updateMeasureState(r4, r0, r1)
            java.lang.ref.WeakReference<com.google.android.material.internal.TextDrawableHelper$TextDrawableDelegate> r0 = r2.delegate
            java.lang.Object r0 = r0.get()
            com.google.android.material.internal.TextDrawableHelper$TextDrawableDelegate r0 = (com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate) r0
            if (r0 == 0) goto L21
            android.text.TextPaint r1 = r2.textPaint
            int[] r0 = r0.getState()
            r1.drawableState = r0
        L21:
            android.text.TextPaint r0 = r2.textPaint
            com.google.android.material.resources.TextAppearanceFontCallback r1 = r2.fontCallback
            r3.updateDrawState(r4, r0, r1)
            r3 = 1
            r2.textWidthDirty = r3
        L2b:
            java.lang.ref.WeakReference<com.google.android.material.internal.TextDrawableHelper$TextDrawableDelegate> r3 = r2.delegate
            java.lang.Object r3 = r3.get()
            com.google.android.material.internal.TextDrawableHelper$TextDrawableDelegate r3 = (com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate) r3
            if (r3 == 0) goto L3f
            r3.onTextSizeChange()
            int[] r4 = r3.getState()
            r3.onStateChange(r4)
        L3f:
            return
    }

    public void setTextWidthDirty(boolean r1) {
            r0 = this;
            r0.textWidthDirty = r1
            return
    }

    public void updateTextPaintDrawState(android.content.Context r4) {
            r3 = this;
            com.google.android.material.resources.TextAppearance r0 = r3.textAppearance
            android.text.TextPaint r1 = r3.textPaint
            com.google.android.material.resources.TextAppearanceFontCallback r2 = r3.fontCallback
            r0.updateDrawState(r4, r1, r2)
            return
    }
}
