package lombok.eclipse.agent;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchValEclipsePortal.SCL.lombok */
public class PatchValEclipsePortal {
    static final java.lang.String LOCALDECLARATION_SIG = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration";
    static final java.lang.String PARSER_SIG = "org.eclipse.jdt.internal.compiler.parser.Parser";
    static final java.lang.String VARIABLEDECLARATIONSTATEMENT_SIG = "org.eclipse.jdt.core.dom.VariableDeclarationStatement";
    static final java.lang.String SINGLEVARIABLEDECLARATION_SIG = "org.eclipse.jdt.core.dom.SingleVariableDeclaration";
    static final java.lang.String ASTCONVERTER_SIG = "org.eclipse.jdt.core.dom.ASTConverter";

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchValEclipsePortal$Reflection.SCL.lombok */
    private static final class Reflection {
        public static final java.lang.reflect.Method copyInitializationOfForEachIterable = null;
        public static final java.lang.reflect.Method copyInitializationOfLocalDeclaration = null;
        public static final java.lang.reflect.Method addFinalAndValAnnotationToVariableDeclarationStatement = null;
        public static final java.lang.reflect.Method addFinalAndValAnnotationToSingleVariableDeclaration = null;
        public static final java.lang.Throwable problem = null;

        static {
                r0 = 0
                r7 = r0
                r0 = 0
                r8 = r0
                r0 = 0
                r9 = r0
                r0 = 0
                r10 = r0
                r0 = 0
                r11 = r0
                java.lang.Class<lombok.eclipse.agent.PatchValEclipse> r0 = lombok.eclipse.agent.PatchValEclipse.class
                java.lang.String r1 = "copyInitializationOfForEachIterable"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L78
                r3 = r2
                r4 = 0
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.parser.Parser"
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L78
                r3[r4] = r5     // Catch: java.lang.Throwable -> L78
                java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L78
                r7 = r0
                java.lang.Class<lombok.eclipse.agent.PatchValEclipse> r0 = lombok.eclipse.agent.PatchValEclipse.class
                java.lang.String r1 = "copyInitializationOfLocalDeclaration"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L78
                r3 = r2
                r4 = 0
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.parser.Parser"
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L78
                r3[r4] = r5     // Catch: java.lang.Throwable -> L78
                java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L78
                r8 = r0
                java.lang.Class<lombok.eclipse.agent.PatchValEclipse> r0 = lombok.eclipse.agent.PatchValEclipse.class
                java.lang.String r1 = "addFinalAndValAnnotationToVariableDeclarationStatement"
                r2 = 3
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L78
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L78
                r3 = r2
                r4 = 1
                java.lang.String r5 = "org.eclipse.jdt.core.dom.VariableDeclarationStatement"
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L78
                r3[r4] = r5     // Catch: java.lang.Throwable -> L78
                r3 = r2
                r4 = 2
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration"
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L78
                r3[r4] = r5     // Catch: java.lang.Throwable -> L78
                java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L78
                r9 = r0
                java.lang.Class<lombok.eclipse.agent.PatchValEclipse> r0 = lombok.eclipse.agent.PatchValEclipse.class
                java.lang.String r1 = "addFinalAndValAnnotationToSingleVariableDeclaration"
                r2 = 3
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L78
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L78
                r3 = r2
                r4 = 1
                java.lang.String r5 = "org.eclipse.jdt.core.dom.SingleVariableDeclaration"
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L78
                r3[r4] = r5     // Catch: java.lang.Throwable -> L78
                r3 = r2
                r4 = 2
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration"
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L78
                r3[r4] = r5     // Catch: java.lang.Throwable -> L78
                java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L78
                r10 = r0
                goto L7e
            L78:
                r12 = move-exception
                r0 = r12
                r11 = r0
            L7e:
                r0 = r7
                lombok.eclipse.agent.PatchValEclipsePortal.Reflection.copyInitializationOfForEachIterable = r0
                r0 = r8
                lombok.eclipse.agent.PatchValEclipsePortal.Reflection.copyInitializationOfLocalDeclaration = r0
                r0 = r9
                lombok.eclipse.agent.PatchValEclipsePortal.Reflection.addFinalAndValAnnotationToVariableDeclarationStatement = r0
                r0 = r10
                lombok.eclipse.agent.PatchValEclipsePortal.Reflection.addFinalAndValAnnotationToSingleVariableDeclaration = r0
                r0 = r11
                lombok.eclipse.agent.PatchValEclipsePortal.Reflection.problem = r0
                return
        }

