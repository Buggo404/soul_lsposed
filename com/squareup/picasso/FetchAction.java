package com.squareup.picasso;

/* loaded from: classes.dex */
class FetchAction extends com.squareup.picasso.Action<java.lang.Object> {
    private com.squareup.picasso.Callback callback;
    private final java.lang.Object target;

    FetchAction(com.squareup.picasso.Picasso r13, com.squareup.picasso.Request r14, int r15, int r16, java.lang.Object r17, java.lang.String r18, com.squareup.picasso.Callback r19) {
            r12 = this;
            r11 = r12
            r2 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r8 = r18
            r9 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r11.target = r0
            r0 = r19
            r11.callback = r0
            return
    }

    @Override // com.squareup.picasso.Action
    void cancel() {
            r1 = this;
            super.cancel()
            r0 = 0
            r1.callback = r0
            return
    }

    @Override // com.squareup.picasso.Action
    void complete(android.graphics.Bitmap r1, com.squareup.picasso.Picasso.LoadedFrom r2) {
            r0 = this;
            com.squareup.picasso.Callback r1 = r0.callback
            if (r1 == 0) goto L7
            r1.onSuccess()
        L7:
            return
    }

    @Override // com.squareup.picasso.Action
    void error() {
            r1 = this;
            com.squareup.picasso.Callback r0 = r1.callback
            if (r0 == 0) goto L7
            r0.onError()
        L7:
            return
    }

    @Override // com.squareup.picasso.Action
    java.lang.Object getTarget() {
            r1 = this;
            java.lang.Object r0 = r1.target
            return r0
    }
}
