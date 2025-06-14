package lombok.delombok.ant;

/* compiled from: DelombokTask.java */
/* loaded from: classes.dex */
class Tasks {

    /* compiled from: DelombokTask.java */
    public static class Delombok extends org.apache.tools.ant.Task {
        private static java.lang.ClassLoader shadowLoader;
        private org.apache.tools.ant.types.Path classpath;
        private java.lang.String encoding;
        private java.util.List<lombok.delombok.ant.Tasks.Format> formatOptions;
        private java.io.File fromDir;
        private org.apache.tools.ant.types.Path modulepath;
        private org.apache.tools.ant.types.Path path;
        private org.apache.tools.ant.types.Path sourcepath;
        private java.io.File toDir;
        private boolean verbose;

        public Delombok() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.formatOptions = r0
                return
        }

        public static java.lang.Class<?> shadowLoadClass(java.lang.String r5) {
                java.lang.ClassLoader r0 = lombok.delombok.ant.Tasks.Delombok.shadowLoader     // Catch: java.lang.Throwable -> L37
                r1 = 1
                if (r0 != 0) goto L30
                java.lang.String r0 = "lombok.core.LombokNode"
                java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L13 java.lang.Throwable -> L37
                java.lang.Class<lombok.delombok.ant.Tasks$Delombok> r0 = lombok.delombok.ant.Tasks.Delombok.class
                java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L13 java.lang.Throwable -> L37
                lombok.delombok.ant.Tasks.Delombok.shadowLoader = r0     // Catch: java.lang.ClassNotFoundException -> L13 java.lang.Throwable -> L37
                goto L30
            L13:
                java.lang.String r0 = "lombok.launch.Main"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L37
                java.lang.String r2 = "getShadowClassLoader"
                r3 = 0
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L37
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L37
                r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L37
                java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L37
                r3 = 0
                java.lang.Object r0 = r0.invoke(r3, r2)     // Catch: java.lang.Throwable -> L37
                java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch: java.lang.Throwable -> L37
                lombok.delombok.ant.Tasks.Delombok.shadowLoader = r0     // Catch: java.lang.Throwable -> L37
            L30:
                java.lang.ClassLoader r0 = lombok.delombok.ant.Tasks.Delombok.shadowLoader     // Catch: java.lang.Throwable -> L37
                java.lang.Class r5 = java.lang.Class.forName(r5, r1, r0)     // Catch: java.lang.Throwable -> L37
                return r5
            L37:
                r5 = move-exception
                boolean r0 = r5 instanceof java.lang.reflect.InvocationTargetException
                if (r0 == 0) goto L40
                java.lang.Throwable r5 = r5.getCause()
            L40:
                boolean r0 = r5 instanceof java.lang.RuntimeException
                if (r0 != 0) goto L51
                boolean r0 = r5 instanceof java.lang.Error
                if (r0 == 0) goto L4b
                java.lang.Error r5 = (java.lang.Error) r5
                throw r5
            L4b:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r5)
                throw r0
            L51:
                java.lang.RuntimeException r5 = (java.lang.RuntimeException) r5
                throw r5
        }

        public void addFileset(org.apache.tools.ant.types.FileSet r3) {
                r2 = this;
                org.apache.tools.ant.types.Path r0 = r2.path
                if (r0 != 0) goto Lf
                org.apache.tools.ant.types.Path r0 = new org.apache.tools.ant.types.Path
                org.apache.tools.ant.Project r1 = r2.getProject()
                r0.<init>(r1)
                r2.path = r0
            Lf:
                org.apache.tools.ant.types.Path r0 = r2.path
                r0.add(r3)
                return
        }

        public void addFormat(lombok.delombok.ant.Tasks.Format r2) {
                r1 = this;
                java.util.List<lombok.delombok.ant.Tasks$Format> r0 = r1.formatOptions
                r0.add(r2)
                return
        }

        public org.apache.tools.ant.types.Path createClasspath() {
                r2 = this;
                org.apache.tools.ant.types.Path r0 = r2.classpath
                if (r0 != 0) goto Lf
                org.apache.tools.ant.types.Path r0 = new org.apache.tools.ant.types.Path
                org.apache.tools.ant.Project r1 = r2.getProject()
                r0.<init>(r1)
                r2.classpath = r0
            Lf:
                org.apache.tools.ant.types.Path r0 = r2.classpath
                org.apache.tools.ant.types.Path r0 = r0.createPath()
                return r0
        }

        public org.apache.tools.ant.types.Path createModulepath() {
                r2 = this;
                org.apache.tools.ant.types.Path r0 = r2.modulepath
                if (r0 != 0) goto Lf
                org.apache.tools.ant.types.Path r0 = new org.apache.tools.ant.types.Path
                org.apache.tools.ant.Project r1 = r2.getProject()
                r0.<init>(r1)
                r2.modulepath = r0
            Lf:
                org.apache.tools.ant.types.Path r0 = r2.modulepath
                org.apache.tools.ant.types.Path r0 = r0.createPath()
                return r0
        }

        public org.apache.tools.ant.types.Path createSourcepath() {
                r2 = this;
                org.apache.tools.ant.types.Path r0 = r2.sourcepath
                if (r0 != 0) goto Lf
                org.apache.tools.ant.types.Path r0 = new org.apache.tools.ant.types.Path
                org.apache.tools.ant.Project r1 = r2.getProject()
                r0.<init>(r1)
                r2.sourcepath = r0
            Lf:
                org.apache.tools.ant.types.Path r0 = r2.sourcepath
                org.apache.tools.ant.types.Path r0 = r0.createPath()
                return r0
        }

        public void execute() throws org.apache.tools.ant.BuildException {
                r11 = this;
                org.apache.tools.ant.Location r0 = r11.getLocation()
                java.lang.String r1 = "lombok.delombok.ant.DelombokTaskImpl"
                java.lang.Class r1 = shadowLoadClass(r1)     // Catch: java.lang.Throwable -> La6
                r2 = 0
                java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> La6
                java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch: java.lang.Throwable -> La6
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La6
                java.lang.Object r1 = r1.newInstance(r3)     // Catch: java.lang.Throwable -> La6
                java.lang.Class r3 = r11.getClass()     // Catch: java.lang.Throwable -> La6
                java.lang.reflect.Field[] r3 = r3.getDeclaredFields()     // Catch: java.lang.Throwable -> La6
                int r4 = r3.length     // Catch: java.lang.Throwable -> La6
                r5 = r2
            L21:
                r6 = 1
                if (r5 < r4) goto L3c
                java.lang.Class r3 = r1.getClass()     // Catch: java.lang.Throwable -> La6
                java.lang.String r4 = "execute"
                java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> La6
                java.lang.Class<org.apache.tools.ant.Location> r7 = org.apache.tools.ant.Location.class
                r5[r2] = r7     // Catch: java.lang.Throwable -> La6
                java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.Throwable -> La6
                java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> La6
                r4[r2] = r0     // Catch: java.lang.Throwable -> La6
                r3.invoke(r1, r4)     // Catch: java.lang.Throwable -> La6
                return
            L3c:
                r7 = r3[r5]     // Catch: java.lang.Throwable -> La6
                boolean r8 = r7.isSynthetic()     // Catch: java.lang.Throwable -> La6
                if (r8 != 0) goto La2
                int r8 = r7.getModifiers()     // Catch: java.lang.Throwable -> La6
                boolean r8 = java.lang.reflect.Modifier.isStatic(r8)     // Catch: java.lang.Throwable -> La6
                if (r8 == 0) goto L4f
                goto La2
            L4f:
                java.lang.Class r8 = r1.getClass()     // Catch: java.lang.Throwable -> La6
                java.lang.String r9 = r7.getName()     // Catch: java.lang.Throwable -> La6
                java.lang.reflect.Field r8 = r8.getDeclaredField(r9)     // Catch: java.lang.Throwable -> La6
                r8.setAccessible(r6)     // Catch: java.lang.Throwable -> La6
                java.lang.String r6 = r7.getName()     // Catch: java.lang.Throwable -> La6
                java.lang.String r9 = "formatOptions"
                boolean r6 = r6.equals(r9)     // Catch: java.lang.Throwable -> La6
                if (r6 == 0) goto L9b
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La6
                r6.<init>()     // Catch: java.lang.Throwable -> La6
                java.util.List<lombok.delombok.ant.Tasks$Format> r7 = r11.formatOptions     // Catch: java.lang.Throwable -> La6
                java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> La6
            L75:
                boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> La6
                if (r9 != 0) goto L7f
                r8.set(r1, r6)     // Catch: java.lang.Throwable -> La6
                goto La2
            L7f:
                java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> La6
                lombok.delombok.ant.Tasks$Format r9 = (lombok.delombok.ant.Tasks.Format) r9     // Catch: java.lang.Throwable -> La6
                java.lang.String r10 = r9.getValue()     // Catch: java.lang.Throwable -> La6
                if (r10 == 0) goto L93
                java.lang.String r9 = r9.getValue()     // Catch: java.lang.Throwable -> La6
                r6.add(r9)     // Catch: java.lang.Throwable -> La6
                goto L75
            L93:
                org.apache.tools.ant.BuildException r0 = new org.apache.tools.ant.BuildException     // Catch: java.lang.Throwable -> La6
                java.lang.String r1 = "'value' property required for <format>"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> La6
                throw r0     // Catch: java.lang.Throwable -> La6
            L9b:
                java.lang.Object r6 = r7.get(r11)     // Catch: java.lang.Throwable -> La6
                r8.set(r1, r6)     // Catch: java.lang.Throwable -> La6
            La2:
                int r5 = r5 + 1
                goto L21
            La6:
                r0 = move-exception
                boolean r1 = r0 instanceof java.lang.reflect.InvocationTargetException
                if (r1 == 0) goto Laf
                java.lang.Throwable r0 = r0.getCause()
            Laf:
                boolean r1 = r0 instanceof java.lang.RuntimeException
                if (r1 != 0) goto Lc0
                boolean r1 = r0 instanceof java.lang.Error
                if (r1 == 0) goto Lba
                java.lang.Error r0 = (java.lang.Error) r0
                throw r0
            Lba:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            Lc0:
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
                throw r0
        }

        public void setClasspath(org.apache.tools.ant.types.Path r2) {
                r1 = this;
                org.apache.tools.ant.types.Path r0 = r1.classpath
                if (r0 != 0) goto L7
                r1.classpath = r2
                goto La
            L7:
                r0.append(r2)
            La:
                return
        }

        public void setClasspathRef(org.apache.tools.ant.types.Reference r2) {
                r1 = this;
                org.apache.tools.ant.types.Path r0 = r1.createClasspath()
                r0.setRefid(r2)
                return
        }

        public void setEncoding(java.lang.String r1) {
                r0 = this;
                r0.encoding = r1
                return
        }

        public void setFrom(java.io.File r1) {
                r0 = this;
                r0.fromDir = r1
                return
        }

        public void setModulepath(org.apache.tools.ant.types.Path r2) {
                r1 = this;
                org.apache.tools.ant.types.Path r0 = r1.modulepath
                if (r0 != 0) goto L7
                r1.modulepath = r2
                goto La
            L7:
                r0.append(r2)
            La:
                return
        }

        public void setModulepathRef(org.apache.tools.ant.types.Reference r2) {
                r1 = this;
                org.apache.tools.ant.types.Path r0 = r1.createModulepath()
                r0.setRefid(r2)
                return
        }

        public void setSourcepath(org.apache.tools.ant.types.Path r2) {
                r1 = this;
                org.apache.tools.ant.types.Path r0 = r1.sourcepath
                if (r0 != 0) goto L7
                r1.sourcepath = r2
                goto La
            L7:
                r0.append(r2)
            La:
                return
        }

        public void setSourcepathRef(org.apache.tools.ant.types.Reference r2) {
                r1 = this;
                org.apache.tools.ant.types.Path r0 = r1.createSourcepath()
                r0.setRefid(r2)
                return
        }

        public void setTo(java.io.File r1) {
                r0 = this;
                r0.toDir = r1
                return
        }

        public void setVerbose(boolean r1) {
                r0 = this;
                r0.verbose = r1
                return
        }
    }

    /* compiled from: DelombokTask.java */
    public static class Format {
        private java.lang.String value;

        public Format() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                lombok.delombok.ant.Tasks$Format r5 = (lombok.delombok.ant.Tasks.Format) r5
                java.lang.String r2 = r4.value
                if (r2 != 0) goto L1e
                java.lang.String r5 = r5.value
                if (r5 == 0) goto L27
                return r1
            L1e:
                java.lang.String r5 = r5.value
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L27
                return r1
            L27:
                return r0
        }

        public java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.value
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.hashCode()
            La:
                r1 = 31
                int r1 = r1 + r0
                return r1
        }

        public void setValue(java.lang.String r1) {
                r0 = this;
                r0.value = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "FormatOption [value="
                r0.<init>(r1)
                java.lang.String r1 = r2.value
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "]"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    Tasks() {
            r0 = this;
            r0.<init>()
            return
    }
}
