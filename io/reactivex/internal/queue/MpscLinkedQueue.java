package io.reactivex.internal.queue;

/* loaded from: classes.dex */
public final class MpscLinkedQueue<T> implements io.reactivex.internal.fuseable.SimplePlainQueue<T> {
    private final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T>> consumerNode;
    private final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T>> producerNode;

    static final class LinkedQueueNode<E> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        LinkedQueueNode() {
                r0 = this;
                r0.<init>()
                return
        }

        LinkedQueueNode(E r1) {
                r0 = this;
                r0.<init>()
                r0.spValue(r1)
                return
        }

        public E getAndNullValue() {
                r2 = this;
                java.lang.Object r0 = r2.lpValue()
                r1 = 0
                r2.spValue(r1)
                return r0
        }

        public E lpValue() {
                r1 = this;
                E r0 = r1.value
                return r0
        }

        public io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<E> lvNext() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode r0 = (io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode) r0
                return r0
        }

        public void soNext(io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<E> r1) {
                r0 = this;
                r0.lazySet(r1)
                return
        }

        public void spValue(E r1) {
                r0 = this;
                r0.value = r1
                return
        }
    }

    public MpscLinkedQueue() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.producerNode = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.consumerNode = r0
            io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode r0 = new io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode
            r0.<init>()
            r1.spConsumerNode(r0)
            r1.xchgProducerNode(r0)
            return
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
            r1 = this;
        L0:
            java.lang.Object r0 = r1.poll()
            if (r0 == 0) goto Ld
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Ld
            goto L0
        Ld:
            return
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
            r2 = this;
            io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode r0 = r2.lvConsumerNode()
            io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode r1 = r2.lvProducerNode()
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> lpConsumerNode() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode<T>> r0 = r1.consumerNode
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode r0 = (io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode) r0
            return r0
    }

    io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> lvConsumerNode() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode<T>> r0 = r1.consumerNode
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode r0 = (io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode) r0
            return r0
    }

    io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> lvProducerNode() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode<T>> r0 = r1.producerNode
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode r0 = (io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode) r0
            return r0
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T r2) {
            r1 = this;
            if (r2 == 0) goto L10
            io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode r0 = new io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode
            r0.<init>(r2)
            io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode r2 = r1.xchgProducerNode(r0)
            r2.soNext(r0)
            r2 = 1
            return r2
        L10:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Null is not a valid element"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T r1, T r2) {
            r0 = this;
            r0.offer(r1)
            r0.offer(r2)
            r1 = 1
            return r1
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    public T poll() {
            r2 = this;
            io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode r0 = r2.lpConsumerNode()
            io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode r1 = r0.lvNext()
            if (r1 == 0) goto L12
            java.lang.Object r0 = r1.getAndNullValue()
            r2.spConsumerNode(r1)
            return r0
        L12:
            io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode r1 = r2.lvProducerNode()
            if (r0 == r1) goto L27
        L18:
            io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode r1 = r0.lvNext()
            if (r1 != 0) goto L1f
            goto L18
        L1f:
            java.lang.Object r0 = r1.getAndNullValue()
            r2.spConsumerNode(r1)
            return r0
        L27:
            r0 = 0
            return r0
    }

    void spConsumerNode(io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode<T>> r0 = r1.consumerNode
            r0.lazySet(r2)
            return
    }

    io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> xchgProducerNode(io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode<T>> r0 = r1.producerNode
            java.lang.Object r2 = r0.getAndSet(r2)
            io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode r2 = (io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode) r2
            return r2
    }
}
