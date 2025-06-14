package androidx.core.widget;

/* loaded from: classes.dex */
public final class ListPopupWindowCompat {
    private ListPopupWindowCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.view.View.OnTouchListener createDragToOpenListener(android.widget.ListPopupWindow r0, android.view.View r1) {
            android.view.View$OnTouchListener r0 = r0.createDragToOpenListener(r1)
            return r0
    }

    @java.lang.Deprecated
    public static android.view.View.OnTouchListener createDragToOpenListener(java.lang.Object r0, android.view.View r1) {
            android.widget.ListPopupWindow r0 = (android.widget.ListPopupWindow) r0
            android.view.View$OnTouchListener r0 = createDragToOpenListener(r0, r1)
            return r0
    }
}
