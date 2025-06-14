package io.reactivex;

/* loaded from: classes.dex */
public interface MaybeOperator<Downstream, Upstream> {
    io.reactivex.MaybeObserver<? super Upstream> apply(io.reactivex.MaybeObserver<? super Downstream> r1) throws java.lang.Exception;
}
