package androidx.core.provider;

/* loaded from: classes.dex */
class FontRequestWorker {
    private static final java.util.concurrent.ExecutorService DEFAULT_EXECUTOR_SERVICE = null;
    static final java.lang.Object LOCK = null;
    static final androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>>> PENDING_REPLIES = null;
    static final androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> sTypefaceCache = null;





    static final class TypefaceResult {
        final int mResult;
        final android.graphics.Typeface mTypeface;

        TypefaceResult(int r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mTypeface = r0
                r1.mResult = r2
                return
        }

        TypefaceResult(android.graphics.Typeface r1) {
                r0 = this;
                r0.<init>()
                r0.mTypeface = r1
                r1 = 0
                r0.mResult = r1
                return
        }

        boolean isSuccess() {
                r1 = this;
                int r0 = r1.mResult
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }
    }

    static {
            androidx.collection.LruCache r0 = new androidx.collection.LruCache
            r1 = 16
            r0.<init>(r1)
            androidx.core.provider.FontRequestWorker.sTypefaceCache = r0
            r0 = 10
            r1 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r2 = "fonts-androidx"
            java.util.concurrent.ThreadPoolExecutor r0 = androidx.core.provider.RequestExecutor.createDefaultExecutor(r2, r0, r1)
            androidx.core.provider.FontRequestWorker.DEFAULT_EXECUTOR_SERVICE = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.provider.FontRequestWorker.LOCK = r0
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            androidx.core.provider.FontRequestWorker.PENDING_REPLIES = r0
            return
    }

