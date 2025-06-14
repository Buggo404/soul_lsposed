package lombok.launch;

/* loaded from: classes.dex */
class ShadowClassLoader extends java.lang.ClassLoader {
    private static final java.lang.String SELF_NAME = "lombok/launch/ShadowClassLoader.class";
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> highlanderMap = null;
    private static final java.util.Map<java.lang.Object, java.util.Set<java.lang.String>> mapTrackerToJarContents = null;
    private static final java.util.Map<java.lang.Object, java.lang.String> mapTrackerToJarPath = null;
    private final java.lang.String SELF_BASE;
    private final java.io.File SELF_BASE_FILE;
    private final int SELF_BASE_LENGTH;
    private java.util.Map<java.lang.String, java.lang.Boolean> fileRootCache;
    private final java.util.List<java.lang.String> highlanders;
    private java.util.Map<java.lang.String, java.lang.Boolean> jarLocCache;
    private final java.util.Map<java.lang.String, java.lang.Object> mapJarPathToTracker;
    private final java.util.List<java.io.File> override;
    private final java.util.List<java.lang.String> parentExclusion;
    private final java.util.Set<java.lang.ClassLoader> prependedParentLoaders;
    private final java.lang.String sclSuffix;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            lombok.launch.ShadowClassLoader.highlanderMap = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            lombok.launch.ShadowClassLoader.mapTrackerToJarPath = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            lombok.launch.ShadowClassLoader.mapTrackerToJarContents = r0
            return
    }

    ShadowClassLoader(java.lang.ClassLoader r3, java.lang.String r4, java.lang.String r5, java.util.List<java.lang.String> r6, java.util.List<java.lang.String> r7) {
            r2 = this;
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.override = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.parentExclusion = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.highlanders = r3
            java.util.IdentityHashMap r3 = new java.util.IdentityHashMap
            r3.<init>()
            java.util.Set r3 = java.util.Collections.newSetFromMap(r3)
            r2.prependedParentLoaders = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.mapJarPathToTracker = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.fileRootCache = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.jarLocCache = r3
            r2.sclSuffix = r4
            if (r6 == 0) goto L72
            java.util.Iterator r3 = r6.iterator()
        L40:
            boolean r6 = r3.hasNext()
            if (r6 != 0) goto L47
            goto L72
        L47:
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "."
            java.lang.String r1 = "/"
            java.lang.String r6 = r6.replace(r0, r1)
            boolean r0 = r6.endsWith(r1)
            if (r0 != 0) goto L6c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0.<init>(r6)
            java.lang.StringBuilder r6 = r0.append(r1)
            java.lang.String r6 = r6.toString()
        L6c:
            java.util.List<java.lang.String> r0 = r2.parentExclusion
            r0.add(r6)
            goto L40
        L72:
            if (r7 == 0) goto L8b
            java.util.Iterator r3 = r7.iterator()
        L78:
            boolean r6 = r3.hasNext()
            if (r6 != 0) goto L7f
            goto L8b
        L7f:
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.List<java.lang.String> r7 = r2.highlanders
            r7.add(r6)
            goto L78
        L8b:
            r3 = 0
            if (r5 == 0) goto L97
            r2.SELF_BASE = r5
            int r5 = r5.length()
            r2.SELF_BASE_LENGTH = r5
            goto Lc5
        L97:
            java.lang.String r5 = "ShadowClassLoader.class"
            java.lang.Class<lombok.launch.ShadowClassLoader> r6 = lombok.launch.ShadowClassLoader.class
            java.net.URL r5 = r6.getResource(r5)
            if (r5 != 0) goto La3
            r5 = 0
            goto La7
        La3:
            java.lang.String r5 = r5.toString()
        La7:
            if (r5 == 0) goto L18e
            java.lang.String r7 = "lombok/launch/ShadowClassLoader.class"
            boolean r7 = r5.endsWith(r7)
            if (r7 != 0) goto Lb3
            goto L18e
        Lb3:
            int r6 = r5.length()
            int r6 = r6 + (-37)
            r2.SELF_BASE_LENGTH = r6
            java.lang.String r5 = r5.substring(r3, r6)
            java.lang.String r5 = urlDecode(r5)
            r2.SELF_BASE = r5
        Lc5:
            java.lang.String r5 = r2.SELF_BASE
            java.lang.String r6 = "jar:file:"
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto Lef
            java.lang.String r5 = r2.SELF_BASE
            java.lang.String r6 = "!/"
            boolean r5 = r5.endsWith(r6)
            if (r5 == 0) goto Lef
            java.io.File r5 = new java.io.File
            java.lang.String r6 = r2.SELF_BASE
            int r7 = r6.length()
            int r7 = r7 + (-2)
            r0 = 9
            java.lang.String r6 = r6.substring(r0, r7)
            r5.<init>(r6)
            r2.SELF_BASE_FILE = r5
            goto L111
        Lef:
            java.lang.String r5 = r2.SELF_BASE
            java.lang.String r6 = "file:"
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L108
            java.io.File r5 = new java.io.File
            java.lang.String r6 = r2.SELF_BASE
            r7 = 5
            java.lang.String r6 = r6.substring(r7)
            r5.<init>(r6)
            r2.SELF_BASE_FILE = r5
            goto L111
        L108:
            java.io.File r5 = new java.io.File
            java.lang.String r6 = r2.SELF_BASE
            r5.<init>(r6)
            r2.SELF_BASE_FILE = r5
        L111:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "shadow.override."
            r5.<init>(r6)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = java.lang.System.getProperty(r4)
            if (r4 == 0) goto L18d
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L18d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "\\s*"
            r5.<init>(r6)
            char r7 = java.io.File.pathSeparatorChar
            r0 = 59
            if (r7 != r0) goto L13c
            java.lang.String r7 = ";"
            goto L13e
        L13c:
            java.lang.String r7 = ":"
        L13e:
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            r6 = r3
        L150:
            if (r6 < r5) goto L153
            goto L18d
        L153:
            r7 = r4[r6]
            java.lang.String r0 = "/*"
            boolean r0 = r7.endsWith(r0)
            if (r0 != 0) goto L17d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.io.File.separator
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = "*"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = r7.endsWith(r0)
            if (r0 == 0) goto L179
            goto L17d
        L179:
            r2.addOverrideClasspathEntry(r7)
            goto L18a
        L17d:
            int r0 = r7.length()
            int r0 = r0 + (-2)
            java.lang.String r7 = r7.substring(r3, r0)
            r2.addOverrideJarDir(r7)
        L18a:
            int r6 = r6 + 1
            goto L150
        L18d:
            return
        L18e:
            java.lang.ClassLoader r3 = r6.getClassLoader()
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "ShadowLoader can't find itself. SCL loader type: "
            r5.<init>(r6)
            if (r3 != 0) goto L1a0
            java.lang.String r3 = "*NULL*"
            goto L1a8
        L1a0:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.toString()
        L1a8:
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    private boolean exclusionListMatch(java.lang.String r3) {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.parentExclusion
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto Le
            r3 = 0
            return r3
        Le:
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.startsWith(r1)
            if (r1 == 0) goto L6
            r3 = 1
            return r3
    }

    private java.util.Set<java.lang.String> getJarMemberSet(java.lang.String r5) {
            r4 = this;
            java.util.jar.JarFile r0 = new java.util.jar.JarFile     // Catch: java.lang.Exception -> L4a
            r0.<init>(r5)     // Catch: java.lang.Exception -> L4a
            int r5 = r0.size()     // Catch: java.lang.Exception -> L4a
            int r5 = java.lang.Integer.highestOneBit(r5)     // Catch: java.lang.Exception -> L4a
            int r1 = r0.size()     // Catch: java.lang.Exception -> L4a
            if (r5 == r1) goto L15
            int r5 = r5 << 1
        L15:
            r1 = 1
            if (r5 != 0) goto L19
            r5 = r1
        L19:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Exception -> L4a
            int r5 = r5 >> r1
            r1 = 2
            float r1 = (float) r1     // Catch: java.lang.Exception -> L4a
            r2.<init>(r5, r1)     // Catch: java.lang.Exception -> L4a
            java.util.Enumeration r5 = r0.entries()     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L44
        L25:
            boolean r1 = r5.hasMoreElements()     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L44
            if (r1 != 0) goto L2f
        L2b:
            r0.close()     // Catch: java.lang.Exception -> L4a
            goto L49
        L2f:
            java.lang.Object r1 = r5.nextElement()     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L44
            java.util.jar.JarEntry r1 = (java.util.jar.JarEntry) r1     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L44
            boolean r3 = r1.isDirectory()     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L44
            if (r3 == 0) goto L3c
            goto L25
        L3c:
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L44
            r2.add(r1)     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L44
            goto L25
        L44:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Exception -> L4a
            throw r5     // Catch: java.lang.Exception -> L4a
        L49:
            return r2
        L4a:
            java.util.Set r5 = java.util.Collections.emptySet()
            return r5
    }

    private java.util.Set<java.lang.String> getOrMakeJarListing(java.lang.String r5) {
            r4 = this;
            java.util.Map<java.lang.Object, java.lang.String> r0 = lombok.launch.ShadowClassLoader.mapTrackerToJarPath
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.mapJarPathToTracker     // Catch: java.lang.Throwable -> L62
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L15
            java.util.Map<java.lang.Object, java.util.Set<java.lang.String>> r5 = lombok.launch.ShadowClassLoader.mapTrackerToJarContents     // Catch: java.lang.Throwable -> L62
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> L62
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L62
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            return r5
        L15:
            java.util.Set r1 = r0.entrySet()     // Catch: java.lang.Throwable -> L62
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L62
        L1d:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L62
            if (r2 != 0) goto L3d
            java.lang.Object r1 = new java.lang.Object     // Catch: java.lang.Throwable -> L62
            r1.<init>()     // Catch: java.lang.Throwable -> L62
            java.util.Set r2 = r4.getJarMemberSet(r5)     // Catch: java.lang.Throwable -> L62
            java.util.Map<java.lang.Object, java.util.Set<java.lang.String>> r3 = lombok.launch.ShadowClassLoader.mapTrackerToJarContents     // Catch: java.lang.Throwable -> L62
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L62
            java.util.Map<java.lang.Object, java.lang.String> r3 = lombok.launch.ShadowClassLoader.mapTrackerToJarPath     // Catch: java.lang.Throwable -> L62
            r3.put(r1, r5)     // Catch: java.lang.Throwable -> L62
            java.util.Map<java.lang.String, java.lang.Object> r3 = r4.mapJarPathToTracker     // Catch: java.lang.Throwable -> L62
            r3.put(r5, r1)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            return r2
        L3d:
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L62
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L62
            java.lang.Object r3 = r2.getValue()     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L62
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L1d
            java.lang.Object r1 = r2.getKey()     // Catch: java.lang.Throwable -> L62
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.mapJarPathToTracker     // Catch: java.lang.Throwable -> L62
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L62
            java.util.Map<java.lang.Object, java.util.Set<java.lang.String>> r5 = lombok.launch.ShadowClassLoader.mapTrackerToJarContents     // Catch: java.lang.Throwable -> L62
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> L62
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L62
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            return r5
        L62:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            throw r5
    }

    private java.net.URL getResourceFromLocation(java.lang.String r7, java.lang.String r8, java.io.File r9) {
            r6 = this;
            java.lang.String r0 = "!/"
            java.lang.String r1 = "jar:"
            boolean r2 = r9.isDirectory()
            r3 = 0
            if (r2 == 0) goto L42
            if (r8 == 0) goto L27
            java.io.File r0 = new java.io.File     // Catch: java.net.MalformedURLException -> L41
            r0.<init>(r9, r8)     // Catch: java.net.MalformedURLException -> L41
            boolean r8 = r0.isFile()     // Catch: java.net.MalformedURLException -> L41
            if (r8 == 0) goto L27
            boolean r8 = r0.canRead()     // Catch: java.net.MalformedURLException -> L41
            if (r8 == 0) goto L27
            java.net.URI r7 = r0.toURI()     // Catch: java.net.MalformedURLException -> L41
            java.net.URL r7 = r7.toURL()     // Catch: java.net.MalformedURLException -> L41
            return r7
        L27:
            java.io.File r8 = new java.io.File     // Catch: java.net.MalformedURLException -> L41
            r8.<init>(r9, r7)     // Catch: java.net.MalformedURLException -> L41
            boolean r7 = r8.isFile()     // Catch: java.net.MalformedURLException -> L41
            if (r7 == 0) goto L41
            boolean r7 = r8.canRead()     // Catch: java.net.MalformedURLException -> L41
            if (r7 == 0) goto L41
            java.net.URI r7 = r8.toURI()     // Catch: java.net.MalformedURLException -> L41
            java.net.URL r7 = r7.toURL()     // Catch: java.net.MalformedURLException -> L41
            return r7
        L41:
            return r3
        L42:
            boolean r2 = r9.isFile()
            if (r2 == 0) goto Lb2
            boolean r2 = r9.canRead()
            if (r2 != 0) goto L4f
            goto Lb2
        L4f:
            java.io.File r9 = r9.getCanonicalFile()     // Catch: java.lang.Exception -> L54
            goto L58
        L54:
            java.io.File r9 = r9.getAbsoluteFile()
        L58:
            java.lang.String r2 = r9.getAbsolutePath()
            java.util.Set r2 = r6.getOrMakeJarListing(r2)
            java.net.URI r9 = r9.toURI()
            java.lang.String r9 = r9.toString()
            boolean r4 = r2.contains(r8)     // Catch: java.lang.Exception -> L8d
            if (r4 == 0) goto L8d
            java.net.URI r4 = new java.net.URI     // Catch: java.lang.Exception -> L8d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8d
            r5.<init>(r1)     // Catch: java.lang.Exception -> L8d
            java.lang.StringBuilder r5 = r5.append(r9)     // Catch: java.lang.Exception -> L8d
            java.lang.StringBuilder r5 = r5.append(r0)     // Catch: java.lang.Exception -> L8d
            java.lang.StringBuilder r8 = r5.append(r8)     // Catch: java.lang.Exception -> L8d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L8d
            r4.<init>(r8)     // Catch: java.lang.Exception -> L8d
            java.net.URL r7 = r4.toURL()     // Catch: java.lang.Exception -> L8d
            return r7
        L8d:
            boolean r8 = r2.contains(r7)     // Catch: java.lang.Exception -> Lb2
            if (r8 == 0) goto Lb2
            java.net.URI r8 = new java.net.URI     // Catch: java.lang.Exception -> Lb2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb2
            r2.<init>(r1)     // Catch: java.lang.Exception -> Lb2
            java.lang.StringBuilder r9 = r2.append(r9)     // Catch: java.lang.Exception -> Lb2
            java.lang.StringBuilder r9 = r9.append(r0)     // Catch: java.lang.Exception -> Lb2
            java.lang.StringBuilder r7 = r9.append(r7)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> Lb2
            r8.<init>(r7)     // Catch: java.lang.Exception -> Lb2
            java.net.URL r7 = r8.toURL()     // Catch: java.lang.Exception -> Lb2
            return r7
        Lb2:
            return r3
    }

    private java.net.URL getResourceSkippingSelf(java.lang.String r5) throws java.io.IOException {
            r4 = this;
            java.net.URL r0 = super.getResource(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r2 = r0.toString()
            boolean r2 = r4.partOfShadow(r2, r5)
            if (r2 != 0) goto L13
            return r0
        L13:
            java.util.Enumeration r0 = super.getResources(r5)
        L17:
            boolean r2 = r0.hasMoreElements()
            if (r2 != 0) goto L1e
            return r1
        L1e:
            java.lang.Object r2 = r0.nextElement()
            java.net.URL r2 = (java.net.URL) r2
            java.lang.String r3 = r2.toString()
            boolean r3 = r4.partOfShadow(r3, r5)
            if (r3 != 0) goto L17
            return r2
    }

    private java.net.URL getResource_(java.lang.String r5, boolean r6) {
            r4 = this;
            java.lang.String r0 = ".class"
            boolean r0 = r5.endsWith(r0)
            r1 = 0
            if (r0 == 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r2 = r5.length()
            int r2 = r2 + (-6)
            r3 = 0
            java.lang.String r2 = r5.substring(r3, r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.<init>(r2)
            java.lang.String r2 = ".SCL."
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = r4.sclSuffix
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L2f
        L2e:
            r0 = r1
        L2f:
            java.util.List<java.io.File> r2 = r4.override
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L87
            java.util.List<java.io.File> r2 = r4.override
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L55
            if (r6 == 0) goto L46
            return r1
        L46:
            if (r0 == 0) goto L4f
            java.net.URL r6 = r4.getResourceSkippingSelf(r0)     // Catch: java.io.IOException -> L4f
            if (r6 == 0) goto L4f
            return r6
        L4f:
            java.net.URL r5 = r4.getResourceSkippingSelf(r5)     // Catch: java.io.IOException -> L54
            return r5
        L54:
            return r1
        L55:
            java.io.File r2 = r4.SELF_BASE_FILE
            java.net.URL r2 = r4.getResourceFromLocation(r5, r0, r2)
            if (r2 == 0) goto L5e
            return r2
        L5e:
            if (r0 == 0) goto L73
            java.net.URL r2 = super.getResource(r0)
            if (r2 == 0) goto L73
            if (r6 == 0) goto L72
            java.lang.String r3 = r2.toString()
            boolean r0 = r4.partOfShadow(r3, r0)
            if (r0 == 0) goto L73
        L72:
            return r2
        L73:
            java.net.URL r0 = super.getResource(r5)
            if (r0 == 0) goto L86
            if (r6 == 0) goto L85
            java.lang.String r6 = r0.toString()
            boolean r5 = r4.partOfShadow(r6, r5)
            if (r5 == 0) goto L86
        L85:
            return r0
        L86:
            return r1
        L87:
            java.lang.Object r3 = r2.next()
            java.io.File r3 = (java.io.File) r3
            java.net.URL r3 = r4.getResourceFromLocation(r5, r0, r3)
            if (r3 == 0) goto L35
            return r3
    }

    private boolean inOwnBase(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length()
            int r2 = r3.SELF_BASE_LENGTH
            int r5 = r5.length()
            int r2 = r2 + r5
            if (r1 != r2) goto L1d
            java.lang.String r5 = r3.SELF_BASE
            int r1 = r3.SELF_BASE_LENGTH
            boolean r4 = r5.regionMatches(r0, r4, r0, r1)
            if (r4 == 0) goto L1d
            r4 = 1
            return r4
        L1d:
            return r0
    }

    private boolean isPartOfShadowSuffix(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "file:/"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L4e
            r1 = 5
            java.lang.String r4 = r4.substring(r1)
            java.lang.String r4 = urlDecode(r4)
            int r1 = r4.length()
            int r2 = r5.length()
            if (r1 <= r2) goto L4d
            boolean r1 = r4.endsWith(r5)
            if (r1 == 0) goto L4d
            int r1 = r4.length()
            int r2 = r5.length()
            int r1 = r1 - r2
            int r1 = r1 + (-1)
            char r1 = r4.charAt(r1)
            r2 = 47
            if (r1 == r2) goto L39
            goto L4d
        L39:
            int r1 = r4.length()
            int r5 = r5.length()
            int r1 = r1 - r5
            int r1 = r1 + (-1)
            java.lang.String r4 = r4.substring(r0, r1)
            boolean r4 = r3.isPartOfShadowSuffixFileBased(r4, r6)
            return r4
        L4d:
            return r0
        L4e:
            java.lang.String r5 = "jar:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L6a
            r5 = 33
            int r5 = r4.indexOf(r5)
            r1 = -1
            if (r5 != r1) goto L60
            return r0
        L60:
            r0 = 4
            java.lang.String r4 = r4.substring(r0, r5)
            boolean r4 = r3.isPartOfShadowSuffixJarBased(r4, r6)
            return r4
        L6a:
            return r0
    }

    private boolean isPartOfShadowSuffixFileBased(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r5)
            r0.<init>(r1)
            java.lang.String r1 = "::"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = r4.fileRootCache
            java.lang.Object r1 = r1.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L26
            boolean r5 = r1.booleanValue()
            return r5
        L26:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r2.<init>(r5)
            java.lang.String r5 = "/META-INF/ShadowClassLoader"
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            r5 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.IOException -> L5a java.io.FileNotFoundException -> L64
            r2.<init>(r1)     // Catch: java.io.IOException -> L5a java.io.FileNotFoundException -> L64
            boolean r6 = sclFileContainsSuffix(r2, r6)     // Catch: java.lang.Throwable -> L55
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = r4.fileRootCache     // Catch: java.lang.Throwable -> L55
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L55
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> L55
            r2.close()     // Catch: java.io.IOException -> L5a java.io.FileNotFoundException -> L64
            return r6
        L55:
            r6 = move-exception
            r2.close()     // Catch: java.io.IOException -> L5a java.io.FileNotFoundException -> L64
            throw r6     // Catch: java.io.IOException -> L5a java.io.FileNotFoundException -> L64
        L5a:
            java.util.Map<java.lang.String, java.lang.Boolean> r6 = r4.fileRootCache
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            r6.put(r0, r1)
            return r5
        L64:
            java.util.Map<java.lang.String, java.lang.Boolean> r6 = r4.fileRootCache
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            r6.put(r0, r1)
            return r5
    }

    private boolean isPartOfShadowSuffixJarBased(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r0.<init>(r1)
            java.lang.String r1 = "::"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = r5.jarLocCache
            java.lang.Object r1 = r1.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L26
            boolean r6 = r1.booleanValue()
            return r6
        L26:
            java.lang.String r1 = "file:/"
            boolean r1 = r6.startsWith(r1)
            if (r1 == 0) goto L37
            r1 = 5
            java.lang.String r6 = r6.substring(r1)
            java.lang.String r6 = urlDecode(r6)
        L37:
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.IOException -> L83 java.io.FileNotFoundException -> L8d
            r2.<init>(r6)     // Catch: java.io.IOException -> L83 java.io.FileNotFoundException -> L8d
            java.util.zip.ZipInputStream r6 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> L7e
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L7e
        L42:
            java.util.zip.ZipEntry r3 = r6.getNextEntry()     // Catch: java.lang.Throwable -> L79
            if (r3 != 0) goto L58
            java.util.Map<java.lang.String, java.lang.Boolean> r7 = r5.jarLocCache     // Catch: java.lang.Throwable -> L79
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L79
            r7.put(r0, r3)     // Catch: java.lang.Throwable -> L79
            r6.close()     // Catch: java.lang.Throwable -> L7e
            r2.close()     // Catch: java.io.IOException -> L83 java.io.FileNotFoundException -> L8d
            return r1
        L58:
            java.lang.String r4 = "META-INF/ShadowClassLoader"
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L79
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L79
            if (r3 != 0) goto L65
            goto L42
        L65:
            boolean r7 = sclFileContainsSuffix(r6, r7)     // Catch: java.lang.Throwable -> L79
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r5.jarLocCache     // Catch: java.lang.Throwable -> L79
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L79
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> L79
            r6.close()     // Catch: java.lang.Throwable -> L7e
            r2.close()     // Catch: java.io.IOException -> L83 java.io.FileNotFoundException -> L8d
            return r7
        L79:
            r7 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L7e
            throw r7     // Catch: java.lang.Throwable -> L7e
        L7e:
            r6 = move-exception
            r2.close()     // Catch: java.io.IOException -> L83 java.io.FileNotFoundException -> L8d
            throw r6     // Catch: java.io.IOException -> L83 java.io.FileNotFoundException -> L8d
        L83:
            java.util.Map<java.lang.String, java.lang.Boolean> r6 = r5.jarLocCache
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r6.put(r0, r7)
            return r1
        L8d:
            java.util.Map<java.lang.String, java.lang.Boolean> r6 = r5.jarLocCache
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r6.put(r0, r7)
            return r1
    }

    private boolean partOfShadow(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "java/"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L20
            java.lang.String r0 = "sun/"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L20
            boolean r0 = r1.inOwnBase(r2, r3)
            if (r0 != 0) goto L1e
            java.lang.String r0 = r1.sclSuffix
            boolean r2 = r1.isPartOfShadowSuffix(r2, r3, r0)
            if (r2 == 0) goto L20
        L1e:
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
    }

    private static boolean sclFileContainsSuffix(java.io.InputStream r3, java.lang.String r4) throws java.io.IOException {
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.lang.String r2 = "UTF-8"
            r1.<init>(r3, r2)
            r0.<init>(r1)
        Lc:
            java.lang.String r3 = r0.readLine()
            r1 = 0
            if (r3 != 0) goto L14
            return r1
        L14:
            java.lang.String r3 = r3.trim()
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto Lc
            char r1 = r3.charAt(r1)
            r2 = 35
            if (r1 != r2) goto L27
            goto Lc
        L27:
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc
            r3 = 1
            return r3
    }

    private static java.lang.String urlDecode(java.lang.String r2) {
            java.lang.String r0 = "\\+"
            java.lang.String r1 = "%2B"
            java.lang.String r2 = r2.replaceAll(r0, r1)
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r0)     // Catch: java.io.UnsupportedEncodingException -> Lf
            return r2
        Lf:
            java.lang.InternalError r2 = new java.lang.InternalError
            java.lang.String r0 = "UTF-8 not supported"
            r2.<init>(r0)
            throw r2
    }

    private java.lang.Class<?> urlToDefineClass(java.lang.String r6, java.net.URL r7, boolean r8) throws java.lang.ClassNotFoundException {
            r5 = this;
            java.io.InputStream r7 = r7.openStream()     // Catch: java.io.IOException -> L64
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L5f
            r1 = 0
            r2 = r1
        La:
            int r3 = r0.length     // Catch: java.lang.Throwable -> L5f
            int r3 = r3 - r2
            int r3 = r7.read(r0, r2, r3)     // Catch: java.lang.Throwable -> L5f
            r4 = -1
            if (r3 != r4) goto L51
            r7.close()     // Catch: java.io.IOException -> L64
            java.lang.Class r7 = r5.defineClass(r6, r0, r1, r2)     // Catch: java.lang.LinkageError -> L1b
            goto L36
        L1b:
            r7 = move-exception
            java.util.List<java.lang.String> r0 = r5.highlanders
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L2f
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = lombok.launch.ShadowClassLoader.highlanderMap
            java.lang.Object r0 = r0.get(r6)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L2f
            return r0
        L2f:
            java.lang.Class r0 = r5.findLoadedClass(r6)     // Catch: java.lang.LinkageError -> L50
            if (r0 == 0) goto L4f
            r7 = r0
        L36:
            java.util.List<java.lang.String> r0 = r5.highlanders
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L49
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = lombok.launch.ShadowClassLoader.highlanderMap
            java.lang.Object r6 = r0.putIfAbsent(r6, r7)
            java.lang.Class r6 = (java.lang.Class) r6
            if (r6 == 0) goto L49
            r7 = r6
        L49:
            if (r8 == 0) goto L4e
            r5.resolveClass(r7)
        L4e:
            return r7
        L4f:
            throw r7
        L50:
            throw r7
        L51:
            int r2 = r2 + r3
            int r3 = r0.length     // Catch: java.lang.Throwable -> L5f
            if (r2 != r3) goto La
            int r3 = r0.length     // Catch: java.lang.Throwable -> L5f
            int r3 = r3 * 2
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L5f
            java.lang.System.arraycopy(r0, r1, r3, r1, r2)     // Catch: java.lang.Throwable -> L5f
            r0 = r3
            goto La
        L5f:
            r8 = move-exception
            r7.close()     // Catch: java.io.IOException -> L64
            throw r8     // Catch: java.io.IOException -> L64
        L64:
            r7 = move-exception
            java.lang.ClassNotFoundException r8 = new java.lang.ClassNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "I/O exception reading class "
            r0.<init>(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            r8.<init>(r6, r7)
            throw r8
    }

    public void addOverrideClasspathEntry(java.lang.String r3) {
            r2 = this;
            java.util.List<java.io.File> r0 = r2.override
            java.io.File r1 = new java.io.File
            r1.<init>(r3)
            r0.add(r1)
            return
    }

    public void addOverrideJarDir(java.lang.String r6) {
            r5 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            java.io.File[] r6 = r0.listFiles()
            int r0 = r6.length
            r1 = 0
        Lb:
            if (r1 < r0) goto Le
            return
        Le:
            r2 = r6[r1]
            java.lang.String r3 = r2.getName()
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r4 = ".jar"
            boolean r3 = r3.endsWith(r4)
            if (r3 == 0) goto L31
            boolean r3 = r2.canRead()
            if (r3 == 0) goto L31
            boolean r3 = r2.isFile()
            if (r3 == 0) goto L31
            java.util.List<java.io.File> r3 = r5.override
            r3.add(r2)
        L31:
            int r1 = r1 + 1
            goto Lb
    }

    @Override // java.lang.ClassLoader
    public java.net.URL getResource(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.net.URL r2 = r1.getResource_(r2, r0)
            return r2
    }

    @Override // java.lang.ClassLoader
    public java.util.Enumeration<java.net.URL> getResources(java.lang.String r7) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = ".class"
            boolean r0 = r7.endsWith(r0)
            if (r0 == 0) goto L2d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r7.length()
            int r1 = r1 + (-6)
            r2 = 0
            java.lang.String r1 = r7.substring(r2, r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = ".SCL."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r6.sclSuffix
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L2e
        L2d:
            r0 = 0
        L2e:
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            java.util.List<java.io.File> r2 = r6.override
            java.util.Iterator r2 = r2.iterator()
        L39:
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L9a
            java.util.List<java.io.File> r2 = r6.override
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L52
            java.io.File r2 = r6.SELF_BASE_FILE
            java.net.URL r2 = r6.getResourceFromLocation(r7, r0, r2)
            if (r2 == 0) goto L52
            r1.add(r2)
        L52:
            java.util.Enumeration r3 = super.getResources(r7)
        L56:
            boolean r2 = r3.hasMoreElements()
            if (r2 != 0) goto L84
            if (r0 == 0) goto L7f
            java.util.Enumeration r7 = super.getResources(r0)
        L62:
            boolean r2 = r7.hasMoreElements()
            if (r2 != 0) goto L69
            goto L7f
        L69:
            java.lang.Object r2 = r7.nextElement()
            java.net.URL r2 = (java.net.URL) r2
            java.lang.String r3 = r2.toString()
            java.lang.String r4 = r6.sclSuffix
            boolean r3 = r6.isPartOfShadowSuffix(r3, r0, r4)
            if (r3 == 0) goto L62
            r1.add(r2)
            goto L62
        L7f:
            java.util.Enumeration r7 = r1.elements()
            return r7
        L84:
            java.lang.Object r2 = r3.nextElement()
            java.net.URL r2 = (java.net.URL) r2
            java.lang.String r4 = r2.toString()
            java.lang.String r5 = r6.sclSuffix
            boolean r4 = r6.isPartOfShadowSuffix(r4, r7, r5)
            if (r4 == 0) goto L56
            r1.add(r2)
            goto L56
        L9a:
            java.lang.Object r3 = r2.next()
            java.io.File r3 = (java.io.File) r3
            java.net.URL r3 = r6.getResourceFromLocation(r7, r0, r3)
            if (r3 == 0) goto L39
            r1.add(r3)
            goto L39
    }

    @Override // java.lang.ClassLoader
    public java.lang.Class<?> loadClass(java.lang.String r7, boolean r8) throws java.lang.ClassNotFoundException {
            r6 = this;
            java.lang.Class r0 = r6.findLoadedClass(r7)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.util.List<java.lang.String> r0 = r6.highlanders
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L1a
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = lombok.launch.ShadowClassLoader.highlanderMap
            java.lang.Object r0 = r0.get(r7)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L1a
            return r0
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "."
            java.lang.String r2 = "/"
            java.lang.String r3 = r7.replace(r1, r2)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.<init>(r3)
            java.lang.String r3 = ".class"
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = 1
            java.net.URL r4 = r6.getResource_(r0, r3)
            if (r4 != 0) goto L92
            boolean r0 = r6.exclusionListMatch(r0)
            if (r0 != 0) goto L92
            java.util.Set<java.lang.ClassLoader> r0 = r6.prependedParentLoaders     // Catch: java.lang.ClassNotFoundException -> L60
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.ClassNotFoundException -> L60
        L48:
            boolean r4 = r0.hasNext()     // Catch: java.lang.ClassNotFoundException -> L60
            if (r4 != 0) goto L53
            java.lang.Class r7 = super.loadClass(r7, r8)     // Catch: java.lang.ClassNotFoundException -> L60
            return r7
        L53:
            java.lang.Object r4 = r0.next()     // Catch: java.lang.ClassNotFoundException -> L60
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch: java.lang.ClassNotFoundException -> L60
            java.lang.Class r4 = r4.loadClass(r7)     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L48
            return r4
        L60:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "secondaryLoading.SCL."
            r4.<init>(r5)
            java.lang.String r5 = r6.sclSuffix
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r1 = r7.replace(r1, r2)
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.String r2 = ".SCL."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r6.sclSuffix
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.net.URL r4 = r6.getResource_(r1, r3)
            if (r4 == 0) goto L91
            goto L92
        L91:
            throw r0
        L92:
            if (r4 == 0) goto L99
            java.lang.Class r7 = r6.urlToDefineClass(r7, r4, r8)
            return r7
        L99:
            java.lang.ClassNotFoundException r8 = new java.lang.ClassNotFoundException
            r8.<init>(r7)
            throw r8
    }

    public void prependParent(java.lang.ClassLoader r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.ClassLoader r0 = r1.getParent()
            if (r2 != r0) goto La
            return
        La:
            java.util.Set<java.lang.ClassLoader> r0 = r1.prependedParentLoaders
            r0.add(r2)
            return
    }
}
