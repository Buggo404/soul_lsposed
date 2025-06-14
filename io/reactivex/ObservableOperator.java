package io.reactivex;

/* loaded from: classes.dex */
public interface ObservableOperator<Downstream, Upstream> {
    io.reactivex.Observer<? super Upstream> apply(io.reactivex.Observer<? super Downstream> r1) throws java.lang.Exception;
}
