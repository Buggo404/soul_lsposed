package lombok.experimental;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface FieldDefaults {
    lombok.AccessLevel level() default lombok.AccessLevel.NONE;

    boolean makeFinal() default false;
}
