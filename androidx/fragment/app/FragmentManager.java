package androidx.fragment.app;

/* loaded from: classes.dex */
public abstract class FragmentManager implements androidx.fragment.app.FragmentResultOwner {
    private static boolean DEBUG = false;
    private static final java.lang.String EXTRA_CREATED_FILLIN_INTENT = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    static final java.lang.String TAG = "FragmentManager";
    static boolean USE_STATE_MANAGER = true;
    java.util.ArrayList<androidx.fragment.app.BackStackRecord> mBackStack;
    private java.util.ArrayList<androidx.fragment.app.FragmentManager.OnBackStackChangedListener> mBackStackChangeListeners;
    private final java.util.concurrent.atomic.AtomicInteger mBackStackIndex;
    private androidx.fragment.app.FragmentContainer mContainer;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mCreatedMenus;
    int mCurState;
    private androidx.fragment.app.SpecialEffectsControllerFactory mDefaultSpecialEffectsControllerFactory;
    private boolean mDestroyed;
    private java.lang.Runnable mExecCommit;
    private boolean mExecutingActions;
    private java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> mExitAnimationCancellationSignals;
    private androidx.fragment.app.FragmentFactory mFragmentFactory;
    private final androidx.fragment.app.FragmentStore mFragmentStore;
    private final androidx.fragment.app.FragmentTransition.Callback mFragmentTransitionCallback;
    private boolean mHavePendingDeferredStart;
    private androidx.fragment.app.FragmentHostCallback<?> mHost;
    private androidx.fragment.app.FragmentFactory mHostFragmentFactory;
    java.util.ArrayDeque<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> mLaunchedFragments;
    private final androidx.fragment.app.FragmentLayoutInflaterFactory mLayoutInflaterFactory;
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher mLifecycleCallbacksDispatcher;
    private boolean mNeedMenuInvalidate;
    private androidx.fragment.app.FragmentManagerViewModel mNonConfig;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> mOnAttachListeners;
    private final androidx.activity.OnBackPressedCallback mOnBackPressedCallback;
    private androidx.activity.OnBackPressedDispatcher mOnBackPressedDispatcher;
    private androidx.fragment.app.Fragment mParent;
    private final java.util.ArrayList<androidx.fragment.app.FragmentManager.OpGenerator> mPendingActions;
    private java.util.ArrayList<androidx.fragment.app.FragmentManager.StartEnterTransitionListener> mPostponedTransactions;
    androidx.fragment.app.Fragment mPrimaryNav;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String[]> mRequestPermissions;
    private final java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager.LifecycleAwareResultListener> mResultListeners;
    private final java.util.Map<java.lang.String, android.os.Bundle> mResults;
    private androidx.fragment.app.SpecialEffectsControllerFactory mSpecialEffectsControllerFactory;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> mStartActivityForResult;
    private androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> mStartIntentSenderForResult;
    private boolean mStateSaved;
    private boolean mStopped;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mTmpAddedFragments;
    private java.util.ArrayList<java.lang.Boolean> mTmpIsPop;
    private java.util.ArrayList<androidx.fragment.app.BackStackRecord> mTmpRecords;












    public interface BackStackEntry {
        @java.lang.Deprecated
        java.lang.CharSequence getBreadCrumbShortTitle();

        @java.lang.Deprecated
        int getBreadCrumbShortTitleRes();

        @java.lang.Deprecated
        java.lang.CharSequence getBreadCrumbTitle();

        @java.lang.Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        java.lang.String getName();
    }

