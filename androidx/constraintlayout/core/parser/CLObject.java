package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLObject extends androidx.constraintlayout.core.parser.CLContainer implements java.lang.Iterable<androidx.constraintlayout.core.parser.CLKey> {

    private class CLObjectIterator implements java.util.Iterator {
        int index;
        androidx.constraintlayout.core.parser.CLObject myObject;
        final /* synthetic */ androidx.constraintlayout.core.parser.CLObject this$0;

        public CLObjectIterator(androidx.constraintlayout.core.parser.CLObject r1, androidx.constraintlayout.core.parser.CLObject r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.index = r1
                r0.myObject = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                androidx.constraintlayout.core.parser.CLObject r1 = r2.myObject
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
                r2 = this;
                androidx.constraintlayout.core.parser.CLObject r0 = r2.myObject
                java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r0.mElements
                int r1 = r2.index
                java.lang.Object r0 = r0.get(r1)
                androidx.constraintlayout.core.parser.CLKey r0 = (androidx.constraintlayout.core.parser.CLKey) r0
                int r1 = r2.index
                int r1 = r1 + 1
                r2.index = r1
                return r0
        }
    }

    public CLObject(char[] r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static androidx.constraintlayout.core.parser.CLObject allocate(char[] r1) {
            androidx.constraintlayout.core.parser.CLObject r0 = new androidx.constraintlayout.core.parser.CLObject
            r0.<init>(r1)
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<androidx.constraintlayout.core.parser.CLKey> iterator() {
            r1 = this;
            androidx.constraintlayout.core.parser.CLObject$CLObjectIterator r0 = new androidx.constraintlayout.core.parser.CLObject$CLObjectIterator
            r0.<init>(r1, r1)
            return r0
    }

    public java.lang.String toFormattedJSON() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.toFormattedJSON(r0, r0)
            return r0
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public java.lang.String toFormattedJSON(int r8, int r9) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r7.getDebugName()
            r0.<init>(r1)
            java.lang.String r1 = "{\n"
            r0.append(r1)
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r1 = r7.mElements
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
            r3 = r2
        L16:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L38
            java.lang.Object r4 = r1.next()
            androidx.constraintlayout.core.parser.CLElement r4 = (androidx.constraintlayout.core.parser.CLElement) r4
            if (r3 != 0) goto L2a
            java.lang.String r5 = ",\n"
            r0.append(r5)
            goto L2b
        L2a:
            r3 = 0
        L2b:
            int r5 = androidx.constraintlayout.core.parser.CLObject.BASE_INDENT
            int r5 = r5 + r8
            int r6 = r9 + (-1)
            java.lang.String r4 = r4.toFormattedJSON(r5, r6)
            r0.append(r4)
            goto L16
        L38:
            java.lang.String r9 = "\n"
            r0.append(r9)
            r7.addIndent(r0, r8)
            java.lang.String r8 = "}"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            return r8
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public java.lang.String toJSON() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.getDebugName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "{ "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r1 = r5.mElements
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L23:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r1.next()
            androidx.constraintlayout.core.parser.CLElement r3 = (androidx.constraintlayout.core.parser.CLElement) r3
            if (r2 != 0) goto L37
            java.lang.String r4 = ", "
            r0.append(r4)
            goto L38
        L37:
            r2 = 0
        L38:
            java.lang.String r3 = r3.toJSON()
            r0.append(r3)
            goto L23
        L40:
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
