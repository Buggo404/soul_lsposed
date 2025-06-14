package com.xuexiang.xhttp2.utils;

/* loaded from: classes.dex */
public final class PathUtils {
    private PathUtils() {
            r2 = this;
            r2.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "u can't instantiate me..."
            r0.<init>(r1)
            throw r0
    }

    private static java.lang.String getDataColumn(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L2e java.lang.IllegalArgumentException -> L30
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2e java.lang.IllegalArgumentException -> L30
            if (r8 == 0) goto L2b
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.IllegalArgumentException -> L29 java.lang.Throwable -> L3b
            if (r9 == 0) goto L2b
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.IllegalArgumentException -> L29 java.lang.Throwable -> L3b
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.IllegalArgumentException -> L29 java.lang.Throwable -> L3b
            if (r8 == 0) goto L28
            r8.close()
        L28:
            return r9
        L29:
            r9 = move-exception
            goto L32
        L2b:
            if (r8 == 0) goto L3a
            goto L37
        L2e:
            r9 = move-exception
            goto L3d
        L30:
            r9 = move-exception
            r8 = r7
        L32:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L3b
            if (r8 == 0) goto L3a
        L37:
            r8.close()
        L3a:
            return r7
        L3b:
            r9 = move-exception
            r7 = r8
        L3d:
            if (r7 == 0) goto L42
            r7.close()
        L42:
            throw r9
    }

    private static java.lang.String getDownloadPathById(android.content.Context r1, long r2) {
            java.lang.String r0 = "content://downloads/public_downloads"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri r2 = android.content.ContentUris.withAppendedId(r0, r2)
            r3 = 0
            java.lang.String r1 = getDataColumn(r1, r2, r3, r3)
            return r1
    }

