package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableOnErrorComplete extends io.reactivex.Completable {
    final io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate;
    final io.reactivex.CompletableSource source;

    final class OnError implements io.reactivex.CompletableObserver {

        /* renamed from: s */
        private final io.reactivex.CompletableObserver f207s;
        final /* synthetic */ io.reactivex.internal.operators.completable.CompletableOnErrorComplete this$0;

        OnError(io.reactivex.internal.operators.completable.CompletableOnErrorComplete r1, io.reactivex.CompletableObserver r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.f207s = r2
                return
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.f207s
                r0.onComplete()
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                io.reactivex.internal.operators.completable.CompletableOnErrorComplete r0 = r5.this$0     // Catch: java.lang.Throwable -> L16
                io.reactivex.functions.Predicate<? super java.lang.Throwable> r0 = r0.predicate     // Catch: java.lang.Throwable -> L16
                boolean r0 = r0.test(r6)     // Catch: java.lang.Throwable -> L16
                if (r0 == 0) goto L10
                io.reactivex.CompletableObserver r6 = r5.f207s
                r6.onComplete()
                goto L15
            L10:
                io.reactivex.CompletableObserver r0 = r5.f207s
                r0.onError(r6)
            L15:
                return
            L16:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.CompletableObserver r1 = r5.f207s
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r4 = 0
                r3[r4] = r6
                r6 = 1
                r3[r6] = r0
                r2.<init>(r3)
                r1.onError(r2)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.f207s
                r0.onSubscribe(r2)
                return
        }
    }

    public CompletableOnErrorComplete(io.reactivex.CompletableSource r1, io.reactivex.functions.Predicate<? super java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.predicate = r2
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            io.reactivex.CompletableSource r0 = r2.source
            io.reactivex.internal.operators.completable.CompletableOnErrorComplete$OnError r1 = new io.reactivex.internal.operators.completable.CompletableOnErrorComplete$OnError
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            return
    }
}
