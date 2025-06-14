package lombok.eclipse.agent;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/MavenEcjBootstrapApp.SCL.lombok */
public class MavenEcjBootstrapApp extends lombok.core.LombokApp {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/MavenEcjBootstrapApp$CmdArgs.SCL.lombok */
    private static class CmdArgs {

        @com.zwitserloot.cmdreader.Description("Overwrite existing files. Defaults to false.")
        @com.zwitserloot.cmdreader.Shorthand({"w"})
        boolean overwrite;

        @com.zwitserloot.cmdreader.Description("The root of a Maven project. Defaults to the current working directory.")
        @com.zwitserloot.cmdreader.Shorthand({"o"})
        java.lang.String output;

        @com.zwitserloot.cmdreader.Description("Shows this help text")
        @com.zwitserloot.cmdreader.Shorthand({"h", "?"})
        boolean help;

        private CmdArgs() {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 0
                r0.overwrite = r1
                return
        }
    }

    public MavenEcjBootstrapApp() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.core.LombokApp
    public java.lang.String getAppName() {
            r2 = this;
            java.lang.String r0 = "createMavenECJBootstrap"
            return r0
    }

    @Override // lombok.core.LombokApp
    public java.lang.String getAppDescription() {
            r2 = this;
            java.lang.String r0 = "Creates .mvn/jvm.config and .mvn/lombok-bootstrap.jar for\nuse with the ECJ compiler."
            return r0
    }

    @Override // lombok.core.LombokApp
    public int runApp(java.util.List<java.lang.String> r6) throws java.lang.Exception {
            r5 = this;
            java.lang.Class<lombok.eclipse.agent.MavenEcjBootstrapApp$CmdArgs> r0 = lombok.eclipse.agent.MavenEcjBootstrapApp.CmdArgs.class
            com.zwitserloot.cmdreader.CmdReader r0 = com.zwitserloot.cmdreader.CmdReader.m40of(r0)
            r7 = r0
            r0 = r7
            r1 = r6
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L1e
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L1e
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L1e
            java.lang.Object r0 = r0.make(r1)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L1e
            lombok.eclipse.agent.MavenEcjBootstrapApp$CmdArgs r0 = (lombok.eclipse.agent.MavenEcjBootstrapApp.CmdArgs) r0     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L1e
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
            r1 = r8
            java.lang.String r1 = r1.output
            r2 = r8
            boolean r2 = r2.overwrite
            int r0 = r0.createBootstrap(r1, r2)
            return r0
    }

    private int createBootstrap(java.lang.String r6, boolean r7) {
            r5 = this;
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r6
            java.lang.String r3 = ".mvn"
            r1.<init>(r2, r3)
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L1a
            r0 = r5
            r1 = r8
            int r0 = r0.makeMvn(r1)
            r9 = r0
        L1a:
            r0 = r9
            if (r0 != 0) goto L27
            r0 = r5
            r1 = r8
            r2 = r7
            int r0 = r0.makeJvmConfig(r1, r2)
            r9 = r0
        L27:
            r0 = r9
            if (r0 != 0) goto L34
            r0 = r5
            r1 = r8
            r2 = r7
            int r0 = r0.makeJar(r1, r2)
            r9 = r0
        L34:
            r0 = r9
            return r0
    }

    private int makeMvn(java.io.File r6) {
            r5 = this;
            r0 = 0
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r6
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L17
            if (r0 != 0) goto L1e
            r0 = r6
            boolean r0 = r0.mkdirs()     // Catch: java.lang.Exception -> L17
            if (r0 != 0) goto L1e
            r0 = 1
            r7 = r0
            goto L1e
        L17:
            r9 = move-exception
            r0 = 1
            r7 = r0
            r0 = r9
            r8 = r0
        L1e:
            r0 = r7
            if (r0 == 0) goto L46
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Could not create "
            r2.<init>(r3)
            r2 = r6
            java.lang.String r2 = r2.getPath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r8
            if (r0 == 0) goto L46
            r0 = r8
            java.io.PrintStream r1 = java.lang.System.err
            r0.printStackTrace(r1)
        L46:
            r0 = r7
            return r0
    }

