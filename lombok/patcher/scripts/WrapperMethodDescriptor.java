package lombok.patcher.scripts;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/WrapperMethodDescriptor.SCL.lombok */
public class WrapperMethodDescriptor {
    private final int count;
    private final int opcode;
    private final java.lang.String owner;
    private final java.lang.String name;
    private final java.lang.String wrapperDescriptor;
    private final java.lang.String targetDescriptor;
    private final boolean itf;

    public WrapperMethodDescriptor(int r4, int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.count = r1
            r0 = r3
            r1 = r5
            r0.opcode = r1
            r0 = r3
            r1 = r6
            r0.owner = r1
            r0 = r3
            r1 = r7
            r0.name = r1
            r0 = r3
            r1 = r8
            r0.wrapperDescriptor = r1
            r0 = r3
            r1 = r9
            r0.targetDescriptor = r1
            r0 = r3
            r1 = r10
            r0.itf = r1
            return
    }

    public int getCount() {
            r2 = this;
            r0 = r2
            int r0 = r0.count
            return r0
    }

    public int getOpcode() {
            r2 = this;
            r0 = r2
            int r0 = r0.opcode
            return r0
    }

    public java.lang.String getOwner() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.owner
            return r0
    }

    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.name
            return r0
    }

    public java.lang.String getWrapperDescriptor() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.wrapperDescriptor
            return r0
    }

    public java.lang.String getTargetDescriptor() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.targetDescriptor
            return r0
    }

    public boolean isItf() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.itf
            return r0
    }

    public java.lang.String getWrapperName() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "$lombok$$wrapper$"
            r1.<init>(r2)
            r1 = r4
            int r1 = r1.count
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "$"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.name
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            int r1 = r1.count
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            boolean r1 = r1.itf
            if (r1 == 0) goto L1d
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L20
        L1d:
            r1 = 1237(0x4d5, float:1.733E-42)
        L20:
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            java.lang.String r1 = r1.name
            if (r1 != 0) goto L31
            r1 = 0
            goto L38
        L31:
            r1 = r3
            java.lang.String r1 = r1.name
            int r1 = r1.hashCode()
        L38:
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            int r1 = r1.opcode
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            java.lang.String r1 = r1.owner
            if (r1 != 0) goto L53
            r1 = 0
            goto L5a
        L53:
            r1 = r3
            java.lang.String r1 = r1.owner
            int r1 = r1.hashCode()
        L5a:
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            java.lang.String r1 = r1.targetDescriptor
            if (r1 != 0) goto L6b
            r1 = 0
            goto L72
        L6b:
            r1 = r3
            java.lang.String r1 = r1.targetDescriptor
            int r1 = r1.hashCode()
        L72:
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            java.lang.String r1 = r1.wrapperDescriptor
            if (r1 != 0) goto L83
            r1 = 0
            goto L8a
        L83:
            r1 = r3
            java.lang.String r1 = r1.wrapperDescriptor
            int r1 = r1.hashCode()
        L8a:
            int r0 = r0 + r1
            r4 = r0
            r0 = r4
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = r4
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            r1 = r4
            java.lang.Class r1 = r1.getClass()
            if (r0 == r1) goto L1a
            r0 = 0
            return r0
        L1a:
            r0 = r4
            lombok.patcher.scripts.WrapperMethodDescriptor r0 = (lombok.patcher.scripts.WrapperMethodDescriptor) r0
            r5 = r0
            r0 = r3
            int r0 = r0.count
            r1 = r5
            int r1 = r1.count
            if (r0 == r1) goto L2c
            r0 = 0
            return r0
        L2c:
            r0 = r3
            boolean r0 = r0.itf
            r1 = r5
            boolean r1 = r1.itf
            if (r0 == r1) goto L39
            r0 = 0
            return r0
        L39:
            r0 = r3
            java.lang.String r0 = r0.name
            if (r0 != 0) goto L49
            r0 = r5
            java.lang.String r0 = r0.name
            if (r0 == 0) goto L59
            r0 = 0
            return r0
        L49:
            r0 = r3
            java.lang.String r0 = r0.name
            r1 = r5
            java.lang.String r1 = r1.name
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L59
            r0 = 0
            return r0
        L59:
            r0 = r3
            int r0 = r0.opcode
            r1 = r5
            int r1 = r1.opcode
            if (r0 == r1) goto L66
            r0 = 0
            return r0
        L66:
            r0 = r3
            java.lang.String r0 = r0.owner
            if (r0 != 0) goto L76
            r0 = r5
            java.lang.String r0 = r0.owner
            if (r0 == 0) goto L86
            r0 = 0
            return r0
        L76:
            r0 = r3
            java.lang.String r0 = r0.owner
            r1 = r5
            java.lang.String r1 = r1.owner
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L86
            r0 = 0
            return r0
        L86:
            r0 = r3
            java.lang.String r0 = r0.targetDescriptor
            if (r0 != 0) goto L96
            r0 = r5
            java.lang.String r0 = r0.targetDescriptor
            if (r0 == 0) goto La6
            r0 = 0
            return r0
        L96:
            r0 = r3
            java.lang.String r0 = r0.targetDescriptor
            r1 = r5
            java.lang.String r1 = r1.targetDescriptor
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La6
            r0 = 0
            return r0
        La6:
            r0 = r3
            java.lang.String r0 = r0.wrapperDescriptor
            if (r0 != 0) goto Lb6
            r0 = r5
            java.lang.String r0 = r0.wrapperDescriptor
            if (r0 == 0) goto Lc6
            r0 = 0
            return r0
        Lb6:
            r0 = r3
            java.lang.String r0 = r0.wrapperDescriptor
            r1 = r5
            java.lang.String r1 = r1.wrapperDescriptor
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lc6
            r0 = 0
            return r0
        Lc6:
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "WrapperMethodDescriptor[count="
            r1.<init>(r2)
            r1 = r4
            int r1 = r1.count
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", opcode="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            int r1 = r1.opcode
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", owner="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.owner
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", name="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.name
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", wrapperDescriptor="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.wrapperDescriptor
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", targetDescriptor="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.targetDescriptor
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", itf="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            boolean r1 = r1.itf
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
