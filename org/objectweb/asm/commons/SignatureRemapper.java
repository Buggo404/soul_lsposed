package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/SignatureRemapper.SCL.lombok */
public class SignatureRemapper extends org.objectweb.asm.signature.SignatureVisitor {
    private final org.objectweb.asm.signature.SignatureVisitor signatureVisitor;
    private final org.objectweb.asm.commons.Remapper remapper;
    private java.util.ArrayList<java.lang.String> classNames;

    public SignatureRemapper(org.objectweb.asm.signature.SignatureVisitor r6, org.objectweb.asm.commons.Remapper r7) {
            r5 = this;
            r0 = r5
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r6
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    protected SignatureRemapper(int r5, org.objectweb.asm.signature.SignatureVisitor r6, org.objectweb.asm.commons.Remapper r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.classNames = r1
            r0 = r4
            r1 = r6
            r0.signatureVisitor = r1
            r0 = r4
            r1 = r7
            r0.remapper = r1
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitClassType(java.lang.String r5) {
            r4 = this;
            r0 = r4
            java.util.ArrayList<java.lang.String> r0 = r0.classNames
            r1 = r5
            boolean r0 = r0.add(r1)
            r0 = r4
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.signatureVisitor
            r1 = r4
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r5
            java.lang.String r1 = r1.mapType(r2)
            r0.visitClassType(r1)
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitInnerClassType(java.lang.String r5) {
            r4 = this;
            r0 = r4
            java.util.ArrayList<java.lang.String> r0 = r0.classNames
            r1 = r4
            java.util.ArrayList<java.lang.String> r1 = r1.classNames
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.remove(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 36
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7 = r0
            r0 = r4
            java.util.ArrayList<java.lang.String> r0 = r0.classNames
            r1 = r7
            boolean r0 = r0.add(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r6
            java.lang.String r1 = r1.mapType(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 36
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8 = r0
            r0 = r4
            org.objectweb.asm.commons.Remapper r0 = r0.remapper
            r1 = r7
            java.lang.String r0 = r0.mapType(r1)
            r9 = r0
            r0 = r9
            r1 = r8
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L6d
            r0 = r8
            int r0 = r0.length()
            goto L76
        L6d:
            r0 = r9
            r1 = 36
            int r0 = r0.lastIndexOf(r1)
            r1 = 1
            int r0 = r0 + r1
        L76:
            r10 = r0
            r0 = r4
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.signatureVisitor
            r1 = r9
            r2 = r10
            java.lang.String r1 = r1.substring(r2)
            r0.visitInnerClassType(r1)
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitFormalTypeParameter(java.lang.String r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.signatureVisitor
            r1 = r4
            r0.visitFormalTypeParameter(r1)
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeVariable(java.lang.String r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.signatureVisitor
            r1 = r4
            r0.visitTypeVariable(r1)
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitArrayType() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.signatureVisitor
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.visitArrayType()
            r0 = r2
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitBaseType(char r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.signatureVisitor
            r1 = r4
            r0.visitBaseType(r1)
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitClassBound() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.signatureVisitor
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.visitClassBound()
            r0 = r2
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitExceptionType() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.signatureVisitor
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.visitExceptionType()
            r0 = r2
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitInterface() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.signatureVisitor
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.visitInterface()
            r0 = r2
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitInterfaceBound() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.signatureVisitor
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.visitInterfaceBound()
            r0 = r2
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitParameterType() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.signatureVisitor
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.visitParameterType()
            r0 = r2
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitReturnType() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.signatureVisitor
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.visitReturnType()
            r0 = r2
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitSuperclass() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.signatureVisitor
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.visitSuperclass()
            r0 = r2
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeArgument() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.signatureVisitor
            r0.visitTypeArgument()
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitTypeArgument(char r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.signatureVisitor
            r1 = r4
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.visitTypeArgument(r1)
            r0 = r3
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitEnd() {
            r4 = this;
            r0 = r4
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.signatureVisitor
            r0.visitEnd()
            r0 = r4
            java.util.ArrayList<java.lang.String> r0 = r0.classNames
            r1 = r4
            java.util.ArrayList<java.lang.String> r1 = r1.classNames
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.remove(r1)
            return
    }
}
