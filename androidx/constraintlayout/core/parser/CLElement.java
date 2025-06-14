package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLElement {
    protected static int BASE_INDENT = 2;
    protected static int MAX_LINE = 80;
    protected long end;
    private int line;
    protected androidx.constraintlayout.core.parser.CLContainer mContainer;
    private final char[] mContent;
    protected long start;

    static {
            return
    }

    public CLElement(char[] r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.start = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.end = r0
            r2.mContent = r3
            return
    }

    protected void addIndent(java.lang.StringBuilder r3, int r4) {
            r2 = this;
            r0 = 0
        L1:
            if (r0 >= r4) goto Lb
            r1 = 32
            r3.append(r1)
            int r0 = r0 + 1
            goto L1
        Lb:
            return
    }

    public java.lang.String content() {
            r6 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r6.mContent
            r0.<init>(r1)
            long r1 = r6.end
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
            long r3 = r6.start
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L19
            goto L22
        L19:
            int r3 = (int) r3
            int r1 = (int) r1
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r3, r1)
            return r0
        L22:
            long r1 = r6.start
            int r3 = (int) r1
            int r1 = (int) r1
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r3, r1)
            return r0
    }

    public androidx.constraintlayout.core.parser.CLElement getContainer() {
            r1 = this;
            androidx.constraintlayout.core.parser.CLContainer r0 = r1.mContainer
            return r0
    }

    protected java.lang.String getDebugName() {
            r2 = this;
            boolean r0 = androidx.constraintlayout.core.parser.CLParser.DEBUG
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.getStrClass()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " -> "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1c:
            java.lang.String r0 = ""
            return r0
    }

    public long getEnd() {
            r2 = this;
            long r0 = r2.end
            return r0
    }

    public float getFloat() {
            r1 = this;
            boolean r0 = r1 instanceof androidx.constraintlayout.core.parser.CLNumber
            if (r0 == 0) goto Lc
            r0 = r1
            androidx.constraintlayout.core.parser.CLNumber r0 = (androidx.constraintlayout.core.parser.CLNumber) r0
            float r0 = r0.getFloat()
            return r0
        Lc:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
    }

    public int getInt() {
            r1 = this;
            boolean r0 = r1 instanceof androidx.constraintlayout.core.parser.CLNumber
            if (r0 == 0) goto Lc
            r0 = r1
            androidx.constraintlayout.core.parser.CLNumber r0 = (androidx.constraintlayout.core.parser.CLNumber) r0
            int r0 = r0.getInt()
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public int getLine() {
            r1 = this;
            int r0 = r1.line
            return r0
    }

    public long getStart() {
            r2 = this;
            long r0 = r2.start
            return r0
    }

    protected java.lang.String getStrClass() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.toString()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            return r0
    }

    public boolean isDone() {
            r4 = this;
            long r0 = r4.end
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public boolean isStarted() {
            r4 = this;
            long r0 = r4.start
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public boolean notStarted() {
            r4 = this;
            long r0 = r4.start
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public void setContainer(androidx.constraintlayout.core.parser.CLContainer r1) {
            r0 = this;
            r0.mContainer = r1
            return
    }

    public void setEnd(long r5) {
            r4 = this;
            long r0 = r4.end
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lc
            return
        Lc:
            r4.end = r5
            boolean r5 = androidx.constraintlayout.core.parser.CLParser.DEBUG
            if (r5 == 0) goto L34
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "closing "
            r6.<init>(r0)
            int r0 = r4.hashCode()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = " -> "
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.String r6 = r6.toString()
            r5.println(r6)
        L34:
            androidx.constraintlayout.core.parser.CLContainer r5 = r4.mContainer
            if (r5 == 0) goto L3b
            r5.add(r4)
        L3b:
            return
    }

    public void setLine(int r1) {
            r0 = this;
            r0.line = r1
            return
    }

    public void setStart(long r1) {
            r0 = this;
            r0.start = r1
            return
    }

    protected java.lang.String toFormattedJSON(int r1, int r2) {
            r0 = this;
            java.lang.String r1 = ""
            return r1
    }

    protected java.lang.String toJSON() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            long r0 = r4.start
            long r2 = r4.end
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L5f
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L12
            goto L5f
        L12:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.mContent
            r0.<init>(r1)
            long r1 = r4.start
            int r1 = (int) r1
            long r2 = r4.end
            int r2 = (int) r2
            int r2 = r2 + 1
            java.lang.String r0 = r0.substring(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getStrClass()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " ("
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = r4.start
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " : "
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = r4.end
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ") <<"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ">>"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L5f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r4.getClass()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " (INVALID, "
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r4.start
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "-"
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r4.end
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
