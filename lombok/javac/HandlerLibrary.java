package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/HandlerLibrary.SCL.lombok */
public class HandlerLibrary {
    private final lombok.core.TypeLibrary typeLibrary;
    private final java.util.Map<java.lang.String, java.util.List<lombok.javac.HandlerLibrary.AnnotationHandlerContainer<?>>> annotationHandlers;
    private final java.util.Collection<lombok.javac.HandlerLibrary.VisitorContainer> visitorHandlers;
    private final javax.annotation.processing.Messager messager;
    private java.util.SortedSet<java.lang.Long> priorities;
    private java.util.SortedSet<java.lang.Long> prioritiesRequiringResolutionReset;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/HandlerLibrary$AnnotationHandlerContainer.SCL.lombok */
    private static class AnnotationHandlerContainer<T extends java.lang.annotation.Annotation> {
        private final lombok.javac.JavacAnnotationHandler<T> handler;
        private final java.lang.Class<T> annotationClass;
        private final long priority;
        private final boolean resolutionResetNeeded;
        private final boolean evenIfAlreadyHandled;

        AnnotationHandlerContainer(lombok.javac.JavacAnnotationHandler<T> r7, java.lang.Class<T> r8) {
                r6 = this;
                r0 = r6
                r0.<init>()
                r0 = r6
                r1 = r7
                r0.handler = r1
                r0 = r6
                r1 = r8
                r0.annotationClass = r1
                r0 = r7
                java.lang.Class r0 = r0.getClass()
                java.lang.Class<lombok.core.HandlerPriority> r1 = lombok.core.HandlerPriority.class
                java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
                lombok.core.HandlerPriority r0 = (lombok.core.HandlerPriority) r0
                r9 = r0
                r0 = r6
                r1 = r9
                if (r1 != 0) goto L24
                r1 = 0
                goto L36
            L24:
                r1 = r9
                int r1 = r1.value()
                long r1 = (long) r1
                r2 = 32
                long r1 = r1 << r2
                r2 = r9
                int r2 = r2.subValue()
                long r2 = (long) r2
                long r1 = r1 + r2
            L36:
                r0.priority = r1
                r0 = r6
                r1 = r7
                java.lang.Class r1 = r1.getClass()
                java.lang.Class<lombok.javac.ResolutionResetNeeded> r2 = lombok.javac.ResolutionResetNeeded.class
                boolean r1 = r1.isAnnotationPresent(r2)
                r0.resolutionResetNeeded = r1
                r0 = r6
                r1 = r7
                java.lang.Class r1 = r1.getClass()
                java.lang.Class<lombok.core.AlreadyHandledAnnotations> r2 = lombok.core.AlreadyHandledAnnotations.class
                boolean r1 = r1.isAnnotationPresent(r2)
                r0.evenIfAlreadyHandled = r1
                return
        }

        public void handle(lombok.javac.JavacNode r6) {
                r5 = this;
                r0 = r5
                lombok.javac.JavacAnnotationHandler<T extends java.lang.annotation.Annotation> r0 = r0.handler
                r1 = r5
                java.lang.Class<T extends java.lang.annotation.Annotation> r1 = r1.annotationClass
                r2 = r6
                lombok.core.AnnotationValues r1 = lombok.javac.handlers.JavacHandlerUtil.createAnnotation(r1, r2)
                r2 = r6
                java.lang.Object r2 = r2.get()
                com.sun.tools.javac.tree.JCTree$JCAnnotation r2 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r2
                r3 = r6
                r0.handle(r1, r2, r3)
                return
        }

        public long getPriority() {
                r3 = this;
                r0 = r3
                long r0 = r0.priority
                return r0
        }

        public boolean isResolutionResetNeeded() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.resolutionResetNeeded
                return r0
        }

