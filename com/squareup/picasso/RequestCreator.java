package com.squareup.picasso;

/* loaded from: classes.dex */
public class RequestCreator {
    private static final java.util.concurrent.atomic.AtomicInteger nextId = null;
    private final com.squareup.picasso.Request.Builder data;
    private boolean deferred;
    private android.graphics.drawable.Drawable errorDrawable;
    private int errorResId;
    private int memoryPolicy;
    private int networkPolicy;
    private boolean noFade;
    private final com.squareup.picasso.Picasso picasso;
    private android.graphics.drawable.Drawable placeholderDrawable;
    private int placeholderResId;
    private boolean setPlaceholder;
    private java.lang.Object tag;

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            com.squareup.picasso.RequestCreator.nextId = r0
            return
    }

    RequestCreator() {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.setPlaceholder = r0
            r0 = 0
            r3.picasso = r0
            com.squareup.picasso.Request$Builder r1 = new com.squareup.picasso.Request$Builder
            r2 = 0
            r1.<init>(r0, r2, r0)
            r3.data = r1
            return
    }

    RequestCreator(com.squareup.picasso.Picasso r2, android.net.Uri r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.setPlaceholder = r0
            boolean r0 = r2.shutdown
            if (r0 != 0) goto L16
            r1.picasso = r2
            com.squareup.picasso.Request$Builder r0 = new com.squareup.picasso.Request$Builder
            android.graphics.Bitmap$Config r2 = r2.defaultBitmapConfig
            r0.<init>(r3, r4, r2)
            r1.data = r0
            return
        L16:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Picasso instance already shut down. Cannot submit new requests."
            r2.<init>(r3)
            throw r2
    }

    private com.squareup.picasso.Request createRequest(long r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.squareup.picasso.RequestCreator.nextId
            int r0 = r0.getAndIncrement()
            com.squareup.picasso.Request$Builder r1 = r7.data
            com.squareup.picasso.Request r1 = r1.build()
            r1.f128id = r0
            r1.started = r8
            com.squareup.picasso.Picasso r2 = r7.picasso
            boolean r2 = r2.loggingEnabled
            java.lang.String r3 = "Main"
            if (r2 == 0) goto L25
            java.lang.String r4 = r1.plainId()
            java.lang.String r5 = r1.toString()
            java.lang.String r6 = "created"
            com.squareup.picasso.Utils.log(r3, r6, r4, r5)
        L25:
            com.squareup.picasso.Picasso r4 = r7.picasso
            com.squareup.picasso.Request r4 = r4.transformRequest(r1)
            if (r4 == r1) goto L4b
            r4.f128id = r0
            r4.started = r8
            if (r2 == 0) goto L4b
            java.lang.String r8 = r4.logId()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "into "
            r9.<init>(r0)
            java.lang.StringBuilder r9 = r9.append(r4)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "changed"
            com.squareup.picasso.Utils.log(r3, r0, r8, r9)
        L4b:
            return r4
    }

    private android.graphics.drawable.Drawable getPlaceholderDrawable() {
            r2 = this;
            int r0 = r2.placeholderResId
            if (r0 == 0) goto L13
            com.squareup.picasso.Picasso r0 = r2.picasso
            android.content.Context r0 = r0.context
            android.content.res.Resources r0 = r0.getResources()
            int r1 = r2.placeholderResId
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            return r0
        L13:
            android.graphics.drawable.Drawable r0 = r2.placeholderDrawable
            return r0
    }

    private void performRemoteViewInto(com.squareup.picasso.RemoteViewsAction r3) {
            r2 = this;
            int r0 = r2.memoryPolicy
            boolean r0 = com.squareup.picasso.MemoryPolicy.shouldReadFromMemoryCache(r0)
            if (r0 == 0) goto L1a
            com.squareup.picasso.Picasso r0 = r2.picasso
            java.lang.String r1 = r3.getKey()
            android.graphics.Bitmap r0 = r0.quickMemoryCacheCheck(r1)
            if (r0 == 0) goto L1a
            com.squareup.picasso.Picasso$LoadedFrom r1 = com.squareup.picasso.Picasso.LoadedFrom.MEMORY
            r3.complete(r0, r1)
            return
        L1a:
            int r0 = r2.placeholderResId
            if (r0 == 0) goto L21
            r3.setImageResource(r0)
        L21:
            com.squareup.picasso.Picasso r0 = r2.picasso
            r0.enqueueAndSubmit(r3)
            return
    }

    public com.squareup.picasso.RequestCreator centerCrop() {
            r1 = this;
            com.squareup.picasso.Request$Builder r0 = r1.data
            r0.centerCrop()
            return r1
    }

    public com.squareup.picasso.RequestCreator centerInside() {
            r1 = this;
            com.squareup.picasso.Request$Builder r0 = r1.data
            r0.centerInside()
            return r1
    }

    public com.squareup.picasso.RequestCreator config(android.graphics.Bitmap.Config r2) {
            r1 = this;
            com.squareup.picasso.Request$Builder r0 = r1.data
            r0.config(r2)
            return r1
    }

    public com.squareup.picasso.RequestCreator error(int r2) {
            r1 = this;
            if (r2 == 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.errorDrawable
            if (r0 != 0) goto L9
            r1.errorResId = r2
            return r1
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Error image already set."
            r2.<init>(r0)
            throw r2
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Error image resource invalid."
            r2.<init>(r0)
            throw r2
    }

    public com.squareup.picasso.RequestCreator error(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L11
            int r0 = r1.errorResId
            if (r0 != 0) goto L9
            r1.errorDrawable = r2
            return r1
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Error image already set."
            r2.<init>(r0)
            throw r2
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Error image may not be null."
            r2.<init>(r0)
            throw r2
    }

    public void fetch() {
            r1 = this;
            r0 = 0
            r1.fetch(r0)
            return
    }

    public void fetch(com.squareup.picasso.Callback r13) {
            r12 = this;
            long r0 = java.lang.System.nanoTime()
            boolean r2 = r12.deferred
            if (r2 != 0) goto L71
            com.squareup.picasso.Request$Builder r2 = r12.data
            boolean r2 = r2.hasImage()
            if (r2 == 0) goto L70
            com.squareup.picasso.Request$Builder r2 = r12.data
            boolean r2 = r2.hasPriority()
            if (r2 != 0) goto L1f
            com.squareup.picasso.Request$Builder r2 = r12.data
            com.squareup.picasso.Picasso$Priority r3 = com.squareup.picasso.Picasso.Priority.LOW
            r2.priority(r3)
        L1f:
            com.squareup.picasso.Request r6 = r12.createRequest(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = com.squareup.picasso.Utils.createKey(r6, r0)
            com.squareup.picasso.Picasso r0 = r12.picasso
            android.graphics.Bitmap r0 = r0.quickMemoryCacheCheck(r10)
            if (r0 == 0) goto L5c
            com.squareup.picasso.Picasso r0 = r12.picasso
            boolean r0 = r0.loggingEnabled
            if (r0 == 0) goto L56
            java.lang.String r0 = r6.plainId()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "from "
            r1.<init>(r2)
            com.squareup.picasso.Picasso$LoadedFrom r2 = com.squareup.picasso.Picasso.LoadedFrom.MEMORY
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Main"
            java.lang.String r3 = "completed"
            com.squareup.picasso.Utils.log(r2, r3, r0, r1)
        L56:
            if (r13 == 0) goto L70
            r13.onSuccess()
            goto L70
        L5c:
            com.squareup.picasso.FetchAction r0 = new com.squareup.picasso.FetchAction
            com.squareup.picasso.Picasso r5 = r12.picasso
            int r7 = r12.memoryPolicy
            int r8 = r12.networkPolicy
            java.lang.Object r9 = r12.tag
            r4 = r0
            r11 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            com.squareup.picasso.Picasso r13 = r12.picasso
            r13.submit(r0)
        L70:
            return
        L71:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fit cannot be used with fetch."
            r13.<init>(r0)
            throw r13
    }

    public com.squareup.picasso.RequestCreator fit() {
            r1 = this;
            r0 = 1
            r1.deferred = r0
            return r1
    }

    public android.graphics.Bitmap get() throws java.io.IOException {
            r8 = this;
            long r0 = java.lang.System.nanoTime()
            com.squareup.picasso.Utils.checkNotMain()
            boolean r2 = r8.deferred
            if (r2 != 0) goto L45
            com.squareup.picasso.Request$Builder r2 = r8.data
            boolean r2 = r2.hasImage()
            if (r2 != 0) goto L15
            r0 = 0
            return r0
        L15:
            com.squareup.picasso.Request r3 = r8.createRequest(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = com.squareup.picasso.Utils.createKey(r3, r0)
            com.squareup.picasso.GetAction r0 = new com.squareup.picasso.GetAction
            com.squareup.picasso.Picasso r2 = r8.picasso
            int r4 = r8.memoryPolicy
            int r5 = r8.networkPolicy
            java.lang.Object r6 = r8.tag
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.squareup.picasso.Picasso r1 = r8.picasso
            com.squareup.picasso.Dispatcher r2 = r1.dispatcher
            com.squareup.picasso.Picasso r3 = r8.picasso
            com.squareup.picasso.Cache r3 = r3.cache
            com.squareup.picasso.Picasso r4 = r8.picasso
            com.squareup.picasso.Stats r4 = r4.stats
            com.squareup.picasso.BitmapHunter r0 = com.squareup.picasso.BitmapHunter.forRequest(r1, r2, r3, r4, r0)
            android.graphics.Bitmap r0 = r0.hunt()
            return r0
        L45:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fit cannot be used with get."
            r0.<init>(r1)
            throw r0
    }

    public void into(android.widget.ImageView r2) {
            r1 = this;
            r0 = 0
            r1.into(r2, r0)
            return
    }

    public void into(android.widget.ImageView r16, com.squareup.picasso.Callback r17) {
            r15 = this;
            r0 = r15
            r3 = r16
            r11 = r17
            long r1 = java.lang.System.nanoTime()
            com.squareup.picasso.Utils.checkMain()
            if (r3 == 0) goto Lec
            com.squareup.picasso.Request$Builder r4 = r0.data
            boolean r4 = r4.hasImage()
            if (r4 != 0) goto L27
            com.squareup.picasso.Picasso r1 = r0.picasso
            r1.cancelRequest(r3)
            boolean r1 = r0.setPlaceholder
            if (r1 == 0) goto L26
            android.graphics.drawable.Drawable r1 = r15.getPlaceholderDrawable()
            com.squareup.picasso.PicassoDrawable.setPlaceholder(r3, r1)
        L26:
            return
        L27:
            boolean r4 = r0.deferred
            if (r4 == 0) goto L64
            com.squareup.picasso.Request$Builder r4 = r0.data
            boolean r4 = r4.hasSize()
            if (r4 != 0) goto L5c
            int r4 = r16.getWidth()
            int r5 = r16.getHeight()
            if (r4 == 0) goto L46
            if (r5 != 0) goto L40
            goto L46
        L40:
            com.squareup.picasso.Request$Builder r6 = r0.data
            r6.resize(r4, r5)
            goto L64
        L46:
            boolean r1 = r0.setPlaceholder
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = r15.getPlaceholderDrawable()
            com.squareup.picasso.PicassoDrawable.setPlaceholder(r3, r1)
        L51:
            com.squareup.picasso.Picasso r1 = r0.picasso
            com.squareup.picasso.DeferredRequestCreator r2 = new com.squareup.picasso.DeferredRequestCreator
            r2.<init>(r15, r3, r11)
            r1.defer(r3, r2)
            return
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Fit cannot be used with resize."
            r1.<init>(r2)
            throw r1
        L64:
            com.squareup.picasso.Request r7 = r15.createRequest(r1)
            java.lang.String r9 = com.squareup.picasso.Utils.createKey(r7)
            int r1 = r0.memoryPolicy
            boolean r1 = com.squareup.picasso.MemoryPolicy.shouldReadFromMemoryCache(r1)
            if (r1 == 0) goto Lbe
            com.squareup.picasso.Picasso r1 = r0.picasso
            android.graphics.Bitmap r4 = r1.quickMemoryCacheCheck(r9)
            if (r4 == 0) goto Lbe
            com.squareup.picasso.Picasso r1 = r0.picasso
            r1.cancelRequest(r3)
            com.squareup.picasso.Picasso r1 = r0.picasso
            android.content.Context r2 = r1.context
            com.squareup.picasso.Picasso$LoadedFrom r5 = com.squareup.picasso.Picasso.LoadedFrom.MEMORY
            boolean r6 = r0.noFade
            com.squareup.picasso.Picasso r1 = r0.picasso
            boolean r8 = r1.indicatorsEnabled
            r1 = r16
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            com.squareup.picasso.PicassoDrawable.setBitmap(r1, r2, r3, r4, r5, r6)
            com.squareup.picasso.Picasso r1 = r0.picasso
            boolean r1 = r1.loggingEnabled
            if (r1 == 0) goto Lb8
            java.lang.String r1 = r7.plainId()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "from "
            r2.<init>(r3)
            com.squareup.picasso.Picasso$LoadedFrom r3 = com.squareup.picasso.Picasso.LoadedFrom.MEMORY
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Main"
            java.lang.String r4 = "completed"
            com.squareup.picasso.Utils.log(r3, r4, r1, r2)
        Lb8:
            if (r11 == 0) goto Lbd
            r17.onSuccess()
        Lbd:
            return
        Lbe:
            boolean r1 = r0.setPlaceholder
            if (r1 == 0) goto Lc9
            android.graphics.drawable.Drawable r1 = r15.getPlaceholderDrawable()
            com.squareup.picasso.PicassoDrawable.setPlaceholder(r3, r1)
        Lc9:
            com.squareup.picasso.ImageViewAction r13 = new com.squareup.picasso.ImageViewAction
            com.squareup.picasso.Picasso r2 = r0.picasso
            int r5 = r0.memoryPolicy
            int r6 = r0.networkPolicy
            int r8 = r0.errorResId
            android.graphics.drawable.Drawable r10 = r0.errorDrawable
            java.lang.Object r12 = r0.tag
            boolean r14 = r0.noFade
            r1 = r13
            r3 = r16
            r4 = r7
            r7 = r8
            r8 = r10
            r10 = r12
            r11 = r17
            r12 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.squareup.picasso.Picasso r1 = r0.picasso
            r1.enqueueAndSubmit(r13)
            return
        Lec:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Target must not be null."
            r1.<init>(r2)
            throw r1
    }

    public void into(android.widget.RemoteViews r16, int r17, int r18, android.app.Notification r19) {
            r15 = this;
            r0 = r15
            long r1 = java.lang.System.nanoTime()
            if (r16 == 0) goto L5a
            if (r19 == 0) goto L52
            boolean r3 = r0.deferred
            if (r3 != 0) goto L4a
            android.graphics.drawable.Drawable r3 = r0.placeholderDrawable
            if (r3 != 0) goto L42
            int r3 = r0.placeholderResId
            if (r3 != 0) goto L42
            android.graphics.drawable.Drawable r3 = r0.errorDrawable
            if (r3 != 0) goto L42
            com.squareup.picasso.Request r5 = r15.createRequest(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r12 = com.squareup.picasso.Utils.createKey(r5, r1)
            com.squareup.picasso.RemoteViewsAction$NotificationAction r1 = new com.squareup.picasso.RemoteViewsAction$NotificationAction
            com.squareup.picasso.Picasso r4 = r0.picasso
            int r10 = r0.memoryPolicy
            int r11 = r0.networkPolicy
            java.lang.Object r13 = r0.tag
            int r14 = r0.errorResId
            r3 = r1
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.performRemoteViewInto(r1)
            return
        L42:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Cannot use placeholder or error drawables with remote views."
            r1.<init>(r2)
            throw r1
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Fit cannot be used with RemoteViews."
            r1.<init>(r2)
            throw r1
        L52:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Notification must not be null."
            r1.<init>(r2)
            throw r1
        L5a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "RemoteViews must not be null."
            r1.<init>(r2)
            throw r1
    }

    public void into(android.widget.RemoteViews r15, int r16, int[] r17) {
            r14 = this;
            r0 = r14
            long r1 = java.lang.System.nanoTime()
            if (r15 == 0) goto L57
            if (r17 == 0) goto L4f
            boolean r3 = r0.deferred
            if (r3 != 0) goto L47
            android.graphics.drawable.Drawable r3 = r0.placeholderDrawable
            if (r3 != 0) goto L3f
            int r3 = r0.placeholderResId
            if (r3 != 0) goto L3f
            android.graphics.drawable.Drawable r3 = r0.errorDrawable
            if (r3 != 0) goto L3f
            com.squareup.picasso.Request r5 = r14.createRequest(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r11 = com.squareup.picasso.Utils.createKey(r5, r1)
            com.squareup.picasso.RemoteViewsAction$AppWidgetAction r1 = new com.squareup.picasso.RemoteViewsAction$AppWidgetAction
            com.squareup.picasso.Picasso r4 = r0.picasso
            int r9 = r0.memoryPolicy
            int r10 = r0.networkPolicy
            java.lang.Object r12 = r0.tag
            int r13 = r0.errorResId
            r3 = r1
            r6 = r15
            r7 = r16
            r8 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.performRemoteViewInto(r1)
            return
        L3f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Cannot use placeholder or error drawables with remote views."
            r1.<init>(r2)
            throw r1
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Fit cannot be used with remote views."
            r1.<init>(r2)
            throw r1
        L4f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "appWidgetIds must not be null."
            r1.<init>(r2)
            throw r1
        L57:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "remoteViews must not be null."
            r1.<init>(r2)
            throw r1
    }

    public void into(com.squareup.picasso.Target r15) {
            r14 = this;
            long r0 = java.lang.System.nanoTime()
            com.squareup.picasso.Utils.checkMain()
            if (r15 == 0) goto L76
            boolean r2 = r14.deferred
            if (r2 != 0) goto L6e
            com.squareup.picasso.Request$Builder r2 = r14.data
            boolean r2 = r2.hasImage()
            r3 = 0
            if (r2 != 0) goto L27
            com.squareup.picasso.Picasso r0 = r14.picasso
            r0.cancelRequest(r15)
            boolean r0 = r14.setPlaceholder
            if (r0 == 0) goto L23
            android.graphics.drawable.Drawable r3 = r14.getPlaceholderDrawable()
        L23:
            r15.onPrepareLoad(r3)
            return
        L27:
            com.squareup.picasso.Request r7 = r14.createRequest(r0)
            java.lang.String r11 = com.squareup.picasso.Utils.createKey(r7)
            int r0 = r14.memoryPolicy
            boolean r0 = com.squareup.picasso.MemoryPolicy.shouldReadFromMemoryCache(r0)
            if (r0 == 0) goto L4a
            com.squareup.picasso.Picasso r0 = r14.picasso
            android.graphics.Bitmap r0 = r0.quickMemoryCacheCheck(r11)
            if (r0 == 0) goto L4a
            com.squareup.picasso.Picasso r1 = r14.picasso
            r1.cancelRequest(r15)
            com.squareup.picasso.Picasso$LoadedFrom r1 = com.squareup.picasso.Picasso.LoadedFrom.MEMORY
            r15.onBitmapLoaded(r0, r1)
            return
        L4a:
            boolean r0 = r14.setPlaceholder
            if (r0 == 0) goto L52
            android.graphics.drawable.Drawable r3 = r14.getPlaceholderDrawable()
        L52:
            r15.onPrepareLoad(r3)
            com.squareup.picasso.TargetAction r0 = new com.squareup.picasso.TargetAction
            com.squareup.picasso.Picasso r5 = r14.picasso
            int r8 = r14.memoryPolicy
            int r9 = r14.networkPolicy
            android.graphics.drawable.Drawable r10 = r14.errorDrawable
            java.lang.Object r12 = r14.tag
            int r13 = r14.errorResId
            r4 = r0
            r6 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.squareup.picasso.Picasso r15 = r14.picasso
            r15.enqueueAndSubmit(r0)
            return
        L6e:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fit cannot be used with a Target."
            r15.<init>(r0)
            throw r15
        L76:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Target must not be null."
            r15.<init>(r0)
            throw r15
    }

    public com.squareup.picasso.RequestCreator memoryPolicy(com.squareup.picasso.MemoryPolicy r5, com.squareup.picasso.MemoryPolicy... r6) {
            r4 = this;
            java.lang.String r0 = "Memory policy cannot be null."
            if (r5 == 0) goto L2f
            int r1 = r4.memoryPolicy
            int r5 = r5.index
            r5 = r5 | r1
            r4.memoryPolicy = r5
            if (r6 == 0) goto L29
            int r5 = r6.length
            if (r5 <= 0) goto L28
            int r5 = r6.length
            r1 = 0
        L12:
            if (r1 >= r5) goto L28
            r2 = r6[r1]
            if (r2 == 0) goto L22
            int r3 = r4.memoryPolicy
            int r2 = r2.index
            r2 = r2 | r3
            r4.memoryPolicy = r2
            int r1 = r1 + 1
            goto L12
        L22:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r0)
            throw r5
        L28:
            return r4
        L29:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r0)
            throw r5
        L2f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r0)
            throw r5
    }

    public com.squareup.picasso.RequestCreator networkPolicy(com.squareup.picasso.NetworkPolicy r5, com.squareup.picasso.NetworkPolicy... r6) {
            r4 = this;
            java.lang.String r0 = "Network policy cannot be null."
            if (r5 == 0) goto L2f
            int r1 = r4.networkPolicy
            int r5 = r5.index
            r5 = r5 | r1
            r4.networkPolicy = r5
            if (r6 == 0) goto L29
            int r5 = r6.length
            if (r5 <= 0) goto L28
            int r5 = r6.length
            r1 = 0
        L12:
            if (r1 >= r5) goto L28
            r2 = r6[r1]
            if (r2 == 0) goto L22
            int r3 = r4.networkPolicy
            int r2 = r2.index
            r2 = r2 | r3
            r4.networkPolicy = r2
            int r1 = r1 + 1
            goto L12
        L22:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r0)
            throw r5
        L28:
            return r4
        L29:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r0)
            throw r5
        L2f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r0)
            throw r5
    }

    public com.squareup.picasso.RequestCreator noFade() {
            r1 = this;
            r0 = 1
            r1.noFade = r0
            return r1
    }

    public com.squareup.picasso.RequestCreator noPlaceholder() {
            r2 = this;
            int r0 = r2.placeholderResId
            if (r0 != 0) goto L14
            android.graphics.drawable.Drawable r0 = r2.placeholderDrawable
            if (r0 != 0) goto Lc
            r0 = 0
            r2.setPlaceholder = r0
            return r2
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Placeholder image already set."
            r0.<init>(r1)
            throw r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Placeholder resource already set."
            r0.<init>(r1)
            throw r0
    }

    public com.squareup.picasso.RequestCreator onlyScaleDown() {
            r1 = this;
            com.squareup.picasso.Request$Builder r0 = r1.data
            r0.onlyScaleDown()
            return r1
    }

    public com.squareup.picasso.RequestCreator placeholder(int r2) {
            r1 = this;
            boolean r0 = r1.setPlaceholder
            if (r0 == 0) goto L1d
            if (r2 == 0) goto L15
            android.graphics.drawable.Drawable r0 = r1.placeholderDrawable
            if (r0 != 0) goto Ld
            r1.placeholderResId = r2
            return r1
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Placeholder image already set."
            r2.<init>(r0)
            throw r2
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Placeholder image resource invalid."
            r2.<init>(r0)
            throw r2
        L1d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already explicitly declared as no placeholder."
            r2.<init>(r0)
            throw r2
    }

    public com.squareup.picasso.RequestCreator placeholder(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = r1.setPlaceholder
            if (r0 == 0) goto L13
            int r0 = r1.placeholderResId
            if (r0 != 0) goto Lb
            r1.placeholderDrawable = r2
            return r1
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Placeholder image already set."
            r2.<init>(r0)
            throw r2
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already explicitly declared as no placeholder."
            r2.<init>(r0)
            throw r2
    }

    public com.squareup.picasso.RequestCreator priority(com.squareup.picasso.Picasso.Priority r2) {
            r1 = this;
            com.squareup.picasso.Request$Builder r0 = r1.data
            r0.priority(r2)
            return r1
    }

    public com.squareup.picasso.RequestCreator resize(int r2, int r3) {
            r1 = this;
            com.squareup.picasso.Request$Builder r0 = r1.data
            r0.resize(r2, r3)
            return r1
    }

    public com.squareup.picasso.RequestCreator resizeDimen(int r2, int r3) {
            r1 = this;
            com.squareup.picasso.Picasso r0 = r1.picasso
            android.content.Context r0 = r0.context
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            int r3 = r0.getDimensionPixelSize(r3)
            com.squareup.picasso.RequestCreator r2 = r1.resize(r2, r3)
            return r2
    }

    public com.squareup.picasso.RequestCreator rotate(float r2) {
            r1 = this;
            com.squareup.picasso.Request$Builder r0 = r1.data
            r0.rotate(r2)
            return r1
    }

    public com.squareup.picasso.RequestCreator rotate(float r2, float r3, float r4) {
            r1 = this;
            com.squareup.picasso.Request$Builder r0 = r1.data
            r0.rotate(r2, r3, r4)
            return r1
    }

    @java.lang.Deprecated
    public com.squareup.picasso.RequestCreator skipMemoryCache() {
            r4 = this;
            com.squareup.picasso.MemoryPolicy r0 = com.squareup.picasso.MemoryPolicy.NO_CACHE
            r1 = 1
            com.squareup.picasso.MemoryPolicy[] r1 = new com.squareup.picasso.MemoryPolicy[r1]
            r2 = 0
            com.squareup.picasso.MemoryPolicy r3 = com.squareup.picasso.MemoryPolicy.NO_STORE
            r1[r2] = r3
            com.squareup.picasso.RequestCreator r0 = r4.memoryPolicy(r0, r1)
            return r0
    }

    public com.squareup.picasso.RequestCreator stableKey(java.lang.String r2) {
            r1 = this;
            com.squareup.picasso.Request$Builder r0 = r1.data
            r0.stableKey(r2)
            return r1
    }

    public com.squareup.picasso.RequestCreator tag(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L11
            java.lang.Object r0 = r1.tag
            if (r0 != 0) goto L9
            r1.tag = r2
            return r1
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Tag already set."
            r2.<init>(r0)
            throw r2
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Tag invalid."
            r2.<init>(r0)
            throw r2
    }

    public com.squareup.picasso.RequestCreator transform(com.squareup.picasso.Transformation r2) {
            r1 = this;
            com.squareup.picasso.Request$Builder r0 = r1.data
            r0.transform(r2)
            return r1
    }

    public com.squareup.picasso.RequestCreator transform(java.util.List<? extends com.squareup.picasso.Transformation> r2) {
            r1 = this;
            com.squareup.picasso.Request$Builder r0 = r1.data
            r0.transform(r2)
            return r1
    }

    com.squareup.picasso.RequestCreator unfit() {
            r1 = this;
            r0 = 0
            r1.deferred = r0
            return r1
    }
}
