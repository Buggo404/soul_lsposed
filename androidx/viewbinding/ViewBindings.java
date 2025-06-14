package androidx.viewbinding;

/* loaded from: classes.dex */
public class ViewBindings {
    private ViewBindings() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends android.view.View> T findChildViewById(android.view.View r4, int r5) {
            boolean r0 = r4 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r2 = 0
        Ld:
            if (r2 >= r0) goto L1d
            android.view.View r3 = r4.getChildAt(r2)
            android.view.View r3 = r3.findViewById(r5)
            if (r3 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto Ld
        L1d:
            return r1
    }
}
