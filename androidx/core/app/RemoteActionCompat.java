package androidx.core.app;

/* loaded from: classes.dex */
public final class RemoteActionCompat implements androidx.versionedparcelable.VersionedParcelable {
    public android.app.PendingIntent mActionIntent;
    public java.lang.CharSequence mContentDescription;
    public boolean mEnabled;
    public androidx.core.graphics.drawable.IconCompat mIcon;
    public boolean mShouldShowIcon;
    public java.lang.CharSequence mTitle;

    public RemoteActionCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public RemoteActionCompat(androidx.core.app.RemoteActionCompat r2) {
            r1 = this;
            r1.<init>()
            androidx.core.util.Preconditions.checkNotNull(r2)
            androidx.core.graphics.drawable.IconCompat r0 = r2.mIcon
            r1.mIcon = r0
            java.lang.CharSequence r0 = r2.mTitle
            r1.mTitle = r0
            java.lang.CharSequence r0 = r2.mContentDescription
            r1.mContentDescription = r0
            android.app.PendingIntent r0 = r2.mActionIntent
            r1.mActionIntent = r0
            boolean r0 = r2.mEnabled
            r1.mEnabled = r0
            boolean r2 = r2.mShouldShowIcon
            r1.mShouldShowIcon = r2
            return
    }

    public RemoteActionCompat(androidx.core.graphics.drawable.IconCompat r1, java.lang.CharSequence r2, java.lang.CharSequence r3, android.app.PendingIntent r4) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            androidx.core.graphics.drawable.IconCompat r1 = (androidx.core.graphics.drawable.IconCompat) r1
            r0.mIcon = r1
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.mTitle = r1
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.mContentDescription = r1
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r4)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r0.mActionIntent = r1
            r1 = 1
            r0.mEnabled = r1
            r0.mShouldShowIcon = r1
            return
    }

    public static androidx.core.app.RemoteActionCompat createFromRemoteAction(android.app.RemoteAction r5) {
            androidx.core.util.Preconditions.checkNotNull(r5)
            androidx.core.app.RemoteActionCompat r0 = new androidx.core.app.RemoteActionCompat
            android.graphics.drawable.Icon r1 = r5.getIcon()
            androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r1)
            java.lang.CharSequence r2 = r5.getTitle()
            java.lang.CharSequence r3 = r5.getContentDescription()
            android.app.PendingIntent r4 = r5.getActionIntent()
            r0.<init>(r1, r2, r3, r4)
            boolean r1 = r5.isEnabled()
            r0.setEnabled(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L30
            boolean r5 = r5.shouldShowIcon()
            r0.setShouldShowIcon(r5)
        L30:
            return r0
    }

    public android.app.PendingIntent getActionIntent() {
            r1 = this;
            android.app.PendingIntent r0 = r1.mActionIntent
            return r0
    }

    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mContentDescription
            return r0
    }

    public androidx.core.graphics.drawable.IconCompat getIcon() {
            r1 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r1.mIcon
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTitle
            return r0
    }

    public boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.mEnabled
            return r0
    }

    public void setEnabled(boolean r1) {
            r0 = this;
            r0.mEnabled = r1
            return
    }

    public void setShouldShowIcon(boolean r1) {
            r0 = this;
            r0.mShouldShowIcon = r1
            return
    }

    public boolean shouldShowIcon() {
            r1 = this;
            boolean r0 = r1.mShouldShowIcon
            return r0
    }

    public android.app.RemoteAction toRemoteAction() {
            r5 = this;
            android.app.RemoteAction r0 = new android.app.RemoteAction
            androidx.core.graphics.drawable.IconCompat r1 = r5.mIcon
            android.graphics.drawable.Icon r1 = r1.toIcon()
            java.lang.CharSequence r2 = r5.mTitle
            java.lang.CharSequence r3 = r5.mContentDescription
            android.app.PendingIntent r4 = r5.mActionIntent
            r0.<init>(r1, r2, r3, r4)
            boolean r1 = r5.isEnabled()
            r0.setEnabled(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L25
            boolean r1 = r5.shouldShowIcon()
            r0.setShouldShowIcon(r1)
        L25:
            return r0
    }
}
