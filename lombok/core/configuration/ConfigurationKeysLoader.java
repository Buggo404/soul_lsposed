package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationKeysLoader.SCL.lombok */
public interface ConfigurationKeysLoader {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationKeysLoader$LoaderLoader.SCL.lombok */
    public static class LoaderLoader {
        private static final java.util.concurrent.atomic.AtomicBoolean alreadyLoaded = null;

        static {
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r1 = r0
                r2 = 0
                r1.<init>(r2)
                lombok.core.configuration.ConfigurationKeysLoader.LoaderLoader.alreadyLoaded = r0
                return
        }

        private LoaderLoader() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public static void loadAllConfigurationKeys() {
                java.util.concurrent.atomic.AtomicBoolean r0 = lombok.core.configuration.ConfigurationKeysLoader.LoaderLoader.alreadyLoaded
                boolean r0 = r0.get()
                if (r0 == 0) goto La
                return
            La:
                java.lang.Class<lombok.ConfigurationKeys> r0 = lombok.ConfigurationKeys.class
                java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L16
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L16
                goto L17
            L16:
            L17:
                java.lang.Class<lombok.core.configuration.ConfigurationKeysLoader> r0 = lombok.core.configuration.ConfigurationKeysLoader.class
                java.lang.Class<lombok.core.configuration.ConfigurationKeysLoader> r1 = lombok.core.configuration.ConfigurationKeysLoader.class
                java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L4d
                java.lang.Iterable r0 = lombok.core.SpiLoadUtil.findServices(r0, r1)     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L4d
                java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L4d
                r5 = r0
                goto L35
            L2a:
                r0 = r5
                java.lang.Object r0 = r0.next()     // Catch: java.lang.Exception -> L34 java.io.IOException -> L41 java.lang.Throwable -> L4d
                goto L35
            L34:
            L35:
                r0 = r5
                boolean r0 = r0.hasNext()     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L4d
                if (r0 != 0) goto L2a
                goto L57
            L41:
                r5 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L4d
                r1 = r0
                java.lang.String r2 = "Can't load config keys; services file issue."
                r3 = r5
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L4d
                throw r0     // Catch: java.lang.Throwable -> L4d
            L4d:
                r6 = move-exception
                java.util.concurrent.atomic.AtomicBoolean r0 = lombok.core.configuration.ConfigurationKeysLoader.LoaderLoader.alreadyLoaded
                r1 = 1
                r0.set(r1)
                r0 = r6
                throw r0
            L57:
                java.util.concurrent.atomic.AtomicBoolean r0 = lombok.core.configuration.ConfigurationKeysLoader.LoaderLoader.alreadyLoaded
                r1 = 1
                r0.set(r1)
                return
        }
    }
}
