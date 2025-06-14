package lombok;

@java.lang.annotation.Target({java.lang.annotation.ElementType.LOCAL_VARIABLE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface Cleanup {
    java.lang.String value() default "close";
}
