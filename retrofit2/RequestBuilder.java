package retrofit2;

/* loaded from: classes.dex */
final class RequestBuilder {
    private static final char[] HEX_DIGITS = null;
    private static final java.lang.String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private static final java.util.regex.Pattern PATH_TRAVERSAL = null;
    private final okhttp3.HttpUrl baseUrl;

    @javax.annotation.Nullable
    private okhttp3.RequestBody body;

    @javax.annotation.Nullable
    private okhttp3.MediaType contentType;

    @javax.annotation.Nullable
    private okhttp3.FormBody.Builder formBuilder;
    private final boolean hasBody;
    private final okhttp3.Headers.Builder headersBuilder;
    private final java.lang.String method;

    @javax.annotation.Nullable
    private okhttp3.MultipartBody.Builder multipartBuilder;

    @javax.annotation.Nullable
    private java.lang.String relativeUrl;
    private final okhttp3.Request.Builder requestBuilder;

    @javax.annotation.Nullable
    private okhttp3.HttpUrl.Builder urlBuilder;

    private static class ContentTypeOverridingRequestBody extends okhttp3.RequestBody {
        private final okhttp3.MediaType contentType;
        private final okhttp3.RequestBody delegate;

        ContentTypeOverridingRequestBody(okhttp3.RequestBody r1, okhttp3.MediaType r2) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                r0.contentType = r2
                return
        }

        @Override // okhttp3.RequestBody
        public long contentLength() throws java.io.IOException {
                r2 = this;
                okhttp3.RequestBody r0 = r2.delegate
                long r0 = r0.contentLength()
                return r0
        }

        @Override // okhttp3.RequestBody
        public okhttp3.MediaType contentType() {
                r1 = this;
                okhttp3.MediaType r0 = r1.contentType
                return r0
        }

