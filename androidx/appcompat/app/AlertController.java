package androidx.appcompat.app;

/* loaded from: classes.dex */
class AlertController {
    android.widget.ListAdapter mAdapter;
    private int mAlertDialogLayout;
    private final android.view.View.OnClickListener mButtonHandler;
    private final int mButtonIconDimen;
    android.widget.Button mButtonNegative;
    private android.graphics.drawable.Drawable mButtonNegativeIcon;
    android.os.Message mButtonNegativeMessage;
    private java.lang.CharSequence mButtonNegativeText;
    android.widget.Button mButtonNeutral;
    private android.graphics.drawable.Drawable mButtonNeutralIcon;
    android.os.Message mButtonNeutralMessage;
    private java.lang.CharSequence mButtonNeutralText;
    private int mButtonPanelLayoutHint;
    private int mButtonPanelSideLayout;
    android.widget.Button mButtonPositive;
    private android.graphics.drawable.Drawable mButtonPositiveIcon;
    android.os.Message mButtonPositiveMessage;
    private java.lang.CharSequence mButtonPositiveText;
    int mCheckedItem;
    private final android.content.Context mContext;
    private android.view.View mCustomTitleView;
    final androidx.appcompat.app.AppCompatDialog mDialog;
    android.os.Handler mHandler;
    private android.graphics.drawable.Drawable mIcon;
    private int mIconId;
    private android.widget.ImageView mIconView;
    int mListItemLayout;
    int mListLayout;
    android.widget.ListView mListView;
    private java.lang.CharSequence mMessage;
    private android.widget.TextView mMessageView;
    int mMultiChoiceItemLayout;
    androidx.core.widget.NestedScrollView mScrollView;
    private boolean mShowTitle;
    int mSingleChoiceItemLayout;
    private java.lang.CharSequence mTitle;
    private android.widget.TextView mTitleView;
    private android.view.View mView;
    private int mViewLayoutResId;
    private int mViewSpacingBottom;
    private int mViewSpacingLeft;
    private int mViewSpacingRight;
    private boolean mViewSpacingSpecified;
    private int mViewSpacingTop;
    private final android.view.Window mWindow;


    /* renamed from: androidx.appcompat.app.AlertController$2 */
    class C00182 implements androidx.core.widget.NestedScrollView.OnScrollChangeListener {
        final /* synthetic */ androidx.appcompat.app.AlertController this$0;
        final /* synthetic */ android.view.View val$bottom;
        final /* synthetic */ android.view.View val$top;

