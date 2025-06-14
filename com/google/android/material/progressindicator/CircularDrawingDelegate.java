package com.google.android.material.progressindicator;

/* loaded from: classes.dex */
final class CircularDrawingDelegate extends com.google.android.material.progressindicator.DrawingDelegate<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> {
    private float adjustedRadius;
    private int arcDirectionFactor;
    private float displayedCornerRadius;
    private float displayedTrackThickness;

    public CircularDrawingDelegate(com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.arcDirectionFactor = r1
            return
    }

    private void drawRoundedEnd(android.graphics.Canvas r13, android.graphics.Paint r14, float r15, float r16, float r17, boolean r18, android.graphics.RectF r19) {
            r12 = this;
            r0 = r12
            r7 = r13
            if (r18 == 0) goto L7
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L9
        L7:
            r1 = 1065353216(0x3f800000, float:1.0)
        L9:
            r8 = r1
            r13.save()
            r1 = r17
            r13.rotate(r1)
            float r1 = r0.adjustedRadius
            r9 = 1073741824(0x40000000, float:2.0)
            float r10 = r15 / r9
            float r1 = r1 - r10
            float r2 = r1 + r16
            float r1 = r8 * r16
            int r3 = r0.arcDirectionFactor
            float r3 = (float) r3
            float r3 = r3 * r1
            r11 = 0
            float r3 = java.lang.Math.min(r11, r3)
            float r4 = r0.adjustedRadius
            float r4 = r4 + r10
            float r4 = r4 - r16
            int r5 = r0.arcDirectionFactor
            float r5 = (float) r5
            float r1 = r1 * r5
            float r5 = java.lang.Math.max(r11, r1)
            r1 = r13
            r6 = r14
            r1.drawRect(r2, r3, r4, r5, r6)
            float r1 = r0.adjustedRadius
            float r1 = r1 - r10
            float r1 = r1 + r16
            r13.translate(r1, r11)
            r3 = 1127481344(0x43340000, float:180.0)
            float r1 = -r8
            r10 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 * r10
            int r2 = r0.arcDirectionFactor
            float r2 = (float) r2
            float r4 = r1 * r2
            r5 = 1
            r1 = r13
            r2 = r19
            r1.drawArc(r2, r3, r4, r5, r6)
            float r1 = r16 * r9
            float r1 = r15 - r1
            r13.translate(r1, r11)
            r3 = 0
            float r8 = r8 * r10
            int r1 = r0.arcDirectionFactor
            float r1 = (float) r1
            float r4 = r8 * r1
            r1 = r13
            r1.drawArc(r2, r3, r4, r5, r6)
            r13.restore()
            return
    }

