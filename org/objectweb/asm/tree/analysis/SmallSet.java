package org.objectweb.asm.tree.analysis;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/analysis/SmallSet.SCL.lombok */
final class SmallSet<T> extends java.util.AbstractSet<T> {
    private final T element1;
    private final T element2;

    /* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/analysis/SmallSet$IteratorImpl.SCL.lombok */
    static class IteratorImpl<T> implements java.util.Iterator<T> {
        private T firstElement;
        private T secondElement;

        IteratorImpl(T r4, T r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.firstElement = r1
                r0 = r3
                r1 = r5
                r0.secondElement = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                r0 = r2
                T r0 = r0.firstElement
                if (r0 == 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                r0 = r3
                T r0 = r0.firstElement
                if (r0 != 0) goto Lf
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r1 = r0
                r1.<init>()
                throw r0
            Lf:
                r0 = r3
                T r0 = r0.firstElement
                r4 = r0
                r0 = r3
                r1 = r3
                T r1 = r1.secondElement
                r0.firstElement = r1
                r0 = r3
                r1 = 0
                r0.secondElement = r1
                r0 = r4
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                r1.<init>()
                throw r0
        }
    }

    SmallSet() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.element1 = r1
            r0 = r3
            r1 = 0
            r0.element2 = r1
            return
    }

    SmallSet(T r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.element1 = r1
            r0 = r3
            r1 = 0
            r0.element2 = r1
            return
    }

    private SmallSet(T r4, T r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.element1 = r1
            r0 = r3
            r1 = r5
            r0.element2 = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<T> iterator() {
            r5 = this;
            org.objectweb.asm.tree.analysis.SmallSet$IteratorImpl r0 = new org.objectweb.asm.tree.analysis.SmallSet$IteratorImpl
            r1 = r0
            r2 = r5
            T r2 = r2.element1
            r3 = r5
            T r3 = r3.element2
            r1.<init>(r2, r3)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r2 = this;
            r0 = r2
            T r0 = r0.element1
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r2
            T r0 = r0.element2
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 2
            return r0
    }

    java.util.Set<T> union(org.objectweb.asm.tree.analysis.SmallSet<T> r6) {
            r5 = this;
            r0 = r6
            T r0 = r0.element1
            r1 = r5
            T r1 = r1.element1
            if (r0 != r1) goto L16
            r0 = r6
            T r0 = r0.element2
            r1 = r5
            T r1 = r1.element2
            if (r0 == r1) goto L2c
        L16:
            r0 = r6
            T r0 = r0.element1
            r1 = r5
            T r1 = r1.element2
            if (r0 != r1) goto L2e
            r0 = r6
            T r0 = r0.element2
            r1 = r5
            T r1 = r1.element1
            if (r0 != r1) goto L2e
        L2c:
            r0 = r5
            return r0
        L2e:
            r0 = r6
            T r0 = r0.element1
            if (r0 != 0) goto L37
            r0 = r5
            return r0
        L37:
            r0 = r5
            T r0 = r0.element1
            if (r0 != 0) goto L40
            r0 = r6
            return r0
        L40:
            r0 = r6
            T r0 = r0.element2
            if (r0 != 0) goto L76
            r0 = r5
            T r0 = r0.element2
            if (r0 != 0) goto L5e
            org.objectweb.asm.tree.analysis.SmallSet r0 = new org.objectweb.asm.tree.analysis.SmallSet
            r1 = r0
            r2 = r5
            T r2 = r2.element1
            r3 = r6
            T r3 = r3.element1
            r1.<init>(r2, r3)
            return r0
        L5e:
            r0 = r6
            T r0 = r0.element1
            r1 = r5
            T r1 = r1.element1
            if (r0 == r1) goto L74
            r0 = r6
            T r0 = r0.element1
            r1 = r5
            T r1 = r1.element2
            if (r0 != r1) goto L76
        L74:
            r0 = r5
            return r0
        L76:
            r0 = r5
            T r0 = r0.element2
            if (r0 != 0) goto L95
            r0 = r5
            T r0 = r0.element1
            r1 = r6
            T r1 = r1.element1
            if (r0 == r1) goto L93
            r0 = r5
            T r0 = r0.element1
            r1 = r6
            T r1 = r1.element2
            if (r0 != r1) goto L95
        L93:
            r0 = r6
            return r0
        L95:
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = 4
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r5
            T r1 = r1.element1
            boolean r0 = r0.add(r1)
            r0 = r5
            T r0 = r0.element2
            if (r0 == 0) goto Lb7
            r0 = r7
            r1 = r5
            T r1 = r1.element2
            boolean r0 = r0.add(r1)
        Lb7:
            r0 = r7
            r1 = r6
            T r1 = r1.element1
            boolean r0 = r0.add(r1)
            r0 = r6
            T r0 = r0.element2
            if (r0 == 0) goto Ld0
            r0 = r7
            r1 = r6
            T r1 = r1.element2
            boolean r0 = r0.add(r1)
        Ld0:
            r0 = r7
            return r0
    }
}
