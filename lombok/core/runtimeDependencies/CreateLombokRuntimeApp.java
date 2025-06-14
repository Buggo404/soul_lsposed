package lombok.core.runtimeDependencies;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/runtimeDependencies/CreateLombokRuntimeApp.SCL.lombok */
public class CreateLombokRuntimeApp extends lombok.core.LombokApp {
    private java.util.List<lombok.core.runtimeDependencies.RuntimeDependencyInfo> infoObjects;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/runtimeDependencies/CreateLombokRuntimeApp$CmdArgs.SCL.lombok */
    private static class CmdArgs {

        @com.zwitserloot.cmdreader.Description("Prints those lombok transformations that require lombok-runtime.jar.")
        @com.zwitserloot.cmdreader.Mandatory(onlyIfNot = {"create"})
        @com.zwitserloot.cmdreader.Shorthand({"p"})
        boolean print;

        @com.zwitserloot.cmdreader.Description("Creates the lombok-runtime.jar.")
        @com.zwitserloot.cmdreader.Mandatory(onlyIfNot = {"print"})
        @com.zwitserloot.cmdreader.Shorthand({"c"})
        boolean create;

        @com.zwitserloot.cmdreader.Requires({"create"})
        @com.zwitserloot.cmdreader.Description("Where to write the lombok-runtime.jar. Defaults to the current working directory.")
        @com.zwitserloot.cmdreader.Shorthand({"o"})
        java.lang.String output;

        @com.zwitserloot.cmdreader.Description("Shows this help text")
        boolean help;

        private CmdArgs() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/runtimeDependencies/CreateLombokRuntimeApp$Fail.SCL.lombok */
    private static class Fail extends java.lang.Exception {
        Fail(java.lang.String r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }
    }

    public CreateLombokRuntimeApp() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.core.LombokApp
    public java.lang.String getAppName() {
            r2 = this;
            java.lang.String r0 = "createRuntime"
            return r0
    }

    @Override // lombok.core.LombokApp
    public java.lang.String getAppDescription() {
            r2 = this;
            java.lang.String r0 = "Creates a small lombok-runtime.jar with the runtime\ndependencies of all lombok transformations that have them,\nand prints the names of each lombok transformation that\nrequires the lombok-runtime.jar at runtime."
            return r0
    }

