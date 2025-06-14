package okhttp3;

/* loaded from: classes.dex */
public interface CookieJar {
    public static final okhttp3.CookieJar NO_COOKIES = null;


    static {
            okhttp3.CookieJar$1 r0 = new okhttp3.CookieJar$1
            r0.<init>()
            okhttp3.CookieJar.NO_COOKIES = r0
            return
    }

    java.util.List<okhttp3.Cookie> loadForRequest(okhttp3.HttpUrl r1);

    void saveFromResponse(okhttp3.HttpUrl r1, java.util.List<okhttp3.Cookie> r2);
}
