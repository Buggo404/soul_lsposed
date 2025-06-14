package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/TypeReference.SCL.lombok */
public class TypeReference {
    public static final int CLASS_TYPE_PARAMETER = 0;
    public static final int METHOD_TYPE_PARAMETER = 1;
    public static final int CLASS_EXTENDS = 16;
    public static final int CLASS_TYPE_PARAMETER_BOUND = 17;
    public static final int METHOD_TYPE_PARAMETER_BOUND = 18;
    public static final int FIELD = 19;
    public static final int METHOD_RETURN = 20;
    public static final int METHOD_RECEIVER = 21;
    public static final int METHOD_FORMAL_PARAMETER = 22;
    public static final int THROWS = 23;
    public static final int LOCAL_VARIABLE = 64;
    public static final int RESOURCE_VARIABLE = 65;
    public static final int EXCEPTION_PARAMETER = 66;
    public static final int INSTANCEOF = 67;
    public static final int NEW = 68;
    public static final int CONSTRUCTOR_REFERENCE = 69;
    public static final int METHOD_REFERENCE = 70;
    public static final int CAST = 71;
    public static final int CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT = 72;
    public static final int METHOD_INVOCATION_TYPE_ARGUMENT = 73;
    public static final int CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT = 74;
    public static final int METHOD_REFERENCE_TYPE_ARGUMENT = 75;
    private final int targetTypeAndInfo;

    public TypeReference(int r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.targetTypeAndInfo = r1
            return
    }

    public static org.objectweb.asm.TypeReference newTypeReference(int r5) {
            org.objectweb.asm.TypeReference r0 = new org.objectweb.asm.TypeReference
            r1 = r0
            r2 = r5
            r3 = 24
            int r2 = r2 << r3
            r1.<init>(r2)
            return r0
    }

    public static org.objectweb.asm.TypeReference newTypeParameterReference(int r6, int r7) {
            org.objectweb.asm.TypeReference r0 = new org.objectweb.asm.TypeReference
            r1 = r0
            r2 = r6
            r3 = 24
            int r2 = r2 << r3
            r3 = r7
            r4 = 16
            int r3 = r3 << r4
            r2 = r2 | r3
            r1.<init>(r2)
            return r0
    }

    public static org.objectweb.asm.TypeReference newTypeParameterBoundReference(int r6, int r7, int r8) {
            org.objectweb.asm.TypeReference r0 = new org.objectweb.asm.TypeReference
            r1 = r0
            r2 = r6
            r3 = 24
            int r2 = r2 << r3
            r3 = r7
            r4 = 16
            int r3 = r3 << r4
            r2 = r2 | r3
            r3 = r8
            r4 = 8
            int r3 = r3 << r4
            r2 = r2 | r3
            r1.<init>(r2)
            return r0
    }

    public static org.objectweb.asm.TypeReference newSuperTypeReference(int r6) {
            org.objectweb.asm.TypeReference r0 = new org.objectweb.asm.TypeReference
            r1 = r0
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r6
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r4
            r4 = 8
            int r3 = r3 << r4
            r2 = r2 | r3
            r1.<init>(r2)
            return r0
    }

    public static org.objectweb.asm.TypeReference newFormalParameterReference(int r6) {
            org.objectweb.asm.TypeReference r0 = new org.objectweb.asm.TypeReference
            r1 = r0
            r2 = 369098752(0x16000000, float:1.03397577E-25)
            r3 = r6
            r4 = 16
            int r3 = r3 << r4
            r2 = r2 | r3
            r1.<init>(r2)
            return r0
    }

    public static org.objectweb.asm.TypeReference newExceptionReference(int r6) {
            org.objectweb.asm.TypeReference r0 = new org.objectweb.asm.TypeReference
            r1 = r0
            r2 = 385875968(0x17000000, float:4.135903E-25)
            r3 = r6
            r4 = 8
            int r3 = r3 << r4
            r2 = r2 | r3
            r1.<init>(r2)
            return r0
    }

    public static org.objectweb.asm.TypeReference newTryCatchReference(int r6) {
            org.objectweb.asm.TypeReference r0 = new org.objectweb.asm.TypeReference
            r1 = r0
            r2 = 1107296256(0x42000000, float:32.0)
            r3 = r6
            r4 = 8
            int r3 = r3 << r4
            r2 = r2 | r3
            r1.<init>(r2)
            return r0
    }

    public static org.objectweb.asm.TypeReference newTypeArgumentReference(int r5, int r6) {
            org.objectweb.asm.TypeReference r0 = new org.objectweb.asm.TypeReference
            r1 = r0
            r2 = r5
            r3 = 24
            int r2 = r2 << r3
            r3 = r6
            r2 = r2 | r3
            r1.<init>(r2)
            return r0
    }

