package org.greenrobot.greendao.internal;

/* loaded from: classes.dex */
public final class FastCursor implements android.database.Cursor {
    private final int count;
    private int position;
    private final android.database.CursorWindow window;

    public FastCursor(android.database.CursorWindow r1) {
            r0 = this;
            r0.<init>()
            r0.window = r1
            int r1 = r1.getNumRows()
            r0.count = r1
            return
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int r1, android.database.CharArrayBuffer r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.database.Cursor
    public void deactivate() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int r3) {
            r2 = this;
            android.database.CursorWindow r0 = r2.window
            int r1 = r2.position
            byte[] r3 = r0.getBlob(r1, r3)
            return r3
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.database.Cursor
    public int getColumnIndex(java.lang.String r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(java.lang.String r1) throws java.lang.IllegalArgumentException {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.database.Cursor
    public java.lang.String getColumnName(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.database.Cursor
    public java.lang.String[] getColumnNames() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.database.Cursor
    public int getCount() {
            r1 = this;
            android.database.CursorWindow r0 = r1.window
            int r0 = r0.getNumRows()
            return r0
    }

    @Override // android.database.Cursor
    public double getDouble(int r3) {
            r2 = this;
            android.database.CursorWindow r0 = r2.window
            int r1 = r2.position
            double r0 = r0.getDouble(r1, r3)
            return r0
    }

    @Override // android.database.Cursor
    public android.os.Bundle getExtras() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.database.Cursor
    public float getFloat(int r3) {
            r2 = this;
            android.database.CursorWindow r0 = r2.window
            int r1 = r2.position
            float r3 = r0.getFloat(r1, r3)
            return r3
    }

    @Override // android.database.Cursor
    public int getInt(int r3) {
            r2 = this;
            android.database.CursorWindow r0 = r2.window
            int r1 = r2.position
            int r3 = r0.getInt(r1, r3)
            return r3
    }

    @Override // android.database.Cursor
    public long getLong(int r3) {
            r2 = this;
            android.database.CursorWindow r0 = r2.window
            int r1 = r2.position
            long r0 = r0.getLong(r1, r3)
            return r0
    }

    @Override // android.database.Cursor
    public android.net.Uri getNotificationUri() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.database.Cursor
    public int getPosition() {
            r1 = this;
            int r0 = r1.position
            return r0
    }

    @Override // android.database.Cursor
    public short getShort(int r3) {
            r2 = this;
            android.database.CursorWindow r0 = r2.window
            int r1 = r2.position
            short r3 = r0.getShort(r1, r3)
            return r3
    }

    @Override // android.database.Cursor
    public java.lang.String getString(int r3) {
            r2 = this;
            android.database.CursorWindow r0 = r2.window
            int r1 = r2.position
            java.lang.String r3 = r0.getString(r1, r3)
            return r3
    }

    @Override // android.database.Cursor
    public int getType(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
            r1 = this;
            int r0 = r1.position
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // android.database.Cursor
    public boolean isLast() {
            r3 = this;
            int r0 = r3.position
            int r1 = r3.count
            r2 = 1
            int r1 = r1 - r2
            if (r0 != r1) goto L9
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    @Override // android.database.Cursor
    public boolean isNull(int r3) {
            r2 = this;
            android.database.CursorWindow r0 = r2.window
            int r1 = r2.position
            boolean r3 = r0.isNull(r1, r3)
            return r3
    }

    @Override // android.database.Cursor
    public boolean move(int r2) {
            r1 = this;
            int r0 = r1.position
            int r0 = r0 + r2
            boolean r2 = r1.moveToPosition(r0)
            return r2
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
            r2 = this;
            r0 = 0
            r2.position = r0
            int r1 = r2.count
            if (r1 <= 0) goto L8
            r0 = 1
        L8:
            return r0
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
            r2 = this;
            int r0 = r2.count
            if (r0 <= 0) goto L9
            r1 = 1
            int r0 = r0 - r1
            r2.position = r0
            return r1
        L9:
            r0 = 0
            return r0
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
            r3 = this;
            int r0 = r3.position
            int r1 = r3.count
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto Lc
            int r0 = r0 + r2
            r3.position = r0
            return r2
        Lc:
            r0 = 0
            return r0
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int r2) {
            r1 = this;
            if (r2 < 0) goto La
            int r0 = r1.count
            if (r2 >= r0) goto La
            r1.position = r2
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
            r2 = this;
            int r0 = r2.position
            if (r0 <= 0) goto L9
            r1 = 1
            int r0 = r0 - r1
            r2.position = r0
            return r1
        L9:
            r0 = 0
            return r0
    }

    @Override // android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.database.Cursor
    public boolean requery() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.database.Cursor
    public void setNotificationUri(android.content.ContentResolver r1, android.net.Uri r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
