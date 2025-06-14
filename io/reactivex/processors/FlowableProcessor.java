package io.reactivex.processors;

/* loaded from: classes.dex */
public abstract class FlowableProcessor<T> extends io.reactivex.Flowable<T> implements org.reactivestreams.Processor<T, T>, io.reactivex.FlowableSubscriber<T> {
    public FlowableProcessor() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.lang.Throwable getThrowable();

    public abstract boolean hasComplete();

    public abstract boolean hasSubscribers();

    public abstract boolean hasThrowable();

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.processors.FlowableProcessor<T> toSerialized() {
            r1 = this;
            boolean r0 = r1 instanceof io.reactivex.processors.SerializedProcessor
            if (r0 == 0) goto L5
            return r1
        L5:
            io.reactivex.processors.SerializedProcessor r0 = new io.reactivex.processors.SerializedProcessor
            r0.<init>(r1)
            return r0
    }
}
