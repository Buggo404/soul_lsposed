package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/GuavaTypeMap.SCL.lombok */
public final class GuavaTypeMap {
    private static final java.util.Map<java.lang.String, java.lang.String> TYPE_TO_GUAVA_TYPE = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            java.lang.String r1 = "java.util.NavigableSet"
            java.lang.String r2 = "ImmutableSortedSet"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "java.util.NavigableMap"
            java.lang.String r2 = "ImmutableSortedMap"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "java.util.SortedSet"
            java.lang.String r2 = "ImmutableSortedSet"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "java.util.SortedMap"
            java.lang.String r2 = "ImmutableSortedMap"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "java.util.Set"
            java.lang.String r2 = "ImmutableSet"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "java.util.Map"
            java.lang.String r2 = "ImmutableMap"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "java.util.Collection"
            java.lang.String r2 = "ImmutableList"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "java.util.List"
            java.lang.String r2 = "ImmutableList"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "com.google.common.collect.ImmutableSet"
            java.lang.String r2 = "ImmutableSet"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "com.google.common.collect.ImmutableSortedSet"
            java.lang.String r2 = "ImmutableSortedSet"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "com.google.common.collect.ImmutableMap"
            java.lang.String r2 = "ImmutableMap"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "com.google.common.collect.ImmutableBiMap"
            java.lang.String r2 = "ImmutableBiMap"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "com.google.common.collect.ImmutableSortedMap"
            java.lang.String r2 = "ImmutableSortedMap"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "com.google.common.collect.ImmutableList"
            java.lang.String r2 = "ImmutableList"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "com.google.common.collect.ImmutableCollection"
            java.lang.String r2 = "ImmutableList"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "com.google.common.collect.ImmutableTable"
            java.lang.String r2 = "ImmutableTable"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            lombok.core.GuavaTypeMap.TYPE_TO_GUAVA_TYPE = r0
            return
    }

    public static java.lang.String getGuavaTypeName(java.lang.String r3) {
            java.util.Map<java.lang.String, java.lang.String> r0 = lombok.core.GuavaTypeMap.TYPE_TO_GUAVA_TYPE
            r1 = r3
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L15
            r0 = r4
            goto L17
        L15:
            java.lang.String r0 = "ImmutableList"
        L17:
            return r0
    }

    private GuavaTypeMap() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }
}
