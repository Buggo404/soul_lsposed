package com.google.android.material.internal;

/* loaded from: classes.dex */
public class ParcelableSparseArray extends android.util.SparseArray<android.os.Parcelable> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.internal.ParcelableSparseArray> CREATOR = null;


    static {
            com.google.android.material.internal.ParcelableSparseArray$1 r0 = new com.google.android.material.internal.ParcelableSparseArray$1
            r0.<init>()
            com.google.android.material.internal.ParcelableSparseArray.CREATOR = r0
            return
    }

    public ParcelableSparseArray() {
            r0 = this;
            r0.<init>()
            return
    }

    public ParcelableSparseArray(android.os.Parcel r5, java.lang.ClassLoader r6) {
            r4 = this;
            r4.<init>()
            int r0 = r5.readInt()
            int[] r1 = new int[r0]
            r5.readIntArray(r1)
            android.os.Parcelable[] r5 = r5.readParcelableArray(r6)
            r6 = 0
        L11:
            if (r6 >= r0) goto L1d
            r2 = r1[r6]
            r3 = r5[r6]
            r4.put(r2, r3)
            int r6 = r6 + 1
            goto L11
        L1d:
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            int r0 = r5.size()
            int[] r1 = new int[r0]
            android.os.Parcelable[] r2 = new android.os.Parcelable[r0]
            r3 = 0
        L9:
            if (r3 >= r0) goto L1c
            int r4 = r5.keyAt(r3)
            r1[r3] = r4
            java.lang.Object r4 = r5.valueAt(r3)
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L9
        L1c:
            r6.writeInt(r0)
            r6.writeIntArray(r1)
            r6.writeParcelableArray(r2, r7)
            return
    }
}
