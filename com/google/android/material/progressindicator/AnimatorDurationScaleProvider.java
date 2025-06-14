package com.google.android.material.progressindicator;

/* loaded from: classes.dex */
public class AnimatorDurationScaleProvider {
    private static float defaultSystemAnimatorDurationScale = 1.0f;

    static {
            return
    }

    public AnimatorDurationScaleProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setDefaultSystemAnimatorDurationScale(float r0) {
            com.google.android.material.progressindicator.AnimatorDurationScaleProvider.defaultSystemAnimatorDurationScale = r0
            return
    }

    public float getSystemAnimatorDurationScale(android.content.ContentResolver r3) {
            r2 = this;
            java.lang.String r0 = "animator_duration_scale"
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = android.provider.Settings.Global.getFloat(r3, r0, r1)
            return r3
    }
}
