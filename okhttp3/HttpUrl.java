package okhttp3;

/* loaded from: classes.dex */
public final class HttpUrl {
    static final java.lang.String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    static final java.lang.String FRAGMENT_ENCODE_SET = "";
    static final java.lang.String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    private static final char[] HEX_DIGITS = null;
    static final java.lang.String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    static final java.lang.String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    static final java.lang.String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    static final java.lang.String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    static final java.lang.String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    static final java.lang.String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    static final java.lang.String QUERY_ENCODE_SET = " \"'<>#";
    static final java.lang.String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @javax.annotation.Nullable
    private final java.lang.String fragment;
    final java.lang.String host;
    private final java.lang.String password;
    private final java.util.List<java.lang.String> pathSegments;
    final int port;

    @javax.annotation.Nullable
    private final java.util.List<java.lang.String> queryNamesAndValues;
    final java.lang.String scheme;
    private final java.lang.String url;
    private final java.lang.String username;

    public static final class Builder {
        static final java.lang.String INVALID_HOST = "Invalid URL host";

        @javax.annotation.Nullable
        java.lang.String encodedFragment;
        java.lang.String encodedPassword;
        final java.util.List<java.lang.String> encodedPathSegments;

        @javax.annotation.Nullable
        java.util.List<java.lang.String> encodedQueryNamesAndValues;
        java.lang.String encodedUsername;

        @javax.annotation.Nullable
        java.lang.String host;
        int port;

        @javax.annotation.Nullable
        java.lang.String scheme;

        public Builder() {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = ""
                r2.encodedUsername = r0
                r2.encodedPassword = r0
                r1 = -1
                r2.port = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r2.encodedPathSegments = r1
                r1.add(r0)
                return
        }

        private okhttp3.HttpUrl.Builder addPathSegments(java.lang.String r9, boolean r10) {
                r8 = this;
                r0 = 0
                r3 = r0
            L2:
                int r1 = r9.length()
                java.lang.String r2 = "/\\"
                int r7 = okhttp3.internal.Util.delimiterOffset(r9, r3, r1, r2)
                int r1 = r9.length()
                if (r7 >= r1) goto L15
                r1 = 1
                r5 = r1
                goto L16
            L15:
                r5 = r0
            L16:
                r1 = r8
                r2 = r9
                r4 = r7
                r6 = r10
                r1.push(r2, r3, r4, r5, r6)
                int r3 = r7 + 1
                int r1 = r9.length()
                if (r3 <= r1) goto L2
                return r8
        }

        @javax.annotation.Nullable
        private static java.lang.String canonicalizeHost(java.lang.String r1, int r2, int r3) {
                r0 = 0
                java.lang.String r1 = okhttp3.HttpUrl.percentDecode(r1, r2, r3, r0)
                java.lang.String r1 = okhttp3.internal.Util.canonicalizeHost(r1)
                return r1
        }

        private boolean isDot(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "."
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L13
                java.lang.String r0 = "%2e"
                boolean r2 = r2.equalsIgnoreCase(r0)
                if (r2 == 0) goto L11
                goto L13
            L11:
                r2 = 0
                goto L14
            L13:
                r2 = 1
            L14:
                return r2
        }

        private boolean isDotDot(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = ".."
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L23
                java.lang.String r0 = "%2e."
                boolean r0 = r2.equalsIgnoreCase(r0)
                if (r0 != 0) goto L23
                java.lang.String r0 = ".%2e"
                boolean r0 = r2.equalsIgnoreCase(r0)
                if (r0 != 0) goto L23
                java.lang.String r0 = "%2e%2e"
                boolean r2 = r2.equalsIgnoreCase(r0)
                if (r2 == 0) goto L21
                goto L23
            L21:
                r2 = 0
                goto L24
            L23:
                r2 = 1
            L24:
                return r2
        }

