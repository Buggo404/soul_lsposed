package androidx.cursoradapter.widget;

/* loaded from: classes.dex */
class CursorFilter extends android.widget.Filter {
    androidx.cursoradapter.widget.CursorFilter.CursorFilterClient mClient;

    interface CursorFilterClient {
        void changeCursor(android.database.Cursor r1);

        java.lang.CharSequence convertToString(android.database.Cursor r1);

        android.database.Cursor getCursor();

        android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence r1);
    }

    CursorFilter(androidx.cursoradapter.widget.CursorFilter.CursorFilterClient r1) {
            r0 = this;
            r0.<init>()
            r0.mClient = r1
            return
    }

    @Override // android.widget.Filter
    public java.lang.CharSequence convertResultToString(java.lang.Object r2) {
            r1 = this;
            androidx.cursoradapter.widget.CursorFilter$CursorFilterClient r0 = r1.mClient
            android.database.Cursor r2 = (android.database.Cursor) r2
            java.lang.CharSequence r2 = r0.convertToString(r2)
            return r2
    }

    @Override // android.widget.Filter
    protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r3) {
            r2 = this;
            androidx.cursoradapter.widget.CursorFilter$CursorFilterClient r0 = r2.mClient
            android.database.Cursor r3 = r0.runQueryOnBackgroundThread(r3)
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r3 == 0) goto L16
            int r1 = r3.getCount()
            r0.count = r1
            r0.values = r3
            goto L1c
        L16:
            r3 = 0
            r0.count = r3
            r3 = 0
            r0.values = r3
        L1c:
            return r0
    }

    @Override // android.widget.Filter
    protected void publishResults(java.lang.CharSequence r2, android.widget.Filter.FilterResults r3) {
            r1 = this;
            androidx.cursoradapter.widget.CursorFilter$CursorFilterClient r2 = r1.mClient
            android.database.Cursor r2 = r2.getCursor()
            java.lang.Object r0 = r3.values
            if (r0 == 0) goto L17
            java.lang.Object r0 = r3.values
            if (r0 == r2) goto L17
            androidx.cursoradapter.widget.CursorFilter$CursorFilterClient r2 = r1.mClient
            java.lang.Object r3 = r3.values
            android.database.Cursor r3 = (android.database.Cursor) r3
            r2.changeCursor(r3)
        L17:
            return
    }
}
