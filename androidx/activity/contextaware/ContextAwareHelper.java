package androidx.activity.contextaware;

/* loaded from: classes.dex */
public final class ContextAwareHelper {
    private volatile android.content.Context mContext;
    private final java.util.Set<androidx.activity.contextaware.OnContextAvailableListener> mListeners;

    public ContextAwareHelper() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r1.mListeners = r0
            return
    }

    public void addOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            if (r0 == 0) goto L9
            android.content.Context r0 = r1.mContext
            r2.onContextAvailable(r0)
        L9:
            java.util.Set<androidx.activity.contextaware.OnContextAvailableListener> r0 = r1.mListeners
            r0.add(r2)
            return
    }

    public void clearAvailableContext() {
            r1 = this;
            r0 = 0
            r1.mContext = r0
            return
    }

    public void dispatchOnContextAvailable(android.content.Context r3) {
            r2 = this;
            r2.mContext = r3
            java.util.Set<androidx.activity.contextaware.OnContextAvailableListener> r0 = r2.mListeners
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            androidx.activity.contextaware.OnContextAvailableListener r1 = (androidx.activity.contextaware.OnContextAvailableListener) r1
            r1.onContextAvailable(r3)
            goto L8
        L18:
            return
    }

    public android.content.Context peekAvailableContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    public void removeOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener r2) {
            r1 = this;
            java.util.Set<androidx.activity.contextaware.OnContextAvailableListener> r0 = r1.mListeners
            r0.remove(r2)
            return
    }
}
