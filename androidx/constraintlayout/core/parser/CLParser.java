package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLParser {
    static boolean DEBUG = false;
    private boolean hasComment;
    private int lineNumber;
    private java.lang.String mContent;

    /* renamed from: androidx.constraintlayout.core.parser.CLParser$1 */
    static /* synthetic */ class C01201 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE = null;

        static {
                androidx.constraintlayout.core.parser.CLParser$TYPE[] r0 = androidx.constraintlayout.core.parser.CLParser.TYPE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.parser.CLParser.C01201.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE = r0
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.OBJECT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.parser.CLParser.C01201.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.ARRAY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.parser.CLParser.C01201.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.STRING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.core.parser.CLParser.C01201.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.NUMBER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.core.parser.CLParser.C01201.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.KEY     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.constraintlayout.core.parser.CLParser.C01201.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.TOKEN     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }

    enum TYPE extends java.lang.Enum<androidx.constraintlayout.core.parser.CLParser.TYPE> {
        private static final /* synthetic */ androidx.constraintlayout.core.parser.CLParser.TYPE[] $VALUES = null;
        public static final androidx.constraintlayout.core.parser.CLParser.TYPE ARRAY = null;
        public static final androidx.constraintlayout.core.parser.CLParser.TYPE KEY = null;
        public static final androidx.constraintlayout.core.parser.CLParser.TYPE NUMBER = null;
        public static final androidx.constraintlayout.core.parser.CLParser.TYPE OBJECT = null;
        public static final androidx.constraintlayout.core.parser.CLParser.TYPE STRING = null;
        public static final androidx.constraintlayout.core.parser.CLParser.TYPE TOKEN = null;
        public static final androidx.constraintlayout.core.parser.CLParser.TYPE UNKNOWN = null;

        static {
                androidx.constraintlayout.core.parser.CLParser$TYPE r0 = new androidx.constraintlayout.core.parser.CLParser$TYPE
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.parser.CLParser.TYPE.UNKNOWN = r0
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = new androidx.constraintlayout.core.parser.CLParser$TYPE
                java.lang.String r3 = "OBJECT"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.core.parser.CLParser.TYPE.OBJECT = r1
                androidx.constraintlayout.core.parser.CLParser$TYPE r3 = new androidx.constraintlayout.core.parser.CLParser$TYPE
                java.lang.String r5 = "ARRAY"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.core.parser.CLParser.TYPE.ARRAY = r3
                androidx.constraintlayout.core.parser.CLParser$TYPE r5 = new androidx.constraintlayout.core.parser.CLParser$TYPE
                java.lang.String r7 = "NUMBER"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.core.parser.CLParser.TYPE.NUMBER = r5
                androidx.constraintlayout.core.parser.CLParser$TYPE r7 = new androidx.constraintlayout.core.parser.CLParser$TYPE
                java.lang.String r9 = "STRING"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.constraintlayout.core.parser.CLParser.TYPE.STRING = r7
                androidx.constraintlayout.core.parser.CLParser$TYPE r9 = new androidx.constraintlayout.core.parser.CLParser$TYPE
                java.lang.String r11 = "KEY"
                r12 = 5
                r9.<init>(r11, r12)
                androidx.constraintlayout.core.parser.CLParser.TYPE.KEY = r9
                androidx.constraintlayout.core.parser.CLParser$TYPE r11 = new androidx.constraintlayout.core.parser.CLParser$TYPE
                java.lang.String r13 = "TOKEN"
                r14 = 6
                r11.<init>(r13, r14)
                androidx.constraintlayout.core.parser.CLParser.TYPE.TOKEN = r11
                r13 = 7
                androidx.constraintlayout.core.parser.CLParser$TYPE[] r13 = new androidx.constraintlayout.core.parser.CLParser.TYPE[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                androidx.constraintlayout.core.parser.CLParser.TYPE.$VALUES = r13
                return
        }

        TYPE(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.parser.CLParser.TYPE valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.parser.CLParser$TYPE> r0 = androidx.constraintlayout.core.parser.CLParser.TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = (androidx.constraintlayout.core.parser.CLParser.TYPE) r1
                return r1
        }

        public static androidx.constraintlayout.core.parser.CLParser.TYPE[] values() {
                androidx.constraintlayout.core.parser.CLParser$TYPE[] r0 = androidx.constraintlayout.core.parser.CLParser.TYPE.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.parser.CLParser$TYPE[] r0 = (androidx.constraintlayout.core.parser.CLParser.TYPE[]) r0
                return r0
        }
    }

    static {
            return
    }

    public CLParser(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.hasComment = r0
            r1.mContent = r2
            return
    }

    private androidx.constraintlayout.core.parser.CLElement createElement(androidx.constraintlayout.core.parser.CLElement r4, int r5, androidx.constraintlayout.core.parser.CLParser.TYPE r6, boolean r7, char[] r8) {
            r3 = this;
            boolean r0 = androidx.constraintlayout.core.parser.CLParser.DEBUG
            if (r0 == 0) goto L24
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CREATE "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " at "
            java.lang.StringBuilder r1 = r1.append(r2)
            char r2 = r8[r5]
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L24:
            int[] r0 = androidx.constraintlayout.core.parser.CLParser.C01201.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE
            int r6 = r6.ordinal()
            r6 = r0[r6]
            r0 = 0
            switch(r6) {
                case 1: goto L4b;
                case 2: goto L46;
                case 3: goto L41;
                case 4: goto L3c;
                case 5: goto L37;
                case 6: goto L32;
                default: goto L30;
            }
        L30:
            r6 = r0
            goto L51
        L32:
            androidx.constraintlayout.core.parser.CLElement r6 = androidx.constraintlayout.core.parser.CLToken.allocate(r8)
            goto L51
        L37:
            androidx.constraintlayout.core.parser.CLElement r6 = androidx.constraintlayout.core.parser.CLKey.allocate(r8)
            goto L51
        L3c:
            androidx.constraintlayout.core.parser.CLElement r6 = androidx.constraintlayout.core.parser.CLNumber.allocate(r8)
            goto L51
        L41:
            androidx.constraintlayout.core.parser.CLElement r6 = androidx.constraintlayout.core.parser.CLString.allocate(r8)
            goto L51
        L46:
            androidx.constraintlayout.core.parser.CLElement r6 = androidx.constraintlayout.core.parser.CLArray.allocate(r8)
            goto L4f
        L4b:
            androidx.constraintlayout.core.parser.CLObject r6 = androidx.constraintlayout.core.parser.CLObject.allocate(r8)
        L4f:
            int r5 = r5 + 1
        L51:
            if (r6 != 0) goto L54
            return r0
        L54:
            int r8 = r3.lineNumber
            r6.setLine(r8)
            if (r7 == 0) goto L5f
            long r7 = (long) r5
            r6.setStart(r7)
        L5f:
            boolean r5 = r4 instanceof androidx.constraintlayout.core.parser.CLContainer
            if (r5 == 0) goto L68
            androidx.constraintlayout.core.parser.CLContainer r4 = (androidx.constraintlayout.core.parser.CLContainer) r4
            r6.setContainer(r4)
        L68:
            return r6
    }

    private androidx.constraintlayout.core.parser.CLElement getNextJsonElement(int r8, char r9, androidx.constraintlayout.core.parser.CLElement r10, char[] r11) throws androidx.constraintlayout.core.parser.CLParsingException {
            r7 = this;
            r0 = 9
            if (r9 == r0) goto Ld5
            r0 = 10
            if (r9 == r0) goto Ld5
            r0 = 13
            if (r9 == r0) goto Ld5
            r0 = 32
            if (r9 == r0) goto Ld5
            r0 = 34
            if (r9 == r0) goto Lba
            r0 = 39
            if (r9 == r0) goto Lba
            r0 = 91
            if (r9 == r0) goto Lae
            r0 = 93
            if (r9 == r0) goto L9f
            r0 = 123(0x7b, float:1.72E-43)
            if (r9 == r0) goto L93
            r0 = 125(0x7d, float:1.75E-43)
            if (r9 == r0) goto L9f
            switch(r9) {
                case 43: goto L87;
                case 44: goto Ld5;
                case 45: goto L87;
                case 46: goto L87;
                case 47: goto L78;
                case 48: goto L87;
                case 49: goto L87;
                case 50: goto L87;
                case 51: goto L87;
                case 52: goto L87;
                case 53: goto L87;
                case 54: goto L87;
                case 55: goto L87;
                case 56: goto L87;
                case 57: goto L87;
                case 58: goto Ld5;
                default: goto L2b;
            }
        L2b:
            boolean r0 = r10 instanceof androidx.constraintlayout.core.parser.CLContainer
            if (r0 == 0) goto L6b
            boolean r0 = r10 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r0 != 0) goto L6b
            androidx.constraintlayout.core.parser.CLParser$TYPE r4 = androidx.constraintlayout.core.parser.CLParser.TYPE.TOKEN
            r5 = 1
            r1 = r7
            r2 = r10
            r3 = r8
            r6 = r11
            androidx.constraintlayout.core.parser.CLElement r10 = r1.createElement(r2, r3, r4, r5, r6)
            r11 = r10
            androidx.constraintlayout.core.parser.CLToken r11 = (androidx.constraintlayout.core.parser.CLToken) r11
            long r0 = (long) r8
            boolean r8 = r11.validate(r9, r0)
            if (r8 == 0) goto L4a
            goto Ld5
        L4a:
            androidx.constraintlayout.core.parser.CLParsingException r8 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "incorrect token <"
            r10.<init>(r0)
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r10 = "> at line "
            java.lang.StringBuilder r9 = r9.append(r10)
            int r10 = r7.lineNumber
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9, r11)
            throw r8
        L6b:
            androidx.constraintlayout.core.parser.CLParser$TYPE r3 = androidx.constraintlayout.core.parser.CLParser.TYPE.KEY
            r4 = 1
            r0 = r7
            r1 = r10
            r2 = r8
            r5 = r11
            androidx.constraintlayout.core.parser.CLElement r10 = r0.createElement(r1, r2, r3, r4, r5)
            goto Ld5
        L78:
            r9 = 1
            int r8 = r8 + r9
            int r0 = r11.length
            if (r8 >= r0) goto Ld5
            char r8 = r11[r8]
            r11 = 47
            if (r8 != r11) goto Ld5
            r7.hasComment = r9
            goto Ld5
        L87:
            androidx.constraintlayout.core.parser.CLParser$TYPE r3 = androidx.constraintlayout.core.parser.CLParser.TYPE.NUMBER
            r4 = 1
            r0 = r7
            r1 = r10
            r2 = r8
            r5 = r11
            androidx.constraintlayout.core.parser.CLElement r10 = r0.createElement(r1, r2, r3, r4, r5)
            goto Ld5
        L93:
            androidx.constraintlayout.core.parser.CLParser$TYPE r3 = androidx.constraintlayout.core.parser.CLParser.TYPE.OBJECT
            r4 = 1
            r0 = r7
            r1 = r10
            r2 = r8
            r5 = r11
            androidx.constraintlayout.core.parser.CLElement r10 = r0.createElement(r1, r2, r3, r4, r5)
            goto Ld5
        L9f:
            int r9 = r8 + (-1)
            long r0 = (long) r9
            r10.setEnd(r0)
            androidx.constraintlayout.core.parser.CLElement r10 = r10.getContainer()
            long r8 = (long) r8
            r10.setEnd(r8)
            goto Ld5
        Lae:
            androidx.constraintlayout.core.parser.CLParser$TYPE r3 = androidx.constraintlayout.core.parser.CLParser.TYPE.ARRAY
            r4 = 1
            r0 = r7
            r1 = r10
            r2 = r8
            r5 = r11
            androidx.constraintlayout.core.parser.CLElement r10 = r0.createElement(r1, r2, r3, r4, r5)
            goto Ld5
        Lba:
            boolean r9 = r10 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r9 == 0) goto Lca
            androidx.constraintlayout.core.parser.CLParser$TYPE r3 = androidx.constraintlayout.core.parser.CLParser.TYPE.KEY
            r4 = 1
            r0 = r7
            r1 = r10
            r2 = r8
            r5 = r11
            androidx.constraintlayout.core.parser.CLElement r10 = r0.createElement(r1, r2, r3, r4, r5)
            goto Ld5
        Lca:
            androidx.constraintlayout.core.parser.CLParser$TYPE r3 = androidx.constraintlayout.core.parser.CLParser.TYPE.STRING
            r4 = 1
            r0 = r7
            r1 = r10
            r2 = r8
            r5 = r11
            androidx.constraintlayout.core.parser.CLElement r10 = r0.createElement(r1, r2, r3, r4, r5)
        Ld5:
            return r10
    }

    public static androidx.constraintlayout.core.parser.CLObject parse(java.lang.String r1) throws androidx.constraintlayout.core.parser.CLParsingException {
            androidx.constraintlayout.core.parser.CLParser r0 = new androidx.constraintlayout.core.parser.CLParser
            r0.<init>(r1)
            androidx.constraintlayout.core.parser.CLObject r1 = r0.parse()
            return r1
    }

    public androidx.constraintlayout.core.parser.CLObject parse() throws androidx.constraintlayout.core.parser.CLParsingException {
            r16 = this;
            r0 = r16
            java.lang.String r1 = r0.mContent
            char[] r1 = r1.toCharArray()
            int r2 = r1.length
            r3 = 1
            r0.lineNumber = r3
            r4 = 0
            r5 = r4
        Le:
            r6 = 10
            r7 = -1
            if (r5 >= r2) goto L24
            char r8 = r1[r5]
            r9 = 123(0x7b, float:1.72E-43)
            if (r8 != r9) goto L1a
            goto L25
        L1a:
            if (r8 != r6) goto L21
            int r6 = r0.lineNumber
            int r6 = r6 + r3
            r0.lineNumber = r6
        L21:
            int r5 = r5 + 1
            goto Le
        L24:
            r5 = r7
        L25:
            if (r5 == r7) goto L18f
            androidx.constraintlayout.core.parser.CLObject r7 = androidx.constraintlayout.core.parser.CLObject.allocate(r1)
            int r8 = r0.lineNumber
            r7.setLine(r8)
            long r8 = (long) r5
            r7.setStart(r8)
            int r5 = r5 + r3
            r8 = r7
        L36:
            if (r5 >= r2) goto L150
            char r9 = r1[r5]
            if (r9 != r6) goto L41
            int r10 = r0.lineNumber
            int r10 = r10 + r3
            r0.lineNumber = r10
        L41:
            boolean r10 = r0.hasComment
            if (r10 == 0) goto L49
            if (r9 != r6) goto L14a
            r0.hasComment = r4
        L49:
            if (r8 != 0) goto L4d
            goto L150
        L4d:
            boolean r10 = r8.isDone()
            if (r10 == 0) goto L59
            androidx.constraintlayout.core.parser.CLElement r8 = r0.getNextJsonElement(r5, r9, r8, r1)
            goto L131
        L59:
            boolean r10 = r8 instanceof androidx.constraintlayout.core.parser.CLObject
            r11 = 125(0x7d, float:1.75E-43)
            if (r10 == 0) goto L6f
            if (r9 != r11) goto L69
            int r9 = r5 + (-1)
            long r9 = (long) r9
            r8.setEnd(r9)
            goto L131
        L69:
            androidx.constraintlayout.core.parser.CLElement r8 = r0.getNextJsonElement(r5, r9, r8, r1)
            goto L131
        L6f:
            boolean r10 = r8 instanceof androidx.constraintlayout.core.parser.CLArray
            r12 = 93
            if (r10 == 0) goto L85
            if (r9 != r12) goto L7f
            int r9 = r5 + (-1)
            long r9 = (long) r9
            r8.setEnd(r9)
            goto L131
        L7f:
            androidx.constraintlayout.core.parser.CLElement r8 = r0.getNextJsonElement(r5, r9, r8, r1)
            goto L131
        L85:
            boolean r10 = r8 instanceof androidx.constraintlayout.core.parser.CLString
            r13 = 1
            if (r10 == 0) goto La0
            long r10 = r8.start
            int r10 = (int) r10
            char r10 = r1[r10]
            if (r10 != r9) goto L131
            long r9 = r8.start
            long r9 = r9 + r13
            r8.setStart(r9)
            int r9 = r5 + (-1)
            long r9 = (long) r9
            r8.setEnd(r9)
            goto L131
        La0:
            boolean r15 = r8 instanceof androidx.constraintlayout.core.parser.CLToken
            if (r15 == 0) goto Ld4
            r15 = r8
            androidx.constraintlayout.core.parser.CLToken r15 = (androidx.constraintlayout.core.parser.CLToken) r15
            long r3 = (long) r5
            boolean r3 = r15.validate(r9, r3)
            if (r3 == 0) goto Laf
            goto Ld4
        Laf:
            androidx.constraintlayout.core.parser.CLParsingException r1 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "parsing incorrect token "
            r2.<init>(r3)
            java.lang.String r3 = r15.content()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " at line "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r0.lineNumber
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r15)
            throw r1
        Ld4:
            boolean r3 = r8 instanceof androidx.constraintlayout.core.parser.CLKey
            if (r3 != 0) goto Lda
            if (r10 == 0) goto Lf5
        Lda:
            long r3 = r8.start
            int r3 = (int) r3
            char r3 = r1[r3]
            r4 = 39
            if (r3 == r4) goto Le7
            r4 = 34
            if (r3 != r4) goto Lf5
        Le7:
            if (r3 != r9) goto Lf5
            long r3 = r8.start
            long r3 = r3 + r13
            r8.setStart(r3)
            int r3 = r5 + (-1)
            long r3 = (long) r3
            r8.setEnd(r3)
        Lf5:
            boolean r3 = r8.isDone()
            if (r3 != 0) goto L131
            if (r9 == r11) goto L115
            if (r9 == r12) goto L115
            r3 = 44
            if (r9 == r3) goto L115
            r3 = 32
            if (r9 == r3) goto L115
            r3 = 9
            if (r9 == r3) goto L115
            r3 = 13
            if (r9 == r3) goto L115
            if (r9 == r6) goto L115
            r3 = 58
            if (r9 != r3) goto L131
        L115:
            int r3 = r5 + (-1)
            long r3 = (long) r3
            r8.setEnd(r3)
            if (r9 == r11) goto L11f
            if (r9 != r12) goto L131
        L11f:
            androidx.constraintlayout.core.parser.CLElement r8 = r8.getContainer()
            r8.setEnd(r3)
            boolean r9 = r8 instanceof androidx.constraintlayout.core.parser.CLKey
            if (r9 == 0) goto L131
            androidx.constraintlayout.core.parser.CLElement r8 = r8.getContainer()
            r8.setEnd(r3)
        L131:
            boolean r3 = r8.isDone()
            if (r3 == 0) goto L14a
            boolean r3 = r8 instanceof androidx.constraintlayout.core.parser.CLKey
            if (r3 == 0) goto L146
            r3 = r8
            androidx.constraintlayout.core.parser.CLKey r3 = (androidx.constraintlayout.core.parser.CLKey) r3
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r3 = r3.mElements
            int r3 = r3.size()
            if (r3 <= 0) goto L14a
        L146:
            androidx.constraintlayout.core.parser.CLElement r8 = r8.getContainer()
        L14a:
            int r5 = r5 + 1
            r3 = 1
            r4 = 0
            goto L36
        L150:
            if (r8 == 0) goto L172
            boolean r1 = r8.isDone()
            if (r1 != 0) goto L172
            boolean r1 = r8 instanceof androidx.constraintlayout.core.parser.CLString
            if (r1 == 0) goto L166
            long r3 = r8.start
            int r1 = (int) r3
            r3 = 1
            int r1 = r1 + r3
            long r4 = (long) r1
            r8.setStart(r4)
            goto L167
        L166:
            r3 = 1
        L167:
            int r1 = r2 + (-1)
            long r4 = (long) r1
            r8.setEnd(r4)
            androidx.constraintlayout.core.parser.CLElement r8 = r8.getContainer()
            goto L150
        L172:
            boolean r1 = androidx.constraintlayout.core.parser.CLParser.DEBUG
            if (r1 == 0) goto L18e
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Root: "
            r2.<init>(r3)
            java.lang.String r3 = r7.toJSON()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
        L18e:
            return r7
        L18f:
            androidx.constraintlayout.core.parser.CLParsingException r1 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.String r2 = "invalid json content"
            r3 = 0
            r1.<init>(r2, r3)
            throw r1
    }
}
