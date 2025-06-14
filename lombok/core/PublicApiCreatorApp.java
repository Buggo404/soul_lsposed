package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/PublicApiCreatorApp.SCL.lombok */
public class PublicApiCreatorApp extends lombok.core.LombokApp {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/PublicApiCreatorApp$Fail.SCL.lombok */
    private static class Fail extends java.lang.Exception {
        Fail(java.lang.String r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }
    }

    public PublicApiCreatorApp() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.core.LombokApp
    public java.lang.String getAppName() {
            r2 = this;
            java.lang.String r0 = "publicApi"
            return r0
    }

    @Override // lombok.core.LombokApp
    public java.lang.String getAppDescription() {
            r2 = this;
            java.lang.String r0 = "Creates a small lombok-api.jar with the annotations and other public API\nclasses of all lombok features. This is primarily useful to include in your\nandroid projects."
            return r0
    }

    @Override // lombok.core.LombokApp
    public int runApp(java.util.List<java.lang.String> r6) throws java.lang.Exception {
            r5 = this;
            java.lang.String r0 = "."
            r7 = r0
            r0 = r6
            int r0 = r0.size()
            switch(r0) {
                case 0: goto L20;
                case 1: goto L23;
                default: goto L31;
            }
        L20:
            goto L3b
        L23:
            r0 = r6
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            goto L3b
        L31:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Supply 1 path to specify the directory where lombok-api.jar will be created. No path means the current directory is used."
            r0.println(r1)
            r0 = 1
            return r0
        L3b:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r7
            java.lang.String r3 = "lombok-api.jar"
            r1.<init>(r2, r3)
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r5
            r1 = r8
            int r0 = r0.writeApiJar(r1)     // Catch: java.lang.Exception -> L53
            r9 = r0
            goto L7a
        L53:
            r10 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "ERROR: Creating "
            r2.<init>(r3)
            r2 = r8
            java.lang.String r2 = canonical(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " failed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r10
            r0.printStackTrace()
            r0 = 1
            return r0
        L7a:
            r0 = r9
            return r0
    }

    private static java.io.File findOurJar() {
            java.io.File r0 = new java.io.File
            r1 = r0
            java.lang.Class<lombok.core.PublicApiCreatorApp> r2 = lombok.core.PublicApiCreatorApp.class
            java.lang.String r2 = lombok.patcher.ClassRootFinder.findClassRootOfClass(r2)
            r1.<init>(r2)
            return r0
    }

    private int writeApiJar(java.io.File r9) throws java.lang.Exception {
            r8 = this;
            java.io.File r0 = findOurJar()
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L12
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "The publicApi option only works if lombok is a jar."
            r0.println(r1)
            r0 = 2
            return r0
        L12:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
            java.util.jar.JarFile r0 = new java.util.jar.JarFile
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r12 = r0
            r0 = r12
            java.util.Enumeration r0 = r0.entries()     // Catch: java.lang.Throwable -> Ld2
            r13 = r0
            goto Lc5
        L2e:
            r0 = r13
            java.lang.Object r0 = r0.nextElement()     // Catch: java.lang.Throwable -> Ld2
            java.util.jar.JarEntry r0 = (java.util.jar.JarEntry) r0     // Catch: java.lang.Throwable -> Ld2
            r14 = r0
            r0 = r14
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Ld2
            r15 = r0
            r0 = r15
            java.lang.String r1 = "lombok/"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> Ld2
            if (r0 != 0) goto L4e
            goto Lc5
        L4e:
            r0 = r15
            java.lang.String r1 = "/package-info.class"
            boolean r0 = r0.endsWith(r1)     // Catch: java.lang.Throwable -> Ld2
            if (r0 == 0) goto L5b
            goto Lc5
        L5b:
            r0 = r15
            java.lang.String r1 = ".class"
            boolean r0 = r0.endsWith(r1)     // Catch: java.lang.Throwable -> Ld2
            if (r0 != 0) goto L68
            goto Lc5
        L68:
            r0 = r15
            r1 = 7
            r2 = r15
            int r2 = r2.length()     // Catch: java.lang.Throwable -> Ld2
            r3 = 6
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)     // Catch: java.lang.Throwable -> Ld2
            r16 = r0
            r0 = r16
            r1 = 47
            int r0 = r0.indexOf(r1)     // Catch: java.lang.Throwable -> Ld2
            r17 = r0
            r0 = r17
            r1 = -1
            if (r0 != r1) goto L9e
            r0 = r16
            java.lang.String r1 = "ConfigurationKeys"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> Ld2
            if (r0 != 0) goto Lc5
            r0 = r11
            r1 = r15
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> Ld2
            goto Lc5
        L9e:
            r0 = r16
            r1 = 0
            r2 = r17
            java.lang.String r0 = r0.substring(r1, r2)     // Catch: java.lang.Throwable -> Ld2
            r18 = r0
            java.lang.String r0 = "extern"
            r1 = r18
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Ld2
            if (r0 != 0) goto Lbc
            java.lang.String r0 = "experimental"
            r1 = r18
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Ld2
            if (r0 == 0) goto Lc5
        Lbc:
            r0 = r11
            r1 = r15
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> Ld2
        Lc5:
            r0 = r13
            boolean r0 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> Ld2
            if (r0 != 0) goto L2e
            goto Ldc
        Ld2:
            r19 = move-exception
            r0 = r12
            r0.close()
            r0 = r19
            throw r0
        Ldc:
            r0 = r12
            r0.close()
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf4
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Not generating lombok-api.jar: No lombok api classes required!"
            r0.println(r1)
            r0 = 1
            return r0
        Lf4:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r13 = r0
            r0 = 0
            r14 = r0
            java.util.jar.JarOutputStream r0 = new java.util.jar.JarOutputStream     // Catch: java.lang.Throwable -> L1ab
            r1 = r0
            r2 = r13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1ab
            r15 = r0
            r0 = r11
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1ab
            r17 = r0
            goto L17c
        L117:
            r0 = r17
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1ab
            r16 = r0
            java.lang.Class<lombok.Lombok> r0 = lombok.Lombok.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ab
            r2 = r1
            java.lang.String r3 = "/"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1ab
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1ab
            java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch: java.lang.Throwable -> L1ab
            r18 = r0
            r0 = r18
            if (r0 != 0) goto L156
            lombok.core.PublicApiCreatorApp$Fail r0 = new lombok.core.PublicApiCreatorApp$Fail     // Catch: java.lang.Throwable -> L163 java.lang.Throwable -> L1ab
            r1 = r0
            java.lang.String r2 = "api class %s cannot be found"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L163 java.lang.Throwable -> L1ab
            r4 = r3
            r5 = 0
            r6 = r16
            r4[r5] = r6     // Catch: java.lang.Throwable -> L163 java.lang.Throwable -> L1ab
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> L163 java.lang.Throwable -> L1ab
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L163 java.lang.Throwable -> L1ab
            throw r0     // Catch: java.lang.Throwable -> L163 java.lang.Throwable -> L1ab
        L156:
            r0 = r8
            r1 = r15
            r2 = r16
            r3 = r18
            r0.writeIntoJar(r1, r2, r3)     // Catch: java.lang.Throwable -> L163 java.lang.Throwable -> L1ab
            goto L172
        L163:
            r19 = move-exception
            r0 = r18
            if (r0 == 0) goto L16f
            r0 = r18
            r0.close()     // Catch: java.lang.Throwable -> L1ab
        L16f:
            r0 = r19
            throw r0     // Catch: java.lang.Throwable -> L1ab
        L172:
            r0 = r18
            if (r0 == 0) goto L17c
            r0 = r18
            r0.close()     // Catch: java.lang.Throwable -> L1ab
        L17c:
            r0 = r17
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L1ab
            if (r0 != 0) goto L117
            r0 = r15
            r0.close()     // Catch: java.lang.Throwable -> L1ab
            r0 = r13
            r0.close()     // Catch: java.lang.Throwable -> L1ab
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L1ab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ab
            r2 = r1
            java.lang.String r3 = "Successfully created: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1ab
            r2 = r9
            java.lang.String r2 = canonical(r2)     // Catch: java.lang.Throwable -> L1ab
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1ab
            r0.println(r1)     // Catch: java.lang.Throwable -> L1ab
            r0 = 0
            return r0
        L1ab:
            r15 = move-exception
            r0 = r13
            r0.close()     // Catch: java.lang.Throwable -> L1b5
            goto L1b6
        L1b5:
        L1b6:
            r0 = r14
            if (r0 != 0) goto L1c0
            r0 = r9
            boolean r0 = r0.delete()
        L1c0:
            r0 = r15
            boolean r0 = r0 instanceof lombok.core.PublicApiCreatorApp.Fail
            if (r0 == 0) goto L1d5
            java.io.PrintStream r0 = java.lang.System.err
            r1 = r15
            java.lang.String r1 = r1.getMessage()
            r0.println(r1)
            r0 = 1
            return r0
        L1d5:
            r0 = r15
            boolean r0 = r0 instanceof java.lang.Exception
            if (r0 == 0) goto L1e3
            r0 = r15
            java.lang.Exception r0 = (java.lang.Exception) r0
            throw r0
        L1e3:
            r0 = r15
            boolean r0 = r0 instanceof java.lang.Error
            if (r0 == 0) goto L1f1
            r0 = r15
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L1f1:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            r2 = r15
            r1.<init>(r2)
            throw r0
    }

    private void writeIntoJar(java.util.jar.JarOutputStream r6, java.lang.String r7, java.io.InputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r6
            java.util.zip.ZipEntry r1 = new java.util.zip.ZipEntry
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.putNextEntry(r1)
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r0 = new byte[r0]
            r9 = r0
        L13:
            r0 = r8
            r1 = r9
            int r0 = r0.read(r1)
            r10 = r0
            r0 = r10
            r1 = -1
            if (r0 != r1) goto L24
            goto L30
        L24:
            r0 = r6
            r1 = r9
            r2 = 0
            r3 = r10
            r0.write(r1, r2, r3)
            goto L13
        L30:
            r0 = r6
            r0.closeEntry()
            r0 = r8
            r0.close()
            return
    }

    private static java.lang.String canonical(java.io.File r2) {
            r0 = r2
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = r2
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }
}
