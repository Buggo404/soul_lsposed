package androidx.core.app;

/* loaded from: classes.dex */
public class ComponentActivity extends android.app.Activity implements androidx.lifecycle.LifecycleOwner, androidx.core.view.KeyEventDispatcher.Component {
    private androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity.ExtraData>, androidx.core.app.ComponentActivity.ExtraData> mExtraDataMap;
    private androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;

    @java.lang.Deprecated
    public static class ExtraData {
        public ExtraData() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ComponentActivity() {
            r1 = this;
            r1.<init>()
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r1.mExtraDataMap = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.mLifecycleRegistry = r0
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L12
            boolean r1 = androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(r0, r3)
            if (r1 == 0) goto L12
            r3 = 1
            return r3
        L12:
            boolean r3 = androidx.core.view.KeyEventDispatcher.dispatchKeyEvent(r2, r0, r2, r3)
            return r3
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L12
            boolean r0 = androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(r0, r2)
            if (r0 == 0) goto L12
            r2 = 1
            return r2
        L12:
            boolean r2 = super.dispatchKeyShortcutEvent(r2)
            return r2
    }

    @java.lang.Deprecated
    public <T extends androidx.core.app.ComponentActivity.ExtraData> T getExtraData(java.lang.Class<T> r2) {
            r1 = this;
            androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity$ExtraData>, androidx.core.app.ComponentActivity$ExtraData> r0 = r1.mExtraDataMap
            java.lang.Object r2 = r0.get(r2)
            androidx.core.app.ComponentActivity$ExtraData r2 = (androidx.core.app.ComponentActivity.ExtraData) r2
            return r2
    }

    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            return r0
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            androidx.lifecycle.ReportFragment.injectIfNeededIn(r0)
            return
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r2.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            r0.markState(r1)
            super.onSaveInstanceState(r3)
            return
    }

    @java.lang.Deprecated
    public void putExtraData(androidx.core.app.ComponentActivity.ExtraData r3) {
            r2 = this;
            androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity$ExtraData>, androidx.core.app.ComponentActivity$ExtraData> r0 = r2.mExtraDataMap
            java.lang.Class r1 = r3.getClass()
            r0.put(r1, r3)
            return
    }

    @Override // androidx.core.view.KeyEventDispatcher.Component
    public boolean superDispatchKeyEvent(android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)
            return r1
    }
}
