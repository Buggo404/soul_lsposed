package io.reactivex.internal.functions;

/* loaded from: classes.dex */
public final class Functions {
    static final io.reactivex.functions.Predicate<java.lang.Object> ALWAYS_FALSE = null;
    static final io.reactivex.functions.Predicate<java.lang.Object> ALWAYS_TRUE = null;
    public static final io.reactivex.functions.Action EMPTY_ACTION = null;
    static final io.reactivex.functions.Consumer<java.lang.Object> EMPTY_CONSUMER = null;
    public static final io.reactivex.functions.LongConsumer EMPTY_LONG_CONSUMER = null;
    public static final java.lang.Runnable EMPTY_RUNNABLE = null;
    public static final io.reactivex.functions.Consumer<java.lang.Throwable> ERROR_CONSUMER = null;
    static final io.reactivex.functions.Function<java.lang.Object, java.lang.Object> IDENTITY = null;
    static final java.util.Comparator<java.lang.Object> NATURAL_COMPARATOR = null;
    static final java.util.concurrent.Callable<java.lang.Object> NULL_SUPPLIER = null;
    public static final io.reactivex.functions.Consumer<java.lang.Throwable> ON_ERROR_MISSING = null;
    public static final io.reactivex.functions.Consumer<org.reactivestreams.Subscription> REQUEST_MAX = null;

    static final class ActionConsumer<T> implements io.reactivex.functions.Consumer<T> {
        final io.reactivex.functions.Action action;

        ActionConsumer(io.reactivex.functions.Action r1) {
                r0 = this;
                r0.<init>()
                r0.action = r1
                return
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.functions.Action r1 = r0.action
                r1.run()
                return
        }
    }

    static final class Array2Func<T1, T2, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {

        /* renamed from: f */
        final io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> f167f;

