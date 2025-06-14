package lombok.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/HandlerLibrary.SCL.lombok */
public class HandlerLibrary {
    private lombok.core.TypeLibrary typeLibrary;
    private java.util.Map<java.lang.String, lombok.eclipse.HandlerLibrary.AnnotationHandlerContainer<?>> annotationHandlers;
    private java.util.Collection<lombok.eclipse.HandlerLibrary.VisitorContainer> visitorHandlers;
    private java.util.SortedSet<java.lang.Long> priorities;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/HandlerLibrary$AnnotationHandlerContainer.SCL.lombok */
    private static class AnnotationHandlerContainer<T extends java.lang.annotation.Annotation> {
        private final lombok.eclipse.EclipseAnnotationHandler<T> handler;
        private final java.lang.Class<T> annotationClass;
        private final long priority;
        private final boolean deferUntilPostDiet;

        AnnotationHandlerContainer(lombok.eclipse.EclipseAnnotationHandler<T> r7, java.lang.Class<T> r8) {
                r6 = this;
                r0 = r6
                r0.<init>()
                r0 = r6
                r1 = r7
                r0.handler = r1
                r0 = r6
                r1 = r8
                r0.annotationClass = r1
                r0 = r6
                r1 = r7
                java.lang.Class r1 = r1.getClass()
                java.lang.Class<lombok.eclipse.DeferUntilPostDiet> r2 = lombok.eclipse.DeferUntilPostDiet.class
                boolean r1 = r1.isAnnotationPresent(r2)
                r0.deferUntilPostDiet = r1
                r0 = r7
                java.lang.Class r0 = r0.getClass()
                java.lang.Class<lombok.core.HandlerPriority> r1 = lombok.core.HandlerPriority.class
                java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
                lombok.core.HandlerPriority r0 = (lombok.core.HandlerPriority) r0
                r9 = r0
                r0 = r6
                r1 = r9
                if (r1 != 0) goto L31
                r1 = 0
                goto L43
            L31:
                r1 = r9
                int r1 = r1.value()
                long r1 = (long) r1
                r2 = 32
                long r1 = r1 << r2
                r2 = r9
                int r2 = r2.subValue()
                long r2 = (long) r2
                long r1 = r1 + r2
            L43:
                r0.priority = r1
                return
        }

        public void handle(org.eclipse.jdt.internal.compiler.ast.Annotation r6, lombok.eclipse.EclipseNode r7) {
                r5 = this;
                r0 = r5
                java.lang.Class<T extends java.lang.annotation.Annotation> r0 = r0.annotationClass
                r1 = r7
                lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createAnnotation(r0, r1)
                r8 = r0
                r0 = r5
                lombok.eclipse.EclipseAnnotationHandler<T extends java.lang.annotation.Annotation> r0 = r0.handler
                r1 = r8
                r2 = r6
                r3 = r7
                r0.handle(r1, r2, r3)
                return
        }

        public void preHandle(org.eclipse.jdt.internal.compiler.ast.Annotation r6, lombok.eclipse.EclipseNode r7) {
                r5 = this;
                r0 = r5
                java.lang.Class<T extends java.lang.annotation.Annotation> r0 = r0.annotationClass
                r1 = r7
                lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createAnnotation(r0, r1)
                r8 = r0
                r0 = r5
                lombok.eclipse.EclipseAnnotationHandler<T extends java.lang.annotation.Annotation> r0 = r0.handler
                r1 = r8
                r2 = r6
                r3 = r7
                r0.preHandle(r1, r2, r3)
                return
        }

        public boolean deferUntilPostDiet() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.deferUntilPostDiet
                return r0
        }

        public long getPriority() {
                r3 = this;
                r0 = r3
                long r0 = r0.priority
                return r0
        }

        static /* synthetic */ java.lang.Class access$0(lombok.eclipse.HandlerLibrary.AnnotationHandlerContainer r2) {
                r0 = r2
                java.lang.Class<T extends java.lang.annotation.Annotation> r0 = r0.annotationClass
                return r0
        }

