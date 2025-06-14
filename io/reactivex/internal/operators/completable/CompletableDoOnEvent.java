package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableDoOnEvent extends io.reactivex.Completable {
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onEvent;
    final io.reactivex.CompletableSource source;

    final class DoOnEvent implements io.reactivex.CompletableObserver {
        private final io.reactivex.CompletableObserver observer;
        final /* synthetic */ io.reactivex.internal.operators.completable.CompletableDoOnEvent this$0;

        DoOnEvent(io.reactivex.internal.operators.completable.CompletableDoOnEvent r1, io.reactivex.CompletableObserver r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.observer = r2
                return
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r2 = this;
                io.reactivex.internal.operators.completable.CompletableDoOnEvent r0 = r2.this$0     // Catch: java.lang.Throwable -> Le
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = r0.onEvent     // Catch: java.lang.Throwable -> Le
                r1 = 0
                r0.accept(r1)     // Catch: java.lang.Throwable -> Le
                io.reactivex.CompletableObserver r0 = r2.observer
                r0.onComplete()
                return
            Le:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.CompletableObserver r1 = r2.observer
                r1.onError(r0)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                io.reactivex.internal.operators.completable.CompletableDoOnEvent r0 = r4.this$0     // Catch: java.lang.Throwable -> L8
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = r0.onEvent     // Catch: java.lang.Throwable -> L8
                r0.accept(r5)     // Catch: java.lang.Throwable -> L8
                goto L1b
            L8:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.exceptions.CompositeException r1 = new io.reactivex.exceptions.CompositeException
                r2 = 2
                java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
                r3 = 0
                r2[r3] = r5
                r5 = 1
                r2[r5] = r0
                r1.<init>(r2)
                r5 = r1
            L1b:
                io.reactivex.CompletableObserver r0 = r4.observer
                r0.onError(r5)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.observer
                r0.onSubscribe(r2)
                return
        }
    }

    public CompletableDoOnEvent(io.reactivex.CompletableSource r1, io.reactivex.functions.Consumer<? super java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.onEvent = r2
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            io.reactivex.CompletableSource r0 = r2.source
            io.reactivex.internal.operators.completable.CompletableDoOnEvent$DoOnEvent r1 = new io.reactivex.internal.operators.completable.CompletableDoOnEvent$DoOnEvent
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            return
    }
}
