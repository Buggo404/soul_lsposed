package androidx.documentfile.provider;

/* loaded from: classes.dex */
class DocumentsContractApi19 {
    private static final int FLAG_VIRTUAL_DOCUMENT = 512;
    private static final java.lang.String TAG = "DocumentFile";

    private DocumentsContractApi19() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean canRead(android.content.Context r3, android.net.Uri r4) {
            r0 = 1
            int r1 = r3.checkCallingOrSelfUriPermission(r4, r0)
            r2 = 0
            if (r1 == 0) goto L9
            return r2
        L9:
            java.lang.String r3 = getRawType(r3, r4)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L14
            return r2
        L14:
            return r0
    }

    public static boolean canWrite(android.content.Context r4, android.net.Uri r5) {
            r0 = 2
            int r1 = r4.checkCallingOrSelfUriPermission(r5, r0)
            r2 = 0
            if (r1 == 0) goto L9
            return r2
        L9:
            java.lang.String r1 = getRawType(r4, r5)
            java.lang.String r3 = "flags"
            int r4 = queryForInt(r4, r5, r3, r2)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 == 0) goto L1a
            return r2
        L1a:
            r5 = r4 & 4
            r3 = 1
            if (r5 == 0) goto L20
            return r3
        L20:
            java.lang.String r5 = "vnd.android.document/directory"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L2d
            r5 = r4 & 8
            if (r5 == 0) goto L2d
            return r3
        L2d:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L37
            r4 = r4 & r0
            if (r4 == 0) goto L37
            return r3
        L37:
            return r2
    }

    private static void closeQuietly(java.lang.AutoCloseable r0) {
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.RuntimeException -> L6 java.lang.Exception -> L8
            goto L8
        L6:
            r0 = move-exception
            throw r0
        L8:
            return
    }

    public static boolean exists(android.content.Context r8, android.net.Uri r9) {
            java.lang.String r0 = "Failed query: "
            android.content.ContentResolver r1 = r8.getContentResolver()
            r8 = 0
            r7 = 0
            java.lang.String r2 = "document_id"
            java.lang.String[] r3 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r9
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            int r9 = r7.getCount()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            if (r9 <= 0) goto L1d
            r8 = 1
        L1d:
            closeQuietly(r7)
            return r8
        L21:
            r8 = move-exception
            goto L3a
        L23:
            r9 = move-exception
            java.lang.String r1 = "DocumentFile"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.StringBuilder r9 = r2.append(r9)     // Catch: java.lang.Throwable -> L21
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L21
            android.util.Log.w(r1, r9)     // Catch: java.lang.Throwable -> L21
            closeQuietly(r7)
            return r8
        L3a:
            closeQuietly(r7)
            throw r8
    }

    public static long getFlags(android.content.Context r3, android.net.Uri r4) {
            java.lang.String r0 = "flags"
            r1 = 0
            long r3 = queryForLong(r3, r4, r0, r1)
            return r3
    }

    public static java.lang.String getName(android.content.Context r2, android.net.Uri r3) {
            java.lang.String r0 = "_display_name"
            r1 = 0
            java.lang.String r2 = queryForString(r2, r3, r0, r1)
            return r2
    }

    private static java.lang.String getRawType(android.content.Context r2, android.net.Uri r3) {
            java.lang.String r0 = "mime_type"
            r1 = 0
            java.lang.String r2 = queryForString(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String getType(android.content.Context r0, android.net.Uri r1) {
            java.lang.String r0 = getRawType(r0, r1)
            java.lang.String r1 = "vnd.android.document/directory"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Ld
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isDirectory(android.content.Context r1, android.net.Uri r2) {
            java.lang.String r0 = "vnd.android.document/directory"
            java.lang.String r1 = getRawType(r1, r2)
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean isFile(android.content.Context r0, android.net.Uri r1) {
            java.lang.String r0 = getRawType(r0, r1)
            java.lang.String r1 = "vnd.android.document/directory"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L15
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    public static boolean isVirtual(android.content.Context r4, android.net.Uri r5) {
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r4, r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            long r4 = getFlags(r4, r5)
            r2 = 512(0x200, double:2.53E-321)
            long r4 = r4 & r2
            r2 = 0
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L16
            r1 = 1
        L16:
            return r1
    }

    public static long lastModified(android.content.Context r3, android.net.Uri r4) {
            java.lang.String r0 = "last_modified"
            r1 = 0
            long r3 = queryForLong(r3, r4, r0, r1)
            return r3
    }

    public static long length(android.content.Context r3, android.net.Uri r4) {
            java.lang.String r0 = "_size"
            r1 = 0
            long r3 = queryForLong(r3, r4, r0, r1)
            return r3
    }

    private static int queryForInt(android.content.Context r2, android.net.Uri r3, java.lang.String r4, int r5) {
            long r0 = (long) r5
            long r2 = queryForLong(r2, r3, r4, r0)
            int r2 = (int) r2
            return r2
    }

    private static long queryForLong(android.content.Context r8, android.net.Uri r9, java.lang.String r10, long r11) {
            java.lang.String r0 = "Failed query: "
            android.content.ContentResolver r1 = r8.getContentResolver()
            r8 = 1
            r7 = 0
            java.lang.String[] r3 = new java.lang.String[r8]     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r8 = 0
            r3[r8] = r10     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r9
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            boolean r9 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            if (r9 == 0) goto L29
            boolean r9 = r7.isNull(r8)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            if (r9 != 0) goto L29
            long r8 = r7.getLong(r8)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            closeQuietly(r7)
            return r8
        L29:
            closeQuietly(r7)
            return r11
        L2d:
            r8 = move-exception
            goto L46
        L2f:
            r8 = move-exception
            java.lang.String r9 = "DocumentFile"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r8 = r10.append(r8)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2d
            android.util.Log.w(r9, r8)     // Catch: java.lang.Throwable -> L2d
            closeQuietly(r7)
            return r11
        L46:
            closeQuietly(r7)
            throw r8
    }

    private static java.lang.String queryForString(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String r11) {
            java.lang.String r0 = "Failed query: "
            android.content.ContentResolver r1 = r8.getContentResolver()
            r8 = 1
            r7 = 0
            java.lang.String[] r3 = new java.lang.String[r8]     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r8 = 0
            r3[r8] = r10     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r9
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            boolean r9 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            if (r9 == 0) goto L29
            boolean r9 = r7.isNull(r8)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            if (r9 != 0) goto L29
            java.lang.String r8 = r7.getString(r8)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            closeQuietly(r7)
            return r8
        L29:
            closeQuietly(r7)
            return r11
        L2d:
            r8 = move-exception
            goto L46
        L2f:
            r8 = move-exception
            java.lang.String r9 = "DocumentFile"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r8 = r10.append(r8)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2d
            android.util.Log.w(r9, r8)     // Catch: java.lang.Throwable -> L2d
            closeQuietly(r7)
            return r11
        L46:
            closeQuietly(r7)
            throw r8
    }
}
