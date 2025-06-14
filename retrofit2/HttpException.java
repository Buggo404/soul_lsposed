package retrofit2;

/* loaded from: classes.dex */
public class HttpException extends java.lang.RuntimeException {
    private final int code;
    private final java.lang.String message;
    private final transient retrofit2.Response<?> response;

    public HttpException(retrofit2.Response<?> r2) {
            r1 = this;
            java.lang.String r0 = getMessage(r2)
            r1.<init>(r0)
            int r0 = r2.code()
            r1.code = r0
            java.lang.String r0 = r2.message()
            r1.message = r0
            r1.response = r2
            return
    }

    private static java.lang.String getMessage(retrofit2.Response<?> r2) {
            java.lang.String r0 = "response == null"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HTTP "
            r0.<init>(r1)
            int r1 = r2.code()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r2.message()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public int code() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    public java.lang.String message() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    @javax.annotation.Nullable
    public retrofit2.Response<?> response() {
            r1 = this;
            retrofit2.Response<?> r0 = r1.response
            return r0
    }
}
