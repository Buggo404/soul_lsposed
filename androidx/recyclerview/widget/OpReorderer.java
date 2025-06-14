package androidx.recyclerview.widget;

/* loaded from: classes.dex */
class OpReorderer {
    final androidx.recyclerview.widget.OpReorderer.Callback mCallback;

    interface Callback {
        androidx.recyclerview.widget.AdapterHelper.UpdateOp obtainUpdateOp(int r1, int r2, int r3, java.lang.Object r4);

        void recycleUpdateOp(androidx.recyclerview.widget.AdapterHelper.UpdateOp r1);
    }

    OpReorderer(androidx.recyclerview.widget.OpReorderer.Callback r1) {
            r0 = this;
            r0.<init>()
            r0.mCallback = r1
            return
    }

    private int getLastMoveOutOfOrder(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r6) {
            r5 = this;
            int r0 = r6.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L7:
            if (r0 < 0) goto L1c
            java.lang.Object r3 = r6.get(r0)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r3 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r3
            int r3 = r3.cmd
            r4 = 8
            if (r3 != r4) goto L18
            if (r2 == 0) goto L19
            return r0
        L18:
            r2 = r1
        L19:
            int r0 = r0 + (-1)
            goto L7
        L1c:
            r6 = -1
            return r6
    }

    private void swapMoveAdd(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r4, int r5, androidx.recyclerview.widget.AdapterHelper.UpdateOp r6, int r7, androidx.recyclerview.widget.AdapterHelper.UpdateOp r8) {
            r3 = this;
            int r0 = r6.itemCount
            int r1 = r8.positionStart
            if (r0 >= r1) goto L8
            r0 = -1
            goto L9
        L8:
            r0 = 0
        L9:
            int r1 = r6.positionStart
            int r2 = r8.positionStart
            if (r1 >= r2) goto L11
            int r0 = r0 + 1
        L11:
            int r1 = r8.positionStart
            int r2 = r6.positionStart
            if (r1 > r2) goto L1e
            int r1 = r6.positionStart
            int r2 = r8.itemCount
            int r1 = r1 + r2
            r6.positionStart = r1
        L1e:
            int r1 = r8.positionStart
            int r2 = r6.itemCount
            if (r1 > r2) goto L2b
            int r1 = r6.itemCount
            int r2 = r8.itemCount
            int r1 = r1 + r2
            r6.itemCount = r1
        L2b:
            int r1 = r8.positionStart
            int r1 = r1 + r0
            r8.positionStart = r1
            r4.set(r5, r8)
            r4.set(r7, r6)
            return
    }

    private void swapMoveOp(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r8, int r9, int r10) {
            r7 = this;
            java.lang.Object r0 = r8.get(r9)
            r4 = r0
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r4 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r4
            java.lang.Object r0 = r8.get(r10)
            r6 = r0
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r6 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r6
            int r0 = r6.cmd
            r1 = 1
            if (r0 == r1) goto L2a
            r1 = 2
            if (r0 == r1) goto L22
            r1 = 4
            if (r0 == r1) goto L1a
            goto L31
        L1a:
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.swapMoveUpdate(r2, r3, r4, r5, r6)
            goto L31
        L22:
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.swapMoveRemove(r2, r3, r4, r5, r6)
            goto L31
        L2a:
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r1.swapMoveAdd(r2, r3, r4, r5, r6)
        L31:
            return
    }

    void reorderOps(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r3) {
            r2 = this;
        L0:
            int r0 = r2.getLastMoveOutOfOrder(r3)
            r1 = -1
            if (r0 == r1) goto Ld
            int r1 = r0 + 1
            r2.swapMoveOp(r3, r0, r1)
            goto L0
        Ld:
            return
    }

