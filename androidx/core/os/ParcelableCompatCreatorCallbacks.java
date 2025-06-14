package androidx.core.os;

@java.lang.Deprecated
/* loaded from: classes.dex */
public interface ParcelableCompatCreatorCallbacks<T> {
    T createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2);

    T[] newArray(int r1);
}
