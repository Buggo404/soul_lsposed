package com.squareup.picasso;

/* loaded from: classes.dex */
class Dispatcher {
    static final int AIRPLANE_MODE_CHANGE = 10;
    private static final int AIRPLANE_MODE_OFF = 0;
    private static final int AIRPLANE_MODE_ON = 1;
    private static final int BATCH_DELAY = 200;
    private static final java.lang.String DISPATCHER_THREAD_NAME = "Dispatcher";
    static final int HUNTER_BATCH_COMPLETE = 8;
    static final int HUNTER_COMPLETE = 4;
    static final int HUNTER_DECODE_FAILED = 6;
    static final int HUNTER_DELAY_NEXT_BATCH = 7;
    static final int HUNTER_RETRY = 5;
    static final int NETWORK_STATE_CHANGE = 9;
    static final int REQUEST_BATCH_RESUME = 13;
    static final int REQUEST_CANCEL = 2;
    static final int REQUEST_GCED = 3;
    static final int REQUEST_SUBMIT = 1;
    private static final int RETRY_DELAY = 500;
    static final int TAG_PAUSE = 11;
    static final int TAG_RESUME = 12;
    boolean airplaneMode;
    final java.util.List<com.squareup.picasso.BitmapHunter> batch;
    final com.squareup.picasso.Cache cache;
    final android.content.Context context;
    final com.squareup.picasso.Dispatcher.DispatcherThread dispatcherThread;
    final com.squareup.picasso.Downloader downloader;
    final java.util.Map<java.lang.Object, com.squareup.picasso.Action> failedActions;
    final android.os.Handler handler;
    final java.util.Map<java.lang.String, com.squareup.picasso.BitmapHunter> hunterMap;
    final android.os.Handler mainThreadHandler;
    final java.util.Map<java.lang.Object, com.squareup.picasso.Action> pausedActions;
    final java.util.Set<java.lang.Object> pausedTags;
    final com.squareup.picasso.Dispatcher.NetworkBroadcastReceiver receiver;
    final boolean scansNetworkChanges;
    final java.util.concurrent.ExecutorService service;
    final com.squareup.picasso.Stats stats;


    private static class DispatcherHandler extends android.os.Handler {
        private final com.squareup.picasso.Dispatcher dispatcher;


        public DispatcherHandler(android.os.Looper r1, com.squareup.picasso.Dispatcher r2) {
                r0 = this;
                r0.<init>(r1)
                r0.dispatcher = r2
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                r1 = 0
                switch(r0) {
                    case 1: goto L65;
                    case 2: goto L5b;
                    case 3: goto L6;
                    case 4: goto L51;
                    case 5: goto L47;
                    case 6: goto L3d;
                    case 7: goto L37;
                    case 8: goto L6;
                    case 9: goto L2d;
                    case 10: goto L21;
                    case 11: goto L19;
                    case 12: goto L11;
                    default: goto L6;
                }
            L6:
                android.os.Handler r0 = com.squareup.picasso.Picasso.HANDLER
                com.squareup.picasso.Dispatcher$DispatcherHandler$1 r1 = new com.squareup.picasso.Dispatcher$DispatcherHandler$1
                r1.<init>(r3, r4)
                r0.post(r1)
                goto L6e
            L11:
                java.lang.Object r4 = r4.obj
                com.squareup.picasso.Dispatcher r0 = r3.dispatcher
                r0.performResumeTag(r4)
                goto L6e
            L19:
                java.lang.Object r4 = r4.obj
                com.squareup.picasso.Dispatcher r0 = r3.dispatcher
                r0.performPauseTag(r4)
                goto L6e
            L21:
                com.squareup.picasso.Dispatcher r0 = r3.dispatcher
                int r4 = r4.arg1
                r2 = 1
                if (r4 != r2) goto L29
                r1 = r2
            L29:
                r0.performAirplaneModeChange(r1)
                goto L6e
            L2d:
                java.lang.Object r4 = r4.obj
                android.net.NetworkInfo r4 = (android.net.NetworkInfo) r4
                com.squareup.picasso.Dispatcher r0 = r3.dispatcher
                r0.performNetworkStateChange(r4)
                goto L6e
            L37:
                com.squareup.picasso.Dispatcher r4 = r3.dispatcher
                r4.performBatchComplete()
                goto L6e
            L3d:
                java.lang.Object r4 = r4.obj
                com.squareup.picasso.BitmapHunter r4 = (com.squareup.picasso.BitmapHunter) r4
                com.squareup.picasso.Dispatcher r0 = r3.dispatcher
                r0.performError(r4, r1)
                goto L6e
            L47:
                java.lang.Object r4 = r4.obj
                com.squareup.picasso.BitmapHunter r4 = (com.squareup.picasso.BitmapHunter) r4
                com.squareup.picasso.Dispatcher r0 = r3.dispatcher
                r0.performRetry(r4)
                goto L6e
            L51:
                java.lang.Object r4 = r4.obj
                com.squareup.picasso.BitmapHunter r4 = (com.squareup.picasso.BitmapHunter) r4
                com.squareup.picasso.Dispatcher r0 = r3.dispatcher
                r0.performComplete(r4)
                goto L6e
            L5b:
                java.lang.Object r4 = r4.obj
                com.squareup.picasso.Action r4 = (com.squareup.picasso.Action) r4
                com.squareup.picasso.Dispatcher r0 = r3.dispatcher
                r0.performCancel(r4)
                goto L6e
            L65:
                java.lang.Object r4 = r4.obj
                com.squareup.picasso.Action r4 = (com.squareup.picasso.Action) r4
                com.squareup.picasso.Dispatcher r0 = r3.dispatcher
                r0.performSubmit(r4)
            L6e:
                return
        }
    }

