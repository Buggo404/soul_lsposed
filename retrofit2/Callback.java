package retrofit2;

/* loaded from: classes.dex */
public interface Callback<T> {
    void onFailure(retrofit2.Call<T> r1, java.lang.Throwable r2);

    void onResponse(retrofit2.Call<T> r1, retrofit2.Response<T> r2);
}
