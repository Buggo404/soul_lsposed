package com.usidqw.qwerklj.Code;

/* loaded from: classes.dex */
public class Api extends com.usidqw.qwerklj.Run {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static java.lang.String ChatManagerMethod;
    private static java.lang.String getConversationListMethod;
    public static java.lang.String reqConversationListMethod;

    public interface Http {
        void body(java.lang.String r1);
    }

    public interface HttpApi {
        java.lang.Object IHttpCallback(java.lang.Object r1, java.lang.reflect.Method r2, java.lang.Object[] r3);
    }

    public interface HttpParam {
        void body(java.lang.String r1, java.lang.Object... r2);
    }

    public static class SoulRouter {
        private static java.lang.String param;
        private static android.os.Bundle paramField;
        private static java.lang.String send;
        private static java.lang.String toUri;
        private static java.lang.String toUriMethod;
        private static java.lang.String toUriParam;
        private static java.lang.Class<?> toUriTwo;
        private java.lang.Object ret;

        public SoulRouter(java.lang.String r7) {
                r6 = this;
                r6.<init>()
                r0 = 0
                com.usidqw.qwerklj.Code.Api.SoulRouter.paramField = r0
                java.lang.String r0 = "cn.soul.android.component.SoulRouter"
                java.lang.Class r1 = com.usidqw.qwerklj.Base.HookFun.findClass(r0)
                com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Soul r2 = r2.getSoul()
                java.lang.Object r2 = r2.getSoulRouter()
                r3 = 0
                if (r2 != 0) goto L34
                com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Soul r2 = r2.getSoul()
                java.lang.Class r4 = com.usidqw.qwerklj.Base.HookFun.findClass(r0)
                java.lang.Class r5 = com.usidqw.qwerklj.Base.HookFun.findClass(r0)
                java.lang.String r0 = com.usidqw.qwerklj.Tools.Fun.queryClassMethod(r5, r0)
                java.lang.Object[] r5 = new java.lang.Object[r3]
                java.lang.Object r0 = com.usidqw.qwerklj.Base.HookFun.callStaticMethod(r4, r0, r5)
                r2.setSoulRouter(r0)
            L34:
                java.lang.String r0 = com.usidqw.qwerklj.Code.Api.SoulRouter.toUri
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                java.lang.String r2 = "android.net.Uri"
                r4 = 1
                if (r0 == 0) goto L49
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r0[r3] = r2
                java.lang.String r0 = com.usidqw.qwerklj.Tools.Fun.queryClassMethodGetReturnClass(r1, r0)
                com.usidqw.qwerklj.Code.Api.SoulRouter.toUri = r0
            L49:
                java.lang.Class<?> r0 = com.usidqw.qwerklj.Code.Api.SoulRouter.toUriTwo
                if (r0 != 0) goto L59
                java.lang.String r0 = com.usidqw.qwerklj.Code.Api.SoulRouter.toUri
                java.lang.String[] r2 = new java.lang.String[]{r2}
                java.lang.Class r0 = com.usidqw.qwerklj.Tools.Fun.queryClassMethodGetReturn(r1, r0, r2)
                com.usidqw.qwerklj.Code.Api.SoulRouter.toUriTwo = r0
            L59:
                java.lang.String r0 = com.usidqw.qwerklj.Code.Api.SoulRouter.toUriMethod
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L77
                java.lang.Class<?> r0 = com.usidqw.qwerklj.Code.Api.SoulRouter.toUriTwo
                java.lang.String r0 = r0.getName()
                java.lang.String[] r2 = new java.lang.String[r4]
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                java.lang.String r5 = r5.getName()
                r2[r3] = r5
                java.lang.String r0 = com.usidqw.qwerklj.Tools.Fun.queryClassMethod(r1, r0, r2)
                com.usidqw.qwerklj.Code.Api.SoulRouter.toUriMethod = r0
            L77:
                com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Soul r0 = r0.getSoul()
                java.lang.Object r0 = r0.getSoulRouter()
                java.lang.String r1 = com.usidqw.qwerklj.Code.Api.SoulRouter.toUriMethod
                java.lang.Object[] r2 = new java.lang.Object[r4]
                r2[r3] = r7
                java.lang.Object r7 = com.usidqw.qwerklj.Base.HookFun.callMethod(r0, r1, r2)
                r6.ret = r7
                return
        }

        private void getAddParamField() {
                r2 = this;
                java.lang.String r0 = com.usidqw.qwerklj.Code.Api.SoulRouter.param
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L16
                java.lang.Object r0 = r2.ret
                java.lang.Class r0 = r0.getClass()
                java.lang.String r1 = "android.os.Bundle"
                java.lang.String r0 = com.usidqw.qwerklj.Tools.Fun.queryClassField(r0, r1)
                com.usidqw.qwerklj.Code.Api.SoulRouter.param = r0
            L16:
                android.os.Bundle r0 = com.usidqw.qwerklj.Code.Api.SoulRouter.paramField
                if (r0 != 0) goto L26
                java.lang.Object r0 = r2.ret
                java.lang.String r1 = com.usidqw.qwerklj.Code.Api.SoulRouter.param
                java.lang.Object r0 = com.usidqw.qwerklj.Base.HookFun.getObjectField(r0, r1)
                android.os.Bundle r0 = (android.os.Bundle) r0
                com.usidqw.qwerklj.Code.Api.SoulRouter.paramField = r0
            L26:
                return
        }

