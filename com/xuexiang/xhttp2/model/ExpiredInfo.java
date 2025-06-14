package com.xuexiang.xhttp2.model;

/* loaded from: classes.dex */
public class ExpiredInfo {
    private java.lang.String mBodyString;
    private int mCode;
    private int mExpiredType;
    private boolean mIsExpired;

    public ExpiredInfo(int r1) {
            r0 = this;
            r0.<init>()
            r0.mCode = r1
            return
    }

    public java.lang.String getBodyString() {
            r1 = this;
            java.lang.String r0 = r1.mBodyString
            return r0
    }

    public int getCode() {
            r1 = this;
            int r0 = r1.mCode
            return r0
    }

    public int getExpiredType() {
            r1 = this;
            int r0 = r1.mExpiredType
            return r0
    }

    public boolean isExpired() {
            r1 = this;
            boolean r0 = r1.mIsExpired
            return r0
    }

    public com.xuexiang.xhttp2.model.ExpiredInfo setBodyString(java.lang.String r1) {
            r0 = this;
            r0.mBodyString = r1
            return r0
    }

    public com.xuexiang.xhttp2.model.ExpiredInfo setCode(int r1) {
            r0 = this;
            r0.mCode = r1
            return r0
    }

    public com.xuexiang.xhttp2.model.ExpiredInfo setExpired(boolean r1) {
            r0 = this;
            r0.mIsExpired = r1
            return r0
    }

    public com.xuexiang.xhttp2.model.ExpiredInfo setExpiredType(int r1) {
            r0 = this;
            r0.mExpiredType = r1
            r1 = 1
            r0.mIsExpired = r1
            return r0
    }
}
