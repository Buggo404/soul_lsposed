package androidx.core.util;

/* loaded from: classes.dex */
public class AtomicFile {
    private static final java.lang.String LOG_TAG = "AtomicFile";
    private final java.io.File mBaseName;
    private final java.io.File mLegacyBackupName;
    private final java.io.File mNewName;

    public AtomicFile(java.io.File r4) {
            r3 = this;
            r3.<init>()
            r3.mBaseName = r4
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getPath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ".new"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r3.mNewName = r0
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = r4.getPath()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ".bak"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            r3.mLegacyBackupName = r0
            return
    }

    private static void rename(java.io.File r3, java.io.File r4) {
            boolean r0 = r4.isDirectory()
            java.lang.String r1 = "AtomicFile"
            if (r0 == 0) goto L20
            boolean r0 = r4.delete()
            if (r0 != 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to delete file which is a directory "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
        L20:
            boolean r0 = r3.renameTo(r4)
            if (r0 != 0) goto L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to rename "
            r0.<init>(r2)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " to "
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r1, r3)
        L42:
            return
    }

    private static boolean sync(java.io.FileOutputStream r0) {
            java.io.FileDescriptor r0 = r0.getFD()     // Catch: java.io.IOException -> L9
            r0.sync()     // Catch: java.io.IOException -> L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void delete() {
            r1 = this;
            java.io.File r0 = r1.mBaseName
            r0.delete()
            java.io.File r0 = r1.mNewName
            r0.delete()
            java.io.File r0 = r1.mLegacyBackupName
            r0.delete()
            return
    }

    public void failWrite(java.io.FileOutputStream r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            boolean r0 = sync(r3)
            java.lang.String r1 = "AtomicFile"
            if (r0 != 0) goto L10
            java.lang.String r0 = "Failed to sync file output stream"
            android.util.Log.e(r1, r0)
        L10:
            r3.close()     // Catch: java.io.IOException -> L14
            goto L1a
        L14:
            r3 = move-exception
            java.lang.String r0 = "Failed to close file output stream"
            android.util.Log.e(r1, r0, r3)
        L1a:
            java.io.File r3 = r2.mNewName
            boolean r3 = r3.delete()
            if (r3 != 0) goto L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to delete new file "
            r3.<init>(r0)
            java.io.File r0 = r2.mNewName
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r1, r3)
        L36:
            return
    }

    public void finishWrite(java.io.FileOutputStream r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            boolean r0 = sync(r3)
            java.lang.String r1 = "AtomicFile"
            if (r0 != 0) goto L10
            java.lang.String r0 = "Failed to sync file output stream"
            android.util.Log.e(r1, r0)
        L10:
            r3.close()     // Catch: java.io.IOException -> L14
            goto L1a
        L14:
            r3 = move-exception
            java.lang.String r0 = "Failed to close file output stream"
            android.util.Log.e(r1, r0, r3)
        L1a:
            java.io.File r3 = r2.mNewName
            java.io.File r0 = r2.mBaseName
            rename(r3, r0)
            return
    }

    public java.io.File getBaseFile() {
            r1 = this;
            java.io.File r0 = r1.mBaseName
            return r0
    }

    public java.io.FileInputStream openRead() throws java.io.FileNotFoundException {
            r2 = this;
            java.io.File r0 = r2.mLegacyBackupName
            boolean r0 = r0.exists()
            if (r0 == 0) goto Lf
            java.io.File r0 = r2.mLegacyBackupName
            java.io.File r1 = r2.mBaseName
            rename(r0, r1)
        Lf:
            java.io.File r0 = r2.mNewName
            boolean r0 = r0.exists()
            if (r0 == 0) goto L3d
            java.io.File r0 = r2.mBaseName
            boolean r0 = r0.exists()
            if (r0 == 0) goto L3d
            java.io.File r0 = r2.mNewName
            boolean r0 = r0.delete()
            if (r0 != 0) goto L3d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to delete outdated new file "
            r0.<init>(r1)
            java.io.File r1 = r2.mNewName
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AtomicFile"
            android.util.Log.e(r1, r0)
        L3d:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r2.mBaseName
            r0.<init>(r1)
            return r0
    }

    public byte[] readFully() throws java.io.IOException {
            r6 = this;
            java.io.FileInputStream r0 = r6.openRead()
            int r1 = r0.available()     // Catch: java.lang.Throwable -> L29
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r3 = r2
        Lc:
            int r4 = r1.length     // Catch: java.lang.Throwable -> L29
            int r4 = r4 - r3
            int r4 = r0.read(r1, r3, r4)     // Catch: java.lang.Throwable -> L29
            if (r4 > 0) goto L18
            r0.close()
            return r1
        L18:
            int r3 = r3 + r4
            int r4 = r0.available()     // Catch: java.lang.Throwable -> L29
            int r5 = r1.length     // Catch: java.lang.Throwable -> L29
            int r5 = r5 - r3
            if (r4 <= r5) goto Lc
            int r4 = r4 + r3
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L29
            java.lang.System.arraycopy(r1, r2, r4, r2, r3)     // Catch: java.lang.Throwable -> L29
            r1 = r4
            goto Lc
        L29:
            r1 = move-exception
            r0.close()
            throw r1
    }

    public java.io.FileOutputStream startWrite() throws java.io.IOException {
            r4 = this;
            java.io.File r0 = r4.mLegacyBackupName
            boolean r0 = r0.exists()
            if (r0 == 0) goto Lf
            java.io.File r0 = r4.mLegacyBackupName
            java.io.File r1 = r4.mBaseName
            rename(r0, r1)
        Lf:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L17
            java.io.File r1 = r4.mNewName     // Catch: java.io.FileNotFoundException -> L17
            r0.<init>(r1)     // Catch: java.io.FileNotFoundException -> L17
            return r0
        L17:
            java.io.File r0 = r4.mNewName
            java.io.File r0 = r0.getParentFile()
            boolean r0 = r0.mkdirs()
            if (r0 == 0) goto L43
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L2b
            java.io.File r1 = r4.mNewName     // Catch: java.io.FileNotFoundException -> L2b
            r0.<init>(r1)     // Catch: java.io.FileNotFoundException -> L2b
            return r0
        L2b:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to create new file "
            r2.<init>(r3)
            java.io.File r3 = r4.mNewName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L43:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to create directory for "
            r1.<init>(r2)
            java.io.File r2 = r4.mNewName
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
