package androidx.core.app;

/* loaded from: classes.dex */
final class ActivityRecreator {
    private static final java.lang.String LOG_TAG = "ActivityRecreator";
    protected static final java.lang.Class<?> activityThreadClass = null;
    private static final android.os.Handler mainHandler = null;
    protected static final java.lang.reflect.Field mainThreadField = null;
    protected static final java.lang.reflect.Method performStopActivity2ParamsMethod = null;
    protected static final java.lang.reflect.Method performStopActivity3ParamsMethod = null;
    protected static final java.lang.reflect.Method requestRelaunchActivityMethod = null;
    protected static final java.lang.reflect.Field tokenField = null;




    private static final class LifecycleCheckCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        java.lang.Object currentlyRecreatingToken;
        private android.app.Activity mActivity;
        private boolean mDestroyed;
        private final int mRecreatingHashCode;
        private boolean mStarted;
        private boolean mStopQueued;

        LifecycleCheckCallbacks(android.app.Activity r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mStarted = r0
                r1.mDestroyed = r0
                r1.mStopQueued = r0
                r1.mActivity = r2
                int r2 = r2.hashCode()
                r1.mRecreatingHashCode = r2
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r2) {
                r1 = this;
                android.app.Activity r0 = r1.mActivity
                if (r0 != r2) goto La
                r2 = 0
                r1.mActivity = r2
                r2 = 1
                r1.mDestroyed = r2
            La:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r3) {
                r2 = this;
                boolean r0 = r2.mDestroyed
                if (r0 == 0) goto L1c
                boolean r0 = r2.mStopQueued
                if (r0 != 0) goto L1c
                boolean r0 = r2.mStarted
                if (r0 != 0) goto L1c
                java.lang.Object r0 = r2.currentlyRecreatingToken
                int r1 = r2.mRecreatingHashCode
                boolean r3 = androidx.core.app.ActivityRecreator.queueOnStopIfNecessary(r0, r1, r3)
                if (r3 == 0) goto L1c
                r3 = 1
                r2.mStopQueued = r3
                r3 = 0
                r2.currentlyRecreatingToken = r3
            L1c:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r2) {
                r1 = this;
                android.app.Activity r0 = r1.mActivity
                if (r0 != r2) goto L7
                r2 = 1
                r1.mStarted = r2
            L7:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r1) {
                r0 = this;
                return
        }
    }

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            androidx.core.app.ActivityRecreator.mainHandler = r0
            java.lang.Class r0 = getActivityThreadClass()
            androidx.core.app.ActivityRecreator.activityThreadClass = r0
            java.lang.reflect.Field r1 = getMainThreadField()
            androidx.core.app.ActivityRecreator.mainThreadField = r1
            java.lang.reflect.Field r1 = getTokenField()
            androidx.core.app.ActivityRecreator.tokenField = r1
            java.lang.reflect.Method r1 = getPerformStopActivity3Params(r0)
            androidx.core.app.ActivityRecreator.performStopActivity3ParamsMethod = r1
            java.lang.reflect.Method r1 = getPerformStopActivity2Params(r0)
            androidx.core.app.ActivityRecreator.performStopActivity2ParamsMethod = r1
            java.lang.reflect.Method r0 = getRequestRelaunchActivityMethod(r0)
            androidx.core.app.ActivityRecreator.requestRelaunchActivityMethod = r0
            return
    }

    private ActivityRecreator() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.Class<?> getActivityThreadClass() {
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    private static java.lang.reflect.Field getMainThreadField() {
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = "mMainThread"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = 0
            return r0
    }

    private static java.lang.reflect.Method getPerformStopActivity2Params(java.lang.Class<?> r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "performStopActivity"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1b
            java.lang.Class<android.os.IBinder> r3 = android.os.IBinder.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L1b
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L1b
            r5.setAccessible(r4)     // Catch: java.lang.Throwable -> L1b
            return r5
        L1b:
            return r0
    }

    private static java.lang.reflect.Method getPerformStopActivity3Params(java.lang.Class<?> r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "performStopActivity"
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L20
            java.lang.Class<android.os.IBinder> r3 = android.os.IBinder.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r5 = 2
            r2[r5] = r3     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L20
            r6.setAccessible(r4)     // Catch: java.lang.Throwable -> L20
            return r6
        L20:
            return r0
    }

    private static java.lang.reflect.Method getRequestRelaunchActivityMethod(java.lang.Class<?> r6) {
            boolean r0 = needsRelaunchCall()
            r1 = 0
            if (r0 == 0) goto L46
            if (r6 != 0) goto La
            goto L46
        La:
            java.lang.String r0 = "requestRelaunchActivity"
            r2 = 9
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L46
            java.lang.Class<android.os.IBinder> r3 = android.os.IBinder.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r5 = 2
            r2[r5] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L46
            r5 = 3
            r2[r5] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L46
            r5 = 4
            r2[r5] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class<android.content.res.Configuration> r3 = android.content.res.Configuration.class
            r5 = 5
            r2[r5] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class<android.content.res.Configuration> r3 = android.content.res.Configuration.class
            r5 = 6
            r2[r5] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L46
            r5 = 7
            r2[r5] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L46
            r5 = 8
            r2[r5] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r0, r2)     // Catch: java.lang.Throwable -> L46
            r6.setAccessible(r4)     // Catch: java.lang.Throwable -> L46
            return r6
        L46:
            return r1
    }

    private static java.lang.reflect.Field getTokenField() {
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = 0
            return r0
    }

    private static boolean needsRelaunchCall() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 == r1) goto Lf
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 != r1) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    protected static boolean queueOnStopIfNecessary(java.lang.Object r2, int r3, android.app.Activity r4) {
            r0 = 0
            java.lang.reflect.Field r1 = androidx.core.app.ActivityRecreator.tokenField     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L23
            if (r1 != r2) goto L22
            int r2 = r4.hashCode()     // Catch: java.lang.Throwable -> L23
            if (r2 == r3) goto L10
            goto L22
        L10:
            java.lang.reflect.Field r2 = androidx.core.app.ActivityRecreator.mainThreadField     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L23
            android.os.Handler r3 = androidx.core.app.ActivityRecreator.mainHandler     // Catch: java.lang.Throwable -> L23
            androidx.core.app.ActivityRecreator$3 r4 = new androidx.core.app.ActivityRecreator$3     // Catch: java.lang.Throwable -> L23
            r4.<init>(r2, r1)     // Catch: java.lang.Throwable -> L23
            r3.postAtFrontOfQueue(r4)     // Catch: java.lang.Throwable -> L23
            r2 = 1
            return r2
        L22:
            return r0
        L23:
            r2 = move-exception
            java.lang.String r3 = "ActivityRecreator"
            java.lang.String r4 = "Exception while fetching field values"
            android.util.Log.e(r3, r4, r2)
            return r0
    }

    static boolean recreate(android.app.Activity r10) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 1
            if (r0 < r1) goto Lb
            r10.recreate()
            return r2
        Lb:
            boolean r0 = needsRelaunchCall()
            r1 = 0
            if (r0 == 0) goto L17
            java.lang.reflect.Method r0 = androidx.core.app.ActivityRecreator.requestRelaunchActivityMethod
            if (r0 != 0) goto L17
            return r1
        L17:
            java.lang.reflect.Method r0 = androidx.core.app.ActivityRecreator.performStopActivity2ParamsMethod
            if (r0 != 0) goto L20
            java.lang.reflect.Method r0 = androidx.core.app.ActivityRecreator.performStopActivity3ParamsMethod
            if (r0 != 0) goto L20
            return r1
        L20:
            java.lang.reflect.Field r0 = androidx.core.app.ActivityRecreator.tokenField     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L29
            return r1
        L29:
            java.lang.reflect.Field r3 = androidx.core.app.ActivityRecreator.mainThreadField     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r3 = r3.get(r10)     // Catch: java.lang.Throwable -> L9b
            if (r3 != 0) goto L32
            return r1
        L32:
            android.app.Application r4 = r10.getApplication()     // Catch: java.lang.Throwable -> L9b
            androidx.core.app.ActivityRecreator$LifecycleCheckCallbacks r5 = new androidx.core.app.ActivityRecreator$LifecycleCheckCallbacks     // Catch: java.lang.Throwable -> L9b
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L9b
            r4.registerActivityLifecycleCallbacks(r5)     // Catch: java.lang.Throwable -> L9b
            android.os.Handler r6 = androidx.core.app.ActivityRecreator.mainHandler     // Catch: java.lang.Throwable -> L9b
            androidx.core.app.ActivityRecreator$1 r7 = new androidx.core.app.ActivityRecreator$1     // Catch: java.lang.Throwable -> L9b
            r7.<init>(r5, r0)     // Catch: java.lang.Throwable -> L9b
            r6.post(r7)     // Catch: java.lang.Throwable -> L9b
            boolean r7 = needsRelaunchCall()     // Catch: java.lang.Throwable -> L8f
            if (r7 == 0) goto L83
            java.lang.reflect.Method r10 = androidx.core.app.ActivityRecreator.requestRelaunchActivityMethod     // Catch: java.lang.Throwable -> L8f
            r7 = 9
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L8f
            r7[r1] = r0     // Catch: java.lang.Throwable -> L8f
            r0 = 0
            r7[r2] = r0     // Catch: java.lang.Throwable -> L8f
            r8 = 2
            r7[r8] = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L8f
            r9 = 3
            r7[r9] = r8     // Catch: java.lang.Throwable -> L8f
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L8f
            r9 = 4
            r7[r9] = r8     // Catch: java.lang.Throwable -> L8f
            r8 = 5
            r7[r8] = r0     // Catch: java.lang.Throwable -> L8f
            r8 = 6
            r7[r8] = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L8f
            r8 = 7
            r7[r8] = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L8f
            r8 = 8
            r7[r8] = r0     // Catch: java.lang.Throwable -> L8f
            r10.invoke(r3, r7)     // Catch: java.lang.Throwable -> L8f
            goto L86
        L83:
            r10.recreate()     // Catch: java.lang.Throwable -> L8f
        L86:
            androidx.core.app.ActivityRecreator$2 r10 = new androidx.core.app.ActivityRecreator$2     // Catch: java.lang.Throwable -> L9b
            r10.<init>(r4, r5)     // Catch: java.lang.Throwable -> L9b
            r6.post(r10)     // Catch: java.lang.Throwable -> L9b
            return r2
        L8f:
            r10 = move-exception
            android.os.Handler r0 = androidx.core.app.ActivityRecreator.mainHandler     // Catch: java.lang.Throwable -> L9b
            androidx.core.app.ActivityRecreator$2 r2 = new androidx.core.app.ActivityRecreator$2     // Catch: java.lang.Throwable -> L9b
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L9b
            r0.post(r2)     // Catch: java.lang.Throwable -> L9b
            throw r10     // Catch: java.lang.Throwable -> L9b
        L9b:
            return r1
    }
}
