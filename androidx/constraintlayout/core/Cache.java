package androidx.constraintlayout.core;

/* loaded from: classes.dex */
public class Cache {
    androidx.constraintlayout.core.Pools.Pool<androidx.constraintlayout.core.ArrayRow> arrayRowPool;
    androidx.constraintlayout.core.SolverVariable[] mIndexedVariables;
    androidx.constraintlayout.core.Pools.Pool<androidx.constraintlayout.core.ArrayRow> optimizedArrayRowPool;
    androidx.constraintlayout.core.Pools.Pool<androidx.constraintlayout.core.SolverVariable> solverVariablePool;

    public Cache() {
            r2 = this;
            r2.<init>()
            androidx.constraintlayout.core.Pools$SimplePool r0 = new androidx.constraintlayout.core.Pools$SimplePool
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            r2.optimizedArrayRowPool = r0
            androidx.constraintlayout.core.Pools$SimplePool r0 = new androidx.constraintlayout.core.Pools$SimplePool
            r0.<init>(r1)
            r2.arrayRowPool = r0
            androidx.constraintlayout.core.Pools$SimplePool r0 = new androidx.constraintlayout.core.Pools$SimplePool
            r0.<init>(r1)
            r2.solverVariablePool = r0
            r0 = 32
            androidx.constraintlayout.core.SolverVariable[] r0 = new androidx.constraintlayout.core.SolverVariable[r0]
            r2.mIndexedVariables = r0
            return
    }
}
