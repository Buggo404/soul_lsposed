package com.squareup.picasso;

/* loaded from: classes.dex */
class Stats {
    private static final int BITMAP_DECODE_FINISHED = 2;
    private static final int BITMAP_TRANSFORMED_FINISHED = 3;
    private static final int CACHE_HIT = 0;
    private static final int CACHE_MISS = 1;
    private static final int DOWNLOAD_FINISHED = 4;
    private static final java.lang.String STATS_THREAD_NAME = "Picasso-Stats";
    long averageDownloadSize;
    long averageOriginalBitmapSize;
    long averageTransformedBitmapSize;
    final com.squareup.picasso.Cache cache;
    long cacheHits;
    long cacheMisses;
    int downloadCount;
    final android.os.Handler handler;
    int originalBitmapCount;
    final android.os.HandlerThread statsThread;
    long totalDownloadSize;
    long totalOriginalBitmapSize;
    long totalTransformedBitmapSize;
    int transformedBitmapCount;

    private static class StatsHandler extends android.os.Handler {
        private final com.squareup.picasso.Stats stats;


        public StatsHandler(android.os.Looper r1, com.squareup.picasso.Stats r2) {
                r0 = this;
                r0.<init>(r1)
                r0.stats = r2
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                if (r0 == 0) goto L3d
                r1 = 1
                if (r0 == r1) goto L37
                r1 = 2
                if (r0 == r1) goto L2e
                r1 = 3
                if (r0 == r1) goto L25
                r1 = 4
                if (r0 == r1) goto L1b
                android.os.Handler r0 = com.squareup.picasso.Picasso.HANDLER
                com.squareup.picasso.Stats$StatsHandler$1 r1 = new com.squareup.picasso.Stats$StatsHandler$1
                r1.<init>(r3, r4)
                r0.post(r1)
                goto L42
            L1b:
                com.squareup.picasso.Stats r0 = r3.stats
                java.lang.Object r4 = r4.obj
                java.lang.Long r4 = (java.lang.Long) r4
                r0.performDownloadFinished(r4)
                goto L42
            L25:
                com.squareup.picasso.Stats r0 = r3.stats
                int r4 = r4.arg1
                long r1 = (long) r4
                r0.performBitmapTransformed(r1)
                goto L42
            L2e:
                com.squareup.picasso.Stats r0 = r3.stats
                int r4 = r4.arg1
                long r1 = (long) r4
                r0.performBitmapDecoded(r1)
                goto L42
            L37:
                com.squareup.picasso.Stats r4 = r3.stats
                r4.performCacheMiss()
                goto L42
            L3d:
                com.squareup.picasso.Stats r4 = r3.stats
                r4.performCacheHit()
            L42:
                return
        }
    }

    Stats(com.squareup.picasso.Cache r3) {
            r2 = this;
            r2.<init>()
            r2.cache = r3
            android.os.HandlerThread r3 = new android.os.HandlerThread
            java.lang.String r0 = "Picasso-Stats"
            r1 = 10
            r3.<init>(r0, r1)
            r2.statsThread = r3
            r3.start()
            android.os.Looper r0 = r3.getLooper()
            com.squareup.picasso.Utils.flushStackLocalLeaks(r0)
            com.squareup.picasso.Stats$StatsHandler r0 = new com.squareup.picasso.Stats$StatsHandler
            android.os.Looper r3 = r3.getLooper()
            r0.<init>(r3, r2)
            r2.handler = r0
            return
    }

    private static long getAverage(int r2, long r3) {
            long r0 = (long) r2
            long r3 = r3 / r0
            return r3
    }

    private void processBitmap(android.graphics.Bitmap r3, int r4) {
            r2 = this;
            int r3 = com.squareup.picasso.Utils.getBitmapBytes(r3)
            android.os.Handler r0 = r2.handler
            r1 = 0
            android.os.Message r3 = r0.obtainMessage(r4, r3, r1)
            r0.sendMessage(r3)
            return
    }

