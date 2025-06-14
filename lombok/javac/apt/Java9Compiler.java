package lombok.javac.apt;

/* compiled from: Javac9Compiler.java */
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/apt/Java9Compiler.SCL.lombok */
class Java9Compiler implements lombok.javac.apt.LombokFileObjects.Compiler {
    private final com.sun.tools.javac.file.BaseFileManager fileManager;

    /* compiled from: Javac9Compiler.java */
    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/apt/Java9Compiler$FileManagerWrapper.SCL.lombok */
    static class FileManagerWrapper extends com.sun.tools.javac.file.BaseFileManager {
        javax.tools.JavaFileManager manager;

        public FileManagerWrapper(javax.tools.JavaFileManager r4) {
                r3 = this;
                r0 = r3
                r1 = 0
                r0.<init>(r1)
                r0 = r3
                r1 = r4
                r0.manager = r1
                return
        }

        public int isSupportedOption(java.lang.String r4) {
                r3 = this;
                r0 = r3
                javax.tools.JavaFileManager r0 = r0.manager
                r1 = r4
                int r0 = r0.isSupportedOption(r1)
                return r0
        }

        public java.lang.ClassLoader getClassLoader(javax.tools.JavaFileManager.Location r4) {
                r3 = this;
                r0 = r3
                javax.tools.JavaFileManager r0 = r0.manager
                r1 = r4
                java.lang.ClassLoader r0 = r0.getClassLoader(r1)
                return r0
        }

        public java.lang.Iterable<javax.tools.JavaFileObject> list(javax.tools.JavaFileManager.Location r7, java.lang.String r8, java.util.Set<javax.tools.JavaFileObject.Kind> r9, boolean r10) throws java.io.IOException {
                r6 = this;
                r0 = r6
                javax.tools.JavaFileManager r0 = r0.manager
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                java.lang.Iterable r0 = r0.list(r1, r2, r3, r4)
                return r0
        }

        public java.lang.String inferBinaryName(javax.tools.JavaFileManager.Location r5, javax.tools.JavaFileObject r6) {
                r4 = this;
                r0 = r4
                javax.tools.JavaFileManager r0 = r0.manager
                r1 = r5
                r2 = r6
                java.lang.String r0 = r0.inferBinaryName(r1, r2)
                return r0
        }

        public boolean isSameFile(javax.tools.FileObject r5, javax.tools.FileObject r6) {
                r4 = this;
                r0 = r4
                javax.tools.JavaFileManager r0 = r0.manager
                r1 = r5
                r2 = r6
                boolean r0 = r0.isSameFile(r1, r2)
                return r0
        }

        public boolean handleOption(java.lang.String r5, java.util.Iterator<java.lang.String> r6) {
                r4 = this;
                r0 = r4
                javax.tools.JavaFileManager r0 = r0.manager
                r1 = r5
                r2 = r6
                boolean r0 = r0.handleOption(r1, r2)
                return r0
        }

        public boolean hasLocation(javax.tools.JavaFileManager.Location r4) {
                r3 = this;
                r0 = r3
                javax.tools.JavaFileManager r0 = r0.manager
                r1 = r4
                boolean r0 = r0.hasLocation(r1)
                return r0
        }

        public javax.tools.JavaFileObject getJavaFileForInput(javax.tools.JavaFileManager.Location r6, java.lang.String r7, javax.tools.JavaFileObject.Kind r8) throws java.io.IOException {
                r5 = this;
                r0 = r5
                javax.tools.JavaFileManager r0 = r0.manager
                r1 = r6
                r2 = r7
                r3 = r8
                javax.tools.JavaFileObject r0 = r0.getJavaFileForInput(r1, r2, r3)
                return r0
        }

        public javax.tools.JavaFileObject getJavaFileForOutput(javax.tools.JavaFileManager.Location r7, java.lang.String r8, javax.tools.JavaFileObject.Kind r9, javax.tools.FileObject r10) throws java.io.IOException {
                r6 = this;
                r0 = r6
                javax.tools.JavaFileManager r0 = r0.manager
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                javax.tools.JavaFileObject r0 = r0.getJavaFileForOutput(r1, r2, r3, r4)
                return r0
        }

