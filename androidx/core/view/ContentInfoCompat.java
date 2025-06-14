package androidx.core.view;

/* loaded from: classes.dex */
public final class ContentInfoCompat {
    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    final android.content.ClipData mClip;
    final android.os.Bundle mExtras;
    final int mFlags;
    final android.net.Uri mLinkUri;
    final int mSource;

    public static final class Builder {
        android.content.ClipData mClip;
        android.os.Bundle mExtras;
        int mFlags;
        android.net.Uri mLinkUri;
        int mSource;

        public Builder(android.content.ClipData r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.mClip = r1
                r0.mSource = r2
                return
        }

        public Builder(androidx.core.view.ContentInfoCompat r2) {
                r1 = this;
                r1.<init>()
                android.content.ClipData r0 = r2.mClip
                r1.mClip = r0
                int r0 = r2.mSource
                r1.mSource = r0
                int r0 = r2.mFlags
                r1.mFlags = r0
                android.net.Uri r0 = r2.mLinkUri
                r1.mLinkUri = r0
                android.os.Bundle r2 = r2.mExtras
                r1.mExtras = r2
                return
        }

        public androidx.core.view.ContentInfoCompat build() {
                r1 = this;
                androidx.core.view.ContentInfoCompat r0 = new androidx.core.view.ContentInfoCompat
                r0.<init>(r1)
                return r0
        }

        public androidx.core.view.ContentInfoCompat.Builder setClip(android.content.ClipData r1) {
                r0 = this;
                r0.mClip = r1
                return r0
        }

        public androidx.core.view.ContentInfoCompat.Builder setExtras(android.os.Bundle r1) {
                r0 = this;
                r0.mExtras = r1
                return r0
        }

        public androidx.core.view.ContentInfoCompat.Builder setFlags(int r1) {
                r0 = this;
                r0.mFlags = r1
                return r0
        }

        public androidx.core.view.ContentInfoCompat.Builder setLinkUri(android.net.Uri r1) {
                r0 = this;
                r0.mLinkUri = r1
                return r0
        }

