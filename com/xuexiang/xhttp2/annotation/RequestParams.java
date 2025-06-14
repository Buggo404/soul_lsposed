package com.xuexiang.xhttp2.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface RequestParams {
    boolean accessToken() default true;

    java.lang.String baseUrl() default "";

    com.xuexiang.xhttp2.cache.model.CacheMode cacheMode() default com.xuexiang.xhttp2.cache.model.CacheMode.NO_CACHE;

    long cacheTime() default -2;

    boolean keepJson() default false;

    long timeout() default 15000;

    java.lang.String url() default "";
}
