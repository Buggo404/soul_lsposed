package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.LinearLayoutCompat implements androidx.appcompat.view.CollapsibleActionView {
    static final boolean DBG = false;
    private static final java.lang.String IME_OPTION_NO_MICROPHONE = "nm";
    static final java.lang.String LOG_TAG = "SearchView";
    static final androidx.appcompat.widget.SearchView.PreQAutoCompleteTextViewReflector PRE_API_29_HIDDEN_METHOD_INVOKER = null;
    private android.os.Bundle mAppSearchData;
    private boolean mClearingFocus;
    final android.widget.ImageView mCloseButton;
    private final android.widget.ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final java.lang.CharSequence mDefaultQueryHint;
    private final android.view.View mDropDownAnchor;
    private boolean mExpandedInActionView;
    final android.widget.ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private java.lang.CharSequence mOldQueryText;
    private final android.view.View.OnClickListener mOnClickListener;
    private androidx.appcompat.widget.SearchView.OnCloseListener mOnCloseListener;
    private final android.widget.TextView.OnEditorActionListener mOnEditorActionListener;
    private final android.widget.AdapterView.OnItemClickListener mOnItemClickListener;
    private final android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private androidx.appcompat.widget.SearchView.OnQueryTextListener mOnQueryChangeListener;
    android.view.View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private android.view.View.OnClickListener mOnSearchClickListener;
    private androidx.appcompat.widget.SearchView.OnSuggestionListener mOnSuggestionListener;
    private final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> mOutsideDrawablesCache;
    private java.lang.CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private java.lang.Runnable mReleaseCursorRunnable;
    final android.widget.ImageView mSearchButton;
    private final android.view.View mSearchEditFrame;
    private final android.graphics.drawable.Drawable mSearchHintIcon;
    private final android.view.View mSearchPlate;
    final androidx.appcompat.widget.SearchView.SearchAutoComplete mSearchSrcTextView;
    private android.graphics.Rect mSearchSrcTextViewBounds;
    private android.graphics.Rect mSearchSrtTextViewBoundsExpanded;
    android.app.SearchableInfo mSearchable;
    private final android.view.View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    androidx.cursoradapter.widget.CursorAdapter mSuggestionsAdapter;
    private int[] mTemp;
    private int[] mTemp2;
    android.view.View.OnKeyListener mTextKeyListener;
    private android.text.TextWatcher mTextWatcher;
    private androidx.appcompat.widget.SearchView.UpdatableTouchDelegate mTouchDelegate;
    private final java.lang.Runnable mUpdateDrawableStateRunnable;
    private java.lang.CharSequence mUserQuery;
    private final android.content.Intent mVoiceAppSearchIntent;
    final android.widget.ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final android.content.Intent mVoiceWebSearchIntent;











    public interface OnCloseListener {
        boolean onClose();
    }

    public interface OnQueryTextListener {
        boolean onQueryTextChange(java.lang.String r1);

        boolean onQueryTextSubmit(java.lang.String r1);
    }

    public interface OnSuggestionListener {
        boolean onSuggestionClick(int r1);

        boolean onSuggestionSelect(int r1);
    }

    private static class PreQAutoCompleteTextViewReflector {
        private java.lang.reflect.Method mDoAfterTextChanged;
        private java.lang.reflect.Method mDoBeforeTextChanged;
        private java.lang.reflect.Method mEnsureImeVisible;

        PreQAutoCompleteTextViewReflector() {
                r6 = this;
                r6.<init>()
                r0 = 0
                r6.mDoBeforeTextChanged = r0
                r6.mDoAfterTextChanged = r0
                r6.mEnsureImeVisible = r0
                preApi29Check()
                r0 = 0
                r1 = 1
                java.lang.Class<android.widget.AutoCompleteTextView> r2 = android.widget.AutoCompleteTextView.class
                java.lang.String r3 = "doBeforeTextChanged"
                java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L1e
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L1e
                r6.mDoBeforeTextChanged = r2     // Catch: java.lang.NoSuchMethodException -> L1e
                r2.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L1e
            L1e:
                java.lang.Class<android.widget.AutoCompleteTextView> r2 = android.widget.AutoCompleteTextView.class
                java.lang.String r3 = "doAfterTextChanged"
                java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L2d
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L2d
                r6.mDoAfterTextChanged = r2     // Catch: java.lang.NoSuchMethodException -> L2d
                r2.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L2d
            L2d:
                java.lang.Class<android.widget.AutoCompleteTextView> r2 = android.widget.AutoCompleteTextView.class
                java.lang.String r3 = "ensureImeVisible"
                java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L40
                java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L40
                r4[r0] = r5     // Catch: java.lang.NoSuchMethodException -> L40
                java.lang.reflect.Method r0 = r2.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L40
                r6.mEnsureImeVisible = r0     // Catch: java.lang.NoSuchMethodException -> L40
                r0.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L40
            L40:
                return
        }

        private static void preApi29Check() {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 >= r1) goto L7
                return
            L7:
                java.lang.UnsupportedClassVersionError r0 = new java.lang.UnsupportedClassVersionError
                java.lang.String r1 = "This function can only be used for API Level < 29."
                r0.<init>(r1)
                throw r0
        }

        void doAfterTextChanged(android.widget.AutoCompleteTextView r3) {
                r2 = this;
                preApi29Check()
                java.lang.reflect.Method r0 = r2.mDoAfterTextChanged
                if (r0 == 0) goto Ld
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> Ld
                r0.invoke(r3, r1)     // Catch: java.lang.Exception -> Ld
            Ld:
                return
        }

        void doBeforeTextChanged(android.widget.AutoCompleteTextView r3) {
                r2 = this;
                preApi29Check()
                java.lang.reflect.Method r0 = r2.mDoBeforeTextChanged
                if (r0 == 0) goto Ld
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> Ld
                r0.invoke(r3, r1)     // Catch: java.lang.Exception -> Ld
            Ld:
                return
        }

        void ensureImeVisible(android.widget.AutoCompleteTextView r5) {
                r4 = this;
                preApi29Check()
                java.lang.reflect.Method r0 = r4.mEnsureImeVisible
                if (r0 == 0) goto L14
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L14
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L14
                r3 = 0
                r2[r3] = r1     // Catch: java.lang.Exception -> L14
                r0.invoke(r5, r2)     // Catch: java.lang.Exception -> L14
            L14:
                return
        }
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.SearchView.SavedState> CREATOR = null;
        boolean isIconified;


        static {
                androidx.appcompat.widget.SearchView$SavedState$1 r0 = new androidx.appcompat.widget.SearchView$SavedState$1
                r0.<init>()
                androidx.appcompat.widget.SearchView.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r2 = 0
                java.lang.Object r1 = r1.readValue(r2)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r0.isIconified = r1
                return
        }

        SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "SearchView.SavedState{"
                r0.<init>(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " isIconified="
                java.lang.StringBuilder r0 = r0.append(r1)
                boolean r1 = r2.isIconified
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "}"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.isIconified
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r1.writeValue(r2)
                return
        }
    }

    public static class SearchAutoComplete extends androidx.appcompat.widget.AppCompatAutoCompleteTextView {
        private boolean mHasPendingShowSoftInputRequest;
        final java.lang.Runnable mRunShowSoftInputIfNecessary;
        private androidx.appcompat.widget.SearchView mSearchView;
        private int mThreshold;


        public SearchAutoComplete(android.content.Context r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public SearchAutoComplete(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                int r0 = androidx.appcompat.C0015R.attr.autoCompleteTextViewStyle
                r1.<init>(r2, r3, r0)
                return
        }

        public SearchAutoComplete(android.content.Context r1, android.util.AttributeSet r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                androidx.appcompat.widget.SearchView$SearchAutoComplete$1 r1 = new androidx.appcompat.widget.SearchView$SearchAutoComplete$1
                r1.<init>(r0)
                r0.mRunShowSoftInputIfNecessary = r1
                int r1 = r0.getThreshold()
                r0.mThreshold = r1
                return
        }

        private int getSearchViewTextMinWidthDp() {
                r4 = this;
                android.content.res.Resources r0 = r4.getResources()
                android.content.res.Configuration r0 = r0.getConfiguration()
                int r1 = r0.screenWidthDp
                int r2 = r0.screenHeightDp
                r3 = 960(0x3c0, float:1.345E-42)
                if (r1 < r3) goto L1c
                r3 = 720(0x2d0, float:1.009E-42)
                if (r2 < r3) goto L1c
                int r0 = r0.orientation
                r3 = 2
                if (r0 != r3) goto L1c
                r0 = 256(0x100, float:3.59E-43)
                return r0
            L1c:
                r0 = 600(0x258, float:8.41E-43)
                if (r1 >= r0) goto L2c
                r0 = 640(0x280, float:8.97E-43)
                if (r1 < r0) goto L29
                r0 = 480(0x1e0, float:6.73E-43)
                if (r2 < r0) goto L29
                goto L2c
            L29:
                r0 = 160(0xa0, float:2.24E-43)
                return r0
            L2c:
                r0 = 192(0xc0, float:2.69E-43)
                return r0
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
                r1 = this;
                int r0 = r1.mThreshold
                if (r0 <= 0) goto Ld
                boolean r0 = super.enoughToFilter()
                if (r0 == 0) goto Lb
                goto Ld
            Lb:
                r0 = 0
                goto Le
            Ld:
                r0 = 1
            Le:
                return r0
        }

        void ensureImeVisible() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L14
                r0 = 1
                r2.setInputMethodMode(r0)
                boolean r0 = r2.enoughToFilter()
                if (r0 == 0) goto L19
                r2.showDropDown()
                goto L19
            L14:
                androidx.appcompat.widget.SearchView$PreQAutoCompleteTextViewReflector r0 = androidx.appcompat.widget.SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER
                r0.ensureImeVisible(r2)
            L19:
                return
        }

        boolean isEmpty() {
                r1 = this;
                android.text.Editable r0 = r1.getText()
                int r0 = android.text.TextUtils.getTrimmedLength(r0)
                if (r0 != 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
                r1 = this;
                android.view.inputmethod.InputConnection r2 = super.onCreateInputConnection(r2)
                boolean r0 = r1.mHasPendingShowSoftInputRequest
                if (r0 == 0) goto L12
                java.lang.Runnable r0 = r1.mRunShowSoftInputIfNecessary
                r1.removeCallbacks(r0)
                java.lang.Runnable r0 = r1.mRunShowSoftInputIfNecessary
                r1.post(r0)
            L12:
                return r2
        }

        @Override // android.view.View
        protected void onFinishInflate() {
                r3 = this;
                super.onFinishInflate()
                android.content.res.Resources r0 = r3.getResources()
                android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
                int r1 = r3.getSearchViewTextMinWidthDp()
                float r1 = (float) r1
                r2 = 1
                float r0 = android.util.TypedValue.applyDimension(r2, r1, r0)
                int r0 = (int) r0
                r3.setMinWidth(r0)
                return
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
                r0 = this;
                super.onFocusChanged(r1, r2, r3)
                androidx.appcompat.widget.SearchView r1 = r0.mSearchView
                r1.onTextFocusChanged()
                return
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int r3, android.view.KeyEvent r4) {
                r2 = this;
                r0 = 4
                if (r3 != r0) goto L3f
                int r0 = r4.getAction()
                r1 = 1
                if (r0 != 0) goto L1a
                int r0 = r4.getRepeatCount()
                if (r0 != 0) goto L1a
                android.view.KeyEvent$DispatcherState r3 = r2.getKeyDispatcherState()
                if (r3 == 0) goto L19
                r3.startTracking(r4, r2)
            L19:
                return r1
            L1a:
                int r0 = r4.getAction()
                if (r0 != r1) goto L3f
                android.view.KeyEvent$DispatcherState r0 = r2.getKeyDispatcherState()
                if (r0 == 0) goto L29
                r0.handleUpEvent(r4)
            L29:
                boolean r0 = r4.isTracking()
                if (r0 == 0) goto L3f
                boolean r0 = r4.isCanceled()
                if (r0 != 0) goto L3f
                androidx.appcompat.widget.SearchView r3 = r2.mSearchView
                r3.clearFocus()
                r3 = 0
                r2.setImeVisibility(r3)
                return r1
            L3f:
                boolean r3 = super.onKeyPreIme(r3, r4)
                return r3
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean r1) {
                r0 = this;
                super.onWindowFocusChanged(r1)
                if (r1 == 0) goto L23
                androidx.appcompat.widget.SearchView r1 = r0.mSearchView
                boolean r1 = r1.hasFocus()
                if (r1 == 0) goto L23
                int r1 = r0.getVisibility()
                if (r1 != 0) goto L23
                r1 = 1
                r0.mHasPendingShowSoftInputRequest = r1
                android.content.Context r1 = r0.getContext()
                boolean r1 = androidx.appcompat.widget.SearchView.isLandscapeMode(r1)
                if (r1 == 0) goto L23
                r0.ensureImeVisible()
            L23:
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
                r0 = this;
                return
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(java.lang.CharSequence r1) {
                r0 = this;
                return
        }

        void setImeVisibility(boolean r3) {
                r2 = this;
                android.content.Context r0 = r2.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r1 = 0
                if (r3 != 0) goto L1e
                r2.mHasPendingShowSoftInputRequest = r1
                java.lang.Runnable r3 = r2.mRunShowSoftInputIfNecessary
                r2.removeCallbacks(r3)
                android.os.IBinder r3 = r2.getWindowToken()
                r0.hideSoftInputFromWindow(r3, r1)
                return
            L1e:
                boolean r3 = r0.isActive(r2)
                if (r3 == 0) goto L2f
                r2.mHasPendingShowSoftInputRequest = r1
                java.lang.Runnable r3 = r2.mRunShowSoftInputIfNecessary
                r2.removeCallbacks(r3)
                r0.showSoftInput(r2, r1)
                return
            L2f:
                r3 = 1
                r2.mHasPendingShowSoftInputRequest = r3
                return
        }

        void setSearchView(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.mSearchView = r1
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int r1) {
                r0 = this;
                super.setThreshold(r1)
                r0.mThreshold = r1
                return
        }

        void showSoftInputIfNecessary() {
                r2 = this;
                boolean r0 = r2.mHasPendingShowSoftInputRequest
                if (r0 == 0) goto L16
                android.content.Context r0 = r2.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r1 = 0
                r0.showSoftInput(r2, r1)
                r2.mHasPendingShowSoftInputRequest = r1
            L16:
                return
        }
    }

    private static class UpdatableTouchDelegate extends android.view.TouchDelegate {
        private final android.graphics.Rect mActualBounds;
        private boolean mDelegateTargeted;
        private final android.view.View mDelegateView;
        private final int mSlop;
        private final android.graphics.Rect mSlopBounds;
        private final android.graphics.Rect mTargetBounds;

        public UpdatableTouchDelegate(android.graphics.Rect r2, android.graphics.Rect r3, android.view.View r4) {
                r1 = this;
                r1.<init>(r2, r4)
                android.content.Context r0 = r4.getContext()
                android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
                int r0 = r0.getScaledTouchSlop()
                r1.mSlop = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.mTargetBounds = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.mSlopBounds = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.mActualBounds = r0
                r1.setBounds(r2, r3)
                r1.mDelegateView = r4
                return
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(android.view.MotionEvent r9) {
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L33
                if (r2 == r5) goto L20
                if (r2 == r3) goto L20
                r6 = 3
                if (r2 == r6) goto L1b
                goto L3f
            L1b:
                boolean r2 = r8.mDelegateTargeted
                r8.mDelegateTargeted = r4
                goto L2f
            L20:
                boolean r2 = r8.mDelegateTargeted
                if (r2 == 0) goto L2f
                android.graphics.Rect r6 = r8.mSlopBounds
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L2f
                r5 = r2
                r2 = r4
                goto L41
            L2f:
                r7 = r5
                r5 = r2
                r2 = r7
                goto L41
            L33:
                android.graphics.Rect r2 = r8.mTargetBounds
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L3f
                r8.mDelegateTargeted = r5
                r2 = r5
                goto L41
            L3f:
                r2 = r5
                r5 = r4
            L41:
                if (r5 == 0) goto L76
                if (r2 == 0) goto L61
                android.graphics.Rect r2 = r8.mActualBounds
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L61
                android.view.View r0 = r8.mDelegateView
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.mDelegateView
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                goto L70
            L61:
                android.graphics.Rect r2 = r8.mActualBounds
                int r2 = r2.left
                int r0 = r0 - r2
                float r0 = (float) r0
                android.graphics.Rect r2 = r8.mActualBounds
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r9.setLocation(r0, r1)
            L70:
                android.view.View r0 = r8.mDelegateView
                boolean r4 = r0.dispatchTouchEvent(r9)
            L76:
                return r4
        }

        public void setBounds(android.graphics.Rect r3, android.graphics.Rect r4) {
                r2 = this;
                android.graphics.Rect r0 = r2.mTargetBounds
                r0.set(r3)
                android.graphics.Rect r0 = r2.mSlopBounds
                r0.set(r3)
                android.graphics.Rect r3 = r2.mSlopBounds
                int r0 = r2.mSlop
                int r1 = -r0
                int r0 = -r0
                r3.inset(r1, r0)
                android.graphics.Rect r3 = r2.mActualBounds
                r3.set(r4)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto Lc
            androidx.appcompat.widget.SearchView$PreQAutoCompleteTextViewReflector r0 = new androidx.appcompat.widget.SearchView$PreQAutoCompleteTextViewReflector
            r0.<init>()
            goto Ld
        Lc:
            r0 = 0
        Ld:
            androidx.appcompat.widget.SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER = r0
            return
    }

    public SearchView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SearchView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.C0015R.attr.searchViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public SearchView(android.content.Context r17, android.util.AttributeSet r18, int r19) {
            r16 = this;
            r0 = r16
            r16.<init>(r17, r18, r19)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.mSearchSrcTextViewBounds = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.mSearchSrtTextViewBoundsExpanded = r1
            r1 = 2
            int[] r2 = new int[r1]
            r0.mTemp = r2
            int[] r1 = new int[r1]
            r0.mTemp2 = r1
            androidx.appcompat.widget.SearchView$1 r1 = new androidx.appcompat.widget.SearchView$1
            r1.<init>(r0)
            r0.mUpdateDrawableStateRunnable = r1
            androidx.appcompat.widget.SearchView$2 r1 = new androidx.appcompat.widget.SearchView$2
            r1.<init>(r0)
            r0.mReleaseCursorRunnable = r1
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            r0.mOutsideDrawablesCache = r1
            androidx.appcompat.widget.SearchView$5 r1 = new androidx.appcompat.widget.SearchView$5
            r1.<init>(r0)
            r0.mOnClickListener = r1
            androidx.appcompat.widget.SearchView$6 r2 = new androidx.appcompat.widget.SearchView$6
            r2.<init>(r0)
            r0.mTextKeyListener = r2
            androidx.appcompat.widget.SearchView$7 r2 = new androidx.appcompat.widget.SearchView$7
            r2.<init>(r0)
            r0.mOnEditorActionListener = r2
            androidx.appcompat.widget.SearchView$8 r3 = new androidx.appcompat.widget.SearchView$8
            r3.<init>(r0)
            r0.mOnItemClickListener = r3
            androidx.appcompat.widget.SearchView$9 r4 = new androidx.appcompat.widget.SearchView$9
            r4.<init>(r0)
            r0.mOnItemSelectedListener = r4
            androidx.appcompat.widget.SearchView$10 r5 = new androidx.appcompat.widget.SearchView$10
            r5.<init>(r0)
            r0.mTextWatcher = r5
            int[] r5 = androidx.appcompat.C0015R.styleable.SearchView
            r6 = 0
            r7 = r17
            r8 = r18
            r9 = r19
            androidx.appcompat.widget.TintTypedArray r5 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r7, r8, r5, r9, r6)
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r17)
            int r8 = androidx.appcompat.C0015R.styleable.SearchView_layout
            int r9 = androidx.appcompat.C0015R.layout.abc_search_view
            int r8 = r5.getResourceId(r8, r9)
            r9 = 1
            r7.inflate(r8, r0, r9)
            int r7 = androidx.appcompat.C0015R.id.search_src_text
            android.view.View r7 = r0.findViewById(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = (androidx.appcompat.widget.SearchView.SearchAutoComplete) r7
            r0.mSearchSrcTextView = r7
            r7.setSearchView(r0)
            int r8 = androidx.appcompat.C0015R.id.search_edit_frame
            android.view.View r8 = r0.findViewById(r8)
            r0.mSearchEditFrame = r8
            int r8 = androidx.appcompat.C0015R.id.search_plate
            android.view.View r8 = r0.findViewById(r8)
            r0.mSearchPlate = r8
            int r10 = androidx.appcompat.C0015R.id.submit_area
            android.view.View r10 = r0.findViewById(r10)
            r0.mSubmitArea = r10
            int r11 = androidx.appcompat.C0015R.id.search_button
            android.view.View r11 = r0.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r0.mSearchButton = r11
            int r12 = androidx.appcompat.C0015R.id.search_go_btn
            android.view.View r12 = r0.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r0.mGoButton = r12
            int r13 = androidx.appcompat.C0015R.id.search_close_btn
            android.view.View r13 = r0.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r0.mCloseButton = r13
            int r14 = androidx.appcompat.C0015R.id.search_voice_btn
            android.view.View r14 = r0.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r0.mVoiceButton = r14
            int r15 = androidx.appcompat.C0015R.id.search_mag_icon
            android.view.View r15 = r0.findViewById(r15)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r0.mCollapsedIcon = r15
            int r9 = androidx.appcompat.C0015R.styleable.SearchView_queryBackground
            android.graphics.drawable.Drawable r9 = r5.getDrawable(r9)
            androidx.core.view.ViewCompat.setBackground(r8, r9)
            int r8 = androidx.appcompat.C0015R.styleable.SearchView_submitBackground
            android.graphics.drawable.Drawable r8 = r5.getDrawable(r8)
            androidx.core.view.ViewCompat.setBackground(r10, r8)
            int r8 = androidx.appcompat.C0015R.styleable.SearchView_searchIcon
            android.graphics.drawable.Drawable r8 = r5.getDrawable(r8)
            r11.setImageDrawable(r8)
            int r8 = androidx.appcompat.C0015R.styleable.SearchView_goIcon
            android.graphics.drawable.Drawable r8 = r5.getDrawable(r8)
            r12.setImageDrawable(r8)
            int r8 = androidx.appcompat.C0015R.styleable.SearchView_closeIcon
            android.graphics.drawable.Drawable r8 = r5.getDrawable(r8)
            r13.setImageDrawable(r8)
            int r8 = androidx.appcompat.C0015R.styleable.SearchView_voiceIcon
            android.graphics.drawable.Drawable r8 = r5.getDrawable(r8)
            r14.setImageDrawable(r8)
            int r8 = androidx.appcompat.C0015R.styleable.SearchView_searchIcon
            android.graphics.drawable.Drawable r8 = r5.getDrawable(r8)
            r15.setImageDrawable(r8)
            int r8 = androidx.appcompat.C0015R.styleable.SearchView_searchHintIcon
            android.graphics.drawable.Drawable r8 = r5.getDrawable(r8)
            r0.mSearchHintIcon = r8
            android.content.res.Resources r8 = r16.getResources()
            int r9 = androidx.appcompat.C0015R.string.abc_searchview_description_search
            java.lang.String r8 = r8.getString(r9)
            androidx.appcompat.widget.TooltipCompat.setTooltipText(r11, r8)
            int r8 = androidx.appcompat.C0015R.styleable.SearchView_suggestionRowLayout
            int r9 = androidx.appcompat.C0015R.layout.abc_search_dropdown_item_icons_2line
            int r8 = r5.getResourceId(r8, r9)
            r0.mSuggestionRowLayout = r8
            int r8 = androidx.appcompat.C0015R.styleable.SearchView_commitIcon
            int r6 = r5.getResourceId(r8, r6)
            r0.mSuggestionCommitIconResId = r6
            r11.setOnClickListener(r1)
            r13.setOnClickListener(r1)
            r12.setOnClickListener(r1)
            r14.setOnClickListener(r1)
            r7.setOnClickListener(r1)
            android.text.TextWatcher r1 = r0.mTextWatcher
            r7.addTextChangedListener(r1)
            r7.setOnEditorActionListener(r2)
            r7.setOnItemClickListener(r3)
            r7.setOnItemSelectedListener(r4)
            android.view.View$OnKeyListener r1 = r0.mTextKeyListener
            r7.setOnKeyListener(r1)
            androidx.appcompat.widget.SearchView$3 r1 = new androidx.appcompat.widget.SearchView$3
            r1.<init>(r0)
            r7.setOnFocusChangeListener(r1)
            int r1 = androidx.appcompat.C0015R.styleable.SearchView_iconifiedByDefault
            r2 = 1
            boolean r1 = r5.getBoolean(r1, r2)
            r0.setIconifiedByDefault(r1)
            int r1 = androidx.appcompat.C0015R.styleable.SearchView_android_maxWidth
            r2 = -1
            int r1 = r5.getDimensionPixelSize(r1, r2)
            if (r1 == r2) goto L175
            r0.setMaxWidth(r1)
        L175:
            int r1 = androidx.appcompat.C0015R.styleable.SearchView_defaultQueryHint
            java.lang.CharSequence r1 = r5.getText(r1)
            r0.mDefaultQueryHint = r1
            int r1 = androidx.appcompat.C0015R.styleable.SearchView_queryHint
            java.lang.CharSequence r1 = r5.getText(r1)
            r0.mQueryHint = r1
            int r1 = androidx.appcompat.C0015R.styleable.SearchView_android_imeOptions
            int r1 = r5.getInt(r1, r2)
            if (r1 == r2) goto L190
            r0.setImeOptions(r1)
        L190:
            int r1 = androidx.appcompat.C0015R.styleable.SearchView_android_inputType
            int r1 = r5.getInt(r1, r2)
            if (r1 == r2) goto L19b
            r0.setInputType(r1)
        L19b:
            int r1 = androidx.appcompat.C0015R.styleable.SearchView_android_focusable
            r2 = 1
            boolean r1 = r5.getBoolean(r1, r2)
            r0.setFocusable(r1)
            r5.recycle()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.speech.action.WEB_SEARCH"
            r1.<init>(r2)
            r0.mVoiceWebSearchIntent = r1
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r2)
            java.lang.String r3 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r4 = "web_search"
            r1.putExtra(r3, r4)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "android.speech.action.RECOGNIZE_SPEECH"
            r1.<init>(r3)
            r0.mVoiceAppSearchIntent = r1
            r1.addFlags(r2)
            int r1 = r7.getDropDownAnchor()
            android.view.View r1 = r0.findViewById(r1)
            r0.mDropDownAnchor = r1
            if (r1 == 0) goto L1dd
            androidx.appcompat.widget.SearchView$4 r2 = new androidx.appcompat.widget.SearchView$4
            r2.<init>(r0)
            r1.addOnLayoutChangeListener(r2)
        L1dd:
            boolean r1 = r0.mIconifiedByDefault
            r0.updateViewsVisibility(r1)
            r16.updateQueryHint()
            return
    }

    private android.content.Intent createIntent(java.lang.String r2, android.net.Uri r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7) {
            r1 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r2)
            if (r3 == 0) goto Lf
            r0.setData(r3)
        Lf:
            java.lang.String r2 = "user_query"
            java.lang.CharSequence r3 = r1.mUserQuery
            r0.putExtra(r2, r3)
            if (r5 == 0) goto L1d
            java.lang.String r2 = "query"
            r0.putExtra(r2, r5)
        L1d:
            if (r4 == 0) goto L24
            java.lang.String r2 = "intent_extra_data_key"
            r0.putExtra(r2, r4)
        L24:
            android.os.Bundle r2 = r1.mAppSearchData
            if (r2 == 0) goto L2d
            java.lang.String r3 = "app_data"
            r0.putExtra(r3, r2)
        L2d:
            if (r6 == 0) goto L39
            java.lang.String r2 = "action_key"
            r0.putExtra(r2, r6)
            java.lang.String r2 = "action_msg"
            r0.putExtra(r2, r7)
        L39:
            android.app.SearchableInfo r2 = r1.mSearchable
            android.content.ComponentName r2 = r2.getSearchActivity()
            r0.setComponent(r2)
            return r0
    }

    private android.content.Intent createIntentFromSuggestion(android.database.Cursor r9, int r10, java.lang.String r11) {
            r8 = this;
            r0 = 0
            java.lang.String r1 = "suggest_intent_action"
            java.lang.String r1 = androidx.appcompat.widget.SuggestionsAdapter.getColumnString(r9, r1)     // Catch: java.lang.RuntimeException -> L64
            if (r1 != 0) goto Lf
            android.app.SearchableInfo r1 = r8.mSearchable     // Catch: java.lang.RuntimeException -> L64
            java.lang.String r1 = r1.getSuggestIntentAction()     // Catch: java.lang.RuntimeException -> L64
        Lf:
            if (r1 != 0) goto L13
            java.lang.String r1 = "android.intent.action.SEARCH"
        L13:
            r2 = r1
            java.lang.String r1 = "suggest_intent_data"
            java.lang.String r1 = androidx.appcompat.widget.SuggestionsAdapter.getColumnString(r9, r1)     // Catch: java.lang.RuntimeException -> L64
            if (r1 != 0) goto L22
            android.app.SearchableInfo r1 = r8.mSearchable     // Catch: java.lang.RuntimeException -> L64
            java.lang.String r1 = r1.getSuggestIntentData()     // Catch: java.lang.RuntimeException -> L64
        L22:
            if (r1 == 0) goto L47
            java.lang.String r3 = "suggest_intent_data_id"
            java.lang.String r3 = androidx.appcompat.widget.SuggestionsAdapter.getColumnString(r9, r3)     // Catch: java.lang.RuntimeException -> L64
            if (r3 == 0) goto L47
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L64
            r4.<init>()     // Catch: java.lang.RuntimeException -> L64
            java.lang.StringBuilder r1 = r4.append(r1)     // Catch: java.lang.RuntimeException -> L64
            java.lang.String r4 = "/"
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.RuntimeException -> L64
            java.lang.String r3 = android.net.Uri.encode(r3)     // Catch: java.lang.RuntimeException -> L64
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.RuntimeException -> L64
            java.lang.String r1 = r1.toString()     // Catch: java.lang.RuntimeException -> L64
        L47:
            if (r1 != 0) goto L4b
            r3 = r0
            goto L50
        L4b:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.RuntimeException -> L64
            r3 = r1
        L50:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r5 = androidx.appcompat.widget.SuggestionsAdapter.getColumnString(r9, r1)     // Catch: java.lang.RuntimeException -> L64
            java.lang.String r1 = "suggest_intent_extra_data"
            java.lang.String r4 = androidx.appcompat.widget.SuggestionsAdapter.getColumnString(r9, r1)     // Catch: java.lang.RuntimeException -> L64
            r1 = r8
            r6 = r10
            r7 = r11
            android.content.Intent r9 = r1.createIntent(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L64
            return r9
        L64:
            r10 = move-exception
            int r9 = r9.getPosition()     // Catch: java.lang.RuntimeException -> L6a
            goto L6b
        L6a:
            r9 = -1
        L6b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "Search suggestions cursor at row "
            r11.<init>(r1)
            java.lang.StringBuilder r9 = r11.append(r9)
            java.lang.String r11 = " returned exception."
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "SearchView"
            android.util.Log.w(r11, r9, r10)
            return r0
    }

    private android.content.Intent createVoiceAppSearchIntent(android.content.Intent r9, android.app.SearchableInfo r10) {
            r8 = this;
            android.content.ComponentName r0 = r10.getSearchActivity()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.SEARCH"
            r1.<init>(r2)
            r1.setComponent(r0)
            android.content.Context r2 = r8.getContext()
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r2, r3, r1, r4)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.os.Bundle r3 = r8.mAppSearchData
            if (r3 == 0) goto L27
            java.lang.String r4 = "app_data"
            r2.putParcelable(r4, r3)
        L27:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r9)
            android.content.res.Resources r9 = r8.getResources()
            int r4 = r10.getVoiceLanguageModeId()
            if (r4 == 0) goto L3f
            int r4 = r10.getVoiceLanguageModeId()
            java.lang.String r4 = r9.getString(r4)
            goto L41
        L3f:
            java.lang.String r4 = "free_form"
        L41:
            int r5 = r10.getVoicePromptTextId()
            r6 = 0
            if (r5 == 0) goto L51
            int r5 = r10.getVoicePromptTextId()
            java.lang.String r5 = r9.getString(r5)
            goto L52
        L51:
            r5 = r6
        L52:
            int r7 = r10.getVoiceLanguageId()
            if (r7 == 0) goto L61
            int r7 = r10.getVoiceLanguageId()
            java.lang.String r9 = r9.getString(r7)
            goto L62
        L61:
            r9 = r6
        L62:
            int r7 = r10.getVoiceMaxResults()
            if (r7 == 0) goto L6d
            int r10 = r10.getVoiceMaxResults()
            goto L6e
        L6d:
            r10 = 1
        L6e:
            java.lang.String r7 = "android.speech.extra.LANGUAGE_MODEL"
            r3.putExtra(r7, r4)
            java.lang.String r4 = "android.speech.extra.PROMPT"
            r3.putExtra(r4, r5)
            java.lang.String r4 = "android.speech.extra.LANGUAGE"
            r3.putExtra(r4, r9)
            java.lang.String r9 = "android.speech.extra.MAX_RESULTS"
            r3.putExtra(r9, r10)
            if (r0 != 0) goto L85
            goto L89
        L85:
            java.lang.String r6 = r0.flattenToShortString()
        L89:
            java.lang.String r9 = "calling_package"
            r3.putExtra(r9, r6)
            java.lang.String r9 = "android.speech.extra.RESULTS_PENDINGINTENT"
            r3.putExtra(r9, r1)
            java.lang.String r9 = "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"
            r3.putExtra(r9, r2)
            return r3
    }

    private android.content.Intent createVoiceWebSearchIntent(android.content.Intent r2, android.app.SearchableInfo r3) {
            r1 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2)
            android.content.ComponentName r2 = r3.getSearchActivity()
            if (r2 != 0) goto Ld
            r2 = 0
            goto L11
        Ld:
            java.lang.String r2 = r2.flattenToShortString()
        L11:
            java.lang.String r3 = "calling_package"
            r0.putExtra(r3, r2)
            return r0
    }

    private void dismissSuggestions() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.mSearchSrcTextView
            r0.dismissDropDown()
            return
    }

    private void getChildBoundsWithinSearchView(android.view.View r5, android.graphics.Rect r6) {
            r4 = this;
            int[] r0 = r4.mTemp
            r5.getLocationInWindow(r0)
            int[] r0 = r4.mTemp2
            r4.getLocationInWindow(r0)
            int[] r0 = r4.mTemp
            r1 = 1
            r2 = r0[r1]
            int[] r3 = r4.mTemp2
            r1 = r3[r1]
            int r2 = r2 - r1
            r1 = 0
            r0 = r0[r1]
            r1 = r3[r1]
            int r0 = r0 - r1
            int r1 = r5.getWidth()
            int r1 = r1 + r0
            int r5 = r5.getHeight()
            int r5 = r5 + r2
            r6.set(r0, r2, r1, r5)
            return
    }

    private java.lang.CharSequence getDecoratedHint(java.lang.CharSequence r6) {
            r5 = this;
            boolean r0 = r5.mIconifiedByDefault
            if (r0 == 0) goto L33
            android.graphics.drawable.Drawable r0 = r5.mSearchHintIcon
            if (r0 != 0) goto L9
            goto L33
        L9:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r5.mSearchSrcTextView
            float r0 = r0.getTextSize()
            double r0 = (double) r0
            r2 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            double r0 = r0 * r2
            int r0 = (int) r0
            android.graphics.drawable.Drawable r1 = r5.mSearchHintIcon
            r2 = 0
            r1.setBounds(r2, r2, r0, r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            java.lang.String r1 = "   "
            r0.<init>(r1)
            android.text.style.ImageSpan r1 = new android.text.style.ImageSpan
            android.graphics.drawable.Drawable r2 = r5.mSearchHintIcon
            r1.<init>(r2)
            r2 = 2
            r3 = 33
            r4 = 1
            r0.setSpan(r1, r4, r2, r3)
            r0.append(r6)
            return r0
        L33:
            return r6
    }

    private int getPreferredHeight() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = androidx.appcompat.C0015R.dimen.abc_search_view_preferred_height
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    private int getPreferredWidth() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = androidx.appcompat.C0015R.dimen.abc_search_view_preferred_width
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    private boolean hasVoiceSearch() {
            r4 = this;
            android.app.SearchableInfo r0 = r4.mSearchable
            r1 = 0
            if (r0 == 0) goto L35
            boolean r0 = r0.getVoiceSearchEnabled()
            if (r0 == 0) goto L35
            android.app.SearchableInfo r0 = r4.mSearchable
            boolean r0 = r0.getVoiceSearchLaunchWebSearch()
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.mVoiceWebSearchIntent
            goto L22
        L16:
            android.app.SearchableInfo r0 = r4.mSearchable
            boolean r0 = r0.getVoiceSearchLaunchRecognizer()
            if (r0 == 0) goto L21
            android.content.Intent r0 = r4.mVoiceAppSearchIntent
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 == 0) goto L35
            android.content.Context r2 = r4.getContext()
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            r3 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r2.resolveActivity(r0, r3)
            if (r0 == 0) goto L35
            r1 = 1
        L35:
            return r1
    }

    static boolean isLandscapeMode(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r0 = 2
            if (r1 != r0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    private boolean isSubmitAreaEnabled() {
            r1 = this;
            boolean r0 = r1.mSubmitButtonEnabled
            if (r0 != 0) goto L8
            boolean r0 = r1.mVoiceButtonEnabled
            if (r0 == 0) goto L10
        L8:
            boolean r0 = r1.isIconified()
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private void launchIntent(android.content.Intent r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            android.content.Context r0 = r3.getContext()     // Catch: java.lang.RuntimeException -> Lb
            r0.startActivity(r4)     // Catch: java.lang.RuntimeException -> Lb
            goto L20
        Lb:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed launch activity: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = "SearchView"
            android.util.Log.e(r1, r4, r0)
        L20:
            return
    }

    private boolean launchSuggestion(int r2, int r3, java.lang.String r4) {
            r1 = this;
            androidx.cursoradapter.widget.CursorAdapter r0 = r1.mSuggestionsAdapter
            android.database.Cursor r0 = r0.getCursor()
            if (r0 == 0) goto L17
            boolean r2 = r0.moveToPosition(r2)
            if (r2 == 0) goto L17
            android.content.Intent r2 = r1.createIntentFromSuggestion(r0, r3, r4)
            r1.launchIntent(r2)
            r2 = 1
            return r2
        L17:
            r2 = 0
            return r2
    }

    private void postUpdateFocusedState() {
            r1 = this;
            java.lang.Runnable r0 = r1.mUpdateDrawableStateRunnable
            r1.post(r0)
            return
    }

    private void rewriteQueryFromSuggestion(int r3) {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            android.text.Editable r0 = r0.getText()
            androidx.cursoradapter.widget.CursorAdapter r1 = r2.mSuggestionsAdapter
            android.database.Cursor r1 = r1.getCursor()
            if (r1 != 0) goto Lf
            return
        Lf:
            boolean r3 = r1.moveToPosition(r3)
            if (r3 == 0) goto L25
            androidx.cursoradapter.widget.CursorAdapter r3 = r2.mSuggestionsAdapter
            java.lang.CharSequence r3 = r3.convertToString(r1)
            if (r3 == 0) goto L21
            r2.setQuery(r3)
            goto L28
        L21:
            r2.setQuery(r0)
            goto L28
        L25:
            r2.setQuery(r0)
        L28:
            return
    }

    private void setQuery(java.lang.CharSequence r3) {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            r0.setText(r3)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto Lf
            r3 = 0
            goto L13
        Lf:
            int r3 = r3.length()
        L13:
            r0.setSelection(r3)
            return
    }

    private void updateCloseButton() {
            r4 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r4.mSearchSrcTextView
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 != 0) goto L19
            boolean r3 = r4.mIconifiedByDefault
            if (r3 == 0) goto L18
            boolean r3 = r4.mExpandedInActionView
            if (r3 != 0) goto L18
            goto L19
        L18:
            r1 = r2
        L19:
            android.widget.ImageView r3 = r4.mCloseButton
            if (r1 == 0) goto L1e
            goto L20
        L1e:
            r2 = 8
        L20:
            r3.setVisibility(r2)
            android.widget.ImageView r1 = r4.mCloseButton
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            if (r1 == 0) goto L35
            if (r0 == 0) goto L30
            int[] r0 = androidx.appcompat.widget.SearchView.ENABLED_STATE_SET
            goto L32
        L30:
            int[] r0 = androidx.appcompat.widget.SearchView.EMPTY_STATE_SET
        L32:
            r1.setState(r0)
        L35:
            return
    }

    private void updateQueryHint() {
            r2 = this;
            java.lang.CharSequence r0 = r2.getQueryHint()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r2.mSearchSrcTextView
            if (r0 != 0) goto La
            java.lang.String r0 = ""
        La:
            java.lang.CharSequence r0 = r2.getDecoratedHint(r0)
            r1.setHint(r0)
            return
    }

    private void updateSearchAutoComplete() {
            r5 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r5.mSearchSrcTextView
            android.app.SearchableInfo r1 = r5.mSearchable
            int r1 = r1.getSuggestThreshold()
            r0.setThreshold(r1)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r5.mSearchSrcTextView
            android.app.SearchableInfo r1 = r5.mSearchable
            int r1 = r1.getImeOptions()
            r0.setImeOptions(r1)
            android.app.SearchableInfo r0 = r5.mSearchable
            int r0 = r0.getInputType()
            r1 = r0 & 15
            r2 = 1
            if (r1 != r2) goto L33
            r1 = -65537(0xfffffffffffeffff, float:NaN)
            r0 = r0 & r1
            android.app.SearchableInfo r1 = r5.mSearchable
            java.lang.String r1 = r1.getSuggestAuthority()
            if (r1 == 0) goto L33
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 | r1
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 | r1
        L33:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r5.mSearchSrcTextView
            r1.setInputType(r0)
            androidx.cursoradapter.widget.CursorAdapter r0 = r5.mSuggestionsAdapter
            if (r0 == 0) goto L40
            r1 = 0
            r0.changeCursor(r1)
        L40:
            android.app.SearchableInfo r0 = r5.mSearchable
            java.lang.String r0 = r0.getSuggestAuthority()
            if (r0 == 0) goto L68
            androidx.appcompat.widget.SuggestionsAdapter r0 = new androidx.appcompat.widget.SuggestionsAdapter
            android.content.Context r1 = r5.getContext()
            android.app.SearchableInfo r3 = r5.mSearchable
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r5.mOutsideDrawablesCache
            r0.<init>(r1, r5, r3, r4)
            r5.mSuggestionsAdapter = r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r5.mSearchSrcTextView
            r1.setAdapter(r0)
            androidx.cursoradapter.widget.CursorAdapter r0 = r5.mSuggestionsAdapter
            androidx.appcompat.widget.SuggestionsAdapter r0 = (androidx.appcompat.widget.SuggestionsAdapter) r0
            boolean r1 = r5.mQueryRefinement
            if (r1 == 0) goto L65
            r2 = 2
        L65:
            r0.setQueryRefinement(r2)
        L68:
            return
    }

    private void updateSubmitArea() {
            r2 = this;
            boolean r0 = r2.isSubmitAreaEnabled()
            if (r0 == 0) goto L18
            android.widget.ImageView r0 = r2.mGoButton
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L16
            android.widget.ImageView r0 = r2.mVoiceButton
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L18
        L16:
            r0 = 0
            goto L1a
        L18:
            r0 = 8
        L1a:
            android.view.View r1 = r2.mSubmitArea
            r1.setVisibility(r0)
            return
    }

    private void updateSubmitButton(boolean r2) {
            r1 = this;
            boolean r0 = r1.mSubmitButtonEnabled
            if (r0 == 0) goto L18
            boolean r0 = r1.isSubmitAreaEnabled()
            if (r0 == 0) goto L18
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L18
            if (r2 != 0) goto L16
            boolean r2 = r1.mVoiceButtonEnabled
            if (r2 != 0) goto L18
        L16:
            r2 = 0
            goto L1a
        L18:
            r2 = 8
        L1a:
            android.widget.ImageView r0 = r1.mGoButton
            r0.setVisibility(r2)
            return
    }

    private void updateViewsVisibility(boolean r6) {
            r5 = this;
            r5.mIconified = r6
            r0 = 0
            r1 = 8
            if (r6 == 0) goto L9
            r2 = r0
            goto La
        L9:
            r2 = r1
        La:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r5.mSearchSrcTextView
            android.text.Editable r3 = r3.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r3 = r3 ^ 1
            android.widget.ImageView r4 = r5.mSearchButton
            r4.setVisibility(r2)
            r5.updateSubmitButton(r3)
            android.view.View r2 = r5.mSearchEditFrame
            if (r6 == 0) goto L24
            r6 = r1
            goto L25
        L24:
            r6 = r0
        L25:
            r2.setVisibility(r6)
            android.widget.ImageView r6 = r5.mCollapsedIcon
            android.graphics.drawable.Drawable r6 = r6.getDrawable()
            if (r6 == 0) goto L34
            boolean r6 = r5.mIconifiedByDefault
            if (r6 == 0) goto L35
        L34:
            r0 = r1
        L35:
            android.widget.ImageView r6 = r5.mCollapsedIcon
            r6.setVisibility(r0)
            r5.updateCloseButton()
            r6 = r3 ^ 1
            r5.updateVoiceButton(r6)
            r5.updateSubmitArea()
            return
    }

    private void updateVoiceButton(boolean r3) {
            r2 = this;
            boolean r0 = r2.mVoiceButtonEnabled
            r1 = 8
            if (r0 == 0) goto L14
            boolean r0 = r2.isIconified()
            if (r0 != 0) goto L14
            if (r3 == 0) goto L14
            android.widget.ImageView r3 = r2.mGoButton
            r3.setVisibility(r1)
            r1 = 0
        L14:
            android.widget.ImageView r3 = r2.mVoiceButton
            r3.setVisibility(r1)
            return
    }

    void adjustDropDownSizeAndPosition() {
            r6 = this;
            android.view.View r0 = r6.mDropDownAnchor
            int r0 = r0.getWidth()
            r1 = 1
            if (r0 <= r1) goto L5f
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.view.View r1 = r6.mSearchPlate
            int r1 = r1.getPaddingLeft()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r3 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r6)
            boolean r4 = r6.mIconifiedByDefault
            if (r4 == 0) goto L32
            int r4 = androidx.appcompat.C0015R.dimen.abc_dropdownitem_icon_width
            int r4 = r0.getDimensionPixelSize(r4)
            int r5 = androidx.appcompat.C0015R.dimen.abc_dropdownitem_text_padding_left
            int r0 = r0.getDimensionPixelSize(r5)
            int r4 = r4 + r0
            goto L33
        L32:
            r4 = 0
        L33:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r6.mSearchSrcTextView
            android.graphics.drawable.Drawable r0 = r0.getDropDownBackground()
            r0.getPadding(r2)
            if (r3 == 0) goto L42
            int r0 = r2.left
            int r0 = -r0
            goto L47
        L42:
            int r0 = r2.left
            int r0 = r0 + r4
            int r0 = r1 - r0
        L47:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.mSearchSrcTextView
            r3.setDropDownHorizontalOffset(r0)
            android.view.View r0 = r6.mDropDownAnchor
            int r0 = r0.getWidth()
            int r3 = r2.left
            int r0 = r0 + r3
            int r2 = r2.right
            int r0 = r0 + r2
            int r0 = r0 + r4
            int r0 = r0 - r1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r6.mSearchSrcTextView
            r1.setDropDownWidth(r0)
        L5f:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
            r2 = this;
            r0 = 1
            r2.mClearingFocus = r0
            super.clearFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            r0.clearFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            r1 = 0
            r0.setImeVisibility(r1)
            r2.mClearingFocus = r1
            return
    }

    void forceSuggestionQuery() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lc
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            r0.refreshAutoCompleteResults()
            goto L18
        Lc:
            androidx.appcompat.widget.SearchView$PreQAutoCompleteTextViewReflector r0 = androidx.appcompat.widget.SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r2.mSearchSrcTextView
            r0.doBeforeTextChanged(r1)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r2.mSearchSrcTextView
            r0.doAfterTextChanged(r1)
        L18:
            return
    }

    public int getImeOptions() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.mSearchSrcTextView
            int r0 = r0.getImeOptions()
            return r0
    }

    public int getInputType() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.mSearchSrcTextView
            int r0 = r0.getInputType()
            return r0
    }

    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.mMaxWidth
            return r0
    }

    public java.lang.CharSequence getQuery() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.mSearchSrcTextView
            android.text.Editable r0 = r0.getText()
            return r0
    }

    public java.lang.CharSequence getQueryHint() {
            r2 = this;
            java.lang.CharSequence r0 = r2.mQueryHint
            if (r0 == 0) goto L5
            goto L20
        L5:
            android.app.SearchableInfo r0 = r2.mSearchable
            if (r0 == 0) goto L1e
            int r0 = r0.getHintId()
            if (r0 == 0) goto L1e
            android.content.Context r0 = r2.getContext()
            android.app.SearchableInfo r1 = r2.mSearchable
            int r1 = r1.getHintId()
            java.lang.CharSequence r0 = r0.getText(r1)
            goto L20
        L1e:
            java.lang.CharSequence r0 = r2.mDefaultQueryHint
        L20:
            return r0
    }

    int getSuggestionCommitIconResId() {
            r1 = this;
            int r0 = r1.mSuggestionCommitIconResId
            return r0
    }

    int getSuggestionRowLayout() {
            r1 = this;
            int r0 = r1.mSuggestionRowLayout
            return r0
    }

    public androidx.cursoradapter.widget.CursorAdapter getSuggestionsAdapter() {
            r1 = this;
            androidx.cursoradapter.widget.CursorAdapter r0 = r1.mSuggestionsAdapter
            return r0
    }

    public boolean isIconfiedByDefault() {
            r1 = this;
            boolean r0 = r1.mIconifiedByDefault
            return r0
    }

    public boolean isIconified() {
            r1 = this;
            boolean r0 = r1.mIconified
            return r0
    }

    public boolean isQueryRefinementEnabled() {
            r1 = this;
            boolean r0 = r1.mQueryRefinement
            return r0
    }

    public boolean isSubmitButtonEnabled() {
            r1 = this;
            boolean r0 = r1.mSubmitButtonEnabled
            return r0
    }

    void launchQuerySearch(int r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            java.lang.String r1 = "android.intent.action.SEARCH"
            r2 = 0
            r3 = 0
            r0 = r7
            r4 = r10
            r5 = r8
            r6 = r9
            android.content.Intent r8 = r0.createIntent(r1, r2, r3, r4, r5, r6)
            android.content.Context r9 = r7.getContext()
            r9.startActivity(r8)
            return
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public void onActionViewCollapsed() {
            r3 = this;
            java.lang.String r0 = ""
            r1 = 0
            r3.setQuery(r0, r1)
            r3.clearFocus()
            r0 = 1
            r3.updateViewsVisibility(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            int r2 = r3.mCollapsedImeOptions
            r0.setImeOptions(r2)
            r3.mExpandedInActionView = r1
            return
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public void onActionViewExpanded() {
            r3 = this;
            boolean r0 = r3.mExpandedInActionView
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.mExpandedInActionView = r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            int r0 = r0.getImeOptions()
            r3.mCollapsedImeOptions = r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r3.mSearchSrcTextView
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r2
            r1.setImeOptions(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            java.lang.String r1 = ""
            r0.setText(r1)
            r0 = 0
            r3.setIconified(r0)
            return
    }

    void onCloseClicked() {
            r3 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 == 0) goto L22
            boolean r0 = r3.mIconifiedByDefault
            if (r0 == 0) goto L33
            androidx.appcompat.widget.SearchView$OnCloseListener r0 = r3.mOnCloseListener
            if (r0 == 0) goto L1b
            boolean r0 = r0.onClose()
            if (r0 != 0) goto L33
        L1b:
            r3.clearFocus()
            r3.updateViewsVisibility(r1)
            goto L33
        L22:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            java.lang.String r2 = ""
            r0.setText(r2)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            r0.requestFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            r0.setImeVisibility(r1)
        L33:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            java.lang.Runnable r0 = r1.mUpdateDrawableStateRunnable
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.mReleaseCursorRunnable
            r1.post(r0)
            super.onDetachedFromWindow()
            return
    }

    boolean onItemClicked(int r1, int r2, java.lang.String r3) {
            r0 = this;
            androidx.appcompat.widget.SearchView$OnSuggestionListener r2 = r0.mOnSuggestionListener
            r3 = 0
            if (r2 == 0) goto Ld
            boolean r2 = r2.onSuggestionClick(r1)
            if (r2 != 0) goto Lc
            goto Ld
        Lc:
            return r3
        Ld:
            r2 = 0
            r0.launchSuggestion(r1, r3, r2)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r0.mSearchSrcTextView
            r1.setImeVisibility(r3)
            r0.dismissSuggestions()
            r1 = 1
            return r1
    }

    boolean onItemSelected(int r2) {
            r1 = this;
            androidx.appcompat.widget.SearchView$OnSuggestionListener r0 = r1.mOnSuggestionListener
            if (r0 == 0) goto Ld
            boolean r0 = r0.onSuggestionSelect(r2)
            if (r0 != 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            return r2
        Ld:
            r1.rewriteQueryFromSuggestion(r2)
            r2 = 1
            return r2
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L37
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r0.mSearchSrcTextView
            android.graphics.Rect r2 = r0.mSearchSrcTextViewBounds
            r0.getChildBoundsWithinSearchView(r1, r2)
            android.graphics.Rect r1 = r0.mSearchSrtTextViewBoundsExpanded
            android.graphics.Rect r2 = r0.mSearchSrcTextViewBounds
            int r2 = r2.left
            android.graphics.Rect r4 = r0.mSearchSrcTextViewBounds
            int r4 = r4.right
            int r5 = r5 - r3
            r3 = 0
            r1.set(r2, r3, r4, r5)
            androidx.appcompat.widget.SearchView$UpdatableTouchDelegate r1 = r0.mTouchDelegate
            if (r1 != 0) goto L30
            androidx.appcompat.widget.SearchView$UpdatableTouchDelegate r1 = new androidx.appcompat.widget.SearchView$UpdatableTouchDelegate
            android.graphics.Rect r2 = r0.mSearchSrtTextViewBoundsExpanded
            android.graphics.Rect r3 = r0.mSearchSrcTextViewBounds
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = r0.mSearchSrcTextView
            r1.<init>(r2, r3, r4)
            r0.mTouchDelegate = r1
            r0.setTouchDelegate(r1)
            goto L37
        L30:
            android.graphics.Rect r2 = r0.mSearchSrtTextViewBoundsExpanded
            android.graphics.Rect r3 = r0.mSearchSrcTextViewBounds
            r1.setBounds(r2, r3)
        L37:
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.isIconified()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L30
            if (r0 == 0) goto L26
            if (r0 == r2) goto L1d
            goto L41
        L1d:
            int r0 = r3.mMaxWidth
            if (r0 <= 0) goto L41
            int r4 = java.lang.Math.min(r0, r4)
            goto L41
        L26:
            int r4 = r3.mMaxWidth
            if (r4 <= 0) goto L2b
            goto L41
        L2b:
            int r4 = r3.getPreferredWidth()
            goto L41
        L30:
            int r0 = r3.mMaxWidth
            if (r0 <= 0) goto L39
            int r4 = java.lang.Math.min(r0, r4)
            goto L41
        L39:
            int r0 = r3.getPreferredWidth()
            int r4 = java.lang.Math.min(r0, r4)
        L41:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L53
            if (r0 == 0) goto L4e
            goto L5b
        L4e:
            int r5 = r3.getPreferredHeight()
            goto L5b
        L53:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L5b:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
    }

    void onQueryRefine(java.lang.CharSequence r1) {
            r0 = this;
            r0.setQuery(r1)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.SearchView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.appcompat.widget.SearchView$SavedState r2 = (androidx.appcompat.widget.SearchView.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.isIconified
            r1.updateViewsVisibility(r2)
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.appcompat.widget.SearchView$SavedState r1 = new androidx.appcompat.widget.SearchView$SavedState
            r1.<init>(r0)
            boolean r0 = r2.isIconified()
            r1.isIconified = r0
            return r1
    }

    void onSearchClicked() {
            r2 = this;
            r0 = 0
            r2.updateViewsVisibility(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            r0.requestFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            r1 = 1
            r0.setImeVisibility(r1)
            android.view.View$OnClickListener r0 = r2.mOnSearchClickListener
            if (r0 == 0) goto L16
            r0.onClick(r2)
        L16:
            return
    }

    void onSubmitQuery() {
            r3 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L31
            int r1 = android.text.TextUtils.getTrimmedLength(r0)
            if (r1 <= 0) goto L31
            androidx.appcompat.widget.SearchView$OnQueryTextListener r1 = r3.mOnQueryChangeListener
            if (r1 == 0) goto L1c
            java.lang.String r2 = r0.toString()
            boolean r1 = r1.onQueryTextSubmit(r2)
            if (r1 != 0) goto L31
        L1c:
            android.app.SearchableInfo r1 = r3.mSearchable
            r2 = 0
            if (r1 == 0) goto L29
            r1 = 0
            java.lang.String r0 = r0.toString()
            r3.launchQuerySearch(r2, r1, r0)
        L29:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            r0.setImeVisibility(r2)
            r3.dismissSuggestions()
        L31:
            return
    }

    boolean onSuggestionsKey(android.view.View r2, int r3, android.view.KeyEvent r4) {
            r1 = this;
            android.app.SearchableInfo r2 = r1.mSearchable
            r0 = 0
            if (r2 != 0) goto L6
            return r0
        L6:
            androidx.cursoradapter.widget.CursorAdapter r2 = r1.mSuggestionsAdapter
            if (r2 != 0) goto Lb
            return r0
        Lb:
            int r2 = r4.getAction()
            if (r2 != 0) goto L63
            boolean r2 = r4.hasNoModifiers()
            if (r2 == 0) goto L63
            r2 = 66
            if (r3 == r2) goto L57
            r2 = 84
            if (r3 == r2) goto L57
            r2 = 61
            if (r3 != r2) goto L24
            goto L57
        L24:
            r2 = 21
            if (r3 == r2) goto L37
            r4 = 22
            if (r3 != r4) goto L2d
            goto L37
        L2d:
            r2 = 19
            if (r3 != r2) goto L63
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.mSearchSrcTextView
            r2.getListSelection()
            return r0
        L37:
            if (r3 != r2) goto L3b
            r2 = r0
            goto L41
        L3b:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.mSearchSrcTextView
            int r2 = r2.length()
        L41:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r1.mSearchSrcTextView
            r3.setSelection(r2)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.mSearchSrcTextView
            r2.setListSelection(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.mSearchSrcTextView
            r2.clearListSelection()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.mSearchSrcTextView
            r2.ensureImeVisible()
            r2 = 1
            return r2
        L57:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.mSearchSrcTextView
            int r2 = r2.getListSelection()
            r3 = 0
            boolean r2 = r1.onItemClicked(r2, r0, r3)
            return r2
        L63:
            return r0
    }

    void onTextChanged(java.lang.CharSequence r3) {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            android.text.Editable r0 = r0.getText()
            r2.mUserQuery = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            r2.updateSubmitButton(r0)
            r0 = r0 ^ 1
            r2.updateVoiceButton(r0)
            r2.updateCloseButton()
            r2.updateSubmitArea()
            androidx.appcompat.widget.SearchView$OnQueryTextListener r0 = r2.mOnQueryChangeListener
            if (r0 == 0) goto L31
            java.lang.CharSequence r0 = r2.mOldQueryText
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 != 0) goto L31
            androidx.appcompat.widget.SearchView$OnQueryTextListener r0 = r2.mOnQueryChangeListener
            java.lang.String r1 = r3.toString()
            r0.onQueryTextChange(r1)
        L31:
            java.lang.String r3 = r3.toString()
            r2.mOldQueryText = r3
            return
    }

    void onTextFocusChanged() {
            r1 = this;
            boolean r0 = r1.isIconified()
            r1.updateViewsVisibility(r0)
            r1.postUpdateFocusedState()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.mSearchSrcTextView
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L15
            r1.forceSuggestionQuery()
        L15:
            return
    }

    void onVoiceClicked() {
            r2 = this;
            android.app.SearchableInfo r0 = r2.mSearchable
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r0.getVoiceSearchLaunchWebSearch()     // Catch: android.content.ActivityNotFoundException -> L2d
            if (r1 == 0) goto L19
            android.content.Intent r1 = r2.mVoiceWebSearchIntent     // Catch: android.content.ActivityNotFoundException -> L2d
            android.content.Intent r0 = r2.createVoiceWebSearchIntent(r1, r0)     // Catch: android.content.ActivityNotFoundException -> L2d
            android.content.Context r1 = r2.getContext()     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L34
        L19:
            boolean r1 = r0.getVoiceSearchLaunchRecognizer()     // Catch: android.content.ActivityNotFoundException -> L2d
            if (r1 == 0) goto L34
            android.content.Intent r1 = r2.mVoiceAppSearchIntent     // Catch: android.content.ActivityNotFoundException -> L2d
            android.content.Intent r0 = r2.createVoiceAppSearchIntent(r1, r0)     // Catch: android.content.ActivityNotFoundException -> L2d
            android.content.Context r1 = r2.getContext()     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L34
        L2d:
            java.lang.String r0 = "SearchView"
            java.lang.String r1 = "Could not find voice search activity"
            android.util.Log.w(r0, r1)
        L34:
            return
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)
            r0.postUpdateFocusedState()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int r3, android.graphics.Rect r4) {
            r2 = this;
            boolean r0 = r2.mClearingFocus
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r2.isFocusable()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            boolean r0 = r2.isIconified()
            if (r0 != 0) goto L1f
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            boolean r3 = r0.requestFocus(r3, r4)
            if (r3 == 0) goto L1e
            r2.updateViewsVisibility(r1)
        L1e:
            return r3
        L1f:
            boolean r3 = super.requestFocus(r3, r4)
            return r3
    }

    public void setAppSearchData(android.os.Bundle r1) {
            r0 = this;
            r0.mAppSearchData = r1
            return
    }

    public void setIconified(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L6
            r0.onCloseClicked()
            goto L9
        L6:
            r0.onSearchClicked()
        L9:
            return
    }

    public void setIconifiedByDefault(boolean r2) {
            r1 = this;
            boolean r0 = r1.mIconifiedByDefault
            if (r0 != r2) goto L5
            return
        L5:
            r1.mIconifiedByDefault = r2
            r1.updateViewsVisibility(r2)
            r1.updateQueryHint()
            return
    }

    public void setImeOptions(int r2) {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.mSearchSrcTextView
            r0.setImeOptions(r2)
            return
    }

    public void setInputType(int r2) {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.mSearchSrcTextView
            r0.setInputType(r2)
            return
    }

    public void setMaxWidth(int r1) {
            r0 = this;
            r0.mMaxWidth = r1
            r0.requestLayout()
            return
    }

    public void setOnCloseListener(androidx.appcompat.widget.SearchView.OnCloseListener r1) {
            r0 = this;
            r0.mOnCloseListener = r1
            return
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener r1) {
            r0 = this;
            r0.mOnQueryTextFocusChangeListener = r1
            return
    }

    public void setOnQueryTextListener(androidx.appcompat.widget.SearchView.OnQueryTextListener r1) {
            r0 = this;
            r0.mOnQueryChangeListener = r1
            return
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.mOnSearchClickListener = r1
            return
    }

    public void setOnSuggestionListener(androidx.appcompat.widget.SearchView.OnSuggestionListener r1) {
            r0 = this;
            r0.mOnSuggestionListener = r1
            return
    }

    public void setQuery(java.lang.CharSequence r3, boolean r4) {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            r0.setText(r3)
            if (r3 == 0) goto L12
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            int r1 = r0.length()
            r0.setSelection(r1)
            r2.mUserQuery = r3
        L12:
            if (r4 == 0) goto L1d
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L1d
            r2.onSubmitQuery()
        L1d:
            return
    }

    public void setQueryHint(java.lang.CharSequence r1) {
            r0 = this;
            r0.mQueryHint = r1
            r0.updateQueryHint()
            return
    }

    public void setQueryRefinementEnabled(boolean r3) {
            r2 = this;
            r2.mQueryRefinement = r3
            androidx.cursoradapter.widget.CursorAdapter r0 = r2.mSuggestionsAdapter
            boolean r1 = r0 instanceof androidx.appcompat.widget.SuggestionsAdapter
            if (r1 == 0) goto L12
            androidx.appcompat.widget.SuggestionsAdapter r0 = (androidx.appcompat.widget.SuggestionsAdapter) r0
            if (r3 == 0) goto Le
            r3 = 2
            goto Lf
        Le:
            r3 = 1
        Lf:
            r0.setQueryRefinement(r3)
        L12:
            return
    }

    public void setSearchableInfo(android.app.SearchableInfo r2) {
            r1 = this;
            r1.mSearchable = r2
            if (r2 == 0) goto La
            r1.updateSearchAutoComplete()
            r1.updateQueryHint()
        La:
            boolean r2 = r1.hasVoiceSearch()
            r1.mVoiceButtonEnabled = r2
            if (r2 == 0) goto L19
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.mSearchSrcTextView
            java.lang.String r0 = "nm"
            r2.setPrivateImeOptions(r0)
        L19:
            boolean r2 = r1.isIconified()
            r1.updateViewsVisibility(r2)
            return
    }

    public void setSubmitButtonEnabled(boolean r1) {
            r0 = this;
            r0.mSubmitButtonEnabled = r1
            boolean r1 = r0.isIconified()
            r0.updateViewsVisibility(r1)
            return
    }

    public void setSuggestionsAdapter(androidx.cursoradapter.widget.CursorAdapter r2) {
            r1 = this;
            r1.mSuggestionsAdapter = r2
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.mSearchSrcTextView
            r0.setAdapter(r2)
            return
    }

    void updateFocusedState() {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lb
            int[] r0 = androidx.appcompat.widget.SearchView.FOCUSED_STATE_SET
            goto Ld
        Lb:
            int[] r0 = androidx.appcompat.widget.SearchView.EMPTY_STATE_SET
        Ld:
            android.view.View r1 = r2.mSearchPlate
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L18
            r1.setState(r0)
        L18:
            android.view.View r1 = r2.mSubmitArea
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L23
            r1.setState(r0)
        L23:
            r2.invalidate()
            return
    }
}
