package com.google.android.material.tabs;

/* loaded from: classes.dex */
public class TabItem extends android.view.View {
    public final int customLayout;
    public final android.graphics.drawable.Drawable icon;
    public final java.lang.CharSequence text;

    public TabItem(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TabItem(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            int[] r0 = com.google.android.material.C0479R.styleable.TabItem
            androidx.appcompat.widget.TintTypedArray r2 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r2, r3, r0)
            int r3 = com.google.android.material.C0479R.styleable.TabItem_android_text
            java.lang.CharSequence r3 = r2.getText(r3)
            r1.text = r3
            int r3 = com.google.android.material.C0479R.styleable.TabItem_android_icon
            android.graphics.drawable.Drawable r3 = r2.getDrawable(r3)
            r1.icon = r3
            int r3 = com.google.android.material.C0479R.styleable.TabItem_android_layout
            r0 = 0
            int r3 = r2.getResourceId(r3, r0)
            r1.customLayout = r3
            r2.recycle()
            return
    }
}
