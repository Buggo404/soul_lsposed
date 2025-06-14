package io.reactivex.observers;

import io.reactivex.observers.BaseTestConsumer;

/* loaded from: classes.dex */
public abstract class BaseTestConsumer<T, U extends io.reactivex.observers.BaseTestConsumer<T, U>> implements io.reactivex.disposables.Disposable {
    protected boolean checkSubscriptionOnce;
    protected long completions;
    protected final java.util.concurrent.CountDownLatch done;
    protected final java.util.List<java.lang.Throwable> errors;
    protected int establishedFusionMode;
    protected int initialFusionMode;
    protected java.lang.Thread lastThread;
    protected java.lang.CharSequence tag;
    protected boolean timeout;
    protected final java.util.List<T> values;

    /* renamed from: io.reactivex.observers.BaseTestConsumer$1 */
    static /* synthetic */ class C09601 {
    }

    public enum TestWaitStrategy extends java.lang.Enum<io.reactivex.observers.BaseTestConsumer.TestWaitStrategy> implements java.lang.Runnable {
        private static final /* synthetic */ io.reactivex.observers.BaseTestConsumer.TestWaitStrategy[] $VALUES = null;
        public static final io.reactivex.observers.BaseTestConsumer.TestWaitStrategy SLEEP_1000MS = null;
        public static final io.reactivex.observers.BaseTestConsumer.TestWaitStrategy SLEEP_100MS = null;
        public static final io.reactivex.observers.BaseTestConsumer.TestWaitStrategy SLEEP_10MS = null;
        public static final io.reactivex.observers.BaseTestConsumer.TestWaitStrategy SLEEP_1MS = null;
        public static final io.reactivex.observers.BaseTestConsumer.TestWaitStrategy SPIN = null;
        public static final io.reactivex.observers.BaseTestConsumer.TestWaitStrategy YIELD = null;







