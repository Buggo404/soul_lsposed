package com.google.android.material.dialog;

/* loaded from: classes.dex */
public class MaterialAlertDialogBuilder extends androidx.appcompat.app.AlertDialog.Builder {
    private static final int DEF_STYLE_ATTR = 0;
    private static final int DEF_STYLE_RES = 0;
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = 0;
    private android.graphics.drawable.Drawable background;
    private final android.graphics.Rect backgroundInsets;

    static {
            int r0 = com.google.android.material.C0479R.attr.alertDialogStyle
            com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_ATTR = r0
            int r0 = com.google.android.material.C0479R.style.MaterialAlertDialog_MaterialComponents
            com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_RES = r0
            int r0 = com.google.android.material.C0479R.attr.materialAlertDialogTheme
            com.google.android.material.dialog.MaterialAlertDialogBuilder.MATERIAL_ALERT_DIALOG_THEME_OVERLAY = r0
            return
    }

    public MaterialAlertDialogBuilder(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialAlertDialogBuilder(android.content.Context r6, int r7) {
            r5 = this;
            android.content.Context r0 = createMaterialAlertDialogThemedContext(r6)
            int r6 = getOverridingThemeResId(r6, r7)
            r5.<init>(r0, r6)
            android.content.Context r6 = r5.getContext()
            android.content.res.Resources$Theme r7 = r6.getTheme()
            int r0 = com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_ATTR
            int r1 = com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_RES
            android.graphics.Rect r2 = com.google.android.material.dialog.MaterialDialogs.getDialogBackgroundInsets(r6, r0, r1)
            r5.backgroundInsets = r2
            int r2 = com.google.android.material.C0479R.attr.colorSurface
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            int r2 = com.google.android.material.color.MaterialColors.getColor(r6, r2, r3)
            com.google.android.material.shape.MaterialShapeDrawable r3 = new com.google.android.material.shape.MaterialShapeDrawable
            r4 = 0
            r3.<init>(r6, r4, r0, r1)
            r3.initializeElevationOverlay(r6)
            android.content.res.ColorStateList r6 = android.content.res.ColorStateList.valueOf(r2)
            r3.setFillColor(r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r6 < r0) goto L6a
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            r0 = 16844145(0x1010571, float:2.3697462E-38)
            r1 = 1
            r7.resolveAttribute(r0, r6, r1)
            android.content.Context r7 = r5.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r6.getDimension(r7)
            int r6 = r6.type
            r0 = 5
            if (r6 != r0) goto L6a
            r6 = 0
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 < 0) goto L6a
            r3.setCornerSize(r7)
        L6a:
            r5.background = r3
            return
    }

