package okhttp3;

/* loaded from: classes.dex */
public interface Authenticator {
    public static final okhttp3.Authenticator NONE = null;

    static {
            okhttp3.Authenticator$$ExternalSyntheticLambda0 r0 = new okhttp3.Authenticator$$ExternalSyntheticLambda0
            r0.<init>()
            okhttp3.Authenticator.NONE = r0
            return
    }

    static /* synthetic */ okhttp3.Request lambda$static$0(okhttp3.Route r0, okhttp3.Response r1) throws java.io.IOException {
            r0 = 0
            return r0
    }

    @javax.annotation.Nullable
    okhttp3.Request authenticate(@javax.annotation.Nullable okhttp3.Route r1, okhttp3.Response r2) throws java.io.IOException;
}