    static class DispatcherThread extends android.os.HandlerThread {
        DispatcherThread() {
                r2 = this;
                java.lang.String r0 = "Picasso-Dispatcher"
                r1 = 10
                r2.<init>(r0, r1)
                return
        }
    }

    static class NetworkBroadcastReceiver extends android.content.BroadcastReceiver {
        static final java.lang.String EXTRA_AIRPLANE_STATE = "state";
        private final com.squareup.picasso.Dispatcher dispatcher;

        NetworkBroadcastReceiver(com.squareup.picasso.Dispatcher r1) {
                r0 = this;
                r0.<init>()
                r0.dispatcher = r1
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r3, android.content.Intent r4) {
                r2 = this;
                if (r4 != 0) goto L3
                return
            L3:
                java.lang.String r0 = r4.getAction()
                java.lang.String r1 = "android.intent.action.AIRPLANE_MODE"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L23
                java.lang.String r3 = "state"
                boolean r0 = r4.hasExtra(r3)
                if (r0 != 0) goto L18
                return
            L18:
                com.squareup.picasso.Dispatcher r0 = r2.dispatcher
                r1 = 0
                boolean r3 = r4.getBooleanExtra(r3, r1)
                r0.dispatchAirplaneModeChange(r3)
                goto L3c
            L23:
                java.lang.String r4 = "android.net.conn.CONNECTIVITY_CHANGE"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L3c
                java.lang.String r4 = "connectivity"
                java.lang.Object r3 = com.squareup.picasso.Utils.getService(r3, r4)
                android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
                com.squareup.picasso.Dispatcher r4 = r2.dispatcher
                android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()
                r4.dispatchNetworkStateChange(r3)
            L3c:
                return
        }

        void register() {
                r2 = this;
                android.content.IntentFilter r0 = new android.content.IntentFilter
                r0.<init>()
                java.lang.String r1 = "android.intent.action.AIRPLANE_MODE"
                r0.addAction(r1)
                com.squareup.picasso.Dispatcher r1 = r2.dispatcher
                boolean r1 = r1.scansNetworkChanges
                if (r1 == 0) goto L15
                java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
                r0.addAction(r1)
            L15:
                com.squareup.picasso.Dispatcher r1 = r2.dispatcher
                android.content.Context r1 = r1.context
                r1.registerReceiver(r2, r0)
                return
        }

