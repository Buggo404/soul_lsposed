package com.squareup.picasso;

/* loaded from: classes.dex */
public class LruCache implements com.squareup.picasso.Cache {
    private int evictionCount;
    private int hitCount;
    final java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> map;
    private final int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 <= 0) goto L13
            r3.maxSize = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r0 = 1061158912(0x3f400000, float:0.75)
            r1 = 1
            r2 = 0
            r4.<init>(r2, r0, r1)
            r3.map = r4
            return
        L13:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Max size must be positive."
            r4.<init>(r0)
            throw r4
    }

    public LruCache(android.content.Context r1) {
            r0 = this;
            int r1 = com.squareup.picasso.Utils.calculateMemoryCacheSize(r1)
            r0.<init>(r1)
            return
    }

    private void trimToSize(int r4) {
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.size     // Catch: java.lang.Throwable -> L73
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.map     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L11
            int r0 = r3.size     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L52
        L11:
            int r0 = r3.size     // Catch: java.lang.Throwable -> L73
            if (r0 <= r4) goto L50
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.map     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.map     // Catch: java.lang.Throwable -> L73
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L73
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L73
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L73
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L73
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L73
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.map     // Catch: java.lang.Throwable -> L73
            r2.remove(r1)     // Catch: java.lang.Throwable -> L73
            int r1 = r3.size     // Catch: java.lang.Throwable -> L73
            int r0 = com.squareup.picasso.Utils.getBitmapBytes(r0)     // Catch: java.lang.Throwable -> L73
            int r1 = r1 - r0
            r3.size = r1     // Catch: java.lang.Throwable -> L73
            int r0 = r3.evictionCount     // Catch: java.lang.Throwable -> L73
            int r0 = r0 + 1
            r3.evictionCount = r0     // Catch: java.lang.Throwable -> L73
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L73
            goto L0
        L50:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L73
            return
        L52:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r0.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L73
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L73
            throw r4     // Catch: java.lang.Throwable -> L73
        L73:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L73
            throw r4
    }

    @Override // com.squareup.picasso.Cache
    public final synchronized void clear() {
            r1 = this;
            monitor-enter(r1)
            r1.evictAll()     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.squareup.picasso.Cache
    public final synchronized void clearKeyUri(java.lang.String r8) {
            r7 = this;
            monitor-enter(r7)
            int r0 = r8.length()     // Catch: java.lang.Throwable -> L52
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r1 = r7.map     // Catch: java.lang.Throwable -> L52
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L52
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L52
            r2 = 0
            r3 = r2
        L11:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L49
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L52
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L52
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L52
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L52
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch: java.lang.Throwable -> L52
            r6 = 10
            int r6 = r5.indexOf(r6)     // Catch: java.lang.Throwable -> L52
            if (r6 != r0) goto L11
            java.lang.String r5 = r5.substring(r2, r6)     // Catch: java.lang.Throwable -> L52
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L11
            r1.remove()     // Catch: java.lang.Throwable -> L52
            int r3 = r7.size     // Catch: java.lang.Throwable -> L52
            int r4 = com.squareup.picasso.Utils.getBitmapBytes(r4)     // Catch: java.lang.Throwable -> L52
            int r3 = r3 - r4
            r7.size = r3     // Catch: java.lang.Throwable -> L52
            r3 = 1
            goto L11
        L49:
            if (r3 == 0) goto L50
            int r8 = r7.maxSize     // Catch: java.lang.Throwable -> L52
            r7.trimToSize(r8)     // Catch: java.lang.Throwable -> L52
        L50:
            monitor-exit(r7)
            return
        L52:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    public final void evictAll() {
            r1 = this;
            r0 = -1
            r1.trimToSize(r0)
            return
    }

    public final synchronized int evictionCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.evictionCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.squareup.picasso.Cache
    public android.graphics.Bitmap get(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L21
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r1.map     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L1e
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L15
            int r0 = r1.hitCount     // Catch: java.lang.Throwable -> L1e
            int r0 = r0 + 1
            r1.hitCount = r0     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            return r2
        L15:
            int r2 = r1.missCount     // Catch: java.lang.Throwable -> L1e
            int r2 = r2 + 1
            r1.missCount = r2     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            return r2
        L1e:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r2
        L21:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r2.<init>(r0)
            throw r2
    }

    public final synchronized int hitCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.hitCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.squareup.picasso.Cache
    public final synchronized int maxSize() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.maxSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized int missCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.missCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized int putCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.putCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.squareup.picasso.Cache
    public void set(java.lang.String r3, android.graphics.Bitmap r4) {
            r2 = this;
            if (r3 == 0) goto L31
            if (r4 == 0) goto L31
            monitor-enter(r2)
            int r0 = r2.putCount     // Catch: java.lang.Throwable -> L2e
            int r0 = r0 + 1
            r2.putCount = r0     // Catch: java.lang.Throwable -> L2e
            int r0 = r2.size     // Catch: java.lang.Throwable -> L2e
            int r1 = com.squareup.picasso.Utils.getBitmapBytes(r4)     // Catch: java.lang.Throwable -> L2e
            int r0 = r0 + r1
            r2.size = r0     // Catch: java.lang.Throwable -> L2e
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r2.map     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r3 = r0.put(r3, r4)     // Catch: java.lang.Throwable -> L2e
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L27
            int r4 = r2.size     // Catch: java.lang.Throwable -> L2e
            int r3 = com.squareup.picasso.Utils.getBitmapBytes(r3)     // Catch: java.lang.Throwable -> L2e
            int r4 = r4 - r3
            r2.size = r4     // Catch: java.lang.Throwable -> L2e
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            int r3 = r2.maxSize
            r2.trimToSize(r3)
            return
        L2e:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r3
        L31:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "key == null || bitmap == null"
            r3.<init>(r4)
            throw r3
    }

    @Override // com.squareup.picasso.Cache
    public final synchronized int size() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.size     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
