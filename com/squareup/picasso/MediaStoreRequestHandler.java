package com.squareup.picasso;

/* loaded from: classes.dex */
class MediaStoreRequestHandler extends com.squareup.picasso.ContentStreamRequestHandler {
    private static final java.lang.String[] CONTENT_ORIENTATION = null;

    enum PicassoKind extends java.lang.Enum<com.squareup.picasso.MediaStoreRequestHandler.PicassoKind> {
        private static final /* synthetic */ com.squareup.picasso.MediaStoreRequestHandler.PicassoKind[] $VALUES = null;
        public static final com.squareup.picasso.MediaStoreRequestHandler.PicassoKind FULL = null;
        public static final com.squareup.picasso.MediaStoreRequestHandler.PicassoKind MICRO = null;
        public static final com.squareup.picasso.MediaStoreRequestHandler.PicassoKind MINI = null;
        final int androidKind;
        final int height;
        final int width;

        static {
                com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r6 = new com.squareup.picasso.MediaStoreRequestHandler$PicassoKind
                java.lang.String r1 = "MICRO"
                r2 = 0
                r3 = 3
                r4 = 96
                r5 = 96
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MICRO = r6
                com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r0 = new com.squareup.picasso.MediaStoreRequestHandler$PicassoKind
                java.lang.String r8 = "MINI"
                r9 = 1
                r10 = 1
                r11 = 512(0x200, float:7.175E-43)
                r12 = 384(0x180, float:5.38E-43)
                r7 = r0
                r7.<init>(r8, r9, r10, r11, r12)
                com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MINI = r0
                com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r1 = new com.squareup.picasso.MediaStoreRequestHandler$PicassoKind
                java.lang.String r14 = "FULL"
                r15 = 2
                r16 = 2
                r17 = -1
                r18 = -1
                r13 = r1
                r13.<init>(r14, r15, r16, r17, r18)
                com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.FULL = r1
                r2 = 3
                com.squareup.picasso.MediaStoreRequestHandler$PicassoKind[] r2 = new com.squareup.picasso.MediaStoreRequestHandler.PicassoKind[r2]
                r3 = 0
                r2[r3] = r6
                r3 = 1
                r2[r3] = r0
                r0 = 2
                r2[r0] = r1
                com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.$VALUES = r2
                return
        }

        PicassoKind(java.lang.String r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.androidKind = r3
                r0.width = r4
                r0.height = r5
                return
        }

        public static com.squareup.picasso.MediaStoreRequestHandler.PicassoKind valueOf(java.lang.String r1) {
                java.lang.Class<com.squareup.picasso.MediaStoreRequestHandler$PicassoKind> r0 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r1 = (com.squareup.picasso.MediaStoreRequestHandler.PicassoKind) r1
                return r1
        }

        public static com.squareup.picasso.MediaStoreRequestHandler.PicassoKind[] values() {
                com.squareup.picasso.MediaStoreRequestHandler$PicassoKind[] r0 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.$VALUES
                java.lang.Object r0 = r0.clone()
                com.squareup.picasso.MediaStoreRequestHandler$PicassoKind[] r0 = (com.squareup.picasso.MediaStoreRequestHandler.PicassoKind[]) r0
                return r0
        }
    }

    static {
            java.lang.String r0 = "orientation"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.squareup.picasso.MediaStoreRequestHandler.CONTENT_ORIENTATION = r0
            return
    }

