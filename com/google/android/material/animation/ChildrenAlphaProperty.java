package com.google.android.material.animation;

/* loaded from: classes.dex */
public class ChildrenAlphaProperty extends android.util.Property<android.view.ViewGroup, java.lang.Float> {
    public static final android.util.Property<android.view.ViewGroup, java.lang.Float> CHILDREN_ALPHA = null;

    static {
            com.google.android.material.animation.ChildrenAlphaProperty r0 = new com.google.android.material.animation.ChildrenAlphaProperty
            java.lang.String r1 = "childrenAlpha"
            r0.<init>(r1)
            com.google.android.material.animation.ChildrenAlphaProperty.CHILDREN_ALPHA = r0
            return
    }

    private ChildrenAlphaProperty(java.lang.String r2) {
            r1 = this;
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            r1.<init>(r0, r2)
            return
    }

    /* renamed from: get, reason: avoid collision after fix types in other method */
    public java.lang.Float get2(android.view.ViewGroup r2) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.id.mtrl_internal_children_alpha_tag
            java.lang.Object r2 = r2.getTag(r0)
            java.lang.Float r2 = (java.lang.Float) r2
            if (r2 == 0) goto Lb
            return r2
        Lb:
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ java.lang.Float get(android.view.ViewGroup r1) {
            r0 = this;
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            java.lang.Float r1 = r0.get2(r1)
            return r1
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public void set2(android.view.ViewGroup r4, java.lang.Float r5) {
            r3 = this;
            float r5 = r5.floatValue()
            int r0 = com.google.android.material.C0479R.id.mtrl_internal_children_alpha_tag
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            r4.setTag(r0, r1)
            int r0 = r4.getChildCount()
            r1 = 0
        L12:
            if (r1 >= r0) goto L1e
            android.view.View r2 = r4.getChildAt(r1)
            r2.setAlpha(r5)
            int r1 = r1 + 1
            goto L12
        L1e:
            return
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(android.view.ViewGroup r1, java.lang.Float r2) {
            r0 = this;
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            java.lang.Float r2 = (java.lang.Float) r2
            r0.set2(r1, r2)
            return
    }
}
