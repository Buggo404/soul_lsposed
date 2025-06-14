package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/ConstantDynamic.SCL.lombok */
public final class ConstantDynamic {
    private final java.lang.String name;
    private final java.lang.String descriptor;
    private final org.objectweb.asm.Handle bootstrapMethod;
    private final java.lang.Object[] bootstrapMethodArguments;

    public ConstantDynamic(java.lang.String r4, java.lang.String r5, org.objectweb.asm.Handle r6, java.lang.Object... r7) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.name = r1
            r0 = r3
            r1 = r5
            r0.descriptor = r1
            r0 = r3
            r1 = r6
            r0.bootstrapMethod = r1
            r0 = r3
            r1 = r7
            r0.bootstrapMethodArguments = r1
            return
    }

    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.name
            return r0
    }

    public java.lang.String getDescriptor() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.descriptor
            return r0
    }

    public org.objectweb.asm.Handle getBootstrapMethod() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.Handle r0 = r0.bootstrapMethod
            return r0
    }

    public int getBootstrapMethodArgumentCount() {
            r2 = this;
            r0 = r2
            java.lang.Object[] r0 = r0.bootstrapMethodArguments
            int r0 = r0.length
            return r0
    }

    public java.lang.Object getBootstrapMethodArgument(int r4) {
            r3 = this;
            r0 = r3
            java.lang.Object[] r0 = r0.bootstrapMethodArguments
            r1 = r4
            r0 = r0[r1]
            return r0
    }

    java.lang.Object[] getBootstrapMethodArgumentsUnsafe() {
            r2 = this;
            r0 = r2
            java.lang.Object[] r0 = r0.bootstrapMethodArguments
            return r0
    }

    public int getSize() {
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.descriptor
            r1 = 0
            char r0 = r0.charAt(r1)
            r4 = r0
            r0 = r4
            r1 = 74
            if (r0 == r1) goto L15
            r0 = r4
            r1 = 68
            if (r0 != r1) goto L19
        L15:
            r0 = 2
            goto L1a
        L19:
            r0 = 1
        L1a:
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = r4
            boolean r0 = r0 instanceof org.objectweb.asm.ConstantDynamic
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r4
            org.objectweb.asm.ConstantDynamic r0 = (org.objectweb.asm.ConstantDynamic) r0
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.name
            r1 = r5
            java.lang.String r1 = r1.name
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            r0 = r3
            java.lang.String r0 = r0.descriptor
            r1 = r5
            java.lang.String r1 = r1.descriptor
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            r0 = r3
            org.objectweb.asm.Handle r0 = r0.bootstrapMethod
            r1 = r5
            org.objectweb.asm.Handle r1 = r1.bootstrapMethod
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            r0 = r3
            java.lang.Object[] r0 = r0.bootstrapMethodArguments
            r1 = r5
            java.lang.Object[] r1 = r1.bootstrapMethodArguments
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L51
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            return r0
    }

    public int hashCode() {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.name
            int r0 = r0.hashCode()
            r1 = r4
            java.lang.String r1 = r1.descriptor
            int r1 = r1.hashCode()
            r2 = 8
            int r1 = java.lang.Integer.rotateLeft(r1, r2)
            r0 = r0 ^ r1
            r1 = r4
            org.objectweb.asm.Handle r1 = r1.bootstrapMethod
            int r1 = r1.hashCode()
            r2 = 16
            int r1 = java.lang.Integer.rotateLeft(r1, r2)
            r0 = r0 ^ r1
            r1 = r4
            java.lang.Object[] r1 = r1.bootstrapMethodArguments
            int r1 = java.util.Arrays.hashCode(r1)
            r2 = 24
            int r1 = java.lang.Integer.rotateLeft(r1, r2)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.String r1 = r1.name
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.descriptor
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            org.objectweb.asm.Handle r1 = r1.bootstrapMethod
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.Object[] r1 = r1.bootstrapMethodArguments
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
