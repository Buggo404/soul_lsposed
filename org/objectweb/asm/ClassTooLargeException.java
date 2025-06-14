package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/ClassTooLargeException.SCL.lombok */
public final class ClassTooLargeException extends java.lang.IndexOutOfBoundsException {
    private static final long serialVersionUID = 160715609518896765L;
    private final java.lang.String className;
    private final int constantPoolCount;

    public ClassTooLargeException(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Class too large: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            r0.className = r1
            r0 = r4
            r1 = r6
            r0.constantPoolCount = r1
            return
    }

    public java.lang.String getClassName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.className
            return r0
    }

    public int getConstantPoolCount() {
            r2 = this;
            r0 = r2
            int r0 = r0.constantPoolCount
            return r0
    }
}
