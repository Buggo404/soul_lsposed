package com.usidqw.qwerklj.databinding;

/* loaded from: classes.dex */
public final class ActivityMainBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private ActivityMainBinding(androidx.constraintlayout.widget.ConstraintLayout r1) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            return
    }

    public static com.usidqw.qwerklj.databinding.ActivityMainBinding bind(android.view.View r1) {
            if (r1 == 0) goto La
            com.usidqw.qwerklj.databinding.ActivityMainBinding r0 = new com.usidqw.qwerklj.databinding.ActivityMainBinding
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r0.<init>(r1)
            return r0
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "rootView"
            r1.<init>(r0)
            throw r1
    }

    public static com.usidqw.qwerklj.databinding.ActivityMainBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.usidqw.qwerklj.databinding.ActivityMainBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static com.usidqw.qwerklj.databinding.ActivityMainBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            r0 = -2046033892(0xffffffff860c001c, float:-2.6331154E-35)
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Ld
            r3.addView(r2)
        Ld:
            com.usidqw.qwerklj.databinding.ActivityMainBinding r2 = bind(r2)
            return r2
    }

    @Override // androidx.viewbinding.ViewBinding
    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.getRoot()
            return r0
    }

    @Override // androidx.viewbinding.ViewBinding
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.rootView
            return r0
    }
}
