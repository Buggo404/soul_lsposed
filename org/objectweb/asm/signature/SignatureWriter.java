package org.objectweb.asm.signature;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/signature/SignatureWriter.SCL.lombok */
public class SignatureWriter extends org.objectweb.asm.signature.SignatureVisitor {
    private final java.lang.StringBuilder stringBuilder;
    private boolean hasFormals;
    private boolean hasParameters;
    private int argumentStack;

    public SignatureWriter() {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r0.<init>(r1)
            return
    }

    private SignatureWriter(java.lang.StringBuilder r4) {
            r3 = this;
            r0 = r3
            r1 = 589824(0x90000, float:8.2652E-40)
            r0.<init>(r1)
            r0 = r3
            r1 = 1
            r0.argumentStack = r1
            r0 = r3
            r1 = r4
            r0.stringBuilder = r1
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitFormalTypeParameter(java.lang.String r4) {
            r3 = this;
            r0 = r3
            boolean r0 = r0.hasFormals
            if (r0 != 0) goto L16
            r0 = r3
            r1 = 1
            r0.hasFormals = r1
            r0 = r3
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 60
            java.lang.StringBuilder r0 = r0.append(r1)
        L16:
            r0 = r3
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 58
            java.lang.StringBuilder r0 = r0.append(r1)
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitClassBound() {
            r2 = this;
            r0 = r2
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitInterfaceBound() {
            r3 = this;
            r0 = r3
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 58
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitSuperclass() {
            r2 = this;
            r0 = r2
            r0.endFormals()
            r0 = r2
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitInterface() {
            r2 = this;
            r0 = r2
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitParameterType() {
            r3 = this;
            r0 = r3
            r0.endFormals()
            r0 = r3
            boolean r0 = r0.hasParameters
            if (r0 != 0) goto L1a
            r0 = r3
            r1 = 1
            r0.hasParameters = r1
            r0 = r3
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
        L1a:
            r0 = r3
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitReturnType() {
            r3 = this;
            r0 = r3
            r0.endFormals()
            r0 = r3
            boolean r0 = r0.hasParameters
            if (r0 != 0) goto L15
            r0 = r3
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
        L15:
            r0 = r3
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitExceptionType() {
            r3 = this;
            r0 = r3
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 94
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitBaseType(char r4) {
            r3 = this;
            r0 = r3
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeVariable(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 84
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitArrayType() {
            r3 = this;
            r0 = r3
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitClassType(java.lang.String r5) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r0
            int r1 = r1.argumentStack
            r2 = 1
            int r1 = r1 << r2
            r0.argumentStack = r1
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitInnerClassType(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r0.endArguments()
            r0 = r4
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r0
            int r1 = r1.argumentStack
            r2 = 1
            int r1 = r1 << r2
            r0.argumentStack = r1
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeArgument() {
            r4 = this;
            r0 = r4
            int r0 = r0.argumentStack
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L1d
            r0 = r4
            r1 = r0
            int r1 = r1.argumentStack
            r2 = 1
            r1 = r1 | r2
            r0.argumentStack = r1
            r0 = r4
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 60
            java.lang.StringBuilder r0 = r0.append(r1)
        L1d:
            r0 = r4
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 42
            java.lang.StringBuilder r0 = r0.append(r1)
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitTypeArgument(char r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.argumentStack
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L1d
            r0 = r4
            r1 = r0
            int r1 = r1.argumentStack
            r2 = 1
            r1 = r1 | r2
            r0.argumentStack = r1
            r0 = r4
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 60
            java.lang.StringBuilder r0 = r0.append(r1)
        L1d:
            r0 = r5
            r1 = 61
            if (r0 == r1) goto L2c
            r0 = r4
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
        L2c:
            r0 = r4
            int r0 = r0.argumentStack
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 != 0) goto L3a
            r0 = r4
            goto L45
        L3a:
            org.objectweb.asm.signature.SignatureWriter r0 = new org.objectweb.asm.signature.SignatureWriter
            r1 = r0
            r2 = r4
            java.lang.StringBuilder r2 = r2.stringBuilder
            r1.<init>(r2)
        L45:
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitEnd() {
            r3 = this;
            r0 = r3
            r0.endArguments()
            r0 = r3
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.lang.StringBuilder r0 = r0.stringBuilder
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void endFormals() {
            r3 = this;
            r0 = r3
            boolean r0 = r0.hasFormals
            if (r0 == 0) goto L16
            r0 = r3
            r1 = 0
            r0.hasFormals = r1
            r0 = r3
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 62
            java.lang.StringBuilder r0 = r0.append(r1)
        L16:
            return
    }

    private void endArguments() {
            r4 = this;
            r0 = r4
            int r0 = r0.argumentStack
            r1 = 1
            r0 = r0 & r1
            r1 = 1
            if (r0 != r1) goto L14
            r0 = r4
            java.lang.StringBuilder r0 = r0.stringBuilder
            r1 = 62
            java.lang.StringBuilder r0 = r0.append(r1)
        L14:
            r0 = r4
            r1 = r0
            int r1 = r1.argumentStack
            r2 = 1
            int r1 = r1 >>> r2
            r0.argumentStack = r1
            return
    }
}