    public static java.lang.String getFilePathByUri(android.content.Context r16, android.net.Uri r17) {
            r0 = r16
            r1 = r17
            if (r0 == 0) goto L236
            if (r1 != 0) goto La
            goto L236
        La:
            java.lang.String r3 = r17.getScheme()
            java.lang.String r4 = "file"
            boolean r5 = r4.equals(r3)
            if (r5 == 0) goto L1b
            java.lang.String r0 = r17.getPath()
            return r0
        L1b:
            java.lang.String r5 = "content"
            boolean r6 = r5.equals(r3)
            boolean r6 = r5.equals(r3)
            if (r6 == 0) goto L1c7
            boolean r6 = android.provider.DocumentsContract.isDocumentUri(r16, r17)
            if (r6 == 0) goto L1c7
            boolean r3 = isExternalStorageDocument(r17)
            r4 = 2
            java.lang.String r5 = ":"
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L135
            java.lang.String r1 = android.provider.DocumentsContract.getDocumentId(r17)
            java.lang.String[] r1 = r1.split(r5)
            int r3 = r1.length
            if (r3 != r4) goto L1c5
            r3 = r1[r7]
            java.lang.String r4 = "primary"
            boolean r4 = r4.equalsIgnoreCase(r3)
            java.lang.String r5 = "/"
            if (r4 == 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r5)
            r1 = r1[r6]
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L6b:
            java.lang.String r4 = "storage"
            java.lang.Object r0 = r0.getSystemService(r4)
            android.os.storage.StorageManager r0 = (android.os.storage.StorageManager) r0
            java.lang.String r4 = "android.os.storage.StorageVolume"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L12f
            java.lang.Class r8 = r0.getClass()     // Catch: java.lang.Exception -> L12f
            java.lang.String r9 = "getVolumeList"
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L12f
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch: java.lang.Exception -> L12f
            java.lang.String r9 = "getUuid"
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L12f
            java.lang.reflect.Method r9 = r4.getMethod(r9, r10)     // Catch: java.lang.Exception -> L12f
            java.lang.String r10 = "getState"
            java.lang.Class[] r11 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L12f
            java.lang.reflect.Method r10 = r4.getMethod(r10, r11)     // Catch: java.lang.Exception -> L12f
            java.lang.String r11 = "getPath"
            java.lang.Class[] r12 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L12f
            java.lang.reflect.Method r11 = r4.getMethod(r11, r12)     // Catch: java.lang.Exception -> L12f
            java.lang.String r12 = "isPrimary"
            java.lang.Class[] r13 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L12f
            java.lang.reflect.Method r12 = r4.getMethod(r12, r13)     // Catch: java.lang.Exception -> L12f
            java.lang.String r13 = "isEmulated"
            java.lang.Class[] r14 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L12f
            java.lang.reflect.Method r4 = r4.getMethod(r13, r14)     // Catch: java.lang.Exception -> L12f
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L12f
            java.lang.Object r0 = r8.invoke(r0, r13)     // Catch: java.lang.Exception -> L12f
            int r8 = java.lang.reflect.Array.getLength(r0)     // Catch: java.lang.Exception -> L12f
            r13 = r7
        Lb8:
            if (r13 >= r8) goto L1c5
            java.lang.Object r14 = java.lang.reflect.Array.get(r0, r13)     // Catch: java.lang.Exception -> L12f
            java.lang.String r15 = "mounted"
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L12f
            java.lang.Object r2 = r10.invoke(r14, r2)     // Catch: java.lang.Exception -> L12f
            boolean r2 = r15.equals(r2)     // Catch: java.lang.Exception -> L12f
            if (r2 != 0) goto Ldd
            java.lang.String r2 = "mounted_ro"
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L12f
            java.lang.Object r15 = r10.invoke(r14, r15)     // Catch: java.lang.Exception -> L12f
            boolean r2 = r2.equals(r15)     // Catch: java.lang.Exception -> L12f
            if (r2 == 0) goto Ldb
            goto Ldd
        Ldb:
            r2 = r7
            goto Lde
        Ldd:
            r2 = r6
        Lde:
            if (r2 != 0) goto Le1
            goto L12c
        Le1:
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L12f
            java.lang.Object r2 = r12.invoke(r14, r2)     // Catch: java.lang.Exception -> L12f
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L12f
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L12f
            if (r2 == 0) goto Lfe
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L12f
            java.lang.Object r2 = r4.invoke(r14, r2)     // Catch: java.lang.Exception -> L12f
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L12f
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L12f
            if (r2 == 0) goto Lfe
            goto L12c
        Lfe:
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L12f
            java.lang.Object r2 = r9.invoke(r14, r2)     // Catch: java.lang.Exception -> L12f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L12f
            if (r2 == 0) goto L12c
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L12f
            if (r2 == 0) goto L12c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L12f
            r0.<init>()     // Catch: java.lang.Exception -> L12f
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L12f
            java.lang.Object r2 = r11.invoke(r14, r2)     // Catch: java.lang.Exception -> L12f
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Exception -> L12f
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Exception -> L12f
            r1 = r1[r6]     // Catch: java.lang.Exception -> L12f
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L12f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L12f
            return r0
        L12c:
            int r13 = r13 + 1
            goto Lb8
        L12f:
            r0 = move-exception
            r0.printStackTrace()
            goto L1c5
        L135:
            boolean r2 = isDownloadsDocument(r17)
            java.lang.String r3 = "_id=?"
            if (r2 == 0) goto L188
            java.lang.String r1 = android.provider.DocumentsContract.getDocumentId(r17)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L149
            r2 = 0
            return r2
        L149:
            java.lang.String r2 = "raw:"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L157
            r0 = 4
            java.lang.String r0 = r1.substring(r0)
            return r0
        L157:
            java.lang.String r2 = "msf:"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L179
            int r2 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r2 < r8) goto L179
            java.lang.String[] r2 = r1.split(r5)
            int r5 = r2.length
            if (r5 != r4) goto L179
            android.net.Uri r1 = android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI
            java.lang.String[] r4 = new java.lang.String[r6]
            r2 = r2[r6]
            r4[r7] = r2
            java.lang.String r0 = getDataColumn(r0, r1, r3, r4)
            return r0
        L179:
            r2 = -1
            long r4 = com.xuexiang.xhttp2.utils.Utils.toLong(r1, r2)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L1c5
            java.lang.String r0 = getDownloadPathById(r0, r4)
            return r0
        L188:
            boolean r2 = isMediaDocument(r17)
            if (r2 == 0) goto L1c5
            java.lang.String r1 = android.provider.DocumentsContract.getDocumentId(r17)
            java.lang.String[] r1 = r1.split(r5)
            r2 = r1[r7]
            java.lang.String r4 = "image"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L1a3
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L1ba
        L1a3:
            java.lang.String r4 = "video"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L1ae
            android.net.Uri r2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto L1ba
        L1ae:
            java.lang.String r4 = "audio"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L1b9
            android.net.Uri r2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            goto L1ba
        L1b9:
            r2 = 0
        L1ba:
            java.lang.String[] r4 = new java.lang.String[r6]
            r1 = r1[r6]
            r4[r7] = r1
            java.lang.String r0 = getDataColumn(r0, r2, r3, r4)
            return r0
        L1c5:
            r2 = 0
            goto L235
        L1c7:
            boolean r2 = r5.equalsIgnoreCase(r3)
            if (r2 == 0) goto L229
            boolean r2 = isGooglePhotosUri(r17)
            if (r2 == 0) goto L1d8
            java.lang.String r0 = r17.getLastPathSegment()
            return r0
        L1d8:
            boolean r2 = isHuaWeiUri(r17)
            if (r2 == 0) goto L1f7
            java.lang.String r2 = r17.getPath()
            boolean r3 = com.xuexiang.xhttp2.utils.Utils.isEmpty(r2)
            if (r3 != 0) goto L223
            java.lang.String r3 = "/root"
            boolean r4 = r2.startsWith(r3)
            if (r4 == 0) goto L223
            java.lang.String r0 = ""
            java.lang.String r0 = r2.replace(r3, r0)
            return r0
        L1f7:
            boolean r2 = isQQUri(r17)
            if (r2 == 0) goto L223
            java.lang.String r2 = r17.getPath()
            boolean r3 = com.xuexiang.xhttp2.utils.Utils.isEmpty(r2)
            if (r3 != 0) goto L223
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 10
            java.lang.String r1 = r2.substring(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L223:
            r2 = 0
            java.lang.String r0 = getDataColumn(r0, r1, r2, r2)
            return r0
        L229:
            r2 = 0
            boolean r0 = r4.equalsIgnoreCase(r3)
            if (r0 == 0) goto L235
            java.lang.String r0 = r17.getPath()
            return r0
        L235:
            return r2
        L236:
            r2 = 0
            return r2
    }

