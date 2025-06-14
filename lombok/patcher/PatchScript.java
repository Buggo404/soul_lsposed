package lombok.patcher;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/PatchScript.SCL.lombok */
public abstract class PatchScript {



    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/PatchScript$FixedClassWriter.SCL.lombok */
    private static class FixedClassWriter extends org.objectweb.asm.ClassWriter {
        FixedClassWriter(org.objectweb.asm.ClassReader r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        @Override // org.objectweb.asm.ClassWriter
        protected java.lang.String getCommonSuperClass(java.lang.String r5, java.lang.String r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                java.lang.String r0 = super.getCommonSuperClass(r1, r2)     // Catch: java.lang.Throwable -> L7
                return r0
            L7:
                java.lang.String r0 = "java/lang/Object"
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/PatchScript$InsertBodyOfMethodIntoAnotherVisitor.SCL.lombok */
    private static final class InsertBodyOfMethodIntoAnotherVisitor extends org.objectweb.asm.MethodVisitor {
        private InsertBodyOfMethodIntoAnotherVisitor(org.objectweb.asm.MethodVisitor r5) {
                r4 = this;
                r0 = r4
                r1 = 589824(0x90000, float:8.2652E-40)
                r2 = r5
                r0.<init>(r1, r2)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public org.objectweb.asm.AnnotationVisitor visitParameterAnnotation(int r3, java.lang.String r4, boolean r5) {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitMaxs(int r2, int r3) {
                r1 = this;
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitLineNumber(int r2, org.objectweb.asm.Label r3) {
                r1 = this;
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitFrame(int r2, int r3, java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
                r1 = this;
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitEnd() {
                r1 = this;
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitCode() {
                r1 = this;
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitInsn(int r4) {
                r3 = this;
                r0 = r4
                r1 = 177(0xb1, float:2.48E-43)
                if (r0 == r1) goto L2a
                r0 = r4
                r1 = 176(0xb0, float:2.47E-43)
                if (r0 == r1) goto L2a
                r0 = r4
                r1 = 172(0xac, float:2.41E-43)
                if (r0 == r1) goto L2a
                r0 = r4
                r1 = 175(0xaf, float:2.45E-43)
                if (r0 == r1) goto L2a
                r0 = r4
                r1 = 174(0xae, float:2.44E-43)
                if (r0 == r1) goto L2a
                r0 = r4
                r1 = 173(0xad, float:2.42E-43)
                if (r0 != r1) goto L2b
            L2a:
                return
            L2b:
                r0 = r3
                r1 = r4
                super.visitInsn(r1)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitAttribute(org.objectweb.asm.Attribute r2) {
                r1 = this;
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public org.objectweb.asm.AnnotationVisitor visitAnnotationDefault() {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // org.objectweb.asm.MethodVisitor
        public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r3, boolean r4) {
                r2 = this;
                r0 = 0
                return r0
        }

        /* synthetic */ InsertBodyOfMethodIntoAnotherVisitor(org.objectweb.asm.MethodVisitor r4, lombok.patcher.PatchScript.InsertBodyOfMethodIntoAnotherVisitor r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/PatchScript$MethodPatcher.SCL.lombok */
    protected static class MethodPatcher extends org.objectweb.asm.ClassVisitor {
        private java.util.List<lombok.patcher.TargetMatcher> targets;
        private java.lang.String ownClassSpec;
        private final lombok.patcher.PatchScript.MethodPatcherFactory factory;
        private java.util.List<lombok.patcher.Hook> transplants;
        private final lombok.patcher.TransplantMapper transplantMapper;
        private int classFileFormatVersion;

        public MethodPatcher(org.objectweb.asm.ClassVisitor r5, lombok.patcher.TransplantMapper r6, lombok.patcher.PatchScript.MethodPatcherFactory r7) {
                r4 = this;
                r0 = r4
                r1 = 589824(0x90000, float:8.2652E-40)
                r2 = r5
                r0.<init>(r1, r2)
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.targets = r1
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.transplants = r1
                r0 = r4
                r1 = r7
                r0.factory = r1
                r0 = r4
                r1 = r6
                r0.transplantMapper = r1
                return
        }

        public java.lang.String getOwnClassSpec() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.ownClassSpec
                return r0
        }

        public void addTargetMatcher(lombok.patcher.TargetMatcher r4) {
                r3 = this;
                r0 = r3
                java.util.List<lombok.patcher.TargetMatcher> r0 = r0.targets
                r1 = r4
                boolean r0 = r0.add(r1)
                return
        }

        @Override // org.objectweb.asm.ClassVisitor
        public void visit(int r9, int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14) {
                r8 = this;
                r0 = r8
                r1 = r11
                r0.ownClassSpec = r1
                r0 = r8
                r1 = r9
                r0.classFileFormatVersion = r1
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                super.visit(r1, r2, r3, r4, r5, r6)
                return
        }

        public void addTransplant(lombok.patcher.Hook r5) {
                r4 = this;
                r0 = r5
                if (r0 != 0) goto Le
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r1 = r0
                java.lang.String r2 = "transplant"
                r1.<init>(r2)
                throw r0
            Le:
                r0 = r4
                java.util.List<lombok.patcher.Hook> r0 = r0.transplants
                r1 = r5
                boolean r0 = r0.add(r1)
                return
        }

        @Override // org.objectweb.asm.ClassVisitor
        public void visitEnd() {
                r7 = this;
                r0 = r7
                java.util.List<lombok.patcher.Hook> r0 = r0.transplants
                java.util.Iterator r0 = r0.iterator()
                r9 = r0
                goto L53
            Ld:
                r0 = r9
                java.lang.Object r0 = r0.next()
                lombok.patcher.Hook r0 = (lombok.patcher.Hook) r0
                r8 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = "/"
                r1.<init>(r2)
                r1 = r7
                lombok.patcher.TransplantMapper r1 = r1.transplantMapper
                r2 = r7
                int r2 = r2.classFileFormatVersion
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r4 = r3
                r5 = r8
                java.lang.String r5 = r5.getClassSpec()
                java.lang.String r5 = java.lang.String.valueOf(r5)
                r4.<init>(r5)
                java.lang.String r4 = ".class"
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r1 = r1.mapResourceName(r2, r3)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r10 = r0
                r0 = r10
                r1 = r8
                r2 = r7
                org.objectweb.asm.ClassVisitor r2 = r2.f624cv
                lombok.patcher.PatchScript.transplantMethod(r0, r1, r2)
            L53:
                r0 = r9
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Ld
                return
        }

        @Override // org.objectweb.asm.ClassVisitor
        public org.objectweb.asm.MethodVisitor visitMethod(int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                org.objectweb.asm.MethodVisitor r0 = super.visitMethod(r1, r2, r3, r4, r5)
                r15 = r0
                r0 = r9
                java.util.List<lombok.patcher.Hook> r0 = r0.transplants
                java.util.Iterator r0 = r0.iterator()
                r16 = r0
                goto L46
            L1b:
                r0 = r16
                java.lang.Object r0 = r0.next()
                lombok.patcher.Hook r0 = (lombok.patcher.Hook) r0
                r17 = r0
                r0 = r17
                java.lang.String r0 = r0.getMethodName()
                r1 = r11
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L46
                r0 = r17
                java.lang.String r0 = r0.getMethodDescriptor()
                r1 = r12
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L46
                r0 = r16
                r0.remove()
            L46:
                r0 = r16
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L1b
                r0 = r9
                java.util.List<lombok.patcher.TargetMatcher> r0 = r0.targets
                java.util.Iterator r0 = r0.iterator()
                r17 = r0
                goto L91
            L5e:
                r0 = r17
                java.lang.Object r0 = r0.next()
                lombok.patcher.TargetMatcher r0 = (lombok.patcher.TargetMatcher) r0
                r16 = r0
                r0 = r16
                r1 = r9
                java.lang.String r1 = r1.ownClassSpec
                r2 = r11
                r3 = r12
                boolean r0 = r0.matches(r1, r2, r3)
                if (r0 == 0) goto L91
                r0 = r9
                lombok.patcher.PatchScript$MethodPatcherFactory r0 = r0.factory
                r1 = r11
                r2 = r12
                r3 = r15
                lombok.patcher.MethodLogistics r4 = new lombok.patcher.MethodLogistics
                r5 = r4
                r6 = r10
                r7 = r12
                r5.<init>(r6, r7)
                org.objectweb.asm.MethodVisitor r0 = r0.createMethodVisitor(r1, r2, r3, r4)
                return r0
            L91:
                r0 = r17
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L5e
                r0 = r15
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/PatchScript$MethodPatcherFactory.SCL.lombok */
    public interface MethodPatcherFactory {
        org.objectweb.asm.MethodVisitor createMethodVisitor(java.lang.String r1, java.lang.String r2, org.objectweb.asm.MethodVisitor r3, lombok.patcher.MethodLogistics r4);
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/PatchScript$NoopClassVisitor.SCL.lombok */
    private static abstract class NoopClassVisitor extends org.objectweb.asm.ClassVisitor {
        public NoopClassVisitor() {
                r3 = this;
                r0 = r3
                r1 = 589824(0x90000, float:8.2652E-40)
                r0.<init>(r1)
                return
        }

        @Override // org.objectweb.asm.ClassVisitor
        public void visit(int r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String[] r7) {
                r1 = this;
                return
        }

        @Override // org.objectweb.asm.ClassVisitor
        public void visitAttribute(org.objectweb.asm.Attribute r2) {
                r1 = this;
                return
        }

        @Override // org.objectweb.asm.ClassVisitor
        public void visitEnd() {
                r1 = this;
                return
        }

        @Override // org.objectweb.asm.ClassVisitor
        public void visitOuterClass(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r1 = this;
                return
        }

        @Override // org.objectweb.asm.ClassVisitor
        public void visitSource(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                return
        }

        @Override // org.objectweb.asm.ClassVisitor
        public void visitInnerClass(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5) {
                r1 = this;
                return
        }

        @Override // org.objectweb.asm.ClassVisitor
        public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r3, boolean r4) {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // org.objectweb.asm.ClassVisitor
        public org.objectweb.asm.FieldVisitor visitField(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.Object r7) {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // org.objectweb.asm.ClassVisitor
        public org.objectweb.asm.MethodVisitor visitMethod(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String[] r7) {
                r2 = this;
                r0 = 0
                return r0
        }
    }

    public PatchScript() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public java.lang.String getPatchScriptName() {
            r2 = this;
            r0 = r2
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    public abstract java.util.Collection<java.lang.String> getClassesToReload();

    public static boolean classMatches(java.lang.String r3, java.util.Collection<java.lang.String> r4) {
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L1e
        La:
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            r0 = r3
            r1 = r5
            boolean r0 = lombok.patcher.MethodTarget.typeMatches(r0, r1)
            if (r0 == 0) goto L1e
            r0 = 1
            return r0
        L1e:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto La
            r0 = 0
            return r0
    }

    public abstract boolean wouldPatch(java.lang.String r1);

    public abstract byte[] patch(java.lang.String r1, byte[] r2, lombok.patcher.TransplantMapper r3);

    protected byte[] runASM(byte[] r6, boolean r7, lombok.patcher.TransplantMapper r8) {
            r5 = this;
            org.objectweb.asm.ClassReader r0 = new org.objectweb.asm.ClassReader
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r9 = r0
            r0 = 48
            r10 = r0
            r0 = r6
            int r0 = r0.length
            r1 = 7
            if (r0 <= r1) goto L1f
            r0 = r6
            r1 = 7
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r10 = r0
        L1f:
            r0 = r10
            r1 = 50
            if (r0 >= r1) goto L2a
            r0 = 2
            goto L2b
        L2a:
            r0 = 0
        L2b:
            r11 = r0
            r0 = r7
            if (r0 == 0) goto L37
            r0 = r11
            r1 = 1
            r0 = r0 | r1
            r11 = r0
        L37:
            lombok.patcher.PatchScript$FixedClassWriter r0 = new lombok.patcher.PatchScript$FixedClassWriter
            r1 = r0
            r2 = r9
            r3 = r11
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r5
            r1 = r12
            r2 = r9
            java.lang.String r2 = r2.getClassName()
            r3 = r8
            org.objectweb.asm.ClassVisitor r0 = r0.createClassVisitor(r1, r2, r3)
            r13 = r0
            r0 = r9
            r1 = r13
            r2 = 0
            r0.accept(r1, r2)
            r0 = r12
            byte[] r0 = r0.toByteArray()
            return r0
    }

    protected org.objectweb.asm.ClassVisitor createClassVisitor(org.objectweb.asm.ClassWriter r5, java.lang.String r6, lombok.patcher.TransplantMapper r7) {
            r4 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "If you're going to call runASM, then you need to implement createClassVisitor"
            r1.<init>(r2)
            throw r0
    }

    private static byte[] readStream(java.lang.String r6) {
            r0 = 0
            r7 = r0
            java.lang.Class<lombok.patcher.PatchScript> r0 = lombok.patcher.PatchScript.class
            r1 = r6
            java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L65
            r7 = r0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L65
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L65
            r8 = r0
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L65
            r9 = r0
        L16:
            r0 = r7
            r1 = r9
            int r0 = r0.read(r1)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L65
            r10 = r0
            r0 = r10
            r1 = -1
            if (r0 != r1) goto L26
            goto L31
        L26:
            r0 = r8
            r1 = r9
            r2 = 0
            r3 = r10
            r0.write(r1, r2, r3)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L65
            goto L16
        L31:
            r0 = r8
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L65
            r12 = r0
            r0 = r7
            if (r0 == 0) goto L43
            r0 = r7
            r0.close()     // Catch: java.io.IOException -> L42
            goto L43
        L42:
        L43:
            r0 = r12
            return r0
        L46:
            r8 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L65
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r3 = r2
            java.lang.String r4 = "resource "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L65
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = " does not exist."
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L65
            r3 = r8
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L65
            throw r0     // Catch: java.lang.Throwable -> L65
        L65:
            r11 = move-exception
            r0 = r7
            if (r0 == 0) goto L73
            r0 = r7
            r0.close()     // Catch: java.io.IOException -> L72
            goto L73
        L72:
        L73:
            r0 = r11
            throw r0
    }

    protected static void insertMethod(lombok.patcher.Hook r5, org.objectweb.asm.MethodVisitor r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "/"
            r1.<init>(r2)
            r1 = r5
            java.lang.String r1 = r1.getClassSpec()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".class"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            byte[] r0 = readStream(r0)
            r7 = r0
            org.objectweb.asm.ClassReader r0 = new org.objectweb.asm.ClassReader
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r8 = r0
            lombok.patcher.PatchScript$1 r0 = new lombok.patcher.PatchScript$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r8
            r1 = r9
            r2 = 0
            r0.accept(r1, r2)
            return
    }

    protected static void transplantMethod(java.lang.String r5, lombok.patcher.Hook r6, org.objectweb.asm.ClassVisitor r7) {
            r0 = r5
            byte[] r0 = readStream(r0)
            r8 = r0
            org.objectweb.asm.ClassReader r0 = new org.objectweb.asm.ClassReader
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r9 = r0
            lombok.patcher.PatchScript$2 r0 = new lombok.patcher.PatchScript$2
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            r10 = r0
            r0 = r9
            r1 = r10
            r2 = 0
            r0.accept(r1, r2)
            return
    }
}
