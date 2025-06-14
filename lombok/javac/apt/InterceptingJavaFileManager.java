package lombok.javac.apt;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/apt/InterceptingJavaFileManager.SCL.lombok */
final class InterceptingJavaFileManager extends javax.tools.ForwardingJavaFileManager<javax.tools.JavaFileManager> {
    private final lombok.core.DiagnosticsReceiver diagnostics;
    private final lombok.javac.apt.LombokFileObjects.Compiler compiler;

    InterceptingJavaFileManager(javax.tools.JavaFileManager r4, lombok.core.DiagnosticsReceiver r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            lombok.javac.apt.LombokFileObjects$Compiler r1 = lombok.javac.apt.LombokFileObjects.getCompiler(r1)
            r0.compiler = r1
            r0 = r3
            r1 = r5
            r0.diagnostics = r1
            return
    }

    public javax.tools.JavaFileObject getJavaFileForOutput(javax.tools.JavaFileManager.Location r7, java.lang.String r8, javax.tools.JavaFileObject.Kind r9, javax.tools.FileObject r10) throws java.io.IOException {
            r6 = this;
            r0 = r6
            javax.tools.JavaFileManager r0 = r0.fileManager
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            javax.tools.JavaFileObject r0 = r0.getJavaFileForOutput(r1, r2, r3, r4)
            r11 = r0
            r0 = r9
            javax.tools.JavaFileObject$Kind r1 = javax.tools.JavaFileObject.Kind.CLASS
            if (r0 == r1) goto L1a
            r0 = r11
            return r0
        L1a:
            r0 = r6
            lombok.javac.apt.LombokFileObjects$Compiler r0 = r0.compiler
            r1 = r11
            r2 = r8
            r3 = r6
            lombok.core.DiagnosticsReceiver r3 = r3.diagnostics
            javax.tools.JavaFileObject r0 = lombok.javac.apt.LombokFileObjects.createIntercepting(r0, r1, r2, r3)
            return r0
    }
}
