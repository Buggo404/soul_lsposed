package androidx.documentfile.provider;

/* loaded from: classes.dex */
public abstract class DocumentFile {
    static final java.lang.String TAG = "DocumentFile";
    private final androidx.documentfile.provider.DocumentFile mParent;

    DocumentFile(androidx.documentfile.provider.DocumentFile r1) {
            r0 = this;
            r0.<init>()
            r0.mParent = r1
            return
    }

    public static androidx.documentfile.provider.DocumentFile fromFile(java.io.File r2) {
            androidx.documentfile.provider.RawDocumentFile r0 = new androidx.documentfile.provider.RawDocumentFile
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static androidx.documentfile.provider.DocumentFile fromSingleUri(android.content.Context r2, android.net.Uri r3) {
            androidx.documentfile.provider.SingleDocumentFile r0 = new androidx.documentfile.provider.SingleDocumentFile
            r1 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static androidx.documentfile.provider.DocumentFile fromTreeUri(android.content.Context r2, android.net.Uri r3) {
            androidx.documentfile.provider.TreeDocumentFile r0 = new androidx.documentfile.provider.TreeDocumentFile
            java.lang.String r1 = android.provider.DocumentsContract.getTreeDocumentId(r3)
            android.net.Uri r3 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r3, r1)
            r1 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static boolean isDocumentUri(android.content.Context r0, android.net.Uri r1) {
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r0, r1)
            return r0
    }

    public abstract boolean canRead();

    public abstract boolean canWrite();

    public abstract androidx.documentfile.provider.DocumentFile createDirectory(java.lang.String r1);

    public abstract androidx.documentfile.provider.DocumentFile createFile(java.lang.String r1, java.lang.String r2);

    public abstract boolean delete();

    public abstract boolean exists();

    public androidx.documentfile.provider.DocumentFile findFile(java.lang.String r6) {
            r5 = this;
            androidx.documentfile.provider.DocumentFile[] r0 = r5.listFiles()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L15
            return r3
        L15:
            int r2 = r2 + 1
            goto L6
        L18:
            r6 = 0
            return r6
    }

    public abstract java.lang.String getName();

    public androidx.documentfile.provider.DocumentFile getParentFile() {
            r1 = this;
            androidx.documentfile.provider.DocumentFile r0 = r1.mParent
            return r0
    }

    public abstract java.lang.String getType();

    public abstract android.net.Uri getUri();

    public abstract boolean isDirectory();

    public abstract boolean isFile();

    public abstract boolean isVirtual();

    public abstract long lastModified();

    public abstract long length();

    public abstract androidx.documentfile.provider.DocumentFile[] listFiles();

    public abstract boolean renameTo(java.lang.String r1);
}
