package lombok.installer.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/eclipse/EclipseProductLocation.SCL.lombok */
public final class EclipseProductLocation extends lombok.installer.IdeLocation {
    private static final java.lang.String OS_NEWLINE = null;
    private final lombok.installer.eclipse.EclipseProductDescriptor descriptor;
    private final java.lang.String name;
    private final java.io.File eclipseIniPath;
    private final java.lang.String pathToLombokJarPrefix;
    private final boolean hasLombok;
    private static final java.util.regex.Pattern JAVA_AGENT_LINE_MATCHER = null;
    private static final java.util.regex.Pattern BOOTCLASSPATH_LINE_MATCHER = null;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$installer$OsUtils$OS;

    static {
            lombok.installer.OsUtils$OS r0 = lombok.installer.OsUtils.getOS()
            java.lang.String r0 = r0.getLineEnding()
            lombok.installer.eclipse.EclipseProductLocation.OS_NEWLINE = r0
            java.lang.String r0 = "^\\-javaagent\\:.*lombok.*\\.jar$"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            lombok.installer.eclipse.EclipseProductLocation.JAVA_AGENT_LINE_MATCHER = r0
            java.lang.String r0 = "^\\-Xbootclasspath\\/a\\:(.*lombok.*\\.jar.*)$"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            lombok.installer.eclipse.EclipseProductLocation.BOOTCLASSPATH_LINE_MATCHER = r0
            return
    }

    EclipseProductLocation(lombok.installer.eclipse.EclipseProductDescriptor r7, java.lang.String r8, java.io.File r9) throws lombok.installer.CorruptedIdeLocationException {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            r1 = r7
            r0.descriptor = r1
            r0 = r6
            r1 = r8
            r0.name = r1
            r0 = r6
            r1 = r9
            r0.eclipseIniPath = r1
            r0 = r9
            java.io.File r0 = r0.getParentFile()
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L22
            r0 = 0
            goto L27
        L22:
            r0 = r10
            java.io.File r0 = r0.getParentFile()
        L27:
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L32
            r0 = 0
            goto L37
        L32:
            r0 = r11
            java.io.File r0 = r0.getParentFile()
        L37:
            r12 = r0
            r0 = r10
            if (r0 == 0) goto L78
            r0 = r10
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Eclipse"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L78
            r0 = r11
            if (r0 == 0) goto L78
            r0 = r11
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Contents"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L78
            r0 = r12
            if (r0 == 0) goto L78
            r0 = r12
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = ".app"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L78
            r0 = r6
            java.lang.String r1 = "../Eclipse/"
            r0.pathToLombokJarPrefix = r1
            goto L7e
        L78:
            r0 = r6
            java.lang.String r1 = ""
            r0.pathToLombokJarPrefix = r1
        L7e:
            r0 = r6
            r1 = r6
            java.io.File r1 = r1.eclipseIniPath     // Catch: java.io.IOException -> L8c
            boolean r1 = checkForLombok(r1)     // Catch: java.io.IOException -> L8c
            r0.hasLombok = r1     // Catch: java.io.IOException -> L8c
            goto Ld7
        L8c:
            r13 = move-exception
            lombok.installer.CorruptedIdeLocationException r0 = new lombok.installer.CorruptedIdeLocationException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "I can't read the configuration file of the "
            r3.<init>(r4)
            r3 = r7
            java.lang.String r3 = r3.getProductName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " installed at "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.String r3 = r3.name
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "\n"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "You may need to run this installer with root privileges if you want to modify that "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.String r3 = r3.getProductName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r7
            java.lang.String r3 = r3.getProductName()
            r4 = r13
            r1.<init>(r2, r3, r4)
            throw r0
        Ld7:
            return
    }

    public int hashCode() {
            r2 = this;
            r0 = r2
            java.io.File r0 = r0.eclipseIniPath
            int r0 = r0.hashCode()
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof lombok.installer.eclipse.EclipseProductLocation
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r4
            lombok.installer.eclipse.EclipseProductLocation r0 = (lombok.installer.eclipse.EclipseProductLocation) r0
            java.io.File r0 = r0.eclipseIniPath
            r1 = r3
            java.io.File r1 = r1.eclipseIniPath
            boolean r0 = r0.equals(r1)
            return r0
    }

