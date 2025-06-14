package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/SimpleRemapper.SCL.lombok */
public class SimpleRemapper extends org.objectweb.asm.commons.Remapper {
    private final java.util.Map<java.lang.String, java.lang.String> mapping;

    public SimpleRemapper(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.mapping = r1
            return
    }

    public SimpleRemapper(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r2 = r6
            java.util.Map r1 = java.util.Collections.singletonMap(r1, r2)
            r0.mapping = r1
            return
    }

    @Override // org.objectweb.asm.commons.Remapper
    public java.lang.String mapMethodName(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.map(r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L2a
            r0 = r6
            goto L2c
        L2a:
            r0 = r8
        L2c:
            return r0
    }

    @Override // org.objectweb.asm.commons.Remapper
    public java.lang.String mapInvokeDynamicMethodName(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.map(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L24
            r0 = r5
            goto L25
        L24:
            r0 = r7
        L25:
            return r0
    }

    @Override // org.objectweb.asm.commons.Remapper
    public java.lang.String mapAnnotationAttributeName(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.map(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L24
            r0 = r6
            goto L25
        L24:
            r0 = r7
        L25:
            return r0
    }

    @Override // org.objectweb.asm.commons.Remapper
    public java.lang.String mapFieldName(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.map(r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L26
            r0 = r6
            goto L28
        L26:
            r0 = r8
        L28:
            return r0
    }

    @Override // org.objectweb.asm.commons.Remapper
    public java.lang.String map(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.mapping
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }
}
