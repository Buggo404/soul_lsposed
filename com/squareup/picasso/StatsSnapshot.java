package com.squareup.picasso;

/* loaded from: classes.dex */
public class StatsSnapshot {
    public final long averageDownloadSize;
    public final long averageOriginalBitmapSize;
    public final long averageTransformedBitmapSize;
    public final long cacheHits;
    public final long cacheMisses;
    public final int downloadCount;
    public final int maxSize;
    public final int originalBitmapCount;
    public final int size;
    public final long timeStamp;
    public final long totalDownloadSize;
    public final long totalOriginalBitmapSize;
    public final long totalTransformedBitmapSize;
    public final int transformedBitmapCount;

    public StatsSnapshot(int r4, int r5, long r6, long r8, long r10, long r12, long r14, long r16, long r18, long r20, int r22, int r23, int r24, long r25) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.maxSize = r1
            r1 = r5
            r0.size = r1
            r1 = r6
            r0.cacheHits = r1
            r1 = r8
            r0.cacheMisses = r1
            r1 = r10
            r0.totalDownloadSize = r1
            r1 = r12
            r0.totalOriginalBitmapSize = r1
            r1 = r14
            r0.totalTransformedBitmapSize = r1
            r1 = r16
            r0.averageDownloadSize = r1
            r1 = r18
            r0.averageOriginalBitmapSize = r1
            r1 = r20
            r0.averageTransformedBitmapSize = r1
            r1 = r22
            r0.downloadCount = r1
            r1 = r23
            r0.originalBitmapCount = r1
            r1 = r24
            r0.transformedBitmapCount = r1
            r1 = r25
            r0.timeStamp = r1
            return
    }

    public void dump() {
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r2.dump(r1)
            java.lang.String r1 = "Picasso"
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r1, r0)
            return
    }

    public void dump(java.io.PrintWriter r3) {
            r2 = this;
            java.lang.String r0 = "===============BEGIN PICASSO STATS ==============="
            r3.println(r0)
            java.lang.String r0 = "Memory Cache Stats"
            r3.println(r0)
            java.lang.String r0 = "  Max Cache Size: "
            r3.print(r0)
            int r0 = r2.maxSize
            r3.println(r0)
            java.lang.String r0 = "  Cache Size: "
            r3.print(r0)
            int r0 = r2.size
            r3.println(r0)
            java.lang.String r0 = "  Cache % Full: "
            r3.print(r0)
            int r0 = r2.size
            float r0 = (float) r0
            int r1 = r2.maxSize
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r3.println(r0)
            java.lang.String r0 = "  Cache Hits: "
            r3.print(r0)
            long r0 = r2.cacheHits
            r3.println(r0)
            java.lang.String r0 = "  Cache Misses: "
            r3.print(r0)
            long r0 = r2.cacheMisses
            r3.println(r0)
            java.lang.String r0 = "Network Stats"
            r3.println(r0)
            java.lang.String r0 = "  Download Count: "
            r3.print(r0)
            int r0 = r2.downloadCount
            r3.println(r0)
            java.lang.String r0 = "  Total Download Size: "
            r3.print(r0)
            long r0 = r2.totalDownloadSize
            r3.println(r0)
            java.lang.String r0 = "  Average Download Size: "
            r3.print(r0)
            long r0 = r2.averageDownloadSize
            r3.println(r0)
            java.lang.String r0 = "Bitmap Stats"
            r3.println(r0)
            java.lang.String r0 = "  Total Bitmaps Decoded: "
            r3.print(r0)
            int r0 = r2.originalBitmapCount
            r3.println(r0)
            java.lang.String r0 = "  Total Bitmap Size: "
            r3.print(r0)
            long r0 = r2.totalOriginalBitmapSize
            r3.println(r0)
            java.lang.String r0 = "  Total Transformed Bitmaps: "
            r3.print(r0)
            int r0 = r2.transformedBitmapCount
            r3.println(r0)
            java.lang.String r0 = "  Total Transformed Bitmap Size: "
            r3.print(r0)
            long r0 = r2.totalTransformedBitmapSize
            r3.println(r0)
            java.lang.String r0 = "  Average Bitmap Size: "
            r3.print(r0)
            long r0 = r2.averageOriginalBitmapSize
            r3.println(r0)
            java.lang.String r0 = "  Average Transformed Bitmap Size: "
            r3.print(r0)
            long r0 = r2.averageTransformedBitmapSize
            r3.println(r0)
            java.lang.String r0 = "===============END PICASSO STATS ==============="
            r3.println(r0)
            r3.flush()
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StatsSnapshot{maxSize="
            r0.<init>(r1)
            int r1 = r3.maxSize
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", size="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.size
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", cacheHits="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.cacheHits
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", cacheMisses="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.cacheMisses
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", downloadCount="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.downloadCount
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", totalDownloadSize="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.totalDownloadSize
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", averageDownloadSize="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.averageDownloadSize
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", totalOriginalBitmapSize="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.totalOriginalBitmapSize
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", totalTransformedBitmapSize="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.totalTransformedBitmapSize
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", averageOriginalBitmapSize="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.averageOriginalBitmapSize
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", averageTransformedBitmapSize="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.averageTransformedBitmapSize
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", originalBitmapCount="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.originalBitmapCount
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", transformedBitmapCount="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.transformedBitmapCount
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", timeStamp="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.timeStamp
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
