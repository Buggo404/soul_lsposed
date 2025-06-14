package com.squareup.picasso;

/* loaded from: classes.dex */
public final class Request {
    private static final long TOO_LONG_LOG = 0;
    public final boolean centerCrop;
    public final boolean centerInside;
    public final android.graphics.Bitmap.Config config;
    public final boolean hasRotationPivot;

    /* renamed from: id */
    int f128id;
    int networkPolicy;
    public final boolean onlyScaleDown;
    public final com.squareup.picasso.Picasso.Priority priority;
    public final int resourceId;
    public final float rotationDegrees;
    public final float rotationPivotX;
    public final float rotationPivotY;
    public final java.lang.String stableKey;
    long started;
    public final int targetHeight;
    public final int targetWidth;
    public final java.util.List<com.squareup.picasso.Transformation> transformations;
    public final android.net.Uri uri;

    /* renamed from: com.squareup.picasso.Request$1 */
    static /* synthetic */ class C08811 {
    }

    public static final class Builder {
        private boolean centerCrop;
        private boolean centerInside;
        private android.graphics.Bitmap.Config config;
        private boolean hasRotationPivot;
        private boolean onlyScaleDown;
        private com.squareup.picasso.Picasso.Priority priority;
        private int resourceId;
        private float rotationDegrees;
        private float rotationPivotX;
        private float rotationPivotY;
        private java.lang.String stableKey;
        private int targetHeight;
        private int targetWidth;
        private java.util.List<com.squareup.picasso.Transformation> transformations;
        private android.net.Uri uri;

        public Builder(int r1) {
                r0 = this;
                r0.<init>()
                r0.setResourceId(r1)
                return
        }

        public Builder(android.net.Uri r1) {
                r0 = this;
                r0.<init>()
                r0.setUri(r1)
                return
        }

        Builder(android.net.Uri r1, int r2, android.graphics.Bitmap.Config r3) {
                r0 = this;
                r0.<init>()
                r0.uri = r1
                r0.resourceId = r2
                r0.config = r3
                return
        }

        private Builder(com.squareup.picasso.Request r3) {
                r2 = this;
                r2.<init>()
                android.net.Uri r0 = r3.uri
                r2.uri = r0
                int r0 = r3.resourceId
                r2.resourceId = r0
                java.lang.String r0 = r3.stableKey
                r2.stableKey = r0
                int r0 = r3.targetWidth
                r2.targetWidth = r0
                int r0 = r3.targetHeight
                r2.targetHeight = r0
                boolean r0 = r3.centerCrop
                r2.centerCrop = r0
                boolean r0 = r3.centerInside
                r2.centerInside = r0
                float r0 = r3.rotationDegrees
                r2.rotationDegrees = r0
                float r0 = r3.rotationPivotX
                r2.rotationPivotX = r0
                float r0 = r3.rotationPivotY
                r2.rotationPivotY = r0
                boolean r0 = r3.hasRotationPivot
                r2.hasRotationPivot = r0
                boolean r0 = r3.onlyScaleDown
                r2.onlyScaleDown = r0
                java.util.List<com.squareup.picasso.Transformation> r0 = r3.transformations
                if (r0 == 0) goto L40
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<com.squareup.picasso.Transformation> r1 = r3.transformations
                r0.<init>(r1)
                r2.transformations = r0
            L40:
                android.graphics.Bitmap$Config r0 = r3.config
                r2.config = r0
                com.squareup.picasso.Picasso$Priority r3 = r3.priority
                r2.priority = r3
                return
        }