        public androidx.core.view.ContentInfoCompat.Builder setSource(int r1) {
                r0 = this;
                r0.mSource = r1
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Source {
    }

    ContentInfoCompat(androidx.core.view.ContentInfoCompat.Builder r5) {
            r4 = this;
            r4.<init>()
            android.content.ClipData r0 = r5.mClip
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            android.content.ClipData r0 = (android.content.ClipData) r0
            r4.mClip = r0
            int r0 = r5.mSource
            r1 = 3
            java.lang.String r2 = "source"
            r3 = 0
            int r0 = androidx.core.util.Preconditions.checkArgumentInRange(r0, r3, r1, r2)
            r4.mSource = r0
            int r0 = r5.mFlags
            r1 = 1
            int r0 = androidx.core.util.Preconditions.checkFlagsArgument(r0, r1)
            r4.mFlags = r0
            android.net.Uri r0 = r5.mLinkUri
            r4.mLinkUri = r0
            android.os.Bundle r5 = r5.mExtras
            r4.mExtras = r5
            return
    }

    private static android.content.ClipData buildClipData(android.content.ClipDescription r2, java.util.List<android.content.ClipData.Item> r3) {
            android.content.ClipData r0 = new android.content.ClipData
            android.content.ClipDescription r1 = new android.content.ClipDescription
            r1.<init>(r2)
            r2 = 0
            java.lang.Object r2 = r3.get(r2)
            android.content.ClipData$Item r2 = (android.content.ClipData.Item) r2
            r0.<init>(r1, r2)
            r2 = 1
        L12:
            int r1 = r3.size()
            if (r2 >= r1) goto L24
            java.lang.Object r1 = r3.get(r2)
            android.content.ClipData$Item r1 = (android.content.ClipData.Item) r1
            r0.addItem(r1)
            int r2 = r2 + 1
            goto L12
        L24:
            return r0
    }

    static java.lang.String flagsToString(int r1) {
            r0 = r1 & 1
            if (r0 == 0) goto L7
            java.lang.String r1 = "FLAG_CONVERT_TO_PLAIN_TEXT"
            return r1
        L7:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    static java.lang.String sourceToString(int r1) {
            if (r1 == 0) goto L19
            r0 = 1
            if (r1 == r0) goto L16
            r0 = 2
            if (r1 == r0) goto L13
            r0 = 3
            if (r1 == r0) goto L10
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
        L10:
            java.lang.String r1 = "SOURCE_DRAG_AND_DROP"
            return r1
        L13:
            java.lang.String r1 = "SOURCE_INPUT_METHOD"
            return r1
        L16:
            java.lang.String r1 = "SOURCE_CLIPBOARD"
            return r1
        L19:
            java.lang.String r1 = "SOURCE_APP"
            return r1
    }

    public android.content.ClipData getClip() {
            r1 = this;
            android.content.ClipData r0 = r1.mClip
            return r0
    }

    public android.os.Bundle getExtras() {
            r1 = this;
            android.os.Bundle r0 = r1.mExtras
            return r0
    }

    public int getFlags() {
            r1 = this;
            int r0 = r1.mFlags
            return r0
    }

    public android.net.Uri getLinkUri() {
            r1 = this;
            android.net.Uri r0 = r1.mLinkUri
            return r0
    }

    public int getSource() {
            r1 = this;
            int r0 = r1.mSource
            return r0
    }

    public android.util.Pair<androidx.core.view.ContentInfoCompat, androidx.core.view.ContentInfoCompat> partition(androidx.core.util.Predicate<android.content.ClipData.Item> r7) {
            r6 = this;
            android.content.ClipData r0 = r6.mClip
            int r0 = r0.getItemCount()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r1) goto L23
            android.content.ClipData r0 = r6.mClip
            android.content.ClipData$Item r0 = r0.getItemAt(r2)
            boolean r7 = r7.test(r0)
            if (r7 == 0) goto L19
            r0 = r6
            goto L1a
        L19:
            r0 = r3
        L1a:
            if (r7 == 0) goto L1d
            goto L1e
        L1d:
            r3 = r6
        L1e:
            android.util.Pair r7 = android.util.Pair.create(r0, r3)
            return r7
        L23:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L2d:
            android.content.ClipData r4 = r6.mClip
            int r4 = r4.getItemCount()
            if (r2 >= r4) goto L4b
            android.content.ClipData r4 = r6.mClip
            android.content.ClipData$Item r4 = r4.getItemAt(r2)
            boolean r5 = r7.test(r4)
            if (r5 == 0) goto L45
            r0.add(r4)
            goto L48
        L45:
            r1.add(r4)
        L48:
            int r2 = r2 + 1
            goto L2d
        L4b:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L56
            android.util.Pair r7 = android.util.Pair.create(r3, r6)
            return r7
        L56:
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L61
            android.util.Pair r7 = android.util.Pair.create(r6, r3)
            return r7
        L61:
            androidx.core.view.ContentInfoCompat$Builder r7 = new androidx.core.view.ContentInfoCompat$Builder
            r7.<init>(r6)
            android.content.ClipData r2 = r6.mClip
            android.content.ClipDescription r2 = r2.getDescription()
            android.content.ClipData r0 = buildClipData(r2, r0)
            androidx.core.view.ContentInfoCompat$Builder r7 = r7.setClip(r0)
            androidx.core.view.ContentInfoCompat r7 = r7.build()
            androidx.core.view.ContentInfoCompat$Builder r0 = new androidx.core.view.ContentInfoCompat$Builder
            r0.<init>(r6)
            android.content.ClipData r2 = r6.mClip
            android.content.ClipDescription r2 = r2.getDescription()
            android.content.ClipData r1 = buildClipData(r2, r1)
            androidx.core.view.ContentInfoCompat$Builder r0 = r0.setClip(r1)
            androidx.core.view.ContentInfoCompat r0 = r0.build()
            android.util.Pair r7 = android.util.Pair.create(r7, r0)
            return r7
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContentInfoCompat{clip="
            r0.<init>(r1)
            android.content.ClipData r1 = r2.mClip
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", source="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.mSource
            java.lang.String r1 = sourceToString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", flags="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.mFlags
            java.lang.String r1 = flagsToString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", linkUri="
            java.lang.StringBuilder r0 = r0.append(r1)
            android.net.Uri r1 = r2.mLinkUri
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", extras="
            java.lang.StringBuilder r0 = r0.append(r1)
            android.os.Bundle r1 = r2.mExtras
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "}"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
