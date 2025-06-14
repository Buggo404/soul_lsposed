package com.usidqw.qwerklj.Json;

/* loaded from: classes.dex */
public class SoulSendMessageJson implements java.io.Serializable {
    private java.lang.Object ImMessage;
    private java.lang.Object data;
    private boolean isSend;
    private java.lang.String key;
    private int type;
    private java.lang.String userID;

    public SoulSendMessageJson() {
            r0 = this;
            r0.<init>()
            return
    }

    protected boolean canEqual(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.usidqw.qwerklj.Json.SoulSendMessageJson
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.usidqw.qwerklj.Json.SoulSendMessageJson
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.usidqw.qwerklj.Json.SoulSendMessageJson r5 = (com.usidqw.qwerklj.Json.SoulSendMessageJson) r5
            boolean r1 = r5.canEqual(r4)
            if (r1 != 0) goto L13
            return r2
        L13:
            int r1 = r4.getType()
            int r3 = r5.getType()
            if (r1 == r3) goto L1e
            return r2
        L1e:
            boolean r1 = r4.isSend()
            boolean r3 = r5.isSend()
            if (r1 == r3) goto L29
            return r2
        L29:
            java.lang.String r1 = r4.getUserID()
            java.lang.String r3 = r5.getUserID()
            if (r1 != 0) goto L36
            if (r3 == 0) goto L3d
            goto L3c
        L36:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3d
        L3c:
            return r2
        L3d:
            java.lang.Object r1 = r4.getData()
            java.lang.Object r3 = r5.getData()
            if (r1 != 0) goto L4a
            if (r3 == 0) goto L51
            goto L50
        L4a:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L51
        L50:
            return r2
        L51:
            java.lang.String r1 = r4.getKey()
            java.lang.String r3 = r5.getKey()
            if (r1 != 0) goto L5e
            if (r3 == 0) goto L65
            goto L64
        L5e:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L65
        L64:
            return r2
        L65:
            java.lang.Object r1 = r4.getImMessage()
            java.lang.Object r5 = r5.getImMessage()
            if (r1 != 0) goto L72
            if (r5 == 0) goto L79
            goto L78
        L72:
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L79
        L78:
            return r2
        L79:
            return r0
    }

    public java.lang.Object getData() {
            r1 = this;
            java.lang.Object r0 = r1.data
            return r0
    }

    public java.lang.Object getImMessage() {
            r1 = this;
            java.lang.Object r0 = r1.ImMessage
            return r0
    }

    public java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }

    public java.lang.String getUserID() {
            r1 = this;
            java.lang.String r0 = r1.userID
            return r0
    }

    public int hashCode() {
            r4 = this;
            int r0 = r4.getType()
            r1 = 59
            int r0 = r0 + r1
            int r0 = r0 * r1
            boolean r2 = r4.isSend()
            if (r2 == 0) goto L11
            r2 = 79
            goto L13
        L11:
            r2 = 97
        L13:
            int r0 = r0 + r2
            java.lang.String r2 = r4.getUserID()
            int r0 = r0 * r1
            r3 = 43
            if (r2 != 0) goto L1f
            r2 = r3
            goto L23
        L1f:
            int r2 = r2.hashCode()
        L23:
            int r0 = r0 + r2
            java.lang.Object r2 = r4.getData()
            int r0 = r0 * r1
            if (r2 != 0) goto L2d
            r2 = r3
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r0 = r0 + r2
            java.lang.String r2 = r4.getKey()
            int r0 = r0 * r1
            if (r2 != 0) goto L3b
            r2 = r3
            goto L3f
        L3b:
            int r2 = r2.hashCode()
        L3f:
            int r0 = r0 + r2
            java.lang.Object r2 = r4.getImMessage()
            int r0 = r0 * r1
            if (r2 != 0) goto L48
            goto L4c
        L48:
            int r3 = r2.hashCode()
        L4c:
            int r0 = r0 + r3
            return r0
    }

    public boolean isSend() {
            r1 = this;
            boolean r0 = r1.isSend
            return r0
    }

    public void setData(java.lang.Object r1) {
            r0 = this;
            r0.data = r1
            return
    }

    public void setImMessage(java.lang.Object r1) {
            r0 = this;
            r0.ImMessage = r1
            return
    }

    public void setKey(java.lang.String r1) {
            r0 = this;
            r0.key = r1
            return
    }

    public void setSend(boolean r1) {
            r0 = this;
            r0.isSend = r1
            return
    }

    public void setType(int r1) {
            r0 = this;
            r0.type = r1
            return
    }

    public void setUserID(java.lang.String r1) {
            r0 = this;
            r0.userID = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SoulSendMessageJson(userID="
            r0.<init>(r1)
            java.lang.String r1 = r2.getUserID()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", type="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.getType()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", data="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2.getData()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", key="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getKey()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", ImMessage="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2.getImMessage()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", isSend="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.isSend()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