    com.squareup.picasso.StatsSnapshot createSnapshot() {
            r28 = this;
            r0 = r28
            com.squareup.picasso.StatsSnapshot r25 = new com.squareup.picasso.StatsSnapshot
            r1 = r25
            com.squareup.picasso.Cache r2 = r0.cache
            int r2 = r2.maxSize()
            com.squareup.picasso.Cache r3 = r0.cache
            int r3 = r3.size()
            long r4 = r0.cacheHits
            long r6 = r0.cacheMisses
            long r8 = r0.totalDownloadSize
            long r10 = r0.totalOriginalBitmapSize
            long r12 = r0.totalTransformedBitmapSize
            long r14 = r0.averageDownloadSize
            r26 = r1
            r27 = r2
            long r1 = r0.averageOriginalBitmapSize
            r16 = r1
            long r1 = r0.averageTransformedBitmapSize
            r18 = r1
            int r1 = r0.downloadCount
            r20 = r1
            int r1 = r0.originalBitmapCount
            r21 = r1
            int r1 = r0.transformedBitmapCount
            r22 = r1
            long r23 = java.lang.System.currentTimeMillis()
            r1 = r26
            r2 = r27
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r16, r18, r20, r21, r22, r23)
            return r25
    }

    void dispatchBitmapDecoded(android.graphics.Bitmap r2) {
            r1 = this;
            r0 = 2
            r1.processBitmap(r2, r0)
            return
    }

    void dispatchBitmapTransformed(android.graphics.Bitmap r2) {
            r1 = this;
            r0 = 3
            r1.processBitmap(r2, r0)
            return
    }

    void dispatchCacheHit() {
            r2 = this;
            android.os.Handler r0 = r2.handler
            r1 = 0
            r0.sendEmptyMessage(r1)
            return
    }

    void dispatchCacheMiss() {
            r2 = this;
            android.os.Handler r0 = r2.handler
            r1 = 1
            r0.sendEmptyMessage(r1)
            return
    }

    void dispatchDownloadFinished(long r3) {
            r2 = this;
            android.os.Handler r0 = r2.handler
            r1 = 4
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
            return
    }

    void performBitmapDecoded(long r4) {
            r3 = this;
            int r0 = r3.originalBitmapCount
            int r0 = r0 + 1
            r3.originalBitmapCount = r0
            long r1 = r3.totalOriginalBitmapSize
            long r1 = r1 + r4
            r3.totalOriginalBitmapSize = r1
            long r4 = getAverage(r0, r1)
            r3.averageOriginalBitmapSize = r4
            return
    }

    void performBitmapTransformed(long r3) {
            r2 = this;
            int r0 = r2.transformedBitmapCount
            int r0 = r0 + 1
            r2.transformedBitmapCount = r0
            long r0 = r2.totalTransformedBitmapSize
            long r0 = r0 + r3
            r2.totalTransformedBitmapSize = r0
            int r3 = r2.originalBitmapCount
            long r3 = getAverage(r3, r0)
            r2.averageTransformedBitmapSize = r3
            return
    }

    void performCacheHit() {
            r4 = this;
            long r0 = r4.cacheHits
            r2 = 1
            long r0 = r0 + r2
            r4.cacheHits = r0
            return
    }

    void performCacheMiss() {
            r4 = this;
            long r0 = r4.cacheMisses
            r2 = 1
            long r0 = r0 + r2
            r4.cacheMisses = r0
            return
    }

    void performDownloadFinished(java.lang.Long r5) {
            r4 = this;
            int r0 = r4.downloadCount
            int r0 = r0 + 1
            r4.downloadCount = r0
            long r0 = r4.totalDownloadSize
            long r2 = r5.longValue()
            long r0 = r0 + r2
            r4.totalDownloadSize = r0
            int r5 = r4.downloadCount
            long r0 = getAverage(r5, r0)
            r4.averageDownloadSize = r0
            return
    }

    void shutdown() {
            r1 = this;
            android.os.HandlerThread r0 = r1.statsThread
            r0.quit()
            return
    }
}