    static class FragmentIntentSenderContract extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.IntentSenderRequest, androidx.activity.result.ActivityResult> {
        FragmentIntentSenderContract() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r4, androidx.activity.result.IntentSenderRequest r5) {
                r3 = this;
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r0 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                r4.<init>(r0)
                android.content.Intent r0 = r5.getFillInIntent()
                if (r0 == 0) goto L42
                java.lang.String r1 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
                android.os.Bundle r2 = r0.getBundleExtra(r1)
                if (r2 == 0) goto L42
                r4.putExtra(r1, r2)
                r0.removeExtra(r1)
                java.lang.String r1 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
                r2 = 0
                boolean r0 = r0.getBooleanExtra(r1, r2)
                if (r0 == 0) goto L42
                androidx.activity.result.IntentSenderRequest$Builder r0 = new androidx.activity.result.IntentSenderRequest$Builder
                android.content.IntentSender r1 = r5.getIntentSender()
                r0.<init>(r1)
                r1 = 0
                androidx.activity.result.IntentSenderRequest$Builder r0 = r0.setFillInIntent(r1)
                int r1 = r5.getFlagsValues()
                int r5 = r5.getFlagsMask()
                androidx.activity.result.IntentSenderRequest$Builder r5 = r0.setFlags(r1, r5)
                androidx.activity.result.IntentSenderRequest r5 = r5.build()
            L42:
                java.lang.String r0 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
                r4.putExtra(r0, r5)
                r5 = 2
                boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
                if (r5 == 0) goto L62
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r0 = "CreateIntent created the following intent: "
                r5.<init>(r0)
                java.lang.StringBuilder r5 = r5.append(r4)
                java.lang.String r5 = r5.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r5)
            L62:
                return r4
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, androidx.activity.result.IntentSenderRequest r2) {
                r0 = this;
                androidx.activity.result.IntentSenderRequest r2 = (androidx.activity.result.IntentSenderRequest) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public androidx.activity.result.ActivityResult parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
                r0.<init>(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.ActivityResult parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                androidx.activity.result.ActivityResult r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    public static abstract class FragmentLifecycleCallbacks {
        public FragmentLifecycleCallbacks() {
                r0 = this;
                r0.<init>()
                return
        }

        @java.lang.Deprecated
        public void onFragmentActivityCreated(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentAttached(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.content.Context r3) {
                r0 = this;
                return
        }

        public void onFragmentCreated(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentDestroyed(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentDetached(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentPaused(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentPreAttached(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.content.Context r3) {
                r0 = this;
                return
        }

        public void onFragmentPreCreated(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentResumed(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentSaveInstanceState(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentStarted(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentStopped(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentViewCreated(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.view.View r3, android.os.Bundle r4) {
                r0 = this;
                return
        }

        public void onFragmentViewDestroyed(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }
    }

    static class LaunchedFragmentInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> CREATOR = null;
        int mRequestCode;
        java.lang.String mWho;


        static {
                androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1 r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1
                r0.<init>()
                androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.CREATOR = r0
                return
        }

        LaunchedFragmentInfo(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.mWho = r0
                int r2 = r2.readInt()
                r1.mRequestCode = r2
                return
        }

        LaunchedFragmentInfo(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.mWho = r1
                r0.mRequestCode = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.mWho
                r1.writeString(r2)
                int r2 = r0.mRequestCode
                r1.writeInt(r2)
                return
        }
    }

    private static class LifecycleAwareResultListener implements androidx.fragment.app.FragmentResultListener {
        private final androidx.lifecycle.Lifecycle mLifecycle;
        private final androidx.fragment.app.FragmentResultListener mListener;
        private final androidx.lifecycle.LifecycleEventObserver mObserver;

        LifecycleAwareResultListener(androidx.lifecycle.Lifecycle r1, androidx.fragment.app.FragmentResultListener r2, androidx.lifecycle.LifecycleEventObserver r3) {
                r0 = this;
                r0.<init>()
                r0.mLifecycle = r1
                r0.mListener = r2
                r0.mObserver = r3
                return
        }

        public boolean isAtLeast(androidx.lifecycle.Lifecycle.State r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle r0 = r1.mLifecycle
                androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
                boolean r2 = r0.isAtLeast(r2)
                return r2
        }

        @Override // androidx.fragment.app.FragmentResultListener
        public void onFragmentResult(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                androidx.fragment.app.FragmentResultListener r0 = r1.mListener
                r0.onFragmentResult(r2, r3)
                return
        }

        public void removeObserver() {
                r2 = this;
                androidx.lifecycle.Lifecycle r0 = r2.mLifecycle
                androidx.lifecycle.LifecycleEventObserver r1 = r2.mObserver
                r0.removeObserver(r1)
                return
        }
    }

    public interface OnBackStackChangedListener {
        void onBackStackChanged();
    }

    interface OpGenerator {
        boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1, java.util.ArrayList<java.lang.Boolean> r2);
    }

    private class PopBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        final int mFlags;
        final int mId;
        final java.lang.String mName;
        final /* synthetic */ androidx.fragment.app.FragmentManager this$0;

        PopBackStackState(androidx.fragment.app.FragmentManager r1, java.lang.String r2, int r3, int r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mName = r2
                r0.mId = r3
                r0.mFlags = r4
                return
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7, java.util.ArrayList<java.lang.Boolean> r8) {
                r6 = this;
                androidx.fragment.app.FragmentManager r0 = r6.this$0
                androidx.fragment.app.Fragment r0 = r0.mPrimaryNav
                if (r0 == 0) goto L1e
                int r0 = r6.mId
                if (r0 >= 0) goto L1e
                java.lang.String r0 = r6.mName
                if (r0 != 0) goto L1e
                androidx.fragment.app.FragmentManager r0 = r6.this$0
                androidx.fragment.app.Fragment r0 = r0.mPrimaryNav
                androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
                boolean r0 = r0.popBackStackImmediate()
                if (r0 == 0) goto L1e
                r7 = 0
                return r7
            L1e:
                androidx.fragment.app.FragmentManager r0 = r6.this$0
                java.lang.String r3 = r6.mName
                int r4 = r6.mId
                int r5 = r6.mFlags
                r1 = r7
                r2 = r8
                boolean r7 = r0.popBackStackState(r1, r2, r3, r4, r5)
                return r7
        }
    }

    static class StartEnterTransitionListener implements androidx.fragment.app.Fragment.OnStartEnterTransitionListener {
        final boolean mIsBack;
        private int mNumPostponed;
        final androidx.fragment.app.BackStackRecord mRecord;

        StartEnterTransitionListener(androidx.fragment.app.BackStackRecord r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.mIsBack = r2
                r0.mRecord = r1
                return
        }

        void cancelTransaction() {
                r4 = this;
                androidx.fragment.app.BackStackRecord r0 = r4.mRecord
                androidx.fragment.app.FragmentManager r0 = r0.mManager
                androidx.fragment.app.BackStackRecord r1 = r4.mRecord
                boolean r2 = r4.mIsBack
                r3 = 0
                r0.completeExecute(r1, r2, r3, r3)
                return
        }

        void completeTransaction() {
                r5 = this;
                int r0 = r5.mNumPostponed
                r1 = 1
                if (r0 <= 0) goto L7
                r0 = r1
                goto L8
            L7:
                r0 = 0
            L8:
                androidx.fragment.app.BackStackRecord r2 = r5.mRecord
                androidx.fragment.app.FragmentManager r2 = r2.mManager
                java.util.List r2 = r2.getFragments()
                java.util.Iterator r2 = r2.iterator()
            L14:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L30
                java.lang.Object r3 = r2.next()
                androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
                r4 = 0
                r3.setOnStartEnterTransitionListener(r4)
                if (r0 == 0) goto L14
                boolean r4 = r3.isPostponed()
                if (r4 == 0) goto L14
                r3.startPostponedEnterTransition()
                goto L14
            L30:
                androidx.fragment.app.BackStackRecord r2 = r5.mRecord
                androidx.fragment.app.FragmentManager r2 = r2.mManager
                androidx.fragment.app.BackStackRecord r3 = r5.mRecord
                boolean r4 = r5.mIsBack
                r0 = r0 ^ r1
                r2.completeExecute(r3, r4, r0, r1)
                return
        }

        public boolean isReady() {
                r1 = this;
                int r0 = r1.mNumPostponed
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // androidx.fragment.app.Fragment.OnStartEnterTransitionListener
        public void onStartEnterTransition() {
                r1 = this;
                int r0 = r1.mNumPostponed
                int r0 = r0 + (-1)
                r1.mNumPostponed = r0
                if (r0 == 0) goto L9
                return
            L9:
                androidx.fragment.app.BackStackRecord r0 = r1.mRecord
                androidx.fragment.app.FragmentManager r0 = r0.mManager
                r0.scheduleCommit()
                return
        }

        @Override // androidx.fragment.app.Fragment.OnStartEnterTransitionListener
        public void startListening() {
                r1 = this;
                int r0 = r1.mNumPostponed
                int r0 = r0 + 1
                r1.mNumPostponed = r0
                return
        }
    }

    static {
            return
    }

    public FragmentManager() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mPendingActions = r0
            androidx.fragment.app.FragmentStore r0 = new androidx.fragment.app.FragmentStore
            r0.<init>()
            r2.mFragmentStore = r0
            androidx.fragment.app.FragmentLayoutInflaterFactory r0 = new androidx.fragment.app.FragmentLayoutInflaterFactory
            r0.<init>(r2)
            r2.mLayoutInflaterFactory = r0
            androidx.fragment.app.FragmentManager$1 r0 = new androidx.fragment.app.FragmentManager$1
            r1 = 0
            r0.<init>(r2, r1)
            r2.mOnBackPressedCallback = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.mBackStackIndex = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.mResults = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.mResultListeners = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.mExitAnimationCancellationSignals = r0
            androidx.fragment.app.FragmentManager$2 r0 = new androidx.fragment.app.FragmentManager$2
            r0.<init>(r2)
            r2.mFragmentTransitionCallback = r0
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = new androidx.fragment.app.FragmentLifecycleCallbacksDispatcher
            r0.<init>(r2)
            r2.mLifecycleCallbacksDispatcher = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.mOnAttachListeners = r0
            r0 = -1
            r2.mCurState = r0
            r0 = 0
            r2.mFragmentFactory = r0
            androidx.fragment.app.FragmentManager$3 r1 = new androidx.fragment.app.FragmentManager$3
            r1.<init>(r2)
            r2.mHostFragmentFactory = r1
            r2.mSpecialEffectsControllerFactory = r0
            androidx.fragment.app.FragmentManager$4 r0 = new androidx.fragment.app.FragmentManager$4
            r0.<init>(r2)
            r2.mDefaultSpecialEffectsControllerFactory = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.mLaunchedFragments = r0
            androidx.fragment.app.FragmentManager$5 r0 = new androidx.fragment.app.FragmentManager$5
            r0.<init>(r2)
            r2.mExecCommit = r0
            return
    }

    static /* synthetic */ java.util.Map access$000(androidx.fragment.app.FragmentManager r0) {
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r0.mResults
            return r0
    }

    static /* synthetic */ java.util.Map access$100(androidx.fragment.app.FragmentManager r0) {
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r0.mResultListeners
            return r0
    }

    static /* synthetic */ androidx.fragment.app.FragmentStore access$200(androidx.fragment.app.FragmentManager r0) {
            androidx.fragment.app.FragmentStore r0 = r0.mFragmentStore
            return r0
    }

    private void addAddedFragments(androidx.collection.ArraySet<androidx.fragment.app.Fragment> r5) {
            r4 = this;
            int r0 = r4.mCurState
            r1 = 1
            if (r0 >= r1) goto L6
            return
        L6:
            r1 = 5
            int r0 = java.lang.Math.min(r0, r1)
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            java.util.List r1 = r1.getFragments()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            int r3 = r2.mState
            if (r3 >= r0) goto L15
            r4.moveToState(r2, r0)
            android.view.View r3 = r2.mView
            if (r3 == 0) goto L15
            boolean r3 = r2.mHidden
            if (r3 != 0) goto L15
            boolean r3 = r2.mIsNewlyAdded
            if (r3 == 0) goto L15
            r5.add(r2)
            goto L15
        L38:
            return
    }

    private void cancelExitAnimation(androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r3.mExitAnimationCancellationSignals
            java.lang.Object r0 = r0.get(r4)
            java.util.HashSet r0 = (java.util.HashSet) r0
            if (r0 == 0) goto L29
            java.util.Iterator r1 = r0.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            androidx.core.os.CancellationSignal r2 = (androidx.core.os.CancellationSignal) r2
            r2.cancel()
            goto Le
        L1e:
            r0.clear()
            r3.destroyFragmentView(r4)
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r3.mExitAnimationCancellationSignals
            r0.remove(r4)
        L29:
            return
    }

    private void checkStateLoss() {
            r2 = this;
            boolean r0 = r2.isStateSaved()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can not perform this action after onSaveInstanceState"
            r0.<init>(r1)
            throw r0
    }

    private void cleanupExec() {
            r1 = this;
            r0 = 0
            r1.mExecutingActions = r0
            java.util.ArrayList<java.lang.Boolean> r0 = r1.mTmpIsPop
            r0.clear()
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mTmpRecords
            r0.clear()
            return
    }

    private java.util.Set<androidx.fragment.app.SpecialEffectsController> collectAllSpecialEffectsController() {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            java.util.List r1 = r1.getActiveFragmentStateManagers()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            androidx.fragment.app.Fragment r2 = r2.getFragment()
            android.view.ViewGroup r2 = r2.mContainer
            if (r2 == 0) goto Lf
            androidx.fragment.app.SpecialEffectsControllerFactory r3 = r4.getSpecialEffectsControllerFactory()
            androidx.fragment.app.SpecialEffectsController r2 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r2, r3)
            r0.add(r2)
            goto Lf
        L2f:
            return r0
    }

    private java.util.Set<androidx.fragment.app.SpecialEffectsController> collectChangedControllers(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r4, int r5, int r6) {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L5:
            if (r5 >= r6) goto L32
            java.lang.Object r1 = r4.get(r5)
            androidx.fragment.app.BackStackRecord r1 = (androidx.fragment.app.BackStackRecord) r1
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r1.mOps
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.C0303Op) r2
            androidx.fragment.app.Fragment r2 = r2.mFragment
            if (r2 == 0) goto L13
            android.view.ViewGroup r2 = r2.mContainer
            if (r2 == 0) goto L13
            androidx.fragment.app.SpecialEffectsController r2 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r2, r3)
            r0.add(r2)
            goto L13
        L2f:
            int r5 = r5 + 1
            goto L5
        L32:
            return r0
    }

    private void completeShowHideFragment(androidx.fragment.app.Fragment r7) {
            r6 = this;
            android.view.View r0 = r7.mView
            r1 = 0
            if (r0 == 0) goto L79
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            android.content.Context r0 = r0.getContext()
            boolean r2 = r7.mHidden
            r2 = r2 ^ 1
            boolean r3 = r7.getPopDirection()
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = androidx.fragment.app.FragmentAnim.loadAnimation(r0, r7, r2, r3)
            if (r0 == 0) goto L4f
            android.animation.Animator r2 = r0.animator
            if (r2 == 0) goto L4f
            android.animation.Animator r2 = r0.animator
            android.view.View r3 = r7.mView
            r2.setTarget(r3)
            boolean r2 = r7.mHidden
            if (r2 == 0) goto L44
            boolean r2 = r7.isHideReplaced()
            if (r2 == 0) goto L32
            r7.setHideReplaced(r1)
            goto L49
        L32:
            android.view.ViewGroup r2 = r7.mContainer
            android.view.View r3 = r7.mView
            r2.startViewTransition(r3)
            android.animation.Animator r4 = r0.animator
            androidx.fragment.app.FragmentManager$7 r5 = new androidx.fragment.app.FragmentManager$7
            r5.<init>(r6, r2, r3, r7)
            r4.addListener(r5)
            goto L49
        L44:
            android.view.View r2 = r7.mView
            r2.setVisibility(r1)
        L49:
            android.animation.Animator r0 = r0.animator
            r0.start()
            goto L79
        L4f:
            if (r0 == 0) goto L5d
            android.view.View r2 = r7.mView
            android.view.animation.Animation r3 = r0.animation
            r2.startAnimation(r3)
            android.view.animation.Animation r0 = r0.animation
            r0.start()
        L5d:
            boolean r0 = r7.mHidden
            if (r0 == 0) goto L6a
            boolean r0 = r7.isHideReplaced()
            if (r0 != 0) goto L6a
            r0 = 8
            goto L6b
        L6a:
            r0 = r1
        L6b:
            android.view.View r2 = r7.mView
            r2.setVisibility(r0)
            boolean r0 = r7.isHideReplaced()
            if (r0 == 0) goto L79
            r7.setHideReplaced(r1)
        L79:
            r6.invalidateMenuForFragment(r7)
            r7.mHiddenChanged = r1
            boolean r0 = r7.mHidden
            r7.onHiddenChanged(r0)
            return
    }

    private void destroyFragmentView(androidx.fragment.app.Fragment r4) {
            r3 = this;
            r4.performDestroyView()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mLifecycleCallbacksDispatcher
            r1 = 0
            r0.dispatchOnFragmentViewDestroyed(r4, r1)
            r0 = 0
            r4.mContainer = r0
            r4.mView = r0
            r4.mViewLifecycleOwner = r0
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r2 = r4.mViewLifecycleOwnerLiveData
            r2.setValue(r0)
            r4.mInLayout = r1
            return
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(androidx.fragment.app.Fragment r2) {
            r1 = this;
            if (r2 == 0) goto L11
            java.lang.String r0 = r2.mWho
            androidx.fragment.app.Fragment r0 = r1.findActiveFragment(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L11
            r2.performPrimaryNavigationFragmentChanged()
        L11:
            return
    }

    private void dispatchStateChange(int r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            r3.mExecutingActions = r0     // Catch: java.lang.Throwable -> L2e
            androidx.fragment.app.FragmentStore r2 = r3.mFragmentStore     // Catch: java.lang.Throwable -> L2e
            r2.dispatchStateChange(r4)     // Catch: java.lang.Throwable -> L2e
            r3.moveToState(r4, r1)     // Catch: java.lang.Throwable -> L2e
            boolean r4 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L28
            java.util.Set r4 = r3.collectAllSpecialEffectsController()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2e
        L18:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L28
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L2e
            androidx.fragment.app.SpecialEffectsController r2 = (androidx.fragment.app.SpecialEffectsController) r2     // Catch: java.lang.Throwable -> L2e
            r2.forceCompleteAllOperations()     // Catch: java.lang.Throwable -> L2e
            goto L18
        L28:
            r3.mExecutingActions = r1
            r3.execPendingActions(r0)
            return
        L2e:
            r4 = move-exception
            r3.mExecutingActions = r1
            throw r4
    }

    private void doPendingDeferredStart() {
            r1 = this;
            boolean r0 = r1.mHavePendingDeferredStart
            if (r0 == 0) goto La
            r0 = 0
            r1.mHavePendingDeferredStart = r0
            r1.startPendingDeferredFragments()
        La:
            return
    }

    @java.lang.Deprecated
    public static void enableDebugLogging(boolean r0) {
            androidx.fragment.app.FragmentManager.DEBUG = r0
            return
    }

    public static void enableNewStateManager(boolean r0) {
            androidx.fragment.app.FragmentManager.USE_STATE_MANAGER = r0
            return
    }

    private void endAnimatingAwayFragments() {
            r2 = this;
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 == 0) goto L1c
            java.util.Set r0 = r2.collectAllSpecialEffectsController()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController r1 = (androidx.fragment.app.SpecialEffectsController) r1
            r1.forceCompleteAllOperations()
            goto Lc
        L1c:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L41
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r2.cancelExitAnimation(r1)
            r2.moveToState(r1)
            goto L2e
        L41:
            return
    }

    private void ensureExecReady(boolean r3) {
            r2 = this;
            boolean r0 = r2.mExecutingActions
            if (r0 != 0) goto L5a
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L1c
            boolean r3 = r2.mDestroyed
            if (r3 == 0) goto L14
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager has been destroyed"
            r3.<init>(r0)
            throw r3
        L14:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager has not been attached to a host."
            r3.<init>(r0)
            throw r3
        L1c:
            android.os.Looper r0 = android.os.Looper.myLooper()
            androidx.fragment.app.FragmentHostCallback<?> r1 = r2.mHost
            android.os.Handler r1 = r1.getHandler()
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L52
            if (r3 != 0) goto L31
            r2.checkStateLoss()
        L31:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r2.mTmpRecords
            if (r3 != 0) goto L43
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mTmpRecords = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mTmpIsPop = r3
        L43:
            r3 = 1
            r2.mExecutingActions = r3
            r3 = 0
            r0 = 0
            r2.executePostponedTransaction(r0, r0)     // Catch: java.lang.Throwable -> L4e
            r2.mExecutingActions = r3
            return
        L4e:
            r0 = move-exception
            r2.mExecutingActions = r3
            throw r0
        L52:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must be called from main thread of fragment host"
            r3.<init>(r0)
            throw r3
        L5a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager is already executing transactions"
            r3.<init>(r0)
            throw r3
    }

    private static void executeOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3, java.util.ArrayList<java.lang.Boolean> r4, int r5, int r6) {
        L0:
            if (r5 >= r6) goto L2c
            java.lang.Object r0 = r3.get(r5)
            androidx.fragment.app.BackStackRecord r0 = (androidx.fragment.app.BackStackRecord) r0
            java.lang.Object r1 = r4.get(r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 1
            if (r1 == 0) goto L23
            r1 = -1
            r0.bumpBackStackNesting(r1)
            int r1 = r6 + (-1)
            if (r5 != r1) goto L1e
            goto L1f
        L1e:
            r2 = 0
        L1f:
            r0.executePopOps(r2)
            goto L29
        L23:
            r0.bumpBackStackNesting(r2)
            r0.executeOps()
        L29:
            int r5 = r5 + 1
            goto L0
        L2c:
            return
    }

    private void executeOpsTogether(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
            r17 = this;
            r6 = r17
            r15 = r18
            r5 = r19
            r4 = r20
            r3 = r21
            java.lang.Object r0 = r15.get(r4)
            androidx.fragment.app.BackStackRecord r0 = (androidx.fragment.app.BackStackRecord) r0
            boolean r2 = r0.mReorderingAllowed
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.mTmpAddedFragments
            if (r0 != 0) goto L1e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.mTmpAddedFragments = r0
            goto L21
        L1e:
            r0.clear()
        L21:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.mTmpAddedFragments
            androidx.fragment.app.FragmentStore r1 = r6.mFragmentStore
            java.util.List r1 = r1.getFragments()
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r17.getPrimaryNavigationFragment()
            r1 = 0
            r16 = r1
            r7 = r4
        L34:
            r14 = 1
            if (r7 >= r3) goto L65
            java.lang.Object r8 = r15.get(r7)
            androidx.fragment.app.BackStackRecord r8 = (androidx.fragment.app.BackStackRecord) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L50
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.mTmpAddedFragments
            androidx.fragment.app.Fragment r0 = r8.expandOps(r9, r0)
            goto L56
        L50:
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.mTmpAddedFragments
            androidx.fragment.app.Fragment r0 = r8.trackAddedFragmentsInPop(r9, r0)
        L56:
            if (r16 != 0) goto L60
            boolean r8 = r8.mAddToBackStack
            if (r8 == 0) goto L5d
            goto L60
        L5d:
            r16 = r1
            goto L62
        L60:
            r16 = r14
        L62:
            int r7 = r7 + 1
            goto L34
        L65:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.mTmpAddedFragments
            r0.clear()
            if (r2 != 0) goto Lbd
            int r0 = r6.mCurState
            if (r0 < r14) goto Lbd
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 == 0) goto La4
            r0 = r4
        L75:
            if (r0 >= r3) goto Lbd
            java.lang.Object r1 = r15.get(r0)
            androidx.fragment.app.BackStackRecord r1 = (androidx.fragment.app.BackStackRecord) r1
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r1.mOps
            java.util.Iterator r1 = r1.iterator()
        L83:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto La1
            java.lang.Object r7 = r1.next()
            androidx.fragment.app.FragmentTransaction$Op r7 = (androidx.fragment.app.FragmentTransaction.C0303Op) r7
            androidx.fragment.app.Fragment r7 = r7.mFragment
            if (r7 == 0) goto L83
            androidx.fragment.app.FragmentManager r8 = r7.mFragmentManager
            if (r8 == 0) goto L83
            androidx.fragment.app.FragmentStateManager r7 = r6.createOrGetFragmentStateManager(r7)
            androidx.fragment.app.FragmentStore r8 = r6.mFragmentStore
            r8.makeActive(r7)
            goto L83
        La1:
            int r0 = r0 + 1
            goto L75
        La4:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            android.content.Context r7 = r0.getContext()
            androidx.fragment.app.FragmentContainer r8 = r6.mContainer
            r13 = 0
            androidx.fragment.app.FragmentTransition$Callback r0 = r6.mFragmentTransitionCallback
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r1 = r14
            r14 = r0
            androidx.fragment.app.FragmentTransition.startTransitions(r7, r8, r9, r10, r11, r12, r13, r14)
            goto Lbe
        Lbd:
            r1 = r14
        Lbe:
            executeOps(r18, r19, r20, r21)
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 == 0) goto L143
            int r0 = r3 + (-1)
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = r4
        Ld2:
            if (r2 >= r3) goto L11c
            java.lang.Object r7 = r15.get(r2)
            androidx.fragment.app.BackStackRecord r7 = (androidx.fragment.app.BackStackRecord) r7
            if (r0 == 0) goto Lfb
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r8 = r7.mOps
            int r8 = r8.size()
            int r8 = r8 - r1
        Le3:
            if (r8 < 0) goto L119
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r9 = r7.mOps
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.FragmentTransaction$Op r9 = (androidx.fragment.app.FragmentTransaction.C0303Op) r9
            androidx.fragment.app.Fragment r9 = r9.mFragment
            if (r9 == 0) goto Lf8
            androidx.fragment.app.FragmentStateManager r9 = r6.createOrGetFragmentStateManager(r9)
            r9.moveToExpectedState()
        Lf8:
            int r8 = r8 + (-1)
            goto Le3
        Lfb:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r7 = r7.mOps
            java.util.Iterator r7 = r7.iterator()
        L101:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L119
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.FragmentTransaction$Op r8 = (androidx.fragment.app.FragmentTransaction.C0303Op) r8
            androidx.fragment.app.Fragment r8 = r8.mFragment
            if (r8 == 0) goto L101
            androidx.fragment.app.FragmentStateManager r8 = r6.createOrGetFragmentStateManager(r8)
            r8.moveToExpectedState()
            goto L101
        L119:
            int r2 = r2 + 1
            goto Ld2
        L11c:
            int r2 = r6.mCurState
            r6.moveToState(r2, r1)
            java.util.Set r1 = r6.collectChangedControllers(r15, r4, r3)
            java.util.Iterator r1 = r1.iterator()
        L129:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L13f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.SpecialEffectsController r2 = (androidx.fragment.app.SpecialEffectsController) r2
            r2.updateOperationDirection(r0)
            r2.markPostponedState()
            r2.executePendingOperations()
            goto L129
        L13f:
            r0 = r3
            r3 = r5
            goto L199
        L143:
            if (r2 == 0) goto L165
            androidx.collection.ArraySet r7 = new androidx.collection.ArraySet
            r7.<init>()
            r6.addAddedFragments(r7)
            r0 = r17
            r14 = r1
            r1 = r18
            r8 = r2
            r2 = r19
            r13 = r3
            r3 = r20
            r12 = r4
            r4 = r21
            r11 = r5
            r5 = r7
            int r0 = r0.postponePostponableTransactions(r1, r2, r3, r4, r5)
            r6.makeRemovedFragmentsInvisible(r7)
            goto L16b
        L165:
            r14 = r1
            r8 = r2
            r13 = r3
            r12 = r4
            r11 = r5
            r0 = r13
        L16b:
            if (r0 == r12) goto L197
            if (r8 == 0) goto L197
            int r1 = r6.mCurState
            if (r1 < r14) goto L18e
            androidx.fragment.app.FragmentHostCallback<?> r1 = r6.mHost
            android.content.Context r7 = r1.getContext()
            androidx.fragment.app.FragmentContainer r8 = r6.mContainer
            r1 = 1
            androidx.fragment.app.FragmentTransition$Callback r2 = r6.mFragmentTransitionCallback
            r9 = r18
            r10 = r19
            r3 = r11
            r11 = r20
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = r14
            r14 = r2
            androidx.fragment.app.FragmentTransition.startTransitions(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L191
        L18e:
            r3 = r11
            r0 = r13
            r1 = r14
        L191:
            int r2 = r6.mCurState
            r6.moveToState(r2, r1)
            goto L199
        L197:
            r3 = r11
            r0 = r13
        L199:
            r1 = r20
        L19b:
            if (r1 >= r0) goto L1bc
            java.lang.Object r2 = r15.get(r1)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            java.lang.Object r4 = r3.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L1b6
            int r4 = r2.mIndex
            if (r4 < 0) goto L1b6
            r4 = -1
            r2.mIndex = r4
        L1b6:
            r2.runOnCommitRunnables()
            int r1 = r1 + 1
            goto L19b
        L1bc:
            if (r16 == 0) goto L1c1
            r17.reportBackStackChanged()
        L1c1:
            return
    }

    private void executePostponedTransaction(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r8, java.util.ArrayList<java.lang.Boolean> r9) {
            r7 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r7.mPostponedTransactions
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.size()
        Lb:
            r2 = r1
        Lc:
            if (r2 >= r0) goto L83
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r3 = r7.mPostponedTransactions
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.FragmentManager$StartEnterTransitionListener r3 = (androidx.fragment.app.FragmentManager.StartEnterTransitionListener) r3
            r4 = -1
            if (r8 == 0) goto L40
            boolean r5 = r3.mIsBack
            if (r5 != 0) goto L40
            androidx.fragment.app.BackStackRecord r5 = r3.mRecord
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L40
            if (r9 == 0) goto L40
            java.lang.Object r5 = r9.get(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L40
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r4 = r7.mPostponedTransactions
            r4.remove(r2)
            int r2 = r2 + (-1)
            int r0 = r0 + (-1)
            r3.cancelTransaction()
            goto L80
        L40:
            boolean r5 = r3.isReady()
            if (r5 != 0) goto L54
            if (r8 == 0) goto L80
            androidx.fragment.app.BackStackRecord r5 = r3.mRecord
            int r6 = r8.size()
            boolean r5 = r5.interactsWith(r8, r1, r6)
            if (r5 == 0) goto L80
        L54:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r5 = r7.mPostponedTransactions
            r5.remove(r2)
            int r2 = r2 + (-1)
            int r0 = r0 + (-1)
            if (r8 == 0) goto L7d
            boolean r5 = r3.mIsBack
            if (r5 != 0) goto L7d
            androidx.fragment.app.BackStackRecord r5 = r3.mRecord
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L7d
            if (r9 == 0) goto L7d
            java.lang.Object r4 = r9.get(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L7d
            r3.cancelTransaction()
            goto L80
        L7d:
            r3.completeTransaction()
        L80:
            int r2 = r2 + 1
            goto Lc
        L83:
            return
    }

    public static <F extends androidx.fragment.app.Fragment> F findFragment(android.view.View r3) {
            androidx.fragment.app.Fragment r0 = findViewFragment(r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "View "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " does not have a Fragment set"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    static androidx.fragment.app.FragmentManager findFragmentManager(android.view.View r4) {
            androidx.fragment.app.Fragment r0 = findViewFragment(r4)
            if (r0 == 0) goto L36
            boolean r1 = r0.isAdded()
            if (r1 == 0) goto L11
            androidx.fragment.app.FragmentManager r4 = r0.getChildFragmentManager()
            goto L53
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "The Fragment "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " that owns View "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = " has already been destroyed. Nested fragments should always use the child FragmentManager."
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            throw r1
        L36:
            android.content.Context r0 = r4.getContext()
        L3a:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L4c
            boolean r1 = r0 instanceof androidx.fragment.app.FragmentActivity
            if (r1 == 0) goto L45
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            goto L4d
        L45:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L3a
        L4c:
            r0 = 0
        L4d:
            if (r0 == 0) goto L54
            androidx.fragment.app.FragmentManager r4 = r0.getSupportFragmentManager()
        L53:
            return r4
        L54:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "View "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " is not within a subclass of FragmentActivity."
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private static androidx.fragment.app.Fragment findViewFragment(android.view.View r2) {
        L0:
            r0 = 0
            if (r2 == 0) goto L17
            androidx.fragment.app.Fragment r1 = getViewFragment(r2)
            if (r1 == 0) goto La
            return r1
        La:
            android.view.ViewParent r2 = r2.getParent()
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L15
            android.view.View r2 = (android.view.View) r2
            goto L0
        L15:
            r2 = r0
            goto L0
        L17:
            return r0
    }

    private void forcePostponedTransactions() {
            r2 = this;
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 == 0) goto L1c
            java.util.Set r0 = r2.collectAllSpecialEffectsController()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController r1 = (androidx.fragment.app.SpecialEffectsController) r1
            r1.forcePostponedExecutePendingOperations()
            goto Lc
        L1c:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r2.mPostponedTransactions
            if (r0 == 0) goto L35
        L20:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r2.mPostponedTransactions
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L35
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r2.mPostponedTransactions
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)
            androidx.fragment.app.FragmentManager$StartEnterTransitionListener r0 = (androidx.fragment.app.FragmentManager.StartEnterTransitionListener) r0
            r0.completeTransaction()
            goto L20
        L35:
            return
    }

    private boolean generateOpsForPendingActions(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6, java.util.ArrayList<java.lang.Boolean> r7) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r5.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r5.mPendingActions     // Catch: java.lang.Throwable -> L39
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L39
            r2 = 0
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return r2
        Le:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r5.mPendingActions     // Catch: java.lang.Throwable -> L39
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L39
            r3 = r2
        L15:
            if (r2 >= r1) goto L27
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r4 = r5.mPendingActions     // Catch: java.lang.Throwable -> L39
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L39
            androidx.fragment.app.FragmentManager$OpGenerator r4 = (androidx.fragment.app.FragmentManager.OpGenerator) r4     // Catch: java.lang.Throwable -> L39
            boolean r4 = r4.generateOps(r6, r7)     // Catch: java.lang.Throwable -> L39
            r3 = r3 | r4
            int r2 = r2 + 1
            goto L15
        L27:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r6 = r5.mPendingActions     // Catch: java.lang.Throwable -> L39
            r6.clear()     // Catch: java.lang.Throwable -> L39
            androidx.fragment.app.FragmentHostCallback<?> r6 = r5.mHost     // Catch: java.lang.Throwable -> L39
            android.os.Handler r6 = r6.getHandler()     // Catch: java.lang.Throwable -> L39
            java.lang.Runnable r7 = r5.mExecCommit     // Catch: java.lang.Throwable -> L39
            r6.removeCallbacks(r7)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return r3
        L39:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r6
    }

    private androidx.fragment.app.FragmentManagerViewModel getChildNonConfig(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            androidx.fragment.app.FragmentManagerViewModel r2 = r0.getChildNonConfig(r2)
            return r2
    }

    private android.view.ViewGroup getFragmentContainer(androidx.fragment.app.Fragment r3) {
            r2 = this;
            android.view.ViewGroup r0 = r3.mContainer
            if (r0 == 0) goto L7
            android.view.ViewGroup r3 = r3.mContainer
            return r3
        L7:
            int r0 = r3.mContainerId
            r1 = 0
            if (r0 > 0) goto Ld
            return r1
        Ld:
            androidx.fragment.app.FragmentContainer r0 = r2.mContainer
            boolean r0 = r0.onHasView()
            if (r0 == 0) goto L24
            androidx.fragment.app.FragmentContainer r0 = r2.mContainer
            int r3 = r3.mContainerId
            android.view.View r3 = r0.onFindViewById(r3)
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L24
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
        L24:
            return r1
    }

    static androidx.fragment.app.Fragment getViewFragment(android.view.View r1) {
            int r0 = androidx.fragment.C0252R.id.fragment_container_view_tag
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto Ld
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    static boolean isLoggingEnabled(int r1) {
            boolean r0 = androidx.fragment.app.FragmentManager.DEBUG
            if (r0 != 0) goto Lf
            java.lang.String r0 = "FragmentManager"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    private boolean isMenuAvailable(androidx.fragment.app.Fragment r2) {
            r1 = this;
            boolean r0 = r2.mHasMenu
            if (r0 == 0) goto L8
            boolean r0 = r2.mMenuVisible
            if (r0 != 0) goto L10
        L8:
            androidx.fragment.app.FragmentManager r2 = r2.mChildFragmentManager
            boolean r2 = r2.checkForMenus()
            if (r2 == 0) goto L12
        L10:
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    private void makeRemovedFragmentsInvisible(androidx.collection.ArraySet<androidx.fragment.app.Fragment> r6) {
            r5 = this;
            int r0 = r6.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L22
            java.lang.Object r2 = r6.valueAt(r1)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            boolean r3 = r2.mAdded
            if (r3 != 0) goto L1f
            android.view.View r3 = r2.requireView()
            float r4 = r3.getAlpha()
            r2.mPostponedAlpha = r4
            r2 = 0
            r3.setAlpha(r2)
        L1f:
            int r1 = r1 + 1
            goto L5
        L22:
            return
    }

    private boolean popBackStackImmediate(java.lang.String r9, int r10, int r11) {
            r8 = this;
            r0 = 0
            r8.execPendingActions(r0)
            r0 = 1
            r8.ensureExecReady(r0)
            androidx.fragment.app.Fragment r1 = r8.mPrimaryNav
            if (r1 == 0) goto L1b
            if (r10 >= 0) goto L1b
            if (r9 != 0) goto L1b
            androidx.fragment.app.FragmentManager r1 = r1.getChildFragmentManager()
            boolean r1 = r1.popBackStackImmediate()
            if (r1 == 0) goto L1b
            return r0
        L1b:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r8.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r4 = r8.mTmpIsPop
            r2 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            boolean r9 = r2.popBackStackState(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L3b
            r8.mExecutingActions = r0
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10 = r8.mTmpRecords     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList<java.lang.Boolean> r11 = r8.mTmpIsPop     // Catch: java.lang.Throwable -> L36
            r8.removeRedundantOperationsAndExecute(r10, r11)     // Catch: java.lang.Throwable -> L36
            r8.cleanupExec()
            goto L3b
        L36:
            r9 = move-exception
            r8.cleanupExec()
            throw r9
        L3b:
            r8.updateOnBackPressedCallbackEnabled()
            r8.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r10 = r8.mFragmentStore
            r10.burpActive()
            return r9
    }

    private int postponePostponableTransactions(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r8, java.util.ArrayList<java.lang.Boolean> r9, int r10, int r11, androidx.collection.ArraySet<androidx.fragment.app.Fragment> r12) {
            r7 = this;
            int r0 = r11 + (-1)
            r1 = r11
        L3:
            if (r0 < r10) goto L5a
            java.lang.Object r2 = r8.get(r0)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            java.lang.Object r3 = r9.get(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r4 = r2.isPostponed()
            r5 = 0
            if (r4 == 0) goto L26
            int r4 = r0 + 1
            boolean r4 = r2.interactsWith(r8, r4, r11)
            if (r4 != 0) goto L26
            r4 = 1
            goto L27
        L26:
            r4 = r5
        L27:
            if (r4 == 0) goto L57
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r4 = r7.mPostponedTransactions
            if (r4 != 0) goto L34
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7.mPostponedTransactions = r4
        L34:
            androidx.fragment.app.FragmentManager$StartEnterTransitionListener r4 = new androidx.fragment.app.FragmentManager$StartEnterTransitionListener
            r4.<init>(r2, r3)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r6 = r7.mPostponedTransactions
            r6.add(r4)
            r2.setOnStartPostponedListener(r4)
            if (r3 == 0) goto L47
            r2.executeOps()
            goto L4a
        L47:
            r2.executePopOps(r5)
        L4a:
            int r1 = r1 + (-1)
            if (r0 == r1) goto L54
            r8.remove(r0)
            r8.add(r1, r2)
        L54:
            r7.addAddedFragments(r12)
        L57:
            int r0 = r0 + (-1)
            goto L3
        L5a:
            return r1
    }

    private void removeRedundantOperationsAndExecute(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5, java.util.ArrayList<java.lang.Boolean> r6) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r5.size()
            int r1 = r6.size()
            if (r0 != r1) goto L62
            r4.executePostponedTransaction(r5, r6)
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        L1a:
            if (r1 >= r0) goto L5c
            java.lang.Object r3 = r5.get(r1)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            boolean r3 = r3.mReorderingAllowed
            if (r3 != 0) goto L59
            if (r2 == r1) goto L2b
            r4.executeOpsTogether(r5, r6, r2, r1)
        L2b:
            int r2 = r1 + 1
            java.lang.Object r3 = r6.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L54
        L39:
            if (r2 >= r0) goto L54
            java.lang.Object r3 = r6.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L54
            java.lang.Object r3 = r5.get(r2)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            boolean r3 = r3.mReorderingAllowed
            if (r3 != 0) goto L54
            int r2 = r2 + 1
            goto L39
        L54:
            r4.executeOpsTogether(r5, r6, r1, r2)
            int r1 = r2 + (-1)
        L59:
            int r1 = r1 + 1
            goto L1a
        L5c:
            if (r2 == r0) goto L61
            r4.executeOpsTogether(r5, r6, r2, r0)
        L61:
            return
        L62:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Internal error with the back stack records"
            r5.<init>(r6)
            throw r5
    }

    private void reportBackStackChanged() {
            r2 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r2.mBackStackChangeListeners
            if (r0 == 0) goto L1b
            r0 = 0
        L5:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r1 = r2.mBackStackChangeListeners
            int r1 = r1.size()
            if (r0 >= r1) goto L1b
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r1 = r2.mBackStackChangeListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.FragmentManager$OnBackStackChangedListener r1 = (androidx.fragment.app.FragmentManager.OnBackStackChangedListener) r1
            r1.onBackStackChanged()
            int r0 = r0 + 1
            goto L5
        L1b:
            return
    }

    static int reverseTransit(int r3) {
            r0 = 8194(0x2002, float:1.1482E-41)
            r1 = 4097(0x1001, float:5.741E-42)
            if (r3 == r1) goto L11
            r2 = 4099(0x1003, float:5.744E-42)
            if (r3 == r2) goto L10
            if (r3 == r0) goto Le
            r0 = 0
            goto L11
        Le:
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            return r0
    }

    private void setVisibleRemovingFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            android.view.ViewGroup r0 = r3.getFragmentContainer(r4)
            if (r0 == 0) goto L37
            int r1 = r4.getEnterAnim()
            int r2 = r4.getExitAnim()
            int r1 = r1 + r2
            int r2 = r4.getPopEnterAnim()
            int r1 = r1 + r2
            int r2 = r4.getPopExitAnim()
            int r1 = r1 + r2
            if (r1 <= 0) goto L37
            int r1 = androidx.fragment.C0252R.id.visible_removing_fragment_view_tag
            java.lang.Object r1 = r0.getTag(r1)
            if (r1 != 0) goto L28
            int r1 = androidx.fragment.C0252R.id.visible_removing_fragment_view_tag
            r0.setTag(r1, r4)
        L28:
            int r1 = androidx.fragment.C0252R.id.visible_removing_fragment_view_tag
            java.lang.Object r0 = r0.getTag(r1)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            boolean r4 = r4.getPopDirection()
            r0.setPopDirection(r4)
        L37:
            return
    }

    private void startPendingDeferredFragments() {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            r2.performPendingDeferredStart(r1)
            goto La
        L1a:
            return
    }

    private void throwException(java.lang.RuntimeException r8) {
            r7 = this;
            java.lang.String r0 = r8.getMessage()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "Activity state:"
            android.util.Log.e(r1, r0)
            androidx.fragment.app.LogWriter r0 = new androidx.fragment.app.LogWriter
            r0.<init>(r1)
            java.io.PrintWriter r2 = new java.io.PrintWriter
            r2.<init>(r0)
            androidx.fragment.app.FragmentHostCallback<?> r0 = r7.mHost
            java.lang.String r3 = "Failed dumping state"
            r4 = 0
            r5 = 0
            java.lang.String r6 = "  "
            if (r0 == 0) goto L2d
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L28
            r0.onDump(r6, r5, r2, r4)     // Catch: java.lang.Exception -> L28
            goto L37
        L28:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
            goto L37
        L2d:
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L33
            r7.dump(r6, r5, r2, r0)     // Catch: java.lang.Exception -> L33
            goto L37
        L33:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
        L37:
            throw r8
    }

    private void updateOnBackPressedCallbackEnabled() {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r3.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r3.mPendingActions     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2a
            r2 = 1
            if (r1 != 0) goto L13
            androidx.activity.OnBackPressedCallback r1 = r3.mOnBackPressedCallback     // Catch: java.lang.Throwable -> L2a
            r1.setEnabled(r2)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            androidx.activity.OnBackPressedCallback r0 = r3.mOnBackPressedCallback
            int r1 = r3.getBackStackEntryCount()
            if (r1 <= 0) goto L25
            androidx.fragment.app.Fragment r1 = r3.mParent
            boolean r1 = r3.isPrimaryNavigation(r1)
            if (r1 == 0) goto L25
            goto L26
        L25:
            r2 = 0
        L26:
            r0.setEnabled(r2)
            return
        L2a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r1
    }

    void addBackStackState(androidx.fragment.app.BackStackRecord r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mBackStack = r0
        Lb:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            r0.add(r2)
            return
    }

    void addCancellationSignal(androidx.fragment.app.Fragment r3, androidx.core.os.CancellationSignal r4) {
            r2 = this;
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L12
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.put(r3, r1)
        L12:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            java.lang.Object r3 = r0.get(r3)
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.add(r4)
            return
    }

    androidx.fragment.app.FragmentStateManager addFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "add: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1b:
            androidx.fragment.app.FragmentStateManager r0 = r3.createOrGetFragmentStateManager(r4)
            r4.mFragmentManager = r3
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            r1.makeActive(r0)
            boolean r1 = r4.mDetached
            if (r1 != 0) goto L41
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            r1.addFragment(r4)
            r1 = 0
            r4.mRemoving = r1
            android.view.View r2 = r4.mView
            if (r2 != 0) goto L38
            r4.mHiddenChanged = r1
        L38:
            boolean r4 = r3.isMenuAvailable(r4)
            if (r4 == 0) goto L41
            r4 = 1
            r3.mNeedMenuInvalidate = r4
        L41:
            return r0
    }

    public void addFragmentOnAttachListener(androidx.fragment.app.FragmentOnAttachListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r1.mOnAttachListeners
            r0.add(r2)
            return
    }

    public void addOnBackStackChangedListener(androidx.fragment.app.FragmentManager.OnBackStackChangedListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mBackStackChangeListeners = r0
        Lb:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            r0.add(r2)
            return
    }

    void addRetainedFragment(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            r0.addRetainedFragment(r2)
            return
    }

    int allocBackStackIndex() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.mBackStackIndex
            int r0 = r0.getAndIncrement()
            return r0
    }

    void attachController(androidx.fragment.app.FragmentHostCallback<?> r3, androidx.fragment.app.FragmentContainer r4, androidx.fragment.app.Fragment r5) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L10e
            r2.mHost = r3
            r2.mContainer = r4
            r2.mParent = r5
            if (r5 == 0) goto L15
            androidx.fragment.app.FragmentManager$8 r4 = new androidx.fragment.app.FragmentManager$8
            r4.<init>(r2, r5)
            r2.addFragmentOnAttachListener(r4)
            goto L1f
        L15:
            boolean r4 = r3 instanceof androidx.fragment.app.FragmentOnAttachListener
            if (r4 == 0) goto L1f
            r4 = r3
            androidx.fragment.app.FragmentOnAttachListener r4 = (androidx.fragment.app.FragmentOnAttachListener) r4
            r2.addFragmentOnAttachListener(r4)
        L1f:
            androidx.fragment.app.Fragment r4 = r2.mParent
            if (r4 == 0) goto L26
            r2.updateOnBackPressedCallbackEnabled()
        L26:
            boolean r4 = r3 instanceof androidx.activity.OnBackPressedDispatcherOwner
            if (r4 == 0) goto L3b
            r4 = r3
            androidx.activity.OnBackPressedDispatcherOwner r4 = (androidx.activity.OnBackPressedDispatcherOwner) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.mOnBackPressedDispatcher = r0
            if (r5 == 0) goto L36
            r4 = r5
        L36:
            androidx.activity.OnBackPressedCallback r1 = r2.mOnBackPressedCallback
            r0.addCallback(r4, r1)
        L3b:
            if (r5 == 0) goto L46
            androidx.fragment.app.FragmentManager r3 = r5.mFragmentManager
            androidx.fragment.app.FragmentManagerViewModel r3 = r3.getChildNonConfig(r5)
            r2.mNonConfig = r3
            goto L5f
        L46:
            boolean r4 = r3 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r4 == 0) goto L57
            androidx.lifecycle.ViewModelStoreOwner r3 = (androidx.lifecycle.ViewModelStoreOwner) r3
            androidx.lifecycle.ViewModelStore r3 = r3.getViewModelStore()
            androidx.fragment.app.FragmentManagerViewModel r3 = androidx.fragment.app.FragmentManagerViewModel.getInstance(r3)
            r2.mNonConfig = r3
            goto L5f
        L57:
            androidx.fragment.app.FragmentManagerViewModel r3 = new androidx.fragment.app.FragmentManagerViewModel
            r4 = 0
            r3.<init>(r4)
            r2.mNonConfig = r3
        L5f:
            androidx.fragment.app.FragmentManagerViewModel r3 = r2.mNonConfig
            boolean r4 = r2.isStateSaved()
            r3.setIsStateSaved(r4)
            androidx.fragment.app.FragmentStore r3 = r2.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r4 = r2.mNonConfig
            r3.setNonConfig(r4)
            androidx.fragment.app.FragmentHostCallback<?> r3 = r2.mHost
            boolean r4 = r3 instanceof androidx.activity.result.ActivityResultRegistryOwner
            if (r4 == 0) goto L10d
            androidx.activity.result.ActivityResultRegistryOwner r3 = (androidx.activity.result.ActivityResultRegistryOwner) r3
            androidx.activity.result.ActivityResultRegistry r3 = r3.getActivityResultRegistry()
            if (r5 == 0) goto L93
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.mWho
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ":"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L95
        L93:
            java.lang.String r4 = ""
        L95:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "FragmentManager:"
            r5.<init>(r0)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            androidx.fragment.app.FragmentManager$9 r1 = new androidx.fragment.app.FragmentManager$9
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r5 = r3.register(r5, r0, r1)
            r2.mStartActivityForResult = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.FragmentManager$FragmentIntentSenderContract r0 = new androidx.fragment.app.FragmentManager$FragmentIntentSenderContract
            r0.<init>()
            androidx.fragment.app.FragmentManager$10 r1 = new androidx.fragment.app.FragmentManager$10
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r5 = r3.register(r5, r0, r1)
            r2.mStartIntentSenderForResult = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = "RequestPermissions"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions r5 = new androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions
            r5.<init>()
            androidx.fragment.app.FragmentManager$11 r0 = new androidx.fragment.app.FragmentManager$11
            r0.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r3 = r3.register(r4, r5, r0)
            r2.mRequestPermissions = r3
        L10d:
            return
        L10e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
    }

    void attachFragment(androidx.fragment.app.Fragment r5) {
            r4 = this;
            r0 = 2
            boolean r1 = isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "attach: "
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1b:
            boolean r1 = r5.mDetached
            if (r1 == 0) goto L4c
            r1 = 0
            r5.mDetached = r1
            boolean r1 = r5.mAdded
            if (r1 != 0) goto L4c
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            r1.addFragment(r5)
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "add from attach: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L43:
            boolean r5 = r4.isMenuAvailable(r5)
            if (r5 == 0) goto L4c
            r5 = 1
            r4.mNeedMenuInvalidate = r5
        L4c:
            return
    }

    public androidx.fragment.app.FragmentTransaction beginTransaction() {
            r1 = this;
            androidx.fragment.app.BackStackRecord r0 = new androidx.fragment.app.BackStackRecord
            r0.<init>(r1)
            return r0
    }

    boolean checkForMenus() {
            r4 = this;
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.util.List r0 = r0.getActiveFragments()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        Lc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L1e
            boolean r2 = r4.isMenuAvailable(r3)
        L1e:
            if (r2 == 0) goto Lc
            r0 = 1
            return r0
        L22:
            return r1
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResult(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r1.mResults
            r0.remove(r2)
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResultListener(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r1.mResultListeners
            java.lang.Object r2 = r0.remove(r2)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r2 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r2
            if (r2 == 0) goto Ld
            r2.removeObserver()
        Ld:
            return
    }

    void completeExecute(androidx.fragment.app.BackStackRecord r10, boolean r11, boolean r12, boolean r13) {
            r9 = this;
            if (r11 == 0) goto L6
            r10.executePopOps(r13)
            goto L9
        L6:
            r10.executeOps()
        L9:
            java.util.ArrayList r2 = new java.util.ArrayList
            r8 = 1
            r2.<init>(r8)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r8)
            r2.add(r10)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r3.add(r11)
            if (r12 == 0) goto L34
            int r11 = r9.mCurState
            if (r11 < r8) goto L34
            androidx.fragment.app.FragmentHostCallback<?> r11 = r9.mHost
            android.content.Context r0 = r11.getContext()
            androidx.fragment.app.FragmentContainer r1 = r9.mContainer
            r4 = 0
            r5 = 1
            r6 = 1
            androidx.fragment.app.FragmentTransition$Callback r7 = r9.mFragmentTransitionCallback
            androidx.fragment.app.FragmentTransition.startTransitions(r0, r1, r2, r3, r4, r5, r6, r7)
        L34:
            if (r13 == 0) goto L3b
            int r11 = r9.mCurState
            r9.moveToState(r11, r8)
        L3b:
            androidx.fragment.app.FragmentStore r11 = r9.mFragmentStore
            java.util.List r11 = r11.getActiveFragments()
            java.util.Iterator r11 = r11.iterator()
        L45:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L7e
            java.lang.Object r12 = r11.next()
            androidx.fragment.app.Fragment r12 = (androidx.fragment.app.Fragment) r12
            if (r12 == 0) goto L45
            android.view.View r0 = r12.mView
            if (r0 == 0) goto L45
            boolean r0 = r12.mIsNewlyAdded
            if (r0 == 0) goto L45
            int r0 = r12.mContainerId
            boolean r0 = r10.interactsWith(r0)
            if (r0 == 0) goto L45
            float r0 = r12.mPostponedAlpha
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L71
            android.view.View r0 = r12.mView
            float r2 = r12.mPostponedAlpha
            r0.setAlpha(r2)
        L71:
            if (r13 == 0) goto L76
            r12.mPostponedAlpha = r1
            goto L45
        L76:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12.mPostponedAlpha = r0
            r0 = 0
            r12.mIsNewlyAdded = r0
            goto L45
        L7e:
            return
    }

    androidx.fragment.app.FragmentStateManager createOrGetFragmentStateManager(androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            java.lang.String r1 = r4.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            androidx.fragment.app.FragmentStateManager r0 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r3.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r2 = r3.mFragmentStore
            r0.<init>(r1, r2, r4)
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.mHost
            android.content.Context r4 = r4.getContext()
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r0.restoreState(r4)
            int r4 = r3.mCurState
            r0.setFragmentManagerState(r4)
            return r0
    }

    void detachFragment(androidx.fragment.app.Fragment r5) {
            r4 = this;
            r0 = 2
            boolean r1 = isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "detach: "
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1b:
            boolean r1 = r5.mDetached
            if (r1 != 0) goto L4e
            r1 = 1
            r5.mDetached = r1
            boolean r3 = r5.mAdded
            if (r3 == 0) goto L4e
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "remove from detach: "
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L3e:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            r0.removeFragment(r5)
            boolean r0 = r4.isMenuAvailable(r5)
            if (r0 == 0) goto L4b
            r4.mNeedMenuInvalidate = r1
        L4b:
            r4.setVisibleRemovingFragment(r5)
        L4e:
            return
    }

    void dispatchActivityCreated() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 4
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchAttach() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto La
            r1.performConfigurationChanged(r3)
            goto La
        L1c:
            return
    }

    boolean dispatchContextItemSelected(android.view.MenuItem r5) {
            r4 = this;
            int r0 = r4.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L11
            boolean r3 = r3.performContextItemSelected(r5)
            if (r3 == 0) goto L11
            return r2
        L26:
            return r1
    }

    void dispatchCreate() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 1
            r2.dispatchStateChange(r0)
            return
    }

    boolean dispatchCreateOptionsMenu(android.view.Menu r8, android.view.MenuInflater r9) {
            r7 = this;
            int r0 = r7.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r7.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
            r4 = r1
        L13:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L39
            java.lang.Object r5 = r0.next()
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            if (r5 == 0) goto L13
            boolean r6 = r7.isParentMenuVisible(r5)
            if (r6 == 0) goto L13
            boolean r6 = r5.performCreateOptionsMenu(r8, r9)
            if (r6 == 0) goto L13
            if (r3 != 0) goto L34
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L34:
            r3.add(r5)
            r4 = r2
            goto L13
        L39:
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r7.mCreatedMenus
            if (r8 == 0) goto L5b
        L3d:
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r7.mCreatedMenus
            int r8 = r8.size()
            if (r1 >= r8) goto L5b
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r7.mCreatedMenus
            java.lang.Object r8 = r8.get(r1)
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            if (r3 == 0) goto L55
            boolean r9 = r3.contains(r8)
            if (r9 != 0) goto L58
        L55:
            r8.onDestroyOptionsMenu()
        L58:
            int r1 = r1 + 1
            goto L3d
        L5b:
            r7.mCreatedMenus = r3
            return r4
    }

    void dispatchDestroy() {
            r2 = this;
            r0 = 1
            r2.mDestroyed = r0
            r2.execPendingActions(r0)
            r2.endAnimatingAwayFragments()
            r0 = -1
            r2.dispatchStateChange(r0)
            r0 = 0
            r2.mHost = r0
            r2.mContainer = r0
            r2.mParent = r0
            androidx.activity.OnBackPressedDispatcher r1 = r2.mOnBackPressedDispatcher
            if (r1 == 0) goto L1f
            androidx.activity.OnBackPressedCallback r1 = r2.mOnBackPressedCallback
            r1.remove()
            r2.mOnBackPressedDispatcher = r0
        L1f:
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r2.mStartActivityForResult
            if (r0 == 0) goto L30
            r0.unregister()
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r0 = r2.mStartIntentSenderForResult
            r0.unregister()
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r0 = r2.mRequestPermissions
            r0.unregister()
        L30:
            return
    }

    void dispatchDestroyView() {
            r1 = this;
            r0 = 1
            r1.dispatchStateChange(r0)
            return
    }

    void dispatchLowMemory() {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto La
            r1.performLowMemory()
            goto La
        L1c:
            return
    }

    void dispatchMultiWindowModeChanged(boolean r3) {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto La
            r1.performMultiWindowModeChanged(r3)
            goto La
        L1c:
            return
    }

    void dispatchOnAttachFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r2.mOnAttachListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentOnAttachListener r1 = (androidx.fragment.app.FragmentOnAttachListener) r1
            r1.onAttachFragment(r2, r3)
            goto L6
        L16:
            return
    }

    boolean dispatchOptionsItemSelected(android.view.MenuItem r5) {
            r4 = this;
            int r0 = r4.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L11
            boolean r3 = r3.performOptionsItemSelected(r5)
            if (r3 == 0) goto L11
            return r2
        L26:
            return r1
    }

    void dispatchOptionsMenuClosed(android.view.Menu r3) {
            r2 = this;
            int r0 = r2.mCurState
            r1 = 1
            if (r0 >= r1) goto L6
            return
        L6:
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L10
            r1.performOptionsMenuClosed(r3)
            goto L10
        L22:
            return
    }

    void dispatchPause() {
            r1 = this;
            r0 = 5
            r1.dispatchStateChange(r0)
            return
    }

    void dispatchPictureInPictureModeChanged(boolean r3) {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto La
            r1.performPictureInPictureModeChanged(r3)
            goto La
        L1c:
            return
    }

    boolean dispatchPrepareOptionsMenu(android.view.Menu r6) {
            r5 = this;
            int r0 = r5.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L11
            boolean r4 = r5.isParentMenuVisible(r3)
            if (r4 == 0) goto L11
            boolean r3 = r3.performPrepareOptionsMenu(r6)
            if (r3 == 0) goto L11
            r1 = r2
            goto L11
        L2d:
            return r1
    }

    void dispatchPrimaryNavigationFragmentChanged() {
            r1 = this;
            r1.updateOnBackPressedCallbackEnabled()
            androidx.fragment.app.Fragment r0 = r1.mPrimaryNav
            r1.dispatchParentPrimaryNavigationFragmentChanged(r0)
            return
    }

    void dispatchResume() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 7
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchStart() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 5
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchStop() {
            r2 = this;
            r0 = 1
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 4
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchViewCreated() {
            r1 = this;
            r0 = 2
            r1.dispatchStateChange(r0)
            return
    }

    public void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r1 = "    "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            r1.dump(r5, r6, r7, r8)
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r4.mCreatedMenus
            r8 = 0
            if (r6 == 0) goto L50
            int r6 = r6.size()
            if (r6 <= 0) goto L50
            r7.print(r5)
            java.lang.String r1 = "Fragments Created Menus:"
            r7.println(r1)
            r1 = r8
        L2c:
            if (r1 >= r6) goto L50
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r4.mCreatedMenus
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r7.print(r5)
            java.lang.String r3 = "  #"
            r7.print(r3)
            r7.print(r1)
            java.lang.String r3 = ": "
            r7.print(r3)
            java.lang.String r2 = r2.toString()
            r7.println(r2)
            int r1 = r1 + 1
            goto L2c
        L50:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6 = r4.mBackStack
            if (r6 == 0) goto L8a
            int r6 = r6.size()
            if (r6 <= 0) goto L8a
            r7.print(r5)
            java.lang.String r1 = "Back Stack:"
            r7.println(r1)
            r1 = r8
        L63:
            if (r1 >= r6) goto L8a
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r2 = r4.mBackStack
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            r7.print(r5)
            java.lang.String r3 = "  #"
            r7.print(r3)
            r7.print(r1)
            java.lang.String r3 = ": "
            r7.print(r3)
            java.lang.String r3 = r2.toString()
            r7.println(r3)
            r2.dump(r0, r7)
            int r1 = r1 + 1
            goto L63
        L8a:
            r7.print(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Back Stack Index: "
            r6.<init>(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r4.mBackStackIndex
            int r0 = r0.get()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r7.println(r6)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r6 = r4.mPendingActions
            monitor-enter(r6)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r4.mPendingActions     // Catch: java.lang.Throwable -> L149
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L149
            if (r0 <= 0) goto Ld8
            r7.print(r5)     // Catch: java.lang.Throwable -> L149
            java.lang.String r1 = "Pending Actions:"
            r7.println(r1)     // Catch: java.lang.Throwable -> L149
        Lb8:
            if (r8 >= r0) goto Ld8
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r4.mPendingActions     // Catch: java.lang.Throwable -> L149
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L149
            androidx.fragment.app.FragmentManager$OpGenerator r1 = (androidx.fragment.app.FragmentManager.OpGenerator) r1     // Catch: java.lang.Throwable -> L149
            r7.print(r5)     // Catch: java.lang.Throwable -> L149
            java.lang.String r2 = "  #"
            r7.print(r2)     // Catch: java.lang.Throwable -> L149
            r7.print(r8)     // Catch: java.lang.Throwable -> L149
            java.lang.String r2 = ": "
            r7.print(r2)     // Catch: java.lang.Throwable -> L149
            r7.println(r1)     // Catch: java.lang.Throwable -> L149
            int r8 = r8 + 1
            goto Lb8
        Ld8:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L149
            r7.print(r5)
            java.lang.String r6 = "FragmentManager misc state:"
            r7.println(r6)
            r7.print(r5)
            java.lang.String r6 = "  mHost="
            r7.print(r6)
            androidx.fragment.app.FragmentHostCallback<?> r6 = r4.mHost
            r7.println(r6)
            r7.print(r5)
            java.lang.String r6 = "  mContainer="
            r7.print(r6)
            androidx.fragment.app.FragmentContainer r6 = r4.mContainer
            r7.println(r6)
            androidx.fragment.app.Fragment r6 = r4.mParent
            if (r6 == 0) goto L10c
            r7.print(r5)
            java.lang.String r6 = "  mParent="
            r7.print(r6)
            androidx.fragment.app.Fragment r6 = r4.mParent
            r7.println(r6)
        L10c:
            r7.print(r5)
            java.lang.String r6 = "  mCurState="
            r7.print(r6)
            int r6 = r4.mCurState
            r7.print(r6)
            java.lang.String r6 = " mStateSaved="
            r7.print(r6)
            boolean r6 = r4.mStateSaved
            r7.print(r6)
            java.lang.String r6 = " mStopped="
            r7.print(r6)
            boolean r6 = r4.mStopped
            r7.print(r6)
            java.lang.String r6 = " mDestroyed="
            r7.print(r6)
            boolean r6 = r4.mDestroyed
            r7.println(r6)
            boolean r6 = r4.mNeedMenuInvalidate
            if (r6 == 0) goto L148
            r7.print(r5)
            java.lang.String r5 = "  mNeedMenuInvalidate="
            r7.print(r5)
            boolean r5 = r4.mNeedMenuInvalidate
            r7.println(r5)
        L148:
            return
        L149:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L149
            throw r5
    }

    void enqueueAction(androidx.fragment.app.FragmentManager.OpGenerator r3, boolean r4) {
            r2 = this;
            if (r4 != 0) goto L1d
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L1a
            boolean r3 = r2.mDestroyed
            if (r3 == 0) goto L12
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "FragmentManager has been destroyed"
            r3.<init>(r4)
            throw r3
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "FragmentManager has not been attached to a host."
            r3.<init>(r4)
            throw r3
        L1a:
            r2.checkStateLoss()
        L1d:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r2.mPendingActions
            monitor-enter(r0)
            androidx.fragment.app.FragmentHostCallback<?> r1 = r2.mHost     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L30
            if (r4 == 0) goto L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L28:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Activity has been destroyed"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            throw r3     // Catch: java.lang.Throwable -> L3a
        L30:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r4 = r2.mPendingActions     // Catch: java.lang.Throwable -> L3a
            r4.add(r3)     // Catch: java.lang.Throwable -> L3a
            r2.scheduleCommit()     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r3
    }

    boolean execPendingActions(boolean r3) {
            r2 = this;
            r2.ensureExecReady(r3)
            r3 = 0
        L4:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r2.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r1 = r2.mTmpIsPop
            boolean r0 = r2.generateOpsForPendingActions(r0, r1)
            if (r0 == 0) goto L21
            r3 = 1
            r2.mExecutingActions = r3
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r2.mTmpRecords     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayList<java.lang.Boolean> r1 = r2.mTmpIsPop     // Catch: java.lang.Throwable -> L1c
            r2.removeRedundantOperationsAndExecute(r0, r1)     // Catch: java.lang.Throwable -> L1c
            r2.cleanupExec()
            goto L4
        L1c:
            r3 = move-exception
            r2.cleanupExec()
            throw r3
        L21:
            r2.updateOnBackPressedCallbackEnabled()
            r2.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            r0.burpActive()
            return r3
    }

    void execSingleAction(androidx.fragment.app.FragmentManager.OpGenerator r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 == 0) goto La
            boolean r0 = r1.mDestroyed
            if (r0 == 0) goto Lb
        La:
            return
        Lb:
            r1.ensureExecReady(r3)
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r1.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r0 = r1.mTmpIsPop
            boolean r2 = r2.generateOps(r3, r0)
            if (r2 == 0) goto L2b
            r2 = 1
            r1.mExecutingActions = r2
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r2 = r1.mTmpRecords     // Catch: java.lang.Throwable -> L26
            java.util.ArrayList<java.lang.Boolean> r3 = r1.mTmpIsPop     // Catch: java.lang.Throwable -> L26
            r1.removeRedundantOperationsAndExecute(r2, r3)     // Catch: java.lang.Throwable -> L26
            r1.cleanupExec()
            goto L2b
        L26:
            r2 = move-exception
            r1.cleanupExec()
            throw r2
        L2b:
            r1.updateOnBackPressedCallbackEnabled()
            r1.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r2 = r1.mFragmentStore
            r2.burpActive()
            return
    }

    public boolean executePendingTransactions() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.execPendingActions(r0)
            r1.forcePostponedTransactions()
            return r0
    }

    androidx.fragment.app.Fragment findActiveFragment(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r2 = r0.findActiveFragment(r2)
            return r2
    }

    public androidx.fragment.app.Fragment findFragmentById(int r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r2 = r0.findFragmentById(r2)
            return r2
    }

    public androidx.fragment.app.Fragment findFragmentByTag(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r2 = r0.findFragmentByTag(r2)
            return r2
    }

    androidx.fragment.app.Fragment findFragmentByWho(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r2 = r0.findFragmentByWho(r2)
            return r2
    }

    int getActiveFragmentCount() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            int r0 = r0.getActiveFragmentCount()
            return r0
    }

    java.util.List<androidx.fragment.app.Fragment> getActiveFragments() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            java.util.List r0 = r0.getActiveFragments()
            return r0
    }

    public androidx.fragment.app.FragmentManager.BackStackEntry getBackStackEntryAt(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.FragmentManager$BackStackEntry r2 = (androidx.fragment.app.FragmentManager.BackStackEntry) r2
            return r2
    }

    public int getBackStackEntryCount() {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            if (r0 == 0) goto L9
            int r0 = r0.size()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    androidx.fragment.app.FragmentContainer getContainer() {
            r1 = this;
            androidx.fragment.app.FragmentContainer r0 = r1.mContainer
            return r0
    }

    public androidx.fragment.app.Fragment getFragment(android.os.Bundle r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r5 = r5.getString(r6)
            if (r5 != 0) goto L8
            r5 = 0
            return r5
        L8:
            androidx.fragment.app.Fragment r0 = r4.findActiveFragment(r5)
            if (r0 != 0) goto L2f
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Fragment no longer exists for key "
            r2.<init>(r3)
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r2 = ": unique id "
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            r4.throwException(r1)
        L2f:
            return r0
    }

    public androidx.fragment.app.FragmentFactory getFragmentFactory() {
            r1 = this;
            androidx.fragment.app.FragmentFactory r0 = r1.mFragmentFactory
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.fragment.app.Fragment r0 = r1.mParent
            if (r0 == 0) goto L10
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.FragmentFactory r0 = r0.getFragmentFactory()
            return r0
        L10:
            androidx.fragment.app.FragmentFactory r0 = r1.mHostFragmentFactory
            return r0
    }

    androidx.fragment.app.FragmentStore getFragmentStore() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            return r0
    }

    public java.util.List<androidx.fragment.app.Fragment> getFragments() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            java.util.List r0 = r0.getFragments()
            return r0
    }

    androidx.fragment.app.FragmentHostCallback<?> getHost() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            return r0
    }

    android.view.LayoutInflater.Factory2 getLayoutInflaterFactory() {
            r1 = this;
            androidx.fragment.app.FragmentLayoutInflaterFactory r0 = r1.mLayoutInflaterFactory
            return r0
    }

    androidx.fragment.app.FragmentLifecycleCallbacksDispatcher getLifecycleCallbacksDispatcher() {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            return r0
    }

    androidx.fragment.app.Fragment getParent() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mParent
            return r0
    }

    public androidx.fragment.app.Fragment getPrimaryNavigationFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mPrimaryNav
            return r0
    }

    androidx.fragment.app.SpecialEffectsControllerFactory getSpecialEffectsControllerFactory() {
            r1 = this;
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r1.mSpecialEffectsControllerFactory
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.fragment.app.Fragment r0 = r1.mParent
            if (r0 == 0) goto L10
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r0.getSpecialEffectsControllerFactory()
            return r0
        L10:
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r1.mDefaultSpecialEffectsControllerFactory
            return r0
    }

    androidx.lifecycle.ViewModelStore getViewModelStore(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            androidx.lifecycle.ViewModelStore r2 = r0.getViewModelStore(r2)
            return r2
    }

    void handleOnBackPressed() {
            r1 = this;
            r0 = 1
            r1.execPendingActions(r0)
            androidx.activity.OnBackPressedCallback r0 = r1.mOnBackPressedCallback
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L10
            r1.popBackStackImmediate()
            goto L15
        L10:
            androidx.activity.OnBackPressedDispatcher r0 = r1.mOnBackPressedDispatcher
            r0.onBackPressed()
        L15:
            return
    }

    void hideFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "hide: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1b:
            boolean r0 = r3.mHidden
            if (r0 != 0) goto L2a
            r0 = 1
            r3.mHidden = r0
            boolean r1 = r3.mHiddenChanged
            r0 = r0 ^ r1
            r3.mHiddenChanged = r0
            r2.setVisibleRemovingFragment(r3)
        L2a:
            return
    }

    void invalidateMenuForFragment(androidx.fragment.app.Fragment r2) {
            r1 = this;
            boolean r0 = r2.mAdded
            if (r0 == 0) goto Ld
            boolean r2 = r1.isMenuAvailable(r2)
            if (r2 == 0) goto Ld
            r2 = 1
            r1.mNeedMenuInvalidate = r2
        Ld:
            return
    }

    public boolean isDestroyed() {
            r1 = this;
            boolean r0 = r1.mDestroyed
            return r0
    }

    boolean isParentMenuVisible(androidx.fragment.app.Fragment r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 1
            return r1
        L4:
            boolean r1 = r1.isMenuVisible()
            return r1
    }

    boolean isPrimaryNavigation(androidx.fragment.app.Fragment r4) {
            r3 = this;
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            androidx.fragment.app.FragmentManager r1 = r4.mFragmentManager
            androidx.fragment.app.Fragment r2 = r1.getPrimaryNavigationFragment()
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L19
            androidx.fragment.app.Fragment r4 = r1.mParent
            boolean r4 = r3.isPrimaryNavigation(r4)
            if (r4 == 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    boolean isStateAtLeast(int r2) {
            r1 = this;
            int r0 = r1.mCurState
            if (r0 < r2) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            return r2
    }

    public boolean isStateSaved() {
            r1 = this;
            boolean r0 = r1.mStateSaved
            if (r0 != 0) goto Lb
            boolean r0 = r1.mStopped
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    void launchRequestPermissions(androidx.fragment.app.Fragment r2, java.lang.String[] r3, int r4) {
            r1 = this;
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r0 = r1.mRequestPermissions
            if (r0 == 0) goto L16
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r2 = r2.mWho
            r0.<init>(r2, r4)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r2 = r1.mLaunchedFragments
            r2.addLast(r0)
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r2 = r1.mRequestPermissions
            r2.launch(r3)
            goto L1b
        L16:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            r0.onRequestPermissionsFromFragment(r2, r3, r4)
        L1b:
            return
    }

    void launchStartActivityForResult(androidx.fragment.app.Fragment r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
            r1 = this;
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r1.mStartActivityForResult
            if (r0 == 0) goto L1f
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r2 = r2.mWho
            r0.<init>(r2, r4)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r2 = r1.mLaunchedFragments
            r2.addLast(r0)
            if (r3 == 0) goto L19
            if (r5 == 0) goto L19
            java.lang.String r2 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r3.putExtra(r2, r5)
        L19:
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r2 = r1.mStartActivityForResult
            r2.launch(r3)
            goto L24
        L1f:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            r0.onStartActivityFromFragment(r2, r3, r4, r5)
        L24:
            return
    }

    void launchStartIntentSenderForResult(androidx.fragment.app.Fragment r12, android.content.IntentSender r13, int r14, android.content.Intent r15, int r16, int r17, int r18, android.os.Bundle r19) throws android.content.IntentSender.SendIntentException {
            r11 = this;
            r0 = r11
            r2 = r12
            r9 = r19
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r1 = r0.mStartIntentSenderForResult
            if (r1 == 0) goto L96
            java.lang.String r1 = "FragmentManager"
            r3 = 2
            if (r9 == 0) goto L4e
            if (r15 != 0) goto L1b
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r5 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
            r6 = 1
            r4.putExtra(r5, r6)
            goto L1c
        L1b:
            r4 = r15
        L1c:
            boolean r5 = isLoggingEnabled(r3)
            if (r5 == 0) goto L48
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "ActivityOptions "
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r9)
            java.lang.String r6 = " were added to fillInIntent "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r6 = " for fragment "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r12)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r1, r5)
        L48:
            java.lang.String r5 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r4.putExtra(r5, r9)
            goto L4f
        L4e:
            r4 = r15
        L4f:
            androidx.activity.result.IntentSenderRequest$Builder r5 = new androidx.activity.result.IntentSenderRequest$Builder
            r6 = r13
            r5.<init>(r13)
            androidx.activity.result.IntentSenderRequest$Builder r4 = r5.setFillInIntent(r4)
            r7 = r16
            r8 = r17
            androidx.activity.result.IntentSenderRequest$Builder r4 = r4.setFlags(r8, r7)
            androidx.activity.result.IntentSenderRequest r4 = r4.build()
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r5 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r6 = r2.mWho
            r10 = r14
            r5.<init>(r6, r14)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r6 = r0.mLaunchedFragments
            r6.addLast(r5)
            boolean r3 = isLoggingEnabled(r3)
            if (r3 == 0) goto L90
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Fragment "
            r3.<init>(r5)
            java.lang.StringBuilder r2 = r3.append(r12)
            java.lang.String r3 = "is launching an IntentSender for result "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r1, r2)
        L90:
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r1 = r0.mStartIntentSenderForResult
            r1.launch(r4)
            goto Lad
        L96:
            r6 = r13
            r10 = r14
            r7 = r16
            r8 = r17
            androidx.fragment.app.FragmentHostCallback<?> r1 = r0.mHost
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r1.onStartIntentSenderFromFragment(r2, r3, r4, r5, r6, r7, r8, r9)
        Lad:
            return
    }

    void moveFragmentToExpectedState(androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            java.lang.String r1 = r4.mWho
            boolean r0 = r0.containsActiveFragment(r1)
            if (r0 != 0) goto L3c
            r0 = 3
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Ignoring moving "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = " to state "
            java.lang.StringBuilder r4 = r4.append(r0)
            int r0 = r3.mCurState
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = "since it is not added to "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r4)
        L3b:
            return
        L3c:
            r3.moveToState(r4)
            android.view.View r0 = r4.mView
            if (r0 == 0) goto L87
            boolean r0 = r4.mIsNewlyAdded
            if (r0 == 0) goto L87
            android.view.ViewGroup r0 = r4.mContainer
            if (r0 == 0) goto L87
            float r0 = r4.mPostponedAlpha
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L59
            android.view.View r0 = r4.mView
            float r2 = r4.mPostponedAlpha
            r0.setAlpha(r2)
        L59:
            r4.mPostponedAlpha = r1
            r0 = 0
            r4.mIsNewlyAdded = r0
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            android.content.Context r0 = r0.getContext()
            r1 = 1
            boolean r2 = r4.getPopDirection()
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = androidx.fragment.app.FragmentAnim.loadAnimation(r0, r4, r1, r2)
            if (r0 == 0) goto L87
            android.view.animation.Animation r1 = r0.animation
            if (r1 == 0) goto L7b
            android.view.View r1 = r4.mView
            android.view.animation.Animation r0 = r0.animation
            r1.startAnimation(r0)
            goto L87
        L7b:
            android.animation.Animator r1 = r0.animator
            android.view.View r2 = r4.mView
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.animator
            r0.start()
        L87:
            boolean r0 = r4.mHiddenChanged
            if (r0 == 0) goto L8e
            r3.completeShowHideFragment(r4)
        L8e:
            return
    }

    void moveToState(int r4, boolean r5) {
            r3 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            if (r0 != 0) goto L10
            r0 = -1
            if (r4 != r0) goto L8
            goto L10
        L8:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "No activity"
            r4.<init>(r5)
            throw r4
        L10:
            if (r5 != 0) goto L17
            int r5 = r3.mCurState
            if (r4 != r5) goto L17
            return
        L17:
            r3.mCurState = r4
            boolean r4 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            r5 = 0
            if (r4 == 0) goto L24
            androidx.fragment.app.FragmentStore r4 = r3.mFragmentStore
            r4.moveToExpectedState()
            goto L74
        L24:
            androidx.fragment.app.FragmentStore r4 = r3.mFragmentStore
            java.util.List r4 = r4.getFragments()
            java.util.Iterator r4 = r4.iterator()
        L2e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r4.next()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r3.moveFragmentToExpectedState(r0)
            goto L2e
        L3e:
            androidx.fragment.app.FragmentStore r4 = r3.mFragmentStore
            java.util.List r4 = r4.getActiveFragmentStateManagers()
            java.util.Iterator r4 = r4.iterator()
        L48:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r4.next()
            androidx.fragment.app.FragmentStateManager r0 = (androidx.fragment.app.FragmentStateManager) r0
            androidx.fragment.app.Fragment r1 = r0.getFragment()
            boolean r2 = r1.mIsNewlyAdded
            if (r2 != 0) goto L5f
            r3.moveFragmentToExpectedState(r1)
        L5f:
            boolean r2 = r1.mRemoving
            if (r2 == 0) goto L6b
            boolean r1 = r1.isInBackStack()
            if (r1 != 0) goto L6b
            r1 = 1
            goto L6c
        L6b:
            r1 = r5
        L6c:
            if (r1 == 0) goto L48
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            r1.makeInactive(r0)
            goto L48
        L74:
            r3.startPendingDeferredFragments()
            boolean r4 = r3.mNeedMenuInvalidate
            if (r4 == 0) goto L89
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.mHost
            if (r4 == 0) goto L89
            int r0 = r3.mCurState
            r1 = 7
            if (r0 != r1) goto L89
            r4.onSupportInvalidateOptionsMenu()
            r3.mNeedMenuInvalidate = r5
        L89:
            return
    }

    void moveToState(androidx.fragment.app.Fragment r2) {
            r1 = this;
            int r0 = r1.mCurState
            r1.moveToState(r2, r0)
            return
    }

    void moveToState(androidx.fragment.app.Fragment r11, int r12) {
            r10 = this;
            androidx.fragment.app.FragmentStore r0 = r10.mFragmentStore
            java.lang.String r1 = r11.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            r1 = 1
            if (r0 != 0) goto L17
            androidx.fragment.app.FragmentStateManager r0 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r10.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r3 = r10.mFragmentStore
            r0.<init>(r2, r3, r11)
            r0.setFragmentManagerState(r1)
        L17:
            boolean r2 = r11.mFromLayout
            r3 = 2
            if (r2 == 0) goto L28
            boolean r2 = r11.mInLayout
            if (r2 == 0) goto L28
            int r2 = r11.mState
            if (r2 != r3) goto L28
            int r12 = java.lang.Math.max(r12, r3)
        L28:
            int r2 = r0.computeExpectedState()
            int r12 = java.lang.Math.min(r12, r2)
            int r2 = r11.mState
            r4 = 3
            java.lang.String r5 = "FragmentManager"
            r6 = -1
            r7 = 5
            r8 = 4
            if (r2 > r12) goto L7e
            int r2 = r11.mState
            if (r2 >= r12) goto L49
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r2 = r10.mExitAnimationCancellationSignals
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L49
            r10.cancelExitAnimation(r11)
        L49:
            int r2 = r11.mState
            if (r2 == r6) goto L59
            if (r2 == 0) goto L5e
            if (r2 == r1) goto L63
            if (r2 == r3) goto L6d
            if (r2 == r8) goto L72
            if (r2 == r7) goto L77
            goto L16f
        L59:
            if (r12 <= r6) goto L5e
            r0.attach()
        L5e:
            if (r12 <= 0) goto L63
            r0.create()
        L63:
            if (r12 <= r6) goto L68
            r0.ensureInflatedView()
        L68:
            if (r12 <= r1) goto L6d
            r0.createView()
        L6d:
            if (r12 <= r3) goto L72
            r0.activityCreated()
        L72:
            if (r12 <= r8) goto L77
            r0.start()
        L77:
            if (r12 <= r7) goto L16f
            r0.resume()
            goto L16f
        L7e:
            int r2 = r11.mState
            if (r2 <= r12) goto L16f
            int r2 = r11.mState
            if (r2 == 0) goto L168
            if (r2 == r1) goto L15a
            if (r2 == r3) goto Lca
            if (r2 == r8) goto L9d
            if (r2 == r7) goto L98
            r9 = 7
            if (r2 == r9) goto L93
            goto L16f
        L93:
            if (r12 >= r9) goto L98
            r0.pause()
        L98:
            if (r12 >= r7) goto L9d
            r0.stop()
        L9d:
            if (r12 >= r8) goto Lca
            boolean r2 = isLoggingEnabled(r4)
            if (r2 == 0) goto Lb7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "movefrom ACTIVITY_CREATED: "
            r2.<init>(r7)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        Lb7:
            android.view.View r2 = r11.mView
            if (r2 == 0) goto Lca
            androidx.fragment.app.FragmentHostCallback<?> r2 = r10.mHost
            boolean r2 = r2.onShouldSaveFragmentState(r11)
            if (r2 == 0) goto Lca
            android.util.SparseArray<android.os.Parcelable> r2 = r11.mSavedViewState
            if (r2 != 0) goto Lca
            r0.saveViewState()
        Lca:
            if (r12 >= r3) goto L15a
            android.view.View r2 = r11.mView
            if (r2 == 0) goto L14f
            android.view.ViewGroup r2 = r11.mContainer
            if (r2 == 0) goto L14f
            android.view.ViewGroup r2 = r11.mContainer
            android.view.View r7 = r11.mView
            r2.endViewTransition(r7)
            android.view.View r2 = r11.mView
            r2.clearAnimation()
            boolean r2 = r11.isRemovingParent()
            if (r2 != 0) goto L14f
            int r2 = r10.mCurState
            r7 = 0
            if (r2 <= r6) goto L10d
            boolean r2 = r10.mDestroyed
            if (r2 != 0) goto L10d
            android.view.View r2 = r11.mView
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L10d
            float r2 = r11.mPostponedAlpha
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L10d
            androidx.fragment.app.FragmentHostCallback<?> r2 = r10.mHost
            android.content.Context r2 = r2.getContext()
            r6 = 0
            boolean r8 = r11.getPopDirection()
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r2 = androidx.fragment.app.FragmentAnim.loadAnimation(r2, r11, r6, r8)
            goto L10e
        L10d:
            r2 = 0
        L10e:
            r11.mPostponedAlpha = r7
            android.view.ViewGroup r6 = r11.mContainer
            android.view.View r7 = r11.mView
            if (r2 == 0) goto L11b
            androidx.fragment.app.FragmentTransition$Callback r8 = r10.mFragmentTransitionCallback
            androidx.fragment.app.FragmentAnim.animateRemoveFragment(r11, r2, r8)
        L11b:
            r6.removeView(r7)
            boolean r2 = isLoggingEnabled(r3)
            if (r2 == 0) goto L14a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Removing view "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r3 = " for fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r3 = " from container "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r5, r2)
        L14a:
            android.view.ViewGroup r2 = r11.mContainer
            if (r6 == r2) goto L14f
            return
        L14f:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r2 = r10.mExitAnimationCancellationSignals
            java.lang.Object r2 = r2.get(r11)
            if (r2 != 0) goto L15a
            r0.destroyFragmentView()
        L15a:
            if (r12 >= r1) goto L168
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r2 = r10.mExitAnimationCancellationSignals
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L165
            goto L169
        L165:
            r0.destroy()
        L168:
            r1 = r12
        L169:
            if (r1 >= 0) goto L16e
            r0.detach()
        L16e:
            r12 = r1
        L16f:
            int r0 = r11.mState
            if (r0 == r12) goto L1a3
            boolean r0 = isLoggingEnabled(r4)
            if (r0 == 0) goto L1a1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.String r1 = " not updated inline; expected state "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r1 = " found "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r11.mState
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r5, r0)
        L1a1:
            r11.mState = r12
        L1a3:
            return
    }

    void noteStateNotSaved() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L19
            r1.noteStateNotSaved()
            goto L19
        L2b:
            return
    }

    void onContainerAvailable(androidx.fragment.app.FragmentContainerView r6) {
            r5 = this;
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            int r3 = r2.mContainerId
            int r4 = r6.getId()
            if (r3 != r4) goto La
            android.view.View r3 = r2.mView
            if (r3 == 0) goto La
            android.view.View r3 = r2.mView
            android.view.ViewParent r3 = r3.getParent()
            if (r3 != 0) goto La
            r2.mContainer = r6
            r1.addViewToContainer()
            goto La
        L34:
            return
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction openTransaction() {
            r1 = this;
            androidx.fragment.app.FragmentTransaction r0 = r1.beginTransaction()
            return r0
    }

    void performPendingDeferredStart(androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r3.getFragment()
            boolean r1 = r0.mDeferStart
            if (r1 == 0) goto L1e
            boolean r1 = r2.mExecutingActions
            if (r1 == 0) goto L10
            r3 = 1
            r2.mHavePendingDeferredStart = r3
            return
        L10:
            r1 = 0
            r0.mDeferStart = r1
            boolean r1 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r1 == 0) goto L1b
            r3.moveToExpectedState()
            goto L1e
        L1b:
            r2.moveToState(r0)
        L1e:
            return
    }

    public void popBackStack() {
            r4 = this;
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = 0
            r2 = -1
            r3 = 0
            r0.<init>(r4, r1, r2, r3)
            r4.enqueueAction(r0, r3)
            return
    }

    public void popBackStack(int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto Ld
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = 0
            r0.<init>(r2, r1, r3, r4)
            r3 = 0
            r2.enqueueAction(r0, r3)
            return
        Ld:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bad id: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public void popBackStack(java.lang.String r3, int r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = -1
            r0.<init>(r2, r3, r1, r4)
            r3 = 0
            r2.enqueueAction(r0, r3)
            return
    }

    public boolean popBackStackImmediate() {
            r3 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            boolean r0 = r3.popBackStackImmediate(r2, r0, r1)
            return r0
    }

    public boolean popBackStackImmediate(int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto L8
            r0 = 0
            boolean r3 = r2.popBackStackImmediate(r0, r3, r4)
            return r3
        L8:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bad id: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public boolean popBackStackImmediate(java.lang.String r2, int r3) {
            r1 = this;
            r0 = -1
            boolean r2 = r1.popBackStackImmediate(r2, r0, r3)
            return r2
    }

    boolean popBackStackState(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6, java.util.ArrayList<java.lang.Boolean> r7, java.lang.String r8, int r9, int r10) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r5.mBackStack
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = 1
            if (r8 != 0) goto L29
            if (r9 >= 0) goto L29
            r3 = r10 & 1
            if (r3 != 0) goto L29
            int r8 = r0.size()
            int r8 = r8 - r2
            if (r8 >= 0) goto L17
            return r1
        L17:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9 = r5.mBackStack
            java.lang.Object r8 = r9.remove(r8)
            r6.add(r8)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            r7.add(r6)
            goto La2
        L29:
            if (r8 != 0) goto L30
            if (r9 < 0) goto L2e
            goto L30
        L2e:
            r8 = -1
            goto L7c
        L30:
            int r0 = r0.size()
            int r0 = r0 - r2
        L35:
            if (r0 < 0) goto L56
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r5.mBackStack
            java.lang.Object r3 = r3.get(r0)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            if (r8 == 0) goto L4c
            java.lang.String r4 = r3.getName()
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L4c
            goto L56
        L4c:
            if (r9 < 0) goto L53
            int r3 = r3.mIndex
            if (r9 != r3) goto L53
            goto L56
        L53:
            int r0 = r0 + (-1)
            goto L35
        L56:
            if (r0 >= 0) goto L59
            return r1
        L59:
            r10 = r10 & r2
            if (r10 == 0) goto L7b
        L5c:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L7b
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10 = r5.mBackStack
            java.lang.Object r10 = r10.get(r0)
            androidx.fragment.app.BackStackRecord r10 = (androidx.fragment.app.BackStackRecord) r10
            if (r8 == 0) goto L74
            java.lang.String r3 = r10.getName()
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L5c
        L74:
            if (r9 < 0) goto L7b
            int r10 = r10.mIndex
            if (r9 != r10) goto L7b
            goto L5c
        L7b:
            r8 = r0
        L7c:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9 = r5.mBackStack
            int r9 = r9.size()
            int r9 = r9 - r2
            if (r8 != r9) goto L86
            return r1
        L86:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9 = r5.mBackStack
            int r9 = r9.size()
            int r9 = r9 - r2
        L8d:
            if (r9 <= r8) goto La2
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10 = r5.mBackStack
            java.lang.Object r10 = r10.remove(r9)
            r6.add(r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            r7.add(r10)
            int r9 = r9 + (-1)
            goto L8d
        La2:
            return r2
    }

    public void putFragment(android.os.Bundle r4, java.lang.String r5, androidx.fragment.app.Fragment r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r6.mFragmentManager
            if (r0 == r3) goto L21
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " is not currently in the FragmentManager"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r3.throwException(r0)
        L21:
            java.lang.String r6 = r6.mWho
            r4.putString(r5, r6)
            return
    }

    public void registerFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r2, boolean r3) {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            r0.registerFragmentLifecycleCallbacks(r2, r3)
            return
    }

    void removeCancellationSignal(androidx.fragment.app.Fragment r2, androidx.core.os.CancellationSignal r3) {
            r1 = this;
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r1.mExitAnimationCancellationSignals
            java.lang.Object r0 = r0.get(r2)
            java.util.HashSet r0 = (java.util.HashSet) r0
            if (r0 == 0) goto L26
            boolean r3 = r0.remove(r3)
            if (r3 == 0) goto L26
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L26
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r3 = r1.mExitAnimationCancellationSignals
            r3.remove(r2)
            int r3 = r2.mState
            r0 = 5
            if (r3 >= r0) goto L26
            r1.destroyFragmentView(r2)
            r1.moveToState(r2)
        L26:
            return
    }

    void removeFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "remove: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = " nesting="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r4.mBackStackNesting
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L27:
            boolean r0 = r4.isInBackStack()
            r1 = 1
            r0 = r0 ^ r1
            boolean r2 = r4.mDetached
            if (r2 == 0) goto L33
            if (r0 == 0) goto L45
        L33:
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            r0.removeFragment(r4)
            boolean r0 = r3.isMenuAvailable(r4)
            if (r0 == 0) goto L40
            r3.mNeedMenuInvalidate = r1
        L40:
            r4.mRemoving = r1
            r3.setVisibleRemovingFragment(r4)
        L45:
            return
    }

    public void removeFragmentOnAttachListener(androidx.fragment.app.FragmentOnAttachListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r1.mOnAttachListeners
            r0.remove(r2)
            return
    }

    public void removeOnBackStackChangedListener(androidx.fragment.app.FragmentManager.OnBackStackChangedListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    void removeRetainedFragment(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            r0.removeRetainedFragment(r2)
            return
    }

    void restoreAllState(android.os.Parcelable r3, androidx.fragment.app.FragmentManagerNonConfig r4) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"
            r0.<init>(r1)
            r2.throwException(r0)
        L10:
            androidx.fragment.app.FragmentManagerViewModel r0 = r2.mNonConfig
            r0.restoreFromSnapshot(r4)
            r2.restoreSaveState(r3)
            return
    }

    void restoreSaveState(android.os.Parcelable r12) {
            r11 = this;
            if (r12 != 0) goto L3
            return
        L3:
            androidx.fragment.app.FragmentManagerState r12 = (androidx.fragment.app.FragmentManagerState) r12
            java.util.ArrayList<androidx.fragment.app.FragmentState> r0 = r12.mActive
            if (r0 != 0) goto La
            return
        La:
            androidx.fragment.app.FragmentStore r0 = r11.mFragmentStore
            r0.resetActiveFragments()
            java.util.ArrayList<androidx.fragment.app.FragmentState> r0 = r12.mActive
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "): "
            r3 = 2
            java.lang.String r4 = "FragmentManager"
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r0.next()
            r10 = r1
            androidx.fragment.app.FragmentState r10 = (androidx.fragment.app.FragmentState) r10
            if (r10 == 0) goto L15
            androidx.fragment.app.FragmentManagerViewModel r1 = r11.mNonConfig
            java.lang.String r5 = r10.mWho
            androidx.fragment.app.Fragment r1 = r1.findRetainedFragmentByWho(r5)
            if (r1 == 0) goto L55
            boolean r5 = isLoggingEnabled(r3)
            if (r5 == 0) goto L4b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "restoreSaveState: re-attaching retained "
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r4, r5)
        L4b:
            androidx.fragment.app.FragmentStateManager r5 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r6 = r11.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r7 = r11.mFragmentStore
            r5.<init>(r6, r7, r1, r10)
            goto L6d
        L55:
            androidx.fragment.app.FragmentStateManager r1 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r6 = r11.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r7 = r11.mFragmentStore
            androidx.fragment.app.FragmentHostCallback<?> r5 = r11.mHost
            android.content.Context r5 = r5.getContext()
            java.lang.ClassLoader r8 = r5.getClassLoader()
            androidx.fragment.app.FragmentFactory r9 = r11.getFragmentFactory()
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
        L6d:
            androidx.fragment.app.Fragment r1 = r5.getFragment()
            r1.mFragmentManager = r11
            boolean r3 = isLoggingEnabled(r3)
            if (r3 == 0) goto L95
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "restoreSaveState: active ("
            r3.<init>(r6)
            java.lang.String r6 = r1.mWho
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r4, r1)
        L95:
            androidx.fragment.app.FragmentHostCallback<?> r1 = r11.mHost
            android.content.Context r1 = r1.getContext()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r5.restoreState(r1)
            androidx.fragment.app.FragmentStore r1 = r11.mFragmentStore
            r1.makeActive(r5)
            int r1 = r11.mCurState
            r5.setFragmentManagerState(r1)
            goto L15
        Lae:
            androidx.fragment.app.FragmentManagerViewModel r0 = r11.mNonConfig
            java.util.Collection r0 = r0.getRetainedFragments()
            java.util.Iterator r0 = r0.iterator()
        Lb8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L10f
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.FragmentStore r5 = r11.mFragmentStore
            java.lang.String r6 = r1.mWho
            boolean r5 = r5.containsActiveFragment(r6)
            if (r5 != 0) goto Lb8
            boolean r5 = isLoggingEnabled(r3)
            if (r5 == 0) goto Lf2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Discarding retained Fragment "
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r6 = " that was not found in the set of active Fragments "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.util.ArrayList<androidx.fragment.app.FragmentState> r6 = r12.mActive
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r4, r5)
        Lf2:
            androidx.fragment.app.FragmentManagerViewModel r5 = r11.mNonConfig
            r5.removeRetainedFragment(r1)
            r1.mFragmentManager = r11
            androidx.fragment.app.FragmentStateManager r5 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r6 = r11.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r7 = r11.mFragmentStore
            r5.<init>(r6, r7, r1)
            r6 = 1
            r5.setFragmentManagerState(r6)
            r5.moveToExpectedState()
            r1.mRemoving = r6
            r5.moveToExpectedState()
            goto Lb8
        L10f:
            androidx.fragment.app.FragmentStore r0 = r11.mFragmentStore
            java.util.ArrayList<java.lang.String> r1 = r12.mAdded
            r0.restoreAddedFragments(r1)
            androidx.fragment.app.BackStackState[] r0 = r12.mBackStack
            r1 = 0
            if (r0 == 0) goto L179
            java.util.ArrayList r0 = new java.util.ArrayList
            androidx.fragment.app.BackStackState[] r5 = r12.mBackStack
            int r5 = r5.length
            r0.<init>(r5)
            r11.mBackStack = r0
            r0 = r1
        L126:
            androidx.fragment.app.BackStackState[] r5 = r12.mBackStack
            int r5 = r5.length
            if (r0 >= r5) goto L17c
            androidx.fragment.app.BackStackState[] r5 = r12.mBackStack
            r5 = r5[r0]
            androidx.fragment.app.BackStackRecord r5 = r5.instantiate(r11)
            boolean r6 = isLoggingEnabled(r3)
            if (r6 == 0) goto L171
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "restoreAllState: back stack #"
            r6.<init>(r7)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r7 = " (index "
            java.lang.StringBuilder r6 = r6.append(r7)
            int r7 = r5.mIndex
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r4, r6)
            androidx.fragment.app.LogWriter r6 = new androidx.fragment.app.LogWriter
            r6.<init>(r4)
            java.io.PrintWriter r7 = new java.io.PrintWriter
            r7.<init>(r6)
            java.lang.String r6 = "  "
            r5.dump(r6, r7, r1)
            r7.close()
        L171:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6 = r11.mBackStack
            r6.add(r5)
            int r0 = r0 + 1
            goto L126
        L179:
            r0 = 0
            r11.mBackStack = r0
        L17c:
            java.util.concurrent.atomic.AtomicInteger r0 = r11.mBackStackIndex
            int r2 = r12.mBackStackIndex
            r0.set(r2)
            java.lang.String r0 = r12.mPrimaryNavActiveWho
            if (r0 == 0) goto L192
            java.lang.String r0 = r12.mPrimaryNavActiveWho
            androidx.fragment.app.Fragment r0 = r11.findActiveFragment(r0)
            r11.mPrimaryNav = r0
            r11.dispatchParentPrimaryNavigationFragmentChanged(r0)
        L192:
            java.util.ArrayList<java.lang.String> r0 = r12.mResultKeys
            if (r0 == 0) goto L1bd
        L196:
            int r2 = r0.size()
            if (r1 >= r2) goto L1bd
            java.util.ArrayList<android.os.Bundle> r2 = r12.mResults
            java.lang.Object r2 = r2.get(r1)
            android.os.Bundle r2 = (android.os.Bundle) r2
            androidx.fragment.app.FragmentHostCallback<?> r3 = r11.mHost
            android.content.Context r3 = r3.getContext()
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r2.setClassLoader(r3)
            java.util.Map<java.lang.String, android.os.Bundle> r3 = r11.mResults
            java.lang.Object r4 = r0.get(r1)
            r3.put(r4, r2)
            int r1 = r1 + 1
            goto L196
        L1bd:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            java.util.ArrayList<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r12 = r12.mLaunchedFragments
            r0.<init>(r12)
            r11.mLaunchedFragments = r0
            return
    }

    @java.lang.Deprecated
    androidx.fragment.app.FragmentManagerNonConfig retainNonConfig() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."
            r0.<init>(r1)
            r2.throwException(r0)
        L10:
            androidx.fragment.app.FragmentManagerViewModel r0 = r2.mNonConfig
            androidx.fragment.app.FragmentManagerNonConfig r0 = r0.getSnapshot()
            return r0
    }

    android.os.Parcelable saveAllState() {
            r9 = this;
            r9.forcePostponedTransactions()
            r9.endAnimatingAwayFragments()
            r0 = 1
            r9.execPendingActions(r0)
            r9.mStateSaved = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r9.mNonConfig
            r1.setIsStateSaved(r0)
            androidx.fragment.app.FragmentStore r0 = r9.mFragmentStore
            java.util.ArrayList r0 = r0.saveActiveFragments()
            boolean r1 = r0.isEmpty()
            java.lang.String r2 = "FragmentManager"
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L2d
            boolean r0 = isLoggingEnabled(r3)
            if (r0 == 0) goto L2c
            java.lang.String r0 = "saveAllState: no fragments!"
            android.util.Log.v(r2, r0)
        L2c:
            return r4
        L2d:
            androidx.fragment.app.FragmentStore r1 = r9.mFragmentStore
            java.util.ArrayList r1 = r1.saveAddedFragments()
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5 = r9.mBackStack
            if (r5 == 0) goto L7c
            int r5 = r5.size()
            if (r5 <= 0) goto L7c
            androidx.fragment.app.BackStackState[] r4 = new androidx.fragment.app.BackStackState[r5]
            r6 = 0
        L40:
            if (r6 >= r5) goto L7c
            androidx.fragment.app.BackStackState r7 = new androidx.fragment.app.BackStackState
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r8 = r9.mBackStack
            java.lang.Object r8 = r8.get(r6)
            androidx.fragment.app.BackStackRecord r8 = (androidx.fragment.app.BackStackRecord) r8
            r7.<init>(r8)
            r4[r6] = r7
            boolean r7 = isLoggingEnabled(r3)
            if (r7 == 0) goto L79
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "saveAllState: adding back stack #"
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r6)
            java.lang.String r8 = ": "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r8 = r9.mBackStack
            java.lang.Object r8 = r8.get(r6)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r2, r7)
        L79:
            int r6 = r6 + 1
            goto L40
        L7c:
            androidx.fragment.app.FragmentManagerState r2 = new androidx.fragment.app.FragmentManagerState
            r2.<init>()
            r2.mActive = r0
            r2.mAdded = r1
            r2.mBackStack = r4
            java.util.concurrent.atomic.AtomicInteger r0 = r9.mBackStackIndex
            int r0 = r0.get()
            r2.mBackStackIndex = r0
            androidx.fragment.app.Fragment r0 = r9.mPrimaryNav
            if (r0 == 0) goto L97
            java.lang.String r0 = r0.mWho
            r2.mPrimaryNavActiveWho = r0
        L97:
            java.util.ArrayList<java.lang.String> r0 = r2.mResultKeys
            java.util.Map<java.lang.String, android.os.Bundle> r1 = r9.mResults
            java.util.Set r1 = r1.keySet()
            r0.addAll(r1)
            java.util.ArrayList<android.os.Bundle> r0 = r2.mResults
            java.util.Map<java.lang.String, android.os.Bundle> r1 = r9.mResults
            java.util.Collection r1 = r1.values()
            r0.addAll(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r1 = r9.mLaunchedFragments
            r0.<init>(r1)
            r2.mLaunchedFragments = r0
            return r2
    }

    public androidx.fragment.app.Fragment.SavedState saveFragmentInstanceState(androidx.fragment.app.Fragment r5) {
            r4 = this;
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.lang.String r1 = r5.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment r1 = r0.getFragment()
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L31
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Fragment "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = " is not currently in the FragmentManager"
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            r4.throwException(r1)
        L31:
            androidx.fragment.app.Fragment$SavedState r5 = r0.saveInstanceState()
            return r5
    }

    void scheduleCommit() {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r5.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r1 = r5.mPostponedTransactions     // Catch: java.lang.Throwable -> L3a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L11
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L11
            r1 = r3
            goto L12
        L11:
            r1 = r2
        L12:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r4 = r5.mPendingActions     // Catch: java.lang.Throwable -> L3a
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L3a
            if (r4 != r3) goto L1b
            r2 = r3
        L1b:
            if (r1 != 0) goto L1f
            if (r2 == 0) goto L38
        L1f:
            androidx.fragment.app.FragmentHostCallback<?> r1 = r5.mHost     // Catch: java.lang.Throwable -> L3a
            android.os.Handler r1 = r1.getHandler()     // Catch: java.lang.Throwable -> L3a
            java.lang.Runnable r2 = r5.mExecCommit     // Catch: java.lang.Throwable -> L3a
            r1.removeCallbacks(r2)     // Catch: java.lang.Throwable -> L3a
            androidx.fragment.app.FragmentHostCallback<?> r1 = r5.mHost     // Catch: java.lang.Throwable -> L3a
            android.os.Handler r1 = r1.getHandler()     // Catch: java.lang.Throwable -> L3a
            java.lang.Runnable r2 = r5.mExecCommit     // Catch: java.lang.Throwable -> L3a
            r1.post(r2)     // Catch: java.lang.Throwable -> L3a
            r5.updateOnBackPressedCallbackEnabled()     // Catch: java.lang.Throwable -> L3a
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r1
    }

    void setExitAnimationOrder(androidx.fragment.app.Fragment r2, boolean r3) {
            r1 = this;
            android.view.ViewGroup r2 = r1.getFragmentContainer(r2)
            if (r2 == 0) goto L11
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentContainerView
            if (r0 == 0) goto L11
            androidx.fragment.app.FragmentContainerView r2 = (androidx.fragment.app.FragmentContainerView) r2
            r3 = r3 ^ 1
            r2.setDrawDisappearingViewsLast(r3)
        L11:
            return
    }

    public void setFragmentFactory(androidx.fragment.app.FragmentFactory r1) {
            r0 = this;
            r0.mFragmentFactory = r1
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResult(java.lang.String r3, android.os.Bundle r4) {
            r2 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r2.mResultListeners
            java.lang.Object r0 = r0.get(r3)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r0 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r0
            if (r0 == 0) goto L16
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r0.isAtLeast(r1)
            if (r1 == 0) goto L16
            r0.onFragmentResult(r3, r4)
            goto L1b
        L16:
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r2.mResults
            r0.put(r3, r4)
        L1b:
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResultListener(java.lang.String r4, androidx.lifecycle.LifecycleOwner r5, androidx.fragment.app.FragmentResultListener r6) {
            r3 = this;
            androidx.lifecycle.Lifecycle r5 = r5.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r5.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto Ld
            return
        Ld:
            androidx.fragment.app.FragmentManager$6 r0 = new androidx.fragment.app.FragmentManager$6
            r0.<init>(r3, r4, r6, r5)
            r5.addObserver(r0)
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r1 = r3.mResultListeners
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r2 = new androidx.fragment.app.FragmentManager$LifecycleAwareResultListener
            r2.<init>(r5, r6, r0)
            java.lang.Object r4 = r1.put(r4, r2)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r4 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r4
            if (r4 == 0) goto L27
            r4.removeObserver()
        L27:
            return
    }

    void setMaxLifecycle(androidx.fragment.app.Fragment r3, androidx.lifecycle.Lifecycle.State r4) {
            r2 = this;
            java.lang.String r0 = r3.mWho
            androidx.fragment.app.Fragment r0 = r2.findActiveFragment(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 != r2) goto L17
        L14:
            r3.mMaxState = r4
            return
        L17:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fragment "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " is not an active fragment of FragmentManager "
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    void setPrimaryNavigationFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            if (r4 == 0) goto L36
            java.lang.String r0 = r4.mWho
            androidx.fragment.app.Fragment r0 = r3.findActiveFragment(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            if (r0 == 0) goto L36
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 != r3) goto L17
            goto L36
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " is not an active fragment of FragmentManager "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L36:
            androidx.fragment.app.Fragment r0 = r3.mPrimaryNav
            r3.mPrimaryNav = r4
            r3.dispatchParentPrimaryNavigationFragmentChanged(r0)
            androidx.fragment.app.Fragment r4 = r3.mPrimaryNav
            r3.dispatchParentPrimaryNavigationFragmentChanged(r4)
            return
    }

    void setSpecialEffectsControllerFactory(androidx.fragment.app.SpecialEffectsControllerFactory r1) {
            r0 = this;
            r0.mSpecialEffectsControllerFactory = r1
            return
    }

    void showFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "show: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1b:
            boolean r0 = r3.mHidden
            if (r0 == 0) goto L28
            r0 = 0
            r3.mHidden = r0
            boolean r0 = r3.mHiddenChanged
            r0 = r0 ^ 1
            r3.mHiddenChanged = r0
        L28:
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.mParent
            java.lang.String r2 = "}"
            java.lang.String r3 = "{"
            if (r1 == 0) goto L43
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            androidx.fragment.app.Fragment r1 = r4.mParent
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r0.append(r2)
            goto L6b
        L43:
            androidx.fragment.app.FragmentHostCallback<?> r1 = r4.mHost
            if (r1 == 0) goto L66
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            androidx.fragment.app.FragmentHostCallback<?> r1 = r4.mHost
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r0.append(r2)
            goto L6b
        L66:
            java.lang.String r1 = "null"
            r0.append(r1)
        L6b:
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void unregisterFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r2) {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            r0.unregisterFragmentLifecycleCallbacks(r2)
            return
    }
}
