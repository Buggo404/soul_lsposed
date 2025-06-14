package androidx.core.location;

/* loaded from: classes.dex */
public final class LocationManagerCompat {
    private static final long PRE_N_LOOPER_TIMEOUT_S = 4;
    private static java.lang.reflect.Field sContextField;
    private static final androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> sGnssStatusListeners = null;

    /* renamed from: androidx.core.location.LocationManagerCompat$1 */
    class CallableC01761 implements java.util.concurrent.Callable<java.lang.Boolean> {
        final /* synthetic */ android.location.LocationManager val$locationManager;
        final /* synthetic */ androidx.core.location.LocationManagerCompat.GpsStatusTransport val$myTransport;

        CallableC01761(android.location.LocationManager r1, androidx.core.location.LocationManagerCompat.GpsStatusTransport r2) {
                r0 = this;
                r0.val$locationManager = r1
                r0.val$myTransport = r2
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public java.lang.Boolean call() {
                r2 = this;
                android.location.LocationManager r0 = r2.val$locationManager
                androidx.core.location.LocationManagerCompat$GpsStatusTransport r1 = r2.val$myTransport
                boolean r0 = r0.addGpsStatusListener(r1)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Boolean call() throws java.lang.Exception {
                r1 = this;
                java.lang.Boolean r0 = r1.call()
                return r0
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static boolean isLocationEnabled(android.location.LocationManager r0) {
                boolean r0 = r0.isLocationEnabled()
                return r0
        }
    }

    private static class GnssStatusTransport extends android.location.GnssStatus.Callback {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;

        GnssStatusTransport(androidx.core.location.GnssStatusCompat.Callback r3) {
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r2.mCallback = r3
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int r2) {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onFirstFix(r2)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus r2) {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                androidx.core.location.GnssStatusCompat r2 = androidx.core.location.GnssStatusCompat.wrap(r2)
                r0.onSatelliteStatusChanged(r2)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onStarted()
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onStopped()
                return
        }
    }

    private static class GpsStatusTransport implements android.location.GpsStatus.Listener {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;
        volatile java.util.concurrent.Executor mExecutor;
        private final android.location.LocationManager mLocationManager;





        GpsStatusTransport(android.location.LocationManager r3, androidx.core.location.GnssStatusCompat.Callback r4) {
                r2 = this;
                r2.<init>()
                if (r4 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r2.mLocationManager = r3
                r2.mCallback = r4
                return
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int r4) {
                r3 = this;
                java.util.concurrent.Executor r0 = r3.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                r1 = 1
                if (r4 == r1) goto L46
                r1 = 2
                if (r4 == r1) goto L3d
                r1 = 3
                r2 = 0
                if (r4 == r1) goto L28
                r1 = 4
                if (r4 == r1) goto L13
                goto L4e
            L13:
                android.location.LocationManager r4 = r3.mLocationManager
                android.location.GpsStatus r4 = r4.getGpsStatus(r2)
                if (r4 == 0) goto L4e
                androidx.core.location.GnssStatusCompat r4 = androidx.core.location.GnssStatusCompat.wrap(r4)
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$4 r1 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$4
                r1.<init>(r3, r0, r4)
                r0.execute(r1)
                goto L4e
            L28:
                android.location.LocationManager r4 = r3.mLocationManager
                android.location.GpsStatus r4 = r4.getGpsStatus(r2)
                if (r4 == 0) goto L4e
                int r4 = r4.getTimeToFirstFix()
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$3 r1 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$3
                r1.<init>(r3, r0, r4)
                r0.execute(r1)
                goto L4e
            L3d:
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$2 r4 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$2
                r4.<init>(r3, r0)
                r0.execute(r4)
                goto L4e
            L46:
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$1 r4 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$1
                r4.<init>(r3, r0)
                r0.execute(r4)
            L4e:
                return
        }

        public void register(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                androidx.core.util.Preconditions.checkState(r0)
                r1.mExecutor = r2
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mExecutor = r0
                return
        }
    }

    private static class InlineHandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler;

        InlineHandlerExecutor(android.os.Handler r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
                android.os.Handler r1 = (android.os.Handler) r1
                r0.mHandler = r1
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r3) {
                r2 = this;
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Handler r1 = r2.mHandler
                android.os.Looper r1 = r1.getLooper()
                if (r0 != r1) goto L10
                r3.run()
                goto L1e
            L10:
                android.os.Handler r0 = r2.mHandler
                java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)
                java.lang.Runnable r3 = (java.lang.Runnable) r3
                boolean r3 = r0.post(r3)
                if (r3 == 0) goto L1f
            L1e:
                return
            L1f:
                java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                android.os.Handler r1 = r2.mHandler
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " is shutting down"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }
    }

    private static class PreRGnssStatusTransport extends android.location.GnssStatus.Callback {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;
        volatile java.util.concurrent.Executor mExecutor;





        PreRGnssStatusTransport(androidx.core.location.GnssStatusCompat.Callback r3) {
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r2.mCallback = r3
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$3 r1 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$3
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$4 r1 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$4
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$1 r1 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$1
                r1.<init>(r2, r0)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$2 r1 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$2
                r1.<init>(r2, r0)
                r0.execute(r1)
                return
        }

        public void register(java.util.concurrent.Executor r5) {
                r4 = this;
                r0 = 1
                r1 = 0
                if (r5 == 0) goto L6
                r2 = r0
                goto L7
            L6:
                r2 = r1
            L7:
                java.lang.String r3 = "invalid null executor"
                androidx.core.util.Preconditions.checkArgument(r2, r3)
                java.util.concurrent.Executor r2 = r4.mExecutor
                if (r2 != 0) goto L11
                goto L12
            L11:
                r0 = r1
            L12:
                androidx.core.util.Preconditions.checkState(r0)
                r4.mExecutor = r5
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mExecutor = r0
                return
        }
    }

    static {
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            androidx.core.location.LocationManagerCompat.sGnssStatusListeners = r0
            return
    }

    private LocationManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isLocationEnabled(android.location.LocationManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationManagerCompat.Api28Impl.isLocationEnabled(r2)
            return r2
        Lb:
            java.lang.String r0 = "network"
            boolean r0 = r2.isProviderEnabled(r0)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "gps"
            boolean r2 = r2.isProviderEnabled(r0)
            if (r2 == 0) goto L1c
            goto L1e
        L1c:
            r2 = 0
            goto L1f
        L1e:
            r2 = 1
        L1f:
            return r2
    }

    private static boolean registerGnssStatusCallback(android.location.LocationManager r4, android.os.Handler r5, java.util.concurrent.Executor r6, androidx.core.location.GnssStatusCompat.Callback r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L28
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r0 = androidx.core.location.LocationManagerCompat.sGnssStatusListeners
            monitor-enter(r0)
            java.lang.Object r5 = r0.get(r7)     // Catch: java.lang.Throwable -> L25
            androidx.core.location.LocationManagerCompat$GnssStatusTransport r5 = (androidx.core.location.LocationManagerCompat.GnssStatusTransport) r5     // Catch: java.lang.Throwable -> L25
            if (r5 != 0) goto L18
            androidx.core.location.LocationManagerCompat$GnssStatusTransport r5 = new androidx.core.location.LocationManagerCompat$GnssStatusTransport     // Catch: java.lang.Throwable -> L25
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L25
        L18:
            boolean r4 = r4.registerGnssStatusCallback(r6, r5)     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L23
            r0.put(r7, r5)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return r2
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return r3
        L25:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r4
        L28:
            if (r5 == 0) goto L2c
            r0 = r2
            goto L2d
        L2c:
            r0 = r3
        L2d:
            androidx.core.util.Preconditions.checkArgument(r0)
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r0 = androidx.core.location.LocationManagerCompat.sGnssStatusListeners
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r7)     // Catch: java.lang.Throwable -> L54
            androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r1 = (androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) r1     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L41
            androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r1 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport     // Catch: java.lang.Throwable -> L54
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L54
            goto L44
        L41:
            r1.unregister()     // Catch: java.lang.Throwable -> L54
        L44:
            r1.register(r6)     // Catch: java.lang.Throwable -> L54
            boolean r4 = r4.registerGnssStatusCallback(r1, r5)     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L52
            r0.put(r7, r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            return r2
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            return r3
        L54:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            throw r4
    }

    public static boolean registerGnssStatusCallback(android.location.LocationManager r2, androidx.core.location.GnssStatusCompat.Callback r3, android.os.Handler r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lf
            java.util.concurrent.Executor r4 = androidx.core.os.ExecutorCompat.create(r4)
            boolean r2 = registerGnssStatusCallback(r2, r4, r3)
            return r2
        Lf:
            androidx.core.location.LocationManagerCompat$InlineHandlerExecutor r0 = new androidx.core.location.LocationManagerCompat$InlineHandlerExecutor
            r0.<init>(r4)
            boolean r2 = registerGnssStatusCallback(r2, r0, r3)
            return r2
    }

    public static boolean registerGnssStatusCallback(android.location.LocationManager r2, java.util.concurrent.Executor r3, androidx.core.location.GnssStatusCompat.Callback r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lc
            r0 = 0
            boolean r2 = registerGnssStatusCallback(r2, r0, r3, r4)
            return r2
        Lc:
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L16
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L16:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            boolean r2 = registerGnssStatusCallback(r2, r1, r3, r4)
            return r2
    }

    public static void unregisterGnssStatusCallback(android.location.LocationManager r2, androidx.core.location.GnssStatusCompat.Callback r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L19
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r0 = androidx.core.location.LocationManagerCompat.sGnssStatusListeners
            monitor-enter(r0)
            java.lang.Object r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L16
            androidx.core.location.LocationManagerCompat$GnssStatusTransport r3 = (androidx.core.location.LocationManagerCompat.GnssStatusTransport) r3     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L14
            r2.unregisterGnssStatusCallback(r3)     // Catch: java.lang.Throwable -> L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L2b
        L16:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r2
        L19:
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r0 = androidx.core.location.LocationManagerCompat.sGnssStatusListeners
            monitor-enter(r0)
            java.lang.Object r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L2c
            androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r3 = (androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) r3     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L2a
            r3.unregister()     // Catch: java.lang.Throwable -> L2c
            r2.unregisterGnssStatusCallback(r3)     // Catch: java.lang.Throwable -> L2c
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
        L2b:
            return
        L2c:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r2
    }
}