    MediaStoreRequestHandler(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static int getExifOrientation(android.content.ContentResolver r8, android.net.Uri r9) {
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = com.squareup.picasso.MediaStoreRequestHandler.CONTENT_ORIENTATION     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L2d
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L2d
            if (r1 == 0) goto L20
            boolean r8 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L2d
            if (r8 != 0) goto L16
            goto L20
        L16:
            int r8 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L2d
            if (r1 == 0) goto L1f
            r1.close()
        L1f:
            return r8
        L20:
            if (r1 == 0) goto L25
            r1.close()
        L25:
            return r0
        L26:
            r8 = move-exception
            if (r1 == 0) goto L2c
            r1.close()
        L2c:
            throw r8
        L2d:
            if (r1 == 0) goto L32
            r1.close()
        L32:
            return r0
    }

    static com.squareup.picasso.MediaStoreRequestHandler.PicassoKind getPicassoKind(int r1, int r2) {
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r0 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MICRO
            int r0 = r0.width
            if (r1 > r0) goto Lf
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r0 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MICRO
            int r0 = r0.height
            if (r2 > r0) goto Lf
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r1 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MICRO
            return r1
        Lf:
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r0 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MINI
            int r0 = r0.width
            if (r1 > r0) goto L1e
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r1 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MINI
            int r1 = r1.height
            if (r2 > r1) goto L1e
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r1 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MINI
            return r1
        L1e:
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r1 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.FULL
            return r1
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(com.squareup.picasso.Request r3) {
            r2 = this;
            android.net.Uri r3 = r3.uri
            java.lang.String r0 = "content"
            java.lang.String r1 = r3.getScheme()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            java.lang.String r0 = "media"
            java.lang.String r3 = r3.getAuthority()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            return r3
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request r17, int r18) throws java.io.IOException {
            r16 = this;
            r6 = r17
            r7 = r16
            android.content.Context r0 = r7.context
            android.content.ContentResolver r8 = r0.getContentResolver()
            android.net.Uri r0 = r6.uri
            int r9 = getExifOrientation(r8, r0)
            android.net.Uri r0 = r6.uri
            java.lang.String r0 = r8.getType(r0)
            r10 = 1
            if (r0 == 0) goto L23
            java.lang.String r1 = "video/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L23
            r11 = r10
            goto L25
        L23:
            r0 = 0
            r11 = r0
        L25:
            boolean r0 = r17.hasSize()
            r12 = 0
            if (r0 == 0) goto L80
            int r0 = r6.targetWidth
            int r1 = r6.targetHeight
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r13 = getPicassoKind(r0, r1)
            if (r11 != 0) goto L46
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r0 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.FULL
            if (r13 != r0) goto L46
            com.squareup.picasso.RequestHandler$Result r0 = new com.squareup.picasso.RequestHandler$Result
            java.io.InputStream r1 = r16.getInputStream(r17)
            com.squareup.picasso.Picasso$LoadedFrom r2 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r0.<init>(r12, r1, r2, r9)
            return r0
        L46:
            android.net.Uri r0 = r6.uri
            long r14 = android.content.ContentUris.parseId(r0)
            android.graphics.BitmapFactory$Options r5 = createBitmapOptions(r17)
            r5.inJustDecodeBounds = r10
            int r0 = r6.targetWidth
            int r1 = r6.targetHeight
            int r2 = r13.width
            int r3 = r13.height
            r4 = r5
            r10 = r5
            r5 = r17
            calculateInSampleSize(r0, r1, r2, r3, r4, r5)
            if (r11 == 0) goto L70
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r0 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.FULL
            if (r13 != r0) goto L69
            r0 = 1
            goto L6b
        L69:
            int r0 = r13.androidKind
        L6b:
            android.graphics.Bitmap r0 = android.provider.MediaStore.Video.Thumbnails.getThumbnail(r8, r14, r0, r10)
            goto L76
        L70:
            int r0 = r13.androidKind
            android.graphics.Bitmap r0 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r8, r14, r0, r10)
        L76:
            if (r0 == 0) goto L80
            com.squareup.picasso.RequestHandler$Result r1 = new com.squareup.picasso.RequestHandler$Result
            com.squareup.picasso.Picasso$LoadedFrom r2 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r1.<init>(r0, r12, r2, r9)
            return r1
        L80:
            com.squareup.picasso.RequestHandler$Result r0 = new com.squareup.picasso.RequestHandler$Result
            java.io.InputStream r1 = r16.getInputStream(r17)
            com.squareup.picasso.Picasso$LoadedFrom r2 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r0.<init>(r12, r1, r2, r9)
            return r0
    }
}
