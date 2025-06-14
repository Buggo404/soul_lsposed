package androidx.activity.result;

/* loaded from: classes.dex */
public final class ActivityResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.activity.result.ActivityResult> CREATOR = null;
    private final android.content.Intent mData;
    private final int mResultCode;


    static {
            androidx.activity.result.ActivityResult$1 r0 = new androidx.activity.result.ActivityResult$1
            r0.<init>()
            androidx.activity.result.ActivityResult.CREATOR = r0
            return
    }

    public ActivityResult(int r1, android.content.Intent r2) {
            r0 = this;
            r0.<init>()
            r0.mResultCode = r1
            r0.mData = r2
            return
    }

    ActivityResult(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.readInt()
            r1.mResultCode = r0
            int r0 = r2.readInt()
            if (r0 != 0) goto L11
            r2 = 0
            goto L19
        L11:
            android.os.Parcelable$Creator r0 = android.content.Intent.CREATOR
            java.lang.Object r2 = r0.createFromParcel(r2)
            android.content.Intent r2 = (android.content.Intent) r2
        L19:
            r1.mData = r2
            return
    }

    public static java.lang.String resultCodeToString(int r1) {
            r0 = -1
            if (r1 == r0) goto Ld
            if (r1 == 0) goto La
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
        La:
            java.lang.String r1 = "RESULT_CANCELED"
            return r1
        Ld:
            java.lang.String r1 = "RESULT_OK"
            return r1
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.content.Intent getData() {
            r1 = this;
            android.content.Intent r0 = r1.mData
            return r0
    }

    public int getResultCode() {
            r1 = this;
            int r0 = r1.mResultCode
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ActivityResult{resultCode="
            r0.<init>(r1)
            int r1 = r2.mResultCode
            java.lang.String r1 = resultCodeToString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", data="
            java.lang.StringBuilder r0 = r0.append(r1)
            android.content.Intent r1 = r2.mData
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int r0 = r1.mResultCode
            r2.writeInt(r0)
            android.content.Intent r0 = r1.mData
            if (r0 != 0) goto Lb
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            r2.writeInt(r0)
            android.content.Intent r0 = r1.mData
            if (r0 == 0) goto L16
            r0.writeToParcel(r2, r3)
        L16:
            return
    }
}
