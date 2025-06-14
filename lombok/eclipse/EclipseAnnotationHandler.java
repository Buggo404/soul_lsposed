package lombok.eclipse;

import java.lang.annotation.Annotation;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/EclipseAnnotationHandler.SCL.lombok */
public abstract class EclipseAnnotationHandler<T extends java.lang.annotation.Annotation> {
    public EclipseAnnotationHandler() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public abstract void handle(lombok.core.AnnotationValues<T> r1, org.eclipse.jdt.internal.compiler.ast.Annotation r2, lombok.eclipse.EclipseNode r3);

    public void preHandle(lombok.core.AnnotationValues<T> r2, org.eclipse.jdt.internal.compiler.ast.Annotation r3, lombok.eclipse.EclipseNode r4) {
            r1 = this;
            return
    }

    public java.lang.Class<T> getAnnotationHandledByThisHandler() {
            r3 = this;
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<lombok.eclipse.EclipseAnnotationHandler> r1 = lombok.eclipse.EclipseAnnotationHandler.class
            java.lang.Class r0 = lombok.core.SpiLoadUtil.findAnnotationClass(r0, r1)
            return r0
    }
}
