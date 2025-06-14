package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class BatchingListUpdateCallback implements androidx.recyclerview.widget.ListUpdateCallback {
    private static final int TYPE_ADD = 1;
    private static final int TYPE_CHANGE = 3;
    private static final int TYPE_NONE = 0;
    private static final int TYPE_REMOVE = 2;
    int mLastEventCount;
    java.lang.Object mLastEventPayload;
    int mLastEventPosition;
    int mLastEventType;
    final androidx.recyclerview.widget.ListUpdateCallback mWrapped;

    public BatchingListUpdateCallback(androidx.recyclerview.widget.ListUpdateCallback r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mLastEventType = r0
            r0 = -1
            r1.mLastEventPosition = r0
            r1.mLastEventCount = r0
            r0 = 0
            r1.mLastEventPayload = r0
            r1.mWrapped = r2
            return
    }

    public void dispatchLastEvent() {
            r4 = this;
            int r0 = r4.mLastEventType
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 1
            if (r0 == r1) goto L25
            r1 = 2
            if (r0 == r1) goto L1b
            r1 = 3
            if (r0 == r1) goto Lf
            goto L2e
        Lf:
            androidx.recyclerview.widget.ListUpdateCallback r0 = r4.mWrapped
            int r1 = r4.mLastEventPosition
            int r2 = r4.mLastEventCount
            java.lang.Object r3 = r4.mLastEventPayload
            r0.onChanged(r1, r2, r3)
            goto L2e
        L1b:
            androidx.recyclerview.widget.ListUpdateCallback r0 = r4.mWrapped
            int r1 = r4.mLastEventPosition
            int r2 = r4.mLastEventCount
            r0.onRemoved(r1, r2)
            goto L2e
        L25:
            androidx.recyclerview.widget.ListUpdateCallback r0 = r4.mWrapped
            int r1 = r4.mLastEventPosition
            int r2 = r4.mLastEventCount
            r0.onInserted(r1, r2)
        L2e:
            r0 = 0
            r4.mLastEventPayload = r0
            r0 = 0
            r4.mLastEventType = r0
            return
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int r6, int r7, java.lang.Object r8) {
            r5 = this;
            int r0 = r5.mLastEventType
            r1 = 3
            if (r0 != r1) goto L26
            int r0 = r5.mLastEventPosition
            int r2 = r5.mLastEventCount
            int r3 = r0 + r2
            if (r6 > r3) goto L26
            int r3 = r6 + r7
            if (r3 < r0) goto L26
            java.lang.Object r4 = r5.mLastEventPayload
            if (r4 != r8) goto L26
            int r2 = r2 + r0
            int r6 = java.lang.Math.min(r6, r0)
            r5.mLastEventPosition = r6
            int r6 = java.lang.Math.max(r2, r3)
            int r7 = r5.mLastEventPosition
            int r6 = r6 - r7
            r5.mLastEventCount = r6
            return
        L26:
            r5.dispatchLastEvent()
            r5.mLastEventPosition = r6
            r5.mLastEventCount = r7
            r5.mLastEventPayload = r8
            r5.mLastEventType = r1
            return
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int r5, int r6) {
            r4 = this;
            int r0 = r4.mLastEventType
            r1 = 1
            if (r0 != r1) goto L19
            int r0 = r4.mLastEventPosition
            if (r5 < r0) goto L19
            int r2 = r4.mLastEventCount
            int r3 = r0 + r2
            if (r5 > r3) goto L19
            int r2 = r2 + r6
            r4.mLastEventCount = r2
            int r5 = java.lang.Math.min(r5, r0)
            r4.mLastEventPosition = r5
            return
        L19:
            r4.dispatchLastEvent()
            r4.mLastEventPosition = r5
            r4.mLastEventCount = r6
            r4.mLastEventType = r1
            return
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int r2, int r3) {
            r1 = this;
            r1.dispatchLastEvent()
            androidx.recyclerview.widget.ListUpdateCallback r0 = r1.mWrapped
            r0.onMoved(r2, r3)
            return
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int r4, int r5) {
            r3 = this;
            int r0 = r3.mLastEventType
            r1 = 2
            if (r0 != r1) goto L15
            int r0 = r3.mLastEventPosition
            if (r0 < r4) goto L15
            int r2 = r4 + r5
            if (r0 > r2) goto L15
            int r0 = r3.mLastEventCount
            int r0 = r0 + r5
            r3.mLastEventCount = r0
            r3.mLastEventPosition = r4
            return
        L15:
            r3.dispatchLastEvent()
            r3.mLastEventPosition = r4
            r3.mLastEventCount = r5
            r3.mLastEventType = r1
            return
    }
}
