package com.usidqw.qwerklj.Code;

/* loaded from: classes.dex */
public class ToolsFun extends com.usidqw.qwerklj.Run {
    public ToolsFun() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ReqRecommendedAutoRun() {
            java.lang.String r0 = "cn.soulapp.android.square.post.api.IPostApi"
            java.lang.String r1 = "NEW_APIA"
            java.lang.String r2 = "getRecommendPosts"
            com.usidqw.qwerklj.Code.ToolsFun$$ExternalSyntheticLambda1 r3 = new com.usidqw.qwerklj.Code.ToolsFun$$ExternalSyntheticLambda1     // Catch: java.lang.Exception -> L19
            r3.<init>()     // Catch: java.lang.Exception -> L19
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L19
            java.util.Map r5 = getMap()     // Catch: java.lang.Exception -> L19
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Exception -> L19
            com.usidqw.qwerklj.Code.Api.HttpApi(r0, r1, r2, r3, r4)     // Catch: java.lang.Exception -> L19
            goto L1d
        L19:
            r0 = move-exception
            r0.printStackTrace()
        L1d:
            return
    }

    private static java.util.Map<java.lang.String, java.lang.Object> getMap() {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "subTabType"
            r0.put(r2, r1)
            r1 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "loadScene"
            r0.put(r2, r1)
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "recOpen"
            r0.put(r2, r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "timeStamp"
            r0.put(r2, r1)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$ReqRecommendedAutoRun$0(java.lang.Object r3, java.lang.reflect.Method r4, java.lang.Object[] r5) {
            r3 = 0
            r4 = r5[r3]
            if (r4 == 0) goto L4d
            java.lang.String r5 = "postList"
            java.lang.Object r4 = getObjectField(r4, r5)
            if (r4 == 0) goto L4d
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4d
            java.lang.Object r5 = r4.next()
            java.lang.String r0 = "authorIdEcpt"
            java.lang.String r0 = getStringField(r5, r0)
            java.lang.String r0 = com.usidqw.qwerklj.Code.Api.decryption(r0)
            java.lang.String r1 = "signature"
            java.lang.String r5 = getStringField(r5, r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r0
            r2 = 1
            r1[r2] = r5
            msg(r1)
            com.usidqw.qwerklj.GreenDao.db.UserConfig r1 = new com.usidqw.qwerklj.GreenDao.db.UserConfig
            r1.<init>()
            r1.setUserId(r0)
            r1.setSignature(r5)
            com.usidqw.qwerklj.Tools.JsonMain r5 = com.usidqw.qwerklj.Code.ToolsFun.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r5 = r5.getDb()
            r5.insert(r1)
            goto L13
        L4d:
            java.lang.String r4 = "gather"
            boolean r3 = get(r4, r3)
            r4 = 0
            if (r3 != 0) goto L57
            return r4
        L57:
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r3.<init>(r5)
            com.usidqw.qwerklj.Code.ToolsFun$$ExternalSyntheticLambda0 r5 = new com.usidqw.qwerklj.Code.ToolsFun$$ExternalSyntheticLambda0
            r5.<init>()
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r5, r0)
            return r4
    }

    @Override // com.usidqw.qwerklj.Base.Base
    public void onENHook() throws java.lang.NoSuchFieldException {
            r0 = this;
            return
    }
}
