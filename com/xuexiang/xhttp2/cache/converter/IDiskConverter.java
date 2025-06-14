package com.xuexiang.xhttp2.cache.converter;

/* loaded from: classes.dex */
public interface IDiskConverter {
    <T> T load(java.io.InputStream r1, java.lang.reflect.Type r2);

    boolean writer(java.io.OutputStream r1, java.lang.Object r2);
}
