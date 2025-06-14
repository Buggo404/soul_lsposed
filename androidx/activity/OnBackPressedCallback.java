package androidx.activity;

/* loaded from: classes.dex */
public abstract class OnBackPressedCallback {
    private java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> mCancellables;
    private boolean mEnabled;

    public OnBackPressedCallback(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mCancellables = r0
            r1.mEnabled = r2
            return
    }

    void addCancellable(androidx.activity.Cancellable r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> r0 = r1.mCancellables
            r0.add(r2)
            return
    }

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.mEnabled
            return r0
    }

    public final void remove() {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> r0 = r2.mCancellables
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.activity.Cancellable r1 = (androidx.activity.Cancellable) r1
            r1.cancel()
            goto L6
        L16:
            return
    }

    void removeCancellable(androidx.activity.Cancellable r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> r0 = r1.mCancellables
            r0.remove(r2)
            return
    }

    public final void setEnabled(boolean r1) {
            r0 = this;
            r0.mEnabled = r1
            return
    }
}
