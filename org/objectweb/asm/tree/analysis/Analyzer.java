package org.objectweb.asm.tree.analysis;

import org.objectweb.asm.tree.analysis.Value;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/analysis/Analyzer.SCL.lombok */
public class Analyzer<V extends org.objectweb.asm.tree.analysis.Value> implements org.objectweb.asm.Opcodes {
    private final org.objectweb.asm.tree.analysis.Interpreter<V> interpreter;
    private org.objectweb.asm.tree.InsnList insnList;
    private int insnListSize;
    private java.util.List<org.objectweb.asm.tree.TryCatchBlockNode>[] handlers;
    private org.objectweb.asm.tree.analysis.Frame<V>[] frames;
    private org.objectweb.asm.tree.analysis.Subroutine[] subroutines;
    private boolean[] inInstructionsToProcess;
    private int[] instructionsToProcess;
    private int numInstructionsToProcess;

    public Analyzer(org.objectweb.asm.tree.analysis.Interpreter<V> r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.interpreter = r1
            return
    }

    public org.objectweb.asm.tree.analysis.Frame<V>[] analyze(java.lang.String r10, org.objectweb.asm.tree.MethodNode r11) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r9 = this;
            r0 = r11
            int r0 = r0.access
            r1 = 1280(0x500, float:1.794E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L18
            r0 = r9
            r1 = 0
            org.objectweb.asm.tree.analysis.Frame[] r1 = new org.objectweb.asm.tree.analysis.Frame[r1]
            r0.frames = r1
            r0 = r9
            org.objectweb.asm.tree.analysis.Frame<V extends org.objectweb.asm.tree.analysis.Value>[] r0 = r0.frames
            return r0
        L18:
            r0 = r9
            r1 = r11
            org.objectweb.asm.tree.InsnList r1 = r1.instructions
            r0.insnList = r1
            r0 = r9
            r1 = r9
            org.objectweb.asm.tree.InsnList r1 = r1.insnList
            int r1 = r1.size()
            r0.insnListSize = r1
            r0 = r9
            r1 = r9
            int r1 = r1.insnListSize
            java.util.List[] r1 = new java.util.List[r1]
            r0.handlers = r1
            r0 = r9
            r1 = r9
            int r1 = r1.insnListSize
            org.objectweb.asm.tree.analysis.Frame[] r1 = new org.objectweb.asm.tree.analysis.Frame[r1]
            r0.frames = r1
            r0 = r9
            r1 = r9
            int r1 = r1.insnListSize
            org.objectweb.asm.tree.analysis.Subroutine[] r1 = new org.objectweb.asm.tree.analysis.Subroutine[r1]
            r0.subroutines = r1
            r0 = r9
            r1 = r9
            int r1 = r1.insnListSize
            boolean[] r1 = new boolean[r1]
            r0.inInstructionsToProcess = r1
            r0 = r9
            r1 = r9
            int r1 = r1.insnListSize
            int[] r1 = new int[r1]
            r0.instructionsToProcess = r1
            r0 = r9
            r1 = 0
            r0.numInstructionsToProcess = r1
            r0 = 0
            r12 = r0
        L67:
            r0 = r12
            r1 = r11
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r1 = r1.tryCatchBlocks
            int r1 = r1.size()
            if (r0 >= r1) goto Le0
            r0 = r11
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r0 = r0.tryCatchBlocks
            r1 = r12
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TryCatchBlockNode r0 = (org.objectweb.asm.tree.TryCatchBlockNode) r0
            r13 = r0
            r0 = r9
            org.objectweb.asm.tree.InsnList r0 = r0.insnList
            r1 = r13
            org.objectweb.asm.tree.LabelNode r1 = r1.start
            int r0 = r0.indexOf(r1)
            r14 = r0
            r0 = r9
            org.objectweb.asm.tree.InsnList r0 = r0.insnList
            r1 = r13
            org.objectweb.asm.tree.LabelNode r1 = r1.end
            int r0 = r0.indexOf(r1)
            r15 = r0
            r0 = r14
            r16 = r0
        La3:
            r0 = r16
            r1 = r15
            if (r0 >= r1) goto Lda
            r0 = r9
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode>[] r0 = r0.handlers
            r1 = r16
            r0 = r0[r1]
            r17 = r0
            r0 = r17
            if (r0 != 0) goto Lca
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r9
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode>[] r0 = r0.handlers
            r1 = r16
            r2 = r17
            r0[r1] = r2
        Lca:
            r0 = r17
            r1 = r13
            boolean r0 = r0.add(r1)
            int r16 = r16 + 1
            goto La3
        Lda:
            int r12 = r12 + 1
            goto L67
        Le0:
            org.objectweb.asm.tree.analysis.Subroutine r0 = new org.objectweb.asm.tree.analysis.Subroutine
            r1 = r0
            r2 = 0
            r3 = r11
            int r3 = r3.maxLocals
            r4 = 0
            r1.<init>(r2, r3, r4)
            r12 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = r9
            r1 = 0
            r2 = r12
            r3 = r13
            r0.findSubroutine(r1, r2, r3)
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r14 = r0
        L108:
            r0 = r13
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L17f
            r0 = r13
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)
            org.objectweb.asm.tree.JumpInsnNode r0 = (org.objectweb.asm.tree.JumpInsnNode) r0
            r15 = r0
            r0 = r14
            r1 = r15
            org.objectweb.asm.tree.LabelNode r1 = r1.label
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.analysis.Subroutine r0 = (org.objectweb.asm.tree.analysis.Subroutine) r0
            r16 = r0
            r0 = r16
            if (r0 != 0) goto L16f
            org.objectweb.asm.tree.analysis.Subroutine r0 = new org.objectweb.asm.tree.analysis.Subroutine
            r1 = r0
            r2 = r15
            org.objectweb.asm.tree.LabelNode r2 = r2.label
            r3 = r11
            int r3 = r3.maxLocals
            r4 = r15
            r1.<init>(r2, r3, r4)
            r16 = r0
            r0 = r14
            r1 = r15
            org.objectweb.asm.tree.LabelNode r1 = r1.label
            r2 = r16
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r9
            r1 = r9
            org.objectweb.asm.tree.InsnList r1 = r1.insnList
            r2 = r15
            org.objectweb.asm.tree.LabelNode r2 = r2.label
            int r1 = r1.indexOf(r2)
            r2 = r16
            r3 = r13
            r0.findSubroutine(r1, r2, r3)
            goto L17c
        L16f:
            r0 = r16
            java.util.List<org.objectweb.asm.tree.JumpInsnNode> r0 = r0.callers
            r1 = r15
            boolean r0 = r0.add(r1)
        L17c:
            goto L108
        L17f:
            r0 = 0
            r15 = r0
        L182:
            r0 = r15
            r1 = r9
            int r1 = r1.insnListSize
            if (r0 >= r1) goto L1b0
            r0 = r9
            org.objectweb.asm.tree.analysis.Subroutine[] r0 = r0.subroutines
            r1 = r15
            r0 = r0[r1]
            if (r0 == 0) goto L1aa
            r0 = r9
            org.objectweb.asm.tree.analysis.Subroutine[] r0 = r0.subroutines
            r1 = r15
            r0 = r0[r1]
            org.objectweb.asm.tree.LabelNode r0 = r0.start
            if (r0 != 0) goto L1aa
            r0 = r9
            org.objectweb.asm.tree.analysis.Subroutine[] r0 = r0.subroutines
            r1 = r15
            r2 = 0
            r0[r1] = r2
        L1aa:
            int r15 = r15 + 1
            goto L182
        L1b0:
            r0 = r9
            r1 = r10
            r2 = r11
            org.objectweb.asm.tree.analysis.Frame r0 = r0.computeInitialFrame(r1, r2)
            r15 = r0
            r0 = r9
            r1 = 0
            r2 = r15
            r3 = 0
            r0.merge(r1, r2, r3)
            r0 = r9
            r1 = r10
            r2 = r11
            r0.init(r1, r2)
        L1c6:
            r0 = r9
            int r0 = r0.numInstructionsToProcess
            if (r0 <= 0) goto L61b
            r0 = r9
            int[] r0 = r0.instructionsToProcess
            r1 = r9
            r2 = r1
            int r2 = r2.numInstructionsToProcess
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.numInstructionsToProcess = r3
            r0 = r0[r1]
            r16 = r0
            r0 = r9
            org.objectweb.asm.tree.analysis.Frame<V extends org.objectweb.asm.tree.analysis.Value>[] r0 = r0.frames
            r1 = r16
            r0 = r0[r1]
            r17 = r0
            r0 = r9
            org.objectweb.asm.tree.analysis.Subroutine[] r0 = r0.subroutines
            r1 = r16
            r0 = r0[r1]
            r18 = r0
            r0 = r9
            boolean[] r0 = r0.inInstructionsToProcess
            r1 = r16
            r2 = 0
            r0[r1] = r2
            r0 = 0
            r19 = r0
            r0 = r11
            org.objectweb.asm.tree.InsnList r0 = r0.instructions     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r16
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.get(r1)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r19 = r0
            r0 = r19
            int r0 = r0.getOpcode()     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r20 = r0
            r0 = r19
            int r0 = r0.getType()     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r21 = r0
            r0 = r21
            r1 = 8
            if (r0 == r1) goto L22a
            r0 = r21
            r1 = 15
            if (r0 == r1) goto L22a
            r0 = r21
            r1 = 14
            if (r0 != r1) goto L243
        L22a:
            r0 = r9
            r1 = r16
            r2 = 1
            int r1 = r1 + r2
            r2 = r17
            r3 = r18
            r0.merge(r1, r2, r3)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r9
            r1 = r16
            r2 = r16
            r3 = 1
            int r2 = r2 + r3
            r0.newControlFlowEdge(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            goto L526
        L243:
            r0 = r15
            r1 = r17
            org.objectweb.asm.tree.analysis.Frame r0 = r0.init(r1)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r19
            r2 = r9
            org.objectweb.asm.tree.analysis.Interpreter<V extends org.objectweb.asm.tree.analysis.Value> r2 = r2.interpreter     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0.execute(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r18
            if (r0 != 0) goto L25c
            r0 = 0
            goto L265
        L25c:
            org.objectweb.asm.tree.analysis.Subroutine r0 = new org.objectweb.asm.tree.analysis.Subroutine     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r0
            r2 = r18
            r1.<init>(r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
        L265:
            r18 = r0
            r0 = r19
            boolean r0 = r0 instanceof org.objectweb.asm.tree.JumpInsnNode     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            if (r0 == 0) goto L2f8
            r0 = r19
            org.objectweb.asm.tree.JumpInsnNode r0 = (org.objectweb.asm.tree.JumpInsnNode) r0     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r22 = r0
            r0 = r20
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 == r1) goto L2a4
            r0 = r20
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 == r1) goto L2a4
            r0 = r15
            r1 = r20
            r2 = 0
            r0.initJumpTarget(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r9
            r1 = r16
            r2 = 1
            int r1 = r1 + r2
            r2 = r15
            r3 = r18
            r0.merge(r1, r2, r3)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r9
            r1 = r16
            r2 = r16
            r3 = 1
            int r2 = r2 + r3
            r0.newControlFlowEdge(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
        L2a4:
            r0 = r9
            org.objectweb.asm.tree.InsnList r0 = r0.insnList     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r22
            org.objectweb.asm.tree.LabelNode r1 = r1.label     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            int r0 = r0.indexOf(r1)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r23 = r0
            r0 = r15
            r1 = r20
            r2 = r22
            org.objectweb.asm.tree.LabelNode r2 = r2.label     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0.initJumpTarget(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r20
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 != r1) goto L2e3
            r0 = r9
            r1 = r23
            r2 = r15
            org.objectweb.asm.tree.analysis.Subroutine r3 = new org.objectweb.asm.tree.analysis.Subroutine     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r4 = r3
            r5 = r22
            org.objectweb.asm.tree.LabelNode r5 = r5.label     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r6 = r11
            int r6 = r6.maxLocals     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r7 = r22
            r4.<init>(r5, r6, r7)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0.merge(r1, r2, r3)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            goto L2ed
        L2e3:
            r0 = r9
            r1 = r23
            r2 = r15
            r3 = r18
            r0.merge(r1, r2, r3)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
        L2ed:
            r0 = r9
            r1 = r16
            r2 = r23
            r0.newControlFlowEdge(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            goto L526
        L2f8:
            r0 = r19
            boolean r0 = r0 instanceof org.objectweb.asm.tree.LookupSwitchInsnNode     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            if (r0 == 0) goto L385
            r0 = r19
            org.objectweb.asm.tree.LookupSwitchInsnNode r0 = (org.objectweb.asm.tree.LookupSwitchInsnNode) r0     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r22 = r0
            r0 = r9
            org.objectweb.asm.tree.InsnList r0 = r0.insnList     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r22
            org.objectweb.asm.tree.LabelNode r1 = r1.dflt     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            int r0 = r0.indexOf(r1)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r23 = r0
            r0 = r15
            r1 = r20
            r2 = r22
            org.objectweb.asm.tree.LabelNode r2 = r2.dflt     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0.initJumpTarget(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r9
            r1 = r23
            r2 = r15
            r3 = r18
            r0.merge(r1, r2, r3)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r9
            r1 = r16
            r2 = r23
            r0.newControlFlowEdge(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = 0
            r24 = r0
        L336:
            r0 = r24
            r1 = r22
            java.util.List<org.objectweb.asm.tree.LabelNode> r1 = r1.labels     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            int r1 = r1.size()     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            if (r0 >= r1) goto L382
            r0 = r22
            java.util.List<org.objectweb.asm.tree.LabelNode> r0 = r0.labels     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r24
            java.lang.Object r0 = r0.get(r1)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            org.objectweb.asm.tree.LabelNode r0 = (org.objectweb.asm.tree.LabelNode) r0     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r25 = r0
            r0 = r9
            org.objectweb.asm.tree.InsnList r0 = r0.insnList     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r25
            int r0 = r0.indexOf(r1)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r23 = r0
            r0 = r15
            r1 = r20
            r2 = r25
            r0.initJumpTarget(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r9
            r1 = r23
            r2 = r15
            r3 = r18
            r0.merge(r1, r2, r3)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r9
            r1 = r16
            r2 = r23
            r0.newControlFlowEdge(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            int r24 = r24 + 1
            goto L336
        L382:
            goto L526
        L385:
            r0 = r19
            boolean r0 = r0 instanceof org.objectweb.asm.tree.TableSwitchInsnNode     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            if (r0 == 0) goto L412
            r0 = r19
            org.objectweb.asm.tree.TableSwitchInsnNode r0 = (org.objectweb.asm.tree.TableSwitchInsnNode) r0     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r22 = r0
            r0 = r9
            org.objectweb.asm.tree.InsnList r0 = r0.insnList     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r22
            org.objectweb.asm.tree.LabelNode r1 = r1.dflt     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            int r0 = r0.indexOf(r1)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r23 = r0
            r0 = r15
            r1 = r20
            r2 = r22
            org.objectweb.asm.tree.LabelNode r2 = r2.dflt     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0.initJumpTarget(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r9
            r1 = r23
            r2 = r15
            r3 = r18
            r0.merge(r1, r2, r3)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r9
            r1 = r16
            r2 = r23
            r0.newControlFlowEdge(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = 0
            r24 = r0
        L3c3:
            r0 = r24
            r1 = r22
            java.util.List<org.objectweb.asm.tree.LabelNode> r1 = r1.labels     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            int r1 = r1.size()     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            if (r0 >= r1) goto L40f
            r0 = r22
            java.util.List<org.objectweb.asm.tree.LabelNode> r0 = r0.labels     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r24
            java.lang.Object r0 = r0.get(r1)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            org.objectweb.asm.tree.LabelNode r0 = (org.objectweb.asm.tree.LabelNode) r0     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r25 = r0
            r0 = r15
            r1 = r20
            r2 = r25
            r0.initJumpTarget(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r9
            org.objectweb.asm.tree.InsnList r0 = r0.insnList     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r25
            int r0 = r0.indexOf(r1)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r23 = r0
            r0 = r9
            r1 = r23
            r2 = r15
            r3 = r18
            r0.merge(r1, r2, r3)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r9
            r1 = r16
            r2 = r23
            r0.newControlFlowEdge(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            int r24 = r24 + 1
            goto L3c3
        L40f:
            goto L526
        L412:
            r0 = r20
            r1 = 169(0xa9, float:2.37E-43)
            if (r0 != r1) goto L493
            r0 = r18
            if (r0 != 0) goto L42b
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r0
            r2 = r19
            java.lang.String r3 = "RET instruction outside of a subroutine"
            r1.<init>(r2, r3)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            throw r0     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
        L42b:
            r0 = 0
            r22 = r0
        L42e:
            r0 = r22
            r1 = r18
            java.util.List<org.objectweb.asm.tree.JumpInsnNode> r1 = r1.callers     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            int r1 = r1.size()     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            if (r0 >= r1) goto L490
            r0 = r18
            java.util.List<org.objectweb.asm.tree.JumpInsnNode> r0 = r0.callers     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r22
            java.lang.Object r0 = r0.get(r1)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            org.objectweb.asm.tree.JumpInsnNode r0 = (org.objectweb.asm.tree.JumpInsnNode) r0     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r23 = r0
            r0 = r9
            org.objectweb.asm.tree.InsnList r0 = r0.insnList     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r23
            int r0 = r0.indexOf(r1)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r24 = r0
            r0 = r9
            org.objectweb.asm.tree.analysis.Frame<V extends org.objectweb.asm.tree.analysis.Value>[] r0 = r0.frames     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r24
            r0 = r0[r1]     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            if (r0 == 0) goto L48a
            r0 = r9
            r1 = r24
            r2 = 1
            int r1 = r1 + r2
            r2 = r9
            org.objectweb.asm.tree.analysis.Frame<V extends org.objectweb.asm.tree.analysis.Value>[] r2 = r2.frames     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r3 = r24
            r2 = r2[r3]     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r3 = r15
            r4 = r9
            org.objectweb.asm.tree.analysis.Subroutine[] r4 = r4.subroutines     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r5 = r24
            r4 = r4[r5]     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r5 = r18
            boolean[] r5 = r5.localsUsed     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0.merge(r1, r2, r3, r4, r5)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r9
            r1 = r16
            r2 = r24
            r3 = 1
            int r2 = r2 + r3
            r0.newControlFlowEdge(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
        L48a:
            int r22 = r22 + 1
            goto L42e
        L490:
            goto L526
        L493:
            r0 = r20
            r1 = 191(0xbf, float:2.68E-43)
            if (r0 == r1) goto L526
            r0 = r20
            r1 = 172(0xac, float:2.41E-43)
            if (r0 < r1) goto L4ab
            r0 = r20
            r1 = 177(0xb1, float:2.48E-43)
            if (r0 <= r1) goto L526
        L4ab:
            r0 = r18
            if (r0 == 0) goto L510
            r0 = r19
            boolean r0 = r0 instanceof org.objectweb.asm.tree.VarInsnNode     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            if (r0 == 0) goto L4f5
            r0 = r19
            org.objectweb.asm.tree.VarInsnNode r0 = (org.objectweb.asm.tree.VarInsnNode) r0     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            int r0 = r0.var     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r22 = r0
            r0 = r18
            boolean[] r0 = r0.localsUsed     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r22
            r2 = 1
            r0[r1] = r2     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r20
            r1 = 22
            if (r0 == r1) goto L4e7
            r0 = r20
            r1 = 24
            if (r0 == r1) goto L4e7
            r0 = r20
            r1 = 55
            if (r0 == r1) goto L4e7
            r0 = r20
            r1 = 57
            if (r0 != r1) goto L4f2
        L4e7:
            r0 = r18
            boolean[] r0 = r0.localsUsed     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r22
            r2 = 1
            int r1 = r1 + r2
            r2 = 1
            r0[r1] = r2     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
        L4f2:
            goto L510
        L4f5:
            r0 = r19
            boolean r0 = r0 instanceof org.objectweb.asm.tree.IincInsnNode     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            if (r0 == 0) goto L510
            r0 = r19
            org.objectweb.asm.tree.IincInsnNode r0 = (org.objectweb.asm.tree.IincInsnNode) r0     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            int r0 = r0.var     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r22 = r0
            r0 = r18
            boolean[] r0 = r0.localsUsed     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r22
            r2 = 1
            r0[r1] = r2     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
        L510:
            r0 = r9
            r1 = r16
            r2 = 1
            int r1 = r1 + r2
            r2 = r15
            r3 = r18
            r0.merge(r1, r2, r3)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r9
            r1 = r16
            r2 = r16
            r3 = 1
            int r2 = r2 + r3
            r0.newControlFlowEdge(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
        L526:
            r0 = r9
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode>[] r0 = r0.handlers     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r1 = r16
            r0 = r0[r1]     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r22 = r0
            r0 = r22
            if (r0 == 0) goto L5b0
            r0 = r22
            java.util.Iterator r0 = r0.iterator()     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r23 = r0
        L53d:
            r0 = r23
            boolean r0 = r0.hasNext()     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            if (r0 == 0) goto L5b0
            r0 = r23
            java.lang.Object r0 = r0.next()     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            org.objectweb.asm.tree.TryCatchBlockNode r0 = (org.objectweb.asm.tree.TryCatchBlockNode) r0     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r24 = r0
            r0 = r24
            java.lang.String r0 = r0.type     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            if (r0 != 0) goto L565
            java.lang.String r0 = "java/lang/Throwable"
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r25 = r0
            goto L56f
        L565:
            r0 = r24
            java.lang.String r0 = r0.type     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r25 = r0
        L56f:
            r0 = r9
            r1 = r16
            r2 = r24
            boolean r0 = r0.newControlFlowExceptionEdge(r1, r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            if (r0 == 0) goto L5ad
            r0 = r9
            r1 = r17
            org.objectweb.asm.tree.analysis.Frame r0 = r0.newFrame(r1)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r26 = r0
            r0 = r26
            r0.clearStack()     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r26
            r1 = r9
            org.objectweb.asm.tree.analysis.Interpreter<V extends org.objectweb.asm.tree.analysis.Value> r1 = r1.interpreter     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r2 = r24
            r3 = r26
            r4 = r25
            org.objectweb.asm.tree.analysis.Value r1 = r1.newExceptionValue(r2, r3, r4)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0.push(r1)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r0 = r9
            r1 = r9
            org.objectweb.asm.tree.InsnList r1 = r1.insnList     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r2 = r24
            org.objectweb.asm.tree.LabelNode r2 = r2.handler     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            int r1 = r1.indexOf(r2)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
            r2 = r26
            r3 = r18
            r0.merge(r1, r2, r3)     // Catch: org.objectweb.asm.tree.analysis.AnalyzerException -> L5b3 java.lang.RuntimeException -> L5e7
        L5ad:
            goto L53d
        L5b0:
            goto L618
        L5b3:
            r20 = move-exception
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r20
            org.objectweb.asm.tree.AbstractInsnNode r2 = r2.node
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            java.lang.String r4 = "Error at instruction "
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r16
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r20
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = r20
            r1.<init>(r2, r3, r4)
            throw r0
        L5e7:
            r20 = move-exception
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            java.lang.String r4 = "Error at instruction "
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r16
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r20
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = r20
            r1.<init>(r2, r3, r4)
            throw r0
        L618:
            goto L1c6
        L61b:
            r0 = r9
            org.objectweb.asm.tree.analysis.Frame<V extends org.objectweb.asm.tree.analysis.Value>[] r0 = r0.frames
            return r0
    }

    public org.objectweb.asm.tree.analysis.Frame<V>[] analyzeAndComputeMaxs(java.lang.String r5, org.objectweb.asm.tree.MethodNode r6) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r4 = this;
            r0 = r6
            r1 = r6
            int r1 = computeMaxLocals(r1)
            r0.maxLocals = r1
            r0 = r6
            r1 = -1
            r0.maxStack = r1
            r0 = r4
            r1 = r5
            r2 = r6
            org.objectweb.asm.tree.analysis.Frame[] r0 = r0.analyze(r1, r2)
            r0 = r6
            r1 = r4
            org.objectweb.asm.tree.analysis.Frame<V extends org.objectweb.asm.tree.analysis.Value>[] r1 = r1.frames
            int r1 = computeMaxStack(r1)
            r0.maxStack = r1
            r0 = r4
            org.objectweb.asm.tree.analysis.Frame<V extends org.objectweb.asm.tree.analysis.Value>[] r0 = r0.frames
            return r0
    }

    private static int computeMaxLocals(org.objectweb.asm.tree.MethodNode r4) {
            r0 = r4
            java.lang.String r0 = r0.desc
            int r0 = org.objectweb.asm.Type.getArgumentsAndReturnSizes(r0)
            r1 = 2
            int r0 = r0 >> r1
            r5 = r0
            r0 = r4
            org.objectweb.asm.tree.InsnList r0 = r0.instructions
            java.util.ListIterator r0 = r0.iterator()
            r6 = r0
        L12:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L89
            r0 = r6
            java.lang.Object r0 = r0.next()
            org.objectweb.asm.tree.AbstractInsnNode r0 = (org.objectweb.asm.tree.AbstractInsnNode) r0
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof org.objectweb.asm.tree.VarInsnNode
            if (r0 == 0) goto L6d
            r0 = r7
            org.objectweb.asm.tree.VarInsnNode r0 = (org.objectweb.asm.tree.VarInsnNode) r0
            int r0 = r0.var
            r8 = r0
            r0 = r7
            int r0 = r0.getOpcode()
            r1 = 22
            if (r0 == r1) goto L59
            r0 = r7
            int r0 = r0.getOpcode()
            r1 = 24
            if (r0 == r1) goto L59
            r0 = r7
            int r0 = r0.getOpcode()
            r1 = 55
            if (r0 == r1) goto L59
            r0 = r7
            int r0 = r0.getOpcode()
            r1 = 57
            if (r0 != r1) goto L5d
        L59:
            r0 = 2
            goto L5e
        L5d:
            r0 = 1
        L5e:
            r9 = r0
            r0 = r5
            r1 = r8
            r2 = r9
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r5 = r0
            goto L86
        L6d:
            r0 = r7
            boolean r0 = r0 instanceof org.objectweb.asm.tree.IincInsnNode
            if (r0 == 0) goto L86
            r0 = r7
            org.objectweb.asm.tree.IincInsnNode r0 = (org.objectweb.asm.tree.IincInsnNode) r0
            int r0 = r0.var
            r8 = r0
            r0 = r5
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r5 = r0
        L86:
            goto L12
        L89:
            r0 = r5
            return r0
    }

    private static int computeMaxStack(org.objectweb.asm.tree.analysis.Frame<?>[] r4) {
            r0 = 0
            r5 = r0
            r0 = r4
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        La:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L4f
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L49
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
        L21:
            r0 = r11
            r1 = r9
            int r1 = r1.getStackSize()
            if (r0 >= r1) goto L42
            r0 = r10
            r1 = r9
            r2 = r11
            org.objectweb.asm.tree.analysis.Value r1 = r1.getStack(r2)
            int r1 = r1.getSize()
            int r0 = r0 + r1
            r10 = r0
            int r11 = r11 + 1
            goto L21
        L42:
            r0 = r5
            r1 = r10
            int r0 = java.lang.Math.max(r0, r1)
            r5 = r0
        L49:
            int r8 = r8 + 1
            goto La
        L4f:
            r0 = r5
            return r0
    }

    private void findSubroutine(int r7, org.objectweb.asm.tree.analysis.Subroutine r8, java.util.List<org.objectweb.asm.tree.AbstractInsnNode> r9) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            r1 = r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
        L13:
            r0 = r10
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L23b
            r0 = r10
            r1 = r10
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.remove(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r11 = r0
            r0 = r11
            if (r0 < 0) goto L3d
            r0 = r11
            r1 = r6
            int r1 = r1.insnListSize
            if (r0 < r1) goto L49
        L3d:
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = 0
            java.lang.String r3 = "Execution can fall off the end of the code"
            r1.<init>(r2, r3)
            throw r0
        L49:
            r0 = r6
            org.objectweb.asm.tree.analysis.Subroutine[] r0 = r0.subroutines
            r1 = r11
            r0 = r0[r1]
            if (r0 == 0) goto L56
            goto L13
        L56:
            r0 = r6
            org.objectweb.asm.tree.analysis.Subroutine[] r0 = r0.subroutines
            r1 = r11
            org.objectweb.asm.tree.analysis.Subroutine r2 = new org.objectweb.asm.tree.analysis.Subroutine
            r3 = r2
            r4 = r8
            r3.<init>(r4)
            r0[r1] = r2
            r0 = r6
            org.objectweb.asm.tree.InsnList r0 = r0.insnList
            r1 = r11
            org.objectweb.asm.tree.AbstractInsnNode r0 = r0.get(r1)
            r12 = r0
            r0 = r12
            boolean r0 = r0 instanceof org.objectweb.asm.tree.JumpInsnNode
            if (r0 == 0) goto Lae
            r0 = r12
            int r0 = r0.getOpcode()
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 != r1) goto L8f
            r0 = r9
            r1 = r12
            boolean r0 = r0.add(r1)
            goto L16b
        L8f:
            r0 = r12
            org.objectweb.asm.tree.JumpInsnNode r0 = (org.objectweb.asm.tree.JumpInsnNode) r0
            r13 = r0
            r0 = r10
            r1 = r6
            org.objectweb.asm.tree.InsnList r1 = r1.insnList
            r2 = r13
            org.objectweb.asm.tree.LabelNode r2 = r2.label
            int r1 = r1.indexOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
            goto L16b
        Lae:
            r0 = r12
            boolean r0 = r0 instanceof org.objectweb.asm.tree.TableSwitchInsnNode
            if (r0 == 0) goto L10e
            r0 = r12
            org.objectweb.asm.tree.TableSwitchInsnNode r0 = (org.objectweb.asm.tree.TableSwitchInsnNode) r0
            r13 = r0
            r0 = r6
            r1 = r6
            org.objectweb.asm.tree.InsnList r1 = r1.insnList
            r2 = r13
            org.objectweb.asm.tree.LabelNode r2 = r2.dflt
            int r1 = r1.indexOf(r2)
            r2 = r8
            r3 = r9
            r0.findSubroutine(r1, r2, r3)
            r0 = r13
            java.util.List<org.objectweb.asm.tree.LabelNode> r0 = r0.labels
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r14 = r0
        Ldd:
            r0 = r14
            if (r0 < 0) goto L10b
            r0 = r13
            java.util.List<org.objectweb.asm.tree.LabelNode> r0 = r0.labels
            r1 = r14
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.LabelNode r0 = (org.objectweb.asm.tree.LabelNode) r0
            r15 = r0
            r0 = r10
            r1 = r6
            org.objectweb.asm.tree.InsnList r1 = r1.insnList
            r2 = r15
            int r1 = r1.indexOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
            int r14 = r14 + (-1)
            goto Ldd
        L10b:
            goto L16b
        L10e:
            r0 = r12
            boolean r0 = r0 instanceof org.objectweb.asm.tree.LookupSwitchInsnNode
            if (r0 == 0) goto L16b
            r0 = r12
            org.objectweb.asm.tree.LookupSwitchInsnNode r0 = (org.objectweb.asm.tree.LookupSwitchInsnNode) r0
            r13 = r0
            r0 = r6
            r1 = r6
            org.objectweb.asm.tree.InsnList r1 = r1.insnList
            r2 = r13
            org.objectweb.asm.tree.LabelNode r2 = r2.dflt
            int r1 = r1.indexOf(r2)
            r2 = r8
            r3 = r9
            r0.findSubroutine(r1, r2, r3)
            r0 = r13
            java.util.List<org.objectweb.asm.tree.LabelNode> r0 = r0.labels
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r14 = r0
        L13d:
            r0 = r14
            if (r0 < 0) goto L16b
            r0 = r13
            java.util.List<org.objectweb.asm.tree.LabelNode> r0 = r0.labels
            r1 = r14
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.LabelNode r0 = (org.objectweb.asm.tree.LabelNode) r0
            r15 = r0
            r0 = r10
            r1 = r6
            org.objectweb.asm.tree.InsnList r1 = r1.insnList
            r2 = r15
            int r1 = r1.indexOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
            int r14 = r14 + (-1)
            goto L13d
        L16b:
            r0 = r6
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode>[] r0 = r0.handlers
            r1 = r11
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L1b0
            r0 = r13
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
        L182:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L1b0
            r0 = r14
            java.lang.Object r0 = r0.next()
            org.objectweb.asm.tree.TryCatchBlockNode r0 = (org.objectweb.asm.tree.TryCatchBlockNode) r0
            r15 = r0
            r0 = r10
            r1 = r6
            org.objectweb.asm.tree.InsnList r1 = r1.insnList
            r2 = r15
            org.objectweb.asm.tree.LabelNode r2 = r2.handler
            int r1 = r1.indexOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
            goto L182
        L1b0:
            r0 = r12
            int r0 = r0.getOpcode()
            switch(r0) {
                case 167: goto L228;
                case 168: goto L22b;
                case 169: goto L228;
                case 170: goto L228;
                case 171: goto L228;
                case 172: goto L228;
                case 173: goto L228;
                case 174: goto L228;
                case 175: goto L228;
                case 176: goto L228;
                case 177: goto L228;
                case 178: goto L22b;
                case 179: goto L22b;
                case 180: goto L22b;
                case 181: goto L22b;
                case 182: goto L22b;
                case 183: goto L22b;
                case 184: goto L22b;
                case 185: goto L22b;
                case 186: goto L22b;
                case 187: goto L22b;
                case 188: goto L22b;
                case 189: goto L22b;
                case 190: goto L22b;
                case 191: goto L228;
                default: goto L22b;
            }
        L228:
            goto L238
        L22b:
            r0 = r10
            r1 = r11
            r2 = 1
            int r1 = r1 + r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
        L238:
            goto L13
        L23b:
            return
    }

    private org.objectweb.asm.tree.analysis.Frame<V> computeInitialFrame(java.lang.String r8, org.objectweb.asm.tree.MethodNode r9) {
            r7 = this;
            r0 = r7
            r1 = r9
            int r1 = r1.maxLocals
            r2 = r9
            int r2 = r2.maxStack
            org.objectweb.asm.tree.analysis.Frame r0 = r0.newFrame(r1, r2)
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r9
            int r0 = r0.access
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L42
            r0 = r8
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            r13 = r0
            r0 = r10
            r1 = r11
            r2 = r7
            org.objectweb.asm.tree.analysis.Interpreter<V extends org.objectweb.asm.tree.analysis.Value> r2 = r2.interpreter
            r3 = r12
            r4 = r11
            r5 = r13
            org.objectweb.asm.tree.analysis.Value r2 = r2.newParameterValue(r3, r4, r5)
            r0.setLocal(r1, r2)
            int r11 = r11 + 1
        L42:
            r0 = r9
            java.lang.String r0 = r0.desc
            org.objectweb.asm.Type[] r0 = org.objectweb.asm.Type.getArgumentTypes(r0)
            r13 = r0
            r0 = r13
            r14 = r0
            r0 = r14
            int r0 = r0.length
            r15 = r0
            r0 = 0
            r16 = r0
        L57:
            r0 = r16
            r1 = r15
            if (r0 >= r1) goto L9c
            r0 = r14
            r1 = r16
            r0 = r0[r1]
            r17 = r0
            r0 = r10
            r1 = r11
            r2 = r7
            org.objectweb.asm.tree.analysis.Interpreter<V extends org.objectweb.asm.tree.analysis.Value> r2 = r2.interpreter
            r3 = r12
            r4 = r11
            r5 = r17
            org.objectweb.asm.tree.analysis.Value r2 = r2.newParameterValue(r3, r4, r5)
            r0.setLocal(r1, r2)
            int r11 = r11 + 1
            r0 = r17
            int r0 = r0.getSize()
            r1 = 2
            if (r0 != r1) goto L96
            r0 = r10
            r1 = r11
            r2 = r7
            org.objectweb.asm.tree.analysis.Interpreter<V extends org.objectweb.asm.tree.analysis.Value> r2 = r2.interpreter
            r3 = r11
            org.objectweb.asm.tree.analysis.Value r2 = r2.newEmptyValue(r3)
            r0.setLocal(r1, r2)
            int r11 = r11 + 1
        L96:
            int r16 = r16 + 1
            goto L57
        L9c:
            r0 = r11
            r1 = r9
            int r1 = r1.maxLocals
            if (r0 >= r1) goto Lba
            r0 = r10
            r1 = r11
            r2 = r7
            org.objectweb.asm.tree.analysis.Interpreter<V extends org.objectweb.asm.tree.analysis.Value> r2 = r2.interpreter
            r3 = r11
            org.objectweb.asm.tree.analysis.Value r2 = r2.newEmptyValue(r3)
            r0.setLocal(r1, r2)
            int r11 = r11 + 1
            goto L9c
        Lba:
            r0 = r10
            r1 = r7
            org.objectweb.asm.tree.analysis.Interpreter<V extends org.objectweb.asm.tree.analysis.Value> r1 = r1.interpreter
            r2 = r9
            java.lang.String r2 = r2.desc
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.getReturnType(r2)
            org.objectweb.asm.tree.analysis.Value r1 = r1.newReturnTypeValue(r2)
            r0.setReturn(r1)
            r0 = r10
            return r0
    }

    public org.objectweb.asm.tree.analysis.Frame<V>[] getFrames() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.tree.analysis.Frame<V extends org.objectweb.asm.tree.analysis.Value>[] r0 = r0.frames
            return r0
    }

    public java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> getHandlers(int r4) {
            r3 = this;
            r0 = r3
            java.util.List<org.objectweb.asm.tree.TryCatchBlockNode>[] r0 = r0.handlers
            r1 = r4
            r0 = r0[r1]
            return r0
    }

    protected void init(java.lang.String r2, org.objectweb.asm.tree.MethodNode r3) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r1 = this;
            return
    }

    protected org.objectweb.asm.tree.analysis.Frame<V> newFrame(int r6, int r7) {
            r5 = this;
            org.objectweb.asm.tree.analysis.Frame r0 = new org.objectweb.asm.tree.analysis.Frame
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    protected org.objectweb.asm.tree.analysis.Frame<V> newFrame(org.objectweb.asm.tree.analysis.Frame<? extends V> r5) {
            r4 = this;
            org.objectweb.asm.tree.analysis.Frame r0 = new org.objectweb.asm.tree.analysis.Frame
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
    }

    protected void newControlFlowEdge(int r2, int r3) {
            r1 = this;
            return
    }

    protected boolean newControlFlowExceptionEdge(int r3, int r4) {
            r2 = this;
            r0 = 1
            return r0
    }

    protected boolean newControlFlowExceptionEdge(int r6, org.objectweb.asm.tree.TryCatchBlockNode r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            org.objectweb.asm.tree.InsnList r2 = r2.insnList
            r3 = r7
            org.objectweb.asm.tree.LabelNode r3 = r3.handler
            int r2 = r2.indexOf(r3)
            boolean r0 = r0.newControlFlowExceptionEdge(r1, r2)
            return r0
    }

    private void merge(int r7, org.objectweb.asm.tree.analysis.Frame<V> r8, org.objectweb.asm.tree.analysis.Subroutine r9) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r6 = this;
            r0 = r6
            org.objectweb.asm.tree.analysis.Frame<V extends org.objectweb.asm.tree.analysis.Value>[] r0 = r0.frames
            r1 = r7
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L1e
            r0 = r6
            org.objectweb.asm.tree.analysis.Frame<V extends org.objectweb.asm.tree.analysis.Value>[] r0 = r0.frames
            r1 = r7
            r2 = r6
            r3 = r8
            org.objectweb.asm.tree.analysis.Frame r2 = r2.newFrame(r3)
            r0[r1] = r2
            r0 = 1
            r10 = r0
            goto L2a
        L1e:
            r0 = r11
            r1 = r8
            r2 = r6
            org.objectweb.asm.tree.analysis.Interpreter<V extends org.objectweb.asm.tree.analysis.Value> r2 = r2.interpreter
            boolean r0 = r0.merge(r1, r2)
            r10 = r0
        L2a:
            r0 = r6
            org.objectweb.asm.tree.analysis.Subroutine[] r0 = r0.subroutines
            r1 = r7
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L4f
            r0 = r9
            if (r0 == 0) goto L5e
            r0 = r6
            org.objectweb.asm.tree.analysis.Subroutine[] r0 = r0.subroutines
            r1 = r7
            org.objectweb.asm.tree.analysis.Subroutine r2 = new org.objectweb.asm.tree.analysis.Subroutine
            r3 = r2
            r4 = r9
            r3.<init>(r4)
            r0[r1] = r2
            r0 = 1
            r10 = r0
            goto L5e
        L4f:
            r0 = r9
            if (r0 == 0) goto L5e
            r0 = r10
            r1 = r12
            r2 = r9
            boolean r1 = r1.merge(r2)
            r0 = r0 | r1
            r10 = r0
        L5e:
            r0 = r10
            if (r0 == 0) goto L84
            r0 = r6
            boolean[] r0 = r0.inInstructionsToProcess
            r1 = r7
            r0 = r0[r1]
            if (r0 != 0) goto L84
            r0 = r6
            boolean[] r0 = r0.inInstructionsToProcess
            r1 = r7
            r2 = 1
            r0[r1] = r2
            r0 = r6
            int[] r0 = r0.instructionsToProcess
            r1 = r6
            r2 = r1
            int r2 = r2.numInstructionsToProcess
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.numInstructionsToProcess = r3
            r2 = r7
            r0[r1] = r2
        L84:
            return
    }

    private void merge(int r7, org.objectweb.asm.tree.analysis.Frame<V> r8, org.objectweb.asm.tree.analysis.Frame<V> r9, org.objectweb.asm.tree.analysis.Subroutine r10, boolean[] r11) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r6 = this;
            r0 = r9
            r1 = r8
            r2 = r11
            boolean r0 = r0.merge(r1, r2)
            r0 = r6
            org.objectweb.asm.tree.analysis.Frame<V extends org.objectweb.asm.tree.analysis.Value>[] r0 = r0.frames
            r1 = r7
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L26
            r0 = r6
            org.objectweb.asm.tree.analysis.Frame<V extends org.objectweb.asm.tree.analysis.Value>[] r0 = r0.frames
            r1 = r7
            r2 = r6
            r3 = r9
            org.objectweb.asm.tree.analysis.Frame r2 = r2.newFrame(r3)
            r0[r1] = r2
            r0 = 1
            r12 = r0
            goto L32
        L26:
            r0 = r13
            r1 = r9
            r2 = r6
            org.objectweb.asm.tree.analysis.Interpreter<V extends org.objectweb.asm.tree.analysis.Value> r2 = r2.interpreter
            boolean r0 = r0.merge(r1, r2)
            r12 = r0
        L32:
            r0 = r6
            org.objectweb.asm.tree.analysis.Subroutine[] r0 = r0.subroutines
            r1 = r7
            r0 = r0[r1]
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L50
            r0 = r10
            if (r0 == 0) goto L50
            r0 = r12
            r1 = r14
            r2 = r10
            boolean r1 = r1.merge(r2)
            r0 = r0 | r1
            r12 = r0
        L50:
            r0 = r12
            if (r0 == 0) goto L76
            r0 = r6
            boolean[] r0 = r0.inInstructionsToProcess
            r1 = r7
            r0 = r0[r1]
            if (r0 != 0) goto L76
            r0 = r6
            boolean[] r0 = r0.inInstructionsToProcess
            r1 = r7
            r2 = 1
            r0[r1] = r2
            r0 = r6
            int[] r0 = r0.instructionsToProcess
            r1 = r6
            r2 = r1
            int r2 = r2.numInstructionsToProcess
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.numInstructionsToProcess = r3
            r2 = r7
            r0[r1] = r2
        L76:
            return
    }
}
