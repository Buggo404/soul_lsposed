package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationApp.SCL.lombok */
public class ConfigurationApp extends lombok.core.LombokApp {
    private static final java.net.URI NO_CONFIG = null;
    private java.io.PrintStream out;
    private java.io.PrintStream err;
    private static final lombok.core.configuration.ConfigurationProblemReporter VOID = null;





    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationApp$CmdArgs.SCL.lombok */
    public static class CmdArgs {

        @com.zwitserloot.cmdreader.Mandatory(onlyIfNot = {"help", "generate"})
        @com.zwitserloot.cmdreader.Description("Paths to java files or directories the configuration is to be printed for.")
        @com.zwitserloot.cmdreader.Sequential
        private java.util.List<java.lang.String> paths;

        @com.zwitserloot.cmdreader.Excludes({"paths"})
        @com.zwitserloot.cmdreader.Description("Generates a list containing all the available configuration parameters. Add --verbose to print more information.")
        @com.zwitserloot.cmdreader.Shorthand({"g"})
        boolean generate;

        @com.zwitserloot.cmdreader.Description("Displays more information.")
        @com.zwitserloot.cmdreader.Shorthand({"v"})
        boolean verbose;

        @com.zwitserloot.cmdreader.Requires({"verbose"})
        @com.zwitserloot.cmdreader.Description("Also display files that don't mention the key.")
        @com.zwitserloot.cmdreader.Shorthand({"n"})
        @com.zwitserloot.cmdreader.FullName("not-mentioned")
        boolean notMentioned;

        @com.zwitserloot.cmdreader.Description("Limit the result to these keys.")
        @com.zwitserloot.cmdreader.Shorthand({"k"})
        private java.util.List<java.lang.String> key;

        @com.zwitserloot.cmdreader.Description("Shows this help text.")
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
                r0.paths = r1
                r0 = r4
                r1 = 0
                r0.generate = r1
                r0 = r4
                r1 = 0
                r0.verbose = r1
                r0 = r4
                r1 = 0
                r0.notMentioned = r1
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.key = r1
                r0 = r4
                r1 = 0
                r0.help = r1
                return
        }

        static /* synthetic */ java.util.List access$0(lombok.core.configuration.ConfigurationApp.CmdArgs r2) {
                r0 = r2
                java.util.List<java.lang.String> r0 = r0.key
                return r0
        }

        static /* synthetic */ java.util.List access$1(lombok.core.configuration.ConfigurationApp.CmdArgs r2) {
                r0 = r2
                java.util.List<java.lang.String> r0 = r0.paths
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationApp$Source.SCL.lombok */
    private static final class Source {
        final lombok.core.configuration.ConfigurationFile file;
        final java.lang.String description;

        Source(lombok.core.configuration.ConfigurationFile r4, java.lang.String r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.file = r1
                r0 = r3
                r1 = r5
                r0.description = r1
                return
        }
    }

    static {
            java.lang.String r0 = ""
            java.net.URI r0 = java.net.URI.create(r0)
            lombok.core.configuration.ConfigurationApp.NO_CONFIG = r0
            lombok.core.configuration.ConfigurationApp$1 r0 = new lombok.core.configuration.ConfigurationApp$1
            r1 = r0
            r1.<init>()
            lombok.core.configuration.ConfigurationApp.VOID = r0
            return
    }

    public ConfigurationApp() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            java.io.PrintStream r1 = java.lang.System.out
            r0.out = r1
            r0 = r3
            java.io.PrintStream r1 = java.lang.System.err
            r0.err = r1
            return
    }

    @Override // lombok.core.LombokApp
    public java.lang.String getAppName() {
            r2 = this;
            java.lang.String r0 = "config"
            return r0
    }

    @Override // lombok.core.LombokApp
    public java.lang.String getAppDescription() {
            r2 = this;
            java.lang.String r0 = "Prints the configurations for the provided paths to standard out."
            return r0
    }

