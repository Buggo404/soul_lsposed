package com.usidqw.qwerklj.Tools;

/* loaded from: classes.dex */
public class JsonMain implements java.io.Serializable {
    private java.lang.String AppName;
    private java.lang.Object Aweme;

    /* renamed from: Db */
    private com.usidqw.qwerklj.GreenDao.dao.DaoSession f157Db;
    private float Double_X;
    private float Double_Y;
    private java.lang.Object EnMicroMsg;
    private java.lang.String Field_CommentReplace_Text;
    private java.lang.String Field_TextExtraStruct;
    private java.lang.String Field_VerticalViewPager;
    private java.lang.String Fun_Auto;
    private java.lang.String HookMd5;
    private java.lang.Object Hook_ViewPager;
    private java.lang.Object KeepSpeed;
    private float KeepSpeedNum;
    private boolean LongClick;
    private java.lang.String LongCommentField;
    private java.lang.Object MMActivity;
    private java.lang.String MMGetPath;
    private long MainVersionCode;
    private java.lang.String MainVersionName;
    private java.lang.String Method_CommentReplace;
    private java.lang.String Method_Limit_Double_Like;
    private java.lang.String Param_CommentReplace_1;
    private java.lang.String Pre;
    private java.util.List<java.lang.String> TopLabel;
    private java.util.HashMap<java.lang.String, java.lang.String> TopLabelNames;
    private long VersionCode;
    private java.lang.String VersionName;
    private java.lang.Object VideoViewHolder;
    private android.app.Activity activity;
    private android.app.Application application;
    private java.lang.ClassLoader classLoader;
    private java.lang.String deviceIdNew2;
    private java.lang.String deviceMedia;
    private android.os.Handler handler;
    private com.usidqw.qwerklj.Tools.MyHandlerThread handlerThread;
    private boolean isComment;
    private boolean isOpenMenu;
    private android.os.Looper looper;
    private de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam lpparam;
    private android.os.Handler mainHandler;
    private java.lang.String msgNew;
    private com.usidqw.qwerklj.Json.Req req;
    private long runTime;
    private java.util.HashMap<java.lang.String, java.lang.Object> setList;
    private com.usidqw.qwerklj.Json.Soul soul;
    private android.content.Context systemContext;
    private long systemTime;
    private long timeDecrypt;
    private long timeDiff;
    private android.os.Handler timeHandler;
    private java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> views;

    public JsonMain() {
            r1 = this;
            r1.<init>()
            com.usidqw.qwerklj.Json.Soul r0 = new com.usidqw.qwerklj.Json.Soul
            r0.<init>()
            r1.soul = r0
            com.usidqw.qwerklj.Json.Req r0 = new com.usidqw.qwerklj.Json.Req
            r0.<init>()
            r1.req = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.setList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.TopLabel = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.TopLabelNames = r0
            return
    }

