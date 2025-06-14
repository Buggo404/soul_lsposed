package androidx.core.content;

/* loaded from: classes.dex */
public class FileProvider extends android.content.ContentProvider {
    private static final java.lang.String ATTR_NAME = "name";
    private static final java.lang.String ATTR_PATH = "path";
    private static final java.lang.String[] COLUMNS = null;
    private static final java.io.File DEVICE_ROOT = null;
    private static final java.lang.String DISPLAYNAME_FIELD = "displayName";
    private static final java.lang.String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final java.lang.String TAG_CACHE_PATH = "cache-path";
    private static final java.lang.String TAG_EXTERNAL = "external-path";
    private static final java.lang.String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final java.lang.String TAG_EXTERNAL_FILES = "external-files-path";
    private static final java.lang.String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final java.lang.String TAG_FILES_PATH = "files-path";
    private static final java.lang.String TAG_ROOT_PATH = "root-path";
    private static java.util.HashMap<java.lang.String, androidx.core.content.FileProvider.PathStrategy> sCache;
    private androidx.core.content.FileProvider.PathStrategy mStrategy;

    interface PathStrategy {
        java.io.File getFileForUri(android.net.Uri r1);

        android.net.Uri getUriForFile(java.io.File r1);
    }

    static class SimplePathStrategy implements androidx.core.content.FileProvider.PathStrategy {
        private final java.lang.String mAuthority;
        private final java.util.HashMap<java.lang.String, java.io.File> mRoots;

        SimplePathStrategy(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mRoots = r0
                r1.mAuthority = r2
                return
        }

