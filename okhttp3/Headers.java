package okhttp3;

/* loaded from: classes.dex */
public final class Headers {
    private final java.lang.String[] namesAndValues;

    public static final class Builder {
        final java.util.List<java.lang.String> namesAndValues;

        public Builder() {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 20
                r0.<init>(r1)
                r2.namesAndValues = r0
                return
        }

        public okhttp3.Headers.Builder add(java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = ":"
                int r0 = r4.indexOf(r0)
                r1 = -1
                if (r0 == r1) goto L1d
                r1 = 0
                java.lang.String r1 = r4.substring(r1, r0)
                java.lang.String r1 = r1.trim()
                int r0 = r0 + 1
                java.lang.String r4 = r4.substring(r0)
                okhttp3.Headers$Builder r4 = r3.add(r1, r4)
                return r4
            L1d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unexpected header: "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        public okhttp3.Headers.Builder add(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                okhttp3.Headers.checkName(r1)
                okhttp3.Headers.checkValue(r2, r1)
                okhttp3.Headers$Builder r1 = r0.addLenient(r1, r2)
                return r1
        }

        public okhttp3.Headers.Builder add(java.lang.String r4, java.time.Instant r5) {
                r3 = this;
                if (r5 == 0) goto L10
                java.util.Date r0 = new java.util.Date
                long r1 = r5.toEpochMilli()
                r0.<init>(r1)
                okhttp3.Headers$Builder r4 = r3.add(r4, r0)
                return r4
            L10:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "value for name "
                r0.<init>(r1)
                java.lang.StringBuilder r4 = r0.append(r4)
                java.lang.String r0 = " == null"
                java.lang.StringBuilder r4 = r4.append(r0)
                java.lang.String r4 = r4.toString()
                r5.<init>(r4)
                throw r5
        }

        public okhttp3.Headers.Builder add(java.lang.String r3, java.util.Date r4) {
                r2 = this;
                if (r4 == 0) goto La
                java.lang.String r4 = okhttp3.internal.http.HttpDate.format(r4)
                r2.add(r3, r4)
                return r2
            La:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "value for name "
                r0.<init>(r1)
                java.lang.StringBuilder r3 = r0.append(r3)
                java.lang.String r0 = " == null"
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
        }

        public okhttp3.Headers.Builder addAll(okhttp3.Headers r5) {
                r4 = this;
                int r0 = r5.size()
                r1 = 0
            L5:
                if (r1 >= r0) goto L15
                java.lang.String r2 = r5.name(r1)
                java.lang.String r3 = r5.value(r1)
                r4.addLenient(r2, r3)
                int r1 = r1 + 1
                goto L5
            L15:
                return r4
        }

        okhttp3.Headers.Builder addLenient(java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = ":"
                r1 = 1
                int r2 = r5.indexOf(r0, r1)
                r3 = -1
                if (r2 == r3) goto L19
                r0 = 0
                java.lang.String r0 = r5.substring(r0, r2)
                int r2 = r2 + r1
                java.lang.String r5 = r5.substring(r2)
                okhttp3.Headers$Builder r5 = r4.addLenient(r0, r5)
                return r5
            L19:
                boolean r0 = r5.startsWith(r0)
                java.lang.String r2 = ""
                if (r0 == 0) goto L2a
                java.lang.String r5 = r5.substring(r1)
                okhttp3.Headers$Builder r5 = r4.addLenient(r2, r5)
                return r5
            L2a:
                okhttp3.Headers$Builder r5 = r4.addLenient(r2, r5)
                return r5
        }

        okhttp3.Headers.Builder addLenient(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.namesAndValues
                r0.add(r2)
                java.util.List<java.lang.String> r2 = r1.namesAndValues
                java.lang.String r3 = r3.trim()
                r2.add(r3)
                return r1
        }

        public okhttp3.Headers.Builder addUnsafeNonAscii(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                okhttp3.Headers.checkName(r1)
                okhttp3.Headers$Builder r1 = r0.addLenient(r1, r2)
                return r1
        }

