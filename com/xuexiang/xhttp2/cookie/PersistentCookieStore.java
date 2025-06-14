package com.xuexiang.xhttp2.cookie;

/* loaded from: classes.dex */
public class PersistentCookieStore {
    private static final java.lang.String COOKIE_PREFS = "Cookies_Prefs";
    private final android.content.SharedPreferences cookiePrefs;
    private final java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> cookies;

    public PersistentCookieStore(android.content.Context r11) {
            r10 = this;
            r10.<init>()
            java.lang.String r0 = "Cookies_Prefs"
            r1 = 0
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r0, r1)
            r10.cookiePrefs = r11
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r10.cookies = r0
            java.util.Map r11 = r11.getAll()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L1f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ","
            java.lang.String[] r2 = android.text.TextUtils.split(r2, r3)
            int r3 = r2.length
            r4 = r1
        L39:
            if (r4 >= r3) goto L1f
            r5 = r2[r4]
            android.content.SharedPreferences r6 = r10.cookiePrefs
            r7 = 0
            java.lang.String r6 = r6.getString(r5, r7)
            if (r6 == 0) goto L75
            okhttp3.Cookie r6 = r10.decodeCookie(r6)
            if (r6 == 0) goto L75
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r7 = r10.cookies
            java.lang.Object r8 = r0.getKey()
            boolean r7 = r7.containsKey(r8)
            if (r7 != 0) goto L66
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r7 = r10.cookies
            java.lang.Object r8 = r0.getKey()
            java.util.concurrent.ConcurrentHashMap r9 = new java.util.concurrent.ConcurrentHashMap
            r9.<init>()
            r7.put(r8, r9)
        L66:
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r7 = r10.cookies
            java.lang.Object r8 = r0.getKey()
            java.lang.Object r7 = r7.get(r8)
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7
            r7.put(r5, r6)
        L75:
            int r4 = r4 + 1
            goto L39
        L78:
            return
    }

    private java.lang.String byteArrayToHexString(byte[] r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        La:
            if (r2 >= r1) goto L23
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 16
            if (r3 >= r4) goto L19
            r4 = 48
            r0.append(r4)
        L19:
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L23:
            java.lang.String r6 = r0.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r6 = r6.toUpperCase(r0)
            return r6
    }

    private okhttp3.Cookie decodeCookie(java.lang.String r3) {
            r2 = this;
            byte[] r3 = r2.hexStringToByteArray(r3)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r3)
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.ClassNotFoundException -> L19 java.io.IOException -> L31
            r3.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L19 java.io.IOException -> L31
            java.lang.Object r3 = r3.readObject()     // Catch: java.lang.ClassNotFoundException -> L19 java.io.IOException -> L31
            com.xuexiang.xhttp2.cookie.SerializableOkHttpCookies r3 = (com.xuexiang.xhttp2.cookie.SerializableOkHttpCookies) r3     // Catch: java.lang.ClassNotFoundException -> L19 java.io.IOException -> L31
            okhttp3.Cookie r3 = r3.getCookies()     // Catch: java.lang.ClassNotFoundException -> L19 java.io.IOException -> L31
            goto L49
        L19:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ClassNotFoundException in decodeCookie"
            r0.<init>(r1)
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            com.xuexiang.xhttp2.logs.HttpLog.m33d(r3)
            goto L48
        L31:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IOException in decodeCookie"
            r0.<init>(r1)
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            com.xuexiang.xhttp2.logs.HttpLog.m33d(r3)
        L48:
            r3 = 0
        L49:
            return r3
    }

    private java.lang.String getCookieToken(okhttp3.Cookie r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.name()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "@"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r3 = r3.domain()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private byte[] hexStringToByteArray(java.lang.String r8) {
            r7 = this;
            int r0 = r8.length()
            int r1 = r0 / 2
            byte[] r1 = new byte[r1]
            r2 = 0
        L9:
            if (r2 >= r0) goto L2a
            int r3 = r2 / 2
            char r4 = r8.charAt(r2)
            r5 = 16
            int r4 = java.lang.Character.digit(r4, r5)
            int r4 = r4 << 4
            int r6 = r2 + 1
            char r6 = r8.charAt(r6)
            int r5 = java.lang.Character.digit(r6, r5)
            int r4 = r4 + r5
            byte r4 = (byte) r4
            r1[r3] = r4
            int r2 = r2 + 2
            goto L9
        L2a:
            return r1
    }

    public void add(okhttp3.HttpUrl r5, okhttp3.Cookie r6) {
            r4 = this;
            java.lang.String r0 = r4.getCookieToken(r6)
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r1 = r4.cookies
            java.lang.String r2 = r5.host()
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L1e
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r1 = r4.cookies
            java.lang.String r2 = r5.host()
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r1.put(r2, r3)
        L1e:
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r1 = r4.cookies
            java.lang.String r2 = r5.host()
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L39
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r1 = r4.cookies
            java.lang.String r2 = r5.host()
            java.lang.Object r1 = r1.get(r2)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            r1.remove(r0)
        L39:
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r1 = r4.cookies
            java.lang.String r2 = r5.host()
            java.lang.Object r1 = r1.get(r2)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            r1.put(r0, r6)
            boolean r1 = r6.persistent()
            if (r1 == 0) goto L81
            android.content.SharedPreferences r1 = r4.cookiePrefs
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = r5.host()
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r3 = r4.cookies
            java.lang.String r5 = r5.host()
            java.lang.Object r5 = r3.get(r5)
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.util.Set r5 = r5.keySet()
            java.lang.String r3 = ","
            java.lang.String r5 = android.text.TextUtils.join(r3, r5)
            r1.putString(r2, r5)
            com.xuexiang.xhttp2.cookie.SerializableOkHttpCookies r5 = new com.xuexiang.xhttp2.cookie.SerializableOkHttpCookies
            r5.<init>(r6)
            java.lang.String r5 = r4.encodeCookie(r5)
            r1.putString(r0, r5)
            r1.apply()
            goto L94
        L81:
            android.content.SharedPreferences r6 = r4.cookiePrefs
            android.content.SharedPreferences$Editor r6 = r6.edit()
            java.lang.String r5 = r5.host()
            r6.remove(r5)
            r6.remove(r0)
            r6.apply()
        L94:
            return
    }

    public void addCookies(java.util.List<okhttp3.Cookie> r6) {
            r5 = this;
            java.util.Iterator r0 = r6.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            okhttp3.Cookie r1 = (okhttp3.Cookie) r1
            java.lang.String r2 = r1.domain()
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r3 = r5.cookies
            java.lang.Object r3 = r3.get(r2)
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            if (r3 != 0) goto L28
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r4 = r5.cookies
            r4.put(r2, r3)
        L28:
            r6.add(r1)
            goto L4
        L2c:
            return
    }

    protected java.lang.String encodeCookie(com.xuexiang.xhttp2.cookie.SerializableOkHttpCookies r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.io.IOException -> L1a
            r2.<init>(r1)     // Catch: java.io.IOException -> L1a
            r2.writeObject(r4)     // Catch: java.io.IOException -> L1a
            byte[] r4 = r1.toByteArray()
            java.lang.String r4 = r3.byteArrayToHexString(r4)
            return r4
        L1a:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "IOException in encodeCookie"
            r1.<init>(r2)
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            com.xuexiang.xhttp2.logs.HttpLog.m33d(r4)
            return r0
    }

    public java.util.List<okhttp3.Cookie> get(okhttp3.HttpUrl r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r1 = r3.cookies
            java.lang.String r2 = r4.host()
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L26
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r1 = r3.cookies
            java.lang.String r4 = r4.host()
            java.lang.Object r4 = r1.get(r4)
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            if (r4 == 0) goto L26
            java.util.Collection r4 = r4.values()
            r0.addAll(r4)
        L26:
            return r0
    }

    public java.util.List<okhttp3.Cookie> getCookies() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r1 = r4.cookies
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r3 = r4.cookies
            java.lang.Object r2 = r3.get(r2)
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            if (r2 == 0) goto Lf
            java.util.Collection r2 = r2.values()
            r0.addAll(r2)
            goto Lf
        L2d:
            return r0
    }

    public boolean remove(okhttp3.HttpUrl r3, okhttp3.Cookie r4) {
            r2 = this;
            java.lang.String r4 = r2.getCookieToken(r4)
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r0 = r2.cookies
            java.lang.String r1 = r3.host()
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L64
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r0 = r2.cookies
            java.lang.String r1 = r3.host()
            java.lang.Object r0 = r0.get(r1)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L64
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r0 = r2.cookies
            java.lang.String r1 = r3.host()
            java.lang.Object r0 = r0.get(r1)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.remove(r4)
            android.content.SharedPreferences r0 = r2.cookiePrefs
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences r1 = r2.cookiePrefs
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L42
            r0.remove(r4)
        L42:
            java.lang.String r4 = r3.host()
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r1 = r2.cookies
            java.lang.String r3 = r3.host()
            java.lang.Object r3 = r1.get(r3)
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            java.util.Set r3 = r3.keySet()
            java.lang.String r1 = ","
            java.lang.String r3 = android.text.TextUtils.join(r1, r3)
            r0.putString(r4, r3)
            r0.apply()
            r3 = 1
            return r3
        L64:
            r3 = 0
            return r3
    }

    public boolean removeAll() {
            r1 = this;
            android.content.SharedPreferences r0 = r1.cookiePrefs
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.clear()
            r0.apply()
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, okhttp3.Cookie>> r0 = r1.cookies
            r0.clear()
            r0 = 1
            return r0
    }
}
