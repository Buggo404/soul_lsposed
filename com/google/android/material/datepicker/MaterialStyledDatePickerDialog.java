package com.google.android.material.datepicker;

/* loaded from: classes.dex */
public class MaterialStyledDatePickerDialog extends android.app.DatePickerDialog {
    private static final int DEF_STYLE_ATTR = 16843612;
    private static final int DEF_STYLE_RES = 0;
    private final android.graphics.drawable.Drawable background;
    private final android.graphics.Rect backgroundInsets;

    static {
            int r0 = com.google.android.material.C0479R.style.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner
            com.google.android.material.datepicker.MaterialStyledDatePickerDialog.DEF_STYLE_RES = r0
            return
    }

    public MaterialStyledDatePickerDialog(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialStyledDatePickerDialog(android.content.Context r8, int r9) {
            r7 = this;
            r3 = 0
            r4 = -1
            r5 = -1
            r6 = -1
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public MaterialStyledDatePickerDialog(android.content.Context r1, int r2, android.app.DatePickerDialog.OnDateSetListener r3, int r4, int r5, int r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.content.Context r1 = r0.getContext()
            android.content.Context r2 = r0.getContext()
            int r3 = com.google.android.material.C0479R.attr.colorSurface
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            int r2 = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(r2, r3, r4)
            com.google.android.material.shape.MaterialShapeDrawable r3 = new com.google.android.material.shape.MaterialShapeDrawable
            int r4 = com.google.android.material.datepicker.MaterialStyledDatePickerDialog.DEF_STYLE_RES
            r5 = 0
            r6 = 16843612(0x101035c, float:2.3695968E-38)
            r3.<init>(r1, r5, r6, r4)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r3.setFillColor(r2)
            android.graphics.Rect r1 = com.google.android.material.dialog.MaterialDialogs.getDialogBackgroundInsets(r1, r6, r4)
            r0.backgroundInsets = r1
            android.graphics.drawable.InsetDrawable r1 = com.google.android.material.dialog.MaterialDialogs.insetDrawable(r3, r1)
            r0.background = r1
            return
    }

    public MaterialStyledDatePickerDialog(android.content.Context r8, android.app.DatePickerDialog.OnDateSetListener r9, int r10, int r11, int r12) {
            r7 = this;
            r2 = 0
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            android.view.Window r3 = r2.getWindow()
            android.graphics.drawable.Drawable r0 = r2.background
            r3.setBackgroundDrawable(r0)
            android.view.Window r3 = r2.getWindow()
            android.view.View r3 = r3.getDecorView()
            com.google.android.material.dialog.InsetDialogOnTouchListener r0 = new com.google.android.material.dialog.InsetDialogOnTouchListener
            android.graphics.Rect r1 = r2.backgroundInsets
            r0.<init>(r2, r1)
            r3.setOnTouchListener(r0)
            return
    }
}
