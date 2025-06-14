package lombok.installer.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/eclipse/StandardProductDescriptor.SCL.lombok */
public class StandardProductDescriptor implements lombok.installer.eclipse.EclipseProductDescriptor {
    private static final java.lang.String USER_HOME = null;
    private static final java.lang.String[] BASE_WINDOWS_ROOTS = null;
    private static final java.lang.String[] WINDOWS_ROOTS = null;
    private static final java.lang.String[] MAC_ROOTS = null;
    private static final java.lang.String[] UNIX_ROOTS = null;
    private final java.lang.String productName;
    private final java.lang.String windowsName;
    private final java.lang.String unixName;
    private final java.lang.String macAppName;
    private final java.util.List<java.lang.String> executableNames;
    private final java.util.List<java.lang.String> sourceDirsOnWindows;
    private final java.util.List<java.lang.String> sourceDirsOnMac;
    private final java.util.List<java.lang.String> sourceDirsOnUnix;
    private final java.lang.String iniFileName;
    private final java.util.regex.Pattern locationSelectors;
    private final java.lang.String directoryName;
    private final java.net.URL ideIcon;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$installer$OsUtils$OS;

    static {
            java.lang.String r0 = "user.home"
            java.lang.String r1 = "."
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            lombok.installer.eclipse.StandardProductDescriptor.USER_HOME = r0
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "\\"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "\\Program Files"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "\\Program Files (x86)"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "\\ProgramData\\Chocolatey\\lib"
            r1[r2] = r3
            lombok.installer.eclipse.StandardProductDescriptor.BASE_WINDOWS_ROOTS = r0
            java.lang.String[] r0 = windowsRoots()
            lombok.installer.eclipse.StandardProductDescriptor.WINDOWS_ROOTS = r0
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "/Applications"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = lombok.installer.eclipse.StandardProductDescriptor.USER_HOME
            r1[r2] = r3
            lombok.installer.eclipse.StandardProductDescriptor.MAC_ROOTS = r0
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = lombok.installer.eclipse.StandardProductDescriptor.USER_HOME
            r1[r2] = r3
            lombok.installer.eclipse.StandardProductDescriptor.UNIX_ROOTS = r0
            return
    }

