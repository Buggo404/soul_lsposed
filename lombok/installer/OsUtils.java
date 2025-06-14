package lombok.installer;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/OsUtils.SCL.lombok */
public final class OsUtils {
    private static final java.util.concurrent.atomic.AtomicBoolean windowsDriveInfoLibLoaded = null;

    /* renamed from: lombok.installer.OsUtils$OS */
    /* loaded from: com.usidqw.qwerklj.apk:lombok/installer/OsUtils$OS.SCL.lombok */
    public enum EnumC1123OS extends java.lang.Enum<lombok.installer.OsUtils.EnumC1123OS> {
        public static final lombok.installer.OsUtils.EnumC1123OS MAC_OS_X = null;
        public static final lombok.installer.OsUtils.EnumC1123OS WINDOWS = null;
        public static final lombok.installer.OsUtils.EnumC1123OS UNIX = null;
        private final java.lang.String lineEnding;
        private static final /* synthetic */ lombok.installer.OsUtils.EnumC1123OS[] ENUM$VALUES = null;

        static {
                lombok.installer.OsUtils$OS r0 = new lombok.installer.OsUtils$OS
                r1 = r0
                java.lang.String r2 = "MAC_OS_X"
                r3 = 0
                java.lang.String r4 = "\n"
                r1.<init>(r2, r3, r4)
                lombok.installer.OsUtils.EnumC1123OS.MAC_OS_X = r0
                lombok.installer.OsUtils$OS r0 = new lombok.installer.OsUtils$OS
                r1 = r0
                java.lang.String r2 = "WINDOWS"
                r3 = 1
                java.lang.String r4 = "\r\n"
                r1.<init>(r2, r3, r4)
                lombok.installer.OsUtils.EnumC1123OS.WINDOWS = r0
                lombok.installer.OsUtils$OS r0 = new lombok.installer.OsUtils$OS
                r1 = r0
                java.lang.String r2 = "UNIX"
                r3 = 2
                java.lang.String r4 = "\n"
                r1.<init>(r2, r3, r4)
                lombok.installer.OsUtils.EnumC1123OS.UNIX = r0
                r0 = 3
                lombok.installer.OsUtils$OS[] r0 = new lombok.installer.OsUtils.EnumC1123OS[r0]
                r1 = r0
                r2 = 0
                lombok.installer.OsUtils$OS r3 = lombok.installer.OsUtils.EnumC1123OS.MAC_OS_X
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.installer.OsUtils$OS r3 = lombok.installer.OsUtils.EnumC1123OS.WINDOWS
                r1[r2] = r3
                r1 = r0
                r2 = 2
                lombok.installer.OsUtils$OS r3 = lombok.installer.OsUtils.EnumC1123OS.UNIX
                r1[r2] = r3
                lombok.installer.OsUtils.EnumC1123OS.ENUM$VALUES = r0
                return
        }

        EnumC1123OS(java.lang.String r5, int r6, java.lang.String r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r7
                r0.lineEnding = r1
                return
        }

        public java.lang.String getLineEnding() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.lineEnding
                return r0
        }

        public static lombok.installer.OsUtils.EnumC1123OS[] values() {
                lombok.installer.OsUtils$OS[] r0 = lombok.installer.OsUtils.EnumC1123OS.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.installer.OsUtils$OS[] r2 = new lombok.installer.OsUtils.EnumC1123OS[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.installer.OsUtils.EnumC1123OS valueOf(java.lang.String r3) {
                java.lang.Class<lombok.installer.OsUtils$OS> r0 = lombok.installer.OsUtils.EnumC1123OS.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.installer.OsUtils$OS r0 = (lombok.installer.OsUtils.EnumC1123OS) r0
                return r0
        }
    }

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            lombok.installer.OsUtils.windowsDriveInfoLibLoaded = r0
            return
    }

