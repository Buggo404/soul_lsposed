package io.reactivex;

/* loaded from: classes.dex */
public interface SingleTransformer<Upstream, Downstream> {
    io.reactivex.SingleSource<Downstream> apply(io.reactivex.Single<Upstream> r1);
}
