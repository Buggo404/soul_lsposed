package retrofit2.adapter.rxjava2;

/* loaded from: classes.dex */
public final class Result<T> {

    @javax.annotation.Nullable
    private final java.lang.Throwable error;

    @javax.annotation.Nullable
    private final retrofit2.Response<T> response;

    private Result(@javax.annotation.Nullable retrofit2.Response<T> r1, @javax.annotation.Nullable java.lang.Throwable r2) {
            r0 = this;
            r0.<init>()
            r0.response = r1
            r0.error = r2
            return
    }

    public static <T> retrofit2.adapter.rxjava2.Result<T> error(java.lang.Throwable r2) {
            if (r2 == 0) goto L9
            retrofit2.adapter.rxjava2.Result r0 = new retrofit2.adapter.rxjava2.Result
            r1 = 0
            r0.<init>(r1, r2)
            return r0
        L9:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "error == null"
            r2.<init>(r0)
            throw r2
    }

    public static <T> retrofit2.adapter.rxjava2.Result<T> response(retrofit2.Response<T> r2) {
            if (r2 == 0) goto L9
            retrofit2.adapter.rxjava2.Result r0 = new retrofit2.adapter.rxjava2.Result
            r1 = 0
            r0.<init>(r2, r1)
            return r0
        L9:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "response == null"
            r2.<init>(r0)
            throw r2
    }

    @javax.annotation.Nullable
    public java.lang.Throwable error() {
            r1 = this;
            java.lang.Throwable r0 = r1.error
            return r0
    }

    public boolean isError() {
            r1 = this;
            java.lang.Throwable r0 = r1.error
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @javax.annotation.Nullable
    public retrofit2.Response<T> response() {
            r1 = this;
            retrofit2.Response<T> r0 = r1.response
            return r0
    }
}
