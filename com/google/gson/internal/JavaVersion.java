package com.google.gson.internal;

/* loaded from: classes.dex */
public final class JavaVersion {
    private static final int majorJavaVersion = 0;

    static {
            int r0 = determineMajorJavaVersion()
            com.google.gson.internal.JavaVersion.majorJavaVersion = r0
            return
    }

    private JavaVersion() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int determineMajorJavaVersion() {
            java.lang.String r0 = "java.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            int r0 = getMajorJavaVersion(r0)
            return r0
    }

    private static int extractBeginningInt(java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L25
            r0.<init>()     // Catch: java.lang.NumberFormatException -> L25
            r1 = 0
        L6:
            int r2 = r4.length()     // Catch: java.lang.NumberFormatException -> L25
            if (r1 >= r2) goto L1c
            char r2 = r4.charAt(r1)     // Catch: java.lang.NumberFormatException -> L25
            boolean r3 = java.lang.Character.isDigit(r2)     // Catch: java.lang.NumberFormatException -> L25
            if (r3 == 0) goto L1c
            r0.append(r2)     // Catch: java.lang.NumberFormatException -> L25
            int r1 = r1 + 1
            goto L6
        L1c:
            java.lang.String r4 = r0.toString()     // Catch: java.lang.NumberFormatException -> L25
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L25
            return r4
        L25:
            r4 = -1
            return r4
    }

    public static int getMajorJavaVersion() {
            int r0 = com.google.gson.internal.JavaVersion.majorJavaVersion
            return r0
    }

    static int getMajorJavaVersion(java.lang.String r2) {
            int r0 = parseDotted(r2)
            r1 = -1
            if (r0 != r1) goto Lb
            int r0 = extractBeginningInt(r2)
        Lb:
            if (r0 != r1) goto Lf
            r2 = 6
            return r2
        Lf:
            return r0
    }

    public static boolean isJava9OrLater() {
            int r0 = com.google.gson.internal.JavaVersion.majorJavaVersion
            r1 = 9
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private static int parseDotted(java.lang.String r3) {
            java.lang.String r0 = "[._]"
            java.lang.String[] r3 = r3.split(r0)     // Catch: java.lang.NumberFormatException -> L1b
            r0 = 0
            r0 = r3[r0]     // Catch: java.lang.NumberFormatException -> L1b
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L1b
            r1 = 1
            if (r0 != r1) goto L1a
            int r2 = r3.length     // Catch: java.lang.NumberFormatException -> L1b
            if (r2 <= r1) goto L1a
            r3 = r3[r1]     // Catch: java.lang.NumberFormatException -> L1b
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L1b
            return r3
        L1a:
            return r0
        L1b:
            r3 = -1
            return r3
    }
}