        static {
                io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$1 r0 = new io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$1
                java.lang.String r1 = "SPIN"
                r2 = 0
                r0.<init>(r1, r2)
                io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.SPIN = r0
                io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$2 r1 = new io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$2
                java.lang.String r3 = "YIELD"
                r4 = 1
                r1.<init>(r3, r4)
                io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.YIELD = r1
                io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$3 r3 = new io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$3
                java.lang.String r5 = "SLEEP_1MS"
                r6 = 2
                r3.<init>(r5, r6)
                io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.SLEEP_1MS = r3
                io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$4 r5 = new io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$4
                java.lang.String r7 = "SLEEP_10MS"
                r8 = 3
                r5.<init>(r7, r8)
                io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.SLEEP_10MS = r5
                io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$5 r7 = new io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$5
                java.lang.String r9 = "SLEEP_100MS"
                r10 = 4
                r7.<init>(r9, r10)
                io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.SLEEP_100MS = r7
                io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$6 r9 = new io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$6
                java.lang.String r11 = "SLEEP_1000MS"
                r12 = 5
                r9.<init>(r11, r12)
                io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.SLEEP_1000MS = r9
                r11 = 6
                io.reactivex.observers.BaseTestConsumer$TestWaitStrategy[] r11 = new io.reactivex.observers.BaseTestConsumer.TestWaitStrategy[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.$VALUES = r11
                return
        }

        TestWaitStrategy(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ TestWaitStrategy(java.lang.String r1, int r2, io.reactivex.observers.BaseTestConsumer.C09601 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static void sleep(int r2) {
                long r0 = (long) r2
                java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L5
                return
            L5:
                r2 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r2)
                throw r0
        }

        public static io.reactivex.observers.BaseTestConsumer.TestWaitStrategy valueOf(java.lang.String r1) {
                java.lang.Class<io.reactivex.observers.BaseTestConsumer$TestWaitStrategy> r0 = io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.reactivex.observers.BaseTestConsumer$TestWaitStrategy r1 = (io.reactivex.observers.BaseTestConsumer.TestWaitStrategy) r1
                return r1
        }

        public static io.reactivex.observers.BaseTestConsumer.TestWaitStrategy[] values() {
                io.reactivex.observers.BaseTestConsumer$TestWaitStrategy[] r0 = io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.$VALUES
                java.lang.Object r0 = r0.clone()
                io.reactivex.observers.BaseTestConsumer$TestWaitStrategy[] r0 = (io.reactivex.observers.BaseTestConsumer.TestWaitStrategy[]) r0
                return r0
        }

        @Override // java.lang.Runnable
        public abstract void run();
    }

    public BaseTestConsumer() {
            r2 = this;
            r2.<init>()
            io.reactivex.internal.util.VolatileSizeArrayList r0 = new io.reactivex.internal.util.VolatileSizeArrayList
            r0.<init>()
            r2.values = r0
            io.reactivex.internal.util.VolatileSizeArrayList r0 = new io.reactivex.internal.util.VolatileSizeArrayList
            r0.<init>()
            r2.errors = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.done = r0
            return
    }

    public static java.lang.String valueAndClass(java.lang.Object r2) {
            if (r2 == 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = " (class: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = ")"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L28:
            java.lang.String r2 = "null"
            return r2
    }

    public final U assertComplete() {
            r4 = this;
            long r0 = r4.completions
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L23
            r2 = 1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto Lf
            return r4
        Lf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Multiple completions: "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.AssertionError r0 = r4.fail(r0)
            throw r0
        L23:
            java.lang.String r0 = "Not completed"
            java.lang.AssertionError r0 = r4.fail(r0)
            throw r0
    }

    public final U assertEmpty() {
            r1 = this;
            io.reactivex.observers.BaseTestConsumer r0 = r1.assertSubscribed()
            io.reactivex.observers.BaseTestConsumer r0 = r0.assertNoValues()
            io.reactivex.observers.BaseTestConsumer r0 = r0.assertNoErrors()
            io.reactivex.observers.BaseTestConsumer r0 = r0.assertNotComplete()
            return r0
    }

    public final U assertError(io.reactivex.functions.Predicate<java.lang.Throwable> r5) {
            r4 = this;
            java.util.List<java.lang.Throwable> r0 = r4.errors
            int r0 = r0.size()
            if (r0 == 0) goto L3d
            java.util.List<java.lang.Throwable> r1 = r4.errors
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            r3 = 1
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r2 = r5.test(r2)     // Catch: java.lang.Exception -> L23
            if (r2 == 0) goto Le
            r5 = r3
            goto L2a
        L23:
            r5 = move-exception
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r5)
            throw r5
        L29:
            r5 = 0
        L2a:
            if (r5 == 0) goto L36
            if (r0 != r3) goto L2f
            return r4
        L2f:
            java.lang.String r5 = "Error present but other errors as well"
            java.lang.AssertionError r5 = r4.fail(r5)
            throw r5
        L36:
            java.lang.String r5 = "Error not present"
            java.lang.AssertionError r5 = r4.fail(r5)
            throw r5
        L3d:
            java.lang.String r5 = "No errors"
            java.lang.AssertionError r5 = r4.fail(r5)
            throw r5
    }

    public final U assertError(java.lang.Class<? extends java.lang.Throwable> r1) {
            r0 = this;
            io.reactivex.functions.Predicate r1 = io.reactivex.internal.functions.Functions.isInstanceOf(r1)
            io.reactivex.observers.BaseTestConsumer r1 = r0.assertError(r1)
            return r1
    }

    public final U assertError(java.lang.Throwable r1) {
            r0 = this;
            io.reactivex.functions.Predicate r1 = io.reactivex.internal.functions.Functions.equalsWith(r1)
            io.reactivex.observers.BaseTestConsumer r1 = r0.assertError(r1)
            return r1
    }

    public final U assertErrorMessage(java.lang.String r4) {
            r3 = this;
            java.util.List<java.lang.Throwable> r0 = r3.errors
            int r0 = r0.size()
            if (r0 == 0) goto L44
            r1 = 1
            if (r0 != r1) goto L3d
            java.util.List<java.lang.Throwable> r0 = r3.errors
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r0 = r0.getMessage()
            boolean r1 = io.reactivex.internal.functions.ObjectHelper.equals(r4, r0)
            if (r1 == 0) goto L1f
            return r3
        L1f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error message differs; Expected: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ", Actual: "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.AssertionError r4 = r3.fail(r4)
            throw r4
        L3d:
            java.lang.String r4 = "Multiple errors"
            java.lang.AssertionError r4 = r3.fail(r4)
            throw r4
        L44:
            java.lang.String r4 = "No errors"
            java.lang.AssertionError r4 = r3.fail(r4)
            throw r4
    }

