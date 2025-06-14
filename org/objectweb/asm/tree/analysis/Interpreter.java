package org.objectweb.asm.tree.analysis;

import org.objectweb.asm.tree.analysis.Value;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/analysis/Interpreter.SCL.lombok */
public abstract class Interpreter<V extends org.objectweb.asm.tree.analysis.Value> {
    protected final int api;

    protected Interpreter(int r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.api = r1
            return
    }

    public abstract V newValue(org.objectweb.asm.Type r1);

    public V newParameterValue(boolean r4, int r5, org.objectweb.asm.Type r6) {
            r3 = this;
            r0 = r3
            r1 = r6
            org.objectweb.asm.tree.analysis.Value r0 = r0.newValue(r1)
            return r0
    }

    public V newReturnTypeValue(org.objectweb.asm.Type r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.objectweb.asm.tree.analysis.Value r0 = r0.newValue(r1)
            return r0
    }

    public V newEmptyValue(int r4) {
            r3 = this;
            r0 = r3
            r1 = 0
            org.objectweb.asm.tree.analysis.Value r0 = r0.newValue(r1)
            return r0
    }

    public V newExceptionValue(org.objectweb.asm.tree.TryCatchBlockNode r4, org.objectweb.asm.tree.analysis.Frame<V> r5, org.objectweb.asm.Type r6) {
            r3 = this;
            r0 = r3
            r1 = r6
            org.objectweb.asm.tree.analysis.Value r0 = r0.newValue(r1)
            return r0
    }

    public abstract V newOperation(org.objectweb.asm.tree.AbstractInsnNode r1) throws org.objectweb.asm.tree.analysis.AnalyzerException;

    public abstract V copyOperation(org.objectweb.asm.tree.AbstractInsnNode r1, V r2) throws org.objectweb.asm.tree.analysis.AnalyzerException;

    public abstract V unaryOperation(org.objectweb.asm.tree.AbstractInsnNode r1, V r2) throws org.objectweb.asm.tree.analysis.AnalyzerException;

    public abstract V binaryOperation(org.objectweb.asm.tree.AbstractInsnNode r1, V r2, V r3) throws org.objectweb.asm.tree.analysis.AnalyzerException;

    public abstract V ternaryOperation(org.objectweb.asm.tree.AbstractInsnNode r1, V r2, V r3, V r4) throws org.objectweb.asm.tree.analysis.AnalyzerException;

    public abstract V naryOperation(org.objectweb.asm.tree.AbstractInsnNode r1, java.util.List<? extends V> r2) throws org.objectweb.asm.tree.analysis.AnalyzerException;

    public abstract void returnOperation(org.objectweb.asm.tree.AbstractInsnNode r1, V r2, V r3) throws org.objectweb.asm.tree.analysis.AnalyzerException;

    public abstract V merge(V r1, V r2);
}
