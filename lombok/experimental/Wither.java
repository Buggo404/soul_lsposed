package lombok.experimental;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface Wither {

    @java.lang.annotation.Target({})
    @java.lang.Deprecated
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AnyAnnotation {
    }

    lombok.experimental.Wither.AnyAnnotation[] onMethod() default {};

    lombok.experimental.Wither.AnyAnnotation[] onParam() default {};

    lombok.AccessLevel value() default lombok.AccessLevel.PUBLIC;
}