    public final U assertFailure(io.reactivex.functions.Predicate<java.lang.Throwable> r2, T... r3) {
            r1 = this;
            io.reactivex.observers.BaseTestConsumer r0 = r1.assertSubscribed()
            io.reactivex.observers.BaseTestConsumer r3 = r0.assertValues(r3)
            io.reactivex.observers.BaseTestConsumer r2 = r3.assertError(r2)
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertNotComplete()
            return r2
    }

    public final U assertFailure(java.lang.Class<? extends java.lang.Throwable> r2, T... r3) {
            r1 = this;
            io.reactivex.observers.BaseTestConsumer r0 = r1.assertSubscribed()
            io.reactivex.observers.BaseTestConsumer r3 = r0.assertValues(r3)
            io.reactivex.observers.BaseTestConsumer r2 = r3.assertError(r2)
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertNotComplete()
            return r2
    }

    public final U assertFailureAndMessage(java.lang.Class<? extends java.lang.Throwable> r2, java.lang.String r3, T... r4) {
            r1 = this;
            io.reactivex.observers.BaseTestConsumer r0 = r1.assertSubscribed()
            io.reactivex.observers.BaseTestConsumer r4 = r0.assertValues(r4)
            io.reactivex.observers.BaseTestConsumer r2 = r4.assertError(r2)
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertErrorMessage(r3)
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertNotComplete()
            return r2
    }

    public final U assertNever(io.reactivex.functions.Predicate<? super T> r4) {
            r3 = this;
            java.util.List<T> r0 = r3.values
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L4a
            java.util.List<T> r2 = r3.values
            java.lang.Object r2 = r2.get(r1)
            boolean r2 = r4.test(r2)     // Catch: java.lang.Exception -> L44
            if (r2 != 0) goto L18
            int r1 = r1 + 1
            goto L7
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L44
            r0.<init>()     // Catch: java.lang.Exception -> L44
            java.lang.String r2 = "Value at position "
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Exception -> L44
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = " matches predicate "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L44
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L44
            java.lang.StringBuilder r4 = r0.append(r4)     // Catch: java.lang.Exception -> L44
            java.lang.String r0 = ", which was not expected."
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.Exception -> L44
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L44
            java.lang.AssertionError r4 = r3.fail(r4)     // Catch: java.lang.Exception -> L44
            throw r4     // Catch: java.lang.Exception -> L44
        L44:
            r4 = move-exception
            java.lang.RuntimeException r4 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r4)
            throw r4
        L4a:
            return r3
    }

    public final U assertNever(T r4) {
            r3 = this;
            java.util.List<T> r0 = r3.values
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L40
            java.util.List<T> r2 = r3.values
            java.lang.Object r2 = r2.get(r1)
            boolean r2 = io.reactivex.internal.functions.ObjectHelper.equals(r2, r4)
            if (r2 != 0) goto L18
            int r1 = r1 + 1
            goto L7
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Value at position "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " is equal to "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r4 = valueAndClass(r4)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = "; Expected them to be different"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.AssertionError r4 = r3.fail(r4)
            throw r4
        L40:
            return r3
    }

    public final U assertNoErrors() {
            r2 = this;
            java.util.List<java.lang.Throwable> r0 = r2.errors
            int r0 = r0.size()
            if (r0 != 0) goto L9
            return r2
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error(s) present: "
            r0.<init>(r1)
            java.util.List<java.lang.Throwable> r1 = r2.errors
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.AssertionError r0 = r2.fail(r0)
            throw r0
    }

    public final U assertNoTimeout() {
            r1 = this;
            boolean r0 = r1.timeout
            if (r0 != 0) goto L5
            return r1
        L5:
            java.lang.String r0 = "Timeout?!"
            java.lang.AssertionError r0 = r1.fail(r0)
            throw r0
    }

    public final U assertNoValues() {
            r1 = this;
            r0 = 0
            io.reactivex.observers.BaseTestConsumer r0 = r1.assertValueCount(r0)
            return r0
    }

