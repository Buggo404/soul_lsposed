package com.squareup.picasso;

/* loaded from: classes.dex */
public class Picasso {
    static final android.os.Handler HANDLER = null;
    static final java.lang.String TAG = "Picasso";
    static volatile com.squareup.picasso.Picasso singleton;
    final com.squareup.picasso.Cache cache;
    private final com.squareup.picasso.Picasso.CleanupThread cleanupThread;
    final android.content.Context context;
    final android.graphics.Bitmap.Config defaultBitmapConfig;
    final com.squareup.picasso.Dispatcher dispatcher;
    boolean indicatorsEnabled;
    private final com.squareup.picasso.Picasso.Listener listener;
    volatile boolean loggingEnabled;
    final java.lang.ref.ReferenceQueue<java.lang.Object> referenceQueue;
    private final java.util.List<com.squareup.picasso.RequestHandler> requestHandlers;
    private final com.squareup.picasso.Picasso.RequestTransformer requestTransformer;
    boolean shutdown;
    final com.squareup.picasso.Stats stats;
    final java.util.Map<java.lang.Object, com.squareup.picasso.Action> targetToAction;
    final java.util.Map<android.widget.ImageView, com.squareup.picasso.DeferredRequestCreator> targetToDeferredRequestCreator;


    public static class Builder {
        private com.squareup.picasso.Cache cache;
        private final android.content.Context context;
        private android.graphics.Bitmap.Config defaultBitmapConfig;
        private com.squareup.picasso.Downloader downloader;
        private boolean indicatorsEnabled;
        private com.squareup.picasso.Picasso.Listener listener;
        private boolean loggingEnabled;
        private java.util.List<com.squareup.picasso.RequestHandler> requestHandlers;
        private java.util.concurrent.ExecutorService service;
        private com.squareup.picasso.Picasso.RequestTransformer transformer;

        public Builder(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto Lc
                android.content.Context r2 = r2.getApplicationContext()
                r1.context = r2
                return
            Lc:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Context must not be null."
                r2.<init>(r0)
                throw r2
        }

        public com.squareup.picasso.Picasso.Builder addRequestHandler(com.squareup.picasso.RequestHandler r2) {
                r1 = this;
                if (r2 == 0) goto L23
                java.util.List<com.squareup.picasso.RequestHandler> r0 = r1.requestHandlers
                if (r0 != 0) goto Ld
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.requestHandlers = r0
            Ld:
                java.util.List<com.squareup.picasso.RequestHandler> r0 = r1.requestHandlers
                boolean r0 = r0.contains(r2)
                if (r0 != 0) goto L1b
                java.util.List<com.squareup.picasso.RequestHandler> r0 = r1.requestHandlers
                r0.add(r2)
                return r1
            L1b:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "RequestHandler already registered."
                r2.<init>(r0)
                throw r2
            L23:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "RequestHandler must not be null."
                r2.<init>(r0)
                throw r2
        }

        public com.squareup.picasso.Picasso build() {
                r14 = this;
                android.content.Context r7 = r14.context
                com.squareup.picasso.Downloader r0 = r14.downloader
                if (r0 != 0) goto Lc
                com.squareup.picasso.Downloader r0 = com.squareup.picasso.Utils.createDefaultDownloader(r7)
                r14.downloader = r0
            Lc:
                com.squareup.picasso.Cache r0 = r14.cache
                if (r0 != 0) goto L17
                com.squareup.picasso.LruCache r0 = new com.squareup.picasso.LruCache
                r0.<init>(r7)
                r14.cache = r0
            L17:
                java.util.concurrent.ExecutorService r0 = r14.service
                if (r0 != 0) goto L22
                com.squareup.picasso.PicassoExecutorService r0 = new com.squareup.picasso.PicassoExecutorService
                r0.<init>()
                r14.service = r0
            L22:
                com.squareup.picasso.Picasso$RequestTransformer r0 = r14.transformer
                if (r0 != 0) goto L2a
                com.squareup.picasso.Picasso$RequestTransformer r0 = com.squareup.picasso.Picasso.RequestTransformer.IDENTITY
                r14.transformer = r0
            L2a:
                com.squareup.picasso.Stats r8 = new com.squareup.picasso.Stats
                com.squareup.picasso.Cache r0 = r14.cache
                r8.<init>(r0)
                com.squareup.picasso.Dispatcher r9 = new com.squareup.picasso.Dispatcher
                java.util.concurrent.ExecutorService r2 = r14.service
                android.os.Handler r3 = com.squareup.picasso.Picasso.HANDLER
                com.squareup.picasso.Downloader r4 = r14.downloader
                com.squareup.picasso.Cache r5 = r14.cache
                r0 = r9
                r1 = r7
                r6 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                com.squareup.picasso.Picasso r11 = new com.squareup.picasso.Picasso
                com.squareup.picasso.Cache r3 = r14.cache
                com.squareup.picasso.Picasso$Listener r4 = r14.listener
                com.squareup.picasso.Picasso$RequestTransformer r5 = r14.transformer
                java.util.List<com.squareup.picasso.RequestHandler> r6 = r14.requestHandlers
                android.graphics.Bitmap$Config r10 = r14.defaultBitmapConfig
                boolean r12 = r14.indicatorsEnabled
                boolean r13 = r14.loggingEnabled
                r0 = r11
                r2 = r9
                r7 = r8
                r8 = r10
                r9 = r12
                r10 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r11
        }

