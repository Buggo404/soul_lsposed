package lombok.javac.apt;

@java.lang.Deprecated
@javax.annotation.processing.SupportedAnnotationTypes({"*"})
/* loaded from: classes.dex */
public class Processor extends javax.annotation.processing.AbstractProcessor {
    public Processor() {
            r0 = this;
            r0.<init>()
            return
    }

    private void addStacktrace(java.lang.StringBuilder r7) {
            r6 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r1 = "\n"
            if (r0 == 0) goto L34
            java.lang.String r2 = "Called from\n"
            r7.append(r2)
            r2 = 1
        L12:
            int r3 = r0.length
            if (r2 < r3) goto L16
            goto L39
        L16:
            r3 = r0[r2]
            java.lang.String r4 = r3.getClassName()
            java.lang.String r5 = "lombok.javac.apt.Processor"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L31
            java.lang.String r4 = "- "
            java.lang.StringBuilder r4 = r7.append(r4)
            java.lang.StringBuilder r3 = r4.append(r3)
            r3.append(r1)
        L31:
            int r2 = r2 + 1
            goto L12
        L34:
            java.lang.String r0 = "No stacktrace available\n"
            r7.append(r0)
        L39:
            r7.append(r1)
            return
    }

    private java.lang.String collectData(javax.annotation.processing.ProcessingEnvironment r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Problem report for usages of 'lombok.javac.apt.Processor'\n\n"
            r0.append(r1)
            r2.listOptions(r0, r3)
            javax.annotation.processing.Filer r3 = r3.getFiler()
            r2.findServices(r0, r3)
            r2.addStacktrace(r0)
            r2.listProperties(r0)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String escape(char r2) {
            r0 = 12
            if (r2 == r0) goto L46
            r0 = 13
            if (r2 == r0) goto L43
            r0 = 34
            if (r2 == r0) goto L40
            r0 = 39
            if (r2 == r0) goto L3d
            r0 = 92
            if (r2 == r0) goto L3a
            switch(r2) {
                case 8: goto L37;
                case 9: goto L34;
                case 10: goto L31;
                default: goto L17;
            }
        L17:
            r0 = 32
            if (r2 >= r0) goto L2c
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            java.lang.String r2 = "\\%03o"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
        L2c:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
        L31:
            java.lang.String r2 = "\\n"
            return r2
        L34:
            java.lang.String r2 = "\\t"
            return r2
        L37:
            java.lang.String r2 = "\\b"
            return r2
        L3a:
            java.lang.String r2 = "\\\\"
            return r2
        L3d:
            java.lang.String r2 = "\\'"
            return r2
        L40:
            java.lang.String r2 = "\\\""
            return r2
        L43:
            java.lang.String r2 = "\\r"
            return r2
        L46:
            java.lang.String r2 = "\\f"
            return r2
    }

    private void findServices(java.lang.StringBuilder r8, javax.annotation.processing.Filer r9) {
            r7 = this;
            java.lang.String r0 = "\n"
            java.lang.Class<com.sun.tools.javac.processing.JavacFiler> r1 = com.sun.tools.javac.processing.JavacFiler.class
            java.lang.String r2 = "fileManager"
            java.lang.reflect.Field r1 = lombok.permit.Permit.getField(r1, r2)     // Catch: java.lang.Exception -> Lac
            java.lang.Object r9 = r1.get(r9)     // Catch: java.lang.Exception -> Lac
            javax.tools.JavaFileManager r9 = (javax.tools.JavaFileManager) r9     // Catch: java.lang.Exception -> Lac
            javax.tools.StandardLocation r1 = javax.tools.StandardLocation.ANNOTATION_PROCESSOR_PATH     // Catch: java.lang.Exception -> Lac
            boolean r1 = r9.hasLocation(r1)     // Catch: java.lang.Exception -> Lac
            if (r1 == 0) goto L1f
            javax.tools.StandardLocation r1 = javax.tools.StandardLocation.ANNOTATION_PROCESSOR_PATH     // Catch: java.lang.Exception -> Lac
        L1a:
            java.lang.ClassLoader r9 = r9.getClassLoader(r1)     // Catch: java.lang.Exception -> Lac
            goto L22
        L1f:
            javax.tools.StandardLocation r1 = javax.tools.StandardLocation.CLASS_PATH     // Catch: java.lang.Exception -> Lac
            goto L1a
        L22:
            java.lang.String r1 = "META-INF/services/javax.annotation.processing.Processor"
            java.util.Enumeration r9 = r9.getResources(r1)     // Catch: java.lang.Exception -> Lac
            boolean r1 = r9.hasMoreElements()     // Catch: java.lang.Exception -> Lac
            if (r1 != 0) goto L34
            java.lang.String r9 = "No processors discovered\n\n"
            r8.append(r9)     // Catch: java.lang.Exception -> Lac
            return
        L34:
            java.lang.String r1 = "Discovered processors:\n"
            r8.append(r1)     // Catch: java.lang.Exception -> Lac
        L39:
            boolean r1 = r9.hasMoreElements()     // Catch: java.lang.Exception -> Lac
            if (r1 != 0) goto L40
            goto Lb1
        L40:
            java.lang.Object r1 = r9.nextElement()     // Catch: java.lang.Exception -> Lac
            java.net.URL r1 = (java.net.URL) r1     // Catch: java.lang.Exception -> Lac
            java.lang.String r2 = "- '"
            java.lang.StringBuilder r2 = r8.append(r2)     // Catch: java.lang.Exception -> Lac
            java.lang.StringBuilder r2 = r2.append(r1)     // Catch: java.lang.Exception -> Lac
            java.lang.String r3 = "'"
            r2.append(r3)     // Catch: java.lang.Exception -> Lac
            java.lang.Object r1 = r1.getContent()     // Catch: java.lang.Exception -> Lac
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.lang.Exception -> Lac
            if (r1 == 0) goto L39
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> La7
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch: java.lang.Throwable -> La7
            r3.<init>()     // Catch: java.lang.Throwable -> La7
            r4 = 8192(0x2000, float:1.14794E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> La7
        L6d:
            int r5 = r2.read(r4)     // Catch: java.lang.Throwable -> La7
            r6 = -1
            if (r5 != r6) goto La2
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = "lombok.javac.apt.Processor"
            boolean r3 = r2.contains(r3)     // Catch: java.lang.Throwable -> La7
            if (r3 == 0) goto L86
            java.lang.String r3 = " <= problem\n"
            r8.append(r3)     // Catch: java.lang.Throwable -> La7
            goto L8b
        L86:
            java.lang.String r3 = " (ok)\n"
            r8.append(r3)     // Catch: java.lang.Throwable -> La7
        L8b:
            java.lang.String r3 = "    "
            java.lang.StringBuilder r3 = r8.append(r3)     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = "\n    "
            java.lang.String r2 = r2.replace(r0, r4)     // Catch: java.lang.Throwable -> La7
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch: java.lang.Throwable -> La7
            r2.append(r0)     // Catch: java.lang.Throwable -> La7
            r1.close()     // Catch: java.lang.Exception -> Lac
            goto L39
        La2:
            r6 = 0
            r3.write(r4, r6, r5)     // Catch: java.lang.Throwable -> La7
            goto L6d
        La7:
            r9 = move-exception
            r1.close()     // Catch: java.lang.Exception -> Lac
            throw r9     // Catch: java.lang.Exception -> Lac
        Lac:
            java.lang.String r9 = "Filer information unavailable\n"
            r8.append(r9)
        Lb1:
            r8.append(r0)
            return
    }

    private void listOptions(java.lang.StringBuilder r4, javax.annotation.processing.ProcessingEnvironment r5) {
            r3 = this;
            com.sun.tools.javac.processing.JavacProcessingEnvironment r5 = (com.sun.tools.javac.processing.JavacProcessingEnvironment) r5     // Catch: java.lang.Exception -> L63
            com.sun.tools.javac.util.Context r5 = r5.getContext()     // Catch: java.lang.Exception -> L63
            com.sun.tools.javac.util.Options r5 = com.sun.tools.javac.util.Options.instance(r5)     // Catch: java.lang.Exception -> L63
            java.lang.Class<com.sun.tools.javac.util.Options> r0 = com.sun.tools.javac.util.Options.class
            java.lang.String r1 = "values"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> L63
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Exception -> L63
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L63
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Exception -> L63
            if (r0 == 0) goto L24
            java.lang.String r5 = "Options: empty\n\n"
            r4.append(r5)     // Catch: java.lang.Exception -> L63
            return
        L24:
            java.lang.String r0 = "Compiler Options:\n"
            r4.append(r0)     // Catch: java.lang.Exception -> L63
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Exception -> L63
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L63
        L31:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Exception -> L63
            java.lang.String r1 = "\n"
            if (r0 != 0) goto L3d
            r4.append(r1)     // Catch: java.lang.Exception -> L63
            goto L68
        L3d:
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Exception -> L63
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Exception -> L63
            java.lang.String r2 = "- "
            r4.append(r2)     // Catch: java.lang.Exception -> L63
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Exception -> L63
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L63
            string(r4, r2)     // Catch: java.lang.Exception -> L63
            java.lang.String r2 = " = "
            r4.append(r2)     // Catch: java.lang.Exception -> L63
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L63
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L63
            string(r4, r0)     // Catch: java.lang.Exception -> L63
            r4.append(r1)     // Catch: java.lang.Exception -> L63
            goto L31
        L63:
            java.lang.String r5 = "No options available\n\n"
            r4.append(r5)
        L68:
            return
    }

    private void listProperties(java.lang.StringBuilder r6) {
            r5 = this;
            java.util.Properties r0 = java.lang.System.getProperties()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r0 = r0.stringPropertyNames()
            r1.<init>(r0)
            java.util.Collections.sort(r1)
            java.lang.String r0 = "Properties: \n"
            r6.append(r0)
            java.util.Iterator r0 = r1.iterator()
        L19:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "\n"
            if (r1 != 0) goto L25
            r6.append(r2)
            return
        L25:
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "user."
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L34
            goto L19
        L34:
            java.lang.String r3 = "- "
            java.lang.StringBuilder r3 = r6.append(r3)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = " = "
            r3.append(r4)
            java.lang.String r1 = java.lang.System.getProperty(r1)
            string(r6, r1)
            r6.append(r2)
            goto L19
    }

    private java.lang.String report(javax.annotation.processing.ProcessingEnvironment r3) {
            r2 = this;
            java.lang.String r3 = r2.collectData(r3)
            java.lang.String r3 = r2.writeFile(r3)     // Catch: java.lang.Exception -> L9
            return r3
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Report:\n\n"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private static void string(java.lang.StringBuilder r3, java.lang.String r4) {
            if (r4 != 0) goto L8
            java.lang.String r4 = "null"
            r3.append(r4)
            return
        L8:
            java.lang.String r0 = "\""
            r3.append(r0)
            r1 = 0
        Le:
            int r2 = r4.length()
            if (r1 < r2) goto L18
            r3.append(r0)
            return
        L18:
            char r2 = r4.charAt(r1)
            java.lang.String r2 = escape(r2)
            r3.append(r2)
            int r1 = r1 + 1
            goto Le
    }

    private java.lang.String writeFile(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "lombok-processor-report-"
            java.lang.String r1 = ".txt"
            java.io.File r0 = java.io.File.createTempFile(r0, r1)
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r0)
            r1.<init>(r2)
            r1.write(r4)
            r1.close()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Report written to '"
            r4.<init>(r1)
            java.lang.String r0 = r0.getCanonicalPath()
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = "'\n"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
    }

    public javax.lang.model.SourceVersion getSupportedSourceVersion() {
            r1 = this;
            javax.lang.model.SourceVersion r0 = javax.lang.model.SourceVersion.latest()
            return r0
    }

    public void init(javax.annotation.processing.ProcessingEnvironment r5) {
            r4 = this;
            super.init(r5)
            java.lang.String r0 = "lombok.disable"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto Lc
            return
        Lc:
            javax.annotation.processing.Messager r0 = r5.getMessager()
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.WARNING
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Wrong usage of 'lombok.javac.apt.Processor'. "
            r2.<init>(r3)
            java.lang.String r5 = r4.report(r5)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r0.printMessage(r1, r5)
            return
    }

    public boolean process(java.util.Set<? extends javax.lang.model.element.TypeElement> r1, javax.annotation.processing.RoundEnvironment r2) {
            r0 = this;
            r1 = 0
            return r1
    }
}
