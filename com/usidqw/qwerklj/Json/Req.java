package com.usidqw.qwerklj.Json;

/* loaded from: classes.dex */
public class Req implements java.io.Serializable {
    private java.lang.String HttpApiMethod;
    private java.lang.String HttpApiMethod_Class;
    private java.lang.String RequestField;
    private java.lang.String addCall;
    private java.lang.String add_url_method;
    private java.lang.String builder_create;
    private java.lang.Object callFactory;
    private java.lang.Class<?> create;
    private java.lang.String create_method;
    private java.lang.String formBody;
    private java.lang.String formBody_build;
    private java.lang.String pathSegments;
    private java.lang.String queryRequestUrl;
    private java.lang.String queryRequestUrlField;
    private java.lang.Class<?> request;
    private java.lang.String returnDataMethod;
    private java.lang.String success_param;

    public Req() {
            r0 = this;
            r0.<init>()
            return
    }

    protected boolean canEqual(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.usidqw.qwerklj.Json.Req
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.usidqw.qwerklj.Json.Req
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.usidqw.qwerklj.Json.Req r5 = (com.usidqw.qwerklj.Json.Req) r5
            boolean r1 = r5.canEqual(r4)
            if (r1 != 0) goto L13
            return r2
        L13:
            java.lang.Object r1 = r4.getCallFactory()
            java.lang.Object r3 = r5.getCallFactory()
            if (r1 != 0) goto L20
            if (r3 == 0) goto L27
            goto L26
        L20:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L27
        L26:
            return r2
        L27:
            java.lang.Class r1 = r4.getCreate()
            java.lang.Class r3 = r5.getCreate()
            if (r1 != 0) goto L34
            if (r3 == 0) goto L3b
            goto L3a
        L34:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3b
        L3a:
            return r2
        L3b:
            java.lang.String r1 = r4.getCreate_method()
            java.lang.String r3 = r5.getCreate_method()
            if (r1 != 0) goto L48
            if (r3 == 0) goto L4f
            goto L4e
        L48:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4f
        L4e:
            return r2
        L4f:
            java.lang.String r1 = r4.getFormBody()
            java.lang.String r3 = r5.getFormBody()
            if (r1 != 0) goto L5c
            if (r3 == 0) goto L63
            goto L62
        L5c:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L63
        L62:
            return r2
        L63:
            java.lang.String r1 = r4.getAddCall()
            java.lang.String r3 = r5.getAddCall()
            if (r1 != 0) goto L70
            if (r3 == 0) goto L77
            goto L76
        L70:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L77
        L76:
            return r2
        L77:
            java.lang.String r1 = r4.getFormBody_build()
            java.lang.String r3 = r5.getFormBody_build()
            if (r1 != 0) goto L84
            if (r3 == 0) goto L8b
            goto L8a
        L84:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L8b
        L8a:
            return r2
        L8b:
            java.lang.Class r1 = r4.getRequest()
            java.lang.Class r3 = r5.getRequest()
            if (r1 != 0) goto L98
            if (r3 == 0) goto L9f
            goto L9e
        L98:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L9f
        L9e:
            return r2
        L9f:
            java.lang.String r1 = r4.getAdd_url_method()
            java.lang.String r3 = r5.getAdd_url_method()
            if (r1 != 0) goto Lac
            if (r3 == 0) goto Lb3
            goto Lb2
        Lac:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lb3
        Lb2:
            return r2
        Lb3:
            java.lang.String r1 = r4.getBuilder_create()
            java.lang.String r3 = r5.getBuilder_create()
            if (r1 != 0) goto Lc0
            if (r3 == 0) goto Lc7
            goto Lc6
        Lc0:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lc7
        Lc6:
            return r2
        Lc7:
            java.lang.String r1 = r4.getReturnDataMethod()
            java.lang.String r3 = r5.getReturnDataMethod()
            if (r1 != 0) goto Ld4
            if (r3 == 0) goto Ldb
            goto Lda
        Ld4:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Ldb
        Lda:
            return r2
        Ldb:
            java.lang.String r1 = r4.getSuccess_param()
            java.lang.String r3 = r5.getSuccess_param()
            if (r1 != 0) goto Le8
            if (r3 == 0) goto Lef
            goto Lee
        Le8:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lef
        Lee:
            return r2
        Lef:
            java.lang.String r1 = r4.getRequestField()
            java.lang.String r3 = r5.getRequestField()
            if (r1 != 0) goto Lfc
            if (r3 == 0) goto L103
            goto L102
        Lfc:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L103
        L102:
            return r2
        L103:
            java.lang.String r1 = r4.getQueryRequestUrl()
            java.lang.String r3 = r5.getQueryRequestUrl()
            if (r1 != 0) goto L110
            if (r3 == 0) goto L117
            goto L116
        L110:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L117
        L116:
            return r2
        L117:
            java.lang.String r1 = r4.getQueryRequestUrlField()
            java.lang.String r3 = r5.getQueryRequestUrlField()
            if (r1 != 0) goto L124
            if (r3 == 0) goto L12b
            goto L12a
        L124:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L12b
        L12a:
            return r2
        L12b:
            java.lang.String r1 = r4.getPathSegments()
            java.lang.String r3 = r5.getPathSegments()
            if (r1 != 0) goto L138
            if (r3 == 0) goto L13f
            goto L13e
        L138:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L13f
        L13e:
            return r2
        L13f:
            java.lang.String r1 = r4.getHttpApiMethod_Class()
            java.lang.String r3 = r5.getHttpApiMethod_Class()
            if (r1 != 0) goto L14c
            if (r3 == 0) goto L153
            goto L152
        L14c:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L153
        L152:
            return r2
        L153:
            java.lang.String r1 = r4.getHttpApiMethod()
            java.lang.String r5 = r5.getHttpApiMethod()
            if (r1 != 0) goto L160
            if (r5 == 0) goto L167
            goto L166
        L160:
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L167
        L166:
            return r2
        L167:
            return r0
    }

