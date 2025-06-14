package lombok.javac.java8;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/java8/CommentCollectingTokenizer.SCL.lombok */
class CommentCollectingTokenizer extends com.sun.tools.javac.parser.JavaTokenizer {
    private static final boolean tokenizerIsUnicodeReader = false;
    private int prevEndPosition;
    private final com.sun.tools.javac.util.ListBuffer<lombok.javac.CommentInfo> comments;
    private final com.sun.tools.javac.util.ListBuffer<java.lang.Integer> textBlockStarts;
    private int endComment;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/java8/CommentCollectingTokenizer$PositionUnicodeReader.SCL.lombok */
    static class PositionUnicodeReader extends com.sun.tools.javac.parser.UnicodeReader {
        protected PositionUnicodeReader(com.sun.tools.javac.parser.ScannerFactory r6, char[] r7, int r8) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                r0.<init>(r1, r2, r3)
                return
        }

        public PositionUnicodeReader(com.sun.tools.javac.parser.ScannerFactory r5, java.nio.CharBuffer r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        int pos() {
                r2 = this;
                r0 = r2
                int r0 = r0.bp
                return r0
        }
    }

    static {
            java.lang.Class<com.sun.tools.javac.parser.JavaTokenizer> r0 = com.sun.tools.javac.parser.JavaTokenizer.class
            java.lang.Class r0 = r0.getSuperclass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "UnicodeReader"
            boolean r0 = r0.equals(r1)
            lombok.javac.java8.CommentCollectingTokenizer.tokenizerIsUnicodeReader = r0
            return
    }

    static lombok.javac.java8.CommentCollectingTokenizer create(com.sun.tools.javac.parser.ScannerFactory r8, char[] r9, int r10, boolean r11) {
            boolean r0 = lombok.javac.java8.CommentCollectingTokenizer.tokenizerIsUnicodeReader
            if (r0 == 0) goto L13
            lombok.javac.java8.CommentCollectingTokenizer r0 = new lombok.javac.java8.CommentCollectingTokenizer
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = 1
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L13:
            lombok.javac.java8.CommentCollectingTokenizer r0 = new lombok.javac.java8.CommentCollectingTokenizer
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    private CommentCollectingTokenizer(com.sun.tools.javac.parser.ScannerFactory r9, char[] r10, int r11, boolean r12) {
            r8 = this;
            r0 = r8
            r1 = r9
            lombok.javac.java8.CommentCollectingTokenizer$PositionUnicodeReader r2 = new lombok.javac.java8.CommentCollectingTokenizer$PositionUnicodeReader
            r3 = r2
            r4 = r9
            r5 = r10
            r6 = r11
            r3.<init>(r4, r5, r6)
            r0.<init>(r1, r2)
            r0 = r8
            r1 = 0
            r0.prevEndPosition = r1
            r0 = r8
            com.sun.tools.javac.util.ListBuffer r1 = new com.sun.tools.javac.util.ListBuffer
            r2 = r1
            r2.<init>()
            r0.comments = r1
            r0 = r8
            r1 = 0
            r0.endComment = r1
            r0 = r8
            r1 = r12
            if (r1 == 0) goto L34
            com.sun.tools.javac.util.ListBuffer r1 = new com.sun.tools.javac.util.ListBuffer
            r2 = r1
            r2.<init>()
            goto L35
        L34:
            r1 = 0
        L35:
            r0.textBlockStarts = r1
            return
    }

    private CommentCollectingTokenizer(com.sun.tools.javac.parser.ScannerFactory r6, char[] r7, int r8, boolean r9, boolean r10) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            r0 = r5
            r1 = 0
            r0.prevEndPosition = r1
            r0 = r5
            com.sun.tools.javac.util.ListBuffer r1 = new com.sun.tools.javac.util.ListBuffer
            r2 = r1
            r2.<init>()
            r0.comments = r1
            r0 = r5
            r1 = 0
            r0.endComment = r1
            r0 = r5
            r1 = r9
            if (r1 == 0) goto L2c
            com.sun.tools.javac.util.ListBuffer r1 = new com.sun.tools.javac.util.ListBuffer
            r2 = r1
            r2.<init>()
            goto L2d
        L2c:
            r1 = 0
        L2d:
            r0.textBlockStarts = r1
            return
    }

    int pos() {
            r2 = this;
            boolean r0 = lombok.javac.java8.CommentCollectingTokenizer.tokenizerIsUnicodeReader
            if (r0 == 0) goto Lb
            r0 = r2
            int r0 = r0.position()
            return r0
        Lb:
            r0 = r2
            com.sun.tools.javac.parser.UnicodeReader r0 = r0.reader
            lombok.javac.java8.CommentCollectingTokenizer$PositionUnicodeReader r0 = (lombok.javac.java8.CommentCollectingTokenizer.PositionUnicodeReader) r0
            int r0 = r0.pos()
            return r0
    }

    public com.sun.tools.javac.parser.Tokens.Token readToken() {
            r5 = this;
            r0 = r5
            com.sun.tools.javac.parser.Tokens$Token r0 = super.readToken()
            r6 = r0
            r0 = r5
            r1 = r5
            int r1 = r1.pos()
            r0.prevEndPosition = r1
            r0 = r5
            com.sun.tools.javac.util.ListBuffer<java.lang.Integer> r0 = r0.textBlockStarts
            if (r0 == 0) goto L69
            r0 = r5
            int r0 = r0.prevEndPosition
            r1 = r6
            int r1 = r1.pos
            int r0 = r0 - r1
            r1 = 5
            if (r0 <= r1) goto L69
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "$StringToken"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L69
            r0 = r5
            com.sun.tools.javac.parser.UnicodeReader r0 = r0.reader()
            r1 = r6
            int r1 = r1.pos
            r2 = r6
            int r2 = r2.pos
            r3 = 3
            int r2 = r2 + r3
            char[] r0 = r0.getRawCharacters(r1, r2)
            r7 = r0
            r0 = r7
            r1 = 0
            char r0 = r0[r1]
            r1 = 34
            if (r0 != r1) goto L69
            r0 = r7
            r1 = 1
            char r0 = r0[r1]
            r1 = 34
            if (r0 != r1) goto L69
            r0 = r7
            r1 = 2
            char r0 = r0[r1]
            r1 = 34
            if (r0 != r1) goto L69
            r0 = r5
            com.sun.tools.javac.util.ListBuffer<java.lang.Integer> r0 = r0.textBlockStarts
            r1 = r6
            int r1 = r1.pos
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L69:
            r0 = r6
            return r0
    }

