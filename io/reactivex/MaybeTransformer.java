package io.reactivex;

/* loaded from: classes.dex */
public interface MaybeTransformer<Upstream, Downstream> {
    io.reactivex.MaybeSource<Downstream> apply(io.reactivex.Maybe<Upstream> r1);
}
