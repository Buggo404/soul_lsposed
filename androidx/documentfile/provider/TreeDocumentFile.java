package androidx.documentfile.provider;

/* loaded from: classes.dex */
class TreeDocumentFile extends androidx.documentfile.provider.DocumentFile {
    private android.content.Context mContext;
    private android.net.Uri mUri;

    TreeDocumentFile(androidx.documentfile.provider.DocumentFile r1, android.content.Context r2, android.net.Uri r3) {
            r0 = this;
            r0.<init>(r1)
            r0.mContext = r2
            r0.mUri = r3
            return
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

    private static android.net.Uri createFile(android.content.Context r0, android.net.Uri r1, java.lang.String r2, java.lang.String r3) {
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L9
            android.net.Uri r0 = android.provider.DocumentsContract.createDocument(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.canRead(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.canWrite(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createDirectory(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            android.net.Uri r1 = r3.mUri
            java.lang.String r2 = "vnd.android.document/directory"
            android.net.Uri r4 = createFile(r0, r1, r2, r4)
            if (r4 == 0) goto L14
            androidx.documentfile.provider.TreeDocumentFile r0 = new androidx.documentfile.provider.TreeDocumentFile
            android.content.Context r1 = r3.mContext
            r0.<init>(r3, r1, r4)
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createFile(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            android.net.Uri r3 = createFile(r0, r1, r3, r4)
            if (r3 == 0) goto L12
            androidx.documentfile.provider.TreeDocumentFile r4 = new androidx.documentfile.provider.TreeDocumentFile
            android.content.Context r0 = r2.mContext
            r4.<init>(r2, r0, r3)
            goto L13
        L12:
            r4 = 0
        L13:
            return r4
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() {
            r2 = this;
            android.content.Context r0 = r2.mContext     // Catch: java.lang.Exception -> Ld
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> Ld
            android.net.Uri r1 = r2.mUri     // Catch: java.lang.Exception -> Ld
            boolean r0 = android.provider.DocumentsContract.deleteDocument(r0, r1)     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.exists(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getName() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            java.lang.String r0 = androidx.documentfile.provider.DocumentsContractApi19.getName(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getType() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            java.lang.String r0 = androidx.documentfile.provider.DocumentsContractApi19.getType(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public android.net.Uri getUri() {
            r1 = this;
            android.net.Uri r0 = r1.mUri
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.isDirectory(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.isFile(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.isVirtual(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            long r0 = androidx.documentfile.provider.DocumentsContractApi19.lastModified(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            long r0 = androidx.documentfile.provider.DocumentsContractApi19.length(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile[] listFiles() {
            r9 = this;
            android.content.Context r0 = r9.mContext
            android.content.ContentResolver r1 = r0.getContentResolver()
            android.net.Uri r0 = r9.mUri
            java.lang.String r2 = android.provider.DocumentsContract.getDocumentId(r0)
            android.net.Uri r2 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r3 = "document_id"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
        L24:
            boolean r1 = r8.moveToNext()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            if (r1 == 0) goto L38
            java.lang.String r1 = r8.getString(r7)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            android.net.Uri r2 = r9.mUri     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            android.net.Uri r1 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r2, r1)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r0.add(r1)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            goto L24
        L38:
            closeQuietly(r8)
            goto L58
        L3c:
            r0 = move-exception
            goto L79
        L3e:
            r1 = move-exception
            java.lang.String r2 = "DocumentFile"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r3.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "Failed query: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3c
            android.util.Log.w(r2, r1)     // Catch: java.lang.Throwable -> L3c
            goto L38
        L58:
            int r1 = r0.size()
            android.net.Uri[] r1 = new android.net.Uri[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            android.net.Uri[] r0 = (android.net.Uri[]) r0
            int r1 = r0.length
            androidx.documentfile.provider.DocumentFile[] r1 = new androidx.documentfile.provider.DocumentFile[r1]
        L67:
            int r2 = r0.length
            if (r7 >= r2) goto L78
            androidx.documentfile.provider.TreeDocumentFile r2 = new androidx.documentfile.provider.TreeDocumentFile
            android.content.Context r3 = r9.mContext
            r4 = r0[r7]
            r2.<init>(r9, r3, r4)
            r1[r7] = r2
            int r7 = r7 + 1
            goto L67
        L78:
            return r1
        L79:
            closeQuietly(r8)
            throw r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(java.lang.String r4) {
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.mContext     // Catch: java.lang.Exception -> L13
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> L13
            android.net.Uri r2 = r3.mUri     // Catch: java.lang.Exception -> L13
            android.net.Uri r4 = android.provider.DocumentsContract.renameDocument(r1, r2, r4)     // Catch: java.lang.Exception -> L13
            if (r4 == 0) goto L13
            r3.mUri = r4     // Catch: java.lang.Exception -> L13
            r4 = 1
            return r4
        L13:
            return r0
    }
}
