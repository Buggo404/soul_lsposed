package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/Context.SCL.lombok */
final class Context {
    org.objectweb.asm.Attribute[] attributePrototypes;
    int parsingOptions;
    char[] charBuffer;
    int currentMethodAccessFlags;
    java.lang.String currentMethodName;
    java.lang.String currentMethodDescriptor;
    org.objectweb.asm.Label[] currentMethodLabels;
    int currentTypeAnnotationTarget;
    org.objectweb.asm.TypePath currentTypeAnnotationTargetPath;
    org.objectweb.asm.Label[] currentLocalVariableAnnotationRangeStarts;
    org.objectweb.asm.Label[] currentLocalVariableAnnotationRangeEnds;
    int[] currentLocalVariableAnnotationRangeIndices;
    int currentFrameOffset;
    int currentFrameType;
    int currentFrameLocalCount;
    int currentFrameLocalCountDelta;
    java.lang.Object[] currentFrameLocalTypes;
    int currentFrameStackCount;
    java.lang.Object[] currentFrameStackTypes;

    Context() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }
}
