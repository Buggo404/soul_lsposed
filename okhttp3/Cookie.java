package okhttp3;

/* loaded from: classes.dex */
public final class Cookie {
    private static final java.util.regex.Pattern DAY_OF_MONTH_PATTERN = null;
    private static final java.util.regex.Pattern MONTH_PATTERN = null;
    private static final java.util.regex.Pattern TIME_PATTERN = null;
    private static final java.util.regex.Pattern YEAR_PATTERN = null;
    private final java.lang.String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final java.lang.String name;
    private final java.lang.String path;
    private final boolean persistent;
    private final boolean secure;
    private final java.lang.String value;

    public static final class Builder {

        @javax.annotation.Nullable
        java.lang.String domain;
        long expiresAt;
        boolean hostOnly;
        boolean httpOnly;

        @javax.annotation.Nullable
        java.lang.String name;
        java.lang.String path;
        boolean persistent;
        boolean secure;

        @javax.annotation.Nullable
        java.lang.String value;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                r2.expiresAt = r0
                java.lang.String r0 = "/"
                r2.path = r0
                return
        }

        private okhttp3.Cookie.Builder domain(java.lang.String r3, boolean r4) {
                r2 = this;
                if (r3 == 0) goto L22
                java.lang.String r0 = okhttp3.internal.Util.canonicalizeHost(r3)
                if (r0 == 0) goto Ld
                r2.domain = r0
                r2.hostOnly = r4
                return r2
            Ld:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "unexpected domain: "
                r0.<init>(r1)
                java.lang.StringBuilder r3 = r0.append(r3)
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
            L22:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r4 = "domain == null"
                r3.<init>(r4)
                throw r3
        }

        public okhttp3.Cookie build() {
                r1 = this;
                okhttp3.Cookie r0 = new okhttp3.Cookie
                r0.<init>(r1)
                return r0
        }

        public okhttp3.Cookie.Builder domain(java.lang.String r2) {
                r1 = this;
                r0 = 0
                okhttp3.Cookie$Builder r2 = r1.domain(r2, r0)
                return r2
        }

