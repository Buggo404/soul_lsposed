package androidx.core.app;

/* loaded from: classes.dex */
public class DialogCompat {
    private DialogCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.view.View requireViewById(android.app.Dialog r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.view.View r2 = r2.requireViewById(r3)
            return r2
        Lb:
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L12
            return r2
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ID does not reference a View inside this Dialog"
            r2.<init>(r3)
            throw r2
    }
}
