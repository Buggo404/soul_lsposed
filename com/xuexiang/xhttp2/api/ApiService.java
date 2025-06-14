package com.xuexiang.xhttp2.api;

/* loaded from: classes.dex */
public interface ApiService {
    @retrofit2.http.DELETE
    io.reactivex.Observable<okhttp3.ResponseBody> delete(@retrofit2.http.Url java.lang.String r1, @retrofit2.http.QueryMap java.util.Map<java.lang.String, java.lang.Object> r2);

    @retrofit2.http.DELETE
    io.reactivex.Observable<okhttp3.ResponseBody> deleteBody(@retrofit2.http.Url java.lang.String r1, @retrofit2.http.Body java.lang.Object r2);

    @retrofit2.http.DELETE
    io.reactivex.Observable<okhttp3.ResponseBody> deleteBody(@retrofit2.http.Url java.lang.String r1, @retrofit2.http.Body okhttp3.RequestBody r2);

    @retrofit2.http.DELETE
    @retrofit2.http.Headers({"Content-Type: application/json", "Accept: application/json"})
    io.reactivex.Observable<okhttp3.ResponseBody> deleteJson(@retrofit2.http.Url java.lang.String r1, @retrofit2.http.Body okhttp3.RequestBody r2);

    @retrofit2.http.Streaming
    @retrofit2.http.GET
    io.reactivex.Observable<okhttp3.ResponseBody> downloadFile(@retrofit2.http.Url java.lang.String r1);

    @retrofit2.http.GET
    io.reactivex.Observable<okhttp3.ResponseBody> get(@retrofit2.http.Url java.lang.String r1, @retrofit2.http.QueryMap java.util.Map<java.lang.String, java.lang.Object> r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST
    io.reactivex.Observable<okhttp3.ResponseBody> post(@retrofit2.http.Url java.lang.String r1, @retrofit2.http.FieldMap java.util.Map<java.lang.String, java.lang.Object> r2);

    @retrofit2.http.POST
    io.reactivex.Observable<okhttp3.ResponseBody> postBody(@retrofit2.http.Url java.lang.String r1, @retrofit2.http.Body java.lang.Object r2);

    @retrofit2.http.POST
    io.reactivex.Observable<okhttp3.ResponseBody> postBody(@retrofit2.http.Url java.lang.String r1, @retrofit2.http.Body okhttp3.RequestBody r2);

    @retrofit2.http.Headers({"Content-Type: application/json", "Accept: application/json"})
    @retrofit2.http.POST
    io.reactivex.Observable<okhttp3.ResponseBody> postJson(@retrofit2.http.Url java.lang.String r1, @retrofit2.http.Body okhttp3.RequestBody r2);

    @retrofit2.http.PUT
    io.reactivex.Observable<okhttp3.ResponseBody> put(@retrofit2.http.Url java.lang.String r1, @retrofit2.http.QueryMap java.util.Map<java.lang.String, java.lang.Object> r2);

    @retrofit2.http.PUT
    io.reactivex.Observable<okhttp3.ResponseBody> putBody(@retrofit2.http.Url java.lang.String r1, @retrofit2.http.Body java.lang.Object r2);

    @retrofit2.http.PUT
    io.reactivex.Observable<okhttp3.ResponseBody> putBody(@retrofit2.http.Url java.lang.String r1, @retrofit2.http.Body okhttp3.RequestBody r2);

    @retrofit2.http.Headers({"Content-Type: application/json", "Accept: application/json"})
    @retrofit2.http.PUT
    io.reactivex.Observable<okhttp3.ResponseBody> putJson(@retrofit2.http.Url java.lang.String r1, @retrofit2.http.Body okhttp3.RequestBody r2);

    @retrofit2.http.POST
    @retrofit2.http.Multipart
    io.reactivex.Observable<okhttp3.ResponseBody> uploadFiles(@retrofit2.http.Url java.lang.String r1, @retrofit2.http.Part java.util.List<okhttp3.MultipartBody.Part> r2);

    @retrofit2.http.POST
    @retrofit2.http.Multipart
    io.reactivex.Observable<okhttp3.ResponseBody> uploadFiles(@retrofit2.http.Url java.lang.String r1, @retrofit2.http.PartMap java.util.Map<java.lang.String, okhttp3.RequestBody> r2);
}
