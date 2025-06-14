package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeDoOnEvent<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> onEvent;

    static final class DoOnEventMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f342d;
        final io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> onEvent;

        DoOnEventMaybeObserver(io.reactivex.MaybeObserver<? super T> r1, io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onEvent = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f342d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f342d = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f342d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r2 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f342d = r0
                io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> r0 = r2.onEvent     // Catch: java.lang.Throwable -> L10
                r1 = 0
                r0.accept(r1, r1)     // Catch: java.lang.Throwable -> L10
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onComplete()
                return
            L10:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.MaybeObserver<? super T> r1 = r2.actual
                r1.onError(r0)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r4.f342d = r0
                io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> r0 = r4.onEvent     // Catch: java.lang.Throwable -> Lb
                r1 = 0
                r0.accept(r1, r5)     // Catch: java.lang.Throwable -> Lb
                goto L1e
            Lb:
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
            L1e:
                io.reactivex.MaybeObserver<? super T> r0 = r4.actual
                r0.onError(r5)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f342d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f342d = r2
                io.reactivex.MaybeObserver<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r3) {
                r2 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f342d = r0
                io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> r0 = r2.onEvent     // Catch: java.lang.Throwable -> L10
                r1 = 0
                r0.accept(r3, r1)     // Catch: java.lang.Throwable -> L10
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onSuccess(r3)
                return
            L10:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onError(r3)
                return
        }
    }

    public MaybeDoOnEvent(io.reactivex.MaybeSource<T> r1, io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.onEvent = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r4) {
            r3 = this;
            io.reactivex.MaybeSource<T> r0 = r3.source
            io.reactivex.internal.operators.maybe.MaybeDoOnEvent$DoOnEventMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeDoOnEvent$DoOnEventMaybeObserver
            io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> r2 = r3.onEvent
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
