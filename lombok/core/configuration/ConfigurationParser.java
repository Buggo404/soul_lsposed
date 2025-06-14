package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationParser.SCL.lombok */
public class ConfigurationParser {
    private static final java.util.regex.Pattern LINE = null;
    private static final java.util.regex.Pattern NEWLINE_FINDER = null;
    private static final java.util.regex.Pattern IMPORT = null;
    private lombok.core.configuration.ConfigurationProblemReporter reporter;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationParser$Collector.SCL.lombok */
    public interface Collector {
        void addImport(lombok.core.configuration.ConfigurationFile r1, lombok.core.configuration.ConfigurationFile r2, int r3);

        void clear(lombok.core.configuration.ConfigurationKey<?> r1, lombok.core.configuration.ConfigurationFile r2, int r3);

        void set(lombok.core.configuration.ConfigurationKey<?> r1, java.lang.Object r2, lombok.core.configuration.ConfigurationFile r3, int r4);

        void add(lombok.core.configuration.ConfigurationKey<?> r1, java.lang.Object r2, lombok.core.configuration.ConfigurationFile r3, int r4);

        void remove(lombok.core.configuration.ConfigurationKey<?> r1, java.lang.Object r2, lombok.core.configuration.ConfigurationFile r3, int r4);
    }

    static {
            java.lang.String r0 = "(?:clear\\s+([^=]+))|(?:(\\S*?)\\s*([-+]?=)\\s*(.*?))"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            lombok.core.configuration.ConfigurationParser.LINE = r0
            java.lang.String r0 = "^[\t ]*(.*?)[\t\r ]*$"
            r1 = 8
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            lombok.core.configuration.ConfigurationParser.NEWLINE_FINDER = r0
            java.lang.String r0 = "import\\s+(.+?)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            lombok.core.configuration.ConfigurationParser.IMPORT = r0
            return
    }

    public ConfigurationParser(lombok.core.configuration.ConfigurationProblemReporter r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r5
            if (r0 != 0) goto L12
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "reporter"
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r4
            r1 = r5
            r0.reporter = r1
            return
    }

