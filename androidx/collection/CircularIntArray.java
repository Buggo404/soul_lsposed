package androidx.collection;

/* loaded from: classes.dex */
public final class CircularIntArray {
    private int mCapacityBitmask;
    private int[] mElements;
    private int mHead;
    private int mTail;

    public CircularIntArray() {
            r1 = this;
            r0 = 8
            r1.<init>(r0)
            return
    }

    public CircularIntArray(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            if (r3 < r0) goto L28
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 > r1) goto L20
            int r1 = java.lang.Integer.bitCount(r3)
            if (r1 == r0) goto L17
            int r3 = r3 + (-1)
            int r3 = java.lang.Integer.highestOneBit(r3)
            int r3 = r3 << r0
        L17:
            int r0 = r3 + (-1)
            r2.mCapacityBitmask = r0
            int[] r3 = new int[r3]
            r2.mElements = r3
            return
        L20:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "capacity must be <= 2^30"
            r3.<init>(r0)
            throw r3
        L28:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "capacity must be >= 1"
            r3.<init>(r0)
            throw r3
    }

    private void doubleCapacity() {
            r7 = this;
            int[] r0 = r7.mElements
            int r1 = r0.length
            int r2 = r7.mHead
            int r3 = r1 - r2
            int r4 = r1 << 1
            if (r4 < 0) goto L23
            int[] r5 = new int[r4]
            r6 = 0
            java.lang.System.arraycopy(r0, r2, r5, r6, r3)
            int[] r0 = r7.mElements
            int r2 = r7.mHead
            java.lang.System.arraycopy(r0, r6, r5, r3, r2)
            r7.mElements = r5
            r7.mHead = r6
            r7.mTail = r1
            int r4 = r4 + (-1)
            r7.mCapacityBitmask = r4
            return
        L23:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Max array capacity exceeded"
            r0.<init>(r1)
            throw r0
    }

    public void addFirst(int r3) {
            r2 = this;
            int r0 = r2.mHead
            int r0 = r0 + (-1)
            int r1 = r2.mCapacityBitmask
            r0 = r0 & r1
            r2.mHead = r0
            int[] r1 = r2.mElements
            r1[r0] = r3
            int r3 = r2.mTail
            if (r0 != r3) goto L14
            r2.doubleCapacity()
        L14:
            return
    }

    public void addLast(int r3) {
            r2 = this;
            int[] r0 = r2.mElements
            int r1 = r2.mTail
            r0[r1] = r3
            int r1 = r1 + 1
            int r3 = r2.mCapacityBitmask
            r3 = r3 & r1
            r2.mTail = r3
            int r0 = r2.mHead
            if (r3 != r0) goto L14
            r2.doubleCapacity()
        L14:
            return
    }

    public void clear() {
            r1 = this;
            int r0 = r1.mHead
            r1.mTail = r0
            return
    }

    public int get(int r3) {
            r2 = this;
            if (r3 < 0) goto L13
            int r0 = r2.size()
            if (r3 >= r0) goto L13
            int[] r0 = r2.mElements
            int r1 = r2.mHead
            int r1 = r1 + r3
            int r3 = r2.mCapacityBitmask
            r3 = r3 & r1
            r3 = r0[r3]
            return r3
        L13:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            r3.<init>()
            throw r3
    }

    public int getFirst() {
            r2 = this;
            int r0 = r2.mHead
            int r1 = r2.mTail
            if (r0 == r1) goto Lb
            int[] r1 = r2.mElements
            r0 = r1[r0]
            return r0
        Lb:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public int getLast() {
            r3 = this;
            int r0 = r3.mHead
            int r1 = r3.mTail
            if (r0 == r1) goto L10
            int[] r0 = r3.mElements
            int r1 = r1 + (-1)
            int r2 = r3.mCapacityBitmask
            r1 = r1 & r2
            r0 = r0[r1]
            return r0
        L10:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public boolean isEmpty() {
            r2 = this;
            int r0 = r2.mHead
            int r1 = r2.mTail
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public int popFirst() {
            r3 = this;
            int r0 = r3.mHead
            int r1 = r3.mTail
            if (r0 == r1) goto L12
            int[] r1 = r3.mElements
            r1 = r1[r0]
            int r0 = r0 + 1
            int r2 = r3.mCapacityBitmask
            r0 = r0 & r2
            r3.mHead = r0
            return r1
        L12:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public int popLast() {
            r2 = this;
            int r0 = r2.mHead
            int r1 = r2.mTail
            if (r0 == r1) goto L12
            int r1 = r1 + (-1)
            int r0 = r2.mCapacityBitmask
            r0 = r0 & r1
            int[] r1 = r2.mElements
            r1 = r1[r0]
            r2.mTail = r0
            return r1
        L12:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public void removeFromEnd(int r2) {
            r1 = this;
            if (r2 > 0) goto L3
            return
        L3:
            int r0 = r1.size()
            if (r2 > r0) goto L12
            int r0 = r1.mTail
            int r0 = r0 - r2
            int r2 = r1.mCapacityBitmask
            r2 = r2 & r0
            r1.mTail = r2
            return
        L12:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    public void removeFromStart(int r2) {
            r1 = this;
            if (r2 > 0) goto L3
            return
        L3:
            int r0 = r1.size()
            if (r2 > r0) goto L12
            int r0 = r1.mHead
            int r0 = r0 + r2
            int r2 = r1.mCapacityBitmask
            r2 = r2 & r0
            r1.mHead = r2
            return
        L12:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    public int size() {
            r2 = this;
            int r0 = r2.mTail
            int r1 = r2.mHead
            int r0 = r0 - r1
            int r1 = r2.mCapacityBitmask
            r0 = r0 & r1
            return r0
    }
}