    private static android.content.Context createMaterialAlertDialogThemedContext(android.content.Context r4) {
            int r0 = getMaterialAlertDialogThemeOverlay(r4)
            int r1 = com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_ATTR
            int r2 = com.google.android.material.dialog.MaterialAlertDialogBuilder.DEF_STYLE_RES
            r3 = 0
            android.content.Context r4 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r4, r3, r1, r2)
            if (r0 != 0) goto L10
            return r4
        L10:
            androidx.appcompat.view.ContextThemeWrapper r1 = new androidx.appcompat.view.ContextThemeWrapper
            r1.<init>(r4, r0)
            return r1
    }

    private static int getMaterialAlertDialogThemeOverlay(android.content.Context r1) {
            int r0 = com.google.android.material.dialog.MaterialAlertDialogBuilder.MATERIAL_ALERT_DIALOG_THEME_OVERLAY
            android.util.TypedValue r1 = com.google.android.material.resources.MaterialAttributes.resolve(r1, r0)
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            int r1 = r1.data
            return r1
    }

    private static int getOverridingThemeResId(android.content.Context r0, int r1) {
            if (r1 != 0) goto L6
            int r1 = getMaterialAlertDialogThemeOverlay(r0)
        L6:
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public androidx.appcompat.app.AlertDialog create() {
            r5 = this;
            androidx.appcompat.app.AlertDialog r0 = super.create()
            android.view.Window r1 = r0.getWindow()
            android.view.View r2 = r1.getDecorView()
            android.graphics.drawable.Drawable r3 = r5.background
            boolean r4 = r3 instanceof com.google.android.material.shape.MaterialShapeDrawable
            if (r4 == 0) goto L1b
            com.google.android.material.shape.MaterialShapeDrawable r3 = (com.google.android.material.shape.MaterialShapeDrawable) r3
            float r4 = androidx.core.view.ViewCompat.getElevation(r2)
            r3.setElevation(r4)
        L1b:
            android.graphics.drawable.Drawable r3 = r5.background
            android.graphics.Rect r4 = r5.backgroundInsets
            android.graphics.drawable.InsetDrawable r3 = com.google.android.material.dialog.MaterialDialogs.insetDrawable(r3, r4)
            r1.setBackgroundDrawable(r3)
            com.google.android.material.dialog.InsetDialogOnTouchListener r1 = new com.google.android.material.dialog.InsetDialogOnTouchListener
            android.graphics.Rect r3 = r5.backgroundInsets
            r1.<init>(r0, r3)
            r2.setOnTouchListener(r1)
            return r0
    }

    public android.graphics.drawable.Drawable getBackground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.background
            return r0
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setAdapter(android.widget.ListAdapter r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setAdapter(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setAdapter(android.widget.ListAdapter r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setAdapter(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    public com.google.android.material.dialog.MaterialAlertDialogBuilder setBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.background = r1
            return r0
    }

    public com.google.android.material.dialog.MaterialAlertDialogBuilder setBackgroundInsetBottom(int r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.backgroundInsets
            r0.bottom = r2
            return r1
    }

    public com.google.android.material.dialog.MaterialAlertDialogBuilder setBackgroundInsetEnd(int r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L18
            android.graphics.Rect r0 = r2.backgroundInsets
            r0.left = r3
            goto L1c
        L18:
            android.graphics.Rect r0 = r2.backgroundInsets
            r0.right = r3
        L1c:
            return r2
    }

    public com.google.android.material.dialog.MaterialAlertDialogBuilder setBackgroundInsetStart(int r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L18
            android.graphics.Rect r0 = r2.backgroundInsets
            r0.right = r3
            goto L1c
        L18:
            android.graphics.Rect r0 = r2.backgroundInsets
            r0.left = r3
        L1c:
            return r2
    }

    public com.google.android.material.dialog.MaterialAlertDialogBuilder setBackgroundInsetTop(int r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.backgroundInsets
            r0.top = r2
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setCancelable(boolean r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setCancelable(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setCancelable(boolean r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setCancelable(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setCursor(android.database.Cursor r1, android.content.DialogInterface.OnClickListener r2, java.lang.String r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setCursor(r1, r2, r3)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setCursor(android.database.Cursor r1, android.content.DialogInterface.OnClickListener r2, java.lang.String r3) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setCursor(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setCustomTitle(android.view.View r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setCustomTitle(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setCustomTitle(android.view.View r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setCustomTitle(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setIcon(int r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setIcon(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setIcon(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setIcon(int r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setIcon(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setIcon(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setIconAttribute(int r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setIconAttribute(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setIconAttribute(int r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setIconAttribute(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setItems(int r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setItems(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setItems(java.lang.CharSequence[] r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setItems(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setItems(int r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setItems(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setItems(java.lang.CharSequence[] r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setItems(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setMessage(int r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setMessage(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setMessage(java.lang.CharSequence r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setMessage(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setMessage(int r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setMessage(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setMessage(java.lang.CharSequence r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setMessage(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setMultiChoiceItems(int r1, boolean[] r2, android.content.DialogInterface.OnMultiChoiceClickListener r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setMultiChoiceItems(r1, r2, r3)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setMultiChoiceItems(android.database.Cursor r1, java.lang.String r2, java.lang.String r3, android.content.DialogInterface.OnMultiChoiceClickListener r4) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setMultiChoiceItems(r1, r2, r3, r4)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setMultiChoiceItems(java.lang.CharSequence[] r1, boolean[] r2, android.content.DialogInterface.OnMultiChoiceClickListener r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setMultiChoiceItems(r1, r2, r3)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setMultiChoiceItems(int r1, boolean[] r2, android.content.DialogInterface.OnMultiChoiceClickListener r3) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setMultiChoiceItems(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setMultiChoiceItems(android.database.Cursor r1, java.lang.String r2, java.lang.String r3, android.content.DialogInterface.OnMultiChoiceClickListener r4) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setMultiChoiceItems(r1, r2, r3, r4)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setMultiChoiceItems(java.lang.CharSequence[] r1, boolean[] r2, android.content.DialogInterface.OnMultiChoiceClickListener r3) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setMultiChoiceItems(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setNegativeButton(int r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setNegativeButton(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setNegativeButton(java.lang.CharSequence r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setNegativeButton(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setNegativeButton(int r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setNegativeButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setNegativeButton(java.lang.CharSequence r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setNegativeButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setNegativeButtonIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setNegativeButtonIcon(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setNegativeButtonIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setNegativeButtonIcon(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setNeutralButton(int r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setNeutralButton(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setNeutralButton(java.lang.CharSequence r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setNeutralButton(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setNeutralButton(int r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setNeutralButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setNeutralButton(java.lang.CharSequence r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setNeutralButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setNeutralButtonIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setNeutralButtonIcon(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setNeutralButtonIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setNeutralButtonIcon(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setOnCancelListener(android.content.DialogInterface.OnCancelListener r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setOnCancelListener(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setOnCancelListener(android.content.DialogInterface.OnCancelListener r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setOnCancelListener(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setOnDismissListener(android.content.DialogInterface.OnDismissListener r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setOnDismissListener(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setOnDismissListener(android.content.DialogInterface.OnDismissListener r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setOnDismissListener(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setOnItemSelectedListener(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setOnItemSelectedListener(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setOnKeyListener(android.content.DialogInterface.OnKeyListener r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setOnKeyListener(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setOnKeyListener(android.content.DialogInterface.OnKeyListener r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setOnKeyListener(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setPositiveButton(int r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setPositiveButton(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setPositiveButton(java.lang.CharSequence r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setPositiveButton(r1, r2)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setPositiveButton(int r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setPositiveButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setPositiveButton(java.lang.CharSequence r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setPositiveButton(r1, r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setPositiveButtonIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setPositiveButtonIcon(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setPositiveButtonIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setPositiveButtonIcon(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(int r1, int r2, android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setSingleChoiceItems(r1, r2, r3)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(android.database.Cursor r1, int r2, java.lang.String r3, android.content.DialogInterface.OnClickListener r4) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setSingleChoiceItems(r1, r2, r3, r4)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(android.widget.ListAdapter r1, int r2, android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setSingleChoiceItems(r1, r2, r3)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(java.lang.CharSequence[] r1, int r2, android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setSingleChoiceItems(r1, r2, r3)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setSingleChoiceItems(int r1, int r2, android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setSingleChoiceItems(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setSingleChoiceItems(android.database.Cursor r1, int r2, java.lang.String r3, android.content.DialogInterface.OnClickListener r4) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setSingleChoiceItems(r1, r2, r3, r4)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setSingleChoiceItems(android.widget.ListAdapter r1, int r2, android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setSingleChoiceItems(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setSingleChoiceItems(java.lang.CharSequence[] r1, int r2, android.content.DialogInterface.OnClickListener r3) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setSingleChoiceItems(r1, r2, r3)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setTitle(int r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setTitle(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setTitle(java.lang.CharSequence r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setTitle(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setTitle(int r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setTitle(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setTitle(java.lang.CharSequence r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setTitle(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setView(int r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setView(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public /* bridge */ /* synthetic */ androidx.appcompat.app.AlertDialog.Builder setView(android.view.View r1) {
            r0 = this;
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = r0.setView(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setView(int r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setView(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public com.google.android.material.dialog.MaterialAlertDialogBuilder setView(android.view.View r1) {
            r0 = this;
            androidx.appcompat.app.AlertDialog$Builder r1 = super.setView(r1)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r1 = (com.google.android.material.dialog.MaterialAlertDialogBuilder) r1
            return r1
    }
}
