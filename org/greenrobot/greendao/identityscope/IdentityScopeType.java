package org.greenrobot.greendao.identityscope;

/* loaded from: classes.dex */
public enum IdentityScopeType extends java.lang.Enum<org.greenrobot.greendao.identityscope.IdentityScopeType> {
    private static final /* synthetic */ org.greenrobot.greendao.identityscope.IdentityScopeType[] $VALUES = null;
    public static final org.greenrobot.greendao.identityscope.IdentityScopeType None = null;
    public static final org.greenrobot.greendao.identityscope.IdentityScopeType Session = null;

    static {
            org.greenrobot.greendao.identityscope.IdentityScopeType r0 = new org.greenrobot.greendao.identityscope.IdentityScopeType
            java.lang.String r1 = "Session"
            r2 = 0
            r0.<init>(r1, r2)
            org.greenrobot.greendao.identityscope.IdentityScopeType.Session = r0
            org.greenrobot.greendao.identityscope.IdentityScopeType r1 = new org.greenrobot.greendao.identityscope.IdentityScopeType
            java.lang.String r3 = "None"
            r4 = 1
            r1.<init>(r3, r4)
            org.greenrobot.greendao.identityscope.IdentityScopeType.None = r1
            r3 = 2
            org.greenrobot.greendao.identityscope.IdentityScopeType[] r3 = new org.greenrobot.greendao.identityscope.IdentityScopeType[r3]
            r3[r2] = r0
            r3[r4] = r1
            org.greenrobot.greendao.identityscope.IdentityScopeType.$VALUES = r3
            return
    }

    IdentityScopeType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.greenrobot.greendao.identityscope.IdentityScopeType valueOf(java.lang.String r1) {
            java.lang.Class<org.greenrobot.greendao.identityscope.IdentityScopeType> r0 = org.greenrobot.greendao.identityscope.IdentityScopeType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.greenrobot.greendao.identityscope.IdentityScopeType r1 = (org.greenrobot.greendao.identityscope.IdentityScopeType) r1
            return r1
    }

    public static org.greenrobot.greendao.identityscope.IdentityScopeType[] values() {
            org.greenrobot.greendao.identityscope.IdentityScopeType[] r0 = org.greenrobot.greendao.identityscope.IdentityScopeType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.greenrobot.greendao.identityscope.IdentityScopeType[] r0 = (org.greenrobot.greendao.identityscope.IdentityScopeType[]) r0
            return r0
    }
}
