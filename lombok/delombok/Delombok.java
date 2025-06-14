package lombok.delombok;

/* loaded from: com.usidqw.qwerklj.apk:lombok/delombok/Delombok.SCL.lombok */
public class Delombok {
    private java.nio.charset.Charset charset;
    private com.sun.tools.javac.util.Context context;
    private java.io.Writer presetWriter;
    private java.io.PrintStream feedback;
    private boolean verbose;
    private boolean noCopy;
    private boolean onlyChanged;
    private boolean force;
    private boolean disablePreview;
    private java.lang.String classpath;
    private java.lang.String sourcepath;
    private java.lang.String bootclasspath;
    private java.lang.String modulepath;
    private java.util.LinkedHashMap<java.io.File, java.io.File> fileToBase;
    private java.util.List<java.io.File> filesToParse;
    private java.util.Map<java.lang.String, java.lang.String> formatPrefs;
    private java.util.List<javax.annotation.processing.AbstractProcessor> additionalAnnotationProcessors;
    private java.io.File output;
    private static final java.lang.reflect.Field MODULE_FIELD = null;
    private static java.lang.reflect.Method attributeMethod;
    private static java.lang.reflect.Method flowMethod;


    /* loaded from: com.usidqw.qwerklj.apk:lombok/delombok/Delombok$CmdArgs.SCL.lombok */
    private static class CmdArgs {

        @com.zwitserloot.cmdreader.Excludes({"quiet"})
        @com.zwitserloot.cmdreader.Description("Print the name of each file as it is being delombok-ed.")
        @com.zwitserloot.cmdreader.Shorthand({"v"})
        private boolean verbose;

        @com.zwitserloot.cmdreader.Description("Sets formatting rules. Use --format-help to list all available rules. Unset format rules are inferred by scanning the source for usages.")
        @com.zwitserloot.cmdreader.Shorthand({"f"})
        private java.util.List<java.lang.String> format;

        @com.zwitserloot.cmdreader.FullName("format-help")
        private boolean formatHelp;

        @com.zwitserloot.cmdreader.Excludes({"verbose"})
        @com.zwitserloot.cmdreader.Description("No warnings or errors will be emitted to standard error")
        @com.zwitserloot.cmdreader.Shorthand({"q"})
        private boolean quiet;

        @com.zwitserloot.cmdreader.Description("Sets the encoding of your source files. Defaults to the system default charset. Example: \"UTF-8\"")
        @com.zwitserloot.cmdreader.Shorthand({"e"})
        private java.lang.String encoding;

        @com.zwitserloot.cmdreader.Description("Print delombok-ed code to standard output instead of saving it in target directory")
        @com.zwitserloot.cmdreader.Shorthand({"p"})
        private boolean print;

        @com.zwitserloot.cmdreader.Description("Directory to save delomboked files to")
        @com.zwitserloot.cmdreader.Mandatory(onlyIfNot = {"print", "help", "format-help"})
        @com.zwitserloot.cmdreader.Shorthand({"d"})
        private java.lang.String target;

        @com.zwitserloot.cmdreader.Description("Classpath (analogous to javac -cp option)")
        @com.zwitserloot.cmdreader.Shorthand({"c"})
        private java.lang.String classpath;

        @com.zwitserloot.cmdreader.Description("Sourcepath (analogous to javac -sourcepath option)")
        @com.zwitserloot.cmdreader.Shorthand({"s"})
        private java.lang.String sourcepath;

        @com.zwitserloot.cmdreader.Description("override Bootclasspath (analogous to javac -bootclasspath option)")
        private java.lang.String bootclasspath;

        @com.zwitserloot.cmdreader.Description("Module path (analogous to javac --module-path option)")
        @com.zwitserloot.cmdreader.FullName("module-path")
        private java.lang.String modulepath;

        @com.zwitserloot.cmdreader.Description("Files to delombok. Provide either a file, or a directory. If you use a directory, all files in it (recursive) are delombok-ed")
        @com.zwitserloot.cmdreader.Sequential
        private java.util.List<java.lang.String> input;

        @com.zwitserloot.cmdreader.Description("Lombok will only delombok source files. Without this option, non-java, non-class files are copied to the target directory.")
        @com.zwitserloot.cmdreader.Shorthand({"n"})
        private boolean nocopy;

        @com.zwitserloot.cmdreader.Description("Output only changed files (implies -n)")
        private boolean onlyChanged;

        @com.zwitserloot.cmdreader.Description("By default lombok enables preview features if available (introduced in JDK 12). With this option, lombok won't do that.")
        @com.zwitserloot.cmdreader.FullName("disable-preview")
        private boolean disablePreview;
        private boolean help;

        private CmdArgs() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.format = r1
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.input = r1
                return
        }

        static /* synthetic */ boolean access$0(lombok.delombok.Delombok.CmdArgs r2) {
                r0 = r2
                boolean r0 = r0.help
                return r0
        }

        static /* synthetic */ java.util.List access$1(lombok.delombok.Delombok.CmdArgs r2) {
                r0 = r2
                java.util.List<java.lang.String> r0 = r0.input
                return r0
        }

        static /* synthetic */ boolean access$2(lombok.delombok.Delombok.CmdArgs r2) {
                r0 = r2
                boolean r0 = r0.formatHelp
                return r0
        }

        static /* synthetic */ boolean access$3(lombok.delombok.Delombok.CmdArgs r2) {
                r0 = r2
                boolean r0 = r0.quiet
                return r0
        }

        static /* synthetic */ java.util.List access$4(lombok.delombok.Delombok.CmdArgs r2) {
                r0 = r2
                java.util.List<java.lang.String> r0 = r0.format
                return r0
        }

        static /* synthetic */ java.lang.String access$5(lombok.delombok.Delombok.CmdArgs r2) {
                r0 = r2
                java.lang.String r0 = r0.encoding
                return r0
        }

        static /* synthetic */ boolean access$6(lombok.delombok.Delombok.CmdArgs r2) {
                r0 = r2
                boolean r0 = r0.verbose
                return r0
        }

        static /* synthetic */ boolean access$7(lombok.delombok.Delombok.CmdArgs r2) {
                r0 = r2
                boolean r0 = r0.nocopy
                return r0
        }

        static /* synthetic */ boolean access$8(lombok.delombok.Delombok.CmdArgs r2) {
                r0 = r2
                boolean r0 = r0.onlyChanged
                return r0
        }

        static /* synthetic */ boolean access$9(lombok.delombok.Delombok.CmdArgs r2) {
                r0 = r2
                boolean r0 = r0.disablePreview
                return r0
        }

        static /* synthetic */ boolean access$10(lombok.delombok.Delombok.CmdArgs r2) {
                r0 = r2
                boolean r0 = r0.print
                return r0
        }

        static /* synthetic */ java.lang.String access$11(lombok.delombok.Delombok.CmdArgs r2) {
                r0 = r2
                java.lang.String r0 = r0.target
                return r0
        }

        static /* synthetic */ java.lang.String access$12(lombok.delombok.Delombok.CmdArgs r2) {
                r0 = r2
                java.lang.String r0 = r0.classpath
                return r0
        }

        static /* synthetic */ java.lang.String access$13(lombok.delombok.Delombok.CmdArgs r2) {
                r0 = r2
                java.lang.String r0 = r0.sourcepath
                return r0
        }

        static /* synthetic */ java.lang.String access$14(lombok.delombok.Delombok.CmdArgs r2) {
                r0 = r2
                java.lang.String r0 = r0.bootclasspath
                return r0
        }

        static /* synthetic */ java.lang.String access$15(lombok.delombok.Delombok.CmdArgs r2) {
                r0 = r2
                java.lang.String r0 = r0.modulepath
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/delombok/Delombok$InvalidFormatOptionException.SCL.lombok */
    public static class InvalidFormatOptionException extends java.lang.Exception {
        public InvalidFormatOptionException(java.lang.String r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }
    }

    static {
            lombok.javac.apt.LombokProcessor.addOpensForLombok()
            java.lang.reflect.Field r0 = getModuleField()
            lombok.delombok.Delombok.MODULE_FIELD = r0
            return
    }

    public Delombok() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
            r0.charset = r1
            r0 = r4
            com.sun.tools.javac.util.Context r1 = new com.sun.tools.javac.util.Context
            r2 = r1
            r2.<init>()
            r0.context = r1
            r0 = r4
            java.io.PrintStream r1 = java.lang.System.err
            r0.feedback = r1
            r0 = r4
            r1 = 0
            r0.force = r1
            r0 = r4
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = r1
            r2.<init>()
            r0.fileToBase = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.filesToParse = r1
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.formatPrefs = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.additionalAnnotationProcessors = r1
            r0 = r4
            r1 = 0
            r0.output = r1
            return
    }

    public void setWriter(java.io.Writer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.presetWriter = r1
            return
    }

