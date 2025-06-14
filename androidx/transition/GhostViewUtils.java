package androidx.transition;

/* loaded from: classes.dex */
class GhostViewUtils {
    private GhostViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static androidx.transition.GhostView addGhost(android.view.View r2, android.view.ViewGroup r3, android.graphics.Matrix r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 != r1) goto Lb
            androidx.transition.GhostView r2 = androidx.transition.GhostViewPlatform.addGhost(r2, r3, r4)
            return r2
        Lb:
            androidx.transition.GhostViewPort r2 = androidx.transition.GhostViewPort.addGhost(r2, r3, r4)
            return r2
    }

    static void removeGhost(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 != r1) goto La
            androidx.transition.GhostViewPlatform.removeGhost(r2)
            goto Ld
        La:
            androidx.transition.GhostViewPort.removeGhost(r2)
        Ld:
            return
    }
}
