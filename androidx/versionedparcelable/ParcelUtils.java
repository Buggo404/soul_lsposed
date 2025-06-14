package androidx.versionedparcelable;

/* loaded from: classes.dex */
public class ParcelUtils {
    private static final java.lang.String INNER_BUNDLE_KEY = "a";

    private ParcelUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends androidx.versionedparcelable.VersionedParcelable> T fromInputStream(java.io.InputStream r2) {
            androidx.versionedparcelable.VersionedParcelStream r0 = new androidx.versionedparcelable.VersionedParcelStream
            r1 = 0
            r0.<init>(r2, r1)
            androidx.versionedparcelable.VersionedParcelable r2 = r0.readVersionedParcelable()
            return r2
    }

    public static <T extends androidx.versionedparcelable.VersionedParcelable> T fromParcelable(android.os.Parcelable r1) {
            boolean r0 = r1 instanceof androidx.versionedparcelable.ParcelImpl
            if (r0 == 0) goto Lb
            androidx.versionedparcelable.ParcelImpl r1 = (androidx.versionedparcelable.ParcelImpl) r1
            androidx.versionedparcelable.VersionedParcelable r1 = r1.getVersionedParcel()
            return r1
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid parcel"
            r1.<init>(r0)
            throw r1
    }

    public static <T extends androidx.versionedparcelable.VersionedParcelable> T getVersionedParcelable(android.os.Bundle r1, java.lang.String r2) {
            r0 = 0
            android.os.Parcelable r1 = r1.getParcelable(r2)     // Catch: java.lang.RuntimeException -> L1e
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch: java.lang.RuntimeException -> L1e
            if (r1 != 0) goto La
            return r0
        La:
            java.lang.Class<androidx.versionedparcelable.ParcelUtils> r2 = androidx.versionedparcelable.ParcelUtils.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.RuntimeException -> L1e
            r1.setClassLoader(r2)     // Catch: java.lang.RuntimeException -> L1e
            java.lang.String r2 = "a"
            android.os.Parcelable r1 = r1.getParcelable(r2)     // Catch: java.lang.RuntimeException -> L1e
            androidx.versionedparcelable.VersionedParcelable r1 = fromParcelable(r1)     // Catch: java.lang.RuntimeException -> L1e
            return r1
        L1e:
            return r0
    }

    public static <T extends androidx.versionedparcelable.VersionedParcelable> java.util.List<T> getVersionedParcelableList(android.os.Bundle r1, java.lang.String r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Parcelable r1 = r1.getParcelable(r2)     // Catch: java.lang.RuntimeException -> L33
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch: java.lang.RuntimeException -> L33
            java.lang.Class<androidx.versionedparcelable.ParcelUtils> r2 = androidx.versionedparcelable.ParcelUtils.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.RuntimeException -> L33
            r1.setClassLoader(r2)     // Catch: java.lang.RuntimeException -> L33
            java.lang.String r2 = "a"
            java.util.ArrayList r1 = r1.getParcelableArrayList(r2)     // Catch: java.lang.RuntimeException -> L33
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.RuntimeException -> L33
        L1e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.RuntimeException -> L33
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()     // Catch: java.lang.RuntimeException -> L33
            android.os.Parcelable r2 = (android.os.Parcelable) r2     // Catch: java.lang.RuntimeException -> L33
            androidx.versionedparcelable.VersionedParcelable r2 = fromParcelable(r2)     // Catch: java.lang.RuntimeException -> L33
            r0.add(r2)     // Catch: java.lang.RuntimeException -> L33
            goto L1e
        L32:
            return r0
        L33:
            r1 = 0
            return r1
    }

    public static void putVersionedParcelable(android.os.Bundle r2, java.lang.String r3, androidx.versionedparcelable.VersionedParcelable r4) {
            if (r4 != 0) goto L3
            return
        L3:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "a"
            android.os.Parcelable r4 = toParcelable(r4)
            r0.putParcelable(r1, r4)
            r2.putParcelable(r3, r0)
            return
    }

    public static void putVersionedParcelableList(android.os.Bundle r3, java.lang.String r4, java.util.List<? extends androidx.versionedparcelable.VersionedParcelable> r5) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r5.next()
            androidx.versionedparcelable.VersionedParcelable r2 = (androidx.versionedparcelable.VersionedParcelable) r2
            android.os.Parcelable r2 = toParcelable(r2)
            r1.add(r2)
            goto Le
        L22:
            java.lang.String r5 = "a"
            r0.putParcelableArrayList(r5, r1)
            r3.putParcelable(r4, r0)
            return
    }

    public static void toOutputStream(androidx.versionedparcelable.VersionedParcelable r2, java.io.OutputStream r3) {
            androidx.versionedparcelable.VersionedParcelStream r0 = new androidx.versionedparcelable.VersionedParcelStream
            r1 = 0
            r0.<init>(r1, r3)
            r0.writeVersionedParcelable(r2)
            r0.closeField()
            return
    }

    public static android.os.Parcelable toParcelable(androidx.versionedparcelable.VersionedParcelable r1) {
            androidx.versionedparcelable.ParcelImpl r0 = new androidx.versionedparcelable.ParcelImpl
            r0.<init>(r1)
            return r0
    }
}