        static /* synthetic */ lombok.eclipse.EclipseAnnotationHandler access$1(lombok.eclipse.HandlerLibrary.AnnotationHandlerContainer r2) {
                r0 = r2
                lombok.eclipse.EclipseAnnotationHandler<T extends java.lang.annotation.Annotation> r0 = r0.handler
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/HandlerLibrary$VisitorContainer.SCL.lombok */
    private static class VisitorContainer {
        private final lombok.eclipse.EclipseASTVisitor visitor;
        private final long priority;
        private final boolean deferUntilPostDiet;

        VisitorContainer(lombok.eclipse.EclipseASTVisitor r7) {
                r6 = this;
                r0 = r6
                r0.<init>()
                r0 = r6
                r1 = r7
                r0.visitor = r1
                r0 = r6
                r1 = r7
                java.lang.Class r1 = r1.getClass()
                java.lang.Class<lombok.eclipse.DeferUntilPostDiet> r2 = lombok.eclipse.DeferUntilPostDiet.class
                boolean r1 = r1.isAnnotationPresent(r2)
                r0.deferUntilPostDiet = r1
                r0 = r7
                java.lang.Class r0 = r0.getClass()
                java.lang.Class<lombok.core.HandlerPriority> r1 = lombok.core.HandlerPriority.class
                java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
                lombok.core.HandlerPriority r0 = (lombok.core.HandlerPriority) r0
                r8 = r0
                r0 = r6
                r1 = r8
                if (r1 != 0) goto L2c
                r1 = 0
                goto L3e
            L2c:
                r1 = r8
                int r1 = r1.value()
                long r1 = (long) r1
                r2 = 32
                long r1 = r1 << r2
                r2 = r8
                int r2 = r2.subValue()
                long r2 = (long) r2
                long r1 = r1 + r2
            L3e:
                r0.priority = r1
                return
        }

        public boolean deferUntilPostDiet() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.deferUntilPostDiet
                return r0
        }

        public long getPriority() {
                r3 = this;
                r0 = r3
                long r0 = r0.priority
                return r0
        }

        static /* synthetic */ lombok.eclipse.EclipseASTVisitor access$0(lombok.eclipse.HandlerLibrary.VisitorContainer r2) {
                r0 = r2
                lombok.eclipse.EclipseASTVisitor r0 = r0.visitor
                return r0
        }
    }

