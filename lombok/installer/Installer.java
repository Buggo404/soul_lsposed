package lombok.installer;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/Installer.SCL.lombok */
public class Installer {
    static final java.net.URI ABOUT_LOMBOK_URL = null;
    static final java.util.List<lombok.installer.IdeLocationProvider> locationProviders = null;


    /* loaded from: com.usidqw.qwerklj.apk:lombok/installer/Installer$CmdArgs.SCL.lombok */
    private static class CmdArgs {

        @com.zwitserloot.cmdreader.Description("Specify paths to a location to install/uninstall. Use 'auto' to apply to all automatically discoverable installations.")
        @com.zwitserloot.cmdreader.Sequential
        java.util.List<java.lang.String> path;

        @com.zwitserloot.cmdreader.Description("Shows this help text")
        @com.zwitserloot.cmdreader.Shorthand({"h", "?"})
        boolean help;

        private CmdArgs() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.path = r1
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/installer/Installer$CommandLineInstallerApp.SCL.lombok */
    public static class CommandLineInstallerApp extends lombok.core.LombokApp {
        public CommandLineInstallerApp() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.core.LombokApp
        public java.lang.String getAppName() {
                r2 = this;
                java.lang.String r0 = "install"
                return r0
        }

        @Override // lombok.core.LombokApp
        public java.lang.String getAppDescription() {
                r2 = this;
                java.lang.String r0 = "Runs the 'handsfree' command line scriptable installer."
                return r0
        }

