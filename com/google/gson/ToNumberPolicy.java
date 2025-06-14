package com.google.gson;

/* loaded from: classes.dex */
public enum ToNumberPolicy extends java.lang.Enum<com.google.gson.ToNumberPolicy> implements com.google.gson.ToNumberStrategy {
    private static final /* synthetic */ com.google.gson.ToNumberPolicy[] $VALUES = null;
    public static final com.google.gson.ToNumberPolicy BIG_DECIMAL = null;
    public static final com.google.gson.ToNumberPolicy DOUBLE = null;
    public static final com.google.gson.ToNumberPolicy LAZILY_PARSED_NUMBER = null;
    public static final com.google.gson.ToNumberPolicy LONG_OR_DOUBLE = null;





    static {
            com.google.gson.ToNumberPolicy$1 r0 = new com.google.gson.ToNumberPolicy$1
            java.lang.String r1 = "DOUBLE"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.gson.ToNumberPolicy.DOUBLE = r0
            com.google.gson.ToNumberPolicy$2 r1 = new com.google.gson.ToNumberPolicy$2
            java.lang.String r3 = "LAZILY_PARSED_NUMBER"
            r4 = 1
            r1.<init>(r3, r4)
            com.google.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER = r1
            com.google.gson.ToNumberPolicy$3 r3 = new com.google.gson.ToNumberPolicy$3
            java.lang.String r5 = "LONG_OR_DOUBLE"
            r6 = 2
            r3.<init>(r5, r6)
            com.google.gson.ToNumberPolicy.LONG_OR_DOUBLE = r3
            com.google.gson.ToNumberPolicy$4 r5 = new com.google.gson.ToNumberPolicy$4
            java.lang.String r7 = "BIG_DECIMAL"
            r8 = 3
            r5.<init>(r7, r8)
            com.google.gson.ToNumberPolicy.BIG_DECIMAL = r5
            r7 = 4
            com.google.gson.ToNumberPolicy[] r7 = new com.google.gson.ToNumberPolicy[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            com.google.gson.ToNumberPolicy.$VALUES = r7
            return
    }

    ToNumberPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ ToNumberPolicy(java.lang.String r1, int r2, com.google.gson.ToNumberPolicy.C07711 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.gson.ToNumberPolicy valueOf(java.lang.String r1) {
            java.lang.Class<com.google.gson.ToNumberPolicy> r0 = com.google.gson.ToNumberPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.gson.ToNumberPolicy r1 = (com.google.gson.ToNumberPolicy) r1
            return r1
    }

    public static com.google.gson.ToNumberPolicy[] values() {
            com.google.gson.ToNumberPolicy[] r0 = com.google.gson.ToNumberPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.gson.ToNumberPolicy[] r0 = (com.google.gson.ToNumberPolicy[]) r0
            return r0
    }
}