    private int makeJvmConfig(java.io.File r6, boolean r7) {
            r5 = this;
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r6
            java.lang.String r3 = "jvm.config"
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r8
            boolean r0 = r0.exists()
            if (r0 == 0) goto L34
            r0 = r7
            if (r0 != 0) goto L34
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r8
            java.lang.String r3 = canonical(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = " exists but '-w' not specified."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = 1
            return r0
        L34:
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch: java.lang.Exception -> L6a
            r1 = r0
            r2 = r8
            r1.<init>(r2)     // Catch: java.lang.Exception -> L6a
            r9 = r0
            r0 = r9
            java.lang.String r1 = "-javaagent:.mvn/lombok-bootstrap.jar"
            r0.write(r1)     // Catch: java.lang.Exception -> L6a
            r0 = r9
            r0.flush()     // Catch: java.lang.Exception -> L6a
            r0 = r9
            r0.close()     // Catch: java.lang.Exception -> L6a
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Exception -> L6a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6a
            r2 = r1
            java.lang.String r3 = "Successfully created: "
            r2.<init>(r3)     // Catch: java.lang.Exception -> L6a
            r2 = r8
            java.lang.String r2 = canonical(r2)     // Catch: java.lang.Exception -> L6a
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L6a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L6a
            r0.println(r1)     // Catch: java.lang.Exception -> L6a
            r0 = 0
            return r0
        L6a:
            r9 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Could not create: "
            r2.<init>(r3)
            r2 = r8
            java.lang.String r2 = canonical(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r9
            java.io.PrintStream r1 = java.lang.System.err
            r0.printStackTrace(r1)
            r0 = 1
            return r0
    }

    private int makeJar(java.io.File r6, boolean r7) {
            r5 = this;
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r6
            java.lang.String r3 = "lombok-bootstrap.jar"
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r8
            boolean r0 = r0.exists()
            if (r0 == 0) goto L34
            r0 = r7
            if (r0 != 0) goto L34
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r8
            java.lang.String r3 = canonical(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = " but '-w' not specified."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = 1
            return r0
        L34:
            java.lang.Class<lombok.eclipse.agent.MavenEcjBootstrapApp> r0 = lombok.eclipse.agent.MavenEcjBootstrapApp.class
            java.lang.String r1 = "/lombok/launch/mavenEcjBootstrapAgent.jar"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch: java.lang.Exception -> La4
            r9 = r0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> La4
            r1 = r0
            r2 = r8
            r1.<init>(r2)     // Catch: java.lang.Exception -> La4
            r10 = r0
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> La4
            r11 = r0
            goto L5b
        L51:
            r0 = r10
            r1 = r11
            r2 = 0
            r3 = r12
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> La4
        L5b:
            r0 = r9
            r1 = r11
            int r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> La4
            r1 = r0
            r12 = r1
            if (r0 > 0) goto L51
            r0 = r10
            r0.flush()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> La4
            r0 = r10
            r0.close()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> La4
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> La4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> La4
            r2 = r1
            java.lang.String r3 = "Successfully created: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> La4
            r2 = r8
            java.lang.String r2 = canonical(r2)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> La4
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> La4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> La4
            r0.println(r1)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> La4
            r0 = r10
            r0.close()     // Catch: java.lang.Exception -> L93 java.lang.Exception -> La4
            goto L94
        L93:
        L94:
            r0 = 0
            return r0
        L96:
            r13 = move-exception
            r0 = r10
            r0.close()     // Catch: java.lang.Exception -> La0 java.lang.Exception -> La4
            goto La1
        La0:
        La1:
            r0 = r13
            throw r0     // Catch: java.lang.Exception -> La4
        La4:
            r9 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Could not create: "
            r2.<init>(r3)
            r2 = r8
            java.lang.String r2 = canonical(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r9
            java.io.PrintStream r1 = java.lang.System.err
            r0.printStackTrace(r1)
            r0 = 1
            return r0
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

    private void printHelp(com.zwitserloot.cmdreader.CmdReader<lombok.eclipse.agent.MavenEcjBootstrapApp.CmdArgs> r5, java.lang.String r6, java.io.PrintStream r7) {
            r4 = this;
            r0 = r6
            if (r0 == 0) goto Lf
            r0 = r7
            r1 = r6
            r0.println(r1)
            r0 = r7
            java.lang.String r1 = "----------------------------"
            r0.println(r1)
        Lf:
            r0 = r7
            r1 = r5
            java.lang.String r2 = "java -jar lombok.jar createMavenECJBootstrap"
            java.lang.String r1 = r1.generateCommandLineHelp(r2)
            r0.println(r1)
            return
    }
}