        @java.lang.Deprecated
        public com.squareup.picasso.Picasso.Builder debugging(boolean r1) {
                r0 = this;
                com.squareup.picasso.Picasso$Builder r1 = r0.indicatorsEnabled(r1)
                return r1
        }

        public com.squareup.picasso.Picasso.Builder defaultBitmapConfig(android.graphics.Bitmap.Config r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.defaultBitmapConfig = r2
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Bitmap config must not be null."
                r2.<init>(r0)
                throw r2
        }

        public com.squareup.picasso.Picasso.Builder downloader(com.squareup.picasso.Downloader r2) {
                r1 = this;
                if (r2 == 0) goto L11
                com.squareup.picasso.Downloader r0 = r1.downloader
                if (r0 != 0) goto L9
                r1.downloader = r2
                return r1
            L9:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Downloader already set."
                r2.<init>(r0)
                throw r2
            L11:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Downloader must not be null."
                r2.<init>(r0)
                throw r2
        }

        public com.squareup.picasso.Picasso.Builder executor(java.util.concurrent.ExecutorService r2) {
                r1 = this;
                if (r2 == 0) goto L11
                java.util.concurrent.ExecutorService r0 = r1.service
                if (r0 != 0) goto L9
                r1.service = r2
                return r1
            L9:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Executor service already set."
                r2.<init>(r0)
                throw r2
            L11:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Executor service must not be null."
                r2.<init>(r0)
                throw r2
        }

        public com.squareup.picasso.Picasso.Builder indicatorsEnabled(boolean r1) {
                r0 = this;
                r0.indicatorsEnabled = r1
                return r0
        }

        public com.squareup.picasso.Picasso.Builder listener(com.squareup.picasso.Picasso.Listener r2) {
                r1 = this;
                if (r2 == 0) goto L11
                com.squareup.picasso.Picasso$Listener r0 = r1.listener
                if (r0 != 0) goto L9
                r1.listener = r2
                return r1
            L9:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Listener already set."
                r2.<init>(r0)
                throw r2
            L11:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Listener must not be null."
                r2.<init>(r0)
                throw r2
        }

        public com.squareup.picasso.Picasso.Builder loggingEnabled(boolean r1) {
                r0 = this;
                r0.loggingEnabled = r1
                return r0
        }

        public com.squareup.picasso.Picasso.Builder memoryCache(com.squareup.picasso.Cache r2) {
                r1 = this;
                if (r2 == 0) goto L11
                com.squareup.picasso.Cache r0 = r1.cache
                if (r0 != 0) goto L9
                r1.cache = r2
                return r1
            L9:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Memory cache already set."
                r2.<init>(r0)
                throw r2
            L11:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Memory cache must not be null."
                r2.<init>(r0)
                throw r2
        }

        public com.squareup.picasso.Picasso.Builder requestTransformer(com.squareup.picasso.Picasso.RequestTransformer r2) {
                r1 = this;
                if (r2 == 0) goto L11
                com.squareup.picasso.Picasso$RequestTransformer r0 = r1.transformer
                if (r0 != 0) goto L9
                r1.transformer = r2
                return r1
            L9:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Transformer already set."
                r2.<init>(r0)
                throw r2
            L11:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Transformer must not be null."
                r2.<init>(r0)
                throw r2
        }
    }

    private static class CleanupThread extends java.lang.Thread {
        private final android.os.Handler handler;
        private final java.lang.ref.ReferenceQueue<java.lang.Object> referenceQueue;