        /* synthetic */ Builder(com.squareup.picasso.Request r1, com.squareup.picasso.Request.C08811 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public com.squareup.picasso.Request build() {
                r20 = this;
                r0 = r20
                boolean r1 = r0.centerInside
                if (r1 == 0) goto L13
                boolean r2 = r0.centerCrop
                if (r2 != 0) goto Lb
                goto L13
            Lb:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Center crop and center inside can not be used together."
                r1.<init>(r2)
                throw r1
            L13:
                boolean r2 = r0.centerCrop
                if (r2 == 0) goto L28
                int r2 = r0.targetWidth
                if (r2 != 0) goto L28
                int r2 = r0.targetHeight
                if (r2 == 0) goto L20
                goto L28
            L20:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Center crop requires calling resize with positive width and height."
                r1.<init>(r2)
                throw r1
            L28:
                if (r1 == 0) goto L3b
                int r1 = r0.targetWidth
                if (r1 != 0) goto L3b
                int r1 = r0.targetHeight
                if (r1 == 0) goto L33
                goto L3b
            L33:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Center inside requires calling resize with positive width and height."
                r1.<init>(r2)
                throw r1
            L3b:
                com.squareup.picasso.Picasso$Priority r1 = r0.priority
                if (r1 != 0) goto L43
                com.squareup.picasso.Picasso$Priority r1 = com.squareup.picasso.Picasso.Priority.NORMAL
                r0.priority = r1
            L43:
                com.squareup.picasso.Request r1 = new com.squareup.picasso.Request
                r2 = r1
                android.net.Uri r3 = r0.uri
                int r4 = r0.resourceId
                java.lang.String r5 = r0.stableKey
                java.util.List<com.squareup.picasso.Transformation> r6 = r0.transformations
                int r7 = r0.targetWidth
                int r8 = r0.targetHeight
                boolean r9 = r0.centerCrop
                boolean r10 = r0.centerInside
                boolean r11 = r0.onlyScaleDown
                float r12 = r0.rotationDegrees
                float r13 = r0.rotationPivotX
                float r14 = r0.rotationPivotY
                boolean r15 = r0.hasRotationPivot
                r19 = r1
                android.graphics.Bitmap$Config r1 = r0.config
                r16 = r1
                com.squareup.picasso.Picasso$Priority r1 = r0.priority
                r17 = r1
                r18 = 0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return r19
        }

        public com.squareup.picasso.Request.Builder centerCrop() {
                r2 = this;
                boolean r0 = r2.centerInside
                if (r0 != 0) goto L8
                r0 = 1
                r2.centerCrop = r0
                return r2
            L8:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Center crop can not be used after calling centerInside"
                r0.<init>(r1)
                throw r0
        }

        public com.squareup.picasso.Request.Builder centerInside() {
                r2 = this;
                boolean r0 = r2.centerCrop
                if (r0 != 0) goto L8
                r0 = 1
                r2.centerInside = r0
                return r2
            L8:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Center inside can not be used after calling centerCrop"
                r0.<init>(r1)
                throw r0
        }

        public com.squareup.picasso.Request.Builder clearCenterCrop() {
                r1 = this;
                r0 = 0
                r1.centerCrop = r0
                return r1
        }

        public com.squareup.picasso.Request.Builder clearCenterInside() {
                r1 = this;
                r0 = 0
                r1.centerInside = r0
                return r1
        }

        public com.squareup.picasso.Request.Builder clearOnlyScaleDown() {
                r1 = this;
                r0 = 0
                r1.onlyScaleDown = r0
                return r1
        }

        public com.squareup.picasso.Request.Builder clearResize() {
                r1 = this;
                r0 = 0
                r1.targetWidth = r0
                r1.targetHeight = r0
                r1.centerCrop = r0
                r1.centerInside = r0
                return r1
        }

        public com.squareup.picasso.Request.Builder clearRotation() {
                r1 = this;
                r0 = 0
                r1.rotationDegrees = r0
                r1.rotationPivotX = r0
                r1.rotationPivotY = r0
                r0 = 0
                r1.hasRotationPivot = r0
                return r1
        }

        public com.squareup.picasso.Request.Builder config(android.graphics.Bitmap.Config r1) {
                r0 = this;
                r0.config = r1
                return r0
        }

        boolean hasImage() {
                r1 = this;
                android.net.Uri r0 = r1.uri
                if (r0 != 0) goto Lb
                int r0 = r1.resourceId
                if (r0 == 0) goto L9
                goto Lb
            L9:
                r0 = 0
                goto Lc
            Lb:
                r0 = 1
            Lc:
                return r0
        }

        boolean hasPriority() {
                r1 = this;
                com.squareup.picasso.Picasso$Priority r0 = r1.priority
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        boolean hasSize() {
                r1 = this;
                int r0 = r1.targetWidth
                if (r0 != 0) goto Lb
                int r0 = r1.targetHeight
                if (r0 == 0) goto L9
                goto Lb
            L9:
                r0 = 0
                goto Lc
            Lb:
                r0 = 1
            Lc:
                return r0
        }

        public com.squareup.picasso.Request.Builder onlyScaleDown() {
                r2 = this;
                int r0 = r2.targetHeight
                if (r0 != 0) goto L11
                int r0 = r2.targetWidth
                if (r0 == 0) goto L9
                goto L11
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "onlyScaleDown can not be applied without resize"
                r0.<init>(r1)
                throw r0
            L11:
                r0 = 1
                r2.onlyScaleDown = r0
                return r2
        }

        public com.squareup.picasso.Request.Builder priority(com.squareup.picasso.Picasso.Priority r2) {
                r1 = this;
                if (r2 == 0) goto L11
                com.squareup.picasso.Picasso$Priority r0 = r1.priority
                if (r0 != 0) goto L9
                r1.priority = r2
                return r1
            L9:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Priority already set."
                r2.<init>(r0)
                throw r2
            L11:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Priority invalid."
                r2.<init>(r0)
                throw r2
        }

        public com.squareup.picasso.Request.Builder resize(int r1, int r2) {
                r0 = this;
                if (r1 < 0) goto L1e
                if (r2 < 0) goto L16
                if (r2 != 0) goto L11
                if (r1 == 0) goto L9
                goto L11
            L9:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "At least one dimension has to be positive number."
                r1.<init>(r2)
                throw r1
            L11:
                r0.targetWidth = r1
                r0.targetHeight = r2
                return r0
            L16:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Height must be positive number or 0."
                r1.<init>(r2)
                throw r1
            L1e:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Width must be positive number or 0."
                r1.<init>(r2)
                throw r1
        }

        public com.squareup.picasso.Request.Builder rotate(float r1) {
                r0 = this;
                r0.rotationDegrees = r1
                return r0
        }

        public com.squareup.picasso.Request.Builder rotate(float r1, float r2, float r3) {
                r0 = this;
                r0.rotationDegrees = r1
                r0.rotationPivotX = r2
                r0.rotationPivotY = r3
                r1 = 1
                r0.hasRotationPivot = r1
                return r0
        }

        public com.squareup.picasso.Request.Builder setResourceId(int r2) {
                r1 = this;
                if (r2 == 0) goto L8
                r1.resourceId = r2
                r2 = 0
                r1.uri = r2
                return r1
            L8:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Image resource ID may not be 0."
                r2.<init>(r0)
                throw r2
        }

        public com.squareup.picasso.Request.Builder setUri(android.net.Uri r2) {
                r1 = this;
                if (r2 == 0) goto L8
                r1.uri = r2
                r2 = 0
                r1.resourceId = r2
                return r1
            L8:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Image URI may not be null."
                r2.<init>(r0)
                throw r2
        }

        public com.squareup.picasso.Request.Builder stableKey(java.lang.String r1) {
                r0 = this;
                r0.stableKey = r1
                return r0
        }

        public com.squareup.picasso.Request.Builder transform(com.squareup.picasso.Transformation r3) {
                r2 = this;
                if (r3 == 0) goto L22
                java.lang.String r0 = r3.key()
                if (r0 == 0) goto L1a
                java.util.List<com.squareup.picasso.Transformation> r0 = r2.transformations
                if (r0 != 0) goto L14
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 2
                r0.<init>(r1)
                r2.transformations = r0
            L14:
                java.util.List<com.squareup.picasso.Transformation> r0 = r2.transformations
                r0.add(r3)
                return r2
            L1a:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Transformation key must not be null."
                r3.<init>(r0)
                throw r3
            L22:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Transformation must not be null."
                r3.<init>(r0)
                throw r3
        }

        public com.squareup.picasso.Request.Builder transform(java.util.List<? extends com.squareup.picasso.Transformation> r4) {
                r3 = this;
                if (r4 == 0) goto L16
                int r0 = r4.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L15
                java.lang.Object r2 = r4.get(r1)
                com.squareup.picasso.Transformation r2 = (com.squareup.picasso.Transformation) r2
                r3.transform(r2)
                int r1 = r1 + 1
                goto L7
            L15:
                return r3
            L16:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Transformation list must not be null."
                r4.<init>(r0)
                throw r4
        }
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 5
            long r0 = r0.toNanos(r1)
            com.squareup.picasso.Request.TOO_LONG_LOG = r0
            return
    }

    private Request(android.net.Uri r1, int r2, java.lang.String r3, java.util.List<com.squareup.picasso.Transformation> r4, int r5, int r6, boolean r7, boolean r8, boolean r9, float r10, float r11, float r12, boolean r13, android.graphics.Bitmap.Config r14, com.squareup.picasso.Picasso.Priority r15) {
            r0 = this;
            r0.<init>()
            r0.uri = r1
            r0.resourceId = r2
            r0.stableKey = r3
            if (r4 != 0) goto Lf
            r1 = 0
            r0.transformations = r1
            goto L15
        Lf:
            java.util.List r1 = java.util.Collections.unmodifiableList(r4)
            r0.transformations = r1
        L15:
            r0.targetWidth = r5
            r0.targetHeight = r6
            r0.centerCrop = r7
            r0.centerInside = r8
            r0.onlyScaleDown = r9
            r0.rotationDegrees = r10
            r0.rotationPivotX = r11
            r0.rotationPivotY = r12
            r0.hasRotationPivot = r13
            r0.config = r14
            r0.priority = r15
            return
    }

    /* synthetic */ Request(android.net.Uri r1, int r2, java.lang.String r3, java.util.List r4, int r5, int r6, boolean r7, boolean r8, boolean r9, float r10, float r11, float r12, boolean r13, android.graphics.Bitmap.Config r14, com.squareup.picasso.Picasso.Priority r15, com.squareup.picasso.Request.C08811 r16) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    public com.squareup.picasso.Request.Builder buildUpon() {
            r2 = this;
            com.squareup.picasso.Request$Builder r0 = new com.squareup.picasso.Request$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    java.lang.String getName() {
            r1 = this;
            android.net.Uri r0 = r1.uri
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.getPath()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Ld:
            int r0 = r1.resourceId
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
    }

    boolean hasCustomTransformations() {
            r1 = this;
            java.util.List<com.squareup.picasso.Transformation> r0 = r1.transformations
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean hasSize() {
            r1 = this;
            int r0 = r1.targetWidth
            if (r0 != 0) goto Lb
            int r0 = r1.targetHeight
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    java.lang.String logId() {
            r5 = this;
            long r0 = java.lang.System.nanoTime()
            long r2 = r5.started
            long r0 = r0 - r2
            long r2 = com.squareup.picasso.Request.TOO_LONG_LOG
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 43
            if (r2 <= 0) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r5.plainId()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r3.toSeconds(r0)
            java.lang.StringBuilder r0 = r2.append(r0)
            r1 = 115(0x73, float:1.61E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L35:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r5.plainId()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r3.toMillis(r0)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r1 = "ms"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    boolean needsMatrixTransform() {
            r2 = this;
            boolean r0 = r2.hasSize()
            if (r0 != 0) goto L10
            float r0 = r2.rotationDegrees
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            return r0
    }

    boolean needsTransformation() {
            r1 = this;
            boolean r0 = r1.needsMatrixTransform()
            if (r0 != 0) goto Lf
            boolean r0 = r1.hasCustomTransformations()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    java.lang.String plainId() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[R"
            r0.<init>(r1)
            int r1 = r2.f128id
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Request{"
            r0.<init>(r1)
            int r1 = r6.resourceId
            if (r1 <= 0) goto Lf
            r0.append(r1)
            goto L14
        Lf:
            android.net.Uri r1 = r6.uri
            r0.append(r1)
        L14:
            java.util.List<com.squareup.picasso.Transformation> r1 = r6.transformations
            r2 = 32
            if (r1 == 0) goto L3e
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L3e
            java.util.List<com.squareup.picasso.Transformation> r1 = r6.transformations
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r1.next()
            com.squareup.picasso.Transformation r3 = (com.squareup.picasso.Transformation) r3
            java.lang.StringBuilder r4 = r0.append(r2)
            java.lang.String r3 = r3.key()
            r4.append(r3)
            goto L26
        L3e:
            java.lang.String r1 = r6.stableKey
            r3 = 41
            if (r1 == 0) goto L53
            java.lang.String r1 = " stableKey("
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r4 = r6.stableKey
            java.lang.StringBuilder r1 = r1.append(r4)
            r1.append(r3)
        L53:
            int r1 = r6.targetWidth
            r4 = 44
            if (r1 <= 0) goto L72
            java.lang.String r1 = " resize("
            java.lang.StringBuilder r1 = r0.append(r1)
            int r5 = r6.targetWidth
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.StringBuilder r1 = r1.append(r4)
            int r5 = r6.targetHeight
            java.lang.StringBuilder r1 = r1.append(r5)
            r1.append(r3)
        L72:
            boolean r1 = r6.centerCrop
            if (r1 == 0) goto L7b
            java.lang.String r1 = " centerCrop"
            r0.append(r1)
        L7b:
            boolean r1 = r6.centerInside
            if (r1 == 0) goto L84
            java.lang.String r1 = " centerInside"
            r0.append(r1)
        L84:
            float r1 = r6.rotationDegrees
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto Lb2
            java.lang.String r1 = " rotation("
            java.lang.StringBuilder r1 = r0.append(r1)
            float r5 = r6.rotationDegrees
            r1.append(r5)
            boolean r1 = r6.hasRotationPivot
            if (r1 == 0) goto Laf
            java.lang.String r1 = " @ "
            java.lang.StringBuilder r1 = r0.append(r1)
            float r5 = r6.rotationPivotX
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.StringBuilder r1 = r1.append(r4)
            float r4 = r6.rotationPivotY
            r1.append(r4)
        Laf:
            r0.append(r3)
        Lb2:
            android.graphics.Bitmap$Config r1 = r6.config
            if (r1 == 0) goto Lbf
            java.lang.StringBuilder r1 = r0.append(r2)
            android.graphics.Bitmap$Config r2 = r6.config
            r1.append(r2)
        Lbf:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