        @Override // okhttp3.RequestBody
        public void writeTo(okio.BufferedSink r2) throws java.io.IOException {
                r1 = this;
                okhttp3.RequestBody r0 = r1.delegate
                r0.writeTo(r2)
                return
        }
    }

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            retrofit2.RequestBuilder.HEX_DIGITS = r0
            java.lang.String r0 = "(.*/)?(\\.|%2e|%2E){1,2}(/.*)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            retrofit2.RequestBuilder.PATH_TRAVERSAL = r0
            return
    }

    RequestBuilder(java.lang.String r1, okhttp3.HttpUrl r2, @javax.annotation.Nullable java.lang.String r3, @javax.annotation.Nullable okhttp3.Headers r4, @javax.annotation.Nullable okhttp3.MediaType r5, boolean r6, boolean r7, boolean r8) {
            r0 = this;
            r0.<init>()
            r0.method = r1
            r0.baseUrl = r2
            r0.relativeUrl = r3
            okhttp3.Request$Builder r1 = new okhttp3.Request$Builder
            r1.<init>()
            r0.requestBuilder = r1
            r0.contentType = r5
            r0.hasBody = r6
            if (r4 == 0) goto L1d
            okhttp3.Headers$Builder r1 = r4.newBuilder()
            r0.headersBuilder = r1
            goto L24
        L1d:
            okhttp3.Headers$Builder r1 = new okhttp3.Headers$Builder
            r1.<init>()
            r0.headersBuilder = r1
        L24:
            if (r7 == 0) goto L2e
            okhttp3.FormBody$Builder r1 = new okhttp3.FormBody$Builder
            r1.<init>()
            r0.formBuilder = r1
            goto L3c
        L2e:
            if (r8 == 0) goto L3c
            okhttp3.MultipartBody$Builder r1 = new okhttp3.MultipartBody$Builder
            r1.<init>()
            r0.multipartBuilder = r1
            okhttp3.MediaType r2 = okhttp3.MultipartBody.FORM
            r1.setType(r2)
        L3c:
            return
    }

    private static java.lang.String canonicalizeForPath(java.lang.String r6, boolean r7) {
            int r0 = r6.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L3d
            int r3 = r6.codePointAt(r2)
            r4 = 32
            if (r3 < r4) goto L2e
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 >= r4) goto L2e
            java.lang.String r4 = " \"<>^`{}|\\?#"
            int r4 = r4.indexOf(r3)
            r5 = -1
            if (r4 != r5) goto L2e
            if (r7 != 0) goto L28
            r4 = 47
            if (r3 == r4) goto L2e
            r4 = 37
            if (r3 != r4) goto L28
            goto L2e
        L28:
            int r3 = java.lang.Character.charCount(r3)
            int r2 = r2 + r3
            goto L6
        L2e:
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            r3.writeUtf8(r6, r1, r2)
            canonicalizeForPath(r3, r6, r2, r0, r7)
            java.lang.String r6 = r3.readUtf8()
        L3d:
            return r6
    }

    private static void canonicalizeForPath(okio.Buffer r6, java.lang.String r7, int r8, int r9, boolean r10) {
            r0 = 0
        L1:
            if (r8 >= r9) goto L6c
            int r1 = r7.codePointAt(r8)
            if (r10 == 0) goto L1a
            r2 = 9
            if (r1 == r2) goto L66
            r2 = 10
            if (r1 == r2) goto L66
            r2 = 12
            if (r1 == r2) goto L66
            r2 = 13
            if (r1 != r2) goto L1a
            goto L66
        L1a:
            r2 = 32
            r3 = 37
            if (r1 < r2) goto L3a
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 >= r2) goto L3a
            java.lang.String r2 = " \"<>^`{}|\\?#"
            int r2 = r2.indexOf(r1)
            r4 = -1
            if (r2 != r4) goto L3a
            if (r10 != 0) goto L36
            r2 = 47
            if (r1 == r2) goto L3a
            if (r1 != r3) goto L36
            goto L3a
        L36:
            r6.writeUtf8CodePoint(r1)
            goto L66
        L3a:
            if (r0 != 0) goto L41
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
        L41:
            r0.writeUtf8CodePoint(r1)
        L44:
            boolean r2 = r0.exhausted()
            if (r2 != 0) goto L66
            byte r2 = r0.readByte()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r6.writeByte(r3)
            char[] r4 = retrofit2.RequestBuilder.HEX_DIGITS
            int r5 = r2 >> 4
            r5 = r5 & 15
            char r5 = r4[r5]
            r6.writeByte(r5)
            r2 = r2 & 15
            char r2 = r4[r2]
            r6.writeByte(r2)
            goto L44
        L66:
            int r1 = java.lang.Character.charCount(r1)
            int r8 = r8 + r1
            goto L1
        L6c:
            return
    }

    void addFormField(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L8
            okhttp3.FormBody$Builder r3 = r0.formBuilder
            r3.addEncoded(r1, r2)
            goto Ld
        L8:
            okhttp3.FormBody$Builder r3 = r0.formBuilder
            r3.add(r1, r2)
        Ld:
            return
    }

    void addHeader(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "Content-Type"
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L25
            okhttp3.MediaType r4 = okhttp3.MediaType.get(r5)     // Catch: java.lang.IllegalArgumentException -> Lf
            r3.contentType = r4     // Catch: java.lang.IllegalArgumentException -> Lf
            goto L2a
        Lf:
            r4 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Malformed content type: "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5, r4)
            throw r0
        L25:
            okhttp3.Headers$Builder r0 = r3.headersBuilder
            r0.add(r4, r5)
        L2a:
            return
    }

    void addHeaders(okhttp3.Headers r2) {
            r1 = this;
            okhttp3.Headers$Builder r0 = r1.headersBuilder
            r0.addAll(r2)
            return
    }

    void addPart(okhttp3.Headers r2, okhttp3.RequestBody r3) {
            r1 = this;
            okhttp3.MultipartBody$Builder r0 = r1.multipartBuilder
            r0.addPart(r2, r3)
            return
    }

    void addPart(okhttp3.MultipartBody.Part r2) {
            r1 = this;
            okhttp3.MultipartBody$Builder r0 = r1.multipartBuilder
            r0.addPart(r2)
            return
    }

    void addPathParam(java.lang.String r4, java.lang.String r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = r3.relativeUrl
            if (r0 == 0) goto L47
            java.lang.String r6 = canonicalizeForPath(r5, r6)
            java.lang.String r0 = r3.relativeUrl
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "}"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r0.replace(r4, r6)
            java.util.regex.Pattern r6 = retrofit2.RequestBuilder.PATH_TRAVERSAL
            java.util.regex.Matcher r6 = r6.matcher(r4)
            boolean r6 = r6.matches()
            if (r6 != 0) goto L32
            r3.relativeUrl = r4
            return
        L32:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "@Path parameters shouldn't perform path traversal ('.' or '..'): "
            r6.<init>(r0)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L47:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
    }

    void addQueryParam(java.lang.String r3, @javax.annotation.Nullable java.lang.String r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = r2.relativeUrl
            if (r0 == 0) goto L35
            okhttp3.HttpUrl r1 = r2.baseUrl
            okhttp3.HttpUrl$Builder r0 = r1.newBuilder(r0)
            r2.urlBuilder = r0
            if (r0 == 0) goto L12
            r0 = 0
            r2.relativeUrl = r0
            goto L35
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Malformed URL. Base: "
            r4.<init>(r5)
            okhttp3.HttpUrl r5 = r2.baseUrl
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ", Relative: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r2.relativeUrl
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L35:
            if (r5 == 0) goto L3d
            okhttp3.HttpUrl$Builder r5 = r2.urlBuilder
            r5.addEncodedQueryParameter(r3, r4)
            goto L42
        L3d:
            okhttp3.HttpUrl$Builder r5 = r2.urlBuilder
            r5.addQueryParameter(r3, r4)
        L42:
            return
    }

    <T> void addTag(java.lang.Class<T> r2, @javax.annotation.Nullable T r3) {
            r1 = this;
            okhttp3.Request$Builder r0 = r1.requestBuilder
            r0.tag(r2, r3)
            return
    }

    okhttp3.Request.Builder get() {
            r5 = this;
            okhttp3.HttpUrl$Builder r0 = r5.urlBuilder
            if (r0 == 0) goto L9
            okhttp3.HttpUrl r0 = r0.build()
            goto L13
        L9:
            okhttp3.HttpUrl r0 = r5.baseUrl
            java.lang.String r1 = r5.relativeUrl
            okhttp3.HttpUrl r0 = r0.resolve(r1)
            if (r0 == 0) goto L64
        L13:
            okhttp3.RequestBody r1 = r5.body
            if (r1 != 0) goto L35
            okhttp3.FormBody$Builder r2 = r5.formBuilder
            if (r2 == 0) goto L20
            okhttp3.FormBody r1 = r2.build()
            goto L35
        L20:
            okhttp3.MultipartBody$Builder r2 = r5.multipartBuilder
            if (r2 == 0) goto L29
            okhttp3.MultipartBody r1 = r2.build()
            goto L35
        L29:
            boolean r2 = r5.hasBody
            if (r2 == 0) goto L35
            r1 = 0
            byte[] r1 = new byte[r1]
            r2 = 0
            okhttp3.RequestBody r1 = okhttp3.RequestBody.create(r2, r1)
        L35:
            okhttp3.MediaType r2 = r5.contentType
            if (r2 == 0) goto L4d
            if (r1 == 0) goto L42
            retrofit2.RequestBuilder$ContentTypeOverridingRequestBody r3 = new retrofit2.RequestBuilder$ContentTypeOverridingRequestBody
            r3.<init>(r1, r2)
            r1 = r3
            goto L4d
        L42:
            okhttp3.Headers$Builder r3 = r5.headersBuilder
            java.lang.String r4 = "Content-Type"
            java.lang.String r2 = r2.toString()
            r3.add(r4, r2)
        L4d:
            okhttp3.Request$Builder r2 = r5.requestBuilder
            okhttp3.Request$Builder r0 = r2.url(r0)
            okhttp3.Headers$Builder r2 = r5.headersBuilder
            okhttp3.Headers r2 = r2.build()
            okhttp3.Request$Builder r0 = r0.headers(r2)
            java.lang.String r2 = r5.method
            okhttp3.Request$Builder r0 = r0.method(r2, r1)
            return r0
        L64:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Malformed URL. Base: "
            r1.<init>(r2)
            okhttp3.HttpUrl r2 = r5.baseUrl
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", Relative: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r5.relativeUrl
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    void setBody(okhttp3.RequestBody r1) {
            r0 = this;
            r0.body = r1
            return
    }

    void setRelativeUrl(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            r0.relativeUrl = r1
            return
    }
}
