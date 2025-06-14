package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/CleanupRegistry.SCL.lombok */
public class CleanupRegistry {
    private final java.util.concurrent.ConcurrentMap<lombok.core.CleanupRegistry.CleanupKey, lombok.core.CleanupTask> tasks;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/CleanupRegistry$CleanupKey.SCL.lombok */
    private static final class CleanupKey {
        private final java.lang.String key;
        private final java.lang.Object target;

        CleanupKey(java.lang.String r4, java.lang.Object r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.key = r1
                r0 = r3
                r1 = r5
                r0.target = r1
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = r4
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                r0 = r4
                r1 = r3
                if (r0 != r1) goto Ld
                r0 = 1
                return r0
            Ld:
                r0 = r4
                boolean r0 = r0 instanceof lombok.core.CleanupRegistry.CleanupKey
                if (r0 != 0) goto L16
                r0 = 0
                return r0
            L16:
                r0 = r4
                lombok.core.CleanupRegistry$CleanupKey r0 = (lombok.core.CleanupRegistry.CleanupKey) r0
                r5 = r0
                r0 = r3
                java.lang.String r0 = r0.key
                r1 = r5
                java.lang.String r1 = r1.key
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2b
                r0 = 0
                return r0
            L2b:
                r0 = r3
                java.lang.Object r0 = r0.target
                r1 = r5
                java.lang.Object r1 = r1.target
                if (r0 != r1) goto L38
                r0 = 1
                return r0
            L38:
                r0 = 0
                return r0
        }

        public int hashCode() {
                r3 = this;
                r0 = 109(0x6d, float:1.53E-43)
                r1 = r3
                java.lang.Object r1 = r1.target
                int r1 = java.lang.System.identityHashCode(r1)
                int r0 = r0 * r1
                r1 = r3
                java.lang.String r1 = r1.key
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public CleanupRegistry() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r2 = r1
            r2.<init>()
            r0.tasks = r1
            return
    }

    public void registerTask(java.lang.String r6, java.lang.Object r7, lombok.core.CleanupTask r8) {
            r5 = this;
            lombok.core.CleanupRegistry$CleanupKey r0 = new lombok.core.CleanupRegistry$CleanupKey
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r5
            java.util.concurrent.ConcurrentMap<lombok.core.CleanupRegistry$CleanupKey, lombok.core.CleanupTask> r0 = r0.tasks
            r1 = r9
            r2 = r8
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            return
    }

    public void run() {
            r2 = this;
            r0 = r2
            java.util.concurrent.ConcurrentMap<lombok.core.CleanupRegistry$CleanupKey, lombok.core.CleanupTask> r0 = r0.tasks
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r4 = r0
            goto L22
        L12:
            r0 = r4
            java.lang.Object r0 = r0.next()
            lombok.core.CleanupTask r0 = (lombok.core.CleanupTask) r0
            r3 = r0
            r0 = r3
            r0.cleanup()
        L22:
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L12
            r0 = r2
            java.util.concurrent.ConcurrentMap<lombok.core.CleanupRegistry$CleanupKey, lombok.core.CleanupTask> r0 = r0.tasks
            r0.clear()
            return
    }
}
