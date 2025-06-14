package com.usidqw.qwerklj.databinding;

/* loaded from: classes.dex */
public final class PlusDialogFileItemBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView fileImg;
    public final android.widget.TextView fileName;
    public final android.widget.ImageView fileOpen;
    public final android.widget.TextView fileTime;
    private final android.widget.LinearLayout rootView;

    private PlusDialogFileItemBinding(android.widget.LinearLayout r1, android.widget.ImageView r2, android.widget.TextView r3, android.widget.ImageView r4, android.widget.TextView r5) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.fileImg = r2
            r0.fileName = r3
            r0.fileOpen = r4
            r0.fileTime = r5
            return
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogFileItemBinding bind(android.view.View r8) {
            r0 = 2139488451(0x7f8600c3, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r0)
            r4 = r1
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L3a
            r0 = 2139488452(0x7f8600c4, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L3a
            r0 = 2139488454(0x7f8600c6, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r0)
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L3a
            r0 = 2139488453(0x7f8600c5, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L3a
            com.usidqw.qwerklj.databinding.PlusDialogFileItemBinding r0 = new com.usidqw.qwerklj.databinding.PlusDialogFileItemBinding
            r3 = r8
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L3a:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogFileItemBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.usidqw.qwerklj.databinding.PlusDialogFileItemBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogFileItemBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            r0 = -2046033825(0xffffffff860c005f, float:-2.6331346E-35)
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Ld
            r3.addView(r2)
        Ld:
            com.usidqw.qwerklj.databinding.PlusDialogFileItemBinding r2 = bind(r2)
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