    private int getSize() {
            r2 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r2.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.indicatorSize
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r2.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            int r1 = r1.indicatorInset
            int r1 = r1 * 2
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(android.graphics.Canvas r5, float r6) {
            r4 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r4.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.indicatorSize
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r4.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r2 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r2
            int r2 = r2.indicatorInset
            float r2 = (float) r2
            float r0 = r0 + r2
            r5.translate(r0, r0)
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r5.rotate(r2)
            float r2 = -r0
            r5.clipRect(r2, r2, r0, r0)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r5 = r4.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r5 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r5
            int r5 = r5.indicatorDirection
            r0 = 1
            if (r5 != 0) goto L29
            r5 = r0
            goto L2a
        L29:
            r5 = -1
        L2a:
            r4.arcDirectionFactor = r5
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r5 = r4.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r5 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r5
            int r5 = r5.trackThickness
            float r5 = (float) r5
            float r5 = r5 * r6
            r4.displayedTrackThickness = r5
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r5 = r4.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r5 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r5
            int r5 = r5.trackCornerRadius
            float r5 = (float) r5
            float r5 = r5 * r6
            r4.displayedCornerRadius = r5
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r5 = r4.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r5 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r5
            int r5 = r5.indicatorSize
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r4.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r2 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r2
            int r2 = r2.trackThickness
            int r5 = r5 - r2
            float r5 = (float) r5
            float r5 = r5 / r1
            r4.adjustedRadius = r5
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r5 = r4.drawable
            boolean r5 = r5.isShowing()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 2
            if (r5 == 0) goto L64
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r5 = r4.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r5 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r5
            int r5 = r5.showAnimationBehavior
            if (r5 == r3) goto L74
        L64:
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r5 = r4.drawable
            boolean r5 = r5.isHiding()
            if (r5 == 0) goto L84
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r5 = r4.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r5 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r5
            int r5 = r5.hideAnimationBehavior
            if (r5 != r0) goto L84
        L74:
            float r5 = r4.adjustedRadius
            float r2 = r2 - r6
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r6 = r4.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r6 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r6
            int r6 = r6.trackThickness
            float r6 = (float) r6
            float r2 = r2 * r6
            float r2 = r2 / r1
            float r5 = r5 + r2
            r4.adjustedRadius = r5
            goto Lb3
        L84:
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r5 = r4.drawable
            boolean r5 = r5.isShowing()
            if (r5 == 0) goto L94
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r5 = r4.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r5 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r5
            int r5 = r5.showAnimationBehavior
            if (r5 == r0) goto La4
        L94:
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r5 = r4.drawable
            boolean r5 = r5.isHiding()
            if (r5 == 0) goto Lb3
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r5 = r4.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r5 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r5
            int r5 = r5.hideAnimationBehavior
            if (r5 != r3) goto Lb3
        La4:
            float r5 = r4.adjustedRadius
            float r2 = r2 - r6
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r6 = r4.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r6 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r6
            int r6 = r6.trackThickness
            float r6 = (float) r6
            float r2 = r2 * r6
            float r2 = r2 / r1
            float r5 = r5 - r2
            r4.adjustedRadius = r5
        Lb3:
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillIndicator(android.graphics.Canvas r14, android.graphics.Paint r15, float r16, float r17, int r18) {
            r13 = this;
            r8 = r13
            r9 = r15
            int r0 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r15.setStyle(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            r15.setStrokeCap(r0)
            r0 = 1
            r15.setAntiAlias(r0)
            r0 = r18
            r15.setColor(r0)
            float r0 = r8.displayedTrackThickness
            r15.setStrokeWidth(r0)
            r6 = 1135869952(0x43b40000, float:360.0)
            float r0 = r16 * r6
            int r1 = r8.arcDirectionFactor
            float r2 = (float) r1
            float r10 = r0 * r2
            int r0 = (r17 > r16 ? 1 : (r17 == r16 ? 0 : -1))
            if (r0 < 0) goto L2f
            float r0 = r17 - r16
            goto L35
        L2f:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r17 + r0
            float r0 = r0 - r16
        L35:
            float r0 = r0 * r6
            float r1 = (float) r1
            float r0 = r0 * r1
            r11 = r0
            android.graphics.RectF r1 = new android.graphics.RectF
            float r0 = r8.adjustedRadius
            float r2 = -r0
            float r3 = -r0
            r1.<init>(r2, r3, r0, r0)
            r4 = 0
            r0 = r14
            r2 = r10
            r3 = r11
            r5 = r15
            r0.drawArc(r1, r2, r3, r4, r5)
            float r0 = r8.displayedCornerRadius
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7e
            float r0 = java.lang.Math.abs(r11)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L7e
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r15.setStyle(r0)
            android.graphics.RectF r12 = new android.graphics.RectF
            float r0 = r8.displayedCornerRadius
            float r1 = -r0
            float r2 = -r0
            r12.<init>(r1, r2, r0, r0)
            float r3 = r8.displayedTrackThickness
            float r4 = r8.displayedCornerRadius
            r6 = 1
            r0 = r13
            r1 = r14
            r2 = r15
            r5 = r10
            r7 = r12
            r0.drawRoundedEnd(r1, r2, r3, r4, r5, r6, r7)
            float r3 = r8.displayedTrackThickness
            float r4 = r8.displayedCornerRadius
            float r5 = r10 + r11
            r6 = 0
            r0.drawRoundedEnd(r1, r2, r3, r4, r5, r6, r7)
        L7e:
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillTrack(android.graphics.Canvas r8, android.graphics.Paint r9) {
            r7 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.trackColor
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r1 = r7.drawable
            int r1 = r1.getAlpha()
            int r0 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r0, r1)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r9.setStyle(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.BUTT
            r9.setStrokeCap(r1)
            r1 = 1
            r9.setAntiAlias(r1)
            r9.setColor(r0)
            float r0 = r7.displayedTrackThickness
            r9.setStrokeWidth(r0)
            android.graphics.RectF r2 = new android.graphics.RectF
            float r0 = r7.adjustedRadius
            float r1 = -r0
            float r3 = -r0
            r2.<init>(r1, r3, r0, r0)
            r3 = 0
            r4 = 1135869952(0x43b40000, float:360.0)
            r5 = 0
            r1 = r8
            r6 = r9
            r1.drawArc(r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
