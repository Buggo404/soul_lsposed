package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public enum MaybeToPublisher extends java.lang.Enum<io.reactivex.internal.operators.maybe.MaybeToPublisher> implements io.reactivex.functions.Function<io.reactivex.MaybeSource<java.lang.Object>, org.reactivestreams.Publisher<java.lang.Object>> {
    private static final /* synthetic */ io.reactivex.internal.operators.maybe.MaybeToPublisher[] $VALUES = null;
    public static final io.reactivex.internal.operators.maybe.MaybeToPublisher INSTANCE = null;

    static {
            io.reactivex.internal.operators.maybe.MaybeToPublisher r0 = new io.reactivex.internal.operators.maybe.MaybeToPublisher
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.internal.operators.maybe.MaybeToPublisher.INSTANCE = r0
            r1 = 1
            io.reactivex.internal.operators.maybe.MaybeToPublisher[] r1 = new io.reactivex.internal.operators.maybe.MaybeToPublisher[r1]
            r1[r2] = r0
            io.reactivex.internal.operators.maybe.MaybeToPublisher.$VALUES = r1
            return
    }

    MaybeToPublisher(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <T> io.reactivex.functions.Function<io.reactivex.MaybeSource<T>, org.reactivestreams.Publisher<T>> instance() {
            io.reactivex.internal.operators.maybe.MaybeToPublisher r0 = io.reactivex.internal.operators.maybe.MaybeToPublisher.INSTANCE
            return r0
    }

    public static io.reactivex.internal.operators.maybe.MaybeToPublisher valueOf(java.lang.String r1) {
            java.lang.Class<io.reactivex.internal.operators.maybe.MaybeToPublisher> r0 = io.reactivex.internal.operators.maybe.MaybeToPublisher.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.reactivex.internal.operators.maybe.MaybeToPublisher r1 = (io.reactivex.internal.operators.maybe.MaybeToPublisher) r1
            return r1
    }

    public static io.reactivex.internal.operators.maybe.MaybeToPublisher[] values() {
            io.reactivex.internal.operators.maybe.MaybeToPublisher[] r0 = io.reactivex.internal.operators.maybe.MaybeToPublisher.$VALUES
            java.lang.Object r0 = r0.clone()
            io.reactivex.internal.operators.maybe.MaybeToPublisher[] r0 = (io.reactivex.internal.operators.maybe.MaybeToPublisher[]) r0
            return r0
    }

    @Override // io.reactivex.functions.Function
    public /* bridge */ /* synthetic */ org.reactivestreams.Publisher<java.lang.Object> apply(io.reactivex.MaybeSource<java.lang.Object> r1) throws java.lang.Exception {
            r0 = this;
            io.reactivex.MaybeSource r1 = (io.reactivex.MaybeSource) r1
            org.reactivestreams.Publisher r1 = r0.apply2(r1)
            return r1
    }

    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public org.reactivestreams.Publisher<java.lang.Object> apply2(io.reactivex.MaybeSource<java.lang.Object> r2) throws java.lang.Exception {
            r1 = this;
            io.reactivex.internal.operators.maybe.MaybeToFlowable r0 = new io.reactivex.internal.operators.maybe.MaybeToFlowable
            r0.<init>(r2)
            return r0
    }
}
