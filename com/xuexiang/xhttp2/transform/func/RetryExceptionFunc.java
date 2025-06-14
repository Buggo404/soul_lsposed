package com.xuexiang.xhttp2.transform.func;

/* loaded from: classes.dex */
public class RetryExceptionFunc implements io.reactivex.functions.Function<io.reactivex.Observable<? extends java.lang.Throwable>, io.reactivex.Observable<?>> {
    private int count;
    private long delay;
    private long increaseDelay;



    private class Wrapper {
        private int index;
        final /* synthetic */ com.xuexiang.xhttp2.transform.func.RetryExceptionFunc this$0;
        private java.lang.Throwable throwable;

        public Wrapper(com.xuexiang.xhttp2.transform.func.RetryExceptionFunc r1, java.lang.Throwable r2, int r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.index = r3
                r0.throwable = r2
                return
        }

        static /* synthetic */ int access$000(com.xuexiang.xhttp2.transform.func.RetryExceptionFunc.Wrapper r0) {
                int r0 = r0.index
                return r0
        }

        static /* synthetic */ java.lang.Throwable access$100(com.xuexiang.xhttp2.transform.func.RetryExceptionFunc.Wrapper r0) {
                java.lang.Throwable r0 = r0.throwable
                return r0
        }
    }

    public RetryExceptionFunc() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.count = r0
            r0 = 500(0x1f4, double:2.47E-321)
            r2.delay = r0
            r0 = 0
            r2.increaseDelay = r0
            return
    }

    public RetryExceptionFunc(int r3, long r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.increaseDelay = r0
            r2.count = r3
            r2.delay = r4
            return
    }

    public RetryExceptionFunc(int r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            r0.count = r1
            r0.delay = r2
            r0.increaseDelay = r4
            return
    }

    static /* synthetic */ int access$200(com.xuexiang.xhttp2.transform.func.RetryExceptionFunc r0) {
            int r0 = r0.count
            return r0
    }

    static /* synthetic */ long access$300(com.xuexiang.xhttp2.transform.func.RetryExceptionFunc r2) {
            long r0 = r2.delay
            return r0
    }

    static /* synthetic */ long access$400(com.xuexiang.xhttp2.transform.func.RetryExceptionFunc r2) {
            long r0 = r2.increaseDelay
            return r0
    }

    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public io.reactivex.Observable<?> apply2(io.reactivex.Observable<? extends java.lang.Throwable> r3) throws java.lang.Exception {
            r2 = this;
            int r0 = r2.count
            r1 = 1
            int r0 = r0 + r1
            io.reactivex.Observable r0 = io.reactivex.Observable.range(r1, r0)
            com.xuexiang.xhttp2.transform.func.RetryExceptionFunc$2 r1 = new com.xuexiang.xhttp2.transform.func.RetryExceptionFunc$2
            r1.<init>(r2)
            io.reactivex.Observable r3 = r3.zipWith(r0, r1)
            com.xuexiang.xhttp2.transform.func.RetryExceptionFunc$1 r0 = new com.xuexiang.xhttp2.transform.func.RetryExceptionFunc$1
            r0.<init>(r2)
            io.reactivex.Observable r3 = r3.flatMap(r0)
            return r3
    }

    @Override // io.reactivex.functions.Function
    public /* bridge */ /* synthetic */ io.reactivex.Observable<?> apply(io.reactivex.Observable<? extends java.lang.Throwable> r1) throws java.lang.Exception {
            r0 = this;
            io.reactivex.Observable r1 = (io.reactivex.Observable) r1
            io.reactivex.Observable r1 = r0.apply2(r1)
            return r1
    }
}
