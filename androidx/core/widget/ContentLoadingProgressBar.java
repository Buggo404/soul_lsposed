package androidx.core.widget;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends android.widget.ProgressBar {
    private static final int MIN_DELAY = 500;
    private static final int MIN_SHOW_TIME = 500;
    private final java.lang.Runnable mDelayedHide;
    private final java.lang.Runnable mDelayedShow;
    boolean mDismissed;
    boolean mPostedHide;
    boolean mPostedShow;
    long mStartTime;



    public ContentLoadingProgressBar(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ContentLoadingProgressBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            r2 = -1
            r1.mStartTime = r2
            r1.mPostedHide = r0
            r1.mPostedShow = r0
            r1.mDismissed = r0
            androidx.core.widget.ContentLoadingProgressBar$1 r2 = new androidx.core.widget.ContentLoadingProgressBar$1
            r2.<init>(r1)
            r1.mDelayedHide = r2
            androidx.core.widget.ContentLoadingProgressBar$2 r2 = new androidx.core.widget.ContentLoadingProgressBar$2
            r2.<init>(r1)
            r1.mDelayedShow = r2
            return
    }

    private void removeCallbacks() {
            r1 = this;
            java.lang.Runnable r0 = r1.mDelayedHide
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.mDelayedShow
            r1.removeCallbacks(r0)
            return
    }

    public synchronized void hide() {
            r9 = this;
            monitor-enter(r9)
            r0 = 1
            r9.mDismissed = r0     // Catch: java.lang.Throwable -> L34
            java.lang.Runnable r1 = r9.mDelayedShow     // Catch: java.lang.Throwable -> L34
            r9.removeCallbacks(r1)     // Catch: java.lang.Throwable -> L34
            r1 = 0
            r9.mPostedShow = r1     // Catch: java.lang.Throwable -> L34
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L34
            long r3 = r9.mStartTime     // Catch: java.lang.Throwable -> L34
            long r1 = r1 - r3
            r5 = 500(0x1f4, double:2.47E-321)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2d
            r7 = -1
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L20
            goto L2d
        L20:
            boolean r3 = r9.mPostedHide     // Catch: java.lang.Throwable -> L34
            if (r3 != 0) goto L32
            java.lang.Runnable r3 = r9.mDelayedHide     // Catch: java.lang.Throwable -> L34
            long r5 = r5 - r1
            r9.postDelayed(r3, r5)     // Catch: java.lang.Throwable -> L34
            r9.mPostedHide = r0     // Catch: java.lang.Throwable -> L34
            goto L32
        L2d:
            r0 = 8
            r9.setVisibility(r0)     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r9)
            return
        L34:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.removeCallbacks()
            return
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.removeCallbacks()
            return
    }

    public synchronized void show() {
            r3 = this;
            monitor-enter(r3)
            r0 = -1
            r3.mStartTime = r0     // Catch: java.lang.Throwable -> L1f
            r0 = 0
            r3.mDismissed = r0     // Catch: java.lang.Throwable -> L1f
            java.lang.Runnable r1 = r3.mDelayedHide     // Catch: java.lang.Throwable -> L1f
            r3.removeCallbacks(r1)     // Catch: java.lang.Throwable -> L1f
            r3.mPostedHide = r0     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r3.mPostedShow     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L1d
            java.lang.Runnable r0 = r3.mDelayedShow     // Catch: java.lang.Throwable -> L1f
            r1 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r0, r1)     // Catch: java.lang.Throwable -> L1f
            r0 = 1
            r3.mPostedShow = r0     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r3)
            return
        L1f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }
}
