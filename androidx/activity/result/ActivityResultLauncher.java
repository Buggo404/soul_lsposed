package androidx.activity.result;

/* loaded from: classes.dex */
public abstract class ActivityResultLauncher<I> {
    public ActivityResultLauncher() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract androidx.activity.result.contract.ActivityResultContract<I, ?> getContract();

    public void launch(I r2) {
            r1 = this;
            r0 = 0
            r1.launch(r2, r0)
            return
    }

    public abstract void launch(I r1, androidx.core.app.ActivityOptionsCompat r2);

    public abstract void unregister();
}
