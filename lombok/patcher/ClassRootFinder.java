package lombok.patcher;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/ClassRootFinder.SCL.lombok */
public class ClassRootFinder {
    public ClassRootFinder() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static java.lang.String urlDecode(java.lang.String r3, boolean r4) {
            r0 = r3
            r1 = r4
            if (r1 == 0) goto La
            java.lang.String r1 = "UTF-8"
            goto L10
        La:
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()     // Catch: java.io.UnsupportedEncodingException -> L14
            java.lang.String r1 = r1.name()     // Catch: java.io.UnsupportedEncodingException -> L14
        L10:
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L14
            return r0
        L14:
            r0 = r3
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L1c
            return r0
        L1c:
            r0 = r3
            return r0
    }

    public static java.lang.String findClassRootOfSelf() {
            java.lang.Class<lombok.patcher.ClassRootFinder> r0 = lombok.patcher.ClassRootFinder.class
            java.lang.String r0 = findClassRootOfClass(r0)
            return r0
    }

    public static java.lang.String findClassRootOfClass(java.lang.Class<?> r6) {
            r0 = r6
            java.lang.String r0 = r0.getName()
            r7 = r0
            r0 = r7
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r8 = r0
            r0 = r8
            r1 = -1
            if (r0 <= r1) goto L23
            r0 = r7
            r1 = 0
            r2 = r8
            java.lang.String r0 = r0.substring(r1, r2)
            r9 = r0
            r0 = r7
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            r7 = r0
            goto L26
        L23:
            java.lang.String r0 = ""
            r9 = r0
        L26:
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r7
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = ".class"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.net.URL r0 = r0.getResource(r1)
            r10 = r0
            r0 = r10
            java.lang.String r0 = r0.toString()
            r11 = r0
            r0 = r11
            java.lang.String r1 = "file:/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto Ld7
            r0 = r11
            r1 = 5
            java.lang.String r0 = r0.substring(r1)
            r1 = 0
            java.lang.String r0 = urlDecode(r0, r1)
            r12 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L77
            r0 = r11
            r1 = 5
            java.lang.String r0 = r0.substring(r1)
            r1 = 1
            java.lang.String r0 = urlDecode(r0, r1)
            r12 = r0
        L77:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "/"
            r1.<init>(r2)
            r1 = r9
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".class"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13 = r0
            r0 = r12
            r1 = r13
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto Lc1
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Unknown path structure: "
            r3.<init>(r4)
            r3 = r12
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lc1:
            r0 = r12
            r1 = 0
            r2 = r12
            int r2 = r2.length()
            r3 = r13
            int r3 = r3.length()
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r11 = r0
            goto L17d
        Ld7:
            r0 = r11
            java.lang.String r1 = "jar:"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L164
            r0 = r11
            r1 = 33
            int r0 = r0.indexOf(r1)
            r12 = r0
            r0 = r12
            r1 = -1
            if (r0 != r1) goto L109
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "No separator in jar protocol: "
            r3.<init>(r4)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L109:
            r0 = r11
            r1 = 4
            r2 = r12
            java.lang.String r0 = r0.substring(r1, r2)
            r13 = r0
            r0 = r13
            java.lang.String r1 = "file:/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L14b
            r0 = r13
            r1 = 5
            java.lang.String r0 = r0.substring(r1)
            r1 = 0
            java.lang.String r0 = urlDecode(r0, r1)
            r14 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L144
            r0 = r13
            r1 = 5
            java.lang.String r0 = r0.substring(r1)
            r1 = 1
            java.lang.String r0 = urlDecode(r0, r1)
            r14 = r0
        L144:
            r0 = r14
            r11 = r0
            goto L17d
        L14b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Unknown path structure: "
            r3.<init>(r4)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L164:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Unknown protocol: "
            r3.<init>(r4)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L17d:
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L189
            java.lang.String r0 = "/"
            r11 = r0
        L189:
            r0 = r11
            return r0
    }

    public static void main(java.lang.String[] r3) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = findClassRootOfSelf()
            r0.println(r1)
            return
    }
}