    protected boolean canEqual(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.usidqw.qwerklj.Tools.JsonMain
            return r1
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.usidqw.qwerklj.Tools.JsonMain
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.usidqw.qwerklj.Tools.JsonMain r8 = (com.usidqw.qwerklj.Tools.JsonMain) r8
            boolean r1 = r8.canEqual(r7)
            if (r1 != 0) goto L13
            return r2
        L13:
            long r3 = r7.getRunTime()
            long r5 = r8.getRunTime()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L20
            return r2
        L20:
            long r3 = r7.getVersionCode()
            long r5 = r8.getVersionCode()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L2d
            return r2
        L2d:
            long r3 = r7.getMainVersionCode()
            long r5 = r8.getMainVersionCode()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L3a
            return r2
        L3a:
            boolean r1 = r7.isOpenMenu()
            boolean r3 = r8.isOpenMenu()
            if (r1 == r3) goto L45
            return r2
        L45:
            long r3 = r7.getTimeDecrypt()
            long r5 = r8.getTimeDecrypt()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L52
            return r2
        L52:
            long r3 = r7.getTimeDiff()
            long r5 = r8.getTimeDiff()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L5f
            return r2
        L5f:
            long r3 = r7.getSystemTime()
            long r5 = r8.getSystemTime()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L6c
            return r2
        L6c:
            boolean r1 = r7.isComment()
            boolean r3 = r8.isComment()
            if (r1 == r3) goto L77
            return r2
        L77:
            float r1 = r7.getDouble_X()
            float r3 = r8.getDouble_X()
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L86
            return r2
        L86:
            float r1 = r7.getDouble_Y()
            float r3 = r8.getDouble_Y()
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L95
            return r2
        L95:
            float r1 = r7.getKeepSpeedNum()
            float r3 = r8.getKeepSpeedNum()
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto La4
            return r2
        La4:
            boolean r1 = r7.isLongClick()
            boolean r3 = r8.isLongClick()
            if (r1 == r3) goto Laf
            return r2
        Laf:
            com.usidqw.qwerklj.Json.Soul r1 = r7.getSoul()
            com.usidqw.qwerklj.Json.Soul r3 = r8.getSoul()
            if (r1 != 0) goto Lbc
            if (r3 == 0) goto Lc3
            goto Lc2
        Lbc:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lc3
        Lc2:
            return r2
        Lc3:
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r1 = r7.getLpparam()
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r3 = r8.getLpparam()
            if (r1 != 0) goto Ld0
            if (r3 == 0) goto Ld7
            goto Ld6
        Ld0:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Ld7
        Ld6:
            return r2
        Ld7:
            android.app.Activity r1 = r7.getActivity()
            android.app.Activity r3 = r8.getActivity()
            if (r1 != 0) goto Le4
            if (r3 == 0) goto Leb
            goto Lea
        Le4:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Leb
        Lea:
            return r2
        Leb:
            com.usidqw.qwerklj.Json.Req r1 = r7.getReq()
            com.usidqw.qwerklj.Json.Req r3 = r8.getReq()
            if (r1 != 0) goto Lf8
            if (r3 == 0) goto Lff
            goto Lfe
        Lf8:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lff
        Lfe:
            return r2
        Lff:
            java.lang.String r1 = r7.getDeviceMedia()
            java.lang.String r3 = r8.getDeviceMedia()
            if (r1 != 0) goto L10c
            if (r3 == 0) goto L113
            goto L112
        L10c:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L113
        L112:
            return r2
        L113:
            java.lang.String r1 = r7.getMsgNew()
            java.lang.String r3 = r8.getMsgNew()
            if (r1 != 0) goto L120
            if (r3 == 0) goto L127
            goto L126
        L120:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L127
        L126:
            return r2
        L127:
            java.lang.ClassLoader r1 = r7.getClassLoader()
            java.lang.ClassLoader r3 = r8.getClassLoader()
            if (r1 != 0) goto L134
            if (r3 == 0) goto L13b
            goto L13a
        L134:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L13b
        L13a:
            return r2
        L13b:
            android.os.Handler r1 = r7.getMainHandler()
            android.os.Handler r3 = r8.getMainHandler()
            if (r1 != 0) goto L148
            if (r3 == 0) goto L14f
            goto L14e
        L148:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L14f
        L14e:
            return r2
        L14f:
            android.os.Handler r1 = r7.getTimeHandler()
            android.os.Handler r3 = r8.getTimeHandler()
            if (r1 != 0) goto L15c
            if (r3 == 0) goto L163
            goto L162
        L15c:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L163
        L162:
            return r2
        L163:
            java.lang.String r1 = r7.getAppName()
            java.lang.String r3 = r8.getAppName()
            if (r1 != 0) goto L170
            if (r3 == 0) goto L177
            goto L176
        L170:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L177
        L176:
            return r2
        L177:
            java.lang.String r1 = r7.getVersionName()
            java.lang.String r3 = r8.getVersionName()
            if (r1 != 0) goto L184
            if (r3 == 0) goto L18b
            goto L18a
        L184:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L18b
        L18a:
            return r2
        L18b:
            android.content.Context r1 = r7.getSystemContext()
            android.content.Context r3 = r8.getSystemContext()
            if (r1 != 0) goto L198
            if (r3 == 0) goto L19f
            goto L19e
        L198:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L19f
        L19e:
            return r2
        L19f:
            java.lang.String r1 = r7.getPre()
            java.lang.String r3 = r8.getPre()
            if (r1 != 0) goto L1ac
            if (r3 == 0) goto L1b3
            goto L1b2
        L1ac:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b3
        L1b2:
            return r2
        L1b3:
            java.lang.String r1 = r7.getMainVersionName()
            java.lang.String r3 = r8.getMainVersionName()
            if (r1 != 0) goto L1c0
            if (r3 == 0) goto L1c7
            goto L1c6
        L1c0:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1c7
        L1c6:
            return r2
        L1c7:
            android.app.Application r1 = r7.getApplication()
            android.app.Application r3 = r8.getApplication()
            if (r1 != 0) goto L1d4
            if (r3 == 0) goto L1db
            goto L1da
        L1d4:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1db
        L1da:
            return r2
        L1db:
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r1 = r7.getDb()
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r3 = r8.getDb()
            if (r1 != 0) goto L1e8
            if (r3 == 0) goto L1ef
            goto L1ee
        L1e8:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1ef
        L1ee:
            return r2
        L1ef:
            com.usidqw.qwerklj.Tools.MyHandlerThread r1 = r7.getHandlerThread()
            com.usidqw.qwerklj.Tools.MyHandlerThread r3 = r8.getHandlerThread()
            if (r1 != 0) goto L1fc
            if (r3 == 0) goto L203
            goto L202
        L1fc:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L203
        L202:
            return r2
        L203:
            android.os.Handler r1 = r7.getHandler()
            android.os.Handler r3 = r8.getHandler()
            if (r1 != 0) goto L210
            if (r3 == 0) goto L217
            goto L216
        L210:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L217
        L216:
            return r2
        L217:
            android.os.Looper r1 = r7.getLooper()
            android.os.Looper r3 = r8.getLooper()
            if (r1 != 0) goto L224
            if (r3 == 0) goto L22b
            goto L22a
        L224:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L22b
        L22a:
            return r2
        L22b:
            java.lang.String r1 = r7.getDeviceIdNew2()
            java.lang.String r3 = r8.getDeviceIdNew2()
            if (r1 != 0) goto L238
            if (r3 == 0) goto L23f
            goto L23e
        L238:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L23f
        L23e:
            return r2
        L23f:
            java.lang.String r1 = r7.getHookMd5()
            java.lang.String r3 = r8.getHookMd5()
            if (r1 != 0) goto L24c
            if (r3 == 0) goto L253
            goto L252
        L24c:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L253
        L252:
            return r2
        L253:
            java.lang.Object r1 = r7.getAweme()
            java.lang.Object r3 = r8.getAweme()
            if (r1 != 0) goto L260
            if (r3 == 0) goto L267
            goto L266
        L260:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L267
        L266:
            return r2
        L267:
            java.util.HashMap r1 = r7.getSetList()
            java.util.HashMap r3 = r8.getSetList()
            if (r1 != 0) goto L274
            if (r3 == 0) goto L27b
            goto L27a
        L274:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L27b
        L27a:
            return r2
        L27b:
            java.lang.String r1 = r7.getFun_Auto()
            java.lang.String r3 = r8.getFun_Auto()
            if (r1 != 0) goto L288
            if (r3 == 0) goto L28f
            goto L28e
        L288:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L28f
        L28e:
            return r2
        L28f:
            java.lang.String r1 = r7.getField_VerticalViewPager()
            java.lang.String r3 = r8.getField_VerticalViewPager()
            if (r1 != 0) goto L29c
            if (r3 == 0) goto L2a3
            goto L2a2
        L29c:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L2a3
        L2a2:
            return r2
        L2a3:
            java.lang.String r1 = r7.getMethod_Limit_Double_Like()
            java.lang.String r3 = r8.getMethod_Limit_Double_Like()
            if (r1 != 0) goto L2b0
            if (r3 == 0) goto L2b7
            goto L2b6
        L2b0:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L2b7
        L2b6:
            return r2
        L2b7:
            java.lang.Object r1 = r7.getHook_ViewPager()
            java.lang.Object r3 = r8.getHook_ViewPager()
            if (r1 != 0) goto L2c4
            if (r3 == 0) goto L2cb
            goto L2ca
        L2c4:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L2cb
        L2ca:
            return r2
        L2cb:
            java.lang.Object r1 = r7.getKeepSpeed()
            java.lang.Object r3 = r8.getKeepSpeed()
            if (r1 != 0) goto L2d8
            if (r3 == 0) goto L2df
            goto L2de
        L2d8:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L2df
        L2de:
            return r2
        L2df:
            java.lang.Object r1 = r7.getVideoViewHolder()
            java.lang.Object r3 = r8.getVideoViewHolder()
            if (r1 != 0) goto L2ec
            if (r3 == 0) goto L2f3
            goto L2f2
        L2ec:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L2f3
        L2f2:
            return r2
        L2f3:
            java.lang.String r1 = r7.getMethod_CommentReplace()
            java.lang.String r3 = r8.getMethod_CommentReplace()
            if (r1 != 0) goto L300
            if (r3 == 0) goto L307
            goto L306
        L300:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L307
        L306:
            return r2
        L307:
            java.lang.String r1 = r7.getParam_CommentReplace_1()
            java.lang.String r3 = r8.getParam_CommentReplace_1()
            if (r1 != 0) goto L314
            if (r3 == 0) goto L31b
            goto L31a
        L314:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L31b
        L31a:
            return r2
        L31b:
            java.lang.String r1 = r7.getField_TextExtraStruct()
            java.lang.String r3 = r8.getField_TextExtraStruct()
            if (r1 != 0) goto L328
            if (r3 == 0) goto L32f
            goto L32e
        L328:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L32f
        L32e:
            return r2
        L32f:
            java.lang.String r1 = r7.getField_CommentReplace_Text()
            java.lang.String r3 = r8.getField_CommentReplace_Text()
            if (r1 != 0) goto L33c
            if (r3 == 0) goto L343
            goto L342
        L33c:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L343
        L342:
            return r2
        L343:
            java.util.List r1 = r7.getViews()
            java.util.List r3 = r8.getViews()
            if (r1 != 0) goto L350
            if (r3 == 0) goto L357
            goto L356
        L350:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L357
        L356:
            return r2
        L357:
            java.lang.String r1 = r7.getLongCommentField()
            java.lang.String r3 = r8.getLongCommentField()
            if (r1 != 0) goto L364
            if (r3 == 0) goto L36b
            goto L36a
        L364:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L36b
        L36a:
            return r2
        L36b:
            java.lang.Object r1 = r7.getEnMicroMsg()
            java.lang.Object r3 = r8.getEnMicroMsg()
            if (r1 != 0) goto L378
            if (r3 == 0) goto L37f
            goto L37e
        L378:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L37f
        L37e:
            return r2
        L37f:
            java.lang.Object r1 = r7.getMMActivity()
            java.lang.Object r3 = r8.getMMActivity()
            if (r1 != 0) goto L38c
            if (r3 == 0) goto L393
            goto L392
        L38c:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L393
        L392:
            return r2
        L393:
            java.lang.String r1 = r7.getMMGetPath()
            java.lang.String r3 = r8.getMMGetPath()
            if (r1 != 0) goto L3a0
            if (r3 == 0) goto L3a7
            goto L3a6
        L3a0:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3a7
        L3a6:
            return r2
        L3a7:
            java.util.List r1 = r7.getTopLabel()
            java.util.List r3 = r8.getTopLabel()
            if (r1 != 0) goto L3b4
            if (r3 == 0) goto L3bb
            goto L3ba
        L3b4:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3bb
        L3ba:
            return r2
        L3bb:
            java.util.HashMap r1 = r7.getTopLabelNames()
            java.util.HashMap r8 = r8.getTopLabelNames()
            if (r1 != 0) goto L3c8
            if (r8 == 0) goto L3cf
            goto L3ce
        L3c8:
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L3cf
        L3ce:
            return r2
        L3cf:
            return r0
    }

