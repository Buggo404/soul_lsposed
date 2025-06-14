package androidx.core.app;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public RemoteActionCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.app.RemoteActionCompat read(androidx.versionedparcelable.VersionedParcel r3) {
            androidx.core.app.RemoteActionCompat r0 = new androidx.core.app.RemoteActionCompat
            r0.<init>()
            androidx.core.graphics.drawable.IconCompat r1 = r0.mIcon
            r2 = 1
            androidx.versionedparcelable.VersionedParcelable r1 = r3.readVersionedParcelable(r1, r2)
            androidx.core.graphics.drawable.IconCompat r1 = (androidx.core.graphics.drawable.IconCompat) r1
            r0.mIcon = r1
            java.lang.CharSequence r1 = r0.mTitle
            r2 = 2
            java.lang.CharSequence r1 = r3.readCharSequence(r1, r2)
            r0.mTitle = r1
            java.lang.CharSequence r1 = r0.mContentDescription
            r2 = 3
            java.lang.CharSequence r1 = r3.readCharSequence(r1, r2)
            r0.mContentDescription = r1
            android.app.PendingIntent r1 = r0.mActionIntent
            r2 = 4
            android.os.Parcelable r1 = r3.readParcelable(r1, r2)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r0.mActionIntent = r1
            boolean r1 = r0.mEnabled
            r2 = 5
            boolean r1 = r3.readBoolean(r1, r2)
            r0.mEnabled = r1
            boolean r1 = r0.mShouldShowIcon
            r2 = 6
            boolean r3 = r3.readBoolean(r1, r2)
            r0.mShouldShowIcon = r3
            return r0
    }

    public static void write(androidx.core.app.RemoteActionCompat r2, androidx.versionedparcelable.VersionedParcel r3) {
            r0 = 0
            r3.setSerializationFlags(r0, r0)
            androidx.core.graphics.drawable.IconCompat r0 = r2.mIcon
            r1 = 1
            r3.writeVersionedParcelable(r0, r1)
            java.lang.CharSequence r0 = r2.mTitle
            r1 = 2
            r3.writeCharSequence(r0, r1)
            java.lang.CharSequence r0 = r2.mContentDescription
            r1 = 3
            r3.writeCharSequence(r0, r1)
            android.app.PendingIntent r0 = r2.mActionIntent
            r1 = 4
            r3.writeParcelable(r0, r1)
            boolean r0 = r2.mEnabled
            r1 = 5
            r3.writeBoolean(r0, r1)
            boolean r2 = r2.mShouldShowIcon
            r0 = 6
            r3.writeBoolean(r2, r0)
            return
    }
}