    public StandardProductDescriptor(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.net.URL r9, java.util.Collection<java.lang.String> r10) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = r6
            r0.productName = r1
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r7
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = ".exe"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.windowsName = r1
            r0 = r5
            r1 = r7
            r0.unixName = r1
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r7
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = ".app"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.macAppName = r1
            r0 = r5
            r1 = r7
            java.util.List r1 = executableNames(r1)
            r0.executableNames = r1
            r0 = r5
            java.lang.String[] r1 = lombok.installer.eclipse.StandardProductDescriptor.WINDOWS_ROOTS
            java.lang.String r2 = "\\"
            r3 = r10
            java.util.List r1 = generateAlternatives(r1, r2, r3)
            r0.sourceDirsOnWindows = r1
            r0 = r5
            java.lang.String[] r1 = lombok.installer.eclipse.StandardProductDescriptor.MAC_ROOTS
            java.lang.String r2 = "/"
            r3 = r10
            java.util.List r1 = generateAlternatives(r1, r2, r3)
            r0.sourceDirsOnMac = r1
            r0 = r5
            java.lang.String[] r1 = lombok.installer.eclipse.StandardProductDescriptor.UNIX_ROOTS
            java.lang.String r2 = "/"
            r3 = r10
            java.util.List r1 = generateAlternatives(r1, r2, r3)
            r0.sourceDirsOnUnix = r1
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r7
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = ".ini"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.iniFileName = r1
            r0 = r5
            r1 = r7
            java.util.regex.Pattern r1 = getLocationSelectors(r1)
            r0.locationSelectors = r1
            r0 = r5
            r1 = r8
            java.lang.String r1 = r1.toLowerCase()
            r0.directoryName = r1
            r0 = r5
            r1 = r9
            r0.ideIcon = r1
            return
    }

    @Override // lombok.installer.eclipse.EclipseProductDescriptor
    public java.lang.String getProductName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.productName
            return r0
    }

    @Override // lombok.installer.eclipse.EclipseProductDescriptor
    public java.lang.String getWindowsExecutableName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.windowsName
            return r0
    }

    @Override // lombok.installer.eclipse.EclipseProductDescriptor
    public java.lang.String getUnixAppName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.unixName
            return r0
    }

    @Override // lombok.installer.eclipse.EclipseProductDescriptor
    public java.lang.String getMacAppName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.macAppName
            return r0
    }

    @Override // lombok.installer.eclipse.EclipseProductDescriptor
    public java.lang.String getDirectoryName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.directoryName
            return r0
    }

    @Override // lombok.installer.eclipse.EclipseProductDescriptor
    public java.util.List<java.lang.String> getExecutableNames() {
            r2 = this;
            r0 = r2
            java.util.List<java.lang.String> r0 = r0.executableNames
            return r0
    }

    @Override // lombok.installer.eclipse.EclipseProductDescriptor
    public java.util.List<java.lang.String> getSourceDirsOnWindows() {
            r2 = this;
            r0 = r2
            java.util.List<java.lang.String> r0 = r0.sourceDirsOnWindows
            return r0
    }

    @Override // lombok.installer.eclipse.EclipseProductDescriptor
    public java.util.List<java.lang.String> getSourceDirsOnMac() {
            r2 = this;
            r0 = r2
            java.util.List<java.lang.String> r0 = r0.sourceDirsOnMac
            return r0
    }

    @Override // lombok.installer.eclipse.EclipseProductDescriptor
    public java.util.List<java.lang.String> getSourceDirsOnUnix() {
            r2 = this;
            r0 = r2
            java.util.List<java.lang.String> r0 = r0.sourceDirsOnUnix
            return r0
    }

    @Override // lombok.installer.eclipse.EclipseProductDescriptor
    public java.lang.String getIniFileName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.iniFileName
            return r0
    }

    @Override // lombok.installer.eclipse.EclipseProductDescriptor
    public java.util.regex.Pattern getLocationSelectors() {
            r2 = this;
            r0 = r2
            java.util.regex.Pattern r0 = r0.locationSelectors
            return r0
    }

    @Override // lombok.installer.eclipse.EclipseProductDescriptor
    public java.net.URL getIdeIcon() {
            r2 = this;
            r0 = r2
            java.net.URL r0 = r0.ideIcon
            return r0
    }

    private static java.util.regex.Pattern getLocationSelectors(java.lang.String r6) {
            java.lang.String r0 = platformPattern()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r6
            java.lang.String r4 = r4.toLowerCase()
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            return r0
    }

    private static java.lang.String platformPattern() {
            int[] r0 = $SWITCH_TABLE$lombok$installer$OsUtils$OS()
            lombok.installer.OsUtils$OS r1 = lombok.installer.OsUtils.getOS()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L24;
                case 2: goto L27;
                case 3: goto L2a;
                default: goto L2a;
            }
        L24:
            java.lang.String r0 = "^(%s|%<s\\.ini|%<s\\.app)$"
            return r0
        L27:
            java.lang.String r0 = "^(%sc?\\.exe|%<s\\.ini)$"
            return r0
        L2a:
            java.lang.String r0 = "^(%s|%<s\\.ini)$"
            return r0
    }

    private static java.util.List<java.lang.String> executableNames(java.lang.String r7) {
            r0 = r7
            java.lang.String r0 = r0.toLowerCase()
            r8 = r0
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            r3 = r8
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r5 = r8
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.<init>(r5)
            java.lang.String r4 = ".app"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r5 = r8
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.<init>(r5)
            java.lang.String r4 = ".exe"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r5 = r8
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.<init>(r5)
            java.lang.String r4 = "c.exe"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    private static java.util.List<java.lang.String> generateAlternatives(java.lang.String[] r5, java.lang.String r6, java.util.Collection<java.lang.String> r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r5
            r1 = r0
            r12 = r1
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r10 = r0
            goto L5e
        L15:
            r0 = r12
            r1 = r10
            r0 = r0[r1]
            r9 = r0
            r0 = r8
            r1 = r9
            r2 = r6
            java.lang.String r3 = ""
            java.lang.String r1 = concat(r1, r2, r3)
            boolean r0 = r0.add(r1)
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L51
        L36:
            r0 = r14
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r13 = r0
            r0 = r8
            r1 = r9
            r2 = r6
            r3 = r13
            java.lang.String r1 = concat(r1, r2, r3)
            boolean r0 = r0.add(r1)
        L51:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L36
            int r10 = r10 + 1
        L5e:
            r0 = r10
            r1 = r11
            if (r0 < r1) goto L15
            r0 = r8
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    private static java.lang.String concat(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r0 = r9
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            r0 = r7
            return r0
        L9:
            r0 = r7
            r1 = r8
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r7
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            r1 = r9
            java.lang.String r2 = "[\\/]"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            java.lang.String r5 = "\\"
            r4.<init>(r5)
            r4 = r8
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = r1.replaceAll(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L3a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r7
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.String r2 = "[\\/]"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            java.lang.String r5 = "\\"
            r4.<init>(r5)
            r4 = r8
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = r1.replaceAll(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String[] windowsRoots() {
            java.lang.String r0 = windowsLocalAppData()
            r6 = r0
            java.lang.String[] r0 = lombok.installer.eclipse.StandardProductDescriptor.BASE_WINDOWS_ROOTS
            int r0 = r0.length
            r1 = r6
            if (r1 != 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 2
        L11:
            int r0 = r0 + r1
            java.lang.String[] r0 = new java.lang.String[r0]
            r7 = r0
            java.lang.String[] r0 = lombok.installer.eclipse.StandardProductDescriptor.BASE_WINDOWS_ROOTS
            r1 = 0
            r2 = r7
            r3 = 0
            java.lang.String[] r4 = lombok.installer.eclipse.StandardProductDescriptor.BASE_WINDOWS_ROOTS
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r7
            java.lang.String[] r1 = lombok.installer.eclipse.StandardProductDescriptor.BASE_WINDOWS_ROOTS
            int r1 = r1.length
            java.lang.String r2 = lombok.installer.eclipse.StandardProductDescriptor.USER_HOME
            r0[r1] = r2
            r0 = r6
            if (r0 == 0) goto L39
            r0 = r7
            java.lang.String[] r1 = lombok.installer.eclipse.StandardProductDescriptor.BASE_WINDOWS_ROOTS
            int r1 = r1.length
            r2 = 1
            int r1 = r1 + r2
            r2 = r6
            r0[r1] = r2
        L39:
            r0 = r7
            return r0
    }

    private static java.lang.String windowsLocalAppData() {
            java.lang.String r0 = "LOCALAPPDATA"
            java.lang.String r0 = java.lang.System.getenv(r0)
            r4 = r0
            r0 = r4
            if (r0 != 0) goto Lf
            r0 = 0
            goto L17
        Lf:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r4
            r1.<init>(r2)
        L17:
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L35
            r0 = r5
            boolean r0 = r0.exists()
            if (r0 == 0) goto L35
            r0 = r5
            boolean r0 = r0.canRead()
            if (r0 == 0) goto L35
            r0 = r5
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto L35
            r0 = r4
            goto L36
        L35:
            r0 = 0
        L36:
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$installer$OsUtils$OS() {
            int[] r0 = lombok.installer.eclipse.StandardProductDescriptor.$SWITCH_TABLE$lombok$installer$OsUtils$OS
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.installer.OsUtils$OS[] r0 = lombok.installer.OsUtils.EnumC1123OS.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.installer.OsUtils$OS r1 = lombok.installer.OsUtils.EnumC1123OS.MAC_OS_X     // Catch: java.lang.NoSuchFieldError -> L1c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
            goto L1d
        L1c:
        L1d:
            r0 = r4
            lombok.installer.OsUtils$OS r1 = lombok.installer.OsUtils.EnumC1123OS.UNIX     // Catch: java.lang.NoSuchFieldError -> L29
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L29
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L29
            goto L2a
        L29:
        L2a:
            r0 = r4
            lombok.installer.OsUtils$OS r1 = lombok.installer.OsUtils.EnumC1123OS.WINDOWS     // Catch: java.lang.NoSuchFieldError -> L36
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            goto L37
        L36:
        L37:
            r0 = r4
            r1 = r0
            lombok.installer.eclipse.StandardProductDescriptor.$SWITCH_TABLE$lombok$installer$OsUtils$OS = r1
            return r0
    }
}
