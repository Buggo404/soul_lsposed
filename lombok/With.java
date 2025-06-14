package lombok;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface With {

    @java.lang.annotation.Target({})
    @java.lang.Deprecated
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AnyAnnotation {
    }

    lombok.With.AnyAnnotation[] onMethod() default {};

    lombok.With.AnyAnnotation[] onParam() default {};

    lombok.AccessLevel value() default lombok.AccessLevel.PUBLIC;
}
