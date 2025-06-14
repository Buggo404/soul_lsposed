package com.google.android.material.shape;

/* loaded from: classes.dex */
public class ShapeAppearanceModel {
    public static final com.google.android.material.shape.CornerSize PILL = null;
    com.google.android.material.shape.EdgeTreatment bottomEdge;
    com.google.android.material.shape.CornerTreatment bottomLeftCorner;
    com.google.android.material.shape.CornerSize bottomLeftCornerSize;
    com.google.android.material.shape.CornerTreatment bottomRightCorner;
    com.google.android.material.shape.CornerSize bottomRightCornerSize;
    com.google.android.material.shape.EdgeTreatment leftEdge;
    com.google.android.material.shape.EdgeTreatment rightEdge;
    com.google.android.material.shape.EdgeTreatment topEdge;
    com.google.android.material.shape.CornerTreatment topLeftCorner;
    com.google.android.material.shape.CornerSize topLeftCornerSize;
    com.google.android.material.shape.CornerTreatment topRightCorner;
    com.google.android.material.shape.CornerSize topRightCornerSize;

    /* renamed from: com.google.android.material.shape.ShapeAppearanceModel$1 */
    static /* synthetic */ class C06211 {
    }

    public static final class Builder {
        private com.google.android.material.shape.EdgeTreatment bottomEdge;
        private com.google.android.material.shape.CornerTreatment bottomLeftCorner;
        private com.google.android.material.shape.CornerSize bottomLeftCornerSize;
        private com.google.android.material.shape.CornerTreatment bottomRightCorner;
        private com.google.android.material.shape.CornerSize bottomRightCornerSize;
        private com.google.android.material.shape.EdgeTreatment leftEdge;
        private com.google.android.material.shape.EdgeTreatment rightEdge;
        private com.google.android.material.shape.EdgeTreatment topEdge;
        private com.google.android.material.shape.CornerTreatment topLeftCorner;
        private com.google.android.material.shape.CornerSize topLeftCornerSize;
        private com.google.android.material.shape.CornerTreatment topRightCorner;
        private com.google.android.material.shape.CornerSize topRightCornerSize;

        public Builder() {
                r2 = this;
                r2.<init>()
                com.google.android.material.shape.CornerTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultCornerTreatment()
                r2.topLeftCorner = r0
                com.google.android.material.shape.CornerTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultCornerTreatment()
                r2.topRightCorner = r0
                com.google.android.material.shape.CornerTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultCornerTreatment()
                r2.bottomRightCorner = r0
                com.google.android.material.shape.CornerTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultCornerTreatment()
                r2.bottomLeftCorner = r0
                com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
                r1 = 0
                r0.<init>(r1)
                r2.topLeftCornerSize = r0
                com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
                r0.<init>(r1)
                r2.topRightCornerSize = r0
                com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
                r0.<init>(r1)
                r2.bottomRightCornerSize = r0
                com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
                r0.<init>(r1)
                r2.bottomLeftCornerSize = r0
                com.google.android.material.shape.EdgeTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultEdgeTreatment()
                r2.topEdge = r0
                com.google.android.material.shape.EdgeTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultEdgeTreatment()
                r2.rightEdge = r0
                com.google.android.material.shape.EdgeTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultEdgeTreatment()
                r2.bottomEdge = r0
                com.google.android.material.shape.EdgeTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultEdgeTreatment()
                r2.leftEdge = r0
                return
        }