    public java.lang.String getAddCall() {
            r1 = this;
            java.lang.String r0 = r1.addCall
            return r0
    }

    public java.lang.String getAdd_url_method() {
            r1 = this;
            java.lang.String r0 = r1.add_url_method
            return r0
    }

    public java.lang.String getBuilder_create() {
            r1 = this;
            java.lang.String r0 = r1.builder_create
            return r0
    }

    public java.lang.Object getCallFactory() {
            r1 = this;
            java.lang.Object r0 = r1.callFactory
            return r0
    }

    public java.lang.Class<?> getCreate() {
            r1 = this;
            java.lang.Class<?> r0 = r1.create
            return r0
    }

    public java.lang.String getCreate_method() {
            r1 = this;
            java.lang.String r0 = r1.create_method
            return r0
    }

    public java.lang.String getFormBody() {
            r1 = this;
            java.lang.String r0 = r1.formBody
            return r0
    }

    public java.lang.String getFormBody_build() {
            r1 = this;
            java.lang.String r0 = r1.formBody_build
            return r0
    }

    public java.lang.String getHttpApiMethod() {
            r1 = this;
            java.lang.String r0 = r1.HttpApiMethod
            return r0
    }

    public java.lang.String getHttpApiMethod_Class() {
            r1 = this;
            java.lang.String r0 = r1.HttpApiMethod_Class
            return r0
    }

    public java.lang.String getPathSegments() {
            r1 = this;
            java.lang.String r0 = r1.pathSegments
            return r0
    }

    public java.lang.String getQueryRequestUrl() {
            r1 = this;
            java.lang.String r0 = r1.queryRequestUrl
            return r0
    }

    public java.lang.String getQueryRequestUrlField() {
            r1 = this;
            java.lang.String r0 = r1.queryRequestUrlField
            return r0
    }

    public java.lang.Class<?> getRequest() {
            r1 = this;
            java.lang.Class<?> r0 = r1.request
            return r0
    }

    public java.lang.String getRequestField() {
            r1 = this;
            java.lang.String r0 = r1.RequestField
            return r0
    }

    public java.lang.String getReturnDataMethod() {
            r1 = this;
            java.lang.String r0 = r1.returnDataMethod
            return r0
    }