    protected com.sun.tools.javac.parser.Tokens.Comment processComment(int r10, int r11, com.sun.tools.javac.parser.Tokens.Comment.CommentStyle r12) {
            r9 = this;
            r0 = r9
            int r0 = r0.prevEndPosition
            r1 = r9
            int r1 = r1.endComment
            int r0 = java.lang.Math.max(r0, r1)
            r13 = r0
            r0 = r9
            r1 = r11
            r0.endComment = r1
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r9
            com.sun.tools.javac.parser.UnicodeReader r2 = r2.reader()
            r3 = r10
            r4 = r11
            char[] r2 = r2.getRawCharacters(r3, r4)
            r1.<init>(r2)
            r14 = r0
            r0 = r9
            r1 = r13
            r2 = r10
            lombok.javac.CommentInfo$StartConnection r0 = r0.determineStartConnection(r1, r2)
            r15 = r0
            r0 = r9
            r1 = r11
            lombok.javac.CommentInfo$EndConnection r0 = r0.determineEndConnection(r1)
            r16 = r0
            lombok.javac.CommentInfo r0 = new lombok.javac.CommentInfo
            r1 = r0
            r2 = r13
            r3 = r10
            r4 = r11
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
            r2 = r11
            r3 = r12
            com.sun.tools.javac.parser.Tokens$Comment r0 = super.processComment(r1, r2, r3)
            return r0
    }

    private lombok.javac.CommentInfo.EndConnection determineEndConnection(int r6) {
            r5 = this;
            r0 = 1
            r7 = r0
            r0 = r6
            r8 = r0
        L4:
            r0 = r5
            com.sun.tools.javac.parser.UnicodeReader r0 = r0.reader()     // Catch: java.lang.IndexOutOfBoundsException -> L16
            r1 = r8
            r2 = r8
            r3 = 1
            int r2 = r2 + r3
            char[] r0 = r0.getRawCharacters(r1, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L16
            r1 = 0
            char r0 = r0[r1]     // Catch: java.lang.IndexOutOfBoundsException -> L16
            r9 = r0
            goto L1b
        L16:
            r0 = 10
            r9 = r0
        L1b:
            r0 = r5
            r1 = r9
            boolean r0 = r0.isNewLine(r1)
            if (r0 == 0) goto L28
            lombok.javac.CommentInfo$EndConnection r0 = lombok.javac.CommentInfo.EndConnection.ON_NEXT_LINE
            return r0
        L28:
            r0 = r9
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L35
            r0 = 0
            r7 = r0
            goto L43
        L35:
            r0 = r7
            if (r0 == 0) goto L3f
            lombok.javac.CommentInfo$EndConnection r0 = lombok.javac.CommentInfo.EndConnection.DIRECT_AFTER_COMMENT
            goto L42
        L3f:
            lombok.javac.CommentInfo$EndConnection r0 = lombok.javac.CommentInfo.EndConnection.AFTER_COMMENT
        L42:
            return r0
        L43:
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
            com.sun.tools.javac.parser.UnicodeReader r0 = r0.reader()
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
            if (r0 == 0) goto L24
            lombok.javac.CommentInfo$StartConnection r0 = lombok.javac.CommentInfo.StartConnection.START_OF_LINE
            return r0
        L24:
            r0 = r8
            r1 = r0
            r12 = r1
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r10 = r0
            goto L48
        L31:
            r0 = r12
            r1 = r10
            char r0 = r0[r1]
            r9 = r0
            r0 = r5
            r1 = r9
            boolean r0 = r0.isNewLine(r1)
            if (r0 == 0) goto L45
            lombok.javac.CommentInfo$StartConnection r0 = lombok.javac.CommentInfo.StartConnection.ON_NEXT_LINE
            return r0
        L45:
            int r10 = r10 + 1
        L48:
            r0 = r10
            r1 = r11
            if (r0 < r1) goto L31
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

    public com.sun.tools.javac.util.List<java.lang.Integer> getTextBlockStarts() {
            r2 = this;
            r0 = r2
            com.sun.tools.javac.util.ListBuffer<java.lang.Integer> r0 = r0.textBlockStarts
            if (r0 != 0) goto Ld
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            goto L14
        Ld:
            r0 = r2
            com.sun.tools.javac.util.ListBuffer<java.lang.Integer> r0 = r0.textBlockStarts
            com.sun.tools.javac.util.List r0 = r0.toList()
        L14:
            return r0
    }

    private com.sun.tools.javac.parser.UnicodeReader reader() {
            r2 = this;
            boolean r0 = lombok.javac.java8.CommentCollectingTokenizer.tokenizerIsUnicodeReader
            if (r0 == 0) goto Lb
            r0 = r2
            com.sun.tools.javac.parser.UnicodeReader r0 = (com.sun.tools.javac.parser.UnicodeReader) r0
            return r0
        Lb:
            r0 = r2
            com.sun.tools.javac.parser.UnicodeReader r0 = r0.reader
            return r0
    }
}
