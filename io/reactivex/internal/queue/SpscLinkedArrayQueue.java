package io.reactivex.internal.queue;

/* loaded from: classes.dex */
public final class SpscLinkedArrayQueue<T> implements io.reactivex.internal.fuseable.SimplePlainQueue<T> {
    private static final java.lang.Object HAS_NEXT = null;
    static final int MAX_LOOK_AHEAD_STEP = 0;
    java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> consumerBuffer;
    final java.util.concurrent.atomic.AtomicLong consumerIndex;
    final int consumerMask;
    java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> producerBuffer;
    final java.util.concurrent.atomic.AtomicLong producerIndex;
    long producerLookAhead;
    int producerLookAheadStep;
    final int producerMask;

    static {
            java.lang.String r0 = "jctools.spsc.max.lookahead.step"
            r1 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            int r0 = r0.intValue()
            io.reactivex.internal.queue.SpscLinkedArrayQueue.MAX_LOOK_AHEAD_STEP = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            io.reactivex.internal.queue.SpscLinkedArrayQueue.HAS_NEXT = r0
            return
    }

    public SpscLinkedArrayQueue(int r4) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.producerIndex = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.consumerIndex = r0
            r0 = 8
            int r4 = java.lang.Math.max(r0, r4)
            int r4 = io.reactivex.internal.util.Pow2.roundToPowerOfTwo(r4)
            int r0 = r4 + (-1)
            java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r2 = r4 + 1
            r1.<init>(r2)
            r3.producerBuffer = r1
            r3.producerMask = r0
            r3.adjustLookAheadStep(r4)
            r3.consumerBuffer = r1
            r3.consumerMask = r0
            int r0 = r0 + (-1)
            long r0 = (long) r0
            r3.producerLookAhead = r0
            r0 = 0
            r3.soProducerIndex(r0)
            return
    }

    private void adjustLookAheadStep(int r2) {
            r1 = this;
            int r2 = r2 / 4
            int r0 = io.reactivex.internal.queue.SpscLinkedArrayQueue.MAX_LOOK_AHEAD_STEP
            int r2 = java.lang.Math.min(r2, r0)
            r1.producerLookAheadStep = r2
            return
    }

    private static int calcDirectOffset(int r0) {
            return r0
    }

    private static int calcWrappedOffset(long r0, int r2) {
            int r0 = (int) r0
            r0 = r0 & r2
            int r0 = calcDirectOffset(r0)
            return r0
    }

    private long lpConsumerIndex() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.consumerIndex
            long r0 = r0.get()
            return r0
    }

    private long lpProducerIndex() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.producerIndex
            long r0 = r0.get()
            return r0
    }

    private long lvConsumerIndex() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.consumerIndex
            long r0 = r0.get()
            return r0
    }

    private static <E> java.lang.Object lvElement(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0, int r1) {
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    private java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> lvNextBufferAndUnlink(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r3, int r4) {
            r2 = this;
            int r4 = calcDirectOffset(r4)
            java.lang.Object r0 = lvElement(r3, r4)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = (java.util.concurrent.atomic.AtomicReferenceArray) r0
            r1 = 0
            soElement(r3, r4, r1)
            return r0
    }

    private long lvProducerIndex() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.producerIndex
            long r0 = r0.get()
            return r0
    }

    private T newBufferPeek(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r1, long r2, int r4) {
            r0 = this;
            r0.consumerBuffer = r1
            int r2 = calcWrappedOffset(r2, r4)
            java.lang.Object r1 = lvElement(r1, r2)
            return r1
    }

    private T newBufferPoll(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r4, long r5, int r7) {
            r3 = this;
            r3.consumerBuffer = r4
            int r7 = calcWrappedOffset(r5, r7)
            java.lang.Object r0 = lvElement(r4, r7)
            if (r0 == 0) goto L16
            r1 = 0
            soElement(r4, r7, r1)
            r1 = 1
            long r5 = r5 + r1
            r3.soConsumerIndex(r5)
        L16:
            return r0
    }

    private void resize(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r5, long r6, int r8, T r9, long r10) {
            r4 = this;
            int r0 = r5.length()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
            r1.<init>(r0)
            r4.producerBuffer = r1
            long r10 = r10 + r6
            r2 = 1
            long r10 = r10 - r2
            r4.producerLookAhead = r10
            soElement(r1, r8, r9)
            r4.soNext(r5, r1)
            java.lang.Object r9 = io.reactivex.internal.queue.SpscLinkedArrayQueue.HAS_NEXT
            soElement(r5, r8, r9)
            long r6 = r6 + r2
            r4.soProducerIndex(r6)
            return
    }

    private void soConsumerIndex(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.consumerIndex
            r0.lazySet(r2)
            return
    }

    private static void soElement(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0, int r1, java.lang.Object r2) {
            r0.lazySet(r1, r2)
            return
    }

    private void soNext(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r2, java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r3) {
            r1 = this;
            int r0 = r2.length()
            int r0 = r0 + (-1)
            int r0 = calcDirectOffset(r0)
            soElement(r2, r0, r3)
            return
    }

    private void soProducerIndex(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.producerIndex
            r0.lazySet(r2)
            return
    }

    private boolean writeToQueue(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r1, T r2, long r3, int r5) {
            r0 = this;
            soElement(r1, r5, r2)
            r1 = 1
            long r3 = r3 + r1
            r0.soProducerIndex(r3)
            r1 = 1
            return r1
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
            r1 = this;
        L0:
            java.lang.Object r0 = r1.poll()
            if (r0 != 0) goto L0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Ld
            goto L0
        Ld:
            return
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
            r4 = this;
            long r0 = r4.lvProducerIndex()
            long r2 = r4.lvConsumerIndex()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T r11) {
            r10 = this;
            if (r11 == 0) goto L51
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r1 = r10.producerBuffer
            long r3 = r10.lpProducerIndex()
            int r0 = r10.producerMask
            int r5 = calcWrappedOffset(r3, r0)
            long r6 = r10.producerLookAhead
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 >= 0) goto L1b
            r0 = r10
            r2 = r11
            boolean r11 = r0.writeToQueue(r1, r2, r3, r5)
            return r11
        L1b:
            int r2 = r10.producerLookAheadStep
            long r6 = (long) r2
            long r6 = r6 + r3
            int r2 = calcWrappedOffset(r6, r0)
            java.lang.Object r2 = lvElement(r1, r2)
            r8 = 1
            if (r2 != 0) goto L35
            long r6 = r6 - r8
            r10.producerLookAhead = r6
            r0 = r10
            r2 = r11
            boolean r11 = r0.writeToQueue(r1, r2, r3, r5)
            return r11
        L35:
            long r8 = r8 + r3
            int r2 = calcWrappedOffset(r8, r0)
            java.lang.Object r2 = lvElement(r1, r2)
            if (r2 != 0) goto L47
            r0 = r10
            r2 = r11
            boolean r11 = r0.writeToQueue(r1, r2, r3, r5)
            return r11
        L47:
            long r6 = (long) r0
            r0 = r10
            r2 = r3
            r4 = r5
            r5 = r11
            r0.resize(r1, r2, r4, r5, r6)
            r11 = 1
            return r11
        L51:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "Null is not a valid element"
            r11.<init>(r0)
            throw r11
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T r9, T r10) {
            r8 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r8.producerBuffer
            long r1 = r8.lvProducerIndex()
            int r3 = r8.producerMask
            r4 = 2
            long r4 = r4 + r1
            int r6 = calcWrappedOffset(r4, r3)
            java.lang.Object r6 = lvElement(r0, r6)
            if (r6 != 0) goto L25
            int r1 = calcWrappedOffset(r1, r3)
            int r2 = r1 + 1
            soElement(r0, r2, r10)
            soElement(r0, r1, r9)
            r8.soProducerIndex(r4)
            goto L47
        L25:
            int r6 = r0.length()
            java.util.concurrent.atomic.AtomicReferenceArray r7 = new java.util.concurrent.atomic.AtomicReferenceArray
            r7.<init>(r6)
            r8.producerBuffer = r7
            int r1 = calcWrappedOffset(r1, r3)
            int r2 = r1 + 1
            soElement(r7, r2, r10)
            soElement(r7, r1, r9)
            r8.soNext(r0, r7)
            java.lang.Object r9 = io.reactivex.internal.queue.SpscLinkedArrayQueue.HAS_NEXT
            soElement(r0, r1, r9)
            r8.soProducerIndex(r4)
        L47:
            r9 = 1
            return r9
    }

    public T peek() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r6.consumerBuffer
            long r1 = r6.lpConsumerIndex()
            int r3 = r6.consumerMask
            int r4 = calcWrappedOffset(r1, r3)
            java.lang.Object r4 = lvElement(r0, r4)
            java.lang.Object r5 = io.reactivex.internal.queue.SpscLinkedArrayQueue.HAS_NEXT
            if (r4 != r5) goto L1f
            int r4 = r3 + 1
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.lvNextBufferAndUnlink(r0, r4)
            java.lang.Object r0 = r6.newBufferPeek(r0, r1, r3)
            return r0
        L1f:
            return r4
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    public T poll() {
            r8 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r8.consumerBuffer
            long r1 = r8.lpConsumerIndex()
            int r3 = r8.consumerMask
            int r4 = calcWrappedOffset(r1, r3)
            java.lang.Object r5 = lvElement(r0, r4)
            java.lang.Object r6 = io.reactivex.internal.queue.SpscLinkedArrayQueue.HAS_NEXT
            if (r5 != r6) goto L16
            r6 = 1
            goto L17
        L16:
            r6 = 0
        L17:
            r7 = 0
            if (r5 == 0) goto L26
            if (r6 != 0) goto L26
            soElement(r0, r4, r7)
            r3 = 1
            long r1 = r1 + r3
            r8.soConsumerIndex(r1)
            return r5
        L26:
            if (r6 == 0) goto L33
            int r4 = r3 + 1
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r8.lvNextBufferAndUnlink(r0, r4)
            java.lang.Object r0 = r8.newBufferPoll(r0, r1, r3)
            return r0
        L33:
            return r7
    }

    public int size() {
            r6 = this;
            long r0 = r6.lvConsumerIndex()
        L4:
            long r2 = r6.lvProducerIndex()
            long r4 = r6.lvConsumerIndex()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L13
            long r2 = r2 - r4
            int r0 = (int) r2
            return r0
        L13:
            r0 = r4
            goto L4
    }
}
