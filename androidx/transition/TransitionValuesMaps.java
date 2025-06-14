package androidx.transition;

/* loaded from: classes.dex */
class TransitionValuesMaps {
    final android.util.SparseArray<android.view.View> mIdValues;
    final androidx.collection.LongSparseArray<android.view.View> mItemIdValues;
    final androidx.collection.ArrayMap<java.lang.String, android.view.View> mNameValues;
    final androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> mViewValues;

    TransitionValuesMaps() {
            r1 = this;
            r1.<init>()
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.mViewValues = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.mIdValues = r0
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            r0.<init>()
            r1.mItemIdValues = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.mNameValues = r0
            return
    }
}
