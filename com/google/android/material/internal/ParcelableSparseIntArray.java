package com.google.android.material.internal;

/* loaded from: classes.dex */
public class ParcelableSparseIntArray extends android.util.SparseIntArray implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.internal.ParcelableSparseIntArray> CREATOR = null;


    static {
            com.google.android.material.internal.ParcelableSparseIntArray$1 r0 = new com.google.android.material.internal.ParcelableSparseIntArray$1
            r0.<init>()
            com.google.android.material.internal.ParcelableSparseIntArray.CREATOR = r0
            return
    }

    public ParcelableSparseIntArray() {
            r0 = this;
            r0.<init>()
            return
    }

    public ParcelableSparseIntArray(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ParcelableSparseIntArray(android.util.SparseIntArray r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
        L4:
            int r1 = r4.size()
            if (r0 >= r1) goto L18
            int r1 = r4.keyAt(r0)
            int r2 = r4.valueAt(r0)
            r3.put(r1, r2)
            int r0 = r0 + 1
            goto L4
        L18:
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = r3.size()
            int[] r5 = new int[r5]
            int r0 = r3.size()
            int[] r0 = new int[r0]
            r1 = 0
        Ld:
            int r2 = r3.size()
            if (r1 >= r2) goto L22
            int r2 = r3.keyAt(r1)
            r5[r1] = r2
            int r2 = r3.valueAt(r1)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Ld
        L22:
            int r1 = r3.size()
            r4.writeInt(r1)
            r4.writeIntArray(r5)
            r4.writeIntArray(r0)
            return
    }
}
