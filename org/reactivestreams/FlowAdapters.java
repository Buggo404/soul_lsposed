package org.reactivestreams;

/* loaded from: classes.dex */
public final class FlowAdapters {

    static final class FlowPublisherFromReactive<T> implements java.util.concurrent.Flow.Publisher<T> {
        final org.reactivestreams.Publisher<? extends T> reactiveStreams;

        public FlowPublisherFromReactive(org.reactivestreams.Publisher<? extends T> r1) {
                r0 = this;
                r0.<init>()
                r0.reactiveStreams = r1
                return
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(java.util.concurrent.Flow.Subscriber<? super T> r3) {
                r2 = this;
                org.reactivestreams.Publisher<? extends T> r0 = r2.reactiveStreams
                if (r3 != 0) goto L6
                r3 = 0
                goto Lc
            L6:
                org.reactivestreams.FlowAdapters$ReactiveToFlowSubscriber r1 = new org.reactivestreams.FlowAdapters$ReactiveToFlowSubscriber
                r1.<init>(r3)
                r3 = r1
            Lc:
                r0.subscribe(r3)
                return
        }
    }

    static final class FlowToReactiveProcessor<T, U> implements java.util.concurrent.Flow.Processor<T, U> {
        final org.reactivestreams.Processor<? super T, ? extends U> reactiveStreams;

