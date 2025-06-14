package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/InsnList.SCL.lombok */
public class InsnList implements java.lang.Iterable<org.objectweb.asm.tree.AbstractInsnNode> {
    private int size;
    private org.objectweb.asm.tree.AbstractInsnNode firstInsn;
    private org.objectweb.asm.tree.AbstractInsnNode lastInsn;
    org.objectweb.asm.tree.AbstractInsnNode[] cache;

    /* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/InsnList$InsnListIterator.SCL.lombok */
    private final class InsnListIterator implements java.util.ListIterator {
        org.objectweb.asm.tree.AbstractInsnNode nextInsn;
        org.objectweb.asm.tree.AbstractInsnNode previousInsn;
        org.objectweb.asm.tree.AbstractInsnNode remove;
        final /* synthetic */ org.objectweb.asm.tree.InsnList this$0;

        InsnListIterator(org.objectweb.asm.tree.InsnList r4, int r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                r0 = r5
                if (r0 < 0) goto L15
                r0 = r5
                r1 = r4
                int r1 = r1.size()
                if (r0 <= r1) goto L1d
            L15:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r1 = r0
                r1.<init>()
                throw r0
            L1d:
                r0 = r5
                r1 = r4
                int r1 = r1.size()
                if (r0 != r1) goto L35
                r0 = r3
                r1 = 0
                r0.nextInsn = r1
                r0 = r3
                r1 = r4
                org.objectweb.asm.tree.AbstractInsnNode r1 = r1.getLast()
                r0.previousInsn = r1
                goto L5b
            L35:
                r0 = r4
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.getFirst()
                r6 = r0
                r0 = 0
                r7 = r0
            L3d:
                r0 = r7
                r1 = r5
                if (r0 >= r1) goto L4e
                r0 = r6
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
                r6 = r0
                int r7 = r7 + 1
                goto L3d
            L4e:
                r0 = r3
                r1 = r6
                r0.nextInsn = r1
                r0 = r3
                r1 = r6
                org.objectweb.asm.tree.AbstractInsnNode r1 = r1.previousInsn
                r0.previousInsn = r1
            L5b:
                return
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                r0 = r2
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
                if (r0 == 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public java.lang.Object next() {
                r3 = this;
                r0 = r3
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
                if (r0 != 0) goto Lf
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r1 = r0
                r1.<init>()
                throw r0
            Lf:
                r0 = r3
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
                r4 = r0
                r0 = r3
                r1 = r4
                r0.previousInsn = r1
                r0 = r3
                r1 = r4
                org.objectweb.asm.tree.AbstractInsnNode r1 = r1.nextInsn
                r0.nextInsn = r1
                r0 = r3
                r1 = r4
                r0.remove = r1
                r0 = r4
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r3 = this;
                r0 = r3
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.remove
                if (r0 == 0) goto L3e
                r0 = r3
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.remove
                r1 = r3
                org.objectweb.asm.tree.AbstractInsnNode r1 = r1.nextInsn
                if (r0 != r1) goto L20
                r0 = r3
                r1 = r3
                org.objectweb.asm.tree.AbstractInsnNode r1 = r1.nextInsn
                org.objectweb.asm.tree.AbstractInsnNode r1 = r1.nextInsn
                r0.nextInsn = r1
                goto L2b
            L20:
                r0 = r3
                r1 = r3
                org.objectweb.asm.tree.AbstractInsnNode r1 = r1.previousInsn
                org.objectweb.asm.tree.AbstractInsnNode r1 = r1.previousInsn
                r0.previousInsn = r1
            L2b:
                r0 = r3
                org.objectweb.asm.tree.InsnList r0 = r0.this$0
                r1 = r3
                org.objectweb.asm.tree.AbstractInsnNode r1 = r1.remove
                r0.remove(r1)
                r0 = r3
                r1 = 0
                r0.remove = r1
                goto L46
            L3e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                r1.<init>()
                throw r0
            L46:
                return
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r2 = this;
                r0 = r2
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.previousInsn
                if (r0 == 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        @Override // java.util.ListIterator
        public java.lang.Object previous() {
                r3 = this;
                r0 = r3
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.previousInsn
                if (r0 != 0) goto Lf
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r1 = r0
                r1.<init>()
                throw r0
            Lf:
                r0 = r3
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.previousInsn
                r4 = r0
                r0 = r3
                r1 = r4
                r0.nextInsn = r1
                r0 = r3
                r1 = r4
                org.objectweb.asm.tree.AbstractInsnNode r1 = r1.previousInsn
                r0.previousInsn = r1
                r0 = r3
                r1 = r4
                r0.remove = r1
                r0 = r4
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r3 = this;
                r0 = r3
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
                if (r0 != 0) goto Lf
                r0 = r3
                org.objectweb.asm.tree.InsnList r0 = r0.this$0
                int r0 = r0.size()
                return r0
            Lf:
                r0 = r3
                org.objectweb.asm.tree.InsnList r0 = r0.this$0
                org.objectweb.asm.tree.AbstractInsnNode[] r0 = r0.cache
                if (r0 != 0) goto L27
                r0 = r3
                org.objectweb.asm.tree.InsnList r0 = r0.this$0
                r1 = r3
                org.objectweb.asm.tree.InsnList r1 = r1.this$0
                org.objectweb.asm.tree.AbstractInsnNode[] r1 = r1.toArray()
                r0.cache = r1
            L27:
                r0 = r3
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
                int r0 = r0.index
                return r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r3 = this;
                r0 = r3
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.previousInsn
                if (r0 != 0) goto L9
                r0 = -1
                return r0
            L9:
                r0 = r3
                org.objectweb.asm.tree.InsnList r0 = r0.this$0
                org.objectweb.asm.tree.AbstractInsnNode[] r0 = r0.cache
                if (r0 != 0) goto L21
                r0 = r3
                org.objectweb.asm.tree.InsnList r0 = r0.this$0
                r1 = r3
                org.objectweb.asm.tree.InsnList r1 = r1.this$0
                org.objectweb.asm.tree.AbstractInsnNode[] r1 = r1.toArray()
                r0.cache = r1
            L21:
                r0 = r3
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.previousInsn
                int r0 = r0.index
                return r0
        }

        @Override // java.util.ListIterator
        public void add(java.lang.Object r5) {
                r4 = this;
                r0 = r4
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
                if (r0 == 0) goto L19
                r0 = r4
                org.objectweb.asm.tree.InsnList r0 = r0.this$0
                r1 = r4
                org.objectweb.asm.tree.AbstractInsnNode r1 = r1.nextInsn
                r2 = r5
                org.objectweb.asm.tree.AbstractInsnNode r2 = (org.objectweb.asm.tree.AbstractInsnNode) r2
                r0.insertBefore(r1, r2)
                goto L3d
            L19:
                r0 = r4
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.previousInsn
                if (r0 == 0) goto L32
                r0 = r4
                org.objectweb.asm.tree.InsnList r0 = r0.this$0
                r1 = r4
                org.objectweb.asm.tree.AbstractInsnNode r1 = r1.previousInsn
                r2 = r5
                org.objectweb.asm.tree.AbstractInsnNode r2 = (org.objectweb.asm.tree.AbstractInsnNode) r2
                r0.insert(r1, r2)
                goto L3d
            L32:
                r0 = r4
                org.objectweb.asm.tree.InsnList r0 = r0.this$0
                r1 = r5
                org.objectweb.asm.tree.AbstractInsnNode r1 = (org.objectweb.asm.tree.AbstractInsnNode) r1
                r0.add(r1)
            L3d:
                r0 = r4
                r1 = r5
                org.objectweb.asm.tree.AbstractInsnNode r1 = (org.objectweb.asm.tree.AbstractInsnNode) r1
                r0.previousInsn = r1
                r0 = r4
                r1 = 0
                r0.remove = r1
                return
        }

        @Override // java.util.ListIterator
        public void set(java.lang.Object r5) {
                r4 = this;
                r0 = r4
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.remove
                if (r0 == 0) goto L37
                r0 = r4
                org.objectweb.asm.tree.InsnList r0 = r0.this$0
                r1 = r4
                org.objectweb.asm.tree.AbstractInsnNode r1 = r1.remove
                r2 = r5
                org.objectweb.asm.tree.AbstractInsnNode r2 = (org.objectweb.asm.tree.AbstractInsnNode) r2
                r0.set(r1, r2)
                r0 = r4
                org.objectweb.asm.tree.AbstractInsnNode r0 = r0.remove
                r1 = r4
                org.objectweb.asm.tree.AbstractInsnNode r1 = r1.previousInsn
                if (r0 != r1) goto L2c
                r0 = r4
                r1 = r5
                org.objectweb.asm.tree.AbstractInsnNode r1 = (org.objectweb.asm.tree.AbstractInsnNode) r1
                r0.previousInsn = r1
                goto L3f
            L2c:
                r0 = r4
                r1 = r5
                org.objectweb.asm.tree.AbstractInsnNode r1 = (org.objectweb.asm.tree.AbstractInsnNode) r1
                r0.nextInsn = r1
                goto L3f
            L37:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                r1.<init>()
                throw r0
            L3f:
                return
        }
    }

    public InsnList() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public int size() {
            r2 = this;
            r0 = r2
            int r0 = r0.size
            return r0
    }

    public org.objectweb.asm.tree.AbstractInsnNode getFirst() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.firstInsn
            return r0
    }

    public org.objectweb.asm.tree.AbstractInsnNode getLast() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.lastInsn
            return r0
    }

    public org.objectweb.asm.tree.AbstractInsnNode get(int r4) {
            r3 = this;
            r0 = r4
            if (r0 < 0) goto Lc
            r0 = r4
            r1 = r3
            int r1 = r1.size
            if (r0 < r1) goto L14
        Lc:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            r1.<init>()
            throw r0
        L14:
            r0 = r3
            org.objectweb.asm.tree.AbstractInsnNode[] r0 = r0.cache
            if (r0 != 0) goto L23
            r0 = r3
            r1 = r3
            org.objectweb.asm.tree.AbstractInsnNode[] r1 = r1.toArray()
            r0.cache = r1
        L23:
            r0 = r3
            org.objectweb.asm.tree.AbstractInsnNode[] r0 = r0.cache
            r1 = r4
            r0 = r0[r1]
            return r0
    }

    public boolean contains(org.objectweb.asm.tree.AbstractInsnNode r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.firstInsn
            r5 = r0
        L5:
            r0 = r5
            if (r0 == 0) goto L16
            r0 = r5
            r1 = r4
            if (r0 == r1) goto L16
            r0 = r5
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
            r5 = r0
            goto L5
        L16:
            r0 = r5
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
    }

    public int indexOf(org.objectweb.asm.tree.AbstractInsnNode r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.tree.AbstractInsnNode[] r0 = r0.cache
            if (r0 != 0) goto Lf
            r0 = r3
            r1 = r3
            org.objectweb.asm.tree.AbstractInsnNode[] r1 = r1.toArray()
            r0.cache = r1
        Lf:
            r0 = r4
            int r0 = r0.index
            return r0
    }

    public void accept(org.objectweb.asm.MethodVisitor r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.firstInsn
            r5 = r0
        L5:
            r0 = r5
            if (r0 == 0) goto L16
            r0 = r5
            r1 = r4
            r0.accept(r1)
            r0 = r5
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
            r5 = r0
            goto L5
        L16:
            return
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<org.objectweb.asm.tree.AbstractInsnNode> iterator() {
            r3 = this;
            r0 = r3
            r1 = 0
            java.util.ListIterator r0 = r0.iterator(r1)
            return r0
    }

    public java.util.ListIterator<org.objectweb.asm.tree.AbstractInsnNode> iterator(int r6) {
            r5 = this;
            org.objectweb.asm.tree.InsnList$InsnListIterator r0 = new org.objectweb.asm.tree.InsnList$InsnListIterator
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public org.objectweb.asm.tree.AbstractInsnNode[] toArray() {
            r4 = this;
            r0 = 0
            r5 = r0
            r0 = r4
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.firstInsn
            r6 = r0
            r0 = r4
            int r0 = r0.size
            org.objectweb.asm.tree.AbstractInsnNode[] r0 = new org.objectweb.asm.tree.AbstractInsnNode[r0]
            r7 = r0
        Lf:
            r0 = r6
            if (r0 == 0) goto L27
            r0 = r7
            r1 = r5
            r2 = r6
            r0[r1] = r2
            r0 = r6
            r1 = r5
            int r5 = r5 + 1
            r0.index = r1
            r0 = r6
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
            r6 = r0
            goto Lf
        L27:
            r0 = r7
            return r0
    }

    public void set(org.objectweb.asm.tree.AbstractInsnNode r5, org.objectweb.asm.tree.AbstractInsnNode r6) {
            r4 = this;
            r0 = r5
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
            r7 = r0
            r0 = r6
            r1 = r7
            r0.nextInsn = r1
            r0 = r7
            if (r0 == 0) goto L16
            r0 = r7
            r1 = r6
            r0.previousInsn = r1
            goto L1b
        L16:
            r0 = r4
            r1 = r6
            r0.lastInsn = r1
        L1b:
            r0 = r5
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.previousInsn
            r8 = r0
            r0 = r6
            r1 = r8
            r0.previousInsn = r1
            r0 = r8
            if (r0 == 0) goto L35
            r0 = r8
            r1 = r6
            r0.nextInsn = r1
            goto L3a
        L35:
            r0 = r4
            r1 = r6
            r0.firstInsn = r1
        L3a:
            r0 = r4
            org.objectweb.asm.tree.AbstractInsnNode[] r0 = r0.cache
            if (r0 == 0) goto L58
            r0 = r5
            int r0 = r0.index
            r9 = r0
            r0 = r4
            org.objectweb.asm.tree.AbstractInsnNode[] r0 = r0.cache
            r1 = r9
            r2 = r6
            r0[r1] = r2
            r0 = r6
            r1 = r9
            r0.index = r1
            goto L5d
        L58:
            r0 = r6
            r1 = 0
            r0.index = r1
        L5d:
            r0 = r5
            r1 = -1
            r0.index = r1
            r0 = r5
            r1 = 0
            r0.previousInsn = r1
            r0 = r5
            r1 = 0
            r0.nextInsn = r1
            return
    }

    public void add(org.objectweb.asm.tree.AbstractInsnNode r5) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.size
            r2 = 1
            int r1 = r1 + r2
            r0.size = r1
            r0 = r4
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.lastInsn
            if (r0 != 0) goto L1e
            r0 = r4
            r1 = r5
            r0.firstInsn = r1
            r0 = r4
            r1 = r5
            r0.lastInsn = r1
            goto L2e
        L1e:
            r0 = r4
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.lastInsn
            r1 = r5
            r0.nextInsn = r1
            r0 = r5
            r1 = r4
            org.objectweb.asm.tree.AbstractInsnNode r1 = r1.lastInsn
            r0.previousInsn = r1
        L2e:
            r0 = r4
            r1 = r5
            r0.lastInsn = r1
            r0 = r4
            r1 = 0
            r0.cache = r1
            r0 = r5
            r1 = 0
            r0.index = r1
            return
    }

    public void add(org.objectweb.asm.tree.InsnList r5) {
            r4 = this;
            r0 = r5
            int r0 = r0.size
            if (r0 != 0) goto L8
            return
        L8:
            r0 = r4
            r1 = r0
            int r1 = r1.size
            r2 = r5
            int r2 = r2.size
            int r1 = r1 + r2
            r0.size = r1
            r0 = r4
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.lastInsn
            if (r0 != 0) goto L2f
            r0 = r4
            r1 = r5
            org.objectweb.asm.tree.AbstractInsnNode r1 = r1.firstInsn
            r0.firstInsn = r1
            r0 = r4
            r1 = r5
            org.objectweb.asm.tree.AbstractInsnNode r1 = r1.lastInsn
            r0.lastInsn = r1
            goto L4c
        L2f:
            r0 = r5
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.firstInsn
            r6 = r0
            r0 = r4
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.lastInsn
            r1 = r6
            r0.nextInsn = r1
            r0 = r6
            r1 = r4
            org.objectweb.asm.tree.AbstractInsnNode r1 = r1.lastInsn
            r0.previousInsn = r1
            r0 = r4
            r1 = r5
            org.objectweb.asm.tree.AbstractInsnNode r1 = r1.lastInsn
            r0.lastInsn = r1
        L4c:
            r0 = r4
            r1 = 0
            r0.cache = r1
            r0 = r5
            r1 = 0
            r0.removeAll(r1)
            return
    }

    public void insert(org.objectweb.asm.tree.AbstractInsnNode r5) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.size
            r2 = 1
            int r1 = r1 + r2
            r0.size = r1
            r0 = r4
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.firstInsn
            if (r0 != 0) goto L1e
            r0 = r4
            r1 = r5
            r0.firstInsn = r1
            r0 = r4
            r1 = r5
            r0.lastInsn = r1
            goto L2e
        L1e:
            r0 = r4
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.firstInsn
            r1 = r5
            r0.previousInsn = r1
            r0 = r5
            r1 = r4
            org.objectweb.asm.tree.AbstractInsnNode r1 = r1.firstInsn
            r0.nextInsn = r1
        L2e:
            r0 = r4
            r1 = r5
            r0.firstInsn = r1
            r0 = r4
            r1 = 0
            r0.cache = r1
            r0 = r5
            r1 = 0
            r0.index = r1
            return
    }

    public void insert(org.objectweb.asm.tree.InsnList r5) {
            r4 = this;
            r0 = r5
            int r0 = r0.size
            if (r0 != 0) goto L8
            return
        L8:
            r0 = r4
            r1 = r0
            int r1 = r1.size
            r2 = r5
            int r2 = r2.size
            int r1 = r1 + r2
            r0.size = r1
            r0 = r4
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.firstInsn
            if (r0 != 0) goto L2f
            r0 = r4
            r1 = r5
            org.objectweb.asm.tree.AbstractInsnNode r1 = r1.firstInsn
            r0.firstInsn = r1
            r0 = r4
            r1 = r5
            org.objectweb.asm.tree.AbstractInsnNode r1 = r1.lastInsn
            r0.lastInsn = r1
            goto L4c
        L2f:
            r0 = r5
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.lastInsn
            r6 = r0
            r0 = r4
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.firstInsn
            r1 = r6
            r0.previousInsn = r1
            r0 = r6
            r1 = r4
            org.objectweb.asm.tree.AbstractInsnNode r1 = r1.firstInsn
            r0.nextInsn = r1
            r0 = r4
            r1 = r5
            org.objectweb.asm.tree.AbstractInsnNode r1 = r1.firstInsn
            r0.firstInsn = r1
        L4c:
            r0 = r4
            r1 = 0
            r0.cache = r1
            r0 = r5
            r1 = 0
            r0.removeAll(r1)
            return
    }

    public void insert(org.objectweb.asm.tree.AbstractInsnNode r5, org.objectweb.asm.tree.AbstractInsnNode r6) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.size
            r2 = 1
            int r1 = r1 + r2
            r0.size = r1
            r0 = r5
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L1b
            r0 = r4
            r1 = r6
            r0.lastInsn = r1
            goto L20
        L1b:
            r0 = r7
            r1 = r6
            r0.previousInsn = r1
        L20:
            r0 = r5
            r1 = r6
            r0.nextInsn = r1
            r0 = r6
            r1 = r7
            r0.nextInsn = r1
            r0 = r6
            r1 = r5
            r0.previousInsn = r1
            r0 = r4
            r1 = 0
            r0.cache = r1
            r0 = r6
            r1 = 0
            r0.index = r1
            return
    }

