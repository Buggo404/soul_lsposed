package com.squareup.picasso;

/* loaded from: classes.dex */
class FileRequestHandler extends com.squareup.picasso.ContentStreamRequestHandler {
    FileRequestHandler(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static int getFileExifRotation(android.net.Uri r2) throws java.io.IOException {
            android.media.ExifInterface r0 = new android.media.ExifInterface
            java.lang.String r2 = r2.getPath()
            r0.<init>(r2)
            java.lang.String r2 = "Orientation"
            r1 = 1
            int r2 = r0.getAttributeInt(r2, r1)
            r0 = 3
            if (r2 == r0) goto L22
            r0 = 6
            if (r2 == r0) goto L1f
            r0 = 8
            if (r2 == r0) goto L1c
            r2 = 0
            return r2
        L1c:
            r2 = 270(0x10e, float:3.78E-43)
            return r2
        L1f:
            r2 = 90
            return r2
        L22:
            r2 = 180(0xb4, float:2.52E-43)
            return r2
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(com.squareup.picasso.Request r2) {
            r1 = this;
            android.net.Uri r2 = r2.uri
            java.lang.String r2 = r2.getScheme()
            java.lang.String r0 = "file"
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request r4, int r5) throws java.io.IOException {
            r3 = this;
            com.squareup.picasso.RequestHandler$Result r5 = new com.squareup.picasso.RequestHandler$Result
            java.io.InputStream r0 = r3.getInputStream(r4)
            com.squareup.picasso.Picasso$LoadedFrom r1 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            android.net.Uri r4 = r4.uri
            int r4 = getFileExifRotation(r4)
            r2 = 0
            r5.<init>(r2, r0, r1, r4)
            return r5
    }
}