        CleanupThread(java.lang.ref.ReferenceQueue<java.lang.Object> r1, android.os.Handler r2) {
                r0 = this;
                r0.<init>()
                r0.referenceQueue = r1
                r0.handler = r2
                r1 = 1
                r0.setDaemon(r1)
                java.lang.String r1 = "Picasso-refQueue"
                r0.setName(r1)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r3 = this;
                r0 = 10
                android.os.Process.setThreadPriority(r0)
            L5:
                java.lang.ref.ReferenceQueue<java.lang.Object> r0 = r3.referenceQueue     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                r1 = 1000(0x3e8, double:4.94E-321)
                java.lang.ref.Reference r0 = r0.remove(r1)     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                com.squareup.picasso.Action$RequestWeakReference r0 = (com.squareup.picasso.Action.RequestWeakReference) r0     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                android.os.Handler r1 = r3.handler     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                android.os.Message r1 = r1.obtainMessage()     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                if (r0 == 0) goto L24
                r2 = 3
                r1.what = r2     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                com.squareup.picasso.Action r0 = r0.action     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                r1.obj = r0     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                android.os.Handler r0 = r3.handler     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                r0.sendMessage(r1)     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                goto L5
            L24:
                r1.recycle()     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                goto L5
            L28:
                r0 = move-exception
                android.os.Handler r1 = r3.handler
                com.squareup.picasso.Picasso$CleanupThread$1 r2 = new com.squareup.picasso.Picasso$CleanupThread$1
                r2.<init>(r3, r0)
                r1.post(r2)
            L33:
                return
        }

        void shutdown() {
                r0 = this;
                r0.interrupt()
                return
        }
    }

    public interface Listener {
        void onImageLoadFailed(com.squareup.picasso.Picasso r1, android.net.Uri r2, java.lang.Exception r3);
    }

    public enum LoadedFrom extends java.lang.Enum<com.squareup.picasso.Picasso.LoadedFrom> {
        private static final /* synthetic */ com.squareup.picasso.Picasso.LoadedFrom[] $VALUES = null;
        public static final com.squareup.picasso.Picasso.LoadedFrom DISK = null;
        public static final com.squareup.picasso.Picasso.LoadedFrom MEMORY = null;
        public static final com.squareup.picasso.Picasso.LoadedFrom NETWORK = null;
        final int debugColor;

        static {
                com.squareup.picasso.Picasso$LoadedFrom r0 = new com.squareup.picasso.Picasso$LoadedFrom
                r1 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
                java.lang.String r2 = "MEMORY"
                r3 = 0
                r0.<init>(r2, r3, r1)
                com.squareup.picasso.Picasso.LoadedFrom.MEMORY = r0
                com.squareup.picasso.Picasso$LoadedFrom r1 = new com.squareup.picasso.Picasso$LoadedFrom
                r2 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
                java.lang.String r4 = "DISK"
                r5 = 1
                r1.<init>(r4, r5, r2)
                com.squareup.picasso.Picasso.LoadedFrom.DISK = r1
                com.squareup.picasso.Picasso$LoadedFrom r2 = new com.squareup.picasso.Picasso$LoadedFrom
                r4 = -65536(0xffffffffffff0000, float:NaN)
                java.lang.String r6 = "NETWORK"
                r7 = 2
                r2.<init>(r6, r7, r4)
                com.squareup.picasso.Picasso.LoadedFrom.NETWORK = r2
                r4 = 3
                com.squareup.picasso.Picasso$LoadedFrom[] r4 = new com.squareup.picasso.Picasso.LoadedFrom[r4]
                r4[r3] = r0
                r4[r5] = r1
                r4[r7] = r2
                com.squareup.picasso.Picasso.LoadedFrom.$VALUES = r4
                return
        }

        LoadedFrom(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.debugColor = r3
                return
        }

        public static com.squareup.picasso.Picasso.LoadedFrom valueOf(java.lang.String r1) {
                java.lang.Class<com.squareup.picasso.Picasso$LoadedFrom> r0 = com.squareup.picasso.Picasso.LoadedFrom.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.squareup.picasso.Picasso$LoadedFrom r1 = (com.squareup.picasso.Picasso.LoadedFrom) r1
                return r1
        }

