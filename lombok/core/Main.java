package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/Main.SCL.lombok */
public class Main {
    private static final java.util.Collection<?> HELP_SWITCHES = null;
    private final java.util.List<lombok.core.LombokApp> apps;
    private final java.util.List<java.lang.String> args;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/Main$LicenseApp.SCL.lombok */
    public static class LicenseApp extends lombok.core.LombokApp {
        public LicenseApp() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.core.LombokApp
        public java.lang.String getAppName() {
                r2 = this;
                java.lang.String r0 = "license"
                return r0
        }

        @Override // lombok.core.LombokApp
        public java.lang.String getAppDescription() {
                r2 = this;
                java.lang.String r0 = "prints license information."
                return r0
        }

        @Override // lombok.core.LombokApp
        public java.util.List<java.lang.String> getAppAliases() {
                r5 = this;
                r0 = 4
                java.lang.String[] r0 = new java.lang.String[r0]
                r1 = r0
                r2 = 0
                java.lang.String r3 = "licence"
                r1[r2] = r3
                r1 = r0
                r2 = 1
                java.lang.String r3 = "copyright"
                r1[r2] = r3
                r1 = r0
                r2 = 2
                java.lang.String r3 = "copyleft"
                r1[r2] = r3
                r1 = r0
                r2 = 3
                java.lang.String r3 = "gpl"
                r1[r2] = r3
                java.util.List r0 = java.util.Arrays.asList(r0)
                return r0
        }

