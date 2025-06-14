package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/FileSystemSourceCache.SCL.lombok */
public class FileSystemSourceCache {
    private static final long FULL_CACHE_CLEAR_INTERVAL = 0;
    private static final long RECHECK_FILESYSTEM = 0;
    private static final long NEVER_CHECKED = -1;
    static final long MISSING = -88;
    private final java.util.concurrent.ConcurrentMap<lombok.core.configuration.ConfigurationFile, lombok.core.configuration.FileSystemSourceCache.Content> fileCache;
    private final java.util.concurrent.ConcurrentMap<java.net.URI, lombok.core.configuration.ConfigurationFile> uriCache;
    private volatile long lastCacheClear;


    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/FileSystemSourceCache$Content.SCL.lombok */
    private static class Content {
        lombok.core.configuration.ConfigurationSource source;
        long lastModified;
        long lastChecked;

        private Content(lombok.core.configuration.ConfigurationSource r5, long r6, long r8) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.source = r1
                r0 = r4
                r1 = r6
                r0.lastModified = r1
                r0 = r4
                r1 = r8
                r0.lastChecked = r1
                return
        }

        static lombok.core.configuration.FileSystemSourceCache.Content empty() {
                lombok.core.configuration.FileSystemSourceCache$Content r0 = new lombok.core.configuration.FileSystemSourceCache$Content
                r1 = r0
                r2 = 0
                r3 = -88
                r4 = -1
                r1.<init>(r2, r3, r4)
                return r0
        }
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            r1 = 30
            long r0 = r0.toMillis(r1)
            lombok.core.configuration.FileSystemSourceCache.FULL_CACHE_CLEAR_INTERVAL = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 2
            long r0 = r0.toMillis(r1)
            lombok.core.configuration.FileSystemSourceCache.RECHECK_FILESYSTEM = r0
            return
    }

    public FileSystemSourceCache() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r2 = r1
            r2.<init>()
            r0.fileCache = r1
            r0 = r4
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r2 = r1
            r2.<init>()
            r0.uriCache = r1
            r0 = r4
            long r1 = java.lang.System.currentTimeMillis()
            r0.lastCacheClear = r1
            return
    }

    private void cacheClear() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r6 = r0
            r0 = r6
            r1 = r5
            long r1 = r1.lastCacheClear
            long r0 = r0 - r1
            r8 = r0
            r0 = r8
            long r1 = lombok.core.configuration.FileSystemSourceCache.FULL_CACHE_CLEAR_INTERVAL
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2a
            r0 = r5
            r1 = r6
            r0.lastCacheClear = r1
            r0 = r5
            java.util.concurrent.ConcurrentMap<lombok.core.configuration.ConfigurationFile, lombok.core.configuration.FileSystemSourceCache$Content> r0 = r0.fileCache
            r0.clear()
            r0 = r5
            java.util.concurrent.ConcurrentMap<java.net.URI, lombok.core.configuration.ConfigurationFile> r0 = r0.uriCache
            r0.clear()
        L2a:
            return
    }

    public lombok.core.configuration.ConfigurationFileToSource fileToSource(lombok.core.configuration.ConfigurationParser r6) {
            r5 = this;
            lombok.core.configuration.FileSystemSourceCache$1 r0 = new lombok.core.configuration.FileSystemSourceCache$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public lombok.core.configuration.ConfigurationFile forUri(java.net.URI r7) {
            r6 = this;
            r0 = r7
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r6
            r0.cacheClear()
            r0 = r6
            java.util.concurrent.ConcurrentMap<java.net.URI, lombok.core.configuration.ConfigurationFile> r0 = r0.uriCache
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            lombok.core.configuration.ConfigurationFile r0 = (lombok.core.configuration.ConfigurationFile) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto Lb2
            r0 = r7
            java.net.URI r0 = r0.normalize()
            r9 = r0
            r0 = r9
            boolean r0 = r0.isAbsolute()
            if (r0 != 0) goto L3f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "file:"
            r1.<init>(r2)
            r1 = r9
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.net.URI r0 = java.net.URI.create(r0)
            r9 = r0
        L3f:
            java.io.File r0 = new java.io.File     // Catch: java.lang.IllegalArgumentException -> L97 java.lang.Exception -> L9b
            r1 = r0
            r2 = r9
            r1.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L97 java.lang.Exception -> L9b
            r10 = r0
            r0 = r10
            boolean r0 = r0.exists()     // Catch: java.lang.IllegalArgumentException -> L97 java.lang.Exception -> L9b
            if (r0 != 0) goto L69
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L97 java.lang.Exception -> L9b
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L97 java.lang.Exception -> L9b
            r3 = r2
            java.lang.String r4 = "File does not exist: "
            r3.<init>(r4)     // Catch: java.lang.IllegalArgumentException -> L97 java.lang.Exception -> L9b
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.IllegalArgumentException -> L97 java.lang.Exception -> L9b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.IllegalArgumentException -> L97 java.lang.Exception -> L9b
            r1.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L97 java.lang.Exception -> L9b
            throw r0     // Catch: java.lang.IllegalArgumentException -> L97 java.lang.Exception -> L9b
        L69:
            r0 = r10
            boolean r0 = r0.isDirectory()     // Catch: java.lang.IllegalArgumentException -> L97 java.lang.Exception -> L9b
            if (r0 == 0) goto L76
            r0 = r10
            goto L7b
        L76:
            r0 = r10
            java.io.File r0 = r0.getParentFile()     // Catch: java.lang.IllegalArgumentException -> L97 java.lang.Exception -> L9b
        L7b:
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L88
            r0 = r11
            lombok.core.configuration.ConfigurationFile r0 = lombok.core.configuration.ConfigurationFile.forDirectory(r0)     // Catch: java.lang.IllegalArgumentException -> L97 java.lang.Exception -> L9b
            r8 = r0
        L88:
            r0 = r6
            java.util.concurrent.ConcurrentMap<java.net.URI, lombok.core.configuration.ConfigurationFile> r0 = r0.uriCache     // Catch: java.lang.IllegalArgumentException -> L97 java.lang.Exception -> L9b
            r1 = r7
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L97 java.lang.Exception -> L9b
            goto Lb2
        L97:
            goto Lb2
        L9b:
            r10 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "Can't find absolute path of file being compiled: "
            r1.<init>(r2)
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r10
            lombok.core.debug.ProblemReporter.error(r0, r1)
        Lb2:
            r0 = r8
            return r0
    }

    private lombok.core.configuration.ConfigurationSource parseIfNeccesary(lombok.core.configuration.ConfigurationFile r7, lombok.core.configuration.ConfigurationParser r8) {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r9 = r0
            r0 = r6
            r1 = r7
            lombok.core.configuration.FileSystemSourceCache$Content r0 = r0.ensureContent(r1)
            r11 = r0
            r0 = r11
            r1 = r0
            r12 = r1
            monitor-enter(r0)
            r0 = r11
            long r0 = r0.lastChecked     // Catch: java.lang.Throwable -> L78
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L34
            r0 = r9
            r1 = r11
            long r1 = r1.lastChecked     // Catch: java.lang.Throwable -> L78
            long r0 = r0 - r1
            long r1 = lombok.core.configuration.FileSystemSourceCache.RECHECK_FILESYSTEM     // Catch: java.lang.Throwable -> L78
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L34
            r0 = r11
            lombok.core.configuration.ConfigurationSource r0 = r0.source     // Catch: java.lang.Throwable -> L78
            r1 = r12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L78
            return r0
        L34:
            r0 = r11
            r1 = r9
            r0.lastChecked = r1     // Catch: java.lang.Throwable -> L78
            r0 = r11
            long r0 = r0.lastModified     // Catch: java.lang.Throwable -> L78
            r13 = r0
            r0 = r11
            r1 = r7
            long r1 = r1.getLastModifiedOrMissing()     // Catch: java.lang.Throwable -> L78
            r0.lastModified = r1     // Catch: java.lang.Throwable -> L78
            r0 = r11
            long r0 = r0.lastModified     // Catch: java.lang.Throwable -> L78
            r1 = r13
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L6f
            r0 = r11
            r1 = r11
            long r1 = r1.lastModified     // Catch: java.lang.Throwable -> L78
            r2 = -88
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L67
            r1 = 0
            goto L6c
        L67:
            r1 = r7
            r2 = r8
            lombok.core.configuration.ConfigurationSource r1 = lombok.core.configuration.SingleConfigurationSource.parse(r1, r2)     // Catch: java.lang.Throwable -> L78
        L6c:
            r0.source = r1     // Catch: java.lang.Throwable -> L78
        L6f:
            r0 = r11
            lombok.core.configuration.ConfigurationSource r0 = r0.source     // Catch: java.lang.Throwable -> L78
            r1 = r12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L78
            return r0
        L78:
            r1 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L78
    }

    private lombok.core.configuration.FileSystemSourceCache.Content ensureContent(lombok.core.configuration.ConfigurationFile r5) {
            r4 = this;
            r0 = r4
            java.util.concurrent.ConcurrentMap<lombok.core.configuration.ConfigurationFile, lombok.core.configuration.FileSystemSourceCache$Content> r0 = r0.fileCache
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            lombok.core.configuration.FileSystemSourceCache$Content r0 = (lombok.core.configuration.FileSystemSourceCache.Content) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L14
            r0 = r6
            return r0
        L14:
            r0 = r4
            java.util.concurrent.ConcurrentMap<lombok.core.configuration.ConfigurationFile, lombok.core.configuration.FileSystemSourceCache$Content> r0 = r0.fileCache
            r1 = r5
            lombok.core.configuration.FileSystemSourceCache$Content r2 = lombok.core.configuration.FileSystemSourceCache.Content.empty()
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            r0 = r4
            java.util.concurrent.ConcurrentMap<lombok.core.configuration.ConfigurationFile, lombok.core.configuration.FileSystemSourceCache$Content> r0 = r0.fileCache
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            lombok.core.configuration.FileSystemSourceCache$Content r0 = (lombok.core.configuration.FileSystemSourceCache.Content) r0
            return r0
    }

    static /* synthetic */ lombok.core.configuration.ConfigurationSource access$0(lombok.core.configuration.FileSystemSourceCache r4, lombok.core.configuration.ConfigurationFile r5, lombok.core.configuration.ConfigurationParser r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            lombok.core.configuration.ConfigurationSource r0 = r0.parseIfNeccesary(r1, r2)
            return r0
    }
}
