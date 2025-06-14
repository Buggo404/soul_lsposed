package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public IconCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.graphics.drawable.IconCompat read(androidx.versionedparcelable.VersionedParcel r3) {
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.mType
            r2 = 1
            int r1 = r3.readInt(r1, r2)
            r0.mType = r1
            byte[] r1 = r0.mData
            r2 = 2
            byte[] r1 = r3.readByteArray(r1, r2)
            r0.mData = r1
            android.os.Parcelable r1 = r0.mParcelable
            r2 = 3
            android.os.Parcelable r1 = r3.readParcelable(r1, r2)
            r0.mParcelable = r1
            int r1 = r0.mInt1
            r2 = 4
            int r1 = r3.readInt(r1, r2)
            r0.mInt1 = r1
            int r1 = r0.mInt2
            r2 = 5
            int r1 = r3.readInt(r1, r2)
            r0.mInt2 = r1
            android.content.res.ColorStateList r1 = r0.mTintList
            r2 = 6
            android.os.Parcelable r1 = r3.readParcelable(r1, r2)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.mTintList = r1
            java.lang.String r1 = r0.mTintModeStr
            r2 = 7
            java.lang.String r1 = r3.readString(r1, r2)
            r0.mTintModeStr = r1
            java.lang.String r1 = r0.mString1
            r2 = 8
            java.lang.String r3 = r3.readString(r1, r2)
            r0.mString1 = r3
            r0.onPostParceling()
            return r0
    }

    public static void write(androidx.core.graphics.drawable.IconCompat r3, androidx.versionedparcelable.VersionedParcel r4) {
            r0 = 1
            r4.setSerializationFlags(r0, r0)
            boolean r1 = r4.isStream()
            r3.onPreParceling(r1)
            r1 = -1
            int r2 = r3.mType
            if (r1 == r2) goto L15
            int r1 = r3.mType
            r4.writeInt(r1, r0)
        L15:
            byte[] r0 = r3.mData
            if (r0 == 0) goto L1f
            byte[] r0 = r3.mData
            r1 = 2
            r4.writeByteArray(r0, r1)
        L1f:
            android.os.Parcelable r0 = r3.mParcelable
            if (r0 == 0) goto L29
            android.os.Parcelable r0 = r3.mParcelable
            r1 = 3
            r4.writeParcelable(r0, r1)
        L29:
            int r0 = r3.mInt1
            if (r0 == 0) goto L33
            int r0 = r3.mInt1
            r1 = 4
            r4.writeInt(r0, r1)
        L33:
            int r0 = r3.mInt2
            if (r0 == 0) goto L3d
            int r0 = r3.mInt2
            r1 = 5
            r4.writeInt(r0, r1)
        L3d:
            android.content.res.ColorStateList r0 = r3.mTintList
            if (r0 == 0) goto L47
            android.content.res.ColorStateList r0 = r3.mTintList
            r1 = 6
            r4.writeParcelable(r0, r1)
        L47:
            java.lang.String r0 = r3.mTintModeStr
            if (r0 == 0) goto L51
            java.lang.String r0 = r3.mTintModeStr
            r1 = 7
            r4.writeString(r0, r1)
        L51:
            java.lang.String r0 = r3.mString1
            if (r0 == 0) goto L5c
            java.lang.String r3 = r3.mString1
            r0 = 8
            r4.writeString(r3, r0)
        L5c:
            return
    }
}
