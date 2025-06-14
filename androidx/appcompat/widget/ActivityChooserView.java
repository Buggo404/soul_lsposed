package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActivityChooserView extends android.view.ViewGroup implements androidx.appcompat.widget.ActivityChooserModel.ActivityChooserModelClient {
    private final android.view.View mActivityChooserContent;
    private final android.graphics.drawable.Drawable mActivityChooserContentBackground;
    final androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter mAdapter;
    private final androidx.appcompat.widget.ActivityChooserView.Callbacks mCallbacks;
    private int mDefaultActionButtonContentDescription;
    final android.widget.FrameLayout mDefaultActivityButton;
    private final android.widget.ImageView mDefaultActivityButtonImage;
    final android.widget.FrameLayout mExpandActivityOverflowButton;
    private final android.widget.ImageView mExpandActivityOverflowButtonImage;
    int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private androidx.appcompat.widget.ListPopupWindow mListPopupWindow;
    final android.database.DataSetObserver mModelDataSetObserver;
    android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    androidx.core.view.ActionProvider mProvider;






    private class ActivityChooserViewAdapter extends android.widget.BaseAdapter {
        private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
        private static final int ITEM_VIEW_TYPE_COUNT = 3;
        private static final int ITEM_VIEW_TYPE_FOOTER = 1;
        public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
        public static final int MAX_ACTIVITY_COUNT_UNLIMITED = Integer.MAX_VALUE;
        private androidx.appcompat.widget.ActivityChooserModel mDataModel;
        private boolean mHighlightDefaultActivity;
        private int mMaxActivityCount;
        private boolean mShowDefaultActivity;
        private boolean mShowFooterView;
        final /* synthetic */ androidx.appcompat.widget.ActivityChooserView this$0;

        ActivityChooserViewAdapter(androidx.appcompat.widget.ActivityChooserView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 4
                r0.mMaxActivityCount = r1
                return
        }

        public int getActivityCount() {
                r1 = this;
                androidx.appcompat.widget.ActivityChooserModel r0 = r1.mDataModel
                int r0 = r0.getActivityCount()
                return r0
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r2 = this;
                androidx.appcompat.widget.ActivityChooserModel r0 = r2.mDataModel
                int r0 = r0.getActivityCount()
                boolean r1 = r2.mShowDefaultActivity
                if (r1 != 0) goto L14
                androidx.appcompat.widget.ActivityChooserModel r1 = r2.mDataModel
                android.content.pm.ResolveInfo r1 = r1.getDefaultActivity()
                if (r1 == 0) goto L14
                int r0 = r0 + (-1)
            L14:
                int r1 = r2.mMaxActivityCount
                int r0 = java.lang.Math.min(r0, r1)
                boolean r1 = r2.mShowFooterView
                if (r1 == 0) goto L20
                int r0 = r0 + 1
            L20:
                return r0
        }

        public androidx.appcompat.widget.ActivityChooserModel getDataModel() {
                r1 = this;
                androidx.appcompat.widget.ActivityChooserModel r0 = r1.mDataModel
                return r0
        }

        public android.content.pm.ResolveInfo getDefaultActivity() {
                r1 = this;
                androidx.appcompat.widget.ActivityChooserModel r0 = r1.mDataModel
                android.content.pm.ResolveInfo r0 = r0.getDefaultActivity()
                return r0
        }

        public int getHistorySize() {
                r1 = this;
                androidx.appcompat.widget.ActivityChooserModel r0 = r1.mDataModel
                int r0 = r0.getHistorySize()
                return r0
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r2) {
                r1 = this;
                int r0 = r1.getItemViewType(r2)
                if (r0 == 0) goto L11
                r2 = 1
                if (r0 != r2) goto Lb
                r2 = 0
                return r2
            Lb:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r2.<init>()
                throw r2
            L11:
                boolean r0 = r1.mShowDefaultActivity
                if (r0 != 0) goto L1f
                androidx.appcompat.widget.ActivityChooserModel r0 = r1.mDataModel
                android.content.pm.ResolveInfo r0 = r0.getDefaultActivity()
                if (r0 == 0) goto L1f
                int r2 = r2 + 1
            L1f:
                androidx.appcompat.widget.ActivityChooserModel r0 = r1.mDataModel
                android.content.pm.ResolveInfo r2 = r0.getActivity(r2)
                return r2
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int r3) {
                r2 = this;
                boolean r0 = r2.mShowFooterView
                if (r0 == 0) goto Ld
                int r0 = r2.getCount()
                r1 = 1
                int r0 = r0 - r1
                if (r3 != r0) goto Ld
                return r1
            Ld:
                r3 = 0
                return r3
        }

        public boolean getShowDefaultActivity() {
                r1 = this;
                boolean r0 = r1.mShowDefaultActivity
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
                r5 = this;
                int r0 = r5.getItemViewType(r6)
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L43
                if (r0 != r2) goto L3d
                if (r7 == 0) goto L12
                int r6 = r7.getId()
                if (r6 == r2) goto L3c
            L12:
                androidx.appcompat.widget.ActivityChooserView r6 = r5.this$0
                android.content.Context r6 = r6.getContext()
                android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
                int r7 = androidx.appcompat.C0015R.layout.abc_activity_chooser_view_list_item
                android.view.View r7 = r6.inflate(r7, r8, r1)
                r7.setId(r2)
                int r6 = androidx.appcompat.C0015R.id.title
                android.view.View r6 = r7.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                androidx.appcompat.widget.ActivityChooserView r8 = r5.this$0
                android.content.Context r8 = r8.getContext()
                int r0 = androidx.appcompat.C0015R.string.abc_activity_chooser_view_see_all
                java.lang.String r8 = r8.getString(r0)
                r6.setText(r8)
            L3c:
                return r7
            L3d:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                r6.<init>()
                throw r6
            L43:
                if (r7 == 0) goto L4d
                int r0 = r7.getId()
                int r3 = androidx.appcompat.C0015R.id.list_item
                if (r0 == r3) goto L5d
            L4d:
                androidx.appcompat.widget.ActivityChooserView r7 = r5.this$0
                android.content.Context r7 = r7.getContext()
                android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
                int r0 = androidx.appcompat.C0015R.layout.abc_activity_chooser_view_list_item
                android.view.View r7 = r7.inflate(r0, r8, r1)
            L5d:
                androidx.appcompat.widget.ActivityChooserView r8 = r5.this$0
                android.content.Context r8 = r8.getContext()
                android.content.pm.PackageManager r8 = r8.getPackageManager()
                int r0 = androidx.appcompat.C0015R.id.icon
                android.view.View r0 = r7.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                java.lang.Object r3 = r5.getItem(r6)
                android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
                android.graphics.drawable.Drawable r4 = r3.loadIcon(r8)
                r0.setImageDrawable(r4)
                int r0 = androidx.appcompat.C0015R.id.title
                android.view.View r0 = r7.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.CharSequence r8 = r3.loadLabel(r8)
                r0.setText(r8)
                boolean r8 = r5.mShowDefaultActivity
                if (r8 == 0) goto L99
                if (r6 != 0) goto L99
                boolean r6 = r5.mHighlightDefaultActivity
                if (r6 == 0) goto L99
                r7.setActivated(r2)
                goto L9c
            L99:
                r7.setActivated(r1)
            L9c:
                return r7
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
                r1 = this;
                r0 = 3
                return r0
        }

        public int measureContentWidth() {
                r9 = this;
                int r0 = r9.mMaxActivityCount
                r1 = 2147483647(0x7fffffff, float:NaN)
                r9.mMaxActivityCount = r1
                r1 = 0
                int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
                int r4 = r9.getCount()
                r5 = 0
                r6 = r1
                r7 = r5
            L17:
                if (r1 >= r4) goto L2b
                android.view.View r7 = r9.getView(r1, r7, r5)
                r7.measure(r2, r3)
                int r8 = r7.getMeasuredWidth()
                int r6 = java.lang.Math.max(r6, r8)
                int r1 = r1 + 1
                goto L17
            L2b:
                r9.mMaxActivityCount = r0
                return r6
        }

        public void setDataModel(androidx.appcompat.widget.ActivityChooserModel r3) {
                r2 = this;
                androidx.appcompat.widget.ActivityChooserView r0 = r2.this$0
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r0.mAdapter
                androidx.appcompat.widget.ActivityChooserModel r0 = r0.getDataModel()
                if (r0 == 0) goto L19
                androidx.appcompat.widget.ActivityChooserView r1 = r2.this$0
                boolean r1 = r1.isShown()
                if (r1 == 0) goto L19
                androidx.appcompat.widget.ActivityChooserView r1 = r2.this$0
                android.database.DataSetObserver r1 = r1.mModelDataSetObserver
                r0.unregisterObserver(r1)
            L19:
                r2.mDataModel = r3
                if (r3 == 0) goto L2c
                androidx.appcompat.widget.ActivityChooserView r0 = r2.this$0
                boolean r0 = r0.isShown()
                if (r0 == 0) goto L2c
                androidx.appcompat.widget.ActivityChooserView r0 = r2.this$0
                android.database.DataSetObserver r0 = r0.mModelDataSetObserver
                r3.registerObserver(r0)
            L2c:
                r2.notifyDataSetChanged()
                return
        }

        public void setMaxActivityCount(int r2) {
                r1 = this;
                int r0 = r1.mMaxActivityCount
                if (r0 == r2) goto L9
                r1.mMaxActivityCount = r2
                r1.notifyDataSetChanged()
            L9:
                return
        }

        public void setShowDefaultActivity(boolean r2, boolean r3) {
                r1 = this;
                boolean r0 = r1.mShowDefaultActivity
                if (r0 != r2) goto L8
                boolean r0 = r1.mHighlightDefaultActivity
                if (r0 == r3) goto Lf
            L8:
                r1.mShowDefaultActivity = r2
                r1.mHighlightDefaultActivity = r3
                r1.notifyDataSetChanged()
            Lf:
                return
        }

        public void setShowFooterView(boolean r2) {
                r1 = this;
                boolean r0 = r1.mShowFooterView
                if (r0 == r2) goto L9
                r1.mShowFooterView = r2
                r1.notifyDataSetChanged()
            L9:
                return
        }
    }

    private class Callbacks implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.PopupWindow.OnDismissListener {
        final /* synthetic */ androidx.appcompat.widget.ActivityChooserView this$0;

        Callbacks(androidx.appcompat.widget.ActivityChooserView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private void notifyOnDismissListener() {
                r1 = this;
                androidx.appcompat.widget.ActivityChooserView r0 = r1.this$0
                android.widget.PopupWindow$OnDismissListener r0 = r0.mOnDismissListener
                if (r0 == 0) goto Ld
                androidx.appcompat.widget.ActivityChooserView r0 = r1.this$0
                android.widget.PopupWindow$OnDismissListener r0 = r0.mOnDismissListener
                r0.onDismiss()
            Ld:
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                androidx.appcompat.widget.ActivityChooserView r0 = r1.this$0
                android.widget.FrameLayout r0 = r0.mDefaultActivityButton
                if (r2 != r0) goto L3c
                androidx.appcompat.widget.ActivityChooserView r2 = r1.this$0
                r2.dismissPopup()
                androidx.appcompat.widget.ActivityChooserView r2 = r1.this$0
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r2 = r2.mAdapter
                android.content.pm.ResolveInfo r2 = r2.getDefaultActivity()
                androidx.appcompat.widget.ActivityChooserView r0 = r1.this$0
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r0.mAdapter
                androidx.appcompat.widget.ActivityChooserModel r0 = r0.getDataModel()
                int r2 = r0.getActivityIndex(r2)
                androidx.appcompat.widget.ActivityChooserView r0 = r1.this$0
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r0.mAdapter
                androidx.appcompat.widget.ActivityChooserModel r0 = r0.getDataModel()
                android.content.Intent r2 = r0.chooseActivity(r2)
                if (r2 == 0) goto L4e
                r0 = 524288(0x80000, float:7.34684E-40)
                r2.addFlags(r0)
                androidx.appcompat.widget.ActivityChooserView r0 = r1.this$0
                android.content.Context r0 = r0.getContext()
                r0.startActivity(r2)
                goto L4e
            L3c:
                androidx.appcompat.widget.ActivityChooserView r0 = r1.this$0
                android.widget.FrameLayout r0 = r0.mExpandActivityOverflowButton
                if (r2 != r0) goto L4f
                androidx.appcompat.widget.ActivityChooserView r2 = r1.this$0
                r0 = 0
                r2.mIsSelectingDefaultActivity = r0
                androidx.appcompat.widget.ActivityChooserView r2 = r1.this$0
                int r0 = r2.mInitialActivityCount
                r2.showPopupUnchecked(r0)
            L4e:
                return
            L4f:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r2.<init>()
                throw r2
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
                r2 = this;
                r2.notifyOnDismissListener()
                androidx.appcompat.widget.ActivityChooserView r0 = r2.this$0
                androidx.core.view.ActionProvider r0 = r0.mProvider
                if (r0 == 0) goto L11
                androidx.appcompat.widget.ActivityChooserView r0 = r2.this$0
                androidx.core.view.ActionProvider r0 = r0.mProvider
                r1 = 0
                r0.subUiVisibilityChanged(r1)
            L11:
                return
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                android.widget.Adapter r1 = r1.getAdapter()
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r1 = (androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter) r1
                int r1 = r1.getItemViewType(r3)
                if (r1 == 0) goto L1e
                r2 = 1
                if (r1 != r2) goto L18
                androidx.appcompat.widget.ActivityChooserView r1 = r0.this$0
                r2 = 2147483647(0x7fffffff, float:NaN)
                r1.showPopupUnchecked(r2)
                goto L60
            L18:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>()
                throw r1
            L1e:
                androidx.appcompat.widget.ActivityChooserView r1 = r0.this$0
                r1.dismissPopup()
                androidx.appcompat.widget.ActivityChooserView r1 = r0.this$0
                boolean r1 = r1.mIsSelectingDefaultActivity
                if (r1 == 0) goto L37
                if (r3 <= 0) goto L60
                androidx.appcompat.widget.ActivityChooserView r1 = r0.this$0
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r1 = r1.mAdapter
                androidx.appcompat.widget.ActivityChooserModel r1 = r1.getDataModel()
                r1.setDefaultActivity(r3)
                goto L60
            L37:
                androidx.appcompat.widget.ActivityChooserView r1 = r0.this$0
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r1 = r1.mAdapter
                boolean r1 = r1.getShowDefaultActivity()
                if (r1 == 0) goto L42
                goto L44
            L42:
                int r3 = r3 + 1
            L44:
                androidx.appcompat.widget.ActivityChooserView r1 = r0.this$0
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r1 = r1.mAdapter
                androidx.appcompat.widget.ActivityChooserModel r1 = r1.getDataModel()
                android.content.Intent r1 = r1.chooseActivity(r3)
                if (r1 == 0) goto L60
                r2 = 524288(0x80000, float:7.34684E-40)
                r1.addFlags(r2)
                androidx.appcompat.widget.ActivityChooserView r2 = r0.this$0
                android.content.Context r2 = r2.getContext()
                r2.startActivity(r1)
            L60:
                return
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(android.view.View r3) {
                r2 = this;
                androidx.appcompat.widget.ActivityChooserView r0 = r2.this$0
                android.widget.FrameLayout r0 = r0.mDefaultActivityButton
                if (r3 != r0) goto L1d
                androidx.appcompat.widget.ActivityChooserView r3 = r2.this$0
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r3 = r3.mAdapter
                int r3 = r3.getCount()
                r0 = 1
                if (r3 <= 0) goto L1c
                androidx.appcompat.widget.ActivityChooserView r3 = r2.this$0
                r3.mIsSelectingDefaultActivity = r0
                androidx.appcompat.widget.ActivityChooserView r3 = r2.this$0
                int r1 = r3.mInitialActivityCount
                r3.showPopupUnchecked(r1)
            L1c:
                return r0
            L1d:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                r3.<init>()
                throw r3
        }
    }

    public static class InnerLayout extends android.widget.LinearLayout {
        private static final int[] TINT_ATTRS = null;

        static {
                r0 = 1
                int[] r0 = new int[r0]
                r1 = 0
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r0[r1] = r2
                androidx.appcompat.widget.ActivityChooserView.InnerLayout.TINT_ATTRS = r0
                return
        }

        public InnerLayout(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = androidx.appcompat.widget.ActivityChooserView.InnerLayout.TINT_ATTRS
                androidx.appcompat.widget.TintTypedArray r2 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r2, r3, r0)
                r3 = 0
                android.graphics.drawable.Drawable r3 = r2.getDrawable(r3)
                r1.setBackgroundDrawable(r3)
                r2.recycle()
                return
        }
    }

    public ActivityChooserView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActivityChooserView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ActivityChooserView(android.content.Context r11, android.util.AttributeSet r12, int r13) {
            r10 = this;
            r10.<init>(r11, r12, r13)
            androidx.appcompat.widget.ActivityChooserView$1 r0 = new androidx.appcompat.widget.ActivityChooserView$1
            r0.<init>(r10)
            r10.mModelDataSetObserver = r0
            androidx.appcompat.widget.ActivityChooserView$2 r0 = new androidx.appcompat.widget.ActivityChooserView$2
            r0.<init>(r10)
            r10.mOnGlobalLayoutListener = r0
            r0 = 4
            r10.mInitialActivityCount = r0
            int[] r1 = androidx.appcompat.C0015R.styleable.ActivityChooserView
            r2 = 0
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r1, r13, r2)
            int[] r5 = androidx.appcompat.C0015R.styleable.ActivityChooserView
            r9 = 0
            r3 = r10
            r4 = r11
            r6 = r12
            r7 = r1
            r8 = r13
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r3, r4, r5, r6, r7, r8, r9)
            int r12 = androidx.appcompat.C0015R.styleable.ActivityChooserView_initialActivityCount
            int r12 = r1.getInt(r12, r0)
            r10.mInitialActivityCount = r12
            int r12 = androidx.appcompat.C0015R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable
            android.graphics.drawable.Drawable r12 = r1.getDrawable(r12)
            r1.recycle()
            android.content.Context r13 = r10.getContext()
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r13)
            int r0 = androidx.appcompat.C0015R.layout.abc_activity_chooser_view
            r1 = 1
            r13.inflate(r0, r10, r1)
            androidx.appcompat.widget.ActivityChooserView$Callbacks r13 = new androidx.appcompat.widget.ActivityChooserView$Callbacks
            r13.<init>(r10)
            r10.mCallbacks = r13
            int r0 = androidx.appcompat.C0015R.id.activity_chooser_view_content
            android.view.View r0 = r10.findViewById(r0)
            r10.mActivityChooserContent = r0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r10.mActivityChooserContentBackground = r0
            int r0 = androidx.appcompat.C0015R.id.default_activity_button
            android.view.View r0 = r10.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r10.mDefaultActivityButton = r0
            r0.setOnClickListener(r13)
            r0.setOnLongClickListener(r13)
            int r1 = androidx.appcompat.C0015R.id.image
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r10.mDefaultActivityButtonImage = r0
            int r0 = androidx.appcompat.C0015R.id.expand_activities_button
            android.view.View r0 = r10.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.setOnClickListener(r13)
            androidx.appcompat.widget.ActivityChooserView$3 r13 = new androidx.appcompat.widget.ActivityChooserView$3
            r13.<init>(r10)
            r0.setAccessibilityDelegate(r13)
            androidx.appcompat.widget.ActivityChooserView$4 r13 = new androidx.appcompat.widget.ActivityChooserView$4
            r13.<init>(r10, r0)
            r0.setOnTouchListener(r13)
            r10.mExpandActivityOverflowButton = r0
            int r13 = androidx.appcompat.C0015R.id.image
            android.view.View r13 = r0.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r10.mExpandActivityOverflowButtonImage = r13
            r13.setImageDrawable(r12)
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r12 = new androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter
            r12.<init>(r10)
            r10.mAdapter = r12
            androidx.appcompat.widget.ActivityChooserView$5 r13 = new androidx.appcompat.widget.ActivityChooserView$5
            r13.<init>(r10)
            r12.registerDataSetObserver(r13)
            android.content.res.Resources r11 = r11.getResources()
            android.util.DisplayMetrics r12 = r11.getDisplayMetrics()
            int r12 = r12.widthPixels
            int r12 = r12 / 2
            int r13 = androidx.appcompat.C0015R.dimen.abc_config_prefDialogWidth
            int r11 = r11.getDimensionPixelSize(r13)
            int r11 = java.lang.Math.max(r12, r11)
            r10.mListPopupMaxWidth = r11
            return
    }

    public boolean dismissPopup() {
            r2 = this;
            boolean r0 = r2.isShowingPopup()
            if (r0 == 0) goto L1c
            androidx.appcompat.widget.ListPopupWindow r0 = r2.getListPopupWindow()
            r0.dismiss()
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            boolean r1 = r0.isAlive()
            if (r1 == 0) goto L1c
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.mOnGlobalLayoutListener
            r0.removeGlobalOnLayoutListener(r1)
        L1c:
            r0 = 1
            return r0
    }

    public androidx.appcompat.widget.ActivityChooserModel getDataModel() {
            r1 = this;
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r1.mAdapter
            androidx.appcompat.widget.ActivityChooserModel r0 = r0.getDataModel()
            return r0
    }

    androidx.appcompat.widget.ListPopupWindow getListPopupWindow() {
            r2 = this;
            androidx.appcompat.widget.ListPopupWindow r0 = r2.mListPopupWindow
            if (r0 != 0) goto L2d
            androidx.appcompat.widget.ListPopupWindow r0 = new androidx.appcompat.widget.ListPopupWindow
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.mListPopupWindow = r0
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r1 = r2.mAdapter
            r0.setAdapter(r1)
            androidx.appcompat.widget.ListPopupWindow r0 = r2.mListPopupWindow
            r0.setAnchorView(r2)
            androidx.appcompat.widget.ListPopupWindow r0 = r2.mListPopupWindow
            r1 = 1
            r0.setModal(r1)
            androidx.appcompat.widget.ListPopupWindow r0 = r2.mListPopupWindow
            androidx.appcompat.widget.ActivityChooserView$Callbacks r1 = r2.mCallbacks
            r0.setOnItemClickListener(r1)
            androidx.appcompat.widget.ListPopupWindow r0 = r2.mListPopupWindow
            androidx.appcompat.widget.ActivityChooserView$Callbacks r1 = r2.mCallbacks
            r0.setOnDismissListener(r1)
        L2d:
            androidx.appcompat.widget.ListPopupWindow r0 = r2.mListPopupWindow
            return r0
    }

    public boolean isShowingPopup() {
            r1 = this;
            androidx.appcompat.widget.ListPopupWindow r0 = r1.getListPopupWindow()
            boolean r0 = r0.isShowing()
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r2.mAdapter
            androidx.appcompat.widget.ActivityChooserModel r0 = r0.getDataModel()
            if (r0 == 0) goto L10
            android.database.DataSetObserver r1 = r2.mModelDataSetObserver
            r0.registerObserver(r1)
        L10:
            r0 = 1
            r2.mIsAttachedToWindow = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r2.mAdapter
            androidx.appcompat.widget.ActivityChooserModel r0 = r0.getDataModel()
            if (r0 == 0) goto L10
            android.database.DataSetObserver r1 = r2.mModelDataSetObserver
            r0.unregisterObserver(r1)
        L10:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            boolean r1 = r0.isAlive()
            if (r1 == 0) goto L1f
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.mOnGlobalLayoutListener
            r0.removeGlobalOnLayoutListener(r1)
        L1f:
            boolean r0 = r2.isShowingPopup()
            if (r0 == 0) goto L28
            r2.dismissPopup()
        L28:
            r0 = 0
            r2.mIsAttachedToWindow = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            android.view.View r1 = r0.mActivityChooserContent
            int r4 = r4 - r2
            int r5 = r5 - r3
            r2 = 0
            r1.layout(r2, r2, r4, r5)
            boolean r1 = r0.isShowingPopup()
            if (r1 != 0) goto L11
            r0.dismissPopup()
        L11:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            android.view.View r0 = r2.mActivityChooserContent
            android.widget.FrameLayout r1 = r2.mDefaultActivityButton
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L14
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
        L14:
            r2.measureChild(r0, r3, r4)
            int r3 = r0.getMeasuredWidth()
            int r4 = r0.getMeasuredHeight()
            r2.setMeasuredDimension(r3, r4)
            return
    }

    @Override // androidx.appcompat.widget.ActivityChooserModel.ActivityChooserModelClient
    public void setActivityChooserModel(androidx.appcompat.widget.ActivityChooserModel r2) {
            r1 = this;
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r1.mAdapter
            r0.setDataModel(r2)
            boolean r2 = r1.isShowingPopup()
            if (r2 == 0) goto L11
            r1.dismissPopup()
            r1.showPopup()
        L11:
            return
    }

    public void setDefaultActionButtonContentDescription(int r1) {
            r0 = this;
            r0.mDefaultActionButtonContentDescription = r1
            return
    }

    public void setExpandActivityOverflowButtonContentDescription(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.String r2 = r0.getString(r2)
            android.widget.ImageView r0 = r1.mExpandActivityOverflowButtonImage
            r0.setContentDescription(r2)
            return
    }

    public void setExpandActivityOverflowButtonDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.mExpandActivityOverflowButtonImage
            r0.setImageDrawable(r2)
            return
    }

    public void setInitialActivityCount(int r1) {
            r0 = this;
            r0.mInitialActivityCount = r1
            return
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.mOnDismissListener = r1
            return
    }

    public void setProvider(androidx.core.view.ActionProvider r1) {
            r0 = this;
            r0.mProvider = r1
            return
    }

    public boolean showPopup() {
            r2 = this;
            boolean r0 = r2.isShowingPopup()
            r1 = 0
            if (r0 != 0) goto L15
            boolean r0 = r2.mIsAttachedToWindow
            if (r0 != 0) goto Lc
            goto L15
        Lc:
            r2.mIsSelectingDefaultActivity = r1
            int r0 = r2.mInitialActivityCount
            r2.showPopupUnchecked(r0)
            r0 = 1
            return r0
        L15:
            return r1
    }

    void showPopupUnchecked(int r6) {
            r5 = this;
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r5.mAdapter
            androidx.appcompat.widget.ActivityChooserModel r0 = r0.getDataModel()
            if (r0 == 0) goto L96
            android.view.ViewTreeObserver r0 = r5.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r5.mOnGlobalLayoutListener
            r0.addOnGlobalLayoutListener(r1)
            android.widget.FrameLayout r0 = r5.mDefaultActivityButton
            int r0 = r0.getVisibility()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1d
            r0 = r1
            goto L1e
        L1d:
            r0 = r2
        L1e:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r3 = r5.mAdapter
            int r3 = r3.getActivityCount()
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r4) goto L39
            int r4 = r6 + r0
            if (r3 <= r4) goto L39
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r3 = r5.mAdapter
            r3.setShowFooterView(r1)
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r3 = r5.mAdapter
            int r6 = r6 - r1
            r3.setMaxActivityCount(r6)
            goto L43
        L39:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r3 = r5.mAdapter
            r3.setShowFooterView(r2)
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r3 = r5.mAdapter
            r3.setMaxActivityCount(r6)
        L43:
            androidx.appcompat.widget.ListPopupWindow r6 = r5.getListPopupWindow()
            boolean r3 = r6.isShowing()
            if (r3 != 0) goto L95
            boolean r3 = r5.mIsSelectingDefaultActivity
            if (r3 != 0) goto L5a
            if (r0 != 0) goto L54
            goto L5a
        L54:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r5.mAdapter
            r0.setShowDefaultActivity(r2, r2)
            goto L5f
        L5a:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r3 = r5.mAdapter
            r3.setShowDefaultActivity(r1, r0)
        L5f:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r5.mAdapter
            int r0 = r0.measureContentWidth()
            int r3 = r5.mListPopupMaxWidth
            int r0 = java.lang.Math.min(r0, r3)
            r6.setContentWidth(r0)
            r6.show()
            androidx.core.view.ActionProvider r0 = r5.mProvider
            if (r0 == 0) goto L78
            r0.subUiVisibilityChanged(r1)
        L78:
            android.widget.ListView r0 = r6.getListView()
            android.content.Context r1 = r5.getContext()
            int r3 = androidx.appcompat.C0015R.string.abc_activitychooserview_choose_application
            java.lang.String r1 = r1.getString(r3)
            r0.setContentDescription(r1)
            android.widget.ListView r6 = r6.getListView()
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r6.setSelector(r0)
        L95:
            return
        L96:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "No data model. Did you call #setDataModel?"
            r6.<init>(r0)
            throw r6
    }

    void updateAppearance() {
            r6 = this;
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r6.mAdapter
            int r0 = r0.getCount()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L10
            android.widget.FrameLayout r0 = r6.mExpandActivityOverflowButton
            r0.setEnabled(r2)
            goto L15
        L10:
            android.widget.FrameLayout r0 = r6.mExpandActivityOverflowButton
            r0.setEnabled(r1)
        L15:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r6.mAdapter
            int r0 = r0.getActivityCount()
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r3 = r6.mAdapter
            int r3 = r3.getHistorySize()
            if (r0 == r2) goto L30
            if (r0 <= r2) goto L28
            if (r3 <= 0) goto L28
            goto L30
        L28:
            android.widget.FrameLayout r0 = r6.mDefaultActivityButton
            r1 = 8
            r0.setVisibility(r1)
            goto L67
        L30:
            android.widget.FrameLayout r0 = r6.mDefaultActivityButton
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r6.mAdapter
            android.content.pm.ResolveInfo r0 = r0.getDefaultActivity()
            android.content.Context r3 = r6.getContext()
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            android.widget.ImageView r4 = r6.mDefaultActivityButtonImage
            android.graphics.drawable.Drawable r5 = r0.loadIcon(r3)
            r4.setImageDrawable(r5)
            int r4 = r6.mDefaultActionButtonContentDescription
            if (r4 == 0) goto L67
            java.lang.CharSequence r0 = r0.loadLabel(r3)
            android.content.Context r3 = r6.getContext()
            int r4 = r6.mDefaultActionButtonContentDescription
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r0 = r3.getString(r4, r2)
            android.widget.FrameLayout r1 = r6.mDefaultActivityButton
            r1.setContentDescription(r0)
        L67:
            android.widget.FrameLayout r0 = r6.mDefaultActivityButton
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L77
            android.view.View r0 = r6.mActivityChooserContent
            android.graphics.drawable.Drawable r1 = r6.mActivityChooserContentBackground
            r0.setBackgroundDrawable(r1)
            goto L7d
        L77:
            android.view.View r0 = r6.mActivityChooserContent
            r1 = 0
            r0.setBackgroundDrawable(r1)
        L7d:
            return
    }
}
