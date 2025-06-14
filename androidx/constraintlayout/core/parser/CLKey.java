package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLKey extends androidx.constraintlayout.core.parser.CLContainer {
    private static java.util.ArrayList<java.lang.String> sections;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.constraintlayout.core.parser.CLKey.sections = r0
            java.lang.String r1 = "ConstraintSets"
            r0.add(r1)
            java.util.ArrayList<java.lang.String> r0 = androidx.constraintlayout.core.parser.CLKey.sections
            java.lang.String r1 = "Variables"
            r0.add(r1)
            java.util.ArrayList<java.lang.String> r0 = androidx.constraintlayout.core.parser.CLKey.sections
            java.lang.String r1 = "Generate"
            r0.add(r1)
            java.util.ArrayList<java.lang.String> r0 = androidx.constraintlayout.core.parser.CLKey.sections
            java.lang.String r1 = "Transitions"
            r0.add(r1)
            java.util.ArrayList<java.lang.String> r0 = androidx.constraintlayout.core.parser.CLKey.sections
            java.lang.String r1 = "KeyFrames"
            r0.add(r1)
            java.util.ArrayList<java.lang.String> r0 = androidx.constraintlayout.core.parser.CLKey.sections
            java.lang.String r1 = "KeyAttributes"
            r0.add(r1)
            java.util.ArrayList<java.lang.String> r0 = androidx.constraintlayout.core.parser.CLKey.sections
            java.lang.String r1 = "KeyPositions"
            r0.add(r1)
            java.util.ArrayList<java.lang.String> r0 = androidx.constraintlayout.core.parser.CLKey.sections
            java.lang.String r1 = "KeyCycles"
            r0.add(r1)
            return
    }

    public CLKey(char[] r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(java.lang.String r3, androidx.constraintlayout.core.parser.CLElement r4) {
            androidx.constraintlayout.core.parser.CLKey r0 = new androidx.constraintlayout.core.parser.CLKey
            char[] r1 = r3.toCharArray()
            r0.<init>(r1)
            r1 = 0
            r0.setStart(r1)
            int r3 = r3.length()
            int r3 = r3 + (-1)
            long r1 = (long) r3
            r0.setEnd(r1)
            r0.set(r4)
            return r0
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] r1) {
            androidx.constraintlayout.core.parser.CLKey r0 = new androidx.constraintlayout.core.parser.CLKey
            r0.<init>(r1)
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.content()
            return r0
    }

    public androidx.constraintlayout.core.parser.CLElement getValue() {
            r2 = this;
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r2.mElements
            int r0 = r0.size()
            if (r0 <= 0) goto L12
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r2.mElements
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            androidx.constraintlayout.core.parser.CLElement r0 = (androidx.constraintlayout.core.parser.CLElement) r0
            return r0
        L12:
            r0 = 0
            return r0
    }

    public void set(androidx.constraintlayout.core.parser.CLElement r3) {
            r2 = this;
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r2.mElements
            int r0 = r0.size()
            if (r0 <= 0) goto Lf
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r2.mElements
            r1 = 0
            r0.set(r1, r3)
            goto L14
        Lf:
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r2.mElements
            r0.add(r3)
        L14:
            return
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toFormattedJSON(int r6, int r7) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r5.getDebugName()
            r0.<init>(r1)
            r5.addIndent(r0, r6)
            java.lang.String r1 = r5.content()
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r2 = r5.mElements
            int r2 = r2.size()
            if (r2 <= 0) goto L6d
            r0.append(r1)
            java.lang.String r2 = ": "
            r0.append(r2)
            java.util.ArrayList<java.lang.String> r2 = androidx.constraintlayout.core.parser.CLKey.sections
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L29
            r7 = 3
        L29:
            r1 = 0
            if (r7 <= 0) goto L3e
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r2 = r5.mElements
            java.lang.Object r1 = r2.get(r1)
            androidx.constraintlayout.core.parser.CLElement r1 = (androidx.constraintlayout.core.parser.CLElement) r1
            int r7 = r7 + (-1)
            java.lang.String r6 = r1.toFormattedJSON(r6, r7)
            r0.append(r6)
            goto L68
        L3e:
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r2 = r5.mElements
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.parser.CLElement r2 = (androidx.constraintlayout.core.parser.CLElement) r2
            java.lang.String r2 = r2.toJSON()
            int r3 = r2.length()
            int r3 = r3 + r6
            int r4 = androidx.constraintlayout.core.parser.CLKey.MAX_LINE
            if (r3 >= r4) goto L57
            r0.append(r2)
            goto L68
        L57:
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r2 = r5.mElements
            java.lang.Object r1 = r2.get(r1)
            androidx.constraintlayout.core.parser.CLElement r1 = (androidx.constraintlayout.core.parser.CLElement) r1
            int r7 = r7 + (-1)
            java.lang.String r6 = r1.toFormattedJSON(r6, r7)
            r0.append(r6)
        L68:
            java.lang.String r6 = r0.toString()
            return r6
        L6d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r7 = ": <> "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            return r6
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toJSON() {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r3.mElements
            int r0 = r0.size()
            if (r0 <= 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getDebugName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.content()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r1 = r3.mElements
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.core.parser.CLElement r1 = (androidx.constraintlayout.core.parser.CLElement) r1
            java.lang.String r1 = r1.toJSON()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getDebugName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.content()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ": <> "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
