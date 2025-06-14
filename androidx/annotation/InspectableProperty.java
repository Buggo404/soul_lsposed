package androidx.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface InspectableProperty {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface EnumEntry {
        java.lang.String name();

        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FlagEntry {
        int mask() default 0;

        java.lang.String name();

        int target();
    }

    public enum ValueType extends java.lang.Enum<androidx.annotation.InspectableProperty.ValueType> {
        private static final /* synthetic */ androidx.annotation.InspectableProperty.ValueType[] $VALUES = null;
        public static final androidx.annotation.InspectableProperty.ValueType COLOR = null;
        public static final androidx.annotation.InspectableProperty.ValueType GRAVITY = null;
        public static final androidx.annotation.InspectableProperty.ValueType INFERRED = null;
        public static final androidx.annotation.InspectableProperty.ValueType INT_ENUM = null;
        public static final androidx.annotation.InspectableProperty.ValueType INT_FLAG = null;
        public static final androidx.annotation.InspectableProperty.ValueType NONE = null;
        public static final androidx.annotation.InspectableProperty.ValueType RESOURCE_ID = null;

        static {
                androidx.annotation.InspectableProperty$ValueType r0 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.annotation.InspectableProperty.ValueType.NONE = r0
                androidx.annotation.InspectableProperty$ValueType r1 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r3 = "INFERRED"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.annotation.InspectableProperty.ValueType.INFERRED = r1
                androidx.annotation.InspectableProperty$ValueType r3 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r5 = "INT_ENUM"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.annotation.InspectableProperty.ValueType.INT_ENUM = r3
                androidx.annotation.InspectableProperty$ValueType r5 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r7 = "INT_FLAG"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.annotation.InspectableProperty.ValueType.INT_FLAG = r5
                androidx.annotation.InspectableProperty$ValueType r7 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r9 = "COLOR"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.annotation.InspectableProperty.ValueType.COLOR = r7
                androidx.annotation.InspectableProperty$ValueType r9 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r11 = "GRAVITY"
                r12 = 5
                r9.<init>(r11, r12)
                androidx.annotation.InspectableProperty.ValueType.GRAVITY = r9
                androidx.annotation.InspectableProperty$ValueType r11 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r13 = "RESOURCE_ID"
                r14 = 6
                r11.<init>(r13, r14)
                androidx.annotation.InspectableProperty.ValueType.RESOURCE_ID = r11
                r13 = 7
                androidx.annotation.InspectableProperty$ValueType[] r13 = new androidx.annotation.InspectableProperty.ValueType[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                androidx.annotation.InspectableProperty.ValueType.$VALUES = r13
                return
        }

        ValueType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.annotation.InspectableProperty.ValueType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.annotation.InspectableProperty$ValueType> r0 = androidx.annotation.InspectableProperty.ValueType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.annotation.InspectableProperty$ValueType r1 = (androidx.annotation.InspectableProperty.ValueType) r1
                return r1
        }

        public static androidx.annotation.InspectableProperty.ValueType[] values() {
                androidx.annotation.InspectableProperty$ValueType[] r0 = androidx.annotation.InspectableProperty.ValueType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.annotation.InspectableProperty$ValueType[] r0 = (androidx.annotation.InspectableProperty.ValueType[]) r0
                return r0
        }
    }

    int attributeId() default 0;

    androidx.annotation.InspectableProperty.EnumEntry[] enumMapping() default {};

    androidx.annotation.InspectableProperty.FlagEntry[] flagMapping() default {};

    boolean hasAttributeId() default true;

    java.lang.String name() default "";

    androidx.annotation.InspectableProperty.ValueType valueType() default androidx.annotation.InspectableProperty.ValueType.INFERRED;
}