    @Override // lombok.core.LombokApp
    public java.util.List<java.lang.String> getAppAliases() {
            r5 = this;
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "configuration"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "config"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "conf"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "settings"
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    @Override // lombok.core.LombokApp
    public int runApp(java.util.List<java.lang.String> r8) throws java.lang.Exception {
            r7 = this;
            java.lang.Class<lombok.core.configuration.ConfigurationApp$CmdArgs> r0 = lombok.core.configuration.ConfigurationApp.CmdArgs.class
            com.zwitserloot.cmdreader.CmdReader r0 = com.zwitserloot.cmdreader.CmdReader.m40of(r0)
            r9 = r0
            r0 = r9
            r1 = r8
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L31
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L31
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L31
            java.lang.Object r0 = r0.make(r1)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L31
            lombok.core.configuration.ConfigurationApp$CmdArgs r0 = (lombok.core.configuration.ConfigurationApp.CmdArgs) r0     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L31
            r10 = r0
            r0 = r10
            boolean r0 = r0.help     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L31
            if (r0 == 0) goto L4e
            r0 = r7
            java.io.PrintStream r0 = r0.out     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L31
            r1 = r9
            java.lang.String r2 = "java -jar lombok.jar configuration"
            java.lang.String r1 = r1.generateCommandLineHelp(r2)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L31
            r0.println(r1)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L31
            r0 = 0
            return r0
        L31:
            r11 = move-exception
            r0 = r7
            java.io.PrintStream r0 = r0.err
            r1 = r11
            java.lang.String r1 = r1.getMessage()
            r0.println(r1)
            r0 = r7
            java.io.PrintStream r0 = r0.err
            r1 = r9
            java.lang.String r2 = "java -jar lombok.jar configuration"
            java.lang.String r1 = r1.generateCommandLineHelp(r2)
            r0.println(r1)
            r0 = 1
            return r0
        L4e:
            lombok.core.configuration.ConfigurationKeysLoader.LoaderLoader.loadAllConfigurationKeys()
            r0 = r7
            r1 = r10
            java.util.List r1 = lombok.core.configuration.ConfigurationApp.CmdArgs.access$0(r1)
            java.util.Collection r0 = r0.checkKeys(r1)
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L62
            r0 = 1
            return r0
        L62:
            r0 = r10
            boolean r0 = r0.verbose
            r12 = r0
            r0 = r10
            boolean r0 = r0.generate
            if (r0 == 0) goto L89
            r0 = r7
            r1 = r11
            r2 = r12
            r3 = r10
            java.util.List r3 = lombok.core.configuration.ConfigurationApp.CmdArgs.access$0(r3)
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L84
            r3 = 0
            goto L85
        L84:
            r3 = 1
        L85:
            int r0 = r0.generate(r1, r2, r3)
            return r0
        L89:
            r0 = r7
            r1 = r11
            r2 = r12
            r3 = r10
            java.util.List r3 = lombok.core.configuration.ConfigurationApp.CmdArgs.access$1(r3)
            r4 = r10
            java.util.List r4 = lombok.core.configuration.ConfigurationApp.CmdArgs.access$0(r4)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto La2
            r4 = 0
            goto La3
        La2:
            r4 = 1
        La3:
            r5 = r10
            boolean r5 = r5.notMentioned
            int r0 = r0.display(r1, r2, r3, r4, r5)
            return r0
    }

    public lombok.core.configuration.ConfigurationApp redirectOutput(java.io.PrintStream r4, java.io.PrintStream r5) {
            r3 = this;
            r0 = r4
            if (r0 == 0) goto L9
            r0 = r3
            r1 = r4
            r0.out = r1
        L9:
            r0 = r5
            if (r0 == 0) goto L12
            r0 = r3
            r1 = r5
            r0.err = r1
        L12:
            r0 = r3
            return r0
    }

    public int generate(java.util.Collection<lombok.core.configuration.ConfigurationKey<?>> r8, boolean r9, boolean r10) {
            r7 = this;
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L13b
        Lb:
            r0 = r12
            java.lang.Object r0 = r0.next()
            lombok.core.configuration.ConfigurationKey r0 = (lombok.core.configuration.ConfigurationKey) r0
            r11 = r0
            r0 = r10
            if (r0 != 0) goto L26
            r0 = r11
            boolean r0 = r0.isHidden()
            if (r0 == 0) goto L26
            goto L13b
        L26:
            r0 = r11
            java.lang.String r0 = r0.getKeyName()
            r13 = r0
            r0 = r11
            lombok.core.configuration.ConfigurationDataType r0 = r0.getType()
            r14 = r0
            r0 = r11
            java.lang.String r0 = r0.getDescription()
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L4c
            r0 = r15
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4c
            r0 = 1
            goto L4d
        L4c:
            r0 = 0
        L4d:
            r16 = r0
            r0 = r9
            if (r0 != 0) goto L7d
            r0 = r7
            java.io.PrintStream r0 = r0.out
            r1 = r13
            r0.println(r1)
            r0 = r16
            if (r0 == 0) goto L73
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "  "
            r0.print(r1)
            r0 = r7
            java.io.PrintStream r0 = r0.out
            r1 = r15
            r0.println(r1)
        L73:
            r0 = r7
            java.io.PrintStream r0 = r0.out
            r0.println()
            goto L13b
        L7d:
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "##%n## Key : %s%n## Type: %s%n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r13
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r14
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            r0 = r16
            if (r0 == 0) goto Lad
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "##%n## %s%n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r15
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        Lad:
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "##%n## Examples:%n#%n"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.io.PrintStream r0 = r0.printf(r1, r2)
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "# clear %s%n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r13
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            r0 = r14
            lombok.core.configuration.ConfigurationValueParser r0 = r0.getParser()
            java.lang.String r0 = r0.exampleValue()
            r17 = r0
            r0 = r14
            boolean r0 = r0.isList()
            if (r0 == 0) goto L115
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "# %s += %s%n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r13
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r17
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "# %s -= %s%n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r13
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r17
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            goto L12d
        L115:
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "# %s = %s%n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r13
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r17
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L12d:
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "#%n%n"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L13b:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            r0 = r9
            if (r0 != 0) goto L152
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "Use --verbose for more information."
            r0.println(r1)
        L152:
            r0 = 0
            return r0
    }

    public int display(java.util.Collection<lombok.core.configuration.ConfigurationKey<?>> r8, boolean r9, java.util.Collection<java.lang.String> r10, boolean r11, boolean r12) throws java.lang.Exception {
            r7 = this;
            r0 = r7
            r1 = r10
            java.util.TreeMap r0 = r0.findSharedDirectories(r1)
            r13 = r0
            r0 = r13
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = r13
            java.net.URI r1 = lombok.core.configuration.ConfigurationApp.NO_CONFIG
            java.lang.Object r0 = r0.remove(r1)
            java.util.Set r0 = (java.util.Set) r0
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L8c
            r0 = r14
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L4c
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "No 'lombok.config' found for '%s'.%n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r14
            java.util.Iterator r5 = r5.iterator()
            java.lang.Object r5 = r5.next()
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            goto L8c
        L4c:
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "No 'lombok.config' found for: "
            r0.println(r1)
            r0 = r14
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
            goto L82
        L62:
            r0 = r16
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r15 = r0
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "- %s%n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r15
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L82:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L62
        L8c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r15 = r0
            lombok.core.configuration.ConfigurationApp$2 r0 = new lombok.core.configuration.ConfigurationApp$2
            r1 = r0
            r2 = r7
            r3 = r15
            r1.<init>(r2, r3)
            r16 = r0
            lombok.core.configuration.FileSystemSourceCache r0 = new lombok.core.configuration.FileSystemSourceCache
            r1 = r0
            r1.<init>()
            r17 = r0
            lombok.core.configuration.ConfigurationParser r0 = new lombok.core.configuration.ConfigurationParser
            r1 = r0
            r2 = r16
            r1.<init>(r2)
            r18 = r0
            r0 = 1
            r19 = r0
            r0 = r13
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r21 = r0
            goto L21f
        Lc7:
            r0 = r21
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r20 = r0
            r0 = r19
            if (r0 != 0) goto Le7
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "%n%n"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.io.PrintStream r0 = r0.printf(r1, r2)
        Le7:
            r0 = r20
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            r22 = r0
            r0 = r22
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L129
            r0 = r10
            int r0 = r0.size()
            r1 = 1
            if (r0 == r1) goto L175
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "Configuration for '%s'.%n%n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r22
            java.util.Iterator r5 = r5.iterator()
            java.lang.Object r5 = r5.next()
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            goto L175
        L129:
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "Configuration for:%n"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.io.PrintStream r0 = r0.printf(r1, r2)
            r0 = r22
            java.util.Iterator r0 = r0.iterator()
            r24 = r0
            goto L164
        L144:
            r0 = r24
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r23 = r0
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "- %s%n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r23
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L164:
            r0 = r24
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L144
            r0 = r7
            java.io.PrintStream r0 = r0.out
            r0.println()
        L175:
            r0 = r20
            java.lang.Object r0 = r0.getKey()
            java.net.URI r0 = (java.net.URI) r0
            r23 = r0
            lombok.core.configuration.BubblingConfigurationResolver r0 = new lombok.core.configuration.BubblingConfigurationResolver
            r1 = r0
            r2 = r17
            r3 = r23
            lombok.core.configuration.ConfigurationFile r2 = r2.forUri(r3)
            r3 = r17
            r4 = r18
            lombok.core.configuration.ConfigurationFileToSource r3 = r3.fileToSource(r4)
            r1.<init>(r2, r3)
            r24 = r0
            r0 = r7
            r1 = r8
            r2 = r23
            r3 = r12
            java.util.Map r0 = r0.trace(r1, r2, r3)
            r25 = r0
            r0 = 0
            r26 = r0
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r28 = r0
            goto L203
        L1b1:
            r0 = r28
            java.lang.Object r0 = r0.next()
            lombok.core.configuration.ConfigurationKey r0 = (lombok.core.configuration.ConfigurationKey) r0
            r27 = r0
            r0 = r24
            r1 = r27
            java.lang.Object r0 = r0.resolve(r1)
            r29 = r0
            r0 = r25
            r1 = r27
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r30 = r0
            r0 = r30
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1e5
            r0 = r11
            if (r0 == 0) goto L203
        L1e5:
            r0 = r26
            if (r0 == 0) goto L1f5
            r0 = r9
            if (r0 == 0) goto L1f5
            r0 = r7
            java.io.PrintStream r0 = r0.out
            r0.println()
        L1f5:
            r0 = r7
            r1 = r27
            r2 = r29
            r3 = r9
            r4 = r30
            r0.printValue(r1, r2, r3, r4)
            r0 = 1
            r26 = r0
        L203:
            r0 = r28
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1b1
            r0 = r26
            if (r0 != 0) goto L21c
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "<default>"
            r0.println(r1)
        L21c:
            r0 = 0
            r19 = r0
        L21f:
            r0 = r21
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lc7
            r0 = r15
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27a
            r0 = r7
            java.io.PrintStream r0 = r0.err
            java.lang.String r1 = "Problems in the configuration files:%n"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.io.PrintStream r0 = r0.printf(r1, r2)
            r0 = r15
            java.util.Iterator r0 = r0.iterator()
            r21 = r0
            goto L26e
        L24e:
            r0 = r21
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r20 = r0
            r0 = r7
            java.io.PrintStream r0 = r0.err
            java.lang.String r1 = "- %s%n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r20
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L26e:
            r0 = r21
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L24e
            r0 = 2
            return r0
        L27a:
            r0 = 0
            return r0
    }

    private void printValue(lombok.core.configuration.ConfigurationKey<?> r8, java.lang.Object r9, boolean r10, java.util.Collection<java.lang.String> r11) {
            r7 = this;
            r0 = r10
            if (r0 == 0) goto L1a
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "# %s%n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            java.lang.String r5 = r5.getDescription()
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L1a:
            r0 = r9
            if (r0 != 0) goto L37
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "clear %s%n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            java.lang.String r5 = r5.getKeyName()
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            goto Lbb
        L37:
            r0 = r9
            boolean r0 = r0 instanceof java.util.List
            if (r0 == 0) goto La1
            r0 = r9
            java.util.List r0 = (java.util.List) r0
            r12 = r0
            r0 = r12
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L64
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "clear %s%n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            java.lang.String r5 = r5.getKeyName()
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L64:
            r0 = r12
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L94
        L70:
            r0 = r14
            java.lang.Object r0 = r0.next()
            r13 = r0
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "%s += %s%n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            java.lang.String r5 = r5.getKeyName()
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r13
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L94:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L70
            goto Lbb
        La1:
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "%s = %s%n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            java.lang.String r5 = r5.getKeyName()
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        Lbb:
            r0 = r10
            if (r0 != 0) goto Lc0
            return
        Lc0:
            r0 = r11
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            goto Lec
        Lcc:
            r0 = r13
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r12 = r0
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "# %s%n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r12
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        Lec:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lcc
            return
    }

    private java.util.Map<lombok.core.configuration.ConfigurationKey<?>, ? extends java.util.Collection<java.lang.String>> trace(java.util.Collection<lombok.core.configuration.ConfigurationKey<?>> r10, java.net.URI r11, boolean r12) throws java.lang.Exception {
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto L31
        L14:
            r0 = r15
            java.lang.Object r0 = r0.next()
            lombok.core.configuration.ConfigurationKey r0 = (lombok.core.configuration.ConfigurationKey) r0
            r14 = r0
            r0 = r13
            r1 = r14
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = r2
            r3.<init>()
            java.lang.Object r0 = r0.put(r1, r2)
        L31:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r14 = r0
            r0 = 0
            r15 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r16 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            lombok.core.configuration.ConfigurationFile r0 = lombok.core.configuration.ConfigurationFile.forDirectory(r0)
            r17 = r0
            goto L1c6
        L60:
            r0 = r17
            boolean r0 = r0.exists()
            if (r0 != 0) goto L6b
            goto L1bf
        L6b:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r18
            lombok.core.configuration.ConfigurationApp$Source r1 = new lombok.core.configuration.ConfigurationApp$Source
            r2 = r1
            r3 = r17
            r4 = r17
            java.lang.String r4 = r4.description()
            r2.<init>(r3, r4)
            r0.push(r1)
            goto L1b5
        L8c:
            r0 = r18
            java.lang.Object r0 = r0.pop()
            lombok.core.configuration.ConfigurationApp$Source r0 = (lombok.core.configuration.ConfigurationApp.Source) r0
            r19 = r0
            r0 = r19
            if (r0 == 0) goto L1b5
            r0 = r16
            r1 = r19
            lombok.core.configuration.ConfigurationFile r1 = r1.file
            boolean r0 = r0.add(r1)
            if (r0 == 0) goto L1b5
            r0 = r19
            lombok.core.configuration.ConfigurationFile r0 = r0.file
            boolean r0 = r0.exists()
            if (r0 != 0) goto Lba
            goto L1b5
        Lba:
            r0 = r9
            r1 = r19
            lombok.core.configuration.ConfigurationFile r1 = r1.file
            r2 = r10
            r3 = r18
            java.util.Map r0 = r0.trace(r1, r2, r3)
            r20 = r0
            r0 = r9
            r1 = r20
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.STOP_BUBBLING
            java.lang.Object r1 = r1.get(r2)
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r0.stopBubbling(r1)
            r15 = r0
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r22 = r0
            goto L1ab
        Le6:
            r0 = r22
            java.lang.Object r0 = r0.next()
            lombok.core.configuration.ConfigurationKey r0 = (lombok.core.configuration.ConfigurationKey) r0
            r21 = r0
            r0 = r20
            r1 = r21
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r23 = r0
            r0 = r23
            if (r0 != 0) goto L162
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r23 = r0
            r0 = r12
            if (r0 == 0) goto L196
            r0 = r23
            java.lang.String r1 = ""
            boolean r0 = r0.add(r1)
            r0 = r23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r19
            java.lang.String r3 = r3.description
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            r0 = r23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "     <'"
            r2.<init>(r3)
            r2 = r21
            java.lang.String r2 = r2.getKeyName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' not mentioned>"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            goto L196
        L162:
            r0 = r14
            r1 = r21
            boolean r0 = r0.add(r1)
            r0 = r23
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r4 = r19
            java.lang.String r4 = r4.description
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            java.lang.String r3 = ":"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.add(r1, r2)
            r0 = r23
            r1 = 0
            java.lang.String r2 = ""
            r0.add(r1, r2)
        L196:
            r0 = r13
            r1 = r21
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            r2 = r23
            boolean r0 = r0.addAll(r1, r2)
        L1ab:
            r0 = r22
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Le6
        L1b5:
            r0 = r18
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8c
        L1bf:
            r0 = r17
            lombok.core.configuration.ConfigurationFile r0 = r0.parent()
            r17 = r0
        L1c6:
            r0 = r17
            if (r0 == 0) goto L1d0
            r0 = r15
            if (r0 == 0) goto L60
        L1d0:
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
            goto L255
        L1db:
            r0 = r18
            java.lang.Object r0 = r0.next()
            lombok.core.configuration.ConfigurationKey r0 = (lombok.core.configuration.ConfigurationKey) r0
            r17 = r0
            r0 = r14
            r1 = r17
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L248
            r0 = r13
            r1 = r17
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r19 = r0
            r0 = r19
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)
            r0 = r15
            if (r0 == 0) goto L255
            r0 = r19
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r20 = r0
            r0 = r19
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r4 = r20
            r5 = 0
            r6 = r20
            int r6 = r6.length()
            r7 = 1
            int r6 = r6 - r7
            java.lang.String r4 = r4.substring(r5, r6)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            java.lang.String r3 = " (stopped bubbling):"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.set(r1, r2)
            goto L255
        L248:
            r0 = r13
            r1 = r17
            java.util.List r2 = java.util.Collections.emptyList()
            java.lang.Object r0 = r0.put(r1, r2)
        L255:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1db
            r0 = r13
            return r0
    }

