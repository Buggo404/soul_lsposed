package com.xuexiang.xhttp2.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface ThreadType {
    public static final java.lang.String IN_THREAD = "executeInThread";
    public static final java.lang.String TO_IO = "executeToIO";
    public static final java.lang.String TO_MAIN = "executeToMain";
}