        @Override // lombok.core.LombokApp
        public int runApp(java.util.List<java.lang.String> r4) throws java.lang.Exception {
                r3 = this;
                r0 = 0
                r1 = r4
                int r0 = lombok.installer.Installer.cliInstaller(r0, r1)
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/installer/Installer$CommandLineUninstallerApp.SCL.lombok */
    public static class CommandLineUninstallerApp extends lombok.core.LombokApp {
        public CommandLineUninstallerApp() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.core.LombokApp
        public java.lang.String getAppName() {
                r2 = this;
                java.lang.String r0 = "uninstall"
                return r0
        }

        @Override // lombok.core.LombokApp
        public java.lang.String getAppDescription() {
                r2 = this;
                java.lang.String r0 = "Runs the 'handsfree' command line scriptable uninstaller."
                return r0
        }

        @Override // lombok.core.LombokApp
        public int runApp(java.util.List<java.lang.String> r4) throws java.lang.Exception {
                r3 = this;
                r0 = 1
                r1 = r4
                int r0 = lombok.installer.Installer.cliInstaller(r0, r1)
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/installer/Installer$GraphicalInstallerApp.SCL.lombok */
    public static class GraphicalInstallerApp extends lombok.core.LombokApp {
        public GraphicalInstallerApp() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.core.LombokApp
        public java.lang.String getAppName() {
                r2 = this;
                java.lang.String r0 = "installer"
                return r0
        }

        @Override // lombok.core.LombokApp
        public java.lang.String getAppDescription() {
                r2 = this;
                java.lang.String r0 = "Runs the graphical installer tool (default)."
                return r0
        }

        @Override // lombok.core.LombokApp
        public java.util.List<java.lang.String> getAppAliases() {
                r5 = this;
                r0 = 1
                java.lang.String[] r0 = new java.lang.String[r0]
                r1 = r0
                r2 = 0
                java.lang.String r3 = ""
                r1[r2] = r3
                java.util.List r0 = java.util.Arrays.asList(r0)
                return r0
        }

        @Override // lombok.core.LombokApp
        public int runApp(java.util.List<java.lang.String> r3) throws java.lang.Exception {
                r2 = this;
                int r0 = lombok.installer.Installer.access$0()
                return r0
        }
    }

    static {
            java.lang.String r0 = "https://projectlombok.org"
            java.net.URI r0 = java.net.URI.create(r0)
            lombok.installer.Installer.ABOUT_LOMBOK_URL = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r3 = r0
            java.lang.Class<lombok.installer.IdeLocationProvider> r0 = lombok.installer.IdeLocationProvider.class
            java.lang.Iterable r0 = lombok.core.SpiLoadUtil.findServices(r0)     // Catch: java.io.IOException -> L3c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L3c
            r5 = r0
            goto L30
        L1e:
            r0 = r5
            java.lang.Object r0 = r0.next()     // Catch: java.io.IOException -> L3c
            lombok.installer.IdeLocationProvider r0 = (lombok.installer.IdeLocationProvider) r0     // Catch: java.io.IOException -> L3c
            r4 = r0
            r0 = r3
            r1 = r4
            boolean r0 = r0.add(r1)     // Catch: java.io.IOException -> L3c
        L30:
            r0 = r5
            boolean r0 = r0.hasNext()     // Catch: java.io.IOException -> L3c
            if (r0 != 0) goto L1e
            goto L42
        L3c:
            r4 = move-exception
            r0 = r4
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L42:
            r0 = r3
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            lombok.installer.Installer.locationProviders = r0
            return
    }

    public Installer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static java.util.List<java.util.regex.Pattern> getIdeExecutableNames() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r3 = r0
            java.util.List<lombok.installer.IdeLocationProvider> r0 = lombok.installer.Installer.locationProviders
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
            goto L31
        L14:
            r0 = r5
            java.lang.Object r0 = r0.next()
            lombok.installer.IdeLocationProvider r0 = (lombok.installer.IdeLocationProvider) r0
            r4 = r0
            r0 = r4
            java.util.regex.Pattern r0 = r0.getLocationSelectors()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L31
            r0 = r3
            r1 = r6
            boolean r0 = r0.add(r1)
        L31:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            r0 = r3
            return r0
    }

    static lombok.installer.IdeLocation tryAllProviders(java.lang.String r3) throws lombok.installer.CorruptedIdeLocationException {
            java.util.List<lombok.installer.IdeLocationProvider> r0 = lombok.installer.Installer.locationProviders
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
            goto L24
        Lc:
            r0 = r5
            java.lang.Object r0 = r0.next()
            lombok.installer.IdeLocationProvider r0 = (lombok.installer.IdeLocationProvider) r0
            r4 = r0
            r0 = r4
            r1 = r3
            lombok.installer.IdeLocation r0 = r0.create(r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L24
            r0 = r6
            return r0
        L24:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
    }

    static void autoDiscover(java.util.List<lombok.installer.IdeLocation> r4, java.util.List<lombok.installer.CorruptedIdeLocationException> r5) {
            java.util.List<lombok.installer.IdeLocationProvider> r0 = lombok.installer.Installer.locationProviders
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L1e
        Lc:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.installer.IdeLocationProvider r0 = (lombok.installer.IdeLocationProvider) r0
            r6 = r0
            r0 = r6
            r1 = r4
            r2 = r5
            r0.findIdes(r1, r2)
        L1e:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lc
            return
    }

    public static boolean isSelf(java.lang.String r4) {
            java.lang.Class<lombok.installer.Installer> r0 = lombok.installer.Installer.class
            java.lang.String r0 = lombok.patcher.ClassRootFinder.findClassRootOfClass(r0)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.io.File r0 = r0.getAbsoluteFile()
            r6 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            java.io.File r0 = r0.getAbsoluteFile()
            r7 = r0
            r0 = r6
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.io.IOException -> L2c
            r6 = r0
            goto L2d
        L2c:
        L2d:
            r0 = r7
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.io.IOException -> L35
            r7 = r0
            goto L36
        L35:
        L36:
            r0 = r6
            r1 = r7
            boolean r0 = r0.equals(r1)
            return r0
    }

    private static int guiInstaller() {
            lombok.installer.OsUtils$OS r0 = lombok.installer.OsUtils.getOS()
            lombok.installer.OsUtils$OS r1 = lombok.installer.OsUtils.EnumC1123OS.MAC_OS_X
            if (r0 != r1) goto L19
            java.lang.String r0 = "com.apple.mrj.application.apple.menu.about.name"
            java.lang.String r1 = "Lombok Installer"
            java.lang.String r0 = java.lang.System.setProperty(r0, r1)
            java.lang.String r0 = "com.apple.macos.use-file-dialog-packages"
            java.lang.String r1 = "true"
            java.lang.String r0 = java.lang.System.setProperty(r0, r1)
        L19:
            lombok.installer.Installer$1 r0 = new lombok.installer.Installer$1     // Catch: java.awt.HeadlessException -> L65
            r1 = r0
            r1.<init>()     // Catch: java.awt.HeadlessException -> L65
            javax.swing.SwingUtilities.invokeLater(r0)     // Catch: java.awt.HeadlessException -> L65
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r0 = lombok.installer.InstallerGUI.exitMarker     // Catch: java.awt.HeadlessException -> L65
            r1 = r0
            r3 = r1
            monitor-enter(r0)     // Catch: java.awt.HeadlessException -> L65
            goto L3a
        L2c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r0 = lombok.installer.InstallerGUI.exitMarker     // Catch: java.lang.InterruptedException -> L35 java.lang.Throwable -> L62 java.awt.HeadlessException -> L65
            r0.wait()     // Catch: java.lang.InterruptedException -> L35 java.lang.Throwable -> L62 java.awt.HeadlessException -> L65
            goto L3a
        L35:
            r0 = r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62 java.awt.HeadlessException -> L65
            r0 = 1
            return r0
        L3a:
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L62 java.awt.HeadlessException -> L65
            if (r0 != 0) goto L49
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r0 = lombok.installer.InstallerGUI.exitMarker     // Catch: java.lang.Throwable -> L62 java.awt.HeadlessException -> L65
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L62 java.awt.HeadlessException -> L65
            if (r0 == 0) goto L2c
        L49:
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r0 = lombok.installer.InstallerGUI.exitMarker     // Catch: java.lang.Throwable -> L62 java.awt.HeadlessException -> L65
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L62 java.awt.HeadlessException -> L65
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L62 java.awt.HeadlessException -> L65
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L5b
            r0 = 1
            goto L5f
        L5b:
            r0 = r4
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L62 java.awt.HeadlessException -> L65
        L5f:
            r1 = r3
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L62 java.awt.HeadlessException -> L65
            return r0
        L62:
            r1 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L62 java.awt.HeadlessException -> L65
            throw r0     // Catch: java.lang.Throwable -> L62 java.awt.HeadlessException -> L65
        L65:
            printHeadlessInfo()
            r0 = 1
            return r0
    }

    public static int cliInstaller(boolean r7, java.util.List<java.lang.String> r8) {
            java.lang.Class<lombok.installer.Installer$CmdArgs> r0 = lombok.installer.Installer.CmdArgs.class
            com.zwitserloot.cmdreader.CmdReader r0 = com.zwitserloot.cmdreader.CmdReader.m40of(r0)
            r9 = r0
            r0 = r9
            r1 = r8
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L1e
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L1e
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L1e
            java.lang.Object r0 = r0.make(r1)     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L1e
            lombok.installer.Installer$CmdArgs r0 = (lombok.installer.Installer.CmdArgs) r0     // Catch: com.zwitserloot.cmdreader.InvalidCommandLineException -> L1e
            r10 = r0
            goto L41
        L1e:
            r11 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            r1 = r11
            java.lang.String r1 = r1.getMessage()
            r0.println(r1)
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "--------------------------"
            r0.println(r1)
            java.io.PrintStream r0 = java.lang.System.err
            r1 = r7
            r2 = r9
            java.lang.String r1 = generateCliHelp(r1, r2)
            r0.println(r1)
            r0 = 1
            return r0
        L41:
            r0 = r10
            boolean r0 = r0.help
            if (r0 == 0) goto L55
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r7
            r2 = r9
            java.lang.String r1 = generateCliHelp(r1, r2)
            r0.println(r1)
            r0 = 0
            return r0
        L55:
            r0 = r10
            java.util.List<java.lang.String> r0 = r0.path
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L80
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "ERROR: Nothing to do!"
            r0.println(r1)
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "--------------------------"
            r0.println(r1)
            java.io.PrintStream r0 = java.lang.System.err
            r1 = r7
            r2 = r9
            java.lang.String r1 = generateCliHelp(r1, r2)
            r0.println(r1)
            r0 = 1
            return r0
        L80:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r10
            java.util.List<java.lang.String> r0 = r0.path
            java.lang.String r1 = "auto"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto La8
            r0 = r11
            r1 = r12
            autoDiscover(r0, r1)
        La8:
            r0 = r10
            java.util.List<java.lang.String> r0 = r0.path
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L118
        Lb6:
            r0 = r14
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r13 = r0
            r0 = r13
            java.lang.String r1 = "auto"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L118
            r0 = r13
            lombok.installer.IdeLocation r0 = tryAllProviders(r0)     // Catch: lombok.installer.CorruptedIdeLocationException -> L10c
            r15 = r0
            r0 = r15
            if (r0 == 0) goto Le6
            r0 = r11
            r1 = r15
            boolean r0 = r0.add(r1)     // Catch: lombok.installer.CorruptedIdeLocationException -> L10c
            goto L118
        Le6:
            r0 = r12
            lombok.installer.CorruptedIdeLocationException r1 = new lombok.installer.CorruptedIdeLocationException     // Catch: lombok.installer.CorruptedIdeLocationException -> L10c
            r2 = r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: lombok.installer.CorruptedIdeLocationException -> L10c
            r4 = r3
            java.lang.String r5 = "Can't find any IDE at: "
            r4.<init>(r5)     // Catch: lombok.installer.CorruptedIdeLocationException -> L10c
            r4 = r13
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: lombok.installer.CorruptedIdeLocationException -> L10c
            java.lang.String r3 = r3.toString()     // Catch: lombok.installer.CorruptedIdeLocationException -> L10c
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5)     // Catch: lombok.installer.CorruptedIdeLocationException -> L10c
            boolean r0 = r0.add(r1)     // Catch: lombok.installer.CorruptedIdeLocationException -> L10c
            goto L118
        L10c:
            r15 = move-exception
            r0 = r12
            r1 = r15
            boolean r0 = r0.add(r1)
        L118:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb6
            r0 = r11
            int r0 = r0.size()
            r13 = r0
            r0 = r11
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto L21f
        L137:
            r0 = r15
            java.lang.Object r0 = r0.next()
            lombok.installer.IdeLocation r0 = (lombok.installer.IdeLocation) r0
            r14 = r0
            r0 = r7
            if (r0 == 0) goto L14f
            r0 = r14
            r0.uninstall()     // Catch: lombok.installer.InstallException -> L18e lombok.installer.UninstallException -> L1d8
            goto L155
        L14f:
            r0 = r14
            java.lang.String r0 = r0.install()     // Catch: lombok.installer.InstallException -> L18e lombok.installer.UninstallException -> L1d8
        L155:
            java.io.PrintStream r0 = java.lang.System.out     // Catch: lombok.installer.InstallException -> L18e lombok.installer.UninstallException -> L1d8
            java.lang.String r1 = "Lombok %s %s: %s\n"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: lombok.installer.InstallException -> L18e lombok.installer.UninstallException -> L1d8
            r3 = r2
            r4 = 0
            r5 = r7
            if (r5 == 0) goto L16b
            java.lang.String r5 = "uninstalled"
            goto L16e
        L16b:
            java.lang.String r5 = "installed"
        L16e:
            r3[r4] = r5     // Catch: lombok.installer.InstallException -> L18e lombok.installer.UninstallException -> L1d8
            r3 = r2
            r4 = 1
            r5 = r7
            if (r5 == 0) goto L17b
            java.lang.String r5 = "from"
            goto L17e
        L17b:
            java.lang.String r5 = "to"
        L17e:
            r3[r4] = r5     // Catch: lombok.installer.InstallException -> L18e lombok.installer.UninstallException -> L1d8
            r3 = r2
            r4 = 2
            r5 = r14
            java.lang.String r5 = r5.getName()     // Catch: lombok.installer.InstallException -> L18e lombok.installer.UninstallException -> L1d8
            r3[r4] = r5     // Catch: lombok.installer.InstallException -> L18e lombok.installer.UninstallException -> L1d8
            java.io.PrintStream r0 = r0.printf(r1, r2)     // Catch: lombok.installer.InstallException -> L18e lombok.installer.UninstallException -> L1d8
            goto L21f
        L18e:
            r16 = move-exception
            r0 = r16
            boolean r0 = r0.isWarning()
            if (r0 == 0) goto L1b1
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Warning while installing at %s:\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r14
            java.lang.String r5 = r5.getName()
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            goto L1ca
        L1b1:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Installation at %s failed:\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r14
            java.lang.String r5 = r5.getName()
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            int r13 = r13 + (-1)
        L1ca:
            java.io.PrintStream r0 = java.lang.System.err
            r1 = r16
            java.lang.String r1 = r1.getMessage()
            r0.println(r1)
            goto L21f
        L1d8:
            r16 = move-exception
            r0 = r16
            boolean r0 = r0.isWarning()
            if (r0 == 0) goto L1fb
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Warning while uninstalling at %s:\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r14
            java.lang.String r5 = r5.getName()
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            goto L214
        L1fb:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Uninstall at %s failed:\n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r14
            java.lang.String r5 = r5.getName()
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            int r13 = r13 + (-1)
        L214:
            java.io.PrintStream r0 = java.lang.System.err
            r1 = r16
            java.lang.String r1 = r1.getMessage()
            r0.println(r1)
        L21f:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L137
            r0 = r12
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto L25c
        L235:
            r0 = r15
            java.lang.Object r0 = r0.next()
            lombok.installer.CorruptedIdeLocationException r0 = (lombok.installer.CorruptedIdeLocationException) r0
            r14 = r0
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "WARNING: "
            r2.<init>(r3)
            r2 = r14
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L25c:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L235
            r0 = r13
            if (r0 != 0) goto L274
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "WARNING: Zero valid locations found; so nothing was done!"
            r0.println(r1)
        L274:
            r0 = 0
            return r0
    }

    private static java.lang.String generateCliHelp(boolean r5, com.zwitserloot.cmdreader.CmdReader<lombok.installer.Installer.CmdArgs> r6) {
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "java -jar lombok.jar "
            r2.<init>(r3)
            r2 = r5
            if (r2 == 0) goto L15
            java.lang.String r2 = "uninstall"
            goto L18
        L15:
            java.lang.String r2 = "install"
        L18:
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.generateCommandLineHelp(r1)
            return r0
    }

    private static void printHeadlessInfo() {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "About lombok v%s\nLombok makes java better by providing very spicy additions to the Java programming language,such as using @Getter to automatically generate a getter method for any field.\n\nBrowse to %s for more information. To install lombok on Eclipse, re-run this jar file on a graphical computer system - this message is being shown because your terminal is not graphics capable.\nAlternatively, use the command line installer (java -jar lombok.jar install --help).\nIf you are just using 'javac' or a tool that calls on javac, no installation is neccessary; just make sure lombok.jar is in the classpath when you compile. Example:\n\n   java -cp lombok.jar MyCode.java\n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = lombok.core.Version.getVersion()
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.net.URI r5 = lombok.installer.Installer.ABOUT_LOMBOK_URL
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
            return
    }

    static /* synthetic */ int access$0() {
            int r0 = guiInstaller()
            return r0
    }

    static /* synthetic */ void access$1() {
            printHeadlessInfo()
            return
    }
}
