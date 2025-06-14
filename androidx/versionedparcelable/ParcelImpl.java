package androidx.versionedparcelable;

/* loaded from: classes.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = null;
    private final androidx.versionedparcelable.VersionedParcelable mParcel;


    static {
            androidx.versionedparcelable.ParcelImpl$1 r0 = new androidx.versionedparcelable.ParcelImpl$1
            r0.<init>()
            androidx.versionedparcelable.ParcelImpl.CREATOR = r0
            return
    }

    protected ParcelImpl(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            androidx.versionedparcelable.VersionedParcelParcel r0 = new androidx.versionedparcelable.VersionedParcelParcel
            r0.<init>(r2)
            androidx.versionedparcelable.VersionedParcelable r2 = r0.readVersionedParcelable()
            r1.mParcel = r2
            return
    }

    public ParcelImpl(androidx.versionedparcelable.VersionedParcelable r1) {
            r0 = this;
            r0.<init>()
            r0.mParcel = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public <T extends androidx.versionedparcelable.VersionedParcelable> T getVersionedParcel() {
            r1 = this;
            androidx.versionedparcelable.VersionedParcelable r0 = r1.mParcel
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            androidx.versionedparcelable.VersionedParcelParcel r2 = new androidx.versionedparcelable.VersionedParcelParcel
            r2.<init>(r1)
            androidx.versionedparcelable.VersionedParcelable r1 = r0.mParcel
            r2.writeVersionedParcelable(r1)
            return
    }
}
