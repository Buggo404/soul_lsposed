package com.zwitserloot.cmdreader;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Documented
/* loaded from: com.usidqw.qwerklj.apk:com/zwitserloot/cmdreader/Mandatory.SCL.lombok */
public @interface Mandatory {
    java.lang.String[] onlyIf() default {};

    java.lang.String[] onlyIfNot() default {};
}
