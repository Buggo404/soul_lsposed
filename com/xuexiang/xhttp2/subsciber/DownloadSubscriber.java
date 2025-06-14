package com.xuexiang.xhttp2.subsciber;

import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public class DownloadSubscriber<ResponseBody extends okhttp3.ResponseBody> extends com.xuexiang.xhttp2.subsciber.BaseSubscriber<ResponseBody> {
    private static java.lang.String APK_CONTENT_TYPE = "application/vnd.android.package-archive";
    private static java.lang.String JPG_CONTENT_TYPE = "image/jpg";
    private static java.lang.String MP4_CONTENT_TYPE = "video/mp4";
    private static java.lang.String PNG_CONTENT_TYPE = "image/png";
    private long lastRefreshUiTime;
    private com.xuexiang.xhttp2.callback.CallBack mCallBack;
    private java.lang.String name;
    private java.lang.String path;







    static {
            return
    }

    public DownloadSubscriber(java.lang.String r1, java.lang.String r2, com.xuexiang.xhttp2.callback.CallBack r3) {
            r0 = this;
            r0.<init>()
            r0.path = r1
            r0.name = r2
            r0.mCallBack = r3
            long r1 = java.lang.System.currentTimeMillis()
            r0.lastRefreshUiTime = r1
            return
    }

    static /* synthetic */ com.xuexiang.xhttp2.callback.CallBack access$000(com.xuexiang.xhttp2.subsciber.DownloadSubscriber r0) {
            com.xuexiang.xhttp2.callback.CallBack r0 = r0.mCallBack
            return r0
    }

    private java.lang.String checkFileName(java.lang.String r3, okhttp3.ResponseBody r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "contentType:>>>>"
            r0.<init>(r1)
            okhttp3.MediaType r1 = r4.contentType()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.xuexiang.xhttp2.logs.HttpLog.m33d(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "."
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L53
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r4 = r2.getFileSuffix(r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L53
        L3a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = r2.getFileSuffix(r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
        L53:
            return r3
    }

    private java.lang.String checkFilePath(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            if (r3 != 0) goto L7
            java.lang.String r3 = com.xuexiang.xhttp2.utils.Utils.getDiskFilesDir(r4)
            goto L34
        L7:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L15
            r0.mkdirs()
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = java.io.File.separator
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "//"
            java.lang.String r0 = "/"
            java.lang.String r3 = r3.replaceAll(r4, r0)
        L34:
            return r3
    }

    private void finalOnError(java.lang.Throwable r3) {
            r2 = this;
            com.xuexiang.xhttp2.callback.CallBack r0 = r2.mCallBack
            if (r0 != 0) goto L5
            return
        L5:
            com.xuexiang.xhttp2.exception.ApiException r0 = new com.xuexiang.xhttp2.exception.ApiException
            r1 = 5012(0x1394, float:7.023E-42)
            r0.<init>(r3, r1)
            io.reactivex.Observable r3 = io.reactivex.Observable.just(r0)
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r3 = r3.observeOn(r0)
            com.xuexiang.xhttp2.subsciber.DownloadSubscriber$5 r0 = new com.xuexiang.xhttp2.subsciber.DownloadSubscriber$5
            r0.<init>(r2)
            com.xuexiang.xhttp2.subsciber.DownloadSubscriber$6 r1 = new com.xuexiang.xhttp2.subsciber.DownloadSubscriber$6
            r1.<init>(r2)
            r3.subscribe(r0, r1)
            return
    }

    private java.lang.String getFileSuffix(okhttp3.ResponseBody r3) {
            r2 = this;
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 != 0) goto L9
            java.lang.String r3 = ".txt"
            return r3
        L9:
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = com.xuexiang.xhttp2.subsciber.DownloadSubscriber.APK_CONTENT_TYPE
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L18
            java.lang.String r3 = ".apk"
            goto L4c
        L18:
            java.lang.String r1 = com.xuexiang.xhttp2.subsciber.DownloadSubscriber.PNG_CONTENT_TYPE
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L23
            java.lang.String r3 = ".png"
            goto L4c
        L23:
            java.lang.String r1 = com.xuexiang.xhttp2.subsciber.DownloadSubscriber.JPG_CONTENT_TYPE
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L2e
            java.lang.String r3 = ".jpg"
            goto L4c
        L2e:
            java.lang.String r1 = com.xuexiang.xhttp2.subsciber.DownloadSubscriber.MP4_CONTENT_TYPE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L39
            java.lang.String r3 = ".mp4"
            goto L4c
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "."
            r0.<init>(r1)
            java.lang.String r3 = r3.subtype()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
        L4c:
            return r3
    }

    private void handleDownLoadFinished(java.lang.String r3, com.xuexiang.xhttp2.callback.CallBack r4) {
            r2 = this;
            if (r4 == 0) goto L20
            io.reactivex.Observable r0 = io.reactivex.Observable.just(r3)
            io.reactivex.Scheduler r1 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r0 = r0.observeOn(r1)
            com.xuexiang.xhttp2.subsciber.DownloadSubscriber$3 r1 = new com.xuexiang.xhttp2.subsciber.DownloadSubscriber$3
            r1.<init>(r2, r4, r3)
            com.xuexiang.xhttp2.subsciber.DownloadSubscriber$4 r3 = new com.xuexiang.xhttp2.subsciber.DownloadSubscriber$4
            r3.<init>(r2)
            r0.subscribe(r1, r3)
            java.lang.String r3 = "file downloaded: is success"
            com.xuexiang.xhttp2.logs.HttpLog.m37i(r3)
        L20:
            return
    }

    private void updateDownLoadProgress(long r10, long r12, com.xuexiang.xhttp2.callback.CallBack r14) {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "file download: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r1 = " of "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.xuexiang.xhttp2.logs.HttpLog.m33d(r0)
            float r0 = (float) r12
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r1
            float r2 = (float) r10
            float r0 = r0 / r2
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r9.lastRefreshUiTime
            long r2 = r2 - r4
            r4 = 200(0xc8, double:9.9E-322)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L33
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5d
        L33:
            if (r14 == 0) goto L57
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            io.reactivex.Observable r0 = io.reactivex.Observable.just(r0)
            io.reactivex.Scheduler r1 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r0 = r0.observeOn(r1)
            com.xuexiang.xhttp2.subsciber.DownloadSubscriber$1 r8 = new com.xuexiang.xhttp2.subsciber.DownloadSubscriber$1
            r1 = r8
            r2 = r9
            r3 = r14
            r4 = r12
            r6 = r10
            r1.<init>(r2, r3, r4, r6)
            com.xuexiang.xhttp2.subsciber.DownloadSubscriber$2 r10 = new com.xuexiang.xhttp2.subsciber.DownloadSubscriber$2
            r10.<init>(r9)
            r0.subscribe(r8, r10)
        L57:
            long r10 = java.lang.System.currentTimeMillis()
            r9.lastRefreshUiTime = r10
        L5d:
            return
    }

    private void writeResponseBodyToDisk(java.lang.String r20, java.lang.String r21, okhttp3.ResponseBody r22) {
            r19 = this;
            r7 = r19
            java.lang.String r0 = "file length: "
            r1 = r21
            r2 = r22
            java.lang.String r1 = r7.checkFileName(r1, r2)
            r3 = r20
            java.lang.String r8 = r7.checkFilePath(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "path:-->"
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.xuexiang.xhttp2.logs.HttpLog.m37i(r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r8)
            r3 = 131072(0x20000, float:1.83671E-40)
            r9 = 1
            r10 = 2
            r11 = 0
            r4 = 0
            byte[] r12 = new byte[r3]     // Catch: java.lang.Throwable -> Lab
            long r13 = r22.contentLength()     // Catch: java.lang.Throwable -> Lab
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lab
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.StringBuilder r0 = r3.append(r13)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lab
            com.xuexiang.xhttp2.logs.HttpLog.m37i(r0)     // Catch: java.lang.Throwable -> Lab
            java.io.InputStream r15 = r22.byteStream()     // Catch: java.lang.Throwable -> Lab
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La9
            r6.<init>(r1)     // Catch: java.lang.Throwable -> La9
            com.xuexiang.xhttp2.callback.CallBack r0 = r7.mCallBack     // Catch: java.lang.Throwable -> La3
            r1 = 0
        L52:
            int r3 = r15.read(r12)     // Catch: java.lang.Throwable -> La3
            r4 = -1
            if (r3 == r4) goto L6f
            r6.write(r12, r11, r3)     // Catch: java.lang.Throwable -> La3
            long r3 = (long) r3
            long r16 = r1 + r3
            r1 = r19
            r2 = r13
            r4 = r16
            r18 = r6
            r6 = r0
            r1.updateDownLoadProgress(r2, r4, r6)     // Catch: java.lang.Throwable -> La1
            r1 = r16
            r6 = r18
            goto L52
        L6f:
            r18 = r6
            r18.flush()     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La1
            r3.<init>()     // Catch: java.lang.Throwable -> La1
            java.lang.String r4 = "file downloaded: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = " of "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r1 = r1.append(r13)     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La1
            com.xuexiang.xhttp2.logs.HttpLog.m37i(r1)     // Catch: java.lang.Throwable -> La1
            r7.handleDownLoadFinished(r8, r0)     // Catch: java.lang.Throwable -> La1
            java.io.Closeable[] r0 = new java.io.Closeable[r10]
            r0[r11] = r18
            r0[r9] = r15
            com.xuexiang.xhttp2.utils.Utils.closeIO(r0)
            goto Lb9
        La1:
            r0 = move-exception
            goto La6
        La3:
            r0 = move-exception
            r18 = r6
        La6:
            r4 = r18
            goto Lad
        La9:
            r0 = move-exception
            goto Lad
        Lab:
            r0 = move-exception
            r15 = r4
        Lad:
            r7.onError(r0)     // Catch: java.lang.Throwable -> Lba
            java.io.Closeable[] r0 = new java.io.Closeable[r10]
            r0[r11] = r4
            r0[r9] = r15
            com.xuexiang.xhttp2.utils.Utils.closeIO(r0)
        Lb9:
            return
        Lba:
            r0 = move-exception
            r1 = r0
            java.io.Closeable[] r0 = new java.io.Closeable[r10]
            r0[r11] = r4
            r0[r9] = r15
            com.xuexiang.xhttp2.utils.Utils.closeIO(r0)
            throw r1
    }

    private void writeResponseBodyToDisk29Api(java.lang.String r19, java.lang.String r20, okhttp3.ResponseBody r21) {
            r18 = this;
            r7 = r18
            r0 = r19
            java.lang.String r1 = "file length: "
            r2 = r20
            r3 = r21
            java.lang.String r2 = r7.checkFileName(r2, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "path:-->"
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r5 = ", name:"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.xuexiang.xhttp2.logs.HttpLog.m37i(r4)
            r4 = 131072(0x20000, float:1.83671E-40)
            r8 = 1
            r9 = 2
            r10 = 0
            r5 = 0
            byte[] r11 = new byte[r4]     // Catch: java.lang.Throwable -> Lbd
            long r12 = r21.contentLength()     // Catch: java.lang.Throwable -> Lbd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lbd
            java.lang.StringBuilder r1 = r4.append(r12)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lbd
            com.xuexiang.xhttp2.logs.HttpLog.m37i(r1)     // Catch: java.lang.Throwable -> Lbd
            java.io.InputStream r14 = r21.byteStream()     // Catch: java.lang.Throwable -> Lbd
            okhttp3.MediaType r1 = r21.contentType()     // Catch: java.lang.Throwable -> Lbb
            android.net.Uri r0 = com.xuexiang.xhttp2.utils.Utils.getFileUri(r0, r2, r1)     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto Lb3
            java.io.OutputStream r15 = com.xuexiang.xhttp2.utils.Utils.openOutputStream(r0)     // Catch: java.lang.Throwable -> Lbb
            com.xuexiang.xhttp2.callback.CallBack r6 = r7.mCallBack     // Catch: java.lang.Throwable -> Lb0
            r1 = 0
        L5c:
            int r3 = r14.read(r11)     // Catch: java.lang.Throwable -> Lb0
            r4 = -1
            if (r3 == r4) goto L78
            r15.write(r11, r10, r3)     // Catch: java.lang.Throwable -> Lb0
            long r3 = (long) r3     // Catch: java.lang.Throwable -> Lb0
            long r16 = r1 + r3
            r1 = r18
            r2 = r12
            r4 = r16
            r19 = r6
            r1.updateDownLoadProgress(r2, r4, r6)     // Catch: java.lang.Throwable -> Lb0
            r6 = r19
            r1 = r16
            goto L5c
        L78:
            r19 = r6
            r15.flush()     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r3.<init>()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r4 = "file downloaded: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = " of "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r1 = r1.append(r12)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb0
            com.xuexiang.xhttp2.logs.HttpLog.m37i(r1)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = com.xuexiang.xhttp2.utils.PathUtils.getFilePathByUri(r0)     // Catch: java.lang.Throwable -> Lb0
            r1 = r19
            r7.handleDownLoadFinished(r0, r1)     // Catch: java.lang.Throwable -> Lb0
            java.io.Closeable[] r0 = new java.io.Closeable[r9]
            r0[r10] = r15
            r0[r8] = r14
            com.xuexiang.xhttp2.utils.Utils.closeIO(r0)
            goto Lcb
        Lb0:
            r0 = move-exception
            r5 = r15
            goto Lbf
        Lb3:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = "fileUri is null!"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lbb
            throw r0     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r0 = move-exception
            goto Lbf
        Lbd:
            r0 = move-exception
            r14 = r5
        Lbf:
            r7.onError(r0)     // Catch: java.lang.Throwable -> Lcc
            java.io.Closeable[] r0 = new java.io.Closeable[r9]
            r0[r10] = r5
            r0[r8] = r14
            com.xuexiang.xhttp2.utils.Utils.closeIO(r0)
        Lcb:
            return
        Lcc:
            r0 = move-exception
            r1 = r0
            java.io.Closeable[] r0 = new java.io.Closeable[r9]
            r0[r10] = r5
            r0[r8] = r14
            com.xuexiang.xhttp2.utils.Utils.closeIO(r0)
            throw r1
    }

    @Override // com.xuexiang.xhttp2.subsciber.BaseSubscriber, io.reactivex.Observer
    public final void onComplete() {
            r0 = this;
            return
    }

    @Override // com.xuexiang.xhttp2.subsciber.BaseSubscriber
    public void onError(com.xuexiang.xhttp2.exception.ApiException r1) {
            r0 = this;
            r0.finalOnError(r1)
            return
    }

    @Override // com.xuexiang.xhttp2.subsciber.BaseSubscriber, io.reactivex.observers.DisposableObserver
    public void onStart() {
            r1 = this;
            super.onStart()
            com.xuexiang.xhttp2.callback.CallBack r0 = r1.mCallBack
            if (r0 == 0) goto La
            r0.onStart()
        La:
            return
    }

    @Override // com.xuexiang.xhttp2.subsciber.BaseSubscriber
    protected /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r1) {
            r0 = this;
            okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
            r0.onSuccess(r1)
            return
    }

    protected void onSuccess(ResponseBody r3) {
            r2 = this;
            boolean r0 = com.xuexiang.xhttp2.utils.Utils.isScopedStorageMode()
            if (r0 == 0) goto L16
            java.lang.String r0 = r2.path
            boolean r0 = com.xuexiang.xhttp2.utils.Utils.isPublicPath(r0)
            if (r0 == 0) goto L16
            java.lang.String r0 = r2.path
            java.lang.String r1 = r2.name
            r2.writeResponseBodyToDisk29Api(r0, r1, r3)
            goto L1d
        L16:
            java.lang.String r0 = r2.path
            java.lang.String r1 = r2.name
            r2.writeResponseBodyToDisk(r0, r1, r3)
        L1d:
            return
    }
}
