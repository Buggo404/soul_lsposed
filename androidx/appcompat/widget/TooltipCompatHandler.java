package androidx.appcompat.widget;

/* loaded from: classes.dex */
class TooltipCompatHandler implements android.view.View.OnLongClickListener, android.view.View.OnHoverListener, android.view.View.OnAttachStateChangeListener {
    private static final long HOVER_HIDE_TIMEOUT_MS = 15000;
    private static final long HOVER_HIDE_TIMEOUT_SHORT_MS = 3000;
    private static final long LONG_CLICK_HIDE_TIMEOUT_MS = 2500;
    private static final java.lang.String TAG = "TooltipCompatHandler";
    private static androidx.appcompat.widget.TooltipCompatHandler sActiveHandler;
    private static androidx.appcompat.widget.TooltipCompatHandler sPendingHandler;
    private final android.view.View mAnchor;
    private int mAnchorX;
    private int mAnchorY;
    private boolean mFromTouch;
    private final java.lang.Runnable mHideRunnable;
    private final int mHoverSlop;
    private androidx.appcompat.widget.TooltipPopup mPopup;
    private final java.lang.Runnable mShowRunnable;
    private final java.lang.CharSequence mTooltipText;



    private TooltipCompatHandler(android.view.View r2, java.lang.CharSequence r3) {
            r1 = this;
            r1.<init>()
            androidx.appcompat.widget.TooltipCompatHandler$1 r0 = new androidx.appcompat.widget.TooltipCompatHandler$1
            r0.<init>(r1)
            r1.mShowRunnable = r0
            androidx.appcompat.widget.TooltipCompatHandler$2 r0 = new androidx.appcompat.widget.TooltipCompatHandler$2
            r0.<init>(r1)
            r1.mHideRunnable = r0
            r1.mAnchor = r2
            r1.mTooltipText = r3
            android.content.Context r3 = r2.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = androidx.core.view.ViewConfigurationCompat.getScaledHoverSlop(r3)
            r1.mHoverSlop = r3
            r1.clearAnchorPos()
            r2.setOnLongClickListener(r1)
            r2.setOnHoverListener(r1)
            return
    }

    private void cancelPendingShow() {
            r2 = this;
            android.view.View r0 = r2.mAnchor
            java.lang.Runnable r1 = r2.mShowRunnable
            r0.removeCallbacks(r1)
            return
    }

    private void clearAnchorPos() {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.mAnchorX = r0
            r1.mAnchorY = r0
            return
    }

    private void scheduleShow() {
            r4 = this;
            android.view.View r0 = r4.mAnchor
            java.lang.Runnable r1 = r4.mShowRunnable
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
            return
    }

    private static void setPendingHandler(androidx.appcompat.widget.TooltipCompatHandler r1) {
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sPendingHandler
            if (r0 == 0) goto L7
            r0.cancelPendingShow()
        L7:
            androidx.appcompat.widget.TooltipCompatHandler.sPendingHandler = r1
            if (r1 == 0) goto Le
            r1.scheduleShow()
        Le:
            return
    }

    public static void setTooltipText(android.view.View r2, java.lang.CharSequence r3) {
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sPendingHandler
            r1 = 0
            if (r0 == 0) goto Lc
            android.view.View r0 = r0.mAnchor
            if (r0 != r2) goto Lc
            setPendingHandler(r1)
        Lc:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L28
            androidx.appcompat.widget.TooltipCompatHandler r3 = androidx.appcompat.widget.TooltipCompatHandler.sActiveHandler
            if (r3 == 0) goto L1d
            android.view.View r0 = r3.mAnchor
            if (r0 != r2) goto L1d
            r3.hide()
        L1d:
            r2.setOnLongClickListener(r1)
            r3 = 0
            r2.setLongClickable(r3)
            r2.setOnHoverListener(r1)
            goto L2d
        L28:
            androidx.appcompat.widget.TooltipCompatHandler r0 = new androidx.appcompat.widget.TooltipCompatHandler
            r0.<init>(r2, r3)
        L2d:
            return
    }

    private boolean updateAnchorPos(android.view.MotionEvent r4) {
            r3 = this;
            float r0 = r4.getX()
            int r0 = (int) r0
            float r4 = r4.getY()
            int r4 = (int) r4
            int r1 = r3.mAnchorX
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.mHoverSlop
            if (r1 > r2) goto L24
            int r1 = r3.mAnchorY
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.mHoverSlop
            if (r1 > r2) goto L24
            r4 = 0
            return r4
        L24:
            r3.mAnchorX = r0
            r3.mAnchorY = r4
            r4 = 1
            return r4
    }

