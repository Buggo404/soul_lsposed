package io.reactivex.flowables;

/* loaded from: classes.dex */
public abstract class GroupedFlowable<K, T> extends io.reactivex.Flowable<T> {
    final K key;

    protected GroupedFlowable(K r1) {
            r0 = this;
            r0.<init>()
            r0.key = r1
            return
    }

    public K getKey() {
            r1 = this;
            K r0 = r1.key
            return r0
    }
}
