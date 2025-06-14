package androidx.activity.result.contract;

/* loaded from: classes.dex */
public abstract class ActivityResultContract<I, O> {

    public static final class SynchronousResult<T> {
        private final T mValue;

        public SynchronousResult(T r1) {
                r0 = this;
                r0.<init>()
                r0.mValue = r1
                return
        }

        public T getValue() {
                r1 = this;
                T r0 = r1.mValue
                return r0
        }
    }

    public ActivityResultContract() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract android.content.Intent createIntent(android.content.Context r1, I r2);

    public androidx.activity.result.contract.ActivityResultContract.SynchronousResult<O> getSynchronousResult(android.content.Context r1, I r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public abstract O parseResult(int r1, android.content.Intent r2);
}
