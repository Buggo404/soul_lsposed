package com.xuexiang.xhttp2.cache.converter;

/* loaded from: classes.dex */
public class GsonDiskConverter implements com.xuexiang.xhttp2.cache.converter.IDiskConverter {
    private com.google.gson.Gson mGson;

    public GsonDiskConverter() {
            r1 = this;
            r1.<init>()
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            r1.mGson = r0
            return
    }

    public GsonDiskConverter(com.google.gson.Gson r1) {
            r0 = this;
            r0.<init>()
            r0.mGson = r1
            return
    }

    @Override // com.xuexiang.xhttp2.cache.converter.IDiskConverter
    public <T> T load(java.io.InputStream r5, java.lang.reflect.Type r6) {
            r4 = this;
            r0 = 0
            r1 = 1
            com.google.gson.Gson r2 = r4.mGson     // Catch: java.lang.Throwable -> L20 com.google.gson.JsonSyntaxException -> L22 com.google.gson.JsonIOException -> L2e
            if (r2 != 0) goto Ld
            com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch: java.lang.Throwable -> L20 com.google.gson.JsonSyntaxException -> L22 com.google.gson.JsonIOException -> L2e
            r2.<init>()     // Catch: java.lang.Throwable -> L20 com.google.gson.JsonSyntaxException -> L22 com.google.gson.JsonIOException -> L2e
            r4.mGson = r2     // Catch: java.lang.Throwable -> L20 com.google.gson.JsonSyntaxException -> L22 com.google.gson.JsonIOException -> L2e
        Ld:
            com.google.gson.Gson r2 = r4.mGson     // Catch: java.lang.Throwable -> L20 com.google.gson.JsonSyntaxException -> L22 com.google.gson.JsonIOException -> L2e
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L20 com.google.gson.JsonSyntaxException -> L22 com.google.gson.JsonIOException -> L2e
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L20 com.google.gson.JsonSyntaxException -> L22 com.google.gson.JsonIOException -> L2e
            java.lang.Object r6 = r2.fromJson(r3, r6)     // Catch: java.lang.Throwable -> L20 com.google.gson.JsonSyntaxException -> L22 com.google.gson.JsonIOException -> L2e
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r1[r0] = r5
            com.xuexiang.xhttp2.utils.Utils.closeIO(r1)
            goto L3a
        L20:
            r6 = move-exception
            goto L3b
        L22:
            r6 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r6)     // Catch: java.lang.Throwable -> L20
            java.io.Closeable[] r6 = new java.io.Closeable[r1]
            r6[r0] = r5
            com.xuexiang.xhttp2.utils.Utils.closeIO(r6)
            goto L39
        L2e:
            r6 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r6)     // Catch: java.lang.Throwable -> L20
            java.io.Closeable[] r6 = new java.io.Closeable[r1]
            r6[r0] = r5
            com.xuexiang.xhttp2.utils.Utils.closeIO(r6)
        L39:
            r6 = 0
        L3a:
            return r6
        L3b:
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r1[r0] = r5
            com.xuexiang.xhttp2.utils.Utils.closeIO(r1)
            throw r6
    }

    @Override // com.xuexiang.xhttp2.cache.converter.IDiskConverter
    public boolean writer(java.io.OutputStream r4, java.lang.Object r5) {
            r3 = this;
            r0 = 1
            r1 = 0
            com.google.gson.Gson r2 = r3.mGson     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d com.google.gson.JsonSyntaxException -> L29 com.google.gson.JsonIOException -> L35
            java.lang.String r5 = r2.toJson(r5)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d com.google.gson.JsonSyntaxException -> L29 com.google.gson.JsonIOException -> L35
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d com.google.gson.JsonSyntaxException -> L29 com.google.gson.JsonIOException -> L35
            int r2 = r5.length     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d com.google.gson.JsonSyntaxException -> L29 com.google.gson.JsonIOException -> L35
            r4.write(r5, r1, r2)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d com.google.gson.JsonSyntaxException -> L29 com.google.gson.JsonIOException -> L35
            r4.flush()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d com.google.gson.JsonSyntaxException -> L29 com.google.gson.JsonIOException -> L35
            java.io.Closeable[] r5 = new java.io.Closeable[r0]
            r5[r1] = r4
            com.xuexiang.xhttp2.utils.Utils.closeIO(r5)
            return r0
        L1b:
            r5 = move-exception
            goto L41
        L1d:
            r5 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r5)     // Catch: java.lang.Throwable -> L1b
            java.io.Closeable[] r5 = new java.io.Closeable[r0]
            r5[r1] = r4
            com.xuexiang.xhttp2.utils.Utils.closeIO(r5)
            goto L40
        L29:
            r5 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r5)     // Catch: java.lang.Throwable -> L1b
            java.io.Closeable[] r5 = new java.io.Closeable[r0]
            r5[r1] = r4
            com.xuexiang.xhttp2.utils.Utils.closeIO(r5)
            goto L40
        L35:
            r5 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r5)     // Catch: java.lang.Throwable -> L1b
            java.io.Closeable[] r5 = new java.io.Closeable[r0]
            r5[r1] = r4
            com.xuexiang.xhttp2.utils.Utils.closeIO(r5)
        L40:
            return r1
        L41:
            java.io.Closeable[] r0 = new java.io.Closeable[r0]
            r0[r1] = r4
            com.xuexiang.xhttp2.utils.Utils.closeIO(r0)
            throw r5
    }
}
