package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/Augments.SCL.lombok */
public final class Augments {
    public static final lombok.core.FieldAugment<java.lang.ClassLoader, java.lang.Boolean> ClassLoader_lombokAlreadyAddedTo = null;

    static {
            java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.String r2 = "lombok$alreadyAddedTo"
            lombok.core.FieldAugment r0 = lombok.core.FieldAugment.augment(r0, r1, r2)
            lombok.core.Augments.ClassLoader_lombokAlreadyAddedTo = r0
            return
    }

    private Augments() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }
}
