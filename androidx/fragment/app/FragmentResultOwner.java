package androidx.fragment.app;

/* loaded from: classes.dex */
public interface FragmentResultOwner {
    void clearFragmentResult(java.lang.String r1);

    void clearFragmentResultListener(java.lang.String r1);

    void setFragmentResult(java.lang.String r1, android.os.Bundle r2);

    void setFragmentResultListener(java.lang.String r1, androidx.lifecycle.LifecycleOwner r2, androidx.fragment.app.FragmentResultListener r3);
}
