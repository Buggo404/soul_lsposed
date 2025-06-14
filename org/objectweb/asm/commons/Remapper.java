package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/Remapper.SCL.lombok */
public abstract class Remapper {
    public Remapper() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public java.lang.String mapDesc(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.Type r0 = r0.mapType(r1)
            java.lang.String r0 = r0.getDescriptor()
            return r0
    }

    private org.objectweb.asm.Type mapType(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r5
            int r0 = r0.getSort()
            switch(r0) {
                case 9: goto L20;
                case 10: goto L57;
                case 11: goto L6d;
                default: goto L79;
            }
        L20:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = 0
            r7 = r0
        L2a:
            r0 = r7
            r1 = r5
            int r1 = r1.getDimensions()
            if (r0 >= r1) goto L3f
            r0 = r6
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            int r7 = r7 + 1
            goto L2a
        L3f:
            r0 = r6
            r1 = r4
            r2 = r5
            org.objectweb.asm.Type r2 = r2.getElementType()
            org.objectweb.asm.Type r1 = r1.mapType(r2)
            java.lang.String r1 = r1.getDescriptor()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r0 = r0.toString()
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getType(r0)
            return r0
        L57:
            r0 = r4
            r1 = r5
            java.lang.String r1 = r1.getInternalName()
            java.lang.String r0 = r0.map(r1)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L6b
            r0 = r7
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            goto L6c
        L6b:
            r0 = r5
        L6c:
            return r0
        L6d:
            r0 = r4
            r1 = r5
            java.lang.String r1 = r1.getDescriptor()
            java.lang.String r0 = r0.mapMethodDesc(r1)
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getMethodType(r0)
            return r0
        L79:
            r0 = r5
            return r0
    }

    public java.lang.String mapType(java.lang.String r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r3
            r1 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getObjectType(r1)
            org.objectweb.asm.Type r0 = r0.mapType(r1)
            java.lang.String r0 = r0.getInternalName()
            return r0
    }

    public java.lang.String[] mapTypes(java.lang.String[] r5) {
            r4 = this;
            r0 = 0
            r6 = r0
            r0 = 0
            r7 = r0
        L4:
            r0 = r7
            r1 = r5
            int r1 = r1.length
            if (r0 >= r1) goto L33
            r0 = r5
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r4
            r1 = r8
            java.lang.String r0 = r0.mapType(r1)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L2d
            r0 = r6
            if (r0 != 0) goto L28
            r0 = r5
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            r6 = r0
        L28:
            r0 = r6
            r1 = r7
            r2 = r9
            r0[r1] = r2
        L2d:
            int r7 = r7 + 1
            goto L4
        L33:
            r0 = r6
            if (r0 == 0) goto L3b
            r0 = r6
            goto L3c
        L3b:
            r0 = r5
        L3c:
            return r0
    }

