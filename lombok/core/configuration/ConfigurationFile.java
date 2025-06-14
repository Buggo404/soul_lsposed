package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationFile.SCL.lombok */
public abstract class ConfigurationFile {
    private static final java.util.regex.Pattern VARIABLE = null;
    private static final java.lang.String LOMBOK_CONFIG_FILENAME = "lombok.config";
    private static final java.util.Map<java.lang.String, java.lang.String> ENV = null;
    private static final java.lang.ThreadLocal<byte[]> buffers = null;
    private final java.lang.String identifier;


    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationFile$ArchivedConfigurationFile.SCL.lombok */
    private static class ArchivedConfigurationFile extends lombok.core.configuration.ConfigurationFile {
        private static final java.net.URI ROOT1 = null;
        private static final java.net.URI ROOT2 = null;
        private static final java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> locks = null;
        private final java.io.File archive;
        private final java.net.URI file;
        private final java.lang.Object lock;
        private long lastModified;
        private java.lang.String contents;

        static {
                java.lang.String r0 = "http://x.y/a/"
                java.net.URI r0 = java.net.URI.create(r0)
                lombok.core.configuration.ConfigurationFile.ArchivedConfigurationFile.ROOT1 = r0
                java.lang.String r0 = "ftp://y.x/b/"
                java.net.URI r0 = java.net.URI.create(r0)
                lombok.core.configuration.ConfigurationFile.ArchivedConfigurationFile.ROOT2 = r0
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r1 = r0
                r1.<init>()
                lombok.core.configuration.ConfigurationFile.ArchivedConfigurationFile.locks = r0
                return
        }

        public static lombok.core.configuration.ConfigurationFile create(java.io.File r8, java.net.URI r9) {
                r0 = r9
                boolean r0 = isRelative(r0)
                if (r0 != 0) goto L9
                r0 = 0
                return r0
            L9:
                lombok.core.configuration.ConfigurationFile$ArchivedConfigurationFile r0 = new lombok.core.configuration.ConfigurationFile$ArchivedConfigurationFile
                r1 = r0
                r2 = r8
                r3 = r9
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r5 = r4
                r6 = r8
                java.lang.String r6 = r6.getPath()
                java.lang.String r6 = java.lang.String.valueOf(r6)
                r5.<init>(r6)
                java.lang.String r5 = "!"
                java.lang.StringBuilder r4 = r4.append(r5)
                r5 = r9
                java.lang.String r5 = r5.getPath()
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.String r4 = r4.toString()
                r1.<init>(r2, r3, r4)
                return r0
        }

        static boolean isRelative(java.net.URI r3) {
                java.net.URI r0 = lombok.core.configuration.ConfigurationFile.ArchivedConfigurationFile.ROOT1     // Catch: java.lang.Exception -> L30
                r1 = r3
                java.net.URI r0 = r0.resolve(r1)     // Catch: java.lang.Exception -> L30
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L30
                java.net.URI r1 = lombok.core.configuration.ConfigurationFile.ArchivedConfigurationFile.ROOT1     // Catch: java.lang.Exception -> L30
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L30
                boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L30
                if (r0 == 0) goto L2e
                java.net.URI r0 = lombok.core.configuration.ConfigurationFile.ArchivedConfigurationFile.ROOT2     // Catch: java.lang.Exception -> L30
                r1 = r3
                java.net.URI r0 = r0.resolve(r1)     // Catch: java.lang.Exception -> L30
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L30
                java.net.URI r1 = lombok.core.configuration.ConfigurationFile.ArchivedConfigurationFile.ROOT2     // Catch: java.lang.Exception -> L30
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L30
                boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L30
                if (r0 == 0) goto L2e
                r0 = 1
                return r0
            L2e:
                r0 = 0
                return r0
            L30:
                r0 = 0
                return r0
        }

