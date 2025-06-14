package com.usidqw.qwerklj.Json;

/* loaded from: classes.dex */
public class JsonSuccess implements java.io.Serializable {
    private int code;
    private java.lang.String message;
    private boolean success;

    public JsonSuccess() {
            r0 = this;
            r0.<init>()
            return
    }

    protected boolean canEqual(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.usidqw.qwerklj.Json.JsonSuccess
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.usidqw.qwerklj.Json.JsonSuccess
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.usidqw.qwerklj.Json.JsonSuccess r5 = (com.usidqw.qwerklj.Json.JsonSuccess) r5
            boolean r1 = r5.canEqual(r4)
            if (r1 != 0) goto L13
            return r2
        L13:
            int r1 = r4.getCode()
            int r3 = r5.getCode()
            if (r1 == r3) goto L1e
            return r2
        L1e:
            boolean r1 = r4.isSuccess()
            boolean r3 = r5.isSuccess()
            if (r1 == r3) goto L29
            return r2
        L29:
            java.lang.String r1 = r4.getMessage()
            java.lang.String r5 = r5.getMessage()
            if (r1 != 0) goto L36
            if (r5 == 0) goto L3d
            goto L3c
        L36:
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L3d
        L3c:
            return r2
        L3d:
            return r0
    }

    public int getCode() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.getCode()
            r1 = 59
            int r0 = r0 + r1
            int r0 = r0 * r1
            boolean r2 = r3.isSuccess()
            if (r2 == 0) goto L11
            r2 = 79
            goto L13
        L11:
            r2 = 97
        L13:
            int r0 = r0 + r2
            java.lang.String r2 = r3.getMessage()
            int r0 = r0 * r1
            if (r2 != 0) goto L1e
            r1 = 43
            goto L22
        L1e:
            int r1 = r2.hashCode()
        L22:
            int r0 = r0 + r1
            return r0
    }

    public boolean isSuccess() {
            r1 = this;
            boolean r0 = r1.success
            return r0
    }

    public void setCode(int r1) {
            r0 = this;
            r0.code = r1
            return
    }

    public void setMessage(java.lang.String r1) {
            r0 = this;
            r0.message = r1
            return
    }

    public void setSuccess(boolean r1) {
            r0 = this;
            r0.success = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "JsonSuccess(code="
            r0.<init>(r1)
            int r1 = r2.getCode()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", message="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getMessage()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", success="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.isSuccess()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
