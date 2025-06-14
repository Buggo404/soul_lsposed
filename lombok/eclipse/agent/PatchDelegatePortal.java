package lombok.eclipse.agent;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchDelegatePortal.SCL.lombok */
public class PatchDelegatePortal {
    static final java.lang.String CLASS_SCOPE = "org.eclipse.jdt.internal.compiler.lookup.ClassScope";
    static final java.lang.String I_JAVA_ELEMENT_ARRAY = "[Lorg.eclipse.jdt.core.IJavaElement;";
    static final java.lang.String SOURCE_TYPE_ELEMENT_INFO = "org.eclipse.jdt.internal.core.SourceTypeElementInfo";

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchDelegatePortal$Reflection.SCL.lombok */
    private static final class Reflection {
        public static final java.lang.reflect.Method handleDelegateForType = null;
        public static final java.lang.reflect.Method addGeneratedDelegateMethods = null;
        public static final java.lang.Throwable problemHandleDelegate = null;
        public static final java.lang.Throwable problemAddGeneratedDelegateMethods = null;

        static {
                r0 = 0
                r7 = r0
                r0 = 0
                r8 = r0
                r0 = 0
                r9 = r0
                r0 = 0
                r10 = r0
                java.lang.Class<lombok.eclipse.agent.PatchDelegate> r0 = lombok.eclipse.agent.PatchDelegate.class
                java.lang.String r1 = "handleDelegateForType"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1f
                r3 = r2
                r4 = 0
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.lookup.ClassScope"
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L1f
                r3[r4] = r5     // Catch: java.lang.Throwable -> L1f
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L1f
                r7 = r0
                goto L24
            L1f:
                r11 = move-exception
                r0 = r11
                r9 = r0
            L24:
                r0 = r7
                lombok.eclipse.agent.PatchDelegatePortal.Reflection.handleDelegateForType = r0
                r0 = r9
                lombok.eclipse.agent.PatchDelegatePortal.Reflection.problemHandleDelegate = r0
                java.lang.Class<lombok.eclipse.agent.PatchDelegate> r0 = lombok.eclipse.agent.PatchDelegate.class
                java.lang.String r1 = "addGeneratedDelegateMethods"
                r2 = 2
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L45
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.Object[]> r5 = java.lang.Object[].class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L45
                r3 = r2
                r4 = 1
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L45
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L45
                r8 = r0
                goto L4a
            L45:
                r11 = move-exception
                r0 = r11
                r10 = r0
            L4a:
                r0 = r8
                lombok.eclipse.agent.PatchDelegatePortal.Reflection.addGeneratedDelegateMethods = r0
                r0 = r10
                lombok.eclipse.agent.PatchDelegatePortal.Reflection.problemAddGeneratedDelegateMethods = r0
                return
        }

        private Reflection() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    public PatchDelegatePortal() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static boolean handleDelegateForType(java.lang.Object r8) {
            java.lang.Throwable r0 = lombok.eclipse.agent.PatchDelegatePortal.Reflection.problemHandleDelegate
            java.lang.reflect.Method r1 = lombok.eclipse.agent.PatchDelegatePortal.Reflection.handleDelegateForType
            r2 = 0
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            r4[r5] = r6
            java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L1c
            r0 = 0
            return r0
        L1c:
            r0 = r9
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static java.lang.Object[] addGeneratedDelegateMethods(java.lang.Object r8, java.lang.Object r9) {
            java.lang.Throwable r0 = lombok.eclipse.agent.PatchDelegatePortal.Reflection.problemAddGeneratedDelegateMethods
            java.lang.reflect.Method r1 = lombok.eclipse.agent.PatchDelegatePortal.Reflection.addGeneratedDelegateMethods
            r2 = 0
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r9
            r4[r5] = r6
            java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }
}
