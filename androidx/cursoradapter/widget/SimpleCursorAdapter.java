package androidx.cursoradapter.widget;

/* loaded from: classes.dex */
public class SimpleCursorAdapter extends androidx.cursoradapter.widget.ResourceCursorAdapter {
    private androidx.cursoradapter.widget.SimpleCursorAdapter.CursorToStringConverter mCursorToStringConverter;
    protected int[] mFrom;
    java.lang.String[] mOriginalFrom;
    private int mStringConversionColumn;
    protected int[] mTo;
    private androidx.cursoradapter.widget.SimpleCursorAdapter.ViewBinder mViewBinder;

    public interface CursorToStringConverter {
        java.lang.CharSequence convertToString(android.database.Cursor r1);
    }

    public interface ViewBinder {
        boolean setViewValue(android.view.View r1, android.database.Cursor r2, int r3);
    }

    @java.lang.Deprecated
    public SimpleCursorAdapter(android.content.Context r1, int r2, android.database.Cursor r3, java.lang.String[] r4, int[] r5) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -1
            r0.mStringConversionColumn = r1
            r0.mTo = r5
            r0.mOriginalFrom = r4
            r0.findColumns(r3, r4)
            return
    }

    public SimpleCursorAdapter(android.content.Context r1, int r2, android.database.Cursor r3, java.lang.String[] r4, int[] r5, int r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r6)
            r1 = -1
            r0.mStringConversionColumn = r1
            r0.mTo = r5
            r0.mOriginalFrom = r4
            r0.findColumns(r3, r4)
            return
    }

    private void findColumns(android.database.Cursor r5, java.lang.String[] r6) {
            r4 = this;
            if (r5 == 0) goto L1e
            int r0 = r6.length
            int[] r1 = r4.mFrom
            if (r1 == 0) goto La
            int r1 = r1.length
            if (r1 == r0) goto Le
        La:
            int[] r1 = new int[r0]
            r4.mFrom = r1
        Le:
            r1 = 0
        Lf:
            if (r1 >= r0) goto L21
            int[] r2 = r4.mFrom
            r3 = r6[r1]
            int r3 = r5.getColumnIndexOrThrow(r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lf
        L1e:
            r5 = 0
            r4.mFrom = r5
        L21:
            return
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(android.view.View r9, android.content.Context r10, android.database.Cursor r11) {
            r8 = this;
            androidx.cursoradapter.widget.SimpleCursorAdapter$ViewBinder r10 = r8.mViewBinder
            int[] r0 = r8.mTo
            int r1 = r0.length
            int[] r2 = r8.mFrom
            r3 = 0
            r4 = r3
        L9:
            if (r4 >= r1) goto L61
            r5 = r0[r4]
            android.view.View r5 = r9.findViewById(r5)
            if (r5 == 0) goto L5e
            if (r10 == 0) goto L1c
            r6 = r2[r4]
            boolean r6 = r10.setViewValue(r5, r11, r6)
            goto L1d
        L1c:
            r6 = r3
        L1d:
            if (r6 != 0) goto L5e
            r6 = r2[r4]
            java.lang.String r6 = r11.getString(r6)
            if (r6 != 0) goto L29
            java.lang.String r6 = ""
        L29:
            boolean r7 = r5 instanceof android.widget.TextView
            if (r7 == 0) goto L33
            android.widget.TextView r5 = (android.widget.TextView) r5
            r8.setViewText(r5, r6)
            goto L5e
        L33:
            boolean r7 = r5 instanceof android.widget.ImageView
            if (r7 == 0) goto L3d
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r8.setViewImage(r5, r6)
            goto L5e
        L3d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.Class r11 = r5.getClass()
            java.lang.String r11 = r11.getName()
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = " is not a  view that can be bounds by this SimpleCursorAdapter"
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L5e:
            int r4 = r4 + 1
            goto L9
        L61:
            return
    }

    public void changeCursorAndColumns(android.database.Cursor r1, java.lang.String[] r2, int[] r3) {
            r0 = this;
            r0.mOriginalFrom = r2
            r0.mTo = r3
            r0.findColumns(r1, r2)
            super.changeCursor(r1)
            return
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public java.lang.CharSequence convertToString(android.database.Cursor r3) {
            r2 = this;
            androidx.cursoradapter.widget.SimpleCursorAdapter$CursorToStringConverter r0 = r2.mCursorToStringConverter
            if (r0 == 0) goto L9
            java.lang.CharSequence r3 = r0.convertToString(r3)
            return r3
        L9:
            int r0 = r2.mStringConversionColumn
            r1 = -1
            if (r0 <= r1) goto L13
            java.lang.String r3 = r3.getString(r0)
            return r3
        L13:
            java.lang.CharSequence r3 = super.convertToString(r3)
            return r3
    }

    public androidx.cursoradapter.widget.SimpleCursorAdapter.CursorToStringConverter getCursorToStringConverter() {
            r1 = this;
            androidx.cursoradapter.widget.SimpleCursorAdapter$CursorToStringConverter r0 = r1.mCursorToStringConverter
            return r0
    }

    public int getStringConversionColumn() {
            r1 = this;
            int r0 = r1.mStringConversionColumn
            return r0
    }

    public androidx.cursoradapter.widget.SimpleCursorAdapter.ViewBinder getViewBinder() {
            r1 = this;
            androidx.cursoradapter.widget.SimpleCursorAdapter$ViewBinder r0 = r1.mViewBinder
            return r0
    }

    public void setCursorToStringConverter(androidx.cursoradapter.widget.SimpleCursorAdapter.CursorToStringConverter r1) {
            r0 = this;
            r0.mCursorToStringConverter = r1
            return
    }

    public void setStringConversionColumn(int r1) {
            r0 = this;
            r0.mStringConversionColumn = r1
            return
    }

    public void setViewBinder(androidx.cursoradapter.widget.SimpleCursorAdapter.ViewBinder r1) {
            r0 = this;
            r0.mViewBinder = r1
            return
    }

    public void setViewImage(android.widget.ImageView r2, java.lang.String r3) {
            r1 = this;
            int r0 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L8
            r2.setImageResource(r0)     // Catch: java.lang.NumberFormatException -> L8
            goto Lf
        L8:
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r2.setImageURI(r3)
        Lf:
            return
    }

    public void setViewText(android.widget.TextView r1, java.lang.String r2) {
            r0 = this;
            r1.setText(r2)
            return
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public android.database.Cursor swapCursor(android.database.Cursor r2) {
            r1 = this;
            java.lang.String[] r0 = r1.mOriginalFrom
            r1.findColumns(r2, r0)
            android.database.Cursor r2 = super.swapCursor(r2)
            return r2
    }
}
