package lombok.eclipse.agent;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/EclipseLoaderPatcher.SCL.lombok */
public class EclipseLoaderPatcher {
    private static final java.lang.String TRANSPLANTS_CLASS_NAME = "lombok.eclipse.agent.EclipseLoaderPatcherTransplants";
    static final java.lang.String[] OSGI_TYPES = null;

    static {
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "org/eclipse/osgi/internal/baseadaptor/DefaultClassLoader"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "org/eclipse/osgi/framework/adapter/core/AbstractClassLoader"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "org/eclipse/osgi/internal/loader/ModuleClassLoader"
            r1[r2] = r3
            lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES = r0
            return
    }

    public EclipseLoaderPatcher() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void patchEquinoxLoaders(lombok.patcher.ScriptManager r12, java.lang.Class<?> r13) {
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.osgi.internal.baseadaptor.DefaultClassLoader"
            java.lang.String r5 = "loadClass"
            java.lang.String r6 = "java.lang.Class"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.String"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "boolean"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.target(r2)
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.osgi.framework.adapter.core.AbstractClassLoader"
            java.lang.String r5 = "loadClass"
            java.lang.String r6 = "java.lang.Class"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.String"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "boolean"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.target(r2)
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.osgi.internal.loader.ModuleClassLoader"
            java.lang.String r5 = "loadClass"
            java.lang.String r6 = "java.lang.Class"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.String"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "boolean"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.eclipse.agent.EclipseLoaderPatcherTransplants"
            java.lang.String r5 = "overrideLoadDecide"
            java.lang.String r6 = "boolean"
            r7 = 3
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.ClassLoader"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "java.lang.String"
            r8[r9] = r10
            r8 = r7
            r9 = 2
            java.lang.String r10 = "boolean"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.decisionMethod(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.eclipse.agent.EclipseLoaderPatcherTransplants"
            java.lang.String r5 = "overrideLoadResult"
            java.lang.String r6 = "java.lang.Class"
            r7 = 3
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.ClassLoader"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "java.lang.String"
            r8[r9] = r10
            r8 = r7
            r9 = 2
            java.lang.String r10 = "boolean"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.valueMethod(r2)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.transplant()
            r2 = 3
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.THIS
            r3[r4] = r5
            r3 = r2
            r4 = 1
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.PARAM1
            r3[r4] = r5
            r3 = r2
            r4 = 2
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.PARAM2
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.request(r2)
            lombok.patcher.scripts.ExitFromMethodEarlyScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = lombok.patcher.scripts.ScriptBuilder.addField()
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.setPublic()
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.setVolatile()
            java.lang.String r2 = "Ljava/lang/ClassLoader;"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.fieldType(r2)
            java.lang.String r2 = "lombok$shadowLoader"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.fieldName(r2)
            java.lang.String r2 = "org.eclipse.osgi.internal.baseadaptor.DefaultClassLoader"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.targetClass(r2)
            java.lang.String r2 = "org.eclipse.osgi.framework.adapter.core.AbstractClassLoader"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.targetClass(r2)
            java.lang.String r2 = "org.eclipse.osgi.internal.loader.ModuleClassLoader"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.targetClass(r2)
            lombok.patcher.scripts.AddFieldScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = lombok.patcher.scripts.ScriptBuilder.addField()
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.setPublic()
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.setVolatile()
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.setStatic()
            java.lang.String r2 = "Ljava/lang/Class;"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.fieldType(r2)
            java.lang.String r2 = "lombok$shadowLoaderClass"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.fieldName(r2)
            java.lang.String r2 = "org.eclipse.osgi.internal.baseadaptor.DefaultClassLoader"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.targetClass(r2)
            java.lang.String r2 = "org.eclipse.osgi.framework.adapter.core.AbstractClassLoader"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.targetClass(r2)
            java.lang.String r2 = "org.eclipse.osgi.internal.loader.ModuleClassLoader"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.targetClass(r2)
            lombok.patcher.scripts.AddFieldScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = lombok.patcher.scripts.ScriptBuilder.addField()
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.setPublic()
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.setStatic()
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.setFinal()
            java.lang.String r2 = "Ljava/lang/String;"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.fieldType(r2)
            java.lang.String r2 = "lombok$location"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.fieldName(r2)
            java.lang.String r2 = "org.eclipse.osgi.internal.baseadaptor.DefaultClassLoader"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.targetClass(r2)
            java.lang.String r2 = "org.eclipse.osgi.framework.adapter.core.AbstractClassLoader"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.targetClass(r2)
            java.lang.String r2 = "org.eclipse.osgi.internal.loader.ModuleClassLoader"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.targetClass(r2)
            r2 = r13
            java.lang.String r2 = lombok.patcher.ClassRootFinder.findClassRootOfClass(r2)
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.value(r2)
            lombok.patcher.scripts.AddFieldScript r1 = r1.build()
            r0.addScript(r1)
            return
    }
}
