package androidx.core.os;

/* loaded from: classes.dex */
public final class ParcelCompat {
    private ParcelCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean readBoolean(android.os.Parcel r0) {
            int r0 = r0.readInt()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static void writeBoolean(android.os.Parcel r0, boolean r1) {
            r0.writeInt(r1)
            return
    }
}
