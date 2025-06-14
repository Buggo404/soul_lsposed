package com.squareup.picasso;

/* loaded from: classes.dex */
class DeferredRequestCreator implements android.view.ViewTreeObserver.OnPreDrawListener {
    com.squareup.picasso.Callback callback;
    final com.squareup.picasso.RequestCreator creator;
    final java.lang.ref.WeakReference<android.widget.ImageView> target;

    DeferredRequestCreator(com.squareup.picasso.RequestCreator r2, android.widget.ImageView r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    DeferredRequestCreator(com.squareup.picasso.RequestCreator r1, android.widget.ImageView r2, com.squareup.picasso.Callback r3) {
            r0 = this;
            r0.<init>()
            r0.creator = r1
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r0.target = r1
            r0.callback = r3
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            r1.addOnPreDrawListener(r0)
            return
    }

    void cancel() {
            r2 = this;
            r0 = 0
            r2.callback = r0
            java.lang.ref.WeakReference<android.widget.ImageView> r0 = r2.target
            java.lang.Object r0 = r0.get()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 != 0) goto Le
            return
        Le:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            boolean r1 = r0.isAlive()
            if (r1 != 0) goto L19
            return
        L19:
            r0.removeOnPreDrawListener(r2)
            return
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
            r5 = this;
            java.lang.ref.WeakReference<android.widget.ImageView> r0 = r5.target
            java.lang.Object r0 = r0.get()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1 = 1
            if (r0 != 0) goto Lc
            return r1
        Lc:
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            boolean r3 = r2.isAlive()
            if (r3 != 0) goto L17
            return r1
        L17:
            int r3 = r0.getWidth()
            int r4 = r0.getHeight()
            if (r3 <= 0) goto L36
            if (r4 > 0) goto L24
            goto L36
        L24:
            r2.removeOnPreDrawListener(r5)
            com.squareup.picasso.RequestCreator r2 = r5.creator
            com.squareup.picasso.RequestCreator r2 = r2.unfit()
            com.squareup.picasso.RequestCreator r2 = r2.resize(r3, r4)
            com.squareup.picasso.Callback r3 = r5.callback
            r2.into(r0, r3)
        L36:
            return r1
    }
}