    public final U assertNotComplete() {
            r4 = this;
            long r0 = r4.completions
            r2 = 1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1f
            if (r2 > 0) goto Lb
            return r4
        Lb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Multiple completions: "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.AssertionError r0 = r4.fail(r0)
            throw r0
        L1f:
            java.lang.String r0 = "Completed!"
            java.lang.AssertionError r0 = r4.fail(r0)
            throw r0
    }

    public abstract U assertNotSubscribed();

    public final U assertNotTerminated() {
            r4 = this;
            java.util.concurrent.CountDownLatch r0 = r4.done
            long r0 = r0.getCount()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld
            return r4
        Ld:
            java.lang.String r0 = "Subscriber terminated!"
            java.lang.AssertionError r0 = r4.fail(r0)
            throw r0
    }

    public final U assertResult(T... r2) {
            r1 = this;
            io.reactivex.observers.BaseTestConsumer r0 = r1.assertSubscribed()
            io.reactivex.observers.BaseTestConsumer r2 = r0.assertValues(r2)
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertNoErrors()
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertComplete()
            return r2
    }

    public abstract U assertSubscribed();

    public final U assertTerminated() {
            r6 = this;
            java.util.concurrent.CountDownLatch r0 = r6.done
            long r0 = r0.getCount()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L61
            long r0 = r6.completions
            r4 = 1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 > 0) goto L4d
            java.util.List<java.lang.Throwable> r4 = r6.errors
            int r4 = r4.size()
            r5 = 1
            if (r4 > r5) goto L39
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L38
            if (r4 != 0) goto L24
            goto L38
        L24:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Terminated with multiple completions and errors: "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.AssertionError r0 = r6.fail(r0)
            throw r0
        L38:
            return r6
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Terminated with multiple errors: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.AssertionError r0 = r6.fail(r0)
            throw r0
        L4d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Terminated with multiple completions: "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.AssertionError r0 = r6.fail(r0)
            throw r0
        L61:
            java.lang.String r0 = "Subscriber still running!"
            java.lang.AssertionError r0 = r6.fail(r0)
            throw r0
    }

    public final U assertTimeout() {
            r1 = this;
            boolean r0 = r1.timeout
            if (r0 == 0) goto L5
            return r1
        L5:
            java.lang.String r0 = "No timeout?!"
            java.lang.AssertionError r0 = r1.fail(r0)
            throw r0
    }

    public final U assertValue(io.reactivex.functions.Predicate<T> r2) {
            r1 = this;
            r0 = 0
            r1.assertValueAt(r0, r2)
            java.util.List<T> r2 = r1.values
            int r2 = r2.size()
            r0 = 1
            if (r2 > r0) goto Le
            return r1
        Le:
            java.lang.String r2 = "Value present but other values as well"
            java.lang.AssertionError r2 = r1.fail(r2)
            throw r2
    }

    public final U assertValue(T r5) {
            r4 = this;
            java.util.List<T> r0 = r4.values
            int r0 = r0.size()
            r1 = 1
            java.lang.String r2 = ", Actual: "
            java.lang.String r3 = "Expected: "
            if (r0 != r1) goto L3d
            java.util.List<T> r0 = r4.values
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = io.reactivex.internal.functions.ObjectHelper.equals(r5, r0)
            if (r1 == 0) goto L1b
            return r4
        L1b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r5 = valueAndClass(r5)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r0 = valueAndClass(r0)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.AssertionError r5 = r4.fail(r5)
            throw r5
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r5 = valueAndClass(r5)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.util.List<T> r0 = r4.values
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.AssertionError r5 = r4.fail(r5)
            throw r5
    }

    public final U assertValueAt(int r2, io.reactivex.functions.Predicate<T> r3) {
            r1 = this;
            java.util.List<T> r0 = r1.values
            int r0 = r0.size()
            if (r0 == 0) goto L3e
            java.util.List<T> r0 = r1.values
            int r0 = r0.size()
            if (r2 >= r0) goto L2a
            java.util.List<T> r0 = r1.values     // Catch: java.lang.Exception -> L24
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Exception -> L24
            boolean r2 = r3.test(r2)     // Catch: java.lang.Exception -> L24
            if (r2 == 0) goto L1d
            return r1
        L1d:
            java.lang.String r2 = "Value not present"
            java.lang.AssertionError r2 = r1.fail(r2)
            throw r2
        L24:
            r2 = move-exception
            java.lang.RuntimeException r2 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r2)
            throw r2
        L2a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid index: "
            r3.<init>(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.AssertionError r2 = r1.fail(r2)
            throw r2
        L3e:
            java.lang.String r2 = "No values"
            java.lang.AssertionError r2 = r1.fail(r2)
            throw r2
    }

    public final U assertValueAt(int r3, T r4) {
            r2 = this;
            java.util.List<T> r0 = r2.values
            int r0 = r0.size()
            if (r0 == 0) goto L51
            if (r3 >= r0) goto L3d
            java.util.List<T> r0 = r2.values
            java.lang.Object r3 = r0.get(r3)
            boolean r0 = io.reactivex.internal.functions.ObjectHelper.equals(r4, r3)
            if (r0 == 0) goto L17
            return r2
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected: "
            r0.<init>(r1)
            java.lang.String r4 = valueAndClass(r4)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = ", Actual: "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r3 = valueAndClass(r3)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.AssertionError r3 = r2.fail(r3)
            throw r3
        L3d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid index: "
            r4.<init>(r0)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.AssertionError r3 = r2.fail(r3)
            throw r3
        L51:
            java.lang.String r3 = "No values"
            java.lang.AssertionError r3 = r2.fail(r3)
            throw r3
    }

    public final U assertValueCount(int r4) {
            r3 = this;
            java.util.List<T> r0 = r3.values
            int r0 = r0.size()
            if (r0 != r4) goto L9
            return r3
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Value counts differ; Expected: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ", Actual: "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.AssertionError r4 = r3.fail(r4)
            throw r4
    }

    public final U assertValueSequence(java.lang.Iterable<? extends T> r6) {
            r5 = this;
            java.util.List<T> r0 = r5.values
            java.util.Iterator r0 = r0.iterator()
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
        Lb:
            boolean r2 = r6.hasNext()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L59
            if (r2 != 0) goto L18
            goto L59
        L18:
            java.lang.Object r2 = r6.next()
            java.lang.Object r3 = r0.next()
            boolean r4 = io.reactivex.internal.functions.ObjectHelper.equals(r2, r3)
            if (r4 == 0) goto L29
            int r1 = r1 + 1
            goto Lb
        L29:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Values at position "
            r6.<init>(r0)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r0 = " differ; Expected: "
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = valueAndClass(r2)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = ", Actual: "
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = valueAndClass(r3)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.AssertionError r6 = r5.fail(r6)
            throw r6
        L59:
            java.lang.String r6 = ")"
            if (r3 != 0) goto L78
            if (r2 != 0) goto L60
            return r5
        L60:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Fewer values received than expected ("
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.AssertionError r6 = r5.fail(r6)
            throw r6
        L78:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "More values received than expected ("
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.AssertionError r6 = r5.fail(r6)
            throw r6
    }

    public final U assertValueSequenceOnly(java.lang.Iterable<? extends T> r2) {
            r1 = this;
            io.reactivex.observers.BaseTestConsumer r0 = r1.assertSubscribed()
            io.reactivex.observers.BaseTestConsumer r2 = r0.assertValueSequence(r2)
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertNoErrors()
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertNotComplete()
            return r2
    }

    public final U assertValueSet(java.util.Collection<? extends T> r4) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto La
            r3.assertNoValues()
            return r3
        La:
            java.util.List<T> r0 = r3.values
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            boolean r2 = r4.contains(r1)
            if (r2 == 0) goto L21
            goto L10
        L21:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Value not in the expected collection: "
            r4.<init>(r0)
            java.lang.String r0 = valueAndClass(r1)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.AssertionError r4 = r3.fail(r4)
            throw r4
        L39:
            return r3
    }

    public final U assertValueSetOnly(java.util.Collection<? extends T> r2) {
            r1 = this;
            io.reactivex.observers.BaseTestConsumer r0 = r1.assertSubscribed()
            io.reactivex.observers.BaseTestConsumer r2 = r0.assertValueSet(r2)
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertNoErrors()
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertNotComplete()
            return r2
    }

    public final U assertValues(T... r7) {
            r6 = this;
            java.util.List<T> r0 = r6.values
            int r0 = r0.size()
            int r1 = r7.length
            java.lang.String r2 = ", Actual: "
            if (r0 != r1) goto L4e
            r1 = 0
        Lc:
            if (r1 >= r0) goto L4d
            java.util.List<T> r3 = r6.values
            java.lang.Object r3 = r3.get(r1)
            r4 = r7[r1]
            boolean r5 = io.reactivex.internal.functions.ObjectHelper.equals(r4, r3)
            if (r5 == 0) goto L1f
            int r1 = r1 + 1
            goto Lc
        L1f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Values at position "
            r7.<init>(r0)
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r0 = " differ; Expected: "
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = valueAndClass(r4)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.String r0 = valueAndClass(r3)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.AssertionError r7 = r6.fail(r7)
            throw r7
        L4d:
            return r6
        L4e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Value count differs; Expected: "
            r1.<init>(r3)
            int r3 = r7.length
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.StringBuilder r7 = r7.append(r3)
            java.util.List<T> r0 = r6.values
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.AssertionError r7 = r6.fail(r7)
            throw r7
    }

    public final U assertValuesOnly(T... r2) {
            r1 = this;
            io.reactivex.observers.BaseTestConsumer r0 = r1.assertSubscribed()
            io.reactivex.observers.BaseTestConsumer r2 = r0.assertValues(r2)
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertNoErrors()
            io.reactivex.observers.BaseTestConsumer r2 = r2.assertNotComplete()
            return r2
    }

    public final U await() throws java.lang.InterruptedException {
            r4 = this;
            java.util.concurrent.CountDownLatch r0 = r4.done
            long r0 = r0.getCount()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Ld
            return r4
        Ld:
            java.util.concurrent.CountDownLatch r0 = r4.done
            r0.await()
            return r4
    }

    public final boolean await(long r5, java.util.concurrent.TimeUnit r7) throws java.lang.InterruptedException {
            r4 = this;
            java.util.concurrent.CountDownLatch r0 = r4.done
            long r0 = r0.getCount()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L17
            java.util.concurrent.CountDownLatch r0 = r4.done
            boolean r5 = r0.await(r5, r7)
            if (r5 == 0) goto L15
            goto L17
        L15:
            r5 = 0
            goto L18
        L17:
            r5 = 1
        L18:
            r6 = r5 ^ 1
            r4.timeout = r6
            return r5
    }

    public final U awaitCount(int r4) {
            r3 = this;
            io.reactivex.observers.BaseTestConsumer$TestWaitStrategy r0 = io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.SLEEP_10MS
            r1 = 5000(0x1388, double:2.4703E-320)
            io.reactivex.observers.BaseTestConsumer r4 = r3.awaitCount(r4, r0, r1)
            return r4
    }

    public final U awaitCount(int r3, java.lang.Runnable r4) {
            r2 = this;
            r0 = 5000(0x1388, double:2.4703E-320)
            io.reactivex.observers.BaseTestConsumer r3 = r2.awaitCount(r3, r4, r0)
            return r3
    }

    public final U awaitCount(int r7, java.lang.Runnable r8, long r9) {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
        L4:
            r2 = 0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 <= 0) goto L17
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r0
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 < 0) goto L17
            r7 = 1
            r6.timeout = r7
            goto L2a
        L17:
            java.util.concurrent.CountDownLatch r4 = r6.done
            long r4 = r4.getCount()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L22
            goto L2a
        L22:
            java.util.List<T> r2 = r6.values
            int r2 = r2.size()
            if (r2 < r7) goto L2b
        L2a:
            return r6
        L2b:
            r8.run()
            goto L4
    }

    public final U awaitDone(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            java.util.concurrent.CountDownLatch r0 = r1.done     // Catch: java.lang.InterruptedException -> Lf
            boolean r2 = r0.await(r2, r4)     // Catch: java.lang.InterruptedException -> Lf
            if (r2 != 0) goto Le
            r2 = 1
            r1.timeout = r2     // Catch: java.lang.InterruptedException -> Lf
            r1.dispose()     // Catch: java.lang.InterruptedException -> Lf
        Le:
            return r1
        Lf:
            r2 = move-exception
            r1.dispose()
            java.lang.RuntimeException r2 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r2)
            throw r2
    }

    public final boolean awaitTerminalEvent() {
            r1 = this;
            r1.await()     // Catch: java.lang.InterruptedException -> L5
            r0 = 1
            return r0
        L5:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            r0 = 0
            return r0
    }

    public final boolean awaitTerminalEvent(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            boolean r1 = r0.await(r1, r3)     // Catch: java.lang.InterruptedException -> L5
            return r1
        L5:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            r1 = 0
            return r1
    }

    public final U clearTimeout() {
            r1 = this;
            r0 = 0
            r1.timeout = r0
            return r1
    }

    public final long completions() {
            r2 = this;
            long r0 = r2.completions
            return r0
    }

    public final int errorCount() {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.errors
            int r0 = r0.size()
            return r0
    }

    public final java.util.List<java.lang.Throwable> errors() {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.errors
            return r0
    }

    protected final java.lang.AssertionError fail(java.lang.String r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length()
            int r1 = r1 + 64
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " (latch = "
            java.lang.StringBuilder r4 = r0.append(r4)
            java.util.concurrent.CountDownLatch r1 = r3.done
            long r1 = r1.getCount()
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r1 = ", values = "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.util.List<T> r1 = r3.values
            int r1 = r1.size()
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r1 = ", errors = "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.util.List<java.lang.Throwable> r1 = r3.errors
            int r1 = r1.size()
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r1 = ", completions = "
            java.lang.StringBuilder r4 = r4.append(r1)
            long r1 = r3.completions
            r4.append(r1)
            boolean r4 = r3.timeout
            if (r4 == 0) goto L52
            java.lang.String r4 = ", timeout!"
            r0.append(r4)
        L52:
            boolean r4 = r3.isDisposed()
            if (r4 == 0) goto L5d
            java.lang.String r4 = ", disposed!"
            r0.append(r4)
        L5d:
            java.lang.CharSequence r4 = r3.tag
            if (r4 == 0) goto L6a
            java.lang.String r1 = ", tag = "
            java.lang.StringBuilder r1 = r0.append(r1)
            r1.append(r4)
        L6a:
            r4 = 41
            r0.append(r4)
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            java.util.List<java.lang.Throwable> r0 = r3.errors
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La0
            java.util.List<java.lang.Throwable> r0 = r3.errors
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L96
            java.util.List<java.lang.Throwable> r0 = r3.errors
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r4.initCause(r0)
            goto La0
        L96:
            io.reactivex.exceptions.CompositeException r0 = new io.reactivex.exceptions.CompositeException
            java.util.List<java.lang.Throwable> r1 = r3.errors
            r0.<init>(r1)
            r4.initCause(r0)
        La0:
            return r4
    }

    public final java.util.List<java.util.List<java.lang.Object>> getEvents() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r6.values()
            r0.add(r1)
            java.util.List r1 = r6.errors()
            r0.add(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L1a:
            long r4 = r6.completions
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto L2b
            io.reactivex.Notification r4 = io.reactivex.Notification.createOnComplete()
            r1.add(r4)
            r4 = 1
            long r2 = r2 + r4
            goto L1a
        L2b:
            r0.add(r1)
            return r0
    }

    public final boolean isTerminated() {
            r4 = this;
            java.util.concurrent.CountDownLatch r0 = r4.done
            long r0 = r0.getCount()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public final boolean isTimeout() {
            r1 = this;
            boolean r0 = r1.timeout
            return r0
    }

    public final java.lang.Thread lastThread() {
            r1 = this;
            java.lang.Thread r0 = r1.lastThread
            return r0
    }

    public final int valueCount() {
            r1 = this;
            java.util.List<T> r0 = r1.values
            int r0 = r0.size()
            return r0
    }

    public final java.util.List<T> values() {
            r1 = this;
            java.util.List<T> r0 = r1.values
            return r0
    }

    public final U withTag(java.lang.CharSequence r1) {
            r0 = this;
            r0.tag = r1
            return r0
    }
}
