package androidx.core.view;

/* loaded from: classes.dex */
public final class MarginLayoutParamsCompat {
    private MarginLayoutParamsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams r1) {
            int r1 = r1.getLayoutDirection()
            if (r1 == 0) goto La
            r0 = 1
            if (r1 == r0) goto La
            r1 = 0
        La:
            return r1
    }

    public static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams r0) {
            int r0 = r0.getMarginEnd()
            return r0
    }

    public static int getMarginStart(android.view.ViewGroup.MarginLayoutParams r0) {
            int r0 = r0.getMarginStart()
            return r0
    }

    public static boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams r0) {
            boolean r0 = r0.isMarginRelative()
            return r0
    }

    public static void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            r0.resolveLayoutDirection(r1)
            return
    }

    public static void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            r0.setLayoutDirection(r1)
            return
    }

    public static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            r0.setMarginEnd(r1)
            return
    }

    public static void setMarginStart(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            r0.setMarginStart(r1)
            return
    }
}
