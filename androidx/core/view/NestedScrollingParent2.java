package androidx.core.view;

/* loaded from: classes.dex */
public interface NestedScrollingParent2 extends androidx.core.view.NestedScrollingParent {
    void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4, int r5);

    void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int r6);

    void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3, int r4);

    boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3, int r4);

    void onStopNestedScroll(android.view.View r1, int r2);
}
