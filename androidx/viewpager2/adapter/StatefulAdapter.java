package androidx.viewpager2.adapter;

/* loaded from: classes.dex */
public interface StatefulAdapter {
    void restoreState(android.os.Parcelable r1);

    android.os.Parcelable saveState();
}
