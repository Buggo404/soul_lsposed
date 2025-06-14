package org.objectweb.asm.tree.analysis;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/analysis/AnalyzerException.SCL.lombok */
public class AnalyzerException extends java.lang.Exception {
    private static final long serialVersionUID = 3154190448018943333L;
    public final transient org.objectweb.asm.tree.AbstractInsnNode node;

    public AnalyzerException(org.objectweb.asm.tree.AbstractInsnNode r4, java.lang.String r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.node = r1
            return
    }

    public AnalyzerException(org.objectweb.asm.tree.AbstractInsnNode r5, java.lang.String r6, java.lang.Throwable r7) {
            r4 = this;
            r0 = r4
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.node = r1
            return
    }

    public AnalyzerException(org.objectweb.asm.tree.AbstractInsnNode r6, java.lang.String r7, java.lang.Object r8, org.objectweb.asm.tree.analysis.Value r9) {
            r5 = this;
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r7
            if (r2 != 0) goto L11
            java.lang.String r2 = "Expected "
            goto L24
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ": expected "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
        L24:
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", but found "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0 = r5
            r1 = r6
            r0.node = r1
            return
    }
}
