package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ListPopupWindow implements androidx.appcompat.view.menu.ShowableListMenu {
    private static final boolean DEBUG = false;
    static final int EXPAND_LIST_TIMEOUT = 250;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    private static final java.lang.String TAG = "ListPopupWindow";
    public static final int WRAP_CONTENT = -2;
    private static java.lang.reflect.Method sGetMaxAvailableHeightMethod;
    private static java.lang.reflect.Method sSetClipToWindowEnabledMethod;
    private static java.lang.reflect.Method sSetEpicenterBoundsMethod;
    private android.widget.ListAdapter mAdapter;
    private android.content.Context mContext;
    private boolean mDropDownAlwaysVisible;
    private android.view.View mDropDownAnchorView;
    private int mDropDownGravity;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    androidx.appcompat.widget.DropDownListView mDropDownList;
    private android.graphics.drawable.Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private int mDropDownWindowLayoutType;
    private android.graphics.Rect mEpicenterBounds;
    private boolean mForceIgnoreOutsideTouch;
    final android.os.Handler mHandler;
    private final androidx.appcompat.widget.ListPopupWindow.ListSelectorHider mHideSelector;
    private android.widget.AdapterView.OnItemClickListener mItemClickListener;
    private android.widget.AdapterView.OnItemSelectedListener mItemSelectedListener;
    int mListItemExpandMaximum;
    private boolean mModal;
    private android.database.DataSetObserver mObserver;
    private boolean mOverlapAnchor;
    private boolean mOverlapAnchorSet;
    android.widget.PopupWindow mPopup;
    private int mPromptPosition;
    private android.view.View mPromptView;
    final androidx.appcompat.widget.ListPopupWindow.ResizePopupRunnable mResizePopupRunnable;
    private final androidx.appcompat.widget.ListPopupWindow.PopupScrollListener mScrollListener;
    private java.lang.Runnable mShowDropDownRunnable;
    private final android.graphics.Rect mTempRect;
    private final androidx.appcompat.widget.ListPopupWindow.PopupTouchInterceptor mTouchInterceptor;




    private class ListSelectorHider implements java.lang.Runnable {
        final /* synthetic */ androidx.appcompat.widget.ListPopupWindow this$0;

        ListSelectorHider(androidx.appcompat.widget.ListPopupWindow r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.widget.ListPopupWindow r0 = r1.this$0
                r0.clearListSelection()
                return
        }
    }

    private class PopupDataSetObserver extends android.database.DataSetObserver {
        final /* synthetic */ androidx.appcompat.widget.ListPopupWindow this$0;

        PopupDataSetObserver(androidx.appcompat.widget.ListPopupWindow r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r1 = this;
                androidx.appcompat.widget.ListPopupWindow r0 = r1.this$0
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto Ld
                androidx.appcompat.widget.ListPopupWindow r0 = r1.this$0
                r0.show()
            Ld:
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r1 = this;
                androidx.appcompat.widget.ListPopupWindow r0 = r1.this$0
                r0.dismiss()
                return
        }
    }

    private class PopupScrollListener implements android.widget.AbsListView.OnScrollListener {
        final /* synthetic */ androidx.appcompat.widget.ListPopupWindow this$0;

        PopupScrollListener(androidx.appcompat.widget.ListPopupWindow r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView r1, int r2) {
                r0 = this;
                r1 = 1
                if (r2 != r1) goto L27
                androidx.appcompat.widget.ListPopupWindow r1 = r0.this$0
                boolean r1 = r1.isInputMethodNotNeeded()
                if (r1 != 0) goto L27
                androidx.appcompat.widget.ListPopupWindow r1 = r0.this$0
                android.widget.PopupWindow r1 = r1.mPopup
                android.view.View r1 = r1.getContentView()
                if (r1 == 0) goto L27
                androidx.appcompat.widget.ListPopupWindow r1 = r0.this$0
                android.os.Handler r1 = r1.mHandler
                androidx.appcompat.widget.ListPopupWindow r2 = r0.this$0
                androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r2 = r2.mResizePopupRunnable
                r1.removeCallbacks(r2)
                androidx.appcompat.widget.ListPopupWindow r1 = r0.this$0
                androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r1 = r1.mResizePopupRunnable
                r1.run()
            L27:
                return
        }
    }

    private class PopupTouchInterceptor implements android.view.View.OnTouchListener {
        final /* synthetic */ androidx.appcompat.widget.ListPopupWindow this$0;

        PopupTouchInterceptor(androidx.appcompat.widget.ListPopupWindow r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
                r2 = this;
                int r3 = r4.getAction()
                float r0 = r4.getX()
                int r0 = (int) r0
                float r4 = r4.getY()
                int r4 = (int) r4
                if (r3 != 0) goto L46
                androidx.appcompat.widget.ListPopupWindow r1 = r2.this$0
                android.widget.PopupWindow r1 = r1.mPopup
                if (r1 == 0) goto L46
                androidx.appcompat.widget.ListPopupWindow r1 = r2.this$0
                android.widget.PopupWindow r1 = r1.mPopup
                boolean r1 = r1.isShowing()
                if (r1 == 0) goto L46
                if (r0 < 0) goto L46
                androidx.appcompat.widget.ListPopupWindow r1 = r2.this$0
                android.widget.PopupWindow r1 = r1.mPopup
                int r1 = r1.getWidth()
                if (r0 >= r1) goto L46
                if (r4 < 0) goto L46
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                android.widget.PopupWindow r0 = r0.mPopup
                int r0 = r0.getHeight()
                if (r4 >= r0) goto L46
                androidx.appcompat.widget.ListPopupWindow r3 = r2.this$0
                android.os.Handler r3 = r3.mHandler
                androidx.appcompat.widget.ListPopupWindow r4 = r2.this$0
                androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r4 = r4.mResizePopupRunnable
                r0 = 250(0xfa, double:1.235E-321)
                r3.postDelayed(r4, r0)
                goto L54
            L46:
                r4 = 1
                if (r3 != r4) goto L54
                androidx.appcompat.widget.ListPopupWindow r3 = r2.this$0
                android.os.Handler r3 = r3.mHandler
                androidx.appcompat.widget.ListPopupWindow r4 = r2.this$0
                androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r4 = r4.mResizePopupRunnable
                r3.removeCallbacks(r4)
            L54:
                r3 = 0
                return r3
        }
    }

    private class ResizePopupRunnable implements java.lang.Runnable {
        final /* synthetic */ androidx.appcompat.widget.ListPopupWindow this$0;

        ResizePopupRunnable(androidx.appcompat.widget.ListPopupWindow r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                androidx.appcompat.widget.DropDownListView r0 = r0.mDropDownList
                if (r0 == 0) goto L3d
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                androidx.appcompat.widget.DropDownListView r0 = r0.mDropDownList
                boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
                if (r0 == 0) goto L3d
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                androidx.appcompat.widget.DropDownListView r0 = r0.mDropDownList
                int r0 = r0.getCount()
                androidx.appcompat.widget.ListPopupWindow r1 = r2.this$0
                androidx.appcompat.widget.DropDownListView r1 = r1.mDropDownList
                int r1 = r1.getChildCount()
                if (r0 <= r1) goto L3d
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                androidx.appcompat.widget.DropDownListView r0 = r0.mDropDownList
                int r0 = r0.getChildCount()
                androidx.appcompat.widget.ListPopupWindow r1 = r2.this$0
                int r1 = r1.mListItemExpandMaximum
                if (r0 > r1) goto L3d
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                android.widget.PopupWindow r0 = r0.mPopup
                r1 = 2
                r0.setInputMethodMode(r1)
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                r0.show()
            L3d:
                return
        }
    }

    static {
            java.lang.String r0 = "ListPopupWindow"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 > r2) goto L36
            r1 = 0
            r2 = 1
            java.lang.Class<android.widget.PopupWindow> r3 = android.widget.PopupWindow.class
            java.lang.String r4 = "setClipToScreenEnabled"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L1b
            r5[r1] = r6     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L1b
            androidx.appcompat.widget.ListPopupWindow.sSetClipToWindowEnabledMethod = r3     // Catch: java.lang.NoSuchMethodException -> L1b
            goto L20
        L1b:
            java.lang.String r3 = "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r0, r3)
        L20:
            java.lang.Class<android.widget.PopupWindow> r3 = android.widget.PopupWindow.class
            java.lang.String r4 = "setEpicenterBounds"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L31
            java.lang.Class<android.graphics.Rect> r5 = android.graphics.Rect.class
            r2[r1] = r5     // Catch: java.lang.NoSuchMethodException -> L31
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.NoSuchMethodException -> L31
            androidx.appcompat.widget.ListPopupWindow.sSetEpicenterBoundsMethod = r1     // Catch: java.lang.NoSuchMethodException -> L31
            goto L36
        L31:
            java.lang.String r1 = "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."
            android.util.Log.i(r0, r1)
        L36:
            return
    }

    public ListPopupWindow(android.content.Context r3) {
            r2 = this;
            r0 = 0
            int r1 = androidx.appcompat.C0015R.attr.listPopupWindowStyle
            r2.<init>(r3, r0, r1)
            return
    }

    public ListPopupWindow(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.C0015R.attr.listPopupWindowStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ListPopupWindow(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public ListPopupWindow(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r0 = -2
            r3.mDropDownHeight = r0
            r3.mDropDownWidth = r0
            r0 = 1002(0x3ea, float:1.404E-42)
            r3.mDropDownWindowLayoutType = r0
            r0 = 0
            r3.mDropDownGravity = r0
            r3.mDropDownAlwaysVisible = r0
            r3.mForceIgnoreOutsideTouch = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3.mListItemExpandMaximum = r1
            r3.mPromptPosition = r0
            androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r1 = new androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable
            r1.<init>(r3)
            r3.mResizePopupRunnable = r1
            androidx.appcompat.widget.ListPopupWindow$PopupTouchInterceptor r1 = new androidx.appcompat.widget.ListPopupWindow$PopupTouchInterceptor
            r1.<init>(r3)
            r3.mTouchInterceptor = r1
            androidx.appcompat.widget.ListPopupWindow$PopupScrollListener r1 = new androidx.appcompat.widget.ListPopupWindow$PopupScrollListener
            r1.<init>(r3)
            r3.mScrollListener = r1
            androidx.appcompat.widget.ListPopupWindow$ListSelectorHider r1 = new androidx.appcompat.widget.ListPopupWindow$ListSelectorHider
            r1.<init>(r3)
            r3.mHideSelector = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.mTempRect = r1
            r3.mContext = r4
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = r4.getMainLooper()
            r1.<init>(r2)
            r3.mHandler = r1
            int[] r1 = androidx.appcompat.C0015R.styleable.ListPopupWindow
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r5, r1, r6, r7)
            int r2 = androidx.appcompat.C0015R.styleable.ListPopupWindow_android_dropDownHorizontalOffset
            int r2 = r1.getDimensionPixelOffset(r2, r0)
            r3.mDropDownHorizontalOffset = r2
            int r2 = androidx.appcompat.C0015R.styleable.ListPopupWindow_android_dropDownVerticalOffset
            int r0 = r1.getDimensionPixelOffset(r2, r0)
            r3.mDropDownVerticalOffset = r0
            r2 = 1
            if (r0 == 0) goto L65
            r3.mDropDownVerticalOffsetSet = r2
        L65:
            r1.recycle()
            androidx.appcompat.widget.AppCompatPopupWindow r0 = new androidx.appcompat.widget.AppCompatPopupWindow
            r0.<init>(r4, r5, r6, r7)
            r3.mPopup = r0
            r0.setInputMethodMode(r2)
            return
    }

    private int buildDropDown() {
            r12 = this;
            androidx.appcompat.widget.DropDownListView r0 = r12.mDropDownList
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lbc
            android.content.Context r0 = r12.mContext
            androidx.appcompat.widget.ListPopupWindow$2 r5 = new androidx.appcompat.widget.ListPopupWindow$2
            r5.<init>(r12)
            r12.mShowDropDownRunnable = r5
            boolean r5 = r12.mModal
            r5 = r5 ^ r3
            androidx.appcompat.widget.DropDownListView r5 = r12.createDropDownListView(r0, r5)
            r12.mDropDownList = r5
            android.graphics.drawable.Drawable r6 = r12.mDropDownListHighlight
            if (r6 == 0) goto L22
            r5.setSelector(r6)
        L22:
            androidx.appcompat.widget.DropDownListView r5 = r12.mDropDownList
            android.widget.ListAdapter r6 = r12.mAdapter
            r5.setAdapter(r6)
            androidx.appcompat.widget.DropDownListView r5 = r12.mDropDownList
            android.widget.AdapterView$OnItemClickListener r6 = r12.mItemClickListener
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.DropDownListView r5 = r12.mDropDownList
            r5.setFocusable(r3)
            androidx.appcompat.widget.DropDownListView r5 = r12.mDropDownList
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.DropDownListView r5 = r12.mDropDownList
            androidx.appcompat.widget.ListPopupWindow$3 r6 = new androidx.appcompat.widget.ListPopupWindow$3
            r6.<init>(r12)
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.DropDownListView r5 = r12.mDropDownList
            androidx.appcompat.widget.ListPopupWindow$PopupScrollListener r6 = r12.mScrollListener
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.mItemSelectedListener
            if (r5 == 0) goto L54
            androidx.appcompat.widget.DropDownListView r6 = r12.mDropDownList
            r6.setOnItemSelectedListener(r5)
        L54:
            androidx.appcompat.widget.DropDownListView r5 = r12.mDropDownList
            android.view.View r6 = r12.mPromptView
            if (r6 == 0) goto Lb5
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.mPromptPosition
            if (r8 == 0) goto L8d
            if (r8 == r3) goto L86
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "Invalid hint position "
            r0.<init>(r5)
            int r5 = r12.mPromptPosition
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L93
        L86:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L93
        L8d:
            r7.addView(r6)
            r7.addView(r5, r0)
        L93:
            int r0 = r12.mDropDownWidth
            if (r0 < 0) goto L99
            r5 = r1
            goto L9b
        L99:
            r0 = r4
            r5 = r0
        L9b:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto Lb6
        Lb5:
            r0 = r4
        Lb6:
            android.widget.PopupWindow r6 = r12.mPopup
            r6.setContentView(r5)
            goto Lda
        Lbc:
            android.widget.PopupWindow r0 = r12.mPopup
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.mPromptView
            if (r0 == 0) goto Ld9
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto Lda
        Ld9:
            r0 = r4
        Lda:
            android.widget.PopupWindow r5 = r12.mPopup
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto Lfc
            android.graphics.Rect r6 = r12.mTempRect
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.mTempRect
            int r5 = r5.top
            android.graphics.Rect r6 = r12.mTempRect
            int r6 = r6.bottom
            int r5 = r5 + r6
            boolean r6 = r12.mDropDownVerticalOffsetSet
            if (r6 != 0) goto L102
            android.graphics.Rect r6 = r12.mTempRect
            int r6 = r6.top
            int r6 = -r6
            r12.mDropDownVerticalOffset = r6
            goto L102
        Lfc:
            android.graphics.Rect r5 = r12.mTempRect
            r5.setEmpty()
            r5 = r4
        L102:
            android.widget.PopupWindow r6 = r12.mPopup
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L10c
            goto L10d
        L10c:
            r3 = r4
        L10d:
            android.view.View r4 = r12.getAnchorView()
            int r6 = r12.mDropDownVerticalOffset
            int r3 = r12.getMaxAvailableHeight(r4, r6, r3)
            boolean r4 = r12.mDropDownAlwaysVisible
            if (r4 != 0) goto L182
            int r4 = r12.mDropDownHeight
            if (r4 != r2) goto L120
            goto L182
        L120:
            int r4 = r12.mDropDownWidth
            r6 = -2
            if (r4 == r6) goto L149
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L12e
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L163
        L12e:
            android.content.Context r2 = r12.mContext
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.mTempRect
            int r4 = r4.left
            android.graphics.Rect r6 = r12.mTempRect
            int r6 = r6.right
            int r4 = r4 + r6
            int r2 = r2 - r4
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L163
        L149:
            android.content.Context r2 = r12.mContext
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.mTempRect
            int r4 = r4.left
            android.graphics.Rect r6 = r12.mTempRect
            int r6 = r6.right
            int r4 = r4 + r6
            int r2 = r2 - r4
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L163:
            r7 = r1
            androidx.appcompat.widget.DropDownListView r6 = r12.mDropDownList
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.measureHeightOfChildrenCompat(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L180
            androidx.appcompat.widget.DropDownListView r2 = r12.mDropDownList
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.DropDownListView r3 = r12.mDropDownList
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L180:
            int r1 = r1 + r0
            return r1
        L182:
            int r3 = r3 + r5
            return r3
    }

    private int getMaxAvailableHeight(android.view.View r2, int r3, boolean r4) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            int r2 = r0.getMaxAvailableHeight(r2, r3, r4)
            return r2
    }

    private static boolean isConfirmKey(int r1) {
            r0 = 66
            if (r1 == r0) goto Lb
            r0 = 23
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    private void removePromptView() {
            r2 = this;
            android.view.View r0 = r2.mPromptView
            if (r0 == 0) goto L13
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L13
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r2.mPromptView
            r0.removeView(r1)
        L13:
            return
    }

    private void setPopupClipToScreenEnabled(boolean r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 > r1) goto L22
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ListPopupWindow.sSetClipToWindowEnabledMethod
            if (r0 == 0) goto L27
            android.widget.PopupWindow r1 = r4.mPopup     // Catch: java.lang.Exception -> L1a
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L1a
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.Exception -> L1a
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L1a
            goto L27
        L1a:
            java.lang.String r5 = "ListPopupWindow"
            java.lang.String r0 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r5, r0)
            goto L27
        L22:
            android.widget.PopupWindow r0 = r4.mPopup
            r0.setIsClippedToScreen(r5)
        L27:
            return
    }

    public void clearListSelection() {
            r2 = this;
            androidx.appcompat.widget.DropDownListView r0 = r2.mDropDownList
            if (r0 == 0) goto Lb
            r1 = 1
            r0.setListSelectionHidden(r1)
            r0.requestLayout()
        Lb:
            return
    }

    public android.view.View.OnTouchListener createDragToOpenListener(android.view.View r2) {
            r1 = this;
            androidx.appcompat.widget.ListPopupWindow$1 r0 = new androidx.appcompat.widget.ListPopupWindow$1
            r0.<init>(r1, r2)
            return r0
    }

    androidx.appcompat.widget.DropDownListView createDropDownListView(android.content.Context r2, boolean r3) {
            r1 = this;
            androidx.appcompat.widget.DropDownListView r0 = new androidx.appcompat.widget.DropDownListView
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
            r2 = this;
            android.widget.PopupWindow r0 = r2.mPopup
            r0.dismiss()
            r2.removePromptView()
            android.widget.PopupWindow r0 = r2.mPopup
            r1 = 0
            r0.setContentView(r1)
            r2.mDropDownList = r1
            android.os.Handler r0 = r2.mHandler
            androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r1 = r2.mResizePopupRunnable
            r0.removeCallbacks(r1)
            return
    }

    public android.view.View getAnchorView() {
            r1 = this;
            android.view.View r0 = r1.mDropDownAnchorView
            return r0
    }

    public int getAnimationStyle() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            int r0 = r0.getAnimationStyle()
            return r0
    }

    public android.graphics.drawable.Drawable getBackground() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
    }

    public android.graphics.Rect getEpicenterBounds() {
            r2 = this;
            android.graphics.Rect r0 = r2.mEpicenterBounds
            if (r0 == 0) goto Lc
            android.graphics.Rect r0 = new android.graphics.Rect
            android.graphics.Rect r1 = r2.mEpicenterBounds
            r0.<init>(r1)
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.mDropDownHeight
            return r0
    }

    public int getHorizontalOffset() {
            r1 = this;
            int r0 = r1.mDropDownHorizontalOffset
            return r0
    }

    public int getInputMethodMode() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            int r0 = r0.getInputMethodMode()
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public android.widget.ListView getListView() {
            r1 = this;
            androidx.appcompat.widget.DropDownListView r0 = r1.mDropDownList
            return r0
    }

    public int getPromptPosition() {
            r1 = this;
            int r0 = r1.mPromptPosition
            return r0
    }

    public java.lang.Object getSelectedItem() {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            androidx.appcompat.widget.DropDownListView r0 = r1.mDropDownList
            java.lang.Object r0 = r0.getSelectedItem()
            return r0
    }

    public long getSelectedItemId() {
            r2 = this;
            boolean r0 = r2.isShowing()
            if (r0 != 0) goto L9
            r0 = -9223372036854775808
            return r0
        L9:
            androidx.appcompat.widget.DropDownListView r0 = r2.mDropDownList
            long r0 = r0.getSelectedItemId()
            return r0
    }

    public int getSelectedItemPosition() {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 != 0) goto L8
            r0 = -1
            return r0
        L8:
            androidx.appcompat.widget.DropDownListView r0 = r1.mDropDownList
            int r0 = r0.getSelectedItemPosition()
            return r0
    }

    public android.view.View getSelectedView() {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            androidx.appcompat.widget.DropDownListView r0 = r1.mDropDownList
            android.view.View r0 = r0.getSelectedView()
            return r0
    }

    public int getSoftInputMode() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            int r0 = r0.getSoftInputMode()
            return r0
    }

    public int getVerticalOffset() {
            r1 = this;
            boolean r0 = r1.mDropDownVerticalOffsetSet
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r1.mDropDownVerticalOffset
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.mDropDownWidth
            return r0
    }

    public boolean isDropDownAlwaysVisible() {
            r1 = this;
            boolean r0 = r1.mDropDownAlwaysVisible
            return r0
    }

    public boolean isInputMethodNotNeeded() {
            r2 = this;
            android.widget.PopupWindow r0 = r2.mPopup
            int r0 = r0.getInputMethodMode()
            r1 = 2
            if (r0 != r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public boolean isModal() {
            r1 = this;
            boolean r0 = r1.mModal
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            boolean r0 = r0.isShowing()
            return r0
    }

    public boolean onKeyDown(int r10, android.view.KeyEvent r11) {
            r9 = this;
            boolean r0 = r9.isShowing()
            r1 = 0
            if (r0 == 0) goto La5
            r0 = 62
            if (r10 == r0) goto La5
            androidx.appcompat.widget.DropDownListView r0 = r9.mDropDownList
            int r0 = r0.getSelectedItemPosition()
            if (r0 >= 0) goto L19
            boolean r0 = isConfirmKey(r10)
            if (r0 != 0) goto La5
        L19:
            androidx.appcompat.widget.DropDownListView r0 = r9.mDropDownList
            int r0 = r0.getSelectedItemPosition()
            android.widget.PopupWindow r2 = r9.mPopup
            boolean r2 = r2.isAboveAnchor()
            r3 = 1
            r2 = r2 ^ r3
            android.widget.ListAdapter r4 = r9.mAdapter
            if (r4 == 0) goto L4d
            boolean r5 = r4.areAllItemsEnabled()
            if (r5 == 0) goto L33
            r6 = r1
            goto L39
        L33:
            androidx.appcompat.widget.DropDownListView r6 = r9.mDropDownList
            int r6 = r6.lookForSelectablePosition(r1, r3)
        L39:
            if (r5 == 0) goto L41
            int r4 = r4.getCount()
            int r4 = r4 - r3
            goto L52
        L41:
            androidx.appcompat.widget.DropDownListView r5 = r9.mDropDownList
            int r4 = r4.getCount()
            int r4 = r4 - r3
            int r4 = r5.lookForSelectablePosition(r4, r1)
            goto L52
        L4d:
            r6 = 2147483647(0x7fffffff, float:NaN)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
        L52:
            r5 = 19
            if (r2 == 0) goto L5a
            if (r10 != r5) goto L5a
            if (r0 <= r6) goto L62
        L5a:
            r7 = 20
            if (r2 != 0) goto L6e
            if (r10 != r7) goto L6e
            if (r0 < r4) goto L6e
        L62:
            r9.clearListSelection()
            android.widget.PopupWindow r10 = r9.mPopup
            r10.setInputMethodMode(r3)
            r9.show()
            return r3
        L6e:
            androidx.appcompat.widget.DropDownListView r8 = r9.mDropDownList
            r8.setListSelectionHidden(r1)
            androidx.appcompat.widget.DropDownListView r8 = r9.mDropDownList
            boolean r11 = r8.onKeyDown(r10, r11)
            if (r11 == 0) goto L97
            android.widget.PopupWindow r11 = r9.mPopup
            r0 = 2
            r11.setInputMethodMode(r0)
            androidx.appcompat.widget.DropDownListView r11 = r9.mDropDownList
            r11.requestFocusFromTouch()
            r9.show()
            if (r10 == r5) goto L96
            if (r10 == r7) goto L96
            r11 = 23
            if (r10 == r11) goto L96
            r11 = 66
            if (r10 == r11) goto L96
            goto La5
        L96:
            return r3
        L97:
            if (r2 == 0) goto L9e
            if (r10 != r7) goto L9e
            if (r0 != r4) goto La5
            return r3
        L9e:
            if (r2 != 0) goto La5
            if (r10 != r5) goto La5
            if (r0 != r6) goto La5
            return r3
        La5:
            return r1
    }

    public boolean onKeyPreIme(int r3, android.view.KeyEvent r4) {
            r2 = this;
            r0 = 4
            if (r3 != r0) goto L41
            boolean r3 = r2.isShowing()
            if (r3 == 0) goto L41
            android.view.View r3 = r2.mDropDownAnchorView
            int r0 = r4.getAction()
            r1 = 1
            if (r0 != 0) goto L22
            int r0 = r4.getRepeatCount()
            if (r0 != 0) goto L22
            android.view.KeyEvent$DispatcherState r3 = r3.getKeyDispatcherState()
            if (r3 == 0) goto L21
            r3.startTracking(r4, r2)
        L21:
            return r1
        L22:
            int r0 = r4.getAction()
            if (r0 != r1) goto L41
            android.view.KeyEvent$DispatcherState r3 = r3.getKeyDispatcherState()
            if (r3 == 0) goto L31
            r3.handleUpEvent(r4)
        L31:
            boolean r3 = r4.isTracking()
            if (r3 == 0) goto L41
            boolean r3 = r4.isCanceled()
            if (r3 != 0) goto L41
            r2.dismiss()
            return r1
        L41:
            r3 = 0
            return r3
    }

    public boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L20
            androidx.appcompat.widget.DropDownListView r0 = r1.mDropDownList
            int r0 = r0.getSelectedItemPosition()
            if (r0 < 0) goto L20
            androidx.appcompat.widget.DropDownListView r0 = r1.mDropDownList
            boolean r3 = r0.onKeyUp(r2, r3)
            if (r3 == 0) goto L1f
            boolean r2 = isConfirmKey(r2)
            if (r2 == 0) goto L1f
            r1.dismiss()
        L1f:
            return r3
        L20:
            r2 = 0
            return r2
    }

    public boolean performItemClick(int r8) {
            r7 = this;
            boolean r0 = r7.isShowing()
            if (r0 == 0) goto L26
            android.widget.AdapterView$OnItemClickListener r0 = r7.mItemClickListener
            if (r0 == 0) goto L24
            androidx.appcompat.widget.DropDownListView r2 = r7.mDropDownList
            int r0 = r2.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r3 = r2.getChildAt(r0)
            android.widget.ListAdapter r0 = r2.getAdapter()
            android.widget.AdapterView$OnItemClickListener r1 = r7.mItemClickListener
            long r5 = r0.getItemId(r8)
            r4 = r8
            r1.onItemClick(r2, r3, r4, r5)
        L24:
            r8 = 1
            return r8
        L26:
            r8 = 0
            return r8
    }

    public void postShow() {
            r2 = this;
            android.os.Handler r0 = r2.mHandler
            java.lang.Runnable r1 = r2.mShowDropDownRunnable
            r0.post(r1)
            return
    }

    public void setAdapter(android.widget.ListAdapter r3) {
            r2 = this;
            android.database.DataSetObserver r0 = r2.mObserver
            if (r0 != 0) goto Lc
            androidx.appcompat.widget.ListPopupWindow$PopupDataSetObserver r0 = new androidx.appcompat.widget.ListPopupWindow$PopupDataSetObserver
            r0.<init>(r2)
            r2.mObserver = r0
            goto L13
        Lc:
            android.widget.ListAdapter r1 = r2.mAdapter
            if (r1 == 0) goto L13
            r1.unregisterDataSetObserver(r0)
        L13:
            r2.mAdapter = r3
            if (r3 == 0) goto L1c
            android.database.DataSetObserver r0 = r2.mObserver
            r3.registerDataSetObserver(r0)
        L1c:
            androidx.appcompat.widget.DropDownListView r3 = r2.mDropDownList
            if (r3 == 0) goto L25
            android.widget.ListAdapter r0 = r2.mAdapter
            r3.setAdapter(r0)
        L25:
            return
    }

    public void setAnchorView(android.view.View r1) {
            r0 = this;
            r0.mDropDownAnchorView = r1
            return
    }

    public void setAnimationStyle(int r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setAnimationStyle(r2)
            return
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setBackgroundDrawable(r2)
            return
    }

    public void setContentWidth(int r3) {
            r2 = this;
            android.widget.PopupWindow r0 = r2.mPopup
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L1a
            android.graphics.Rect r1 = r2.mTempRect
            r0.getPadding(r1)
            android.graphics.Rect r0 = r2.mTempRect
            int r0 = r0.left
            android.graphics.Rect r1 = r2.mTempRect
            int r1 = r1.right
            int r0 = r0 + r1
            int r0 = r0 + r3
            r2.mDropDownWidth = r0
            goto L1d
        L1a:
            r2.setWidth(r3)
        L1d:
            return
    }

    public void setDropDownAlwaysVisible(boolean r1) {
            r0 = this;
            r0.mDropDownAlwaysVisible = r1
            return
    }

    public void setDropDownGravity(int r1) {
            r0 = this;
            r0.mDropDownGravity = r1
            return
    }

    public void setEpicenterBounds(android.graphics.Rect r2) {
            r1 = this;
            if (r2 == 0) goto L8
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r1.mEpicenterBounds = r0
            return
    }

    public void setForceIgnoreOutsideTouch(boolean r1) {
            r0 = this;
            r0.mForceIgnoreOutsideTouch = r1
            return
    }

    public void setHeight(int r2) {
            r1 = this;
            if (r2 >= 0) goto L11
            r0 = -2
            if (r0 == r2) goto L11
            r0 = -1
            if (r0 != r2) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT."
            r2.<init>(r0)
            throw r2
        L11:
            r1.mDropDownHeight = r2
            return
    }

    public void setHorizontalOffset(int r1) {
            r0 = this;
            r0.mDropDownHorizontalOffset = r1
            return
    }

    public void setInputMethodMode(int r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setInputMethodMode(r2)
            return
    }

    void setListItemExpandMax(int r1) {
            r0 = this;
            r0.mListItemExpandMaximum = r1
            return
    }

    public void setListSelector(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mDropDownListHighlight = r1
            return
    }

    public void setModal(boolean r2) {
            r1 = this;
            r1.mModal = r2
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setFocusable(r2)
            return
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setOnDismissListener(r2)
            return
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener r1) {
            r0 = this;
            r0.mItemClickListener = r1
            return
    }

    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener r1) {
            r0 = this;
            r0.mItemSelectedListener = r1
            return
    }

    public void setOverlapAnchor(boolean r2) {
            r1 = this;
            r0 = 1
            r1.mOverlapAnchorSet = r0
            r1.mOverlapAnchor = r2
            return
    }

    public void setPromptPosition(int r1) {
            r0 = this;
            r0.mPromptPosition = r1
            return
    }

    public void setPromptView(android.view.View r2) {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L9
            r1.removePromptView()
        L9:
            r1.mPromptView = r2
            if (r0 == 0) goto L10
            r1.show()
        L10:
            return
    }

    public void setSelection(int r3) {
            r2 = this;
            androidx.appcompat.widget.DropDownListView r0 = r2.mDropDownList
            boolean r1 = r2.isShowing()
            if (r1 == 0) goto L1b
            if (r0 == 0) goto L1b
            r1 = 0
            r0.setListSelectionHidden(r1)
            r0.setSelection(r3)
            int r1 = r0.getChoiceMode()
            if (r1 == 0) goto L1b
            r1 = 1
            r0.setItemChecked(r3, r1)
        L1b:
            return
    }

    public void setSoftInputMode(int r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setSoftInputMode(r2)
            return
    }

    public void setVerticalOffset(int r1) {
            r0 = this;
            r0.mDropDownVerticalOffset = r1
            r1 = 1
            r0.mDropDownVerticalOffsetSet = r1
            return
    }

    public void setWidth(int r1) {
            r0 = this;
            r0.mDropDownWidth = r1
            return
    }

    public void setWindowLayoutType(int r1) {
            r0 = this;
            r0.mDropDownWindowLayoutType = r1
            return
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
            r13 = this;
            int r0 = r13.buildDropDown()
            boolean r1 = r13.isInputMethodNotNeeded()
            android.widget.PopupWindow r2 = r13.mPopup
            int r3 = r13.mDropDownWindowLayoutType
            androidx.core.widget.PopupWindowCompat.setWindowLayoutType(r2, r3)
            android.widget.PopupWindow r2 = r13.mPopup
            boolean r2 = r2.isShowing()
            r3 = 1
            r4 = -2
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L90
            android.view.View r2 = r13.getAnchorView()
            boolean r2 = androidx.core.view.ViewCompat.isAttachedToWindow(r2)
            if (r2 != 0) goto L26
            return
        L26:
            int r2 = r13.mDropDownWidth
            if (r2 != r6) goto L2c
            r2 = r6
            goto L36
        L2c:
            if (r2 != r4) goto L36
            android.view.View r2 = r13.getAnchorView()
            int r2 = r2.getWidth()
        L36:
            int r7 = r13.mDropDownHeight
            if (r7 != r6) goto L64
            if (r1 == 0) goto L3d
            goto L3e
        L3d:
            r0 = r6
        L3e:
            if (r1 == 0) goto L52
            android.widget.PopupWindow r1 = r13.mPopup
            int r4 = r13.mDropDownWidth
            if (r4 != r6) goto L48
            r4 = r6
            goto L49
        L48:
            r4 = r5
        L49:
            r1.setWidth(r4)
            android.widget.PopupWindow r1 = r13.mPopup
            r1.setHeight(r5)
            goto L68
        L52:
            android.widget.PopupWindow r1 = r13.mPopup
            int r4 = r13.mDropDownWidth
            if (r4 != r6) goto L5a
            r4 = r6
            goto L5b
        L5a:
            r4 = r5
        L5b:
            r1.setWidth(r4)
            android.widget.PopupWindow r1 = r13.mPopup
            r1.setHeight(r6)
            goto L68
        L64:
            if (r7 != r4) goto L67
            goto L68
        L67:
            r0 = r7
        L68:
            android.widget.PopupWindow r1 = r13.mPopup
            boolean r4 = r13.mForceIgnoreOutsideTouch
            if (r4 != 0) goto L73
            boolean r4 = r13.mDropDownAlwaysVisible
            if (r4 != 0) goto L73
            goto L74
        L73:
            r3 = r5
        L74:
            r1.setOutsideTouchable(r3)
            android.widget.PopupWindow r7 = r13.mPopup
            android.view.View r8 = r13.getAnchorView()
            int r9 = r13.mDropDownHorizontalOffset
            int r10 = r13.mDropDownVerticalOffset
            if (r2 >= 0) goto L85
            r11 = r6
            goto L86
        L85:
            r11 = r2
        L86:
            if (r0 >= 0) goto L8a
            r12 = r6
            goto L8b
        L8a:
            r12 = r0
        L8b:
            r7.update(r8, r9, r10, r11, r12)
            goto L12d
        L90:
            int r1 = r13.mDropDownWidth
            if (r1 != r6) goto L96
            r1 = r6
            goto La0
        L96:
            if (r1 != r4) goto La0
            android.view.View r1 = r13.getAnchorView()
            int r1 = r1.getWidth()
        La0:
            int r2 = r13.mDropDownHeight
            if (r2 != r6) goto La6
            r0 = r6
            goto Laa
        La6:
            if (r2 != r4) goto La9
            goto Laa
        La9:
            r0 = r2
        Laa:
            android.widget.PopupWindow r2 = r13.mPopup
            r2.setWidth(r1)
            android.widget.PopupWindow r1 = r13.mPopup
            r1.setHeight(r0)
            r13.setPopupClipToScreenEnabled(r3)
            android.widget.PopupWindow r0 = r13.mPopup
            boolean r1 = r13.mForceIgnoreOutsideTouch
            if (r1 != 0) goto Lc3
            boolean r1 = r13.mDropDownAlwaysVisible
            if (r1 != 0) goto Lc3
            r1 = r3
            goto Lc4
        Lc3:
            r1 = r5
        Lc4:
            r0.setOutsideTouchable(r1)
            android.widget.PopupWindow r0 = r13.mPopup
            androidx.appcompat.widget.ListPopupWindow$PopupTouchInterceptor r1 = r13.mTouchInterceptor
            r0.setTouchInterceptor(r1)
            boolean r0 = r13.mOverlapAnchorSet
            if (r0 == 0) goto Ld9
            android.widget.PopupWindow r0 = r13.mPopup
            boolean r1 = r13.mOverlapAnchor
            androidx.core.widget.PopupWindowCompat.setOverlapAnchor(r0, r1)
        Ld9:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 > r1) goto Lf8
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ListPopupWindow.sSetEpicenterBoundsMethod
            if (r0 == 0) goto Lff
            android.widget.PopupWindow r1 = r13.mPopup     // Catch: java.lang.Exception -> Lef
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> Lef
            android.graphics.Rect r3 = r13.mEpicenterBounds     // Catch: java.lang.Exception -> Lef
            r2[r5] = r3     // Catch: java.lang.Exception -> Lef
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> Lef
            goto Lff
        Lef:
            r0 = move-exception
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r2 = "Could not invoke setEpicenterBounds on PopupWindow"
            android.util.Log.e(r1, r2, r0)
            goto Lff
        Lf8:
            android.widget.PopupWindow r0 = r13.mPopup
            android.graphics.Rect r1 = r13.mEpicenterBounds
            r0.setEpicenterBounds(r1)
        Lff:
            android.widget.PopupWindow r0 = r13.mPopup
            android.view.View r1 = r13.getAnchorView()
            int r2 = r13.mDropDownHorizontalOffset
            int r3 = r13.mDropDownVerticalOffset
            int r4 = r13.mDropDownGravity
            androidx.core.widget.PopupWindowCompat.showAsDropDown(r0, r1, r2, r3, r4)
            androidx.appcompat.widget.DropDownListView r0 = r13.mDropDownList
            r0.setSelection(r6)
            boolean r0 = r13.mModal
            if (r0 == 0) goto L11f
            androidx.appcompat.widget.DropDownListView r0 = r13.mDropDownList
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L122
        L11f:
            r13.clearListSelection()
        L122:
            boolean r0 = r13.mModal
            if (r0 != 0) goto L12d
            android.os.Handler r0 = r13.mHandler
            androidx.appcompat.widget.ListPopupWindow$ListSelectorHider r1 = r13.mHideSelector
            r0.post(r1)
        L12d:
            return
    }
}
