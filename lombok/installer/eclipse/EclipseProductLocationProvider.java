package lombok.installer.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/eclipse/EclipseProductLocationProvider.SCL.lombok */
public class EclipseProductLocationProvider implements lombok.installer.IdeLocationProvider {
    private final lombok.installer.eclipse.EclipseProductDescriptor descriptor;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$installer$OsUtils$OS;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/installer/eclipse/EclipseProductLocationProvider$DirectoryFinder.SCL.lombok */
    private abstract class DirectoryFinder {
        private final java.util.List<java.io.File> flatSourceDirs;
        private final java.util.List<java.io.File> nestedSourceDirs;
        final /* synthetic */ lombok.installer.eclipse.EclipseProductLocationProvider this$0;

        DirectoryFinder(lombok.installer.eclipse.EclipseProductLocationProvider r4, java.util.List<java.io.File> r5, java.util.List<java.io.File> r6) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r5
                r0.nestedSourceDirs = r1
                r0 = r3
                r1 = r6
                r0.flatSourceDirs = r1
                return
        }

        void findEclipse(java.util.List<lombok.installer.IdeLocation> r6, java.util.List<lombok.installer.CorruptedIdeLocationException> r7) {
                r5 = this;
                r0 = r5
                java.util.List<java.io.File> r0 = r0.nestedSourceDirs
                java.util.Iterator r0 = r0.iterator()
                r9 = r0
                goto L20
            Le:
                r0 = r9
                java.lang.Object r0 = r0.next()
                java.io.File r0 = (java.io.File) r0
                r8 = r0
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                r0.recurseDirectory(r1, r2, r3)
            L20:
                r0 = r9
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Le
                r0 = r5
                java.util.List<java.io.File> r0 = r0.flatSourceDirs
                java.util.Iterator r0 = r0.iterator()
                r9 = r0
                goto L4a
            L38:
                r0 = r9
                java.lang.Object r0 = r0.next()
                java.io.File r0 = (java.io.File) r0
                r8 = r0
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                r0.findEclipse(r1, r2, r3)
            L4a:
                r0 = r9
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L38
                return
        }

        abstract java.lang.String findEclipseOnPlatform(java.io.File r1);

        void recurseDirectory(java.util.List<lombok.installer.IdeLocation> r8, java.util.List<lombok.installer.CorruptedIdeLocationException> r9, java.io.File r10) {
                r7 = this;
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = 0
                r5 = 0
                r0.recurseDirectory0(r1, r2, r3, r4, r5)
                return
        }