        public static java.lang.String getSavePath() {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = android.os.Environment.DIRECTORY_DCIM
                java.io.File r1 = android.os.Environment.getExternalStoragePublicDirectory(r1)
                java.lang.String r1 = r1.getAbsolutePath()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "/PlusNE"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.io.File r1 = new java.io.File
                r1.<init>(r0)
                boolean r2 = r1.exists()
                if (r2 != 0) goto L2b
                r1.mkdirs()
            L2b:
                return r0
        }

        public com.usidqw.qwerklj.Code.Api.SoulRouter addParam(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r1.getAddParamField()
                android.os.Bundle r0 = com.usidqw.qwerklj.Code.Api.SoulRouter.paramField
                r0.putString(r2, r3)
                return r1
        }

        public void send() {
                r2 = this;
                java.lang.String r0 = com.usidqw.qwerklj.Code.Api.SoulRouter.send
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L16
                java.lang.Object r0 = r2.ret
                java.lang.Class r0 = r0.getClass()
                java.lang.String r1 = "java.lang.Object"
                java.lang.String r0 = com.usidqw.qwerklj.Tools.Fun.queryClassMethod(r0, r1)
                com.usidqw.qwerklj.Code.Api.SoulRouter.send = r0
            L16:
                java.lang.Object r0 = r2.ret
                java.lang.String r1 = com.usidqw.qwerklj.Code.Api.SoulRouter.send
                com.usidqw.qwerklj.Base.HookFun.callMethod(r0, r1)
                return
        }
    }

    public static class okHttp {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private java.lang.Object call;
        java.lang.Object response;

        static {
                java.lang.Class<com.usidqw.qwerklj.Code.Api> r0 = com.usidqw.qwerklj.Code.Api.class
                return
        }

        public okHttp() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void lambda$send$0(com.usidqw.qwerklj.Code.Api.Http r0, java.lang.String r1) {
                r0.body(r1)
                return
        }

        static /* synthetic */ void lambda$send$1(com.usidqw.qwerklj.Code.Api.Http r0, java.lang.String r1) {
                r0.body(r1)
                return
        }

        static /* synthetic */ void lambda$send$3(com.usidqw.qwerklj.Code.Api.HttpParam r0, java.lang.String r1, java.lang.Object[] r2) {
                r0.body(r1, r2)
                return
        }

        static /* synthetic */ void lambda$send$4(com.usidqw.qwerklj.Code.Api.HttpParam r0, java.lang.String r1, java.lang.Object[] r2) {
                r0.body(r1, r2)
                return
        }

        private java.lang.String returnDataMethodBody() {
                r2 = this;
                com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Req r0 = r0.getReq()
                java.lang.String r0 = r0.getReturnDataMethod()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L1b
                com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Req r0 = r0.getReq()
                java.lang.String r0 = r0.getReturnDataMethod()
                return r0
            L1b:
                java.lang.Object r0 = r2.response
                java.lang.Class r0 = r0.getClass()
                java.lang.String r0 = com.usidqw.qwerklj.Tools.Fun.queryClassMethodNotReturnNull(r0)
                com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Req r1 = r1.getReq()
                r1.setReturnDataMethod(r0)
                return r0
        }

        public com.usidqw.qwerklj.Code.Api.okHttp createData(java.lang.String r3) {
                r2 = this;
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.lang.String r1 = "GET"
                com.usidqw.qwerklj.Code.Api$okHttp r3 = r2.createData(r3, r0, r1)
                return r3
        }

