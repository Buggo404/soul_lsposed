package lombok;

/* loaded from: classes.dex */
public enum AccessLevel extends java.lang.Enum<lombok.AccessLevel> {
    private static final /* synthetic */ lombok.AccessLevel[] ENUM$VALUES = null;
    public static final lombok.AccessLevel MODULE = null;
    public static final lombok.AccessLevel NONE = null;
    public static final lombok.AccessLevel PACKAGE = null;
    public static final lombok.AccessLevel PRIVATE = null;
    public static final lombok.AccessLevel PROTECTED = null;
    public static final lombok.AccessLevel PUBLIC = null;

    static {
            lombok.AccessLevel r0 = new lombok.AccessLevel
            java.lang.String r1 = "PUBLIC"
            r2 = 0
            r0.<init>(r1, r2)
            lombok.AccessLevel.PUBLIC = r0
            lombok.AccessLevel r1 = new lombok.AccessLevel
            java.lang.String r3 = "MODULE"
            r4 = 1
            r1.<init>(r3, r4)
            lombok.AccessLevel.MODULE = r1
            lombok.AccessLevel r3 = new lombok.AccessLevel
            java.lang.String r5 = "PROTECTED"
            r6 = 2
            r3.<init>(r5, r6)
            lombok.AccessLevel.PROTECTED = r3
            lombok.AccessLevel r5 = new lombok.AccessLevel
            java.lang.String r7 = "PACKAGE"
            r8 = 3
            r5.<init>(r7, r8)
            lombok.AccessLevel.PACKAGE = r5
            lombok.AccessLevel r7 = new lombok.AccessLevel
            java.lang.String r9 = "PRIVATE"
            r10 = 4
            r7.<init>(r9, r10)
            lombok.AccessLevel.PRIVATE = r7
            lombok.AccessLevel r9 = new lombok.AccessLevel
            java.lang.String r11 = "NONE"
            r12 = 5
            r9.<init>(r11, r12)
            lombok.AccessLevel.NONE = r9
            r11 = 6
            lombok.AccessLevel[] r11 = new lombok.AccessLevel[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            lombok.AccessLevel.ENUM$VALUES = r11
            return
    }

    AccessLevel(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static lombok.AccessLevel valueOf(java.lang.String r1) {
            java.lang.Class<lombok.AccessLevel> r0 = lombok.AccessLevel.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            lombok.AccessLevel r1 = (lombok.AccessLevel) r1
            return r1
    }

    public static lombok.AccessLevel[] values() {
            lombok.AccessLevel[] r0 = lombok.AccessLevel.ENUM$VALUES
            int r1 = r0.length
            lombok.AccessLevel[] r2 = new lombok.AccessLevel[r1]
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r2, r3, r1)
            return r2
    }
}
