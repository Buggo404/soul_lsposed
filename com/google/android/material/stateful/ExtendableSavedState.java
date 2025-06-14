package com.google.android.material.stateful;

/* loaded from: classes.dex */
public class ExtendableSavedState extends androidx.customview.view.AbsSavedState {
    public static final android.os.Parcelable.Creator<com.google.android.material.stateful.ExtendableSavedState> CREATOR = null;
    public final androidx.collection.SimpleArrayMap<java.lang.String, android.os.Bundle> extendableStates;


    static {
            com.google.android.material.stateful.ExtendableSavedState$1 r0 = new com.google.android.material.stateful.ExtendableSavedState$1
            r0.<init>()
            com.google.android.material.stateful.ExtendableSavedState.CREATOR = r0
            return
    }

    private ExtendableSavedState(android.os.Parcel r6, java.lang.ClassLoader r7) {
            r5 = this;
            r5.<init>(r6, r7)
            int r7 = r6.readInt()
            java.lang.String[] r0 = new java.lang.String[r7]
            r6.readStringArray(r0)
            android.os.Bundle[] r1 = new android.os.Bundle[r7]
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            r6.readTypedArray(r1, r2)
            androidx.collection.SimpleArrayMap r6 = new androidx.collection.SimpleArrayMap
            r6.<init>(r7)
            r5.extendableStates = r6
            r6 = 0
        L1b:
            if (r6 >= r7) goto L29
            androidx.collection.SimpleArrayMap<java.lang.String, android.os.Bundle> r2 = r5.extendableStates
            r3 = r0[r6]
            r4 = r1[r6]
            r2.put(r3, r4)
            int r6 = r6 + 1
            goto L1b
        L29:
            return
    }

    /* synthetic */ ExtendableSavedState(android.os.Parcel r1, java.lang.ClassLoader r2, com.google.android.material.stateful.ExtendableSavedState.C06501 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public ExtendableSavedState(android.os.Parcelable r1) {
            r0 = this;
            r0.<init>(r1)
            androidx.collection.SimpleArrayMap r1 = new androidx.collection.SimpleArrayMap
            r1.<init>()
            r0.extendableStates = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ExtendableSavedState{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " states="
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.collection.SimpleArrayMap<java.lang.String, android.os.Bundle> r1 = r2.extendableStates
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "}"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            super.writeToParcel(r6, r7)
            androidx.collection.SimpleArrayMap<java.lang.String, android.os.Bundle> r7 = r5.extendableStates
            int r7 = r7.size()
            r6.writeInt(r7)
            java.lang.String[] r0 = new java.lang.String[r7]
            android.os.Bundle[] r1 = new android.os.Bundle[r7]
            r2 = 0
            r3 = r2
        L12:
            if (r3 >= r7) goto L2b
            androidx.collection.SimpleArrayMap<java.lang.String, android.os.Bundle> r4 = r5.extendableStates
            java.lang.Object r4 = r4.keyAt(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0[r3] = r4
            androidx.collection.SimpleArrayMap<java.lang.String, android.os.Bundle> r4 = r5.extendableStates
            java.lang.Object r4 = r4.valueAt(r3)
            android.os.Bundle r4 = (android.os.Bundle) r4
            r1[r3] = r4
            int r3 = r3 + 1
            goto L12
        L2b:
            r6.writeStringArray(r0)
            r6.writeTypedArray(r1, r2)
            return
    }
}
