package lombok.delombok;

/* loaded from: com.usidqw.qwerklj.apk:lombok/delombok/FormatPreferences.SCL.lombok */
public final class FormatPreferences {
    private final java.lang.String indent;
    private final java.lang.Boolean filledEmpties;
    private final boolean generateFinalParams;
    private final boolean generateConstructorProperties;
    private final boolean generateSuppressWarnings;
    private final boolean danceAroundIdeChecks;
    private final boolean generateDelombokComment;
    private final boolean javaLangAsFqn;
    final java.util.Map<java.lang.String, java.lang.String> rawMap;
    private final boolean generateGenerated;
    static final java.util.Map<java.lang.String, java.lang.String> KEYS = null;

    static {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            java.lang.String r1 = "indent"
            java.lang.String r2 = "The indent to use. 'tab' can be used to represent 1 tab. A number means that many spaces. Default: 'tab'"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "emptyLines"
            java.lang.String r2 = "Either 'indent' or 'blank'. indent means: Indent an empty line to the right level. Default: 'blank'"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "finalParams"
            java.lang.String r2 = "Either 'generate' or 'skip'. generate means: All lombok-generated methods set all parameters to final. Default: 'generate'"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "constructorProperties"
            java.lang.String r2 = "Either 'generate' or 'skip'. generate means: All lombok-generated constructors with 1 or more arguments get an @ConstructorProperties annotation. Default: 'generate'"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "suppressWarnings"
            java.lang.String r2 = "Either 'generate' or 'skip'. generate means: All lombok-generated methods, types, and fields get a @SuppressWarnings annotation. Default: 'generate'"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "generated"
            java.lang.String r2 = "Either 'generate' or 'skip'. generate means: All lombok-generated methods, types, and fields get a @javax.annotation.Generated(\"lombok\") annotation. Default: 'generate'"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "danceAroundIdeChecks"
            java.lang.String r2 = "Either 'generate' or 'skip'. generate means: Lombok will intentionally obfuscate some generated code to avoid IDE warnings. Default: 'generate'"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "generateDelombokComment"
            java.lang.String r2 = "Either 'generate' or 'skip'. generate means: Any file modified by delombok will have a comment stating this at the top. Default: 'generate'"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.String r1 = "javaLangAsFQN"
            java.lang.String r2 = "Either 'generate' or 'skip'. generate means: Any generated reference to java.lang classes are prefixed with `java.lang.`. Default: 'generate'"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            lombok.delombok.FormatPreferences.KEYS = r0
            return
    }

