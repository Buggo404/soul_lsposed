package lombok.delombok;

/* loaded from: com.usidqw.qwerklj.apk:lombok/delombok/FormatPreferenceScanner.SCL.lombok */
public class FormatPreferenceScanner {


    public FormatPreferenceScanner() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private lombok.delombok.FormatPreferences tryEasy(lombok.delombok.FormatPreferences r4, boolean r5) {
            r3 = this;
            r0 = 0
            r6 = r0
            r0 = r4
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.rawMap
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L36
        L15:
            r0 = r8
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r7 = r0
            java.lang.String r0 = "scan"
            r1 = r7
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L36
            int r6 = r6 + 1
        L36:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L15
            r0 = r5
            if (r0 != 0) goto L50
            r0 = r6
            java.util.Map<java.lang.String, java.lang.String> r1 = lombok.delombok.FormatPreferences.KEYS
            int r1 = r1.size()
            if (r0 < r1) goto L52
        L50:
            r0 = r4
            return r0
        L52:
            r0 = 0
            return r0
    }

    public lombok.delombok.FormatPreferences scan(lombok.delombok.FormatPreferences r7, java.lang.CharSequence r8) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            if (r2 != 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            lombok.delombok.FormatPreferences r0 = r0.tryEasy(r1, r2)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L15
            r0 = r9
            return r0
        L15:
            r0 = r7
            lombok.delombok.FormatPreferenceScanner$1 r1 = new lombok.delombok.FormatPreferenceScanner$1     // Catch: java.io.IOException -> L23
            r2 = r1
            r3 = r6
            r4 = r8
            r2.<init>(r3, r4)     // Catch: java.io.IOException -> L23
            lombok.delombok.FormatPreferences r0 = scan_(r0, r1)     // Catch: java.io.IOException -> L23
            return r0
        L23:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            throw r0
    }