    void swapMoveRemove(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r9, int r10, androidx.recyclerview.widget.AdapterHelper.UpdateOp r11, int r12, androidx.recyclerview.widget.AdapterHelper.UpdateOp r13) {
            r8 = this;
            int r0 = r11.positionStart
            int r1 = r11.itemCount
            r2 = 1
            r3 = 0
            if (r0 >= r1) goto L1c
            int r0 = r13.positionStart
            int r1 = r11.positionStart
            if (r0 != r1) goto L1a
            int r0 = r13.itemCount
            int r1 = r11.itemCount
            int r4 = r11.positionStart
            int r1 = r1 - r4
            if (r0 != r1) goto L1a
            r0 = r3
            r3 = r2
            goto L30
        L1a:
            r0 = r3
            goto L30
        L1c:
            int r0 = r13.positionStart
            int r1 = r11.itemCount
            int r1 = r1 + r2
            if (r0 != r1) goto L2f
            int r0 = r13.itemCount
            int r1 = r11.positionStart
            int r4 = r11.itemCount
            int r1 = r1 - r4
            if (r0 != r1) goto L2f
            r0 = r2
            r3 = r0
            goto L30
        L2f:
            r0 = r2
        L30:
            int r1 = r11.itemCount
            int r4 = r13.positionStart
            r5 = 2
            if (r1 >= r4) goto L3d
            int r1 = r13.positionStart
            int r1 = r1 - r2
            r13.positionStart = r1
            goto L5c
        L3d:
            int r1 = r11.itemCount
            int r4 = r13.positionStart
            int r6 = r13.itemCount
            int r4 = r4 + r6
            if (r1 >= r4) goto L5c
            int r10 = r13.itemCount
            int r10 = r10 - r2
            r13.itemCount = r10
            r11.cmd = r5
            r11.itemCount = r2
            int r10 = r13.itemCount
            if (r10 != 0) goto L5b
            r9.remove(r12)
            androidx.recyclerview.widget.OpReorderer$Callback r9 = r8.mCallback
            r9.recycleUpdateOp(r13)
        L5b:
            return
        L5c:
            int r1 = r11.positionStart
            int r4 = r13.positionStart
            r6 = 0
            if (r1 > r4) goto L69
            int r1 = r13.positionStart
            int r1 = r1 + r2
            r13.positionStart = r1
            goto L8a
        L69:
            int r1 = r11.positionStart
            int r4 = r13.positionStart
            int r7 = r13.itemCount
            int r4 = r4 + r7
            if (r1 >= r4) goto L8a
            int r1 = r13.positionStart
            int r4 = r13.itemCount
            int r1 = r1 + r4
            int r4 = r11.positionStart
            int r1 = r1 - r4
            androidx.recyclerview.widget.OpReorderer$Callback r4 = r8.mCallback
            int r7 = r11.positionStart
            int r7 = r7 + r2
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r6 = r4.obtainUpdateOp(r5, r7, r1, r6)
            int r1 = r11.positionStart
            int r2 = r13.positionStart
            int r1 = r1 - r2
            r13.itemCount = r1
        L8a:
            if (r3 == 0) goto L98
            r9.set(r10, r13)
            r9.remove(r12)
            androidx.recyclerview.widget.OpReorderer$Callback r9 = r8.mCallback
            r9.recycleUpdateOp(r11)
            return
        L98:
            if (r0 == 0) goto Ld1
            if (r6 == 0) goto Lb6
            int r0 = r11.positionStart
            int r1 = r6.positionStart
            if (r0 <= r1) goto La9
            int r0 = r11.positionStart
            int r1 = r6.itemCount
            int r0 = r0 - r1
            r11.positionStart = r0
        La9:
            int r0 = r11.itemCount
            int r1 = r6.positionStart
            if (r0 <= r1) goto Lb6
            int r0 = r11.itemCount
            int r1 = r6.itemCount
            int r0 = r0 - r1
            r11.itemCount = r0
        Lb6:
            int r0 = r11.positionStart
            int r1 = r13.positionStart
            if (r0 <= r1) goto Lc3
            int r0 = r11.positionStart
            int r1 = r13.itemCount
            int r0 = r0 - r1
            r11.positionStart = r0
        Lc3:
            int r0 = r11.itemCount
            int r1 = r13.positionStart
            if (r0 <= r1) goto L107
            int r0 = r11.itemCount
            int r1 = r13.itemCount
            int r0 = r0 - r1
            r11.itemCount = r0
            goto L107
        Ld1:
            if (r6 == 0) goto Led
            int r0 = r11.positionStart
            int r1 = r6.positionStart
            if (r0 < r1) goto Le0
            int r0 = r11.positionStart
            int r1 = r6.itemCount
            int r0 = r0 - r1
            r11.positionStart = r0
        Le0:
            int r0 = r11.itemCount
            int r1 = r6.positionStart
            if (r0 < r1) goto Led
            int r0 = r11.itemCount
            int r1 = r6.itemCount
            int r0 = r0 - r1
            r11.itemCount = r0
        Led:
            int r0 = r11.positionStart
            int r1 = r13.positionStart
            if (r0 < r1) goto Lfa
            int r0 = r11.positionStart
            int r1 = r13.itemCount
            int r0 = r0 - r1
            r11.positionStart = r0
        Lfa:
            int r0 = r11.itemCount
            int r1 = r13.positionStart
            if (r0 < r1) goto L107
            int r0 = r11.itemCount
            int r1 = r13.itemCount
            int r0 = r0 - r1
            r11.itemCount = r0
        L107:
            r9.set(r10, r13)
            int r13 = r11.positionStart
            int r0 = r11.itemCount
            if (r13 == r0) goto L114
            r9.set(r12, r11)
            goto L117
        L114:
            r9.remove(r12)
        L117:
            if (r6 == 0) goto L11c
            r9.add(r10, r6)
        L11c:
            return
    }