    private java.util.Map<lombok.core.configuration.ConfigurationKey<?>, java.util.List<java.lang.String>> trace(lombok.core.configuration.ConfigurationFile r8, java.util.Collection<lombok.core.configuration.ConfigurationKey<?>> r9, java.util.Deque<lombok.core.configuration.ConfigurationApp.Source> r10) throws java.io.IOException {
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r11 = r0
            lombok.core.configuration.ConfigurationApp$3 r0 = new lombok.core.configuration.ConfigurationApp$3
            r1 = r0
            r2 = r7
            r3 = r10
            r4 = r9
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            r12 = r0
            lombok.core.configuration.ConfigurationParser r0 = new lombok.core.configuration.ConfigurationParser
            r1 = r0
            lombok.core.configuration.ConfigurationProblemReporter r2 = lombok.core.configuration.ConfigurationApp.VOID
            r1.<init>(r2)
            r1 = r8
            r2 = r12
            r0.parse(r1, r2)
            r0 = r11
            return r0
    }

    private boolean stopBubbling(java.util.List<java.lang.String> r5) {
            r4 = this;
            r0 = r5
            if (r0 == 0) goto L29
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
            r0 = r5
            r1 = r5
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "true"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L29
            r0 = 1
            return r0
        L29:
            r0 = 0
            return r0
    }