        void addRoot(java.lang.String r4, java.io.File r5) {
                r3 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L26
                java.io.File r5 = r5.getCanonicalFile()     // Catch: java.io.IOException -> L10
                java.util.HashMap<java.lang.String, java.io.File> r0 = r3.mRoots
                r0.put(r4, r5)
                return
            L10:
                r4 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Failed to resolve canonical path for "
                r1.<init>(r2)
                java.lang.StringBuilder r5 = r1.append(r5)
                java.lang.String r5 = r5.toString()
                r0.<init>(r5, r4)
                throw r0
            L26:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Name must not be empty"
                r4.<init>(r5)
                throw r4
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public java.io.File getFileForUri(android.net.Uri r5) {
                r4 = this;
                java.lang.String r0 = r5.getEncodedPath()
                r1 = 47
                r2 = 1
                int r1 = r0.indexOf(r1, r2)
                java.lang.String r3 = r0.substring(r2, r1)
                java.lang.String r3 = android.net.Uri.decode(r3)
                int r1 = r1 + r2
                java.lang.String r0 = r0.substring(r1)
                java.lang.String r0 = android.net.Uri.decode(r0)
                java.util.HashMap<java.lang.String, java.io.File> r1 = r4.mRoots
                java.lang.Object r1 = r1.get(r3)
                java.io.File r1 = (java.io.File) r1
                if (r1 == 0) goto L5b
                java.io.File r5 = new java.io.File
                r5.<init>(r1, r0)
                java.io.File r5 = r5.getCanonicalFile()     // Catch: java.io.IOException -> L46
                java.lang.String r0 = r5.getPath()
                java.lang.String r1 = r1.getPath()
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L3e
                return r5
            L3e:
                java.lang.SecurityException r5 = new java.lang.SecurityException
                java.lang.String r0 = "Resolved path jumped beyond configured root"
                r5.<init>(r0)
                throw r5
            L46:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Failed to resolve canonical path for "
                r1.<init>(r2)
                java.lang.StringBuilder r5 = r1.append(r5)
                java.lang.String r5 = r5.toString()
                r0.<init>(r5)
                throw r0
            L5b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unable to find configured root for "
                r1.<init>(r2)
                java.lang.StringBuilder r5 = r1.append(r5)
                java.lang.String r5 = r5.toString()
                r0.<init>(r5)
                throw r0
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public android.net.Uri getUriForFile(java.io.File r6) {
                r5 = this;
                java.lang.String r6 = r6.getCanonicalPath()     // Catch: java.io.IOException -> Lbe
                java.util.HashMap<java.lang.String, java.io.File> r0 = r5.mRoots
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            Lf:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L43
                java.lang.Object r2 = r0.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getValue()
                java.io.File r3 = (java.io.File) r3
                java.lang.String r3 = r3.getPath()
                boolean r4 = r6.startsWith(r3)
                if (r4 == 0) goto Lf
                if (r1 == 0) goto L41
                int r3 = r3.length()
                java.lang.Object r4 = r1.getValue()
                java.io.File r4 = (java.io.File) r4
                java.lang.String r4 = r4.getPath()
                int r4 = r4.length()
                if (r3 <= r4) goto Lf
            L41:
                r1 = r2
                goto Lf
            L43:
                if (r1 == 0) goto La9
                java.lang.Object r0 = r1.getValue()
                java.io.File r0 = (java.io.File) r0
                java.lang.String r0 = r0.getPath()
                java.lang.String r2 = "/"
                boolean r3 = r0.endsWith(r2)
                if (r3 == 0) goto L60
                int r0 = r0.length()
                java.lang.String r6 = r6.substring(r0)
                goto L6a
            L60:
                int r0 = r0.length()
                int r0 = r0 + 1
                java.lang.String r6 = r6.substring(r0)
            L6a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r1.getKey()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = android.net.Uri.encode(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 47
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r6 = android.net.Uri.encode(r6, r2)
                java.lang.StringBuilder r6 = r0.append(r6)
                java.lang.String r6 = r6.toString()
                android.net.Uri$Builder r0 = new android.net.Uri$Builder
                r0.<init>()
                java.lang.String r1 = "content"
                android.net.Uri$Builder r0 = r0.scheme(r1)
                java.lang.String r1 = r5.mAuthority
                android.net.Uri$Builder r0 = r0.authority(r1)
                android.net.Uri$Builder r6 = r0.encodedPath(r6)
                android.net.Uri r6 = r6.build()
                return r6
            La9:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Failed to find configured root that contains "
                r1.<init>(r2)
                java.lang.StringBuilder r6 = r1.append(r6)
                java.lang.String r6 = r6.toString()
                r0.<init>(r6)
                throw r0
            Lbe:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Failed to resolve canonical path for "
                r1.<init>(r2)
                java.lang.StringBuilder r6 = r1.append(r6)
                java.lang.String r6 = r6.toString()
                r0.<init>(r6)
                throw r0
        }
    }

    static {
            java.lang.String r0 = "_display_name"
            java.lang.String r1 = "_size"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            androidx.core.content.FileProvider.COLUMNS = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/"
            r0.<init>(r1)
            androidx.core.content.FileProvider.DEVICE_ROOT = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.core.content.FileProvider.sCache = r0
            return
    }

    public FileProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.io.File buildPath(java.io.File r4, java.lang.String... r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L11
            r2 = r5[r1]
            if (r2 == 0) goto Le
            java.io.File r3 = new java.io.File
            r3.<init>(r4, r2)
            r4 = r3
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            return r4
    }

    private static java.lang.Object[] copyOf(java.lang.Object[] r2, int r3) {
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    private static java.lang.String[] copyOf(java.lang.String[] r2, int r3) {
            java.lang.String[] r0 = new java.lang.String[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    private static androidx.core.content.FileProvider.PathStrategy getPathStrategy(android.content.Context r2, java.lang.String r3) {
            java.util.HashMap<java.lang.String, androidx.core.content.FileProvider$PathStrategy> r0 = androidx.core.content.FileProvider.sCache
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, androidx.core.content.FileProvider$PathStrategy> r1 = androidx.core.content.FileProvider.sCache     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L2b
            androidx.core.content.FileProvider$PathStrategy r1 = (androidx.core.content.FileProvider.PathStrategy) r1     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L29
            androidx.core.content.FileProvider$PathStrategy r1 = parsePathStrategy(r2, r3)     // Catch: org.xmlpull.v1.XmlPullParserException -> L17 java.io.IOException -> L20 java.lang.Throwable -> L2b
            java.util.HashMap<java.lang.String, androidx.core.content.FileProvider$PathStrategy> r2 = androidx.core.content.FileProvider.sCache     // Catch: java.lang.Throwable -> L2b
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L2b
            goto L29
        L17:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L2b
            throw r3     // Catch: java.lang.Throwable -> L2b
        L20:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L2b
            throw r3     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return r1
        L2b:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r2
    }

    public static android.net.Uri getUriForFile(android.content.Context r0, java.lang.String r1, java.io.File r2) {
            androidx.core.content.FileProvider$PathStrategy r0 = getPathStrategy(r0, r1)
            android.net.Uri r0 = r0.getUriForFile(r2)
            return r0
    }

    public static android.net.Uri getUriForFile(android.content.Context r0, java.lang.String r1, java.io.File r2, java.lang.String r3) {
            android.net.Uri r0 = getUriForFile(r0, r1, r2)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "displayName"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r3)
            android.net.Uri r0 = r0.build()
            return r0
    }

    private static int modeToMode(java.lang.String r3) {
            java.lang.String r0 = "r"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L54
        Lb:
            java.lang.String r0 = "w"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L52
            java.lang.String r0 = "wt"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1c
            goto L52
        L1c:
            java.lang.String r0 = "wa"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L27
            r3 = 704643072(0x2a000000, float:1.1368684E-13)
            goto L54
        L27:
            java.lang.String r0 = "rw"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L32
            r3 = 939524096(0x38000000, float:3.0517578E-5)
            goto L54
        L32:
            java.lang.String r0 = "rwt"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L3d
            r3 = 1006632960(0x3c000000, float:0.0078125)
            goto L54
        L3d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid mode: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L52:
            r3 = 738197504(0x2c000000, float:1.8189894E-12)
        L54:
            return r3
    }

    private static androidx.core.content.FileProvider.PathStrategy parsePathStrategy(android.content.Context r8, java.lang.String r9) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            androidx.core.content.FileProvider$SimplePathStrategy r0 = new androidx.core.content.FileProvider$SimplePathStrategy
            r0.<init>(r9)
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r9, r2)
            if (r1 == 0) goto Lb8
            android.content.pm.PackageManager r9 = r8.getPackageManager()
            java.lang.String r2 = "android.support.FILE_PROVIDER_PATHS"
            android.content.res.XmlResourceParser r9 = r1.loadXmlMetaData(r9, r2)
            if (r9 == 0) goto Lb0
        L1d:
            int r1 = r9.next()
            r2 = 1
            if (r1 == r2) goto Laf
            r3 = 2
            if (r1 != r3) goto L1d
            java.lang.String r1 = r9.getName()
            java.lang.String r3 = "name"
            r4 = 0
            java.lang.String r3 = r9.getAttributeValue(r4, r3)
            java.lang.String r5 = "path"
            java.lang.String r5 = r9.getAttributeValue(r4, r5)
            java.lang.String r6 = "root-path"
            boolean r6 = r6.equals(r1)
            r7 = 0
            if (r6 == 0) goto L44
            java.io.File r4 = androidx.core.content.FileProvider.DEVICE_ROOT
            goto La0
        L44:
            java.lang.String r6 = "files-path"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L51
            java.io.File r4 = r8.getFilesDir()
            goto La0
        L51:
            java.lang.String r6 = "cache-path"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L5e
            java.io.File r4 = r8.getCacheDir()
            goto La0
        L5e:
            java.lang.String r6 = "external-path"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L6b
            java.io.File r4 = android.os.Environment.getExternalStorageDirectory()
            goto La0
        L6b:
            java.lang.String r6 = "external-files-path"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L7d
            java.io.File[] r1 = androidx.core.content.ContextCompat.getExternalFilesDirs(r8, r4)
            int r6 = r1.length
            if (r6 <= 0) goto La0
            r4 = r1[r7]
            goto La0
        L7d:
            java.lang.String r6 = "external-cache-path"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L8f
            java.io.File[] r1 = androidx.core.content.ContextCompat.getExternalCacheDirs(r8)
            int r6 = r1.length
            if (r6 <= 0) goto La0
            r4 = r1[r7]
            goto La0
        L8f:
            java.lang.String r6 = "external-media-path"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto La0
            java.io.File[] r1 = r8.getExternalMediaDirs()
            int r6 = r1.length
            if (r6 <= 0) goto La0
            r4 = r1[r7]
        La0:
            if (r4 == 0) goto L1d
            java.lang.String[] r1 = new java.lang.String[r2]
            r1[r7] = r5
            java.io.File r1 = buildPath(r4, r1)
            r0.addRoot(r3, r1)
            goto L1d
        Laf:
            return r0
        Lb0:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Missing android.support.FILE_PROVIDER_PATHS meta-data"
            r8.<init>(r9)
            throw r8
        Lb8:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Couldn't find meta-data for provider with authority "
            r0.<init>(r1)
            java.lang.StringBuilder r9 = r0.append(r9)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    @Override // android.content.ContentProvider
    public void attachInfo(android.content.Context r2, android.content.pm.ProviderInfo r3) {
            r1 = this;
            super.attachInfo(r2, r3)
            boolean r0 = r3.exported
            if (r0 != 0) goto L25
            boolean r0 = r3.grantUriPermissions
            if (r0 == 0) goto L1d
            java.lang.String r3 = r3.authority
            java.lang.String r0 = ";"
            java.lang.String[] r3 = r3.split(r0)
            r0 = 0
            r3 = r3[r0]
            androidx.core.content.FileProvider$PathStrategy r2 = getPathStrategy(r2, r3)
            r1.mStrategy = r2
            return
        L1d:
            java.lang.SecurityException r2 = new java.lang.SecurityException
            java.lang.String r3 = "Provider must grant uri permissions"
            r2.<init>(r3)
            throw r2
        L25:
            java.lang.SecurityException r2 = new java.lang.SecurityException
            java.lang.String r3 = "Provider must not be exported"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            androidx.core.content.FileProvider$PathStrategy r2 = r0.mStrategy
            java.io.File r1 = r2.getFileForUri(r1)
            boolean r1 = r1.delete()
            return r1
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri r3) {
            r2 = this;
            androidx.core.content.FileProvider$PathStrategy r0 = r2.mStrategy
            java.io.File r3 = r0.getFileForUri(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L27
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 == 0) goto L27
            return r3
        L27:
            java.lang.String r3 = "application/octet-stream"
            return r3
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "No external inserts"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri r2, java.lang.String r3) throws java.io.FileNotFoundException {
            r1 = this;
            androidx.core.content.FileProvider$PathStrategy r0 = r1.mStrategy
            java.io.File r2 = r0.getFileForUri(r2)
            int r3 = modeToMode(r3)
            android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.open(r2, r3)
            return r2
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri r7, java.lang.String[] r8, java.lang.String r9, java.lang.String[] r10, java.lang.String r11) {
            r6 = this;
            androidx.core.content.FileProvider$PathStrategy r9 = r6.mStrategy
            java.io.File r9 = r9.getFileForUri(r7)
            java.lang.String r10 = "displayName"
            java.lang.String r7 = r7.getQueryParameter(r10)
            if (r8 != 0) goto L10
            java.lang.String[] r8 = androidx.core.content.FileProvider.COLUMNS
        L10:
            int r10 = r8.length
            java.lang.String[] r10 = new java.lang.String[r10]
            int r11 = r8.length
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L19:
            if (r1 >= r0) goto L4e
            r3 = r8[r1]
            java.lang.String r4 = "_display_name"
            boolean r5 = r4.equals(r3)
            if (r5 == 0) goto L34
            r10[r2] = r4
            int r3 = r2 + 1
            if (r7 != 0) goto L30
            java.lang.String r4 = r9.getName()
            goto L31
        L30:
            r4 = r7
        L31:
            r11[r2] = r4
            goto L4a
        L34:
            java.lang.String r4 = "_size"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L4b
            r10[r2] = r4
            int r3 = r2 + 1
            long r4 = r9.length()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r11[r2] = r4
        L4a:
            r2 = r3
        L4b:
            int r1 = r1 + 1
            goto L19
        L4e:
            java.lang.String[] r7 = copyOf(r10, r2)
            java.lang.Object[] r8 = copyOf(r11, r2)
            android.database.MatrixCursor r9 = new android.database.MatrixCursor
            r10 = 1
            r9.<init>(r7, r10)
            r9.addRow(r8)
            return r9
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "No external updates"
            r1.<init>(r2)
            throw r1
    }
}
