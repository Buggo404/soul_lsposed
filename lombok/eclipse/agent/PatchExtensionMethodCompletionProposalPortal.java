package lombok.eclipse.agent;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchExtensionMethodCompletionProposalPortal.SCL.lombok */
public class PatchExtensionMethodCompletionProposalPortal {
    private static final java.lang.String COMPLETION_PROPOSAL_COLLECTOR = "org.eclipse.jdt.ui.text.java.CompletionProposalCollector";
    private static final java.lang.String I_JAVA_COMPLETION_PROPOSAL_ARRAY = "[Lorg.eclipse.jdt.ui.text.java.IJavaCompletionProposal;";

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchExtensionMethodCompletionProposalPortal$ReflectionForUi.SCL.lombok */
    private static final class ReflectionForUi {
        public static final java.lang.reflect.Method getJavaCompletionProposals = null;
        public static final java.lang.Throwable problem = null;

        static {
                r0 = 0
                r7 = r0
                r0 = 0
                r8 = r0
                java.lang.Class<lombok.eclipse.agent.PatchExtensionMethodCompletionProposal> r0 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.class
                java.lang.String r1 = "getJavaCompletionProposals"
                r2 = 2
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L23
                r3 = r2
                r4 = 0
                java.lang.String r5 = "[Lorg.eclipse.jdt.ui.text.java.IJavaCompletionProposal;"
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L23
                r3[r4] = r5     // Catch: java.lang.Throwable -> L23
                r3 = r2
                r4 = 1
                java.lang.String r5 = "org.eclipse.jdt.ui.text.java.CompletionProposalCollector"
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L23
                r3[r4] = r5     // Catch: java.lang.Throwable -> L23
                java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L23
                r7 = r0
                goto L26
            L23:
                r9 = move-exception
                r0 = r9
                r8 = r0
            L26:
                r0 = r7
                lombok.eclipse.agent.PatchExtensionMethodCompletionProposalPortal.ReflectionForUi.getJavaCompletionProposals = r0
                r0 = r8
                lombok.eclipse.agent.PatchExtensionMethodCompletionProposalPortal.ReflectionForUi.problem = r0
                return
        }

        private ReflectionForUi() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    public PatchExtensionMethodCompletionProposalPortal() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static org.eclipse.jdt.ui.text.java.IJavaCompletionProposal[] getJavaCompletionProposals(java.lang.Object[] r7, java.lang.Object r8) {
            java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposalPortal.ReflectionForUi.getJavaCompletionProposals     // Catch: java.lang.NoClassDefFoundError -> L17 java.lang.IllegalAccessException -> L1d java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L2c
            r1 = 0
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoClassDefFoundError -> L17 java.lang.IllegalAccessException -> L1d java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L2c
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5     // Catch: java.lang.NoClassDefFoundError -> L17 java.lang.IllegalAccessException -> L1d java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L2c
            r3 = r2
            r4 = 1
            r5 = r8
            r3[r4] = r5     // Catch: java.lang.NoClassDefFoundError -> L17 java.lang.IllegalAccessException -> L1d java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L2c
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoClassDefFoundError -> L17 java.lang.IllegalAccessException -> L1d java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L2c
            org.eclipse.jdt.ui.text.java.IJavaCompletionProposal[] r0 = (org.eclipse.jdt.ui.text.java.IJavaCompletionProposal[]) r0     // Catch: java.lang.NoClassDefFoundError -> L17 java.lang.IllegalAccessException -> L1d java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L2c
            return r0
        L17:
            r0 = r7
            org.eclipse.jdt.ui.text.java.IJavaCompletionProposal[] r0 = (org.eclipse.jdt.ui.text.java.IJavaCompletionProposal[]) r0
            return r0
        L1d:
            r9 = move-exception
            r0 = r9
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L23:
            r9 = move-exception
            r0 = r9
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L2c:
            r9 = move-exception
            java.lang.String r0 = "false"
            java.lang.String r1 = "lombok.debug.reflection"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            r0 = r9
            java.lang.Throwable r1 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposalPortal.ReflectionForUi.problem
            java.lang.Throwable r0 = r0.initCause(r1)
            r0 = r9
            throw r0
        L46:
            r0 = r7
            org.eclipse.jdt.ui.text.java.IJavaCompletionProposal[] r0 = (org.eclipse.jdt.ui.text.java.IJavaCompletionProposal[]) r0
            return r0
    }
}
