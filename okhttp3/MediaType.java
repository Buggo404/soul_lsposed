package okhttp3;

/* loaded from: classes.dex */
public final class MediaType {
    private static final java.util.regex.Pattern PARAMETER = null;
    private static final java.lang.String QUOTED = "\"([^\"]*)\"";
    private static final java.lang.String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private static final java.util.regex.Pattern TYPE_SUBTYPE = null;

    @javax.annotation.Nullable
    private final java.lang.String charset;
    private final java.lang.String mediaType;
    private final java.lang.String subtype;
    private final java.lang.String type;

    static {
            java.lang.String r0 = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.MediaType.TYPE_SUBTYPE = r0
            java.lang.String r0 = ";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.MediaType.PARAMETER = r0
            return
    }

    private MediaType(java.lang.String r1, java.lang.String r2, java.lang.String r3, @javax.annotation.Nullable java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.mediaType = r1
            r0.type = r2
            r0.subtype = r3
            r0.charset = r4
            return
    }

    public static okhttp3.MediaType get(java.lang.String r11) {
            java.util.regex.Pattern r0 = okhttp3.MediaType.TYPE_SUBTYPE
            java.util.regex.Matcher r0 = r0.matcher(r11)
            boolean r1 = r0.lookingAt()
            r2 = 34
            if (r1 == 0) goto Le2
            r1 = 1
            java.lang.String r3 = r0.group(r1)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r4)
            r4 = 2
            java.lang.String r5 = r0.group(r4)
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r6)
            java.util.regex.Pattern r6 = okhttp3.MediaType.PARAMETER
            java.util.regex.Matcher r6 = r6.matcher(r11)
            int r0 = r0.end()
            r7 = 0
        L2f:
            int r8 = r11.length()
            if (r0 >= r8) goto Ldc
            int r8 = r11.length()
            r6.region(r0, r8)
            boolean r8 = r6.lookingAt()
            java.lang.String r9 = "\" for: \""
            if (r8 == 0) goto Lb7
            java.lang.String r0 = r6.group(r1)
            if (r0 == 0) goto Lb1
            java.lang.String r8 = "charset"
            boolean r0 = r0.equalsIgnoreCase(r8)
            if (r0 != 0) goto L53
            goto Lb1
        L53:
            java.lang.String r0 = r6.group(r4)
            if (r0 == 0) goto L77
            java.lang.String r8 = "'"
            boolean r10 = r0.startsWith(r8)
            if (r10 == 0) goto L7c
            boolean r8 = r0.endsWith(r8)
            if (r8 == 0) goto L7c
            int r8 = r0.length()
            if (r8 <= r4) goto L7c
            int r8 = r0.length()
            int r8 = r8 - r1
            java.lang.String r0 = r0.substring(r1, r8)
            goto L7c
        L77:
            r0 = 3
            java.lang.String r0 = r6.group(r0)
        L7c:
            if (r7 == 0) goto Lb0
            boolean r8 = r0.equalsIgnoreCase(r7)
            if (r8 == 0) goto L85
            goto Lb0
        L85:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Multiple charsets defined: \""
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r4 = "\" and: \""
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.StringBuilder r11 = r0.append(r11)
            java.lang.StringBuilder r11 = r11.append(r2)
            java.lang.String r11 = r11.toString()
            r1.<init>(r11)
            throw r1
        Lb0:
            r7 = r0
        Lb1:
            int r0 = r6.end()
            goto L2f
        Lb7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Parameter is not formatted correctly: \""
            r3.<init>(r4)
            java.lang.String r0 = r11.substring(r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.StringBuilder r11 = r0.append(r11)
            java.lang.StringBuilder r11 = r11.append(r2)
            java.lang.String r11 = r11.toString()
            r1.<init>(r11)
            throw r1
        Ldc:
            okhttp3.MediaType r0 = new okhttp3.MediaType
            r0.<init>(r11, r3, r5, r7)
            return r0
        Le2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "No subtype found for: \""
            r1.<init>(r3)
            java.lang.StringBuilder r11 = r1.append(r11)
            java.lang.StringBuilder r11 = r11.append(r2)
            java.lang.String r11 = r11.toString()
            r0.<init>(r11)
            throw r0
    }

    @javax.annotation.Nullable
    public static okhttp3.MediaType parse(java.lang.String r0) {
            okhttp3.MediaType r0 = get(r0)     // Catch: java.lang.IllegalArgumentException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    @javax.annotation.Nullable
    public java.nio.charset.Charset charset() {
            r1 = this;
            r0 = 0
            java.nio.charset.Charset r0 = r1.charset(r0)
            return r0
    }

    @javax.annotation.Nullable
    public java.nio.charset.Charset charset(@javax.annotation.Nullable java.nio.charset.Charset r2) {
            r1 = this;
            java.lang.String r0 = r1.charset     // Catch: java.lang.IllegalArgumentException -> L8
            if (r0 == 0) goto L8
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> L8
        L8:
            return r2
    }

    public boolean equals(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okhttp3.MediaType
            if (r0 == 0) goto L12
            okhttp3.MediaType r2 = (okhttp3.MediaType) r2
            java.lang.String r2 = r2.mediaType
            java.lang.String r0 = r1.mediaType
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.mediaType
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String subtype() {
            r1 = this;
            java.lang.String r0 = r1.subtype
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.mediaType
            return r0
    }

    public java.lang.String type() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }
}