        public okhttp3.Headers build() {
                r1 = this;
                okhttp3.Headers r0 = new okhttp3.Headers
                r0.<init>(r1)
                return r0
        }

        @javax.annotation.Nullable
        public java.lang.String get(java.lang.String r3) {
                r2 = this;
                java.util.List<java.lang.String> r0 = r2.namesAndValues
                int r0 = r0.size()
                int r0 = r0 + (-2)
            L8:
                if (r0 < 0) goto L26
                java.util.List<java.lang.String> r1 = r2.namesAndValues
                java.lang.Object r1 = r1.get(r0)
                java.lang.String r1 = (java.lang.String) r1
                boolean r1 = r3.equalsIgnoreCase(r1)
                if (r1 == 0) goto L23
                java.util.List<java.lang.String> r3 = r2.namesAndValues
                int r0 = r0 + 1
                java.lang.Object r3 = r3.get(r0)
                java.lang.String r3 = (java.lang.String) r3
                return r3
            L23:
                int r0 = r0 + (-2)
                goto L8
            L26:
                r3 = 0
                return r3
        }

        public okhttp3.Headers.Builder removeAll(java.lang.String r3) {
                r2 = this;
                r0 = 0
            L1:
                java.util.List<java.lang.String> r1 = r2.namesAndValues
                int r1 = r1.size()
                if (r0 >= r1) goto L26
                java.util.List<java.lang.String> r1 = r2.namesAndValues
                java.lang.Object r1 = r1.get(r0)
                java.lang.String r1 = (java.lang.String) r1
                boolean r1 = r3.equalsIgnoreCase(r1)
                if (r1 == 0) goto L23
                java.util.List<java.lang.String> r1 = r2.namesAndValues
                r1.remove(r0)
                java.util.List<java.lang.String> r1 = r2.namesAndValues
                r1.remove(r0)
                int r0 = r0 + (-2)
            L23:
                int r0 = r0 + 2
                goto L1
            L26:
                return r2
        }

        public okhttp3.Headers.Builder set(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                okhttp3.Headers.checkName(r1)
                okhttp3.Headers.checkValue(r2, r1)
                r0.removeAll(r1)
                r0.addLenient(r1, r2)
                return r0
        }

        public okhttp3.Headers.Builder set(java.lang.String r4, java.time.Instant r5) {
                r3 = this;
                if (r5 == 0) goto L10
                java.util.Date r0 = new java.util.Date
                long r1 = r5.toEpochMilli()
                r0.<init>(r1)
                okhttp3.Headers$Builder r4 = r3.set(r4, r0)
                return r4
            L10:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "value for name "
                r0.<init>(r1)
                java.lang.StringBuilder r4 = r0.append(r4)
                java.lang.String r0 = " == null"
                java.lang.StringBuilder r4 = r4.append(r0)
                java.lang.String r4 = r4.toString()
                r5.<init>(r4)
                throw r5
        }

        public okhttp3.Headers.Builder set(java.lang.String r3, java.util.Date r4) {
                r2 = this;
                if (r4 == 0) goto La
                java.lang.String r4 = okhttp3.internal.http.HttpDate.format(r4)
                r2.set(r3, r4)
                return r2
            La:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "value for name "
                r0.<init>(r1)
                java.lang.StringBuilder r3 = r0.append(r3)
                java.lang.String r0 = " == null"
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
        }
    }

    Headers(okhttp3.Headers.Builder r2) {
            r1 = this;
            r1.<init>()
            java.util.List<java.lang.String> r0 = r2.namesAndValues
            java.util.List<java.lang.String> r2 = r2.namesAndValues
            int r2 = r2.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r2 = r0.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1.namesAndValues = r2
            return
    }

    private Headers(java.lang.String[] r1) {
            r0 = this;
            r0.<init>()
            r0.namesAndValues = r1
            return
    }

