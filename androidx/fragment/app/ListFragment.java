package androidx.fragment.app;

/* loaded from: classes.dex */
public class ListFragment extends androidx.fragment.app.Fragment {
    static final int INTERNAL_EMPTY_ID = 16711681;
    static final int INTERNAL_LIST_CONTAINER_ID = 16711683;
    static final int INTERNAL_PROGRESS_CONTAINER_ID = 16711682;
    android.widget.ListAdapter mAdapter;
    java.lang.CharSequence mEmptyText;
    android.view.View mEmptyView;
    private final android.os.Handler mHandler;
    android.widget.ListView mList;
    android.view.View mListContainer;
    boolean mListShown;
    private final android.widget.AdapterView.OnItemClickListener mOnClickListener;
    android.view.View mProgressContainer;
    private final java.lang.Runnable mRequestFocus;
    android.widget.TextView mStandardEmptyView;



    public ListFragment() {
            r1 = this;
            r1.<init>()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1.mHandler = r0
            androidx.fragment.app.ListFragment$1 r0 = new androidx.fragment.app.ListFragment$1
            r0.<init>(r1)
            r1.mRequestFocus = r0
            androidx.fragment.app.ListFragment$2 r0 = new androidx.fragment.app.ListFragment$2
            r0.<init>(r1)
            r1.mOnClickListener = r0
            return
    }