        public static com.squareup.picasso.Picasso.LoadedFrom[] values() {
                com.squareup.picasso.Picasso$LoadedFrom[] r0 = com.squareup.picasso.Picasso.LoadedFrom.$VALUES
                java.lang.Object r0 = r0.clone()
                com.squareup.picasso.Picasso$LoadedFrom[] r0 = (com.squareup.picasso.Picasso.LoadedFrom[]) r0
                return r0
        }
    }

    public enum Priority extends java.lang.Enum<com.squareup.picasso.Picasso.Priority> {
        private static final /* synthetic */ com.squareup.picasso.Picasso.Priority[] $VALUES = null;
        public static final com.squareup.picasso.Picasso.Priority HIGH = null;
        public static final com.squareup.picasso.Picasso.Priority LOW = null;
        public static final com.squareup.picasso.Picasso.Priority NORMAL = null;

        static {
                com.squareup.picasso.Picasso$Priority r0 = new com.squareup.picasso.Picasso$Priority
                java.lang.String r1 = "LOW"
                r2 = 0
                r0.<init>(r1, r2)
                com.squareup.picasso.Picasso.Priority.LOW = r0
                com.squareup.picasso.Picasso$Priority r1 = new com.squareup.picasso.Picasso$Priority
                java.lang.String r3 = "NORMAL"
                r4 = 1
                r1.<init>(r3, r4)
                com.squareup.picasso.Picasso.Priority.NORMAL = r1
                com.squareup.picasso.Picasso$Priority r3 = new com.squareup.picasso.Picasso$Priority
                java.lang.String r5 = "HIGH"
                r6 = 2
                r3.<init>(r5, r6)
                com.squareup.picasso.Picasso.Priority.HIGH = r3
                r5 = 3
                com.squareup.picasso.Picasso$Priority[] r5 = new com.squareup.picasso.Picasso.Priority[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.squareup.picasso.Picasso.Priority.$VALUES = r5
                return
        }

        Priority(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.squareup.picasso.Picasso.Priority valueOf(java.lang.String r1) {
                java.lang.Class<com.squareup.picasso.Picasso$Priority> r0 = com.squareup.picasso.Picasso.Priority.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.squareup.picasso.Picasso$Priority r1 = (com.squareup.picasso.Picasso.Priority) r1
                return r1
        }

        public static com.squareup.picasso.Picasso.Priority[] values() {
                com.squareup.picasso.Picasso$Priority[] r0 = com.squareup.picasso.Picasso.Priority.$VALUES
                java.lang.Object r0 = r0.clone()
                com.squareup.picasso.Picasso$Priority[] r0 = (com.squareup.picasso.Picasso.Priority[]) r0
                return r0
        }
    }

    public interface RequestTransformer {
        public static final com.squareup.picasso.Picasso.RequestTransformer IDENTITY = null;


        static {
                com.squareup.picasso.Picasso$RequestTransformer$1 r0 = new com.squareup.picasso.Picasso$RequestTransformer$1
                r0.<init>()
                com.squareup.picasso.Picasso.RequestTransformer.IDENTITY = r0
                return
        }

        com.squareup.picasso.Request transformRequest(com.squareup.picasso.Request r1);
    }

    static {
            com.squareup.picasso.Picasso$1 r0 = new com.squareup.picasso.Picasso$1
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.squareup.picasso.Picasso.HANDLER = r0
            r0 = 0
            com.squareup.picasso.Picasso.singleton = r0
            return
    }

    Picasso(android.content.Context r1, com.squareup.picasso.Dispatcher r2, com.squareup.picasso.Cache r3, com.squareup.picasso.Picasso.Listener r4, com.squareup.picasso.Picasso.RequestTransformer r5, java.util.List<com.squareup.picasso.RequestHandler> r6, com.squareup.picasso.Stats r7, android.graphics.Bitmap.Config r8, boolean r9, boolean r10) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.dispatcher = r2
            r0.cache = r3
            r0.listener = r4
            r0.requestTransformer = r5
            r0.defaultBitmapConfig = r8
            if (r6 == 0) goto L16
            int r3 = r6.size()
            goto L17
        L16:
            r3 = 0
        L17:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r3 = r3 + 7
            r4.<init>(r3)
            com.squareup.picasso.ResourceRequestHandler r3 = new com.squareup.picasso.ResourceRequestHandler
            r3.<init>(r1)
            r4.add(r3)
            if (r6 == 0) goto L2b
            r4.addAll(r6)
        L2b:
            com.squareup.picasso.ContactsPhotoRequestHandler r3 = new com.squareup.picasso.ContactsPhotoRequestHandler
            r3.<init>(r1)
            r4.add(r3)
            com.squareup.picasso.MediaStoreRequestHandler r3 = new com.squareup.picasso.MediaStoreRequestHandler
            r3.<init>(r1)
            r4.add(r3)
            com.squareup.picasso.ContentStreamRequestHandler r3 = new com.squareup.picasso.ContentStreamRequestHandler
            r3.<init>(r1)
            r4.add(r3)
            com.squareup.picasso.AssetRequestHandler r3 = new com.squareup.picasso.AssetRequestHandler
            r3.<init>(r1)
            r4.add(r3)
            com.squareup.picasso.FileRequestHandler r3 = new com.squareup.picasso.FileRequestHandler
            r3.<init>(r1)
            r4.add(r3)
            com.squareup.picasso.NetworkRequestHandler r1 = new com.squareup.picasso.NetworkRequestHandler
            com.squareup.picasso.Downloader r2 = r2.downloader
            r1.<init>(r2, r7)
            r4.add(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r4)
            r0.requestHandlers = r1
            r0.stats = r7
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            r0.targetToAction = r1
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            r0.targetToDeferredRequestCreator = r1
            r0.indicatorsEnabled = r9
            r0.loggingEnabled = r10
            java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
            r1.<init>()
            r0.referenceQueue = r1
            com.squareup.picasso.Picasso$CleanupThread r2 = new com.squareup.picasso.Picasso$CleanupThread
            android.os.Handler r3 = com.squareup.picasso.Picasso.HANDLER
            r2.<init>(r1, r3)
            r0.cleanupThread = r2
            r2.start()
            return
    }

