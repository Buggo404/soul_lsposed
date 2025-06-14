package lombok.core;

@java.lang.annotation.Target({java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: com.usidqw.qwerklj.apk:lombok/core/PrintAST.SCL.lombok */
public @interface PrintAST {
    java.lang.String outfile() default "";

    boolean printContent() default false;

    boolean printPositions() default false;
}