    @Override // lombok.core.LombokApp
    public java.util.List<java.lang.String> getAppAliases() {
            r5 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "runtime"
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    @Override // lombok.core.LombokApp
    public int runApp(java.util.List<java.lang.String> r6) throws java.lang.Exception {
            r5 = this;
            java.lang.Class<lombok.core.runtimeDependencies.CreateLombokRuntimeApp$CmdArgs> r0 = lombok.core.runtimeDependencies.CreateLombokRuntimeApp.CmdArgs.class
            com.zwitserloot.cmdreader.CmdReader r0 = com.zwitserloot.cmdreader.CmdReader.m40of(r0)
            r7 = r0
            r0 = r7
            r1 = r6
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L1e
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L1e
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L1e
            java.lang.Object r0 = r0.make(r1)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L1e
            lombok.core.runtimeDependencies.CreateLombokRuntimeApp$CmdArgs r0 = (lombok.core.runtimeDependencies.CreateLombokRuntimeApp.CmdArgs) r0     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L1e
            r8 = r0
            goto L2f
        L1e:
            r9 = move-exception
            r0 = r5
            r1 = r7
            r2 = r9
            java.lang.String r2 = r2.getMessage()
            java.io.PrintStream r3 = java.lang.System.err
            r0.printHelp(r1, r2, r3)
            r0 = 1
            return r0
        L2f:
            r0 = r8
            boolean r0 = r0.help
            if (r0 == 0) goto L41
            r0 = r5
            r1 = r7
            r2 = 0
            java.io.PrintStream r3 = java.lang.System.out
            r0.printHelp(r1, r2, r3)
            r0 = 0
            return r0
        L41:
            r0 = r5
            r0.initializeInfoObjects()
            r0 = r8
            boolean r0 = r0.print
            if (r0 == 0) goto L50
            r0 = r5
            r0.printRuntimeDependents()
        L50:
            r0 = 0
            r9 = r0
            r0 = r8
            boolean r0 = r0.create
            if (r0 == 0) goto Lc1
            java.io.File r0 = new java.io.File
            r1 = r0
            java.lang.String r2 = "./lombok-runtime.jar"
            r1.<init>(r2)
            r10 = r0
            r0 = r8
            java.lang.String r0 = r0.output
            if (r0 == 0) goto L8e
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.output
            r1.<init>(r2)
            r10 = r0
            r0 = r10
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto L8e
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r10
            java.lang.String r3 = "lombok-runtime.jar"
            r1.<init>(r2, r3)
            r10 = r0
        L8e:
            r0 = r5
            r1 = r10
            int r0 = r0.writeRuntimeJar(r1)     // Catch: java.lang.Exception -> L99
            r9 = r0
            goto Lc1
        L99:
            r11 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "ERROR: Creating "
            r2.<init>(r3)
            r2 = r10
            java.lang.String r2 = canonical(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " failed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r11
            r0.printStackTrace()
            r0 = 1
            return r0
        Lc1:
            r0 = r9
            return r0
    }

    private void printRuntimeDependents() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            java.util.List<lombok.core.runtimeDependencies.RuntimeDependencyInfo> r0 = r0.infoObjects
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L2c
        L15:
            r0 = r6
            java.lang.Object r0 = r0.next()
            lombok.core.runtimeDependencies.RuntimeDependencyInfo r0 = (lombok.core.runtimeDependencies.RuntimeDependencyInfo) r0
            r5 = r0
            r0 = r4
            r1 = r5
            java.util.List r1 = r1.getRuntimeDependentsDescriptions()
            boolean r0 = r0.addAll(r1)
        L2c:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L15
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L49
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Not printing dependents: No lombok transformations currently have any runtime dependencies!"
            r0.println(r1)
            goto L75
        L49:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Using any of these lombok features means your app will need lombok-runtime.jar:"
            r0.println(r1)
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L6c
        L5b:
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r5
            r0.println(r1)
        L6c:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L5b
        L75:
            return
    }

    private int writeRuntimeJar(java.io.File r9) throws java.lang.Exception {
            r8 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r8
            java.util.List<lombok.core.runtimeDependencies.RuntimeDependencyInfo> r0 = r0.infoObjects
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L68
        L16:
            r0 = r12
            java.lang.Object r0 = r0.next()
            lombok.core.runtimeDependencies.RuntimeDependencyInfo r0 = (lombok.core.runtimeDependencies.RuntimeDependencyInfo) r0
            r11 = r0
            r0 = r11
            java.util.List r0 = r0.getRuntimeDependencies()
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L68
            r0 = r13
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto L5e
        L3a:
            r0 = r15
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r14 = r0
            r0 = r10
            r1 = r14
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L5e
            r0 = r10
            r1 = r14
            r2 = r11
            java.lang.Class r2 = r2.getClass()
            java.lang.Object r0 = r0.put(r1, r2)
        L5e:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L3a
        L68:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L16
            r0 = r10
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L85
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Not generating lombok-runtime.jar: No lombok transformations currently have any runtime dependencies!"
            r0.println(r1)
            r0 = 1
            return r0
        L85:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r11 = r0
            r0 = 0
            r12 = r0
            java.util.jar.JarOutputStream r0 = new java.util.jar.JarOutputStream     // Catch: java.lang.Throwable -> L17d
            r1 = r0
            r2 = r11
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17d
            r13 = r0
            r0 = r10
            java.lang.String r1 = "LICENSE"
            java.lang.Class<lombok.core.runtimeDependencies.CreateLombokRuntimeApp> r2 = lombok.core.runtimeDependencies.CreateLombokRuntimeApp.class
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L17d
            r0 = r10
            java.lang.String r1 = "AUTHORS"
            java.lang.Class<lombok.core.runtimeDependencies.CreateLombokRuntimeApp> r2 = lombok.core.runtimeDependencies.CreateLombokRuntimeApp.class
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L17d
            r0 = r10
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L17d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L17d
            r15 = r0
            goto L14e
        Lc1:
            r0 = r15
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L17d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L17d
            r14 = r0
            r0 = r14
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L17d
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L17d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17d
            r2 = r1
            java.lang.String r3 = "/"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L17d
            r2 = r14
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L17d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L17d
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L17d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L17d
            java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch: java.lang.Throwable -> L17d
            r16 = r0
            r0 = r16
            if (r0 != 0) goto L120
            lombok.core.runtimeDependencies.CreateLombokRuntimeApp$Fail r0 = new lombok.core.runtimeDependencies.CreateLombokRuntimeApp$Fail     // Catch: java.lang.Throwable -> L135 java.lang.Throwable -> L17d
            r1 = r0
            java.lang.String r2 = "Dependency %s contributed by %s cannot be found"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L135 java.lang.Throwable -> L17d
            r4 = r3
            r5 = 0
            r6 = r14
            java.lang.Object r6 = r6.getKey()     // Catch: java.lang.Throwable -> L135 java.lang.Throwable -> L17d
            r4[r5] = r6     // Catch: java.lang.Throwable -> L135 java.lang.Throwable -> L17d
            r4 = r3
            r5 = 1
            r6 = r14
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L135 java.lang.Throwable -> L17d
            r4[r5] = r6     // Catch: java.lang.Throwable -> L135 java.lang.Throwable -> L17d
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> L135 java.lang.Throwable -> L17d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L135 java.lang.Throwable -> L17d
            throw r0     // Catch: java.lang.Throwable -> L135 java.lang.Throwable -> L17d
        L120:
            r0 = r8
            r1 = r13
            r2 = r14
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L135 java.lang.Throwable -> L17d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L135 java.lang.Throwable -> L17d
            r3 = r16
            r0.writeIntoJar(r1, r2, r3)     // Catch: java.lang.Throwable -> L135 java.lang.Throwable -> L17d
            goto L144
        L135:
            r17 = move-exception
            r0 = r16
            if (r0 == 0) goto L141
            r0 = r16
            r0.close()     // Catch: java.lang.Throwable -> L17d
        L141:
            r0 = r17
            throw r0     // Catch: java.lang.Throwable -> L17d
        L144:
            r0 = r16
            if (r0 == 0) goto L14e
            r0 = r16
            r0.close()     // Catch: java.lang.Throwable -> L17d
        L14e:
            r0 = r15
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L17d
            if (r0 != 0) goto Lc1
            r0 = r13
            r0.close()     // Catch: java.lang.Throwable -> L17d
            r0 = r11
            r0.close()     // Catch: java.lang.Throwable -> L17d
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L17d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17d
            r2 = r1
            java.lang.String r3 = "Successfully created: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L17d
            r2 = r9
            java.lang.String r2 = canonical(r2)     // Catch: java.lang.Throwable -> L17d
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L17d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L17d
            r0.println(r1)     // Catch: java.lang.Throwable -> L17d
            r0 = 0
            return r0
        L17d:
            r13 = move-exception
            r0 = r11
            r0.close()     // Catch: java.lang.Throwable -> L186
            goto L187
        L186:
        L187:
            r0 = r12
            if (r0 != 0) goto L191
            r0 = r9
            boolean r0 = r0.delete()
        L191:
            r0 = r13
            boolean r0 = r0 instanceof lombok.core.runtimeDependencies.CreateLombokRuntimeApp.Fail
            if (r0 == 0) goto L1a6
            java.io.PrintStream r0 = java.lang.System.err
            r1 = r13
            java.lang.String r1 = r1.getMessage()
            r0.println(r1)
            r0 = 1
            return r0
        L1a6:
            r0 = r13
            boolean r0 = r0 instanceof java.lang.Exception
            if (r0 == 0) goto L1b4
            r0 = r13
            java.lang.Exception r0 = (java.lang.Exception) r0
            throw r0
        L1b4:
            r0 = r13
            boolean r0 = r0 instanceof java.lang.Error
            if (r0 == 0) goto L1c2
            r0 = r13
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L1c2:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            throw r0
    }

    private void writeIntoJar(java.util.jar.JarOutputStream r6, java.lang.String r7, java.io.InputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r6
            java.util.zip.ZipEntry r1 = new java.util.zip.ZipEntry
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.putNextEntry(r1)
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r0 = new byte[r0]
            r9 = r0
        L13:
            r0 = r8
            r1 = r9
            int r0 = r0.read(r1)
            r10 = r0
            r0 = r10
            r1 = -1
            if (r0 != r1) goto L24
            goto L30
        L24:
            r0 = r6
            r1 = r9
            r2 = 0
            r3 = r10
            r0.write(r1, r2, r3)
            goto L13
        L30:
            r0 = r6
            r0.closeEntry()
            r0 = r8
            r0.close()
            return
    }

    private void initializeInfoObjects() throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.lang.Class<lombok.core.runtimeDependencies.RuntimeDependencyInfo> r1 = lombok.core.runtimeDependencies.RuntimeDependencyInfo.class
            java.lang.Iterable r1 = lombok.core.SpiLoadUtil.findServices(r1)
            java.util.List r1 = lombok.core.SpiLoadUtil.readAllFromIterator(r1)
            r0.infoObjects = r1
            return
    }

    private static java.lang.String canonical(java.io.File r2) {
            r0 = r2
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = r2
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    private void printHelp(com.zwitserloot.cmdreader.CmdReader<lombok.core.runtimeDependencies.CreateLombokRuntimeApp.CmdArgs> r5, java.lang.String r6, java.io.PrintStream r7) {
            r4 = this;
            r0 = r6
            if (r0 == 0) goto L10
            r0 = r7
            r1 = r6
            r0.println(r1)
            r0 = r7
            java.lang.String r1 = "----------------------------"
            r0.println(r1)
        L10:
            r0 = r7
            r1 = r5
            java.lang.String r2 = "java -jar lombok.jar createRuntime"
            java.lang.String r1 = r1.generateCommandLineHelp(r2)
            r0.println(r1)
            return
    }
}
