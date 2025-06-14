package com.usidqw.qwerklj.databinding;

/* loaded from: classes.dex */
public final class PlusDialogListEditInputItemBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView delete;
    public final android.widget.TextView dialogKey;
    public final android.widget.LinearLayout main;
    private final android.widget.LinearLayout rootView;

    private PlusDialogListEditInputItemBinding(android.widget.LinearLayout r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.LinearLayout r4) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.delete = r2
            r0.dialogKey = r3
            r0.main = r4
            return
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogListEditInputItemBinding bind(android.view.View r3) {
            r0 = 2139488400(0x7f860090, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r3, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L1e
            r0 = 2139488416(0x7f8600a0, float:NaN)
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r3, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L1e
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            com.usidqw.qwerklj.databinding.PlusDialogListEditInputItemBinding r0 = new com.usidqw.qwerklj.databinding.PlusDialogListEditInputItemBinding
            r0.<init>(r3, r1, r2, r3)
            return r0
        L1e:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogListEditInputItemBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.usidqw.qwerklj.databinding.PlusDialogListEditInputItemBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogListEditInputItemBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            r0 = -2046033819(0xffffffff860c0065, float:-2.6331363E-35)
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Ld
            r3.addView(r2)
        Ld:
            com.usidqw.qwerklj.databinding.PlusDialogListEditInputItemBinding r2 = bind(r2)
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
