package lombok.core.debug;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/debug/DebugSnapshotStore.SCL.lombok */
public class DebugSnapshotStore {
    public static final lombok.core.debug.DebugSnapshotStore INSTANCE = null;
    public static final boolean GLOBAL_DSS_DISABLE_SWITCH = true;
    private final java.util.Map<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration, java.util.List<lombok.core.debug.DebugSnapshot>> map;

    static {
            lombok.core.debug.DebugSnapshotStore r0 = new lombok.core.debug.DebugSnapshotStore
            r1 = r0
            r1.<init>()
            lombok.core.debug.DebugSnapshotStore.INSTANCE = r0
            return
    }

    public DebugSnapshotStore() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r2 = r1
            r2.<init>()
            r0.map = r1
            return
    }

    public void snapshot(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r8, java.lang.String r9, java.lang.Object... r10) {
            r7 = this;
            return
            lombok.core.debug.DebugSnapshot r0 = new lombok.core.debug.DebugSnapshot
            r1 = r0
            r2 = r8
            r3 = 1
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            r11 = r0
            r0 = r7
            java.util.Map<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration, java.util.List<lombok.core.debug.DebugSnapshot>> r0 = r0.map
            r1 = r0
            r13 = r1
            monitor-enter(r0)
            r0 = r7
            java.util.Map<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration, java.util.List<lombok.core.debug.DebugSnapshot>> r0 = r0.map     // Catch: java.lang.Throwable -> L67
            r1 = r8
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L67
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L67
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L4d
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L67
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L67
            r12 = r0
            r0 = r7
            java.util.Map<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration, java.util.List<lombok.core.debug.DebugSnapshot>> r0 = r0.map     // Catch: java.lang.Throwable -> L67
            r1 = r8
            r2 = r12
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L67
            r0 = r12
            r1 = r11
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L67
            goto L61
        L4d:
            r0 = r12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L61
            r0 = r12
            r1 = r11
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L67
        L61:
            r0 = r13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            goto L6b
        L67:
            r1 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L67
            throw r0     // Catch: java.lang.Throwable -> L67
        L6b:
            return
    }

    public void log(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r8, java.lang.String r9, java.lang.Object... r10) {
            r7 = this;
            return
            lombok.core.debug.DebugSnapshot r0 = new lombok.core.debug.DebugSnapshot
            r1 = r0
            r2 = r8
            r3 = -1
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            r11 = r0
            r0 = r7
            java.util.Map<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration, java.util.List<lombok.core.debug.DebugSnapshot>> r0 = r0.map
            r1 = r0
            r13 = r1
            monitor-enter(r0)
            r0 = r7
            java.util.Map<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration, java.util.List<lombok.core.debug.DebugSnapshot>> r0 = r0.map     // Catch: java.lang.Throwable -> L67
            r1 = r8
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L67
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L67
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L4d
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L67
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L67
            r12 = r0
            r0 = r7
            java.util.Map<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration, java.util.List<lombok.core.debug.DebugSnapshot>> r0 = r0.map     // Catch: java.lang.Throwable -> L67
            r1 = r8
            r2 = r12
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L67
            r0 = r12
            r1 = r11
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L67
            goto L61
        L4d:
            r0 = r12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L61
            r0 = r12
            r1 = r11
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L67
        L61:
            r0 = r13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            goto L6b
        L67:
            r1 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L67
            throw r0     // Catch: java.lang.Throwable -> L67
        L6b:
            return
    }

    public java.lang.String print(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r11, java.lang.String r12, java.lang.Object... r13) {
            r10 = this;
            r0 = 0
            return r0
            r0 = r10
            java.util.Map<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration, java.util.List<lombok.core.debug.DebugSnapshot>> r0 = r0.map
            r1 = r0
            r15 = r1
            monitor-enter(r0)
            r0 = r10
            r1 = r11
            r2 = r12
            if (r2 != 0) goto L15
            java.lang.String r2 = "Printing"
            goto L16
        L15:
            r2 = r12
        L16:
            r3 = r13
            r0.snapshot(r1, r2, r3)     // Catch: java.lang.Throwable -> L5f
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5f
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L5f
            r14 = r0
            r0 = r14
            r1 = r10
            java.util.Map<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration, java.util.List<lombok.core.debug.DebugSnapshot>> r1 = r1.map     // Catch: java.lang.Throwable -> L5f
            r2 = r11
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L5f
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r0.addAll(r1)     // Catch: java.lang.Throwable -> L5f
            r0 = r14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L47
            r0 = r15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            r0 = 0
            return r0
        L47:
            r0 = r10
            java.util.Map<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration, java.util.List<lombok.core.debug.DebugSnapshot>> r0 = r0.map     // Catch: java.lang.Throwable -> L5f
            r1 = r11
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L5f
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L5f
            r0.clear()     // Catch: java.lang.Throwable -> L5f
            r0 = r15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r1 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5f
            throw r0     // Catch: java.lang.Throwable -> L5f
        L63:
            r0 = r14
            java.util.Collections.sort(r0)
            r0 = 1
            r15 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r16
            java.lang.String r1 = "---------------------------\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r14
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
            goto Lb6
        L88:
            r0 = r18
            java.lang.Object r0 = r0.next()
            lombok.core.debug.DebugSnapshot r0 = (lombok.core.debug.DebugSnapshot) r0
            r17 = r0
            r0 = r16
            java.lang.String r1 = "%3d: %s\n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r15
            int r15 = r15 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r17
            java.lang.String r5 = r5.shortToString()
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
        Lb6:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L88
            r0 = r16
            java.lang.String r1 = "******\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 1
            r15 = r0
            r0 = r14
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
            goto L105
        Ld7:
            r0 = r18
            java.lang.Object r0 = r0.next()
            lombok.core.debug.DebugSnapshot r0 = (lombok.core.debug.DebugSnapshot) r0
            r17 = r0
            r0 = r16
            java.lang.String r1 = "%3d: %s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r15
            int r15 = r15 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r17
            java.lang.String r5 = r5.toString()
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
        L105:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Ld7
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L163
            r1 = r0
            java.lang.String r2 = "user.home"
            java.lang.String r3 = "."
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)     // Catch: java.lang.Exception -> L163
            java.lang.String r3 = "lombokdss-%d.err"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L163
            r5 = r4
            r6 = 0
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L163
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Exception -> L163
            r5[r6] = r7     // Catch: java.lang.Exception -> L163
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Exception -> L163
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L163
            r17 = r0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L163
            r1 = r0
            r2 = r17
            r1.<init>(r2)     // Catch: java.lang.Exception -> L163
            r18 = r0
            r0 = r18
            r1 = r16
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L163
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L163
            r0.write(r1)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L163
            goto L158
        L14e:
            r19 = move-exception
            r0 = r18
            r0.close()     // Catch: java.lang.Exception -> L163
            r0 = r19
            throw r0     // Catch: java.lang.Exception -> L163
        L158:
            r0 = r18
            r0.close()     // Catch: java.lang.Exception -> L163
            r0 = r17
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L163
            return r0
        L163:
            java.io.PrintStream r0 = java.lang.System.err
            r1 = r16
            r0.println(r1)
            java.lang.String r0 = "(can't write log file - emitted to system err)"
            return r0
    }
}
