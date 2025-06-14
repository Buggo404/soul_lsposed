package com.google.android.material.shape;

/* loaded from: classes.dex */
public class ShapeAppearancePathProvider {
    private final android.graphics.Path boundsPath;
    private final android.graphics.Path cornerPath;
    private final com.google.android.material.shape.ShapePath[] cornerPaths;
    private final android.graphics.Matrix[] cornerTransforms;
    private boolean edgeIntersectionCheckEnabled;
    private final android.graphics.Path edgePath;
    private final android.graphics.Matrix[] edgeTransforms;
    private final android.graphics.Path overlappedEdgePath;
    private final android.graphics.PointF pointF;
    private final float[] scratch;
    private final float[] scratch2;
    private final com.google.android.material.shape.ShapePath shapePath;

    private static class Lazy {
        static final com.google.android.material.shape.ShapeAppearancePathProvider INSTANCE = null;

        static {
                com.google.android.material.shape.ShapeAppearancePathProvider r0 = new com.google.android.material.shape.ShapeAppearancePathProvider
                r0.<init>()
                com.google.android.material.shape.ShapeAppearancePathProvider.Lazy.INSTANCE = r0
                return
        }

        private Lazy() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public interface PathListener {
        void onCornerPathCreated(com.google.android.material.shape.ShapePath r1, android.graphics.Matrix r2, int r3);

        void onEdgePathCreated(com.google.android.material.shape.ShapePath r1, android.graphics.Matrix r2, int r3);
    }

    static final class ShapeAppearancePathSpec {
        public final android.graphics.RectF bounds;
        public final float interpolation;
        public final android.graphics.Path path;
        public final com.google.android.material.shape.ShapeAppearancePathProvider.PathListener pathListener;
        public final com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;

        ShapeAppearancePathSpec(com.google.android.material.shape.ShapeAppearanceModel r1, float r2, android.graphics.RectF r3, com.google.android.material.shape.ShapeAppearancePathProvider.PathListener r4, android.graphics.Path r5) {
                r0 = this;
                r0.<init>()
                r0.pathListener = r4
                r0.shapeAppearanceModel = r1
                r0.interpolation = r2
                r0.bounds = r3
                r0.path = r5
                return
        }
    }

    public ShapeAppearancePathProvider() {
            r4 = this;
            r4.<init>()
            r0 = 4
            com.google.android.material.shape.ShapePath[] r1 = new com.google.android.material.shape.ShapePath[r0]
            r4.cornerPaths = r1
            android.graphics.Matrix[] r1 = new android.graphics.Matrix[r0]
            r4.cornerTransforms = r1
            android.graphics.Matrix[] r1 = new android.graphics.Matrix[r0]
            r4.edgeTransforms = r1
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            r4.pointF = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.overlappedEdgePath = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.boundsPath = r1
            com.google.android.material.shape.ShapePath r1 = new com.google.android.material.shape.ShapePath
            r1.<init>()
            r4.shapePath = r1
            r1 = 2
            float[] r2 = new float[r1]
            r4.scratch = r2
            float[] r1 = new float[r1]
            r4.scratch2 = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.edgePath = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.cornerPath = r1
            r1 = 1
            r4.edgeIntersectionCheckEnabled = r1
            r1 = 0
        L47:
            if (r1 >= r0) goto L67
            com.google.android.material.shape.ShapePath[] r2 = r4.cornerPaths
            com.google.android.material.shape.ShapePath r3 = new com.google.android.material.shape.ShapePath
            r3.<init>()
            r2[r1] = r3
            android.graphics.Matrix[] r2 = r4.cornerTransforms
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r2[r1] = r3
            android.graphics.Matrix[] r2 = r4.edgeTransforms
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L47
        L67:
            return
    }

    private float angleOfEdge(int r1) {
            r0 = this;
            int r1 = r1 + 1
            int r1 = r1 * 90
            float r1 = (float) r1
            return r1
    }

