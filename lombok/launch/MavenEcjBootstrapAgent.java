package lombok.launch;

/* loaded from: com.usidqw.qwerklj.apk:lombok/launch/mavenEcjBootstrapAgent.jar:lombok/launch/MavenEcjBootstrapAgent.class */
public final class MavenEcjBootstrapAgent {
    private static final java.lang.String MAVEN_COMPILER_TRIGGER_CLASS = "org/apache/maven/plugin/compiler/AbstractCompilerMojo";
    private static final java.lang.String LOMBOK_URL_IDENTIFIER = "/org/projectlombok/lombok/";
    private static final java.lang.String LOMBOK_AGENT_CLASS = "lombok.launch.Agent";
    private static final byte[] NOT_TRANSFORMED = null;


    static {
            r0 = 0
            lombok.launch.MavenEcjBootstrapAgent.NOT_TRANSFORMED = r0
            return
    }

    private MavenEcjBootstrapAgent() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void premain(java.lang.String r6, java.lang.instrument.Instrumentation r7) {
            r0 = r7
            lombok.launch.MavenEcjBootstrapAgent$1 r1 = new lombok.launch.MavenEcjBootstrapAgent$1
            r2 = r1
            r3 = r7
            r4 = r6
            r2.<init>(r3, r4)
            r0.addTransformer(r1)
            return
    }

    static /* synthetic */ byte[] access$0() {
            byte[] r0 = lombok.launch.MavenEcjBootstrapAgent.NOT_TRANSFORMED
            return r0
    }
}
