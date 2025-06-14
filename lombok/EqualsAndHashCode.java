package lombok;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface EqualsAndHashCode {

    @java.lang.annotation.Target({})
    @java.lang.Deprecated
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AnyAnnotation {
    }

    public enum CacheStrategy extends java.lang.Enum<lombok.EqualsAndHashCode.CacheStrategy> {
        private static final /* synthetic */ lombok.EqualsAndHashCode.CacheStrategy[] ENUM$VALUES = null;
        public static final lombok.EqualsAndHashCode.CacheStrategy LAZY = null;
        public static final lombok.EqualsAndHashCode.CacheStrategy NEVER = null;

        static {
                lombok.EqualsAndHashCode$CacheStrategy r0 = new lombok.EqualsAndHashCode$CacheStrategy
                java.lang.String r1 = "NEVER"
                r2 = 0
                r0.<init>(r1, r2)
                lombok.EqualsAndHashCode.CacheStrategy.NEVER = r0
                lombok.EqualsAndHashCode$CacheStrategy r1 = new lombok.EqualsAndHashCode$CacheStrategy
                java.lang.String r3 = "LAZY"
                r4 = 1
                r1.<init>(r3, r4)
                lombok.EqualsAndHashCode.CacheStrategy.LAZY = r1
                r3 = 2
                lombok.EqualsAndHashCode$CacheStrategy[] r3 = new lombok.EqualsAndHashCode.CacheStrategy[r3]
                r3[r2] = r0
                r3[r4] = r1
                lombok.EqualsAndHashCode.CacheStrategy.ENUM$VALUES = r3
                return
        }

        CacheStrategy(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static lombok.EqualsAndHashCode.CacheStrategy valueOf(java.lang.String r1) {
                java.lang.Class<lombok.EqualsAndHashCode$CacheStrategy> r0 = lombok.EqualsAndHashCode.CacheStrategy.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                lombok.EqualsAndHashCode$CacheStrategy r1 = (lombok.EqualsAndHashCode.CacheStrategy) r1
                return r1
        }

        public static lombok.EqualsAndHashCode.CacheStrategy[] values() {
                lombok.EqualsAndHashCode$CacheStrategy[] r0 = lombok.EqualsAndHashCode.CacheStrategy.ENUM$VALUES
                int r1 = r0.length
                lombok.EqualsAndHashCode$CacheStrategy[] r2 = new lombok.EqualsAndHashCode.CacheStrategy[r1]
                r3 = 0
                java.lang.System.arraycopy(r0, r3, r2, r3, r1)
                return r2
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Exclude {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Include {
        int rank() default 0;

        java.lang.String replaces() default "";
    }

    lombok.EqualsAndHashCode.CacheStrategy cacheStrategy() default lombok.EqualsAndHashCode.CacheStrategy.NEVER;

    boolean callSuper() default false;

    boolean doNotUseGetters() default false;

    java.lang.String[] exclude() default {};

    /* renamed from: of */
    java.lang.String[] m55of() default {};

    lombok.EqualsAndHashCode.AnyAnnotation[] onParam() default {};

    boolean onlyExplicitlyIncluded() default false;
}
