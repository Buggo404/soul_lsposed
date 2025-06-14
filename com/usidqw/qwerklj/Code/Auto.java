package com.usidqw.qwerklj.Code;

/* loaded from: classes.dex */
public class Auto extends com.usidqw.qwerklj.Run {
    java.lang.String UserId;
    java.lang.String authorIdEcpt;


    public Auto() {
            r0 = this;
            r0.<init>()
            return
    }

    private void AutoRun(java.lang.Object r5) {
            r4 = this;
            java.lang.String r0 = "authorIdEcpt"
            java.lang.String r5 = getStringField(r5, r0)
            java.lang.String r5 = com.usidqw.qwerklj.Code.Api.decryption(r5)
            java.lang.String r0 = "autoS"
            r1 = 0
            boolean r0 = get(r0, r1)
            if (r0 == 0) goto L2d
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "关注/被关注页面 已投递消息 ->"
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0[r1] = r2
            msg(r0)
            com.usidqw.qwerklj.Code.Api.send(r5)
        L2d:
            return
    }

    static /* synthetic */ void access$000(com.usidqw.qwerklj.Code.Auto r0, java.lang.Object r1) {
            r0.AutoRun(r1)
            return
    }

    @Override // com.usidqw.qwerklj.Base.Base
    public void onENHook() {
            r3 = this;
            com.usidqw.qwerklj.Code.Auto$1 r0 = new com.usidqw.qwerklj.Code.Auto$1
            r0.<init>(r3)
            java.lang.String r1 = "cn.soulapp.android.component.square.main.squarepost.footer.DefaultFooter"
            java.lang.String r2 = "onBindViewHolder"
            r3.hookAllMethods(r1, r2, r0)
            return
    }
}
