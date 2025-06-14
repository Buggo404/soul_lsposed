package lombok.eclipse.agent;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchFixesShadowLoaded.SCL.lombok */
public class PatchFixesShadowLoaded {
    public PatchFixesShadowLoaded() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.lang.String addLombokNotesToEclipseAboutDialog(java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "aboutText"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            r0 = r4
            java.lang.String r1 = " is installed. https://projectlombok.org"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L14
            r0 = r4
            return r0
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r4
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "\n\nLombok "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = lombok.core.Version.getFullVersion()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " is installed. https://projectlombok.org/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L33:
            r0 = r4
            return r0
    }

    public static byte[] runPostCompiler(byte[] r4, java.lang.String r5) {
            r0 = r4
            r1 = r5
            lombok.core.DiagnosticsReceiver r2 = lombok.core.DiagnosticsReceiver.CONSOLE
            byte[] r0 = lombok.core.PostCompiler.applyTransformations(r0, r1, r2)
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L11
            r0 = r4
            goto L12
        L11:
            r0 = r6
        L12:
            return r0
    }

    public static java.io.OutputStream runPostCompiler(java.io.OutputStream r4) throws java.io.IOException {
            r0 = r4
            java.lang.String r1 = "TEST"
            lombok.core.DiagnosticsReceiver r2 = lombok.core.DiagnosticsReceiver.CONSOLE
            java.io.OutputStream r0 = lombok.core.PostCompiler.wrapOutputStream(r0, r1, r2)
            return r0
    }

    public static java.io.BufferedOutputStream runPostCompiler(java.io.BufferedOutputStream r6, java.lang.String r7, java.lang.String r8) throws java.io.IOException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r7
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9 = r0
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r1 = r0
            r2 = r6
            r3 = r9
            lombok.core.DiagnosticsReceiver r4 = lombok.core.DiagnosticsReceiver.CONSOLE
            java.io.OutputStream r2 = lombok.core.PostCompiler.wrapOutputStream(r2, r3, r4)
            r1.<init>(r2)
            return r0
    }
}
