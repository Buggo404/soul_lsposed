package androidx.core.os;

@java.lang.Deprecated
/* loaded from: classes.dex */
public final class TraceCompat {
    private static final java.lang.String TAG = "TraceCompat";
    private static java.lang.reflect.Method sAsyncTraceBeginMethod;
    private static java.lang.reflect.Method sAsyncTraceEndMethod;
    private static java.lang.reflect.Method sIsTagEnabledMethod;
    private static java.lang.reflect.Method sTraceCounterMethod;
    private static long sTraceTagApp;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L7a
            java.lang.Class<android.os.Trace> r0 = android.os.Trace.class
            java.lang.String r1 = "TRACE_TAG_APP"
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Exception -> L72
            r1 = 0
            long r0 = r0.getLong(r1)     // Catch: java.lang.Exception -> L72
            androidx.core.os.TraceCompat.sTraceTagApp = r0     // Catch: java.lang.Exception -> L72
            java.lang.Class<android.os.Trace> r0 = android.os.Trace.class
            java.lang.String r1 = "isTagEnabled"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L72
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L72
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L72
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L72
            androidx.core.os.TraceCompat.sIsTagEnabledMethod = r0     // Catch: java.lang.Exception -> L72
            java.lang.Class<android.os.Trace> r0 = android.os.Trace.class
            java.lang.String r1 = "asyncTraceBegin"
            r3 = 3
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L72
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L72
            r4[r5] = r6     // Catch: java.lang.Exception -> L72
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4[r2] = r6     // Catch: java.lang.Exception -> L72
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L72
            r7 = 2
            r4[r7] = r6     // Catch: java.lang.Exception -> L72
            java.lang.reflect.Method r0 = r0.getMethod(r1, r4)     // Catch: java.lang.Exception -> L72
            androidx.core.os.TraceCompat.sAsyncTraceBeginMethod = r0     // Catch: java.lang.Exception -> L72
            java.lang.Class<android.os.Trace> r0 = android.os.Trace.class
            java.lang.String r1 = "asyncTraceEnd"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L72
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L72
            r4[r5] = r6     // Catch: java.lang.Exception -> L72
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4[r2] = r6     // Catch: java.lang.Exception -> L72
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L72
            r4[r7] = r6     // Catch: java.lang.Exception -> L72
            java.lang.reflect.Method r0 = r0.getMethod(r1, r4)     // Catch: java.lang.Exception -> L72
            androidx.core.os.TraceCompat.sAsyncTraceEndMethod = r0     // Catch: java.lang.Exception -> L72
            java.lang.Class<android.os.Trace> r0 = android.os.Trace.class
            java.lang.String r1 = "traceCounter"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L72
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L72
            r3[r5] = r4     // Catch: java.lang.Exception -> L72
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r2] = r4     // Catch: java.lang.Exception -> L72
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L72
            r3[r7] = r2     // Catch: java.lang.Exception -> L72
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L72
            androidx.core.os.TraceCompat.sTraceCounterMethod = r0     // Catch: java.lang.Exception -> L72
            goto L7a
        L72:
            r0 = move-exception
            java.lang.String r1 = "TraceCompat"
            java.lang.String r2 = "Unable to initialize via reflection."
            android.util.Log.i(r1, r2, r0)
        L7a:
            return
    }

    private TraceCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void beginAsyncSection(java.lang.String r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            android.os.Trace.beginAsyncSection(r4, r5)
            goto L2e
        La:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sAsyncTraceBeginMethod     // Catch: java.lang.Exception -> L27
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L27
            long r2 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L27
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L27
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> L27
            r2 = 1
            r1[r2] = r4     // Catch: java.lang.Exception -> L27
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L27
            r5 = 2
            r1[r5] = r4     // Catch: java.lang.Exception -> L27
            r4 = 0
            r0.invoke(r4, r1)     // Catch: java.lang.Exception -> L27
            goto L2e
        L27:
            java.lang.String r4 = "TraceCompat"
            java.lang.String r5 = "Unable to invoke asyncTraceBegin() via reflection."
            android.util.Log.v(r4, r5)
        L2e:
            return
    }

    public static void beginSection(java.lang.String r0) {
            android.os.Trace.beginSection(r0)
            return
    }

    public static void endAsyncSection(java.lang.String r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            android.os.Trace.endAsyncSection(r4, r5)
            goto L2e
        La:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sAsyncTraceEndMethod     // Catch: java.lang.Exception -> L27
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L27
            long r2 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L27
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L27
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> L27
            r2 = 1
            r1[r2] = r4     // Catch: java.lang.Exception -> L27
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L27
            r5 = 2
            r1[r5] = r4     // Catch: java.lang.Exception -> L27
            r4 = 0
            r0.invoke(r4, r1)     // Catch: java.lang.Exception -> L27
            goto L2e
        L27:
            java.lang.String r4 = "TraceCompat"
            java.lang.String r5 = "Unable to invoke endAsyncSection() via reflection."
            android.util.Log.v(r4, r5)
        L2e:
            return
    }

    public static void endSection() {
            android.os.Trace.endSection()
            return
    }

    public static boolean isEnabled() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r0 = android.os.Trace.isEnabled()
            return r0
        Lb:
            r0 = 0
            java.lang.reflect.Method r1 = androidx.core.os.TraceCompat.sIsTagEnabledMethod     // Catch: java.lang.Exception -> L25
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L25
            long r3 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L25
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L25
            r2[r0] = r3     // Catch: java.lang.Exception -> L25
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L25
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L25
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Exception -> L25
            return r0
        L25:
            java.lang.String r1 = "TraceCompat"
            java.lang.String r2 = "Unable to invoke isTagEnabled() via reflection."
            android.util.Log.v(r1, r2)
            return r0
    }

    public static void setCounter(java.lang.String r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            long r0 = (long) r5
            android.os.Trace.setCounter(r4, r0)
            goto L2f
        Lb:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sTraceCounterMethod     // Catch: java.lang.Exception -> L28
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L28
            long r2 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L28
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L28
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> L28
            r2 = 1
            r1[r2] = r4     // Catch: java.lang.Exception -> L28
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L28
            r5 = 2
            r1[r5] = r4     // Catch: java.lang.Exception -> L28
            r4 = 0
            r0.invoke(r4, r1)     // Catch: java.lang.Exception -> L28
            goto L2f
        L28:
            java.lang.String r4 = "TraceCompat"
            java.lang.String r5 = "Unable to invoke traceCounter() via reflection."
            android.util.Log.v(r4, r5)
        L2f:
            return
    }
}
