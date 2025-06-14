package com.squareup.picasso;

/* loaded from: classes.dex */
final class Utils {
    static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 15000;
    static final int DEFAULT_READ_TIMEOUT_MILLIS = 20000;
    static final int DEFAULT_WRITE_TIMEOUT_MILLIS = 20000;
    private static final int KEY_PADDING = 50;
    static final char KEY_SEPARATOR = '\n';
    static final java.lang.StringBuilder MAIN_THREAD_KEY_BUILDER = null;
    private static final int MAX_DISK_CACHE_SIZE = 52428800;
    private static final int MIN_DISK_CACHE_SIZE = 5242880;
    static final java.lang.String OWNER_DISPATCHER = "Dispatcher";
    static final java.lang.String OWNER_HUNTER = "Hunter";
    static final java.lang.String OWNER_MAIN = "Main";
    private static final java.lang.String PICASSO_CACHE = "picasso-cache";
    static final java.lang.String THREAD_IDLE_NAME = "Picasso-Idle";
    static final int THREAD_LEAK_CLEANING_MS = 1000;
    static final java.lang.String THREAD_PREFIX = "Picasso-";
    static final java.lang.String VERB_BATCHED = "batched";
    static final java.lang.String VERB_CANCELED = "canceled";
    static final java.lang.String VERB_CHANGED = "changed";
    static final java.lang.String VERB_COMPLETED = "completed";
    static final java.lang.String VERB_CREATED = "created";
    static final java.lang.String VERB_DECODED = "decoded";
    static final java.lang.String VERB_DELIVERED = "delivered";
    static final java.lang.String VERB_ENQUEUED = "enqueued";
    static final java.lang.String VERB_ERRORED = "errored";
    static final java.lang.String VERB_EXECUTING = "executing";
    static final java.lang.String VERB_IGNORED = "ignored";
    static final java.lang.String VERB_JOINED = "joined";
    static final java.lang.String VERB_PAUSED = "paused";
    static final java.lang.String VERB_REMOVED = "removed";
    static final java.lang.String VERB_REPLAYING = "replaying";
    static final java.lang.String VERB_RESUMED = "resumed";
    static final java.lang.String VERB_RETRYING = "retrying";
    static final java.lang.String VERB_TRANSFORMED = "transformed";
    private static final java.lang.String WEBP_FILE_HEADER_RIFF = "RIFF";
    private static final int WEBP_FILE_HEADER_SIZE = 12;
    private static final java.lang.String WEBP_FILE_HEADER_WEBP = "WEBP";


    private static class ActivityManagerHoneycomb {
        private ActivityManagerHoneycomb() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getLargeMemoryClass(android.app.ActivityManager r0) {
                int r0 = r0.getLargeMemoryClass()
                return r0
        }
    }

    private static class BitmapHoneycombMR1 {
        private BitmapHoneycombMR1() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getByteCount(android.graphics.Bitmap r0) {
                int r0 = r0.getByteCount()
                return r0
        }
    }

    private static class OkHttpLoaderCreator {
        private OkHttpLoaderCreator() {
                r0 = this;
                r0.<init>()
                return
        }

        static com.squareup.picasso.Downloader create(android.content.Context r1) {
                com.squareup.picasso.OkHttpDownloader r0 = new com.squareup.picasso.OkHttpDownloader
                r0.<init>(r1)
                return r0
        }
    }

    private static class PicassoThread extends java.lang.Thread {
        public PicassoThread(java.lang.Runnable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r1 = this;
                r0 = 10
                android.os.Process.setThreadPriority(r0)
                super.run()
                return
        }
    }

