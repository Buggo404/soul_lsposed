package com.usidqw.qwerklj.Code;

/* loaded from: classes.dex */
public class Response extends com.usidqw.qwerklj.Run {
    private com.usidqw.qwerklj.Code.Response.ResponseListEquals equals;


    public static class ResponseListEquals {
        private final java.util.List<java.lang.String> lists;

        public static /* synthetic */ boolean $r8$lambda$Z5V9tkDhT_JfDb2WK8Naet8Zk2Y(java.lang.Object r0) {
                boolean r0 = java.util.Objects.isNull(r0)
                return r0
        }

        public ResponseListEquals(java.util.List<java.lang.String> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.lists = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r3)
                com.usidqw.qwerklj.Code.Response$ResponseListEquals$$ExternalSyntheticLambda0 r3 = new com.usidqw.qwerklj.Code.Response$ResponseListEquals$$ExternalSyntheticLambda0
                r3.<init>()
                r0.removeIf(r3)
                java.util.Iterator r3 = r0.iterator()
            L1b:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L33
                java.lang.Object r0 = r3.next()
                java.lang.String r0 = (java.lang.String) r0
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto L1b
                java.util.List<java.lang.String> r1 = r2.lists
                r1.add(r0)
                goto L1b
            L33:
                return
        }

        public boolean ListEquals(java.lang.String r6) {
                r5 = this;
                java.lang.String r0 = "/"
                java.lang.String[] r6 = r6.split(r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                int r1 = r6.length
                r2 = 0
            Ld:
                if (r2 >= r1) goto L1d
                r3 = r6[r2]
                boolean r4 = android.text.TextUtils.isEmpty(r3)
                if (r4 != 0) goto L1a
                r0.add(r3)
            L1a:
                int r2 = r2 + 1
                goto Ld
            L1d:
                java.util.List<java.lang.String> r6 = r5.lists
                boolean r6 = r6.equals(r0)
                return r6
        }

        public java.lang.String getUrl() {
                r2 = this;
                com.google.gson.Gson r0 = new com.google.gson.Gson
                r0.<init>()
                java.util.List<java.lang.String> r1 = r2.lists
                java.lang.String r0 = r0.toJson(r1)
                return r0
        }
    }

    public Response() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.usidqw.qwerklj.Code.Response.ResponseListEquals access$000(com.usidqw.qwerklj.Code.Response r0) {
            com.usidqw.qwerklj.Code.Response$ResponseListEquals r0 = r0.equals
            return r0
    }

    static /* synthetic */ com.usidqw.qwerklj.Code.Response.ResponseListEquals access$002(com.usidqw.qwerklj.Code.Response r0, com.usidqw.qwerklj.Code.Response.ResponseListEquals r1) {
            r0.equals = r1
            return r1
    }

    static /* synthetic */ void access$100(com.usidqw.qwerklj.Code.Response r0, com.usidqw.qwerklj.Code.Response.ResponseListEquals r1, java.lang.Object r2, java.lang.Object r3) {
            r0.handleFun(r1, r2, r3)
            return
    }

