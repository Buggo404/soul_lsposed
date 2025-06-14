package androidx.transition;

/* loaded from: classes.dex */
public class Scene {
    private android.content.Context mContext;
    private java.lang.Runnable mEnterAction;
    private java.lang.Runnable mExitAction;
    private android.view.View mLayout;
    private int mLayoutId;
    private android.view.ViewGroup mSceneRoot;

    public Scene(android.view.ViewGroup r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mLayoutId = r0
            r1.mSceneRoot = r2
            return
    }

    private Scene(android.view.ViewGroup r1, int r2, android.content.Context r3) {
            r0 = this;
            r0.<init>()
            r0.mContext = r3
            r0.mSceneRoot = r1
            r0.mLayoutId = r2
            return
    }

    public Scene(android.view.ViewGroup r2, android.view.View r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mLayoutId = r0
            r1.mSceneRoot = r2
            r1.mLayout = r3
            return
    }

    public static androidx.transition.Scene getCurrentScene(android.view.ViewGroup r1) {
            int r0 = androidx.transition.C0425R.id.transition_current_scene
            java.lang.Object r1 = r1.getTag(r0)
            androidx.transition.Scene r1 = (androidx.transition.Scene) r1
            return r1
    }

    public static androidx.transition.Scene getSceneForLayout(android.view.ViewGroup r2, int r3, android.content.Context r4) {
            int r0 = androidx.transition.C0425R.id.transition_scene_layoutid_cache
            java.lang.Object r0 = r2.getTag(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            if (r0 != 0) goto L14
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            int r1 = androidx.transition.C0425R.id.transition_scene_layoutid_cache
            r2.setTag(r1, r0)
        L14:
            java.lang.Object r1 = r0.get(r3)
            androidx.transition.Scene r1 = (androidx.transition.Scene) r1
            if (r1 == 0) goto L1d
            return r1
        L1d:
            androidx.transition.Scene r1 = new androidx.transition.Scene
            r1.<init>(r2, r3, r4)
            r0.put(r3, r1)
            return r1
    }

    static void setCurrentScene(android.view.ViewGroup r1, androidx.transition.Scene r2) {
            int r0 = androidx.transition.C0425R.id.transition_current_scene
            r1.setTag(r0, r2)
            return
    }

    public void enter() {
            r3 = this;
            int r0 = r3.mLayoutId
            if (r0 > 0) goto L8
            android.view.View r0 = r3.mLayout
            if (r0 == 0) goto L28
        L8:
            android.view.ViewGroup r0 = r3.getSceneRoot()
            r0.removeAllViews()
            int r0 = r3.mLayoutId
            if (r0 <= 0) goto L21
            android.content.Context r0 = r3.mContext
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.mLayoutId
            android.view.ViewGroup r2 = r3.mSceneRoot
            r0.inflate(r1, r2)
            goto L28
        L21:
            android.view.ViewGroup r0 = r3.mSceneRoot
            android.view.View r1 = r3.mLayout
            r0.addView(r1)
        L28:
            java.lang.Runnable r0 = r3.mEnterAction
            if (r0 == 0) goto L2f
            r0.run()
        L2f:
            android.view.ViewGroup r0 = r3.mSceneRoot
            setCurrentScene(r0, r3)
            return
    }

    public void exit() {
            r1 = this;
            android.view.ViewGroup r0 = r1.mSceneRoot
            androidx.transition.Scene r0 = getCurrentScene(r0)
            if (r0 != r1) goto Lf
            java.lang.Runnable r0 = r1.mExitAction
            if (r0 == 0) goto Lf
            r0.run()
        Lf:
            return
    }

    public android.view.ViewGroup getSceneRoot() {
            r1 = this;
            android.view.ViewGroup r0 = r1.mSceneRoot
            return r0
    }

    boolean isCreatedFromLayoutResource() {
            r1 = this;
            int r0 = r1.mLayoutId
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void setEnterAction(java.lang.Runnable r1) {
            r0 = this;
            r0.mEnterAction = r1
            return
    }

    public void setExitAction(java.lang.Runnable r1) {
            r0 = this;
            r0.mExitAction = r1
            return
    }
}
