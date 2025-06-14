package lombok.launch;

/* compiled from: AnnotationProcessor.java */
/* loaded from: classes.dex */
class AnnotationProcessorHider {

    public static class AnnotationProcessor extends javax.annotation.processing.AbstractProcessor {
        private final javax.annotation.processing.AbstractProcessor instance;

        public AnnotationProcessor() {
                r1 = this;
                r1.<init>()
                javax.annotation.processing.AbstractProcessor r0 = createWrappedInstance()
                r1.instance = r0
                return
        }

        private static javax.annotation.processing.AbstractProcessor createWrappedInstance() {
                java.lang.ClassLoader r0 = lombok.launch.Main.getShadowClassLoader()
                java.lang.String r1 = "lombok.core.AnnotationProcessor"
                java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Throwable -> L1a
                r1 = 0
                java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L1a
                java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L1a
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L1a
                javax.annotation.processing.AbstractProcessor r0 = (javax.annotation.processing.AbstractProcessor) r0     // Catch: java.lang.Throwable -> L1a
                return r0
            L1a:
                r0 = move-exception
                boolean r1 = r0 instanceof java.lang.Error
                if (r1 != 0) goto L2c
                boolean r1 = r0 instanceof java.lang.RuntimeException
                if (r1 == 0) goto L26
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
                throw r0
            L26:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L2c:
                java.lang.Error r0 = (java.lang.Error) r0
                throw r0
        }

        private void disableJava9SillyWarning() {
                r5 = this;
                java.lang.Class<sun.misc.Unsafe> r0 = sun.misc.Unsafe.class
                java.lang.String r1 = "theUnsafe"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L26
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L26
                r1 = 0
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L26
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.lang.Throwable -> L26
                java.lang.String r2 = "jdk.internal.module.IllegalAccessLogger"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L26
                java.lang.String r3 = "logger"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L26
                long r3 = r0.staticFieldOffset(r3)     // Catch: java.lang.Throwable -> L26
                r0.putObjectVolatile(r2, r3, r1)     // Catch: java.lang.Throwable -> L26
            L26:
                return
        }

        public java.lang.Iterable<? extends javax.annotation.processing.Completion> getCompletions(javax.lang.model.element.Element r2, javax.lang.model.element.AnnotationMirror r3, javax.lang.model.element.ExecutableElement r4, java.lang.String r5) {
                r1 = this;
                javax.annotation.processing.AbstractProcessor r0 = r1.instance
                java.lang.Iterable r2 = r0.getCompletions(r2, r3, r4, r5)
                return r2
        }

        public java.util.Set<java.lang.String> getSupportedAnnotationTypes() {
                r1 = this;
                javax.annotation.processing.AbstractProcessor r0 = r1.instance
                java.util.Set r0 = r0.getSupportedAnnotationTypes()
                return r0
        }

        public java.util.Set<java.lang.String> getSupportedOptions() {
                r1 = this;
                javax.annotation.processing.AbstractProcessor r0 = r1.instance
                java.util.Set r0 = r0.getSupportedOptions()
                return r0
        }

        public javax.lang.model.SourceVersion getSupportedSourceVersion() {
                r1 = this;
                javax.annotation.processing.AbstractProcessor r0 = r1.instance
                javax.lang.model.SourceVersion r0 = r0.getSupportedSourceVersion()
                return r0
        }

        public void init(javax.annotation.processing.ProcessingEnvironment r2) {
                r1 = this;
                r1.disableJava9SillyWarning()
                r0 = 1
                lombok.launch.AnnotationProcessorHider.AstModificationNotifierData.lombokInvoked = r0
                javax.annotation.processing.AbstractProcessor r0 = r1.instance
                r0.init(r2)
                super.init(r2)
                return
        }

        public boolean process(java.util.Set<? extends javax.lang.model.element.TypeElement> r2, javax.annotation.processing.RoundEnvironment r3) {
                r1 = this;
                javax.annotation.processing.AbstractProcessor r0 = r1.instance
                boolean r2 = r0.process(r2, r3)
                return r2
        }
    }

    /* compiled from: AnnotationProcessor.java */
    public static class AstModificationNotifierData {
        public static volatile boolean lombokInvoked = false;

        static {
                return
        }

        public AstModificationNotifierData() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: AnnotationProcessor.java */
    @javax.annotation.processing.SupportedAnnotationTypes({"lombok.*"})
    public static class ClaimingProcessor extends javax.annotation.processing.AbstractProcessor {
        public ClaimingProcessor() {
                r0 = this;
                r0.<init>()
                return
        }

        public javax.lang.model.SourceVersion getSupportedSourceVersion() {
                r1 = this;
                javax.lang.model.SourceVersion r0 = javax.lang.model.SourceVersion.latest()
                return r0
        }

        public boolean process(java.util.Set<? extends javax.lang.model.element.TypeElement> r1, javax.annotation.processing.RoundEnvironment r2) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    AnnotationProcessorHider() {
            r0 = this;
            r0.<init>()
            return
    }
}
