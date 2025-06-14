package org.greenrobot.greendao.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface Index {
    java.lang.String name() default "";

    boolean unique() default false;

    java.lang.String value() default "";
}
