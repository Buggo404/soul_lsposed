package androidx.core.graphics;

/* loaded from: classes.dex */
public class TypefaceCompat {
    private static final androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> sTypefaceCache = null;
    private static final androidx.core.graphics.TypefaceCompatBaseImpl sTypefaceCompatImpl = null;

    public static class ResourcesCallbackAdapter extends androidx.core.provider.FontsContractCompat.FontRequestCallback {
        private androidx.core.content.res.ResourcesCompat.FontCallback mFontCallback;

        public ResourcesCallbackAdapter(androidx.core.content.res.ResourcesCompat.FontCallback r1) {
                r0 = this;
                r0.<init>()
                r0.mFontCallback = r1
                return
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRequestFailed(int r2) {
                r1 = this;
                androidx.core.content.res.ResourcesCompat$FontCallback r0 = r1.mFontCallback
                if (r0 == 0) goto L7
                r0.onFontRetrievalFailed(r2)
            L7:
                return
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRetrieved(android.graphics.Typeface r2) {
                r1 = this;
                androidx.core.content.res.ResourcesCompat$FontCallback r0 = r1.mFontCallback
                if (r0 == 0) goto L7
                r0.onFontRetrieved(r2)
            L7:
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            androidx.core.graphics.TypefaceCompatApi29Impl r0 = new androidx.core.graphics.TypefaceCompatApi29Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L3f
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L1c
            androidx.core.graphics.TypefaceCompatApi28Impl r0 = new androidx.core.graphics.TypefaceCompatApi28Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L3f
        L1c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L2a
            androidx.core.graphics.TypefaceCompatApi26Impl r0 = new androidx.core.graphics.TypefaceCompatApi26Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L3f
        L2a:
            boolean r0 = androidx.core.graphics.TypefaceCompatApi24Impl.isUsable()
            if (r0 == 0) goto L38
            androidx.core.graphics.TypefaceCompatApi24Impl r0 = new androidx.core.graphics.TypefaceCompatApi24Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L3f
        L38:
            androidx.core.graphics.TypefaceCompatApi21Impl r0 = new androidx.core.graphics.TypefaceCompatApi21Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
        L3f:
            androidx.collection.LruCache r0 = new androidx.collection.LruCache
            r1 = 16
            r0.<init>(r1)
            androidx.core.graphics.TypefaceCompat.sTypefaceCache = r0
            return
    }

    private TypefaceCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void clearCache() {
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            r0.evictAll()
            return
    }

    public static android.graphics.Typeface create(android.content.Context r0, android.graphics.Typeface r1, int r2) {
            if (r0 == 0) goto L7
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r1, r2)
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Context cannot be null"
            r0.<init>(r1)
            throw r0
    }

    public static android.graphics.Typeface createFromFontInfo(android.content.Context r1, android.os.CancellationSignal r2, androidx.core.provider.FontsContractCompat.FontInfo[] r3, int r4) {
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            android.graphics.Typeface r1 = r0.createFromFontInfo(r1, r2, r3, r4)
            return r1
    }

    public static android.graphics.Typeface createFromResourcesFamilyXml(android.content.Context r13, androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry r14, android.content.res.Resources r15, int r16, int r17, androidx.core.content.res.ResourcesCompat.FontCallback r18, android.os.Handler r19, boolean r20) {
            r0 = r14
            r1 = r18
            r2 = r19
            boolean r3 = r0 instanceof androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry
            if (r3 == 0) goto L4c
            androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry r0 = (androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry) r0
            java.lang.String r3 = r0.getSystemFontFamilyName()
            android.graphics.Typeface r3 = getSystemFontFamily(r3)
            if (r3 == 0) goto L1b
            if (r1 == 0) goto L1a
            r1.callbackSuccessAsync(r3, r2)
        L1a:
            return r3
        L1b:
            r3 = 1
            r4 = 0
            if (r20 == 0) goto L26
            int r5 = r0.getFetchStrategy()
            if (r5 != 0) goto L2a
            goto L28
        L26:
            if (r1 != 0) goto L2a
        L28:
            r9 = r3
            goto L2b
        L2a:
            r9 = r4
        L2b:
            if (r20 == 0) goto L32
            int r3 = r0.getTimeout()
            goto L33
        L32:
            r3 = -1
        L33:
            r10 = r3
            android.os.Handler r11 = androidx.core.content.res.ResourcesCompat.FontCallback.getHandler(r19)
            androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter r12 = new androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter
            r12.<init>(r1)
            androidx.core.provider.FontRequest r7 = r0.getRequest()
            r6 = r13
            r8 = r17
            android.graphics.Typeface r0 = androidx.core.provider.FontsContractCompat.requestFont(r6, r7, r8, r9, r10, r11, r12)
            r5 = r15
            r6 = r17
            goto L64
        L4c:
            androidx.core.graphics.TypefaceCompatBaseImpl r3 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r0 = (androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry) r0
            r4 = r13
            r5 = r15
            r6 = r17
            android.graphics.Typeface r0 = r3.createFromFontFamilyFilesResourceEntry(r13, r0, r15, r6)
            if (r1 == 0) goto L64
            if (r0 == 0) goto L60
            r1.callbackSuccessAsync(r0, r2)
            goto L64
        L60:
            r3 = -3
            r1.callbackFailAsync(r3, r2)
        L64:
            if (r0 == 0) goto L6f
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r1 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            java.lang.String r2 = createResourceUid(r15, r16, r17)
            r1.put(r2, r0)
        L6f:
            return r0
    }

    public static android.graphics.Typeface createFromResourcesFontFile(android.content.Context r6, android.content.res.Resources r7, int r8, java.lang.String r9, int r10) {
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            android.graphics.Typeface r6 = r0.createFromResourcesFontFile(r1, r2, r3, r4, r5)
            if (r6 == 0) goto L16
            java.lang.String r7 = createResourceUid(r7, r8, r10)
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r8 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            r8.put(r7, r6)
        L16:
            return r6
    }

    private static java.lang.String createResourceUid(android.content.res.Resources r1, int r2, int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getResourcePackageName(r2)
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = "-"
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static android.graphics.Typeface findFromCache(android.content.res.Resources r1, int r2, int r3) {
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            java.lang.String r1 = createResourceUid(r1, r2, r3)
            java.lang.Object r1 = r0.get(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            return r1
    }

    private static android.graphics.Typeface getBestFontFromFamily(android.content.Context r2, android.graphics.Typeface r3, int r4) {
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r3 = r0.getFontFamily(r3)
            if (r3 != 0) goto La
            r2 = 0
            return r2
        La:
            android.content.res.Resources r1 = r2.getResources()
            android.graphics.Typeface r2 = r0.createFromFontFamilyFilesResourceEntry(r2, r3, r1, r4)
            return r2
    }

    private static android.graphics.Typeface getSystemFontFamily(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L1e
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto La
            goto L1e
        La:
            r1 = 0
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r1)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r2, r1)
            if (r3 == 0) goto L1e
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L1e
            r0 = r3
        L1e:
            return r0
    }
}
