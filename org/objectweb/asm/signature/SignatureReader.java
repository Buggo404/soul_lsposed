package org.objectweb.asm.signature;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/signature/SignatureReader.SCL.lombok */
public class SignatureReader {
    private final java.lang.String signatureValue;

    public SignatureReader(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.signatureValue = r1
            return
    }

    public void accept(org.objectweb.asm.signature.SignatureVisitor r6) {
            r5 = this;
            r0 = r5
            java.lang.String r0 = r0.signatureValue
            r7 = r0
            r0 = r7
            int r0 = r0.length()
            r8 = r0
            r0 = r7
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 60
            if (r0 != r1) goto L88
            r0 = 2
            r9 = r0
        L17:
            r0 = r7
            r1 = 58
            r2 = r9
            int r0 = r0.indexOf(r1, r2)
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = 1
            int r2 = r2 - r3
            r3 = r11
            java.lang.String r1 = r1.substring(r2, r3)
            r0.visitFormalTypeParameter(r1)
            r0 = r11
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
            r0 = r7
            r1 = r9
            char r0 = r0.charAt(r1)
            r10 = r0
            r0 = r10
            r1 = 76
            if (r0 == r1) goto L52
            r0 = r10
            r1 = 91
            if (r0 == r1) goto L52
            r0 = r10
            r1 = 84
            if (r0 != r1) goto L5e
        L52:
            r0 = r7
            r1 = r9
            r2 = r6
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitClassBound()
            int r0 = parseType(r0, r1, r2)
            r9 = r0
        L5e:
            r0 = r7
            r1 = r9
            int r9 = r9 + 1
            char r0 = r0.charAt(r1)
            r1 = r0
            r10 = r1
            r1 = 58
            if (r0 != r1) goto L7e
            r0 = r7
            r1 = r9
            r2 = r6
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitInterfaceBound()
            int r0 = parseType(r0, r1, r2)
            r9 = r0
            goto L5e
        L7e:
            r0 = r10
            r1 = 62
            if (r0 != r1) goto L17
            goto L8b
        L88:
            r0 = 0
            r9 = r0
        L8b:
            r0 = r7
            r1 = r9
            char r0 = r0.charAt(r1)
            r1 = 40
            if (r0 != r1) goto Ld8
            int r9 = r9 + 1
        L99:
            r0 = r7
            r1 = r9
            char r0 = r0.charAt(r1)
            r1 = 41
            if (r0 == r1) goto Lb3
            r0 = r7
            r1 = r9
            r2 = r6
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitParameterType()
            int r0 = parseType(r0, r1, r2)
            r9 = r0
            goto L99
        Lb3:
            r0 = r7
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            r2 = r6
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitReturnType()
            int r0 = parseType(r0, r1, r2)
            r9 = r0
        Lc1:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto Lf9
            r0 = r7
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            r2 = r6
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitExceptionType()
            int r0 = parseType(r0, r1, r2)
            r9 = r0
            goto Lc1
        Ld8:
            r0 = r7
            r1 = r9
            r2 = r6
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitSuperclass()
            int r0 = parseType(r0, r1, r2)
            r9 = r0
        Le4:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto Lf9
            r0 = r7
            r1 = r9
            r2 = r6
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitInterface()
            int r0 = parseType(r0, r1, r2)
            r9 = r0
            goto Le4
        Lf9:
            return
    }

    public void acceptType(org.objectweb.asm.signature.SignatureVisitor r5) {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.signatureValue
            r1 = 0
            r2 = r5
            int r0 = parseType(r0, r1, r2)
            return
    }