    static /* synthetic */ void access$000(com.squareup.picasso.Picasso r0, java.lang.Object r1) {
            r0.cancelExistingRequest(r1)
            return
    }

    private void cancelExistingRequest(java.lang.Object r3) {
            r2 = this;
            com.squareup.picasso.Utils.checkMain()
            java.util.Map<java.lang.Object, com.squareup.picasso.Action> r0 = r2.targetToAction
            java.lang.Object r0 = r0.remove(r3)
            com.squareup.picasso.Action r0 = (com.squareup.picasso.Action) r0
            if (r0 == 0) goto L15
            r0.cancel()
            com.squareup.picasso.Dispatcher r1 = r2.dispatcher
            r1.dispatchCancel(r0)
        L15:
            boolean r0 = r3 instanceof android.widget.ImageView
            if (r0 == 0) goto L28
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.util.Map<android.widget.ImageView, com.squareup.picasso.DeferredRequestCreator> r0 = r2.targetToDeferredRequestCreator
            java.lang.Object r3 = r0.remove(r3)
            com.squareup.picasso.DeferredRequestCreator r3 = (com.squareup.picasso.DeferredRequestCreator) r3
            if (r3 == 0) goto L28
            r3.cancel()
        L28:
            return
    }

    private void deliverAction(android.graphics.Bitmap r3, com.squareup.picasso.Picasso.LoadedFrom r4, com.squareup.picasso.Action r5) {
            r2 = this;
            boolean r0 = r5.isCancelled()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r5.willReplay()
            if (r0 != 0) goto L16
            java.util.Map<java.lang.Object, com.squareup.picasso.Action> r0 = r2.targetToAction
            java.lang.Object r1 = r5.getTarget()
            r0.remove(r1)
        L16:
            java.lang.String r0 = "Main"
            if (r3 == 0) goto L46
            if (r4 == 0) goto L3e
            r5.complete(r3, r4)
            boolean r3 = r2.loggingEnabled
            if (r3 == 0) goto L58
            com.squareup.picasso.Request r3 = r5.request
            java.lang.String r3 = r3.logId()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "from "
            r5.<init>(r1)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "completed"
            com.squareup.picasso.Utils.log(r0, r5, r3, r4)
            goto L58
        L3e:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r4 = "LoadedFrom cannot be null."
            r3.<init>(r4)
            throw r3
        L46:
            r5.error()
            boolean r3 = r2.loggingEnabled
            if (r3 == 0) goto L58
            com.squareup.picasso.Request r3 = r5.request
            java.lang.String r3 = r3.logId()
            java.lang.String r4 = "errored"
            com.squareup.picasso.Utils.log(r0, r4, r3)
        L58:
            return
    }

