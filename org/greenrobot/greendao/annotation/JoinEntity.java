package org.greenrobot.greendao.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface JoinEntity {
    java.lang.Class<?> entity();

    java.lang.String sourceProperty();

    java.lang.String targetProperty();
}
