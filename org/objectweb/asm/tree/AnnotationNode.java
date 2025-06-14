package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/AnnotationNode.SCL.lombok */
public class AnnotationNode extends org.objectweb.asm.AnnotationVisitor {
    public java.lang.String desc;
    public java.util.List<java.lang.Object> values;

    public AnnotationNode(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r5
            r0.<init>(r1, r2)
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.tree.AnnotationNode> r1 = org.objectweb.asm.tree.AnnotationNode.class
            if (r0 == r1) goto L18
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L18:
            return
    }

    public AnnotationNode(int r4, java.lang.String r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.desc = r1
            return
    }

    AnnotationNode(java.util.List<java.lang.Object> r4) {
            r3 = this;
            r0 = r3
            r1 = 589824(0x90000, float:8.2652E-40)
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.values = r1
            return
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visit(java.lang.String r6, java.lang.Object r7) {
            r5 = this;
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            if (r0 != 0) goto L1e
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = r5
            java.lang.String r3 = r3.desc
            if (r3 == 0) goto L17
            r3 = 2
            goto L18
        L17:
            r3 = 1
        L18:
            r2.<init>(r3)
            r0.values = r1
        L1e:
            r0 = r5
            java.lang.String r0 = r0.desc
            if (r0 == 0) goto L30
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r6
            boolean r0 = r0.add(r1)
        L30:
            r0 = r7
            boolean r0 = r0 instanceof byte[]
            if (r0 == 0) goto L4b
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r7
            byte[] r1 = (byte[]) r1
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            boolean r0 = r0.add(r1)
            goto L113
        L4b:
            r0 = r7
            boolean r0 = r0 instanceof boolean[]
            if (r0 == 0) goto L66
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r7
            boolean[] r1 = (boolean[]) r1
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            boolean r0 = r0.add(r1)
            goto L113
        L66:
            r0 = r7
            boolean r0 = r0 instanceof short[]
            if (r0 == 0) goto L81
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r7
            short[] r1 = (short[]) r1
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            boolean r0 = r0.add(r1)
            goto L113
        L81:
            r0 = r7
            boolean r0 = r0 instanceof char[]
            if (r0 == 0) goto L9c
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r7
            char[] r1 = (char[]) r1
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            boolean r0 = r0.add(r1)
            goto L113
        L9c:
            r0 = r7
            boolean r0 = r0 instanceof int[]
            if (r0 == 0) goto Lb7
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r7
            int[] r1 = (int[]) r1
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            boolean r0 = r0.add(r1)
            goto L113
        Lb7:
            r0 = r7
            boolean r0 = r0 instanceof long[]
            if (r0 == 0) goto Ld2
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r7
            long[] r1 = (long[]) r1
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            boolean r0 = r0.add(r1)
            goto L113
        Ld2:
            r0 = r7
            boolean r0 = r0 instanceof float[]
            if (r0 == 0) goto Led
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r7
            float[] r1 = (float[]) r1
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            boolean r0 = r0.add(r1)
            goto L113
        Led:
            r0 = r7
            boolean r0 = r0 instanceof double[]
            if (r0 == 0) goto L108
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r7
            double[] r1 = (double[]) r1
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            boolean r0 = r0.add(r1)
            goto L113
        L108:
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r7
            boolean r0 = r0.add(r1)
        L113:
            return
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnum(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.values
            if (r0 != 0) goto L1e
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = r6
            java.lang.String r3 = r3.desc
            if (r3 == 0) goto L17
            r3 = 2
            goto L18
        L17:
            r3 = 1
        L18:
            r2.<init>(r3)
            r0.values = r1
        L1e:
            r0 = r6
            java.lang.String r0 = r0.desc
            if (r0 == 0) goto L30
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r7
            boolean r0 = r0.add(r1)
        L30:
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r9
            r2[r3] = r4
            boolean r0 = r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            if (r0 != 0) goto L1e
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = r5
            java.lang.String r3 = r3.desc
            if (r3 == 0) goto L17
            r3 = 2
            goto L18
        L17:
            r3 = 1
        L18:
            r2.<init>(r3)
            r0.values = r1
        L1e:
            r0 = r5
            java.lang.String r0 = r0.desc
            if (r0 == 0) goto L30
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r6
            boolean r0 = r0.add(r1)
        L30:
            org.objectweb.asm.tree.AnnotationNode r0 = new org.objectweb.asm.tree.AnnotationNode
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r8 = r0
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r8
            boolean r0 = r0.add(r1)
            r0 = r8
            return r0
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public org.objectweb.asm.AnnotationVisitor visitArray(java.lang.String r6) {
            r5 = this;
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            if (r0 != 0) goto L1e
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = r5
            java.lang.String r3 = r3.desc
            if (r3 == 0) goto L17
            r3 = 2
            goto L18
        L17:
            r3 = 1
        L18:
            r2.<init>(r3)
            r0.values = r1
        L1e:
            r0 = r5
            java.lang.String r0 = r0.desc
            if (r0 == 0) goto L30
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r6
            boolean r0 = r0.add(r1)
        L30:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r5
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r7
            boolean r0 = r0.add(r1)
            org.objectweb.asm.tree.AnnotationNode r0 = new org.objectweb.asm.tree.AnnotationNode
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            return r0
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnd() {
            r1 = this;
            return
    }

    public void check(int r2) {
            r1 = this;
            return
    }

    public void accept(org.objectweb.asm.AnnotationVisitor r5) {
            r4 = this;
            r0 = r5
            if (r0 == 0) goto L4b
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.values
            if (r0 == 0) goto L47
            r0 = 0
            r6 = r0
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.values
            int r0 = r0.size()
            r7 = r0
        L17:
            r0 = r6
            r1 = r7
            if (r0 >= r1) goto L47
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.values
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            java.lang.Object r0 = r0.get(r1)
            r9 = r0
            r0 = r5
            r1 = r8
            r2 = r9
            accept(r0, r1, r2)
            int r6 = r6 + 2
            goto L17
        L47:
            r0 = r5
            r0.visitEnd()
        L4b:
            return
    }

    static void accept(org.objectweb.asm.AnnotationVisitor r6, java.lang.String r7, java.lang.Object r8) {
            r0 = r6
            if (r0 == 0) goto L85
            r0 = r8
            boolean r0 = r0 instanceof java.lang.String[]
            if (r0 == 0) goto L1e
            r0 = r8
            java.lang.String[] r0 = (java.lang.String[]) r0
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = 0
            r2 = r2[r3]
            r3 = r9
            r4 = 1
            r3 = r3[r4]
            r0.visitEnum(r1, r2, r3)
            goto L85
        L1e:
            r0 = r8
            boolean r0 = r0 instanceof org.objectweb.asm.tree.AnnotationNode
            if (r0 == 0) goto L3a
            r0 = r8
            org.objectweb.asm.tree.AnnotationNode r0 = (org.objectweb.asm.tree.AnnotationNode) r0
            r9 = r0
            r0 = r9
            r1 = r6
            r2 = r7
            r3 = r9
            java.lang.String r3 = r3.desc
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
            r0.accept(r1)
            goto L85
        L3a:
            r0 = r8
            boolean r0 = r0 instanceof java.util.List
            if (r0 == 0) goto L7f
            r0 = r6
            r1 = r7
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitArray(r1)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L7c
            r0 = r8
            java.util.List r0 = (java.util.List) r0
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r10
            int r0 = r0.size()
            r12 = r0
        L5d:
            r0 = r11
            r1 = r12
            if (r0 >= r1) goto L78
            r0 = r9
            r1 = 0
            r2 = r10
            r3 = r11
            java.lang.Object r2 = r2.get(r3)
            accept(r0, r1, r2)
            int r11 = r11 + 1
            goto L5d
        L78:
            r0 = r9
            r0.visitEnd()
        L7c:
            goto L85
        L7f:
            r0 = r6
            r1 = r7
            r2 = r8
            r0.visit(r1, r2)
        L85:
            return
    }
}
