package lombok.core.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/handlers/Singulars.SCL.lombok */
public class Singulars {
    private static final java.util.List<java.lang.String> SINGULAR_STORE = null;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            lombok.core.handlers.Singulars.SINGULAR_STORE = r0
            java.lang.Class<lombok.core.handlers.Singulars> r0 = lombok.core.handlers.Singulars.class
            java.lang.String r1 = "singulars.txt"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch: java.io.IOException -> Lb9
            r7 = r0
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            r1 = r0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            r3 = r2
            r4 = r7
            java.lang.String r5 = "UTF-8"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.readLine()     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            r9 = r0
            goto L9a
        L2c:
            r0 = r9
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            r9 = r0
            r0 = r9
            java.lang.String r1 = "#"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            if (r0 != 0) goto L95
            r0 = r9
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            if (r0 == 0) goto L44
            goto L95
        L44:
            r0 = r9
            java.lang.String r1 = " ="
            boolean r0 = r0.endsWith(r1)     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            if (r0 == 0) goto L6f
            java.util.List<java.lang.String> r0 = lombok.core.handlers.Singulars.SINGULAR_STORE     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            r1 = r9
            r2 = 0
            r3 = r9
            int r3 = r3.length()     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            r4 = 2
            int r3 = r3 - r4
            java.lang.String r1 = r1.substring(r2, r3)     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            java.util.List<java.lang.String> r0 = lombok.core.handlers.Singulars.SINGULAR_STORE     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            java.lang.String r1 = ""
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            goto L95
        L6f:
            r0 = r9
            java.lang.String r1 = " = "
            int r0 = r0.indexOf(r1)     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            r10 = r0
            java.util.List<java.lang.String> r0 = lombok.core.handlers.Singulars.SINGULAR_STORE     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            r1 = r9
            r2 = 0
            r3 = r10
            java.lang.String r1 = r1.substring(r2, r3)     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            java.util.List<java.lang.String> r0 = lombok.core.handlers.Singulars.SINGULAR_STORE     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            r1 = r9
            r2 = r10
            r3 = 3
            int r2 = r2 + r3
            java.lang.String r1 = r1.substring(r2)     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
        L95:
            r0 = r8
            java.lang.String r0 = r0.readLine()     // Catch: java.lang.Throwable -> La1 java.io.IOException -> Lb9
            r9 = r0
        L9a:
            r0 = r9
            if (r0 != 0) goto L2c
            goto Lae
        La1:
            r11 = move-exception
            r0 = r7
            r0.close()     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lb9
            goto Lab
        Laa:
        Lab:
            r0 = r11
            throw r0     // Catch: java.io.IOException -> Lb9
        Lae:
            r0 = r7
            r0.close()     // Catch: java.lang.Throwable -> Lb5 java.io.IOException -> Lb9
            goto Lc2
        Lb5:
            goto Lc2
        Lb9:
            java.util.List<java.lang.String> r0 = lombok.core.handlers.Singulars.SINGULAR_STORE
            r0.clear()
        Lc2:
            return
    }

    public Singulars() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.lang.String autoSingularize(java.lang.String r8) {
            r0 = r8
            int r0 = r0.length()
            r9 = r0
            r0 = 0
            r10 = r0
            goto L104
        La:
            java.util.List<java.lang.String> r0 = lombok.core.handlers.Singulars.SINGULAR_STORE
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r11
            r1 = 0
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isUpperCase(r0)
            r12 = r0
            r0 = r11
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 45
            if (r0 != r1) goto L2f
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            r13 = r0
            r0 = r11
            int r0 = r0.length()
            r14 = r0
            r0 = r9
            r1 = r14
            if (r0 >= r1) goto L41
            goto L101
        L41:
            r0 = r8
            r1 = 1
            r2 = r9
            r3 = r14
            int r2 = r2 - r3
            r3 = r13
            int r2 = r2 + r3
            r3 = r11
            r4 = r13
            r5 = r14
            r6 = r13
            int r5 = r5 - r6
            boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L5b
            goto L101
        L5b:
            r0 = r12
            if (r0 == 0) goto L77
            r0 = r9
            r1 = r14
            if (r0 == r1) goto L77
            r0 = r8
            r1 = r9
            r2 = r14
            int r1 = r1 - r2
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isUpperCase(r0)
            if (r0 != 0) goto L77
            goto L101
        L77:
            java.util.List<java.lang.String> r0 = lombok.core.handlers.Singulars.SINGULAR_STORE
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r15 = r0
            r0 = r15
            java.lang.String r1 = "!"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L93
            r0 = 0
            return r0
        L93:
            r0 = r15
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb0
            r0 = r8
            r1 = r9
            r2 = r14
            int r1 = r1 - r2
            r2 = r13
            int r1 = r1 + r2
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isUpperCase(r0)
            if (r0 == 0) goto Lb0
            r0 = 1
            goto Lb1
        Lb0:
            r0 = 0
        Lb1:
            r16 = r0
            r0 = r8
            r1 = 0
            r2 = r9
            r3 = r14
            int r2 = r2 - r3
            r3 = r13
            int r2 = r2 + r3
            java.lang.String r0 = r0.substring(r1, r2)
            r17 = r0
            r0 = r16
            if (r0 == 0) goto Le8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r15
            r3 = 0
            char r2 = r2.charAt(r3)
            char r2 = java.lang.Character.toUpperCase(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            r1 = r15
            r2 = 1
            java.lang.String r1 = r1.substring(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto Lea
        Le8:
            r0 = r15
        Lea:
            r18 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r17
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            r1 = r18
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L101:
            int r10 = r10 + 2
        L104:
            r0 = r10
            java.util.List<java.lang.String> r1 = lombok.core.handlers.Singulars.SINGULAR_STORE
            int r1 = r1.size()
            if (r0 < r1) goto La
            r0 = 0
            return r0
    }
}