        public javax.tools.FileObject getFileForInput(javax.tools.JavaFileManager.Location r6, java.lang.String r7, java.lang.String r8) throws java.io.IOException {
                r5 = this;
                r0 = r5
                javax.tools.JavaFileManager r0 = r0.manager
                r1 = r6
                r2 = r7
                r3 = r8
                javax.tools.FileObject r0 = r0.getFileForInput(r1, r2, r3)
                return r0
        }

        public javax.tools.FileObject getFileForOutput(javax.tools.JavaFileManager.Location r7, java.lang.String r8, java.lang.String r9, javax.tools.FileObject r10) throws java.io.IOException {
                r6 = this;
                r0 = r6
                javax.tools.JavaFileManager r0 = r0.manager
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                javax.tools.FileObject r0 = r0.getFileForOutput(r1, r2, r3, r4)
                return r0
        }

        public void flush() throws java.io.IOException {
                r2 = this;
                r0 = r2
                javax.tools.JavaFileManager r0 = r0.manager
                r0.flush()
                return
        }

        public void close() throws java.io.IOException {
                r2 = this;
                r0 = r2
                javax.tools.JavaFileManager r0 = r0.manager
                r0.close()
                return
        }
    }

    public Java9Compiler(javax.tools.JavaFileManager r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            com.sun.tools.javac.file.BaseFileManager r1 = asBaseFileManager(r1)
            r0.fileManager = r1
            return
    }

    @Override // lombok.javac.apt.LombokFileObjects.Compiler
    public javax.tools.JavaFileObject wrap(lombok.javac.apt.LombokFileObject r7) {
            r6 = this;
            r0 = r7
            java.nio.file.Path r0 = toPath(r0)     // Catch: java.lang.Exception -> L8
            r8 = r0
            goto Lb
        L8:
            r0 = 0
            r8 = r0
        Lb:
            r0 = r8
            if (r0 == 0) goto L1d
            lombok.javac.apt.Javac9BaseFileObjectWrapper r0 = new lombok.javac.apt.Javac9BaseFileObjectWrapper
            r1 = r0
            r2 = r6
            com.sun.tools.javac.file.BaseFileManager r2 = r2.fileManager
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L1d:
            lombok.javac.apt.Javac9JavaFileObjectWrapper r0 = new lombok.javac.apt.Javac9JavaFileObjectWrapper
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            return r0
    }

    @Override // lombok.javac.apt.LombokFileObjects.Compiler
    public java.lang.reflect.Method getDecoderMethod() {
            r2 = this;
            r0 = 0
            return r0
    }

    private static java.nio.file.Path toPath(lombok.javac.apt.LombokFileObject r6) {
            r0 = r6
            java.net.URI r0 = r0.toUri()
            r7 = r0
            r0 = r7
            java.lang.String r0 = r0.getScheme()
            if (r0 != 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "file:///"
            r1.<init>(r2)
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.net.URI r0 = java.net.URI.create(r0)
            r7 = r0
        L22:
            r0 = r7
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0)     // Catch: java.lang.IllegalArgumentException -> L27
            return r0
        L27:
            r8 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Problems in URI '"
            r3.<init>(r4)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "' ("
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.net.URI r3 = r3.toUri()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ")"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r8
            r1.<init>(r2, r3)
            throw r0
    }

    private static com.sun.tools.javac.file.BaseFileManager asBaseFileManager(javax.tools.JavaFileManager r4) {
            r0 = r4
            boolean r0 = r0 instanceof com.sun.tools.javac.file.BaseFileManager
            if (r0 == 0) goto Lc
            r0 = r4
            com.sun.tools.javac.file.BaseFileManager r0 = (com.sun.tools.javac.file.BaseFileManager) r0
            return r0
        Lc:
            lombok.javac.apt.Java9Compiler$FileManagerWrapper r0 = new lombok.javac.apt.Java9Compiler$FileManagerWrapper
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
    }
}