    private void handleFun(com.usidqw.qwerklj.Code.Response.ResponseListEquals r6, java.lang.Object r7, java.lang.Object r8) {
            r5 = this;
            java.lang.String r0 = "api/q"
            boolean r0 = r6.ListEquals(r0)
            if (r0 == 0) goto L10
            java.lang.String r6 = "data"
            r8 = 0
            setObjectField(r7, r6, r8)
            goto L119
        L10:
            java.lang.String r7 = "v2/user/follow/getList"
            boolean r7 = r6.ListEquals(r7)
            java.lang.String r0 = "userIdEcpt"
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L64
            if (r8 == 0) goto L119
            java.lang.String r6 = "autoF"
            boolean r6 = get(r6, r1)
            if (r6 == 0) goto L119
            java.lang.String r6 = "userList"
            java.lang.Object r7 = getObjectField(r8, r6)
            if (r7 == 0) goto L119
            java.lang.Object r6 = getObjectField(r8, r6)
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
        L38:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L119
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = getStringField(r7, r0)
            java.lang.String r7 = com.usidqw.qwerklj.Code.Api.decryption(r7)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "关注/被关注页面 已投递消息 ->"
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r3 = r3.toString()
            r8[r1] = r3
            msg(r8)
            com.usidqw.qwerklj.Code.Api.send(r7)
            goto L38
        L64:
            java.lang.String r7 = "v2/online/robot/result"
            boolean r6 = r6.ListEquals(r7)
            if (r6 == 0) goto L119
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "autoK"
            boolean r3 = get(r7, r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r6[r1] = r3
            r6[r2] = r8
            msg(r6)
            boolean r6 = get(r7, r2)
            if (r6 == 0) goto L119
            java.lang.String r6 = "status"
            java.lang.String r6 = getStringField(r8, r6)
            java.lang.String r7 = "SUCCESS"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto Lca
            java.lang.String r6 = "userInfo"
            java.lang.Object r6 = getObjectField(r8, r6)
            if (r6 == 0) goto L119
            java.lang.String r6 = getStringField(r6, r0)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L119
            java.lang.String r7 = com.usidqw.qwerklj.Code.Api.decryption(r6)
            com.usidqw.qwerklj.Code.Api.send(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "(UserId:"
            r7.<init>(r8)
            java.lang.String r6 = com.usidqw.qwerklj.Code.Api.decryption(r6)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r7 = ")匹配成功 已投递消息到发送列表"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.piPeiAuto(r6)
            goto L119
        Lca:
            java.lang.String r7 = "BROKEN"
            boolean r6 = r7.equals(r6)
            java.lang.String r7 = "autoKLimit"
            java.lang.String r0 = "failContent"
            if (r6 == 0) goto Lf8
            boolean r6 = get(r7, r1)
            if (r6 != 0) goto Le4
            java.lang.String r6 = getStringField(r8, r0)
            r5.piPeiAuto(r6)
            goto L119
        Le4:
            com.usidqw.qwerklj.Utils.ToastPlus r6 = com.usidqw.qwerklj.Utils.ToastPlus.init()
            com.usidqw.qwerklj.Utils.ToastPlus r6 = r6.error()
            com.usidqw.qwerklj.Utils.ToastPlus r6 = r6.setDuration(r2)
            java.lang.Object r7 = getObjectField(r8, r0)
            r6.show(r7)
            goto L119
        Lf8:
            boolean r6 = get(r7, r1)
            if (r6 != 0) goto L106
            java.lang.String r6 = getStringField(r8, r0)
            r5.piPeiAuto(r6)
            goto L119
        L106:
            com.usidqw.qwerklj.Utils.ToastPlus r6 = com.usidqw.qwerklj.Utils.ToastPlus.init()
            com.usidqw.qwerklj.Utils.ToastPlus r6 = r6.error()
            com.usidqw.qwerklj.Utils.ToastPlus r6 = r6.setDuration(r2)
            java.lang.Object r7 = getObjectField(r8, r0)
            r6.show(r7)
        L119:
            return
    }

    static /* synthetic */ void lambda$piPeiAuto$0() {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "cn.soulapp.android"
            java.lang.String r2 = "cn.soulapp.android.ui.main.TrampolineActivity"
            r0.setClassName(r1, r2)
            java.lang.String r1 = "soul://ul.soulapp.cn/account/normalMatch?shortcut=quickswitch"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.setData(r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r1)
            com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Code.Response.App
            android.app.Activity r1 = r1.getActivity()
            r1.startActivity(r0)
            return
    }

    private void piPeiAuto(java.lang.String r8) {
            r7 = this;
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Code.Response.App
            android.app.Activity r1 = r1.getActivity()
            r1.finish()
            java.lang.String r1 = "autoKTime"
            r2 = 5
            int r3 = get(r1, r2)
            long r3 = (long) r3
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            com.usidqw.qwerklj.Utils.ToastPlus r5 = com.usidqw.qwerklj.Utils.ToastPlus.init()
            com.usidqw.qwerklj.Utils.ToastPlus r5 = r5.success()
            r6 = 1
            com.usidqw.qwerklj.Utils.ToastPlus r5 = r5.setDuration(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r8 = r6.append(r8)
            java.lang.String r6 = "\n"
            java.lang.StringBuilder r8 = r8.append(r6)
            int r1 = get(r1, r2)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r1 = "秒后继续匹配"
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r8 = r8.toString()
            r5.show(r8)
            com.usidqw.qwerklj.Code.Response$$ExternalSyntheticLambda0 r8 = new com.usidqw.qwerklj.Code.Response$$ExternalSyntheticLambda0
            r8.<init>()
            r0.postDelayed(r8, r3)
            return
    }

    @Override // com.usidqw.qwerklj.Base.Base
    public void onENHook() {
            r3 = this;
            com.usidqw.qwerklj.Code.Response$1 r0 = new com.usidqw.qwerklj.Code.Response$1
            r0.<init>(r3)
            java.lang.String r1 = "retrofit2.Response"
            java.lang.String r2 = "success"
            r3.hookAllMethods(r1, r2, r0)
            return
    }
}
