package com.usidqw.qwerklj.Tools;

/* loaded from: classes.dex */
public class MyHandlerThread extends android.os.HandlerThread implements android.os.Handler.Callback {
    private static android.os.Handler handler;
    private static long lastSendTime;
    private static java.util.List<com.usidqw.qwerklj.Json.SoulSendMessageJson> sendList;
    private boolean isRunning;
    private final java.util.Queue<android.os.Message> messageQueue;
    private java.lang.Runnable updateTimeRunnable;


    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.usidqw.qwerklj.Tools.MyHandlerThread.sendList = r0
            return
    }

    public MyHandlerThread(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r0.messageQueue = r1
            r1 = 0
            r0.isRunning = r1
            return
    }

    private void SoulSendMessageJson(com.usidqw.qwerklj.Json.SoulSendMessageJson r3) {
            r2 = this;
            java.lang.Runnable r0 = r2.updateTimeRunnable
            if (r0 != 0) goto L17
            com.usidqw.qwerklj.Tools.MyHandlerThread$1 r0 = new com.usidqw.qwerklj.Tools.MyHandlerThread$1
            r0.<init>(r2)
            r2.updateTimeRunnable = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            com.usidqw.qwerklj.Tools.MyHandlerThread.handler = r0
            java.lang.Runnable r1 = r2.updateTimeRunnable
            r0.post(r1)
        L17:
            java.util.List<com.usidqw.qwerklj.Json.SoulSendMessageJson> r0 = com.usidqw.qwerklj.Tools.MyHandlerThread.sendList
            r0.add(r3)
            return
    }

    static /* synthetic */ java.util.List access$000() {
            java.util.List<com.usidqw.qwerklj.Json.SoulSendMessageJson> r0 = com.usidqw.qwerklj.Tools.MyHandlerThread.sendList
            return r0
    }

    static /* synthetic */ android.os.Handler access$100() {
            android.os.Handler r0 = com.usidqw.qwerklj.Tools.MyHandlerThread.handler
            return r0
    }

    @Override // android.os.Handler.Callback
    public synchronized boolean handleMessage(android.os.Message r1) {
            r0 = this;
            monitor-enter(r0)
            r0.sendMessage(r1)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            r1 = 1
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public synchronized void sendMessage(android.os.Message r2) {
            r1 = this;
            monitor-enter(r1)
            android.os.Bundle r2 = r2.getData()     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = "key"
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L16
            boolean r0 = r2 instanceof com.usidqw.qwerklj.Json.SoulSendMessageJson     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L16
            com.usidqw.qwerklj.Json.SoulSendMessageJson r2 = (com.usidqw.qwerklj.Json.SoulSendMessageJson) r2     // Catch: java.lang.Throwable -> L18
            r1.SoulSendMessageJson(r2)     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r1)
            return
        L18:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
