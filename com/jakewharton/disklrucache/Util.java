package com.jakewharton.disklrucache;

/* loaded from: classes.dex */
public final class Util {
    static final java.nio.charset.Charset US_ASCII = null;
    static final java.nio.charset.Charset UTF_8 = null;

    static {
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.jakewharton.disklrucache.Util.US_ASCII = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.jakewharton.disklrucache.Util.UTF_8 = r0
            return
    }

    private Util() {
            r0 = this;
            r0.<init>()
            return
    }

    static void closeQuietly(java.io.Closeable r0) {
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.RuntimeException -> L6 java.lang.Exception -> L8
            goto L8
        L6:
            r0 = move-exception
            throw r0
        L8:
            return
    }

    static void deleteContents(java.io.File r4) throws java.io.IOException {
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L34
            int r4 = r0.length
            r1 = 0
        L8:
            if (r1 >= r4) goto L33
            r2 = r0[r1]
            boolean r3 = r2.isDirectory()
            if (r3 == 0) goto L15
            deleteContents(r2)
        L15:
            boolean r3 = r2.delete()
            if (r3 == 0) goto L1e
            int r1 = r1 + 1
            goto L8
        L1e:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to delete file: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L33:
            return
        L34:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "not a readable directory: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    static java.lang.String readFully(java.io.Reader r4) throws java.io.IOException {
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L1d
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            r1 = 1024(0x400, float:1.435E-42)
            char[] r1 = new char[r1]     // Catch: java.lang.Throwable -> L1d
        L9:
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L1d
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r0.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L1d
            goto L9
        L15:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1d
            r4.close()
            return r0
        L1d:
            r0 = move-exception
            r4.close()
            throw r0
    }
}