    public void parse(lombok.core.configuration.ConfigurationFile r7, lombok.core.configuration.ConfigurationParser.Collector r8) {
            r6 = this;
            r0 = r6
            r1 = r7
            java.lang.CharSequence r0 = r0.contents(r1)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto Lb
            return
        Lb:
            java.util.Map r0 = lombok.core.configuration.ConfigurationKey.registeredKeys()
            r10 = r0
            r0 = 0
            r11 = r0
            java.util.regex.Pattern r0 = lombok.core.configuration.ConfigurationParser.NEWLINE_FINDER
            r1 = r9
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r12 = r0
            r0 = 1
            r13 = r0
            goto L2d0
        L22:
            r0 = r9
            r1 = r12
            r2 = 1
            int r1 = r1.start(r2)
            r2 = r12
            r3 = 1
            int r2 = r2.end(r3)
            java.lang.CharSequence r0 = r0.subSequence(r1, r2)
            r14 = r0
            int r11 = r11 + 1
            r0 = r14
            int r0 = r0.length()
            if (r0 == 0) goto L2d0
            r0 = r14
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 35
            if (r0 != r1) goto L53
            goto L2d0
        L53:
            java.util.regex.Pattern r0 = lombok.core.configuration.ConfigurationParser.IMPORT
            r1 = r14
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r15 = r0
            r0 = r15
            boolean r0 = r0.matches()
            if (r0 == 0) goto Ld7
            r0 = r13
            if (r0 != 0) goto L80
            r0 = r6
            lombok.core.configuration.ConfigurationProblemReporter r0 = r0.reporter
            r1 = r7
            java.lang.String r1 = r1.description()
            java.lang.String r2 = "Imports are only allowed in the top of the file"
            r3 = r11
            r4 = r14
            r0.report(r1, r2, r3, r4)
            goto L2d0
        L80:
            r0 = r15
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            r16 = r0
            r0 = r7
            r1 = r16
            lombok.core.configuration.ConfigurationFile r0 = r0.resolve(r1)
            r17 = r0
            r0 = r17
            if (r0 != 0) goto Lab
            r0 = r6
            lombok.core.configuration.ConfigurationProblemReporter r0 = r0.reporter
            r1 = r7
            java.lang.String r1 = r1.description()
            java.lang.String r2 = "Import is not valid"
            r3 = r11
            r4 = r14
            r0.report(r1, r2, r3, r4)
            goto L2d0
        Lab:
            r0 = r17
            boolean r0 = r0.exists()
            if (r0 != 0) goto Lc9
            r0 = r6
            lombok.core.configuration.ConfigurationProblemReporter r0 = r0.reporter
            r1 = r7
            java.lang.String r1 = r1.description()
            java.lang.String r2 = "Imported file does not exist"
            r3 = r11
            r4 = r14
            r0.report(r1, r2, r3, r4)
            goto L2d0
        Lc9:
            r0 = r8
            r1 = r17
            r2 = r7
            r3 = r11
            r0.addImport(r1, r2, r3)
            goto L2d0
        Ld7:
            java.util.regex.Pattern r0 = lombok.core.configuration.ConfigurationParser.LINE
            r1 = r14
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r16 = r0
            r0 = r16
            boolean r0 = r0.matches()
            if (r0 != 0) goto Lff
            r0 = r6
            lombok.core.configuration.ConfigurationProblemReporter r0 = r0.reporter
            r1 = r7
            java.lang.String r1 = r1.description()
            java.lang.String r2 = "Invalid line"
            r3 = r11
            r4 = r14
            r0.report(r1, r2, r3, r4)
            goto L2d0
        Lff:
            r0 = 0
            r13 = r0
            r0 = 0
            r17 = r0
            r0 = 0
            r18 = r0
            r0 = r16
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            if (r0 != 0) goto L12c
            r0 = r16
            r1 = 2
            java.lang.String r0 = r0.group(r1)
            r18 = r0
            r0 = r16
            r1 = 3
            java.lang.String r0 = r0.group(r1)
            r17 = r0
            r0 = r16
            r1 = 4
            java.lang.String r0 = r0.group(r1)
            r19 = r0
            goto L13b
        L12c:
            r0 = r16
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            r18 = r0
            java.lang.String r0 = "clear"
            r17 = r0
            r0 = 0
            r19 = r0
        L13b:
            r0 = r10
            r1 = r18
            java.lang.Object r0 = r0.get(r1)
            lombok.core.configuration.ConfigurationKey r0 = (lombok.core.configuration.ConfigurationKey) r0
            r20 = r0
            r0 = r20
            if (r0 != 0) goto L178
            r0 = r6
            lombok.core.configuration.ConfigurationProblemReporter r0 = r0.reporter
            r1 = r7
            java.lang.String r1 = r1.description()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Unknown key '"
            r3.<init>(r4)
            r3 = r18
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "'"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r11
            r4 = r14
            r0.report(r1, r2, r3, r4)
            goto L2d0
        L178:
            r0 = r20
            lombok.core.configuration.ConfigurationDataType r0 = r0.getType()
            r21 = r0
            r0 = r17
            java.lang.String r1 = "+="
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L197
            r0 = r17
            java.lang.String r1 = "-="
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L197
            r0 = 0
            goto L198
        L197:
            r0 = 1
        L198:
            r22 = r0
            r0 = r22
            if (r0 == 0) goto L1db
            r0 = r21
            boolean r0 = r0.isList()
            if (r0 != 0) goto L1db
            r0 = r6
            lombok.core.configuration.ConfigurationProblemReporter r0 = r0.reporter
            r1 = r7
            java.lang.String r1 = r1.description()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "'"
            r3.<init>(r4)
            r3 = r18
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "' is not a list and doesn't support "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r17
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " (only = and clear)"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r11
            r4 = r14
            r0.report(r1, r2, r3, r4)
            goto L2d0
        L1db:
            r0 = r17
            java.lang.String r1 = "="
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L217
            r0 = r21
            boolean r0 = r0.isList()
            if (r0 == 0) goto L217
            r0 = r6
            lombok.core.configuration.ConfigurationProblemReporter r0 = r0.reporter
            r1 = r7
            java.lang.String r1 = r1.description()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "'"
            r3.<init>(r4)
            r3 = r18
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "' is a list and cannot be assigned to (use +=, -= and clear instead)"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r11
            r4 = r14
            r0.report(r1, r2, r3, r4)
            goto L2d0
        L217:
            r0 = 0
            r23 = r0
            r0 = r19
            if (r0 == 0) goto L277
            r0 = r21
            lombok.core.configuration.ConfigurationValueParser r0 = r0.getParser()     // Catch: java.lang.Exception -> L230
            r1 = r19
            java.lang.Object r0 = r0.parse(r1)     // Catch: java.lang.Exception -> L230
            r23 = r0
            goto L277
        L230:
            r0 = r6
            lombok.core.configuration.ConfigurationProblemReporter r0 = r0.reporter
            r1 = r7
            java.lang.String r1 = r1.description()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Error while parsing the value for '"
            r3.<init>(r4)
            r3 = r18
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "' value '"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r19
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "' (should be "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r21
            lombok.core.configuration.ConfigurationValueParser r3 = r3.getParser()
            java.lang.String r3 = r3.exampleValue()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ")"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r11
            r4 = r14
            r0.report(r1, r2, r3, r4)
            goto L2d0
        L277:
            r0 = r17
            java.lang.String r1 = "clear"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28f
            r0 = r8
            r1 = r20
            r2 = r7
            r3 = r11
            r0.clear(r1, r2, r3)
            goto L2d0
        L28f:
            r0 = r17
            java.lang.String r1 = "="
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2a9
            r0 = r8
            r1 = r20
            r2 = r23
            r3 = r7
            r4 = r11
            r0.set(r1, r2, r3, r4)
            goto L2d0
        L2a9:
            r0 = r17
            java.lang.String r1 = "+="
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2c3
            r0 = r8
            r1 = r20
            r2 = r23
            r3 = r7
            r4 = r11
            r0.add(r1, r2, r3, r4)
            goto L2d0
        L2c3:
            r0 = r8
            r1 = r20
            r2 = r23
            r3 = r7
            r4 = r11
            r0.remove(r1, r2, r3, r4)
        L2d0:
            r0 = r12
            boolean r0 = r0.find()
            if (r0 != 0) goto L22
            return
    }

    private java.lang.CharSequence contents(lombok.core.configuration.ConfigurationFile r7) {
            r6 = this;
            r0 = r7
            java.lang.CharSequence r0 = r0.contents()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r8 = move-exception
            r0 = r6
            lombok.core.configuration.ConfigurationProblemReporter r0 = r0.reporter
            r1 = r7
            java.lang.String r1 = r1.description()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Exception while reading file: "
            r3.<init>(r4)
            r3 = r8
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            r4 = 0
            r0.report(r1, r2, r3, r4)
            r0 = 0
            return r0
    }
}
