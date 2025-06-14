package androidx.loader.content;

/* loaded from: classes.dex */
public class Loader<D> {
    boolean mAbandoned;
    boolean mContentChanged;
    android.content.Context mContext;
    int mId;
    androidx.loader.content.Loader.OnLoadCompleteListener<D> mListener;
    androidx.loader.content.Loader.OnLoadCanceledListener<D> mOnLoadCanceledListener;
    boolean mProcessingChange;
    boolean mReset;
    boolean mStarted;

    public final class ForceLoadContentObserver extends android.database.ContentObserver {
        final /* synthetic */ androidx.loader.content.Loader this$0;

        public ForceLoadContentObserver(androidx.loader.content.Loader r1) {
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
                androidx.loader.content.Loader r1 = r0.this$0
                r1.onContentChanged()
                return
        }
    }

    public interface OnLoadCanceledListener<D> {
        void onLoadCanceled(androidx.loader.content.Loader<D> r1);
    }

    public interface OnLoadCompleteListener<D> {
        void onLoadComplete(androidx.loader.content.Loader<D> r1, D r2);
    }

    public Loader(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mStarted = r0
            r2.mAbandoned = r0
            r1 = 1
            r2.mReset = r1
            r2.mContentChanged = r0
            r2.mProcessingChange = r0
            android.content.Context r3 = r3.getApplicationContext()
            r2.mContext = r3
            return
    }

    public void abandon() {
            r1 = this;
            r0 = 1
            r1.mAbandoned = r0
            r1.onAbandon()
            return
    }

    public boolean cancelLoad() {
            r1 = this;
            boolean r0 = r1.onCancelLoad()
            return r0
    }

    public void commitContentChanged() {
            r1 = this;
            r0 = 0
            r1.mProcessingChange = r0
            return
    }

