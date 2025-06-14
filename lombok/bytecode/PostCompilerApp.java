package lombok.bytecode;

/* loaded from: com.usidqw.qwerklj.apk:lombok/bytecode/PostCompilerApp.SCL.lombok */
public class PostCompilerApp extends lombok.core.LombokApp {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/bytecode/PostCompilerApp$CmdArgs.SCL.lombok */
    public static class CmdArgs {

        @com.zwitserloot.cmdreader.Mandatory
        @com.zwitserloot.cmdreader.Description("paths to class files to be converted. If a directory is named, all files (recursively) in that directory will be converted.")
        @com.zwitserloot.cmdreader.Sequential
        private java.util.List<java.lang.String> classFiles;

        @com.zwitserloot.cmdreader.Description("Prints lots of status information as the post compiler runs")
        @com.zwitserloot.cmdreader.Shorthand({"v"})
        boolean verbose;

        @com.zwitserloot.cmdreader.Description("Shows this help text")
        @com.zwitserloot.cmdreader.Shorthand({"h", "?"})
        boolean help;

        public CmdArgs() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.classFiles = r1
                r0 = r4
                r1 = 0
                r0.verbose = r1
                r0 = r4
                r1 = 0
                r0.help = r1
                return
        }

        static /* synthetic */ java.util.List access$0(lombok.bytecode.PostCompilerApp.CmdArgs r2) {
                r0 = r2
                java.util.List<java.lang.String> r0 = r0.classFiles
                return r0
        }
    }

    public PostCompilerApp() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.core.LombokApp
    public java.util.List<java.lang.String> getAppAliases() {
            r5 = this;
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "post"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "postcompile"
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    @Override // lombok.core.LombokApp
    public java.lang.String getAppDescription() {
            r2 = this;
            java.lang.String r0 = "Runs registered post compiler handlers to against existing class files, modifying them in the process."
            return r0
    }

    @Override // lombok.core.LombokApp
    public java.lang.String getAppName() {
            r2 = this;
            java.lang.String r0 = "post-compile"
            return r0
    }

    @Override // lombok.core.LombokApp
    public int runApp(java.util.List<java.lang.String> r8) throws java.lang.Exception {
            r7 = this;
            java.lang.Class<lombok.bytecode.PostCompilerApp$CmdArgs> r0 = lombok.bytecode.PostCompilerApp.CmdArgs.class
            com.zwitserloot.cmdreader.CmdReader r0 = com.zwitserloot.cmdreader.CmdReader.m40of(r0)
            r9 = r0
            r0 = r9
            r1 = r8
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L30
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L30
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L30
            java.lang.Object r0 = r0.make(r1)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L30
            lombok.bytecode.PostCompilerApp$CmdArgs r0 = (lombok.bytecode.PostCompilerApp.CmdArgs) r0     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L30
            r10 = r0
            r0 = r10
            boolean r0 = r0.help     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L30
            if (r0 == 0) goto L4b
            java.io.PrintStream r0 = java.lang.System.out     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L30
            r1 = r9
            java.lang.String r2 = "java -jar lombok.jar post-compile"
            java.lang.String r1 = r1.generateCommandLineHelp(r2)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L30
            r0.println(r1)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L30
            r0 = 0
            return r0
        L30:
            r11 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            r1 = r11
            java.lang.String r1 = r1.getMessage()
            r0.println(r1)
            java.io.PrintStream r0 = java.lang.System.err
            r1 = r9
            java.lang.String r2 = "java -jar lombok.jar post-compile"
            java.lang.String r1 = r1.generateCommandLineHelp(r2)
            r0.println(r1)
            r0 = 1
            return r0
        L4b:
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r10
            java.util.List r0 = lombok.bytecode.PostCompilerApp.CmdArgs.access$0(r0)
            java.util.List r0 = cmdArgsToFiles(r0)
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L113
        L62:
            r0 = r14
            java.lang.Object r0 = r0.next()
            java.io.File r0 = (java.io.File) r0
            r13 = r0
            r0 = r13
            boolean r0 = r0.exists()
            if (r0 == 0) goto L7e
            r0 = r13
            boolean r0 = r0.isFile()
            if (r0 != 0) goto L93
        L7e:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Cannot find file '%s'\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r13
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            goto L113
        L93:
            int r11 = r11 + 1
            r0 = r10
            boolean r0 = r0.verbose
            if (r0 == 0) goto Lb7
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Processing "
            r2.<init>(r3)
            r2 = r13
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        Lb7:
            r0 = r13
            byte[] r0 = readFile(r0)
            r15 = r0
            r0 = r15
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            r16 = r0
            r0 = r16
            r1 = r13
            java.lang.String r1 = r1.toString()
            lombok.core.DiagnosticsReceiver r2 = lombok.core.DiagnosticsReceiver.CONSOLE
            byte[] r0 = lombok.core.PostCompiler.applyTransformations(r0, r1, r2)
            r17 = r0
            r0 = r16
            r1 = r17
            if (r0 == r1) goto L113
            r0 = r15
            r1 = r17
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L113
            int r12 = r12 + 1
            r0 = r10
            boolean r0 = r0.verbose
            if (r0 == 0) goto L10c
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Rewriting "
            r2.<init>(r3)
            r2 = r13
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L10c:
            r0 = r13
            r1 = r17
            writeFile(r0, r1)
        L113:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L62
            r0 = r10
            boolean r0 = r0.verbose
            if (r0 == 0) goto L141
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Total files visited: %d total files changed: %d\n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r11
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r12
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L141:
            r0 = r11
            if (r0 != 0) goto L14a
            r0 = 1
            goto L14b
        L14a:
            r0 = 0
        L14b:
            return r0
    }

    static java.util.List<java.io.File> cmdArgsToFiles(java.util.List<java.lang.String> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L21
        L12:
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            r0 = r4
            r1 = r5
            addFiles(r0, r1)
        L21:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L12
            r0 = r4
            return r0
    }

    static void addFiles(java.util.List<java.io.File> r4, java.lang.String r5) {
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto L18
            r0 = r4
            r1 = r6
            addRecursively(r0, r1)
            goto L20
        L18:
            r0 = r4
            r1 = r6
            boolean r0 = r0.add(r1)
        L20:
            return
    }

    static void addRecursively(java.util.List<java.io.File> r3, java.io.File r4) {
            r0 = r4
            java.io.File[] r0 = r0.listFiles()
            r1 = r0
            r8 = r1
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r6 = r0
            goto L3a
        Lf:
            r0 = r8
            r1 = r6
            r0 = r0[r1]
            r5 = r0
            r0 = r5
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto L23
            r0 = r3
            r1 = r5
            addRecursively(r0, r1)
            goto L37
        L23:
            r0 = r5
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = ".class"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L37
            r0 = r3
            r1 = r5
            boolean r0 = r0.add(r1)
        L37:
            int r6 = r6 + 1
        L3a:
            r0 = r6
            r1 = r7
            if (r0 < r1) goto Lf
            return
    }

    static byte[] readFile(java.io.File r5) throws java.io.IOException {
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            r6 = r0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = r0
            r1.<init>()
            r7 = r0
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r8 = r0
        L17:
            r0 = r8
            r1 = r6
            int r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L32
            r9 = r0
            r0 = r9
            r1 = -1
            if (r0 != r1) goto L27
            goto L3b
        L27:
            r0 = r7
            r1 = r6
            r2 = 0
            r3 = r9
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L32
            goto L17
        L32:
            r10 = move-exception
            r0 = r8
            r0.close()
            r0 = r10
            throw r0
        L3b:
            r0 = r8
            r0.close()
            r0 = r7
            byte[] r0 = r0.toByteArray()
            return r0
    }

    static void writeFile(java.io.File r4, byte[] r5) throws java.io.IOException {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r5
            r0.write(r1)     // Catch: java.lang.Throwable -> L11
            goto L18
        L11:
            r7 = move-exception
            r0 = r6
            r0.close()
            r0 = r7
            throw r0
        L18:
            r0 = r6
            r0.close()
            return
    }
}
