package com.usidqw.qwerklj.databinding;

/* loaded from: classes.dex */
public final class PlusDialogMessageBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView dialogCancel;
    public final android.widget.TextView dialogDesc;
    public final android.widget.TextView dialogSuccess;
    public final android.widget.TextView dialogTitle;
    private final android.widget.LinearLayout rootView;
    public final android.view.View viewHide;

    private PlusDialogMessageBinding(android.widget.LinearLayout r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, android.view.View r6) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.dialogCancel = r2
            r0.dialogDesc = r3
            r0.dialogSuccess = r4
            r0.dialogTitle = r5
            r0.viewHide = r6
            return
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogMessageBinding bind(android.view.View r9) {
            r0 = 2139488412(0x7f86009c, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r0)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L43
            r0 = 2139488413(0x7f86009d, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L43
            r0 = 2139488418(0x7f8600a2, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L43
            r0 = 2139488419(0x7f8600a3, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L43
            r0 = 2139488741(0x7f8601e5, float:NaN)
            android.view.View r8 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r0)
            if (r8 == 0) goto L43
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r0 = new com.usidqw.qwerklj.databinding.PlusDialogMessageBinding
            r3 = r9
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L43:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogMessageBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogMessageBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            r0 = -2046033816(0xffffffff860c0068, float:-2.6331372E-35)
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Ld
            r3.addView(r2)
        Ld:
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r2 = bind(r2)
            return r2
    }

    @Override // androidx.viewbinding.ViewBinding
    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.getRoot()
            return r0
    }

    @Override // androidx.viewbinding.ViewBinding
    public android.widget.LinearLayout getRoot() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.rootView
            return r0
    }
}
