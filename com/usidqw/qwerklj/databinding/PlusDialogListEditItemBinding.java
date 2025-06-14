package com.usidqw.qwerklj.databinding;

/* loaded from: classes.dex */
public final class PlusDialogListEditItemBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView delete;
    public final android.widget.TextView dialogKey;
    public final android.widget.TextView dialogValue;
    public final android.widget.LinearLayout main;
    private final android.widget.LinearLayout rootView;

    private PlusDialogListEditItemBinding(android.widget.LinearLayout r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.LinearLayout r5) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.delete = r2
            r0.dialogKey = r3
            r0.dialogValue = r4
            r0.main = r5
            return
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogListEditItemBinding bind(android.view.View r8) {
            r0 = 2139488400(0x7f860090, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r0)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L2f
            r0 = 2139488416(0x7f8600a0, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L2f
            r0 = 2139488420(0x7f8600a4, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L2f
            r7 = r8
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            com.usidqw.qwerklj.databinding.PlusDialogListEditItemBinding r8 = new com.usidqw.qwerklj.databinding.PlusDialogListEditItemBinding
            r2 = r8
            r3 = r7
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
        L2f:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogListEditItemBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.usidqw.qwerklj.databinding.PlusDialogListEditItemBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogListEditItemBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            r0 = -2046033818(0xffffffff860c0066, float:-2.6331366E-35)
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Ld
            r3.addView(r2)
        Ld:
            com.usidqw.qwerklj.databinding.PlusDialogListEditItemBinding r2 = bind(r2)
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
