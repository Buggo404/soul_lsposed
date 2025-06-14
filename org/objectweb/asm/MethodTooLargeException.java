package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/MethodTooLargeException.SCL.lombok */
public final class MethodTooLargeException extends java.lang.IndexOutOfBoundsException {
    private static final long serialVersionUID = 6807380416709738314L;
    private final java.lang.String className;
    private final java.lang.String methodName;
    private final java.lang.String descriptor;
    private final int codeSize;

    public MethodTooLargeException(java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Method too large: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "."
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            r0.className = r1
            r0 = r4
            r1 = r6
            r0.methodName = r1
            r0 = r4
            r1 = r7
            r0.descriptor = r1
            r0 = r4
            r1 = r8
            r0.codeSize = r1
            return
    }

    public java.lang.String getClassName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.className
            return r0
    }

    public java.lang.String getMethodName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.methodName
            return r0
    }

    public java.lang.String getDescriptor() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.descriptor
            return r0
    }

    public int getCodeSize() {
            r2 = this;
            r0 = r2
            int r0 = r0.codeSize
            return r0
    }
}
