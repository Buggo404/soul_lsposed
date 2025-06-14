package lombok.core.debug;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/debug/DebugSnapshot.SCL.lombok */
public class DebugSnapshot implements java.lang.Comparable<lombok.core.debug.DebugSnapshot> {
    private static java.util.concurrent.atomic.AtomicLong counter;
    private final long when;

    /* renamed from: id */
    private final long f571id;
    private final long bits;
    private final java.util.List<java.lang.StackTraceElement> trace;
    private final java.lang.String threadName;
    private final java.lang.String message;
    private final java.lang.Object[] params;
    private final java.lang.ref.WeakReference<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration> owner;

    static {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = r0
            r1.<init>()
            lombok.core.debug.DebugSnapshot.counter = r0
            return
    }

    public DebugSnapshot(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r8, int r9, java.lang.String r10, java.lang.Object... r11) {
            r7 = this;
            r0 = r7
            r0.<init>()
            r0 = r7
            java.util.concurrent.atomic.AtomicLong r1 = lombok.core.debug.DebugSnapshot.counter
            long r1 = r1.getAndIncrement()
            r0.f571id = r1
            r0 = r7
            long r1 = java.lang.System.currentTimeMillis()
            r0.when = r1
            r0 = r7
            r1 = r8
            int r1 = r1.bits
            long r1 = (long) r1
            r0.bits = r1
            r0 = r9
            if (r0 >= 0) goto L2a
            r0 = r7
            r1 = 0
            r0.trace = r1
            goto L6e
        L2a:
            java.lang.Throwable r0 = new java.lang.Throwable
            r1 = r0
            r1.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r12 = r0
            r0 = r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = 0
            r4 = r12
            int r4 = r4.length
            r5 = r9
            int r4 = r4 - r5
            r5 = 1
            int r4 = r4 - r5
            int r3 = java.lang.Math.max(r3, r4)
            r2.<init>(r3)
            r0.trace = r1
            r0 = 1
            r1 = r9
            int r0 = r0 + r1
            r13 = r0
            goto L66
        L54:
            r0 = r7
            java.util.List<java.lang.StackTraceElement> r0 = r0.trace
            r1 = r12
            r2 = r13
            r1 = r1[r2]
            boolean r0 = r0.add(r1)
            int r13 = r13 + 1
        L66:
            r0 = r13
            r1 = r12
            int r1 = r1.length
            if (r0 < r1) goto L54
        L6e:
            r0 = r7
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.threadName = r1
            r0 = r7
            r1 = r10
            r0.message = r1
            r0 = r7
            r1 = r11
            if (r1 != 0) goto L8a
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            goto L8c
        L8a:
            r1 = r11
        L8c:
            r0.params = r1
            r0 = r7
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.owner = r1
            return
    }

    private java.lang.String ownerName() {
            r4 = this;
            r0 = r4
            java.lang.ref.WeakReference<org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration> r0 = r0.owner
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L12
            java.lang.String r0 = "--GCed--"
            return r0
        L12:
            r0 = r5
            char[] r0 = r0.getMainTypeName()
            r6 = r0
            r0 = r5
            char[] r0 = r0.getFileName()
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L25
            r0 = r6
            int r0 = r0.length
            if (r0 != 0) goto L3c
        L25:
            r0 = r7
            if (r0 == 0) goto L2e
            r0 = r7
            int r0 = r0.length
            if (r0 != 0) goto L33
        L2e:
            java.lang.String r0 = "--UNKNOWN--"
            goto L3b
        L33:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r7
            r1.<init>(r2)
        L3b:
            return r0
        L3c:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            return r0
    }

    public java.lang.String shortToString() {
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = r13
            java.lang.String r1 = "WHEN: %14d THREAD: %s AST: %s HAMB: %b -- "
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r12
            long r5 = r5.when
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r12
            java.lang.String r5 = r5.threadName
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r12
            java.lang.String r5 = r5.ownerName()
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 0
            r6 = r12
            long r6 = r6.bits
            r7 = 16
            long r6 = r6 & r7
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 == 0) goto L3a
            r5 = 1
            goto L3b
        L3a:
            r5 = 0
        L3b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            java.lang.String r0 = r0.message
            if (r0 == 0) goto L62
            r0 = r13
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r12
            java.lang.String r1 = r1.message
            r2 = r12
            java.lang.Object[] r2 = r2.params
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
        L62:
            r0 = r13
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.shortToString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            java.util.List<java.lang.StackTraceElement> r0 = r0.trace
            if (r0 != 0) goto L27
            r0 = r4
            java.lang.String r1 = "    Stack Omitted"
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L5a
        L27:
            r0 = r3
            java.util.List<java.lang.StackTraceElement> r0 = r0.trace
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L51
        L34:
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.StackTraceElement r0 = (java.lang.StackTraceElement) r0
            r5 = r0
            r0 = r4
            java.lang.String r1 = "    "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
        L51:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L34
        L5a:
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(lombok.core.debug.DebugSnapshot r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.f571id
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = r5
            long r1 = r1.f571id
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            int r0 = r0.compareTo(r1)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(lombok.core.debug.DebugSnapshot r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            lombok.core.debug.DebugSnapshot r1 = (lombok.core.debug.DebugSnapshot) r1
            int r0 = r0.compareTo2(r1)
            return r0
    }
}
