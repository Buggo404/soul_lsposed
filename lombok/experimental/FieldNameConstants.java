package lombok.experimental;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface FieldNameConstants {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Exclude {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Include {
    }

    boolean asEnum() default false;

    java.lang.String innerTypeName() default "";

    lombok.AccessLevel level() default lombok.AccessLevel.PUBLIC;

    boolean onlyExplicitlyIncluded() default false;
}
