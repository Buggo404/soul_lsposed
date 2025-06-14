package com.squareup.picasso;

/* loaded from: classes.dex */
class BitmapHunter implements java.lang.Runnable {
    private static final java.lang.Object DECODE_LOCK = null;
    private static final com.squareup.picasso.RequestHandler ERRORING_HANDLER = null;
    private static final java.lang.ThreadLocal<java.lang.StringBuilder> NAME_BUILDER = null;
    private static final java.util.concurrent.atomic.AtomicInteger SEQUENCE_GENERATOR = null;
    com.squareup.picasso.Action action;
    java.util.List<com.squareup.picasso.Action> actions;
    final com.squareup.picasso.Cache cache;
    final com.squareup.picasso.Request data;
    final com.squareup.picasso.Dispatcher dispatcher;
    java.lang.Exception exception;
    int exifRotation;
    java.util.concurrent.Future<?> future;
    final java.lang.String key;
    com.squareup.picasso.Picasso.LoadedFrom loadedFrom;
    final int memoryPolicy;
    int networkPolicy;
    final com.squareup.picasso.Picasso picasso;
    com.squareup.picasso.Picasso.Priority priority;
    final com.squareup.picasso.RequestHandler requestHandler;
    android.graphics.Bitmap result;
    int retryCount;
    final int sequence;
    final com.squareup.picasso.Stats stats;







    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.squareup.picasso.BitmapHunter.DECODE_LOCK = r0
            com.squareup.picasso.BitmapHunter$1 r0 = new com.squareup.picasso.BitmapHunter$1
            r0.<init>()
            com.squareup.picasso.BitmapHunter.NAME_BUILDER = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            com.squareup.picasso.BitmapHunter.SEQUENCE_GENERATOR = r0
            com.squareup.picasso.BitmapHunter$2 r0 = new com.squareup.picasso.BitmapHunter$2
            r0.<init>()
            com.squareup.picasso.BitmapHunter.ERRORING_HANDLER = r0
            return
    }

    BitmapHunter(com.squareup.picasso.Picasso r2, com.squareup.picasso.Dispatcher r3, com.squareup.picasso.Cache r4, com.squareup.picasso.Stats r5, com.squareup.picasso.Action r6, com.squareup.picasso.RequestHandler r7) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = com.squareup.picasso.BitmapHunter.SEQUENCE_GENERATOR
            int r0 = r0.incrementAndGet()
            r1.sequence = r0
            r1.picasso = r2
            r1.dispatcher = r3
            r1.cache = r4
            r1.stats = r5
            r1.action = r6
            java.lang.String r2 = r6.getKey()
            r1.key = r2
            com.squareup.picasso.Request r2 = r6.getRequest()
            r1.data = r2
            com.squareup.picasso.Picasso$Priority r2 = r6.getPriority()
            r1.priority = r2
            int r2 = r6.getMemoryPolicy()
            r1.memoryPolicy = r2
            int r2 = r6.getNetworkPolicy()
            r1.networkPolicy = r2
            r1.requestHandler = r7
            int r2 = r7.getRetryCount()
            r1.retryCount = r2
            return
    }

    static android.graphics.Bitmap applyCustomTransformations(java.util.List<com.squareup.picasso.Transformation> r6, android.graphics.Bitmap r7) {
            int r0 = r6.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L97
            java.lang.Object r2 = r6.get(r1)
            com.squareup.picasso.Transformation r2 = (com.squareup.picasso.Transformation) r2
            r3 = 0
            android.graphics.Bitmap r4 = r2.transform(r7)     // Catch: java.lang.RuntimeException -> L8b
            if (r4 != 0) goto L60
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Transformation "
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = r2.key()
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = " returned null after "
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r0 = " previous transformation(s).\n\nTransformation list:\n"
            java.lang.StringBuilder r7 = r7.append(r0)
            java.util.Iterator r6 = r6.iterator()
        L3b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r6.next()
            com.squareup.picasso.Transformation r0 = (com.squareup.picasso.Transformation) r0
            java.lang.String r0 = r0.key()
            java.lang.StringBuilder r0 = r7.append(r0)
            r1 = 10
            r0.append(r1)
            goto L3b
        L55:
            android.os.Handler r6 = com.squareup.picasso.Picasso.HANDLER
            com.squareup.picasso.BitmapHunter$4 r0 = new com.squareup.picasso.BitmapHunter$4
            r0.<init>(r7)
            r6.post(r0)
            return r3
        L60:
            if (r4 != r7) goto L73
            boolean r5 = r7.isRecycled()
            if (r5 == 0) goto L73
            android.os.Handler r6 = com.squareup.picasso.Picasso.HANDLER
            com.squareup.picasso.BitmapHunter$5 r7 = new com.squareup.picasso.BitmapHunter$5
            r7.<init>(r2)
            r6.post(r7)
            return r3
        L73:
            if (r4 == r7) goto L86
            boolean r7 = r7.isRecycled()
            if (r7 != 0) goto L86
            android.os.Handler r6 = com.squareup.picasso.Picasso.HANDLER
            com.squareup.picasso.BitmapHunter$6 r7 = new com.squareup.picasso.BitmapHunter$6
            r7.<init>(r2)
            r6.post(r7)
            return r3
        L86:
            int r1 = r1 + 1
            r7 = r4
            goto L5
        L8b:
            r6 = move-exception
            android.os.Handler r7 = com.squareup.picasso.Picasso.HANDLER
            com.squareup.picasso.BitmapHunter$3 r0 = new com.squareup.picasso.BitmapHunter$3
            r0.<init>(r2, r6)
            r7.post(r0)
            return r3
        L97:
            return r7
    }

    private com.squareup.picasso.Picasso.Priority computeNewPriority() {
            r6 = this;
            com.squareup.picasso.Picasso$Priority r0 = com.squareup.picasso.Picasso.Priority.LOW
            java.util.List<com.squareup.picasso.Action> r1 = r6.actions
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L10
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L10
            r1 = r2
            goto L11
        L10:
            r1 = r3
        L11:
            com.squareup.picasso.Action r4 = r6.action
            if (r4 != 0) goto L19
            if (r1 == 0) goto L18
            goto L19
        L18:
            r2 = r3
        L19:
            if (r2 != 0) goto L1c
            return r0
        L1c:
            if (r4 == 0) goto L22
            com.squareup.picasso.Picasso$Priority r0 = r4.getPriority()
        L22:
            if (r1 == 0) goto L46
            java.util.List<com.squareup.picasso.Action> r1 = r6.actions
            int r1 = r1.size()
        L2a:
            if (r3 >= r1) goto L46
            java.util.List<com.squareup.picasso.Action> r2 = r6.actions
            java.lang.Object r2 = r2.get(r3)
            com.squareup.picasso.Action r2 = (com.squareup.picasso.Action) r2
            com.squareup.picasso.Picasso$Priority r2 = r2.getPriority()
            int r4 = r2.ordinal()
            int r5 = r0.ordinal()
            if (r4 <= r5) goto L43
            r0 = r2
        L43:
            int r3 = r3 + 1
            goto L2a
        L46:
            return r0
    }

    static android.graphics.Bitmap decodeStream(java.io.InputStream r6, com.squareup.picasso.Request r7) throws java.io.IOException {
            com.squareup.picasso.MarkableInputStream r0 = new com.squareup.picasso.MarkableInputStream
            r0.<init>(r6)
            r6 = 65536(0x10000, float:9.18355E-41)
            long r1 = r0.savePosition(r6)
            android.graphics.BitmapFactory$Options r6 = com.squareup.picasso.RequestHandler.createBitmapOptions(r7)
            boolean r3 = com.squareup.picasso.RequestHandler.requiresInSampleSize(r6)
            boolean r4 = com.squareup.picasso.Utils.isWebPFile(r0)
            r0.reset(r1)
            if (r4 == 0) goto L34
            byte[] r0 = com.squareup.picasso.Utils.toByteArray(r0)
            r1 = 0
            if (r3 == 0) goto L2e
            int r2 = r0.length
            android.graphics.BitmapFactory.decodeByteArray(r0, r1, r2, r6)
            int r2 = r7.targetWidth
            int r3 = r7.targetHeight
            com.squareup.picasso.RequestHandler.calculateInSampleSize(r2, r3, r6, r7)
        L2e:
            int r7 = r0.length
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeByteArray(r0, r1, r7, r6)
            return r6
        L34:
            r4 = 0
            if (r3 == 0) goto L44
            android.graphics.BitmapFactory.decodeStream(r0, r4, r6)
            int r3 = r7.targetWidth
            int r5 = r7.targetHeight
            com.squareup.picasso.RequestHandler.calculateInSampleSize(r3, r5, r6, r7)
            r0.reset(r1)
        L44:
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r0, r4, r6)
            if (r6 == 0) goto L4b
            return r6
        L4b:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Failed to decode stream."
            r6.<init>(r7)
            throw r6
    }

    static com.squareup.picasso.BitmapHunter forRequest(com.squareup.picasso.Picasso r12, com.squareup.picasso.Dispatcher r13, com.squareup.picasso.Cache r14, com.squareup.picasso.Stats r15, com.squareup.picasso.Action r16) {
            com.squareup.picasso.Request r0 = r16.getRequest()
            java.util.List r1 = r12.getRequestHandlers()
            int r2 = r1.size()
            r3 = 0
        Ld:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r1.get(r3)
            r11 = r4
            com.squareup.picasso.RequestHandler r11 = (com.squareup.picasso.RequestHandler) r11
            boolean r4 = r11.canHandleRequest(r0)
            if (r4 == 0) goto L29
            com.squareup.picasso.BitmapHunter r0 = new com.squareup.picasso.BitmapHunter
            r5 = r0
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r0
        L29:
            int r3 = r3 + 1
            goto Ld
        L2c:
            com.squareup.picasso.BitmapHunter r0 = new com.squareup.picasso.BitmapHunter
            com.squareup.picasso.RequestHandler r10 = com.squareup.picasso.BitmapHunter.ERRORING_HANDLER
            r4 = r0
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r0
    }

    private static boolean shouldResize(boolean r0, int r1, int r2, int r3, int r4) {
            if (r0 == 0) goto L9
            if (r1 > r3) goto L9
            if (r2 <= r4) goto L7
            goto L9
        L7:
            r0 = 0
            goto La
        L9:
            r0 = 1
        La:
            return r0
    }

    static android.graphics.Bitmap transformResult(com.squareup.picasso.Request r16, android.graphics.Bitmap r17, int r18) {
            r0 = r16
            r1 = r18
            int r2 = r17.getWidth()
            int r3 = r17.getHeight()
            boolean r4 = r0.onlyScaleDown
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            boolean r5 = r16.needsMatrixTransform()
            r6 = 0
            if (r5 == 0) goto Lb2
            int r5 = r0.targetWidth
            int r7 = r0.targetHeight
            float r8 = r0.rotationDegrees
            r9 = 0
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 == 0) goto L34
            boolean r9 = r0.hasRotationPivot
            if (r9 == 0) goto L31
            float r9 = r0.rotationPivotX
            float r11 = r0.rotationPivotY
            r10.setRotate(r8, r9, r11)
            goto L34
        L31:
            r10.setRotate(r8)
        L34:
            boolean r8 = r0.centerCrop
            if (r8 == 0) goto L77
            float r0 = (float) r5
            float r8 = (float) r2
            float r9 = r0 / r8
            float r11 = (float) r7
            float r12 = (float) r3
            float r13 = r11 / r12
            int r14 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r14 <= 0) goto L56
            float r13 = r13 / r9
            float r12 = r12 * r13
            double r12 = (double) r12
            double r12 = java.lang.Math.ceil(r12)
            int r0 = (int) r12
            int r8 = r3 - r0
            int r8 = r8 / 2
            float r12 = (float) r0
            float r13 = r11 / r12
            r11 = r9
            r9 = r2
            goto L6a
        L56:
            float r9 = r9 / r13
            float r8 = r8 * r9
            double r8 = (double) r8
            double r8 = java.lang.Math.ceil(r8)
            int r8 = (int) r8
            int r9 = r2 - r8
            int r9 = r9 / 2
            float r11 = (float) r8
            float r0 = r0 / r11
            r11 = r0
            r0 = r3
            r15 = r8
            r8 = r6
            r6 = r9
            r9 = r15
        L6a:
            boolean r2 = shouldResize(r4, r2, r3, r5, r7)
            if (r2 == 0) goto L73
            r10.preScale(r11, r13)
        L73:
            r7 = r8
            r8 = r9
            r9 = r0
            goto Lb5
        L77:
            boolean r0 = r0.centerInside
            if (r0 == 0) goto L91
            float r0 = (float) r5
            float r8 = (float) r2
            float r0 = r0 / r8
            float r8 = (float) r7
            float r9 = (float) r3
            float r8 = r8 / r9
            int r9 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r9 >= 0) goto L86
            goto L87
        L86:
            r0 = r8
        L87:
            boolean r4 = shouldResize(r4, r2, r3, r5, r7)
            if (r4 == 0) goto Lb2
            r10.preScale(r0, r0)
            goto Lb2
        L91:
            if (r5 != 0) goto L95
            if (r7 == 0) goto Lb2
        L95:
            if (r5 != r2) goto L99
            if (r7 == r3) goto Lb2
        L99:
            if (r5 == 0) goto L9e
            float r0 = (float) r5
            float r8 = (float) r2
            goto La0
        L9e:
            float r0 = (float) r7
            float r8 = (float) r3
        La0:
            float r0 = r0 / r8
            if (r7 == 0) goto La6
            float r8 = (float) r7
            float r9 = (float) r3
            goto La8
        La6:
            float r8 = (float) r5
            float r9 = (float) r2
        La8:
            float r8 = r8 / r9
            boolean r4 = shouldResize(r4, r2, r3, r5, r7)
            if (r4 == 0) goto Lb2
            r10.preScale(r0, r8)
        Lb2:
            r8 = r2
            r9 = r3
            r7 = r6
        Lb5:
            if (r1 == 0) goto Lbb
            float r0 = (float) r1
            r10.preRotate(r0)
        Lbb:
            r11 = 1
            r5 = r17
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            r1 = r17
            if (r0 == r1) goto Lca
            r17.recycle()
            goto Lcb
        Lca:
            r0 = r1
        Lcb:
            return r0
    }

    static void updateThreadName(com.squareup.picasso.Request r3) {
            java.lang.String r3 = r3.getName()
            java.lang.ThreadLocal<java.lang.StringBuilder> r0 = com.squareup.picasso.BitmapHunter.NAME_BUILDER
            java.lang.Object r0 = r0.get()
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            int r1 = r3.length()
            r2 = 8
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
            int r1 = r0.length()
            r0.replace(r2, r1, r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.toString()
            r3.setName(r0)
            return
    }

    void attach(com.squareup.picasso.Action r8) {
            r7 = this;
            com.squareup.picasso.Picasso r0 = r7.picasso
            boolean r0 = r0.loggingEnabled
            com.squareup.picasso.Request r1 = r8.request
            com.squareup.picasso.Action r2 = r7.action
            java.lang.String r3 = "to "
            java.lang.String r4 = "joined"
            java.lang.String r5 = "Hunter"
            if (r2 != 0) goto L35
            r7.action = r8
            if (r0 == 0) goto L34
            java.util.List<com.squareup.picasso.Action> r8 = r7.actions
            if (r8 == 0) goto L2b
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L1f
            goto L2b
        L1f:
            java.lang.String r8 = r1.logId()
            java.lang.String r0 = com.squareup.picasso.Utils.getLogIdsForHunter(r7, r3)
            com.squareup.picasso.Utils.log(r5, r4, r8, r0)
            goto L34
        L2b:
            java.lang.String r8 = r1.logId()
            java.lang.String r0 = "to empty hunter"
            com.squareup.picasso.Utils.log(r5, r4, r8, r0)
        L34:
            return
        L35:
            java.util.List<com.squareup.picasso.Action> r2 = r7.actions
            if (r2 != 0) goto L41
            java.util.ArrayList r2 = new java.util.ArrayList
            r6 = 3
            r2.<init>(r6)
            r7.actions = r2
        L41:
            java.util.List<com.squareup.picasso.Action> r2 = r7.actions
            r2.add(r8)
            if (r0 == 0) goto L53
            java.lang.String r0 = r1.logId()
            java.lang.String r1 = com.squareup.picasso.Utils.getLogIdsForHunter(r7, r3)
            com.squareup.picasso.Utils.log(r5, r4, r0, r1)
        L53:
            com.squareup.picasso.Picasso$Priority r8 = r8.getPriority()
            int r0 = r8.ordinal()
            com.squareup.picasso.Picasso$Priority r1 = r7.priority
            int r1 = r1.ordinal()
            if (r0 <= r1) goto L65
            r7.priority = r8
        L65:
            return
    }

    boolean cancel() {
            r2 = this;
            com.squareup.picasso.Action r0 = r2.action
            r1 = 0
            if (r0 != 0) goto L1a
            java.util.List<com.squareup.picasso.Action> r0 = r2.actions
            if (r0 == 0) goto Lf
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
        Lf:
            java.util.concurrent.Future<?> r0 = r2.future
            if (r0 == 0) goto L1a
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L1a
            r1 = 1
        L1a:
            return r1
    }

    void detach(com.squareup.picasso.Action r4) {
            r3 = this;
            com.squareup.picasso.Action r0 = r3.action
            if (r0 != r4) goto L9
            r0 = 0
            r3.action = r0
            r0 = 1
            goto L13
        L9:
            java.util.List<com.squareup.picasso.Action> r0 = r3.actions
            if (r0 == 0) goto L12
            boolean r0 = r0.remove(r4)
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L23
            com.squareup.picasso.Picasso$Priority r0 = r4.getPriority()
            com.squareup.picasso.Picasso$Priority r1 = r3.priority
            if (r0 != r1) goto L23
            com.squareup.picasso.Picasso$Priority r0 = r3.computeNewPriority()
            r3.priority = r0
        L23:
            com.squareup.picasso.Picasso r0 = r3.picasso
            boolean r0 = r0.loggingEnabled
            if (r0 == 0) goto L3c
            com.squareup.picasso.Request r4 = r4.request
            java.lang.String r4 = r4.logId()
            java.lang.String r0 = "from "
            java.lang.String r0 = com.squareup.picasso.Utils.getLogIdsForHunter(r3, r0)
            java.lang.String r1 = "Hunter"
            java.lang.String r2 = "removed"
            com.squareup.picasso.Utils.log(r1, r2, r4, r0)
        L3c:
            return
    }

    com.squareup.picasso.Action getAction() {
            r1 = this;
            com.squareup.picasso.Action r0 = r1.action
            return r0
    }

    java.util.List<com.squareup.picasso.Action> getActions() {
            r1 = this;
            java.util.List<com.squareup.picasso.Action> r0 = r1.actions
            return r0
    }

    com.squareup.picasso.Request getData() {
            r1 = this;
            com.squareup.picasso.Request r0 = r1.data
            return r0
    }

    java.lang.Exception getException() {
            r1 = this;
            java.lang.Exception r0 = r1.exception
            return r0
    }

    java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    com.squareup.picasso.Picasso.LoadedFrom getLoadedFrom() {
            r1 = this;
            com.squareup.picasso.Picasso$LoadedFrom r0 = r1.loadedFrom
            return r0
    }

    int getMemoryPolicy() {
            r1 = this;
            int r0 = r1.memoryPolicy
            return r0
    }

    com.squareup.picasso.Picasso getPicasso() {
            r1 = this;
            com.squareup.picasso.Picasso r0 = r1.picasso
            return r0
    }

    com.squareup.picasso.Picasso.Priority getPriority() {
            r1 = this;
            com.squareup.picasso.Picasso$Priority r0 = r1.priority
            return r0
    }

    android.graphics.Bitmap getResult() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.result
            return r0
    }

    android.graphics.Bitmap hunt() throws java.io.IOException {
            r6 = this;
            int r0 = r6.memoryPolicy
            boolean r0 = com.squareup.picasso.MemoryPolicy.shouldReadFromMemoryCache(r0)
            if (r0 == 0) goto L31
            com.squareup.picasso.Cache r0 = r6.cache
            java.lang.String r1 = r6.key
            android.graphics.Bitmap r0 = r0.get(r1)
            if (r0 == 0) goto L32
            com.squareup.picasso.Stats r1 = r6.stats
            r1.dispatchCacheHit()
            com.squareup.picasso.Picasso$LoadedFrom r1 = com.squareup.picasso.Picasso.LoadedFrom.MEMORY
            r6.loadedFrom = r1
            com.squareup.picasso.Picasso r1 = r6.picasso
            boolean r1 = r1.loggingEnabled
            if (r1 == 0) goto L30
            java.lang.String r1 = "Hunter"
            java.lang.String r2 = "decoded"
            com.squareup.picasso.Request r3 = r6.data
            java.lang.String r3 = r3.logId()
            java.lang.String r4 = "from cache"
            com.squareup.picasso.Utils.log(r1, r2, r3, r4)
        L30:
            return r0
        L31:
            r0 = 0
        L32:
            com.squareup.picasso.Request r1 = r6.data
            int r2 = r6.retryCount
            if (r2 != 0) goto L3d
            com.squareup.picasso.NetworkPolicy r2 = com.squareup.picasso.NetworkPolicy.OFFLINE
            int r2 = r2.index
            goto L3f
        L3d:
            int r2 = r6.networkPolicy
        L3f:
            r1.networkPolicy = r2
            com.squareup.picasso.RequestHandler r1 = r6.requestHandler
            com.squareup.picasso.Request r2 = r6.data
            int r3 = r6.networkPolicy
            com.squareup.picasso.RequestHandler$Result r1 = r1.load(r2, r3)
            if (r1 == 0) goto L73
            com.squareup.picasso.Picasso$LoadedFrom r0 = r1.getLoadedFrom()
            r6.loadedFrom = r0
            int r0 = r1.getExifOrientation()
            r6.exifRotation = r0
            android.graphics.Bitmap r0 = r1.getBitmap()
            if (r0 != 0) goto L73
            java.io.InputStream r0 = r1.getStream()
            com.squareup.picasso.Request r1 = r6.data     // Catch: java.lang.Throwable -> L6e
            android.graphics.Bitmap r1 = decodeStream(r0, r1)     // Catch: java.lang.Throwable -> L6e
            com.squareup.picasso.Utils.closeQuietly(r0)
            r0 = r1
            goto L73
        L6e:
            r1 = move-exception
            com.squareup.picasso.Utils.closeQuietly(r0)
            throw r1
        L73:
            if (r0 == 0) goto Lf4
            com.squareup.picasso.Picasso r1 = r6.picasso
            boolean r1 = r1.loggingEnabled
            if (r1 == 0) goto L88
            java.lang.String r1 = "Hunter"
            java.lang.String r2 = "decoded"
            com.squareup.picasso.Request r3 = r6.data
            java.lang.String r3 = r3.logId()
            com.squareup.picasso.Utils.log(r1, r2, r3)
        L88:
            com.squareup.picasso.Stats r1 = r6.stats
            r1.dispatchBitmapDecoded(r0)
            com.squareup.picasso.Request r1 = r6.data
            boolean r1 = r1.needsTransformation()
            if (r1 != 0) goto L99
            int r1 = r6.exifRotation
            if (r1 == 0) goto Lf4
        L99:
            java.lang.Object r1 = com.squareup.picasso.BitmapHunter.DECODE_LOCK
            monitor-enter(r1)
            com.squareup.picasso.Request r2 = r6.data     // Catch: java.lang.Throwable -> Lf1
            boolean r2 = r2.needsMatrixTransform()     // Catch: java.lang.Throwable -> Lf1
            if (r2 != 0) goto La8
            int r2 = r6.exifRotation     // Catch: java.lang.Throwable -> Lf1
            if (r2 == 0) goto Lc3
        La8:
            com.squareup.picasso.Request r2 = r6.data     // Catch: java.lang.Throwable -> Lf1
            int r3 = r6.exifRotation     // Catch: java.lang.Throwable -> Lf1
            android.graphics.Bitmap r0 = transformResult(r2, r0, r3)     // Catch: java.lang.Throwable -> Lf1
            com.squareup.picasso.Picasso r2 = r6.picasso     // Catch: java.lang.Throwable -> Lf1
            boolean r2 = r2.loggingEnabled     // Catch: java.lang.Throwable -> Lf1
            if (r2 == 0) goto Lc3
            java.lang.String r2 = "Hunter"
            java.lang.String r3 = "transformed"
            com.squareup.picasso.Request r4 = r6.data     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r4 = r4.logId()     // Catch: java.lang.Throwable -> Lf1
            com.squareup.picasso.Utils.log(r2, r3, r4)     // Catch: java.lang.Throwable -> Lf1
        Lc3:
            com.squareup.picasso.Request r2 = r6.data     // Catch: java.lang.Throwable -> Lf1
            boolean r2 = r2.hasCustomTransformations()     // Catch: java.lang.Throwable -> Lf1
            if (r2 == 0) goto Le8
            com.squareup.picasso.Request r2 = r6.data     // Catch: java.lang.Throwable -> Lf1
            java.util.List<com.squareup.picasso.Transformation> r2 = r2.transformations     // Catch: java.lang.Throwable -> Lf1
            android.graphics.Bitmap r0 = applyCustomTransformations(r2, r0)     // Catch: java.lang.Throwable -> Lf1
            com.squareup.picasso.Picasso r2 = r6.picasso     // Catch: java.lang.Throwable -> Lf1
            boolean r2 = r2.loggingEnabled     // Catch: java.lang.Throwable -> Lf1
            if (r2 == 0) goto Le8
            java.lang.String r2 = "Hunter"
            java.lang.String r3 = "transformed"
            com.squareup.picasso.Request r4 = r6.data     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r4 = r4.logId()     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r5 = "from custom transformations"
            com.squareup.picasso.Utils.log(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lf1
        Le8:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf1
            if (r0 == 0) goto Lf4
            com.squareup.picasso.Stats r1 = r6.stats
            r1.dispatchBitmapTransformed(r0)
            goto Lf4
        Lf1:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf1
            throw r0
        Lf4:
            return r0
    }

    boolean isCancelled() {
            r1 = this;
            java.util.concurrent.Future<?> r0 = r1.future
            if (r0 == 0) goto Lc
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            java.lang.String r0 = "Picasso-Idle"
            com.squareup.picasso.Request r1 = r5.data     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e java.lang.OutOfMemoryError -> L37 java.io.IOException -> L5c com.squareup.picasso.NetworkRequestHandler.ContentLengthException -> L65 com.squareup.picasso.Downloader.ResponseException -> L75
            updateThreadName(r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e java.lang.OutOfMemoryError -> L37 java.io.IOException -> L5c com.squareup.picasso.NetworkRequestHandler.ContentLengthException -> L65 com.squareup.picasso.Downloader.ResponseException -> L75
            com.squareup.picasso.Picasso r1 = r5.picasso     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e java.lang.OutOfMemoryError -> L37 java.io.IOException -> L5c com.squareup.picasso.NetworkRequestHandler.ContentLengthException -> L65 com.squareup.picasso.Downloader.ResponseException -> L75
            boolean r1 = r1.loggingEnabled     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e java.lang.OutOfMemoryError -> L37 java.io.IOException -> L5c com.squareup.picasso.NetworkRequestHandler.ContentLengthException -> L65 com.squareup.picasso.Downloader.ResponseException -> L75
            if (r1 == 0) goto L18
            java.lang.String r1 = "Hunter"
            java.lang.String r2 = "executing"
            java.lang.String r3 = com.squareup.picasso.Utils.getLogIdsForHunter(r5)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e java.lang.OutOfMemoryError -> L37 java.io.IOException -> L5c com.squareup.picasso.NetworkRequestHandler.ContentLengthException -> L65 com.squareup.picasso.Downloader.ResponseException -> L75
            com.squareup.picasso.Utils.log(r1, r2, r3)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e java.lang.OutOfMemoryError -> L37 java.io.IOException -> L5c com.squareup.picasso.NetworkRequestHandler.ContentLengthException -> L65 com.squareup.picasso.Downloader.ResponseException -> L75
        L18:
            android.graphics.Bitmap r1 = r5.hunt()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e java.lang.OutOfMemoryError -> L37 java.io.IOException -> L5c com.squareup.picasso.NetworkRequestHandler.ContentLengthException -> L65 com.squareup.picasso.Downloader.ResponseException -> L75
            r5.result = r1     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e java.lang.OutOfMemoryError -> L37 java.io.IOException -> L5c com.squareup.picasso.NetworkRequestHandler.ContentLengthException -> L65 com.squareup.picasso.Downloader.ResponseException -> L75
            if (r1 != 0) goto L26
            com.squareup.picasso.Dispatcher r1 = r5.dispatcher     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e java.lang.OutOfMemoryError -> L37 java.io.IOException -> L5c com.squareup.picasso.NetworkRequestHandler.ContentLengthException -> L65 com.squareup.picasso.Downloader.ResponseException -> L75
            r1.dispatchFailed(r5)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e java.lang.OutOfMemoryError -> L37 java.io.IOException -> L5c com.squareup.picasso.NetworkRequestHandler.ContentLengthException -> L65 com.squareup.picasso.Downloader.ResponseException -> L75
            goto L6d
        L26:
            com.squareup.picasso.Dispatcher r1 = r5.dispatcher     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e java.lang.OutOfMemoryError -> L37 java.io.IOException -> L5c com.squareup.picasso.NetworkRequestHandler.ContentLengthException -> L65 com.squareup.picasso.Downloader.ResponseException -> L75
            r1.dispatchComplete(r5)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e java.lang.OutOfMemoryError -> L37 java.io.IOException -> L5c com.squareup.picasso.NetworkRequestHandler.ContentLengthException -> L65 com.squareup.picasso.Downloader.ResponseException -> L75
            goto L6d
        L2c:
            r1 = move-exception
            goto L89
        L2e:
            r1 = move-exception
            r5.exception = r1     // Catch: java.lang.Throwable -> L2c
            com.squareup.picasso.Dispatcher r1 = r5.dispatcher     // Catch: java.lang.Throwable -> L2c
            r1.dispatchFailed(r5)     // Catch: java.lang.Throwable -> L2c
            goto L6d
        L37:
            r1 = move-exception
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L2c
            r2.<init>()     // Catch: java.lang.Throwable -> L2c
            com.squareup.picasso.Stats r3 = r5.stats     // Catch: java.lang.Throwable -> L2c
            com.squareup.picasso.StatsSnapshot r3 = r3.createSnapshot()     // Catch: java.lang.Throwable -> L2c
            java.io.PrintWriter r4 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L2c
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L2c
            r3.dump(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2c
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L2c
            r5.exception = r3     // Catch: java.lang.Throwable -> L2c
            com.squareup.picasso.Dispatcher r1 = r5.dispatcher     // Catch: java.lang.Throwable -> L2c
            r1.dispatchFailed(r5)     // Catch: java.lang.Throwable -> L2c
            goto L6d
        L5c:
            r1 = move-exception
            r5.exception = r1     // Catch: java.lang.Throwable -> L2c
            com.squareup.picasso.Dispatcher r1 = r5.dispatcher     // Catch: java.lang.Throwable -> L2c
            r1.dispatchRetry(r5)     // Catch: java.lang.Throwable -> L2c
            goto L6d
        L65:
            r1 = move-exception
            r5.exception = r1     // Catch: java.lang.Throwable -> L2c
            com.squareup.picasso.Dispatcher r1 = r5.dispatcher     // Catch: java.lang.Throwable -> L2c
            r1.dispatchRetry(r5)     // Catch: java.lang.Throwable -> L2c
        L6d:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.setName(r0)
            goto L88
        L75:
            r1 = move-exception
            boolean r2 = r1.localCacheOnly     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L80
            int r2 = r1.responseCode     // Catch: java.lang.Throwable -> L2c
            r3 = 504(0x1f8, float:7.06E-43)
            if (r2 == r3) goto L82
        L80:
            r5.exception = r1     // Catch: java.lang.Throwable -> L2c
        L82:
            com.squareup.picasso.Dispatcher r1 = r5.dispatcher     // Catch: java.lang.Throwable -> L2c
            r1.dispatchFailed(r5)     // Catch: java.lang.Throwable -> L2c
            goto L6d
        L88:
            return
        L89:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.setName(r0)
            throw r1
    }

    boolean shouldRetry(boolean r5, android.net.NetworkInfo r6) {
            r4 = this;
            int r0 = r4.retryCount
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            if (r3 != 0) goto Lc
            return r2
        Lc:
            int r0 = r0 - r1
            r4.retryCount = r0
            com.squareup.picasso.RequestHandler r0 = r4.requestHandler
            boolean r5 = r0.shouldRetry(r5, r6)
            return r5
    }

    boolean supportsReplay() {
            r1 = this;
            com.squareup.picasso.RequestHandler r0 = r1.requestHandler
            boolean r0 = r0.supportsReplay()
            return r0
    }
}
