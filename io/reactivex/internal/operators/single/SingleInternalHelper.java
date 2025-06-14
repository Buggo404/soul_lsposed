package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleInternalHelper {

    enum NoSuchElementCallable extends java.lang.Enum<io.reactivex.internal.operators.single.SingleInternalHelper.NoSuchElementCallable> implements java.util.concurrent.Callable<java.util.NoSuchElementException> {
        private static final /* synthetic */ io.reactivex.internal.operators.single.SingleInternalHelper.NoSuchElementCallable[] $VALUES = null;
        public static final io.reactivex.internal.operators.single.SingleInternalHelper.NoSuchElementCallable INSTANCE = null;

        static {
                io.reactivex.internal.operators.single.SingleInternalHelper$NoSuchElementCallable r0 = new io.reactivex.internal.operators.single.SingleInternalHelper$NoSuchElementCallable
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                io.reactivex.internal.operators.single.SingleInternalHelper.NoSuchElementCallable.INSTANCE = r0
                r1 = 1
                io.reactivex.internal.operators.single.SingleInternalHelper$NoSuchElementCallable[] r1 = new io.reactivex.internal.operators.single.SingleInternalHelper.NoSuchElementCallable[r1]
                r1[r2] = r0
                io.reactivex.internal.operators.single.SingleInternalHelper.NoSuchElementCallable.$VALUES = r1
                return
        }

        NoSuchElementCallable(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.reactivex.internal.operators.single.SingleInternalHelper.NoSuchElementCallable valueOf(java.lang.String r1) {
                java.lang.Class<io.reactivex.internal.operators.single.SingleInternalHelper$NoSuchElementCallable> r0 = io.reactivex.internal.operators.single.SingleInternalHelper.NoSuchElementCallable.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.reactivex.internal.operators.single.SingleInternalHelper$NoSuchElementCallable r1 = (io.reactivex.internal.operators.single.SingleInternalHelper.NoSuchElementCallable) r1
                return r1
        }

        public static io.reactivex.internal.operators.single.SingleInternalHelper.NoSuchElementCallable[] values() {
                io.reactivex.internal.operators.single.SingleInternalHelper$NoSuchElementCallable[] r0 = io.reactivex.internal.operators.single.SingleInternalHelper.NoSuchElementCallable.$VALUES
                java.lang.Object r0 = r0.clone()
                io.reactivex.internal.operators.single.SingleInternalHelper$NoSuchElementCallable[] r0 = (io.reactivex.internal.operators.single.SingleInternalHelper.NoSuchElementCallable[]) r0
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.util.NoSuchElementException call() throws java.lang.Exception {
                r1 = this;
                java.util.NoSuchElementException r0 = r1.call2()
                return r0
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public java.util.NoSuchElementException call2() throws java.lang.Exception {
                r1 = this;
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                return r0
        }
    }

    enum ToFlowable extends java.lang.Enum<io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowable> implements io.reactivex.functions.Function<io.reactivex.SingleSource, org.reactivestreams.Publisher> {
        private static final /* synthetic */ io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowable[] $VALUES = null;
        public static final io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowable INSTANCE = null;

        static {
                io.reactivex.internal.operators.single.SingleInternalHelper$ToFlowable r0 = new io.reactivex.internal.operators.single.SingleInternalHelper$ToFlowable
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowable.INSTANCE = r0
                r1 = 1
                io.reactivex.internal.operators.single.SingleInternalHelper$ToFlowable[] r1 = new io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowable[r1]
                r1[r2] = r0
                io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowable.$VALUES = r1
                return
        }

        ToFlowable(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowable valueOf(java.lang.String r1) {
                java.lang.Class<io.reactivex.internal.operators.single.SingleInternalHelper$ToFlowable> r0 = io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowable.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.reactivex.internal.operators.single.SingleInternalHelper$ToFlowable r1 = (io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowable) r1
                return r1
        }

        public static io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowable[] values() {
                io.reactivex.internal.operators.single.SingleInternalHelper$ToFlowable[] r0 = io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowable.$VALUES
                java.lang.Object r0 = r0.clone()
                io.reactivex.internal.operators.single.SingleInternalHelper$ToFlowable[] r0 = (io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowable[]) r0
                return r0
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ org.reactivestreams.Publisher apply(io.reactivex.SingleSource r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.SingleSource r1 = (io.reactivex.SingleSource) r1
                org.reactivestreams.Publisher r1 = r0.apply2(r1)
                return r1
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public org.reactivestreams.Publisher apply2(io.reactivex.SingleSource r2) {
                r1 = this;
                io.reactivex.internal.operators.single.SingleToFlowable r0 = new io.reactivex.internal.operators.single.SingleToFlowable
                r0.<init>(r2)
                return r0
        }
    }

    static final class ToFlowableIterable<T> implements java.lang.Iterable<io.reactivex.Flowable<T>> {
        private final java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> sources;

        ToFlowableIterable(java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> r1) {
                r0 = this;
                r0.<init>()
                r0.sources = r1
                return
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<io.reactivex.Flowable<T>> iterator() {
                r2 = this;
                io.reactivex.internal.operators.single.SingleInternalHelper$ToFlowableIterator r0 = new io.reactivex.internal.operators.single.SingleInternalHelper$ToFlowableIterator
                java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> r1 = r2.sources
                java.util.Iterator r1 = r1.iterator()
                r0.<init>(r1)
                return r0
        }
    }

    static final class ToFlowableIterator<T> implements java.util.Iterator<io.reactivex.Flowable<T>> {
        private final java.util.Iterator<? extends io.reactivex.SingleSource<? extends T>> sit;

        ToFlowableIterator(java.util.Iterator<? extends io.reactivex.SingleSource<? extends T>> r1) {
                r0 = this;
                r0.<init>()
                r0.sit = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<? extends io.reactivex.SingleSource<? extends T>> r0 = r1.sit
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public io.reactivex.Flowable<T> next() {
                r2 = this;
                io.reactivex.internal.operators.single.SingleToFlowable r0 = new io.reactivex.internal.operators.single.SingleToFlowable
                java.util.Iterator<? extends io.reactivex.SingleSource<? extends T>> r1 = r2.sit
                java.lang.Object r1 = r1.next()
                io.reactivex.SingleSource r1 = (io.reactivex.SingleSource) r1
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                io.reactivex.Flowable r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    enum ToObservable extends java.lang.Enum<io.reactivex.internal.operators.single.SingleInternalHelper.ToObservable> implements io.reactivex.functions.Function<io.reactivex.SingleSource, io.reactivex.Observable> {
        private static final /* synthetic */ io.reactivex.internal.operators.single.SingleInternalHelper.ToObservable[] $VALUES = null;
        public static final io.reactivex.internal.operators.single.SingleInternalHelper.ToObservable INSTANCE = null;

        static {
                io.reactivex.internal.operators.single.SingleInternalHelper$ToObservable r0 = new io.reactivex.internal.operators.single.SingleInternalHelper$ToObservable
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                io.reactivex.internal.operators.single.SingleInternalHelper.ToObservable.INSTANCE = r0
                r1 = 1
                io.reactivex.internal.operators.single.SingleInternalHelper$ToObservable[] r1 = new io.reactivex.internal.operators.single.SingleInternalHelper.ToObservable[r1]
                r1[r2] = r0
                io.reactivex.internal.operators.single.SingleInternalHelper.ToObservable.$VALUES = r1
                return
        }

        ToObservable(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.reactivex.internal.operators.single.SingleInternalHelper.ToObservable valueOf(java.lang.String r1) {
                java.lang.Class<io.reactivex.internal.operators.single.SingleInternalHelper$ToObservable> r0 = io.reactivex.internal.operators.single.SingleInternalHelper.ToObservable.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.reactivex.internal.operators.single.SingleInternalHelper$ToObservable r1 = (io.reactivex.internal.operators.single.SingleInternalHelper.ToObservable) r1
                return r1
        }

        public static io.reactivex.internal.operators.single.SingleInternalHelper.ToObservable[] values() {
                io.reactivex.internal.operators.single.SingleInternalHelper$ToObservable[] r0 = io.reactivex.internal.operators.single.SingleInternalHelper.ToObservable.$VALUES
                java.lang.Object r0 = r0.clone()
                io.reactivex.internal.operators.single.SingleInternalHelper$ToObservable[] r0 = (io.reactivex.internal.operators.single.SingleInternalHelper.ToObservable[]) r0
                return r0
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public io.reactivex.Observable apply2(io.reactivex.SingleSource r2) {
                r1 = this;
                io.reactivex.internal.operators.single.SingleToObservable r0 = new io.reactivex.internal.operators.single.SingleToObservable
                r0.<init>(r2)
                return r0
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ io.reactivex.Observable apply(io.reactivex.SingleSource r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.SingleSource r1 = (io.reactivex.SingleSource) r1
                io.reactivex.Observable r1 = r0.apply2(r1)
                return r1
        }
    }

    private SingleInternalHelper() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T> java.util.concurrent.Callable<java.util.NoSuchElementException> emptyThrower() {
            io.reactivex.internal.operators.single.SingleInternalHelper$NoSuchElementCallable r0 = io.reactivex.internal.operators.single.SingleInternalHelper.NoSuchElementCallable.INSTANCE
            return r0
    }

    public static <T> java.lang.Iterable<? extends io.reactivex.Flowable<T>> iterableToFlowable(java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> r1) {
            io.reactivex.internal.operators.single.SingleInternalHelper$ToFlowableIterable r0 = new io.reactivex.internal.operators.single.SingleInternalHelper$ToFlowableIterable
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.functions.Function<io.reactivex.SingleSource<? extends T>, org.reactivestreams.Publisher<? extends T>> toFlowable() {
            io.reactivex.internal.operators.single.SingleInternalHelper$ToFlowable r0 = io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowable.INSTANCE
            return r0
    }

    public static <T> io.reactivex.functions.Function<io.reactivex.SingleSource<? extends T>, io.reactivex.Observable<? extends T>> toObservable() {
            io.reactivex.internal.operators.single.SingleInternalHelper$ToObservable r0 = io.reactivex.internal.operators.single.SingleInternalHelper.ToObservable.INSTANCE
            return r0
    }
}
