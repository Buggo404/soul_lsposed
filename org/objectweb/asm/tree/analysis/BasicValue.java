package org.objectweb.asm.tree.analysis;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/analysis/BasicValue.SCL.lombok */
public class BasicValue implements org.objectweb.asm.tree.analysis.Value {
    public static final org.objectweb.asm.tree.analysis.BasicValue UNINITIALIZED_VALUE = null;
    public static final org.objectweb.asm.tree.analysis.BasicValue INT_VALUE = null;
    public static final org.objectweb.asm.tree.analysis.BasicValue FLOAT_VALUE = null;
    public static final org.objectweb.asm.tree.analysis.BasicValue LONG_VALUE = null;
    public static final org.objectweb.asm.tree.analysis.BasicValue DOUBLE_VALUE = null;
    public static final org.objectweb.asm.tree.analysis.BasicValue REFERENCE_VALUE = null;
    public static final org.objectweb.asm.tree.analysis.BasicValue RETURNADDRESS_VALUE = null;
    private final org.objectweb.asm.Type type;

    public BasicValue(org.objectweb.asm.Type r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.type = r1
            return
    }

    public org.objectweb.asm.Type getType() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.Type r0 = r0.type
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Value
    public int getSize() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.Type r0 = r0.type
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            if (r0 == r1) goto L14
            r0 = r3
            org.objectweb.asm.Type r0 = r0.type
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            if (r0 != r1) goto L18
        L14:
            r0 = 2
            goto L19
        L18:
            r0 = 1
        L19:
            return r0
    }

    public boolean isReference() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.Type r0 = r0.type
            if (r0 == 0) goto L23
            r0 = r3
            org.objectweb.asm.Type r0 = r0.type
            int r0 = r0.getSort()
            r1 = 10
            if (r0 == r1) goto L1f
            r0 = r3
            org.objectweb.asm.Type r0 = r0.type
            int r0 = r0.getSort()
            r1 = 9
            if (r0 != r1) goto L23
        L1f:
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
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
            boolean r0 = r0 instanceof org.objectweb.asm.tree.analysis.BasicValue
            if (r0 == 0) goto L34
            r0 = r3
            org.objectweb.asm.Type r0 = r0.type
            if (r0 != 0) goto L25
            r0 = r4
            org.objectweb.asm.tree.analysis.BasicValue r0 = (org.objectweb.asm.tree.analysis.BasicValue) r0
            org.objectweb.asm.Type r0 = r0.type
            if (r0 != 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
        L25:
            r0 = r3
            org.objectweb.asm.Type r0 = r0.type
            r1 = r4
            org.objectweb.asm.tree.analysis.BasicValue r1 = (org.objectweb.asm.tree.analysis.BasicValue) r1
            org.objectweb.asm.Type r1 = r1.type
            boolean r0 = r0.equals(r1)
            return r0
        L34:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.Type r0 = r0.type
            if (r0 != 0) goto Lb
            r0 = 0
            goto L12
        Lb:
            r0 = r2
            org.objectweb.asm.Type r0 = r0.type
            int r0 = r0.hashCode()
        L12:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.tree.analysis.BasicValue r1 = org.objectweb.asm.tree.analysis.BasicValue.UNINITIALIZED_VALUE
            if (r0 != r1) goto La
            java.lang.String r0 = "."
            return r0
        La:
            r0 = r3
            org.objectweb.asm.tree.analysis.BasicValue r1 = org.objectweb.asm.tree.analysis.BasicValue.RETURNADDRESS_VALUE
            if (r0 != r1) goto L14
            java.lang.String r0 = "A"
            return r0
        L14:
            r0 = r3
            org.objectweb.asm.tree.analysis.BasicValue r1 = org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE
            if (r0 != r1) goto L1e
            java.lang.String r0 = "R"
            return r0
        L1e:
            r0 = r3
            org.objectweb.asm.Type r0 = r0.type
            java.lang.String r0 = r0.getDescriptor()
            return r0
    }

    static {
            org.objectweb.asm.tree.analysis.BasicValue r0 = new org.objectweb.asm.tree.analysis.BasicValue
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            org.objectweb.asm.tree.analysis.BasicValue.UNINITIALIZED_VALUE = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = new org.objectweb.asm.tree.analysis.BasicValue
            r1 = r0
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.INT_TYPE
            r1.<init>(r2)
            org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = new org.objectweb.asm.tree.analysis.BasicValue
            r1 = r0
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.FLOAT_TYPE
            r1.<init>(r2)
            org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = new org.objectweb.asm.tree.analysis.BasicValue
            r1 = r0
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.LONG_TYPE
            r1.<init>(r2)
            org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = new org.objectweb.asm.tree.analysis.BasicValue
            r1 = r0
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.DOUBLE_TYPE
            r1.<init>(r2)
            org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = new org.objectweb.asm.tree.analysis.BasicValue
            r1 = r0
            java.lang.String r2 = "java/lang/Object"
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.getObjectType(r2)
            r1.<init>(r2)
            org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = new org.objectweb.asm.tree.analysis.BasicValue
            r1 = r0
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.VOID_TYPE
            r1.<init>(r2)
            org.objectweb.asm.tree.analysis.BasicValue.RETURNADDRESS_VALUE = r0
            return
    }
}