    public android.app.Activity getActivity() {
            r1 = this;
            android.app.Activity r0 = r1.activity
            return r0
    }

    public java.lang.String getAppName() {
            r1 = this;
            java.lang.String r0 = r1.AppName
            return r0
    }

    public android.app.Application getApplication() {
            r1 = this;
            android.app.Application r0 = r1.application
            return r0
    }

    public java.lang.Object getAweme() {
            r1 = this;
            java.lang.Object r0 = r1.Aweme
            return r0
    }

    public java.lang.ClassLoader getClassLoader() {
            r1 = this;
            java.lang.ClassLoader r0 = r1.classLoader
            return r0
    }

    public com.usidqw.qwerklj.GreenDao.dao.DaoSession getDb() {
            r1 = this;
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r1.f157Db
            return r0
    }

    public java.lang.String getDeviceIdNew2() {
            r1 = this;
            java.lang.String r0 = r1.deviceIdNew2
            return r0
    }

    public java.lang.String getDeviceMedia() {
            r1 = this;
            java.lang.String r0 = r1.deviceMedia
            return r0
    }

    public float getDouble_X() {
            r1 = this;
            float r0 = r1.Double_X
            return r0
    }

    public float getDouble_Y() {
            r1 = this;
            float r0 = r1.Double_Y
            return r0
    }

