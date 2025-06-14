package okhttp3;

/* loaded from: classes.dex */
public interface Callback {
    void onFailure(okhttp3.Call r1, java.io.IOException r2);

    void onResponse(okhttp3.Call r1, okhttp3.Response r2) throws java.io.IOException;
}
