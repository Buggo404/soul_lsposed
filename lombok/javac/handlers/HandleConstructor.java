package lombok.javac.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleConstructor.SCL.lombok */
public class HandleConstructor {
    private static /* synthetic */ int[] $SWITCH_TABLE$javax$lang$model$type$TypeKind;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleConstructor$HandleAllArgsConstructor.SCL.lombok */
    public static class HandleAllArgsConstructor extends lombok.javac.JavacAnnotationHandler<lombok.AllArgsConstructor> {
        private static final java.lang.String NAME = null;
        private lombok.javac.handlers.HandleConstructor handleConstructor;

        static {
                java.lang.Class<lombok.AllArgsConstructor> r0 = lombok.AllArgsConstructor.class
                java.lang.String r0 = r0.getSimpleName()
                lombok.javac.handlers.HandleConstructor.HandleAllArgsConstructor.NAME = r0
                return
        }

        public HandleAllArgsConstructor() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                lombok.javac.handlers.HandleConstructor r1 = new lombok.javac.handlers.HandleConstructor
                r2 = r1
                r2.<init>()
                r0.handleConstructor = r1
                return
        }

        @Override // lombok.javac.JavacAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.AllArgsConstructor> r11, com.sun.tools.javac.tree.JCTree.JCAnnotation r12, lombok.javac.JavacNode r13) {
                r10 = this;
                r0 = r13
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.ALL_ARGS_CONSTRUCTOR_FLAG_USAGE
                java.lang.String r2 = "@AllArgsConstructor"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.ANY_CONSTRUCTOR_FLAG_USAGE
                java.lang.String r4 = "any @xArgsConstructor"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                r0 = r13
                java.lang.Class<lombok.AllArgsConstructor> r1 = lombok.AllArgsConstructor.class
                lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
                r0 = r13
                java.lang.String r1 = "lombok.AccessLevel"
                lombok.javac.handlers.JavacHandlerUtil.deleteImportFromCompilationUnit(r0, r1)
                r0 = r13
                lombok.core.LombokNode r0 = r0.m66up()
                lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
                r14 = r0
                r0 = r14
                r1 = r13
                java.lang.String r2 = lombok.javac.handlers.HandleConstructor.HandleAllArgsConstructor.NAME
                boolean r0 = lombok.javac.handlers.HandleConstructor.checkLegality(r0, r1, r2)
                if (r0 != 0) goto L30
                return
            L30:
                r0 = r12
                java.lang.String r1 = "onConstructor"
                java.lang.String r2 = "@AllArgsConstructor(onConstructor"
                r3 = r13
                com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
                r15 = r0
                r0 = r11
                java.lang.annotation.Annotation r0 = r0.getInstance()
                lombok.AllArgsConstructor r0 = (lombok.AllArgsConstructor) r0
                r16 = r0
                r0 = r16
                lombok.AccessLevel r0 = r0.access()
                r17 = r0
                r0 = r17
                lombok.AccessLevel r1 = lombok.AccessLevel.NONE
                if (r0 != r1) goto L56
                return
            L56:
                r0 = r16
                java.lang.String r0 = r0.staticName()
                r18 = r0
                r0 = r11
                java.lang.String r1 = "suppressConstructorProperties"
                boolean r0 = r0.isExplicit(r1)
                if (r0 == 0) goto L6e
                r0 = r13
                java.lang.String r1 = "This deprecated feature is no longer supported. Remove it; you can create a lombok.config file with 'lombok.anyConstructor.suppressConstructorProperties = true'."
                r0.addError(r1)
            L6e:
                r0 = r10
                lombok.javac.handlers.HandleConstructor r0 = r0.handleConstructor
                r1 = r14
                r2 = r17
                r3 = r15
                r4 = r14
                com.sun.tools.javac.util.List r4 = lombok.javac.handlers.HandleConstructor.findAllFields(r4)
                r5 = 0
                r6 = r18
                lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r7 = lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.f587NO
                r8 = r13
                r0.generateConstructor(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleConstructor$HandleNoArgsConstructor.SCL.lombok */
    public static class HandleNoArgsConstructor extends lombok.javac.JavacAnnotationHandler<lombok.NoArgsConstructor> {
        private static final java.lang.String NAME = null;
        private lombok.javac.handlers.HandleConstructor handleConstructor;

        static {
                java.lang.Class<lombok.NoArgsConstructor> r0 = lombok.NoArgsConstructor.class
                java.lang.String r0 = r0.getSimpleName()
                lombok.javac.handlers.HandleConstructor.HandleNoArgsConstructor.NAME = r0
                return
        }

        public HandleNoArgsConstructor() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                lombok.javac.handlers.HandleConstructor r1 = new lombok.javac.handlers.HandleConstructor
                r2 = r1
                r2.<init>()
                r0.handleConstructor = r1
                return
        }

        @Override // lombok.javac.JavacAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.NoArgsConstructor> r11, com.sun.tools.javac.tree.JCTree.JCAnnotation r12, lombok.javac.JavacNode r13) {
                r10 = this;
                r0 = r13
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.NO_ARGS_CONSTRUCTOR_FLAG_USAGE
                java.lang.String r2 = "@NoArgsConstructor"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.ANY_CONSTRUCTOR_FLAG_USAGE
                java.lang.String r4 = "any @xArgsConstructor"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                r0 = r13
                java.lang.Class<lombok.NoArgsConstructor> r1 = lombok.NoArgsConstructor.class
                lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
                r0 = r13
                java.lang.String r1 = "lombok.AccessLevel"
                lombok.javac.handlers.JavacHandlerUtil.deleteImportFromCompilationUnit(r0, r1)
                r0 = r13
                lombok.core.LombokNode r0 = r0.m66up()
                lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
                r14 = r0
                r0 = r14
                r1 = r13
                java.lang.String r2 = lombok.javac.handlers.HandleConstructor.HandleNoArgsConstructor.NAME
                boolean r0 = lombok.javac.handlers.HandleConstructor.checkLegality(r0, r1, r2)
                if (r0 != 0) goto L30
                return
            L30:
                r0 = r12
                java.lang.String r1 = "onConstructor"
                java.lang.String r2 = "@NoArgsConstructor(onConstructor"
                r3 = r13
                com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
                r15 = r0
                r0 = r11
                java.lang.annotation.Annotation r0 = r0.getInstance()
                lombok.NoArgsConstructor r0 = (lombok.NoArgsConstructor) r0
                r16 = r0
                r0 = r16
                lombok.AccessLevel r0 = r0.access()
                r17 = r0
                r0 = r17
                lombok.AccessLevel r1 = lombok.AccessLevel.NONE
                if (r0 != r1) goto L56
                return
            L56:
                r0 = r16
                java.lang.String r0 = r0.staticName()
                r18 = r0
                r0 = r16
                boolean r0 = r0.force()
                r19 = r0
                r0 = r10
                lombok.javac.handlers.HandleConstructor r0 = r0.handleConstructor
                r1 = r14
                r2 = r17
                r3 = r15
                com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
                r5 = r19
                r6 = r18
                lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r7 = lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.f587NO
                r8 = r13
                r0.generateConstructor(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleConstructor$HandleRequiredArgsConstructor.SCL.lombok */
    public static class HandleRequiredArgsConstructor extends lombok.javac.JavacAnnotationHandler<lombok.RequiredArgsConstructor> {
        private static final java.lang.String NAME = null;
        private lombok.javac.handlers.HandleConstructor handleConstructor;

        static {
                java.lang.Class<lombok.RequiredArgsConstructor> r0 = lombok.RequiredArgsConstructor.class
                java.lang.String r0 = r0.getSimpleName()
                lombok.javac.handlers.HandleConstructor.HandleRequiredArgsConstructor.NAME = r0
                return
        }

        public HandleRequiredArgsConstructor() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                lombok.javac.handlers.HandleConstructor r1 = new lombok.javac.handlers.HandleConstructor
                r2 = r1
                r2.<init>()
                r0.handleConstructor = r1
                return
        }

        @Override // lombok.javac.JavacAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.RequiredArgsConstructor> r11, com.sun.tools.javac.tree.JCTree.JCAnnotation r12, lombok.javac.JavacNode r13) {
                r10 = this;
                r0 = r13
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.REQUIRED_ARGS_CONSTRUCTOR_FLAG_USAGE
                java.lang.String r2 = "@RequiredArgsConstructor"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.ANY_CONSTRUCTOR_FLAG_USAGE
                java.lang.String r4 = "any @xArgsConstructor"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                r0 = r13
                java.lang.Class<lombok.RequiredArgsConstructor> r1 = lombok.RequiredArgsConstructor.class
                lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
                r0 = r13
                java.lang.String r1 = "lombok.AccessLevel"
                lombok.javac.handlers.JavacHandlerUtil.deleteImportFromCompilationUnit(r0, r1)
                r0 = r13
                lombok.core.LombokNode r0 = r0.m66up()
                lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
                r14 = r0
                r0 = r14
                r1 = r13
                java.lang.String r2 = lombok.javac.handlers.HandleConstructor.HandleRequiredArgsConstructor.NAME
                boolean r0 = lombok.javac.handlers.HandleConstructor.checkLegality(r0, r1, r2)
                if (r0 != 0) goto L30
                return
            L30:
                r0 = r12
                java.lang.String r1 = "onConstructor"
                java.lang.String r2 = "@RequiredArgsConstructor(onConstructor"
                r3 = r13
                com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.unboxAndRemoveAnnotationParameter(r0, r1, r2, r3)
                r15 = r0
                r0 = r11
                java.lang.annotation.Annotation r0 = r0.getInstance()
                lombok.RequiredArgsConstructor r0 = (lombok.RequiredArgsConstructor) r0
                r16 = r0
                r0 = r16
                lombok.AccessLevel r0 = r0.access()
                r17 = r0
                r0 = r17
                lombok.AccessLevel r1 = lombok.AccessLevel.NONE
                if (r0 != r1) goto L56
                return
            L56:
                r0 = r16
                java.lang.String r0 = r0.staticName()
                r18 = r0
                r0 = r11
                java.lang.String r1 = "suppressConstructorProperties"
                boolean r0 = r0.isExplicit(r1)
                if (r0 == 0) goto L6e
                r0 = r13
                java.lang.String r1 = "This deprecated feature is no longer supported. Remove it; you can create a lombok.config file with 'lombok.anyConstructor.suppressConstructorProperties = true'."
                r0.addError(r1)
            L6e:
                r0 = r10
                lombok.javac.handlers.HandleConstructor r0 = r0.handleConstructor
                r1 = r14
                r2 = r17
                r3 = r15
                r4 = r14
                com.sun.tools.javac.util.List r4 = lombok.javac.handlers.HandleConstructor.findRequiredFields(r4)
                r5 = 0
                r6 = r18
                lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r7 = lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.f587NO
                r8 = r13
                r0.generateConstructor(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleConstructor$SkipIfConstructorExists.SCL.lombok */
    public enum SkipIfConstructorExists extends java.lang.Enum<lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists> {
        public static final lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists YES = null;

        /* renamed from: NO */
        public static final lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists f587NO = null;
        public static final lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists I_AM_BUILDER = null;
        private static final /* synthetic */ lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists[] ENUM$VALUES = null;

        static {
                lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r0 = new lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists
                r1 = r0
                java.lang.String r2 = "YES"
                r3 = 0
                r1.<init>(r2, r3)
                lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.YES = r0
                lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r0 = new lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists
                r1 = r0
                java.lang.String r2 = "NO"
                r3 = 1
                r1.<init>(r2, r3)
                lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.f587NO = r0
                lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r0 = new lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists
                r1 = r0
                java.lang.String r2 = "I_AM_BUILDER"
                r3 = 2
                r1.<init>(r2, r3)
                lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.I_AM_BUILDER = r0
                r0 = 3
                lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists[] r0 = new lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists[r0]
                r1 = r0
                r2 = 0
                lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r3 = lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.YES
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r3 = lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.f587NO
                r1[r2] = r3
                r1 = r0
                r2 = 2
                lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r3 = lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.I_AM_BUILDER
                r1[r2] = r3
                lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.ENUM$VALUES = r0
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

        public static lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists[] values() {
                lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists[] r0 = lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists[] r2 = new lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists valueOf(java.lang.String r3) {
                java.lang.Class<lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists> r0 = lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r0 = (lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists) r0
                return r0
        }
    }

    public HandleConstructor() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static com.sun.tools.javac.util.List<lombok.javac.JavacNode> findRequiredFields(lombok.javac.JavacNode r3) {
            r0 = r3
            r1 = 1
            com.sun.tools.javac.util.List r0 = findFields(r0, r1)
            return r0
    }

    public static com.sun.tools.javac.util.List<lombok.javac.JavacNode> findFinalFields(lombok.javac.JavacNode r3) {
            r0 = r3
            r1 = 0
            com.sun.tools.javac.util.List r0 = findFields(r0, r1)
            return r0
    }

    public static com.sun.tools.javac.util.List<lombok.javac.JavacNode> findFields(lombok.javac.JavacNode r5, boolean r6) {
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L9c
        L14:
            r0 = r9
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r8 = r0
            r0 = r8
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L2c
            goto L9c
        L2c:
            r0 = r8
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r10 = r0
            r0 = r10
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "$"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L48
            goto L9c
        L48:
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r11 = r0
            r0 = r11
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L60
            goto L9c
        L60:
            r0 = r11
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L6f
            r0 = 1
            goto L70
        L6f:
            r0 = 0
        L70:
            r13 = r0
            r0 = r6
            if (r0 == 0) goto L81
            r0 = r8
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasNonNullAnnotations(r0)
            if (r0 == 0) goto L81
            r0 = 1
            goto L82
        L81:
            r0 = 0
        L82:
            r14 = r0
            r0 = r13
            if (r0 != 0) goto L8e
            r0 = r14
            if (r0 == 0) goto L9c
        L8e:
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 != 0) goto L9c
            r0 = r7
            r1 = r8
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L9c:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            r0 = r7
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    public static com.sun.tools.javac.util.List<lombok.javac.JavacNode> findAllFields(lombok.javac.JavacNode r3) {
            r0 = r3
            r1 = 0
            com.sun.tools.javac.util.List r0 = findAllFields(r0, r1)
            return r0
    }

    public static com.sun.tools.javac.util.List<lombok.javac.JavacNode> findAllFields(lombok.javac.JavacNode r5, boolean r6) {
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L89
        L14:
            r0 = r9
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r8 = r0
            r0 = r8
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L2c
            goto L89
        L2c:
            r0 = r8
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r10 = r0
            r0 = r10
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "$"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L48
            goto L89
        L48:
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r11 = r0
            r0 = r11
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L60
            goto L89
        L60:
            r0 = r11
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L6f
            r0 = 1
            goto L70
        L6f:
            r0 = 0
        L70:
            r13 = r0
            r0 = r6
            if (r0 != 0) goto L83
            r0 = r13
            if (r0 == 0) goto L83
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 != 0) goto L89
        L83:
            r0 = r7
            r1 = r8
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L89:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            r0 = r7
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    public static boolean checkLegality(lombok.javac.JavacNode r5, lombok.javac.JavacNode r6, java.lang.String r7) {
            r0 = r5
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isClassOrEnum(r0)
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

    public void generateExtraNoArgsConstructor(lombok.javac.JavacNode r12, lombok.javac.JavacNode r13) {
            r11 = this;
            r0 = r12
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isDirectDescendantOfObject(r0)
            if (r0 != 0) goto L8
            return
        L8:
            r0 = r12
            lombok.javac.JavacAST r0 = r0.getAst()
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
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = 1
            r6 = 0
            lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r7 = lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.f587NO
            r8 = r13
            r9 = 1
            r0.generate(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public void generateRequiredArgsConstructor(lombok.javac.JavacNode r11, lombok.AccessLevel r12, java.lang.String r13, lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists r14, lombok.javac.JavacNode r15) {
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            r4 = r11
            com.sun.tools.javac.util.List r4 = findRequiredFields(r4)
            r5 = 0
            r6 = r13
            r7 = r14
            r8 = r15
            r0.generateConstructor(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void generateAllArgsConstructor(lombok.javac.JavacNode r11, lombok.AccessLevel r12, java.lang.String r13, lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists r14, lombok.javac.JavacNode r15) {
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            r4 = r11
            com.sun.tools.javac.util.List r4 = findAllFields(r4)
            r5 = 0
            r6 = r13
            r7 = r14
            r8 = r15
            r0.generateConstructor(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void generateConstructor(lombok.javac.JavacNode r12, lombok.AccessLevel r13, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r14, com.sun.tools.javac.util.List<lombok.javac.JavacNode> r15, boolean r16, java.lang.String r17, lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists r18, lombok.javac.JavacNode r19) {
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

    private void generate(lombok.javac.JavacNode r10, lombok.AccessLevel r11, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r12, com.sun.tools.javac.util.List<lombok.javac.JavacNode> r13, boolean r14, java.lang.String r15, lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists r16, lombok.javac.JavacNode r17, boolean r18) {
            r9 = this;
            r0 = r15
            if (r0 == 0) goto L13
            r0 = r15
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            r19 = r0
            r0 = r16
            lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r1 = lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.f587NO
            if (r0 == r1) goto L98
            r0 = r10
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r21 = r0
            goto L8e
        L2a:
            r0 = r21
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r20 = r0
            r0 = r20
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L8e
            java.lang.Class<lombok.NoArgsConstructor> r0 = lombok.NoArgsConstructor.class
            r1 = r20
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 != 0) goto L63
            java.lang.Class<lombok.AllArgsConstructor> r0 = lombok.AllArgsConstructor.class
            r1 = r20
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 != 0) goto L63
            java.lang.Class<lombok.RequiredArgsConstructor> r0 = lombok.RequiredArgsConstructor.class
            r1 = r20
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 != 0) goto L63
            r0 = 0
            goto L64
        L63:
            r0 = 1
        L64:
            r22 = r0
            r0 = r22
            if (r0 != 0) goto L7c
            r0 = r16
            lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r1 = lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.YES
            if (r0 != r1) goto L7c
            java.lang.Class<lombok.Builder> r0 = lombok.Builder.class
            r1 = r20
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.annotationTypeMatches(r0, r1)
            r22 = r0
        L7c:
            r0 = r22
            if (r0 == 0) goto L8e
            r0 = r19
            if (r0 == 0) goto L8d
            r0 = r17
            java.lang.String r1 = "Ignoring static constructor name: explicit @XxxArgsConstructor annotation present; its `staticName` parameter will be used."
            r0.addWarning(r1)
        L8d:
            return
        L8e:
            r0 = r21
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2a
        L98:
            r0 = r18
            if (r0 == 0) goto La5
            r0 = r10
            boolean r0 = noArgsConstructorExists(r0)
            if (r0 == 0) goto La5
            return
        La5:
            r0 = r16
            lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r1 = lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.f587NO
            if (r0 == r1) goto Lb7
            r0 = r10
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.constructorExists(r0)
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto Ld6
        Lb7:
            r0 = r19
            if (r0 == 0) goto Lc2
            lombok.AccessLevel r0 = lombok.AccessLevel.PRIVATE
            goto Lc3
        Lc2:
            r0 = r11
        Lc3:
            r1 = r12
            r2 = r10
            r3 = r13
            r4 = r14
            r5 = r17
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = createConstructor(r0, r1, r2, r3, r4, r5)
            r20 = r0
            r0 = r10
            r1 = r20
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        Ld6:
            r0 = r9
            r1 = r19
            r2 = r10
            r3 = r15
            r4 = r11
            r5 = r14
            r6 = r13
            r7 = r17
            r0.generateStaticConstructor(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private void generateStaticConstructor(boolean r8, lombok.javac.JavacNode r9, java.lang.String r10, lombok.AccessLevel r11, boolean r12, com.sun.tools.javac.util.List<lombok.javac.JavacNode> r13, lombok.javac.JavacNode r14) {
            r7 = this;
            r0 = r8
            if (r0 == 0) goto L23
            r0 = r7
            r1 = r10
            r2 = r11
            r3 = r9
            r4 = r12
            if (r4 == 0) goto L14
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            goto L16
        L14:
            r4 = r13
        L16:
            r5 = r14
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.createStaticConstructor(r1, r2, r3, r4, r5)
            r15 = r0
            r0 = r9
            r1 = r15
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        L23:
            return
    }

    private static boolean noArgsConstructorExists(lombok.javac.JavacNode r3) {
            r0 = r3
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.upToTypeNode(r0)
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L5c
            r0 = r3
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L5c
            r0 = r3
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
            goto L53
        L24:
            r0 = r5
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r4 = r0
            r0 = r4
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L53
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r6 = r0
            r0 = r6
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r1 = "<init>"
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L53
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.params
            int r0 = r0.size()
            if (r0 != 0) goto L53
            r0 = 1
            return r0
        L53:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L24
        L5c:
            r0 = r3
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
            goto La6
        L67:
            r0 = r5
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r4 = r0
            java.lang.Class<lombok.NoArgsConstructor> r0 = lombok.NoArgsConstructor.class
            r1 = r4
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L7c
            r0 = 1
            return r0
        L7c:
            java.lang.Class<lombok.RequiredArgsConstructor> r0 = lombok.RequiredArgsConstructor.class
            r1 = r4
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L91
            r0 = r3
            com.sun.tools.javac.util.List r0 = findRequiredFields(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L91
            r0 = 1
            return r0
        L91:
            java.lang.Class<lombok.AllArgsConstructor> r0 = lombok.AllArgsConstructor.class
            r1 = r4
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 == 0) goto La6
            r0 = r3
            com.sun.tools.javac.util.List r0 = findAllFields(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La6
            r0 = 1
            return r0
        La6:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L67
            r0 = 0
            return r0
    }

    public static void addConstructorProperties(com.sun.tools.javac.tree.JCTree.JCModifiers r8, lombok.javac.JavacNode r9, com.sun.tools.javac.util.List<lombok.javac.JavacNode> r10) {
            r0 = r10
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8
            return
        L8:
            r0 = r9
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r11 = r0
            r0 = r9
            java.lang.String r1 = "java"
            java.lang.String r2 = "beans"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "ConstructorProperties"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r12 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto L57
        L35:
            r0 = r15
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r14 = r0
            r0 = r14
            com.sun.tools.javac.util.Name r0 = lombok.javac.handlers.JavacHandlerUtil.removePrefixFromField(r0)
            r16 = r0
            r0 = r13
            r1 = r11
            r2 = r16
            java.lang.String r2 = r2.toString()
            com.sun.tools.javac.tree.JCTree$JCLiteral r1 = r1.Literal(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L57:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L35
            r0 = r11
            r1 = 0
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r13
            com.sun.tools.javac.util.List r3 = r3.toList()
            com.sun.tools.javac.tree.JCTree$JCNewArray r0 = r0.NewArray(r1, r2, r3)
            r14 = r0
            r0 = r11
            r1 = r12
            r2 = r14
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r15 = r0
            r0 = r8
            r1 = r8
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = r15
            com.sun.tools.javac.util.List r1 = r1.append(r2)
            r0.annotations = r1
            return
    }

    public static com.sun.tools.javac.tree.JCTree.JCMethodDecl createConstructor(lombok.AccessLevel r13, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r14, lombok.javac.JavacNode r15, com.sun.tools.javac.util.List<lombok.javac.JavacNode> r16, boolean r17, lombok.javac.JavacNode r18) {
            r0 = r15
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r19 = r0
            r0 = r15
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16384(0x4000, double:8.0948E-320)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            r20 = r0
            r0 = r20
            if (r0 == 0) goto L2c
            lombok.AccessLevel r0 = lombok.AccessLevel.PRIVATE
            r13 = r0
        L2c:
            r0 = r15
            r1 = r16
            com.sun.tools.javac.util.List r0 = fieldsNeedingBuilderDefaults(r0, r1)
            r22 = r0
            r0 = r17
            if (r0 == 0) goto L40
            r0 = r15
            r1 = r16
            com.sun.tools.javac.util.List r0 = fieldsNeedingExplicitDefaults(r0, r1)
            goto L43
        L40:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
        L43:
            r23 = r0
            r0 = r16
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L52
            r0 = 0
            r21 = r0
            goto L80
        L52:
            r0 = r15
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.ANY_CONSTRUCTOR_ADD_CONSTRUCTOR_PROPERTIES
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r24 = r0
            r0 = r24
            if (r0 == 0) goto L6e
            r0 = r24
            boolean r0 = r0.booleanValue()
            goto L7e
        L6e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = r15
            lombok.javac.JavacAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.ANY_CONSTRUCTOR_SUPPRESS_CONSTRUCTOR_PROPERTIES
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
        L7e:
            r21 = r0
        L80:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r24 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r25 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r26 = r0
            r0 = r16
            java.util.Iterator r0 = r0.iterator()
            r28 = r0
            goto L15c
        La4:
            r0 = r28
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r27 = r0
            r0 = r27
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r29 = r0
            r0 = r27
            com.sun.tools.javac.util.Name r0 = lombok.javac.handlers.JavacHandlerUtil.removePrefixFromField(r0)
            r30 = r0
            r0 = r29
            com.sun.tools.javac.util.Name r0 = r0.name
            r31 = r0
            r0 = r27
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.findCopyableAnnotations(r0)
            r32 = r0
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            r1 = r15
            com.sun.tools.javac.util.Context r1 = r1.getContext()
            long r0 = lombok.javac.handlers.JavacHandlerUtil.addFinalIfNeeded(r0, r1)
            r33 = r0
            r0 = r27
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r1 = r29
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.vartype
            r2 = r18
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r0, r1, r2)
            r35 = r0
            r0 = r19
            r1 = r19
            r2 = r33
            r3 = r32
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r30
            r3 = r35
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r36 = r0
            r0 = r26
            r1 = r36
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r27
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasNonNullAnnotations(r0)
            if (r0 == 0) goto L129
            r0 = r19
            r1 = r36
            r2 = r18
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = lombok.javac.handlers.JavacHandlerUtil.generateNullCheck(r0, r1, r2)
            r37 = r0
            r0 = r37
            if (r0 == 0) goto L129
            r0 = r24
            r1 = r37
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L129:
            r0 = r19
            r1 = r19
            r2 = r27
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r31
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r37 = r0
            r0 = r19
            r1 = r37
            r2 = r19
            r3 = r30
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = r0.Assign(r1, r2)
            r38 = r0
            r0 = r25
            r1 = r19
            r2 = r38
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.Exec(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L15c:
            r0 = r28
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto La4
            r0 = r23
            java.util.Iterator r0 = r0.iterator()
            r28 = r0
            goto L1c3
        L170:
            r0 = r28
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r27 = r0
            r0 = r27
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r29 = r0
            r0 = r29
            com.sun.tools.javac.util.Name r0 = r0.name
            r30 = r0
            r0 = r19
            r1 = r19
            r2 = r27
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r30
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r31 = r0
            r0 = r19
            r1 = r31
            r2 = r19
            r3 = r29
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = r3.vartype
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = getDefaultExpr(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = r0.Assign(r1, r2)
            r32 = r0
            r0 = r25
            r1 = r19
            r2 = r32
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.Exec(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L1c3:
            r0 = r28
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L170
            r0 = r22
            java.util.Iterator r0 = r0.iterator()
            r28 = r0
            goto L260
        L1d7:
            r0 = r28
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r27 = r0
            r0 = r27
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r29 = r0
            r0 = r29
            com.sun.tools.javac.util.Name r0 = r0.name
            r30 = r0
            r0 = r27
            com.sun.tools.javac.util.Name r0 = lombok.javac.handlers.JavacHandlerUtil.removePrefixFromField(r0)
            r31 = r0
            r0 = r15
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "$default$"
            r2.<init>(r3)
            r2 = r31
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r32 = r0
            r0 = r19
            r1 = r19
            r2 = r27
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r30
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r33 = r0
            r0 = r19
            r1 = r33
            r2 = r19
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            r4 = r19
            r5 = r19
            r6 = r15
            java.lang.Object r6 = r6.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r6 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r6
            com.sun.tools.javac.util.Name r6 = r6.name
            com.sun.tools.javac.tree.JCTree$JCIdent r5 = r5.Ident(r6)
            r6 = r32
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r4 = r4.Select(r5, r6)
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r2 = r2.Apply(r3, r4, r5)
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = r0.Assign(r1, r2)
            r34 = r0
            r0 = r25
            r1 = r19
            r2 = r34
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.Exec(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L260:
            r0 = r28
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1d7
            r0 = r19
            r1 = r13
            int r1 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r1)
            long r1 = (long) r1
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r27 = r0
            r0 = r21
            if (r0 == 0) goto L29c
            r0 = r15
            boolean r0 = isLocalType(r0)
            if (r0 != 0) goto L29c
            r0 = r15
            com.sun.tools.javac.util.Context r0 = r0.getContext()
            lombok.javac.LombokOptions r0 = lombok.delombok.LombokOptionsFactory.getDelombokOptions(r0)
            lombok.delombok.FormatPreferences r0 = r0.getFormatPreferences()
            boolean r0 = r0.generateConstructorProperties()
            if (r0 == 0) goto L29c
            r0 = r27
            r1 = r15
            r2 = r16
            addConstructorProperties(r0, r1, r2)
        L29c:
            r0 = r14
            if (r0 == 0) goto L2b1
            r0 = r27
            r1 = r27
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = r14
            com.sun.tools.javac.util.List r2 = lombok.javac.handlers.JavacHandlerUtil.copyAnnotations(r2)
            com.sun.tools.javac.util.List r1 = r1.appendList(r2)
            r0.annotations = r1
        L2b1:
            r0 = r19
            r1 = r27
            r2 = r15
            java.lang.String r3 = "<init>"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = 0
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = r26
            com.sun.tools.javac.util.List r5 = r5.toList()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r19
            r8 = 0
            r9 = r24
            r10 = r25
            com.sun.tools.javac.util.ListBuffer r9 = r9.appendList(r10)
            com.sun.tools.javac.util.List r9 = r9.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r7 = r7.Block(r8, r9)
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r18
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            return r0
    }

    private static com.sun.tools.javac.util.List<lombok.javac.JavacNode> fieldsNeedingBuilderDefaults(lombok.javac.JavacNode r5, com.sun.tools.javac.util.List<lombok.javac.JavacNode> r6) {
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L81
        L14:
            r0 = r9
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r8 = r0
            r0 = r8
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L2c
            goto L81
        L2c:
            r0 = r8
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r10 = r0
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L49
            goto L81
        L49:
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L67
        L52:
            r0 = r12
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r11 = r0
            r0 = r8
            r1 = r11
            if (r0 != r1) goto L67
            goto L81
        L67:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L52
            java.lang.Class<lombok.Builder$Default> r0 = lombok.Builder.Default.class
            r1 = r8
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L81
            r0 = r7
            r1 = r8
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L81:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            r0 = r7
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    private static com.sun.tools.javac.util.List<lombok.javac.JavacNode> fieldsNeedingExplicitDefaults(lombok.javac.JavacNode r5, com.sun.tools.javac.util.List<lombok.javac.JavacNode> r6) {
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto La3
        L14:
            r0 = r9
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r8 = r0
            r0 = r8
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L2c
            goto La3
        L2c:
            r0 = r8
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r10 = r0
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 == 0) goto L40
            goto La3
        L40:
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L54
            goto La3
        L54:
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L68
            goto La3
        L68:
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L86
        L71:
            r0 = r12
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r11 = r0
            r0 = r8
            r1 = r11
            if (r0 != r1) goto L86
            goto La3
        L86:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L71
            java.lang.Class<lombok.Builder$Default> r0 = lombok.Builder.Default.class
            r1 = r8
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L9d
            goto La3
        L9d:
            r0 = r7
            r1 = r8
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        La3:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            r0 = r7
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    private static com.sun.tools.javac.tree.JCTree.JCExpression getDefaultExpr(lombok.javac.JavacTreeMaker r5, com.sun.tools.javac.tree.JCTree.JCExpression r6) {
            r0 = r6
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree
            if (r0 == 0) goto L8c
            int[] r0 = $SWITCH_TABLE$javax$lang$model$type$TypeKind()
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r1 = (com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree) r1
            javax.lang.model.type.TypeKind r1 = r1.getPrimitiveTypeKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L44;
                case 2: goto L5c;
                case 3: goto L5c;
                case 4: goto L5c;
                case 5: goto L68;
                case 6: goto L50;
                case 7: goto L74;
                case 8: goto L80;
                default: goto L5c;
            }
        L44:
            r0 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_BOOLEAN
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1, r2)
            return r0
        L50:
            r0 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_CHAR
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1, r2)
            return r0
        L5c:
            r0 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_INT
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1, r2)
            return r0
        L68:
            r0 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_LONG
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1, r2)
            return r0
        L74:
            r0 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_FLOAT
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1, r2)
            return r0
        L80:
            r0 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_DOUBLE
            r2 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1, r2)
            return r0
        L8c:
            r0 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_BOT
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1, r2)
            return r0
    }

    public static boolean isLocalType(lombok.javac.JavacNode r3) {
            r0 = r3
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
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
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            boolean r0 = isLocalType(r0)
            return r0
        L26:
            r0 = 1
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCMethodDecl createStaticConstructor(java.lang.String r11, lombok.AccessLevel r12, lombok.javac.JavacNode r13, com.sun.tools.javac.util.List<lombok.javac.JavacNode> r14, lombok.javac.JavacNode r15) {
            r10 = this;
            r0 = r13
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r16 = r0
            r0 = r13
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r17 = r0
            r0 = r16
            r1 = 8
            r2 = r12
            int r2 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r2)
            r1 = r1 | r2
            long r1 = (long) r1
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1)
            r18 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r21 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r22 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r23 = r0
            r0 = r17
            com.sun.tools.javac.util.List r0 = r0.typarams
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7c
            r0 = r17
            com.sun.tools.javac.util.List r0 = r0.typarams
            java.util.Iterator r0 = r0.iterator()
            r25 = r0
            goto L72
        L51:
            r0 = r25
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r0 = (com.sun.tools.javac.tree.JCTree.JCTypeParameter) r0
            r24 = r0
            r0 = r21
            r1 = r16
            r2 = r24
            com.sun.tools.javac.util.Name r2 = r2.name
            r3 = r24
            com.sun.tools.javac.util.List r3 = r3.bounds
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r1 = r1.TypeParameter(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L72:
            r0 = r25
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L51
        L7c:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r24 = r0
            r0 = r13
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.javac.handlers.JavacHandlerUtil.getCheckerFrameworkVersion(r0)
            boolean r0 = r0.generateUnique()
            if (r0 == 0) goto L9f
            r0 = r16
            r1 = r13
            java.lang.String r2 = "org.checkerframework.common.aliasing.qual.Unique"
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r24 = r0
        L9f:
            r0 = r16
            r1 = r13
            r2 = r17
            com.sun.tools.javac.util.List r2 = r2.typarams
            r3 = r24
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2, r3)
            r19 = r0
            r0 = r16
            r1 = r13
            r2 = r17
            com.sun.tools.javac.util.List r2 = r2.typarams
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2)
            r20 = r0
            r0 = r14
            java.util.Iterator r0 = r0.iterator()
            r26 = r0
            goto L12d
        Lc5:
            r0 = r26
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r25 = r0
            r0 = r25
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r27 = r0
            r0 = r25
            com.sun.tools.javac.util.Name r0 = lombok.javac.handlers.JavacHandlerUtil.removePrefixFromField(r0)
            r28 = r0
            r0 = r16
            r1 = r27
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.vartype
            r2 = r15
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r0, r1, r2)
            r29 = r0
            r0 = r25
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.findCopyableAnnotations(r0)
            r30 = r0
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            r1 = r13
            com.sun.tools.javac.util.Context r1 = r1.getContext()
            long r0 = lombok.javac.handlers.JavacHandlerUtil.addFinalIfNeeded(r0, r1)
            r31 = r0
            r0 = r16
            r1 = r16
            r2 = r31
            r3 = r30
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r28
            r3 = r29
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r33 = r0
            r0 = r22
            r1 = r33
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r23
            r1 = r16
            r2 = r28
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L12d:
            r0 = r26
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lc5
            r0 = r16
            r1 = r16
            r2 = 0
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            r4 = r20
            r5 = r23
            com.sun.tools.javac.util.List r5 = r5.toList()
            r6 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r1 = r1.NewClass(r2, r3, r4, r5, r6)
            com.sun.tools.javac.tree.JCTree$JCReturn r0 = r0.Return(r1)
            r25 = r0
            r0 = r16
            r1 = 0
            r2 = r25
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r26 = r0
            r0 = r16
            r1 = r18
            r2 = r13
            r3 = r11
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r19
            r4 = r21
            com.sun.tools.javac.util.List r4 = r4.toList()
            r5 = r22
            com.sun.tools.javac.util.List r5 = r5.toList()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r26
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r27 = r0
            r0 = r13
            r1 = r27
            lombok.javac.handlers.JavacHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r27
            r1 = r15
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$javax$lang$model$type$TypeKind() {
            int[] r0 = lombok.javac.handlers.HandleConstructor.$SWITCH_TABLE$javax$lang$model$type$TypeKind
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            javax.lang.model.type.TypeKind[] r0 = javax.lang.model.type.TypeKind.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.ARRAY     // Catch: java.lang.NoSuchFieldError -> L1d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
            r2 = 12
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            goto L1e
        L1d:
        L1e:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L2a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2a
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2a
            goto L2b
        L2a:
        L2b:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.BYTE     // Catch: java.lang.NoSuchFieldError -> L37
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L37
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L37
            goto L38
        L37:
        L38:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.CHAR     // Catch: java.lang.NoSuchFieldError -> L45
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
            r2 = 6
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            goto L46
        L45:
        L46:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.DECLARED     // Catch: java.lang.NoSuchFieldError -> L53
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L53
            r2 = 13
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L53
            goto L54
        L53:
        L54:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L61
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
            r2 = 8
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            goto L62
        L61:
        L62:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.ERROR     // Catch: java.lang.NoSuchFieldError -> L6f
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6f
            r2 = 14
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6f
            goto L70
        L6f:
        L70:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.EXECUTABLE     // Catch: java.lang.NoSuchFieldError -> L7d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
            r2 = 18
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7d
            goto L7e
        L7d:
        L7e:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.FLOAT     // Catch: java.lang.NoSuchFieldError -> L8b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8b
            r2 = 7
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8b
            goto L8c
        L8b:
        L8c:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.INT     // Catch: java.lang.NoSuchFieldError -> L98
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L98
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L98
            goto L99
        L98:
        L99:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.LONG     // Catch: java.lang.NoSuchFieldError -> La5
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La5
            r2 = 5
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La5
            goto La6
        La5:
        La6:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.NONE     // Catch: java.lang.NoSuchFieldError -> Lb3
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb3
            r2 = 10
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb3
            goto Lb4
        Lb3:
        Lb4:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.NULL     // Catch: java.lang.NoSuchFieldError -> Lc1
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc1
            r2 = 11
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc1
            goto Lc2
        Lc1:
        Lc2:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.OTHER     // Catch: java.lang.NoSuchFieldError -> Lcf
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcf
            r2 = 19
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcf
            goto Ld0
        Lcf:
        Ld0:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.PACKAGE     // Catch: java.lang.NoSuchFieldError -> Ldd
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ldd
            r2 = 17
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ldd
            goto Lde
        Ldd:
        Lde:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.SHORT     // Catch: java.lang.NoSuchFieldError -> Lea
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lea
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lea
            goto Leb
        Lea:
        Leb:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.TYPEVAR     // Catch: java.lang.NoSuchFieldError -> Lf8
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf8
            r2 = 15
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lf8
            goto Lf9
        Lf8:
        Lf9:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.VOID     // Catch: java.lang.NoSuchFieldError -> L106
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L106
            r2 = 9
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L106
            goto L107
        L106:
        L107:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.WILDCARD     // Catch: java.lang.NoSuchFieldError -> L114
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L114
            r2 = 16
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L114
            goto L115
        L114:
        L115:
            r0 = r4
            r1 = r0
            lombok.javac.handlers.HandleConstructor.$SWITCH_TABLE$javax$lang$model$type$TypeKind = r1
            return r0
    }
}
