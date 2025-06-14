package androidx.core.view;

/* loaded from: classes.dex */
public final class PointerIconCompat {
    public static final int TYPE_ALIAS = 1010;
    public static final int TYPE_ALL_SCROLL = 1013;
    public static final int TYPE_ARROW = 1000;
    public static final int TYPE_CELL = 1006;
    public static final int TYPE_CONTEXT_MENU = 1001;
    public static final int TYPE_COPY = 1011;
    public static final int TYPE_CROSSHAIR = 1007;
    public static final int TYPE_DEFAULT = 1000;
    public static final int TYPE_GRAB = 1020;
    public static final int TYPE_GRABBING = 1021;
    public static final int TYPE_HAND = 1002;
    public static final int TYPE_HELP = 1003;
    public static final int TYPE_HORIZONTAL_DOUBLE_ARROW = 1014;
    public static final int TYPE_NO_DROP = 1012;
    public static final int TYPE_NULL = 0;
    public static final int TYPE_TEXT = 1008;
    public static final int TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW = 1017;
    public static final int TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW = 1016;
    public static final int TYPE_VERTICAL_DOUBLE_ARROW = 1015;
    public static final int TYPE_VERTICAL_TEXT = 1009;
    public static final int TYPE_WAIT = 1004;
    public static final int TYPE_ZOOM_IN = 1018;
    public static final int TYPE_ZOOM_OUT = 1019;
    private java.lang.Object mPointerIcon;

    private PointerIconCompat(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.mPointerIcon = r1
            return
    }

    public static androidx.core.view.PointerIconCompat create(android.graphics.Bitmap r1, float r2, float r3) {
            androidx.core.view.PointerIconCompat r0 = new androidx.core.view.PointerIconCompat
            android.view.PointerIcon r1 = android.view.PointerIcon.create(r1, r2, r3)
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.view.PointerIconCompat getSystemIcon(android.content.Context r1, int r2) {
            androidx.core.view.PointerIconCompat r0 = new androidx.core.view.PointerIconCompat
            android.view.PointerIcon r1 = android.view.PointerIcon.getSystemIcon(r1, r2)
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.view.PointerIconCompat load(android.content.res.Resources r1, int r2) {
            androidx.core.view.PointerIconCompat r0 = new androidx.core.view.PointerIconCompat
            android.view.PointerIcon r1 = android.view.PointerIcon.load(r1, r2)
            r0.<init>(r1)
            return r0
    }

    public java.lang.Object getPointerIcon() {
            r1 = this;
            java.lang.Object r0 = r1.mPointerIcon
            return r0
    }
}
