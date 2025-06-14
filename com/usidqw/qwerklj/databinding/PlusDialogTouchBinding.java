package com.usidqw.qwerklj.databinding;

/* loaded from: classes.dex */
public final class PlusDialogTouchBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView dialogSuccess;
    private final android.widget.LinearLayout rootView;
    public final android.widget.TextView touch1;
    public final android.widget.TextView touch2;
    public final android.widget.TextView touch3;
    public final android.widget.TextView touch4;
    public final android.widget.TextView touch5;
    public final android.widget.TextView touch6;
    public final android.widget.TextView touch7;
    public final android.widget.TextView touch8;
    public final android.widget.TextView touch9;

    private PlusDialogTouchBinding(android.widget.LinearLayout r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.dialogSuccess = r2
            r0.touch1 = r3
            r0.touch2 = r4
            r0.touch3 = r5
            r0.touch4 = r6
            r0.touch5 = r7
            r0.touch6 = r8
            r0.touch7 = r9
            r0.touch8 = r10
            r0.touch9 = r11
            return
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogTouchBinding bind(android.view.View r14) {
            r0 = 2139488418(0x7f8600a2, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r0)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L82
            r0 = 2139488717(0x7f8601cd, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L82
            r0 = 2139488718(0x7f8601ce, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L82
            r0 = 2139488719(0x7f8601cf, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L82
            r0 = 2139488720(0x7f8601d0, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L82
            r0 = 2139488721(0x7f8601d1, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L82
            r0 = 2139488722(0x7f8601d2, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r0)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L82
            r0 = 2139488723(0x7f8601d3, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r0)
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L82
            r0 = 2139488724(0x7f8601d4, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r0)
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L82
            r0 = 2139488725(0x7f8601d5, float:NaN)
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r0)
            r13 = r1
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L82
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = new com.usidqw.qwerklj.databinding.PlusDialogTouchBinding
            r3 = r14
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L82:
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogTouchBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static com.usidqw.qwerklj.databinding.PlusDialogTouchBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            r0 = -2046033815(0xffffffff860c0069, float:-2.6331375E-35)
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Ld
            r3.addView(r2)
        Ld:
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r2 = bind(r2)
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
