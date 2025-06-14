package com.usidqw.qwerklj.Tools;

/* loaded from: classes.dex */
public class Static extends com.usidqw.qwerklj.Tools.Fun {
    public static com.usidqw.qwerklj.Tools.JsonMain App;
    public static java.lang.String[] AppPackageName;
    public static java.lang.ClassLoader classLoader;

    static {
            com.usidqw.qwerklj.Tools.JsonMain r0 = new com.usidqw.qwerklj.Tools.JsonMain
            r0.<init>()
            com.usidqw.qwerklj.Tools.Static.App = r0
            java.lang.String r0 = "cn.soulapp.android"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.usidqw.qwerklj.Tools.Static.AppPackageName = r0
            return
    }

    public Static() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean isAppOpen(java.lang.String r6) {
            r5 = this;
            java.lang.String[] r0 = com.usidqw.qwerklj.Tools.Static.AppPackageName
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r1) goto L14
            r4 = r0[r3]
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L11
            r6 = 1
            return r6
        L11:
            int r3 = r3 + 1
            goto L5
        L14:
            return r2
    }
}
