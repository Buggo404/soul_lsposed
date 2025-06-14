package com.xuexiang.xhttp2.utils;

/* loaded from: classes.dex */
public final class Utils {
    private static final java.lang.String APP_EXT_STORAGE_PATH = null;
    private static final java.lang.String EXT_DCIM_PATH = null;
    private static final java.lang.String EXT_DOWNLOADS_PATH = null;
    private static final java.lang.String EXT_PICTURES_PATH = null;
    private static final java.lang.String EXT_STORAGE_DIR = null;
    private static final java.lang.String EXT_STORAGE_PATH = null;

    static {
            java.lang.String r0 = getExtStoragePath()
            com.xuexiang.xhttp2.utils.Utils.EXT_STORAGE_PATH = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = java.io.File.separator
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.xuexiang.xhttp2.utils.Utils.EXT_STORAGE_DIR = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "Android"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.xuexiang.xhttp2.utils.Utils.APP_EXT_STORAGE_PATH = r0
            java.lang.String r0 = getExtDownloadsPath()
            com.xuexiang.xhttp2.utils.Utils.EXT_DOWNLOADS_PATH = r0
            java.lang.String r0 = getExtPicturesPath()
            com.xuexiang.xhttp2.utils.Utils.EXT_PICTURES_PATH = r0
            java.lang.String r0 = getExtDCIMPath()
            com.xuexiang.xhttp2.utils.Utils.EXT_DCIM_PATH = r0
            return
    }

    private Utils() {
            r2 = this;
            r2.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "u can't instantiate me..."
            r0.<init>(r1)
            throw r0
    }

    public static <T> T checkNotNull(T r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
    }

    public static void closeIO(java.io.Closeable... r3) {
            if (r3 != 0) goto L3
            return
        L3:
            int r0 = r3.length
            r1 = 0
        L5:
            if (r1 >= r0) goto L16
            r2 = r3[r1]
            if (r2 == 0) goto L13
            r2.close()     // Catch: java.io.IOException -> Lf
            goto L13
        Lf:
            r2 = move-exception
            r2.printStackTrace()
        L13:
            int r1 = r1 + 1
            goto L5
        L16:
            return
    }

    private static android.content.ContentResolver getContentResolver() {
            android.content.Context r0 = com.xuexiang.xhttp2.XHttp.getContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            return r0
    }