        void unregister() {
                r1 = this;
                com.squareup.picasso.Dispatcher r0 = r1.dispatcher
                android.content.Context r0 = r0.context
                r0.unregisterReceiver(r1)
                return
        }
    }

    Dispatcher(android.content.Context r3, java.util.concurrent.ExecutorService r4, android.os.Handler r5, com.squareup.picasso.Downloader r6, com.squareup.picasso.Cache r7, com.squareup.picasso.Stats r8) {
            r2 = this;
            r2.<init>()
            com.squareup.picasso.Dispatcher$DispatcherThread r0 = new com.squareup.picasso.Dispatcher$DispatcherThread
            r0.<init>()
            r2.dispatcherThread = r0
            r0.start()
            android.os.Looper r1 = r0.getLooper()
            com.squareup.picasso.Utils.flushStackLocalLeaks(r1)
            r2.context = r3
            r2.service = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r2.hunterMap = r4
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            r2.failedActions = r4
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            r2.pausedActions = r4
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r2.pausedTags = r4
            com.squareup.picasso.Dispatcher$DispatcherHandler r4 = new com.squareup.picasso.Dispatcher$DispatcherHandler
            android.os.Looper r0 = r0.getLooper()
            r4.<init>(r0, r2)
            r2.handler = r4
            r2.downloader = r6
            r2.mainThreadHandler = r5
            r2.cache = r7
            r2.stats = r8
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 4
            r4.<init>(r5)
            r2.batch = r4
            boolean r4 = com.squareup.picasso.Utils.isAirplaneModeOn(r3)
            r2.airplaneMode = r4
            java.lang.String r4 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r3 = com.squareup.picasso.Utils.hasPermission(r3, r4)
            r2.scansNetworkChanges = r3
            com.squareup.picasso.Dispatcher$NetworkBroadcastReceiver r3 = new com.squareup.picasso.Dispatcher$NetworkBroadcastReceiver
            r3.<init>(r2)
            r2.receiver = r3
            r3.register()
            return
    }

    private void batch(com.squareup.picasso.BitmapHunter r4) {
            r3 = this;
            boolean r0 = r4.isCancelled()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.List<com.squareup.picasso.BitmapHunter> r0 = r3.batch
            r0.add(r4)
            android.os.Handler r4 = r3.handler
            r0 = 7
            boolean r4 = r4.hasMessages(r0)
            if (r4 != 0) goto L1c
            android.os.Handler r4 = r3.handler
            r1 = 200(0xc8, double:9.9E-322)
            r4.sendEmptyMessageDelayed(r0, r1)
        L1c:
            return
    }

    private void flushFailedActions() {
            r5 = this;
            java.util.Map<java.lang.Object, com.squareup.picasso.Action> r0 = r5.failedActions
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3d
            java.util.Map<java.lang.Object, com.squareup.picasso.Action> r0 = r5.failedActions
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            com.squareup.picasso.Action r1 = (com.squareup.picasso.Action) r1
            r0.remove()
            com.squareup.picasso.Picasso r2 = r1.getPicasso()
            boolean r2 = r2.loggingEnabled
            if (r2 == 0) goto L38
            com.squareup.picasso.Request r2 = r1.getRequest()
            java.lang.String r2 = r2.logId()
            java.lang.String r3 = "Dispatcher"
            java.lang.String r4 = "replaying"
            com.squareup.picasso.Utils.log(r3, r4, r2)
        L38:
            r2 = 0
            r5.performSubmit(r1, r2)
            goto L12
        L3d:
            return
    }

    private void logBatch(java.util.List<com.squareup.picasso.BitmapHunter> r4) {
            r3 = this;
            if (r4 == 0) goto L4b
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L4b
        L9:
            r0 = 0
            java.lang.Object r0 = r4.get(r0)
            com.squareup.picasso.BitmapHunter r0 = (com.squareup.picasso.BitmapHunter) r0
            com.squareup.picasso.Picasso r0 = r0.getPicasso()
            boolean r0 = r0.loggingEnabled
            if (r0 == 0) goto L4b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L21:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r4.next()
            com.squareup.picasso.BitmapHunter r1 = (com.squareup.picasso.BitmapHunter) r1
            int r2 = r0.length()
            if (r2 <= 0) goto L38
            java.lang.String r2 = ", "
            r0.append(r2)
        L38:
            java.lang.String r1 = com.squareup.picasso.Utils.getLogIdsForHunter(r1)
            r0.append(r1)
            goto L21
        L40:
            java.lang.String r4 = "delivered"
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Dispatcher"
            com.squareup.picasso.Utils.log(r1, r4, r0)
        L4b:
            return
    }

