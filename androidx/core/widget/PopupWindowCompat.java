package androidx.core.widget;

/* loaded from: classes.dex */
public final class PopupWindowCompat {
    private static final java.lang.String TAG = "PopupWindowCompatApi21";
    private static java.lang.reflect.Method sGetWindowLayoutTypeMethod;
    private static boolean sGetWindowLayoutTypeMethodAttempted;
    private static java.lang.reflect.Field sOverlapAnchorField;
    private static boolean sOverlapAnchorFieldAttempted;
    private static java.lang.reflect.Method sSetWindowLayoutTypeMethod;
    private static boolean sSetWindowLayoutTypeMethodAttempted;

    private PopupWindowCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean getOverlapAnchor(android.widget.PopupWindow r0) {
            boolean r0 = r0.getOverlapAnchor()
            return r0
    }

    public static int getWindowLayoutType(android.widget.PopupWindow r0) {
            int r0 = r0.getWindowLayoutType()
            return r0
    }

    public static void setOverlapAnchor(android.widget.PopupWindow r0, boolean r1) {
            r0.setOverlapAnchor(r1)
            return
    }

    public static void setWindowLayoutType(android.widget.PopupWindow r0, int r1) {
            r0.setWindowLayoutType(r1)
            return
    }

    public static void showAsDropDown(android.widget.PopupWindow r0, android.view.View r1, int r2, int r3, int r4) {
            r0.showAsDropDown(r1, r2, r3, r4)
            return
    }
}