    public lombok.delombok.FormatPreferences scan(lombok.delombok.FormatPreferences r6, char[] r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            if (r2 != 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            lombok.delombok.FormatPreferences r0 = r0.tryEasy(r1, r2)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L15
            r0 = r8
            return r0
        L15:
            r0 = r6
            java.io.CharArrayReader r1 = new java.io.CharArrayReader     // Catch: java.io.IOException -> L22
            r2 = r1
            r3 = r7
            r2.<init>(r3)     // Catch: java.io.IOException -> L22
            lombok.delombok.FormatPreferences r0 = scan_(r0, r1)     // Catch: java.io.IOException -> L22
            return r0
        L22:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
    }

    public lombok.delombok.FormatPreferences scan(lombok.delombok.FormatPreferences r5, java.io.Reader r6) throws java.io.IOException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            if (r2 != 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            lombok.delombok.FormatPreferences r0 = r0.tryEasy(r1, r2)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L15
            r0 = r7
            return r0
        L15:
            r0 = r5
            r1 = r6
            lombok.delombok.FormatPreferences r0 = scan_(r0, r1)
            return r0
    }

    private static lombok.delombok.FormatPreferences scan_(lombok.delombok.FormatPreferences r6, java.io.Reader r7) throws java.io.IOException {
            r0 = 0
            r8 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = 32700(0x7fbc, float:4.5822E-41)
            char[] r0 = new char[r0]
            r10 = r0
            r0 = 1
            r11 = r0
            r0 = 0
            r12 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = 1
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = 32
            r16 = r0
        L2a:
            r0 = r11
            r1 = r12
            if (r0 < r1) goto L4c
            r0 = r7
            r1 = r10
            int r0 = r0.read(r1)
            r17 = r0
            r0 = r17
            r1 = -1
            if (r0 != r1) goto L42
            goto L13f
        L42:
            r0 = 0
            r11 = r0
            r0 = r17
            r12 = r0
            goto L2a
        L4c:
            r0 = r10
            r1 = r11
            int r11 = r11 + 1
            char r0 = r0[r1]
            r17 = r0
            r0 = r15
            if (r0 == 0) goto L73
            r0 = r16
            r1 = 42
            if (r0 != r1) goto L6c
            r0 = r17
            r1 = 47
            if (r0 != r1) goto L6c
            r0 = 0
            r15 = r0
        L6c:
            r0 = r17
            r16 = r0
            goto L2a
        L73:
            r0 = r16
            r1 = 47
            if (r0 != r1) goto L94
            r0 = r17
            r1 = 42
            if (r0 != r1) goto L94
            r0 = 1
            r15 = r0
            r0 = 32
            r16 = r0
            r0 = r13
            r1 = 0
            r0.setLength(r1)
            r0 = 0
            r14 = r0
            goto L2a
        L94:
            r0 = r14
            if (r0 == 0) goto L128
            r0 = r17
            boolean r0 = java.lang.Character.isWhitespace(r0)
            r18 = r0
            r0 = r17
            r1 = 10
            if (r0 != r1) goto Lf0
            r0 = r13
            int r0 = r0.length()
            if (r0 <= 0) goto Lcc
            r0 = r13
            r1 = r13
            int r1 = r1.length()
            r2 = 1
            int r1 = r1 - r2
            char r0 = r0.charAt(r1)
            r1 = 13
            if (r0 != r1) goto Lcc
            r0 = r13
            r1 = r13
            int r1 = r1.length()
            r2 = 1
            int r1 = r1 - r2
            r0.setLength(r1)
        Lcc:
            r0 = r13
            int r0 = r0.length()
            if (r0 <= 0) goto Ld7
            int r8 = r8 + 1
        Ld7:
            r0 = r9
            r1 = r13
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            r0 = r13
            r1 = 0
            r0.setLength(r1)
            r0 = r17
            r16 = r0
            goto L2a
        Lf0:
            r0 = r18
            if (r0 == 0) goto L104
            r0 = r13
            r1 = r17
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r17
            r16 = r0
            goto L2a
        L104:
            r0 = r13
            int r0 = r0.length()
            if (r0 <= 0) goto L11e
            r0 = r9
            r1 = r13
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            r0 = r13
            r1 = 0
            r0.setLength(r1)
        L11e:
            r0 = r17
            r16 = r0
            r0 = 0
            r14 = r0
            goto L2a
        L128:
            r0 = r17
            r16 = r0
            r0 = r17
            r1 = 10
            if (r0 != r1) goto L2a
            r0 = 1
            r14 = r0
            r0 = r13
            r1 = 0
            r0.setLength(r1)
            goto L2a
        L13f:
            r0 = 0
            r17 = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r18 = r0
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r20 = r0
            goto L196
        L151:
            r0 = r20
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r19 = r0
            r0 = r19
            r1 = 9
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 <= r1) goto L16f
            java.lang.String r0 = "\t"
            r17 = r0
            goto L1a0
        L16f:
            r0 = r19
            int r0 = r0.length()
            r1 = 2
            if (r0 < r1) goto L196
            r0 = r19
            int r0 = r0.length()
            r1 = 8
            if (r0 <= r1) goto L185
            goto L196
        L185:
            r0 = r19
            int r0 = r0.length()
            r1 = r18
            if (r0 >= r1) goto L196
            r0 = r19
            int r0 = r0.length()
            r18 = r0
        L196:
            r0 = r20
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L151
        L1a0:
            r0 = r18
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L1ab
            java.lang.String r0 = "\t"
            r17 = r0
        L1ab:
            r0 = r17
            if (r0 != 0) goto L1c8
            r0 = r18
            char[] r0 = new char[r0]
            r19 = r0
            r0 = r19
            r1 = 32
            java.util.Arrays.fill(r0, r1)
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r19
            r1.<init>(r2)
            r17 = r0
        L1c8:
            lombok.delombok.FormatPreferences r0 = new lombok.delombok.FormatPreferences
            r1 = r0
            r2 = r6
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.rawMap
            r3 = r17
            r4 = r8
            if (r4 <= 0) goto L1da
            r4 = 1
            goto L1db
        L1da:
            r4 = 0
        L1db:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.<init>(r2, r3, r4)
            return r0
    }
}
