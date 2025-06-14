package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/SymbolTable.SCL.lombok */
final class SymbolTable {
    final org.objectweb.asm.ClassWriter classWriter;
    private final org.objectweb.asm.ClassReader sourceClassReader;
    private int majorVersion;
    private java.lang.String className;
    private int entryCount;
    private org.objectweb.asm.SymbolTable.Entry[] entries;
    private int constantPoolCount;
    private org.objectweb.asm.ByteVector constantPool;
    private int bootstrapMethodCount;
    private org.objectweb.asm.ByteVector bootstrapMethods;
    private int typeCount;
    private org.objectweb.asm.SymbolTable.Entry[] typeTable;

    /* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/SymbolTable$Entry.SCL.lombok */
    private static class Entry extends org.objectweb.asm.Symbol {
        final int hashCode;
        org.objectweb.asm.SymbolTable.Entry next;

        Entry(int r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, long r15, int r17) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0 = r9
                r1 = r17
                r0.hashCode = r1
                return
        }

        Entry(int r10, int r11, java.lang.String r12, int r13) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = 0
                r4 = 0
                r5 = r12
                r6 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0 = r9
                r1 = r13
                r0.hashCode = r1
                return
        }

        Entry(int r10, int r11, java.lang.String r12, long r13, int r15) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = 0
                r4 = 0
                r5 = r12
                r6 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0 = r9
                r1 = r15
                r0.hashCode = r1
                return
        }

        Entry(int r10, int r11, java.lang.String r12, java.lang.String r13, int r14) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = 0
                r4 = r12
                r5 = r13
                r6 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0 = r9
                r1 = r14
                r0.hashCode = r1
                return
        }

        Entry(int r10, int r11, long r12, int r14) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0 = r9
                r1 = r14
                r0.hashCode = r1
                return
        }
    }

    SymbolTable(org.objectweb.asm.ClassWriter r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.classWriter = r1
            r0 = r4
            r1 = 0
            r0.sourceClassReader = r1
            r0 = r4
            r1 = 256(0x100, float:3.59E-43)
            org.objectweb.asm.SymbolTable$Entry[] r1 = new org.objectweb.asm.SymbolTable.Entry[r1]
            r0.entries = r1
            r0 = r4
            r1 = 1
            r0.constantPoolCount = r1
            r0 = r4
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.constantPool = r1
            return
    }

    SymbolTable(org.objectweb.asm.ClassWriter r10, org.objectweb.asm.ClassReader r11) {
            r9 = this;
            r0 = r9
            r0.<init>()
            r0 = r9
            r1 = r10
            r0.classWriter = r1
            r0 = r9
            r1 = r11
            r0.sourceClassReader = r1
            r0 = r11
            byte[] r0 = r0.classFileBuffer
            r12 = r0
            r0 = r11
            r1 = 1
            int r0 = r0.getItem(r1)
            r1 = 1
            int r0 = r0 - r1
            r13 = r0
            r0 = r11
            int r0 = r0.header
            r1 = r13
            int r0 = r0 - r1
            r14 = r0
            r0 = r9
            r1 = r11
            int r1 = r1.getItemCount()
            r0.constantPoolCount = r1
            r0 = r9
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r3 = r14
            r2.<init>(r3)
            r0.constantPool = r1
            r0 = r9
            org.objectweb.asm.ByteVector r0 = r0.constantPool
            r1 = r12
            r2 = r13
            r3 = r14
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r9
            r1 = r9
            int r1 = r1.constantPoolCount
            r2 = 2
            int r1 = r1 * r2
            org.objectweb.asm.SymbolTable$Entry[] r1 = new org.objectweb.asm.SymbolTable.Entry[r1]
            r0.entries = r1
            r0 = r11
            int r0 = r0.getMaxStringLength()
            char[] r0 = new char[r0]
            r15 = r0
            r0 = 0
            r16 = r0
            r0 = 1
            r17 = r0
        L62:
            r0 = r17
            r1 = r9
            int r1 = r1.constantPoolCount
            if (r0 >= r1) goto L20b
            r0 = r11
            r1 = r17
            int r0 = r0.getItem(r1)
            r18 = r0
            r0 = r12
            r1 = r18
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r19 = r0
            r0 = r19
            switch(r0) {
                case 1: goto L14c;
                case 2: goto L1e9;
                case 3: goto L10f;
                case 4: goto L10f;
                case 5: goto L13b;
                case 6: goto L13b;
                case 7: goto L1d6;
                case 8: goto L1d6;
                case 9: goto Ldc;
                case 10: goto Ldc;
                case 11: goto Ldc;
                case 12: goto L120;
                case 13: goto L1e9;
                case 14: goto L1e9;
                case 15: goto L15d;
                case 16: goto L1d6;
                case 17: goto L1a2;
                case 18: goto L1a2;
                case 19: goto L1d6;
                case 20: goto L1d6;
                default: goto L1e9;
            }
        Ldc:
            r0 = r11
            r1 = r11
            r2 = r18
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            int r0 = r0.getItem(r1)
            r20 = r0
            r0 = r9
            r1 = r17
            r2 = r19
            r3 = r11
            r4 = r18
            r5 = r15
            java.lang.String r3 = r3.readClass(r4, r5)
            r4 = r11
            r5 = r20
            r6 = r15
            java.lang.String r4 = r4.readUTF8(r5, r6)
            r5 = r11
            r6 = r20
            r7 = 2
            int r6 = r6 + r7
            r7 = r15
            java.lang.String r5 = r5.readUTF8(r6, r7)
            r0.addConstantMemberReference(r1, r2, r3, r4, r5)
            goto L1f1
        L10f:
            r0 = r9
            r1 = r17
            r2 = r19
            r3 = r11
            r4 = r18
            int r3 = r3.readInt(r4)
            r0.addConstantIntegerOrFloat(r1, r2, r3)
            goto L1f1
        L120:
            r0 = r9
            r1 = r17
            r2 = r11
            r3 = r18
            r4 = r15
            java.lang.String r2 = r2.readUTF8(r3, r4)
            r3 = r11
            r4 = r18
            r5 = 2
            int r4 = r4 + r5
            r5 = r15
            java.lang.String r3 = r3.readUTF8(r4, r5)
            r0.addConstantNameAndType(r1, r2, r3)
            goto L1f1
        L13b:
            r0 = r9
            r1 = r17
            r2 = r19
            r3 = r11
            r4 = r18
            long r3 = r3.readLong(r4)
            r0.addConstantLongOrDouble(r1, r2, r3)
            goto L1f1
        L14c:
            r0 = r9
            r1 = r17
            r2 = r11
            r3 = r17
            r4 = r15
            java.lang.String r2 = r2.readUtf(r3, r4)
            r0.addConstantUtf8(r1, r2)
            goto L1f1
        L15d:
            r0 = r11
            r1 = r11
            r2 = r18
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            int r0 = r0.getItem(r1)
            r21 = r0
            r0 = r11
            r1 = r11
            r2 = r21
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            int r0 = r0.getItem(r1)
            r20 = r0
            r0 = r9
            r1 = r17
            r2 = r11
            r3 = r18
            int r2 = r2.readByte(r3)
            r3 = r11
            r4 = r21
            r5 = r15
            java.lang.String r3 = r3.readClass(r4, r5)
            r4 = r11
            r5 = r20
            r6 = r15
            java.lang.String r4 = r4.readUTF8(r5, r6)
            r5 = r11
            r6 = r20
            r7 = 2
            int r6 = r6 + r7
            r7 = r15
            java.lang.String r5 = r5.readUTF8(r6, r7)
            r0.addConstantMethodHandle(r1, r2, r3, r4, r5)
            goto L1f1
        L1a2:
            r0 = 1
            r16 = r0
            r0 = r11
            r1 = r11
            r2 = r18
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            int r0 = r0.getItem(r1)
            r20 = r0
            r0 = r9
            r1 = r19
            r2 = r17
            r3 = r11
            r4 = r20
            r5 = r15
            java.lang.String r3 = r3.readUTF8(r4, r5)
            r4 = r11
            r5 = r20
            r6 = 2
            int r5 = r5 + r6
            r6 = r15
            java.lang.String r4 = r4.readUTF8(r5, r6)
            r5 = r11
            r6 = r18
            int r5 = r5.readUnsignedShort(r6)
            r0.addConstantDynamicOrInvokeDynamicReference(r1, r2, r3, r4, r5)
            goto L1f1
        L1d6:
            r0 = r9
            r1 = r17
            r2 = r19
            r3 = r11
            r4 = r18
            r5 = r15
            java.lang.String r3 = r3.readUTF8(r4, r5)
            r0.addConstantUtf8Reference(r1, r2, r3)
            goto L1f1
        L1e9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L1f1:
            r0 = r17
            r1 = r19
            r2 = 5
            if (r1 == r2) goto L200
            r1 = r19
            r2 = 6
            if (r1 != r2) goto L204
        L200:
            r1 = 2
            goto L205
        L204:
            r1 = 1
        L205:
            int r0 = r0 + r1
            r17 = r0
            goto L62
        L20b:
            r0 = r16
            if (r0 == 0) goto L217
            r0 = r9
            r1 = r11
            r2 = r15
            r0.copyBootstrapMethods(r1, r2)
        L217:
            return
    }

    private void copyBootstrapMethods(org.objectweb.asm.ClassReader r11, char[] r12) {
            r10 = this;
            r0 = r11
            byte[] r0 = r0.classFileBuffer
            r13 = r0
            r0 = r11
            int r0 = r0.getFirstAttributeOffset()
            r14 = r0
            r0 = r11
            r1 = r14
            r2 = 2
            int r1 = r1 - r2
            int r0 = r0.readUnsignedShort(r1)
            r15 = r0
        L15:
            r0 = r15
            if (r0 <= 0) goto L53
            r0 = r11
            r1 = r14
            r2 = r12
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r16 = r0
            java.lang.String r0 = "BootstrapMethods"
            r1 = r16
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3d
            r0 = r10
            r1 = r11
            r2 = r14
            r3 = 6
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0.bootstrapMethodCount = r1
            goto L53
        L3d:
            r0 = r14
            r1 = 6
            r2 = r11
            r3 = r14
            r4 = 2
            int r3 = r3 + r4
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            int r0 = r0 + r1
            r14 = r0
            int r15 = r15 + (-1)
            goto L15
        L53:
            r0 = r10
            int r0 = r0.bootstrapMethodCount
            if (r0 <= 0) goto L102
            r0 = r14
            r1 = 8
            int r0 = r0 + r1
            r15 = r0
            r0 = r11
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r1 = 2
            int r0 = r0 - r1
            r16 = r0
            r0 = r10
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r3 = r16
            r2.<init>(r3)
            r0.bootstrapMethods = r1
            r0 = r10
            org.objectweb.asm.ByteVector r0 = r0.bootstrapMethods
            r1 = r13
            r2 = r15
            r3 = r16
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r15
            r17 = r0
            r0 = 0
            r18 = r0
        L8e:
            r0 = r18
            r1 = r10
            int r1 = r1.bootstrapMethodCount
            if (r0 >= r1) goto L102
            r0 = r17
            r1 = r15
            int r0 = r0 - r1
            r19 = r0
            r0 = r11
            r1 = r17
            int r0 = r0.readUnsignedShort(r1)
            r20 = r0
            int r17 = r17 + 2
            r0 = r11
            r1 = r17
            int r0 = r0.readUnsignedShort(r1)
            r21 = r0
            int r17 = r17 + 2
            r0 = r11
            r1 = r20
            r2 = r12
            java.lang.Object r0 = r0.readConst(r1, r2)
            int r0 = r0.hashCode()
            r22 = r0
        Lc0:
            r0 = r21
            int r21 = r21 + (-1)
            if (r0 <= 0) goto Le5
            r0 = r11
            r1 = r17
            int r0 = r0.readUnsignedShort(r1)
            r23 = r0
            int r17 = r17 + 2
            r0 = r22
            r1 = r11
            r2 = r23
            r3 = r12
            java.lang.Object r1 = r1.readConst(r2, r3)
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            r22 = r0
            goto Lc0
        Le5:
            r0 = r10
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r18
            r4 = 64
            r5 = r19
            long r5 = (long) r5
            r6 = r22
            r7 = 2147483647(0x7fffffff, float:NaN)
            r6 = r6 & r7
            r2.<init>(r3, r4, r5, r6)
            r0.add(r1)
            int r18 = r18 + 1
            goto L8e
        L102:
            return
    }

    org.objectweb.asm.ClassReader getSource() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.ClassReader r0 = r0.sourceClassReader
            return r0
    }

    int getMajorVersion() {
            r2 = this;
            r0 = r2
            int r0 = r0.majorVersion
            return r0
    }

    java.lang.String getClassName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.className
            return r0
    }

    int setMajorVersionAndClassName(int r4, java.lang.String r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.majorVersion = r1
            r0 = r3
            r1 = r5
            r0.className = r1
            r0 = r3
            r1 = r5
            org.objectweb.asm.Symbol r0 = r0.addConstantClass(r1)
            int r0 = r0.index
            return r0
    }

    int getConstantPoolCount() {
            r2 = this;
            r0 = r2
            int r0 = r0.constantPoolCount
            return r0
    }

    int getConstantPoolLength() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.ByteVector r0 = r0.constantPool
            int r0 = r0.length
            return r0
    }

    void putConstantPool(org.objectweb.asm.ByteVector r6) {
            r5 = this;
            r0 = r6
            r1 = r5
            int r1 = r1.constantPoolCount
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r5
            org.objectweb.asm.ByteVector r1 = r1.constantPool
            byte[] r1 = r1.data
            r2 = 0
            r3 = r5
            org.objectweb.asm.ByteVector r3 = r3.constantPool
            int r3 = r3.length
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            return
    }

    int computeBootstrapMethodsSize() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.ByteVector r0 = r0.bootstrapMethods
            if (r0 == 0) goto L19
            r0 = r3
            java.lang.String r1 = "BootstrapMethods"
            int r0 = r0.addConstantUtf8(r1)
            r0 = 8
            r1 = r3
            org.objectweb.asm.ByteVector r1 = r1.bootstrapMethods
            int r1 = r1.length
            int r0 = r0 + r1
            return r0
        L19:
            r0 = 0
            return r0
    }

    void putBootstrapMethods(org.objectweb.asm.ByteVector r6) {
            r5 = this;
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.bootstrapMethods
            if (r0 == 0) goto L37
            r0 = r6
            r1 = r5
            java.lang.String r2 = "BootstrapMethods"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r5
            org.objectweb.asm.ByteVector r1 = r1.bootstrapMethods
            int r1 = r1.length
            r2 = 2
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r5
            int r1 = r1.bootstrapMethodCount
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r5
            org.objectweb.asm.ByteVector r1 = r1.bootstrapMethods
            byte[] r1 = r1.data
            r2 = 0
            r3 = r5
            org.objectweb.asm.ByteVector r3 = r3.bootstrapMethods
            int r3 = r3.length
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L37:
            return
    }

    private org.objectweb.asm.SymbolTable.Entry get(int r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.SymbolTable$Entry[] r0 = r0.entries
            r1 = r5
            r2 = r4
            org.objectweb.asm.SymbolTable$Entry[] r2 = r2.entries
            int r2 = r2.length
            int r1 = r1 % r2
            r0 = r0[r1]
            return r0
    }

    private org.objectweb.asm.SymbolTable.Entry put(org.objectweb.asm.SymbolTable.Entry r6) {
            r5 = this;
            r0 = r5
            int r0 = r0.entryCount
            r1 = r5
            org.objectweb.asm.SymbolTable$Entry[] r1 = r1.entries
            int r1 = r1.length
            r2 = 3
            int r1 = r1 * r2
            r2 = 4
            int r1 = r1 / r2
            if (r0 <= r1) goto L6e
            r0 = r5
            org.objectweb.asm.SymbolTable$Entry[] r0 = r0.entries
            int r0 = r0.length
            r7 = r0
            r0 = r7
            r1 = 2
            int r0 = r0 * r1
            r1 = 1
            int r0 = r0 + r1
            r8 = r0
            r0 = r8
            org.objectweb.asm.SymbolTable$Entry[] r0 = new org.objectweb.asm.SymbolTable.Entry[r0]
            r9 = r0
            r0 = r7
            r1 = 1
            int r0 = r0 - r1
            r10 = r0
        L27:
            r0 = r10
            if (r0 < 0) goto L68
            r0 = r5
            org.objectweb.asm.SymbolTable$Entry[] r0 = r0.entries
            r1 = r10
            r0 = r0[r1]
            r11 = r0
        L35:
            r0 = r11
            if (r0 == 0) goto L62
            r0 = r11
            int r0 = r0.hashCode
            r1 = r8
            int r0 = r0 % r1
            r12 = r0
            r0 = r11
            org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            r13 = r0
            r0 = r11
            r1 = r9
            r2 = r12
            r1 = r1[r2]
            r0.next = r1
            r0 = r9
            r1 = r12
            r2 = r11
            r0[r1] = r2
            r0 = r13
            r11 = r0
            goto L35
        L62:
            int r10 = r10 + (-1)
            goto L27
        L68:
            r0 = r5
            r1 = r9
            r0.entries = r1
        L6e:
            r0 = r5
            r1 = r0
            int r1 = r1.entryCount
            r2 = 1
            int r1 = r1 + r2
            r0.entryCount = r1
            r0 = r6
            int r0 = r0.hashCode
            r1 = r5
            org.objectweb.asm.SymbolTable$Entry[] r1 = r1.entries
            int r1 = r1.length
            int r0 = r0 % r1
            r7 = r0
            r0 = r6
            r1 = r5
            org.objectweb.asm.SymbolTable$Entry[] r1 = r1.entries
            r2 = r7
            r1 = r1[r2]
            r0.next = r1
            r0 = r5
            org.objectweb.asm.SymbolTable$Entry[] r0 = r0.entries
            r1 = r7
            r2 = r6
            r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
            r1[r2] = r3
            return r0
    }

    private void add(org.objectweb.asm.SymbolTable.Entry r5) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.entryCount
            r2 = 1
            int r1 = r1 + r2
            r0.entryCount = r1
            r0 = r5
            int r0 = r0.hashCode
            r1 = r4
            org.objectweb.asm.SymbolTable$Entry[] r1 = r1.entries
            int r1 = r1.length
            int r0 = r0 % r1
            r6 = r0
            r0 = r5
            r1 = r4
            org.objectweb.asm.SymbolTable$Entry[] r1 = r1.entries
            r2 = r6
            r1 = r1[r2]
            r0.next = r1
            r0 = r4
            org.objectweb.asm.SymbolTable$Entry[] r0 = r0.entries
            r1 = r6
            r2 = r5
            r0[r1] = r2
            return
    }

    org.objectweb.asm.Symbol addConstant(java.lang.Object r8) {
            r7 = this;
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L13
            r0 = r7
            r1 = r8
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            org.objectweb.asm.Symbol r0 = r0.addConstantInteger(r1)
            return r0
        L13:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Byte
            if (r0 == 0) goto L26
            r0 = r7
            r1 = r8
            java.lang.Byte r1 = (java.lang.Byte) r1
            int r1 = r1.intValue()
            org.objectweb.asm.Symbol r0 = r0.addConstantInteger(r1)
            return r0
        L26:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Character
            if (r0 == 0) goto L39
            r0 = r7
            r1 = r8
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            org.objectweb.asm.Symbol r0 = r0.addConstantInteger(r1)
            return r0
        L39:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Short
            if (r0 == 0) goto L4c
            r0 = r7
            r1 = r8
            java.lang.Short r1 = (java.lang.Short) r1
            int r1 = r1.intValue()
            org.objectweb.asm.Symbol r0 = r0.addConstantInteger(r1)
            return r0
        L4c:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L67
            r0 = r7
            r1 = r8
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L62
            r1 = 1
            goto L63
        L62:
            r1 = 0
        L63:
            org.objectweb.asm.Symbol r0 = r0.addConstantInteger(r1)
            return r0
        L67:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Float
            if (r0 == 0) goto L7a
            r0 = r7
            r1 = r8
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            org.objectweb.asm.Symbol r0 = r0.addConstantFloat(r1)
            return r0
        L7a:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Long
            if (r0 == 0) goto L8d
            r0 = r7
            r1 = r8
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            org.objectweb.asm.Symbol r0 = r0.addConstantLong(r1)
            return r0
        L8d:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 == 0) goto La0
            r0 = r7
            r1 = r8
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            org.objectweb.asm.Symbol r0 = r0.addConstantDouble(r1)
            return r0
        La0:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto Lb0
            r0 = r7
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            org.objectweb.asm.Symbol r0 = r0.addConstantString(r1)
            return r0
        Lb0:
            r0 = r8
            boolean r0 = r0 instanceof org.objectweb.asm.Type
            if (r0 == 0) goto Le8
            r0 = r8
            org.objectweb.asm.Type r0 = (org.objectweb.asm.Type) r0
            r9 = r0
            r0 = r9
            int r0 = r0.getSort()
            r10 = r0
            r0 = r10
            r1 = 10
            if (r0 != r1) goto Ld0
            r0 = r7
            r1 = r9
            java.lang.String r1 = r1.getInternalName()
            org.objectweb.asm.Symbol r0 = r0.addConstantClass(r1)
            return r0
        Ld0:
            r0 = r10
            r1 = 11
            if (r0 != r1) goto Ldf
            r0 = r7
            r1 = r9
            java.lang.String r1 = r1.getDescriptor()
            org.objectweb.asm.Symbol r0 = r0.addConstantMethodType(r1)
            return r0
        Ldf:
            r0 = r7
            r1 = r9
            java.lang.String r1 = r1.getDescriptor()
            org.objectweb.asm.Symbol r0 = r0.addConstantClass(r1)
            return r0
        Le8:
            r0 = r8
            boolean r0 = r0 instanceof org.objectweb.asm.Handle
            if (r0 == 0) goto L10d
            r0 = r8
            org.objectweb.asm.Handle r0 = (org.objectweb.asm.Handle) r0
            r9 = r0
            r0 = r7
            r1 = r9
            int r1 = r1.getTag()
            r2 = r9
            java.lang.String r2 = r2.getOwner()
            r3 = r9
            java.lang.String r3 = r3.getName()
            r4 = r9
            java.lang.String r4 = r4.getDesc()
            r5 = r9
            boolean r5 = r5.isInterface()
            org.objectweb.asm.Symbol r0 = r0.addConstantMethodHandle(r1, r2, r3, r4, r5)
            return r0
        L10d:
            r0 = r8
            boolean r0 = r0 instanceof org.objectweb.asm.ConstantDynamic
            if (r0 == 0) goto L12e
            r0 = r8
            org.objectweb.asm.ConstantDynamic r0 = (org.objectweb.asm.ConstantDynamic) r0
            r9 = r0
            r0 = r7
            r1 = r9
            java.lang.String r1 = r1.getName()
            r2 = r9
            java.lang.String r2 = r2.getDescriptor()
            r3 = r9
            org.objectweb.asm.Handle r3 = r3.getBootstrapMethod()
            r4 = r9
            java.lang.Object[] r4 = r4.getBootstrapMethodArgumentsUnsafe()
            org.objectweb.asm.Symbol r0 = r0.addConstantDynamic(r1, r2, r3, r4)
            return r0
        L12e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "value "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    org.objectweb.asm.Symbol addConstantClass(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = 7
            r2 = r5
            org.objectweb.asm.Symbol r0 = r0.addConstantUtf8Reference(r1, r2)
            return r0
    }

    org.objectweb.asm.Symbol addConstantFieldref(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            r1 = 9
            r2 = r7
            r3 = r8
            r4 = r9
            org.objectweb.asm.SymbolTable$Entry r0 = r0.addConstantMemberReference(r1, r2, r3, r4)
            return r0
    }

    org.objectweb.asm.Symbol addConstantMethodref(java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
            r6 = this;
            r0 = r10
            if (r0 == 0) goto La
            r0 = 11
            goto Lc
        La:
            r0 = 10
        Lc:
            r11 = r0
            r0 = r6
            r1 = r11
            r2 = r7
            r3 = r8
            r4 = r9
            org.objectweb.asm.SymbolTable$Entry r0 = r0.addConstantMemberReference(r1, r2, r3, r4)
            return r0
    }

    private org.objectweb.asm.SymbolTable.Entry addConstantMemberReference(int r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
            r12 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            int r0 = hash(r0, r1, r2, r3)
            r17 = r0
            r0 = r12
            r1 = r17
            org.objectweb.asm.SymbolTable$Entry r0 = r0.get(r1)
            r18 = r0
        L12:
            r0 = r18
            if (r0 == 0) goto L5c
            r0 = r18
            int r0 = r0.tag
            r1 = r13
            if (r0 != r1) goto L52
            r0 = r18
            int r0 = r0.hashCode
            r1 = r17
            if (r0 != r1) goto L52
            r0 = r18
            java.lang.String r0 = r0.owner
            r1 = r14
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L52
            r0 = r18
            java.lang.String r0 = r0.name
            r1 = r15
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L52
            r0 = r18
            java.lang.String r0 = r0.value
            r1 = r16
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L52
            r0 = r18
            return r0
        L52:
            r0 = r18
            org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            r18 = r0
            goto L12
        L5c:
            r0 = r12
            org.objectweb.asm.ByteVector r0 = r0.constantPool
            r1 = r13
            r2 = r12
            r3 = r14
            org.objectweb.asm.Symbol r2 = r2.addConstantClass(r3)
            int r2 = r2.index
            r3 = r12
            r4 = r15
            r5 = r16
            int r3 = r3.addConstantNameAndType(r4, r5)
            org.objectweb.asm.ByteVector r0 = r0.put122(r1, r2, r3)
            r0 = r12
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r12
            r4 = r3
            int r4 = r4.constantPoolCount
            r5 = r4; r4 = r3; r3 = r5; 
            r6 = 1
            int r5 = r5 + r6
            r4.constantPoolCount = r5
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = 0
            r9 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            org.objectweb.asm.SymbolTable$Entry r0 = r0.put(r1)
            return r0
    }

    private void addConstantMemberReference(int r16, int r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
            r15 = this;
            r0 = r15
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = 0
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            int r9 = hash(r9, r10, r11, r12)
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.add(r1)
            return
    }

    org.objectweb.asm.Symbol addConstantString(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = 8
            r2 = r5
            org.objectweb.asm.Symbol r0 = r0.addConstantUtf8Reference(r1, r2)
            return r0
    }

    org.objectweb.asm.Symbol addConstantInteger(int r5) {
            r4 = this;
            r0 = r4
            r1 = 3
            r2 = r5
            org.objectweb.asm.Symbol r0 = r0.addConstantIntegerOrFloat(r1, r2)
            return r0
    }

    org.objectweb.asm.Symbol addConstantFloat(float r5) {
            r4 = this;
            r0 = r4
            r1 = 4
            r2 = r5
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            org.objectweb.asm.Symbol r0 = r0.addConstantIntegerOrFloat(r1, r2)
            return r0
    }

    private org.objectweb.asm.Symbol addConstantIntegerOrFloat(int r10, int r11) {
            r9 = this;
            r0 = r10
            r1 = r11
            int r0 = hash(r0, r1)
            r12 = r0
            r0 = r9
            r1 = r12
            org.objectweb.asm.SymbolTable$Entry r0 = r0.get(r1)
            r13 = r0
        Ld:
            r0 = r13
            if (r0 == 0) goto L3c
            r0 = r13
            int r0 = r0.tag
            r1 = r10
            if (r0 != r1) goto L32
            r0 = r13
            int r0 = r0.hashCode
            r1 = r12
            if (r0 != r1) goto L32
            r0 = r13
            long r0 = r0.data
            r1 = r11
            long r1 = (long) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L32
            r0 = r13
            return r0
        L32:
            r0 = r13
            org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            r13 = r0
            goto Ld
        L3c:
            r0 = r9
            org.objectweb.asm.ByteVector r0 = r0.constantPool
            r1 = r10
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r11
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r9
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r9
            r4 = r3
            int r4 = r4.constantPoolCount
            r5 = r4; r4 = r3; r3 = r5; 
            r6 = 1
            int r5 = r5 + r6
            r4.constantPoolCount = r5
            r4 = r10
            r5 = r11
            long r5 = (long) r5
            r6 = r12
            r2.<init>(r3, r4, r5, r6)
            org.objectweb.asm.SymbolTable$Entry r0 = r0.put(r1)
            return r0
    }

    private void addConstantIntegerOrFloat(int r11, int r12, int r13) {
            r10 = this;
            r0 = r10
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r11
            r4 = r12
            r5 = r13
            long r5 = (long) r5
            r6 = r12
            r7 = r13
            int r6 = hash(r6, r7)
            r2.<init>(r3, r4, r5, r6)
            r0.add(r1)
            return
    }

    org.objectweb.asm.Symbol addConstantLong(long r6) {
            r5 = this;
            r0 = r5
            r1 = 5
            r2 = r6
            org.objectweb.asm.Symbol r0 = r0.addConstantLongOrDouble(r1, r2)
            return r0
    }

    org.objectweb.asm.Symbol addConstantDouble(double r6) {
            r5 = this;
            r0 = r5
            r1 = 6
            r2 = r6
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            org.objectweb.asm.Symbol r0 = r0.addConstantLongOrDouble(r1, r2)
            return r0
    }

    private org.objectweb.asm.Symbol addConstantLongOrDouble(int r10, long r11) {
            r9 = this;
            r0 = r10
            r1 = r11
            int r0 = hash(r0, r1)
            r13 = r0
            r0 = r9
            r1 = r13
            org.objectweb.asm.SymbolTable$Entry r0 = r0.get(r1)
            r14 = r0
        Lf:
            r0 = r14
            if (r0 == 0) goto L3e
            r0 = r14
            int r0 = r0.tag
            r1 = r10
            if (r0 != r1) goto L34
            r0 = r14
            int r0 = r0.hashCode
            r1 = r13
            if (r0 != r1) goto L34
            r0 = r14
            long r0 = r0.data
            r1 = r11
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L34
            r0 = r14
            return r0
        L34:
            r0 = r14
            org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            r14 = r0
            goto Lf
        L3e:
            r0 = r9
            int r0 = r0.constantPoolCount
            r15 = r0
            r0 = r9
            org.objectweb.asm.ByteVector r0 = r0.constantPool
            r1 = r10
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r11
            org.objectweb.asm.ByteVector r0 = r0.putLong(r1)
            r0 = r9
            r1 = r0
            int r1 = r1.constantPoolCount
            r2 = 2
            int r1 = r1 + r2
            r0.constantPoolCount = r1
            r0 = r9
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r15
            r4 = r10
            r5 = r11
            r6 = r13
            r2.<init>(r3, r4, r5, r6)
            org.objectweb.asm.SymbolTable$Entry r0 = r0.put(r1)
            return r0
    }

    private void addConstantLongOrDouble(int r12, int r13, long r14) {
            r11 = this;
            r0 = r11
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r13
            r7 = r14
            int r6 = hash(r6, r7)
            r2.<init>(r3, r4, r5, r6)
            r0.add(r1)
            return
    }

    int addConstantNameAndType(java.lang.String r10, java.lang.String r11) {
            r9 = this;
            r0 = 12
            r12 = r0
            r0 = 12
            r1 = r10
            r2 = r11
            int r0 = hash(r0, r1, r2)
            r13 = r0
            r0 = r9
            r1 = r13
            org.objectweb.asm.SymbolTable$Entry r0 = r0.get(r1)
            r14 = r0
        L14:
            r0 = r14
            if (r0 == 0) goto L55
            r0 = r14
            int r0 = r0.tag
            r1 = 12
            if (r0 != r1) goto L4b
            r0 = r14
            int r0 = r0.hashCode
            r1 = r13
            if (r0 != r1) goto L4b
            r0 = r14
            java.lang.String r0 = r0.name
            r1 = r10
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
            r0 = r14
            java.lang.String r0 = r0.value
            r1 = r11
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
            r0 = r14
            int r0 = r0.index
            return r0
        L4b:
            r0 = r14
            org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            r14 = r0
            goto L14
        L55:
            r0 = r9
            org.objectweb.asm.ByteVector r0 = r0.constantPool
            r1 = 12
            r2 = r9
            r3 = r10
            int r2 = r2.addConstantUtf8(r3)
            r3 = r9
            r4 = r11
            int r3 = r3.addConstantUtf8(r4)
            org.objectweb.asm.ByteVector r0 = r0.put122(r1, r2, r3)
            r0 = r9
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r9
            r4 = r3
            int r4 = r4.constantPoolCount
            r5 = r4; r4 = r3; r3 = r5; 
            r6 = 1
            int r5 = r5 + r6
            r4.constantPoolCount = r5
            r4 = 12
            r5 = r10
            r6 = r11
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            org.objectweb.asm.SymbolTable$Entry r0 = r0.put(r1)
            int r0 = r0.index
            return r0
    }

    private void addConstantNameAndType(int r12, java.lang.String r13, java.lang.String r14) {
            r11 = this;
            r0 = 12
            r15 = r0
            r0 = r11
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r12
            r4 = 12
            r5 = r13
            r6 = r14
            r7 = 12
            r8 = r13
            r9 = r14
            int r7 = hash(r7, r8, r9)
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r1)
            return
    }

    int addConstantUtf8(java.lang.String r9) {
            r8 = this;
            r0 = 1
            r1 = r9
            int r0 = hash(r0, r1)
            r10 = r0
            r0 = r8
            r1 = r10
            org.objectweb.asm.SymbolTable$Entry r0 = r0.get(r1)
            r11 = r0
        Lc:
            r0 = r11
            if (r0 == 0) goto L38
            r0 = r11
            int r0 = r0.tag
            r1 = 1
            if (r0 != r1) goto L30
            r0 = r11
            int r0 = r0.hashCode
            r1 = r10
            if (r0 != r1) goto L30
            r0 = r11
            java.lang.String r0 = r0.value
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            r0 = r11
            int r0 = r0.index
            return r0
        L30:
            r0 = r11
            org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            r11 = r0
            goto Lc
        L38:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.constantPool
            r1 = 1
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r9
            org.objectweb.asm.ByteVector r0 = r0.putUTF8(r1)
            r0 = r8
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r8
            r4 = r3
            int r4 = r4.constantPoolCount
            r5 = r4; r4 = r3; r3 = r5; 
            r6 = 1
            int r5 = r5 + r6
            r4.constantPoolCount = r5
            r4 = 1
            r5 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6)
            org.objectweb.asm.SymbolTable$Entry r0 = r0.put(r1)
            int r0 = r0.index
            return r0
    }

    private void addConstantUtf8(int r10, java.lang.String r11) {
            r9 = this;
            r0 = r9
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r10
            r4 = 1
            r5 = r11
            r6 = 1
            r7 = r11
            int r6 = hash(r6, r7)
            r2.<init>(r3, r4, r5, r6)
            r0.add(r1)
            return
    }

    org.objectweb.asm.Symbol addConstantMethodHandle(int r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, boolean r17) {
            r12 = this;
            r0 = 15
            r18 = r0
            r0 = 15
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r13
            int r0 = hash(r0, r1, r2, r3, r4)
            r19 = r0
            r0 = r12
            r1 = r19
            org.objectweb.asm.SymbolTable$Entry r0 = r0.get(r1)
            r20 = r0
        L18:
            r0 = r20
            if (r0 == 0) goto L6e
            r0 = r20
            int r0 = r0.tag
            r1 = 15
            if (r0 != r1) goto L64
            r0 = r20
            int r0 = r0.hashCode
            r1 = r19
            if (r0 != r1) goto L64
            r0 = r20
            long r0 = r0.data
            r1 = r13
            long r1 = (long) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L64
            r0 = r20
            java.lang.String r0 = r0.owner
            r1 = r14
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L64
            r0 = r20
            java.lang.String r0 = r0.name
            r1 = r15
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L64
            r0 = r20
            java.lang.String r0 = r0.value
            r1 = r16
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L64
            r0 = r20
            return r0
        L64:
            r0 = r20
            org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            r20 = r0
            goto L18
        L6e:
            r0 = r13
            r1 = 4
            if (r0 > r1) goto L8c
            r0 = r12
            org.objectweb.asm.ByteVector r0 = r0.constantPool
            r1 = 15
            r2 = r13
            r3 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            org.objectweb.asm.Symbol r3 = r3.addConstantFieldref(r4, r5, r6)
            int r3 = r3.index
            org.objectweb.asm.ByteVector r0 = r0.put112(r1, r2, r3)
            goto La4
        L8c:
            r0 = r12
            org.objectweb.asm.ByteVector r0 = r0.constantPool
            r1 = 15
            r2 = r13
            r3 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.objectweb.asm.Symbol r3 = r3.addConstantMethodref(r4, r5, r6, r7)
            int r3 = r3.index
            org.objectweb.asm.ByteVector r0 = r0.put112(r1, r2, r3)
        La4:
            r0 = r12
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r12
            r4 = r3
            int r4 = r4.constantPoolCount
            r5 = r4; r4 = r3; r3 = r5; 
            r6 = 1
            int r5 = r5 + r6
            r4.constantPoolCount = r5
            r4 = 15
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r13
            long r8 = (long) r8
            r9 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            org.objectweb.asm.SymbolTable$Entry r0 = r0.put(r1)
            return r0
    }

    private void addConstantMethodHandle(int r13, int r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
            r12 = this;
            r0 = 15
            r18 = r0
            r0 = 15
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r14
            int r0 = hash(r0, r1, r2, r3, r4)
            r19 = r0
            r0 = r12
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r13
            r4 = 15
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r14
            long r8 = (long) r8
            r9 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.add(r1)
            return
    }

    org.objectweb.asm.Symbol addConstantMethodType(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = 16
            r2 = r5
            org.objectweb.asm.Symbol r0 = r0.addConstantUtf8Reference(r1, r2)
            return r0
    }

    org.objectweb.asm.Symbol addConstantDynamic(java.lang.String r7, java.lang.String r8, org.objectweb.asm.Handle r9, java.lang.Object... r10) {
            r6 = this;
            r0 = r6
            r1 = r9
            r2 = r10
            org.objectweb.asm.Symbol r0 = r0.addBootstrapMethod(r1, r2)
            r11 = r0
            r0 = r6
            r1 = 17
            r2 = r7
            r3 = r8
            r4 = r11
            int r4 = r4.index
            org.objectweb.asm.Symbol r0 = r0.addConstantDynamicOrInvokeDynamicReference(r1, r2, r3, r4)
            return r0
    }

    org.objectweb.asm.Symbol addConstantInvokeDynamic(java.lang.String r7, java.lang.String r8, org.objectweb.asm.Handle r9, java.lang.Object... r10) {
            r6 = this;
            r0 = r6
            r1 = r9
            r2 = r10
            org.objectweb.asm.Symbol r0 = r0.addBootstrapMethod(r1, r2)
            r11 = r0
            r0 = r6
            r1 = 18
            r2 = r7
            r3 = r8
            r4 = r11
            int r4 = r4.index
            org.objectweb.asm.Symbol r0 = r0.addConstantDynamicOrInvokeDynamicReference(r1, r2, r3, r4)
            return r0
    }

    private org.objectweb.asm.Symbol addConstantDynamicOrInvokeDynamicReference(int r13, java.lang.String r14, java.lang.String r15, int r16) {
            r12 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            int r0 = hash(r0, r1, r2, r3)
            r17 = r0
            r0 = r12
            r1 = r17
            org.objectweb.asm.SymbolTable$Entry r0 = r0.get(r1)
            r18 = r0
        L12:
            r0 = r18
            if (r0 == 0) goto L5b
            r0 = r18
            int r0 = r0.tag
            r1 = r13
            if (r0 != r1) goto L51
            r0 = r18
            int r0 = r0.hashCode
            r1 = r17
            if (r0 != r1) goto L51
            r0 = r18
            long r0 = r0.data
            r1 = r16
            long r1 = (long) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L51
            r0 = r18
            java.lang.String r0 = r0.name
            r1 = r14
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            r0 = r18
            java.lang.String r0 = r0.value
            r1 = r15
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            r0 = r18
            return r0
        L51:
            r0 = r18
            org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            r18 = r0
            goto L12
        L5b:
            r0 = r12
            org.objectweb.asm.ByteVector r0 = r0.constantPool
            r1 = r13
            r2 = r16
            r3 = r12
            r4 = r14
            r5 = r15
            int r3 = r3.addConstantNameAndType(r4, r5)
            org.objectweb.asm.ByteVector r0 = r0.put122(r1, r2, r3)
            r0 = r12
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r12
            r4 = r3
            int r4 = r4.constantPoolCount
            r5 = r4; r4 = r3; r3 = r5; 
            r6 = 1
            int r5 = r5 + r6
            r4.constantPoolCount = r5
            r4 = r13
            r5 = 0
            r6 = r14
            r7 = r15
            r8 = r16
            long r8 = (long) r8
            r9 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            org.objectweb.asm.SymbolTable$Entry r0 = r0.put(r1)
            return r0
    }

    private void addConstantDynamicOrInvokeDynamicReference(int r13, int r14, java.lang.String r15, java.lang.String r16, int r17) {
            r12 = this;
            r0 = r13
            r1 = r15
            r2 = r16
            r3 = r17
            int r0 = hash(r0, r1, r2, r3)
            r18 = r0
            r0 = r12
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r14
            r4 = r13
            r5 = 0
            r6 = r15
            r7 = r16
            r8 = r17
            long r8 = (long) r8
            r9 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.add(r1)
            return
    }

    org.objectweb.asm.Symbol addConstantModule(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = 19
            r2 = r5
            org.objectweb.asm.Symbol r0 = r0.addConstantUtf8Reference(r1, r2)
            return r0
    }

    org.objectweb.asm.Symbol addConstantPackage(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = 20
            r2 = r5
            org.objectweb.asm.Symbol r0 = r0.addConstantUtf8Reference(r1, r2)
            return r0
    }

    private org.objectweb.asm.Symbol addConstantUtf8Reference(int r9, java.lang.String r10) {
            r8 = this;
            r0 = r9
            r1 = r10
            int r0 = hash(r0, r1)
            r11 = r0
            r0 = r8
            r1 = r11
            org.objectweb.asm.SymbolTable$Entry r0 = r0.get(r1)
            r12 = r0
        Ld:
            r0 = r12
            if (r0 == 0) goto L3d
            r0 = r12
            int r0 = r0.tag
            r1 = r9
            if (r0 != r1) goto L33
            r0 = r12
            int r0 = r0.hashCode
            r1 = r11
            if (r0 != r1) goto L33
            r0 = r12
            java.lang.String r0 = r0.value
            r1 = r10
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            r0 = r12
            return r0
        L33:
            r0 = r12
            org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            r12 = r0
            goto Ld
        L3d:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.constantPool
            r1 = r9
            r2 = r8
            r3 = r10
            int r2 = r2.addConstantUtf8(r3)
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r0 = r8
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r8
            r4 = r3
            int r4 = r4.constantPoolCount
            r5 = r4; r4 = r3; r3 = r5; 
            r6 = 1
            int r5 = r5 + r6
            r4.constantPoolCount = r5
            r4 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6)
            org.objectweb.asm.SymbolTable$Entry r0 = r0.put(r1)
            return r0
    }

    private void addConstantUtf8Reference(int r10, int r11, java.lang.String r12) {
            r9 = this;
            r0 = r9
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r11
            r7 = r12
            int r6 = hash(r6, r7)
            r2.<init>(r3, r4, r5, r6)
            r0.add(r1)
            return
    }

    org.objectweb.asm.Symbol addBootstrapMethod(org.objectweb.asm.Handle r9, java.lang.Object... r10) {
            r8 = this;
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.bootstrapMethods
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L16
            r0 = r8
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r2 = r1; r1 = r0; r0 = r2; 
            r1.bootstrapMethods = r2
            r11 = r0
        L16:
            r0 = r10
            int r0 = r0.length
            r12 = r0
            r0 = r12
            int[] r0 = new int[r0]
            r13 = r0
            r0 = 0
            r14 = r0
        L23:
            r0 = r14
            r1 = r12
            if (r0 >= r1) goto L40
            r0 = r13
            r1 = r14
            r2 = r8
            r3 = r10
            r4 = r14
            r3 = r3[r4]
            org.objectweb.asm.Symbol r2 = r2.addConstant(r3)
            int r2 = r2.index
            r0[r1] = r2
            int r14 = r14 + 1
            goto L23
        L40:
            r0 = r11
            int r0 = r0.length
            r14 = r0
            r0 = r11
            r1 = r8
            r2 = r9
            int r2 = r2.getTag()
            r3 = r9
            java.lang.String r3 = r3.getOwner()
            r4 = r9
            java.lang.String r4 = r4.getName()
            r5 = r9
            java.lang.String r5 = r5.getDesc()
            r6 = r9
            boolean r6 = r6.isInterface()
            org.objectweb.asm.Symbol r1 = r1.addConstantMethodHandle(r2, r3, r4, r5, r6)
            int r1 = r1.index
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r11
            r1 = r12
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r15 = r0
        L70:
            r0 = r15
            r1 = r12
            if (r0 >= r1) goto L87
            r0 = r11
            r1 = r13
            r2 = r15
            r1 = r1[r2]
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            int r15 = r15 + 1
            goto L70
        L87:
            r0 = r11
            int r0 = r0.length
            r1 = r14
            int r0 = r0 - r1
            r15 = r0
            r0 = r9
            int r0 = r0.hashCode()
            r16 = r0
            r0 = r10
            r17 = r0
            r0 = r17
            int r0 = r0.length
            r18 = r0
            r0 = 0
            r19 = r0
        La1:
            r0 = r19
            r1 = r18
            if (r0 >= r1) goto Lbf
            r0 = r17
            r1 = r19
            r0 = r0[r1]
            r20 = r0
            r0 = r16
            r1 = r20
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            r16 = r0
            int r19 = r19 + 1
            goto La1
        Lbf:
            r0 = r16
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            r16 = r0
            r0 = r8
            r1 = r14
            r2 = r15
            r3 = r16
            org.objectweb.asm.Symbol r0 = r0.addBootstrapMethod(r1, r2, r3)
            return r0
    }

    private org.objectweb.asm.Symbol addBootstrapMethod(int r10, int r11, int r12) {
            r9 = this;
            r0 = r9
            org.objectweb.asm.ByteVector r0 = r0.bootstrapMethods
            byte[] r0 = r0.data
            r13 = r0
            r0 = r9
            r1 = r12
            org.objectweb.asm.SymbolTable$Entry r0 = r0.get(r1)
            r14 = r0
        L10:
            r0 = r14
            if (r0 == 0) goto L74
            r0 = r14
            int r0 = r0.tag
            r1 = 64
            if (r0 != r1) goto L6a
            r0 = r14
            int r0 = r0.hashCode
            r1 = r12
            if (r0 != r1) goto L6a
            r0 = r14
            long r0 = r0.data
            int r0 = (int) r0
            r15 = r0
            r0 = 1
            r16 = r0
            r0 = 0
            r17 = r0
        L36:
            r0 = r17
            r1 = r11
            if (r0 >= r1) goto L5a
            r0 = r13
            r1 = r10
            r2 = r17
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = r13
            r2 = r15
            r3 = r17
            int r2 = r2 + r3
            r1 = r1[r2]
            if (r0 == r1) goto L54
            r0 = 0
            r16 = r0
            goto L5a
        L54:
            int r17 = r17 + 1
            goto L36
        L5a:
            r0 = r16
            if (r0 == 0) goto L6a
            r0 = r9
            org.objectweb.asm.ByteVector r0 = r0.bootstrapMethods
            r1 = r10
            r0.length = r1
            r0 = r14
            return r0
        L6a:
            r0 = r14
            org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            r14 = r0
            goto L10
        L74:
            r0 = r9
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r9
            r4 = r3
            int r4 = r4.bootstrapMethodCount
            r5 = r4; r4 = r3; r3 = r5; 
            r6 = 1
            int r5 = r5 + r6
            r4.bootstrapMethodCount = r5
            r4 = 64
            r5 = r10
            long r5 = (long) r5
            r6 = r12
            r2.<init>(r3, r4, r5, r6)
            org.objectweb.asm.SymbolTable$Entry r0 = r0.put(r1)
            return r0
    }

    org.objectweb.asm.Symbol getType(int r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.SymbolTable$Entry[] r0 = r0.typeTable
            r1 = r4
            r0 = r0[r1]
            return r0
    }

    int addType(java.lang.String r9) {
            r8 = this;
            r0 = 128(0x80, float:1.794E-43)
            r1 = r9
            int r0 = hash(r0, r1)
            r10 = r0
            r0 = r8
            r1 = r10
            org.objectweb.asm.SymbolTable$Entry r0 = r0.get(r1)
            r11 = r0
        Le:
            r0 = r11
            if (r0 == 0) goto L3c
            r0 = r11
            int r0 = r0.tag
            r1 = 128(0x80, float:1.794E-43)
            if (r0 != r1) goto L34
            r0 = r11
            int r0 = r0.hashCode
            r1 = r10
            if (r0 != r1) goto L34
            r0 = r11
            java.lang.String r0 = r0.value
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            r0 = r11
            int r0 = r0.index
            return r0
        L34:
            r0 = r11
            org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            r11 = r0
            goto Le
        L3c:
            r0 = r8
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r8
            int r3 = r3.typeCount
            r4 = 128(0x80, float:1.794E-43)
            r5 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6)
            int r0 = r0.addTypeInternal(r1)
            return r0
    }

    int addUninitializedType(java.lang.String r11, int r12) {
            r10 = this;
            r0 = 129(0x81, float:1.81E-43)
            r1 = r11
            r2 = r12
            int r0 = hash(r0, r1, r2)
            r13 = r0
            r0 = r10
            r1 = r13
            org.objectweb.asm.SymbolTable$Entry r0 = r0.get(r1)
            r14 = r0
        L10:
            r0 = r14
            if (r0 == 0) goto L50
            r0 = r14
            int r0 = r0.tag
            r1 = 129(0x81, float:1.81E-43)
            if (r0 != r1) goto L46
            r0 = r14
            int r0 = r0.hashCode
            r1 = r13
            if (r0 != r1) goto L46
            r0 = r14
            long r0 = r0.data
            r1 = r12
            long r1 = (long) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L46
            r0 = r14
            java.lang.String r0 = r0.value
            r1 = r11
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            r0 = r14
            int r0 = r0.index
            return r0
        L46:
            r0 = r14
            org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            r14 = r0
            goto L10
        L50:
            r0 = r10
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r10
            int r3 = r3.typeCount
            r4 = 129(0x81, float:1.81E-43)
            r5 = r11
            r6 = r12
            long r6 = (long) r6
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            int r0 = r0.addTypeInternal(r1)
            return r0
    }

    int addMergedType(int r10, int r11) {
            r9 = this;
            r0 = r10
            r1 = r11
            if (r0 >= r1) goto L10
            r0 = r10
            long r0 = (long) r0
            r1 = r11
            long r1 = (long) r1
            r2 = 32
            long r1 = r1 << r2
            long r0 = r0 | r1
            goto L18
        L10:
            r0 = r11
            long r0 = (long) r0
            r1 = r10
            long r1 = (long) r1
            r2 = 32
            long r1 = r1 << r2
            long r0 = r0 | r1
        L18:
            r12 = r0
            r0 = 130(0x82, float:1.82E-43)
            r1 = r10
            r2 = r11
            int r1 = r1 + r2
            int r0 = hash(r0, r1)
            r14 = r0
            r0 = r9
            r1 = r14
            org.objectweb.asm.SymbolTable$Entry r0 = r0.get(r1)
            r15 = r0
        L2c:
            r0 = r15
            if (r0 == 0) goto L60
            r0 = r15
            int r0 = r0.tag
            r1 = 130(0x82, float:1.82E-43)
            if (r0 != r1) goto L56
            r0 = r15
            int r0 = r0.hashCode
            r1 = r14
            if (r0 != r1) goto L56
            r0 = r15
            long r0 = r0.data
            r1 = r12
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L56
            r0 = r15
            int r0 = r0.info
            return r0
        L56:
            r0 = r15
            org.objectweb.asm.SymbolTable$Entry r0 = r0.next
            r15 = r0
            goto L2c
        L60:
            r0 = r9
            org.objectweb.asm.SymbolTable$Entry[] r0 = r0.typeTable
            r1 = r10
            r0 = r0[r1]
            java.lang.String r0 = r0.value
            r16 = r0
            r0 = r9
            org.objectweb.asm.SymbolTable$Entry[] r0 = r0.typeTable
            r1 = r11
            r0 = r0[r1]
            java.lang.String r0 = r0.value
            r17 = r0
            r0 = r9
            r1 = r9
            org.objectweb.asm.ClassWriter r1 = r1.classWriter
            r2 = r16
            r3 = r17
            java.lang.String r1 = r1.getCommonSuperClass(r2, r3)
            int r0 = r0.addType(r1)
            r18 = r0
            r0 = r9
            org.objectweb.asm.SymbolTable$Entry r1 = new org.objectweb.asm.SymbolTable$Entry
            r2 = r1
            r3 = r9
            int r3 = r3.typeCount
            r4 = 130(0x82, float:1.82E-43)
            r5 = r12
            r6 = r14
            r2.<init>(r3, r4, r5, r6)
            org.objectweb.asm.SymbolTable$Entry r0 = r0.put(r1)
            r1 = r18
            r0.info = r1
            r0 = r18
            return r0
    }

    private int addTypeInternal(org.objectweb.asm.SymbolTable.Entry r7) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.SymbolTable$Entry[] r0 = r0.typeTable
            if (r0 != 0) goto L10
            r0 = r6
            r1 = 16
            org.objectweb.asm.SymbolTable$Entry[] r1 = new org.objectweb.asm.SymbolTable.Entry[r1]
            r0.typeTable = r1
        L10:
            r0 = r6
            int r0 = r0.typeCount
            r1 = r6
            org.objectweb.asm.SymbolTable$Entry[] r1 = r1.typeTable
            int r1 = r1.length
            if (r0 != r1) goto L3b
            r0 = 2
            r1 = r6
            org.objectweb.asm.SymbolTable$Entry[] r1 = r1.typeTable
            int r1 = r1.length
            int r0 = r0 * r1
            org.objectweb.asm.SymbolTable$Entry[] r0 = new org.objectweb.asm.SymbolTable.Entry[r0]
            r8 = r0
            r0 = r6
            org.objectweb.asm.SymbolTable$Entry[] r0 = r0.typeTable
            r1 = 0
            r2 = r8
            r3 = 0
            r4 = r6
            org.objectweb.asm.SymbolTable$Entry[] r4 = r4.typeTable
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r8
            r0.typeTable = r1
        L3b:
            r0 = r6
            org.objectweb.asm.SymbolTable$Entry[] r0 = r0.typeTable
            r1 = r6
            r2 = r1
            int r2 = r2.typeCount
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.typeCount = r3
            r2 = r7
            r0[r1] = r2
            r0 = r6
            r1 = r7
            org.objectweb.asm.SymbolTable$Entry r0 = r0.put(r1)
            int r0 = r0.index
            return r0
    }

    private static int hash(int r4, int r5) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r4
            r2 = r5
            int r1 = r1 + r2
            r0 = r0 & r1
            return r0
    }

    private static int hash(int r6, long r7) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r6
            r2 = r7
            int r2 = (int) r2
            int r1 = r1 + r2
            r2 = r7
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            int r1 = r1 + r2
            r0 = r0 & r1
            return r0
    }

    private static int hash(int r4, java.lang.String r5) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r4
            r2 = r5
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            r0 = r0 & r1
            return r0
    }

    private static int hash(int r4, java.lang.String r5, int r6) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r4
            r2 = r5
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            r2 = r6
            int r1 = r1 + r2
            r0 = r0 & r1
            return r0
    }

    private static int hash(int r5, java.lang.String r6, java.lang.String r7) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r5
            r2 = r6
            int r2 = r2.hashCode()
            r3 = r7
            int r3 = r3.hashCode()
            int r2 = r2 * r3
            int r1 = r1 + r2
            r0 = r0 & r1
            return r0
    }

    private static int hash(int r6, java.lang.String r7, java.lang.String r8, int r9) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r6
            r2 = r7
            int r2 = r2.hashCode()
            r3 = r8
            int r3 = r3.hashCode()
            int r2 = r2 * r3
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2 * r3
            int r1 = r1 + r2
            r0 = r0 & r1
            return r0
    }

    private static int hash(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r5
            r2 = r6
            int r2 = r2.hashCode()
            r3 = r7
            int r3 = r3.hashCode()
            int r2 = r2 * r3
            r3 = r8
            int r3 = r3.hashCode()
            int r2 = r2 * r3
            int r1 = r1 + r2
            r0 = r0 & r1
            return r0
    }

    private static int hash(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r5
            r2 = r6
            int r2 = r2.hashCode()
            r3 = r7
            int r3 = r3.hashCode()
            int r2 = r2 * r3
            r3 = r8
            int r3 = r3.hashCode()
            int r2 = r2 * r3
            r3 = r9
            int r2 = r2 * r3
            int r1 = r1 + r2
            r0 = r0 & r1
            return r0
    }
}