    public static java.lang.String getDirPath(java.lang.String r2) {
            boolean r0 = isEmpty(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            java.lang.String r0 = r2.trim()
            java.lang.String r1 = java.io.File.separator
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r2.trim()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = java.io.File.separator
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
        L2c:
            return r2
    }

    public static java.io.File getDiskCacheDir(android.content.Context r2, java.lang.String r3) {
            boolean r0 = isSDCardExist()
            if (r0 == 0) goto L15
            java.io.File r0 = r2.getExternalCacheDir()
            if (r0 == 0) goto L15
            java.io.File r2 = r2.getExternalCacheDir()
            java.lang.String r2 = r2.getPath()
            goto L1d
        L15:
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r2 = r2.getPath()
        L1d:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.String r1 = java.io.File.separator
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            return r0
    }

    private static java.lang.String getDiskFilesDir() {
            boolean r0 = isSDCardExist()
            if (r0 == 0) goto L1a
            android.content.Context r0 = com.xuexiang.xhttp2.XHttp.getContext()
            r1 = 0
            java.io.File r0 = r0.getExternalFilesDir(r1)
            if (r0 == 0) goto L1a
            android.content.Context r0 = com.xuexiang.xhttp2.XHttp.getContext()
            java.io.File r0 = r0.getExternalFilesDir(r1)
            goto L22
        L1a:
            android.content.Context r0 = com.xuexiang.xhttp2.XHttp.getContext()
            java.io.File r0 = r0.getFilesDir()
        L22:
            java.lang.String r0 = r0.getPath()
            return r0
    }

    public static java.lang.String getDiskFilesDir(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = getDiskFilesDir()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static android.net.Uri getDownloadFileUri(java.lang.String r2, java.lang.String r3, okhttp3.MediaType r4) {
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "title"
            r0.put(r1, r3)
            java.lang.String r1 = "_display_name"
            r0.put(r1, r3)
            java.lang.String r3 = "mime_type"
            java.lang.String r4 = r4.toString()
            r0.put(r3, r4)
            java.lang.String r3 = "relative_path"
            java.lang.String r2 = getRelativePath(r2)
            r0.put(r3, r2)
            android.content.ContentResolver r2 = getContentResolver()
            android.net.Uri r3 = android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI
            android.net.Uri r2 = r2.insert(r3, r0)
            return r2
    }

    public static java.lang.String getExtDCIMPath() {
            java.lang.String r0 = android.os.Environment.DIRECTORY_DCIM
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    public static java.lang.String getExtDownloadsPath() {
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    public static java.lang.String getExtPicturesPath() {
            java.lang.String r0 = android.os.Environment.DIRECTORY_PICTURES
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    public static java.lang.String getExtStoragePath() {
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    public static java.lang.String getFilePath(java.lang.String r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = getDirPath(r1)
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static android.net.Uri getFileUri(java.lang.String r1, java.lang.String r2, okhttp3.MediaType r3) {
            java.lang.String r0 = com.xuexiang.xhttp2.utils.Utils.EXT_DOWNLOADS_PATH
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto Ld
            android.net.Uri r1 = getDownloadFileUri(r1, r2, r3)
            goto L27
        Ld:
            java.lang.String r0 = com.xuexiang.xhttp2.utils.Utils.EXT_PICTURES_PATH
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = com.xuexiang.xhttp2.utils.Utils.EXT_DCIM_PATH
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L1e
            goto L23
        L1e:
            android.net.Uri r1 = getNormalFileUri(r1, r2, r3)
            goto L27
        L23:
            android.net.Uri r1 = getMediaFileUri(r1, r2, r3)
        L27:
            return r1
    }

    public static android.net.Uri getMediaFileUri(java.lang.String r3, java.lang.String r4, okhttp3.MediaType r5) {
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "title"
            r0.put(r1, r4)
            java.lang.String r1 = "_display_name"
            r0.put(r1, r4)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "date_added"
            r0.put(r1, r4)
            java.lang.String r4 = "mime_type"
            java.lang.String r1 = r5.toString()
            r0.put(r4, r1)
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = "orientation"
            r0.put(r1, r4)
            java.lang.String r4 = "relative_path"
            java.lang.String r3 = getRelativePath(r3)
            r0.put(r4, r3)
            java.lang.String r3 = "image"
            java.lang.String r4 = r5.type()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4f
            android.content.ContentResolver r3 = getContentResolver()
            android.net.Uri r4 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r3 = r3.insert(r4, r0)
            return r3
        L4f:
            java.lang.String r3 = "audio"
            java.lang.String r4 = r5.type()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L66
            android.content.ContentResolver r3 = getContentResolver()
            android.net.Uri r4 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r3 = r3.insert(r4, r0)
            return r3
        L66:
            java.lang.String r3 = "video"
            java.lang.String r4 = r5.type()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L7d
            android.content.ContentResolver r3 = getContentResolver()
            android.net.Uri r4 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r3 = r3.insert(r4, r0)
            return r3
        L7d:
            android.content.ContentResolver r3 = getContentResolver()
            android.net.Uri r4 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r3 = r3.insert(r4, r0)
            return r3
    }

    public static android.net.Uri getNormalFileUri(java.lang.String r2, java.lang.String r3, okhttp3.MediaType r4) {
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "_data"
            java.lang.String r2 = getFilePath(r2, r3)
            r0.put(r1, r2)
            java.lang.String r2 = "mime_type"
            java.lang.String r3 = r4.toString()
            r0.put(r2, r3)
            android.content.ContentResolver r2 = getContentResolver()
            java.lang.String r3 = "external"
            android.net.Uri r3 = android.provider.MediaStore.Files.getContentUri(r3)
            android.net.Uri r2 = r2.insert(r3, r0)
            return r2
    }

    public static java.io.OutputStream getOutputStream(java.lang.String r0, java.lang.String r1, okhttp3.MediaType r2) throws java.io.FileNotFoundException {
            android.net.Uri r0 = getFileUri(r0, r1, r2)
            java.io.OutputStream r0 = openOutputStream(r0)
            return r0
    }

    private static java.lang.String getRelativePath(java.lang.String r3) {
            java.lang.String r0 = com.xuexiang.xhttp2.utils.Utils.EXT_STORAGE_DIR
            int r1 = r3.indexOf(r0)
            r2 = -1
            if (r1 == r2) goto L11
            int r0 = r0.length()
            java.lang.String r3 = r3.substring(r0)
        L11:
            return r3
    }

    public static boolean isEmpty(java.lang.CharSequence r0) {
            if (r0 == 0) goto Lb
            int r0 = r0.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    public static boolean isNetworkAvailable(android.content.Context r1) {
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r0 = 0
            if (r1 != 0) goto L10
            return r0
        L10:
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L1d
            boolean r1 = r1.isAvailable()
            if (r1 == 0) goto L1d
            r0 = 1
        L1d:
            return r0
    }

    public static boolean isPublicPath(java.io.File r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            java.io.File r1 = r1.getCanonicalFile()     // Catch: java.io.IOException -> Ld
            boolean r1 = isPublicPath(r1)     // Catch: java.io.IOException -> Ld
            return r1
        Ld:
            r1 = move-exception
            r1.printStackTrace()
            return r0
    }

    public static boolean isPublicPath(java.lang.String r2) {
            boolean r0 = isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = com.xuexiang.xhttp2.utils.Utils.EXT_STORAGE_PATH
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L19
            java.lang.String r0 = com.xuexiang.xhttp2.utils.Utils.APP_EXT_STORAGE_PATH
            boolean r2 = r2.startsWith(r0)
            if (r2 != 0) goto L19
            r1 = 1
        L19:
            return r1
    }

    private static boolean isSDCardExist() {
            java.lang.String r0 = "mounted"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            boolean r0 = android.os.Environment.isExternalStorageRemovable()
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            return r0
    }

    public static boolean isScopedStorageMode() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            boolean r0 = android.os.Environment.isExternalStorageLegacy()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static java.io.OutputStream openOutputStream(android.net.Uri r1) throws java.io.FileNotFoundException {
            android.content.ContentResolver r0 = getContentResolver()
            java.io.OutputStream r1 = r0.openOutputStream(r1)
            return r1
    }

    public static long toLong(java.lang.String r0, long r1) {
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L5
            return r0
        L5:
            r0 = move-exception
            r0.printStackTrace()
            return r1
    }
}