    private static java.lang.String indentAndWordbreak(java.lang.String r4, int r5, int r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r4
            int r0 = r0.length()
            r10 = r0
            r0 = 0
            r11 = r0
            goto Lb2
        L26:
            r0 = r11
            r1 = r10
            if (r0 != r1) goto L32
            r0 = 32
            goto L38
        L32:
            r0 = r4
            r1 = r11
            char r0 = r0.charAt(r1)
        L38:
            r12 = r0
            r0 = r12
            r1 = 32
            if (r0 != r1) goto La0
            r0 = r8
            int r0 = r0.length()
            r1 = r9
            int r1 = r1.length()
            int r0 = r0 + r1
            r1 = r6
            if (r0 >= r1) goto L5b
            r0 = r8
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L9a
        L5b:
            r0 = r7
            int r0 = r0.length()
            if (r0 <= 0) goto L69
            r0 = r7
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
        L69:
            r0 = 0
            r13 = r0
            goto L79
        L6f:
            r0 = r7
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r13 = r13 + 1
        L79:
            r0 = r13
            r1 = r5
            if (r0 < r1) goto L6f
            r0 = r7
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = 0
            r0.setLength(r1)
            r0 = r8
            r1 = r9
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            java.lang.StringBuilder r0 = r0.append(r1)
        L9a:
            r0 = r9
            r1 = 0
            r0.setLength(r1)
        La0:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto Laf
            r0 = r9
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
        Laf:
            int r11 = r11 + 1
        Lb2:
            r0 = r11
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            if (r0 < r1) goto L26
            r0 = r8
            int r0 = r0.length()
            if (r0 <= 0) goto Lee
            r0 = r7
            int r0 = r0.length()
            if (r0 <= 0) goto Ld1
            r0 = r7
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
        Ld1:
            r0 = 0
            r11 = r0
            goto Le1
        Ld7:
            r0 = r7
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r11 = r11 + 1
        Le1:
            r0 = r11
            r1 = r5
            if (r0 < r1) goto Ld7
            r0 = r7
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
        Lee:
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
    }

    static java.lang.String getPathOfSelf() {
            java.lang.Class<lombok.delombok.Delombok> r0 = lombok.delombok.Delombok.class
            java.lang.String r1 = "Delombok.class"
            java.net.URL r0 = r0.getResource(r1)
            java.lang.String r0 = r0.toString()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "lombok/delombok/Delombok.class"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L2a
            r0 = r5
            r1 = 0
            r2 = r5
            int r2 = r2.length()
            java.lang.String r3 = "lombok/delombok/Delombok.class"
            int r3 = r3.length()
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            java.lang.String r0 = urlDecode(r0)
            r5 = r0
            goto L4b
        L2a:
            r0 = r5
            java.lang.String r1 = "lombok/delombok/Delombok.SCL.lombok"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L49
            r0 = r5
            r1 = 0
            r2 = r5
            int r2 = r2.length()
            java.lang.String r3 = "lombok/delombok/Delombok.SCL.lombok"
            int r3 = r3.length()
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            java.lang.String r0 = urlDecode(r0)
            r5 = r0
            goto L4b
        L49:
            r0 = 0
            return r0
        L4b:
            r0 = r5
            java.lang.String r1 = "jar:file:"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L6a
            r0 = r5
            java.lang.String r1 = "!/"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L6a
            r0 = r5
            r1 = 9
            r2 = r5
            int r2 = r2.length()
            r3 = 2
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
        L6a:
            r0 = r5
            java.lang.String r1 = "file:"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L79
            r0 = r5
            r1 = 5
            java.lang.String r0 = r0.substring(r1)
            return r0
        L79:
            r0 = 0
            return r0
    }

    private static java.lang.String urlDecode(java.lang.String r4) {
            r0 = r4
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L7
            return r0
        L7:
            java.lang.InternalError r0 = new java.lang.InternalError
            r1 = r0
            java.lang.String r2 = "UTF-8 not supported"
            r1.<init>(r2)
            throw r0
    }