        public boolean isEvenIfAlreadyHandled() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.evenIfAlreadyHandled
                return r0
        }

        static /* synthetic */ java.lang.Class access$0(lombok.javac.HandlerLibrary.AnnotationHandlerContainer r2) {
                r0 = r2
                java.lang.Class<T extends java.lang.annotation.Annotation> r0 = r0.annotationClass
                return r0
        }

        static /* synthetic */ lombok.javac.JavacAnnotationHandler access$1(lombok.javac.HandlerLibrary.AnnotationHandlerContainer r2) {
                r0 = r2
                lombok.javac.JavacAnnotationHandler<T extends java.lang.annotation.Annotation> r0 = r0.handler
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/HandlerLibrary$VisitorContainer.SCL.lombok */
    private static class VisitorContainer {
        private final lombok.javac.JavacASTVisitor visitor;
        private final long priority;
        private final boolean resolutionResetNeeded;

        VisitorContainer(lombok.javac.JavacASTVisitor r7) {
                r6 = this;
                r0 = r6
                r0.<init>()
                r0 = r6
                r1 = r7
                r0.visitor = r1
                r0 = r7
                java.lang.Class r0 = r0.getClass()
                java.lang.Class<lombok.core.HandlerPriority> r1 = lombok.core.HandlerPriority.class
                java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
                lombok.core.HandlerPriority r0 = (lombok.core.HandlerPriority) r0
                r8 = r0
                r0 = r6
                r1 = r8
                if (r1 != 0) goto L1f
                r1 = 0
                goto L31
            L1f:
                r1 = r8
                int r1 = r1.value()
                long r1 = (long) r1
                r2 = 32
                long r1 = r1 << r2
                r2 = r8
                int r2 = r2.subValue()
                long r2 = (long) r2
                long r1 = r1 + r2
            L31:
                r0.priority = r1
                r0 = r6
                r1 = r7
                java.lang.Class r1 = r1.getClass()
                java.lang.Class<lombok.javac.ResolutionResetNeeded> r2 = lombok.javac.ResolutionResetNeeded.class
                boolean r1 = r1.isAnnotationPresent(r2)
                r0.resolutionResetNeeded = r1
                return
        }

        public long getPriority() {
                r3 = this;
                r0 = r3
                long r0 = r0.priority
                return r0
        }

        public boolean isResolutionResetNeeded() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.resolutionResetNeeded
                return r0
        }

        static /* synthetic */ lombok.javac.JavacASTVisitor access$0(lombok.javac.HandlerLibrary.VisitorContainer r2) {
                r0 = r2
                lombok.javac.JavacASTVisitor r0 = r0.visitor
                return r0
        }
    }

    public HandlerLibrary(javax.annotation.processing.Messager r5) {
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
            r0 = r4
            r1 = r5
            r0.messager = r1
            return
    }

    public java.util.SortedSet<java.lang.Long> getPriorities() {
            r2 = this;
            r0 = r2
            java.util.SortedSet<java.lang.Long> r0 = r0.priorities
            return r0
    }

    public java.util.SortedSet<java.lang.Long> getPrioritiesRequiringResolutionReset() {
            r2 = this;
            r0 = r2
            java.util.SortedSet<java.lang.Long> r0 = r0.prioritiesRequiringResolutionReset
            return r0
    }

    private void calculatePriorities() {
            r4 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            r1 = r0
            r1.<init>()
            r5 = r0
            java.util.TreeSet r0 = new java.util.TreeSet
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r4
            java.util.Map<java.lang.String, java.util.List<lombok.javac.HandlerLibrary$AnnotationHandlerContainer<?>>> r0 = r0.annotationHandlers
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L75
        L23:
            r0 = r8
            java.lang.Object r0 = r0.next()
            java.util.List r0 = (java.util.List) r0
            r7 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L6b
        L39:
            r0 = r10
            java.lang.Object r0 = r0.next()
            lombok.javac.HandlerLibrary$AnnotationHandlerContainer r0 = (lombok.javac.HandlerLibrary.AnnotationHandlerContainer) r0
            r9 = r0
            r0 = r5
            r1 = r9
            long r1 = r1.getPriority()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.add(r1)
            r0 = r9
            boolean r0 = r0.isResolutionResetNeeded()
            if (r0 == 0) goto L6b
            r0 = r6
            r1 = r9
            long r1 = r1.getPriority()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.add(r1)
        L6b:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L39
        L75:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L23
            r0 = r4
            java.util.Collection<lombok.javac.HandlerLibrary$VisitorContainer> r0 = r0.visitorHandlers
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto Lbb
        L8d:
            r0 = r8
            java.lang.Object r0 = r0.next()
            lombok.javac.HandlerLibrary$VisitorContainer r0 = (lombok.javac.HandlerLibrary.VisitorContainer) r0
            r7 = r0
            r0 = r5
            r1 = r7
            long r1 = r1.getPriority()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.add(r1)
            r0 = r7
            boolean r0 = r0.isResolutionResetNeeded()
            if (r0 == 0) goto Lbb
            r0 = r6
            r1 = r7
            long r1 = r1.getPriority()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.add(r1)
        Lbb:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L8d
            r0 = r4
            r1 = r5
            java.util.SortedSet r1 = java.util.Collections.unmodifiableSortedSet(r1)
            r0.priorities = r1
            r0 = r4
            r1 = r6
            java.util.SortedSet r1 = java.util.Collections.unmodifiableSortedSet(r1)
            r0.prioritiesRequiringResolutionReset = r1
            return
    }

    public static lombok.javac.HandlerLibrary load(javax.annotation.processing.Messager r5, com.sun.source.util.Trees r6) {
            lombok.javac.HandlerLibrary r0 = new lombok.javac.HandlerLibrary
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r6
            loadAnnotationHandlers(r0, r1)     // Catch: java.io.IOException -> L16
            r0 = r7
            r1 = r6
            loadVisitorHandlers(r0, r1)     // Catch: java.io.IOException -> L16
            goto L2d
        L16:
            r8 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Lombok isn't running due to misconfigured SPI files: "
            r2.<init>(r3)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L2d:
            r0 = r7
            r0.calculatePriorities()
            r0 = r7
            return r0
    }

    private static void loadAnnotationHandlers(lombok.javac.HandlerLibrary r6, com.sun.source.util.Trees r7) throws java.io.IOException {
            java.lang.Class<lombok.javac.JavacAnnotationHandler> r0 = lombok.javac.JavacAnnotationHandler.class
            java.lang.Class<lombok.javac.JavacAnnotationHandler> r1 = lombok.javac.JavacAnnotationHandler.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Iterable r0 = lombok.core.SpiLoadUtil.findServices(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L8a
        L13:
            r0 = r9
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacAnnotationHandler r0 = (lombok.javac.JavacAnnotationHandler) r0
            r8 = r0
            r0 = r8
            r1 = r7
            r0.setTrees(r1)
            r0 = r8
            java.lang.Class r0 = r0.getAnnotationHandledByThisHandler()
            r10 = r0
            lombok.javac.HandlerLibrary$AnnotationHandlerContainer r0 = new lombok.javac.HandlerLibrary$AnnotationHandlerContainer
            r1 = r0
            r2 = r8
            r3 = r10
            r1.<init>(r2, r3)
            r11 = r0
            r0 = r11
            java.lang.Class r0 = lombok.javac.HandlerLibrary.AnnotationHandlerContainer.access$0(r0)
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "$"
            java.lang.String r2 = "."
            java.lang.String r0 = r0.replace(r1, r2)
            r12 = r0
            r0 = r6
            java.util.Map<java.lang.String, java.util.List<lombok.javac.HandlerLibrary$AnnotationHandlerContainer<?>>> r0 = r0.annotationHandlers
            r1 = r12
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L71
            r0 = r6
            java.util.Map<java.lang.String, java.util.List<lombok.javac.HandlerLibrary$AnnotationHandlerContainer<?>>> r0 = r0.annotationHandlers
            r1 = r12
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = r2
            r4 = 1
            r3.<init>(r4)
            r3 = r2
            r13 = r3
            java.lang.Object r0 = r0.put(r1, r2)
        L71:
            r0 = r13
            r1 = r11
            boolean r0 = r0.add(r1)
            r0 = r6
            lombok.core.TypeLibrary r0 = r0.typeLibrary
            r1 = r11
            java.lang.Class r1 = lombok.javac.HandlerLibrary.AnnotationHandlerContainer.access$0(r1)
            java.lang.String r1 = r1.getName()
            r0.addType(r1)
        L8a:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L13
            return
    }

    private static void loadVisitorHandlers(lombok.javac.HandlerLibrary r5, com.sun.source.util.Trees r6) throws java.io.IOException {
            java.lang.Class<lombok.javac.JavacASTVisitor> r0 = lombok.javac.JavacASTVisitor.class
            java.lang.Class<lombok.javac.JavacASTVisitor> r1 = lombok.javac.JavacASTVisitor.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Iterable r0 = lombok.core.SpiLoadUtil.findServices(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L36
        L13:
            r0 = r8
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacASTVisitor r0 = (lombok.javac.JavacASTVisitor) r0
            r7 = r0
            r0 = r7
            r1 = r6
            r0.setTrees(r1)
            r0 = r5
            java.util.Collection<lombok.javac.HandlerLibrary$VisitorContainer> r0 = r0.visitorHandlers
            lombok.javac.HandlerLibrary$VisitorContainer r1 = new lombok.javac.HandlerLibrary$VisitorContainer
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
        L36:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L13
            return
    }

    public void javacWarning(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.javacWarning(r1, r2)
            return
    }

    public void javacWarning(java.lang.String r8, java.lang.Throwable r9) {
            r7 = this;
            r0 = r7
            javax.annotation.processing.Messager r0 = r0.messager
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.WARNING
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r4 = r8
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            r3 = r9
            if (r3 != 0) goto L1c
            java.lang.String r3 = ""
            goto L2d
        L1c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            java.lang.String r5 = ": "
            r4.<init>(r5)
            r4 = r9
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
        L2d:
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.printMessage(r1, r2)
            return
    }

    public void javacError(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.javacError(r1, r2)
            return
    }

    public void javacError(java.lang.String r8, java.lang.Throwable r9) {
            r7 = this;
            r0 = r7
            javax.annotation.processing.Messager r0 = r0.messager
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.ERROR
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r4 = r8
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            r3 = r9
            if (r3 != 0) goto L1c
            java.lang.String r3 = ""
            goto L2d
        L1c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            java.lang.String r5 = ": "
            r4.<init>(r5)
            r4 = r9
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
        L2d:
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.printMessage(r1, r2)
            r0 = r9
            if (r0 == 0) goto L40
            r0 = r9
            r0.printStackTrace()
        L40:
            return
    }

    private boolean checkAndSetHandled(com.sun.tools.javac.tree.JCTree r5) {
            r4 = this;
            lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree, java.lang.Boolean> r0 = lombok.javac.JavacAugments.JCTree_handled
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

    public void handleAnnotation(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r8, lombok.javac.JavacNode r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10, long r11) {
            r7 = this;
            lombok.core.TypeResolver r0 = new lombok.core.TypeResolver
            r1 = r0
            r2 = r9
            lombok.core.ImportList r2 = r2.getImportList()
            r1.<init>(r2)
            r13 = r0
            r0 = r10
            com.sun.tools.javac.tree.JCTree r0 = r0.annotationType
            java.lang.String r0 = r0.toString()
            r14 = r0
            r0 = r13
            r1 = r9
            r2 = r7
            lombok.core.TypeLibrary r2 = r2.typeLibrary
            r3 = r14
            java.lang.String r0 = r0.typeRefToFullyQualifiedName(r1, r2, r3)
            r15 = r0
            r0 = r15
            if (r0 != 0) goto L2a
            return
        L2a:
            r0 = r7
            java.util.Map<java.lang.String, java.util.List<lombok.javac.HandlerLibrary$AnnotationHandlerContainer<?>>> r0 = r0.annotationHandlers
            r1 = r15
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r16 = r0
            r0 = r16
            if (r0 != 0) goto L40
            return
        L40:
            r0 = r16
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
            goto Le3
        L4c:
            r0 = r18
            java.lang.Object r0 = r0.next()
            lombok.javac.HandlerLibrary$AnnotationHandlerContainer r0 = (lombok.javac.HandlerLibrary.AnnotationHandlerContainer) r0
            r17 = r0
            r0 = r17
            long r0 = r0.getPriority()     // Catch: lombok.core.AnnotationValues.AnnotationValueDecodeFail -> L85 java.lang.Throwable -> L9c
            r1 = r11
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Le3
            r0 = r7
            r1 = r10
            boolean r0 = r0.checkAndSetHandled(r1)     // Catch: lombok.core.AnnotationValues.AnnotationValueDecodeFail -> L85 java.lang.Throwable -> L9c
            if (r0 == 0) goto L74
            r0 = r17
            r1 = r9
            r0.handle(r1)     // Catch: lombok.core.AnnotationValues.AnnotationValueDecodeFail -> L85 java.lang.Throwable -> L9c
            goto Le3
        L74:
            r0 = r17
            boolean r0 = r0.isEvenIfAlreadyHandled()     // Catch: lombok.core.AnnotationValues.AnnotationValueDecodeFail -> L85 java.lang.Throwable -> L9c
            if (r0 == 0) goto Le3
            r0 = r17
            r1 = r9
            r0.handle(r1)     // Catch: lombok.core.AnnotationValues.AnnotationValueDecodeFail -> L85 java.lang.Throwable -> L9c
            goto Le3
        L85:
            r19 = move-exception
            r0 = r19
            lombok.core.AnnotationValues$AnnotationValue r0 = r0.owner
            r1 = r19
            java.lang.String r1 = r1.getMessage()
            r2 = r19
            int r2 = r2.idx
            r0.setError(r1, r2)
            goto Le3
        L9c:
            r19 = move-exception
            java.lang.String r0 = "(unknown).java"
            r20 = r0
            r0 = r8
            if (r0 == 0) goto Lb9
            r0 = r8
            javax.tools.JavaFileObject r0 = r0.sourcefile
            if (r0 == 0) goto Lb9
            r0 = r8
            javax.tools.JavaFileObject r0 = r0.sourcefile
            java.lang.String r0 = r0.getName()
            r20 = r0
        Lb9:
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Lombok annotation handler %s failed on "
            r2.<init>(r3)
            r2 = r20
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r17
            lombok.javac.JavacAnnotationHandler r5 = lombok.javac.HandlerLibrary.AnnotationHandlerContainer.access$1(r5)
            java.lang.Class r5 = r5.getClass()
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r2 = r19
            r0.javacError(r1, r2)
        Le3:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4c
            return
    }

    public void callASTVisitors(lombok.javac.JavacAST r8, long r9) {
            r7 = this;
            r0 = r7
            java.util.Collection<lombok.javac.HandlerLibrary$VisitorContainer> r0 = r0.visitorHandlers
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L4d
        Le:
            r0 = r12
            java.lang.Object r0 = r0.next()
            lombok.javac.HandlerLibrary$VisitorContainer r0 = (lombok.javac.HandlerLibrary.VisitorContainer) r0
            r11 = r0
            r0 = r11
            long r0 = r0.getPriority()     // Catch: java.lang.Throwable -> L30
            r1 = r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4d
            r0 = r8
            r1 = r11
            lombok.javac.JavacASTVisitor r1 = lombok.javac.HandlerLibrary.VisitorContainer.access$0(r1)     // Catch: java.lang.Throwable -> L30
            r0.traverse(r1)     // Catch: java.lang.Throwable -> L30
            goto L4d
        L30:
            r13 = move-exception
            r0 = r7
            java.lang.String r1 = "Lombok visitor handler %s failed"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r11
            lombok.javac.JavacASTVisitor r5 = lombok.javac.HandlerLibrary.VisitorContainer.access$0(r5)
            java.lang.Class r5 = r5.getClass()
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r2 = r13
            r0.javacError(r1, r2)
        L4d:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Le
            return
    }
}
