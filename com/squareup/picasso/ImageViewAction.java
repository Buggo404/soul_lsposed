package com.squareup.picasso;

/* loaded from: classes.dex */
class ImageViewAction extends com.squareup.picasso.Action<android.widget.ImageView> {
    com.squareup.picasso.Callback callback;

    ImageViewAction(com.squareup.picasso.Picasso r12, android.widget.ImageView r13, com.squareup.picasso.Request r14, int r15, int r16, int r17, android.graphics.drawable.Drawable r18, java.lang.String r19, java.lang.Object r20, com.squareup.picasso.Callback r21, boolean r22) {
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r21
            r0.callback = r1
            return
    }

    @Override // com.squareup.picasso.Action
    void cancel() {
            r1 = this;
            super.cancel()
            com.squareup.picasso.Callback r0 = r1.callback
            if (r0 == 0) goto La
            r0 = 0
            r1.callback = r0
        La:
            return
    }

    @Override // com.squareup.picasso.Action
    public void complete(android.graphics.Bitmap r8, com.squareup.picasso.Picasso.LoadedFrom r9) {
            r7 = this;
            if (r8 == 0) goto L25
            java.lang.ref.WeakReference<T> r0 = r7.target
            java.lang.Object r0 = r0.get()
            r1 = r0
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 != 0) goto Le
            return
        Le:
            com.squareup.picasso.Picasso r0 = r7.picasso
            android.content.Context r2 = r0.context
            com.squareup.picasso.Picasso r0 = r7.picasso
            boolean r6 = r0.indicatorsEnabled
            boolean r5 = r7.noFade
            r3 = r8
            r4 = r9
            com.squareup.picasso.PicassoDrawable.setBitmap(r1, r2, r3, r4, r5, r6)
            com.squareup.picasso.Callback r8 = r7.callback
            if (r8 == 0) goto L24
            r8.onSuccess()
        L24:
            return
        L25:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r0 = 0
            r9[r0] = r7
            java.lang.String r0 = "Attempted to complete action with no result!\n%s"
            java.lang.String r9 = java.lang.String.format(r0, r9)
            r8.<init>(r9)
            throw r8
    }

    @Override // com.squareup.picasso.Action
    public void error() {
            r2 = this;
            java.lang.ref.WeakReference<T> r0 = r2.target
            java.lang.Object r0 = r0.get()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            int r1 = r2.errorResId
            if (r1 == 0) goto L15
            int r1 = r2.errorResId
            r0.setImageResource(r1)
            goto L1e
        L15:
            android.graphics.drawable.Drawable r1 = r2.errorDrawable
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.errorDrawable
            r0.setImageDrawable(r1)
        L1e:
            com.squareup.picasso.Callback r0 = r2.callback
            if (r0 == 0) goto L25
            r0.onError()
        L25:
            return
    }
}
