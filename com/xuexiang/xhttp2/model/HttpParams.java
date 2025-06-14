package com.xuexiang.xhttp2.model;

/* loaded from: classes.dex */
public class HttpParams implements java.io.Serializable {
    public java.util.LinkedHashMap<java.lang.String, java.util.List<com.xuexiang.xhttp2.model.HttpParams.FileWrapper>> fileParamsMap;
    public java.util.LinkedHashMap<java.lang.String, java.lang.Object> urlParamsMap;

    public static class FileWrapper<T> {
        public okhttp3.MediaType contentType;
        public T file;
        public java.lang.String fileName;
        public long fileSize;
        public com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack responseCallBack;

        public FileWrapper(T r1, java.lang.String r2, okhttp3.MediaType r3, com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r4) {
                r0 = this;
                r0.<init>()
                r0.file = r1
                r0.fileName = r2
                r0.contentType = r3
                boolean r2 = r1 instanceof java.io.File
                if (r2 == 0) goto L16
                java.io.File r1 = (java.io.File) r1
                long r1 = r1.length()
                r0.fileSize = r1
                goto L22
            L16:
                boolean r2 = r1 instanceof byte[]
                if (r2 == 0) goto L22
                byte[] r1 = (byte[]) r1
                byte[] r1 = (byte[]) r1
                int r1 = r1.length
                long r1 = (long) r1
                r0.fileSize = r1
            L22:
                r0.responseCallBack = r4
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "FileWrapper{content="
                r0.<init>(r1)
                T r1 = r3.file
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", fileName='"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r3.fileName
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", contentType="
                java.lang.StringBuilder r0 = r0.append(r1)
                okhttp3.MediaType r1 = r3.contentType
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", fileSize="
                java.lang.StringBuilder r0 = r0.append(r1)
                long r1 = r3.fileSize
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public HttpParams() {
            r0 = this;
            r0.<init>()
            r0.init()
            return
    }

    public HttpParams(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.init()
            r0.put(r1, r2)
            return
    }

    public HttpParams(java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.init()
            r0.put(r1)
            return
    }

    private okhttp3.MediaType guessMimeType(java.lang.String r4) {
            r3 = this;
            java.net.FileNameMap r0 = java.net.URLConnection.getFileNameMap()
            java.lang.String r1 = "#"
            java.lang.String r2 = ""
            java.lang.String r4 = r4.replace(r1, r2)
            java.lang.String r4 = r0.getContentTypeFor(r4)
            if (r4 != 0) goto L14
            java.lang.String r4 = "application/octet-stream"
        L14:
            okhttp3.MediaType r4 = okhttp3.MediaType.parse(r4)
            return r4
    }

    private void init() {
            r1 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.urlParamsMap = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.fileParamsMap = r0
            return
    }

    private <T> void put(java.lang.String r3, T r4, java.lang.String r5, okhttp3.MediaType r6, com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r7) {
            r2 = this;
            java.util.LinkedHashMap<java.lang.String, java.util.List<com.xuexiang.xhttp2.model.HttpParams$FileWrapper>> r0 = r2.fileParamsMap
            if (r0 == 0) goto L20
            if (r3 == 0) goto L20
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L18
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.LinkedHashMap<java.lang.String, java.util.List<com.xuexiang.xhttp2.model.HttpParams$FileWrapper>> r1 = r2.fileParamsMap
            r1.put(r3, r0)
        L18:
            com.xuexiang.xhttp2.model.HttpParams$FileWrapper r3 = new com.xuexiang.xhttp2.model.HttpParams$FileWrapper
            r3.<init>(r4, r5, r6, r7)
            r0.add(r3)
        L20:
            return
    }

    public void clear() {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.urlParamsMap
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            java.util.LinkedHashMap<java.lang.String, java.util.List<com.xuexiang.xhttp2.model.HttpParams$FileWrapper>> r0 = r1.fileParamsMap
            if (r0 == 0) goto Le
            r0.clear()
        Le:
            return
    }

    public com.xuexiang.xhttp2.model.HttpParams put(com.xuexiang.xhttp2.model.HttpParams r3) {
            r2 = this;
            if (r3 == 0) goto L24
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r3.urlParamsMap
            if (r0 == 0) goto L13
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L13
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r2.urlParamsMap
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r1 = r3.urlParamsMap
            r0.putAll(r1)
        L13:
            java.util.LinkedHashMap<java.lang.String, java.util.List<com.xuexiang.xhttp2.model.HttpParams$FileWrapper>> r0 = r3.fileParamsMap
            if (r0 == 0) goto L24
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L24
            java.util.LinkedHashMap<java.lang.String, java.util.List<com.xuexiang.xhttp2.model.HttpParams$FileWrapper>> r0 = r2.fileParamsMap
            java.util.LinkedHashMap<java.lang.String, java.util.List<com.xuexiang.xhttp2.model.HttpParams$FileWrapper>> r3 = r3.fileParamsMap
            r0.putAll(r3)
        L24:
            return r2
    }

    public com.xuexiang.xhttp2.model.HttpParams put(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.urlParamsMap
            r0.put(r2, r3)
            return r1
    }

    public com.xuexiang.xhttp2.model.HttpParams put(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Ld
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.urlParamsMap
            r0.putAll(r2)
        Ld:
            return r1
    }

    public <T extends java.io.File> void put(java.lang.String r2, T r3, com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r4) {
            r1 = this;
            java.lang.String r0 = r3.getName()
            r1.put(r2, r3, r0, r4)
            return
    }

    public <T extends java.io.File> void put(java.lang.String r7, T r8, java.lang.String r9, com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r10) {
            r6 = this;
            okhttp3.MediaType r4 = r6.guessMimeType(r9)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.put(r1, r2, r3, r4, r5)
            return
    }

    public <T extends java.io.InputStream> void put(java.lang.String r7, T r8, java.lang.String r9, com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r10) {
            r6 = this;
            okhttp3.MediaType r4 = r6.guessMimeType(r9)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.put(r1, r2, r3, r4, r5)
            return
    }

    public void put(java.lang.String r7, byte[] r8, java.lang.String r9, com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r10) {
            r6 = this;
            okhttp3.MediaType r4 = r6.guessMimeType(r9)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.put(r1, r2, r3, r4, r5)
            return
    }

    public <T extends java.io.File> void putFileParams(java.lang.String r2, java.util.List<T> r3, com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r4) {
            r1 = this;
            if (r2 == 0) goto L1e
            if (r3 == 0) goto L1e
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L1e
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r3.next()
            java.io.File r0 = (java.io.File) r0
            r1.put(r2, r0, r4)
            goto Le
        L1e:
            return
    }

    public void remove(java.lang.String r1) {
            r0 = this;
            r0.removeUrl(r1)
            r0.removeFile(r1)
            return
    }

    public void removeFile(java.lang.String r2) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.util.List<com.xuexiang.xhttp2.model.HttpParams$FileWrapper>> r0 = r1.fileParamsMap
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    public void removeUrl(java.lang.String r2) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.urlParamsMap
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r1 = r6.urlParamsMap
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "&"
            java.lang.String r4 = "="
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r5 = r0.length()
            if (r5 <= 0) goto L28
            r0.append(r3)
        L28:
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.Object r2 = r2.getValue()
            r3.append(r2)
            goto Lf
        L3e:
            java.util.LinkedHashMap<java.lang.String, java.util.List<com.xuexiang.xhttp2.model.HttpParams$FileWrapper>> r1 = r6.fileParamsMap
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L48:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L73
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r5 = r0.length()
            if (r5 <= 0) goto L5d
            r0.append(r3)
        L5d:
            java.lang.Object r5 = r2.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.Object r2 = r2.getValue()
            r5.append(r2)
            goto L48
        L73:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
