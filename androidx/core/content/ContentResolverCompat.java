package androidx.core.content;

/* loaded from: classes.dex */
public final class ContentResolverCompat {
    private ContentResolverCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.database.Cursor query(android.content.ContentResolver r7, android.net.Uri r8, java.lang.String[] r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12, androidx.core.os.CancellationSignal r13) {
            if (r13 == 0) goto L9
            java.lang.Object r13 = r13.getCancellationSignalObject()     // Catch: java.lang.Exception -> L7
            goto La
        L7:
            r7 = move-exception
            goto L18
        L9:
            r13 = 0
        La:
            r6 = r13
            android.os.CancellationSignal r6 = (android.os.CancellationSignal) r6     // Catch: java.lang.Exception -> L7
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L7
            return r7
        L18:
            boolean r8 = r7 instanceof android.os.OperationCanceledException
            if (r8 == 0) goto L22
            androidx.core.os.OperationCanceledException r7 = new androidx.core.os.OperationCanceledException
            r7.<init>()
            throw r7
        L22:
            throw r7
    }
}