        public com.usidqw.qwerklj.Code.Api.okHttp createData(java.lang.String r9, java.util.HashMap<java.lang.String, java.lang.Object> r10, java.lang.String r11) {
                r8 = this;
                if (r10 != 0) goto L7
                java.util.HashMap r10 = new java.util.HashMap
                r10.<init>()
            L7:
                com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Req r0 = r0.getReq()
                java.lang.Class r0 = r0.getRequest()
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.Object r0 = com.usidqw.qwerklj.Base.HookFun.newInstance(r0, r2)
                com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Req r2 = r2.getReq()
                java.lang.String r2 = r2.getAdd_url_method()
                r3 = 1
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r4[r1] = r9
                java.lang.Object r9 = com.usidqw.qwerklj.Base.HookFun.callMethod(r0, r2, r4)
                java.lang.String r0 = "retrofit2.converter.gson.GsonRequestBodyConverter"
                java.lang.Class r0 = com.usidqw.qwerklj.Base.HookFun.findClass(r0)
                java.lang.String r2 = "MEDIA_TYPE"
                java.lang.Object r0 = com.usidqw.qwerklj.Base.HookFun.getStaticObjectField(r0, r2)
                java.lang.String r2 = "JSON"
                boolean r4 = r11.equals(r2)
                java.lang.String r5 = "POST"
                if (r4 == 0) goto L43
                r4 = r5
                goto L44
            L43:
                r4 = r11
            L44:
                boolean r5 = r4.equals(r5)
                r6 = 2
                if (r5 != 0) goto L73
                java.lang.String r5 = "PUT"
                boolean r5 = r4.equals(r5)
                if (r5 == 0) goto L54
                goto L73
            L54:
                java.lang.String r10 = "GET"
                boolean r11 = r4.equals(r10)
                if (r11 == 0) goto L113
                com.usidqw.qwerklj.Tools.JsonMain r11 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Req r11 = r11.getReq()
                java.lang.String r11 = r11.getCreate_method()
                java.lang.Object[] r0 = new java.lang.Object[r6]
                r0[r1] = r10
                r10 = 0
                r0[r3] = r10
                java.lang.Object r9 = com.usidqw.qwerklj.Base.HookFun.callMethod(r9, r11, r0)
                goto L113
            L73:
                boolean r11 = r11.equals(r2)
                if (r11 == 0) goto Lad
                com.usidqw.qwerklj.Tools.JsonMain r11 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Req r11 = r11.getReq()
                java.lang.Class r11 = r11.getCreate()
                java.lang.Object[] r2 = new java.lang.Object[r6]
                r2[r1] = r0
                com.google.gson.Gson r0 = new com.google.gson.Gson
                r0.<init>()
                java.lang.String r10 = r0.toJson(r10)
                r2[r3] = r10
                java.lang.String r10 = "create"
                java.lang.Object r10 = com.usidqw.qwerklj.Base.HookFun.callStaticMethod(r11, r10, r2)
                com.usidqw.qwerklj.Tools.JsonMain r11 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Req r11 = r11.getReq()
                java.lang.String r11 = r11.getCreate_method()
                java.lang.Object[] r0 = new java.lang.Object[r6]
                r0[r1] = r4
                r0[r3] = r10
                java.lang.Object r9 = com.usidqw.qwerklj.Base.HookFun.callMethod(r9, r11, r0)
                goto L113
            Lad:
                com.usidqw.qwerklj.Tools.JsonMain r11 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Req r11 = r11.getReq()
                java.lang.String r11 = r11.getFormBody()
                java.lang.Class r11 = com.usidqw.qwerklj.Base.HookFun.findClass(r11)
                java.lang.Object[] r0 = new java.lang.Object[r1]
                java.lang.Object r11 = com.usidqw.qwerklj.Base.HookFun.newInstance(r11, r0)
                java.util.Set r10 = r10.entrySet()
                java.util.Iterator r10 = r10.iterator()
            Lc9:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto Lf1
                java.lang.Object r0 = r10.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Req r2 = r2.getReq()
                java.lang.String r2 = r2.getAddCall()
                java.lang.Object[] r5 = new java.lang.Object[r6]
                java.lang.Object r7 = r0.getKey()
                r5[r1] = r7
                java.lang.Object r0 = r0.getValue()
                r5[r3] = r0
                com.usidqw.qwerklj.Base.HookFun.callMethod(r11, r2, r5)
                goto Lc9
            Lf1:
                com.usidqw.qwerklj.Tools.JsonMain r10 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Req r10 = r10.getReq()
                java.lang.String r10 = r10.getFormBody_build()
                java.lang.Object r10 = com.usidqw.qwerklj.Base.HookFun.callMethod(r11, r10)
                com.usidqw.qwerklj.Tools.JsonMain r11 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Req r11 = r11.getReq()
                java.lang.String r11 = r11.getCreate_method()
                java.lang.Object[] r0 = new java.lang.Object[r6]
                r0[r1] = r4
                r0[r3] = r10
                java.lang.Object r9 = com.usidqw.qwerklj.Base.HookFun.callMethod(r9, r11, r0)
            L113:
                com.usidqw.qwerklj.Tools.JsonMain r10 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Req r10 = r10.getReq()
                java.lang.Object r10 = r10.getCallFactory()
                java.lang.Object[] r11 = new java.lang.Object[r3]
                com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App
                com.usidqw.qwerklj.Json.Req r0 = r0.getReq()
                java.lang.String r0 = r0.getBuilder_create()
                java.lang.Object r9 = com.usidqw.qwerklj.Base.HookFun.callMethod(r9, r0)
                r11[r1] = r9
                java.lang.String r9 = "newCall"
                java.lang.Object r9 = com.usidqw.qwerklj.Base.HookFun.callMethod(r10, r9, r11)
                r8.call = r9
                return r8
        }