        ArchivedConfigurationFile(java.io.File r6, java.net.URI r7, java.lang.String r8) {
                r5 = this;
                r0 = r5
                r1 = r8
                r2 = 0
                r0.<init>(r1, r2)
                r0 = r5
                r1 = -2
                r0.lastModified = r1
                r0 = r5
                r1 = r6
                r0.archive = r1
                r0 = r5
                r1 = r7
                r0.file = r1
                java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> r0 = lombok.core.configuration.ConfigurationFile.ArchivedConfigurationFile.locks
                r1 = r6
                java.lang.String r1 = r1.getPath()
                java.lang.Object r2 = new java.lang.Object
                r3 = r2
                r3.<init>()
                java.lang.Object r0 = r0.putIfAbsent(r1, r2)
                r0 = r5
                java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> r1 = lombok.core.configuration.ConfigurationFile.ArchivedConfigurationFile.locks
                r2 = r6
                java.lang.String r2 = r2.getPath()
                java.lang.Object r1 = r1.get(r2)
                r0.lock = r1
                return
        }

        @Override // lombok.core.configuration.ConfigurationFile
        long getLastModifiedOrMissing() {
                r3 = this;
                r0 = r3
                java.io.File r0 = r0.archive
                long r0 = getLastModifiedOrMissing(r0)
                return r0
        }

        @Override // lombok.core.configuration.ConfigurationFile
        boolean exists() {
                r3 = this;
                r0 = r3
                java.io.File r0 = r0.archive
                boolean r0 = lombok.core.configuration.ConfigurationFile.access$1(r0)
                if (r0 != 0) goto Lc
                r0 = 0
                return r0
            Lc:
                r0 = r3
                java.lang.Object r0 = r0.lock
                r1 = r0
                r4 = r1
                monitor-enter(r0)
                r0 = r3
                r0.readIfNeccesary()     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2b
                r0 = r3
                java.lang.String r0 = r0.contents     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L2b
                if (r0 == 0) goto L22
                r0 = 1
                goto L23
            L22:
                r0 = 0
            L23:
                r1 = r4
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
                return r0
            L26:
                r0 = r4
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                r0 = 0
                return r0
            L2b:
                r1 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
                throw r0     // Catch: java.lang.Throwable -> L2b
        }

        @Override // lombok.core.configuration.ConfigurationFile
        java.lang.CharSequence contents() throws java.io.IOException {
                r3 = this;
                r0 = r3
                java.lang.Object r0 = r0.lock
                r1 = r0
                r4 = r1
                monitor-enter(r0)
                r0 = r3
                r0.readIfNeccesary()     // Catch: java.lang.Throwable -> L12
                r0 = r3
                java.lang.String r0 = r0.contents     // Catch: java.lang.Throwable -> L12
                r1 = r4
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
                return r0
            L12:
                r1 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
                throw r0     // Catch: java.lang.Throwable -> L12
        }

        void readIfNeccesary() throws java.io.IOException {
                r5 = this;
                r0 = r5
                long r0 = r0.getLastModifiedOrMissing()
                r6 = r0
                r0 = r6
                r1 = r5
                long r1 = r1.lastModified
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto Lf
                return
            Lf:
                r0 = r5
                r1 = 0
                r0.contents = r1
                r0 = r5
                r1 = r6
                r0.lastModified = r1
                r0 = r6
                r1 = -88
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L22
                return
            L22:
                r0 = r5
                r1 = r5
                java.lang.String r1 = r1.read()
                r0.contents = r1
                return
        }

        private java.lang.String read() throws java.io.IOException {
                r4 = this;
                java.io.FileInputStream r0 = new java.io.FileInputStream
                r1 = r0
                r2 = r4
                java.io.File r2 = r2.archive
                r1.<init>(r2)
                r5 = r0
                java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> L53
                r1 = r0
                r2 = r5
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L53
                r6 = r0
            L15:
                r0 = r6
                java.util.zip.ZipEntry r0 = r0.getNextEntry()     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L53
                r7 = r0
                r0 = r7
                if (r0 != 0) goto L28
                r0 = r6
                r0.close()     // Catch: java.lang.Throwable -> L53
                r0 = r5
                r0.close()
                r0 = 0
                return r0
            L28:
                r0 = r7
                java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L53
                r1 = r4
                java.net.URI r1 = r1.file     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L53
                java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L53
                boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L53
                if (r0 == 0) goto L15
                r0 = r6
                java.lang.String r0 = lombok.core.configuration.ConfigurationFile.access$2(r0)     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L53
                r9 = r0
                r0 = r6
                r0.close()     // Catch: java.lang.Throwable -> L53
                r0 = r5
                r0.close()
                r0 = r9
                return r0
            L4a:
                r8 = move-exception
                r0 = r6
                r0.close()     // Catch: java.lang.Throwable -> L53
                r0 = r8
                throw r0     // Catch: java.lang.Throwable -> L53
            L53:
                r10 = move-exception
                r0 = r5
                r0.close()
                r0 = r10
                throw r0
        }

