package androidx.constraintlayout.widget;

/* loaded from: classes.dex */
public class SharedValues {
    public static final int UNSET = -1;
    private android.util.SparseIntArray mValues;
    private java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener>>> mValuesListeners;

    public interface SharedValuesListener {
        void onNewValue(int r1, int r2, int r3);
    }

    public SharedValues() {
            r1 = this;
            r1.<init>()
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.mValues = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mValuesListeners = r0
            return
    }

    public void addListener(int r3, androidx.constraintlayout.widget.SharedValues.SharedValuesListener r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues$SharedValuesListener>>> r0 = r2.mValuesListeners
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            java.util.HashSet r0 = (java.util.HashSet) r0
            if (r0 != 0) goto L1c
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues$SharedValuesListener>>> r1 = r2.mValuesListeners
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.put(r3, r0)
        L1c:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r4)
            r0.add(r3)
            return
    }

    public void clearListeners() {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues$SharedValuesListener>>> r0 = r1.mValuesListeners
            r0.clear()
            return
    }

    public void fireNewValue(int r6, int r7) {
            r5 = this;
            android.util.SparseIntArray r0 = r5.mValues
            r1 = -1
            int r0 = r0.get(r6, r1)
            if (r0 != r7) goto La
            return
        La:
            android.util.SparseIntArray r1 = r5.mValues
            r1.put(r6, r7)
            java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues$SharedValuesListener>>> r1 = r5.mValuesListeners
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Object r1 = r1.get(r2)
            java.util.HashSet r1 = (java.util.HashSet) r1
            if (r1 != 0) goto L1e
            return
        L1e:
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
        L23:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3d
            java.lang.Object r4 = r2.next()
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.lang.Object r4 = r4.get()
            androidx.constraintlayout.widget.SharedValues$SharedValuesListener r4 = (androidx.constraintlayout.widget.SharedValues.SharedValuesListener) r4
            if (r4 == 0) goto L3b
            r4.onNewValue(r6, r7, r0)
            goto L23
        L3b:
            r3 = 1
            goto L23
        L3d:
            if (r3 == 0) goto L63
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L48:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r7.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r2 = r0.get()
            androidx.constraintlayout.widget.SharedValues$SharedValuesListener r2 = (androidx.constraintlayout.widget.SharedValues.SharedValuesListener) r2
            if (r2 != 0) goto L48
            r6.add(r0)
            goto L48
        L60:
            r1.removeAll(r6)
        L63:
            return
    }

    public int getValue(int r3) {
            r2 = this;
            android.util.SparseIntArray r0 = r2.mValues
            r1 = -1
            int r3 = r0.get(r3, r1)
            return r3
    }

    public void removeListener(int r5, androidx.constraintlayout.widget.SharedValues.SharedValuesListener r6) {
            r4 = this;
            java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues$SharedValuesListener>>> r0 = r4.mValuesListeners
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r0.get(r5)
            java.util.HashSet r5 = (java.util.HashSet) r5
            if (r5 != 0) goto Lf
            return
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r5.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            androidx.constraintlayout.widget.SharedValues$SharedValuesListener r3 = (androidx.constraintlayout.widget.SharedValues.SharedValuesListener) r3
            if (r3 == 0) goto L2e
            if (r3 != r6) goto L18
        L2e:
            r0.add(r2)
            goto L18
        L32:
            r5.removeAll(r0)
            return
    }

    public void removeListener(androidx.constraintlayout.widget.SharedValues.SharedValuesListener r3) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues$SharedValuesListener>>> r0 = r2.mValuesListeners
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.removeListener(r1, r3)
            goto La
        L1e:
            return
    }
}
