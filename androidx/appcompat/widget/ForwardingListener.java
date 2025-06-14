package androidx.appcompat.widget;

/* loaded from: classes.dex */
public abstract class ForwardingListener implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {
    private int mActivePointerId;
    private java.lang.Runnable mDisallowIntercept;
    private boolean mForwarding;
    private final int mLongPressTimeout;
    private final float mScaledTouchSlop;
    final android.view.View mSrc;
    private final int mTapTimeout;
    private final int[] mTmpLocation;
    private java.lang.Runnable mTriggerLongPress;

    private class DisallowIntercept implements java.lang.Runnable {
        final /* synthetic */ androidx.appcompat.widget.ForwardingListener this$0;

        DisallowIntercept(androidx.appcompat.widget.ForwardingListener r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.ForwardingListener r0 = r2.this$0
                android.view.View r0 = r0.mSrc
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto Le
                r1 = 1
                r0.requestDisallowInterceptTouchEvent(r1)
            Le:
                return
        }
    }

    private class TriggerLongPress implements java.lang.Runnable {
        final /* synthetic */ androidx.appcompat.widget.ForwardingListener this$0;

        TriggerLongPress(androidx.appcompat.widget.ForwardingListener r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.widget.ForwardingListener r0 = r1.this$0
                r0.onLongPress()
                return
        }
    }

    public ForwardingListener(android.view.View r3) {
            r2 = this;
            r2.<init>()
            r0 = 2
            int[] r1 = new int[r0]
            r2.mTmpLocation = r1
            r2.mSrc = r3
            r1 = 1
            r3.setLongClickable(r1)
            r3.addOnAttachStateChangeListener(r2)
            android.content.Context r3 = r3.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledTouchSlop()
            float r3 = (float) r3
            r2.mScaledTouchSlop = r3
            int r3 = android.view.ViewConfiguration.getTapTimeout()
            r2.mTapTimeout = r3
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            int r3 = r3 + r1
            int r3 = r3 / r0
            r2.mLongPressTimeout = r3
            return
    }

    private void clearCallbacks() {
            r2 = this;
            java.lang.Runnable r0 = r2.mTriggerLongPress
            if (r0 == 0) goto L9
            android.view.View r1 = r2.mSrc
            r1.removeCallbacks(r0)
        L9:
            java.lang.Runnable r0 = r2.mDisallowIntercept
            if (r0 == 0) goto L12
            android.view.View r1 = r2.mSrc
            r1.removeCallbacks(r0)
        L12:
            return
    }

    private boolean onTouchForwarded(android.view.MotionEvent r5) {
            r4 = this;
            android.view.View r0 = r4.mSrc
            androidx.appcompat.view.menu.ShowableListMenu r1 = r4.getPopup()
            r2 = 0
            if (r1 == 0) goto L44
            boolean r3 = r1.isShowing()
            if (r3 != 0) goto L10
            goto L44
        L10:
            android.widget.ListView r1 = r1.getListView()
            androidx.appcompat.widget.DropDownListView r1 = (androidx.appcompat.widget.DropDownListView) r1
            if (r1 == 0) goto L44
            boolean r3 = r1.isShown()
            if (r3 != 0) goto L1f
            goto L44
        L1f:
            android.view.MotionEvent r3 = android.view.MotionEvent.obtainNoHistory(r5)
            r4.toGlobalMotionEvent(r0, r3)
            r4.toLocalMotionEvent(r1, r3)
            int r0 = r4.mActivePointerId
            boolean r0 = r1.onForwardedEvent(r3, r0)
            r3.recycle()
            int r5 = r5.getActionMasked()
            r1 = 1
            if (r5 == r1) goto L3e
            r3 = 3
            if (r5 == r3) goto L3e
            r5 = r1
            goto L3f
        L3e:
            r5 = r2
        L3f:
            if (r0 == 0) goto L44
            if (r5 == 0) goto L44
            r2 = r1
        L44:
            return r2
    }