        /* renamed from: lambda$send$2$com-usidqw-qwerklj-Code-Api$okHttp, reason: not valid java name */
        /* synthetic */ void m136lambda$send$2$comusidqwqwerkljCodeApi$okHttp(com.usidqw.qwerklj.Code.Api.Http r4) {
                r3 = this;
                java.lang.Object r0 = r3.call
                java.lang.String r1 = "execute"
                java.lang.Object r0 = com.usidqw.qwerklj.Base.HookFun.callMethod(r0, r1)
                r3.response = r0
                java.lang.String r1 = r3.returnDataMethodBody()
                java.lang.Object r0 = com.usidqw.qwerklj.Base.HookFun.callMethod(r0, r1)
                java.lang.String r1 = "string"
                java.lang.Object r0 = com.usidqw.qwerklj.Base.HookFun.callMethod(r0, r1)
                java.lang.String r0 = (java.lang.String) r0
                com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Tools.Static.App
                android.app.Activity r1 = r1.getActivity()
                if (r1 != 0) goto L31
                com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Tools.Static.App
                android.os.Handler r1 = r1.getMainHandler()
                com.usidqw.qwerklj.Code.Api$okHttp$$ExternalSyntheticLambda4 r2 = new com.usidqw.qwerklj.Code.Api$okHttp$$ExternalSyntheticLambda4
                r2.<init>(r4, r0)
                r1.post(r2)
                goto L3f
            L31:
                com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Tools.Static.App
                android.app.Activity r1 = r1.getActivity()
                com.usidqw.qwerklj.Code.Api$okHttp$$ExternalSyntheticLambda5 r2 = new com.usidqw.qwerklj.Code.Api$okHttp$$ExternalSyntheticLambda5
                r2.<init>(r4, r0)
                r1.runOnUiThread(r2)
            L3f:
                return
        }

        /* renamed from: lambda$send$5$com-usidqw-qwerklj-Code-Api$okHttp, reason: not valid java name */
        /* synthetic */ void m137lambda$send$5$comusidqwqwerkljCodeApi$okHttp(com.usidqw.qwerklj.Code.Api.HttpParam r4, java.lang.Object[] r5) {
                r3 = this;
                java.lang.Object r0 = r3.call
                java.lang.String r1 = "execute"
                java.lang.Object r0 = com.usidqw.qwerklj.Base.HookFun.callMethod(r0, r1)
                r3.response = r0
                java.lang.String r1 = r3.returnDataMethodBody()
                java.lang.Object r0 = com.usidqw.qwerklj.Base.HookFun.callMethod(r0, r1)
                java.lang.String r1 = "string"
                java.lang.Object r0 = com.usidqw.qwerklj.Base.HookFun.callMethod(r0, r1)
                java.lang.String r0 = (java.lang.String) r0
                com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Tools.Static.App
                android.app.Activity r1 = r1.getActivity()
                if (r1 != 0) goto L31
                com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Tools.Static.App
                android.os.Handler r1 = r1.getMainHandler()
                com.usidqw.qwerklj.Code.Api$okHttp$$ExternalSyntheticLambda2 r2 = new com.usidqw.qwerklj.Code.Api$okHttp$$ExternalSyntheticLambda2
                r2.<init>(r4, r0, r5)
                r1.post(r2)
                goto L3f
            L31:
                com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Tools.Static.App
                android.app.Activity r1 = r1.getActivity()
                com.usidqw.qwerklj.Code.Api$okHttp$$ExternalSyntheticLambda3 r2 = new com.usidqw.qwerklj.Code.Api$okHttp$$ExternalSyntheticLambda3
                r2.<init>(r4, r0, r5)
                r1.runOnUiThread(r2)
            L3f:
                return
        }

        /* renamed from: lambda$send$6$com-usidqw-qwerklj-Code-Api$okHttp, reason: not valid java name */
        /* synthetic */ void m138lambda$send$6$comusidqwqwerkljCodeApi$okHttp() {
                r2 = this;
                java.lang.Object r0 = r2.call
                java.lang.String r1 = "execute"
                java.lang.Object r0 = com.usidqw.qwerklj.Base.HookFun.callMethod(r0, r1)
                r2.response = r0
                java.lang.String r1 = r2.returnDataMethodBody()
                com.usidqw.qwerklj.Base.HookFun.callMethod(r0, r1)
                return
        }

        public void send() {
                r2 = this;
                java.lang.Thread r0 = new java.lang.Thread
                com.usidqw.qwerklj.Code.Api$okHttp$$ExternalSyntheticLambda1 r1 = new com.usidqw.qwerklj.Code.Api$okHttp$$ExternalSyntheticLambda1
                r1.<init>(r2)
                r0.<init>(r1)
                r0.start()
                return
        }

        public void send(com.usidqw.qwerklj.Code.Api.Http r3) {
                r2 = this;
                java.lang.Object r0 = r2.call
                if (r0 == 0) goto L11
                java.lang.Thread r0 = new java.lang.Thread
                com.usidqw.qwerklj.Code.Api$okHttp$$ExternalSyntheticLambda6 r1 = new com.usidqw.qwerklj.Code.Api$okHttp$$ExternalSyntheticLambda6
                r1.<init>(r2, r3)
                r0.<init>(r1)
                r0.start()
            L11:
                return
        }

