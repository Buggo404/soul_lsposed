package lombok.javac.apt;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/apt/InterceptingJavaFileObject.SCL.lombok */
final class InterceptingJavaFileObject implements lombok.javac.apt.LombokFileObject {
    private final javax.tools.JavaFileObject delegate;
    private final java.lang.String fileName;
    private final lombok.core.DiagnosticsReceiver diagnostics;
    private final java.lang.reflect.Method decoderMethod;

    public InterceptingJavaFileObject(javax.tools.JavaFileObject r4, java.lang.String r5, lombok.core.DiagnosticsReceiver r6, java.lang.reflect.Method r7) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.delegate = r1
            r0 = r3
            r1 = r5
            r0.fileName = r1
            r0 = r3
            r1 = r6
            r0.diagnostics = r1
            r0 = r3
            r1 = r7
            r0.decoderMethod = r1
            return
    }

    public java.io.OutputStream openOutputStream() throws java.io.IOException {
            r4 = this;
            r0 = r4
            javax.tools.JavaFileObject r0 = r0.delegate
            java.io.OutputStream r0 = r0.openOutputStream()
            r1 = r4
            java.lang.String r1 = r1.fileName
            r2 = r4
            lombok.core.DiagnosticsReceiver r2 = r2.diagnostics
            java.io.OutputStream r0 = lombok.core.PostCompiler.wrapOutputStream(r0, r1, r2)
            return r0
    }

    public java.io.Writer openWriter() throws java.io.IOException {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Can't use a write for class files"
            r1.<init>(r2)
            throw r0
    }

    @Override // lombok.javac.apt.LombokFileObject
    public java.nio.charset.CharsetDecoder getDecoder(boolean r8) {
            r7 = this;
            r0 = r7
            java.lang.reflect.Method r0 = r0.decoderMethod
            if (r0 != 0) goto Lf
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
        Lf:
            r0 = r7
            java.lang.reflect.Method r0 = r0.decoderMethod
            r1 = r7
            javax.tools.JavaFileObject r1 = r1.delegate
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r3[r4] = r5
            java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
            java.nio.charset.CharsetDecoder r0 = (java.nio.charset.CharsetDecoder) r0
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof lombok.javac.apt.InterceptingJavaFileObject
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r4
            r1 = r3
            if (r0 != r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = r4
            lombok.javac.apt.InterceptingJavaFileObject r0 = (lombok.javac.apt.InterceptingJavaFileObject) r0
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.fileName
            r1 = r5
            java.lang.String r1 = r1.fileName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            r0 = r3
            javax.tools.JavaFileObject r0 = r0.delegate
            r1 = r5
            javax.tools.JavaFileObject r1 = r1.delegate
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            r0 = 1
            return r0
        L33:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.fileName
            int r0 = r0.hashCode()
            r1 = r3
            javax.tools.JavaFileObject r1 = r1.delegate
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public boolean delete() {
            r2 = this;
            r0 = r2
            javax.tools.JavaFileObject r0 = r0.delegate
            boolean r0 = r0.delete()
            return r0
    }

    public javax.lang.model.element.Modifier getAccessLevel() {
            r2 = this;
            r0 = r2
            javax.tools.JavaFileObject r0 = r0.delegate
            javax.lang.model.element.Modifier r0 = r0.getAccessLevel()
            return r0
    }

    public java.lang.CharSequence getCharContent(boolean r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            javax.tools.JavaFileObject r0 = r0.delegate
            r1 = r4
            java.lang.CharSequence r0 = r0.getCharContent(r1)
            return r0
    }

    public javax.tools.JavaFileObject.Kind getKind() {
            r2 = this;
            r0 = r2
            javax.tools.JavaFileObject r0 = r0.delegate
            javax.tools.JavaFileObject$Kind r0 = r0.getKind()
            return r0
    }

    public long getLastModified() {
            r3 = this;
            r0 = r3
            javax.tools.JavaFileObject r0 = r0.delegate
            long r0 = r0.getLastModified()
            return r0
    }

    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            javax.tools.JavaFileObject r0 = r0.delegate
            java.lang.String r0 = r0.getName()
            return r0
    }

    public javax.lang.model.element.NestingKind getNestingKind() {
            r2 = this;
            r0 = r2
            javax.tools.JavaFileObject r0 = r0.delegate
            javax.lang.model.element.NestingKind r0 = r0.getNestingKind()
            return r0
    }

    public boolean isNameCompatible(java.lang.String r5, javax.tools.JavaFileObject.Kind r6) {
            r4 = this;
            r0 = r4
            javax.tools.JavaFileObject r0 = r0.delegate
            r1 = r5
            r2 = r6
            boolean r0 = r0.isNameCompatible(r1, r2)
            return r0
    }

    public java.io.InputStream openInputStream() throws java.io.IOException {
            r2 = this;
            r0 = r2
            javax.tools.JavaFileObject r0 = r0.delegate
            java.io.InputStream r0 = r0.openInputStream()
            return r0
    }

    public java.io.Reader openReader(boolean r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            javax.tools.JavaFileObject r0 = r0.delegate
            r1 = r4
            java.io.Reader r0 = r0.openReader(r1)
            return r0
    }

    public java.net.URI toUri() {
            r2 = this;
            r0 = r2
            javax.tools.JavaFileObject r0 = r0.delegate
            java.net.URI r0 = r0.toUri()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            javax.tools.JavaFileObject r0 = r0.delegate
            java.lang.String r0 = r0.toString()
            return r0
    }
}
