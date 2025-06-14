package androidx.activity.result;

/* loaded from: classes.dex */
public interface ActivityResultCaller {
    <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> r1, androidx.activity.result.ActivityResultCallback<O> r2);

    <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> r1, androidx.activity.result.ActivityResultRegistry r2, androidx.activity.result.ActivityResultCallback<O> r3);
}
