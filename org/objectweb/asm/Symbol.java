package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/Symbol.SCL.lombok */
abstract class Symbol {
    static final int CONSTANT_CLASS_TAG = 7;
    static final int CONSTANT_FIELDREF_TAG = 9;
    static final int CONSTANT_METHODREF_TAG = 10;
    static final int CONSTANT_INTERFACE_METHODREF_TAG = 11;
    static final int CONSTANT_STRING_TAG = 8;
    static final int CONSTANT_INTEGER_TAG = 3;
    static final int CONSTANT_FLOAT_TAG = 4;
    static final int CONSTANT_LONG_TAG = 5;
    static final int CONSTANT_DOUBLE_TAG = 6;
    static final int CONSTANT_NAME_AND_TYPE_TAG = 12;
    static final int CONSTANT_UTF8_TAG = 1;
    static final int CONSTANT_METHOD_HANDLE_TAG = 15;
    static final int CONSTANT_METHOD_TYPE_TAG = 16;
    static final int CONSTANT_DYNAMIC_TAG = 17;
    static final int CONSTANT_INVOKE_DYNAMIC_TAG = 18;
    static final int CONSTANT_MODULE_TAG = 19;
    static final int CONSTANT_PACKAGE_TAG = 20;
    static final int BOOTSTRAP_METHOD_TAG = 64;
    static final int TYPE_TAG = 128;
    static final int UNINITIALIZED_TYPE_TAG = 129;
    static final int MERGED_TYPE_TAG = 130;
    final int index;
    final int tag;
    final java.lang.String owner;
    final java.lang.String name;
    final java.lang.String value;
    final long data;
    int info;

    Symbol(int r5, int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, long r10) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.index = r1
            r0 = r4
            r1 = r6
            r0.tag = r1
            r0 = r4
            r1 = r7
            r0.owner = r1
            r0 = r4
            r1 = r8
            r0.name = r1
            r0 = r4
            r1 = r9
            r0.value = r1
            r0 = r4
            r1 = r10
            r0.data = r1
            return
    }

    int getArgumentsAndReturnSizes() {
            r3 = this;
            r0 = r3
            int r0 = r0.info
            if (r0 != 0) goto L12
            r0 = r3
            r1 = r3
            java.lang.String r1 = r1.value
            int r1 = org.objectweb.asm.Type.getArgumentsAndReturnSizes(r1)
            r0.info = r1
        L12:
            r0 = r3
            int r0 = r0.info
            return r0
    }
}
