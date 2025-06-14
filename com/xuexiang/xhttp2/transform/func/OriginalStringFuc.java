package com.xuexiang.xhttp2.transform.func;

/* loaded from: classes.dex */
public class OriginalStringFuc implements io.reactivex.functions.Function<okhttp3.ResponseBody, java.lang.String> {
    public OriginalStringFuc() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.functions.Function
    public /* bridge */ /* synthetic */ java.lang.String apply(okhttp3.ResponseBody r1) throws java.lang.Exception {
            r0 = this;
            okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
            java.lang.String r1 = r0.apply2(r1)
            return r1
    }

    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public java.lang.String apply2(okhttp3.ResponseBody r1) throws java.lang.Exception {
            r0 = this;
            java.lang.String r1 = r1.string()     // Catch: java.io.IOException -> L5
            return r1
        L5:
            r1 = move-exception
            r1.printStackTrace()
            java.lang.String r1 = ""
            return r1
    }
}
