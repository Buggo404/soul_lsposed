package lombok.experimental;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface Accessors {
    boolean chain() default false;

    boolean fluent() default false;

    boolean makeFinal() default false;

    java.lang.String[] prefix() default {};
}