        public void send(com.usidqw.qwerklj.Code.Api.HttpParam r3, java.lang.Object... r4) {
                r2 = this;
                java.lang.Object r0 = r2.call
                if (r0 == 0) goto L11
                java.lang.Thread r0 = new java.lang.Thread
                com.usidqw.qwerklj.Code.Api$okHttp$$ExternalSyntheticLambda0 r1 = new com.usidqw.qwerklj.Code.Api$okHttp$$ExternalSyntheticLambda0
                r1.<init>(r2, r3, r4)
                r0.<init>(r1)
                r0.start()
            L11:
                return
        }

        public java.lang.String sendSync() {
                r2 = this;
                java.lang.Object r0 = r2.call
                java.lang.String r1 = "execute"
                java.lang.Object r0 = com.usidqw.qwerklj.Base.HookFun.callMethod(r0, r1)
                r2.response = r0
                java.lang.String r1 = r2.returnDataMethodBody()
                java.lang.Object r0 = com.usidqw.qwerklj.Base.HookFun.callMethod(r0, r1)
                java.lang.String r1 = "string"
                java.lang.Object r0 = com.usidqw.qwerklj.Base.HookFun.callMethod(r0, r1)
                java.lang.String r0 = (java.lang.String) r0
                return r0
        }
    }

    static {
            return
    }

