package androidx.core.os;

@java.lang.Deprecated
/* loaded from: classes.dex */
public final class ParcelableCompat {

    static class ParcelableCompatCreatorHoneycombMR2<T> implements android.os.Parcelable.ClassLoaderCreator<T> {
        private final androidx.core.os.ParcelableCompatCreatorCallbacks<T> mCallbacks;

        ParcelableCompatCreatorHoneycombMR2(androidx.core.os.ParcelableCompatCreatorCallbacks<T> r1) {
                r0 = this;
                r0.<init>()
                r0.mCallbacks = r1
                return
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(android.os.Parcel r3) {
                r2 = this;
                androidx.core.os.ParcelableCompatCreatorCallbacks<T> r0 = r2.mCallbacks
                r1 = 0
                java.lang.Object r3 = r0.createFromParcel(r3, r1)
                return r3
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                r1 = this;
                androidx.core.os.ParcelableCompatCreatorCallbacks<T> r0 = r1.mCallbacks
                java.lang.Object r2 = r0.createFromParcel(r2, r3)
                return r2
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int r2) {
                r1 = this;
                androidx.core.os.ParcelableCompatCreatorCallbacks<T> r0 = r1.mCallbacks
                java.lang.Object[] r2 = r0.newArray(r2)
                return r2
        }
    }

    private ParcelableCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static <T> android.os.Parcelable.Creator<T> newCreator(androidx.core.os.ParcelableCompatCreatorCallbacks<T> r1) {
            androidx.core.os.ParcelableCompat$ParcelableCompatCreatorHoneycombMR2 r0 = new androidx.core.os.ParcelableCompat$ParcelableCompatCreatorHoneycombMR2
            r0.<init>(r1)
            return r0
    }
}
