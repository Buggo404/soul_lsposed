package androidx.fragment.app;

/* loaded from: classes.dex */
public class DialogFragment extends androidx.fragment.app.Fragment implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {
    private static final java.lang.String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final java.lang.String SAVED_CANCELABLE = "android:cancelable";
    private static final java.lang.String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final java.lang.String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final java.lang.String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final java.lang.String SAVED_STYLE = "android:style";
    private static final java.lang.String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private android.app.Dialog mDialog;
    private boolean mDialogCreated;
    private java.lang.Runnable mDismissRunnable;
    private boolean mDismissed;
    private android.os.Handler mHandler;
    private androidx.lifecycle.Observer<androidx.lifecycle.LifecycleOwner> mObserver;
    private android.content.DialogInterface.OnCancelListener mOnCancelListener;
    private android.content.DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;






    public DialogFragment() {
            r2 = this;
            r2.<init>()
            androidx.fragment.app.DialogFragment$1 r0 = new androidx.fragment.app.DialogFragment$1
            r0.<init>(r2)
            r2.mDismissRunnable = r0
            androidx.fragment.app.DialogFragment$2 r0 = new androidx.fragment.app.DialogFragment$2
            r0.<init>(r2)
            r2.mOnCancelListener = r0
            androidx.fragment.app.DialogFragment$3 r0 = new androidx.fragment.app.DialogFragment$3
            r0.<init>(r2)
            r2.mOnDismissListener = r0
            r0 = 0
            r2.mStyle = r0
            r2.mTheme = r0
            r1 = 1
            r2.mCancelable = r1
            r2.mShowsDialog = r1
            r1 = -1
            r2.mBackStackId = r1
            androidx.fragment.app.DialogFragment$4 r1 = new androidx.fragment.app.DialogFragment$4
            r1.<init>(r2)
            r2.mObserver = r1
            r2.mDialogCreated = r0
            return
    }

    public DialogFragment(int r2) {
            r1 = this;
            r1.<init>(r2)
            androidx.fragment.app.DialogFragment$1 r2 = new androidx.fragment.app.DialogFragment$1
            r2.<init>(r1)
            r1.mDismissRunnable = r2
            androidx.fragment.app.DialogFragment$2 r2 = new androidx.fragment.app.DialogFragment$2
            r2.<init>(r1)
            r1.mOnCancelListener = r2
            androidx.fragment.app.DialogFragment$3 r2 = new androidx.fragment.app.DialogFragment$3
            r2.<init>(r1)
            r1.mOnDismissListener = r2
            r2 = 0
            r1.mStyle = r2
            r1.mTheme = r2
            r0 = 1
            r1.mCancelable = r0
            r1.mShowsDialog = r0
            r0 = -1
            r1.mBackStackId = r0
            androidx.fragment.app.DialogFragment$4 r0 = new androidx.fragment.app.DialogFragment$4
            r0.<init>(r1)
            r1.mObserver = r0
            r1.mDialogCreated = r2
            return
    }

    static /* synthetic */ android.app.Dialog access$000(androidx.fragment.app.DialogFragment r0) {
            android.app.Dialog r0 = r0.mDialog
            return r0
    }

    static /* synthetic */ android.content.DialogInterface.OnDismissListener access$100(androidx.fragment.app.DialogFragment r0) {
            android.content.DialogInterface$OnDismissListener r0 = r0.mOnDismissListener
            return r0
    }

    static /* synthetic */ boolean access$200(androidx.fragment.app.DialogFragment r0) {
            boolean r0 = r0.mShowsDialog
            return r0
    }

    private void dismissInternal(boolean r4, boolean r5) {
            r3 = this;
            boolean r0 = r3.mDismissed
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.mDismissed = r0
            r1 = 0
            r3.mShownByMe = r1
            android.app.Dialog r1 = r3.mDialog
            if (r1 == 0) goto L33
            r2 = 0
            r1.setOnDismissListener(r2)
            android.app.Dialog r1 = r3.mDialog
            r1.dismiss()
            if (r5 != 0) goto L33
            android.os.Looper r5 = android.os.Looper.myLooper()
            android.os.Handler r1 = r3.mHandler
            android.os.Looper r1 = r1.getLooper()
            if (r5 != r1) goto L2c
            android.app.Dialog r5 = r3.mDialog
            r3.onDismiss(r5)
            goto L33
        L2c:
            android.os.Handler r5 = r3.mHandler
            java.lang.Runnable r1 = r3.mDismissRunnable
            r5.post(r1)
        L33:
            r3.mViewDestroyed = r0
            int r5 = r3.mBackStackId
            if (r5 < 0) goto L46
            androidx.fragment.app.FragmentManager r4 = r3.getParentFragmentManager()
            int r5 = r3.mBackStackId
            r4.popBackStack(r5, r0)
            r4 = -1
            r3.mBackStackId = r4
            goto L5a
        L46:
            androidx.fragment.app.FragmentManager r5 = r3.getParentFragmentManager()
            androidx.fragment.app.FragmentTransaction r5 = r5.beginTransaction()
            r5.remove(r3)
            if (r4 == 0) goto L57
            r5.commitAllowingStateLoss()
            goto L5a
        L57:
            r5.commit()
        L5a:
            return
    }

