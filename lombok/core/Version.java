package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/Version.SCL.lombok */
public class Version {
    private static final java.lang.String VERSION = "1.18.26";
    private static final java.lang.String RELEASE_NAME = "Envious Ferret";

    private Version() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void main(java.lang.String[] r7) {
            r0 = r7
            int r0 = r0.length
            if (r0 <= 0) goto L1b
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "%s\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = getFullVersion()
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            goto L23
        L1b:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "1.18.26"
            r0.println(r1)
        L23:
            return
    }

    public static java.lang.String getVersion() {
            java.lang.String r0 = "1.18.26"
            return r0
    }

    public static java.lang.String getReleaseName() {
            java.lang.String r0 = "Envious Ferret"
            return r0
    }

    public static java.lang.String getFullVersion() {
            java.lang.String r0 = "v%s \"%s\""
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "1.18.26"
            r2[r3] = r4
            r2 = r1
            r3 = 1
            java.lang.String r4 = "Envious Ferret"
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r6 = r0
            boolean r0 = isEdgeRelease()
            if (r0 != 0) goto L1c
            r0 = r6
            return r0
        L1c:
            java.lang.Class<lombok.core.Version> r0 = lombok.core.Version.class
            java.lang.String r1 = "/release-timestamp.txt"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L2a
            r0 = r6
            return r0
        L2a:
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Exception -> L7c
            r8 = r0
            r0 = 0
            r9 = r0
            goto L4e
        L34:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r8
            int r3 = r3.length     // Catch: java.lang.Exception -> L7c
            r4 = r9
            int r3 = r3 - r4
            int r0 = r0.read(r1, r2, r3)     // Catch: java.lang.Exception -> L7c
            r10 = r0
            r0 = r10
            r1 = -1
            if (r0 != r1) goto L49
            goto L54
        L49:
            r0 = r9
            r1 = r10
            int r0 = r0 + r1
            r9 = r0
        L4e:
            r0 = r9
            r1 = r8
            int r1 = r1.length     // Catch: java.lang.Exception -> L7c
            if (r0 < r1) goto L34
        L54:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L7c
            r1 = r0
            r2 = r8
            java.lang.String r3 = "UTF-8"
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L7c
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Exception -> L7c
            r10 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7c
            r1 = r0
            r2 = r6
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L7c
            r1.<init>(r2)     // Catch: java.lang.Exception -> L7c
            java.lang.String r1 = " - "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L7c
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L7c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L7c
            return r0
        L7c:
            r0 = r7
            r0.close()     // Catch: java.lang.Exception -> L84
            goto L85
        L84:
        L85:
            r0 = r6
            return r0
    }

    public static boolean isEdgeRelease() {
            java.lang.String r0 = "1.18.26"
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r4 = r0
            r0 = r4
            r1 = -1
            if (r0 != r1) goto Lf
            r0 = 0
            return r0
        Lf:
            java.lang.String r0 = "1.18.26"
            r1 = r4
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Exception -> L24
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L24
            r1 = 2
            int r0 = r0 % r1
            r1 = 1
            if (r0 != r1) goto L22
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
        L24:
            r0 = 0
            return r0
    }
}