    void swapMoveUpdate(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r8, int r9, androidx.recyclerview.widget.AdapterHelper.UpdateOp r10, int r11, androidx.recyclerview.widget.AdapterHelper.UpdateOp r12) {
            r7 = this;
            int r0 = r10.itemCount
            int r1 = r12.positionStart
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Lf
            int r0 = r12.positionStart
            int r0 = r0 - r3
            r12.positionStart = r0
            goto L28
        Lf:
            int r0 = r10.itemCount
            int r1 = r12.positionStart
            int r5 = r12.itemCount
            int r1 = r1 + r5
            if (r0 >= r1) goto L28
            int r0 = r12.itemCount
            int r0 = r0 - r3
            r12.itemCount = r0
            androidx.recyclerview.widget.OpReorderer$Callback r0 = r7.mCallback
            int r1 = r10.positionStart
            java.lang.Object r5 = r12.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r0 = r0.obtainUpdateOp(r2, r1, r3, r5)
            goto L29
        L28:
            r0 = r4
        L29:
            int r1 = r10.positionStart
            int r5 = r12.positionStart
            if (r1 > r5) goto L35
            int r1 = r12.positionStart
            int r1 = r1 + r3
            r12.positionStart = r1
            goto L56
        L35:
            int r1 = r10.positionStart
            int r5 = r12.positionStart
            int r6 = r12.itemCount
            int r5 = r5 + r6
            if (r1 >= r5) goto L56
            int r1 = r12.positionStart
            int r4 = r12.itemCount
            int r1 = r1 + r4
            int r4 = r10.positionStart
            int r1 = r1 - r4
            androidx.recyclerview.widget.OpReorderer$Callback r4 = r7.mCallback
            int r5 = r10.positionStart
            int r5 = r5 + r3
            java.lang.Object r3 = r12.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r4 = r4.obtainUpdateOp(r2, r5, r1, r3)
            int r2 = r12.itemCount
            int r2 = r2 - r1
            r12.itemCount = r2
        L56:
            r8.set(r11, r10)
            int r10 = r12.itemCount
            if (r10 <= 0) goto L61
            r8.set(r9, r12)
            goto L69
        L61:
            r8.remove(r9)
            androidx.recyclerview.widget.OpReorderer$Callback r10 = r7.mCallback
            r10.recycleUpdateOp(r12)
        L69:
            if (r0 == 0) goto L6e
            r8.add(r9, r0)
        L6e:
            if (r4 == 0) goto L73
            r8.add(r9, r4)
        L73:
            return
    }
}
