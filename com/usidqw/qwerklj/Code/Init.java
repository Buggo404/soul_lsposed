package com.usidqw.qwerklj.Code;

/* loaded from: classes.dex */
public class Init extends com.usidqw.qwerklj.Run {

    /* renamed from: id */
    static int f129id = 2141196811;
    private static boolean isRun = false;
    public static boolean isRunSend = false;
    android.widget.TextView text;


    /* renamed from: com.usidqw.qwerklj.Code.Init$2 */
    class C08882 extends de.robv.android.xposed.XC_MethodHook {
        final /* synthetic */ com.usidqw.qwerklj.Code.Init this$0;

        C08882(com.usidqw.qwerklj.Code.Init r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        protected void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) throws java.lang.Throwable {
                r4 = this;
                super.afterHookedMethod(r5)
                java.lang.Object r0 = r5.thisObject
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.Object[] r1 = r5.args
                r2 = 0
                r1 = r1[r2]
                if (r1 == 0) goto L52
                java.lang.Object[] r5 = r5.args
                r5 = r5[r2]
                java.lang.String r5 = r5.toString()
                java.lang.String r1 = "设置"
                boolean r1 = r5.equals(r1)
                if (r1 == 0) goto L52
                int r1 = r0.getId()
                java.lang.String r2 = "id"
                java.lang.String r3 = "topic_title"
                int r2 = com.usidqw.qwerklj.Tools.Fun.getResourcesId(r2, r3)
                if (r1 != r2) goto L52
                r1 = 1
                r0.setEnabled(r1)
                com.usidqw.qwerklj.Code.Init$2$$ExternalSyntheticLambda0 r1 = new com.usidqw.qwerklj.Code.Init$2$$ExternalSyntheticLambda0
                r1.<init>(r4)
                r0.setOnClickListener(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r5 = r1.append(r5)
                java.lang.String r1 = " - <font color='#FEA30F'>Text菜单</font>"
                java.lang.StringBuilder r5 = r5.append(r1)
                java.lang.String r5 = r5.toString()
                android.text.Spanned r5 = com.usidqw.qwerklj.Utils.Tools.toHtml(r5)
                r0.setText(r5)
            L52:
                return
        }

        /* renamed from: lambda$afterHookedMethod$0$com-usidqw-qwerklj-Code-Init$2, reason: not valid java name */
        /* synthetic */ void m142lambda$afterHookedMethod$0$comusidqwqwerkljCodeInit$2(android.view.View r1) {
                r0 = this;
                com.usidqw.qwerklj.Code.Init r1 = r0.this$0
                com.usidqw.qwerklj.Code.Init.access$000(r1)
                return
        }
    }




    /* renamed from: com.usidqw.qwerklj.Code.Init$6 */
    class C08926 extends de.robv.android.xposed.XC_MethodHook {
        final /* synthetic */ com.usidqw.qwerklj.Code.Init this$0;

        C08926(com.usidqw.qwerklj.Code.Init r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        static /* synthetic */ void lambda$afterHookedMethod$0(java.lang.String r3) {
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 == 0) goto L7
                return
            L7:
                java.lang.String r0 = "anonymity_char1"
                com.usidqw.qwerklj.Base.HookFun.set(r0, r3)
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                java.lang.String r2 = "thirty_second_tip"
                r0[r1] = r2
                java.lang.String r1 = "cn.soulapp.imlib.msg.chat.JsonMsg"
                java.lang.Object r0 = com.usidqw.qwerklj.Base.HookFun.newInstance(r1, r0)
                java.lang.String r1 = "notice"
                com.usidqw.qwerklj.Base.HookFun.setStringField(r0, r1, r3)     // Catch: java.lang.Exception -> L38
                java.lang.String r1 = "content"
                com.usidqw.qwerklj.Base.HookFun.setStringField(r0, r1, r3)     // Catch: java.lang.Exception -> L38
                com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Tools.Static.App     // Catch: java.lang.Exception -> L38
                com.usidqw.qwerklj.Json.Soul r3 = r3.getSoul()     // Catch: java.lang.Exception -> L38
                java.lang.String r3 = r3.getToChatUserId()     // Catch: java.lang.Exception -> L38
                r1 = 35
                java.lang.Object r3 = com.usidqw.qwerklj.Code.Api.getMessage(r3, r1, r0)     // Catch: java.lang.Exception -> L38
                com.usidqw.qwerklj.Code.Api.sendMessage(r3)     // Catch: java.lang.Exception -> L38
                goto L3c
            L38:
                r3 = move-exception
                r3.printStackTrace()
            L3c:
                return
        }

        static /* synthetic */ boolean lambda$afterHookedMethod$1(android.view.View r2) {
                com.usidqw.qwerklj.Dialog.PlusDialog r2 = new com.usidqw.qwerklj.Dialog.PlusDialog
                r2.<init>()
                com.usidqw.qwerklj.Dialog.DialogType r0 = com.usidqw.qwerklj.Dialog.DialogType.INPUT_MULTI
                com.usidqw.qwerklj.Dialog.PlusDialog r2 = r2.setType(r0)
                r0 = 0
                com.usidqw.qwerklj.Dialog.PlusDialog r2 = r2.setCanceledOnTouchOutside(r0)
                com.usidqw.qwerklj.Dialog.PlusDialog r2 = r2.setDismiss(r0)
                java.lang.String r0 = "发送小字"
                com.usidqw.qwerklj.Dialog.PlusDialog r2 = r2.setTitle(r0)
                java.lang.String r0 = "anonymity_char1"
                java.lang.String r1 = ""
                java.lang.String r0 = com.usidqw.qwerklj.Base.HookFun.get(r0, r1)
                com.usidqw.qwerklj.Dialog.PlusDialog r2 = r2.setValue(r0)
                com.usidqw.qwerklj.Code.Init$6$$ExternalSyntheticLambda0 r0 = new com.usidqw.qwerklj.Code.Init$6$$ExternalSyntheticLambda0
                r0.<init>()
                com.usidqw.qwerklj.Dialog.PlusDialog r2 = r2.setOnClickInput(r0)
                r2.show()
                r2 = 1
                return r2
        }

