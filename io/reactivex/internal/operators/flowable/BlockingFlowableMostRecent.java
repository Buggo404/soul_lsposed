package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class BlockingFlowableMostRecent<T> implements java.lang.Iterable<T> {
    final T initialValue;
    final io.reactivex.Flowable<T> source;

    static final class MostRecentSubscriber<T> extends io.reactivex.subscribers.DefaultSubscriber<T> {
        volatile java.lang.Object value;

        final class Iterator implements java.util.Iterator<T> {
            private java.lang.Object buf;
            final /* synthetic */ io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent.MostRecentSubscriber this$0;

            Iterator(io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent.MostRecentSubscriber r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent$MostRecentSubscriber r0 = r1.this$0
                    java.lang.Object r0 = r0.value
                    r1.buf = r0
                    boolean r0 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
                    r0 = r0 ^ 1
                    return r0
            }

            @Override // java.util.Iterator
            public T next() {
                    r2 = this;
                    r0 = 0
                    java.lang.Object r1 = r2.buf     // Catch: java.lang.Throwable -> L35
                    if (r1 != 0) goto Lb
                    io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent$MostRecentSubscriber r1 = r2.this$0     // Catch: java.lang.Throwable -> L35
                    java.lang.Object r1 = r1.value     // Catch: java.lang.Throwable -> L35
                    r2.buf = r1     // Catch: java.lang.Throwable -> L35
                Lb:
                    java.lang.Object r1 = r2.buf     // Catch: java.lang.Throwable -> L35
                    boolean r1 = io.reactivex.internal.util.NotificationLite.isComplete(r1)     // Catch: java.lang.Throwable -> L35
                    if (r1 != 0) goto L2f
                    java.lang.Object r1 = r2.buf     // Catch: java.lang.Throwable -> L35
                    boolean r1 = io.reactivex.internal.util.NotificationLite.isError(r1)     // Catch: java.lang.Throwable -> L35
                    if (r1 != 0) goto L24
                    java.lang.Object r1 = r2.buf     // Catch: java.lang.Throwable -> L35
                    java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.getValue(r1)     // Catch: java.lang.Throwable -> L35
                    r2.buf = r0
                    return r1
                L24:
                    java.lang.Object r1 = r2.buf     // Catch: java.lang.Throwable -> L35
                    java.lang.Throwable r1 = io.reactivex.internal.util.NotificationLite.getError(r1)     // Catch: java.lang.Throwable -> L35
                    java.lang.RuntimeException r1 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r1)     // Catch: java.lang.Throwable -> L35
                    throw r1     // Catch: java.lang.Throwable -> L35
                L2f:
                    java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L35
                    r1.<init>()     // Catch: java.lang.Throwable -> L35
                    throw r1     // Catch: java.lang.Throwable -> L35
                L35:
                    r1 = move-exception
                    r2.buf = r0
                    throw r1
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

        MostRecentSubscriber(T r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.next(r1)
                r0.value = r1
                return
        }

        public io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent.MostRecentSubscriber<T>.Iterator getIterable() {
                r1 = this;
                io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent$MostRecentSubscriber$Iterator r0 = new io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent$MostRecentSubscriber$Iterator
                r0.<init>(r1)
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.complete()
                r1.value = r0
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.error(r1)
                r0.value = r1
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r1) {
                r0 = this;
                java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.next(r1)
                r0.value = r1
                return
        }
    }

    public BlockingFlowableMostRecent(io.reactivex.Flowable<T> r1, T r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.initialValue = r2
            return
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r2 = this;
            io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent$MostRecentSubscriber r0 = new io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent$MostRecentSubscriber
            T r1 = r2.initialValue
            r0.<init>(r1)
            io.reactivex.Flowable<T> r1 = r2.source
            r1.subscribe(r0)
            io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent$MostRecentSubscriber$Iterator r0 = r0.getIterable()
            return r0
    }
}