    private void appendCornerPath(com.google.android.material.shape.ShapeAppearancePathProvider.ShapeAppearancePathSpec r5, int r6) {
            r4 = this;
            float[] r0 = r4.scratch
            com.google.android.material.shape.ShapePath[] r1 = r4.cornerPaths
            r1 = r1[r6]
            float r1 = r1.getStartX()
            r2 = 0
            r0[r2] = r1
            float[] r0 = r4.scratch
            com.google.android.material.shape.ShapePath[] r1 = r4.cornerPaths
            r1 = r1[r6]
            float r1 = r1.getStartY()
            r3 = 1
            r0[r3] = r1
            android.graphics.Matrix[] r0 = r4.cornerTransforms
            r0 = r0[r6]
            float[] r1 = r4.scratch
            r0.mapPoints(r1)
            if (r6 != 0) goto L31
            android.graphics.Path r0 = r5.path
            float[] r1 = r4.scratch
            r2 = r1[r2]
            r1 = r1[r3]
            r0.moveTo(r2, r1)
            goto L3c
        L31:
            android.graphics.Path r0 = r5.path
            float[] r1 = r4.scratch
            r2 = r1[r2]
            r1 = r1[r3]
            r0.lineTo(r2, r1)
        L3c:
            com.google.android.material.shape.ShapePath[] r0 = r4.cornerPaths
            r0 = r0[r6]
            android.graphics.Matrix[] r1 = r4.cornerTransforms
            r1 = r1[r6]
            android.graphics.Path r2 = r5.path
            r0.applyToPath(r1, r2)
            com.google.android.material.shape.ShapeAppearancePathProvider$PathListener r0 = r5.pathListener
            if (r0 == 0) goto L5a
            com.google.android.material.shape.ShapeAppearancePathProvider$PathListener r5 = r5.pathListener
            com.google.android.material.shape.ShapePath[] r0 = r4.cornerPaths
            r0 = r0[r6]
            android.graphics.Matrix[] r1 = r4.cornerTransforms
            r1 = r1[r6]
            r5.onCornerPathCreated(r0, r1, r6)
        L5a:
            return
    }