    private void markForReplay(com.squareup.picasso.Action r3) {
            r2 = this;
            java.lang.Object r0 = r3.getTarget()
            if (r0 == 0) goto Le
            r1 = 1
            r3.willReplay = r1
            java.util.Map<java.lang.Object, com.squareup.picasso.Action> r1 = r2.failedActions
            r1.put(r0, r3)
        Le:
            return
    }

    private void markForReplay(com.squareup.picasso.BitmapHunter r4) {
            r3 = this;
            com.squareup.picasso.Action r0 = r4.getAction()
            if (r0 == 0) goto L9
            r3.markForReplay(r0)
        L9:
            java.util.List r4 = r4.getActions()
            if (r4 == 0) goto L22
            int r0 = r4.size()
            r1 = 0
        L14:
            if (r1 >= r0) goto L22
            java.lang.Object r2 = r4.get(r1)
            com.squareup.picasso.Action r2 = (com.squareup.picasso.Action) r2
            r3.markForReplay(r2)
            int r1 = r1 + 1
            goto L14
        L22:
            return
    }

    void dispatchAirplaneModeChange(boolean r4) {
            r3 = this;
            android.os.Handler r0 = r3.handler
            r1 = 0
            r2 = 10
            android.os.Message r4 = r0.obtainMessage(r2, r4, r1)
            r0.sendMessage(r4)
            return
    }

