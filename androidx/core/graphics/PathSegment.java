package androidx.core.graphics;

/* loaded from: classes.dex */
public final class PathSegment {
    private final android.graphics.PointF mEnd;
    private final float mEndFraction;
    private final android.graphics.PointF mStart;
    private final float mStartFraction;

    public PathSegment(android.graphics.PointF r2, float r3, android.graphics.PointF r4, float r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "start == null"
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2, r0)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r1.mStart = r2
            r1.mStartFraction = r3
            java.lang.String r2 = "end == null"
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r4, r2)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r1.mEnd = r2
            r1.mEndFraction = r5
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.core.graphics.PathSegment
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            androidx.core.graphics.PathSegment r5 = (androidx.core.graphics.PathSegment) r5
            float r1 = r4.mStartFraction
            float r3 = r5.mStartFraction
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 != 0) goto L35
            float r1 = r4.mEndFraction
            float r3 = r5.mEndFraction
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 != 0) goto L35
            android.graphics.PointF r1 = r4.mStart
            android.graphics.PointF r3 = r5.mStart
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L35
            android.graphics.PointF r1 = r4.mEnd
            android.graphics.PointF r5 = r5.mEnd
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L35
            goto L36
        L35:
            r0 = r2
        L36:
            return r0
    }

    public android.graphics.PointF getEnd() {
            r1 = this;
            android.graphics.PointF r0 = r1.mEnd
            return r0
    }

    public float getEndFraction() {
            r1 = this;
            float r0 = r1.mEndFraction
            return r0
    }

    public android.graphics.PointF getStart() {
            r1 = this;
            android.graphics.PointF r0 = r1.mStart
            return r0
    }

    public float getStartFraction() {
            r1 = this;
            float r0 = r1.mStartFraction
            return r0
    }

    public int hashCode() {
            r5 = this;
            android.graphics.PointF r0 = r5.mStart
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            float r1 = r5.mStartFraction
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = 0
            if (r3 == 0) goto L15
            int r1 = java.lang.Float.floatToIntBits(r1)
            goto L16
        L15:
            r1 = r4
        L16:
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.graphics.PointF r1 = r5.mEnd
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            float r1 = r5.mEndFraction
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L2c
            int r4 = java.lang.Float.floatToIntBits(r1)
        L2c:
            int r0 = r0 + r4
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PathSegment{start="
            r0.<init>(r1)
            android.graphics.PointF r1 = r2.mStart
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", startFraction="
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r2.mStartFraction
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", end="
            java.lang.StringBuilder r0 = r0.append(r1)
            android.graphics.PointF r1 = r2.mEnd
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", endFraction="
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r2.mEndFraction
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
