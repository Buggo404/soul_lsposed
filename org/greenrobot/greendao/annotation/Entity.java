package org.greenrobot.greendao.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface Entity {
    boolean active() default false;

    boolean createInDb() default true;

    boolean generateConstructors() default true;

    boolean generateGettersSetters() default true;

    org.greenrobot.greendao.annotation.Index[] indexes() default {};

    java.lang.String nameInDb() default "";

    java.lang.Class protobuf() default void.class;

    java.lang.String schema() default "default";
}
