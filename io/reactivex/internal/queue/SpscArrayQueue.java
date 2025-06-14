package io.reactivex.internal.queue;

/* loaded from: classes.dex */
public final class SpscArrayQueue<E> extends java.util.concurrent.atomic.AtomicReferenceArray<E> implements io.reactivex.internal.fuseable.SimplePlainQueue<E> {
    private static final java.lang.Integer MAX_LOOK_AHEAD_STEP = null;
    private static final long serialVersionUID = -1296597691183856449L;
    final java.util.concurrent.atomic.AtomicLong consumerIndex;
    final int lookAheadStep;
    final int mask;
    final java.util.concurrent.atomic.AtomicLong producerIndex;
    long producerLookAhead;

    static {
            java.lang.String r0 = "jctools.spsc.max.lookahead.step"
            r1 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            io.reactivex.internal.queue.SpscArrayQueue.MAX_LOOK_AHEAD_STEP = r0
            return
    }

    public SpscArrayQueue(int r2) {
            r1 = this;
            int r0 = io.reactivex.internal.util.Pow2.roundToPowerOfTwo(r2)
            r1.<init>(r0)
            int r0 = r1.length()
            int r0 = r0 + (-1)
            r1.mask = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.producerIndex = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.consumerIndex = r0
            int r2 = r2 / 4
            java.lang.Integer r0 = io.reactivex.internal.queue.SpscArrayQueue.MAX_LOOK_AHEAD_STEP
            int r0 = r0.intValue()
            int r2 = java.lang.Math.min(r2, r0)
            r1.lookAheadStep = r2
            return
    }

    int calcElementOffset(long r1) {
            r0 = this;
            int r1 = (int) r1
            int r2 = r0.mask
            r1 = r1 & r2
            return r1
    }

    int calcElementOffset(long r1, int r3) {
            r0 = this;
            int r1 = (int) r1
            r1 = r1 & r3
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
            java.util.concurrent.atomic.AtomicLong r0 = r4.producerIndex
            long r0 = r0.get()
            java.util.concurrent.atomic.AtomicLong r2 = r4.consumerIndex
            long r2 = r2.get()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    E lvElement(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            return r1
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(E r7) {
            r6 = this;
            if (r7 == 0) goto L38
            int r0 = r6.mask
            java.util.concurrent.atomic.AtomicLong r1 = r6.producerIndex
            long r1 = r1.get()
            int r3 = r6.calcElementOffset(r1, r0)
            long r4 = r6.producerLookAhead
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 < 0) goto L2d
            int r4 = r6.lookAheadStep
            long r4 = (long) r4
            long r4 = r4 + r1
            int r0 = r6.calcElementOffset(r4, r0)
            java.lang.Object r0 = r6.lvElement(r0)
            if (r0 != 0) goto L25
            r6.producerLookAhead = r4
            goto L2d
        L25:
            java.lang.Object r0 = r6.lvElement(r3)
            if (r0 == 0) goto L2d
            r7 = 0
            return r7
        L2d:
            r6.soElement(r3, r7)
            r3 = 1
            long r1 = r1 + r3
            r6.soProducerIndex(r1)
            r7 = 1
            return r7
        L38:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "Null is not a valid element"
            r7.<init>(r0)
            throw r7
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(E r1, E r2) {
            r0 = this;
            boolean r1 = r0.offer(r1)
            if (r1 == 0) goto Le
            boolean r1 = r0.offer(r2)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    public E poll() {
            r7 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r7.consumerIndex
            long r0 = r0.get()
            int r2 = r7.calcElementOffset(r0)
            java.lang.Object r3 = r7.lvElement(r2)
            r4 = 0
            if (r3 != 0) goto L12
            return r4
        L12:
            r5 = 1
            long r0 = r0 + r5
            r7.soConsumerIndex(r0)
            r7.soElement(r2, r4)
            return r3
    }

    void soConsumerIndex(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.consumerIndex
            r0.lazySet(r2)
            return
    }

    void soElement(int r1, E r2) {
            r0 = this;
            r0.lazySet(r1, r2)
            return
    }

    void soProducerIndex(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.producerIndex
            r0.lazySet(r2)
            return
    }
}
