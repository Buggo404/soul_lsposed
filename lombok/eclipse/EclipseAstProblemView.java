package lombok.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/EclipseAstProblemView.SCL.lombok */
public class EclipseAstProblemView {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/EclipseAstProblemView$LombokProblem.SCL.lombok */
    private static class LombokProblem extends org.eclipse.jdt.internal.compiler.problem.DefaultProblem {
        private static final java.lang.String MARKER_ID = "org.eclipse.jdt.apt.pluggable.core.compileProblem";

        public LombokProblem(char[] r12, java.lang.String r13, int r14, java.lang.String[] r15, int r16, int r17, int r18, int r19, int r20) {
                r11 = this;
                r0 = r11
                r1 = r12
                r2 = r13
                r3 = r14
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r18
                r8 = r19
                r9 = r20
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }

        public int getCategoryID() {
                r2 = this;
                r0 = 0
                return r0
        }

        public java.lang.String getMarkerType() {
                r2 = this;
                java.lang.String r0 = "org.eclipse.jdt.apt.pluggable.core.compileProblem"
                return r0
        }
    }

    public EclipseAstProblemView() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void addProblemToCompilationResult(char[] r12, org.eclipse.jdt.internal.compiler.CompilationResult r13, boolean r14, java.lang.String r15, int r16, int r17) {
            r0 = r13
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r12
            if (r0 != 0) goto Lf
            java.lang.String r0 = "(unknown).java"
            char[] r0 = r0.toCharArray()
            r12 = r0
        Lf:
            r0 = 0
            r18 = r0
            r0 = 1
            r19 = r0
            r0 = 0
            r20 = r0
            r0 = r16
            if (r0 < 0) goto L32
            r0 = r16
            r1 = r13
            int[] r1 = r1.getLineSeparatorPositions()
            r2 = r1
            r20 = r2
            r2 = 0
            r3 = r20
            int r3 = r3.length
            r4 = 1
            int r3 = r3 - r4
            int r0 = org.eclipse.jdt.internal.compiler.util.Util.getLineNumber(r0, r1, r2, r3)
            goto L33
        L32:
            r0 = 0
        L33:
            r18 = r0
            r0 = r16
            if (r0 < 0) goto L48
            r0 = r13
            int[] r0 = r0.getLineSeparatorPositions()
            r1 = r18
            r2 = r16
            int r0 = org.eclipse.jdt.internal.compiler.util.Util.searchColumnNumber(r0, r1, r2)
            goto L49
        L48:
            r0 = 0
        L49:
            r19 = r0
            lombok.eclipse.EclipseAstProblemView$LombokProblem r0 = new lombok.eclipse.EclipseAstProblemView$LombokProblem
            r1 = r0
            r2 = r12
            r3 = r15
            r4 = 0
            r5 = 0
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r14
            if (r6 == 0) goto L5e
            r6 = 0
            goto L5f
        L5e:
            r6 = 1
        L5f:
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r21 = r0
            r0 = r13
            r1 = r21
            r2 = 0
            r0.record(r1, r2)
            return
    }
}
