package com.xuexiang.xhttp2.cache.converter;

/* loaded from: classes.dex */
public class SerializableDiskConverter implements com.xuexiang.xhttp2.cache.converter.IDiskConverter {
    public SerializableDiskConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.xuexiang.xhttp2.cache.converter.IDiskConverter
    public <T> T load(java.io.InputStream r4, java.lang.reflect.Type r5) {
            r3 = this;
            r5 = 0
            r0 = 1
            r1 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L18 java.lang.ClassNotFoundException -> L1a java.io.IOException -> L1c
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L18 java.lang.ClassNotFoundException -> L1a java.io.IOException -> L1c
            java.lang.Object r1 = r2.readObject()     // Catch: java.lang.ClassNotFoundException -> L14 java.io.IOException -> L16 java.lang.Throwable -> L2c
            java.io.Closeable[] r4 = new java.io.Closeable[r0]
            r4[r5] = r2
            com.xuexiang.xhttp2.utils.Utils.closeIO(r4)
            goto L2b
        L14:
            r4 = move-exception
            goto L1e
        L16:
            r4 = move-exception
            goto L1e
        L18:
            r4 = move-exception
            goto L2e
        L1a:
            r4 = move-exception
            goto L1d
        L1c:
            r4 = move-exception
        L1d:
            r2 = r1
        L1e:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L2c
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r4)     // Catch: java.lang.Throwable -> L2c
            java.io.Closeable[] r4 = new java.io.Closeable[r0]
            r4[r5] = r2
            com.xuexiang.xhttp2.utils.Utils.closeIO(r4)
        L2b:
            return r1
        L2c:
            r4 = move-exception
            r1 = r2
        L2e:
            java.io.Closeable[] r0 = new java.io.Closeable[r0]
            r0[r5] = r1
            com.xuexiang.xhttp2.utils.Utils.closeIO(r0)
            throw r4
    }

    @Override // com.xuexiang.xhttp2.cache.converter.IDiskConverter
    public boolean writer(java.io.OutputStream r5, java.lang.Object r6) {
            r4 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            r3.writeObject(r6)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L19
            r3.flush()     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L19
            java.io.Closeable[] r5 = new java.io.Closeable[r1]
            r5[r0] = r3
            com.xuexiang.xhttp2.utils.Utils.closeIO(r5)
            return r1
        L16:
            r5 = move-exception
            r2 = r3
            goto L2d
        L19:
            r5 = move-exception
            r2 = r3
            goto L1f
        L1c:
            r5 = move-exception
            goto L2d
        L1e:
            r5 = move-exception
        L1f:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L1c
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r5)     // Catch: java.lang.Throwable -> L1c
            java.io.Closeable[] r5 = new java.io.Closeable[r1]
            r5[r0] = r2
            com.xuexiang.xhttp2.utils.Utils.closeIO(r5)
            return r0
        L2d:
            java.io.Closeable[] r6 = new java.io.Closeable[r1]
            r6[r0] = r2
            com.xuexiang.xhttp2.utils.Utils.closeIO(r6)
            throw r5
    }
}
