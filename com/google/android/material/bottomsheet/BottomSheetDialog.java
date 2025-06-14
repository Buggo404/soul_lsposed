package com.google.android.material.bottomsheet;

/* loaded from: classes.dex */
public class BottomSheetDialog extends androidx.appcompat.app.AppCompatDialog {
    private com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> behavior;
    private com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private android.widget.FrameLayout container;
    boolean dismissWithAnimation;





    public BottomSheetDialog(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BottomSheetDialog(android.content.Context r1, int r2) {
            r0 = this;
            int r2 = getThemeResId(r1, r2)
            r0.<init>(r1, r2)
            r1 = 1
            r0.cancelable = r1
            r0.canceledOnTouchOutside = r1
            com.google.android.material.bottomsheet.BottomSheetDialog$4 r2 = new com.google.android.material.bottomsheet.BottomSheetDialog$4
            r2.<init>(r0)
            r0.bottomSheetCallback = r2
            r0.supportRequestWindowFeature(r1)
            return
    }

    protected BottomSheetDialog(android.content.Context r1, boolean r2, android.content.DialogInterface.OnCancelListener r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.cancelable = r1
            r0.canceledOnTouchOutside = r1
            com.google.android.material.bottomsheet.BottomSheetDialog$4 r3 = new com.google.android.material.bottomsheet.BottomSheetDialog$4
            r3.<init>(r0)
            r0.bottomSheetCallback = r3
            r0.supportRequestWindowFeature(r1)
            r0.cancelable = r2
            return
    }

    private android.widget.FrameLayout ensureContainerAndBehavior() {
            r3 = this;
            android.widget.FrameLayout r0 = r3.container
            if (r0 != 0) goto L2d
            android.content.Context r0 = r3.getContext()
            int r1 = com.google.android.material.C0479R.layout.design_bottom_sheet_dialog
            r2 = 0
            android.view.View r0 = android.view.View.inflate(r0, r1, r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.container = r0
            int r1 = com.google.android.material.C0479R.id.design_bottom_sheet
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.from(r0)
            r3.behavior = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback r1 = r3.bottomSheetCallback
            r0.addBottomSheetCallback(r1)
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r3.behavior
            boolean r1 = r3.cancelable
            r0.setHideable(r1)
        L2d:
            android.widget.FrameLayout r0 = r3.container
            return r0
    }

    private static int getThemeResId(android.content.Context r2, int r3) {
            if (r3 != 0) goto L19
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int r0 = com.google.android.material.C0479R.attr.bottomSheetDialogTheme
            r1 = 1
            boolean r2 = r2.resolveAttribute(r0, r3, r1)
            if (r2 == 0) goto L17
            int r3 = r3.resourceId
            goto L19
        L17:
            int r3 = com.google.android.material.C0479R.style.Theme_Design_Light_BottomSheetDialog
        L19:
            return r3
    }

    private android.view.View wrapInBottomSheet(int r3, android.view.View r4, android.view.ViewGroup.LayoutParams r5) {
            r2 = this;
            r2.ensureContainerAndBehavior()
            android.widget.FrameLayout r0 = r2.container
            int r1 = com.google.android.material.C0479R.id.coordinator
            android.view.View r0 = r0.findViewById(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            if (r3 == 0) goto L1a
            if (r4 != 0) goto L1a
            android.view.LayoutInflater r4 = r2.getLayoutInflater()
            r1 = 0
            android.view.View r4 = r4.inflate(r3, r0, r1)
        L1a:
            android.widget.FrameLayout r3 = r2.container
            int r1 = com.google.android.material.C0479R.id.design_bottom_sheet
            android.view.View r3 = r3.findViewById(r1)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r3.removeAllViews()
            if (r5 != 0) goto L2d
            r3.addView(r4)
            goto L30
        L2d:
            r3.addView(r4, r5)
        L30:
            int r4 = com.google.android.material.C0479R.id.touch_outside
            android.view.View r4 = r0.findViewById(r4)
            com.google.android.material.bottomsheet.BottomSheetDialog$1 r5 = new com.google.android.material.bottomsheet.BottomSheetDialog$1
            r5.<init>(r2)
            r4.setOnClickListener(r5)
            com.google.android.material.bottomsheet.BottomSheetDialog$2 r4 = new com.google.android.material.bottomsheet.BottomSheetDialog$2
            r4.<init>(r2)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r3, r4)
            com.google.android.material.bottomsheet.BottomSheetDialog$3 r4 = new com.google.android.material.bottomsheet.BottomSheetDialog$3
            r4.<init>(r2)
            r3.setOnTouchListener(r4)
            android.widget.FrameLayout r3 = r2.container
            return r3
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
            r3 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.getBehavior()
            boolean r1 = r3.dismissWithAnimation
            if (r1 == 0) goto L14
            int r1 = r0.getState()
            r2 = 5
            if (r1 != r2) goto L10
            goto L14
        L10:
            r0.setState(r2)
            goto L17
        L14:
            super.cancel()
        L17:
            return
    }

    public com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> getBehavior() {
            r1 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r1.behavior
            if (r0 != 0) goto L7
            r1.ensureContainerAndBehavior()
        L7:
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r1.behavior
            return r0
    }

    public boolean getDismissWithAnimation() {
            r1 = this;
            boolean r0 = r1.dismissWithAnimation
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    protected void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L17
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r2.clearFlags(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.addFlags(r0)
            r0 = -1
            r2.setLayout(r0, r0)
        L17:
            return
    }

    @Override // android.app.Dialog
    protected void onStart() {
            r2 = this;
            super.onStart()
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r2.behavior
            if (r0 == 0) goto L14
            int r0 = r0.getState()
            r1 = 5
            if (r0 != r1) goto L14
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r2.behavior
            r1 = 4
            r0.setState(r1)
        L14:
            return
    }

    void removeDefaultCallback() {
            r2 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r2.behavior
            com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback r1 = r2.bottomSheetCallback
            r0.removeBottomSheetCallback(r1)
            return
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean r2) {
            r1 = this;
            super.setCancelable(r2)
            boolean r0 = r1.cancelable
            if (r0 == r2) goto L10
            r1.cancelable = r2
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r1.behavior
            if (r0 == 0) goto L10
            r0.setHideable(r2)
        L10:
            return
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean r3) {
            r2 = this;
            super.setCanceledOnTouchOutside(r3)
            r0 = 1
            if (r3 == 0) goto Lc
            boolean r1 = r2.cancelable
            if (r1 != 0) goto Lc
            r2.cancelable = r0
        Lc:
            r2.canceledOnTouchOutside = r3
            r2.canceledOnTouchOutsideSet = r0
            return
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setContentView(int r2) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.wrapInBottomSheet(r2, r0, r0)
            super.setContentView(r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setContentView(android.view.View r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            android.view.View r3 = r2.wrapInBottomSheet(r0, r3, r1)
            super.setContentView(r3)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.wrapInBottomSheet(r0, r2, r3)
            super.setContentView(r2)
            return
    }

    public void setDismissWithAnimation(boolean r1) {
            r0 = this;
            r0.dismissWithAnimation = r1
            return
    }

    boolean shouldWindowCloseOnTouchOutside() {
            r5 = this;
            boolean r0 = r5.canceledOnTouchOutsideSet
            if (r0 != 0) goto L20
            android.content.Context r0 = r5.getContext()
            r1 = 1
            int[] r2 = new int[r1]
            r3 = 16843611(0x101035b, float:2.3695965E-38)
            r4 = 0
            r2[r4] = r3
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            boolean r2 = r0.getBoolean(r4, r1)
            r5.canceledOnTouchOutside = r2
            r0.recycle()
            r5.canceledOnTouchOutsideSet = r1
        L20:
            boolean r0 = r5.canceledOnTouchOutside
            return r0
    }
}
