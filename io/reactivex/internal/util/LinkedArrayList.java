package io.reactivex.internal.util;

/* loaded from: classes.dex */
public class LinkedArrayList {
    final int capacityHint;
    java.lang.Object[] head;
    int indexInTail;
    volatile int size;
    java.lang.Object[] tail;

    public LinkedArrayList(int r1) {
            r0 = this;
            r0.<init>()
            r0.capacityHint = r1
            return
    }

    public void add(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.size
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L16
            int r0 = r4.capacityHint
            int r0 = r0 + r2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r4.head = r0
            r4.tail = r0
            r0[r1] = r5
            r4.indexInTail = r2
            r4.size = r2
            goto L3c
        L16:
            int r0 = r4.indexInTail
            int r3 = r4.capacityHint
            if (r0 != r3) goto L30
            int r0 = r3 + 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r5
            java.lang.Object[] r5 = r4.tail
            r5[r3] = r0
            r4.tail = r0
            r4.indexInTail = r2
            int r5 = r4.size
            int r5 = r5 + r2
            r4.size = r5
            goto L3c
        L30:
            java.lang.Object[] r1 = r4.tail
            r1[r0] = r5
            int r0 = r0 + r2
            r4.indexInTail = r0
            int r5 = r4.size
            int r5 = r5 + r2
            r4.size = r5
        L3c:
            return
    }

    public java.lang.Object[] head() {
            r1 = this;
            java.lang.Object[] r0 = r1.head
            return r0
    }

    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    public java.lang.String toString() {
            r8 = this;
            int r0 = r8.capacityHint
            int r1 = r8.size
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1 + 1
            r2.<init>(r3)
            java.lang.Object[] r3 = r8.head()
            r4 = 0
            r5 = r4
            r6 = r5
        L12:
            if (r5 >= r1) goto L27
            r7 = r3[r6]
            r2.add(r7)
            int r5 = r5 + 1
            int r6 = r6 + 1
            if (r6 != r0) goto L12
            r3 = r3[r0]
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r6 = r4
            goto L12
        L27:
            java.lang.String r0 = r2.toString()
            return r0
    }
}
