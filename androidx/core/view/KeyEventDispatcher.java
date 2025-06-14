package androidx.core.view;

/* loaded from: classes.dex */
public class KeyEventDispatcher {
    private static boolean sActionBarFieldsFetched = false;
    private static java.lang.reflect.Method sActionBarOnMenuKeyMethod = null;
    private static boolean sDialogFieldsFetched = false;
    private static java.lang.reflect.Field sDialogKeyListenerField;

    public interface Component {
        boolean superDispatchKeyEvent(android.view.KeyEvent r1);
    }

    static {
            return
    }

    private KeyEventDispatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean actionBarOnMenuKeyEventPre28(android.app.ActionBar r6, android.view.KeyEvent r7) {
            boolean r0 = androidx.core.view.KeyEventDispatcher.sActionBarFieldsFetched
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1a
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L18
            java.lang.String r3 = "onMenuKeyEvent"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L18
            java.lang.Class<android.view.KeyEvent> r5 = android.view.KeyEvent.class
            r4[r2] = r5     // Catch: java.lang.NoSuchMethodException -> L18
            java.lang.reflect.Method r0 = r0.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L18
            androidx.core.view.KeyEventDispatcher.sActionBarOnMenuKeyMethod = r0     // Catch: java.lang.NoSuchMethodException -> L18
        L18:
            androidx.core.view.KeyEventDispatcher.sActionBarFieldsFetched = r1
        L1a:
            java.lang.reflect.Method r0 = androidx.core.view.KeyEventDispatcher.sActionBarOnMenuKeyMethod
            if (r0 == 0) goto L2d
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L2d
            r1[r2] = r7     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = r0.invoke(r6, r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L2d
            return r6
        L2d:
            return r2
    }

    private static boolean activitySuperDispatchKeyEventPre28(android.app.Activity r5, android.view.KeyEvent r6) {
            r5.onUserInteraction()
            android.view.Window r0 = r5.getWindow()
            r1 = 8
            boolean r1 = r0.hasFeature(r1)
            r2 = 1
            if (r1 == 0) goto L25
            android.app.ActionBar r1 = r5.getActionBar()
            int r3 = r6.getKeyCode()
            r4 = 82
            if (r3 != r4) goto L25
            if (r1 == 0) goto L25
            boolean r1 = actionBarOnMenuKeyEventPre28(r1, r6)
            if (r1 == 0) goto L25
            return r2
        L25:
            boolean r1 = r0.superDispatchKeyEvent(r6)
            if (r1 == 0) goto L2c
            return r2
        L2c:
            android.view.View r0 = r0.getDecorView()
            boolean r1 = androidx.core.view.ViewCompat.dispatchUnhandledKeyEventBeforeCallback(r0, r6)
            if (r1 == 0) goto L37
            return r2
        L37:
            if (r0 == 0) goto L3e
            android.view.KeyEvent$DispatcherState r0 = r0.getKeyDispatcherState()
            goto L3f
        L3e:
            r0 = 0
        L3f:
            boolean r5 = r6.dispatch(r5, r0, r5)
            return r5
    }

    private static boolean dialogSuperDispatchKeyEventPre28(android.app.Dialog r3, android.view.KeyEvent r4) {
            android.content.DialogInterface$OnKeyListener r0 = getDialogKeyListenerPre28(r3)
            r1 = 1
            if (r0 == 0) goto L12
            int r2 = r4.getKeyCode()
            boolean r0 = r0.onKey(r3, r2, r4)
            if (r0 == 0) goto L12
            return r1
        L12:
            android.view.Window r0 = r3.getWindow()
            boolean r2 = r0.superDispatchKeyEvent(r4)
            if (r2 == 0) goto L1d
            return r1
        L1d:
            android.view.View r0 = r0.getDecorView()
            boolean r2 = androidx.core.view.ViewCompat.dispatchUnhandledKeyEventBeforeCallback(r0, r4)
            if (r2 == 0) goto L28
            return r1
        L28:
            if (r0 == 0) goto L2f
            android.view.KeyEvent$DispatcherState r0 = r0.getKeyDispatcherState()
            goto L30
        L2f:
            r0 = 0
        L30:
            boolean r3 = r4.dispatch(r3, r0, r3)
            return r3
    }

    public static boolean dispatchBeforeHierarchy(android.view.View r0, android.view.KeyEvent r1) {
            boolean r0 = androidx.core.view.ViewCompat.dispatchUnhandledKeyEventBeforeHierarchy(r0, r1)
            return r0
    }

    public static boolean dispatchKeyEvent(androidx.core.view.KeyEventDispatcher.Component r3, android.view.View r4, android.view.Window.Callback r5, android.view.KeyEvent r6) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r3 = r3.superDispatchKeyEvent(r6)
            return r3
        Lf:
            boolean r1 = r5 instanceof android.app.Activity
            if (r1 == 0) goto L1a
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r3 = activitySuperDispatchKeyEventPre28(r5, r6)
            return r3
        L1a:
            boolean r1 = r5 instanceof android.app.Dialog
            if (r1 == 0) goto L25
            android.app.Dialog r5 = (android.app.Dialog) r5
            boolean r3 = dialogSuperDispatchKeyEventPre28(r5, r6)
            return r3
        L25:
            if (r4 == 0) goto L2d
            boolean r4 = androidx.core.view.ViewCompat.dispatchUnhandledKeyEventBeforeCallback(r4, r6)
            if (r4 != 0) goto L33
        L2d:
            boolean r3 = r3.superDispatchKeyEvent(r6)
            if (r3 == 0) goto L34
        L33:
            r0 = 1
        L34:
            return r0
    }

    private static android.content.DialogInterface.OnKeyListener getDialogKeyListenerPre28(android.app.Dialog r3) {
            boolean r0 = androidx.core.view.KeyEventDispatcher.sDialogFieldsFetched
            if (r0 != 0) goto L14
            r0 = 1
            java.lang.Class<android.app.Dialog> r1 = android.app.Dialog.class
            java.lang.String r2 = "mOnKeyListener"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L12
            androidx.core.view.KeyEventDispatcher.sDialogKeyListenerField = r1     // Catch: java.lang.NoSuchFieldException -> L12
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L12
        L12:
            androidx.core.view.KeyEventDispatcher.sDialogFieldsFetched = r0
        L14:
            java.lang.reflect.Field r0 = androidx.core.view.KeyEventDispatcher.sDialogKeyListenerField
            if (r0 == 0) goto L1f
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.IllegalAccessException -> L1f
            android.content.DialogInterface$OnKeyListener r3 = (android.content.DialogInterface.OnKeyListener) r3     // Catch: java.lang.IllegalAccessException -> L1f
            return r3
        L1f:
            r3 = 0
            return r3
    }
}
