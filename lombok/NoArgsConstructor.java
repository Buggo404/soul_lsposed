package lombok;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface NoArgsConstructor {

    @java.lang.annotation.Target({})
    @java.lang.Deprecated
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AnyAnnotation {
    }

    lombok.AccessLevel access() default lombok.AccessLevel.PUBLIC;

    boolean force() default false;

    lombok.NoArgsConstructor.AnyAnnotation[] onConstructor() default {};

    java.lang.String staticName() default "";
}