    static class PicassoThreadFactory implements java.util.concurrent.ThreadFactory {
        PicassoThreadFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r2) {
                r1 = this;
                com.squareup.picasso.Utils$PicassoThread r0 = new com.squareup.picasso.Utils$PicassoThread
                r0.<init>(r2)
                return r0
        }
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.squareup.picasso.Utils.MAIN_THREAD_KEY_BUILDER = r0
            return
    }

    private Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    static long calculateDiskCacheSize(java.io.File r7) {
            r0 = 5242880(0x500000, double:2.590327E-317)
            android.os.StatFs r2 = new android.os.StatFs     // Catch: java.lang.IllegalArgumentException -> L1b
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.IllegalArgumentException -> L1b
            r2.<init>(r7)     // Catch: java.lang.IllegalArgumentException -> L1b
            int r7 = r2.getBlockCount()     // Catch: java.lang.IllegalArgumentException -> L1b
            long r3 = (long) r7     // Catch: java.lang.IllegalArgumentException -> L1b
            int r7 = r2.getBlockSize()     // Catch: java.lang.IllegalArgumentException -> L1b
            long r5 = (long) r7     // Catch: java.lang.IllegalArgumentException -> L1b
            long r3 = r3 * r5
            r5 = 50
            long r3 = r3 / r5
            goto L1c
        L1b:
            r3 = r0
        L1c:
            r5 = 52428800(0x3200000, double:2.5903269E-316)
            long r2 = java.lang.Math.min(r3, r5)
            long r0 = java.lang.Math.max(r2, r0)
            return r0
    }

    static int calculateMemoryCacheSize(android.content.Context r3) {
            java.lang.String r0 = "activity"
            java.lang.Object r0 = getService(r3, r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.flags
            r1 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 & r1
            if (r3 == 0) goto L15
            r3 = 1
            goto L16
        L15:
            r3 = 0
        L16:
            int r2 = r0.getMemoryClass()
            if (r3 == 0) goto L20
            int r2 = com.squareup.picasso.Utils.ActivityManagerHoneycomb.getLargeMemoryClass(r0)
        L20:
            int r2 = r2 * r1
            int r2 = r2 / 7
            return r2
    }

    static void checkMain() {
            boolean r0 = isMain()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Method call should happen from the main thread."
            r0.<init>(r1)
            throw r0
    }

    static void checkNotMain() {
            boolean r0 = isMain()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Method call should not happen from the main thread."
            r0.<init>(r1)
            throw r0
    }

    static <T> T checkNotNull(T r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
    }

    static void closeQuietly(java.io.InputStream r0) {
            if (r0 != 0) goto L3
            return
        L3:
            r0.close()     // Catch: java.io.IOException -> L6
        L6:
            return
    }

    static java.io.File createDefaultCacheDir(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r2.getApplicationContext()
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r1 = "picasso-cache"
            r0.<init>(r2, r1)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L18
            r0.mkdirs()
        L18:
            return r0
    }

    static com.squareup.picasso.Downloader createDefaultDownloader(android.content.Context r1) {
            java.lang.String r0 = "com.squareup.okhttp.OkHttpClient"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> La
            com.squareup.picasso.Downloader r1 = com.squareup.picasso.Utils.OkHttpLoaderCreator.create(r1)     // Catch: java.lang.ClassNotFoundException -> La
            return r1
        La:
            com.squareup.picasso.UrlConnectionDownloader r0 = new com.squareup.picasso.UrlConnectionDownloader
            r0.<init>(r1)
            return r0
    }

    static java.lang.String createKey(com.squareup.picasso.Request r2) {
            java.lang.StringBuilder r0 = com.squareup.picasso.Utils.MAIN_THREAD_KEY_BUILDER
            java.lang.String r2 = createKey(r2, r0)
            r1 = 0
            r0.setLength(r1)
            return r2
    }

    static java.lang.String createKey(com.squareup.picasso.Request r4, java.lang.StringBuilder r5) {
            java.lang.String r0 = r4.stableKey
            r1 = 50
            if (r0 == 0) goto L16
            java.lang.String r0 = r4.stableKey
            int r0 = r0.length()
            int r0 = r0 + r1
            r5.ensureCapacity(r0)
            java.lang.String r0 = r4.stableKey
            r5.append(r0)
            goto L34
        L16:
            android.net.Uri r0 = r4.uri
            if (r0 == 0) goto L2c
            android.net.Uri r0 = r4.uri
            java.lang.String r0 = r0.toString()
            int r2 = r0.length()
            int r2 = r2 + r1
            r5.ensureCapacity(r2)
            r5.append(r0)
            goto L34
        L2c:
            r5.ensureCapacity(r1)
            int r0 = r4.resourceId
            r5.append(r0)
        L34:
            r0 = 10
            r5.append(r0)
            float r1 = r4.rotationDegrees
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r2 = 120(0x78, float:1.68E-43)
            if (r1 == 0) goto L69
            java.lang.String r1 = "rotation:"
            java.lang.StringBuilder r1 = r5.append(r1)
            float r3 = r4.rotationDegrees
            r1.append(r3)
            boolean r1 = r4.hasRotationPivot
            if (r1 == 0) goto L66
            r1 = 64
            java.lang.StringBuilder r1 = r5.append(r1)
            float r3 = r4.rotationPivotX
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            float r3 = r4.rotationPivotY
            r1.append(r3)
        L66:
            r5.append(r0)
        L69:
            boolean r1 = r4.hasSize()
            if (r1 == 0) goto L87
            java.lang.String r1 = "resize:"
            java.lang.StringBuilder r1 = r5.append(r1)
            int r3 = r4.targetWidth
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r4.targetHeight
            r1.append(r2)
            r5.append(r0)
        L87:
            boolean r1 = r4.centerCrop
            if (r1 == 0) goto L95
            java.lang.String r1 = "centerCrop"
            java.lang.StringBuilder r1 = r5.append(r1)
            r1.append(r0)
            goto La2
        L95:
            boolean r1 = r4.centerInside
            if (r1 == 0) goto La2
            java.lang.String r1 = "centerInside"
            java.lang.StringBuilder r1 = r5.append(r1)
            r1.append(r0)
        La2:
            java.util.List<com.squareup.picasso.Transformation> r1 = r4.transformations
            if (r1 == 0) goto Lc4
            java.util.List<com.squareup.picasso.Transformation> r1 = r4.transformations
            int r1 = r1.size()
            r2 = 0
        Lad:
            if (r2 >= r1) goto Lc4
            java.util.List<com.squareup.picasso.Transformation> r3 = r4.transformations
            java.lang.Object r3 = r3.get(r2)
            com.squareup.picasso.Transformation r3 = (com.squareup.picasso.Transformation) r3
            java.lang.String r3 = r3.key()
            r5.append(r3)
            r5.append(r0)
            int r2 = r2 + 1
            goto Lad
        Lc4:
            java.lang.String r4 = r5.toString()
            return r4
    }

    static void flushStackLocalLeaks(android.os.Looper r3) {
            com.squareup.picasso.Utils$1 r0 = new com.squareup.picasso.Utils$1
            r0.<init>(r3)
            android.os.Message r3 = r0.obtainMessage()
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.sendMessageDelayed(r3, r1)
            return
    }

    static int getBitmapBytes(android.graphics.Bitmap r3) {
            int r0 = com.squareup.picasso.Utils.BitmapHoneycombMR1.getByteCount(r3)
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Negative size: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    static java.lang.String getLogIdsForHunter(com.squareup.picasso.BitmapHunter r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = getLogIdsForHunter(r1, r0)
            return r1
    }

    static java.lang.String getLogIdsForHunter(com.squareup.picasso.BitmapHunter r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            com.squareup.picasso.Action r5 = r4.getAction()
            if (r5 == 0) goto L14
            com.squareup.picasso.Request r1 = r5.request
            java.lang.String r1 = r1.logId()
            r0.append(r1)
        L14:
            java.util.List r4 = r4.getActions()
            if (r4 == 0) goto L3c
            int r1 = r4.size()
            r2 = 0
        L1f:
            if (r2 >= r1) goto L3c
            if (r2 > 0) goto L25
            if (r5 == 0) goto L2a
        L25:
            java.lang.String r3 = ", "
            r0.append(r3)
        L2a:
            java.lang.Object r3 = r4.get(r2)
            com.squareup.picasso.Action r3 = (com.squareup.picasso.Action) r3
            com.squareup.picasso.Request r3 = r3.request
            java.lang.String r3 = r3.logId()
            r0.append(r3)
            int r2 = r2 + 1
            goto L1f
        L3c:
            java.lang.String r4 = r0.toString()
            return r4
    }

    static int getResourceId(android.content.res.Resources r6, com.squareup.picasso.Request r7) throws java.io.FileNotFoundException {
            int r0 = r7.resourceId
            if (r0 != 0) goto La7
            android.net.Uri r0 = r7.uri
            if (r0 != 0) goto La
            goto La7
        La:
            android.net.Uri r0 = r7.uri
            java.lang.String r0 = r0.getAuthority()
            if (r0 == 0) goto L90
            android.net.Uri r1 = r7.uri
            java.util.List r1 = r1.getPathSegments()
            if (r1 == 0) goto L79
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L79
            int r2 = r1.size()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L4a
            java.lang.Object r6 = r1.get(r3)     // Catch: java.lang.NumberFormatException -> L33
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.NumberFormatException -> L33
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L33
            goto L61
        L33:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Last path segment is not a resource ID: "
            r0.<init>(r1)
            android.net.Uri r7 = r7.uri
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L4a:
            int r2 = r1.size()
            r5 = 2
            if (r2 != r5) goto L62
            java.lang.Object r7 = r1.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r6.getIdentifier(r1, r7, r0)
        L61:
            return r6
        L62:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "More than two path segments: "
            r0.<init>(r1)
            android.net.Uri r7 = r7.uri
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L79:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No path segments: "
            r0.<init>(r1)
            android.net.Uri r7 = r7.uri
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L90:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No package provided: "
            r0.<init>(r1)
            android.net.Uri r7 = r7.uri
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        La7:
            int r6 = r7.resourceId
            return r6
    }

    static android.content.res.Resources getResources(android.content.Context r2, com.squareup.picasso.Request r3) throws java.io.FileNotFoundException {
            int r0 = r3.resourceId
            if (r0 != 0) goto L48
            android.net.Uri r0 = r3.uri
            if (r0 != 0) goto L9
            goto L48
        L9:
            android.net.Uri r0 = r3.uri
            java.lang.String r0 = r0.getAuthority()
            if (r0 == 0) goto L31
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            android.content.res.Resources r2 = r2.getResourcesForApplication(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            return r2
        L1a:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to obtain resources for package: "
            r0.<init>(r1)
            android.net.Uri r3 = r3.uri
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L31:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No package provided: "
            r0.<init>(r1)
            android.net.Uri r3 = r3.uri
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L48:
            android.content.res.Resources r2 = r2.getResources()
            return r2
    }

    static <T> T getService(android.content.Context r0, java.lang.String r1) {
            java.lang.Object r0 = r0.getSystemService(r1)
            return r0
    }

    static boolean hasPermission(android.content.Context r0, java.lang.String r1) {
            int r0 = r0.checkCallingOrSelfPermission(r1)
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    static boolean isAirplaneModeOn(android.content.Context r2) {
            android.content.ContentResolver r2 = r2.getContentResolver()
            r0 = 0
            java.lang.String r1 = "airplane_mode_on"
            int r2 = android.provider.Settings.System.getInt(r2, r1, r0)     // Catch: java.lang.NullPointerException -> Le
            if (r2 == 0) goto Le
            r0 = 1
        Le:
            return r0
    }

    static boolean isMain() {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    static boolean isWebPFile(java.io.InputStream r5) throws java.io.IOException {
            r0 = 12
            byte[] r1 = new byte[r0]
            r2 = 0
            int r5 = r5.read(r1, r2, r0)
            if (r5 != r0) goto L2c
            java.lang.String r5 = new java.lang.String
            r0 = 4
            java.lang.String r3 = "US-ASCII"
            r5.<init>(r1, r2, r0, r3)
            java.lang.String r4 = "RIFF"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L2c
            java.lang.String r5 = new java.lang.String
            r4 = 8
            r5.<init>(r1, r4, r0, r3)
            java.lang.String r0 = "WEBP"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L2c
            r5 = 1
            r2 = r5
        L2c:
            return r2
    }

    static void log(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = ""
            log(r1, r2, r3, r0)
            return
    }

    static void log(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            java.lang.String r2 = "%1$-11s %2$-12s %3$s %4$s"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            java.lang.String r3 = "Picasso"
            android.util.Log.d(r3, r2)
            return
    }

    static boolean parseResponseSourceHeader(java.lang.String r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = " "
            r2 = 2
            java.lang.String[] r4 = r4.split(r1, r2)
            java.lang.String r1 = "CACHE"
            r2 = r4[r0]
            boolean r1 = r1.equals(r2)
            r2 = 1
            if (r1 == 0) goto L17
            return r2
        L17:
            int r1 = r4.length
            if (r1 != r2) goto L1b
            return r0
        L1b:
            java.lang.String r1 = "CONDITIONAL_CACHE"
            r3 = r4[r0]     // Catch: java.lang.NumberFormatException -> L30
            boolean r1 = r1.equals(r3)     // Catch: java.lang.NumberFormatException -> L30
            if (r1 == 0) goto L30
            r4 = r4[r2]     // Catch: java.lang.NumberFormatException -> L30
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L30
            r1 = 304(0x130, float:4.26E-43)
            if (r4 != r1) goto L30
            r0 = r2
        L30:
            return r0
    }

    static byte[] toByteArray(java.io.InputStream r4) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]
        L9:
            int r2 = r4.read(r1)
            r3 = -1
            if (r3 == r2) goto L15
            r3 = 0
            r0.write(r1, r3, r2)
            goto L9
        L15:
            byte[] r4 = r0.toByteArray()
            return r4
    }
}