    public Api() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void HttpApi(java.lang.String r10, java.lang.String r11, java.lang.String r12, com.usidqw.qwerklj.Code.Api.HttpApi r13, java.lang.Object... r14) {
            java.lang.String r0 = "cn.soulapp.android.lib.common.api.ApiConstants"
            java.lang.Class r0 = findClass(r0)
            java.lang.String r1 = "USER"
            java.lang.Object r1 = getStaticObjectField(r0, r1)
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Code.Api.App
            com.usidqw.qwerklj.Json.Req r2 = r2.getReq()
            java.lang.String r2 = r2.getHttpApiMethod_Class()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L2f
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Code.Api.App
            com.usidqw.qwerklj.Json.Req r2 = r2.getReq()
            java.lang.String r2 = r2.getHttpApiMethod()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto La4
        L2f:
            if (r1 == 0) goto La4
            java.lang.Class r1 = r1.getClass()
            java.lang.reflect.Method[] r1 = r1.getMethods()
            int r2 = r1.length
            r6 = r4
        L3b:
            if (r6 >= r2) goto La4
            r7 = r1[r6]
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r8 = r8.length
            if (r8 != r5) goto L7d
            java.lang.Class[] r8 = r7.getParameterTypes()
            r8 = r8[r4]
            java.lang.String r8 = r8.getName()
            java.lang.Class<java.lang.Class> r9 = java.lang.Class.class
            java.lang.String r9 = r9.getName()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L7d
            java.lang.Class r8 = r7.getReturnType()
            java.lang.String r8 = r8.getName()
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            java.lang.String r9 = r9.getName()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L7d
            com.usidqw.qwerklj.Tools.JsonMain r8 = com.usidqw.qwerklj.Code.Api.App
            com.usidqw.qwerklj.Json.Req r8 = r8.getReq()
            java.lang.String r9 = r7.getName()
            r8.setHttpApiMethod_Class(r9)
        L7d:
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r8 = r8.length
            if (r8 != r3) goto La1
            java.lang.Class r8 = r7.getReturnType()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "com.walid.rxretrofit.HttpSubscriber"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto La1
            com.usidqw.qwerklj.Tools.JsonMain r8 = com.usidqw.qwerklj.Code.Api.App
            com.usidqw.qwerklj.Json.Req r8 = r8.getReq()
            java.lang.String r7 = r7.getName()
            r8.setHttpApiMethod(r7)
        La1:
            int r6 = r6 + 1
            goto L3b
        La4:
            com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Code.Api.App
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Class[] r2 = new java.lang.Class[r5]
            java.lang.String r6 = "com.walid.rxretrofit.interfaces.IHttpCallback"
            java.lang.Class r6 = findClass(r6)
            r2[r4] = r6
            java.util.Objects.requireNonNull(r13)
            com.usidqw.qwerklj.Code.Api$$ExternalSyntheticLambda0 r6 = new com.usidqw.qwerklj.Code.Api$$ExternalSyntheticLambda0
            r6.<init>(r13)
            java.lang.Object r13 = java.lang.reflect.Proxy.newProxyInstance(r1, r2, r6)
            java.lang.Object r11 = getStaticObjectField(r0, r11)
            java.lang.Class r10 = findClass(r10)
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Code.Api.App
            com.usidqw.qwerklj.Json.Req r0 = r0.getReq()
            java.lang.String r0 = r0.getHttpApiMethod_Class()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r10
            java.lang.Object r10 = callMethod(r11, r0, r1)
            java.lang.Object r10 = callMethod(r10, r12, r14)
            com.usidqw.qwerklj.Tools.JsonMain r12 = com.usidqw.qwerklj.Code.Api.App
            com.usidqw.qwerklj.Json.Req r12 = r12.getReq()
            java.lang.String r12 = r12.getHttpApiMethod()
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r4] = r10
            r14[r5] = r13
            callMethod(r11, r12, r14)
            return
    }

    public static void ImgMessage(java.lang.String r7, java.lang.String r8) {
            java.lang.String r0 = "[img]"
            java.lang.String r1 = "[/img]"
            java.lang.String r0 = com.usidqw.qwerklj.Utils.Tools.chazhao(r8, r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L9e
            java.lang.String r8 = r0.toLowerCase()
            java.lang.String r1 = "http"
            boolean r8 = r8.startsWith(r1)
            if (r8 != 0) goto L87
            java.lang.String r8 = r0.toLowerCase()
            java.lang.String r1 = "https"
            boolean r8 = r8.startsWith(r1)
            if (r8 != 0) goto L87
            java.io.File r8 = new java.io.File
            r8.<init>(r0)
            boolean r1 = r8.exists()
            if (r1 == 0) goto L9d
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            android.graphics.BitmapFactory.decodeFile(r0, r1)
            int r0 = r1.outHeight
            int r0 = r1.outWidth
            java.lang.String r0 = "cn.soulapp.android.client.component.middle.platform.utils.QiNiuHelper"
            java.lang.Class r0 = findClass(r0)
            java.lang.String r1 = "boolean"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "cn.soulapp.android.client.component.middle.platform.utils.QiNiuHelper$NetCallback"
            java.lang.String[] r1 = new java.lang.String[]{r4, r4, r1, r5}
            java.lang.String r4 = "void"
            java.lang.String r1 = queryClassMethod(r0, r4, r1)
            com.usidqw.qwerklj.Tools.JsonMain r4 = com.usidqw.qwerklj.Code.Api.App
            java.lang.ClassLoader r4 = r4.getClassLoader()
            java.lang.Class[] r6 = new java.lang.Class[r2]
            java.lang.Class r5 = findClass(r5)
            r6[r3] = r5
            com.usidqw.qwerklj.Code.Api$$ExternalSyntheticLambda1 r5 = new com.usidqw.qwerklj.Code.Api$$ExternalSyntheticLambda1
            r5.<init>(r7)
            java.lang.Object r7 = java.lang.reflect.Proxy.newProxyInstance(r4, r6, r5)
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r8 = r8.getPath()
            r4[r3] = r8
            java.lang.String r8 = ""
            r4[r2] = r8
            r8 = 2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r4[r8] = r2
            r8 = 3
            r4[r8] = r7
            callStaticMethod(r0, r1, r4)
            goto L9d
        L87:
            java.lang.String r8 = "cn.soulapp.imlib.msg.chat.ExpressionMsg"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Object r8 = newInstance(r8, r1)
            java.lang.String r1 = "imageUrl"
            setStringField(r8, r1, r0)
            r0 = 8
            java.lang.Object r7 = getMessage(r7, r0, r8)
            sendMessage(r7)
        L9d:
            return
        L9e:
            java.lang.String r0 = "cn.soulapp.imlib.msg.chat.TextMsg"
            java.lang.Class r0 = findClass(r0)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r8
            java.lang.Object r8 = newInstance(r0, r1)
            java.lang.Object r7 = getMessage(r7, r2, r8)
            sendMessage(r7)
            return
    }

    public static java.lang.String decryption(java.lang.String r3) {
            java.lang.String r0 = "cn.soulapp.android.lib.common.utils.encrypt.UserIdDESUtils"
            java.lang.Class r0 = findClass(r0)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Code.Api.App
            com.usidqw.qwerklj.Json.Soul r3 = r3.getSoul()
            java.lang.String r3 = r3.getUserIdDESUtilsPass()
            r2 = 1
            r1[r2] = r3
            java.lang.String r3 = "decryption"
            java.lang.Object r3 = callStaticMethod(r0, r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    public static java.lang.String encryption(java.lang.String r3) {
            java.lang.String r0 = "cn.soulapp.android.lib.common.utils.encrypt.UserIdDESUtils"
            java.lang.Class r0 = findClass(r0)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Code.Api.App
            com.usidqw.qwerklj.Json.Soul r3 = r3.getSoul()
            java.lang.String r3 = r3.getUserIdDESUtilsPass()
            r2 = 1
            r1[r2] = r3
            java.lang.String r3 = "encryption"
            java.lang.Object r3 = callStaticMethod(r0, r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    public static java.lang.Object getChatManager() {
            java.lang.String r0 = "cn.soulapp.imlib.ChatManager"
            java.lang.Class r0 = findClass(r0)
            java.lang.String r1 = com.usidqw.qwerklj.Code.Api.ChatManagerMethod
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r1 == 0) goto L3e
            if (r0 == 0) goto L3e
            java.lang.reflect.Method[] r1 = r0.getMethods()
            int r3 = r1.length
            r4 = r2
        L17:
            if (r4 >= r3) goto L3e
            r5 = r1[r4]
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r6 = r6.length
            if (r6 != 0) goto L3b
            java.lang.Class r6 = r5.getReturnType()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = r0.getName()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L3b
            java.lang.String r1 = r5.getName()
            com.usidqw.qwerklj.Code.Api.ChatManagerMethod = r1
            goto L3e
        L3b:
            int r4 = r4 + 1
            goto L17
        L3e:
            java.lang.String r1 = com.usidqw.qwerklj.Code.Api.ChatManagerMethod
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = callStaticMethod(r0, r1, r2)
            return r0
    }

    public static java.util.List getConversationList() {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Code.Api.App
            com.usidqw.qwerklj.Json.Soul r0 = r0.getSoul()
            java.util.List r0 = r0.getChatLists()
            if (r0 == 0) goto L27
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Code.Api.App
            com.usidqw.qwerklj.Json.Soul r0 = r0.getSoul()
            java.util.List r0 = r0.getChatLists()
            int r0 = r0.size()
            if (r0 <= 0) goto L27
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Code.Api.App
            com.usidqw.qwerklj.Json.Soul r0 = r0.getSoul()
            java.util.List r0 = r0.getChatLists()
            return r0
        L27:
            java.lang.Object r0 = getChatManager()
            java.lang.String r1 = com.usidqw.qwerklj.Code.Api.getConversationListMethod
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L62
            java.lang.Class r1 = r0.getClass()
            java.lang.reflect.Method[] r1 = r1.getMethods()
            int r2 = r1.length
            r3 = 0
        L3d:
            if (r3 >= r2) goto L62
            r4 = r1[r3]
            java.lang.Class r5 = r4.getReturnType()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "java.util.List"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L5f
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r5 = r5.length
            if (r5 != 0) goto L5f
            java.lang.String r1 = r4.getName()
            com.usidqw.qwerklj.Code.Api.getConversationListMethod = r1
            goto L62
        L5f:
            int r3 = r3 + 1
            goto L3d
        L62:
            java.lang.String r1 = com.usidqw.qwerklj.Code.Api.getConversationListMethod
            java.lang.Object r0 = callMethod(r0, r1)
            if (r0 != 0) goto L6c
            r0 = 0
            return r0
        L6c:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public static java.lang.Object getMessage(java.lang.String r11, int r12, java.lang.Object r13) {
            java.lang.String r0 = "cn.soulapp.imlib.msg.chat.ChatMessage"
            java.lang.Class r0 = findClass(r0)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Object r0 = newInstance(r0, r2)
            java.lang.String r2 = getMyUserId()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L91
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.StringBuilder r3 = r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "sessionId"
            setStringField(r0, r4, r3)
            java.lang.String r3 = "msgType"
            setIntField(r0, r3, r12)
            java.lang.String r12 = "maps"
            java.lang.Object r4 = getObjectField(r0, r12)
            java.lang.String r5 = "extMap"
            getObjectField(r0, r5)
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = "MSGCONTENT"
            r6[r1] = r7
            r7 = 1
            r6[r7] = r13
            java.lang.String r13 = "put"
            callMethod(r4, r13, r6)
            java.lang.String r4 = getMsgId()
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "cn.soulapp.imlib.msg.ImMessage"
            java.lang.Class r6 = findClass(r6)
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.Object r6 = newInstance(r6, r10)
            java.lang.String r10 = "msgStatus"
            setIntField(r6, r10, r7)
            java.lang.String r10 = "localTime"
            setLongField(r6, r10, r8)
            java.lang.String r10 = "serverTime"
            setLongField(r6, r10, r8)
            java.lang.String r8 = "from"
            setStringField(r6, r8, r2)
            java.lang.Object r12 = getObjectField(r6, r12)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r5 = "MSGOBJECT"
            r2[r1] = r5
            r2[r7] = r0
            callMethod(r12, r13, r2)
            java.lang.String r12 = "to"
            setStringField(r6, r12, r11)
            setIntField(r6, r3, r7)
            java.lang.String r11 = "msgId"
            setStringField(r6, r11, r4)
            return r6
        L91:
            r11 = 0
            return r11
    }

    public static java.lang.String getMsgId() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "%013d"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            double r2 = java.lang.Math.random()
            r5 = 4681608360884174848(0x40f86a0000000000, double:100000.0)
            double r2 = r2 * r5
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r4] = r2
            java.lang.String r2 = "%05d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.Object getMyInfo() {
            java.lang.String r0 = "cn.soulapp.android.client.component.middle.platform.model.api.user.db.AccountDbManagerMMKV"
            java.lang.Class r0 = findClass(r0)
            com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Code.Api.App
            com.usidqw.qwerklj.Json.Soul r1 = r1.getSoul()
            java.lang.String r1 = r1.getQueryUserInfoMethod()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = callStaticMethod(r0, r1, r2)
            return r0
    }

    public static java.lang.String getMyUserId() {
            java.lang.Object r0 = getMyInfo()
            java.lang.String r1 = "userIdEcpt"
            java.lang.String r0 = getStringField(r0, r1)
            java.lang.String r0 = decryption(r0)
            return r0
    }

    public static java.lang.String getUserId(java.lang.String r0) {
            java.lang.String r0 = decryption(r0)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$ImgMessage$0(java.lang.String r0, java.lang.Object r1, java.lang.reflect.Method r2, java.lang.Object[] r3) throws java.lang.Throwable {
            r1 = 2
            r1 = r3[r1]
            java.lang.String r2 = "上传成功"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L27
            r1 = 1
            r1 = r3[r1]
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "cn.soulapp.imlib.msg.chat.ExpressionMsg"
            java.lang.Object r2 = newInstance(r3, r2)
            java.lang.String r3 = "imageUrl"
            setStringField(r2, r3, r1)
            r1 = 8
            java.lang.Object r0 = getMessage(r0, r1, r2)
            sendMessage(r0)
        L27:
            r0 = 0
            return r0
    }

    public static void send(java.lang.String r4) {
            java.lang.String r0 = "content"
            java.util.List r0 = get(r0)
            if (r0 == 0) goto L34
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            com.usidqw.qwerklj.Json.DialogListEdit r1 = (com.usidqw.qwerklj.Json.DialogListEdit) r1
            com.usidqw.qwerklj.Json.SoulSendMessageJson r2 = new com.usidqw.qwerklj.Json.SoulSendMessageJson
            r2.<init>()
            java.lang.String r3 = "1"
            r2.setKey(r3)
            java.lang.String r1 = r1.getKey()
            r2.setUserID(r4)
            r3 = 1
            r2.setType(r3)
            r2.setData(r1)
            postMessage(r2)
            goto Lc
        L34:
            return
    }

    public static void sendMessage(java.lang.Object r10) {
            java.lang.String r0 = "cn.soulapp.android.chat.utils.ServerMessageSender"
            java.lang.Class r0 = findClass(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r0 = "当前版本混淆无法自动适配,联系作者适配"
            r10[r2] = r0
            msg(r10)
            return
        L14:
            java.lang.reflect.Method[] r3 = r0.getDeclaredMethods()
            int r4 = r3.length
            r5 = r2
        L1a:
            if (r5 >= r4) goto L4d
            r6 = r3[r5]
            java.lang.Class r7 = r6.getReturnType()
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "void"
            boolean r7 = r7.equals(r8)
            int r8 = r6.getModifiers()
            r8 = r8 & 8
            if (r8 == 0) goto L36
            r8 = r1
            goto L37
        L36:
            r8 = r2
        L37:
            int r9 = r6.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isPublic(r9)
            if (r7 == 0) goto L4a
            if (r8 == 0) goto L4a
            if (r9 == 0) goto L4a
            java.lang.String r3 = r6.getName()
            goto L4e
        L4a:
            int r5 = r5 + 1
            goto L1a
        L4d:
            r3 = 0
        L4e:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto La0
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r2] = r10
            callStaticMethod(r0, r3, r4)
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Code.Api.App
            com.usidqw.qwerklj.Json.Soul r0 = r0.getSoul()
            java.lang.Object r0 = r0.getBaseConversationFragment()
            if (r0 == 0) goto La9
            java.lang.String r0 = "to"
            java.lang.String r0 = getStringField(r10, r0)
            com.usidqw.qwerklj.Tools.JsonMain r3 = com.usidqw.qwerklj.Code.Api.App
            com.usidqw.qwerklj.Json.Soul r3 = r3.getSoul()
            java.lang.String r3 = r3.getToChatUserId()
            boolean r0 = java.util.Objects.equals(r0, r3)
            if (r0 == 0) goto La9
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Code.Api.App
            com.usidqw.qwerklj.Json.Soul r0 = r0.getSoul()
            java.lang.Object r0 = r0.getBaseConversationFragment()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r10
            java.lang.String r10 = "insertSingleMsg"
            callMethod(r0, r10, r1)
            com.usidqw.qwerklj.Tools.JsonMain r10 = com.usidqw.qwerklj.Code.Api.App
            com.usidqw.qwerklj.Json.Soul r10 = r10.getSoul()
            java.lang.Object r10 = r10.getBaseConversationFragment()
            java.lang.String r0 = "onRefreshUi"
            callMethod(r10, r0)
            goto La9
        La0:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r0 = "版本不支持"
            r10[r2] = r0
            msg(r10)
        La9:
            return
    }

    @Override // com.usidqw.qwerklj.Base.Base
    public void onENHook() throws java.lang.NoSuchFieldException {
            r0 = this;
            return
    }
}
