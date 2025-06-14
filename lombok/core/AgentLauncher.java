package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/AgentLauncher.SCL.lombok */
public class AgentLauncher {
    private static final java.util.List<lombok.core.AgentLauncher.AgentInfo> AGENTS = null;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/AgentLauncher$AgentInfo.SCL.lombok */
    private static abstract class AgentInfo {
        private AgentInfo() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        abstract java.lang.String className();

        void problem(java.lang.Throwable r7, java.lang.instrument.Instrumentation r8) throws java.lang.Throwable {
                r6 = this;
                r0 = r7
                boolean r0 = r0 instanceof java.lang.ClassNotFoundException
                if (r0 == 0) goto L8
                return
            L8:
                r0 = r7
                boolean r0 = r0 instanceof java.lang.ClassCastException
                if (r0 == 0) goto L2f
                java.lang.InternalError r0 = new java.lang.InternalError
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                java.lang.String r4 = "Lombok bug. Class: "
                r3.<init>(r4)
                r3 = r6
                java.lang.String r3 = r3.className()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = " is not an implementation of lombok.core.Agent"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
            L2f:
                r0 = r7
                boolean r0 = r0 instanceof java.lang.IllegalAccessError
                if (r0 == 0) goto L56
                java.lang.InternalError r0 = new java.lang.InternalError
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                java.lang.String r4 = "Lombok bug. Class: "
                r3.<init>(r4)
                r3 = r6
                java.lang.String r3 = r3.className()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = " is not public"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
            L56:
                r0 = r7
                boolean r0 = r0 instanceof java.lang.InstantiationException
                if (r0 == 0) goto L7d
                java.lang.InternalError r0 = new java.lang.InternalError
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                java.lang.String r4 = "Lombok bug. Class: "
                r3.<init>(r4)
                r3 = r6
                java.lang.String r3 = r3.className()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = " is not concrete or has no public no-args constructor"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
            L7d:
                r0 = r7
                throw r0
        }

        /* synthetic */ AgentInfo(lombok.core.AgentLauncher.AgentInfo r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/AgentLauncher$AgentLaunchable.SCL.lombok */
    public interface AgentLaunchable {
        void runAgent(java.lang.String r1, java.lang.instrument.Instrumentation r2, boolean r3, java.lang.Class<?> r4) throws java.lang.Exception;
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/AgentLauncher$EclipsePatcherInfo.SCL.lombok */
    private static class EclipsePatcherInfo extends lombok.core.AgentLauncher.AgentInfo {
        private EclipsePatcherInfo() {
                r3 = this;
                r0 = r3
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // lombok.core.AgentLauncher.AgentInfo
        java.lang.String className() {
                r2 = this;
                java.lang.String r0 = "lombok.eclipse.agent.EclipsePatcher"
                return r0
        }

        /* synthetic */ EclipsePatcherInfo(lombok.core.AgentLauncher.EclipsePatcherInfo r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    static {
            r0 = 1
            lombok.core.AgentLauncher$AgentInfo[] r0 = new lombok.core.AgentLauncher.AgentInfo[r0]
            r1 = r0
            r2 = 0
            lombok.core.AgentLauncher$EclipsePatcherInfo r3 = new lombok.core.AgentLauncher$EclipsePatcherInfo
            r4 = r3
            r5 = 0
            r4.<init>(r5)
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            lombok.core.AgentLauncher.AGENTS = r0
            return
    }

    public AgentLauncher() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void runAgents(java.lang.String r6, java.lang.instrument.Instrumentation r7, boolean r8, java.lang.Class<?> r9) throws java.lang.Throwable {
            java.util.List<lombok.core.AgentLauncher$AgentInfo> r0 = lombok.core.AgentLauncher.AGENTS
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L5f
        Ld:
            r0 = r11
            java.lang.Object r0 = r0.next()
            lombok.core.AgentLauncher$AgentInfo r0 = (lombok.core.AgentLauncher.AgentInfo) r0
            r10 = r0
            r0 = r10
            java.lang.String r0 = r0.className()     // Catch: java.lang.Throwable -> L46
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L46
            r12 = r0
            r0 = r12
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.Throwable -> L46
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L46
            lombok.core.AgentLauncher$AgentLaunchable r0 = (lombok.core.AgentLauncher.AgentLaunchable) r0     // Catch: java.lang.Throwable -> L46
            r13 = r0
            r0 = r13
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.runAgent(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L46
            goto L5f
        L46:
            r12 = move-exception
            r0 = r12
            boolean r0 = r0 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L57
            r0 = r12
            java.lang.Throwable r0 = r0.getCause()
            r12 = r0
        L57:
            r0 = r10
            r1 = r12
            r2 = r7
            r0.problem(r1, r2)
        L5f:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Ld
            return
    }
}
