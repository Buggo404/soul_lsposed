package io.reactivex.internal.util;

/* loaded from: classes.dex */
public final class QueueDrainHelper {
    static final long COMPLETED_MASK = Long.MIN_VALUE;
    static final long REQUESTED_MASK = Long.MAX_VALUE;

    private QueueDrainHelper() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T, U> boolean checkTerminated(boolean r2, boolean r3, io.reactivex.Observer<?> r4, boolean r5, io.reactivex.internal.fuseable.SimpleQueue<?> r6, io.reactivex.disposables.Disposable r7, io.reactivex.internal.util.ObservableQueueDrain<T, U> r8) {
            boolean r0 = r8.cancelled()
            r1 = 1
            if (r0 == 0) goto Le
            r6.clear()
            r7.dispose()
            return r1
        Le:
            if (r2 == 0) goto L44
            if (r5 == 0) goto L27
            if (r3 == 0) goto L44
            if (r7 == 0) goto L19
            r7.dispose()
        L19:
            java.lang.Throwable r2 = r8.error()
            if (r2 == 0) goto L23
            r4.onError(r2)
            goto L26
        L23:
            r4.onComplete()
        L26:
            return r1
        L27:
            java.lang.Throwable r2 = r8.error()
            if (r2 == 0) goto L39
            r6.clear()
            if (r7 == 0) goto L35
            r7.dispose()
        L35:
            r4.onError(r2)
            return r1
        L39:
            if (r3 == 0) goto L44
            if (r7 == 0) goto L40
            r7.dispose()
        L40:
            r4.onComplete()
            return r1
        L44:
            r2 = 0
            return r2
    }

    public static <T, U> boolean checkTerminated(boolean r2, boolean r3, org.reactivestreams.Subscriber<?> r4, boolean r5, io.reactivex.internal.fuseable.SimpleQueue<?> r6, io.reactivex.internal.util.QueueDrain<T, U> r7) {
            boolean r0 = r7.cancelled()
            r1 = 1
            if (r0 == 0) goto Lb
            r6.clear()
            return r1
        Lb:
            if (r2 == 0) goto L32
            if (r5 == 0) goto L1f
            if (r3 == 0) goto L32
            java.lang.Throwable r2 = r7.error()
            if (r2 == 0) goto L1b
            r4.onError(r2)
            goto L1e
        L1b:
            r4.onComplete()
        L1e:
            return r1
        L1f:
            java.lang.Throwable r2 = r7.error()
            if (r2 == 0) goto L2c
            r6.clear()
            r4.onError(r2)
            return r1
        L2c:
            if (r3 == 0) goto L32
            r4.onComplete()
            return r1
        L32:
            r2 = 0
            return r2
    }

    public static <T> io.reactivex.internal.fuseable.SimpleQueue<T> createQueue(int r1) {
            if (r1 >= 0) goto L9
            io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
            int r1 = -r1
            r0.<init>(r1)
            return r0
        L9:
            io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
            r0.<init>(r1)
            return r0
    }

