package androidx.documentfile.provider;

/* loaded from: classes.dex */
class RawDocumentFile extends androidx.documentfile.provider.DocumentFile {
    private java.io.File mFile;

    RawDocumentFile(androidx.documentfile.provider.DocumentFile r1, java.io.File r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mFile = r2
            return
    }

    private static boolean deleteContents(java.io.File r6) {
            java.io.File[] r6 = r6.listFiles()
            r0 = 1
            if (r6 == 0) goto L37
            int r1 = r6.length
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r1) goto L37
            r4 = r6[r3]
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L19
            boolean r5 = deleteContents(r4)
            r0 = r0 & r5
        L19:
            boolean r5 = r4.delete()
            if (r5 != 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to delete "
            r0.<init>(r5)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "DocumentFile"
            android.util.Log.w(r4, r0)
            r0 = r2
        L34:
            int r3 = r3 + 1
            goto La
        L37:
            return r0
    }

    private static java.lang.String getTypeForName(java.lang.String r1) {
            r0 = 46
            int r0 = r1.lastIndexOf(r0)
            if (r0 < 0) goto L1d
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
            java.lang.String r1 = r1.toLowerCase()
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r0.getMimeTypeFromExtension(r1)
            if (r1 == 0) goto L1d
            return r1
        L1d:
            java.lang.String r1 = "application/octet-stream"
            return r1
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
            r1 = this;
            java.io.File r0 = r1.mFile
            boolean r0 = r0.canRead()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
            r1 = this;
            java.io.File r0 = r1.mFile
            boolean r0 = r0.canWrite()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createDirectory(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.mFile
            r0.<init>(r1, r3)
            boolean r3 = r0.isDirectory()
            if (r3 != 0) goto L16
            boolean r3 = r0.mkdir()
            if (r3 == 0) goto L14
            goto L16
        L14:
            r3 = 0
            return r3
        L16:
            androidx.documentfile.provider.RawDocumentFile r3 = new androidx.documentfile.provider.RawDocumentFile
            r3.<init>(r2, r0)
            return r3
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createFile(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r2 = r0.getExtensionFromMimeType(r2)
            if (r2 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = r2.toString()
        L21:
            java.io.File r2 = new java.io.File
            java.io.File r0 = r1.mFile
            r2.<init>(r0, r3)
            r2.createNewFile()     // Catch: java.io.IOException -> L31
            androidx.documentfile.provider.RawDocumentFile r3 = new androidx.documentfile.provider.RawDocumentFile     // Catch: java.io.IOException -> L31
            r3.<init>(r1, r2)     // Catch: java.io.IOException -> L31
            return r3
        L31:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to createFile: "
            r3.<init>(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "DocumentFile"
            android.util.Log.w(r3, r2)
            r2 = 0
            return r2
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() {
            r1 = this;
            java.io.File r0 = r1.mFile
            deleteContents(r0)
            java.io.File r0 = r1.mFile
            boolean r0 = r0.delete()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
            r1 = this;
            java.io.File r0 = r1.mFile
            boolean r0 = r0.exists()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getName() {
            r1 = this;
            java.io.File r0 = r1.mFile
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getType() {
            r1 = this;
            java.io.File r0 = r1.mFile
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.io.File r0 = r1.mFile
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getTypeForName(r0)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public android.net.Uri getUri() {
            r1 = this;
            java.io.File r0 = r1.mFile
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
            r1 = this;
            java.io.File r0 = r1.mFile
            boolean r0 = r0.isDirectory()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
            r1 = this;
            java.io.File r0 = r1.mFile
            boolean r0 = r0.isFile()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
            r2 = this;
            java.io.File r0 = r2.mFile
            long r0 = r0.lastModified()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
            r2 = this;
            java.io.File r0 = r2.mFile
            long r0 = r0.length()
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile[] listFiles() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = r6.mFile
            java.io.File[] r1 = r1.listFiles()
            if (r1 == 0) goto L1e
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L1e
            r4 = r1[r3]
            androidx.documentfile.provider.RawDocumentFile r5 = new androidx.documentfile.provider.RawDocumentFile
            r5.<init>(r6, r4)
            r0.add(r5)
            int r3 = r3 + 1
            goto Lf
        L1e:
            int r1 = r0.size()
            androidx.documentfile.provider.DocumentFile[] r1 = new androidx.documentfile.provider.DocumentFile[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            androidx.documentfile.provider.DocumentFile[] r0 = (androidx.documentfile.provider.DocumentFile[]) r0
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.mFile
            java.io.File r1 = r1.getParentFile()
            r0.<init>(r1, r3)
            java.io.File r3 = r2.mFile
            boolean r3 = r3.renameTo(r0)
            if (r3 == 0) goto L17
            r2.mFile = r0
            r3 = 1
            return r3
        L17:
            r3 = 0
            return r3
    }
}