    @Override // lombok.installer.IdeLocation
    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.name
            return r0
    }

    @Override // lombok.installer.IdeLocation
    public boolean hasLombok() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.hasLombok
            return r0
    }

    private static boolean checkForLombok(java.io.File r6) throws java.io.IOException {
            r0 = r6
            boolean r0 = r0.exists()
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r7 = r0
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L52
            r1 = r0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L52
            r3 = r2
            r4 = r7
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L52
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L52
            r8 = r0
            goto L3f
        L25:
            java.util.regex.Pattern r0 = lombok.installer.eclipse.EclipseProductLocation.JAVA_AGENT_LINE_MATCHER     // Catch: java.lang.Throwable -> L52
            r1 = r9
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L52
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch: java.lang.Throwable -> L52
            boolean r0 = r0.matches()     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L3f
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> L52
            r0 = r7
            r0.close()
            r0 = 1
            return r0
        L3f:
            r0 = r8
            java.lang.String r0 = r0.readLine()     // Catch: java.lang.Throwable -> L52
            r1 = r0
            r9 = r1
            if (r0 != 0) goto L25
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> L52
            r0 = r7
            r0.close()
            r0 = 0
            return r0
        L52:
            r10 = move-exception
            r0 = r7
            r0.close()
            r0 = r10
            throw r0
    }

    private java.util.List<java.io.File> getUninstallDirs() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r5 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r4
            java.lang.String r2 = r2.name
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            boolean r0 = r0.isDirectory()
            if (r0 != 0) goto L20
            r0 = r6
            java.io.File r0 = r0.getParentFile()
            r6 = r0
        L20:
            r0 = r6
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto L2f
            r0 = r5
            r1 = r6
            boolean r0 = r0.add(r1)
        L2f:
            r0 = r5
            r1 = r4
            java.io.File r1 = r1.eclipseIniPath
            java.io.File r1 = r1.getParentFile()
            boolean r0 = r0.add(r1)
            r0 = r5
            return r0
    }

    @Override // lombok.installer.IdeLocation
    public void uninstall() throws lombok.installer.UninstallException {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r10
            java.io.File r0 = r0.eclipseIniPath
            boolean r0 = r0.exists()
            if (r0 == 0) goto L170
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L14c
            r1 = r0
            r2 = r10
            java.io.File r2 = r2.eclipseIniPath     // Catch: java.io.IOException -> L14c
            r1.<init>(r2)     // Catch: java.io.IOException -> L14c
            r13 = r0
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            r1 = r0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            r3 = r2
            r4 = r13
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            r14 = r0
            goto Lfe
        L3a:
            java.util.regex.Pattern r0 = lombok.installer.eclipse.EclipseProductLocation.JAVA_AGENT_LINE_MATCHER     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            r1 = r15
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            boolean r0 = r0.matches()     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            if (r0 == 0) goto L4b
            goto Lfe
        L4b:
            java.util.regex.Pattern r0 = lombok.installer.eclipse.EclipseProductLocation.BOOTCLASSPATH_LINE_MATCHER     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            r1 = r15
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            r16 = r0
            r0 = r16
            boolean r0 = r0.matches()     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            if (r0 == 0) goto Lf1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            r17 = r0
            r0 = r17
            java.lang.String r1 = "-Xbootclasspath/a:"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            r0 = 1
            r18 = r0
            r0 = r16
            r1 = 1
            java.lang.String r0 = r0.group(r1)     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            java.lang.String r1 = java.io.File.pathSeparator     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            java.lang.String r1 = java.util.regex.Pattern.quote(r1)     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            r1 = r0
            r22 = r1
            int r0 = r0.length     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            r21 = r0
            r0 = 0
            r20 = r0
            goto Ld2
        L8c:
            r0 = r22
            r1 = r20
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            r19 = r0
            r0 = r19
            java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            java.lang.String r1 = "lombok.jar"
            boolean r0 = r0.endsWith(r1)     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            if (r0 == 0) goto La3
            goto Lcf
        La3:
            r0 = r19
            java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            java.lang.String r1 = "lombok.eclipse.agent.jar"
            boolean r0 = r0.endsWith(r1)     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            if (r0 == 0) goto Lb3
            goto Lcf
        Lb3:
            r0 = r18
            if (r0 == 0) goto Lbe
            r0 = 0
            r18 = r0
            goto Lc7
        Lbe:
            r0 = r17
            java.lang.String r1 = java.io.File.pathSeparator     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
        Lc7:
            r0 = r17
            r1 = r19
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
        Lcf:
            int r20 = r20 + 1
        Ld2:
            r0 = r20
            r1 = r21
            if (r0 < r1) goto L8c
            r0 = r18
            if (r0 != 0) goto Lfe
            r0 = r12
            r1 = r17
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            java.lang.String r1 = lombok.installer.eclipse.EclipseProductLocation.OS_NEWLINE     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            goto Lfe
        Lf1:
            r0 = r12
            r1 = r15
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            java.lang.String r1 = lombok.installer.eclipse.EclipseProductLocation.OS_NEWLINE     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
        Lfe:
            r0 = r14
            java.lang.String r0 = r0.readLine()     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            r1 = r0
            r15 = r1
            if (r0 != 0) goto L3a
            r0 = r14
            r0.close()     // Catch: java.lang.Throwable -> L111 java.io.IOException -> L14c
            goto L11a
        L111:
            r23 = move-exception
            r0 = r13
            r0.close()     // Catch: java.io.IOException -> L14c
            r0 = r23
            throw r0     // Catch: java.io.IOException -> L14c
        L11a:
            r0 = r13
            r0.close()     // Catch: java.io.IOException -> L14c
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L14c
            r1 = r0
            r2 = r10
            java.io.File r2 = r2.eclipseIniPath     // Catch: java.io.IOException -> L14c
            r1.<init>(r2)     // Catch: java.io.IOException -> L14c
            r14 = r0
            r0 = r14
            r1 = r12
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L13a java.io.IOException -> L14c
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L13a java.io.IOException -> L14c
            r0.write(r1)     // Catch: java.lang.Throwable -> L13a java.io.IOException -> L14c
            goto L144
        L13a:
            r15 = move-exception
            r0 = r14
            r0.close()     // Catch: java.io.IOException -> L14c
            r0 = r15
            throw r0     // Catch: java.io.IOException -> L14c
        L144:
            r0 = r14
            r0.close()     // Catch: java.io.IOException -> L14c
            goto L170
        L14c:
            r13 = move-exception
            lombok.installer.UninstallException r0 = new lombok.installer.UninstallException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Cannot uninstall lombok from "
            r3.<init>(r4)
            r3 = r10
            java.lang.String r3 = r3.name
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = generateWriteErrorMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r13
            r1.<init>(r2, r3)
            throw r0
        L170:
            r0 = r10
            java.util.List r0 = r0.getUninstallDirs()
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L203
        L17e:
            r0 = r14
            java.lang.Object r0 = r0.next()
            java.io.File r0 = (java.io.File) r0
            r13 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r13
            java.lang.String r3 = "lombok.jar"
            r1.<init>(r2, r3)
            r15 = r0
            r0 = r15
            boolean r0 = r0.exists()
            if (r0 == 0) goto L1e9
            r0 = r15
            boolean r0 = r0.delete()
            if (r0 != 0) goto L1e9
            lombok.installer.OsUtils$OS r0 = lombok.installer.OsUtils.getOS()
            lombok.installer.OsUtils$OS r1 = lombok.installer.OsUtils.EnumC1123OS.WINDOWS
            if (r0 != r1) goto L1c5
            r0 = r15
            java.lang.String r0 = r0.getAbsolutePath()
            boolean r0 = lombok.installer.Installer.isSelf(r0)
            if (r0 == 0) goto L1c5
            r0 = r11
            r1 = r15
            boolean r0 = r0.add(r1)
            goto L1e9
        L1c5:
            lombok.installer.UninstallException r0 = new lombok.installer.UninstallException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Can't delete "
            r3.<init>(r4)
            r3 = r15
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = generateWriteErrorMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            r1.<init>(r2, r3)
            throw r0
        L1e9:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r13
            java.lang.String r3 = "lombok.eclipse.agent.jar"
            r1.<init>(r2, r3)
            r16 = r0
            r0 = r16
            boolean r0 = r0.exists()
            if (r0 == 0) goto L203
            r0 = r16
            boolean r0 = r0.delete()
        L203:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L17e
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L246
            lombok.installer.UninstallException r0 = new lombok.installer.UninstallException
            r1 = r0
            r2 = 1
            java.lang.String r3 = "lombok.jar cannot delete itself on windows.\nHowever, lombok has been uncoupled from your %s.\nYou can safely delete this jar file. You can find it at:\n%s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = r4
            r6 = 0
            r7 = r10
            lombok.installer.eclipse.EclipseProductDescriptor r7 = r7.descriptor
            java.lang.String r7 = r7.getProductName()
            r5[r6] = r7
            r5 = r4
            r6 = 1
            r7 = r11
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            java.io.File r7 = (java.io.File) r7
            java.lang.String r7 = r7.getAbsolutePath()
            r5[r6] = r7
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r4 = 0
            r1.<init>(r2, r3, r4)
            throw r0
        L246:
            return
    }

    private static java.lang.String generateWriteErrorMessage() {
            int[] r0 = $SWITCH_TABLE$lombok$installer$OsUtils$OS()
            lombok.installer.OsUtils$OS r1 = lombok.installer.OsUtils.getOS()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L24;
                case 2: goto L2b;
                case 3: goto L24;
                default: goto L24;
            }
        L24:
            java.lang.String r0 = ":\nStart terminal, go to the directory with lombok.jar, and run: sudo java -jar lombok.jar"
            r4 = r0
            goto L2f
        L2b:
            java.lang.String r0 = ":\nStart a new cmd (dos box) with admin privileges, go to the directory with lombok.jar, and run: java -jar lombok.jar"
            r4 = r0
        L2f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = ", probably because this installer does not have the access rights.\nTry re-running the installer with administrative privileges"
            r1.<init>(r2)
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // lombok.installer.IdeLocation
    public java.lang.String install() throws lombok.installer.InstallException {
            r9 = this;
            java.lang.String r0 = "false"
            java.lang.String r1 = "lombok.installer.fullpath"
            java.lang.String r2 = "true"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            r10 = r0
            r0 = 0
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r12 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r9
            java.io.File r2 = r2.eclipseIniPath
            java.io.File r2 = r2.getParentFile()
            java.lang.String r3 = "lombok.jar"
            r1.<init>(r2, r3)
            r13 = r0
            r0 = r13
            java.lang.String r0 = r0.getAbsolutePath()
            boolean r0 = lombok.installer.Installer.isSelf(r0)
            if (r0 != 0) goto L151
            java.io.File r0 = findOurJar()
            r14 = r0
            r0 = 524288(0x80000, float:7.34684E-40)
            byte[] r0 = new byte[r0]
            r15 = r0
            r0 = 1
            r16 = r0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lb2
            r1 = r0
            r2 = r13
            r1.<init>(r2)     // Catch: java.io.IOException -> Lb2
            r17 = r0
            r0 = 0
            r16 = r0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> La0 java.io.IOException -> Lb2
            r1 = r0
            r2 = r14
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La0 java.io.IOException -> Lb2
            r18 = r0
        L67:
            r0 = r18
            r1 = r15
            int r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L8e java.lang.Throwable -> La0 java.io.IOException -> Lb2
            r19 = r0
            r0 = r19
            r1 = -1
            if (r0 != r1) goto L79
            goto L98
        L79:
            r0 = r19
            if (r0 <= 0) goto L81
            r0 = 1
            r16 = r0
        L81:
            r0 = r17
            r1 = r15
            r2 = 0
            r3 = r19
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L8e java.lang.Throwable -> La0 java.io.IOException -> Lb2
            goto L67
        L8e:
            r20 = move-exception
            r0 = r18
            r0.close()     // Catch: java.lang.Throwable -> La0 java.io.IOException -> Lb2
            r0 = r20
            throw r0     // Catch: java.lang.Throwable -> La0 java.io.IOException -> Lb2
        L98:
            r0 = r18
            r0.close()     // Catch: java.lang.Throwable -> La0 java.io.IOException -> Lb2
            goto Laa
        La0:
            r21 = move-exception
            r0 = r17
            r0.close()     // Catch: java.io.IOException -> Lb2
            r0 = r21
            throw r0     // Catch: java.io.IOException -> Lb2
        Laa:
            r0 = r17
            r0.close()     // Catch: java.io.IOException -> Lb2
            goto L151
        Lb2:
            r17 = move-exception
            r0 = r13
            boolean r0 = r0.delete()     // Catch: java.lang.Throwable -> Lbd
            goto Lbe
        Lbd:
        Lbe:
            r0 = r16
            if (r0 != 0) goto L11b
            lombok.installer.InstallException r0 = new lombok.installer.InstallException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "I can't read my own jar file (trying: "
            r3.<init>(r4)
            r3 = r14
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "). I think you've found a bug in this installer!\nI suggest you restart it "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "and use the 'what do I do' link, to manually install lombok. Also, tell us about this at:\n"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "http://groups.google.com/group/project-lombok - Thanks!\n\n[DEBUG INFO] "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r17
            java.lang.Class r3 = r3.getClass()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r17
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "\nBase: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Class<lombok.installer.OsUtils> r3 = lombok.installer.OsUtils.class
            java.lang.String r4 = "OsUtils.class"
            java.net.URL r3 = r3.getResource(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r17
            r1.<init>(r2, r3)
            throw r0
        L11b:
            lombok.installer.InstallException r0 = new lombok.installer.InstallException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "I can't write to your "
            r3.<init>(r4)
            r3 = r9
            lombok.installer.eclipse.EclipseProductDescriptor r3 = r3.descriptor
            java.lang.String r3 = r3.getProductName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " directory at "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.String r3 = r3.name
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = generateWriteErrorMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r17
            r1.<init>(r2, r3)
            throw r0
        L151:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r13
            java.io.File r2 = r2.getParentFile()
            java.lang.String r3 = "lombok.eclipse.agent.jar"
            r1.<init>(r2, r3)
            boolean r0 = r0.delete()
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r1 = r0
            r2 = r9
            java.io.File r2 = r2.eclipseIniPath     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r1.<init>(r2)     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r14 = r0
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r1 = r0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r3 = r2
            r4 = r14
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r15 = r0
            goto L249
        L185:
            java.util.regex.Pattern r0 = lombok.installer.eclipse.EclipseProductLocation.JAVA_AGENT_LINE_MATCHER     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r1 = r16
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            boolean r0 = r0.matches()     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            if (r0 == 0) goto L196
            goto L249
        L196:
            java.util.regex.Pattern r0 = lombok.installer.eclipse.EclipseProductLocation.BOOTCLASSPATH_LINE_MATCHER     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r1 = r16
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r17 = r0
            r0 = r17
            boolean r0 = r0.matches()     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            if (r0 == 0) goto L23c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r18 = r0
            r0 = r18
            java.lang.String r1 = "-Xbootclasspath/a:"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r0 = 1
            r19 = r0
            r0 = r17
            r1 = 1
            java.lang.String r0 = r0.group(r1)     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.String r1 = java.io.File.pathSeparator     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.String r1 = java.util.regex.Pattern.quote(r1)     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r1 = r0
            r23 = r1
            int r0 = r0.length     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r22 = r0
            r0 = 0
            r21 = r0
            goto L21d
        L1d7:
            r0 = r23
            r1 = r21
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r20 = r0
            r0 = r20
            java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.String r1 = "lombok.jar"
            boolean r0 = r0.endsWith(r1)     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            if (r0 == 0) goto L1ee
            goto L21a
        L1ee:
            r0 = r20
            java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.String r1 = "lombok.eclipse.agent.jar"
            boolean r0 = r0.endsWith(r1)     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            if (r0 == 0) goto L1fe
            goto L21a
        L1fe:
            r0 = r19
            if (r0 == 0) goto L209
            r0 = 0
            r19 = r0
            goto L212
        L209:
            r0 = r18
            java.lang.String r1 = java.io.File.pathSeparator     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
        L212:
            r0 = r18
            r1 = r20
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
        L21a:
            int r21 = r21 + 1
        L21d:
            r0 = r21
            r1 = r22
            if (r0 < r1) goto L1d7
            r0 = r19
            if (r0 != 0) goto L249
            r0 = r12
            r1 = r18
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.String r1 = lombok.installer.eclipse.EclipseProductLocation.OS_NEWLINE     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            goto L249
        L23c:
            r0 = r12
            r1 = r16
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.String r1 = lombok.installer.eclipse.EclipseProductLocation.OS_NEWLINE     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
        L249:
            r0 = r15
            java.lang.String r0 = r0.readLine()     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r1 = r0
            r16 = r1
            if (r0 != 0) goto L185
            r0 = r15
            r0.close()     // Catch: java.lang.Throwable -> L25c java.io.IOException -> L2f1 java.lang.Throwable -> L317
            goto L266
        L25c:
            r24 = move-exception
            r0 = r14
            r0.close()     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r0 = r24
            throw r0     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
        L266:
            r0 = r14
            r0.close()     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r0 = r10
            if (r0 == 0) goto L28f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r1 = r0
            r2 = r13
            java.io.File r2 = r2.getParentFile()     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.String r2 = r2.getCanonicalPath()     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r1.<init>(r2)     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.String r1 = java.io.File.separator     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r15 = r0
            goto L295
        L28f:
            r0 = r9
            java.lang.String r0 = r0.pathToLombokJarPrefix     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r15 = r0
        L295:
            r0 = r12
            java.lang.String r1 = "-javaagent:%s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r3 = r2
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r6 = r5
            r7 = r15
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r6.<init>(r7)     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.String r6 = "lombok.jar"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.String r5 = r5.toString()     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r3[r4] = r5     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.String r1 = lombok.installer.eclipse.EclipseProductLocation.OS_NEWLINE     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r1 = r0
            r2 = r9
            java.io.File r2 = r2.eclipseIniPath     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r1.<init>(r2)     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r16 = r0
            r0 = r16
            r1 = r12
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2dd java.io.IOException -> L2f1 java.lang.Throwable -> L317
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L2dd java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r0.write(r1)     // Catch: java.lang.Throwable -> L2dd java.io.IOException -> L2f1 java.lang.Throwable -> L317
            goto L2e7
        L2dd:
            r17 = move-exception
            r0 = r16
            r0.close()     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r0 = r17
            throw r0     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
        L2e7:
            r0 = r16
            r0.close()     // Catch: java.io.IOException -> L2f1 java.lang.Throwable -> L317
            r0 = 1
            r11 = r0
            goto L32a
        L2f1:
            r14 = move-exception
            lombok.installer.InstallException r0 = new lombok.installer.InstallException     // Catch: java.lang.Throwable -> L317
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L317
            r3 = r2
            java.lang.String r4 = "Cannot install lombok at "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L317
            r3 = r9
            java.lang.String r3 = r3.name     // Catch: java.lang.Throwable -> L317
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L317
            java.lang.String r3 = generateWriteErrorMessage()     // Catch: java.lang.Throwable -> L317
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L317
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L317
            r3 = r14
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L317
            throw r0     // Catch: java.lang.Throwable -> L317
        L317:
            r25 = move-exception
            r0 = r11
            if (r0 != 0) goto L327
            r0 = r13
            boolean r0 = r0.delete()     // Catch: java.lang.Throwable -> L326
            goto L327
        L326:
        L327:
            r0 = r25
            throw r0
        L32a:
            r0 = r11
            if (r0 != 0) goto L338
            r0 = r13
            boolean r0 = r0.delete()     // Catch: java.lang.Throwable -> L337
            goto L338
        L337:
        L338:
            r0 = r11
            if (r0 != 0) goto L376
            lombok.installer.InstallException r0 = new lombok.installer.InstallException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "I can't find the "
            r3.<init>(r4)
            r3 = r9
            lombok.installer.eclipse.EclipseProductDescriptor r3 = r3.descriptor
            java.lang.String r3 = r3.getIniFileName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " file. Is this a real "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            lombok.installer.eclipse.EclipseProductDescriptor r3 = r3.descriptor
            java.lang.String r3 = r3.getProductName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " installation?"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            r1.<init>(r2, r3)
            throw r0
        L376:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "If you start "
            r1.<init>(r2)
            r1 = r9
            lombok.installer.eclipse.EclipseProductDescriptor r1 = r1.descriptor
            java.lang.String r1 = r1.getProductName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " with a custom -vm parameter, you'll need to add:<br>"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "<code>-vmargs -javaagent:lombok.jar</code><br>as parameter as well."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // lombok.installer.IdeLocation
    public java.net.URL getIdeIcon() {
            r2 = this;
            r0 = r2
            lombok.installer.eclipse.EclipseProductDescriptor r0 = r0.descriptor
            java.net.URL r0 = r0.getIdeIcon()
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$installer$OsUtils$OS() {
            int[] r0 = lombok.installer.eclipse.EclipseProductLocation.$SWITCH_TABLE$lombok$installer$OsUtils$OS
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
            lombok.installer.eclipse.EclipseProductLocation.$SWITCH_TABLE$lombok$installer$OsUtils$OS = r1
            return r0
    }
}