    public void insert(org.objectweb.asm.tree.AbstractInsnNode r5, org.objectweb.asm.tree.InsnList r6) {
            r4 = this;
            r0 = r6
            int r0 = r0.size
            if (r0 != 0) goto L8
            return
        L8:
            r0 = r4
            r1 = r0
            int r1 = r1.size
            r2 = r6
            int r2 = r2.size
            int r1 = r1 + r2
            r0.size = r1
            r0 = r6
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.firstInsn
            r7 = r0
            r0 = r6
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.lastInsn
            r8 = r0
            r0 = r5
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L34
            r0 = r4
            r1 = r8
            r0.lastInsn = r1
            goto L3b
        L34:
            r0 = r9
            r1 = r8
            r0.previousInsn = r1
        L3b:
            r0 = r5
            r1 = r7
            r0.nextInsn = r1
            r0 = r8
            r1 = r9
            r0.nextInsn = r1
            r0 = r7
            r1 = r5
            r0.previousInsn = r1
            r0 = r4
            r1 = 0
            r0.cache = r1
            r0 = r6
            r1 = 0
            r0.removeAll(r1)
            return
    }

    public void insertBefore(org.objectweb.asm.tree.AbstractInsnNode r5, org.objectweb.asm.tree.AbstractInsnNode r6) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.size
            r2 = 1
            int r1 = r1 + r2
            r0.size = r1
            r0 = r5
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.previousInsn
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L1b
            r0 = r4
            r1 = r6
            r0.firstInsn = r1
            goto L20
        L1b:
            r0 = r7
            r1 = r6
            r0.nextInsn = r1
        L20:
            r0 = r5
            r1 = r6
            r0.previousInsn = r1
            r0 = r6
            r1 = r5
            r0.nextInsn = r1
            r0 = r6
            r1 = r7
            r0.previousInsn = r1
            r0 = r4
            r1 = 0
            r0.cache = r1
            r0 = r6
            r1 = 0
            r0.index = r1
            return
    }