    public java.lang.String mapMethodDesc(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "()V"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            r0 = r5
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "("
            r1.<init>(r2)
            r6 = r0
            r0 = r5
            org.objectweb.asm.Type[] r0 = org.objectweb.asm.Type.getArgumentTypes(r0)
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L21:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L42
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r6
            r1 = r4
            r2 = r10
            org.objectweb.asm.Type r1 = r1.mapType(r2)
            java.lang.String r1 = r1.getDescriptor()
            java.lang.StringBuilder r0 = r0.append(r1)
            int r9 = r9 + 1
            goto L21
        L42:
            r0 = r5
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getReturnType(r0)
            r7 = r0
            r0 = r7
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.VOID_TYPE
            if (r0 != r1) goto L58
            r0 = r6
            java.lang.String r1 = ")V"
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L6a
        L58:
            r0 = r6
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            r2 = r7
            org.objectweb.asm.Type r1 = r1.mapType(r2)
            java.lang.String r1 = r1.getDescriptor()
            java.lang.StringBuilder r0 = r0.append(r1)
        L6a:
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.Object mapValue(java.lang.Object r10) {
            r9 = this;
            r0 = r10
            boolean r0 = r0 instanceof org.objectweb.asm.Type
            if (r0 == 0) goto L10
            r0 = r9
            r1 = r10
            org.objectweb.asm.Type r1 = (org.objectweb.asm.Type) r1
            org.objectweb.asm.Type r0 = r0.mapType(r1)
            return r0
        L10:
            r0 = r10
            boolean r0 = r0 instanceof org.objectweb.asm.Handle
            if (r0 == 0) goto L80
            r0 = r10
            org.objectweb.asm.Handle r0 = (org.objectweb.asm.Handle) r0
            r11 = r0
            r0 = r11
            int r0 = r0.getTag()
            r1 = 4
            if (r0 > r1) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            r12 = r0
            org.objectweb.asm.Handle r0 = new org.objectweb.asm.Handle
            r1 = r0
            r2 = r11
            int r2 = r2.getTag()
            r3 = r9
            r4 = r11
            java.lang.String r4 = r4.getOwner()
            java.lang.String r3 = r3.mapType(r4)
            r4 = r12
            if (r4 == 0) goto L51
            r4 = r9
            r5 = r11
            java.lang.String r5 = r5.getOwner()
            r6 = r11
            java.lang.String r6 = r6.getName()
            r7 = r11
            java.lang.String r7 = r7.getDesc()
            java.lang.String r4 = r4.mapFieldName(r5, r6, r7)
            goto L61
        L51:
            r4 = r9
            r5 = r11
            java.lang.String r5 = r5.getOwner()
            r6 = r11
            java.lang.String r6 = r6.getName()
            r7 = r11
            java.lang.String r7 = r7.getDesc()
            java.lang.String r4 = r4.mapMethodName(r5, r6, r7)
        L61:
            r5 = r12
            if (r5 == 0) goto L70
            r5 = r9
            r6 = r11
            java.lang.String r6 = r6.getDesc()
            java.lang.String r5 = r5.mapDesc(r6)
            goto L78
        L70:
            r5 = r9
            r6 = r11
            java.lang.String r6 = r6.getDesc()
            java.lang.String r5 = r5.mapMethodDesc(r6)
        L78:
            r6 = r11
            boolean r6 = r6.isInterface()
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L80:
            r0 = r10
            boolean r0 = r0 instanceof org.objectweb.asm.ConstantDynamic
            if (r0 == 0) goto Le0
            r0 = r10
            org.objectweb.asm.ConstantDynamic r0 = (org.objectweb.asm.ConstantDynamic) r0
            r11 = r0
            r0 = r11
            int r0 = r0.getBootstrapMethodArgumentCount()
            r12 = r0
            r0 = r12
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r13 = r0
            r0 = 0
            r14 = r0
        L9a:
            r0 = r14
            r1 = r12
            if (r0 >= r1) goto Lb5
            r0 = r13
            r1 = r14
            r2 = r9
            r3 = r11
            r4 = r14
            java.lang.Object r3 = r3.getBootstrapMethodArgument(r4)
            java.lang.Object r2 = r2.mapValue(r3)
            r0[r1] = r2
            int r14 = r14 + 1
            goto L9a
        Lb5:
            r0 = r11
            java.lang.String r0 = r0.getDescriptor()
            r14 = r0
            org.objectweb.asm.ConstantDynamic r0 = new org.objectweb.asm.ConstantDynamic
            r1 = r0
            r2 = r9
            r3 = r11
            java.lang.String r3 = r3.getName()
            r4 = r14
            java.lang.String r2 = r2.mapInvokeDynamicMethodName(r3, r4)
            r3 = r9
            r4 = r14
            java.lang.String r3 = r3.mapDesc(r4)
            r4 = r9
            r5 = r11
            org.objectweb.asm.Handle r5 = r5.getBootstrapMethod()
            java.lang.Object r4 = r4.mapValue(r5)
            org.objectweb.asm.Handle r4 = (org.objectweb.asm.Handle) r4
            r5 = r13
            r1.<init>(r2, r3, r4, r5)
            return r0
        Le0:
            r0 = r10
            return r0
    }

    public java.lang.String mapSignature(java.lang.String r5, boolean r6) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            org.objectweb.asm.signature.SignatureReader r0 = new org.objectweb.asm.signature.SignatureReader
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            org.objectweb.asm.signature.SignatureWriter r0 = new org.objectweb.asm.signature.SignatureWriter
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r4
            r1 = r8
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.createSignatureRemapper(r1)
            r9 = r0
            r0 = r6
            if (r0 == 0) goto L2d
            r0 = r7
            r1 = r9
            r0.acceptType(r1)
            goto L33
        L2d:
            r0 = r7
            r1 = r9
            r0.accept(r1)
        L33:
            r0 = r8
            java.lang.String r0 = r0.toString()
            return r0
    }

