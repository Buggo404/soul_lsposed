package lombok.javac;

import java.lang.annotation.Annotation;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacAnnotationHandler.SCL.lombok */
public abstract class JavacAnnotationHandler<T extends java.lang.annotation.Annotation> {
    protected com.sun.source.util.Trees trees;

    public JavacAnnotationHandler() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public abstract void handle(lombok.core.AnnotationValues<T> r1, com.sun.tools.javac.tree.JCTree.JCAnnotation r2, lombok.javac.JavacNode r3);

    public java.lang.Class<T> getAnnotationHandledByThisHandler() {
            r3 = this;
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<lombok.javac.JavacAnnotationHandler> r1 = lombok.javac.JavacAnnotationHandler.class
            java.lang.Class r0 = lombok.core.SpiLoadUtil.findAnnotationClass(r0, r1)
            return r0
    }

    public void setTrees(com.sun.source.util.Trees r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.trees = r1
            return
    }
}
