package com.usidqw.qwerklj.Json;

/* loaded from: classes.dex */
public class Soul implements java.io.Serializable {
    private java.lang.Object BaseConversationFragment;
    private java.util.List<java.lang.Object> ChatLists;
    private java.lang.String PushMsgMethod;
    private java.lang.Class<?> SelectConversationActivityGet;
    private java.lang.Object SoulRouter;
    private java.lang.String ToChatUserId;
    private java.lang.String UserIdDESUtilsPass;
    private java.lang.String queryUserInfoMethod;
    private java.lang.String sendCmdMessageMethod;

    public Soul() {
            r0 = this;
            r0.<init>()
            return
    }

    protected boolean canEqual(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.usidqw.qwerklj.Json.Soul
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.usidqw.qwerklj.Json.Soul
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.usidqw.qwerklj.Json.Soul r5 = (com.usidqw.qwerklj.Json.Soul) r5
            boolean r1 = r5.canEqual(r4)
            if (r1 != 0) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.getUserIdDESUtilsPass()
            java.lang.String r3 = r5.getUserIdDESUtilsPass()
            if (r1 != 0) goto L20
            if (r3 == 0) goto L27
            goto L26
        L20:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L27
        L26:
            return r2
        L27:
            java.util.List r1 = r4.getChatLists()
            java.util.List r3 = r5.getChatLists()
            if (r1 != 0) goto L34
            if (r3 == 0) goto L3b
            goto L3a
        L34:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3b
        L3a:
            return r2
        L3b:
            java.lang.String r1 = r4.getQueryUserInfoMethod()
            java.lang.String r3 = r5.getQueryUserInfoMethod()
            if (r1 != 0) goto L48
            if (r3 == 0) goto L4f
            goto L4e
        L48:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4f
        L4e:
            return r2
        L4f:
            java.lang.Object r1 = r4.getBaseConversationFragment()
            java.lang.Object r3 = r5.getBaseConversationFragment()
            if (r1 != 0) goto L5c
            if (r3 == 0) goto L63
            goto L62
        L5c:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Class r1 = r4.getSelectConversationActivityGet()
            java.lang.Class r3 = r5.getSelectConversationActivityGet()
            if (r1 != 0) goto L70
            if (r3 == 0) goto L77
            goto L76
        L70:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L77
        L76:
            return r2
        L77:
            java.lang.String r1 = r4.getToChatUserId()
            java.lang.String r3 = r5.getToChatUserId()
            if (r1 != 0) goto L84
            if (r3 == 0) goto L8b
            goto L8a
        L84:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L8b
        L8a:
            return r2
        L8b:
            java.lang.String r1 = r4.getSendCmdMessageMethod()
            java.lang.String r3 = r5.getSendCmdMessageMethod()
            if (r1 != 0) goto L98
            if (r3 == 0) goto L9f
            goto L9e
        L98:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L9f
        L9e:
            return r2
        L9f:
            java.lang.String r1 = r4.getPushMsgMethod()
            java.lang.String r3 = r5.getPushMsgMethod()
            if (r1 != 0) goto Lac
            if (r3 == 0) goto Lb3
            goto Lb2
        Lac:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lb3
        Lb2:
            return r2
        Lb3:
            java.lang.Object r1 = r4.getSoulRouter()
            java.lang.Object r5 = r5.getSoulRouter()
            if (r1 != 0) goto Lc0
            if (r5 == 0) goto Lc7
            goto Lc6
        Lc0:
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto Lc7
        Lc6:
            return r2
        Lc7:
            return r0
    }

    public java.lang.Object getBaseConversationFragment() {
            r1 = this;
            java.lang.Object r0 = r1.BaseConversationFragment
            return r0
    }

