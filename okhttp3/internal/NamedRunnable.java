package okhttp3.internal;

/* loaded from: classes.dex */
public abstract class NamedRunnable implements java.lang.Runnable {
    protected final java.lang.String name;

    public NamedRunnable(java.lang.String r1, java.lang.Object... r2) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = okhttp3.internal.Util.format(r1, r2)
            r0.name = r1
            return
    }

    protected abstract void execute();

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r2 = r3.name
            r1.setName(r2)
            r3.execute()     // Catch: java.lang.Throwable -> L1c
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.setName(r0)
            return
        L1c:
            r1 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.setName(r0)
            throw r1
    }
}
