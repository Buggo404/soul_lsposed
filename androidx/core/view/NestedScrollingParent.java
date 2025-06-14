package androidx.core.view;

/* loaded from: classes.dex */
public interface NestedScrollingParent {
    int getNestedScrollAxes();

    boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4);

    boolean onNestedPreFling(android.view.View r1, float r2, float r3);

    void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4);

    void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5);

    void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3);

    boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3);

    void onStopNestedScroll(android.view.View r1);
}
