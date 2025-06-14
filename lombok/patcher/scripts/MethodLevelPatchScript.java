package lombok.patcher.scripts;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/MethodLevelPatchScript.SCL.lombok */
public abstract class MethodLevelPatchScript extends lombok.patcher.PatchScript {
    private final java.util.Set<java.lang.String> affectedClasses;
    private final java.util.Collection<lombok.patcher.TargetMatcher> matchers;

    public java.lang.String describeMatchers() {
            r4 = this;
            r0 = r4
            java.util.Collection<lombok.patcher.TargetMatcher> r0 = r0.matchers
            int r0 = r0.size()
            if (r0 != 0) goto Lf
            java.lang.String r0 = "(No matchers)"
            return r0
        Lf:
            r0 = r4
            java.util.Collection<lombok.patcher.TargetMatcher> r0 = r0.matchers
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L33
            r0 = r4
            java.util.Collection<lombok.patcher.TargetMatcher> r0 = r0.matchers
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            lombok.patcher.TargetMatcher r0 = (lombok.patcher.TargetMatcher) r0
            java.lang.String r0 = r0.describe()
            return r0
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "("
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            java.util.Collection<lombok.patcher.TargetMatcher> r0 = r0.matchers
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L64
        L4a:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.patcher.TargetMatcher r0 = (lombok.patcher.TargetMatcher) r0
            r6 = r0
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.describe()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        L64:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4a
            r0 = r5
            r1 = r5
            int r1 = r1.length()
            r2 = 2
            int r1 = r1 - r2
            r0.setLength(r1)
            r0 = r5
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public MethodLevelPatchScript(java.util.Collection<lombok.patcher.TargetMatcher> r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.matchers = r1
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L34
        L1c:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.patcher.TargetMatcher r0 = (lombok.patcher.TargetMatcher) r0
            r6 = r0
            r0 = r5
            r1 = r6
            java.util.Collection r1 = r1.getAffectedClasses()
            boolean r0 = r0.addAll(r1)
        L34:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1c
            r0 = r3
            r1 = r5
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            r0.affectedClasses = r1
            return
    }

    @Override // lombok.patcher.PatchScript
    public java.util.Collection<java.lang.String> getClassesToReload() {
            r2 = this;
            r0 = r2
            java.util.Set<java.lang.String> r0 = r0.affectedClasses
            return r0
    }

    @Override // lombok.patcher.PatchScript
    public boolean wouldPatch(java.lang.String r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            java.util.Set<java.lang.String> r1 = r1.affectedClasses
            boolean r0 = classMatches(r0, r1)
            return r0
    }

    @Override // lombok.patcher.PatchScript
    public byte[] patch(java.lang.String r6, byte[] r7, lombok.patcher.TransplantMapper r8) {
            r5 = this;
            r0 = r6
            r1 = r5
            java.util.Set<java.lang.String> r1 = r1.affectedClasses
            boolean r0 = classMatches(r0, r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r5
            r1 = r7
            r2 = 1
            r3 = r8
            byte[] r0 = r0.runASM(r1, r2, r3)
            return r0
    }

    @Override // lombok.patcher.PatchScript
    protected final org.objectweb.asm.ClassVisitor createClassVisitor(org.objectweb.asm.ClassWriter r6, java.lang.String r7, lombok.patcher.TransplantMapper r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            lombok.patcher.PatchScript$MethodPatcher r0 = r0.createPatcher(r1, r2, r3)
            r9 = r0
            r0 = r5
            java.util.Collection<lombok.patcher.TargetMatcher> r0 = r0.matchers
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L2a
        L17:
            r0 = r11
            java.lang.Object r0 = r0.next()
            lombok.patcher.TargetMatcher r0 = (lombok.patcher.TargetMatcher) r0
            r10 = r0
            r0 = r9
            r1 = r10
            r0.addTargetMatcher(r1)
        L2a:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L17
            r0 = r9
            return r0
    }

    protected abstract lombok.patcher.PatchScript.MethodPatcher createPatcher(org.objectweb.asm.ClassWriter r1, java.lang.String r2, lombok.patcher.TransplantMapper r3);
}