        public Builder(com.google.android.material.shape.ShapeAppearanceModel r3) {
                r2 = this;
                r2.<init>()
                com.google.android.material.shape.CornerTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultCornerTreatment()
                r2.topLeftCorner = r0
                com.google.android.material.shape.CornerTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultCornerTreatment()
                r2.topRightCorner = r0
                com.google.android.material.shape.CornerTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultCornerTreatment()
                r2.bottomRightCorner = r0
                com.google.android.material.shape.CornerTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultCornerTreatment()
                r2.bottomLeftCorner = r0
                com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
                r1 = 0
                r0.<init>(r1)
                r2.topLeftCornerSize = r0
                com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
                r0.<init>(r1)
                r2.topRightCornerSize = r0
                com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
                r0.<init>(r1)
                r2.bottomRightCornerSize = r0
                com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
                r0.<init>(r1)
                r2.bottomLeftCornerSize = r0
                com.google.android.material.shape.EdgeTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultEdgeTreatment()
                r2.topEdge = r0
                com.google.android.material.shape.EdgeTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultEdgeTreatment()
                r2.rightEdge = r0
                com.google.android.material.shape.EdgeTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultEdgeTreatment()
                r2.bottomEdge = r0
                com.google.android.material.shape.EdgeTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultEdgeTreatment()
                r2.leftEdge = r0
                com.google.android.material.shape.CornerTreatment r0 = r3.topLeftCorner
                r2.topLeftCorner = r0
                com.google.android.material.shape.CornerTreatment r0 = r3.topRightCorner
                r2.topRightCorner = r0
                com.google.android.material.shape.CornerTreatment r0 = r3.bottomRightCorner
                r2.bottomRightCorner = r0
                com.google.android.material.shape.CornerTreatment r0 = r3.bottomLeftCorner
                r2.bottomLeftCorner = r0
                com.google.android.material.shape.CornerSize r0 = r3.topLeftCornerSize
                r2.topLeftCornerSize = r0
                com.google.android.material.shape.CornerSize r0 = r3.topRightCornerSize
                r2.topRightCornerSize = r0
                com.google.android.material.shape.CornerSize r0 = r3.bottomRightCornerSize
                r2.bottomRightCornerSize = r0
                com.google.android.material.shape.CornerSize r0 = r3.bottomLeftCornerSize
                r2.bottomLeftCornerSize = r0
                com.google.android.material.shape.EdgeTreatment r0 = r3.topEdge
                r2.topEdge = r0
                com.google.android.material.shape.EdgeTreatment r0 = r3.rightEdge
                r2.rightEdge = r0
                com.google.android.material.shape.EdgeTreatment r0 = r3.bottomEdge
                r2.bottomEdge = r0
                com.google.android.material.shape.EdgeTreatment r3 = r3.leftEdge
                r2.leftEdge = r3
                return
        }

        static /* synthetic */ com.google.android.material.shape.CornerTreatment access$100(com.google.android.material.shape.ShapeAppearanceModel.Builder r0) {
                com.google.android.material.shape.CornerTreatment r0 = r0.topLeftCorner
                return r0
        }

        static /* synthetic */ com.google.android.material.shape.EdgeTreatment access$1000(com.google.android.material.shape.ShapeAppearanceModel.Builder r0) {
                com.google.android.material.shape.EdgeTreatment r0 = r0.rightEdge
                return r0
        }

        static /* synthetic */ com.google.android.material.shape.EdgeTreatment access$1100(com.google.android.material.shape.ShapeAppearanceModel.Builder r0) {
                com.google.android.material.shape.EdgeTreatment r0 = r0.bottomEdge
                return r0
        }

        static /* synthetic */ com.google.android.material.shape.EdgeTreatment access$1200(com.google.android.material.shape.ShapeAppearanceModel.Builder r0) {
                com.google.android.material.shape.EdgeTreatment r0 = r0.leftEdge
                return r0
        }

        static /* synthetic */ com.google.android.material.shape.CornerTreatment access$200(com.google.android.material.shape.ShapeAppearanceModel.Builder r0) {
                com.google.android.material.shape.CornerTreatment r0 = r0.topRightCorner
                return r0
        }

        static /* synthetic */ com.google.android.material.shape.CornerTreatment access$300(com.google.android.material.shape.ShapeAppearanceModel.Builder r0) {
                com.google.android.material.shape.CornerTreatment r0 = r0.bottomRightCorner
                return r0
        }

        static /* synthetic */ com.google.android.material.shape.CornerTreatment access$400(com.google.android.material.shape.ShapeAppearanceModel.Builder r0) {
                com.google.android.material.shape.CornerTreatment r0 = r0.bottomLeftCorner
                return r0
        }

        static /* synthetic */ com.google.android.material.shape.CornerSize access$500(com.google.android.material.shape.ShapeAppearanceModel.Builder r0) {
                com.google.android.material.shape.CornerSize r0 = r0.topLeftCornerSize
                return r0
        }

        static /* synthetic */ com.google.android.material.shape.CornerSize access$600(com.google.android.material.shape.ShapeAppearanceModel.Builder r0) {
                com.google.android.material.shape.CornerSize r0 = r0.topRightCornerSize
                return r0
        }

        static /* synthetic */ com.google.android.material.shape.CornerSize access$700(com.google.android.material.shape.ShapeAppearanceModel.Builder r0) {
                com.google.android.material.shape.CornerSize r0 = r0.bottomRightCornerSize
                return r0
        }

