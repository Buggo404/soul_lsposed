package androidx.core.graphics;

/* loaded from: classes.dex */
class TypefaceCompatBaseImpl {
    private static final int INVALID_KEY = 0;
    private static final java.lang.String TAG = "TypefaceCompatBaseImpl";
    private java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry> mFontFamilies;



    private interface StyleExtractor<T> {
        int getWeight(T r1);

        boolean isItalic(T r1);
    }

    TypefaceCompatBaseImpl() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.mFontFamilies = r0
            return
    }

    private void addFontFamily(android.graphics.Typeface r5, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r6) {
            r4 = this;
            long r0 = getUniqueKey(r5)
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L13
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry> r5 = r4.mFontFamilies
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.put(r0, r6)
        L13:
            return
    }

    private androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry findBestEntry(androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r2, int r3) {
            r1 = this;
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r2 = r2.getEntries()
            androidx.core.graphics.TypefaceCompatBaseImpl$2 r0 = new androidx.core.graphics.TypefaceCompatBaseImpl$2
            r0.<init>(r1)
            java.lang.Object r2 = findBestFont(r2, r3, r0)
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry r2 = (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry) r2
            return r2
    }

    private static <T> T findBestFont(T[] r10, int r11, androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor<T> r12) {
            r0 = r11 & 1
            if (r0 != 0) goto L7
            r0 = 400(0x190, float:5.6E-43)
            goto L9
        L7:
            r0 = 700(0x2bc, float:9.81E-43)
        L9:
            r11 = r11 & 2
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L11
            r11 = r2
            goto L12
        L11:
            r11 = r1
        L12:
            int r3 = r10.length
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = r1
        L18:
            if (r6 >= r3) goto L3a
            r7 = r10[r6]
            int r8 = r12.getWeight(r7)
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            int r8 = r8 * 2
            boolean r9 = r12.isItalic(r7)
            if (r9 != r11) goto L2f
            r9 = r1
            goto L30
        L2f:
            r9 = r2
        L30:
            int r8 = r8 + r9
            if (r4 == 0) goto L35
            if (r5 <= r8) goto L37
        L35:
            r4 = r7
            r5 = r8
        L37:
            int r6 = r6 + 1
            goto L18
        L3a:
            return r4
    }

    private static long getUniqueKey(android.graphics.Typeface r6) {
            java.lang.String r0 = "Could not retrieve font from family."
            java.lang.String r1 = "TypefaceCompatBaseImpl"
            r2 = 0
            if (r6 != 0) goto L9
            return r2
        L9:
            java.lang.Class<android.graphics.Typeface> r4 = android.graphics.Typeface.class
            java.lang.String r5 = "native_instance"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.IllegalAccessException -> L20 java.lang.NoSuchFieldException -> L25
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.IllegalAccessException -> L20 java.lang.NoSuchFieldException -> L25
            java.lang.Object r6 = r4.get(r6)     // Catch: java.lang.IllegalAccessException -> L20 java.lang.NoSuchFieldException -> L25
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.IllegalAccessException -> L20 java.lang.NoSuchFieldException -> L25
            long r0 = r6.longValue()     // Catch: java.lang.IllegalAccessException -> L20 java.lang.NoSuchFieldException -> L25
            return r0
        L20:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            return r2
        L25:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            return r2
    }

    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context r3, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r4, android.content.res.Resources r5, int r6) {
            r2 = this;
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry r0 = r2.findBestEntry(r4, r6)
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            int r1 = r0.getResourceId()
            java.lang.String r0 = r0.getFileName()
            android.graphics.Typeface r3 = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(r3, r5, r1, r0, r6)
            r2.addFontFamily(r3, r4)
            return r3
    }

    public android.graphics.Typeface createFromFontInfo(android.content.Context r3, android.os.CancellationSignal r4, androidx.core.provider.FontsContractCompat.FontInfo[] r5, int r6) {
            r2 = this;
            int r4 = r5.length
            r0 = 1
            r1 = 0
            if (r4 >= r0) goto L6
            return r1
        L6:
            androidx.core.provider.FontsContractCompat$FontInfo r4 = r2.findBestInfo(r5, r6)
            android.content.ContentResolver r5 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L26
            android.net.Uri r4 = r4.getUri()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L26
            java.io.InputStream r4 = r5.openInputStream(r4)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L26
            android.graphics.Typeface r3 = r2.createFromInputStream(r3, r4)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L27
            androidx.core.graphics.TypefaceCompatUtil.closeQuietly(r4)
            return r3
        L1e:
            r3 = move-exception
            r1 = r4
            goto L22
        L21:
            r3 = move-exception
        L22:
            androidx.core.graphics.TypefaceCompatUtil.closeQuietly(r1)
            throw r3
        L26:
            r4 = r1
        L27:
            androidx.core.graphics.TypefaceCompatUtil.closeQuietly(r4)
            return r1
    }

    protected android.graphics.Typeface createFromInputStream(android.content.Context r2, java.io.InputStream r3) {
            r1 = this;
            java.io.File r2 = androidx.core.graphics.TypefaceCompatUtil.getTempFile(r2)
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            boolean r3 = androidx.core.graphics.TypefaceCompatUtil.copyToFile(r2, r3)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            if (r3 != 0) goto L12
            r2.delete()
            return r0
        L12:
            java.lang.String r3 = r2.getPath()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromFile(r3)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            r2.delete()
            return r3
        L1e:
            r3 = move-exception
            r2.delete()
            throw r3
        L23:
            r2.delete()
            return r0
    }

    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
            r0 = this;
            java.io.File r1 = androidx.core.graphics.TypefaceCompatUtil.getTempFile(r1)
            r4 = 0
            if (r1 != 0) goto L8
            return r4
        L8:
            boolean r2 = androidx.core.graphics.TypefaceCompatUtil.copyToFile(r1, r2, r3)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            if (r2 != 0) goto L12
            r1.delete()
            return r4
        L12:
            java.lang.String r2 = r1.getPath()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromFile(r2)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            r1.delete()
            return r2
        L1e:
            r2 = move-exception
            r1.delete()
            throw r2
        L23:
            r1.delete()
            return r4
    }

    protected androidx.core.provider.FontsContractCompat.FontInfo findBestInfo(androidx.core.provider.FontsContractCompat.FontInfo[] r2, int r3) {
            r1 = this;
            androidx.core.graphics.TypefaceCompatBaseImpl$1 r0 = new androidx.core.graphics.TypefaceCompatBaseImpl$1
            r0.<init>(r1)
            java.lang.Object r2 = findBestFont(r2, r3, r0)
            androidx.core.provider.FontsContractCompat$FontInfo r2 = (androidx.core.provider.FontsContractCompat.FontInfo) r2
            return r2
    }

    androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry getFontFamily(android.graphics.Typeface r5) {
            r4 = this;
            long r0 = getUniqueKey(r5)
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto Lc
            r5 = 0
            return r5
        Lc:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry> r5 = r4.mFontFamilies
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r5 = r5.get(r0)
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r5 = (androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry) r5
            return r5
    }
}