        private Reflection() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    public PatchValEclipsePortal() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void copyInitializationOfForEachIterable(java.lang.Object r7) {
            java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchValEclipsePortal.Reflection.copyInitializationOfForEachIterable     // Catch: java.lang.NoClassDefFoundError -> L13 java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L1d java.lang.NullPointerException -> L26
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoClassDefFoundError -> L13 java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L1d java.lang.NullPointerException -> L26
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5     // Catch: java.lang.NoClassDefFoundError -> L13 java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L1d java.lang.NullPointerException -> L26
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoClassDefFoundError -> L13 java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L1d java.lang.NullPointerException -> L26
            goto L40
        L13:
            goto L40
        L17:
            r8 = move-exception
            r0 = r8
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L1d:
            r8 = move-exception
            r0 = r8
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L26:
            r8 = move-exception
            java.lang.String r0 = "false"
            java.lang.String r1 = "lombok.debug.reflection"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            r0 = r8
            java.lang.Throwable r1 = lombok.eclipse.agent.PatchValEclipsePortal.Reflection.problem
            java.lang.Throwable r0 = r0.initCause(r1)
            r0 = r8
            throw r0
        L40:
            return
    }

    public static void copyInitializationOfLocalDeclaration(java.lang.Object r7) {
            java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchValEclipsePortal.Reflection.copyInitializationOfLocalDeclaration     // Catch: java.lang.NoClassDefFoundError -> L13 java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L1d java.lang.NullPointerException -> L26
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoClassDefFoundError -> L13 java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L1d java.lang.NullPointerException -> L26
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5     // Catch: java.lang.NoClassDefFoundError -> L13 java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L1d java.lang.NullPointerException -> L26
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoClassDefFoundError -> L13 java.lang.IllegalAccessException -> L17 java.lang.reflect.InvocationTargetException -> L1d java.lang.NullPointerException -> L26
            goto L40
        L13:
            goto L40
        L17:
            r8 = move-exception
            r0 = r8
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L1d:
            r8 = move-exception
            r0 = r8
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L26:
            r8 = move-exception
            java.lang.String r0 = "false"
            java.lang.String r1 = "lombok.debug.reflection"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            r0 = r8
            java.lang.Throwable r1 = lombok.eclipse.agent.PatchValEclipsePortal.Reflection.problem
            java.lang.Throwable r0 = r0.initCause(r1)
            r0 = r8
            throw r0
        L40:
            return
    }

    public static void addFinalAndValAnnotationToVariableDeclarationStatement(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchValEclipsePortal.Reflection.addFinalAndValAnnotationToVariableDeclarationStatement     // Catch: java.lang.NoClassDefFoundError -> L1b java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L25 java.lang.NullPointerException -> L2e
            r1 = 0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoClassDefFoundError -> L1b java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L25 java.lang.NullPointerException -> L2e
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5     // Catch: java.lang.NoClassDefFoundError -> L1b java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L25 java.lang.NullPointerException -> L2e
            r3 = r2
            r4 = 1
            r5 = r8
            r3[r4] = r5     // Catch: java.lang.NoClassDefFoundError -> L1b java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L25 java.lang.NullPointerException -> L2e
            r3 = r2
            r4 = 2
            r5 = r9
            r3[r4] = r5     // Catch: java.lang.NoClassDefFoundError -> L1b java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L25 java.lang.NullPointerException -> L2e
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoClassDefFoundError -> L1b java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L25 java.lang.NullPointerException -> L2e
            goto L48
        L1b:
            goto L48
        L1f:
            r10 = move-exception
            r0 = r10
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L25:
            r10 = move-exception
            r0 = r10
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L2e:
            r10 = move-exception
            java.lang.String r0 = "false"
            java.lang.String r1 = "lombok.debug.reflection"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            r0 = r10
            java.lang.Throwable r1 = lombok.eclipse.agent.PatchValEclipsePortal.Reflection.problem
            java.lang.Throwable r0 = r0.initCause(r1)
            r0 = r10
            throw r0
        L48:
            return
    }

    public static void addFinalAndValAnnotationToSingleVariableDeclaration(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchValEclipsePortal.Reflection.addFinalAndValAnnotationToSingleVariableDeclaration     // Catch: java.lang.NoClassDefFoundError -> L1b java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L25 java.lang.NullPointerException -> L2e
            r1 = 0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NoClassDefFoundError -> L1b java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L25 java.lang.NullPointerException -> L2e
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5     // Catch: java.lang.NoClassDefFoundError -> L1b java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L25 java.lang.NullPointerException -> L2e
            r3 = r2
            r4 = 1
            r5 = r8
            r3[r4] = r5     // Catch: java.lang.NoClassDefFoundError -> L1b java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L25 java.lang.NullPointerException -> L2e
            r3 = r2
            r4 = 2
            r5 = r9
            r3[r4] = r5     // Catch: java.lang.NoClassDefFoundError -> L1b java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L25 java.lang.NullPointerException -> L2e
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.NoClassDefFoundError -> L1b java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L25 java.lang.NullPointerException -> L2e
            goto L48
        L1b:
            goto L48
        L1f:
            r10 = move-exception
            r0 = r10
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L25:
            r10 = move-exception
            r0 = r10
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L2e:
            r10 = move-exception
            java.lang.String r0 = "false"
            java.lang.String r1 = "lombok.debug.reflection"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            r0 = r10
            java.lang.Throwable r1 = lombok.eclipse.agent.PatchValEclipsePortal.Reflection.problem
            java.lang.Throwable r0 = r0.initCause(r1)
            r0 = r10
            throw r0
        L48:
            return
    }
}