    public java.lang.Object getEnMicroMsg() {
            r1 = this;
            java.lang.Object r0 = r1.EnMicroMsg
            return r0
    }

    public java.lang.String getField_CommentReplace_Text() {
            r1 = this;
            java.lang.String r0 = r1.Field_CommentReplace_Text
            return r0
    }

    public java.lang.String getField_TextExtraStruct() {
            r1 = this;
            java.lang.String r0 = r1.Field_TextExtraStruct
            return r0
    }

    public java.lang.String getField_VerticalViewPager() {
            r1 = this;
            java.lang.String r0 = r1.Field_VerticalViewPager
            return r0
    }

    public java.lang.String getFun_Auto() {
            r1 = this;
            java.lang.String r0 = r1.Fun_Auto
            return r0
    }

    public android.os.Handler getHandler() {
            r1 = this;
            android.os.Handler r0 = r1.handler
            return r0
    }

    public com.usidqw.qwerklj.Tools.MyHandlerThread getHandlerThread() {
            r1 = this;
            com.usidqw.qwerklj.Tools.MyHandlerThread r0 = r1.handlerThread
            return r0
    }

    public java.lang.String getHookMd5() {
            r1 = this;
            java.lang.String r0 = r1.HookMd5
            return r0
    }

    public java.lang.Object getHook_ViewPager() {
            r1 = this;
            java.lang.Object r0 = r1.Hook_ViewPager
            return r0
    }

    public java.lang.Object getKeepSpeed() {
            r1 = this;
            java.lang.Object r0 = r1.KeepSpeed
            return r0
    }

    public float getKeepSpeedNum() {
            r1 = this;
            float r0 = r1.KeepSpeedNum
            return r0
    }

    public java.lang.String getLongCommentField() {
            r1 = this;
            java.lang.String r0 = r1.LongCommentField
            return r0
    }

    public android.os.Looper getLooper() {
            r1 = this;
            android.os.Looper r0 = r1.looper
            return r0
    }

    public de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam getLpparam() {
            r1 = this;
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r0 = r1.lpparam
            return r0
    }

    public java.lang.Object getMMActivity() {
            r1 = this;
            java.lang.Object r0 = r1.MMActivity
            return r0
    }

    public java.lang.String getMMGetPath() {
            r1 = this;
            java.lang.String r0 = r1.MMGetPath
            return r0
    }

    public android.os.Handler getMainHandler() {
            r1 = this;
            android.os.Handler r0 = r1.mainHandler
            return r0
    }

    public long getMainVersionCode() {
            r2 = this;
            long r0 = r2.MainVersionCode
            return r0
    }

    public java.lang.String getMainVersionName() {
            r1 = this;
            java.lang.String r0 = r1.MainVersionName
            return r0
    }

    public java.lang.String getMethod_CommentReplace() {
            r1 = this;
            java.lang.String r0 = r1.Method_CommentReplace
            return r0
    }

    public java.lang.String getMethod_Limit_Double_Like() {
            r1 = this;
            java.lang.String r0 = r1.Method_Limit_Double_Like
            return r0
    }

    public java.lang.String getMsgNew() {
            r1 = this;
            java.lang.String r0 = r1.msgNew
            return r0
    }

    public java.lang.String getParam_CommentReplace_1() {
            r1 = this;
            java.lang.String r0 = r1.Param_CommentReplace_1
            return r0
    }

    public java.lang.String getPre() {
            r1 = this;
            java.lang.String r0 = r1.Pre
            return r0
    }

    public com.usidqw.qwerklj.Json.Req getReq() {
            r1 = this;
            com.usidqw.qwerklj.Json.Req r0 = r1.req
            return r0
    }

    public long getRunTime() {
            r2 = this;
            long r0 = r2.runTime
            return r0
    }

    public java.util.HashMap<java.lang.String, java.lang.Object> getSetList() {
            r1 = this;
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r1.setList
            return r0
    }

    public com.usidqw.qwerklj.Json.Soul getSoul() {
            r1 = this;
            com.usidqw.qwerklj.Json.Soul r0 = r1.soul
            return r0
    }

    public android.content.Context getSystemContext() {
            r1 = this;
            android.content.Context r0 = r1.systemContext
            return r0
    }

    public long getSystemTime() {
            r2 = this;
            long r0 = r2.systemTime
            return r0
    }

    public long getTimeDecrypt() {
            r2 = this;
            long r0 = r2.timeDecrypt
            return r0
    }

    public long getTimeDiff() {
            r2 = this;
            long r0 = r2.timeDiff
            return r0
    }

    public android.os.Handler getTimeHandler() {
            r1 = this;
            android.os.Handler r0 = r1.timeHandler
            return r0
    }