        protected void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) throws java.lang.Throwable {
                r3 = this;
                super.afterHookedMethod(r4)
                com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Soul r0 = r0.getSoul()
                java.lang.Object[] r1 = r4.args
                r2 = 0
                r1 = r1[r2]
                java.lang.String r1 = (java.lang.String) r1
                r0.setToChatUserId(r1)
                java.lang.String r0 = "id"
                java.lang.String r1 = "menu_tab_emoji"
                int r0 = com.usidqw.qwerklj.Tools.Fun.getResourcesId(r0, r1)
                java.lang.Object r4 = r4.thisObject
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1[r2] = r0
                java.lang.String r0 = "findViewById"
                java.lang.Object r4 = com.usidqw.qwerklj.Base.HookFun.callMethod(r4, r0, r1)
                android.widget.ImageView r4 = (android.widget.ImageView) r4
                if (r4 == 0) goto L38
                com.usidqw.qwerklj.Code.Init$6$$ExternalSyntheticLambda1 r0 = new com.usidqw.qwerklj.Code.Init$6$$ExternalSyntheticLambda1
                r0.<init>()
                r4.setOnLongClickListener(r0)
            L38:
                return
        }
    }




    static {
            return
    }

    public Init() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void RunSendFun() {
            boolean r0 = com.usidqw.qwerklj.Code.Init.isRunSend
            if (r0 != 0) goto L5
            return
        L5:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            java.lang.Thread r1 = new java.lang.Thread
            com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda1 r2 = new com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda1
            r2.<init>(r0)
            r1.<init>(r2)
            r1.start()
            return
    }

    static /* synthetic */ void access$000(com.usidqw.qwerklj.Code.Init r0) {
            r0.openMenu()
            return
    }

    static /* synthetic */ void access$100(com.usidqw.qwerklj.Code.Init r0, de.robv.android.xposed.XC_MethodHook.MethodHookParam r1) {
            r0.setPlusNEMenu(r1)
            return
    }

    static /* synthetic */ void lambda$RunSendFun$2() {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            if (r0 == 0) goto L8f
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            com.usidqw.qwerklj.GreenDao.dao.UserConfigDao r0 = r0.getUserConfigDao()
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.queryBuilder()
            org.greenrobot.greendao.Property r1 = com.usidqw.qwerklj.GreenDao.dao.UserConfigDao.Properties.IsSend
            r2 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            org.greenrobot.greendao.query.WhereCondition r1 = r1.m111eq(r3)
            org.greenrobot.greendao.query.WhereCondition[] r3 = new org.greenrobot.greendao.query.WhereCondition[r2]
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.where(r1, r3)
            long r0 = r0.count()
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L8f
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            com.usidqw.qwerklj.GreenDao.dao.UserConfigDao r0 = r0.getUserConfigDao()
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.queryBuilder()
            org.greenrobot.greendao.Property r1 = com.usidqw.qwerklj.GreenDao.dao.UserConfigDao.Properties.IsSend
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            org.greenrobot.greendao.query.WhereCondition r1 = r1.m111eq(r3)
            org.greenrobot.greendao.query.WhereCondition[] r3 = new org.greenrobot.greendao.query.WhereCondition[r2]
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.where(r1, r3)
            r1 = 1
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.limit(r1)
            java.lang.Object r0 = r0.unique()
            com.usidqw.qwerklj.GreenDao.db.UserConfig r0 = (com.usidqw.qwerklj.GreenDao.p001db.UserConfig) r0
            if (r0 == 0) goto L8f
            r0.setIsSend(r1)
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r3 = r3.getDb()
            r3.update(r0)
            java.lang.String r3 = r0.getUserId()
            com.usidqw.qwerklj.Code.Api.send(r3)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "采集用户发送["
            r3.<init>(r4)
            java.lang.String r0 = r0.getSignature()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = "] ->已投递到发送列表"
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1[r2] = r0
            msg(r1)
        L8f:
            RunSendFun()
            return
    }

    static /* synthetic */ void lambda$RunSendFun$3(android.os.Handler r3) {
            com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda3 r0 = new com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda3
            r0.<init>()
            r1 = 100
            r3.postDelayed(r0, r1)
            return
    }

