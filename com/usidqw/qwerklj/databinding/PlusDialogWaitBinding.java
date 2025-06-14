package com.usidqw.qwerklj.databinding;

/* loaded from: classes.dex */
public final class PlusDialogWaitBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.LinearLayout background;
    public final android.widget.ImageView ivLoading;
    public final android.widget.TextView loadingText;
    private final android.widget.LinearLayout rootView;

    private PlusDialogWaitBinding(android.widget.LinearLayout r1, android.widget.LinearLayout r2, android.widget.ImageView r3, android.widget.TextView r4) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.background = r2
            r0.ivLoading = r3
            r0.loadingText = r4
            return
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogWaitBinding bind(android.view.View r4) {
            r0 = r4
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1 = 2139488494(0x7f8600ee, float:NaN)
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L1f
            r1 = 2139488510(0x7f8600fe, float:NaN)
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L1f
            com.usidqw.qwerklj.databinding.PlusDialogWaitBinding r4 = new com.usidqw.qwerklj.databinding.PlusDialogWaitBinding
            r4.<init>(r0, r0, r2, r3)
            return r4
        L1f:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogWaitBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.usidqw.qwerklj.databinding.PlusDialogWaitBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogWaitBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            r0 = -2046033814(0xffffffff860c006a, float:-2.6331378E-35)
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Ld
            r3.addView(r2)
        Ld:
            com.usidqw.qwerklj.databinding.PlusDialogWaitBinding r2 = bind(r2)
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
