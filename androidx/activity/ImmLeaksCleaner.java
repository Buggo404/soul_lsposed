package androidx.activity;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.LifecycleEventObserver {
    private static final int INIT_FAILED = 2;
    private static final int INIT_SUCCESS = 1;
    private static final int NOT_INITIALIAZED = 0;
    private static java.lang.reflect.Field sHField;
    private static java.lang.reflect.Field sNextServedViewField;
    private static int sReflectedFieldsInitialized;
    private static java.lang.reflect.Field sServedViewField;
    private android.app.Activity mActivity;

    static {
            return
    }

    ImmLeaksCleaner(android.app.Activity r1) {
            r0 = this;
            r0.<init>()
            r0.mActivity = r1
            return
    }

    private static void initializeReflectiveFields() {
            r0 = 2
            androidx.activity.ImmLeaksCleaner.sReflectedFieldsInitialized = r0     // Catch: java.lang.NoSuchFieldException -> L2d
            java.lang.Class<android.view.inputmethod.InputMethodManager> r0 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r1 = "mServedView"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L2d
            androidx.activity.ImmLeaksCleaner.sServedViewField = r0     // Catch: java.lang.NoSuchFieldException -> L2d
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L2d
            java.lang.Class<android.view.inputmethod.InputMethodManager> r0 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r2 = "mNextServedView"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L2d
            androidx.activity.ImmLeaksCleaner.sNextServedViewField = r0     // Catch: java.lang.NoSuchFieldException -> L2d
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L2d
            java.lang.Class<android.view.inputmethod.InputMethodManager> r0 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r2 = "mH"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L2d
            androidx.activity.ImmLeaksCleaner.sHField = r0     // Catch: java.lang.NoSuchFieldException -> L2d
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L2d
            androidx.activity.ImmLeaksCleaner.sReflectedFieldsInitialized = r1     // Catch: java.lang.NoSuchFieldException -> L2d
        L2d:
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
            r2 = this;
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r4 == r3) goto L5
            return
        L5:
            int r3 = androidx.activity.ImmLeaksCleaner.sReflectedFieldsInitialized
            if (r3 != 0) goto Lc
            initializeReflectiveFields()
        Lc:
            int r3 = androidx.activity.ImmLeaksCleaner.sReflectedFieldsInitialized
            r4 = 1
            if (r3 != r4) goto L4e
            android.app.Activity r3 = r2.mActivity
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = androidx.activity.ImmLeaksCleaner.sHField     // Catch: java.lang.IllegalAccessException -> L4e
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.IllegalAccessException -> L4e
            if (r4 != 0) goto L24
            return
        L24:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = androidx.activity.ImmLeaksCleaner.sServedViewField     // Catch: java.lang.Throwable -> L46 java.lang.ClassCastException -> L48 java.lang.IllegalAccessException -> L4a
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L46 java.lang.ClassCastException -> L48 java.lang.IllegalAccessException -> L4a
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L46 java.lang.ClassCastException -> L48 java.lang.IllegalAccessException -> L4a
            if (r0 != 0) goto L31
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L46
            return
        L31:
            boolean r0 = r0.isAttachedToWindow()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L39
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L46
            return
        L39:
            java.lang.reflect.Field r0 = androidx.activity.ImmLeaksCleaner.sNextServedViewField     // Catch: java.lang.IllegalAccessException -> L44 java.lang.Throwable -> L46
            r1 = 0
            r0.set(r3, r1)     // Catch: java.lang.IllegalAccessException -> L44 java.lang.Throwable -> L46
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L46
            r3.isActive()
            goto L4e
        L44:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L46
            return
        L46:
            r3 = move-exception
            goto L4c
        L48:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L46
            return
        L4a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L46
            return
        L4c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L46
            throw r3
        L4e:
            return
    }
}
