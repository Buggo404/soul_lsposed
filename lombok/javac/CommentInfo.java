package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/CommentInfo.SCL.lombok */
public final class CommentInfo {
    public final int pos;
    public final int prevEndPos;
    public final java.lang.String content;
    public final int endPos;
    public final lombok.javac.CommentInfo.StartConnection start;
    public final lombok.javac.CommentInfo.EndConnection end;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/CommentInfo$EndConnection.SCL.lombok */
    public enum EndConnection extends java.lang.Enum<lombok.javac.CommentInfo.EndConnection> {
        public static final lombok.javac.CommentInfo.EndConnection DIRECT_AFTER_COMMENT = null;
        public static final lombok.javac.CommentInfo.EndConnection AFTER_COMMENT = null;
        public static final lombok.javac.CommentInfo.EndConnection ON_NEXT_LINE = null;
        private static final /* synthetic */ lombok.javac.CommentInfo.EndConnection[] ENUM$VALUES = null;

        static {
                lombok.javac.CommentInfo$EndConnection r0 = new lombok.javac.CommentInfo$EndConnection
                r1 = r0
                java.lang.String r2 = "DIRECT_AFTER_COMMENT"
                r3 = 0
                r1.<init>(r2, r3)
                lombok.javac.CommentInfo.EndConnection.DIRECT_AFTER_COMMENT = r0
                lombok.javac.CommentInfo$EndConnection r0 = new lombok.javac.CommentInfo$EndConnection
                r1 = r0
                java.lang.String r2 = "AFTER_COMMENT"
                r3 = 1
                r1.<init>(r2, r3)
                lombok.javac.CommentInfo.EndConnection.AFTER_COMMENT = r0
                lombok.javac.CommentInfo$EndConnection r0 = new lombok.javac.CommentInfo$EndConnection
                r1 = r0
                java.lang.String r2 = "ON_NEXT_LINE"
                r3 = 2
                r1.<init>(r2, r3)
                lombok.javac.CommentInfo.EndConnection.ON_NEXT_LINE = r0
                r0 = 3
                lombok.javac.CommentInfo$EndConnection[] r0 = new lombok.javac.CommentInfo.EndConnection[r0]
                r1 = r0
                r2 = 0
                lombok.javac.CommentInfo$EndConnection r3 = lombok.javac.CommentInfo.EndConnection.DIRECT_AFTER_COMMENT
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.javac.CommentInfo$EndConnection r3 = lombok.javac.CommentInfo.EndConnection.AFTER_COMMENT
                r1[r2] = r3
                r1 = r0
                r2 = 2
                lombok.javac.CommentInfo$EndConnection r3 = lombok.javac.CommentInfo.EndConnection.ON_NEXT_LINE
                r1[r2] = r3
                lombok.javac.CommentInfo.EndConnection.ENUM$VALUES = r0
                return
        }

