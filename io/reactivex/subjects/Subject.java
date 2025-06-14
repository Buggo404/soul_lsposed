package io.reactivex.subjects;

/* loaded from: classes.dex */
public abstract class Subject<T> extends io.reactivex.Observable<T> implements io.reactivex.Observer<T> {
    public Subject() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.lang.Throwable getThrowable();

    public abstract boolean hasComplete();

    public abstract boolean hasObservers();

    public abstract boolean hasThrowable();

    public final io.reactivex.subjects.Subject<T> toSerialized() {
            r1 = this;
            boolean r0 = r1 instanceof io.reactivex.subjects.SerializedSubject
            if (r0 == 0) goto L5
            return r1
        L5:
            io.reactivex.subjects.SerializedSubject r0 = new io.reactivex.subjects.SerializedSubject
            r0.<init>(r1)
            return r0
    }
}
