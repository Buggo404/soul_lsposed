package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/CapturingDiagnosticListener.SCL.lombok */
public class CapturingDiagnosticListener implements javax.tools.DiagnosticListener<javax.tools.JavaFileObject> {
    private final java.io.File file;
    private final java.util.Collection<lombok.javac.CapturingDiagnosticListener.CompilerMessage> messages;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/CapturingDiagnosticListener$CompilerMessage.SCL.lombok */
    public static final class CompilerMessage {
        private final long line;
        private final long position;
        private final boolean isError;
        private final java.lang.String message;

        public CompilerMessage(long r5, long r7, boolean r9, java.lang.String r10) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.line = r1
                r0 = r4
                r1 = r7
                r0.position = r1
                r0 = r4
                r1 = r9
                r0.isError = r1
                r0 = r4
                r1 = r10
                r0.message = r1
                return
        }

        public long getLine() {
                r3 = this;
                r0 = r3
                long r0 = r0.line
                return r0
        }

        public long getPosition() {
                r3 = this;
                r0 = r3
                long r0 = r0.position
                return r0
        }

        public boolean isError() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.isError
                return r0
        }

        public java.lang.String getMessage() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.message
                return r0
        }

        public int hashCode() {
                r7 = this;
                r0 = 1
                r8 = r0
                r0 = 31
                r1 = r8
                int r0 = r0 * r1
                r1 = r7
                boolean r1 = r1.isError
                if (r1 == 0) goto L13
                r1 = 1231(0x4cf, float:1.725E-42)
                goto L16
            L13:
                r1 = 1237(0x4d5, float:1.733E-42)
            L16:
                int r0 = r0 + r1
                r8 = r0
                r0 = 31
                r1 = r8
                int r0 = r0 * r1
                r1 = r7
                long r1 = r1.line
                r2 = r7
                long r2 = r2.line
                r3 = 32
                long r2 = r2 >>> r3
                long r1 = r1 ^ r2
                int r1 = (int) r1
                int r0 = r0 + r1
                r8 = r0
                r0 = 31
                r1 = r8
                int r0 = r0 * r1
                r1 = r7
                java.lang.String r1 = r1.message
                if (r1 != 0) goto L3a
                r1 = 0
                goto L41
            L3a:
                r1 = r7
                java.lang.String r1 = r1.message
                int r1 = r1.hashCode()
            L41:
                int r0 = r0 + r1
                r8 = r0
                r0 = r8
                return r0
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                if (r0 != r1) goto L7
                r0 = 1
                return r0
            L7:
                r0 = r6
                if (r0 != 0) goto Ld
                r0 = 0
                return r0
            Ld:
                r0 = r5
                java.lang.Class r0 = r0.getClass()
                r1 = r6
                java.lang.Class r1 = r1.getClass()
                if (r0 == r1) goto L1a
                r0 = 0
                return r0
            L1a:
                r0 = r6
                lombok.javac.CapturingDiagnosticListener$CompilerMessage r0 = (lombok.javac.CapturingDiagnosticListener.CompilerMessage) r0
                r7 = r0
                r0 = r5
                boolean r0 = r0.isError
                r1 = r7
                boolean r1 = r1.isError
                if (r0 == r1) goto L2c
                r0 = 0
                return r0
            L2c:
                r0 = r5
                long r0 = r0.line
                r1 = r7
                long r1 = r1.line
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L3a
                r0 = 0
                return r0
            L3a:
                r0 = r5
                java.lang.String r0 = r0.message
                if (r0 != 0) goto L4a
                r0 = r7
                java.lang.String r0 = r0.message
                if (r0 == 0) goto L5a
                r0 = 0
                return r0
            L4a:
                r0 = r5
                java.lang.String r0 = r0.message
                r1 = r7
                java.lang.String r1 = r1.message
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L5a
                r0 = 0
                return r0
            L5a:
                r0 = 1
                return r0
        }

        public java.lang.String toString() {
                r7 = this;
                java.lang.String r0 = "%d %s %s"
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r7
                long r4 = r4.line
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                boolean r4 = r4.isError
                if (r4 == 0) goto L1e
                java.lang.String r4 = "ERROR"
                goto L20
            L1e:
                java.lang.String r4 = "WARNING"
            L20:
                r2[r3] = r4
                r2 = r1
                r3 = 2
                r4 = r7
                java.lang.String r4 = r4.message
                r2[r3] = r4
                java.lang.String r0 = java.lang.String.format(r0, r1)
                return r0
        }
    }

    public CapturingDiagnosticListener(java.io.File r4, java.util.Collection<lombok.javac.CapturingDiagnosticListener.CompilerMessage> r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.file = r1
            r0 = r3
            r1 = r5
            r0.messages = r1
            return
    }

    public void report(javax.tools.Diagnostic<? extends javax.tools.JavaFileObject> r11) {
            r10 = this;
            r0 = r11
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.getMessage(r1)
            r12 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "^"
            r1.<init>(r2)
            r1 = r10
            java.io.File r1 = r1.file
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r1 = java.util.regex.Pattern.quote(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\\s*:\\s*\\d+\\s*:\\s*(?:warning:\\s*)?(.*)$"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 32
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            r1 = r12
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r13 = r0
            r0 = r13
            boolean r0 = r0.matches()
            if (r0 == 0) goto L3f
            r0 = r13
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            r12 = r0
        L3f:
            r0 = r12
            java.lang.String r1 = "deprecated item is not annotated with @Deprecated"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L49
            return
        L49:
            r0 = r10
            java.util.Collection<lombok.javac.CapturingDiagnosticListener$CompilerMessage> r0 = r0.messages
            lombok.javac.CapturingDiagnosticListener$CompilerMessage r1 = new lombok.javac.CapturingDiagnosticListener$CompilerMessage
            r2 = r1
            r3 = r11
            long r3 = r3.getLineNumber()
            r4 = r11
            long r4 = r4.getStartPosition()
            r5 = r11
            javax.tools.Diagnostic$Kind r5 = r5.getKind()
            javax.tools.Diagnostic$Kind r6 = javax.tools.Diagnostic.Kind.ERROR
            if (r5 != r6) goto L6d
            r5 = 1
            goto L6e
        L6d:
            r5 = 0
        L6e:
            r6 = r12
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
            return
    }

    public void suppress(int r6, int r7) {
            r5 = this;
            r0 = r5
            java.util.Collection<lombok.javac.CapturingDiagnosticListener$CompilerMessage> r0 = r0.messages
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L31
        Ld:
            r0 = r8
            java.lang.Object r0 = r0.next()
            lombok.javac.CapturingDiagnosticListener$CompilerMessage r0 = (lombok.javac.CapturingDiagnosticListener.CompilerMessage) r0
            long r0 = r0.getPosition()
            r9 = r0
            r0 = r9
            r1 = r6
            long r1 = (long) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L31
            r0 = r9
            r1 = r7
            long r1 = (long) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L31
            r0 = r8
            r0.remove()
        L31:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Ld
            return
    }
}
