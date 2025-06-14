package com.google.android.material.color;

/* loaded from: classes.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;

    private MaterialColors() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int compositeARGBWithAlpha(int r1, int r2) {
            int r0 = android.graphics.Color.alpha(r1)
            int r0 = r0 * r2
            int r0 = r0 / 255
            int r1 = androidx.core.graphics.ColorUtils.setAlphaComponent(r1, r0)
            return r1
    }

    public static int getColor(android.content.Context r0, int r1, int r2) {
            android.util.TypedValue r0 = com.google.android.material.resources.MaterialAttributes.resolve(r0, r1)
            if (r0 == 0) goto L9
            int r0 = r0.data
            return r0
        L9:
            return r2
    }

    public static int getColor(android.content.Context r0, int r1, java.lang.String r2) {
            int r0 = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(r0, r1, r2)
            return r0
    }

    public static int getColor(android.view.View r0, int r1) {
            int r0 = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(r0, r1)
            return r0
    }

    public static int getColor(android.view.View r0, int r1, int r2) {
            android.content.Context r0 = r0.getContext()
            int r0 = getColor(r0, r1, r2)
            return r0
    }

    public static int layer(int r0, int r1) {
            int r0 = androidx.core.graphics.ColorUtils.compositeColors(r1, r0)
            return r0
    }

    public static int layer(int r1, int r2, float r3) {
            int r0 = android.graphics.Color.alpha(r2)
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = java.lang.Math.round(r0)
            int r2 = androidx.core.graphics.ColorUtils.setAlphaComponent(r2, r3)
            int r1 = layer(r1, r2)
            return r1
    }

    public static int layer(android.view.View r1, int r2, int r3) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = layer(r1, r2, r3, r0)
            return r1
    }

    public static int layer(android.view.View r0, int r1, int r2, float r3) {
            int r1 = getColor(r0, r1)
            int r0 = getColor(r0, r2)
            int r0 = layer(r1, r0, r3)
            return r0
    }
}
