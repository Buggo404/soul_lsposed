package lombok.bytecode;

/* loaded from: com.usidqw.qwerklj.apk:lombok/bytecode/PoolConstantsApp.SCL.lombok */
public class PoolConstantsApp extends lombok.core.LombokApp {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/bytecode/PoolConstantsApp$CmdArgs.SCL.lombok */
    public static class CmdArgs {

        @com.zwitserloot.cmdreader.Mandatory
        @com.zwitserloot.cmdreader.Description("paths to class files to be printed. If a directory is named, all files (recursively) in that directory will be printed.")
        @com.zwitserloot.cmdreader.Sequential
        private java.util.List<java.lang.String> classFiles;

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
                r0.help = r1
                return
        }

        static /* synthetic */ java.util.List access$0(lombok.bytecode.PoolConstantsApp.CmdArgs r2) {
                r0 = r2
                java.util.List<java.lang.String> r0 = r0.classFiles
                return r0
        }
    }

    public PoolConstantsApp() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.core.LombokApp
    public java.lang.String getAppName() {
            r2 = this;
            java.lang.String r0 = "Xprintpool"
            return r0
    }

    @Override // lombok.core.LombokApp
    public java.lang.String getAppDescription() {
            r2 = this;
            java.lang.String r0 = "Prints the content of the constant pool to standard out."
            return r0
    }

    @Override // lombok.core.LombokApp
    public boolean isDebugTool() {
            r2 = this;
            r0 = 1
            return r0
    }

    @Override // lombok.core.LombokApp
    public int runApp(java.util.List<java.lang.String> r8) throws java.lang.Exception {
            r7 = this;
            java.lang.Class<lombok.bytecode.PoolConstantsApp$CmdArgs> r0 = lombok.bytecode.PoolConstantsApp.CmdArgs.class
            com.zwitserloot.cmdreader.CmdReader r0 = com.zwitserloot.cmdreader.CmdReader.m40of(r0)
            r9 = r0
            r0 = r9
            r1 = r8
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L30
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L30
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L30
            java.lang.Object r0 = r0.make(r1)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L30
            lombok.bytecode.PoolConstantsApp$CmdArgs r0 = (lombok.bytecode.PoolConstantsApp.CmdArgs) r0     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L30
            r10 = r0
            r0 = r10
            boolean r0 = r0.help     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L30
            if (r0 == 0) goto L4b
            java.io.PrintStream r0 = java.lang.System.out     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L30
            r1 = r9
            java.lang.String r2 = "java -jar lombok.jar -printpool"
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
            java.lang.String r2 = "java -jar lombok.jar -printpool"
            java.lang.String r1 = r1.generateCommandLineHelp(r2)
            r0.println(r1)
            r0 = 1
            return r0
        L4b:
            r0 = r10
            java.util.List r0 = lombok.bytecode.PoolConstantsApp.CmdArgs.access$0(r0)
            java.util.List r0 = lombok.bytecode.PostCompilerApp.cmdArgsToFiles(r0)
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r11
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto L66
            r0 = 1
            goto L67
        L66:
            r0 = 0
        L67:
            r13 = r0
            r0 = r11
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto Ldb
        L75:
            r0 = r15
            java.lang.Object r0 = r0.next()
            java.io.File r0 = (java.io.File) r0
            r14 = r0
            r0 = r14
            boolean r0 = r0.exists()
            if (r0 == 0) goto L91
            r0 = r14
            boolean r0 = r0.isFile()
            if (r0 != 0) goto La9
        L91:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Cannot find file '%s'\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r14
            java.lang.String r5 = r5.getAbsolutePath()
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            goto Ldb
        La9:
            int r12 = r12 + 1
            r0 = r13
            if (r0 == 0) goto Lc6
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Processing '%s'\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r14
            java.lang.String r5 = r5.getAbsolutePath()
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        Lc6:
            java.io.PrintStream r0 = java.lang.System.out
            lombok.bytecode.ClassFileMetaData r1 = new lombok.bytecode.ClassFileMetaData
            r2 = r1
            r3 = r14
            byte[] r3 = lombok.bytecode.PostCompilerApp.readFile(r3)
            r2.<init>(r3)
            java.lang.String r1 = r1.poolContent()
            r0.println(r1)
        Ldb:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L75
            r0 = r13
            if (r0 == 0) goto Lff
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Total files visited: %d\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r12
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        Lff:
            r0 = r12
            if (r0 != 0) goto L108
            r0 = 1
            goto L109
        L108:
            r0 = 0
        L109:
            return r0
    }
}