    static void checkName(java.lang.String r5) {
            if (r5 == 0) goto L47
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L3f
            int r0 = r5.length()
            r1 = 0
            r2 = r1
        Le:
            if (r2 >= r0) goto L3e
            char r3 = r5.charAt(r2)
            r4 = 32
            if (r3 <= r4) goto L1f
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 >= r4) goto L1f
            int r2 = r2 + 1
            goto Le
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r1] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r2 = 1
            r4[r2] = r1
            r1 = 2
            r4[r1] = r5
            java.lang.String r5 = "Unexpected char %#04x at %d in header name: %s"
            java.lang.String r5 = okhttp3.internal.Util.format(r5, r4)
            r0.<init>(r5)
            throw r0
        L3e:
            return
        L3f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "name is empty"
            r5.<init>(r0)
            throw r5
        L47:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "name == null"
            r5.<init>(r0)
            throw r5
    }

    static void checkValue(java.lang.String r5, java.lang.String r6) {
            if (r5 == 0) goto L40
            int r0 = r5.length()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L3f
            char r3 = r5.charAt(r2)
            r4 = 31
            if (r3 > r4) goto L16
            r4 = 9
            if (r3 != r4) goto L1d
        L16:
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 >= r4) goto L1d
            int r2 = r2 + 1
            goto L8
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r1] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r2 = 1
            r4[r2] = r1
            r1 = 2
            r4[r1] = r6
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "Unexpected char %#04x at %d in %s value: %s"
            java.lang.String r5 = okhttp3.internal.Util.format(r5, r4)
            r0.<init>(r5)
            throw r0
        L3f:
            return
        L40:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "value for name "
            r0.<init>(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r0 = " == null"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    @javax.annotation.Nullable
    private static java.lang.String get(java.lang.String[] r2, java.lang.String r3) {
            int r0 = r2.length
            int r0 = r0 + (-2)
        L3:
            if (r0 < 0) goto L15
            r1 = r2[r0]
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L12
            int r0 = r0 + 1
            r2 = r2[r0]
            return r2
        L12:
            int r0 = r0 + (-2)
            goto L3
        L15:
            r2 = 0
            return r2
    }

    /* renamed from: of */
    public static okhttp3.Headers m93of(java.util.Map<java.lang.String, java.lang.String> r4) {
            if (r4 == 0) goto L5c
            int r0 = r4.size()
            int r0 = r0 * 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L13:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r2.getValue()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r3.trim()
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.trim()
            checkName(r3)
            checkValue(r2, r3)
            r0[r1] = r3
            int r3 = r1 + 1
            r0[r3] = r2
            int r1 = r1 + 2
            goto L13
        L4e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Headers cannot be null"
            r4.<init>(r0)
            throw r4
        L56:
            okhttp3.Headers r4 = new okhttp3.Headers
            r4.<init>(r0)
            return r4
        L5c:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "headers == null"
            r4.<init>(r0)
            throw r4
    }

    /* renamed from: of */
    public static okhttp3.Headers m94of(java.lang.String... r3) {
            if (r3 == 0) goto L47
            int r0 = r3.length
            int r0 = r0 % 2
            if (r0 != 0) goto L3f
            java.lang.Object r3 = r3.clone()
            java.lang.String[] r3 = (java.lang.String[]) r3
            r0 = 0
            r1 = r0
        Lf:
            int r2 = r3.length
            if (r1 >= r2) goto L27
            r2 = r3[r1]
            if (r2 == 0) goto L1f
            java.lang.String r2 = r2.trim()
            r3[r1] = r2
            int r1 = r1 + 1
            goto Lf
        L1f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Headers cannot be null"
            r3.<init>(r0)
            throw r3
        L27:
            int r1 = r3.length
            if (r0 >= r1) goto L39
            r1 = r3[r0]
            int r2 = r0 + 1
            r2 = r3[r2]
            checkName(r1)
            checkValue(r2, r1)
            int r0 = r0 + 2
            goto L27
        L39:
            okhttp3.Headers r0 = new okhttp3.Headers
            r0.<init>(r3)
            return r0
        L3f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Expected alternating header names and values"
            r3.<init>(r0)
            throw r3
        L47:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "namesAndValues == null"
            r3.<init>(r0)
            throw r3
    }

    public long byteCount() {
            r6 = this;
            java.lang.String[] r0 = r6.namesAndValues
            int r1 = r0.length
            int r1 = r1 * 2
            long r1 = (long) r1
            int r0 = r0.length
            r3 = 0
        L8:
            if (r3 >= r0) goto L17
            java.lang.String[] r4 = r6.namesAndValues
            r4 = r4[r3]
            int r4 = r4.length()
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L8
        L17:
            return r1
    }

    public boolean equals(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okhttp3.Headers
            if (r0 == 0) goto L12
            okhttp3.Headers r2 = (okhttp3.Headers) r2
            java.lang.String[] r2 = r2.namesAndValues
            java.lang.String[] r0 = r1.namesAndValues
            boolean r2 = java.util.Arrays.equals(r2, r0)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    @javax.annotation.Nullable
    public java.lang.String get(java.lang.String r2) {
            r1 = this;
            java.lang.String[] r0 = r1.namesAndValues
            java.lang.String r2 = get(r0, r2)
            return r2
    }

    @javax.annotation.Nullable
    public java.util.Date getDate(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.get(r1)
            if (r1 == 0) goto Lb
            java.util.Date r1 = okhttp3.internal.http.HttpDate.parse(r1)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    @javax.annotation.Nullable
    public java.time.Instant getInstant(java.lang.String r1) {
            r0 = this;
            java.util.Date r1 = r0.getDate(r1)
            if (r1 == 0) goto Lb
            java.time.Instant r1 = r1.toInstant()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    public int hashCode() {
            r1 = this;
            java.lang.String[] r0 = r1.namesAndValues
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public java.lang.String name(int r2) {
            r1 = this;
            java.lang.String[] r0 = r1.namesAndValues
            int r2 = r2 * 2
            r2 = r0[r2]
            return r2
    }

    public java.util.Set<java.lang.String> names() {
            r4 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            int r1 = r4.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L18
            java.lang.String r3 = r4.name(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto Lc
        L18:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    public okhttp3.Headers.Builder newBuilder() {
            r3 = this;
            okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
            r0.<init>()
            java.util.List<java.lang.String> r1 = r0.namesAndValues
            java.lang.String[] r2 = r3.namesAndValues
            java.util.Collections.addAll(r1, r2)
            return r0
    }

    public int size() {
            r1 = this;
            java.lang.String[] r0 = r1.namesAndValues
            int r0 = r0.length
            int r0 = r0 / 2
            return r0
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> toMultimap() {
            r6 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            int r1 = r6.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L33
            java.lang.String r3 = r6.name(r2)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.Object r4 = r0.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L29
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 2
            r4.<init>(r5)
            r0.put(r3, r4)
        L29:
            java.lang.String r3 = r6.value(r2)
            r4.add(r3)
            int r2 = r2 + 1
            goto Lc
        L33:
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L2a
            java.lang.String r3 = r5.name(r2)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r5.value(r2)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "\n"
            r3.append(r4)
            int r2 = r2 + 1
            goto La
        L2a:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String value(int r2) {
            r1 = this;
            java.lang.String[] r0 = r1.namesAndValues
            int r2 = r2 * 2
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    public java.util.List<java.lang.String> values(java.lang.String r5) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L24
            java.lang.String r3 = r4.name(r2)
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L21
            if (r1 != 0) goto L1a
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 2
            r1.<init>(r3)
        L1a:
            java.lang.String r3 = r4.value(r2)
            r1.add(r3)
        L21:
            int r2 = r2 + 1
            goto L6
        L24:
            if (r1 == 0) goto L2b
            java.util.List r5 = java.util.Collections.unmodifiableList(r1)
            goto L2f
        L2b:
            java.util.List r5 = java.util.Collections.emptyList()
        L2f:
            return r5
    }
}
