package com.google.android.material.animation;

/* loaded from: classes.dex */
public class ImageMatrixProperty extends android.util.Property<android.widget.ImageView, android.graphics.Matrix> {
    private final android.graphics.Matrix matrix;

    public ImageMatrixProperty() {
            r2 = this;
            java.lang.Class<android.graphics.Matrix> r0 = android.graphics.Matrix.class
            java.lang.String r1 = "imageMatrixProperty"
            r2.<init>(r0, r1)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.matrix = r0
            return
    }

    /* renamed from: get, reason: avoid collision after fix types in other method */
    public android.graphics.Matrix get2(android.widget.ImageView r2) {
            r1 = this;
            android.graphics.Matrix r0 = r1.matrix
            android.graphics.Matrix r2 = r2.getImageMatrix()
            r0.set(r2)
            android.graphics.Matrix r2 = r1.matrix
            return r2
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ android.graphics.Matrix get(android.widget.ImageView r1) {
            r0 = this;
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.graphics.Matrix r1 = r0.get2(r1)
            return r1
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public void set2(android.widget.ImageView r1, android.graphics.Matrix r2) {
            r0 = this;
            r1.setImageMatrix(r2)
            return
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(android.widget.ImageView r1, android.graphics.Matrix r2) {
            r0 = this;
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            r0.set2(r1, r2)
            return
    }
}
