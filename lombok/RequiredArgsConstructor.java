package lombok;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface RequiredArgsConstructor {

    @java.lang.annotation.Target({})
    @java.lang.Deprecated
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AnyAnnotation {
    }

    lombok.AccessLevel access() default lombok.AccessLevel.PUBLIC;

    lombok.RequiredArgsConstructor.AnyAnnotation[] onConstructor() default {};

    java.lang.String staticName() default "";
}
