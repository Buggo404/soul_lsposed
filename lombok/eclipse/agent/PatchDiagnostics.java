package lombok.eclipse.agent;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchDiagnostics.SCL.lombok */
public class PatchDiagnostics {
    public PatchDiagnostics() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static boolean setSourceRangeCheck(java.lang.Object r6, int r7, int r8) {
            r0 = r7
            if (r0 < 0) goto L5f
            r0 = r8
            if (r0 >= 0) goto L5f
            r0 = r6
            if (r0 != 0) goto L12
            java.lang.String r0 = "(NULL NODE)"
            r9 = r0
            goto L30
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r6
            java.lang.Class r1 = r1.getClass()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9 = r0
        L30:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "startPos = "
            r3.<init>(r4)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " and length is "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ".\n"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "This breaks the rule that lengths are not allowed to be negative. Affected Node:\n"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L5f:
            r0 = r7
            if (r0 >= 0) goto Lbe
            r0 = r8
            if (r0 == 0) goto Lbe
            r0 = r6
            if (r0 != 0) goto L71
            java.lang.String r0 = "(NULL NODE)"
            r9 = r0
            goto L8f
        L71:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r6
            java.lang.Class r1 = r1.getClass()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9 = r0
        L8f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "startPos = "
            r3.<init>(r4)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " and length is "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ".\n"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "This breaks the rule that length must be 0 if startPosition is negative. Affected Node:\n"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lbe:
            r0 = 0
            return r0
    }
}