    public java.util.List<java.lang.Object> getChatLists() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.ChatLists
            return r0
    }

    public java.lang.String getPushMsgMethod() {
            r1 = this;
            java.lang.String r0 = r1.PushMsgMethod
            return r0
    }

    public java.lang.String getQueryUserInfoMethod() {
            r1 = this;
            java.lang.String r0 = r1.queryUserInfoMethod
            return r0
    }

    public java.lang.Class<?> getSelectConversationActivityGet() {
            r1 = this;
            java.lang.Class<?> r0 = r1.SelectConversationActivityGet
            return r0
    }

    public java.lang.String getSendCmdMessageMethod() {
            r1 = this;
            java.lang.String r0 = r1.sendCmdMessageMethod
            return r0
    }

    public java.lang.Object getSoulRouter() {
            r1 = this;
            java.lang.Object r0 = r1.SoulRouter
            return r0
    }

    public java.lang.String getToChatUserId() {
            r1 = this;
            java.lang.String r0 = r1.ToChatUserId
            return r0
    }

    public java.lang.String getUserIdDESUtilsPass() {
            r1 = this;
            java.lang.String r0 = r1.UserIdDESUtilsPass
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.getUserIdDESUtilsPass()
            r1 = 43
            if (r0 != 0) goto La
            r0 = r1
            goto Le
        La:
            int r0 = r0.hashCode()
        Le:
            r2 = 59
            int r0 = r0 + r2
            java.util.List r3 = r4.getChatLists()
            int r0 = r0 * r2
            if (r3 != 0) goto L1a
            r3 = r1
            goto L1e
        L1a:
            int r3 = r3.hashCode()
        L1e:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getQueryUserInfoMethod()
            int r0 = r0 * r2
            if (r3 != 0) goto L28
            r3 = r1
            goto L2c
        L28:
            int r3 = r3.hashCode()
        L2c:
            int r0 = r0 + r3
            java.lang.Object r3 = r4.getBaseConversationFragment()
            int r0 = r0 * r2
            if (r3 != 0) goto L36
            r3 = r1
            goto L3a
        L36:
            int r3 = r3.hashCode()
        L3a:
            int r0 = r0 + r3
            java.lang.Class r3 = r4.getSelectConversationActivityGet()
            int r0 = r0 * r2
            if (r3 != 0) goto L44
            r3 = r1
            goto L48
        L44:
            int r3 = r3.hashCode()
        L48:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getToChatUserId()
            int r0 = r0 * r2
            if (r3 != 0) goto L52
            r3 = r1
            goto L56
        L52:
            int r3 = r3.hashCode()
        L56:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getSendCmdMessageMethod()
            int r0 = r0 * r2
            if (r3 != 0) goto L60
            r3 = r1
            goto L64
        L60:
            int r3 = r3.hashCode()
        L64:
            int r0 = r0 + r3
            java.lang.String r3 = r4.getPushMsgMethod()
            int r0 = r0 * r2
            if (r3 != 0) goto L6e
            r3 = r1
            goto L72
        L6e:
            int r3 = r3.hashCode()
        L72:
            int r0 = r0 + r3
            java.lang.Object r3 = r4.getSoulRouter()
            int r0 = r0 * r2
            if (r3 != 0) goto L7b
            goto L7f
        L7b:
            int r1 = r3.hashCode()
        L7f:
            int r0 = r0 + r1
            return r0
    }

    public void setBaseConversationFragment(java.lang.Object r1) {
            r0 = this;
            r0.BaseConversationFragment = r1
            return
    }

    public void setChatLists(java.util.List<java.lang.Object> r1) {
            r0 = this;
            r0.ChatLists = r1
            return
    }

    public void setPushMsgMethod(java.lang.String r1) {
            r0 = this;
            r0.PushMsgMethod = r1
            return
    }

    public void setQueryUserInfoMethod(java.lang.String r1) {
            r0 = this;
            r0.queryUserInfoMethod = r1
            return
    }

    public void setSelectConversationActivityGet(java.lang.Class<?> r1) {
            r0 = this;
            r0.SelectConversationActivityGet = r1
            return
    }

    public void setSendCmdMessageMethod(java.lang.String r1) {
            r0 = this;
            r0.sendCmdMessageMethod = r1
            return
    }

    public void setSoulRouter(java.lang.Object r1) {
            r0 = this;
            r0.SoulRouter = r1
            return
    }

    public void setToChatUserId(java.lang.String r1) {
            r0 = this;
            r0.ToChatUserId = r1
            return
    }

    public void setUserIdDESUtilsPass(java.lang.String r1) {
            r0 = this;
            r0.UserIdDESUtilsPass = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Soul(UserIdDESUtilsPass="
            r0.<init>(r1)
            java.lang.String r1 = r2.getUserIdDESUtilsPass()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", ChatLists="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List r1 = r2.getChatLists()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", queryUserInfoMethod="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getQueryUserInfoMethod()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", BaseConversationFragment="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2.getBaseConversationFragment()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", SelectConversationActivityGet="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Class r1 = r2.getSelectConversationActivityGet()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", ToChatUserId="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getToChatUserId()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", sendCmdMessageMethod="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getSendCmdMessageMethod()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", PushMsgMethod="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getPushMsgMethod()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", SoulRouter="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2.getSoulRouter()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