    void dispatchCancel(com.squareup.picasso.Action r3) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            r1 = 2
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
            return
    }

    void dispatchComplete(com.squareup.picasso.BitmapHunter r3) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            r1 = 4
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
            return
    }

    void dispatchFailed(com.squareup.picasso.BitmapHunter r3) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            r1 = 6
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
            return
    }

    void dispatchNetworkStateChange(android.net.NetworkInfo r3) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            r1 = 9
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
            return
    }

    void dispatchPauseTag(java.lang.Object r3) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            r1 = 11
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
            return
    }

    void dispatchResumeTag(java.lang.Object r3) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            r1 = 12
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
            return
    }

    void dispatchRetry(com.squareup.picasso.BitmapHunter r4) {
            r3 = this;
            android.os.Handler r0 = r3.handler
            r1 = 5
            android.os.Message r4 = r0.obtainMessage(r1, r4)
            r1 = 500(0x1f4, double:2.47E-321)
            r0.sendMessageDelayed(r4, r1)
            return
    }

    void dispatchSubmit(com.squareup.picasso.Action r3) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            r1 = 1
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
            return
    }

    void performAirplaneModeChange(boolean r1) {
            r0 = this;
            r0.airplaneMode = r1
            return
    }

    void performBatchComplete() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.squareup.picasso.BitmapHunter> r1 = r3.batch
            r0.<init>(r1)
            java.util.List<com.squareup.picasso.BitmapHunter> r1 = r3.batch
            r1.clear()
            android.os.Handler r1 = r3.mainThreadHandler
            r2 = 8
            android.os.Message r2 = r1.obtainMessage(r2, r0)
            r1.sendMessage(r2)
            r3.logBatch(r0)
            return
    }

    void performCancel(com.squareup.picasso.Action r5) {
            r4 = this;
            java.lang.String r0 = r5.getKey()
            java.util.Map<java.lang.String, com.squareup.picasso.BitmapHunter> r1 = r4.hunterMap
            java.lang.Object r1 = r1.get(r0)
            com.squareup.picasso.BitmapHunter r1 = (com.squareup.picasso.BitmapHunter) r1
            java.lang.String r2 = "canceled"
            java.lang.String r3 = "Dispatcher"
            if (r1 == 0) goto L33
            r1.detach(r5)
            boolean r1 = r1.cancel()
            if (r1 == 0) goto L33
            java.util.Map<java.lang.String, com.squareup.picasso.BitmapHunter> r1 = r4.hunterMap
            r1.remove(r0)
            com.squareup.picasso.Picasso r0 = r5.getPicasso()
            boolean r0 = r0.loggingEnabled
            if (r0 == 0) goto L33
            com.squareup.picasso.Request r0 = r5.getRequest()
            java.lang.String r0 = r0.logId()
            com.squareup.picasso.Utils.log(r3, r2, r0)
        L33:
            java.util.Set<java.lang.Object> r0 = r4.pausedTags
            java.lang.Object r1 = r5.getTag()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5d
            java.util.Map<java.lang.Object, com.squareup.picasso.Action> r0 = r4.pausedActions
            java.lang.Object r1 = r5.getTarget()
            r0.remove(r1)
            com.squareup.picasso.Picasso r0 = r5.getPicasso()
            boolean r0 = r0.loggingEnabled
            if (r0 == 0) goto L5d
            com.squareup.picasso.Request r0 = r5.getRequest()
            java.lang.String r0 = r0.logId()
            java.lang.String r1 = "because paused request got canceled"
            com.squareup.picasso.Utils.log(r3, r2, r0, r1)
        L5d:
            java.util.Map<java.lang.Object, com.squareup.picasso.Action> r0 = r4.failedActions
            java.lang.Object r5 = r5.getTarget()
            java.lang.Object r5 = r0.remove(r5)
            com.squareup.picasso.Action r5 = (com.squareup.picasso.Action) r5
            if (r5 == 0) goto L80
            com.squareup.picasso.Picasso r0 = r5.getPicasso()
            boolean r0 = r0.loggingEnabled
            if (r0 == 0) goto L80
            com.squareup.picasso.Request r5 = r5.getRequest()
            java.lang.String r5 = r5.logId()
            java.lang.String r0 = "from replaying"
            com.squareup.picasso.Utils.log(r3, r2, r5, r0)
        L80:
            return
    }

    void performComplete(com.squareup.picasso.BitmapHunter r4) {
            r3 = this;
            int r0 = r4.getMemoryPolicy()
            boolean r0 = com.squareup.picasso.MemoryPolicy.shouldWriteToMemoryCache(r0)
            if (r0 == 0) goto L17
            com.squareup.picasso.Cache r0 = r3.cache
            java.lang.String r1 = r4.getKey()
            android.graphics.Bitmap r2 = r4.getResult()
            r0.set(r1, r2)
        L17:
            java.util.Map<java.lang.String, com.squareup.picasso.BitmapHunter> r0 = r3.hunterMap
            java.lang.String r1 = r4.getKey()
            r0.remove(r1)
            r3.batch(r4)
            com.squareup.picasso.Picasso r0 = r4.getPicasso()
            boolean r0 = r0.loggingEnabled
            if (r0 == 0) goto L38
            java.lang.String r4 = com.squareup.picasso.Utils.getLogIdsForHunter(r4)
            java.lang.String r0 = "for completion"
            java.lang.String r1 = "Dispatcher"
            java.lang.String r2 = "batched"
            com.squareup.picasso.Utils.log(r1, r2, r4, r0)
        L38:
            return
    }

    void performError(com.squareup.picasso.BitmapHunter r4, boolean r5) {
            r3 = this;
            com.squareup.picasso.Picasso r0 = r4.getPicasso()
            boolean r0 = r0.loggingEnabled
            if (r0 == 0) goto L20
            java.lang.String r0 = com.squareup.picasso.Utils.getLogIdsForHunter(r4)
            if (r5 == 0) goto L11
            java.lang.String r5 = " (will replay)"
            goto L13
        L11:
            java.lang.String r5 = ""
        L13:
            java.lang.String r1 = "for error"
            java.lang.String r5 = r1.concat(r5)
            java.lang.String r1 = "Dispatcher"
            java.lang.String r2 = "batched"
            com.squareup.picasso.Utils.log(r1, r2, r0, r5)
        L20:
            java.util.Map<java.lang.String, com.squareup.picasso.BitmapHunter> r5 = r3.hunterMap
            java.lang.String r0 = r4.getKey()
            r5.remove(r0)
            r3.batch(r4)
            return
    }

    void performNetworkStateChange(android.net.NetworkInfo r3) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = r2.service
            boolean r1 = r0 instanceof com.squareup.picasso.PicassoExecutorService
            if (r1 == 0) goto Lb
            com.squareup.picasso.PicassoExecutorService r0 = (com.squareup.picasso.PicassoExecutorService) r0
            r0.adjustThreadCount(r3)
        Lb:
            if (r3 == 0) goto L16
            boolean r3 = r3.isConnected()
            if (r3 == 0) goto L16
            r2.flushFailedActions()
        L16:
            return
    }

    void performPauseTag(java.lang.Object r14) {
            r13 = this;
            java.util.Set<java.lang.Object> r0 = r13.pausedTags
            boolean r0 = r0.add(r14)
            if (r0 != 0) goto L9
            return
        L9:
            java.util.Map<java.lang.String, com.squareup.picasso.BitmapHunter> r0 = r13.hunterMap
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld7
            java.lang.Object r1 = r0.next()
            com.squareup.picasso.BitmapHunter r1 = (com.squareup.picasso.BitmapHunter) r1
            com.squareup.picasso.Picasso r2 = r1.getPicasso()
            boolean r2 = r2.loggingEnabled
            com.squareup.picasso.Action r3 = r1.getAction()
            java.util.List r4 = r1.getActions()
            r5 = 1
            if (r4 == 0) goto L38
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L38
            r6 = r5
            goto L39
        L38:
            r6 = 0
        L39:
            if (r3 != 0) goto L3e
            if (r6 != 0) goto L3e
            goto L13
        L3e:
            java.lang.String r7 = "' was paused"
            java.lang.String r8 = "because tag '"
            java.lang.String r9 = "paused"
            java.lang.String r10 = "Dispatcher"
            if (r3 == 0) goto L7a
            java.lang.Object r11 = r3.getTag()
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L7a
            r1.detach(r3)
            java.util.Map<java.lang.Object, com.squareup.picasso.Action> r11 = r13.pausedActions
            java.lang.Object r12 = r3.getTarget()
            r11.put(r12, r3)
            if (r2 == 0) goto L7a
            com.squareup.picasso.Request r3 = r3.request
            java.lang.String r3 = r3.logId()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r8)
            java.lang.StringBuilder r11 = r11.append(r14)
            java.lang.StringBuilder r11 = r11.append(r7)
            java.lang.String r11 = r11.toString()
            com.squareup.picasso.Utils.log(r10, r9, r3, r11)
        L7a:
            if (r6 == 0) goto Lbf
            int r3 = r4.size()
            int r3 = r3 - r5
        L81:
            if (r3 < 0) goto Lbf
            java.lang.Object r5 = r4.get(r3)
            com.squareup.picasso.Action r5 = (com.squareup.picasso.Action) r5
            java.lang.Object r6 = r5.getTag()
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L94
            goto Lbc
        L94:
            r1.detach(r5)
            java.util.Map<java.lang.Object, com.squareup.picasso.Action> r6 = r13.pausedActions
            java.lang.Object r11 = r5.getTarget()
            r6.put(r11, r5)
            if (r2 == 0) goto Lbc
            com.squareup.picasso.Request r5 = r5.request
            java.lang.String r5 = r5.logId()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            java.lang.StringBuilder r6 = r6.append(r14)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.squareup.picasso.Utils.log(r10, r9, r5, r6)
        Lbc:
            int r3 = r3 + (-1)
            goto L81
        Lbf:
            boolean r3 = r1.cancel()
            if (r3 == 0) goto L13
            r0.remove()
            if (r2 == 0) goto L13
            java.lang.String r1 = com.squareup.picasso.Utils.getLogIdsForHunter(r1)
            java.lang.String r2 = "all actions paused"
            java.lang.String r3 = "canceled"
            com.squareup.picasso.Utils.log(r10, r3, r1, r2)
            goto L13
        Ld7:
            return
    }

    void performResumeTag(java.lang.Object r5) {
            r4 = this;
            java.util.Set<java.lang.Object> r0 = r4.pausedTags
            boolean r0 = r0.remove(r5)
            if (r0 != 0) goto L9
            return
        L9:
            java.util.Map<java.lang.Object, com.squareup.picasso.Action> r0 = r4.pausedActions
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L14:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            com.squareup.picasso.Action r2 = (com.squareup.picasso.Action) r2
            java.lang.Object r3 = r2.getTag()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L14
            if (r1 != 0) goto L31
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L31:
            r1.add(r2)
            r0.remove()
            goto L14
        L38:
            if (r1 == 0) goto L45
            android.os.Handler r5 = r4.mainThreadHandler
            r0 = 13
            android.os.Message r0 = r5.obtainMessage(r0, r1)
            r5.sendMessage(r0)
        L45:
            return
    }

    void performRetry(com.squareup.picasso.BitmapHunter r6) {
            r5 = this;
            boolean r0 = r6.isCancelled()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.ExecutorService r0 = r5.service
            boolean r0 = r0.isShutdown()
            r1 = 0
            if (r0 == 0) goto L14
            r5.performError(r6, r1)
            return
        L14:
            boolean r0 = r5.scansNetworkChanges
            if (r0 == 0) goto L27
            android.content.Context r0 = r5.context
            java.lang.String r2 = "connectivity"
            java.lang.Object r0 = com.squareup.picasso.Utils.getService(r0, r2)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            goto L28
        L27:
            r0 = 0
        L28:
            r2 = 1
            if (r0 == 0) goto L33
            boolean r3 = r0.isConnected()
            if (r3 == 0) goto L33
            r3 = r2
            goto L34
        L33:
            r3 = r1
        L34:
            boolean r4 = r5.airplaneMode
            boolean r0 = r6.shouldRetry(r4, r0)
            boolean r4 = r6.supportsReplay()
            if (r0 != 0) goto L50
            boolean r0 = r5.scansNetworkChanges
            if (r0 == 0) goto L47
            if (r4 == 0) goto L47
            r1 = r2
        L47:
            r5.performError(r6, r1)
            if (r1 == 0) goto L4f
            r5.markForReplay(r6)
        L4f:
            return
        L50:
            boolean r0 = r5.scansNetworkChanges
            if (r0 == 0) goto L60
            if (r3 == 0) goto L57
            goto L60
        L57:
            r5.performError(r6, r4)
            if (r4 == 0) goto L5f
            r5.markForReplay(r6)
        L5f:
            return
        L60:
            com.squareup.picasso.Picasso r0 = r6.getPicasso()
            boolean r0 = r0.loggingEnabled
            if (r0 == 0) goto L73
            java.lang.String r0 = "retrying"
            java.lang.String r1 = com.squareup.picasso.Utils.getLogIdsForHunter(r6)
            java.lang.String r2 = "Dispatcher"
            com.squareup.picasso.Utils.log(r2, r0, r1)
        L73:
            java.lang.Exception r0 = r6.getException()
            boolean r0 = r0 instanceof com.squareup.picasso.NetworkRequestHandler.ContentLengthException
            if (r0 == 0) goto L84
            int r0 = r6.networkPolicy
            com.squareup.picasso.NetworkPolicy r1 = com.squareup.picasso.NetworkPolicy.NO_CACHE
            int r1 = r1.index
            r0 = r0 | r1
            r6.networkPolicy = r0
        L84:
            java.util.concurrent.ExecutorService r0 = r5.service
            java.util.concurrent.Future r0 = r0.submit(r6)
            r6.future = r0
            return
    }

    void performSubmit(com.squareup.picasso.Action r2) {
            r1 = this;
            r0 = 1
            r1.performSubmit(r2, r0)
            return
    }

    void performSubmit(com.squareup.picasso.Action r5, boolean r6) {
            r4 = this;
            java.util.Set<java.lang.Object> r0 = r4.pausedTags
            java.lang.Object r1 = r5.getTag()
            boolean r0 = r0.contains(r1)
            java.lang.String r1 = "Dispatcher"
            if (r0 == 0) goto L44
            java.util.Map<java.lang.Object, com.squareup.picasso.Action> r6 = r4.pausedActions
            java.lang.Object r0 = r5.getTarget()
            r6.put(r0, r5)
            com.squareup.picasso.Picasso r6 = r5.getPicasso()
            boolean r6 = r6.loggingEnabled
            if (r6 == 0) goto L43
            com.squareup.picasso.Request r6 = r5.request
            java.lang.String r6 = r6.logId()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "because tag '"
            r0.<init>(r2)
            java.lang.Object r5 = r5.getTag()
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = "' is paused"
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "paused"
            com.squareup.picasso.Utils.log(r1, r0, r6, r5)
        L43:
            return
        L44:
            java.util.Map<java.lang.String, com.squareup.picasso.BitmapHunter> r0 = r4.hunterMap
            java.lang.String r2 = r5.getKey()
            java.lang.Object r0 = r0.get(r2)
            com.squareup.picasso.BitmapHunter r0 = (com.squareup.picasso.BitmapHunter) r0
            if (r0 == 0) goto L56
            r0.attach(r5)
            return
        L56:
            java.util.concurrent.ExecutorService r0 = r4.service
            boolean r0 = r0.isShutdown()
            if (r0 == 0) goto L74
            com.squareup.picasso.Picasso r6 = r5.getPicasso()
            boolean r6 = r6.loggingEnabled
            if (r6 == 0) goto L73
            com.squareup.picasso.Request r5 = r5.request
            java.lang.String r5 = r5.logId()
            java.lang.String r6 = "because shut down"
            java.lang.String r0 = "ignored"
            com.squareup.picasso.Utils.log(r1, r0, r5, r6)
        L73:
            return
        L74:
            com.squareup.picasso.Picasso r0 = r5.getPicasso()
            com.squareup.picasso.Cache r2 = r4.cache
            com.squareup.picasso.Stats r3 = r4.stats
            com.squareup.picasso.BitmapHunter r0 = com.squareup.picasso.BitmapHunter.forRequest(r0, r4, r2, r3, r5)
            java.util.concurrent.ExecutorService r2 = r4.service
            java.util.concurrent.Future r2 = r2.submit(r0)
            r0.future = r2
            java.util.Map<java.lang.String, com.squareup.picasso.BitmapHunter> r2 = r4.hunterMap
            java.lang.String r3 = r5.getKey()
            r2.put(r3, r0)
            if (r6 == 0) goto L9c
            java.util.Map<java.lang.Object, com.squareup.picasso.Action> r6 = r4.failedActions
            java.lang.Object r0 = r5.getTarget()
            r6.remove(r0)
        L9c:
            com.squareup.picasso.Picasso r6 = r5.getPicasso()
            boolean r6 = r6.loggingEnabled
            if (r6 == 0) goto Laf
            com.squareup.picasso.Request r5 = r5.request
            java.lang.String r5 = r5.logId()
            java.lang.String r6 = "enqueued"
            com.squareup.picasso.Utils.log(r1, r6, r5)
        Laf:
            return
    }

    void shutdown() {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = r2.service
            boolean r1 = r0 instanceof com.squareup.picasso.PicassoExecutorService
            if (r1 == 0) goto L9
            r0.shutdown()
        L9:
            com.squareup.picasso.Downloader r0 = r2.downloader
            r0.shutdown()
            com.squareup.picasso.Dispatcher$DispatcherThread r0 = r2.dispatcherThread
            r0.quit()
            android.os.Handler r0 = com.squareup.picasso.Picasso.HANDLER
            com.squareup.picasso.Dispatcher$1 r1 = new com.squareup.picasso.Dispatcher$1
            r1.<init>(r2)
            r0.post(r1)
            return
    }
}