    public static void main(java.lang.String[] r6) {
            r0 = r6
            java.lang.String[] r0 = fileExpand(r0)     // Catch: java.io.IOException -> L8
            r6 = r0
            goto L17
        L8:
            r7 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r7
            java.lang.String r1 = r1.getMessage()
            r0.println(r1)
            r0 = 1
            java.lang.System.exit(r0)
        L17:
            java.lang.Class<lombok.delombok.Delombok$CmdArgs> r0 = lombok.delombok.Delombok.CmdArgs.class
            com.zwitserloot.cmdreader.CmdReader r0 = com.zwitserloot.cmdreader.CmdReader.m40of(r0)
            r7 = r0
            r0 = r7
            r1 = r6
            java.lang.Object r0 = r0.make(r1)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L29
            lombok.delombok.Delombok$CmdArgs r0 = (lombok.delombok.Delombok.CmdArgs) r0     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L29
            r8 = r0
            goto L53
        L29:
            r9 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "ERROR: "
            r2.<init>(r3)
            r2 = r9
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.io.PrintStream r0 = java.lang.System.err
            r1 = r7
            java.lang.String r1 = cmdHelp(r1)
            r0.println(r1)
            r0 = 1
            java.lang.System.exit(r0)
            return
        L53:
            r0 = r8
            boolean r0 = lombok.delombok.Delombok.CmdArgs.access$0(r0)
            if (r0 != 0) goto L6d
            r0 = r8
            java.util.List r0 = lombok.delombok.Delombok.CmdArgs.access$1(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L97
            r0 = r8
            boolean r0 = lombok.delombok.Delombok.CmdArgs.access$2(r0)
            if (r0 != 0) goto L97
        L6d:
            r0 = r8
            boolean r0 = lombok.delombok.Delombok.CmdArgs.access$0(r0)
            if (r0 != 0) goto L7d
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "ERROR: no files or directories to delombok specified."
            r0.println(r1)
        L7d:
            java.io.PrintStream r0 = java.lang.System.err
            r1 = r7
            java.lang.String r1 = cmdHelp(r1)
            r0.println(r1)
            r0 = r8
            boolean r0 = lombok.delombok.Delombok.CmdArgs.access$0(r0)
            if (r0 == 0) goto L92
            r0 = 0
            goto L93
        L92:
            r0 = 1
        L93:
            java.lang.System.exit(r0)
            return
        L97:
            lombok.delombok.Delombok r0 = new lombok.delombok.Delombok
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r8
            boolean r0 = lombok.delombok.Delombok.CmdArgs.access$3(r0)
            if (r0 == 0) goto Lb8
            r0 = r9
            java.io.PrintStream r1 = new java.io.PrintStream
            r2 = r1
            lombok.delombok.Delombok$1 r3 = new lombok.delombok.Delombok$1
            r4 = r3
            r4.<init>()
            r2.<init>(r3)
            r0.setFeedback(r1)
        Lb8:
            r0 = r8
            boolean r0 = lombok.delombok.Delombok.CmdArgs.access$2(r0)
            if (r0 == 0) goto L13f
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Available format keys (to use, -f key:value -f key2:value2 -f ... ):"
            r0.println(r1)
            java.util.Map r0 = lombok.delombok.FormatPreferences.getKeysAndDescriptions()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L11e
        Lda:
            r0 = r11
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r10 = r0
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "  "
            r0.print(r1)
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r10
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r0.print(r1)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = ":"
            r0.println(r1)
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r10
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 4
            r3 = 70
            java.lang.String r1 = indentAndWordbreak(r1, r2, r3)
            r0.println(r1)
        L11e:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lda
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Example: -f indent:4 -f emptyLines:indent"
            r0.println(r1)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "The '-f pretty' option is shorthand for '-f suppressWarnings:skip -f generated:skip -f danceAroundIdeChecks:skip -f generateDelombokComment:skip -f javaLangAsFQN:skip'"
            r0.println(r1)
            r0 = 0
            java.lang.System.exit(r0)
            return
        L13f:
            r0 = r9
            r1 = r8
            java.util.List r1 = lombok.delombok.Delombok.CmdArgs.access$4(r1)     // Catch: lombok.delombok.Delombok.InvalidFormatOptionException -> L14d
            java.util.Map r1 = formatOptionsToMap(r1)     // Catch: lombok.delombok.Delombok.InvalidFormatOptionException -> L14d
            r0.setFormatPreferences(r1)     // Catch: lombok.delombok.Delombok.InvalidFormatOptionException -> L14d
            goto L172
        L14d:
            r10 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r10
            java.lang.String r3 = r3.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = " Try --format-help."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = 1
            java.lang.System.exit(r0)
            return
        L172:
            r0 = r8
            java.lang.String r0 = lombok.delombok.Delombok.CmdArgs.access$5(r0)
            if (r0 == 0) goto L1a4
            r0 = r9
            r1 = r8
            java.lang.String r1 = lombok.delombok.Delombok.CmdArgs.access$5(r1)     // Catch: java.nio.charset.UnsupportedCharsetException -> L184
            r0.setCharset(r1)     // Catch: java.nio.charset.UnsupportedCharsetException -> L184
            goto L1a4
        L184:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "ERROR: Not a known charset: "
            r2.<init>(r3)
            r2 = r8
            java.lang.String r2 = lombok.delombok.Delombok.CmdArgs.access$5(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = 1
            java.lang.System.exit(r0)
            return
        L1a4:
            r0 = r8
            boolean r0 = lombok.delombok.Delombok.CmdArgs.access$6(r0)
            if (r0 == 0) goto L1b0
            r0 = r9
            r1 = 1
            r0.setVerbose(r1)
        L1b0:
            r0 = r8
            boolean r0 = lombok.delombok.Delombok.CmdArgs.access$7(r0)
            if (r0 != 0) goto L1be
            r0 = r8
            boolean r0 = lombok.delombok.Delombok.CmdArgs.access$8(r0)
            if (r0 == 0) goto L1c3
        L1be:
            r0 = r9
            r1 = 1
            r0.setNoCopy(r1)
        L1c3:
            r0 = r8
            boolean r0 = lombok.delombok.Delombok.CmdArgs.access$9(r0)
            if (r0 == 0) goto L1cf
            r0 = r9
            r1 = 1
            r0.setDisablePreview(r1)
        L1cf:
            r0 = r8
            boolean r0 = lombok.delombok.Delombok.CmdArgs.access$8(r0)
            if (r0 == 0) goto L1db
            r0 = r9
            r1 = 1
            r0.setOnlyChanged(r1)
        L1db:
            r0 = r8
            boolean r0 = lombok.delombok.Delombok.CmdArgs.access$10(r0)
            if (r0 == 0) goto L1e9
            r0 = r9
            r0.setOutputToStandardOut()
            goto L1f8
        L1e9:
            r0 = r9
            java.io.File r1 = new java.io.File
            r2 = r1
            r3 = r8
            java.lang.String r3 = lombok.delombok.Delombok.CmdArgs.access$11(r3)
            r2.<init>(r3)
            r0.setOutput(r1)
        L1f8:
            r0 = r8
            java.lang.String r0 = lombok.delombok.Delombok.CmdArgs.access$12(r0)
            if (r0 == 0) goto L207
            r0 = r9
            r1 = r8
            java.lang.String r1 = lombok.delombok.Delombok.CmdArgs.access$12(r1)
            r0.setClasspath(r1)
        L207:
            r0 = r8
            java.lang.String r0 = lombok.delombok.Delombok.CmdArgs.access$13(r0)
            if (r0 == 0) goto L216
            r0 = r9
            r1 = r8
            java.lang.String r1 = lombok.delombok.Delombok.CmdArgs.access$13(r1)
            r0.setSourcepath(r1)
        L216:
            r0 = r8
            java.lang.String r0 = lombok.delombok.Delombok.CmdArgs.access$14(r0)
            if (r0 == 0) goto L225
            r0 = r9
            r1 = r8
            java.lang.String r1 = lombok.delombok.Delombok.CmdArgs.access$14(r1)
            r0.setBootclasspath(r1)
        L225:
            r0 = r8
            java.lang.String r0 = lombok.delombok.Delombok.CmdArgs.access$15(r0)
            if (r0 == 0) goto L234
            r0 = r9
            r1 = r8
            java.lang.String r1 = lombok.delombok.Delombok.CmdArgs.access$15(r1)
            r0.setModulepath(r1)
        L234:
            r0 = r8
            java.util.List r0 = lombok.delombok.Delombok.CmdArgs.access$1(r0)     // Catch: java.lang.Exception -> L2e1
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L2e1
            r11 = r0
            goto L2cf
        L242:
            r0 = r11
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Exception -> L2e1
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L2e1
            r10 = r0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L2e1
            r1 = r0
            r2 = r10
            r1.<init>(r2)     // Catch: java.lang.Exception -> L2e1
            java.io.File r0 = r0.getAbsoluteFile()     // Catch: java.lang.Exception -> L2e1
            r12 = r0
            r0 = r12
            boolean r0 = r0.isFile()     // Catch: java.lang.Exception -> L2e1
            if (r0 == 0) goto L275
            r0 = r9
            r1 = r12
            java.io.File r1 = r1.getParentFile()     // Catch: java.lang.Exception -> L2e1
            r2 = r12
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Exception -> L2e1
            r0.addFile(r1, r2)     // Catch: java.lang.Exception -> L2e1
            goto L2cf
        L275:
            r0 = r12
            boolean r0 = r0.isDirectory()     // Catch: java.lang.Exception -> L2e1
            if (r0 == 0) goto L286
            r0 = r9
            r1 = r12
            r0.addDirectory(r1)     // Catch: java.lang.Exception -> L2e1
            goto L2cf
        L286:
            r0 = r12
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L2e1
            if (r0 != 0) goto L2b0
            r0 = r8
            boolean r0 = lombok.delombok.Delombok.CmdArgs.access$3(r0)     // Catch: java.lang.Exception -> L2e1
            if (r0 != 0) goto L2cf
            java.io.PrintStream r0 = java.lang.System.err     // Catch: java.lang.Exception -> L2e1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e1
            r2 = r1
            java.lang.String r3 = "WARNING: does not exist - skipping: "
            r2.<init>(r3)     // Catch: java.lang.Exception -> L2e1
            r2 = r12
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L2e1
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L2e1
            r0.println(r1)     // Catch: java.lang.Exception -> L2e1
            goto L2cf
        L2b0:
            r0 = r8
            boolean r0 = lombok.delombok.Delombok.CmdArgs.access$3(r0)     // Catch: java.lang.Exception -> L2e1
            if (r0 != 0) goto L2cf
            java.io.PrintStream r0 = java.lang.System.err     // Catch: java.lang.Exception -> L2e1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e1
            r2 = r1
            java.lang.String r3 = "WARNING: not a standard file or directory - skipping: "
            r2.<init>(r3)     // Catch: java.lang.Exception -> L2e1
            r2 = r12
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L2e1
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L2e1
            r0.println(r1)     // Catch: java.lang.Exception -> L2e1
        L2cf:
            r0 = r11
            boolean r0 = r0.hasNext()     // Catch: java.lang.Exception -> L2e1
            if (r0 != 0) goto L242
            r0 = r9
            boolean r0 = r0.delombok()     // Catch: java.lang.Exception -> L2e1
            goto L31f
        L2e1:
            r10 = move-exception
            r0 = r8
            boolean r0 = lombok.delombok.Delombok.CmdArgs.access$3(r0)
            if (r0 != 0) goto L31f
            r0 = r10
            java.lang.String r0 = r0.getMessage()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L315
            r0 = r11
            java.lang.String r1 = "DELOMBOK: "
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L315
            java.io.PrintStream r0 = java.lang.System.err
            r1 = r11
            java.lang.String r2 = "DELOMBOK: "
            int r2 = r2.length()
            java.lang.String r1 = r1.substring(r2)
            r0.println(r1)
            goto L31a
        L315:
            r0 = r10
            r0.printStackTrace()
        L31a:
            r0 = 1
            java.lang.System.exit(r0)
            return
        L31f:
            return
    }

    private static java.lang.String cmdHelp(com.zwitserloot.cmdreader.CmdReader<lombok.delombok.Delombok.CmdArgs> r6) {
            r0 = r6
            java.lang.String r1 = "delombok"
            java.lang.String r0 = r0.generateCommandLineHelp(r1)
            r7 = r0
            r0 = r7
            r1 = 10
            int r0 = r0.indexOf(r1)
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r7
            r3 = 0
            r4 = r8
            java.lang.String r2 = r2.substring(r3, r4)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "\n You can use @filename.args to read arguments from the file 'filename.args'.\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            r2 = r8
            java.lang.String r1 = r1.substring(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String[] fileExpand(java.lang.String[] r8) throws java.io.IOException {
            r0 = r8
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
            goto L78
        L9:
            r0 = r8
            r1 = r11
            r0 = r0[r1]
            int r0 = r0.length()
            if (r0 <= 0) goto L75
            r0 = r8
            r1 = r11
            r0 = r0[r1]
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 64
            if (r0 != r1) goto L75
            r0 = r8
            r1 = r11
            r0 = r0[r1]
            r1 = 1
            java.lang.String r0 = r0.substring(r1)
            java.lang.String[] r0 = readArgsFromFile(r0)
            r12 = r0
            r0 = r9
            int r0 = r0.length
            r1 = r12
            int r1 = r1.length
            int r0 = r0 + r1
            r1 = 1
            int r0 = r0 - r1
            java.lang.String[] r0 = new java.lang.String[r0]
            r13 = r0
            r0 = r9
            r1 = 0
            r2 = r13
            r3 = 0
            r4 = r11
            r5 = r10
            int r4 = r4 + r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r12
            r1 = 0
            r2 = r13
            r3 = r11
            r4 = r10
            int r3 = r3 + r4
            r4 = r12
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r9
            r1 = r11
            r2 = r10
            int r1 = r1 + r2
            r2 = 1
            int r1 = r1 + r2
            r2 = r13
            r3 = r11
            r4 = r10
            int r3 = r3 + r4
            r4 = r12
            int r4 = r4.length
            int r3 = r3 + r4
            r4 = r9
            int r4 = r4.length
            r5 = r11
            r6 = r10
            int r5 = r5 + r6
            r6 = 1
            int r5 = r5 + r6
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r10
            r1 = r12
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0 + r1
            r10 = r0
            r0 = r13
            r9 = r0
        L75:
            int r11 = r11 + 1
        L78:
            r0 = r11
            r1 = r8
            int r1 = r1.length
            if (r0 < r1) goto L9
            r0 = r9
            return r0
    }

    private static java.lang.String[] readArgsFromFile(java.lang.String r5) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L51
            r1 = r0
            r2 = r6
            java.lang.String r3 = "UTF-8"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L51
            r8 = r0
            r0 = 4096(0x1000, float:5.74E-42)
            char[] r0 = new char[r0]     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L51
            r9 = r0
        L23:
            r0 = r8
            r1 = r9
            int r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L51
            r10 = r0
            r0 = r10
            r1 = -1
            if (r0 != r1) goto L34
            goto L4a
        L34:
            r0 = r7
            r1 = r9
            r2 = 0
            r3 = r10
            java.lang.StringBuilder r0 = r0.append(r1, r2, r3)     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L51
            goto L23
        L41:
            r11 = move-exception
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> L51
            r0 = r11
            throw r0     // Catch: java.lang.Throwable -> L51
        L4a:
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> L51
            goto L5a
        L51:
            r12 = move-exception
            r0 = r6
            r0.close()
            r0 = r12
            throw r0
        L5a:
            r0 = r6
            r0.close()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = 1
            r10 = r0
            r0 = 0
            r11 = r0
            goto L16b
        L78:
            r0 = r7
            r1 = r11
            char r0 = r0.charAt(r1)
            r12 = r0
            r0 = r10
            if (r0 >= 0) goto L9c
            r0 = r10
            int r0 = -r0
            r10 = r0
            r0 = r12
            r1 = 10
            if (r0 == r1) goto L168
            r0 = r9
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L168
        L9c:
            r0 = r10
            r1 = 1
            if (r0 != r1) goto Lfd
            r0 = r12
            r1 = 92
            if (r0 != r1) goto Laf
            r0 = -1
            r10 = r0
            goto L168
        Laf:
            r0 = r12
            r1 = 34
            if (r0 != r1) goto Lbc
            r0 = 2
            r10 = r0
            goto L168
        Lbc:
            r0 = r12
            r1 = 39
            if (r0 != r1) goto Lc9
            r0 = 3
            r10 = r0
            goto L168
        Lc9:
            r0 = r12
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto Lf2
            r0 = r9
            java.lang.String r0 = r0.toString()
            r13 = r0
            r0 = r13
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Le9
            r0 = r8
            r1 = r13
            boolean r0 = r0.add(r1)
        Le9:
            r0 = r9
            r1 = 0
            r0.setLength(r1)
            goto L168
        Lf2:
            r0 = r9
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L168
        Lfd:
            r0 = r10
            r1 = 2
            if (r0 != r1) goto L13b
            r0 = r12
            r1 = 92
            if (r0 != r1) goto L111
            r0 = -2
            r10 = r0
            goto L168
        L111:
            r0 = r12
            r1 = 34
            if (r0 != r1) goto L130
            r0 = 1
            r10 = r0
            r0 = r8
            r1 = r9
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            r0 = r9
            r1 = 0
            r0.setLength(r1)
            goto L168
        L130:
            r0 = r9
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L168
        L13b:
            r0 = r10
            r1 = 3
            if (r0 != r1) goto L168
            r0 = r12
            r1 = 39
            if (r0 != r1) goto L160
            r0 = 1
            r10 = r0
            r0 = r8
            r1 = r9
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            r0 = r9
            r1 = 0
            r0.setLength(r1)
            goto L168
        L160:
            r0 = r9
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
        L168:
            int r11 = r11 + 1
        L16b:
            r0 = r11
            r1 = r7
            int r1 = r1.length()
            if (r0 < r1) goto L78
            r0 = r10
            r1 = 1
            if (r0 != r1) goto L195
            r0 = r9
            java.lang.String r0 = r0.toString()
            r11 = r0
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1c7
            r0 = r8
            r1 = r11
            boolean r0 = r0.add(r1)
            goto L1c7
        L195:
            r0 = r10
            if (r0 >= 0) goto L1a5
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.String r2 = "Unclosed backslash escape in @ file"
            r1.<init>(r2)
            throw r0
        L1a5:
            r0 = r10
            r1 = 2
            if (r0 != r1) goto L1b6
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.String r2 = "Unclosed \" in @ file"
            r1.<init>(r2)
            throw r0
        L1b6:
            r0 = r10
            r1 = 3
            if (r0 != r1) goto L1c7
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.String r2 = "Unclosed ' in @ file"
            r1.<init>(r2)
            throw r0
        L1c7:
            r0 = r8
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.String> formatOptionsToMap(java.util.List<java.lang.String> r6) throws lombok.delombok.Delombok.InvalidFormatOptionException {
            r0 = 0
            r7 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto Lc9
        L15:
            r0 = r10
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r9
            r1 = 58
            int r0 = r0.indexOf(r1)
            r11 = r0
            r0 = r11
            r1 = -1
            if (r0 != r1) goto L48
            r0 = r9
            java.lang.String r1 = "pretty"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L3d
            r0 = 1
            r7 = r0
            goto Lc9
        L3d:
            lombok.delombok.Delombok$InvalidFormatOptionException r0 = new lombok.delombok.Delombok$InvalidFormatOptionException
            r1 = r0
            java.lang.String r2 = "Format keys need to be 2 values separated with a colon."
            r1.<init>(r2)
            throw r0
        L48:
            r0 = r9
            r1 = 0
            r2 = r11
            java.lang.String r0 = r0.substring(r1, r2)
            r12 = r0
            r0 = r9
            r1 = r11
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            r13 = r0
            r0 = 0
            r14 = r0
            java.util.Map r0 = lombok.delombok.FormatPreferences.getKeysAndDescriptions()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
            goto L8c
        L70:
            r0 = r16
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r15 = r0
            r0 = r15
            r1 = r12
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L8c
            r0 = 1
            r14 = r0
            goto L96
        L8c:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L70
        L96:
            r0 = r14
            if (r0 != 0) goto Lbb
            lombok.delombok.Delombok$InvalidFormatOptionException r0 = new lombok.delombok.Delombok$InvalidFormatOptionException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Unknown format key: '"
            r3.<init>(r4)
            r3 = r12
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "'."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lbb:
            r0 = r8
            r1 = r12
            java.lang.String r1 = r1.toLowerCase()
            r2 = r13
            java.lang.Object r0 = r0.put(r1, r2)
        Lc9:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L15
            r0 = r7
            if (r0 == 0) goto L154
            r0 = r8
            java.lang.String r1 = "suppresswarnings"
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Lf0
            r0 = r8
            java.lang.String r1 = "suppresswarnings"
            java.lang.String r2 = "skip"
            java.lang.Object r0 = r0.put(r1, r2)
        Lf0:
            r0 = r8
            java.lang.String r1 = "generated"
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L109
            r0 = r8
            java.lang.String r1 = "generated"
            java.lang.String r2 = "skip"
            java.lang.Object r0 = r0.put(r1, r2)
        L109:
            r0 = r8
            java.lang.String r1 = "dancearoundidechecks"
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L122
            r0 = r8
            java.lang.String r1 = "dancearoundidechecks"
            java.lang.String r2 = "skip"
            java.lang.Object r0 = r0.put(r1, r2)
        L122:
            r0 = r8
            java.lang.String r1 = "generatedelombokcomment"
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L13b
            r0 = r8
            java.lang.String r1 = "generatedelombokcomment"
            java.lang.String r2 = "skip"
            java.lang.Object r0 = r0.put(r1, r2)
        L13b:
            r0 = r8
            java.lang.String r1 = "javalangasfqn"
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L154
            r0 = r8
            java.lang.String r1 = "javalangasfqn"
            java.lang.String r2 = "skip"
            java.lang.Object r0 = r0.put(r1, r2)
        L154:
            r0 = r8
            return r0
    }

    public void setFormatPreferences(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.formatPrefs = r1
            return
    }

    public void setCharset(java.lang.String r4) throws java.nio.charset.UnsupportedCharsetException {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto Lc
            r0 = r3
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
            r0.charset = r1
            return
        Lc:
            r0 = r3
            r1 = r4
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            r0.charset = r1
            return
    }

    public void setDiagnosticsListener(javax.tools.DiagnosticListener<javax.tools.JavaFileObject> r5) {
            r4 = this;
            r0 = r5
            if (r0 == 0) goto Lf
            r0 = r4
            com.sun.tools.javac.util.Context r0 = r0.context
            java.lang.Class<javax.tools.DiagnosticListener> r1 = javax.tools.DiagnosticListener.class
            r2 = r5
            r0.put(r1, r2)
        Lf:
            return
    }

    public void setForceProcess(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.force = r1
            return
    }

    public void setFeedback(java.io.PrintStream r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.feedback = r1
            return
    }

    public void setClasspath(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.classpath = r1
            return
    }

    public void setSourcepath(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.sourcepath = r1
            return
    }

    public void setBootclasspath(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.bootclasspath = r1
            return
    }

    public void setVerbose(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.verbose = r1
            return
    }

    public void setNoCopy(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.noCopy = r1
            return
    }

    public void setDisablePreview(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.disablePreview = r1
            return
    }

    public void setOnlyChanged(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.onlyChanged = r1
            return
    }

    public void setOutput(java.io.File r5) {
            r4 = this;
            r0 = r5
            boolean r0 = r0.isFile()
            if (r0 != 0) goto L1b
            r0 = r5
            boolean r0 = r0.isDirectory()
            if (r0 != 0) goto L26
            r0 = r5
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = ".java"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L26
        L1b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "DELOMBOK: delombok will only write to a directory. If you want to delombok a single file, use -p to output to standard output, then redirect this to a file:\ndelombok MyJavaFile.java -p >MyJavaFileDelombok.java"
            r1.<init>(r2)
            throw r0
        L26:
            r0 = r4
            r1 = r5
            r0.output = r1
            return
    }

    public void setOutputToStandardOut() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.output = r1
            return
    }

    public void setModulepath(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.modulepath = r1
            return
    }

    public void addDirectory(java.io.File r7) throws java.io.IOException {
            r6 = this;
            r0 = r6
            r1 = 0
            r2 = r7
            java.lang.String r3 = ""
            r4 = 0
            r0.addDirectory0(r1, r2, r3, r4)
            return
    }

    public void addDirectory1(boolean r8, java.io.File r9, java.lang.String r10) throws java.io.IOException {
            r7 = this;
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3)
            r11 = r0
            r0 = r11
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L4b
            r0 = r11
            java.lang.String r0 = getExtension(r0)
            r12 = r0
            r0 = r12
            java.lang.String r1 = "java"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            r0 = r7
            r1 = r9
            r2 = r10
            r0.addFile(r1, r2)
            goto L8c
        L2e:
            r0 = r12
            java.lang.String r1 = "class"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L41
            r0 = r7
            r1 = r10
            r0.skipClass(r1)
            goto L8c
        L41:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.copy(r1, r2, r3)
            goto L8c
        L4b:
            r0 = r11
            boolean r0 = r0.exists()
            if (r0 != 0) goto L6d
            r0 = r7
            java.io.PrintStream r0 = r0.feedback
            java.lang.String r1 = "Skipping %s because it does not exist.\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r11
            java.lang.String r5 = canonical(r5)
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            goto L8c
        L6d:
            r0 = r11
            boolean r0 = r0.isDirectory()
            if (r0 != 0) goto L8c
            r0 = r7
            java.io.PrintStream r0 = r0.feedback
            java.lang.String r1 = "Skipping %s because it is a special file type.\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r11
            java.lang.String r5 = canonical(r5)
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L8c:
            return
    }

    private void addDirectory0(boolean r8, java.io.File r9, java.lang.String r10, int r11) throws java.io.IOException {
            r7 = this;
            r0 = r10
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            r0 = r9
            goto L14
        Lb:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3)
        L14:
            r12 = r0
            r0 = r12
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto L14a
            r0 = r8
            if (r0 != 0) goto L3e
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r12
            java.lang.String r2 = canonical(r2)
            r1.<init>(r2)
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L3e
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            r13 = r0
            r0 = r11
            r1 = 100
            if (r0 < r1) goto L5e
            r0 = r7
            java.io.PrintStream r0 = r0.feedback
            java.lang.String r1 = "Over 100 subdirectories? I'm guessing there's a loop in your directory structure. Skipping: %s\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r10
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            goto L160
        L5e:
            r0 = r12
            java.io.File[] r0 = r0.listFiles()
            r14 = r0
            r0 = r14
            int r0 = r0.length
            if (r0 <= 0) goto Lf7
            r0 = r13
            if (r0 == 0) goto L95
            r0 = r7
            boolean r0 = r0.noCopy
            if (r0 != 0) goto L95
            r0 = r7
            java.io.File r0 = r0.output
            if (r0 == 0) goto L95
            r0 = r7
            java.io.PrintStream r0 = r0.feedback
            java.lang.String r1 = "Only processing java files (not copying non-java files) in %s because it's a hidden directory.\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r12
            java.lang.String r5 = canonical(r5)
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L95:
            r0 = r14
            r1 = r0
            r18 = r1
            int r0 = r0.length
            r17 = r0
            r0 = 0
            r16 = r0
            goto Led
        La3:
            r0 = r18
            r1 = r16
            r0 = r0[r1]
            r15 = r0
            r0 = r7
            r1 = r8
            if (r1 != 0) goto Lb8
            r1 = r13
            if (r1 != 0) goto Lb8
            r1 = 0
            goto Lb9
        Lb8:
            r1 = 1
        Lb9:
            r2 = r9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r5 = r10
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.<init>(r5)
            r4 = r10
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto Ld2
            java.lang.String r4 = ""
            goto Ld5
        Ld2:
            java.lang.String r4 = java.io.File.separator
        Ld5:
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r15
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = r11
            r5 = 1
            int r4 = r4 + r5
            r0.addDirectory0(r1, r2, r3, r4)
            int r16 = r16 + 1
        Led:
            r0 = r16
            r1 = r17
            if (r0 < r1) goto La3
            goto L160
        Lf7:
            r0 = r13
            if (r0 != 0) goto L160
            r0 = r7
            boolean r0 = r0.noCopy
            if (r0 != 0) goto L160
            r0 = r8
            if (r0 != 0) goto L160
            r0 = r7
            java.io.File r0 = r0.output
            if (r0 == 0) goto L160
            r0 = r10
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L160
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r7
            java.io.File r2 = r2.output
            r3 = r10
            r1.<init>(r2, r3)
            r15 = r0
            r0 = r15
            boolean r0 = r0.mkdirs()
            r0 = r7
            boolean r0 = r0.verbose
            if (r0 == 0) goto L160
            r0 = r7
            java.io.PrintStream r0 = r0.feedback
            java.lang.String r1 = "Creating empty directory: %s\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r15
            java.lang.String r5 = canonical(r5)
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            goto L160
        L14a:
            r0 = r7
            r1 = r8
            if (r1 != 0) goto L15a
            r1 = r7
            boolean r1 = r1.noCopy
            if (r1 != 0) goto L15a
            r1 = 1
            goto L15b
        L15a:
            r1 = 0
        L15b:
            r2 = r9
            r3 = r10
            r0.addDirectory1(r1, r2, r3)
        L160:
            return
    }

    private void skipClass(java.lang.String r8) {
            r7 = this;
            r0 = r7
            boolean r0 = r0.verbose
            if (r0 == 0) goto L1a
            r0 = r7
            java.io.PrintStream r0 = r0.feedback
            java.lang.String r1 = "Skipping class file: %s\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L1a:
            return
    }

    private void copy(boolean r8, java.io.File r9, java.lang.String r10) throws java.io.IOException {
            r7 = this;
            r0 = r7
            java.io.File r0 = r0.output
            if (r0 != 0) goto L1b
            r0 = r7
            java.io.PrintStream r0 = r0.feedback
            java.lang.String r1 = "Skipping resource file: %s\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r10
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            return
        L1b:
            r0 = r8
            if (r0 != 0) goto L3a
            r0 = r7
            boolean r0 = r0.verbose
            if (r0 == 0) goto L39
            r0 = r7
            java.io.PrintStream r0 = r0.feedback
            java.lang.String r1 = "Skipping resource file: %s\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r10
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L39:
            return
        L3a:
            r0 = r7
            boolean r0 = r0.verbose
            if (r0 == 0) goto L54
            r0 = r7
            java.io.PrintStream r0 = r0.feedback
            java.lang.String r1 = "Copying resource file: %s\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r10
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L54:
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r0 = new byte[r0]
            r11 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3)
            r12 = r0
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            r13 = r0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Lc4
            r1 = r0
            r2 = r7
            java.io.File r2 = r2.output     // Catch: java.lang.Throwable -> Lc4
            r3 = r10
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lc4
            r14 = r0
            r0 = r14
            java.io.File r0 = r0.getParentFile()     // Catch: java.lang.Throwable -> Lc4
            boolean r0 = r0.mkdirs()     // Catch: java.lang.Throwable -> Lc4
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lc4
            r1 = r0
            r2 = r14
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc4
            r15 = r0
        L93:
            r0 = r13
            r1 = r11
            int r0 = r0.read(r1)     // Catch: java.lang.Throwable -> Lb2 java.lang.Throwable -> Lc4
            r16 = r0
            r0 = r16
            r1 = -1
            if (r0 != r1) goto La5
            goto Lbc
        La5:
            r0 = r15
            r1 = r11
            r2 = 0
            r3 = r16
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> Lb2 java.lang.Throwable -> Lc4
            goto L93
        Lb2:
            r17 = move-exception
            r0 = r15
            r0.close()     // Catch: java.lang.Throwable -> Lc4
            r0 = r17
            throw r0     // Catch: java.lang.Throwable -> Lc4
        Lbc:
            r0 = r15
            r0.close()     // Catch: java.lang.Throwable -> Lc4
            goto Lce
        Lc4:
            r18 = move-exception
            r0 = r13
            r0.close()
            r0 = r18
            throw r0
        Lce:
            r0 = r13
            r0.close()
            return
    }