    public java.lang.String dataToString(D r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 64
            r0.<init>(r1)
            androidx.core.util.DebugUtils.buildShortClassTag(r3, r0)
            java.lang.String r3 = "}"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public void deliverCancellation() {
            r1 = this;
            androidx.loader.content.Loader$OnLoadCanceledListener<D> r0 = r1.mOnLoadCanceledListener
            if (r0 == 0) goto L7
            r0.onLoadCanceled(r1)
        L7:
            return
    }

    public void deliverResult(D r2) {
            r1 = this;
            androidx.loader.content.Loader$OnLoadCompleteListener<D> r0 = r1.mListener
            if (r0 == 0) goto L7
            r0.onLoadComplete(r1, r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void dump(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4) {
            r0 = this;
            r3.print(r1)
            java.lang.String r2 = "mId="
            r3.print(r2)
            int r2 = r0.mId
            r3.print(r2)
            java.lang.String r2 = " mListener="
            r3.print(r2)
            androidx.loader.content.Loader$OnLoadCompleteListener<D> r2 = r0.mListener
            r3.println(r2)
            boolean r2 = r0.mStarted
            if (r2 != 0) goto L23
            boolean r2 = r0.mContentChanged
            if (r2 != 0) goto L23
            boolean r2 = r0.mProcessingChange
            if (r2 == 0) goto L44
        L23:
            r3.print(r1)
            java.lang.String r2 = "mStarted="
            r3.print(r2)
            boolean r2 = r0.mStarted
            r3.print(r2)
            java.lang.String r2 = " mContentChanged="
            r3.print(r2)
            boolean r2 = r0.mContentChanged
            r3.print(r2)
            java.lang.String r2 = " mProcessingChange="
            r3.print(r2)
            boolean r2 = r0.mProcessingChange
            r3.println(r2)
        L44:
            boolean r2 = r0.mAbandoned
            if (r2 != 0) goto L4c
            boolean r2 = r0.mReset
            if (r2 == 0) goto L63
        L4c:
            r3.print(r1)
            java.lang.String r1 = "mAbandoned="
            r3.print(r1)
            boolean r1 = r0.mAbandoned
            r3.print(r1)
            java.lang.String r1 = " mReset="
            r3.print(r1)
            boolean r1 = r0.mReset
            r3.println(r1)
        L63:
            return
    }

    public void forceLoad() {
            r0 = this;
            r0.onForceLoad()
            return
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    public int getId() {
            r1 = this;
            int r0 = r1.mId
            return r0
    }

    public boolean isAbandoned() {
            r1 = this;
            boolean r0 = r1.mAbandoned
            return r0
    }

    public boolean isReset() {
            r1 = this;
            boolean r0 = r1.mReset
            return r0
    }

    public boolean isStarted() {
            r1 = this;
            boolean r0 = r1.mStarted
            return r0
    }

    protected void onAbandon() {
            r0 = this;
            return
    }

    protected boolean onCancelLoad() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void onContentChanged() {
            r1 = this;
            boolean r0 = r1.mStarted
            if (r0 == 0) goto L8
            r1.forceLoad()
            goto Lb
        L8:
            r0 = 1
            r1.mContentChanged = r0
        Lb:
            return
    }

    protected void onForceLoad() {
            r0 = this;
            return
    }

    protected void onReset() {
            r0 = this;
            return
    }

    protected void onStartLoading() {
            r0 = this;
            return
    }

    protected void onStopLoading() {
            r0 = this;
            return
    }

    public void registerListener(int r2, androidx.loader.content.Loader.OnLoadCompleteListener<D> r3) {
            r1 = this;
            androidx.loader.content.Loader$OnLoadCompleteListener<D> r0 = r1.mListener
            if (r0 != 0) goto L9
            r1.mListener = r3
            r1.mId = r2
            return
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "There is already a listener registered"
            r2.<init>(r3)
            throw r2
    }

    public void registerOnLoadCanceledListener(androidx.loader.content.Loader.OnLoadCanceledListener<D> r2) {
            r1 = this;
            androidx.loader.content.Loader$OnLoadCanceledListener<D> r0 = r1.mOnLoadCanceledListener
            if (r0 != 0) goto L7
            r1.mOnLoadCanceledListener = r2
            return
        L7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "There is already a listener registered"
            r2.<init>(r0)
            throw r2
    }

    public void reset() {
            r1 = this;
            r1.onReset()
            r0 = 1
            r1.mReset = r0
            r0 = 0
            r1.mStarted = r0
            r1.mAbandoned = r0
            r1.mContentChanged = r0
            r1.mProcessingChange = r0
            return
    }

    public void rollbackContentChanged() {
            r1 = this;
            boolean r0 = r1.mProcessingChange
            if (r0 == 0) goto L7
            r1.onContentChanged()
        L7:
            return
    }

    public final void startLoading() {
            r1 = this;
            r0 = 1
            r1.mStarted = r0
            r0 = 0
            r1.mReset = r0
            r1.mAbandoned = r0
            r1.onStartLoading()
            return
    }

    public void stopLoading() {
            r1 = this;
            r0 = 0
            r1.mStarted = r0
            r1.onStopLoading()
            return
    }

    public boolean takeContentChanged() {
            r2 = this;
            boolean r0 = r2.mContentChanged
            r1 = 0
            r2.mContentChanged = r1
            boolean r1 = r2.mProcessingChange
            r1 = r1 | r0
            r2.mProcessingChange = r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 64
            r0.<init>(r1)
            androidx.core.util.DebugUtils.buildShortClassTag(r2, r0)
            java.lang.String r1 = " id="
            r0.append(r1)
            int r1 = r2.mId
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void unregisterListener(androidx.loader.content.Loader.OnLoadCompleteListener<D> r2) {
            r1 = this;
            androidx.loader.content.Loader$OnLoadCompleteListener<D> r0 = r1.mListener
            if (r0 == 0) goto L12
            if (r0 != r2) goto La
            r2 = 0
            r1.mListener = r2
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Attempting to unregister the wrong listener"
            r2.<init>(r0)
            throw r2
        L12:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "No listener register"
            r2.<init>(r0)
            throw r2
    }

    public void unregisterOnLoadCanceledListener(androidx.loader.content.Loader.OnLoadCanceledListener<D> r2) {
            r1 = this;
            androidx.loader.content.Loader$OnLoadCanceledListener<D> r0 = r1.mOnLoadCanceledListener
            if (r0 == 0) goto L12
            if (r0 != r2) goto La
            r2 = 0
            r1.mOnLoadCanceledListener = r2
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Attempting to unregister the wrong listener"
            r2.<init>(r0)
            throw r2
        L12:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "No listener register"
            r2.<init>(r0)
            throw r2
    }
}
