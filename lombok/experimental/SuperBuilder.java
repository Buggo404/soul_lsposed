package lombok.experimental;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface SuperBuilder {
    java.lang.String buildMethodName() default "build";

    java.lang.String builderMethodName() default "builder";

    java.lang.String setterPrefix() default "";

    boolean toBuilder() default false;
}
