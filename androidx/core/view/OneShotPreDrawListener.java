package androidx.core.view;

/* loaded from: classes.dex */
public final class OneShotPreDrawListener implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
    private final java.lang.Runnable mRunnable;
    private final android.view.View mView;
    private android.view.ViewTreeObserver mViewTreeObserver;

    private OneShotPreDrawListener(android.view.View r1, java.lang.Runnable r2) {
            r0 = this;
            r0.<init>()
            r0.mView = r1
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.mViewTreeObserver = r1
            r0.mRunnable = r2
            return
    }

    public static androidx.core.view.OneShotPreDrawListener add(android.view.View r1, java.lang.Runnable r2) {
            if (r1 == 0) goto L1c
            if (r2 == 0) goto L14
            androidx.core.view.OneShotPreDrawListener r0 = new androidx.core.view.OneShotPreDrawListener
            r0.<init>(r1, r2)
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            r2.addOnPreDrawListener(r0)
            r1.addOnAttachStateChangeListener(r0)
            return r0
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "runnable == null"
            r1.<init>(r2)
            throw r1
        L1c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "view == null"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
            r1 = this;
            r1.removeListener()
            java.lang.Runnable r0 = r1.mRunnable
            r0.run()
            r0 = 1
            return r0
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.mViewTreeObserver = r1
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r0.removeListener()
            return
    }

    public void removeListener() {
            r1 = this;
            android.view.ViewTreeObserver r0 = r1.mViewTreeObserver
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto Le
            android.view.ViewTreeObserver r0 = r1.mViewTreeObserver
            r0.removeOnPreDrawListener(r1)
            goto L17
        Le:
            android.view.View r0 = r1.mView
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnPreDrawListener(r1)
        L17:
            android.view.View r0 = r1.mView
            r0.removeOnAttachStateChangeListener(r1)
            return
    }
}
