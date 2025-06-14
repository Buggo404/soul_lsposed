package androidx.core.view;

/* loaded from: classes.dex */
public final class ViewGroupCompat {
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;

    private ViewGroupCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getLayoutMode(android.view.ViewGroup r0) {
            int r0 = r0.getLayoutMode()
            return r0
    }

    public static int getNestedScrollAxes(android.view.ViewGroup r0) {
            int r0 = r0.getNestedScrollAxes()
            return r0
    }

    public static boolean isTransitionGroup(android.view.ViewGroup r0) {
            boolean r0 = r0.isTransitionGroup()
            return r0
    }

    @java.lang.Deprecated
    public static boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r0, android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            boolean r0 = r0.onRequestSendAccessibilityEvent(r1, r2)
            return r0
    }

    public static void setLayoutMode(android.view.ViewGroup r0, int r1) {
            r0.setLayoutMode(r1)
            return
    }

    @java.lang.Deprecated
    public static void setMotionEventSplittingEnabled(android.view.ViewGroup r0, boolean r1) {
            r0.setMotionEventSplittingEnabled(r1)
            return
    }

    public static void setTransitionGroup(android.view.ViewGroup r0, boolean r1) {
            r0.setTransitionGroup(r1)
            return
    }
}
