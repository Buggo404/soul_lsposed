package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleLog.SCL.lombok */
public class HandleLog {
    private static final lombok.core.configuration.IdentifierName LOG = null;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;

    /* renamed from: $SWITCH_TABLE$lombok$core$configuration$LogDeclaration$LogFactoryParameter */
    private static /* synthetic */ int[] f577xeb5c83f5;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleLog$HandleCommonsLog.SCL.lombok */
    public static class HandleCommonsLog extends lombok.eclipse.EclipseAnnotationHandler<lombok.extern.apachecommons.CommonsLog> {
        public HandleCommonsLog() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.eclipse.EclipseAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.extern.apachecommons.CommonsLog> r7, org.eclipse.jdt.internal.compiler.ast.Annotation r8, lombok.eclipse.EclipseNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_COMMONS_FLAG_USAGE
                java.lang.String r2 = "@apachecommons.CommonsLog"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                lombok.core.handlers.LoggingFramework r0 = lombok.core.handlers.LoggingFramework.COMMONS
                r1 = r7
                r2 = r8
                r3 = r9
                lombok.eclipse.handlers.HandleLog.processAnnotation(r0, r1, r2, r3)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleLog$HandleCustomLog.SCL.lombok */
    public static class HandleCustomLog extends lombok.eclipse.EclipseAnnotationHandler<lombok.CustomLog> {
        public HandleCustomLog() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.eclipse.EclipseAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.CustomLog> r7, org.eclipse.jdt.internal.compiler.ast.Annotation r8, lombok.eclipse.EclipseNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_CUSTOM_FLAG_USAGE
                java.lang.String r2 = "@CustomLog"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                r0 = r9
                lombok.eclipse.EclipseAST r0 = r0.getAst()
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.LogDeclaration> r1 = lombok.ConfigurationKeys.LOG_CUSTOM_DECLARATION
                java.lang.Object r0 = r0.readConfiguration(r1)
                lombok.core.configuration.LogDeclaration r0 = (lombok.core.configuration.LogDeclaration) r0
                r10 = r0
                r0 = r10
                if (r0 != 0) goto L29
                r0 = r9
                java.lang.String r1 = "The @CustomLog annotation is not configured; please set lombok.log.custom.declaration in lombok.config."
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
                r2 = r8
                r3 = r9
                lombok.eclipse.handlers.HandleLog.processAnnotation(r0, r1, r2, r3)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleLog$HandleFloggerLog.SCL.lombok */
    public static class HandleFloggerLog extends lombok.eclipse.EclipseAnnotationHandler<lombok.extern.flogger.Flogger> {
        public HandleFloggerLog() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.eclipse.EclipseAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.extern.flogger.Flogger> r7, org.eclipse.jdt.internal.compiler.ast.Annotation r8, lombok.eclipse.EclipseNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_FLOGGER_FLAG_USAGE
                java.lang.String r2 = "@Flogger"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                lombok.core.handlers.LoggingFramework r0 = lombok.core.handlers.LoggingFramework.FLOGGER
                r1 = r7
                r2 = r8
                r3 = r9
                lombok.eclipse.handlers.HandleLog.processAnnotation(r0, r1, r2, r3)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleLog$HandleJBossLog.SCL.lombok */
    public static class HandleJBossLog extends lombok.eclipse.EclipseAnnotationHandler<lombok.extern.jbosslog.JBossLog> {
        public HandleJBossLog() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.eclipse.EclipseAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.extern.jbosslog.JBossLog> r7, org.eclipse.jdt.internal.compiler.ast.Annotation r8, lombok.eclipse.EclipseNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_JBOSSLOG_FLAG_USAGE
                java.lang.String r2 = "@JBossLog"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                lombok.core.handlers.LoggingFramework r0 = lombok.core.handlers.LoggingFramework.JBOSSLOG
                r1 = r7
                r2 = r8
                r3 = r9
                lombok.eclipse.handlers.HandleLog.processAnnotation(r0, r1, r2, r3)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleLog$HandleJulLog.SCL.lombok */
    public static class HandleJulLog extends lombok.eclipse.EclipseAnnotationHandler<lombok.extern.java.Log> {
        public HandleJulLog() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.eclipse.EclipseAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.extern.java.Log> r7, org.eclipse.jdt.internal.compiler.ast.Annotation r8, lombok.eclipse.EclipseNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_JUL_FLAG_USAGE
                java.lang.String r2 = "@java.Log"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                lombok.core.handlers.LoggingFramework r0 = lombok.core.handlers.LoggingFramework.JUL
                r1 = r7
                r2 = r8
                r3 = r9
                lombok.eclipse.handlers.HandleLog.processAnnotation(r0, r1, r2, r3)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleLog$HandleLog4j2Log.SCL.lombok */
    public static class HandleLog4j2Log extends lombok.eclipse.EclipseAnnotationHandler<lombok.extern.log4j.Log4j2> {
        public HandleLog4j2Log() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.eclipse.EclipseAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.extern.log4j.Log4j2> r7, org.eclipse.jdt.internal.compiler.ast.Annotation r8, lombok.eclipse.EclipseNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_LOG4J2_FLAG_USAGE
                java.lang.String r2 = "@Log4j2"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                lombok.core.handlers.LoggingFramework r0 = lombok.core.handlers.LoggingFramework.LOG4J2
                r1 = r7
                r2 = r8
                r3 = r9
                lombok.eclipse.handlers.HandleLog.processAnnotation(r0, r1, r2, r3)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleLog$HandleLog4jLog.SCL.lombok */
    public static class HandleLog4jLog extends lombok.eclipse.EclipseAnnotationHandler<lombok.extern.log4j.Log4j> {
        public HandleLog4jLog() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.eclipse.EclipseAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.extern.log4j.Log4j> r7, org.eclipse.jdt.internal.compiler.ast.Annotation r8, lombok.eclipse.EclipseNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_LOG4J_FLAG_USAGE
                java.lang.String r2 = "@Log4j"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                lombok.core.handlers.LoggingFramework r0 = lombok.core.handlers.LoggingFramework.LOG4J
                r1 = r7
                r2 = r8
                r3 = r9
                lombok.eclipse.handlers.HandleLog.processAnnotation(r0, r1, r2, r3)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleLog$HandleSlf4jLog.SCL.lombok */
    public static class HandleSlf4jLog extends lombok.eclipse.EclipseAnnotationHandler<lombok.extern.slf4j.Slf4j> {
        public HandleSlf4jLog() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.eclipse.EclipseAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.extern.slf4j.Slf4j> r7, org.eclipse.jdt.internal.compiler.ast.Annotation r8, lombok.eclipse.EclipseNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_SLF4J_FLAG_USAGE
                java.lang.String r2 = "@Slf4j"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                lombok.core.handlers.LoggingFramework r0 = lombok.core.handlers.LoggingFramework.SLF4J
                r1 = r7
                r2 = r8
                r3 = r9
                lombok.eclipse.handlers.HandleLog.processAnnotation(r0, r1, r2, r3)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleLog$HandleXSlf4jLog.SCL.lombok */
    public static class HandleXSlf4jLog extends lombok.eclipse.EclipseAnnotationHandler<lombok.extern.slf4j.XSlf4j> {
        public HandleXSlf4jLog() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.eclipse.EclipseAnnotationHandler
        public void handle(lombok.core.AnnotationValues<lombok.extern.slf4j.XSlf4j> r7, org.eclipse.jdt.internal.compiler.ast.Annotation r8, lombok.eclipse.EclipseNode r9) {
                r6 = this;
                r0 = r9
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.LOG_XSLF4J_FLAG_USAGE
                java.lang.String r2 = "@XSlf4j"
                lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r3 = lombok.ConfigurationKeys.LOG_ANY_FLAG_USAGE
                java.lang.String r4 = "any @Log"
                lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2, r3, r4)
                lombok.core.handlers.LoggingFramework r0 = lombok.core.handlers.LoggingFramework.XSLF4J
                r1 = r7
                r2 = r8
                r3 = r9
                lombok.eclipse.handlers.HandleLog.processAnnotation(r0, r1, r2, r3)
                return
        }
    }