    private FontRequestWorker() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String createCacheId(androidx.core.provider.FontRequest r1, int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getId()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = "-"
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    private static int getFontFamilyResultStatus(androidx.core.provider.FontsContractCompat.FontFamilyResult r5) {
            int r0 = r5.getStatusCode()
            r1 = -3
            r2 = 1
            if (r0 == 0) goto L11
            int r5 = r5.getStatusCode()
            if (r5 == r2) goto Lf
            return r1
        Lf:
            r5 = -2
            return r5
        L11:
            androidx.core.provider.FontsContractCompat$FontInfo[] r5 = r5.getFonts()
            if (r5 == 0) goto L30
            int r0 = r5.length
            if (r0 != 0) goto L1b
            goto L30
        L1b:
            int r0 = r5.length
            r2 = 0
            r3 = r2
        L1e:
            if (r3 >= r0) goto L30
            r4 = r5[r3]
            int r4 = r4.getResultCode()
            if (r4 == 0) goto L2d
            if (r4 >= 0) goto L2b
            goto L2c
        L2b:
            r1 = r4
        L2c:
            return r1
        L2d:
            int r3 = r3 + 1
            goto L1e
        L30:
            return r2
    }

    static androidx.core.provider.FontRequestWorker.TypefaceResult getFontSync(java.lang.String r3, android.content.Context r4, androidx.core.provider.FontRequest r5, int r6) {
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r0 = androidx.core.provider.FontRequestWorker.sTypefaceCache
            java.lang.Object r1 = r0.get(r3)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            androidx.core.provider.FontRequestWorker$TypefaceResult r3 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r3.<init>(r1)
            return r3
        L10:
            r1 = 0
            androidx.core.provider.FontsContractCompat$FontFamilyResult r5 = androidx.core.provider.FontProvider.getFontFamilyResult(r4, r5, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            int r2 = getFontFamilyResultStatus(r5)
            if (r2 == 0) goto L21
            androidx.core.provider.FontRequestWorker$TypefaceResult r3 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r3.<init>(r2)
            return r3
        L21:
            androidx.core.provider.FontsContractCompat$FontInfo[] r5 = r5.getFonts()
            android.graphics.Typeface r4 = androidx.core.graphics.TypefaceCompat.createFromFontInfo(r4, r1, r5, r6)
            if (r4 == 0) goto L34
            r0.put(r3, r4)
            androidx.core.provider.FontRequestWorker$TypefaceResult r3 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r3.<init>(r4)
            return r3
        L34:
            androidx.core.provider.FontRequestWorker$TypefaceResult r3 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r4 = -3
            r3.<init>(r4)
            return r3
        L3b:
            androidx.core.provider.FontRequestWorker$TypefaceResult r3 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r4 = -1
            r3.<init>(r4)
            return r3
    }

    static android.graphics.Typeface requestFontAsync(android.content.Context r5, androidx.core.provider.FontRequest r6, int r7, java.util.concurrent.Executor r8, androidx.core.provider.CallbackWithHandler r9) {
            java.lang.String r0 = createCacheId(r6, r7)
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r1 = androidx.core.provider.FontRequestWorker.sTypefaceCache
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L17
            androidx.core.provider.FontRequestWorker$TypefaceResult r5 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r5.<init>(r1)
            r9.onTypefaceResult(r5)
            return r1
        L17:
            androidx.core.provider.FontRequestWorker$2 r1 = new androidx.core.provider.FontRequestWorker$2
            r1.<init>(r9)
            java.lang.Object r9 = androidx.core.provider.FontRequestWorker.LOCK
            monitor-enter(r9)
            androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker$TypefaceResult>>> r2 = androidx.core.provider.FontRequestWorker.PENDING_REPLIES     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r3 = r2.get(r0)     // Catch: java.lang.Throwable -> L4d
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Throwable -> L4d
            r4 = 0
            if (r3 == 0) goto L2f
            r3.add(r1)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L4d
            return r4
        L2f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4d
            r3.<init>()     // Catch: java.lang.Throwable -> L4d
            r3.add(r1)     // Catch: java.lang.Throwable -> L4d
            r2.put(r0, r3)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L4d
            androidx.core.provider.FontRequestWorker$3 r9 = new androidx.core.provider.FontRequestWorker$3
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L44
            java.util.concurrent.ExecutorService r8 = androidx.core.provider.FontRequestWorker.DEFAULT_EXECUTOR_SERVICE
        L44:
            androidx.core.provider.FontRequestWorker$4 r5 = new androidx.core.provider.FontRequestWorker$4
            r5.<init>(r0)
            androidx.core.provider.RequestExecutor.execute(r8, r9, r5)
            return r4
        L4d:
            r5 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L4d
            throw r5
    }

    static android.graphics.Typeface requestFontSync(android.content.Context r2, androidx.core.provider.FontRequest r3, androidx.core.provider.CallbackWithHandler r4, int r5, int r6) {
            java.lang.String r0 = createCacheId(r3, r5)
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r1 = androidx.core.provider.FontRequestWorker.sTypefaceCache
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L17
            androidx.core.provider.FontRequestWorker$TypefaceResult r2 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r2.<init>(r1)
            r4.onTypefaceResult(r2)
            return r1
        L17:
            r1 = -1
            if (r6 != r1) goto L24
            androidx.core.provider.FontRequestWorker$TypefaceResult r2 = getFontSync(r0, r2, r3, r5)
            r4.onTypefaceResult(r2)
            android.graphics.Typeface r2 = r2.mTypeface
            return r2
        L24:
            androidx.core.provider.FontRequestWorker$1 r1 = new androidx.core.provider.FontRequestWorker$1
            r1.<init>(r0, r2, r3, r5)
            java.util.concurrent.ExecutorService r2 = androidx.core.provider.FontRequestWorker.DEFAULT_EXECUTOR_SERVICE     // Catch: java.lang.InterruptedException -> L37
            java.lang.Object r2 = androidx.core.provider.RequestExecutor.submit(r2, r1, r6)     // Catch: java.lang.InterruptedException -> L37
            androidx.core.provider.FontRequestWorker$TypefaceResult r2 = (androidx.core.provider.FontRequestWorker.TypefaceResult) r2     // Catch: java.lang.InterruptedException -> L37
            r4.onTypefaceResult(r2)     // Catch: java.lang.InterruptedException -> L37
            android.graphics.Typeface r2 = r2.mTypeface     // Catch: java.lang.InterruptedException -> L37
            return r2
        L37:
            androidx.core.provider.FontRequestWorker$TypefaceResult r2 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r3 = -3
            r2.<init>(r3)
            r4.onTypefaceResult(r2)
            r2 = 0
            return r2
    }

    static void resetTypefaceCache() {
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r0 = androidx.core.provider.FontRequestWorker.sTypefaceCache
            r0.evictAll()
            return
    }
}
