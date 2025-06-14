package okio;

/* loaded from: classes.dex */
public final class Options extends java.util.AbstractList<okio.ByteString> implements java.util.RandomAccess {
    final okio.ByteString[] byteStrings;
    final int[] trie;

    private Options(okio.ByteString[] r1, int[] r2) {
            r0 = this;
            r0.<init>()
            r0.byteStrings = r1
            r0.trie = r2
            return
    }

    private static void buildTrieRecursive(long r18, okio.Buffer r20, int r21, java.util.List<okio.ByteString> r22, int r23, int r24, java.util.List<java.lang.Integer> r25) {
            r0 = r20
            r1 = r21
            r10 = r22
            r2 = r23
            r11 = r24
            r12 = r25
            if (r2 >= r11) goto L1c0
            r3 = r2
        Lf:
            if (r3 >= r11) goto L26
            java.lang.Object r4 = r10.get(r3)
            okio.ByteString r4 = (okio.ByteString) r4
            int r4 = r4.size()
            if (r4 < r1) goto L20
            int r3 = r3 + 1
            goto Lf
        L20:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L26:
            java.lang.Object r3 = r22.get(r23)
            okio.ByteString r3 = (okio.ByteString) r3
            int r4 = r11 + (-1)
            java.lang.Object r4 = r10.get(r4)
            okio.ByteString r4 = (okio.ByteString) r4
            int r5 = r3.size()
            if (r1 != r5) goto L53
            java.lang.Object r3 = r12.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r2 = r2 + 1
            java.lang.Object r5 = r10.get(r2)
            okio.ByteString r5 = (okio.ByteString) r5
            r6 = r2
            r17 = r5
            r5 = r3
            r3 = r17
            goto L55
        L53:
            r5 = -1
            r6 = r2
        L55:
            byte r2 = r3.getByte(r1)
            byte r7 = r4.getByte(r1)
            r8 = 2
            if (r2 == r7) goto L133
            int r2 = r6 + 1
            r3 = 1
        L64:
            if (r2 >= r11) goto L83
            int r4 = r2 + (-1)
            java.lang.Object r4 = r10.get(r4)
            okio.ByteString r4 = (okio.ByteString) r4
            byte r4 = r4.getByte(r1)
            java.lang.Object r7 = r10.get(r2)
            okio.ByteString r7 = (okio.ByteString) r7
            byte r7 = r7.getByte(r1)
            if (r4 == r7) goto L80
            int r3 = r3 + 1
        L80:
            int r2 = r2 + 1
            goto L64
        L83:
            int r2 = intCount(r20)
            long r13 = (long) r2
            long r13 = r18 + r13
            long r13 = r13 + r8
            int r2 = r3 * 2
            long r7 = (long) r2
            long r13 = r13 + r7
            r0.writeInt(r3)
            r0.writeInt(r5)
            r2 = r6
        L96:
            if (r2 >= r11) goto Lba
            java.lang.Object r3 = r10.get(r2)
            okio.ByteString r3 = (okio.ByteString) r3
            byte r3 = r3.getByte(r1)
            if (r2 == r6) goto Lb2
            int r4 = r2 + (-1)
            java.lang.Object r4 = r10.get(r4)
            okio.ByteString r4 = (okio.ByteString) r4
            byte r4 = r4.getByte(r1)
            if (r3 == r4) goto Lb7
        Lb2:
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.writeInt(r3)
        Lb7:
            int r2 = r2 + 1
            goto L96
        Lba:
            okio.Buffer r9 = new okio.Buffer
            r9.<init>()
            r7 = r6
        Lc0:
            if (r7 >= r11) goto L126
            java.lang.Object r2 = r10.get(r7)
            okio.ByteString r2 = (okio.ByteString) r2
            byte r2 = r2.getByte(r1)
            int r3 = r7 + 1
            r4 = r3
        Lcf:
            if (r4 >= r11) goto Le2
            java.lang.Object r5 = r10.get(r4)
            okio.ByteString r5 = (okio.ByteString) r5
            byte r5 = r5.getByte(r1)
            if (r2 == r5) goto Ldf
            r8 = r4
            goto Le3
        Ldf:
            int r4 = r4 + 1
            goto Lcf
        Le2:
            r8 = r11
        Le3:
            if (r3 != r8) goto L105
            int r2 = r1 + 1
            java.lang.Object r3 = r10.get(r7)
            okio.ByteString r3 = (okio.ByteString) r3
            int r3 = r3.size()
            if (r2 != r3) goto L105
            java.lang.Object r2 = r12.get(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.writeInt(r2)
            r16 = r8
            r18 = r9
            goto L121
        L105:
            int r2 = intCount(r9)
            long r2 = (long) r2
            long r2 = r2 + r13
            r4 = -1
            long r2 = r2 * r4
            int r2 = (int) r2
            r0.writeInt(r2)
            int r5 = r1 + 1
            r2 = r13
            r4 = r9
            r6 = r22
            r16 = r8
            r18 = r9
            r9 = r25
            buildTrieRecursive(r2, r4, r5, r6, r7, r8, r9)
        L121:
            r9 = r18
            r7 = r16
            goto Lc0
        L126:
            r18 = r9
            long r1 = r18.size()
            r3 = r18
            r0.write(r3, r1)
            goto L1bf
        L133:
            int r2 = r3.size()
            int r7 = r4.size()
            int r2 = java.lang.Math.min(r2, r7)
            r7 = 0
            r13 = r1
        L141:
            if (r13 >= r2) goto L152
            byte r14 = r3.getByte(r13)
            byte r15 = r4.getByte(r13)
            if (r14 != r15) goto L152
            int r7 = r7 + 1
            int r13 = r13 + 1
            goto L141
        L152:
            int r2 = intCount(r20)
            long r13 = (long) r2
            long r13 = r18 + r13
            long r13 = r13 + r8
            long r8 = (long) r7
            long r13 = r13 + r8
            r8 = 1
            long r8 = r8 + r13
            int r2 = -r7
            r0.writeInt(r2)
            r0.writeInt(r5)
            r2 = r1
        L167:
            int r4 = r1 + r7
            if (r2 >= r4) goto L177
            byte r4 = r3.getByte(r2)
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0.writeInt(r4)
            int r2 = r2 + 1
            goto L167
        L177:
            int r1 = r6 + 1
            if (r1 != r11) goto L19b
            java.lang.Object r1 = r10.get(r6)
            okio.ByteString r1 = (okio.ByteString) r1
            int r1 = r1.size()
            if (r4 != r1) goto L195
            java.lang.Object r1 = r12.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.writeInt(r1)
            goto L1bf
        L195:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L19b:
            okio.Buffer r13 = new okio.Buffer
            r13.<init>()
            int r1 = intCount(r13)
            long r1 = (long) r1
            long r1 = r1 + r8
            r14 = -1
            long r1 = r1 * r14
            int r1 = (int) r1
            r0.writeInt(r1)
            r1 = r8
            r3 = r13
            r5 = r22
            r7 = r24
            r8 = r25
            buildTrieRecursive(r1, r3, r4, r5, r6, r7, r8)
            long r1 = r13.size()
            r0.write(r13, r1)
        L1bf:
            return
        L1c0:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    private static int intCount(okio.Buffer r4) {
            long r0 = r4.size()
            r2 = 4
            long r0 = r0 / r2
            int r4 = (int) r0
            return r4
    }

    /* renamed from: of */
    public static okio.Options m98of(okio.ByteString... r10) {
            int r0 = r10.length
            r1 = 0
            if (r0 != 0) goto L12
            okio.Options r10 = new okio.Options
            okio.ByteString[] r0 = new okio.ByteString[r1]
            r1 = 2
            int[] r1 = new int[r1]
            r1 = {x00fe: FILL_ARRAY_DATA , data: [0, -1} // fill-array
            r10.<init>(r0, r1)
            return r10
        L12:
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r0 = java.util.Arrays.asList(r10)
            r6.<init>(r0)
            java.util.Collections.sort(r6)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0 = r1
        L24:
            int r2 = r6.size()
            if (r0 >= r2) goto L35
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.add(r2)
            int r0 = r0 + 1
            goto L24
        L35:
            r0 = r1
        L36:
            int r2 = r6.size()
            if (r0 >= r2) goto L4c
            r2 = r10[r0]
            int r2 = java.util.Collections.binarySearch(r6, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r9.set(r2, r3)
            int r0 = r0 + 1
            goto L36
        L4c:
            java.lang.Object r0 = r6.get(r1)
            okio.ByteString r0 = (okio.ByteString) r0
            int r0 = r0.size()
            if (r0 == 0) goto Lf6
            r0 = r1
        L59:
            int r2 = r6.size()
            if (r0 >= r2) goto Lbc
            java.lang.Object r2 = r6.get(r0)
            okio.ByteString r2 = (okio.ByteString) r2
            int r3 = r0 + 1
            r4 = r3
        L68:
            int r5 = r6.size()
            if (r4 >= r5) goto Lba
            java.lang.Object r5 = r6.get(r4)
            okio.ByteString r5 = (okio.ByteString) r5
            boolean r7 = r5.startsWith(r2)
            if (r7 != 0) goto L7b
            goto Lba
        L7b:
            int r7 = r5.size()
            int r8 = r2.size()
            if (r7 == r8) goto La5
            java.lang.Object r5 = r9.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r7 = r9.get(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r5 <= r7) goto La2
            r6.remove(r4)
            r9.remove(r4)
            goto L68
        La2:
            int r4 = r4 + 1
            goto L68
        La5:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "duplicate option: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        Lba:
            r0 = r3
            goto L59
        Lbc:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r2 = 0
            r5 = 0
            r7 = 0
            int r8 = r6.size()
            r4 = r0
            buildTrieRecursive(r2, r4, r5, r6, r7, r8, r9)
            int r2 = intCount(r0)
            int[] r3 = new int[r2]
        Ld3:
            if (r1 >= r2) goto Lde
            int r4 = r0.readInt()
            r3[r1] = r4
            int r1 = r1 + 1
            goto Ld3
        Lde:
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto Lf0
            okio.Options r0 = new okio.Options
            java.lang.Object r10 = r10.clone()
            okio.ByteString[] r10 = (okio.ByteString[]) r10
            r0.<init>(r10, r3)
            return r0
        Lf0:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>()
            throw r10
        Lf6:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "the empty byte string is not a supported option"
            r10.<init>(r0)
            throw r10
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            okio.ByteString r1 = r0.get(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public okio.ByteString get(int r2) {
            r1 = this;
            okio.ByteString[] r0 = r1.byteStrings
            r2 = r0[r2]
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            okio.ByteString[] r0 = r1.byteStrings
            int r0 = r0.length
            return r0
    }
}
