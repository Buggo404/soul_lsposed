package androidx.core.app;

/* loaded from: classes.dex */
public class NotificationChannelGroupCompat {
    private boolean mBlocked;
    private java.util.List<androidx.core.app.NotificationChannelCompat> mChannels;
    java.lang.String mDescription;
    final java.lang.String mId;
    java.lang.CharSequence mName;

    public static class Builder {
        final androidx.core.app.NotificationChannelGroupCompat mGroup;

        public Builder(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                androidx.core.app.NotificationChannelGroupCompat r0 = new androidx.core.app.NotificationChannelGroupCompat
                r0.<init>(r2)
                r1.mGroup = r0
                return
        }

        public androidx.core.app.NotificationChannelGroupCompat build() {
                r1 = this;
                androidx.core.app.NotificationChannelGroupCompat r0 = r1.mGroup
                return r0
        }

        public androidx.core.app.NotificationChannelGroupCompat.Builder setDescription(java.lang.String r2) {
                r1 = this;
                androidx.core.app.NotificationChannelGroupCompat r0 = r1.mGroup
                r0.mDescription = r2
                return r1
        }

        public androidx.core.app.NotificationChannelGroupCompat.Builder setName(java.lang.CharSequence r2) {
                r1 = this;
                androidx.core.app.NotificationChannelGroupCompat r0 = r1.mGroup
                r0.mName = r2
                return r1
        }
    }

    NotificationChannelGroupCompat(android.app.NotificationChannelGroup r2) {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            r1.<init>(r2, r0)
            return
    }

    NotificationChannelGroupCompat(android.app.NotificationChannelGroup r3, java.util.List<android.app.NotificationChannel> r4) {
            r2 = this;
            java.lang.String r0 = r3.getId()
            r2.<init>(r0)
            java.lang.CharSequence r0 = r3.getName()
            r2.mName = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L19
            java.lang.String r0 = r3.getDescription()
            r2.mDescription = r0
        L19:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L2e
            boolean r4 = r3.isBlocked()
            r2.mBlocked = r4
            java.util.List r3 = r3.getChannels()
            java.util.List r3 = r2.getChannelsCompat(r3)
            r2.mChannels = r3
            goto L34
        L2e:
            java.util.List r3 = r2.getChannelsCompat(r4)
            r2.mChannels = r3
        L34:
            return
    }

    NotificationChannelGroupCompat(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.emptyList()
            r1.mChannels = r0
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.mId = r2
            return
    }

    private java.util.List<androidx.core.app.NotificationChannelCompat> getChannelsCompat(java.util.List<android.app.NotificationChannel> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r5.next()
            android.app.NotificationChannel r1 = (android.app.NotificationChannel) r1
            java.lang.String r2 = r4.mId
            java.lang.String r3 = r1.getGroup()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L9
            androidx.core.app.NotificationChannelCompat r2 = new androidx.core.app.NotificationChannelCompat
            r2.<init>(r1)
            r0.add(r2)
            goto L9
        L2a:
            return r0
    }

    public java.util.List<androidx.core.app.NotificationChannelCompat> getChannels() {
            r1 = this;
            java.util.List<androidx.core.app.NotificationChannelCompat> r0 = r1.mChannels
            return r0
    }

    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.mDescription
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.mId
            return r0
    }

    public java.lang.CharSequence getName() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mName
            return r0
    }

    android.app.NotificationChannelGroup getNotificationChannelGroup() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L8
            r0 = 0
            return r0
        L8:
            android.app.NotificationChannelGroup r0 = new android.app.NotificationChannelGroup
            java.lang.String r1 = r3.mId
            java.lang.CharSequence r2 = r3.mName
            r0.<init>(r1, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L1c
            java.lang.String r1 = r3.mDescription
            r0.setDescription(r1)
        L1c:
            return r0
    }

    public boolean isBlocked() {
            r1 = this;
            boolean r0 = r1.mBlocked
            return r0
    }

    public androidx.core.app.NotificationChannelGroupCompat.Builder toBuilder() {
            r2 = this;
            androidx.core.app.NotificationChannelGroupCompat$Builder r0 = new androidx.core.app.NotificationChannelGroupCompat$Builder
            java.lang.String r1 = r2.mId
            r0.<init>(r1)
            java.lang.CharSequence r1 = r2.mName
            androidx.core.app.NotificationChannelGroupCompat$Builder r0 = r0.setName(r1)
            java.lang.String r1 = r2.mDescription
            androidx.core.app.NotificationChannelGroupCompat$Builder r0 = r0.setDescription(r1)
            return r0
    }
}
