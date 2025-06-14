package androidx.core.view;

/* loaded from: classes.dex */
public class DragStartHelper {
    private boolean mDragging;
    private int mLastTouchX;
    private int mLastTouchY;
    private final androidx.core.view.DragStartHelper.OnDragStartListener mListener;
    private final android.view.View.OnLongClickListener mLongClickListener;
    private final android.view.View.OnTouchListener mTouchListener;
    private final android.view.View mView;



    public interface OnDragStartListener {
        boolean onDragStart(android.view.View r1, androidx.core.view.DragStartHelper r2);
    }

    public DragStartHelper(android.view.View r2, androidx.core.view.DragStartHelper.OnDragStartListener r3) {
            r1 = this;
            r1.<init>()
            androidx.core.view.DragStartHelper$1 r0 = new androidx.core.view.DragStartHelper$1
            r0.<init>(r1)
            r1.mLongClickListener = r0
            androidx.core.view.DragStartHelper$2 r0 = new androidx.core.view.DragStartHelper$2
            r0.<init>(r1)
            r1.mTouchListener = r0
            r1.mView = r2
            r1.mListener = r3
            return
    }

    public void attach() {
            r2 = this;
            android.view.View r0 = r2.mView
            android.view.View$OnLongClickListener r1 = r2.mLongClickListener
            r0.setOnLongClickListener(r1)
            android.view.View r0 = r2.mView
            android.view.View$OnTouchListener r1 = r2.mTouchListener
            r0.setOnTouchListener(r1)
            return
    }

    public void detach() {
            r2 = this;
            android.view.View r0 = r2.mView
            r1 = 0
            r0.setOnLongClickListener(r1)
            android.view.View r0 = r2.mView
            r0.setOnTouchListener(r1)
            return
    }

    public void getTouchPosition(android.graphics.Point r3) {
            r2 = this;
            int r0 = r2.mLastTouchX
            int r1 = r2.mLastTouchY
            r3.set(r0, r1)
            return
    }

    public boolean onLongClick(android.view.View r2) {
            r1 = this;
            androidx.core.view.DragStartHelper$OnDragStartListener r0 = r1.mListener
            boolean r2 = r0.onDragStart(r2, r1)
            return r2
    }

    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L49
            r4 = 1
            if (r2 == r4) goto L46
            r5 = 2
            if (r2 == r5) goto L1b
            r7 = 3
            if (r2 == r7) goto L46
            goto L4d
        L1b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = androidx.core.view.MotionEventCompat.isFromSource(r8, r2)
            if (r2 == 0) goto L4d
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L2b
            goto L4d
        L2b:
            boolean r8 = r6.mDragging
            if (r8 == 0) goto L30
            goto L4d
        L30:
            int r8 = r6.mLastTouchX
            if (r8 != r0) goto L39
            int r8 = r6.mLastTouchY
            if (r8 != r1) goto L39
            goto L4d
        L39:
            r6.mLastTouchX = r0
            r6.mLastTouchY = r1
            androidx.core.view.DragStartHelper$OnDragStartListener r8 = r6.mListener
            boolean r7 = r8.onDragStart(r7, r6)
            r6.mDragging = r7
            return r7
        L46:
            r6.mDragging = r3
            goto L4d
        L49:
            r6.mLastTouchX = r0
            r6.mLastTouchY = r1
        L4d:
            return r3
    }
}