    public static <T, U> void drainLoop(io.reactivex.internal.fuseable.SimplePlainQueue<T> r11, io.reactivex.Observer<? super U> r12, boolean r13, io.reactivex.disposables.Disposable r14, io.reactivex.internal.util.ObservableQueueDrain<T, U> r15) {
            r0 = 1
            r1 = r0
        L2:
            boolean r2 = r15.done()
            boolean r3 = r11.isEmpty()
            r4 = r12
            r5 = r13
            r6 = r11
            r7 = r14
            r8 = r15
            boolean r2 = checkTerminated(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L16
            return
        L16:
            boolean r3 = r15.done()
            java.lang.Object r2 = r11.poll()
            if (r2 != 0) goto L22
            r10 = r0
            goto L24
        L22:
            r4 = 0
            r10 = r4
        L24:
            r4 = r10
            r5 = r12
            r6 = r13
            r7 = r11
            r8 = r14
            r9 = r15
            boolean r3 = checkTerminated(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L31
            return
        L31:
            if (r10 == 0) goto L3b
            int r1 = -r1
            int r1 = r15.leave(r1)
            if (r1 != 0) goto L2
            return
        L3b:
            r15.accept(r12, r2)
            goto L16
    }

    public static <T, U> void drainMaxLoop(io.reactivex.internal.fuseable.SimplePlainQueue<T> r10, org.reactivestreams.Subscriber<? super U> r11, boolean r12, io.reactivex.disposables.Disposable r13, io.reactivex.internal.util.QueueDrain<T, U> r14) {
            r0 = 1
            r1 = r0
        L2:
            boolean r2 = r14.done()
            java.lang.Object r8 = r10.poll()
            if (r8 != 0) goto Le
            r9 = r0
            goto L10
        Le:
            r3 = 0
            r9 = r3
        L10:
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r10
            r7 = r14
            boolean r2 = checkTerminated(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L21
            if (r13 == 0) goto L20
            r13.dispose()
        L20:
            return
        L21:
            if (r9 == 0) goto L2b
            int r1 = -r1
            int r1 = r14.leave(r1)
            if (r1 != 0) goto L2
            return
        L2b:
            long r2 = r14.requested()
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L4a
            boolean r4 = r14.accept(r11, r8)
            if (r4 == 0) goto L2
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L2
            r2 = 1
            r14.produced(r2)
            goto L2
        L4a:
            r10.clear()
            if (r13 == 0) goto L52
            r13.dispose()
        L52:
            io.reactivex.exceptions.MissingBackpressureException r10 = new io.reactivex.exceptions.MissingBackpressureException
            java.lang.String r12 = "Could not emit value due to lack of requests."
            r10.<init>(r12)
            r11.onError(r10)
            return
    }

    static boolean isCancelled(io.reactivex.functions.BooleanSupplier r0) {
            boolean r0 = r0.getAsBoolean()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            r0 = 1
            return r0
    }

    public static <T> void postComplete(org.reactivestreams.Subscriber<? super T> r14, java.util.Queue<T> r15, java.util.concurrent.atomic.AtomicLong r16, io.reactivex.functions.BooleanSupplier r17) {
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto La
            r14.onComplete()
            return
        La:
            long r1 = r16.get()
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            boolean r0 = postCompleteDrain(r1, r3, r4, r5, r6)
            if (r0 == 0) goto L1b
            return
        L1b:
            long r0 = r16.get()
            r2 = -9223372036854775808
            long r4 = r0 & r2
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L2a
            return
        L2a:
            long r8 = r0 | r2
            r2 = r16
            boolean r3 = r2.compareAndSet(r0, r8)
            if (r3 == 0) goto L1b
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L41
            r10 = r14
            r11 = r15
            r12 = r16
            r13 = r17
            postCompleteDrain(r8, r10, r11, r12, r13)
        L41:
            return
    }

    static <T> boolean postCompleteDrain(long r8, org.reactivestreams.Subscriber<? super T> r10, java.util.Queue<T> r11, java.util.concurrent.atomic.AtomicLong r12, io.reactivex.functions.BooleanSupplier r13) {
            r0 = -9223372036854775808
            long r2 = r8 & r0
        L4:
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r5 = 1
            if (r4 == 0) goto L21
            boolean r4 = isCancelled(r13)
            if (r4 == 0) goto L10
            return r5
        L10:
            java.lang.Object r4 = r11.poll()
            if (r4 != 0) goto L1a
            r10.onComplete()
            return r5
        L1a:
            r10.onNext(r4)
            r4 = 1
            long r2 = r2 + r4
            goto L4
        L21:
            boolean r8 = isCancelled(r13)
            if (r8 == 0) goto L28
            return r5
        L28:
            boolean r8 = r11.isEmpty()
            if (r8 == 0) goto L32
            r10.onComplete()
            return r5
        L32:
            long r8 = r12.get()
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 != 0) goto L4
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = r2 & r8
            long r2 = -r2
            long r2 = r12.addAndGet(r2)
            long r8 = r8 & r2
            r4 = 0
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L4e
            r8 = 0
            return r8
        L4e:
            long r8 = r2 & r0
            r6 = r8
            r8 = r2
            r2 = r6
            goto L4
    }

    public static <T> boolean postCompleteRequest(long r14, org.reactivestreams.Subscriber<? super T> r16, java.util.Queue<T> r17, java.util.concurrent.atomic.AtomicLong r18, io.reactivex.functions.BooleanSupplier r19) {
            r0 = r14
        L1:
            long r2 = r18.get()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r4 = r4 & r2
            r6 = -9223372036854775808
            long r8 = r2 & r6
            long r4 = io.reactivex.internal.util.BackpressureHelper.addCap(r4, r14)
            long r4 = r4 | r8
            r12 = r18
            boolean r4 = r12.compareAndSet(r2, r4)
            if (r4 == 0) goto L1
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L2f
            long r8 = r0 | r6
            r10 = r16
            r11 = r17
            r12 = r18
            r13 = r19
            postCompleteDrain(r8, r10, r11, r12, r13)
            r0 = 1
            return r0
        L2f:
            r0 = 0
            return r0
    }

    public static void request(org.reactivestreams.Subscription r2, int r3) {
            if (r3 >= 0) goto L8
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L9
        L8:
            long r0 = (long) r3
        L9:
            r2.request(r0)
            return
    }
}