        public FlowToReactiveProcessor(org.reactivestreams.Processor<? super T, ? extends U> r1) {
                r0 = this;
                r0.<init>()
                r0.reactiveStreams = r1
                return
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
                r1 = this;
                org.reactivestreams.Processor<? super T, ? extends U> r0 = r1.reactiveStreams
                r0.onComplete()
                return
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Processor<? super T, ? extends U> r0 = r1.reactiveStreams
                r0.onError(r2)
                return
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(T r2) {
                r1 = this;
                org.reactivestreams.Processor<? super T, ? extends U> r0 = r1.reactiveStreams
                r0.onNext(r2)
                return
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(java.util.concurrent.Flow.Subscription r3) {
                r2 = this;
                org.reactivestreams.Processor<? super T, ? extends U> r0 = r2.reactiveStreams
                if (r3 != 0) goto L6
                r3 = 0
                goto Lc
            L6:
                org.reactivestreams.FlowAdapters$ReactiveToFlowSubscription r1 = new org.reactivestreams.FlowAdapters$ReactiveToFlowSubscription
                r1.<init>(r3)
                r3 = r1
            Lc:
                r0.onSubscribe(r3)
                return
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(java.util.concurrent.Flow.Subscriber<? super U> r3) {
                r2 = this;
                org.reactivestreams.Processor<? super T, ? extends U> r0 = r2.reactiveStreams
                if (r3 != 0) goto L6
                r3 = 0
                goto Lc
            L6:
                org.reactivestreams.FlowAdapters$ReactiveToFlowSubscriber r1 = new org.reactivestreams.FlowAdapters$ReactiveToFlowSubscriber
                r1.<init>(r3)
                r3 = r1
            Lc:
                r0.subscribe(r3)
                return
        }
    }

    static final class FlowToReactiveSubscriber<T> implements java.util.concurrent.Flow.Subscriber<T> {
        final org.reactivestreams.Subscriber<? super T> reactiveStreams;

        public FlowToReactiveSubscriber(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.reactiveStreams = r1
                return
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.reactiveStreams
                r0.onComplete()
                return
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.reactiveStreams
                r0.onError(r2)
                return
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(T r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.reactiveStreams
                r0.onNext(r2)
                return
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(java.util.concurrent.Flow.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r2.reactiveStreams
                if (r3 != 0) goto L6
                r3 = 0
                goto Lc
            L6:
                org.reactivestreams.FlowAdapters$ReactiveToFlowSubscription r1 = new org.reactivestreams.FlowAdapters$ReactiveToFlowSubscription
                r1.<init>(r3)
                r3 = r1
            Lc:
                r0.onSubscribe(r3)
                return
        }
    }

    static final class FlowToReactiveSubscription implements java.util.concurrent.Flow.Subscription {
        final org.reactivestreams.Subscription reactiveStreams;

        public FlowToReactiveSubscription(org.reactivestreams.Subscription r1) {
                r0 = this;
                r0.<init>()
                r0.reactiveStreams = r1
                return
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.reactiveStreams
                r0.cancel()
                return
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.reactiveStreams
                r0.request(r2)
                return
        }
    }

    static final class ReactivePublisherFromFlow<T> implements org.reactivestreams.Publisher<T> {
        final java.util.concurrent.Flow.Publisher<? extends T> flow;

        public ReactivePublisherFromFlow(java.util.concurrent.Flow.Publisher<? extends T> r1) {
                r0 = this;
                r0.<init>()
                r0.flow = r1
                return
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(org.reactivestreams.Subscriber<? super T> r3) {
                r2 = this;
                java.util.concurrent.Flow$Publisher<? extends T> r0 = r2.flow
                if (r3 != 0) goto L6
                r3 = 0
                goto Lc
            L6:
                org.reactivestreams.FlowAdapters$FlowToReactiveSubscriber r1 = new org.reactivestreams.FlowAdapters$FlowToReactiveSubscriber
                r1.<init>(r3)
                r3 = r1
            Lc:
                r0.subscribe(r3)
                return
        }
    }

    static final class ReactiveToFlowProcessor<T, U> implements org.reactivestreams.Processor<T, U> {
        final java.util.concurrent.Flow.Processor<? super T, ? extends U> flow;

        public ReactiveToFlowProcessor(java.util.concurrent.Flow.Processor<? super T, ? extends U> r1) {
                r0 = this;
                r0.<init>()
                r0.flow = r1
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                java.util.concurrent.Flow$Processor<? super T, ? extends U> r0 = r1.flow
                r0.onComplete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.Flow$Processor<? super T, ? extends U> r0 = r1.flow
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                java.util.concurrent.Flow$Processor<? super T, ? extends U> r0 = r1.flow
                r0.onNext(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                java.util.concurrent.Flow$Processor<? super T, ? extends U> r0 = r2.flow
                if (r3 != 0) goto L6
                r3 = 0
                goto Lc
            L6:
                org.reactivestreams.FlowAdapters$FlowToReactiveSubscription r1 = new org.reactivestreams.FlowAdapters$FlowToReactiveSubscription
                r1.<init>(r3)
                r3 = r1
            Lc:
                r0.onSubscribe(r3)
                return
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(org.reactivestreams.Subscriber<? super U> r3) {
                r2 = this;
                java.util.concurrent.Flow$Processor<? super T, ? extends U> r0 = r2.flow
                if (r3 != 0) goto L6
                r3 = 0
                goto Lc
            L6:
                org.reactivestreams.FlowAdapters$FlowToReactiveSubscriber r1 = new org.reactivestreams.FlowAdapters$FlowToReactiveSubscriber
                r1.<init>(r3)
                r3 = r1
            Lc:
                r0.subscribe(r3)
                return
        }
    }

    static final class ReactiveToFlowSubscriber<T> implements org.reactivestreams.Subscriber<T> {
        final java.util.concurrent.Flow.Subscriber<? super T> flow;

        public ReactiveToFlowSubscriber(java.util.concurrent.Flow.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.flow = r1
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                java.util.concurrent.Flow$Subscriber<? super T> r0 = r1.flow
                r0.onComplete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.Flow$Subscriber<? super T> r0 = r1.flow
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                java.util.concurrent.Flow$Subscriber<? super T> r0 = r1.flow
                r0.onNext(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                java.util.concurrent.Flow$Subscriber<? super T> r0 = r2.flow
                if (r3 != 0) goto L6
                r3 = 0
                goto Lc
            L6:
                org.reactivestreams.FlowAdapters$FlowToReactiveSubscription r1 = new org.reactivestreams.FlowAdapters$FlowToReactiveSubscription
                r1.<init>(r3)
                r3 = r1
            Lc:
                r0.onSubscribe(r3)
                return
        }
    }

    static final class ReactiveToFlowSubscription implements org.reactivestreams.Subscription {
        final java.util.concurrent.Flow.Subscription flow;

        public ReactiveToFlowSubscription(java.util.concurrent.Flow.Subscription r1) {
                r0 = this;
                r0.<init>()
                r0.flow = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                java.util.concurrent.Flow$Subscription r0 = r1.flow
                r0.cancel()
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                java.util.concurrent.Flow$Subscription r0 = r1.flow
                r0.request(r2)
                return
        }
    }

    private FlowAdapters() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T, U> java.util.concurrent.Flow.Processor<T, U> toFlowProcessor(org.reactivestreams.Processor<? super T, ? extends U> r1) {
            java.lang.String r0 = "reactiveStreamsProcessor"
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof org.reactivestreams.FlowAdapters.ReactiveToFlowProcessor
            if (r0 == 0) goto Le
            org.reactivestreams.FlowAdapters$ReactiveToFlowProcessor r1 = (org.reactivestreams.FlowAdapters.ReactiveToFlowProcessor) r1
            java.util.concurrent.Flow$Processor<? super T, ? extends U> r1 = r1.flow
            goto L1b
        Le:
            boolean r0 = r1 instanceof java.util.concurrent.Flow.Processor
            if (r0 == 0) goto L15
            java.util.concurrent.Flow$Processor r1 = (java.util.concurrent.Flow.Processor) r1
            goto L1b
        L15:
            org.reactivestreams.FlowAdapters$FlowToReactiveProcessor r0 = new org.reactivestreams.FlowAdapters$FlowToReactiveProcessor
            r0.<init>(r1)
            r1 = r0
        L1b:
            return r1
    }

    public static <T> java.util.concurrent.Flow.Publisher<T> toFlowPublisher(org.reactivestreams.Publisher<? extends T> r1) {
            java.lang.String r0 = "reactiveStreamsPublisher"
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof org.reactivestreams.FlowAdapters.ReactivePublisherFromFlow
            if (r0 == 0) goto Le
            org.reactivestreams.FlowAdapters$ReactivePublisherFromFlow r1 = (org.reactivestreams.FlowAdapters.ReactivePublisherFromFlow) r1
            java.util.concurrent.Flow$Publisher<? extends T> r1 = r1.flow
            goto L1b
        Le:
            boolean r0 = r1 instanceof java.util.concurrent.Flow.Publisher
            if (r0 == 0) goto L15
            java.util.concurrent.Flow$Publisher r1 = (java.util.concurrent.Flow.Publisher) r1
            goto L1b
        L15:
            org.reactivestreams.FlowAdapters$FlowPublisherFromReactive r0 = new org.reactivestreams.FlowAdapters$FlowPublisherFromReactive
            r0.<init>(r1)
            r1 = r0
        L1b:
            return r1
    }

    public static <T> java.util.concurrent.Flow.Subscriber<T> toFlowSubscriber(org.reactivestreams.Subscriber<T> r1) {
            java.lang.String r0 = "reactiveStreamsSubscriber"
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof org.reactivestreams.FlowAdapters.ReactiveToFlowSubscriber
            if (r0 == 0) goto Le
            org.reactivestreams.FlowAdapters$ReactiveToFlowSubscriber r1 = (org.reactivestreams.FlowAdapters.ReactiveToFlowSubscriber) r1
            java.util.concurrent.Flow$Subscriber<? super T> r1 = r1.flow
            goto L1b
        Le:
            boolean r0 = r1 instanceof java.util.concurrent.Flow.Subscriber
            if (r0 == 0) goto L15
            java.util.concurrent.Flow$Subscriber r1 = (java.util.concurrent.Flow.Subscriber) r1
            goto L1b
        L15:
            org.reactivestreams.FlowAdapters$FlowToReactiveSubscriber r0 = new org.reactivestreams.FlowAdapters$FlowToReactiveSubscriber
            r0.<init>(r1)
            r1 = r0
        L1b:
            return r1
    }

    public static <T, U> org.reactivestreams.Processor<T, U> toProcessor(java.util.concurrent.Flow.Processor<? super T, ? extends U> r1) {
            java.lang.String r0 = "flowProcessor"
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof org.reactivestreams.FlowAdapters.FlowToReactiveProcessor
            if (r0 == 0) goto Le
            org.reactivestreams.FlowAdapters$FlowToReactiveProcessor r1 = (org.reactivestreams.FlowAdapters.FlowToReactiveProcessor) r1
            org.reactivestreams.Processor<? super T, ? extends U> r1 = r1.reactiveStreams
            goto L1b
        Le:
            boolean r0 = r1 instanceof org.reactivestreams.Processor
            if (r0 == 0) goto L15
            org.reactivestreams.Processor r1 = (org.reactivestreams.Processor) r1
            goto L1b
        L15:
            org.reactivestreams.FlowAdapters$ReactiveToFlowProcessor r0 = new org.reactivestreams.FlowAdapters$ReactiveToFlowProcessor
            r0.<init>(r1)
            r1 = r0
        L1b:
            return r1
    }

    public static <T> org.reactivestreams.Publisher<T> toPublisher(java.util.concurrent.Flow.Publisher<? extends T> r1) {
            java.lang.String r0 = "flowPublisher"
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof org.reactivestreams.FlowAdapters.FlowPublisherFromReactive
            if (r0 == 0) goto Le
            org.reactivestreams.FlowAdapters$FlowPublisherFromReactive r1 = (org.reactivestreams.FlowAdapters.FlowPublisherFromReactive) r1
            org.reactivestreams.Publisher<? extends T> r1 = r1.reactiveStreams
            goto L1b
        Le:
            boolean r0 = r1 instanceof org.reactivestreams.Publisher
            if (r0 == 0) goto L15
            org.reactivestreams.Publisher r1 = (org.reactivestreams.Publisher) r1
            goto L1b
        L15:
            org.reactivestreams.FlowAdapters$ReactivePublisherFromFlow r0 = new org.reactivestreams.FlowAdapters$ReactivePublisherFromFlow
            r0.<init>(r1)
            r1 = r0
        L1b:
            return r1
    }

    public static <T> org.reactivestreams.Subscriber<T> toSubscriber(java.util.concurrent.Flow.Subscriber<T> r1) {
            java.lang.String r0 = "flowSubscriber"
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof org.reactivestreams.FlowAdapters.FlowToReactiveSubscriber
            if (r0 == 0) goto Le
            org.reactivestreams.FlowAdapters$FlowToReactiveSubscriber r1 = (org.reactivestreams.FlowAdapters.FlowToReactiveSubscriber) r1
            org.reactivestreams.Subscriber<? super T> r1 = r1.reactiveStreams
            goto L1b
        Le:
            boolean r0 = r1 instanceof org.reactivestreams.Subscriber
            if (r0 == 0) goto L15
            org.reactivestreams.Subscriber r1 = (org.reactivestreams.Subscriber) r1
            goto L1b
        L15:
            org.reactivestreams.FlowAdapters$ReactiveToFlowSubscriber r0 = new org.reactivestreams.FlowAdapters$ReactiveToFlowSubscriber
            r0.<init>(r1)
            r1 = r0
        L1b:
            return r1
    }
}