        static /* synthetic */ com.google.android.material.shape.CornerSize access$800(com.google.android.material.shape.ShapeAppearanceModel.Builder r0) {
                com.google.android.material.shape.CornerSize r0 = r0.bottomLeftCornerSize
                return r0
        }

        static /* synthetic */ com.google.android.material.shape.EdgeTreatment access$900(com.google.android.material.shape.ShapeAppearanceModel.Builder r0) {
                com.google.android.material.shape.EdgeTreatment r0 = r0.topEdge
                return r0
        }

        private static float compatCornerTreatmentSize(com.google.android.material.shape.CornerTreatment r1) {
                boolean r0 = r1 instanceof com.google.android.material.shape.RoundedCornerTreatment
                if (r0 == 0) goto L9
                com.google.android.material.shape.RoundedCornerTreatment r1 = (com.google.android.material.shape.RoundedCornerTreatment) r1
                float r1 = r1.radius
                return r1
            L9:
                boolean r0 = r1 instanceof com.google.android.material.shape.CutCornerTreatment
                if (r0 == 0) goto L12
                com.google.android.material.shape.CutCornerTreatment r1 = (com.google.android.material.shape.CutCornerTreatment) r1
                float r1 = r1.size
                return r1
            L12:
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel build() {
                r2 = this;
                com.google.android.material.shape.ShapeAppearanceModel r0 = new com.google.android.material.shape.ShapeAppearanceModel
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setAllCornerSizes(float r2) {
                r1 = this;
                com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r1.setTopLeftCornerSize(r2)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setTopRightCornerSize(r2)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setBottomRightCornerSize(r2)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r0.setBottomLeftCornerSize(r2)
                return r2
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setAllCornerSizes(com.google.android.material.shape.CornerSize r2) {
                r1 = this;
                com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r1.setTopLeftCornerSize(r2)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setTopRightCornerSize(r2)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setBottomRightCornerSize(r2)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r0.setBottomLeftCornerSize(r2)
                return r2
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setAllCorners(int r1, float r2) {
                r0 = this;
                com.google.android.material.shape.CornerTreatment r1 = com.google.android.material.shape.MaterialShapeUtils.createCornerTreatment(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r0.setAllCorners(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r1.setAllCornerSizes(r2)
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setAllCorners(com.google.android.material.shape.CornerTreatment r2) {
                r1 = this;
                com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r1.setTopLeftCorner(r2)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setTopRightCorner(r2)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setBottomRightCorner(r2)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r0.setBottomLeftCorner(r2)
                return r2
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setAllEdges(com.google.android.material.shape.EdgeTreatment r2) {
                r1 = this;
                com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r1.setLeftEdge(r2)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setTopEdge(r2)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setRightEdge(r2)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r0.setBottomEdge(r2)
                return r2
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setBottomEdge(com.google.android.material.shape.EdgeTreatment r1) {
                r0 = this;
                r0.bottomEdge = r1
                return r0
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setBottomLeftCorner(int r1, float r2) {
                r0 = this;
                com.google.android.material.shape.CornerTreatment r1 = com.google.android.material.shape.MaterialShapeUtils.createCornerTreatment(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r0.setBottomLeftCorner(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r1.setBottomLeftCornerSize(r2)
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setBottomLeftCorner(int r1, com.google.android.material.shape.CornerSize r2) {
                r0 = this;
                com.google.android.material.shape.CornerTreatment r1 = com.google.android.material.shape.MaterialShapeUtils.createCornerTreatment(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r0.setBottomLeftCorner(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r1.setBottomLeftCornerSize(r2)
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setBottomLeftCorner(com.google.android.material.shape.CornerTreatment r2) {
                r1 = this;
                r1.bottomLeftCorner = r2
                float r2 = compatCornerTreatmentSize(r2)
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lf
                r1.setBottomLeftCornerSize(r2)
            Lf:
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setBottomLeftCornerSize(float r2) {
                r1 = this;
                com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
                r0.<init>(r2)
                r1.bottomLeftCornerSize = r0
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setBottomLeftCornerSize(com.google.android.material.shape.CornerSize r1) {
                r0 = this;
                r0.bottomLeftCornerSize = r1
                return r0
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setBottomRightCorner(int r1, float r2) {
                r0 = this;
                com.google.android.material.shape.CornerTreatment r1 = com.google.android.material.shape.MaterialShapeUtils.createCornerTreatment(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r0.setBottomRightCorner(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r1.setBottomRightCornerSize(r2)
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setBottomRightCorner(int r1, com.google.android.material.shape.CornerSize r2) {
                r0 = this;
                com.google.android.material.shape.CornerTreatment r1 = com.google.android.material.shape.MaterialShapeUtils.createCornerTreatment(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r0.setBottomRightCorner(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r1.setBottomRightCornerSize(r2)
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setBottomRightCorner(com.google.android.material.shape.CornerTreatment r2) {
                r1 = this;
                r1.bottomRightCorner = r2
                float r2 = compatCornerTreatmentSize(r2)
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lf
                r1.setBottomRightCornerSize(r2)
            Lf:
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setBottomRightCornerSize(float r2) {
                r1 = this;
                com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
                r0.<init>(r2)
                r1.bottomRightCornerSize = r0
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setBottomRightCornerSize(com.google.android.material.shape.CornerSize r1) {
                r0 = this;
                r0.bottomRightCornerSize = r1
                return r0
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setLeftEdge(com.google.android.material.shape.EdgeTreatment r1) {
                r0 = this;
                r0.leftEdge = r1
                return r0
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setRightEdge(com.google.android.material.shape.EdgeTreatment r1) {
                r0 = this;
                r0.rightEdge = r1
                return r0
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setTopEdge(com.google.android.material.shape.EdgeTreatment r1) {
                r0 = this;
                r0.topEdge = r1
                return r0
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setTopLeftCorner(int r1, float r2) {
                r0 = this;
                com.google.android.material.shape.CornerTreatment r1 = com.google.android.material.shape.MaterialShapeUtils.createCornerTreatment(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r0.setTopLeftCorner(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r1.setTopLeftCornerSize(r2)
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setTopLeftCorner(int r1, com.google.android.material.shape.CornerSize r2) {
                r0 = this;
                com.google.android.material.shape.CornerTreatment r1 = com.google.android.material.shape.MaterialShapeUtils.createCornerTreatment(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r0.setTopLeftCorner(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r1.setTopLeftCornerSize(r2)
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setTopLeftCorner(com.google.android.material.shape.CornerTreatment r2) {
                r1 = this;
                r1.topLeftCorner = r2
                float r2 = compatCornerTreatmentSize(r2)
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lf
                r1.setTopLeftCornerSize(r2)
            Lf:
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setTopLeftCornerSize(float r2) {
                r1 = this;
                com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
                r0.<init>(r2)
                r1.topLeftCornerSize = r0
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setTopLeftCornerSize(com.google.android.material.shape.CornerSize r1) {
                r0 = this;
                r0.topLeftCornerSize = r1
                return r0
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setTopRightCorner(int r1, float r2) {
                r0 = this;
                com.google.android.material.shape.CornerTreatment r1 = com.google.android.material.shape.MaterialShapeUtils.createCornerTreatment(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r0.setTopRightCorner(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r1.setTopRightCornerSize(r2)
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setTopRightCorner(int r1, com.google.android.material.shape.CornerSize r2) {
                r0 = this;
                com.google.android.material.shape.CornerTreatment r1 = com.google.android.material.shape.MaterialShapeUtils.createCornerTreatment(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r0.setTopRightCorner(r1)
                com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r1.setTopRightCornerSize(r2)
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setTopRightCorner(com.google.android.material.shape.CornerTreatment r2) {
                r1 = this;
                r1.topRightCorner = r2
                float r2 = compatCornerTreatmentSize(r2)
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lf
                r1.setTopRightCornerSize(r2)
            Lf:
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setTopRightCornerSize(float r2) {
                r1 = this;
                com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
                r0.<init>(r2)
                r1.topRightCornerSize = r0
                return r1
        }

        public com.google.android.material.shape.ShapeAppearanceModel.Builder setTopRightCornerSize(com.google.android.material.shape.CornerSize r1) {
                r0 = this;
                r0.topRightCornerSize = r1
                return r0
        }
    }

    public interface CornerSizeUnaryOperator {
        com.google.android.material.shape.CornerSize apply(com.google.android.material.shape.CornerSize r1);
    }

    static {
            com.google.android.material.shape.RelativeCornerSize r0 = new com.google.android.material.shape.RelativeCornerSize
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.<init>(r1)
            com.google.android.material.shape.ShapeAppearanceModel.PILL = r0
            return
    }

    public ShapeAppearanceModel() {
            r2 = this;
            r2.<init>()
            com.google.android.material.shape.CornerTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultCornerTreatment()
            r2.topLeftCorner = r0
            com.google.android.material.shape.CornerTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultCornerTreatment()
            r2.topRightCorner = r0
            com.google.android.material.shape.CornerTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultCornerTreatment()
            r2.bottomRightCorner = r0
            com.google.android.material.shape.CornerTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultCornerTreatment()
            r2.bottomLeftCorner = r0
            com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
            r1 = 0
            r0.<init>(r1)
            r2.topLeftCornerSize = r0
            com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
            r0.<init>(r1)
            r2.topRightCornerSize = r0
            com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
            r0.<init>(r1)
            r2.bottomRightCornerSize = r0
            com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
            r0.<init>(r1)
            r2.bottomLeftCornerSize = r0
            com.google.android.material.shape.EdgeTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultEdgeTreatment()
            r2.topEdge = r0
            com.google.android.material.shape.EdgeTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultEdgeTreatment()
            r2.rightEdge = r0
            com.google.android.material.shape.EdgeTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultEdgeTreatment()
            r2.bottomEdge = r0
            com.google.android.material.shape.EdgeTreatment r0 = com.google.android.material.shape.MaterialShapeUtils.createDefaultEdgeTreatment()
            r2.leftEdge = r0
            return
    }

    private ShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel.Builder r2) {
            r1 = this;
            r1.<init>()
            com.google.android.material.shape.CornerTreatment r0 = com.google.android.material.shape.ShapeAppearanceModel.Builder.access$100(r2)
            r1.topLeftCorner = r0
            com.google.android.material.shape.CornerTreatment r0 = com.google.android.material.shape.ShapeAppearanceModel.Builder.access$200(r2)
            r1.topRightCorner = r0
            com.google.android.material.shape.CornerTreatment r0 = com.google.android.material.shape.ShapeAppearanceModel.Builder.access$300(r2)
            r1.bottomRightCorner = r0
            com.google.android.material.shape.CornerTreatment r0 = com.google.android.material.shape.ShapeAppearanceModel.Builder.access$400(r2)
            r1.bottomLeftCorner = r0
            com.google.android.material.shape.CornerSize r0 = com.google.android.material.shape.ShapeAppearanceModel.Builder.access$500(r2)
            r1.topLeftCornerSize = r0
            com.google.android.material.shape.CornerSize r0 = com.google.android.material.shape.ShapeAppearanceModel.Builder.access$600(r2)
            r1.topRightCornerSize = r0
            com.google.android.material.shape.CornerSize r0 = com.google.android.material.shape.ShapeAppearanceModel.Builder.access$700(r2)
            r1.bottomRightCornerSize = r0
            com.google.android.material.shape.CornerSize r0 = com.google.android.material.shape.ShapeAppearanceModel.Builder.access$800(r2)
            r1.bottomLeftCornerSize = r0
            com.google.android.material.shape.EdgeTreatment r0 = com.google.android.material.shape.ShapeAppearanceModel.Builder.access$900(r2)
            r1.topEdge = r0
            com.google.android.material.shape.EdgeTreatment r0 = com.google.android.material.shape.ShapeAppearanceModel.Builder.access$1000(r2)
            r1.rightEdge = r0
            com.google.android.material.shape.EdgeTreatment r0 = com.google.android.material.shape.ShapeAppearanceModel.Builder.access$1100(r2)
            r1.bottomEdge = r0
            com.google.android.material.shape.EdgeTreatment r2 = com.google.android.material.shape.ShapeAppearanceModel.Builder.access$1200(r2)
            r1.leftEdge = r2
            return
    }

    /* synthetic */ ShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel.Builder r1, com.google.android.material.shape.ShapeAppearanceModel.C06211 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.google.android.material.shape.ShapeAppearanceModel.Builder builder() {
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = new com.google.android.material.shape.ShapeAppearanceModel$Builder
            r0.<init>()
            return r0
    }

    public static com.google.android.material.shape.ShapeAppearanceModel.Builder builder(android.content.Context r1, int r2, int r3) {
            r0 = 0
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = builder(r1, r2, r3, r0)
            return r1
    }

    private static com.google.android.material.shape.ShapeAppearanceModel.Builder builder(android.content.Context r1, int r2, int r3, int r4) {
            com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
            float r4 = (float) r4
            r0.<init>(r4)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = builder(r1, r2, r3, r0)
            return r1
    }

    private static com.google.android.material.shape.ShapeAppearanceModel.Builder builder(android.content.Context r6, int r7, int r8, com.google.android.material.shape.CornerSize r9) {
            if (r8 == 0) goto L9
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r6, r7)
            r7 = r8
            r6 = r0
        L9:
            int[] r8 = com.google.android.material.C0479R.styleable.ShapeAppearance
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r8)
            int r7 = com.google.android.material.C0479R.styleable.ShapeAppearance_cornerFamily     // Catch: java.lang.Throwable -> L65
            r8 = 0
            int r7 = r6.getInt(r7, r8)     // Catch: java.lang.Throwable -> L65
            int r8 = com.google.android.material.C0479R.styleable.ShapeAppearance_cornerFamilyTopLeft     // Catch: java.lang.Throwable -> L65
            int r8 = r6.getInt(r8, r7)     // Catch: java.lang.Throwable -> L65
            int r0 = com.google.android.material.C0479R.styleable.ShapeAppearance_cornerFamilyTopRight     // Catch: java.lang.Throwable -> L65
            int r0 = r6.getInt(r0, r7)     // Catch: java.lang.Throwable -> L65
            int r1 = com.google.android.material.C0479R.styleable.ShapeAppearance_cornerFamilyBottomRight     // Catch: java.lang.Throwable -> L65
            int r1 = r6.getInt(r1, r7)     // Catch: java.lang.Throwable -> L65
            int r2 = com.google.android.material.C0479R.styleable.ShapeAppearance_cornerFamilyBottomLeft     // Catch: java.lang.Throwable -> L65
            int r7 = r6.getInt(r2, r7)     // Catch: java.lang.Throwable -> L65
            int r2 = com.google.android.material.C0479R.styleable.ShapeAppearance_cornerSize     // Catch: java.lang.Throwable -> L65
            com.google.android.material.shape.CornerSize r9 = getCornerSize(r6, r2, r9)     // Catch: java.lang.Throwable -> L65
            int r2 = com.google.android.material.C0479R.styleable.ShapeAppearance_cornerSizeTopLeft     // Catch: java.lang.Throwable -> L65
            com.google.android.material.shape.CornerSize r2 = getCornerSize(r6, r2, r9)     // Catch: java.lang.Throwable -> L65
            int r3 = com.google.android.material.C0479R.styleable.ShapeAppearance_cornerSizeTopRight     // Catch: java.lang.Throwable -> L65
            com.google.android.material.shape.CornerSize r3 = getCornerSize(r6, r3, r9)     // Catch: java.lang.Throwable -> L65
            int r4 = com.google.android.material.C0479R.styleable.ShapeAppearance_cornerSizeBottomRight     // Catch: java.lang.Throwable -> L65
            com.google.android.material.shape.CornerSize r4 = getCornerSize(r6, r4, r9)     // Catch: java.lang.Throwable -> L65
            int r5 = com.google.android.material.C0479R.styleable.ShapeAppearance_cornerSizeBottomLeft     // Catch: java.lang.Throwable -> L65
            com.google.android.material.shape.CornerSize r9 = getCornerSize(r6, r5, r9)     // Catch: java.lang.Throwable -> L65
            com.google.android.material.shape.ShapeAppearanceModel$Builder r5 = new com.google.android.material.shape.ShapeAppearanceModel$Builder     // Catch: java.lang.Throwable -> L65
            r5.<init>()     // Catch: java.lang.Throwable -> L65
            com.google.android.material.shape.ShapeAppearanceModel$Builder r8 = r5.setTopLeftCorner(r8, r2)     // Catch: java.lang.Throwable -> L65
            com.google.android.material.shape.ShapeAppearanceModel$Builder r8 = r8.setTopRightCorner(r0, r3)     // Catch: java.lang.Throwable -> L65
            com.google.android.material.shape.ShapeAppearanceModel$Builder r8 = r8.setBottomRightCorner(r1, r4)     // Catch: java.lang.Throwable -> L65
            com.google.android.material.shape.ShapeAppearanceModel$Builder r7 = r8.setBottomLeftCorner(r7, r9)     // Catch: java.lang.Throwable -> L65
            r6.recycle()
            return r7
        L65:
            r7 = move-exception
            r6.recycle()
            throw r7
    }

    public static com.google.android.material.shape.ShapeAppearanceModel.Builder builder(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = 0
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = builder(r1, r2, r3, r4, r0)
            return r1
    }

    public static com.google.android.material.shape.ShapeAppearanceModel.Builder builder(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, int r5) {
            com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
            float r5 = (float) r5
            r0.<init>(r5)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = builder(r1, r2, r3, r4, r0)
            return r1
    }

    public static com.google.android.material.shape.ShapeAppearanceModel.Builder builder(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, com.google.android.material.shape.CornerSize r5) {
            int[] r0 = com.google.android.material.C0479R.styleable.MaterialShape
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r0, r3, r4)
            int r3 = com.google.android.material.C0479R.styleable.MaterialShape_shapeAppearance
            r4 = 0
            int r3 = r2.getResourceId(r3, r4)
            int r0 = com.google.android.material.C0479R.styleable.MaterialShape_shapeAppearanceOverlay
            int r4 = r2.getResourceId(r0, r4)
            r2.recycle()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = builder(r1, r3, r4, r5)
            return r1
    }

    private static com.google.android.material.shape.CornerSize getCornerSize(android.content.res.TypedArray r2, int r3, com.google.android.material.shape.CornerSize r4) {
            android.util.TypedValue r3 = r2.peekValue(r3)
            if (r3 != 0) goto L7
            return r4
        L7:
            int r0 = r3.type
            r1 = 5
            if (r0 != r1) goto L21
            com.google.android.material.shape.AbsoluteCornerSize r4 = new com.google.android.material.shape.AbsoluteCornerSize
            int r3 = r3.data
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = android.util.TypedValue.complexToDimensionPixelSize(r3, r2)
            float r2 = (float) r2
            r4.<init>(r2)
            return r4
        L21:
            int r2 = r3.type
            r0 = 6
            if (r2 != r0) goto L32
            com.google.android.material.shape.RelativeCornerSize r2 = new com.google.android.material.shape.RelativeCornerSize
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3.getFraction(r4, r4)
            r2.<init>(r3)
            return r2
        L32:
            return r4
    }

    public com.google.android.material.shape.EdgeTreatment getBottomEdge() {
            r1 = this;
            com.google.android.material.shape.EdgeTreatment r0 = r1.bottomEdge
            return r0
    }

    public com.google.android.material.shape.CornerTreatment getBottomLeftCorner() {
            r1 = this;
            com.google.android.material.shape.CornerTreatment r0 = r1.bottomLeftCorner
            return r0
    }

    public com.google.android.material.shape.CornerSize getBottomLeftCornerSize() {
            r1 = this;
            com.google.android.material.shape.CornerSize r0 = r1.bottomLeftCornerSize
            return r0
    }

    public com.google.android.material.shape.CornerTreatment getBottomRightCorner() {
            r1 = this;
            com.google.android.material.shape.CornerTreatment r0 = r1.bottomRightCorner
            return r0
    }

    public com.google.android.material.shape.CornerSize getBottomRightCornerSize() {
            r1 = this;
            com.google.android.material.shape.CornerSize r0 = r1.bottomRightCornerSize
            return r0
    }

    public com.google.android.material.shape.EdgeTreatment getLeftEdge() {
            r1 = this;
            com.google.android.material.shape.EdgeTreatment r0 = r1.leftEdge
            return r0
    }

    public com.google.android.material.shape.EdgeTreatment getRightEdge() {
            r1 = this;
            com.google.android.material.shape.EdgeTreatment r0 = r1.rightEdge
            return r0
    }

    public com.google.android.material.shape.EdgeTreatment getTopEdge() {
            r1 = this;
            com.google.android.material.shape.EdgeTreatment r0 = r1.topEdge
            return r0
    }

    public com.google.android.material.shape.CornerTreatment getTopLeftCorner() {
            r1 = this;
            com.google.android.material.shape.CornerTreatment r0 = r1.topLeftCorner
            return r0
    }

    public com.google.android.material.shape.CornerSize getTopLeftCornerSize() {
            r1 = this;
            com.google.android.material.shape.CornerSize r0 = r1.topLeftCornerSize
            return r0
    }

    public com.google.android.material.shape.CornerTreatment getTopRightCorner() {
            r1 = this;
            com.google.android.material.shape.CornerTreatment r0 = r1.topRightCorner
            return r0
    }

    public com.google.android.material.shape.CornerSize getTopRightCornerSize() {
            r1 = this;
            com.google.android.material.shape.CornerSize r0 = r1.topRightCornerSize
            return r0
    }

    public boolean isRoundRect(android.graphics.RectF r6) {
            r5 = this;
            com.google.android.material.shape.EdgeTreatment r0 = r5.leftEdge
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<com.google.android.material.shape.EdgeTreatment> r1 = com.google.android.material.shape.EdgeTreatment.class
            boolean r0 = r0.equals(r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3c
            com.google.android.material.shape.EdgeTreatment r0 = r5.rightEdge
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<com.google.android.material.shape.EdgeTreatment> r3 = com.google.android.material.shape.EdgeTreatment.class
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L3c
            com.google.android.material.shape.EdgeTreatment r0 = r5.topEdge
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<com.google.android.material.shape.EdgeTreatment> r3 = com.google.android.material.shape.EdgeTreatment.class
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L3c
            com.google.android.material.shape.EdgeTreatment r0 = r5.bottomEdge
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<com.google.android.material.shape.EdgeTreatment> r3 = com.google.android.material.shape.EdgeTreatment.class
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L3c
            r0 = r1
            goto L3d
        L3c:
            r0 = r2
        L3d:
            com.google.android.material.shape.CornerSize r3 = r5.topLeftCornerSize
            float r3 = r3.getCornerSize(r6)
            com.google.android.material.shape.CornerSize r4 = r5.topRightCornerSize
            float r4 = r4.getCornerSize(r6)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 != 0) goto L63
            com.google.android.material.shape.CornerSize r4 = r5.bottomLeftCornerSize
            float r4 = r4.getCornerSize(r6)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 != 0) goto L63
            com.google.android.material.shape.CornerSize r4 = r5.bottomRightCornerSize
            float r6 = r4.getCornerSize(r6)
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 != 0) goto L63
            r6 = r1
            goto L64
        L63:
            r6 = r2
        L64:
            com.google.android.material.shape.CornerTreatment r3 = r5.topRightCorner
            boolean r3 = r3 instanceof com.google.android.material.shape.RoundedCornerTreatment
            if (r3 == 0) goto L7e
            com.google.android.material.shape.CornerTreatment r3 = r5.topLeftCorner
            boolean r3 = r3 instanceof com.google.android.material.shape.RoundedCornerTreatment
            if (r3 == 0) goto L7e
            com.google.android.material.shape.CornerTreatment r3 = r5.bottomRightCorner
            boolean r3 = r3 instanceof com.google.android.material.shape.RoundedCornerTreatment
            if (r3 == 0) goto L7e
            com.google.android.material.shape.CornerTreatment r3 = r5.bottomLeftCorner
            boolean r3 = r3 instanceof com.google.android.material.shape.RoundedCornerTreatment
            if (r3 == 0) goto L7e
            r3 = r1
            goto L7f
        L7e:
            r3 = r2
        L7f:
            if (r0 == 0) goto L86
            if (r6 == 0) goto L86
            if (r3 == 0) goto L86
            goto L87
        L86:
            r1 = r2
        L87:
            return r1
    }

    public com.google.android.material.shape.ShapeAppearanceModel.Builder toBuilder() {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = new com.google.android.material.shape.ShapeAppearanceModel$Builder
            r0.<init>(r1)
            return r0
    }

    public com.google.android.material.shape.ShapeAppearanceModel withCornerSize(float r2) {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r1.toBuilder()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r0.setAllCornerSizes(r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            return r2
    }

    public com.google.android.material.shape.ShapeAppearanceModel withCornerSize(com.google.android.material.shape.CornerSize r2) {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r1.toBuilder()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r0.setAllCornerSizes(r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            return r2
    }

    public com.google.android.material.shape.ShapeAppearanceModel withTransformedCornerSizes(com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator r3) {
            r2 = this;
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r2.toBuilder()
            com.google.android.material.shape.CornerSize r1 = r2.getTopLeftCornerSize()
            com.google.android.material.shape.CornerSize r1 = r3.apply(r1)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setTopLeftCornerSize(r1)
            com.google.android.material.shape.CornerSize r1 = r2.getTopRightCornerSize()
            com.google.android.material.shape.CornerSize r1 = r3.apply(r1)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setTopRightCornerSize(r1)
            com.google.android.material.shape.CornerSize r1 = r2.getBottomLeftCornerSize()
            com.google.android.material.shape.CornerSize r1 = r3.apply(r1)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setBottomLeftCornerSize(r1)
            com.google.android.material.shape.CornerSize r1 = r2.getBottomRightCornerSize()
            com.google.android.material.shape.CornerSize r3 = r3.apply(r1)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r3 = r0.setBottomRightCornerSize(r3)
            com.google.android.material.shape.ShapeAppearanceModel r3 = r3.build()
            return r3
    }
}
