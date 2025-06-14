package lombok.javac.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleLog.SCL.lombok */
public class HandleLog {
    private static final lombok.core.configuration.IdentifierName LOG = null;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    /* renamed from: $SWITCH_TABLE$lombok$core$configuration$LogDeclaration$LogFactoryParameter */
    private static /* synthetic */ int[] f591xeb5c83f5;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleLog$HandleCommonsLog.SCL.lombok */
    public static class HandleCommonsLog extends lombok.javac.JavacAnnotationHandler<lombok.extern.apachecommons.CommonsLog> {
        public HandleCommonsLog() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.javac.JavacAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.extern.apachecommons.CommonsLog> r7, com.sun.tools.javac.tree.JCTree.JCAnnotation r8, lombok.javac.JavacNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_COMMONS_FLAG_USAGE
                java.lang.String r2 = "@apachecommons.CommonsLog"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                lombok.core.handlers.LoggingFramework r0 = lombok.core.handlers.LoggingFramework.COMMONS
                r1 = r7
                r2 = r9
                lombok.javac.handlers.HandleLog.processAnnotation(r0, r1, r2)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleLog$HandleCustomLog.SCL.lombok */
    public static class HandleCustomLog extends lombok.javac.JavacAnnotationHandler<lombok.CustomLog> {
        public HandleCustomLog() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.javac.JavacAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.CustomLog> r7, com.sun.tools.javac.tree.JCTree.JCAnnotation r8, lombok.javac.JavacNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_CUSTOM_FLAG_USAGE
                java.lang.String r2 = "@CustomLog"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                r0 = r9
                lombok.javac.JavacAST r0 = r0.getAst()
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.LogDeclaration> r1 = lombok.ConfigurationKeys.LOG_CUSTOM_DECLARATION
                java.lang.Object r0 = r0.readConfiguration(r1)
                lombok.core.configuration.LogDeclaration r0 = (lombok.core.configuration.LogDeclaration) r0
                r10 = r0
                r0 = r10
                if (r0 != 0) goto L29
                r0 = r9
                java.lang.String r1 = "The @CustomLog is not configured; please set lombok.log.custom.declaration in lombok.config."
                r0.addError(r1)
                return
            L29:
                lombok.core.handlers.LoggingFramework r0 = new lombok.core.handlers.LoggingFramework
                r1 = r0
                java.lang.Class<lombok.CustomLog> r2 = lombok.CustomLog.class
                r3 = r10
                r1.<init>(r2, r3)
                r11 = r0
                r0 = r11
                r1 = r7
                r2 = r9
                lombok.javac.handlers.HandleLog.processAnnotation(r0, r1, r2)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleLog$HandleFloggerLog.SCL.lombok */
    public static class HandleFloggerLog extends lombok.javac.JavacAnnotationHandler<lombok.extern.flogger.Flogger> {
        public HandleFloggerLog() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.javac.JavacAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.extern.flogger.Flogger> r7, com.sun.tools.javac.tree.JCTree.JCAnnotation r8, lombok.javac.JavacNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_FLOGGER_FLAG_USAGE
                java.lang.String r2 = "@Flogger"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                lombok.core.handlers.LoggingFramework r0 = lombok.core.handlers.LoggingFramework.FLOGGER
                r1 = r7
                r2 = r9
                lombok.javac.handlers.HandleLog.processAnnotation(r0, r1, r2)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleLog$HandleJBossLog.SCL.lombok */
    public static class HandleJBossLog extends lombok.javac.JavacAnnotationHandler<lombok.extern.jbosslog.JBossLog> {
        public HandleJBossLog() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.javac.JavacAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.extern.jbosslog.JBossLog> r7, com.sun.tools.javac.tree.JCTree.JCAnnotation r8, lombok.javac.JavacNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_JBOSSLOG_FLAG_USAGE
                java.lang.String r2 = "@JBossLog"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                lombok.core.handlers.LoggingFramework r0 = lombok.core.handlers.LoggingFramework.JBOSSLOG
                r1 = r7
                r2 = r9
                lombok.javac.handlers.HandleLog.processAnnotation(r0, r1, r2)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleLog$HandleJulLog.SCL.lombok */
    public static class HandleJulLog extends lombok.javac.JavacAnnotationHandler<lombok.extern.java.Log> {
        public HandleJulLog() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.javac.JavacAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.extern.java.Log> r7, com.sun.tools.javac.tree.JCTree.JCAnnotation r8, lombok.javac.JavacNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_JUL_FLAG_USAGE
                java.lang.String r2 = "@java.Log"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                lombok.core.handlers.LoggingFramework r0 = lombok.core.handlers.LoggingFramework.JUL
                r1 = r7
                r2 = r9
                lombok.javac.handlers.HandleLog.processAnnotation(r0, r1, r2)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleLog$HandleLog4j2Log.SCL.lombok */
    public static class HandleLog4j2Log extends lombok.javac.JavacAnnotationHandler<lombok.extern.log4j.Log4j2> {
        public HandleLog4j2Log() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.javac.JavacAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.extern.log4j.Log4j2> r7, com.sun.tools.javac.tree.JCTree.JCAnnotation r8, lombok.javac.JavacNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_LOG4J2_FLAG_USAGE
                java.lang.String r2 = "@Log4j2"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                lombok.core.handlers.LoggingFramework r0 = lombok.core.handlers.LoggingFramework.LOG4J2
                r1 = r7
                r2 = r9
                lombok.javac.handlers.HandleLog.processAnnotation(r0, r1, r2)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleLog$HandleLog4jLog.SCL.lombok */
    public static class HandleLog4jLog extends lombok.javac.JavacAnnotationHandler<lombok.extern.log4j.Log4j> {
        public HandleLog4jLog() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.javac.JavacAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.extern.log4j.Log4j> r7, com.sun.tools.javac.tree.JCTree.JCAnnotation r8, lombok.javac.JavacNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_LOG4J_FLAG_USAGE
                java.lang.String r2 = "@Log4j"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                lombok.core.handlers.LoggingFramework r0 = lombok.core.handlers.LoggingFramework.LOG4J
                r1 = r7
                r2 = r9
                lombok.javac.handlers.HandleLog.processAnnotation(r0, r1, r2)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleLog$HandleSlf4jLog.SCL.lombok */
    public static class HandleSlf4jLog extends lombok.javac.JavacAnnotationHandler<lombok.extern.slf4j.Slf4j> {
        public HandleSlf4jLog() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.javac.JavacAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.extern.slf4j.Slf4j> r7, com.sun.tools.javac.tree.JCTree.JCAnnotation r8, lombok.javac.JavacNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_SLF4J_FLAG_USAGE
                java.lang.String r2 = "@Slf4j"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                lombok.core.handlers.LoggingFramework r0 = lombok.core.handlers.LoggingFramework.SLF4J
                r1 = r7
                r2 = r9
                lombok.javac.handlers.HandleLog.processAnnotation(r0, r1, r2)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleLog$HandleXSlf4jLog.SCL.lombok */
    public static class HandleXSlf4jLog extends lombok.javac.JavacAnnotationHandler<lombok.extern.slf4j.XSlf4j> {
        public HandleXSlf4jLog() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.javac.JavacAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.extern.slf4j.XSlf4j> r7, com.sun.tools.javac.tree.JCTree.JCAnnotation r8, lombok.javac.JavacNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_XSLF4J_FLAG_USAGE
                java.lang.String r2 = "@XSlf4j"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                lombok.core.handlers.LoggingFramework r0 = lombok.core.handlers.LoggingFramework.XSLF4J
                r1 = r7
                r2 = r9
                lombok.javac.handlers.HandleLog.processAnnotation(r0, r1, r2)
                return
        }
    }

