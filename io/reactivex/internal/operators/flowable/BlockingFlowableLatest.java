package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class BlockingFlowableLatest<T> implements java.lang.Iterable<T> {
    final org.reactivestreams.Publisher<? extends T> source;

    static final class LatestSubscriberIterator<T> extends io.reactivex.subscribers.DisposableSubscriber<io.reactivex.Notification<T>> implements java.util.Iterator<T> {
        io.reactivex.Notification<T> iteratorNotification;
        final java.util.concurrent.Semaphore notify;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.Notification<T>> value;

        LatestSubscriberIterator() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.Semaphore r0 = new java.util.concurrent.Semaphore
                r1 = 0
                r0.<init>(r1)
                r2.notify = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r2.value = r0
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                io.reactivex.Notification<T> r0 = r2.iteratorNotification
                if (r0 == 0) goto L16
                boolean r0 = r0.isOnError()
                if (r0 != 0) goto Lb
                goto L16
            Lb:
                io.reactivex.Notification<T> r0 = r2.iteratorNotification
                java.lang.Throwable r0 = r0.getError()
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
            L16:
                io.reactivex.Notification<T> r0 = r2.iteratorNotification
                if (r0 == 0) goto L20
                boolean r0 = r0.isOnNext()
                if (r0 == 0) goto L56
            L20:
                io.reactivex.Notification<T> r0 = r2.iteratorNotification
                if (r0 != 0) goto L56
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()     // Catch: java.lang.InterruptedException -> L47
                java.util.concurrent.Semaphore r0 = r2.notify     // Catch: java.lang.InterruptedException -> L47
                r0.acquire()     // Catch: java.lang.InterruptedException -> L47
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Notification<T>> r0 = r2.value
                r1 = 0
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.Notification r0 = (io.reactivex.Notification) r0
                r2.iteratorNotification = r0
                boolean r1 = r0.isOnError()
                if (r1 != 0) goto L3e
                goto L56
            L3e:
                java.lang.Throwable r0 = r0.getError()
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
            L47:
                r0 = move-exception
                r2.dispose()
                io.reactivex.Notification r1 = io.reactivex.Notification.createOnError(r0)
                r2.iteratorNotification = r1
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
            L56:
                io.reactivex.Notification<T> r0 = r2.iteratorNotification
                boolean r0 = r0.isOnNext()
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L18
                io.reactivex.Notification<T> r0 = r2.iteratorNotification
                boolean r0 = r0.isOnNext()
                if (r0 == 0) goto L18
                io.reactivex.Notification<T> r0 = r2.iteratorNotification
                java.lang.Object r0 = r0.getValue()
                r1 = 0
                r2.iteratorNotification = r1
                return r0
            L18:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r0 = this;
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                io.reactivex.plugins.RxJavaPlugins.onError(r1)
                return
        }

        public void onNext(io.reactivex.Notification<T> r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Notification<T>> r0 = r1.value
                java.lang.Object r2 = r0.getAndSet(r2)
                if (r2 != 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                if (r2 == 0) goto L12
                java.util.concurrent.Semaphore r2 = r1.notify
                r2.release()
            L12:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                io.reactivex.Notification r1 = (io.reactivex.Notification) r1
                r0.onNext(r1)
                return
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Read-only iterator."
                r0.<init>(r1)
                throw r0
        }
    }

    public BlockingFlowableLatest(org.reactivestreams.Publisher<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r2 = this;
            io.reactivex.internal.operators.flowable.BlockingFlowableLatest$LatestSubscriberIterator r0 = new io.reactivex.internal.operators.flowable.BlockingFlowableLatest$LatestSubscriberIterator
            r0.<init>()
            org.reactivestreams.Publisher<? extends T> r1 = r2.source
            io.reactivex.Flowable r1 = io.reactivex.Flowable.fromPublisher(r1)
            io.reactivex.Flowable r1 = r1.materialize()
            r1.subscribe(r0)
            return r0
    }
}
