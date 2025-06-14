package com.google.gson;

/* loaded from: classes.dex */
public enum FieldNamingPolicy extends java.lang.Enum<com.google.gson.FieldNamingPolicy> implements com.google.gson.FieldNamingStrategy {
    private static final /* synthetic */ com.google.gson.FieldNamingPolicy[] $VALUES = null;
    public static final com.google.gson.FieldNamingPolicy IDENTITY = null;
    public static final com.google.gson.FieldNamingPolicy LOWER_CASE_WITH_DASHES = null;
    public static final com.google.gson.FieldNamingPolicy LOWER_CASE_WITH_DOTS = null;
    public static final com.google.gson.FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES = null;
    public static final com.google.gson.FieldNamingPolicy UPPER_CAMEL_CASE = null;
    public static final com.google.gson.FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES = null;
    public static final com.google.gson.FieldNamingPolicy UPPER_CASE_WITH_UNDERSCORES = null;








    static {
            com.google.gson.FieldNamingPolicy$1 r0 = new com.google.gson.FieldNamingPolicy$1
            java.lang.String r1 = "IDENTITY"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.gson.FieldNamingPolicy.IDENTITY = r0
            com.google.gson.FieldNamingPolicy$2 r1 = new com.google.gson.FieldNamingPolicy$2
            java.lang.String r3 = "UPPER_CAMEL_CASE"
            r4 = 1
            r1.<init>(r3, r4)
            com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE = r1
            com.google.gson.FieldNamingPolicy$3 r3 = new com.google.gson.FieldNamingPolicy$3
            java.lang.String r5 = "UPPER_CAMEL_CASE_WITH_SPACES"
            r6 = 2
            r3.<init>(r5, r6)
            com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES = r3
            com.google.gson.FieldNamingPolicy$4 r5 = new com.google.gson.FieldNamingPolicy$4
            java.lang.String r7 = "UPPER_CASE_WITH_UNDERSCORES"
            r8 = 3
            r5.<init>(r7, r8)
            com.google.gson.FieldNamingPolicy.UPPER_CASE_WITH_UNDERSCORES = r5
            com.google.gson.FieldNamingPolicy$5 r7 = new com.google.gson.FieldNamingPolicy$5
            java.lang.String r9 = "LOWER_CASE_WITH_UNDERSCORES"
            r10 = 4
            r7.<init>(r9, r10)
            com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES = r7
            com.google.gson.FieldNamingPolicy$6 r9 = new com.google.gson.FieldNamingPolicy$6
            java.lang.String r11 = "LOWER_CASE_WITH_DASHES"
            r12 = 5
            r9.<init>(r11, r12)
            com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_DASHES = r9
            com.google.gson.FieldNamingPolicy$7 r11 = new com.google.gson.FieldNamingPolicy$7
            java.lang.String r13 = "LOWER_CASE_WITH_DOTS"
            r14 = 6
            r11.<init>(r13, r14)
            com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_DOTS = r11
            r13 = 7
            com.google.gson.FieldNamingPolicy[] r13 = new com.google.gson.FieldNamingPolicy[r13]
            r13[r2] = r0
            r13[r4] = r1
            r13[r6] = r3
            r13[r8] = r5
            r13[r10] = r7
            r13[r12] = r9
            r13[r14] = r11
            com.google.gson.FieldNamingPolicy.$VALUES = r13
            return
    }

    FieldNamingPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ FieldNamingPolicy(java.lang.String r1, int r2, com.google.gson.FieldNamingPolicy.C07531 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static java.lang.String separateCamelCase(java.lang.String r5, char r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L25
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isUpperCase(r3)
            if (r4 == 0) goto L1f
            int r4 = r0.length()
            if (r4 == 0) goto L1f
            r0.append(r6)
        L1f:
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L25:
            java.lang.String r5 = r0.toString()
            return r5
    }

    static java.lang.String upperCaseFirstLetter(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L58
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isLetter(r3)
            if (r4 == 0) goto L55
            boolean r0 = java.lang.Character.isUpperCase(r3)
            if (r0 == 0) goto L19
            return r5
        L19:
            char r0 = java.lang.Character.toUpperCase(r3)
            r3 = 1
            if (r2 != 0) goto L36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r5 = r5.substring(r3)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            return r5
        L36:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = r5.substring(r1, r2)
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.StringBuilder r0 = r1.append(r0)
            int r2 = r2 + r3
            java.lang.String r5 = r5.substring(r2)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            return r5
        L55:
            int r2 = r2 + 1
            goto L6
        L58:
            return r5
    }

    public static com.google.gson.FieldNamingPolicy valueOf(java.lang.String r1) {
            java.lang.Class<com.google.gson.FieldNamingPolicy> r0 = com.google.gson.FieldNamingPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.gson.FieldNamingPolicy r1 = (com.google.gson.FieldNamingPolicy) r1
            return r1
    }

    public static com.google.gson.FieldNamingPolicy[] values() {
            com.google.gson.FieldNamingPolicy[] r0 = com.google.gson.FieldNamingPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.gson.FieldNamingPolicy[] r0 = (com.google.gson.FieldNamingPolicy[]) r0
            return r0
    }
}
