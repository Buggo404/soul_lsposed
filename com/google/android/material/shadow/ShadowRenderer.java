package com.google.android.material.shadow;

/* loaded from: classes.dex */
public class ShadowRenderer {
    private static final int COLOR_ALPHA_END = 0;
    private static final int COLOR_ALPHA_MIDDLE = 20;
    private static final int COLOR_ALPHA_START = 68;
    private static final int[] cornerColors = null;
    private static final float[] cornerPositions = null;
    private static final int[] edgeColors = null;
    private static final float[] edgePositions = null;
    private final android.graphics.Paint cornerShadowPaint;
    private final android.graphics.Paint edgeShadowPaint;
    private final android.graphics.Path scratch;
    private int shadowEndColor;
    private int shadowMiddleColor;
    private final android.graphics.Paint shadowPaint;
    private int shadowStartColor;
    private android.graphics.Paint transparentPaint;

    static {
            r0 = 3
            int[] r1 = new int[r0]
            com.google.android.material.shadow.ShadowRenderer.edgeColors = r1
            float[] r0 = new float[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [0, 1056964608, 1065353216} // fill-array
            com.google.android.material.shadow.ShadowRenderer.edgePositions = r0
            r0 = 4
            int[] r1 = new int[r0]
            com.google.android.material.shadow.ShadowRenderer.cornerColors = r1
            float[] r0 = new float[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [0, 0, 1056964608, 1065353216} // fill-array
            com.google.android.material.shadow.ShadowRenderer.cornerPositions = r0
            return
    }

    public ShadowRenderer() {
            r1 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.<init>(r0)
            return
    }

    public ShadowRenderer(int r2) {
            r1 = this;
            r1.<init>()
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.scratch = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.transparentPaint = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.shadowPaint = r0
            r1.setShadowColor(r2)
            android.graphics.Paint r2 = r1.transparentPaint
            r0 = 0
            r2.setColor(r0)
            android.graphics.Paint r2 = new android.graphics.Paint
            r0 = 4
            r2.<init>(r0)
            r1.cornerShadowPaint = r2
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r2.setStyle(r0)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r2)
            r1.edgeShadowPaint = r0
            return
    }

    public void drawCornerShadow(android.graphics.Canvas r21, android.graphics.Matrix r22, android.graphics.RectF r23, int r24, float r25, float r26) {
            r20 = this;
            r0 = r20
            r7 = r21
            r2 = r23
            r1 = r24
            r4 = r26
            r3 = 0
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            r6 = 1
            r8 = 0
            if (r5 >= 0) goto L13
            r5 = r6
            goto L14
        L13:
            r5 = r8
        L14:
            android.graphics.Path r9 = r0.scratch
            r10 = 3
            r11 = 2
            if (r5 == 0) goto L2d
            int[] r12 = com.google.android.material.shadow.ShadowRenderer.cornerColors
            r12[r8] = r8
            int r8 = r0.shadowEndColor
            r12[r6] = r8
            int r8 = r0.shadowMiddleColor
            r12[r11] = r8
            int r8 = r0.shadowStartColor
            r12[r10] = r8
            r12 = r25
            goto L58
        L2d:
            r9.rewind()
            float r12 = r23.centerX()
            float r13 = r23.centerY()
            r9.moveTo(r12, r13)
            r12 = r25
            r9.arcTo(r2, r12, r4)
            r9.close()
            int r13 = -r1
            float r13 = (float) r13
            r2.inset(r13, r13)
            int[] r13 = com.google.android.material.shadow.ShadowRenderer.cornerColors
            r13[r8] = r8
            int r8 = r0.shadowStartColor
            r13[r6] = r8
            int r8 = r0.shadowMiddleColor
            r13[r11] = r8
            int r8 = r0.shadowEndColor
            r13[r10] = r8
        L58:
            float r8 = r23.width()
            r10 = 1073741824(0x40000000, float:2.0)
            float r16 = r8 / r10
            int r3 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r3 > 0) goto L65
            return
        L65:
            float r1 = (float) r1
            float r1 = r1 / r16
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = r3 - r1
            float r3 = r3 - r1
            float r3 = r3 / r10
            float r3 = r3 + r1
            float[] r18 = com.google.android.material.shadow.ShadowRenderer.cornerPositions
            r18[r6] = r1
            r18[r11] = r3
            android.graphics.Paint r1 = r0.cornerShadowPaint
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            float r14 = r23.centerX()
            float r15 = r23.centerY()
            int[] r17 = com.google.android.material.shadow.ShadowRenderer.cornerColors
            android.graphics.Shader$TileMode r19 = android.graphics.Shader.TileMode.CLAMP
            r13 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r1.setShader(r3)
            r21.save()
            r21.concat(r22)
            if (r5 != 0) goto L9e
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r7.clipPath(r9, r1)
            android.graphics.Paint r1 = r0.transparentPaint
            r7.drawPath(r9, r1)
        L9e:
            r5 = 1
            android.graphics.Paint r6 = r0.cornerShadowPaint
            r1 = r21
            r2 = r23
            r3 = r25
            r4 = r26
            r1.drawArc(r2, r3, r4, r5, r6)
            r21.restore()
            return
    }

    public void drawEdgeShadow(android.graphics.Canvas r10, android.graphics.Matrix r11, android.graphics.RectF r12, int r13) {
            r9 = this;
            float r0 = r12.bottom
            float r1 = (float) r13
            float r0 = r0 + r1
            r12.bottom = r0
            int r13 = -r13
            float r13 = (float) r13
            r0 = 0
            r12.offset(r0, r13)
            int[] r6 = com.google.android.material.shadow.ShadowRenderer.edgeColors
            r13 = 0
            int r0 = r9.shadowEndColor
            r6[r13] = r0
            r13 = 1
            int r0 = r9.shadowMiddleColor
            r6[r13] = r0
            r13 = 2
            int r0 = r9.shadowStartColor
            r6[r13] = r0
            android.graphics.Paint r13 = r9.edgeShadowPaint
            android.graphics.LinearGradient r0 = new android.graphics.LinearGradient
            float r2 = r12.left
            float r3 = r12.top
            float r4 = r12.left
            float r5 = r12.bottom
            float[] r7 = com.google.android.material.shadow.ShadowRenderer.edgePositions
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.CLAMP
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r13.setShader(r0)
            r10.save()
            r10.concat(r11)
            android.graphics.Paint r11 = r9.edgeShadowPaint
            r10.drawRect(r12, r11)
            r10.restore()
            return
    }

    public android.graphics.Paint getShadowPaint() {
            r1 = this;
            android.graphics.Paint r0 = r1.shadowPaint
            return r0
    }

    public void setShadowColor(int r2) {
            r1 = this;
            r0 = 68
            int r0 = androidx.core.graphics.ColorUtils.setAlphaComponent(r2, r0)
            r1.shadowStartColor = r0
            r0 = 20
            int r0 = androidx.core.graphics.ColorUtils.setAlphaComponent(r2, r0)
            r1.shadowMiddleColor = r0
            r0 = 0
            int r2 = androidx.core.graphics.ColorUtils.setAlphaComponent(r2, r0)
            r1.shadowEndColor = r2
            android.graphics.Paint r2 = r1.shadowPaint
            int r0 = r1.shadowStartColor
            r2.setColor(r0)
            return
    }
}