        C00182(androidx.appcompat.app.AlertController r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$top = r2
                r0.val$bottom = r3
                r0.<init>()
                return
        }

        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public void onScrollChange(androidx.core.widget.NestedScrollView r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                android.view.View r2 = r0.val$top
                android.view.View r3 = r0.val$bottom
                androidx.appcompat.app.AlertController.manageScrollIndicators(r1, r2, r3)
                return
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$3 */
    class RunnableC00193 implements java.lang.Runnable {
        final /* synthetic */ androidx.appcompat.app.AlertController this$0;
        final /* synthetic */ android.view.View val$bottom;
        final /* synthetic */ android.view.View val$top;

        RunnableC00193(androidx.appcompat.app.AlertController r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$top = r2
                r0.val$bottom = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.app.AlertController r0 = r3.this$0
                androidx.core.widget.NestedScrollView r0 = r0.mScrollView
                android.view.View r1 = r3.val$top
                android.view.View r2 = r3.val$bottom
                androidx.appcompat.app.AlertController.manageScrollIndicators(r0, r1, r2)
                return
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$4 */
    class C00204 implements android.widget.AbsListView.OnScrollListener {
        final /* synthetic */ androidx.appcompat.app.AlertController this$0;
        final /* synthetic */ android.view.View val$bottom;
        final /* synthetic */ android.view.View val$top;

        C00204(androidx.appcompat.app.AlertController r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$top = r2
                r0.val$bottom = r3
                r0.<init>()
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
                r0 = this;
                android.view.View r2 = r0.val$top
                android.view.View r3 = r0.val$bottom
                androidx.appcompat.app.AlertController.manageScrollIndicators(r1, r2, r3)
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView r1, int r2) {
                r0 = this;
                return
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$5 */
    class RunnableC00215 implements java.lang.Runnable {
        final /* synthetic */ androidx.appcompat.app.AlertController this$0;
        final /* synthetic */ android.view.View val$bottom;
        final /* synthetic */ android.view.View val$top;

        RunnableC00215(androidx.appcompat.app.AlertController r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$top = r2
                r0.val$bottom = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.app.AlertController r0 = r3.this$0
                android.widget.ListView r0 = r0.mListView
                android.view.View r1 = r3.val$top
                android.view.View r2 = r3.val$bottom
                androidx.appcompat.app.AlertController.manageScrollIndicators(r0, r1, r2)
                return
        }
    }

    public static class AlertParams {
        public android.widget.ListAdapter mAdapter;
        public boolean mCancelable;
        public int mCheckedItem;
        public boolean[] mCheckedItems;
        public final android.content.Context mContext;
        public android.database.Cursor mCursor;
        public android.view.View mCustomTitleView;
        public boolean mForceInverseBackground;
        public android.graphics.drawable.Drawable mIcon;
        public int mIconAttrId;
        public int mIconId;
        public final android.view.LayoutInflater mInflater;
        public java.lang.String mIsCheckedColumn;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public java.lang.CharSequence[] mItems;
        public java.lang.String mLabelColumn;
        public java.lang.CharSequence mMessage;
        public android.graphics.drawable.Drawable mNegativeButtonIcon;
        public android.content.DialogInterface.OnClickListener mNegativeButtonListener;
        public java.lang.CharSequence mNegativeButtonText;
        public android.graphics.drawable.Drawable mNeutralButtonIcon;
        public android.content.DialogInterface.OnClickListener mNeutralButtonListener;
        public java.lang.CharSequence mNeutralButtonText;
        public android.content.DialogInterface.OnCancelListener mOnCancelListener;
        public android.content.DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        public android.content.DialogInterface.OnClickListener mOnClickListener;
        public android.content.DialogInterface.OnDismissListener mOnDismissListener;
        public android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        public android.content.DialogInterface.OnKeyListener mOnKeyListener;
        public androidx.appcompat.app.AlertController.AlertParams.OnPrepareListViewListener mOnPrepareListViewListener;
        public android.graphics.drawable.Drawable mPositiveButtonIcon;
        public android.content.DialogInterface.OnClickListener mPositiveButtonListener;
        public java.lang.CharSequence mPositiveButtonText;
        public boolean mRecycleOnMeasure;
        public java.lang.CharSequence mTitle;
        public android.view.View mView;
        public int mViewLayoutResId;
        public int mViewSpacingBottom;
        public int mViewSpacingLeft;
        public int mViewSpacingRight;
        public boolean mViewSpacingSpecified;
        public int mViewSpacingTop;





        public interface OnPrepareListViewListener {
            void onPrepareListView(android.widget.ListView r1);
        }

        public AlertParams(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mIconId = r0
                r1.mIconAttrId = r0
                r1.mViewSpacingSpecified = r0
                r0 = -1
                r1.mCheckedItem = r0
                r0 = 1
                r1.mRecycleOnMeasure = r0
                r1.mContext = r2
                r1.mCancelable = r0
                java.lang.String r0 = "layout_inflater"
                java.lang.Object r2 = r2.getSystemService(r0)
                android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2
                r1.mInflater = r2
                return
        }

        private void createListView(androidx.appcompat.app.AlertController r11) {
                r10 = this;
                android.view.LayoutInflater r0 = r10.mInflater
                int r1 = r11.mListLayout
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.mIsMultiChoice
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.mCursor
                if (r1 != 0) goto L26
                androidx.appcompat.app.AlertController$AlertParams$1 r9 = new androidx.appcompat.app.AlertController$AlertParams$1
                android.content.Context r3 = r10.mContext
                int r4 = r11.mMultiChoiceItemLayout
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.mItems
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7)
                goto L6b
            L26:
                androidx.appcompat.app.AlertController$AlertParams$2 r9 = new androidx.appcompat.app.AlertController$AlertParams$2
                android.content.Context r3 = r10.mContext
                android.database.Cursor r4 = r10.mCursor
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r2, r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.mIsSingleChoice
                if (r1 == 0) goto L3c
                int r1 = r11.mSingleChoiceItemLayout
                goto L3e
            L3c:
                int r1 = r11.mListItemLayout
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.mCursor
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.mContext
                android.database.Cursor r5 = r10.mCursor
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.mLabelColumn
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.mAdapter
                if (r9 == 0) goto L62
                goto L6b
            L62:
                androidx.appcompat.app.AlertController$CheckedItemAdapter r9 = new androidx.appcompat.app.AlertController$CheckedItemAdapter
                android.content.Context r1 = r10.mContext
                java.lang.CharSequence[] r3 = r10.mItems
                r9.<init>(r1, r4, r2, r3)
            L6b:
                androidx.appcompat.app.AlertController$AlertParams$OnPrepareListViewListener r1 = r10.mOnPrepareListViewListener
                if (r1 == 0) goto L72
                r1.onPrepareListView(r0)
            L72:
                r11.mAdapter = r9
                int r1 = r10.mCheckedItem
                r11.mCheckedItem = r1
                android.content.DialogInterface$OnClickListener r1 = r10.mOnClickListener
                if (r1 == 0) goto L85
                androidx.appcompat.app.AlertController$AlertParams$3 r1 = new androidx.appcompat.app.AlertController$AlertParams$3
                r1.<init>(r10, r11)
                r0.setOnItemClickListener(r1)
                goto L91
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.mOnCheckboxClickListener
                if (r1 == 0) goto L91
                androidx.appcompat.app.AlertController$AlertParams$4 r1 = new androidx.appcompat.app.AlertController$AlertParams$4
                r1.<init>(r10, r0, r11)
                r0.setOnItemClickListener(r1)
            L91:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.mOnItemSelectedListener
                if (r1 == 0) goto L98
                r0.setOnItemSelectedListener(r1)
            L98:
                boolean r1 = r10.mIsSingleChoice
                if (r1 == 0) goto La0
                r0.setChoiceMode(r8)
                goto La8
            La0:
                boolean r1 = r10.mIsMultiChoice
                if (r1 == 0) goto La8
                r1 = 2
                r0.setChoiceMode(r1)
            La8:
                r11.mListView = r0
                return
        }

        public void apply(androidx.appcompat.app.AlertController r14) {
                r13 = this;
                android.view.View r0 = r13.mCustomTitleView
                if (r0 == 0) goto L8
                r14.setCustomTitle(r0)
                goto L28
            L8:
                java.lang.CharSequence r0 = r13.mTitle
                if (r0 == 0) goto Lf
                r14.setTitle(r0)
            Lf:
                android.graphics.drawable.Drawable r0 = r13.mIcon
                if (r0 == 0) goto L16
                r14.setIcon(r0)
            L16:
                int r0 = r13.mIconId
                if (r0 == 0) goto L1d
                r14.setIcon(r0)
            L1d:
                int r0 = r13.mIconAttrId
                if (r0 == 0) goto L28
                int r0 = r14.getIconAttributeResId(r0)
                r14.setIcon(r0)
            L28:
                java.lang.CharSequence r0 = r13.mMessage
                if (r0 == 0) goto L2f
                r14.setMessage(r0)
            L2f:
                java.lang.CharSequence r3 = r13.mPositiveButtonText
                if (r3 != 0) goto L37
                android.graphics.drawable.Drawable r0 = r13.mPositiveButtonIcon
                if (r0 == 0) goto L41
            L37:
                r2 = -1
                android.content.DialogInterface$OnClickListener r4 = r13.mPositiveButtonListener
                r5 = 0
                android.graphics.drawable.Drawable r6 = r13.mPositiveButtonIcon
                r1 = r14
                r1.setButton(r2, r3, r4, r5, r6)
            L41:
                java.lang.CharSequence r9 = r13.mNegativeButtonText
                if (r9 != 0) goto L49
                android.graphics.drawable.Drawable r0 = r13.mNegativeButtonIcon
                if (r0 == 0) goto L53
            L49:
                r8 = -2
                android.content.DialogInterface$OnClickListener r10 = r13.mNegativeButtonListener
                r11 = 0
                android.graphics.drawable.Drawable r12 = r13.mNegativeButtonIcon
                r7 = r14
                r7.setButton(r8, r9, r10, r11, r12)
            L53:
                java.lang.CharSequence r2 = r13.mNeutralButtonText
                if (r2 != 0) goto L5b
                android.graphics.drawable.Drawable r0 = r13.mNeutralButtonIcon
                if (r0 == 0) goto L65
            L5b:
                r1 = -3
                android.content.DialogInterface$OnClickListener r3 = r13.mNeutralButtonListener
                r4 = 0
                android.graphics.drawable.Drawable r5 = r13.mNeutralButtonIcon
                r0 = r14
                r0.setButton(r1, r2, r3, r4, r5)
            L65:
                java.lang.CharSequence[] r0 = r13.mItems
                if (r0 != 0) goto L71
                android.database.Cursor r0 = r13.mCursor
                if (r0 != 0) goto L71
                android.widget.ListAdapter r0 = r13.mAdapter
                if (r0 == 0) goto L74
            L71:
                r13.createListView(r14)
            L74:
                android.view.View r2 = r13.mView
                if (r2 == 0) goto L8d
                boolean r0 = r13.mViewSpacingSpecified
                if (r0 == 0) goto L89
                int r3 = r13.mViewSpacingLeft
                int r4 = r13.mViewSpacingTop
                int r5 = r13.mViewSpacingRight
                int r6 = r13.mViewSpacingBottom
                r1 = r14
                r1.setView(r2, r3, r4, r5, r6)
                goto L94
            L89:
                r14.setView(r2)
                goto L94
            L8d:
                int r0 = r13.mViewLayoutResId
                if (r0 == 0) goto L94
                r14.setView(r0)
            L94:
                return
        }
    }

    private static final class ButtonHandler extends android.os.Handler {
        private static final int MSG_DISMISS_DIALOG = 1;
        private java.lang.ref.WeakReference<android.content.DialogInterface> mDialog;

        public ButtonHandler(android.content.DialogInterface r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mDialog = r0
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = -3
                if (r0 == r1) goto L17
                r1 = -2
                if (r0 == r1) goto L17
                r1 = -1
                if (r0 == r1) goto L17
                r1 = 1
                if (r0 == r1) goto Lf
                goto L28
            Lf:
                java.lang.Object r3 = r3.obj
                android.content.DialogInterface r3 = (android.content.DialogInterface) r3
                r3.dismiss()
                goto L28
            L17:
                java.lang.Object r0 = r3.obj
                android.content.DialogInterface$OnClickListener r0 = (android.content.DialogInterface.OnClickListener) r0
                java.lang.ref.WeakReference<android.content.DialogInterface> r1 = r2.mDialog
                java.lang.Object r1 = r1.get()
                android.content.DialogInterface r1 = (android.content.DialogInterface) r1
                int r3 = r3.what
                r0.onClick(r1, r3)
            L28:
                return
        }
    }

    private static class CheckedItemAdapter extends android.widget.ArrayAdapter<java.lang.CharSequence> {
        public CheckedItemAdapter(android.content.Context r1, int r2, int r3, java.lang.CharSequence[] r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public static class RecycleListView extends android.widget.ListView {
        private final int mPaddingBottomNoButtons;
        private final int mPaddingTopNoTitle;

        public RecycleListView(android.content.Context r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public RecycleListView(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = androidx.appcompat.C0015R.styleable.RecycleListView
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                int r3 = androidx.appcompat.C0015R.styleable.RecycleListView_paddingBottomNoButtons
                r0 = -1
                int r3 = r2.getDimensionPixelOffset(r3, r0)
                r1.mPaddingBottomNoButtons = r3
                int r3 = androidx.appcompat.C0015R.styleable.RecycleListView_paddingTopNoTitle
                int r2 = r2.getDimensionPixelOffset(r3, r0)
                r1.mPaddingTopNoTitle = r2
                return
        }

        public void setHasDecor(boolean r3, boolean r4) {
                r2 = this;
                if (r4 == 0) goto L4
                if (r3 != 0) goto L21
            L4:
                int r0 = r2.getPaddingLeft()
                if (r3 == 0) goto Lf
                int r3 = r2.getPaddingTop()
                goto L11
            Lf:
                int r3 = r2.mPaddingTopNoTitle
            L11:
                int r1 = r2.getPaddingRight()
                if (r4 == 0) goto L1c
                int r4 = r2.getPaddingBottom()
                goto L1e
            L1c:
                int r4 = r2.mPaddingBottomNoButtons
            L1e:
                r2.setPadding(r0, r3, r1, r4)
            L21:
                return
        }
    }

    public AlertController(android.content.Context r4, androidx.appcompat.app.AppCompatDialog r5, android.view.Window r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mViewSpacingSpecified = r0
            r3.mIconId = r0
            r1 = -1
            r3.mCheckedItem = r1
            r3.mButtonPanelLayoutHint = r0
            androidx.appcompat.app.AlertController$1 r1 = new androidx.appcompat.app.AlertController$1
            r1.<init>(r3)
            r3.mButtonHandler = r1
            r3.mContext = r4
            r3.mDialog = r5
            r3.mWindow = r6
            androidx.appcompat.app.AlertController$ButtonHandler r6 = new androidx.appcompat.app.AlertController$ButtonHandler
            r6.<init>(r5)
            r3.mHandler = r6
            int[] r6 = androidx.appcompat.C0015R.styleable.AlertDialog
            int r1 = androidx.appcompat.C0015R.attr.alertDialogStyle
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r2, r6, r1, r0)
            int r6 = androidx.appcompat.C0015R.styleable.AlertDialog_android_layout
            int r6 = r4.getResourceId(r6, r0)
            r3.mAlertDialogLayout = r6
            int r6 = androidx.appcompat.C0015R.styleable.AlertDialog_buttonPanelSideLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.mButtonPanelSideLayout = r6
            int r6 = androidx.appcompat.C0015R.styleable.AlertDialog_listLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.mListLayout = r6
            int r6 = androidx.appcompat.C0015R.styleable.AlertDialog_multiChoiceItemLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.mMultiChoiceItemLayout = r6
            int r6 = androidx.appcompat.C0015R.styleable.AlertDialog_singleChoiceItemLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.mSingleChoiceItemLayout = r6
            int r6 = androidx.appcompat.C0015R.styleable.AlertDialog_listItemLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.mListItemLayout = r6
            int r6 = androidx.appcompat.C0015R.styleable.AlertDialog_showTitle
            r1 = 1
            boolean r6 = r4.getBoolean(r6, r1)
            r3.mShowTitle = r6
            int r6 = androidx.appcompat.C0015R.styleable.AlertDialog_buttonIconDimen
            int r6 = r4.getDimensionPixelSize(r6, r0)
            r3.mButtonIconDimen = r6
            r4.recycle()
            r5.supportRequestWindowFeature(r1)
            return
    }

    static boolean canTextInput(android.view.View r4) {
            boolean r0 = r4.onCheckIsTextEditor()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r4 instanceof android.view.ViewGroup
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
        L14:
            if (r0 <= 0) goto L23
            int r0 = r0 + (-1)
            android.view.View r3 = r4.getChildAt(r0)
            boolean r3 = canTextInput(r3)
            if (r3 == 0) goto L14
            return r1
        L23:
            return r2
    }

    private void centerButton(android.widget.Button r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r1 = 1
            r0.gravity = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.weight = r1
            r3.setLayoutParams(r0)
            return
    }

    static void manageScrollIndicators(android.view.View r3, android.view.View r4, android.view.View r5) {
            r0 = 0
            r1 = 4
            if (r4 == 0) goto L11
            r2 = -1
            boolean r2 = r3.canScrollVertically(r2)
            if (r2 == 0) goto Ld
            r2 = r0
            goto Le
        Ld:
            r2 = r1
        Le:
            r4.setVisibility(r2)
        L11:
            if (r5 == 0) goto L1f
            r4 = 1
            boolean r3 = r3.canScrollVertically(r4)
            if (r3 == 0) goto L1b
            goto L1c
        L1b:
            r0 = r1
        L1c:
            r5.setVisibility(r0)
        L1f:
            return
    }

    private android.view.ViewGroup resolvePanel(android.view.View r3, android.view.View r4) {
            r2 = this;
            if (r3 != 0) goto Lf
            boolean r3 = r4 instanceof android.view.ViewStub
            if (r3 == 0) goto Lc
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r4 = r4.inflate()
        Lc:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            return r4
        Lf:
            if (r4 == 0) goto L1e
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L1e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r4)
        L1e:
            boolean r4 = r3 instanceof android.view.ViewStub
            if (r4 == 0) goto L28
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r3 = r3.inflate()
        L28:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
    }

    private int selectContentView() {
            r3 = this;
            int r0 = r3.mButtonPanelSideLayout
            if (r0 != 0) goto L7
            int r0 = r3.mAlertDialogLayout
            return r0
        L7:
            int r1 = r3.mButtonPanelLayoutHint
            r2 = 1
            if (r1 != r2) goto Ld
            return r0
        Ld:
            int r0 = r3.mAlertDialogLayout
            return r0
    }

    private void setScrollIndicators(android.view.ViewGroup r4, android.view.View r5, int r6, int r7) {
            r3 = this;
            android.view.Window r0 = r3.mWindow
            int r1 = androidx.appcompat.C0015R.id.scrollIndicatorUp
            android.view.View r0 = r0.findViewById(r1)
            android.view.Window r1 = r3.mWindow
            int r2 = androidx.appcompat.C0015R.id.scrollIndicatorDown
            android.view.View r1 = r1.findViewById(r2)
            androidx.core.view.ViewCompat.setScrollIndicators(r5, r6, r7)
            if (r0 == 0) goto L18
            r4.removeView(r0)
        L18:
            if (r1 == 0) goto L1d
            r4.removeView(r1)
        L1d:
            return
    }

    private void setupButtons(android.view.ViewGroup r8) {
            r7 = this;
            r0 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r7.mButtonPositive = r0
            android.view.View$OnClickListener r1 = r7.mButtonHandler
            r0.setOnClickListener(r1)
            java.lang.CharSequence r0 = r7.mButtonPositiveText
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L28
            android.graphics.drawable.Drawable r0 = r7.mButtonPositiveIcon
            if (r0 != 0) goto L28
            android.widget.Button r0 = r7.mButtonPositive
            r0.setVisibility(r1)
            r0 = r4
            goto L45
        L28:
            android.widget.Button r0 = r7.mButtonPositive
            java.lang.CharSequence r5 = r7.mButtonPositiveText
            r0.setText(r5)
            android.graphics.drawable.Drawable r0 = r7.mButtonPositiveIcon
            if (r0 == 0) goto L3f
            int r5 = r7.mButtonIconDimen
            r0.setBounds(r4, r4, r5, r5)
            android.widget.Button r0 = r7.mButtonPositive
            android.graphics.drawable.Drawable r5 = r7.mButtonPositiveIcon
            r0.setCompoundDrawables(r5, r2, r2, r2)
        L3f:
            android.widget.Button r0 = r7.mButtonPositive
            r0.setVisibility(r4)
            r0 = r3
        L45:
            r5 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r5 = r8.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r7.mButtonNegative = r5
            android.view.View$OnClickListener r6 = r7.mButtonHandler
            r5.setOnClickListener(r6)
            java.lang.CharSequence r5 = r7.mButtonNegativeText
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L67
            android.graphics.drawable.Drawable r5 = r7.mButtonNegativeIcon
            if (r5 != 0) goto L67
            android.widget.Button r5 = r7.mButtonNegative
            r5.setVisibility(r1)
            goto L85
        L67:
            android.widget.Button r5 = r7.mButtonNegative
            java.lang.CharSequence r6 = r7.mButtonNegativeText
            r5.setText(r6)
            android.graphics.drawable.Drawable r5 = r7.mButtonNegativeIcon
            if (r5 == 0) goto L7e
            int r6 = r7.mButtonIconDimen
            r5.setBounds(r4, r4, r6, r6)
            android.widget.Button r5 = r7.mButtonNegative
            android.graphics.drawable.Drawable r6 = r7.mButtonNegativeIcon
            r5.setCompoundDrawables(r6, r2, r2, r2)
        L7e:
            android.widget.Button r5 = r7.mButtonNegative
            r5.setVisibility(r4)
            r0 = r0 | 2
        L85:
            r5 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r5 = r8.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r7.mButtonNeutral = r5
            android.view.View$OnClickListener r6 = r7.mButtonHandler
            r5.setOnClickListener(r6)
            java.lang.CharSequence r5 = r7.mButtonNeutralText
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto La7
            android.graphics.drawable.Drawable r5 = r7.mButtonNeutralIcon
            if (r5 != 0) goto La7
            android.widget.Button r2 = r7.mButtonNeutral
            r2.setVisibility(r1)
            goto Lc5
        La7:
            android.widget.Button r5 = r7.mButtonNeutral
            java.lang.CharSequence r6 = r7.mButtonNeutralText
            r5.setText(r6)
            android.graphics.drawable.Drawable r5 = r7.mButtonNeutralIcon
            if (r5 == 0) goto Lbe
            int r6 = r7.mButtonIconDimen
            r5.setBounds(r4, r4, r6, r6)
            android.widget.Button r5 = r7.mButtonNeutral
            android.graphics.drawable.Drawable r6 = r7.mButtonNeutralIcon
            r5.setCompoundDrawables(r6, r2, r2, r2)
        Lbe:
            android.widget.Button r2 = r7.mButtonNeutral
            r2.setVisibility(r4)
            r0 = r0 | 4
        Lc5:
            android.content.Context r2 = r7.mContext
            boolean r2 = shouldCenterSingleButton(r2)
            if (r2 == 0) goto Le6
            if (r0 != r3) goto Ld5
            android.widget.Button r2 = r7.mButtonPositive
            r7.centerButton(r2)
            goto Le6
        Ld5:
            r2 = 2
            if (r0 != r2) goto Lde
            android.widget.Button r2 = r7.mButtonNegative
            r7.centerButton(r2)
            goto Le6
        Lde:
            r2 = 4
            if (r0 != r2) goto Le6
            android.widget.Button r2 = r7.mButtonNeutral
            r7.centerButton(r2)
        Le6:
            if (r0 == 0) goto Le9
            goto Lea
        Le9:
            r3 = r4
        Lea:
            if (r3 != 0) goto Lef
            r8.setVisibility(r1)
        Lef:
            return
    }

    private void setupContent(android.view.ViewGroup r5) {
            r4 = this;
            android.view.Window r0 = r4.mWindow
            int r1 = androidx.appcompat.C0015R.id.scrollView
            android.view.View r0 = r0.findViewById(r1)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r4.mScrollView = r0
            r1 = 0
            r0.setFocusable(r1)
            androidx.core.widget.NestedScrollView r0 = r4.mScrollView
            r0.setNestedScrollingEnabled(r1)
            r0 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.mMessageView = r0
            if (r0 != 0) goto L23
            return
        L23:
            java.lang.CharSequence r1 = r4.mMessage
            if (r1 == 0) goto L2b
            r0.setText(r1)
            goto L5b
        L2b:
            r1 = 8
            r0.setVisibility(r1)
            androidx.core.widget.NestedScrollView r0 = r4.mScrollView
            android.widget.TextView r2 = r4.mMessageView
            r0.removeView(r2)
            android.widget.ListView r0 = r4.mListView
            if (r0 == 0) goto L58
            androidx.core.widget.NestedScrollView r5 = r4.mScrollView
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            androidx.core.widget.NestedScrollView r0 = r4.mScrollView
            int r0 = r5.indexOfChild(r0)
            r5.removeViewAt(r0)
            android.widget.ListView r1 = r4.mListView
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r5.addView(r1, r0, r2)
            goto L5b
        L58:
            r5.setVisibility(r1)
        L5b:
            return
    }

    private void setupCustomContent(android.view.ViewGroup r6) {
            r5 = this;
            android.view.View r0 = r5.mView
            r1 = 0
            if (r0 == 0) goto L6
            goto L18
        L6:
            int r0 = r5.mViewLayoutResId
            if (r0 == 0) goto L17
            android.content.Context r0 = r5.mContext
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.mViewLayoutResId
            android.view.View r0 = r0.inflate(r2, r6, r1)
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 == 0) goto L1b
            r1 = 1
        L1b:
            if (r1 == 0) goto L23
            boolean r2 = canTextInput(r0)
            if (r2 != 0) goto L2a
        L23:
            android.view.Window r2 = r5.mWindow
            r3 = 131072(0x20000, float:1.83671E-40)
            r2.setFlags(r3, r3)
        L2a:
            if (r1 == 0) goto L5c
            android.view.Window r1 = r5.mWindow
            int r2 = androidx.appcompat.C0015R.id.custom
            android.view.View r1 = r1.findViewById(r2)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r1.addView(r0, r2)
            boolean r0 = r5.mViewSpacingSpecified
            if (r0 == 0) goto L4e
            int r0 = r5.mViewSpacingLeft
            int r2 = r5.mViewSpacingTop
            int r3 = r5.mViewSpacingRight
            int r4 = r5.mViewSpacingBottom
            r1.setPadding(r0, r2, r3, r4)
        L4e:
            android.widget.ListView r0 = r5.mListView
            if (r0 == 0) goto L61
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r6 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r6
            r0 = 0
            r6.weight = r0
            goto L61
        L5c:
            r0 = 8
            r6.setVisibility(r0)
        L61:
            return
    }

    private void setupTitle(android.view.ViewGroup r6) {
            r5 = this;
            android.view.View r0 = r5.mCustomTitleView
            r1 = 8
            if (r0 == 0) goto L20
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r3 = -2
            r0.<init>(r2, r3)
            android.view.View r2 = r5.mCustomTitleView
            r3 = 0
            r6.addView(r2, r3, r0)
            android.view.Window r6 = r5.mWindow
            int r0 = androidx.appcompat.C0015R.id.title_template
            android.view.View r6 = r6.findViewById(r0)
            r6.setVisibility(r1)
            goto L96
        L20:
            android.view.Window r0 = r5.mWindow
            r2 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.mIconView = r0
            java.lang.CharSequence r0 = r5.mTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L83
            boolean r0 = r5.mShowTitle
            if (r0 == 0) goto L83
            android.view.Window r6 = r5.mWindow
            int r0 = androidx.appcompat.C0015R.id.alertTitle
            android.view.View r6 = r6.findViewById(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.mTitleView = r6
            java.lang.CharSequence r0 = r5.mTitle
            r6.setText(r0)
            int r6 = r5.mIconId
            if (r6 == 0) goto L56
            android.widget.ImageView r0 = r5.mIconView
            r0.setImageResource(r6)
            goto L96
        L56:
            android.graphics.drawable.Drawable r6 = r5.mIcon
            if (r6 == 0) goto L60
            android.widget.ImageView r0 = r5.mIconView
            r0.setImageDrawable(r6)
            goto L96
        L60:
            android.widget.TextView r6 = r5.mTitleView
            android.widget.ImageView r0 = r5.mIconView
            int r0 = r0.getPaddingLeft()
            android.widget.ImageView r2 = r5.mIconView
            int r2 = r2.getPaddingTop()
            android.widget.ImageView r3 = r5.mIconView
            int r3 = r3.getPaddingRight()
            android.widget.ImageView r4 = r5.mIconView
            int r4 = r4.getPaddingBottom()
            r6.setPadding(r0, r2, r3, r4)
            android.widget.ImageView r6 = r5.mIconView
            r6.setVisibility(r1)
            goto L96
        L83:
            android.view.Window r0 = r5.mWindow
            int r2 = androidx.appcompat.C0015R.id.title_template
            android.view.View r0 = r0.findViewById(r2)
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r5.mIconView
            r0.setVisibility(r1)
            r6.setVisibility(r1)
        L96:
            return
    }

    private void setupView() {
            r8 = this;
            android.view.Window r0 = r8.mWindow
            int r1 = androidx.appcompat.C0015R.id.parentPanel
            android.view.View r0 = r0.findViewById(r1)
            int r1 = androidx.appcompat.C0015R.id.topPanel
            android.view.View r1 = r0.findViewById(r1)
            int r2 = androidx.appcompat.C0015R.id.contentPanel
            android.view.View r2 = r0.findViewById(r2)
            int r3 = androidx.appcompat.C0015R.id.buttonPanel
            android.view.View r3 = r0.findViewById(r3)
            int r4 = androidx.appcompat.C0015R.id.customPanel
            android.view.View r0 = r0.findViewById(r4)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.setupCustomContent(r0)
            int r4 = androidx.appcompat.C0015R.id.topPanel
            android.view.View r4 = r0.findViewById(r4)
            int r5 = androidx.appcompat.C0015R.id.contentPanel
            android.view.View r5 = r0.findViewById(r5)
            int r6 = androidx.appcompat.C0015R.id.buttonPanel
            android.view.View r6 = r0.findViewById(r6)
            android.view.ViewGroup r1 = r8.resolvePanel(r4, r1)
            android.view.ViewGroup r2 = r8.resolvePanel(r5, r2)
            android.view.ViewGroup r3 = r8.resolvePanel(r6, r3)
            r8.setupContent(r2)
            r8.setupButtons(r3)
            r8.setupTitle(r1)
            r4 = 8
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L5a
            int r0 = r0.getVisibility()
            if (r0 == r4) goto L5a
            r0 = r5
            goto L5b
        L5a:
            r0 = r6
        L5b:
            if (r1 == 0) goto L65
            int r7 = r1.getVisibility()
            if (r7 == r4) goto L65
            r7 = r5
            goto L66
        L65:
            r7 = r6
        L66:
            if (r3 == 0) goto L70
            int r3 = r3.getVisibility()
            if (r3 == r4) goto L70
            r3 = r5
            goto L71
        L70:
            r3 = r6
        L71:
            if (r3 != 0) goto L80
            if (r2 == 0) goto L80
            int r4 = androidx.appcompat.C0015R.id.textSpacerNoButtons
            android.view.View r4 = r2.findViewById(r4)
            if (r4 == 0) goto L80
            r4.setVisibility(r6)
        L80:
            if (r7 == 0) goto La0
            androidx.core.widget.NestedScrollView r4 = r8.mScrollView
            if (r4 == 0) goto L89
            r4.setClipToPadding(r5)
        L89:
            java.lang.CharSequence r4 = r8.mMessage
            if (r4 != 0) goto L94
            android.widget.ListView r4 = r8.mListView
            if (r4 == 0) goto L92
            goto L94
        L92:
            r1 = 0
            goto L9a
        L94:
            int r4 = androidx.appcompat.C0015R.id.titleDividerNoCustom
            android.view.View r1 = r1.findViewById(r4)
        L9a:
            if (r1 == 0) goto Lad
            r1.setVisibility(r6)
            goto Lad
        La0:
            if (r2 == 0) goto Lad
            int r1 = androidx.appcompat.C0015R.id.textSpacerNoTitle
            android.view.View r1 = r2.findViewById(r1)
            if (r1 == 0) goto Lad
            r1.setVisibility(r6)
        Lad:
            android.widget.ListView r1 = r8.mListView
            boolean r4 = r1 instanceof androidx.appcompat.app.AlertController.RecycleListView
            if (r4 == 0) goto Lb8
            androidx.appcompat.app.AlertController$RecycleListView r1 = (androidx.appcompat.app.AlertController.RecycleListView) r1
            r1.setHasDecor(r7, r3)
        Lb8:
            if (r0 != 0) goto Lcc
            android.widget.ListView r0 = r8.mListView
            if (r0 == 0) goto Lbf
            goto Lc1
        Lbf:
            androidx.core.widget.NestedScrollView r0 = r8.mScrollView
        Lc1:
            if (r0 == 0) goto Lcc
            if (r3 == 0) goto Lc6
            r6 = 2
        Lc6:
            r1 = r7 | r6
            r3 = 3
            r8.setScrollIndicators(r2, r0, r1, r3)
        Lcc:
            android.widget.ListView r0 = r8.mListView
            if (r0 == 0) goto Le2
            android.widget.ListAdapter r1 = r8.mAdapter
            if (r1 == 0) goto Le2
            r0.setAdapter(r1)
            int r1 = r8.mCheckedItem
            r2 = -1
            if (r1 <= r2) goto Le2
            r0.setItemChecked(r1, r5)
            r0.setSelection(r1)
        Le2:
            return
    }

    private static boolean shouldCenterSingleButton(android.content.Context r3) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int r1 = androidx.appcompat.C0015R.attr.alertDialogCenterButtons
            r2 = 1
            r3.resolveAttribute(r1, r0, r2)
            int r3 = r0.data
            if (r3 == 0) goto L14
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    public android.widget.Button getButton(int r2) {
            r1 = this;
            r0 = -3
            if (r2 == r0) goto L11
            r0 = -2
            if (r2 == r0) goto Le
            r0 = -1
            if (r2 == r0) goto Lb
            r2 = 0
            return r2
        Lb:
            android.widget.Button r2 = r1.mButtonPositive
            return r2
        Le:
            android.widget.Button r2 = r1.mButtonNegative
            return r2
        L11:
            android.widget.Button r2 = r1.mButtonNeutral
            return r2
    }

    public int getIconAttributeResId(int r4) {
            r3 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r3.mContext
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 1
            r1.resolveAttribute(r4, r0, r2)
            int r4 = r0.resourceId
            return r4
    }

    public android.widget.ListView getListView() {
            r1 = this;
            android.widget.ListView r0 = r1.mListView
            return r0
    }

    public void installContent() {
            r2 = this;
            int r0 = r2.selectContentView()
            androidx.appcompat.app.AppCompatDialog r1 = r2.mDialog
            r1.setContentView(r0)
            r2.setupView()
            return
    }

    public boolean onKeyDown(int r1, android.view.KeyEvent r2) {
            r0 = this;
            androidx.core.widget.NestedScrollView r1 = r0.mScrollView
            if (r1 == 0) goto Lc
            boolean r1 = r1.executeKeyEvent(r2)
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    public boolean onKeyUp(int r1, android.view.KeyEvent r2) {
            r0 = this;
            androidx.core.widget.NestedScrollView r1 = r0.mScrollView
            if (r1 == 0) goto Lc
            boolean r1 = r1.executeKeyEvent(r2)
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    public void setButton(int r1, java.lang.CharSequence r2, android.content.DialogInterface.OnClickListener r3, android.os.Message r4, android.graphics.drawable.Drawable r5) {
            r0 = this;
            if (r4 != 0) goto La
            if (r3 == 0) goto La
            android.os.Handler r4 = r0.mHandler
            android.os.Message r4 = r4.obtainMessage(r1, r3)
        La:
            r3 = -3
            if (r1 == r3) goto L29
            r3 = -2
            if (r1 == r3) goto L22
            r3 = -1
            if (r1 != r3) goto L1a
            r0.mButtonPositiveText = r2
            r0.mButtonPositiveMessage = r4
            r0.mButtonPositiveIcon = r5
            goto L2f
        L1a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Button does not exist"
            r1.<init>(r2)
            throw r1
        L22:
            r0.mButtonNegativeText = r2
            r0.mButtonNegativeMessage = r4
            r0.mButtonNegativeIcon = r5
            goto L2f
        L29:
            r0.mButtonNeutralText = r2
            r0.mButtonNeutralMessage = r4
            r0.mButtonNeutralIcon = r5
        L2f:
            return
    }

    public void setButtonPanelLayoutHint(int r1) {
            r0 = this;
            r0.mButtonPanelLayoutHint = r1
            return
    }

    public void setCustomTitle(android.view.View r1) {
            r0 = this;
            r0.mCustomTitleView = r1
            return
    }

    public void setIcon(int r2) {
            r1 = this;
            r0 = 0
            r1.mIcon = r0
            r1.mIconId = r2
            android.widget.ImageView r0 = r1.mIconView
            if (r0 == 0) goto L1c
            if (r2 == 0) goto L17
            r2 = 0
            r0.setVisibility(r2)
            android.widget.ImageView r2 = r1.mIconView
            int r0 = r1.mIconId
            r2.setImageResource(r0)
            goto L1c
        L17:
            r2 = 8
            r0.setVisibility(r2)
        L1c:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            r2.mIcon = r3
            r0 = 0
            r2.mIconId = r0
            android.widget.ImageView r1 = r2.mIconView
            if (r1 == 0) goto L19
            if (r3 == 0) goto L14
            r1.setVisibility(r0)
            android.widget.ImageView r0 = r2.mIconView
            r0.setImageDrawable(r3)
            goto L19
        L14:
            r3 = 8
            r1.setVisibility(r3)
        L19:
            return
    }

    public void setMessage(java.lang.CharSequence r2) {
            r1 = this;
            r1.mMessage = r2
            android.widget.TextView r0 = r1.mMessageView
            if (r0 == 0) goto L9
            r0.setText(r2)
        L9:
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            r1.mTitle = r2
            android.widget.TextView r0 = r1.mTitleView
            if (r0 == 0) goto L9
            r0.setText(r2)
        L9:
            return
    }

    public void setView(int r2) {
            r1 = this;
            r0 = 0
            r1.mView = r0
            r1.mViewLayoutResId = r2
            r2 = 0
            r1.mViewSpacingSpecified = r2
            return
    }

    public void setView(android.view.View r1) {
            r0 = this;
            r0.mView = r1
            r1 = 0
            r0.mViewLayoutResId = r1
            r0.mViewSpacingSpecified = r1
            return
    }

    public void setView(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.mView = r1
            r1 = 0
            r0.mViewLayoutResId = r1
            r1 = 1
            r0.mViewSpacingSpecified = r1
            r0.mViewSpacingLeft = r2
            r0.mViewSpacingTop = r3
            r0.mViewSpacingRight = r4
            r0.mViewSpacingBottom = r5
            return
    }
}