    public static void setSingletonInstance(com.squareup.picasso.Picasso r2) {
            java.lang.Class<com.squareup.picasso.Picasso> r0 = com.squareup.picasso.Picasso.class
            monitor-enter(r0)
            com.squareup.picasso.Picasso r1 = com.squareup.picasso.Picasso.singleton     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto Lb
            com.squareup.picasso.Picasso.singleton = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "Singleton instance already exists."
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.lang.Throwable -> L13
        L13:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    public static com.squareup.picasso.Picasso with(android.content.Context r2) {
            com.squareup.picasso.Picasso r0 = com.squareup.picasso.Picasso.singleton
            if (r0 != 0) goto L1b
            java.lang.Class<com.squareup.picasso.Picasso> r0 = com.squareup.picasso.Picasso.class
            monitor-enter(r0)
            com.squareup.picasso.Picasso r1 = com.squareup.picasso.Picasso.singleton     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L16
            com.squareup.picasso.Picasso$Builder r1 = new com.squareup.picasso.Picasso$Builder     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            com.squareup.picasso.Picasso r2 = r1.build()     // Catch: java.lang.Throwable -> L18
            com.squareup.picasso.Picasso.singleton = r2     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r2
        L1b:
            com.squareup.picasso.Picasso r2 = com.squareup.picasso.Picasso.singleton
            return r2
    }

    public boolean areIndicatorsEnabled() {
            r1 = this;
            boolean r0 = r1.indicatorsEnabled
            return r0
    }

    public void cancelRequest(android.widget.ImageView r1) {
            r0 = this;
            r0.cancelExistingRequest(r1)
            return
    }

    public void cancelRequest(android.widget.RemoteViews r2, int r3) {
            r1 = this;
            com.squareup.picasso.RemoteViewsAction$RemoteViewsTarget r0 = new com.squareup.picasso.RemoteViewsAction$RemoteViewsTarget
            r0.<init>(r2, r3)
            r1.cancelExistingRequest(r0)
            return
    }

    public void cancelRequest(com.squareup.picasso.Target r1) {
            r0 = this;
            r0.cancelExistingRequest(r1)
            return
    }

    public void cancelTag(java.lang.Object r6) {
            r5 = this;
            com.squareup.picasso.Utils.checkMain()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.Object, com.squareup.picasso.Action> r1 = r5.targetToAction
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            int r1 = r0.size()
            r2 = 0
        L13:
            if (r2 >= r1) goto L2f
            java.lang.Object r3 = r0.get(r2)
            com.squareup.picasso.Action r3 = (com.squareup.picasso.Action) r3
            java.lang.Object r4 = r3.getTag()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L2c
            java.lang.Object r3 = r3.getTarget()
            r5.cancelExistingRequest(r3)
        L2c:
            int r2 = r2 + 1
            goto L13
        L2f:
            return
    }

    void complete(com.squareup.picasso.BitmapHunter r8) {
            r7 = this;
            com.squareup.picasso.Action r0 = r8.getAction()
            java.util.List r1 = r8.getActions()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L14
            r4 = r2
            goto L15
        L14:
            r4 = r3
        L15:
            if (r0 != 0) goto L1b
            if (r4 == 0) goto L1a
            goto L1b
        L1a:
            r2 = r3
        L1b:
            if (r2 != 0) goto L1e
            return
        L1e:
            com.squareup.picasso.Request r2 = r8.getData()
            android.net.Uri r2 = r2.uri
            java.lang.Exception r5 = r8.getException()
            android.graphics.Bitmap r6 = r8.getResult()
            com.squareup.picasso.Picasso$LoadedFrom r8 = r8.getLoadedFrom()
            if (r0 == 0) goto L35
            r7.deliverAction(r6, r8, r0)
        L35:
            if (r4 == 0) goto L49
            int r0 = r1.size()
        L3b:
            if (r3 >= r0) goto L49
            java.lang.Object r4 = r1.get(r3)
            com.squareup.picasso.Action r4 = (com.squareup.picasso.Action) r4
            r7.deliverAction(r6, r8, r4)
            int r3 = r3 + 1
            goto L3b
        L49:
            com.squareup.picasso.Picasso$Listener r8 = r7.listener
            if (r8 == 0) goto L52
            if (r5 == 0) goto L52
            r8.onImageLoadFailed(r7, r2, r5)
        L52:
            return
    }

    void defer(android.widget.ImageView r2, com.squareup.picasso.DeferredRequestCreator r3) {
            r1 = this;
            java.util.Map<android.widget.ImageView, com.squareup.picasso.DeferredRequestCreator> r0 = r1.targetToDeferredRequestCreator
            r0.put(r2, r3)
            return
    }

    void enqueueAndSubmit(com.squareup.picasso.Action r3) {
            r2 = this;
            java.lang.Object r0 = r3.getTarget()
            if (r0 == 0) goto L16
            java.util.Map<java.lang.Object, com.squareup.picasso.Action> r1 = r2.targetToAction
            java.lang.Object r1 = r1.get(r0)
            if (r1 == r3) goto L16
            r2.cancelExistingRequest(r0)
            java.util.Map<java.lang.Object, com.squareup.picasso.Action> r1 = r2.targetToAction
            r1.put(r0, r3)
        L16:
            r2.submit(r3)
            return
    }

    java.util.List<com.squareup.picasso.RequestHandler> getRequestHandlers() {
            r1 = this;
            java.util.List<com.squareup.picasso.RequestHandler> r0 = r1.requestHandlers
            return r0
    }

    public com.squareup.picasso.StatsSnapshot getSnapshot() {
            r1 = this;
            com.squareup.picasso.Stats r0 = r1.stats
            com.squareup.picasso.StatsSnapshot r0 = r0.createSnapshot()
            return r0
    }

    public void invalidate(android.net.Uri r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            com.squareup.picasso.Cache r0 = r1.cache
            java.lang.String r2 = r2.toString()
            r0.clearKeyUri(r2)
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "uri == null"
            r2.<init>(r0)
            throw r2
    }

    public void invalidate(java.io.File r2) {
            r1 = this;
            if (r2 == 0) goto La
            android.net.Uri r2 = android.net.Uri.fromFile(r2)
            r1.invalidate(r2)
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "file == null"
            r2.<init>(r0)
            throw r2
    }

    public void invalidate(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto La
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.invalidate(r2)
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "path == null"
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public boolean isDebugging() {
            r1 = this;
            boolean r0 = r1.areIndicatorsEnabled()
            if (r0 == 0) goto Le
            boolean r0 = r1.isLoggingEnabled()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public boolean isLoggingEnabled() {
            r1 = this;
            boolean r0 = r1.loggingEnabled
            return r0
    }

    public com.squareup.picasso.RequestCreator load(int r3) {
            r2 = this;
            if (r3 == 0) goto L9
            com.squareup.picasso.RequestCreator r0 = new com.squareup.picasso.RequestCreator
            r1 = 0
            r0.<init>(r2, r1, r3)
            return r0
        L9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Resource ID must not be zero."
            r3.<init>(r0)
            throw r3
    }

    public com.squareup.picasso.RequestCreator load(android.net.Uri r3) {
            r2 = this;
            com.squareup.picasso.RequestCreator r0 = new com.squareup.picasso.RequestCreator
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public com.squareup.picasso.RequestCreator load(java.io.File r3) {
            r2 = this;
            if (r3 != 0) goto La
            com.squareup.picasso.RequestCreator r3 = new com.squareup.picasso.RequestCreator
            r0 = 0
            r1 = 0
            r3.<init>(r2, r0, r1)
            return r3
        La:
            android.net.Uri r3 = android.net.Uri.fromFile(r3)
            com.squareup.picasso.RequestCreator r3 = r2.load(r3)
            return r3
    }

    public com.squareup.picasso.RequestCreator load(java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto La
            com.squareup.picasso.RequestCreator r3 = new com.squareup.picasso.RequestCreator
            r0 = 0
            r1 = 0
            r3.<init>(r2, r0, r1)
            return r3
        La:
            java.lang.String r0 = r3.trim()
            int r0 = r0.length()
            if (r0 == 0) goto L1d
            android.net.Uri r3 = android.net.Uri.parse(r3)
            com.squareup.picasso.RequestCreator r3 = r2.load(r3)
            return r3
        L1d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Path must not be empty."
            r3.<init>(r0)
            throw r3
    }

    public void pauseTag(java.lang.Object r2) {
            r1 = this;
            com.squareup.picasso.Dispatcher r0 = r1.dispatcher
            r0.dispatchPauseTag(r2)
            return
    }

    android.graphics.Bitmap quickMemoryCacheCheck(java.lang.String r2) {
            r1 = this;
            com.squareup.picasso.Cache r0 = r1.cache
            android.graphics.Bitmap r2 = r0.get(r2)
            if (r2 == 0) goto Le
            com.squareup.picasso.Stats r0 = r1.stats
            r0.dispatchCacheHit()
            goto L13
        Le:
            com.squareup.picasso.Stats r0 = r1.stats
            r0.dispatchCacheMiss()
        L13:
            return r2
    }

    void resumeAction(com.squareup.picasso.Action r4) {
            r3 = this;
            int r0 = r4.memoryPolicy
            boolean r0 = com.squareup.picasso.MemoryPolicy.shouldReadFromMemoryCache(r0)
            if (r0 == 0) goto L11
            java.lang.String r0 = r4.getKey()
            android.graphics.Bitmap r0 = r3.quickMemoryCacheCheck(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.String r1 = "Main"
            if (r0 == 0) goto L3c
            com.squareup.picasso.Picasso$LoadedFrom r2 = com.squareup.picasso.Picasso.LoadedFrom.MEMORY
            r3.deliverAction(r0, r2, r4)
            boolean r0 = r3.loggingEnabled
            if (r0 == 0) goto L4e
            com.squareup.picasso.Request r4 = r4.request
            java.lang.String r4 = r4.logId()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "from "
            r0.<init>(r2)
            com.squareup.picasso.Picasso$LoadedFrom r2 = com.squareup.picasso.Picasso.LoadedFrom.MEMORY
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "completed"
            com.squareup.picasso.Utils.log(r1, r2, r4, r0)
            goto L4e
        L3c:
            r3.enqueueAndSubmit(r4)
            boolean r0 = r3.loggingEnabled
            if (r0 == 0) goto L4e
            com.squareup.picasso.Request r4 = r4.request
            java.lang.String r4 = r4.logId()
            java.lang.String r0 = "resumed"
            com.squareup.picasso.Utils.log(r1, r0, r4)
        L4e:
            return
    }

    public void resumeTag(java.lang.Object r2) {
            r1 = this;
            com.squareup.picasso.Dispatcher r0 = r1.dispatcher
            r0.dispatchResumeTag(r2)
            return
    }

    @java.lang.Deprecated
    public void setDebugging(boolean r1) {
            r0 = this;
            r0.setIndicatorsEnabled(r1)
            return
    }

    public void setIndicatorsEnabled(boolean r1) {
            r0 = this;
            r0.indicatorsEnabled = r1
            return
    }

    public void setLoggingEnabled(boolean r1) {
            r0 = this;
            r0.loggingEnabled = r1
            return
    }

    public void shutdown() {
            r2 = this;
            com.squareup.picasso.Picasso r0 = com.squareup.picasso.Picasso.singleton
            if (r2 == r0) goto L40
            boolean r0 = r2.shutdown
            if (r0 == 0) goto L9
            return
        L9:
            com.squareup.picasso.Cache r0 = r2.cache
            r0.clear()
            com.squareup.picasso.Picasso$CleanupThread r0 = r2.cleanupThread
            r0.shutdown()
            com.squareup.picasso.Stats r0 = r2.stats
            r0.shutdown()
            com.squareup.picasso.Dispatcher r0 = r2.dispatcher
            r0.shutdown()
            java.util.Map<android.widget.ImageView, com.squareup.picasso.DeferredRequestCreator> r0 = r2.targetToDeferredRequestCreator
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            com.squareup.picasso.DeferredRequestCreator r1 = (com.squareup.picasso.DeferredRequestCreator) r1
            r1.cancel()
            goto L27
        L37:
            java.util.Map<android.widget.ImageView, com.squareup.picasso.DeferredRequestCreator> r0 = r2.targetToDeferredRequestCreator
            r0.clear()
            r0 = 1
            r2.shutdown = r0
            return
        L40:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Default singleton instance cannot be shutdown."
            r0.<init>(r1)
            throw r0
    }

    void submit(com.squareup.picasso.Action r2) {
            r1 = this;
            com.squareup.picasso.Dispatcher r0 = r1.dispatcher
            r0.dispatchSubmit(r2)
            return
    }

    com.squareup.picasso.Request transformRequest(com.squareup.picasso.Request r4) {
            r3 = this;
            com.squareup.picasso.Picasso$RequestTransformer r0 = r3.requestTransformer
            com.squareup.picasso.Request r0 = r0.transformRequest(r4)
            if (r0 == 0) goto L9
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Request transformer "
            r1.<init>(r2)
            com.squareup.picasso.Picasso$RequestTransformer r2 = r3.requestTransformer
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " returned null for "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }
}