    private void prepareDialog(android.os.Bundle r4) {
            r3 = this;
            boolean r0 = r3.mShowsDialog
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r3.mDialogCreated
            if (r0 != 0) goto L4d
            r0 = 0
            r1 = 1
            r3.mCreatingDialog = r1     // Catch: java.lang.Throwable -> L49
            android.app.Dialog r4 = r3.onCreateDialog(r4)     // Catch: java.lang.Throwable -> L49
            r3.mDialog = r4     // Catch: java.lang.Throwable -> L49
            boolean r2 = r3.mShowsDialog     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L43
            int r2 = r3.mStyle     // Catch: java.lang.Throwable -> L49
            r3.setupDialog(r4, r2)     // Catch: java.lang.Throwable -> L49
            android.content.Context r4 = r3.getContext()     // Catch: java.lang.Throwable -> L49
            boolean r2 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L2b
            android.app.Dialog r2 = r3.mDialog     // Catch: java.lang.Throwable -> L49
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L49
            r2.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L49
        L2b:
            android.app.Dialog r4 = r3.mDialog     // Catch: java.lang.Throwable -> L49
            boolean r2 = r3.mCancelable     // Catch: java.lang.Throwable -> L49
            r4.setCancelable(r2)     // Catch: java.lang.Throwable -> L49
            android.app.Dialog r4 = r3.mDialog     // Catch: java.lang.Throwable -> L49
            android.content.DialogInterface$OnCancelListener r2 = r3.mOnCancelListener     // Catch: java.lang.Throwable -> L49
            r4.setOnCancelListener(r2)     // Catch: java.lang.Throwable -> L49
            android.app.Dialog r4 = r3.mDialog     // Catch: java.lang.Throwable -> L49
            android.content.DialogInterface$OnDismissListener r2 = r3.mOnDismissListener     // Catch: java.lang.Throwable -> L49
            r4.setOnDismissListener(r2)     // Catch: java.lang.Throwable -> L49
            r3.mDialogCreated = r1     // Catch: java.lang.Throwable -> L49
            goto L46
        L43:
            r4 = 0
            r3.mDialog = r4     // Catch: java.lang.Throwable -> L49
        L46:
            r3.mCreatingDialog = r0
            goto L4d
        L49:
            r4 = move-exception
            r3.mCreatingDialog = r0
            throw r4
        L4d:
            return
    }

    @Override // androidx.fragment.app.Fragment
    androidx.fragment.app.FragmentContainer createFragmentContainer() {
            r2 = this;
            androidx.fragment.app.FragmentContainer r0 = super.createFragmentContainer()
            androidx.fragment.app.DialogFragment$5 r1 = new androidx.fragment.app.DialogFragment$5
            r1.<init>(r2, r0)
            return r1
    }

    public void dismiss() {
            r1 = this;
            r0 = 0
            r1.dismissInternal(r0, r0)
            return
    }