    public HandlerLibrary() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            lombok.core.TypeLibrary r1 = new lombok.core.TypeLibrary
            r2 = r1
            r2.<init>()
            r0.typeLibrary = r1
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.annotationHandlers = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.visitorHandlers = r1
            lombok.core.configuration.ConfigurationKeysLoader.LoaderLoader.loadAllConfigurationKeys()
            return
    }

    public static lombok.eclipse.HandlerLibrary load() {
            lombok.eclipse.HandlerLibrary r0 = new lombok.eclipse.HandlerLibrary
            r1 = r0
            r1.<init>()
            r3 = r0
            r0 = r3
            loadAnnotationHandlers(r0)
            r0 = r3
            loadVisitorHandlers(r0)
            r0 = r3
            r0.calculatePriorities()
            r0 = r3
            return r0
    }

    public java.util.SortedSet<java.lang.Long> getPriorities() {
            r2 = this;
            r0 = r2
            java.util.SortedSet<java.lang.Long> r0 = r0.priorities
            return r0
    }

    private void calculatePriorities() {
            r4 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            java.util.Map<java.lang.String, lombok.eclipse.HandlerLibrary$AnnotationHandlerContainer<?>> r0 = r0.annotationHandlers
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L32
        L1a:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.eclipse.HandlerLibrary$AnnotationHandlerContainer r0 = (lombok.eclipse.HandlerLibrary.AnnotationHandlerContainer) r0
            r6 = r0
            r0 = r5
            r1 = r6
            long r1 = r1.getPriority()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.add(r1)
        L32:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1a
            r0 = r4
            java.util.Collection<lombok.eclipse.HandlerLibrary$VisitorContainer> r0 = r0.visitorHandlers
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L60
        L48:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.eclipse.HandlerLibrary$VisitorContainer r0 = (lombok.eclipse.HandlerLibrary.VisitorContainer) r0
            r6 = r0
            r0 = r5
            r1 = r6
            long r1 = r1.getPriority()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.add(r1)
        L60:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L48
            r0 = r4
            r1 = r5
            java.util.SortedSet r1 = java.util.Collections.unmodifiableSortedSet(r1)
            r0.priorities = r1
            return
    }

    private static void loadAnnotationHandlers(lombok.eclipse.HandlerLibrary r5) {
            java.lang.Class<lombok.eclipse.EclipseAnnotationHandler> r0 = lombok.eclipse.EclipseAnnotationHandler.class
            java.lang.Class<lombok.eclipse.EclipseAnnotationHandler> r1 = lombok.eclipse.EclipseAnnotationHandler.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.io.IOException -> L8a
            java.lang.Iterable r0 = lombok.core.SpiLoadUtil.findServices(r0, r1)     // Catch: java.io.IOException -> L8a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L8a
            r7 = r0
            goto L7e
        L13:
            r0 = r7
            java.lang.Object r0 = r0.next()     // Catch: java.io.IOException -> L8a
            lombok.eclipse.EclipseAnnotationHandler r0 = (lombok.eclipse.EclipseAnnotationHandler) r0     // Catch: java.io.IOException -> L8a
            r6 = r0
            r0 = r6
            java.lang.Class r0 = r0.getAnnotationHandledByThisHandler()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
            r8 = r0
            lombok.eclipse.HandlerLibrary$AnnotationHandlerContainer r0 = new lombok.eclipse.HandlerLibrary$AnnotationHandlerContainer     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
            r9 = r0
            r0 = r9
            java.lang.Class r0 = lombok.eclipse.HandlerLibrary.AnnotationHandlerContainer.access$0(r0)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
            java.lang.String r1 = "$"
            java.lang.String r2 = "."
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
            r10 = r0
            r0 = r5
            java.util.Map<java.lang.String, lombok.eclipse.HandlerLibrary$AnnotationHandlerContainer<?>> r0 = r0.annotationHandlers     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
            r1 = r10
            r2 = r9
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
            if (r0 == 0) goto L64
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
            r2 = r1
            java.lang.String r3 = "Duplicate handlers for annotation type: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
            r2 = 0
            lombok.eclipse.handlers.EclipseHandlerUtil.error(r0, r1, r2)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
        L64:
            r0 = r5
            lombok.core.TypeLibrary r0 = r0.typeLibrary     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
            r1 = r9
            java.lang.Class r1 = lombok.eclipse.HandlerLibrary.AnnotationHandlerContainer.access$0(r1)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
            r0.addType(r1)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L8a
            goto L7e
        L76:
            r8 = move-exception
            r0 = 0
            java.lang.String r1 = "Can't load Lombok annotation handler for Eclipse: "
            r2 = r8
            lombok.eclipse.handlers.EclipseHandlerUtil.error(r0, r1, r2)     // Catch: java.io.IOException -> L8a
        L7e:
            r0 = r7
            boolean r0 = r0.hasNext()     // Catch: java.io.IOException -> L8a
            if (r0 != 0) goto L13
            goto L90
        L8a:
            r6 = move-exception
            r0 = r6
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L90:
            return
    }

    private static void loadVisitorHandlers(lombok.eclipse.HandlerLibrary r5) {
            java.lang.Class<lombok.eclipse.EclipseASTVisitor> r0 = lombok.eclipse.EclipseASTVisitor.class
            java.lang.Class<lombok.eclipse.EclipseASTVisitor> r1 = lombok.eclipse.EclipseASTVisitor.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L3b
            java.lang.Iterable r0 = lombok.core.SpiLoadUtil.findServices(r0, r1)     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3b
            r7 = r0
            goto L2f
        L13:
            r0 = r7
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L3b
            lombok.eclipse.EclipseASTVisitor r0 = (lombok.eclipse.EclipseASTVisitor) r0     // Catch: java.lang.Throwable -> L3b
            r6 = r0
            r0 = r5
            java.util.Collection<lombok.eclipse.HandlerLibrary$VisitorContainer> r0 = r0.visitorHandlers     // Catch: java.lang.Throwable -> L3b
            lombok.eclipse.HandlerLibrary$VisitorContainer r1 = new lombok.eclipse.HandlerLibrary$VisitorContainer     // Catch: java.lang.Throwable -> L3b
            r2 = r1
            r3 = r6
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L3b
        L2f:
            r0 = r7
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L13
            goto L41
        L3b:
            r6 = move-exception
            r0 = r6
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L41:
            return
    }

    private boolean checkAndSetHandled(org.eclipse.jdt.internal.compiler.ast.ASTNode r5) {
            r4 = this;
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.ASTNode, java.lang.Boolean> r0 = lombok.eclipse.EcjAugments.ASTNode_handled
            r1 = r5
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.getAndSet(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L18
            r0 = 0
            goto L19
        L18:
            r0 = 1
        L19:
            return r0
    }

    private boolean needsHandling(org.eclipse.jdt.internal.compiler.ast.ASTNode r4) {
            r3 = this;
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.ASTNode, java.lang.Boolean> r0 = lombok.eclipse.EcjAugments.ASTNode_handled
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L14
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            return r0
    }

    public long handleAnnotation(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r8, lombok.eclipse.EclipseNode r9, org.eclipse.jdt.internal.compiler.ast.Annotation r10, long r11) {
            r7 = this;
            lombok.core.TypeResolver r0 = new lombok.core.TypeResolver
            r1 = r0
            r2 = r9
            lombok.core.ImportList r2 = r2.getImportList()
            r1.<init>(r2)
            r13 = r0
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r14 = r0
            r0 = r14
            if (r0 != 0) goto L1c
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        L1c:
            r0 = r13
            r1 = r9
            r2 = r7
            lombok.core.TypeLibrary r2 = r2.typeLibrary
            r3 = r10
            org.eclipse.jdt.internal.compiler.ast.TypeReference r3 = r3.type
            char[][] r3 = r3.getTypeName()
            java.lang.String r3 = lombok.eclipse.Eclipse.toQualifiedName(r3)
            java.lang.String r0 = r0.typeRefToFullyQualifiedName(r1, r2, r3)
            r15 = r0
            r0 = r15
            if (r0 != 0) goto L3b
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        L3b:
            r0 = r7
            java.util.Map<java.lang.String, lombok.eclipse.HandlerLibrary$AnnotationHandlerContainer<?>> r0 = r0.annotationHandlers
            r1 = r15
            java.lang.Object r0 = r0.get(r1)
            lombok.eclipse.HandlerLibrary$AnnotationHandlerContainer r0 = (lombok.eclipse.HandlerLibrary.AnnotationHandlerContainer) r0
            r16 = r0
            r0 = r16
            if (r0 != 0) goto L54
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        L54:
            r0 = r11
            r1 = r16
            long r1 = r1.getPriority()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L65
            r0 = r16
            long r0 = r0.getPriority()
            return r0
        L65:
            r0 = r11
            r1 = r16
            long r1 = r1.getPriority()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L74
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        L74:
            r0 = r9
            boolean r0 = r0.isCompleteParse()
            if (r0 != 0) goto L96
            r0 = r16
            boolean r0 = r0.deferUntilPostDiet()
            if (r0 == 0) goto L96
            r0 = r7
            r1 = r10
            boolean r0 = r0.needsHandling(r1)
            if (r0 == 0) goto L92
            r0 = r16
            r1 = r10
            r2 = r9
            r0.preHandle(r1, r2)
        L92:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        L96:
            r0 = r7
            r1 = r10
            boolean r0 = r0.checkAndSetHandled(r1)     // Catch: lombok.core.AnnotationValues.AnnotationValueDecodeFail -> La8 java.lang.Throwable -> Lbf
            if (r0 == 0) goto Ldc
            r0 = r16
            r1 = r10
            r2 = r9
            r0.handle(r1, r2)     // Catch: lombok.core.AnnotationValues.AnnotationValueDecodeFail -> La8 java.lang.Throwable -> Lbf
            goto Ldc
        La8:
            r17 = move-exception
            r0 = r17
            lombok.core.AnnotationValues$AnnotationValue r0 = r0.owner
            r1 = r17
            java.lang.String r1 = r1.getMessage()
            r2 = r17
            int r2 = r2.idx
            r0.setError(r1, r2)
            goto Ldc
        Lbf:
            r17 = move-exception
            r0 = r8
            java.lang.String r1 = "Lombok annotation handler %s failed"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r16
            lombok.eclipse.EclipseAnnotationHandler r5 = lombok.eclipse.HandlerLibrary.AnnotationHandlerContainer.access$1(r5)
            java.lang.Class r5 = r5.getClass()
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r2 = r17
            lombok.eclipse.handlers.EclipseHandlerUtil.error(r0, r1, r2)
        Ldc:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
    }

    public long callASTVisitors(lombok.eclipse.EclipseAST r8, long r9, boolean r11) {
            r7 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r0
            r0 = r7
            java.util.Collection<lombok.eclipse.HandlerLibrary$VisitorContainer> r0 = r0.visitorHandlers
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto L87
        L13:
            r0 = r15
            java.lang.Object r0 = r0.next()
            lombok.eclipse.HandlerLibrary$VisitorContainer r0 = (lombok.eclipse.HandlerLibrary.VisitorContainer) r0
            r14 = r0
            r0 = r9
            r1 = r14
            long r1 = r1.getPriority()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L35
            r0 = r14
            long r0 = r0.getPriority()
            r1 = r12
            long r0 = java.lang.Math.min(r0, r1)
            r12 = r0
        L35:
            r0 = r11
            if (r0 != 0) goto L45
            r0 = r14
            boolean r0 = r0.deferUntilPostDiet()
            if (r0 == 0) goto L45
            goto L87
        L45:
            r0 = r9
            r1 = r14
            long r1 = r1.getPriority()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L52
            goto L87
        L52:
            r0 = r8
            r1 = r14
            lombok.eclipse.EclipseASTVisitor r1 = lombok.eclipse.HandlerLibrary.VisitorContainer.access$0(r1)     // Catch: java.lang.Throwable -> L5e
            r0.traverse(r1)     // Catch: java.lang.Throwable -> L5e
            goto L87
        L5e:
            r16 = move-exception
            r0 = r8
            lombok.core.LombokNode r0 = r0.top()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r0
            java.lang.String r1 = "Lombok visitor handler %s failed"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r14
            lombok.eclipse.EclipseASTVisitor r5 = lombok.eclipse.HandlerLibrary.VisitorContainer.access$0(r5)
            java.lang.Class r5 = r5.getClass()
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r2 = r16
            lombok.eclipse.handlers.EclipseHandlerUtil.error(r0, r1, r2)
        L87:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L13
            r0 = r12
            return r0
    }
}
