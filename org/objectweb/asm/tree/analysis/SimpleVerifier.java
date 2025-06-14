package org.objectweb.asm.tree.analysis;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/analysis/SimpleVerifier.SCL.lombok */
public class SimpleVerifier extends org.objectweb.asm.tree.analysis.BasicVerifier {
    private final org.objectweb.asm.Type currentClass;
    private final org.objectweb.asm.Type currentSuperClass;
    private final java.util.List<org.objectweb.asm.Type> currentClassInterfaces;
    private final boolean isInterface;
    private java.lang.ClassLoader loader;

    public SimpleVerifier() {
            r5 = this;
            r0 = r5
            r1 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    public SimpleVerifier(org.objectweb.asm.Type r7, org.objectweb.asm.Type r8, boolean r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = 0
            r4 = r9
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public SimpleVerifier(org.objectweb.asm.Type r8, org.objectweb.asm.Type r9, java.util.List<org.objectweb.asm.Type> r10, boolean r11) {
            r7 = this;
            r0 = r7
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r7
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.tree.analysis.SimpleVerifier> r1 = org.objectweb.asm.tree.analysis.SimpleVerifier.class
            if (r0 == r1) goto L1c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L1c:
            return
    }

    protected SimpleVerifier(int r4, org.objectweb.asm.Type r5, org.objectweb.asm.Type r6, java.util.List<org.objectweb.asm.Type> r7, boolean r8) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r3
            java.lang.Class r1 = r1.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.loader = r1
            r0 = r3
            r1 = r5
            r0.currentClass = r1
            r0 = r3
            r1 = r6
            r0.currentSuperClass = r1
            r0 = r3
            r1 = r7
            r0.currentClassInterfaces = r1
            r0 = r3
            r1 = r8
            r0.isInterface = r1
            return
    }

    public void setClassLoader(java.lang.ClassLoader r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.loader = r1
            return
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue newValue(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L8
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.UNINITIALIZED_VALUE
            return r0
        L8:
            r0 = r5
            int r0 = r0.getSort()
            r1 = 9
            if (r0 != r1) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L49
            r0 = r5
            org.objectweb.asm.Type r0 = r0.getElementType()
            int r0 = r0.getSort()
            switch(r0) {
                case 1: goto L40;
                case 2: goto L40;
                case 3: goto L40;
                case 4: goto L40;
                default: goto L49;
            }
        L40:
            org.objectweb.asm.tree.analysis.BasicValue r0 = new org.objectweb.asm.tree.analysis.BasicValue
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
        L49:
            r0 = r4
            r1 = r5
            org.objectweb.asm.tree.analysis.BasicValue r0 = super.newValue(r1)
            r7 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb2
            r0 = r6
            if (r0 == 0) goto La9
            r0 = r4
            r1 = r5
            org.objectweb.asm.Type r1 = r1.getElementType()
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = 0
            r9 = r0
        L72:
            r0 = r9
            r1 = r5
            int r1 = r1.getDimensions()
            if (r0 >= r1) goto L89
            r0 = r8
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            int r9 = r9 + 1
            goto L72
        L89:
            r0 = r8
            r1 = r7
            org.objectweb.asm.Type r1 = r1.getType()
            java.lang.String r1 = r1.getDescriptor()
            java.lang.StringBuilder r0 = r0.append(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = new org.objectweb.asm.tree.analysis.BasicValue
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.toString()
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.getType(r2)
            r1.<init>(r2)
            r7 = r0
            goto Lb2
        La9:
            org.objectweb.asm.tree.analysis.BasicValue r0 = new org.objectweb.asm.tree.analysis.BasicValue
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
        Lb2:
            r0 = r7
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.BasicVerifier
    protected boolean isArrayValue(org.objectweb.asm.tree.analysis.BasicValue r4) {
            r3 = this;
            r0 = r4
            org.objectweb.asm.Type r0 = r0.getType()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L20
            r0 = r5
            int r0 = r0.getSort()
            r1 = 9
            if (r0 == r1) goto L1c
            r0 = r5
            org.objectweb.asm.Type r1 = org.objectweb.asm.tree.analysis.SimpleVerifier.NULL_TYPE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
        L1c:
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.BasicVerifier
    protected org.objectweb.asm.tree.analysis.BasicValue getElementValue(org.objectweb.asm.tree.analysis.BasicValue r5) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r4 = this;
            r0 = r5
            org.objectweb.asm.Type r0 = r0.getType()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L2e
            r0 = r6
            int r0 = r0.getSort()
            r1 = 9
            if (r0 != r1) goto L22
            r0 = r4
            r1 = r6
            java.lang.String r1 = r1.getDescriptor()
            r2 = 1
            java.lang.String r1 = r1.substring(r2)
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L22:
            r0 = r6
            org.objectweb.asm.Type r1 = org.objectweb.asm.tree.analysis.SimpleVerifier.NULL_TYPE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            r0 = r5
            return r0
        L2e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
    }

    @Override // org.objectweb.asm.tree.analysis.BasicVerifier
    protected boolean isSubTypeOf(org.objectweb.asm.tree.analysis.BasicValue r5, org.objectweb.asm.tree.analysis.BasicValue r6) {
            r4 = this;
            r0 = r6
            org.objectweb.asm.Type r0 = r0.getType()
            r7 = r0
            r0 = r5
            org.objectweb.asm.Type r0 = r0.getType()
            r8 = r0
            r0 = r7
            int r0 = r0.getSort()
            switch(r0) {
                case 5: goto L34;
                case 6: goto L34;
                case 7: goto L34;
                case 8: goto L34;
                case 9: goto L3b;
                case 10: goto L3b;
                default: goto L83;
            }
        L34:
            r0 = r8
            r1 = r7
            boolean r0 = r0.equals(r1)
            return r0
        L3b:
            r0 = r8
            org.objectweb.asm.Type r1 = org.objectweb.asm.tree.analysis.SimpleVerifier.NULL_TYPE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L48
            r0 = 1
            return r0
        L48:
            r0 = r8
            int r0 = r0.getSort()
            r1 = 10
            if (r0 == r1) goto L5c
            r0 = r8
            int r0 = r0.getSort()
            r1 = 9
            if (r0 != r1) goto L81
        L5c:
            r0 = r4
            r1 = r7
            r2 = r8
            boolean r0 = r0.isAssignableFrom(r1, r2)
            if (r0 == 0) goto L68
            r0 = 1
            return r0
        L68:
            r0 = r4
            r1 = r7
            java.lang.Class r0 = r0.getClass(r1)
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L7f
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r1 = r4
            r2 = r8
            java.lang.Class r1 = r1.getClass(r2)
            boolean r0 = r0.isAssignableFrom(r1)
            return r0
        L7f:
            r0 = 0
            return r0
        L81:
            r0 = 0
            return r0
        L83:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter
    public org.objectweb.asm.tree.analysis.BasicValue merge(org.objectweb.asm.tree.analysis.BasicValue r5, org.objectweb.asm.tree.analysis.BasicValue r6) {
            r4 = this;
            r0 = r5
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lf4
            r0 = r5
            org.objectweb.asm.Type r0 = r0.getType()
            r7 = r0
            r0 = r6
            org.objectweb.asm.Type r0 = r0.getType()
            r8 = r0
            r0 = r7
            if (r0 == 0) goto Lf0
            r0 = r7
            int r0 = r0.getSort()
            r1 = 10
            if (r0 == r1) goto L29
            r0 = r7
            int r0 = r0.getSort()
            r1 = 9
            if (r0 != r1) goto Lf0
        L29:
            r0 = r8
            if (r0 == 0) goto Lf0
            r0 = r8
            int r0 = r0.getSort()
            r1 = 10
            if (r0 == r1) goto L42
            r0 = r8
            int r0 = r0.getSort()
            r1 = 9
            if (r0 != r1) goto Lf0
        L42:
            r0 = r7
            org.objectweb.asm.Type r1 = org.objectweb.asm.tree.analysis.SimpleVerifier.NULL_TYPE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4e
            r0 = r6
            return r0
        L4e:
            r0 = r8
            org.objectweb.asm.Type r1 = org.objectweb.asm.tree.analysis.SimpleVerifier.NULL_TYPE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5b
            r0 = r5
            return r0
        L5b:
            r0 = r4
            r1 = r7
            r2 = r8
            boolean r0 = r0.isAssignableFrom(r1, r2)
            if (r0 == 0) goto L67
            r0 = r5
            return r0
        L67:
            r0 = r4
            r1 = r8
            r2 = r7
            boolean r0 = r0.isAssignableFrom(r1, r2)
            if (r0 == 0) goto L73
            r0 = r6
            return r0
        L73:
            r0 = 0
            r9 = r0
            r0 = r7
            int r0 = r0.getSort()
            r1 = 9
            if (r0 != r1) goto Lc0
            r0 = r8
            int r0 = r0.getSort()
            r1 = 9
            if (r0 != r1) goto Lc0
            r0 = r7
            int r0 = r0.getDimensions()
            r1 = r8
            int r1 = r1.getDimensions()
            if (r0 != r1) goto Lc0
            r0 = r7
            org.objectweb.asm.Type r0 = r0.getElementType()
            int r0 = r0.getSort()
            r1 = 10
            if (r0 != r1) goto Lc0
            r0 = r8
            org.objectweb.asm.Type r0 = r0.getElementType()
            int r0 = r0.getSort()
            r1 = 10
            if (r0 != r1) goto Lc0
            r0 = r7
            int r0 = r0.getDimensions()
            r9 = r0
            r0 = r7
            org.objectweb.asm.Type r0 = r0.getElementType()
            r7 = r0
            r0 = r8
            org.objectweb.asm.Type r0 = r0.getElementType()
            r8 = r0
        Lc0:
            r0 = r7
            if (r0 == 0) goto Lcc
            r0 = r4
            r1 = r7
            boolean r0 = r0.isInterface(r1)
            if (r0 == 0) goto Ld8
        Lcc:
            r0 = r4
            java.lang.String r1 = "java/lang/Object"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getObjectType(r1)
            r2 = r9
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newArrayValue(r1, r2)
            return r0
        Ld8:
            r0 = r4
            r1 = r7
            org.objectweb.asm.Type r0 = r0.getSuperClass(r1)
            r7 = r0
            r0 = r4
            r1 = r7
            r2 = r8
            boolean r0 = r0.isAssignableFrom(r1, r2)
            if (r0 == 0) goto Lc0
            r0 = r4
            r1 = r7
            r2 = r9
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newArrayValue(r1, r2)
            return r0
        Lf0:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.UNINITIALIZED_VALUE
            return r0
        Lf4:
            r0 = r5
            return r0
    }

    private org.objectweb.asm.tree.analysis.BasicValue newArrayValue(org.objectweb.asm.Type r4, int r5) {
            r3 = this;
            r0 = r5
            if (r0 != 0) goto La
            r0 = r3
            r1 = r4
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = 0
            r7 = r0
        L15:
            r0 = r7
            r1 = r5
            if (r0 >= r1) goto L28
            r0 = r6
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            int r7 = r7 + 1
            goto L15
        L28:
            r0 = r6
            r1 = r4
            java.lang.String r1 = r1.getDescriptor()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            r1 = r6
            java.lang.String r1 = r1.toString()
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
    }

    protected boolean isInterface(org.objectweb.asm.Type r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.Type r0 = r0.currentClass
            if (r0 == 0) goto L17
            r0 = r3
            org.objectweb.asm.Type r0 = r0.currentClass
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L17
            r0 = r3
            boolean r0 = r0.isInterface
            return r0
        L17:
            r0 = r3
            r1 = r4
            java.lang.Class r0 = r0.getClass(r1)
            boolean r0 = r0.isInterface()
            return r0
    }

    protected org.objectweb.asm.Type getSuperClass(org.objectweb.asm.Type r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.Type r0 = r0.currentClass
            if (r0 == 0) goto L17
            r0 = r3
            org.objectweb.asm.Type r0 = r0.currentClass
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L17
            r0 = r3
            org.objectweb.asm.Type r0 = r0.currentSuperClass
            return r0
        L17:
            r0 = r3
            r1 = r4
            java.lang.Class r0 = r0.getClass(r1)
            java.lang.Class r0 = r0.getSuperclass()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L28
            r0 = 0
            goto L2c
        L28:
            r0 = r5
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getType(r0)
        L2c:
            return r0
    }

    protected boolean isAssignableFrom(org.objectweb.asm.Type r6, org.objectweb.asm.Type r7) {
            r5 = this;
            r0 = r6
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = r5
            org.objectweb.asm.Type r0 = r0.currentClass
            if (r0 == 0) goto L50
            r0 = r5
            org.objectweb.asm.Type r0 = r0.currentClass
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L50
            r0 = r5
            r1 = r7
            org.objectweb.asm.Type r0 = r0.getSuperClass(r1)
            if (r0 != 0) goto L26
            r0 = 0
            return r0
        L26:
            r0 = r5
            boolean r0 = r0.isInterface
            if (r0 == 0) goto L45
            r0 = r7
            int r0 = r0.getSort()
            r1 = 10
            if (r0 == r1) goto L3f
            r0 = r7
            int r0 = r0.getSort()
            r1 = 9
            if (r0 != r1) goto L43
        L3f:
            r0 = 1
            goto L44
        L43:
            r0 = 0
        L44:
            return r0
        L45:
            r0 = r5
            r1 = r6
            r2 = r5
            r3 = r7
            org.objectweb.asm.Type r2 = r2.getSuperClass(r3)
            boolean r0 = r0.isAssignableFrom(r1, r2)
            return r0
        L50:
            r0 = r5
            org.objectweb.asm.Type r0 = r0.currentClass
            if (r0 == 0) goto La6
            r0 = r5
            org.objectweb.asm.Type r0 = r0.currentClass
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La6
            r0 = r5
            r1 = r6
            r2 = r5
            org.objectweb.asm.Type r2 = r2.currentSuperClass
            boolean r0 = r0.isAssignableFrom(r1, r2)
            if (r0 == 0) goto L70
            r0 = 1
            return r0
        L70:
            r0 = r5
            java.util.List<org.objectweb.asm.Type> r0 = r0.currentClassInterfaces
            if (r0 == 0) goto La4
            r0 = r5
            java.util.List<org.objectweb.asm.Type> r0 = r0.currentClassInterfaces
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L81:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto La4
            r0 = r8
            java.lang.Object r0 = r0.next()
            org.objectweb.asm.Type r0 = (org.objectweb.asm.Type) r0
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            boolean r0 = r0.isAssignableFrom(r1, r2)
            if (r0 == 0) goto La1
            r0 = 1
            return r0
        La1:
            goto L81
        La4:
            r0 = 0
            return r0
        La6:
            r0 = r5
            r1 = r6
            java.lang.Class r0 = r0.getClass(r1)
            r1 = r5
            r2 = r7
            java.lang.Class r1 = r1.getClass(r2)
            boolean r0 = r0.isAssignableFrom(r1)
            return r0
    }

    protected java.lang.Class<?> getClass(org.objectweb.asm.Type r6) {
            r5 = this;
            r0 = r6
            int r0 = r0.getSort()     // Catch: java.lang.ClassNotFoundException -> L2a
            r1 = 9
            if (r0 != r1) goto L1d
            r0 = r6
            java.lang.String r0 = r0.getDescriptor()     // Catch: java.lang.ClassNotFoundException -> L2a
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L2a
            r1 = 0
            r2 = r5
            java.lang.ClassLoader r2 = r2.loader     // Catch: java.lang.ClassNotFoundException -> L2a
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L2a
            return r0
        L1d:
            r0 = r6
            java.lang.String r0 = r0.getClassName()     // Catch: java.lang.ClassNotFoundException -> L2a
            r1 = 0
            r2 = r5
            java.lang.ClassLoader r2 = r2.loader     // Catch: java.lang.ClassNotFoundException -> L2a
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L2a
            return r0
        L2a:
            r7 = move-exception
            java.lang.TypeNotPresentException r0 = new java.lang.TypeNotPresentException
            r1 = r0
            r2 = r7
            java.lang.String r2 = r2.toString()
            r3 = r7
            r1.<init>(r2, r3)
            throw r0
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value merge(org.objectweb.asm.tree.analysis.Value r5, org.objectweb.asm.tree.analysis.Value r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.objectweb.asm.tree.analysis.BasicValue r1 = (org.objectweb.asm.tree.analysis.BasicValue) r1
            r2 = r6
            org.objectweb.asm.tree.analysis.BasicValue r2 = (org.objectweb.asm.tree.analysis.BasicValue) r2
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.merge(r1, r2)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value newValue(org.objectweb.asm.Type r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
    }
}
