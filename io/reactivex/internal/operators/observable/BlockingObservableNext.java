package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class BlockingObservableNext<T> implements java.lang.Iterable<T> {
    final io.reactivex.ObservableSource<T> source;

    static final class NextIterator<T> implements java.util.Iterator<T> {
        private java.lang.Throwable error;
        private boolean hasNext;
        private boolean isNextConsumed;
        private final io.reactivex.ObservableSource<T> items;
        private T next;
        private final io.reactivex.internal.operators.observable.BlockingObservableNext.NextObserver<T> observer;
        private boolean started;

        NextIterator(io.reactivex.ObservableSource<T> r2, io.reactivex.internal.operators.observable.BlockingObservableNext.NextObserver<T> r3) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.hasNext = r0
                r1.isNextConsumed = r0
                r1.items = r2
                r1.observer = r3
                return
        }

        private boolean moveToNext() {
                r4 = this;
                boolean r0 = r4.started
                r1 = 1
                if (r0 != 0) goto L18
                r4.started = r1
                io.reactivex.internal.operators.observable.BlockingObservableNext$NextObserver<T> r0 = r4.observer
                r0.setWaiting()
                io.reactivex.internal.operators.observable.ObservableMaterialize r0 = new io.reactivex.internal.operators.observable.ObservableMaterialize
                io.reactivex.ObservableSource<T> r2 = r4.items
                r0.<init>(r2)
                io.reactivex.internal.operators.observable.BlockingObservableNext$NextObserver<T> r2 = r4.observer
                r0.subscribe(r2)
            L18:
                io.reactivex.internal.operators.observable.BlockingObservableNext$NextObserver<T> r0 = r4.observer     // Catch: java.lang.InterruptedException -> L42
                io.reactivex.Notification r0 = r0.takeNext()     // Catch: java.lang.InterruptedException -> L42
                boolean r2 = r0.isOnNext()
                r3 = 0
                if (r2 == 0) goto L2e
                r4.isNextConsumed = r3
                java.lang.Object r0 = r0.getValue()
                r4.next = r0
                return r1
            L2e:
                r4.hasNext = r3
                boolean r1 = r0.isOnComplete()
                if (r1 == 0) goto L37
                return r3
            L37:
                java.lang.Throwable r0 = r0.getError()
                r4.error = r0
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
            L42:
                r0 = move-exception
                io.reactivex.internal.operators.observable.BlockingObservableNext$NextObserver<T> r1 = r4.observer
                r1.dispose()
                r4.error = r0
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                java.lang.Throwable r0 = r2.error
                if (r0 != 0) goto L16
                boolean r0 = r2.hasNext
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                boolean r0 = r2.isNextConsumed
                if (r0 == 0) goto L14
                boolean r0 = r2.moveToNext()
                if (r0 == 0) goto L15
            L14:
                r1 = 1
            L15:
                return r1
            L16:
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
        }

        @Override // java.util.Iterator
        public T next() {
                r2 = this;
                java.lang.Throwable r0 = r2.error
                if (r0 != 0) goto L18
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L10
                r0 = 1
                r2.isNextConsumed = r0
                T r0 = r2.next
                return r0
            L10:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.String r1 = "No more elements"
                r0.<init>(r1)
                throw r0
            L18:
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Read only iterator"
                r0.<init>(r1)
                throw r0
        }
    }

    static final class NextObserver<T> extends io.reactivex.observers.DisposableObserver<io.reactivex.Notification<T>> {
        private final java.util.concurrent.BlockingQueue<io.reactivex.Notification<T>> buf;
        final java.util.concurrent.atomic.AtomicInteger waiting;

        NextObserver() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.ArrayBlockingQueue r0 = new java.util.concurrent.ArrayBlockingQueue
                r1 = 1
                r0.<init>(r1)
                r2.buf = r0
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r2.waiting = r0
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r0 = this;
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                io.reactivex.plugins.RxJavaPlugins.onError(r1)
                return
        }

        public void onNext(io.reactivex.Notification<T> r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.waiting
                r1 = 0
                int r0 = r0.getAndSet(r1)
                r1 = 1
                if (r0 == r1) goto L10
                boolean r0 = r3.isOnNext()
                if (r0 != 0) goto L2a
            L10:
                java.util.concurrent.BlockingQueue<io.reactivex.Notification<T>> r0 = r2.buf
                boolean r0 = r0.offer(r3)
                if (r0 != 0) goto L2a
                java.util.concurrent.BlockingQueue<io.reactivex.Notification<T>> r0 = r2.buf
                java.lang.Object r0 = r0.poll()
                io.reactivex.Notification r0 = (io.reactivex.Notification) r0
                if (r0 == 0) goto L10
                boolean r1 = r0.isOnNext()
                if (r1 != 0) goto L10
                r3 = r0
                goto L10
            L2a:
                return
        }

        @Override // io.reactivex.Observer
        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                io.reactivex.Notification r1 = (io.reactivex.Notification) r1
                r0.onNext(r1)
                return
        }

        void setWaiting() {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.waiting
                r1 = 1
                r0.set(r1)
                return
        }

        public io.reactivex.Notification<T> takeNext() throws java.lang.InterruptedException {
                r1 = this;
                r1.setWaiting()
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()
                java.util.concurrent.BlockingQueue<io.reactivex.Notification<T>> r0 = r1.buf
                java.lang.Object r0 = r0.take()
                io.reactivex.Notification r0 = (io.reactivex.Notification) r0
                return r0
        }
    }

    public BlockingObservableNext(io.reactivex.ObservableSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r3 = this;
            io.reactivex.internal.operators.observable.BlockingObservableNext$NextObserver r0 = new io.reactivex.internal.operators.observable.BlockingObservableNext$NextObserver
            r0.<init>()
            io.reactivex.internal.operators.observable.BlockingObservableNext$NextIterator r1 = new io.reactivex.internal.operators.observable.BlockingObservableNext$NextIterator
            io.reactivex.ObservableSource<T> r2 = r3.source
            r1.<init>(r2, r0)
            return r1
    }
}
