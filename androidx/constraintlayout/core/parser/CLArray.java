package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLArray extends androidx.constraintlayout.core.parser.CLContainer {
    public CLArray(char[] r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] r1) {
            androidx.constraintlayout.core.parser.CLArray r0 = new androidx.constraintlayout.core.parser.CLArray
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toFormattedJSON(int r8, int r9) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.toJSON()
            if (r9 > 0) goto L18
            int r2 = r1.length()
            int r2 = r2 + r8
            int r3 = androidx.constraintlayout.core.parser.CLArray.MAX_LINE
            if (r2 >= r3) goto L18
            r0.append(r1)
            goto L5a
        L18:
            java.lang.String r1 = "[\n"
            r0.append(r1)
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r1 = r7.mElements
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
            r3 = r2
        L25:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r1.next()
            androidx.constraintlayout.core.parser.CLElement r4 = (androidx.constraintlayout.core.parser.CLElement) r4
            if (r3 != 0) goto L39
            java.lang.String r5 = ",\n"
            r0.append(r5)
            goto L3a
        L39:
            r3 = 0
        L3a:
            int r5 = androidx.constraintlayout.core.parser.CLArray.BASE_INDENT
            int r5 = r5 + r8
            r7.addIndent(r0, r5)
            int r5 = androidx.constraintlayout.core.parser.CLArray.BASE_INDENT
            int r5 = r5 + r8
            int r6 = r9 + (-1)
            java.lang.String r4 = r4.toFormattedJSON(r5, r6)
            r0.append(r4)
            goto L25
        L4d:
            java.lang.String r9 = "\n"
            r0.append(r9)
            r7.addIndent(r0, r8)
            java.lang.String r8 = "]"
            r0.append(r8)
        L5a:
            java.lang.String r8 = r0.toString()
            return r8
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toJSON() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.getDebugName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "["
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r1 = 1
            r2 = 0
            r3 = r2
        L1f:
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r4 = r5.mElements
            int r4 = r4.size()
            if (r3 >= r4) goto L42
            if (r1 != 0) goto L2f
            java.lang.String r4 = ", "
            r0.append(r4)
            goto L30
        L2f:
            r1 = r2
        L30:
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r4 = r5.mElements
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.core.parser.CLElement r4 = (androidx.constraintlayout.core.parser.CLElement) r4
            java.lang.String r4 = r4.toJSON()
            r0.append(r4)
            int r3 = r3 + 1
            goto L1f
        L42:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
