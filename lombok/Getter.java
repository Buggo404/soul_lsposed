package lombok;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface Getter {

    @java.lang.annotation.Target({})
    @java.lang.Deprecated
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AnyAnnotation {
    }

    boolean lazy() default false;

    lombok.Getter.AnyAnnotation[] onMethod() default {};

    lombok.AccessLevel value() default lombok.AccessLevel.PUBLIC;
}
