package androidx.lifecycle;

/* loaded from: classes.dex */
public class ViewModelStore {
    private final java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModel> mMap;

    public ViewModelStore() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mMap = r0
            return
    }

    public final void clear() {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModel> r0 = r2.mMap
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.lifecycle.ViewModel r1 = (androidx.lifecycle.ViewModel) r1
            r1.clear()
            goto La
        L1a:
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModel> r0 = r2.mMap
            r0.clear()
            return
    }

    final androidx.lifecycle.ViewModel get(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModel> r0 = r1.mMap
            java.lang.Object r2 = r0.get(r2)
            androidx.lifecycle.ViewModel r2 = (androidx.lifecycle.ViewModel) r2
            return r2
    }

    java.util.Set<java.lang.String> keys() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModel> r1 = r2.mMap
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            return r0
    }

    final void put(java.lang.String r2, androidx.lifecycle.ViewModel r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModel> r0 = r1.mMap
            java.lang.Object r2 = r0.put(r2, r3)
            androidx.lifecycle.ViewModel r2 = (androidx.lifecycle.ViewModel) r2
            if (r2 == 0) goto Ld
            r2.onCleared()
        Ld:
            return
    }
}
