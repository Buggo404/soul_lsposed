package com.xuexiang.xhttp2.request.body;

/* loaded from: classes.dex */
public class UploadProgressRequestBody extends okhttp3.RequestBody {
    protected com.xuexiang.xhttp2.request.body.UploadProgressRequestBody.CountingSink countingSink;
    protected okhttp3.RequestBody delegate;
    protected com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack progressCallBack;

    protected final class CountingSink extends okio.ForwardingSink {
        private long bytesWritten;
        private long contentLength;
        private long lastRefreshUiTime;
        final /* synthetic */ com.xuexiang.xhttp2.request.body.UploadProgressRequestBody this$0;

        public CountingSink(com.xuexiang.xhttp2.request.body.UploadProgressRequestBody r1, okio.Sink r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r1 = 0
                r0.bytesWritten = r1
                r0.contentLength = r1
                return
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(okio.Buffer r7, long r8) throws java.io.IOException {
                r6 = this;
                super.write(r7, r8)
                long r0 = r6.contentLength
                r2 = 0
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 > 0) goto L13
                com.xuexiang.xhttp2.request.body.UploadProgressRequestBody r7 = r6.this$0
                long r0 = r7.contentLength()
                r6.contentLength = r0
            L13:
                long r0 = r6.bytesWritten
                long r0 = r0 + r8
                r6.bytesWritten = r0
                long r7 = java.lang.System.currentTimeMillis()
                long r0 = r6.lastRefreshUiTime
                long r7 = r7 - r0
                r0 = 100
                int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r7 >= 0) goto L2d
                long r7 = r6.bytesWritten
                long r0 = r6.contentLength
                int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r7 != 0) goto L46
            L2d:
                com.xuexiang.xhttp2.request.body.UploadProgressRequestBody r7 = r6.this$0
                com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r0 = r7.progressCallBack
                long r1 = r6.bytesWritten
                long r3 = r6.contentLength
                int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r7 != 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = 0
            L3c:
                r5 = r7
                r0.onResponseProgress(r1, r3, r5)
                long r7 = java.lang.System.currentTimeMillis()
                r6.lastRefreshUiTime = r7
            L46:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                java.lang.String r8 = "bytesWritten="
                r7.<init>(r8)
                long r8 = r6.bytesWritten
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r8 = " ,totalBytesCount="
                java.lang.StringBuilder r7 = r7.append(r8)
                long r8 = r6.contentLength
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.xuexiang.xhttp2.logs.HttpLog.m33d(r7)
                return
        }
    }

    public UploadProgressRequestBody(com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r1) {
            r0 = this;
            r0.<init>()
            r0.progressCallBack = r1
            return
    }

    public UploadProgressRequestBody(okhttp3.RequestBody r1, com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r2) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            r0.progressCallBack = r2
            return
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
            r2 = this;
            okhttp3.RequestBody r0 = r2.delegate     // Catch: java.io.IOException -> L7
            long r0 = r0.contentLength()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r0)
            r0 = -1
            return r0
    }

    @Override // okhttp3.RequestBody
    public okhttp3.MediaType contentType() {
            r1 = this;
            okhttp3.RequestBody r0 = r1.delegate
            okhttp3.MediaType r0 = r0.contentType()
            return r0
    }

    public void setRequestBody(okhttp3.RequestBody r1) {
            r0 = this;
            r0.delegate = r1
            return
    }

    @Override // okhttp3.RequestBody
    public void writeTo(okio.BufferedSink r2) throws java.io.IOException {
            r1 = this;
            com.xuexiang.xhttp2.request.body.UploadProgressRequestBody$CountingSink r0 = new com.xuexiang.xhttp2.request.body.UploadProgressRequestBody$CountingSink
            r0.<init>(r1, r2)
            r1.countingSink = r0
            okio.BufferedSink r2 = okio.Okio.buffer(r0)
            okhttp3.RequestBody r0 = r1.delegate
            r0.writeTo(r2)
            r2.flush()
            return
    }
}
