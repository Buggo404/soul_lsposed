package lombok.delombok.ant;

/* loaded from: com.usidqw.qwerklj.apk:lombok/delombok/ant/DelombokTaskImpl.SCL.lombok */
public class DelombokTaskImpl {
    private java.io.File fromDir;
    private java.io.File toDir;
    private org.apache.tools.ant.types.Path classpath;
    private org.apache.tools.ant.types.Path sourcepath;
    private org.apache.tools.ant.types.Path modulepath;
    private boolean verbose;
    private java.lang.String encoding;
    private org.apache.tools.ant.types.Path path;
    private java.util.List<java.lang.String> formatOptions;

    public DelombokTaskImpl() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.formatOptions = r1
            return
    }

    public void execute(org.apache.tools.ant.Location r7) throws org.apache.tools.ant.BuildException {
            r6 = this;
            r0 = r6
            java.io.File r0 = r0.fromDir
            if (r0 != 0) goto L18
            r0 = r6
            org.apache.tools.ant.types.Path r0 = r0.path
            if (r0 != 0) goto L18
            org.apache.tools.ant.BuildException r0 = new org.apache.tools.ant.BuildException
            r1 = r0
            java.lang.String r2 = "Either 'from' attribute, or nested <fileset> tags are required."
            r1.<init>(r2)
            throw r0
        L18:
            r0 = r6
            java.io.File r0 = r0.fromDir
            if (r0 == 0) goto L30
            r0 = r6
            org.apache.tools.ant.types.Path r0 = r0.path
            if (r0 == 0) goto L30
            org.apache.tools.ant.BuildException r0 = new org.apache.tools.ant.BuildException
            r1 = r0
            java.lang.String r2 = "You can't specify both 'from' attribute and nested filesets. You need one or the other."
            r1.<init>(r2)
            throw r0
        L30:
            r0 = r6
            java.io.File r0 = r0.toDir
            if (r0 != 0) goto L41
            org.apache.tools.ant.BuildException r0 = new org.apache.tools.ant.BuildException
            r1 = r0
            java.lang.String r2 = "The to attribute is required."
            r1.<init>(r2)
            throw r0
        L41:
            lombok.delombok.Delombok r0 = new lombok.delombok.Delombok
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r6
            boolean r0 = r0.verbose
            if (r0 == 0) goto L55
            r0 = r8
            r1 = 1
            r0.setVerbose(r1)
        L55:
            r0 = r6
            java.lang.String r0 = r0.encoding     // Catch: java.nio.charset.UnsupportedCharsetException -> L67
            if (r0 == 0) goto L84
            r0 = r8
            r1 = r6
            java.lang.String r1 = r1.encoding     // Catch: java.nio.charset.UnsupportedCharsetException -> L67
            r0.setCharset(r1)     // Catch: java.nio.charset.UnsupportedCharsetException -> L67
            goto L84
        L67:
            org.apache.tools.ant.BuildException r0 = new org.apache.tools.ant.BuildException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Unknown charset: "
            r3.<init>(r4)
            r3 = r6
            java.lang.String r3 = r3.encoding
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r7
            r1.<init>(r2, r3)
            throw r0
        L84:
            r0 = r6
            org.apache.tools.ant.types.Path r0 = r0.classpath
            if (r0 == 0) goto L96
            r0 = r8
            r1 = r6
            org.apache.tools.ant.types.Path r1 = r1.classpath
            java.lang.String r1 = r1.toString()
            r0.setClasspath(r1)
        L96:
            r0 = r6
            org.apache.tools.ant.types.Path r0 = r0.sourcepath
            if (r0 == 0) goto La8
            r0 = r8
            r1 = r6
            org.apache.tools.ant.types.Path r1 = r1.sourcepath
            java.lang.String r1 = r1.toString()
            r0.setSourcepath(r1)
        La8:
            r0 = r6
            org.apache.tools.ant.types.Path r0 = r0.modulepath
            if (r0 == 0) goto Lba
            r0 = r8
            r1 = r6
            org.apache.tools.ant.types.Path r1 = r1.modulepath
            java.lang.String r1 = r1.toString()
            r0.setModulepath(r1)
        Lba:
            r0 = r8
            r1 = r6
            java.util.List<java.lang.String> r1 = r1.formatOptions     // Catch: lombok.delombok.Delombok.InvalidFormatOptionException -> Lc8
            java.util.Map r1 = lombok.delombok.Delombok.formatOptionsToMap(r1)     // Catch: lombok.delombok.Delombok.InvalidFormatOptionException -> Lc8
            r0.setFormatPreferences(r1)     // Catch: lombok.delombok.Delombok.InvalidFormatOptionException -> Lc8
            goto Le7
        Lc8:
            r9 = move-exception
            org.apache.tools.ant.BuildException r0 = new org.apache.tools.ant.BuildException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r4 = r9
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            java.lang.String r3 = " Run java -jar lombok.jar --format-help for detailed format help."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Le7:
            r0 = r8
            r1 = r6
            java.io.File r1 = r1.toDir
            r0.setOutput(r1)
            r0 = r6
            java.io.File r0 = r0.fromDir     // Catch: java.io.IOException -> L157
            if (r0 == 0) goto L101
            r0 = r8
            r1 = r6
            java.io.File r1 = r1.fromDir     // Catch: java.io.IOException -> L157
            r0.addDirectory(r1)     // Catch: java.io.IOException -> L157
            goto L14f
        L101:
            r0 = r6
            org.apache.tools.ant.types.Path r0 = r0.path     // Catch: java.io.IOException -> L157
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L157
            r9 = r0
            goto L146
        L10c:
            r0 = r9
            java.lang.Object r0 = r0.next()     // Catch: java.io.IOException -> L157
            org.apache.tools.ant.types.resources.FileResource r0 = (org.apache.tools.ant.types.resources.FileResource) r0     // Catch: java.io.IOException -> L157
            r10 = r0
            r0 = r10
            java.io.File r0 = r0.getBaseDir()     // Catch: java.io.IOException -> L157
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L13b
            r0 = r10
            java.io.File r0 = r0.getFile()     // Catch: java.io.IOException -> L157
            r12 = r0
            r0 = r8
            r1 = r12
            java.io.File r1 = r1.getParentFile()     // Catch: java.io.IOException -> L157
            r2 = r12
            java.lang.String r2 = r2.getName()     // Catch: java.io.IOException -> L157
            r0.addFile(r1, r2)     // Catch: java.io.IOException -> L157
            goto L146
        L13b:
            r0 = r8
            r1 = r11
            r2 = r10
            java.lang.String r2 = r2.getName()     // Catch: java.io.IOException -> L157
            r0.addFile(r1, r2)     // Catch: java.io.IOException -> L157
        L146:
            r0 = r9
            boolean r0 = r0.hasNext()     // Catch: java.io.IOException -> L157
            if (r0 != 0) goto L10c
        L14f:
            r0 = r8
            boolean r0 = r0.delombok()     // Catch: java.io.IOException -> L157
            goto L164
        L157:
            r9 = move-exception
            org.apache.tools.ant.BuildException r0 = new org.apache.tools.ant.BuildException
            r1 = r0
            java.lang.String r2 = "I/O problem during delombok"
            r3 = r9
            r4 = r7
            r1.<init>(r2, r3, r4)
            throw r0
        L164:
            return
    }
}