    static {
            java.lang.String r0 = "log"
            lombok.core.configuration.IdentifierName r0 = lombok.core.configuration.IdentifierName.valueOf(r0)
            lombok.javac.handlers.HandleLog.LOG = r0
            return
    }

    private HandleLog() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void processAnnotation(lombok.core.handlers.LoggingFramework r8, lombok.core.AnnotationValues<?> r9, lombok.javac.JavacNode r10) {
            r0 = r10
            r1 = r8
            java.lang.Class r1 = r1.getAnnotationClass()
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r11 = r0
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r11
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L2c;
                default: goto L19b;
            }
        L2c:
            r0 = r10
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.IdentifierName> r1 = lombok.ConfigurationKeys.LOG_ANY_FIELD_NAME
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.IdentifierName r0 = (lombok.core.configuration.IdentifierName) r0
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L45
            lombok.core.configuration.IdentifierName r0 = lombok.javac.handlers.HandleLog.LOG
            r12 = r0
        L45:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = r10
            lombok.javac.JavacAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.LOG_ANY_FIELD_IS_STATIC
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5c
            r0 = 0
            goto L5d
        L5c:
            r0 = 1
        L5d:
            r13 = r0
            r0 = r11
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 512(0x200, double:2.53E-321)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L90
            r0 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r8
            java.lang.String r3 = r3.getAnnotationAsString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = " is legal only on classes and enums."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        L90:
            r0 = r12
            java.lang.String r0 = r0.getName()
            r1 = r11
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.fieldExists(r0, r1)
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto Lba
            r0 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Field '"
            r2.<init>(r3)
            r2 = r12
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' already exists."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addWarning(r1)
            return
        Lba:
            r0 = r11
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isRecord(r0)
            if (r0 == 0) goto Lcd
            r0 = r13
            if (r0 != 0) goto Lcd
            r0 = r10
            java.lang.String r1 = "Logger fields must be static in records."
            r0.addError(r1)
            return
        Lcd:
            r0 = r13
            if (r0 == 0) goto Lf4
            r0 = r11
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isStaticAllowed(r0)
            if (r0 != 0) goto Lf4
            r0 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r8
            java.lang.String r3 = r3.getAnnotationAsString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = " is not supported on non-static nested classes."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        Lf4:
            r0 = r9
            java.lang.String r1 = "topic"
            java.lang.Object r0 = r0.getValueGuess(r1)
            r14 = r0
            r0 = r9
            java.lang.String r1 = "topic"
            java.lang.Object r0 = r0.getActualExpression(r1)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r15 = r0
            r0 = r14
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L120
            r0 = r14
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L120
            r0 = 0
            r15 = r0
        L120:
            r0 = r8
            lombok.core.configuration.LogDeclaration r0 = r0.getDeclaration()
            java.util.List r0 = r0.getParametersWithTopic()
            if (r0 != 0) goto L14c
            r0 = r15
            if (r0 == 0) goto L14c
            r0 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r8
            java.lang.String r3 = r3.getAnnotationAsString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = " does not allow a topic."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            r0 = 0
            r15 = r0
        L14c:
            r0 = r8
            lombok.core.configuration.LogDeclaration r0 = r0.getDeclaration()
            java.util.List r0 = r0.getParametersWithoutTopic()
            if (r0 != 0) goto L180
            r0 = r15
            if (r0 != 0) goto L180
            r0 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r8
            java.lang.String r3 = r3.getAnnotationAsString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = " requires a topic."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            java.lang.String r1 = ""
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1)
            r15 = r0
        L180:
            r0 = r11
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = selfType(r0)
            r16 = r0
            r0 = r8
            r1 = r11
            r2 = r16
            r3 = r10
            r4 = r12
            java.lang.String r4 = r4.getName()
            r5 = r13
            r6 = r15
            boolean r0 = createField(r0, r1, r2, r3, r4, r5, r6)
            goto L1a1
        L19b:
            r0 = r10
            java.lang.String r1 = "@Log is legal only on types."
            r0.addError(r1)
        L1a1:
            return
    }

