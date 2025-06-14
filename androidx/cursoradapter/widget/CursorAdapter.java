package androidx.cursoradapter.widget;

/* loaded from: classes.dex */
public abstract class CursorAdapter extends android.widget.BaseAdapter implements android.widget.Filterable, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient {

    @java.lang.Deprecated
    public static final int FLAG_AUTO_REQUERY = 1;
    public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
    protected boolean mAutoRequery;
    protected androidx.cursoradapter.widget.CursorAdapter.ChangeObserver mChangeObserver;
    protected android.content.Context mContext;
    protected android.database.Cursor mCursor;
    protected androidx.cursoradapter.widget.CursorFilter mCursorFilter;
    protected android.database.DataSetObserver mDataSetObserver;
    protected boolean mDataValid;
    protected android.widget.FilterQueryProvider mFilterQueryProvider;
    protected int mRowIDColumn;

    private class ChangeObserver extends android.database.ContentObserver {
        final /* synthetic */ androidx.cursoradapter.widget.CursorAdapter this$0;

        ChangeObserver(androidx.cursoradapter.widget.CursorAdapter r1) {
                r0 = this;
                r0.this$0 = r1
                android.os.Handler r1 = new android.os.Handler
                r1.<init>()
                r0.<init>(r1)
                return
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean r1) {
                r0 = this;
                androidx.cursoradapter.widget.CursorAdapter r1 = r0.this$0
                r1.onContentChanged()
                return
        }
    }

    private class MyDataSetObserver extends android.database.DataSetObserver {
        final /* synthetic */ androidx.cursoradapter.widget.CursorAdapter this$0;

        MyDataSetObserver(androidx.cursoradapter.widget.CursorAdapter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r2 = this;
                androidx.cursoradapter.widget.CursorAdapter r0 = r2.this$0
                r1 = 1
                r0.mDataValid = r1
                androidx.cursoradapter.widget.CursorAdapter r0 = r2.this$0
                r0.notifyDataSetChanged()
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r2 = this;
                androidx.cursoradapter.widget.CursorAdapter r0 = r2.this$0
                r1 = 0
                r0.mDataValid = r1
                androidx.cursoradapter.widget.CursorAdapter r0 = r2.this$0
                r0.notifyDataSetInvalidated()
                return
        }
    }

    @java.lang.Deprecated
    public CursorAdapter(android.content.Context r2, android.database.Cursor r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.init(r2, r3, r0)
            return
    }

    public CursorAdapter(android.content.Context r1, android.database.Cursor r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.init(r1, r2, r3)
            return
    }

    public CursorAdapter(android.content.Context r1, android.database.Cursor r2, boolean r3) {
            r0 = this;
            r0.<init>()
            if (r3 == 0) goto L7
            r3 = 1
            goto L8
        L7:
            r3 = 2
        L8:
            r0.init(r1, r2, r3)
            return
    }

    public abstract void bindView(android.view.View r1, android.content.Context r2, android.database.Cursor r3);

    public void changeCursor(android.database.Cursor r1) {
            r0 = this;
            android.database.Cursor r1 = r0.swapCursor(r1)
            if (r1 == 0) goto L9
            r1.close()
        L9:
            return
    }