    private boolean onTouchObserved(android.view.MotionEvent r6) {
            r5 = this;
            android.view.View r0 = r5.mSrc
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.mActivePointerId
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.mScaledTouchSlop
            boolean r6 = pointInView(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.clearCallbacks()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.clearCallbacks()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.mActivePointerId = r6
            java.lang.Runnable r6 = r5.mDisallowIntercept
            if (r6 != 0) goto L52
            androidx.appcompat.widget.ForwardingListener$DisallowIntercept r6 = new androidx.appcompat.widget.ForwardingListener$DisallowIntercept
            r6.<init>(r5)
            r5.mDisallowIntercept = r6
        L52:
            java.lang.Runnable r6 = r5.mDisallowIntercept
            int r1 = r5.mTapTimeout
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.mTriggerLongPress
            if (r6 != 0) goto L65
            androidx.appcompat.widget.ForwardingListener$TriggerLongPress r6 = new androidx.appcompat.widget.ForwardingListener$TriggerLongPress
            r6.<init>(r5)
            r5.mTriggerLongPress = r6
        L65:
            java.lang.Runnable r6 = r5.mTriggerLongPress
            int r1 = r5.mLongPressTimeout
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
    }

    private static boolean pointInView(android.view.View r2, float r3, float r4, float r5) {
            float r0 = -r5
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 < 0) goto L29
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L29
            int r0 = r2.getRight()
            int r1 = r2.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            float r0 = r0 + r5
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L29
            int r3 = r2.getBottom()
            int r2 = r2.getTop()
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 + r5
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L29
            r2 = 1
            goto L2a
        L29:
            r2 = 0
        L2a:
            return r2
    }

    private boolean toGlobalMotionEvent(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            int[] r0 = r2.mTmpLocation
            r3.getLocationOnScreen(r0)
            r3 = 0
            r3 = r0[r3]
            float r3 = (float) r3
            r1 = 1
            r0 = r0[r1]
            float r0 = (float) r0
            r4.offsetLocation(r3, r0)
            return r1
    }

    private boolean toLocalMotionEvent(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            int[] r0 = r2.mTmpLocation
            r3.getLocationOnScreen(r0)
            r3 = 0
            r3 = r0[r3]
            int r3 = -r3
            float r3 = (float) r3
            r1 = 1
            r0 = r0[r1]
            int r0 = -r0
            float r0 = (float) r0
            r4.offsetLocation(r3, r0)
            return r1
    }

    public abstract androidx.appcompat.view.menu.ShowableListMenu getPopup();

    protected boolean onForwardingStarted() {
            r2 = this;
            androidx.appcompat.view.menu.ShowableListMenu r0 = r2.getPopup()
            if (r0 == 0) goto Lf
            boolean r1 = r0.isShowing()
            if (r1 != 0) goto Lf
            r0.show()
        Lf:
            r0 = 1
            return r0
    }

    protected boolean onForwardingStopped() {
            r2 = this;
            androidx.appcompat.view.menu.ShowableListMenu r0 = r2.getPopup()
            if (r0 == 0) goto Lf
            boolean r1 = r0.isShowing()
            if (r1 == 0) goto Lf
            r0.dismiss()
        Lf:
            r0 = 1
            return r0
    }

    void onLongPress() {
            r11 = this;
            r11.clearCallbacks()
            android.view.View r0 = r11.mSrc
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L36
            boolean r1 = r0.isLongClickable()
            if (r1 == 0) goto L12
            goto L36
        L12:
            boolean r1 = r11.onForwardingStarted()
            if (r1 != 0) goto L19
            return
        L19:
            android.view.ViewParent r1 = r0.getParent()
            r2 = 1
            r1.requestDisallowInterceptTouchEvent(r2)
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r5
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            r0.onTouchEvent(r1)
            r1.recycle()
            r11.mForwarding = r2
        L36:
            return
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
            r10 = this;
            boolean r11 = r10.mForwarding
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L17
            boolean r12 = r10.onTouchForwarded(r12)
            if (r12 != 0) goto L15
            boolean r12 = r10.onForwardingStopped()
            if (r12 != 0) goto L13
            goto L15
        L13:
            r12 = r1
            goto L3d
        L15:
            r12 = r0
            goto L3d
        L17:
            boolean r12 = r10.onTouchObserved(r12)
            if (r12 == 0) goto L25
            boolean r12 = r10.onForwardingStarted()
            if (r12 == 0) goto L25
            r12 = r0
            goto L26
        L25:
            r12 = r1
        L26:
            if (r12 == 0) goto L3d
            long r4 = android.os.SystemClock.uptimeMillis()
            r6 = 3
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r4
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9)
            android.view.View r3 = r10.mSrc
            r3.onTouchEvent(r2)
            r2.recycle()
        L3d:
            r10.mForwarding = r12
            if (r12 != 0) goto L45
            if (r11 == 0) goto L44
            goto L45
        L44:
            r0 = r1
        L45:
            return r0
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            r2 = 0
            r1.mForwarding = r2
            r2 = -1
            r1.mActivePointerId = r2
            java.lang.Runnable r2 = r1.mDisallowIntercept
            if (r2 == 0) goto Lf
            android.view.View r0 = r1.mSrc
            r0.removeCallbacks(r2)
        Lf:
            return
    }
}
