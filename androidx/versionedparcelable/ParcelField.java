package androidx.versionedparcelable;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface ParcelField {
    java.lang.String defaultValue() default "";

    int value();
}
