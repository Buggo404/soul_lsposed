package lombok;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface Builder {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Default {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ObtainVia {
        java.lang.String field() default "";

        boolean isStatic() default false;

        java.lang.String method() default "";
    }

    lombok.AccessLevel access() default lombok.AccessLevel.PUBLIC;

    java.lang.String buildMethodName() default "build";

    java.lang.String builderClassName() default "";

    java.lang.String builderMethodName() default "builder";

    java.lang.String setterPrefix() default "";

    boolean toBuilder() default false;
}
