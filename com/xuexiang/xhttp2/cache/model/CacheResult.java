package com.xuexiang.xhttp2.cache.model;

/* loaded from: classes.dex */
public class CacheResult<T> implements java.io.Serializable {
    public T data;
    public boolean isFromCache;

    public CacheResult() {
            r0 = this;
            r0.<init>()
            return
    }

    public CacheResult(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.isFromCache = r1
            return
    }

    public CacheResult(boolean r1, T r2) {
            r0 = this;
            r0.<init>()
            r0.isFromCache = r1
            r0.data = r2
            return
    }

    public T getData() {
            r1 = this;
            T r0 = r1.data
            return r0
    }

    public boolean isCache() {
            r1 = this;
            boolean r0 = r1.isFromCache
            return r0
    }

    public void setCache(boolean r1) {
            r0 = this;
            r0.isFromCache = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CacheResult{isCache="
            r0.<init>(r1)
            boolean r1 = r2.isFromCache
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", data="
            java.lang.StringBuilder r0 = r0.append(r1)
            T r1 = r2.data
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
