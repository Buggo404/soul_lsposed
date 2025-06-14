package com.squareup.picasso;

/* loaded from: classes.dex */
final class TargetAction extends com.squareup.picasso.Action<com.squareup.picasso.Target> {
    TargetAction(com.squareup.picasso.Picasso r12, com.squareup.picasso.Target r13, com.squareup.picasso.Request r14, int r15, int r16, android.graphics.drawable.Drawable r17, java.lang.String r18, java.lang.Object r19, int r20) {
            r11 = this;
            r10 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r20
            r7 = r17
            r8 = r18
            r9 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // com.squareup.picasso.Action
    void complete(android.graphics.Bitmap r2, com.squareup.picasso.Picasso.LoadedFrom r3) {
            r1 = this;
            if (r2 == 0) goto L1d
            java.lang.Object r0 = r1.getTarget()
            com.squareup.picasso.Target r0 = (com.squareup.picasso.Target) r0
            if (r0 == 0) goto L1c
            r0.onBitmapLoaded(r2, r3)
            boolean r2 = r2.isRecycled()
            if (r2 != 0) goto L14
            goto L1c
        L14:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Target callback must not recycle bitmap!"
            r2.<init>(r3)
            throw r2
        L1c:
            return
        L1d:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = 0
            r3[r0] = r1
            java.lang.String r0 = "Attempted to complete action with no result!\n%s"
            java.lang.String r3 = java.lang.String.format(r0, r3)
            r2.<init>(r3)
            throw r2
    }

    @Override // com.squareup.picasso.Action
    void error() {
            r3 = this;
            java.lang.Object r0 = r3.getTarget()
            com.squareup.picasso.Target r0 = (com.squareup.picasso.Target) r0
            if (r0 == 0) goto L23
            int r1 = r3.errorResId
            if (r1 == 0) goto L1e
            com.squareup.picasso.Picasso r1 = r3.picasso
            android.content.Context r1 = r1.context
            android.content.res.Resources r1 = r1.getResources()
            int r2 = r3.errorResId
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.onBitmapFailed(r1)
            goto L23
        L1e:
            android.graphics.drawable.Drawable r1 = r3.errorDrawable
            r0.onBitmapFailed(r1)
        L23:
            return
    }
}
