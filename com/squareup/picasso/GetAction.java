package com.squareup.picasso;

/* loaded from: classes.dex */
class GetAction extends com.squareup.picasso.Action<java.lang.Void> {
    GetAction(com.squareup.picasso.Picasso r12, com.squareup.picasso.Request r13, int r14, int r15, java.lang.Object r16, java.lang.String r17) {
            r11 = this;
            r2 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r8 = r17
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // com.squareup.picasso.Action
    void complete(android.graphics.Bitmap r1, com.squareup.picasso.Picasso.LoadedFrom r2) {
            r0 = this;
            return
    }

    @Override // com.squareup.picasso.Action
    public void error() {
            r0 = this;
            return
    }
}
