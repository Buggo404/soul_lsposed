package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleConstructor.SCL.lombok */
public class HandleConstructor {
    private static final char[][] JAVA_BEANS_CONSTRUCTORPROPERTIES = null;
    private static final char[] DEFAULT_PREFIX = null;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleConstructor$HandleAllArgsConstructor.SCL.lombok */
    public static class HandleAllArgsConstructor extends lombok.eclipse.EclipseAnnotationHandler<lombok.AllArgsConstructor> {
        private static final java.lang.String NAME = null;
        private lombok.eclipse.handlers.HandleConstructor handleConstructor;

        static {
                java.lang.Class<lombok.AllArgsConstructor> r0 = lombok.AllArgsConstructor.class
                java.lang.String r0 = r0.getSimpleName()
                lombok.eclipse.handlers.HandleConstructor.HandleAllArgsConstructor.NAME = r0
                return
        }

        public HandleAllArgsConstructor() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                lombok.eclipse.handlers.HandleConstructor r1 = new lombok.eclipse.handlers.HandleConstructor
                r2 = r1
                r2.<init>()
                r0.handleConstructor = r1
                return
        }

        @Override // lombok.eclipse.EclipseAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.AllArgsConstructor> r11, org.eclipse.jdt.internal.compiler.ast.Annotation r12, lombok.eclipse.EclipseNode r13) {
                r10 = this;
                r0 = r13
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.ALL_ARGS_CONSTRUCTOR_FLAG_USAGE
                java.lang.String r2 = "@AllArgsConstructor"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.ANY_CONSTRUCTOR_FLAG_USAGE
                java.lang.String r4 = "any @xArgsConstructor"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                r0 = r13
                lombok.core.LombokNode r0 = r0.m66up()
                lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
                r14 = r0
                r0 = r14
                r1 = r13
                java.lang.String r2 = lombok.eclipse.handlers.HandleConstructor.HandleAllArgsConstructor.NAME
                boolean r0 = lombok.eclipse.handlers.HandleConstructor.checkLegality(r0, r1, r2)
                if (r0 != 0) goto L24
                return
            L24:
                r0 = r11
                java.lang.annotation.Annotation r0 = r0.getInstance()
                lombok.AllArgsConstructor r0 = (lombok.AllArgsConstructor) r0
                r15 = r0
                r0 = r15
                lombok.AccessLevel r0 = r0.access()
                r16 = r0
                r0 = r16
                lombok.AccessLevel r1 = lombok.AccessLevel.NONE
                if (r0 != r1) goto L3f
                return
            L3f:
                r0 = r15
                java.lang.String r0 = r0.staticName()
                r17 = r0
                r0 = r11
                java.lang.String r1 = "suppressConstructorProperties"
                boolean r0 = r0.isExplicit(r1)
                if (r0 == 0) goto L57
                r0 = r13
                java.lang.String r1 = "This deprecated feature is no longer supported. Remove it; you can create a lombok.config file with 'lombok.anyConstructor.suppressConstructorProperties = true'."
                r0.addError(r1)
            L57:
                r0 = r12
                java.lang.String r1 = "onConstructor"
                java.lang.String r2 = "@AllArgsConstructor(onConstructor"
                r3 = r13
                java.util.List r0 = lombok.eclipse.handlers.EclipseHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
                r18 = r0
                r0 = r10
                lombok.eclipse.handlers.HandleConstructor r0 = r0.handleConstructor
                r1 = r14
                r2 = r16
                r3 = r14
                java.util.List r3 = lombok.eclipse.handlers.HandleConstructor.findAllFields(r3)
                r4 = 0
                r5 = r17
                lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists r6 = lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.f573NO
                r7 = r18
                r8 = r13
                r0.generateConstructor(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleConstructor$HandleNoArgsConstructor.SCL.lombok */
    public static class HandleNoArgsConstructor extends lombok.eclipse.EclipseAnnotationHandler<lombok.NoArgsConstructor> {
        private static final java.lang.String NAME = null;
        private lombok.eclipse.handlers.HandleConstructor handleConstructor;

        static {
                java.lang.Class<lombok.NoArgsConstructor> r0 = lombok.NoArgsConstructor.class
                java.lang.String r0 = r0.getSimpleName()
                lombok.eclipse.handlers.HandleConstructor.HandleNoArgsConstructor.NAME = r0
                return
        }

        public HandleNoArgsConstructor() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                lombok.eclipse.handlers.HandleConstructor r1 = new lombok.eclipse.handlers.HandleConstructor
                r2 = r1
                r2.<init>()
                r0.handleConstructor = r1
                return
        }

        @Override // lombok.eclipse.EclipseAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.NoArgsConstructor> r11, org.eclipse.jdt.internal.compiler.ast.Annotation r12, lombok.eclipse.EclipseNode r13) {
                r10 = this;
                r0 = r13
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.NO_ARGS_CONSTRUCTOR_FLAG_USAGE
                java.lang.String r2 = "@NoArgsConstructor"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.ANY_CONSTRUCTOR_FLAG_USAGE
                java.lang.String r4 = "any @xArgsConstructor"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                r0 = r13
                lombok.core.LombokNode r0 = r0.m66up()
                lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
                r14 = r0
                r0 = r14
                r1 = r13
                java.lang.String r2 = lombok.eclipse.handlers.HandleConstructor.HandleNoArgsConstructor.NAME
                boolean r0 = lombok.eclipse.handlers.HandleConstructor.checkLegality(r0, r1, r2)
                if (r0 != 0) goto L24
                return
            L24:
                r0 = r11
                java.lang.annotation.Annotation r0 = r0.getInstance()
                lombok.NoArgsConstructor r0 = (lombok.NoArgsConstructor) r0
                r15 = r0
                r0 = r15
                lombok.AccessLevel r0 = r0.access()
                r16 = r0
                r0 = r15
                java.lang.String r0 = r0.staticName()
                r17 = r0
                r0 = r16
                lombok.AccessLevel r1 = lombok.AccessLevel.NONE
                if (r0 != r1) goto L48
                return
            L48:
                r0 = r15
                boolean r0 = r0.force()
                r18 = r0
                r0 = r12
                java.lang.String r1 = "onConstructor"
                java.lang.String r2 = "@NoArgsConstructor(onConstructor"
                r3 = r13
                java.util.List r0 = lombok.eclipse.handlers.EclipseHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
                r19 = r0
                r0 = r10
                lombok.eclipse.handlers.HandleConstructor r0 = r0.handleConstructor
                r1 = r14
                r2 = r16
                java.util.List r3 = java.util.Collections.emptyList()
                r4 = r18
                r5 = r17
                lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists r6 = lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.f573NO
                r7 = r19
                r8 = r13
                r0.generateConstructor(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleConstructor$HandleRequiredArgsConstructor.SCL.lombok */
    public static class HandleRequiredArgsConstructor extends lombok.eclipse.EclipseAnnotationHandler<lombok.RequiredArgsConstructor> {
        private static final java.lang.String NAME = null;
        private lombok.eclipse.handlers.HandleConstructor handleConstructor;

        static {
                java.lang.Class<lombok.RequiredArgsConstructor> r0 = lombok.RequiredArgsConstructor.class
                java.lang.String r0 = r0.getSimpleName()
                lombok.eclipse.handlers.HandleConstructor.HandleRequiredArgsConstructor.NAME = r0
                return
        }

        public HandleRequiredArgsConstructor() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                lombok.eclipse.handlers.HandleConstructor r1 = new lombok.eclipse.handlers.HandleConstructor
                r2 = r1
                r2.<init>()
                r0.handleConstructor = r1
                return
        }

        @Override // lombok.eclipse.EclipseAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.RequiredArgsConstructor> r11, org.eclipse.jdt.internal.compiler.ast.Annotation r12, lombok.eclipse.EclipseNode r13) {
                r10 = this;
                r0 = r13
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.REQUIRED_ARGS_CONSTRUCTOR_FLAG_USAGE
                java.lang.String r2 = "@RequiredArgsConstructor"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.ANY_CONSTRUCTOR_FLAG_USAGE
                java.lang.String r4 = "any @xArgsConstructor"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                r0 = r13
                lombok.core.LombokNode r0 = r0.m66up()
                lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
                r14 = r0
                r0 = r14
                r1 = r13
                java.lang.String r2 = lombok.eclipse.handlers.HandleConstructor.HandleRequiredArgsConstructor.NAME
                boolean r0 = lombok.eclipse.handlers.HandleConstructor.checkLegality(r0, r1, r2)
                if (r0 != 0) goto L24
                return
            L24:
                r0 = r11
                java.lang.annotation.Annotation r0 = r0.getInstance()
                lombok.RequiredArgsConstructor r0 = (lombok.RequiredArgsConstructor) r0
                r15 = r0
                r0 = r15
                lombok.AccessLevel r0 = r0.access()
                r16 = r0
                r0 = r16
                lombok.AccessLevel r1 = lombok.AccessLevel.NONE
                if (r0 != r1) goto L3f
                return
            L3f:
                r0 = r15
                java.lang.String r0 = r0.staticName()
                r17 = r0
                r0 = r11
                java.lang.String r1 = "suppressConstructorProperties"
                boolean r0 = r0.isExplicit(r1)
                if (r0 == 0) goto L57
                r0 = r13
                java.lang.String r1 = "This deprecated feature is no longer supported. Remove it; you can create a lombok.config file with 'lombok.anyConstructor.suppressConstructorProperties = true'."
                r0.addError(r1)
            L57:
                r0 = r12
                java.lang.String r1 = "onConstructor"
                java.lang.String r2 = "@RequiredArgsConstructor(onConstructor"
                r3 = r13
                java.util.List r0 = lombok.eclipse.handlers.EclipseHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
                r18 = r0
                r0 = r10
                lombok.eclipse.handlers.HandleConstructor r0 = r0.handleConstructor
                r1 = r14
                r2 = r16
                r3 = r14
                java.util.List r3 = lombok.eclipse.handlers.HandleConstructor.access$0(r3)
                r4 = 0
                r5 = r17
                lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists r6 = lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.f573NO
                r7 = r18
                r8 = r13
                r0.generateConstructor(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleConstructor$SkipIfConstructorExists.SCL.lombok */
    public enum SkipIfConstructorExists extends java.lang.Enum<lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists> {
        public static final lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists YES = null;

        /* renamed from: NO */
        public static final lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists f573NO = null;
        public static final lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists I_AM_BUILDER = null;
        private static final /* synthetic */ lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists[] ENUM$VALUES = null;

        static {
                lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists r0 = new lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists
                r1 = r0
                java.lang.String r2 = "YES"
                r3 = 0
                r1.<init>(r2, r3)
                lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.YES = r0
                lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists r0 = new lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists
                r1 = r0
                java.lang.String r2 = "NO"
                r3 = 1
                r1.<init>(r2, r3)
                lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.f573NO = r0
                lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists r0 = new lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists
                r1 = r0
                java.lang.String r2 = "I_AM_BUILDER"
                r3 = 2
                r1.<init>(r2, r3)
                lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.I_AM_BUILDER = r0
                r0 = 3
                lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists[] r0 = new lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists[r0]
                r1 = r0
                r2 = 0
                lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists r3 = lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.YES
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists r3 = lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.f573NO
                r1[r2] = r3
                r1 = r0
                r2 = 2
                lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists r3 = lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.I_AM_BUILDER
                r1[r2] = r3
                lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.ENUM$VALUES = r0
                return
        }

        SkipIfConstructorExists(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        public static lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists[] values() {
                lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists[] r0 = lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists[] r2 = new lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists valueOf(java.lang.String r3) {
                java.lang.Class<lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists> r0 = lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists r0 = (lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists) r0
                return r0
        }
    }

    static {
            r0 = 3
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "java"
            char[] r3 = r3.toCharArray()
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "beans"
            char[] r3 = r3.toCharArray()
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "ConstructorProperties"
            char[] r3 = r3.toCharArray()
            r1[r2] = r3
            lombok.eclipse.handlers.HandleConstructor.JAVA_BEANS_CONSTRUCTORPROPERTIES = r0
            r0 = 9
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 36
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 100
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 102(0x66, float:1.43E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 97
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 117(0x75, float:1.64E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 116(0x74, float:1.63E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 36
            r1[r2] = r3
            lombok.eclipse.handlers.HandleConstructor.DEFAULT_PREFIX = r0
            return
    }

    public HandleConstructor() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static java.util.List<lombok.eclipse.EclipseNode> findRequiredFields(lombok.eclipse.EclipseNode r3) {
            r0 = r3
            r1 = 1
            java.util.List r0 = findFields(r0, r1)
            return r0
    }

    private static java.util.List<lombok.eclipse.EclipseNode> findFields(lombok.eclipse.EclipseNode r3, boolean r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r3
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L7e
        L14:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r6 = r0
            r0 = r6
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L2c
            goto L7e
        L2c:
            r0 = r6
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r8 = r0
            r0 = r8
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.filterField(r0)
            if (r0 != 0) goto L40
            goto L7e
        L40:
            r0 = r8
            int r0 = r0.modifiers
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto L4f
            r0 = 1
            goto L50
        L4f:
            r0 = 0
        L50:
            r9 = r0
            r0 = r4
            if (r0 == 0) goto L61
            r0 = r6
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasNonNullAnnotations(r0)
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            r10 = r0
            r0 = r9
            if (r0 != 0) goto L6e
            r0 = r10
            if (r0 == 0) goto L7e
        L6e:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 != 0) goto L7e
            r0 = r5
            r1 = r6
            boolean r0 = r0.add(r1)
        L7e:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            r0 = r5
            return r0
    }

    static java.util.List<lombok.eclipse.EclipseNode> findAllFields(lombok.eclipse.EclipseNode r3) {
            r0 = r3
            r1 = 0
            java.util.List r0 = findAllFields(r0, r1)
            return r0
    }

    static java.util.List<lombok.eclipse.EclipseNode> findAllFields(lombok.eclipse.EclipseNode r3, boolean r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r3
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L62
        L14:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r6 = r0
            r0 = r6
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L2c
            goto L62
        L2c:
            r0 = r6
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r8 = r0
            r0 = r8
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.filterField(r0)
            if (r0 != 0) goto L40
            goto L62
        L40:
            r0 = r4
            if (r0 != 0) goto L5a
            r0 = r8
            int r0 = r0.modifiers
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto L5a
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 == 0) goto L5a
            goto L62
        L5a:
            r0 = r5
            r1 = r6
            boolean r0 = r0.add(r1)
        L62:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            r0 = r5
            return r0
    }

    static boolean checkLegality(lombok.eclipse.EclipseNode r5, lombok.eclipse.EclipseNode r6, java.lang.String r7) {
            r0 = r5
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isClassOrEnum(r0)
            if (r0 != 0) goto L20
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r7
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = " is only supported on a class or an enum."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            r0 = 0
            return r0
        L20:
            r0 = 1
            return r0
    }

    public void generateExtraNoArgsConstructor(lombok.eclipse.EclipseNode r12, lombok.eclipse.EclipseNode r13) {
            r11 = this;
            r0 = r12
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isDirectDescendantOfObject(r0)
            if (r0 != 0) goto L8
            return
        L8:
            r0 = r12
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.NO_ARGS_CONSTRUCTOR_EXTRA_PRIVATE
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L21
            r0 = r14
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L22
        L21:
            return
        L22:
            r0 = r11
            r1 = r12
            lombok.AccessLevel r2 = lombok.AccessLevel.PRIVATE
            java.util.List r3 = java.util.Collections.emptyList()
            r4 = 1
            r5 = 0
            lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists r6 = lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.f573NO
            java.util.List r7 = java.util.Collections.emptyList()
            r8 = r13
            r9 = 1
            r0.generate(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public void generateRequiredArgsConstructor(lombok.eclipse.EclipseNode r11, lombok.AccessLevel r12, java.lang.String r13, lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists r14, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r15, lombok.eclipse.EclipseNode r16) {
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r11
            java.util.List r3 = findRequiredFields(r3)
            r4 = 0
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r0.generateConstructor(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void generateAllArgsConstructor(lombok.eclipse.EclipseNode r11, lombok.AccessLevel r12, java.lang.String r13, lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists r14, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r15, lombok.eclipse.EclipseNode r16) {
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r11
            java.util.List r3 = findAllFields(r3)
            r4 = 0
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r0.generateConstructor(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void generateConstructor(lombok.eclipse.EclipseNode r12, lombok.AccessLevel r13, java.util.List<lombok.eclipse.EclipseNode> r14, boolean r15, java.lang.String r16, lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists r17, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r18, lombok.eclipse.EclipseNode r19) {
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = 0
            r0.generate(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public void generate(lombok.eclipse.EclipseNode r9, lombok.AccessLevel r10, java.util.List<lombok.eclipse.EclipseNode> r11, boolean r12, java.lang.String r13, lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists r14, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r15, lombok.eclipse.EclipseNode r16, boolean r17) {
            r8 = this;
            r0 = r16
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r18 = r0
            r0 = r13
            if (r0 == 0) goto L1d
            r0 = r13
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            r19 = r0
            r0 = r14
            lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists r1 = lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.f573NO
            if (r0 == r1) goto Lab
            r0 = r9
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r21 = r0
            goto La1
        L34:
            r0 = r21
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r20 = r0
            r0 = r20
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto La1
            java.lang.Class<lombok.NoArgsConstructor> r0 = lombok.NoArgsConstructor.class
            r1 = r20
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 != 0) goto L6d
            java.lang.Class<lombok.AllArgsConstructor> r0 = lombok.AllArgsConstructor.class
            r1 = r20
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 != 0) goto L6d
            java.lang.Class<lombok.RequiredArgsConstructor> r0 = lombok.RequiredArgsConstructor.class
            r1 = r20
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 != 0) goto L6d
            r0 = 0
            goto L6e
        L6d:
            r0 = 1
        L6e:
            r22 = r0
            r0 = r22
            if (r0 != 0) goto L86
            r0 = r14
            lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists r1 = lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.YES
            if (r0 != r1) goto L86
            java.lang.Class<lombok.Builder> r0 = lombok.Builder.class
            r1 = r20
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.annotationTypeMatches(r0, r1)
            r22 = r0
        L86:
            r0 = r22
            if (r0 == 0) goto La1
            r0 = r19
            if (r0 == 0) goto La0
            r0 = r9
            java.lang.String r1 = "Ignoring static constructor name: explicit @XxxArgsConstructor annotation present; its `staticName` parameter will be used."
            r2 = r18
            int r2 = r2.sourceStart
            r3 = r18
            int r3 = r3.sourceEnd
            r0.addWarning(r1, r2, r3)
        La0:
            return
        La1:
            r0 = r21
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L34
        Lab:
            r0 = r17
            if (r0 == 0) goto Lb8
            r0 = r9
            boolean r0 = noArgsConstructorExists(r0)
            if (r0 == 0) goto Lb8
            return
        Lb8:
            r0 = r14
            lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists r1 = lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.f573NO
            if (r0 == r1) goto Lca
            r0 = r9
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.constructorExists(r0)
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto Lea
        Lca:
            r0 = r19
            if (r0 == 0) goto Ld5
            lombok.AccessLevel r0 = lombok.AccessLevel.PRIVATE
            goto Ld6
        Ld5:
            r0 = r10
        Ld6:
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r16
            r5 = r15
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = createConstructor(r0, r1, r2, r3, r4, r5)
            r20 = r0
            r0 = r9
            r1 = r20
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        Lea:
            r0 = r8
            r1 = r19
            r2 = r9
            r3 = r13
            r4 = r10
            r5 = r11
            r6 = r18
            r0.generateStaticConstructor(r1, r2, r3, r4, r5, r6)
            return
    }

    private void generateStaticConstructor(boolean r8, lombok.eclipse.EclipseNode r9, java.lang.String r10, lombok.AccessLevel r11, java.util.Collection<lombok.eclipse.EclipseNode> r12, org.eclipse.jdt.internal.compiler.ast.ASTNode r13) {
            r7 = this;
            r0 = r8
            if (r0 == 0) goto L19
            r0 = r7
            r1 = r11
            r2 = r10
            r3 = r9
            r4 = r12
            r5 = r13
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createStaticConstructor(r1, r2, r3, r4, r5)
            r14 = r0
            r0 = r9
            r1 = r14
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        L19:
            return
    }

    private static boolean noArgsConstructorExists(lombok.eclipse.EclipseNode r3) {
            r0 = r3
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.upToTypeNode(r0)
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L5c
            r0 = r3
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L5c
            r0 = r3
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r4 = r0
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            if (r0 == 0) goto L5c
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = r0
            r8 = r1
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r6 = r0
            goto L56
        L31:
            r0 = r8
            r1 = r6
            r0 = r0[r1]
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            if (r0 == 0) goto L53
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration) r0
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L51
            r0 = r9
            int r0 = r0.length
            if (r0 != 0) goto L53
        L51:
            r0 = 1
            return r0
        L53:
            int r6 = r6 + 1
        L56:
            r0 = r6
            r1 = r7
            if (r0 < r1) goto L31
        L5c:
            r0 = r3
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
            goto Laa
        L67:
            r0 = r5
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r4 = r0
            java.lang.Class<lombok.NoArgsConstructor> r0 = lombok.NoArgsConstructor.class
            r1 = r4
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L7c
            r0 = 1
            return r0
        L7c:
            java.lang.Class<lombok.RequiredArgsConstructor> r0 = lombok.RequiredArgsConstructor.class
            r1 = r4
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L93
            r0 = r3
            java.util.List r0 = findRequiredFields(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L93
            r0 = 1
            return r0
        L93:
            java.lang.Class<lombok.AllArgsConstructor> r0 = lombok.AllArgsConstructor.class
            r1 = r4
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 == 0) goto Laa
            r0 = r3
            java.util.List r0 = findAllFields(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Laa
            r0 = 1
            return r0
        Laa:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L67
            r0 = 0
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.Annotation[] createConstructorProperties(org.eclipse.jdt.internal.compiler.ast.ASTNode r9, java.util.Collection<lombok.eclipse.EclipseNode> r10) {
            r0 = r10
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            r0 = 0
            return r0
        Lb:
            r0 = r9
            int r0 = r0.sourceStart
            r11 = r0
            r0 = r9
            int r0 = r0.sourceEnd
            r12 = r0
            r0 = r11
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r12
            long r1 = (long) r1
            long r0 = r0 | r1
            r13 = r0
            r0 = 3
            long[] r0 = new long[r0]
            r15 = r0
            r0 = r15
            r1 = r13
            java.util.Arrays.fill(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r1 = r0
            char[][] r2 = lombok.eclipse.handlers.HandleConstructor.JAVA_BEANS_CONSTRUCTORPROPERTIES
            r3 = r15
            r1.<init>(r2, r3)
            r16 = r0
            r0 = r16
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation r0 = new org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation
            r1 = r0
            r2 = r16
            r3 = r11
            r1.<init>(r2, r3)
            r17 = r0
            r0 = r17
            r1 = r12
            r0.declarationSourceEnd = r1
            org.eclipse.jdt.internal.compiler.ast.ArrayInitializer r0 = new org.eclipse.jdt.internal.compiler.ast.ArrayInitializer
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r18
            r1 = r11
            r0.sourceStart = r1
            r0 = r18
            r1 = r12
            r0.sourceEnd = r1
            r0 = r18
            r1 = r10
            int r1 = r1.size()
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r0.expressions = r1
            r0 = 0
            r19 = r0
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r21 = r0
            goto Lba
        L83:
            r0 = r21
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r20 = r0
            r0 = r20
            char[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.removePrefixFromField(r0)
            r22 = r0
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.expressions
            r1 = r19
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r2 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r3 = r2
            r4 = r22
            r5 = r11
            r6 = r12
            r7 = 0
            r3.<init>(r4, r5, r6, r7)
            r0[r1] = r2
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.expressions
            r1 = r19
            r0 = r0[r1]
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            int r19 = r19 + 1
        Lba:
            r0 = r21
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L83
            r0 = r17
            r1 = r18
            r0.memberValue = r1
            r0 = r17
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.memberValue
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r1 = r0
            r2 = 0
            r3 = r17
            r1[r2] = r3
            return r0
    }

    private static final char[] prefixWith(char[] r6, char[] r7) {
            r0 = r6
            int r0 = r0.length
            r1 = r7
            int r1 = r1.length
            int r0 = r0 + r1
            char[] r0 = new char[r0]
            r8 = r0
            r0 = r6
            r1 = 0
            r2 = r8
            r3 = 0
            r4 = r6
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r7
            r1 = 0
            r2 = r8
            r3 = r6
            int r3 = r3.length
            r4 = r7
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r8
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration createConstructor(lombok.AccessLevel r8, lombok.eclipse.EclipseNode r9, java.util.Collection<lombok.eclipse.EclipseNode> r10, boolean r11, lombok.eclipse.EclipseNode r12, java.util.List<org.eclipse.jdt.internal.compiler.ast.Annotation> r13) {
            r0 = r12
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r14 = r0
            r0 = r9
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r15 = r0
            r0 = r14
            int r0 = r0.sourceStart
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r14
            int r1 = r1.sourceEnd
            long r1 = (long) r1
            long r0 = r0 | r1
            r16 = r0
            r0 = r9
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            int r0 = r0.modifiers
            r1 = 16384(0x4000, float:2.2959E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L3a
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            r18 = r0
            r0 = r18
            if (r0 == 0) goto L46
            lombok.AccessLevel r0 = lombok.AccessLevel.PRIVATE
            r8 = r0
        L46:
            r0 = r9
            r1 = r10
            java.util.List r0 = fieldsNeedingBuilderDefaults(r0, r1)
            r19 = r0
            r0 = r11
            if (r0 == 0) goto L59
            r0 = r9
            r1 = r10
            java.util.List r0 = fieldsNeedingExplicitDefaults(r0, r1)
            goto L5c
        L59:
            java.util.List r0 = java.util.Collections.emptyList()
        L5c:
            r20 = r0
            r0 = r10
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6d
            r0 = 0
            r21 = r0
            goto L9b
        L6d:
            r0 = r9
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.ANY_CONSTRUCTOR_ADD_CONSTRUCTOR_PROPERTIES
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r22 = r0
            r0 = r22
            if (r0 == 0) goto L89
            r0 = r22
            boolean r0 = r0.booleanValue()
            goto L99
        L89:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = r9
            lombok.eclipse.EclipseAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.ANY_CONSTRUCTOR_SUPPRESS_CONSTRUCTOR_PROPERTIES
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
        L99:
            r21 = r0
        L9b:
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            r1 = r0
            r2 = r9
            lombok.core.LombokNode r2 = r2.top()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r22 = r0
            r0 = r22
            r1 = r8
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r0.modifiers = r1
            r0 = r22
            r1 = r15
            char[] r1 = r1.name
            r0.selector = r1
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r1 = new org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall
            r2 = r1
            r3 = 1
            r2.<init>(r3)
            r0.constructorCall = r1
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r0 = r0.constructorCall
            r1 = r14
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r0 = r0.constructorCall
            r1 = r14
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r22
            r1 = 0
            r0.thrownExceptions = r1
            r0 = r22
            r1 = 0
            r0.typeParameters = r1
            r0 = r22
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r22
            r1 = r22
            r2 = r22
            r3 = r14
            int r3 = r3.sourceStart
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceStart = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceStart = r3
            r0.bodyStart = r1
            r0 = r22
            r1 = r22
            r2 = r22
            r3 = r14
            int r3 = r3.sourceEnd
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceEnd = r3
            r0.bodyEnd = r1
            r0 = r22
            r1 = 0
            r0.arguments = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r23 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r24 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r25 = r0
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r27 = r0
            goto L282
        L15f:
            r0 = r27
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r26 = r0
            r0 = r26
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r28 = r0
            r0 = r28
            char[] r0 = r0.name
            r29 = r0
            r0 = r26
            char[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.removePrefixFromField(r0)
            r30 = r0
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r29
            r3 = r16
            r1.<init>(r2, r3)
            r31 = r0
            r0 = r16
            r1 = 32
            long r0 = r0 >> r1
            int r0 = (int) r0
            r32 = r0
            r0 = r16
            int r0 = (int) r0
            r33 = r0
            r0 = r31
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = r32
            r4 = r33
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r30
            r3 = r16
            r1.<init>(r2, r3)
            r34 = r0
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            r2 = r31
            r3 = r34
            r4 = r16
            int r4 = (int) r4
            r1.<init>(r2, r3, r4)
            r35 = r0
            r0 = r35
            r1 = r16
            r2 = 32
            long r1 = r1 >> r2
            int r1 = (int) r1
            r0.sourceStart = r1
            r0 = r35
            r1 = r35
            r2 = r16
            r3 = 32
            long r2 = r2 >> r3
            int r2 = (int) r2
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            r0 = r24
            r1 = r35
            boolean r0 = r0.add(r1)
            r0 = r28
            int r0 = r0.sourceStart
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r28
            int r1 = r1.sourceEnd
            long r1 = (long) r1
            long r0 = r0 | r1
            r36 = r0
            org.eclipse.jdt.internal.compiler.ast.Argument r0 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r1 = r0
            r2 = r30
            r3 = r36
            r4 = r28
            org.eclipse.jdt.internal.compiler.ast.TypeReference r4 = r4.type
            r5 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeReference r4 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r4, r5)
            r5 = 16
            r1.<init>(r2, r3, r4, r5)
            r38 = r0
            r0 = r26
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.findCopyableAnnotations(r0)
            r39 = r0
            r0 = r26
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasNonNullAnnotations(r0)
            if (r0 == 0) goto L243
            r0 = r38
            r1 = r12
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNullCheck(r0, r1, r2)
            r40 = r0
            r0 = r40
            if (r0 == 0) goto L243
            r0 = r25
            r1 = r40
            boolean r0 = r0.add(r1)
        L243:
            r0 = r38
            r1 = r14
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r39
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r1, r2)
            r0.annotations = r1
            r0 = r38
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            if (r0 == 0) goto L278
            r0 = r38
            r1 = r0
            int r1 = r1.bits
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r22
            r1 = r0
            int r1 = r1.bits
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r2
            r0.bits = r1
        L278:
            r0 = r23
            r1 = r38
            boolean r0 = r0.add(r1)
        L282:
            r0 = r27
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L15f
            r0 = r20
            java.util.Iterator r0 = r0.iterator()
            r27 = r0
            goto L323
        L298:
            r0 = r27
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r26 = r0
            r0 = r26
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r28 = r0
            r0 = r28
            char[] r0 = r0.name
            r29 = r0
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r29
            r3 = r16
            r1.<init>(r2, r3)
            r30 = r0
            r0 = r16
            r1 = 32
            long r0 = r0 >> r1
            int r0 = (int) r0
            r31 = r0
            r0 = r16
            int r0 = (int) r0
            r32 = r0
            r0 = r30
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = r31
            r4 = r32
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r31
            r2 = r32
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = getDefaultExpr(r0, r1, r2)
            r33 = r0
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            r2 = r30
            r3 = r33
            r4 = r16
            int r4 = (int) r4
            r1.<init>(r2, r3, r4)
            r34 = r0
            r0 = r34
            r1 = r16
            r2 = 32
            long r1 = r1 >> r2
            int r1 = (int) r1
            r0.sourceStart = r1
            r0 = r34
            r1 = r34
            r2 = r16
            r3 = 32
            long r2 = r2 >> r3
            int r2 = (int) r2
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            r0 = r24
            r1 = r34
            boolean r0 = r0.add(r1)
        L323:
            r0 = r27
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L298
            r0 = r19
            java.util.Iterator r0 = r0.iterator()
            r27 = r0
            goto L3fa
        L339:
            r0 = r27
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r26 = r0
            r0 = r26
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r28 = r0
            r0 = r28
            char[] r0 = r0.name
            r29 = r0
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r29
            r3 = r16
            r1.<init>(r2, r3)
            r30 = r0
            r0 = r16
            r1 = 32
            long r0 = r0 >> r1
            int r0 = (int) r0
            r31 = r0
            r0 = r16
            int r0 = (int) r0
            r32 = r0
            r0 = r30
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = r31
            r4 = r32
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r33 = r0
            r0 = r33
            r1 = r14
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r33
            r1 = r14
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r33
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            r3 = r9
            java.lang.Object r3 = r3.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r3 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r3
            char[] r3 = r3.name
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r33
            char[] r1 = lombok.eclipse.handlers.HandleConstructor.DEFAULT_PREFIX
            r2 = r26
            char[] r2 = lombok.eclipse.handlers.EclipseHandlerUtil.removePrefixFromField(r2)
            char[] r1 = prefixWith(r1, r2)
            r0.selector = r1
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            r2 = r30
            r3 = r33
            r4 = r16
            int r4 = (int) r4
            r1.<init>(r2, r3, r4)
            r34 = r0
            r0 = r34
            r1 = r16
            r2 = 32
            long r1 = r1 >> r2
            int r1 = (int) r1
            r0.sourceStart = r1
            r0 = r34
            r1 = r34
            r2 = r16
            r3 = 32
            long r2 = r2 >> r3
            int r2 = (int) r2
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            r0 = r24
            r1 = r34
            boolean r0 = r0.add(r1)
        L3fa:
            r0 = r27
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L339
            r0 = r25
            r1 = r24
            boolean r0 = r0.addAll(r1)
            r0 = r22
            r1 = r25
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L41e
            r1 = 0
            goto L42c
        L41e:
            r1 = r25
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
        L42c:
            r0.statements = r1
            r0 = r22
            r1 = r23
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L43f
            r1 = 0
            goto L44d
        L43f:
            r1 = r23
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Argument[] r2 = new org.eclipse.jdt.internal.compiler.ast.Argument[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = (org.eclipse.jdt.internal.compiler.ast.Argument[]) r1
        L44d:
            r0.arguments = r1
            r0 = 0
            r26 = r0
            r0 = r21
            if (r0 == 0) goto L467
            r0 = r9
            boolean r0 = isLocalType(r0)
            if (r0 != 0) goto L467
            r0 = r14
            r1 = r10
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = createConstructorProperties(r0, r1)
            r26 = r0
        L467:
            r0 = r22
            r1 = r14
            r2 = 2
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r13
            r6 = 0
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r6 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r5 = (org.eclipse.jdt.internal.compiler.ast.Annotation[]) r5
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r26
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r1, r2)
            r0.annotations = r1
            r0 = r22
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r14
            r2.<init>(r3)
            r2 = r15
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            r0 = r22
            return r0
    }

    private static java.util.List<lombok.eclipse.EclipseNode> fieldsNeedingBuilderDefaults(lombok.eclipse.EclipseNode r3, java.util.Collection<lombok.eclipse.EclipseNode> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r3
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L7f
        L14:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r6 = r0
            r0 = r6
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L2c
            goto L7f
        L2c:
            r0 = r6
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r8 = r0
            r0 = r8
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L43
            goto L7f
        L43:
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L63
        L4e:
            r0 = r10
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r9 = r0
            r0 = r6
            r1 = r9
            if (r0 != r1) goto L63
            goto L7f
        L63:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4e
            java.lang.Class<lombok.Builder$Default> r0 = lombok.Builder.Default.class
            r1 = r6
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L7f
            r0 = r5
            r1 = r6
            boolean r0 = r0.add(r1)
        L7f:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            r0 = r5
            return r0
    }

    private static java.util.List<lombok.eclipse.EclipseNode> fieldsNeedingExplicitDefaults(lombok.eclipse.EclipseNode r3, java.util.Collection<lombok.eclipse.EclipseNode> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r3
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L9b
        L14:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r6 = r0
            r0 = r6
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L2c
            goto L9b
        L2c:
            r0 = r6
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r8 = r0
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 == 0) goto L40
            goto L9b
        L40:
            r0 = r8
            int r0 = r0.modifiers
            r1 = 16
            r0 = r0 & r1
            if (r0 != 0) goto L4e
            goto L9b
        L4e:
            r0 = r8
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L5c
            goto L9b
        L5c:
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L7c
        L67:
            r0 = r10
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r9 = r0
            r0 = r6
            r1 = r9
            if (r0 != r1) goto L7c
            goto L9b
        L7c:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L67
            java.lang.Class<lombok.Builder$Default> r0 = lombok.Builder.Default.class
            r1 = r6
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L93
            goto L9b
        L93:
            r0 = r5
            r1 = r6
            boolean r0 = r0.add(r1)
        L9b:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            r0 = r5
            return r0
    }

    private static org.eclipse.jdt.internal.compiler.ast.Expression getDefaultExpr(org.eclipse.jdt.internal.compiler.ast.TypeReference r7, int r8, int r9) {
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ArrayTypeReference
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L13
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r1 = r0
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3)
            return r0
        L13:
            r0 = r7
            char[] r0 = r0.getLastToken()
            r11 = r0
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.BOOLEAN
            r1 = r11
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L2e
            org.eclipse.jdt.internal.compiler.ast.FalseLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.FalseLiteral
            r1 = r0
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3)
            return r0
        L2e:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.CHAR
            r1 = r11
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L5a
            org.eclipse.jdt.internal.compiler.ast.CharLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.CharLiteral
            r1 = r0
            r2 = 4
            char[] r2 = new char[r2]
            r3 = r2
            r4 = 0
            r5 = 39
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 92
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 48
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 39
            r3[r4] = r5
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4)
            return r0
        L5a:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.BYTE
            r1 = r11
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L7b
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.SHORT
            r1 = r11
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L7b
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.INT
            r1 = r11
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L89
        L7b:
            r0 = 1
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 48
            r1[r2] = r3
            r1 = r8
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.IntLiteral r0 = org.eclipse.jdt.internal.compiler.ast.IntLiteral.buildIntLiteral(r0, r1, r2)
            return r0
        L89:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.LONG
            r1 = r11
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto La7
            r0 = 2
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 48
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 76
            r1[r2] = r3
            r1 = r8
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.LongLiteral r0 = org.eclipse.jdt.internal.compiler.ast.LongLiteral.buildLongLiteral(r0, r1, r2)
            return r0
        La7:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.FLOAT
            r1 = r11
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto Lc9
            org.eclipse.jdt.internal.compiler.ast.FloatLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.FloatLiteral
            r1 = r0
            r2 = 2
            char[] r2 = new char[r2]
            r3 = r2
            r4 = 0
            r5 = 48
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 70
            r3[r4] = r5
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4)
            return r0
        Lc9:
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.DOUBLE
            r1 = r11
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto Leb
            org.eclipse.jdt.internal.compiler.ast.DoubleLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.DoubleLiteral
            r1 = r0
            r2 = 2
            char[] r2 = new char[r2]
            r3 = r2
            r4 = 0
            r5 = 48
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 68
            r3[r4] = r5
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4)
            return r0
        Leb:
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r1 = r0
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public static boolean isLocalType(lombok.eclipse.EclipseNode r3) {
            r0 = r3
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            r4 = r0
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT
            if (r0 != r1) goto L14
            r0 = 0
            return r0
        L14:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L26
            r0 = r3
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            boolean r0 = isLocalType(r0)
            return r0
        L26:
            r0 = 1
            return r0
    }

    public org.eclipse.jdt.internal.compiler.ast.MethodDeclaration createStaticConstructor(lombok.AccessLevel r12, java.lang.String r13, lombok.eclipse.EclipseNode r14, java.util.Collection<lombok.eclipse.EclipseNode> r15, org.eclipse.jdt.internal.compiler.ast.ASTNode r16) {
            r11 = this;
            r0 = r16
            int r0 = r0.sourceStart
            r17 = r0
            r0 = r16
            int r0 = r0.sourceEnd
            r18 = r0
            r0 = r17
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r18
            long r1 = (long) r1
            long r0 = r0 | r1
            r19 = r0
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            r1 = r0
            r2 = r14
            lombok.core.LombokNode r2 = r2.top()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r21 = r0
            r0 = r21
            r1 = r12
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r2 = 8
            r1 = r1 | r2
            r0.modifiers = r1
            r0 = r14
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r22 = r0
            r0 = r21
            r1 = r14
            r2 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r2 = r2.typeParameters
            r3 = r19
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.namePlusTypeParamsToTypeReference(r1, r2, r3)
            r0.returnType = r1
            r0 = r21
            r1 = 0
            r0.annotations = r1
            r0 = r14
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getCheckerFrameworkVersion(r0)
            boolean r0 = r0.generateUnique()
            if (r0 == 0) goto L9c
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            char[][] r0 = r0.getTypeName()
            int r0 = r0.length
            r23 = r0
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r23
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r0.annotations = r1
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = r0.annotations
            r1 = r23
            r2 = 1
            int r1 = r1 - r2
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r16
            java.lang.String r6 = "org.checkerframework.common.aliasing.qual.Unique"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r5 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r5, r6)
            r3[r4] = r5
            r0[r1] = r2
        L9c:
            r0 = r21
            r1 = r13
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r21
            r1 = 0
            r0.thrownExceptions = r1
            r0 = r21
            r1 = r14
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r1 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r1
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParameters
            r2 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyTypeParams(r1, r2)
            r0.typeParameters = r1
            r0 = r21
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r21
            r1 = r21
            r2 = r21
            r3 = r16
            int r3 = r3.sourceStart
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceStart = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceStart = r3
            r0.bodyStart = r1
            r0 = r21
            r1 = r21
            r2 = r21
            r3 = r16
            int r3 = r3.sourceEnd
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceEnd = r3
            r0.bodyEnd = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r23 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r24 = r0
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r25 = r0
            r0 = r25
            r1 = r17
            r0.sourceStart = r1
            r0 = r25
            r1 = r18
            r0.sourceEnd = r1
            r0 = r25
            r1 = r21
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.returnType
            r2 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r1, r2)
            r0.type = r1
            r0 = r15
            java.util.Iterator r0 = r0.iterator()
            r27 = r0
            goto L1dc
        L13c:
            r0 = r27
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r26 = r0
            r0 = r26
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r28 = r0
            r0 = r28
            int r0 = r0.sourceStart
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r28
            int r1 = r1.sourceEnd
            long r1 = (long) r1
            long r0 = r0 | r1
            r29 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r28
            char[] r2 = r2.name
            r3 = r29
            r1.<init>(r2, r3)
            r31 = r0
            r0 = r24
            r1 = r31
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.Argument r0 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r1 = r0
            r2 = r28
            char[] r2 = r2.name
            r3 = r29
            r4 = r28
            org.eclipse.jdt.internal.compiler.ast.TypeReference r4 = r4.type
            r5 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r4 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r4, r5)
            r5 = 16
            r1.<init>(r2, r3, r4, r5)
            r32 = r0
            r0 = r32
            r1 = r16
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r26
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r5 = lombok.eclipse.handlers.EclipseHandlerUtil.findCopyableAnnotations(r5)
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r1, r2)
            r0.annotations = r1
            r0 = r32
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            if (r0 == 0) goto L1d2
            r0 = r32
            r1 = r0
            int r1 = r1.bits
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r21
            r1 = r0
            int r1 = r1.bits
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r2
            r0.bits = r1
        L1d2:
            r0 = r23
            r1 = r32
            boolean r0 = r0.add(r1)
        L1dc:
            r0 = r27
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L13c
            r0 = r25
            r1 = r24
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1f6
            r1 = 0
            goto L204
        L1f6:
            r1 = r24
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Expression[] r2 = new org.eclipse.jdt.internal.compiler.ast.Expression[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = (org.eclipse.jdt.internal.compiler.ast.Expression[]) r1
        L204:
            r0.arguments = r1
            r0 = r21
            r1 = r23
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L217
            r1 = 0
            goto L225
        L217:
            r1 = r23
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Argument[] r2 = new org.eclipse.jdt.internal.compiler.ast.Argument[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = (org.eclipse.jdt.internal.compiler.ast.Argument[]) r1
        L225:
            r0.arguments = r1
            r0 = r21
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r4 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r5 = r4
            r6 = r25
            r7 = r19
            r8 = 32
            long r7 = r7 >> r8
            int r7 = (int) r7
            r8 = r19
            int r8 = (int) r8
            r5.<init>(r6, r7, r8)
            r2[r3] = r4
            r0.statements = r1
            r0 = r14
            r1 = r21
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r21
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r16
            r2.<init>(r3)
            r2 = r22
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            r0 = r21
            return r0
    }

    static /* synthetic */ java.util.List access$0(lombok.eclipse.EclipseNode r2) {
            r0 = r2
            java.util.List r0 = findRequiredFields(r0)
            return r0
    }
}
