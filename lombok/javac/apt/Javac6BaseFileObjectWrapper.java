package lombok.javac.apt;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/apt/Javac6BaseFileObjectWrapper.SCL.lombok */
class Javac6BaseFileObjectWrapper extends com.sun.tools.javac.util.BaseFileObject {
    private final lombok.javac.apt.LombokFileObject delegate;

    public Javac6BaseFileObjectWrapper(lombok.javac.apt.LombokFileObject r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.delegate = r1
            return
    }

    public boolean isNameCompatible(java.lang.String r5, javax.tools.JavaFileObject.Kind r6) {
            r4 = this;
            r0 = r4
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            r1 = r5
            r2 = r6
            boolean r0 = r0.isNameCompatible(r1, r2)
            return r0
    }

    public java.net.URI toUri() {
            r2 = this;
            r0 = r2
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            java.net.URI r0 = r0.toUri()
            return r0
    }

    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            java.lang.String r0 = r0.getName()
            return r0
    }

    public java.lang.CharSequence getCharContent(boolean r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            r1 = r4
            java.lang.CharSequence r0 = r0.getCharContent(r1)
            return r0
    }

    public java.io.InputStream openInputStream() throws java.io.IOException {
            r2 = this;
            r0 = r2
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            java.io.InputStream r0 = r0.openInputStream()
            return r0
    }

    public java.io.Reader openReader(boolean r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            r1 = r4
            java.io.Reader r0 = r0.openReader(r1)
            return r0
    }

    public java.io.Writer openWriter() throws java.io.IOException {
            r2 = this;
            r0 = r2
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            java.io.Writer r0 = r0.openWriter()
            return r0
    }

    public java.io.OutputStream openOutputStream() throws java.io.IOException {
            r2 = this;
            r0 = r2
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            java.io.OutputStream r0 = r0.openOutputStream()
            return r0
    }

    public long getLastModified() {
            r3 = this;
            r0 = r3
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            long r0 = r0.getLastModified()
            return r0
    }

    public boolean delete() {
            r2 = this;
            r0 = r2
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            boolean r0 = r0.delete()
            return r0
    }

    public javax.tools.JavaFileObject.Kind getKind() {
            r2 = this;
            r0 = r2
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            javax.tools.JavaFileObject$Kind r0 = r0.getKind()
            return r0
    }

    public javax.lang.model.element.NestingKind getNestingKind() {
            r2 = this;
            r0 = r2
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            javax.lang.model.element.NestingKind r0 = r0.getNestingKind()
            return r0
    }

    public javax.lang.model.element.Modifier getAccessLevel() {
            r2 = this;
            r0 = r2
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            javax.lang.model.element.Modifier r0 = r0.getAccessLevel()
            return r0
    }

    protected java.nio.charset.CharsetDecoder getDecoder(boolean r4) {
            r3 = this;
            r0 = r3
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            r1 = r4
            java.nio.charset.CharsetDecoder r0 = r0.getDecoder(r1)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof lombok.javac.apt.Javac6BaseFileObjectWrapper
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r3
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            r1 = r4
            lombok.javac.apt.Javac6BaseFileObjectWrapper r1 = (lombok.javac.apt.Javac6BaseFileObjectWrapper) r1
            lombok.javac.apt.LombokFileObject r1 = r1.delegate
            boolean r0 = r0.equals(r1)
            return r0
    }

    public int hashCode() {
            r2 = this;
            r0 = r2
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            lombok.javac.apt.LombokFileObject r0 = r0.delegate
            java.lang.String r0 = r0.toString()
            return r0
    }
}
