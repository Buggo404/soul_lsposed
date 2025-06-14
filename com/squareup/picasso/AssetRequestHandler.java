package com.squareup.picasso;

/* loaded from: classes.dex */
class AssetRequestHandler extends com.squareup.picasso.RequestHandler {
    protected static final java.lang.String ANDROID_ASSET = "android_asset";
    private static final int ASSET_PREFIX_LENGTH = 22;
    private final android.content.res.AssetManager assetManager;

    static {
            return
    }

    public AssetRequestHandler(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.res.AssetManager r1 = r1.getAssets()
            r0.assetManager = r1
            return
    }

    static java.lang.String getFilePath(com.squareup.picasso.Request r1) {
            android.net.Uri r1 = r1.uri
            java.lang.String r1 = r1.toString()
            int r0 = com.squareup.picasso.AssetRequestHandler.ASSET_PREFIX_LENGTH
            java.lang.String r1 = r1.substring(r0)
            return r1
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(com.squareup.picasso.Request r3) {
            r2 = this;
            android.net.Uri r3 = r3.uri
            java.lang.String r0 = "file"
            java.lang.String r1 = r3.getScheme()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L2a
            java.util.List r0 = r3.getPathSegments()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2a
            java.util.List r3 = r3.getPathSegments()
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r0 = "android_asset"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L2a
            r1 = 1
        L2a:
            return r1
    }

    @Override // com.squareup.picasso.RequestHandler
    public com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request r2, int r3) throws java.io.IOException {
            r1 = this;
            android.content.res.AssetManager r3 = r1.assetManager
            java.lang.String r2 = getFilePath(r2)
            java.io.InputStream r2 = r3.open(r2)
            com.squareup.picasso.RequestHandler$Result r3 = new com.squareup.picasso.RequestHandler$Result
            com.squareup.picasso.Picasso$LoadedFrom r0 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r3.<init>(r2, r0)
            return r3
    }
}
