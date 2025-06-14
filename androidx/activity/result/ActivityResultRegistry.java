package androidx.activity.result;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {
    private static final int INITIAL_REQUEST_CODE_VALUE = 65536;
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
    private static final java.lang.String LOG_TAG = "ActivityResultRegistry";
    final transient java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry.CallbackAndContract<?>> mKeyToCallback;
    private final java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry.LifecycleContainer> mKeyToLifecycleContainers;
    final java.util.Map<java.lang.String, java.lang.Integer> mKeyToRc;
    java.util.ArrayList<java.lang.String> mLaunchedKeys;
    final java.util.Map<java.lang.String, java.lang.Object> mParsedPendingResults;
    final android.os.Bundle mPendingResults;
    private java.util.Random mRandom;
    private final java.util.Map<java.lang.Integer, java.lang.String> mRcToKey;




    private static class CallbackAndContract<O> {
        final androidx.activity.result.ActivityResultCallback<O> mCallback;
        final androidx.activity.result.contract.ActivityResultContract<?, O> mContract;

        CallbackAndContract(androidx.activity.result.ActivityResultCallback<O> r1, androidx.activity.result.contract.ActivityResultContract<?, O> r2) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                r0.mContract = r2
                return
        }
    }

    private static class LifecycleContainer {
        final androidx.lifecycle.Lifecycle mLifecycle;
        private final java.util.ArrayList<androidx.lifecycle.LifecycleEventObserver> mObservers;

        LifecycleContainer(androidx.lifecycle.Lifecycle r1) {
                r0 = this;
                r0.<init>()
                r0.mLifecycle = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.mObservers = r1
                return
        }

        void addObserver(androidx.lifecycle.LifecycleEventObserver r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle r0 = r1.mLifecycle
                r0.addObserver(r2)
                java.util.ArrayList<androidx.lifecycle.LifecycleEventObserver> r0 = r1.mObservers
                r0.add(r2)
                return
        }

        void clearObservers() {
                r3 = this;
                java.util.ArrayList<androidx.lifecycle.LifecycleEventObserver> r0 = r3.mObservers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                androidx.lifecycle.LifecycleEventObserver r1 = (androidx.lifecycle.LifecycleEventObserver) r1
                androidx.lifecycle.Lifecycle r2 = r3.mLifecycle
                r2.removeObserver(r1)
                goto L6
            L18:
                java.util.ArrayList<androidx.lifecycle.LifecycleEventObserver> r0 = r3.mObservers
                r0.clear()
                return
        }
    }

    public ActivityResultRegistry() {
            r1 = this;
            r1.<init>()
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1.mRandom = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mRcToKey = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mKeyToRc = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mKeyToLifecycleContainers = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mLaunchedKeys = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mKeyToCallback = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mParsedPendingResults = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.mPendingResults = r0
            return
    }

    private void bindRcKey(int r3, java.lang.String r4) {
            r2 = this;
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r2.mRcToKey
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.mKeyToRc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r4, r3)
            return
    }

    private <O> void doDispatch(java.lang.String r2, int r3, android.content.Intent r4, androidx.activity.result.ActivityResultRegistry.CallbackAndContract<O> r5) {
            r1 = this;
            if (r5 == 0) goto L12
            androidx.activity.result.ActivityResultCallback<O> r0 = r5.mCallback
            if (r0 == 0) goto L12
            androidx.activity.result.ActivityResultCallback<O> r2 = r5.mCallback
            androidx.activity.result.contract.ActivityResultContract<?, O> r5 = r5.mContract
            java.lang.Object r3 = r5.parseResult(r3, r4)
            r2.onActivityResult(r3)
            goto L21
        L12:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.mParsedPendingResults
            r5.remove(r2)
            android.os.Bundle r5 = r1.mPendingResults
            androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
            r0.<init>(r3, r4)
            r5.putParcelable(r2, r0)
        L21:
            return
    }

    private int generateRandomNumber() {
            r5 = this;
            java.util.Random r0 = r5.mRandom
            r1 = 2147418112(0x7fff0000, float:NaN)
            int r0 = r0.nextInt(r1)
            r2 = 65536(0x10000, float:9.18355E-41)
        La:
            int r0 = r0 + r2
            java.util.Map<java.lang.Integer, java.lang.String> r3 = r5.mRcToKey
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L1e
            java.util.Random r0 = r5.mRandom
            int r0 = r0.nextInt(r1)
            goto La
        L1e:
            return r0
    }

    private int registerKey(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.mKeyToRc
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lf
            int r2 = r0.intValue()
            return r2
        Lf:
            int r0 = r1.generateRandomNumber()
            r1.bindRcKey(r0, r2)
            return r0
    }

    public final boolean dispatchResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r1.mRcToKey
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L10
            r2 = 0
            return r2
        L10:
            java.util.ArrayList<java.lang.String> r0 = r1.mLaunchedKeys
            r0.remove(r2)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$CallbackAndContract<?>> r0 = r1.mKeyToCallback
            java.lang.Object r0 = r0.get(r2)
            androidx.activity.result.ActivityResultRegistry$CallbackAndContract r0 = (androidx.activity.result.ActivityResultRegistry.CallbackAndContract) r0
            r1.doDispatch(r2, r3, r4, r0)
            r2 = 1
            return r2
    }

    public final <O> boolean dispatchResult(int r3, O r4) {
            r2 = this;
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r2.mRcToKey
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L10
            r3 = 0
            return r3
        L10:
            java.util.ArrayList<java.lang.String> r0 = r2.mLaunchedKeys
            r0.remove(r3)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$CallbackAndContract<?>> r0 = r2.mKeyToCallback
            java.lang.Object r0 = r0.get(r3)
            androidx.activity.result.ActivityResultRegistry$CallbackAndContract r0 = (androidx.activity.result.ActivityResultRegistry.CallbackAndContract) r0
            if (r0 == 0) goto L2a
            androidx.activity.result.ActivityResultCallback<O> r1 = r0.mCallback
            if (r1 != 0) goto L24
            goto L2a
        L24:
            androidx.activity.result.ActivityResultCallback<O> r3 = r0.mCallback
            r3.onActivityResult(r4)
            goto L34
        L2a:
            android.os.Bundle r0 = r2.mPendingResults
            r0.remove(r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.mParsedPendingResults
            r0.put(r3, r4)
        L34:
            r3 = 1
            return r3
    }

    public abstract <I, O> void onLaunch(int r1, androidx.activity.result.contract.ActivityResultContract<I, O> r2, I r3, androidx.core.app.ActivityOptionsCompat r4);

    public final void onRestoreInstanceState(android.os.Bundle r6) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
            java.util.ArrayList r0 = r6.getIntegerArrayList(r0)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
            java.util.ArrayList r1 = r6.getStringArrayList(r1)
            if (r1 == 0) goto L71
            if (r0 != 0) goto L14
            goto L71
        L14:
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
            java.util.ArrayList r2 = r6.getStringArrayList(r2)
            r5.mLaunchedKeys = r2
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT"
            java.io.Serializable r2 = r6.getSerializable(r2)
            java.util.Random r2 = (java.util.Random) r2
            r5.mRandom = r2
            android.os.Bundle r2 = r5.mPendingResults
            java.lang.String r3 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
            android.os.Bundle r6 = r6.getBundle(r3)
            r2.putAll(r6)
            r6 = 0
        L32:
            int r2 = r1.size()
            if (r6 >= r2) goto L71
            java.lang.Object r2 = r1.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r5.mKeyToRc
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L5b
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r5.mKeyToRc
            java.lang.Object r3 = r3.remove(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            android.os.Bundle r4 = r5.mPendingResults
            boolean r2 = r4.containsKey(r2)
            if (r2 != 0) goto L5b
            java.util.Map<java.lang.Integer, java.lang.String> r2 = r5.mRcToKey
            r2.remove(r3)
        L5b:
            java.lang.Object r2 = r0.get(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r3 = r1.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            r5.bindRcKey(r2, r3)
            int r6 = r6 + 1
            goto L32
        L71:
            return
    }

    public final void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.mKeyToRc
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
            r3.putIntegerArrayList(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.mKeyToRc
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
            r3.putStringArrayList(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r1 = r2.mLaunchedKeys
            r0.<init>(r1)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
            r3.putStringArrayList(r1, r0)
            android.os.Bundle r0 = r2.mPendingResults
            java.lang.Object r0 = r0.clone()
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
            r3.putBundle(r1, r0)
            java.lang.String r0 = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT"
            java.util.Random r1 = r2.mRandom
            r3.putSerializable(r0, r1)
            return
    }

    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> register(java.lang.String r4, androidx.activity.result.contract.ActivityResultContract<I, O> r5, androidx.activity.result.ActivityResultCallback<O> r6) {
            r3 = this;
            int r0 = r3.registerKey(r4)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$CallbackAndContract<?>> r1 = r3.mKeyToCallback
            androidx.activity.result.ActivityResultRegistry$CallbackAndContract r2 = new androidx.activity.result.ActivityResultRegistry$CallbackAndContract
            r2.<init>(r6, r5)
            r1.put(r4, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.mParsedPendingResults
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L24
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.mParsedPendingResults
            java.lang.Object r1 = r1.get(r4)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.mParsedPendingResults
            r2.remove(r4)
            r6.onActivityResult(r1)
        L24:
            android.os.Bundle r1 = r3.mPendingResults
            android.os.Parcelable r1 = r1.getParcelable(r4)
            androidx.activity.result.ActivityResult r1 = (androidx.activity.result.ActivityResult) r1
            if (r1 == 0) goto L42
            android.os.Bundle r2 = r3.mPendingResults
            r2.remove(r4)
            int r2 = r1.getResultCode()
            android.content.Intent r1 = r1.getData()
            java.lang.Object r1 = r5.parseResult(r2, r1)
            r6.onActivityResult(r1)
        L42:
            androidx.activity.result.ActivityResultRegistry$3 r6 = new androidx.activity.result.ActivityResultRegistry$3
            r6.<init>(r3, r4, r0, r5)
            return r6
    }

    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> register(java.lang.String r4, androidx.lifecycle.LifecycleOwner r5, androidx.activity.result.contract.ActivityResultContract<I, O> r6, androidx.activity.result.ActivityResultCallback<O> r7) {
            r3 = this;
            androidx.lifecycle.Lifecycle r0 = r5.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r1.isAtLeast(r2)
            if (r1 != 0) goto L36
            int r5 = r3.registerKey(r4)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$LifecycleContainer> r1 = r3.mKeyToLifecycleContainers
            java.lang.Object r1 = r1.get(r4)
            androidx.activity.result.ActivityResultRegistry$LifecycleContainer r1 = (androidx.activity.result.ActivityResultRegistry.LifecycleContainer) r1
            if (r1 != 0) goto L23
            androidx.activity.result.ActivityResultRegistry$LifecycleContainer r1 = new androidx.activity.result.ActivityResultRegistry$LifecycleContainer
            r1.<init>(r0)
        L23:
            androidx.activity.result.ActivityResultRegistry$1 r0 = new androidx.activity.result.ActivityResultRegistry$1
            r0.<init>(r3, r4, r7, r6)
            r1.addObserver(r0)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$LifecycleContainer> r7 = r3.mKeyToLifecycleContainers
            r7.put(r4, r1)
            androidx.activity.result.ActivityResultRegistry$2 r7 = new androidx.activity.result.ActivityResultRegistry$2
            r7.<init>(r3, r4, r5, r6)
            return r7
        L36:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "LifecycleOwner "
            r6.<init>(r7)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r6 = " is attempting to register while current state is "
            java.lang.StringBuilder r5 = r5.append(r6)
            androidx.lifecycle.Lifecycle$State r6 = r0.getCurrentState()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = ". LifecycleOwners must call register before they are STARTED."
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    final void unregister(java.lang.String r6) {
            r5 = this;
            java.util.ArrayList<java.lang.String> r0 = r5.mLaunchedKeys
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L17
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.mKeyToRc
            java.lang.Object r0 = r0.remove(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L17
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r5.mRcToKey
            r1.remove(r0)
        L17:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$CallbackAndContract<?>> r0 = r5.mKeyToCallback
            r0.remove(r6)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.mParsedPendingResults
            boolean r0 = r0.containsKey(r6)
            java.lang.String r1 = ": "
            java.lang.String r2 = "Dropping pending result for request "
            java.lang.String r3 = "ActivityResultRegistry"
            if (r0 == 0) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.mParsedPendingResults
            java.lang.Object r4 = r4.get(r6)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.mParsedPendingResults
            r0.remove(r6)
        L4d:
            android.os.Bundle r0 = r5.mPendingResults
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L78
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.StringBuilder r0 = r0.append(r1)
            android.os.Bundle r1 = r5.mPendingResults
            android.os.Parcelable r1 = r1.getParcelable(r6)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            android.os.Bundle r0 = r5.mPendingResults
            r0.remove(r6)
        L78:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$LifecycleContainer> r0 = r5.mKeyToLifecycleContainers
            java.lang.Object r0 = r0.get(r6)
            androidx.activity.result.ActivityResultRegistry$LifecycleContainer r0 = (androidx.activity.result.ActivityResultRegistry.LifecycleContainer) r0
            if (r0 == 0) goto L8a
            r0.clearObservers()
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$LifecycleContainer> r0 = r5.mKeyToLifecycleContainers
            r0.remove(r6)
        L8a:
            return
    }
}
