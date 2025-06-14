package androidx.loader.content;

/* loaded from: classes.dex */
public class CursorLoader extends androidx.loader.content.AsyncTaskLoader<android.database.Cursor> {
    androidx.core.os.CancellationSignal mCancellationSignal;
    android.database.Cursor mCursor;
    final androidx.loader.content.Loader<android.database.Cursor>.ForceLoadContentObserver mObserver;
    java.lang.String[] mProjection;
    java.lang.String mSelection;
    java.lang.String[] mSelectionArgs;
    java.lang.String mSortOrder;
    android.net.Uri mUri;

    public CursorLoader(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            androidx.loader.content.Loader$ForceLoadContentObserver r1 = new androidx.loader.content.Loader$ForceLoadContentObserver
            r1.<init>(r0)
            r0.mObserver = r1
            return
    }

    public CursorLoader(android.content.Context r1, android.net.Uri r2, java.lang.String[] r3, java.lang.String r4, java.lang.String[] r5, java.lang.String r6) {
            r0 = this;
            r0.<init>(r1)
            androidx.loader.content.Loader$ForceLoadContentObserver r1 = new androidx.loader.content.Loader$ForceLoadContentObserver
            r1.<init>(r0)
            r0.mObserver = r1
            r0.mUri = r2
            r0.mProjection = r3
            r0.mSelection = r4
            r0.mSelectionArgs = r5
            r0.mSortOrder = r6
            return
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public void cancelLoadInBackground() {
            r1 = this;
            super.cancelLoadInBackground()
            monitor-enter(r1)
            androidx.core.os.CancellationSignal r0 = r1.mCancellationSignal     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lb
            r0.cancel()     // Catch: java.lang.Throwable -> Ld
        Lb:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    public void deliverResult(android.database.Cursor r3) {
            r2 = this;
            boolean r0 = r2.isReset()
            if (r0 == 0) goto Lc
            if (r3 == 0) goto Lb
            r3.close()
        Lb:
            return
        Lc:
            android.database.Cursor r0 = r2.mCursor
            r2.mCursor = r3
            boolean r1 = r2.isStarted()
            if (r1 == 0) goto L19
            super.deliverResult(r3)
        L19:
            if (r0 == 0) goto L26
            if (r0 == r3) goto L26
            boolean r3 = r0.isClosed()
            if (r3 != 0) goto L26
            r0.close()
        L26:
            return
    }

    @Override // androidx.loader.content.Loader
    public /* bridge */ /* synthetic */ void deliverResult(java.lang.Object r1) {
            r0 = this;
            android.database.Cursor r1 = (android.database.Cursor) r1
            r0.deliverResult(r1)
            return
    }

    @Override // androidx.loader.content.AsyncTaskLoader, androidx.loader.content.Loader
    @java.lang.Deprecated
    public void dump(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4) {
            r0 = this;
            super.dump(r1, r2, r3, r4)
            r3.print(r1)
            java.lang.String r2 = "mUri="
            r3.print(r2)
            android.net.Uri r2 = r0.mUri
            r3.println(r2)
            r3.print(r1)
            java.lang.String r2 = "mProjection="
            r3.print(r2)
            java.lang.String[] r2 = r0.mProjection
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r3.println(r2)
            r3.print(r1)
            java.lang.String r2 = "mSelection="
            r3.print(r2)
            java.lang.String r2 = r0.mSelection
            r3.println(r2)
            r3.print(r1)
            java.lang.String r2 = "mSelectionArgs="
            r3.print(r2)
            java.lang.String[] r2 = r0.mSelectionArgs
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r3.println(r2)
            r3.print(r1)
            java.lang.String r2 = "mSortOrder="
            r3.print(r2)
            java.lang.String r2 = r0.mSortOrder
            r3.println(r2)
            r3.print(r1)
            java.lang.String r2 = "mCursor="
            r3.print(r2)
            android.database.Cursor r2 = r0.mCursor
            r3.println(r2)
            r3.print(r1)
            java.lang.String r1 = "mContentChanged="
            r3.print(r1)
            boolean r1 = r0.mContentChanged
            r3.println(r1)
            return
    }

    public java.lang.String[] getProjection() {
            r1 = this;
            java.lang.String[] r0 = r1.mProjection
            return r0
    }

    public java.lang.String getSelection() {
            r1 = this;
            java.lang.String r0 = r1.mSelection
            return r0
    }

    public java.lang.String[] getSelectionArgs() {
            r1 = this;
            java.lang.String[] r0 = r1.mSelectionArgs
            return r0
    }

    public java.lang.String getSortOrder() {
            r1 = this;
            java.lang.String r0 = r1.mSortOrder
            return r0
    }

    public android.net.Uri getUri() {
            r1 = this;
            android.net.Uri r0 = r1.mUri
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.loader.content.AsyncTaskLoader
    public android.database.Cursor loadInBackground() {
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.isLoadInBackgroundCanceled()     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L49
            androidx.core.os.CancellationSignal r0 = new androidx.core.os.CancellationSignal     // Catch: java.lang.Throwable -> L4f
            r0.<init>()     // Catch: java.lang.Throwable -> L4f
            r9.mCancellationSignal = r0     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L4f
            r0 = 0
            android.content.Context r1 = r9.getContext()     // Catch: java.lang.Throwable -> L40
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L40
            android.net.Uri r3 = r9.mUri     // Catch: java.lang.Throwable -> L40
            java.lang.String[] r4 = r9.mProjection     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r9.mSelection     // Catch: java.lang.Throwable -> L40
            java.lang.String[] r6 = r9.mSelectionArgs     // Catch: java.lang.Throwable -> L40
            java.lang.String r7 = r9.mSortOrder     // Catch: java.lang.Throwable -> L40
            androidx.core.os.CancellationSignal r8 = r9.mCancellationSignal     // Catch: java.lang.Throwable -> L40
            android.database.Cursor r1 = androidx.core.content.ContentResolverCompat.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L38
            r1.getCount()     // Catch: java.lang.RuntimeException -> L33 java.lang.Throwable -> L40
            androidx.loader.content.Loader<android.database.Cursor>$ForceLoadContentObserver r2 = r9.mObserver     // Catch: java.lang.RuntimeException -> L33 java.lang.Throwable -> L40
            r1.registerContentObserver(r2)     // Catch: java.lang.RuntimeException -> L33 java.lang.Throwable -> L40
            goto L38
        L33:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L40
            throw r2     // Catch: java.lang.Throwable -> L40
        L38:
            monitor-enter(r9)
            r9.mCancellationSignal = r0     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3d
            return r1
        L3d:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3d
            throw r0
        L40:
            r1 = move-exception
            monitor-enter(r9)
            r9.mCancellationSignal = r0     // Catch: java.lang.Throwable -> L46
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L46
            throw r1
        L46:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L46
            throw r0
        L49:
            androidx.core.os.OperationCanceledException r0 = new androidx.core.os.OperationCanceledException     // Catch: java.lang.Throwable -> L4f
            r0.<init>()     // Catch: java.lang.Throwable -> L4f
            throw r0     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L4f
            throw r0
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public /* bridge */ /* synthetic */ android.database.Cursor loadInBackground() {
            r1 = this;
            android.database.Cursor r0 = r1.loadInBackground()
            return r0
    }

    /* renamed from: onCanceled, reason: avoid collision after fix types in other method */
    public void onCanceled2(android.database.Cursor r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto Lb
            r2.close()
        Lb:
            return
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public /* bridge */ /* synthetic */ void onCanceled(android.database.Cursor r1) {
            r0 = this;
            android.database.Cursor r1 = (android.database.Cursor) r1
            r0.onCanceled2(r1)
            return
    }

    @Override // androidx.loader.content.Loader
    protected void onReset() {
            r1 = this;
            super.onReset()
            r1.onStopLoading()
            android.database.Cursor r0 = r1.mCursor
            if (r0 == 0) goto L15
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L15
            android.database.Cursor r0 = r1.mCursor
            r0.close()
        L15:
            r0 = 0
            r1.mCursor = r0
            return
    }

    @Override // androidx.loader.content.Loader
    protected void onStartLoading() {
            r1 = this;
            android.database.Cursor r0 = r1.mCursor
            if (r0 == 0) goto L7
            r1.deliverResult(r0)
        L7:
            boolean r0 = r1.takeContentChanged()
            if (r0 != 0) goto L11
            android.database.Cursor r0 = r1.mCursor
            if (r0 != 0) goto L14
        L11:
            r1.forceLoad()
        L14:
            return
    }

    @Override // androidx.loader.content.Loader
    protected void onStopLoading() {
            r0 = this;
            r0.cancelLoad()
            return
    }

    public void setProjection(java.lang.String[] r1) {
            r0 = this;
            r0.mProjection = r1
            return
    }

    public void setSelection(java.lang.String r1) {
            r0 = this;
            r0.mSelection = r1
            return
    }

    public void setSelectionArgs(java.lang.String[] r1) {
            r0 = this;
            r0.mSelectionArgs = r1
            return
    }

    public void setSortOrder(java.lang.String r1) {
            r0 = this;
            r0.mSortOrder = r1
            return
    }

    public void setUri(android.net.Uri r1) {
            r0 = this;
            r0.mUri = r1
            return
    }
}
