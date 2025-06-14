package org.greenrobot.greendao.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface Convert {
    java.lang.Class columnType();

    java.lang.Class<? extends org.greenrobot.greendao.converter.PropertyConverter> converter();
}
