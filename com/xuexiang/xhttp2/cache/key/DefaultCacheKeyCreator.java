package com.xuexiang.xhttp2.cache.key;

/* loaded from: classes.dex */
public class DefaultCacheKeyCreator implements com.xuexiang.xhttp2.cache.key.ICacheKeyCreator {
    public DefaultCacheKeyCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.xuexiang.xhttp2.cache.key.ICacheKeyCreator
    public java.lang.String getCacheKey(java.lang.reflect.Method r6, java.lang.Object[] r7, com.xuexiang.xhttp2.annotation.NetMethod r8) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.url()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r2 = "-"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r6.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 40
            r1.append(r2)
            java.lang.reflect.Type[] r6 = r6.getGenericParameterTypes()
            int r1 = r8.paramType()
            r2 = 4
            r3 = 0
            if (r1 != r2) goto L3c
            java.lang.String r6 = "JSON_OBJECT="
            java.lang.StringBuilder r6 = r0.append(r6)
            r7 = r7[r3]
            java.lang.String r7 = com.xuexiang.xhttp2.cache.key.Strings.toString(r7)
            r6.append(r7)
            goto L89
        L3c:
            int r1 = r8.cacheKeyIndex()
            r2 = -1
            r4 = 61
            if (r1 != r2) goto L69
        L45:
            int r1 = r6.length
            if (r3 >= r1) goto L89
            if (r3 <= 0) goto L4f
            java.lang.String r1 = "|"
            r0.append(r1)
        L4f:
            java.lang.String[] r1 = r8.parameterNames()
            r1 = r1[r3]
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.StringBuilder r1 = r1.append(r4)
            r2 = r7[r3]
            java.lang.String r2 = com.xuexiang.xhttp2.cache.key.Strings.toString(r2)
            r1.append(r2)
            int r3 = r3 + 1
            goto L45
        L69:
            int r1 = r8.cacheKeyIndex()
            if (r1 < 0) goto L89
            int r6 = r6.length
            if (r1 >= r6) goto L89
            java.lang.String[] r6 = r8.parameterNames()
            r6 = r6[r1]
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.StringBuilder r6 = r6.append(r4)
            r7 = r7[r1]
            java.lang.String r7 = com.xuexiang.xhttp2.cache.key.Strings.toString(r7)
            r6.append(r7)
        L89:
            r6 = 41
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }
}
