package com.usidqw.qwerklj.databinding;

/* loaded from: classes.dex */
public final class PlusDialogListItemBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView desc;
    public final android.widget.LinearLayout dialogMain;
    public final android.widget.ImageView open;
    private final android.widget.LinearLayout rootView;
    public final android.widget.Switch switchOpen;
    public final android.widget.TextView title;

    private PlusDialogListItemBinding(android.widget.LinearLayout r1, android.widget.TextView r2, android.widget.LinearLayout r3, android.widget.ImageView r4, android.widget.Switch r5, android.widget.TextView r6) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.desc = r2
            r0.dialogMain = r3
            r0.open = r4
            r0.switchOpen = r5
            r0.title = r6
            return
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogListItemBinding bind(android.view.View r9) {
            r0 = 2139488403(0x7f860093, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r0)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L3b
            r5 = r9
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 2139488583(0x7f860147, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r0)
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L3b
            r0 = 2139488675(0x7f8601a3, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r0)
            r7 = r1
            android.widget.Switch r7 = (android.widget.Switch) r7
            if (r7 == 0) goto L3b
            r0 = 2139488711(0x7f8601c7, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L3b
            com.usidqw.qwerklj.databinding.PlusDialogListItemBinding r9 = new com.usidqw.qwerklj.databinding.PlusDialogListItemBinding
            r2 = r9
            r3 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r9
        L3b:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogListItemBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.usidqw.qwerklj.databinding.PlusDialogListItemBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogListItemBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            r0 = -2046033817(0xffffffff860c0067, float:-2.633137E-35)
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Ld
            r3.addView(r2)
        Ld:
            com.usidqw.qwerklj.databinding.PlusDialogListItemBinding r2 = bind(r2)
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
