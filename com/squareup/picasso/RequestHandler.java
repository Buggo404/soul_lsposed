package com.squareup.picasso;

/* loaded from: classes.dex */
public abstract class RequestHandler {

    public static final class Result {
        private final android.graphics.Bitmap bitmap;
        private final int exifOrientation;
        private final com.squareup.picasso.Picasso.LoadedFrom loadedFrom;
        private final java.io.InputStream stream;

        public Result(android.graphics.Bitmap r3, com.squareup.picasso.Picasso.LoadedFrom r4) {
                r2 = this;
                java.lang.String r0 = "bitmap == null"
                java.lang.Object r3 = com.squareup.picasso.Utils.checkNotNull(r3, r0)
                android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
                r0 = 0
                r1 = 0
                r2.<init>(r3, r0, r4, r1)
                return
        }

        Result(android.graphics.Bitmap r4, java.io.InputStream r5, com.squareup.picasso.Picasso.LoadedFrom r6, int r7) {
                r3 = this;
                r3.<init>()
                r0 = 1
                r1 = 0
                if (r4 == 0) goto L9
                r2 = r0
                goto La
            L9:
                r2 = r1
            La:
                if (r5 == 0) goto Ld
                goto Le
            Ld:
                r0 = r1
            Le:
                r0 = r0 ^ r2
                if (r0 == 0) goto L22
                r3.bitmap = r4
                r3.stream = r5
                java.lang.String r4 = "loadedFrom == null"
                java.lang.Object r4 = com.squareup.picasso.Utils.checkNotNull(r6, r4)
                com.squareup.picasso.Picasso$LoadedFrom r4 = (com.squareup.picasso.Picasso.LoadedFrom) r4
                r3.loadedFrom = r4
                r3.exifOrientation = r7
                return
            L22:
                java.lang.AssertionError r4 = new java.lang.AssertionError
                r4.<init>()
                throw r4
        }

        public Result(java.io.InputStream r3, com.squareup.picasso.Picasso.LoadedFrom r4) {
                r2 = this;
                java.lang.String r0 = "stream == null"
                java.lang.Object r3 = com.squareup.picasso.Utils.checkNotNull(r3, r0)
                java.io.InputStream r3 = (java.io.InputStream) r3
                r0 = 0
                r1 = 0
                r2.<init>(r1, r3, r4, r0)
                return
        }

        public android.graphics.Bitmap getBitmap() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.bitmap
                return r0
        }

        int getExifOrientation() {
                r1 = this;
                int r0 = r1.exifOrientation
                return r0
        }

        public com.squareup.picasso.Picasso.LoadedFrom getLoadedFrom() {
                r1 = this;
                com.squareup.picasso.Picasso$LoadedFrom r0 = r1.loadedFrom
                return r0
        }

        public java.io.InputStream getStream() {
                r1 = this;
                java.io.InputStream r0 = r1.stream
                return r0
        }
    }

    public RequestHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    static void calculateInSampleSize(int r2, int r3, int r4, int r5, android.graphics.BitmapFactory.Options r6, com.squareup.picasso.Request r7) {
            if (r5 > r3) goto L7
            if (r4 <= r2) goto L5
            goto L7
        L5:
            r2 = 1
            goto L3d
        L7:
            if (r3 != 0) goto L13
            float r3 = (float) r4
            float r2 = (float) r2
            float r3 = r3 / r2
            double r2 = (double) r3
            double r2 = java.lang.Math.floor(r2)
        L11:
            int r2 = (int) r2
            goto L3d
        L13:
            if (r2 != 0) goto L1e
            float r2 = (float) r5
            float r3 = (float) r3
            float r2 = r2 / r3
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            goto L11
        L1e:
            float r5 = (float) r5
            float r3 = (float) r3
            float r5 = r5 / r3
            double r0 = (double) r5
            double r0 = java.lang.Math.floor(r0)
            int r3 = (int) r0
            float r4 = (float) r4
            float r2 = (float) r2
            float r4 = r4 / r2
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            int r2 = (int) r4
            boolean r4 = r7.centerInside
            if (r4 == 0) goto L39
            int r2 = java.lang.Math.max(r3, r2)
            goto L3d
        L39:
            int r2 = java.lang.Math.min(r3, r2)
        L3d:
            r6.inSampleSize = r2
            r2 = 0
            r6.inJustDecodeBounds = r2
            return
    }

    static void calculateInSampleSize(int r6, int r7, android.graphics.BitmapFactory.Options r8, com.squareup.picasso.Request r9) {
            int r2 = r8.outWidth
            int r3 = r8.outHeight
            r0 = r6
            r1 = r7
            r4 = r8
            r5 = r9
            calculateInSampleSize(r0, r1, r2, r3, r4, r5)
            return
    }

    static android.graphics.BitmapFactory.Options createBitmapOptions(com.squareup.picasso.Request r3) {
            boolean r0 = r3.hasSize()
            android.graphics.Bitmap$Config r1 = r3.config
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r0 != 0) goto L12
            if (r1 == 0) goto L10
            goto L12
        L10:
            r3 = 0
            goto L20
        L12:
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r2.inJustDecodeBounds = r0
            if (r1 == 0) goto L1f
            android.graphics.Bitmap$Config r3 = r3.config
            r2.inPreferredConfig = r3
        L1f:
            r3 = r2
        L20:
            return r3
    }

    static boolean requiresInSampleSize(android.graphics.BitmapFactory.Options r0) {
            if (r0 == 0) goto L8
            boolean r0 = r0.inJustDecodeBounds
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public abstract boolean canHandleRequest(com.squareup.picasso.Request r1);

    int getRetryCount() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request r1, int r2) throws java.io.IOException;

    boolean shouldRetry(boolean r1, android.net.NetworkInfo r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    boolean supportsReplay() {
            r1 = this;
            r0 = 0
            return r0
    }
}