    public void insertBefore(org.objectweb.asm.tree.AbstractInsnNode r5, org.objectweb.asm.tree.InsnList r6) {
            r4 = this;
            r0 = r6
            int r0 = r0.size
            if (r0 != 0) goto L8
            return
        L8:
            r0 = r4
            r1 = r0
            int r1 = r1.size
            r2 = r6
            int r2 = r2.size
            int r1 = r1 + r2
            r0.size = r1
            r0 = r6
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.firstInsn
            r7 = r0
            r0 = r6
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.lastInsn
            r8 = r0
            r0 = r5
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.previousInsn
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L33
            r0 = r4
            r1 = r7
            r0.firstInsn = r1
            goto L39
        L33:
            r0 = r9
            r1 = r7
            r0.nextInsn = r1
        L39:
            r0 = r5
            r1 = r8
            r0.previousInsn = r1
            r0 = r8
            r1 = r5
            r0.nextInsn = r1
            r0 = r7
            r1 = r9
            r0.previousInsn = r1
            r0 = r4
            r1 = 0
            r0.cache = r1
            r0 = r6
            r1 = 0
            r0.removeAll(r1)
            return
    }

    public void remove(org.objectweb.asm.tree.AbstractInsnNode r5) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.size
            r2 = 1
            int r1 = r1 - r2
            r0.size = r1
            r0 = r5
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
            r6 = r0
            r0 = r5
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.previousInsn
            r7 = r0
            r0 = r6
            if (r0 != 0) goto L36
            r0 = r7
            if (r0 != 0) goto L29
            r0 = r4
            r1 = 0
            r0.firstInsn = r1
            r0 = r4
            r1 = 0
            r0.lastInsn = r1
            goto L51
        L29:
            r0 = r7
            r1 = 0
            r0.nextInsn = r1
            r0 = r4
            r1 = r7
            r0.lastInsn = r1
            goto L51
        L36:
            r0 = r7
            if (r0 != 0) goto L47
            r0 = r4
            r1 = r6
            r0.firstInsn = r1
            r0 = r6
            r1 = 0
            r0.previousInsn = r1
            goto L51
        L47:
            r0 = r7
            r1 = r6
            r0.nextInsn = r1
            r0 = r6
            r1 = r7
            r0.previousInsn = r1
        L51:
            r0 = r4
            r1 = 0
            r0.cache = r1
            r0 = r5
            r1 = -1
            r0.index = r1
            r0 = r5
            r1 = 0
            r0.previousInsn = r1
            r0 = r5
            r1 = 0
            r0.nextInsn = r1
            return
    }

    void removeAll(boolean r4) {
            r3 = this;
            r0 = r4
            if (r0 == 0) goto L26
            r0 = r3
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.firstInsn
            r5 = r0
        L9:
            r0 = r5
            if (r0 == 0) goto L26
            r0 = r5
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
            r6 = r0
            r0 = r5
            r1 = -1
            r0.index = r1
            r0 = r5
            r1 = 0
            r0.previousInsn = r1
            r0 = r5
            r1 = 0
            r0.nextInsn = r1
            r0 = r6
            r5 = r0
            goto L9
        L26:
            r0 = r3
            r1 = 0
            r0.size = r1
            r0 = r3
            r1 = 0
            r0.firstInsn = r1
            r0 = r3
            r1 = 0
            r0.lastInsn = r1
            r0 = r3
            r1 = 0
            r0.cache = r1
            return
    }

    public void clear() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.removeAll(r1)
            return
    }

    public void resetLabels() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.firstInsn
            r3 = r0
        L5:
            r0 = r3
            if (r0 == 0) goto L1f
            r0 = r3
            boolean r0 = r0 instanceof org.objectweb.asm.tree.LabelNode
            if (r0 == 0) goto L17
            r0 = r3
            org.objectweb.asm.tree.LabelNode r0 = (org.objectweb.asm.tree.LabelNode) r0
            r0.resetLabel()
        L17:
            r0 = r3
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.nextInsn
            r3 = r0
            goto L5
        L1f:
            return
    }

    @Override // java.lang.Iterable
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ java.util.Iterator<org.objectweb.asm.tree.AbstractInsnNode> iterator2() {
            r2 = this;
            r0 = r2
            java.util.ListIterator r0 = r0.iterator()
            return r0
    }
}