    public FormatPreferences(java.util.Map<java.lang.String, java.lang.String> r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    public FormatPreferences(java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9, java.lang.Boolean r10) {
            r7 = this;
            r0 = r7
            r0.<init>()
            r0 = r7
            r1 = r8
            r0.rawMap = r1
            r0 = r8
            if (r0 != 0) goto L11
            java.util.Map r0 = java.util.Collections.emptyMap()
            r8 = r0
        L11:
            r0 = r8
            java.lang.String r1 = "indent"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L6d
            java.lang.String r0 = "scan"
            r1 = r11
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L6d
            r0 = r11
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L5b
            r12 = r0
            r0 = r12
            if (r0 <= 0) goto L5c
            r0 = r12
            r1 = 32
            if (r0 >= r1) goto L5c
            r0 = r12
            char[] r0 = new char[r0]     // Catch: java.lang.NumberFormatException -> L5b
            r13 = r0
            r0 = r13
            r1 = 32
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.NumberFormatException -> L5b
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.NumberFormatException -> L5b
            r1 = r0
            r2 = r13
            r1.<init>(r2)     // Catch: java.lang.NumberFormatException -> L5b
            r11 = r0
            goto L5c
        L5b:
        L5c:
            r0 = r11
            java.lang.String r1 = "\\t"
            java.lang.String r2 = "\t"
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r1 = "tab"
            java.lang.String r2 = "\t"
            java.lang.String r0 = r0.replace(r1, r2)
            r9 = r0
        L6d:
            r0 = r8
            java.lang.String r1 = "emptyLines"
            java.lang.String r1 = r1.toLowerCase()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r12 = r0
            java.lang.String r0 = "indent"
            r1 = r12
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L8f
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10 = r0
            goto Lba
        L8f:
            java.lang.String r0 = "blank"
            r1 = r12
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto La1
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10 = r0
            goto Lba
        La1:
            r0 = r12
            if (r0 == 0) goto Lba
            java.lang.String r0 = "scan"
            r1 = r12
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lba
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Legal values for 'emptyLines' are 'scan', 'indent', or 'blank'."
            r1.<init>(r2)
            throw r0
        Lba:
            r0 = r7
            r1 = r9
            r0.indent = r1
            r0 = r7
            r1 = r10
            r0.filledEmpties = r1
            r0 = r7
            r1 = r8
            java.lang.String r2 = "finalParams"
            java.lang.String r3 = "generate"
            java.lang.String r4 = "skip"
            r5 = 1
            boolean r1 = unrollBoolean(r1, r2, r3, r4, r5)
            r0.generateFinalParams = r1
            r0 = r7
            r1 = r8
            java.lang.String r2 = "constructorProperties"
            java.lang.String r3 = "generate"
            java.lang.String r4 = "skip"
            r5 = 1
            boolean r1 = unrollBoolean(r1, r2, r3, r4, r5)
            r0.generateConstructorProperties = r1
            r0 = r7
            r1 = r8
            java.lang.String r2 = "suppressWarnings"
            java.lang.String r3 = "generate"
            java.lang.String r4 = "skip"
            r5 = 1
            boolean r1 = unrollBoolean(r1, r2, r3, r4, r5)
            r0.generateSuppressWarnings = r1
            r0 = r7
            r1 = r8
            java.lang.String r2 = "generated"
            java.lang.String r3 = "generate"
            java.lang.String r4 = "skip"
            r5 = 1
            boolean r1 = unrollBoolean(r1, r2, r3, r4, r5)
            r0.generateGenerated = r1
            r0 = r7
            r1 = r8
            java.lang.String r2 = "danceAroundIdeChecks"
            java.lang.String r3 = "generate"
            java.lang.String r4 = "skip"
            r5 = 1
            boolean r1 = unrollBoolean(r1, r2, r3, r4, r5)
            r0.danceAroundIdeChecks = r1
            r0 = r7
            r1 = r8
            java.lang.String r2 = "generateDelombokComment"
            java.lang.String r3 = "generate"
            java.lang.String r4 = "skip"
            r5 = 1
            boolean r1 = unrollBoolean(r1, r2, r3, r4, r5)
            r0.generateDelombokComment = r1
            r0 = r7
            r1 = r8
            java.lang.String r2 = "javaLangAsFQN"
            java.lang.String r3 = "generate"
            java.lang.String r4 = "skip"
            r5 = 1
            boolean r1 = unrollBoolean(r1, r2, r3, r4, r5)
            r0.javaLangAsFqn = r1
            return
    }

    private static boolean unrollBoolean(java.util.Map<java.lang.String, java.lang.String> r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
            r0 = r6
            r1 = r7
            java.lang.String r1 = r1.toLowerCase()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L17
            r0 = r10
            return r0
        L17:
            r0 = r8
            r1 = r11
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L22
            r0 = 1
            return r0
        L22:
            r0 = r9
            r1 = r11
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L2d
            r0 = 0
            return r0
        L2d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Legal values for '"
            r3.<init>(r4)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "' are '"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "', or '"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "'."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public static java.util.Map<java.lang.String, java.lang.String> getKeysAndDescriptions() {
            java.util.Map<java.lang.String, java.lang.String> r0 = lombok.delombok.FormatPreferences.KEYS
            return r0
    }

    public boolean fillEmpties() {
            r2 = this;
            r0 = r2
            java.lang.Boolean r0 = r0.filledEmpties
            if (r0 != 0) goto Lb
            r0 = 0
            goto L12
        Lb:
            r0 = r2
            java.lang.Boolean r0 = r0.filledEmpties
            boolean r0 = r0.booleanValue()
        L12:
            return r0
    }

    public java.lang.String indent() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.indent
            if (r0 != 0) goto Lc
            java.lang.String r0 = "\t"
            goto L10
        Lc:
            r0 = r2
            java.lang.String r0 = r0.indent
        L10:
            return r0
    }

    public boolean generateSuppressWarnings() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.generateSuppressWarnings
            return r0
    }

    public boolean generateGenerated() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.generateGenerated
            return r0
    }

    public boolean generateFinalParams() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.generateFinalParams
            return r0
    }

    public boolean danceAroundIdeChecks() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.danceAroundIdeChecks
            return r0
    }

    public boolean generateDelombokComment() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.generateDelombokComment
            return r0
    }

    public boolean javaLangAsFqn() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.javaLangAsFqn
            return r0
    }

    public boolean generateConstructorProperties() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.generateConstructorProperties
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.rawMap
            java.lang.String r0 = r0.toString()
            return r0
    }
}
