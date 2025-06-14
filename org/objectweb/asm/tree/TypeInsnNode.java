package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/TypeInsnNode.SCL.lombok */
public class TypeInsnNode extends org.objectweb.asm.tree.AbstractInsnNode {
    public java.lang.String desc;

    public TypeInsnNode(int r4, java.lang.String r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.desc = r1
            return
    }

    public void setOpcode(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.opcode = r1
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
            r2 = this;
            r0 = 3
            return r0
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(org.objectweb.asm.MethodVisitor r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.opcode
            r2 = r4
            java.lang.String r2 = r2.desc
            r0.visitTypeInsn(r1, r2)
            r0 = r4
            r1 = r5
            r0.acceptAnnotations(r1)
            return
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public org.objectweb.asm.tree.AbstractInsnNode clone(java.util.Map<org.objectweb.asm.tree.LabelNode, org.objectweb.asm.tree.LabelNode> r6) {
            r5 = this;
            org.objectweb.asm.tree.TypeInsnNode r0 = new org.objectweb.asm.tree.TypeInsnNode
            r1 = r0
            r2 = r5
            int r2 = r2.opcode
            r3 = r5
            java.lang.String r3 = r3.desc
            r1.<init>(r2, r3)
            r1 = r5
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.cloneAnnotations(r1)
            return r0
    }
}
