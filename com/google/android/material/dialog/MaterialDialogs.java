package com.google.android.material.dialog;

/* loaded from: classes.dex */
public class MaterialDialogs {
    private MaterialDialogs() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Rect getDialogBackgroundInsets(android.content.Context r7, int r8, int r9) {
            r1 = 0
            int[] r2 = com.google.android.material.C0479R.styleable.MaterialAlertDialog
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r7
            r3 = r8
            r4 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.C0479R.styleable.MaterialAlertDialog_backgroundInsetStart
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.google.android.material.C0479R.dimen.mtrl_alert_dialog_background_inset_start
            int r0 = r0.getDimensionPixelSize(r1)
            int r9 = r8.getDimensionPixelSize(r9, r0)
            int r0 = com.google.android.material.C0479R.styleable.MaterialAlertDialog_backgroundInsetTop
            android.content.res.Resources r1 = r7.getResources()
            int r2 = com.google.android.material.C0479R.dimen.mtrl_alert_dialog_background_inset_top
            int r1 = r1.getDimensionPixelSize(r2)
            int r0 = r8.getDimensionPixelSize(r0, r1)
            int r1 = com.google.android.material.C0479R.styleable.MaterialAlertDialog_backgroundInsetEnd
            android.content.res.Resources r2 = r7.getResources()
            int r3 = com.google.android.material.C0479R.dimen.mtrl_alert_dialog_background_inset_end
            int r2 = r2.getDimensionPixelSize(r3)
            int r1 = r8.getDimensionPixelSize(r1, r2)
            int r2 = com.google.android.material.C0479R.styleable.MaterialAlertDialog_backgroundInsetBottom
            android.content.res.Resources r3 = r7.getResources()
            int r4 = com.google.android.material.C0479R.dimen.mtrl_alert_dialog_background_inset_bottom
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r8.getDimensionPixelSize(r2, r3)
            r8.recycle()
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.getLayoutDirection()
            r8 = 1
            if (r7 != r8) goto L62
            r6 = r1
            r1 = r9
            r9 = r6
        L62:
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r9, r0, r1, r2)
            return r7
    }

    public static android.graphics.drawable.InsetDrawable insetDrawable(android.graphics.drawable.Drawable r7, android.graphics.Rect r8) {
            android.graphics.drawable.InsetDrawable r6 = new android.graphics.drawable.InsetDrawable
            int r2 = r8.left
            int r3 = r8.top
            int r4 = r8.right
            int r5 = r8.bottom
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }
}
