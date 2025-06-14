package com.xuexiang.xhttp2.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface NetMethod {
    public static final int ALL_PARAMS_INDEX = -1;
    public static final java.lang.String DELETE = "delete";
    public static final int FORM_BODY = 2;
    public static final java.lang.String GET = "get";
    public static final int JSON = 1;
    public static final int JSON_OBJECT = 4;
    public static final long NOT_SET_CACHE_TIME = -2;
    public static final java.lang.String POST = "post";
    public static final java.lang.String PUT = "put";
    public static final int URL_GET = 3;

    boolean accessToken() default true;

    java.lang.String action() default "post";

    java.lang.String baseUrl() default "";

    int cacheKeyIndex() default -1;

    com.xuexiang.xhttp2.cache.model.CacheMode cacheMode() default com.xuexiang.xhttp2.cache.model.CacheMode.NO_CACHE;

    long cacheTime() default -2;

    boolean keepJson() default false;

    int paramType() default 1;

    java.lang.String[] parameterNames() default {};

    long timeout() default 15000;

    java.lang.String url() default "";
}