    public java.lang.CharSequence convertToString(android.database.Cursor r1) {
            r0 = this;
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            goto L9
        L5:
            java.lang.String r1 = r1.toString()
        L9:
            return r1
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            boolean r0 = r1.mDataValid
            if (r0 == 0) goto Ld
            android.database.Cursor r0 = r1.mCursor
            if (r0 == 0) goto Ld
            int r0 = r0.getCount()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public android.database.Cursor getCursor() {
            r1 = this;
            android.database.Cursor r0 = r1.mCursor
            return r0
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r1.mDataValid
            if (r0 == 0) goto L1b
            android.database.Cursor r0 = r1.mCursor
            r0.moveToPosition(r2)
            if (r3 != 0) goto L13
            android.content.Context r2 = r1.mContext
            android.database.Cursor r3 = r1.mCursor
            android.view.View r3 = r1.newDropDownView(r2, r3, r4)
        L13:
            android.content.Context r2 = r1.mContext
            android.database.Cursor r4 = r1.mCursor
            r1.bindView(r3, r2, r4)
            return r3
        L1b:
            r2 = 0
            return r2
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
            r1 = this;
            androidx.cursoradapter.widget.CursorFilter r0 = r1.mCursorFilter
            if (r0 != 0) goto Lb
            androidx.cursoradapter.widget.CursorFilter r0 = new androidx.cursoradapter.widget.CursorFilter
            r0.<init>(r1)
            r1.mCursorFilter = r0
        Lb:
            androidx.cursoradapter.widget.CursorFilter r0 = r1.mCursorFilter
            return r0
    }

    public android.widget.FilterQueryProvider getFilterQueryProvider() {
            r1 = this;
            android.widget.FilterQueryProvider r0 = r1.mFilterQueryProvider
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int r2) {
            r1 = this;
            boolean r0 = r1.mDataValid
            if (r0 == 0) goto Le
            android.database.Cursor r0 = r1.mCursor
            if (r0 == 0) goto Le
            r0.moveToPosition(r2)
            android.database.Cursor r2 = r1.mCursor
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // android.widget.Adapter
    public long getItemId(int r4) {
            r3 = this;
            boolean r0 = r3.mDataValid
            r1 = 0
            if (r0 == 0) goto L19
            android.database.Cursor r0 = r3.mCursor
            if (r0 == 0) goto L19
            boolean r4 = r0.moveToPosition(r4)
            if (r4 == 0) goto L19
            android.database.Cursor r4 = r3.mCursor
            int r0 = r3.mRowIDColumn
            long r0 = r4.getLong(r0)
            return r0
        L19:
            return r1
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r1.mDataValid
            if (r0 == 0) goto L33
            android.database.Cursor r0 = r1.mCursor
            boolean r0 = r0.moveToPosition(r2)
            if (r0 == 0) goto L1e
            if (r3 != 0) goto L16
            android.content.Context r2 = r1.mContext
            android.database.Cursor r3 = r1.mCursor
            android.view.View r3 = r1.newView(r2, r3, r4)
        L16:
            android.content.Context r2 = r1.mContext
            android.database.Cursor r4 = r1.mCursor
            r1.bindView(r3, r2, r4)
            return r3
        L1e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "couldn't move cursor to position "
            r4.<init>(r0)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L33:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "this should only be called when the cursor is valid"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r1 = this;
            r0 = 1
            return r0
    }

    void init(android.content.Context r4, android.database.Cursor r5, int r6) {
            r3 = this;
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lb
            r6 = r6 | 2
            r3.mAutoRequery = r2
            goto Ld
        Lb:
            r3.mAutoRequery = r1
        Ld:
            if (r5 == 0) goto L10
            r1 = r2
        L10:
            r3.mCursor = r5
            r3.mDataValid = r1
            r3.mContext = r4
            if (r1 == 0) goto L1f
            java.lang.String r4 = "_id"
            int r4 = r5.getColumnIndexOrThrow(r4)
            goto L20
        L1f:
            r4 = -1
        L20:
            r3.mRowIDColumn = r4
            r4 = 2
            r6 = r6 & r4
            if (r6 != r4) goto L35
            androidx.cursoradapter.widget.CursorAdapter$ChangeObserver r4 = new androidx.cursoradapter.widget.CursorAdapter$ChangeObserver
            r4.<init>(r3)
            r3.mChangeObserver = r4
            androidx.cursoradapter.widget.CursorAdapter$MyDataSetObserver r4 = new androidx.cursoradapter.widget.CursorAdapter$MyDataSetObserver
            r4.<init>(r3)
            r3.mDataSetObserver = r4
            goto L3a
        L35:
            r4 = 0
            r3.mChangeObserver = r4
            r3.mDataSetObserver = r4
        L3a:
            if (r1 == 0) goto L4a
            androidx.cursoradapter.widget.CursorAdapter$ChangeObserver r4 = r3.mChangeObserver
            if (r4 == 0) goto L43
            r5.registerContentObserver(r4)
        L43:
            android.database.DataSetObserver r4 = r3.mDataSetObserver
            if (r4 == 0) goto L4a
            r5.registerDataSetObserver(r4)
        L4a:
            return
    }

    @java.lang.Deprecated
    protected void init(android.content.Context r1, android.database.Cursor r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L4
            r3 = 1
            goto L5
        L4:
            r3 = 2
        L5:
            r0.init(r1, r2, r3)
            return
    }

    public android.view.View newDropDownView(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3) {
            r0 = this;
            android.view.View r1 = r0.newView(r1, r2, r3)
            return r1
    }

    public abstract android.view.View newView(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3);

    protected void onContentChanged() {
            r1 = this;
            boolean r0 = r1.mAutoRequery
            if (r0 == 0) goto L16
            android.database.Cursor r0 = r1.mCursor
            if (r0 == 0) goto L16
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L16
            android.database.Cursor r0 = r1.mCursor
            boolean r0 = r0.requery()
            r1.mDataValid = r0
        L16:
            return
    }

    public android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.FilterQueryProvider r0 = r1.mFilterQueryProvider
            if (r0 == 0) goto L9
            android.database.Cursor r2 = r0.runQuery(r2)
            return r2
        L9:
            android.database.Cursor r2 = r1.mCursor
            return r2
    }

    public void setFilterQueryProvider(android.widget.FilterQueryProvider r1) {
            r0 = this;
            r0.mFilterQueryProvider = r1
            return
    }

    public android.database.Cursor swapCursor(android.database.Cursor r3) {
            r2 = this;
            android.database.Cursor r0 = r2.mCursor
            if (r3 != r0) goto L6
            r3 = 0
            return r3
        L6:
            if (r0 == 0) goto L16
            androidx.cursoradapter.widget.CursorAdapter$ChangeObserver r1 = r2.mChangeObserver
            if (r1 == 0) goto Lf
            r0.unregisterContentObserver(r1)
        Lf:
            android.database.DataSetObserver r1 = r2.mDataSetObserver
            if (r1 == 0) goto L16
            r0.unregisterDataSetObserver(r1)
        L16:
            r2.mCursor = r3
            if (r3 == 0) goto L37
            androidx.cursoradapter.widget.CursorAdapter$ChangeObserver r1 = r2.mChangeObserver
            if (r1 == 0) goto L21
            r3.registerContentObserver(r1)
        L21:
            android.database.DataSetObserver r1 = r2.mDataSetObserver
            if (r1 == 0) goto L28
            r3.registerDataSetObserver(r1)
        L28:
            java.lang.String r1 = "_id"
            int r3 = r3.getColumnIndexOrThrow(r1)
            r2.mRowIDColumn = r3
            r3 = 1
            r2.mDataValid = r3
            r2.notifyDataSetChanged()
            goto L40
        L37:
            r3 = -1
            r2.mRowIDColumn = r3
            r3 = 0
            r2.mDataValid = r3
            r2.notifyDataSetInvalidated()
        L40:
            return r0
    }
}
