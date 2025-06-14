package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class BlockingObservableIterable<T> implements java.lang.Iterable<T> {
    final int bufferSize;
    final io.reactivex.ObservableSource<? extends T> source;

    static final class BlockingObservableIterator<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, java.util.Iterator<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 6695226475494099826L;
        final java.util.concurrent.locks.Condition condition;
        volatile boolean done;
        java.lang.Throwable error;
        final java.util.concurrent.locks.Lock lock;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;

        BlockingObservableIterator(int r2) {
                r1 = this;
                r1.<init>()
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r0.<init>(r2)
                r1.queue = r0
                java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
                r2.<init>()
                r1.lock = r2
                java.util.concurrent.locks.Condition r2 = r2.newCondition()
                r1.condition = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
            L0:
                boolean r0 = r2.done
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r1 = r2.queue
                boolean r1 = r1.isEmpty()
                if (r0 == 0) goto L17
                java.lang.Throwable r0 = r2.error
                if (r0 != 0) goto L12
                if (r1 == 0) goto L17
                r0 = 0
                return r0
            L12:
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
            L17:
                if (r1 == 0) goto L4c
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()     // Catch: java.lang.InterruptedException -> L40
                java.util.concurrent.locks.Lock r0 = r2.lock     // Catch: java.lang.InterruptedException -> L40
                r0.lock()     // Catch: java.lang.InterruptedException -> L40
            L21:
                boolean r0 = r2.done     // Catch: java.lang.Throwable -> L39
                if (r0 != 0) goto L33
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r2.queue     // Catch: java.lang.Throwable -> L39
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L39
                if (r0 == 0) goto L33
                java.util.concurrent.locks.Condition r0 = r2.condition     // Catch: java.lang.Throwable -> L39
                r0.await()     // Catch: java.lang.Throwable -> L39
                goto L21
            L33:
                java.util.concurrent.locks.Lock r0 = r2.lock     // Catch: java.lang.InterruptedException -> L40
                r0.unlock()     // Catch: java.lang.InterruptedException -> L40
                goto L0
            L39:
                r0 = move-exception
                java.util.concurrent.locks.Lock r1 = r2.lock     // Catch: java.lang.InterruptedException -> L40
                r1.unlock()     // Catch: java.lang.InterruptedException -> L40
                throw r0     // Catch: java.lang.InterruptedException -> L40
            L40:
                r0 = move-exception
                io.reactivex.internal.disposables.DisposableHelper.dispose(r2)
                r2.signalConsumer()
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
            L4c:
                r0 = 1
                return r0
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto Ld
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
                java.lang.Object r0 = r0.poll()
                return r0
            Ld:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.signalConsumer()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                r1 = 1
                r0.done = r1
                r0.signalConsumer()
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
                r0.offer(r2)
                r1.signalConsumer()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "remove"
                r0.<init>(r1)
                throw r0
        }

        void signalConsumer() {
                r2 = this;
                java.util.concurrent.locks.Lock r0 = r2.lock
                r0.lock()
                java.util.concurrent.locks.Condition r0 = r2.condition     // Catch: java.lang.Throwable -> L10
                r0.signalAll()     // Catch: java.lang.Throwable -> L10
                java.util.concurrent.locks.Lock r0 = r2.lock
                r0.unlock()
                return
            L10:
                r0 = move-exception
                java.util.concurrent.locks.Lock r1 = r2.lock
                r1.unlock()
                throw r0
        }
    }

    public BlockingObservableIterable(io.reactivex.ObservableSource<? extends T> r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.bufferSize = r2
            return
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r2 = this;
            io.reactivex.internal.operators.observable.BlockingObservableIterable$BlockingObservableIterator r0 = new io.reactivex.internal.operators.observable.BlockingObservableIterable$BlockingObservableIterator
            int r1 = r2.bufferSize
            r0.<init>(r1)
            io.reactivex.ObservableSource<? extends T> r1 = r2.source
            r1.subscribe(r0)
            return r0
    }
}
