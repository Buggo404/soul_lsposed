package androidx.core.view;

/* loaded from: classes.dex */
public final class GestureDetectorCompat {
    private final androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl mImpl;

    interface GestureDetectorCompatImpl {
        boolean isLongpressEnabled();

        boolean onTouchEvent(android.view.MotionEvent r1);

        void setIsLongpressEnabled(boolean r1);

        void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener r1);
    }

    static class GestureDetectorCompatImplBase implements androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl {
        private static final int DOUBLE_TAP_TIMEOUT = 0;
        private static final int LONGPRESS_TIMEOUT = 0;
        private static final int LONG_PRESS = 2;
        private static final int SHOW_PRESS = 1;
        private static final int TAP = 3;
        private static final int TAP_TIMEOUT = 0;
        private boolean mAlwaysInBiggerTapRegion;
        private boolean mAlwaysInTapRegion;
        android.view.MotionEvent mCurrentDownEvent;
        boolean mDeferConfirmSingleTap;
        android.view.GestureDetector.OnDoubleTapListener mDoubleTapListener;
        private int mDoubleTapSlopSquare;
        private float mDownFocusX;
        private float mDownFocusY;
        private final android.os.Handler mHandler;
        private boolean mInLongPress;
        private boolean mIsDoubleTapping;
        private boolean mIsLongpressEnabled;
        private float mLastFocusX;
        private float mLastFocusY;
        final android.view.GestureDetector.OnGestureListener mListener;
        private int mMaximumFlingVelocity;
        private int mMinimumFlingVelocity;
        private android.view.MotionEvent mPreviousUpEvent;
        boolean mStillDown;
        private int mTouchSlopSquare;
        private android.view.VelocityTracker mVelocityTracker;

        private class GestureHandler extends android.os.Handler {
            final /* synthetic */ androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase this$0;

            GestureHandler(androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            GestureHandler(androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase r1, android.os.Handler r2) {
                    r0 = this;
                    r0.this$0 = r1
                    android.os.Looper r1 = r2.getLooper()
                    r0.<init>(r1)
                    return
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message r4) {
                    r3 = this;
                    int r0 = r4.what
                    r1 = 1
                    if (r0 == r1) goto L43
                    r2 = 2
                    if (r0 == r2) goto L3d
                    r2 = 3
                    if (r0 != r2) goto L28
                    androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase r4 = r3.this$0
                    android.view.GestureDetector$OnDoubleTapListener r4 = r4.mDoubleTapListener
                    if (r4 == 0) goto L4e
                    androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase r4 = r3.this$0
                    boolean r4 = r4.mStillDown
                    if (r4 != 0) goto L23
                    androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase r4 = r3.this$0
                    android.view.GestureDetector$OnDoubleTapListener r4 = r4.mDoubleTapListener
                    androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase r0 = r3.this$0
                    android.view.MotionEvent r0 = r0.mCurrentDownEvent
                    r4.onSingleTapConfirmed(r0)
                    goto L4e
                L23:
                    androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase r4 = r3.this$0
                    r4.mDeferConfirmSingleTap = r1
                    goto L4e
                L28:
                    java.lang.RuntimeException r0 = new java.lang.RuntimeException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Unknown message "
                    r1.<init>(r2)
                    java.lang.StringBuilder r4 = r1.append(r4)
                    java.lang.String r4 = r4.toString()
                    r0.<init>(r4)
                    throw r0
                L3d:
                    androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase r4 = r3.this$0
                    r4.dispatchLongPress()
                    goto L4e
                L43:
                    androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase r4 = r3.this$0
                    android.view.GestureDetector$OnGestureListener r4 = r4.mListener
                    androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase r0 = r3.this$0
                    android.view.MotionEvent r0 = r0.mCurrentDownEvent
                    r4.onShowPress(r0)
                L4e:
                    return
            }
        }

        static {
                int r0 = android.view.ViewConfiguration.getLongPressTimeout()
                androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.LONGPRESS_TIMEOUT = r0
                int r0 = android.view.ViewConfiguration.getTapTimeout()
                androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.TAP_TIMEOUT = r0
                int r0 = android.view.ViewConfiguration.getDoubleTapTimeout()
                androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.DOUBLE_TAP_TIMEOUT = r0
                return
        }

        GestureDetectorCompatImplBase(android.content.Context r2, android.view.GestureDetector.OnGestureListener r3, android.os.Handler r4) {
                r1 = this;
                r1.<init>()
                if (r4 == 0) goto Ld
                androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler r0 = new androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler
                r0.<init>(r1, r4)
                r1.mHandler = r0
                goto L14
            Ld:
                androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler r4 = new androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler
                r4.<init>(r1)
                r1.mHandler = r4
            L14:
                r1.mListener = r3
                boolean r4 = r3 instanceof android.view.GestureDetector.OnDoubleTapListener
                if (r4 == 0) goto L1f
                android.view.GestureDetector$OnDoubleTapListener r3 = (android.view.GestureDetector.OnDoubleTapListener) r3
                r1.setOnDoubleTapListener(r3)
            L1f:
                r1.init(r2)
                return
        }

        private void cancel() {
                r2 = this;
                android.os.Handler r0 = r2.mHandler
                r1 = 1
                r0.removeMessages(r1)
                android.os.Handler r0 = r2.mHandler
                r1 = 2
                r0.removeMessages(r1)
                android.os.Handler r0 = r2.mHandler
                r1 = 3
                r0.removeMessages(r1)
                android.view.VelocityTracker r0 = r2.mVelocityTracker
                r0.recycle()
                r0 = 0
                r2.mVelocityTracker = r0
                r0 = 0
                r2.mIsDoubleTapping = r0
                r2.mStillDown = r0
                r2.mAlwaysInTapRegion = r0
                r2.mAlwaysInBiggerTapRegion = r0
                r2.mDeferConfirmSingleTap = r0
                boolean r1 = r2.mInLongPress
                if (r1 == 0) goto L2b
                r2.mInLongPress = r0
            L2b:
                return
        }

        private void cancelTaps() {
                r2 = this;
                android.os.Handler r0 = r2.mHandler
                r1 = 1
                r0.removeMessages(r1)
                android.os.Handler r0 = r2.mHandler
                r1 = 2
                r0.removeMessages(r1)
                android.os.Handler r0 = r2.mHandler
                r1 = 3
                r0.removeMessages(r1)
                r0 = 0
                r2.mIsDoubleTapping = r0
                r2.mAlwaysInTapRegion = r0
                r2.mAlwaysInBiggerTapRegion = r0
                r2.mDeferConfirmSingleTap = r0
                boolean r1 = r2.mInLongPress
                if (r1 == 0) goto L21
                r2.mInLongPress = r0
            L21:
                return
        }

        private void init(android.content.Context r4) {
                r3 = this;
                if (r4 == 0) goto L30
                android.view.GestureDetector$OnGestureListener r0 = r3.mListener
                if (r0 == 0) goto L28
                r0 = 1
                r3.mIsLongpressEnabled = r0
                android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
                int r0 = r4.getScaledTouchSlop()
                int r1 = r4.getScaledDoubleTapSlop()
                int r2 = r4.getScaledMinimumFlingVelocity()
                r3.mMinimumFlingVelocity = r2
                int r4 = r4.getScaledMaximumFlingVelocity()
                r3.mMaximumFlingVelocity = r4
                int r0 = r0 * r0
                r3.mTouchSlopSquare = r0
                int r1 = r1 * r1
                r3.mDoubleTapSlopSquare = r1
                return
            L28:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "OnGestureListener must not be null"
                r4.<init>(r0)
                throw r4
            L30:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Context must not be null"
                r4.<init>(r0)
                throw r4
        }

        private boolean isConsideredDoubleTap(android.view.MotionEvent r7, android.view.MotionEvent r8, android.view.MotionEvent r9) {
                r6 = this;
                boolean r0 = r6.mAlwaysInBiggerTapRegion
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                long r2 = r9.getEventTime()
                long r4 = r8.getEventTime()
                long r2 = r2 - r4
                int r8 = androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.DOUBLE_TAP_TIMEOUT
                long r4 = (long) r8
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 <= 0) goto L17
                return r1
            L17:
                float r8 = r7.getX()
                int r8 = (int) r8
                float r0 = r9.getX()
                int r0 = (int) r0
                int r8 = r8 - r0
                float r7 = r7.getY()
                int r7 = (int) r7
                float r9 = r9.getY()
                int r9 = (int) r9
                int r7 = r7 - r9
                int r8 = r8 * r8
                int r7 = r7 * r7
                int r8 = r8 + r7
                int r7 = r6.mDoubleTapSlopSquare
                if (r8 >= r7) goto L35
                r1 = 1
            L35:
                return r1
        }

        void dispatchLongPress() {
                r2 = this;
                android.os.Handler r0 = r2.mHandler
                r1 = 3
                r0.removeMessages(r1)
                r0 = 0
                r2.mDeferConfirmSingleTap = r0
                r0 = 1
                r2.mInLongPress = r0
                android.view.GestureDetector$OnGestureListener r0 = r2.mListener
                android.view.MotionEvent r1 = r2.mCurrentDownEvent
                r0.onLongPress(r1)
                return
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public boolean isLongpressEnabled() {
                r1 = this;
                boolean r0 = r1.mIsLongpressEnabled
                return r0
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public boolean onTouchEvent(android.view.MotionEvent r13) {
                r12 = this;
                int r0 = r13.getAction()
                android.view.VelocityTracker r1 = r12.mVelocityTracker
                if (r1 != 0) goto Le
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r12.mVelocityTracker = r1
            Le:
                android.view.VelocityTracker r1 = r12.mVelocityTracker
                r1.addMovement(r13)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = 6
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L1c
                r4 = r2
                goto L1d
            L1c:
                r4 = r3
            L1d:
                if (r4 == 0) goto L24
                int r5 = r13.getActionIndex()
                goto L25
            L24:
                r5 = -1
            L25:
                int r6 = r13.getPointerCount()
                r7 = 0
                r8 = r3
                r9 = r7
                r10 = r9
            L2d:
                if (r8 >= r6) goto L3f
                if (r5 != r8) goto L32
                goto L3c
            L32:
                float r11 = r13.getX(r8)
                float r9 = r9 + r11
                float r11 = r13.getY(r8)
                float r10 = r10 + r11
            L3c:
                int r8 = r8 + 1
                goto L2d
            L3f:
                if (r4 == 0) goto L44
                int r4 = r6 + (-1)
                goto L45
            L44:
                r4 = r6
            L45:
                float r4 = (float) r4
                float r9 = r9 / r4
                float r10 = r10 / r4
                r4 = 2
                r5 = 3
                if (r0 == 0) goto L1bb
                r8 = 1000(0x3e8, float:1.401E-42)
                if (r0 == r2) goto L12d
                if (r0 == r4) goto Lb8
                if (r0 == r5) goto Lb3
                r2 = 5
                if (r0 == r2) goto La6
                if (r0 == r1) goto L5b
                goto L24a
            L5b:
                r12.mLastFocusX = r9
                r12.mDownFocusX = r9
                r12.mLastFocusY = r10
                r12.mDownFocusY = r10
                android.view.VelocityTracker r0 = r12.mVelocityTracker
                int r1 = r12.mMaximumFlingVelocity
                float r1 = (float) r1
                r0.computeCurrentVelocity(r8, r1)
                int r0 = r13.getActionIndex()
                int r1 = r13.getPointerId(r0)
                android.view.VelocityTracker r2 = r12.mVelocityTracker
                float r2 = r2.getXVelocity(r1)
                android.view.VelocityTracker r4 = r12.mVelocityTracker
                float r1 = r4.getYVelocity(r1)
                r4 = r3
            L80:
                if (r4 >= r6) goto L24a
                if (r4 != r0) goto L85
                goto La3
            L85:
                int r5 = r13.getPointerId(r4)
                android.view.VelocityTracker r8 = r12.mVelocityTracker
                float r8 = r8.getXVelocity(r5)
                float r8 = r8 * r2
                android.view.VelocityTracker r9 = r12.mVelocityTracker
                float r5 = r9.getYVelocity(r5)
                float r5 = r5 * r1
                float r8 = r8 + r5
                int r5 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
                if (r5 >= 0) goto La3
                android.view.VelocityTracker r13 = r12.mVelocityTracker
                r13.clear()
                goto L24a
            La3:
                int r4 = r4 + 1
                goto L80
            La6:
                r12.mLastFocusX = r9
                r12.mDownFocusX = r9
                r12.mLastFocusY = r10
                r12.mDownFocusY = r10
                r12.cancelTaps()
                goto L24a
            Lb3:
                r12.cancel()
                goto L24a
            Lb8:
                boolean r0 = r12.mInLongPress
                if (r0 == 0) goto Lbe
                goto L24a
            Lbe:
                float r0 = r12.mLastFocusX
                float r0 = r0 - r9
                float r1 = r12.mLastFocusY
                float r1 = r1 - r10
                boolean r6 = r12.mIsDoubleTapping
                if (r6 == 0) goto Ld1
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.mDoubleTapListener
                boolean r13 = r0.onDoubleTapEvent(r13)
                r3 = r3 | r13
                goto L24a
            Ld1:
                boolean r6 = r12.mAlwaysInTapRegion
                if (r6 == 0) goto L10d
                float r6 = r12.mDownFocusX
                float r6 = r9 - r6
                int r6 = (int) r6
                float r7 = r12.mDownFocusY
                float r7 = r10 - r7
                int r7 = (int) r7
                int r6 = r6 * r6
                int r7 = r7 * r7
                int r6 = r6 + r7
                int r7 = r12.mTouchSlopSquare
                if (r6 <= r7) goto L104
                android.view.GestureDetector$OnGestureListener r7 = r12.mListener
                android.view.MotionEvent r8 = r12.mCurrentDownEvent
                boolean r13 = r7.onScroll(r8, r13, r0, r1)
                r12.mLastFocusX = r9
                r12.mLastFocusY = r10
                r12.mAlwaysInTapRegion = r3
                android.os.Handler r0 = r12.mHandler
                r0.removeMessages(r5)
                android.os.Handler r0 = r12.mHandler
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.mHandler
                r0.removeMessages(r4)
                goto L105
            L104:
                r13 = r3
            L105:
                int r0 = r12.mTouchSlopSquare
                if (r6 <= r0) goto L1b8
                r12.mAlwaysInBiggerTapRegion = r3
                goto L1b8
            L10d:
                float r2 = java.lang.Math.abs(r0)
                r4 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 >= 0) goto L11f
                float r2 = java.lang.Math.abs(r1)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L24a
            L11f:
                android.view.GestureDetector$OnGestureListener r2 = r12.mListener
                android.view.MotionEvent r3 = r12.mCurrentDownEvent
                boolean r3 = r2.onScroll(r3, r13, r0, r1)
                r12.mLastFocusX = r9
                r12.mLastFocusY = r10
                goto L24a
            L12d:
                r12.mStillDown = r3
                android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r13)
                boolean r1 = r12.mIsDoubleTapping
                if (r1 == 0) goto L13f
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.mDoubleTapListener
                boolean r13 = r1.onDoubleTapEvent(r13)
                r13 = r13 | r3
                goto L197
            L13f:
                boolean r1 = r12.mInLongPress
                if (r1 == 0) goto L14b
                android.os.Handler r13 = r12.mHandler
                r13.removeMessages(r5)
                r12.mInLongPress = r3
                goto L18d
            L14b:
                boolean r1 = r12.mAlwaysInTapRegion
                if (r1 == 0) goto L162
                android.view.GestureDetector$OnGestureListener r1 = r12.mListener
                boolean r1 = r1.onSingleTapUp(r13)
                boolean r5 = r12.mDeferConfirmSingleTap
                if (r5 == 0) goto L160
                android.view.GestureDetector$OnDoubleTapListener r5 = r12.mDoubleTapListener
                if (r5 == 0) goto L160
                r5.onSingleTapConfirmed(r13)
            L160:
                r13 = r1
                goto L197
            L162:
                android.view.VelocityTracker r1 = r12.mVelocityTracker
                int r5 = r13.getPointerId(r3)
                int r6 = r12.mMaximumFlingVelocity
                float r6 = (float) r6
                r1.computeCurrentVelocity(r8, r6)
                float r6 = r1.getYVelocity(r5)
                float r1 = r1.getXVelocity(r5)
                float r5 = java.lang.Math.abs(r6)
                int r7 = r12.mMinimumFlingVelocity
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 > 0) goto L18f
                float r5 = java.lang.Math.abs(r1)
                int r7 = r12.mMinimumFlingVelocity
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 <= 0) goto L18d
                goto L18f
            L18d:
                r13 = r3
                goto L197
            L18f:
                android.view.GestureDetector$OnGestureListener r5 = r12.mListener
                android.view.MotionEvent r7 = r12.mCurrentDownEvent
                boolean r13 = r5.onFling(r7, r13, r1, r6)
            L197:
                android.view.MotionEvent r1 = r12.mPreviousUpEvent
                if (r1 == 0) goto L19e
                r1.recycle()
            L19e:
                r12.mPreviousUpEvent = r0
                android.view.VelocityTracker r0 = r12.mVelocityTracker
                if (r0 == 0) goto L1aa
                r0.recycle()
                r0 = 0
                r12.mVelocityTracker = r0
            L1aa:
                r12.mIsDoubleTapping = r3
                r12.mDeferConfirmSingleTap = r3
                android.os.Handler r0 = r12.mHandler
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.mHandler
                r0.removeMessages(r4)
            L1b8:
                r3 = r13
                goto L24a
            L1bb:
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.mDoubleTapListener
                if (r0 == 0) goto L1f7
                android.os.Handler r0 = r12.mHandler
                boolean r0 = r0.hasMessages(r5)
                if (r0 == 0) goto L1cc
                android.os.Handler r1 = r12.mHandler
                r1.removeMessages(r5)
            L1cc:
                android.view.MotionEvent r1 = r12.mCurrentDownEvent
                if (r1 == 0) goto L1ef
                android.view.MotionEvent r6 = r12.mPreviousUpEvent
                if (r6 == 0) goto L1ef
                if (r0 == 0) goto L1ef
                boolean r0 = r12.isConsideredDoubleTap(r1, r6, r13)
                if (r0 == 0) goto L1ef
                r12.mIsDoubleTapping = r2
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.mDoubleTapListener
                android.view.MotionEvent r1 = r12.mCurrentDownEvent
                boolean r0 = r0.onDoubleTap(r1)
                r0 = r0 | r3
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.mDoubleTapListener
                boolean r1 = r1.onDoubleTapEvent(r13)
                r0 = r0 | r1
                goto L1f8
            L1ef:
                android.os.Handler r0 = r12.mHandler
                int r1 = androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.DOUBLE_TAP_TIMEOUT
                long r6 = (long) r1
                r0.sendEmptyMessageDelayed(r5, r6)
            L1f7:
                r0 = r3
            L1f8:
                r12.mLastFocusX = r9
                r12.mDownFocusX = r9
                r12.mLastFocusY = r10
                r12.mDownFocusY = r10
                android.view.MotionEvent r1 = r12.mCurrentDownEvent
                if (r1 == 0) goto L207
                r1.recycle()
            L207:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r13)
                r12.mCurrentDownEvent = r1
                r12.mAlwaysInTapRegion = r2
                r12.mAlwaysInBiggerTapRegion = r2
                r12.mStillDown = r2
                r12.mInLongPress = r3
                r12.mDeferConfirmSingleTap = r3
                boolean r1 = r12.mIsLongpressEnabled
                if (r1 == 0) goto L233
                android.os.Handler r1 = r12.mHandler
                r1.removeMessages(r4)
                android.os.Handler r1 = r12.mHandler
                android.view.MotionEvent r3 = r12.mCurrentDownEvent
                long r5 = r3.getDownTime()
                int r3 = androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.TAP_TIMEOUT
                long r7 = (long) r3
                long r5 = r5 + r7
                int r3 = androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.LONGPRESS_TIMEOUT
                long r7 = (long) r3
                long r5 = r5 + r7
                r1.sendEmptyMessageAtTime(r4, r5)
            L233:
                android.os.Handler r1 = r12.mHandler
                android.view.MotionEvent r3 = r12.mCurrentDownEvent
                long r3 = r3.getDownTime()
                int r5 = androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.TAP_TIMEOUT
                long r5 = (long) r5
                long r3 = r3 + r5
                r1.sendEmptyMessageAtTime(r2, r3)
                android.view.GestureDetector$OnGestureListener r1 = r12.mListener
                boolean r13 = r1.onDown(r13)
                r3 = r0 | r13
            L24a:
                return r3
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public void setIsLongpressEnabled(boolean r1) {
                r0 = this;
                r0.mIsLongpressEnabled = r1
                return
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener r1) {
                r0 = this;
                r0.mDoubleTapListener = r1
                return
        }
    }

    static class GestureDetectorCompatImplJellybeanMr2 implements androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl {
        private final android.view.GestureDetector mDetector;

        GestureDetectorCompatImplJellybeanMr2(android.content.Context r2, android.view.GestureDetector.OnGestureListener r3, android.os.Handler r4) {
                r1 = this;
                r1.<init>()
                android.view.GestureDetector r0 = new android.view.GestureDetector
                r0.<init>(r2, r3, r4)
                r1.mDetector = r0
                return
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public boolean isLongpressEnabled() {
                r1 = this;
                android.view.GestureDetector r0 = r1.mDetector
                boolean r0 = r0.isLongpressEnabled()
                return r0
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public boolean onTouchEvent(android.view.MotionEvent r2) {
                r1 = this;
                android.view.GestureDetector r0 = r1.mDetector
                boolean r2 = r0.onTouchEvent(r2)
                return r2
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public void setIsLongpressEnabled(boolean r2) {
                r1 = this;
                android.view.GestureDetector r0 = r1.mDetector
                r0.setIsLongpressEnabled(r2)
                return
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener r2) {
                r1 = this;
                android.view.GestureDetector r0 = r1.mDetector
                r0.setOnDoubleTapListener(r2)
                return
        }
    }

    public GestureDetectorCompat(android.content.Context r2, android.view.GestureDetector.OnGestureListener r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public GestureDetectorCompat(android.content.Context r2, android.view.GestureDetector.OnGestureListener r3, android.os.Handler r4) {
            r1 = this;
            r1.<init>()
            androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2 r0 = new androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2
            r0.<init>(r2, r3, r4)
            r1.mImpl = r0
            return
    }

    public boolean isLongpressEnabled() {
            r1 = this;
            androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImpl r0 = r1.mImpl
            boolean r0 = r0.isLongpressEnabled()
            return r0
    }

    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImpl r0 = r1.mImpl
            boolean r2 = r0.onTouchEvent(r2)
            return r2
    }

    public void setIsLongpressEnabled(boolean r2) {
            r1 = this;
            androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImpl r0 = r1.mImpl
            r0.setIsLongpressEnabled(r2)
            return
    }

    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener r2) {
            r1 = this;
            androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImpl r0 = r1.mImpl
            r0.setOnDoubleTapListener(r2)
            return
    }
}