    public void dismissAllowingStateLoss() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.dismissInternal(r0, r1)
            return
    }

    public android.app.Dialog getDialog() {
            r1 = this;
            android.app.Dialog r0 = r1.mDialog
            return r0
    }

    public boolean getShowsDialog() {
            r1 = this;
            boolean r0 = r1.mShowsDialog
            return r0
    }

    public int getTheme() {
            r1 = this;
            int r0 = r1.mTheme
            return r0
    }

    public boolean isCancelable() {
            r1 = this;
            boolean r0 = r1.mCancelable
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context r2) {
            r1 = this;
            super.onAttach(r2)
            androidx.lifecycle.LiveData r2 = r1.getViewLifecycleOwnerLiveData()
            androidx.lifecycle.Observer<androidx.lifecycle.LifecycleOwner> r0 = r1.mObserver
            r2.observeForever(r0)
            boolean r2 = r1.mShownByMe
            if (r2 != 0) goto L13
            r2 = 0
            r1.mDismissed = r2
        L13:
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface r1) {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r3.mHandler = r0
            int r0 = r3.mContainerId
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            r3.mShowsDialog = r0
            if (r4 == 0) goto L42
            java.lang.String r0 = "android:style"
            int r0 = r4.getInt(r0, r2)
            r3.mStyle = r0
            java.lang.String r0 = "android:theme"
            int r0 = r4.getInt(r0, r2)
            r3.mTheme = r0
            java.lang.String r0 = "android:cancelable"
            boolean r0 = r4.getBoolean(r0, r1)
            r3.mCancelable = r0
            java.lang.String r0 = "android:showsDialog"
            boolean r1 = r3.mShowsDialog
            boolean r0 = r4.getBoolean(r0, r1)
            r3.mShowsDialog = r0
            java.lang.String r0 = "android:backStackId"
            r1 = -1
            int r4 = r4.getInt(r0, r1)
            r3.mBackStackId = r4
        L42:
            return
    }

    public android.app.Dialog onCreateDialog(android.os.Bundle r3) {
            r2 = this;
            r3 = 3
            boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r3 == 0) goto L1b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "onCreateDialog called for DialogFragment "
            r3.<init>(r0)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r3)
        L1b:
            android.app.Dialog r3 = new android.app.Dialog
            android.content.Context r0 = r2.requireContext()
            int r1 = r2.getTheme()
            r3.<init>(r0, r1)
            return r3
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
            r2 = this;
            super.onDestroyView()
            android.app.Dialog r0 = r2.mDialog
            if (r0 == 0) goto L21
            r1 = 1
            r2.mViewDestroyed = r1
            r1 = 0
            r0.setOnDismissListener(r1)
            android.app.Dialog r0 = r2.mDialog
            r0.dismiss()
            boolean r0 = r2.mDismissed
            if (r0 != 0) goto L1c
            android.app.Dialog r0 = r2.mDialog
            r2.onDismiss(r0)
        L1c:
            r2.mDialog = r1
            r0 = 0
            r2.mDialogCreated = r0
        L21:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
            r2 = this;
            super.onDetach()
            boolean r0 = r2.mShownByMe
            if (r0 != 0) goto Le
            boolean r0 = r2.mDismissed
            if (r0 != 0) goto Le
            r0 = 1
            r2.mDismissed = r0
        Le:
            androidx.lifecycle.LiveData r0 = r2.getViewLifecycleOwnerLiveData()
            androidx.lifecycle.Observer<androidx.lifecycle.LifecycleOwner> r1 = r2.mObserver
            r0.removeObserver(r1)
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r2) {
            r1 = this;
            boolean r2 = r1.mViewDestroyed
            if (r2 != 0) goto L23
            r2 = 3
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
            if (r2 == 0) goto L1f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "onDismiss called for DialogFragment "
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r2)
        L1f:
            r2 = 1
            r1.dismissInternal(r2, r2)
        L23:
            return
    }

    android.view.View onFindViewById(int r2) {
            r1 = this;
            android.app.Dialog r0 = r1.mDialog
            if (r0 == 0) goto L9
            android.view.View r2 = r0.findViewById(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r5) {
            r4 = this;
            android.view.LayoutInflater r0 = super.onGetLayoutInflater(r5)
            boolean r1 = r4.mShowsDialog
            r2 = 2
            java.lang.String r3 = "FragmentManager"
            if (r1 == 0) goto L3e
            boolean r1 = r4.mCreatingDialog
            if (r1 == 0) goto L10
            goto L3e
        L10:
            r4.prepareDialog(r5)
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
            if (r5 == 0) goto L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r5.<init>(r1)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r1 = " from dialog context"
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r3, r5)
        L31:
            android.app.Dialog r5 = r4.mDialog
            if (r5 == 0) goto L3d
            android.content.Context r5 = r5.getContext()
            android.view.LayoutInflater r0 = r0.cloneInContext(r5)
        L3d:
            return r0
        L3e:
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
            if (r5 == 0) goto L7c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r5.<init>(r1)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r5 = r5.toString()
            boolean r1 = r4.mShowsDialog
            if (r1 != 0) goto L6a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mShowsDialog = false: "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r3, r5)
            goto L7c
        L6a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mCreatingDialog = true: "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r3, r5)
        L7c:
            return r0
    }

    boolean onHasView() {
            r1 = this;
            boolean r0 = r1.mDialogCreated
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle r4) {
            r3 = this;
            super.onSaveInstanceState(r4)
            android.app.Dialog r0 = r3.mDialog
            if (r0 == 0) goto L16
            android.os.Bundle r0 = r0.onSaveInstanceState()
            java.lang.String r1 = "android:dialogShowing"
            r2 = 0
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "android:savedDialogState"
            r4.putBundle(r1, r0)
        L16:
            int r0 = r3.mStyle
            if (r0 == 0) goto L1f
            java.lang.String r1 = "android:style"
            r4.putInt(r1, r0)
        L1f:
            int r0 = r3.mTheme
            if (r0 == 0) goto L28
            java.lang.String r1 = "android:theme"
            r4.putInt(r1, r0)
        L28:
            boolean r0 = r3.mCancelable
            if (r0 != 0) goto L31
            java.lang.String r1 = "android:cancelable"
            r4.putBoolean(r1, r0)
        L31:
            boolean r0 = r3.mShowsDialog
            if (r0 != 0) goto L3a
            java.lang.String r1 = "android:showsDialog"
            r4.putBoolean(r1, r0)
        L3a:
            int r0 = r3.mBackStackId
            r1 = -1
            if (r0 == r1) goto L44
            java.lang.String r1 = "android:backStackId"
            r4.putInt(r1, r0)
        L44:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
            r2 = this;
            super.onStart()
            android.app.Dialog r0 = r2.mDialog
            if (r0 == 0) goto L20
            r1 = 0
            r2.mViewDestroyed = r1
            r0.show()
            android.app.Dialog r0 = r2.mDialog
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r2)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r0, r2)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r0, r2)
        L20:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
            r1 = this;
            super.onStop()
            android.app.Dialog r0 = r1.mDialog
            if (r0 == 0) goto La
            r0.hide()
        La:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(android.os.Bundle r2) {
            r1 = this;
            super.onViewStateRestored(r2)
            android.app.Dialog r0 = r1.mDialog
            if (r0 == 0) goto L16
            if (r2 == 0) goto L16
            java.lang.String r0 = "android:savedDialogState"
            android.os.Bundle r2 = r2.getBundle(r0)
            if (r2 == 0) goto L16
            android.app.Dialog r0 = r1.mDialog
            r0.onRestoreInstanceState(r2)
        L16:
            return
    }

    @Override // androidx.fragment.app.Fragment
    void performCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            super.performCreateView(r1, r2, r3)
            android.view.View r1 = r0.mView
            if (r1 != 0) goto L1a
            android.app.Dialog r1 = r0.mDialog
            if (r1 == 0) goto L1a
            if (r3 == 0) goto L1a
            java.lang.String r1 = "android:savedDialogState"
            android.os.Bundle r1 = r3.getBundle(r1)
            if (r1 == 0) goto L1a
            android.app.Dialog r2 = r0.mDialog
            r2.onRestoreInstanceState(r1)
        L1a:
            return
    }

    public final android.app.Dialog requireDialog() {
            r3 = this;
            android.app.Dialog r0 = r3.getDialog()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DialogFragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " does not have a Dialog."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void setCancelable(boolean r2) {
            r1 = this;
            r1.mCancelable = r2
            android.app.Dialog r0 = r1.mDialog
            if (r0 == 0) goto L9
            r0.setCancelable(r2)
        L9:
            return
    }

    public void setShowsDialog(boolean r1) {
            r0 = this;
            r0.mShowsDialog = r1
            return
    }

    public void setStyle(int r4, int r5) {
            r3 = this;
            r0 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r1 == 0) goto L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Setting style and theme for DialogFragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " to "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = ", "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r1)
        L2f:
            r3.mStyle = r4
            if (r4 == r0) goto L36
            r0 = 3
            if (r4 != r0) goto L3b
        L36:
            r4 = 16973913(0x1030059, float:2.406115E-38)
            r3.mTheme = r4
        L3b:
            if (r5 == 0) goto L3f
            r3.mTheme = r5
        L3f:
            return
    }

    public void setupDialog(android.app.Dialog r3, int r4) {
            r2 = this;
            r0 = 1
            if (r4 == r0) goto L15
            r1 = 2
            if (r4 == r1) goto L15
            r1 = 3
            if (r4 == r1) goto La
            goto L18
        La:
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L15
            r1 = 24
            r4.addFlags(r1)
        L15:
            r3.requestWindowFeature(r0)
        L18:
            return
    }

    public int show(androidx.fragment.app.FragmentTransaction r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            r2.mDismissed = r0
            r1 = 1
            r2.mShownByMe = r1
            r3.add(r2, r4)
            r2.mViewDestroyed = r0
            int r3 = r3.commit()
            r2.mBackStackId = r3
            return r3
    }

    public void show(androidx.fragment.app.FragmentManager r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.mDismissed = r0
            r0 = 1
            r1.mShownByMe = r0
            androidx.fragment.app.FragmentTransaction r2 = r2.beginTransaction()
            r2.add(r1, r3)
            r2.commit()
            return
    }

    public void showNow(androidx.fragment.app.FragmentManager r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.mDismissed = r0
            r0 = 1
            r1.mShownByMe = r0
            androidx.fragment.app.FragmentTransaction r2 = r2.beginTransaction()
            r2.add(r1, r3)
            r2.commitNow()
            return
    }
}
