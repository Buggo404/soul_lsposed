package com.xuexiang.xhttp2.callback;

/* loaded from: classes.dex */
public abstract class UIProgressResponseCallBack implements com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack {
    private static final int RESPONSE_UPDATE = 2;
    private final android.os.Handler mHandler;

    public class ProgressModel implements java.io.Serializable {
        private long contentLength;
        private long currentBytes;
        private boolean done;
        final /* synthetic */ com.xuexiang.xhttp2.callback.UIProgressResponseCallBack this$0;

        public ProgressModel(com.xuexiang.xhttp2.callback.UIProgressResponseCallBack r1, long r2, long r4, boolean r6) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.currentBytes = r2
                r0.contentLength = r4
                r0.done = r6
                return
        }

        public long getContentLength() {
                r2 = this;
                long r0 = r2.contentLength
                return r0
        }

        public long getCurrentBytes() {
                r2 = this;
                long r0 = r2.currentBytes
                return r0
        }

        public boolean isDone() {
                r1 = this;
                boolean r0 = r1.done
                return r0
        }

        public com.xuexiang.xhttp2.callback.UIProgressResponseCallBack.ProgressModel setContentLength(long r1) {
                r0 = this;
                r0.contentLength = r1
                return r0
        }

        public com.xuexiang.xhttp2.callback.UIProgressResponseCallBack.ProgressModel setCurrentBytes(long r1) {
                r0 = this;
                r0.currentBytes = r1
                return r0
        }

        public com.xuexiang.xhttp2.callback.UIProgressResponseCallBack.ProgressModel setDone(boolean r1) {
                r0 = this;
                r0.done = r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ProgressModel{currentBytes="
                r0.<init>(r1)
                long r1 = r3.currentBytes
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", contentLength="
                java.lang.StringBuilder r0 = r0.append(r1)
                long r1 = r3.contentLength
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", done="
                java.lang.StringBuilder r0 = r0.append(r1)
                boolean r1 = r3.done
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static class UIHandler extends android.os.Handler {
        private final java.lang.ref.WeakReference<com.xuexiang.xhttp2.callback.UIProgressResponseCallBack> mUIProgressResponseListenerWeakReference;

        public UIHandler(android.os.Looper r1, com.xuexiang.xhttp2.callback.UIProgressResponseCallBack r2) {
                r0 = this;
                r0.<init>(r1)
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r2)
                r0.mUIProgressResponseListenerWeakReference = r1
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r8) {
                r7 = this;
                int r0 = r8.what
                r1 = 2
                if (r0 != r1) goto L24
                java.lang.ref.WeakReference<com.xuexiang.xhttp2.callback.UIProgressResponseCallBack> r0 = r7.mUIProgressResponseListenerWeakReference
                java.lang.Object r0 = r0.get()
                r1 = r0
                com.xuexiang.xhttp2.callback.UIProgressResponseCallBack r1 = (com.xuexiang.xhttp2.callback.UIProgressResponseCallBack) r1
                if (r1 == 0) goto L27
                java.lang.Object r8 = r8.obj
                com.xuexiang.xhttp2.callback.UIProgressResponseCallBack$ProgressModel r8 = (com.xuexiang.xhttp2.callback.UIProgressResponseCallBack.ProgressModel) r8
                long r2 = r8.getCurrentBytes()
                long r4 = r8.getContentLength()
                boolean r6 = r8.isDone()
                r1.onUIResponseProgress(r2, r4, r6)
                goto L27
            L24:
                super.handleMessage(r8)
            L27:
                return
        }
    }

    public UIProgressResponseCallBack() {
            r2 = this;
            r2.<init>()
            com.xuexiang.xhttp2.callback.UIProgressResponseCallBack$UIHandler r0 = new com.xuexiang.xhttp2.callback.UIProgressResponseCallBack$UIHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1, r2)
            r2.mHandler = r0
            return
    }

    @Override // com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack
    public void onResponseProgress(long r10, long r12, boolean r14) {
            r9 = this;
            android.os.Message r0 = android.os.Message.obtain()
            com.xuexiang.xhttp2.callback.UIProgressResponseCallBack$ProgressModel r8 = new com.xuexiang.xhttp2.callback.UIProgressResponseCallBack$ProgressModel
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r7 = r14
            r1.<init>(r2, r3, r5, r7)
            r0.obj = r8
            r10 = 2
            r0.what = r10
            android.os.Handler r10 = r9.mHandler
            r10.sendMessage(r0)
            return
    }

    public abstract void onUIResponseProgress(long r1, long r3, boolean r5);
}