    public int getSort() {
            r3 = this;
            r0 = r3
            int r0 = r0.targetTypeAndInfo
            r1 = 24
            int r0 = r0 >>> r1
            return r0
    }

    public int getTypeParameterIndex() {
            r3 = this;
            r0 = r3
            int r0 = r0.targetTypeAndInfo
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r0 = r0 & r1
            r1 = 16
            int r0 = r0 >> r1
            return r0
    }

    public int getTypeParameterBoundIndex() {
            r3 = this;
            r0 = r3
            int r0 = r0.targetTypeAndInfo
            r1 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 >> r1
            return r0
    }

    public int getSuperTypeIndex() {
            r3 = this;
            r0 = r3
            int r0 = r0.targetTypeAndInfo
            r1 = 16776960(0xffff00, float:2.3509528E-38)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 >> r1
            short r0 = (short) r0
            return r0
    }

    public int getFormalParameterIndex() {
            r3 = this;
            r0 = r3
            int r0 = r0.targetTypeAndInfo
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r0 = r0 & r1
            r1 = 16
            int r0 = r0 >> r1
            return r0
    }

    public int getExceptionIndex() {
            r3 = this;
            r0 = r3
            int r0 = r0.targetTypeAndInfo
            r1 = 16776960(0xffff00, float:2.3509528E-38)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 >> r1
            return r0
    }

    public int getTryCatchBlockIndex() {
            r3 = this;
            r0 = r3
            int r0 = r0.targetTypeAndInfo
            r1 = 16776960(0xffff00, float:2.3509528E-38)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 >> r1
            return r0
    }

    public int getTypeArgumentIndex() {
            r3 = this;
            r0 = r3
            int r0 = r0.targetTypeAndInfo
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            return r0
    }

    public int getValue() {
            r2 = this;
            r0 = r2
            int r0 = r0.targetTypeAndInfo
            return r0
    }

    static void putTarget(int r5, org.objectweb.asm.ByteVector r6) {
            r0 = r5
            r1 = 24
            int r0 = r0 >>> r1
            switch(r0) {
                case 0: goto L144;
                case 1: goto L144;
                case 2: goto L178;
                case 3: goto L178;
                case 4: goto L178;
                case 5: goto L178;
                case 6: goto L178;
                case 7: goto L178;
                case 8: goto L178;
                case 9: goto L178;
                case 10: goto L178;
                case 11: goto L178;
                case 12: goto L178;
                case 13: goto L178;
                case 14: goto L178;
                case 15: goto L178;
                case 16: goto L165;
                case 17: goto L165;
                case 18: goto L165;
                case 19: goto L150;
                case 20: goto L150;
                case 21: goto L150;
                case 22: goto L144;
                case 23: goto L165;
                case 24: goto L178;
                case 25: goto L178;
                case 26: goto L178;
                case 27: goto L178;
                case 28: goto L178;
                case 29: goto L178;
                case 30: goto L178;
                case 31: goto L178;
                case 32: goto L178;
                case 33: goto L178;
                case 34: goto L178;
                case 35: goto L178;
                case 36: goto L178;
                case 37: goto L178;
                case 38: goto L178;
                case 39: goto L178;
                case 40: goto L178;
                case 41: goto L178;
                case 42: goto L178;
                case 43: goto L178;
                case 44: goto L178;
                case 45: goto L178;
                case 46: goto L178;
                case 47: goto L178;
                case 48: goto L178;
                case 49: goto L178;
                case 50: goto L178;
                case 51: goto L178;
                case 52: goto L178;
                case 53: goto L178;
                case 54: goto L178;
                case 55: goto L178;
                case 56: goto L178;
                case 57: goto L178;
                case 58: goto L178;
                case 59: goto L178;
                case 60: goto L178;
                case 61: goto L178;
                case 62: goto L178;
                case 63: goto L178;
                case 64: goto L178;
                case 65: goto L178;
                case 66: goto L165;
                case 67: goto L165;
                case 68: goto L165;
                case 69: goto L165;
                case 70: goto L165;
                case 71: goto L15c;
                case 72: goto L15c;
                case 73: goto L15c;
                case 74: goto L15c;
                case 75: goto L15c;
                default: goto L178;
            }
        L144:
            r0 = r6
            r1 = r5
            r2 = 16
            int r1 = r1 >>> r2
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L180
        L150:
            r0 = r6
            r1 = r5
            r2 = 24
            int r1 = r1 >>> r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L180
        L15c:
            r0 = r6
            r1 = r5
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            goto L180
        L165:
            r0 = r6
            r1 = r5
            r2 = 24
            int r1 = r1 >>> r2
            r2 = r5
            r3 = 16776960(0xffff00, float:2.3509528E-38)
            r2 = r2 & r3
            r3 = 8
            int r2 = r2 >> r3
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            goto L180
        L178:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L180:
            return
    }
}
