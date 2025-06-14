package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandle {
    private static final java.lang.Class[] ACCEPTABLE_CLASSES = null;
    private static final java.lang.String KEYS = "keys";
    private static final java.lang.String VALUES = "values";
    private final java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?>> mLiveDatas;
    final java.util.Map<java.lang.String, java.lang.Object> mRegular;
    private final androidx.savedstate.SavedStateRegistry.SavedStateProvider mSavedStateProvider;
    final java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider> mSavedStateProviders;


    static class SavingStateLiveData<T> extends androidx.lifecycle.MutableLiveData<T> {
        private androidx.lifecycle.SavedStateHandle mHandle;
        private java.lang.String mKey;

        SavingStateLiveData(androidx.lifecycle.SavedStateHandle r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.mKey = r2
                r0.mHandle = r1
                return
        }

        SavingStateLiveData(androidx.lifecycle.SavedStateHandle r1, java.lang.String r2, T r3) {
                r0 = this;
                r0.<init>(r3)
                r0.mKey = r2
                r0.mHandle = r1
                return
        }

        void detach() {
                r1 = this;
                r0 = 0
                r1.mHandle = r0
                return
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T r3) {
                r2 = this;
                androidx.lifecycle.SavedStateHandle r0 = r2.mHandle
                if (r0 == 0) goto Lb
                java.util.Map<java.lang.String, java.lang.Object> r0 = r0.mRegular
                java.lang.String r1 = r2.mKey
                r0.put(r1, r3)
            Lb:
                super.setValue(r3)
                return
        }
    }

    static {
            r0 = 29
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r0[r1] = r2
            r1 = 1
            java.lang.Class<boolean[]> r2 = boolean[].class
            r0[r1] = r2
            r1 = 2
            java.lang.Class r2 = java.lang.Double.TYPE
            r0[r1] = r2
            r1 = 3
            java.lang.Class<double[]> r2 = double[].class
            r0[r1] = r2
            r1 = 4
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            r1 = 5
            java.lang.Class<int[]> r2 = int[].class
            r0[r1] = r2
            r1 = 6
            java.lang.Class r2 = java.lang.Long.TYPE
            r0[r1] = r2
            r1 = 7
            java.lang.Class<long[]> r2 = long[].class
            r0[r1] = r2
            r1 = 8
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r1] = r2
            r1 = 9
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r0[r1] = r2
            r1 = 10
            java.lang.Class<android.os.Binder> r2 = android.os.Binder.class
            r0[r1] = r2
            r1 = 11
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            r0[r1] = r2
            r1 = 12
            java.lang.Class r2 = java.lang.Byte.TYPE
            r0[r1] = r2
            r1 = 13
            java.lang.Class<byte[]> r2 = byte[].class
            r0[r1] = r2
            r1 = 14
            java.lang.Class r2 = java.lang.Character.TYPE
            r0[r1] = r2
            r1 = 15
            java.lang.Class<char[]> r2 = char[].class
            r0[r1] = r2
            r1 = 16
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r0[r1] = r2
            r1 = 17
            java.lang.Class<java.lang.CharSequence[]> r2 = java.lang.CharSequence[].class
            r0[r1] = r2
            r1 = 18
            java.lang.Class<java.util.ArrayList> r2 = java.util.ArrayList.class
            r0[r1] = r2
            r1 = 19
            java.lang.Class r2 = java.lang.Float.TYPE
            r0[r1] = r2
            r1 = 20
            java.lang.Class<float[]> r2 = float[].class
            r0[r1] = r2
            r1 = 21
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            r0[r1] = r2
            r1 = 22
            java.lang.Class<android.os.Parcelable[]> r2 = android.os.Parcelable[].class
            r0[r1] = r2
            r1 = 23
            java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
            r0[r1] = r2
            r1 = 24
            java.lang.Class r2 = java.lang.Short.TYPE
            r0[r1] = r2
            r1 = 25
            java.lang.Class<short[]> r2 = short[].class
            r0[r1] = r2
            r1 = 26
            java.lang.Class<android.util.SparseArray> r2 = android.util.SparseArray.class
            r0[r1] = r2
            java.lang.Class<android.util.Size> r1 = android.util.Size.class
            r2 = 27
            r0[r2] = r1
            java.lang.Class<android.util.SizeF> r1 = android.util.SizeF.class
            r2 = 28
            r0[r2] = r1
            androidx.lifecycle.SavedStateHandle.ACCEPTABLE_CLASSES = r0
            return
    }

    public SavedStateHandle() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mSavedStateProviders = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mLiveDatas = r0
            androidx.lifecycle.SavedStateHandle$1 r0 = new androidx.lifecycle.SavedStateHandle$1
            r0.<init>(r1)
            r1.mSavedStateProvider = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mRegular = r0
            return
    }

    public SavedStateHandle(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mSavedStateProviders = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mLiveDatas = r0
            androidx.lifecycle.SavedStateHandle$1 r0 = new androidx.lifecycle.SavedStateHandle$1
            r0.<init>(r1)
            r1.mSavedStateProvider = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
            r1.mRegular = r0
            return
    }

    static androidx.lifecycle.SavedStateHandle createHandle(android.os.Bundle r4, android.os.Bundle r5) {
            if (r4 != 0) goto La
            if (r5 != 0) goto La
            androidx.lifecycle.SavedStateHandle r4 = new androidx.lifecycle.SavedStateHandle
            r4.<init>()
            return r4
        La:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r5 == 0) goto L2d
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.get(r2)
            r0.put(r2, r3)
            goto L19
        L2d:
            if (r4 != 0) goto L35
            androidx.lifecycle.SavedStateHandle r4 = new androidx.lifecycle.SavedStateHandle
            r4.<init>(r0)
            return r4
        L35:
            java.lang.String r5 = "keys"
            java.util.ArrayList r5 = r4.getParcelableArrayList(r5)
            java.lang.String r1 = "values"
            java.util.ArrayList r4 = r4.getParcelableArrayList(r1)
            if (r5 == 0) goto L6c
            if (r4 == 0) goto L6c
            int r1 = r5.size()
            int r2 = r4.size()
            if (r1 != r2) goto L6c
            r1 = 0
        L50:
            int r2 = r5.size()
            if (r1 >= r2) goto L66
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.get(r1)
            r0.put(r2, r3)
            int r1 = r1 + 1
            goto L50
        L66:
            androidx.lifecycle.SavedStateHandle r4 = new androidx.lifecycle.SavedStateHandle
            r4.<init>(r0)
            return r4
        L6c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Invalid bundle passed as restored state"
            r4.<init>(r5)
            throw r4
    }

    private <T> androidx.lifecycle.MutableLiveData<T> getLiveDataInternal(java.lang.String r2, boolean r3, T r4) {
            r1 = this;
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r0 = r1.mLiveDatas
            java.lang.Object r0 = r0.get(r2)
            androidx.lifecycle.MutableLiveData r0 = (androidx.lifecycle.MutableLiveData) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mRegular
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L1f
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r3 = new androidx.lifecycle.SavedStateHandle$SavingStateLiveData
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.mRegular
            java.lang.Object r4 = r4.get(r2)
            r3.<init>(r1, r2, r4)
            goto L2c
        L1f:
            if (r3 == 0) goto L27
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r3 = new androidx.lifecycle.SavedStateHandle$SavingStateLiveData
            r3.<init>(r1, r2, r4)
            goto L2c
        L27:
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r3 = new androidx.lifecycle.SavedStateHandle$SavingStateLiveData
            r3.<init>(r1, r2)
        L2c:
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r4 = r1.mLiveDatas
            r4.put(r2, r3)
            return r3
    }

    private static void validateValue(java.lang.Object r4) {
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.Class[] r0 = androidx.lifecycle.SavedStateHandle.ACCEPTABLE_CLASSES
            int r1 = r0.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L15
            r3 = r0[r2]
            boolean r3 = r3.isInstance(r4)
            if (r3 == 0) goto L12
            return
        L12:
            int r2 = r2 + 1
            goto L7
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't put value with type "
            r1.<init>(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " into saved state"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void clearSavedStateProvider(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r1.mSavedStateProviders
            r0.remove(r2)
            return
    }

    public boolean contains(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mRegular
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public <T> T get(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mRegular
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public <T> androidx.lifecycle.MutableLiveData<T> getLiveData(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            androidx.lifecycle.MutableLiveData r3 = r2.getLiveDataInternal(r3, r0, r1)
            return r3
    }

    public <T> androidx.lifecycle.MutableLiveData<T> getLiveData(java.lang.String r2, T r3) {
            r1 = this;
            r0 = 1
            androidx.lifecycle.MutableLiveData r2 = r1.getLiveDataInternal(r2, r0, r3)
            return r2
    }

    public java.util.Set<java.lang.String> keys() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.mRegular
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r1 = r2.mSavedStateProviders
            java.util.Set r1 = r1.keySet()
            r0.addAll(r1)
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r1 = r2.mLiveDatas
            java.util.Set r1 = r1.keySet()
            r0.addAll(r1)
            return r0
    }

    public <T> T remove(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.mRegular
            java.lang.Object r0 = r0.remove(r3)
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r1 = r2.mLiveDatas
            java.lang.Object r3 = r1.remove(r3)
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r3 = (androidx.lifecycle.SavedStateHandle.SavingStateLiveData) r3
            if (r3 == 0) goto L13
            r3.detach()
        L13:
            return r0
    }

    androidx.savedstate.SavedStateRegistry.SavedStateProvider savedStateProvider() {
            r1 = this;
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r0 = r1.mSavedStateProvider
            return r0
    }

    public <T> void set(java.lang.String r2, T r3) {
            r1 = this;
            validateValue(r3)
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r0 = r1.mLiveDatas
            java.lang.Object r0 = r0.get(r2)
            androidx.lifecycle.MutableLiveData r0 = (androidx.lifecycle.MutableLiveData) r0
            if (r0 == 0) goto L11
            r0.setValue(r3)
            goto L16
        L11:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mRegular
            r0.put(r2, r3)
        L16:
            return
    }

    public void setSavedStateProvider(java.lang.String r2, androidx.savedstate.SavedStateRegistry.SavedStateProvider r3) {
            r1 = this;
            java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r1.mSavedStateProviders
            r0.put(r2, r3)
            return
    }
}
