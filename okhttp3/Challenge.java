package okhttp3;

/* loaded from: classes.dex */
public final class Challenge {
    private final java.util.Map<java.lang.String, java.lang.String> authParams;
    private final java.lang.String scheme;

    public Challenge(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L1a
            if (r2 == 0) goto L12
            r0.scheme = r1
            java.lang.String r1 = "realm"
            java.util.Map r1 = java.util.Collections.singletonMap(r1, r2)
            r0.authParams = r1
            return
        L12:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "realm == null"
            r1.<init>(r2)
            throw r1
        L1a:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "scheme == null"
            r1.<init>(r2)
            throw r1
    }

    public Challenge(java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L4f
            if (r5 == 0) goto L47
            r3.scheme = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            if (r1 != 0) goto L2a
            r1 = 0
            goto L36
        L2a:
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r2)
        L36:
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r4.put(r1, r0)
            goto L16
        L40:
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)
            r3.authParams = r4
            return
        L47:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "authParams == null"
            r4.<init>(r5)
            throw r4
        L4f:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "scheme == null"
            r4.<init>(r5)
            throw r4
    }

    public java.util.Map<java.lang.String, java.lang.String> authParams() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.authParams
            return r0
    }

    public java.nio.charset.Charset charset() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.authParams
            java.lang.String r1 = "charset"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L11
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.Exception -> L11
            return r0
        L11:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            return r0
    }

    public boolean equals(@javax.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.Challenge
            if (r0 == 0) goto L1c
            okhttp3.Challenge r3 = (okhttp3.Challenge) r3
            java.lang.String r0 = r3.scheme
            java.lang.String r1 = r2.scheme
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.authParams
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.authParams
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            return r3
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.scheme
            int r0 = r0.hashCode()
            r1 = 899(0x383, float:1.26E-42)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.authParams
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String realm() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.authParams
            java.lang.String r1 = "realm"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.lang.String scheme() {
            r1 = this;
            java.lang.String r0 = r1.scheme
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.scheme
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " authParams="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.authParams
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public okhttp3.Challenge withCharset(java.nio.charset.Charset r3) {
            r2 = this;
            if (r3 == 0) goto L1a
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.authParams
            r0.<init>(r1)
            java.lang.String r1 = "charset"
            java.lang.String r3 = r3.name()
            r0.put(r1, r3)
            okhttp3.Challenge r3 = new okhttp3.Challenge
            java.lang.String r1 = r2.scheme
            r3.<init>(r1, r0)
            return r3
        L1a:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "charset == null"
            r3.<init>(r0)
            throw r3
    }
}