        @Override // lombok.core.LombokApp
        public int runApp(java.util.List<java.lang.String> r6) {
                r5 = this;
                java.lang.Class<lombok.core.Main> r0 = lombok.core.Main.class
                java.lang.String r1 = "/LICENSE"
                java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch: java.lang.Exception -> L53
                r7 = r0
                java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L53
                r1 = r0
                r1.<init>()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L53
                r8 = r0
                r0 = 65536(0x10000, float:9.18355E-41)
                byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L53
                r9 = r0
            L16:
                r0 = r7
                r1 = r9
                int r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L53
                r10 = r0
                r0 = r10
                r1 = -1
                if (r0 != r1) goto L27
                goto L33
            L27:
                r0 = r8
                r1 = r9
                r2 = 0
                r3 = r10
                r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L53
                goto L16
            L33:
                java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L53
                java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L53
                r2 = r1
                r3 = r8
                byte[] r3 = r3.toByteArray()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L53
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L53
                r0.println(r1)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L53
                r0 = r7
                r0.close()     // Catch: java.lang.Exception -> L53
                r0 = 0
                return r0
            L4a:
                r11 = move-exception
                r0 = r7
                r0.close()     // Catch: java.lang.Exception -> L53
                r0 = r11
                throw r0     // Catch: java.lang.Exception -> L53
            L53:
                java.io.PrintStream r0 = java.lang.System.err
                java.lang.String r1 = "License file not found. Check https://projectlombok.org/LICENSE"
                r0.println(r1)
                r0 = 1
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/Main$VersionApp.SCL.lombok */
    public static class VersionApp extends lombok.core.LombokApp {
        public VersionApp() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.core.LombokApp
        public java.lang.String getAppName() {
                r2 = this;
                java.lang.String r0 = "version"
                return r0
        }

        @Override // lombok.core.LombokApp
        public java.lang.String getAppDescription() {
                r2 = this;
                java.lang.String r0 = "prints lombok's version."
                return r0
        }

        @Override // lombok.core.LombokApp
        public java.util.List<java.lang.String> getAppAliases() {
                r5 = this;
                r0 = 2
                java.lang.String[] r0 = new java.lang.String[r0]
                r1 = r0
                r2 = 0
                java.lang.String r3 = "-version"
                r1[r2] = r3
                r1 = r0
                r2 = 1
                java.lang.String r3 = "--version"
                r1[r2] = r3
                java.util.List r0 = java.util.Arrays.asList(r0)
                return r0
        }

        @Override // lombok.core.LombokApp
        public int runApp(java.util.List<java.lang.String> r4) {
                r3 = this;
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r1 = lombok.core.Version.getFullVersion()
                r0.println(r1)
                r0 = 0
                return r0
        }
    }

    static {
            r0 = 8
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "/?"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "/h"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "/help"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "-h"
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.String r3 = "-help"
            r1[r2] = r3
            r1 = r0
            r2 = 5
            java.lang.String r3 = "--help"
            r1[r2] = r3
            r1 = r0
            r2 = 6
            java.lang.String r3 = "help"
            r1[r2] = r3
            r1 = r0
            r2 = 7
            java.lang.String r3 = "h"
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            lombok.core.Main.HELP_SWITCHES = r0
            return
    }

    public static void main(java.lang.String[] r5) throws java.io.IOException {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Class<lombok.core.Main> r1 = lombok.core.Main.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setContextClassLoader(r1)
            lombok.core.Main r0 = new lombok.core.Main
            r1 = r0
            java.lang.Class<lombok.core.LombokApp> r2 = lombok.core.LombokApp.class
            java.lang.Iterable r2 = lombok.core.SpiLoadUtil.findServices(r2)
            java.util.List r2 = lombok.core.SpiLoadUtil.readAllFromIterator(r2)
            r3 = r5
            java.util.List r3 = java.util.Arrays.asList(r3)
            r1.<init>(r2, r3)
            int r0 = r0.m67go()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L2a
            r0 = r6
            java.lang.System.exit(r0)
        L2a:
            return
    }

    public Main(java.util.List<lombok.core.LombokApp> r4, java.util.List<java.lang.String> r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.apps = r1
            r0 = r3
            r1 = r5
            r0.args = r1
            return
    }

    /* renamed from: go */
    public int m67go() {
            r5 = this;
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.args
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2b
            java.util.Collection<?> r0 = lombok.core.Main.HELP_SWITCHES
            r1 = r5
            java.util.List<java.lang.String> r1 = r1.args
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2b
            r0 = r5
            r1 = 0
            java.io.PrintStream r2 = java.lang.System.out
            r0.printHelp(r1, r2)
            r0 = 0
            return r0
        L2b:
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.args
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3c
            java.lang.String r0 = ""
            goto L4c
        L3c:
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.args
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.trim()
        L4c:
            r6 = r0
            r0 = r6
            java.lang.String r1 = "--"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L5f
            r0 = r6
            r1 = 2
            java.lang.String r0 = r0.substring(r1)
            r6 = r0
            goto L6e
        L5f:
            r0 = r6
            java.lang.String r1 = "-"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L6e
            r0 = r6
            r1 = 1
            java.lang.String r0 = r0.substring(r1)
            r6 = r0
        L6e:
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.args
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L80
            java.util.List r0 = java.util.Collections.emptyList()
            goto L96
        L80:
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.args
            r1 = 1
            r2 = r5
            java.util.List<java.lang.String> r2 = r2.args
            int r2 = r2.size()
            java.util.List r0 = r0.subList(r1, r2)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L96:
            r7 = r0
            r0 = r5
            java.util.List<lombok.core.LombokApp> r0 = r0.apps
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto Ld7
        La5:
            r0 = r9
            java.lang.Object r0 = r0.next()
            lombok.core.LombokApp r0 = (lombok.core.LombokApp) r0
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.getAppName()
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lc8
            r0 = r8
            java.util.List r0 = r0.getAppAliases()
            r1 = r6
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Ld7
        Lc8:
            r0 = r8
            r1 = r7
            int r0 = r0.runApp(r1)     // Catch: java.lang.Exception -> Lce
            return r0
        Lce:
            r10 = move-exception
            r0 = r10
            r0.printStackTrace()
            r0 = 5
            return r0
        Ld7:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto La5
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Unknown command: "
            r2.<init>(r3)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.PrintStream r2 = java.lang.System.err
            r0.printHelp(r1, r2)
            r0 = 1
            return r0
    }

    public void printHelp(java.lang.String r9, java.io.PrintStream r10) {
            r8 = this;
            r0 = r9
            if (r0 == 0) goto Lf
            r0 = r10
            r1 = r9
            r0.println(r1)
            r0 = r10
            java.lang.String r1 = "------------------------------"
            r0.println(r1)
        Lf:
            r0 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "projectlombok.org "
            r2.<init>(r3)
            java.lang.String r2 = lombok.core.Version.getFullVersion()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r10
            java.lang.String r1 = "Copyright (C) 2009-2021 The Project Lombok Authors."
            r0.println(r1)
            r0 = r10
            java.lang.String r1 = "Run 'lombok license' to see the lombok license agreement."
            r0.println(r1)
            r0 = r10
            r0.println()
            r0 = r10
            java.lang.String r1 = "Run lombok without any parameters to start the graphical installer."
            r0.println(r1)
            r0 = r10
            java.lang.String r1 = "Other available commands:"
            r0.println(r1)
            r0 = r8
            java.util.List<lombok.core.LombokApp> r0 = r0.apps
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto La5
        L4f:
            r0 = r12
            java.lang.Object r0 = r0.next()
            lombok.core.LombokApp r0 = (lombok.core.LombokApp) r0
            r11 = r0
            r0 = r11
            boolean r0 = r0.isDebugTool()
            if (r0 == 0) goto L64
            goto La5
        L64:
            r0 = r11
            java.lang.String r0 = r0.getAppDescription()
            java.lang.String r1 = "\n"
            java.lang.String[] r0 = r0.split(r1)
            r13 = r0
            r0 = 0
            r14 = r0
            goto L9d
        L75:
            r0 = r10
            java.lang.String r1 = "  %15s    %s\n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r14
            if (r5 != 0) goto L8b
            r5 = r11
            java.lang.String r5 = r5.getAppName()
            goto L8d
        L8b:
            java.lang.String r5 = ""
        L8d:
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r13
            r6 = r14
            r5 = r5[r6]
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            int r14 = r14 + 1
        L9d:
            r0 = r14
            r1 = r13
            int r1 = r1.length
            if (r0 < r1) goto L75
        La5:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4f
            r0 = r10
            r0.println()
            r0 = r10
            java.lang.String r1 = "Run lombok commandName --help for more info on each command."
            r0.println(r1)
            return
    }
}
