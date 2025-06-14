package com.squareup.picasso;

/* loaded from: classes.dex */
class ContentStreamRequestHandler extends com.squareup.picasso.RequestHandler {
    final android.content.Context context;

    ContentStreamRequestHandler(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(com.squareup.picasso.Request r2) {
            r1 = this;
            android.net.Uri r2 = r2.uri
            java.lang.String r2 = r2.getScheme()
            java.lang.String r0 = "content"
            boolean r2 = r0.equals(r2)
            return r2
    }

    java.io.InputStream getInputStream(com.squareup.picasso.Request r2) throws java.io.FileNotFoundException {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.net.Uri r2 = r2.uri
            java.io.InputStream r2 = r0.openInputStream(r2)
            return r2
    }

    @Override // com.squareup.picasso.RequestHandler
    public com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request r2, int r3) throws java.io.IOException {
            r1 = this;
            com.squareup.picasso.RequestHandler$Result r3 = new com.squareup.picasso.RequestHandler$Result
            java.io.InputStream r2 = r1.getInputStream(r2)
            com.squareup.picasso.Picasso$LoadedFrom r0 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r3.<init>(r2, r0)
            return r3
    }
}
