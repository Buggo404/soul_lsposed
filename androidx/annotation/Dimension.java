package androidx.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface Dimension {

    /* renamed from: DP */
    public static final int f0DP = 0;

    /* renamed from: PX */
    public static final int f1PX = 1;

    /* renamed from: SP */
    public static final int f2SP = 2;

    int unit() default 1;
}
