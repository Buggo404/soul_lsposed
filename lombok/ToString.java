package lombok;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface ToString {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Exclude {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Include {
        java.lang.String name() default "";

        int rank() default 0;
    }

    boolean callSuper() default false;

    boolean doNotUseGetters() default false;

    java.lang.String[] exclude() default {};

    boolean includeFieldNames() default true;

    /* renamed from: of */
    java.lang.String[] m56of() default {};

    boolean onlyExplicitlyIncluded() default false;
}