    static {
            java.lang.String r0 = "log"
            lombok.core.configuration.IdentifierName r0 = lombok.core.configuration.IdentifierName.valueOf(r0)
            lombok.eclipse.handlers.HandleLog.LOG = r0
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

    public static void processAnnotation(lombok.core.handlers.LoggingFramework r7, lombok.core.AnnotationValues<? extends java.lang.annotation.Annotation> r8, org.eclipse.jdt.internal.compiler.ast.Annotation r9, lombok.eclipse.EclipseNode r10) {
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r11 = r0
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r11
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L28;
                default: goto L1eb;
            }
        L28:
            r0 = r10
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.IdentifierName> r1 = lombok.ConfigurationKeys.LOG_ANY_FIELD_NAME
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.IdentifierName r0 = (lombok.core.configuration.IdentifierName) r0
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L41
            lombok.core.configuration.IdentifierName r0 = lombok.eclipse.handlers.HandleLog.LOG
            r12 = r0
        L41:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = r10
            lombok.eclipse.EclipseAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.LOG_ANY_FIELD_IS_STATIC
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L58
            r0 = 0
            goto L59
        L58:
            r0 = 1
        L59:
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r11
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L73
            r0 = r11
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r14 = r0
        L73:
            r0 = r14
            if (r0 != 0) goto L7c
            r0 = 0
            goto L81
        L7c:
            r0 = r14
            int r0 = r0.modifiers
        L81:
            r15 = r0
            r0 = r15
            r1 = 8704(0x2200, float:1.2197E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L90
            r0 = 1
            goto L91
        L90:
            r0 = 0
        L91:
            r16 = r0
            r0 = r14
            if (r0 == 0) goto L9d
            r0 = r16
            if (r0 == 0) goto Lb8
        L9d:
            r0 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r7
            java.lang.String r3 = r3.getAnnotationAsString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = " is legal only on classes and enums."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        Lb8:
            r0 = r12
            java.lang.String r0 = r0.getName()
            r1 = r11
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.fieldExists(r0, r1)
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto Le3
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
        Le3:
            r0 = r11
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isRecord(r0)
            if (r0 == 0) goto Lf7
            r0 = r13
            if (r0 != 0) goto Lf7
            r0 = r10
            java.lang.String r1 = "Logger fields must be static in records."
            r0.addError(r1)
            return
        Lf7:
            r0 = r13
            if (r0 == 0) goto L11f
            r0 = r11
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isStaticAllowed(r0)
            if (r0 != 0) goto L11f
            r0 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r7
            java.lang.String r3 = r3.getAnnotationAsString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = " is not supported on non-static nested classes."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        L11f:
            r0 = r8
            java.lang.String r1 = "topic"
            java.lang.Object r0 = r0.getValueGuess(r1)
            r17 = r0
            r0 = r8
            java.lang.String r1 = "topic"
            java.lang.Object r0 = r0.getActualExpression(r1)
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = (org.eclipse.jdt.internal.compiler.ast.Expression) r0
            r18 = r0
            r0 = r17
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L14b
            r0 = r17
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14b
            r0 = 0
            r18 = r0
        L14b:
            r0 = r7
            lombok.core.configuration.LogDeclaration r0 = r0.getDeclaration()
            java.util.List r0 = r0.getParametersWithTopic()
            if (r0 != 0) goto L177
            r0 = r18
            if (r0 == 0) goto L177
            r0 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r7
            java.lang.String r3 = r3.getAnnotationAsString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = " does not allow a topic."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            r0 = 0
            r18 = r0
        L177:
            r0 = r7
            lombok.core.configuration.LogDeclaration r0 = r0.getDeclaration()
            java.util.List r0 = r0.getParametersWithoutTopic()
            if (r0 != 0) goto L1af
            r0 = r18
            if (r0 != 0) goto L1af
            r0 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r7
            java.lang.String r3 = r3.getAnnotationAsString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = " requires a topic."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r1 = r0
            r2 = 0
            char[] r2 = new char[r2]
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r18 = r0
        L1af:
            r0 = r11
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r0 = selfType(r0, r1)
            r19 = r0
            r0 = r7
            r1 = r9
            r2 = r19
            r3 = r12
            java.lang.String r3 = r3.getName()
            r4 = r13
            r5 = r18
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = createField(r0, r1, r2, r3, r4, r5)
            r20 = r0
            r0 = r20
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r9
            r2.<init>(r3)
            r2 = r14
            org.eclipse.jdt.internal.compiler.lookup.MethodScope r2 = r2.staticInitializerScope
            r0.traverse(r1, r2)
            r0 = r11
            r1 = r20
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectField(r0, r1)
            r0 = r11
            r0.rebuild()
            goto L1eb
        L1eb:
            return
    }

    public static org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess selfType(lombok.eclipse.EclipseNode r6, org.eclipse.jdt.internal.compiler.ast.Annotation r7) {
            r0 = r7
            int r0 = r0.sourceStart
            r8 = r0
            r0 = r7
            int r0 = r0.sourceEnd
            r9 = r0
            r0 = r8
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r9
            long r1 = (long) r1
            long r0 = r0 | r1
            r10 = r0
            r0 = r6
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r12 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r1 = r0
            r2 = r12
            char[] r2 = r2.name
            r3 = r10
            r1.<init>(r2, r3)
            r13 = r0
            r0 = r13
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r0 = new org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess
            r1 = r0
            r2 = r7
            int r2 = r2.sourceEnd
            r3 = r13
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r14
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r14
            return r0
    }

    private static org.eclipse.jdt.internal.compiler.ast.FieldDeclaration createField(lombok.core.handlers.LoggingFramework r6, org.eclipse.jdt.internal.compiler.ast.Annotation r7, org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r8, java.lang.String r9, boolean r10, org.eclipse.jdt.internal.compiler.ast.Expression r11) {
            r0 = r7
            int r0 = r0.sourceStart
            r12 = r0
            r0 = r7
            int r0 = r0.sourceEnd
            r13 = r0
            r0 = r12
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r13
            long r1 = (long) r1
            long r0 = r0 | r1
            r14 = r0
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            r1 = r0
            r2 = r9
            char[] r2 = r2.toCharArray()
            r3 = 0
            r4 = -1
            r1.<init>(r2, r3, r4)
            r16 = r0
            r0 = r16
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r16
            r1 = -1
            r0.declarationSourceEnd = r1
            r0 = r16
            r1 = 2
            r2 = r10
            if (r2 == 0) goto L41
            r2 = 8
            goto L42
        L41:
            r2 = 0
        L42:
            r1 = r1 | r2
            r2 = 16
            r1 = r1 | r2
            r0.modifiers = r1
            r0 = r6
            lombok.core.configuration.LogDeclaration r0 = r0.getDeclaration()
            r17 = r0
            r0 = r16
            r1 = r17
            lombok.core.configuration.TypeName r1 = r1.getLoggerType()
            java.lang.String r1 = r1.getName()
            r2 = r7
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.createTypeReference(r1, r2)
            r0.type = r1
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r18
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r18
            r1 = r17
            lombok.core.configuration.TypeName r1 = r1.getLoggerFactoryType()
            java.lang.String r1 = r1.getName()
            r2 = r7
            org.eclipse.jdt.internal.compiler.ast.NameReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.createNameReference(r1, r2)
            r0.receiver = r1
            r0 = r18
            r1 = r17
            lombok.core.configuration.IdentifierName r1 = r1.getLoggerFactoryMethod()
            char[] r1 = r1.getCharArray()
            r0.selector = r1
            r0 = r11
            if (r0 == 0) goto L9b
            r0 = r17
            java.util.List r0 = r0.getParametersWithTopic()
            goto La0
        L9b:
            r0 = r17
            java.util.List r0 = r0.getParametersWithoutTopic()
        La0:
            r19 = r0
            r0 = r18
            r1 = r8
            r2 = r7
            r3 = r19
            r4 = r11
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = createFactoryParameters(r1, r2, r3, r4)
            r0.arguments = r1
            r0 = r18
            r1 = r14
            r0.nameSourcePosition = r1
            r0 = r18
            r1 = r12
            r0.sourceStart = r1
            r0 = r18
            r1 = r18
            r2 = r13
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            r0 = r16
            r1 = r18
            r0.initialization = r1
            r0 = r16
            return r0
    }

    private static final org.eclipse.jdt.internal.compiler.ast.Expression[] createFactoryParameters(org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r7, org.eclipse.jdt.internal.compiler.ast.Annotation r8, java.util.List<lombok.core.configuration.LogDeclaration.LogFactoryParameter> r9, org.eclipse.jdt.internal.compiler.ast.Expression r10) {
            r0 = r9
            int r0 = r0.size()
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = new org.eclipse.jdt.internal.compiler.ast.Expression[r0]
            r11 = r0
            r0 = r8
            int r0 = r0.sourceStart
            r12 = r0
            r0 = r8
            int r0 = r0.sourceEnd
            r13 = r0
            r0 = 0
            r14 = r0
            goto Lef
        L1d:
            r0 = r9
            r1 = r14
            java.lang.Object r0 = r0.get(r1)
            lombok.core.configuration.LogDeclaration$LogFactoryParameter r0 = (lombok.core.configuration.LogDeclaration.LogFactoryParameter) r0
            r15 = r0
            int[] r0 = m73xeb5c83f5()
            r1 = r15
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L50;
                case 2: goto L5d;
                case 3: goto Lb3;
                case 4: goto Lbf;
                default: goto Ld2;
            }
        L50:
            r0 = r11
            r1 = r14
            r2 = r7
            r3 = r8
            org.eclipse.jdt.internal.compiler.ast.Expression r2 = createFactoryTypeParameter(r2, r3)
            r0[r1] = r2
            goto Lec
        L5d:
            r0 = r12
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r13
            long r1 = (long) r1
            long r0 = r0 | r1
            r16 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r18
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r18
            r1 = r7
            r2 = r8
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = createFactoryTypeParameter(r1, r2)
            r0.receiver = r1
            r0 = r18
            java.lang.String r1 = "getName"
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r18
            r1 = r16
            r0.nameSourcePosition = r1
            r0 = r18
            r1 = r12
            r0.sourceStart = r1
            r0 = r18
            r1 = r18
            r2 = r13
            r3 = r2; r2 = r1; r1 = r3; 
            r2.statementEnd = r3
            r0.sourceEnd = r1
            r0 = r11
            r1 = r14
            r2 = r18
            r0[r1] = r2
            goto Lec
        Lb3:
            r0 = r11
            r1 = r14
            r2 = r10
            org.eclipse.jdt.internal.compiler.ast.Expression r2 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotationMemberValue(r2)
            r0[r1] = r2
            goto Lec
        Lbf:
            r0 = r11
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r2 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r3 = r2
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5)
            r0[r1] = r2
            goto Lec
        Ld2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Unknown logger factory parameter type: "
            r3.<init>(r4)
            r3 = r15
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lec:
            int r14 = r14 + 1
        Lef:
            r0 = r14
            r1 = r9
            int r1 = r1.size()
            if (r0 < r1) goto L1d
            r0 = r11
            return r0
    }

    private static final org.eclipse.jdt.internal.compiler.ast.Expression createFactoryTypeParameter(org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r5, org.eclipse.jdt.internal.compiler.ast.Annotation r6) {
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r6
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r0, r1)
            r7 = r0
            org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r0 = new org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess
            r1 = r0
            r2 = r6
            int r2 = r2.sourceEnd
            r3 = r7
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r8
            r1 = r6
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r8
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.eclipse.handlers.HandleLog.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.eclipse.handlers.HandleLog.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$core$configuration$LogDeclaration$LogFactoryParameter */
    static /* synthetic */ int[] m73xeb5c83f5() {
            int[] r0 = lombok.eclipse.handlers.HandleLog.f577xeb5c83f5
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
            lombok.eclipse.handlers.HandleLog.f577xeb5c83f5 = r1
            return r0
    }
}