    static /* synthetic */ void lambda$openMenu$4(com.usidqw.qwerklj.Dialog.PlusDialog r2, com.usidqw.qwerklj.Json.DialogListItem r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = java.lang.Integer.parseInt(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "autoKTime"
            set(r1, r0)
            java.lang.String r3 = r3.getTitle()
            r2.setItemDesc(r3, r4)
            return
    }

    static /* synthetic */ void lambda$openMenu$5(com.usidqw.qwerklj.Dialog.PlusDialog r2, com.usidqw.qwerklj.Json.DialogListItem r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = java.lang.Integer.parseInt(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "autoTime"
            set(r1, r0)
            java.lang.String r3 = r3.getTitle()
            r2.setItemDesc(r3, r4)
            return
    }

    static /* synthetic */ void lambda$openMenu$6(java.lang.String r1) {
            java.lang.String r0 = "content"
            setValue(r0, r1)
            return
    }

    static /* synthetic */ void lambda$openMenu$8(android.content.DialogInterface r0) {
            r0 = 0
            com.usidqw.qwerklj.Code.Init.isRun = r0
            return
    }

    static /* synthetic */ void lambda$reqAutoNum$0(com.usidqw.qwerklj.Dialog.PlusDialog r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = com.usidqw.qwerklj.Code.Init.isRunSend
            if (r1 == 0) goto Lc
            java.lang.String r1 = "<font color='#27903A'>[正在运行中]</font>"
            goto Le
        Lc:
            java.lang.String r1 = "<font color='#F0553D'>[停止中]</font>"
        Le:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "已发送数量:<font color='#27903A'>"
            java.lang.StringBuilder r0 = r0.append(r1)
            com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r1 = r1.getDb()
            com.usidqw.qwerklj.GreenDao.dao.UserConfigDao r1 = r1.getUserConfigDao()
            org.greenrobot.greendao.query.QueryBuilder r1 = r1.queryBuilder()
            org.greenrobot.greendao.Property r2 = com.usidqw.qwerklj.GreenDao.dao.UserConfigDao.Properties.IsSend
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            org.greenrobot.greendao.query.WhereCondition r2 = r2.m111eq(r3)
            r3 = 0
            org.greenrobot.greendao.query.WhereCondition[] r4 = new org.greenrobot.greendao.query.WhereCondition[r3]
            org.greenrobot.greendao.query.QueryBuilder r1 = r1.where(r2, r4)
            long r1 = r1.count()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "</font>剩余发送数量:<font color='#27903A'>"
            java.lang.StringBuilder r0 = r0.append(r1)
            com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r1 = r1.getDb()
            com.usidqw.qwerklj.GreenDao.dao.UserConfigDao r1 = r1.getUserConfigDao()
            org.greenrobot.greendao.query.QueryBuilder r1 = r1.queryBuilder()
            org.greenrobot.greendao.Property r2 = com.usidqw.qwerklj.GreenDao.dao.UserConfigDao.Properties.IsSend
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            org.greenrobot.greendao.query.WhereCondition r2 = r2.m111eq(r4)
            org.greenrobot.greendao.query.WhereCondition[] r3 = new org.greenrobot.greendao.query.WhereCondition[r3]
            org.greenrobot.greendao.query.QueryBuilder r1 = r1.where(r2, r3)
            long r1 = r1.count()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "</font>"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "开始发送采集用户"
            r5.setItemDesc(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "已采集数量:<font color='#27903A'>"
            r0.<init>(r2)
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r3 = r3.getDb()
            com.usidqw.qwerklj.GreenDao.dao.UserConfigDao r3 = r3.getUserConfigDao()
            long r3 = r3.count()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "清空采集的数据"
            r5.setItemDesc(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r2 = r2.getDb()
            com.usidqw.qwerklj.GreenDao.dao.UserConfigDao r2 = r2.getUserConfigDao()
            long r2 = r2.count()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "采集最新广场用户"
            r5.setItemDesc(r1, r0)
            reqAutoNum(r5)
            return
    }

    static /* synthetic */ void lambda$reqAutoNum$1(android.os.Handler r3, com.usidqw.qwerklj.Dialog.PlusDialog r4) {
            com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda0 r0 = new com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda0
            r0.<init>(r4)
            r1 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r0, r1)
            return
    }

    private void openMenu() {
            r8 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog r0 = new com.usidqw.qwerklj.Dialog.PlusDialog
            com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Code.Init.App
            android.app.Activity r1 = r1.getActivity()
            r0.<init>(r1)
            r1 = 1
            r0.setCanceledOnTouchOutside(r1)
            com.usidqw.qwerklj.Dialog.DialogType r2 = com.usidqw.qwerklj.Dialog.DialogType.LIST_ITEM
            r0.setType(r2)
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Code.Init.App
            java.lang.String r2 = r2.getAppName()
            r0.setTitle(r2)
            java.lang.String r2 = "打开后其他才会运行"
            boolean r3 = isAllOpen()
            java.lang.String r4 = "总开关"
            r0.addItemSwitch(r4, r2, r3)
            java.lang.String r2 = "autoS"
            r3 = 0
            boolean r2 = get(r2, r3)
            java.lang.String r4 = "广场自动发送"
            java.lang.String r5 = "滑动广场帖子自动给发帖人发送"
            r0.addItemSwitch(r4, r5, r2)
            java.lang.String r2 = "autoH"
            boolean r2 = get(r2, r3)
            java.lang.String r4 = "监视互动自动发送"
            java.lang.String r5 = "发现有人评论点赞自动发送"
            r0.addItemSwitch(r4, r5, r2)
            java.lang.String r2 = "autoO"
            boolean r2 = get(r2, r3)
            java.lang.String r4 = "唯一发送"
            java.lang.String r5 = "打开后,相同的User只发送一次"
            r0.addItemSwitch(r4, r5, r2)
            java.lang.String r2 = "autoF"
            boolean r2 = get(r2, r3)
            java.lang.String r4 = "关注/被关注手动批量发送"
            java.lang.String r5 = "进入关注页面后自动发送"
            r0.addItemSwitch(r4, r5, r2)
            java.lang.String r2 = "设置发送内容"
            r0.addItemOpen(r2)
            java.lang.String r2 = "一键聊天列表发送"
            r0.addItemOpen(r2)
            java.lang.String r2 = "测试"
            r0.addItemOpen(r2)
            java.lang.String r2 = "autoTime"
            r4 = 5
            int r2 = get(r2, r4)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r5 = "设置发送间隔时间"
            r0.addItemOpen(r5, r2)
            java.lang.String r2 = "autoK"
            boolean r2 = get(r2, r1)
            java.lang.String r5 = "自动灵魂匹配"
            java.lang.String r6 = "手动点击一次灵魂匹配开始运行(间隔过短会被限制匹配)"
            r0.addItemSwitch(r5, r6, r2)
            java.lang.String r2 = "autoKLimit"
            boolean r2 = get(r2, r3)
            java.lang.String r5 = "自动灵魂匹配中断运行"
            java.lang.String r6 = "如果出现\"Sorry,你要找的人暂时不在线\"后就停止"
            r0.addItemSwitch(r5, r6, r2)
            java.lang.String r2 = "autoKTime"
            int r2 = get(r2, r4)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "设置自动灵魂间隔时间"
            r0.addItemOpen(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "已采集数量:<font color='#27903A'>"
            r2.<init>(r4)
            com.usidqw.qwerklj.Tools.JsonMain r5 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r5 = r5.getDb()
            com.usidqw.qwerklj.GreenDao.dao.UserConfigDao r5 = r5.getUserConfigDao()
            long r5 = r5.count()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r5 = "</font>"
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "gather"
            boolean r6 = get(r6, r3)
            java.lang.String r7 = "采集最新广场用户"
            r0.addItemSwitch(r7, r2, r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            com.usidqw.qwerklj.Tools.JsonMain r4 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r4 = r4.getDb()
            com.usidqw.qwerklj.GreenDao.dao.UserConfigDao r4 = r4.getUserConfigDao()
            long r6 = r4.count()
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "清空采集的数据"
            r0.addItemOpen(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            boolean r4 = com.usidqw.qwerklj.Code.Init.isRunSend
            if (r4 == 0) goto L103
            java.lang.String r4 = "<font color='#27903A'>[正在运行中]</font>"
            goto L105
        L103:
            java.lang.String r4 = "<font color='#F0553D'>[停止中]</font>"
        L105:
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = "已发送数量:<font color='#27903A'>"
            java.lang.StringBuilder r2 = r2.append(r4)
            com.usidqw.qwerklj.Tools.JsonMain r4 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r4 = r4.getDb()
            com.usidqw.qwerklj.GreenDao.dao.UserConfigDao r4 = r4.getUserConfigDao()
            org.greenrobot.greendao.query.QueryBuilder r4 = r4.queryBuilder()
            org.greenrobot.greendao.Property r6 = com.usidqw.qwerklj.GreenDao.dao.UserConfigDao.Properties.IsSend
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            org.greenrobot.greendao.query.WhereCondition r6 = r6.m111eq(r7)
            org.greenrobot.greendao.query.WhereCondition[] r7 = new org.greenrobot.greendao.query.WhereCondition[r3]
            org.greenrobot.greendao.query.QueryBuilder r4 = r4.where(r6, r7)
            long r6 = r4.count()
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r4 = "</font>剩余发送数量:<font color='#27903A'>"
            java.lang.StringBuilder r2 = r2.append(r4)
            com.usidqw.qwerklj.Tools.JsonMain r4 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r4 = r4.getDb()
            com.usidqw.qwerklj.GreenDao.dao.UserConfigDao r4 = r4.getUserConfigDao()
            org.greenrobot.greendao.query.QueryBuilder r4 = r4.queryBuilder()
            org.greenrobot.greendao.Property r6 = com.usidqw.qwerklj.GreenDao.dao.UserConfigDao.Properties.IsSend
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            org.greenrobot.greendao.query.WhereCondition r6 = r6.m111eq(r7)
            org.greenrobot.greendao.query.WhereCondition[] r3 = new org.greenrobot.greendao.query.WhereCondition[r3]
            org.greenrobot.greendao.query.QueryBuilder r3 = r4.where(r6, r3)
            long r3 = r3.count()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "开始发送采集用户"
            r0.addItemOpen(r3, r2)
            com.usidqw.qwerklj.Code.Init.isRun = r1
            reqAutoNum(r0)
            com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda4 r1 = new com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda4
            r1.<init>(r8, r0)
            r0.setOnListClick(r1)
            r0.show()
            android.app.Dialog r0 = r0.getDialog()
            com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda5 r1 = new com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda5
            r1.<init>()
            r0.setOnDismissListener(r1)
            return
    }

    private static void reqAutoNum(com.usidqw.qwerklj.Dialog.PlusDialog r3) {
            boolean r0 = com.usidqw.qwerklj.Code.Init.isRun
            if (r0 != 0) goto L5
            return
        L5:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            java.lang.Thread r1 = new java.lang.Thread
            com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda2 r2 = new com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda2
            r2.<init>(r0, r3)
            r1.<init>(r2)
            r1.start()
            return
    }

    private void setPlusNEMenu(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7) {
            r6 = this;
            java.lang.Object r0 = r7.thisObject
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "cn.soulapp.android.component.home.me.MeFragment"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L13
            return
        L13:
            java.lang.Object r7 = r7.thisObject
            java.lang.String r0 = "rootView"
            java.lang.Object r7 = getObjectField(r7, r0)
            android.view.View r7 = (android.view.View) r7
            if (r7 == 0) goto L10a
            java.lang.String r0 = "id"
            java.lang.String r1 = "rl_planet"
            int r0 = getResourcesId(r0, r1)
            java.lang.String r1 = "drawable"
            java.lang.String r2 = "c_usr_lay_privacy_bg"
            int r1 = getResourcesId(r1, r2)
            if (r0 == 0) goto L10a
            if (r1 == 0) goto L10a
            android.view.View r7 = r7.findViewById(r0)
            r0 = 0
            r2 = 1
            if (r7 != 0) goto L45
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r1 = "寻找View rl_planet 失败"
            r7[r0] = r1
            msg(r7)
            return
        L45:
            android.view.ViewParent r3 = r7.getParent()
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            int r4 = com.usidqw.qwerklj.Code.Init.f129id
            android.view.View r3 = r3.findViewById(r4)
            if (r3 == 0) goto L6c
            android.view.ViewParent r3 = r7.getParent()
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            android.view.ViewParent r4 = r7.getParent()
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            int r5 = com.usidqw.qwerklj.Code.Init.f129id
            android.view.View r4 = r4.findViewById(r5)
            r3.removeView(r4)
            r3 = 0
            r7.setTag(r3)
        L6c:
            java.lang.Object r3 = r7.getTag()
            java.lang.String r4 = "tes1t_Menu"
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r7.getTag()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L7f
            return
        L7f:
            r7.setTag(r4)
            int r3 = com.usidqw.qwerklj.Code.Init.f129id
            int r3 = r3 - r2
            com.usidqw.qwerklj.Code.Init.f129id = r3
            android.widget.TextView r2 = new android.widget.TextView
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Code.Init.App
            android.app.Activity r3 = r3.getActivity()
            r2.<init>(r3)
            r6.text = r2
            int r3 = com.usidqw.qwerklj.Code.Init.f129id
            r2.setId(r3)
            android.widget.TextView r2 = r6.text
            java.lang.String r3 = "\u3000Test\u3000"
            r2.setText(r3)
            android.widget.TextView r2 = r6.text
            r3 = 17
            r2.setGravity(r3)
            android.widget.TextView r2 = r6.text
            int r3 = r7.getHeight()
            r2.setHeight(r3)
            android.widget.TextView r2 = r6.text
            r3 = -1
            r2.setTextColor(r3)
            android.widget.TextView r2 = r6.text
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Code.Init.App
            android.app.Activity r3 = r3.getActivity()
            android.content.res.Resources r3 = r3.getResources()
            android.graphics.drawable.Drawable r1 = r3.getDrawable(r1)
            r2.setBackground(r1)
            android.widget.TextView r1 = r6.text
            com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda9 r2 = new com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda9
            r2.<init>(r6)
            r1.setOnClickListener(r2)
            android.widget.TextView r1 = r6.text
            r1.setVisibility(r0)
            android.widget.TextView r0 = r6.text
            com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda10 r1 = new com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda10
            r1.<init>(r6)
            r0.setOnLongClickListener(r1)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 16
            r0.gravity = r1
            int r1 = r7.getRight()
            int r1 = r1 + (-10)
            r0.leftMargin = r1
            int r1 = r7.getTop()
            r0.topMargin = r1
            android.widget.TextView r1 = r6.text
            r1.setLayoutParams(r0)
            android.view.ViewParent r7 = r7.getParent()
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            android.widget.TextView r0 = r6.text
            r7.addView(r0)
        L10a:
            return
    }

    /* renamed from: lambda$openMenu$7$com-usidqw-qwerklj-Code-Init, reason: not valid java name */
    /* synthetic */ void m139lambda$openMenu$7$comusidqwqwerkljCodeInit(com.usidqw.qwerklj.Dialog.PlusDialog r7, com.usidqw.qwerklj.Json.DialogListItem r8, int r9) {
            r6 = this;
            java.lang.String r9 = r8.getTitle()
            r9.hashCode()
            int r0 = r9.hashCode()
            r1 = 5
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = -1
            switch(r0) {
                case -1990030434: goto Ld2;
                case -1786379911: goto Lc7;
                case -1580281708: goto Lbc;
                case -1549352647: goto Lb1;
                case -1266297221: goto La6;
                case -996831607: goto L9b;
                case -981386999: goto L90;
                case -892481550: goto L85;
                case 903146: goto L77;
                case 24449006: goto L69;
                case 401002126: goto L5b;
                case 669543617: goto L4d;
                case 1106750286: goto L3f;
                case 1237270505: goto L31;
                case 1906193337: goto L23;
                case 1923946079: goto L15;
                default: goto L13;
            }
        L13:
            goto Ldc
        L15:
            java.lang.String r0 = "自动灵魂匹配"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L1f
            goto Ldc
        L1f:
            r5 = 15
            goto Ldc
        L23:
            java.lang.String r0 = "设置自动灵魂间隔时间"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L2d
            goto Ldc
        L2d:
            r5 = 14
            goto Ldc
        L31:
            java.lang.String r0 = "广场自动发送"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L3b
            goto Ldc
        L3b:
            r5 = 13
            goto Ldc
        L3f:
            java.lang.String r0 = "清空采集的数据"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L49
            goto Ldc
        L49:
            r5 = 12
            goto Ldc
        L4d:
            java.lang.String r0 = "唯一发送"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L57
            goto Ldc
        L57:
            r5 = 11
            goto Ldc
        L5b:
            java.lang.String r0 = "一键聊天列表发送"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L65
            goto Ldc
        L65:
            r5 = 10
            goto Ldc
        L69:
            java.lang.String r0 = "总开关"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L73
            goto Ldc
        L73:
            r5 = 9
            goto Ldc
        L77:
            java.lang.String r0 = "测试"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L81
            goto Ldc
        L81:
            r5 = 8
            goto Ldc
        L85:
            java.lang.String r0 = "status"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L8e
            goto Ldc
        L8e:
            r5 = 7
            goto Ldc
        L90:
            java.lang.String r0 = "开始发送采集用户"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L99
            goto Ldc
        L99:
            r5 = 6
            goto Ldc
        L9b:
            java.lang.String r0 = "关注/被关注手动批量发送"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto La4
            goto Ldc
        La4:
            r5 = r1
            goto Ldc
        La6:
            java.lang.String r0 = "自动灵魂匹配中断运行"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto Laf
            goto Ldc
        Laf:
            r5 = 4
            goto Ldc
        Lb1:
            java.lang.String r0 = "采集最新广场用户"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto Lba
            goto Ldc
        Lba:
            r5 = 3
            goto Ldc
        Lbc:
            java.lang.String r0 = "设置发送内容"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto Lc5
            goto Ldc
        Lc5:
            r5 = r2
            goto Ldc
        Lc7:
            java.lang.String r0 = "监视互动自动发送"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto Ld0
            goto Ldc
        Ld0:
            r5 = r4
            goto Ldc
        Ld2:
            java.lang.String r0 = "设置发送间隔时间"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto Ldb
            goto Ldc
        Ldb:
            r5 = r3
        Ldc:
            java.lang.String r9 = "autoK"
            java.lang.String r0 = "gather"
            switch(r5) {
                case 0: goto L29c;
                case 1: goto L28e;
                case 2: goto L23d;
                case 3: goto L227;
                case 4: goto L218;
                case 5: goto L209;
                case 6: goto L1fd;
                case 7: goto L1f0;
                case 8: goto L1e9;
                case 9: goto L1da;
                case 10: goto L188;
                case 11: goto L179;
                case 12: goto L142;
                case 13: goto L133;
                case 14: goto Lf2;
                case 15: goto Le5;
                default: goto Le3;
            }
        Le3:
            goto L2db
        Le5:
            boolean r7 = r8.isSelected()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            set(r9, r7)
            goto L2db
        Lf2:
            com.usidqw.qwerklj.Dialog.PlusDialog r9 = new com.usidqw.qwerklj.Dialog.PlusDialog
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Code.Init.App
            android.app.Activity r0 = r0.getActivity()
            r9.<init>(r0)
            com.usidqw.qwerklj.Dialog.DialogType r0 = com.usidqw.qwerklj.Dialog.DialogType.INPUT
            com.usidqw.qwerklj.Dialog.PlusDialog r9 = r9.setType(r0)
            com.usidqw.qwerklj.Dialog.PlusDialog r9 = r9.setInputType(r2)
            com.usidqw.qwerklj.Dialog.PlusDialog r9 = r9.setCanceledOnTouchOutside(r4)
            com.usidqw.qwerklj.Dialog.PlusDialog r9 = r9.setDismiss(r3)
            java.lang.String r0 = r8.getTitle()
            com.usidqw.qwerklj.Dialog.PlusDialog r9 = r9.setTitle(r0)
            java.lang.String r0 = "autoKTime"
            int r0 = get(r0, r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.usidqw.qwerklj.Dialog.PlusDialog r9 = r9.setValue(r0)
            com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda6 r0 = new com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda6
            r0.<init>(r7, r8)
            com.usidqw.qwerklj.Dialog.PlusDialog r7 = r9.setOnClickInput(r0)
            r7.show()
            goto L2db
        L133:
            boolean r7 = r8.isSelected()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "autoS"
            set(r8, r7)
            goto L2db
        L142:
            boolean r7 = com.usidqw.qwerklj.Code.Init.isRunSend
            if (r7 == 0) goto L155
            com.usidqw.qwerklj.Utils.ToastPlus r7 = com.usidqw.qwerklj.Utils.ToastPlus.init()
            com.usidqw.qwerklj.Utils.ToastPlus r7 = r7.error()
            java.lang.String r8 = "发送正在运行中,无法清空数据"
            r7.show(r8)
            goto L2db
        L155:
            boolean r7 = get(r0, r3)
            if (r7 == 0) goto L16a
            com.usidqw.qwerklj.Utils.ToastPlus r7 = com.usidqw.qwerklj.Utils.ToastPlus.init()
            com.usidqw.qwerklj.Utils.ToastPlus r7 = r7.error()
            java.lang.String r8 = "采集正在运行中,无法清空数据"
            r7.show(r8)
            goto L2db
        L16a:
            com.usidqw.qwerklj.Tools.JsonMain r7 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r7 = r7.getDb()
            com.usidqw.qwerklj.GreenDao.dao.UserConfigDao r7 = r7.getUserConfigDao()
            r7.deleteAll()
            goto L2db
        L179:
            boolean r7 = r8.isSelected()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "autoO"
            set(r8, r7)
            goto L2db
        L188:
            android.app.Dialog r7 = r7.getDialog()
            r7.dismiss()
            java.util.List r7 = com.usidqw.qwerklj.Code.Api.getConversationList()
            if (r7 == 0) goto L1cb
            java.util.Iterator r8 = r7.iterator()
        L199:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L1ad
            java.lang.Object r9 = r8.next()
            java.lang.String r0 = "b"
            java.lang.String r9 = getStringField(r9, r0)
            com.usidqw.qwerklj.Code.Api.send(r9)
            goto L199
        L1ad:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "已投递:"
            r8.<init>(r9)
            int r7 = r7.size()
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r8 = " 位用户,按照间隔顺序发送"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.usidqw.qwerklj.Dialog.PlusDialog.message(r7)
            goto L2db
        L1cb:
            com.usidqw.qwerklj.Utils.ToastPlus r7 = com.usidqw.qwerklj.Utils.ToastPlus.init()
            com.usidqw.qwerklj.Utils.ToastPlus r7 = r7.error()
            java.lang.String r8 = "未获取到聊天列表"
            r7.show(r8)
            goto L2db
        L1da:
            boolean r7 = r8.isSelected()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "allOpen"
            set(r8, r7)
            goto L2db
        L1e9:
            java.lang.String r7 = "252775995"
            com.usidqw.qwerklj.Code.Api.send(r7)
            goto L2db
        L1f0:
            boolean r7 = r8.isSelected()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            set(r9, r7)
            goto L2db
        L1fd:
            boolean r7 = com.usidqw.qwerklj.Code.Init.isRunSend
            r7 = r7 ^ r4
            com.usidqw.qwerklj.Code.Init.isRunSend = r7
            if (r7 == 0) goto L2db
            RunSendFun()
            goto L2db
        L209:
            boolean r7 = r8.isSelected()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "autoF"
            set(r8, r7)
            goto L2db
        L218:
            boolean r7 = r8.isSelected()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "autoKLimit"
            set(r8, r7)
            goto L2db
        L227:
            boolean r7 = r8.isSelected()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            set(r0, r7)
            boolean r7 = r8.isSelected()
            if (r7 == 0) goto L2db
            com.usidqw.qwerklj.Code.ToolsFun.ReqRecommendedAutoRun()
            goto L2db
        L23d:
            com.google.gson.Gson r7 = new com.google.gson.Gson
            r7.<init>()
            java.lang.String r8 = "content"
            java.lang.String r9 = ""
            java.lang.String r8 = get(r8, r9)
            com.usidqw.qwerklj.Dialog.PlusDialog r9 = new com.usidqw.qwerklj.Dialog.PlusDialog
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Code.Init.App
            android.app.Activity r0 = r0.getActivity()
            r9.<init>(r0)
            java.lang.String r0 = "内容设置"
            r9.setTitle(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.usidqw.qwerklj.Code.Init$1 r1 = new com.usidqw.qwerklj.Code.Init$1     // Catch: com.google.gson.JsonSyntaxException -> L270
            r1.<init>(r6)     // Catch: com.google.gson.JsonSyntaxException -> L270
            java.lang.reflect.Type r1 = r1.getType()     // Catch: com.google.gson.JsonSyntaxException -> L270
            java.lang.Object r7 = r7.fromJson(r8, r1)     // Catch: com.google.gson.JsonSyntaxException -> L270
            java.util.List r7 = (java.util.List) r7     // Catch: com.google.gson.JsonSyntaxException -> L270
            r0 = r7
            goto L274
        L270:
            r7 = move-exception
            r7.printStackTrace()
        L274:
            r9.setListEdit(r0)
            com.usidqw.qwerklj.Dialog.DialogType r7 = com.usidqw.qwerklj.Dialog.DialogType.LIST_EDIT_KEY
            r9.setType(r7)
            com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda8 r7 = new com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda8
            r7.<init>()
            r9.setOnClickInput(r7)
            r9.setCanceledOnTouchOutside(r4)
            r9.setCancelable(r4)
            r9.show()
            goto L2db
        L28e:
            boolean r7 = r8.isSelected()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "autoH"
            set(r8, r7)
            goto L2db
        L29c:
            com.usidqw.qwerklj.Dialog.PlusDialog r9 = new com.usidqw.qwerklj.Dialog.PlusDialog
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Code.Init.App
            android.app.Activity r0 = r0.getActivity()
            r9.<init>(r0)
            com.usidqw.qwerklj.Dialog.DialogType r0 = com.usidqw.qwerklj.Dialog.DialogType.INPUT
            com.usidqw.qwerklj.Dialog.PlusDialog r9 = r9.setType(r0)
            com.usidqw.qwerklj.Dialog.PlusDialog r9 = r9.setInputType(r2)
            com.usidqw.qwerklj.Dialog.PlusDialog r9 = r9.setCanceledOnTouchOutside(r4)
            com.usidqw.qwerklj.Dialog.PlusDialog r9 = r9.setDismiss(r3)
            java.lang.String r0 = r8.getTitle()
            com.usidqw.qwerklj.Dialog.PlusDialog r9 = r9.setTitle(r0)
            java.lang.String r0 = "autoTime"
            int r0 = get(r0, r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.usidqw.qwerklj.Dialog.PlusDialog r9 = r9.setValue(r0)
            com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda7 r0 = new com.usidqw.qwerklj.Code.Init$$ExternalSyntheticLambda7
            r0.<init>(r7, r8)
            com.usidqw.qwerklj.Dialog.PlusDialog r7 = r9.setOnClickInput(r0)
            r7.show()
        L2db:
            return
    }

    /* renamed from: lambda$setPlusNEMenu$10$com-usidqw-qwerklj-Code-Init, reason: not valid java name */
    /* synthetic */ boolean m140lambda$setPlusNEMenu$10$comusidqwqwerkljCodeInit(android.view.View r2) {
            r1 = this;
            android.widget.TextView r2 = r1.text
            float r2 = r2.getAlpha()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            android.widget.TextView r2 = r1.text
            r0 = 0
            r2.setAlpha(r0)
            goto L18
        L13:
            android.widget.TextView r2 = r1.text
            r2.setAlpha(r0)
        L18:
            r2 = 1
            return r2
    }

    /* renamed from: lambda$setPlusNEMenu$9$com-usidqw-qwerklj-Code-Init, reason: not valid java name */
    /* synthetic */ void m141lambda$setPlusNEMenu$9$comusidqwqwerkljCodeInit(android.view.View r1) {
            r0 = this;
            r0.openMenu()
            return
    }

    @Override // com.usidqw.qwerklj.Base.Base
    public void onENHook() {
            r11 = this;
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r2 = "gather"
            set(r2, r1)
            java.lang.String r2 = "autoP"
            set(r2, r1)
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r2[r0] = r3
            com.usidqw.qwerklj.Code.Init$2 r3 = new com.usidqw.qwerklj.Code.Init$2
            r3.<init>(r11)
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "android.widget.TextView"
            java.lang.String r5 = "setText"
            hookMethodSys(r3, r5, r2)
            java.lang.String r2 = "cn.soulapp.android.ad.download.okdl.core.connection.a"
            java.lang.Class r2 = findClass(r2)
            if (r2 != 0) goto L37
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "当前版本无法自适配,请联系作者"
            r1[r0] = r2
            msg(r1)
            return
        L37:
            r3 = 0
            java.lang.String r5 = "b"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r5)     // Catch: java.lang.NoSuchFieldException -> L43
            java.lang.Class r2 = r2.getType()     // Catch: java.lang.NoSuchFieldException -> L43
            goto L51
        L43:
            r2 = move-exception
            r2.printStackTrace()
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r5 = "当前版本无法自适配(无法找到Field),请联系作者"
            r2[r0] = r5
            msg(r2)
            r2 = r3
        L51:
            com.usidqw.qwerklj.Tools.JsonMain r5 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r5 = r5.getReq()
            java.lang.String r6 = "cn.soulapp.android.lib.analyticsV2.net.interceptor.ParamsInterceptor"
            java.lang.Class r6 = findClass(r6)
            java.lang.String r7 = "gzip"
            java.lang.Class r6 = queryClassMethodGetReturn(r6, r7)
            r5.setCreate(r6)
            com.usidqw.qwerklj.Tools.JsonMain r5 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r5 = r5.getReq()
            r5.setRequest(r2)
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r2 = r2.getReq()
            com.usidqw.qwerklj.Tools.JsonMain r5 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r5 = r5.getReq()
            java.lang.Class r5 = r5.getRequest()
            com.usidqw.qwerklj.Tools.JsonMain r6 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r6 = r6.getReq()
            java.lang.Class r6 = r6.getRequest()
            java.lang.String r6 = r6.getName()
            java.lang.String[] r7 = new java.lang.String[r1]
            java.lang.Class r8 = java.lang.Integer.TYPE
            java.lang.String r8 = r8.getName()
            r7[r0] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.String r8 = r8.getName()
            r7[r4] = r8
            java.lang.String r5 = queryClassMethodReverse(r5, r6, r7)
            r2.setCreate_method(r5)
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r2 = r2.getReq()
            java.lang.String r5 = "retrofit2.RequestBuilder"
            java.lang.Class r5 = findClass(r5)
            java.lang.String r6 = "formBuilder"
            java.lang.String r5 = queryClassFieldToName(r5, r6)
            r2.setFormBody(r5)
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r2 = r2.getReq()
            com.usidqw.qwerklj.Tools.JsonMain r5 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r5 = r5.getReq()
            java.lang.String r5 = r5.getFormBody()
            java.lang.Class r5 = findClass(r5)
            com.usidqw.qwerklj.Tools.JsonMain r6 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r6 = r6.getReq()
            java.lang.String r6 = r6.getFormBody()
            java.lang.String[] r7 = new java.lang.String[r1]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.String r8 = r8.getName()
            r7[r0] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.String r8 = r8.getName()
            r7[r4] = r8
            java.lang.String r5 = queryClassMethod(r5, r6, r7)
            r2.setAddCall(r5)
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r2 = r2.getReq()
            com.usidqw.qwerklj.Tools.JsonMain r5 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r5 = r5.getReq()
            java.lang.String r5 = r5.getFormBody()
            java.lang.Class r5 = findClass(r5)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r5 = queryClassMethodGetReturnClass(r5, r6)
            r2.setFormBody_build(r5)
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r2 = r2.getReq()
            com.usidqw.qwerklj.Tools.JsonMain r5 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r5 = r5.getReq()
            java.lang.Class r5 = r5.getRequest()
            com.usidqw.qwerklj.Tools.JsonMain r6 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r6 = r6.getReq()
            java.lang.Class r6 = r6.getRequest()
            java.lang.String r6 = r6.getName()
            java.lang.String[] r7 = new java.lang.String[r4]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.String r8 = r8.getName()
            r7[r0] = r8
            java.lang.String r5 = queryClassMethod_param(r5, r6, r1, r7)
            r2.setAdd_url_method(r5)
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r2 = r2.getReq()
            com.usidqw.qwerklj.Tools.JsonMain r5 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r5 = r5.getReq()
            java.lang.Class r5 = r5.getRequest()
            java.lang.String r5 = queryClassMethodNotReturnNull(r5)
            r2.setBuilder_create(r5)
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r2 = r2.getReq()
            java.lang.String r5 = "retrofit2.Response"
            java.lang.Class r6 = findClass(r5)
            java.lang.String[] r7 = new java.lang.String[r1]
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            java.lang.String r8 = r8.getName()
            r7[r0] = r8
            r7[r4] = r3
            java.lang.String r3 = queryClassParam(r6, r5, r1, r7)
            r2.setSuccess_param(r3)
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r2 = r2.getReq()
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r3 = r3.getReq()
            java.lang.String r3 = r3.getSuccess_param()
            java.lang.Class r3 = findClass(r3)
            java.lang.String r5 = "cn.soulapp.android.miniprogram.core.utils.OkHttpUtil"
            java.lang.Class r5 = findClass(r5)
            com.usidqw.qwerklj.Tools.JsonMain r6 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Req r6 = r6.getReq()
            java.lang.String r6 = r6.getSuccess_param()
            java.lang.String r7 = "void"
            java.lang.String[] r8 = new java.lang.String[]{r7}
            java.lang.String r5 = queryClassParam(r5, r6, r4, r8)
            java.lang.String r3 = queryClassField(r3, r5)
            r2.setRequestField(r3)
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Soul r2 = r2.getSoul()
            java.lang.String r3 = "cn.soulapp.imlib.ChatManager"
            java.lang.Class r3 = findClass(r3)
            java.lang.String r5 = "boolean"
            java.lang.String r6 = "cn.soulapp.imlib.msg.ImMessage"
            java.lang.String[] r5 = new java.lang.String[]{r6, r5}
            java.lang.String r3 = queryClassMethod(r3, r7, r5)
            r2.setSendCmdMessageMethod(r3)
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Soul r2 = r2.getSoul()
            java.lang.String r3 = "cn.soulapp.android.client.component.middle.platform.model.api.user.db.AccountDbManagerMMKV"
            java.lang.Class r3 = findClass(r3)
            java.lang.String r5 = "cn.soulapp.android.client.component.middle.platform.model.api.user.Mine"
            java.lang.String r3 = queryClassMethod(r3, r5)
            r2.setQueryUserInfoMethod(r3)
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Soul r2 = r2.getSoul()
            java.lang.Class r3 = findClass(r6)
            java.lang.String r5 = "cn.soulapp.imlib.msg.push.PushMsg"
            java.lang.String r3 = queryClassMethod(r3, r5)
            r2.setPushMsgMethod(r3)
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r0] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r4] = r5
            com.usidqw.qwerklj.Code.Init$3 r5 = new com.usidqw.qwerklj.Code.Init$3
            r5.<init>(r11)
            r3[r1] = r5
            java.lang.String r5 = "cn.soulapp.android.lib.common.utils.encrypt.UserIdDESUtils"
            java.lang.String r6 = "decryption"
            hookMethod(r5, r6, r3)
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Code.Init.App
            long r5 = r3.getVersionCode()
            r8 = 23070408(0x16006c8, double:1.1398296E-316)
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 < 0) goto L276
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Code.Init.App
            long r5 = r3.getVersionCode()
            r8 = 23072505(0x1600ef9, double:1.1399332E-316)
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 < 0) goto L24d
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Soul r3 = r3.getSoul()
            java.lang.Class r5 = r3.getSelectConversationActivityGet()
            java.lang.String r6 = "void"
            r7 = 0
            r8 = 2
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.Class<java.util.List> r2 = java.util.List.class
            java.lang.String r2 = r2.getName()
            r10[r0] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            java.lang.String r2 = r2.getName()
            r10[r4] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            java.lang.String r2 = r2.getName()
            r10[r1] = r2
            java.lang.String r2 = queryClassMethod(r5, r6, r7, r8, r9, r10)
            goto L296
        L24d:
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Soul r3 = r3.getSoul()
            java.lang.Class r3 = r3.getSelectConversationActivityGet()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.String r5 = r5.getName()
            r2[r0] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            java.lang.String r5 = r5.getName()
            r2[r4] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            java.lang.String r5 = r5.getName()
            r2[r1] = r5
            java.lang.String r2 = queryClassMethod(r3, r7, r0, r0, r2)
            goto L296
        L276:
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Soul r2 = r2.getSoul()
            java.lang.Class r2 = r2.getSelectConversationActivityGet()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.String r5 = r5.getName()
            r3[r0] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            java.lang.String r5 = r5.getName()
            r3[r4] = r5
            java.lang.String r2 = queryClassMethod(r2, r7, r0, r0, r3)
        L296:
            com.usidqw.qwerklj.Code.Api.reqConversationListMethod = r2
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Code.Init.App
            com.usidqw.qwerklj.Json.Soul r3 = r3.getSoul()
            java.lang.Class r3 = r3.getSelectConversationActivityGet()
            com.usidqw.qwerklj.Code.Init$4 r5 = new com.usidqw.qwerklj.Code.Init$4
            r5.<init>(r11)
            hookAllMethods(r3, r2, r5)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r1[r0] = r2
            com.usidqw.qwerklj.Code.Init$5 r0 = new com.usidqw.qwerklj.Code.Init$5
            r0.<init>(r11)
            r1[r4] = r0
            java.lang.String r0 = "retrofit2.Retrofit"
            java.lang.String r2 = "create"
            hookMethod(r0, r2, r1)
            com.usidqw.qwerklj.Code.Init$6 r0 = new com.usidqw.qwerklj.Code.Init$6
            r0.<init>(r11)
            java.lang.String r1 = "cn.soulapp.android.component.chat.inputmenu.SingleChatMediaMenu"
            java.lang.String r2 = "setToChatUserId"
            r11.hookAllMethods(r1, r2, r0)
            com.usidqw.qwerklj.Code.Init$7 r0 = new com.usidqw.qwerklj.Code.Init$7
            r0.<init>(r11)
            java.lang.String r3 = "cn.soulapp.android.component.chat.fragment.BaseConversationFragment"
            java.lang.String r4 = "initData"
            r11.hookAllMethods(r3, r4, r0)
            com.usidqw.qwerklj.Code.Init$8 r0 = new com.usidqw.qwerklj.Code.Init$8
            r0.<init>(r11)
            java.lang.String r3 = "cn.soulapp.android.component.home.me.MeFragment"
            java.lang.String r4 = "setBalance"
            r11.hookAllMethods(r3, r4, r0)
            com.usidqw.qwerklj.Code.Init$9 r0 = new com.usidqw.qwerklj.Code.Init$9
            r0.<init>(r11)
            r11.hookAllMethods(r1, r2, r0)
            return
    }
}