    public void addFile(java.io.File r6, java.lang.String r7) throws java.io.IOException {
            r5 = this;
            r0 = r5
            java.io.File r0 = r0.output
            if (r0 == 0) goto L23
            r0 = r6
            java.lang.String r0 = canonical(r0)
            r1 = r5
            java.io.File r1 = r1.output
            java.lang.String r1 = canonical(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L23
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.String r2 = "DELOMBOK: Output file and input file refer to the same filesystem location. Specify a separate path for output."
            r1.<init>(r2)
            throw r0
        L23:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r5
            java.util.List<java.io.File> r0 = r0.filesToParse
            r1 = r8
            boolean r0 = r0.add(r1)
            r0 = r5
            java.util.LinkedHashMap<java.io.File, java.io.File> r0 = r0.fileToBase
            r1 = r8
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    public void addAdditionalAnnotationProcessor(javax.annotation.processing.AbstractProcessor r4) {
            r3 = this;
            r0 = r3
            java.util.List<javax.annotation.processing.AbstractProcessor> r0 = r0.additionalAnnotationProcessors
            r1 = r4
            boolean r0 = r0.add(r1)
            return
    }

    private static <T> com.sun.tools.javac.util.List<T> toJavacList(java.util.List<T> r3) {
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r4 = r0
            r0 = r3
            r1 = r3
            int r1 = r1.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
            r5 = r0
            goto L1f
        L14:
            r0 = r4
            r1 = r5
            java.lang.Object r1 = r1.previous()
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r4 = r0
        L1f:
            r0 = r5
            boolean r0 = r0.hasPrevious()
            if (r0 != 0) goto L14
            r0 = r4
            return r0
    }

    private static java.lang.reflect.Field getModuleField() {
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCCompilationUnit> r0 = com.sun.tools.javac.tree.JCTree.JCCompilationUnit.class
            java.lang.String r1 = "modle"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.NoSuchFieldException -> La java.lang.SecurityException -> Ld
            return r0
        La:
            r0 = 0
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public boolean delombok() throws java.io.IOException {
            r8 = this;
            r0 = r8
            com.sun.tools.javac.util.Context r0 = r0.context
            lombok.javac.LombokOptions r0 = lombok.delombok.LombokOptionsFactory.getDelombokOptions(r0)
            r9 = r0
            r0 = r9
            r0.deleteLombokAnnotations()
            r0 = r9
            java.lang.String r1 = "ENCODING"
            r2 = r8
            java.nio.charset.Charset r2 = r2.charset
            java.lang.String r2 = r2.name()
            r0.putJavacOption(r1, r2)
            r0 = r8
            java.lang.String r0 = r0.classpath
            if (r0 == 0) goto L30
            r0 = r9
            java.lang.String r1 = "CLASSPATH"
            r2 = r8
            r3 = r8
            java.lang.String r3 = r3.classpath
            java.lang.String r2 = r2.unpackClasspath(r3)
            r0.putJavacOption(r1, r2)
        L30:
            r0 = r8
            java.lang.String r0 = r0.sourcepath
            if (r0 == 0) goto L42
            r0 = r9
            java.lang.String r1 = "SOURCEPATH"
            r2 = r8
            java.lang.String r2 = r2.sourcepath
            r0.putJavacOption(r1, r2)
        L42:
            r0 = r8
            java.lang.String r0 = r0.bootclasspath
            if (r0 == 0) goto L58
            r0 = r9
            java.lang.String r1 = "BOOTCLASSPATH"
            r2 = r8
            r3 = r8
            java.lang.String r3 = r3.bootclasspath
            java.lang.String r2 = r2.unpackClasspath(r3)
            r0.putJavacOption(r1, r2)
        L58:
            r0 = r9
            lombok.delombok.FormatPreferences r1 = new lombok.delombok.FormatPreferences
            r2 = r1
            r3 = r8
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.formatPrefs
            r2.<init>(r3)
            r0.setFormatPreferences(r1)
            r0 = r9
            java.lang.String r1 = "compilePolicy"
            java.lang.String r2 = "check"
            r0.put(r1, r2)
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()
            r1 = 9
            if (r0 < r1) goto L1d6
            r0 = r8
            com.sun.tools.javac.util.Context r0 = r0.context
            com.sun.tools.javac.main.Arguments r0 = com.sun.tools.javac.main.Arguments.instance(r0)
            r10 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r8
            java.lang.String r0 = r0.classpath
            if (r0 == 0) goto La8
            r0 = r11
            java.lang.String r1 = "--class-path"
            boolean r0 = r0.add(r1)
            r0 = r11
            r1 = r9
            java.lang.String r2 = "--class-path"
            java.lang.String r1 = r1.get(r2)
            boolean r0 = r0.add(r1)
        La8:
            r0 = r8
            java.lang.String r0 = r0.sourcepath
            if (r0 == 0) goto Lc7
            r0 = r11
            java.lang.String r1 = "--source-path"
            boolean r0 = r0.add(r1)
            r0 = r11
            r1 = r9
            java.lang.String r2 = "--source-path"
            java.lang.String r1 = r1.get(r2)
            boolean r0 = r0.add(r1)
        Lc7:
            r0 = r8
            java.lang.String r0 = r0.bootclasspath
            if (r0 == 0) goto Le6
            r0 = r11
            java.lang.String r1 = "--boot-class-path"
            boolean r0 = r0.add(r1)
            r0 = r11
            r1 = r9
            java.lang.String r2 = "--boot-class-path"
            java.lang.String r1 = r1.get(r2)
            boolean r0 = r0.add(r1)
        Le6:
            r0 = r8
            java.nio.charset.Charset r0 = r0.charset
            if (r0 == 0) goto L105
            r0 = r11
            java.lang.String r1 = "-encoding"
            boolean r0 = r0.add(r1)
            r0 = r11
            r1 = r8
            java.nio.charset.Charset r1 = r1.charset
            java.lang.String r1 = r1.name()
            boolean r0 = r0.add(r1)
        L105:
            java.lang.String r0 = getPathOfSelf()
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L155
            r0 = r11
            java.lang.String r1 = "--module-path"
            boolean r0 = r0.add(r1)
            r0 = r11
            r1 = r8
            java.lang.String r1 = r1.modulepath
            if (r1 == 0) goto L12b
            r1 = r8
            java.lang.String r1 = r1.modulepath
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L130
        L12b:
            r1 = r12
            goto L14c
        L130:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r12
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = java.io.File.pathSeparator
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.String r2 = r2.modulepath
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        L14c:
            boolean r0 = r0.add(r1)
            goto L17b
        L155:
            r0 = r8
            java.lang.String r0 = r0.modulepath
            if (r0 == 0) goto L17b
            r0 = r8
            java.lang.String r0 = r0.modulepath
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L17b
            r0 = r11
            java.lang.String r1 = "--module-path"
            boolean r0 = r0.add(r1)
            r0 = r11
            r1 = r8
            java.lang.String r1 = r1.modulepath
            boolean r0 = r0.add(r1)
        L17b:
            r0 = r8
            boolean r0 = r0.disablePreview
            if (r0 != 0) goto L194
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()
            r1 = 11
            if (r0 < r1) goto L194
            r0 = r11
            java.lang.String r1 = "--enable-preview"
            boolean r0 = r0.add(r1)
        L194:
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()
            r1 = 15
            if (r0 >= r1) goto L1b7
            r0 = r11
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r13 = r0
            r0 = r10
            java.lang.String r1 = "javac"
            r2 = r13
            r0.init(r1, r2)
            goto L1bf
        L1b7:
            r0 = r10
            java.lang.String r1 = "javac"
            r2 = r11
            r0.init(r1, r2)
        L1bf:
            r0 = r9
            java.lang.String r1 = "diags.legacy"
            java.lang.String r2 = "TRUE"
            r0.put(r1, r2)
            r0 = r9
            java.lang.String r1 = "allowStringFolding"
            java.lang.String r2 = "FALSE"
            r0.put(r1, r2)
            goto L1f2
        L1d6:
            r0 = r8
            java.lang.String r0 = r0.modulepath
            if (r0 == 0) goto L1f2
            r0 = r8
            java.lang.String r0 = r0.modulepath
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1f2
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "DELOMBOK: Option --module-path requires usage of JDK9 or higher."
            r1.<init>(r2)
            throw r0
        L1f2:
            r0 = r8
            com.sun.tools.javac.util.Context r0 = r0.context
            int r1 = lombok.javac.Javac.getJavaCompilerVersion()
            r2 = 13
            if (r1 < r2) goto L202
            r1 = 1
            goto L203
        L202:
            r1 = 0
        L203:
            lombok.javac.CommentCatcher r0 = lombok.javac.CommentCatcher.create(r0, r1)
            r10 = r0
            r0 = r10
            com.sun.tools.javac.main.JavaCompiler r0 = r0.getCompiler()
            r11 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r12 = r0
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r1 = r0
            r1.<init>()
            r13 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r1 = r0
            r1.<init>()
            r14 = r0
            r0 = r14
            lombok.javac.apt.LombokProcessor r1 = new lombok.javac.apt.LombokProcessor
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r14
            r1 = r8
            java.util.List<javax.annotation.processing.AbstractProcessor> r1 = r1.additionalAnnotationProcessors
            boolean r0 = r0.addAll(r1)
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()
            r1 = 9
            if (r0 < r1) goto L284
            r0 = r8
            com.sun.tools.javac.util.Context r0 = r0.context
            java.lang.Class<javax.tools.JavaFileManager> r1 = javax.tools.JavaFileManager.class
            java.lang.Object r0 = r0.get(r1)
            javax.tools.JavaFileManager r0 = (javax.tools.JavaFileManager) r0
            r15 = r0
            r0 = r15
            boolean r0 = r0 instanceof com.sun.tools.javac.file.BaseFileManager
            if (r0 == 0) goto L284
            r0 = r8
            com.sun.tools.javac.util.Context r0 = r0.context
            com.sun.tools.javac.main.Arguments r0 = com.sun.tools.javac.main.Arguments.instance(r0)
            r16 = r0
            r0 = r15
            com.sun.tools.javac.file.BaseFileManager r0 = (com.sun.tools.javac.file.BaseFileManager) r0
            r1 = r8
            com.sun.tools.javac.util.Context r1 = r1.context
            r0.setContext(r1)
            r0 = r15
            com.sun.tools.javac.file.BaseFileManager r0 = (com.sun.tools.javac.file.BaseFileManager) r0
            r1 = r16
            java.util.Map r1 = r1.getDeferredFileManagerOptions()
            boolean r0 = r0.handleOptions(r1)
        L284:
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()
            r1 = 9
            if (r0 >= r1) goto L295
            r0 = r11
            r1 = r14
            r0.initProcessAnnotations(r1)
            goto L2a1
        L295:
            r0 = r11
            r1 = r14
            java.util.Set r2 = java.util.Collections.emptySet()
            java.util.Set r3 = java.util.Collections.emptySet()
            r0.initProcessAnnotations(r1, r2, r3)
        L2a1:
            r0 = 0
            r15 = r0
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()
            r1 = 9
            if (r0 < r1) goto L2b8
            r0 = r8
            com.sun.tools.javac.util.Context r0 = r0.context
            com.sun.tools.javac.code.Symtab r0 = com.sun.tools.javac.code.Symtab.instance(r0)
            com.sun.tools.javac.code.Symbol$ModuleSymbol r0 = r0.unnamedModule
            r15 = r0
        L2b8:
            r0 = r8
            java.util.List<java.io.File> r0 = r0.filesToParse
            java.util.Iterator r0 = r0.iterator()
            r17 = r0
            goto L31e
        L2c6:
            r0 = r17
            java.lang.Object r0 = r0.next()
            java.io.File r0 = (java.io.File) r0
            r16 = r0
            r0 = r11
            r1 = r16
            java.lang.String r1 = r1.getAbsolutePath()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = r0.parse(r1)
            r18 = r0
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()
            r1 = 9
            if (r0 < r1) goto L2fe
            java.lang.reflect.Field r0 = lombok.delombok.Delombok.MODULE_FIELD     // Catch: java.lang.IllegalAccessException -> L2f2
            r1 = r18
            r2 = r15
            r0.set(r1, r2)     // Catch: java.lang.IllegalAccessException -> L2f2
            goto L2fe
        L2f2:
            r19 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r19
            r1.<init>(r2)
            throw r0
        L2fe:
            r0 = r13
            r1 = r18
            r2 = r8
            java.util.LinkedHashMap<java.io.File, java.io.File> r2 = r2.fileToBase
            r3 = r16
            java.lang.Object r2 = r2.get(r3)
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r12
            r1 = r18
            boolean r0 = r0.add(r1)
        L31e:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2c6
            r0 = r11
            int r0 = r0.errorCount()
            if (r0 <= 0) goto L331
            r0 = 0
            return r0
        L331:
            r0 = r12
            java.util.Iterator r0 = r0.iterator()
            r17 = r0
            goto L361
        L33d:
            r0 = r17
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
            r16 = r0
            r0 = r10
            r1 = r16
            lombok.delombok.DocCommentIntegrator r2 = new lombok.delombok.DocCommentIntegrator
            r3 = r2
            r3.<init>()
            r3 = r10
            r4 = r16
            java.util.List r3 = r3.getComments(r4)
            r4 = r16
            java.util.List r2 = r2.integrate(r3, r4)
            r0.setComments(r1, r2)
        L361:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L33d
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()
            r1 = 9
            if (r0 < r1) goto L389
            r0 = r11
            r1 = r12
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit[] r2 = new com.sun.tools.javac.tree.JCTree.JCCompilationUnit[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit[] r1 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit[]) r1
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.from(r1)
            com.sun.tools.javac.util.List r0 = r0.initModules(r1)
        L389:
            r0 = r11
            r1 = r12
            com.sun.tools.javac.util.List r1 = toJavacList(r1)
            com.sun.tools.javac.util.List r0 = r0.enterTrees(r1)
            r16 = r0
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()
            r1 = 9
            if (r0 >= r1) goto L3aa
            r0 = r11
            r1 = r16
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.main.JavaCompiler r0 = r0.processAnnotations(r1, r2)
            r17 = r0
            goto L3ba
        L3aa:
            r0 = r11
            r17 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r18 = r0
            r0 = r11
            r1 = r16
            r2 = r18
            r0.processAnnotations(r1, r2)
        L3ba:
            r0 = r17
            r1 = r17
            com.sun.tools.javac.comp.Todo r1 = r1.todo
            java.lang.Object r0 = callAttributeMethodOnJavaCompiler(r0, r1)
            r18 = r0
            r0 = r17
            r1 = r18
            callFlowMethodOnJavaCompiler(r0, r1)
            lombok.delombok.FormatPreferences r0 = new lombok.delombok.FormatPreferences
            r1 = r0
            r2 = r8
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.formatPrefs
            r1.<init>(r2)
            r19 = r0
            r0 = r12
            java.util.Iterator r0 = r0.iterator()
            r21 = r0
            goto L5ab
        L3e6:
            r0 = r21
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
            r20 = r0
            lombok.delombok.DelombokResult r0 = new lombok.delombok.DelombokResult
            r1 = r0
            r2 = r10
            r3 = r20
            java.util.List r2 = r2.getComments(r3)
            r3 = r10
            r4 = r20
            java.util.List r3 = r3.getTextBlockStarts(r4)
            r4 = r20
            r5 = r8
            boolean r5 = r5.force
            if (r5 != 0) goto L418
            r5 = r9
            r6 = r20
            boolean r5 = r5.isChanged(r6)
            if (r5 != 0) goto L418
            r5 = 0
            goto L419
        L418:
            r5 = 1
        L419:
            r6 = r19
            r1.<init>(r2, r3, r4, r5, r6)
            r22 = r0
            r0 = r8
            boolean r0 = r0.onlyChanged
            if (r0 == 0) goto L464
            r0 = r22
            boolean r0 = r0.isChanged()
            if (r0 != 0) goto L464
            r0 = r9
            r1 = r20
            boolean r0 = r0.isChanged(r1)
            if (r0 != 0) goto L464
            r0 = r8
            boolean r0 = r0.verbose
            if (r0 == 0) goto L5ab
            r0 = r8
            java.io.PrintStream r0 = r0.feedback
            java.lang.String r1 = "File: %s [%s]\n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r20
            javax.tools.JavaFileObject r5 = r5.sourcefile
            java.lang.String r5 = r5.getName()
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.String r5 = "unchanged (skipped)"
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            goto L5ab
        L464:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r23 = r0
            r0 = r20
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r25 = r0
            goto L4be
        L47a:
            r0 = r25
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r24 = r0
            r0 = r24
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCImport
            if (r0 == 0) goto L4b6
            lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree$JCImport, java.lang.Boolean> r0 = lombok.javac.JavacAugments.JCImport_deletable
            r1 = r24
            com.sun.tools.javac.tree.JCTree$JCImport r1 = (com.sun.tools.javac.tree.JCTree.JCImport) r1
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r26 = r0
            r0 = r26
            if (r0 == 0) goto L4ab
            r0 = r26
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4be
        L4ab:
            r0 = r23
            r1 = r24
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L4be
        L4b6:
            r0 = r23
            r1 = r24
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L4be:
            r0 = r25
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L47a
            r0 = r20
            r1 = r23
            com.sun.tools.javac.util.List r1 = r1.toList()
            r0.defs = r1
            r0 = r8
            boolean r0 = r0.verbose
            if (r0 == 0) goto L525
            r0 = r8
            java.io.PrintStream r0 = r0.feedback
            java.lang.String r1 = "File: %s [%s%s]\n"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r20
            javax.tools.JavaFileObject r5 = r5.sourcefile
            java.lang.String r5 = r5.getName()
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r22
            boolean r5 = r5.isChanged()
            if (r5 == 0) goto L501
            java.lang.String r5 = "delomboked"
            goto L504
        L501:
            java.lang.String r5 = "unchanged"
        L504:
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r8
            boolean r5 = r5.force
            if (r5 == 0) goto L51d
            r5 = r9
            r6 = r20
            boolean r5 = r5.isChanged(r6)
            if (r5 != 0) goto L51d
            java.lang.String r5 = " (forced)"
            goto L520
        L51d:
            java.lang.String r5 = ""
        L520:
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L525:
            r0 = r8
            java.io.Writer r0 = r0.presetWriter
            if (r0 == 0) goto L539
            r0 = r8
            r1 = r8
            java.io.Writer r1 = r1.presetWriter
            java.io.Writer r0 = r0.createUnicodeEscapeWriter(r1)
            r24 = r0
            goto L569
        L539:
            r0 = r8
            java.io.File r0 = r0.output
            if (r0 != 0) goto L549
            r0 = r8
            java.io.Writer r0 = r0.createStandardOutWriter()
            r24 = r0
            goto L569
        L549:
            r0 = r8
            r1 = r8
            java.io.File r1 = r1.output
            r2 = r13
            r3 = r20
            java.lang.Object r2 = r2.get(r3)
            java.io.File r2 = (java.io.File) r2
            r3 = r20
            javax.tools.JavaFileObject r3 = r3.sourcefile
            java.net.URI r3 = r3.toUri()
            java.io.Writer r0 = r0.createFileWriter(r1, r2, r3)
            r24 = r0
        L569:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r1 = r0
            r2 = r24
            r1.<init>(r2)
            r25 = r0
            r0 = r22
            r1 = r25
            r0.print(r1)     // Catch: java.lang.Throwable -> L57e
            goto L597
        L57e:
            r26 = move-exception
            r0 = r8
            java.io.File r0 = r0.output
            if (r0 == 0) goto L58f
            r0 = r25
            r0.close()
            goto L594
        L58f:
            r0 = r25
            r0.flush()
        L594:
            r0 = r26
            throw r0
        L597:
            r0 = r8
            java.io.File r0 = r0.output
            if (r0 == 0) goto L5a6
            r0 = r25
            r0.close()
            goto L5ab
        L5a6:
            r0 = r25
            r0.flush()
        L5ab:
            r0 = r21
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L3e6
            r0 = r17
            r0.close()
            r0 = 1
            return r0
    }

    private java.lang.String unpackClasspath(java.lang.String r8) {
            r7 = this;
            r0 = r8
            java.lang.String r1 = java.io.File.pathSeparator
            java.lang.String r1 = java.util.regex.Pattern.quote(r1)
            java.lang.String[] r0 = r0.split(r1)
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r9
            r1 = r0
            r14 = r1
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r12 = r0
            goto Lc2
        L20:
            r0 = r14
            r1 = r12
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            java.lang.String r1 = "*"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L4b
            r0 = r10
            int r0 = r0.length()
            if (r0 <= 0) goto L41
            r0 = r10
            java.lang.String r1 = java.io.File.pathSeparator
            java.lang.StringBuilder r0 = r0.append(r1)
        L41:
            r0 = r10
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lbf
        L4b:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r11
            r3 = 0
            r4 = r11
            int r4 = r4.length()
            r5 = 2
            int r4 = r4 - r5
            java.lang.String r2 = r2.substring(r3, r4)
            r1.<init>(r2)
            r15 = r0
            r0 = r15
            java.io.File[] r0 = r0.listFiles()
            r16 = r0
            r0 = r16
            if (r0 != 0) goto L70
            goto Lbf
        L70:
            r0 = r16
            r1 = r0
            r20 = r1
            int r0 = r0.length
            r19 = r0
            r0 = 0
            r18 = r0
            goto Lb8
        L7e:
            r0 = r20
            r1 = r18
            r0 = r0[r1]
            r17 = r0
            r0 = r17
            boolean r0 = r0.isFile()
            if (r0 == 0) goto Lb5
            r0 = r10
            int r0 = r0.length()
            if (r0 <= 0) goto L9c
            r0 = r10
            java.lang.String r1 = java.io.File.pathSeparator
            java.lang.StringBuilder r0 = r0.append(r1)
        L9c:
            r0 = r10
            r1 = r11
            r2 = 0
            r3 = r11
            int r3 = r3.length()
            r4 = 1
            int r3 = r3 - r4
            java.lang.StringBuilder r0 = r0.append(r1, r2, r3)
            r0 = r10
            r1 = r17
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
        Lb5:
            int r18 = r18 + 1
        Lb8:
            r0 = r18
            r1 = r19
            if (r0 < r1) goto L7e
        Lbf:
            int r12 = r12 + 1
        Lc2:
            r0 = r12
            r1 = r13
            if (r0 < r1) goto L20
            r0 = r10
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.Object callAttributeMethodOnJavaCompiler(com.sun.tools.javac.main.JavaCompiler r7, com.sun.tools.javac.comp.Todo r8) {
            java.lang.reflect.Method r0 = lombok.delombok.Delombok.attributeMethod
            if (r0 != 0) goto L3f
            java.lang.Class<com.sun.tools.javac.main.JavaCompiler> r0 = com.sun.tools.javac.main.JavaCompiler.class
            java.lang.String r1 = "attribute"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1f
            r3 = r2
            r4 = 0
            java.lang.Class<java.util.Queue> r5 = java.util.Queue.class
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L1f
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1f
            lombok.delombok.Delombok.attributeMethod = r0     // Catch: java.lang.NoSuchMethodException -> L1f
            goto L3f
        L1f:
            java.lang.Class<com.sun.tools.javac.main.JavaCompiler> r0 = com.sun.tools.javac.main.JavaCompiler.class
            java.lang.String r1 = "attribute"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L39
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.util.ListBuffer> r5 = com.sun.tools.javac.util.ListBuffer.class
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L39
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L39
            lombok.delombok.Delombok.attributeMethod = r0     // Catch: java.lang.NoSuchMethodException -> L39
            goto L3f
        L39:
            r9 = move-exception
            r0 = r9
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L3f:
            java.lang.reflect.Method r0 = lombok.delombok.Delombok.attributeMethod
            r1 = r7
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
            return r0
    }

    private static void callFlowMethodOnJavaCompiler(com.sun.tools.javac.main.JavaCompiler r7, java.lang.Object r8) {
            java.lang.reflect.Method r0 = lombok.delombok.Delombok.flowMethod
            if (r0 != 0) goto L3f
            java.lang.Class<com.sun.tools.javac.main.JavaCompiler> r0 = com.sun.tools.javac.main.JavaCompiler.class
            java.lang.String r1 = "flow"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1f
            r3 = r2
            r4 = 0
            java.lang.Class<java.util.Queue> r5 = java.util.Queue.class
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L1f
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1f
            lombok.delombok.Delombok.flowMethod = r0     // Catch: java.lang.NoSuchMethodException -> L1f
            goto L3f
        L1f:
            java.lang.Class<com.sun.tools.javac.main.JavaCompiler> r0 = com.sun.tools.javac.main.JavaCompiler.class
            java.lang.String r1 = "flow"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L39
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L39
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L39
            lombok.delombok.Delombok.flowMethod = r0     // Catch: java.lang.NoSuchMethodException -> L39
            goto L3f
        L39:
            r9 = move-exception
            r0 = r9
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L3f:
            java.lang.reflect.Method r0 = lombok.delombok.Delombok.flowMethod
            r1 = r7
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
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

    private static java.lang.String getExtension(java.io.File r4) {
            r0 = r4
            java.lang.String r0 = r0.getName()
            r5 = r0
            r0 = r5
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r6 = r0
            r0 = r6
            r1 = -1
            if (r0 != r1) goto L17
            java.lang.String r0 = ""
            goto L1e
        L17:
            r0 = r5
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
        L1e:
            return r0
    }

    private java.io.Writer createFileWriter(java.io.File r8, java.io.File r9, java.net.URI r10) throws java.io.IOException {
            r7 = this;
            r0 = r9
            java.net.URI r0 = r0.toURI()
            r11 = r0
            r0 = r11
            r1 = r11
            r2 = r10
            java.net.URI r1 = r1.resolve(r2)
            java.net.URI r0 = r0.relativize(r1)
            r12 = r0
            r0 = r12
            boolean r0 = r0.isAbsolute()
            if (r0 == 0) goto L34
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r8
            java.io.File r3 = new java.io.File
            r4 = r3
            r5 = r12
            r4.<init>(r5)
            java.lang.String r3 = r3.getName()
            r1.<init>(r2, r3)
            r13 = r0
            goto L43
        L34:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r8
            r3 = r12
            java.lang.String r3 = r3.getPath()
            r1.<init>(r2, r3)
            r13 = r0
        L43:
            r0 = r13
            java.io.File r0 = r0.getParentFile()
            boolean r0 = r0.mkdirs()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            r14 = r0
            r0 = r7
            r1 = r14
            java.io.Writer r0 = r0.createUnicodeEscapeWriter(r1)
            return r0
    }

    private java.io.Writer createStandardOutWriter() {
            r3 = this;
            r0 = r3
            java.io.PrintStream r1 = java.lang.System.out
            java.io.Writer r0 = r0.createUnicodeEscapeWriter(r1)
            return r0
    }

    private java.io.Writer createUnicodeEscapeWriter(java.io.Writer r6) {
            r5 = this;
            lombok.delombok.UnicodeEscapeWriter r0 = new lombok.delombok.UnicodeEscapeWriter
            r1 = r0
            r2 = r6
            r3 = r5
            java.nio.charset.Charset r3 = r3.charset
            r1.<init>(r2, r3)
            return r0
    }

    private java.io.Writer createUnicodeEscapeWriter(java.io.OutputStream r8) {
            r7 = this;
            lombok.delombok.UnicodeEscapeWriter r0 = new lombok.delombok.UnicodeEscapeWriter
            r1 = r0
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            r3 = r2
            r4 = r8
            r5 = r7
            java.nio.charset.Charset r5 = r5.charset
            r3.<init>(r4, r5)
            r3 = r7
            java.nio.charset.Charset r3 = r3.charset
            r1.<init>(r2, r3)
            return r0
    }
}
