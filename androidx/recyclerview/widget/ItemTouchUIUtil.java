package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public interface ItemTouchUIUtil {
    void clearView(android.view.View r1);

    void onDraw(android.graphics.Canvas r1, androidx.recyclerview.widget.RecyclerView r2, android.view.View r3, float r4, float r5, int r6, boolean r7);

    void onDrawOver(android.graphics.Canvas r1, androidx.recyclerview.widget.RecyclerView r2, android.view.View r3, float r4, float r5, int r6, boolean r7);

    void onSelected(android.view.View r1);
}