    private OsUtils() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static void loadWindowsDriveInfoLib() throws java.io.IOException {
            java.util.concurrent.atomic.AtomicBoolean r0 = lombok.installer.OsUtils.windowsDriveInfoLibLoaded
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "lombok-"
            r1.<init>(r2)
            java.lang.String r1 = lombok.core.Version.getVersion()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "-"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7 = r0
            java.lang.String r0 = "lombok"
            java.lang.String r1 = ".mark"
            java.io.File r0 = java.io.File.createTempFile(r0, r1)
            r8 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r8
            java.io.File r2 = r2.getParentFile()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r5 = r7
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.<init>(r5)
            java.lang.String r4 = "WindowsDriveInfo-i386.dll"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r9 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r8
            java.io.File r2 = r2.getParentFile()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r5 = r7
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.<init>(r5)
            java.lang.String r4 = "WindowsDriveInfo-x86_64.dll"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r10 = r0
            r0 = r8
            boolean r0 = r0.delete()
            r0 = r9
            r0.deleteOnExit()
            r0 = r10
            r0.deleteOnExit()
            java.lang.String r0 = "WindowsDriveInfo-i386.binary"
            r1 = r9
            boolean r0 = unpackDLL(r0, r1)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L89
            r0 = r9
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L88
            java.lang.System.load(r0)     // Catch: java.lang.Throwable -> L88
            return
        L88:
        L89:
            java.lang.String r0 = "WindowsDriveInfo-x86_64.binary"
            r1 = r10
            boolean r0 = unpackDLL(r0, r1)     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L9d
            r0 = r10
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L9c
            java.lang.System.load(r0)     // Catch: java.lang.Throwable -> L9c
            goto L9d
        L9c:
        L9d:
            return
    }

    private static boolean unpackDLL(java.lang.String r5, java.io.File r6) throws java.io.IOException {
            java.lang.Class<lombok.installer.OsUtils> r0 = lombok.installer.OsUtils.class
            r1 = r5
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            r7 = r0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L61
            r1 = r0
            r2 = r6
            r1.<init>(r2)     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L61
            r8 = r0
            r0 = 32000(0x7d00, float:4.4842E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L44 java.lang.Throwable -> L61
            r9 = r0
        L17:
            r0 = r7
            r1 = r9
            int r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L44 java.lang.Throwable -> L61
            r10 = r0
            r0 = r10
            r1 = -1
            if (r0 != r1) goto L28
            goto L3d
        L28:
            r0 = r8
            r1 = r9
            r2 = 0
            r3 = r10
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L44 java.lang.Throwable -> L61
            goto L17
        L34:
            r11 = move-exception
            r0 = r8
            r0.close()     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L61
            r0 = r11
            throw r0     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L61
        L3d:
            r0 = r8
            r0.close()     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L61
            goto L6a
        L44:
            r0 = r6
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L57
            r0 = r6
            boolean r0 = r0.canRead()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L57
            r0 = 1
            goto L58
        L57:
            r0 = 0
        L58:
            r13 = r0
            r0 = r7
            r0.close()
            r0 = r13
            return r0
        L61:
            r12 = move-exception
            r0 = r7
            r0.close()
            r0 = r12
            throw r0
        L6a:
            r0 = r7
            r0.close()
            r0 = 1
            return r0
    }

    public static java.util.List<java.lang.String> getDrivesOnWindows() throws java.lang.Throwable {
            loadWindowsDriveInfoLib()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r3 = r0
            lombok.installer.WindowsDriveInfo r0 = new lombok.installer.WindowsDriveInfo
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            java.util.List r0 = r0.getLogicalDrives()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L3a
        L20:
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            r0 = r4
            r1 = r5
            boolean r0 = r0.isFixedDisk(r1)
            if (r0 == 0) goto L3a
            r0 = r3
            r1 = r5
            boolean r0 = r0.add(r1)
        L3a:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L20
            r0 = r3
            return r0
    }

    public static lombok.installer.OsUtils.EnumC1123OS getOS() {
            java.lang.String r0 = "os.name"
            java.lang.String r1 = ""
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            java.lang.String r0 = r0.toLowerCase()
            r3 = r0
            r0 = r3
            java.lang.String r1 = "^.*\\bmac\\b.*$"
            boolean r0 = r0.matches(r1)
            if (r0 == 0) goto L18
            lombok.installer.OsUtils$OS r0 = lombok.installer.OsUtils.EnumC1123OS.MAC_OS_X
            return r0
        L18:
            r0 = r3
            java.lang.String r1 = "^.*\\bdarwin\\b.*$"
            boolean r0 = r0.matches(r1)
            if (r0 == 0) goto L25
            lombok.installer.OsUtils$OS r0 = lombok.installer.OsUtils.EnumC1123OS.MAC_OS_X
            return r0
        L25:
            r0 = r3
            java.lang.String r1 = "^.*\\bwin(dows|32|64)?\\b.*$"
            boolean r0 = r0.matches(r1)
            if (r0 == 0) goto L32
            lombok.installer.OsUtils$OS r0 = lombok.installer.OsUtils.EnumC1123OS.WINDOWS
            return r0
        L32:
            lombok.installer.OsUtils$OS r0 = lombok.installer.OsUtils.EnumC1123OS.UNIX
            return r0
    }
}
