package com.google.android.material.internal;

/* loaded from: classes.dex */
public class VisibilityAwareImageButton extends android.widget.ImageButton {
    private int userSetVisibility;

    public VisibilityAwareImageButton(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public VisibilityAwareImageButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public VisibilityAwareImageButton(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            int r1 = r0.getVisibility()
            r0.userSetVisibility = r1
            return
    }

    public final int getUserSetVisibility() {
            r1 = this;
            int r0 = r1.userSetVisibility
            return r0
    }

    public final void internalSetVisibility(int r1, boolean r2) {
            r0 = this;
            super.setVisibility(r1)
            if (r2 == 0) goto L7
            r0.userSetVisibility = r1
        L7:
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            r0 = 1
            r1.internalSetVisibility(r2, r0)
            return
    }
}
