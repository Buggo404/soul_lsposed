package com.xuexiang.xhttp2.cache.core;

/* loaded from: classes.dex */
public interface ICache {
    boolean clear();

    boolean containsKey(java.lang.String r1);

    <T> T load(java.lang.reflect.Type r1, java.lang.String r2, long r3);

    boolean remove(java.lang.String r1);

    <T> boolean save(java.lang.String r1, T r2);
}
