package io.reactivex.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface SchedulerSupport {
    public static final java.lang.String COMPUTATION = "io.reactivex:computation";
    public static final java.lang.String CUSTOM = "custom";

    /* renamed from: IO */
    public static final java.lang.String f166IO = "io.reactivex:io";
    public static final java.lang.String NEW_THREAD = "io.reactivex:new-thread";
    public static final java.lang.String NONE = "none";
    public static final java.lang.String SINGLE = "io.reactivex:single";
    public static final java.lang.String TRAMPOLINE = "io.reactivex:trampoline";

    java.lang.String value();
}