        EndConnection(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        public static lombok.javac.CommentInfo.EndConnection[] values() {
                lombok.javac.CommentInfo$EndConnection[] r0 = lombok.javac.CommentInfo.EndConnection.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.javac.CommentInfo$EndConnection[] r2 = new lombok.javac.CommentInfo.EndConnection[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.javac.CommentInfo.EndConnection valueOf(java.lang.String r3) {
                java.lang.Class<lombok.javac.CommentInfo$EndConnection> r0 = lombok.javac.CommentInfo.EndConnection.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.javac.CommentInfo$EndConnection r0 = (lombok.javac.CommentInfo.EndConnection) r0
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/CommentInfo$StartConnection.SCL.lombok */
    public enum StartConnection extends java.lang.Enum<lombok.javac.CommentInfo.StartConnection> {
        public static final lombok.javac.CommentInfo.StartConnection START_OF_LINE = null;
        public static final lombok.javac.CommentInfo.StartConnection ON_NEXT_LINE = null;
        public static final lombok.javac.CommentInfo.StartConnection DIRECT_AFTER_PREVIOUS = null;
        public static final lombok.javac.CommentInfo.StartConnection AFTER_PREVIOUS = null;
        private static final /* synthetic */ lombok.javac.CommentInfo.StartConnection[] ENUM$VALUES = null;

        static {
                lombok.javac.CommentInfo$StartConnection r0 = new lombok.javac.CommentInfo$StartConnection
                r1 = r0
                java.lang.String r2 = "START_OF_LINE"
                r3 = 0
                r1.<init>(r2, r3)
                lombok.javac.CommentInfo.StartConnection.START_OF_LINE = r0
                lombok.javac.CommentInfo$StartConnection r0 = new lombok.javac.CommentInfo$StartConnection
                r1 = r0
                java.lang.String r2 = "ON_NEXT_LINE"
                r3 = 1
                r1.<init>(r2, r3)
                lombok.javac.CommentInfo.StartConnection.ON_NEXT_LINE = r0
                lombok.javac.CommentInfo$StartConnection r0 = new lombok.javac.CommentInfo$StartConnection
                r1 = r0
                java.lang.String r2 = "DIRECT_AFTER_PREVIOUS"
                r3 = 2
                r1.<init>(r2, r3)
                lombok.javac.CommentInfo.StartConnection.DIRECT_AFTER_PREVIOUS = r0
                lombok.javac.CommentInfo$StartConnection r0 = new lombok.javac.CommentInfo$StartConnection
                r1 = r0
                java.lang.String r2 = "AFTER_PREVIOUS"
                r3 = 3
                r1.<init>(r2, r3)
                lombok.javac.CommentInfo.StartConnection.AFTER_PREVIOUS = r0
                r0 = 4
                lombok.javac.CommentInfo$StartConnection[] r0 = new lombok.javac.CommentInfo.StartConnection[r0]
                r1 = r0
                r2 = 0
                lombok.javac.CommentInfo$StartConnection r3 = lombok.javac.CommentInfo.StartConnection.START_OF_LINE
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.javac.CommentInfo$StartConnection r3 = lombok.javac.CommentInfo.StartConnection.ON_NEXT_LINE
                r1[r2] = r3
                r1 = r0
                r2 = 2
                lombok.javac.CommentInfo$StartConnection r3 = lombok.javac.CommentInfo.StartConnection.DIRECT_AFTER_PREVIOUS
                r1[r2] = r3
                r1 = r0
                r2 = 3
                lombok.javac.CommentInfo$StartConnection r3 = lombok.javac.CommentInfo.StartConnection.AFTER_PREVIOUS
                r1[r2] = r3
                lombok.javac.CommentInfo.StartConnection.ENUM$VALUES = r0
                return
        }

        StartConnection(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        public static lombok.javac.CommentInfo.StartConnection[] values() {
                lombok.javac.CommentInfo$StartConnection[] r0 = lombok.javac.CommentInfo.StartConnection.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.javac.CommentInfo$StartConnection[] r2 = new lombok.javac.CommentInfo.StartConnection[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.javac.CommentInfo.StartConnection valueOf(java.lang.String r3) {
                java.lang.Class<lombok.javac.CommentInfo$StartConnection> r0 = lombok.javac.CommentInfo.StartConnection.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.javac.CommentInfo$StartConnection r0 = (lombok.javac.CommentInfo.StartConnection) r0
                return r0
        }
    }

    public CommentInfo(int r4, int r5, int r6, java.lang.String r7, lombok.javac.CommentInfo.StartConnection r8, lombok.javac.CommentInfo.EndConnection r9) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r5
            r0.pos = r1
            r0 = r3
            r1 = r4
            r0.prevEndPos = r1
            r0 = r3
            r1 = r6
            r0.endPos = r1
            r0 = r3
            r1 = r7
            r0.content = r1
            r0 = r3
            r1 = r8
            r0.start = r1
            r0 = r3
            r1 = r9
            r0.end = r1
            return
    }

    public boolean isJavadoc() {
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.content
            java.lang.String r1 = "/**"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L19
            r0 = r3
            java.lang.String r0 = r0.content
            int r0 = r0.length()
            r1 = 4
            if (r0 <= r1) goto L19
            r0 = 1
            return r0
        L19:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = "%d: %s (%s,%s)"
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r6
            int r4 = r4.pos
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r6
            java.lang.String r4 = r4.content
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r6
            lombok.javac.CommentInfo$StartConnection r4 = r4.start
            r2[r3] = r4
            r2 = r1
            r3 = 3
            r4 = r6
            lombok.javac.CommentInfo$EndConnection r4 = r4.end
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            return r0
    }
}
