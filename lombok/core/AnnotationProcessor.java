package lombok.core;

@javax.annotation.processing.SupportedAnnotationTypes({"*"})
/* loaded from: com.usidqw.qwerklj.apk:lombok/core/AnnotationProcessor.SCL.lombok */
public class AnnotationProcessor extends javax.annotation.processing.AbstractProcessor {
    private final java.util.List<lombok.core.AnnotationProcessor.ProcessorDescriptor> registered;
    private final java.util.List<lombok.core.AnnotationProcessor.ProcessorDescriptor> active;
    private final java.util.List<java.lang.String> delayedWarnings;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/AnnotationProcessor$EcjDescriptor.SCL.lombok */
    static class EcjDescriptor extends lombok.core.AnnotationProcessor.ProcessorDescriptor {
        EcjDescriptor() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.core.AnnotationProcessor.ProcessorDescriptor
        java.lang.String getName() {
                r2 = this;
                java.lang.String r0 = "ECJ"
                return r0
        }

        @Override // lombok.core.AnnotationProcessor.ProcessorDescriptor
        boolean want(javax.annotation.processing.ProcessingEnvironment r4, java.util.List<java.lang.String> r5) {
                r3 = this;
                r0 = r4
                java.lang.Class r0 = r0.getClass()
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "org.eclipse.jdt."
                boolean r0 = r0.startsWith(r1)
                if (r0 != 0) goto L11
                r0 = 0
                return r0
            L11:
                r0 = 1
                return r0
        }

