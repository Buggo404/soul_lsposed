package com.google.android.material.internal;

/* loaded from: classes.dex */
public class ContextUtils {
    public ContextUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.app.Activity getActivity(android.content.Context r1) {
        L0:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L12
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto Lb
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        Lb:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L0
        L12:
            r1 = 0
            return r1
    }
}
