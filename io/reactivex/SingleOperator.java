package io.reactivex;

/* loaded from: classes.dex */
public interface SingleOperator<Downstream, Upstream> {
    io.reactivex.SingleObserver<? super Upstream> apply(io.reactivex.SingleObserver<? super Downstream> r1) throws java.lang.Exception;
}
