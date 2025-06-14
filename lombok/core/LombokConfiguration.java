package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/LombokConfiguration.SCL.lombok */
public class LombokConfiguration {
    private static final lombok.core.configuration.ConfigurationResolver NULL_RESOLVER = null;
    private static lombok.core.configuration.FileSystemSourceCache cache;
    private static lombok.core.configuration.ConfigurationResolverFactory configurationResolverFactory;




    static {
            lombok.core.LombokConfiguration$1 r0 = new lombok.core.LombokConfiguration$1
            r1 = r0
            r1.<init>()
            lombok.core.LombokConfiguration.NULL_RESOLVER = r0
            lombok.core.configuration.FileSystemSourceCache r0 = new lombok.core.configuration.FileSystemSourceCache
            r1 = r0
            r1.<init>()
            lombok.core.LombokConfiguration.cache = r0
            java.lang.String r0 = "lombok.disableConfig"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L29
            lombok.core.LombokConfiguration$2 r0 = new lombok.core.LombokConfiguration$2
            r1 = r0
            r1.<init>()
            lombok.core.LombokConfiguration.configurationResolverFactory = r0
            goto L2f
        L29:
            lombok.core.configuration.ConfigurationResolverFactory r0 = createFileSystemBubblingResolverFactory()
            lombok.core.LombokConfiguration.configurationResolverFactory = r0
        L2f:
            return
    }

    private LombokConfiguration() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void overrideConfigurationResolverFactory(lombok.core.configuration.ConfigurationResolverFactory r2) {
            r0 = r2
            if (r0 != 0) goto La
            lombok.core.configuration.ConfigurationResolverFactory r0 = createFileSystemBubblingResolverFactory()
            goto Lb
        La:
            r0 = r2
        Lb:
            lombok.core.LombokConfiguration.configurationResolverFactory = r0
            return
    }

    static <T> T read(lombok.core.configuration.ConfigurationKey<T> r3, lombok.core.AST<?, ?, ?> r4) {
            r0 = r3
            r1 = r4
            java.net.URI r1 = r1.getAbsoluteFileLocation()
            java.lang.Object r0 = read(r0, r1)
            return r0
    }

    public static <T> T read(lombok.core.configuration.ConfigurationKey<T> r3, java.net.URI r4) {
            lombok.core.configuration.ConfigurationResolverFactory r0 = lombok.core.LombokConfiguration.configurationResolverFactory
            r1 = r4
            lombok.core.configuration.ConfigurationResolver r0 = r0.createResolver(r1)
            r1 = r3
            java.lang.Object r0 = r0.resolve(r1)
            return r0
    }

    private static lombok.core.configuration.ConfigurationResolverFactory createFileSystemBubblingResolverFactory() {
            lombok.core.configuration.FileSystemSourceCache r0 = lombok.core.LombokConfiguration.cache
            lombok.core.configuration.ConfigurationParser r1 = new lombok.core.configuration.ConfigurationParser
            r2 = r1
            lombok.core.configuration.ConfigurationProblemReporter r3 = lombok.core.configuration.ConfigurationProblemReporter.CONSOLE
            r2.<init>(r3)
            lombok.core.configuration.ConfigurationFileToSource r0 = r0.fileToSource(r1)
            r5 = r0
            lombok.core.LombokConfiguration$3 r0 = new lombok.core.LombokConfiguration$3
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
    }

    static /* synthetic */ lombok.core.configuration.ConfigurationResolver access$0() {
            lombok.core.configuration.ConfigurationResolver r0 = lombok.core.LombokConfiguration.NULL_RESOLVER
            return r0
    }

    static /* synthetic */ lombok.core.configuration.FileSystemSourceCache access$1() {
            lombok.core.configuration.FileSystemSourceCache r0 = lombok.core.LombokConfiguration.cache
            return r0
    }
}