        Array2Func(io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> r1) {
                r0 = this;
                r0.<init>()
                r0.f167f = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object[] r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                java.lang.Object r1 = r0.apply2(r1)
                return r1
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public R apply2(java.lang.Object[] r4) throws java.lang.Exception {
                r3 = this;
                int r0 = r4.length
                r1 = 2
                if (r0 != r1) goto L11
                io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> r0 = r3.f167f
                r1 = 0
                r1 = r4[r1]
                r2 = 1
                r4 = r4[r2]
                java.lang.Object r4 = r0.apply(r1, r4)
                return r4
            L11:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Array of size 2 expected but got "
                r1.<init>(r2)
                int r4 = r4.length
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    static final class Array3Func<T1, T2, T3, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {

        /* renamed from: f */
        final io.reactivex.functions.Function3<T1, T2, T3, R> f168f;

        Array3Func(io.reactivex.functions.Function3<T1, T2, T3, R> r1) {
                r0 = this;
                r0.<init>()
                r0.f168f = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object[] r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                java.lang.Object r1 = r0.apply2(r1)
                return r1
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public R apply2(java.lang.Object[] r5) throws java.lang.Exception {
                r4 = this;
                int r0 = r5.length
                r1 = 3
                if (r0 != r1) goto L14
                io.reactivex.functions.Function3<T1, T2, T3, R> r0 = r4.f168f
                r1 = 0
                r1 = r5[r1]
                r2 = 1
                r2 = r5[r2]
                r3 = 2
                r5 = r5[r3]
                java.lang.Object r5 = r0.apply(r1, r2, r5)
                return r5
            L14:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Array of size 3 expected but got "
                r1.<init>(r2)
                int r5 = r5.length
                java.lang.StringBuilder r5 = r1.append(r5)
                java.lang.String r5 = r5.toString()
                r0.<init>(r5)
                throw r0
        }
    }

    static final class Array4Func<T1, T2, T3, T4, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {

        /* renamed from: f */
        final io.reactivex.functions.Function4<T1, T2, T3, T4, R> f169f;

        Array4Func(io.reactivex.functions.Function4<T1, T2, T3, T4, R> r1) {
                r0 = this;
                r0.<init>()
                r0.f169f = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object[] r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                java.lang.Object r1 = r0.apply2(r1)
                return r1
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public R apply2(java.lang.Object[] r6) throws java.lang.Exception {
                r5 = this;
                int r0 = r6.length
                r1 = 4
                if (r0 != r1) goto L17
                io.reactivex.functions.Function4<T1, T2, T3, T4, R> r0 = r5.f169f
                r1 = 0
                r1 = r6[r1]
                r2 = 1
                r2 = r6[r2]
                r3 = 2
                r3 = r6[r3]
                r4 = 3
                r6 = r6[r4]
                java.lang.Object r6 = r0.apply(r1, r2, r3, r6)
                return r6
            L17:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Array of size 4 expected but got "
                r1.<init>(r2)
                int r6 = r6.length
                java.lang.StringBuilder r6 = r1.append(r6)
                java.lang.String r6 = r6.toString()
                r0.<init>(r6)
                throw r0
        }
    }

    static final class Array5Func<T1, T2, T3, T4, T5, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {

        /* renamed from: f */
        private final io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R> f170f;

        Array5Func(io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R> r1) {
                r0 = this;
                r0.<init>()
                r0.f170f = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object[] r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                java.lang.Object r1 = r0.apply2(r1)
                return r1
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public R apply2(java.lang.Object[] r9) throws java.lang.Exception {
                r8 = this;
                int r0 = r9.length
                r1 = 5
                if (r0 != r1) goto L1a
                io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R> r2 = r8.f170f
                r0 = 0
                r3 = r9[r0]
                r0 = 1
                r4 = r9[r0]
                r0 = 2
                r5 = r9[r0]
                r0 = 3
                r6 = r9[r0]
                r0 = 4
                r7 = r9[r0]
                java.lang.Object r9 = r2.apply(r3, r4, r5, r6, r7)
                return r9
            L1a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Array of size 5 expected but got "
                r1.<init>(r2)
                int r9 = r9.length
                java.lang.StringBuilder r9 = r1.append(r9)
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
        }
    }

    static final class Array6Func<T1, T2, T3, T4, T5, T6, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {

        /* renamed from: f */
        final io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R> f171f;

        Array6Func(io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R> r1) {
                r0 = this;
                r0.<init>()
                r0.f171f = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object[] r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                java.lang.Object r1 = r0.apply2(r1)
                return r1
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public R apply2(java.lang.Object[] r10) throws java.lang.Exception {
                r9 = this;
                int r0 = r10.length
                r1 = 6
                if (r0 != r1) goto L1d
                io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R> r2 = r9.f171f
                r0 = 0
                r3 = r10[r0]
                r0 = 1
                r4 = r10[r0]
                r0 = 2
                r5 = r10[r0]
                r0 = 3
                r6 = r10[r0]
                r0 = 4
                r7 = r10[r0]
                r0 = 5
                r8 = r10[r0]
                java.lang.Object r10 = r2.apply(r3, r4, r5, r6, r7, r8)
                return r10
            L1d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Array of size 6 expected but got "
                r1.<init>(r2)
                int r10 = r10.length
                java.lang.StringBuilder r10 = r1.append(r10)
                java.lang.String r10 = r10.toString()
                r0.<init>(r10)
                throw r0
        }
    }

    static final class Array7Func<T1, T2, T3, T4, T5, T6, T7, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {

        /* renamed from: f */
        final io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R> f172f;

        Array7Func(io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R> r1) {
                r0 = this;
                r0.<init>()
                r0.f172f = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object[] r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                java.lang.Object r1 = r0.apply2(r1)
                return r1
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public R apply2(java.lang.Object[] r11) throws java.lang.Exception {
                r10 = this;
                int r0 = r11.length
                r1 = 7
                if (r0 != r1) goto L20
                io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R> r2 = r10.f172f
                r0 = 0
                r3 = r11[r0]
                r0 = 1
                r4 = r11[r0]
                r0 = 2
                r5 = r11[r0]
                r0 = 3
                r6 = r11[r0]
                r0 = 4
                r7 = r11[r0]
                r0 = 5
                r8 = r11[r0]
                r0 = 6
                r9 = r11[r0]
                java.lang.Object r11 = r2.apply(r3, r4, r5, r6, r7, r8, r9)
                return r11
            L20:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Array of size 7 expected but got "
                r1.<init>(r2)
                int r11 = r11.length
                java.lang.StringBuilder r11 = r1.append(r11)
                java.lang.String r11 = r11.toString()
                r0.<init>(r11)
                throw r0
        }
    }

    static final class Array8Func<T1, T2, T3, T4, T5, T6, T7, T8, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {

        /* renamed from: f */
        final io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f173f;

        Array8Func(io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> r1) {
                r0 = this;
                r0.<init>()
                r0.f173f = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object[] r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                java.lang.Object r1 = r0.apply2(r1)
                return r1
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public R apply2(java.lang.Object[] r12) throws java.lang.Exception {
                r11 = this;
                int r0 = r12.length
                r1 = 8
                if (r0 != r1) goto L24
                io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> r2 = r11.f173f
                r0 = 0
                r3 = r12[r0]
                r0 = 1
                r4 = r12[r0]
                r0 = 2
                r5 = r12[r0]
                r0 = 3
                r6 = r12[r0]
                r0 = 4
                r7 = r12[r0]
                r0 = 5
                r8 = r12[r0]
                r0 = 6
                r9 = r12[r0]
                r0 = 7
                r10 = r12[r0]
                java.lang.Object r12 = r2.apply(r3, r4, r5, r6, r7, r8, r9, r10)
                return r12
            L24:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Array of size 8 expected but got "
                r1.<init>(r2)
                int r12 = r12.length
                java.lang.StringBuilder r12 = r1.append(r12)
                java.lang.String r12 = r12.toString()
                r0.<init>(r12)
                throw r0
        }
    }

    static final class Array9Func<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {

        /* renamed from: f */
        final io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f174f;

        Array9Func(io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> r1) {
                r0 = this;
                r0.<init>()
                r0.f174f = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object[] r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                java.lang.Object r1 = r0.apply2(r1)
                return r1
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public R apply2(java.lang.Object[] r13) throws java.lang.Exception {
                r12 = this;
                int r0 = r13.length
                r1 = 9
                if (r0 != r1) goto L28
                io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> r2 = r12.f174f
                r0 = 0
                r3 = r13[r0]
                r0 = 1
                r4 = r13[r0]
                r0 = 2
                r5 = r13[r0]
                r0 = 3
                r6 = r13[r0]
                r0 = 4
                r7 = r13[r0]
                r0 = 5
                r8 = r13[r0]
                r0 = 6
                r9 = r13[r0]
                r0 = 7
                r10 = r13[r0]
                r0 = 8
                r11 = r13[r0]
                java.lang.Object r13 = r2.apply(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r13
            L28:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Array of size 9 expected but got "
                r1.<init>(r2)
                int r13 = r13.length
                java.lang.StringBuilder r13 = r1.append(r13)
                java.lang.String r13 = r13.toString()
                r0.<init>(r13)
                throw r0
        }
    }

    static final class ArrayListCapacityCallable<T> implements java.util.concurrent.Callable<java.util.List<T>> {
        final int capacity;

        ArrayListCapacityCallable(int r1) {
                r0 = this;
                r0.<init>()
                r0.capacity = r1
                return
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
                r1 = this;
                java.util.List r0 = r1.call()
                return r0
        }

        @Override // java.util.concurrent.Callable
        public java.util.List<T> call() throws java.lang.Exception {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r2.capacity
                r0.<init>(r1)
                return r0
        }
    }

    static final class BooleanSupplierPredicateReverse<T> implements io.reactivex.functions.Predicate<T> {
        final io.reactivex.functions.BooleanSupplier supplier;

        BooleanSupplierPredicateReverse(io.reactivex.functions.BooleanSupplier r1) {
                r0 = this;
                r0.<init>()
                r0.supplier = r1
                return
        }

        @Override // io.reactivex.functions.Predicate
        public boolean test(T r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.functions.BooleanSupplier r1 = r0.supplier
                boolean r1 = r1.getAsBoolean()
                r1 = r1 ^ 1
                return r1
        }
    }

    public static class BoundedConsumer implements io.reactivex.functions.Consumer<org.reactivestreams.Subscription> {
        final int bufferSize;

        BoundedConsumer(int r1) {
                r0 = this;
                r0.<init>()
                r0.bufferSize = r1
                return
        }

        @Override // io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(org.reactivestreams.Subscription r1) throws java.lang.Exception {
                r0 = this;
                org.reactivestreams.Subscription r1 = (org.reactivestreams.Subscription) r1
                r0.accept2(r1)
                return
        }

        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(org.reactivestreams.Subscription r3) throws java.lang.Exception {
                r2 = this;
                int r0 = r2.bufferSize
                long r0 = (long) r0
                r3.request(r0)
                return
        }
    }

    static final class CastToClass<T, U> implements io.reactivex.functions.Function<T, U> {
        final java.lang.Class<U> clazz;

        CastToClass(java.lang.Class<U> r1) {
                r0 = this;
                r0.<init>()
                r0.clazz = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public U apply(T r2) throws java.lang.Exception {
                r1 = this;
                java.lang.Class<U> r0 = r1.clazz
                java.lang.Object r2 = r0.cast(r2)
                return r2
        }
    }

    static final class ClassFilter<T, U> implements io.reactivex.functions.Predicate<T> {
        final java.lang.Class<U> clazz;

        ClassFilter(java.lang.Class<U> r1) {
                r0 = this;
                r0.<init>()
                r0.clazz = r1
                return
        }

        @Override // io.reactivex.functions.Predicate
        public boolean test(T r2) throws java.lang.Exception {
                r1 = this;
                java.lang.Class<U> r0 = r1.clazz
                boolean r2 = r0.isInstance(r2)
                return r2
        }
    }

    static final class EmptyAction implements io.reactivex.functions.Action {
        EmptyAction() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.reactivex.functions.Action
        public void run() {
                r0 = this;
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "EmptyAction"
                return r0
        }
    }

    static final class EmptyConsumer implements io.reactivex.functions.Consumer<java.lang.Object> {
        EmptyConsumer() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(java.lang.Object r1) {
                r0 = this;
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "EmptyConsumer"
                return r0
        }
    }

    static final class EmptyLongConsumer implements io.reactivex.functions.LongConsumer {
        EmptyLongConsumer() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.reactivex.functions.LongConsumer
        public void accept(long r1) {
                r0 = this;
                return
        }
    }

    static final class EmptyRunnable implements java.lang.Runnable {
        EmptyRunnable() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "EmptyRunnable"
                return r0
        }
    }

    static final class EqualsPredicate<T> implements io.reactivex.functions.Predicate<T> {
        final T value;

        EqualsPredicate(T r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // io.reactivex.functions.Predicate
        public boolean test(T r2) throws java.lang.Exception {
                r1 = this;
                T r0 = r1.value
                boolean r2 = io.reactivex.internal.functions.ObjectHelper.equals(r2, r0)
                return r2
        }
    }

    static final class ErrorConsumer implements io.reactivex.functions.Consumer<java.lang.Throwable> {
        ErrorConsumer() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.accept2(r1)
                return
        }

        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(java.lang.Throwable r1) {
                r0 = this;
                io.reactivex.plugins.RxJavaPlugins.onError(r1)
                return
        }
    }

    static final class FalsePredicate implements io.reactivex.functions.Predicate<java.lang.Object> {
        FalsePredicate() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.reactivex.functions.Predicate
        public boolean test(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    static final class FutureAction implements io.reactivex.functions.Action {
        final java.util.concurrent.Future<?> future;

        FutureAction(java.util.concurrent.Future<?> r1) {
                r0 = this;
                r0.<init>()
                r0.future = r1
                return
        }

        @Override // io.reactivex.functions.Action
        public void run() throws java.lang.Exception {
                r1 = this;
                java.util.concurrent.Future<?> r0 = r1.future
                r0.get()
                return
        }
    }

    enum HashSetCallable extends java.lang.Enum<io.reactivex.internal.functions.Functions.HashSetCallable> implements java.util.concurrent.Callable<java.util.Set<java.lang.Object>> {
        private static final /* synthetic */ io.reactivex.internal.functions.Functions.HashSetCallable[] $VALUES = null;
        public static final io.reactivex.internal.functions.Functions.HashSetCallable INSTANCE = null;

        static {
                io.reactivex.internal.functions.Functions$HashSetCallable r0 = new io.reactivex.internal.functions.Functions$HashSetCallable
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                io.reactivex.internal.functions.Functions.HashSetCallable.INSTANCE = r0
                r1 = 1
                io.reactivex.internal.functions.Functions$HashSetCallable[] r1 = new io.reactivex.internal.functions.Functions.HashSetCallable[r1]
                r1[r2] = r0
                io.reactivex.internal.functions.Functions.HashSetCallable.$VALUES = r1
                return
        }

        HashSetCallable(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.reactivex.internal.functions.Functions.HashSetCallable valueOf(java.lang.String r1) {
                java.lang.Class<io.reactivex.internal.functions.Functions$HashSetCallable> r0 = io.reactivex.internal.functions.Functions.HashSetCallable.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.reactivex.internal.functions.Functions$HashSetCallable r1 = (io.reactivex.internal.functions.Functions.HashSetCallable) r1
                return r1
        }

        public static io.reactivex.internal.functions.Functions.HashSetCallable[] values() {
                io.reactivex.internal.functions.Functions$HashSetCallable[] r0 = io.reactivex.internal.functions.Functions.HashSetCallable.$VALUES
                java.lang.Object r0 = r0.clone()
                io.reactivex.internal.functions.Functions$HashSetCallable[] r0 = (io.reactivex.internal.functions.Functions.HashSetCallable[]) r0
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.util.Set<java.lang.Object> call() throws java.lang.Exception {
                r1 = this;
                java.util.Set r0 = r1.call2()
                return r0
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public java.util.Set<java.lang.Object> call2() throws java.lang.Exception {
                r1 = this;
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                return r0
        }
    }

    static final class Identity implements io.reactivex.functions.Function<java.lang.Object, java.lang.Object> {
        Identity() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.reactivex.functions.Function
        public java.lang.Object apply(java.lang.Object r1) {
                r0 = this;
                return r1
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "IdentityFunction"
                return r0
        }
    }

    static final class JustValue<T, U> implements java.util.concurrent.Callable<U>, io.reactivex.functions.Function<T, U> {
        final U value;

        JustValue(U r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public U apply(T r1) throws java.lang.Exception {
                r0 = this;
                U r1 = r0.value
                return r1
        }

        @Override // java.util.concurrent.Callable
        public U call() throws java.lang.Exception {
                r1 = this;
                U r0 = r1.value
                return r0
        }
    }

    static final class ListSorter<T> implements io.reactivex.functions.Function<java.util.List<T>, java.util.List<T>> {
        final java.util.Comparator<? super T> comparator;

        ListSorter(java.util.Comparator<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.comparator = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                java.util.List r1 = (java.util.List) r1
                java.util.List r1 = r0.apply(r1)
                return r1
        }

        public java.util.List<T> apply(java.util.List<T> r2) {
                r1 = this;
                java.util.Comparator<? super T> r0 = r1.comparator
                java.util.Collections.sort(r2, r0)
                return r2
        }
    }

    static final class MaxRequestSubscription implements io.reactivex.functions.Consumer<org.reactivestreams.Subscription> {
        MaxRequestSubscription() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(org.reactivestreams.Subscription r1) throws java.lang.Exception {
                r0 = this;
                org.reactivestreams.Subscription r1 = (org.reactivestreams.Subscription) r1
                r0.accept2(r1)
                return
        }

        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(org.reactivestreams.Subscription r3) throws java.lang.Exception {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
                return
        }
    }

    enum NaturalComparator extends java.lang.Enum<io.reactivex.internal.functions.Functions.NaturalComparator> implements java.util.Comparator<java.lang.Object> {
        private static final /* synthetic */ io.reactivex.internal.functions.Functions.NaturalComparator[] $VALUES = null;
        public static final io.reactivex.internal.functions.Functions.NaturalComparator INSTANCE = null;

        static {
                io.reactivex.internal.functions.Functions$NaturalComparator r0 = new io.reactivex.internal.functions.Functions$NaturalComparator
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                io.reactivex.internal.functions.Functions.NaturalComparator.INSTANCE = r0
                r1 = 1
                io.reactivex.internal.functions.Functions$NaturalComparator[] r1 = new io.reactivex.internal.functions.Functions.NaturalComparator[r1]
                r1[r2] = r0
                io.reactivex.internal.functions.Functions.NaturalComparator.$VALUES = r1
                return
        }

        NaturalComparator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.reactivex.internal.functions.Functions.NaturalComparator valueOf(java.lang.String r1) {
                java.lang.Class<io.reactivex.internal.functions.Functions$NaturalComparator> r0 = io.reactivex.internal.functions.Functions.NaturalComparator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.reactivex.internal.functions.Functions$NaturalComparator r1 = (io.reactivex.internal.functions.Functions.NaturalComparator) r1
                return r1
        }

        public static io.reactivex.internal.functions.Functions.NaturalComparator[] values() {
                io.reactivex.internal.functions.Functions$NaturalComparator[] r0 = io.reactivex.internal.functions.Functions.NaturalComparator.$VALUES
                java.lang.Object r0 = r0.clone()
                io.reactivex.internal.functions.Functions$NaturalComparator[] r0 = (io.reactivex.internal.functions.Functions.NaturalComparator[]) r0
                return r0
        }

        @Override // java.util.Comparator
        public int compare(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                int r1 = r1.compareTo(r2)
                return r1
        }
    }

    static final class NaturalObjectComparator implements java.util.Comparator<java.lang.Object> {
        NaturalObjectComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                int r1 = r1.compareTo(r2)
                return r1
        }
    }

    static final class NotificationOnComplete<T> implements io.reactivex.functions.Action {
        final io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> onNotification;

        NotificationOnComplete(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> r1) {
                r0 = this;
                r0.<init>()
                r0.onNotification = r1
                return
        }

        @Override // io.reactivex.functions.Action
        public void run() throws java.lang.Exception {
                r2 = this;
                io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> r0 = r2.onNotification
                io.reactivex.Notification r1 = io.reactivex.Notification.createOnComplete()
                r0.accept(r1)
                return
        }
    }

    static final class NotificationOnError<T> implements io.reactivex.functions.Consumer<java.lang.Throwable> {
        final io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> onNotification;

        NotificationOnError(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> r1) {
                r0 = this;
                r0.<init>()
                r0.onNotification = r1
                return
        }

        @Override // io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.accept2(r1)
                return
        }

        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(java.lang.Throwable r2) throws java.lang.Exception {
                r1 = this;
                io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> r0 = r1.onNotification
                io.reactivex.Notification r2 = io.reactivex.Notification.createOnError(r2)
                r0.accept(r2)
                return
        }
    }

    static final class NotificationOnNext<T> implements io.reactivex.functions.Consumer<T> {
        final io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> onNotification;

        NotificationOnNext(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> r1) {
                r0 = this;
                r0.<init>()
                r0.onNotification = r1
                return
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T r2) throws java.lang.Exception {
                r1 = this;
                io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> r0 = r1.onNotification
                io.reactivex.Notification r2 = io.reactivex.Notification.createOnNext(r2)
                r0.accept(r2)
                return
        }
    }

    static final class NullCallable implements java.util.concurrent.Callable<java.lang.Object> {
        NullCallable() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Callable
        public java.lang.Object call() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    static final class OnErrorMissingConsumer implements io.reactivex.functions.Consumer<java.lang.Throwable> {
        OnErrorMissingConsumer() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.accept2(r1)
                return
        }

        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.exceptions.OnErrorNotImplementedException r0 = new io.reactivex.exceptions.OnErrorNotImplementedException
                r0.<init>(r2)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
                return
        }
    }

    static final class TimestampFunction<T> implements io.reactivex.functions.Function<T, io.reactivex.schedulers.Timed<T>> {
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.TimeUnit unit;

        TimestampFunction(java.util.concurrent.TimeUnit r1, io.reactivex.Scheduler r2) {
                r0 = this;
                r0.<init>()
                r0.unit = r1
                r0.scheduler = r2
                return
        }

        @Override // io.reactivex.functions.Function
        public io.reactivex.schedulers.Timed<T> apply(T r5) throws java.lang.Exception {
                r4 = this;
                io.reactivex.schedulers.Timed r0 = new io.reactivex.schedulers.Timed
                io.reactivex.Scheduler r1 = r4.scheduler
                java.util.concurrent.TimeUnit r2 = r4.unit
                long r1 = r1.now(r2)
                java.util.concurrent.TimeUnit r3 = r4.unit
                r0.<init>(r5, r1, r3)
                return r0
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.schedulers.Timed r1 = r0.apply(r1)
                return r1
        }
    }

    static final class ToMapKeySelector<K, T> implements io.reactivex.functions.BiConsumer<java.util.Map<K, T>, T> {
        private final io.reactivex.functions.Function<? super T, ? extends K> keySelector;

        ToMapKeySelector(io.reactivex.functions.Function<? super T, ? extends K> r1) {
                r0 = this;
                r0.<init>()
                r0.keySelector = r1
                return
        }

        @Override // io.reactivex.functions.BiConsumer
        public /* bridge */ /* synthetic */ void accept(java.lang.Object r1, java.lang.Object r2) throws java.lang.Exception {
                r0 = this;
                java.util.Map r1 = (java.util.Map) r1
                r0.accept(r1, r2)
                return
        }

        public void accept(java.util.Map<K, T> r2, T r3) throws java.lang.Exception {
                r1 = this;
                io.reactivex.functions.Function<? super T, ? extends K> r0 = r1.keySelector
                java.lang.Object r0 = r0.apply(r3)
                r2.put(r0, r3)
                return
        }
    }

    static final class ToMapKeyValueSelector<K, V, T> implements io.reactivex.functions.BiConsumer<java.util.Map<K, V>, T> {
        private final io.reactivex.functions.Function<? super T, ? extends K> keySelector;
        private final io.reactivex.functions.Function<? super T, ? extends V> valueSelector;

        ToMapKeyValueSelector(io.reactivex.functions.Function<? super T, ? extends V> r1, io.reactivex.functions.Function<? super T, ? extends K> r2) {
                r0 = this;
                r0.<init>()
                r0.valueSelector = r1
                r0.keySelector = r2
                return
        }

        @Override // io.reactivex.functions.BiConsumer
        public /* bridge */ /* synthetic */ void accept(java.lang.Object r1, java.lang.Object r2) throws java.lang.Exception {
                r0 = this;
                java.util.Map r1 = (java.util.Map) r1
                r0.accept(r1, r2)
                return
        }

        public void accept(java.util.Map<K, V> r3, T r4) throws java.lang.Exception {
                r2 = this;
                io.reactivex.functions.Function<? super T, ? extends K> r0 = r2.keySelector
                java.lang.Object r0 = r0.apply(r4)
                io.reactivex.functions.Function<? super T, ? extends V> r1 = r2.valueSelector
                java.lang.Object r4 = r1.apply(r4)
                r3.put(r0, r4)
                return
        }
    }

    static final class ToMultimapKeyValueSelector<K, V, T> implements io.reactivex.functions.BiConsumer<java.util.Map<K, java.util.Collection<V>>, T> {
        private final io.reactivex.functions.Function<? super K, ? extends java.util.Collection<? super V>> collectionFactory;
        private final io.reactivex.functions.Function<? super T, ? extends K> keySelector;
        private final io.reactivex.functions.Function<? super T, ? extends V> valueSelector;

        ToMultimapKeyValueSelector(io.reactivex.functions.Function<? super K, ? extends java.util.Collection<? super V>> r1, io.reactivex.functions.Function<? super T, ? extends V> r2, io.reactivex.functions.Function<? super T, ? extends K> r3) {
                r0 = this;
                r0.<init>()
                r0.collectionFactory = r1
                r0.valueSelector = r2
                r0.keySelector = r3
                return
        }

        @Override // io.reactivex.functions.BiConsumer
        public /* bridge */ /* synthetic */ void accept(java.lang.Object r1, java.lang.Object r2) throws java.lang.Exception {
                r0 = this;
                java.util.Map r1 = (java.util.Map) r1
                r0.accept(r1, r2)
                return
        }

        public void accept(java.util.Map<K, java.util.Collection<V>> r3, T r4) throws java.lang.Exception {
                r2 = this;
                io.reactivex.functions.Function<? super T, ? extends K> r0 = r2.keySelector
                java.lang.Object r0 = r0.apply(r4)
                java.lang.Object r1 = r3.get(r0)
                java.util.Collection r1 = (java.util.Collection) r1
                if (r1 != 0) goto L19
                io.reactivex.functions.Function<? super K, ? extends java.util.Collection<? super V>> r1 = r2.collectionFactory
                java.lang.Object r1 = r1.apply(r0)
                java.util.Collection r1 = (java.util.Collection) r1
                r3.put(r0, r1)
            L19:
                io.reactivex.functions.Function<? super T, ? extends V> r3 = r2.valueSelector
                java.lang.Object r3 = r3.apply(r4)
                r1.add(r3)
                return
        }
    }

    static final class TruePredicate implements io.reactivex.functions.Predicate<java.lang.Object> {
        TruePredicate() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.reactivex.functions.Predicate
        public boolean test(java.lang.Object r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    static {
            io.reactivex.internal.functions.Functions$Identity r0 = new io.reactivex.internal.functions.Functions$Identity
            r0.<init>()
            io.reactivex.internal.functions.Functions.IDENTITY = r0
            io.reactivex.internal.functions.Functions$EmptyRunnable r0 = new io.reactivex.internal.functions.Functions$EmptyRunnable
            r0.<init>()
            io.reactivex.internal.functions.Functions.EMPTY_RUNNABLE = r0
            io.reactivex.internal.functions.Functions$EmptyAction r0 = new io.reactivex.internal.functions.Functions$EmptyAction
            r0.<init>()
            io.reactivex.internal.functions.Functions.EMPTY_ACTION = r0
            io.reactivex.internal.functions.Functions$EmptyConsumer r0 = new io.reactivex.internal.functions.Functions$EmptyConsumer
            r0.<init>()
            io.reactivex.internal.functions.Functions.EMPTY_CONSUMER = r0
            io.reactivex.internal.functions.Functions$ErrorConsumer r0 = new io.reactivex.internal.functions.Functions$ErrorConsumer
            r0.<init>()
            io.reactivex.internal.functions.Functions.ERROR_CONSUMER = r0
            io.reactivex.internal.functions.Functions$OnErrorMissingConsumer r0 = new io.reactivex.internal.functions.Functions$OnErrorMissingConsumer
            r0.<init>()
            io.reactivex.internal.functions.Functions.ON_ERROR_MISSING = r0
            io.reactivex.internal.functions.Functions$EmptyLongConsumer r0 = new io.reactivex.internal.functions.Functions$EmptyLongConsumer
            r0.<init>()
            io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER = r0
            io.reactivex.internal.functions.Functions$TruePredicate r0 = new io.reactivex.internal.functions.Functions$TruePredicate
            r0.<init>()
            io.reactivex.internal.functions.Functions.ALWAYS_TRUE = r0
            io.reactivex.internal.functions.Functions$FalsePredicate r0 = new io.reactivex.internal.functions.Functions$FalsePredicate
            r0.<init>()
            io.reactivex.internal.functions.Functions.ALWAYS_FALSE = r0
            io.reactivex.internal.functions.Functions$NullCallable r0 = new io.reactivex.internal.functions.Functions$NullCallable
            r0.<init>()
            io.reactivex.internal.functions.Functions.NULL_SUPPLIER = r0
            io.reactivex.internal.functions.Functions$NaturalObjectComparator r0 = new io.reactivex.internal.functions.Functions$NaturalObjectComparator
            r0.<init>()
            io.reactivex.internal.functions.Functions.NATURAL_COMPARATOR = r0
            io.reactivex.internal.functions.Functions$MaxRequestSubscription r0 = new io.reactivex.internal.functions.Functions$MaxRequestSubscription
            r0.<init>()
            io.reactivex.internal.functions.Functions.REQUEST_MAX = r0
            return
    }

    private Functions() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T> io.reactivex.functions.Consumer<T> actionConsumer(io.reactivex.functions.Action r1) {
            io.reactivex.internal.functions.Functions$ActionConsumer r0 = new io.reactivex.internal.functions.Functions$ActionConsumer
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.functions.Predicate<T> alwaysFalse() {
            io.reactivex.functions.Predicate<java.lang.Object> r0 = io.reactivex.internal.functions.Functions.ALWAYS_FALSE
            return r0
    }

    public static <T> io.reactivex.functions.Predicate<T> alwaysTrue() {
            io.reactivex.functions.Predicate<java.lang.Object> r0 = io.reactivex.internal.functions.Functions.ALWAYS_TRUE
            return r0
    }

    public static <T> io.reactivex.functions.Consumer<T> boundedConsumer(int r1) {
            io.reactivex.internal.functions.Functions$BoundedConsumer r0 = new io.reactivex.internal.functions.Functions$BoundedConsumer
            r0.<init>(r1)
            return r0
    }

    public static <T, U> io.reactivex.functions.Function<T, U> castFunction(java.lang.Class<U> r1) {
            io.reactivex.internal.functions.Functions$CastToClass r0 = new io.reactivex.internal.functions.Functions$CastToClass
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.concurrent.Callable<java.util.List<T>> createArrayList(int r1) {
            io.reactivex.internal.functions.Functions$ArrayListCapacityCallable r0 = new io.reactivex.internal.functions.Functions$ArrayListCapacityCallable
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.concurrent.Callable<java.util.Set<T>> createHashSet() {
            io.reactivex.internal.functions.Functions$HashSetCallable r0 = io.reactivex.internal.functions.Functions.HashSetCallable.INSTANCE
            return r0
    }

    public static <T> io.reactivex.functions.Consumer<T> emptyConsumer() {
            io.reactivex.functions.Consumer<java.lang.Object> r0 = io.reactivex.internal.functions.Functions.EMPTY_CONSUMER
            return r0
    }

    public static <T> io.reactivex.functions.Predicate<T> equalsWith(T r1) {
            io.reactivex.internal.functions.Functions$EqualsPredicate r0 = new io.reactivex.internal.functions.Functions$EqualsPredicate
            r0.<init>(r1)
            return r0
    }

    public static io.reactivex.functions.Action futureAction(java.util.concurrent.Future<?> r1) {
            io.reactivex.internal.functions.Functions$FutureAction r0 = new io.reactivex.internal.functions.Functions$FutureAction
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.functions.Function<T, T> identity() {
            io.reactivex.functions.Function<java.lang.Object, java.lang.Object> r0 = io.reactivex.internal.functions.Functions.IDENTITY
            return r0
    }

    public static <T, U> io.reactivex.functions.Predicate<T> isInstanceOf(java.lang.Class<U> r1) {
            io.reactivex.internal.functions.Functions$ClassFilter r0 = new io.reactivex.internal.functions.Functions$ClassFilter
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.concurrent.Callable<T> justCallable(T r1) {
            io.reactivex.internal.functions.Functions$JustValue r0 = new io.reactivex.internal.functions.Functions$JustValue
            r0.<init>(r1)
            return r0
    }

    public static <T, U> io.reactivex.functions.Function<T, U> justFunction(U r1) {
            io.reactivex.internal.functions.Functions$JustValue r0 = new io.reactivex.internal.functions.Functions$JustValue
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.functions.Function<java.util.List<T>, java.util.List<T>> listSorter(java.util.Comparator<? super T> r1) {
            io.reactivex.internal.functions.Functions$ListSorter r0 = new io.reactivex.internal.functions.Functions$ListSorter
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.Comparator<T> naturalComparator() {
            io.reactivex.internal.functions.Functions$NaturalComparator r0 = io.reactivex.internal.functions.Functions.NaturalComparator.INSTANCE
            return r0
    }

    public static <T> java.util.Comparator<T> naturalOrder() {
            java.util.Comparator<java.lang.Object> r0 = io.reactivex.internal.functions.Functions.NATURAL_COMPARATOR
            return r0
    }

    public static <T> io.reactivex.functions.Action notificationOnComplete(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> r1) {
            io.reactivex.internal.functions.Functions$NotificationOnComplete r0 = new io.reactivex.internal.functions.Functions$NotificationOnComplete
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.functions.Consumer<java.lang.Throwable> notificationOnError(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> r1) {
            io.reactivex.internal.functions.Functions$NotificationOnError r0 = new io.reactivex.internal.functions.Functions$NotificationOnError
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.functions.Consumer<T> notificationOnNext(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> r1) {
            io.reactivex.internal.functions.Functions$NotificationOnNext r0 = new io.reactivex.internal.functions.Functions$NotificationOnNext
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.concurrent.Callable<T> nullSupplier() {
            java.util.concurrent.Callable<java.lang.Object> r0 = io.reactivex.internal.functions.Functions.NULL_SUPPLIER
            return r0
    }

    public static <T> io.reactivex.functions.Predicate<T> predicateReverseFor(io.reactivex.functions.BooleanSupplier r1) {
            io.reactivex.internal.functions.Functions$BooleanSupplierPredicateReverse r0 = new io.reactivex.internal.functions.Functions$BooleanSupplierPredicateReverse
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.functions.Function<T, io.reactivex.schedulers.Timed<T>> timestampWith(java.util.concurrent.TimeUnit r1, io.reactivex.Scheduler r2) {
            io.reactivex.internal.functions.Functions$TimestampFunction r0 = new io.reactivex.internal.functions.Functions$TimestampFunction
            r0.<init>(r1, r2)
            return r0
    }

    public static <T1, T2, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> r1) {
            java.lang.String r0 = "f is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.functions.Functions$Array2Func r0 = new io.reactivex.internal.functions.Functions$Array2Func
            r0.<init>(r1)
            return r0
    }

    public static <T1, T2, T3, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function3<T1, T2, T3, R> r1) {
            java.lang.String r0 = "f is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.functions.Functions$Array3Func r0 = new io.reactivex.internal.functions.Functions$Array3Func
            r0.<init>(r1)
            return r0
    }

    public static <T1, T2, T3, T4, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function4<T1, T2, T3, T4, R> r1) {
            java.lang.String r0 = "f is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.functions.Functions$Array4Func r0 = new io.reactivex.internal.functions.Functions$Array4Func
            r0.<init>(r1)
            return r0
    }

    public static <T1, T2, T3, T4, T5, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R> r1) {
            java.lang.String r0 = "f is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.functions.Functions$Array5Func r0 = new io.reactivex.internal.functions.Functions$Array5Func
            r0.<init>(r1)
            return r0
    }

    public static <T1, T2, T3, T4, T5, T6, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R> r1) {
            java.lang.String r0 = "f is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.functions.Functions$Array6Func r0 = new io.reactivex.internal.functions.Functions$Array6Func
            r0.<init>(r1)
            return r0
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R> r1) {
            java.lang.String r0 = "f is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.functions.Functions$Array7Func r0 = new io.reactivex.internal.functions.Functions$Array7Func
            r0.<init>(r1)
            return r0
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> r1) {
            java.lang.String r0 = "f is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.functions.Functions$Array8Func r0 = new io.reactivex.internal.functions.Functions$Array8Func
            r0.<init>(r1)
            return r0
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> r1) {
            java.lang.String r0 = "f is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.functions.Functions$Array9Func r0 = new io.reactivex.internal.functions.Functions$Array9Func
            r0.<init>(r1)
            return r0
    }

    public static <T, K> io.reactivex.functions.BiConsumer<java.util.Map<K, T>, T> toMapKeySelector(io.reactivex.functions.Function<? super T, ? extends K> r1) {
            io.reactivex.internal.functions.Functions$ToMapKeySelector r0 = new io.reactivex.internal.functions.Functions$ToMapKeySelector
            r0.<init>(r1)
            return r0
    }

    public static <T, K, V> io.reactivex.functions.BiConsumer<java.util.Map<K, V>, T> toMapKeyValueSelector(io.reactivex.functions.Function<? super T, ? extends K> r1, io.reactivex.functions.Function<? super T, ? extends V> r2) {
            io.reactivex.internal.functions.Functions$ToMapKeyValueSelector r0 = new io.reactivex.internal.functions.Functions$ToMapKeyValueSelector
            r0.<init>(r2, r1)
            return r0
    }

    public static <T, K, V> io.reactivex.functions.BiConsumer<java.util.Map<K, java.util.Collection<V>>, T> toMultimapKeyValueSelector(io.reactivex.functions.Function<? super T, ? extends K> r1, io.reactivex.functions.Function<? super T, ? extends V> r2, io.reactivex.functions.Function<? super K, ? extends java.util.Collection<? super V>> r3) {
            io.reactivex.internal.functions.Functions$ToMultimapKeyValueSelector r0 = new io.reactivex.internal.functions.Functions$ToMultimapKeyValueSelector
            r0.<init>(r3, r2, r1)
            return r0
    }
}
