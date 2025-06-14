package org.objectweb.asm.signature;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/signature/SignatureVisitor.SCL.lombok */
public abstract class SignatureVisitor {
    public static final char EXTENDS = '+';
    public static final char SUPER = '-';
    public static final char INSTANCEOF = '=';
    protected final int api;

    protected SignatureVisitor(int r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r6
            r1 = 589824(0x90000, float:8.2652E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 458752(0x70000, float:6.42848E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 17432576(0x10a0000, float:2.5346597E-38)
            if (r0 == r1) goto L49
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Unsupported api "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L49:
            r0 = r5
            r1 = r6
            r0.api = r1
            return
    }

    public void visitFormalTypeParameter(java.lang.String r2) {
            r1 = this;
            return
    }

    public org.objectweb.asm.signature.SignatureVisitor visitClassBound() {
            r2 = this;
            r0 = r2
            return r0
    }

    public org.objectweb.asm.signature.SignatureVisitor visitInterfaceBound() {
            r2 = this;
            r0 = r2
            return r0
    }

    public org.objectweb.asm.signature.SignatureVisitor visitSuperclass() {
            r2 = this;
            r0 = r2
            return r0
    }

    public org.objectweb.asm.signature.SignatureVisitor visitInterface() {
            r2 = this;
            r0 = r2
            return r0
    }

    public org.objectweb.asm.signature.SignatureVisitor visitParameterType() {
            r2 = this;
            r0 = r2
            return r0
    }

    public org.objectweb.asm.signature.SignatureVisitor visitReturnType() {
            r2 = this;
            r0 = r2
            return r0
    }

    public org.objectweb.asm.signature.SignatureVisitor visitExceptionType() {
            r2 = this;
            r0 = r2
            return r0
    }

    public void visitBaseType(char r2) {
            r1 = this;
            return
    }

    public void visitTypeVariable(java.lang.String r2) {
            r1 = this;
            return
    }

    public org.objectweb.asm.signature.SignatureVisitor visitArrayType() {
            r2 = this;
            r0 = r2
            return r0
    }

    public void visitClassType(java.lang.String r2) {
            r1 = this;
            return
    }

    public void visitInnerClassType(java.lang.String r2) {
            r1 = this;
            return
    }

    public void visitTypeArgument() {
            r1 = this;
            return
    }

    public org.objectweb.asm.signature.SignatureVisitor visitTypeArgument(char r3) {
            r2 = this;
            r0 = r2
            return r0
    }

    public void visitEnd() {
            r1 = this;
            return
    }
}
