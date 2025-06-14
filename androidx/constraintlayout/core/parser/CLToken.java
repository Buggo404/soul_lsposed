package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLToken extends androidx.constraintlayout.core.parser.CLElement {
    int index;
    char[] tokenFalse;
    char[] tokenNull;
    char[] tokenTrue;
    androidx.constraintlayout.core.parser.CLToken.Type type;

    /* renamed from: androidx.constraintlayout.core.parser.CLToken$1 */
    static /* synthetic */ class C01211 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type = null;

        static {
                androidx.constraintlayout.core.parser.CLToken$Type[] r0 = androidx.constraintlayout.core.parser.CLToken.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.parser.CLToken.C01211.$SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type = r0
                androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.TRUE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.parser.CLToken.C01211.$SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.FALSE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.parser.CLToken.C01211.$SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.NULL     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.core.parser.CLToken.C01211.$SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.UNKNOWN     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    enum Type extends java.lang.Enum<androidx.constraintlayout.core.parser.CLToken.Type> {
        private static final /* synthetic */ androidx.constraintlayout.core.parser.CLToken.Type[] $VALUES = null;
        public static final androidx.constraintlayout.core.parser.CLToken.Type FALSE = null;
        public static final androidx.constraintlayout.core.parser.CLToken.Type NULL = null;
        public static final androidx.constraintlayout.core.parser.CLToken.Type TRUE = null;
        public static final androidx.constraintlayout.core.parser.CLToken.Type UNKNOWN = null;

        static {
                androidx.constraintlayout.core.parser.CLToken$Type r0 = new androidx.constraintlayout.core.parser.CLToken$Type
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.parser.CLToken.Type.UNKNOWN = r0
                androidx.constraintlayout.core.parser.CLToken$Type r1 = new androidx.constraintlayout.core.parser.CLToken$Type
                java.lang.String r3 = "TRUE"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.core.parser.CLToken.Type.TRUE = r1
                androidx.constraintlayout.core.parser.CLToken$Type r3 = new androidx.constraintlayout.core.parser.CLToken$Type
                java.lang.String r5 = "FALSE"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.core.parser.CLToken.Type.FALSE = r3
                androidx.constraintlayout.core.parser.CLToken$Type r5 = new androidx.constraintlayout.core.parser.CLToken$Type
                java.lang.String r7 = "NULL"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.core.parser.CLToken.Type.NULL = r5
                r7 = 4
                androidx.constraintlayout.core.parser.CLToken$Type[] r7 = new androidx.constraintlayout.core.parser.CLToken.Type[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                androidx.constraintlayout.core.parser.CLToken.Type.$VALUES = r7
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.parser.CLToken.Type valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.parser.CLToken$Type> r0 = androidx.constraintlayout.core.parser.CLToken.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.parser.CLToken$Type r1 = (androidx.constraintlayout.core.parser.CLToken.Type) r1
                return r1
        }

        public static androidx.constraintlayout.core.parser.CLToken.Type[] values() {
                androidx.constraintlayout.core.parser.CLToken$Type[] r0 = androidx.constraintlayout.core.parser.CLToken.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.parser.CLToken$Type[] r0 = (androidx.constraintlayout.core.parser.CLToken.Type[]) r0
                return r0
        }
    }

    public CLToken(char[] r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.index = r1
            androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.UNKNOWN
            r0.type = r1
            java.lang.String r1 = "true"
            char[] r1 = r1.toCharArray()
            r0.tokenTrue = r1
            java.lang.String r1 = "false"
            char[] r1 = r1.toCharArray()
            r0.tokenFalse = r1
            java.lang.String r1 = "null"
            char[] r1 = r1.toCharArray()
            r0.tokenNull = r1
            return
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] r1) {
            androidx.constraintlayout.core.parser.CLToken r0 = new androidx.constraintlayout.core.parser.CLToken
            r0.<init>(r1)
            return r0
    }

    public boolean getBoolean() throws androidx.constraintlayout.core.parser.CLParsingException {
            r3 = this;
            androidx.constraintlayout.core.parser.CLToken$Type r0 = r3.type
            androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.TRUE
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            androidx.constraintlayout.core.parser.CLToken$Type r0 = r3.type
            androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.FALSE
            if (r0 != r1) goto L10
            r0 = 0
            return r0
        L10:
            androidx.constraintlayout.core.parser.CLParsingException r0 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "this token is not a boolean: <"
            r1.<init>(r2)
            java.lang.String r2 = r3.content()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ">"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r3)
            throw r0
    }

    public androidx.constraintlayout.core.parser.CLToken.Type getType() {
            r1 = this;
            androidx.constraintlayout.core.parser.CLToken$Type r0 = r1.type
            return r0
    }

    public boolean isNull() throws androidx.constraintlayout.core.parser.CLParsingException {
            r3 = this;
            androidx.constraintlayout.core.parser.CLToken$Type r0 = r3.type
            androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.NULL
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            androidx.constraintlayout.core.parser.CLParsingException r0 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "this token is not a null: <"
            r1.<init>(r2)
            java.lang.String r2 = r3.content()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ">"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toFormattedJSON(int r1, int r2) {
            r0 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r0.addIndent(r2, r1)
            java.lang.String r1 = r0.content()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toJSON() {
            r2 = this;
            boolean r0 = androidx.constraintlayout.core.parser.CLParser.DEBUG
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<"
            r0.<init>(r1)
            java.lang.String r1 = r2.content()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ">"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1e:
            java.lang.String r0 = r2.content()
            return r0
    }

    public boolean validate(char r6, long r7) {
            r5 = this;
            int[] r0 = androidx.constraintlayout.core.parser.CLToken.C01211.$SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type
            androidx.constraintlayout.core.parser.CLToken$Type r1 = r5.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L62
            r3 = 2
            if (r0 == r3) goto L4f
            r3 = 3
            if (r0 == r3) goto L3c
            r7 = 4
            if (r0 == r7) goto L18
            goto L74
        L18:
            char[] r7 = r5.tokenTrue
            int r8 = r5.index
            char r7 = r7[r8]
            if (r7 != r6) goto L26
            androidx.constraintlayout.core.parser.CLToken$Type r6 = androidx.constraintlayout.core.parser.CLToken.Type.TRUE
            r5.type = r6
        L24:
            r2 = r1
            goto L74
        L26:
            char[] r7 = r5.tokenFalse
            char r7 = r7[r8]
            if (r7 != r6) goto L31
            androidx.constraintlayout.core.parser.CLToken$Type r6 = androidx.constraintlayout.core.parser.CLToken.Type.FALSE
            r5.type = r6
            goto L24
        L31:
            char[] r7 = r5.tokenNull
            char r7 = r7[r8]
            if (r7 != r6) goto L74
            androidx.constraintlayout.core.parser.CLToken$Type r6 = androidx.constraintlayout.core.parser.CLToken.Type.NULL
            r5.type = r6
            goto L24
        L3c:
            char[] r0 = r5.tokenNull
            int r3 = r5.index
            char r4 = r0[r3]
            if (r4 != r6) goto L45
            r2 = r1
        L45:
            if (r2 == 0) goto L74
            int r3 = r3 + r1
            int r6 = r0.length
            if (r3 != r6) goto L74
            r5.setEnd(r7)
            goto L74
        L4f:
            char[] r0 = r5.tokenFalse
            int r3 = r5.index
            char r4 = r0[r3]
            if (r4 != r6) goto L58
            r2 = r1
        L58:
            if (r2 == 0) goto L74
            int r3 = r3 + r1
            int r6 = r0.length
            if (r3 != r6) goto L74
            r5.setEnd(r7)
            goto L74
        L62:
            char[] r0 = r5.tokenTrue
            int r3 = r5.index
            char r4 = r0[r3]
            if (r4 != r6) goto L6b
            r2 = r1
        L6b:
            if (r2 == 0) goto L74
            int r3 = r3 + r1
            int r6 = r0.length
            if (r3 != r6) goto L74
            r5.setEnd(r7)
        L74:
            int r6 = r5.index
            int r6 = r6 + r1
            r5.index = r6
            return r2
    }
}
