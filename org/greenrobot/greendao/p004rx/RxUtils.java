package org.greenrobot.greendao.p004rx;

/* loaded from: classes.dex */
class RxUtils {


    RxUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static <T> rx.Observable<T> fromCallable(java.util.concurrent.Callable<T> r1) {
            org.greenrobot.greendao.rx.RxUtils$1 r0 = new org.greenrobot.greendao.rx.RxUtils$1
            r0.<init>(r1)
            rx.Observable r1 = rx.Observable.defer(r0)
            return r1
    }
}