        private void recurseDirectory0(java.util.List<lombok.installer.IdeLocation> r8, java.util.List<lombok.installer.CorruptedIdeLocationException> r9, java.io.File r10, int r11, boolean r12) {
                r7 = this;
                r0 = r10
                java.io.File[] r0 = r0.listFiles()
                r13 = r0
                r0 = r13
                if (r0 != 0) goto Lc
                return
            Lc:
                r0 = r13
                r1 = r0
                r17 = r1
                int r0 = r0.length
                r16 = r0
                r0 = 0
                r15 = r0
                goto L6e
            L1a:
                r0 = r17
                r1 = r15
                r0 = r0[r1]
                r14 = r0
                r0 = r14
                boolean r0 = r0.isDirectory()
                if (r0 != 0) goto L2c
                goto L6b
            L2c:
                r0 = r12
                if (r0 != 0) goto L4b
                r0 = r14
                java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L6a
                java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Exception -> L6a
                r1 = r7
                lombok.installer.eclipse.EclipseProductLocationProvider r1 = r1.this$0     // Catch: java.lang.Exception -> L6a
                lombok.installer.eclipse.EclipseProductDescriptor r1 = lombok.installer.eclipse.EclipseProductLocationProvider.access$2(r1)     // Catch: java.lang.Exception -> L6a
                java.lang.String r1 = r1.getDirectoryName()     // Catch: java.lang.Exception -> L6a
                boolean r0 = r0.contains(r1)     // Catch: java.lang.Exception -> L6a
                if (r0 == 0) goto L6b
            L4b:
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r14
                r0.findEclipse(r1, r2, r3)     // Catch: java.lang.Exception -> L6a
                r0 = r11
                r1 = 50
                if (r0 >= r1) goto L6b
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r14
                r4 = r11
                r5 = 1
                int r4 = r4 + r5
                r5 = 1
                r0.recurseDirectory0(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L6a
                goto L6b
            L6a:
            L6b:
                int r15 = r15 + 1
            L6e:
                r0 = r15
                r1 = r16
                if (r0 < r1) goto L1a
                return
        }

        private void findEclipse(java.util.List<lombok.installer.IdeLocation> r4, java.util.List<lombok.installer.CorruptedIdeLocationException> r5, java.io.File r6) {
                r3 = this;
                r0 = r3
                r1 = r6
                java.lang.String r0 = r0.findEclipseOnPlatform(r1)
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L33
                r0 = r3
                lombok.installer.eclipse.EclipseProductLocationProvider r0 = r0.this$0     // Catch: lombok.installer.CorruptedIdeLocationException -> L28
                r1 = r7
                lombok.installer.IdeLocation r0 = r0.create(r1)     // Catch: lombok.installer.CorruptedIdeLocationException -> L28
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L33
                r0 = r4
                r1 = r8
                boolean r0 = r0.add(r1)     // Catch: lombok.installer.CorruptedIdeLocationException -> L28
                goto L33
            L28:
                r8 = move-exception
                r0 = r5
                r1 = r8
                boolean r0 = r0.add(r1)
            L33:
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/installer/eclipse/EclipseProductLocationProvider$MacFinder.SCL.lombok */
    private class MacFinder extends lombok.installer.eclipse.EclipseProductLocationProvider.DirectoryFinder {
        final /* synthetic */ lombok.installer.eclipse.EclipseProductLocationProvider this$0;

        MacFinder(lombok.installer.eclipse.EclipseProductLocationProvider r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r0.this$0 = r1
                r0 = r5
                r1 = r6
                r2 = r6
                r3 = r6
                lombok.installer.eclipse.EclipseProductDescriptor r3 = lombok.installer.eclipse.EclipseProductLocationProvider.access$2(r3)
                java.util.List r3 = r3.getSourceDirsOnMac()
                java.util.List r2 = lombok.installer.eclipse.EclipseProductLocationProvider.access$4(r2, r3)
                java.util.List r3 = java.util.Collections.emptyList()
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // lombok.installer.eclipse.EclipseProductLocationProvider.DirectoryFinder
        protected java.lang.String findEclipseOnPlatform(java.io.File r6) {
                r5 = this;
                r0 = r6
                java.lang.String r0 = r0.getName()
                java.lang.String r0 = r0.toLowerCase()
                r1 = r5
                lombok.installer.eclipse.EclipseProductLocationProvider r1 = r1.this$0
                lombok.installer.eclipse.EclipseProductDescriptor r1 = lombok.installer.eclipse.EclipseProductLocationProvider.access$2(r1)
                java.lang.String r1 = r1.getMacAppName()
                java.lang.String r1 = r1.toLowerCase()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L21
                r0 = r6
                java.lang.String r0 = r0.getParent()
                return r0
            L21:
                r0 = r6
                java.lang.String r0 = r0.getName()
                java.lang.String r0 = r0.toLowerCase()
                r1 = r5
                lombok.installer.eclipse.EclipseProductLocationProvider r1 = r1.this$0
                lombok.installer.eclipse.EclipseProductDescriptor r1 = lombok.installer.eclipse.EclipseProductLocationProvider.access$2(r1)
                java.lang.String r1 = r1.getDirectoryName()
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L59
                java.io.File r0 = new java.io.File
                r1 = r0
                r2 = r6
                r3 = r5
                lombok.installer.eclipse.EclipseProductLocationProvider r3 = r3.this$0
                lombok.installer.eclipse.EclipseProductDescriptor r3 = lombok.installer.eclipse.EclipseProductLocationProvider.access$2(r3)
                java.lang.String r3 = r3.getMacAppName()
                r1.<init>(r2, r3)
                boolean r0 = r0.exists()
                if (r0 == 0) goto L59
                r0 = r6
                java.lang.String r0 = r0.toString()
                return r0
            L59:
                r0 = 0
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/installer/eclipse/EclipseProductLocationProvider$UnixFinder.SCL.lombok */
    private class UnixFinder extends lombok.installer.eclipse.EclipseProductLocationProvider.DirectoryFinder {
        final /* synthetic */ lombok.installer.eclipse.EclipseProductLocationProvider this$0;

        UnixFinder(lombok.installer.eclipse.EclipseProductLocationProvider r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r0.this$0 = r1
                r0 = r5
                r1 = r6
                r2 = r6
                java.util.List r2 = lombok.installer.eclipse.EclipseProductLocationProvider.access$0(r2)
                r3 = r6
                java.util.List r3 = lombok.installer.eclipse.EclipseProductLocationProvider.access$1(r3)
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // lombok.installer.eclipse.EclipseProductLocationProvider.DirectoryFinder
        protected java.lang.String findEclipseOnPlatform(java.io.File r6) {
                r5 = this;
                java.io.File r0 = new java.io.File
                r1 = r0
                r2 = r6
                r3 = r5
                lombok.installer.eclipse.EclipseProductLocationProvider r3 = r3.this$0
                lombok.installer.eclipse.EclipseProductDescriptor r3 = lombok.installer.eclipse.EclipseProductLocationProvider.access$2(r3)
                java.lang.String r3 = r3.getUnixAppName()
                r1.<init>(r2, r3)
                r7 = r0
                r0 = r7
                boolean r0 = r0.exists()
                if (r0 == 0) goto L23
                r0 = r7
                java.lang.String r0 = r0.getAbsolutePath()
                goto L24
            L23:
                r0 = 0
            L24:
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/installer/eclipse/EclipseProductLocationProvider$WindowsFinder.SCL.lombok */
    private class WindowsFinder extends lombok.installer.eclipse.EclipseProductLocationProvider.DirectoryFinder {
        final /* synthetic */ lombok.installer.eclipse.EclipseProductLocationProvider this$0;

        WindowsFinder(lombok.installer.eclipse.EclipseProductLocationProvider r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r0.this$0 = r1
                r0 = r5
                r1 = r6
                r2 = r6
                r3 = r6
                java.util.List r3 = lombok.installer.eclipse.EclipseProductLocationProvider.access$3(r3)
                java.util.List r2 = lombok.installer.eclipse.EclipseProductLocationProvider.access$4(r2, r3)
                java.util.List r3 = java.util.Collections.emptyList()
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // lombok.installer.eclipse.EclipseProductLocationProvider.DirectoryFinder
        protected java.lang.String findEclipseOnPlatform(java.io.File r6) {
                r5 = this;
                java.io.File r0 = new java.io.File
                r1 = r0
                r2 = r6
                r3 = r5
                lombok.installer.eclipse.EclipseProductLocationProvider r3 = r3.this$0
                lombok.installer.eclipse.EclipseProductDescriptor r3 = lombok.installer.eclipse.EclipseProductLocationProvider.access$2(r3)
                java.lang.String r3 = r3.getWindowsExecutableName()
                r1.<init>(r2, r3)
                r7 = r0
                r0 = r7
                boolean r0 = r0.isFile()
                if (r0 == 0) goto L23
                r0 = r6
                java.lang.String r0 = r0.getAbsolutePath()
                goto L24
            L23:
                r0 = 0
            L24:
                return r0
        }
    }

    EclipseProductLocationProvider(lombok.installer.eclipse.EclipseProductDescriptor r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.descriptor = r1
            return
    }

    @Override // lombok.installer.IdeLocationProvider
    public final lombok.installer.IdeLocation create(java.lang.String r4) throws lombok.installer.CorruptedIdeLocationException {
            r3 = this;
            r0 = r3
            r1 = r4
            lombok.installer.IdeLocation r0 = r0.create0(r1)
            return r0
    }

    private lombok.installer.IdeLocation create0(java.lang.String r6) throws lombok.installer.CorruptedIdeLocationException {
            r5 = this;
            r0 = r6
            if (r0 != 0) goto Le
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "path"
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r5
            lombok.installer.eclipse.EclipseProductDescriptor r0 = r0.descriptor
            java.lang.String r0 = r0.getIniFileName()
            r7 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            boolean r0 = r0.exists()
            if (r0 != 0) goto L2a
            r0 = 0
            return r0
        L2a:
            r0 = r8
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto L94
            r0 = r5
            lombok.installer.eclipse.EclipseProductDescriptor r0 = r0.descriptor
            java.util.List r0 = r0.getExecutableNames()
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L6c
        L44:
            r0 = r10
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3)
            r11 = r0
            r0 = r11
            boolean r0 = r0.exists()
            if (r0 == 0) goto L6c
            r0 = r5
            r1 = r11
            r2 = 0
            lombok.installer.IdeLocation r0 = r0.findEclipseIniFromExe(r1, r2)
            return r0
        L6c:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L44
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r8
            r3 = r7
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r9
            boolean r0 = r0.exists()
            if (r0 == 0) goto L94
            r0 = r5
            r1 = r8
            java.lang.String r1 = lombok.installer.IdeLocation.canonical(r1)
            r2 = r9
            lombok.installer.IdeLocation r0 = r0.makeLocation(r1, r2)
            return r0
        L94:
            r0 = r8
            boolean r0 = r0.isFile()
            if (r0 == 0) goto Lb3
            r0 = r8
            java.lang.String r0 = r0.getName()
            r1 = r7
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto Lb3
            r0 = r5
            r1 = r8
            java.io.File r1 = r1.getParentFile()
            java.lang.String r1 = lombok.installer.IdeLocation.canonical(r1)
            r2 = r8
            lombok.installer.IdeLocation r0 = r0.makeLocation(r1, r2)
            return r0
        Lb3:
            r0 = r5
            lombok.installer.eclipse.EclipseProductDescriptor r0 = r0.descriptor
            java.util.List r0 = r0.getExecutableNames()
            r1 = r8
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = r1.toLowerCase()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Ld2
            r0 = r5
            r1 = r8
            r2 = 0
            lombok.installer.IdeLocation r0 = r0.findEclipseIniFromExe(r1, r2)
            return r0
        Ld2:
            r0 = 0
            return r0
    }

    private lombok.installer.IdeLocation findEclipseIniFromExe(java.io.File r8, int r9) throws lombok.installer.CorruptedIdeLocationException {
            r7 = this;
            r0 = r7
            lombok.installer.eclipse.EclipseProductDescriptor r0 = r0.descriptor
            java.lang.String r0 = r0.getIniFileName()
            r10 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r8
            java.io.File r2 = r2.getParentFile()
            r3 = r10
            r1.<init>(r2, r3)
            r11 = r0
            r0 = r11
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L2b
            r0 = r7
            r1 = r8
            java.lang.String r1 = lombok.installer.IdeLocation.canonical(r1)
            r2 = r11
            lombok.installer.IdeLocation r0 = r0.makeLocation(r1, r2)
            return r0
        L2b:
            r0 = r7
            lombok.installer.eclipse.EclipseProductDescriptor r0 = r0.descriptor
            java.lang.String r0 = r0.getMacAppName()
            r11 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r8
            java.io.File r2 = r2.getParentFile()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r5 = r11
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.<init>(r5)
            java.lang.String r4 = "/Contents/MacOS/"
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r10
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r12
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L6e
            r0 = r7
            r1 = r8
            java.lang.String r1 = lombok.installer.IdeLocation.canonical(r1)
            r2 = r12
            lombok.installer.IdeLocation r0 = r0.makeLocation(r1, r2)
            return r0
        L6e:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r8
            java.io.File r2 = r2.getParentFile()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r5 = r11
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.<init>(r5)
            java.lang.String r4 = "/Contents/Eclipse/"
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r10
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r12
            boolean r0 = r0.isFile()
            if (r0 == 0) goto La6
            r0 = r7
            r1 = r8
            java.lang.String r1 = lombok.installer.IdeLocation.canonical(r1)
            r2 = r12
            lombok.installer.IdeLocation r0 = r0.makeLocation(r1, r2)
            return r0
        La6:
            r0 = r9
            r1 = 50
            if (r0 >= r1) goto Le1
            r0 = r8
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.io.IOException -> Le0
            r12 = r0
            r0 = r8
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.io.IOException -> Le0
            r13 = r0
            r0 = r12
            r1 = r13
            boolean r0 = r0.equals(r1)     // Catch: java.io.IOException -> Le0
            if (r0 != 0) goto Le1
            r0 = r7
            java.io.File r1 = new java.io.File     // Catch: lombok.installer.CorruptedIdeLocationException -> Ldc java.io.IOException -> Le0
            r2 = r1
            r3 = r13
            r2.<init>(r3)     // Catch: lombok.installer.CorruptedIdeLocationException -> Ldc java.io.IOException -> Le0
            r2 = r9
            r3 = 1
            int r2 = r2 + r3
            lombok.installer.IdeLocation r0 = r0.findEclipseIniFromExe(r1, r2)     // Catch: lombok.installer.CorruptedIdeLocationException -> Ldc java.io.IOException -> Le0
            r14 = r0
            r0 = r14
            if (r0 == 0) goto Le1
            r0 = r14
            return r0
        Ldc:
            goto Le1
        Le0:
        Le1:
            r0 = r8
            java.lang.String r0 = r0.getAbsolutePath()
            r12 = r0
            r0 = r8
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.io.IOException -> Lf0
            r12 = r0
            goto Lf1
        Lf0:
        Lf1:
            r0 = r7
            lombok.installer.eclipse.EclipseProductDescriptor r0 = r0.descriptor
            java.lang.String r0 = r0.getUnixAppName()
            r13 = r0
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "/usr/bin/"
            r2.<init>(r3)
            r2 = r13
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L147
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "/bin/"
            r2.<init>(r3)
            r2 = r13
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L147
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "/usr/local/bin/"
            r2.<init>(r3)
            r2 = r13
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20d
        L147:
            java.io.File r0 = new java.io.File
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "/usr/lib/"
            r3.<init>(r4)
            r3 = r13
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "/"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r14 = r0
            r0 = r14
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L17b
            r0 = r7
            r1 = r12
            r2 = r14
            lombok.installer.IdeLocation r0 = r0.makeLocation(r1, r2)
            return r0
        L17b:
            java.io.File r0 = new java.io.File
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "/usr/local/lib/"
            r3.<init>(r4)
            r3 = r13
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "/"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r14 = r0
            r0 = r14
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L1af
            r0 = r7
            r1 = r12
            r2 = r14
            lombok.installer.IdeLocation r0 = r0.makeLocation(r1, r2)
            return r0
        L1af:
            java.io.File r0 = new java.io.File
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "/usr/local/etc/"
            r3.<init>(r4)
            r3 = r13
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "/"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r14 = r0
            r0 = r14
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L1e3
            r0 = r7
            r1 = r12
            r2 = r14
            lombok.installer.IdeLocation r0 = r0.makeLocation(r1, r2)
            return r0
        L1e3:
            java.io.File r0 = new java.io.File
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "/etc/"
            r3.<init>(r4)
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r14 = r0
            r0 = r14
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L20d
            r0 = r7
            r1 = r12
            r2 = r14
            lombok.installer.IdeLocation r0 = r0.makeLocation(r1, r2)
            return r0
        L20d:
            r0 = 0
            return r0
    }

    private lombok.installer.IdeLocation makeLocation(java.lang.String r7, java.io.File r8) throws lombok.installer.CorruptedIdeLocationException {
            r6 = this;
            lombok.installer.eclipse.EclipseProductLocation r0 = new lombok.installer.eclipse.EclipseProductLocation
            r1 = r0
            r2 = r6
            lombok.installer.eclipse.EclipseProductDescriptor r2 = r2.descriptor
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
    }

    @Override // lombok.installer.IdeLocationProvider
    public java.util.regex.Pattern getLocationSelectors() {
            r2 = this;
            r0 = r2
            lombok.installer.eclipse.EclipseProductDescriptor r0 = r0.descriptor
            java.util.regex.Pattern r0 = r0.getLocationSelectors()
            return r0
    }

    @Override // lombok.installer.IdeLocationProvider
    public void findIdes(java.util.List<lombok.installer.IdeLocation> r5, java.util.List<lombok.installer.CorruptedIdeLocationException> r6) {
            r4 = this;
            int[] r0 = $SWITCH_TABLE$lombok$installer$OsUtils$OS()
            lombok.installer.OsUtils$OS r1 = lombok.installer.OsUtils.getOS()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L34;
                case 2: goto L24;
                case 3: goto L44;
                default: goto L44;
            }
        L24:
            lombok.installer.eclipse.EclipseProductLocationProvider$WindowsFinder r0 = new lombok.installer.eclipse.EclipseProductLocationProvider$WindowsFinder
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r1 = r5
            r2 = r6
            r0.findEclipse(r1, r2)
            goto L51
        L34:
            lombok.installer.eclipse.EclipseProductLocationProvider$MacFinder r0 = new lombok.installer.eclipse.EclipseProductLocationProvider$MacFinder
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r1 = r5
            r2 = r6
            r0.findEclipse(r1, r2)
            goto L51
        L44:
            lombok.installer.eclipse.EclipseProductLocationProvider$UnixFinder r0 = new lombok.installer.eclipse.EclipseProductLocationProvider$UnixFinder
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r1 = r5
            r2 = r6
            r0.findEclipse(r1, r2)
        L51:
            return
    }

    private java.util.List<java.io.File> transformToFiles(java.util.List<java.lang.String> r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L2d
        L13:
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r7
            java.io.File r1 = new java.io.File
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
        L2d:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L13
            r0 = r7
            return r0
    }

    private java.util.List<java.io.File> getFlatSourceLocationsOnUnix() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            java.io.File r1 = new java.io.File
            r2 = r1
            java.lang.String r3 = "/usr/bin/"
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            r0 = r7
            java.io.File r1 = new java.io.File
            r2 = r1
            java.lang.String r3 = "/usr/local/bin/"
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            r0 = r7
            java.io.File r1 = new java.io.File
            r2 = r1
            java.lang.String r3 = "user.home"
            java.lang.String r4 = "."
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            java.lang.String r4 = "bin/"
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
            r0 = r7
            return r0
    }

    private java.util.List<java.io.File> getNestedSourceLocationOnUnix() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            java.io.File r1 = new java.io.File
            r2 = r1
            java.lang.String r3 = "/usr/local/share"
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            r0 = r6
            java.io.File r1 = new java.io.File
            r2 = r1
            java.lang.String r3 = "/usr/local"
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            r0 = r6
            java.io.File r1 = new java.io.File
            r2 = r1
            java.lang.String r3 = "/usr/share"
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            r0 = r6
            return r0
    }

    private java.util.List<java.lang.String> getSourceDirsOnWindowsWithDriveLetters() {
            r5 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "C"
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            r6 = r0
            java.util.List r0 = lombok.installer.OsUtils.getDrivesOnWindows()     // Catch: java.lang.Throwable -> L15
            r6 = r0
            goto L1a
        L15:
            r7 = move-exception
            r0 = r7
            r0.printStackTrace()
        L1a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L8a
        L2d:
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r5
            lombok.installer.eclipse.EclipseProductDescriptor r0 = r0.descriptor
            java.util.List r0 = r0.getSourceDirsOnWindows()
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L80
        L4b:
            r0 = r11
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            r0 = r5
            r1 = r10
            boolean r0 = r0.isDriveSpecificOnWindows(r1)
            if (r0 != 0) goto L80
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r8
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        L80:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4b
        L8a:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2d
            r0 = r5
            lombok.installer.eclipse.EclipseProductDescriptor r0 = r0.descriptor
            java.util.List r0 = r0.getSourceDirsOnWindows()
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto Lc2
        La7:
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r5
            r1 = r8
            boolean r0 = r0.isDriveSpecificOnWindows(r1)
            if (r0 == 0) goto Lc2
            r0 = r7
            r1 = r8
            boolean r0 = r0.add(r1)
        Lc2:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto La7
            r0 = r7
            return r0
    }

    private boolean isDriveSpecificOnWindows(java.lang.String r4) {
            r3 = this;
            r0 = r4
            int r0 = r0.length()
            r1 = 1
            if (r0 <= r1) goto L14
            r0 = r4
            r1 = 1
            char r0 = r0.charAt(r1)
            r1 = 58
            if (r0 != r1) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    static /* synthetic */ java.util.List access$0(lombok.installer.eclipse.EclipseProductLocationProvider r2) {
            r0 = r2
            java.util.List r0 = r0.getNestedSourceLocationOnUnix()
            return r0
    }

    static /* synthetic */ java.util.List access$1(lombok.installer.eclipse.EclipseProductLocationProvider r2) {
            r0 = r2
            java.util.List r0 = r0.getFlatSourceLocationsOnUnix()
            return r0
    }

    static /* synthetic */ lombok.installer.eclipse.EclipseProductDescriptor access$2(lombok.installer.eclipse.EclipseProductLocationProvider r2) {
            r0 = r2
            lombok.installer.eclipse.EclipseProductDescriptor r0 = r0.descriptor
            return r0
    }

    static /* synthetic */ java.util.List access$3(lombok.installer.eclipse.EclipseProductLocationProvider r2) {
            r0 = r2
            java.util.List r0 = r0.getSourceDirsOnWindowsWithDriveLetters()
            return r0
    }

    static /* synthetic */ java.util.List access$4(lombok.installer.eclipse.EclipseProductLocationProvider r3, java.util.List r4) {
            r0 = r3
            r1 = r4
            java.util.List r0 = r0.transformToFiles(r1)
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$installer$OsUtils$OS() {
            int[] r0 = lombok.installer.eclipse.EclipseProductLocationProvider.$SWITCH_TABLE$lombok$installer$OsUtils$OS
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
            lombok.installer.eclipse.EclipseProductLocationProvider.$SWITCH_TABLE$lombok$installer$OsUtils$OS = r1
            return r0
    }
}
