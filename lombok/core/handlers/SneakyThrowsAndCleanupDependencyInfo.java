package lombok.core.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/handlers/SneakyThrowsAndCleanupDependencyInfo.SCL.lombok */
public class SneakyThrowsAndCleanupDependencyInfo implements lombok.core.runtimeDependencies.RuntimeDependencyInfo {
    public SneakyThrowsAndCleanupDependencyInfo() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.core.runtimeDependencies.RuntimeDependencyInfo
    public java.util.List<java.lang.String> getRuntimeDependencies() {
            r5 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "lombok/Lombok.class"
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    @Override // lombok.core.runtimeDependencies.RuntimeDependencyInfo
    public java.util.List<java.lang.String> getRuntimeDependentsDescriptions() {
            r5 = this;
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "@SneakyThrows (only when delomboking - using @SneakyThrows in code that is compiled with lombok on the classpath does not create the dependency)"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "@Cleanup (only when delomboking - using @Cleanup in code that is compiled with lombok on the classpath does not create the dependency)"
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }
}
