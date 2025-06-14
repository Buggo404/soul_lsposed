package com.usidqw.qwerklj.GreenDao.p001db;

/* loaded from: classes.dex */
public class UserConfig {

    /* renamed from: id */
    java.lang.Long f135id;
    boolean isSend;
    java.lang.String signature;
    java.lang.String userId;

    public UserConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    public UserConfig(java.lang.Long r1, java.lang.String r2, java.lang.String r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f135id = r1
            r0.userId = r2
            r0.signature = r3
            r0.isSend = r4
            return
    }

    public java.lang.Long getId() {
            r1 = this;
            java.lang.Long r0 = r1.f135id
            return r0
    }

    public boolean getIsSend() {
            r1 = this;
            boolean r0 = r1.isSend
            return r0
    }

    public java.lang.String getSignature() {
            r1 = this;
            java.lang.String r0 = r1.signature
            return r0
    }

    public java.lang.String getUserId() {
            r1 = this;
            java.lang.String r0 = r1.userId
            return r0
    }

    public void setId(java.lang.Long r1) {
            r0 = this;
            r0.f135id = r1
            return
    }

    public void setIsSend(boolean r1) {
            r0 = this;
            r0.isSend = r1
            return
    }

    public void setSignature(java.lang.String r1) {
            r0 = this;
            r0.signature = r1
            return
    }

    public void setUserId(java.lang.String r1) {
            r0 = this;
            r0.userId = r1
            return
    }
}