    private java.util.Collection<lombok.core.configuration.ConfigurationKey<?>> checkKeys(java.util.List<java.lang.String> r8) {
            r7 = this;
            java.util.Map r0 = lombok.core.configuration.ConfigurationKey.registeredKeys()
            r9 = r0
            r0 = r8
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
            r0 = r9
            java.util.Collection r0 = r0.values()
            return r0
        L14:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L6d
        L27:
            r0 = r12
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r9
            r1 = r11
            java.lang.Object r0 = r0.get(r1)
            lombok.core.configuration.ConfigurationKey r0 = (lombok.core.configuration.ConfigurationKey) r0
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L5b
            r0 = r7
            java.io.PrintStream r0 = r0.err
            java.lang.String r1 = "Unknown key '%s'%n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r11
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            r0 = 0
            return r0
        L5b:
            r0 = r10
            r1 = r13
            boolean r0 = r0.remove(r1)
            r0 = r10
            r1 = r13
            boolean r0 = r0.add(r1)
        L6d:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L27
            r0 = r10
            return r0
    }

    private java.util.TreeMap<java.net.URI, java.util.Set<java.lang.String>> findSharedDirectories(java.util.Collection<java.lang.String> r8) {
            r7 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r1 = r0
            lombok.core.configuration.ConfigurationApp$4 r2 = new lombok.core.configuration.ConfigurationApp$4
            r3 = r2
            r4 = r7
            r3.<init>(r4)
            r1.<init>(r2)
            r9 = r0
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L80
        L1b:
            r0 = r11
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r12 = r0
            r0 = r12
            boolean r0 = r0.exists()
            if (r0 != 0) goto L4d
            r0 = r7
            java.io.PrintStream r0 = r0.err
            java.lang.String r1 = "File not found: '%s'%n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r10
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            r0 = 0
            return r0
        L4d:
            r0 = r7
            r1 = r12
            java.net.URI r0 = r0.findFirstLombokDirectory(r1)
            r13 = r0
            r0 = r9
            r1 = r13
            java.lang.Object r0 = r0.get(r1)
            java.util.Set r0 = (java.util.Set) r0
            r14 = r0
            r0 = r14
            if (r0 != 0) goto L77
            java.util.TreeSet r0 = new java.util.TreeSet
            r1 = r0
            r1.<init>()
            r14 = r0
            r0 = r9
            r1 = r13
            r2 = r14
            java.lang.Object r0 = r0.put(r1, r2)
        L77:
            r0 = r14
            r1 = r10
            boolean r0 = r0.add(r1)
        L80:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1b
            r0 = r9
            return r0
    }

    private java.net.URI findFirstLombokDirectory(java.io.File r6) {
            r5 = this;
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r6
            java.net.URI r2 = r2.toURI()
            java.net.URI r2 = r2.normalize()
            r1.<init>(r2)
            r7 = r0
            r0 = r6
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L39
            r0 = r7
            java.io.File r0 = r0.getParentFile()
            r7 = r0
            goto L39
        L1e:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r7
            java.lang.String r3 = "lombok.config"
            r1.<init>(r2, r3)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L34
            r0 = r7
            java.net.URI r0 = r0.toURI()
            return r0
        L34:
            r0 = r7
            java.io.File r0 = r0.getParentFile()
            r7 = r0
        L39:
            r0 = r7
            if (r0 != 0) goto L1e
            java.net.URI r0 = lombok.core.configuration.ConfigurationApp.NO_CONFIG
            return r0
    }
}