    private void ensureList() {
            r3 = this;
            android.widget.ListView r0 = r3.mList
            if (r0 == 0) goto L5
            return
        L5:
            android.view.View r0 = r3.getView()
            if (r0 == 0) goto La0
            boolean r1 = r0 instanceof android.widget.ListView
            if (r1 == 0) goto L14
            android.widget.ListView r0 = (android.widget.ListView) r0
            r3.mList = r0
            goto L7b
        L14:
            r1 = 16711681(0xff0001, float:2.3418053E-38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3.mStandardEmptyView = r1
            if (r1 != 0) goto L2b
            r1 = 16908292(0x1020004, float:2.387724E-38)
            android.view.View r1 = r0.findViewById(r1)
            r3.mEmptyView = r1
            goto L30
        L2b:
            r2 = 8
            r1.setVisibility(r2)
        L30:
            r1 = 16711682(0xff0002, float:2.3418054E-38)
            android.view.View r1 = r0.findViewById(r1)
            r3.mProgressContainer = r1
            r1 = 16711683(0xff0003, float:2.3418056E-38)
            android.view.View r1 = r0.findViewById(r1)
            r3.mListContainer = r1
            r1 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r0 = r0.findViewById(r1)
            boolean r1 = r0 instanceof android.widget.ListView
            if (r1 != 0) goto L5f
            if (r0 != 0) goto L57
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Your content must have a ListView whose id attribute is 'android.R.id.list'"
            r0.<init>(r1)
            throw r0
        L57:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Content has view with id attribute 'android.R.id.list' that is not a ListView class"
            r0.<init>(r1)
            throw r0
        L5f:
            android.widget.ListView r0 = (android.widget.ListView) r0
            r3.mList = r0
            android.view.View r1 = r3.mEmptyView
            if (r1 == 0) goto L6b
            r0.setEmptyView(r1)
            goto L7b
        L6b:
            java.lang.CharSequence r0 = r3.mEmptyText
            if (r0 == 0) goto L7b
            android.widget.TextView r1 = r3.mStandardEmptyView
            r1.setText(r0)
            android.widget.ListView r0 = r3.mList
            android.widget.TextView r1 = r3.mStandardEmptyView
            r0.setEmptyView(r1)
        L7b:
            r0 = 1
            r3.mListShown = r0
            android.widget.ListView r0 = r3.mList
            android.widget.AdapterView$OnItemClickListener r1 = r3.mOnClickListener
            r0.setOnItemClickListener(r1)
            android.widget.ListAdapter r0 = r3.mAdapter
            if (r0 == 0) goto L90
            r1 = 0
            r3.mAdapter = r1
            r3.setListAdapter(r0)
            goto L98
        L90:
            android.view.View r0 = r3.mProgressContainer
            if (r0 == 0) goto L98
            r0 = 0
            r3.setListShown(r0, r0)
        L98:
            android.os.Handler r0 = r3.mHandler
            java.lang.Runnable r1 = r3.mRequestFocus
            r0.post(r1)
            return
        La0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Content view not yet created"
            r0.<init>(r1)
            throw r0
    }

    private void setListShown(boolean r6, boolean r7) {
            r5 = this;
            r5.ensureList()
            android.view.View r0 = r5.mProgressContainer
            if (r0 == 0) goto L74
            boolean r1 = r5.mListShown
            if (r1 != r6) goto Lc
            return
        Lc:
            r5.mListShown = r6
            r1 = 8
            r2 = 0
            r3 = 17432577(0x10a0001, float:2.53466E-38)
            r4 = 17432576(0x10a0000, float:2.5346597E-38)
            if (r6 == 0) goto L46
            if (r7 == 0) goto L33
            android.content.Context r6 = r5.getContext()
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r6, r3)
            r0.startAnimation(r6)
            android.view.View r6 = r5.mListContainer
            android.content.Context r7 = r5.getContext()
            android.view.animation.Animation r7 = android.view.animation.AnimationUtils.loadAnimation(r7, r4)
            r6.startAnimation(r7)
            goto L3b
        L33:
            r0.clearAnimation()
            android.view.View r6 = r5.mListContainer
            r6.clearAnimation()
        L3b:
            android.view.View r6 = r5.mProgressContainer
            r6.setVisibility(r1)
            android.view.View r6 = r5.mListContainer
            r6.setVisibility(r2)
            goto L73
        L46:
            if (r7 == 0) goto L61
            android.content.Context r6 = r5.getContext()
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r6, r4)
            r0.startAnimation(r6)
            android.view.View r6 = r5.mListContainer
            android.content.Context r7 = r5.getContext()
            android.view.animation.Animation r7 = android.view.animation.AnimationUtils.loadAnimation(r7, r3)
            r6.startAnimation(r7)
            goto L69
        L61:
            r0.clearAnimation()
            android.view.View r6 = r5.mListContainer
            r6.clearAnimation()
        L69:
            android.view.View r6 = r5.mProgressContainer
            r6.setVisibility(r2)
            android.view.View r6 = r5.mListContainer
            r6.setVisibility(r1)
        L73:
            return
        L74:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Can't be used with a custom content view"
            r6.<init>(r7)
            throw r6
    }

    public android.widget.ListAdapter getListAdapter() {
            r1 = this;
            android.widget.ListAdapter r0 = r1.mAdapter
            return r0
    }

    public android.widget.ListView getListView() {
            r1 = this;
            r1.ensureList()
            android.widget.ListView r0 = r1.mList
            return r0
    }

    public long getSelectedItemId() {
            r2 = this;
            r2.ensureList()
            android.widget.ListView r0 = r2.mList
            long r0 = r0.getSelectedItemId()
            return r0
    }

    public int getSelectedItemPosition() {
            r1 = this;
            r1.ensureList()
            android.widget.ListView r0 = r1.mList
            int r0 = r0.getSelectedItemPosition()
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
            r4 = this;
            android.content.Context r5 = r4.requireContext()
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r6.<init>(r5)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r5)
            r0 = 16711682(0xff0002, float:2.3418054E-38)
            r7.setId(r0)
            r0 = 1
            r7.setOrientation(r0)
            r0 = 8
            r7.setVisibility(r0)
            r0 = 17
            r7.setGravity(r0)
            android.widget.ProgressBar r1 = new android.widget.ProgressBar
            r2 = 0
            r3 = 16842874(0x101007a, float:2.36939E-38)
            r1.<init>(r5, r2, r3)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r2.<init>(r3, r3)
            r7.addView(r1, r2)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r6.addView(r7, r1)
            android.widget.FrameLayout r7 = new android.widget.FrameLayout
            r7.<init>(r5)
            r1 = 16711683(0xff0003, float:2.3418056E-38)
            r7.setId(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r5)
            r3 = 16711681(0xff0001, float:2.3418053E-38)
            r1.setId(r3)
            r1.setGravity(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r2, r2)
            r7.addView(r1, r0)
            android.widget.ListView r0 = new android.widget.ListView
            r0.<init>(r5)
            r5 = 16908298(0x102000a, float:2.3877257E-38)
            r0.setId(r5)
            r5 = 0
            r0.setDrawSelectorOnTop(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r2, r2)
            r7.addView(r0, r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r2, r2)
            r6.addView(r7, r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r2, r2)
            r6.setLayoutParams(r5)
            return r6
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
            r2 = this;
            android.os.Handler r0 = r2.mHandler
            java.lang.Runnable r1 = r2.mRequestFocus
            r0.removeCallbacks(r1)
            r0 = 0
            r2.mList = r0
            r1 = 0
            r2.mListShown = r1
            r2.mListContainer = r0
            r2.mProgressContainer = r0
            r2.mEmptyView = r0
            r2.mStandardEmptyView = r0
            super.onDestroyView()
            return
    }

    public void onListItemClick(android.widget.ListView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View r1, android.os.Bundle r2) {
            r0 = this;
            super.onViewCreated(r1, r2)
            r0.ensureList()
            return
    }

    public final android.widget.ListAdapter requireListAdapter() {
            r3 = this;
            android.widget.ListAdapter r0 = r3.getListAdapter()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ListFragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " does not have a ListAdapter."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void setEmptyText(java.lang.CharSequence r3) {
            r2 = this;
            r2.ensureList()
            android.widget.TextView r0 = r2.mStandardEmptyView
            if (r0 == 0) goto L18
            r0.setText(r3)
            java.lang.CharSequence r0 = r2.mEmptyText
            if (r0 != 0) goto L15
            android.widget.ListView r0 = r2.mList
            android.widget.TextView r1 = r2.mStandardEmptyView
            r0.setEmptyView(r1)
        L15:
            r2.mEmptyText = r3
            return
        L18:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't be used with a custom content view"
            r3.<init>(r0)
            throw r3
    }

    public void setListAdapter(android.widget.ListAdapter r5) {
            r4 = this;
            android.widget.ListAdapter r0 = r4.mAdapter
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r4.mAdapter = r5
            android.widget.ListView r3 = r4.mList
            if (r3 == 0) goto L26
            r3.setAdapter(r5)
            boolean r5 = r4.mListShown
            if (r5 != 0) goto L26
            if (r0 != 0) goto L26
            android.view.View r5 = r4.requireView()
            android.os.IBinder r5 = r5.getWindowToken()
            if (r5 == 0) goto L23
            r1 = r2
        L23:
            r4.setListShown(r2, r1)
        L26:
            return
    }

    public void setListShown(boolean r2) {
            r1 = this;
            r0 = 1
            r1.setListShown(r2, r0)
            return
    }

    public void setListShownNoAnimation(boolean r2) {
            r1 = this;
            r0 = 0
            r1.setListShown(r2, r0)
            return
    }

    public void setSelection(int r2) {
            r1 = this;
            r1.ensureList()
            android.widget.ListView r0 = r1.mList
            r0.setSelection(r2)
            return
    }
}
