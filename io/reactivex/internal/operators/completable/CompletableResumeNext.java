package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableResumeNext extends io.reactivex.Completable {
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.CompletableSource> errorMapper;
    final io.reactivex.CompletableSource source;

    final class ResumeNext implements io.reactivex.CompletableObserver {

        /* renamed from: s */
        final io.reactivex.CompletableObserver f209s;

        /* renamed from: sd */
        final io.reactivex.internal.disposables.SequentialDisposable f210sd;
        final /* synthetic */ io.reactivex.internal.operators.completable.CompletableResumeNext this$0;

        final class OnErrorObserver implements io.reactivex.CompletableObserver {
            final /* synthetic */ io.reactivex.internal.operators.completable.CompletableResumeNext.ResumeNext this$1;

            OnErrorObserver(io.reactivex.internal.operators.completable.CompletableResumeNext.ResumeNext r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    return
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.completable.CompletableResumeNext$ResumeNext r0 = r1.this$1
                    io.reactivex.CompletableObserver r0 = r0.f209s
                    r0.onComplete()
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.completable.CompletableResumeNext$ResumeNext r0 = r1.this$1
                    io.reactivex.CompletableObserver r0 = r0.f209s
                    r0.onError(r2)
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.completable.CompletableResumeNext$ResumeNext r0 = r1.this$1
                    io.reactivex.internal.disposables.SequentialDisposable r0 = r0.f210sd
                    r0.update(r2)
                    return
            }
        }

        ResumeNext(io.reactivex.internal.operators.completable.CompletableResumeNext r1, io.reactivex.CompletableObserver r2, io.reactivex.internal.disposables.SequentialDisposable r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.f209s = r2
                r0.f210sd = r3
                return
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.f209s
                r0.onComplete()
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                io.reactivex.internal.operators.completable.CompletableResumeNext r0 = r5.this$0     // Catch: java.lang.Throwable -> L25
                io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.CompletableSource> r0 = r0.errorMapper     // Catch: java.lang.Throwable -> L25
                java.lang.Object r0 = r0.apply(r6)     // Catch: java.lang.Throwable -> L25
                io.reactivex.CompletableSource r0 = (io.reactivex.CompletableSource) r0     // Catch: java.lang.Throwable -> L25
                if (r0 != 0) goto L1c
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "The CompletableConsumable returned is null"
                r0.<init>(r1)
                r0.initCause(r6)
                io.reactivex.CompletableObserver r6 = r5.f209s
                r6.onError(r0)
                return
            L1c:
                io.reactivex.internal.operators.completable.CompletableResumeNext$ResumeNext$OnErrorObserver r6 = new io.reactivex.internal.operators.completable.CompletableResumeNext$ResumeNext$OnErrorObserver
                r6.<init>(r5)
                r0.subscribe(r6)
                return
            L25:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.CompletableObserver r1 = r5.f209s
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r4 = 0
                r3[r4] = r0
                r0 = 1
                r3[r0] = r6
                r2.<init>(r3)
                r1.onError(r2)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.f210sd
                r0.update(r2)
                return
        }
    }

    public CompletableResumeNext(io.reactivex.CompletableSource r1, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.CompletableSource> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.errorMapper = r2
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r4) {
            r3 = this;
            io.reactivex.internal.disposables.SequentialDisposable r0 = new io.reactivex.internal.disposables.SequentialDisposable
            r0.<init>()
            r4.onSubscribe(r0)
            io.reactivex.CompletableSource r1 = r3.source
            io.reactivex.internal.operators.completable.CompletableResumeNext$ResumeNext r2 = new io.reactivex.internal.operators.completable.CompletableResumeNext$ResumeNext
            r2.<init>(r3, r4, r0)
            r1.subscribe(r2)
            return
    }
}