    private void appendEdgePath(com.google.android.material.shape.ShapeAppearancePathProvider.ShapeAppearancePathSpec r9, int r10) {
            r8 = this;
            int r0 = r10 + 1
            int r0 = r0 % 4
            float[] r1 = r8.scratch
            com.google.android.material.shape.ShapePath[] r2 = r8.cornerPaths
            r2 = r2[r10]
            float r2 = r2.getEndX()
            r3 = 0
            r1[r3] = r2
            float[] r1 = r8.scratch
            com.google.android.material.shape.ShapePath[] r2 = r8.cornerPaths
            r2 = r2[r10]
            float r2 = r2.getEndY()
            r4 = 1
            r1[r4] = r2
            android.graphics.Matrix[] r1 = r8.cornerTransforms
            r1 = r1[r10]
            float[] r2 = r8.scratch
            r1.mapPoints(r2)
            float[] r1 = r8.scratch2
            com.google.android.material.shape.ShapePath[] r2 = r8.cornerPaths
            r2 = r2[r0]
            float r2 = r2.getStartX()
            r1[r3] = r2
            float[] r1 = r8.scratch2
            com.google.android.material.shape.ShapePath[] r2 = r8.cornerPaths
            r2 = r2[r0]
            float r2 = r2.getStartY()
            r1[r4] = r2
            android.graphics.Matrix[] r1 = r8.cornerTransforms
            r1 = r1[r0]
            float[] r2 = r8.scratch2
            r1.mapPoints(r2)
            float[] r1 = r8.scratch
            r2 = r1[r3]
            float[] r5 = r8.scratch2
            r6 = r5[r3]
            float r2 = r2 - r6
            double r6 = (double) r2
            r1 = r1[r4]
            r2 = r5[r4]
            float r1 = r1 - r2
            double r1 = (double) r1
            double r1 = java.lang.Math.hypot(r6, r1)
            float r1 = (float) r1
            r2 = 981668463(0x3a83126f, float:0.001)
            float r1 = r1 - r2
            r2 = 0
            float r1 = java.lang.Math.max(r1, r2)
            android.graphics.RectF r5 = r9.bounds
            float r5 = r8.getEdgeCenterForIndex(r5, r10)
            com.google.android.material.shape.ShapePath r6 = r8.shapePath
            r6.reset(r2, r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r9.shapeAppearanceModel
            com.google.android.material.shape.EdgeTreatment r2 = r8.getEdgeTreatmentForIndex(r10, r2)
            float r6 = r9.interpolation
            com.google.android.material.shape.ShapePath r7 = r8.shapePath
            r2.getEdgePath(r1, r5, r6, r7)
            android.graphics.Path r1 = r8.edgePath
            r1.reset()
            com.google.android.material.shape.ShapePath r1 = r8.shapePath
            android.graphics.Matrix[] r5 = r8.edgeTransforms
            r5 = r5[r10]
            android.graphics.Path r6 = r8.edgePath
            r1.applyToPath(r5, r6)
            boolean r1 = r8.edgeIntersectionCheckEnabled
            if (r1 == 0) goto Le5
            boolean r1 = r2.forceIntersection()
            if (r1 != 0) goto La8
            android.graphics.Path r1 = r8.edgePath
            boolean r1 = r8.pathOverlapsCorner(r1, r10)
            if (r1 != 0) goto La8
            android.graphics.Path r1 = r8.edgePath
            boolean r0 = r8.pathOverlapsCorner(r1, r0)
            if (r0 == 0) goto Le5
        La8:
            android.graphics.Path r0 = r8.edgePath
            android.graphics.Path r1 = r8.boundsPath
            android.graphics.Path$Op r2 = android.graphics.Path.Op.DIFFERENCE
            r0.op(r0, r1, r2)
            float[] r0 = r8.scratch
            com.google.android.material.shape.ShapePath r1 = r8.shapePath
            float r1 = r1.getStartX()
            r0[r3] = r1
            float[] r0 = r8.scratch
            com.google.android.material.shape.ShapePath r1 = r8.shapePath
            float r1 = r1.getStartY()
            r0[r4] = r1
            android.graphics.Matrix[] r0 = r8.edgeTransforms
            r0 = r0[r10]
            float[] r1 = r8.scratch
            r0.mapPoints(r1)
            android.graphics.Path r0 = r8.overlappedEdgePath
            float[] r1 = r8.scratch
            r2 = r1[r3]
            r1 = r1[r4]
            r0.moveTo(r2, r1)
            com.google.android.material.shape.ShapePath r0 = r8.shapePath
            android.graphics.Matrix[] r1 = r8.edgeTransforms
            r1 = r1[r10]
            android.graphics.Path r2 = r8.overlappedEdgePath
            r0.applyToPath(r1, r2)
            goto Lf0
        Le5:
            com.google.android.material.shape.ShapePath r0 = r8.shapePath
            android.graphics.Matrix[] r1 = r8.edgeTransforms
            r1 = r1[r10]
            android.graphics.Path r2 = r9.path
            r0.applyToPath(r1, r2)
        Lf0:
            com.google.android.material.shape.ShapeAppearancePathProvider$PathListener r0 = r9.pathListener
            if (r0 == 0) goto Lff
            com.google.android.material.shape.ShapeAppearancePathProvider$PathListener r9 = r9.pathListener
            com.google.android.material.shape.ShapePath r0 = r8.shapePath
            android.graphics.Matrix[] r1 = r8.edgeTransforms
            r1 = r1[r10]
            r9.onEdgePathCreated(r0, r1, r10)
        Lff:
            return
    }

    private void getCoordinatesOfCorner(int r2, android.graphics.RectF r3, android.graphics.PointF r4) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L21
            r0 = 2
            if (r2 == r0) goto L19
            r0 = 3
            if (r2 == r0) goto L11
            float r2 = r3.right
            float r3 = r3.top
            r4.set(r2, r3)
            goto L28
        L11:
            float r2 = r3.left
            float r3 = r3.top
            r4.set(r2, r3)
            goto L28
        L19:
            float r2 = r3.left
            float r3 = r3.bottom
            r4.set(r2, r3)
            goto L28
        L21:
            float r2 = r3.right
            float r3 = r3.bottom
            r4.set(r2, r3)
        L28:
            return
    }

    private com.google.android.material.shape.CornerSize getCornerSizeForIndex(int r2, com.google.android.material.shape.ShapeAppearanceModel r3) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L18
            r0 = 2
            if (r2 == r0) goto L13
            r0 = 3
            if (r2 == r0) goto Le
            com.google.android.material.shape.CornerSize r2 = r3.getTopRightCornerSize()
            return r2
        Le:
            com.google.android.material.shape.CornerSize r2 = r3.getTopLeftCornerSize()
            return r2
        L13:
            com.google.android.material.shape.CornerSize r2 = r3.getBottomLeftCornerSize()
            return r2
        L18:
            com.google.android.material.shape.CornerSize r2 = r3.getBottomRightCornerSize()
            return r2
    }

