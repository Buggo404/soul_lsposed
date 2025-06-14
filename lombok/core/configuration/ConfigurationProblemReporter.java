package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationProblemReporter.SCL.lombok */
public interface ConfigurationProblemReporter {
    public static final lombok.core.configuration.ConfigurationProblemReporter CONSOLE = null;


    static {
            lombok.core.configuration.ConfigurationProblemReporter$1 r0 = new lombok.core.configuration.ConfigurationProblemReporter$1
            r1 = r0
            r1.<init>()
            lombok.core.configuration.ConfigurationProblemReporter.CONSOLE = r0
            return
    }

    void report(java.lang.String r1, java.lang.String r2, int r3, java.lang.CharSequence r4);
}