    public java.lang.String getSuccess_param() {
            r1 = this;
            java.lang.String r0 = r1.success_param
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.Object r0 = r4.getCallFactory()
            r1 = 43
            if (r0 != 0) goto La
            r0 = r1
            goto Le
        La:
            int r0 = r0.hashCode()
        Le:
            r2 = 59
            int r0 = r0 + r2
            java.lang.Class r3 = r4.getCreate()
            int r0 = r0 * r2
            if (r3 != 0) goto L1a
            r3 = r1
            goto L1e
        L1a:
            int r3 = r3.hashCode()
        L1e:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getCreate_method()
            int r0 = r0 * r2
            if (r3 != 0) goto L28
            r3 = r1
            goto L2c
        L28:
            int r3 = r3.hashCode()
        L2c:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getFormBody()
            int r0 = r0 * r2
            if (r3 != 0) goto L36
            r3 = r1
            goto L3a
        L36:
            int r3 = r3.hashCode()
        L3a:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getAddCall()
            int r0 = r0 * r2
            if (r3 != 0) goto L44
            r3 = r1
            goto L48
        L44:
            int r3 = r3.hashCode()
        L48:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getFormBody_build()
            int r0 = r0 * r2
            if (r3 != 0) goto L52
            r3 = r1
            goto L56
        L52:
            int r3 = r3.hashCode()
        L56:
            int r0 = r0 + r3
            java.lang.Class r3 = r4.getRequest()
            int r0 = r0 * r2
            if (r3 != 0) goto L60
            r3 = r1
            goto L64
        L60:
            int r3 = r3.hashCode()
        L64:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getAdd_url_method()
            int r0 = r0 * r2
            if (r3 != 0) goto L6e
            r3 = r1
            goto L72
        L6e:
            int r3 = r3.hashCode()
        L72:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getBuilder_create()
            int r0 = r0 * r2
            if (r3 != 0) goto L7c
            r3 = r1
            goto L80
        L7c:
            int r3 = r3.hashCode()
        L80:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getReturnDataMethod()
            int r0 = r0 * r2
            if (r3 != 0) goto L8a
            r3 = r1
            goto L8e
        L8a:
            int r3 = r3.hashCode()
        L8e:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getSuccess_param()
            int r0 = r0 * r2
            if (r3 != 0) goto L98
            r3 = r1
            goto L9c
        L98:
            int r3 = r3.hashCode()
        L9c:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getRequestField()
            int r0 = r0 * r2
            if (r3 != 0) goto La6
            r3 = r1
            goto Laa
        La6:
            int r3 = r3.hashCode()
        Laa:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getQueryRequestUrl()
            int r0 = r0 * r2
            if (r3 != 0) goto Lb4
            r3 = r1
            goto Lb8
        Lb4:
            int r3 = r3.hashCode()
        Lb8:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getQueryRequestUrlField()
            int r0 = r0 * r2
            if (r3 != 0) goto Lc2
            r3 = r1
            goto Lc6
        Lc2:
            int r3 = r3.hashCode()
        Lc6:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getPathSegments()
            int r0 = r0 * r2
            if (r3 != 0) goto Ld0
            r3 = r1
            goto Ld4
        Ld0:
            int r3 = r3.hashCode()
        Ld4:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getHttpApiMethod_Class()
            int r0 = r0 * r2
            if (r3 != 0) goto Lde
            r3 = r1
            goto Le2
        Lde:
            int r3 = r3.hashCode()
        Le2:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getHttpApiMethod()
            int r0 = r0 * r2
            if (r3 != 0) goto Leb
            goto Lef
        Leb:
            int r1 = r3.hashCode()
        Lef:
            int r0 = r0 + r1
            return r0
    }

    public void setAddCall(java.lang.String r1) {
            r0 = this;
            r0.addCall = r1
            return
    }

    public void setAdd_url_method(java.lang.String r1) {
            r0 = this;
            r0.add_url_method = r1
            return
    }

    public void setBuilder_create(java.lang.String r1) {
            r0 = this;
            r0.builder_create = r1
            return
    }

    public void setCallFactory(java.lang.Object r1) {
            r0 = this;
            r0.callFactory = r1
            return
    }

    public void setCreate(java.lang.Class<?> r1) {
            r0 = this;
            r0.create = r1
            return
    }

    public void setCreate_method(java.lang.String r1) {
            r0 = this;
            r0.create_method = r1
            return
    }

    public void setFormBody(java.lang.String r1) {
            r0 = this;
            r0.formBody = r1
            return
    }

    public void setFormBody_build(java.lang.String r1) {
            r0 = this;
            r0.formBody_build = r1
            return
    }

    public void setHttpApiMethod(java.lang.String r1) {
            r0 = this;
            r0.HttpApiMethod = r1
            return
    }

    public void setHttpApiMethod_Class(java.lang.String r1) {
            r0 = this;
            r0.HttpApiMethod_Class = r1
            return
    }

    public void setPathSegments(java.lang.String r1) {
            r0 = this;
            r0.pathSegments = r1
            return
    }

    public void setQueryRequestUrl(java.lang.String r1) {
            r0 = this;
            r0.queryRequestUrl = r1
            return
    }

    public void setQueryRequestUrlField(java.lang.String r1) {
            r0 = this;
            r0.queryRequestUrlField = r1
            return
    }

    public void setRequest(java.lang.Class<?> r1) {
            r0 = this;
            r0.request = r1
            return
    }

    public void setRequestField(java.lang.String r1) {
            r0 = this;
            r0.RequestField = r1
            return
    }

    public void setReturnDataMethod(java.lang.String r1) {
            r0 = this;
            r0.returnDataMethod = r1
            return
    }

    public void setSuccess_param(java.lang.String r1) {
            r0 = this;
            r0.success_param = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Req(callFactory="
            r0.<init>(r1)
            java.lang.Object r1 = r2.getCallFactory()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", create="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Class r1 = r2.getCreate()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", create_method="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getCreate_method()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", formBody="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getFormBody()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", addCall="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getAddCall()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", formBody_build="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getFormBody_build()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", request="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Class r1 = r2.getRequest()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", add_url_method="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getAdd_url_method()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", builder_create="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getBuilder_create()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", returnDataMethod="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getReturnDataMethod()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", success_param="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getSuccess_param()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", RequestField="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getRequestField()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", queryRequestUrl="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getQueryRequestUrl()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", queryRequestUrlField="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getQueryRequestUrlField()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", pathSegments="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getPathSegments()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", HttpApiMethod_Class="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getHttpApiMethod_Class()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", HttpApiMethod="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getHttpApiMethod()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