    private com.google.android.material.shape.CornerTreatment getCornerTreatmentForIndex(int r2, com.google.android.material.shape.ShapeAppearanceModel r3) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L18
            r0 = 2
            if (r2 == r0) goto L13
            r0 = 3
            if (r2 == r0) goto Le
            com.google.android.material.shape.CornerTreatment r2 = r3.getTopRightCorner()
            return r2
        Le:
            com.google.android.material.shape.CornerTreatment r2 = r3.getTopLeftCorner()
            return r2
        L13:
            com.google.android.material.shape.CornerTreatment r2 = r3.getBottomLeftCorner()
            return r2
        L18:
            com.google.android.material.shape.CornerTreatment r2 = r3.getBottomRightCorner()
            return r2
    }

    private float getEdgeCenterForIndex(android.graphics.RectF r5, int r6) {
            r4 = this;
            float[] r0 = r4.scratch
            com.google.android.material.shape.ShapePath[] r1 = r4.cornerPaths
            r1 = r1[r6]
            float r1 = r1.endX
            r2 = 0
            r0[r2] = r1
            float[] r0 = r4.scratch
            com.google.android.material.shape.ShapePath[] r1 = r4.cornerPaths
            r1 = r1[r6]
            float r1 = r1.endY
            r3 = 1
            r0[r3] = r1
            android.graphics.Matrix[] r0 = r4.cornerTransforms
            r0 = r0[r6]
            float[] r1 = r4.scratch
            r0.mapPoints(r1)
            if (r6 == r3) goto L32
            r0 = 3
            if (r6 == r0) goto L32
            float r5 = r5.centerY()
            float[] r6 = r4.scratch
            r6 = r6[r3]
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            return r5
        L32:
            float r5 = r5.centerX()
            float[] r6 = r4.scratch
            r6 = r6[r2]
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            return r5
    }

    private com.google.android.material.shape.EdgeTreatment getEdgeTreatmentForIndex(int r2, com.google.android.material.shape.ShapeAppearanceModel r3) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L18
            r0 = 2
            if (r2 == r0) goto L13
            r0 = 3
            if (r2 == r0) goto Le
            com.google.android.material.shape.EdgeTreatment r2 = r3.getRightEdge()
            return r2
        Le:
            com.google.android.material.shape.EdgeTreatment r2 = r3.getTopEdge()
            return r2
        L13:
            com.google.android.material.shape.EdgeTreatment r2 = r3.getLeftEdge()
            return r2
        L18:
            com.google.android.material.shape.EdgeTreatment r2 = r3.getBottomEdge()
            return r2
    }

    public static com.google.android.material.shape.ShapeAppearancePathProvider getInstance() {
            com.google.android.material.shape.ShapeAppearancePathProvider r0 = com.google.android.material.shape.ShapeAppearancePathProvider.Lazy.INSTANCE
            return r0
    }

    private boolean pathOverlapsCorner(android.graphics.Path r4, int r5) {
            r3 = this;
            android.graphics.Path r0 = r3.cornerPath
            r0.reset()
            com.google.android.material.shape.ShapePath[] r0 = r3.cornerPaths
            r0 = r0[r5]
            android.graphics.Matrix[] r1 = r3.cornerTransforms
            r5 = r1[r5]
            android.graphics.Path r1 = r3.cornerPath
            r0.applyToPath(r5, r1)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r0 = 1
            r4.computeBounds(r5, r0)
            android.graphics.Path r1 = r3.cornerPath
            r1.computeBounds(r5, r0)
            android.graphics.Path r1 = r3.cornerPath
            android.graphics.Path$Op r2 = android.graphics.Path.Op.INTERSECT
            r4.op(r1, r2)
            r4.computeBounds(r5, r0)
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L44
            float r4 = r5.width()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L43
            float r4 = r5.height()
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L43
            goto L44
        L43:
            r0 = 0
        L44:
            return r0
    }

    private void setCornerPathAndTransform(com.google.android.material.shape.ShapeAppearancePathProvider.ShapeAppearancePathSpec r8, int r9) {
            r7 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r8.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r6 = r7.getCornerSizeForIndex(r9, r0)
            com.google.android.material.shape.ShapeAppearanceModel r0 = r8.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r1 = r7.getCornerTreatmentForIndex(r9, r0)
            com.google.android.material.shape.ShapePath[] r0 = r7.cornerPaths
            r2 = r0[r9]
            r3 = 1119092736(0x42b40000, float:90.0)
            float r4 = r8.interpolation
            android.graphics.RectF r5 = r8.bounds
            r1.getCornerPath(r2, r3, r4, r5, r6)
            float r0 = r7.angleOfEdge(r9)
            android.graphics.Matrix[] r1 = r7.cornerTransforms
            r1 = r1[r9]
            r1.reset()
            android.graphics.RectF r8 = r8.bounds
            android.graphics.PointF r1 = r7.pointF
            r7.getCoordinatesOfCorner(r9, r8, r1)
            android.graphics.Matrix[] r8 = r7.cornerTransforms
            r8 = r8[r9]
            android.graphics.PointF r1 = r7.pointF
            float r1 = r1.x
            android.graphics.PointF r2 = r7.pointF
            float r2 = r2.y
            r8.setTranslate(r1, r2)
            android.graphics.Matrix[] r8 = r7.cornerTransforms
            r8 = r8[r9]
            r8.preRotate(r0)
            return
    }

    private void setEdgePathAndTransform(int r6) {
            r5 = this;
            float[] r0 = r5.scratch
            com.google.android.material.shape.ShapePath[] r1 = r5.cornerPaths
            r1 = r1[r6]
            float r1 = r1.getEndX()
            r2 = 0
            r0[r2] = r1
            float[] r0 = r5.scratch
            com.google.android.material.shape.ShapePath[] r1 = r5.cornerPaths
            r1 = r1[r6]
            float r1 = r1.getEndY()
            r3 = 1
            r0[r3] = r1
            android.graphics.Matrix[] r0 = r5.cornerTransforms
            r0 = r0[r6]
            float[] r1 = r5.scratch
            r0.mapPoints(r1)
            float r0 = r5.angleOfEdge(r6)
            android.graphics.Matrix[] r1 = r5.edgeTransforms
            r1 = r1[r6]
            r1.reset()
            android.graphics.Matrix[] r1 = r5.edgeTransforms
            r1 = r1[r6]
            float[] r4 = r5.scratch
            r2 = r4[r2]
            r3 = r4[r3]
            r1.setTranslate(r2, r3)
            android.graphics.Matrix[] r1 = r5.edgeTransforms
            r6 = r1[r6]
            r6.preRotate(r0)
            return
    }

    public void calculatePath(com.google.android.material.shape.ShapeAppearanceModel r7, float r8, android.graphics.RectF r9, android.graphics.Path r10) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.calculatePath(r1, r2, r3, r4, r5)
            return
    }

    public void calculatePath(com.google.android.material.shape.ShapeAppearanceModel r9, float r10, android.graphics.RectF r11, com.google.android.material.shape.ShapeAppearancePathProvider.PathListener r12, android.graphics.Path r13) {
            r8 = this;
            r13.rewind()
            android.graphics.Path r0 = r8.overlappedEdgePath
            r0.rewind()
            android.graphics.Path r0 = r8.boundsPath
            r0.rewind()
            android.graphics.Path r0 = r8.boundsPath
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r0.addRect(r11, r1)
            com.google.android.material.shape.ShapeAppearancePathProvider$ShapeAppearancePathSpec r0 = new com.google.android.material.shape.ShapeAppearancePathProvider$ShapeAppearancePathSpec
            r2 = r0
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r9 = 0
            r10 = r9
        L21:
            r11 = 4
            if (r10 >= r11) goto L2d
            r8.setCornerPathAndTransform(r0, r10)
            r8.setEdgePathAndTransform(r10)
            int r10 = r10 + 1
            goto L21
        L2d:
            if (r9 >= r11) goto L38
            r8.appendCornerPath(r0, r9)
            r8.appendEdgePath(r0, r9)
            int r9 = r9 + 1
            goto L2d
        L38:
            r13.close()
            android.graphics.Path r9 = r8.overlappedEdgePath
            r9.close()
            android.graphics.Path r9 = r8.overlappedEdgePath
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L4f
            android.graphics.Path r9 = r8.overlappedEdgePath
            android.graphics.Path$Op r10 = android.graphics.Path.Op.UNION
            r13.op(r9, r10)
        L4f:
            return
    }

    void setEdgeIntersectionCheckEnable(boolean r1) {
            r0 = this;
            r0.edgeIntersectionCheckEnabled = r1
            return
    }
}