    void hide() {
            r3 = this;
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sActiveHandler
            r1 = 0
            if (r0 != r3) goto L20
            androidx.appcompat.widget.TooltipCompatHandler.sActiveHandler = r1
            androidx.appcompat.widget.TooltipPopup r0 = r3.mPopup
            if (r0 == 0) goto L19
            r0.hide()
            r3.mPopup = r1
            r3.clearAnchorPos()
            android.view.View r0 = r3.mAnchor
            r0.removeOnAttachStateChangeListener(r3)
            goto L20
        L19:
            java.lang.String r0 = "TooltipCompatHandler"
            java.lang.String r2 = "sActiveHandler.mPopup == null"
            android.util.Log.e(r0, r2)
        L20:
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sPendingHandler
            if (r0 != r3) goto L27
            setPendingHandler(r1)
        L27:
            android.view.View r0 = r3.mAnchor
            java.lang.Runnable r1 = r3.mHideRunnable
            r0.removeCallbacks(r1)
            return
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            androidx.appcompat.widget.TooltipPopup r3 = r2.mPopup
            r0 = 0
            if (r3 == 0) goto La
            boolean r3 = r2.mFromTouch
            if (r3 == 0) goto La
            return r0
        La:
            android.view.View r3 = r2.mAnchor
            android.content.Context r3 = r3.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            boolean r1 = r3.isEnabled()
            if (r1 == 0) goto L25
            boolean r3 = r3.isTouchExplorationEnabled()
            if (r3 == 0) goto L25
            return r0
        L25:
            int r3 = r4.getAction()
            r1 = 7
            if (r3 == r1) goto L38
            r4 = 10
            if (r3 == r4) goto L31
            goto L4d
        L31:
            r2.clearAnchorPos()
            r2.hide()
            goto L4d
        L38:
            android.view.View r3 = r2.mAnchor
            boolean r3 = r3.isEnabled()
            if (r3 == 0) goto L4d
            androidx.appcompat.widget.TooltipPopup r3 = r2.mPopup
            if (r3 != 0) goto L4d
            boolean r3 = r2.updateAnchorPos(r4)
            if (r3 == 0) goto L4d
            setPendingHandler(r2)
        L4d:
            return r0
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View r2) {
            r1 = this;
            int r0 = r2.getWidth()
            int r0 = r0 / 2
            r1.mAnchorX = r0
            int r2 = r2.getHeight()
            int r2 = r2 / 2
            r1.mAnchorY = r2
            r2 = 1
            r1.show(r2)
            return r2
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r0.hide()
            return
    }

    void show(boolean r8) {
            r7 = this;
            android.view.View r0 = r7.mAnchor
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            if (r0 != 0) goto L9
            return
        L9:
            r0 = 0
            setPendingHandler(r0)
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sActiveHandler
            if (r0 == 0) goto L14
            r0.hide()
        L14:
            androidx.appcompat.widget.TooltipCompatHandler.sActiveHandler = r7
            r7.mFromTouch = r8
            androidx.appcompat.widget.TooltipPopup r1 = new androidx.appcompat.widget.TooltipPopup
            android.view.View r8 = r7.mAnchor
            android.content.Context r8 = r8.getContext()
            r1.<init>(r8)
            r7.mPopup = r1
            android.view.View r2 = r7.mAnchor
            int r3 = r7.mAnchorX
            int r4 = r7.mAnchorY
            boolean r5 = r7.mFromTouch
            java.lang.CharSequence r6 = r7.mTooltipText
            r1.show(r2, r3, r4, r5, r6)
            android.view.View r8 = r7.mAnchor
            r8.addOnAttachStateChangeListener(r7)
            boolean r8 = r7.mFromTouch
            if (r8 == 0) goto L3e
            r0 = 2500(0x9c4, double:1.235E-320)
            goto L59
        L3e:
            android.view.View r8 = r7.mAnchor
            int r8 = androidx.core.view.ViewCompat.getWindowSystemUiVisibility(r8)
            r0 = 1
            r8 = r8 & r0
            if (r8 != r0) goto L50
            int r8 = android.view.ViewConfiguration.getLongPressTimeout()
            long r0 = (long) r8
            r2 = 3000(0xbb8, double:1.482E-320)
            goto L57
        L50:
            int r8 = android.view.ViewConfiguration.getLongPressTimeout()
            long r0 = (long) r8
            r2 = 15000(0x3a98, double:7.411E-320)
        L57:
            long r0 = r2 - r0
        L59:
            android.view.View r8 = r7.mAnchor
            java.lang.Runnable r2 = r7.mHideRunnable
            r8.removeCallbacks(r2)
            android.view.View r8 = r7.mAnchor
            java.lang.Runnable r2 = r7.mHideRunnable
            r8.postDelayed(r2, r0)
            return
    }
}
