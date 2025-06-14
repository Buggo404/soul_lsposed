package lombok.delombok;

/* loaded from: com.usidqw.qwerklj.apk:lombok/delombok/DelombokApp.SCL.lombok */
public class DelombokApp extends lombok.core.LombokApp {


    public DelombokApp() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.core.LombokApp
    public int runApp(java.util.List<java.lang.String> r9) throws java.lang.Exception {
            r8 = this;
            java.lang.String r0 = "com.sun.tools.javac.main.JavaCompiler"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> Ld
            r0 = r8
            r1 = r9
            r0.runDirectly(r1)     // Catch: java.lang.ClassNotFoundException -> Ld
            r0 = 0
            return r0
        Ld:
            r0 = r9
            java.lang.Class r0 = loadDelombok(r0)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L19
            r0 = 1
            return r0
        L19:
            r0 = r9
            java.lang.Class r0 = loadDelombok(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L44
            java.lang.String r1 = "main"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L44
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L44
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L44
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L44
            r3 = r2
            r4 = 0
            r5 = r9
            r6 = 0
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L44
            java.lang.Object[] r5 = r5.toArray(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L44
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L44
            java.lang.Object r0 = lombok.permit.Permit.invoke(r0, r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L44
            goto L69
        L44:
            r11 = move-exception
            r0 = r11
            java.lang.Throwable r0 = r0.getCause()
            r12 = r0
            r0 = r12
            boolean r0 = r0 instanceof java.lang.Error
            if (r0 == 0) goto L59
            r0 = r12
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L59:
            r0 = r12
            boolean r0 = r0 instanceof java.lang.Exception
            if (r0 == 0) goto L67
            r0 = r12
            java.lang.Exception r0 = (java.lang.Exception) r0
            throw r0
        L67:
            r0 = r11
            throw r0
        L69:
            r0 = 0
            return r0
    }

    public static java.lang.Class<?> loadDelombok(java.util.List<java.lang.String> r7) throws java.lang.Exception {
            java.io.File r0 = findToolsJar()
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L95
            java.lang.String r0 = "/path/to/tools.jar"
            r9 = r0
            java.lang.String r0 = java.io.File.separator
            java.lang.String r1 = "\\"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L19
            java.lang.String r0 = "C:\\path\\to\\tools.jar"
            r9 = r0
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L6b
        L2c:
            r0 = r12
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r10
            int r0 = r0.length()
            if (r0 <= 0) goto L46
            r0 = r10
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
        L46:
            r0 = r11
            java.lang.String r1 = " "
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L64
            r0 = r10
            r1 = 34
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 34
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L6b
        L64:
            r0 = r10
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
        L6b:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2c
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Can't find tools.jar. Rerun delombok as: java -cp lombok.jar%1$s%2$s lombok.launch.Main delombok %3$s\n"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = java.io.File.pathSeparator
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            java.lang.String r5 = r5.toString()
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            r0 = 0
            return r0
        L95:
            java.util.jar.JarFile r0 = new java.util.jar.JarFile
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r9 = r0
            lombok.delombok.DelombokApp$1 r0 = new lombok.delombok.DelombokApp$1
            r1 = r0
            java.lang.Class<lombok.delombok.DelombokApp> r2 = lombok.delombok.DelombokApp.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r3 = r9
            r4 = r8
            r1.<init>(r2, r3, r4)
            r10 = r0
            r0 = r10
            java.lang.String r1 = "lombok.delombok.Delombok"
            java.lang.Class r0 = r0.loadClass(r1)
            return r0
    }

    private void runDirectly(java.util.List<java.lang.String> r4) {
            r3 = this;
            r0 = r4
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            lombok.delombok.Delombok.main(r0)
            return
    }

    private static java.io.File findToolsJar() {
            java.io.File r0 = findToolsJarViaRT()     // Catch: java.lang.Throwable -> La
            r2 = r0
            r0 = r2
            if (r0 == 0) goto Lb
            r0 = r2
            return r0
        La:
        Lb:
            java.io.File r0 = findToolsJarViaProperties()     // Catch: java.lang.Throwable -> L15
            r2 = r0
            r0 = r2
            if (r0 == 0) goto L16
            r0 = r2
            return r0
        L15:
        L16:
            java.io.File r0 = findToolsJarViaEnvironment()     // Catch: java.lang.Throwable -> L1c
            r2 = r0
            r0 = r2
            return r0
        L1c:
            r0 = 0
            return r0
    }

    private static java.io.File findToolsJarViaEnvironment() {
            java.util.Map r0 = java.lang.System.getenv()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
            goto L40
        L11:
            r0 = r5
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r4 = r0
            java.lang.String r0 = "JAVA_HOME"
            r1 = r4
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L40
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r4
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.<init>(r2)
            java.io.File r0 = extensiveCheckToolsJar(r0)
            return r0
        L40:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L11
            r0 = 0
            return r0
    }

    private static java.io.File findToolsJarViaProperties() {
            java.io.File r0 = new java.io.File
            r1 = r0
            java.lang.String r2 = "java.home"
            java.lang.String r3 = "."
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)
            r1.<init>(r2)
            r5 = r0
            r0 = r5
            java.io.File r0 = extensiveCheckToolsJar(r0)
            return r0
    }

    private static java.io.File extensiveCheckToolsJar(java.io.File r7) {
            r0 = r7
            java.io.File r0 = checkToolsJar(r0)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto Lb
            r0 = r8
            return r0
        Lb:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r7
            java.lang.String r3 = "lib"
            r1.<init>(r2, r3)
            java.io.File r0 = checkToolsJar(r0)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L20
            r0 = r8
            return r0
        L20:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r7
            java.io.File r2 = r2.getParentFile()
            java.lang.String r3 = "lib"
            r1.<init>(r2, r3)
            java.io.File r0 = checkToolsJar(r0)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L38
            r0 = r8
            return r0
        L38:
            java.io.File r0 = new java.io.File
            r1 = r0
            java.io.File r2 = new java.io.File
            r3 = r2
            r4 = r7
            java.lang.String r5 = "jdk"
            r3.<init>(r4, r5)
            java.lang.String r3 = "lib"
            r1.<init>(r2, r3)
            java.io.File r0 = checkToolsJar(r0)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L57
            r0 = r8
            return r0
        L57:
            r0 = 0
            return r0
    }

    private static java.io.File findToolsJarViaRT() {
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
            java.lang.String r1 = "java/lang/String.class"
            java.net.URL r0 = r0.getResource(r1)
            java.lang.String r0 = r0.toString()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "jar:file:"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L19
            r0 = 0
            return r0
        L19:
            r0 = r6
            java.lang.String r1 = "jar:file:"
            int r1 = r1.length()
            java.lang.String r0 = r0.substring(r1)
            r6 = r0
            r0 = r6
            r1 = 33
            int r0 = r0.indexOf(r1)
            r7 = r0
            r0 = r7
            r1 = -1
            if (r0 != r1) goto L32
            r0 = 0
            return r0
        L32:
            r0 = r6
            r1 = 0
            r2 = r7
            java.lang.String r0 = r0.substring(r1, r2)
            r6 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            java.io.File r0 = r0.getParentFile()
            java.io.File r0 = checkToolsJar(r0)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L4e
            r0 = r8
            return r0
        L4e:
            java.io.File r0 = new java.io.File
            r1 = r0
            java.io.File r2 = new java.io.File
            r3 = r2
            r4 = r6
            r3.<init>(r4)
            java.io.File r2 = r2.getParentFile()
            java.io.File r2 = r2.getParentFile()
            java.io.File r2 = r2.getParentFile()
            java.lang.String r3 = "lib"
            r1.<init>(r2, r3)
            java.io.File r0 = checkToolsJar(r0)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L73
            r0 = r8
            return r0
        L73:
            r0 = 0
            return r0
    }

    private static java.io.File checkToolsJar(java.io.File r5) {
            r0 = r5
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "tools.jar"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1d
            r0 = r5
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L1d
            r0 = r5
            boolean r0 = r0.canRead()
            if (r0 == 0) goto L1d
            r0 = r5
            return r0
        L1d:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r5
            java.lang.String r3 = "tools.jar"
            r1.<init>(r2, r3)
            r5 = r0
            r0 = r5
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "tools.jar"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            r0 = r5
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L46
            r0 = r5
            boolean r0 = r0.canRead()
            if (r0 == 0) goto L46
            r0 = r5
            return r0
        L46:
            r0 = 0
            return r0
    }

    @Override // lombok.core.LombokApp
    public java.lang.String getAppName() {
            r2 = this;
            java.lang.String r0 = "delombok"
            return r0
    }

    @Override // lombok.core.LombokApp
    public java.util.List<java.lang.String> getAppAliases() {
            r5 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "unlombok"
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    @Override // lombok.core.LombokApp
    public java.lang.String getAppDescription() {
            r2 = this;
            java.lang.String r0 = "Applies lombok transformations without compiling your\njava code (so, 'unpacks' lombok annotations and such)."
            return r0
    }
}
