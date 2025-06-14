package lombok.javac.java6;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/java6/CommentCollectingScanner.SCL.lombok */
public class CommentCollectingScanner extends com.sun.tools.javac.parser.Scanner {
    private final com.sun.tools.javac.util.ListBuffer<lombok.javac.CommentInfo> comments;
    private int endComment;

    public CommentCollectingScanner(lombok.javac.java6.CommentCollectingScannerFactory r5, java.nio.CharBuffer r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            com.sun.tools.javac.util.ListBuffer r1 = new com.sun.tools.javac.util.ListBuffer
            r2 = r1
            r2.<init>()
            r0.comments = r1
            r0 = r4
            r1 = 0
            r0.endComment = r1
            return
    }

    public CommentCollectingScanner(lombok.javac.java6.CommentCollectingScannerFactory r6, char[] r7, int r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            r0 = r5
            com.sun.tools.javac.util.ListBuffer r1 = new com.sun.tools.javac.util.ListBuffer
            r2 = r1
            r2.<init>()
            r0.comments = r1
            r0 = r5
            r1 = 0
            r0.endComment = r1
            return
    }

    protected void processComment(com.sun.tools.javac.parser.Scanner.CommentStyle r10) {
            r9 = this;
            r0 = r9
            int r0 = r0.prevEndPos()
            r1 = r9
            int r1 = r1.endComment
            int r0 = java.lang.Math.max(r0, r1)
            r11 = r0
            r0 = r9
            int r0 = r0.pos()
            r12 = r0
            r0 = r9
            int r0 = r0.endPos()
            r13 = r0
            r0 = r9
            r1 = r13
            r0.endComment = r1
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r9
            r3 = r12
            r4 = r13
            char[] r2 = r2.getRawCharacters(r3, r4)
            r1.<init>(r2)
            r14 = r0
            r0 = r9
            r1 = r11
            r2 = r12
            lombok.javac.CommentInfo$StartConnection r0 = r0.determineStartConnection(r1, r2)
            r15 = r0
            r0 = r9
            r1 = r13
            lombok.javac.CommentInfo$EndConnection r0 = r0.determineEndConnection(r1)
            r16 = r0
            lombok.javac.CommentInfo r0 = new lombok.javac.CommentInfo
            r1 = r0
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r17 = r0
            r0 = r9
            com.sun.tools.javac.util.ListBuffer<lombok.javac.CommentInfo> r0 = r0.comments
            r1 = r17
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r9
            r1 = r10
            super.processComment(r1)
            return
    }

    private lombok.javac.CommentInfo.EndConnection determineEndConnection(int r6) {
            r5 = this;
            r0 = 1
            r7 = r0
            r0 = r6
            r8 = r0
        L4:
            r0 = r5
            r1 = r8
            r2 = r8
            r3 = 1
            int r2 = r2 + r3
            char[] r0 = r0.getRawCharacters(r1, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L13
            r1 = 0
            char r0 = r0[r1]     // Catch: java.lang.IndexOutOfBoundsException -> L13
            r9 = r0
            goto L18
        L13:
            r0 = 10
            r9 = r0
        L18:
            r0 = r5
            r1 = r9
            boolean r0 = r0.isNewLine(r1)
            if (r0 == 0) goto L25
            lombok.javac.CommentInfo$EndConnection r0 = lombok.javac.CommentInfo.EndConnection.ON_NEXT_LINE
            return r0
        L25:
            r0 = r9
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L32
            r0 = 0
            r7 = r0
            goto L40
        L32:
            r0 = r7
            if (r0 == 0) goto L3c
            lombok.javac.CommentInfo$EndConnection r0 = lombok.javac.CommentInfo.EndConnection.DIRECT_AFTER_COMMENT
            goto L3f
        L3c:
            lombok.javac.CommentInfo$EndConnection r0 = lombok.javac.CommentInfo.EndConnection.AFTER_COMMENT
        L3f:
            return r0
        L40:
            int r8 = r8 + 1
            goto L4
    }

    private lombok.javac.CommentInfo.StartConnection determineStartConnection(int r6, int r7) {
            r5 = this;
            r0 = r6
            r1 = r7
            if (r0 != r1) goto L9
            lombok.javac.CommentInfo$StartConnection r0 = lombok.javac.CommentInfo.StartConnection.DIRECT_AFTER_PREVIOUS
            return r0
        L9:
            r0 = r5
            r1 = r6
            r2 = r7
            char[] r0 = r0.getRawCharacters(r1, r2)
            r8 = r0
            r0 = r5
            r1 = r8
            r2 = r8
            int r2 = r2.length
            r3 = 1
            int r2 = r2 - r3
            char r1 = r1[r2]
            boolean r0 = r0.isNewLine(r1)
            if (r0 == 0) goto L21
            lombok.javac.CommentInfo$StartConnection r0 = lombok.javac.CommentInfo.StartConnection.START_OF_LINE
            return r0
        L21:
            r0 = r8
            r1 = r0
            r12 = r1
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r10 = r0
            goto L45
        L2e:
            r0 = r12
            r1 = r10
            char r0 = r0[r1]
            r9 = r0
            r0 = r5
            r1 = r9
            boolean r0 = r0.isNewLine(r1)
            if (r0 == 0) goto L42
            lombok.javac.CommentInfo$StartConnection r0 = lombok.javac.CommentInfo.StartConnection.ON_NEXT_LINE
            return r0
        L42:
            int r10 = r10 + 1
        L45:
            r0 = r10
            r1 = r11
            if (r0 < r1) goto L2e
            lombok.javac.CommentInfo$StartConnection r0 = lombok.javac.CommentInfo.StartConnection.AFTER_PREVIOUS
            return r0
    }

    private boolean isNewLine(char r4) {
            r3 = this;
            r0 = r4
            r1 = 10
            if (r0 == r1) goto Le
            r0 = r4
            r1 = 13
            if (r0 == r1) goto Le
            r0 = 0
            return r0
        Le:
            r0 = 1
            return r0
    }

    public com.sun.tools.javac.util.List<lombok.javac.CommentInfo> getComments() {
            r2 = this;
            r0 = r2
            com.sun.tools.javac.util.ListBuffer<lombok.javac.CommentInfo> r0 = r0.comments
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }
}