        public okhttp3.Cookie.Builder expiresAt(long r4) {
                r3 = this;
                r0 = 0
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 > 0) goto L8
                r4 = -9223372036854775808
            L8:
                r0 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto L12
                r4 = r0
            L12:
                r3.expiresAt = r4
                r4 = 1
                r3.persistent = r4
                return r3
        }

        public okhttp3.Cookie.Builder hostOnlyDomain(java.lang.String r2) {
                r1 = this;
                r0 = 1
                okhttp3.Cookie$Builder r2 = r1.domain(r2, r0)
                return r2
        }

        public okhttp3.Cookie.Builder httpOnly() {
                r1 = this;
                r0 = 1
                r1.httpOnly = r0
                return r1
        }

        public okhttp3.Cookie.Builder name(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L17
                java.lang.String r0 = r2.trim()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto Lf
                r1.name = r2
                return r1
            Lf:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "name is not trimmed"
                r2.<init>(r0)
                throw r2
            L17:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "name == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.Cookie.Builder path(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "/"
                boolean r0 = r2.startsWith(r0)
                if (r0 == 0) goto Lb
                r1.path = r2
                return r1
            Lb:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "path must start with '/'"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.Cookie.Builder secure() {
                r1 = this;
                r0 = 1
                r1.secure = r0
                return r1
        }

        public okhttp3.Cookie.Builder value(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L17
                java.lang.String r0 = r2.trim()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto Lf
                r1.value = r2
                return r1
            Lf:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "value is not trimmed"
                r2.<init>(r0)
                throw r2
            L17:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "value == null"
                r2.<init>(r0)
                throw r2
        }
    }

    static {
            java.lang.String r0 = "(\\d{2,4})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.Cookie.YEAR_PATTERN = r0
            java.lang.String r0 = "(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.Cookie.MONTH_PATTERN = r0
            java.lang.String r0 = "(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.Cookie.DAY_OF_MONTH_PATTERN = r0
            java.lang.String r0 = "(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.Cookie.TIME_PATTERN = r0
            return
    }

    private Cookie(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, boolean r9, boolean r10) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.value = r2
            r0.expiresAt = r3
            r0.domain = r5
            r0.path = r6
            r0.secure = r7
            r0.httpOnly = r8
            r0.hostOnly = r9
            r0.persistent = r10
            return
    }

    Cookie(okhttp3.Cookie.Builder r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.name
            if (r0 == 0) goto L44
            java.lang.String r0 = r3.value
            if (r0 == 0) goto L3c
            java.lang.String r0 = r3.domain
            if (r0 == 0) goto L34
            java.lang.String r0 = r3.name
            r2.name = r0
            java.lang.String r0 = r3.value
            r2.value = r0
            long r0 = r3.expiresAt
            r2.expiresAt = r0
            java.lang.String r0 = r3.domain
            r2.domain = r0
            java.lang.String r0 = r3.path
            r2.path = r0
            boolean r0 = r3.secure
            r2.secure = r0
            boolean r0 = r3.httpOnly
            r2.httpOnly = r0
            boolean r0 = r3.persistent
            r2.persistent = r0
            boolean r3 = r3.hostOnly
            r2.hostOnly = r3
            return
        L34:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "builder.domain == null"
            r3.<init>(r0)
            throw r3
        L3c:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "builder.value == null"
            r3.<init>(r0)
            throw r3
        L44:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "builder.name == null"
            r3.<init>(r0)
            throw r3
    }

    private static int dateCharacterOffset(java.lang.String r3, int r4, int r5, boolean r6) {
        L0:
            if (r4 >= r5) goto L3b
            char r0 = r3.charAt(r4)
            r1 = 32
            r2 = 1
            if (r0 >= r1) goto Lf
            r1 = 9
            if (r0 != r1) goto L32
        Lf:
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 >= r1) goto L32
            r1 = 48
            if (r0 < r1) goto L1b
            r1 = 57
            if (r0 <= r1) goto L32
        L1b:
            r1 = 97
            if (r0 < r1) goto L23
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 <= r1) goto L32
        L23:
            r1 = 65
            if (r0 < r1) goto L2b
            r1 = 90
            if (r0 <= r1) goto L32
        L2b:
            r1 = 58
            if (r0 != r1) goto L30
            goto L32
        L30:
            r0 = 0
            goto L33
        L32:
            r0 = r2
        L33:
            r1 = r6 ^ 1
            if (r0 != r1) goto L38
            return r4
        L38:
            int r4 = r4 + 1
            goto L0
        L3b:
            return r5
    }

    private static boolean domainMatch(java.lang.String r2, java.lang.String r3) {
            boolean r0 = r2.equals(r3)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r2.endsWith(r3)
            if (r0 == 0) goto L27
            int r0 = r2.length()
            int r3 = r3.length()
            int r0 = r0 - r3
            int r0 = r0 - r1
            char r3 = r2.charAt(r0)
            r0 = 46
            if (r3 != r0) goto L27
            boolean r2 = okhttp3.internal.Util.verifyAsIpAddress(r2)
            if (r2 != 0) goto L27
            return r1
        L27:
            r2 = 0
            return r2
    }

    @javax.annotation.Nullable
    static okhttp3.Cookie parse(long r23, okhttp3.HttpUrl r25, java.lang.String r26) {
            r0 = r26
            int r1 = r26.length()
            r2 = 0
            r3 = 59
            int r4 = okhttp3.internal.Util.delimiterOffset(r0, r2, r1, r3)
            r5 = 61
            int r6 = okhttp3.internal.Util.delimiterOffset(r0, r2, r4, r5)
            r7 = 0
            if (r6 != r4) goto L17
            return r7
        L17:
            java.lang.String r9 = okhttp3.internal.Util.trimSubstring(r0, r2, r6)
            boolean r8 = r9.isEmpty()
            if (r8 != 0) goto L135
            int r8 = okhttp3.internal.Util.indexOfControlOrNonAscii(r9)
            r10 = -1
            if (r8 == r10) goto L2a
            goto L135
        L2a:
            r8 = 1
            int r6 = r6 + r8
            java.lang.String r6 = okhttp3.internal.Util.trimSubstring(r0, r6, r4)
            int r11 = okhttp3.internal.Util.indexOfControlOrNonAscii(r6)
            if (r11 == r10) goto L37
            return r7
        L37:
            int r4 = r4 + r8
            r10 = -1
            r12 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r15 = r2
            r16 = r15
            r18 = r16
            r14 = r7
            r17 = r8
            r19 = r10
            r21 = r12
            r8 = r14
        L4c:
            if (r4 >= r1) goto Lba
            int r7 = okhttp3.internal.Util.delimiterOffset(r0, r4, r1, r3)
            int r3 = okhttp3.internal.Util.delimiterOffset(r0, r4, r7, r5)
            java.lang.String r4 = okhttp3.internal.Util.trimSubstring(r0, r4, r3)
            if (r3 >= r7) goto L63
            int r3 = r3 + 1
            java.lang.String r3 = okhttp3.internal.Util.trimSubstring(r0, r3, r7)
            goto L65
        L63:
            java.lang.String r3 = ""
        L65:
            java.lang.String r5 = "expires"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L76
            int r4 = r3.length()     // Catch: java.lang.Throwable -> Lb2
            long r21 = parseExpires(r3, r2, r4)     // Catch: java.lang.Throwable -> Lb2
            goto L82
        L76:
            java.lang.String r5 = "max-age"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L85
            long r19 = parseMaxAge(r3)
        L82:
            r18 = 1
            goto Lb2
        L85:
            java.lang.String r5 = "domain"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L94
            java.lang.String r14 = parseDomain(r3)     // Catch: java.lang.Throwable -> Lb2
            r17 = r2
            goto Lb2
        L94:
            java.lang.String r5 = "path"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L9e
            r8 = r3
            goto Lb2
        L9e:
            java.lang.String r3 = "secure"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto La8
            r15 = 1
            goto Lb2
        La8:
            java.lang.String r3 = "httponly"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto Lb2
            r16 = 1
        Lb2:
            int r4 = r7 + 1
            r3 = 59
            r5 = 61
            r7 = 0
            goto L4c
        Lba:
            r0 = -9223372036854775808
            int r3 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r3 != 0) goto Lc2
        Lc0:
            r11 = r0
            goto Le7
        Lc2:
            int r0 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r0 == 0) goto Le5
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r0 > 0) goto Ld4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r0
            goto Ld9
        Ld4:
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Ld9:
            long r0 = r23 + r19
            int r3 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r3 < 0) goto Le3
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 <= 0) goto Lc0
        Le3:
            r11 = r12
            goto Le7
        Le5:
            r11 = r21
        Le7:
            java.lang.String r0 = r25.host()
            if (r14 != 0) goto Lf0
            r13 = r0
            r1 = 0
            goto Lfa
        Lf0:
            boolean r1 = domainMatch(r0, r14)
            if (r1 != 0) goto Lf8
            r1 = 0
            return r1
        Lf8:
            r1 = 0
            r13 = r14
        Lfa:
            int r0 = r0.length()
            int r3 = r13.length()
            if (r0 == r3) goto L10f
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.get()
            java.lang.String r0 = r0.getEffectiveTldPlusOne(r13)
            if (r0 != 0) goto L10f
            return r1
        L10f:
            java.lang.String r0 = "/"
            if (r8 == 0) goto L11c
            boolean r1 = r8.startsWith(r0)
            if (r1 != 0) goto L11a
            goto L11c
        L11a:
            r14 = r8
            goto L12d
        L11c:
            java.lang.String r1 = r25.encodedPath()
            r3 = 47
            int r3 = r1.lastIndexOf(r3)
            if (r3 == 0) goto L12c
            java.lang.String r0 = r1.substring(r2, r3)
        L12c:
            r14 = r0
        L12d:
            okhttp3.Cookie r0 = new okhttp3.Cookie
            r8 = r0
            r10 = r6
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18)
            return r0
        L135:
            r0 = r7
            return r0
    }

    @javax.annotation.Nullable
    public static okhttp3.Cookie parse(okhttp3.HttpUrl r2, java.lang.String r3) {
            long r0 = java.lang.System.currentTimeMillis()
            okhttp3.Cookie r2 = parse(r0, r2, r3)
            return r2
    }

    public static java.util.List<okhttp3.Cookie> parseAll(okhttp3.HttpUrl r4, okhttp3.Headers r5) {
            java.lang.String r0 = "Set-Cookie"
            java.util.List r5 = r5.values(r0)
            int r0 = r5.size()
            r1 = 0
            r2 = 0
        Lc:
            if (r2 >= r0) goto L28
            java.lang.Object r3 = r5.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            okhttp3.Cookie r3 = parse(r4, r3)
            if (r3 != 0) goto L1b
            goto L25
        L1b:
            if (r1 != 0) goto L22
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L22:
            r1.add(r3)
        L25:
            int r2 = r2 + 1
            goto Lc
        L28:
            if (r1 == 0) goto L2f
            java.util.List r4 = java.util.Collections.unmodifiableList(r1)
            goto L33
        L2f:
            java.util.List r4 = java.util.Collections.emptyList()
        L33:
            return r4
    }

    private static java.lang.String parseDomain(java.lang.String r2) {
            java.lang.String r0 = "."
            boolean r1 = r2.endsWith(r0)
            if (r1 != 0) goto L20
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L13
            r0 = 1
            java.lang.String r2 = r2.substring(r0)
        L13:
            java.lang.String r2 = okhttp3.internal.Util.canonicalizeHost(r2)
            if (r2 == 0) goto L1a
            return r2
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    private static long parseExpires(java.lang.String r12, int r13, int r14) {
            r0 = 0
            int r13 = dateCharacterOffset(r12, r13, r14, r0)
            java.util.regex.Pattern r1 = okhttp3.Cookie.TIME_PATTERN
            java.util.regex.Matcher r1 = r1.matcher(r12)
            r2 = -1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L12:
            r9 = 2
            r10 = 1
            if (r13 >= r14) goto L9f
            int r11 = r13 + 1
            int r11 = dateCharacterOffset(r12, r11, r14, r10)
            r1.region(r13, r11)
            if (r4 != r2) goto L47
            java.util.regex.Pattern r13 = okhttp3.Cookie.TIME_PATTERN
            java.util.regex.Matcher r13 = r1.usePattern(r13)
            boolean r13 = r13.matches()
            if (r13 == 0) goto L47
            java.lang.String r13 = r1.group(r10)
            int r4 = java.lang.Integer.parseInt(r13)
            java.lang.String r13 = r1.group(r9)
            int r7 = java.lang.Integer.parseInt(r13)
            r13 = 3
            java.lang.String r13 = r1.group(r13)
            int r8 = java.lang.Integer.parseInt(r13)
            goto L97
        L47:
            if (r5 != r2) goto L5e
            java.util.regex.Pattern r13 = okhttp3.Cookie.DAY_OF_MONTH_PATTERN
            java.util.regex.Matcher r13 = r1.usePattern(r13)
            boolean r13 = r13.matches()
            if (r13 == 0) goto L5e
            java.lang.String r13 = r1.group(r10)
            int r5 = java.lang.Integer.parseInt(r13)
            goto L97
        L5e:
            if (r6 != r2) goto L81
            java.util.regex.Pattern r13 = okhttp3.Cookie.MONTH_PATTERN
            java.util.regex.Matcher r9 = r1.usePattern(r13)
            boolean r9 = r9.matches()
            if (r9 == 0) goto L81
            java.lang.String r6 = r1.group(r10)
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r9)
            java.lang.String r13 = r13.pattern()
            int r13 = r13.indexOf(r6)
            int r6 = r13 / 4
            goto L97
        L81:
            if (r3 != r2) goto L97
            java.util.regex.Pattern r13 = okhttp3.Cookie.YEAR_PATTERN
            java.util.regex.Matcher r13 = r1.usePattern(r13)
            boolean r13 = r13.matches()
            if (r13 == 0) goto L97
            java.lang.String r13 = r1.group(r10)
            int r3 = java.lang.Integer.parseInt(r13)
        L97:
            int r11 = r11 + 1
            int r13 = dateCharacterOffset(r12, r11, r14, r0)
            goto L12
        L9f:
            r12 = 70
            if (r3 < r12) goto La9
            r12 = 99
            if (r3 > r12) goto La9
            int r3 = r3 + 1900
        La9:
            if (r3 < 0) goto Lb1
            r12 = 69
            if (r3 > r12) goto Lb1
            int r3 = r3 + 2000
        Lb1:
            r12 = 1601(0x641, float:2.243E-42)
            if (r3 < r12) goto L119
            if (r6 == r2) goto L113
            if (r5 < r10) goto L10d
            r12 = 31
            if (r5 > r12) goto L10d
            if (r4 < 0) goto L107
            r12 = 23
            if (r4 > r12) goto L107
            if (r7 < 0) goto L101
            r12 = 59
            if (r7 > r12) goto L101
            if (r8 < 0) goto Lfb
            if (r8 > r12) goto Lfb
            java.util.GregorianCalendar r12 = new java.util.GregorianCalendar
            java.util.TimeZone r13 = okhttp3.internal.Util.UTC
            r12.<init>(r13)
            r12.setLenient(r0)
            r12.set(r10, r3)
            int r6 = r6 - r10
            r12.set(r9, r6)
            r13 = 5
            r12.set(r13, r5)
            r13 = 11
            r12.set(r13, r4)
            r13 = 12
            r12.set(r13, r7)
            r13 = 13
            r12.set(r13, r8)
            r13 = 14
            r12.set(r13, r0)
            long r12 = r12.getTimeInMillis()
            return r12
        Lfb:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
        L101:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
        L107:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
        L10d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
        L113:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
        L119:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
    }

    private static long parseMaxAge(java.lang.String r6) {
            r0 = -9223372036854775808
            long r2 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> Lf
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto Ld
            goto Le
        Ld:
            r0 = r2
        Le:
            return r0
        Lf:
            r2 = move-exception
            java.lang.String r3 = "-?\\d+"
            boolean r3 = r6.matches(r3)
            if (r3 == 0) goto L27
            java.lang.String r2 = "-"
            boolean r6 = r6.startsWith(r2)
            if (r6 == 0) goto L21
            goto L26
        L21:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L26:
            return r0
        L27:
            throw r2
    }

    private static boolean pathMatch(okhttp3.HttpUrl r2, java.lang.String r3) {
            java.lang.String r2 = r2.encodedPath()
            boolean r0 = r2.equals(r3)
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            boolean r0 = r2.startsWith(r3)
            if (r0 == 0) goto L28
            java.lang.String r0 = "/"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L1b
            return r1
        L1b:
            int r3 = r3.length()
            char r2 = r2.charAt(r3)
            r3 = 47
            if (r2 != r3) goto L28
            return r1
        L28:
            r2 = 0
            return r2
    }

    public java.lang.String domain() {
            r1 = this;
            java.lang.String r0 = r1.domain
            return r0
    }

    public boolean equals(@javax.annotation.Nullable java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof okhttp3.Cookie
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            okhttp3.Cookie r7 = (okhttp3.Cookie) r7
            java.lang.String r0 = r7.name
            java.lang.String r2 = r6.name
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L51
            java.lang.String r0 = r7.value
            java.lang.String r2 = r6.value
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L51
            java.lang.String r0 = r7.domain
            java.lang.String r2 = r6.domain
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L51
            java.lang.String r0 = r7.path
            java.lang.String r2 = r6.path
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L51
            long r2 = r7.expiresAt
            long r4 = r6.expiresAt
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L51
            boolean r0 = r7.secure
            boolean r2 = r6.secure
            if (r0 != r2) goto L51
            boolean r0 = r7.httpOnly
            boolean r2 = r6.httpOnly
            if (r0 != r2) goto L51
            boolean r0 = r7.persistent
            boolean r2 = r6.persistent
            if (r0 != r2) goto L51
            boolean r7 = r7.hostOnly
            boolean r0 = r6.hostOnly
            if (r7 != r0) goto L51
            r1 = 1
        L51:
            return r1
    }

    public long expiresAt() {
            r2 = this;
            long r0 = r2.expiresAt
            return r0
    }

    public int hashCode() {
            r6 = this;
            java.lang.String r0 = r6.name
            int r0 = r0.hashCode()
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r6.value
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r6.domain
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r6.path
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r6.expiresAt
            r0 = 32
            long r4 = r2 >>> r0
            long r2 = r2 ^ r4
            int r0 = (int) r2
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r6.secure
            r0 = r0 ^ 1
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r6.httpOnly
            r0 = r0 ^ 1
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r6.persistent
            r0 = r0 ^ 1
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r6.hostOnly
            r0 = r0 ^ 1
            int r1 = r1 + r0
            return r1
    }

    public boolean hostOnly() {
            r1 = this;
            boolean r0 = r1.hostOnly
            return r0
    }

    public boolean httpOnly() {
            r1 = this;
            boolean r0 = r1.httpOnly
            return r0
    }

    public boolean matches(okhttp3.HttpUrl r3) {
            r2 = this;
            boolean r0 = r2.hostOnly
            if (r0 == 0) goto Lf
            java.lang.String r0 = r3.host()
            java.lang.String r1 = r2.domain
            boolean r0 = r0.equals(r1)
            goto L19
        Lf:
            java.lang.String r0 = r3.host()
            java.lang.String r1 = r2.domain
            boolean r0 = domainMatch(r0, r1)
        L19:
            r1 = 0
            if (r0 != 0) goto L1d
            return r1
        L1d:
            java.lang.String r0 = r2.path
            boolean r0 = pathMatch(r3, r0)
            if (r0 != 0) goto L26
            return r1
        L26:
            boolean r0 = r2.secure
            if (r0 == 0) goto L31
            boolean r3 = r3.isHttps()
            if (r3 != 0) goto L31
            return r1
        L31:
            r3 = 1
            return r3
    }

    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String path() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    public boolean persistent() {
            r1 = this;
            boolean r0 = r1.persistent
            return r0
    }

    public boolean secure() {
            r1 = this;
            boolean r0 = r1.secure
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.toString(r0)
            return r0
    }

    java.lang.String toString(boolean r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.name
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.String r1 = r5.value
            r0.append(r1)
            boolean r1 = r5.persistent
            if (r1 == 0) goto L3a
            long r1 = r5.expiresAt
            r3 = -9223372036854775808
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L26
            java.lang.String r1 = "; max-age=0"
            r0.append(r1)
            goto L3a
        L26:
            java.lang.String r1 = "; expires="
            java.lang.StringBuilder r1 = r0.append(r1)
            java.util.Date r2 = new java.util.Date
            long r3 = r5.expiresAt
            r2.<init>(r3)
            java.lang.String r2 = okhttp3.internal.http.HttpDate.format(r2)
            r1.append(r2)
        L3a:
            boolean r1 = r5.hostOnly
            if (r1 != 0) goto L4f
            java.lang.String r1 = "; domain="
            r0.append(r1)
            if (r6 == 0) goto L4a
            java.lang.String r6 = "."
            r0.append(r6)
        L4a:
            java.lang.String r6 = r5.domain
            r0.append(r6)
        L4f:
            java.lang.String r6 = "; path="
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r1 = r5.path
            r6.append(r1)
            boolean r6 = r5.secure
            if (r6 == 0) goto L63
            java.lang.String r6 = "; secure"
            r0.append(r6)
        L63:
            boolean r6 = r5.httpOnly
            if (r6 == 0) goto L6c
            java.lang.String r6 = "; httponly"
            r0.append(r6)
        L6c:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public java.lang.String value() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}
