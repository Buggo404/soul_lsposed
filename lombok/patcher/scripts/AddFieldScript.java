package lombok.patcher.scripts;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/AddFieldScript.SCL.lombok */
public class AddFieldScript extends lombok.patcher.PatchScript {
    private final int accessFlags;
    private final java.util.List<java.lang.String> targetClasses;
    private final java.lang.String fieldName;
    private final java.lang.String fieldType;
    private final java.lang.Object value;


    @Override // lombok.patcher.PatchScript
    public java.lang.String getPatchScriptName() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "AddField: "
            r1.<init>(r2)
            r1 = r4
            java.lang.String r1 = r1.fieldType
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.fieldName
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "to "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.util.List<java.lang.String> r1 = r1.targetClasses
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    AddFieldScript(java.util.List<java.lang.String> r5, int r6, java.lang.String r7, java.lang.String r8, java.lang.Object r9) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r5
            if (r0 != 0) goto L12
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "targetClass"
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r7
            if (r0 != 0) goto L20
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "fieldName"
            r1.<init>(r2)
            throw r0
        L20:
            r0 = r8
            if (r0 != 0) goto L2f
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "typeSpec"
            r1.<init>(r2)
            throw r0
        L2f:
            r0 = r4
            r1 = r6
            r0.accessFlags = r1
            r0 = r4
            r1 = r5
            r0.targetClasses = r1
            r0 = r4
            r1 = r7
            r0.fieldName = r1
            r0 = r4
            r1 = r8
            r0.fieldType = r1
            r0 = r4
            r1 = r9
            r0.value = r1
            return
    }

    @Override // lombok.patcher.PatchScript
    public boolean wouldPatch(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.List<java.lang.String> r0 = r0.targetClasses
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L21
        Ld:
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            r0 = r4
            r1 = r5
            boolean r0 = lombok.patcher.MethodTarget.typeMatches(r0, r1)
            if (r0 == 0) goto L21
            r0 = 1
            return r0
        L21:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
    }

    @Override // lombok.patcher.PatchScript
    public byte[] patch(java.lang.String r6, byte[] r7, lombok.patcher.TransplantMapper r8) {
            r5 = this;
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.targetClasses
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L2b
        Le:
            r0 = r10
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r6
            r1 = r9
            boolean r0 = lombok.patcher.MethodTarget.typeMatches(r0, r1)
            if (r0 == 0) goto L2b
            r0 = r5
            r1 = r7
            r2 = 0
            r3 = r8
            byte[] r0 = r0.runASM(r1, r2, r3)
            return r0
        L2b:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Le
            r0 = 0
            return r0
    }

    @Override // lombok.patcher.PatchScript
    protected org.objectweb.asm.ClassVisitor createClassVisitor(org.objectweb.asm.ClassWriter r7, java.lang.String r8, lombok.patcher.TransplantMapper r9) {
            r6 = this;
            lombok.patcher.scripts.AddFieldScript$1 r0 = new lombok.patcher.scripts.AddFieldScript$1
            r1 = r0
            r2 = r6
            r3 = 589824(0x90000, float:8.2652E-40)
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
    }

    @Override // lombok.patcher.PatchScript
    public java.util.Collection<java.lang.String> getClassesToReload() {
            r2 = this;
            r0 = r2
            java.util.List<java.lang.String> r0 = r0.targetClasses
            return r0
    }

    static /* synthetic */ java.lang.String access$0(lombok.patcher.scripts.AddFieldScript r2) {
            r0 = r2
            java.lang.String r0 = r0.fieldName
            return r0
    }

    static /* synthetic */ int access$1(lombok.patcher.scripts.AddFieldScript r2) {
            r0 = r2
            int r0 = r0.accessFlags
            return r0
    }

    static /* synthetic */ java.lang.String access$2(lombok.patcher.scripts.AddFieldScript r2) {
            r0 = r2
            java.lang.String r0 = r0.fieldType
            return r0
    }

    static /* synthetic */ java.lang.Object access$3(lombok.patcher.scripts.AddFieldScript r2) {
            r0 = r2
            java.lang.Object r0 = r0.value
            return r0
    }
}