        @Override // lombok.core.AnnotationProcessor.ProcessorDescriptor
        boolean process(java.util.Set<? extends javax.lang.model.element.TypeElement> r3, javax.annotation.processing.RoundEnvironment r4) {
                r2 = this;
                r0 = 0
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/AnnotationProcessor$JavacDescriptor.SCL.lombok */
    static class JavacDescriptor extends lombok.core.AnnotationProcessor.ProcessorDescriptor {
        private javax.annotation.processing.Processor processor;

        JavacDescriptor() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.core.AnnotationProcessor.ProcessorDescriptor
        java.lang.String getName() {
                r2 = this;
                java.lang.String r0 = "OpenJDK javac"
                return r0
        }

        @Override // lombok.core.AnnotationProcessor.ProcessorDescriptor
        boolean want(javax.annotation.processing.ProcessingEnvironment r6, java.util.List<java.lang.String> r7) {
                r5 = this;
                r0 = r6
                java.lang.Class r0 = r0.getClass()
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "org.eclipse.jdt."
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L11
                r0 = 0
                return r0
            L11:
                r0 = r6
                r1 = r7
                javax.annotation.processing.ProcessingEnvironment r0 = lombok.core.AnnotationProcessor.getJavacProcessingEnvironment(r0, r1)
                r8 = r0
                r0 = r8
                if (r0 != 0) goto L1d
                r0 = 0
                return r0
            L1d:
                r0 = r5
                r1 = r8
                java.lang.ClassLoader r0 = r0.findAndPatchClassLoader(r1)     // Catch: java.lang.Exception -> L44 java.lang.NoClassDefFoundError -> L63
                r9 = r0
                r0 = r5
                java.lang.String r1 = "lombok.javac.apt.LombokProcessor"
                r2 = 0
                r3 = r9
                java.lang.Class r1 = java.lang.Class.forName(r1, r2, r3)     // Catch: java.lang.Exception -> L44 java.lang.NoClassDefFoundError -> L63
                r2 = 0
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L44 java.lang.NoClassDefFoundError -> L63
                java.lang.reflect.Constructor r1 = r1.getConstructor(r2)     // Catch: java.lang.Exception -> L44 java.lang.NoClassDefFoundError -> L63
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L44 java.lang.NoClassDefFoundError -> L63
                java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Exception -> L44 java.lang.NoClassDefFoundError -> L63
                javax.annotation.processing.Processor r1 = (javax.annotation.processing.Processor) r1     // Catch: java.lang.Exception -> L44 java.lang.NoClassDefFoundError -> L63
                r0.processor = r1     // Catch: java.lang.Exception -> L44 java.lang.NoClassDefFoundError -> L63
                goto L82
            L44:
                r9 = move-exception
                r0 = r7
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                java.lang.String r3 = "You found a bug in lombok; lombok.javac.apt.LombokProcessor is not available. Lombok will not run during this compilation: "
                r2.<init>(r3)
                r2 = r9
                java.lang.String r2 = lombok.core.AnnotationProcessor.access$0(r2)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                boolean r0 = r0.add(r1)
                r0 = 0
                return r0
            L63:
                r9 = move-exception
                r0 = r7
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                java.lang.String r3 = "Can't load javac processor due to (most likely) a class loader problem: "
                r2.<init>(r3)
                r2 = r9
                java.lang.String r2 = lombok.core.AnnotationProcessor.access$0(r2)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                boolean r0 = r0.add(r1)
                r0 = 0
                return r0
            L82:
                r0 = r5
                javax.annotation.processing.Processor r0 = r0.processor     // Catch: java.lang.Exception -> L8f java.lang.NoClassDefFoundError -> Lae
                r1 = r6
                r0.init(r1)     // Catch: java.lang.Exception -> L8f java.lang.NoClassDefFoundError -> Lae
                goto Lcd
            L8f:
                r9 = move-exception
                r0 = r7
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                java.lang.String r3 = "lombok.javac.apt.LombokProcessor could not be initialized. Lombok will not run during this compilation: "
                r2.<init>(r3)
                r2 = r9
                java.lang.String r2 = lombok.core.AnnotationProcessor.access$0(r2)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                boolean r0 = r0.add(r1)
                r0 = 0
                return r0
            Lae:
                r9 = move-exception
                r0 = r7
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                java.lang.String r3 = "Can't initialize javac processor due to (most likely) a class loader problem: "
                r2.<init>(r3)
                r2 = r9
                java.lang.String r2 = lombok.core.AnnotationProcessor.access$0(r2)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                boolean r0 = r0.add(r1)
                r0 = 0
                return r0
            Lcd:
                r0 = 1
                return r0
        }

        private java.lang.ClassLoader findAndPatchClassLoader(javax.annotation.processing.ProcessingEnvironment r8) throws java.lang.Exception {
                r7 = this;
                r0 = r8
                java.lang.Class r0 = r0.getClass()
                java.lang.ClassLoader r0 = r0.getClassLoader()
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L65
                r0 = r9
                java.lang.Class r0 = r0.getClass()
                java.lang.String r0 = r0.getCanonicalName()
                java.lang.String r1 = "org.codehaus.plexus.compiler.javac.IsolatedClassLoader"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L65
                lombok.core.FieldAugment<java.lang.ClassLoader, java.lang.Boolean> r0 = lombok.core.Augments.ClassLoader_lombokAlreadyAddedTo
                r1 = r9
                r2 = 1
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                java.lang.Object r0 = r0.getAndSet(r1, r2)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L65
                r0 = r9
                java.lang.Class r0 = r0.getClass()
                java.lang.String r1 = "addURL"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<java.net.URL> r5 = java.net.URL.class
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)
                r10 = r0
                java.io.File r0 = new java.io.File
                r1 = r0
                java.lang.Class<lombok.core.AnnotationProcessor> r2 = lombok.core.AnnotationProcessor.class
                java.lang.String r2 = lombok.patcher.ClassRootFinder.findClassRootOfClass(r2)
                r1.<init>(r2)
                java.net.URI r0 = r0.toURI()
                java.net.URL r0 = r0.toURL()
                r11 = r0
                r0 = r10
                r1 = r9
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                r3[r4] = r5
                java.lang.Object r0 = lombok.permit.Permit.invoke(r0, r1, r2)
            L65:
                java.lang.Class<lombok.core.AnnotationProcessor$JavacDescriptor> r0 = lombok.core.AnnotationProcessor.JavacDescriptor.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                r10 = r0
                r0 = r10
                if (r0 != 0) goto L73
                java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
                return r0
            L73:
                r0 = r10
                return r0
        }

        @Override // lombok.core.AnnotationProcessor.ProcessorDescriptor
        boolean process(java.util.Set<? extends javax.lang.model.element.TypeElement> r5, javax.annotation.processing.RoundEnvironment r6) {
                r4 = this;
                r0 = r4
                javax.annotation.processing.Processor r0 = r0.processor
                r1 = r5
                r2 = r6
                boolean r0 = r0.process(r1, r2)
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/AnnotationProcessor$ProcessorDescriptor.SCL.lombok */
    static abstract class ProcessorDescriptor {
        ProcessorDescriptor() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        abstract boolean want(javax.annotation.processing.ProcessingEnvironment r1, java.util.List<java.lang.String> r2);

        abstract java.lang.String getName();

        abstract boolean process(java.util.Set<? extends javax.lang.model.element.TypeElement> r1, javax.annotation.processing.RoundEnvironment r2);
    }

    public AnnotationProcessor() {
            r7 = this;
            r0 = r7
            r0.<init>()
            r0 = r7
            r1 = 2
            lombok.core.AnnotationProcessor$ProcessorDescriptor[] r1 = new lombok.core.AnnotationProcessor.ProcessorDescriptor[r1]
            r2 = r1
            r3 = 0
            lombok.core.AnnotationProcessor$JavacDescriptor r4 = new lombok.core.AnnotationProcessor$JavacDescriptor
            r5 = r4
            r5.<init>()
            r2[r3] = r4
            r2 = r1
            r3 = 1
            lombok.core.AnnotationProcessor$EcjDescriptor r4 = new lombok.core.AnnotationProcessor$EcjDescriptor
            r5 = r4
            r5.<init>()
            r2[r3] = r4
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.registered = r1
            r0 = r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.active = r1
            r0 = r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.delayedWarnings = r1
            return
    }

    private static java.lang.String trace(java.lang.Throwable r6) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r2 = r1
            r3 = r7
            r4 = 1
            r2.<init>(r3, r4)
            r0.printStackTrace(r1)
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static javax.annotation.processing.ProcessingEnvironment getJavacProcessingEnvironment(javax.annotation.processing.ProcessingEnvironment r2, java.util.List<java.lang.String> r3) {
            r0 = r2
            javax.annotation.processing.ProcessingEnvironment r0 = tryRecursivelyObtainJavacProcessingEnvironment(r0)
            return r0
    }

    private static javax.annotation.processing.ProcessingEnvironment tryRecursivelyObtainJavacProcessingEnvironment(javax.annotation.processing.ProcessingEnvironment r3) {
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.sun.tools.javac.processing.JavacProcessingEnvironment"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11
            r0 = r3
            return r0
        L11:
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            r4 = r0
            goto L45
        L19:
            r0 = r4
            r1 = r3
            java.lang.Object r0 = tryGetDelegateField(r0, r1)     // Catch: java.lang.Exception -> L3f
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L29
            r0 = r4
            r1 = r3
            java.lang.Object r0 = tryGetProcessingEnvField(r0, r1)     // Catch: java.lang.Exception -> L3f
            r5 = r0
        L29:
            r0 = r5
            if (r0 != 0) goto L33
            r0 = r4
            r1 = r3
            java.lang.Object r0 = tryGetProxyDelegateToField(r0, r1)     // Catch: java.lang.Exception -> L3f
            r5 = r0
        L33:
            r0 = r5
            if (r0 == 0) goto L40
            r0 = r5
            javax.annotation.processing.ProcessingEnvironment r0 = (javax.annotation.processing.ProcessingEnvironment) r0     // Catch: java.lang.Exception -> L3f
            javax.annotation.processing.ProcessingEnvironment r0 = tryRecursivelyObtainJavacProcessingEnvironment(r0)     // Catch: java.lang.Exception -> L3f
            return r0
        L3f:
        L40:
            r0 = r4
            java.lang.Class r0 = r0.getSuperclass()
            r4 = r0
        L45:
            r0 = r4
            if (r0 != 0) goto L19
            r0 = 0
            return r0
    }

    private static java.lang.Object tryGetDelegateField(java.lang.Class<?> r3, java.lang.Object r4) {
            r0 = r3
            java.lang.String r1 = "delegate"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> Lb
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Lb
            return r0
        Lb:
            r0 = 0
            return r0
    }

    private static java.lang.Object tryGetProcessingEnvField(java.lang.Class<?> r3, java.lang.Object r4) {
            r0 = r3
            java.lang.String r1 = "processingEnv"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> Lb
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Lb
            return r0
        Lb:
            r0 = 0
            return r0
    }

    private static java.lang.Object tryGetProxyDelegateToField(java.lang.Class<?> r3, java.lang.Object r4) {
            r0 = r4
            java.lang.reflect.InvocationHandler r0 = java.lang.reflect.Proxy.getInvocationHandler(r0)     // Catch: java.lang.Exception -> L13
            r5 = r0
            r0 = r5
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = "val$delegateTo"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> L13
            r1 = r5
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L13
            return r0
        L13:
            r0 = 0
            return r0
    }

    public void init(javax.annotation.processing.ProcessingEnvironment r9) {
            r8 = this;
            r0 = r8
            r1 = r9
            super.init(r1)
            r0 = r8
            java.util.List<lombok.core.AnnotationProcessor$ProcessorDescriptor> r0 = r0.registered
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L33
        L12:
            r0 = r11
            java.lang.Object r0 = r0.next()
            lombok.core.AnnotationProcessor$ProcessorDescriptor r0 = (lombok.core.AnnotationProcessor.ProcessorDescriptor) r0
            r10 = r0
            r0 = r10
            r1 = r9
            r2 = r8
            java.util.List<java.lang.String> r2 = r2.delayedWarnings
            boolean r0 = r0.want(r1, r2)
            if (r0 == 0) goto L33
            r0 = r8
            java.util.List<lombok.core.AnnotationProcessor$ProcessorDescriptor> r0 = r0.active
            r1 = r10
            boolean r0 = r0.add(r1)
        L33:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L12
            r0 = r8
            java.util.List<lombok.core.AnnotationProcessor$ProcessorDescriptor> r0 = r0.active
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le4
            r0 = r8
            java.util.List<java.lang.String> r0 = r0.delayedWarnings
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r8
            java.util.List<lombok.core.AnnotationProcessor$ProcessorDescriptor> r0 = r0.registered
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L8c
        L6a:
            r0 = r12
            java.lang.Object r0 = r0.next()
            lombok.core.AnnotationProcessor$ProcessorDescriptor r0 = (lombok.core.AnnotationProcessor.ProcessorDescriptor) r0
            r11 = r0
            r0 = r10
            int r0 = r0.length()
            if (r0 <= 0) goto L83
            r0 = r10
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        L83:
            r0 = r10
            r1 = r11
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
        L8c:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L6a
            r0 = r9
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.google.turbine.processing.TurbineProcessingEnvironment"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbf
            r0 = r9
            javax.annotation.processing.Messager r0 = r0.getMessager()
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.ERROR
            java.lang.String r2 = "Turbine is not currently supported by lombok."
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r0.printMessage(r1, r2)
            goto Le4
        Lbf:
            r0 = r9
            javax.annotation.processing.Messager r0 = r0.getMessager()
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.WARNING
            java.lang.String r2 = "You aren't using a compiler supported by lombok, so lombok will not work and has been disabled.\nYour processor is: %s\nLombok supports: %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r9
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r10
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r0.printMessage(r1, r2)
        Le4:
            return
    }

    public boolean process(java.util.Set<? extends javax.lang.model.element.TypeElement> r6, javax.annotation.processing.RoundEnvironment r7) {
            r5 = this;
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.delayedWarnings
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6e
            r0 = r7
            java.util.Set r0 = r0.getRootElements()
            r8 = r0
            r0 = r8
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6e
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            javax.lang.model.element.Element r0 = (javax.lang.model.element.Element) r0
            r9 = r0
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.delayedWarnings
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L5b
        L3a:
            r0 = r11
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            r0 = r5
            javax.annotation.processing.ProcessingEnvironment r0 = r0.processingEnv
            javax.annotation.processing.Messager r0 = r0.getMessager()
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.WARNING
            r2 = r10
            r3 = r9
            r0.printMessage(r1, r2, r3)
        L5b:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L3a
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.delayedWarnings
            r0.clear()
        L6e:
            r0 = r5
            java.util.List<lombok.core.AnnotationProcessor$ProcessorDescriptor> r0 = r0.active
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L8e
        L7c:
            r0 = r9
            java.lang.Object r0 = r0.next()
            lombok.core.AnnotationProcessor$ProcessorDescriptor r0 = (lombok.core.AnnotationProcessor.ProcessorDescriptor) r0
            r8 = r0
            r0 = r8
            r1 = r6
            r2 = r7
            boolean r0 = r0.process(r1, r2)
        L8e:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L7c
            r0 = 1
            r8 = r0
            r0 = 1
            r9 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto Ld5
        La8:
            r0 = r11
            java.lang.Object r0 = r0.next()
            javax.lang.model.element.TypeElement r0 = (javax.lang.model.element.TypeElement) r0
            r10 = r0
            r0 = 0
            r9 = r0
            r0 = r10
            javax.lang.model.element.Name r0 = r0.getQualifiedName()
            r12 = r0
            r0 = r12
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "lombok."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto Ld3
            goto Ld5
        Ld3:
            r0 = 0
            r8 = r0
        Ld5:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto La8
            r0 = r8
            if (r0 == 0) goto Lea
            r0 = r9
            if (r0 != 0) goto Lea
            r0 = 1
            return r0
        Lea:
            r0 = 0
            return r0
    }

    public javax.lang.model.SourceVersion getSupportedSourceVersion() {
            r2 = this;
            javax.lang.model.SourceVersion r0 = javax.lang.model.SourceVersion.latest()
            return r0
    }

    static /* synthetic */ java.lang.String access$0(java.lang.Throwable r2) {
            r0 = r2
            java.lang.String r0 = trace(r0)
            return r0
    }
}
