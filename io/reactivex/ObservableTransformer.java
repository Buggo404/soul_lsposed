package io.reactivex;

/* loaded from: classes.dex */
public interface ObservableTransformer<Upstream, Downstream> {
    io.reactivex.ObservableSource<Downstream> apply(io.reactivex.Observable<Upstream> r1);
}
