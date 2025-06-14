package androidx.lifecycle;

/* loaded from: classes.dex */
public class MutableLiveData<T> extends androidx.lifecycle.LiveData<T> {
    public MutableLiveData() {
            r0 = this;
            r0.<init>()
            return
    }

    public MutableLiveData(T r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // androidx.lifecycle.LiveData
    public void postValue(T r1) {
            r0 = this;
            super.postValue(r1)
            return
    }

    @Override // androidx.lifecycle.LiveData
    public void setValue(T r1) {
            r0 = this;
            super.setValue(r1)
            return
    }
}