    private static int parseType(java.lang.String r5, int r6, org.objectweb.asm.signature.SignatureVisitor r7) {
            r0 = r6
            r8 = r0
            r0 = r5
            r1 = r8
            int r8 = r8 + 1
            char r0 = r0.charAt(r1)
            r9 = r0
            r0 = r9
            switch(r0) {
                case 66: goto L84;
                case 67: goto L84;
                case 68: goto L84;
                case 69: goto L193;
                case 70: goto L84;
                case 71: goto L193;
                case 72: goto L193;
                case 73: goto L84;
                case 74: goto L84;
                case 75: goto L193;
                case 76: goto Laf;
                case 77: goto L193;
                case 78: goto L193;
                case 79: goto L193;
                case 80: goto L193;
                case 81: goto L193;
                case 82: goto L193;
                case 83: goto L84;
                case 84: goto L96;
                case 85: goto L193;
                case 86: goto L84;
                case 87: goto L193;
                case 88: goto L193;
                case 89: goto L193;
                case 90: goto L84;
                case 91: goto L8c;
                default: goto L193;
            }
        L84:
            r0 = r7
            r1 = r9
            r0.visitBaseType(r1)
            r0 = r8
            return r0
        L8c:
            r0 = r5
            r1 = r8
            r2 = r7
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitArrayType()
            int r0 = parseType(r0, r1, r2)
            return r0
        L96:
            r0 = r5
            r1 = 59
            r2 = r8
            int r0 = r0.indexOf(r1, r2)
            r10 = r0
            r0 = r7
            r1 = r5
            r2 = r8
            r3 = r10
            java.lang.String r1 = r1.substring(r2, r3)
            r0.visitTypeVariable(r1)
            r0 = r10
            r1 = 1
            int r0 = r0 + r1
            return r0
        Laf:
            r0 = r8
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = 0
            r13 = r0
        Lb8:
            r0 = r5
            r1 = r8
            int r8 = r8 + 1
            char r0 = r0.charAt(r1)
            r9 = r0
            r0 = r9
            r1 = 46
            if (r0 == r1) goto Ld0
            r0 = r9
            r1 = 59
            if (r0 != r1) goto L10e
        Ld0:
            r0 = r12
            if (r0 != 0) goto Lf4
            r0 = r5
            r1 = r11
            r2 = r8
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r14 = r0
            r0 = r13
            if (r0 == 0) goto Lee
            r0 = r7
            r1 = r14
            r0.visitInnerClassType(r1)
            goto Lf4
        Lee:
            r0 = r7
            r1 = r14
            r0.visitClassType(r1)
        Lf4:
            r0 = r9
            r1 = 59
            if (r0 != r1) goto L102
            r0 = r7
            r0.visitEnd()
            goto L191
        L102:
            r0 = r8
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = 1
            r13 = r0
            goto Lb8
        L10e:
            r0 = r9
            r1 = 60
            if (r0 != r1) goto Lb8
            r0 = r5
            r1 = r11
            r2 = r8
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r14 = r0
            r0 = r13
            if (r0 == 0) goto L12e
            r0 = r7
            r1 = r14
            r0.visitInnerClassType(r1)
            goto L134
        L12e:
            r0 = r7
            r1 = r14
            r0.visitClassType(r1)
        L134:
            r0 = 1
            r12 = r0
        L137:
            r0 = r5
            r1 = r8
            char r0 = r0.charAt(r1)
            r1 = r0
            r9 = r1
            r1 = 62
            if (r0 == r1) goto L18e
            r0 = r9
            switch(r0) {
                case 42: goto L164;
                case 43: goto L16e;
                case 44: goto L17f;
                case 45: goto L16e;
                default: goto L17f;
            }
        L164:
            int r8 = r8 + 1
            r0 = r7
            r0.visitTypeArgument()
            goto L137
        L16e:
            r0 = r5
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            r2 = r7
            r3 = r9
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitTypeArgument(r3)
            int r0 = parseType(r0, r1, r2)
            r8 = r0
            goto L137
        L17f:
            r0 = r5
            r1 = r8
            r2 = r7
            r3 = 61
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitTypeArgument(r3)
            int r0 = parseType(r0, r1, r2)
            r8 = r0
            goto L137
        L18e:
            goto Lb8
        L191:
            r0 = r8
            return r0
        L193:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
    }
}
