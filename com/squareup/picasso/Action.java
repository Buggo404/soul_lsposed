package com.squareup.picasso;

/* loaded from: classes.dex */
abstract class Action<T> {
    boolean cancelled;
    final android.graphics.drawable.Drawable errorDrawable;
    final int errorResId;
    final java.lang.String key;
    final int memoryPolicy;
    final int networkPolicy;
    final boolean noFade;
    final com.squareup.picasso.Picasso picasso;
    final com.squareup.picasso.Request request;
    final java.lang.Object tag;
    final java.lang.ref.WeakReference<T> target;
    boolean willReplay;

    static class RequestWeakReference<M> extends java.lang.ref.WeakReference<M> {
        final com.squareup.picasso.Action action;

        public RequestWeakReference(com.squareup.picasso.Action r1, M r2, java.lang.ref.ReferenceQueue<? super M> r3) {
                r0 = this;
                r0.<init>(r2, r3)
                r0.action = r1
                return
        }
    }

    Action(com.squareup.picasso.Picasso r1, T r2, com.squareup.picasso.Request r3, int r4, int r5, int r6, android.graphics.drawable.Drawable r7, java.lang.String r8, java.lang.Object r9, boolean r10) {
            r0 = this;
            r0.<init>()
            r0.picasso = r1
            r0.request = r3
            if (r2 != 0) goto Lb
            r1 = 0
            goto L13
        Lb:
            com.squareup.picasso.Action$RequestWeakReference r3 = new com.squareup.picasso.Action$RequestWeakReference
            java.lang.ref.ReferenceQueue<java.lang.Object> r1 = r1.referenceQueue
            r3.<init>(r0, r2, r1)
            r1 = r3
        L13:
            r0.target = r1
            r0.memoryPolicy = r4
            r0.networkPolicy = r5
            r0.noFade = r10
            r0.errorResId = r6
            r0.errorDrawable = r7
            r0.key = r8
            if (r9 == 0) goto L24
            goto L25
        L24:
            r9 = r0
        L25:
            r0.tag = r9
            return
    }

    void cancel() {
            r1 = this;
            r0 = 1
            r1.cancelled = r0
            return
    }

    abstract void complete(android.graphics.Bitmap r1, com.squareup.picasso.Picasso.LoadedFrom r2);

    abstract void error();

    java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    int getMemoryPolicy() {
            r1 = this;
            int r0 = r1.memoryPolicy
            return r0
    }

    int getNetworkPolicy() {
            r1 = this;
            int r0 = r1.networkPolicy
            return r0
    }

    com.squareup.picasso.Picasso getPicasso() {
            r1 = this;
            com.squareup.picasso.Picasso r0 = r1.picasso
            return r0
    }

    com.squareup.picasso.Picasso.Priority getPriority() {
            r1 = this;
            com.squareup.picasso.Request r0 = r1.request
            com.squareup.picasso.Picasso$Priority r0 = r0.priority
            return r0
    }

    com.squareup.picasso.Request getRequest() {
            r1 = this;
            com.squareup.picasso.Request r0 = r1.request
            return r0
    }

    java.lang.Object getTag() {
            r1 = this;
            java.lang.Object r0 = r1.tag
            return r0
    }

    T getTarget() {
            r1 = this;
            java.lang.ref.WeakReference<T> r0 = r1.target
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.Object r0 = r0.get()
        La:
            return r0
    }

    boolean isCancelled() {
            r1 = this;
            boolean r0 = r1.cancelled
            return r0
    }

    boolean willReplay() {
            r1 = this;
            boolean r0 = r1.willReplay
            return r0
    }
}
