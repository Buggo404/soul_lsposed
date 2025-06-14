package io.reactivex;

/* loaded from: classes.dex */
public interface ObservableConverter<T, R> {
    R apply(io.reactivex.Observable<T> r1);
}