        private static int parsePort(java.lang.String r10, int r11, int r12) {
                r0 = -1
                java.lang.String r4 = ""
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r1 = r10
                r2 = r11
                r3 = r12
                java.lang.String r10 = okhttp3.HttpUrl.canonicalize(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.NumberFormatException -> L1b
                int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.NumberFormatException -> L1b
                if (r10 <= 0) goto L1b
                r11 = 65535(0xffff, float:9.1834E-41)
                if (r10 > r11) goto L1b
                return r10
            L1b:
                return r0
        }

        private void pop() {
                r3 = this;
                java.util.List<java.lang.String> r0 = r3.encodedPathSegments
                int r1 = r0.size()
                int r1 = r1 + (-1)
                java.lang.Object r0 = r0.remove(r1)
                java.lang.String r0 = (java.lang.String) r0
                boolean r0 = r0.isEmpty()
                java.lang.String r1 = ""
                if (r0 == 0) goto L2a
                java.util.List<java.lang.String> r0 = r3.encodedPathSegments
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L2a
                java.util.List<java.lang.String> r0 = r3.encodedPathSegments
                int r2 = r0.size()
                int r2 = r2 + (-1)
                r0.set(r2, r1)
                goto L2f
            L2a:
                java.util.List<java.lang.String> r0 = r3.encodedPathSegments
                r0.add(r1)
            L2f:
                return
        }

        private static int portColonOffset(java.lang.String r2, int r3, int r4) {
            L0:
                if (r3 >= r4) goto L1f
                char r0 = r2.charAt(r3)
                r1 = 58
                if (r0 == r1) goto L1e
                r1 = 91
                if (r0 == r1) goto Lf
                goto L1b
            Lf:
                int r3 = r3 + 1
                if (r3 >= r4) goto L1b
                char r0 = r2.charAt(r3)
                r1 = 93
                if (r0 != r1) goto Lf
            L1b:
                int r3 = r3 + 1
                goto L0
            L1e:
                return r3
            L1f:
                return r4
        }

        private void push(java.lang.String r10, int r11, int r12, boolean r13, boolean r14) {
                r9 = this;
                java.lang.String r3 = " \"<>^`{}|/\\?#"
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r0 = r10
                r1 = r11
                r2 = r12
                r4 = r14
                java.lang.String r10 = okhttp3.HttpUrl.canonicalize(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                boolean r11 = r9.isDot(r10)
                if (r11 == 0) goto L15
                return
            L15:
                boolean r11 = r9.isDotDot(r10)
                if (r11 == 0) goto L1f
                r9.pop()
                return
            L1f:
                java.util.List<java.lang.String> r11 = r9.encodedPathSegments
                int r12 = r11.size()
                int r12 = r12 + (-1)
                java.lang.Object r11 = r11.get(r12)
                java.lang.String r11 = (java.lang.String) r11
                boolean r11 = r11.isEmpty()
                if (r11 == 0) goto L3f
                java.util.List<java.lang.String> r11 = r9.encodedPathSegments
                int r12 = r11.size()
                int r12 = r12 + (-1)
                r11.set(r12, r10)
                goto L44
            L3f:
                java.util.List<java.lang.String> r11 = r9.encodedPathSegments
                r11.add(r10)
            L44:
                if (r13 == 0) goto L4d
                java.util.List<java.lang.String> r10 = r9.encodedPathSegments
                java.lang.String r11 = ""
                r10.add(r11)
            L4d:
                return
        }

        private void removeAllCanonicalQueryParameters(java.lang.String r4) {
                r3 = this;
                java.util.List<java.lang.String> r0 = r3.encodedQueryNamesAndValues
                int r0 = r0.size()
                int r0 = r0 + (-2)
            L8:
                if (r0 < 0) goto L31
                java.util.List<java.lang.String> r1 = r3.encodedQueryNamesAndValues
                java.lang.Object r1 = r1.get(r0)
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L2e
                java.util.List<java.lang.String> r1 = r3.encodedQueryNamesAndValues
                int r2 = r0 + 1
                r1.remove(r2)
                java.util.List<java.lang.String> r1 = r3.encodedQueryNamesAndValues
                r1.remove(r0)
                java.util.List<java.lang.String> r1 = r3.encodedQueryNamesAndValues
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L2e
                r4 = 0
                r3.encodedQueryNamesAndValues = r4
                return
            L2e:
                int r0 = r0 + (-2)
                goto L8
            L31:
                return
        }

        private void resolvePath(java.lang.String r11, int r12, int r13) {
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1e:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.add(r2)
                goto L41
            L29:
                r6 = r12
                if (r6 >= r13) goto L44
                java.lang.String r12 = "/\\"
                int r12 = okhttp3.internal.Util.delimiterOffset(r11, r6, r13, r12)
                if (r12 >= r13) goto L36
                r0 = r3
                goto L37
            L36:
                r0 = 0
            L37:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.push(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
            L41:
                int r12 = r12 + 1
                goto L29
            L44:
                return
        }

        private static int schemeDelimiterOffset(java.lang.String r7, int r8, int r9) {
                int r0 = r9 - r8
                r1 = 2
                r2 = -1
                if (r0 >= r1) goto L7
                return r2
            L7:
                char r0 = r7.charAt(r8)
                r1 = 90
                r3 = 122(0x7a, float:1.71E-43)
                r4 = 65
                r5 = 97
                if (r0 < r5) goto L17
                if (r0 <= r3) goto L1c
            L17:
                if (r0 < r4) goto L46
                if (r0 <= r1) goto L1c
                goto L46
            L1c:
                int r8 = r8 + 1
                if (r8 >= r9) goto L46
                char r0 = r7.charAt(r8)
                if (r0 < r5) goto L28
                if (r0 <= r3) goto L1c
            L28:
                if (r0 < r4) goto L2c
                if (r0 <= r1) goto L1c
            L2c:
                r6 = 48
                if (r0 < r6) goto L34
                r6 = 57
                if (r0 <= r6) goto L1c
            L34:
                r6 = 43
                if (r0 == r6) goto L1c
                r6 = 45
                if (r0 == r6) goto L1c
                r6 = 46
                if (r0 != r6) goto L41
                goto L1c
            L41:
                r7 = 58
                if (r0 != r7) goto L46
                return r8
            L46:
                return r2
        }

        private static int slashCount(java.lang.String r3, int r4, int r5) {
                r0 = 0
            L1:
                if (r4 >= r5) goto L14
                char r1 = r3.charAt(r4)
                r2 = 92
                if (r1 == r2) goto Lf
                r2 = 47
                if (r1 != r2) goto L14
            Lf:
                int r0 = r0 + 1
                int r4 = r4 + 1
                goto L1
            L14:
                return r0
        }

        public okhttp3.HttpUrl.Builder addEncodedPathSegment(java.lang.String r7) {
                r6 = this;
                if (r7 == 0) goto Lf
                r2 = 0
                int r3 = r7.length()
                r4 = 0
                r5 = 1
                r0 = r6
                r1 = r7
                r0.push(r1, r2, r3, r4, r5)
                return r6
            Lf:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException
                java.lang.String r0 = "encodedPathSegment == null"
                r7.<init>(r0)
                throw r7
        }

        public okhttp3.HttpUrl.Builder addEncodedPathSegments(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L8
                r0 = 1
                okhttp3.HttpUrl$Builder r2 = r1.addPathSegments(r2, r0)
                return r2
            L8:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "encodedPathSegments == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.HttpUrl.Builder addEncodedQueryParameter(java.lang.String r8, @javax.annotation.Nullable java.lang.String r9) {
                r7 = this;
                if (r8 == 0) goto L32
                java.util.List<java.lang.String> r0 = r7.encodedQueryNamesAndValues
                if (r0 != 0) goto Ld
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r7.encodedQueryNamesAndValues = r0
            Ld:
                java.util.List<java.lang.String> r0 = r7.encodedQueryNamesAndValues
                java.lang.String r2 = " \"'<>#&="
                r3 = 1
                r4 = 0
                r5 = 1
                r6 = 1
                r1 = r8
                java.lang.String r8 = okhttp3.HttpUrl.canonicalize(r1, r2, r3, r4, r5, r6)
                r0.add(r8)
                java.util.List<java.lang.String> r8 = r7.encodedQueryNamesAndValues
                if (r9 == 0) goto L2d
                java.lang.String r1 = " \"'<>#&="
                r2 = 1
                r3 = 0
                r4 = 1
                r5 = 1
                r0 = r9
                java.lang.String r9 = okhttp3.HttpUrl.canonicalize(r0, r1, r2, r3, r4, r5)
                goto L2e
            L2d:
                r9 = 0
            L2e:
                r8.add(r9)
                return r7
            L32:
                java.lang.NullPointerException r8 = new java.lang.NullPointerException
                java.lang.String r9 = "encodedName == null"
                r8.<init>(r9)
                throw r8
        }

        public okhttp3.HttpUrl.Builder addPathSegment(java.lang.String r7) {
                r6 = this;
                if (r7 == 0) goto Lf
                r2 = 0
                int r3 = r7.length()
                r4 = 0
                r5 = 0
                r0 = r6
                r1 = r7
                r0.push(r1, r2, r3, r4, r5)
                return r6
            Lf:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException
                java.lang.String r0 = "pathSegment == null"
                r7.<init>(r0)
                throw r7
        }

        public okhttp3.HttpUrl.Builder addPathSegments(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L8
                r0 = 0
                okhttp3.HttpUrl$Builder r2 = r1.addPathSegments(r2, r0)
                return r2
            L8:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "pathSegments == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.HttpUrl.Builder addQueryParameter(java.lang.String r8, @javax.annotation.Nullable java.lang.String r9) {
                r7 = this;
                if (r8 == 0) goto L32
                java.util.List<java.lang.String> r0 = r7.encodedQueryNamesAndValues
                if (r0 != 0) goto Ld
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r7.encodedQueryNamesAndValues = r0
            Ld:
                java.util.List<java.lang.String> r0 = r7.encodedQueryNamesAndValues
                java.lang.String r2 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
                r3 = 0
                r4 = 0
                r5 = 1
                r6 = 1
                r1 = r8
                java.lang.String r8 = okhttp3.HttpUrl.canonicalize(r1, r2, r3, r4, r5, r6)
                r0.add(r8)
                java.util.List<java.lang.String> r8 = r7.encodedQueryNamesAndValues
                if (r9 == 0) goto L2d
                java.lang.String r1 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
                r2 = 0
                r3 = 0
                r4 = 1
                r5 = 1
                r0 = r9
                java.lang.String r9 = okhttp3.HttpUrl.canonicalize(r0, r1, r2, r3, r4, r5)
                goto L2e
            L2d:
                r9 = 0
            L2e:
                r8.add(r9)
                return r7
            L32:
                java.lang.NullPointerException r8 = new java.lang.NullPointerException
                java.lang.String r9 = "name == null"
                r8.<init>(r9)
                throw r8
        }

        public okhttp3.HttpUrl build() {
                r2 = this;
                java.lang.String r0 = r2.scheme
                if (r0 == 0) goto L16
                java.lang.String r0 = r2.host
                if (r0 == 0) goto Le
                okhttp3.HttpUrl r0 = new okhttp3.HttpUrl
                r0.<init>(r2)
                return r0
            Le:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "host == null"
                r0.<init>(r1)
                throw r0
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "scheme == null"
                r0.<init>(r1)
                throw r0
        }

        int effectivePort() {
                r2 = this;
                int r0 = r2.port
                r1 = -1
                if (r0 == r1) goto L6
                goto Lc
            L6:
                java.lang.String r0 = r2.scheme
                int r0 = okhttp3.HttpUrl.defaultPort(r0)
            Lc:
                return r0
        }

        public okhttp3.HttpUrl.Builder encodedFragment(@javax.annotation.Nullable java.lang.String r7) {
                r6 = this;
                if (r7 == 0) goto Le
                java.lang.String r1 = ""
                r2 = 1
                r3 = 0
                r4 = 0
                r5 = 0
                r0 = r7
                java.lang.String r7 = okhttp3.HttpUrl.canonicalize(r0, r1, r2, r3, r4, r5)
                goto Lf
            Le:
                r7 = 0
            Lf:
                r6.encodedFragment = r7
                return r6
        }

        public okhttp3.HttpUrl.Builder encodedPassword(java.lang.String r7) {
                r6 = this;
                if (r7 == 0) goto L10
                java.lang.String r1 = " \"':;<=>@[]^`{}|/\\?#"
                r2 = 1
                r3 = 0
                r4 = 0
                r5 = 1
                r0 = r7
                java.lang.String r7 = okhttp3.HttpUrl.canonicalize(r0, r1, r2, r3, r4, r5)
                r6.encodedPassword = r7
                return r6
            L10:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException
                java.lang.String r0 = "encodedPassword == null"
                r7.<init>(r0)
                throw r7
        }

        public okhttp3.HttpUrl.Builder encodedPath(java.lang.String r4) {
                r3 = this;
                if (r4 == 0) goto L28
                java.lang.String r0 = "/"
                boolean r0 = r4.startsWith(r0)
                if (r0 == 0) goto L13
                r0 = 0
                int r1 = r4.length()
                r3.resolvePath(r4, r0, r1)
                return r3
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "unexpected encodedPath: "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
            L28:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r0 = "encodedPath == null"
                r4.<init>(r0)
                throw r4
        }

        public okhttp3.HttpUrl.Builder encodedQuery(@javax.annotation.Nullable java.lang.String r7) {
                r6 = this;
                if (r7 == 0) goto L12
                java.lang.String r1 = " \"'<>#"
                r2 = 1
                r3 = 0
                r4 = 1
                r5 = 1
                r0 = r7
                java.lang.String r7 = okhttp3.HttpUrl.canonicalize(r0, r1, r2, r3, r4, r5)
                java.util.List r7 = okhttp3.HttpUrl.queryStringToNamesAndValues(r7)
                goto L13
            L12:
                r7 = 0
            L13:
                r6.encodedQueryNamesAndValues = r7
                return r6
        }

        public okhttp3.HttpUrl.Builder encodedUsername(java.lang.String r7) {
                r6 = this;
                if (r7 == 0) goto L10
                java.lang.String r1 = " \"':;<=>@[]^`{}|/\\?#"
                r2 = 1
                r3 = 0
                r4 = 0
                r5 = 1
                r0 = r7
                java.lang.String r7 = okhttp3.HttpUrl.canonicalize(r0, r1, r2, r3, r4, r5)
                r6.encodedUsername = r7
                return r6
            L10:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException
                java.lang.String r0 = "encodedUsername == null"
                r7.<init>(r0)
                throw r7
        }

        public okhttp3.HttpUrl.Builder fragment(@javax.annotation.Nullable java.lang.String r7) {
                r6 = this;
                if (r7 == 0) goto Le
                java.lang.String r1 = ""
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r0 = r7
                java.lang.String r7 = okhttp3.HttpUrl.canonicalize(r0, r1, r2, r3, r4, r5)
                goto Lf
            Le:
                r7 = 0
            Lf:
                r6.encodedFragment = r7
                return r6
        }

        public okhttp3.HttpUrl.Builder host(java.lang.String r4) {
                r3 = this;
                if (r4 == 0) goto L25
                r0 = 0
                int r1 = r4.length()
                java.lang.String r0 = canonicalizeHost(r4, r0, r1)
                if (r0 == 0) goto L10
                r3.host = r0
                return r3
            L10:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "unexpected host: "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
            L25:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r0 = "host == null"
                r4.<init>(r0)
                throw r4
        }

        okhttp3.HttpUrl.Builder parse(@javax.annotation.Nullable okhttp3.HttpUrl r22, java.lang.String r23) {
                r21 = this;
                r0 = r21
                r1 = r22
                r10 = r23
                int r2 = r23.length()
                r8 = 0
                int r9 = okhttp3.internal.Util.skipLeadingAsciiWhitespace(r10, r8, r2)
                int r2 = r23.length()
                int r11 = okhttp3.internal.Util.skipTrailingAsciiWhitespace(r10, r9, r2)
                int r12 = schemeDelimiterOffset(r10, r9, r11)
                r13 = -1
                if (r12 == r13) goto L67
                r3 = 1
                java.lang.String r5 = "https:"
                r6 = 0
                r7 = 6
                r2 = r23
                r4 = r9
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L33
                java.lang.String r2 = "https"
                r0.scheme = r2
                int r9 = r9 + 6
                goto L6d
            L33:
                r3 = 1
                java.lang.String r5 = "http:"
                r6 = 0
                r7 = 5
                r2 = r23
                r4 = r9
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L48
                java.lang.String r2 = "http"
                r0.scheme = r2
                int r9 = r9 + 5
                goto L6d
            L48:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Expected URL scheme 'http' or 'https' but was '"
                r2.<init>(r3)
                java.lang.String r3 = r10.substring(r8, r12)
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = "'"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L67:
                if (r1 == 0) goto L21d
                java.lang.String r2 = r1.scheme
                r0.scheme = r2
            L6d:
                int r2 = slashCount(r10, r9, r11)
                r3 = 2
                r12 = 63
                r14 = 35
                if (r2 >= r3) goto Lb8
                if (r1 == 0) goto Lb8
                java.lang.String r3 = r1.scheme
                java.lang.String r4 = r0.scheme
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L85
                goto Lb8
            L85:
                java.lang.String r2 = r22.encodedUsername()
                r0.encodedUsername = r2
                java.lang.String r2 = r22.encodedPassword()
                r0.encodedPassword = r2
                java.lang.String r2 = r1.host
                r0.host = r2
                int r2 = r1.port
                r0.port = r2
                java.util.List<java.lang.String> r2 = r0.encodedPathSegments
                r2.clear()
                java.util.List<java.lang.String> r2 = r0.encodedPathSegments
                java.util.List r3 = r22.encodedPathSegments()
                r2.addAll(r3)
                if (r9 == r11) goto Laf
                char r2 = r10.charAt(r9)
                if (r2 != r14) goto L1b3
            Laf:
                java.lang.String r1 = r22.encodedQuery()
                r0.encodedQuery(r1)
                goto L1b3
            Lb8:
                int r9 = r9 + r2
                r16 = r8
                r17 = r16
                r2 = r9
            Lbe:
                java.lang.String r1 = "@/\\?#"
                int r9 = okhttp3.internal.Util.delimiterOffset(r10, r2, r11, r1)
                if (r9 == r11) goto Lcb
                char r1 = r10.charAt(r9)
                goto Lcc
            Lcb:
                r1 = r13
            Lcc:
                if (r1 == r13) goto L169
                if (r1 == r14) goto L169
                r3 = 47
                if (r1 == r3) goto L169
                r3 = 92
                if (r1 == r3) goto L169
                if (r1 == r12) goto L169
                r3 = 64
                if (r1 == r3) goto Le0
                goto L163
            Le0:
                java.lang.String r8 = "%40"
                if (r16 != 0) goto L138
                r1 = 58
                int r7 = okhttp3.internal.Util.delimiterOffset(r10, r2, r9, r1)
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r18 = 0
                r19 = 1
                r20 = 0
                r1 = r23
                r3 = r7
                r15 = r7
                r7 = r18
                r14 = r8
                r8 = r19
                r12 = r9
                r9 = r20
                java.lang.String r1 = okhttp3.HttpUrl.canonicalize(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r17 == 0) goto L11d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.encodedUsername
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r14)
                java.lang.StringBuilder r1 = r2.append(r1)
                java.lang.String r1 = r1.toString()
            L11d:
                r0.encodedUsername = r1
                if (r15 == r12) goto L135
                int r2 = r15 + 1
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r1 = r23
                r3 = r12
                java.lang.String r1 = okhttp3.HttpUrl.canonicalize(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0.encodedPassword = r1
                r16 = 1
            L135:
                r17 = 1
                goto L161
            L138:
                r14 = r8
                r12 = r9
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = r0.encodedPassword
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.StringBuilder r14 = r1.append(r14)
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r1 = r23
                r3 = r12
                java.lang.String r1 = okhttp3.HttpUrl.canonicalize(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                java.lang.StringBuilder r1 = r14.append(r1)
                java.lang.String r1 = r1.toString()
                r0.encodedPassword = r1
            L161:
                int r2 = r12 + 1
            L163:
                r12 = 63
                r14 = 35
                goto Lbe
            L169:
                r12 = r9
                int r1 = portColonOffset(r10, r2, r12)
                int r3 = r1 + 1
                r4 = 34
                if (r3 >= r12) goto L1a0
                java.lang.String r5 = canonicalizeHost(r10, r2, r1)
                r0.host = r5
                int r5 = parsePort(r10, r3, r12)
                r0.port = r5
                if (r5 == r13) goto L183
                goto L1ae
            L183:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r5 = "Invalid URL port: \""
                r2.<init>(r5)
                java.lang.String r3 = r10.substring(r3, r12)
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L1a0:
                java.lang.String r3 = canonicalizeHost(r10, r2, r1)
                r0.host = r3
                java.lang.String r3 = r0.scheme
                int r3 = okhttp3.HttpUrl.defaultPort(r3)
                r0.port = r3
            L1ae:
                java.lang.String r3 = r0.host
                if (r3 == 0) goto L200
                r9 = r12
            L1b3:
                java.lang.String r1 = "?#"
                int r1 = okhttp3.internal.Util.delimiterOffset(r10, r9, r11, r1)
                r0.resolvePath(r10, r9, r1)
                if (r1 >= r11) goto L1e3
                char r2 = r10.charAt(r1)
                r3 = 63
                if (r2 != r3) goto L1e3
                r2 = 35
                int r12 = okhttp3.internal.Util.delimiterOffset(r10, r1, r11, r2)
                int r2 = r1 + 1
                java.lang.String r4 = " \"'<>#"
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 1
                r9 = 0
                r1 = r23
                r3 = r12
                java.lang.String r1 = okhttp3.HttpUrl.canonicalize(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                java.util.List r1 = okhttp3.HttpUrl.queryStringToNamesAndValues(r1)
                r0.encodedQueryNamesAndValues = r1
                r1 = r12
            L1e3:
                if (r1 >= r11) goto L1ff
                char r2 = r10.charAt(r1)
                r3 = 35
                if (r2 != r3) goto L1ff
                r2 = 1
                int r2 = r2 + r1
                java.lang.String r4 = ""
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r1 = r23
                r3 = r11
                java.lang.String r1 = okhttp3.HttpUrl.canonicalize(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0.encodedFragment = r1
            L1ff:
                return r0
            L200:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "Invalid URL host: \""
                r5.<init>(r6)
                java.lang.String r1 = r10.substring(r2, r1)
                java.lang.StringBuilder r1 = r5.append(r1)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r1 = r1.toString()
                r3.<init>(r1)
                throw r3
            L21d:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r1.<init>(r2)
                throw r1
        }

        public okhttp3.HttpUrl.Builder password(java.lang.String r7) {
                r6 = this;
                if (r7 == 0) goto L10
                java.lang.String r1 = " \"':;<=>@[]^`{}|/\\?#"
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 1
                r0 = r7
                java.lang.String r7 = okhttp3.HttpUrl.canonicalize(r0, r1, r2, r3, r4, r5)
                r6.encodedPassword = r7
                return r6
            L10:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException
                java.lang.String r0 = "password == null"
                r7.<init>(r0)
                throw r7
        }

        public okhttp3.HttpUrl.Builder port(int r4) {
                r3 = this;
                if (r4 <= 0) goto La
                r0 = 65535(0xffff, float:9.1834E-41)
                if (r4 > r0) goto La
                r3.port = r4
                return r3
            La:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "unexpected port: "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        public okhttp3.HttpUrl.Builder query(@javax.annotation.Nullable java.lang.String r7) {
                r6 = this;
                if (r7 == 0) goto L12
                java.lang.String r1 = " \"'<>#"
                r2 = 0
                r3 = 0
                r4 = 1
                r5 = 1
                r0 = r7
                java.lang.String r7 = okhttp3.HttpUrl.canonicalize(r0, r1, r2, r3, r4, r5)
                java.util.List r7 = okhttp3.HttpUrl.queryStringToNamesAndValues(r7)
                goto L13
            L12:
                r7 = 0
            L13:
                r6.encodedQueryNamesAndValues = r7
                return r6
        }

        okhttp3.HttpUrl.Builder reencodeForUri() {
                r10 = this;
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                int r0 = r0.size()
                r1 = 0
                r2 = r1
            L8:
                if (r2 >= r0) goto L25
                java.util.List<java.lang.String> r3 = r10.encodedPathSegments
                java.lang.Object r3 = r3.get(r2)
                r4 = r3
                java.lang.String r4 = (java.lang.String) r4
                java.util.List<java.lang.String> r3 = r10.encodedPathSegments
                java.lang.String r5 = "[]"
                r6 = 1
                r7 = 1
                r8 = 0
                r9 = 1
                java.lang.String r4 = okhttp3.HttpUrl.canonicalize(r4, r5, r6, r7, r8, r9)
                r3.set(r2, r4)
                int r2 = r2 + 1
                goto L8
            L25:
                java.util.List<java.lang.String> r0 = r10.encodedQueryNamesAndValues
                if (r0 == 0) goto L4c
                int r0 = r0.size()
            L2d:
                if (r1 >= r0) goto L4c
                java.util.List<java.lang.String> r2 = r10.encodedQueryNamesAndValues
                java.lang.Object r2 = r2.get(r1)
                r3 = r2
                java.lang.String r3 = (java.lang.String) r3
                if (r3 == 0) goto L49
                java.util.List<java.lang.String> r2 = r10.encodedQueryNamesAndValues
                java.lang.String r4 = "\\^`{|}"
                r5 = 1
                r6 = 1
                r7 = 1
                r8 = 1
                java.lang.String r3 = okhttp3.HttpUrl.canonicalize(r3, r4, r5, r6, r7, r8)
                r2.set(r1, r3)
            L49:
                int r1 = r1 + 1
                goto L2d
            L4c:
                java.lang.String r2 = r10.encodedFragment
                if (r2 == 0) goto L5c
                java.lang.String r3 = " \"#<>\\^`{|}"
                r4 = 1
                r5 = 1
                r6 = 0
                r7 = 0
                java.lang.String r0 = okhttp3.HttpUrl.canonicalize(r2, r3, r4, r5, r6, r7)
                r10.encodedFragment = r0
            L5c:
                return r10
        }

        public okhttp3.HttpUrl.Builder removeAllEncodedQueryParameters(java.lang.String r8) {
                r7 = this;
                if (r8 == 0) goto L16
                java.util.List<java.lang.String> r0 = r7.encodedQueryNamesAndValues
                if (r0 != 0) goto L7
                return r7
            L7:
                java.lang.String r2 = " \"'<>#&="
                r3 = 1
                r4 = 0
                r5 = 1
                r6 = 1
                r1 = r8
                java.lang.String r8 = okhttp3.HttpUrl.canonicalize(r1, r2, r3, r4, r5, r6)
                r7.removeAllCanonicalQueryParameters(r8)
                return r7
            L16:
                java.lang.NullPointerException r8 = new java.lang.NullPointerException
                java.lang.String r0 = "encodedName == null"
                r8.<init>(r0)
                throw r8
        }

        public okhttp3.HttpUrl.Builder removeAllQueryParameters(java.lang.String r8) {
                r7 = this;
                if (r8 == 0) goto L16
                java.util.List<java.lang.String> r0 = r7.encodedQueryNamesAndValues
                if (r0 != 0) goto L7
                return r7
            L7:
                java.lang.String r2 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
                r3 = 0
                r4 = 0
                r5 = 1
                r6 = 1
                r1 = r8
                java.lang.String r8 = okhttp3.HttpUrl.canonicalize(r1, r2, r3, r4, r5, r6)
                r7.removeAllCanonicalQueryParameters(r8)
                return r7
            L16:
                java.lang.NullPointerException r8 = new java.lang.NullPointerException
                java.lang.String r0 = "name == null"
                r8.<init>(r0)
                throw r8
        }

        public okhttp3.HttpUrl.Builder removePathSegment(int r2) {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.encodedPathSegments
                r0.remove(r2)
                java.util.List<java.lang.String> r2 = r1.encodedPathSegments
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L14
                java.util.List<java.lang.String> r2 = r1.encodedPathSegments
                java.lang.String r0 = ""
                r2.add(r0)
            L14:
                return r1
        }

        public okhttp3.HttpUrl.Builder scheme(java.lang.String r4) {
                r3 = this;
                if (r4 == 0) goto L2d
                java.lang.String r0 = "http"
                boolean r1 = r4.equalsIgnoreCase(r0)
                if (r1 == 0) goto Ld
                r3.scheme = r0
                goto L17
            Ld:
                java.lang.String r0 = "https"
                boolean r1 = r4.equalsIgnoreCase(r0)
                if (r1 == 0) goto L18
                r3.scheme = r0
            L17:
                return r3
            L18:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "unexpected scheme: "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
            L2d:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r0 = "scheme == null"
                r4.<init>(r0)
                throw r4
        }

        public okhttp3.HttpUrl.Builder setEncodedPathSegment(int r10, java.lang.String r11) {
                r9 = this;
                if (r11 == 0) goto L3a
                r1 = 0
                int r2 = r11.length()
                java.lang.String r3 = " \"<>^`{}|/\\?#"
                r4 = 1
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r0 = r11
                java.lang.String r0 = okhttp3.HttpUrl.canonicalize(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                java.util.List<java.lang.String> r1 = r9.encodedPathSegments
                r1.set(r10, r0)
                boolean r10 = r9.isDot(r0)
                if (r10 != 0) goto L25
                boolean r10 = r9.isDotDot(r0)
                if (r10 != 0) goto L25
                return r9
            L25:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "unexpected path segment: "
                r0.<init>(r1)
                java.lang.StringBuilder r11 = r0.append(r11)
                java.lang.String r11 = r11.toString()
                r10.<init>(r11)
                throw r10
            L3a:
                java.lang.NullPointerException r10 = new java.lang.NullPointerException
                java.lang.String r11 = "encodedPathSegment == null"
                r10.<init>(r11)
                throw r10
        }

        public okhttp3.HttpUrl.Builder setEncodedQueryParameter(java.lang.String r1, @javax.annotation.Nullable java.lang.String r2) {
                r0 = this;
                r0.removeAllEncodedQueryParameters(r1)
                r0.addEncodedQueryParameter(r1, r2)
                return r0
        }

        public okhttp3.HttpUrl.Builder setPathSegment(int r10, java.lang.String r11) {
                r9 = this;
                if (r11 == 0) goto L3a
                r1 = 0
                int r2 = r11.length()
                java.lang.String r3 = " \"<>^`{}|/\\?#"
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r0 = r11
                java.lang.String r0 = okhttp3.HttpUrl.canonicalize(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                boolean r1 = r9.isDot(r0)
                if (r1 != 0) goto L25
                boolean r1 = r9.isDotDot(r0)
                if (r1 != 0) goto L25
                java.util.List<java.lang.String> r11 = r9.encodedPathSegments
                r11.set(r10, r0)
                return r9
            L25:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "unexpected path segment: "
                r0.<init>(r1)
                java.lang.StringBuilder r11 = r0.append(r11)
                java.lang.String r11 = r11.toString()
                r10.<init>(r11)
                throw r10
            L3a:
                java.lang.NullPointerException r10 = new java.lang.NullPointerException
                java.lang.String r11 = "pathSegment == null"
                r10.<init>(r11)
                throw r10
        }

        public okhttp3.HttpUrl.Builder setQueryParameter(java.lang.String r1, @javax.annotation.Nullable java.lang.String r2) {
                r0 = this;
                r0.removeAllQueryParameters(r1)
                r0.addQueryParameter(r1, r2)
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r4.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r4.encodedUsername
                boolean r1 = r1.isEmpty()
                r2 = 58
                if (r1 == 0) goto L29
                java.lang.String r1 = r4.encodedPassword
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L43
            L29:
                java.lang.String r1 = r4.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r4.encodedPassword
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L3e
                r0.append(r2)
                java.lang.String r1 = r4.encodedPassword
                r0.append(r1)
            L3e:
                r1 = 64
                r0.append(r1)
            L43:
                java.lang.String r1 = r4.host
                r3 = -1
                if (r1 == 0) goto L63
                int r1 = r1.indexOf(r2)
                if (r1 == r3) goto L5e
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r4.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L63
            L5e:
                java.lang.String r1 = r4.host
                r0.append(r1)
            L63:
                int r1 = r4.port
                if (r1 != r3) goto L6b
                java.lang.String r1 = r4.scheme
                if (r1 == 0) goto L7f
            L6b:
                int r1 = r4.effectivePort()
                java.lang.String r3 = r4.scheme
                if (r3 == 0) goto L79
                int r3 = okhttp3.HttpUrl.defaultPort(r3)
                if (r1 == r3) goto L7f
            L79:
                r0.append(r2)
                r0.append(r1)
            L7f:
                java.util.List<java.lang.String> r1 = r4.encodedPathSegments
                okhttp3.HttpUrl.pathSegmentsToString(r0, r1)
                java.util.List<java.lang.String> r1 = r4.encodedQueryNamesAndValues
                if (r1 == 0) goto L92
                r1 = 63
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r4.encodedQueryNamesAndValues
                okhttp3.HttpUrl.namesAndValuesToQueryString(r0, r1)
            L92:
                java.lang.String r1 = r4.encodedFragment
                if (r1 == 0) goto La0
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r4.encodedFragment
                r0.append(r1)
            La0:
                java.lang.String r0 = r0.toString()
                return r0
        }

        public okhttp3.HttpUrl.Builder username(java.lang.String r7) {
                r6 = this;
                if (r7 == 0) goto L10
                java.lang.String r1 = " \"':;<=>@[]^`{}|/\\?#"
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 1
                r0 = r7
                java.lang.String r7 = okhttp3.HttpUrl.canonicalize(r0, r1, r2, r3, r4, r5)
                r6.encodedUsername = r7
                return r6
            L10:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException
                java.lang.String r0 = "username == null"
                r7.<init>(r0)
                throw r7
        }
    }

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            okhttp3.HttpUrl.HEX_DIGITS = r0
            return
    }

    HttpUrl(okhttp3.HttpUrl.Builder r5) {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = r5.scheme
            r4.scheme = r0
            java.lang.String r0 = r5.encodedUsername
            r1 = 0
            java.lang.String r0 = percentDecode(r0, r1)
            r4.username = r0
            java.lang.String r0 = r5.encodedPassword
            java.lang.String r0 = percentDecode(r0, r1)
            r4.password = r0
            java.lang.String r0 = r5.host
            r4.host = r0
            int r0 = r5.effectivePort()
            r4.port = r0
            java.util.List<java.lang.String> r0 = r5.encodedPathSegments
            java.util.List r0 = r4.percentDecode(r0, r1)
            r4.pathSegments = r0
            java.util.List<java.lang.String> r0 = r5.encodedQueryNamesAndValues
            r2 = 0
            if (r0 == 0) goto L37
            java.util.List<java.lang.String> r0 = r5.encodedQueryNamesAndValues
            r3 = 1
            java.util.List r0 = r4.percentDecode(r0, r3)
            goto L38
        L37:
            r0 = r2
        L38:
            r4.queryNamesAndValues = r0
            java.lang.String r0 = r5.encodedFragment
            if (r0 == 0) goto L44
            java.lang.String r0 = r5.encodedFragment
            java.lang.String r2 = percentDecode(r0, r1)
        L44:
            r4.fragment = r2
            java.lang.String r5 = r5.toString()
            r4.url = r5
            return
    }

    static java.lang.String canonicalize(java.lang.String r11, int r12, int r13, java.lang.String r14, boolean r15, boolean r16, boolean r17, boolean r18, @javax.annotation.Nullable java.nio.charset.Charset r19) {
            r1 = r11
            r3 = r13
            r2 = r12
        L3:
            if (r2 >= r3) goto L59
            int r0 = r11.codePointAt(r2)
            r4 = 32
            if (r0 < r4) goto L3a
            r4 = 127(0x7f, float:1.78E-43)
            if (r0 == r4) goto L3a
            r4 = 128(0x80, float:1.794E-43)
            if (r0 < r4) goto L17
            if (r18 != 0) goto L3a
        L17:
            r4 = r14
            int r5 = r14.indexOf(r0)
            r6 = -1
            if (r5 != r6) goto L3b
            r5 = 37
            if (r0 != r5) goto L2d
            if (r15 == 0) goto L3b
            if (r16 == 0) goto L2d
            boolean r5 = percentEncoded(r11, r2, r13)
            if (r5 == 0) goto L3b
        L2d:
            r5 = 43
            if (r0 != r5) goto L34
            if (r17 == 0) goto L34
            goto L3b
        L34:
            int r0 = java.lang.Character.charCount(r0)
            int r2 = r2 + r0
            goto L3
        L3a:
            r4 = r14
        L3b:
            okio.Buffer r10 = new okio.Buffer
            r10.<init>()
            r0 = r12
            r10.writeUtf8(r11, r12, r2)
            r0 = r10
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            canonicalize(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = r10.readUtf8()
            return r0
        L59:
            r0 = r12
            java.lang.String r0 = r11.substring(r12, r13)
            return r0
    }

    static java.lang.String canonicalize(java.lang.String r9, java.lang.String r10, boolean r11, boolean r12, boolean r13, boolean r14) {
            r1 = 0
            int r2 = r9.length()
            r8 = 0
            r0 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            java.lang.String r9 = canonicalize(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    static java.lang.String canonicalize(java.lang.String r9, java.lang.String r10, boolean r11, boolean r12, boolean r13, boolean r14, @javax.annotation.Nullable java.nio.charset.Charset r15) {
            r1 = 0
            int r2 = r9.length()
            r0 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            java.lang.String r9 = canonicalize(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    static void canonicalize(okio.Buffer r6, java.lang.String r7, int r8, int r9, java.lang.String r10, boolean r11, boolean r12, boolean r13, boolean r14, @javax.annotation.Nullable java.nio.charset.Charset r15) {
            r0 = 0
        L1:
            if (r8 >= r9) goto L9c
            int r1 = r7.codePointAt(r8)
            if (r11 == 0) goto L1b
            r2 = 9
            if (r1 == r2) goto L95
            r2 = 10
            if (r1 == r2) goto L95
            r2 = 12
            if (r1 == r2) goto L95
            r2 = 13
            if (r1 != r2) goto L1b
            goto L95
        L1b:
            r2 = 43
            if (r1 != r2) goto L2d
            if (r13 == 0) goto L2d
            if (r11 == 0) goto L26
            java.lang.String r2 = "+"
            goto L28
        L26:
            java.lang.String r2 = "%2B"
        L28:
            r6.writeUtf8(r2)
            goto L95
        L2d:
            r2 = 32
            r3 = 37
            if (r1 < r2) goto L55
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 == r2) goto L55
            r2 = 128(0x80, float:1.794E-43)
            if (r1 < r2) goto L3d
            if (r14 != 0) goto L55
        L3d:
            int r2 = r10.indexOf(r1)
            r4 = -1
            if (r2 != r4) goto L55
            if (r1 != r3) goto L51
            if (r11 == 0) goto L55
            if (r12 == 0) goto L51
            boolean r2 = percentEncoded(r7, r8, r9)
            if (r2 != 0) goto L51
            goto L55
        L51:
            r6.writeUtf8CodePoint(r1)
            goto L95
        L55:
            if (r0 != 0) goto L5c
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
        L5c:
            if (r15 == 0) goto L70
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L67
            goto L70
        L67:
            int r2 = java.lang.Character.charCount(r1)
            int r2 = r2 + r8
            r0.writeString(r7, r8, r2, r15)
            goto L73
        L70:
            r0.writeUtf8CodePoint(r1)
        L73:
            boolean r2 = r0.exhausted()
            if (r2 != 0) goto L95
            byte r2 = r0.readByte()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r6.writeByte(r3)
            char[] r4 = okhttp3.HttpUrl.HEX_DIGITS
            int r5 = r2 >> 4
            r5 = r5 & 15
            char r5 = r4[r5]
            r6.writeByte(r5)
            r2 = r2 & 15
            char r2 = r4[r2]
            r6.writeByte(r2)
            goto L73
        L95:
            int r1 = java.lang.Character.charCount(r1)
            int r8 = r8 + r1
            goto L1
        L9c:
            return
    }

    public static int defaultPort(java.lang.String r1) {
            java.lang.String r0 = "http"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            r1 = 80
            return r1
        Lb:
            java.lang.String r0 = "https"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L16
            r1 = 443(0x1bb, float:6.21E-43)
            return r1
        L16:
            r1 = -1
            return r1
    }

    public static okhttp3.HttpUrl get(java.lang.String r2) {
            okhttp3.HttpUrl$Builder r0 = new okhttp3.HttpUrl$Builder
            r0.<init>()
            r1 = 0
            okhttp3.HttpUrl$Builder r2 = r0.parse(r1, r2)
            okhttp3.HttpUrl r2 = r2.build()
            return r2
    }

    @javax.annotation.Nullable
    public static okhttp3.HttpUrl get(java.net.URI r0) {
            java.lang.String r0 = r0.toString()
            okhttp3.HttpUrl r0 = parse(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static okhttp3.HttpUrl get(java.net.URL r0) {
            java.lang.String r0 = r0.toString()
            okhttp3.HttpUrl r0 = parse(r0)
            return r0
    }

    static void namesAndValuesToQueryString(java.lang.StringBuilder r5, java.util.List<java.lang.String> r6) {
            int r0 = r6.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L2c
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r1 + 1
            java.lang.Object r3 = r6.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r1 <= 0) goto L1c
            r4 = 38
            r5.append(r4)
        L1c:
            r5.append(r2)
            if (r3 == 0) goto L29
            r2 = 61
            r5.append(r2)
            r5.append(r3)
        L29:
            int r1 = r1 + 2
            goto L5
        L2c:
            return
    }

    @javax.annotation.Nullable
    public static okhttp3.HttpUrl parse(java.lang.String r0) {
            okhttp3.HttpUrl r0 = get(r0)     // Catch: java.lang.IllegalArgumentException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    static void pathSegmentsToString(java.lang.StringBuilder r3, java.util.List<java.lang.String> r4) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L18
            r2 = 47
            r3.append(r2)
            java.lang.Object r2 = r4.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r3.append(r2)
            int r1 = r1 + 1
            goto L5
        L18:
            return
    }

    static java.lang.String percentDecode(java.lang.String r3, int r4, int r5, boolean r6) {
            r0 = r4
        L1:
            if (r0 >= r5) goto L25
            char r1 = r3.charAt(r0)
            r2 = 37
            if (r1 == r2) goto L15
            r2 = 43
            if (r1 != r2) goto L12
            if (r6 == 0) goto L12
            goto L15
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r1.writeUtf8(r3, r4, r0)
            percentDecode(r1, r3, r0, r5, r6)
            java.lang.String r3 = r1.readUtf8()
            return r3
        L25:
            java.lang.String r3 = r3.substring(r4, r5)
            return r3
    }

    static java.lang.String percentDecode(java.lang.String r2, boolean r3) {
            r0 = 0
            int r1 = r2.length()
            java.lang.String r2 = percentDecode(r2, r0, r1, r3)
            return r2
    }

    private java.util.List<java.lang.String> percentDecode(java.util.List<java.lang.String> r5, boolean r6) {
            r4 = this;
            int r0 = r5.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L20
            java.lang.Object r3 = r5.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L19
            java.lang.String r3 = percentDecode(r3, r6)
            goto L1a
        L19:
            r3 = 0
        L1a:
            r1.add(r3)
            int r2 = r2 + 1
            goto La
        L20:
            java.util.List r5 = java.util.Collections.unmodifiableList(r1)
            return r5
    }

    static void percentDecode(okio.Buffer r5, java.lang.String r6, int r7, int r8, boolean r9) {
        L0:
            if (r7 >= r8) goto L42
            int r0 = r6.codePointAt(r7)
            r1 = 37
            if (r0 != r1) goto L2d
            int r1 = r7 + 2
            if (r1 >= r8) goto L2d
            int r2 = r7 + 1
            char r2 = r6.charAt(r2)
            int r2 = okhttp3.internal.Util.decodeHexDigit(r2)
            char r3 = r6.charAt(r1)
            int r3 = okhttp3.internal.Util.decodeHexDigit(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.writeByte(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.writeByte(r1)
            goto L3c
        L39:
            r5.writeUtf8CodePoint(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
    }

    static boolean percentEncoded(java.lang.String r2, int r3, int r4) {
            int r0 = r3 + 2
            if (r0 >= r4) goto L24
            char r4 = r2.charAt(r3)
            r1 = 37
            if (r4 != r1) goto L24
            r4 = 1
            int r3 = r3 + r4
            char r3 = r2.charAt(r3)
            int r3 = okhttp3.internal.Util.decodeHexDigit(r3)
            r1 = -1
            if (r3 == r1) goto L24
            char r2 = r2.charAt(r0)
            int r2 = okhttp3.internal.Util.decodeHexDigit(r2)
            if (r2 == r1) goto L24
            goto L25
        L24:
            r4 = 0
        L25:
            return r4
    }

    static java.util.List<java.lang.String> queryStringToNamesAndValues(java.lang.String r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length()
            if (r1 > r2) goto L43
            r2 = 38
            int r2 = r5.indexOf(r2, r1)
            r3 = -1
            if (r2 != r3) goto L19
            int r2 = r5.length()
        L19:
            r4 = 61
            int r4 = r5.indexOf(r4, r1)
            if (r4 == r3) goto L35
            if (r4 <= r2) goto L24
            goto L35
        L24:
            java.lang.String r1 = r5.substring(r1, r4)
            r0.add(r1)
            int r4 = r4 + 1
            java.lang.String r1 = r5.substring(r4, r2)
            r0.add(r1)
            goto L40
        L35:
            java.lang.String r1 = r5.substring(r1, r2)
            r0.add(r1)
            r1 = 0
            r0.add(r1)
        L40:
            int r1 = r2 + 1
            goto L6
        L43:
            return r0
    }

    @javax.annotation.Nullable
    public java.lang.String encodedFragment() {
            r2 = this;
            java.lang.String r0 = r2.fragment
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r2.url
            r1 = 35
            int r0 = r0.indexOf(r1)
            int r0 = r0 + 1
            java.lang.String r1 = r2.url
            java.lang.String r0 = r1.substring(r0)
            return r0
    }

    public java.lang.String encodedPassword() {
            r3 = this;
            java.lang.String r0 = r3.password
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            java.lang.String r0 = ""
            return r0
        Lb:
            java.lang.String r0 = r3.url
            java.lang.String r1 = r3.scheme
            int r1 = r1.length()
            int r1 = r1 + 3
            r2 = 58
            int r0 = r0.indexOf(r2, r1)
            int r0 = r0 + 1
            java.lang.String r1 = r3.url
            r2 = 64
            int r1 = r1.indexOf(r2)
            java.lang.String r2 = r3.url
            java.lang.String r0 = r2.substring(r0, r1)
            return r0
    }

    public java.lang.String encodedPath() {
            r4 = this;
            java.lang.String r0 = r4.url
            java.lang.String r1 = r4.scheme
            int r1 = r1.length()
            int r1 = r1 + 3
            r2 = 47
            int r0 = r0.indexOf(r2, r1)
            java.lang.String r1 = r4.url
            int r2 = r1.length()
            java.lang.String r3 = "?#"
            int r1 = okhttp3.internal.Util.delimiterOffset(r1, r0, r2, r3)
            java.lang.String r2 = r4.url
            java.lang.String r0 = r2.substring(r0, r1)
            return r0
    }

    public java.util.List<java.lang.String> encodedPathSegments() {
            r6 = this;
            java.lang.String r0 = r6.url
            java.lang.String r1 = r6.scheme
            int r1 = r1.length()
            int r1 = r1 + 3
            r2 = 47
            int r0 = r0.indexOf(r2, r1)
            java.lang.String r1 = r6.url
            int r3 = r1.length()
            java.lang.String r4 = "?#"
            int r1 = okhttp3.internal.Util.delimiterOffset(r1, r0, r3, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L21:
            if (r0 >= r1) goto L36
            int r0 = r0 + 1
            java.lang.String r4 = r6.url
            int r4 = okhttp3.internal.Util.delimiterOffset(r4, r0, r1, r2)
            java.lang.String r5 = r6.url
            java.lang.String r0 = r5.substring(r0, r4)
            r3.add(r0)
            r0 = r4
            goto L21
        L36:
            return r3
    }

    @javax.annotation.Nullable
    public java.lang.String encodedQuery() {
            r4 = this;
            java.util.List<java.lang.String> r0 = r4.queryNamesAndValues
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r4.url
            r1 = 63
            int r0 = r0.indexOf(r1)
            int r0 = r0 + 1
            java.lang.String r1 = r4.url
            int r2 = r1.length()
            r3 = 35
            int r1 = okhttp3.internal.Util.delimiterOffset(r1, r0, r2, r3)
            java.lang.String r2 = r4.url
            java.lang.String r0 = r2.substring(r0, r1)
            return r0
    }

    public java.lang.String encodedUsername() {
            r4 = this;
            java.lang.String r0 = r4.username
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            java.lang.String r0 = ""
            return r0
        Lb:
            java.lang.String r0 = r4.scheme
            int r0 = r0.length()
            int r0 = r0 + 3
            java.lang.String r1 = r4.url
            int r2 = r1.length()
            java.lang.String r3 = ":@"
            int r1 = okhttp3.internal.Util.delimiterOffset(r1, r0, r2, r3)
            java.lang.String r2 = r4.url
            java.lang.String r0 = r2.substring(r0, r1)
            return r0
    }

    public boolean equals(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okhttp3.HttpUrl
            if (r0 == 0) goto L12
            okhttp3.HttpUrl r2 = (okhttp3.HttpUrl) r2
            java.lang.String r2 = r2.url
            java.lang.String r0 = r1.url
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    @javax.annotation.Nullable
    public java.lang.String fragment() {
            r1 = this;
            java.lang.String r0 = r1.fragment
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.url
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String host() {
            r1 = this;
            java.lang.String r0 = r1.host
            return r0
    }

    public boolean isHttps() {
            r2 = this;
            java.lang.String r0 = r2.scheme
            java.lang.String r1 = "https"
            boolean r0 = r0.equals(r1)
            return r0
    }

    public okhttp3.HttpUrl.Builder newBuilder() {
            r3 = this;
            okhttp3.HttpUrl$Builder r0 = new okhttp3.HttpUrl$Builder
            r0.<init>()
            java.lang.String r1 = r3.scheme
            r0.scheme = r1
            java.lang.String r1 = r3.encodedUsername()
            r0.encodedUsername = r1
            java.lang.String r1 = r3.encodedPassword()
            r0.encodedPassword = r1
            java.lang.String r1 = r3.host
            r0.host = r1
            int r1 = r3.port
            java.lang.String r2 = r3.scheme
            int r2 = defaultPort(r2)
            if (r1 == r2) goto L26
            int r1 = r3.port
            goto L27
        L26:
            r1 = -1
        L27:
            r0.port = r1
            java.util.List<java.lang.String> r1 = r0.encodedPathSegments
            r1.clear()
            java.util.List<java.lang.String> r1 = r0.encodedPathSegments
            java.util.List r2 = r3.encodedPathSegments()
            r1.addAll(r2)
            java.lang.String r1 = r3.encodedQuery()
            r0.encodedQuery(r1)
            java.lang.String r1 = r3.encodedFragment()
            r0.encodedFragment = r1
            return r0
    }

    @javax.annotation.Nullable
    public okhttp3.HttpUrl.Builder newBuilder(java.lang.String r2) {
            r1 = this;
            okhttp3.HttpUrl$Builder r0 = new okhttp3.HttpUrl$Builder     // Catch: java.lang.IllegalArgumentException -> La
            r0.<init>()     // Catch: java.lang.IllegalArgumentException -> La
            okhttp3.HttpUrl$Builder r2 = r0.parse(r1, r2)     // Catch: java.lang.IllegalArgumentException -> La
            return r2
        La:
            r2 = 0
            return r2
    }

    public java.lang.String password() {
            r1 = this;
            java.lang.String r0 = r1.password
            return r0
    }

    public java.util.List<java.lang.String> pathSegments() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.pathSegments
            return r0
    }

    public int pathSize() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.pathSegments
            int r0 = r0.size()
            return r0
    }

    public int port() {
            r1 = this;
            int r0 = r1.port
            return r0
    }

    @javax.annotation.Nullable
    public java.lang.String query() {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.queryNamesAndValues
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List<java.lang.String> r1 = r2.queryNamesAndValues
            namesAndValuesToQueryString(r0, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @javax.annotation.Nullable
    public java.lang.String queryParameter(java.lang.String r5) {
            r4 = this;
            java.util.List<java.lang.String> r0 = r4.queryNamesAndValues
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.size()
            r2 = 0
        Lb:
            if (r2 >= r0) goto L27
            java.util.List<java.lang.String> r3 = r4.queryNamesAndValues
            java.lang.Object r3 = r3.get(r2)
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L24
            java.util.List<java.lang.String> r5 = r4.queryNamesAndValues
            int r2 = r2 + 1
            java.lang.Object r5 = r5.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L24:
            int r2 = r2 + 2
            goto Lb
        L27:
            return r1
    }

    public java.lang.String queryParameterName(int r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.queryNamesAndValues
            if (r0 == 0) goto Ld
            int r2 = r2 * 2
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        Ld:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    public java.util.Set<java.lang.String> queryParameterNames() {
            r4 = this;
            java.util.List<java.lang.String> r0 = r4.queryNamesAndValues
            if (r0 != 0) goto L9
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
        L9:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List<java.lang.String> r1 = r4.queryNamesAndValues
            int r1 = r1.size()
            r2 = 0
        L15:
            if (r2 >= r1) goto L25
            java.util.List<java.lang.String> r3 = r4.queryNamesAndValues
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r0.add(r3)
            int r2 = r2 + 2
            goto L15
        L25:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    public java.lang.String queryParameterValue(int r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.queryNamesAndValues
            if (r0 == 0) goto Lf
            int r2 = r2 * 2
            int r2 = r2 + 1
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        Lf:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    public java.util.List<java.lang.String> queryParameterValues(java.lang.String r6) {
            r5 = this;
            java.util.List<java.lang.String> r0 = r5.queryNamesAndValues
            if (r0 != 0) goto L9
            java.util.List r6 = java.util.Collections.emptyList()
            return r6
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<java.lang.String> r1 = r5.queryNamesAndValues
            int r1 = r1.size()
            r2 = 0
        L15:
            if (r2 >= r1) goto L33
            java.util.List<java.lang.String> r3 = r5.queryNamesAndValues
            java.lang.Object r3 = r3.get(r2)
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L30
            java.util.List<java.lang.String> r3 = r5.queryNamesAndValues
            int r4 = r2 + 1
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r0.add(r3)
        L30:
            int r2 = r2 + 2
            goto L15
        L33:
            java.util.List r6 = java.util.Collections.unmodifiableList(r0)
            return r6
    }

    public int querySize() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.queryNamesAndValues
            if (r0 == 0) goto Lb
            int r0 = r0.size()
            int r0 = r0 / 2
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public java.lang.String redact() {
            r2 = this;
            java.lang.String r0 = "/..."
            okhttp3.HttpUrl$Builder r0 = r2.newBuilder(r0)
            java.lang.String r1 = ""
            okhttp3.HttpUrl$Builder r0 = r0.username(r1)
            okhttp3.HttpUrl$Builder r0 = r0.password(r1)
            okhttp3.HttpUrl r0 = r0.build()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @javax.annotation.Nullable
    public okhttp3.HttpUrl resolve(java.lang.String r1) {
            r0 = this;
            okhttp3.HttpUrl$Builder r1 = r0.newBuilder(r1)
            if (r1 == 0) goto Lb
            okhttp3.HttpUrl r1 = r1.build()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    public java.lang.String scheme() {
            r1 = this;
            java.lang.String r0 = r1.scheme
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    @javax.annotation.Nullable
    public java.lang.String topPrivateDomain() {
            r2 = this;
            java.lang.String r0 = r2.host
            boolean r0 = okhttp3.internal.Util.verifyAsIpAddress(r0)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.get()
            java.lang.String r1 = r2.host
            java.lang.String r0 = r0.getEffectiveTldPlusOne(r1)
            return r0
    }

    public java.net.URI uri() {
            r4 = this;
            okhttp3.HttpUrl$Builder r0 = r4.newBuilder()
            okhttp3.HttpUrl$Builder r0 = r0.reencodeForUri()
            java.lang.String r0 = r0.toString()
            java.net.URI r1 = new java.net.URI     // Catch: java.net.URISyntaxException -> L12
            r1.<init>(r0)     // Catch: java.net.URISyntaxException -> L12
            return r1
        L12:
            r1 = move-exception
            java.lang.String r2 = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.replaceAll(r2, r3)     // Catch: java.lang.Exception -> L20
            java.net.URI r0 = java.net.URI.create(r0)     // Catch: java.lang.Exception -> L20
            return r0
        L20:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
    }

    public java.net.URL url() {
            r2 = this;
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L8
            java.lang.String r1 = r2.url     // Catch: java.net.MalformedURLException -> L8
            r0.<init>(r1)     // Catch: java.net.MalformedURLException -> L8
            return r0
        L8:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public java.lang.String username() {
            r1 = this;
            java.lang.String r0 = r1.username
            return r0
    }
}