    @java.lang.Deprecated
    protected org.objectweb.asm.signature.SignatureVisitor createRemappingSignatureAdapter(org.objectweb.asm.signature.SignatureVisitor r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.objectweb.asm.signature.SignatureVisitor r0 = r0.createSignatureRemapper(r1)
            return r0
    }

    protected org.objectweb.asm.signature.SignatureVisitor createSignatureRemapper(org.objectweb.asm.signature.SignatureVisitor r6) {
            r5 = this;
            org.objectweb.asm.commons.SignatureRemapper r0 = new org.objectweb.asm.commons.SignatureRemapper
            r1 = r0
            r2 = r6
            r3 = r5
            r1.<init>(r2, r3)
            return r0
    }

    public java.lang.String mapAnnotationAttributeName(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = r4
            return r0
    }

    public java.lang.String mapInnerClassName(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.String r0 = r0.mapType(r1)
            r8 = r0
            r0 = r8
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L12
            r0 = r7
            return r0
        L12:
            r0 = r5
            r1 = 47
            int r0 = r0.lastIndexOf(r1)
            r9 = r0
            r0 = r8
            r1 = 47
            int r0 = r0.lastIndexOf(r1)
            r10 = r0
            r0 = r9
            r1 = -1
            if (r0 == r1) goto L44
            r0 = r10
            r1 = -1
            if (r0 == r1) goto L44
            r0 = r5
            r1 = r9
            java.lang.String r0 = r0.substring(r1)
            r1 = r8
            r2 = r10
            java.lang.String r1 = r1.substring(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            r0 = r7
            return r0
        L44:
            r0 = r8
            java.lang.String r1 = "$"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L7e
            r0 = r8
            r1 = 36
            int r0 = r0.lastIndexOf(r1)
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
        L59:
            r0 = r9
            r1 = r8
            int r1 = r1.length()
            if (r0 >= r1) goto L76
            r0 = r8
            r1 = r9
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L76
            int r9 = r9 + 1
            goto L59
        L76:
            r0 = r8
            r1 = r9
            java.lang.String r0 = r0.substring(r1)
            return r0
        L7e:
            r0 = r7
            return r0
    }

    public java.lang.String mapMethodName(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r0 = r4
            return r0
    }

    public java.lang.String mapInvokeDynamicMethodName(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = r3
            return r0
    }

    public java.lang.String mapRecordComponentName(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r0 = r4
            return r0
    }

    public java.lang.String mapFieldName(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r0 = r4
            return r0
    }

    public java.lang.String mapPackageName(java.lang.String r3) {
            r2 = this;
            r0 = r3
            return r0
    }

    public java.lang.String mapModuleName(java.lang.String r3) {
            r2 = this;
            r0 = r3
            return r0
    }

    public java.lang.String map(java.lang.String r3) {
            r2 = this;
            r0 = r3
            return r0
    }
}