    public static java.lang.String getFilePathByUri(android.net.Uri r1) {
            android.content.Context r0 = com.xuexiang.xhttp2.XHttp.getContext()
            java.lang.String r1 = getFilePathByUri(r0, r1)
            return r1
    }

    public static boolean isDownloadsDocument(android.net.Uri r1) {
            java.lang.String r0 = "com.android.providers.downloads.documents"
            java.lang.String r1 = r1.getAuthority()
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean isExternalStorageDocument(android.net.Uri r1) {
            java.lang.String r0 = "com.android.externalstorage.documents"
            java.lang.String r1 = r1.getAuthority()
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean isGooglePhotosUri(android.net.Uri r1) {
            java.lang.String r0 = "com.google.android.apps.photos.content"
            java.lang.String r1 = r1.getAuthority()
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean isHuaWeiUri(android.net.Uri r1) {
            java.lang.String r0 = "com.huawei.hidisk.fileprovider"
            java.lang.String r1 = r1.getAuthority()
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean isMediaDocument(android.net.Uri r1) {
            java.lang.String r0 = "com.android.providers.media.documents"
            java.lang.String r1 = r1.getAuthority()
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean isQQUri(android.net.Uri r1) {
            java.lang.String r0 = "com.tencent.mtt.fileprovider"
            java.lang.String r1 = r1.getAuthority()
            boolean r1 = r0.equals(r1)
            return r1
    }
}