    public java.util.List<java.lang.String> getTopLabel() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.TopLabel
            return r0
    }

    public java.util.HashMap<java.lang.String, java.lang.String> getTopLabelNames() {
            r1 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.TopLabelNames
            return r0
    }

    public long getVersionCode() {
            r2 = this;
            long r0 = r2.VersionCode
            return r0
    }

    public java.lang.String getVersionName() {
            r1 = this;
            java.lang.String r0 = r1.VersionName
            return r0
    }

    public java.lang.Object getVideoViewHolder() {
            r1 = this;
            java.lang.Object r0 = r1.VideoViewHolder
            return r0
    }

    public java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> getViews() {
            r1 = this;
            java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r0 = r1.views
            return r0
    }

    public int hashCode() {
            r10 = this;
            long r0 = r10.getRunTime()
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r0 = (int) r0
            r1 = 59
            int r0 = r0 + r1
            long r3 = r10.getVersionCode()
            int r0 = r0 * r1
            long r5 = r3 >>> r2
            long r3 = r3 ^ r5
            int r3 = (int) r3
            int r0 = r0 + r3
            long r3 = r10.getMainVersionCode()
            int r0 = r0 * r1
            long r5 = r3 >>> r2
            long r3 = r3 ^ r5
            int r3 = (int) r3
            int r0 = r0 + r3
            int r0 = r0 * r1
            boolean r3 = r10.isOpenMenu()
            r4 = 79
            r5 = 97
            if (r3 == 0) goto L2e
            r3 = r4
            goto L2f
        L2e:
            r3 = r5
        L2f:
            int r0 = r0 + r3
            long r6 = r10.getTimeDecrypt()
            int r0 = r0 * r1
            long r8 = r6 >>> r2
            long r6 = r6 ^ r8
            int r3 = (int) r6
            int r0 = r0 + r3
            long r6 = r10.getTimeDiff()
            int r0 = r0 * r1
            long r8 = r6 >>> r2
            long r6 = r6 ^ r8
            int r3 = (int) r6
            int r0 = r0 + r3
            long r6 = r10.getSystemTime()
            int r0 = r0 * r1
            long r2 = r6 >>> r2
            long r2 = r2 ^ r6
            int r2 = (int) r2
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r10.isComment()
            if (r2 == 0) goto L57
            r2 = r4
            goto L58
        L57:
            r2 = r5
        L58:
            int r0 = r0 + r2
            int r0 = r0 * r1
            float r2 = r10.getDouble_X()
            int r2 = java.lang.Float.floatToIntBits(r2)
            int r0 = r0 + r2
            int r0 = r0 * r1
            float r2 = r10.getDouble_Y()
            int r2 = java.lang.Float.floatToIntBits(r2)
            int r0 = r0 + r2
            int r0 = r0 * r1
            float r2 = r10.getKeepSpeedNum()
            int r2 = java.lang.Float.floatToIntBits(r2)
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r10.isLongClick()
            if (r2 == 0) goto L7f
            goto L80
        L7f:
            r4 = r5
        L80:
            int r0 = r0 + r4
            com.usidqw.qwerklj.Json.Soul r2 = r10.getSoul()
            int r0 = r0 * r1
            r3 = 43
            if (r2 != 0) goto L8c
            r2 = r3
            goto L90
        L8c:
            int r2 = r2.hashCode()
        L90:
            int r0 = r0 + r2
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r2 = r10.getLpparam()
            int r0 = r0 * r1
            if (r2 != 0) goto L9a
            r2 = r3
            goto L9e
        L9a:
            int r2 = r2.hashCode()
        L9e:
            int r0 = r0 + r2
            android.app.Activity r2 = r10.getActivity()
            int r0 = r0 * r1
            if (r2 != 0) goto La8
            r2 = r3
            goto Lac
        La8:
            int r2 = r2.hashCode()
        Lac:
            int r0 = r0 + r2
            com.usidqw.qwerklj.Json.Req r2 = r10.getReq()
            int r0 = r0 * r1
            if (r2 != 0) goto Lb6
            r2 = r3
            goto Lba
        Lb6:
            int r2 = r2.hashCode()
        Lba:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getDeviceMedia()
            int r0 = r0 * r1
            if (r2 != 0) goto Lc4
            r2 = r3
            goto Lc8
        Lc4:
            int r2 = r2.hashCode()
        Lc8:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getMsgNew()
            int r0 = r0 * r1
            if (r2 != 0) goto Ld2
            r2 = r3
            goto Ld6
        Ld2:
            int r2 = r2.hashCode()
        Ld6:
            int r0 = r0 + r2
            java.lang.ClassLoader r2 = r10.getClassLoader()
            int r0 = r0 * r1
            if (r2 != 0) goto Le0
            r2 = r3
            goto Le4
        Le0:
            int r2 = r2.hashCode()
        Le4:
            int r0 = r0 + r2
            android.os.Handler r2 = r10.getMainHandler()
            int r0 = r0 * r1
            if (r2 != 0) goto Lee
            r2 = r3
            goto Lf2
        Lee:
            int r2 = r2.hashCode()
        Lf2:
            int r0 = r0 + r2
            android.os.Handler r2 = r10.getTimeHandler()
            int r0 = r0 * r1
            if (r2 != 0) goto Lfc
            r2 = r3
            goto L100
        Lfc:
            int r2 = r2.hashCode()
        L100:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getAppName()
            int r0 = r0 * r1
            if (r2 != 0) goto L10a
            r2 = r3
            goto L10e
        L10a:
            int r2 = r2.hashCode()
        L10e:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getVersionName()
            int r0 = r0 * r1
            if (r2 != 0) goto L118
            r2 = r3
            goto L11c
        L118:
            int r2 = r2.hashCode()
        L11c:
            int r0 = r0 + r2
            android.content.Context r2 = r10.getSystemContext()
            int r0 = r0 * r1
            if (r2 != 0) goto L126
            r2 = r3
            goto L12a
        L126:
            int r2 = r2.hashCode()
        L12a:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getPre()
            int r0 = r0 * r1
            if (r2 != 0) goto L134
            r2 = r3
            goto L138
        L134:
            int r2 = r2.hashCode()
        L138:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getMainVersionName()
            int r0 = r0 * r1
            if (r2 != 0) goto L142
            r2 = r3
            goto L146
        L142:
            int r2 = r2.hashCode()
        L146:
            int r0 = r0 + r2
            android.app.Application r2 = r10.getApplication()
            int r0 = r0 * r1
            if (r2 != 0) goto L150
            r2 = r3
            goto L154
        L150:
            int r2 = r2.hashCode()
        L154:
            int r0 = r0 + r2
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r2 = r10.getDb()
            int r0 = r0 * r1
            if (r2 != 0) goto L15e
            r2 = r3
            goto L162
        L15e:
            int r2 = r2.hashCode()
        L162:
            int r0 = r0 + r2
            com.usidqw.qwerklj.Tools.MyHandlerThread r2 = r10.getHandlerThread()
            int r0 = r0 * r1
            if (r2 != 0) goto L16c
            r2 = r3
            goto L170
        L16c:
            int r2 = r2.hashCode()
        L170:
            int r0 = r0 + r2
            android.os.Handler r2 = r10.getHandler()
            int r0 = r0 * r1
            if (r2 != 0) goto L17a
            r2 = r3
            goto L17e
        L17a:
            int r2 = r2.hashCode()
        L17e:
            int r0 = r0 + r2
            android.os.Looper r2 = r10.getLooper()
            int r0 = r0 * r1
            if (r2 != 0) goto L188
            r2 = r3
            goto L18c
        L188:
            int r2 = r2.hashCode()
        L18c:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getDeviceIdNew2()
            int r0 = r0 * r1
            if (r2 != 0) goto L196
            r2 = r3
            goto L19a
        L196:
            int r2 = r2.hashCode()
        L19a:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getHookMd5()
            int r0 = r0 * r1
            if (r2 != 0) goto L1a4
            r2 = r3
            goto L1a8
        L1a4:
            int r2 = r2.hashCode()
        L1a8:
            int r0 = r0 + r2
            java.lang.Object r2 = r10.getAweme()
            int r0 = r0 * r1
            if (r2 != 0) goto L1b2
            r2 = r3
            goto L1b6
        L1b2:
            int r2 = r2.hashCode()
        L1b6:
            int r0 = r0 + r2
            java.util.HashMap r2 = r10.getSetList()
            int r0 = r0 * r1
            if (r2 != 0) goto L1c0
            r2 = r3
            goto L1c4
        L1c0:
            int r2 = r2.hashCode()
        L1c4:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getFun_Auto()
            int r0 = r0 * r1
            if (r2 != 0) goto L1ce
            r2 = r3
            goto L1d2
        L1ce:
            int r2 = r2.hashCode()
        L1d2:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getField_VerticalViewPager()
            int r0 = r0 * r1
            if (r2 != 0) goto L1dc
            r2 = r3
            goto L1e0
        L1dc:
            int r2 = r2.hashCode()
        L1e0:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getMethod_Limit_Double_Like()
            int r0 = r0 * r1
            if (r2 != 0) goto L1ea
            r2 = r3
            goto L1ee
        L1ea:
            int r2 = r2.hashCode()
        L1ee:
            int r0 = r0 + r2
            java.lang.Object r2 = r10.getHook_ViewPager()
            int r0 = r0 * r1
            if (r2 != 0) goto L1f8
            r2 = r3
            goto L1fc
        L1f8:
            int r2 = r2.hashCode()
        L1fc:
            int r0 = r0 + r2
            java.lang.Object r2 = r10.getKeepSpeed()
            int r0 = r0 * r1
            if (r2 != 0) goto L206
            r2 = r3
            goto L20a
        L206:
            int r2 = r2.hashCode()
        L20a:
            int r0 = r0 + r2
            java.lang.Object r2 = r10.getVideoViewHolder()
            int r0 = r0 * r1
            if (r2 != 0) goto L214
            r2 = r3
            goto L218
        L214:
            int r2 = r2.hashCode()
        L218:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getMethod_CommentReplace()
            int r0 = r0 * r1
            if (r2 != 0) goto L222
            r2 = r3
            goto L226
        L222:
            int r2 = r2.hashCode()
        L226:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getParam_CommentReplace_1()
            int r0 = r0 * r1
            if (r2 != 0) goto L230
            r2 = r3
            goto L234
        L230:
            int r2 = r2.hashCode()
        L234:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getField_TextExtraStruct()
            int r0 = r0 * r1
            if (r2 != 0) goto L23e
            r2 = r3
            goto L242
        L23e:
            int r2 = r2.hashCode()
        L242:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getField_CommentReplace_Text()
            int r0 = r0 * r1
            if (r2 != 0) goto L24c
            r2 = r3
            goto L250
        L24c:
            int r2 = r2.hashCode()
        L250:
            int r0 = r0 + r2
            java.util.List r2 = r10.getViews()
            int r0 = r0 * r1
            if (r2 != 0) goto L25a
            r2 = r3
            goto L25e
        L25a:
            int r2 = r2.hashCode()
        L25e:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getLongCommentField()
            int r0 = r0 * r1
            if (r2 != 0) goto L268
            r2 = r3
            goto L26c
        L268:
            int r2 = r2.hashCode()
        L26c:
            int r0 = r0 + r2
            java.lang.Object r2 = r10.getEnMicroMsg()
            int r0 = r0 * r1
            if (r2 != 0) goto L276
            r2 = r3
            goto L27a
        L276:
            int r2 = r2.hashCode()
        L27a:
            int r0 = r0 + r2
            java.lang.Object r2 = r10.getMMActivity()
            int r0 = r0 * r1
            if (r2 != 0) goto L284
            r2 = r3
            goto L288
        L284:
            int r2 = r2.hashCode()
        L288:
            int r0 = r0 + r2
            java.lang.String r2 = r10.getMMGetPath()
            int r0 = r0 * r1
            if (r2 != 0) goto L292
            r2 = r3
            goto L296
        L292:
            int r2 = r2.hashCode()
        L296:
            int r0 = r0 + r2
            java.util.List r2 = r10.getTopLabel()
            int r0 = r0 * r1
            if (r2 != 0) goto L2a0
            r2 = r3
            goto L2a4
        L2a0:
            int r2 = r2.hashCode()
        L2a4:
            int r0 = r0 + r2
            java.util.HashMap r2 = r10.getTopLabelNames()
            int r0 = r0 * r1
            if (r2 != 0) goto L2ad
            goto L2b1
        L2ad:
            int r3 = r2.hashCode()
        L2b1:
            int r0 = r0 + r3
            return r0
    }

    public boolean isComment() {
            r1 = this;
            boolean r0 = r1.isComment
            return r0
    }

    public boolean isLongClick() {
            r1 = this;
            boolean r0 = r1.LongClick
            return r0
    }

    public boolean isOpenMenu() {
            r1 = this;
            boolean r0 = r1.isOpenMenu
            return r0
    }

    public void setActivity(android.app.Activity r1) {
            r0 = this;
            r0.activity = r1
            return
    }

    public void setAppName(java.lang.String r1) {
            r0 = this;
            r0.AppName = r1
            return
    }

    public void setApplication(android.app.Application r1) {
            r0 = this;
            r0.application = r1
            return
    }

    public void setAweme(java.lang.Object r1) {
            r0 = this;
            r0.Aweme = r1
            return
    }

    public void setClassLoader(java.lang.ClassLoader r1) {
            r0 = this;
            r0.classLoader = r1
            return
    }

    public void setComment(boolean r1) {
            r0 = this;
            r0.isComment = r1
            return
    }

    public void setDb(com.usidqw.qwerklj.GreenDao.dao.DaoSession r1) {
            r0 = this;
            r0.f157Db = r1
            return
    }

    public void setDeviceIdNew2(java.lang.String r1) {
            r0 = this;
            r0.deviceIdNew2 = r1
            return
    }

    public void setDeviceMedia(java.lang.String r1) {
            r0 = this;
            r0.deviceMedia = r1
            return
    }

    public void setDouble_X(float r1) {
            r0 = this;
            r0.Double_X = r1
            return
    }

    public void setDouble_Y(float r1) {
            r0 = this;
            r0.Double_Y = r1
            return
    }

    public void setEnMicroMsg(java.lang.Object r1) {
            r0 = this;
            r0.EnMicroMsg = r1
            return
    }

    public void setField_CommentReplace_Text(java.lang.String r1) {
            r0 = this;
            r0.Field_CommentReplace_Text = r1
            return
    }

    public void setField_TextExtraStruct(java.lang.String r1) {
            r0 = this;
            r0.Field_TextExtraStruct = r1
            return
    }

    public void setField_VerticalViewPager(java.lang.String r1) {
            r0 = this;
            r0.Field_VerticalViewPager = r1
            return
    }

    public void setFun_Auto(java.lang.String r1) {
            r0 = this;
            r0.Fun_Auto = r1
            return
    }

    public void setHandler(android.os.Handler r1) {
            r0 = this;
            r0.handler = r1
            return
    }

    public void setHandlerThread(com.usidqw.qwerklj.Tools.MyHandlerThread r1) {
            r0 = this;
            r0.handlerThread = r1
            return
    }

    public void setHookMd5(java.lang.String r1) {
            r0 = this;
            r0.HookMd5 = r1
            return
    }

    public void setHook_ViewPager(java.lang.Object r1) {
            r0 = this;
            r0.Hook_ViewPager = r1
            return
    }

    public void setKeepSpeed(java.lang.Object r1) {
            r0 = this;
            r0.KeepSpeed = r1
            return
    }

    public void setKeepSpeedNum(float r1) {
            r0 = this;
            r0.KeepSpeedNum = r1
            return
    }

    public void setLongClick(boolean r1) {
            r0 = this;
            r0.LongClick = r1
            return
    }

    public void setLongCommentField(java.lang.String r1) {
            r0 = this;
            r0.LongCommentField = r1
            return
    }

    public void setLooper(android.os.Looper r1) {
            r0 = this;
            r0.looper = r1
            return
    }

    public void setLpparam(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r1) {
            r0 = this;
            r0.lpparam = r1
            return
    }

    public void setMMActivity(java.lang.Object r1) {
            r0 = this;
            r0.MMActivity = r1
            return
    }

    public void setMMGetPath(java.lang.String r1) {
            r0 = this;
            r0.MMGetPath = r1
            return
    }

    public void setMainHandler(android.os.Handler r1) {
            r0 = this;
            r0.mainHandler = r1
            return
    }

    public void setMainVersionCode(long r1) {
            r0 = this;
            r0.MainVersionCode = r1
            return
    }

    public void setMainVersionName(java.lang.String r1) {
            r0 = this;
            r0.MainVersionName = r1
            return
    }

    public void setMethod_CommentReplace(java.lang.String r1) {
            r0 = this;
            r0.Method_CommentReplace = r1
            return
    }

    public void setMethod_Limit_Double_Like(java.lang.String r1) {
            r0 = this;
            r0.Method_Limit_Double_Like = r1
            return
    }

    public void setMsgNew(java.lang.String r1) {
            r0 = this;
            r0.msgNew = r1
            return
    }

    public void setOpenMenu(boolean r1) {
            r0 = this;
            r0.isOpenMenu = r1
            return
    }

    public void setParam_CommentReplace_1(java.lang.String r1) {
            r0 = this;
            r0.Param_CommentReplace_1 = r1
            return
    }

    public void setPre(java.lang.String r1) {
            r0 = this;
            r0.Pre = r1
            return
    }

    public void setReq(com.usidqw.qwerklj.Json.Req r1) {
            r0 = this;
            r0.req = r1
            return
    }

    public void setRunTime(long r1) {
            r0 = this;
            r0.runTime = r1
            return
    }

    public void setSetList(java.util.HashMap<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            r0.setList = r1
            return
    }

    public void setSoul(com.usidqw.qwerklj.Json.Soul r1) {
            r0 = this;
            r0.soul = r1
            return
    }

    public void setSystemContext(android.content.Context r1) {
            r0 = this;
            r0.systemContext = r1
            return
    }

    public void setSystemTime(long r1) {
            r0 = this;
            r0.systemTime = r1
            return
    }

    public void setTimeDecrypt(long r1) {
            r0 = this;
            r0.timeDecrypt = r1
            return
    }

    public void setTimeDiff(long r1) {
            r0 = this;
            r0.timeDiff = r1
            return
    }

    public void setTimeHandler(android.os.Handler r1) {
            r0 = this;
            r0.timeHandler = r1
            return
    }

    public void setTopLabel(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.TopLabel = r1
            return
    }

    public void setTopLabelNames(java.util.HashMap<java.lang.String, java.lang.String> r1) {
            r0 = this;
            r0.TopLabelNames = r1
            return
    }

    public void setVersionCode(long r1) {
            r0 = this;
            r0.VersionCode = r1
            return
    }

    public void setVersionName(java.lang.String r1) {
            r0 = this;
            r0.VersionName = r1
            return
    }

    public void setVideoViewHolder(java.lang.Object r1) {
            r0 = this;
            r0.VideoViewHolder = r1
            return
    }

    public void setViews(java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r1) {
            r0 = this;
            r0.views = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "JsonMain(runTime="
            r0.<init>(r1)
            long r1 = r3.getRunTime()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", soul="
            java.lang.StringBuilder r0 = r0.append(r1)
            com.usidqw.qwerklj.Json.Soul r1 = r3.getSoul()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", lpparam="
            java.lang.StringBuilder r0 = r0.append(r1)
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r1 = r3.getLpparam()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", activity="
            java.lang.StringBuilder r0 = r0.append(r1)
            android.app.Activity r1 = r3.getActivity()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", req="
            java.lang.StringBuilder r0 = r0.append(r1)
            com.usidqw.qwerklj.Json.Req r1 = r3.getReq()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", deviceMedia="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getDeviceMedia()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", msgNew="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getMsgNew()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", classLoader="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.ClassLoader r1 = r3.getClassLoader()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", mainHandler="
            java.lang.StringBuilder r0 = r0.append(r1)
            android.os.Handler r1 = r3.getMainHandler()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", timeHandler="
            java.lang.StringBuilder r0 = r0.append(r1)
            android.os.Handler r1 = r3.getTimeHandler()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", AppName="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getAppName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", VersionName="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getVersionName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", VersionCode="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.getVersionCode()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", systemContext="
            java.lang.StringBuilder r0 = r0.append(r1)
            android.content.Context r1 = r3.getSystemContext()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Pre="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getPre()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", MainVersionCode="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.getMainVersionCode()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", MainVersionName="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getMainVersionName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", application="
            java.lang.StringBuilder r0 = r0.append(r1)
            android.app.Application r1 = r3.getApplication()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Db="
            java.lang.StringBuilder r0 = r0.append(r1)
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r1 = r3.getDb()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", handlerThread="
            java.lang.StringBuilder r0 = r0.append(r1)
            com.usidqw.qwerklj.Tools.MyHandlerThread r1 = r3.getHandlerThread()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", handler="
            java.lang.StringBuilder r0 = r0.append(r1)
            android.os.Handler r1 = r3.getHandler()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", looper="
            java.lang.StringBuilder r0 = r0.append(r1)
            android.os.Looper r1 = r3.getLooper()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", isOpenMenu="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r3.isOpenMenu()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", timeDecrypt="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.getTimeDecrypt()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", timeDiff="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.getTimeDiff()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", deviceIdNew2="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getDeviceIdNew2()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", systemTime="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.getSystemTime()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", HookMd5="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getHookMd5()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Aweme="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r3.getAweme()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", setList="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.HashMap r1 = r3.getSetList()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", isComment="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r3.isComment()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Fun_Auto="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getFun_Auto()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Field_VerticalViewPager="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getField_VerticalViewPager()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Method_Limit_Double_Like="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getMethod_Limit_Double_Like()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Double_X="
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r3.getDouble_X()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Double_Y="
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r3.getDouble_Y()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Hook_ViewPager="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r3.getHook_ViewPager()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", KeepSpeed="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r3.getKeepSpeed()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", KeepSpeedNum="
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r3.getKeepSpeedNum()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", VideoViewHolder="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r3.getVideoViewHolder()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Method_CommentReplace="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getMethod_CommentReplace()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Param_CommentReplace_1="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getParam_CommentReplace_1()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Field_TextExtraStruct="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getField_TextExtraStruct()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Field_CommentReplace_Text="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getField_CommentReplace_Text()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", LongClick="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r3.isLongClick()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", views="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List r1 = r3.getViews()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", LongCommentField="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getLongCommentField()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", EnMicroMsg="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r3.getEnMicroMsg()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", MMActivity="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r3.getMMActivity()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", MMGetPath="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getMMGetPath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", TopLabel="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List r1 = r3.getTopLabel()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", TopLabelNames="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.HashMap r1 = r3.getTopLabelNames()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
