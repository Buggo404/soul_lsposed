package lombok.installer;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/WindowsDriveInfo.SCL.lombok */
public class WindowsDriveInfo {
    public WindowsDriveInfo() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public java.util.List<java.lang.String> getLogicalDrives() {
            r4 = this;
            r0 = r4
            int r0 = r0.getLogicalDrives0()
            r5 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = 0
            r7 = r0
            goto L2c
        L12:
            r0 = r5
            r1 = 1
            r2 = r7
            int r1 = r1 << r2
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r6
            r1 = 65
            r2 = r7
            int r1 = r1 + r2
            char r1 = (char) r1
            java.lang.String r1 = java.lang.Character.toString(r1)
            boolean r0 = r0.add(r1)
        L29:
            int r7 = r7 + 1
        L2c:
            r0 = r7
            r1 = 26
            if (r0 < r1) goto L12
            r0 = r6
            return r0
    }

    private native int getLogicalDrives0();

    public boolean isFixedDisk(java.lang.String r7) {
            r6 = this;
            r0 = r7
            int r0 = r0.length()
            r1 = 1
            if (r0 == r1) goto L20
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Supply 1 letter, not: "
            r3.<init>(r4)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L20:
            r0 = r7
            r1 = 0
            char r0 = r0.charAt(r1)
            char r0 = java.lang.Character.toUpperCase(r0)
            r8 = r0
            r0 = r8
            r1 = 65
            if (r0 < r1) goto L35
            r0 = r8
            r1 = 90
            if (r0 <= r1) goto L4d
        L35:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "A drive is indicated by a letter, so A-Z inclusive. Not "
            r3.<init>(r4)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L4d:
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r8
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = ":\\"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            int r0 = r0.getDriveType(r1)
            long r0 = (long) r0
            r1 = 3
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L6e
            r0 = 1
            return r0
        L6e:
            r0 = 0
            return r0
    }

    private native int getDriveType(java.lang.String r1);

    public static void main(java.lang.String[] r8) {
            java.lang.String r0 = "WindowsDriveInfo"
            java.lang.System.loadLibrary(r0)
            lombok.installer.WindowsDriveInfo r0 = new lombok.installer.WindowsDriveInfo
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            java.util.List r0 = r0.getLogicalDrives()
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L47
        L1a:
            r0 = r11
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Drive %s: - %s\n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r10
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r6 = r10
            boolean r5 = r5.isFixedDisk(r6)
            if (r5 == 0) goto L40
            java.lang.String r5 = "Fixed Disk"
            goto L42
        L40:
            java.lang.String r5 = "Not Fixed Disk"
        L42:
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L47:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1a
            return
    }
}
