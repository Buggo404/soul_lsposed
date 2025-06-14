package io.reactivex.internal.util;

/* loaded from: classes.dex */
public class AppendOnlyLinkedArrayList<T> {
    final int capacity;
    final java.lang.Object[] head;
    int offset;
    java.lang.Object[] tail;

    public interface NonThrowingPredicate<T> extends io.reactivex.functions.Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        boolean test(T r1);
    }

    public AppendOnlyLinkedArrayList(int r1) {
            r0 = this;
            r0.<init>()
            r0.capacity = r1
            int r1 = r1 + 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.head = r1
            r0.tail = r1
            return
    }

    public <U> boolean accept(io.reactivex.Observer<? super U> r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.head
            int r1 = r4.capacity
        L4:
            r2 = 0
            if (r0 == 0) goto L20
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = io.reactivex.internal.util.NotificationLite.acceptFull(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L20:
            return r2
    }

    public <U> boolean accept(org.reactivestreams.Subscriber<? super U> r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.head
            int r1 = r4.capacity
        L4:
            r2 = 0
            if (r0 == 0) goto L20
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = io.reactivex.internal.util.NotificationLite.acceptFull(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L20:
            return r2
    }

    public void add(T r4) {
            r3 = this;
            int r0 = r3.capacity
            int r1 = r3.offset
            if (r1 != r0) goto L11
            int r1 = r0 + 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object[] r2 = r3.tail
            r2[r0] = r1
            r3.tail = r1
            r1 = 0
        L11:
            java.lang.Object[] r0 = r3.tail
            r0[r1] = r4
            int r1 = r1 + 1
            r3.offset = r1
            return
    }

    public void forEachWhile(io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate<? super T> r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.head
            int r1 = r4.capacity
        L4:
            if (r0 == 0) goto L1f
            r2 = 0
        L7:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L18
        Le:
            boolean r3 = r5.test(r3)
            if (r3 == 0) goto L15
            return
        L15:
            int r2 = r2 + 1
            goto L7
        L18:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1f:
            return
    }

    public <S> void forEachWhile(S r5, io.reactivex.functions.BiPredicate<? super S, ? super T> r6) throws java.lang.Exception {
            r4 = this;
            java.lang.Object[] r0 = r4.head
            int r1 = r4.capacity
        L4:
            r2 = 0
        L5:
            if (r2 >= r1) goto L16
            r3 = r0[r2]
            if (r3 != 0) goto Lc
            return
        Lc:
            boolean r3 = r6.test(r5, r3)
            if (r3 == 0) goto L13
            return
        L13:
            int r2 = r2 + 1
            goto L5
        L16:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
    }

    public void setFirst(T r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.head
            r1 = 0
            r0[r1] = r3
            return
    }
}
