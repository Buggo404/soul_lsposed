package com.google.android.material.progressindicator;

/* loaded from: classes.dex */
final class LinearDrawingDelegate extends com.google.android.material.progressindicator.DrawingDelegate<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float trackLength;

    public LinearDrawingDelegate(com.google.android.material.progressindicator.LinearProgressIndicatorSpec r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1133903872(0x43960000, float:300.0)
            r0.trackLength = r1
            return
    }

    private static void drawRoundedEnd(android.graphics.Canvas r10, android.graphics.Paint r11, float r12, float r13, float r14, boolean r15, android.graphics.RectF r16) {
            r6 = r10
            r0 = r12
            r1 = r13
            r10.save()
            r7 = 0
            r2 = r14
            r10.translate(r14, r7)
            if (r15 != 0) goto L12
            r2 = 1127481344(0x43340000, float:180.0)
            r10.rotate(r2)
        L12:
            float r2 = -r1
            float r3 = -r0
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r8 = r3 + r1
            r3 = 0
            float r0 = r0 / r4
            float r9 = r0 - r1
            r0 = r10
            r1 = r2
            r2 = r8
            r4 = r9
            r5 = r11
            r0.drawRect(r1, r2, r3, r4, r5)
            r10.save()
            r10.translate(r7, r8)
            r2 = 1127481344(0x43340000, float:180.0)
            r3 = 1119092736(0x42b40000, float:90.0)
            r4 = 1
            r1 = r16
            r0.drawArc(r1, r2, r3, r4, r5)
            r10.restore()
            r10.translate(r7, r9)
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r0.drawArc(r1, r2, r3, r4, r5)
            r10.restore()
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(android.graphics.Canvas r8, float r9) {
            r7 = this;
            android.graphics.Rect r0 = r8.getClipBounds()
            int r1 = r0.width()
            float r1 = (float) r1
            r7.trackLength = r1
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r1
            int r1 = r1.trackThickness
            float r1 = (float) r1
            int r2 = r0.width()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            int r4 = r0.height()
            float r4 = (float) r4
            float r4 = r4 / r3
            int r0 = r0.height()
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r5 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r5 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r5
            int r5 = r5.trackThickness
            int r0 = r0 - r5
            float r0 = (float) r0
            float r0 = r0 / r3
            r5 = 0
            float r0 = java.lang.Math.max(r5, r0)
            float r4 = r4 + r0
            r8.translate(r2, r4)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            boolean r0 = r0.drawHorizontallyInverse
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L45
            r8.scale(r2, r4)
        L45:
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r0 = r7.drawable
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L56
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            int r0 = r0.showAnimationBehavior
            r6 = 1
            if (r0 == r6) goto L67
        L56:
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r0 = r7.drawable
            boolean r0 = r0.isHiding()
            if (r0 == 0) goto L6a
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            int r0 = r0.hideAnimationBehavior
            r6 = 2
            if (r0 != r6) goto L6a
        L67:
            r8.scale(r4, r2)
        L6a:
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r0 = r7.drawable
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L7a
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r0 = r7.drawable
            boolean r0 = r0.isHiding()
            if (r0 == 0) goto L88
        L7a:
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            int r0 = r0.trackThickness
            float r0 = (float) r0
            float r2 = r9 - r4
            float r0 = r0 * r2
            float r0 = r0 / r3
            r8.translate(r5, r0)
        L88:
            float r0 = r7.trackLength
            float r2 = -r0
            float r2 = r2 / r3
            float r4 = -r1
            float r4 = r4 / r3
            float r0 = r0 / r3
            float r1 = r1 / r3
            r8.clipRect(r2, r4, r0, r1)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r8
            int r8 = r8.trackThickness
            float r8 = (float) r8
            float r8 = r8 * r9
            r7.displayedTrackThickness = r8
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r8
            int r8 = r8.trackCornerRadius
            float r8 = (float) r8
            float r8 = r8 * r9
            r7.displayedCornerRadius = r8
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(android.graphics.Canvas r12, android.graphics.Paint r13, float r14, float r15, int r16) {
            r11 = this;
            r0 = r11
            r8 = r13
            int r1 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r1 != 0) goto L7
            return
        L7:
            float r1 = r0.trackLength
            float r2 = -r1
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r4 = r0.displayedCornerRadius
            float r2 = r2 + r4
            float r5 = r4 * r3
            float r5 = r1 - r5
            float r5 = r5 * r14
            float r7 = r2 + r5
            float r2 = -r1
            float r2 = r2 / r3
            float r2 = r2 + r4
            float r4 = r4 * r3
            float r1 = r1 - r4
            float r1 = r1 * r15
            float r9 = r2 + r1
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r13.setStyle(r1)
            r1 = 1
            r13.setAntiAlias(r1)
            r1 = r16
            r13.setColor(r1)
            float r1 = r0.displayedTrackThickness
            float r2 = -r1
            float r4 = r2 / r3
            float r5 = r1 / r3
            r1 = r12
            r2 = r7
            r3 = r4
            r4 = r9
            r6 = r13
            r1.drawRect(r2, r3, r4, r5, r6)
            android.graphics.RectF r10 = new android.graphics.RectF
            float r1 = r0.displayedCornerRadius
            float r2 = -r1
            float r3 = -r1
            r10.<init>(r2, r3, r1, r1)
            float r3 = r0.displayedTrackThickness
            float r4 = r0.displayedCornerRadius
            r6 = 1
            r1 = r12
            r2 = r13
            r5 = r7
            r7 = r10
            drawRoundedEnd(r1, r2, r3, r4, r5, r6, r7)
            float r3 = r0.displayedTrackThickness
            float r4 = r0.displayedCornerRadius
            r6 = 0
            r5 = r9
            drawRoundedEnd(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillTrack(android.graphics.Canvas r13, android.graphics.Paint r14) {
            r12 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r12.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            int r0 = r0.trackColor
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r1 = r12.drawable
            int r1 = r1.getAlpha()
            int r0 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r0, r1)
            float r1 = r12.trackLength
            float r1 = -r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r3 = r12.displayedCornerRadius
            float r1 = r1 + r3
            float r11 = -r1
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r14.setStyle(r3)
            r3 = 1
            r14.setAntiAlias(r3)
            r14.setColor(r0)
            float r0 = r12.displayedTrackThickness
            float r3 = -r0
            float r6 = r3 / r2
            float r8 = r0 / r2
            r4 = r13
            r5 = r1
            r7 = r11
            r9 = r14
            r4.drawRect(r5, r6, r7, r8, r9)
            android.graphics.RectF r0 = new android.graphics.RectF
            float r2 = r12.displayedCornerRadius
            float r3 = -r2
            float r4 = -r2
            r0.<init>(r3, r4, r2, r2)
            float r6 = r12.displayedTrackThickness
            float r7 = r12.displayedCornerRadius
            r9 = 1
            r4 = r13
            r5 = r14
            r8 = r1
            r10 = r0
            drawRoundedEnd(r4, r5, r6, r7, r8, r9, r10)
            float r5 = r12.displayedTrackThickness
            float r6 = r12.displayedCornerRadius
            r8 = 0
            r3 = r13
            r4 = r14
            r7 = r11
            r9 = r0
            drawRoundedEnd(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            int r0 = r0.trackThickness
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
            r1 = this;
            r0 = -1
            return r0
    }
}