        @Override // lombok.core.configuration.ConfigurationFile
        public lombok.core.configuration.ConfigurationFile resolve(java.lang.String r4) {
                r3 = this;
                r0 = r3
                java.net.URI r0 = r0.file     // Catch: java.lang.Exception -> L1b
                r1 = r4
                java.net.URI r0 = r0.resolve(r1)     // Catch: java.lang.Exception -> L1b
                r5 = r0
                r0 = r5
                boolean r0 = isRelative(r0)     // Catch: java.lang.Exception -> L1b
                if (r0 != 0) goto L12
                r0 = 0
                return r0
            L12:
                r0 = r3
                java.io.File r0 = r0.archive     // Catch: java.lang.Exception -> L1b
                r1 = r5
                lombok.core.configuration.ConfigurationFile r0 = create(r0, r1)     // Catch: java.lang.Exception -> L1b
                return r0
            L1b:
                r0 = 0
                return r0
        }

        @Override // lombok.core.configuration.ConfigurationFile
        lombok.core.configuration.ConfigurationFile parent() {
                r2 = this;
                r0 = 0
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationFile$CharSequenceConfigurationFile.SCL.lombok */
    private static class CharSequenceConfigurationFile extends lombok.core.configuration.ConfigurationFile {
        private final java.lang.CharSequence contents;
        private final long lastModified;

        private CharSequenceConfigurationFile(java.lang.String r5, java.lang.CharSequence r6, long r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = 0
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r6
                r0.contents = r1
                r0 = r4
                r1 = r7
                r0.lastModified = r1
                return
        }

        @Override // lombok.core.configuration.ConfigurationFile
        long getLastModifiedOrMissing() {
                r3 = this;
                r0 = r3
                long r0 = r0.lastModified
                return r0
        }

        @Override // lombok.core.configuration.ConfigurationFile
        java.lang.CharSequence contents() throws java.io.IOException {
                r2 = this;
                r0 = r2
                java.lang.CharSequence r0 = r0.contents
                return r0
        }

        @Override // lombok.core.configuration.ConfigurationFile
        boolean exists() {
                r2 = this;
                r0 = 1
                return r0
        }

        @Override // lombok.core.configuration.ConfigurationFile
        public lombok.core.configuration.ConfigurationFile resolve(java.lang.String r3) {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // lombok.core.configuration.ConfigurationFile
        lombok.core.configuration.ConfigurationFile parent() {
                r2 = this;
                r0 = 0
                return r0
        }

        /* synthetic */ CharSequenceConfigurationFile(java.lang.String r7, java.lang.CharSequence r8, long r9, lombok.core.configuration.ConfigurationFile.CharSequenceConfigurationFile r11) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r0.<init>(r1, r2, r3)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationFile$RegularConfigurationFile.SCL.lombok */
    private static class RegularConfigurationFile extends lombok.core.configuration.ConfigurationFile {
        private final java.io.File file;

        private RegularConfigurationFile(java.io.File r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                java.lang.String r1 = r1.getPath()
                r2 = 0
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r5
                r0.file = r1
                return
        }

        @Override // lombok.core.configuration.ConfigurationFile
        boolean exists() {
                r2 = this;
                r0 = r2
                java.io.File r0 = r0.file
                boolean r0 = lombok.core.configuration.ConfigurationFile.access$1(r0)
                return r0
        }

        @Override // lombok.core.configuration.ConfigurationFile
        public lombok.core.configuration.ConfigurationFile resolve(java.lang.String r5) {
                r4 = this;
                r0 = r5
                java.lang.String r1 = "!"
                boolean r0 = r0.endsWith(r1)
                if (r0 == 0) goto Lb
                r0 = 0
                return r0
            Lb:
                r0 = r5
                java.lang.String r1 = "!"
                java.lang.String[] r0 = r0.split(r1)
                r6 = r0
                r0 = r6
                int r0 = r0.length
                r1 = 2
                if (r0 <= r1) goto L1a
                r0 = 0
                return r0
            L1a:
                r0 = r6
                r1 = 0
                r0 = r0[r1]
                r7 = r0
                r0 = r4
                r1 = r7
                java.lang.String r1 = replaceEnvironmentVariables(r1)
                java.io.File r0 = r0.resolveFile(r1)
                r8 = r0
                r0 = r7
                java.lang.String r1 = ".zip"
                boolean r0 = r0.endsWith(r1)
                if (r0 != 0) goto L3a
                r0 = r7
                java.lang.String r1 = ".jar"
                boolean r0 = r0.endsWith(r1)
                if (r0 == 0) goto L54
            L3a:
                r0 = r8
                r1 = r6
                int r1 = r1.length     // Catch: java.lang.Exception -> L51
                r2 = 1
                if (r1 != r2) goto L47
                java.lang.String r1 = "lombok.config"
                goto L4a
            L47:
                r1 = r6
                r2 = 1
                r1 = r1[r2]     // Catch: java.lang.Exception -> L51
            L4a:
                java.net.URI r1 = java.net.URI.create(r1)     // Catch: java.lang.Exception -> L51
                lombok.core.configuration.ConfigurationFile r0 = lombok.core.configuration.ConfigurationFile.ArchivedConfigurationFile.create(r0, r1)     // Catch: java.lang.Exception -> L51
                return r0
            L51:
                r0 = 0
                return r0
            L54:
                r0 = r6
                int r0 = r0.length
                r1 = 1
                if (r0 <= r1) goto L5c
                r0 = 0
                return r0
            L5c:
                r0 = r8
                if (r0 != 0) goto L65
                r0 = 0
                goto L6a
            L65:
                r0 = r8
                lombok.core.configuration.ConfigurationFile r0 = forFile(r0)
            L6a:
                return r0
        }

        private java.io.File resolveFile(java.lang.String r6) {
                r5 = this;
                r0 = 0
                r7 = r0
                r0 = r6
                r1 = 58
                int r0 = r0.indexOf(r1)
                r8 = r0
                r0 = r8
                r1 = -1
                if (r0 == r1) goto L3e
                r0 = r8
                r1 = 1
                if (r0 != r1) goto L20
                r0 = r6
                r1 = 58
                r2 = r8
                r3 = 1
                int r2 = r2 + r3
                int r0 = r0.indexOf(r1, r2)
                r1 = -1
                if (r0 == r1) goto L22
            L20:
                r0 = 0
                return r0
            L22:
                r0 = r6
                r1 = 0
                char r0 = r0.charAt(r1)
                char r0 = java.lang.Character.toLowerCase(r0)
                r9 = r0
                r0 = r9
                r1 = 97
                if (r0 < r1) goto L3a
                r0 = r9
                r1 = 122(0x7a, float:1.71E-43)
                if (r0 <= r1) goto L3c
            L3a:
                r0 = 0
                return r0
            L3c:
                r0 = 1
                r7 = r0
            L3e:
                r0 = r6
                r1 = 0
                char r0 = r0.charAt(r1)
                r1 = 47
                if (r0 != r1) goto L4a
                r0 = 1
                r7 = r0
            L4a:
                r0 = r7
                if (r0 == 0) goto L59
                java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L6c
                r1 = r0
                r2 = r6
                r1.<init>(r2)     // Catch: java.lang.Exception -> L6c
                goto L6b
            L59:
                java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L6c
                r1 = r0
                r2 = r5
                java.io.File r2 = r2.file     // Catch: java.lang.Exception -> L6c
                java.net.URI r2 = r2.toURI()     // Catch: java.lang.Exception -> L6c
                r3 = r6
                java.net.URI r2 = r2.resolve(r3)     // Catch: java.lang.Exception -> L6c
                r1.<init>(r2)     // Catch: java.lang.Exception -> L6c
            L6b:
                return r0
            L6c:
                r0 = 0
                return r0
        }

        @Override // lombok.core.configuration.ConfigurationFile
        long getLastModifiedOrMissing() {
                r3 = this;
                r0 = r3
                java.io.File r0 = r0.file
                long r0 = getLastModifiedOrMissing(r0)
                return r0
        }

        @Override // lombok.core.configuration.ConfigurationFile
        java.lang.CharSequence contents() throws java.io.IOException {
                r4 = this;
                java.io.FileInputStream r0 = new java.io.FileInputStream
                r1 = r0
                r2 = r4
                java.io.File r2 = r2.file
                r1.<init>(r2)
                r5 = r0
                r0 = r5
                java.lang.String r0 = lombok.core.configuration.ConfigurationFile.access$2(r0)     // Catch: java.lang.Throwable -> L17
                r7 = r0
                r0 = r5
                r0.close()
                r0 = r7
                return r0
            L17:
                r6 = move-exception
                r0 = r5
                r0.close()
                r0 = r6
                throw r0
        }

        @Override // lombok.core.configuration.ConfigurationFile
        lombok.core.configuration.ConfigurationFile parent() {
                r2 = this;
                r0 = r2
                java.io.File r0 = r0.file
                java.io.File r0 = r0.getParentFile()
                java.io.File r0 = r0.getParentFile()
                r3 = r0
                r0 = r3
                if (r0 != 0) goto L13
                r0 = 0
                goto L17
            L13:
                r0 = r3
                lombok.core.configuration.ConfigurationFile r0 = forDirectory(r0)
            L17:
                return r0
        }

        private static java.lang.String replaceEnvironmentVariables(java.lang.String r4) {
                r0 = 0
                r5 = r0
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r1 = r0
                r1.<init>()
                r6 = r0
                r0 = r4
                java.lang.String r1 = "~"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L21
                r0 = 1
                r5 = r0
                r0 = r6
                java.lang.String r1 = "user.home"
                java.lang.String r2 = "~"
                java.lang.String r1 = java.lang.System.getProperty(r1, r2)
                java.lang.StringBuffer r0 = r0.append(r1)
            L21:
                java.util.regex.Pattern r0 = lombok.core.configuration.ConfigurationFile.access$3()
                r1 = r4
                r2 = r5
                java.lang.String r1 = r1.substring(r2)
                java.util.regex.Matcher r0 = r0.matcher(r1)
                r7 = r0
                goto L6b
            L30:
                r0 = r7
                r1 = 1
                java.lang.String r0 = r0.group(r1)
                r8 = r0
                java.util.Map r0 = lombok.core.configuration.ConfigurationFile.access$4()
                r1 = r8
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                r9 = r0
                r0 = r9
                if (r0 != 0) goto L63
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = "<"
                r1.<init>(r2)
                r1 = r8
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ">"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r9 = r0
            L63:
                r0 = r7
                r1 = r6
                r2 = r9
                java.util.regex.Matcher r0 = r0.appendReplacement(r1, r2)
            L6b:
                r0 = r7
                boolean r0 = r0.find()
                if (r0 != 0) goto L30
                r0 = r7
                r1 = r6
                java.lang.StringBuffer r0 = r0.appendTail(r1)
                r0 = r6
                java.lang.String r0 = r0.toString()
                return r0
        }

        /* synthetic */ RegularConfigurationFile(java.io.File r4, lombok.core.configuration.ConfigurationFile.RegularConfigurationFile r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }
    }

    static {
            java.lang.String r0 = "\\<(.+?)\\>"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            lombok.core.configuration.ConfigurationFile.VARIABLE = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            java.util.Map r2 = java.lang.System.getenv()
            r1.<init>(r2)
            lombok.core.configuration.ConfigurationFile.ENV = r0
            lombok.core.configuration.ConfigurationFile$1 r0 = new lombok.core.configuration.ConfigurationFile$1
            r1 = r0
            r1.<init>()
            lombok.core.configuration.ConfigurationFile.buffers = r0
            return
    }

    static void setEnvironment(java.lang.String r4, java.lang.String r5) {
            java.util.Map<java.lang.String, java.lang.String> r0 = lombok.core.configuration.ConfigurationFile.ENV
            r1 = r4
            r2 = r5
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    public static lombok.core.configuration.ConfigurationFile forFile(java.io.File r5) {
            lombok.core.configuration.ConfigurationFile$RegularConfigurationFile r0 = new lombok.core.configuration.ConfigurationFile$RegularConfigurationFile
            r1 = r0
            r2 = r5
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static lombok.core.configuration.ConfigurationFile forDirectory(java.io.File r5) {
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r5
            java.lang.String r3 = "lombok.config"
            r1.<init>(r2, r3)
            lombok.core.configuration.ConfigurationFile r0 = forFile(r0)
            return r0
    }

    public static lombok.core.configuration.ConfigurationFile fromCharSequence(java.lang.String r8, java.lang.CharSequence r9, long r10) {
            lombok.core.configuration.ConfigurationFile$CharSequenceConfigurationFile r0 = new lombok.core.configuration.ConfigurationFile$CharSequenceConfigurationFile
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    private ConfigurationFile(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.identifier = r1
            return
    }

    abstract long getLastModifiedOrMissing();

    abstract boolean exists();

    abstract java.lang.CharSequence contents() throws java.io.IOException;

    public abstract lombok.core.configuration.ConfigurationFile resolve(java.lang.String r1);

    abstract lombok.core.configuration.ConfigurationFile parent();

    final java.lang.String description() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.identifier
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof lombok.core.configuration.ConfigurationFile
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r3
            java.lang.String r0 = r0.identifier
            r1 = r4
            lombok.core.configuration.ConfigurationFile r1 = (lombok.core.configuration.ConfigurationFile) r1
            java.lang.String r1 = r1.identifier
            boolean r0 = r0.equals(r1)
            return r0
    }

    public final int hashCode() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.identifier
            int r0 = r0.hashCode()
            return r0
    }

    public static long getLastModifiedOrMissing(java.io.File r3) {
            r0 = r3
            boolean r0 = fileExists(r0)
            if (r0 != 0) goto Lb
            r0 = -88
            return r0
        Lb:
            r0 = r3
            long r0 = r0.lastModified()
            return r0
    }

    private static boolean fileExists(java.io.File r2) {
            r0 = r2
            boolean r0 = r0.exists()
            if (r0 == 0) goto L10
            r0 = r2
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    private static java.lang.String read(java.io.InputStream r5) throws java.io.IOException {
            java.lang.ThreadLocal<byte[]> r0 = lombok.core.configuration.ConfigurationFile.buffers
            java.lang.Object r0 = r0.get()
            byte[] r0 = (byte[]) r0
            r6 = r0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = r0
            r1.<init>()
            r7 = r0
        L12:
            r0 = r5
            r1 = r6
            int r0 = r0.read(r1)
            r8 = r0
            r0 = r8
            r1 = -1
            if (r0 != r1) goto L20
            goto L2a
        L20:
            r0 = r7
            r1 = r6
            r2 = 0
            r3 = r8
            r0.write(r1, r2, r3)
            goto L12
        L2a:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r7
            byte[] r2 = r2.toByteArray()
            java.lang.String r3 = "UTF-8"
            r1.<init>(r2, r3)
            return r0
    }

    /* synthetic */ ConfigurationFile(java.lang.String r4, lombok.core.configuration.ConfigurationFile r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    static /* synthetic */ boolean access$1(java.io.File r2) {
            r0 = r2
            boolean r0 = fileExists(r0)
            return r0
    }

    static /* synthetic */ java.lang.String access$2(java.io.InputStream r2) throws java.io.IOException {
            r0 = r2
            java.lang.String r0 = read(r0)
            return r0
    }

    static /* synthetic */ java.util.regex.Pattern access$3() {
            java.util.regex.Pattern r0 = lombok.core.configuration.ConfigurationFile.VARIABLE
            return r0
    }

    static /* synthetic */ java.util.Map access$4() {
            java.util.Map<java.lang.String, java.lang.String> r0 = lombok.core.configuration.ConfigurationFile.ENV
            return r0
    }
}