    public static com.sun.tools.javac.tree.JCTree.JCFieldAccess selfType(lombok.javac.JavacNode r5) {
            r0 = r5
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r6 = r0
            r0 = r5
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r7 = r0
            r0 = r6
            r1 = r6
            r2 = r7
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r5
            java.lang.String r3 = "class"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            return r0
    }

    private static boolean createField(lombok.core.handlers.LoggingFramework r6, lombok.javac.JavacNode r7, com.sun.tools.javac.tree.JCTree.JCFieldAccess r8, lombok.javac.JavacNode r9, java.lang.String r10, boolean r11, com.sun.tools.javac.tree.JCTree.JCExpression r12) {
            r0 = r7
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r13 = r0
            r0 = r6
            lombok.core.configuration.LogDeclaration r0 = r0.getDeclaration()
            r14 = r0
            r0 = r7
            r1 = r14
            lombok.core.configuration.TypeName r1 = r1.getLoggerType()
            java.lang.String r1 = r1.getName()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDotsString(r0, r1)
            r15 = r0
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r14
            lombok.core.configuration.TypeName r3 = r3.getLoggerFactoryType()
            java.lang.String r3 = r3.getName()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = "."
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r14
            lombok.core.configuration.IdentifierName r2 = r2.getLoggerFactoryMethod()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDotsString(r0, r1)
            r16 = r0
            r0 = r12
            if (r0 == 0) goto L53
            r0 = r14
            java.util.List r0 = r0.getParametersWithTopic()
            goto L58
        L53:
            r0 = r14
            java.util.List r0 = r0.getParametersWithoutTopic()
        L58:
            r17 = r0
            r0 = r7
            r1 = r8
            r2 = r17
            r3 = r12
            com.sun.tools.javac.tree.JCTree$JCExpression[] r0 = createFactoryParameters(r0, r1, r2, r3)
            r18 = r0
            r0 = r13
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r16
            r3 = r18
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.from(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r19 = r0
            r0 = r13
            r1 = r13
            r2 = 18
            r3 = r11
            if (r3 == 0) goto L86
            r3 = 8
            goto L87
        L86:
            r3 = 0
        L87:
            r2 = r2 | r3
            long r2 = (long) r2
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r7
            r3 = r10
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r15
            r4 = r19
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r1 = r9
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r20 = r0
            r0 = r7
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isRecord(r0)
            if (r0 == 0) goto Lbb
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()
            r1 = 16
            if (r0 >= r1) goto Lbb
            r0 = r7
            r1 = r20
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectField(r0, r1)
            goto Lc2
        Lbb:
            r0 = r7
            r1 = r20
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
        Lc2:
            r0 = 1
            return r0
    }

    private static com.sun.tools.javac.tree.JCTree.JCExpression[] createFactoryParameters(lombok.javac.JavacNode r7, com.sun.tools.javac.tree.JCTree.JCFieldAccess r8, java.util.List<lombok.core.configuration.LogDeclaration.LogFactoryParameter> r9, com.sun.tools.javac.tree.JCTree.JCExpression r10) {
            r0 = r9
            int r0 = r0.size()
            com.sun.tools.javac.tree.JCTree$JCExpression[] r0 = new com.sun.tools.javac.tree.JCTree.JCExpression[r0]
            r11 = r0
            r0 = r7
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r12 = r0
            r0 = 0
            r13 = r0
            goto Lb6
        L17:
            r0 = r9
            r1 = r13
            java.lang.Object r0 = r0.get(r1)
            lombok.core.configuration.LogDeclaration$LogFactoryParameter r0 = (lombok.core.configuration.LogDeclaration.LogFactoryParameter) r0
            r14 = r0
            int[] r0 = m85xeb5c83f5()
            r1 = r14
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L4c;
                case 2: goto L55;
                case 3: goto L79;
                case 4: goto L88;
                default: goto L99;
            }
        L4c:
            r0 = r11
            r1 = r13
            r2 = r8
            r0[r1] = r2
            goto Lb3
        L55:
            r0 = r12
            r1 = r8
            r2 = r7
            java.lang.String r3 = "getName"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r15 = r0
            r0 = r11
            r1 = r13
            r2 = r12
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            r4 = r15
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r2 = r2.Apply(r3, r4, r5)
            r0[r1] = r2
            goto Lb3
        L79:
            r0 = r11
            r1 = r13
            r2 = r10
            java.lang.Object r2 = r2.clone()
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = (com.sun.tools.javac.tree.JCTree.JCExpression) r2
            r0[r1] = r2
            goto Lb3
        L88:
            r0 = r11
            r1 = r13
            r2 = r12
            lombok.javac.JavacTreeMaker$TypeTag r3 = lombok.javac.Javac.CTC_BOT
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r2 = r2.Literal(r3, r4)
            r0[r1] = r2
            goto Lb3
        L99:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Unknown logger factory parameter type: "
            r3.<init>(r4)
            r3 = r14
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lb3:
            int r13 = r13 + 1
        Lb6:
            r0 = r13
            r1 = r9
            int r1 = r1.size()
            if (r0 < r1) goto L17
            r0 = r11
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.javac.handlers.HandleLog.$SWITCH_TABLE$lombok$core$AST$Kind
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.core.AST$Kind[] r0 = lombok.core.AST.Kind.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION     // Catch: java.lang.NoSuchFieldError -> L1d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
            r2 = 6
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            goto L1e
        L1d:
        L1e:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ARGUMENT     // Catch: java.lang.NoSuchFieldError -> L2b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
            r2 = 7
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            goto L2c
        L2b:
        L2c:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT     // Catch: java.lang.NoSuchFieldError -> L38
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L38
            goto L39
        L38:
        L39:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD     // Catch: java.lang.NoSuchFieldError -> L45
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            goto L46
        L45:
        L46:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.INITIALIZER     // Catch: java.lang.NoSuchFieldError -> L52
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L52
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L52
            goto L53
        L52:
        L53:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.LOCAL     // Catch: java.lang.NoSuchFieldError -> L60
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
            r2 = 8
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            goto L61
        L60:
        L61:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD     // Catch: java.lang.NoSuchFieldError -> L6d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
            r2 = 5
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            goto L6e
        L6d:
        L6e:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.STATEMENT     // Catch: java.lang.NoSuchFieldError -> L7b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7b
            r2 = 9
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7b
            goto L7c
        L7b:
        L7c:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE     // Catch: java.lang.NoSuchFieldError -> L88
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L88
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L88
            goto L89
        L88:
        L89:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE_USE     // Catch: java.lang.NoSuchFieldError -> L96
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L96
            r2 = 10
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L96
            goto L97
        L96:
        L97:
            r0 = r4
            r1 = r0
            lombok.javac.handlers.HandleLog.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$core$configuration$LogDeclaration$LogFactoryParameter */
    static /* synthetic */ int[] m85xeb5c83f5() {
            int[] r0 = lombok.javac.handlers.HandleLog.f591xeb5c83f5
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.core.configuration.LogDeclaration$LogFactoryParameter[] r0 = lombok.core.configuration.LogDeclaration.LogFactoryParameter.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.core.configuration.LogDeclaration$LogFactoryParameter r1 = lombok.core.configuration.LogDeclaration.LogFactoryParameter.NAME     // Catch: java.lang.NoSuchFieldError -> L1c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
            goto L1d
        L1c:
        L1d:
            r0 = r4
            lombok.core.configuration.LogDeclaration$LogFactoryParameter r1 = lombok.core.configuration.LogDeclaration.LogFactoryParameter.NULL     // Catch: java.lang.NoSuchFieldError -> L29
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L29
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L29
            goto L2a
        L29:
        L2a:
            r0 = r4
            lombok.core.configuration.LogDeclaration$LogFactoryParameter r1 = lombok.core.configuration.LogDeclaration.LogFactoryParameter.TOPIC     // Catch: java.lang.NoSuchFieldError -> L36
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            goto L37
        L36:
        L37:
            r0 = r4
            lombok.core.configuration.LogDeclaration$LogFactoryParameter r1 = lombok.core.configuration.LogDeclaration.LogFactoryParameter.TYPE     // Catch: java.lang.NoSuchFieldError -> L43
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L43
            goto L44
        L43:
        L44:
            r0 = r4
            r1 = r0
            lombok.javac.handlers.HandleLog.f591xeb5c83f5 = r1
            return r0
    }
}
