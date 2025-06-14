package com.google.android.material.transition.platform;

/* loaded from: classes.dex */
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    private FadeModeResult(int r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.startAlpha = r1
            r0.endAlpha = r2
            r0.endOnTop = r3
            return
    }

    static com.google.android.material.transition.platform.FadeModeResult endOnTop(int r2, int r3) {
            com.google.android.material.transition.platform.FadeModeResult r0 = new com.google.android.material.transition.platform.FadeModeResult
            r1 = 1
            r0.<init>(r2, r3, r1)
            return r0
    }

    static com.google.android.material.transition.platform.FadeModeResult startOnTop(int r2, int r3) {
            com.google.android.material.transition.platform.FadeModeResult r0 = new com.google.android.material.transition.platform.FadeModeResult
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }
}
