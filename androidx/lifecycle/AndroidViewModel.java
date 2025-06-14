package androidx.lifecycle;

/* loaded from: classes.dex */
public class AndroidViewModel extends androidx.lifecycle.ViewModel {
    private android.app.Application mApplication;

    public AndroidViewModel(android.app.Application r1) {
            r0 = this;
            r0.<init>()
            r0.mApplication = r1
            return
    }

    public <T extends android.app.Application> T getApplication() {
            r1 = this;
            android.app.Application r0 = r1.mApplication
            return r0
    }
}
