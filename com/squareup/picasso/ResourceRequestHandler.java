package com.squareup.picasso;

/* loaded from: classes.dex */
class ResourceRequestHandler extends com.squareup.picasso.RequestHandler {
    private final android.content.Context context;

    ResourceRequestHandler(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    private static android.graphics.Bitmap decodeResource(android.content.res.Resources r3, int r4, com.squareup.picasso.Request r5) {
            android.graphics.BitmapFactory$Options r0 = createBitmapOptions(r5)
            boolean r1 = requiresInSampleSize(r0)
            if (r1 == 0) goto L14
            android.graphics.BitmapFactory.decodeResource(r3, r4, r0)
            int r1 = r5.targetWidth
            int r2 = r5.targetHeight
            calculateInSampleSize(r1, r2, r0, r5)
        L14:
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeResource(r3, r4, r0)
            return r3
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(com.squareup.picasso.Request r2) {
            r1 = this;
            int r0 = r2.resourceId
            if (r0 == 0) goto L6
            r2 = 1
            return r2
        L6:
            android.net.Uri r2 = r2.uri
            java.lang.String r2 = r2.getScheme()
            java.lang.String r0 = "android.resource"
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.squareup.picasso.RequestHandler
    public com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request r3, int r4) throws java.io.IOException {
            r2 = this;
            android.content.Context r4 = r2.context
            android.content.res.Resources r4 = com.squareup.picasso.Utils.getResources(r4, r3)
            int r0 = com.squareup.picasso.Utils.getResourceId(r4, r3)
            com.squareup.picasso.RequestHandler$Result r1 = new com.squareup.picasso.RequestHandler$Result
            android.graphics.Bitmap r3 = decodeResource(r4, r0, r3)
            com.squareup.picasso.Picasso$LoadedFrom r4 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r1.<init>(r3, r4)
            return r1
    }
}
